FROM golang:alpine
ENV LANG en_US.UTF-8

COPY . /go/src/github.com/Rishitha-konatham/M3_javaproject_Game.git
WORKDIR /go/src/github.com/Rishitha-konatham/M3_javaproject_Game.git

RUN apk add --no-cache git
RUN go get ./
RUN go build -o ./_bin/Tictactoe

ENTRYPOINT "./_bin/Tictactoe"
