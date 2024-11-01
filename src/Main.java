/**
 * Kelas BookOrder merepresentasikan sebuah pesanan buku.
 * Kelas ini mencakup detail tentang buku seperti judul, jumlah, harga,
 * serta menyediakan metode untuk menghitung total harga dengan pajak.
 */
class BookOrder {
    // Konstanta pajak sebesar 10%
    private static final double pajak = 1.10;
    private String bookTitle;
    private int quantity;
    private double price;

    /**
     * Konstruktor untuk membuat objek BookOrder dengan detail pesanan.
     *
     * @param bookTitle judul buku yang dipesan
     * @param quantity jumlah buku yang dipesan
     * @param price harga satuan buku
     */
    public BookOrder(String bookTitle, int quantity, double price) {
        this.setBookTitle(bookTitle);
        this.setQuantity(quantity);
        this.setPrice(price);
    }

    /**
     * Menghitung total harga pesanan termasuk pajak sebesar 10%.
     *
     * @return total harga pesanan dengan pajak
     */
    public double calculateTotalPrice() {
        return getPrice() * getQuantity() * pajak;

    }

    /**
     * Menampilkan detail pesanan buku beserta total harganya.
     */
    public void showOrderDetails() {
        displayOrderDetails();
        displayTotalPrice();
    }

    /**
     * Menampilkan detail pesanan, yaitu judul buku, jumlah, dan harga satuan.
     */
    private void displayOrderDetails() {
        System.out.println("Book Title: " + getBookTitle());
        System.out.println("Quantity: " + getQuantity());
        System.out.println("Price: " + getPrice());
    }

    /**
     * Menampilkan total harga pesanan setelah dihitung menggunakan metode
     * {@link #calculateTotalPrice()}.
     */
    private void displayTotalPrice() {
        System.out.println("Total Price: " + calculateTotalPrice());
    }

    /**
     * Mengambil judul buku pesanan.
     *
     * @return judul buku
     */
    private String getBookTitle() {
        return bookTitle;
    }

    /**
     * Mengatur judul buku pesanan.
     *
     * @param bookTitle judul buku
     */
    private void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Mengambil jumlah buku yang dipesan.
     *
     * @return jumlah buku
     */
    private int getQuantity() {
        return quantity;
    }

    /**
     * Mengatur jumlah buku yang dipesan.
     *
     * @param quantity jumlah buku
     */
    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * Mengambil harga satuan buku.
     *
     * @return harga satuan buku
     */
    private double getPrice() {
        return price;
    }

    /**
     * Mengatur harga satuan buku.
     *
     * @param price harga satuan buku
     */
    private void setPrice(double price) {
        this.price = price;
    }
}

/**
 * Kelas Main berfungsi untuk menjalankan program BookOrder.
 */
public class Main {
    /**
     * Metode utama untuk menjalankan program.
     * Membuat instance dari BookOrder dan menampilkan detail pesanan.
     *
     * @param args argumen baris perintah
     */
    public static void main(String[] args) {
        BookOrder order = new BookOrder("Learn Java", 2, 150.0);
        order.showOrderDetails();
    }
}
