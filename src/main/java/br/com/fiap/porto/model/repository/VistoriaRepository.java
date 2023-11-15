package br.com.fiap.porto.model.repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fiap.porto.model.entity.Vistoria;

public class VistoriaRepository extends Repository {

	public static Vistoria save(Vistoria vistoria) {
		String sql = "insert into vistoria"
				+ "(id_vis, relatorio_vis, data_vis)"
				+ "values(?, ?, ?";
		try {
			PreparedStatement ps = getConnection().prepareStatement(sql);
			ps.setLong(1, vistoria.getIdVistoria());
			ps.setString(2, vistoria.getRelatorioVis());
			ps.setDate(3, Date.valueOf(vistoria.getDataVistoria()));
			if (ps.executeUpdate() > 0) {
				return vistoria;
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
