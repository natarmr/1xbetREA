.class public final La/aix0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cnw0;


# static fields
.field public static final a:La/okt0;

.field public static final b:La/okt0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, La/fix0;->a:La/fix0;

    .line 6
    .line 7
    sget-object v2, La/vzw0;->b:La/vzw0;

    .line 8
    .line 9
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v1, La/fix0;->b:La/fix0;

    .line 13
    .line 14
    sget-object v2, La/vzw0;->c:La/vzw0;

    .line 15
    .line 16
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/fix0;->c:La/fix0;

    .line 20
    .line 21
    sget-object v2, La/vzw0;->d:La/vzw0;

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, La/aix0;->a:La/okt0;

    .line 31
    .line 32
    invoke-static {}, La/okt0;->l()La/fck0;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    sget-object v1, La/eix0;->a:La/eix0;

    .line 37
    .line 38
    sget-object v2, La/wzw0;->c:La/wzw0;

    .line 39
    .line 40
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    sget-object v1, La/eix0;->b:La/eix0;

    .line 44
    .line 45
    sget-object v2, La/wzw0;->b:La/wzw0;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object v1, La/eix0;->c:La/eix0;

    .line 51
    .line 52
    sget-object v2, La/wzw0;->d:La/wzw0;

    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, La/fck0;->A(Ljava/lang/Enum;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, La/fck0;->p()La/okt0;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sput-object v0, La/aix0;->b:La/okt0;

    .line 62
    .line 63
    return-void
.end method

.method public static a(La/f0x0;)La/aix0;
    .locals 6

    .line 1
    iget-object v0, p0, La/f0x0;->a:La/xzw0;

    .line 2
    .line 3
    iget-object v1, v0, La/xzw0;->a:La/vzw0;

    .line 4
    .line 5
    sget-object v2, La/aix0;->a:La/okt0;

    .line 6
    .line 7
    invoke-virtual {v2, v1}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    check-cast v1, La/fix0;

    .line 12
    .line 13
    iget-object v2, p0, La/f0x0;->b:Ljava/security/spec/ECPoint;

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v3}, Ljava/math/BigInteger;->toByteArray()[B

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    invoke-virtual {v2}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    invoke-virtual {v2}, Ljava/math/BigInteger;->toByteArray()[B

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-static {v1}, La/ghm0;->z(La/fix0;)Ljava/security/spec/ECParameterSpec;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    new-instance v4, Ljava/math/BigInteger;

    .line 36
    .line 37
    const/4 v5, 0x1

    .line 38
    invoke-direct {v4, v5, v3}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 39
    .line 40
    .line 41
    new-instance v3, Ljava/math/BigInteger;

    .line 42
    .line 43
    invoke-direct {v3, v5, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 44
    .line 45
    .line 46
    new-instance v2, Ljava/security/spec/ECPoint;

    .line 47
    .line 48
    invoke-direct {v2, v4, v3}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v2, v3}, La/m4x0;->g(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 56
    .line 57
    .line 58
    new-instance v3, Ljava/security/spec/ECPublicKeySpec;

    .line 59
    .line 60
    invoke-direct {v3, v2, v1}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 61
    .line 62
    .line 63
    sget-object v1, La/gix0;->f:La/gix0;

    .line 64
    .line 65
    const-string v2, "EC"

    .line 66
    .line 67
    iget-object v1, v1, La/gix0;->a:La/jix0;

    .line 68
    .line 69
    invoke-interface {v1, v2}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    check-cast v1, Ljava/security/KeyFactory;

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    .line 80
    .line 81
    iget-object v2, v0, La/xzw0;->f:La/icw0;

    .line 82
    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    invoke-virtual {v2}, La/icw0;->b()[B

    .line 86
    .line 87
    .line 88
    :cond_0
    new-instance v2, La/aix0;

    .line 89
    .line 90
    iget-object v3, v0, La/xzw0;->b:La/uzw0;

    .line 91
    .line 92
    invoke-static {v3}, La/aix0;->b(La/uzw0;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    sget-object v3, La/aix0;->b:La/okt0;

    .line 96
    .line 97
    iget-object v4, v0, La/xzw0;->c:La/wzw0;

    .line 98
    .line 99
    invoke-virtual {v3, v4}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, La/eix0;

    .line 104
    .line 105
    invoke-static {v0}, La/i4w0;->X(La/xzw0;)La/s1x0;

    .line 106
    .line 107
    .line 108
    iget-object p0, p0, La/f0x0;->d:La/icw0;

    .line 109
    .line 110
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 111
    .line 112
    .line 113
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-interface {v1}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-static {p0, v0}, La/m4x0;->g(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 129
    .line 130
    .line 131
    return-object v2
.end method

.method public static final b(La/uzw0;)Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, La/uzw0;->b:La/uzw0;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string p0, "HmacSha1"

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, La/uzw0;->c:La/uzw0;

    .line 13
    .line 14
    if-eq p0, v0, :cond_4

    .line 15
    .line 16
    sget-object v0, La/uzw0;->d:La/uzw0;

    .line 17
    .line 18
    if-eq p0, v0, :cond_3

    .line 19
    .line 20
    sget-object v0, La/uzw0;->e:La/uzw0;

    .line 21
    .line 22
    if-eq p0, v0, :cond_2

    .line 23
    .line 24
    sget-object v0, La/uzw0;->f:La/uzw0;

    .line 25
    .line 26
    if-ne p0, v0, :cond_1

    .line 27
    .line 28
    const-string p0, "HmacSha512"

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    .line 32
    .line 33
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string v1, "hash unsupported for EciesAeadHkdf: "

    .line 38
    .line 39
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {v0, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0

    .line 47
    :cond_2
    const-string p0, "HmacSha384"

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_3
    const-string p0, "HmacSha256"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_4
    const-string p0, "HmacSha224"

    .line 54
    .line 55
    return-object p0
.end method
