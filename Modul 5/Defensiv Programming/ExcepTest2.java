try {
    file = new FileInputStream(fileName);
    x = (byte) file.read();
} catch (FileNotFoundException f) {
    f.printStackTrace();
    return -1;
} catch (IOException i) {
    i.printStackTrace();
    return -1;
}
