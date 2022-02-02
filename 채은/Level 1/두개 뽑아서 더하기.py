def solution(numbers):
    answer = 0
    total = []

    for i in range(len(numbers)):
        for j in range(len(numbers)):
            if i == j:
                pass
            else:
                answer = numbers[i] + numbers[j]
                total.append(answer)

    res = set(total)
    final = list(res)
    final.sort()


    return final
