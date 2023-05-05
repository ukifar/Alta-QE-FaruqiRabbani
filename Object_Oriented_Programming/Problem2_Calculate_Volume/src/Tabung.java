class Tabung {
    float jarijari;
    float tinggi;

    public Tabung(float jarijari, float tinggi) {
        this.jarijari = jarijari;
        this.tinggi = tinggi;
    }

    public float hitungVolumeTabung() {
        float luasLingkaran = ((22)*this.jarijari*this.jarijari)/7;
        float volumeTabung = luasLingkaran * this.tinggi;
        return volumeTabung;
    }
}
