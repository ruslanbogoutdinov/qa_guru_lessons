import org.junit.jupiter.api.Test;

public class ThirdBranchClass {
    @Test
    public void calculateSomeNumbers(){
        int y = 0;
        for (int i = 0; i < 10; i++) {
            y += i;
        }
        System.out.println("Total amount is: "+y);
        System.out.println("FIFTH");
    }
}
