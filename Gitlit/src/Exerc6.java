//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exerc6 {
    public static void main(String[] args) {

        // Cálculo do fatorial de 5
        int val3 = 1;
        for (int n = 5; n >= 1; n--) {
            val3 *= n; // Multiplica val3 pelo valor atual de n
        }
        System.out.println("Fatorial de 5: " + val3);
    }
    }