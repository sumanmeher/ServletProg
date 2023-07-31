package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Multiplication")
public class Multiplication extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int mul_res = num1 * num2;
		int add_res=(int)req.getAttribute("res_add");
		
		PrintWriter writer=resp.getWriter();
		writer.println("Addition result is: "+add_res);
		writer.println("Multiplication result is: "+mul_res);

	}
}
