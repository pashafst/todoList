import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todos, Scanner scanner) {
        this.todoList = todos;
        this.scanner = scanner;
    }

    public void start() {
        help();
        while(true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();

            if (input.equals("stop")) break;

            this.handleCommand(input);
        }
    }

    public void handleCommand(String input) {
        if (input.equals("add")) add();
        else if (input.equals("list")) list();
        else if (input.equals("remove")) remove();
        else if (input.equals("help")) help();
        else System.out.println("Unknown command");
    }

    public void help() {
        System.out.println("Commands list:" +
                "\nstop - stop the program" +
                "\nadd - add todo list" +
                "\nlist - look at todo list" +
                "\nremove - remove a todo list by number" +
                "\n help - commands list");
    }

    public void add() {
        System.out.print("To add: ");
        String input = scanner.nextLine();
        this.todoList.add(input);
    }

    public void list() {
        this.todoList.print();
    }

    public void remove() {
        System.out.print("Which one is removed? ");
        int number = Integer.valueOf(scanner.nextLine());
        this.todoList.remove(number);
    }
}
