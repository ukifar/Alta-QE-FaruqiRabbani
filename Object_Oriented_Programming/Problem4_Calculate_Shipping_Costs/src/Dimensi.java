class Dimensi extends Input {
    @Override
    public int hitungDimensi() {
        float volume = 0;
        float bagiPer50 = 0;
        int harga = 0;
        double pembulatan = 0;

        volume = panjang * lebar * tinggi;
        bagiPer50 = volume / 50;
        pembulatan = Math.floor (bagiPer50);

        if (pembulatan <=1) {
            harga = 5000;
        } else {
            harga = (int) pembulatan * 5000;
        }

        return harga;
    }
}

//NOTE: Mas Charlie, ini saya pakai Math.floor karena kemarin Mas Charlie bilangnya pembulatan kebawah.
