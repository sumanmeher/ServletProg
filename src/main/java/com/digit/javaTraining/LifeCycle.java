package com.digit.javaTraining;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LifeCycle")
public class LifeCycle extends HttpServlet {
	@Override
	public void init() throws ServletException {
		System.out.println("Inside the Init method");
	}
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Inside the Sevice method");
		System.out.println("Inside the Sevice method");
	}
	@Override
	public void destroy() {
		System.out.println("Inside the Destroy method");
	}
}
