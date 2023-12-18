package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDao {
     ArrayList<ItemDTO> loadAllItems() throws SQLException, ClassNotFoundException;

     ArrayList<String> loadAllItemCodes() throws SQLException, ClassNotFoundException;

     void deleteItem(String code) throws SQLException, ClassNotFoundException;

     void saveItems(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

     void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

     boolean exitItem(String code) throws SQLException, ClassNotFoundException;

     ResultSet generateNewId() throws SQLException, ClassNotFoundException;

     ItemDTO findItem(String code) throws SQLException, ClassNotFoundException;
}
