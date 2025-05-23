# Proyecto Ruta: Sistema de Seguimiento y Gestión de Transporte Público

[![Lenguaje](https://img.shields.io/badge/Lenguaje-Java%20%7C%20HTML%2FCSS-blue)](https://www.java.com/)
[![Build](https://img.shields.io/badge/Build-Maven-red)](https://maven.apache.org/)
[![Testing](https://img.shields.io/badge/Testing-JUnit%205%20%7C%20Mockito-green)](https://junit.org/junit5/)
[![Documentación ERS](https://img.shields.io/badge/Documentación%20Base-ERS%20(Ver%20PDF)-lightgrey)](https://drive.google.com/file/d/1bW_g3XVCxU-s7R8yvGNEONs2HhUwXoal/view?usp=sharing)
[![Página de Presentación](https://img.shields.io/badge/Demo%20Web-Ver%20Página-brightgreen)](https://estebangc222.github.io/Ruta/pagina_presentacion/)
[![Estado](https://img.shields.io/badge/Estado-En%20Desarrollo%2FDemostrativo-orange)]()

Este repositorio contiene el proyecto "Ruta", un sistema de seguimiento y gestión de transporte público. Incluye una página web de presentación del producto (ver enlace arriba) y un proyecto Java con tests unitarios para la lógica de negocio. **Todo el desarrollo conceptual se ha basado en un documento de Especificación de Requisitos de Software (ERS), disponible para consulta a través del enlace de documentación.**

## Tabla de Contenidos
* [Descripción General del Proyecto "Ruta"](#descripción-general-del-proyecto-ruta)
* [Estructura del Repositorio](#estructura-del-repositorio)
* [Componentes del Proyecto](#componentes-del-proyecto)
    * [1. Página de Presentación (Demo Web)](#1-página-de-presentación-demo-web)
    * [2. Proyecto Java de Tests (`proyecto_java_tests/`)](#2-proyecto-java-de-tests-proyecto_java_tests)
    * [3. Base Conceptual (Especificación de Requisitos)](#3-base-conceptual-especificación-de-requisitos)
* [Autores (Documento de Especificación de Requisitos)](#autores-documento-de-especificación-de-requisitos)

## Descripción General del Proyecto "Ruta"

"Ruta" es un sistema de seguimiento y gestión de transporte público diseñado para mejorar la experiencia de viaje de los pasajeros y optimizar la operación de los conductores de autobús. Proporciona una solución integral para monitorear, planificar y comunicar información relevante sobre las rutas de autobús, incluyendo características como:

*   Consulta de cambios en la ruta en tiempo real.
*   Notificación de retrasos.
*   Temporizador y estimación de tiempo de llegada/viaje.
*   Seguimiento en tiempo real de autobuses.
*   Monitoreo de condiciones climáticas.
*   Calificación de conductores.
*   Historial de viajes.

## Estructura del Repositorio

El repositorio está organizado en las siguientes carpetas y archivos principales en su raíz:

*   `pagina_presentacion/`: Contiene el código fuente (HTML, CSS, imágenes) de la página web estática de presentación del producto Ruta. **Puedes verla desplegada aquí: [Página de Presentación de Ruta](https://estebangc222.github.io/Ruta/pagina_presentacion/)**.
*   `proyecto_java_tests/`: Alberga el proyecto Java (gestionado con Maven) que contiene los tests unitarios para la lógica de negocio del sistema Ruta.
*   `.gitignore`: Especifica los archivos y directorios que deben ser ignorados por Git.
*   `README.md`: Este archivo.

## Componentes del Proyecto

### 1. Página de Presentación (Demo Web)

Esta sección contiene una página web estática que sirve como carta de presentación para el producto "Ruta", destacando sus características y beneficios.

*   **Ver la página desplegada:** **[https://estebangc222.github.io/Ruta/pagina_presentacion/](https://estebangc222.github.io/Ruta/pagina_presentacion/)**
*   **Código Fuente:** Se encuentra en la carpeta `pagina_presentacion/`.
*   **Tecnologías:** HTML, CSS.

### 2. Proyecto Java de Tests (`proyecto_java_tests/`)

Este módulo contiene un proyecto Java gestionado con Maven, enfocado en la implementación de tests unitarios para validar la lógica de negocio y los servicios descritos en la Especificación de Requisitos del Software. Se utilizan JUnit 5 y Mockito para la creación y ejecución de estos tests.

*   **Tecnologías:**
    *   Lenguaje: Java 17
    *   Gestión de dependencias y build: Apache Maven
    *   Frameworks de Testing:
        *   JUnit 5 (para la estructura de los tests y aserciones)
        *   Mockito (para la creación de objetos mock y la simulación de dependencias)
*   **Estructura del Proyecto Java:**
    El código fuente se organiza en los siguientes paquetes principales dentro de `src/main/java/org/example/`:
    *   `GestionDeAlertas`: Clases y lógica para la gestión de alertas.
    *   `GestionDePerfiles`: Clases y lógica para la gestión de perfiles.
    *   `GestionDeRutas`: Clases y lógica para la consulta y visualización de rutas.
    *   `GestionDeViajes`: Clases y lógica para la estimación de tiempos e historial.
    *   `ServiciosExternos`: Clases y lógica para la interacción con servicios externos.
    Los tests correspondientes se encuentran en `src/test/java/`.
*   **Archivo `pom.xml`:**
    Define las dependencias del proyecto (JUnit, Mockito) y la configuración de compilación de Maven.

### 3. Base Conceptual (Especificación de Requisitos)

El desarrollo de los componentes de este repositorio, tanto la página de presentación como el proyecto de tests Java, se ha guiado íntegramente por un documento de **Especificación de Requisitos de Software (ERS)**.

*   **Puedes consultar el documento ERS aquí:** **[Ver Especificación de Requisitos de Software (PDF en Google Drive)](https://drive.google.com/file/d/1bW_g3XVCxU-s7R8yvGNEONs2HhUwXoal/view?usp=sharing)**

Este documento detalla los requisitos funcionales, no funcionales, casos de uso y la visión general del sistema Ruta.

---

## Autor Página Web y Tests

* Esteban Guevara Cardona

## Autores (Documento de Especificación de Requisitos)

El documento conceptual "Especificación de requisitos de software" que sirvió de base para este proyecto fue elaborado por:

*   Esteban Guevara Cardona
*   Juan Elias Mendoza
*   Juan Camilo Martin

---
