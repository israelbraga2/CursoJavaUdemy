package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List <String> list = new ArrayList<>();
		
		list.add("Israel");
		list.add("Andréia");
		list.add("Nicolas");
		list.add("Antonio");
		list.add("André");
		list.add("Nick");
		list.add(3, "Rhalph");
		
		System.out.println(list.size());
		
		list.remove(1);
		list.remove("Rhalph");
		list.add(2, "Andréia");
		list.add(3, "Ana");
		
		
		for(String x : list) {
			System.out.println(x);
		}
		//predicado | função lambda | remover da lista
		System.out.println("---------------------------");
		//list.removeIf(x -> x.charAt(0) == 'A');
		
		for(String x : list) {
			System.out.println(x);
		}
		//encontrar posição na lista
		
		System.out.println("Index of Israel: " + list.indexOf("Israel"));
		
		//filtar somente nomes que comecem com uma letra
		System.out.println("---------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		for(String x : result) {
			System.out.println(x);
		}	
		//encontrar um elemento
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
