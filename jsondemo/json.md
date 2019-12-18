1. JSON报文

   ```json
   {
     "id": "box id(serial number)",
     "name": "box name",
     "mac": "MAC address of box",
     "ip": "IP address of box",
     "timestamp": {timestamp MS integer},
     "status": {
       "cpu": 85,
       "ram": 65,
       "disk": 80
     },
     "service": [
       {
         "service name": "name of service",
         "state": integer code,
         "message": "string description"
       }
     ],
     "configuration": {
       "配置项key": "配置项value"
     }
   }
   ```
