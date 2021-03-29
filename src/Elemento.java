
public class Elemento 
{
	private String autor;
	private String titulo;
	private int duracion;
	
	///Constructor
	public Elemento()
	{
		autor= ;
		titulo= ;
		duracion= 0;
	}
	public Elemento(String autor, String titulo, int duracion)
	{
		this.autor= autor;
		this.titulo= titulo;
		this.duracion= duracion;
	}
	
	public String getAutor()
	{
		return autor;
	}
	public void setAutor(String autor)
	{
		this.autor= autor;
	}
	public String getTitulo()
	{
		return titulo;
	}
	public void setTitulo(String titulo)
	{
		this.titulo= titulo;
	}
	public int getDuracion()
	{
		return duracion;
	}
	public void setDuracion(int duracion)
	{
		this.duracion= duracion;
	}
	public String imprimir()
	{
		return titulo+ ""+autor+""+duracion; 
	}
}
