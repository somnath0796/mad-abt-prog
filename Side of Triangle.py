import math
a=int(input("Enter side1: "))
c=int(input("Enter side2: "))
angle1=int(input("Enter angle(in degrees): "))
b = math.sqrt((a*a)+(c*c)-(2*a*c*math.cos(math.radians(angle1))))
print("The third side is: "+str(b))