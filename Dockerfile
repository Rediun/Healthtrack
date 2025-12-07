# --- Etapa 1: Construcción (Build) ---

FROM maven:3.8.5-openjdk-17 AS build


WORKDIR /app


COPY pom.xml .
RUN mvn dependency:go-offline

COPY src ./src
RUN mvn clean package -DskipTests

# --- Etapa 2: Ejecución (Runtime) ---

FROM openjdk:17-jdk-slim

WORKDIR /app


COPY --from=build /app/target/healthtrack-api-0.0.1-SNAPSHOT.jar app.jar


EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]