package com.merkenlabs.ucinf.seguridad;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author lecaros
 * 
 */
public class EncrypDecryptTest {

	/**
	 * Test method for
	 * {@link com.merkenlabs.ucinf.seguridad.EncryptDecryptMain#main(java.lang.String[])}
	 * .
	 */
	@Test
	public void testMain() {
		EncryptDecrypt target = new EncryptDecrypt();

		String result = target.Encrypt("daniel", '.');

		assertEquals("wrong encryption", "JO@GKB", result);

		result = target.Encrypt("JO@GKB", '.');
		assertEquals("wrong encryption", "daniel", result);

	}

	@Test
	public void testFindAscCode() {
		EncryptDecrypt target = new EncryptDecrypt();
		assertEquals("ASCII code not working", 65, target.findAscCode('A'));
		assertEquals("ASCII code not working", 100, target.findAscCode('d'));
		assertEquals("ASCII code not working", 46, target.findAscCode('.'));
	}

	@Test
	public void testConvertDecimalToBinaryString() {
		EncryptDecrypt target = new EncryptDecrypt();
		String result = target.convertDecimalToBinaryString(100);
		assertEquals("decimal to binaryString is wrong", "01100100", result);

	}

	@Test
	public void testConvertBinaryStringToDecimal() {
		EncryptDecrypt target = new EncryptDecrypt();
		int result = target.convertBinaryStringToDecimal("01100100");
		assertEquals("binaryString to decimal is wrong", 100, result);

	}

	@Test
	public void testOperateBinariesAsStringWithXor() {
		EncryptDecrypt target = new EncryptDecrypt();

		String result = target.operateBinariesAsStringWithXor("01100100",
				"00101110");
		assertEquals("XOR operation not working", "01001010", result);
	}

	@Test
	public void testXorOperator() {
		EncryptDecrypt target = new EncryptDecrypt();
		String result = target.xorOperator('0', '0');
		assertEquals("0", result);
		result = target.xorOperator('0', '1');
		assertEquals("1", result);
		result = target.xorOperator('1', '0');
		assertEquals("1", result);
		result = target.xorOperator('1', '1');
		assertEquals("0", result);
	}
}
