package TP3.ejercicio1;

/**
 * Created by arimi on 19/08/2016.
 */
public class ClaseA {
    public int m1() {
        return this.m3();
    }

    public int m2() {
        return 10;
    }

    public int m3() {
        return 3;
    }

    public int m4() {
        return this.m4();
    }
}