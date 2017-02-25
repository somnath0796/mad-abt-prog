gross = float(input("Enter the gross amount of purchase:"))
VAT = float(input("Enter the VAT percentage:"))
print("VAT amount is: "+str(((VAT*gross) / 100)))
print("The computed net amount is: "+str(gross-((VAT*gross))/100))
