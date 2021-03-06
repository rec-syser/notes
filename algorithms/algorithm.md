# 算法与数据结构

## 排序

### 快速排序

快速排序的递归实现参考算法导论的讲解，在其基础上理解非递归时间较为容易

#### 递归实现

```python
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
```



#### 非递归实现

```python
def quicksortUnRecur(nums, beg, end):
    if beg >= end:
        return nums
    stack = [beg, end]
    while stack:
        beg, end = stack.pop(0), stack.pop(0)
        if beg >= end:
            continue
        i, pivot = beg-1, nums[end]
        for j in range(beg, end+1):
            if nums[j] <= pivot:
                i += 1
                nums[i], nums[j] = nums[j], nums[i]
        stack.extend([beg, i-1, i+1, end])
    return nums
```

