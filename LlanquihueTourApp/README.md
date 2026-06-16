# LlanquihueTourApp

**LlanquihueTourApp** es una aplicación de consola desarrollada en Java que permite cargar, almacenar y visualizar información de tours turísticos de la zona de Llanquihue y sus alrededores.

El proyecto lee los datos desde un archivo de texto, los convierte en objetos Java y luego muestra distintos listados filtrados por precio y tipo de tour.

---

## Descripción del proyecto

Esta aplicación tiene como objetivo gestionar información básica de tours turísticos, incluyendo:

- Nombre del tour.
- Destino.
- Fecha.
- Precio.
- Tipo o categoría del tour.

Los datos son cargados desde un archivo externo ubicado en la carpeta `resources`, lo que permite modificar la información sin alterar directamente el código fuente.

---

## Características principales

- Carga de tours desde archivo de texto.
- Almacenamiento de datos en una lista de objetos `Tour`.
- Visualización completa de tours disponibles.
- Filtro de tours con precio mayor a `30000`.
- Filtro de tours con precio menor a `15000`.
- Filtro de tours de tipo gastronómico.
- Código organizado por paquetes según responsabilidad.
- Uso de comentarios JavaDoc para documentar clases y métodos.

---

## Tecnologías utilizadas

- **Java**
- **Programación orientada a objetos**
- **Lectura de archivos con `BufferedReader`**
- **Colecciones con `ArrayList`**
- **IDE recomendado:** IntelliJ IDEA

---

## Estructura del proyecto

LlanquihueTourApp/
└── resources/
├── src/
│   ├── model/
│   │   └── Tour.java
│   ├── data/
│   │   └── GestorDatos.java
│   ├── app/
│   │   └── Main.java
│       └── tours.txt
├── README.md
└── (archivos de IntelliJ)



---

## Descripción de paquetes

### `cl.duoc.llanquihuetourapp.app`

Contiene la clase principal de la aplicación.

- **`Main.java`**  
  Inicia el programa, carga los datos desde el archivo y muestra los listados de tours por consola.

### `cl.duoc.llanquihuetourapp.data`

Contiene las clases relacionadas con la gestión de datos.

- **`GestorDatos.java`**  
  Se encarga de leer el archivo `tours.txt`, procesar cada línea y crear objetos de tipo `Tour`.

### `cl.duoc.llanquihuetourapp.model`

Contiene las clases del modelo de datos.

- **`Tour.java`**  
  Representa un tour turístico con sus atributos principales: nombre, destino, fecha, precio y tipo.

---

## Formato del archivo de datos

El archivo `resources/tours.txt` debe contener un tour por línea.  
Cada dato debe estar separado por punto y coma `;`.

### Formato esperado

text nombre;destino;fecha;precio;tipo


### Ejemplo

text Lago Llanquihue;Puerto Varas;31-12
;20000;turístico Ruta Gastronómica
;Puerto Varas;01-01;28000;gastronómico Volcán Osorno
;Ensenada;05-02;35000;cultural Museo Alemán
;Frutillar;28-02;6000;cultural


> **Importante:** cada línea debe contener exactamente 5 campos. Si una línea tiene menos o más datos, no será cargada correctamente.

---

## Requisitos

Para ejecutar este proyecto necesitas:

- Java JDK instalado.
- IntelliJ IDEA, NetBeans, Eclipse o cualquier IDE compatible con Java.
- Archivo `tours.txt` ubicado dentro de la carpeta `resources`.

Versión recomendada:

Java 23 o superior


---

## Cómo ejecutar el proyecto

### Opción 1: desde IntelliJ IDEA

1. Abrir IntelliJ IDEA.
2. Seleccionar **Open** y abrir la carpeta del proyecto `LlanquihueTourApp`.
3. Verificar que el SDK de Java esté configurado.
4. Abrir la clase:
5. Ejecutar el método `main`.

---

### Opción 2: desde terminal

Desde la raíz del proyecto, compilar los archivos Java:


---

## Posibles mejoras futuras

Algunas mejoras que podrían implementarse en futuras versiones son:

- Validar y reportar líneas incorrectas del archivo.
- Usar `LocalDate` para manejar fechas de forma más precisa.
- Permitir búsqueda de tours por destino.
- Permitir búsqueda de tours por rango de precio.
- Crear un menú interactivo por consola.
- Agregar persistencia de nuevos tours en el archivo.
- Mejorar el formato visual de salida.
- Implementar pruebas unitarias.
- Migrar a una interfaz gráfica o aplicación web.

---

## Autor

Proyecto desarrollado con fines académicos para practicar:

- Programación orientada a objetos.
- Lectura de archivos.
- Manejo de colecciones.
- Organización de paquetes en Java.

---

## Licencia

Este proyecto puede utilizarse libremente con fines educativos.
