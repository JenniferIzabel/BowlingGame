package Controller;

/*
 * Copyright (C) Joseph Mack 2011, jmack@wm7d.net, released under GPL v3 (or any later version)
 */


import Model.BowlingGame;
import View.GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Controlador.
 *
 * Classe inspirda em código criado por Joseph Bergin (http://csis.pace.edu/~bergin/mvc/mvcgui.html)
 */
class Controller implements ActionListener {

	/**
 	 * Modelo a ser utilizado.
 	 */
	private BowlingGame game;
	
	/**
 	 * Visão a ser utilizada.
 	 */
	private GUI gui;

	/**
 	 * Inicializa o objeto (construtor).
 	 */
	public Controller() {	
		System.out.println ("Controller()");
	}

	/**
 	 * Realiza ação ao receber um evento (pressionar de botão).
 	 */
	public void actionPerformed(ActionEvent e){
//		System.out.println("Controller: recebeu evento e tratará o evento com alteração no modelo");
//		System.out.println("Controller: evento recebido foi " + e.getActionCommand() + ", com os parâmetros " + e.paramString());
//		game.incrementValue();
	}
//
//	/**
//	 * Substitui o modelo a ser utilizado.
//	 */
//	public void addModel(Model m){
//		System.out.println("Controller: adding model");
//		this.game = m;
//	}
//
//	/**
// 	 * Substitui a visão a ser utilizada.
// 	 */
//	public void addView(View v){
//		System.out.println("Controller: adding view");
//		this.gui = v;
//	}
//
//	/**
// 	 * Inicialida o modelo a ser utilizado.
// 	 */
//	public void initModel(int x){
//		game.setValue(x);
//	}
}
