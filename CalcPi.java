// Computes an approximation of PI.
public class CalcPi {
    public static void main(String [] args)
     { 
       
       int times = Integer.parseInt(args[0]);
       int divider = 1;
       double overall = 0;


       for (int i = 0; i < times; i++) {
          
          {

            if (i % 2 == 0) {
               overall = overall + (1.0/divider);
            }        
               
              else {
                   overall = overall - (1.0/divider);
               }

           divider = divider +2 ;

            }

        }

        overall = overall *4 ;
          
           System.out.println("pi according to Java: 3.141592653589793");
           System.out.println("pi, approximated:     " + overall);
    }
}
