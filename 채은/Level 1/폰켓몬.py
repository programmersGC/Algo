
def solution(nums):
    answer = set(nums)
    total = len(answer)
    if total > len(nums) // 2 :
        total = len(nums) // 2
        return total
    else:
        return total