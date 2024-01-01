import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart shoppingCart = new ShoppingCart();

        // Menambahkan beberapa produk ke keranjang belanja
        Product product1 = new Product("Produk 1", 10000);
        Product product2 = new Product("Produk 2", 15000);

        shoppingCart.addProduct(product1);
        shoppingCart.addProduct(product2);

        // Menampilkan isi keranjang belanja
        System.out.println("=== Isi Keranjang Belanja ===");
        for (Product product : shoppingCart.getCartItems()) {
            System.out.println(product.getName() + " - Rp " + product.getPrice());
        }
        System.out.println("============================");

        // Melakukan proses checkout
        System.out.println("Apakah Anda ingin checkout? (ya/tidak)");
        String checkoutOption = scanner.nextLine();

        if (checkoutOption.equalsIgnoreCase("ya")) {
            shoppingCart.checkout();
        } else {
            System.out.println("Terima kasih, selamat berbelanja kembali!");
        }
    }
}
