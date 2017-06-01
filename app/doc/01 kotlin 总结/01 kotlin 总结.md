
#### Kotlin 总结


#### 关键的开发网址链接

```
https://github.com/wangjiegulu/kotlin-for-android-developers-zh/blob/master/SUMMARY.md?hmsr=toutiao.io&utm_medium=toutiao.io&utm_source=toutiao.io
```

#### kotlin 简介
> kotlin 是java 虚拟机上运行的静态类型的编程语言,也可以　编程成为js 代码

#### 项目的build 总结

```
buildscript {
    ext.kotlin_version = '1.1.2-4'
    repositories {
        jcenter()
    }
    dependencies {
        //……
        //编译 Kotlin 源代码和模块.
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}
```


#### APP 中的build 配置

```
apply plugin: 'com.android.application'
apply plugin: 'kotlin-android'
android {
    //……
}
dependencies {
    //……
    //针对 JDK 7 或 JDK 8
    compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
}
```


#### 函数中的操作符号：

```aidl
val container: ViewGroup = find(R.id.container)
val view = container[2]

```