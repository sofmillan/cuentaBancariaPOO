public class Main {
    public static void main(String[] args) {
        Cuenta cuentaSofia = new Cuenta(40000,"Sofia");
        Cuenta cuentaNiki = new Cuenta(30000,"Niki");
        cuentaSofia.setIngreso(20000);
      /* cuentaSofia.setRetiro(50000);
        System.out.println(cuentaSofia.getDatosCuenta());
        double saldo = cuentaSofia.getSaldoCuenta();
        System.out.println(saldo);*/

        Banco banco = new Banco(cuentaNiki,cuentaSofia);
        banco.transferir(cuentaNiki,cuentaSofia,5000);
        System.out.println(cuentaSofia.getDatosCuenta());
        System.out.println(cuentaNiki.getDatosCuenta());

        banco.transferir(cuentaNiki,cuentaSofia,600000);


        }
    }
