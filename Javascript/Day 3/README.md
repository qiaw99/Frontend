# 创建数组:
```js
var myarray=new Array();
```
创建数组的同时，还可以为数组指定长度，长度可任意指定。
```js
var myarray= new Array(8); //创建数组，存储8个数据。 
```

# 数组赋值:
1. 
```js
var myarray = new Array(66,80,90,77,59);//创建数组同时赋值
```
2. 
```js
var myarray = [66,80,90,77,59];//直接输入一个数组（称 “字面量数组”）
```

# 向数组增加一个新元素:
使用myarray变量存储了5个人的成绩，现在多出一个人的成绩，如何存储呢？
![](http://img.mukewang.com/52ca00eb0001dd4805120199.jpg)

只需使用下一个未用的索引，任何时刻可以不断向数组增加新元素。
```js
myarray[5]=88; //使用一个新索引，为数组增加一个新元素
```
# 二维数组:
1. 二维数组的定义方法一
```js
var myarr=new Array();  //先声明一维 
for(var i=0;i<2;i++){   //一维长度为2
   myarr[i]=new Array();  //再声明二维 
   for(var j=0;j<3;j++){   //二维长度为3
   myarr[i][j]=i+j;   // 赋值，每个数组元素的值为i+j
   }
}
```
2. 二维数组的定义方法二
```js
var Myarr = [[0 , 1 , 2 ],[1 , 2 , 3]]
```
3. 赋值
```js
myarr[0][1]=5; //将5的值传入到数组中，覆盖原有值。
```

# 事件:
JavaScript 创建动态页面。事件是可以被 JavaScript 侦测到的行为。 网页中的每个元素都可以产生某些可以触发 JavaScript 函数或程序的事件。

比如说，当用户单击按钮或者提交表单数据时，就发生一个鼠标单击（onclick）事件，需要浏览器做出处理，返回给用户一个结果。

主要事件表:

![](http://img.mukewang.com/53e198540001b66404860353.jpg)

## 鼠标单击事件(onclick):
onclick是鼠标单击事件，当在网页上单击鼠标时，就会发生该事件。同时onclick事件调用的程序块就会被执行，通常与按钮一起使用。

比如，我们单击按钮时，触发 onclick 事件，并调用两个数和的函数add2()。代码如下：
```html
<html>
    <head>
       <script type="text/javascript">
          function add2(){
            var numa,numb,sum;
            numa=6;
            numb=8;
            sum=numa+numb;
            document.write("两数和为:"+sum);  }
       </script>
    </head>
    <body>
       <form>
          <input name="button" type="button" value="点击提交" onclick="add2()" />
       </form>
    </body>
</html>
```
注意: 在网页中，如使用事件，就在该元素中设置事件属性。 

## 鼠标经过事件(onmouseover):
鼠标经过事件，当鼠标移到一个对象上时，该对象就触发onmouseover事件，并执行onmouseover事件调用的程序。

现实鼠标经过"确定"按钮时，触发onmouseover事件，调用函数info()，弹出消息框，代码如下:
![](http://img.mukewang.com/53e196e500013f1807700354.jpg)

运行结果:

![](http://img.mukewang.com/53e196fd00017d8704870416.jpg)

## 鼠标移开事件(onmouseout): 
鼠标移开事件，当鼠标移开当前对象时，执行onmouseout调用的程序。

当把鼠标移动到"登录"按钮上，然后再移开时，触发onmouseout事件，调用函数message()，代码如下:  
![](http://img.mukewang.com/53e195580001a0bc07730356.jpg)

运行结果:

![](http://img.mukewang.com/53e195bf00010d1804760385.jpg)

## 光标聚焦事件(onfocus):
当网页中的对象获得聚点时，执行onfocus调用的程序就会被执行。

如下代码, 当将光标移到文本框内时，即焦点在文本框内，触发onfocus 事件，并调用函数message()。
![](http://img.mukewang.com/53e19337000113d108390338.jpg)

__运行结果：__

![](http://img.mukewang.com/5312c5660001821a04300326.jpg)

## 失焦事件(onblur):



