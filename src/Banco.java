public class Banco {
    private Cuenta cuenta1;

    private Cuenta cuenta2;


    public Banco(Cuenta cuenta1, Cuenta cuenta2) {
        this.cuenta1 = cuenta1;
        this.cuenta2 = cuenta2;
    }

    public Cuenta getCuenta1() {
        return this.cuenta1;
    }

    public void setCuenta1(Cuenta cuenta1) {
        this.cuenta1 = cuenta1;
    }

    public Cuenta getCuenta2() {
        return this.cuenta2;
    }

    public void setCuenta2(Cuenta cuenta2) {
        this.cuenta2 = cuenta2;
    }

    public void transferir(Cuenta cuenta1,Cuenta cuenta2,double monto){
        if(cuenta1.validarMonto(monto)){
            cuenta1.setRetiro(monto);
            cuenta2.setIngreso(monto);
        }else{
            System.out.println("Fondos insuficientes");
        }

    }
}
