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
