package testy2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Marta Pawlik on 25.02.2016.
 */

public class GenerujISortuj {
    
    private Random random = new Random();
    private ArrayList<Integer> numbers = new ArrayList<>();
    
    public void Generuj(){
        for (int i = 0; i < (int)1e7; i++) {
            this.numbers.add(random.nextInt());
        }
    }
    
    public void Sortuj(){
        Collections.sort(numbers);
    }


}
