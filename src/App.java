public class App {
    public static void main(String[] args) throws Exception {
        //printing
        System.out.println("Hello, koko1");
        System.out.println("Hello, koko2");
        System.out.println("Hello, koko3");
        System.out.println();
        
        //assignment
        int age=21;
        String myName="sofian";
        float myFloat=3.14f;
        double myDouble=3.14;
        long myLong=123456789L;
        
        //concatination
        System.out.println("my name is " + myName + " and my age is " + age);
        System.out.println("my float is " + myFloat + " and my double is " + myDouble + " and my long is " + myLong);
        int koko=21;
        Double sofi=21.0;
        
        //casting
        int sum=(int) (koko + sofi);
        System.out.println("the sum of koko and sofi is " + sum);

        //conditional
        if (age > 18) {
            System.out.println("you are an adult");
        } else {
            System.out.println("you are not an adult");
        }

        //Operators, Boolean, & Char
        boolean isAdult = age > 18;
        char myChar = 'A';
        System.out.println("is adult: " + isAdult);
        System.out.println("my char: " + myChar);

        //+= , -=, *=, /=
        int x = 10;
        x += 5; // x = x + 5
        System.out.println("x after += 5: " + x);
        x -= 3; // x = x - 3
        System.out.println("x after -= 3: " + x);
        x *= 2; // x = x * 2
        System.out.println("x after *= 2: " + x);
        x /= 4; // x = x / 4
        System.out.println("x after /= 4: " + x);

        
     }
}
