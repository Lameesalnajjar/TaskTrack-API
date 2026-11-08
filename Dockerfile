# المرحلة الأولى: بناء المشروع وتوليد ملف الـ Jar باستخدام بيئة Maven
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline
COPY src ./src
RUN mvn clean package -DskipTests

# المرحلة الثانية: التشغيل النهائي باستخدام بيئة JRE خفيفة وآمنة
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]