public class Conditional {
    public static void main(String[] args) {
        // Misalkan nilai-nilai berikut sebagai input
        int score = 750;  // Nilai score
        int income = 50000;  // Pendapatan
        boolean authorized = true;  // Status authorized
        
        // Refactoring dari kode asli
        if ((score <= 700) && ((income < 40000) || (income > 100000) || !authorized || (score <= 500)) && (income <= 100000)) {
            reject();
        } else {
            accept();
        }
    }

    // Fungsi untuk menerima
    public static void accept() {
        System.out.println("Accepted");
    }

    // Fungsi untuk menolak
    public static void reject() {
        System.out.println("Rejected");
    }
}
