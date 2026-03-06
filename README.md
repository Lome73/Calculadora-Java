# Calculadora Java 🧮

Calculadora de escritorio desarrollada en Java con NetBeans y Swing. 
Cuenta con una interfaz moderna y oscura, sin bordes de ventana, 
y soporte tanto para mouse como para teclado físico.

## Funcionalidades

### Operaciones básicas
- **Suma (+)** - Suma dos números
- **Resta (-)** - Resta dos números
- **Multiplicación (x)** - Multiplica dos números
- **División (/)** - Divide dos números, muestra Error si se divide entre 0

### Operaciones avanzadas
- **Potencia (^)** - Eleva un número a la potencia indicada (ej: 2^10 = 1024)
- **Porcentaje (%)** - Calcula porcentajes en contexto:
  - Con + y -: calcula el porcentaje del primer número (200 + 10% = 220)
  - Con * y /: convierte el número a decimal (100 * 20% = 20)

### Botones de control
- **C** - Limpia toda la operación y reinicia la calculadora
- **Atras** - Borra el último dígito ingresado
- **Punto (.)** - Agrega decimal, no permite doble punto

### Interfaz
- Ventana sin bordes con botones personalizados de cerrar y minimizar
- Historial de operación visible en la parte superior
- Resultados con máximo 2 decimales
- Efecto hover en todos los botones al pasar el cursor
- Botón de cerrar se pone rojo al pasar el cursor
- Ventana movible arrastrando desde cualquier parte

### Teclado físico
| Tecla | Acción |
|-------|--------|
| 0-9 | Ingresar números |
| + - * / | Operadores |
| Enter | Igual (=) |
| Backspace | Borrar último dígito |
| Escape | Limpiar todo (C) |
| . o , | Punto decimal |
| % | Porcentaje |

## Tecnologías
- Java SE
- Java Swing (JFrame, JButton, JTextField)
- NetBeans IDE

## Requisitos
- JDK 8 o superior
- NetBeans IDE

## Cómo ejecutar
1. Clona el repositorio
2. Abre NetBeans
3. File > Open Project y selecciona la carpeta
4. Presiona Run (F6)
