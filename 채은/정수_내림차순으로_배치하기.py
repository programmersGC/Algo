def solution(n):
    answer = []
    for i in str(n):
        answer.append(i)
    answer.sort(reverse=True)
    total = "".join(answer)

    return int(total)