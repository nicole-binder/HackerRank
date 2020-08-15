# 15 August 2020, Nicole Binder
# A program that returns the largest value in an array after manipulations
# problem and main from HackerRank https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

import math
import os
import random
import re
import sys

# Complete the arrayManipulation function below.
def arrayManipulation(n, queries):
    max_value = 0
    slope_sum = 0
    arr = [0] * n
    
    for i in range(0,len(queries)):
        a, b, k = queries[i][0], queries[i][1], queries[i][2]
        arr[a-1] += k
        try:
            arr[b] -= k
        except:
            pass #out of range
    
    for val in arr:
        slope_sum += val
        if slope_sum > max_value:
            max_value = slope_sum
    return max_value

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    nm = input().split()

    n = int(nm[0])

    m = int(nm[1])

    queries = []

    for _ in range(m):
        queries.append(list(map(int, input().rstrip().split())))

    result = arrayManipulation(n, queries)

    fptr.write(str(result) + '\n')

    fptr.close()
