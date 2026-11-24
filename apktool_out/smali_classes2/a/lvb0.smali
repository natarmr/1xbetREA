.class public final La/lvb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jvb0;
.implements La/r9x0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljavax/crypto/spec/SecretKeySpec;

.field public final c:B

.field public final d:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljavax/crypto/spec/SecretKeySpec;B)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const-string v4, "Can not use HMAC in FIPS-mode, as BoringCrypto module is not available."

    .line 8
    .line 9
    const-string v5, "key size too small, need at least 16 bytes"

    .line 10
    .line 11
    const/16 v9, 0x30

    .line 12
    .line 13
    const/16 v10, 0x40

    .line 14
    .line 15
    const-string v11, "unknown Hmac algorithm: "

    .line 16
    .line 17
    const-string v13, "HMACSHA512"

    .line 18
    .line 19
    const-string v15, "HMACSHA384"

    .line 20
    .line 21
    const/16 v16, 0x0

    .line 22
    .line 23
    const-string v3, "HMACSHA256"

    .line 24
    .line 25
    const/16 v17, 0x1

    .line 26
    .line 27
    const-string v12, "HMACSHA224"

    .line 28
    .line 29
    const-string v14, "HMACSHA1"

    .line 30
    .line 31
    const/16 v18, -0x1

    .line 32
    .line 33
    const/16 v6, 0x10

    .line 34
    .line 35
    const/4 v7, 0x0

    .line 36
    packed-switch p3, :pswitch_data_0

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 40
    .line 41
    .line 42
    const/16 v19, 0x2

    .line 43
    .line 44
    new-instance v8, La/kvb0;

    .line 45
    .line 46
    invoke-direct {v8, v0, v7}, La/kvb0;-><init>(Ljava/lang/Object;B)V

    .line 47
    .line 48
    .line 49
    iput-object v8, v0, La/lvb0;->d:Ljava/lang/ThreadLocal;

    .line 50
    .line 51
    invoke-static/range {v19 .. v19}, La/brm0;->b(I)Z

    .line 52
    .line 53
    .line 54
    move-result v20

    .line 55
    if-eqz v20, :cond_6

    .line 56
    .line 57
    iput-object v1, v0, La/lvb0;->a:Ljava/lang/String;

    .line 58
    .line 59
    iput-object v2, v0, La/lvb0;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 60
    .line 61
    invoke-virtual {v2}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    array-length v2, v2

    .line 66
    if-lt v2, v6, :cond_5

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    sparse-switch v2, :sswitch_data_0

    .line 73
    .line 74
    .line 75
    :goto_0
    move/from16 v12, v18

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :sswitch_0
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-nez v2, :cond_0

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const/4 v12, 0x4

    .line 86
    goto :goto_1

    .line 87
    :sswitch_1
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-nez v2, :cond_1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    const/4 v12, 0x3

    .line 95
    goto :goto_1

    .line 96
    :sswitch_2
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-nez v2, :cond_2

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_2
    move/from16 v12, v19

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :sswitch_3
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-nez v2, :cond_3

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_3
    move/from16 v12, v17

    .line 114
    .line 115
    goto :goto_1

    .line 116
    :sswitch_4
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v2

    .line 120
    if-nez v2, :cond_4

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    move v12, v7

    .line 124
    :goto_1
    packed-switch v12, :pswitch_data_1

    .line 125
    .line 126
    .line 127
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    .line 128
    .line 129
    invoke-virtual {v11, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-direct {v0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw v0

    .line 137
    :pswitch_0
    iput-byte v10, v0, La/lvb0;->c:B

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :pswitch_1
    iput-byte v9, v0, La/lvb0;->c:B

    .line 141
    .line 142
    goto :goto_2

    .line 143
    :pswitch_2
    const/16 v1, 0x20

    .line 144
    .line 145
    iput-byte v1, v0, La/lvb0;->c:B

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :pswitch_3
    const/16 v1, 0x1c

    .line 149
    .line 150
    iput-byte v1, v0, La/lvb0;->c:B

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :pswitch_4
    const/16 v1, 0x14

    .line 154
    .line 155
    iput-byte v1, v0, La/lvb0;->c:B

    .line 156
    .line 157
    :goto_2
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    return-void

    .line 161
    :cond_5
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 162
    .line 163
    invoke-direct {v0, v5}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    throw v0

    .line 167
    :cond_6
    invoke-static {v4}, La/hny;->o(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v16

    .line 171
    :pswitch_5
    const/16 v19, 0x2

    .line 172
    .line 173
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 174
    .line 175
    .line 176
    new-instance v8, La/kvb0;

    .line 177
    .line 178
    move/from16 v7, v19

    .line 179
    .line 180
    invoke-direct {v8, v0, v7}, La/kvb0;-><init>(Ljava/lang/Object;B)V

    .line 181
    .line 182
    .line 183
    iput-object v8, v0, La/lvb0;->d:Ljava/lang/ThreadLocal;

    .line 184
    .line 185
    invoke-static {v7}, La/esw0;->b(I)Z

    .line 186
    .line 187
    .line 188
    move-result v19

    .line 189
    if-eqz v19, :cond_d

    .line 190
    .line 191
    iput-object v1, v0, La/lvb0;->a:Ljava/lang/String;

    .line 192
    .line 193
    iput-object v2, v0, La/lvb0;->b:Ljavax/crypto/spec/SecretKeySpec;

    .line 194
    .line 195
    invoke-virtual {v2}, Ljavax/crypto/spec/SecretKeySpec;->getEncoded()[B

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    array-length v2, v2

    .line 200
    if-lt v2, v6, :cond_c

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 203
    .line 204
    .line 205
    move-result v2

    .line 206
    sparse-switch v2, :sswitch_data_1

    .line 207
    .line 208
    .line 209
    :goto_3
    move/from16 v12, v18

    .line 210
    .line 211
    goto :goto_4

    .line 212
    :sswitch_5
    invoke-virtual {v1, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-nez v2, :cond_7

    .line 217
    .line 218
    goto :goto_3

    .line 219
    :cond_7
    const/4 v12, 0x4

    .line 220
    goto :goto_4

    .line 221
    :sswitch_6
    invoke-virtual {v1, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-nez v2, :cond_8

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_8
    const/4 v12, 0x3

    .line 229
    goto :goto_4

    .line 230
    :sswitch_7
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v2

    .line 234
    if-nez v2, :cond_9

    .line 235
    .line 236
    goto :goto_3

    .line 237
    :cond_9
    move v12, v7

    .line 238
    goto :goto_4

    .line 239
    :sswitch_8
    invoke-virtual {v1, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v2

    .line 243
    if-nez v2, :cond_a

    .line 244
    .line 245
    goto :goto_3

    .line 246
    :cond_a
    move/from16 v12, v17

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :sswitch_9
    invoke-virtual {v1, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v2

    .line 253
    if-nez v2, :cond_b

    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_b
    const/4 v12, 0x0

    .line 257
    :goto_4
    packed-switch v12, :pswitch_data_2

    .line 258
    .line 259
    .line 260
    new-instance v0, Ljava/security/NoSuchAlgorithmException;

    .line 261
    .line 262
    invoke-virtual {v11, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-direct {v0, v1}, Ljava/security/NoSuchAlgorithmException;-><init>(Ljava/lang/String;)V

    .line 267
    .line 268
    .line 269
    throw v0

    .line 270
    :pswitch_6
    iput-byte v10, v0, La/lvb0;->c:B

    .line 271
    .line 272
    goto :goto_5

    .line 273
    :pswitch_7
    iput-byte v9, v0, La/lvb0;->c:B

    .line 274
    .line 275
    goto :goto_5

    .line 276
    :pswitch_8
    const/16 v1, 0x20

    .line 277
    .line 278
    iput-byte v1, v0, La/lvb0;->c:B

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :pswitch_9
    const/16 v1, 0x1c

    .line 282
    .line 283
    iput-byte v1, v0, La/lvb0;->c:B

    .line 284
    .line 285
    goto :goto_5

    .line 286
    :pswitch_a
    const/16 v1, 0x14

    .line 287
    .line 288
    iput-byte v1, v0, La/lvb0;->c:B

    .line 289
    .line 290
    :goto_5
    invoke-virtual {v8}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    return-void

    .line 294
    :cond_c
    new-instance v0, Ljava/security/InvalidAlgorithmParameterException;

    .line 295
    .line 296
    invoke-direct {v0, v5}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 297
    .line 298
    .line 299
    throw v0

    .line 300
    :cond_d
    invoke-static {v4}, La/hny;->o(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v16

    .line 304
    nop

    .line 305
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
    .end packed-switch

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    :sswitch_data_0
    .sparse-switch
        -0x6ca99674 -> :sswitch_4
        0x1762408f -> :sswitch_3
        0x176240ee -> :sswitch_2
        0x1762450a -> :sswitch_1
        0x17624bb1 -> :sswitch_0
    .end sparse-switch

    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    :sswitch_data_1
    .sparse-switch
        -0x6ca99674 -> :sswitch_9
        0x1762408f -> :sswitch_8
        0x176240ee -> :sswitch_7
        0x1762450a -> :sswitch_6
        0x17624bb1 -> :sswitch_5
    .end sparse-switch

    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
.end method


# virtual methods
.method public e([BI)[B
    .locals 1

    .line 1
    iget-object v0, p0, La/lvb0;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    check-cast v0, La/kvb0;

    .line 4
    .line 5
    iget-byte p0, p0, La/lvb0;->c:B

    .line 6
    .line 7
    if-gt p2, p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljavax/crypto/Mac;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljavax/crypto/Mac;->update([B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljavax/crypto/Mac;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 34
    .line 35
    const-string p1, "tag size too big"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method

.method public f([BI)[B
    .locals 1

    .line 1
    iget-object v0, p0, La/lvb0;->d:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    check-cast v0, La/kvb0;

    .line 4
    .line 5
    iget-byte p0, p0, La/lvb0;->c:B

    .line 6
    .line 7
    if-gt p2, p0, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljavax/crypto/Mac;

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljavax/crypto/Mac;->update([B)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljavax/crypto/Mac;

    .line 23
    .line 24
    invoke-virtual {p0}, Ljavax/crypto/Mac;->doFinal()[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :cond_0
    new-instance p0, Ljava/security/InvalidAlgorithmParameterException;

    .line 34
    .line 35
    const-string p1, "tag size too big"

    .line 36
    .line 37
    invoke-direct {p0, p1}, Ljava/security/InvalidAlgorithmParameterException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw p0
.end method
