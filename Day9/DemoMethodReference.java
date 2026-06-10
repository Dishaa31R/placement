package Day9;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DemoMethodReference {
    public static void main(String[] args) {
        List<String> skills = Arrays.asList("Spring", "Django", "Cypress", "Jinja", "NUnit", "active MQ");
        skills.sort(String::compareTo);
        skills.forEach(System.out::println);

        pojoRefer();
    }

    public static void pojoRefer(){
        List<product> items=Arrays.asList(
            new product("SSD",5600),
            new product("pendrive",800)
        );
        items.forEach(System.out::println);
        items.sort(Comparator.comparing(product::getItemName));
        items.forEach((System.out::println));
    }

}
