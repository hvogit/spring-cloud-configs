### refs:
* https://github.com/spring-cloud/spring-cloud-config/blob/master/docs/src/main/asciidoc/quickstart.adoc
* https://github.com/joshlong/bootiful-microservices (https://www.youtube.com/watch?v=cCEvFDhe3os)

### labs:
* https://github.com/kennyk65/Microservices-With-Spring-Student-Files


### tests:
```js
run config-server (8001)
run config-client (8002)
curl localhost:8001/configs/[ |default|dev|test]

curl localhost:8002
curl localhost:8002/hello
```
