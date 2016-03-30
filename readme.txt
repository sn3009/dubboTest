1. DubboTest 为 provider
2. DubboConsumer 为 consumer
3. 默认设置为multicast, 若有zookeeper可以开启两个配置文件中的<dubbo:registry  protocol="zookeeper" address="10.10.212.147:2181" />并修改ip地址
4. 下载源码后，分别在DubboTest和DubboConsumer中引用DubboEntity和DubboTestService两个项目，或两个项目打包jar后引用
5. 在DubboTestService项目中引用DubboEntity
6. 先启动DubboTest，然后启动DubboConsumer
