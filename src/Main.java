class Main{
    // The parameter in the function definition is a formal parameter
    public static void addTen(int formalParameter, int anotherParameter) {
    	System.out.print(formalParameter+anotherParameter);
    }

    public static void main(String[] args)
    {
        //The variable passed to the method/subroutine is an actual parameter
        int actualParameter = 5;
        int anotherParameter = 10;
        addTen(actualParameter, anotherParameter);
    }
}