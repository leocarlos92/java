package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        List<String> names = Arrays.asList("Basant", "Santosh", null, "Vinod", null, "sam", "john");

        List<String> result = names.stream().
                filter(name -> name != null).
                collect(Collectors.toList());

        System.out.println(result);

        // Stream.ofNullable
        List<String> nameResult = names.stream()
                .flatMap(Stream::ofNullable)
                .collect(Collectors.toList());

        System.out.println("Stream.ofNullable");
        System.out.println(nameResult);

        // Stream.iterate
        Stream.iterate(0, n -> n + 2)
                .limit(5)
                .forEach(System.out::println);

        // Collectors.collectingAndThen
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 50000),
                new Employee("Bob", 65000),
                new Employee("Charlie", 78000),
                new Employee("Sarah", 45000)
        );
        // calculate avg salary & round up the nearst Integer

        Long collect = employees.stream()
                .mapToDouble(Employee::getSalary)
                .boxed()
                .collect(Collectors.collectingAndThen(
                        Collectors.averagingDouble(Double::doubleValue),
                        Math::round
                ));

        System.out.println(collect);

        // take while and drop while
        List<Integer> numbers = List.of(1, 2, 3, 4, 6, 7, 8, 9);

        List<Integer> num1 = numbers.stream()
                .takeWhile(num -> num < 5)
                .collect(Collectors.toList());
        System.out.println(num1);

        List<Integer> num2 = numbers.stream()
                .dropWhile(num -> num < 5)
                .collect(Collectors.toList());
        System.out.println(num2);

        List<Integer> num3 = numbers.stream()
                .takeWhile(num -> num < 7)
                .dropWhile(num -> num < 3)
                .collect(Collectors.toList());
        System.out.println(num3);

        // Collectors.teeing()
        Map<String, Integer> minMaxMap = numbers.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Integer::compareTo),
                        Collectors.minBy(Integer::compareTo),
                        (value1, value2) -> Map.of("max", value1.get(), "min", value2.get()))
                );

        System.out.println(minMaxMap);

        // Stream.concat
        Stream<Integer> integerStream1 = Stream.of(1, 2, 3);
        Stream<Integer> integerStream2 = Stream.of(4, 5, 6);

        Long sum = Stream.concat(integerStream1, integerStream2)
                .mapToLong(Integer::intValue).sum();
        System.out.println(sum);

        // Collectors.partitioningBy
        Map<Boolean, List<Integer>> map = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        System.out.println(map);
        System.out.println("even number : " + map.get(Boolean.FALSE));
        System.out.println("odd number : " + map.get(Boolean.TRUE));

        // IntStream for ranges
        List<Integer> intStream1 = IntStream.range(1, 20).boxed().collect(Collectors.toList());
        System.out.println(intStream1);
        List<Integer> intStream2 = IntStream.rangeClosed(1, 20).boxed().collect(Collectors.toList());
        System.out.println(intStream2);
    }

}