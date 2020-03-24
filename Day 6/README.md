# CSS样式:
CSS全称为“层叠样式表 (Cascading Style Sheets)”，它主要是用于定义HTML内容在浏览器内的显示样式，如文字大小、颜色、字体加粗等。
使用CSS样式的一个好处是通过定义某个样式，可以让不同网页位置的文字有着统一的字体、字号或者颜色等。

```html
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>认识CSS样式</title>
    <style type="text/css">
        p{
           font-size:20px;/*设置文字字号*/
           color:red;/*设置文字颜色*/
           font-weight:bold;/*设置字体加粗*/
        }
    </style>
    </head>
    <body>
        <p>慕课网，超酷的互联网、IT技术免费学习平台，创新的网络一站式学习、实践体验；服务及时贴心，内容专业、有趣易学。专注服务互联网工程师快速成为技术高手！</p>
    </body>
</html>
```
把“超酷的互联网”、“服务及时贴心”、“有趣易学”这三个短语的文本颜色设置为红色，这时就可以通过设置样式来设置，而且只需要编写一条css样式语句.

##### 方法：
1. 把这三个短语用\<span>\</span>括起来。
2. 加入代码：
```css
span{
    color:red;
}
```

# CSS代码语法:
css 样式由 __选择符__ 和 __声明__ 组成，而 __声明__ 又由 __属性__ 和 __值__ 组成，如下图所示：

![](http://img.mukewang.com/52fde5c30001b0fe03030117.jpg)

- 选择符：又称选择器，指明网页中要应用样式规则的元素，如本例中是网页中所有的段（p）的文字将变成蓝色，而其他的元素（如ol）不会受到影响。
- 声明：在英文大括号“｛｝”中的的就是声明，属性和值之间用英文冒号“：”分隔。当有多条声明时，中间可以英文分号“;”分隔，如下所示：
```css
p{font-size:12px;color:red;}
```
#### 注意：
1. 最后一条声明可以没有分号，但是为了以后修改方便，一般也加上分号。
2. 为了使用样式更加容易阅读，可以将每条代码写在一个新行内.

# CSS注释代码:
就像在Html的注释一样，在CSS中也有注释语句：用/\*注释语句\*/来标明（Html中使用\<!--注释语句-->)。就像下面代码：
![](http://img.mukewang.com/52fd724e0001768503250108.jpg)

# css样式:
CSS样式可以写在哪些地方呢？从CSS 样式代码插入的形式来看基本可以分为以下3种: __内联式__ 、 __嵌入式__ 和 __外部式__ 三种。

### 内联式:css样式表就是把css代码直接写在现有的HTML标签中:
```html
<p style="color:red">这里文字是红色。</p>
```
并且css样式代码要写在style=""双引号中，如果有多条css样式代码设置可以写在一起，中间用分号隔开。
```html
<p style="color:red;font-size:12px">这里文字是红色。</p>
```

### 嵌入式css样式，写在当前的文件中:
嵌入式css样式，就是可以把css样式代码写在\<style type="text/css">\</style>标签之间。如下面代码实现把\<span>标签中的文字设置为红色：
```html
<style type="text/css">
   span{
      color:red;
   }
</style>
```
嵌入式css样式必须写在\<style>\</style>之间，并且一般情况下嵌入式css样式写在\<head>\</head>之间。

### 外部式css样式，写在单独的一个文件中:
外部式css样式(也可称为外联式)就是把css代码写一个单独的外部文件中，这个css样式文件以“.css”为扩展名，在\<head>内（不是在\<style>标签内）使用\<link>标签将css样式文件链接到HTML文件内，如下面代码：
```html
<link href="base.css" rel="stylesheet" type="text/css" />
```

#### 注意：
1. css样式文件名称以有意义的英文字母命名，如 main.css。
2. rel="stylesheet" type="text/css" 是固定写法不可修改。
3. <link>标签位置一般写在<head>标签之内。
   
# 三种方法的优先级:
对于同一个元素我们同时用了三种方法设置css样式，那么哪种方法真正有效呢？
```html
<!DOCTYPE HTML>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
        <title>嵌入式css样式</title>
        <link href="style.css" rel="stylesheet" type="text/css">
        <style type="text/css">
        span{
           color:red;
        }
        </style>
    </head>
    <body>
        <p>慕课网，<span style="color:pink">超酷的互联网</span>、IT技术免费学习平台，创新的网络一站式学习、实践体验；服务及时贴心，内容专业、有趣易学。专注服务互联网工程师快速成为技术高手！</p>
    </body>
</html>
```

```css
/*Style.css*/
span{
   color:blue;
}
```

1. 使用内联式CSS设置“超酷的互联网”文字为粉色。
2. 然后使用嵌入式CSS来设置文字为红色。
3. 最后又使用外部式设置文字为蓝色（style.css文件中设置）。

但最终你可以观察到“超酷的互联网”这个短词的文本被设置为了粉色。因为这三种样式是有优先级的，记住他们的优先级：内联式 > 嵌入式 > 外部式

但是嵌入式>外部式有一个前提：嵌入式css样式的位置一定在外部式的后面。其实总结来说，就是--就近原则（离被设置元素越近优先级别越高）。
