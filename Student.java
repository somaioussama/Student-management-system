import java.util.Scanner;
public class Student {
    static Scanner sc = new Scanner(System.in);
    private int id;
    private static int n=0;
    private String name;
    private double average;
    private boolean logedin = false;
    private String password;
    static String department= "IT";

    public Student(String name , String password, double average){
        this.name= name;
        this.password= password;
        this.average = average;
        n++;
        this.id = Integer.valueOf("2026"+String.valueOf(n));
    }
    public void LogIn (){
        System.out.print("Password: ");
        String mdp= sc.nextLine();
        if (password.equals(mdp)){
            this.logedin= true;
            System.out.println("Logged In");}
        else
            System.out.println("Incorrect password");
    }
    void LogOut(){
        this.logedin=false;
        System.out.println("Logged out");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getaverage() {
        return average;
    }

    public void setaverage(double moy) {
        this.average = moy;
    }
    static int NumStudents(){
        return n;
    }

    public int getId() {
        return id;
    }

    public boolean isLogedin() {
        return logedin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
