# Stage 1: Build
FROM maven:3.8.6-openjdk-11 AS builder

WORKDIR /app

COPY pom.xml .
RUN mvn dependency:go-offline -B

COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Runtime - older JDK on Ubuntu Jammy (carries known CVEs)
FROM eclipse-temurin:11-jre-jammy

LABEL maintainer="exam-platform@example.com"
LABEL service="physics-service"
LABEL version="1.0.0"

WORKDIR /app

RUN apt-get update && \
    apt-get install -y curl wget net-tools && \
    rm -rf /var/lib/apt/lists/*

COPY --from=builder /app/target/physics-service-1.0.0.jar app.jar

EXPOSE 8081

ENV JAVA_OPTS="-Xms256m -Xmx512m"
ENV SPRING_PROFILES_ACTIVE=default

HEALTHCHECK --interval=30s --timeout=10s --start-period=40s --retries=3 \
  CMD curl -f http://localhost:8081/api/physics/health || exit 1

ENTRYPOINT ["java", "-jar", "/app/app.jar"]
