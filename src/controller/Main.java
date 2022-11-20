package controller;

import view.PrincipalFrame;

public class Main {

	public static void main(String[] args) {
		PrincipalFrame frame = new PrincipalFrame();
		EventsController control = new EventsController(frame);
		control.playSound("sounds/BSO_Jpark.wav");
		frame.controller(control);

	}

}
