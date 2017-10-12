/**
 * 
 */
package project1;

import bag.BagInterface;
import bag.Bag; 
import CS2114.TextShape; 
import java.util.Random;
import CS2114.Window; 
import CS2114.Button; 
import CS2114.WindowSide;

/**
 * @author Mykayla Fernandes
 * @version 2016.04.06
 *
 */
public class DisplayCollection {
    
    private BagInterface<String> itemBag;
    final public static String[] STRINGS = {"red circle", "blue circle", "red square", "blue square"};
    
    public DisplayCollection()
    {
        this.itemBag = new Bag<>();
        Random random = new Random();
        int count = random.nextInt(10) + 5;
        for (int i = 0; i < count; i++)
        {
            int rand = random.nextInt(STRINGS.length) + 0;
            itemBag.add(STRINGS[rand]);
        }
        
    }
    
    public BagInterface<String> getItemBag()
    {
        return itemBag;
        
    }

}
