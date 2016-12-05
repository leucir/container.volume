#Use the IBM Node image as a base image
FROM registry.ng.bluemix.net/ibmliberty:latest

COPY ./target/container.volume-0.0.1-SNAPSHOT.war /opt/ibm/wlp/usr/servers/defaultServer/dropins/

ENV LICENSE accept