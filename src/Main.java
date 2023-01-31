public class Main {
    public static void main(String[] args) {
        Cuenta cuentaSofia = new Cuenta(40000,"Sofia");

        cuentaSofia.setIngreso(20000);
        cuentaSofia.setRetiro(50000);
        cuentaSofia.getDatosCuenta();
        double saldo = cuentaSofia.getSaldoCuenta();
        System.out.println(saldo);
        }
    }
