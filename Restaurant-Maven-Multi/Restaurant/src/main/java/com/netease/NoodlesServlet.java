package com.netease;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.Kitchen;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoodlesServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	Logger log = LoggerFactory.getLogger(NoodlesServlet.class);
    	 
        log.info("------- Initializing ----------------------");
	// get writer    	
    	PrintWriter writer = response.getWriter();

        String vegetable = request.getParameter("vegetable");
        log.info("------->>> vegetable = "+ vegetable);
        String noodles = Kitchen.makeNoodles(vegetable);
        writer.println(noodles);
        log.info("------- Finished ----------------------");
    }
}
