# 👨‍💻 Proyecto Kotlin - Gestor de Información Personal
**Autor:** Emmanuel Galeano Martínez

**Programa de Formación:** Análisis y Desarrollo de Software – SENA

**Ficha:** ADSO 3144585

---

## 📋 Descripción

Este proyecto es una **aplicación de consola escrita en Kotlin** que permite registrar, validar y analizar información personal de varios usuarios. Cumple con los siguientes objetivos:

- Variables y constantes
- Tipos de datos
- Operadores aritméticos, lógicos y relacionales
- Validaciones y manipulación de cadenas
- Organización modular del código con funciones

---

## ✅ Requisitos del Proyecto

✅ Cumplimiento de Requisitos del Proyecto
Este proyecto cumple con todos los requerimientos establecidos, demostrando un uso adecuado de variables, operadores, validaciones y manipulación de cadenas en Kotlin.

---

### 📌 1. Registro de Usuarios
✅ Registro manual de 3 usuarios.

✅ Se solicitan por consola los siguientes datos:

Nombre completo (texto)

Edad (entero)

Altura en metros (decimal)

Peso en kilogramos (decimal)

Email (texto)

Ciudad de residencia (texto)

---

### 🛡️ 2. Manejo y Validación de Datos
✅ Edad validada: debe ser mayor a 0.

✅ Altura y peso validados: deben ser mayores a 0.

✅ Email validado:

Debe contener un @

Y un . después del @

El usuario puede intentar 3 veces hasta que el email sea válido.

---

### 🧮 3. Operaciones con Datos
✅ Cálculo del IMC con la fórmula correcta:
IMC = peso / (altura * altura)

✅ Determina si el usuario es mayor de edad (edad >= 18)

---

### ✂️ 4. Manipulación de Cadenas
✅ El nombre se muestra:

En MAYÚSCULAS

En minúsculas

✅ Se extrae correctamente el dominio del email

✅ Se genera un resumen detallado por usuario usando:

String templates

Cadenas multilínea ("""...""")

---

### ⚙️ 5. Uso de Operadores
✅ Aritméticos: para cálculo del IMC.

✅ Relacionales y lógicos: usados en todas las validaciones de datos.

---

### 🖥️ 6. Interacción y Presentación
✅ Presentación clara en consola:

Títulos organizados (===, --- Usuario X ---)

Saltos de línea y separación visual

(----------------------------)

Información fácil de leer para cada usuario

---

### 🧠 7. Organización del Código

✅ Código estructurado y modular:

- `crearUsuario()` para registrar cada usuario

- `mostrarDatos()`: para mostrar resumen con cálculos

- `esEmailValido()` para validar el email

---

## 🚀 Cómo ejecutar el proyecto

1. Abre el proyecto en **IntelliJ IDEA** o cualquier editor compatible con Kotlin.
2. Asegúrate de tener instalado el SDK de Kotlin.
3. Ejecuta el archivo `main.kt` que está dentro de la carpeta `src/`.
4. Ingresa los datos de cada usuario que solicita la consola.
5. Al finalizar, vas a ver un resumen completo de la información procesada.

---

## 💻 Ejemplo de Ejecución

### 📝 Registro de usuarios
![Registro de usuarios](img.png)

---

### 📊 Información de usuarios
![Resultados](img_1.png)

---
