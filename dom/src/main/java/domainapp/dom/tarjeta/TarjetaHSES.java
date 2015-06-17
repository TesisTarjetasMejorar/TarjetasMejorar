package domainapp.dom.tarjeta;

import org.apache.isis.applib.annotation.MemberOrder;
import org.apache.isis.applib.annotation.Title;

public class TarjetaHSES extends Tarjeta 
{
	private String AccionRealizada;

	@MemberOrder (sequence = "7")
	@javax.jdo.annotations.Column(allowsNull = "false",length = 40)
	@Title(sequence = "7")
	public String getAccionRealizada() 
	{
		return AccionRealizada;
	}

	public void setAccionRealizada(String accionRealizada) 
	{
		AccionRealizada = accionRealizada;
	}

}
