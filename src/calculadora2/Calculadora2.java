package calculadora2;
import java.util.Scanner;

public class Calculadora2 {
 private int num1;
 private int num2;
 
 public Calculadora2(int a, int b){
 num1=a;
 num2=b;
 }
 
public int suma(){
 int resul=num1+num2;
 return resul;
}
public int resta(){
 int resul=num1-num2;
 return resul;
}
public int multiplicar(){
 int resul=num1*num2;
 return resul;
}
public int dividir(){
 int resul=num1/num2;
 return resul;
}

public static void main(String[] args){
 int a, b, operacion;
 Scanner teclado=new Scanner(System.in);
 System.out.println("introduce el método que deseas realizar 1:suma, 2:resta, 3:multiplicar4:dividir");
 operacion=teclado.nextInt();
 System.out.println("introduce el valor del primer operador");
 a=teclado.nextInt();
 System.out.println("introduce el valor del segundo operador");
 b=teclado.nextInt();
 Calculadora2 objeto=new Calculadora2(a,b);
 switch (operacion){
 case 1:System.out.println("El resultado de la suma es "+ objeto.suma());
 break;
 case 2:System.out.println("El resultado de la suma es "+objeto.resta());
 break;
 case 3:System.out.println("El resultado de la mujltiplicación es "+objeto.multiplicar());
 break;
 case 4:System.out.println("El resultado de la suma es "+objeto.dividir());
 break;
 default:
 System.out.println("no ha elegido la operación correcta");
}
}
}

