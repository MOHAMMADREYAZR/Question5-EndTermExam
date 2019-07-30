package main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class ToughQuestion2 {
            public static void main(String[] args) throws NumberFormatException, IOException {
                        Integer bread;
                        Integer butter;
                        Integer jam;
                        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                        Calories cal=new Calories();
                        System.out.println("1.Bread only\n2.Bread+Jam\n3.Bread+Jam+Butter");
                        System.out.println("Enter the choice");
                        Integer choice = Integer.parseInt(br.readLine());
                        switch(choice)
                        {
                        case 1 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	//call the function which calculate the calories for only bread
                        	int a= cal.calculateCalories(bread);
                        	
                        	System.out.println(a);
                        	break;
                        case 2 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	
                        	int v= cal.calculateCalories(bread,jam);
                        	System.out.println(v);
                        	break;
                        case 3 : System.out.println("Enter the number of Slice of bread");
                        	bread = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Jam");
                        	jam = Integer.parseInt(br.readLine());
                        	System.out.println("Enter the number teaspoon of Butter");
                        	butter = Integer.parseInt(br.readLine());
                        	
                     	  int t= cal.calculateCalories(bread,jam,butter);
                     	  System.out.println(t);
                        	break;
                        }
                        //System.out.printf("%.3f",ca.calculateEnergy());
                        //System.out.println(" kJ of energy generated from "+ca.returnCalories()+" calories");
            }
}
class Calories {
            
          int calculateCalories(int bread) {
            //you have to overload this function for three parameters refer the question
            	int a =bread * 74;
            	
            	return a;
            }
           int calculateCalories(int bread,int jam) {
        	   int a =bread * 74;
        	   int c= jam * 26;
           int b=a  + c  ;
           	return b;
               }
          int calculateCalories(int bread,int jam ,int butter) {
        	   int a =bread * 74;
        	   int c= jam * 26;
        	   int d= butter * 102;
           	int b=a+ c + d;
           	return b;
               }
            
            
            
}