package crm_BLL;

import java.sql.Connection;
import java.sql.DriverManager;

/*********************************************************************
 * @author rbarrios
 * @version 1.0
 * @since 23/04/2014
 * @FechaModificacion 23/04/2014
 * @Descripcion Contiene rutinas generales utilizadas en el proyecto.
 ********************************************************************/

public class General_BLL {
	public static Connection obtenerConexion() {
		// Declaración de variables
		Connection conexion;

		// Inicialización de variables
		conexion = null;

		try {
			Class.forName("org.postgresql.Driver");
			conexion = DriverManager
					.getConnection(
							"jdbc:postgresql://54.186.15.215:5432/usac_crm_odontologia",
							"admin", "admin321");
			conexion.setAutoCommit(false);
		} catch (Exception e) {
			conexion = null;
		}
		return conexion;
	}

	public static String obtenerFecha() {
		return "";
	}

	public static String obtenerFechaHora() {
		return "";
	}

	public static void validaSesion() {

	}

	public static boolean tienePermiso() {
		return true;
	}
}
