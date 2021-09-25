import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Shop {
    List<Product> productList = new ArrayList<>();

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public List<Product> showProduct() {
        return productList;
    }

    public void addProduct(Product t) {
        Boolean index = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == t.getId())
                index = false;
        }
        if (index)
            productList.add(t);
        else
            System.out.println("Товар с таким id уже есть! Товар не будет добавлен!");
    }

    public void deleteProduct(Integer id) {
        int index = -1;
        int x = -1;
        for (int i = 0; i < productList.size(); i++) {
            index = productList.get(i).getId();
            if (index == id) {
                x = i;
            }
        }
        productList.remove(x);
    }


    public void editProduct(Product t) {
        Boolean index = false;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == t.getId()) {
                productList.get(i).setName(t.getName());
                productList.get(i).setPrice(t.getPrice());
                index = true;
                break;
            }
        }
        if (!index) System.out.println("Товара с таким id не найдено! Товар не отредактирован!");
    }
}
