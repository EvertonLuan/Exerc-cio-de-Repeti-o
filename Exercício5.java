import java.util.Scanner;

public class Exerc�cio5 {

	public static void main(String[] args) {
	

		Scanner leitor = new Scanner(System.in);
		
		
		int contm = 0;
		float cont = 1, medsal = 0, alt, altmax = 0, altmin = 3, sal;
		String sx;
		
		while (cont <= 3) {
			System.out.println("Digite a altura do funcion�rio: ");
			alt = leitor.nextFloat();
			System.out.println("Digite o sal�rio do funcion�rio: ");
			sal = leitor.nextFloat();
			System.out.println("Digite o sexo do funcion�rio [M?F]: ");
			sx = leitor.nextLine();
			System.out.println();
			cont++;
			
			medsal += sal;
			
			if (alt > altmax) {
				altmax = alt;
				
			}
			
			if (alt < altmin) {
				altmin = alt;
			
			}
		
			if (sx.equals("f") && sal <= 1000) {
				contm++;
				System.out.println(contm);
			}
		
		
		System.out.println("A m�dia do sal�rio do grupo �: R$"+medsal /3);
		System.out.println(altmax+ " � a maior altura e menor � "+altmin);
		System.out.printf("H� %f mulheres que recebe, at� 1000,00.", cont);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
