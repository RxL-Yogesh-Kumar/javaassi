package com.company;

public class stack {
    int stack[]=new int[5];
    int top =0;
    public void push(int data)
    {
        stack[top]=data;
        top++;
    }

    public int pop()
    {
        top--;
        int data;
        data=stack[top];
        stack[top]=0;
        return data;
    }

    public void show()
    {
        for(int n:stack)
        {
            System.out.print(n + " ");
        }
    }
}
