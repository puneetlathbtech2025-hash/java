import java.util.ArrayList;

public class TodoList {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Complete Java Assignment");
        tasks.add("Study OOP");
        tasks.add("Practice Coding");

        StringBuffer list = new StringBuffer();

        list.append("To-Do List\n");

        for (int i = 0; i < tasks.size(); i++) {
            list.append((i + 1) + ". " + tasks.get(i) + "\n");
        }

        System.out.println(list);
    }
}