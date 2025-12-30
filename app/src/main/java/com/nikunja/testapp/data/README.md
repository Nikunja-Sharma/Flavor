# Data Layer

The data layer is responsible for data operations including network requests and local database access. It implements the repository interfaces defined in the domain layer.

## Structure

```
data/
├── local/           # Local persistence
│   ├── dao/         # Room DAOs
│   ├── database/    # Database configuration
│   └── entity/      # Room entities
├── remote/          # Network layer
│   ├── api/         # Retrofit interfaces
│   ├── dto/         # Data Transfer Objects
│   └── interceptor/ # OkHttp interceptors
└── repository/      # Repository implementations
```

## Components

### Local Storage

#### AppDatabase
Room database configuration with entity definitions.

#### ItemDao
Data Access Object for CRUD operations on items:
- `getAllItems()` - Flow of all items
- `getItemById(id)` - Single item lookup
- `insertItems(items)` - Batch insert with conflict resolution
- `deleteAllItems()` - Clear all items

#### ItemEntity
Room entity representing an item in the database. Includes mapping functions to/from domain models.

### Remote

#### ApiService
Retrofit interface defining API endpoints:
- `GET /items` - Fetch all items

#### ItemDto
Data Transfer Object for API responses. Includes `toDomain()` mapping function.

#### AuthInterceptor
OkHttp interceptor that:
- Adds `Content-Type` and `Accept` headers
- Attaches Bearer token when available

### Repositories

#### AuthRepositoryImpl
Firebase Authentication implementation:
- Google Sign-In with credential
- Current user retrieval
- Sign-out functionality

#### ItemRepositoryImpl
Implements offline-first strategy:
1. Emits cached data from Room
2. Fetches fresh data from API
3. Falls back to mock data if API unavailable

## Data Flow

```
API Response → DTO → Domain Model → Entity → Database
                ↓
            UI Layer
```

## Key Patterns

- **Offline-First**: Local database is the single source of truth
- **DTO Mapping**: API models never leak to domain/UI layers
- **Error Handling**: All network calls wrapped in try-catch
- **Flow-based**: Reactive data streams with Kotlin Flow
