class Guerrero {
    protected String nombre;
    
    public Guerrero(String nombre) {
        this.nombre = nombre;
    }
    
    public void atacar() {}
}

class Arquero extends Guerrero {
    public Arquero(String nombre) {
        super(nombre);
    }
    
    @Override
    public void atacar() {}
}

class Samurai extends Guerrero {
    public Samurai(String nombre) {
        super(nombre);
    }
    
    @Override
    public void atacar() {}
}