class Avenger:
    life = 5
    name = ""

    def __init__(self,name,hp):
        self.name = str(name)
        self.life = hp

    def attacked(self):
        print(self.name+": ouch!")
        self.life-=1
    def bigattacked(self):
        print(self.name+": arghh!!")
        self.life-=3
    def health(self):
        if(self.life<=0):
            print(self.name+": Alas! I'm dead. -_-")
        else:
            print(self.name+": "+str(self.life)+" lives left.")

    def heal(self):
        print(self.name+": Healthy!!")
        self.life+=2

ironman = Avenger("ironman",10)
cap = Avenger("captain america",20)

ironman.attacked()
ironman.health()
cap.bigattacked()
cap.health()
cap.heal()
cap.health()
