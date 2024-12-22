<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Simpan Pesan</title>
    <link rel="stylesheet" href="css/Style.css">
</head>

<body>
    <div class="container">
        <?php
        if ($_SERVER['REQUEST_METHOD'] == 'POST') {
            // Koneksi ke database
            $conn = new mysqli("localhost", "root", "", "pesanan");

            // Cek koneksi
            if ($conn->connect_error) {
                die("<p class='error'>Koneksi gagal: " . $conn->connect_error . "</p>");
            }

            // Ambil data dari form
            $idPenerima = $_POST['idPenerima'];
            $judul = $_POST['judul'];
            $textPesan = $_POST['TextPesan'];

            // Query untuk menyimpan data
            $query = "INSERT INTO pesan (idPenerima, Judul, TextPesan) 
                      VALUES ('$idPenerima', '$judul', '$textPesan')";

            if ($conn->query($query) === TRUE) {
                echo "<p>Pesan berhasil disimpan!</p>";
                echo "<a href='tampilPesan.php' class='action'>Lihat Daftar Pesan</a>";
            } else {
                echo "<p class='error'>Pesan gagal disimpan: " . $conn->error . "</p>";
            }

            $conn->close();
        } else {
            echo "<p class='error'>Metode HTTP tidak diizinkan.</p>";
        }
        ?>
    </div>
</body>

</html>
