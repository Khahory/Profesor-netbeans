
package Clase;

/**
* Created by kaponte15 on 10/6/17.
*/
public class Test {

public double jota =12;

public double sumar(double x, double y){



double resultado= x+y;

jota=resultado;
return resultado;

}

public static void main (String []args){



Test fotocopia1=new Test();

Test fotocopia2=new Test();

fotocopia2.sumar(14.0,10.0);

System.out.println(fotocopia1.jota);
System.out.println(fotocopia2.jota);


}

}
