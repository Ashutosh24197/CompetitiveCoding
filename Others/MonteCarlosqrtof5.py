import random

N = 10000
n = 0

for i in range(N):
    x = random.uniform(0,1)*5
    if x*x<5:
        n+=1

ans = N/n

print(ans)
