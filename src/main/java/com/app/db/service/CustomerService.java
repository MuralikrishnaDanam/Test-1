package com.app.db.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.app.model.Customer;

public class CustomerService {

	public static List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<Customer>();
		Connection conn = DBConnectionUtility.getDBConnection();
		try {
			Statement statement = conn.createStatement();
			ResultSet rs = statement.executeQuery("select * from Customer");
			while (rs.next()) {
				Customer customer = new Customer(rs.getLong("customerId"), rs.getString("fName"),
						rs.getString("lName"));
				customers.add(customer);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return customers;

	}
}
