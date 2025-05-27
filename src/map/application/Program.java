package map.application;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {

        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "123456789");

        //cookies.remove("email");

        cookies.put("phone", "987654321");//sobrescreve o valor pois a chave já existe

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));

        System.out.println("Phone number is: " + cookies.get("phone"));

        System.out.println("Email: " + cookies.get("email"));

        System.out.println("Size of cookies: " + cookies.size());

        System.out.println("cookies: ");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
