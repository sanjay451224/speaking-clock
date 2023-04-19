package com.clock.service;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Service;

import com.clock.exception.DateTimeFormatterException;

@Service
public class SpeakingService {
	
	
	public String getTime(String timeString) {
		dateValidationCheck(timeString);
		String[] parts = timeString.split(":"); // 8:34
		int hours = Integer.parseInt(parts[0]);
		int minutes = Integer.parseInt(parts[1]);
		String hourString = "";
		if(hours ==0 && minutes ==0) {
			hourString = "midnight";
		} else if(hours ==12 && minutes ==0) {
			hourString = "midday";
		} 
		
		String minuteString = "";
		if(minutes ==0) {
			minuteString = "";
		} else if(minutes <10) {
			hourString = "oh " + convertNumberToWord(hours);
			minuteString = "oh "+ convertNumberToWord(minutes);
		} else {
			hourString =  convertNumberToWord(hours);
			minuteString = convertNumberToWord(minutes);
		}
		
		System.out.println("It's "+hourString+" "+minuteString);
		String finalString = "It's " +hourString+" "+minuteString;		
		
		return finalString;
	}

	private void dateValidationCheck(String timeString) {
		SimpleDateFormat sd = new SimpleDateFormat("HH:mm");
		sd.setLenient(false);
		try {
			sd.parse(timeString);
		} catch(Exception e) {
			throw new DateTimeFormatterException();
		}
		
	}

	private String convertNumberToWord(int number) {
		String[] ones = {"","one", "two","three","four","five","six","seven", "eight","nine","ten","eleven","twelve", "thirteen","fourteen","fifteen","sixteen","eighteen","nineteen"};
		String[] tens = {"","","twenty","thirty","forty","fifty"};
		if(number< 20) {
			return ones[number];
		} else {
			int tenDigit = number/10;
			int onesDigit =number%10;
			return tens[tenDigit]+" "+ones[onesDigit];
		}
		
	}

}
