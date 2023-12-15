package com.example.layeredarchitecture.dao;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
    public ArrayList<CustomerDTO> getallCustomer() throws SQLException, ClassNotFoundException;
    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public boolean deleteCustomer(CustomerDTO customerDTO ) throws SQLException, ClassNotFoundException;

    public  boolean exitCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;
    public String generateID() throws SQLException, ClassNotFoundException;
}
