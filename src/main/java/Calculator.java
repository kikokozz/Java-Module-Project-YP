public class Calculator {

String tovar = "";
double sum;


public void tovarName(String tovar, double cost) {

    if (cost < 1) {
        System.out.println("Извините, товар не может столько стоить.");
    }
    else {
        sum += cost;
        this.tovar += tovar + ", ";
        System.out.println("Отлично, товар добавлен в корзину.");
    }
}
public void check(int howMany) {

    System.out.println("Все добавленные товары:");
    System.out.println(this.tovar);
    //this.tovar.substring(0, this.tovar.lenght() - 1);
    System.out.println("Общая цена заказа: " + String.format("%.2f", sum)) ;
    System.out.print("Каждый человек должен заплатить: " + String.format("%.2f", sum/howMany)) ;

}
public String price(int howMany) {
    if ((int)((sum/howMany) % 100/10) == 1) {
        return " рублей.";
    }
    return switch ((int) ((sum / howMany) % 10)) {
        case 1 -> " рубль.";
        case 2, 3, 4 -> " рубля.";
        default -> " рублей.";
    };
}
//public String removeLastChar(String tovar) {
  //  tovar = this.tovar;
   // if (tovar != null) {
    //    tovar.substring(0, tovar.length() - 2);
    //     this.tovar = tovar;
    //    return this.tovar;
   // }
   // else {
   //     return this.tovar;
  //  }
//}


}
