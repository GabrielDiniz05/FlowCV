# Run docker:  docker build -t dbpgsql .
FROM node:14

WORKDIR /app-node

COPY . .

RUN npm install 

ENTRYPOINT npm start
