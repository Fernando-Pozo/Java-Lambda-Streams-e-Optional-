package application;

import java.util.Arrays;
import java.util.List;

public class program {

	public static void main(String[] args) {
	
		//Funções lambda
		
		new Thread(() -> System.out.println("Olá mundo!")).run();
		
		//SAM - Single Abstract Method
		//Qualquer interface que tenha apenas um metodo abstrato
		
		//primeira parte da lambda são os argumentos que a função recebe e a direita e a implementação
	
		//API Strem - fluxo de dados
		List<Integer> asList = Arrays.asList(1,2,3,4);
		
		asList.stream()
			.filter(e -> e % 2 == 0)
			.forEach(e -> System.out.println(e));
	}

}
