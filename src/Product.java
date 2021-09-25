import java.util.Collections;
import java.util.Comparator;

//implements Comparable<Product>

class PriceComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return (o1.price - o2.price);
    }
}

class IndexComparator implements Comparator<Product> {
    public int compare(Product o1, Product o2) {
        return (o2.indexProduct - o1.indexProduct);
    }
};

class Product {
    Integer id;
    Integer indexProduct;
    String name;
    Integer price;

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }

    public Integer getIndexProduct() {
        return indexProduct;
    }

    public Product(Integer id, String name, Integer price, Integer indexProduct) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.indexProduct = indexProduct;
    }


}
