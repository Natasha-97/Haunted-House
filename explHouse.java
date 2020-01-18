package hauntedclass;

import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class explHouse {

    path display = new path();

    String nameP;
    String currentRoom;
    String backPack;//object that the backpack will contain
    ImageIcon name = new ImageIcon("whoareyou.jpg");
    ImageIcon House = new ImageIcon("House neightbor.jpg");
    ImageIcon icon = new ImageIcon("front door.jpg");
    ImageIcon Bath = new ImageIcon("bathroom 1.jpg ");
    ImageIcon livingR = new ImageIcon("living room.jpg");
    ImageIcon chest = new ImageIcon("chest.jpg");
    ImageIcon ghost = new ImageIcon("ghost.gif");
    ImageIcon mirror = new ImageIcon("Mirror.jpg");
    ImageIcon mcBloody = new ImageIcon("bloody macblood.gif");
    ImageIcon Bath2 = new ImageIcon("bathroom 2.gif");
    ImageIcon shower = new ImageIcon("fingers.gif");
    ImageIcon shower2 = new ImageIcon("steam.gif");
    ImageIcon dinningR = new ImageIcon("DiningRoom.jpg");
    ImageIcon diningR2 = new ImageIcon("candelabra.gif");
    ImageIcon shadow = new ImageIcon("shadow.gif");
    ImageIcon kitchen = new ImageIcon("kitchen.jpg");
    ImageIcon kitchen2 = new ImageIcon("plate.gif");
    ImageIcon cabinet = new ImageIcon("passout.gif");
    ImageIcon cabinet2 = new ImageIcon("light.gif");
    ImageIcon refrigerator = new ImageIcon("refrigerator.jpg");
    ImageIcon refrigerator2 = new ImageIcon("poison.gif");
    ImageIcon pantry = new ImageIcon("pantry.jpg");
    ImageIcon pantry2 = new ImageIcon("box.gif");
    ImageIcon run = new ImageIcon("run.gif");
    ImageIcon broom = new ImageIcon("broom.png");
    ImageIcon stairs = new ImageIcon("stairs.jpg");
    ImageIcon bedroom1 = new ImageIcon("bedroom1.jpg");
    ImageIcon mBedr = new ImageIcon("master bedroom.jpg");
    ImageIcon rockingC = new ImageIcon("rockingchair.gif");
    ImageIcon diamond = new ImageIcon("diamond.gif");
    ImageIcon bedroom2 = new ImageIcon("bedroom2.jpg");
    ImageIcon dollhouse = new ImageIcon("dollh.gif");
    ImageIcon dollhouse2 = new ImageIcon("housed.gif");
    ImageIcon dresser = new ImageIcon("dresser.gif");
    ImageIcon dresser2 = new ImageIcon("frozen.png");
    ImageIcon masterBath = new ImageIcon("masterBathroom.jpg");
    ImageIcon map = new ImageIcon("Map.jpg");
    ImageIcon genie = new ImageIcon("genie.gif");
    ImageIcon genie2 = new ImageIcon("lamp.gif");
    ImageIcon bleed = new ImageIcon("ears.gif");
    ImageIcon kid = new ImageIcon("swing.gif");
    ImageIcon ending = new ImageIcon("Laugh.gif");
    //pictures for all the objects and rooms
    
    String Item1 = "";
    String Item2 = "";
    String Item3 = "";
    String Item4 = "";
    String Item5 = "";
    String Item6 = "";
    
    String[] x ={Item1, Item2};
    int i = 0;
    

    public void getName(String nameP) {//Welcome message with the map of the house

        nameP = (String) JOptionPane.showInputDialog(null, "What is your Name?",
                "I command you", JOptionPane.INFORMATION_MESSAGE,
                name, null, " ");

        JOptionPane.showMessageDialog(null, "Welcome to your Haunted "
                + "House aventure " + nameP + ".\nLet's begin.\nYou are"
                + " entering your creepy neighbor's house with only your \n"
                + "backpack and your luck.\nBe careful with what you might "
                + "encounter in your way.\nEverytime you touch something it"
                + " will be save in your backpack.\nHave fun!!",
                "I KNOW ALL ABOUT YOU", JOptionPane.INFORMATION_MESSAGE, House);

        JOptionPane.showMessageDialog(null, "Here is your map\nThis will"
                + " guide you through the house.",
                "Buuuu!!", JOptionPane.INFORMATION_MESSAGE, map);
    }

    public String frontDoor(String currentRoom) {//start of the game

        String[] choices = {"Living Room", "Dining Room", "Stairs"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Front Door now. \n Where would you like to go "
                + "now?", "Front Door", JOptionPane.QUESTION_MESSAGE, icon,
                choices, choices[1]);
        return currentRoom;
    }

    public String passToLR(String currentRoom) {//options on the living room

        String[] choices = {"Open the Chest", "Go to the Bathroom",
            "End Game in the Living Room"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Living Room now. \n We have a Old chest here.\n"
                + " What would you like to do now?",
                " Living Room", JOptionPane.QUESTION_MESSAGE, livingR, choices,
                choices[1]);

        return currentRoom;
    }

    public void ChoiceLR1(String currentRoom) {//when you choose the chest this happens

        JOptionPane.showMessageDialog(null, null,
                "Buuuu!!", JOptionPane.INFORMATION_MESSAGE, ghost);

        JOptionPane.showMessageDialog(null, "Some Ghosts just scared you to"
                + " death.\n You died by a heart attack. \nThat sucks.",
                "Stupid Ghosts", JOptionPane.INFORMATION_MESSAGE, chest);

        x[i] = "A Chest";
        i++;
        

    }
//to explore the bathroom of the first or second floor
    //three were needed for the differents path the the user might take
    //B is the first floor
    public String passToB() {

        String[] choices = {"Look yourself in the Mirror",
            "Look into the Shower"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bathroom now.\n You got a Mirror and a Shower "
                + "to explore.\nWhat would you like to do now?","Bathroom",
                JOptionPane.QUESTION_MESSAGE, Bath, choices,choices[1]);

        return currentRoom;
    }
//second floor when you enter through bedroom 1
    public String passToB2() {

        String[] choices = {"Look yourself in the Mirror",
            "Look into the Shower", "Go to Bedroom 2"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bathroom now.\n You got a Mirror and a Shower "
                + "to explore.\n What would you like to do now?","Bathroom",
                JOptionPane.QUESTION_MESSAGE, Bath, choices,choices[1]);

        return currentRoom;
    }
//second floor when you enter through bedroom 2
    public String passToB3() {

        String[] choices = {"Look yourself in the Mirror",
            "Look into the Shower", "Go to Bedroom 1"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bathroom now.\n You got a Mirror and a Shower "
                + "to explore.\n What would you like to do now?","Bathroom", 
                JOptionPane.QUESTION_MESSAGE, Bath, choices,choices[1]);

        return currentRoom;
    }
    //had to created double classes for both the objects of the first and the 
    //second from to be able to display where each end in the map at the end
//when you choose the Mirror this happens
    public void ChoiceB11(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Ahhhh!!!", JOptionPane.INFORMATION_MESSAGE, mirror);

        JOptionPane.showMessageDialog(null,
                "There is a Bloody face looking righ back at you!!!\n"
                + "Bloody McBloody over there attacked you.\n See "
                + "ya in the other life", "Runnn!!",
                JOptionPane.INFORMATION_MESSAGE, mcBloody);
        x[i] = "A Mirror";
        i++;
    }
//when you choose the Shower this happens
    public void ChoiceB12(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Ahhhh!!!", JOptionPane.INFORMATION_MESSAGE, shower2);

        JOptionPane.showMessageDialog(null,
                "The room suddenly steams up ..... and you feel some fingers"
                + " touching the back of your neck. \n You tried to run but the"
                + " fingers grabbed you tighter and choked you, BYE BYE", "The "
                + "water is cold...", JOptionPane.INFORMATION_MESSAGE, shower);
        backPack = "A Shower";

    }

    public void ChoiceB21(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Ahhhh!!!", JOptionPane.INFORMATION_MESSAGE, mirror);

        JOptionPane.showMessageDialog(null,
                "There is a Bloody face looking righ back at you!!!\n"
                + "Bloody McBloody over there attacked you.\n See "
                + "ya in the other life", "Runnn!!",
                JOptionPane.INFORMATION_MESSAGE, mcBloody);
        backPack = "A Mirror ";
    }

    public void ChoiceB22(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Ahhhh!!!", JOptionPane.INFORMATION_MESSAGE, shower2);

        JOptionPane.showMessageDialog(null,
                "The room suddenly steams up ..... and you feel some fingers"
                + " touching the back of your neck. \n You tried to run but the"
                + " fingers grabbed you tighter and choked you, BYE BYE", "The "
                + "water is cold...", JOptionPane.INFORMATION_MESSAGE, shower);
        backPack = "A Shower ";

    }
//choices when you enter the dining room
    public String passToDR() {

        String[] choices = {"Touch the Candelabra", "Go to the Kitchen"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Dining Room now.The is only a candelabra here"
                + "\n What would you like to do now?", "Dining Room",
                JOptionPane.QUESTION_MESSAGE, dinningR, choices, choices[1]);

        return currentRoom;

    }
//when you choose the candelabra
    public void ChoiceDR1(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Light it up say the ghost!!!", JOptionPane.INFORMATION_MESSAGE,
                diningR2);

        JOptionPane.showMessageDialog(null,
                "Suddenly light up by themselves and see a death shadow!.\n"
                + "The shadow is not so friendly and chase you out of "
                + "the house.\nRUUUNN!!!!", "Get the hell out!!",
                JOptionPane.INFORMATION_MESSAGE, shadow);
        backPack = "A Candelabra";

    }
