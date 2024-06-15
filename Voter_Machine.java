public class Assignment08 {
    public static void main(String[] args) {
        String[] name = {"Grace Hopper", "Ada Lovelace", "Katherine Johnson", "Frances Allen", "Shafi Goldwasser"};
        int[][] group1 = {                 
                           {1,0,0,0,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0}, // Grace Hopper
                           {0,0,0,1,0,0,0,0,1,0,0,1,1,1,0,0,0,0,1,0}, // Ada LoveLace
                           {0,0,1,0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0}, // Katherine Johnson
                           {0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,1,1,1,0,1}, // Frances Allen 
                           {0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0}, // Shafi Goldwasser 
                           }; 
                           int[][] group2 = {
                            {0,0,1,0,0,0,0,0,0,0,0,1,1,0,0,0,0,0,0,0}, 
                            {0,0,0,1,0,0,0,0,0,1,0,0,0,1,1,1,0,0,0,1},
                            {1,1,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0},
                            {0,0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,1,0,0}, 
                            {0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,0,0}, 
                            };
                            
                            
        System.out.println("Voting Group 1");
        int winner = winnerIndex(group1,name);
        System.out.println("The winner is " + name[winner]);
        System.out.println("Raw data row x column: ");
        printAllData(group1);
        System.out.println("Raw data column x row: ");
        printTransposeData(group1);

        System.out.println("\nVoting Group 2");
        winner = winnerIndex(group2,name);
        System.out.println("The winner is " + name[winner]);
        System.out.println("Raw data row x column: ");
        printAllData(group2);
        System.out.println("Raw data column x row: ");
        printTransposeData(group2);
       
        
        
    
    }
    
    private static int winnerIndex(int group[][], String person[]) {
        int total = 0;
        
        int newArr [] = new int [5];
        for (int i = 0; i<person.length; i++) {
        
        for (int row = 0; row<group.length; row++) {
            total = 0;
            for (int col = 0; col<group[row].length; col++) {
                total = total+group[row][col];
                
                if (col==group[row].length-1) {
                     System.out.println("Votes for "+person[i++]+" "+"= "+total);
                     
                }
        newArr[row]=total;
                       }
                     
                    }
                }
        int max = newArr[0]; 
        int index=0;
        for (int j=0; j<newArr.length; j++) {
            if(newArr[j]>max) {
                max=newArr[j];
                index=j;
            }
        }
        return index;  
    }
    private static int[][] printTransposeData(int group[][]) {
        
    
    for (int col=0;col<20;col++) {
			for (int row=0; row<group.length;row++) {
				System.out.print(group[row][col]); 
			}
			System.out.println();
			
		}
		return group;
    }
private static int[][] printAllData(int group[][]) {
    
      
    for (int row=0;row<group.length;row++) {
			for (int col=0; col<group[row].length;col++) {
				System.out.print(group[row][col]); 
			}
			System.out.println();
			
		}
		return group;
    }
  

}


 
    


