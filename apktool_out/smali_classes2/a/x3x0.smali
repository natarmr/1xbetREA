.class public final La/x3x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/cnw0;


# static fields
.field public static final e:[B


# instance fields
.field public final a:Ljava/security/PublicKey;

.field public final b:Ljava/lang/String;

.field public final c:I

.field public final d:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, La/x3x0;->e:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(Ljava/security/PublicKey;Ljava/lang/String;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/x3x0;->a:Ljava/security/PublicKey;

    .line 5
    .line 6
    iput-object p2, p0, La/x3x0;->b:Ljava/lang/String;

    .line 7
    .line 8
    iput p3, p0, La/x3x0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/x3x0;->d:[B

    .line 11
    .line 12
    return-void
.end method

.method public static a(La/q0x0;)La/x3x0;
    .locals 6

    .line 1
    invoke-static {}, La/x3x0;->b()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_5

    .line 13
    .line 14
    iget-object v1, p0, La/q0x0;->a:La/e0x0;

    .line 15
    .line 16
    iget-object v2, v1, La/e0x0;->a:La/d0x0;

    .line 17
    .line 18
    iget-object v3, v1, La/e0x0;->c:La/b0x0;

    .line 19
    .line 20
    iget-object v1, v1, La/e0x0;->b:La/c0x0;

    .line 21
    .line 22
    sget-object v4, La/d0x0;->g:La/d0x0;

    .line 23
    .line 24
    if-ne v2, v4, :cond_4

    .line 25
    .line 26
    sget-object v4, La/c0x0;->c:La/c0x0;

    .line 27
    .line 28
    if-ne v1, v4, :cond_3

    .line 29
    .line 30
    sget-object v1, La/b0x0;->c:La/b0x0;

    .line 31
    .line 32
    if-ne v3, v1, :cond_0

    .line 33
    .line 34
    const-string v1, "XWING/HKDF_SHA256/AES_128_GCM"

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    sget-object v1, La/b0x0;->d:La/b0x0;

    .line 38
    .line 39
    if-ne v3, v1, :cond_1

    .line 40
    .line 41
    const-string v1, "XWING/HKDF_SHA256/AES_256_GCM"

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    sget-object v1, La/b0x0;->e:La/b0x0;

    .line 45
    .line 46
    if-ne v3, v1, :cond_2

    .line 47
    .line 48
    const-string v1, "XWING/HKDF_SHA256/CHACHA20POLY1305"

    .line 49
    .line 50
    :goto_0
    const-string v3, "XWING"

    .line 51
    .line 52
    invoke-static {v3, v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    new-instance v3, La/z3x0;

    .line 57
    .line 58
    iget-object v4, p0, La/q0x0;->b:La/icw0;

    .line 59
    .line 60
    invoke-virtual {v4}, La/icw0;->b()[B

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    const/4 v5, 0x1

    .line 65
    invoke-direct {v3, v4, v5}, La/z3x0;-><init>([BB)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v3}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    new-instance v3, La/x3x0;

    .line 73
    .line 74
    invoke-static {v2}, La/c3x0;->a(La/d0x0;)I

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    iget-object p0, p0, La/q0x0;->c:La/icw0;

    .line 79
    .line 80
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    invoke-direct {v3, v0, v1, v2, p0}, La/x3x0;-><init>(Ljava/security/PublicKey;Ljava/lang/String;I[B)V

    .line 85
    .line 86
    .line 87
    return-object v3

    .line 88
    :cond_2
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 89
    .line 90
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const-string v1, "Unknown AEAD ID: "

    .line 95
    .line 96
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    throw p0

    .line 104
    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 105
    .line 106
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    const-string v1, "Currently unsupported KDF: "

    .line 111
    .line 112
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw p0

    .line 120
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 121
    .line 122
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v0

    .line 126
    const-string v1, "Currently unsupported KEM: "

    .line 127
    .line 128
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    throw p0

    .line 136
    :cond_5
    const-string p0, "Can\'t use X-Wing as Conscrypt is not available"

    .line 137
    .line 138
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_6
    const-string p0, "Can\'t use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing."

    .line 143
    .line 144
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    return-object v1
.end method

.method public static b()Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0}, La/esw0;->d(I)Z

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, La/x7x0;->c()Ljava/lang/Integer;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    invoke-static {}, La/x7x0;->c()Ljava/lang/Integer;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x25

    .line 24
    .line 25
    if-ge v1, v2, :cond_1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-nez v1, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    :try_start_0
    const-string v2, "XWING"

    .line 36
    .line 37
    invoke-static {v2, v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return v0

    .line 41
    :catch_0
    :cond_3
    :goto_0
    const/4 v0, 0x0

    .line 42
    return v0
.end method
