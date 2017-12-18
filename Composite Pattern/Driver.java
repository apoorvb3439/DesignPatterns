import java.util.*;
class Driver{

    private static String getTime(int i){
        String s=""+((i)%24)+":"+((i)%60)+":"+((i)%60);
        return s;
    }

    private static String getDate(int i){
        String s=""+((i)%30)+"/"+((i)%12)+"/201"+((i)%2+7);
        return s;
    }

    public static void main(String[] args) {
        Leaf l;
        Random r=new Random();

        ToDoList list = new ToDoList("My ToDoList");

        int d=r.nextInt();
        if(d<0){
            d=-d;
        }

        for(int i=d;i<d+5;i++){
            l= new Leaf("C# Task "+(i-d+1)+" at "+getTime(i)+" on "+getDate(i));
            list.addTask(l);
        }

        ToDoList list1 = new ToDoList("Shopping List");

        d=r.nextInt();
        if(d<0){
            d=-d;
        }

        for(int i=d;i<d+5;i++){
            l= new Leaf("Shop Task "+(i-d+1)+" at "+getTime(i)+" on "+getDate(i));
            list1.addTask(l);
        }

        ToDoList list2= new ToDoList("Birthday List");
        d=r.nextInt();
        if(d<0){
            d=-d;
        }

        for(int i=d;i<d+5;i++){
            l= new Leaf("Fucking Birthday on Date "+getDate(i));
            list2.addTask(l);
        }
        list.addTask(list2);
        list.addTask(list1);
        list.print();
    }
}
