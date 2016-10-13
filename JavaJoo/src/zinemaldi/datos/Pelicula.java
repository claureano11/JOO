package zinemaldi.datos;

public class Pelicula {
	//atributos
	private String titulo;
	private Director director;
	private int duracion;
	private boolean visto;
	
	
	//metodos
		//--metodo constructor
		public Pelicula(String titulo){
			this.titulo = titulo; //'this' para referenciar al objeto en que me encuentro
		}

		
		//--metodo getter and setter
	
	
	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String getDirector(){
		return director.getNombre();
	}
	
	public void setDirector(String director){
		this.director=new Director();
		this.director.getNombre();
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isVisto() {
		
		if(peli.isVisto())
		return "visto";
		else
			return "no visto";
	}

	public void setVisto(boolean visto) {
		this.visto = visto;
	}
	
}
