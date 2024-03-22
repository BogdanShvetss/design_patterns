package templatemethod.barista_with_hook;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        if (answer.toLowerCase().startsWith("y")) {
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;

        System.out.println("Would you like milk and sugar with your coffee (y/n)? ");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = bufferedReader.readLine();
        } catch (IOException ex) {
            System.out.println("IO error trying to read you answer");
        }

        if (answer == null) {
            return "no";
        }
        return answer;
    }
}