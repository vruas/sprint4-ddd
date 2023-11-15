package br.com.fiap.porto.model.repository;

import java.sql.Connection;

public class Repository {

	protected static Connection connection;

	public Repository() {
		getConnection();
	}
	
	public static Connection getConnection() {
		try {
			connection = ConnectionFactory.getInstance().getConexao();
			return connection;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static void closeConnection() {
		try {
			if (!connection.isClosed()) {
				connection.close();
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
