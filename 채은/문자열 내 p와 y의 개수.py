def solution(s):
    answer = True
    res = s.lower()
    for i in res:
        if res.count("p") == res.count("y"):
            return True
        else:
            return False
    return True