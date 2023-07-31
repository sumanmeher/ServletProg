package com.digit.javaTraining;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SalaryHike1")
public class SalaryHike1 extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		int num1 = Integer.parseInt(req.getParameter("salary"));
		int hike1 = (int) (num1 * 0.26);
		req.setAttribute("hike_1", hike1);
		req.setAttribute("sal", num1);

		RequestDispatcher reqd = req.getRequestDispatcher("/SalaryHike2");
		reqd.forward(req, resp);

	}

}
