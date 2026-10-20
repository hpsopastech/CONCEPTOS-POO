class Animal {
    protected String nombre;
    
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    
    public void hacerSonido() {
        System.out.println("Sonido de animal");
    }
}

class Perro extends Animal {
    public Perro(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}
