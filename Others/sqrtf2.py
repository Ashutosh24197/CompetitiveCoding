
import random

N = 10000
n = 0

for i in range(N):
    x = random.uniform(0,1)*2
    if x*x <2:
        n+=1

ans = N/n

print(ans)




