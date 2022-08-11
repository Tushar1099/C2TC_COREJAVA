// program for even numbers in a list

package LambdaConcept;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<Integer> l = List.of(10,12,13,45,32,0,56,78,98,34,67,31);
		System.out.println(l);
		

		Stream<Integer> stream = l.stream();
		
		List<Integer> el=stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		
	//	List<Integer> el=stream.filter(i->i<30).collect(Collectors.toList());   //filter is use to filter the elements
		
	//	List<Integer> el=stream.map(i->i+10).collect(Collectors.toList());     // map is used when we perform operations on elements
		
		System.out.println(el);
		
		
		
	}
	

}