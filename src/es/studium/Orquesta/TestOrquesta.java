package es.studium.Orquesta;

public class TestOrquesta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instrumentos in1 = new Instrumentos();
		in1.setNombre("Trompeta");
		in1.setAfinacion('A');
		Instrumentos in2=new Instrumentos (" flauta con un agujero solo",'B');
		Musico mu1 = new Musico();
		mu1.setNombre("Luding");
		mu1.setSexo('H');
		System.out.println("Hola me llamo " + mu1.getNombre() + " y toco la " + in1.getNombre());
		Musico m2 = new Musico("Bartolo", 'H');
		System.out.println("Hola me llamo "+m2.getNombre()+ " y toco la " + in2.getNombre());
		}

}
