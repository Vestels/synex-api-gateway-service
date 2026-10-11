---
"synex-api-gateway-service": patch
---

Initial bootstrap including:
- Set up Spring Cloud Gateway for centralized API routing
- Configured route forwarding to backend microservices through Eureka service discovery
- Added API routing for user-service endpoints with path rewriting
- Integrated the gateway with the Synex microservices architecture
- Configured Spring Boot and gateway application settings
- Updated Maven version management for stable releases and development snapshots
- Improved the Changesets release workflow to prevent releases without a version bump
