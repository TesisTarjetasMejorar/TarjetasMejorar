package dominio.dom.tarjeta;


//import javax.inject.Inject;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
//import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.MemberOrder;

@DomainObject(objectType = "HSES")
@PersistenceCapable
public class TarjetaHSES extends Tarjeta 
{
	private String AccionRealizada;


	@MemberOrder (sequence = "7")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	public String getAccionRealizada() 
	{
		return AccionRealizada;
	}


	public void setAccionRealizada(String accionRealizada) 
	{
		AccionRealizada = accionRealizada;
	}

}
