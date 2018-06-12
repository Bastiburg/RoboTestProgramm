package roboTest;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	
	private SimpleDateFormat sdfDate;
	private SimpleDateFormat sdfTime;
	
	public DateAndTime() {
		sdfDate = new SimpleDateFormat("yyyy.MM.dd");
		sdfTime = new SimpleDateFormat("HH.mm.ss");
	}
	
	public String getDateAndTimeForFiles() {
		//System.out.println(sdfDate.format(new Date()) + " " + sdfTime.format(new Date()));
		return sdfDate.format(new Date()) + "_" + sdfTime.format(new Date());
	}

}
