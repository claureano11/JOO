package agenda.datos;

public class Amigo {
	private String nombre;
	private String email;
	private String telefono;
	
	//declarar metodos constructores
	public Amigo(){
		this.nombre=" ";
	}
	
	public Amigo(String nombre){
		this.nombre=nombre;
	}

	//metodos getters and setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
}
