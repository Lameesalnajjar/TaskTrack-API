# Technical Notes & Bonus Documentation - TaskTrack-API

## 1. Architecture & Design Decisions
- **Spring Boot REST API**: Implemented lightweight endpoints to handle task tracking via `/api/tasks`.
- **Docker Multi-Stage Build**: Utilized Eclipse Temurin JRE and Maven to optimize final container image size.
- **Static Frontend Integration**: Placed `index.html` inside `src/main/resources/static/` to serve an interactive web landing page directly from port `8080`.

## 2. Troubleshooting & Problem Solving (Bonus Criteria)
- **Issue**: Encountered a `404 Not Found` error on the API route while the static HTML rendered properly.
- **Root Cause**: A package naming mismatch existed between the main application class (`com.example.TaskTrack_API`) and the controller (`com.example.tasktrack.controller`).
- **Solution**: Standardized the package naming conventions across all application layers (`com.example.TaskTrack_API.controller`), enabling Spring Boot component scanning to detect the API mapping inside Docker.