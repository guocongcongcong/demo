# demo

> 这是一个Sping boot环境，用来熟悉框架的的测试系统。
> 可能会集成一些其他的东西，做一些我认为有意思的事情。

## 加载

### 热部署

```xml
<!--pom.xml -->
    <dependencies>
        <!--添加热部署-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <optional>true</optional>
            <scope>true</scope>
        </dependency>
    </dependencies>

        <plugins>
            <plugin>
                <!--热部署配置-->
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <configuration>
                    <!--fork:如果没有该项配置,整个devtools不会起作用-->
                    <fork>true</fork>
                </configuration>
            </plugin>
        </plugins>

```

### lombok

- 在xml中加载lombok模块
- 在Data中使用注入

```xml
<dependency>
    <groupId>org.projectlombok</groupId>
    <artifactId>lombok</artifactId>
    <version>1.16.10</version>
</dependency>
```

```java
@Data
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class User{
    private int score;
    private int age;
}
```

## 功能

### list内排序
- ~~实现集合内（List）数据的排序~~
    - com.example.demo.model.User
    - com.example.demo.controller.ListCompareToController
    
> 在实体类内重新Compare的CompareTo方法
> 调用Collections的sort方法

### 把list转为map

- ~~把list转为map~~
    - com.example.demo.service.ConvertBeanService
    - com.example.demo.controller.ConvertBeanController

