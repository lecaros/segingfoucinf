package com.merkenlabs.ucinf.seguridad;

import javax.swing.JOptionPane;

/**
 * @author lecaros
 * 
 */
public class EncryptDecryptMain {

	public static void main(String[] args) {
		String key = JOptionPane.showInputDialog(null,
				"Indique el caracter llave:");

		String string = JOptionPane.showInputDialog(null, "Indique la cadena");

		EncryptDecrypt encrypt = new EncryptDecrypt();
		String result = encrypt.Encrypt(string, key.charAt(0));

		JOptionPane.showMessageDialog(null, "Llave : " + key + "\n"
				+ "Cadena inicial:" + string + "\n" + "Cadena final  :"
				+ result);
	}
}
