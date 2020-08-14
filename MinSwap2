# 14 August 2020, Nicole Binder
# Program to find the minimum number of swaps to sort an array containing consecutive numbers and no repeats
# problem and main code from HackerRank https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

import math
import os
import random
import re
import sys

def minimumSwaps(arr):
    arr_dict = dict(zip(range(1,len(arr)+1), arr))
    reference = dict(zip(arr, range(1, len(arr) + 1)))
    swaps = 0
    for i in range(1, len(arr) + 1):
        if arr_dict[i] != i:
            num_swap = reference[i]
            reference[arr_dict[i]] = num_swap
            arr_dict[num_swap] = arr_dict[i]
            arr_dict[i] = i
            reference[i] = i
            swaps += 1
    return swaps

            
'''
USAGE: The first line contains an integer n, the size of arr. 
The second line contains n space-separated integers arr[i].

Example
Input: 
       4
       4 3 1 2
Output:
       3 
 '''

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    arr = list(map(int, input().rstrip().split()))

    res = minimumSwaps(arr)

    fptr.write(str(res) + '\n')

    fptr.close()
