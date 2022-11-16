//package api.infrastrucure.security;
//
//public class JwtGenerator {
//    public String generate(JwtUser jwtUser) {
//
//
//        Claims claims = Jwts.claims()
//                .setSubject(jwtUser.getUserName());
//        claims.put("password", String.valueOf(jwtUser.getPassword()));
//        claims.put("role", jwtUser.getRole());
//
//
//        return Jwts.builder()
//                .setClaims(claims)
//                .signWith(SignatureAlgorithm.HS512, "Graphql")
//                .compact();
//    }
//}
