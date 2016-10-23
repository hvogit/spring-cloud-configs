`## test: 
curl localhost:8001/configs/dev

```js
{"name":"configs","profiles":["dev"],"label":"master","version":"a16ab4b9200b25b5c49abfd3ece4bfe3d9bd3c7e","state":null,"propertySources":[{"name":"https://github.com/hvogit/spring-cloud-configs/config-data/configs.yml#dev","source":{"spring.profiles":"dev","lucky-word":"Hello (dev)"}},{"name":"https://github.com/hvogit/spring-cloud-configs/config-data/configs.yml","source":{"lucky-word":"Hello (default)"}}]}
```

```js
{
   "version" : "a16ab4b9200b25b5c49abfd3ece4bfe3d9bd3c7e",
   "name" : "configs",
   "state" : null,
   "propertySources" : [
      {
         "source" : {
            "lucky-word" : "Hello (dev)",
            "spring.profiles" : "dev"
         },
         "name" : "https://github.com/hvogit/spring-cloud-configs/config-data/configs.yml#dev"
      },
      {
         "source" : {
            "lucky-word" : "Hello (default)"
         },
         "name" : "https://github.com/hvogit/spring-cloud-configs/config-data/configs.yml"
      }
   ],
   "label" : "master",
   "profiles" : [
      "dev"
   ]
}
```