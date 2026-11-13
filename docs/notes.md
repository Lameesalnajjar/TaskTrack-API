# Technical Notes & Documentation - TaskTrack-API

## 1. Architecture & Design Decisions
- **Spring Boot REST API**: Implemented lightweight endpoints to handle task tracking via `/api/tasks` with full CRUD capabilities.
- **Docker Multi-Stage Build**: Utilized Eclipse Temurin JRE and Maven to optimize final container image size and build footprint.
- **Static Frontend Integration**: Placed responsive HTML/CSS/JS pages inside `src/main/resources/static/` (`login.html`, `dashboard.html`, `profile.html`) to serve an interactive modern application directly from port `8080`.
- **UI/UX Aesthetics**: Styled with a soft  featuring split-screen sliding layouts, dynamic student avatars, hover-card statistics, and animated progress bars.

## 2. Bonus Tasks Implementation
- **Bonus A (Docker Compose)**: Configured `docker-compose.yml` for streamlined container orchestration, environment setup, and effortless execution.
- **Bonus C (Multi-stage Docker Build)**: Separated the build environment (Maven compilation) from the runtime environment (Eclipse Temurin JRE) to minimize image footprint.
- **Bonus D (Health Endpoint & Stability)**: Ensured robust routing and response verification for container monitoring and availability checks.
- **Bonus E (Makefile Integration)**: Provided quick commands (`make build`, `make run`, `make docker-up`, `make clean`) for effortless container management and developer workflows.

## 3. Frontend & UI Pages Overview
- `login.html`: Interactive split-screen authentication with sliding panels for switching seamlessly between Sign In and Sign Up.
- `dashboard.html`: Task management hub connected to Spring Boot REST API for adding, listing, and deleting tasks.
- `profile.html`: Student profile page featuring interactive user statistics, an animated progress bar, and custom avatar customization.

## 4. Troubleshooting & Problem Solving
- **Package Naming Mismatch**: Resolved a `404 Not Found` error on API routes by standardizing package hierarchies (`com.example.TaskTrack_API.controller`) across application components, allowing Spring Boot component scanning to correctly detect mappings inside Docker.
- **UI Interaction & Authentication Toggle**: Fixed panel overlay sliding behavior in `login.html` to allow full interactivity and dynamic switching between Sign In and Sign Up forms.