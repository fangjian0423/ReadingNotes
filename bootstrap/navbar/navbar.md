bootstrap中的导航条navbar记录。

首先介绍几个关于导航条css。

1. navbar
    position转化为relative，边框圆角化，添加margin-bottom
2. navbar-default
    背景颜色
3. navbar-collapse
    背景颜色，padding-left和padding-right
4. nav
    作用在ul标签上的样式，一般和navbar-nav一起使用
5. navbar-nav
    和nav样式配合使用
6. active
    作用在li上，表示这个li被激活，高亮显示
    
一个实例：
    
    <div class="container">
        <nav class="navbar navbar-default">
            <div class="navbar-collapse">
                <ul class="nav navbar-nav">
                    <li>
                        <a>目录1</a>
                    </li>
                    <li>
                        <a>目录2</a>
                    </li>
                    <li class="active">
                        <a>被选中的目录3</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div
    
    
以上就是一个很简单的导航条例子，解释一下：

nav标签是html5新加的，改成div也没问题。 它的样式navbar和navbar-default的作用是让这个nav成为一个导航条，然后加上一些背景色
nav包围的div标签的作用是添加padding-left和padding-right，去掉了也没问题
接下来就是ul标签了，ul标签需要使用navbar-nav和nav这两个样式
然后和li标签和a标签，注意，这里必须要使用a标签，因为bootstrap内部有个一些样式表示如.navbar-nav > li > a和.nav > li > a 会处理样式



navbar-static-tip，静态顶部导航。

    <nav class="navbar navbar-default navbar-static-top">
        <div class="navbar-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a>目录1</a>
                </li>
                <li>
                    <a>目录2</a>
                </li>
                <li class="active">
                    <a>被选中的目录3</a>
                </li>
            </ul>
        </div>
    </nav>
    
适合导航条没有圆角，在顶部的需求。


navbar-fixed-top，顶部导航条，不随鼠标移动而消失，永远固定在顶部。
它的一些css：

    .navbar-fixed-top {
        top: 0;
        border-width: 0 0 1px;
    }
    
    .navbar-fixed-top {
        position: fixed;
        right: 0;
        left: 0;
        z-index: 1030;
    }

    <nav class="navbar navbar-default navbar-fixed-top">
        <div class="navbar-collapse">
            <ul class="nav navbar-nav">
                <li>
                    <a>目录1</a>
                </li>
                <li>
                    <a>目录2</a>
                </li>
                <li class="active">
                    <a>被选中的目录3</a>
                </li>
            </ul>
        </div>
    </nav>