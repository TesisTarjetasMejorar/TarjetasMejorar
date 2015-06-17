package domainapp.dom.tarjeta;

import java.util.Date;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.ParameterLayout;

@DomainServiceLayout(menuOrder = "40")
@DomainService(repositoryFor = Tarjeta.class)
public class TarjetasHSES extends AbstractFactoryAndRepository 
{
	@javax.inject.Inject 
    DomainObjectContainer container;
	
	public Tarjeta Cargar(@ParameterLayout (named="Numero de tarjeta") final int numTar,
	   						@ParameterLayout (named="Fecha Reporte") final Date fechaRepo,
	   						@ParameterLayout(named="Fecha Carga") final Date fechaCarga,
	   						@ParameterLayout(named="Lugar de Observacion") final String lugarObs,
	   						@ParameterLayout(named="Linea de Negocio") final String lineaNeg,
	   						@ParameterLayout(named="Accion Realizada") final String accRealizada) 
	{
		final TarjetaHSES tHSES = container.newTransientInstance(TarjetaHSES.class);
		tHSES.setNumTarjetaTesco(String.valueOf(numTar));
		tHSES.setFechaReporte(fechaRepo.toString());
		tHSES.setFechaCarga(fechaCarga.toString());
		tHSES.setLugarObs(lugarObs);
		tHSES.setLineaNegocio(lineaNeg);
		tHSES.setAccionRealizada(accRealizada);
		container.persistIfNotAlready(tHSES);

		return tHSES;

	}
	
	public Tarjeta Modificar()
	{
		return null;
	}
	
	public Tarjeta Eliminar()
	{
		return null;
	}
	

}