//when you enter the Kitchen
    public String passToK() {

        String[] choices = {"Open the Cabinet", "Open the Refrigerator",
            "Go to the Pantry"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Kitchen now. \n What would you like to do now?",
                "Kitchen", JOptionPane.QUESTION_MESSAGE, kitchen, choices,
                choices[1]);

        return currentRoom;

    }
//when you choose the Cabinet
    public void ChoiceK1() {

        JOptionPane.showMessageDialog(null, null,
                "Ditch them if you can!!!", JOptionPane.INFORMATION_MESSAGE,
                kitchen2);
        JOptionPane.showMessageDialog(null, null,
                "Careful with your head!!", JOptionPane.INFORMATION_MESSAGE,
                cabinet);

        JOptionPane.showMessageDialog(null,
                "The dishes and glasses start flying at you as soon as you open"
                + " the door. You get hit in the head and feel yourself "
                + "start moving towards a light. \n Following lights "
                + "suck.\nThey are so bright!! ", "What do you see?",
                JOptionPane.INFORMATION_MESSAGE, cabinet2);
        backPack = "A Cabinet";
    }
//when you choose the Refrigerator
    public void ChoiceK2(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Delicious Right?", JOptionPane.INFORMATION_MESSAGE,
                refrigerator);

        JOptionPane.showMessageDialog(null, "Open it and find some delicious "
                + "soul food. \n Good job genius you fell for it, and got "
                + "poisoned", "Duhhh!!", JOptionPane.INFORMATION_MESSAGE,
                refrigerator2);
        backPack = "A Refrigerator";

    }
