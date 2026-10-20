from abc import ABC, abstractmethod

class Guerrero(ABC):
    def __init__(self, nombre):
        self.nombre = nombre
    
    @abstractmethod
    def atacar(self):
        pass

class Arquero(Guerrero):
    def __init__(self, nombre):
        super().__init__(nombre)
    
    def atacar(self):
        print(f"{self.nombre} ataca con su arco")
        pass

class Samurai(Guerrero):
    def __init__(self, nombre):
        super().__init__(nombre)
    
    def atacar(self):
        print(f"{self.nombre} ataca con su katana")
        pass
