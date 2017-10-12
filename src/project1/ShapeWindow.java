package project1;

import bag.Bag; 
import bag.BagInterface;
import CS2114.TextShape;

import java.awt.Color;
import java.util.Random;
import CS2114.Window; 
import CS2114.Button; 
import CS2114.WindowSide;

/**
 * @author Mykayla Fernandes
 * @version 2016.04.06
 *
 */


public class ShapeWindow implements BagInterface<String> {
    
    private Window window;
    private TextShape textShape;
    private Button quitButton;
    private Button chooseButton;
    private BagInterface<String> itemBag;
    
    public ShapeWindow(BagInterface<String> shape)
    {
        window = new Window();
        window.setTitle("Project1");
        itemBag = shape;
        quitButton = new Button("Quit");
        quitButton.onClick(this, "clickedQuit");
        window.addButton(quitButton, WindowSide.NORTH);
        chooseButton = new Button("Choose");
        chooseButton.onClick(this, "clickedChoose");
        window.addButton(chooseButton, WindowSide.SOUTH);
        textShape = new TextShape(0, 0, " ");
        window.addShape(textShape);
        
    }
    
    
    public java.lang.String setTitle(String window)
    {
        return "Project1";    
    }
    
   public void clickedQuit(Button quit)
    {
       System.exit(0);        
    }
    
    public void clickedChoose(Button choose)
    {
        //remove methods usually returns what was removed
        //this means you can still use it, like we are here
        
        if (!itemBag.isEmpty())
        {
            textShape.setText(itemBag.remove());  
        }
        else
        {
            textShape.setText("No More Items.");
        }
        colorText();
        centerText();
        window.repaint();
    }
    
    private void colorText()
    {
        
        if (textShape.getText().contains("red"))
        {
            textShape.setForegroundColor(Color.RED);
        }
        else if (textShape.getText().contains("blue"))
        {
            textShape.setForegroundColor(Color.BLUE);
        }
        else 
        {
            textShape.setForegroundColor(Color.BLACK);
        }
    }
    
    private void centerText()
    {
        
        int textVt = textShape.getHeight()/2;
        int textHz = textShape.getWidth()/2;
        int vert = (window.getGraphPanelHeight()/2);
        int horiz = (window.getGraphPanelWidth()/2);
        textShape.moveTo(horiz - textHz, vert - textVt);
              
    }
    



    @Override
    public boolean add(String newEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean contains(String anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int getCurrentSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getFrequencyOf(String anEntry) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String remove() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean remove(String anEntry) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public String[] toArray() {
        // TODO Auto-generated method stub
        return null;
    }}
