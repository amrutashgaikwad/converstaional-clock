package serenitylabs.tutorials.transformer;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class QuarteToConverter extends TimeStore implements serenitylabs.tutorials.interfaces.ConversationalTimeFormatter {
    @Override

    public String convert(Integer hour, Integer minutes){
        return "It is quarter to "+ HOUR.get((hour%12) + 1);

    }
}
