import java.util.Collections;
import java.util.Comparator;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();
        Integer index = 0;
        Product product1 = new Product(144, "Phone", 100_000, 1);
        Product product2 = new Product(94, "Book", 120_000, 2);
        Product product3 = new Product(87, "People", 50_000, 3);
        shop.addProduct(product1);
        shop.addProduct(product2);
        shop.addProduct(product3);

        for (Product sh : shop.productList) {
            System.out.println(sh.getIndexProduct() + ". " + sh.getId() + " " + sh.getName() + " " + sh.getPrice());
        }

        System.out.println();

        Comparator priceComparator = new PriceComparator();
        Collections.sort(shop.productList, priceComparator);

        for (Product sh : shop.productList) {
            System.out.println(sh.getIndexProduct() + ". " + sh.getId() + " " + sh.getName() + " " + sh.getPrice());
        }

        System.out.println();

        for (Product sh : shop.productList) {
            System.out.println(sh.getIndexProduct() + ". " + sh.getId() + " " + sh.getName() + " " + sh.getPrice());
        }


        shop.deleteProduct(144);
        Product product4 = new Product(224, "Fish", 300, 4);
        shop.addProduct(product4);
        Comparator indexComparator = new IndexComparator();
        Collections.sort(shop.productList, indexComparator);

        System.out.println();

        for (Product sh : shop.productList) {
            System.out.println(sh.getIndexProduct() + ". " + sh.getId() + " " + sh.getName() + " " + sh.getPrice());
        }

        Product product5 = new Product(87, "People333", 144_111, 6);
        shop.editProduct(product5);

        System.out.println();

        for (Product sh : shop.productList) {
            System.out.println(sh.getIndexProduct() + ". " + sh.getId() + " " + sh.getName() + " " + sh.getPrice());
        }
    }

}
