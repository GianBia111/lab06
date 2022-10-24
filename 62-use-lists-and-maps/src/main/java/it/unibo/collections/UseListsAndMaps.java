package it.unibo.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {

    private UseListsAndMaps() {
    }

    /**
     * @param s
     *            unused
     */
    public static void main(final String... s) {
        List<Integer> _alint =new ArrayList<>();
        for(int i=1000; i<2000; i++){
            _alint.add(i);
        }

        List<Integer> _llint= new LinkedList<>(_alint);

        int tmp;
        tmp=_alint.get(0);
        _alint.set(0, _alint.get(_alint.size()-1));
        _alint.set((_alint.size()-1), tmp);

        /* 
        ListIterator<Integer> li= _liint.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());
        }
        */

        for(Integer i : _alint){
            System.out.println(i);
        }


        long time = System.nanoTime();
        for(int i=0; i<100000; i++){
            _alint.set(0, i);
        }
        time = System.nanoTime() - time;

        System.out.println("Time required in order to add 100000 elelements to an array list: "+time);

        time=System.nanoTime();
        for(int i=0; i<100000; i++){
            _llint.set(0, i);
        }
        time = System.nanoTime() - time;

        System.out.println("Time required in order to add 100000 elelements to a linked list: "+time);
        /*
         * 1) Create a new ArrayList<Integer>, and populate it with the numbers
         * from 1000 (included) to 2000 (excluded).
         */
        /*
         * 2) Create a new LinkedList<Integer> and, in a single line of code
         * without using any looping construct (for, while), populate it with
         * the same contents of the list of point 1.
         */
        /*
         * 3) Using "set" and "get" and "size" methods, swap the first and last
         * element of the first list. You can not use any "magic number".
         * (Suggestion: use a temporary variable)
         */
        /*
         * 4) Using a single for-each, print the contents of the arraylist.
         */
        /*
         * 5) Measure the performance of inserting new elements in the head of
         * the collection: measure the time required to add 100.000 elements as
         * first element of the collection for both ArrayList and LinkedList,
         * using the previous lists. In order to measure times, use as example
         * TestPerformance.java.
         */
        /*
         * 6) Measure the performance of reading 1000 times an element whose
         * position is in the middle of the collection for both ArrayList and
         * LinkedList, using the collections of point 5. In order to measure
         * times, use as example PerfTest.java.
         */
        /*
         * 7) Build a new Map that associates to each continent's name its
         * population:
         *
         * Africa -> 1,110,635,000
         *
         * Americas -> 972,005,000
         *
         * Antarctica -> 0
         *
         * Asia -> 4,298,723,000
         *
         * Europe -> 742,452,000
         *
         * Oceania -> 38,304,000
         */
        /*
         * 8) Compute the population of the world
         */
    }
}
