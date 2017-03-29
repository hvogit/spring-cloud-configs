# Spring Cloud Configs Demo

![diagram](diagram.png)

### refs:
* Building Microservices with Spring Cloud (https://www.youtube.com/watch?v=ZyK5QrKCbwM&t=3888s)
* http://cloud.spring.io/spring-cloud-static/spring-cloud-config/1.3.0.RC1/#_push_notifications_and_spring_cloud_bus
* http://zoltanaltfatter.com/2016/06/30/centralized-configuration-with-spring-cloud-config/
* https://github.com/spring-cloud/spring-cloud-config/blob/master/docs/src/main/asciidoc/quickstart.adoc
* https://github.com/joshlong/bootiful-microservices (https://www.youtube.com/watch?v=cCEvFDhe3os)

### notes:
* searchPaths: config-data -> git folder(s) for config files
* spring.application.name: configs -> mapped to config file name on git (configs.yml)
* spring.profiles.active: dev -> set active profile for client in bootstrap.yml
* run rabbitmq-server 
. web ui: localhost:15672 (guest/guest)
* http tunneling : ngrok.io
 

### tests:
```js
// http tunnel (web ui: localhost:4040)
ngrok http 8080

// can manually notify config-server about configs changes
// curl localhost:8080/monitor -d path="configs"

// or config github webhook to notify config-server when there is a push
// e.g: Payload URL: http://3ad59caf.ngrok.io/monitor -> push events

// run mq server
rabbitmq-server

// run config-server
cd config-server
mvn spring-boot:run 
curl localhost:8080/configs/[ |default|dev|test]

// run client #1
cd config-client
mvn spring-boot:run -Dserver.port=8081 
curl localhost:8081
curl localhost:8081/welcome
curl localhost:8081/hello

// run client #2
cd config-client
mvn spring-boot:run -Dserver.port=8082 
curl localhost:8081/hello ; curl localhost:8082/hello 

// update config value, commit, push.

// test again, should see the new value in both clients
curl localhost:8081/hello; curl localhost:8082/hello 

// update readme, commit, push.
// config-server gets refreshed, but not the clients

```

