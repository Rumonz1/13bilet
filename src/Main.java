import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void reverseArray(Object[] arr) {
        List<Object> list = Arrays.asList(arr);
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void main(String[] args) {
        String[] text = {"ПРОГРАММИРОВАНИЕ", "ИЗУЧАТЬ", "ЛЮБЛЮ", "ОЧЕНЬ", "Я"};
        reverseArray(text);

        String str = "Я ОЧЕНЬ ЛЮБЛЮ ИЗУЧАТЬ ПРОГРАММИРОВАНИЕ";
        System.out.println(str.replace(" ", ""));
    }
}
