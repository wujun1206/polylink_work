package jni;

public class HelloWorld {
    static{
        System.loadLibrary("hellodll");
    }

    public native void dispHelloWorld();
    /**
     * @param args
     */
    public static void main(String[] args) {
        //System.out.println("abc");
        new HelloWorld().dispHelloWorld();
    }

}