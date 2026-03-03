package calculadora;

public class Calculadora {
    private int num1;
    private int num2;

   public Calculadora(int a, int b) {
       num1 = a;
       num2 = b;
   }
   public int suma() {
       int resul = num1 + num2;     
       return resul;
   }
   public int resta() {
	int resul;
        resul = num1 - num2;
	return resul;
   }

   public int multiplica() {
       int resul = num1 * num2;
       return resul;
   }

   public int divide() {	  
       int resul = 0;
       if (num2!=0){resul = num1 / num2;}
       return resul;
   }
    public holarep(){Sytem.out.println("holarep");}
}

