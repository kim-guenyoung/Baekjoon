colorA = input()
colorB = input()
colorC = input()
colors = {
    'black' : 1,
    'brown' : 10,
    'red' : 100,
    'orange' : 1000,
    'yellow' : 10000,
    'green' : 100000,
    'blue' : 1000000,
    'violet' : 10000000,
    'grey' : 100000000,
    'white' : 1000000000
}



if colorA in colors and colorB in colors and colorC in colors:
    index = list(colors.keys()).index(colorA)
    index2 = list(colors.keys()).index(colorB)
    index3 = colors[colorC]
    
    index1_2 = str(index) + str(index2)
    print(int(index1_2) * index3)
