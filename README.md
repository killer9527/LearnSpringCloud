# LearnSpringCloud
学习SpringCloud

# 消息总线
http的post请求：
http://localhost:8769/actuator/bus-refresh

# Zipkin-Server
由于1.5.x版本的server不能收到2.x版本的client的http消息
但是2.x版本的zipkin server只能直接起jar包：zipkin-server-2.8.4-exec.jar
因此，使用jar命令启动jar包：`java -jar zipkin-server-2.8.4-exec.jar --server.port=8770`

# 高可用注册中心
使用application.yml实现配置的选择
package三个jar包，修改每个jar包中application.yml的spring.active.profile实现三个peer的不同配置，然后使用命令
`java -jar wfw-eureka-server-peer1.jar`
`java -jar wfw-eureka-server-peer2.jar`
`java -jar wfw-eureka-server-peer3.jar`
分别启动注册中心的三个结点
