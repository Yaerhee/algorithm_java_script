import sys

N = int(sys.stdin.readline())
M = list(sys.stdin.readline().rstrip())
total = 0

if len(M) > N:
    exit()
else:
    for i in range(N):
        total += int(M[i])

    print(total)