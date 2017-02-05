public class Car 
{
	int gear = 1;
	int location;
	int speed = 0;
	final int DESTINATION = 250;
	
	void reverseGear()
	{
		gear = -1;
	}
	
	void gearUp()
	{
		if (gear == 6) // If gear is 6 show the following message
		{
		System.out.println("Cannot increase the gear anymore");
		} 
		else if (gear == -1)
		{
		gear = 1; // If gear is -1 change gear to 1
		}	   
		else
		{
		gear = gear + 1;
		}
	}

	void gearDown()
	{
		if (gear == 1) // If gear is 6 show the following message
		{
		System.out.println("Cannot decrease the gear anymore");
		}
		else if (gear == -1)
		{
		System.out.println("Cannot decrease the gear anymore because the car is in reverse");	
		}
		else
		{
		gear = gear - 1;
		}
	} // End of gearDown
	
	int reportGear()
	{
	return gear;
	}
	
	int reportLocation()
	{
	return location;	
	}
	
	int reportRemaining()
	{
		return DESTINATION - location;
	}
	
	void moveByTime(int time)
	{
		int delta;
		if (time < 0)
		{
		System.out.println("Time should be positive!");	
		}
		else
		{
		speed=gear*20;
		delta=speed*time;
		location = location + delta;
		}
	}// End of moveByTime
	
	boolean isArrived()
	{
		if (location >= DESTINATION)
		{
		return true;	
		}
		else
		{
		return false;
		}
	} //End isArrived
	
} // END OF PUBLIC CLASS



