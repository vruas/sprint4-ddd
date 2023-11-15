package br.com.fiap.porto.model.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.porto.model.entity.Cliente;

public class ClienteRepository extends Repository {

	public static Cliente save(Cliente cliente ) {
		String sql = "insert into cliente"
				+ "(id_clie, email_clie, senha_clie, nome_clie)"
				+ "values(?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, cliente.getIdCliente());
			ps.setString(2, cliente.getEmail());
			ps.setString(3, cliente.getSenha());
			ps.setString(4, cliente.getNome());
			if (ps.executeUpdate() > 0) {
				return cliente;
			} else {
				return null;
			}
		} catch (SQLException e) {
			System.out.println("Erro ao salvar: " + e.getMessage());
		} finally {
			closeConnection();
		}
		return null;
	}
}
