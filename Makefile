# Makefile for TaskTrack Project

.PHONY: build run clean docker-build docker-up docker-down

# Compile and package the application using Maven wrapper
build:
	./mvnw clean package

# Run the Spring Boot application locally
run:
	./mvnw spring-boot:run

# Clean target directories
clean:
	./mvnw clean

# Build Docker image manually
docker-build:
	docker build -t tasktrack-app .

# Run application using Docker Compose
docker-up:
	docker-compose up --build

# Stop and remove Docker Compose containers
docker-down:
	docker-compose down