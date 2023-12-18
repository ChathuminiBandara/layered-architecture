package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.*;
import java.util.ArrayList;

public interface CustomerDAO {
     ArrayList<CustomerDTO> getAllCustomer() throws SQLException, ClassNotFoundException;

     void saveCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

     void updateCustomer(CustomerDTO customerDTO) throws SQLException, ClassNotFoundException;

     void deleteCustomer(String id) throws SQLException, ClassNotFoundException;

     boolean existCustomer(String id) throws SQLException, ClassNotFoundException;

     ResultSet generateNewId() throws SQLException, ClassNotFoundException;

     CustomerDTO setCustomerName(String newValue) throws SQLException, ClassNotFoundException;
}
