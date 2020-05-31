### [dubbo 的官网文档](http://dubbo.apache.org/zh-cn/docs/user/quick-start.html)
### [dubbo 的gitHub](https://github.com/apache/dubbo)

### 环境准备
> window 安装zookeeper
 * [下载zookeeper](https://archive.apache.org/dist/zookeeper/zookeeper-3.4.13/)
 * 解压运行zkServer.cmd ，初次运行会报错，没有zoo.cfg配置文件
 * 修改zoo.cfg配置文件
   将conf下的zoo_sample.cfg复制一份改名为zoo.cfg即可。
   注意几个重要位置：
   dataDir=./   临时数据存储的目录（可写相对路径）
   clientPort=2181   zookeeper的端口号
   修改完成后再次启动zookeeper
 * 使用zkCli.cmd测试
> 安装dubbo-admin管理控制台
 * [下载dubbo-admin](https://github.com/apache/incubator-dubbo-ops)
 * 进入目录，修改dubbo-admin配置
   修改 src\main\resources\application.properties 指定zookeeper地址
```propertie
dubbo.registry.address=zookeeper://127.0.0.1:2181
```
 * 打包dubbo-admin项目
 ```java
mvn clean package
```
 * 运行dubbo-admin的jar包
  ```java
java -jar dubbo-admin-0.0.1-SNAPSHOT.jar
 ```
 * 页面输入localhost:7001,输入账号密码 root/root

### duboo 的配置原则
> * JVM 启动 -D 参数优先，这样可以使用户在部署和启动时进行参数重写，比如在启动时需改变协议的端口。
  * XML 次之，如果在 XML 中有配置，则 dubbo.properties 中的相应配置项无效。
  * Properties 最后，相当于缺省值，只有 XML 没有配置时，dubbo.properties 的相应配置项才会生效，通常用于共享公共配置，比如应用名
 ![](http://dubbo.apache.org/img/blog/configuration.jpg)

### dubbo 的多版本
 * provider.xml的配置
  ```xml
    <!-- 版本1.0.0 -->
    <bean id="provideService" class="com.alibaba.service.impI.ProviderServiceImpI"/>
    <dubbo:service interface="com.alibaba.service.ProviderService" ref="provideService" version="1.0.0"/>
    !-- 版本2.0.0 -->
    <bean id="provideService2" class="com.alibaba.service.impI.ProviderServiceImpI2"/>
    <dubbo:service interface="com.alibaba.service.ProviderService" ref="provideService2" version="2.0.0"/>
  ```
  * consumer.xml的配置
   ```xml
     	<dubbo:reference interface="com.alibaba.service.ProviderService" id="providerService" version="2.0.0"/>
   ```