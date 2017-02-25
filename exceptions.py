while True:
    try:
        number = int(input("What's your lucky number dude?:\n"))
        print("My lucky number is: ", int((100 / number) / 10))
        break
    except ValueError:
        print("Enter a number dude!")
    except ZeroDivisionError:
        print("Zero can't be your lucky number!")
    except:
        print("I don't know what error you've made, but something's wrong!")
    finally:
        print("Okk, bye-bye!")
