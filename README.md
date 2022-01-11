# BackEndBsale
Construcción de una Api Rest como parte de un ejercicio para el proceso de postulación para BSale.

## Tecnologias utilizadas

- **Spring boot**: Framework de Java.
- **MySQL**: Sistema de gestión de base de datos.
- **JPA**: framework que forma parte de Java, y ofrece un conjunto de interfaces y APIs para resolver el problema del almacenamiento de los objetos en una base de datos relacional.

## Explicación del API Rest

La API Rest tiene los siguientes end points:


**``/category/v1/list``**

**Descripción**:lista todas las categorias.

**Parametros**:no cuenta con parametros.

```json
[
    {
        "id": 1,
        "name": "bebida energetica"
    },
    {
        "id": 2,
        "name": "pisco"
    },
    {
        "id": 3,
        "name": "ron"
    },
    {
        "id": 4,
        "name": "bebida"
    },
    {
        "id": 5,
        "name": "snack"
    },
    {
        "id": 6,
        "name": "cerveza"
    },
    {
        "id": 7,
        "name": "vodka"
    }
]
```


**``/product/v1/listAll``**

**Descripción**: lista todos los productos paginados.

**Parametros**:
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 10.

```json
{
    "content": [
        {
            "id": 104,
            "name": "ABSOLUT",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/absolut21381.png",
            "price": 8990.0,
            "discount": 30,
            "category": {
                "id": 7,
                "name": "vodka"
            }
        },
        {
            "id": 68,
            "name": "Bebida Sprite 1 Lt",
            "urlImage": null,
            "price": 1250.0,
            "discount": 10,
            "category": {
                "id": 4,
                "name": "bebida"
            }
        },
        {
            "id": 98,
            "name": "Cerveza Escudo Normal LATA 350CC",
            "urlImage": "",
            "price": 600.0,
            "discount": 0,
            "category": {
                "id": 6,
                "name": "cerveza"
            }
        },
        {
            "id": 99,
            "name": "Cerveza Escudo Sin Filtrar LATA 350CC",
            "urlImage": "",
            "price": 800.0,
            "discount": 0,
            "category": {
                "id": 6,
                "name": "cerveza"
            }
        },
        {
            "id": 58,
            "name": "COCA COLA LIGHT DESECHABLE",
            "urlImage": null,
            "price": 1500.0,
            "discount": 0,
            "category": {
                "id": 4,
                "name": "bebida"
            }
        },
        {
            "id": 57,
            "name": "COCA COLA NORMAL DESECHABLE 1500cc",
            "urlImage": null,
            "price": 1500.0,
            "discount": 0,
            "category": {
                "id": 4,
                "name": "bebida"
            }
        },
        {
            "id": 37,
            "name": "COCA COLA ZERO DESECHABLE",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/cocazero9766.jpg",
            "price": 1490.0,
            "discount": 0,
            "category": {
                "id": 4,
                "name": "bebida"
            }
        },
        {
            "id": 35,
            "name": "ENERGETICA MAKKA DRINKS",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/makka-drinks-250ml0455.jpg",
            "price": 1190.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 34,
            "name": "ENERGETICA MONSTER RIPPER",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/mosterriper0436.jpg",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 77,
            "name": "ENERGETICA MONSTER RIPPER",
            "urlImage": "",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "pageNumber": 0,
        "pageSize": 10,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 6,
    "totalElements": 57,
    "last": false,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "numberOfElements": 10,
    "first": true,
    "size": 10,
    "number": 0,
    "empty": false
}
```


**``/product/v1/listByName``**

**Descripción**: lista todos los productos filtrador por nombre paginados.

**Parametros**:
* `'name=String'`: Texto que es nombre del producto.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 10.


```json
{
    "content": [
        {
            "id": 8,
            "name": "PISCO ALTO DEL CARMEN 35º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/alto8532.jpg",
            "price": 7990.0,
            "discount": 10,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 9,
            "name": "PISCO ALTO DEL CARMEN 40º ",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/alto408581.jpg",
            "price": 5990.0,
            "discount": 0,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 10,
            "name": "PISCO ARTESANOS 35º ",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/artesanos8818.jpg",
            "price": 3990.0,
            "discount": 0,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 11,
            "name": "PISCO BAUZA 40º ",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/bauza408831.jpg",
            "price": 4990.0,
            "discount": 0,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 12,
            "name": "PISCO CAMPANARIO 35º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/campanario8845.jpg",
            "price": 2990.0,
            "discount": 20,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 13,
            "name": "PISCO CAMPANARIO 40º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/campanario408881.jpg",
            "price": 3990.0,
            "discount": 20,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 14,
            "name": "PISCO ESPIRITU DEL ELQUI 40º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/espiritu8936.jpg",
            "price": 5990.0,
            "discount": 20,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 15,
            "name": "PISCO ESPIRITU DEL ELQUI 45º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/espiritu8957.jpg",
            "price": 6990.0,
            "discount": 5,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 16,
            "name": "PISCO HORCON QUEMADO 35º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/horcon359049.jpg",
            "price": 6990.0,
            "discount": 20,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        },
        {
            "id": 17,
            "name": "PISCO HORCON QUEMADO 40º",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/horcon409062.jpg",
            "price": 7990.0,
            "discount": 20,
            "category": {
                "id": 2,
                "name": "pisco"
            }
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "pageNumber": 0,
        "pageSize": 10,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 3,
    "totalElements": 21,
    "last": false,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "numberOfElements": 10,
    "first": true,
    "size": 10,
    "number": 0,
    "empty": false
}
```

**``/product/listByCategory``**: 

**Descripción**: lista todos los productos de una categoria paginados.

**Parametros**:
* `'idcategory=int'`: Id de la categoria de los productos a listar.
* `'page=int'`: El número de página a devolver, si no se indica el valor por defecto es 0.
* `'size=int'`: Cantidad de productos a mostrar por página, si no se indica el valor por defecto es 16.

```json
{
    "content": [
        {
            "id": 35,
            "name": "ENERGETICA MAKKA DRINKS",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/makka-drinks-250ml0455.jpg",
            "price": 1190.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 34,
            "name": "ENERGETICA MONSTER RIPPER",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/mosterriper0436.jpg",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 77,
            "name": "ENERGETICA MONSTER RIPPER",
            "urlImage": "",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 36,
            "name": "ENERGETICA MONSTER VERDE",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/monsterverde0476.jpg",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 79,
            "name": "ENERGETICA MONSTER VERDE",
            "urlImage": "",
            "price": 1990.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 5,
            "name": "ENERGETICA MR BIG",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/misterbig3308256.jpg",
            "price": 1490.0,
            "discount": 20,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 6,
            "name": "ENERGETICA RED BULL",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/redbull8381.jpg",
            "price": 1490.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        },
        {
            "id": 7,
            "name": "ENERGETICA SCORE",
            "urlImage": "https://dojiw2m9tvv09.cloudfront.net/11132/product/logo7698.png",
            "price": 1290.0,
            "discount": 0,
            "category": {
                "id": 1,
                "name": "bebida energetica"
            }
        }
    ],
    "pageable": {
        "sort": {
            "sorted": true,
            "unsorted": false,
            "empty": false
        },
        "pageNumber": 0,
        "pageSize": 10,
        "offset": 0,
        "paged": true,
        "unpaged": false
    },
    "totalPages": 1,
    "totalElements": 8,
    "last": true,
    "sort": {
        "sorted": true,
        "unsorted": false,
        "empty": false
    },
    "numberOfElements": 8,
    "first": true,
    "size": 10,
    "number": 0,
    "empty": false
}
```
