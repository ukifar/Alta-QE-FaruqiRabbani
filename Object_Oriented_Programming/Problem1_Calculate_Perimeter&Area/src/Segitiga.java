public class Segitiga {
    double alas;
    double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double kelilingSegitiga() {
        double keliling = 0;
        double sisiMiring = 0;
        sisiMiring = Math.sqrt((alas*alas) + (tinggi*tinggi));
        keliling = sisiMiring + alas + tinggi;
        return keliling;
    }
    public double luasSegitiga() {
        double louas = 0;
        louas = ((alas*tinggi)/2);
        return louas;
    }
}