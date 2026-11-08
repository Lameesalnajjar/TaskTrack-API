# Technical Notes & Bonus Documentation - TaskTrack-API

## 1. Architecture & Design Decisions
- **Spring Boot REST API**: Implemented lightweight endpoints to handle task tracking via `/api/tasks`.
- **Docker Multi-Stage Build**: Utilized Eclipse Temurin JRE and Maven to optimize final container image size.
- **Static Frontend Integration**: Placed `index.html` inside `src/main/resources/static/` to serve an interactive web landing page directly from port `8080`.

## 2. Bonus Tasks Implementation
- **Bonus C (Multi-stage Docker Build)**: Separated the build environment (Maven compilation) from the runtime environment (Eclipse Temurin JRE) to minimize image footprint.
- **Bonus E (Makefile Integration)**: Provided quick commands (`make build`, `make run`, `make stop`) for effortless container management.
- **Bonus A (Docker Compose)**: Configured `docker-compose.yml` for streamlined container orchestration and easy execution.
- **Bonus D (Health Endpoint & Stability)**: Ensured robust routing and response verification for container monitoring and availability checks.

## 3. Troubleshooting & Problem Solving
- **Package Naming Mismatch**: Resolved a `404 Not Found` error on API routes by standardizing package hierarchies (`com.example.TaskTrack_API.controller`) across application components, allowing Spring Boot component scanning to correctly detect mappings inside Docker.