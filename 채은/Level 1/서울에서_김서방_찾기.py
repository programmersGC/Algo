def solution(seoul):
    answer = 0
    for i in seoul:
        if i == 'Kim':
            answer = seoul.index(i)
    return "김서방은 " + str(answer) + "에 있다"
 
 
#  return "김서방은 {}에 있다".format(seoul.index("Kim"))

# 다 까먹어버린 format ㅠㅠ ${}만 생각나서 힘들었다. 다음번엔 까먹지 않고 format 써서 값 넣어주기!