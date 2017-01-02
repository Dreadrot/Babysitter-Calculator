
public class Babysitter {

	public String pay(int startTime, String startTimeAMOrPM, int endTime, String endTimeAMOrPM) {
		if(startTime < 5 && !startTimeAMOrPM.equalsIgnoreCase("AM")){		
				return "Please enter a proper time!";			
		}else if(startTime > 12 ){
			return "Please enter a proper time!";
		}
		if(endTime > 4 && !endTimeAMOrPM.equalsIgnoreCase("PM")){
			return "Please enter a proper time!";
		}else if(endTime > 12){
			return "Please enter a proper time!";
		}
			return "You entered a good start time!";
	}

}
