# Spring Boot 开发常用的热部署的方式
##  使用Spring Loaded
```
<plugins>
    <plugin>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-maven-plugin</artifactId>
        <dependencies>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>springloaded</artifactId>
                <version>1.2.8.RELEASE</version>
            </dependency>
        </dependencies>
    </plugin>
</plugins>
```
这种方式是使用 spring-boot:run 启动项目的
需要热部署时使用cmd+ f9 重新build一下项目

##  spring-boot-devtools
> spring-boot-devtools 的原理是 cmd+ f9 之后自动重启项目
> 自动重启的原理是spring boot 会用两个classloader

```
 <dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-devtools</artifactId>
    <optional>true</optional>
</dependency>
```
### 默认属性
spring.thymeleaf.cache 自动设置false

### 自动重启
自动重启的原理在于spring boot使用两个classloader：不改变的类（如第三方jar）由base类加载器加载，正在开发的类由restart类加载器加载。应用重启时，restart类加载器被扔掉重建，而base类加载器不变，这种方法意味着应用程序重新启动通常比“冷启动”快得多，因为base类加载器已经可用并已填充。

### 排除静态文件 对于thymeleaf 本身可以实时编译，不需要重启
spring.devtools.restart.exclude=templates/**



<a href="https://juejin.im/post/5a49fb685188252bca0536e2">参考链接</a>