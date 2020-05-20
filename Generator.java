public class Generator {

    public static String generateNext(String sequence) {              //generates next sequence based on given

        String newSeq = "";

        int subSeqLength = 1;
        char lastChar = sequence.charAt(0);
        for (int i = 1; i < sequence.length(); i++) {
            char presentChar = sequence.charAt(i);
            if (presentChar != lastChar) {
                newSeq += subSeqLength + String.valueOf(lastChar);
                subSeqLength = 0;
                lastChar = presentChar;
            }
            subSeqLength++;
        }
        newSeq += subSeqLength + String.valueOf(lastChar);            //adding last subsequence data in a new sequence

        return newSeq;

    }

    public static String generateAll(String input, Number length) {      //generates all sequences step-by-step

        String result = input;

        String next = input;
        long total = length.longValue();
        for (long i = 0; i < total; i++) {
            next = generateNext(next);
            result += "\n" + next;
        }

        return result;

    }

}
