import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*
        instanțierea o interfață List folosindu-se implementarea ArrayList
        (operatorul <> specifică tipul elementelor care urmează a fi stocate în colecție);
         */
        List<String> toDoList = new ArrayList<>();
        toDoList.add("Morning yoga"); // adaugarea elementelor
        toDoList.add("Breakfast");
        toDoList.add("Watching YouTube");
        toDoList.add("Work");

        toDoList.add(0, "Shower"); // adaugarea elementelor pe o poziție anumită
        toDoList.remove("Watching YouTube"); // eliminarea unui element

        /*
        utilizând bucla for putem parcurge o listă și accesa elementele acesteia
         */
        for (String toDo : toDoList)
            System.out.println(toDo);


       // System.out.println(toDoList.get(2)); // citirea unui element
       //  System.out.println(toDoList.contains("Work")); //  verificarea prezenței unui element în listă

    }
}