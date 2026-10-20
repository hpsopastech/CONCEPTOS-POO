class Nequi {
    private double saldo;
    private String numeroCuenta;
    private String titular;
    
    public Nequi(String numeroCuenta, String titular) {
        this.saldo = 0;
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
    }
    
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }
}