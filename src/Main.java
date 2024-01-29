//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int account = 100;

        int add = 1150;

        int bonus;

        if (add > 1000) {
            bonus = add / 100;
        } else {
            bonus = 0;
        }
        int balans = account + add + bonus;

        System.out.println("Ваш баланс" + balans + "Рублей");

        System.out.println("Ваш бонус" + bonus + "Рублей");
    }

}
