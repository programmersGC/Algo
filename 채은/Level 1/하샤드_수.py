def solution(x):

    X = [int(i) for i in str(x)]

    if x % sum(X) == 0:
        return True
    else:
        return False