package ua.lviv.iot.algo.part1.lab5;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
    public String deleteFragment(final String fragment,
                                 final List<String> text) {
        for (int i = 0; i < text.size(); i++) {
            Pattern pattern = Pattern.compile(fragment);
            Matcher matcher = pattern.matcher(text.get(i));
            if (matcher.find()) {
                text.remove(i);
            }
        }
        return text.toString();
    }
}
