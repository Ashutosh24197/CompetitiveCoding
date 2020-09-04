import random

number = 10000

square_points = 0
circle_points = 0

for i in range(number*number):

    x = random.uniform(-1,1)
    y = random.uniform(-1,1)

    distance = x**2 + y**2

    if distance <=1:
        circle_points+=1

    square_points +=1

pi = 4*circle_points/square_points

print(pi)
