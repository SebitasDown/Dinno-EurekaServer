# Servidor Eureka de Dinno

Este repositorio contiene el **Registro de Servicios Eureka** para el ecosistema de Dinno. Está construido con Spring Boot y Spring Cloud Netflix Eureka Server para proporcionar capacidades de descubrimiento de servicios.

## 🚀 Descripción General

El Servidor Eureka funciona como un registro central donde todos los microservicios de la plataforma Dinno se registran. Esto permite que los servicios se descubran y se comuniquen entre sí sin necesidad de configurar direcciones IP o nombres de host de forma estática.

## 🛠 Stack Tecnológico

- **Java**: 21
- **Framework**: Spring Boot 3.4.3
- **Soporte de Cloud**: Spring Cloud 2024.0.0 (Netflix Eureka Server)
- **Contenerización**: Docker

## ⚙️ Configuración

La aplicación está configurada para ejecutarse en el puerto `8761` por defecto.

### Propiedades Clave (`application.yaml`)

| Propiedad | Descripción |
| :--- | :--- |
| `server.port` | El puerto en el que se ejecuta el servidor (por defecto: 8761). |
| `eureka.instance.hostname` | Nombre de host para la instancia de Eureka. |
| `eureka.client.register-with-eureka` | Establecido en `false` ya que este es el servidor web. |
| `eureka.client.fetch-registry` | Establecido en `false` para el servidor de registro. |

## 📦 Primeros Pasos

### Requisitos Previos

- [JDK 21](https://adoptium.net/)
- [Maven](https://maven.apache.org/) (o usa el wrapper `mvnw` incluido)

### Ejecución Local

Para iniciar el Servidor Eureka localmente:

```bash
./mvnw spring-boot:run
```

Una vez iniciado, puedes acceder al Dashboard de Eureka en:
[http://localhost:8761](http://localhost:8761)

### Ejecución con Docker

1. **Construir la imagen**:
   ```bash
   docker build -t dinno-eureka-server .
   ```

2. **Ejecutar el contenedor**:
   ```bash
   docker run -p 8761:8761 dinno-eureka-server
   ```

## 🌐 Despliegue

El proyecto está configurado para despliegues con nombres de host específicos del entorno (ej. Render). Asegúrate de que la variable de entorno `PORT` esté configurada si vas a desplegar en un proveedor que asigne puertos dinámicamente.

---
*Parte del ecosistema del Proyecto Dinno.*
