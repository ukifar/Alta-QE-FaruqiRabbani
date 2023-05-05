class Berat extends Input {
    @Override
    public int hitungBerat() {
        int harga = 0;
        double dibulatkan = Math.floor(kg);
        return harga = (int) dibulatkan * 5000;
    }
}

//NOTE: Mas Charlie, ini saya pakai Math.floor karena kemarin Mas Charlie bilangnya pembulatan kebawah.
