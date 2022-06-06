import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Pedido {
    private String id;
    private double total;
    private boolean isPaid;
    private List <Items> invoiceItems;


    public Pedido(String id, double total, boolean isPaid, List <Items> invoiceItems) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.invoiceItems = invoiceItems;
    }



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List <Items> getInvoiceItems() {

        return invoiceItems;
    }

    public void setInvoiceItems(List <Items> invoiceItems) {
        this.invoiceItems = invoiceItems;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", invoiceItems=" + invoiceItems +
                '}';
    }
}
