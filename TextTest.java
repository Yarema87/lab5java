package ua.lviv.iot.algo.part1.lab5;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void deleteFragment() {
        Text text = new Text();
        String fragment = new String("r.+?d");
        List<String> text2 = new ArrayList<>(Arrays.asList("hello","world","this","is","my","red","test"));
        List<String> textWithoutFragments = new ArrayList<>(Arrays.asList("hello","this","is","my","test"));
        assertEquals(textWithoutFragments.toString(), text.deleteFragment(fragment,text2));
    }
    @Test
    void deleteIfNothingToDelete(){
        Text text = new Text();
        String fragment = new String("a.+?b");
        List<String> text2 = new ArrayList<>(Arrays.asList("hello","world","this","is","my","test"));
        List<String> textWithoutFragments = new ArrayList<>(Arrays.asList("hello","world","this","is","my","test"));
        assertEquals(textWithoutFragments.toString(), text.deleteFragment(fragment,text2));
    }
}