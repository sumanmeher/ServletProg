package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletOps2")
public class ServletOps2 extends HttpServlet{
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter Writer=resp.getWriter();
		Writer.println(req.getParameter("cname"));
		Writer.println(req.getParameter("id"));
		//Writer.println(req.getParameter("password"));
		//Writer.println(req.getParameter("salary"));
		Writer.println(req.getParameter("hike_percent"));
	}
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter Writer=resp.getWriter();
		Writer.println(req.getParameter("cname"));
		Writer.println(req.getParameter("id"));
		//Writer.println(req.getParameter("password"));
		//Writer.println(req.getParameter("salary"));
		Writer.println(req.getParameter("hike_percent"));
	}
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter Writer=resp.getWriter();
		Writer.println(req.getParameter("cname"));
		Writer.println(req.getParameter("id"));
		//Writer.println(req.getParameter("password"));
		//Writer.println(req.getParameter("salary"));
		Writer.println(req.getParameter("hike_percent"));
	}

}
