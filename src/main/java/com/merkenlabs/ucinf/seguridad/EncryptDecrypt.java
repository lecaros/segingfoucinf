package com.merkenlabs.ucinf.seguridad;

/**
 * @author lecaros
 * 
 */
public class EncryptDecrypt {

	private static final String EMPTY_STRING = "";

	private static final String ZERO_STRING = "0";

	public String Encrypt(String input, char key) {
		int keyAscii = findAscCode(key);
		String keyAsBinaryString = convertDecimalToBinaryString(keyAscii);
		String outputString = EMPTY_STRING;
		for (int i = 0; i < input.length(); i++) {
			int asciiCode = findAscCode(input.charAt(i));
			String inputAsBinaryString = convertDecimalToBinaryString(asciiCode);
			String xorResult = operateBinariesAsStringWithXor(
					keyAsBinaryString, inputAsBinaryString);
			int binaryAsDecimal = convertBinaryStringToDecimal(xorResult);
			char characterFromDecimal = (char) binaryAsDecimal;
			outputString = outputString.concat(String
					.valueOf(characterFromDecimal));
		}
		return outputString;
	}

	public int findAscCode(char character) {
		return (int) character;
	}

	public String convertDecimalToBinaryString(int number) {
		String result = Integer.toBinaryString(number);
		while (result.length() < 8) {
			result = ZERO_STRING.concat(result);
		}
		return result;
	}

	public int convertBinaryStringToDecimal(String binaryAsString) {
		int result = Integer.parseInt(binaryAsString, 2);
		return result;
	}

	public String operateBinariesAsStringWithXor(String binary1, String binary2) {
		String outputString = EMPTY_STRING;
		for (int i = 0; i < binary1.length(); i++) {
			String tmp = xorOperator(binary1.charAt(i), binary2.charAt(i));
			outputString = outputString.concat(tmp);
		}
		return outputString;
	}

	public String xorOperator(char char1, char char2) {
		String charAsString1 = String.valueOf(char1);
		String charAsString2 = String.valueOf(char2);
		return charAsString1.equals(charAsString2) ? ZERO_STRING : "1";
	}
}