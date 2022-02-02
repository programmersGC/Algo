def solution(numbers):
    # numbers를 str로 변환해주기
    str_numbers = list(map(str,numbers))
    # lambda를 활용해 자리수 1000아래로 만들어주고 비교하기
    str_numbers.sort(key=lambda x: x*3, reverse=True)
    # 000 같은 특수한 문자들을 0으로 변환해주기 위해 int로 변환하고 str로 다시 변환하기
    answer = str(int(''.join(str_numbers)))
    return answer