package com.app.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.db.service.CustomerService;
import com.app.model.Customer;

@WebServlet("/customers")
public class CustomerServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Customer>customers = CustomerService.getAllCustomers();
		PrintWriter writer = resp.getWriter();
		writer.println("<h1>Customer List</h1>");
		StringBuilder sb = new StringBuilder("<table border='1'><thead><tr>"
				+ "<th>Customer Id</th>"
				+ "<th>First Name</th>"
				+ "<th>Last Name</th>"
				+ "</tr></thead><tbody>");
		for (Customer customer : customers) {
			sb.append("<tr><td>");
			sb.append(customer.getCustomerId());
			sb.append("</td><td>");
			sb.append(customer.getfName());
			sb.append("</td><td>");
			sb.append(customer.getlName());
			sb.append("</td></tr>");			
		}
		sb.append("</tbody></table>");
		writer.println(sb.toString());
	}
}
