# Spring Cloud Configs Demo

![diagram](diagram.png)

### refs:
* Building Microservices with Spring Cloud (https://www.youtube.com/watch?v=ZyK5QrKCbwM&t=3888s)
* https://github.com/spring-cloud/spring-cloud-config/blob/master/docs/src/main/asciidoc/quickstart.adoc
* https://github.com/joshlong/bootiful-microservices (https://www.youtube.com/watch?v=cCEvFDhe3os)

### labs:
* https://github.com/kennyk65/Microservices-With-Spring-Student-Files

### notes:
* searchPaths: config-data -> git folder(s) for config files
* spring.application.name: configs -> mapped to config file name on git (configs.yml)
* spring.profiles.active: dev -> set active profile for client in bootstrap.yml
* run rabbitmq-server 
. web ui: localhost:15672 (guest/guest)
* http tunneling : ngrok.io
 

### tests:
```js
run config-server (8080)
curl localhost:8080/configs/[ |default|dev|test]

run config-client (8081)
curl localhost:8081
curl localhost:8081/welcome
curl localhost:8081/hello

run config-client (8082)
curl localhost:8082/hello

// update config value, commit, push.

// config github webhook and use ngrok, and have them send this notification
//curl localhost:8081/monitor -d path="configs"
curl localhost:8081/hello; curl localhost:8082/hello 

// should see the new value in both clients
```

