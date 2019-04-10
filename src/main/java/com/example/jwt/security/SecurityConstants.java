package com.example.jwt.security;

public class SecurityConstants {

    public static final String SECRET = "SecretKeyToGenJWTs";
    public static final long EXPIRATION_TIME = 864_000_000; // 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/users/sign-up";
    public static final String AUTHORITIES_KEY = "scopes";

    //
    public static final long ACCESS_TOKEN_VALIDITY_SECONDS = 5 * 24 * 60 * 60;
    public static final String SIGNING_KEY = "HotelAuthSearch@100";

}