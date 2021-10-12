import java.util.ArrayList; //import ArrayList into Java

class Main {
  public static void main(String[] args) {
   
   Student student1 = new Student();    //create new student object 
   
   student1.setName("Arnold Spielberg"); //set name    
   student1.setGPA(4.0);    //set GPA
   student1.setMajor("Electrical Engineering"); //set major

   student1.print(); //call print method and print student1 results

   Student student2 = new Student(); //create new student object

   student2.setName("Jacob Johnson");  //set name  
   student2.setGPA(4.3);     //set GPA
   student2.setMajor("Information Systems"); //set major

   student2.print(); //call print method and print student2 results

   ArrayList<Double> gpas = new ArrayList<Double>(); //create new ArrayList called gpas with type Double
   
   gpas.add(student1.gpa); //add student1 gpa
   gpas.add(student2.gpa); //add student2 gpa

   double sum = 0; //create and initialize sum variable

   for(double i : gpas) {  //for loop to sum GPA's in ArrayList
     sum = sum + i; //add sum variable + each GPA value
   }

  double avg = sum / gpas.size(); //create average variable and use sum from for loop and size method to calculate average.
  System.out.println("The average GPA is " + avg); //print average gpa for students
  }
}