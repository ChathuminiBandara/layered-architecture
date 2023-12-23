package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.CustomerDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO extends CrudDAO<CustomerDTO> {
     ArrayList<CustomerDTO> getAll() throws SQLException, ClassNotFoundException;
    boolean save(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    boolean update(CustomerDTO dto) throws SQLException, ClassNotFoundException;
    boolean delete(String id) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
    boolean exist(String id) throws SQLException, ClassNotFoundException;
    CustomerDTO search(String id) throws SQLException, ClassNotFoundException;
}
