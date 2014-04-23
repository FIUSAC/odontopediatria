package crm_BE;

import java.sql.Date;
import java.sql.Timestamp;

/*********************************************************************
 * @author rbarrios
 * @version 1.0
 * @since 23/04/2014
 * @FechaModificacion 23/04/2014
 * @Descripcion Entidad de negocio de la bitácora del sistema.
 ********************************************************************/

public class Bitacora_BE {
	public int bi_bitacora;
	public int bi_usuario;
	public Date bi_fecha;
	public Timestamp bi_fecha_hora;
	public String bi_descripcion;
	
	public Bitacora_BE() {
		this.bi_bitacora = -99999;
		this.bi_usuario = -99999;
	}
}
