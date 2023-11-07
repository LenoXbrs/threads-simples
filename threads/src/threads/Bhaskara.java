package threads;

public class Bhaskara implements Runnable {
	 	private double a, b, c;
	 
	    private  double resultado;
	    
	    public Bhaskara(double a, double b, double c) {
	        this.a = a;
	        this.b = b;
	        this.c = c;
	        
	    }
	@Override
	public void run() {
		double discriminante = b * b - 4 * a * c;
        double raizDiscriminante = Math.sqrt(Math.abs(discriminante));
        
        resultado = (-b + raizDiscriminante) / (2 * a);
	}
	
	public  double getResultado() {
		return resultado;
	}

	
	public static void main(String[] args) {
		Bhaskara a = new Bhaskara(5, 5, 5);
		a.run();
		System.out.println(a.getResultado());
	}
	
	
}
