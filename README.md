## 🧱 Estructura del Modelo de Datos

Entidades principales:

- 📖 Libro
- ✍️ Autor
- 👤 Cliente
- 🧾 Venta
- 📦 DetalleVenta

Relaciones:

- Un libro puede tener varios autores (relación muchos a muchos).
- Un cliente puede tener muchas ventas.
- Una venta contiene múltiples detalles.
- Cada detalle de venta se refiere a un libro específico.

---

## 🚀 Tecnologías utilizadas

- Java 17
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Docker + Docker Compose
- Maven

## 🐳 Levantar la base de datos PostgreSQL (Docker)
- docker-compose up -d

Esto iniciará un contenedor con:
Base de datos: dawcorto
Usuario: postgres
Contraseña: admin123
Puerto: 5433

## 👾 Desde la terminal de VS usar comando
- mvn spring-boot:run

## 🌐 Probar algunos endpoints
Desde navegador:

- http://localhost:8081/api/libros
- http://localhost:8081/api/autores
- http://localhost:8081/api/clientes


---------------------DIAGRAMA DE LA BASE DE DATOS CON SUS RELACIONES-----------------------
![image](https://github.com/user-attachments/assets/91344a8a-38b1-45a6-b2cb-9c17c9dc5fb6)
