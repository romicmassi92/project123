import java.util.Scanner;

public class Java123 {

    public static void remove() {
        String sample = "This is very easy programme";
        sample = sample.replace("s" , "");
        System.out.println(sample);     }

    public static void findlength(){
        String sample = "This is very easy programme";
        System.out.println(sample.length());    }

    public static void removespace() {
        String sample = "This is very easy programme";
        System.out.println(sample.replaceAll("\\s",""));     }

    public static void extractspechar(){
        String sample = "This $300 is equivalent of £200 but not for @100";
        System.out.println(sample.replaceAll(("[^a-zA-Z0-9]"), " "));  }

    public static void extractnumber(){
        String sample= "The cost of iPhone is £1,250";
        System.out.println(sample.replaceAll("[^0-9]", ""));     }

    public static void inttonum(){

        int sample = 450;
        System.out.println((double)(sample));    }

    public static void stringtoint(){
        String sample = "125";
        System.out.println(Integer.parseInt(sample));
    }

    public static void doubletostring (){
        double sample = 123.45;
        System.out.println(String.valueOf(sample));     }

    public static void stringtodouble (){
        String sample = "560.25";
        Double value = Double.parseDouble(sample);
        System.out.println(value);     }

    public static void divisionindecimal(double x, double y){
        String value1 =  "1";
        String value2 = "3";
        System.out.println(x/y);
        System.out.println(Double.parseDouble(value1) + Double.parseDouble(value2));}

    public static void replacecurrencysymbol(){
        String sample = "$250.00";
        System.out.println(sample.replace("$", "£"));
    }


    public static void extractmiddle () {

        // string input = "There" odd number so output should be "e"
        // string input = "England" odd number so output should be "l"
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = in.next();

        int position;
        int length1;
        // string input = "orange" even number so output should be middle two character "an"
        if (string.length() % 2 == 1) {
            position = string.length() / 2;
            length1 = 1;
        } else {

            position = string.length() / 2 - 1;
            length1 = 2;
        }

        String results = string.substring(position, position + length1);

        System.out.println("middle: " + results);
    }
    public static void main (String[] args) {
        remove();
        findlength();
        removespace();
        extractspechar();
        extractnumber();
        inttonum();
        stringtoint();
        doubletostring();
        stringtodouble();
        divisionindecimal(1,3);
        replacecurrencysymbol();
        extractmiddle();

    }
}