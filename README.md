# ArrayVsArrayList
Hello Class,

Arrays and Array Lists are vital for programming in Java. When creating an Array you will use square brackets. You can use Strings, doubles, integers, etc. For example to create an array of strings, you can go like this: 

String[] states = {"Arkansas", "California", "Delaware", "Florida"};

From there starting left to right, Arkansas is 0, Florida is 3. So you pull from the array you would type this:

System.out.println(states[1]);

This would output California since it is in the 1st slot in the array.

The biggest difference between Arrays and ArrayLists are that Arrays are unable to have their size changed. IN an ArrayList you are able to add and remove elements within it. For an ArrayList you need to import the ability to do so. This can be done by typing:

import java.util.ArrayList;

When you go to add elements into the Array List, you will need to use the add() method. So it would look like this:

import java.util.ArrayList;

public class main{
    public static void main(String[] args){
        ArrayList<String> states = new ArrayList<String>();
        states.add("California");
        states.add("Florida");
        states.add("Arizona");
        states.add("Alaska");
        System.out.println(states);
    }
}

To just get one element from an ArrayList you can use the get() method like so:

states.get(2);

This will get the state "Arizona". There are some more commands you can use such as the remove(); method to remove an elemet.
The clear(); method to clear the array.
The set(); method to change an element.
The size(); method to see how many elements are in the array.