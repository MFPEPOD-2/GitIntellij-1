package com.demo.git;

import com.demo.git.util.GitUtil;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GitUtil util = new GitUtil();
        util.utilMethod();
        System.out.println("hello this is a demo project to learn git.");
    }

    public void hi(){
        System.out.println("Hi Git this is a new user from Intellij");
    }
}
