package example1;

public class Calculator {

    public int add (int a, int b){
        return a+b;
    }

    public int mult (int a, int b){
        return a*b;
    }

    public int subs (int a, int b) throws InterruptedException {
        Thread.sleep(1000);
        return a-b;
    }
    public int div (int a, int b) throws Exception {
        if (b == 0)
            throw new Exception("division entre 0 no es aceptada");
        return a/b;
    }

    public int mod (int a, int b) throws Exception {
        int x = 0;
        x = a%b;
        if (x <= 0){
            throw new Exception("Este modulo no existe");
        }
        return x;
    }
}
