package com.sample.functionInterface;

@FunctionalInterface
public interface FunInterfaceWithObjectClassMethod {

    int calculate(int x, int y);


    /**
     * https://howtodoinjava.com/java8/functional-interface-tutorial/
     * If an interface declares an abstract method overriding one of the public methods of java.lang.Object,
     * that also does not count toward the interface’s abstract method count since any implementation of the interface will have an implementation from java.lang.Object or elsewhere.
     * e.g. Comparator is a functional interface even though it declared two abstract methods. Why? Because one of these abstract methods “equals()” which has signature equal to public method in Object class.
     * e.g. Below interface is a valid functional interface.
     *
     * @return
     */
    @Override
    public String toString();

    @Override
    public boolean equals(Object obj);


    /**
     * https://stackoverflow.com/questions/8721848/overriding-object-class-methods-within-an-interface-in-java/8722033
     * The Java Language Specification clearly says that the members of an interface are those which are declared in the interface and those which are inherited from direct super interfaces.
     * If an interface has no direct superinterface then the interface implicitly declares a public abstract member method corresponding to each public instance method declared in the Object class,
     * unless a method with the same signature, same return type, and a compatible throws clause is explicitly declared by that interface.
     * This is what makes the signatures of the Object methods available to the compiler and the code compiles without any error.
     * Remember if the interface tries to declare a public instance method declared 'final' in the Object class then it'll result into a compile-time error.
     * For example, 'public final Class getClass()' is a public instance method declared 'final' in the Object class and therefore if an interface tries to declare a method with this signature then the compilation will fail.
     */
}
