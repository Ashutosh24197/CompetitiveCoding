# problem  https://www.hackerrank.com/challenges/largest-rectangle/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=stacks-queues

# solution

#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the largestRectangle function below.
def largestRectangle(h):
    ans=len(h)
    for i in range(len(h)):
        j=i+1
        count1=1
        # for forword
        while(j<len(h)):
            if h[j]>=h[i]:
                count1+=1
            else:
                break
            j+=1
        j=i-1
        count2=0
        # for backword
        while (j>=0):
            if h[j]>=h[i]:
                count2+=1
            else:
                break
            j-=1
        if h[i]*count1+h[i]*count2>ans:
            ans=h[i]*count1+h[i]*count2

    return ans


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    h = list(map(int, input().rstrip().split()))

    result = largestRectangle(h)

    fptr.write(str(result) + '\n')

    fptr.close()
