import org.junit.Test;

public class Main {
    @Test
    public void solve() {
        String number = Integer.toBinaryString(20);
        int count = 0;
        for (int i = 0; i < number.length() - 1; i++) {
            if (number.charAt(i) != number.charAt(i + 1)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
