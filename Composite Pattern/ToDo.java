import java.util.*;
abstract class Task{
    protected String title;

    protected Task(String t){
        title=t;
    }

    abstract protected void print(int spaces);

    protected void printSpaces(int spaces){
        spaces*=5;
        while(spaces>0){
            spaces--;
            System.out.print(" ");
        }
    }

    public void print(){
        print(0);
    }
}

class Leaf extends Task{

    public Leaf(String t){
        super(t);
    }

    protected void print(int spaces){
        printSpaces(spaces);
        System.out.println("<li> "+title+" </li>");
    }
}

class ToDoList extends Task{
    private ArrayList<Task> todos;

    public ToDoList(String t){
        super(t);
        todos=new ArrayList<Task>();
    }

    public void addTask(Task todo){
        todos.add(todo);
    }

    protected void print(int spaces){
        printSpaces(spaces);
        System.out.println("<ul>"+title);

        for(Task t: todos){
            t.print(spaces+1);
        }

        printSpaces(spaces);
        System.out.println("</ul>");
    }
}
