package crm_DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import crm_BE.Resultado_BE;

/*********************************************************************
 * @author rbarrios
 * @version 1.0
 * @since 23/04/2014
 * @FechaModificacion 23/04/2014
 * @Descripcion Clase que controla el acceso a datos de la bit�cora.
 ********************************************************************/

public class Bitacora_DAL {
	/*********************************************************************
	 * @author rbarrios
	 * @since 23/04/2014
	 * @param Bitacora_DAL
	 * @param Connection
	 * @return Resultado_BE
	 * @throws SQLException
	 * @throws Exception
	 * @Descripcion Creaci�n de un registro de bit�cora.
	 ********************************************************************/
	public static Resultado_BE crear(Bitacora_DAL bitacora,
			Connection conexion) throws SQLException {
		// Declaraci�n de variables
		Resultado_BE resultado;
		PreparedStatement pstmt;
		ResultSet rs;

		// Inicializaci�n de variables
		resultado = new Resultado_BE();
		pstmt = null;
		rs = null;

		try {
			// Declaraci�n de la funci�n
			pstmt = conexion
					.prepareStatement("SELECT * FROM funcionInsertar(?,?);");

			// Definici�n de los par�metros de la funci�n
			//pstmt.setTipo(index, value);

			// Ejecuta la funci�n
			rs = pstmt.executeQuery();

			while (rs.next()) {
				// Creaci�n exitosa
				resultado.re_exitoso = true;
				resultado.re_identificador = rs.getInt("resultado");
			}
		} catch (SQLException e) {
			// Error no manejado
			resultado.re_exitoso = false;
			resultado.re_descripcion = e.getMessage();
		} catch (Exception e) {
			// Error no manejado
			resultado.re_exitoso = false;
			resultado.re_descripcion = e.getMessage();
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (rs != null) {
				rs.close();
			}
		}

		return resultado;
	}
}
