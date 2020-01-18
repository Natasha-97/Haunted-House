
package hauntedclass;

import javax.swing.ImageIcon;


public class path {
    
      public ImageIcon endImage(String object){
         
         //class exclusive to select the end pictures
        ImageIcon end = null;
        
        if ((object.equals("A Chest"))|| (object.equals("End Game 1"))){
            
        end = new ImageIcon("finishLR.jpg");
            
        }else if(object.equals("A Mirror")||(object.equals("A Shower"))){
          
         end = new ImageIcon("finishB1.jpg");
         
         }else if(object.equals("A Mirror ")||(object.equals("A Shower "))){
          
         end = new ImageIcon("finishB2.jpg");
       
        }else if(object.equals("A Candelabra")){
            
            end = new ImageIcon("finishDR.jpg");
            
        }else if((object.equals("A Cabinet"))||
                (object.equals("A Refrigerator"))){
            
            end = new ImageIcon("finishK.jpg");
            
        }else if((object.equals("Dusty recipe Box"))||
                (object.equals("A Broom"))|| (object.equals("End Game 2"))){
            
            end = new ImageIcon("finishP.jpg");
            
        }else if(object.equals("Some Jewelry")||(object.equals("End Game 3"))){
            
            end = new ImageIcon("finishMB.jpg");
            
        }else if((object.equals("An Intricate Oil Lamp"))
                ||(object.equals(" A Shower"))){
            
            end = new ImageIcon("finishMBth.jpg");
            
        }else if((object.equals("A Rocking Chair"))||
                (object.equals("A Window"))){
            
            end = new ImageIcon("finishBr1.jpg");
            
        }else if((object.equals("A Doll House"))||
                (object.equals("A Dresser"))){
            
            end = new ImageIcon("finishBr2.jpg");    
            
        }
        
        return end;
    }

}
