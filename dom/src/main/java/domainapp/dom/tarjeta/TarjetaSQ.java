package domainapp.dom.tarjeta;


//import javax.inject.Inject;
import javax.jdo.annotations.Column;
import javax.jdo.annotations.PersistenceCapable;
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


@PersistenceCapable
public class TarjetaSQ extends Tarjeta
{
	
		
	
	private String loquesea;

	@MemberOrder (sequence = "6")
	@Column(allowsNull = "false",length = 40)
	public String getLoquesea() 
	{
		return loquesea;
	}

	public void setLoquesea(String loquesea) 
	{
		this.loquesea = loquesea;
	}
	
	
	/*
	@Inject
	private TarjetasSQ tarjetasSQ;
	@Inject
	private DomainObjectContainer container;
*/

}
