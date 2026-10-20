class Motor {
    private String tipo;
    
    public Motor(String tipo) {
        this.tipo = tipo;
    }
    
    public void encender() {}
}

class Coche {
    private String marca;
    private Motor motor;
    
    public Coche(String marca, String tipoMotor) {
        this.marca = marca;
        this.motor = new Motor(tipoMotor);
    }
    
    public void arrancar() {}
}