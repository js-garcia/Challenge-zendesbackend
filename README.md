# 🎓 Challenge Backend - Zendesk + ABM de Carreras

Este proyecto fue desarrollado como parte de un challenge técnico para la posición de trainee backend. Consiste en dos partes principales:

- ✅ Un CRUD completo para gestionar carreras de un instituto.
- ✅ La integración con la API de Zendesk para obtener y agregar comentarios a un ticket.

---

## 🚀 Tecnologías utilizadas

- Java 21  
- Spring Boot 3.4  
- Spring Data JPA  
- H2 Database (en memoria)  
- Lombok  
- Maven  

---

## 🧠 Funcionalidades

### 🔹 ABM de Carreras

El sistema permite:
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

### 🔹 Integración con API de Zendesk

La aplicación se conecta con la API de Zendesk para:

- Obtener la lista de comentarios de un ticket (`GET /tickets/{id}/comments`)
- Agregar un nuevo comentario a un ticket (`POST /tickets/{id}/comments`)

---

## 🛠️ Cómo ejecutar el proyecto

1. Clonar el repositorio:
```bash

---

2. Abrir el proyecto en tu IDE
Ejecuta la clase :

ZendeskbackendApplication.java

Accede a la API en : http://localhost:8080

---

com.challenge.zendeskbackend
├── controller
│   ├── CarreraController.java
│   └── TicketController.java
├── model
│   └── Carrera.java
├── repository
│   └── CarreraRepository.java
├── service
│   ├── CarreraService.java
│   └── ZendeskService.java
└── ZendeskbackendApplication.java
