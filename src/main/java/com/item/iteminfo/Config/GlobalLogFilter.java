package com.item.iteminfo.Config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpRequest;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.*;

/**
 * @Author: liusy
 * @Date: 2022/12/29 14:11
 * @Description:
 */
@Slf4j
@Order(1)
@Configuration
@WebFilter(urlPatterns = "/*",filterName = "globalLogFilter")
public class GlobalLogFilter implements Filter {
    //排除路径（当前排除swagger相关接口）
    private static List<String> EXCLUDE= Arrays.asList("/doc.html","/bycdao-ui","/api-docs","/swagger");
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        log.info("==init global log filter==");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request=(HttpServletRequest)servletRequest;
        String path = request.getRequestURI().substring(request.getContextPath().length()).replaceAll("[/]+$", "");
        boolean flag=false;
        for (String ex : EXCLUDE) {
            if(path.contains(ex)){
                flag=true;
                break;
            }
        }
        if(!flag){
            //添加日志
            log.info("==["+path+"] 调用开始==");
            filterChain.doFilter(servletRequest,servletResponse);
            log.info("==["+path+"] 调用结束==");
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }
    }

    @Override
    public void destroy() {
        log.info("==global log filter begin to destroy==");
    }
}
