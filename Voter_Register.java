import java.util.ArrayList;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Collections;

public class Assignment_10 {
	
	public static void read(String fileName, ArrayList<Voters> vList ) throws FileNotFoundException  {
		File newFile = new File (fileName);
		Scanner scan = new Scanner(newFile);
		String line;
		String [] data;
		while (scan.hasNextLine()) {
			line = scan.nextLine(); 
			data = line.split(","); 
			if (line.length()>1) {
				vList.add( new Voters (data[1],data[2],data[3],data[4],data[0]));
		 }
		}
	}
	
	public static void write(String fileName, ArrayList<Voters> vList) throws FileNotFoundException {
		PrintWriter outputFile = new PrintWriter (fileName); 
		for (int i=0;i<vList.size();i++) {
			outputFile.println(vList.get(i).toCSV());
		}
		outputFile.close();
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList <Voters> voterList = new ArrayList<Voters>();
		try {
		read("src//HI_Island_Voters.csv", voterList);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		finally {
			int num = 0;
			int a = 0;
			int b = 0;
			int c = 0;
			int d = 0;
			Collections.sort(voterList);
			System.out.print(voterList.size());
			System.out.print(" voters created.\n");
			for (int i=0; i<voterList.size(); i++) {
				num = voterList.get(i).getDistrictNum();
					if (num==1) {	
						 a++;
					} else if (num==2) {
						b++;
						
					}
					else if (num==3) {
						c++;
					}
			
					else if (num==4) {
						d++;
					}
					
			}
			int list1[] = {a,b,c,d};
			int one = 0;
			for (int j=0; j<list1.length; j++) {
				one++;
				System.out.println("District "+one+": "+list1[j]);
				
			}
			
			
		} System.out.println(" ");
		
	    
	    
		write("HI_Island_Voters_sorted.csv", voterList); 
		
		for (int i=0; i<voterList.size();i++) {
			System.out.println(voterList.get(i)); 
			System.out.println(); 
													
 }
}
}
	
	

	

