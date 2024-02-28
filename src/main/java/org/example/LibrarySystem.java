
import java.util.Scanner;
//mengambil fungsi scanner dari library yang berfungsi sebagai pembaca input dari pengguna

//ini adalah fungsi utama dari program
public class LibrarySystem {

    // Data admin (username dan password)
    private static final String ADMIN_USERNAME = "admin";
    private static final String ADMIN_PASSWORD = "admin123";

    public static void main(String[] args) {
        // Membuat objek LibrarySystem
        LibrarySystem librarySystem = new LibrarySystem();
        // Menjalankan program login
        librarySystem.login();
    }

    // Method untuk login
    public void login() {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jenis user
        System.out.print("Masukkan jenis user (admin/mahasiswa): ");
        String userType = scanner.nextLine().toLowerCase();

        if (userType.equals("admin")) {
            // Login sebagai admin
            adminLogin(scanner);
        } else if (userType.equals("mahasiswa")) {
            // Login sebagai mahasiswa
            mahasiswaLogin(scanner);
        } else {
            System.out.println("Jenis user tidak valid.");
        }

        scanner.close();
    }

    // Method untuk login sebagai admin
    private void adminLogin(Scanner scanner) {
        // Meminta input username
        System.out.print("Masukkan username admin: ");
        String username = scanner.nextLine();
        // Meminta input password
        System.out.print("Masukkan password admin: ");
        String password = scanner.nextLine();

        // Memeriksa apakah username dan password benar
        if (username.equals(ADMIN_USERNAME) && password.equals(ADMIN_PASSWORD)) {
            System.out.println("Login admin berhasil.");
        } else {
            System.out.println("Username atau password admin salah.");
        }
    }

    // Method untuk login sebagai mahasiswa
    private void mahasiswaLogin(Scanner scanner) {
        // Meminta input NIM
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        // Memeriksa panjang NIM
        if (nim.length() != 15) {
            System.out.println("NIM tidak valid.");
            return;
        }

        System.out.println("Login mahasiswa berhasil.");
    }
}
