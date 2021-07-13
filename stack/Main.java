package com.company;

public class Main {

    public static void main(String[] args) {
	stack nums=new stack();
	nums.push(12);
	nums.push(20);
	nums.push(13);

	System.out.println(nums.pop());

	nums.show();
    }
}
