.class public final La/cix0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dnw0;


# instance fields
.field public final a:Ljava/security/interfaces/ECPrivateKey;

.field public final b:La/zas0;

.field public final c:Ljava/lang/String;

.field public final d:[B

.field public final e:La/eix0;

.field public final f:La/s1x0;

.field public final g:[B


# direct methods
.method public constructor <init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;La/eix0;La/s1x0;[B)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cix0;->a:Ljava/security/interfaces/ECPrivateKey;

    .line 5
    .line 6
    new-instance v0, La/zas0;

    .line 7
    .line 8
    const/16 v1, 0x15

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v0, v1, v2}, La/zas0;-><init>(BZ)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/zas0;->b:Ljava/lang/Object;

    .line 15
    .line 16
    iput-object v0, p0, La/cix0;->b:La/zas0;

    .line 17
    .line 18
    iput-object p2, p0, La/cix0;->d:[B

    .line 19
    .line 20
    iput-object p3, p0, La/cix0;->c:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p4, p0, La/cix0;->e:La/eix0;

    .line 23
    .line 24
    iput-object p5, p0, La/cix0;->f:La/s1x0;

    .line 25
    .line 26
    iput-object p6, p0, La/cix0;->g:[B

    .line 27
    .line 28
    return-void
.end method

.method public static a(La/yzw0;)La/cix0;
    .locals 9

    .line 1
    sget-object v0, La/aix0;->a:La/okt0;

    .line 2
    .line 3
    iget-object v1, p0, La/yzw0;->a:La/f0x0;

    .line 4
    .line 5
    iget-object v2, v1, La/f0x0;->a:La/xzw0;

    .line 6
    .line 7
    iget-object v2, v2, La/xzw0;->a:La/vzw0;

    .line 8
    .line 9
    invoke-virtual {v0, v2}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, La/fix0;

    .line 14
    .line 15
    iget-object v2, p0, La/yzw0;->b:La/zas0;

    .line 16
    .line 17
    iget-object v2, v2, La/zas0;->b:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Ljava/math/BigInteger;

    .line 20
    .line 21
    invoke-static {v2}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-static {v0}, La/ghm0;->z(La/fix0;)Ljava/security/spec/ECParameterSpec;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-static {v2}, La/ibm0;->E([B)Ljava/math/BigInteger;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    new-instance v3, Ljava/security/spec/ECPrivateKeySpec;

    .line 34
    .line 35
    invoke-direct {v3, v2, v0}, Ljava/security/spec/ECPrivateKeySpec;-><init>(Ljava/math/BigInteger;Ljava/security/spec/ECParameterSpec;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, La/gix0;->f:La/gix0;

    .line 39
    .line 40
    const-string v2, "EC"

    .line 41
    .line 42
    iget-object v0, v0, La/gix0;->a:La/jix0;

    .line 43
    .line 44
    invoke-interface {v0, v2}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/security/KeyFactory;

    .line 49
    .line 50
    invoke-virtual {v0, v3}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    move-object v3, v0

    .line 55
    check-cast v3, Ljava/security/interfaces/ECPrivateKey;

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    new-array v0, v0, [B

    .line 59
    .line 60
    iget-object v1, v1, La/f0x0;->a:La/xzw0;

    .line 61
    .line 62
    iget-object v2, v1, La/xzw0;->f:La/icw0;

    .line 63
    .line 64
    if-eqz v2, :cond_0

    .line 65
    .line 66
    invoke-virtual {v2}, La/icw0;->b()[B

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    :cond_0
    move-object v4, v0

    .line 71
    new-instance v2, La/cix0;

    .line 72
    .line 73
    iget-object v0, v1, La/xzw0;->b:La/uzw0;

    .line 74
    .line 75
    invoke-static {v0}, La/aix0;->b(La/uzw0;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    sget-object v0, La/aix0;->b:La/okt0;

    .line 80
    .line 81
    iget-object v6, v1, La/xzw0;->c:La/wzw0;

    .line 82
    .line 83
    invoke-virtual {v0, v6}, La/okt0;->n(Ljava/lang/Object;)Ljava/lang/Enum;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    move-object v6, v0

    .line 88
    check-cast v6, La/eix0;

    .line 89
    .line 90
    invoke-static {v1}, La/i4w0;->X(La/xzw0;)La/s1x0;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    invoke-virtual {p0}, La/yzw0;->u()La/atm0;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    check-cast p0, La/m1x0;

    .line 99
    .line 100
    invoke-virtual {p0}, La/m1x0;->u()La/icw0;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    invoke-direct/range {v2 .. v8}, La/cix0;-><init>(Ljava/security/interfaces/ECPrivateKey;[BLjava/lang/String;La/eix0;La/s1x0;[B)V

    .line 109
    .line 110
    .line 111
    return-object v2
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 9

    .line 1
    iget-object p2, p0, La/cix0;->g:[B

    .line 2
    .line 3
    invoke-static {p2, p1}, La/x7x0;->b([B[B)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_7

    .line 9
    .line 10
    array-length p2, p2

    .line 11
    iget-object v0, p0, La/cix0;->a:Ljava/security/interfaces/ECPrivateKey;

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-static {v0}, La/ghm0;->v(Ljava/security/spec/EllipticCurve;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, La/cix0;->e:La/eix0;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    const/4 v4, 0x2

    .line 32
    const/4 v5, 0x1

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    if-eq v3, v5, :cond_1

    .line 36
    .line 37
    if-ne v3, v4, :cond_0

    .line 38
    .line 39
    mul-int/2addr v0, v4

    .line 40
    goto :goto_1

    .line 41
    :cond_0
    const-string p0, "unknown EC point format"

    .line 42
    .line 43
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_1
    :goto_0
    add-int/2addr v0, v5

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    mul-int/2addr v0, v4

    .line 50
    goto :goto_0

    .line 51
    :goto_1
    array-length v3, p1

    .line 52
    add-int/2addr v0, p2

    .line 53
    if-lt v3, v0, :cond_6

    .line 54
    .line 55
    invoke-static {p1, p2, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    iget-object v3, p0, La/cix0;->f:La/s1x0;

    .line 60
    .line 61
    invoke-interface {v3}, La/s1x0;->zza()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    iget-object v6, p0, La/cix0;->b:La/zas0;

    .line 66
    .line 67
    iget-object v6, v6, La/zas0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v6, Ljava/security/interfaces/ECPrivateKey;

    .line 70
    .line 71
    invoke-interface {v6}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    .line 72
    .line 73
    .line 74
    move-result-object v7

    .line 75
    invoke-virtual {v7}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 76
    .line 77
    .line 78
    move-result-object v8

    .line 79
    invoke-static {v8, v2, p2}, La/ghm0;->A(Ljava/security/spec/EllipticCurve;La/eix0;[B)Ljava/security/spec/ECPoint;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    new-instance v8, Ljava/security/spec/ECPublicKeySpec;

    .line 84
    .line 85
    invoke-direct {v8, v2, v7}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 86
    .line 87
    .line 88
    sget-object v2, La/gix0;->f:La/gix0;

    .line 89
    .line 90
    const-string v7, "EC"

    .line 91
    .line 92
    iget-object v2, v2, La/gix0;->a:La/jix0;

    .line 93
    .line 94
    invoke-interface {v2, v7}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Ljava/security/KeyFactory;

    .line 99
    .line 100
    invoke-virtual {v2, v8}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Ljava/security/interfaces/ECPublicKey;

    .line 105
    .line 106
    invoke-static {v6, v2}, La/ghm0;->B(Ljava/security/interfaces/ECPrivateKey;Ljava/security/interfaces/ECPublicKey;)[B

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    filled-new-array {p2, v2}, [[B

    .line 111
    .line 112
    .line 113
    move-result-object p2

    .line 114
    invoke-static {p2}, La/egm0;->B([[B)[B

    .line 115
    .line 116
    .line 117
    move-result-object p2

    .line 118
    sget-object v2, La/gix0;->c:La/gix0;

    .line 119
    .line 120
    iget-object v2, v2, La/gix0;->a:La/jix0;

    .line 121
    .line 122
    iget-object v6, p0, La/cix0;->c:Ljava/lang/String;

    .line 123
    .line 124
    invoke-interface {v2, v6}, La/jix0;->zza(Ljava/lang/String;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    check-cast v2, Ljavax/crypto/Mac;

    .line 129
    .line 130
    invoke-virtual {v2}, Ljavax/crypto/Mac;->getMacLength()I

    .line 131
    .line 132
    .line 133
    move-result v7

    .line 134
    mul-int/lit16 v7, v7, 0xff

    .line 135
    .line 136
    if-gt v4, v7, :cond_5

    .line 137
    .line 138
    iget-object p0, p0, La/cix0;->d:[B

    .line 139
    .line 140
    array-length v7, p0

    .line 141
    if-nez v7, :cond_3

    .line 142
    .line 143
    new-instance p0, Ljavax/crypto/spec/SecretKeySpec;

    .line 144
    .line 145
    invoke-virtual {v2}, Ljavax/crypto/Mac;->getMacLength()I

    .line 146
    .line 147
    .line 148
    move-result v7

    .line 149
    new-array v7, v7, [B

    .line 150
    .line 151
    invoke-direct {p0, v7, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2, p0}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 155
    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_3
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 159
    .line 160
    invoke-direct {v7, p0, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v2, v7}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 164
    .line 165
    .line 166
    :goto_2
    invoke-virtual {v2, p2}, Ljavax/crypto/Mac;->doFinal([B)[B

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    new-array p2, v4, [B

    .line 171
    .line 172
    new-instance v7, Ljavax/crypto/spec/SecretKeySpec;

    .line 173
    .line 174
    invoke-direct {v7, p0, v6}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2, v7}, Ljavax/crypto/Mac;->init(Ljava/security/Key;)V

    .line 178
    .line 179
    .line 180
    const/4 p0, 0x0

    .line 181
    new-array v6, p0, [B

    .line 182
    .line 183
    move v7, p0

    .line 184
    :goto_3
    invoke-virtual {v2, v6}, Ljavax/crypto/Mac;->update([B)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v2, v1}, Ljavax/crypto/Mac;->update([B)V

    .line 188
    .line 189
    .line 190
    int-to-byte v6, v5

    .line 191
    invoke-virtual {v2, v6}, Ljavax/crypto/Mac;->update(B)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v2}, Ljavax/crypto/Mac;->doFinal()[B

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    array-length v8, v6

    .line 199
    add-int/2addr v8, v7

    .line 200
    if-ge v8, v4, :cond_4

    .line 201
    .line 202
    array-length v8, v6

    .line 203
    invoke-static {v6, p0, p2, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 204
    .line 205
    .line 206
    array-length v8, v6

    .line 207
    add-int/2addr v7, v8

    .line 208
    add-int/lit8 v5, v5, 0x1

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_4
    sub-int/2addr v4, v7

    .line 212
    invoke-static {v6, p0, p2, v7, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v3, v0, p2, p1}, La/s1x0;->a(I[B[B)[B

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :cond_5
    const-string p0, "size too large"

    .line 221
    .line 222
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return-object v1

    .line 226
    :cond_6
    const-string p0, "ciphertext too short"

    .line 227
    .line 228
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    return-object v1

    .line 232
    :cond_7
    const-string p0, "Invalid ciphertext (output prefix mismatch)"

    .line 233
    .line 234
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 235
    .line 236
    .line 237
    return-object v1
.end method
