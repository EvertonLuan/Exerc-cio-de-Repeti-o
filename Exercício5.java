import java.util.Scanner;

public class Exercício5 {

	public static void main(String[] args) {
	

		Scanner leitor = new Scanner(System.in);
		
		
		int contm = 0;
		float cont = 1, medsal = 0, alt, altmax = 0, altmin = 3, sal;
		String sx;
		
		while (cont <= 3) {
			System.out.println("Digite a altura do funcionário: ");
			alt = leitor.nextFloat();
			System.out.println("Digite o salário do funcionário: ");
			sal = leitor.nextFloat();
			System.out.println("Digite o sexo do funcionário [M?F]: ");
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
		
		
		System.out.println("A média do salário do grupo é: R$"+medsal /3);
		System.out.println(altmax+ " é a maior altura e menor é "+altmin);
		System.out.printf("Há %f mulheres que recebe, até 1000,00.", cont);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
