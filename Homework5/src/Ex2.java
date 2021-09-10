public class Ex2 {
    public static void main(String[] args) {
        String nume = "Mihai Munteanu";
        int anulNasterii = 1965;
        String functiaOcupata = "sef Sectie";
        int perioadaDeLucru = 5;
        double salariu = 5000.95;
        String nume2 = "Nicolai Ursu";
        int anulNasterii2 = 1955;
        String functiaOcupata2 = "Contabil";
        int perioadaDeLucru2 = 10;
        double salariu2 = 10800.55;
        String nume3 = "Elena Sadoveanu";
        int anulNasterii3 = 1990;
        String functiaOcupata3 = "consultant";
        int perioadaDeLucru3 = 2;
        double salariu3 = 7800.00;
        double salariuMarit = salariu + 500;
        double salariuMarit2 = salariu2 + 500;
        double salariuMarit3 = salariu3 + 500;
        if (perioadaDeLucru > 4) {
            System.out.println(nume + " " + "din "  + anulNasterii + "," + functiaOcupata + " " + "Resurse Umane" +","
                    + "i-a fost marit " + "salariu cu 500 de lei si la momentul dat constituie " +  salariuMarit + "lei");
        }
        if (perioadaDeLucru2 > 4) {
            System.out.println(nume2 + " " + "din " + anulNasterii2 + "," + functiaOcupata2 + " " + "Resurse Umane" +","
                    + "i-a fost marit " + "salariu cu 500 de lei si la momentul dat constituie " + salariuMarit2 + "lei");
        }
        if (perioadaDeLucru3 > 4) {
            System.out.println(nume3 + " " + "din " + anulNasterii3 + "," + functiaOcupata3 + " " + "Resurse Umane" +","
                    + "i-a fost marit " + "salariu cu 500 de lei si la momentul dat constituie " + salariuMarit3 + "lei");
        }

    }
}
