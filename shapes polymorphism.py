import abc

class shape(metaclass=abc.ABCMeta):
    def __init__(self, name="null", length="null", width="null", base="null", height="null"):
        self._name = name
        self._length = length
        self._width = width
        self._height = height
        self._base = base

    @abc.abstractmethod
    def shapeData(self, store):
        pass

    @abc.abstractmethod
    def insert(self, shapename, store, index):
        pass

    # Getter and Setter for name
    def get_name(self):
        return self._name

    def set_name(self, name):
        self._name = name

    # Getter and Setter for length
    def get_length(self):
        return self._length

    def set_length(self, length):
        self._length = length

    # Getter and Setter for width
    def get_width(self):
        return self._width

    def set_width(self, width):
        self._width = width

    # Getter and Setter for height
    def get_height(self):
        return self._height

    def set_height(self, height):
        self._height = height

    # Getter and Setter for base
    def get_base(self):
        return self._base

    def set_base(self, base):
        self._base = base

class triangle(shape):
    def shapeData(self, store):
        print(f"Data Entered Successfully \n Your Data is:")
        for shapes in store:
            print(shapes)

    def insert(self, shapename, store, index):
        if index > 100:
            print("Shapes Linkedlist are full. Cannot add more Shapes.")
            return

        height = input("Enter Height : ")
        base = float(input("Enter Base : "))

        data = {
            "name": shapename,
            "height": height,
            "base": base
        }

        store.append(data)

        self.shapeData(store)

class square(shape):
    def shapeData(self, store):
        print(f"Data Entered Successfully \n Your Data is:")
        for shapes in store:
            print(shapes)

    def insert(self, shapename, store, index):
        if index > 100:
            print("Shapes Linkedlist are full. Cannot add more Shapes.")
            return

        length = float(input("Enter Length: "))

        data = {
            "name": shapename,
            "length": length
        }

        store.append(data)

        self.shapeData(store)

class rectangle(shape):
    def shapeData(self, store):
        print(f"Data Entered Successfully \n Your Data is:")
        for shapes in store:
            print(shapes)

    def insert(self, shapename, store, index):
        if index > 100:
            print("Shapes Linkedlist is full. Cannot add more Shapes.")
            return

        length = float(input("Enter Length: "))
        width = float(input("Enter Width: "))

        data = {
            "name": shapename,
            "length": length,
            "width": width
        }

        store.append(data)

        self.shapeData(store)

if __name__ == "__main__":
    store = []
    index = 0
    triangle_obj = triangle()
    square_obj = square()
    rectangle_obj = rectangle()
    for i in range(0, 100):
        try:
            index += 1
            shapename = input("Enter Shape Name: ").lower()  # just to make generic and simple code
            if shapename == "triangle":
                triangle_obj.insert(shapename, store, index)
            elif shapename == "square":
                square_obj.insert(shapename, store, index)
            elif shapename == "rectangle":
                rectangle_obj.insert(shapename, store, index)
            else:
                msg = "Unknown Type Error"
                alert = TypeError(msg)
                print(alert)
        except:
            msg = "Invalid Type Error"
            TypeError(msg)
