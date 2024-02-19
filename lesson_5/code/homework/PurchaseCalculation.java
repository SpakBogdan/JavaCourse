package homework;

/**
Сделайте расчет покупки товаров со скидками.
Товар А стоит X евро и на него скидка D%, а товар B стоит Y евро и на него скидка С%.
Клиент взял N товаров A и M товаров B. Если сумма покупки превысила 100 евро, то полагается дополнительная скидка 5%.
Вычислите итоговую стоимость покупки и величину полученной скидки.
*/

public class PurchaseCalculation {
    public static void main(String[] args) {

        double priceA = 299;
        double discountD = 5; // в %
        int quantityA = 4;

        double priceB = 389;
        double discountC = 7; // в %
        int quantityB = 4;

        double discountedPriceA = priceA - (discountD / 100.0) * priceA;
        double discountedPriceB = priceB - (discountC / 100.0) * priceB;

        double totalCost = quantityA * discountedPriceA + quantityB * discountedPriceB;

        double additionalDiscount = 0;
        if (totalCost > 100) {
            additionalDiscount = 0.05 * totalCost;
            totalCost -= additionalDiscount;

        }

        System.out.println("Итоговая стоимость покупки: " + totalCost + " евро");
        System.out.println("Полученная скидка: " + additionalDiscount + " евро");
    }
}
