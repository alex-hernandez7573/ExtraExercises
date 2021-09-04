public class test {
    public static void main(String[] args) {
        System.out.println("hey is this working?");
        System.out.println(1+1);
        System.out.println("some data types");
        int myNum = 5;
        float thisFloatNum = 5.99f;
        char thisChar = 'A';
        boolean thisBoolean = true;
        String thisText = "HEY WE ALREADY DID THIS";

//        wide
        System.out.println("simple casting review");
         int myInt  = 2055;
         double weAboutToDoubleThisUp = myInt;
        System.out.println(weAboutToDoubleThisUp);

//        narrow
        double thisDouble = 23.66;
        int newInt = (int)thisDouble;
        System.out.println(newInt);



        String[] cars = {"Volvo","BMW","Ford","Honda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }


}


