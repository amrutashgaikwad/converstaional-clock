package serenitylabs.tutorials.transformer;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class MinutesPast extends TimeStore implements serenitylabs.tutorials.interfaces.ConversationalTimeFormatter {
    @Override

    public String convert(Integer hour, Integer minutes){
        return "It's " +englishNumberToWords(minutes)+"past "+ HOUR.get((hour));
    }
}
