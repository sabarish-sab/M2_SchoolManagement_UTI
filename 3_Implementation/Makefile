default: test

build:
	go build -v -o ./_bin/Tictactoe

run: build
	./_bin/Tictactoe

run_on_docker:
	docker build -t Tictactoe . && docker run --rm -ti Tictactoe

test:
	go test -v ./...
