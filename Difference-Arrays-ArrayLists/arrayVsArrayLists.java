import java.util.ArrayList;

public class arrayVsArrayLists {
    public static void main(String[] args) {

        //Here we can see the add command in action which cannot be done with a regular array.
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Florida");
        states.add("Arizona");
        states.add("Alaska");
        System.out.println(states);

        //This will print only California
        String[] moreStates = {"Arkansas", "California", "Delaware", "Florida"};
        System.out.println(moreStates[1]);
    }
}