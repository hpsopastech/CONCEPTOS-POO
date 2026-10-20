from abc import ABC, abstractmethod

class Atacable(ABC):
    @abstractmethod
    def recibir_dano(self, cantidad):
        pass

class Enemigo(Atacable):
    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida
    
    def recibir_dano(self, cantidad):
        pass

class Jugador(Atacable):
    def __init__(self, nombre, vida):
        self.nombre = nombre
        self.vida = vida
    
    def recibir_dano(self, cantidad):
        pass