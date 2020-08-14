# 14 August 2020, Nicole Binder
# Program to find the max sum of an "hourglass" in a 6x6 array
# problem and main from HackerRank https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

import math
import os
import random
import re
import sys

def hourglassSum(arr):
    hourglass_sums = []
    x, y = 0, 0
    while x < 4:
        while y < 4:
            num_0 = arr[x][y]
            num_1 = arr[x][y + 1]
            num_2 = arr[x][y + 2]
            num_3 = arr[x + 1][y + 1]
            num_4 = arr[x + 2][y]
            num_5 = arr[x + 2][y + 1]
            num_6 = arr[x + 2][y + 2]
            y += 1
            hourglass_sums.append(num_0+num_1+num_2+num_3+num_4+num_5+num_6)
        x += 1
        y = 0
    return max(hourglass_sums)

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    result = hourglassSum(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
