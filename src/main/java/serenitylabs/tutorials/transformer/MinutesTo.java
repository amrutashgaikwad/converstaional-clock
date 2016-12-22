package serenitylabs.tutorials.transformer;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class MinutesTo extends TimeStore implements serenitylabs.tutorials.interfaces.ConversationalTimeFormatter {
    @Override

    public String convert(Integer hour, Integer minutes){
        return "It's "+englishNumberToWords(minutes)+" to "+ HOUR.get((hour%12)+1);

    }
}
