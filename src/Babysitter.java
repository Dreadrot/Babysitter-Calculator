
public class Babysitter {

	public String pay(int startTime, String startTimeAMOrPM, int endTime, String endTimeAMOrPM) {
	//start time qualifications
		if(startTime < 5 && !startTimeAMOrPM.equalsIgnoreCase("AM")){		
				return "Please enter a proper time!";			
		}else if(startTime > 12 || (startTime == 12 && !startTimeAMOrPM.equalsIgnoreCase("AM"))){
			return "Please enter a proper time!";
		}
	//end time qualifications
		if(endTime > 4 && !endTimeAMOrPM.equalsIgnoreCase("PM") && endTime != 12){
			return "Please enter a proper time!";
		}else if(endTime > 12 || (endTime == 12 && !endTimeAMOrPM.equalsIgnoreCase("AM"))){
			return "Please enter a proper time!";
		}
	//making sure start is before end
		if(startTimeAMOrPM.equalsIgnoreCase("AM") && endTimeAMOrPM.equalsIgnoreCase("PM")){
			return "Please enter a proper time!";
		}else if(startTimeAMOrPM.equalsIgnoreCase("PM") && endTimeAMOrPM.equalsIgnoreCase("PM") && startTime >= endTime){
			return "Please enter a proper time!";
		}else if(startTimeAMOrPM.equalsIgnoreCase("AM") && endTimeAMOrPM.equalsIgnoreCase("AM")){
			if(startTime >= endTime && startTime != 12){
				return "Please enter a proper time!";				
			}else if(endTime==12){
				return "Please enter a proper time!";
			}
		}
		
		int totalPay = 0;
		int timeConvert = endTime;
		if(endTimeAMOrPM.equalsIgnoreCase("AM") && !(endTime==12)){
			timeConvert += 12;
		}
		
		int workTime = startTime;
		for(int i = workTime; i < 9 && startTimeAMOrPM.equalsIgnoreCase("PM") && i < timeConvert; i++){
			totalPay += 12;
			workTime++;
		}
		
		for(int i = workTime; i >= 9 && i < 12 && i < timeConvert; i++){
			totalPay += 8;
			workTime++;
		}
		
		for(int i = workTime; (i >= 12 && i < timeConvert) || (i < 4 && i < endTime); i++){
			totalPay += 16;
			workTime++;
		}
		
		if(totalPay != 0){
			return "$" + String.valueOf(totalPay);
		}else{
			return "You entered a good time!";
		}
		
	}

}
