// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    // Replace this comment with your code
		int times = Integer.parseInt(args[0]);
		double sumsub = 0;
		double sumadd = 0;
		int timesadd= times/2;
		int timessub= times/2;
		int divideradd = 1;
		int dividersub = 3;
		if ( times%2==1){
			timesadd= timesadd + 2;
		}
		for (int i = 0; i < timesadd; i++) {
			sumadd = sumadd+(1.0/divideradd);
			divideradd = divideradd +4;
	}
		for (int i = 0; i < timessub; i++) {
			sumsub = sumsub - (1.0/dividersub);
			dividersub = dividersub +4;
	}
	double overall = (sumsub + sumadd)*4;
	System.out.println("pi according to Java: 3.141592653589793\npi, approximated: " + overall);
}
}
/*
 *% java CalcPi 10
pi according to Java: 3.141592653589793
pi, approximated: 3.0418396189294032
% java CalcPi 1000
pi according to Java: 3.141592653589793
pi, approximated: 3.140592653839794
 */