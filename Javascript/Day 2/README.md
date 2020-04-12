# DOM(Document Object Model)
文档对象模型DOM（Document Object Model）定义访问和处理HTML文档的标准方法。DOM 将HTML文档呈现为带有元素、属性和文本的树结构（节点树）。

---
![](http://img.mukewang.com/52e4be610001c67307860420.jpg)

__将HTML代码分解为DOM节点层次图:__

![](http://img.mukewang.com/52e4bd0f0001dd8d04830279.jpg)

### HTML文档可以说由节点构成的集合，三种常见的DOM节点:
1. 元素节点：上图中\<html>、\<body>、\<p>等都是元素节点，即标签。

2. 文本节点:向用户展示的内容，如\<li>...\</li>中的JavaScript、DOM、CSS等文本。

3. 属性节点:元素属性，如\<a>标签的链接属性href="http://www.imooc.com" 。

看下面代码:
```html
<a href="http://www.imooc.com">JavaScript DOM</a>
```

![](http://img.mukewang.com/52e4bdb80001064c04480196.jpg)


# 通过ID获取元素:
学过HTML/CSS样式，都知道，网页由标签将信息组织起来，而标签的id属性值是唯一的，就像是每人有一个身份证号一样，只要通过身份证号就可以找到相对应的人。那么在网页中，我们通过id先找到标签，然后进行操作。

语法:
```javascirpt
document.getElementById("id")
```
看看下面代码:
![](http://img.mukewang.com/52e4c5950001054207900423.jpg)

结果:null或 [object HTMLParagraphElement]

![](http://img.mukewang.com/52e4c6080001734c03800275.jpg)

注:获取的元素是一个对象，如想对元素进行操作，我们要通过它的属性或方法。

# innerHTML 属性:
innerHTML 属性用于获取或替换 HTML 元素的内容。

### 语法:
```javascript
Object.innerHTML
```

注意:
1. Object是获取的元素对象，如通过document.getElementById("ID")获取的元素。
2. 注意书写，innerHTML区分大小写。

我们通过id="con"获取<p> 元素，并将元素的内容输出和改变元素内容，代码如下:
![](http://img.mukewang.com/52e4cd080001f01507220418.jpg)
  
结果:

![](http://img.mukewang.com/52e4cb5c000187ce03740251.jpg)

# 改变 HTML 样式:
HTML DOM 允许 JavaScript 改变 HTML 元素的样式。如何改变 HTML 元素的样式呢？

### 语法:
```javascript
Object.style.property=new style;
```
注意:Object是获取的元素对象，如通过document.getElementById("id")获取的元素。

### 基本属性表（property）:
![](http://img.mukewang.com/52e4d4240001dd6c04850229.jpg)

注意:该表只是一小部分CSS样式属性，其它样式也可以通过该方法设置和修改。

### 改变 <p> 元素的样式，将颜色改为红色，字号改为20,背景颜色改为蓝：
  
```html
<p id="pcon">Hello World!</p>
<script>
   var mychar = document.getElementById("pcon");
   mychar.style.color="red";
   mychar.style.fontSize="20";
   mychar.style.backgroundColor ="blue";
</script>
```
![](http://img.mukewang.com/52e4d6ae000177d203770253.jpg)

# 显示和隐藏(display属性):
网页中经常会看到显示和隐藏的效果，可通过display属性来设置。

### 语法：
```javascript
Object.style.display = value
```

### value取值:
![](http://img.mukewang.com/52e4dba5000179da04110095.jpg)

### 看看下面代码:

![](http://img.mukewang.com/52e4dcf50001bead09310689.jpg)
