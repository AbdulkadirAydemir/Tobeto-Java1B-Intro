public class Main {
    public static void main(String[] args) {

        String ortaMetin = "İlginizi çekebilir";
        String altMetin = "Vade Süresi";

        System.out.println(ortaMetin);
        System.out.println(altMetin);

        int vade = 12;

        double dolarDun = 18.14;
        double dolarBugun = 18.19;

        boolean dolarDustuMu = false;

        String okYounu = "";

        if (dolarBugun < dolarDun) {
            okYounu = "down.svg";
            System.out.println(okYounu);

        } else if (dolarBugun > dolarDun) {
            okYounu = "up.svg";
            System.out.println(okYounu);

        } else {
            okYounu = "equal.svg";
            System.out.println(okYounu);
        }

        String[] krediler = {
                "Hızlı Kredi",
                "Maaşını Halkbank'tan Al",
                "Mutlu Emekli"
        };

        for (int i = 0; i < krediler.length; i++) {
            System.out.println(krediler[i]);
        }
    }
}