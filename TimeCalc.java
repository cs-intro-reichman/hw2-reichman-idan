public class TimeCalc {
    public static void main(String[] args) {
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		// Does the same with the minutes part of the input.
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int extra = Integer.parseInt("" + args[1]);
		
        //System.out.println(hours + " " + minutes + " " + extra);
		

        int difhours = extra/60;
        int difminutes = extra%60;
        //System.out.println(difhours + " " + difminutes + " " + extra);
        int newhours = (hours + difhours)%24;
        int newminutes = (minutes + difminutes);
        
        if (newminutes >=60) {
            newhours = (newhours + 1)%24;
            newminutes = newminutes%60; }
        
        String Pmin = Integer.toString(newminutes);
        String Phours = Integer.toString(newhours);
        
		if (newminutes< 10){
	    	Pmin = "0" + Integer.toString(newminutes);}
        if (newhours< 10){
            Phours = "0" + Integer.toString(newhours);}
        
        
        System.out.println(Phours + ":" + Pmin);

    }
}
