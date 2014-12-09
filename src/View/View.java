package View;
/*
(C) Joseph Mack 2011, jmack (at) wm7d (dot) net, released under GPL v3 (or any later version)
*/

import java.util.Observer;
import java.awt.event.ActionListener;	//for addController()

public interface View extends Observer {

	void start();

	void addController(ActionListener controller);
}
