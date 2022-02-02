def solution(strings, n):
    answer = []
    last = []
    for i in strings:
        word = i[n]
        answer.append(word)

    for j in range(len(strings)):
        for k in range(len(answer)):
            if j == k:
                total = answer[k] + strings[j]
                last.append(total)
    final = sorted(last)

    res = []
    for h in final:
        res.append(h[1:])

    return res