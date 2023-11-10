FROM ubuntu:18.04
RUN apt-get update && apt-get install nginx -y
ENV ENV_VAR=value_of_env_var

EXPOSE 80

USER 1000

CMD ["nginx", "-g", "daemon off;"]
#ENTRYPOINT [ "nginx", "-g", "daemon off;" ]
