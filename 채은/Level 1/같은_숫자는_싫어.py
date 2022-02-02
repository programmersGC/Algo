def solution(arr):
    result = []
    result.append(arr[0])
    for i in range(len(arr)-1):
        if arr[i] != arr[i+1]:
            result.append(arr[i+1])
        else:
            pass

    return result