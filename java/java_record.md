## Java 注解 Annotation

### 什么是注解 、注解的作用 、在哪里使用注解

<img src="D:\typora\java_record.assets\image-20200828220007535.png" alt="image-20200828220007535" style="zoom: 50%;" />

1. 注解还有检查和约束的作用

### 内置注解

<img src="D:\typora\java_record.assets\image-20200828220241789.png" alt="image-20200828220241789" style="zoom:50%;" />

1. @SuppressWarnings 可以压制警告，告诉编译器不要去做检查，比如定义了为使用的变量会在编译器中生成提示，可以使用SuppressWarning 消除。
2. 可以在方法上，也可以在类上

<img src="D:\typora\java_record.assets\image-20200828221152613.png" alt="image-20200828221152613" style="zoom:50%;" />

### 元注解

<img src="D:\typora\java_record.assets\image-20200828221400729.png" alt="image-20200828221400729" style="zoom:50%;" />

1. @Target 约束注解 在方法、类等情况使用

### 自定义注解

<img src="D:\typora\java_record.assets\image-20200828222317242.png" alt="image-20200828222317242" style="zoom:50%;" />

1. 默认值为 -1  代表找不到

## 反射 Reflection

### 反射机制概述

 #### 什么是动态语言 什么是静态语言

<img src="D:\typora\java_record.assets\image-20200828223641038.png" alt="image-20200828223641038" style="zoom:50%;" />

#### java反射

<img src="D:\typora\java_record.assets\image-20200828223836378.png" alt="image-20200828223836378" style="zoom:50%;" />

#### Class 类

<img src="D:\typora\java_record.assets\image-20200828224145417.png" alt="image-20200828224145417" style="zoom:50%;" />

<img src="D:\typora\java_record.assets\image-20200828224245913.png" alt="image-20200828224245913" style="zoom:50%;" />

##### class 类的创建方式

1. 通过对象获得
2. 通过Class.forname()获得
3. 通过类名获得
4. 每个内置类型的包装类都有一个type属性

<img src="D:\typora\java_record.assets\image-20200828224913938.png" alt="image-20200828224913938" style="zoom:67%;" />

1. 获取父类类型

<img src="D:\typora\java_record.assets\image-20200828225042852.png" alt="image-20200828225042852" style="zoom:67%;" />