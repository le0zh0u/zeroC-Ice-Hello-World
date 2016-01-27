# zeroC-Ice-Hello-World
Hello World Sample Of ZeroC Ice

###First install slice2java in mac

```
brew install ice
```

it will install slice2java.

### second write HelloWorld.ice file

```
module myHelloWorld{
	interface HelloWorld{
        void say(string s);
    };
};
```

It define the interface named **say**

### third run the transform code

```
slice2java HelloWorld.ice
```

It will add some java files.


***

To be continue.

Next will add client and server.

***

Has finished.

Go head the explain.

***

### fourth add some servant

Add a HelloWorldI.java to implement the function named `say`.

```
public class HelloWorldI extends _HelloWorldDisp {
    private static final long serialVersionUID = 1L;

    public void say(String s, Current __current) {
        System.out.println("Hello World!" + " the string s is " + s);
    }
}
```

### fifth add a client file and a server file

Both of them are listening the port of 10000
run the function named `main` in the server.java
It will print:

```
   初始化ice run time ......
   创建对象适配器，监听端口10000...
   为接口创建servant...
   对象适配器加入servant...
   激活适配器，服务器等待处理请求...

```
Then, run the function named `main` in the client.java
It ran and finished immediately.
The window which ran server.java will print  

```
Hello World! the string s is bar
```

And then, server is finished.

***

ps. it refer from [ZEROC ICE 跨平台间程序调用 java版](http://www.tuicool.com/articles/nYJVj2R "Page Link")
if it is not allowed , please contact me.
