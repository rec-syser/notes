# 算法与数据结构

## 排序

### 快速排序

快速排序的递归实现参考算法导论的讲解，在其基础上理解非递归时间较为容易

#### 递归实现

#### 非递归实现

```python
    def quicksortUnRecur(self, nums, beg, end):
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

