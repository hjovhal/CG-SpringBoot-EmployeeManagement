package com.cg.test.filter;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class MyFilter implements Filter {
	
	private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		logger.info("Inside MyFilter doFilter() {} ");
		
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		HttpServletResponse httpServletResponse = (HttpServletResponse)response;
		Enumeration<String> headerIt = httpServletRequest.getHeaderNames();
        while (headerIt.hasMoreElements()) {
            String name = (String) headerIt.nextElement();
            String value = httpServletRequest.getHeader(name);
            logger.info("Header name {}", name );
            logger.info("Header value {}" , value);
        }
        logger.info("IP address of Host {} ", httpServletRequest.getRemoteHost());
		logger.info("IP address of machine {} ", httpServletRequest.getRemoteAddr());
		chain.doFilter(httpServletRequest, httpServletResponse);
		logger.info("doFilter() method is ended");
		
	}

}






















