package serenitylabs.tutorials.transformer;


import serenitylabs.tutorials.interfaces.ConversationalTimeFormatter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amrutash on 12/22/2016.
 */
public class TimeStore {

    protected static Map<Integer,String> HOUR_O_CLOCKS=new HashMap<>();
    static{
        HOUR_O_CLOCKS.put(0,"midnight");
        HOUR_O_CLOCKS.put(1,"one o'clock");
        HOUR_O_CLOCKS.put(2,"two o'clock");
        HOUR_O_CLOCKS.put(3,"three o'clock");
        HOUR_O_CLOCKS.put(4,"four o'clock");
        HOUR_O_CLOCKS.put(5,"five o'clock");
        HOUR_O_CLOCKS.put(6,"six o'clock");
        HOUR_O_CLOCKS.put(7,"seven o'clock");
        HOUR_O_CLOCKS.put(8,"eight o'clock");
        HOUR_O_CLOCKS.put(9,"nine o'clock");
        HOUR_O_CLOCKS.put(10,"ten o'clock");
        HOUR_O_CLOCKS.put(11,"eleven o'clock");
        HOUR_O_CLOCKS.put(12,"noon");
    }

    protected static Map<Integer,String> HOUR=new HashMap<>();
    static{
        HOUR.put(0,"midnight");
        HOUR.put(1,"one");
        HOUR.put(2,"two");
        HOUR.put(3,"three");
        HOUR.put(4,"four");
        HOUR.put(5,"five");
        HOUR.put(6,"six");
        HOUR.put(7,"seven");
        HOUR.put(8,"eight");
        HOUR.put(9,"nine");
        HOUR.put(10,"ten");
        HOUR.put(11,"eleven");
        HOUR.put(12,"twelve");
    }

    protected static Map<Integer,String> MINUTES=new HashMap<>();
    static{
        MINUTES.put(0,"");
        MINUTES.put(10,"ten");
        MINUTES.put(20,"twenty");
        MINUTES.put(30,"thirty");
        MINUTES.put(40,"fourty");
        MINUTES.put(50,"fifty");
        MINUTES.put(01,"one");
        MINUTES.put(02,"two");
        MINUTES.put(03,"three");
        MINUTES.put(04,"four");
        MINUTES.put(05,"five");
        MINUTES.put(06,"six");
        MINUTES.put(07,"seven");
        MINUTES.put(8,"eight");
        MINUTES.put(9,"nine");
        MINUTES.put(11,"eleven");
        MINUTES.put(12,"twelve");
        MINUTES.put(13,"thirteen");
        MINUTES.put(14,"fourteen");
        MINUTES.put(16,"sixteen");
        MINUTES.put(17,"seventeen");
        MINUTES.put(18,"eighteen");
        MINUTES.put(19,"nineteen");
    }

    protected static String englishNumberToWords(int minutes){
        int bufferNumber1 = 0;
        int bufferNumber2 = 0;
        String transformedNumber = "Default Text";
        if(minutes<20) {
            return MINUTES.get(minutes);
        }else{
            bufferNumber1 = (int) Math.floor(minutes/10)*10;;
            bufferNumber2 = (minutes%10);
            return MINUTES.get(bufferNumber1)+" "+MINUTES.get(bufferNumber2);
        }
    }
}
