package com.sample.functionInterface;

/**
 * This class is used to write functional interface code.
 */
public class FunctionalINterfaceTest {
    public static void main(String[] args) {
        testFunInterfaceOldWay();
        testFunInterfaceJava8Way();

        testFunInterfaceWithObjectClassMethod();
    }

    /**
     * Old way to create and execute interface. In which we have to create an anonymous class then call interface method.
     */
    private static void testFunInterfaceOldWay() {
        FunInterface funInterface = new FunInterface() {
            @Override
            public int calculate(int x) {
                return x * 2;
            }
        };
        System.out.println("Calculated Value = " + funInterface.calculate(3));
    }

    /**
     * Java8 way to create and execute functional interface. In which we have created a lambda expression.
     */
    private static void testFunInterfaceJava8Way() {
        FunInterface funInterface = a -> a * 2;
        System.out.println("Calculated Value using lambda exp = " + funInterface.calculate(3));
    }

    private static void testFunInterfaceWithObjectClassMethod() {
        FunInterfaceWithObjectClassMethod funInterfaceWithObjectClassMethod = (a, b) -> a * b;
        System.out.println("Calculated Value when overriding object class method = " + funInterfaceWithObjectClassMethod.calculate(10, 3));
        System.out.println(funInterfaceWithObjectClassMethod.toString()); // This line will print the hashCode.

        //We can define anonymous class to see toString and equals method functionality.
        //Objects class public method implictily avialble for an interface irespective its declared in interface or not. If we comment toString() and equals() from com.sample.functionInterface.FunInterfaceWithObjectClassMethod then below code will work.
        FunInterfaceWithObjectClassMethod funInterfaceWithObjectClassMethod1 = new FunInterfaceWithObjectClassMethod() {
            @Override
            public int calculate(int x, int y) {
                return 0;
            }

            @Override
            public String toString() {
                return "toString from Anonymous11";
            }

            @Override
            public boolean equals(Object o) {
                if (o.equals("test"))
                    return true;
                else
                    return false;
            }

        };
        System.out.println(funInterfaceWithObjectClassMethod1.toString()); //This line will print the "toString from Anonymous11"
        System.out.println(funInterfaceWithObjectClassMethod1.equals("test"));
    }
}
