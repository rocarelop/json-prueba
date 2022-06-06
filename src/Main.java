import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Items cocaCola = new Items("Coca cola 2L", "10");
        Items rum = new Items("Rum Santa Teresa 0.7L", "15");
        Items iceBag = new Items("Ice bag L", "5.5");
        List<Items> itemsPedido1 =  List.of(cocaCola, rum,iceBag);

        Pedido pedido1 = new Pedido("YMZ-0000001", 30.5, false, itemsPedido1);

        System.out.println(pedido1);
    }
}
