/**
 * @author Raul Rodriguez Tortosa
 * @version 1.2
 */
public class Rectangulo_RRT extends FiguraGeometrica_RRT {
	private double l1;
	private double l2;
	
	/**
	 * Este es el costructor y se le pasan los siguientes parametros
	 * @param tipoFigura
	 * @param lG
	 * @param lP
	 */
	public Rectangulo_RRT(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Con este metodo se calcula el area del rectangulo
	 * @return double
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Con este metodo se calcula el perimetro del rectangulo
	 * @return double
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
