public class Generics {
    public static void main(String[] args) {
//        Example<Integer> example = new Example<>();
//        example.addToString(1);
//        example.addToString(2);
//        example.addToString(3);
//        example.addToString(4);

//        Example<String> example = new Example<>();
//        example.addToString("Один");
//        example.addToString("Два");
//        example.addToString("Три");
//        example.addToString("Четыре");


        Example<Car> example = new Example<>();
        Car car1 = new Car("Toyota", 2023);
        Car car2 = new Car("Volvo", 2015);
        Car car3 = new Car("BMV", 2020);

        example.addToString(car1);
        example.addToString(car2);
        example.addToString(car3);


        System.out.println(example.getStr());

    }
}
