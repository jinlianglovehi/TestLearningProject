
#### Kotlin 继承语法操作

open class Animal  ;

class Dog :Animal(){

}

#### Kotlin 文件的文件格式

> MainActivity.kt 


#### findViewById

> findViewById 的的方式获取的是 recyclearView
```aidl
val forecastList = findViewById(R.id.forecast_list) as RecyclerView
forecastList.layoutManager = LinearLayoutManager(this)

```

#### kotlin 数据类型的声明

- var: 是可变化的变量

- val:　是不可变化的变量

#### 利用kotlin 创建一个实体对象

```
  // 创建一个实体对象
  var studentModel =StudentModel();

```


#### Kotlin　Anko　替代以前的使用方法生成xml 文件

```aidl

val forecastList: RecyclerView = find(R.id.forecast_list)

```
