package com.qualims.serveur.domaine;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class DateHeureService {

	public static String heureCourante() {
		System.out.println("Affichage de l'heure courante");
		LocalTime localTime = LocalTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime=localTime.format(formatter);
        return formattedTime;
	}
	
	public static String heureCouranteOffset() {
		ZoneOffset zoneOffset = ZoneOffset.of("+02:00");
	    ZoneId zoneId=ZoneId.ofOffset("UTC", zoneOffset);
	    LocalTime offsetTime = LocalTime.now(zoneId);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
	    String formattedTime=offsetTime.format(formatter);
	    return formattedTime;
	}
	
	public static String heureCouranteTimeZone() {
		ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalTime localTime=LocalTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime=localTime.format(formatter);
        return formattedTime;
	}
}
