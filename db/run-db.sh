#!/bin/sh
docker build -t softplan/processes-db . &&
docker run -p 7984:3306 --name processes-db -d softplan/processes-db --default-authentication-plugin=mysql_native_password