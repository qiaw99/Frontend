# 表单标签:
使用HTML表单(form)。表单是可以把浏览者输入的数据传送到服务器端，这样服务器端程序就可以处理表单传过来的数据。

### Syntax:
```html
<form   method="传送方式"   action="服务器文件">
```
1. \<form> ：\<form>标签是成对出现的，以\<form>开始，以\</form>结束。

2. action ：浏览者输入的数据被传送到的地方,比如一个PHP页面(save.php)。

3. method ： 数据传送的方式（get/post）。

### ex.
```html
<form    method="post"   action="save.php">
        <label for="username">用户名:</label>
        <input type="text" name="username" />
        <label for="pass">密码:</label>
        <input type="password" name="pass" />
</form>
```
所有表单控件（文本框、文本域、按钮、单选框、复选框等）都必须放在 \<form>\</form> 标签之间（否则用户输入的信息可提交不到服务器上哦！）。

# 文本输入框、密码输入框:
当用户要在表单中键入字母、数字等内容时，就会用到 __文本输入框__ 。文本框也可以转化为 __密码输入框__ 。
### Syntax:
```html
<form>
   <input type="text/password" name="名称" value="文本" />
</form>
```
- type：
1. 当type="text"时，输入框为文本输入框;
2. 当type="password"时, 输入框为密码输入框。
- name：为文本框命名，以备后台程序ASP 、PHP使用。
- value：为文本输入框设置默认值。(一般起到提示作用)

# 文本域，支持多行文本输入:
当用户需要在表单中输入大段文字时，需要用到文本输入域。

### Syntax:
```html
<textarea  rows="行数" cols="列数">文本</textarea>
```
1. \<textarea>标签是成对出现的，以\<textarea>开始，以\</textarea>结束。2
2. cols ：多行输入域的列数。
3. rows ：多行输入域的行数。
4. 在\<textarea>\</textarea>标签之间可以输入默认值。

### ex:
```html
<form  method="post" action="save.php">
        <label>联系我们</label>
        <textarea cols="50" rows="10" >在这里输入内容...</textarea>
</form>
```
![](http://img.mukewang.com/52e5b4040001f4af05760367.jpg)

# 单选框、复选框:
在使用表单设计调查表时，为了减少用户的操作，使用选择框是一个好主意，html中有两种选择框，即单选框和复选框，两者的区别是单选框中的选项用户只能选择一项，而复选框中用户可以任意选择多项，甚至全选。

### Syntax:
```html
<input   type="radio/checkbox"   value="值"    name="名称"   checked="checked"/>
```
1. type:
- 当 type="radio" 时，控件为单选框
- 当 type="checkbox" 时，控件为复选框
2. value：提交数据到服务器的值（后台程序PHP使用）
3. name：为控件命名，以备后台程序 ASP、PHP 使用
4. checked：当设置 checked="checked" 时，该选项被默认选中

### ex:
![](http://img.mukewang.com/52e5f7c60001a23f07360267.jpg)
![](http://img.mukewang.com/52e5f8010001159804900257.jpg)

同一组的单选按钮，name 取值一定要一致，比如上面例子为同一个名称“radioLove”，这样同一组的单选按钮才可以起到单选的作用。

# 下拉列表框:
下拉列表在网页中也常会用到，它可以有效的节省网页空间。
![](http://img.mukewang.com/52e604590001ae4005270185.jpg)
1. value:
![](http://img.mukewang.com/52e6037300015a9905030165.jpg)
2. selected="selected":
设置selected="selected"属性，则该选项就被默认选中。

## 下拉列表框进行多选:
下拉列表也可以进行多选操作，在\<select>标签中设置multiple="multiple"属性，就可以实现多选功能，在 windows 操作系统下，进行多选时按下Ctrl键同时进行单击（在 Mac下使用 Command +单击），可以选择多个选项。如下代码：
![](http://img.mukewang.com/52e60c020001b7f805000178.jpg)
![](http://img.mukewang.com/52e60c5d00013ced04900257.jpg)

# 提交按钮:
在表单中有两种按钮可以使用，分别为：提交按钮、重置。当用户需要提交表单信息到服务器时，需要用到提交按钮。

### Syntax:
```html
<input   type="submit"   value="提交">
```
- type：只有当type值设置为submit时，按钮才有提交作用
- value：按钮上显示的文字

![](http://img.mukewang.com/52e613350001461604820109.jpg)
![](http://img.mukewang.com/52e6126f0001496a04480218.jpg)

# 重置按钮:
当用户需要重置表单信息到初始时的状态时，比如用户输入“用户名”后，发现书写有误，可以使用重置按钮使输入框恢复到初始状态。只需要把type设置为"reset"就可以。

### Syntax:
```html
<input type="reset" value="重置">
```
- type：只有当type值设置为reset时，按钮才有重置作用
- value：按钮上显示的文字

![](http://img.mukewang.com/52e618680001a6b204570101.jpg)
![](http://img.mukewang.com/52e618bc00015a1004480218.jpg)

# form表单中的label标签:
label标签不会向用户呈现任何特殊效果，它的作用是为鼠标用户改进了可用性。如果你在 label 标签内点击文本，就会触发此控件。就是说，当用户单击选中该label标签时，浏览器就会自动将焦点转到和标签相关的表单控件上（就自动选中和该label标签相关连的表单控件上）。

### Syntax:
```html
<label for="控件id名称">
```
标签的 for 属性中的值应当与相关控件的 id 属性值一定要相同。

### ex:
```html
<form>
  <label for="male">男</label>
  <input type="radio" name="gender" id="male" />
  <br />
  <label for="female">女</label>
  <input type="radio" name="gender" id="female" />
  <label for="email">输入你的邮箱地址</label>
  <input type="email" id="email" placeholder="Enter email">
</form>
```
