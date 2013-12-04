package com.shitouer.customer.dao;

import com.shitouer.customer.model.Customer;

/**
 * @author fowler
 * @since Nov 14, 2013
 * 
 */
public interface ICustomerDao {
	public void insert(Customer customer);

	public Customer findByCustomerId(int customerId);
}
