public class Parser {

    private static final String DEF_LEN = "10";
    private static final String DEF_SEQ = "1";

    public static String[] parse(String[] input){           //parses the input string, returns base sequence
                                                            //and total length as an array
        String[] output = new String[2];
        output[0] = DEF_SEQ;                                //if input is empty, default values will be used
        output[1] = DEF_LEN;

        try {
            if (input.length > 0) {
                output[0] = input[0];
                if (input.length > 1) {
                    if (Long.parseLong(input[1]) > 0) {     //try-parsing the length:
                        output[1] = input[1];               //default length will be used if unsuccessful
                    }                                       //or if given length is negative
                }
            }
        } catch (NumberFormatException e) {
        } finally {
            return output;
        }

    }

}
