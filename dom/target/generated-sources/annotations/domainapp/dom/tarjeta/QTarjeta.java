package domainapp.dom.tarjeta;

import org.datanucleus.query.typesafe.*;
import org.datanucleus.api.jdo.query.*;

public class QTarjeta extends org.datanucleus.api.jdo.query.PersistableExpressionImpl<Tarjeta> implements PersistableExpression<Tarjeta>
{
    public static final QTarjeta jdoCandidate = candidate("this");

    public static QTarjeta candidate(String name)
    {
        return new QTarjeta(null, name, 5);
    }

    public static QTarjeta candidate()
    {
        return jdoCandidate;
    }

    public static QTarjeta parameter(String name)
    {
        return new QTarjeta(Tarjeta.class, name, ExpressionType.PARAMETER);
    }

    public static QTarjeta variable(String name)
    {
        return new QTarjeta(Tarjeta.class, name, ExpressionType.VARIABLE);
    }

    public final StringExpression numTarjetaTesco;
    public final StringExpression fechaReporte;
    public final StringExpression fechaCarga;
    public final StringExpression lugarObs;
    public final StringExpression lineaNegocio;

    public QTarjeta(PersistableExpression parent, String name, int depth)
    {
        super(parent, name);
        this.numTarjetaTesco = new StringExpressionImpl(this, "numTarjetaTesco");
        this.fechaReporte = new StringExpressionImpl(this, "fechaReporte");
        this.fechaCarga = new StringExpressionImpl(this, "fechaCarga");
        this.lugarObs = new StringExpressionImpl(this, "lugarObs");
        this.lineaNegocio = new StringExpressionImpl(this, "lineaNegocio");
    }

    public QTarjeta(Class type, String name, org.datanucleus.api.jdo.query.ExpressionType exprType)
    {
        super(type, name, exprType);
        this.numTarjetaTesco = new StringExpressionImpl(this, "numTarjetaTesco");
        this.fechaReporte = new StringExpressionImpl(this, "fechaReporte");
        this.fechaCarga = new StringExpressionImpl(this, "fechaCarga");
        this.lugarObs = new StringExpressionImpl(this, "lugarObs");
        this.lineaNegocio = new StringExpressionImpl(this, "lineaNegocio");
    }
}
