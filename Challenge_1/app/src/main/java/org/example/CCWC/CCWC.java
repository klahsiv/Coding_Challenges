package org.example.CCWC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "ccwc", version = "CCWC 1.0")
public class CCWC implements Runnable {

	@Option(names = "-c", description = "Get Count of Charcters", defaultValue = "false")
	boolean getByteCount;

	@Option(names = "-m", description = "Get Count of Charcters", defaultValue = "false")
	boolean getCharacterCount;

	@Option(names = "-w", description = "Get Count of Charcters", defaultValue = "false")
	boolean getWordCount;

	@Option(names = "-l", description = "Get Count of Charcters", defaultValue = "false")
	boolean getLineCount;

	@Parameters(index = "0", description = "File for which calculation is done")
	private File file;

	@Override
	public void run() {

		if (!this.file.exists()) {
			System.out.println("File Not Found");
		}

		String filePath = file.getAbsolutePath();
		int charCount = 0, lineCount = 0, wordCount = 0, byteCount = (int) file.length();

		if (getByteCount == getLineCount && getByteCount == getWordCount) {
			getByteCount = true;
			getWordCount = true;
			getLineCount = true;
		}
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
			int characterUnicode;
			boolean wordStarted = false;
			while ((characterUnicode = bufferedReader.read()) != -1) {
				char c = (char) characterUnicode;
				charCount++;
				if (c == '\n')
					lineCount++;
				if (Character.isWhitespace(c)) {
					if (wordStarted)
						wordCount++;
					wordStarted = false;
				} else {
					wordStarted = true;
				}

			}
			if (wordStarted)
				wordCount++;
		} catch (Exception e) {
			System.err.println("Error while reading File." + e.getMessage());
		}
		if (getByteCount)
			System.out.println("Bytes : " + byteCount);
		if (getCharacterCount)
			System.out.println("Characters : " + charCount);
		if (getWordCount)
			System.out.println("Word : " + wordCount);
		if (getLineCount)
			System.out.println("Lines : " + lineCount);

	}

}
