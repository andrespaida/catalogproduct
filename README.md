# Catalog Product Microservice

This microservice is responsible for synchronizing product data into the ToyShop catalog. It is built with Java using Spring Boot and stores product data in MongoDB.

## Technologies Used

- Java 17+
- Spring Boot
- MongoDB
- Docker
- GitHub Actions

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MongoDB

### Installation

```bash
git clone https://github.com/andrespaida/catalog_product.git
cd catalog_product
mvn clean install
```

### Environment Variables

Create an `.env` file or set the following environment variables:

```env
SERVER_PORT=5001
MONGO_URI=mongodb://your_mongo_host:27017
DB_NAME=toyshop_db
COLLECTION_NAME=catalog
```

Alternatively, you can configure these in `application.properties`.

### Running the Service

```bash
mvn spring-boot:run
```

The service will be running at `http://localhost:5001`.

## Available Endpoint

### POST `/catalog`

Creates or updates a product entry in the catalog.

#### Request body (JSON):

```json
{
  "id": "product_id",
  "name": "Toy Car",
  "description": "Red toy car",
  "price": 19.99,
  "stock": 50,
  "category": "Vehicles",
  "imageUrl": "http://localhost:4002/uploads/toycar.jpg"
}
```

#### Response:

```json
{
  "message": "Catalog updated successfully"
}
```

## Docker

To build and run the service using Docker:

```bash
docker build -t catalog-product .
docker run -p 5001:5001 --env-file .env catalog-product
```

## GitHub Actions Deployment

This project includes a GitHub Actions workflow for automatic deployment to an EC2 instance. Configure the following secrets in your GitHub repository:

- `EC2_HOST`
- `EC2_USERNAME`
- `EC2_KEY`
- `EC2_PORT` (optional)

## License

This project is licensed under the MIT License.