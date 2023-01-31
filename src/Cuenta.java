public class Cuenta {
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public Cuenta(){

    }
    public Cuenta(double saldoDeCuenta, String nombreDelTitular){
        this.saldoDeCuenta  =  saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        this.numeroDeCuenta = (long)(Math.random()*100000+1);
    }

    public void setIngreso(double ingreso) {
        this.saldoDeCuenta +=ingreso;
    }
    public void setRetiro(double retiro) {
        this.saldoDeCuenta -=retiro;
    }

    public double getSaldoCuenta(){
        return this.saldoDeCuenta;
   }

   public String getDatosCuenta(){
       return this.nombreDelTitular+" cuyo número de cuenta es "+this.numeroDeCuenta+" tiene un saldo de "+this.saldoDeCuenta+" pesos. ";
   }
}
