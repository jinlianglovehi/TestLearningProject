package com.test.cn.kotlin

/**
 * Created by jinliang on 17-5-31.
 */

class TestMethod {

    /**
     * 设置方法
     */
    private fun getName(name: String): String {
        return name
    }


    private var currnetName: String? = null

    private var youAge:Int =10 ;

    private fun setName(name: String) {
        this.currnetName = name
    }

}
