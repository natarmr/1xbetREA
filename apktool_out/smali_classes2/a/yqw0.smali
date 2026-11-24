.class public final synthetic La/yqw0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/yqw0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(La/fpw0;Ljava/lang/Integer;)La/atm0;
    .locals 11

    .line 1
    iget-byte p0, p0, La/yqw0;->a:B

    .line 2
    .line 3
    const/16 v0, 0x18

    .line 4
    .line 5
    const/4 v1, 0x4

    .line 6
    const/16 v2, 0x20

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/p8x0;

    .line 13
    .line 14
    new-instance p0, La/l8w0;

    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v3, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 20
    .line 21
    iput-object v3, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iput-object p1, p0, La/l8w0;->a:Ljava/lang/Object;

    .line 24
    .line 25
    iget p1, p1, La/p8x0;->a:I

    .line 26
    .line 27
    invoke-static {p1}, La/rkt0;->h(I)La/rkt0;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    iput-object p1, p0, La/l8w0;->b:Ljava/lang/Object;

    .line 32
    .line 33
    iput-object p2, p0, La/l8w0;->c:Ljava/lang/Object;

    .line 34
    .line 35
    invoke-virtual {p0}, La/l8w0;->d()La/h8x0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_0
    check-cast p1, La/g8x0;

    .line 41
    .line 42
    iget p0, p1, La/g8x0;->a:I

    .line 43
    .line 44
    if-ne p0, v2, :cond_0

    .line 45
    .line 46
    new-instance v0, La/mkt0;

    .line 47
    .line 48
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v3, v0, La/mkt0;->b:Ljava/lang/Object;

    .line 52
    .line 53
    iput-object v3, v0, La/mkt0;->c:Ljava/lang/Object;

    .line 54
    .line 55
    iput-object p1, v0, La/mkt0;->a:Ljava/lang/Object;

    .line 56
    .line 57
    invoke-static {p0}, La/rkt0;->h(I)La/rkt0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iput-object p0, v0, La/mkt0;->b:Ljava/lang/Object;

    .line 62
    .line 63
    iput-object p2, v0, La/mkt0;->c:Ljava/lang/Object;

    .line 64
    .line 65
    invoke-virtual {v0}, La/mkt0;->d()La/v7x0;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    goto :goto_0

    .line 70
    :cond_0
    const-string p0, "AesCmacKey size wrong, must be 32 bytes"

    .line 71
    .line 72
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-object v3

    .line 76
    :pswitch_1
    check-cast p1, La/t5x0;

    .line 77
    .line 78
    iget-object p0, p1, La/t5x0;->a:La/x4w0;

    .line 79
    .line 80
    sget-object p1, La/a5x0;->d:La/a5x0;

    .line 81
    .line 82
    iget-object v0, p0, La/x4w0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, v0}, La/a5x0;->e(Ljava/lang/String;)La/l5x0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    iget-object p1, p1, La/a5x0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    check-cast p1, Ljava/lang/Boolean;

    .line 97
    .line 98
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 99
    .line 100
    .line 101
    move-result p1

    .line 102
    if-eqz p1, :cond_1

    .line 103
    .line 104
    iget-object p1, p0, La/x4w0;->a:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p1, La/sjw0;

    .line 107
    .line 108
    iget-object v0, v1, La/l5x0;->a:Ljava/lang/String;

    .line 109
    .line 110
    sget-object v1, La/lpw0;->e:La/lpw0;

    .line 111
    .line 112
    invoke-static {v0, v1, p1}, La/x4w0;->d(Ljava/lang/String;La/lpw0;La/sjw0;)La/x4w0;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    sget-object v0, La/k6x0;->b:La/k6x0;

    .line 117
    .line 118
    invoke-virtual {v0, p1}, La/k6x0;->b(La/x4w0;)La/fpw0;

    .line 119
    .line 120
    .line 121
    move-result-object p1

    .line 122
    sget-object v1, La/b6x0;->b:La/b6x0;

    .line 123
    .line 124
    invoke-virtual {v1, p1, v3}, La/b6x0;->b(La/fpw0;Ljava/lang/Integer;)La/atm0;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    sget-object v1, La/gfk0;->h:La/gfk0;

    .line 129
    .line 130
    iget-object v0, v0, La/k6x0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    .line 131
    .line 132
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    check-cast v0, La/u7x0;

    .line 137
    .line 138
    invoke-virtual {v0, p1}, La/u7x0;->a(La/atm0;)La/vkr0;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-static {}, La/wex0;->t()La/vex0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v2, p1, La/vkr0;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/lang/String;

    .line 149
    .line 150
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 151
    .line 152
    .line 153
    iget-object v3, v0, La/hkw0;->b:La/jkw0;

    .line 154
    .line 155
    check-cast v3, La/wex0;

    .line 156
    .line 157
    invoke-static {v3, v2}, La/wex0;->w(La/wex0;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    iget-object v2, p1, La/vkr0;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v2, La/sjw0;

    .line 163
    .line 164
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 165
    .line 166
    .line 167
    iget-object v3, v0, La/hkw0;->b:La/jkw0;

    .line 168
    .line 169
    check-cast v3, La/wex0;

    .line 170
    .line 171
    invoke-static {v3, v2}, La/wex0;->v(La/wex0;La/sjw0;)V

    .line 172
    .line 173
    .line 174
    iget-object p1, p1, La/vkr0;->d:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p1, La/hbb;

    .line 177
    .line 178
    invoke-static {p1}, La/bcm0;->C(La/hbb;)I

    .line 179
    .line 180
    .line 181
    move-result p1

    .line 182
    invoke-virtual {v0}, La/hkw0;->d()V

    .line 183
    .line 184
    .line 185
    iget-object v2, v0, La/hkw0;->b:La/jkw0;

    .line 186
    .line 187
    check-cast v2, La/wex0;

    .line 188
    .line 189
    invoke-static {v2, p1}, La/wex0;->u(La/wex0;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, La/hkw0;->c()La/jkw0;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    check-cast p1, La/wex0;

    .line 197
    .line 198
    invoke-virtual {p1}, La/wex0;->A()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {p1}, La/wex0;->z()La/sjw0;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    invoke-virtual {p1}, La/wex0;->x()I

    .line 207
    .line 208
    .line 209
    move-result p1

    .line 210
    invoke-static {p1}, La/bcm0;->E(I)La/hbb;

    .line 211
    .line 212
    .line 213
    move-result-object p1

    .line 214
    iget-object p0, p0, La/x4w0;->c:Ljava/lang/Object;

    .line 215
    .line 216
    check-cast p0, La/lpw0;

    .line 217
    .line 218
    invoke-static {v0, v2, p1, p0, p2}, La/vkr0;->C(Ljava/lang/String;La/sjw0;La/hbb;La/lpw0;Ljava/lang/Integer;)La/vkr0;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    new-instance v3, La/o5x0;

    .line 223
    .line 224
    invoke-direct {v3, p0, v1}, La/o5x0;-><init>(La/vkr0;La/gfk0;)V

    .line 225
    .line 226
    .line 227
    goto :goto_1

    .line 228
    :cond_1
    const-string p0, "Creating new keys is not allowed."

    .line 229
    .line 230
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    :goto_1
    return-object v3

    .line 234
    :pswitch_2
    check-cast p1, La/e0x0;

    .line 235
    .line 236
    const-string p0, "XWING"

    .line 237
    .line 238
    iget-object v0, p1, La/e0x0;->a:La/d0x0;

    .line 239
    .line 240
    sget-object v4, La/d0x0;->f:La/d0x0;

    .line 241
    .line 242
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    const/16 v5, 0xb

    .line 247
    .line 248
    const/4 v6, 0x0

    .line 249
    if-eqz v4, :cond_2

    .line 250
    .line 251
    invoke-static {v2}, La/s7x0;->a(I)[B

    .line 252
    .line 253
    .line 254
    move-result-object p0

    .line 255
    aget-byte v0, p0, v6

    .line 256
    .line 257
    or-int/lit8 v0, v0, 0x7

    .line 258
    .line 259
    int-to-byte v0, v0

    .line 260
    aput-byte v0, p0, v6

    .line 261
    .line 262
    const/16 v0, 0x1f

    .line 263
    .line 264
    aget-byte v1, p0, v0

    .line 265
    .line 266
    and-int/lit8 v1, v1, 0x3f

    .line 267
    .line 268
    int-to-byte v1, v1

    .line 269
    aput-byte v1, p0, v0

    .line 270
    .line 271
    or-int/lit16 v1, v1, 0x80

    .line 272
    .line 273
    int-to-byte v1, v1

    .line 274
    aput-byte v1, p0, v0

    .line 275
    .line 276
    new-instance v0, La/rkt0;

    .line 277
    .line 278
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    invoke-direct {v0, v1, v5}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 283
    .line 284
    .line 285
    invoke-static {p0}, La/dem0;->x([B)[B

    .line 286
    .line 287
    .line 288
    move-result-object p0

    .line 289
    invoke-static {p0}, La/icw0;->a([B)La/icw0;

    .line 290
    .line 291
    .line 292
    move-result-object p0

    .line 293
    goto/16 :goto_4

    .line 294
    .line 295
    :cond_2
    sget-object v2, La/d0x0;->e:La/d0x0;

    .line 296
    .line 297
    sget-object v4, La/d0x0;->d:La/d0x0;

    .line 298
    .line 299
    sget-object v7, La/d0x0;->c:La/d0x0;

    .line 300
    .line 301
    if-eq v0, v7, :cond_6

    .line 302
    .line 303
    if-eq v0, v4, :cond_6

    .line 304
    .line 305
    if-eq v0, v2, :cond_6

    .line 306
    .line 307
    sget-object p1, La/d0x0;->g:La/d0x0;

    .line 308
    .line 309
    if-ne v0, p1, :cond_5

    .line 310
    .line 311
    invoke-static {}, La/hew0;->a0()Ljava/security/Provider;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    if-eqz p1, :cond_4

    .line 316
    .line 317
    :try_start_0
    invoke-static {p0, p1}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyPairGenerator;

    .line 318
    .line 319
    .line 320
    move-result-object p2

    .line 321
    invoke-virtual {p2}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    .line 322
    .line 323
    .line 324
    move-result-object p2

    .line 325
    invoke-static {p0, p1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    invoke-virtual {p2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 330
    .line 331
    .line 332
    move-result-object p1

    .line 333
    const-class p2, La/v2x0;

    .line 334
    .line 335
    invoke-virtual {p0, p1, p2}, Ljava/security/KeyFactory;->getKeySpec(Ljava/security/Key;Ljava/lang/Class;)Ljava/security/spec/KeySpec;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    if-nez p0, :cond_3

    .line 340
    .line 341
    throw v3

    .line 342
    :cond_3
    new-instance p0, Ljava/lang/ClassCastException;

    .line 343
    .line 344
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 345
    .line 346
    .line 347
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 348
    :catch_0
    move-exception p0

    .line 349
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 350
    .line 351
    const-string p2, "Can\'t generate X-Wing key"

    .line 352
    .line 353
    invoke-direct {p1, p2, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 354
    .line 355
    .line 356
    throw p1

    .line 357
    :cond_4
    const-string p0, "Can\'t generate X-Wing key as Conscrypt is not available"

    .line 358
    .line 359
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_5

    .line 363
    .line 364
    :cond_5
    const-string p0, "Unknown KEM ID"

    .line 365
    .line 366
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 367
    .line 368
    .line 369
    goto/16 :goto_5

    .line 370
    .line 371
    :cond_6
    sget-object p0, La/c3x0;->a:[B

    .line 372
    .line 373
    if-ne v0, v7, :cond_7

    .line 374
    .line 375
    sget-object p0, La/fix0;->a:La/fix0;

    .line 376
    .line 377
    goto :goto_2

    .line 378
    :cond_7
    if-ne v0, v4, :cond_8

    .line 379
    .line 380
    sget-object p0, La/fix0;->b:La/fix0;

    .line 381
    .line 382
    goto :goto_2

    .line 383
    :cond_8
    if-ne v0, v2, :cond_f

    .line 384
    .line 385
    sget-object p0, La/fix0;->c:La/fix0;

    .line 386
    .line 387
    :goto_2
    invoke-static {p0}, La/ghm0;->z(La/fix0;)Ljava/security/spec/ECParameterSpec;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    invoke-static {v2}, La/ghm0;->y(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    check-cast v3, Ljava/security/interfaces/ECPublicKey;

    .line 400
    .line 401
    invoke-interface {v3}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    .line 402
    .line 403
    .line 404
    move-result-object v3

    .line 405
    invoke-static {p0}, La/ghm0;->z(La/fix0;)Ljava/security/spec/ECParameterSpec;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    invoke-virtual {p0}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    invoke-static {v3, p0}, La/m4x0;->g(Ljava/security/spec/ECPoint;Ljava/security/spec/EllipticCurve;)V

    .line 414
    .line 415
    .line 416
    invoke-static {p0}, La/ghm0;->v(Ljava/security/spec/EllipticCurve;)I

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    sget-object v4, La/eix0;->a:La/eix0;

    .line 421
    .line 422
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 423
    .line 424
    .line 425
    move-result v7

    .line 426
    const/4 v8, 0x1

    .line 427
    if-eqz v7, :cond_e

    .line 428
    .line 429
    const/4 v1, 0x2

    .line 430
    if-eq v7, v8, :cond_c

    .line 431
    .line 432
    if-ne v7, v1, :cond_b

    .line 433
    .line 434
    mul-int/lit8 v1, p0, 0x2

    .line 435
    .line 436
    new-array v4, v1, [B

    .line 437
    .line 438
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    .line 439
    .line 440
    .line 441
    move-result-object v7

    .line 442
    invoke-static {v7}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 443
    .line 444
    .line 445
    move-result-object v7

    .line 446
    array-length v8, v7

    .line 447
    if-le v8, p0, :cond_9

    .line 448
    .line 449
    array-length v8, v7

    .line 450
    sub-int/2addr v8, p0

    .line 451
    array-length v9, v7

    .line 452
    invoke-static {v7, v8, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 453
    .line 454
    .line 455
    move-result-object v7

    .line 456
    :cond_9
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {v3}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 461
    .line 462
    .line 463
    move-result-object v3

    .line 464
    array-length v8, v3

    .line 465
    if-le v8, p0, :cond_a

    .line 466
    .line 467
    array-length v8, v3

    .line 468
    sub-int/2addr v8, p0

    .line 469
    array-length v9, v3

    .line 470
    invoke-static {v3, v8, v9}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 471
    .line 472
    .line 473
    move-result-object v3

    .line 474
    :cond_a
    array-length v8, v3

    .line 475
    sub-int/2addr v1, v8

    .line 476
    array-length v8, v3

    .line 477
    invoke-static {v3, v6, v4, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 478
    .line 479
    .line 480
    array-length v1, v7

    .line 481
    sub-int/2addr p0, v1

    .line 482
    array-length v1, v7

    .line 483
    invoke-static {v7, v6, v4, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 484
    .line 485
    .line 486
    goto :goto_3

    .line 487
    :cond_b
    new-instance p0, Ljava/security/GeneralSecurityException;

    .line 488
    .line 489
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object p1

    .line 493
    const-string p2, "invalid format:"

    .line 494
    .line 495
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object p1

    .line 499
    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 500
    .line 501
    .line 502
    throw p0

    .line 503
    :cond_c
    add-int/2addr p0, v8

    .line 504
    new-array v4, p0, [B

    .line 505
    .line 506
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    .line 507
    .line 508
    .line 509
    move-result-object v7

    .line 510
    invoke-static {v7}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 511
    .line 512
    .line 513
    move-result-object v7

    .line 514
    array-length v8, v7

    .line 515
    sub-int/2addr p0, v8

    .line 516
    array-length v8, v7

    .line 517
    invoke-static {v7, v6, v4, p0, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    invoke-virtual {p0, v6}, Ljava/math/BigInteger;->testBit(I)Z

    .line 525
    .line 526
    .line 527
    move-result p0

    .line 528
    if-eqz p0, :cond_d

    .line 529
    .line 530
    const/4 v1, 0x3

    .line 531
    :cond_d
    int-to-byte p0, v1

    .line 532
    aput-byte p0, v4, v6

    .line 533
    .line 534
    goto :goto_3

    .line 535
    :cond_e
    mul-int/lit8 v4, p0, 0x2

    .line 536
    .line 537
    add-int/2addr v4, v8

    .line 538
    new-array v7, v4, [B

    .line 539
    .line 540
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    .line 541
    .line 542
    .line 543
    move-result-object v9

    .line 544
    invoke-static {v9}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 545
    .line 546
    .line 547
    move-result-object v9

    .line 548
    invoke-virtual {v3}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    invoke-static {v3}, La/ibm0;->F(Ljava/math/BigInteger;)[B

    .line 553
    .line 554
    .line 555
    move-result-object v3

    .line 556
    array-length v10, v3

    .line 557
    sub-int/2addr v4, v10

    .line 558
    array-length v10, v3

    .line 559
    invoke-static {v3, v6, v7, v4, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 560
    .line 561
    .line 562
    add-int/2addr p0, v8

    .line 563
    array-length v3, v9

    .line 564
    sub-int/2addr p0, v3

    .line 565
    array-length v3, v9

    .line 566
    invoke-static {v9, v6, v7, p0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 567
    .line 568
    .line 569
    aput-byte v1, v7, v6

    .line 570
    .line 571
    move-object v4, v7

    .line 572
    :goto_3
    invoke-static {v4}, La/icw0;->a([B)La/icw0;

    .line 573
    .line 574
    .line 575
    move-result-object p0

    .line 576
    invoke-virtual {v2}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 577
    .line 578
    .line 579
    move-result-object v1

    .line 580
    check-cast v1, Ljava/security/interfaces/ECPrivateKey;

    .line 581
    .line 582
    invoke-interface {v1}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    invoke-static {v0}, La/c3x0;->c(La/d0x0;)I

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    invoke-static {v1, v0}, La/ibm0;->G(Ljava/math/BigInteger;I)[B

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    new-instance v1, La/rkt0;

    .line 595
    .line 596
    invoke-static {v0}, La/icw0;->a([B)La/icw0;

    .line 597
    .line 598
    .line 599
    move-result-object v0

    .line 600
    invoke-direct {v1, v0, v5}, La/rkt0;-><init>(Ljava/lang/Object;B)V

    .line 601
    .line 602
    .line 603
    move-object v0, v1

    .line 604
    :goto_4
    invoke-static {p1, p0, p2}, La/q0x0;->v(La/e0x0;La/icw0;Ljava/lang/Integer;)La/q0x0;

    .line 605
    .line 606
    .line 607
    move-result-object p0

    .line 608
    invoke-static {p0, v0}, La/g0x0;->v(La/q0x0;La/rkt0;)La/g0x0;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    goto :goto_5

    .line 613
    :cond_f
    const-string p0, "Unrecognized NIST HPKE KEM identifier"

    .line 614
    .line 615
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 616
    .line 617
    .line 618
    :goto_5
    return-object v3

    .line 619
    :pswitch_3
    check-cast p1, La/xzw0;

    .line 620
    .line 621
    iget-object p0, p1, La/xzw0;->a:La/vzw0;

    .line 622
    .line 623
    sget-object v0, La/vzw0;->b:La/vzw0;

    .line 624
    .line 625
    if-ne p0, v0, :cond_10

    .line 626
    .line 627
    sget-object p0, La/m4x0;->a:Ljava/security/spec/ECParameterSpec;

    .line 628
    .line 629
    goto :goto_6

    .line 630
    :cond_10
    sget-object v0, La/vzw0;->c:La/vzw0;

    .line 631
    .line 632
    if-ne p0, v0, :cond_11

    .line 633
    .line 634
    sget-object p0, La/m4x0;->b:Ljava/security/spec/ECParameterSpec;

    .line 635
    .line 636
    goto :goto_6

    .line 637
    :cond_11
    sget-object v0, La/vzw0;->d:La/vzw0;

    .line 638
    .line 639
    if-ne p0, v0, :cond_12

    .line 640
    .line 641
    sget-object p0, La/m4x0;->c:Ljava/security/spec/ECParameterSpec;

    .line 642
    .line 643
    :goto_6
    invoke-static {p0}, La/ghm0;->y(Ljava/security/spec/ECParameterSpec;)Ljava/security/KeyPair;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    .line 652
    .line 653
    invoke-virtual {p0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    .line 654
    .line 655
    .line 656
    move-result-object p0

    .line 657
    check-cast p0, Ljava/security/interfaces/ECPrivateKey;

    .line 658
    .line 659
    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    invoke-static {p1, v0, p2}, La/f0x0;->x(La/xzw0;Ljava/security/spec/ECPoint;Ljava/lang/Integer;)La/f0x0;

    .line 664
    .line 665
    .line 666
    move-result-object p1

    .line 667
    invoke-interface {p0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    .line 668
    .line 669
    .line 670
    move-result-object p0

    .line 671
    new-instance p2, La/zas0;

    .line 672
    .line 673
    const/16 v0, 0xf

    .line 674
    .line 675
    invoke-direct {p2, p0, v0}, La/zas0;-><init>(Ljava/lang/Object;B)V

    .line 676
    .line 677
    .line 678
    invoke-static {p1, p2}, La/yzw0;->v(La/f0x0;La/zas0;)La/yzw0;

    .line 679
    .line 680
    .line 681
    move-result-object p0

    .line 682
    return-object p0

    .line 683
    :cond_12
    new-instance p1, Ljava/security/GeneralSecurityException;

    .line 684
    .line 685
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 686
    .line 687
    .line 688
    move-result-object p0

    .line 689
    const-string p2, "Unsupported curve type: "

    .line 690
    .line 691
    invoke-virtual {p2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 692
    .line 693
    .line 694
    move-result-object p0

    .line 695
    invoke-direct {p1, p0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    .line 696
    .line 697
    .line 698
    throw p1

    .line 699
    :pswitch_4
    check-cast p1, La/zyw0;

    .line 700
    .line 701
    invoke-static {p1}, La/yyw0;->a(La/zyw0;)V

    .line 702
    .line 703
    .line 704
    new-instance p0, La/mkt0;

    .line 705
    .line 706
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 707
    .line 708
    .line 709
    iput-object v3, p0, La/mkt0;->b:Ljava/lang/Object;

    .line 710
    .line 711
    iput-object p1, p0, La/mkt0;->a:Ljava/lang/Object;

    .line 712
    .line 713
    iput-object p2, p0, La/mkt0;->c:Ljava/lang/Object;

    .line 714
    .line 715
    iget p1, p1, La/zyw0;->a:I

    .line 716
    .line 717
    invoke-static {p1}, La/rkt0;->h(I)La/rkt0;

    .line 718
    .line 719
    .line 720
    move-result-object p1

    .line 721
    iput-object p1, p0, La/mkt0;->b:Ljava/lang/Object;

    .line 722
    .line 723
    invoke-virtual {p0}, La/mkt0;->c()La/uyw0;

    .line 724
    .line 725
    .line 726
    move-result-object p0

    .line 727
    return-object p0

    .line 728
    :pswitch_5
    check-cast p1, La/muw0;

    .line 729
    .line 730
    iget-object p0, p1, La/muw0;->a:La/fhn;

    .line 731
    .line 732
    invoke-static {v2}, La/rkt0;->h(I)La/rkt0;

    .line 733
    .line 734
    .line 735
    move-result-object p1

    .line 736
    invoke-static {p0, p1, p2}, La/cuw0;->v(La/fhn;La/rkt0;Ljava/lang/Integer;)La/cuw0;

    .line 737
    .line 738
    .line 739
    move-result-object p0

    .line 740
    return-object p0

    .line 741
    :pswitch_6
    check-cast p1, La/xtw0;

    .line 742
    .line 743
    invoke-static {v2}, La/rkt0;->h(I)La/rkt0;

    .line 744
    .line 745
    .line 746
    move-result-object p0

    .line 747
    invoke-static {p1, p0, p2}, La/qtw0;->v(La/xtw0;La/rkt0;Ljava/lang/Integer;)La/qtw0;

    .line 748
    .line 749
    .line 750
    move-result-object p0

    .line 751
    return-object p0

    .line 752
    :pswitch_7
    check-cast p1, La/tsw0;

    .line 753
    .line 754
    invoke-static {p1, p2}, La/usw0;->v(La/tsw0;Ljava/lang/Integer;)La/usw0;

    .line 755
    .line 756
    .line 757
    move-result-object p0

    .line 758
    return-object p0

    .line 759
    :pswitch_8
    check-cast p1, La/msw0;

    .line 760
    .line 761
    invoke-static {p1, p2}, La/osw0;->v(La/msw0;Ljava/lang/Integer;)La/osw0;

    .line 762
    .line 763
    .line 764
    move-result-object p0

    .line 765
    return-object p0

    .line 766
    :pswitch_9
    check-cast p1, La/vrw0;

    .line 767
    .line 768
    iget-object p0, p1, La/vrw0;->a:La/y60;

    .line 769
    .line 770
    invoke-static {v2}, La/rkt0;->h(I)La/rkt0;

    .line 771
    .line 772
    .line 773
    move-result-object p1

    .line 774
    invoke-static {p0, p1, p2}, La/trw0;->v(La/y60;La/rkt0;Ljava/lang/Integer;)La/trw0;

    .line 775
    .line 776
    .line 777
    move-result-object p0

    .line 778
    return-object p0

    .line 779
    :pswitch_a
    check-cast p1, La/srw0;

    .line 780
    .line 781
    new-instance p0, La/mpt0;

    .line 782
    .line 783
    invoke-direct {p0, v1}, La/mpt0;-><init>(B)V

    .line 784
    .line 785
    .line 786
    iput-object v3, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 787
    .line 788
    iput-object p1, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 789
    .line 790
    iput-object p2, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 791
    .line 792
    iget p1, p1, La/srw0;->a:I

    .line 793
    .line 794
    invoke-static {p1}, La/rkt0;->h(I)La/rkt0;

    .line 795
    .line 796
    .line 797
    move-result-object p1

    .line 798
    iput-object p1, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 799
    .line 800
    invoke-virtual {p0}, La/mpt0;->b()La/nrw0;

    .line 801
    .line 802
    .line 803
    move-result-object p0

    .line 804
    return-object p0

    .line 805
    :pswitch_b
    check-cast p1, La/mrw0;

    .line 806
    .line 807
    iget p0, p1, La/mrw0;->a:I

    .line 808
    .line 809
    if-eq p0, v0, :cond_13

    .line 810
    .line 811
    new-instance v0, La/cmt0;

    .line 812
    .line 813
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 814
    .line 815
    .line 816
    iput-object v3, v0, La/cmt0;->b:Ljava/lang/Object;

    .line 817
    .line 818
    iput-object p1, v0, La/cmt0;->a:Ljava/lang/Object;

    .line 819
    .line 820
    iput-object p2, v0, La/cmt0;->c:Ljava/lang/Object;

    .line 821
    .line 822
    invoke-static {p0}, La/rkt0;->h(I)La/rkt0;

    .line 823
    .line 824
    .line 825
    move-result-object p0

    .line 826
    iput-object p0, v0, La/cmt0;->b:Ljava/lang/Object;

    .line 827
    .line 828
    invoke-virtual {v0}, La/cmt0;->d()La/krw0;

    .line 829
    .line 830
    .line 831
    move-result-object v3

    .line 832
    goto :goto_7

    .line 833
    :cond_13
    const-string p0, "192 bit AES GCM Parameters are not valid"

    .line 834
    .line 835
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    :goto_7
    return-object v3

    .line 839
    :pswitch_c
    check-cast p1, La/jrw0;

    .line 840
    .line 841
    iget p0, p1, La/jrw0;->a:I

    .line 842
    .line 843
    if-eq p0, v0, :cond_14

    .line 844
    .line 845
    new-instance v0, La/l8w0;

    .line 846
    .line 847
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 848
    .line 849
    .line 850
    iput-object v3, v0, La/l8w0;->b:Ljava/lang/Object;

    .line 851
    .line 852
    iput-object p1, v0, La/l8w0;->a:Ljava/lang/Object;

    .line 853
    .line 854
    iput-object p2, v0, La/l8w0;->c:Ljava/lang/Object;

    .line 855
    .line 856
    invoke-static {p0}, La/rkt0;->h(I)La/rkt0;

    .line 857
    .line 858
    .line 859
    move-result-object p0

    .line 860
    iput-object p0, v0, La/l8w0;->b:Ljava/lang/Object;

    .line 861
    .line 862
    invoke-virtual {v0}, La/l8w0;->c()La/crw0;

    .line 863
    .line 864
    .line 865
    move-result-object v3

    .line 866
    goto :goto_8

    .line 867
    :cond_14
    const-string p0, "192 bit AES EAX Parameters are not valid"

    .line 868
    .line 869
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 870
    .line 871
    .line 872
    :goto_8
    return-object v3

    .line 873
    :pswitch_d
    check-cast p1, La/brw0;

    .line 874
    .line 875
    iget p0, p1, La/brw0;->a:I

    .line 876
    .line 877
    const/16 v0, 0x10

    .line 878
    .line 879
    if-eq p0, v0, :cond_16

    .line 880
    .line 881
    if-ne p0, v2, :cond_15

    .line 882
    .line 883
    goto :goto_9

    .line 884
    :cond_15
    const-string p0, "AES key size must be 16 or 32 bytes"

    .line 885
    .line 886
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto :goto_a

    .line 890
    :cond_16
    :goto_9
    new-instance v0, La/h0q0;

    .line 891
    .line 892
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 893
    .line 894
    .line 895
    iput-object v3, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 896
    .line 897
    iput-object v3, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 898
    .line 899
    iput-object p1, v0, La/h0q0;->a:Ljava/lang/Object;

    .line 900
    .line 901
    iput-object p2, v0, La/h0q0;->d:Ljava/lang/Object;

    .line 902
    .line 903
    invoke-static {p0}, La/rkt0;->h(I)La/rkt0;

    .line 904
    .line 905
    .line 906
    move-result-object p0

    .line 907
    iput-object p0, v0, La/h0q0;->b:Ljava/lang/Object;

    .line 908
    .line 909
    iget p0, p1, La/brw0;->b:I

    .line 910
    .line 911
    invoke-static {p0}, La/rkt0;->h(I)La/rkt0;

    .line 912
    .line 913
    .line 914
    move-result-object p0

    .line 915
    iput-object p0, v0, La/h0q0;->c:Ljava/lang/Object;

    .line 916
    .line 917
    invoke-virtual {v0}, La/h0q0;->C()La/uqw0;

    .line 918
    .line 919
    .line 920
    move-result-object v3

    .line 921
    :goto_a
    return-object v3

    .line 922
    nop

    .line 923
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
