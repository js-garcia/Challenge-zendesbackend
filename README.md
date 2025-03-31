# 🎓 Challenge Backend - ABM de Carreras

Este proyecto fue desarrollado como parte de un challenge técnico para la posición de trainee backend. Consiste en un sistema para gestionar carreras de un instituto mediante una API REST.

---

## 🚀 Tecnologías utilizadas

- Java 21  
- Spring Boot 3.4  
- Spring Data JPA  
- H2 Database (en memoria)  
- Lombok  
- Maven  

---

## 🧠 Funcionalidades implementadas

### ✅ ABM de Carreras

Permite:
- Crear una nueva carrera.
- Consultar todas las carreras existentes.
- Actualizar una carrera por su ID.
- Eliminar una carrera.

**Endpoints disponibles:**

| Método | Endpoint              | Descripción                     |
|--------|------------------------|---------------------------------|
| GET    | /carreras              | Lista todas las carreras        |
| POST   | /carreras              | Crea una nueva carrera          |
| PUT    | /carreras/{id}         | Actualiza una carrera existente |
| DELETE | /carreras/{id}         | Elimina una carrera             |

---

## 🧪 Base de datos en memoria (H2)

Podés acceder a la base de datos desde:
http://localhost:8080/h2-console

