
public class Babysitter {

	public String pay(int startTime, String startTimeAMOrPM, int endTime, String endTimeAMOrPM) {
	//start time qualifications
		if(startTime < 5 && !startTimeAMOrPM.equalsIgnoreCase("AM")){		
				return "Please enter a proper time!";			
		}else if(startTime > 12 || (startTime == 12 && !startTimeAMOrPM.equalsIgnoreCase("AM"))){
			return "Please enter a proper time!";
		}
	//end time qualifications
		if(endTime > 4 && !endTimeAMOrPM.equalsIgnoreCase("PM")){
			return "Please enter a proper time!";
		}else if(endTime > 12 || (endTime == 12 && !endTimeAMOrPM.equalsIgnoreCase("AM"))){
			return "Please enter a proper time!";
		}
	//making sure start is before end
		if(startTimeAMOrPM.equalsIgnoreCase("AM") && endTimeAMOrPM.equalsIgnoreCase("PM")){
			return "Please enter a proper time!";
		}else if(startTimeAMOrPM.equalsIgnoreCase("PM") && endTimeAMOrPM.equalsIgnoreCase("PM") && startTime >= endTime){
			return "Please enter a proper time!";
		}else if(startTimeAMOrPM.equalsIgnoreCase("AM") && endTimeAMOrPM.equalsIgnoreCase("AM") && startTime >= endTime && startTime != 12){
			return "Please enter a proper time!";
		}
		
			return "You entered a good start time!";
	}

}
