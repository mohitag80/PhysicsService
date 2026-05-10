# ExamPlatform — Reference Document

Online examination platform for Grade 9–12 students across Physics, Chemistry, Maths, and English.
Multi-repo, heterogeneous microservices architecture designed for security CVE scanning exercises.

---

## Quick Reference

| Service | Language / Framework | Port | GitHub Repo | Container Image |
|---------|----------------------|------|-------------|-----------------|
| PhysicsService | Java 11 / Spring Boot 2.6.3 | 8081 | [mohitag80/PhysicsService](https://github.com/mohitag80/PhysicsService) | `ghcr.io/mohitag80/physics-service` |
| MathsService | Python 3.8 / Flask 1.1.2 | 8082 | [mohitag80/MathsService](https://github.com/mohitag80/MathsService) | `ghcr.io/mohitag80/maths-service` |
| ChemService | Go 1.19 / Gin v1.7.0 | 8083 | [mohitag80/ChemService](https://github.com/mohitag80/ChemService) | `ghcr.io/mohitag80/chem-service` |
| EnglishService | Python 3.9 / Django 3.2.12 | 8084 | [mohitag80/EnglishService](https://github.com/mohitag80/EnglishService) | `ghcr.io/mohitag80/english-service` |

---

## GitHub Repositories

### 1. PhysicsService
- **URL**: https://github.com/mohitag80/PhysicsService
- **Language**: Java 11
- **Framework**: Spring Boot 2.6.3
- **Build Tool**: Maven 3.8.6
- **Branch**: `main`
- **Last Pushed**: 2026-05-10
- **Local Path**: `/Users/mohitagrawal/MyGithubProjects/PhysicsService`
- **Key Files**:
  - `pom.xml` — Maven dependencies (Log4j, Spring Boot, Jackson, H2, Commons Text)
  - `src/main/java/com/exam/physics/controller/QuestionController.java`
  - `src/main/java/com/exam/physics/service/QuestionService.java`
  - `src/main/java/com/exam/physics/model/Question.java`
  - `src/main/resources/application.properties`
  - `Dockerfile`

### 2. MathsService
- **URL**: https://github.com/mohitag80/MathsService
- **Language**: Python 3.8
- **Framework**: Flask 1.1.2
- **Build Tool**: pip
- **Branch**: `main`
- **Last Pushed**: 2026-05-10
- **Local Path**: `/Users/mohitagrawal/MyGithubProjects/MathsService`
- **Key Files**:
  - `requirements.txt` — pip dependencies (Flask, Jinja2, Pillow, PyYAML, PyJWT, urllib3)
  - `app.py` — Flask app entry point
  - `routes/questions.py` — API endpoints
  - `data/questions.py` — Question bank (30 questions)
  - `models/question.py` — Question dataclass
  - `Dockerfile`

### 3. ChemService
- **URL**: https://github.com/mohitag80/ChemService
- **Language**: Go 1.19
- **Framework**: Gin v1.7.0
- **Build Tool**: Go modules
- **Branch**: `main`
- **Last Pushed**: 2026-05-10
- **Local Path**: `/Users/mohitagrawal/MyGithubProjects/ChemService`
- **Key Files**:
  - `go.mod` — Go module dependencies (gin, logrus, golang.org/x/net, jwt-go)
  - `main.go` — Gin server entry point
  - `handlers/question.go` — HTTP handlers
  - `data/questions.go` — Question bank (30 questions)
  - `models/question.go` — Question structs
  - `Dockerfile`

### 4. EnglishService
- **URL**: https://github.com/mohitag80/EnglishService
- **Language**: Python 3.9
- **Framework**: Django 3.2.12 + Django REST Framework
- **Build Tool**: pip
- **Branch**: `main`
- **Last Pushed**: 2026-05-10
- **Local Path**: `/Users/mohitagrawal/MyGithubProjects/EnglishService`
- **Key Files**:
  - `requirements.txt` — pip dependencies (Django, Pillow, PyJWT, sqlparse, lxml, paramiko)
  - `manage.py` — Django management script
  - `english_service/settings.py` — Django settings
  - `english_service/urls.py` — URL routing
  - `questions/views.py` — API views
  - `questions/data.py` — Question bank (25 questions)
  - `Dockerfile`

---

## Container Images (ghcr.io)

Registry: **GitHub Container Registry** (`ghcr.io`)
Owner: `mohitag80`

### physics-service
| Tag | Digest (sha256) | Size |
|-----|-----------------|------|
| `1.0.0` | `bba3ef5f7cabc3db9e529495237c79da5212895127ed35b3e14bcbf291580740` | 455 MB |
| `latest` | `bdd5d67790dae8bd416716eabd6800c2e5949114bd2c2b2ceb031179ad049972` | 455 MB |

```
docker pull ghcr.io/mohitag80/physics-service:1.0.0
docker pull ghcr.io/mohitag80/physics-service:latest
```

### maths-service
| Tag | Digest (sha256) | Size |
|-----|-----------------|------|
| `1.0.0` | `ed0e2aac208092ff15b89d68d17007c0c49922aa5aad13482e078a60657f82de` | 1.53 GB |
| `latest` | `2387a779d70ff2e18bde98aa0d80e5fd95287363e9939ef7c1f98a766902af43` | 1.53 GB |

```
docker pull ghcr.io/mohitag80/maths-service:1.0.0
docker pull ghcr.io/mohitag80/maths-service:latest
```

### chem-service
| Tag | Digest (sha256) | Size |
|-----|-----------------|------|
| `1.0.0` | `a2d8538369a926d33f7217fdd513382176fd7f16c87035f5d4f2fdae3bf4a375` | 140 MB |
| `latest` | `40570e3009197b40aa3350fb42c08257957fa371b2f97b2b6215899eb56f30dc` | 140 MB |

```
docker pull ghcr.io/mohitag80/chem-service:1.0.0
docker pull ghcr.io/mohitag80/chem-service:latest
```

### english-service
| Tag | Digest (sha256) | Size |
|-----|-----------------|------|
| `1.0.0` | `f77602c8b46b0eac6aa7c3e83440ae908824be4050a638bead6e0f458955085b` | 1.5 GB |
| `latest` | `f77602c8b46b0eac6aa7c3e83440ae908824be4050a638bead6e0f458955085b` | 1.5 GB |

```
docker pull ghcr.io/mohitag80/english-service:1.0.0
docker pull ghcr.io/mohitag80/english-service:latest
```

---

## API Endpoints (all services follow the same pattern)

| Method | Endpoint Pattern | Description |
|--------|-----------------|-------------|
| `GET` | `/api/{subject}/questions/grade/{grade}/top/{n}` | Top N questions for a grade (9–12) |
| `GET` | `/api/{subject}/questions/topic/{topic}/count/{n}` | N questions for a selected topic |
| `GET` | `/api/{subject}/questions/complexity/{complexity}/count/{n}` | N questions by complexity (`easy`/`medium`/`hard`) |
| `GET` | `/api/{subject}/questions/grade/{grade}/topic/{topic}/count/{n}` | N questions filtered by grade + topic |
| `GET` | `/api/{subject}/topics` | List all available topics |
| `GET` | `/health` or `/api/{subject}/health` | Health check |

**Subject path prefixes**: `physics` · `maths` · `chem` · `english`

### Example curl commands

```bash
# PhysicsService — top 5 Grade 11 questions
curl http://localhost:8081/api/physics/questions/grade/11/top/5

# MathsService — 4 Calculus questions
curl http://localhost:8082/api/maths/questions/topic/Calculus/count/4

# ChemService — 3 hard questions
curl http://localhost:8083/api/chem/questions/complexity/hard/count/3

# EnglishService — Grade 12 Grammar questions
curl http://localhost:8084/api/english/questions/grade/12/topic/Grammar/count/5/
```

### Run all services locally via Docker

```bash
docker run -d -p 8081:8081 --name physics  ghcr.io/mohitag80/physics-service:1.0.0
docker run -d -p 8082:8082 --name maths    ghcr.io/mohitag80/maths-service:1.0.0
docker run -d -p 8083:8083 --name chem     ghcr.io/mohitag80/chem-service:1.0.0
docker run -d -p 8084:8084 --name english  ghcr.io/mohitag80/english-service:1.0.0
```

---

## Intentional CVEs (for Security Scanning)

### PhysicsService (Java)
| Package | Version | CVE(s) | Severity |
|---------|---------|--------|----------|
| `log4j-core` | 2.14.1 | CVE-2021-44228 (Log4Shell), CVE-2021-45046 | Critical |
| `commons-text` | 1.9 | CVE-2022-42889 (Text4Shell) | Critical |
| `h2` | 1.4.200 | CVE-2022-45868, CVE-2018-10054 | High |
| `jackson-databind` | 2.12.1 | CVE-2020-36518, CVE-2021-46877 | High |
| `spring-security-core` | 5.5.2 | CVE-2022-22978, CVE-2022-22976 | High |
| `commons-collections` | 3.2.1 | CVE-2015-6420 | High |
| `snakeyaml` | 1.29 | CVE-2022-25857, CVE-2022-38749 | High |
| `tomcat-embed-core` | 9.0.56 | CVE-2022-25762 | Medium |

### MathsService (Python)
| Package | Version | CVE(s) | Severity |
|---------|---------|--------|----------|
| `Flask` | 1.1.2 | CVE-2023-30861 | High |
| `Jinja2` | 2.11.3 | CVE-2020-28493 | Medium |
| `Werkzeug` | 1.0.1 | CVE-2023-25577, CVE-2023-46136 | High |
| `Pillow` | 8.2.0 | CVE-2021-23437, CVE-2021-28677 | High |
| `PyYAML` | 5.3.1 | CVE-2020-14343 | Critical |
| `cryptography` | 3.3.2 | CVE-2023-23931, CVE-2023-49083 | High |
| `PyJWT` | 1.7.1 | CVE-2022-29217 | High |
| `urllib3` | 1.26.4 | CVE-2021-33503, CVE-2023-45803 | High |
| `lxml` | 4.6.2 | CVE-2021-43818 | High |

### ChemService (Go)
| Package | Version | CVE(s) | Severity |
|---------|---------|--------|----------|
| `golang.org/x/net` | 0.0.0-20210405 | CVE-2021-33194, CVE-2022-27664 | High |
| `golang.org/x/crypto` | 0.0.0-20210322 | CVE-2021-43565, CVE-2022-27191 | High |
| `github.com/dgrijalva/jwt-go` | v3.2.0 | CVE-2020-26160 | High |
| `golang.org/x/text` | v0.3.5 | CVE-2021-38561 | High |

### EnglishService (Python)
| Package | Version | CVE(s) | Severity |
|---------|---------|--------|----------|
| `Django` | 3.2.12 | CVE-2022-28347, CVE-2022-28346, CVE-2023-31047 | High |
| `Pillow` | 9.0.0 | CVE-2022-22817, CVE-2022-24303 | High |
| `PyJWT` | 1.7.1 | CVE-2022-29217 | High |
| `sqlparse` | 0.4.1 | CVE-2023-30608 | Medium |
| `Jinja2` | 2.11.3 | CVE-2020-28493 | Medium |
| `lxml` | 4.7.1 | CVE-2021-43818 | High |
| `paramiko` | 2.9.2 | CVE-2022-24302 | Medium |
| `requests` | 2.27.1 | CVE-2023-32681 | Medium |
| `MarkupSafe` | 1.1.1 | CVE-2021-23727 | Medium |

---

## Base Images Used

| Service | Build Image | Runtime Image |
|---------|-------------|---------------|
| PhysicsService | `maven:3.8.6-openjdk-11` | `eclipse-temurin:11-jre-jammy` (Ubuntu 22.04) |
| MathsService | — | `python:3.8-bullseye` (Debian 11) |
| ChemService | `golang:1.19-bullseye` (Debian 11) | `debian:bullseye-slim` |
| EnglishService | — | `python:3.9-bullseye` (Debian 11) |

---

## Scanning Commands

### Trivy (image scan)
```bash
trivy image ghcr.io/mohitag80/physics-service:1.0.0
trivy image ghcr.io/mohitag80/maths-service:1.0.0
trivy image ghcr.io/mohitag80/chem-service:1.0.0
trivy image ghcr.io/mohitag80/english-service:1.0.0
```

### Grype (image scan)
```bash
grype ghcr.io/mohitag80/physics-service:1.0.0
grype ghcr.io/mohitag80/maths-service:1.0.0
grype ghcr.io/mohitag80/chem-service:1.0.0
grype ghcr.io/mohitag80/english-service:1.0.0
```

### Snyk (repo scan)
```bash
cd PhysicsService  && snyk test --file=pom.xml
cd MathsService    && snyk test --file=requirements.txt
cd ChemService     && snyk test --file=go.mod
cd EnglishService  && snyk test --file=requirements.txt
```

### Snyk (container scan)
```bash
snyk container test ghcr.io/mohitag80/physics-service:1.0.0 --file=PhysicsService/Dockerfile
snyk container test ghcr.io/mohitag80/maths-service:1.0.0   --file=MathsService/Dockerfile
snyk container test ghcr.io/mohitag80/chem-service:1.0.0    --file=ChemService/Dockerfile
snyk container test ghcr.io/mohitag80/english-service:1.0.0 --file=EnglishService/Dockerfile
```

---

*Generated: 2026-05-10 | Owner: mohitag80*
