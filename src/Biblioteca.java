
public class Biblioteca 
{
	private CD cds[];
	
	private int validos;
	
	public Biblioteca()
	{
		cds= new CD[100];
		validos= 0;
	}
	
	public void agregarCd(CD unCd)
	{
		cds[validos]= unCd;
		validos++;
	}
	public String listarCd()
	{
		StringBuilder builder= new StringBuilder();
		for(int i=0; i<validos; i++)
		{
			builder.append(cds[i].imprimir());
		}
		return builder.toString();
	}
	public int getTotalElementos()
	{
		return validos;
	}
}
