# CopetSystem.API

GraphQL API constructed using Java with SpringBoot, SpringSecurity and JWT strategy for endpoint protection.

### Perfom Queries and Mutations
To perform queries and mutations is necessary login with valid credentials.

Login query return Auth object with followed structure:

    type Auth {
        token: String!
        userId: ID!
        userName: String!
        userRole: Role
    }

Use token to perform queries and mutation passing **Authorization Header** as follows:

    {
        "Authorization": "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ0ZXN0MUBlbWFpbC5jb20iLCJyb2xlIjoiQURNSU4iLCJleHAiOjE2NjkxNjUyMjd9.IPYgLIpQoCxz9AADR4ZgmcKyZjnPOm8T878cEs2hgNF84HfPhl2EU5-a8eg6Xcaw62_50C_OtkDdB7HMSAxyWg"
    }

### Using Playground
While running GraphQL playground is accessible from http://localhost:8080/graphiql?path=/graphql