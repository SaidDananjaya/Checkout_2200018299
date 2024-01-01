import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public void removeProduct(Product product) {
        cartItems.remove(product);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product product : cartItems) {
            total += product.getPrice();
        }
        return total;
    }

    public void checkout() {
        System.out.println("===== Checkout =====");
        for (Product product : cartItems) {
            System.out.println(product.getName() + " - Rp " + product.getPrice());
        }
        System.out.println("====================");
        System.out.println("Total: Rp " + calculateTotal());
        System.out.println("Terima kasih telah berbelanja!");
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
}
