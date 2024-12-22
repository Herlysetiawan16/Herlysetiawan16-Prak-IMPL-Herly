<!DOCTYPE html>
<html lang="id">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Tambah Pesan</title>
    <link rel="stylesheet" href="css/Style.css">
</head>

<body>
    <div class="container">
        <h1>Tambah Pesan</h1>
        <form action="simpanPesan.php" method="POST">
            <label for="idPenerima">ID Penerima:</label>
            <input type="text" id="idPenerima" name="idPenerima" placeholder="Masukkan ID Penerima" required>

            <label for="judul">Judul:</label>
            <input type="text" id="judul" name="judul" placeholder="Masukkan Judul Pesan" required>

            <label for="TextPesan">Isi Pesan:</label>
            <textarea id="TextPesan" name="TextPesan" placeholder="Tulis pesan Anda di sini..." rows="5" required></textarea>

            <input type="submit" value="Kirim Pesan">
        </form>
        <a href='tampilPesan.php' class="action">Daftar Pesan</a>
    </div>
</body>

</html>
