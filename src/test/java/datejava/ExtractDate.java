package datejava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Locale;

public class ExtractDate {
 
	public String extractBackDate() {
		LocalDate currentDate = LocalDate.now();
//		System.out.println(LocalDate.now().getDayOfMonth());
	    LocalDate dateMinus15Days = currentDate.minusDays(15);
	    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM", Locale.ENGLISH);
	    String formattedDate = dateMinus15Days.format(formatter);
	    return formattedDate;
	}
	public ArrayList<String> extractPresentWeek(){
		ArrayList<String> week=new ArrayList<String>();
	LocalDate today = LocalDate.now();
	LocalDate startOfWeek = today.with(TemporalAdjusters.previousOrSame(java.time.DayOfWeek.SUNDAY));
	LocalDate endOfWeek = today.with(TemporalAdjusters.nextOrSame(java.time.DayOfWeek.SATURDAY));
	 
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE, dd MMM", Locale.ENGLISH);
	 
	for (LocalDate date = startOfWeek; !date.isAfter(endOfWeek); date = date.plusDays(1)) {
	    String formattedDate = date.format(formatter);
	    week.add(formattedDate);
	}
	/* for(int i=0;i<week.size();i++) {
		System.out.println(week.get(i));
	*/
	return week;
	}
	
	
}
