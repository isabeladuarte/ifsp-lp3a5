package javaCollectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
        List<Fruta> fruta = Arrays.asList
                (new Fruta("Maça", "Vermelha"),
                (new Fruta("Banana", "Amarelo")),
                (new Fruta("Abacaxi", "Amarelo")),
                (new Fruta("Morango", "Vermelho")));
		
        System.out.println(fruta);
		
        
		List<Fruta> result = fruta.stream().collect(toList());
		System.out.println(result);

		// Coleta todos os elementos stream
		Set<Fruta> resultSet = fruta.stream().collect(toSet());
		System.out.println(resultSet);
		
	}

}
