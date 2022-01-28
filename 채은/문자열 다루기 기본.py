def solution(s):
    llist = []
    for i in s:
        llist.append(i)

    AL = []
    alph = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
    for j in alph:
        AL.append(j.upper())

    if len(s) == 4 or len(s) == 6:
        for i in alph:
            if i in llist:
                return False
            else:
                for k in AL:
                    if k in llist:
                        return False
                    else: True
    else:
        return False

    return True