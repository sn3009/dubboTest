1. DubboTest 为 provider
2. DubboConsumer 为 consumer
3. 默认设置为multicast, 若有zookeeper可以开启两个配置文件中的<dubbo:registry  protocol="zookeeper" address="10.10.212.147:2181" />并修改ip地址
4. 下载源码后，在DubboConsumer中引用DubboTest项目，或将DubboTest打包jar后引用
5. 先启动DubboTest，然后启动DubboConsumer