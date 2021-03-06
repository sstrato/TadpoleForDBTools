/*******************************************************************************
 * Copyright (c) 2013 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.cipher.core.utils;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * <pre>
 *	내용을 암호화 합니다. 
 * 	http://www.jasypt.org
 * </pre>
 * 
 * @author hangum
 *
 */
public class EncryptiDecryptUtil implements DefaultEncryptDecrypt {
	/** default encrypt password */
	final static String DEFAULT_ENCRYPT_PASSWORD = "heechan.tadpole.owner.son";
	
	/**
	 * 텍스트를 암호화 합니다.
	 * 
	 * @param text 암호화된 값 
	 * @return
	 */
	@Override
	public String encryption(String text) {
		if("".equals(text) || null == text) return "";
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(DEFAULT_ENCRYPT_PASSWORD);
		
		return textEncryptor.encrypt(text);
	}
	
	/**
	 * text를 복호화 합니다.
	 * 
	 * @param text 복호화 된 text
	 * @return
	 */
	@Override
	public String decryption(String text) {
		if("".equals(text) || null == text) return "";
		
		BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
		textEncryptor.setPassword(DEFAULT_ENCRYPT_PASSWORD);
		
		return textEncryptor.decrypt(text);
	}
	
}
