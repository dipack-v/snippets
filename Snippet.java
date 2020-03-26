
List<Integer> numbers = Arrays.asList(1,1,2,3,4,4,5,6,7,9,8);
numbers.stream().filter(i -> Collections.frequency(numbers, i) == 1).collect(Collectors.toSet()).forEach(System.out::println);
