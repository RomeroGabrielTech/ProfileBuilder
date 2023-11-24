# Profile Builder API

Este proyecto es una API RESTful para la creación y gestión de perfiles de usuario. Permite a los clientes registrar usuarios, gestionar sus datos y consultar la información mediante endpoints definidos.

## Características

- Registro de usuario con validación de correo electrónico y contraseña.
- Autenticación de usuarios y generación de tokens JWT.
- Operaciones CRUD para usuarios.
- Base de datos en memoria para una rápida configuración y pruebas.
- Documentación de API con Swagger UI.

## Tecnologías Utilizadas

- Java 8
- Spring Boot 2.5.12
- Spring Security para autenticación
- H2 como base de datos en memoria
- Swagger 3 para documentación de la API

## Requisitos Previos

Para construir y ejecutar la aplicación necesitas:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Configuración

Clona el repositorio a tu máquina local:


git clone https://tu-repositorio.git


Navega al directorio del proyecto y construye la aplicación con Maven:

cd profile-builder
mvn install

## Ejecutar la Aplicación
Una vez construida la aplicación, puedes ejecutarla utilizando:

java -jar target/profilebuilder-0.0.1-SNAPSHOT.war

O si prefieres usar Maven para ejecutarla, utiliza:

mvn spring-boot:run

La aplicación se ejecutará por defecto en el puerto 8081.

## Acceso a la Base de Datos H2
Para acceder a la consola de la base de datos H2:

Navega a http://localhost:8081/h2-console
Conéctate usando la URL JDBC jdbc:h2:mem:testdb con el usuario sa y sin contraseña.

## Uso de la API
Una vez que la aplicación esté en ejecución, puedes navegar a http://localhost:8081/swagger-ui/index.html para ver la documentación de la API y probar los diferentes endpoints.

## Endpoints Disponibles
POST /api/users/register: Registro de un nuevo usuario.
GET /api/users/{id}: Obtener un usuario por su ID.
PUT /api/users/{id}: Actualizar un usuario existente.
DELETE /api/users/{id}: Eliminar un usuario.
Por favor, consulta la documentación de Swagger para más detalles sobre los parámetros y el cuerpo de las solicitudes.

## Contribuir
Si deseas contribuir al proyecto, por favor, sigue estos pasos:

Haz fork del repositorio.
Crea una nueva rama con un nombre descriptivo.
Haz tus cambios y escribe pruebas si es posible.
Envia un pull request con una descripción clara de tus cambios.

## Licencia
Este proyecto está licenciado bajo la Licencia MIT - ver el archivo LICENSE.md para más detalles.


Recuerda sustituir la URL del repositorio (`https://tu-repositorio.git`) por la URL real de tu proyecto en GitHub. Además, asegúrate de que la información como la versión de Spring Boot y las rutas de los endpoints correspondan a las de tu proyecto actual.


