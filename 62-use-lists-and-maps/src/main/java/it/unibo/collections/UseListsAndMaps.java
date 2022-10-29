package it.unibo.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/**
 * Example class using {@link List} and {@link Map}.
 *
 */
public final class UseListsAndMaps {
    private static final long AFRICA_POP = 1_110_635_000L;
    private static final long AMERICAS_POP = 972_005_000L;
    private static final long ANTARCTICA_POP = 0L;
    private static final long ASIA_POP = 4_298_723_000L;
    private static final long EUROPE_POP = 742_452_000L;
    private static final long OCEANIA_POP= 38_304_000L;

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

        Map<String, Long> map =new HashMap<>();
        map.put("Africa", UseListsAndMaps.AFRICA_POP);
        map.put("Americas", UseListsAndMaps.AMERICAS_POP);
        map.put("Antartica", UseListsAndMaps.ANTARCTICA_POP);
        map.put("Asia", UseListsAndMaps.ASIA_POP); 
        map.put("Europe", UseListsAndMaps.EUROPE_POP);
        map.put("Oceania", UseListsAndMaps.OCEANIA_POP); 

        Long tot_population=0L;
        for(Long population_amount : map.values()){
            tot_population+=population_amount;
        }

        System.out.println("Popolazione totoale: "+tot_population);
        
    }
}
