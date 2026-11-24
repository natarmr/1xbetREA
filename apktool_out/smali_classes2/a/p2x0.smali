.class public final La/p2x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dnw0;


# static fields
.field public static final g:[B


# instance fields
.field public final a:La/fck0;

.field public final b:La/r2x0;

.field public final c:La/h70;

.field public final d:La/k2x0;

.field public final e:I

.field public final f:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [B

    .line 3
    .line 4
    sput-object v0, La/p2x0;->g:[B

    .line 5
    .line 6
    return-void
.end method

.method public constructor <init>(La/fck0;La/r2x0;La/h70;La/k2x0;ILa/icw0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p2x0;->a:La/fck0;

    .line 5
    .line 6
    iput-object p2, p0, La/p2x0;->b:La/r2x0;

    .line 7
    .line 8
    iput-object p3, p0, La/p2x0;->c:La/h70;

    .line 9
    .line 10
    iput-object p4, p0, La/p2x0;->d:La/k2x0;

    .line 11
    .line 12
    iput p5, p0, La/p2x0;->e:I

    .line 13
    .line 14
    invoke-virtual {p6}, La/icw0;->b()[B

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    iput-object p1, p0, La/p2x0;->f:[B

    .line 19
    .line 20
    return-void
.end method

.method public static a(La/g0x0;)La/dnw0;
    .locals 14

    .line 1
    iget-object v0, p0, La/g0x0;->a:La/q0x0;

    .line 2
    .line 3
    iget-object v1, p0, La/g0x0;->b:La/rkt0;

    .line 4
    .line 5
    iget-object v1, v1, La/rkt0;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/icw0;

    .line 8
    .line 9
    iget-object v2, v0, La/q0x0;->a:La/e0x0;

    .line 10
    .line 11
    iget-object v3, v0, La/q0x0;->a:La/e0x0;

    .line 12
    .line 13
    iget-object v4, v3, La/e0x0;->a:La/d0x0;

    .line 14
    .line 15
    const/4 v5, 0x0

    .line 16
    sget-object v6, La/d0x0;->g:La/d0x0;

    .line 17
    .line 18
    if-ne v4, v6, :cond_9

    .line 19
    .line 20
    sget-object v3, La/v3x0;->e:[B

    .line 21
    .line 22
    invoke-static {}, La/x3x0;->b()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-eqz v3, :cond_8

    .line 27
    .line 28
    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    if-eqz v3, :cond_7

    .line 33
    .line 34
    iget-object v4, v2, La/e0x0;->a:La/d0x0;

    .line 35
    .line 36
    iget-object v7, v2, La/e0x0;->c:La/b0x0;

    .line 37
    .line 38
    iget-object v2, v2, La/e0x0;->b:La/c0x0;

    .line 39
    .line 40
    if-ne v4, v6, :cond_6

    .line 41
    .line 42
    sget-object v6, La/c0x0;->c:La/c0x0;

    .line 43
    .line 44
    if-ne v2, v6, :cond_5

    .line 45
    .line 46
    sget-object v2, La/b0x0;->c:La/b0x0;

    .line 47
    .line 48
    if-ne v7, v2, :cond_0

    .line 49
    .line 50
    const-string v2, "XWING/HKDF_SHA256/AES_128_GCM"

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    sget-object v2, La/b0x0;->d:La/b0x0;

    .line 54
    .line 55
    if-ne v7, v2, :cond_1

    .line 56
    .line 57
    const-string v2, "XWING/HKDF_SHA256/AES_256_GCM"

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    sget-object v2, La/b0x0;->e:La/b0x0;

    .line 61
    .line 62
    if-ne v7, v2, :cond_4

    .line 63
    .line 64
    const-string v2, "XWING/HKDF_SHA256/CHACHA20POLY1305"

    .line 65
    .line 66
    :goto_0
    const-string v6, "XWING"

    .line 67
    .line 68
    invoke-static {v6, v3}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    new-instance v6, La/z3x0;

    .line 73
    .line 74
    invoke-virtual {v1}, La/icw0;->b()[B

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    const/4 v7, 0x0

    .line 79
    invoke-direct {v6, v1, v7}, La/z3x0;-><init>([BB)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v6}, Ljava/security/KeyFactory;->generatePrivate(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    new-instance v3, La/v3x0;

    .line 87
    .line 88
    invoke-static {v4}, La/c3x0;->a(La/d0x0;)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-virtual {p0}, La/g0x0;->u()La/atm0;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    check-cast p0, La/m1x0;

    .line 97
    .line 98
    invoke-virtual {p0}, La/m1x0;->u()La/icw0;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    invoke-virtual {p0}, La/icw0;->b()[B

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-direct {v3, v1, v2, v4, p0}, La/v3x0;-><init>(Ljava/security/PrivateKey;Ljava/lang/String;I[B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v0}, La/x3x0;->a(La/q0x0;)La/x3x0;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    sget-object v0, La/v3x0;->f:[B

    .line 114
    .line 115
    sget-object v1, La/v3x0;->g:[B

    .line 116
    .line 117
    iget-object v2, p0, La/x3x0;->a:Ljava/security/PublicKey;

    .line 118
    .line 119
    iget-object v4, p0, La/x3x0;->b:Ljava/lang/String;

    .line 120
    .line 121
    iget v6, p0, La/x3x0;->c:I

    .line 122
    .line 123
    iget-object p0, p0, La/x3x0;->d:[B

    .line 124
    .line 125
    invoke-static {v4}, La/aw2;->a(Ljava/lang/String;)Landroid/crypto/hpke/Hpke;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    sget-object v7, La/x3x0;->e:[B

    .line 130
    .line 131
    invoke-static {v4, v2, v1, v0, v7}, La/aw2;->b(Landroid/crypto/hpke/Hpke;Ljava/security/PublicKey;[B[B[B)Landroid/crypto/hpke/Message;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    invoke-static {v2}, La/aw2;->i(Landroid/crypto/hpke/Message;)[B

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    array-length v7, v4

    .line 140
    if-ne v7, v6, :cond_3

    .line 141
    .line 142
    invoke-static {v2}, La/aw2;->k(Landroid/crypto/hpke/Message;)[B

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    filled-new-array {p0, v4, v2}, [[B

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    invoke-static {p0}, La/egm0;->B([[B)[B

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {v3, p0, v1}, La/v3x0;->b([B[B)[B

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-static {p0, v0}, Ljava/util/Arrays;->equals([B[B)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_2

    .line 163
    .line 164
    return-object v3

    .line 165
    :cond_2
    const-string p0, "Public key and private key do not match, cannot create HybridDecrypt instance"

    .line 166
    .line 167
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    return-object v5

    .line 171
    :cond_3
    const-string p0, "Encapsulated key has wrong length"

    .line 172
    .line 173
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    return-object v5

    .line 177
    :cond_4
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 178
    .line 179
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    const-string v1, "Unknown AEAD ID: "

    .line 184
    .line 185
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    throw p0

    .line 193
    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 194
    .line 195
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    const-string v1, "Currently unsupported KDF: "

    .line 200
    .line 201
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    throw p0

    .line 209
    :cond_6
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 210
    .line 211
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    const-string v1, "Currently unsupported KEM: "

    .line 216
    .line 217
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 222
    .line 223
    .line 224
    throw p0

    .line 225
    :cond_7
    const-string p0, "Can\'t use X-Wing as Conscrypt is not available"

    .line 226
    .line 227
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    return-object v5

    .line 231
    :cond_8
    const-string p0, "Can\'t use X-Wing, as we might be in FIPS mode, Conscrypt is not available, or platform does not support X-Wing."

    .line 232
    .line 233
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    return-object v5

    .line 237
    :cond_9
    invoke-static {v4}, La/w7n0;->L(La/d0x0;)La/r2x0;

    .line 238
    .line 239
    .line 240
    move-result-object v8

    .line 241
    iget-object v6, v3, La/e0x0;->b:La/c0x0;

    .line 242
    .line 243
    invoke-static {v6}, La/w7n0;->J(La/c0x0;)La/h70;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    iget-object v3, v3, La/e0x0;->c:La/b0x0;

    .line 248
    .line 249
    invoke-static {v3}, La/w7n0;->K(La/b0x0;)La/k2x0;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    sget-object v3, La/d0x0;->f:La/d0x0;

    .line 254
    .line 255
    invoke-virtual {v4, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v6

    .line 259
    const-string v7, "Unrecognized or not NIST HPKE KEM identifier"

    .line 260
    .line 261
    sget-object v11, La/d0x0;->e:La/d0x0;

    .line 262
    .line 263
    sget-object v12, La/d0x0;->d:La/d0x0;

    .line 264
    .line 265
    sget-object v13, La/d0x0;->c:La/d0x0;

    .line 266
    .line 267
    if-eqz v6, :cond_a

    .line 268
    .line 269
    const/16 v4, 0x20

    .line 270
    .line 271
    goto :goto_1

    .line 272
    :cond_a
    if-eq v4, v13, :cond_d

    .line 273
    .line 274
    if-eq v4, v12, :cond_c

    .line 275
    .line 276
    if-ne v4, v11, :cond_b

    .line 277
    .line 278
    const/16 v4, 0x85

    .line 279
    .line 280
    goto :goto_1

    .line 281
    :cond_b
    invoke-static {v7}, La/hny;->o(Ljava/lang/String;)V

    .line 282
    .line 283
    .line 284
    return-object v5

    .line 285
    :cond_c
    const/16 v4, 0x61

    .line 286
    .line 287
    goto :goto_1

    .line 288
    :cond_d
    const/16 v4, 0x41

    .line 289
    .line 290
    :goto_1
    iget-object v2, v2, La/e0x0;->a:La/d0x0;

    .line 291
    .line 292
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v3

    .line 296
    if-nez v3, :cond_f

    .line 297
    .line 298
    if-eq v2, v13, :cond_f

    .line 299
    .line 300
    if-eq v2, v12, :cond_f

    .line 301
    .line 302
    if-ne v2, v11, :cond_e

    .line 303
    .line 304
    goto :goto_2

    .line 305
    :cond_e
    invoke-static {v7}, La/hny;->o(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    return-object v5

    .line 309
    :cond_f
    :goto_2
    invoke-virtual {v1}, La/icw0;->b()[B

    .line 310
    .line 311
    .line 312
    move-result-object v1

    .line 313
    invoke-static {v1}, La/icw0;->a([B)La/icw0;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    new-instance v7, La/fck0;

    .line 318
    .line 319
    iget-object v0, v0, La/q0x0;->b:La/icw0;

    .line 320
    .line 321
    const/16 v2, 0x1a

    .line 322
    .line 323
    invoke-direct {v7, v1, v0, v2}, La/fck0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 324
    .line 325
    .line 326
    new-instance v6, La/p2x0;

    .line 327
    .line 328
    invoke-virtual {p0}, La/g0x0;->u()La/atm0;

    .line 329
    .line 330
    .line 331
    move-result-object p0

    .line 332
    check-cast p0, La/m1x0;

    .line 333
    .line 334
    invoke-virtual {p0}, La/m1x0;->u()La/icw0;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    move v11, v4

    .line 339
    invoke-direct/range {v6 .. v12}, La/p2x0;-><init>(La/fck0;La/r2x0;La/h70;La/k2x0;ILa/icw0;)V

    .line 340
    .line 341
    .line 342
    return-object v6
.end method


# virtual methods
.method public final b([B[B)[B
    .locals 12

    .line 1
    iget-object p2, p0, La/p2x0;->f:[B

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    iget v1, p0, La/p2x0;->e:I

    .line 5
    .line 6
    add-int v6, v0, v1

    .line 7
    .line 8
    array-length v0, p1

    .line 9
    const/4 v1, 0x0

    .line 10
    if-lt v0, v6, :cond_5

    .line 11
    .line 12
    invoke-static {p2, p1}, La/x7x0;->b([B[B)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_4

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    new-array v2, v0, [B

    .line 20
    .line 21
    array-length p2, p2

    .line 22
    invoke-static {p1, p2, v6}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object v3, p0, La/p2x0;->a:La/fck0;

    .line 27
    .line 28
    iget-object v4, p0, La/p2x0;->b:La/r2x0;

    .line 29
    .line 30
    iget-object v5, p0, La/p2x0;->c:La/h70;

    .line 31
    .line 32
    iget-object p0, p0, La/p2x0;->d:La/k2x0;

    .line 33
    .line 34
    invoke-interface {v4, p2, v3}, La/r2x0;->j([BLa/fck0;)[B

    .line 35
    .line 36
    .line 37
    move-result-object p2

    .line 38
    sget-object v3, La/c3x0;->a:[B

    .line 39
    .line 40
    invoke-interface {v4}, La/r2x0;->zza()[B

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    iget-object v7, v5, La/h70;->b:Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {v7}, Ljava/lang/String;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    const/4 v9, 0x2

    .line 51
    const/4 v10, -0x1

    .line 52
    sparse-switch v8, :sswitch_data_0

    .line 53
    .line 54
    .line 55
    :goto_0
    move v0, v10

    .line 56
    goto :goto_1

    .line 57
    :sswitch_0
    const-string v0, "HmacSha512"

    .line 58
    .line 59
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_0

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_0
    move v0, v9

    .line 67
    goto :goto_1

    .line 68
    :sswitch_1
    const-string v0, "HmacSha384"

    .line 69
    .line 70
    invoke-virtual {v7, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    if-nez v0, :cond_1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    const/4 v0, 0x1

    .line 78
    goto :goto_1

    .line 79
    :sswitch_2
    const-string v8, "HmacSha256"

    .line 80
    .line 81
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-nez v7, :cond_2

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    :goto_1
    packed-switch v0, :pswitch_data_0

    .line 89
    .line 90
    .line 91
    const-string p0, "Could not determine HPKE KDF ID"

    .line 92
    .line 93
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    return-object v1

    .line 97
    :pswitch_0
    sget-object v0, La/c3x0;->h:[B

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :pswitch_1
    sget-object v0, La/c3x0;->g:[B

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :pswitch_2
    sget-object v0, La/c3x0;->f:[B

    .line 104
    .line 105
    :goto_2
    invoke-interface {p0}, La/k2x0;->zzc()[B

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v7, La/c3x0;->n:[B

    .line 110
    .line 111
    filled-new-array {v7, v4, v0, v1}, [[B

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    invoke-static {v0}, La/egm0;->B([[B)[B

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, La/c3x0;->l:[B

    .line 120
    .line 121
    sget-object v4, La/phf0;->d:[B

    .line 122
    .line 123
    const-string v7, "psk_id_hash"

    .line 124
    .line 125
    sget-object v8, La/c3x0;->o:[B

    .line 126
    .line 127
    sget-object v10, La/x7x0;->a:Ljava/nio/charset/Charset;

    .line 128
    .line 129
    invoke-virtual {v7, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    filled-new-array {v8, v0, v7, v4}, [[B

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v7}, La/egm0;->B([[B)[B

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    invoke-virtual {v5, v7, v1}, La/h70;->b([B[B)[B

    .line 142
    .line 143
    .line 144
    move-result-object v7

    .line 145
    const-string v11, "info_hash"

    .line 146
    .line 147
    invoke-virtual {v11, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 148
    .line 149
    .line 150
    move-result-object v11

    .line 151
    filled-new-array {v8, v0, v11, v2}, [[B

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    invoke-static {v2}, La/egm0;->B([[B)[B

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v5, v2, v1}, La/h70;->b([B[B)[B

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    filled-new-array {v3, v7, v1}, [[B

    .line 164
    .line 165
    .line 166
    move-result-object v1

    .line 167
    invoke-static {v1}, La/egm0;->B([[B)[B

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    const-string v2, "secret"

    .line 172
    .line 173
    invoke-virtual {v2, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    filled-new-array {v8, v0, v2, v4}, [[B

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v2}, La/egm0;->B([[B)[B

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v5, v2, p2}, La/h70;->b([B[B)[B

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    const-string v2, "key"

    .line 190
    .line 191
    invoke-interface {p0}, La/k2x0;->zza()I

    .line 192
    .line 193
    .line 194
    move-result v3

    .line 195
    invoke-static {v9, v3}, La/c3x0;->b(II)[B

    .line 196
    .line 197
    .line 198
    move-result-object v4

    .line 199
    invoke-virtual {v2, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    filled-new-array {v4, v8, v0, v2, v1}, [[B

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    invoke-static {v2}, La/egm0;->B([[B)[B

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    invoke-virtual {v5, v3, p2, v2}, La/h70;->a(I[B[B)[B

    .line 212
    .line 213
    .line 214
    move-result-object v3

    .line 215
    const-string v2, "base_nonce"

    .line 216
    .line 217
    const/16 v4, 0xc

    .line 218
    .line 219
    invoke-static {v9, v4}, La/c3x0;->b(II)[B

    .line 220
    .line 221
    .line 222
    move-result-object v7

    .line 223
    invoke-virtual {v2, v10}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    filled-new-array {v7, v8, v0, v2, v1}, [[B

    .line 228
    .line 229
    .line 230
    move-result-object v0

    .line 231
    invoke-static {v0}, La/egm0;->B([[B)[B

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v5, v4, p2, v0}, La/h70;->a(I[B[B)[B

    .line 236
    .line 237
    .line 238
    move-result-object p2

    .line 239
    sget-object v0, Ljava/math/BigInteger;->ONE:Ljava/math/BigInteger;

    .line 240
    .line 241
    const/16 v1, 0x60

    .line 242
    .line 243
    invoke-virtual {v0, v1}, Ljava/math/BigInteger;->shiftLeft(I)Ljava/math/BigInteger;

    .line 244
    .line 245
    .line 246
    move-result-object v1

    .line 247
    invoke-virtual {v1, v0}, Ljava/math/BigInteger;->subtract(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    new-instance v2, La/phf0;

    .line 252
    .line 253
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 254
    .line 255
    .line 256
    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    .line 257
    .line 258
    iput-object v5, v2, La/phf0;->c:Ljava/lang/Object;

    .line 259
    .line 260
    iput-object v1, v2, La/phf0;->b:Ljava/lang/Object;

    .line 261
    .line 262
    iput-object p0, v2, La/phf0;->a:Ljava/lang/Object;

    .line 263
    .line 264
    sget-object v7, La/p2x0;->g:[B

    .line 265
    .line 266
    monitor-enter v2

    .line 267
    :try_start_0
    iget-object p0, v2, La/phf0;->c:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p0, Ljava/math/BigInteger;

    .line 270
    .line 271
    invoke-static {p0, v4}, La/ibm0;->G(Ljava/math/BigInteger;I)[B

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-static {p2, p0}, La/egm0;->A([B[B)[B

    .line 276
    .line 277
    .line 278
    move-result-object v4

    .line 279
    iget-object p0, v2, La/phf0;->c:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast p0, Ljava/math/BigInteger;

    .line 282
    .line 283
    iget-object p2, v2, La/phf0;->b:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast p2, Ljava/math/BigInteger;

    .line 286
    .line 287
    invoke-virtual {p0, p2}, Ljava/math/BigInteger;->compareTo(Ljava/math/BigInteger;)I

    .line 288
    .line 289
    .line 290
    move-result p0

    .line 291
    if-gez p0, :cond_3

    .line 292
    .line 293
    iget-object p0, v2, La/phf0;->c:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast p0, Ljava/math/BigInteger;

    .line 296
    .line 297
    invoke-virtual {p0, v0}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    .line 298
    .line 299
    .line 300
    move-result-object p0

    .line 301
    iput-object p0, v2, La/phf0;->c:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 302
    .line 303
    monitor-exit v2

    .line 304
    iget-object p0, v2, La/phf0;->a:Ljava/lang/Object;

    .line 305
    .line 306
    move-object v2, p0

    .line 307
    check-cast v2, La/k2x0;

    .line 308
    .line 309
    move-object v5, p1

    .line 310
    invoke-interface/range {v2 .. v7}, La/k2x0;->b([B[B[BI[B)[B

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    return-object p0

    .line 315
    :catchall_0
    move-exception v0

    .line 316
    move-object p0, v0

    .line 317
    goto :goto_3

    .line 318
    :cond_3
    :try_start_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 319
    .line 320
    const-string p1, "message limit reached"

    .line 321
    .line 322
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 323
    .line 324
    .line 325
    throw p0

    .line 326
    :goto_3
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 327
    throw p0

    .line 328
    :cond_4
    const-string p0, "Invalid ciphertext (output prefix mismatch)"

    .line 329
    .line 330
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    return-object v1

    .line 334
    :cond_5
    const-string p0, "Ciphertext is too short."

    .line 335
    .line 336
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    return-object v1

    .line 340
    nop

    .line 341
    :sswitch_data_0
    .sparse-switch
        0x3aaea10e -> :sswitch_2
        0x3aaea52a -> :sswitch_1
        0x3aaeabd1 -> :sswitch_0
    .end sparse-switch

    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
