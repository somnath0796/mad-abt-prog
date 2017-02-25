size=int(input("Enter the size: "))
for i in range(0,size):
    for j in range(0,i):
        print("\\ \\ ",end="")
    for k in range(2*i,(size*2)-1):
        print("! ! ",end="")
    for l in range(0,i):
        print("/ / ",end="")
    print("\n")
