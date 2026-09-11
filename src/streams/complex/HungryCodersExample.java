package streams.complex;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HungryCodersExample {
    public static void main(String[] args) {
        //Create immutable list, allows nulls
        var immutableList = Stream.of("red","green",null).toList();
        //immutableList.add("blue");
        //Adding a new value to the above list gives UnsupportedOperationException
        System.out.println(immutableList);

        //Modifiable list, allows null
        var modifiableList = Stream.of("red","green",null).collect(Collectors.toList());
        modifiableList.add("blue");
        modifiableList.set(2,"yellow");
        System.out.println(modifiableList);

        //Create a recod of Product
        record Product(String name,
                       String category,
                       int price){};

        Stream<Product> products = Stream.of(
                new Product("Laptop","Electronics",1000),
                new Product("TV","Electronics",1500),
                new Product("Sofa","Furniture",700),
                new Product("Table","Furniture",300),
                new Product("Lamp","Home Decor",50)
        );

        //Grouping products by category
        /*Map<String, List<Product>> productsByCategory = products.collect(Collectors.groupingBy(Product::category));
        System.out.println(productsByCategory);*/

        //Total price of products in each category
        /*Map<String,Integer> totalPriceByCategory = products.collect(Collectors.groupingBy(Product::category,
                Collectors.summingInt(Product::price)));
        System.out.println(totalPriceByCategory);*/

        //Average price of products by category
       /* Map<String,Double> avgPriceByCategory = products.collect(Collectors.groupingBy(Product::category,
                Collectors.averagingInt(Product::price)));
        System.out.println(avgPriceByCategory);*/

        //Count products by category
        /*Map<String,Long> countProductsByCategory = products.collect(Collectors.groupingBy(Product::category,
                Collectors.counting()));
        System.out.println(countProductsByCategory);*/

        //List of product names
        /*List<String> productNames = products.map(Product::name).toList();
        System.out.println(productNames);*/

        //Partitioning: Separate products as cheap and expensive
        /*var partitionedProducts = products.collect(Collectors.partitioningBy(product -> product.price>1000));
        System.out.println(partitionedProducts);*/

        //Summary statistics(Sum,Avg,min,max,count metrics) for product prices by category
        Map<String, IntSummaryStatistics> summaryStatisticByPrice = products.collect(Collectors.groupingBy(Product::category,
                Collectors.summarizingInt(Product::price)));
        System.out.println(summaryStatisticByPrice);
    }
}
