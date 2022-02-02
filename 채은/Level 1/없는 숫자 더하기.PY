# 2022-01-25

def solution(numbers):
    nums = []
    for i in range(0, 10):
        nums.append(i)
    
    result = []
    for j in nums:
        if not j in numbers:
            result.append(j)
    answer = sum(result)
    return answer