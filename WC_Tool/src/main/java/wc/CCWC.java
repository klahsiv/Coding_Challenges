package wc;

import java.io.File;

public class CCWC {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		if(args.length < 1) {
			System.err.println("Filename not provided");
			throw new Exception();
		}
		
		System.out.println(args.length);
		
		
		
		String fileName = args[ args.length - 1];
		File file = new File(fileName);
		
		WC wc = new WC();
		wc.setFile(file);
		
		for(String arg : args) {
			
			switch(arg.toLowerCase()){
				case "-c":
					System.out.println("Get File Size");
					
					System.out.println(wc.getFileSize());
					break;
				case "-l":
					System.out.println("Get Number of Lines");
					System.out.println(wc.getFileLines());
					break;
				case "-w":
					System.out.println("Get Number of Words");
					System.out.println(wc.getFileWords());
					break;
				default:
					break;
			}
		}
		
//		System.out.println(fileName + " Size in Bytes : " + file.length());
	}
}
