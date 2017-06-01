package com.test.cn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.View
import com.test.cn.kotlin.model.StudentModel
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main);
        var view:View? = null;
    }



    override fun onResume() {
        super.onResume()
    }

    /**
     * 创建一个方法
     */
    fun test01(model:StudentModel){

        // 创建的是StudentModel.class
        StudentModel::class.java ;
        StudentModel::class.java.name ;
//        StudentModel::class.java.getField();

    }

    fun testMethodDeclare(){
        // 声明的是实体对象类
        // 需要判断是否为空
        var list:StudentModel?= null;
    }

    /**
     * 具有返回数值的方法的信息
     * 方法的添加
     */
    fun add(x:Int,y:Int):Int{
        return x+y ;
    }

    fun testDataType() {


        var huhu: Int = 0; // 定义的是数据类型信息
        var dou: Double = huhu.toDouble();// 将int 转换为double 数据类型

        // 创建一个实体对象
        var studentModel =StudentModel();
        // 获取属性　
        var name = studentModel.name ;

    }








}
