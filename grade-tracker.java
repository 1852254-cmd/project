import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GradeBook compsci = new GradeBook();
        compsci.addGrade(85.5);
        compsci.addGrade(90.0);
        compsci.addGrade(78.0);
        double avg = compsci.getAvg();
        System.out.println("Grade Average is: " + avg);
    }
}

class GradeBook {
    ArrayList<Double> grades = new ArrayList();
    
    public void addGrade(double grade) {
        this.grades.add(grade);
    }
    
    public double getAvg() {
        double total = 0;
        for (double grade: grades) {
            total += grade;
        }
        double avg = total/grades.size();
        return truncate(avg, 2);
    }
    
    public static double truncate(double value, int decimalPlaces) {
        double factor = Math.pow(10, decimalPlaces);
        return Math.floor(value * factor) / factor;
    }
}
