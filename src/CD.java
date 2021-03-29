
public class CD extends Elemento
{
	private int cantidadDeTemas;
	
	public CD()
	{
		super(); ///Un constructor heredado siempre tiene que llamar al constructor del padre
		cantidadDeTemas= 0;
	}
	public CD(String autor,String titulo,int duracion,int cantidadDeTemas)
	{
		super(autor, titulo, duracion);
		this.cantidadDeTemas= cantidadDeTemas;
	}
	public void setCantidadDeTemas(int cantidadDeTemas)
	{
		this.cantidadDeTemas= cantidadDeTemas;
	}
	public int getCantidadDeTemas()
	{
		return cantidadDeTemas;
	}
	public String imprimir()
	{
		return super.imprimir()+ ""+cantidadDeTemas;
	}
}
