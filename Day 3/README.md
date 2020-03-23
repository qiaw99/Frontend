# ul-li标签：
列表可以使用ul-li标签来完成。ul-li是没有前后顺序的信息列表。

__Syntax：__
```html
<ul>
    <li>信息</li>
    <li>信息</li>
    ......
</ul>
```
Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/unorderedList.html)


# ol标签:
如果想在网页中展示有前后顺序的信息列表，这类信息展示就可以使用\<ol>标签来制作有序列表来展示。

__Syntax:__
```html
<ol>
     <li>信息</li>
     <li>信息</li>
     ......
</ol>
```
\<ol>在网页中显示的默认样式一般为：每项\<li>前都自带一个序号，序号默认从1开始.

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/orderedList.html)

# \<div>标签：
在网页制作过程过中，可以把一些独立的逻辑部分划分出来，放在一个\<div>标签中，这个\<div>标签的作用就相当于一个容器。

__逻辑部分__ 是页面上相互关联的一组元素。如网页中的独立的栏目版块，就是一个典型的逻辑部分。

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/div.html)

为了使逻辑更加清晰，我们可以为这一个独立的逻辑部分设置一个名称，用id属性来为\<div>提供唯一的名称，这个就像我们每个人都有一个身份证号，这个身份证号是唯一标识我们的身份的，也是必须唯一的。

### Syntax:
```html
<div  id="版块名称">…</div>
```
Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/div_id.html)

---
# table 标签：
![](http://img.mukewang.com/52d38f0b00017e4305060133.jpg)

---
想在HTML中展现表格可以使用以下代码：

![](http://img.mukewang.com/52d38f83000160be02920445.jpg)

Table 表格在没有添加 css 样式之前，是没有边框的。
## 创建表格的四个元素：
table、tbody、tr、th、td

1. \<table>…\</table>：整个表格以\<table>标记开始、\</table>标记结束。

2. \<tbody>…\</tbody>：如果不加\<thead>\<tbody>\<tfooter> , table表格加载完后才显示。加上这些表格结构， tbody包含行的内容下载完优先显示，不必等待表格结束后在显示，同时如果表格很长，用tbody分段，可以一部分一部分地显示。（通俗理解table 可以按结构一块块的显示，不在等整个表格加载完后显示。）

3. \<tr>…\</tr>：表格的一行，所以有几对tr 表格就有几行。

4. \<td>…\</td>：表格的一个单元格，一行中包含几对\<td>...\</td>，说明一行中就有几列。

5. \<th>…\</th>：表格的头部的一个单元格，表格表头。

6. 表格中列的个数，取决于一行中数据单元格的个数。

Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/table.html)

## caption标签:
表格还是需要添加一些标签进行优化，可以添加标题和摘要。

如下：
![](http://img.mukewang.com/52d3a1610001a42606940398.jpg)

### table summary:
摘要的内容是不会在浏览器中显示出来的。它的作用是增加表格的可读性(语义化)，使搜索引擎更好的读懂表格内容，还可以使屏幕阅读器更好的帮助特殊用户读取表格内容。

#### 语法：
```html
<table summary="表格简介文本">
```

### 标题:
用以描述表格内容，标题的显示位置：表格上方。

#### 语法：
```html
<table>
    <caption>标题文本</caption>
    <tr>
        <td>…</td>
        <td>…</td>
        …
    </tr>
…
</table>
```
Example click [here](https://github.com/qiaw99/Frontend/blob/master/Day%203/summary.html)
