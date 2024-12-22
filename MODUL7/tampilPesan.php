<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Daftar Pesan</title>
    <link rel="stylesheet" href="css/Style.css">
</head>

<body>
    <div class="container">
        <h1>Daftar Pesan</h1>
        <?php
        // Koneksi ke database
        $conn = new mysqli("localhost", "root", "", "pesanan");

        // Cek koneksi
        if ($conn->connect_error) {
            die("<p class='error'>Koneksi gagal: " . $conn->connect_error . "</p>");
        }

        // Proses hapus pesan
        if (isset($_GET['hapus'])) {
            $idPesan = $_GET['hapus'];
            $queryHapus = "DELETE FROM pesan WHERE idPesan = $idPesan";

            if ($conn->query($queryHapus) === TRUE) {
                echo "<p>Pesan berhasil dihapus!</p>";
            } else {
                echo "<p class='error'>Pesan gagal dihapus: " . $conn->error . "</p>";
            }
        }

        // Query untuk mengambil data pesan
        $query = "SELECT * FROM pesan";
        $result = $conn->query($query);

        // Menampilkan daftar pesan
        if ($result->num_rows > 0) {
            echo "<table>
                    <tr>
                        <th>ID Pesan</th>
                        <th>ID Penerima</th>
                        <th>Judul</th>
                        <th>Isi Pesan</th>
                        <th>Aksi</th>
                    </tr>";

            while ($row = $result->fetch_assoc()) {
                echo "<tr>
                        <td>" . $row['idPesan'] . "</td>
                        <td>" . $row['idPenerima'] . "</td>
                        <td>" . $row['Judul'] . "</td>
                        <td>" . $row['TextPesan'] . "</td>
                        <td><a href='tampilPesan.php?hapus=" . $row['idPesan'] . "' class='action' onclick='return confirm(\"Yakin ingin menghapus pesan ini?\");'>Hapus</a></td>
                      </tr>";
            }

            echo "</table>";
        } else {
            echo "<p>Tidak ada pesan.</p>";
        }

        $conn->close();
        ?>
        <a href='Form_TambahPesan.php' class="action">Tambah Pesan</a>
    </div>
</body>

</html>
