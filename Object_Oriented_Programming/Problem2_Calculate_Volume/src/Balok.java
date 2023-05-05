class Balok {
    int sisi1;
    int sisi2;
    int tinggi;

    public Balok(int sisi1, int sisi2, int tinggi) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.tinggi = tinggi;
    }

    public int hitungVolumeBalok() {
        return this.sisi1*this.sisi2*this.tinggi;
    }
}
