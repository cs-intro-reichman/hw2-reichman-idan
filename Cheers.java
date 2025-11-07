// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
            String name1 = args[0];
            int times = Integer.parseInt(args[1]);
            name1 = name1.toUpperCase();
            char Lholder = name1.charAt(0);
            String an = ("AEFHILMNORSX");
            
            for (int i = 0; i < name1.length(); i++) {
                Lholder = name1.charAt(i);
                if (an.indexOf(Lholder) != -1) {
                        System.out.println("Give me an "+ Lholder + ": " + Lholder + "!");
                }
                else {
                        System.out.println("Give me a "+ Lholder + ": " + Lholder + "!");
                }
                }
             System.out.println("What does that spell?");
             for (int b = 0; b < times ; b++) { 
                System.out.println( name1 + "!!!");
            }


        }
}

