package serenitylabs.tutorials.transformer;

import serenitylabs.tutorials.interfaces.ConversationalTimeFormatter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class Just_After extends TimeStore implements ConversationalTimeFormatter {
    @Override

    public String convert(Integer hour, Integer minutes){

        return "It is just after "+ HOUR_O_CLOCKS.get((hour%12));
    }
}
