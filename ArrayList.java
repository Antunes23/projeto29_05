import java.util.ArrayList;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		
		int soma= 0;
		
		for(Integer numero: numeros) {
		    soma += numero;
		    System.out.println("Os números armazenados são " + numero);
		}
		System.out.println("E a soma desses números são " + soma);
	}
}