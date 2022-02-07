
def solution(people, limit):

    answer = 0

    people.sort()

    start_index = 0
    end_index = len(people) - 1

    while start_index <= end_index:
        if people[start_index] + people[end_index] <= limit:
            start_index += 1
        end_index -= 1
        answer += 1

    return print(answer)

solution(people = [70, 50, 80, 50], limit = 100)