interface Atacable {
    void recibirDano(int cantidad);
}

class Enemigo implements Atacable {
    private String nombre;
    private int vida;
    
    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    @Override
    public void recibirDano(int cantidad) {}
}

class Jugador implements Atacable {
    private String nombre;
    private int vida;
    
    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
    
    @Override
    public void recibirDano(int cantidad) {}
}