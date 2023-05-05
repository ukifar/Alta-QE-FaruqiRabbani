public class Persegi {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public int kelilingPersegi() {
        return this.sisi*4;
    }
    public int luasPersegi() {
        return this.sisi*this.sisi;
    }
}
