package br.com.fiap.porto.model.repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.porto.model.entity.Bicicleta;

public class BicicletaRepository extends Repository{

	public static Bicicleta save(Bicicleta bicicleta) {
		String sql = "insert into bicicleta"
				+"(id_bic, marca_bic, preco_bic, tipo_bic, modelo_bic, data_compra_bic"
				+ "values(?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, bicicleta.getIdBicicleta());
			ps.setString(2, bicicleta.getMarca());
			ps.setFloat(3, bicicleta.getPreco());
			ps.setString(4, bicicleta.getTipoBicicleta());
			ps.setString(5, bicicleta.getModelo());
			ps.setDate(6, Date.valueOf(bicicleta.getDataDaCompra()));
			if (ps.executeUpdate() > 0) {
				return bicicleta;
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
