package com.example.layeredarchitecture.dao.custom;

import com.example.layeredarchitecture.dao.SQLUtil;
import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ItemDAO extends CrudDAO<ItemDTO> {
    ArrayList<ItemDTO> getAll() throws SQLException, ClassNotFoundException;
    boolean save(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean delete(String code) throws SQLException, ClassNotFoundException;
    boolean update(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;
    boolean exist(String code) throws SQLException, ClassNotFoundException;
    String generateNewId() throws SQLException, ClassNotFoundException;
    ItemDTO search(String code) throws SQLException, ClassNotFoundException;
}
