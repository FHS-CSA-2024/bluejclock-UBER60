 


public class ClockDisplay12Hour
{
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes
    //Implement a private String for the display
    private NumberDisplay hour;
    private NumberDisplay minute;
    private String display;
    //Implement a constructor that takes no parameters
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method updateDisplay before finishing
    public ClockDisplay12Hour(){
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        updateDisplay();
    }
    //Implement a constructor that takes 2 parameters, hour and minute
    //The constructor should set hours as a NumberDisplay object with 24 as the limit
    //The constructor should set minutes as a NumberDisplay object with 60 as the limit
    //The constructor should call the method setTime with the parameters passed in
    public ClockDisplay12Hour(int hours, int minutes){
        hour = new NumberDisplay(24);
        minute = new NumberDisplay(60);
        setTime(hours, minutes);
    }
    //Implement a method timeTick that takes no parameters and returns nothing
    //The method should increase the minute value by one each run
    //The hours should increase when the minutes roll over
    //The updateDisplay method should be called before finishing
    public void timeTick(){
        minute.increment();
        if (minute.getValue() == 0){
            hour.increment();
        }
        updateDisplay();
    }
    //Implement a method setTime that takes in 2 parameters, hour and minute
    //The method should set the hours value and minutes value
    //The updateDisplay method should be called before finishing
    public void setTime(int hours, int minutes){
        minute.setValue(minutes);
        hour.setValue(hours);
        updateDisplay();
    }
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){
        return display;
    }
    //Implement a method updateDisplay that takes no parameters and returns nothing
    //The method should update the displayString with the current time in a format
    //  HH:MM
    public void updateDisplay(){
        String out = "";
        if (hour.getValue() < 12){
            if (hour.getValue() == 0){
                out = "12:" + minute.getDisplayValue() + "AM";
            } else{
                out = hour.getDisplayValue() + ":" + minute.getDisplayValue() + "AM";
            }
        }else{
            if (hour.getValue() == 12){
                out = "12" + ":" + minute.getDisplayValue() + "PM";
            } else if (hour.getValue() > 21){
                out = "" + (hour.getValue()-12) + ":" + minute.getDisplayValue() + "PM";
            } else{
                out = "0" + (hour.getValue()-12) + ":" + minute.getDisplayValue() + "PM";
            }
        }
        display = out;
    }
}
