import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Method {
	public static void main(String[] args) {

		//filter(Predicate)
		//Predicate means boolean value function
		//predicate always give you true and false
		//e->{ }
		//if there is multiple lines then you can use return statment




		//map(Function) return values
		/*

		on each element we will perform operations


		 */
//filter
		List<String>  name=List.of("Bakhtawar","ALi","Arisha","Hassan");
		List<String> a = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
		System.out.println(a);


		//map
		List<Integer> numbers=List.of(23,4,2,5,7,4);

		List<Integer> collect = numbers.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(collect);


		//by using for each
		name.stream().forEach(e->{

			System.out.println(e);
		});

		//its shortcut to traverse list

		a.stream().forEach(System.out::println);

		//sort
		numbers.stream().sorted().forEach(System.out::println);


		//min
		Integer min = numbers.stream().min((x, y) -> x.compareTo(y)).get();
		System.out.println("Minimum:"+min);

		//max
		Integer max = numbers.stream().max((x, y) -> x.compareTo(y)).get();
		System.out.println("Maximum:"+max);
	}
}
