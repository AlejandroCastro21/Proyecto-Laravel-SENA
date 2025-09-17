class vehiculo:
    def __init__(self,marca,modelo,precio):
        self.marca =marca
        self.modelo =modelo
        self.precio = precio
        self.disponible=True
    def sell(self):
        if self.disponible:
            self.disponible=False
            print(f"El vehiculo {self.marca} ha sido vendido")
        else:
            print("El vehiculo {self.marca} no esta disponible")
    def check_availability(self):
        return self.disponible
    def get_price(self):
        return self.precio 
    def start_engine(self):
        raise NotImplementedError("este metodo debe ser implementado por la subclase ") 
    def stop_engine(self):
        raise NotImplementedError("este metodo debe ser implementado por la subclase ") 
class Car(vehiculo):
    def start_engine(self):
        if not self.disponible:
            return f"el motor del carro {self.marca} esta en marcha"
        else:
            return f"el carro {self.marca} no esta disponible"
    def stop_engine(self):
        if not self.disponible:
            return f"el motor del carro {self.marca} esta en marcha"
        else:
            return f"el carro {self.marca} no esta disponible"
        
       
    