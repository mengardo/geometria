

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_RRTtest {

	@Test
	void testArea() {
		Circulo_RRT c = new Circulo_RRT(7.0,"Pruebas") ;
		double area= c.area();
		assertEquals(153.93,area,0.01);
	}
	

	@Test
	void testPerimetro() {
		Circulo_RRT c = new Circulo_RRT(7.0,"Pruebas") ;
		double perimetro= c.perimetro();
		assertEquals(43.98,perimetro,0.01);
	}

}
