package week2LabÖdev1;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class main {

    public static void main(String[] args) throws IOException {

        String processType="Y";

        while(processType.equals("Y"))
        {
            System.out.println("Welcome to ABC Pty Ltd." + "\n" + "1.Enter an employee record"+ "\n" + "2.Read all employee"
                    + " records"+ "\n" + "0. Exit" +"\n"+ "Enter 1,2 or 0 :"+"\n");
            Scanner scan =new Scanner(System.in);
            int option = scan.nextInt();

            if (option==1)
            {
                System.out.println("Enter F for a full time employee" + "\n" + "Enter C for casual employee");
                Scanner myObj=new Scanner(System.in);
                String empType=myObj.nextLine();

                if (empType.equals("F"))
                {
                    Scanner obj=new Scanner(System.in);
                    System.out.println("Enter your employee number:");
                    int empNo=obj.nextInt();
                    System.out.println("Enter your name:");
                    String name=obj.next();
                    System.out.println("Enter your age:");
                    int age =obj.nextInt();
                    System.out.println("Enter your gender:");
                    String gender=obj.next();
                    System.out.println("Enter your salary:");
                    int salary =obj.nextInt();

                    Employee tempEmp=new Employee(empNo,name,age,gender,salary);

                    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bahajyy/Desktop/java/src/week2LabÖdev1/fulltime.txt"));
                    writer.write(tempEmp.toString());
                    writer.close();
                    System.out.println("Do you want to process another  record(Y/N):");
                    processType=obj.next();
                }
                else if (empType.equals("C"))
                {
                    Scanner obj2=new Scanner(System.in);
                    System.out.println("Enter your employee number:");
                    int empNoC=obj2.nextInt();
                    System.out.println("Enter your name:");
                    String nameC=obj2.next();
                    System.out.println("Enter your age:");
                    int ageC =obj2.nextInt();
                    System.out.println("Enter your gender:");
                    String genderC=obj2.next();
                    System.out.println("Enter a number of hours worked:");
                    int salaryC =obj2.nextInt()*20;

                    Employee tempEmpC=new Employee(empNoC,nameC,ageC,genderC,salaryC);

                    BufferedWriter writer = new BufferedWriter(new FileWriter("/Users/bahajyy/Desktop/java/src/week2LabÖdev1/casual.txt"));
                    writer.write(tempEmpC.toString());
                    writer.close();
                    System.out.println("Do you want to process another another record(Y/N):");
                    processType=obj2.next();

                }
            }
            else if (option==2){
                try {
                    File myObj = new File("/Users/bahajyy/Desktop/java/src/week2LabÖdev1/fulltime.txt");
                    File myObj2 = new File("/Users/bahajyy/Desktop/java/src/week2LabÖdev1/casual.txt");

                    Scanner myReader = new Scanner(myObj);
                    Scanner myReader2 = new Scanner(myObj2);

                    while (myReader.hasNextLine()) {
                        String data = myReader.nextLine();
                        System.out.println(data);
                    }
                    System.out.println("\n");
                    myReader.close();

                    while (myReader2.hasNextLine()){
                        String data2= myReader2.nextLine();
                        System.out.println(data2);
                    }
                    myReader2.close();
                } catch (FileNotFoundException e) {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
                System.out.println("Do you want to process another another record(Y/N):");
                Scanner obj3=new Scanner(System.in);
                processType=obj3.next();
            }
            else
                return;
            if (processType.equals("N"))
                return;


        }





    }

}
