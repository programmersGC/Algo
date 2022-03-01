# Hash를 사용하지 않은 풀이

def solution(participant, completion):
    answer = 0
    participant.sort()
    completion.sort()
    
    for i in range(len(completion)):
        if(participant[i] != completion[i]):
            return participant[i]
        
    return participant[-1]

# Hash 사용
def solution(participant, completion): 
    hashDict = {} 
    sumHash = 0 
    # 1. Hash : Participant의 dictionary 만들기 
    # 2. Participant의 sum(hash) 구하기 
    for part in participant: 
        hashDict[hash(part)] = part 
        sumHash += hash(part) 
    # 3. completion의 sum(hash) 빼기 
    for comp in completion: 
        sumHash -= hash(comp) 
    # 4. 남은 값이 완주하지 못한 선수의 hash 값이 된다 
    return hashDict[sumHash]

# Zip 사용
def solution(participant, completion):
    
    participant.sort()
    completion.sort()
    
    for p, c in zip(participant, completion):
        if p != c:
            return p
        
    return participant[-1]