# \<a>标签:
使用\<a>标签可实现超链接，它在网页制作中可以说是无处不在，只要有链接的地方，就会有这个标签。

### Syntax:
```html
<a  href="目标网址"  title="鼠标滑过显示的文本">链接显示的文本</a>
```

### EX:
```html
<a  href="http://www.imooc.com"  title="点击进入慕课网">click here!</a>
```
上面例子作用是单击click here!文字，网页链接到http://www.imooc.com 这个网页。

title属性的作用，鼠标滑过链接文字时会显示这个属性的文本内容。

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%204/hyperlink.html)

## 在新建浏览器窗口中打开链接:
\<a>标签在默认情况下，链接的网页是在当前浏览器窗口中打开，有时我们需要在新的浏览器窗口中打开。

#### 如下代码：
```html
<a href="目标网址" target="_blank">click here!</a>
```

## 使用mailto在网页中链接Email地址:
\<a>标签还有一个作用是可以链接Email地址，使用mailto能让访问者便捷向网站管理者发送电子邮件。我们还可以利用mailto做许多其它事情。下面一一进行讲解，请看详细图示：

![](http://img.mukewang.com/52da4f2a000150b714280550.jpg)

如果mailto后面同时有多个参数的话，第一个参数必须以“?”开头，后面的参数每一个都以“&”分隔。

![](http://img.mukewang.com/52da52200001e00e07930061.jpg)

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%204/email.html)

# \<img>标签:
在网页的制作中为使网页炫丽美观，肯定是缺少不了图片，可以使用\<img>标签来插入图片。

### Syntax:
```html
<img src="图片地址" alt="下载失败时的替换文本" title = "提示文本">
```
1. src：标识图像的位置；

2. alt：指定图像的描述性文本，当图像不可见时（下载不成功时），可看到该属性指定的文本；

3. title：提供在图像可见时对图像的描述(鼠标滑过图片时显示的文本)；

4. 图像可以是GIF，PNG，JPEG格式的图像文件。

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%204/image.html)

