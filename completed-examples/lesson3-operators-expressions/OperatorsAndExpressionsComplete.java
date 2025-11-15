/******************************************************************************

Operadores y expresiones.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		//TODO: Operaciones matemáticas básicas
		int num1= 15;
		int num2= 20;

		//Suma -> 35
		int sum= num1+num2+5;
		//System.out.print("Suma:" + sum);

		//Resta - 15 -20 = -5
		int rest= num2 - num1;
		//System.out.print("Resta:" + rest);

		//Multiplicacion
		int mulpt= num1 * num2;
		//System.out.print("Multiplicacion:" + mulpt);
	    //Divion

	    int div= num2 / num1;
	    //System.out.print("Divion:" + div);

	    //Resto de division

	    int resto= num2% num1;
	    System.out.print("Resto de Divion:" + resto);
	}
}
