package Controlador;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import Modelo.Regex;
import Vista.ViewFrame;

public class Logica implements ActionListener{

	private ViewFrame v;
	private Regex er=new Regex();
	public Logica(ViewFrame v) {
		super();
		this.v=v;
		this.v.btn_Save.addActionListener(this);
		this.v.btn_Charge.addActionListener(this);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
	    if (e.getSource() == v.btn_Save) {
	        // Verificar si el área de texto está vacía
	        if (v.txt_Area.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(v, "No se ha ingresado ningún texto.", "Advertencia", JOptionPane.WARNING_MESSAGE);
	        } else {
	            // Si hay texto, proceder con el guardado
	            JOptionPane.showMessageDialog(v, "Texto Guardado");
	            // Aquí iría el código para guardar el texto
	        }
	    } else if (e.getSource() == v.btn_Charge) {
	        // Verificar si el campo de texto txt_ER está vacío
	        if (v.txt_ER.getText().isEmpty()) {
	            JOptionPane.showMessageDialog(v, "No se ha ingresado ningún patrón.", "Advertencia", JOptionPane.WARNING_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(v, "Patrón correcto");
	            er.setPatron(v.txt_ER.getText());
	            Pattern pattern = Pattern.compile(er.getPatron());
	            System.out.println(er.getPatron());
	            er.setPalabras(v.txt_Area.getText());
	            String words = String.join(" ", er.getPalabras());
	            Matcher matcher = pattern.matcher(words);
	            ArrayList<String> findwords = new ArrayList<>();
	            while (matcher.find()) {
	            	findwords.add(matcher.group());
	            }

	            // Convertir el ArrayList a un arreglo de String
	            String[] arraywords = findwords.toArray(new String[0]);

	            // Limpiar el JList
	            v.tbl_Words.removeAll();

	            v.tbl_Words.setListData(arraywords);
	            v.lbl_intpalabras.setText(Integer.toString(arraywords.length));
	            for (String w : arraywords) {
	                System.out.println(w);
	            }
	        }
	    } else {
	        JOptionPane.showMessageDialog(v, "Patrón Incorrecto");
	    }
	}


}
