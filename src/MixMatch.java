public class MixMatch{
    public static void main(String[] args){

        String varString = "Hello";
        char varChar = 'J';
        short varShort = 32000;
        int varInt = 7;
        long varLong = 9223372036854775807L;
        float varFloat = 3.14f;
        double varDouble = 2.718281828459;
        boolean varBoolean = true;
        
        System.out.println(varString + " <- String, stores sequences of characters");
        System.out.println(varChar + " <- char, stores a single character (16-bit Unicode)");
        System.out.println(varShort + " <- short, stores whole numbers from -32,768 to 32,767");
        System.out.println(varInt + " <- int, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(varLong + " <- long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(varFloat + " <- float, stores fractional numbers up to 7 decimal digits");
        System.out.println(varDouble + " <- double, stores fractional numbers up to 15 decimal digits");
        System.out.println(varBoolean + " <- boolean, stores true or false");
    }
}