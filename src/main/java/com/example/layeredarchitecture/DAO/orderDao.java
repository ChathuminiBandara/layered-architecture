package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.ItemDTO;
import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface orderDao {
    public ArrayList<ItemDTO> orderDetail(String newItemCode) throws SQLException, ClassNotFoundException;

     ResultSet generateNewId() throws SQLException, ClassNotFoundException;

     boolean saveOrder(String orderId, LocalDate orderDate, String customerId, List<OrderDetailDTO> orderDetails);

}
