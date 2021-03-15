import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Bryan Trejo & Hunter Clark
public abstract class VacationPackage {
    final void vacationPackage() {
        boolean upgrade = customerWantsUpgrade();
        
        travel(upgrade);
        lodging(upgrade);
        day1(upgrade);
        day2(upgrade);
        day3(upgrade);
        food(upgrade);
    }
    
    abstract void travel (boolean up);
    abstract void lodging (boolean up);
    abstract void day1 (boolean up);
    abstract void day2 (boolean up);
    abstract void day3 (boolean up);
    abstract void food (boolean up);
    
    public boolean customerWantsUpgrade() {
        String answer = null;
        System.out.println("Would you like to upgrade the current vacation package? (y/n):");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            answer = in.readLine();
        } catch (IOException ioe) {
            System.err.println("IO error trying to read your answer");
        }
        
        if (answer == null) {
            return false;
        }
        else {
            return answer.toLowerCase().startsWith("y");
        } 
    }
}
