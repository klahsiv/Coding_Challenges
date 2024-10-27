package wc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WC {
	
	private File file;
	private Long characterSize;
	private Integer lines, words;
	
	public Integer getFileLines() {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
			
			lines = 0;
			while(bufferedReader.readLine() != null) {
				lines++;
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lines;
	}
	
	public Integer getFileWords() {
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file));){
			
			words = 0;
			String currentLine = bufferedReader.readLine();
			
			while(currentLine != null) {
				
//				String wordArray[] = currentLine.split("\\s");
//				words += wordArray.length;
//				
				 if (!currentLine.trim().isEmpty()) {
			        String[] wordArray = currentLine.trim().split("\\s+");
			        words += wordArray.length;
			    }
				
				currentLine = bufferedReader.readLine();
			}
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return words;
	}
	
	public long getFileSize() {
		characterSize = file.length();
		return characterSize;
	}

}
