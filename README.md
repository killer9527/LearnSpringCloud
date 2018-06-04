# LearnSpringCloud
学习SpringCloud

# 消息总线
http的post请求：
http://localhost:8769/actuator/bus-refresh

# Zipkin-Server
由于1.5.x版本的server不能收到2.x版本的client的http消息
但是2.x版本的zipkin server只能直接起jar包：zipkin-server-2.8.4-exec.jar
因此，使用jar命令启动jar包：`java -jar zipkin-server-2.8.4-exec.jar --server.port=8770`
