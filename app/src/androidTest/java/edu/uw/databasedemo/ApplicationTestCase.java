package edu.uw.databasedemo;

public class ApplicationTestCase<T> {
    T local = null;
    public ApplicationTestCase(T test) {
        this.local = test;
    }
}
