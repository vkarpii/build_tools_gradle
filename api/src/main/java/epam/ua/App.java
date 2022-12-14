package epam.ua;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String[] list = new String[]{"12","79"};
        boolean value = Utils.isAllPositiveNumbers(list);
        System.out.println("Array : " + Arrays.toString(list) + "\n" + "isAllPositiveNumbers -> " +  value);
    }
}
