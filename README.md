# StoreBridge

A Shopify app that receives new orders through webhooks, saves them, checks stock
with the Shopify GraphQL Admin API and emails the merchant when a product runs low.

## Repository layout
| Folder | What it holds |
| --- | --- |
| `shop-connector/` | Spring Boot 4 backend (Java 21, Maven) |
| `docs/` | Flowcharts (architecture, order flow, roadmap) and UI mockups |
| `frontend/` | React + Polaris embedded app (Phase 7, coming later) |

## Tech stack
Java 21 · Spring Boot 4.1 · Maven · Shopify GraphQL Admin API · Webhooks

Planned: PostgreSQL, Flyway, Spring Mail, Docker, React + Polaris

## Run the backend locally
```bash
cd shop-connector
export SHOPIFY_CLIENT_ID=your_client_id
export SHOPIFY_CLIENT_SECRET=your_client_secret
./mvnw spring-boot:run
```
Then open http://localhost:8080/ping and http://localhost:8080/actuator/health

## How it works
See [system architecture](docs/2-system-architecture.pdf) and [order webhook flow](docs/3-order-webhook-flow.pdf).

## Roadmap
- [x] Phase 1: project setup, `/ping`, Shopify API tested
- [ ] Phase 2: ShopifyClient, `/products`, `/orders`, order webhook with HMAC verification
- [ ] Phase 3: PostgreSQL with JPA and Flyway
- [ ] Phase 4: low-stock alert emails
- [ ] Phase 5: daily 8 AM summary email
- [ ] Phase 6: Docker and deployment
- [ ] Phase 7: React + Polaris frontend
