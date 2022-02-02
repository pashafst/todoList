import java.util.ArrayList;

public class TodoList {
    private ArrayList<String> todos;

    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void add(String task) {
        todos.add(task);
    }

    public void print() {
        for (int i=0; i<this.todos.size(); i++) {
            String task = todos.get(i);
            int number = i+1;
            System.out.println(number + ": " + task);
        }
    }

    public void remove(int number) {
        int index = number-1;
        todos.remove(index);
    }
}
