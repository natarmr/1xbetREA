.class public final La/bww0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tmw0;


# static fields
.field public static final c:[B

.field public static final d:[B

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B


# instance fields
.field public final a:Ljavax/crypto/spec/SecretKeySpec;

.field public final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "7a806c"

    .line 2
    .line 3
    invoke-static {v0}, La/zcm0;->t(Ljava/lang/String;)[B

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, La/bww0;->c:[B

    .line 8
    .line 9
    const-string v0, "46bb91c3c5"

    .line 10
    .line 11
    invoke-static {v0}, La/zcm0;->t(Ljava/lang/String;)[B

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/bww0;->d:[B

    .line 16
    .line 17
    const-string v0, "36864200e0eaf5284d884a0e77d31646"

    .line 18
    .line 19
    invoke-static {v0}, La/zcm0;->t(Ljava/lang/String;)[B

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/bww0;->e:[B

    .line 24
    .line 25
    const-string v0, "bae8e37fc83441b16034566b"

    .line 26
    .line 27
    invoke-static {v0}, La/zcm0;->t(Ljava/lang/String;)[B

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    sput-object v0, La/bww0;->f:[B

    .line 32
    .line 33
    const-string v0, "af60eb711bd85bc1e4d3e0a462e074eea428a8"

    .line 34
    .line 35
    invoke-static {v0}, La/zcm0;->t(Ljava/lang/String;)[B

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, La/bww0;->g:[B

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>([B[BLa/vow0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/bww0;->b:[B

    .line 5
    .line 6
    array-length p2, p1

    .line 7
    invoke-static {p2}, La/cem0;->x(I)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Ljavax/crypto/spec/SecretKeySpec;

    .line 11
    .line 12
    const-string p3, "AES"

    .line 13
    .line 14
    invoke-direct {p2, p1, p3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/bww0;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 18
    .line 19
    return-void
.end method

.method public static a(Ljavax/crypto/Cipher;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    sget-object v1, La/bww0;->f:[B

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    new-instance v3, Ljavax/crypto/spec/GCMParameterSpec;

    .line 6
    .line 7
    const/16 v4, 0x80

    .line 8
    .line 9
    invoke-direct {v3, v4, v1, v0, v2}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljavax/crypto/spec/SecretKeySpec;

    .line 13
    .line 14
    sget-object v2, La/bww0;->e:[B

    .line 15
    .line 16
    const-string v4, "AES"

    .line 17
    .line 18
    invoke-direct {v1, v2, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 19
    .line 20
    .line 21
    const/4 v2, 0x2

    .line 22
    invoke-virtual {p0, v2, v1, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 23
    .line 24
    .line 25
    sget-object v1, La/bww0;->d:[B

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 28
    .line 29
    .line 30
    sget-object v1, La/bww0;->g:[B

    .line 31
    .line 32
    array-length v2, v1

    .line 33
    invoke-virtual {p0, v1, v0, v2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    sget-object v1, La/bww0;->c:[B

    .line 38
    .line 39
    invoke-static {p0, v1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 40
    .line 41
    .line 42
    move-result p0
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    return p0

    .line 44
    :catch_0
    return v0
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 6

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, La/bww0;->b:[B

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    add-int/lit8 v2, v2, 0x1c

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-lt v0, v2, :cond_2

    .line 9
    .line 10
    invoke-static {v1, p1}, La/x7x0;->b([B[B)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-static {}, La/vow0;->b()Ljavax/crypto/Cipher;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    array-length v2, v1

    .line 21
    new-instance v3, Ljavax/crypto/spec/GCMParameterSpec;

    .line 22
    .line 23
    const/16 v4, 0x80

    .line 24
    .line 25
    const/16 v5, 0xc

    .line 26
    .line 27
    invoke-direct {v3, v4, p1, v2, v5}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 28
    .line 29
    .line 30
    const/4 v2, 0x2

    .line 31
    iget-object p0, p0, La/bww0;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 32
    .line 33
    invoke-virtual {v0, v2, p0, v3}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 34
    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    array-length p0, p2

    .line 39
    if-eqz p0, :cond_0

    .line 40
    .line 41
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 42
    .line 43
    .line 44
    :cond_0
    array-length p0, v1

    .line 45
    add-int/2addr p0, v5

    .line 46
    array-length p2, p1

    .line 47
    array-length v1, v1

    .line 48
    sub-int/2addr p2, v1

    .line 49
    sub-int/2addr p2, v5

    .line 50
    invoke-virtual {v0, p1, p0, p2}, Ljavax/crypto/Cipher;->doFinal([BII)[B

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :cond_1
    const-string p0, "Decryption failed (OutputPrefix mismatch)."

    .line 56
    .line 57
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v3

    .line 61
    :cond_2
    const-string p0, "ciphertext too short"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v3
.end method

.method public final c([B[B)[B
    .locals 9

    .line 1
    invoke-static {}, La/vow0;->b()Ljavax/crypto/Cipher;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, p1

    .line 6
    iget-object v2, p0, La/bww0;->b:[B

    .line 7
    .line 8
    array-length v3, v2

    .line 9
    const v4, 0x7fffffe3

    .line 10
    .line 11
    .line 12
    sub-int/2addr v4, v3

    .line 13
    if-gt v1, v4, :cond_2

    .line 14
    .line 15
    array-length v1, v2

    .line 16
    const/16 v3, 0xc

    .line 17
    .line 18
    add-int/2addr v1, v3

    .line 19
    array-length v4, p1

    .line 20
    add-int/2addr v1, v4

    .line 21
    add-int/lit8 v1, v1, 0x10

    .line 22
    .line 23
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-static {v3}, La/s7x0;->a(I)[B

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    array-length v5, v2

    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-static {v1, v6, v4, v5, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 34
    .line 35
    .line 36
    array-length v5, v1

    .line 37
    new-instance v7, Ljavax/crypto/spec/GCMParameterSpec;

    .line 38
    .line 39
    const/16 v8, 0x80

    .line 40
    .line 41
    invoke-direct {v7, v8, v1, v6, v5}, Ljavax/crypto/spec/GCMParameterSpec;-><init>(I[BII)V

    .line 42
    .line 43
    .line 44
    const/4 v1, 0x1

    .line 45
    iget-object p0, p0, La/bww0;->a:Ljavax/crypto/spec/SecretKeySpec;

    .line 46
    .line 47
    invoke-virtual {v0, v1, p0, v7}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 48
    .line 49
    .line 50
    if-eqz p2, :cond_0

    .line 51
    .line 52
    array-length p0, p2

    .line 53
    if-eqz p0, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, p2}, Ljavax/crypto/Cipher;->updateAAD([B)V

    .line 56
    .line 57
    .line 58
    :cond_0
    move p0, v3

    .line 59
    array-length v3, p1

    .line 60
    array-length p2, v2

    .line 61
    add-int/lit8 v5, p2, 0xc

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    move-object v1, p1

    .line 65
    invoke-virtual/range {v0 .. v5}, Ljavax/crypto/Cipher;->doFinal([BII[BI)I

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    array-length p1, v1

    .line 70
    add-int/lit8 p1, p1, 0x10

    .line 71
    .line 72
    if-ne p0, p1, :cond_1

    .line 73
    .line 74
    return-object v4

    .line 75
    :cond_1
    array-length p1, v1

    .line 76
    sub-int/2addr p0, p1

    .line 77
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 78
    .line 79
    const-string p2, "encryption failed; AES-GCM-SIV tag must be 16 bytes, but got only "

    .line 80
    .line 81
    const-string v0, " bytes"

    .line 82
    .line 83
    invoke-static {p0, p2, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    throw p1

    .line 91
    :cond_2
    const-string p0, "plaintext too long"

    .line 92
    .line 93
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    const/4 p0, 0x0

    .line 97
    return-object p0
.end method
