package conversor;

/**
 * 
 * @author Caio Farias
 * 
 * Conversão da variável int para outro tipo primitivo long
 * Em seguida, outra conversão para Long , um Wrapper de long
 * 
 * 
 * Obs: quando eu usei idadeLaura++ curiosamente a idade de Laura continuou como 9 anos na impressão.
 * Desta forma eu tentei ++idadeLaura, e Laura cresceu para 10 anos, o incremento funcionou.
 *
 */

public class Pessoa {

	public static void main(String[] args) {
		
		String nome = "Laura";
		
		
		int idade = 9;
		System.out.printf("%s %d %s\n", "Laura tem", idade , "anos... ");
		
		System.out.printf("%s %s %s\n" , "Vamos converter a idade da", nome ,"para long. ");
		
		long idadeDeLaura = idade;
		System.out.printf("%s %d %s\n", "Laura tem", idadeDeLaura , "anos... ");
		
		System.out.printf("%s %s %s\n", "Agora vamos converter a idade de", nome ,"para tipo complexo 'Long'.", "\n");

		Long lauraCresceu = ++idadeDeLaura ;
		System.out.printf("%s %s %d %s", nome ,"completou", lauraCresceu ,"anos! :).");
		
		
		
		
		
		
		

	}

}
