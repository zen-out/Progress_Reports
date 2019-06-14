/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progress.reports;
import java.util.*; 
/**
 *
 * @author lesleycheung
 */
// template of progress report 
public class secondPart {
    private String name; 
    private Map <String, ArrayList<String>> benchmarks; 
    private String initials; 
    private String progressReportingPeriod; 
    private String nameOfClass; 
    private String heshe; 
    private String hisher; 
    private ArrayList<String> goalAreas; 
    
    public secondPart(String name, HashMap<String, ArrayList<String>> benchmarks) {
        this.name = name; 
        this.benchmarks = benchmarks; 
        this.initials = new String(); 
        this.progressReportingPeriod = new String(); 
        this.nameOfClass = new String();
        this.hisher = new String(); 
        this.heshe = new String(); 
        this.goalAreas = new ArrayList<String>(); 
    } 
    // What class?
    public void secondPart1(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the class that is being commented on?");
        System.out.println("Keep it short - e.g., HN English; HN World History II; Sub-Seperate Math");
        this.nameOfClass = reader.nextLine(); 
    }
    // what progress reporting period?
    public void secondPart2(){
        Scanner reader = new Scanner(System.in); 
        System.out.println("What is the progress reporting period?");
        System.out.println("Input a number between 1 and 4");
        int period = Integer.parseInt(reader.nextLine());
        if (period == 1) {
            this.progressReportingPeriod = "Progress Reporting Period #1";
        } else if (period == 2) {
            this.progressReportingPeriod = "Progress Reporting Period #2";
        } else if (period == 3) {
            this.progressReportingPeriod = "Progress Reporting Period #3";
        } else if (period == 4) {
            this.progressReportingPeriod = "Progress Reporting Period #4";
        } else {
            System.out.println("Please enter a number between 1 and 4");
        }
    };
    // What gender? 
    public void secondPart3() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("Whoops - I don't quite have a system in which to seperate girls from boys -");
        while (true) {
            System.out.println("Enter [1] for female, [2] for male, [3] no comment");
            System.out.println("Enter a number, please!");
            int ans = Integer.parseInt(reader.nextLine()); 
        if (ans == 1) {
            this.hisher = "her";
            this.heshe = "she";
            break; 
        } else if (ans == 2) {
            this.hisher = "his";
            this.heshe = "he";
            break; 
        } else if (ans == 3) {
            this.hisher = this.name; 
            this.heshe = this.name; 
            break; 
        } else {
            System.out.println("Please enter a number!");
        }
        }
    }
    public void secondPart4() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("What are your initials?");
        System.out.println("Just enter 2-3 letters, please");
        this.initials = reader.nextLine(); 
    }
    
    public void secondPart5(){
        Scanner reader = new Scanner(System.in); 
        String get = new String(); 
        for (int i = 0; i < this.benchmarks.size(); i++) {
            int num = i + 1; 
            System.out.println("Is goal " + num + " an [1] organization, [2] writing, [3] reading or [4] math goal?");
            System.out.println("Enter a number, please");
            System.out.println("Remember, goal " + num + " is " + this.benchmarks.get(i));
            int goalArea = Integer.parseInt(reader.nextLine()); 
            if (goalArea == 1) {
                get = getOrganization(); 
            } else if (goalArea == 2) {
                get = getWriting(); 
            } else if (goalArea == 3) {
                get = getReading(); 
            } else if (goalArea == 4) {
                get = getMath(); 
            } else {
                System.out.println("Sorry, please type in a number");
            }
    }this.goalAreas.add(get); 
    }
    
    public void secondPart6() {
        Scanner reader = new Scanner(System.in); 
        System.out.println("How did " + this.name + " perform on the goal?");
        System.out.println("[1] Awesome!! [2] Okay (making progress) [3] Really made no progress / struggled in making progress");
        int num = Integer.parseInt(reader.nextLine());
        
    }
    public void great(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println(this.name + " exceed in " + goalArea);
            System.out.println(this.name + " has been a positive influence on the class, and we are proud to see " + this.name +"'s progress over the past quarter("+ this.initials +").");
            System.out.println("");
            System.out.println();
        });
    }
    
    public void okay(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println(this.name + " did well in " + goalArea);
            System.out.println(this.heshe + " may need to continue to work hard on all assignments (as well as completing them on time).");
            System.out.println("Based on " + this.name + "'s current rate of progress, and with continued direct instruction and support, ");
            System.out.println(this.name + "should be able to achieve this annual goal by the end of the IEP period ("+ this.initials +").");
            System.out.println();
        });
    }
    
    public void bad(String goalArea){
        this.benchmarks.forEach((k, v) -> {
            System.out.print(k + " = ");
            v.forEach(w -> System.out.print(w + ","));
            System.out.println(this.name + " struggled in " + goalArea);
            System.out.println(this.heshe + " is able to use checklists in class, but " + this.name + " may need to work on doing so independently.");
            System.out.print(this.name + " still requires extensive teacher-guided practice - With increased motivation and consistent effort and progress, it may be possible for " +this.name+" to achieve this goal" + this.initials + ".");
            System.out.println();
        });
    }
    
    public String getOrganization() {
        String organization = " utilizing an organizational system in checking with " + this.hisher + " teachers";
        return organization; 
    }
    
    public String getReading() {
        String reading = " reading to identify the main idea of various passages.";
        return reading; 
    }
    
    public String getWriting(){
        String writing = " writing a cohesive multi-paragraph writing piece.";
        return writing; 
    }
    
    public String getMath() {
        String math = " solving complex word problems by breaking each step down."; 
        return math; 
    }
    public String draftreport(){
        String pt1 = this.progressReportingPeriod + " " + this.nameOfClass + this.name; 
        return pt1; 
    }
    
}
