# 原始版本
这个分支存放的是本项目的初始版本，包含一个exampleMod，仅用于在本地初始化项目。

.zip后缀的是压缩版本，需要解压
也可以直接下载解压好的文件夹版本

# 使用教程
1.使用IDEA打开文件目录下的"Build.gradle"文件。

![1.png](README文件中的图片/1.png)

2.打开后选择“Open as project”

![2.png](README文件中的图片/2.png)

3.如果出现弹出提示是否"trust"（即信任），请选择trust

进行完上述步骤后，会打开IDEA界面，并在下方出现一个弹窗，开始运行build.gradle（这个是用来进行一些配置，下载依赖和反编译的）
此步骤会运行很长一段时间，如果实在太慢或者网络问题失败了就需要挂代理(梯子)

![4.png](README文件中的图片/4.png)

如果下方弹窗出现"BUILD SUCCESSFUL"字样即为运行完成

![3.png](README文件中的图片/3.png)


运行完成后，在右侧选项卡中点击"Gradle",会出现一个弹窗

![5.png](README文件中的图片/5.png)

选择Tasks（点击左侧小三角可展开）——forgegradle runs——runClient, 双击"runClient"，这里可以运行游戏，以后要测试mod功能都通过这里启动游戏。

![6.png](README文件中的图片/6.png)

等待几十秒后，会出现游戏窗口

![7.png](README文件中的图片/7.png)

点击游戏菜单中的"Mods",即可查看所有已装载的Mod
此处就可以看到本项目自带的mod，即“Example Mod”，这里会显示一些有关Mod的信息，如版本，作者，致谢，前置mod等等

![8.png](README文件中的图片/8.png)

forge-mdk环境配置及运行介绍至此结束.
