package threads;

public class BhaskaraParalelo {
    public static void main(String[] args) {
        double a = 2.0;
        double b = -6.0;
        double c = 6.0;

        Bhaskara tarefa1 = new Bhaskara(a, b, c);
        Bhaskara tarefa2 = new Bhaskara(a, b, c);

        Thread thread1 = new Thread(tarefa1);
        Thread thread2 = new Thread(tarefa2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

            double x1 = tarefa1.getResultado();
            double x2 = tarefa2.getResultado();

          
            System.out.println("X1: " + x1);
            System.out.println("X2: " + x2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}