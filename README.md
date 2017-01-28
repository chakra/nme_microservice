
#### Important endpoints
- http://DOCKER-HOST:80 - Gateway
- http://DOCKER-HOST:8761 - Eureka Dashboard
- http://DOCKER-HOST:9000/hystrix - Hystrix Dashboard
- http://DOCKER-HOST:8989 - Turbine stream (source for the Hystrix Dashboard)
- http://DOCKER-HOST:15672 - RabbitMq management (default login/password: guest/guest)

export CONFIG_SERVICE_PASSWORD='configpassword'
export ACCOUNT_SERVICE_PASSWORD='accountpassword'
export NOTIFICATION_SERVICE_PASSWORD='notificationpassword'
export MONGODB_PASSWORD='password'
export CUSTOMER_SERVICE_PASSWORD='customerpassword'
export TRANSACTION_SERVICE_PASSWORD='transactionpassword'# nme_microservice
