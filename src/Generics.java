public class Generics {
    public static void main(String[] args) {
        Example<Integer> example = new Example<>();
        example.addToString(1);
        example.addToString(2);
        example.addToString(3);
        example.addToString(4);

        System.out.println(example.getStr());

    }
}
