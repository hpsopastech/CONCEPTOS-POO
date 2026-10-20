abstract class Guerrero {
    protected String nombre;
    
    public Guerrero(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract void atacar();
}

class Arquero extends Guerrero {
    public Arquero(String nombre) {
        super(nombre);
    }
    
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su arco");
    }
}

class Samurai extends Guerrero {
    public Samurai(String nombre) {
        super(nombre);
    }
    
    @Override
    public void atacar() {
        System.out.println(nombre + " ataca con su katana");
    }
}
