# Technical Notes - TaskTrack-API Assignment

## 1. The Biggest Challenge with Docker and How It Was Overcome:
- **The Problem:** When I initially tried to containerize the Spring Boot application using the standard approach, the resulting Docker image was excessively large (over 500 MB). Furthermore, the build process was slow because unnecessary Maven tools, configuration files, and temporary artifacts were being copied into the container.
- **The Solution:** To address this efficiently, I implemented a multi-stage Docker build. I separated the project build and JAR generation phase—which requires the full Maven environment—from the final runtime phase, which uses a lightweight, streamlined JRE. This significantly reduced the image size and ensured that the application runs in a stable, secure environment, fully optimized for production.

## 2. Key Lesson Learned from Working with Git & GitHub:
- **The Lesson:** I learned the importance of maintaining a clean, professional, and standardized commit history (e.g., using prefixes like `feat:` for new features or `docker:` for Docker-related changes). This practice not only keeps the repository organized but also greatly simplifies debugging—making it easy to trace exactly where a change occurred if an issue arises in the `main` branch. This is an essential skill for collaborative, professional software development.