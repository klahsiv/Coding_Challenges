package com.ccwc.app;

import com.ccwc.app.ccwc.CCWC;

import picocli.CommandLine;

/**
 * Hello world!
 */
public class App {
	public static void main(String[] args) {
		int exitCode = new CommandLine(new CCWC()).execute(args);
		System.out.println("Hello World!");
	}
}
