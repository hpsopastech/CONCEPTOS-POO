class Guerrero:
    def __init__(self, nombre):
        self.nombre = nombre
    
    def atacar(self):
        pass

class Arquero(Guerrero):
    def __init__(self, nombre):
        super().__init__(nombre)
    
    def atacar(self):
        pass

class Samurai(Guerrero):
    def __init__(self, nombre):
        super().__init__(nombre)
    
    def atacar(self):
        pass