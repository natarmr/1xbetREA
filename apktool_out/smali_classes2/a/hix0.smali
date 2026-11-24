.class public final La/hix0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tmw0;


# instance fields
.field public final a:La/shx0;

.field public final b:La/acw0;

.field public final c:I

.field public final d:[B


# direct methods
.method public constructor <init>(La/shx0;La/acw0;I[B)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/hix0;->a:La/shx0;

    .line 5
    .line 6
    iput-object p2, p0, La/hix0;->b:La/acw0;

    .line 7
    .line 8
    iput p3, p0, La/hix0;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/hix0;->d:[B

    .line 11
    .line 12
    return-void
.end method

.method public static a(La/uqw0;)La/hix0;
    .locals 9

    .line 1
    new-instance v0, La/hix0;

    .line 2
    .line 3
    new-instance v1, La/shx0;

    .line 4
    .line 5
    iget-object v2, p0, La/uqw0;->b:La/rkt0;

    .line 6
    .line 7
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v2, La/icw0;

    .line 10
    .line 11
    invoke-virtual {v2}, La/icw0;->b()[B

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-object v3, p0, La/uqw0;->a:La/brw0;

    .line 16
    .line 17
    iget v4, v3, La/brw0;->c:I

    .line 18
    .line 19
    invoke-direct {v1, v2, v4}, La/shx0;-><init>([BI)V

    .line 20
    .line 21
    .line 22
    new-instance v2, La/acw0;

    .line 23
    .line 24
    new-instance v4, La/lvb0;

    .line 25
    .line 26
    iget-object v5, v3, La/brw0;->f:La/fhn;

    .line 27
    .line 28
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    const-string v6, "HMAC"

    .line 33
    .line 34
    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 39
    .line 40
    iget-object v8, p0, La/uqw0;->c:La/rkt0;

    .line 41
    .line 42
    iget-object v8, v8, La/rkt0;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast v8, La/icw0;

    .line 45
    .line 46
    invoke-virtual {v8}, La/icw0;->b()[B

    .line 47
    .line 48
    .line 49
    move-result-object v8

    .line 50
    invoke-direct {v7, v8, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const/4 v6, 0x1

    .line 54
    invoke-direct {v4, v5, v7, v6}, La/lvb0;-><init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;B)V

    .line 55
    .line 56
    .line 57
    iget v3, v3, La/brw0;->d:I

    .line 58
    .line 59
    invoke-direct {v2, v4, v3}, La/acw0;-><init>(La/lvb0;I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/uqw0;->d:La/icw0;

    .line 63
    .line 64
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    invoke-direct {v0, v1, v2, v3, p0}, La/hix0;-><init>(La/shx0;La/acw0;I[B)V

    .line 69
    .line 70
    .line 71
    return-object v0
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 13

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, La/hix0;->d:[B

    .line 3
    .line 4
    array-length v2, v1

    .line 5
    iget v3, p0, La/hix0;->c:I

    .line 6
    .line 7
    add-int/2addr v2, v3

    .line 8
    const/4 v4, 0x0

    .line 9
    if-lt v0, v2, :cond_4

    .line 10
    .line 11
    invoke-static {v1, p1}, La/x7x0;->b([B[B)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_3

    .line 16
    .line 17
    array-length v0, v1

    .line 18
    array-length v1, p1

    .line 19
    sub-int/2addr v1, v3

    .line 20
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    array-length v0, p1

    .line 25
    sub-int/2addr v0, v3

    .line 26
    array-length v1, p1

    .line 27
    invoke-static {p1, v0, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    const/4 v0, 0x0

    .line 32
    if-nez p2, :cond_0

    .line 33
    .line 34
    new-array p2, v0, [B

    .line 35
    .line 36
    :cond_0
    const/16 v1, 0x8

    .line 37
    .line 38
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    array-length v3, p2

    .line 43
    int-to-long v7, v3

    .line 44
    const-wide/16 v9, 0x8

    .line 45
    .line 46
    mul-long/2addr v7, v9

    .line 47
    invoke-virtual {v2, v7, v8}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-virtual {v2}, Ljava/nio/ByteBuffer;->array()[B

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    filled-new-array {p2, v6, v1}, [[B

    .line 60
    .line 61
    .line 62
    move-result-object p2

    .line 63
    invoke-static {p2}, La/egm0;->B([[B)[B

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    iget-object v1, p0, La/hix0;->b:La/acw0;

    .line 68
    .line 69
    invoke-virtual {v1, p2}, La/acw0;->a([B)[B

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    invoke-static {p2, p1}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-eqz p1, :cond_1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const-string p1, "invalid MAC"

    .line 81
    .line 82
    invoke-static {p1}, La/hny;->o(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_0
    array-length p1, v6

    .line 86
    iget-object v5, p0, La/hix0;->a:La/shx0;

    .line 87
    .line 88
    iget p0, v5, La/shx0;->b:I

    .line 89
    .line 90
    if-lt p1, p0, :cond_2

    .line 91
    .line 92
    new-array v11, p0, [B

    .line 93
    .line 94
    invoke-static {v6, v0, v11, v0, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 95
    .line 96
    .line 97
    array-length p0, v6

    .line 98
    iget v7, v5, La/shx0;->b:I

    .line 99
    .line 100
    sub-int/2addr p0, v7

    .line 101
    new-array v9, p0, [B

    .line 102
    .line 103
    array-length p0, v6

    .line 104
    sub-int v8, p0, v7

    .line 105
    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v12, 0x0

    .line 108
    invoke-virtual/range {v5 .. v12}, La/shx0;->a([BII[BI[BZ)V

    .line 109
    .line 110
    .line 111
    return-object v9

    .line 112
    :cond_2
    const-string p0, "ciphertext too short"

    .line 113
    .line 114
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v4

    .line 118
    :cond_3
    const-string p0, "Decryption failed (OutputPrefix mismatch)."

    .line 119
    .line 120
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    return-object v4

    .line 124
    :cond_4
    const-string p0, "Decryption failed (ciphertext too short)."

    .line 125
    .line 126
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    return-object v4
.end method

.method public final c([B[B)[B
    .locals 9

    .line 1
    array-length v0, p1

    .line 2
    iget-object v1, p0, La/hix0;->a:La/shx0;

    .line 3
    .line 4
    iget v2, v1, La/shx0;->b:I

    .line 5
    .line 6
    const v3, 0x7fffffff

    .line 7
    .line 8
    .line 9
    sub-int/2addr v3, v2

    .line 10
    if-gt v0, v3, :cond_1

    .line 11
    .line 12
    array-length v0, p1

    .line 13
    add-int/2addr v0, v2

    .line 14
    new-array v5, v0, [B

    .line 15
    .line 16
    invoke-static {v2}, La/s7x0;->a(I)[B

    .line 17
    .line 18
    .line 19
    move-result-object v7

    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-static {v7, v0, v5, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 22
    .line 23
    .line 24
    array-length v4, p1

    .line 25
    iget v6, v1, La/shx0;->b:I

    .line 26
    .line 27
    const/4 v8, 0x1

    .line 28
    const/4 v3, 0x0

    .line 29
    move-object v2, p1

    .line 30
    invoke-virtual/range {v1 .. v8}, La/shx0;->a([BII[BI[BZ)V

    .line 31
    .line 32
    .line 33
    if-nez p2, :cond_0

    .line 34
    .line 35
    new-array p2, v0, [B

    .line 36
    .line 37
    :cond_0
    const/16 p1, 0x8

    .line 38
    .line 39
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    array-length v1, p2

    .line 44
    int-to-long v1, v1

    .line 45
    const-wide/16 v3, 0x8

    .line 46
    .line 47
    mul-long/2addr v1, v3

    .line 48
    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->array()[B

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    filled-new-array {p2, v5, p1}, [[B

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    invoke-static {p1}, La/egm0;->B([[B)[B

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iget-object p2, p0, La/hix0;->b:La/acw0;

    .line 69
    .line 70
    invoke-virtual {p2, p1}, La/acw0;->a([B)[B

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    iget-object p0, p0, La/hix0;->d:[B

    .line 75
    .line 76
    filled-new-array {p0, v5, p1}, [[B

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 86
    .line 87
    const-string p1, "plaintext length can not exceed "

    .line 88
    .line 89
    invoke-static {v3, p1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object p1

    .line 93
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p0
.end method
