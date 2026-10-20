class Motor:
    def __init__(self, tipo):
        self.tipo = tipo
    
    def encender(self):
        pass

class Coche:
    def __init__(self, marca, tipo_motor):
        self.marca = marca
        self.motor = Motor(tipo_motor)
    
    def arrancar(self):
        pass