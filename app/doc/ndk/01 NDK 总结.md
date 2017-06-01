#### NDK 总结

#### 操作步骤：

### 01: 书写相关的类操作相关的 native 方法

### 02: 进入　class 目录下
> NDKApplication\app\build\intermediates\classes\debug

### 03:使用命令：
> javah -jni packAgePath ;
> 使用命令：　javah -jni io.github.yanbober.ndkapplication.NdkJniUtils
> 在目录下面会会生成　NDKApplication\app\build\intermediates\classes\debug　生成.h 文件
> 将.h 文件copy 到jni 文件下面
> 书写.c 文件　引入.h 
### 03:使用

- 在build 文件中集成　so

```
defaultConfig {
    ......
    ndk{
        moduleName "YanboberJniLibName"         //生成的so名字
        abiFilters "armeabi", "armeabi-v7a", "x86"  //输出指定三种abi体系结构下的so库。目前可有可无。
    }
}
```


