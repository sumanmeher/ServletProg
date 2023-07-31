package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalaryHike2")
public class SalaryHike2 extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int num1=(int)req.getAttribute("hike_1");
		int hike1=(int)req.getAttribute("sal")+num1;
		int num2=(int) (hike1*0.06);
		int hike2=hike1+num2;
		
		PrintWriter writer = resp.getWriter();
		writer.print("Emp Id:");
		writer.println(req.getParameter("empid"));
		writer.print("Emp Name:");
		writer.println(req.getParameter("empname"));
		writer.print("Username:");
		writer.println(req.getParameter("username"));
		writer.print("Experience:");
		writer.println(req.getParameter("exp"));
		writer.println("Salary Hike by 26% is: "+hike1);
		writer.println("Salary Hike by 6% again is: "+hike2);
		}

}
