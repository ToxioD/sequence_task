import org.junit.*;

public class GeneratorTest {

    @Test
    public void generateNext_UnitSequenceGiven_ShouldReturnNewSequence() {
        Assert.assertEquals("11", Generator.generateNext("1"));
    }

    @Test
    public void generateNext_SequenceGiven_ShouldReturnNewSequence() {
        Assert.assertEquals("321321141524", Generator.generateNext("2223114544"));
    }

    @Test
    public void generateNext_SequenceWithNoNumbersGiven_ShouldReturnNewSequence() {
        Assert.assertEquals("1a2b1c1d", Generator.generateNext("abbcd"));
    }

    @Test
    public void generateNext_SequenceWithSpaceGiven_ShouldReturnNewSequenceWithSpace() {
        Assert.assertEquals("111213241 331211", Generator.generateNext("12344 33321"));
    }

    @Test
    public void generateAll_DefaultSequenceAndLengthGiven_ShouldReturnAllSequences() {
        Assert.assertEquals("1\n" +
                "11\n" +
                "21\n" +
                "1211\n" +
                "111221\n" +
                "312211\n" +
                "13112221\n" +
                "1113213211\n" +
                "31131211131221\n" +
                "13211311123113112211\n" +
                "11131221133112132113212221", Generator.generateAll("1",10));
    }

    @Test
    public void generateAll_SequenceAndLengthGiven_ShouldReturnAllSequences() {
        Assert.assertEquals("1332\n" +
                "112312\n" +
                "2112131112\n" +
                "12211211133112", Generator.generateAll("1332",3));
    }

    @Test
    public void generateAll_SequenceWithNoNumbersAndLengthGiven_ShouldReturnAllSequences() {
        Assert.assertEquals("aab\n" +
                "2a1b\n" +
                "121a111b\n" +
                "1112111a311b", Generator.generateAll("aab",3));
    }

    @Test
    public void generateAll_SequenceWithSpaceAndLengthGiven_ShouldReturnAllSequences() {
        Assert.assertEquals("44321 232\n" +
                "241312111 121312\n" +
                "121411131112311 111211131112", Generator.generateAll("44321 232",2));
    }

}
