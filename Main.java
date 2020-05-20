public class Main {

    public static void main(String[] args) {

        String[] input = Parser.parse(args);                            //parsing the input
        String sequence = input[0];
        Long length = Long.parseLong(input[1]);

        System.out.println(Generator.generateAll(sequence, length));    //generating and printing given sequence and
                                                                        //all next sequences totaling a given length
    }

}
