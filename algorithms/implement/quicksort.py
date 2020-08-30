"""
快速排序：递归形式、非递归形式
"""
# 递归形式
def quicksort(a, p, r):
    if p < r:
        q = partition1(a, p, r)
        quicksort(a, p, q-1)
        quicksort(a, q+1, r)


def partition1(a, p, r):
    x = a[r]
    i = p - 1
    for j in range(p, r): # p->r-1 则需要在循环外面 进行一次交换
        if a[j] <= x:
            i = i + 1
            a[i], a[j] = a[j], a[i]
    a[i+1], a[r] = a[r], a[i+1]
    return i + 1


def partition2(a, p, r):
    x = a[r]
    i = p - 1
    for j in range(p, r + 1): # p->r 则不要在循环外进行一次交换
        if a[j] <= x:
            i = i + 1
            a[i], a[j] = a[j], a[i]
    return i 


# 非递归形式
def quicksort_unrec(a, s, e):
    if s >= e:
        return
    stack = [s, e]
    while stack:
        s, e = stack.pop(0), stack.pop(0)
        if s >= e:
            continue
        i, x = s-1, a[e] # 和partition 的操作类似
        for j in range(s, e+1):
            if a[j] <= x:
                i = i + 1
                a[i], a[j] = a[j], a[i]
        stack.extend([s, i-1, i+1, e])
    return a


if __name__ == "__main__":
    a = [1, 5, 7, 2, 3, 6, 4]
    # quicksort(a, 0, len(a)-1)
    quicksort_unrec(a, 0, len(a)-1)
    print(a)