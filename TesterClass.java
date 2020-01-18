//********************************************************************************
// PANTHERID:  6222580
// CLASS: COP 2210 – [Fall 2019]
// ASSIGNMENT # 3
// DATE: 10/31/2019
//
// I hereby swear and affirm that this work is solely my own, and not the work 
// or the derivative of the work of someone else.
//********************************************************************************
package hauntedclass;

public class TesterClass {

    public static void main(String[] args) {

        String name = " ";
        String room = " ";
        String Object = " ";
        String choice;
        explHouse myTravel = new explHouse();//the object to called each room
        path Image = new path();
        
        myTravel.getName(name);

        choice = myTravel.frontDoor(room);//front door method

        if (choice.equals("Living Room")) {//travel to each room and its objects

            choice = myTravel.passToLR(room);

            if (choice.equals("Open the Chest")) {

                myTravel.ChoiceLR1(room);
                
                choice = myTravel.passToLR(room);
                
                if(choice.equals("Go to the Bathroom")){
                    
                    choice = myTravel.passToB();
                
                if (choice.equals("Look yourself "
                        + "in the Mirror")) {

                    myTravel.ChoiceB11(room);
                }
                }
            
          
        
            } else if(choice.equals("Go to the Bathroom")){

                choice = myTravel.passToB();
                if (choice.equals("Look yourself "
                        + "in the Mirror")) {

                    myTravel.ChoiceB11(room);

                } else if (choice.equals("Look into the Shower")) {

                    myTravel.ChoiceB12(room);
                }
            }else if(choice.equals("End Game in the Living Room")){
                    
                    myTravel.finishGame1(room);
                    
                    }
    

        } else if (choice.equals("Dining Room")) {

            choice = myTravel.passToDR();

            if (choice.equals("Touch the Candelabra")) {

                myTravel.ChoiceDR1(room);
                        

            } else if (choice.equals("Go to the Kitchen")) {

                choice = myTravel.passToK();

                if (choice.equals("Open the Cabinet")) {

                    myTravel.ChoiceK1();
                } else if (choice.equals("Open the Refrigerator")) {

                    myTravel.ChoiceK2(room);

                } else if (choice.equals("Go to the "
                        + "Pantry")) {

                    choice = myTravel.passToP();

                    if (choice.equals("Open Dusty recipe "
                            + "Box")) {

                        myTravel.ChoiceP1(room);

                    } else if (choice.equals("Touch the Broom")) {

                        myTravel.ChoiceP2(room);

                    }else if(choice.equals("End Game in the Pantry")){
                        
                        myTravel.finishGame2(room);
                    }
                }
            }

        } else if (choice.equals("Stairs")) {

            choice = myTravel.passToStairs();

            if (choice.equals("Master Bedroom")) {

                choice = myTravel.passToMB();

                if (choice.equals("Open the Jewelry Box")) {

                    myTravel.ChoiceMB1(room);

                } else if (choice.equals("Go to the Master "
                        + "Bathroom")) {

                    choice = myTravel.passToMBth();

                    if (choice.equals("Look the Intricate Oil Lamp")) {

                        myTravel.ChoiceMBth1(room);

                    } else if (choice.equals("Look into the Shower")) {

                        myTravel.ChoiceMBth2(room);

                    }
                }else if(choice.equals("End Game in the Master Bedroom")){
                    
                    myTravel.finishGame3(room);
                    
                }

            } else if (choice.equals("Bedroom 1")) {

                choice = myTravel.passToBr1();

                if (choice.equals("Touch the Rocking chair")) {

                    myTravel.ChoiceBr11(room);

                } else if (choice.equals("Look through the Window")) {

                    myTravel.ChoiceBr12(room);

                } else {

                    choice = myTravel.passToB2();

                    if (choice.equals("Look yourself in the "
                            + "Mirror")) {

                        myTravel.ChoiceB21(room);

                    } else if (choice.equals("Look into the "
                            + "Shower")) {

                        myTravel.ChoiceB22(room);

                    } else {

                        choice = myTravel.ChoiceBr21();

                        if (choice.equals("Play with the Doll House")) {

                            myTravel.ChoiceBr22(room);

                        } else if (choice.equals("Open the Dresser")) {

                            myTravel.ChoiceBr23(room);

                        } else {

                                choice = myTravel.passToMB();

                                if (choice.equals("Open the Jewelry Box")) {

                                    myTravel.ChoiceMB1(room);

                                } else if (choice.equals("Go to the Master "
                                        + "Bathroom")) {

                                    choice = myTravel.passToMBth();

                                    if (choice.equals("Look the Intricate "
                                            + "Oil Lamp")) {

                                        myTravel.ChoiceMBth1(room);

                                    } else if (choice.equals("Look into the "
                                            + "Shower")) {

                                        myTravel.ChoiceMBth2(room);

                                    }
                                }else{
                                    myTravel.finishGame3(room);
                                }
                            } 
                        }
                    }

            } else if (choice.equals("Bedroom 2")) {

                choice = myTravel.passToBr22();

                if (choice.equals("Play with the Doll House")) {

                    myTravel.ChoiceBr22(room);

                } else if (choice.equals("Open the Dresser")) {

                    myTravel.ChoiceBr23(room);

                } else {

                    choice = myTravel.passToB3();

                    if (choice.equals("Look yourself in the Mirror")) {

                        myTravel.ChoiceB21(room);

                    } else if (choice.equals("Look into the Shower")) {

                        myTravel.ChoiceB22(room);

                    } else {

                        choice = myTravel.passToBr12();

                        if (choice.equals("Touch the Rocking chair")) {

                            myTravel.ChoiceBr11(room);

                        } else if (choice.equals("Look through the Window")) {

                            myTravel.ChoiceBr12(room);

                        } else {

                            choice = myTravel.passToMB();

                            if (choice.equals("Open the Jewelry Box")) {

                                myTravel.ChoiceMB1(room);

                            } else if (choice.equals("Go to the Master "
                                    + "Bathroom")) {

                                choice = myTravel.passToMBth();

                                if (choice.equals("Look the Intricate Oil "
                                        + "Lamp")) {

                                    myTravel.ChoiceMBth1(room);

                                } else if (choice.equals("Look into the "
                                        + "Shower")) {

                                    myTravel.ChoiceMBth2(room);
                                  

                                }
                                
                            }else{
                                myTravel.finishGame3(room);
                            
                            }

                        }

                    }
                }
            }
            Image.endImage(Object);
        }myTravel.endGame();
    }  
}



