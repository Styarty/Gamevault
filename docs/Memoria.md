## 1. Introducción

### 1.1. Presentación del proyecto

GameVault es una aplicación web desarrollada para gestionar y organizar colecciones personales de videojuegos.

La aplicación permitirá a los usuarios consultar un catálogo de videojuegos, crear su propia biblioteca, guardar títulos como favoritos, indicar su progreso y publicar valoraciones sobre los juegos.

El objetivo es ofrecer una plataforma sencilla y cómoda en la que los aficionados a los videojuegos puedan tener organizada toda su colección desde un mismo lugar.

### 1.2. Objetivos del proyecto

**Objetivo general:**

Desarrollar una aplicación web que permita gestionar colecciones de videojuegos mediante una interfaz sencilla, conectada a una base de datos y a una API REST.

**Objetivos específicos:**

- Crear un sistema de registro e inicio de sesión de usuarios.
- Desarrollar un catálogo donde consultar videojuegos.
- Permitir que cada usuario gestione su propia biblioteca.
- Incorporar filtros por género y plataforma.
- Permitir guardar videojuegos favoritos.
- Implementar un sistema de valoraciones y reseñas.
- Crear una interfaz clara, sencilla y fácil de utilizar.
- Conectar el frontend con el backend mediante una API REST.
- Gestionar la información utilizando una base de datos relacional.

### 1.3. Justificación del proyecto

He elegido desarrollar GameVault porque los videojuegos son una temática que me interesa y considero que es una buena oportunidad para crear una aplicación relacionada con ella.

Actualmente existen diferentes plataformas para consultar información sobre videojuegos, pero con GameVault quiero desarrollar una herramienta que permita organizar una colección personal y llevar un seguimiento de los juegos que cada usuario tiene pendientes, está jugando o ha terminado.

Además, este proyecto me permitirá aplicar los conocimientos adquiridos durante el ciclo de Desarrollo de Aplicaciones Multiplataforma, especialmente en programación Java, bases de datos, desarrollo web, APIs REST y gestión de proyectos.

## 2. Tecnologías

### 2.1. Tecnologías previstas

Esta tabla corresponde al apartado 2.1 de la memoria, aunque por ahora podemos dejarla como planificación.

| Componente | Tecnología | Función |
|---|---|---|
| Base de datos principal | MySQL | Guardar usuarios y videojuegos. |
| Backend | Java 21 + Spring Boot | Lógica de la aplicación. |
| API | Spring Web / REST | Comunicación entre frontend y backend. |
| Acceso a datos | Spring Data JPA | Gestionar los datos de MySQL. |
| Cliente | HTML5 | Estructura de las páginas. |
| Diseño | CSS3 | Apariencia visual. |
| Interactividad | JavaScript | Funciones de la interfaz. |
| Administración | Odoo + módulo personalizado | Gestión administrativa del catálogo. |
| Control de versiones | Git + GitHub | Guardar y compartir el código. |

**Importante sobre Odoo:** Odoo utiliza PostgreSQL para su propia base de datos, no MySQL. Por tanto, lo plantearemos como un sistema independiente que podrá comunicarse con GameVault mediante una API. No mezclaremos las dos bases de datos.

## 3. Diseño de la base de datos

### 3.1. Primer boceto de la base de datos

Podemos partir de las seis entidades que ya has creado.

| Tabla | Campos principales |
|---|---|
| usuarios | id, nombre, email, password, fecha_registro |
| videojuegos | id, titulo, descripcion, fecha_lanzamiento, imagen |
| generos | id, nombre |
| plataformas | id, nombre |
| biblioteca | id, usuario_id, videojuego_id, estado, fecha_adicion |
| resenas | id, usuario_id, videojuego_id, puntuacion, comentario, fecha_resena |

**Relaciones principales:**

- Un usuario puede tener muchos videojuegos en su biblioteca.
- Un videojuego puede estar en las bibliotecas de muchos usuarios.
- Un usuario puede escribir varias reseñas.
- Un videojuego puede recibir varias reseñas.
- Un videojuego puede pertenecer a varios géneros.
- Un videojuego puede estar disponible en varias plataformas.
