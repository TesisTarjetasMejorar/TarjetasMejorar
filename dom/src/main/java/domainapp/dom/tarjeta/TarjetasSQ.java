package domainapp.dom.tarjeta;

import java.util.Date;

import org.apache.isis.applib.AbstractFactoryAndRepository;
import org.apache.isis.applib.DomainObjectContainer;
import org.apache.isis.applib.annotation.DomainService;
import org.apache.isis.applib.annotation.DomainServiceLayout;
import org.apache.isis.applib.annotation.ParameterLayout;



@DomainServiceLayout(menuOrder = "30")
@DomainService(repositoryFor = TarjetaSQ.class)
public class TarjetasSQ extends AbstractFactoryAndRepository 
{
	@javax.inject.Inject 
    DomainObjectContainer container;
	
	public TarjetaSQ Cargar(@ParameterLayout (named="Numero de tarjeta") final int numTar,
						@ParameterLayout (named="Fecha Reporte") final Date fechaRepo,
						@ParameterLayout(named="Fecha Carga") final Date fechaCarga,
						@ParameterLayout(named="Lugar de Observacion") final String lugarObs,
						@ParameterLayout(named="Linea de Negocio") final String lineaNeg,
						@ParameterLayout(named="lo que sea") final String loquesea) 
	{
		final TarjetaSQ tSQ = container.newTransientInstance(TarjetaSQ.class);
		tSQ.setNumTarjetaTesco(String.valueOf(numTar));
		tSQ.setFechaReporte(fechaRepo.toString());
		tSQ.setFechaCarga(fechaCarga.toString());
		tSQ.setLugarObs(lugarObs);
		tSQ.setLineaNegocio(lineaNeg);
        tSQ.setLoquesea(loquesea);
        container.persistIfNotAlready(tSQ);
		
		return tSQ;
		
	}
	
	public TarjetaSQ Modificar()
	{
		return null;
	}
	
	public TarjetaSQ Eliminar()
	{
		return null;
	}
	
	
	
}