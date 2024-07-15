package lesson7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        // Create a list of strings
        List<String> l = new ArrayList<>();
        l.add("Hello");
        l.add("World");
        l.add("!");

     Consumer<String> consumer = new Consumer<String>() {
       @Override
        public void accept(String s){
             System.out.println(s);
         }

     };

     l.forEach(consumer);

    }
}
