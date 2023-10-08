A = int(input())
B = int(input())
C = int(input())

if(A + B + C == 180):
    if(A == 60 and B == 60 and C == 60):
        print("Equilateral")
    elif(A == B or A == C or B == C):
        print("Isosceles")
    else:
        print("Scalene")
        
else:
    print("Error")