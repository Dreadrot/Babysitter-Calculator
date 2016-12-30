
public class Babysitter {

	public String pay(int startTime, String startTimeAMOrPM) {
		if(startTime < 5){
			if(startTimeAMOrPM.equalsIgnoreCase("AM")){
			}else{
				return "Please enter a proper time!";
			}
		} else if(startTime > 12){
			return "Please enter a proper time!";
		}
		return "You entered a good start time!";
	}

}
