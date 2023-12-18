package com.example.layeredarchitecture.DAO;

import com.example.layeredarchitecture.model.OrderDetailDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public interface OrderDetailsDao {

    boolean saveOrderDetails(PreparedStatement stm, Connection connection , List<OrderDetailDTO> orderDetails , String orderId) throws SQLException, ClassNotFoundException;
}
