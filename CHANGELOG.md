# synex-api-gateway-service

## 0.1.3

### Patch Changes

- [#1](https://github.com/Vestels/synex-api-gateway-service/pull/1) [`f61e086`](https://github.com/Vestels/synex-api-gateway-service/commit/f61e0867cba0e466f0836672cc57506a69bb753c) - Initial bootstrap including:
  - Set up Spring Cloud Gateway for centralized API routing
  - Configured route forwarding to backend microservices through Eureka service discovery
  - Added API routing for user-service endpoints with path rewriting
  - Integrated the gateway with the Synex microservices architecture
  - Configured Spring Boot and gateway application settings
  - Updated Maven version management for stable releases and development snapshots
  - Improved the Changesets release workflow to prevent releases without a version bump

## 0.1.1

### Patch Changes

- [`56a3292`](https://github.com/Vestels/synex-api-gateway-service/commit/56a3292a84bb97f20492e277b0871e6010d15778) - Implemented CI flow -> commitlinting / husky hooks / changelog / auto release with Maven version bump
