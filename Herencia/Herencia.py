class Enemigo:
    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida

class Zombie(Enemigo):
    def __init__(self, nombre, vida, velocidad):
        super().__init__(nombre, vida)
        self.velocidad = velocidad