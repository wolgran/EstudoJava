import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//__________________________________Exercicios de switch______________________________//

	/*String dia = "Ter.";

	String tipoDeDia = switch (dia) {
		case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
		case "Sab.", "Dom." -> "Final de Semana";
		default -> "Desconhecido";
	};	

	System.out.println(tipoDeDia);	*/

//___________________________________________________________________________________//

		/* System.out.println("Digite o nivel: ");
		int nivel = sc.nextInt();

			switch(nivel) {


			case 1 -> System.out.println("Muito insatisfeito");
			case 2 -> System.out.println("Insatisfeito");
			case 3 -> System.out.println("Neutro");
			case 4 -> System.out.println("Satisfeito");
			case 5 -> System.out.println("Muito satisfeito");
			default -> System.out.println("Opção inválida");
				
			}*/
// ________________________________________________________________________________//

		/*System.out.println("Digite o numero correspondente ao mês: ");
		int mes = scanner.nextInt();

			switch (mes) {

			case 1 -> System.out.println("Janeiro");
			case 2 -> System.out.println("Fevereiro");
			case 3 -> System.out.println("Março");
			case 4 -> System.out.println("Abril");
			case 5 -> System.out.println("Maio");
			case 6 -> System.out.println("Junho");
			case 7 -> System.out.println("Julho");
			case 8 -> System.out.println("Agosto");
			case 9 -> System.out.println("Setembro");
			case 10 -> System.out.println("Outubro");
			case 11 -> System.out.println("Novembro");
			case 12 -> System.out.println("Dezembro");
			default -> System.out.println("Opção inválida");
			}*/
//________________________________________________________________________________//

			/*String mes = "Fevereiro";

			String diaDoMes = switch (mes) {

				case  "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31 dias";
				case "Abril", "Junho", "Setembro", "Novembro" -> "30 dias";
				case "Fevereiro" -> "28 dias";
				default -> "Mês desconhecido";
			};
			System.out.println(diaDoMes); */

//______________________________Exercício de if/else______________________________//

	/*float nota1 = 6.4f;
	float nota2 = 8f;
	float media = (nota1 + nota2) / 2;


	if (media >= 7) {
		System.out.println("Aprovado");
	}
	else{

		System.out.println("Reprovado");
	} */
//_________________________________________________________________________________//

	int frequencia = 74;
	float nota1 = 6.4f;
	float nota2 = 8f;
	float media = (nota1 + nota2) / 2;


	if (media >= 7 && frequencia > 75 ) {
		System.out.println("Aprovado");
	}
	else{

		System.out.println("Reprovado");
	}
	sc.close();
	
		} 
	}		