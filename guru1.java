public class guru1 {
    public static void main(String[] args) {
        guru munif = new guru();
        guru firdaus = new guru();
        guru bagus = new guru();
        guru aulia = new guru();
        guru tulus = new guru();

        munif.id = 11;
        munif.nama = "Munif";
        munif.alamat = "Malang";
        munif.mapel = "PAI";

        firdaus.id = 12;
        firdaus.nama = "Firdaus";
        firdaus.alamat = "Malang";
        firdaus.mapel = "RPL";

        bagus.id = 13;
        bagus.nama = "Bagus";
        bagus.alamat = "Surabaya";
        bagus.mapel = "INFORMATIKA";

        aulia.id = 14;
        aulia.nama = "Aulia";
        aulia.alamat = "Malang";
        aulia.mapel = "RPL";

        tulus.id = 15;
        tulus.nama = "Tulus";
        tulus.alamat = "Jakarta";
        tulus.mapel = "IPAS";

        System.out.println("Data diri Pak Munif");
        System.out.println(munif.id);
        System.out.println(munif.nama);
        System.out.println(munif.alamat);
        System.out.println(munif.mapel);

        System.out.println("Data diri Pak Firdaus");
        System.out.println(firdaus.id);
        System.out.println(firdaus.nama);
        System.out.println(firdaus.alamat);
        System.out.println(firdaus.mapel);

        System.out.println("Data diri Pak Bagus");
        System.out.println(bagus.id);
        System.out.println(bagus.nama);
        System.out.println(bagus.alamat);
        System.out.println(bagus.mapel);

        System.out.println("Data diri Pak Aulia");
        System.out.println(aulia.id);
        System.out.println(aulia.nama);
        System.out.println(aulia.alamat);
        System.out.println(aulia.mapel);

        System.out.println("Data diri Pak Tulus");
        System.out.println(tulus.id);
        System.out.println(tulus.nama);
        System.out.println(tulus.alamat);
        System.out.println(tulus.mapel);
    }
}