//when you enter the pantry
    public String passToP() {
        String[] choices = {"Open Dusty recipe Box", "Touch the Broom", 
            "End Game in the Pantry"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Pantry now. \n What would you like to do now?",
                "Pantry", JOptionPane.QUESTION_MESSAGE, pantry, choices,
                choices[1]);

        return currentRoom;

    }
//when you choose the box
    public void ChoiceP1(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Don't look what you don't want to find!!",
                JOptionPane.INFORMATION_MESSAGE,
                pantry2);
        JOptionPane.showMessageDialog(null, "You open it up and a recipe for "
                + "chocolate devils food cake appears out of no where.\n You "
                + "got freaked out and runned for your life, see ya later!!!",
                "Chicken!!", JOptionPane.INFORMATION_MESSAGE, run);
        backPack = "Dusty recipe Box";

    }
//when you choose the broom
    public void ChoiceP2(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "is flyinggg!!!",
                JOptionPane.INFORMATION_MESSAGE,
                broom);
        JOptionPane.showMessageDialog(null, "Flies up in the air as soon as you"
                + " touch it.\n That Mad Broom is not playing, it stared "
                + "hitting you until you are uncouncious.\nNight night",
                "How rude!!", JOptionPane.INFORMATION_MESSAGE, cabinet);
        backPack = "A Broom";
    }
