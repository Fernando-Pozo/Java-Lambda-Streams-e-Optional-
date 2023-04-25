package application;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class stream {
	public static void main(String[] args) {
		
		List<Integer> lista = Arrays.asList(1,3,9,8,7,7,2);
		
		//conta a quantidade de elementos na lista
		/*
		long count = lista.stream()
			.filter(e -> e % 2 == 0)
			//.map(e -> e * 2)
			.count();
		
		System.out.println(count);
		*/
		
		//cria uma nova lista 
		/*
		List<Integer> novalista = lista.stream()
				.filter(e -> e % 2 == 0)
				.map(e -> e * 3)
				.collect(Collectors.toList());
		
		System.out.println(novalista);
		*/
		
		//agrupar em um mapa pelos numero par/impar
		/*
		Map<Boolean, List<Integer>> mapa = lista.stream()
			    .map(e -> e * 3)
				.collect(Collectors.groupingBy(e -> e % 2 == 0));
		
		System.out.println(mapa);
		*/
		
		//agrupar como string
		String collect = lista.stream()
			    .map(e -> String.valueOf(e))
				.collect(Collectors.joining(","));
		
		System.out.println(collect);
	}
}
