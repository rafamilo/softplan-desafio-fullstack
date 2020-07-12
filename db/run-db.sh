#!/bin/sh
docker run -p 7894:3306 --name processes-db -e MYSQL_DATABASE=processes -e MYSQL_ROOT_PASSWORD=root -d mysql:latest mysqld --default-authentication-plugin=mysql_native_password