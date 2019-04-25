package edu.dmacc.codedsm.hw19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Runner {

    public static void main(String[] args) {

        Function<String,Integer> stringToInt = (s) -> s.length();
        System.out.println(stringToInt.apply("Java course"));

        BiFunction<String,String,Integer>  stringsToInt = (r,s) -> r.length() + s.length();
        System.out.println(stringsToInt.apply("Java course", "DMACCC"));

        Consumer<String> useString = (s) -> System.out.println(s);
        useString.accept("Java course");

        Supplier<String> makeString = () -> "Hello!";
        System.out.println(makeString.get());


    }
}
