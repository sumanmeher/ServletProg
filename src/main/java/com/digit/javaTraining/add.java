package com.digit.javaTraining;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class add extends HttpServlet {


	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String number1 = request.getParameter("num1");
		String number2 = request.getParameter("num2");
		int num1=Integer.parseInt(number1);
		int num2=Integer.parseInt(number2);
		
		int sum=num1+num2;
		
		PrintWriter Writer = response.getWriter();
		Writer.println(sum);

	}

}

