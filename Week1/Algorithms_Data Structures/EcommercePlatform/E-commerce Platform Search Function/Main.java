public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(1, "iPhone", "Electronics"),
            new Product(2, "T-shirt", "Clothing"),
            new Product(3, "MacBook", "Electronics"),
            new Product(4, "Shoes", "Footwear")
        };

        
        Product result1 = LinearSearch.linearSearch(products, "MacBook");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        
        BinarySearch.sortByName(products);
        Product result2 = BinarySearch.binarySearch(products, "MacBook");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}
