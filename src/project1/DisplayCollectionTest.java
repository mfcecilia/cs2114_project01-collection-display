package project1;

import bag.Bag; 
import bag.BagInterface;
import CS2114.TextShape; 
import java.util.Random;
import CS2114.Window; 
import CS2114.Button; 
import CS2114.WindowSide;

//IMPORTANT! you need modifiers in a class, but not within methods
//ex: private itemBag
//the private declaration doesn't need to exist when being created within a method

public class DisplayCollectionTest extends student.TestCase {
    
    public void setUp() {
        
        //intentionally left empty
        
    }
    
    /**
     * test that the contents are only those 
     * found in the STRINGS array
     */
    
    public void testBagContents() {
        DisplayCollection displayTest = new DisplayCollection();
        BagInterface<String> testBag;
        testBag = displayTest.getItemBag();
        
        //loop through test bag
        for (int i=0; i < testBag.getCurrentSize(); i++)
        {
            //loop through strings to see if they are in the test bag
           for (int j=0; j < displayTest.STRINGS.length; j++)
           {
               //store in a boolean. if it's matching, it returns true, therefore, assert true
               boolean items = testBag.contains(displayTest.STRINGS[j]);
               assertTrue(items);
           }
          
            
            
        }
        
    }
    
    /**
     * check that the size is between 5 and 15
     */
    
    public void testBagSize() {
        
        DisplayCollection displayTest = new DisplayCollection();
        BagInterface<String> testBag; 
        testBag = displayTest.getItemBag();
        
        for (int i = 0; i < 20; i++)
        {
            assertTrue(testBag.getCurrentSize() <= 15);
            assertTrue(testBag.getCurrentSize() >= 5);
        }  
        
    }

}