//when you choose go up stairs
    public String passToStairs() {

        String[] choices = {"Master Bedroom",
            "Bedroom 1", "Bedroom 2"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Second Floor now. \n Where would you like to "
                + "go now?", " Stairs", JOptionPane.QUESTION_MESSAGE, stairs,
                choices, choices[1]);

        return currentRoom;
    }
//when you enter the Master bedroom
    public String passToMB() {

        String[] choices = {"Open the Jewelry Box", "Go to the Master Bathroom",
            "End Game in the Master Bedroom"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Master Bedroom now.\nThere is Jewelry Box here."
                + "\n What would you like to do now?", "Master Bedroom", 
                JOptionPane.QUESTION_MESSAGE, mBedr, choices, choices[1]);

        return currentRoom;
    }
//when you choose the Jewelry
    public void ChoiceMB1(String currentRoom) {

        JOptionPane.showMessageDialog(null, "You find the cursed Hope Diamond"
                + " and feel your doom.\n Nice,you are cursed, good luck "
                + "staying alive.", "Is Beautiful , isn't it?",
                JOptionPane.INFORMATION_MESSAGE, diamond);
        backPack = "Some Jewelry";

    }
//when you enter the Master Bathroom
    public String passToMBth() {

        String[] choices = {"Look the Intricate Oil Lamp", "Look into "
                + "the Shower"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Master Bathroom now.\nThere is a Lamp and a "
                + "Shower. \nWhat would you like to do now?","Master Bathroom",
                JOptionPane.QUESTION_MESSAGE, masterBath, choices,choices[1]);

        return currentRoom;
    }
//when you choose the oil lamp
    public void ChoiceMBth1(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "What is it with you touching things?",
                JOptionPane.INFORMATION_MESSAGE,
                genie);

        JOptionPane.showMessageDialog(null,
                "Rub the lamp and a genie pops out who says he’ll grant you 3 "
                + "wishes.\n is a TRAP, one of your wishes made you dissapeared"
                + " from existence.", "Point for the Geniee!!",
                JOptionPane.INFORMATION_MESSAGE, genie2);
        backPack = "An Intricate Oil Lamp";
    }
//when you choose the shower
    public void ChoiceMBth2(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Ahhhh!!!", JOptionPane.INFORMATION_MESSAGE, Bath2);

        JOptionPane.showMessageDialog(null,
                "Suddenly hear singing in the shower, but no one is there.\n"
                + "That voice is deadly, your ears started bleeding.\n"
                + "Not a fan of the Opera, are you?", "Such a good singer!!",
                JOptionPane.INFORMATION_MESSAGE, bleed);
        backPack = " A Shower";
    }
//when you enter bedroom 1
    //had to created two method for the differents paths
    public String passToBr1() {

        String[] choices = {"Touch the Rocking chair","Look through the Window",
            "Go to the Bathroom"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bedroom 1 now.\nThere are a Rocking Chair and "
                + "a wide Window. \n What would you like to do now?","Bedroom 1",
                JOptionPane.QUESTION_MESSAGE, bedroom1,choices,choices[1]);

        return currentRoom;

    }

    public String passToBr12() {

        String[] choices = {"Touch the Rocking chair","Look through the Window",
            "Go to Master Bedroom"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bedroom 1 now.\nThere are a Rocking Chair and "
                + "a wide Window.\nWhat would you like to do now?",
                "Bedroom 1", JOptionPane.QUESTION_MESSAGE, bedroom1, choices,
                choices[1]);

        return currentRoom;

    }
//when you choose the rocking chair
    public void ChoiceBr11(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Do you heard a baby?", JOptionPane.INFORMATION_MESSAGE,
                rockingC);

        JOptionPane.showMessageDialog(null,"Chair starts rocking by itself with"
                + " no one in it.\nYou tried to run away but fall "
                + "on the stairs to your death.", "Careful with the S..."
                + "nevermind.",
                JOptionPane.INFORMATION_MESSAGE, run);
        backPack = "A Rocking Chair";

    }
