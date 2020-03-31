# 插入JS:
使用<script>标签在HTML网页中插入JavaScript代码。注意， <script>标签要成对出现，并把JavaScript代码写在\<script>\</script>之间。
  
![](http://img.mukewang.com/52e31ea8000149f406440218.jpg)
  
\<script type="text/javascript">表示在\<script>\</script>之间的是文本类型(text),javascript是为了告诉浏览器里面的文本是属于JavaScript语言。

---
我们可以把HTML文件和JS代码分开,并单独创建一个JavaScript文件(简称JS文件),其文件后缀通常为.js，然后将JS代码直接写在JS文件中。

![](http://img.mukewang.com/52898b400001d04005500266.jpg)

在JS文件中，不需要\<script>标签,直接编写JavaScript代码就可以了。
JS文件不能直接运行，需嵌入到HTML文件中执行，我们需在HTML中添加如下代码，就可将JS文件嵌入HTML文件中。
```html
<script src="script.js"></script>
```

![](http://img.mukewang.com/52898b6900018aeb05540284.jpg)

# JS在页面中的位置:
可以将JavaScript代码放在html文件中任何位置，但是我们一般放在网页的head或者body部分。

- 放在\<head>部分:
最常用的方式是在页面中head部分放置\<script>元素，浏览器解析head部分就会执行这个代码，然后才解析页面的其余部分。

- 放在\<body>部分:
JavaScript代码在网页读取到该语句的时候就会执行。

![](http://img.mukewang.com/52a6ad240001086506440600.jpg)

__注意: javascript作为一种脚本语言可以放在html页面中任何位置，但是浏览器解释html时是按先后顺序的，所以前面的script就先被执行。比如进行页面显示初始化的js必须放在head里面，因为初始化都要求提前进行（如给页面body设置css等）；而如果是通过事件调用执行的function那么对位置没什么要求的。__

# 注释:
- 单行注释，在注释内容前加符号 “//”。
```html
<script type="text/javascript">
  document.write("单行注释使用'//'");  // 我是注释，该语句功能在网页中输出内容
</script>
```

- 多行注释以"/*"开始，以"*/"结束。
```html
<script type="text/javascript">
   document.write("多行注释使用/*注释内容*/");
   /*
    多行注释
    养成书写注释的良好习惯
   */
</script>
```

# 输出内容:
document.write() 可用于直接向 HTML 输出流写内容。简单的说就是直接在网页中输出内容。

1. 输出内容用""括起，直接输出""号内的内容。
```html
<script type="text/javascript">
  document.write("I love JavaScript！"); //内容用""括起来，""里的内容直接输出。
</script>
```

2. 通过变量，输出内容
```html
<script type="text/javascript">
  var mystr="hello world!";
  document.write(mystr);  //直接写变量名，输出变量存储的内容。
</script>
```

3. 输出多项内容，内容之间用+号连接。
```html
<script type="text/javascript">
  var mystr="hello";
  document.write(mystr+"I love JavaScript"); //多项内容之间用+号连接
</script>
```

4. 输出HTML标签，并起作用，标签使用""括起来。
```html
<script type="text/javascript">
  var mystr="hello";
document.write(mystr+"<br>");//输出hello后，输出一个换行符
  document.write("JavaScript");
</script>
```





