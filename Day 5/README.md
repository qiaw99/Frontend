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
