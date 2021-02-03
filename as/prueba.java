/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package as;

import javax.swing.*;

/**
 *
 * @author rasca
 */
public class prueba extends JFrame{
    	
	prueba(){
		setBounds(300,300,200,350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		add(new panel1());

		setVisible(true);
		
	}
    
}
