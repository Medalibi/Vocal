package com.mp2srt.struts.action;

public class Maintester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//TextToSpeech tts = new TextToSpeech();

          //Reader read = new Reader();
		
		//tts.playSynth("Hello, if you like to edit the field say Edit");
		//String text = read.Listen("alibimohamed@gmail.com", "stop exit", 7000);
		String text = "Edit 23";
		//System.out.println(text.length());
		String t =  (String) text.subSequence(5, text.length());
		//System.out.println(t);
		int i = Integer.parseInt(t);
		System.out.println(i);

	}

}
