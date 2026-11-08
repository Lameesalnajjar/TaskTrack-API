build:
	docker build -t tasktrack-api .

run:
	docker run -d -p 8080:8080 --name tasktrack-container tasktrack-api

stop:
	docker stop tasktrack-container
	docker rm tasktrack-container

clean:
	docker stop tasktrack-container || true
	docker rm tasktrack-container || true
	docker rmi tasktrack-api || true