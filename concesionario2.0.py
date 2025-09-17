class Vehiculo:
    def __init__(self, marca, modelo, precio):
        self.marca = marca
        self.modelo = modelo
        self.precio = precio
        self.disponible = True

    def sell(self):
        if self.disponible:
            self.disponible = False
            print(f"El vehículo {self.marca} {self.modelo} ha sido vendido")
        else:
            print(f"El vehículo {self.marca} {self.modelo} NO está disponible")

    def check_availability(self):
        return self.disponible

    def get_price(self):
        return self.precio 

    def start_engine(self):
        raise NotImplementedError("Este método debe ser implementado por la subclase") 

    def stop_engine(self):
        raise NotImplementedError("Este método debe ser implementado por la subclase") 


class Car(Vehiculo):
    def start_engine(self):
        if not self.disponible:
            return f"El motor del carro {self.marca} está en marcha"
        else:
            return f"El carro {self.marca} no está disponible"

    def stop_engine(self):
        if not self.disponible:
            return f"El motor del carro {self.marca} se ha detenido"
        else:
            return f"El carro {self.marca} no está disponible"


class Cliente:
    def __init__(self, nombre,edad,cc):
        self.nombre = nombre
        self.edad = edad
        self.cc = cc
    def comprar(self, vehiculo):
        print(f"{self.nombre} intenta comprar {vehiculo.marca} {vehiculo.modelo}...")
        vehiculo.sell()


class Vendedor:
    def __init__(self, nombre):
        self.nombre = nombre
        self.autos = []

    def agregar_auto(self, auto):
        self.autos.append(auto)

    def mostrar_autos(self):
        print(f"Autos disponibles con {self.nombre}:")
        for a in self.autos:
            estado = "Disponible" if a.disponible else "Vendido"
            print(f"- {a.marca} {a.modelo} | Precio: ${a.precio} | {estado}")

vendedor1 = Vendedor("Carlos")
vendedor1.agregar_auto(Car("Toyota", "Corolla", 20000))
vendedor1.agregar_auto(Car("Honda", "Civic", 25000))
vendedor1.agregar_auto(Car("Ford", "Fiesta", 18000))

vendedor1.mostrar_autos()
cliente_nombre=input("Digite el nombre del cliente : ")
cliente_edad=input("Digite la edad del cliente : ")
cliente_cc=input("Digite la cc del cliente ")
cliente1 = Cliente(cliente_nombre,cliente_edad,cliente_cc)
elegir_auto=int(input("digite el auto que desea comprar el cliente\n0 = ´Toyota´\n1 = ´honda´\n2 = ´ford´\n"))
cliente1.comprar(vendedor1.autos[elegir_auto])

vendedor1.mostrar_autos()