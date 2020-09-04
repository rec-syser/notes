## 基础概念

1. 引用类型没有赋值默认为null

### final关键字

<img src="java_record.assets/image-20200904094129489.png" alt="image-20200904094129489" style="zoom:80%;" />

### 枚举类型 Enum

```java
public enum Size {
    SMALL("S", 1), MEDIUM("M", 2), LARGE("L", 3), EXTRA_LARGE("XL", 4); //这里相当于四个Size枚举类型的实例

    private String abbrevation;
    private int index;
    private Size(String abbrevation, int index){
        this.index = index;
        this.abbrevation = abbrevation;
    }

    public String getAbbrevation() {
        return abbrevation;
    }

    public void setAbbrevation(String abbrevation) {
        this.abbrevation = abbrevation;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
```

## 注解 Annotation

### 什么是注解 、注解的作用 、在哪里使用注解

<img src=".\java_record.assets\image-20200828220007535.png" alt="image-20200828220007535" style="zoom: 50%;" />

1. 注解还有检查和约束的作用

### 内置注解

<img src=".\java_record.assets\image-20200828220241789.png" alt="image-20200828220241789" style="zoom:50%;" />

1. @SuppressWarnings 可以压制警告，告诉编译器不要去做检查，比如定义了为使用的变量会在编译器中生成提示，可以使用SuppressWarning 消除。
2. 可以在方法上，也可以在类上

<img src=".\java_record.assets\image-20200828221152613.png" alt="image-20200828221152613" style="zoom:50%;" />

### 元注解

<img src=".\java_record.assets\image-20200828221400729.png" alt="image-20200828221400729" style="zoom:50%;" />

1. @Target 约束注解 在方法、类等情况使用

### 自定义注解

<img src=".\java_record.assets\image-20200828222317242.png" alt="image-20200828222317242" style="zoom:50%;" />

1. 默认值为 -1  代表找不到

## 反射 Reflection

### 反射机制概述

 #### 什么是动态语言 什么是静态语言

<img src=".\java_record.assets\image-20200828223641038.png" alt="image-20200828223641038" style="zoom:50%;" />

#### Class 类

<img src=".\java_record.assets\image-20200828224145417.png" alt="image-20200828224145417" style="zoom:50%;" />

<img src=".\java_record.assets\image-20200828224245913.png" alt="image-20200828224245913" style="zoom:50%;" />

##### class 类的创建方式

1. 通过对象获得
2. 通过Class.forname()获得
3. 通过类名获得
4. 每个内置类型的包装类都有一个type属性

<img src=".\java_record.assets\image-20200828224913938.png" alt="image-20200828224913938" style="zoom:67%;" />

1. 获取父类类型

<img src=".\java_record.assets\image-20200828225042852.png" alt="image-20200828225042852" style="zoom:67%;" />

##### 所有类型的class对象

<img src="java_record.assets/image-20200830092428710.png" alt="image-20200830092428710" style="zoom: 67%;" />

<img src="java_record.assets/image-20200830092718614.png" alt="image-20200830092718614" style="zoom:67%;" />

##### 类的初始化

1. 静态代码块初始化
2. 构造器初始化
3. 静态代码块的值和其编写顺序有关

<img src="java_record.assets/image-20200830095150599.png" alt="image-20200830095150599" style="zoom:67%;" />

类什么时候回初始化：

1. new() 创建对象 父类没有加载，先初始化父类
2. 反射会产生主动引用

<img src="java_record.assets/image-20200830095544463.png" alt="image-20200830095544463" style="zoom:67%;" />

##### 类加载器

<img src="java_record.assets/image-20200830100907810.png" alt="image-20200830100907810" style="zoom:67%;" />

#### 反射机制

<img src=".\java_record.assets\image-20200828223836378.png" alt="image-20200828223836378" style="zoom:50%;" />

##### 获取类的信息



<img src="java_record.assets/image-20200830102054274.png" alt="image-20200830102054274" style="zoom:67%;" />

##### 通过反射构建和使用类的属性和方法

<img src="java_record.assets/image-20200830105209416.png" alt="image-20200830105209416" style="zoom:67%;" />

#### 效率问题

1. 反射会降低程序的效率
2. 使用反射较多可以关闭检测机制 提高运行效率

#### 反射操作注解

使用：ORM 类和数据库表之间的对应关系

<img src="java_record.assets/image-20200830110727045.png" alt="image-20200830110727045" style="zoom:67%;" />

<img src="java_record.assets/image-20200830111231868.png" alt="image-20200830111231868" style="zoom:67%;" />

## java集合

1. 会使用集合存储数据
2. 会便利集合，把数据取出来
3. 掌握每种集合的特性

### java集合集成结构

![img](java_record.assets/5d40104c1842d26873.jpg)

### Collection接口常用功能

![image-20200903222343777](java_record.assets/image-20200903222343777.png)

### Itreator  接口功能

![image-20200903224702587](java_record.assets/image-20200903224702587.png)

1. 迭代器的remove操作需要在next之后进行，即删除上一个访问的元素

### java库中的具体集合

![image-20200903225357296](java_record.assets/image-20200903225357296.png)

### Vector

1. Vector是线程安全的

### ArrayList

1. 为什么需要ArrayList，原生数组有什么缺点。
2. ArrayList和LinkedList的区别
3. ArrayList中elementData为什么被transient修饰？
   1. ArrayList在序列化的时候会调用writeObject，直接将size和element写入ObjectOutputStream；反序列化时调用readObject，从ObjectInputStream获取size和element，再恢复到elementData。
   2. 为什么不直接用elementData来序列化，而采用上诉的方式来实现序列化呢？原因在于elementData是一个缓存数组，它通常会预留一些容量，等容量不足时再扩充容量，那么有些空间可能就没有实际存储元素，采用上诉的方式来实现序列化时，就可以保证只序列化实际存储的那些元素，而不是整个数组，从而节省空间和时间
   
4. 底层实现

### LinkedList

1. 是双向链表

### ArrayDeque

1. 集成了List和Deque接口，是一个双端队列，可以用来实现栈和队列的操作，底层是一个循环数组。

### HashMAp

## lambda 表达式



