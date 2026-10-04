import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int c=0,i=0;
        Student[] students= new Student[20];

        while (c != 9){
            System.out.println("1- Add a student");
            System.out.println("2- Number of students");
            System.out.println("3- Log in to a student account");
            System.out.println("4- is a student logged in");
            System.out.println("5- Search for a student by name");
            System.out.println("6- Get a student average");
            System.out.println("7- Renew password of a student");
            System.out.println("8- Log out from a student account");
            System.out.println("9- Exit");
            System.out.print("your choice: ");
            c= sc.nextInt();
            sc.nextLine();
            if (c==1){
                System.out.print("name: ");
                String n= sc.nextLine();
                System.out.print("password: ");
                String p= sc.nextLine();
                System.out.print("average: ");
                double m= sc.nextDouble();
                students[i]= new Student(n,p,m);
                i++;

            } else if (c == 2) {
                System.out.println("Number of students: "+ Student.NumStudents());

            } else if (c==3) {
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    students[j].LogIn();
                } else {
                    System.out.println("Student not found.");
                }

            } else if(c==4){
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    System.out.println(students[j].isLogedin());
                } else {
                    System.out.println("Student not found.");
                }

            } else if (c==5) {
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    System.out.println("id: "+students[j].getId());
                    System.out.println("name: "+students[j].getName());
                    System.out.println("average: "+students[j].getaverage());
                    System.out.println("is logged in: "+students[j].isLogedin());
                } else {
                    System.out.println("Student not found.");
                }


        } else if (c==6){
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    System.out.println("average: "+students[j].getaverage());
                } else {
                    System.out.println("Student not found.");
                }

        } else if (c==7){
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    System.out.print("New password: ");
                    String p= sc.nextLine();
                    students[j].setPassword(p);
                } else {
                    System.out.println("Student not found.");
                }


        } else if (c==8) {
                int j=0;
                System.out.print("Name: ");
                String n= sc.nextLine();
                for (j=0; j<i;j++) {
                    if (n.equals(students[j].getName()))
                        break;
                }
                if (j < i) {
                    students[j].LogOut();
                } else {
                    System.out.println("Student not found.");
                }

            }

            }

        sc.close();
        }

}
