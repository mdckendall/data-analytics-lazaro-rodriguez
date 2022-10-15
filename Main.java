import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<String> arrayList = new ArrayList<>();
		FileReader fr = new FileReader("names.txt");
		Scanner fileScanner = new Scanner(fr);
   while (fileScanner.hasNext()){
    arrayList.add(fileScanner.nextLine());
      
}
    fileScanner.close();
    Scanner input = new Scanner(System.in);
    
int choiceentry;
do{
System.out.println("Press 1 to learn about salary.");
System.out.println("Press 2 to learn about the job.");
System.out.println("Press 3 to learn about demand.");
System.out.println("Press 4 to view current students.");
System.out.println("Press 5 quit.");
  choiceentry = input.nextInt();

  if(choiceentry == 1){
    System.out.println("$98,345 average salary in South Florida!");
  }else if(choiceentry == 2){
    System.out.println("US new - 100 Best Jobs!");
    }else if(choiceentry == 3){
    System.out.println("Top 10 Forbes In-Demand Jobs!");
      }else if(choiceentry == 4){
      arrayList.forEach(System.out::println);
      
      }
  
  
} while (choiceentry != 5);
      
   
   fileScanner.close();


  
  
  
  
  
  
 
    
  }
} 
	
  
	
