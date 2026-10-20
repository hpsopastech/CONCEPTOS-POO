class Enemigo {
    protected String nombre;
    protected int vida;
    
    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }
}

class Zombie extends Enemigo {
    private int velocidad;
    
    public Zombie(String nombre, int vida, int velocidad) {
        super(nombre, vida);
        this.velocidad = velocidad;
    }
}