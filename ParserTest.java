import org.junit.*;

public class ParserTest {

    @Test
    public void parseInput_EmptyArrayGiven_ShouldReturnDefaultValues() {
        String[] expected = {"1","10"};
        Assert.assertEquals(expected, Parser.parse(new String[0]));
    }

    @Test
    public void parseInput_NoLengthGiven_ShouldReturnWithDefaultLength() {
        String[] input = {"123"};
        String[] expected = {"123","10"};
        Assert.assertEquals(expected, Parser.parse(input));
    }

    @Test
    public void parseInput_NormalSequenceAndNormalLengthGiven_ShouldReturnAsGiven() {
        String[] input = {"123","2"};
        String[] expected = {"123","2"};
        Assert.assertEquals(expected, Parser.parse(input));
    }

    @Test
    public void parseInput_SequenceWithSpacesAndNormalLengthGiven_ShouldReturnAsGiven() {
        String[] input = {"123 321","1"};
        String[] expected = {"123 321","1"};
        Assert.assertEquals(expected, Parser.parse(input));
    }

    @Test
    public void parseInput_NormalSequenceAndNegativeLengthGiven_ShouldReturnWithDefaultLength() {
        String[] input = {"321","-5"};
        String[] expected = {"321","10"};
        Assert.assertEquals(expected, Parser.parse(input));
    }

    @Test
    public void parseInput_NormalSequenceAndNonNumberLengthGiven_ShouldReturnWithDefaultLength() {
        String[] input = {"1111","abc"};
        String[] expected = {"1111","10"};
        Assert.assertEquals(expected, Parser.parse(input));
    }

}
