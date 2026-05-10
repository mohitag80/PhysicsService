# PhysicsService

Microservice for Physics exam questions for Grade 9-12 students. Part of the **ExamPlatform** suite.

## Tech Stack

- **Language**: Java 11
- **Framework**: Spring Boot 2.6.3
- **Database**: H2 (in-memory)
- **Build Tool**: Maven
- **Container**: Docker

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/physics/health` | Health check |
| GET | `/api/physics/questions/grade/{grade}/top/{n}` | Top N questions for a grade |
| GET | `/api/physics/questions/topic/{topic}/count/{n}` | N questions by topic |
| GET | `/api/physics/questions/complexity/{complexity}/count/{n}` | N questions by complexity |
| GET | `/api/physics/questions/grade/{grade}/topic/{topic}/count/{n}` | N questions by grade + topic |
| GET | `/api/physics/topics` | List all available topics |

## Supported Topics

- Mechanics
- Electricity
- Optics
- Thermodynamics
- Waves
- Gravitation
- Electromagnetism
- Modern Physics
- Nuclear Physics
- Electronics

## Complexity Levels

- `easy` — 1 mark questions
- `medium` — 2 mark questions
- `hard` — 3 mark questions

## Running Locally

```bash
mvn clean spring-boot:run
```

Service starts on port **8081**.

### Example Requests

```bash
# Top 5 questions for Grade 10
curl http://localhost:8081/api/physics/questions/grade/10/top/5

# 3 Electricity questions
curl http://localhost:8081/api/physics/questions/topic/Electricity/count/3

# 4 hard questions
curl http://localhost:8081/api/physics/questions/complexity/hard/count/4
```

## Docker

```bash
docker build -t physics-service:1.0.0 .
docker run -p 8081:8081 physics-service:1.0.0
```

## Swagger UI

Available at: `http://localhost:8081/swagger-ui.html`
