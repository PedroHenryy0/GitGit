//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Exerc5 {
    public static void main(String[] args) {

        //5. Nùmeros Ímpares até N
        for (int m = 0; m <= 15; m++){ // While m <+ 15, add +1
            if (m % 2 == 0){ // If m % 2 = 0, add +1 to m and it will become false, this is the "Ímpares" numbers
                m++;

            } System.out.println("Números Ímpares: " + m);
        }
    }
}