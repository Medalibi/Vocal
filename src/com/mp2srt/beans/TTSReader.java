package com.mp2srt.beans;

/**
 * Copyright 2003 Sun Microsystems, Inc.
 * 
 * See the file "license.terms" for information on usage and
 * redistribution of this file, and for a DISCLAIMER OF ALL 
 * WARRANTIES.
 */
import java.io.IOException;

import javazoom.jl.decoder.JavaLayerException;

import com.gtranslate.Audio;
import com.gtranslate.Language;
import com.gtranslate.Translator;



/**
 * Simple program to demonstrate the use of the FreeTTS speech
 * synthesizer.  This simple program shows how to use FreeTTS
 * without requiring the Java Speech API (JSAPI).
 */
public class TTSReader {

    /**
     * Example of how to list all the known voices.
     */
    
    public TTSReader() {
    }

    public void Spell(String words) 
    {
    		Translator translate = Translator.getInstance();
    		Language language = Language.getInstance();
    		String text = words;
    		System.out.println(translate.translate(text, Language.ENGLISH,
    				Language.FRENCH)
    				+ " ");	
    		//System.out.println(translate.detect(text));
    		//System.out.println(language.getNameLanguage(translate.detect(text),
    				//Language.FRENCH));
    		
    		
    		try {
    			
    			Audio.getInstance().play(Audio.getInstance().getAudio(words, Language.ENGLISH));
    			
    			
    		} catch (JavaLayerException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}		
    	
    }
}
