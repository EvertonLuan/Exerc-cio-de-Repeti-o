import java.util.Scanner;

public class Exercício4 {

	public static void main(String[] args) {
	

		Scanner leitor = new Scanner(System.in);
		
		int num, cont = 1, m = 0;
		
		
		while (cont < 15) {
			System.out.printf("Digite um %d° número: ", cont);
			num = leitor.nextInt();
			cont++;
			
		if (num > m) {
			m = num;
		}
	
			}
		System.out.println("O maior número digitado foi o: "+m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
