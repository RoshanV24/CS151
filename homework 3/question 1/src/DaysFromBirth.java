
import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.*;


public class DaysFromBirth 
{
	public static void main(String[] args)
	{
	ZonedDateTime current = ZonedDateTime.now();
	
	
	ZoneId zoneId = ZoneId.of("America/Los_Angeles");
	
	ZonedDateTime birth = ZonedDateTime.of(1998, 11, 15, 0, 0, 0, 0, zoneId);
	
	
	Duration d = Duration.between( current , birth);
	
	
	System.out.println(birth.until(current, ChronoUnit.DAYS) + " days");
	}
}

