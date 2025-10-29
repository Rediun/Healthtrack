# --- Etapa 1: Construcción (Build) ---
# Usamos una imagen de Maven con Java 17 para compilar el proyecto
FROM maven:3.8.5-openjdk-17 AS build

# Establecemos el directorio de trabajo
WORKDIR /app

# Copiamos el pom.xml y descargamos las dependencias
COPY pom.xml .
RUN mvn dependency:go-offline

# Copiamos el resto del código fuente y construimos el .jar
COPY src ./src
RUN mvn clean package -DskipTests

# --- Etapa 2: Ejecución (Runtime) ---
# Usamos una imagen ligera de Java 17 para correr la app
FROM openjdk:17-jdk-slim

WORKDIR /app

# Copiamos el .jar construido de la etapa anterior
COPY --from=build /app/target/healthtrack-api-0.0.1-SNAPSHOT.jar app.jar

# Exponemos el puerto en el que corre Spring Boot
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]