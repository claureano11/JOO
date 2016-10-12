public class Coche {
	//atributos
	private String nBastidor;
	private String matricula;
	private String marca;
	
	//metodos
	public String getnBastidor() {
		return nBastidor;
	}

	public void setnBastidor(String nBastidor) {
		this.nBastidor = nBastidor;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void arrancar(){
		System.out.print("En marcha");
	}
	
	public void girar(String sentido){
	
	}
	
	public void pitar(int miliSeg){
		
	}
	/*

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
		Coche c1=new Coche();
		c1.matricula="ss2100ax";
		c1.setMatricula("ss2100ax");
		System.out.println(c1.getMatricula());
			
		}	
		
	*/	

}
