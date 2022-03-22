import java.util.List;

class Product{
    Integer id;
    String name;
    Double price;

    public Product(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
class Implementation{
    long getCountAbove10(List<Product> products){
        long count=0;
        for (Product p:products) {
            if(p.price>10){
                count++;
            }
        }
        return count;
    }
    double getAverage(List<Product> products){
        double avg=0;
        double count=0;
        double sum=0;
        for (Product p:products){
            sum+=p.price;
            count++;
        }
        avg=(sum/count);
        return avg;

    }
}


public class solutin4 {
}
