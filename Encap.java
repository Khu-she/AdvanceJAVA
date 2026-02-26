import java.util.ArrayList;

class Product{
    private int pid;
    private String productName;
    private double price;
    private int quantity;
    public Product(int pid, double price, String productName, int quantity) {
        this.pid = pid;
        this.price = price;
        this.productName = productName;
        this.quantity = quantity;
    }
    public int getPid() {
        return pid;
    }
    public String getproductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}
public class Encap{
    public static void main(String[] args) {

        ArrayList <Product> ary = new ArrayList<Product>();
        ary.add(new Product(2, 20000, "Mobile", 20));
        ary.add(new Product(3, 40000, "Mobile", 80));
        ary.add(new Product(4, 60000, "Mobile", 70));
        ary.add(new Product(5, 70000, "Mobile", 90));
        System.out.println("Product id\tProduct price\tProductName\tQuantity");
        for(Product p:ary){
           String result=String.format("pid=%d\t\tpname=%s\tprice=%.2f\tquantity=%d",p.getPid(),p.getproductName(),p.getPrice(),p.getQuantity());
            System.out.println(result); 
        }
        // Product p = new Product(1, 10000, "Mobile", 10);
        // String result=String.format("pid=%d,pname=%s,price=%.2f, and quantity=%d",p.getPid(),p.getproductName(),p.getPrice(),p.getQuantity());
        // System.out.println(result);       
    }
}