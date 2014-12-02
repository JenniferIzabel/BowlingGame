package Model;

//(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)
import View.GUI;

public class MvcExample {
	//The order of instantiating the objects below will be important for some pairs of commands.
    //I haven't explored this in any detail, beyond that the order below works.

    private int start_value = 10;	//initialise model, which in turn initialises view

    public MvcExample() {

        //create Model and View
//        BowlingGame bowlingGame = new BowlingGame();
//        // View myView 	= new GuiAwtView();
//        GUI gui = new GUI();
//
//        //tell Model about View. 
//        bowlingGame.addObserver(gui);
//        /*	
//         init model after view is instantiated and can show the status of the model
//         (I later decided that only the controller should talk to the model
//         and moved initialisation to the controller (see below).)
//         */
//		//uncomment to directly initialise Model
//        //myModel.setValue(start_value);	
//
//        // Create Controller. tell it about Model and View, initialise model
//        Controller myController = new Controller();
//        myController.addModel(myModel);
//        myController.addView(myView);
//        myController.initModel(start_value);
//
//        //tell View about Controller 
//        myView.addController(myController);
//
//		// and Model (this was only needed when the view inits the model)
//        //myView.addModel(myModel);
//        //
//        myView.start();
//
//    }
//
//    public static void main(String[] args) {
//        MvcExample example = new MvcExample();
//
    }

} //Main
