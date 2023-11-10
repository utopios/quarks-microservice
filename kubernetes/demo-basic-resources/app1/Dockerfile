FROM node:14

WORKDIR /app

COPY . /app/

RUN npm install

EXPOSE 3000

USER 1000

ENTRYPOINT [ "node", "index.js" ]

