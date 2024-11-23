# Proyecto Taller 4
### Hecho por: Alberto Valera e Ines Gomez

Este proyecto es una aplicación de Android desarrollada en Kotlin que permite agregar y mostrar productos. La aplicación utiliza `ViewModel` y `LiveData` para gestionar los datos y `RecyclerView` para mostrar listas de elementos.

## Clases

### `MainActivity.kt`
La clase `MainActivity` es la actividad principal de la aplicación. Configura el `Toolbar` y el `NavHostFragment` para la navegación entre fragmentos.

- **onCreate**: Configura el `Toolbar` y el `NavHostFragment` para la navegación.
- **onSupportNavigateUp**: Maneja la navegación hacia arriba.

### `Producto.kt`
La clase `Producto` es un modelo de datos que representa un producto con un número de serie, nombre, precio y cantidad.

### `ProductoViewModel.kt`
El `ProductoViewModel` es un `ViewModel` que mantiene una lista de productos.

- **addProduct**: Agrega un producto a la lista y actualiza el `LiveData`.

### `AñadirProductoFragment.kt`
El `AñadirProductoFragment` permite agregar nuevos productos.

- **onCreateView**: Infla el diseño del fragmento.
- **onViewCreated**: Configura el botón de guardar para agregar un producto.
- **onDestroyView**: Limpia el binding.

### `DetallesElementoFragment.kt`
El `DetallesElementoFragment` muestra los detalles de un elemento seleccionado.

- **onCreateView**: Infla el diseño del fragmento.
- **onViewCreated**: Muestra los detalles del elemento seleccionado.
- **onDestroyView**: Limpia el binding.

### `ElementoAdapter.kt`
El `ElementoAdapter` es un adaptador para el `RecyclerView` en `ListaElementoFragment`.

- **onCreateViewHolder**: Infla el diseño de un elemento de la lista.
- **onBindViewHolder**: Vincula los datos del elemento a las vistas.
- **getItemCount**: Devuelve el número de elementos en la lista.

### `ListaElementoFragment.kt`
El `ListaElementoFragment` muestra una lista de elementos y actualiza la hora y el saludo.

- **onCreateView**: Infla el diseño del fragmento.
- **onViewCreated**: Configura el reloj, el saludo y el botón de navegación.
- **updateClock**: Actualiza la hora cada segundo.
- **updateGreeting**: Actualiza el saludo basado en la hora del día.
- **onDestroyView**: Limpia el binding.

### `ProductoAdapter.kt`
El `ProductoAdapter` es un adaptador para el `RecyclerView` en `ResumenDatosFragment`.

- **onCreateViewHolder**: Infla el diseño de un elemento de la lista de productos.
- **onBindViewHolder**: Vincula los datos del producto a las vistas.
- **getItemCount**: Devuelve el número de productos en la lista.

### `ResumenDatosFragment.kt`
El `ResumenDatosFragment` muestra un resumen de los productos en un `RecyclerView`.

- **onCreateView**: Infla el diseño del fragmento.
- **onViewCreated**: Configura el `RecyclerView` y los botones de agregar y actualizar.
- **onDestroyView**: Limpia el binding.

## Archivos XML

### `activity_main.xml`
Define el diseño principal de la actividad, incluyendo el `Toolbar` y el `NavHostFragment`.

### `fragment_item_list.xml`
Define el diseño del `ListaElementoFragment`, incluyendo un reloj, textos para la hora y el saludo, y un botón de navegación.

### `fragment_data_summary.xml`
Define el diseño del `ResumenDatosFragment`, incluyendo un `RecyclerView` para mostrar los productos y botones para agregar y actualizar productos.

### `fragment_add_product.xml`
Define el diseño del `AñadirProductoFragment`, incluyendo campos de texto para ingresar los detalles del producto y un botón para guardar.

### `fragment_item_detail.xml`
Define el diseño del `DetallesElementoFragment`, incluyendo un texto para mostrar los detalles del elemento.

### `item_list_content.xml`
Define el diseño de un elemento en la lista de `ListaElementoFragment`.

### `item_product.xml`
Define el diseño de un elemento en la lista de productos de `ResumenDatosFragment`.

### `nav_graph.xml`
Define la navegación entre los fragmentos de la aplicación.

URL: 
