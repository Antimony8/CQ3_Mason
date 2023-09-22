# Runtime Analysis Mini_Max
The sorting step of the Mini_max problem has a time complexity of O(n log n). The reason for this time complexity comes from the fact that the sorting algorithm needs to make a number of comparisons that grows with the logarithm of the number of elements(n) to achieve a sorted order. Therefore, the overall time complexity of this program is O(n log n) where n is the number of integers in the input list.

# Runtime Analysis HackRank in a String
In the worst case scenario the program may make n recursive calls (once for each character in 's') and 'c' additional calls (once for each character in "hackerrank"). Because of this the total runtime for the program would be O(n + c) where n is the length of the input string, and c is the leangth of the HackerRank string
