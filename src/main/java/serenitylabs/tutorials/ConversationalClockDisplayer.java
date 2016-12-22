package serenitylabs.tutorials;

import serenitylabs.tutorials.interfaces.ConversationalTimeFormatter;
import serenitylabs.tutorials.interfaces.TimeProvider;
import serenitylabs.tutorials.transformer.*;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class ConversationalClockDisplayer {
    private final TimeProvider timeProvider;

    public ConversationalClockDisplayer (TimeProvider timeProvider){this.timeProvider=timeProvider;}
    public ConversationalClockDisplayer(){this(()-> LocalTime.now());}

    private static Map<Integer,ConversationalTimeFormatter> TIME_FORMAT_STRATEGY=new HashMap<>();
    static{
        TIME_FORMAT_STRATEGY.put(15, new QuarterPastConverter());
        TIME_FORMAT_STRATEGY.put(30, new HalfPastConverter());
        TIME_FORMAT_STRATEGY.put(45, new QuarteToConverter());
        TIME_FORMAT_STRATEGY.put(00, new DefaultConverter());
        TIME_FORMAT_STRATEGY.put(56, new AlmostConverter());
        TIME_FORMAT_STRATEGY.put(57, new AlmostConverter());
        TIME_FORMAT_STRATEGY.put(58, new AlmostConverter());
        TIME_FORMAT_STRATEGY.put(59, new AlmostConverter());
        TIME_FORMAT_STRATEGY.put(01, new Just_After());
        TIME_FORMAT_STRATEGY.put(02, new Just_After());
        TIME_FORMAT_STRATEGY.put(03, new Just_After());
        TIME_FORMAT_STRATEGY.put(04, new Just_After());

        TIME_FORMAT_STRATEGY.put(05, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(06, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(07, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(8, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(9, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(10, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(11, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(12, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(13, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(14, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(16, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(17, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(18, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(19, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(20, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(21, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(22, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(23, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(24, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(25, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(26, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(27, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(28, new MinutesPast());
        TIME_FORMAT_STRATEGY.put(29, new MinutesPast());

        TIME_FORMAT_STRATEGY.put(31, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(32, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(33, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(34, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(35, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(36, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(37, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(38, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(39, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(40, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(41, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(42, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(43, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(44, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(46, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(47, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(48, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(49, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(50, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(51, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(52, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(53, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(54, new MinutesTo());
        TIME_FORMAT_STRATEGY.put(55, new MinutesTo());

    }

    public String showTime(){
        Integer localTimeHour=timeProvider.getLocalTime().getHour();
        Integer localTimeMinute=timeProvider.getLocalTime().getMinute();
        return getTimeStrategy(localTimeHour,localTimeMinute);
    }

    private String getTimeStrategy(Integer localTimeHour, Integer localTimeMinute){
        return TIME_FORMAT_STRATEGY.get(localTimeMinute).convert(localTimeHour,localTimeMinute);
    }
}
