//import java.util.ArrayList;
//
//
//class Product{
//    String id,name;
//    int quantity;
//    float price;
//
//    public Product(String id, String name, int quantity, float price) {
//        this.id = id;
//        this.name = name;
//        this.quantity = quantity;
//        this.price = price;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public int getQuantity() {
//        return quantity;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//}
//class Cart{
//    ArrayList<Product> productList=new ArrayList<>();
//    int totalItem(){
//        int tot=0;
//        for(Product p:productList){
//            tot+=p.getQuantity();
//        }
//        return tot;
//    }
//    float netPrice(){
//        float tot=0;
//        for(Product p:productList){
//            tot+=p.getQuantity()*p.getPrice();
//        }
//        return tot;
//    }
//
//}
//
//
//
//public class solution2 {
//    public static void main(String[] args) {
//
//    }
//
//}
