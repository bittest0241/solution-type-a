package problem04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int random = (int) (Math.random()*999+1);
		String check = ""; 
		int count = 0;
		String randomString = random+"";
		int S = 0;
		int B = 0;
		int O = 0;
		
		long startTime = System.currentTimeMillis();
		do {
			S = 0;
			B = 0;
			O = 0;
			System.out.print("정수 3자리 입력 : " );
			check = sc.nextLine();
			if(Integer.parseInt(check) > 999 || Integer.parseInt(check) < 100) {
				System.out.print("3자리만 입력하세요");
				return;
			}
			
			for(int i = 0; i < randomString.length(); i++) {
				if(check.subSequence(i, i+1).equals(randomString.substring(i,i+1))) {
					S++;
				}else {
					O++;
				}
			}
			for(int i = 0; i < check.length(); i++) {
				if(check.substring(i,i+1).contains(randomString)) {
					B++;
				}
			}
			if(S == B) {
				B = 0;
			}
			count++;
			System.out.println(count + " - " + "S : " + S + ", B : " + B + ", O : " + O);
			
			if(S == 3) {
				long endTime = System.currentTimeMillis();
				double gameTime = endTime - startTime;
				SimpleDateFormat timeFormat = new SimpleDateFormat("m ss"); 

				File file = new File("./baseballRecord.txt");
	            try {
					BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
	                bufferedWriter.write(random+"/"+count+" : " + timeFormat.format(gameTime));
	                bufferedWriter.newLine();
	                bufferedWriter.close();
					
				} catch (IOException e) {
					e.printStackTrace();
				}finally {
					System.exit(0);
				}
			}
			
		}while(true);
		
	}
}