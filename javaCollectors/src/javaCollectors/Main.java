package javaCollectors;

import static java.util.stream.Collectors.*;
import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;
import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Maça", "Banana", "Melancia", "Melão");
		System.out.println(list);
		
		List<String> result = list.stream().collect(toList());
		System.out.println(result);

		// Coleta todos os elementos stream
		Set<String> resultSet = list.stream().collect(toSet());
		System.out.println(result);
		
	}

}
