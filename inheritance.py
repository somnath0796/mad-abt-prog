class Parent():
    def print_last_name(self):
        print("Mohanty")
#can have multiple inheritance
class Child(Parent):
    def print_first_name(self):
        print("Somnath")
    def print_last_name(self):
        print("Abhishek")

soms = Child()
soms.print_first_name()
soms.print_last_name()