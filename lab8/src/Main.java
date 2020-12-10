import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("stray");
        list.add("kids");
        list.add("everywhere");
        list.add("all");
        list.add("around");
        list.add("the");
        list.add("world");
        list.add("stream");
        list.add("back");
        list.add("door");

        ArrayList<Integer> length = new ArrayList<>();
        for(String word: list){
            length.add(word.length());
        }

        Collections.sort(length);
        System.out.println(length);
    }
}

