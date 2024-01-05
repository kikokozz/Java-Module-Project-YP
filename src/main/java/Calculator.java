public class Calculator {

String tovar = "";
double sum;


public void tovarName(String tovar, double cost) {

    if (cost < 1) {
        System.out.println("Товар не может столько стоить, повторите ввод суммы");
    }
    else {
        sum += cost;
        this.tovar += tovar + ", ";
        System.out.println("Отлично, товар добавлен в корзину");
    }
}
public void check(int howMany) {

    System.out.println("Все добавленные товары:");
    System.out.println(this.tovar);
    System.out.println("Каждый человек должен заплатить: " + String.format("%.2f", sum)) ;

}
public String price() {
    if ((int)(sum % 100/10) == 1) {
        return " рублей.";
    }
    switch ((int)(sum % 10)) {
        case 1:
            return " рубль.";
        case 2:
        case 3:
        case 4:
            return " рубля.";
        default:
            return " рублей.";
    }
}


}
