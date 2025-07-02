package com.ccwc.app.ccwc;

import picocli.CommandLine.Command;

@Command(name = "ccwc")
public class CCWC implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello from CCWC");
	}
}
