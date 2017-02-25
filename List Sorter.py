def list_input():
    k = []
    num = ''
    while num!="end":
        num = input("Enter a num: ")
        if num!='end':
            k.append(int(num))
        else:
            break

    return k

def bubblesort(li):
    for i in range(len(li)-1,0,-1):
        for j in range(i):
            if li[j] > li[j+1]:
                temp = li[j]
                li[j] = li[j+1]
                li[j+1] = temp
    return li

def insertionsort(alist):
   for index in range(1,len(alist)):

     currentvalue = alist[index]
     position = index

     while position>0 and alist[position-1]>currentvalue:
         alist[position]=alist[position-1]
         position = position-1

     alist[position]=currentvalue

   return alist


col = list_input()
print("Unsorted list: \n")
print(col)
print("\nSorted List using Bubble Sort:\n")
print(bubblesort(col))
print("\nSorted List using Insertion Sort:\n")
print(insertionsort(col))