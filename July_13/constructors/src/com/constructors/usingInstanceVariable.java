package com.constructors;

public class usingInstanceVariable {
	String webName;
    int webAge;

    
    usingInstanceVariable(String name, int age) {
        this.webName = name;
        this.webAge = age;
    }

    public static void main(String args[]) {
    	usingInstanceVariable obj1 = new usingInstanceVariable("Raghavendra", 47);
    	usingInstanceVariable obj2 = new usingInstanceVariable("https://www.google.com/", 18); // Creating objects

        System.out.println(obj1.webName + " " + obj1.webAge);
        System.out.println(obj2.webName + " " + obj2.webAge);
	}

}
