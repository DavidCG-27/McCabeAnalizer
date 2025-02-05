# CyclomaticComplexityAnalizer

## 📌 Descripción
CyclomaticComplexityAnalizer es una aplicación en **Java** que calcula la **complejidad ciclomatica** de un archivo de código fuente en Java utilizando el **patrón MVC**.

La **complejidad ciclomatica** se mide utilizando la fórmula de McCabe:

\[ M = E - N + 2 \]

Donde:
- **E (edges):** Cantidad de estructuras de control (`if`, `for`, `while`, `case`, `catch`, `&&`, `||`).
- **N (nodes):** Cantidad de líneas de código ejecutables.

## 📁 Estructura del Proyecto
```
CyclomaticComplexityAnalizer/
│── src/
│   ├── model/
│   │   ├── CCModel.java
│   ├── view/
│   │   ├── CCView.java
│   ├── controller/
│   │   ├── CCController.java
│   ├── main/
│   │   ├── Main.java
│── test/
│   ├── model/
│   │   ├── CCTest.java
│── README.md
```

## 🚀 Instalación y Uso
### **1. Clonar el repositorio**
```sh
git clone https://github.com/DavidCG-27/CyclomaticComplexityAnalizer.git
cd CyclomaticComplexityAnalizer
```

### **2. Compilar el código**
```sh
javac -d out -sourcepath src src/main/Main.java
```

### **3. Ejecutar el programa**
```sh
java -cp out main.Main MiArchivo.java
```
Donde `MiArchivo.java` es el código fuente de Java que deseas analizar.

## 📌 Ejemplo de salida
```
Uso: java Main <ruta_archivo.java>
La complejidad ciclomatica del código es: 5
```

## 🛠️ Tecnologías usadas
- **Java 11+**
- **Patrón MVC**

## ✨ Contribución
1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature-nueva`).
3. Realiza tus cambios y haz un commit (`git commit -m 'Añadir nueva característica'`).
4. Haz un push a la rama (`git push origin feature-nueva`).
5. Abre un Pull Request.

## 📜 Licencia
Este proyecto está bajo la licencia MIT.

