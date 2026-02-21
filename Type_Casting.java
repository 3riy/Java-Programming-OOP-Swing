// -- Type Casting -- //

class Type_Casting {
    public static void main(String[] args) {
        
        // Implicit Type Casting / Widening
        int i = 10;
        double d = i; 
        System.out.println("Widening (int to double): " + d);

        // Explicit Type Casting / Narrowing
        double val = 10.75;
        int num = (int) val; 
        System.out.println("Narrowing (double to int): " + num);

        // Type Casting with Characters / Unicode
        char ch = 'A';
        int charNum = ch;
        System.out.println("Char to Int (Unicode): " + charNum);

        // Type Casting in Expressions (Promotion)
        byte a = 10;
        byte b = 20;
        int result = a + b; 
        System.out.println("Expression Promotion (byte to int): " + result);
    }
}