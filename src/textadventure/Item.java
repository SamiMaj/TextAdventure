package textadventure;

import java.io.Serializable;

/**
 *
 * @author Elinor
 */
public class Item implements Serializable {
    private int weight;
    private String name;
    public Item(int weight, String name){
      this.weight = weight;
      this.name = name;
    }
    public String getName(){
        return name;
    }
    public int getWeight(){
        return weight;
    }
   
}
