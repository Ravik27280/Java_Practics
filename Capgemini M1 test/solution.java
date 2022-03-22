//import java.util.ArrayList;
//
//class Product{
//   ArrayList<String> productList=new ArrayList<>();
//   void addProduct(String pName){
//       productList.add(pName);
//   }
//   void removeProduct(String pName){
//       if(productList.contains(pName)){
//           productList.remove(pName);
//       }
//   }
//   int uniqueProduct(){
//       int unique= (int) productList.stream().distinct().count();
//       return  unique;
//   }
//}
//
//
//public class solution {
//    public static void main(String[] args) {
//        Product p1=new Product();
//        p1.addProduct("Pem");
//        p1.addProduct("copy");
//        p1.removeProduct("Pem");
//        p1.addProduct("Pem");
//        int count= p1.uniqueProduct();
//        System.out.println(count);
//
//    }
//}
