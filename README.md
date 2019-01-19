# springcloud

consul agent -dev -config-dir=./consul.d

consul agent -server -bootstrap-expect=1 -data-dir=consul-data -ui -bind=192.168.0.13 -config-dir=./consul.d


employee.json
{
   "service":{
      "name":"employee",
      "address":"localhost",
      "tags":[
         "springboot"
      ],
      "port":8082
   },
   "check":{
      "id":"api",
      "name":"HTTP API on port 8082",
      "http":"http://localhost:8082/actuator/health",
      "tls_skip_verify":false,
      "method":"GET",
      "header":{
         "x-foo":[
            "bar",
            "baz"
         ]
      },
      "interval":"10s",
      "timeout":"1s"
   }
}

