def solution(d, budget):
    answer = 0
    # 리스트 정렬하기
    money = sorted(d)
    # 리스트 돌면서
    for i in range(len(money)):
        # i번째의 돈이 전체 예산보다 작으면
        if money[i] <= budget:
            # answer + 1
            answer += 1
            # a로 갱신해주기
            a = budget-money[i]
            # budget갱신
            budget = a
    return answer

