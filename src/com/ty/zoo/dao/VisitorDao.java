package com.ty.zoo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ty.zoo.dto.VisitorDto;
import com.ty.zoo.util.ConnectionObject;

public class VisitorDao {
	Connection connection = null;

	public int saveVisitor(VisitorDto visitorDto) {
		String query = "insert into visitor values(?,?,?,?,?,?)";

		try {
			connection = ConnectionObject.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, visitorDto.getId());
			preparedStatement.setString(2, visitorDto.getName());
			preparedStatement.setString(3, visitorDto.getEmail());
			preparedStatement.setString(4, visitorDto.getPhone());
			preparedStatement.setString(5, visitorDto.getGender());
			preparedStatement.setInt(6, visitorDto.getAge());

			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return 0;

	}

	public VisitorDto getVisitorById(int id) {
		String query = "select * from visitor where id=?";
		connection = ConnectionObject.getConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();
			if (resultSet.next()) {
				VisitorDto visitorDto = new VisitorDto();
				visitorDto.setId(resultSet.getInt(1));
				visitorDto.setName(resultSet.getString(2));
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

}
