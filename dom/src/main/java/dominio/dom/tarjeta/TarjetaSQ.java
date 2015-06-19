package dominio.dom.tarjeta;


//import javax.inject.Inject;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;

import org.apache.isis.applib.annotation.DomainObject;
//import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.MemberOrder;





//@javax.jdo.annotations.Queries({
//        @javax.jdo.annotations.Query(
//                name = "find", language = "JDOQL",
//                value = "SELECT " + "FROM domainapp.dom.tarjeta.TarjetaSQ "),
//        @javax.jdo.annotations.Query(
//                name = "findByName", language = "JDOQL",
//                value = "SELECT " + "FROM domainapp.dom.tarjeta.TarjetaSQ "+ "WHERE name.indexOf(:name) >= 0 ")
//})

@DomainObject(objectType = "SQ")
@PersistenceCapable
public class TarjetaSQ extends Tarjeta
{
	
		
	
	private String decicionTomada;

	@MemberOrder (sequence = "6")
	@Column(allowsNull = "false",length = 40)
	public String getDecicionTomada() 
	{
		return decicionTomada;
	}

	public void setDecicionTomada(String loquesea) 
	{
		this.decicionTomada = loquesea;
	}
	
	
	/*
	@Inject
	private TarjetasSQ tarjetasSQ;
	@Inject
	private DomainObjectContainer container;
*/

}