//when you choose the window
    public void ChoiceBr12(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "That looks fun!!"
                + "", JOptionPane.INFORMATION_MESSAGE,
                kid);
        JOptionPane.showMessageDialog(null, "See a child outside on a swing who"
                + " suddenly disappears.\nYou runned away from the house as"
                + " fast as you could.\nSee yaaa!!", "Don't you want to play?",
                JOptionPane.INFORMATION_MESSAGE, run);
        backPack = "A Window";

    }
//when you enter bedroom two
    //again two methods for different paths
    public String ChoiceBr21() {

        String[] choices = {"Play with the Doll House", "Open the Dresser", 
            "Go to Master Bedroom"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bedroom 2 now.\nThere are a Doll House and an"
                + " old Dresser. \n What would you like to do now?","Bedroom 2",
                JOptionPane.QUESTION_MESSAGE, bedroom2,choices,choices[1]);

        return currentRoom;

    }

    public String passToBr22() {

        String[] choices = {"Play with the Doll House", "Open the Dresser",
            "Go to the Bathroom"};
        currentRoom = (String) JOptionPane.showInputDialog(null,
                "You are in the Bedroom 2 now.\nThere are a Doll House and an"
                + " old Dresser.\n What would you like to do now?","Bedroom 2",
                JOptionPane.QUESTION_MESSAGE, bedroom2,choices, choices[1]);

        return currentRoom;

    }
//when you choose the doll house
    public void ChoiceBr22(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "How fun!!",
                JOptionPane.INFORMATION_MESSAGE,
                dollhouse2);
        JOptionPane.showMessageDialog(null, "The dolls start dancing on their"
                + " own.\nSuddenly all of them started looking at you, and your"
                + " air was cut.\nYou couldn't breath, slowly you fell into "
                + "the darkness.\nWhat rude dolls!!", "Beauty can be tricky",
                JOptionPane.INFORMATION_MESSAGE, dollhouse);
        backPack = "A Doll House";

    }
//when you choose the dresser
    public void ChoiceBr23(String currentRoom) {

        JOptionPane.showMessageDialog(null, null,
                "Be careful with....never mind", JOptionPane.INFORMATION_MESSAGE,
                dresser);
        JOptionPane.showMessageDialog(null, "A ghost flies out of the dresser "
                + "as soon as you open it \nand goes right through your body.\n"
                + "You felt a strong cold surrounding you body, and fell to\n"
                + " the floor, freezed to death.", "Is kinda cold here...",
                JOptionPane.INFORMATION_MESSAGE, dresser2);
        backPack = "A Dresser";

    }
//to be able to get the right image and message at the end i needed 4 methods
    public void finishGame1(String currentRoom) {

        backPack = "End Game 1";
    }

    public void finishGame2(String currentRoom) {
        backPack = "End Game 2";
    }

    public void finishGame3(String currentRoom) {

        backPack = "End Game 3";

    }

    public void endGame() {

        ImageIcon end = display.endImage(backPack);

        if ((backPack.equals("End Game 1")) || (backPack.equals("End Game 2"))
                || (backPack.equals("End Game 3"))) {

            JOptionPane.showMessageDialog(null, "You exit the game.\nWise "
                    + "decision.\nUnfortunally you left empty handed.\n"
                    + "Looked at the Map to see how far you made it",
                    "You LOSE", JOptionPane.INFORMATION_MESSAGE, end);
        } else {
            for( int g = 0 ; g < x.length ; g++){
                
                backPack = backPack + ", " + x[g];
                
            }
            JOptionPane.showMessageDialog(null, "Sorry you died, what a bad "
                    + "luck you have.\n Who told you to touch things in a "
                    + "Haunted house.\nAnyway you still got something in your "
                    + "backpack, you grabbed:\n" + backPack + "\nLook at the"
                    + " Map to see how far you made it!!","You LOSE", 
                    JOptionPane.INFORMATION_MESSAGE, end);
            
           
        }

       
        JOptionPane.showMessageDialog(null, "Thank you for playing!! \n Come "
                + "back if you want to die...", "BYE BYE, See ya never",
                JOptionPane.INFORMATION_MESSAGE, ending);
    }

}
