package com.mp2srt.struts.action;

import java.util.Scanner;

import javax.sound.sampled.AudioFileFormat;

import com.darkprograms.speech.microphone.MicrophoneAnalyzer;
import com.darkprograms.speech.recognizer.GoogleResponse;
import com.darkprograms.speech.recognizer.Recognizer;


public class Recognition2 {
	
	
	    public static void main(String[] args)  {
	        try{
	        ambientListening();
	        }
	        catch(Exception e){
	            e.printStackTrace();
	        }
	    }

	    private static void ambientListening() throws Exception{

	        String filename = "sound.wav";//Your Desired FileName
	        MicrophoneAnalyzer mic = new MicrophoneAnalyzer(AudioFileFormat.Type.WAVE);
	        
	        TextToSpeech tts = new TextToSpeech();
	        
	        Scanner scan = new Scanner(System.in); 
			int test=0;
			
			
				System.out.println("Type anything to record");
				test = scan.nextInt();
				
					mic.open();
					mic.captureAudioToFile(filename);
				
				 
				
				System.out.println("Type anything to stop recording");
				test = scan.nextInt();
				
					mic.close();
				
	        
	        
	              
	            //You can also measure the volume across the entire file if you want
	            //to be resource intensive.
	            
	        Recognizer rec = new Recognizer(Recognizer.Languages.ENGLISH_US);
	        GoogleResponse out = rec.getRecognizedDataForWave(filename);
	        System.out.println(out.getResponse());
	        tts.playSynth(out.getResponse());
	        //ambientListening();
	    }
	}


