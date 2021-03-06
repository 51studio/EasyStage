# EasyStage

[![](https://jitpack.io/v/AyoCrazy/EasyStage.svg)](https://jitpack.io/#AyoCrazy/EasyStage)
[![Build Status](https://travis-ci.org/AyoCrazy/EasyStage.svg?branch=master)](https://travis-ci.org/AyoCrazy/EasyStage)

### 一个Libgdx的Stage剖析工具，也可以作为一个轻量级UI编辑器。

[English](https://github.com/AyoCrazy/EasyStage/blob/master/README_EN.md)

使用方法将非常简单：
``` java
MyStage myStage = Easy.newStage(MyStage.class);
```
桌面运行游戏时按F6键，即可调取工具。

全部快捷键：
> F6  启动服务并打开工具  
F5  重新打开工具  
F2  游戏暂停/恢复  
Alt 显示当前坐标  
Alt+1 复制当前坐标  
Shift 显示当前颜色  
Shift+1 复制当前颜色  
Ctrl+D 显示/关闭debug包围框  
Ctrl+I 显示/关闭Stage信息


#### 已完善功能
* 运行时查看、修改Stage基础属性和自定义属性
* 显示Actors列表
* 运行时实时查看并修改Actors的属性
* 游戏中统计Stage信息

### 截图：
![status](https://www.ayocrazy.com/wp-content/uploads/2017/01/status.jpg)
![editor](https://www.ayocrazy.com/wp-content/uploads/2017/01/editor.png)

#### 正在开发功能
* 保存修改后的属性到json文件
* 读取json文件生成Stage

#### 下一步开发功能
* 拖拽Actors来对其进行基础变换
* Stage性能分析，并生成时间曲线

#### 特别感谢<a href="https://github.com/htynkn" target="blank">@htynkn</a>为项目构建、编译、测试提供的技术支持，主页：<a href ="https://www.huangyunkun.com" target="blank">夜明的孤行灯</a>  
  
#### 最后，欢迎加入！
