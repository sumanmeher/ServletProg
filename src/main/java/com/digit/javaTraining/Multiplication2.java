package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Mul2")
public class Multiplication2 extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session=req.getSession();
		int num1=(int) session.getAttribute("num1");
		int num2=(int) session.getAttribute("num2");
		int sum=(int) session.getAttribute("sum");
		
		int prod=num1*num2;
		
		//Cookies
		//Step 1: Converting int to Integer
		Integer i1=new Integer(num1);
		Integer i2=new Integer(num2);
		Integer i3=new Integer(sum);
		Integer i4=new Integer(prod);
		
		//Step2: Converting Integer to String
		String s1=i1.toString();
		String s2=i2.toString();
		String s3=i3.toString();
		String s4=i4.toString();
		
		//Step3: Creating the Cookies
		Cookie c1=new Cookie("num1",s1);
		Cookie c2=new Cookie("num2",s2);
		Cookie c3=new Cookie("sum",s3);
		Cookie c4=new Cookie("prod",s4);
		
		//Step4: Add the Cookies
		resp.addCookie(c4);
		resp.addCookie(c3);
		resp.addCookie(c2);
		resp.addCookie(c1);
		
		
		PrintWriter writer = resp.getWriter();
		writer.println(sum);
		writer.println(prod);
	}
}
