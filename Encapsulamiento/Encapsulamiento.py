class Nequi:
    def __init__(self, numero_cuenta, titular):
        self.__saldo = 0
        self.__numero_cuenta = numero_cuenta
        self.__titular = titular
    
    def get_saldo(self):
        return self.__saldo
    
    def get_titular(self):
        return self.__titular