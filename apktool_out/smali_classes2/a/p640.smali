.class public final La/p640;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p2h0;


# static fields
.field public static final j:[I

.field public static final k:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:La/y3;

.field public final d:[I

.field public final e:I

.field public final f:La/em50;

.field public final g:La/cd00;

.field public final h:La/aet0;

.field public final i:La/yo20;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [I

    .line 3
    .line 4
    sput-object v0, La/p640;->j:[I

    .line 5
    .line 6
    :try_start_0
    new-instance v0, La/cft0;

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    invoke-direct {v0, v1}, La/cft0;-><init>(B)V

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedExceptionAction;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, Lsun/misc/Unsafe;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    sput-object v0, La/p640;->k:Lsun/misc/Unsafe;

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;La/y3;[IILa/em50;La/cd00;La/aet0;La/wso;La/yo20;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p640;->a:[I

    .line 5
    .line 6
    iput-object p2, p0, La/p640;->b:[Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p4, p0, La/p640;->d:[I

    .line 9
    .line 10
    iput p5, p0, La/p640;->e:I

    .line 11
    .line 12
    iput-object p6, p0, La/p640;->f:La/em50;

    .line 13
    .line 14
    iput-object p7, p0, La/p640;->g:La/cd00;

    .line 15
    .line 16
    iput-object p8, p0, La/p640;->h:La/aet0;

    .line 17
    .line 18
    iput-object p3, p0, La/p640;->c:La/y3;

    .line 19
    .line 20
    iput-object p10, p0, La/p640;->i:La/yo20;

    .line 21
    .line 22
    return-void
.end method

.method public static m(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    instance-of v0, p0, La/kjt;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    check-cast p0, La/kjt;

    .line 10
    .line 11
    invoke-virtual {p0}, La/kjt;->m()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_1
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static q(La/y9e0;La/em50;La/cd00;La/aet0;La/wso;La/yo20;)La/p640;
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    instance-of v1, v0, La/y9e0;

    .line 4
    .line 5
    if-eqz v1, :cond_37

    .line 6
    .line 7
    iget-object v1, v0, La/y9e0;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    const v6, 0xd800

    .line 19
    .line 20
    .line 21
    if-lt v4, v6, :cond_0

    .line 22
    .line 23
    const/4 v4, 0x1

    .line 24
    :goto_0
    add-int/lit8 v7, v4, 0x1

    .line 25
    .line 26
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 27
    .line 28
    .line 29
    move-result v4

    .line 30
    if-lt v4, v6, :cond_1

    .line 31
    .line 32
    move v4, v7

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/4 v7, 0x1

    .line 35
    :cond_1
    add-int/lit8 v4, v7, 0x1

    .line 36
    .line 37
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-lt v7, v6, :cond_3

    .line 42
    .line 43
    and-int/lit16 v7, v7, 0x1fff

    .line 44
    .line 45
    const/16 v9, 0xd

    .line 46
    .line 47
    :goto_1
    add-int/lit8 v10, v4, 0x1

    .line 48
    .line 49
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-lt v4, v6, :cond_2

    .line 54
    .line 55
    and-int/lit16 v4, v4, 0x1fff

    .line 56
    .line 57
    shl-int/2addr v4, v9

    .line 58
    or-int/2addr v7, v4

    .line 59
    add-int/lit8 v9, v9, 0xd

    .line 60
    .line 61
    move v4, v10

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    shl-int/2addr v4, v9

    .line 64
    or-int/2addr v7, v4

    .line 65
    move v4, v10

    .line 66
    :cond_3
    if-nez v7, :cond_4

    .line 67
    .line 68
    sget-object v7, La/p640;->j:[I

    .line 69
    .line 70
    move v9, v3

    .line 71
    move v10, v9

    .line 72
    move v11, v10

    .line 73
    move v14, v11

    .line 74
    move-object v13, v7

    .line 75
    move v7, v14

    .line 76
    goto/16 :goto_a

    .line 77
    .line 78
    :cond_4
    add-int/lit8 v7, v4, 0x1

    .line 79
    .line 80
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 81
    .line 82
    .line 83
    move-result v4

    .line 84
    if-lt v4, v6, :cond_6

    .line 85
    .line 86
    and-int/lit16 v4, v4, 0x1fff

    .line 87
    .line 88
    const/16 v9, 0xd

    .line 89
    .line 90
    :goto_2
    add-int/lit8 v10, v7, 0x1

    .line 91
    .line 92
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 93
    .line 94
    .line 95
    move-result v7

    .line 96
    if-lt v7, v6, :cond_5

    .line 97
    .line 98
    and-int/lit16 v7, v7, 0x1fff

    .line 99
    .line 100
    shl-int/2addr v7, v9

    .line 101
    or-int/2addr v4, v7

    .line 102
    add-int/lit8 v9, v9, 0xd

    .line 103
    .line 104
    move v7, v10

    .line 105
    goto :goto_2

    .line 106
    :cond_5
    shl-int/2addr v7, v9

    .line 107
    or-int/2addr v4, v7

    .line 108
    move v7, v10

    .line 109
    :cond_6
    add-int/lit8 v9, v7, 0x1

    .line 110
    .line 111
    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-lt v7, v6, :cond_8

    .line 116
    .line 117
    and-int/lit16 v7, v7, 0x1fff

    .line 118
    .line 119
    const/16 v10, 0xd

    .line 120
    .line 121
    :goto_3
    add-int/lit8 v11, v9, 0x1

    .line 122
    .line 123
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 124
    .line 125
    .line 126
    move-result v9

    .line 127
    if-lt v9, v6, :cond_7

    .line 128
    .line 129
    and-int/lit16 v9, v9, 0x1fff

    .line 130
    .line 131
    shl-int/2addr v9, v10

    .line 132
    or-int/2addr v7, v9

    .line 133
    add-int/lit8 v10, v10, 0xd

    .line 134
    .line 135
    move v9, v11

    .line 136
    goto :goto_3

    .line 137
    :cond_7
    shl-int/2addr v9, v10

    .line 138
    or-int/2addr v7, v9

    .line 139
    move v9, v11

    .line 140
    :cond_8
    add-int/lit8 v10, v9, 0x1

    .line 141
    .line 142
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 143
    .line 144
    .line 145
    move-result v9

    .line 146
    if-lt v9, v6, :cond_a

    .line 147
    .line 148
    :goto_4
    add-int/lit8 v9, v10, 0x1

    .line 149
    .line 150
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-lt v10, v6, :cond_9

    .line 155
    .line 156
    move v10, v9

    .line 157
    goto :goto_4

    .line 158
    :cond_9
    move v10, v9

    .line 159
    :cond_a
    add-int/lit8 v9, v10, 0x1

    .line 160
    .line 161
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 162
    .line 163
    .line 164
    move-result v10

    .line 165
    if-lt v10, v6, :cond_c

    .line 166
    .line 167
    :goto_5
    add-int/lit8 v10, v9, 0x1

    .line 168
    .line 169
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 170
    .line 171
    .line 172
    move-result v9

    .line 173
    if-lt v9, v6, :cond_b

    .line 174
    .line 175
    move v9, v10

    .line 176
    goto :goto_5

    .line 177
    :cond_b
    move v9, v10

    .line 178
    :cond_c
    add-int/lit8 v10, v9, 0x1

    .line 179
    .line 180
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    if-lt v9, v6, :cond_e

    .line 185
    .line 186
    and-int/lit16 v9, v9, 0x1fff

    .line 187
    .line 188
    const/16 v11, 0xd

    .line 189
    .line 190
    :goto_6
    add-int/lit8 v12, v10, 0x1

    .line 191
    .line 192
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 193
    .line 194
    .line 195
    move-result v10

    .line 196
    if-lt v10, v6, :cond_d

    .line 197
    .line 198
    and-int/lit16 v10, v10, 0x1fff

    .line 199
    .line 200
    shl-int/2addr v10, v11

    .line 201
    or-int/2addr v9, v10

    .line 202
    add-int/lit8 v11, v11, 0xd

    .line 203
    .line 204
    move v10, v12

    .line 205
    goto :goto_6

    .line 206
    :cond_d
    shl-int/2addr v10, v11

    .line 207
    or-int/2addr v9, v10

    .line 208
    move v10, v12

    .line 209
    :cond_e
    add-int/lit8 v11, v10, 0x1

    .line 210
    .line 211
    invoke-virtual {v1, v10}, Ljava/lang/String;->charAt(I)C

    .line 212
    .line 213
    .line 214
    move-result v10

    .line 215
    if-lt v10, v6, :cond_10

    .line 216
    .line 217
    and-int/lit16 v10, v10, 0x1fff

    .line 218
    .line 219
    const/16 v12, 0xd

    .line 220
    .line 221
    :goto_7
    add-int/lit8 v13, v11, 0x1

    .line 222
    .line 223
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 224
    .line 225
    .line 226
    move-result v11

    .line 227
    if-lt v11, v6, :cond_f

    .line 228
    .line 229
    and-int/lit16 v11, v11, 0x1fff

    .line 230
    .line 231
    shl-int/2addr v11, v12

    .line 232
    or-int/2addr v10, v11

    .line 233
    add-int/lit8 v12, v12, 0xd

    .line 234
    .line 235
    move v11, v13

    .line 236
    goto :goto_7

    .line 237
    :cond_f
    shl-int/2addr v11, v12

    .line 238
    or-int/2addr v10, v11

    .line 239
    move v11, v13

    .line 240
    :cond_10
    add-int/lit8 v12, v11, 0x1

    .line 241
    .line 242
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 243
    .line 244
    .line 245
    move-result v11

    .line 246
    if-lt v11, v6, :cond_12

    .line 247
    .line 248
    and-int/lit16 v11, v11, 0x1fff

    .line 249
    .line 250
    const/16 v13, 0xd

    .line 251
    .line 252
    :goto_8
    add-int/lit8 v14, v12, 0x1

    .line 253
    .line 254
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 255
    .line 256
    .line 257
    move-result v12

    .line 258
    if-lt v12, v6, :cond_11

    .line 259
    .line 260
    and-int/lit16 v12, v12, 0x1fff

    .line 261
    .line 262
    shl-int/2addr v12, v13

    .line 263
    or-int/2addr v11, v12

    .line 264
    add-int/lit8 v13, v13, 0xd

    .line 265
    .line 266
    move v12, v14

    .line 267
    goto :goto_8

    .line 268
    :cond_11
    shl-int/2addr v12, v13

    .line 269
    or-int/2addr v11, v12

    .line 270
    move v12, v14

    .line 271
    :cond_12
    add-int/lit8 v13, v12, 0x1

    .line 272
    .line 273
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v12

    .line 277
    if-lt v12, v6, :cond_14

    .line 278
    .line 279
    and-int/lit16 v12, v12, 0x1fff

    .line 280
    .line 281
    const/16 v14, 0xd

    .line 282
    .line 283
    :goto_9
    add-int/lit8 v15, v13, 0x1

    .line 284
    .line 285
    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    .line 286
    .line 287
    .line 288
    move-result v13

    .line 289
    if-lt v13, v6, :cond_13

    .line 290
    .line 291
    and-int/lit16 v13, v13, 0x1fff

    .line 292
    .line 293
    shl-int/2addr v13, v14

    .line 294
    or-int/2addr v12, v13

    .line 295
    add-int/lit8 v14, v14, 0xd

    .line 296
    .line 297
    move v13, v15

    .line 298
    goto :goto_9

    .line 299
    :cond_13
    shl-int/2addr v13, v14

    .line 300
    or-int/2addr v12, v13

    .line 301
    move v13, v15

    .line 302
    :cond_14
    add-int v14, v12, v10

    .line 303
    .line 304
    add-int/2addr v14, v11

    .line 305
    new-array v11, v14, [I

    .line 306
    .line 307
    mul-int/lit8 v14, v4, 0x2

    .line 308
    .line 309
    add-int/2addr v14, v7

    .line 310
    move v7, v4

    .line 311
    move v4, v13

    .line 312
    move-object v13, v11

    .line 313
    move v11, v14

    .line 314
    move v14, v12

    .line 315
    :goto_a
    iget-object v12, v0, La/y9e0;->c:[Ljava/lang/Object;

    .line 316
    .line 317
    iget-object v15, v0, La/y9e0;->a:La/y3;

    .line 318
    .line 319
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    move-result-object v15

    .line 323
    mul-int/lit8 v3, v9, 0x3

    .line 324
    .line 325
    new-array v3, v3, [I

    .line 326
    .line 327
    const/4 v8, 0x2

    .line 328
    mul-int/2addr v9, v8

    .line 329
    new-array v9, v9, [Ljava/lang/Object;

    .line 330
    .line 331
    add-int/2addr v10, v14

    .line 332
    move/from16 v20, v14

    .line 333
    .line 334
    const/4 v8, 0x0

    .line 335
    const/16 v18, 0x0

    .line 336
    .line 337
    :goto_b
    if-ge v4, v2, :cond_36

    .line 338
    .line 339
    add-int/lit8 v21, v4, 0x1

    .line 340
    .line 341
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 342
    .line 343
    .line 344
    move-result v4

    .line 345
    if-lt v4, v6, :cond_16

    .line 346
    .line 347
    and-int/lit16 v4, v4, 0x1fff

    .line 348
    .line 349
    move/from16 v5, v21

    .line 350
    .line 351
    const/16 v21, 0xd

    .line 352
    .line 353
    :goto_c
    add-int/lit8 v23, v5, 0x1

    .line 354
    .line 355
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    if-lt v5, v6, :cond_15

    .line 360
    .line 361
    and-int/lit16 v5, v5, 0x1fff

    .line 362
    .line 363
    shl-int v5, v5, v21

    .line 364
    .line 365
    or-int/2addr v4, v5

    .line 366
    add-int/lit8 v21, v21, 0xd

    .line 367
    .line 368
    move/from16 v5, v23

    .line 369
    .line 370
    goto :goto_c

    .line 371
    :cond_15
    shl-int v5, v5, v21

    .line 372
    .line 373
    or-int/2addr v4, v5

    .line 374
    move/from16 v5, v23

    .line 375
    .line 376
    goto :goto_d

    .line 377
    :cond_16
    move/from16 v5, v21

    .line 378
    .line 379
    :goto_d
    add-int/lit8 v21, v5, 0x1

    .line 380
    .line 381
    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    if-lt v5, v6, :cond_18

    .line 386
    .line 387
    and-int/lit16 v5, v5, 0x1fff

    .line 388
    .line 389
    move/from16 v6, v21

    .line 390
    .line 391
    const/16 v21, 0xd

    .line 392
    .line 393
    :goto_e
    add-int/lit8 v24, v6, 0x1

    .line 394
    .line 395
    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    move/from16 v25, v2

    .line 400
    .line 401
    const v2, 0xd800

    .line 402
    .line 403
    .line 404
    if-lt v6, v2, :cond_17

    .line 405
    .line 406
    and-int/lit16 v2, v6, 0x1fff

    .line 407
    .line 408
    shl-int v2, v2, v21

    .line 409
    .line 410
    or-int/2addr v5, v2

    .line 411
    add-int/lit8 v21, v21, 0xd

    .line 412
    .line 413
    move/from16 v6, v24

    .line 414
    .line 415
    move/from16 v2, v25

    .line 416
    .line 417
    goto :goto_e

    .line 418
    :cond_17
    shl-int v2, v6, v21

    .line 419
    .line 420
    or-int/2addr v5, v2

    .line 421
    move/from16 v2, v24

    .line 422
    .line 423
    goto :goto_f

    .line 424
    :cond_18
    move/from16 v25, v2

    .line 425
    .line 426
    move/from16 v2, v21

    .line 427
    .line 428
    :goto_f
    and-int/lit16 v6, v5, 0xff

    .line 429
    .line 430
    move-object/from16 v21, v3

    .line 431
    .line 432
    and-int/lit16 v3, v5, 0x400

    .line 433
    .line 434
    if-eqz v3, :cond_19

    .line 435
    .line 436
    add-int/lit8 v3, v18, 0x1

    .line 437
    .line 438
    aput v8, v13, v18

    .line 439
    .line 440
    move/from16 v18, v3

    .line 441
    .line 442
    :cond_19
    sget-object v3, La/p640;->k:Lsun/misc/Unsafe;

    .line 443
    .line 444
    move/from16 v28, v4

    .line 445
    .line 446
    const/16 v4, 0x33

    .line 447
    .line 448
    if-lt v6, v4, :cond_23

    .line 449
    .line 450
    add-int/lit8 v4, v2, 0x1

    .line 451
    .line 452
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    move/from16 v26, v4

    .line 457
    .line 458
    const v4, 0xd800

    .line 459
    .line 460
    .line 461
    if-lt v2, v4, :cond_1b

    .line 462
    .line 463
    and-int/lit16 v2, v2, 0x1fff

    .line 464
    .line 465
    move/from16 v4, v26

    .line 466
    .line 467
    const/16 v26, 0xd

    .line 468
    .line 469
    :goto_10
    add-int/lit8 v29, v4, 0x1

    .line 470
    .line 471
    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    .line 472
    .line 473
    .line 474
    move-result v4

    .line 475
    move/from16 v30, v2

    .line 476
    .line 477
    const v2, 0xd800

    .line 478
    .line 479
    .line 480
    if-lt v4, v2, :cond_1a

    .line 481
    .line 482
    and-int/lit16 v2, v4, 0x1fff

    .line 483
    .line 484
    shl-int v2, v2, v26

    .line 485
    .line 486
    or-int v2, v30, v2

    .line 487
    .line 488
    add-int/lit8 v26, v26, 0xd

    .line 489
    .line 490
    move/from16 v4, v29

    .line 491
    .line 492
    goto :goto_10

    .line 493
    :cond_1a
    shl-int v2, v4, v26

    .line 494
    .line 495
    or-int v2, v30, v2

    .line 496
    .line 497
    move/from16 v4, v29

    .line 498
    .line 499
    goto :goto_11

    .line 500
    :cond_1b
    move/from16 v4, v26

    .line 501
    .line 502
    :goto_11
    move/from16 v26, v2

    .line 503
    .line 504
    add-int/lit8 v2, v6, -0x33

    .line 505
    .line 506
    move/from16 v29, v4

    .line 507
    .line 508
    const/16 v4, 0x9

    .line 509
    .line 510
    if-eq v2, v4, :cond_1c

    .line 511
    .line 512
    const/16 v4, 0x11

    .line 513
    .line 514
    if-ne v2, v4, :cond_1d

    .line 515
    .line 516
    :cond_1c
    move/from16 v30, v7

    .line 517
    .line 518
    const/4 v2, 0x3

    .line 519
    const/4 v4, 0x1

    .line 520
    const/4 v7, 0x2

    .line 521
    goto :goto_14

    .line 522
    :cond_1d
    const/16 v4, 0xc

    .line 523
    .line 524
    if-ne v2, v4, :cond_20

    .line 525
    .line 526
    invoke-virtual {v0}, La/y9e0;->a()I

    .line 527
    .line 528
    .line 529
    move-result v2

    .line 530
    const/4 v4, 0x1

    .line 531
    invoke-static {v2, v4}, La/hne;->b(II)Z

    .line 532
    .line 533
    .line 534
    move-result v2

    .line 535
    if-nez v2, :cond_1e

    .line 536
    .line 537
    and-int/lit16 v2, v5, 0x800

    .line 538
    .line 539
    if-eqz v2, :cond_1f

    .line 540
    .line 541
    :cond_1e
    move/from16 v30, v7

    .line 542
    .line 543
    const/4 v2, 0x3

    .line 544
    const/4 v7, 0x2

    .line 545
    goto :goto_13

    .line 546
    :cond_1f
    :goto_12
    move/from16 v30, v7

    .line 547
    .line 548
    const/4 v7, 0x2

    .line 549
    goto :goto_15

    .line 550
    :goto_13
    invoke-static {v8, v2, v7, v4}, La/f140;->b(IIII)I

    .line 551
    .line 552
    .line 553
    move-result v2

    .line 554
    add-int/lit8 v19, v11, 0x1

    .line 555
    .line 556
    aget-object v11, v12, v11

    .line 557
    .line 558
    aput-object v11, v9, v2

    .line 559
    .line 560
    move/from16 v11, v19

    .line 561
    .line 562
    goto :goto_15

    .line 563
    :cond_20
    const/4 v4, 0x1

    .line 564
    goto :goto_12

    .line 565
    :goto_14
    invoke-static {v8, v2, v7, v4}, La/f140;->b(IIII)I

    .line 566
    .line 567
    .line 568
    move-result v2

    .line 569
    add-int/lit8 v4, v11, 0x1

    .line 570
    .line 571
    aget-object v11, v12, v11

    .line 572
    .line 573
    aput-object v11, v9, v2

    .line 574
    .line 575
    move v11, v4

    .line 576
    :goto_15
    mul-int/lit8 v2, v26, 0x2

    .line 577
    .line 578
    aget-object v4, v12, v2

    .line 579
    .line 580
    instance-of v7, v4, Ljava/lang/reflect/Field;

    .line 581
    .line 582
    if-eqz v7, :cond_21

    .line 583
    .line 584
    check-cast v4, Ljava/lang/reflect/Field;

    .line 585
    .line 586
    :goto_16
    move-object v7, v9

    .line 587
    move/from16 v26, v10

    .line 588
    .line 589
    goto :goto_17

    .line 590
    :cond_21
    check-cast v4, Ljava/lang/String;

    .line 591
    .line 592
    invoke-static {v15, v4}, La/p640;->t(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 593
    .line 594
    .line 595
    move-result-object v4

    .line 596
    aput-object v4, v12, v2

    .line 597
    .line 598
    goto :goto_16

    .line 599
    :goto_17
    invoke-virtual {v3, v4}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 600
    .line 601
    .line 602
    move-result-wide v9

    .line 603
    long-to-int v4, v9

    .line 604
    add-int/lit8 v2, v2, 0x1

    .line 605
    .line 606
    aget-object v9, v12, v2

    .line 607
    .line 608
    instance-of v10, v9, Ljava/lang/reflect/Field;

    .line 609
    .line 610
    if-eqz v10, :cond_22

    .line 611
    .line 612
    check-cast v9, Ljava/lang/reflect/Field;

    .line 613
    .line 614
    goto :goto_18

    .line 615
    :cond_22
    check-cast v9, Ljava/lang/String;

    .line 616
    .line 617
    invoke-static {v15, v9}, La/p640;->t(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 618
    .line 619
    .line 620
    move-result-object v9

    .line 621
    aput-object v9, v12, v2

    .line 622
    .line 623
    :goto_18
    invoke-virtual {v3, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 624
    .line 625
    .line 626
    move-result-wide v2

    .line 627
    long-to-int v2, v2

    .line 628
    move v3, v2

    .line 629
    move-object/from16 v22, v7

    .line 630
    .line 631
    move/from16 v24, v29

    .line 632
    .line 633
    const/4 v2, 0x0

    .line 634
    const v10, 0xd800

    .line 635
    .line 636
    .line 637
    const/16 v19, 0x2

    .line 638
    .line 639
    goto/16 :goto_25

    .line 640
    .line 641
    :cond_23
    move/from16 v30, v7

    .line 642
    .line 643
    move-object v7, v9

    .line 644
    move/from16 v26, v10

    .line 645
    .line 646
    add-int/lit8 v4, v11, 0x1

    .line 647
    .line 648
    aget-object v9, v12, v11

    .line 649
    .line 650
    check-cast v9, Ljava/lang/String;

    .line 651
    .line 652
    invoke-static {v15, v9}, La/p640;->t(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 653
    .line 654
    .line 655
    move-result-object v9

    .line 656
    const/16 v10, 0x9

    .line 657
    .line 658
    if-eq v6, v10, :cond_24

    .line 659
    .line 660
    const/16 v10, 0x11

    .line 661
    .line 662
    if-ne v6, v10, :cond_25

    .line 663
    .line 664
    :cond_24
    move/from16 v24, v4

    .line 665
    .line 666
    move-object/from16 v22, v7

    .line 667
    .line 668
    const/4 v4, 0x1

    .line 669
    const/4 v7, 0x2

    .line 670
    const/4 v10, 0x3

    .line 671
    goto/16 :goto_1d

    .line 672
    .line 673
    :cond_25
    const/16 v10, 0x1b

    .line 674
    .line 675
    if-eq v6, v10, :cond_26

    .line 676
    .line 677
    const/16 v10, 0x31

    .line 678
    .line 679
    if-ne v6, v10, :cond_27

    .line 680
    .line 681
    :cond_26
    move/from16 v24, v4

    .line 682
    .line 683
    move-object/from16 v22, v7

    .line 684
    .line 685
    const/4 v4, 0x1

    .line 686
    const/4 v7, 0x2

    .line 687
    const/4 v10, 0x3

    .line 688
    goto/16 :goto_1c

    .line 689
    .line 690
    :cond_27
    const/16 v10, 0xc

    .line 691
    .line 692
    if-eq v6, v10, :cond_2b

    .line 693
    .line 694
    const/16 v10, 0x1e

    .line 695
    .line 696
    if-eq v6, v10, :cond_2b

    .line 697
    .line 698
    const/16 v10, 0x2c

    .line 699
    .line 700
    if-ne v6, v10, :cond_28

    .line 701
    .line 702
    goto :goto_1a

    .line 703
    :cond_28
    const/16 v10, 0x32

    .line 704
    .line 705
    if-ne v6, v10, :cond_2a

    .line 706
    .line 707
    add-int/lit8 v10, v20, 0x1

    .line 708
    .line 709
    aput v8, v13, v20

    .line 710
    .line 711
    div-int/lit8 v20, v8, 0x3

    .line 712
    .line 713
    const/16 v19, 0x2

    .line 714
    .line 715
    mul-int/lit8 v20, v20, 0x2

    .line 716
    .line 717
    add-int/lit8 v24, v11, 0x2

    .line 718
    .line 719
    aget-object v4, v12, v4

    .line 720
    .line 721
    aput-object v4, v7, v20

    .line 722
    .line 723
    and-int/lit16 v4, v5, 0x800

    .line 724
    .line 725
    if-eqz v4, :cond_29

    .line 726
    .line 727
    add-int/lit8 v20, v20, 0x1

    .line 728
    .line 729
    add-int/lit8 v4, v11, 0x3

    .line 730
    .line 731
    aget-object v11, v12, v24

    .line 732
    .line 733
    aput-object v11, v7, v20

    .line 734
    .line 735
    move v11, v4

    .line 736
    move-object/from16 v22, v7

    .line 737
    .line 738
    move/from16 v20, v10

    .line 739
    .line 740
    :goto_19
    const/4 v4, 0x1

    .line 741
    goto :goto_1f

    .line 742
    :cond_29
    move-object/from16 v22, v7

    .line 743
    .line 744
    move/from16 v20, v10

    .line 745
    .line 746
    move/from16 v11, v24

    .line 747
    .line 748
    goto :goto_19

    .line 749
    :cond_2a
    move/from16 v24, v4

    .line 750
    .line 751
    move-object/from16 v22, v7

    .line 752
    .line 753
    const/4 v4, 0x1

    .line 754
    goto :goto_1e

    .line 755
    :cond_2b
    :goto_1a
    invoke-virtual {v0}, La/y9e0;->a()I

    .line 756
    .line 757
    .line 758
    move-result v10

    .line 759
    move/from16 v24, v4

    .line 760
    .line 761
    const/4 v4, 0x1

    .line 762
    if-eq v10, v4, :cond_2c

    .line 763
    .line 764
    and-int/lit16 v10, v5, 0x800

    .line 765
    .line 766
    if-eqz v10, :cond_2d

    .line 767
    .line 768
    :cond_2c
    move-object/from16 v22, v7

    .line 769
    .line 770
    const/4 v7, 0x2

    .line 771
    const/4 v10, 0x3

    .line 772
    goto :goto_1b

    .line 773
    :cond_2d
    move-object/from16 v22, v7

    .line 774
    .line 775
    goto :goto_1e

    .line 776
    :goto_1b
    invoke-static {v8, v10, v7, v4}, La/f140;->b(IIII)I

    .line 777
    .line 778
    .line 779
    move-result v10

    .line 780
    add-int/lit8 v11, v11, 0x2

    .line 781
    .line 782
    aget-object v19, v12, v24

    .line 783
    .line 784
    aput-object v19, v22, v10

    .line 785
    .line 786
    goto :goto_1f

    .line 787
    :goto_1c
    invoke-static {v8, v10, v7, v4}, La/f140;->b(IIII)I

    .line 788
    .line 789
    .line 790
    move-result v10

    .line 791
    add-int/lit8 v11, v11, 0x2

    .line 792
    .line 793
    aget-object v19, v12, v24

    .line 794
    .line 795
    aput-object v19, v22, v10

    .line 796
    .line 797
    goto :goto_1f

    .line 798
    :goto_1d
    invoke-static {v8, v10, v7, v4}, La/f140;->b(IIII)I

    .line 799
    .line 800
    .line 801
    move-result v10

    .line 802
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    move-result-object v7

    .line 806
    aput-object v7, v22, v10

    .line 807
    .line 808
    :goto_1e
    move/from16 v11, v24

    .line 809
    .line 810
    :goto_1f
    invoke-virtual {v3, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 811
    .line 812
    .line 813
    move-result-wide v9

    .line 814
    long-to-int v7, v9

    .line 815
    and-int/lit16 v9, v5, 0x1000

    .line 816
    .line 817
    if-eqz v9, :cond_31

    .line 818
    .line 819
    const/16 v10, 0x11

    .line 820
    .line 821
    if-gt v6, v10, :cond_31

    .line 822
    .line 823
    add-int/lit8 v9, v2, 0x1

    .line 824
    .line 825
    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    .line 826
    .line 827
    .line 828
    move-result v2

    .line 829
    const v10, 0xd800

    .line 830
    .line 831
    .line 832
    if-lt v2, v10, :cond_2f

    .line 833
    .line 834
    and-int/lit16 v2, v2, 0x1fff

    .line 835
    .line 836
    const/16 v23, 0xd

    .line 837
    .line 838
    :goto_20
    add-int/lit8 v24, v9, 0x1

    .line 839
    .line 840
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    .line 841
    .line 842
    .line 843
    move-result v9

    .line 844
    if-lt v9, v10, :cond_2e

    .line 845
    .line 846
    and-int/lit16 v9, v9, 0x1fff

    .line 847
    .line 848
    shl-int v9, v9, v23

    .line 849
    .line 850
    or-int/2addr v2, v9

    .line 851
    add-int/lit8 v23, v23, 0xd

    .line 852
    .line 853
    move/from16 v9, v24

    .line 854
    .line 855
    goto :goto_20

    .line 856
    :cond_2e
    shl-int v9, v9, v23

    .line 857
    .line 858
    or-int/2addr v2, v9

    .line 859
    :goto_21
    const/16 v19, 0x2

    .line 860
    .line 861
    goto :goto_22

    .line 862
    :cond_2f
    move/from16 v24, v9

    .line 863
    .line 864
    goto :goto_21

    .line 865
    :goto_22
    mul-int/lit8 v9, v30, 0x2

    .line 866
    .line 867
    div-int/lit8 v23, v2, 0x20

    .line 868
    .line 869
    add-int v23, v23, v9

    .line 870
    .line 871
    aget-object v9, v12, v23

    .line 872
    .line 873
    instance-of v4, v9, Ljava/lang/reflect/Field;

    .line 874
    .line 875
    if-eqz v4, :cond_30

    .line 876
    .line 877
    check-cast v9, Ljava/lang/reflect/Field;

    .line 878
    .line 879
    goto :goto_23

    .line 880
    :cond_30
    check-cast v9, Ljava/lang/String;

    .line 881
    .line 882
    invoke-static {v15, v9}, La/p640;->t(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 883
    .line 884
    .line 885
    move-result-object v9

    .line 886
    aput-object v9, v12, v23

    .line 887
    .line 888
    :goto_23
    invoke-virtual {v3, v9}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    .line 889
    .line 890
    .line 891
    move-result-wide v3

    .line 892
    long-to-int v3, v3

    .line 893
    rem-int/lit8 v2, v2, 0x20

    .line 894
    .line 895
    goto :goto_24

    .line 896
    :cond_31
    const v10, 0xd800

    .line 897
    .line 898
    .line 899
    const/16 v19, 0x2

    .line 900
    .line 901
    const v3, 0xfffff

    .line 902
    .line 903
    .line 904
    move/from16 v24, v2

    .line 905
    .line 906
    const/4 v2, 0x0

    .line 907
    :goto_24
    const/16 v4, 0x12

    .line 908
    .line 909
    if-lt v6, v4, :cond_32

    .line 910
    .line 911
    const/16 v4, 0x31

    .line 912
    .line 913
    if-gt v6, v4, :cond_32

    .line 914
    .line 915
    add-int/lit8 v4, v26, 0x1

    .line 916
    .line 917
    aput v7, v13, v26

    .line 918
    .line 919
    move/from16 v26, v4

    .line 920
    .line 921
    :cond_32
    move v4, v7

    .line 922
    :goto_25
    add-int/lit8 v7, v8, 0x1

    .line 923
    .line 924
    aput v28, v21, v8

    .line 925
    .line 926
    add-int/lit8 v9, v8, 0x2

    .line 927
    .line 928
    and-int/lit16 v10, v5, 0x200

    .line 929
    .line 930
    if-eqz v10, :cond_33

    .line 931
    .line 932
    const/high16 v10, 0x20000000

    .line 933
    .line 934
    goto :goto_26

    .line 935
    :cond_33
    const/4 v10, 0x0

    .line 936
    :goto_26
    move-object/from16 v27, v1

    .line 937
    .line 938
    and-int/lit16 v1, v5, 0x100

    .line 939
    .line 940
    if-eqz v1, :cond_34

    .line 941
    .line 942
    const/high16 v1, 0x10000000

    .line 943
    .line 944
    goto :goto_27

    .line 945
    :cond_34
    const/4 v1, 0x0

    .line 946
    :goto_27
    or-int/2addr v1, v10

    .line 947
    and-int/lit16 v5, v5, 0x800

    .line 948
    .line 949
    if-eqz v5, :cond_35

    .line 950
    .line 951
    const/high16 v5, -0x80000000

    .line 952
    .line 953
    goto :goto_28

    .line 954
    :cond_35
    const/4 v5, 0x0

    .line 955
    :goto_28
    or-int/2addr v1, v5

    .line 956
    shl-int/lit8 v5, v6, 0x14

    .line 957
    .line 958
    or-int/2addr v1, v5

    .line 959
    or-int/2addr v1, v4

    .line 960
    aput v1, v21, v7

    .line 961
    .line 962
    add-int/lit8 v8, v8, 0x3

    .line 963
    .line 964
    shl-int/lit8 v1, v2, 0x14

    .line 965
    .line 966
    or-int/2addr v1, v3

    .line 967
    aput v1, v21, v9

    .line 968
    .line 969
    move-object/from16 v3, v21

    .line 970
    .line 971
    move-object/from16 v9, v22

    .line 972
    .line 973
    move/from16 v4, v24

    .line 974
    .line 975
    move/from16 v2, v25

    .line 976
    .line 977
    move/from16 v10, v26

    .line 978
    .line 979
    move-object/from16 v1, v27

    .line 980
    .line 981
    move/from16 v7, v30

    .line 982
    .line 983
    const v6, 0xd800

    .line 984
    .line 985
    .line 986
    goto/16 :goto_b

    .line 987
    .line 988
    :cond_36
    move-object/from16 v21, v3

    .line 989
    .line 990
    move-object/from16 v22, v9

    .line 991
    .line 992
    new-instance v9, La/p640;

    .line 993
    .line 994
    iget-object v12, v0, La/y9e0;->a:La/y3;

    .line 995
    .line 996
    move-object/from16 v15, p1

    .line 997
    .line 998
    move-object/from16 v16, p2

    .line 999
    .line 1000
    move-object/from16 v17, p3

    .line 1001
    .line 1002
    move-object/from16 v18, p4

    .line 1003
    .line 1004
    move-object/from16 v19, p5

    .line 1005
    .line 1006
    move-object/from16 v10, v21

    .line 1007
    .line 1008
    move-object/from16 v11, v22

    .line 1009
    .line 1010
    invoke-direct/range {v9 .. v19}, La/p640;-><init>([I[Ljava/lang/Object;La/y3;[IILa/em50;La/cd00;La/aet0;La/wso;La/yo20;)V

    .line 1011
    .line 1012
    .line 1013
    return-object v9

    .line 1014
    :cond_37
    invoke-static {}, La/hny;->b()V

    .line 1015
    .line 1016
    .line 1017
    const/4 v0, 0x0

    .line 1018
    return-object v0
.end method

.method public static r(Ljava/lang/Object;J)I
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Integer;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method

.method public static s(Ljava/lang/Object;J)J
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/lang/Long;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
.end method

.method public static t(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    array-length v1, v0

    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v1, :cond_1

    .line 13
    .line 14
    aget-object v3, v0, v2

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    return-object v3

    .line 27
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    const-string v2, "Field "

    .line 33
    .line 34
    const-string v3, " for "

    .line 35
    .line 36
    invoke-static {v2, p1, v3}, La/kng0;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, " not found. Known fields are "

    .line 48
    .line 49
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    throw v1
.end method

.method public static v(I)I
    .locals 1

    .line 1
    const/high16 v0, 0xff00000

    .line 2
    .line 3
    and-int/2addr p0, v0

    .line 4
    ushr-int/lit8 p0, p0, 0x14

    .line 5
    .line 6
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 11

    .line 1
    invoke-static {p1}, La/p640;->m(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget-object v1, p0, La/p640;->a:[I

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-ge v0, v2, :cond_4

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/p640;->w(I)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const v3, 0xfffff

    .line 21
    .line 22
    .line 23
    and-int v4, v2, v3

    .line 24
    .line 25
    int-to-long v7, v4

    .line 26
    aget v4, v1, v0

    .line 27
    .line 28
    invoke-static {v2}, La/p640;->v(I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    packed-switch v2, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    goto :goto_1

    .line 36
    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, La/p640;->p(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_1
    move-object v6, p1

    .line 40
    goto/16 :goto_2

    .line 41
    .line 42
    :pswitch_1
    invoke-virtual {p0, v4, v0, p2}, La/p640;->n(IILjava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-static {p1, v7, v8, v2}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v0, 0x2

    .line 56
    .line 57
    aget v1, v1, v2

    .line 58
    .line 59
    and-int/2addr v1, v3

    .line 60
    int-to-long v1, v1

    .line 61
    invoke-static {p1, v4, v1, v2}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, La/p640;->p(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :pswitch_3
    invoke-virtual {p0, v4, v0, p2}, La/p640;->n(IILjava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_0

    .line 74
    .line 75
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-static {p1, v7, v8, v2}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v2, v0, 0x2

    .line 83
    .line 84
    aget v1, v1, v2

    .line 85
    .line 86
    and-int/2addr v1, v3

    .line 87
    int-to-long v1, v1

    .line 88
    invoke-static {p1, v4, v1, v2}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :pswitch_4
    sget-object v1, La/x2h0;->a:Ljava/lang/Class;

    .line 93
    .line 94
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v1

    .line 98
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    iget-object v3, p0, La/p640;->i:La/yo20;

    .line 103
    .line 104
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    check-cast v1, La/vo20;

    .line 108
    .line 109
    check-cast v2, La/vo20;

    .line 110
    .line 111
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 112
    .line 113
    .line 114
    move-result v3

    .line 115
    if-nez v3, :cond_2

    .line 116
    .line 117
    iget-boolean v3, v1, La/vo20;->a:Z

    .line 118
    .line 119
    if-nez v3, :cond_1

    .line 120
    .line 121
    invoke-virtual {v1}, La/vo20;->d()La/vo20;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :cond_1
    invoke-virtual {v1}, La/vo20;->b()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_2

    .line 133
    .line 134
    invoke-virtual {v1, v2}, La/vo20;->putAll(Ljava/util/Map;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    invoke-static {p1, v7, v8, v1}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 138
    .line 139
    .line 140
    goto :goto_1

    .line 141
    :pswitch_5
    iget-object v1, p0, La/p640;->g:La/cd00;

    .line 142
    .line 143
    invoke-virtual {v1, p1, v7, v8, p2}, La/cd00;->b(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    goto :goto_1

    .line 147
    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, La/p640;->o(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    goto :goto_1

    .line 151
    :pswitch_7
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v1

    .line 155
    if-eqz v1, :cond_0

    .line 156
    .line 157
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v9

    .line 161
    sget-object v1, La/ift0;->c:La/gft0;

    .line 162
    .line 163
    iget-object v5, v1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 164
    .line 165
    move-object v6, p1

    .line 166
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    goto/16 :goto_2

    .line 173
    .line 174
    :pswitch_8
    move-object v6, p1

    .line 175
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result p1

    .line 179
    if-eqz p1, :cond_3

    .line 180
    .line 181
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result p1

    .line 185
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    goto/16 :goto_2

    .line 192
    .line 193
    :pswitch_9
    move-object v6, p1

    .line 194
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    if-eqz p1, :cond_3

    .line 199
    .line 200
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 201
    .line 202
    .line 203
    move-result-wide v9

    .line 204
    sget-object p1, La/ift0;->c:La/gft0;

    .line 205
    .line 206
    iget-object v5, p1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 207
    .line 208
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    goto/16 :goto_2

    .line 215
    .line 216
    :pswitch_a
    move-object v6, p1

    .line 217
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    if-eqz p1, :cond_3

    .line 222
    .line 223
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 224
    .line 225
    .line 226
    move-result p1

    .line 227
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 228
    .line 229
    .line 230
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 231
    .line 232
    .line 233
    goto/16 :goto_2

    .line 234
    .line 235
    :pswitch_b
    move-object v6, p1

    .line 236
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 237
    .line 238
    .line 239
    move-result p1

    .line 240
    if-eqz p1, :cond_3

    .line 241
    .line 242
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 243
    .line 244
    .line 245
    move-result p1

    .line 246
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 250
    .line 251
    .line 252
    goto/16 :goto_2

    .line 253
    .line 254
    :pswitch_c
    move-object v6, p1

    .line 255
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result p1

    .line 259
    if-eqz p1, :cond_3

    .line 260
    .line 261
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_2

    .line 272
    .line 273
    :pswitch_d
    move-object v6, p1

    .line 274
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result p1

    .line 278
    if-eqz p1, :cond_3

    .line 279
    .line 280
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object p1

    .line 284
    invoke-static {v6, v7, v8, p1}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 288
    .line 289
    .line 290
    goto/16 :goto_2

    .line 291
    .line 292
    :pswitch_e
    move-object v6, p1

    .line 293
    invoke-virtual {p0, v0, v6, p2}, La/p640;->o(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    goto/16 :goto_2

    .line 297
    .line 298
    :pswitch_f
    move-object v6, p1

    .line 299
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result p1

    .line 303
    if-eqz p1, :cond_3

    .line 304
    .line 305
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    invoke-static {v6, v7, v8, p1}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    goto/16 :goto_2

    .line 316
    .line 317
    :pswitch_10
    move-object v6, p1

    .line 318
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result p1

    .line 322
    if-eqz p1, :cond_3

    .line 323
    .line 324
    sget-object p1, La/ift0;->c:La/gft0;

    .line 325
    .line 326
    invoke-virtual {p1, p2, v7, v8}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 327
    .line 328
    .line 329
    move-result v1

    .line 330
    invoke-virtual {p1, v6, v7, v8, v1}, La/gft0;->e(Ljava/lang/Object;JZ)V

    .line 331
    .line 332
    .line 333
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    goto/16 :goto_2

    .line 337
    .line 338
    :pswitch_11
    move-object v6, p1

    .line 339
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result p1

    .line 343
    if-eqz p1, :cond_3

    .line 344
    .line 345
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 346
    .line 347
    .line 348
    move-result p1

    .line 349
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 350
    .line 351
    .line 352
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 353
    .line 354
    .line 355
    goto/16 :goto_2

    .line 356
    .line 357
    :pswitch_12
    move-object v6, p1

    .line 358
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 359
    .line 360
    .line 361
    move-result p1

    .line 362
    if-eqz p1, :cond_3

    .line 363
    .line 364
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 365
    .line 366
    .line 367
    move-result-wide v9

    .line 368
    sget-object p1, La/ift0;->c:La/gft0;

    .line 369
    .line 370
    iget-object v5, p1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 371
    .line 372
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    goto :goto_2

    .line 379
    :pswitch_13
    move-object v6, p1

    .line 380
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    if-eqz p1, :cond_3

    .line 385
    .line 386
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 387
    .line 388
    .line 389
    move-result p1

    .line 390
    invoke-static {v6, p1, v7, v8}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    goto :goto_2

    .line 397
    :pswitch_14
    move-object v6, p1

    .line 398
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 399
    .line 400
    .line 401
    move-result p1

    .line 402
    if-eqz p1, :cond_3

    .line 403
    .line 404
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 405
    .line 406
    .line 407
    move-result-wide v9

    .line 408
    sget-object p1, La/ift0;->c:La/gft0;

    .line 409
    .line 410
    iget-object v5, p1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 411
    .line 412
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 413
    .line 414
    .line 415
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    goto :goto_2

    .line 419
    :pswitch_15
    move-object v6, p1

    .line 420
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    move-result p1

    .line 424
    if-eqz p1, :cond_3

    .line 425
    .line 426
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 427
    .line 428
    .line 429
    move-result-wide v9

    .line 430
    sget-object p1, La/ift0;->c:La/gft0;

    .line 431
    .line 432
    iget-object v5, p1, La/gft0;->b:Lsun/misc/Unsafe;

    .line 433
    .line 434
    invoke-virtual/range {v5 .. v10}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 438
    .line 439
    .line 440
    goto :goto_2

    .line 441
    :pswitch_16
    move-object v6, p1

    .line 442
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result p1

    .line 446
    if-eqz p1, :cond_3

    .line 447
    .line 448
    sget-object p1, La/ift0;->c:La/gft0;

    .line 449
    .line 450
    invoke-virtual {p1, p2, v7, v8}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 451
    .line 452
    .line 453
    move-result v1

    .line 454
    invoke-virtual {p1, v6, v7, v8, v1}, La/gft0;->h(Ljava/lang/Object;JF)V

    .line 455
    .line 456
    .line 457
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 458
    .line 459
    .line 460
    goto :goto_2

    .line 461
    :pswitch_17
    move-object v6, p1

    .line 462
    invoke-virtual {p0, v0, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 463
    .line 464
    .line 465
    move-result p1

    .line 466
    if-eqz p1, :cond_3

    .line 467
    .line 468
    sget-object v5, La/ift0;->c:La/gft0;

    .line 469
    .line 470
    invoke-virtual {v5, p2, v7, v8}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 471
    .line 472
    .line 473
    move-result-wide v9

    .line 474
    invoke-virtual/range {v5 .. v10}, La/gft0;->g(Ljava/lang/Object;JD)V

    .line 475
    .line 476
    .line 477
    invoke-virtual {p0, v0, v6}, La/p640;->u(ILjava/lang/Object;)V

    .line 478
    .line 479
    .line 480
    :cond_3
    :goto_2
    add-int/lit8 v0, v0, 0x3

    .line 481
    .line 482
    move-object p1, v6

    .line 483
    goto/16 :goto_0

    .line 484
    .line 485
    :cond_4
    move-object v6, p1

    .line 486
    iget-object p0, p0, La/p640;->h:La/aet0;

    .line 487
    .line 488
    invoke-static {p0, v6, p2}, La/x2h0;->j(La/aet0;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    return-void

    .line 492
    :cond_5
    move-object v6, p1

    .line 493
    const-string p0, "Mutating immutable message: "

    .line 494
    .line 495
    invoke-static {v6, p0}, La/e9d0;->i(Ljava/lang/Object;Ljava/lang/String;)V

    .line 496
    .line 497
    .line 498
    return-void

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 9

    .line 1
    invoke-static {p1}, La/p640;->m(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    instance-of v0, p1, La/kjt;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, La/kjt;

    .line 16
    .line 17
    const v2, 0x7fffffff

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2}, La/kjt;->q(I)V

    .line 21
    .line 22
    .line 23
    iput v1, v0, La/y3;->memoizedHashCode:I

    .line 24
    .line 25
    invoke-virtual {v0}, La/kjt;->n()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v0, p0, La/p640;->a:[I

    .line 29
    .line 30
    array-length v2, v0

    .line 31
    move v3, v1

    .line 32
    :goto_0
    if-ge v3, v2, :cond_5

    .line 33
    .line 34
    invoke-virtual {p0, v3}, La/p640;->w(I)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    const v5, 0xfffff

    .line 39
    .line 40
    .line 41
    and-int/2addr v5, v4

    .line 42
    int-to-long v5, v5

    .line 43
    invoke-static {v4}, La/p640;->v(I)I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    const/16 v7, 0x9

    .line 48
    .line 49
    sget-object v8, La/p640;->k:Lsun/misc/Unsafe;

    .line 50
    .line 51
    if-eq v4, v7, :cond_3

    .line 52
    .line 53
    const/16 v7, 0x3c

    .line 54
    .line 55
    if-eq v4, v7, :cond_2

    .line 56
    .line 57
    const/16 v7, 0x44

    .line 58
    .line 59
    if-eq v4, v7, :cond_2

    .line 60
    .line 61
    packed-switch v4, :pswitch_data_0

    .line 62
    .line 63
    .line 64
    goto :goto_1

    .line 65
    :pswitch_0
    invoke-virtual {v8, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    if-eqz v4, :cond_4

    .line 70
    .line 71
    iget-object v7, p0, La/p640;->i:La/yo20;

    .line 72
    .line 73
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-object v7, v4

    .line 77
    check-cast v7, La/vo20;

    .line 78
    .line 79
    iput-boolean v1, v7, La/vo20;->a:Z

    .line 80
    .line 81
    invoke-virtual {v8, p1, v5, v6, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :pswitch_1
    iget-object v4, p0, La/p640;->g:La/cd00;

    .line 86
    .line 87
    invoke-virtual {v4, p1, v5, v6}, La/cd00;->a(Ljava/lang/Object;J)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    aget v4, v0, v3

    .line 92
    .line 93
    invoke-virtual {p0, v4, v3, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    if-eqz v4, :cond_4

    .line 98
    .line 99
    invoke-virtual {p0, v3}, La/p640;->j(I)La/p2h0;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v8, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    invoke-interface {v4, v5}, La/p2h0;->b(Ljava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_3
    :pswitch_2
    invoke-virtual {p0, v3, p1}, La/p640;->k(ILjava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    invoke-virtual {p0, v3}, La/p640;->j(I)La/p2h0;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    invoke-virtual {v8, p1, v5, v6}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    invoke-interface {v4, v5}, La/p2h0;->b(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    :goto_1
    add-int/lit8 v3, v3, 0x3

    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_5
    iget-object p0, p0, La/p640;->h:La/aet0;

    .line 132
    .line 133
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    check-cast p1, La/kjt;

    .line 137
    .line 138
    iget-object p0, p1, La/kjt;->unknownFields:La/xdt0;

    .line 139
    .line 140
    iget-boolean p1, p0, La/xdt0;->e:Z

    .line 141
    .line 142
    if-eqz p1, :cond_6

    .line 143
    .line 144
    iput-boolean v1, p0, La/xdt0;->e:Z

    .line 145
    .line 146
    :cond_6
    :goto_2
    return-void

    .line 147
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v6, 0xfffff

    .line 6
    .line 7
    .line 8
    const/4 v7, 0x0

    .line 9
    move v2, v6

    .line 10
    move v3, v7

    .line 11
    move v8, v3

    .line 12
    :goto_0
    iget v4, v0, La/p640;->e:I

    .line 13
    .line 14
    const/4 v5, 0x1

    .line 15
    if-ge v8, v4, :cond_e

    .line 16
    .line 17
    iget-object v4, v0, La/p640;->d:[I

    .line 18
    .line 19
    aget v4, v4, v8

    .line 20
    .line 21
    iget-object v9, v0, La/p640;->a:[I

    .line 22
    .line 23
    aget v10, v9, v4

    .line 24
    .line 25
    invoke-virtual {v0, v4}, La/p640;->w(I)I

    .line 26
    .line 27
    .line 28
    move-result v11

    .line 29
    add-int/lit8 v12, v4, 0x2

    .line 30
    .line 31
    aget v9, v9, v12

    .line 32
    .line 33
    and-int v12, v9, v6

    .line 34
    .line 35
    ushr-int/lit8 v9, v9, 0x14

    .line 36
    .line 37
    shl-int/2addr v5, v9

    .line 38
    if-eq v12, v2, :cond_1

    .line 39
    .line 40
    if-eq v12, v6, :cond_0

    .line 41
    .line 42
    sget-object v2, La/p640;->k:Lsun/misc/Unsafe;

    .line 43
    .line 44
    int-to-long v13, v12

    .line 45
    invoke-virtual {v2, v1, v13, v14}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :cond_0
    move v2, v4

    .line 50
    move v4, v3

    .line 51
    move v3, v12

    .line 52
    goto :goto_1

    .line 53
    :cond_1
    move v15, v3

    .line 54
    move v3, v2

    .line 55
    move v2, v4

    .line 56
    move v4, v15

    .line 57
    :goto_1
    const/high16 v9, 0x10000000

    .line 58
    .line 59
    and-int/2addr v9, v11

    .line 60
    if-eqz v9, :cond_2

    .line 61
    .line 62
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 63
    .line 64
    .line 65
    move-result v9

    .line 66
    if-nez v9, :cond_2

    .line 67
    .line 68
    goto/16 :goto_3

    .line 69
    .line 70
    :cond_2
    invoke-static {v11}, La/p640;->v(I)I

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    const/16 v12, 0x9

    .line 75
    .line 76
    if-eq v9, v12, :cond_c

    .line 77
    .line 78
    const/16 v12, 0x11

    .line 79
    .line 80
    if-eq v9, v12, :cond_c

    .line 81
    .line 82
    const/16 v5, 0x1b

    .line 83
    .line 84
    if-eq v9, v5, :cond_9

    .line 85
    .line 86
    const/16 v5, 0x3c

    .line 87
    .line 88
    if-eq v9, v5, :cond_8

    .line 89
    .line 90
    const/16 v5, 0x44

    .line 91
    .line 92
    if-eq v9, v5, :cond_8

    .line 93
    .line 94
    const/16 v5, 0x31

    .line 95
    .line 96
    if-eq v9, v5, :cond_9

    .line 97
    .line 98
    const/16 v5, 0x32

    .line 99
    .line 100
    if-eq v9, v5, :cond_3

    .line 101
    .line 102
    goto/16 :goto_4

    .line 103
    .line 104
    :cond_3
    and-int v5, v11, v6

    .line 105
    .line 106
    int-to-long v9, v5

    .line 107
    invoke-static {v1, v9, v10}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    iget-object v9, v0, La/p640;->i:La/yo20;

    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    check-cast v5, La/vo20;

    .line 117
    .line 118
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_4

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_4
    div-int/lit8 v2, v2, 0x3

    .line 127
    .line 128
    mul-int/lit8 v2, v2, 0x2

    .line 129
    .line 130
    iget-object v9, v0, La/p640;->b:[Ljava/lang/Object;

    .line 131
    .line 132
    aget-object v2, v9, v2

    .line 133
    .line 134
    check-cast v2, La/po20;

    .line 135
    .line 136
    iget-object v2, v2, La/po20;->a:La/yuu;

    .line 137
    .line 138
    iget-object v2, v2, La/yuu;->c:Ljava/lang/Object;

    .line 139
    .line 140
    check-cast v2, La/dov0;

    .line 141
    .line 142
    iget-object v2, v2, La/dov0;->a:La/gov0;

    .line 143
    .line 144
    sget-object v9, La/gov0;->j:La/gov0;

    .line 145
    .line 146
    if-eq v2, v9, :cond_5

    .line 147
    .line 148
    goto/16 :goto_4

    .line 149
    .line 150
    :cond_5
    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const/4 v5, 0x0

    .line 159
    :cond_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 160
    .line 161
    .line 162
    move-result v9

    .line 163
    if-eqz v9, :cond_d

    .line 164
    .line 165
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v9

    .line 169
    if-nez v5, :cond_7

    .line 170
    .line 171
    sget-object v5, La/b5d0;->c:La/b5d0;

    .line 172
    .line 173
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v10

    .line 177
    invoke-virtual {v5, v10}, La/b5d0;->a(Ljava/lang/Class;)La/p2h0;

    .line 178
    .line 179
    .line 180
    move-result-object v5

    .line 181
    :cond_7
    invoke-interface {v5, v9}, La/p2h0;->c(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v9

    .line 185
    if-nez v9, :cond_6

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_8
    invoke-virtual {v0, v10, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    move-result v5

    .line 192
    if-eqz v5, :cond_d

    .line 193
    .line 194
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    and-int v5, v11, v6

    .line 199
    .line 200
    int-to-long v9, v5

    .line 201
    invoke-static {v1, v9, v10}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    invoke-interface {v2, v5}, La/p2h0;->c(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v2

    .line 209
    if-nez v2, :cond_d

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_9
    and-int v5, v11, v6

    .line 213
    .line 214
    int-to-long v9, v5

    .line 215
    invoke-static {v1, v9, v10}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    check-cast v5, Ljava/util/List;

    .line 220
    .line 221
    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_a

    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_a
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    move v9, v7

    .line 233
    :goto_2
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 234
    .line 235
    .line 236
    move-result v10

    .line 237
    if-ge v9, v10, :cond_d

    .line 238
    .line 239
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v10

    .line 243
    invoke-interface {v2, v10}, La/p2h0;->c(Ljava/lang/Object;)Z

    .line 244
    .line 245
    .line 246
    move-result v10

    .line 247
    if-nez v10, :cond_b

    .line 248
    .line 249
    goto :goto_3

    .line 250
    :cond_b
    add-int/lit8 v9, v9, 0x1

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_c
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 254
    .line 255
    .line 256
    move-result v5

    .line 257
    if-eqz v5, :cond_d

    .line 258
    .line 259
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    and-int v5, v11, v6

    .line 264
    .line 265
    int-to-long v9, v5

    .line 266
    invoke-static {v1, v9, v10}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    invoke-interface {v2, v5}, La/p2h0;->c(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-nez v2, :cond_d

    .line 275
    .line 276
    :goto_3
    return v7

    .line 277
    :cond_d
    :goto_4
    add-int/lit8 v8, v8, 0x1

    .line 278
    .line 279
    move v2, v3

    .line 280
    move v3, v4

    .line 281
    goto/16 :goto_0

    .line 282
    .line 283
    :cond_e
    return v5
.end method

.method public final d()La/kjt;
    .locals 1

    .line 1
    iget-object v0, p0, La/p640;->f:La/em50;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/p640;->c:La/y3;

    .line 7
    .line 8
    check-cast p0, La/kjt;

    .line 9
    .line 10
    const/4 v0, 0x4

    .line 11
    invoke-virtual {p0, v0}, La/kjt;->j(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, La/kjt;

    .line 16
    .line 17
    return-object p0
.end method

.method public final e(La/kjt;)I
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v7, 0xfffff

    .line 6
    .line 7
    .line 8
    move v3, v7

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    :goto_0
    iget-object v5, v0, La/p640;->a:[I

    .line 13
    .line 14
    array-length v9, v5

    .line 15
    if-ge v2, v9, :cond_27

    .line 16
    .line 17
    invoke-virtual {v0, v2}, La/p640;->w(I)I

    .line 18
    .line 19
    .line 20
    move-result v9

    .line 21
    invoke-static {v9}, La/p640;->v(I)I

    .line 22
    .line 23
    .line 24
    move-result v10

    .line 25
    aget v11, v5, v2

    .line 26
    .line 27
    add-int/lit8 v12, v2, 0x2

    .line 28
    .line 29
    aget v5, v5, v12

    .line 30
    .line 31
    and-int v12, v5, v7

    .line 32
    .line 33
    const/16 v13, 0x11

    .line 34
    .line 35
    const/4 v14, 0x1

    .line 36
    sget-object v15, La/p640;->k:Lsun/misc/Unsafe;

    .line 37
    .line 38
    if-gt v10, v13, :cond_2

    .line 39
    .line 40
    if-eq v12, v3, :cond_1

    .line 41
    .line 42
    if-ne v12, v7, :cond_0

    .line 43
    .line 44
    const/4 v4, 0x0

    .line 45
    goto :goto_1

    .line 46
    :cond_0
    int-to-long v3, v12

    .line 47
    invoke-virtual {v15, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    move v4, v3

    .line 52
    :goto_1
    move v3, v12

    .line 53
    :cond_1
    ushr-int/lit8 v5, v5, 0x14

    .line 54
    .line 55
    shl-int v5, v14, v5

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    const/4 v5, 0x0

    .line 59
    :goto_2
    and-int/2addr v9, v7

    .line 60
    int-to-long v12, v9

    .line 61
    sget-object v9, La/hrp;->b:La/hrp;

    .line 62
    .line 63
    iget-byte v9, v9, La/hrp;->a:B

    .line 64
    .line 65
    if-lt v10, v9, :cond_3

    .line 66
    .line 67
    sget-object v9, La/hrp;->c:La/hrp;

    .line 68
    .line 69
    iget-byte v9, v9, La/hrp;->a:B

    .line 70
    .line 71
    :cond_3
    const/16 v9, 0x3f

    .line 72
    .line 73
    const/16 v16, 0x2

    .line 74
    .line 75
    const/16 v17, 0x4

    .line 76
    .line 77
    const/16 v18, 0x8

    .line 78
    .line 79
    packed-switch v10, :pswitch_data_0

    .line 80
    .line 81
    .line 82
    goto :goto_4

    .line 83
    :pswitch_0
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_4

    .line 88
    .line 89
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, La/y3;

    .line 94
    .line 95
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    invoke-static {v11}, La/qyc;->c(I)I

    .line 100
    .line 101
    .line 102
    move-result v10

    .line 103
    mul-int/lit8 v10, v10, 0x2

    .line 104
    .line 105
    invoke-virtual {v5, v9}, La/y3;->g(La/p2h0;)I

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    add-int/2addr v5, v10

    .line 110
    :goto_3
    add-int/2addr v8, v5

    .line 111
    :cond_4
    :goto_4
    const/16 v19, 0x0

    .line 112
    .line 113
    goto/16 :goto_2c

    .line 114
    .line 115
    :pswitch_1
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-static {v1, v12, v13}, La/p640;->s(Ljava/lang/Object;J)J

    .line 122
    .line 123
    .line 124
    move-result-wide v12

    .line 125
    invoke-static {v11}, La/qyc;->c(I)I

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    shl-long v10, v12, v14

    .line 130
    .line 131
    shr-long/2addr v12, v9

    .line 132
    xor-long v9, v10, v12

    .line 133
    .line 134
    invoke-static {v9, v10}, La/qyc;->e(J)I

    .line 135
    .line 136
    .line 137
    move-result v9

    .line 138
    :goto_5
    add-int/2addr v9, v5

    .line 139
    add-int/2addr v8, v9

    .line 140
    goto :goto_4

    .line 141
    :pswitch_2
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_4

    .line 146
    .line 147
    invoke-static {v1, v12, v13}, La/p640;->r(Ljava/lang/Object;J)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-static {v11}, La/qyc;->c(I)I

    .line 152
    .line 153
    .line 154
    move-result v9

    .line 155
    shl-int/lit8 v10, v5, 0x1

    .line 156
    .line 157
    shr-int/lit8 v5, v5, 0x1f

    .line 158
    .line 159
    xor-int/2addr v5, v10

    .line 160
    invoke-static {v5}, La/qyc;->d(I)I

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    :goto_6
    add-int/2addr v5, v9

    .line 165
    goto :goto_3

    .line 166
    :pswitch_3
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v5

    .line 170
    if-eqz v5, :cond_4

    .line 171
    .line 172
    invoke-static {v11}, La/qyc;->c(I)I

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    :goto_7
    add-int/lit8 v5, v5, 0x8

    .line 177
    .line 178
    goto :goto_3

    .line 179
    :pswitch_4
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v5

    .line 183
    if-eqz v5, :cond_4

    .line 184
    .line 185
    invoke-static {v11}, La/qyc;->c(I)I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    :goto_8
    add-int/lit8 v5, v5, 0x4

    .line 190
    .line 191
    goto :goto_3

    .line 192
    :pswitch_5
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    if-eqz v5, :cond_4

    .line 197
    .line 198
    invoke-static {v1, v12, v13}, La/p640;->r(Ljava/lang/Object;J)I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    invoke-static {v11}, La/qyc;->c(I)I

    .line 203
    .line 204
    .line 205
    move-result v9

    .line 206
    invoke-static {v5}, La/qyc;->a(I)I

    .line 207
    .line 208
    .line 209
    move-result v5

    .line 210
    goto :goto_6

    .line 211
    :pswitch_6
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v5

    .line 215
    if-eqz v5, :cond_4

    .line 216
    .line 217
    invoke-static {v1, v12, v13}, La/p640;->r(Ljava/lang/Object;J)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-static {v11}, La/qyc;->c(I)I

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    invoke-static {v5}, La/qyc;->d(I)I

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    goto :goto_6

    .line 230
    :pswitch_7
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_4

    .line 235
    .line 236
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, La/lg9;

    .line 241
    .line 242
    invoke-static {v11}, La/qyc;->c(I)I

    .line 243
    .line 244
    .line 245
    move-result v9

    .line 246
    invoke-virtual {v5}, La/lg9;->size()I

    .line 247
    .line 248
    .line 249
    move-result v5

    .line 250
    invoke-static {v5, v5, v9, v8}, La/f140;->x(IIII)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    goto/16 :goto_4

    .line 255
    .line 256
    :pswitch_8
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 257
    .line 258
    .line 259
    move-result v5

    .line 260
    if-eqz v5, :cond_4

    .line 261
    .line 262
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v5

    .line 266
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    sget-object v10, La/x2h0;->a:Ljava/lang/Class;

    .line 271
    .line 272
    check-cast v5, La/y3;

    .line 273
    .line 274
    invoke-static {v11}, La/qyc;->c(I)I

    .line 275
    .line 276
    .line 277
    move-result v10

    .line 278
    invoke-virtual {v5, v9}, La/y3;->g(La/p2h0;)I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    invoke-static {v5, v5, v10, v8}, La/f140;->x(IIII)I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    goto/16 :goto_4

    .line 287
    .line 288
    :pswitch_9
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v5

    .line 292
    if-eqz v5, :cond_4

    .line 293
    .line 294
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    instance-of v9, v5, La/lg9;

    .line 299
    .line 300
    if-eqz v9, :cond_5

    .line 301
    .line 302
    check-cast v5, La/lg9;

    .line 303
    .line 304
    invoke-static {v11}, La/qyc;->c(I)I

    .line 305
    .line 306
    .line 307
    move-result v9

    .line 308
    invoke-virtual {v5}, La/lg9;->size()I

    .line 309
    .line 310
    .line 311
    move-result v5

    .line 312
    invoke-static {v5, v5, v9, v8}, La/f140;->x(IIII)I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    :goto_9
    move v8, v5

    .line 317
    goto/16 :goto_4

    .line 318
    .line 319
    :cond_5
    check-cast v5, Ljava/lang/String;

    .line 320
    .line 321
    invoke-static {v11}, La/qyc;->c(I)I

    .line 322
    .line 323
    .line 324
    move-result v9

    .line 325
    invoke-static {v5}, La/qyc;->b(Ljava/lang/String;)I

    .line 326
    .line 327
    .line 328
    move-result v5

    .line 329
    add-int/2addr v5, v9

    .line 330
    add-int/2addr v5, v8

    .line 331
    goto :goto_9

    .line 332
    :pswitch_a
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    if-eqz v5, :cond_4

    .line 337
    .line 338
    invoke-static {v11}, La/qyc;->c(I)I

    .line 339
    .line 340
    .line 341
    move-result v5

    .line 342
    add-int/2addr v5, v14

    .line 343
    goto/16 :goto_3

    .line 344
    .line 345
    :pswitch_b
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_4

    .line 350
    .line 351
    invoke-static {v11}, La/qyc;->c(I)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    goto/16 :goto_8

    .line 356
    .line 357
    :pswitch_c
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    if-eqz v5, :cond_4

    .line 362
    .line 363
    invoke-static {v11}, La/qyc;->c(I)I

    .line 364
    .line 365
    .line 366
    move-result v5

    .line 367
    goto/16 :goto_7

    .line 368
    .line 369
    :pswitch_d
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    move-result v5

    .line 373
    if-eqz v5, :cond_4

    .line 374
    .line 375
    invoke-static {v1, v12, v13}, La/p640;->r(Ljava/lang/Object;J)I

    .line 376
    .line 377
    .line 378
    move-result v5

    .line 379
    invoke-static {v11}, La/qyc;->c(I)I

    .line 380
    .line 381
    .line 382
    move-result v9

    .line 383
    invoke-static {v5}, La/qyc;->a(I)I

    .line 384
    .line 385
    .line 386
    move-result v5

    .line 387
    goto/16 :goto_6

    .line 388
    .line 389
    :pswitch_e
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    if-eqz v5, :cond_4

    .line 394
    .line 395
    invoke-static {v1, v12, v13}, La/p640;->s(Ljava/lang/Object;J)J

    .line 396
    .line 397
    .line 398
    move-result-wide v9

    .line 399
    invoke-static {v11}, La/qyc;->c(I)I

    .line 400
    .line 401
    .line 402
    move-result v5

    .line 403
    invoke-static {v9, v10}, La/qyc;->e(J)I

    .line 404
    .line 405
    .line 406
    move-result v9

    .line 407
    goto/16 :goto_5

    .line 408
    .line 409
    :pswitch_f
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v5

    .line 413
    if-eqz v5, :cond_4

    .line 414
    .line 415
    invoke-static {v1, v12, v13}, La/p640;->s(Ljava/lang/Object;J)J

    .line 416
    .line 417
    .line 418
    move-result-wide v9

    .line 419
    invoke-static {v11}, La/qyc;->c(I)I

    .line 420
    .line 421
    .line 422
    move-result v5

    .line 423
    invoke-static {v9, v10}, La/qyc;->e(J)I

    .line 424
    .line 425
    .line 426
    move-result v9

    .line 427
    goto/16 :goto_5

    .line 428
    .line 429
    :pswitch_10
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-eqz v5, :cond_4

    .line 434
    .line 435
    invoke-static {v11}, La/qyc;->c(I)I

    .line 436
    .line 437
    .line 438
    move-result v5

    .line 439
    goto/16 :goto_8

    .line 440
    .line 441
    :pswitch_11
    invoke-virtual {v0, v11, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v5

    .line 445
    if-eqz v5, :cond_4

    .line 446
    .line 447
    invoke-static {v11}, La/qyc;->c(I)I

    .line 448
    .line 449
    .line 450
    move-result v5

    .line 451
    goto/16 :goto_7

    .line 452
    .line 453
    :pswitch_12
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    move-result-object v5

    .line 457
    div-int/lit8 v10, v2, 0x3

    .line 458
    .line 459
    mul-int/lit8 v10, v10, 0x2

    .line 460
    .line 461
    iget-object v12, v0, La/p640;->b:[Ljava/lang/Object;

    .line 462
    .line 463
    aget-object v10, v12, v10

    .line 464
    .line 465
    iget-object v12, v0, La/p640;->i:La/yo20;

    .line 466
    .line 467
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    check-cast v5, La/vo20;

    .line 471
    .line 472
    check-cast v10, La/po20;

    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 475
    .line 476
    .line 477
    move-result v12

    .line 478
    if-eqz v12, :cond_7

    .line 479
    .line 480
    const/4 v12, 0x0

    .line 481
    :cond_6
    move/from16 v24, v3

    .line 482
    .line 483
    const/16 v19, 0x0

    .line 484
    .line 485
    goto/16 :goto_13

    .line 486
    .line 487
    :cond_7
    invoke-virtual {v5}, La/vo20;->entrySet()Ljava/util/Set;

    .line 488
    .line 489
    .line 490
    move-result-object v5

    .line 491
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    const/4 v12, 0x0

    .line 496
    :goto_a
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 497
    .line 498
    .line 499
    move-result v13

    .line 500
    if-eqz v13, :cond_6

    .line 501
    .line 502
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v13

    .line 506
    check-cast v13, Ljava/util/Map$Entry;

    .line 507
    .line 508
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v15

    .line 512
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    move-result-object v13

    .line 516
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    const/16 v19, 0x0

    .line 520
    .line 521
    invoke-static {v11}, La/qyc;->c(I)I

    .line 522
    .line 523
    .line 524
    move-result v6

    .line 525
    iget-object v7, v10, La/po20;->a:La/yuu;

    .line 526
    .line 527
    move/from16 v20, v9

    .line 528
    .line 529
    iget-object v9, v7, La/yuu;->b:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v9, La/dov0;

    .line 532
    .line 533
    sget v21, La/drp;->c:I

    .line 534
    .line 535
    invoke-static {v14}, La/qyc;->c(I)I

    .line 536
    .line 537
    .line 538
    move-result v21

    .line 539
    move/from16 v22, v14

    .line 540
    .line 541
    sget-object v14, La/dov0;->e:La/unv0;

    .line 542
    .line 543
    if-ne v9, v14, :cond_8

    .line 544
    .line 545
    mul-int/lit8 v21, v21, 0x2

    .line 546
    .line 547
    :cond_8
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 548
    .line 549
    .line 550
    move-result v9

    .line 551
    const-string v23, "There is no way to get here, but the compiler thinks otherwise."

    .line 552
    .line 553
    move/from16 v24, v3

    .line 554
    .line 555
    const/4 v3, 0x0

    .line 556
    packed-switch v9, :pswitch_data_1

    .line 557
    .line 558
    .line 559
    invoke-static/range {v23 .. v23}, La/itt0;->k(Ljava/lang/String;)V

    .line 560
    .line 561
    .line 562
    return v19

    .line 563
    :pswitch_13
    check-cast v15, Ljava/lang/Long;

    .line 564
    .line 565
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 566
    .line 567
    .line 568
    move-result-wide v25

    .line 569
    shl-long v27, v25, v22

    .line 570
    .line 571
    shr-long v25, v25, v20

    .line 572
    .line 573
    xor-long v25, v27, v25

    .line 574
    .line 575
    invoke-static/range {v25 .. v26}, La/qyc;->e(J)I

    .line 576
    .line 577
    .line 578
    move-result v9

    .line 579
    goto/16 :goto_e

    .line 580
    .line 581
    :pswitch_14
    check-cast v15, Ljava/lang/Integer;

    .line 582
    .line 583
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 584
    .line 585
    .line 586
    move-result v9

    .line 587
    shl-int/lit8 v15, v9, 0x1

    .line 588
    .line 589
    shr-int/lit8 v9, v9, 0x1f

    .line 590
    .line 591
    xor-int/2addr v9, v15

    .line 592
    invoke-static {v9}, La/qyc;->d(I)I

    .line 593
    .line 594
    .line 595
    move-result v9

    .line 596
    goto/16 :goto_e

    .line 597
    .line 598
    :pswitch_15
    check-cast v15, Ljava/lang/Long;

    .line 599
    .line 600
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    :goto_b
    move/from16 v9, v18

    .line 604
    .line 605
    goto/16 :goto_e

    .line 606
    .line 607
    :pswitch_16
    check-cast v15, Ljava/lang/Integer;

    .line 608
    .line 609
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    :goto_c
    move/from16 v9, v17

    .line 613
    .line 614
    goto/16 :goto_e

    .line 615
    .line 616
    :pswitch_17
    instance-of v9, v15, La/ts3;

    .line 617
    .line 618
    if-eqz v9, :cond_9

    .line 619
    .line 620
    check-cast v15, La/ts3;

    .line 621
    .line 622
    iget-byte v9, v15, La/ts3;->a:B

    .line 623
    .line 624
    invoke-static {v9}, La/qyc;->a(I)I

    .line 625
    .line 626
    .line 627
    move-result v9

    .line 628
    goto/16 :goto_e

    .line 629
    .line 630
    :cond_9
    check-cast v15, Ljava/lang/Integer;

    .line 631
    .line 632
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 633
    .line 634
    .line 635
    move-result v9

    .line 636
    invoke-static {v9}, La/qyc;->a(I)I

    .line 637
    .line 638
    .line 639
    move-result v9

    .line 640
    goto/16 :goto_e

    .line 641
    .line 642
    :pswitch_18
    check-cast v15, Ljava/lang/Integer;

    .line 643
    .line 644
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 645
    .line 646
    .line 647
    move-result v9

    .line 648
    invoke-static {v9}, La/qyc;->d(I)I

    .line 649
    .line 650
    .line 651
    move-result v9

    .line 652
    goto/16 :goto_e

    .line 653
    .line 654
    :pswitch_19
    instance-of v9, v15, La/lg9;

    .line 655
    .line 656
    if-eqz v9, :cond_a

    .line 657
    .line 658
    check-cast v15, La/lg9;

    .line 659
    .line 660
    invoke-virtual {v15}, La/lg9;->size()I

    .line 661
    .line 662
    .line 663
    move-result v9

    .line 664
    invoke-static {v9}, La/qyc;->d(I)I

    .line 665
    .line 666
    .line 667
    move-result v15

    .line 668
    :goto_d
    add-int/2addr v9, v15

    .line 669
    goto/16 :goto_e

    .line 670
    .line 671
    :cond_a
    check-cast v15, [B

    .line 672
    .line 673
    array-length v9, v15

    .line 674
    invoke-static {v9}, La/qyc;->d(I)I

    .line 675
    .line 676
    .line 677
    move-result v15

    .line 678
    goto :goto_d

    .line 679
    :pswitch_1a
    check-cast v15, La/y3;

    .line 680
    .line 681
    check-cast v15, La/kjt;

    .line 682
    .line 683
    invoke-virtual {v15, v3}, La/kjt;->g(La/p2h0;)I

    .line 684
    .line 685
    .line 686
    move-result v9

    .line 687
    invoke-static {v9}, La/qyc;->d(I)I

    .line 688
    .line 689
    .line 690
    move-result v15

    .line 691
    goto :goto_d

    .line 692
    :pswitch_1b
    check-cast v15, La/y3;

    .line 693
    .line 694
    check-cast v15, La/kjt;

    .line 695
    .line 696
    invoke-virtual {v15, v3}, La/kjt;->g(La/p2h0;)I

    .line 697
    .line 698
    .line 699
    move-result v9

    .line 700
    goto :goto_e

    .line 701
    :pswitch_1c
    instance-of v9, v15, La/lg9;

    .line 702
    .line 703
    if-eqz v9, :cond_b

    .line 704
    .line 705
    check-cast v15, La/lg9;

    .line 706
    .line 707
    invoke-virtual {v15}, La/lg9;->size()I

    .line 708
    .line 709
    .line 710
    move-result v9

    .line 711
    invoke-static {v9}, La/qyc;->d(I)I

    .line 712
    .line 713
    .line 714
    move-result v15

    .line 715
    goto :goto_d

    .line 716
    :cond_b
    check-cast v15, Ljava/lang/String;

    .line 717
    .line 718
    invoke-static {v15}, La/qyc;->b(Ljava/lang/String;)I

    .line 719
    .line 720
    .line 721
    move-result v9

    .line 722
    goto :goto_e

    .line 723
    :pswitch_1d
    check-cast v15, Ljava/lang/Boolean;

    .line 724
    .line 725
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    move/from16 v9, v22

    .line 729
    .line 730
    goto :goto_e

    .line 731
    :pswitch_1e
    check-cast v15, Ljava/lang/Integer;

    .line 732
    .line 733
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 734
    .line 735
    .line 736
    goto :goto_c

    .line 737
    :pswitch_1f
    check-cast v15, Ljava/lang/Long;

    .line 738
    .line 739
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    goto/16 :goto_b

    .line 743
    .line 744
    :pswitch_20
    check-cast v15, Ljava/lang/Integer;

    .line 745
    .line 746
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result v9

    .line 750
    invoke-static {v9}, La/qyc;->a(I)I

    .line 751
    .line 752
    .line 753
    move-result v9

    .line 754
    goto :goto_e

    .line 755
    :pswitch_21
    check-cast v15, Ljava/lang/Long;

    .line 756
    .line 757
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 758
    .line 759
    .line 760
    move-result-wide v25

    .line 761
    invoke-static/range {v25 .. v26}, La/qyc;->e(J)I

    .line 762
    .line 763
    .line 764
    move-result v9

    .line 765
    goto :goto_e

    .line 766
    :pswitch_22
    check-cast v15, Ljava/lang/Long;

    .line 767
    .line 768
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 769
    .line 770
    .line 771
    move-result-wide v25

    .line 772
    invoke-static/range {v25 .. v26}, La/qyc;->e(J)I

    .line 773
    .line 774
    .line 775
    move-result v9

    .line 776
    goto :goto_e

    .line 777
    :pswitch_23
    check-cast v15, Ljava/lang/Float;

    .line 778
    .line 779
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 780
    .line 781
    .line 782
    goto/16 :goto_c

    .line 783
    .line 784
    :pswitch_24
    check-cast v15, Ljava/lang/Double;

    .line 785
    .line 786
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 787
    .line 788
    .line 789
    goto/16 :goto_b

    .line 790
    .line 791
    :goto_e
    add-int v9, v9, v21

    .line 792
    .line 793
    iget-object v7, v7, La/yuu;->c:Ljava/lang/Object;

    .line 794
    .line 795
    check-cast v7, La/dov0;

    .line 796
    .line 797
    invoke-static/range {v16 .. v16}, La/qyc;->c(I)I

    .line 798
    .line 799
    .line 800
    move-result v15

    .line 801
    if-ne v7, v14, :cond_c

    .line 802
    .line 803
    mul-int/lit8 v15, v15, 0x2

    .line 804
    .line 805
    :cond_c
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 806
    .line 807
    .line 808
    move-result v7

    .line 809
    packed-switch v7, :pswitch_data_2

    .line 810
    .line 811
    .line 812
    invoke-static/range {v23 .. v23}, La/itt0;->k(Ljava/lang/String;)V

    .line 813
    .line 814
    .line 815
    return v19

    .line 816
    :pswitch_25
    check-cast v13, Ljava/lang/Long;

    .line 817
    .line 818
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 819
    .line 820
    .line 821
    move-result-wide v13

    .line 822
    shl-long v25, v13, v22

    .line 823
    .line 824
    shr-long v13, v13, v20

    .line 825
    .line 826
    xor-long v13, v25, v13

    .line 827
    .line 828
    invoke-static {v13, v14}, La/qyc;->e(J)I

    .line 829
    .line 830
    .line 831
    move-result v3

    .line 832
    goto/16 :goto_12

    .line 833
    .line 834
    :pswitch_26
    check-cast v13, Ljava/lang/Integer;

    .line 835
    .line 836
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 837
    .line 838
    .line 839
    move-result v3

    .line 840
    shl-int/lit8 v7, v3, 0x1

    .line 841
    .line 842
    shr-int/lit8 v3, v3, 0x1f

    .line 843
    .line 844
    xor-int/2addr v3, v7

    .line 845
    invoke-static {v3}, La/qyc;->d(I)I

    .line 846
    .line 847
    .line 848
    move-result v3

    .line 849
    goto/16 :goto_12

    .line 850
    .line 851
    :pswitch_27
    check-cast v13, Ljava/lang/Long;

    .line 852
    .line 853
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    :goto_f
    move/from16 v3, v18

    .line 857
    .line 858
    goto/16 :goto_12

    .line 859
    .line 860
    :pswitch_28
    check-cast v13, Ljava/lang/Integer;

    .line 861
    .line 862
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 863
    .line 864
    .line 865
    :goto_10
    move/from16 v3, v17

    .line 866
    .line 867
    goto/16 :goto_12

    .line 868
    .line 869
    :pswitch_29
    instance-of v3, v13, La/ts3;

    .line 870
    .line 871
    if-eqz v3, :cond_d

    .line 872
    .line 873
    check-cast v13, La/ts3;

    .line 874
    .line 875
    iget-byte v3, v13, La/ts3;->a:B

    .line 876
    .line 877
    invoke-static {v3}, La/qyc;->a(I)I

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    goto/16 :goto_12

    .line 882
    .line 883
    :cond_d
    check-cast v13, Ljava/lang/Integer;

    .line 884
    .line 885
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 886
    .line 887
    .line 888
    move-result v3

    .line 889
    invoke-static {v3}, La/qyc;->a(I)I

    .line 890
    .line 891
    .line 892
    move-result v3

    .line 893
    goto/16 :goto_12

    .line 894
    .line 895
    :pswitch_2a
    check-cast v13, Ljava/lang/Integer;

    .line 896
    .line 897
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    invoke-static {v3}, La/qyc;->d(I)I

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    goto/16 :goto_12

    .line 906
    .line 907
    :pswitch_2b
    instance-of v3, v13, La/lg9;

    .line 908
    .line 909
    if-eqz v3, :cond_e

    .line 910
    .line 911
    check-cast v13, La/lg9;

    .line 912
    .line 913
    invoke-virtual {v13}, La/lg9;->size()I

    .line 914
    .line 915
    .line 916
    move-result v3

    .line 917
    invoke-static {v3}, La/qyc;->d(I)I

    .line 918
    .line 919
    .line 920
    move-result v7

    .line 921
    :goto_11
    add-int/2addr v3, v7

    .line 922
    goto/16 :goto_12

    .line 923
    .line 924
    :cond_e
    check-cast v13, [B

    .line 925
    .line 926
    array-length v3, v13

    .line 927
    invoke-static {v3}, La/qyc;->d(I)I

    .line 928
    .line 929
    .line 930
    move-result v7

    .line 931
    goto :goto_11

    .line 932
    :pswitch_2c
    check-cast v13, La/y3;

    .line 933
    .line 934
    check-cast v13, La/kjt;

    .line 935
    .line 936
    invoke-virtual {v13, v3}, La/kjt;->g(La/p2h0;)I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    invoke-static {v3}, La/qyc;->d(I)I

    .line 941
    .line 942
    .line 943
    move-result v7

    .line 944
    goto :goto_11

    .line 945
    :pswitch_2d
    check-cast v13, La/y3;

    .line 946
    .line 947
    check-cast v13, La/kjt;

    .line 948
    .line 949
    invoke-virtual {v13, v3}, La/kjt;->g(La/p2h0;)I

    .line 950
    .line 951
    .line 952
    move-result v3

    .line 953
    goto :goto_12

    .line 954
    :pswitch_2e
    instance-of v3, v13, La/lg9;

    .line 955
    .line 956
    if-eqz v3, :cond_f

    .line 957
    .line 958
    check-cast v13, La/lg9;

    .line 959
    .line 960
    invoke-virtual {v13}, La/lg9;->size()I

    .line 961
    .line 962
    .line 963
    move-result v3

    .line 964
    invoke-static {v3}, La/qyc;->d(I)I

    .line 965
    .line 966
    .line 967
    move-result v7

    .line 968
    goto :goto_11

    .line 969
    :cond_f
    check-cast v13, Ljava/lang/String;

    .line 970
    .line 971
    invoke-static {v13}, La/qyc;->b(Ljava/lang/String;)I

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    goto :goto_12

    .line 976
    :pswitch_2f
    check-cast v13, Ljava/lang/Boolean;

    .line 977
    .line 978
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    move/from16 v3, v22

    .line 982
    .line 983
    goto :goto_12

    .line 984
    :pswitch_30
    check-cast v13, Ljava/lang/Integer;

    .line 985
    .line 986
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    goto :goto_10

    .line 990
    :pswitch_31
    check-cast v13, Ljava/lang/Long;

    .line 991
    .line 992
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    goto/16 :goto_f

    .line 996
    .line 997
    :pswitch_32
    check-cast v13, Ljava/lang/Integer;

    .line 998
    .line 999
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 1000
    .line 1001
    .line 1002
    move-result v3

    .line 1003
    invoke-static {v3}, La/qyc;->a(I)I

    .line 1004
    .line 1005
    .line 1006
    move-result v3

    .line 1007
    goto :goto_12

    .line 1008
    :pswitch_33
    check-cast v13, Ljava/lang/Long;

    .line 1009
    .line 1010
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1011
    .line 1012
    .line 1013
    move-result-wide v13

    .line 1014
    invoke-static {v13, v14}, La/qyc;->e(J)I

    .line 1015
    .line 1016
    .line 1017
    move-result v3

    .line 1018
    goto :goto_12

    .line 1019
    :pswitch_34
    check-cast v13, Ljava/lang/Long;

    .line 1020
    .line 1021
    invoke-virtual {v13}, Ljava/lang/Long;->longValue()J

    .line 1022
    .line 1023
    .line 1024
    move-result-wide v13

    .line 1025
    invoke-static {v13, v14}, La/qyc;->e(J)I

    .line 1026
    .line 1027
    .line 1028
    move-result v3

    .line 1029
    goto :goto_12

    .line 1030
    :pswitch_35
    check-cast v13, Ljava/lang/Float;

    .line 1031
    .line 1032
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_10

    .line 1036
    .line 1037
    :pswitch_36
    check-cast v13, Ljava/lang/Double;

    .line 1038
    .line 1039
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1040
    .line 1041
    .line 1042
    goto/16 :goto_f

    .line 1043
    .line 1044
    :goto_12
    add-int/2addr v3, v15

    .line 1045
    add-int/2addr v3, v9

    .line 1046
    invoke-static {v3, v3, v6, v12}, La/f140;->x(IIII)I

    .line 1047
    .line 1048
    .line 1049
    move-result v12

    .line 1050
    move/from16 v9, v20

    .line 1051
    .line 1052
    move/from16 v14, v22

    .line 1053
    .line 1054
    move/from16 v3, v24

    .line 1055
    .line 1056
    const v7, 0xfffff

    .line 1057
    .line 1058
    .line 1059
    goto/16 :goto_a

    .line 1060
    .line 1061
    :goto_13
    add-int/2addr v8, v12

    .line 1062
    :cond_10
    :goto_14
    move/from16 v3, v24

    .line 1063
    .line 1064
    goto/16 :goto_2c

    .line 1065
    .line 1066
    :pswitch_37
    move/from16 v24, v3

    .line 1067
    .line 1068
    const/16 v19, 0x0

    .line 1069
    .line 1070
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v3

    .line 1074
    check-cast v3, Ljava/util/List;

    .line 1075
    .line 1076
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 1077
    .line 1078
    .line 1079
    move-result-object v5

    .line 1080
    sget-object v6, La/x2h0;->a:Ljava/lang/Class;

    .line 1081
    .line 1082
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1083
    .line 1084
    .line 1085
    move-result v6

    .line 1086
    if-nez v6, :cond_11

    .line 1087
    .line 1088
    move/from16 v9, v19

    .line 1089
    .line 1090
    goto :goto_16

    .line 1091
    :cond_11
    move/from16 v7, v19

    .line 1092
    .line 1093
    move v9, v7

    .line 1094
    :goto_15
    if-ge v7, v6, :cond_12

    .line 1095
    .line 1096
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1097
    .line 1098
    .line 1099
    move-result-object v10

    .line 1100
    check-cast v10, La/y3;

    .line 1101
    .line 1102
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1103
    .line 1104
    .line 1105
    move-result v12

    .line 1106
    mul-int/lit8 v12, v12, 0x2

    .line 1107
    .line 1108
    invoke-virtual {v10, v5}, La/y3;->g(La/p2h0;)I

    .line 1109
    .line 1110
    .line 1111
    move-result v10

    .line 1112
    add-int/2addr v10, v12

    .line 1113
    add-int/2addr v9, v10

    .line 1114
    add-int/lit8 v7, v7, 0x1

    .line 1115
    .line 1116
    goto :goto_15

    .line 1117
    :cond_12
    :goto_16
    add-int/2addr v8, v9

    .line 1118
    goto :goto_14

    .line 1119
    :pswitch_38
    move/from16 v24, v3

    .line 1120
    .line 1121
    const/16 v19, 0x0

    .line 1122
    .line 1123
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v3

    .line 1127
    check-cast v3, Ljava/util/List;

    .line 1128
    .line 1129
    invoke-static {v3}, La/x2h0;->g(Ljava/util/List;)I

    .line 1130
    .line 1131
    .line 1132
    move-result v3

    .line 1133
    if-lez v3, :cond_10

    .line 1134
    .line 1135
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1136
    .line 1137
    .line 1138
    move-result v5

    .line 1139
    :goto_17
    invoke-static {v3, v5, v3, v8}, La/f140;->x(IIII)I

    .line 1140
    .line 1141
    .line 1142
    move-result v8

    .line 1143
    goto :goto_14

    .line 1144
    :pswitch_39
    move/from16 v24, v3

    .line 1145
    .line 1146
    const/16 v19, 0x0

    .line 1147
    .line 1148
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v3

    .line 1152
    check-cast v3, Ljava/util/List;

    .line 1153
    .line 1154
    invoke-static {v3}, La/x2h0;->f(Ljava/util/List;)I

    .line 1155
    .line 1156
    .line 1157
    move-result v3

    .line 1158
    if-lez v3, :cond_10

    .line 1159
    .line 1160
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1161
    .line 1162
    .line 1163
    move-result v5

    .line 1164
    goto :goto_17

    .line 1165
    :pswitch_3a
    move/from16 v24, v3

    .line 1166
    .line 1167
    const/16 v19, 0x0

    .line 1168
    .line 1169
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v3

    .line 1173
    check-cast v3, Ljava/util/List;

    .line 1174
    .line 1175
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1176
    .line 1177
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1178
    .line 1179
    .line 1180
    move-result v3

    .line 1181
    mul-int/lit8 v3, v3, 0x8

    .line 1182
    .line 1183
    if-lez v3, :cond_10

    .line 1184
    .line 1185
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1186
    .line 1187
    .line 1188
    move-result v5

    .line 1189
    goto :goto_17

    .line 1190
    :pswitch_3b
    move/from16 v24, v3

    .line 1191
    .line 1192
    const/16 v19, 0x0

    .line 1193
    .line 1194
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v3

    .line 1198
    check-cast v3, Ljava/util/List;

    .line 1199
    .line 1200
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1201
    .line 1202
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1203
    .line 1204
    .line 1205
    move-result v3

    .line 1206
    mul-int/lit8 v3, v3, 0x4

    .line 1207
    .line 1208
    if-lez v3, :cond_10

    .line 1209
    .line 1210
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1211
    .line 1212
    .line 1213
    move-result v5

    .line 1214
    goto :goto_17

    .line 1215
    :pswitch_3c
    move/from16 v24, v3

    .line 1216
    .line 1217
    const/16 v19, 0x0

    .line 1218
    .line 1219
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1220
    .line 1221
    .line 1222
    move-result-object v3

    .line 1223
    check-cast v3, Ljava/util/List;

    .line 1224
    .line 1225
    invoke-static {v3}, La/x2h0;->a(Ljava/util/List;)I

    .line 1226
    .line 1227
    .line 1228
    move-result v3

    .line 1229
    if-lez v3, :cond_10

    .line 1230
    .line 1231
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1232
    .line 1233
    .line 1234
    move-result v5

    .line 1235
    goto :goto_17

    .line 1236
    :pswitch_3d
    move/from16 v24, v3

    .line 1237
    .line 1238
    const/16 v19, 0x0

    .line 1239
    .line 1240
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v3

    .line 1244
    check-cast v3, Ljava/util/List;

    .line 1245
    .line 1246
    invoke-static {v3}, La/x2h0;->h(Ljava/util/List;)I

    .line 1247
    .line 1248
    .line 1249
    move-result v3

    .line 1250
    if-lez v3, :cond_10

    .line 1251
    .line 1252
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1253
    .line 1254
    .line 1255
    move-result v5

    .line 1256
    goto :goto_17

    .line 1257
    :pswitch_3e
    move/from16 v24, v3

    .line 1258
    .line 1259
    const/16 v19, 0x0

    .line 1260
    .line 1261
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v3

    .line 1265
    check-cast v3, Ljava/util/List;

    .line 1266
    .line 1267
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1268
    .line 1269
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1270
    .line 1271
    .line 1272
    move-result v3

    .line 1273
    if-lez v3, :cond_10

    .line 1274
    .line 1275
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1276
    .line 1277
    .line 1278
    move-result v5

    .line 1279
    goto/16 :goto_17

    .line 1280
    .line 1281
    :pswitch_3f
    move/from16 v24, v3

    .line 1282
    .line 1283
    const/16 v19, 0x0

    .line 1284
    .line 1285
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v3

    .line 1289
    check-cast v3, Ljava/util/List;

    .line 1290
    .line 1291
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1292
    .line 1293
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1294
    .line 1295
    .line 1296
    move-result v3

    .line 1297
    mul-int/lit8 v3, v3, 0x4

    .line 1298
    .line 1299
    if-lez v3, :cond_10

    .line 1300
    .line 1301
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1302
    .line 1303
    .line 1304
    move-result v5

    .line 1305
    goto/16 :goto_17

    .line 1306
    .line 1307
    :pswitch_40
    move/from16 v24, v3

    .line 1308
    .line 1309
    const/16 v19, 0x0

    .line 1310
    .line 1311
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v3

    .line 1315
    check-cast v3, Ljava/util/List;

    .line 1316
    .line 1317
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1318
    .line 1319
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1320
    .line 1321
    .line 1322
    move-result v3

    .line 1323
    mul-int/lit8 v3, v3, 0x8

    .line 1324
    .line 1325
    if-lez v3, :cond_10

    .line 1326
    .line 1327
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1328
    .line 1329
    .line 1330
    move-result v5

    .line 1331
    goto/16 :goto_17

    .line 1332
    .line 1333
    :pswitch_41
    move/from16 v24, v3

    .line 1334
    .line 1335
    const/16 v19, 0x0

    .line 1336
    .line 1337
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1338
    .line 1339
    .line 1340
    move-result-object v3

    .line 1341
    check-cast v3, Ljava/util/List;

    .line 1342
    .line 1343
    invoke-static {v3}, La/x2h0;->d(Ljava/util/List;)I

    .line 1344
    .line 1345
    .line 1346
    move-result v3

    .line 1347
    if-lez v3, :cond_10

    .line 1348
    .line 1349
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1350
    .line 1351
    .line 1352
    move-result v5

    .line 1353
    goto/16 :goto_17

    .line 1354
    .line 1355
    :pswitch_42
    move/from16 v24, v3

    .line 1356
    .line 1357
    const/16 v19, 0x0

    .line 1358
    .line 1359
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v3

    .line 1363
    check-cast v3, Ljava/util/List;

    .line 1364
    .line 1365
    invoke-static {v3}, La/x2h0;->i(Ljava/util/List;)I

    .line 1366
    .line 1367
    .line 1368
    move-result v3

    .line 1369
    if-lez v3, :cond_10

    .line 1370
    .line 1371
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1372
    .line 1373
    .line 1374
    move-result v5

    .line 1375
    goto/16 :goto_17

    .line 1376
    .line 1377
    :pswitch_43
    move/from16 v24, v3

    .line 1378
    .line 1379
    const/16 v19, 0x0

    .line 1380
    .line 1381
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v3

    .line 1385
    check-cast v3, Ljava/util/List;

    .line 1386
    .line 1387
    invoke-static {v3}, La/x2h0;->e(Ljava/util/List;)I

    .line 1388
    .line 1389
    .line 1390
    move-result v3

    .line 1391
    if-lez v3, :cond_10

    .line 1392
    .line 1393
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1394
    .line 1395
    .line 1396
    move-result v5

    .line 1397
    goto/16 :goto_17

    .line 1398
    .line 1399
    :pswitch_44
    move/from16 v24, v3

    .line 1400
    .line 1401
    const/16 v19, 0x0

    .line 1402
    .line 1403
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v3

    .line 1407
    check-cast v3, Ljava/util/List;

    .line 1408
    .line 1409
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1410
    .line 1411
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1412
    .line 1413
    .line 1414
    move-result v3

    .line 1415
    mul-int/lit8 v3, v3, 0x4

    .line 1416
    .line 1417
    if-lez v3, :cond_10

    .line 1418
    .line 1419
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1420
    .line 1421
    .line 1422
    move-result v5

    .line 1423
    goto/16 :goto_17

    .line 1424
    .line 1425
    :pswitch_45
    move/from16 v24, v3

    .line 1426
    .line 1427
    const/16 v19, 0x0

    .line 1428
    .line 1429
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    check-cast v3, Ljava/util/List;

    .line 1434
    .line 1435
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1436
    .line 1437
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1438
    .line 1439
    .line 1440
    move-result v3

    .line 1441
    mul-int/lit8 v3, v3, 0x8

    .line 1442
    .line 1443
    if-lez v3, :cond_10

    .line 1444
    .line 1445
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1446
    .line 1447
    .line 1448
    move-result v5

    .line 1449
    goto/16 :goto_17

    .line 1450
    .line 1451
    :pswitch_46
    move/from16 v24, v3

    .line 1452
    .line 1453
    const/16 v19, 0x0

    .line 1454
    .line 1455
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v3

    .line 1459
    check-cast v3, Ljava/util/List;

    .line 1460
    .line 1461
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1462
    .line 1463
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1464
    .line 1465
    .line 1466
    move-result v5

    .line 1467
    if-nez v5, :cond_13

    .line 1468
    .line 1469
    :goto_18
    move/from16 v6, v19

    .line 1470
    .line 1471
    goto :goto_1a

    .line 1472
    :cond_13
    invoke-static {v3}, La/x2h0;->g(Ljava/util/List;)I

    .line 1473
    .line 1474
    .line 1475
    move-result v3

    .line 1476
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1477
    .line 1478
    .line 1479
    move-result v6

    .line 1480
    :goto_19
    mul-int/2addr v6, v5

    .line 1481
    add-int/2addr v6, v3

    .line 1482
    :cond_14
    :goto_1a
    add-int/2addr v8, v6

    .line 1483
    goto/16 :goto_14

    .line 1484
    .line 1485
    :pswitch_47
    move/from16 v24, v3

    .line 1486
    .line 1487
    const/16 v19, 0x0

    .line 1488
    .line 1489
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1490
    .line 1491
    .line 1492
    move-result-object v3

    .line 1493
    check-cast v3, Ljava/util/List;

    .line 1494
    .line 1495
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1496
    .line 1497
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1498
    .line 1499
    .line 1500
    move-result v5

    .line 1501
    if-nez v5, :cond_15

    .line 1502
    .line 1503
    goto :goto_18

    .line 1504
    :cond_15
    invoke-static {v3}, La/x2h0;->f(Ljava/util/List;)I

    .line 1505
    .line 1506
    .line 1507
    move-result v3

    .line 1508
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1509
    .line 1510
    .line 1511
    move-result v6

    .line 1512
    goto :goto_19

    .line 1513
    :pswitch_48
    move/from16 v24, v3

    .line 1514
    .line 1515
    const/16 v19, 0x0

    .line 1516
    .line 1517
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v3

    .line 1521
    check-cast v3, Ljava/util/List;

    .line 1522
    .line 1523
    invoke-static {v11, v3}, La/x2h0;->c(ILjava/util/List;)I

    .line 1524
    .line 1525
    .line 1526
    move-result v3

    .line 1527
    :goto_1b
    add-int/2addr v8, v3

    .line 1528
    goto/16 :goto_14

    .line 1529
    .line 1530
    :pswitch_49
    move/from16 v24, v3

    .line 1531
    .line 1532
    const/16 v19, 0x0

    .line 1533
    .line 1534
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v3

    .line 1538
    check-cast v3, Ljava/util/List;

    .line 1539
    .line 1540
    invoke-static {v11, v3}, La/x2h0;->b(ILjava/util/List;)I

    .line 1541
    .line 1542
    .line 1543
    move-result v3

    .line 1544
    goto :goto_1b

    .line 1545
    :pswitch_4a
    move/from16 v24, v3

    .line 1546
    .line 1547
    const/16 v19, 0x0

    .line 1548
    .line 1549
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v3

    .line 1553
    check-cast v3, Ljava/util/List;

    .line 1554
    .line 1555
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1556
    .line 1557
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1558
    .line 1559
    .line 1560
    move-result v5

    .line 1561
    if-nez v5, :cond_16

    .line 1562
    .line 1563
    goto :goto_18

    .line 1564
    :cond_16
    invoke-static {v3}, La/x2h0;->a(Ljava/util/List;)I

    .line 1565
    .line 1566
    .line 1567
    move-result v3

    .line 1568
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1569
    .line 1570
    .line 1571
    move-result v6

    .line 1572
    goto :goto_19

    .line 1573
    :pswitch_4b
    move/from16 v24, v3

    .line 1574
    .line 1575
    const/16 v19, 0x0

    .line 1576
    .line 1577
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v3

    .line 1581
    check-cast v3, Ljava/util/List;

    .line 1582
    .line 1583
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1584
    .line 1585
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1586
    .line 1587
    .line 1588
    move-result v5

    .line 1589
    if-nez v5, :cond_17

    .line 1590
    .line 1591
    goto :goto_18

    .line 1592
    :cond_17
    invoke-static {v3}, La/x2h0;->h(Ljava/util/List;)I

    .line 1593
    .line 1594
    .line 1595
    move-result v3

    .line 1596
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1597
    .line 1598
    .line 1599
    move-result v6

    .line 1600
    goto :goto_19

    .line 1601
    :pswitch_4c
    move/from16 v24, v3

    .line 1602
    .line 1603
    const/16 v19, 0x0

    .line 1604
    .line 1605
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v3

    .line 1609
    check-cast v3, Ljava/util/List;

    .line 1610
    .line 1611
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1612
    .line 1613
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1614
    .line 1615
    .line 1616
    move-result v5

    .line 1617
    if-nez v5, :cond_18

    .line 1618
    .line 1619
    goto/16 :goto_18

    .line 1620
    .line 1621
    :cond_18
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1622
    .line 1623
    .line 1624
    move-result v6

    .line 1625
    mul-int/2addr v6, v5

    .line 1626
    move/from16 v5, v19

    .line 1627
    .line 1628
    :goto_1c
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1629
    .line 1630
    .line 1631
    move-result v7

    .line 1632
    if-ge v5, v7, :cond_14

    .line 1633
    .line 1634
    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1635
    .line 1636
    .line 1637
    move-result-object v7

    .line 1638
    check-cast v7, La/lg9;

    .line 1639
    .line 1640
    invoke-virtual {v7}, La/lg9;->size()I

    .line 1641
    .line 1642
    .line 1643
    move-result v7

    .line 1644
    invoke-static {v7}, La/qyc;->d(I)I

    .line 1645
    .line 1646
    .line 1647
    move-result v9

    .line 1648
    add-int/2addr v9, v7

    .line 1649
    add-int/2addr v6, v9

    .line 1650
    add-int/lit8 v5, v5, 0x1

    .line 1651
    .line 1652
    goto :goto_1c

    .line 1653
    :pswitch_4d
    move/from16 v24, v3

    .line 1654
    .line 1655
    const/16 v19, 0x0

    .line 1656
    .line 1657
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v3

    .line 1661
    check-cast v3, Ljava/util/List;

    .line 1662
    .line 1663
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v5

    .line 1667
    sget-object v6, La/x2h0;->a:Ljava/lang/Class;

    .line 1668
    .line 1669
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1670
    .line 1671
    .line 1672
    move-result v6

    .line 1673
    if-nez v6, :cond_19

    .line 1674
    .line 1675
    move/from16 v7, v19

    .line 1676
    .line 1677
    goto :goto_1e

    .line 1678
    :cond_19
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1679
    .line 1680
    .line 1681
    move-result v7

    .line 1682
    mul-int/2addr v7, v6

    .line 1683
    move/from16 v9, v19

    .line 1684
    .line 1685
    :goto_1d
    if-ge v9, v6, :cond_1a

    .line 1686
    .line 1687
    invoke-interface {v3, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v10

    .line 1691
    check-cast v10, La/y3;

    .line 1692
    .line 1693
    invoke-virtual {v10, v5}, La/y3;->g(La/p2h0;)I

    .line 1694
    .line 1695
    .line 1696
    move-result v10

    .line 1697
    invoke-static {v10}, La/qyc;->d(I)I

    .line 1698
    .line 1699
    .line 1700
    move-result v11

    .line 1701
    add-int/2addr v11, v10

    .line 1702
    add-int/2addr v7, v11

    .line 1703
    add-int/lit8 v9, v9, 0x1

    .line 1704
    .line 1705
    goto :goto_1d

    .line 1706
    :cond_1a
    :goto_1e
    add-int/2addr v8, v7

    .line 1707
    goto/16 :goto_14

    .line 1708
    .line 1709
    :pswitch_4e
    move/from16 v24, v3

    .line 1710
    .line 1711
    const/16 v19, 0x0

    .line 1712
    .line 1713
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1714
    .line 1715
    .line 1716
    move-result-object v3

    .line 1717
    check-cast v3, Ljava/util/List;

    .line 1718
    .line 1719
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1720
    .line 1721
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1722
    .line 1723
    .line 1724
    move-result v5

    .line 1725
    if-nez v5, :cond_1b

    .line 1726
    .line 1727
    goto/16 :goto_18

    .line 1728
    .line 1729
    :cond_1b
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1730
    .line 1731
    .line 1732
    move-result v6

    .line 1733
    mul-int/2addr v6, v5

    .line 1734
    instance-of v7, v3, La/sez;

    .line 1735
    .line 1736
    if-eqz v7, :cond_1d

    .line 1737
    .line 1738
    check-cast v3, La/sez;

    .line 1739
    .line 1740
    move/from16 v7, v19

    .line 1741
    .line 1742
    :goto_1f
    if-ge v7, v5, :cond_14

    .line 1743
    .line 1744
    invoke-interface {v3, v7}, La/sez;->x(I)Ljava/lang/Object;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v9

    .line 1748
    instance-of v10, v9, La/lg9;

    .line 1749
    .line 1750
    if-eqz v10, :cond_1c

    .line 1751
    .line 1752
    check-cast v9, La/lg9;

    .line 1753
    .line 1754
    invoke-virtual {v9}, La/lg9;->size()I

    .line 1755
    .line 1756
    .line 1757
    move-result v9

    .line 1758
    invoke-static {v9}, La/qyc;->d(I)I

    .line 1759
    .line 1760
    .line 1761
    move-result v10

    .line 1762
    add-int/2addr v10, v9

    .line 1763
    add-int/2addr v10, v6

    .line 1764
    move v6, v10

    .line 1765
    goto :goto_20

    .line 1766
    :cond_1c
    check-cast v9, Ljava/lang/String;

    .line 1767
    .line 1768
    invoke-static {v9}, La/qyc;->b(Ljava/lang/String;)I

    .line 1769
    .line 1770
    .line 1771
    move-result v9

    .line 1772
    add-int/2addr v9, v6

    .line 1773
    move v6, v9

    .line 1774
    :goto_20
    add-int/lit8 v7, v7, 0x1

    .line 1775
    .line 1776
    goto :goto_1f

    .line 1777
    :cond_1d
    move/from16 v7, v19

    .line 1778
    .line 1779
    :goto_21
    if-ge v7, v5, :cond_14

    .line 1780
    .line 1781
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v9

    .line 1785
    instance-of v10, v9, La/lg9;

    .line 1786
    .line 1787
    if-eqz v10, :cond_1e

    .line 1788
    .line 1789
    check-cast v9, La/lg9;

    .line 1790
    .line 1791
    invoke-virtual {v9}, La/lg9;->size()I

    .line 1792
    .line 1793
    .line 1794
    move-result v9

    .line 1795
    invoke-static {v9}, La/qyc;->d(I)I

    .line 1796
    .line 1797
    .line 1798
    move-result v10

    .line 1799
    add-int/2addr v10, v9

    .line 1800
    add-int/2addr v10, v6

    .line 1801
    move v6, v10

    .line 1802
    goto :goto_22

    .line 1803
    :cond_1e
    check-cast v9, Ljava/lang/String;

    .line 1804
    .line 1805
    invoke-static {v9}, La/qyc;->b(Ljava/lang/String;)I

    .line 1806
    .line 1807
    .line 1808
    move-result v9

    .line 1809
    add-int/2addr v9, v6

    .line 1810
    move v6, v9

    .line 1811
    :goto_22
    add-int/lit8 v7, v7, 0x1

    .line 1812
    .line 1813
    goto :goto_21

    .line 1814
    :pswitch_4f
    move/from16 v24, v3

    .line 1815
    .line 1816
    move/from16 v22, v14

    .line 1817
    .line 1818
    const/16 v19, 0x0

    .line 1819
    .line 1820
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v3

    .line 1824
    check-cast v3, Ljava/util/List;

    .line 1825
    .line 1826
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1827
    .line 1828
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1829
    .line 1830
    .line 1831
    move-result v3

    .line 1832
    if-nez v3, :cond_1f

    .line 1833
    .line 1834
    move/from16 v5, v19

    .line 1835
    .line 1836
    goto :goto_23

    .line 1837
    :cond_1f
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1838
    .line 1839
    .line 1840
    move-result v5

    .line 1841
    add-int/lit8 v5, v5, 0x1

    .line 1842
    .line 1843
    mul-int/2addr v5, v3

    .line 1844
    :goto_23
    add-int/2addr v8, v5

    .line 1845
    goto/16 :goto_14

    .line 1846
    .line 1847
    :pswitch_50
    move/from16 v24, v3

    .line 1848
    .line 1849
    const/16 v19, 0x0

    .line 1850
    .line 1851
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1852
    .line 1853
    .line 1854
    move-result-object v3

    .line 1855
    check-cast v3, Ljava/util/List;

    .line 1856
    .line 1857
    invoke-static {v11, v3}, La/x2h0;->b(ILjava/util/List;)I

    .line 1858
    .line 1859
    .line 1860
    move-result v3

    .line 1861
    goto/16 :goto_1b

    .line 1862
    .line 1863
    :pswitch_51
    move/from16 v24, v3

    .line 1864
    .line 1865
    const/16 v19, 0x0

    .line 1866
    .line 1867
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v3

    .line 1871
    check-cast v3, Ljava/util/List;

    .line 1872
    .line 1873
    invoke-static {v11, v3}, La/x2h0;->c(ILjava/util/List;)I

    .line 1874
    .line 1875
    .line 1876
    move-result v3

    .line 1877
    goto/16 :goto_1b

    .line 1878
    .line 1879
    :pswitch_52
    move/from16 v24, v3

    .line 1880
    .line 1881
    const/16 v19, 0x0

    .line 1882
    .line 1883
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v3

    .line 1887
    check-cast v3, Ljava/util/List;

    .line 1888
    .line 1889
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1890
    .line 1891
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1892
    .line 1893
    .line 1894
    move-result v5

    .line 1895
    if-nez v5, :cond_20

    .line 1896
    .line 1897
    goto/16 :goto_18

    .line 1898
    .line 1899
    :cond_20
    invoke-static {v3}, La/x2h0;->d(Ljava/util/List;)I

    .line 1900
    .line 1901
    .line 1902
    move-result v3

    .line 1903
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1904
    .line 1905
    .line 1906
    move-result v6

    .line 1907
    goto/16 :goto_19

    .line 1908
    .line 1909
    :pswitch_53
    move/from16 v24, v3

    .line 1910
    .line 1911
    const/16 v19, 0x0

    .line 1912
    .line 1913
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1914
    .line 1915
    .line 1916
    move-result-object v3

    .line 1917
    check-cast v3, Ljava/util/List;

    .line 1918
    .line 1919
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1920
    .line 1921
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1922
    .line 1923
    .line 1924
    move-result v5

    .line 1925
    if-nez v5, :cond_21

    .line 1926
    .line 1927
    goto/16 :goto_18

    .line 1928
    .line 1929
    :cond_21
    invoke-static {v3}, La/x2h0;->i(Ljava/util/List;)I

    .line 1930
    .line 1931
    .line 1932
    move-result v3

    .line 1933
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1934
    .line 1935
    .line 1936
    move-result v6

    .line 1937
    goto/16 :goto_19

    .line 1938
    .line 1939
    :pswitch_54
    move/from16 v24, v3

    .line 1940
    .line 1941
    const/16 v19, 0x0

    .line 1942
    .line 1943
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v3

    .line 1947
    check-cast v3, Ljava/util/List;

    .line 1948
    .line 1949
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1950
    .line 1951
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1952
    .line 1953
    .line 1954
    move-result v5

    .line 1955
    if-nez v5, :cond_22

    .line 1956
    .line 1957
    goto/16 :goto_18

    .line 1958
    .line 1959
    :cond_22
    invoke-static {v3}, La/x2h0;->e(Ljava/util/List;)I

    .line 1960
    .line 1961
    .line 1962
    move-result v5

    .line 1963
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 1964
    .line 1965
    .line 1966
    move-result v3

    .line 1967
    invoke-static {v11}, La/qyc;->c(I)I

    .line 1968
    .line 1969
    .line 1970
    move-result v6

    .line 1971
    mul-int/2addr v6, v3

    .line 1972
    add-int/2addr v6, v5

    .line 1973
    goto/16 :goto_1a

    .line 1974
    .line 1975
    :pswitch_55
    move/from16 v24, v3

    .line 1976
    .line 1977
    const/16 v19, 0x0

    .line 1978
    .line 1979
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1980
    .line 1981
    .line 1982
    move-result-object v3

    .line 1983
    check-cast v3, Ljava/util/List;

    .line 1984
    .line 1985
    invoke-static {v11, v3}, La/x2h0;->b(ILjava/util/List;)I

    .line 1986
    .line 1987
    .line 1988
    move-result v3

    .line 1989
    goto/16 :goto_1b

    .line 1990
    .line 1991
    :pswitch_56
    move/from16 v24, v3

    .line 1992
    .line 1993
    const/16 v19, 0x0

    .line 1994
    .line 1995
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v3

    .line 1999
    check-cast v3, Ljava/util/List;

    .line 2000
    .line 2001
    invoke-static {v11, v3}, La/x2h0;->c(ILjava/util/List;)I

    .line 2002
    .line 2003
    .line 2004
    move-result v3

    .line 2005
    goto/16 :goto_1b

    .line 2006
    .line 2007
    :pswitch_57
    const/16 v19, 0x0

    .line 2008
    .line 2009
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2010
    .line 2011
    .line 2012
    move-result v5

    .line 2013
    if-eqz v5, :cond_26

    .line 2014
    .line 2015
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2016
    .line 2017
    .line 2018
    move-result-object v5

    .line 2019
    check-cast v5, La/y3;

    .line 2020
    .line 2021
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v6

    .line 2025
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2026
    .line 2027
    .line 2028
    move-result v7

    .line 2029
    mul-int/lit8 v7, v7, 0x2

    .line 2030
    .line 2031
    invoke-virtual {v5, v6}, La/y3;->g(La/p2h0;)I

    .line 2032
    .line 2033
    .line 2034
    move-result v5

    .line 2035
    add-int/2addr v5, v7

    .line 2036
    :goto_24
    add-int/2addr v8, v5

    .line 2037
    goto/16 :goto_2c

    .line 2038
    .line 2039
    :pswitch_58
    move/from16 v20, v9

    .line 2040
    .line 2041
    move/from16 v22, v14

    .line 2042
    .line 2043
    const/16 v19, 0x0

    .line 2044
    .line 2045
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v5

    .line 2049
    if-eqz v5, :cond_23

    .line 2050
    .line 2051
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2052
    .line 2053
    .line 2054
    move-result-wide v5

    .line 2055
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2056
    .line 2057
    .line 2058
    move-result v0

    .line 2059
    shl-long v9, v5, v22

    .line 2060
    .line 2061
    shr-long v5, v5, v20

    .line 2062
    .line 2063
    xor-long/2addr v5, v9

    .line 2064
    invoke-static {v5, v6}, La/qyc;->e(J)I

    .line 2065
    .line 2066
    .line 2067
    move-result v5

    .line 2068
    :goto_25
    add-int/2addr v5, v0

    .line 2069
    add-int/2addr v8, v5

    .line 2070
    :cond_23
    :goto_26
    move-object/from16 v0, p0

    .line 2071
    .line 2072
    goto/16 :goto_2c

    .line 2073
    .line 2074
    :pswitch_59
    const/16 v19, 0x0

    .line 2075
    .line 2076
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2077
    .line 2078
    .line 2079
    move-result v5

    .line 2080
    if-eqz v5, :cond_23

    .line 2081
    .line 2082
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2083
    .line 2084
    .line 2085
    move-result v0

    .line 2086
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2087
    .line 2088
    .line 2089
    move-result v5

    .line 2090
    shl-int/lit8 v6, v0, 0x1

    .line 2091
    .line 2092
    shr-int/lit8 v0, v0, 0x1f

    .line 2093
    .line 2094
    xor-int/2addr v0, v6

    .line 2095
    invoke-static {v0}, La/qyc;->d(I)I

    .line 2096
    .line 2097
    .line 2098
    move-result v0

    .line 2099
    :goto_27
    add-int/2addr v0, v5

    .line 2100
    add-int/2addr v8, v0

    .line 2101
    goto :goto_26

    .line 2102
    :pswitch_5a
    const/16 v19, 0x0

    .line 2103
    .line 2104
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2105
    .line 2106
    .line 2107
    move-result v5

    .line 2108
    if-eqz v5, :cond_24

    .line 2109
    .line 2110
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2111
    .line 2112
    .line 2113
    move-result v0

    .line 2114
    :goto_28
    add-int/lit8 v0, v0, 0x8

    .line 2115
    .line 2116
    :goto_29
    add-int/2addr v8, v0

    .line 2117
    :cond_24
    move-object/from16 v0, p0

    .line 2118
    .line 2119
    move-object/from16 v1, p1

    .line 2120
    .line 2121
    goto/16 :goto_2c

    .line 2122
    .line 2123
    :pswitch_5b
    const/16 v19, 0x0

    .line 2124
    .line 2125
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2126
    .line 2127
    .line 2128
    move-result v5

    .line 2129
    if-eqz v5, :cond_24

    .line 2130
    .line 2131
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2132
    .line 2133
    .line 2134
    move-result v0

    .line 2135
    :goto_2a
    add-int/lit8 v0, v0, 0x4

    .line 2136
    .line 2137
    goto :goto_29

    .line 2138
    :pswitch_5c
    const/16 v19, 0x0

    .line 2139
    .line 2140
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2141
    .line 2142
    .line 2143
    move-result v5

    .line 2144
    if-eqz v5, :cond_23

    .line 2145
    .line 2146
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2147
    .line 2148
    .line 2149
    move-result v0

    .line 2150
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2151
    .line 2152
    .line 2153
    move-result v5

    .line 2154
    invoke-static {v0}, La/qyc;->a(I)I

    .line 2155
    .line 2156
    .line 2157
    move-result v0

    .line 2158
    goto :goto_27

    .line 2159
    :pswitch_5d
    const/16 v19, 0x0

    .line 2160
    .line 2161
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2162
    .line 2163
    .line 2164
    move-result v5

    .line 2165
    if-eqz v5, :cond_23

    .line 2166
    .line 2167
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2168
    .line 2169
    .line 2170
    move-result v0

    .line 2171
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2172
    .line 2173
    .line 2174
    move-result v5

    .line 2175
    invoke-static {v0}, La/qyc;->d(I)I

    .line 2176
    .line 2177
    .line 2178
    move-result v0

    .line 2179
    goto :goto_27

    .line 2180
    :pswitch_5e
    const/16 v19, 0x0

    .line 2181
    .line 2182
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2183
    .line 2184
    .line 2185
    move-result v5

    .line 2186
    if-eqz v5, :cond_23

    .line 2187
    .line 2188
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v0

    .line 2192
    check-cast v0, La/lg9;

    .line 2193
    .line 2194
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2195
    .line 2196
    .line 2197
    move-result v5

    .line 2198
    invoke-virtual {v0}, La/lg9;->size()I

    .line 2199
    .line 2200
    .line 2201
    move-result v0

    .line 2202
    invoke-static {v0, v0, v5, v8}, La/f140;->x(IIII)I

    .line 2203
    .line 2204
    .line 2205
    move-result v8

    .line 2206
    goto/16 :goto_26

    .line 2207
    .line 2208
    :pswitch_5f
    const/16 v19, 0x0

    .line 2209
    .line 2210
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2211
    .line 2212
    .line 2213
    move-result v5

    .line 2214
    if-eqz v5, :cond_26

    .line 2215
    .line 2216
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v5

    .line 2220
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 2221
    .line 2222
    .line 2223
    move-result-object v6

    .line 2224
    sget-object v7, La/x2h0;->a:Ljava/lang/Class;

    .line 2225
    .line 2226
    check-cast v5, La/y3;

    .line 2227
    .line 2228
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2229
    .line 2230
    .line 2231
    move-result v7

    .line 2232
    invoke-virtual {v5, v6}, La/y3;->g(La/p2h0;)I

    .line 2233
    .line 2234
    .line 2235
    move-result v5

    .line 2236
    invoke-static {v5, v5, v7, v8}, La/f140;->x(IIII)I

    .line 2237
    .line 2238
    .line 2239
    move-result v8

    .line 2240
    goto/16 :goto_2c

    .line 2241
    .line 2242
    :pswitch_60
    const/16 v19, 0x0

    .line 2243
    .line 2244
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2245
    .line 2246
    .line 2247
    move-result v5

    .line 2248
    if-eqz v5, :cond_23

    .line 2249
    .line 2250
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2251
    .line 2252
    .line 2253
    move-result-object v0

    .line 2254
    instance-of v5, v0, La/lg9;

    .line 2255
    .line 2256
    if-eqz v5, :cond_25

    .line 2257
    .line 2258
    check-cast v0, La/lg9;

    .line 2259
    .line 2260
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2261
    .line 2262
    .line 2263
    move-result v5

    .line 2264
    invoke-virtual {v0}, La/lg9;->size()I

    .line 2265
    .line 2266
    .line 2267
    move-result v0

    .line 2268
    invoke-static {v0, v0, v5, v8}, La/f140;->x(IIII)I

    .line 2269
    .line 2270
    .line 2271
    move-result v0

    .line 2272
    :goto_2b
    move v8, v0

    .line 2273
    goto/16 :goto_26

    .line 2274
    .line 2275
    :cond_25
    check-cast v0, Ljava/lang/String;

    .line 2276
    .line 2277
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2278
    .line 2279
    .line 2280
    move-result v5

    .line 2281
    invoke-static {v0}, La/qyc;->b(Ljava/lang/String;)I

    .line 2282
    .line 2283
    .line 2284
    move-result v0

    .line 2285
    add-int/2addr v0, v5

    .line 2286
    add-int/2addr v0, v8

    .line 2287
    goto :goto_2b

    .line 2288
    :pswitch_61
    move/from16 v22, v14

    .line 2289
    .line 2290
    const/16 v19, 0x0

    .line 2291
    .line 2292
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2293
    .line 2294
    .line 2295
    move-result v5

    .line 2296
    if-eqz v5, :cond_24

    .line 2297
    .line 2298
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2299
    .line 2300
    .line 2301
    move-result v0

    .line 2302
    add-int/lit8 v0, v0, 0x1

    .line 2303
    .line 2304
    goto/16 :goto_29

    .line 2305
    .line 2306
    :pswitch_62
    const/16 v19, 0x0

    .line 2307
    .line 2308
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2309
    .line 2310
    .line 2311
    move-result v5

    .line 2312
    if-eqz v5, :cond_24

    .line 2313
    .line 2314
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2315
    .line 2316
    .line 2317
    move-result v0

    .line 2318
    goto/16 :goto_2a

    .line 2319
    .line 2320
    :pswitch_63
    const/16 v19, 0x0

    .line 2321
    .line 2322
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2323
    .line 2324
    .line 2325
    move-result v5

    .line 2326
    if-eqz v5, :cond_24

    .line 2327
    .line 2328
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2329
    .line 2330
    .line 2331
    move-result v0

    .line 2332
    goto/16 :goto_28

    .line 2333
    .line 2334
    :pswitch_64
    const/16 v19, 0x0

    .line 2335
    .line 2336
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2337
    .line 2338
    .line 2339
    move-result v5

    .line 2340
    if-eqz v5, :cond_23

    .line 2341
    .line 2342
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2343
    .line 2344
    .line 2345
    move-result v0

    .line 2346
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2347
    .line 2348
    .line 2349
    move-result v5

    .line 2350
    invoke-static {v0}, La/qyc;->a(I)I

    .line 2351
    .line 2352
    .line 2353
    move-result v0

    .line 2354
    goto/16 :goto_27

    .line 2355
    .line 2356
    :pswitch_65
    const/16 v19, 0x0

    .line 2357
    .line 2358
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2359
    .line 2360
    .line 2361
    move-result v5

    .line 2362
    if-eqz v5, :cond_23

    .line 2363
    .line 2364
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2365
    .line 2366
    .line 2367
    move-result-wide v5

    .line 2368
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2369
    .line 2370
    .line 2371
    move-result v0

    .line 2372
    invoke-static {v5, v6}, La/qyc;->e(J)I

    .line 2373
    .line 2374
    .line 2375
    move-result v5

    .line 2376
    goto/16 :goto_25

    .line 2377
    .line 2378
    :pswitch_66
    const/16 v19, 0x0

    .line 2379
    .line 2380
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2381
    .line 2382
    .line 2383
    move-result v5

    .line 2384
    if-eqz v5, :cond_23

    .line 2385
    .line 2386
    invoke-virtual {v15, v1, v12, v13}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2387
    .line 2388
    .line 2389
    move-result-wide v5

    .line 2390
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2391
    .line 2392
    .line 2393
    move-result v0

    .line 2394
    invoke-static {v5, v6}, La/qyc;->e(J)I

    .line 2395
    .line 2396
    .line 2397
    move-result v5

    .line 2398
    goto/16 :goto_25

    .line 2399
    .line 2400
    :pswitch_67
    const/16 v19, 0x0

    .line 2401
    .line 2402
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2403
    .line 2404
    .line 2405
    move-result v5

    .line 2406
    if-eqz v5, :cond_24

    .line 2407
    .line 2408
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2409
    .line 2410
    .line 2411
    move-result v0

    .line 2412
    goto/16 :goto_2a

    .line 2413
    .line 2414
    :pswitch_68
    const/16 v19, 0x0

    .line 2415
    .line 2416
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2417
    .line 2418
    .line 2419
    move-result v5

    .line 2420
    if-eqz v5, :cond_26

    .line 2421
    .line 2422
    invoke-static {v11}, La/qyc;->c(I)I

    .line 2423
    .line 2424
    .line 2425
    move-result v5

    .line 2426
    add-int/lit8 v5, v5, 0x8

    .line 2427
    .line 2428
    goto/16 :goto_24

    .line 2429
    .line 2430
    :cond_26
    :goto_2c
    add-int/lit8 v2, v2, 0x3

    .line 2431
    .line 2432
    const v7, 0xfffff

    .line 2433
    .line 2434
    .line 2435
    goto/16 :goto_0

    .line 2436
    .line 2437
    :cond_27
    iget-object v0, v0, La/p640;->h:La/aet0;

    .line 2438
    .line 2439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2440
    .line 2441
    .line 2442
    iget-object v0, v1, La/kjt;->unknownFields:La/xdt0;

    .line 2443
    .line 2444
    invoke-virtual {v0}, La/xdt0;->a()I

    .line 2445
    .line 2446
    .line 2447
    move-result v0

    .line 2448
    add-int/2addr v0, v8

    .line 2449
    return v0

    .line 2450
    nop

    .line 2451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
    .line 2499
    .line 2500
    .line 2501
    .line 2502
    .line 2503
    .line 2504
    .line 2505
    .line 2506
    .line 2507
    .line 2508
    .line 2509
    .line 2510
    .line 2511
    .line 2512
    .line 2513
    .line 2514
    .line 2515
    .line 2516
    .line 2517
    .line 2518
    .line 2519
    .line 2520
    .line 2521
    .line 2522
    .line 2523
    .line 2524
    .line 2525
    .line 2526
    .line 2527
    .line 2528
    .line 2529
    .line 2530
    .line 2531
    .line 2532
    .line 2533
    .line 2534
    .line 2535
    .line 2536
    .line 2537
    .line 2538
    .line 2539
    .line 2540
    .line 2541
    .line 2542
    .line 2543
    .line 2544
    .line 2545
    .line 2546
    .line 2547
    .line 2548
    .line 2549
    .line 2550
    .line 2551
    .line 2552
    .line 2553
    .line 2554
    .line 2555
    .line 2556
    .line 2557
    .line 2558
    .line 2559
    .line 2560
    .line 2561
    .line 2562
    .line 2563
    .line 2564
    .line 2565
    .line 2566
    .line 2567
    .line 2568
    .line 2569
    .line 2570
    .line 2571
    .line 2572
    .line 2573
    .line 2574
    .line 2575
    .line 2576
    .line 2577
    .line 2578
    .line 2579
    .line 2580
    .line 2581
    .line 2582
    .line 2583
    .line 2584
    .line 2585
    .line 2586
    .line 2587
    .line 2588
    .line 2589
    .line 2590
    .line 2591
    .line 2592
    .line 2593
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 2594
    .line 2595
    .line 2596
    .line 2597
    .line 2598
    .line 2599
    .line 2600
    .line 2601
    .line 2602
    .line 2603
    .line 2604
    .line 2605
    .line 2606
    .line 2607
    .line 2608
    .line 2609
    .line 2610
    .line 2611
    .line 2612
    .line 2613
    .line 2614
    .line 2615
    .line 2616
    .line 2617
    .line 2618
    .line 2619
    .line 2620
    .line 2621
    .line 2622
    .line 2623
    .line 2624
    .line 2625
    .line 2626
    .line 2627
    .line 2628
    .line 2629
    .line 2630
    .line 2631
    .line 2632
    .line 2633
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch
.end method

.method public final f(La/kjt;La/kjt;)Z
    .locals 11

    .line 1
    iget-object v0, p0, La/p640;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    const/4 v4, 0x1

    .line 7
    if-ge v3, v1, :cond_2

    .line 8
    .line 9
    invoke-virtual {p0, v3}, La/p640;->w(I)I

    .line 10
    .line 11
    .line 12
    move-result v5

    .line 13
    const v6, 0xfffff

    .line 14
    .line 15
    .line 16
    and-int v7, v5, v6

    .line 17
    .line 18
    int-to-long v7, v7

    .line 19
    invoke-static {v5}, La/p640;->v(I)I

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    goto/16 :goto_1

    .line 27
    .line 28
    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    .line 29
    .line 30
    aget v5, v0, v5

    .line 31
    .line 32
    and-int/2addr v5, v6

    .line 33
    int-to-long v5, v5

    .line 34
    invoke-static {p1, v5, v6}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 35
    .line 36
    .line 37
    move-result v9

    .line 38
    invoke-static {p2, v5, v6}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-ne v9, v5, :cond_0

    .line 43
    .line 44
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    invoke-static {v5, v6}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_0

    .line 57
    .line 58
    goto/16 :goto_1

    .line 59
    .line 60
    :cond_0
    move v4, v2

    .line 61
    goto/16 :goto_1

    .line 62
    .line 63
    :pswitch_1
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-static {v4, v5}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    goto/16 :goto_1

    .line 76
    .line 77
    :pswitch_2
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    invoke-static {v4, v5}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    goto/16 :goto_1

    .line 90
    .line 91
    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_0

    .line 96
    .line 97
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v5

    .line 101
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    invoke-static {v5, v6}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_0

    .line 110
    .line 111
    goto/16 :goto_1

    .line 112
    .line 113
    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_0

    .line 118
    .line 119
    invoke-static {p1, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 120
    .line 121
    .line 122
    move-result-wide v5

    .line 123
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 124
    .line 125
    .line 126
    move-result-wide v7

    .line 127
    cmp-long v5, v5, v7

    .line 128
    .line 129
    if-nez v5, :cond_0

    .line 130
    .line 131
    goto/16 :goto_1

    .line 132
    .line 133
    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-eqz v5, :cond_0

    .line 138
    .line 139
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 140
    .line 141
    .line 142
    move-result v5

    .line 143
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-ne v5, v6, :cond_0

    .line 148
    .line 149
    goto/16 :goto_1

    .line 150
    .line 151
    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    if-eqz v5, :cond_0

    .line 156
    .line 157
    invoke-static {p1, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 158
    .line 159
    .line 160
    move-result-wide v5

    .line 161
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 162
    .line 163
    .line 164
    move-result-wide v7

    .line 165
    cmp-long v5, v5, v7

    .line 166
    .line 167
    if-nez v5, :cond_0

    .line 168
    .line 169
    goto/16 :goto_1

    .line 170
    .line 171
    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_0

    .line 176
    .line 177
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 182
    .line 183
    .line 184
    move-result v6

    .line 185
    if-ne v5, v6, :cond_0

    .line 186
    .line 187
    goto/16 :goto_1

    .line 188
    .line 189
    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_0

    .line 194
    .line 195
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-ne v5, v6, :cond_0

    .line 204
    .line 205
    goto/16 :goto_1

    .line 206
    .line 207
    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    if-eqz v5, :cond_0

    .line 212
    .line 213
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 218
    .line 219
    .line 220
    move-result v6

    .line 221
    if-ne v5, v6, :cond_0

    .line 222
    .line 223
    goto/16 :goto_1

    .line 224
    .line 225
    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 226
    .line 227
    .line 228
    move-result v5

    .line 229
    if-eqz v5, :cond_0

    .line 230
    .line 231
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v5

    .line 235
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v6

    .line 239
    invoke-static {v5, v6}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    if-eqz v5, :cond_0

    .line 244
    .line 245
    goto/16 :goto_1

    .line 246
    .line 247
    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_0

    .line 252
    .line 253
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v6

    .line 261
    invoke-static {v5, v6}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v5

    .line 265
    if-eqz v5, :cond_0

    .line 266
    .line 267
    goto/16 :goto_1

    .line 268
    .line 269
    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 270
    .line 271
    .line 272
    move-result v5

    .line 273
    if-eqz v5, :cond_0

    .line 274
    .line 275
    invoke-static {p1, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    invoke-static {p2, v7, v8}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    invoke-static {v5, v6}, La/x2h0;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 284
    .line 285
    .line 286
    move-result v5

    .line 287
    if-eqz v5, :cond_0

    .line 288
    .line 289
    goto/16 :goto_1

    .line 290
    .line 291
    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 292
    .line 293
    .line 294
    move-result v5

    .line 295
    if-eqz v5, :cond_0

    .line 296
    .line 297
    sget-object v5, La/ift0;->c:La/gft0;

    .line 298
    .line 299
    invoke-virtual {v5, p1, v7, v8}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-virtual {v5, p2, v7, v8}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 304
    .line 305
    .line 306
    move-result v5

    .line 307
    if-ne v6, v5, :cond_0

    .line 308
    .line 309
    goto/16 :goto_1

    .line 310
    .line 311
    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 312
    .line 313
    .line 314
    move-result v5

    .line 315
    if-eqz v5, :cond_0

    .line 316
    .line 317
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 318
    .line 319
    .line 320
    move-result v5

    .line 321
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 322
    .line 323
    .line 324
    move-result v6

    .line 325
    if-ne v5, v6, :cond_0

    .line 326
    .line 327
    goto/16 :goto_1

    .line 328
    .line 329
    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 330
    .line 331
    .line 332
    move-result v5

    .line 333
    if-eqz v5, :cond_0

    .line 334
    .line 335
    invoke-static {p1, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 336
    .line 337
    .line 338
    move-result-wide v5

    .line 339
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 340
    .line 341
    .line 342
    move-result-wide v7

    .line 343
    cmp-long v5, v5, v7

    .line 344
    .line 345
    if-nez v5, :cond_0

    .line 346
    .line 347
    goto/16 :goto_1

    .line 348
    .line 349
    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 350
    .line 351
    .line 352
    move-result v5

    .line 353
    if-eqz v5, :cond_0

    .line 354
    .line 355
    invoke-static {p1, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 356
    .line 357
    .line 358
    move-result v5

    .line 359
    invoke-static {p2, v7, v8}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 360
    .line 361
    .line 362
    move-result v6

    .line 363
    if-ne v5, v6, :cond_0

    .line 364
    .line 365
    goto :goto_1

    .line 366
    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 367
    .line 368
    .line 369
    move-result v5

    .line 370
    if-eqz v5, :cond_0

    .line 371
    .line 372
    invoke-static {p1, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 373
    .line 374
    .line 375
    move-result-wide v5

    .line 376
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 377
    .line 378
    .line 379
    move-result-wide v7

    .line 380
    cmp-long v5, v5, v7

    .line 381
    .line 382
    if-nez v5, :cond_0

    .line 383
    .line 384
    goto :goto_1

    .line 385
    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 386
    .line 387
    .line 388
    move-result v5

    .line 389
    if-eqz v5, :cond_0

    .line 390
    .line 391
    invoke-static {p1, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 392
    .line 393
    .line 394
    move-result-wide v5

    .line 395
    invoke-static {p2, v7, v8}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 396
    .line 397
    .line 398
    move-result-wide v7

    .line 399
    cmp-long v5, v5, v7

    .line 400
    .line 401
    if-nez v5, :cond_0

    .line 402
    .line 403
    goto :goto_1

    .line 404
    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    if-eqz v5, :cond_0

    .line 409
    .line 410
    sget-object v5, La/ift0;->c:La/gft0;

    .line 411
    .line 412
    invoke-virtual {v5, p1, v7, v8}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 413
    .line 414
    .line 415
    move-result v6

    .line 416
    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 417
    .line 418
    .line 419
    move-result v6

    .line 420
    invoke-virtual {v5, p2, v7, v8}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 421
    .line 422
    .line 423
    move-result v5

    .line 424
    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 425
    .line 426
    .line 427
    move-result v5

    .line 428
    if-ne v6, v5, :cond_0

    .line 429
    .line 430
    goto :goto_1

    .line 431
    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, La/p640;->i(La/kjt;La/kjt;I)Z

    .line 432
    .line 433
    .line 434
    move-result v5

    .line 435
    if-eqz v5, :cond_0

    .line 436
    .line 437
    sget-object v5, La/ift0;->c:La/gft0;

    .line 438
    .line 439
    invoke-virtual {v5, p1, v7, v8}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 440
    .line 441
    .line 442
    move-result-wide v9

    .line 443
    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 444
    .line 445
    .line 446
    move-result-wide v9

    .line 447
    invoke-virtual {v5, p2, v7, v8}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 448
    .line 449
    .line 450
    move-result-wide v5

    .line 451
    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 452
    .line 453
    .line 454
    move-result-wide v5

    .line 455
    cmp-long v5, v9, v5

    .line 456
    .line 457
    if-nez v5, :cond_0

    .line 458
    .line 459
    :goto_1
    if-nez v4, :cond_1

    .line 460
    .line 461
    goto :goto_2

    .line 462
    :cond_1
    add-int/lit8 v3, v3, 0x3

    .line 463
    .line 464
    goto/16 :goto_0

    .line 465
    .line 466
    :cond_2
    iget-object p0, p0, La/p640;->h:La/aet0;

    .line 467
    .line 468
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    iget-object p0, p1, La/kjt;->unknownFields:La/xdt0;

    .line 472
    .line 473
    iget-object p1, p2, La/kjt;->unknownFields:La/xdt0;

    .line 474
    .line 475
    invoke-virtual {p0, p1}, La/xdt0;->equals(Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result p0

    .line 479
    if-nez p0, :cond_3

    .line 480
    .line 481
    :goto_2
    return v2

    .line 482
    :cond_3
    return v4

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;La/prc;)V
    .locals 31

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v2, v6, La/prc;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v7, v2

    .line 13
    check-cast v7, La/qyc;

    .line 14
    .line 15
    iget-object v8, v0, La/p640;->a:[I

    .line 16
    .line 17
    array-length v9, v8

    .line 18
    const v10, 0xfffff

    .line 19
    .line 20
    .line 21
    move v3, v10

    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-ge v2, v9, :cond_16

    .line 25
    .line 26
    invoke-virtual {v0, v2}, La/p640;->w(I)I

    .line 27
    .line 28
    .line 29
    move-result v5

    .line 30
    aget v12, v8, v2

    .line 31
    .line 32
    invoke-static {v5}, La/p640;->v(I)I

    .line 33
    .line 34
    .line 35
    move-result v13

    .line 36
    const/16 v14, 0x11

    .line 37
    .line 38
    const/16 v16, 0x1

    .line 39
    .line 40
    sget-object v15, La/p640;->k:Lsun/misc/Unsafe;

    .line 41
    .line 42
    if-gt v13, v14, :cond_2

    .line 43
    .line 44
    add-int/lit8 v14, v2, 0x2

    .line 45
    .line 46
    aget v14, v8, v14

    .line 47
    .line 48
    and-int v11, v14, v10

    .line 49
    .line 50
    if-eq v11, v3, :cond_1

    .line 51
    .line 52
    if-ne v11, v10, :cond_0

    .line 53
    .line 54
    const/4 v4, 0x0

    .line 55
    goto :goto_1

    .line 56
    :cond_0
    int-to-long v3, v11

    .line 57
    invoke-virtual {v15, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    move v4, v3

    .line 62
    :goto_1
    move v3, v11

    .line 63
    :cond_1
    ushr-int/lit8 v11, v14, 0x14

    .line 64
    .line 65
    shl-int v11, v16, v11

    .line 66
    .line 67
    move/from16 v30, v11

    .line 68
    .line 69
    move v11, v5

    .line 70
    move/from16 v5, v30

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_2
    move v11, v5

    .line 74
    const/4 v5, 0x0

    .line 75
    :goto_2
    and-int/2addr v11, v10

    .line 76
    int-to-long v10, v11

    .line 77
    const/16 v17, 0x3f

    .line 78
    .line 79
    const/4 v14, 0x2

    .line 80
    packed-switch v13, :pswitch_data_0

    .line 81
    .line 82
    .line 83
    :cond_3
    :goto_3
    const/4 v13, 0x0

    .line 84
    goto/16 :goto_18

    .line 85
    .line 86
    :pswitch_0
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v5

    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 97
    .line 98
    .line 99
    move-result-object v10

    .line 100
    invoke-virtual {v6, v12, v5, v10}, La/prc;->q(ILjava/lang/Object;La/p2h0;)V

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :pswitch_1
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v5

    .line 108
    if-eqz v5, :cond_3

    .line 109
    .line 110
    invoke-static {v1, v10, v11}, La/p640;->s(Ljava/lang/Object;J)J

    .line 111
    .line 112
    .line 113
    move-result-wide v10

    .line 114
    shl-long v13, v10, v16

    .line 115
    .line 116
    shr-long v10, v10, v17

    .line 117
    .line 118
    xor-long/2addr v10, v13

    .line 119
    const/4 v5, 0x0

    .line 120
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 124
    .line 125
    .line 126
    :cond_4
    move v13, v5

    .line 127
    goto/16 :goto_18

    .line 128
    .line 129
    :pswitch_2
    const/4 v5, 0x0

    .line 130
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v13

    .line 134
    if-eqz v13, :cond_4

    .line 135
    .line 136
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 137
    .line 138
    .line 139
    move-result v10

    .line 140
    shl-int/lit8 v11, v10, 0x1

    .line 141
    .line 142
    shr-int/lit8 v10, v10, 0x1f

    .line 143
    .line 144
    xor-int/2addr v10, v11

    .line 145
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v7, v10}, La/qyc;->n(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_3

    .line 152
    :pswitch_3
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    if-eqz v5, :cond_3

    .line 157
    .line 158
    invoke-static {v1, v10, v11}, La/p640;->s(Ljava/lang/Object;J)J

    .line 159
    .line 160
    .line 161
    move-result-wide v10

    .line 162
    move/from16 v5, v16

    .line 163
    .line 164
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 168
    .line 169
    .line 170
    goto :goto_3

    .line 171
    :pswitch_4
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-eqz v5, :cond_3

    .line 176
    .line 177
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    const/4 v10, 0x5

    .line 182
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v7, v5}, La/qyc;->i(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :pswitch_5
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v5

    .line 193
    if-eqz v5, :cond_3

    .line 194
    .line 195
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    const/4 v13, 0x0

    .line 200
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v7, v5}, La/qyc;->k(I)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_18

    .line 207
    .line 208
    :pswitch_6
    const/4 v13, 0x0

    .line 209
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v5

    .line 213
    if-eqz v5, :cond_15

    .line 214
    .line 215
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 216
    .line 217
    .line 218
    move-result v5

    .line 219
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v7, v5}, La/qyc;->n(I)V

    .line 223
    .line 224
    .line 225
    goto/16 :goto_3

    .line 226
    .line 227
    :pswitch_7
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v5

    .line 231
    if-eqz v5, :cond_3

    .line 232
    .line 233
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v5

    .line 237
    check-cast v5, La/lg9;

    .line 238
    .line 239
    invoke-virtual {v7, v12, v14}, La/qyc;->m(II)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v7, v5}, La/qyc;->h(La/lg9;)V

    .line 243
    .line 244
    .line 245
    goto/16 :goto_3

    .line 246
    .line 247
    :pswitch_8
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v5

    .line 251
    if-eqz v5, :cond_3

    .line 252
    .line 253
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    invoke-virtual {v6, v12, v5, v10}, La/prc;->r(ILjava/lang/Object;La/p2h0;)V

    .line 262
    .line 263
    .line 264
    goto/16 :goto_3

    .line 265
    .line 266
    :pswitch_9
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v5

    .line 270
    if-eqz v5, :cond_3

    .line 271
    .line 272
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v5

    .line 276
    instance-of v10, v5, Ljava/lang/String;

    .line 277
    .line 278
    if-eqz v10, :cond_5

    .line 279
    .line 280
    check-cast v5, Ljava/lang/String;

    .line 281
    .line 282
    invoke-virtual {v7, v12, v14}, La/qyc;->m(II)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v5}, La/qyc;->l(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_3

    .line 289
    .line 290
    :cond_5
    check-cast v5, La/lg9;

    .line 291
    .line 292
    invoke-virtual {v7, v12, v14}, La/qyc;->m(II)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v7, v5}, La/qyc;->h(La/lg9;)V

    .line 296
    .line 297
    .line 298
    goto/16 :goto_3

    .line 299
    .line 300
    :pswitch_a
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v5

    .line 304
    if-eqz v5, :cond_3

    .line 305
    .line 306
    invoke-static {v1, v10, v11}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v5

    .line 310
    check-cast v5, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    const/4 v13, 0x0

    .line 317
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 318
    .line 319
    .line 320
    int-to-byte v5, v5

    .line 321
    invoke-virtual {v7, v5}, La/qyc;->f(B)V

    .line 322
    .line 323
    .line 324
    goto/16 :goto_3

    .line 325
    .line 326
    :pswitch_b
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-eqz v5, :cond_3

    .line 331
    .line 332
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 333
    .line 334
    .line 335
    move-result v5

    .line 336
    const/4 v10, 0x5

    .line 337
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v7, v5}, La/qyc;->i(I)V

    .line 341
    .line 342
    .line 343
    goto/16 :goto_3

    .line 344
    .line 345
    :pswitch_c
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 346
    .line 347
    .line 348
    move-result v5

    .line 349
    if-eqz v5, :cond_3

    .line 350
    .line 351
    invoke-static {v1, v10, v11}, La/p640;->s(Ljava/lang/Object;J)J

    .line 352
    .line 353
    .line 354
    move-result-wide v10

    .line 355
    const/4 v5, 0x1

    .line 356
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 360
    .line 361
    .line 362
    goto/16 :goto_3

    .line 363
    .line 364
    :pswitch_d
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v5

    .line 368
    if-eqz v5, :cond_3

    .line 369
    .line 370
    invoke-static {v1, v10, v11}, La/p640;->r(Ljava/lang/Object;J)I

    .line 371
    .line 372
    .line 373
    move-result v5

    .line 374
    const/4 v13, 0x0

    .line 375
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 376
    .line 377
    .line 378
    invoke-virtual {v7, v5}, La/qyc;->k(I)V

    .line 379
    .line 380
    .line 381
    goto/16 :goto_18

    .line 382
    .line 383
    :pswitch_e
    const/4 v13, 0x0

    .line 384
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    if-eqz v5, :cond_15

    .line 389
    .line 390
    invoke-static {v1, v10, v11}, La/p640;->s(Ljava/lang/Object;J)J

    .line 391
    .line 392
    .line 393
    move-result-wide v10

    .line 394
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 398
    .line 399
    .line 400
    goto/16 :goto_18

    .line 401
    .line 402
    :pswitch_f
    const/4 v13, 0x0

    .line 403
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v5

    .line 407
    if-eqz v5, :cond_15

    .line 408
    .line 409
    invoke-static {v1, v10, v11}, La/p640;->s(Ljava/lang/Object;J)J

    .line 410
    .line 411
    .line 412
    move-result-wide v10

    .line 413
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_3

    .line 420
    .line 421
    :pswitch_10
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 422
    .line 423
    .line 424
    move-result v5

    .line 425
    if-eqz v5, :cond_3

    .line 426
    .line 427
    invoke-static {v1, v10, v11}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    check-cast v5, Ljava/lang/Float;

    .line 432
    .line 433
    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    .line 434
    .line 435
    .line 436
    move-result v5

    .line 437
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 438
    .line 439
    .line 440
    move-result v5

    .line 441
    const/4 v10, 0x5

    .line 442
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v7, v5}, La/qyc;->i(I)V

    .line 446
    .line 447
    .line 448
    goto/16 :goto_3

    .line 449
    .line 450
    :pswitch_11
    invoke-virtual {v0, v12, v2, v1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 451
    .line 452
    .line 453
    move-result v5

    .line 454
    if-eqz v5, :cond_3

    .line 455
    .line 456
    invoke-static {v1, v10, v11}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    check-cast v5, Ljava/lang/Double;

    .line 461
    .line 462
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    .line 463
    .line 464
    .line 465
    move-result-wide v10

    .line 466
    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 467
    .line 468
    .line 469
    move-result-wide v10

    .line 470
    const/4 v5, 0x1

    .line 471
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 472
    .line 473
    .line 474
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 475
    .line 476
    .line 477
    goto/16 :goto_3

    .line 478
    .line 479
    :pswitch_12
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 480
    .line 481
    .line 482
    move-result-object v5

    .line 483
    if-eqz v5, :cond_e

    .line 484
    .line 485
    div-int/lit8 v10, v2, 0x3

    .line 486
    .line 487
    mul-int/2addr v10, v14

    .line 488
    iget-object v11, v0, La/p640;->b:[Ljava/lang/Object;

    .line 489
    .line 490
    aget-object v10, v11, v10

    .line 491
    .line 492
    iget-object v11, v0, La/p640;->i:La/yo20;

    .line 493
    .line 494
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    check-cast v10, La/po20;

    .line 498
    .line 499
    iget-object v10, v10, La/po20;->a:La/yuu;

    .line 500
    .line 501
    iget-object v11, v10, La/yuu;->c:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v11, La/dov0;

    .line 504
    .line 505
    iget-object v10, v10, La/yuu;->b:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v10, La/dov0;

    .line 508
    .line 509
    check-cast v5, La/vo20;

    .line 510
    .line 511
    invoke-virtual {v5}, La/vo20;->entrySet()Ljava/util/Set;

    .line 512
    .line 513
    .line 514
    move-result-object v5

    .line 515
    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 520
    .line 521
    .line 522
    move-result v13

    .line 523
    if-eqz v13, :cond_e

    .line 524
    .line 525
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v13

    .line 529
    check-cast v13, Ljava/util/Map$Entry;

    .line 530
    .line 531
    invoke-virtual {v7, v12, v14}, La/qyc;->m(II)V

    .line 532
    .line 533
    .line 534
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v15

    .line 538
    move/from16 v18, v14

    .line 539
    .line 540
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v14

    .line 544
    sget v19, La/drp;->c:I

    .line 545
    .line 546
    const/16 v16, 0x1

    .line 547
    .line 548
    invoke-static/range {v16 .. v16}, La/qyc;->c(I)I

    .line 549
    .line 550
    .line 551
    move-result v19

    .line 552
    move/from16 v20, v3

    .line 553
    .line 554
    sget-object v3, La/dov0;->e:La/unv0;

    .line 555
    .line 556
    if-ne v10, v3, :cond_6

    .line 557
    .line 558
    mul-int/lit8 v19, v19, 0x2

    .line 559
    .line 560
    :cond_6
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 561
    .line 562
    .line 563
    move-result v21

    .line 564
    const-string v22, "There is no way to get here, but the compiler thinks otherwise."

    .line 565
    .line 566
    const/16 v23, 0x8

    .line 567
    .line 568
    const/16 v24, 0x4

    .line 569
    .line 570
    move/from16 v25, v4

    .line 571
    .line 572
    packed-switch v21, :pswitch_data_1

    .line 573
    .line 574
    .line 575
    invoke-static/range {v22 .. v22}, La/itt0;->k(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    return-void

    .line 579
    :pswitch_13
    check-cast v15, Ljava/lang/Long;

    .line 580
    .line 581
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 582
    .line 583
    .line 584
    move-result-wide v26

    .line 585
    const/16 v16, 0x1

    .line 586
    .line 587
    shl-long v28, v26, v16

    .line 588
    .line 589
    shr-long v26, v26, v17

    .line 590
    .line 591
    xor-long v26, v28, v26

    .line 592
    .line 593
    invoke-static/range {v26 .. v27}, La/qyc;->e(J)I

    .line 594
    .line 595
    .line 596
    move-result v15

    .line 597
    :goto_5
    move v4, v15

    .line 598
    goto/16 :goto_9

    .line 599
    .line 600
    :pswitch_14
    check-cast v15, Ljava/lang/Integer;

    .line 601
    .line 602
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 603
    .line 604
    .line 605
    move-result v15

    .line 606
    shl-int/lit8 v21, v15, 0x1

    .line 607
    .line 608
    shr-int/lit8 v15, v15, 0x1f

    .line 609
    .line 610
    xor-int v15, v21, v15

    .line 611
    .line 612
    invoke-static {v15}, La/qyc;->d(I)I

    .line 613
    .line 614
    .line 615
    move-result v15

    .line 616
    goto :goto_5

    .line 617
    :pswitch_15
    check-cast v15, Ljava/lang/Long;

    .line 618
    .line 619
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 620
    .line 621
    .line 622
    :goto_6
    move/from16 v4, v23

    .line 623
    .line 624
    goto/16 :goto_9

    .line 625
    .line 626
    :pswitch_16
    check-cast v15, Ljava/lang/Integer;

    .line 627
    .line 628
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 629
    .line 630
    .line 631
    :goto_7
    move/from16 v4, v24

    .line 632
    .line 633
    goto/16 :goto_9

    .line 634
    .line 635
    :pswitch_17
    instance-of v4, v15, La/ts3;

    .line 636
    .line 637
    if-eqz v4, :cond_7

    .line 638
    .line 639
    check-cast v15, La/ts3;

    .line 640
    .line 641
    iget-byte v4, v15, La/ts3;->a:B

    .line 642
    .line 643
    invoke-static {v4}, La/qyc;->a(I)I

    .line 644
    .line 645
    .line 646
    move-result v4

    .line 647
    goto/16 :goto_9

    .line 648
    .line 649
    :cond_7
    check-cast v15, Ljava/lang/Integer;

    .line 650
    .line 651
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 652
    .line 653
    .line 654
    move-result v4

    .line 655
    invoke-static {v4}, La/qyc;->a(I)I

    .line 656
    .line 657
    .line 658
    move-result v4

    .line 659
    goto/16 :goto_9

    .line 660
    .line 661
    :pswitch_18
    check-cast v15, Ljava/lang/Integer;

    .line 662
    .line 663
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 664
    .line 665
    .line 666
    move-result v4

    .line 667
    invoke-static {v4}, La/qyc;->d(I)I

    .line 668
    .line 669
    .line 670
    move-result v4

    .line 671
    goto/16 :goto_9

    .line 672
    .line 673
    :pswitch_19
    instance-of v4, v15, La/lg9;

    .line 674
    .line 675
    if-eqz v4, :cond_8

    .line 676
    .line 677
    check-cast v15, La/lg9;

    .line 678
    .line 679
    invoke-virtual {v15}, La/lg9;->size()I

    .line 680
    .line 681
    .line 682
    move-result v4

    .line 683
    invoke-static {v4}, La/qyc;->d(I)I

    .line 684
    .line 685
    .line 686
    move-result v15

    .line 687
    :goto_8
    add-int/2addr v4, v15

    .line 688
    goto/16 :goto_9

    .line 689
    .line 690
    :cond_8
    check-cast v15, [B

    .line 691
    .line 692
    array-length v4, v15

    .line 693
    invoke-static {v4}, La/qyc;->d(I)I

    .line 694
    .line 695
    .line 696
    move-result v15

    .line 697
    goto :goto_8

    .line 698
    :pswitch_1a
    check-cast v15, La/y3;

    .line 699
    .line 700
    check-cast v15, La/kjt;

    .line 701
    .line 702
    const/4 v4, 0x0

    .line 703
    invoke-virtual {v15, v4}, La/kjt;->g(La/p2h0;)I

    .line 704
    .line 705
    .line 706
    move-result v15

    .line 707
    invoke-static {v15}, La/qyc;->d(I)I

    .line 708
    .line 709
    .line 710
    move-result v21

    .line 711
    add-int v15, v21, v15

    .line 712
    .line 713
    goto :goto_5

    .line 714
    :pswitch_1b
    const/4 v4, 0x0

    .line 715
    check-cast v15, La/y3;

    .line 716
    .line 717
    check-cast v15, La/kjt;

    .line 718
    .line 719
    invoke-virtual {v15, v4}, La/kjt;->g(La/p2h0;)I

    .line 720
    .line 721
    .line 722
    move-result v15

    .line 723
    goto :goto_5

    .line 724
    :pswitch_1c
    instance-of v4, v15, La/lg9;

    .line 725
    .line 726
    if-eqz v4, :cond_9

    .line 727
    .line 728
    check-cast v15, La/lg9;

    .line 729
    .line 730
    invoke-virtual {v15}, La/lg9;->size()I

    .line 731
    .line 732
    .line 733
    move-result v4

    .line 734
    invoke-static {v4}, La/qyc;->d(I)I

    .line 735
    .line 736
    .line 737
    move-result v15

    .line 738
    goto :goto_8

    .line 739
    :cond_9
    check-cast v15, Ljava/lang/String;

    .line 740
    .line 741
    invoke-static {v15}, La/qyc;->b(Ljava/lang/String;)I

    .line 742
    .line 743
    .line 744
    move-result v4

    .line 745
    goto :goto_9

    .line 746
    :pswitch_1d
    check-cast v15, Ljava/lang/Boolean;

    .line 747
    .line 748
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 749
    .line 750
    .line 751
    const/4 v4, 0x1

    .line 752
    goto :goto_9

    .line 753
    :pswitch_1e
    check-cast v15, Ljava/lang/Integer;

    .line 754
    .line 755
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    goto :goto_7

    .line 759
    :pswitch_1f
    check-cast v15, Ljava/lang/Long;

    .line 760
    .line 761
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 762
    .line 763
    .line 764
    goto/16 :goto_6

    .line 765
    .line 766
    :pswitch_20
    check-cast v15, Ljava/lang/Integer;

    .line 767
    .line 768
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 769
    .line 770
    .line 771
    move-result v4

    .line 772
    invoke-static {v4}, La/qyc;->a(I)I

    .line 773
    .line 774
    .line 775
    move-result v4

    .line 776
    goto :goto_9

    .line 777
    :pswitch_21
    check-cast v15, Ljava/lang/Long;

    .line 778
    .line 779
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 780
    .line 781
    .line 782
    move-result-wide v26

    .line 783
    invoke-static/range {v26 .. v27}, La/qyc;->e(J)I

    .line 784
    .line 785
    .line 786
    move-result v4

    .line 787
    goto :goto_9

    .line 788
    :pswitch_22
    check-cast v15, Ljava/lang/Long;

    .line 789
    .line 790
    invoke-virtual {v15}, Ljava/lang/Long;->longValue()J

    .line 791
    .line 792
    .line 793
    move-result-wide v26

    .line 794
    invoke-static/range {v26 .. v27}, La/qyc;->e(J)I

    .line 795
    .line 796
    .line 797
    move-result v4

    .line 798
    goto :goto_9

    .line 799
    :pswitch_23
    check-cast v15, Ljava/lang/Float;

    .line 800
    .line 801
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 802
    .line 803
    .line 804
    goto/16 :goto_7

    .line 805
    .line 806
    :pswitch_24
    check-cast v15, Ljava/lang/Double;

    .line 807
    .line 808
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    goto/16 :goto_6

    .line 812
    .line 813
    :goto_9
    add-int v4, v4, v19

    .line 814
    .line 815
    invoke-static/range {v18 .. v18}, La/qyc;->c(I)I

    .line 816
    .line 817
    .line 818
    move-result v15

    .line 819
    if-ne v11, v3, :cond_a

    .line 820
    .line 821
    mul-int/lit8 v15, v15, 0x2

    .line 822
    .line 823
    :cond_a
    invoke-virtual {v11}, Ljava/lang/Enum;->ordinal()I

    .line 824
    .line 825
    .line 826
    move-result v3

    .line 827
    packed-switch v3, :pswitch_data_2

    .line 828
    .line 829
    .line 830
    invoke-static/range {v22 .. v22}, La/itt0;->k(Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    return-void

    .line 834
    :pswitch_25
    check-cast v14, Ljava/lang/Long;

    .line 835
    .line 836
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 837
    .line 838
    .line 839
    move-result-wide v21

    .line 840
    const/16 v16, 0x1

    .line 841
    .line 842
    shl-long v23, v21, v16

    .line 843
    .line 844
    shr-long v21, v21, v17

    .line 845
    .line 846
    xor-long v21, v23, v21

    .line 847
    .line 848
    invoke-static/range {v21 .. v22}, La/qyc;->e(J)I

    .line 849
    .line 850
    .line 851
    move-result v3

    .line 852
    goto/16 :goto_d

    .line 853
    .line 854
    :pswitch_26
    check-cast v14, Ljava/lang/Integer;

    .line 855
    .line 856
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 857
    .line 858
    .line 859
    move-result v3

    .line 860
    shl-int/lit8 v14, v3, 0x1

    .line 861
    .line 862
    shr-int/lit8 v3, v3, 0x1f

    .line 863
    .line 864
    xor-int/2addr v3, v14

    .line 865
    invoke-static {v3}, La/qyc;->d(I)I

    .line 866
    .line 867
    .line 868
    move-result v3

    .line 869
    goto/16 :goto_d

    .line 870
    .line 871
    :pswitch_27
    check-cast v14, Ljava/lang/Long;

    .line 872
    .line 873
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 874
    .line 875
    .line 876
    :goto_a
    move/from16 v3, v23

    .line 877
    .line 878
    goto/16 :goto_d

    .line 879
    .line 880
    :pswitch_28
    check-cast v14, Ljava/lang/Integer;

    .line 881
    .line 882
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 883
    .line 884
    .line 885
    :goto_b
    move/from16 v3, v24

    .line 886
    .line 887
    goto/16 :goto_d

    .line 888
    .line 889
    :pswitch_29
    instance-of v3, v14, La/ts3;

    .line 890
    .line 891
    if-eqz v3, :cond_b

    .line 892
    .line 893
    check-cast v14, La/ts3;

    .line 894
    .line 895
    iget-byte v3, v14, La/ts3;->a:B

    .line 896
    .line 897
    invoke-static {v3}, La/qyc;->a(I)I

    .line 898
    .line 899
    .line 900
    move-result v3

    .line 901
    goto/16 :goto_d

    .line 902
    .line 903
    :cond_b
    check-cast v14, Ljava/lang/Integer;

    .line 904
    .line 905
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    invoke-static {v3}, La/qyc;->a(I)I

    .line 910
    .line 911
    .line 912
    move-result v3

    .line 913
    goto/16 :goto_d

    .line 914
    .line 915
    :pswitch_2a
    check-cast v14, Ljava/lang/Integer;

    .line 916
    .line 917
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 918
    .line 919
    .line 920
    move-result v3

    .line 921
    invoke-static {v3}, La/qyc;->d(I)I

    .line 922
    .line 923
    .line 924
    move-result v3

    .line 925
    goto/16 :goto_d

    .line 926
    .line 927
    :pswitch_2b
    instance-of v3, v14, La/lg9;

    .line 928
    .line 929
    if-eqz v3, :cond_c

    .line 930
    .line 931
    check-cast v14, La/lg9;

    .line 932
    .line 933
    invoke-virtual {v14}, La/lg9;->size()I

    .line 934
    .line 935
    .line 936
    move-result v3

    .line 937
    invoke-static {v3}, La/qyc;->d(I)I

    .line 938
    .line 939
    .line 940
    move-result v14

    .line 941
    :goto_c
    add-int/2addr v3, v14

    .line 942
    goto/16 :goto_d

    .line 943
    .line 944
    :cond_c
    check-cast v14, [B

    .line 945
    .line 946
    array-length v3, v14

    .line 947
    invoke-static {v3}, La/qyc;->d(I)I

    .line 948
    .line 949
    .line 950
    move-result v14

    .line 951
    goto :goto_c

    .line 952
    :pswitch_2c
    check-cast v14, La/y3;

    .line 953
    .line 954
    check-cast v14, La/kjt;

    .line 955
    .line 956
    const/4 v3, 0x0

    .line 957
    invoke-virtual {v14, v3}, La/kjt;->g(La/p2h0;)I

    .line 958
    .line 959
    .line 960
    move-result v3

    .line 961
    invoke-static {v3}, La/qyc;->d(I)I

    .line 962
    .line 963
    .line 964
    move-result v14

    .line 965
    goto :goto_c

    .line 966
    :pswitch_2d
    const/4 v3, 0x0

    .line 967
    check-cast v14, La/y3;

    .line 968
    .line 969
    check-cast v14, La/kjt;

    .line 970
    .line 971
    invoke-virtual {v14, v3}, La/kjt;->g(La/p2h0;)I

    .line 972
    .line 973
    .line 974
    move-result v3

    .line 975
    goto :goto_d

    .line 976
    :pswitch_2e
    instance-of v3, v14, La/lg9;

    .line 977
    .line 978
    if-eqz v3, :cond_d

    .line 979
    .line 980
    check-cast v14, La/lg9;

    .line 981
    .line 982
    invoke-virtual {v14}, La/lg9;->size()I

    .line 983
    .line 984
    .line 985
    move-result v3

    .line 986
    invoke-static {v3}, La/qyc;->d(I)I

    .line 987
    .line 988
    .line 989
    move-result v14

    .line 990
    goto :goto_c

    .line 991
    :cond_d
    check-cast v14, Ljava/lang/String;

    .line 992
    .line 993
    invoke-static {v14}, La/qyc;->b(Ljava/lang/String;)I

    .line 994
    .line 995
    .line 996
    move-result v3

    .line 997
    goto :goto_d

    .line 998
    :pswitch_2f
    check-cast v14, Ljava/lang/Boolean;

    .line 999
    .line 1000
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    const/4 v3, 0x1

    .line 1004
    goto :goto_d

    .line 1005
    :pswitch_30
    check-cast v14, Ljava/lang/Integer;

    .line 1006
    .line 1007
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    goto :goto_b

    .line 1011
    :pswitch_31
    check-cast v14, Ljava/lang/Long;

    .line 1012
    .line 1013
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1014
    .line 1015
    .line 1016
    goto/16 :goto_a

    .line 1017
    .line 1018
    :pswitch_32
    check-cast v14, Ljava/lang/Integer;

    .line 1019
    .line 1020
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1021
    .line 1022
    .line 1023
    move-result v3

    .line 1024
    invoke-static {v3}, La/qyc;->a(I)I

    .line 1025
    .line 1026
    .line 1027
    move-result v3

    .line 1028
    goto :goto_d

    .line 1029
    :pswitch_33
    check-cast v14, Ljava/lang/Long;

    .line 1030
    .line 1031
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v21

    .line 1035
    invoke-static/range {v21 .. v22}, La/qyc;->e(J)I

    .line 1036
    .line 1037
    .line 1038
    move-result v3

    .line 1039
    goto :goto_d

    .line 1040
    :pswitch_34
    check-cast v14, Ljava/lang/Long;

    .line 1041
    .line 1042
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 1043
    .line 1044
    .line 1045
    move-result-wide v21

    .line 1046
    invoke-static/range {v21 .. v22}, La/qyc;->e(J)I

    .line 1047
    .line 1048
    .line 1049
    move-result v3

    .line 1050
    goto :goto_d

    .line 1051
    :pswitch_35
    check-cast v14, Ljava/lang/Float;

    .line 1052
    .line 1053
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1054
    .line 1055
    .line 1056
    goto/16 :goto_b

    .line 1057
    .line 1058
    :pswitch_36
    check-cast v14, Ljava/lang/Double;

    .line 1059
    .line 1060
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    goto/16 :goto_a

    .line 1064
    .line 1065
    :goto_d
    add-int/2addr v3, v15

    .line 1066
    add-int/2addr v3, v4

    .line 1067
    invoke-virtual {v7, v3}, La/qyc;->n(I)V

    .line 1068
    .line 1069
    .line 1070
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v3

    .line 1074
    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v4

    .line 1078
    const/4 v13, 0x1

    .line 1079
    invoke-static {v7, v10, v13, v3}, La/drp;->b(La/qyc;La/dov0;ILjava/lang/Object;)V

    .line 1080
    .line 1081
    .line 1082
    move/from16 v3, v18

    .line 1083
    .line 1084
    invoke-static {v7, v11, v3, v4}, La/drp;->b(La/qyc;La/dov0;ILjava/lang/Object;)V

    .line 1085
    .line 1086
    .line 1087
    move v14, v3

    .line 1088
    move/from16 v3, v20

    .line 1089
    .line 1090
    move/from16 v4, v25

    .line 1091
    .line 1092
    goto/16 :goto_4

    .line 1093
    .line 1094
    :cond_e
    move/from16 v20, v3

    .line 1095
    .line 1096
    move/from16 v25, v4

    .line 1097
    .line 1098
    :cond_f
    :goto_e
    move/from16 v3, v20

    .line 1099
    .line 1100
    move/from16 v4, v25

    .line 1101
    .line 1102
    goto/16 :goto_3

    .line 1103
    .line 1104
    :pswitch_37
    move/from16 v20, v3

    .line 1105
    .line 1106
    move/from16 v25, v4

    .line 1107
    .line 1108
    aget v3, v8, v2

    .line 1109
    .line 1110
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v4

    .line 1114
    check-cast v4, Ljava/util/List;

    .line 1115
    .line 1116
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 1117
    .line 1118
    .line 1119
    move-result-object v5

    .line 1120
    sget-object v10, La/x2h0;->a:Ljava/lang/Class;

    .line 1121
    .line 1122
    if-eqz v4, :cond_f

    .line 1123
    .line 1124
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v10

    .line 1128
    if-nez v10, :cond_f

    .line 1129
    .line 1130
    const/4 v10, 0x0

    .line 1131
    :goto_f
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1132
    .line 1133
    .line 1134
    move-result v11

    .line 1135
    if-ge v10, v11, :cond_f

    .line 1136
    .line 1137
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v11

    .line 1141
    invoke-virtual {v6, v3, v11, v5}, La/prc;->q(ILjava/lang/Object;La/p2h0;)V

    .line 1142
    .line 1143
    .line 1144
    add-int/lit8 v10, v10, 0x1

    .line 1145
    .line 1146
    goto :goto_f

    .line 1147
    :pswitch_38
    move/from16 v20, v3

    .line 1148
    .line 1149
    move/from16 v25, v4

    .line 1150
    .line 1151
    aget v3, v8, v2

    .line 1152
    .line 1153
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v4

    .line 1157
    check-cast v4, Ljava/util/List;

    .line 1158
    .line 1159
    const/4 v5, 0x1

    .line 1160
    invoke-static {v3, v4, v6, v5}, La/x2h0;->w(ILjava/util/List;La/prc;Z)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_e

    .line 1164
    :pswitch_39
    move/from16 v20, v3

    .line 1165
    .line 1166
    move/from16 v25, v4

    .line 1167
    .line 1168
    move/from16 v5, v16

    .line 1169
    .line 1170
    aget v3, v8, v2

    .line 1171
    .line 1172
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    check-cast v4, Ljava/util/List;

    .line 1177
    .line 1178
    invoke-static {v3, v4, v6, v5}, La/x2h0;->v(ILjava/util/List;La/prc;Z)V

    .line 1179
    .line 1180
    .line 1181
    goto :goto_e

    .line 1182
    :pswitch_3a
    move/from16 v20, v3

    .line 1183
    .line 1184
    move/from16 v25, v4

    .line 1185
    .line 1186
    move/from16 v5, v16

    .line 1187
    .line 1188
    aget v3, v8, v2

    .line 1189
    .line 1190
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v4

    .line 1194
    check-cast v4, Ljava/util/List;

    .line 1195
    .line 1196
    invoke-static {v3, v4, v6, v5}, La/x2h0;->u(ILjava/util/List;La/prc;Z)V

    .line 1197
    .line 1198
    .line 1199
    goto :goto_e

    .line 1200
    :pswitch_3b
    move/from16 v20, v3

    .line 1201
    .line 1202
    move/from16 v25, v4

    .line 1203
    .line 1204
    move/from16 v5, v16

    .line 1205
    .line 1206
    aget v3, v8, v2

    .line 1207
    .line 1208
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v4

    .line 1212
    check-cast v4, Ljava/util/List;

    .line 1213
    .line 1214
    invoke-static {v3, v4, v6, v5}, La/x2h0;->t(ILjava/util/List;La/prc;Z)V

    .line 1215
    .line 1216
    .line 1217
    goto :goto_e

    .line 1218
    :pswitch_3c
    move/from16 v20, v3

    .line 1219
    .line 1220
    move/from16 v25, v4

    .line 1221
    .line 1222
    move/from16 v5, v16

    .line 1223
    .line 1224
    aget v3, v8, v2

    .line 1225
    .line 1226
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v4

    .line 1230
    check-cast v4, Ljava/util/List;

    .line 1231
    .line 1232
    invoke-static {v3, v4, v6, v5}, La/x2h0;->n(ILjava/util/List;La/prc;Z)V

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_e

    .line 1236
    .line 1237
    :pswitch_3d
    move/from16 v20, v3

    .line 1238
    .line 1239
    move/from16 v25, v4

    .line 1240
    .line 1241
    move/from16 v5, v16

    .line 1242
    .line 1243
    aget v3, v8, v2

    .line 1244
    .line 1245
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v4

    .line 1249
    check-cast v4, Ljava/util/List;

    .line 1250
    .line 1251
    invoke-static {v3, v4, v6, v5}, La/x2h0;->x(ILjava/util/List;La/prc;Z)V

    .line 1252
    .line 1253
    .line 1254
    goto/16 :goto_e

    .line 1255
    .line 1256
    :pswitch_3e
    move/from16 v20, v3

    .line 1257
    .line 1258
    move/from16 v25, v4

    .line 1259
    .line 1260
    move/from16 v5, v16

    .line 1261
    .line 1262
    aget v3, v8, v2

    .line 1263
    .line 1264
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v4

    .line 1268
    check-cast v4, Ljava/util/List;

    .line 1269
    .line 1270
    invoke-static {v3, v4, v6, v5}, La/x2h0;->l(ILjava/util/List;La/prc;Z)V

    .line 1271
    .line 1272
    .line 1273
    goto/16 :goto_e

    .line 1274
    .line 1275
    :pswitch_3f
    move/from16 v20, v3

    .line 1276
    .line 1277
    move/from16 v25, v4

    .line 1278
    .line 1279
    move/from16 v5, v16

    .line 1280
    .line 1281
    aget v3, v8, v2

    .line 1282
    .line 1283
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v4

    .line 1287
    check-cast v4, Ljava/util/List;

    .line 1288
    .line 1289
    invoke-static {v3, v4, v6, v5}, La/x2h0;->o(ILjava/util/List;La/prc;Z)V

    .line 1290
    .line 1291
    .line 1292
    goto/16 :goto_e

    .line 1293
    .line 1294
    :pswitch_40
    move/from16 v20, v3

    .line 1295
    .line 1296
    move/from16 v25, v4

    .line 1297
    .line 1298
    move/from16 v5, v16

    .line 1299
    .line 1300
    aget v3, v8, v2

    .line 1301
    .line 1302
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v4

    .line 1306
    check-cast v4, Ljava/util/List;

    .line 1307
    .line 1308
    invoke-static {v3, v4, v6, v5}, La/x2h0;->p(ILjava/util/List;La/prc;Z)V

    .line 1309
    .line 1310
    .line 1311
    goto/16 :goto_e

    .line 1312
    .line 1313
    :pswitch_41
    move/from16 v20, v3

    .line 1314
    .line 1315
    move/from16 v25, v4

    .line 1316
    .line 1317
    move/from16 v5, v16

    .line 1318
    .line 1319
    aget v3, v8, v2

    .line 1320
    .line 1321
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v4

    .line 1325
    check-cast v4, Ljava/util/List;

    .line 1326
    .line 1327
    invoke-static {v3, v4, v6, v5}, La/x2h0;->r(ILjava/util/List;La/prc;Z)V

    .line 1328
    .line 1329
    .line 1330
    goto/16 :goto_e

    .line 1331
    .line 1332
    :pswitch_42
    move/from16 v20, v3

    .line 1333
    .line 1334
    move/from16 v25, v4

    .line 1335
    .line 1336
    move/from16 v5, v16

    .line 1337
    .line 1338
    aget v3, v8, v2

    .line 1339
    .line 1340
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v4

    .line 1344
    check-cast v4, Ljava/util/List;

    .line 1345
    .line 1346
    invoke-static {v3, v4, v6, v5}, La/x2h0;->y(ILjava/util/List;La/prc;Z)V

    .line 1347
    .line 1348
    .line 1349
    goto/16 :goto_e

    .line 1350
    .line 1351
    :pswitch_43
    move/from16 v20, v3

    .line 1352
    .line 1353
    move/from16 v25, v4

    .line 1354
    .line 1355
    move/from16 v5, v16

    .line 1356
    .line 1357
    aget v3, v8, v2

    .line 1358
    .line 1359
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v4

    .line 1363
    check-cast v4, Ljava/util/List;

    .line 1364
    .line 1365
    invoke-static {v3, v4, v6, v5}, La/x2h0;->s(ILjava/util/List;La/prc;Z)V

    .line 1366
    .line 1367
    .line 1368
    goto/16 :goto_e

    .line 1369
    .line 1370
    :pswitch_44
    move/from16 v20, v3

    .line 1371
    .line 1372
    move/from16 v25, v4

    .line 1373
    .line 1374
    move/from16 v5, v16

    .line 1375
    .line 1376
    aget v3, v8, v2

    .line 1377
    .line 1378
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v4

    .line 1382
    check-cast v4, Ljava/util/List;

    .line 1383
    .line 1384
    invoke-static {v3, v4, v6, v5}, La/x2h0;->q(ILjava/util/List;La/prc;Z)V

    .line 1385
    .line 1386
    .line 1387
    goto/16 :goto_e

    .line 1388
    .line 1389
    :pswitch_45
    move/from16 v20, v3

    .line 1390
    .line 1391
    move/from16 v25, v4

    .line 1392
    .line 1393
    move/from16 v5, v16

    .line 1394
    .line 1395
    aget v3, v8, v2

    .line 1396
    .line 1397
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1398
    .line 1399
    .line 1400
    move-result-object v4

    .line 1401
    check-cast v4, Ljava/util/List;

    .line 1402
    .line 1403
    invoke-static {v3, v4, v6, v5}, La/x2h0;->m(ILjava/util/List;La/prc;Z)V

    .line 1404
    .line 1405
    .line 1406
    goto/16 :goto_e

    .line 1407
    .line 1408
    :pswitch_46
    move/from16 v20, v3

    .line 1409
    .line 1410
    move/from16 v25, v4

    .line 1411
    .line 1412
    aget v3, v8, v2

    .line 1413
    .line 1414
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v4

    .line 1418
    check-cast v4, Ljava/util/List;

    .line 1419
    .line 1420
    const/4 v13, 0x0

    .line 1421
    invoke-static {v3, v4, v6, v13}, La/x2h0;->w(ILjava/util/List;La/prc;Z)V

    .line 1422
    .line 1423
    .line 1424
    :goto_10
    move/from16 v3, v20

    .line 1425
    .line 1426
    move/from16 v4, v25

    .line 1427
    .line 1428
    goto/16 :goto_18

    .line 1429
    .line 1430
    :pswitch_47
    move/from16 v20, v3

    .line 1431
    .line 1432
    move/from16 v25, v4

    .line 1433
    .line 1434
    const/4 v13, 0x0

    .line 1435
    aget v3, v8, v2

    .line 1436
    .line 1437
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v4

    .line 1441
    check-cast v4, Ljava/util/List;

    .line 1442
    .line 1443
    invoke-static {v3, v4, v6, v13}, La/x2h0;->v(ILjava/util/List;La/prc;Z)V

    .line 1444
    .line 1445
    .line 1446
    goto :goto_10

    .line 1447
    :pswitch_48
    move/from16 v20, v3

    .line 1448
    .line 1449
    move/from16 v25, v4

    .line 1450
    .line 1451
    const/4 v13, 0x0

    .line 1452
    aget v3, v8, v2

    .line 1453
    .line 1454
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v4

    .line 1458
    check-cast v4, Ljava/util/List;

    .line 1459
    .line 1460
    invoke-static {v3, v4, v6, v13}, La/x2h0;->u(ILjava/util/List;La/prc;Z)V

    .line 1461
    .line 1462
    .line 1463
    goto :goto_10

    .line 1464
    :pswitch_49
    move/from16 v20, v3

    .line 1465
    .line 1466
    move/from16 v25, v4

    .line 1467
    .line 1468
    const/4 v13, 0x0

    .line 1469
    aget v3, v8, v2

    .line 1470
    .line 1471
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v4

    .line 1475
    check-cast v4, Ljava/util/List;

    .line 1476
    .line 1477
    invoke-static {v3, v4, v6, v13}, La/x2h0;->t(ILjava/util/List;La/prc;Z)V

    .line 1478
    .line 1479
    .line 1480
    goto :goto_10

    .line 1481
    :pswitch_4a
    move/from16 v20, v3

    .line 1482
    .line 1483
    move/from16 v25, v4

    .line 1484
    .line 1485
    const/4 v13, 0x0

    .line 1486
    aget v3, v8, v2

    .line 1487
    .line 1488
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v4

    .line 1492
    check-cast v4, Ljava/util/List;

    .line 1493
    .line 1494
    invoke-static {v3, v4, v6, v13}, La/x2h0;->n(ILjava/util/List;La/prc;Z)V

    .line 1495
    .line 1496
    .line 1497
    goto :goto_10

    .line 1498
    :pswitch_4b
    move/from16 v20, v3

    .line 1499
    .line 1500
    move/from16 v25, v4

    .line 1501
    .line 1502
    const/4 v13, 0x0

    .line 1503
    aget v3, v8, v2

    .line 1504
    .line 1505
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v4

    .line 1509
    check-cast v4, Ljava/util/List;

    .line 1510
    .line 1511
    invoke-static {v3, v4, v6, v13}, La/x2h0;->x(ILjava/util/List;La/prc;Z)V

    .line 1512
    .line 1513
    .line 1514
    goto :goto_10

    .line 1515
    :pswitch_4c
    move/from16 v20, v3

    .line 1516
    .line 1517
    move/from16 v25, v4

    .line 1518
    .line 1519
    aget v3, v8, v2

    .line 1520
    .line 1521
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v4

    .line 1525
    check-cast v4, Ljava/util/List;

    .line 1526
    .line 1527
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1528
    .line 1529
    if-eqz v4, :cond_f

    .line 1530
    .line 1531
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1532
    .line 1533
    .line 1534
    move-result v5

    .line 1535
    if-nez v5, :cond_f

    .line 1536
    .line 1537
    const/4 v5, 0x0

    .line 1538
    :goto_11
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1539
    .line 1540
    .line 1541
    move-result v10

    .line 1542
    if-ge v5, v10, :cond_f

    .line 1543
    .line 1544
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1545
    .line 1546
    .line 1547
    move-result-object v10

    .line 1548
    check-cast v10, La/lg9;

    .line 1549
    .line 1550
    const/4 v11, 0x2

    .line 1551
    invoke-virtual {v7, v3, v11}, La/qyc;->m(II)V

    .line 1552
    .line 1553
    .line 1554
    invoke-virtual {v7, v10}, La/qyc;->h(La/lg9;)V

    .line 1555
    .line 1556
    .line 1557
    add-int/lit8 v5, v5, 0x1

    .line 1558
    .line 1559
    goto :goto_11

    .line 1560
    :pswitch_4d
    move/from16 v20, v3

    .line 1561
    .line 1562
    move/from16 v25, v4

    .line 1563
    .line 1564
    aget v3, v8, v2

    .line 1565
    .line 1566
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1567
    .line 1568
    .line 1569
    move-result-object v4

    .line 1570
    check-cast v4, Ljava/util/List;

    .line 1571
    .line 1572
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 1573
    .line 1574
    .line 1575
    move-result-object v5

    .line 1576
    sget-object v10, La/x2h0;->a:Ljava/lang/Class;

    .line 1577
    .line 1578
    if-eqz v4, :cond_f

    .line 1579
    .line 1580
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1581
    .line 1582
    .line 1583
    move-result v10

    .line 1584
    if-nez v10, :cond_f

    .line 1585
    .line 1586
    const/4 v10, 0x0

    .line 1587
    :goto_12
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1588
    .line 1589
    .line 1590
    move-result v11

    .line 1591
    if-ge v10, v11, :cond_f

    .line 1592
    .line 1593
    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1594
    .line 1595
    .line 1596
    move-result-object v11

    .line 1597
    invoke-virtual {v6, v3, v11, v5}, La/prc;->r(ILjava/lang/Object;La/p2h0;)V

    .line 1598
    .line 1599
    .line 1600
    add-int/lit8 v10, v10, 0x1

    .line 1601
    .line 1602
    goto :goto_12

    .line 1603
    :pswitch_4e
    move/from16 v20, v3

    .line 1604
    .line 1605
    move/from16 v25, v4

    .line 1606
    .line 1607
    aget v3, v8, v2

    .line 1608
    .line 1609
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v4

    .line 1613
    check-cast v4, Ljava/util/List;

    .line 1614
    .line 1615
    sget-object v5, La/x2h0;->a:Ljava/lang/Class;

    .line 1616
    .line 1617
    if-eqz v4, :cond_f

    .line 1618
    .line 1619
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 1620
    .line 1621
    .line 1622
    move-result v5

    .line 1623
    if-nez v5, :cond_f

    .line 1624
    .line 1625
    instance-of v5, v4, La/sez;

    .line 1626
    .line 1627
    if-eqz v5, :cond_11

    .line 1628
    .line 1629
    move-object v5, v4

    .line 1630
    check-cast v5, La/sez;

    .line 1631
    .line 1632
    const/4 v10, 0x0

    .line 1633
    :goto_13
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1634
    .line 1635
    .line 1636
    move-result v11

    .line 1637
    if-ge v10, v11, :cond_f

    .line 1638
    .line 1639
    invoke-interface {v5, v10}, La/sez;->x(I)Ljava/lang/Object;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v11

    .line 1643
    instance-of v12, v11, Ljava/lang/String;

    .line 1644
    .line 1645
    if-eqz v12, :cond_10

    .line 1646
    .line 1647
    check-cast v11, Ljava/lang/String;

    .line 1648
    .line 1649
    const/4 v12, 0x2

    .line 1650
    invoke-virtual {v7, v3, v12}, La/qyc;->m(II)V

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v7, v11}, La/qyc;->l(Ljava/lang/String;)V

    .line 1654
    .line 1655
    .line 1656
    goto :goto_14

    .line 1657
    :cond_10
    const/4 v12, 0x2

    .line 1658
    check-cast v11, La/lg9;

    .line 1659
    .line 1660
    invoke-virtual {v7, v3, v12}, La/qyc;->m(II)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v7, v11}, La/qyc;->h(La/lg9;)V

    .line 1664
    .line 1665
    .line 1666
    :goto_14
    add-int/lit8 v10, v10, 0x1

    .line 1667
    .line 1668
    goto :goto_13

    .line 1669
    :cond_11
    const/4 v5, 0x0

    .line 1670
    :goto_15
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1671
    .line 1672
    .line 1673
    move-result v10

    .line 1674
    if-ge v5, v10, :cond_f

    .line 1675
    .line 1676
    invoke-interface {v4, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1677
    .line 1678
    .line 1679
    move-result-object v10

    .line 1680
    check-cast v10, Ljava/lang/String;

    .line 1681
    .line 1682
    const/4 v11, 0x2

    .line 1683
    invoke-virtual {v7, v3, v11}, La/qyc;->m(II)V

    .line 1684
    .line 1685
    .line 1686
    invoke-virtual {v7, v10}, La/qyc;->l(Ljava/lang/String;)V

    .line 1687
    .line 1688
    .line 1689
    add-int/lit8 v5, v5, 0x1

    .line 1690
    .line 1691
    goto :goto_15

    .line 1692
    :pswitch_4f
    move/from16 v20, v3

    .line 1693
    .line 1694
    move/from16 v25, v4

    .line 1695
    .line 1696
    aget v3, v8, v2

    .line 1697
    .line 1698
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v4

    .line 1702
    check-cast v4, Ljava/util/List;

    .line 1703
    .line 1704
    const/4 v13, 0x0

    .line 1705
    invoke-static {v3, v4, v6, v13}, La/x2h0;->l(ILjava/util/List;La/prc;Z)V

    .line 1706
    .line 1707
    .line 1708
    goto/16 :goto_10

    .line 1709
    .line 1710
    :pswitch_50
    move/from16 v20, v3

    .line 1711
    .line 1712
    move/from16 v25, v4

    .line 1713
    .line 1714
    const/4 v13, 0x0

    .line 1715
    aget v3, v8, v2

    .line 1716
    .line 1717
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1718
    .line 1719
    .line 1720
    move-result-object v4

    .line 1721
    check-cast v4, Ljava/util/List;

    .line 1722
    .line 1723
    invoke-static {v3, v4, v6, v13}, La/x2h0;->o(ILjava/util/List;La/prc;Z)V

    .line 1724
    .line 1725
    .line 1726
    goto/16 :goto_10

    .line 1727
    .line 1728
    :pswitch_51
    move/from16 v20, v3

    .line 1729
    .line 1730
    move/from16 v25, v4

    .line 1731
    .line 1732
    const/4 v13, 0x0

    .line 1733
    aget v3, v8, v2

    .line 1734
    .line 1735
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1736
    .line 1737
    .line 1738
    move-result-object v4

    .line 1739
    check-cast v4, Ljava/util/List;

    .line 1740
    .line 1741
    invoke-static {v3, v4, v6, v13}, La/x2h0;->p(ILjava/util/List;La/prc;Z)V

    .line 1742
    .line 1743
    .line 1744
    goto/16 :goto_10

    .line 1745
    .line 1746
    :pswitch_52
    move/from16 v20, v3

    .line 1747
    .line 1748
    move/from16 v25, v4

    .line 1749
    .line 1750
    const/4 v13, 0x0

    .line 1751
    aget v3, v8, v2

    .line 1752
    .line 1753
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1754
    .line 1755
    .line 1756
    move-result-object v4

    .line 1757
    check-cast v4, Ljava/util/List;

    .line 1758
    .line 1759
    invoke-static {v3, v4, v6, v13}, La/x2h0;->r(ILjava/util/List;La/prc;Z)V

    .line 1760
    .line 1761
    .line 1762
    goto/16 :goto_10

    .line 1763
    .line 1764
    :pswitch_53
    move/from16 v20, v3

    .line 1765
    .line 1766
    move/from16 v25, v4

    .line 1767
    .line 1768
    const/4 v13, 0x0

    .line 1769
    aget v3, v8, v2

    .line 1770
    .line 1771
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v4

    .line 1775
    check-cast v4, Ljava/util/List;

    .line 1776
    .line 1777
    invoke-static {v3, v4, v6, v13}, La/x2h0;->y(ILjava/util/List;La/prc;Z)V

    .line 1778
    .line 1779
    .line 1780
    goto/16 :goto_10

    .line 1781
    .line 1782
    :pswitch_54
    move/from16 v20, v3

    .line 1783
    .line 1784
    move/from16 v25, v4

    .line 1785
    .line 1786
    const/4 v13, 0x0

    .line 1787
    aget v3, v8, v2

    .line 1788
    .line 1789
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1790
    .line 1791
    .line 1792
    move-result-object v4

    .line 1793
    check-cast v4, Ljava/util/List;

    .line 1794
    .line 1795
    invoke-static {v3, v4, v6, v13}, La/x2h0;->s(ILjava/util/List;La/prc;Z)V

    .line 1796
    .line 1797
    .line 1798
    goto/16 :goto_10

    .line 1799
    .line 1800
    :pswitch_55
    move/from16 v20, v3

    .line 1801
    .line 1802
    move/from16 v25, v4

    .line 1803
    .line 1804
    const/4 v13, 0x0

    .line 1805
    aget v3, v8, v2

    .line 1806
    .line 1807
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1808
    .line 1809
    .line 1810
    move-result-object v4

    .line 1811
    check-cast v4, Ljava/util/List;

    .line 1812
    .line 1813
    invoke-static {v3, v4, v6, v13}, La/x2h0;->q(ILjava/util/List;La/prc;Z)V

    .line 1814
    .line 1815
    .line 1816
    goto/16 :goto_10

    .line 1817
    .line 1818
    :pswitch_56
    move/from16 v20, v3

    .line 1819
    .line 1820
    move/from16 v25, v4

    .line 1821
    .line 1822
    const/4 v13, 0x0

    .line 1823
    aget v3, v8, v2

    .line 1824
    .line 1825
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v4

    .line 1829
    check-cast v4, Ljava/util/List;

    .line 1830
    .line 1831
    invoke-static {v3, v4, v6, v13}, La/x2h0;->m(ILjava/util/List;La/prc;Z)V

    .line 1832
    .line 1833
    .line 1834
    goto/16 :goto_10

    .line 1835
    .line 1836
    :pswitch_57
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1837
    .line 1838
    .line 1839
    move-result v5

    .line 1840
    if-eqz v5, :cond_3

    .line 1841
    .line 1842
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v5

    .line 1846
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v10

    .line 1850
    invoke-virtual {v6, v12, v5, v10}, La/prc;->q(ILjava/lang/Object;La/p2h0;)V

    .line 1851
    .line 1852
    .line 1853
    goto/16 :goto_3

    .line 1854
    .line 1855
    :pswitch_58
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1856
    .line 1857
    .line 1858
    move-result v5

    .line 1859
    if-eqz v5, :cond_13

    .line 1860
    .line 1861
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1862
    .line 1863
    .line 1864
    move-result-wide v10

    .line 1865
    const/16 v16, 0x1

    .line 1866
    .line 1867
    shl-long v13, v10, v16

    .line 1868
    .line 1869
    shr-long v10, v10, v17

    .line 1870
    .line 1871
    xor-long/2addr v10, v13

    .line 1872
    const/4 v13, 0x0

    .line 1873
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 1877
    .line 1878
    .line 1879
    :cond_12
    :goto_16
    move-object/from16 v0, p0

    .line 1880
    .line 1881
    goto/16 :goto_18

    .line 1882
    .line 1883
    :cond_13
    :goto_17
    const/4 v13, 0x0

    .line 1884
    goto :goto_16

    .line 1885
    :pswitch_59
    const/4 v13, 0x0

    .line 1886
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1887
    .line 1888
    .line 1889
    move-result v5

    .line 1890
    if-eqz v5, :cond_12

    .line 1891
    .line 1892
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1893
    .line 1894
    .line 1895
    move-result v0

    .line 1896
    shl-int/lit8 v5, v0, 0x1

    .line 1897
    .line 1898
    shr-int/lit8 v0, v0, 0x1f

    .line 1899
    .line 1900
    xor-int/2addr v0, v5

    .line 1901
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 1902
    .line 1903
    .line 1904
    invoke-virtual {v7, v0}, La/qyc;->n(I)V

    .line 1905
    .line 1906
    .line 1907
    goto :goto_17

    .line 1908
    :pswitch_5a
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1909
    .line 1910
    .line 1911
    move-result v5

    .line 1912
    if-eqz v5, :cond_13

    .line 1913
    .line 1914
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 1915
    .line 1916
    .line 1917
    move-result-wide v10

    .line 1918
    const/4 v5, 0x1

    .line 1919
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 1920
    .line 1921
    .line 1922
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 1923
    .line 1924
    .line 1925
    goto :goto_17

    .line 1926
    :pswitch_5b
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1927
    .line 1928
    .line 1929
    move-result v5

    .line 1930
    if-eqz v5, :cond_13

    .line 1931
    .line 1932
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1933
    .line 1934
    .line 1935
    move-result v0

    .line 1936
    const/4 v10, 0x5

    .line 1937
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v7, v0}, La/qyc;->i(I)V

    .line 1941
    .line 1942
    .line 1943
    goto :goto_17

    .line 1944
    :pswitch_5c
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1945
    .line 1946
    .line 1947
    move-result v5

    .line 1948
    if-eqz v5, :cond_13

    .line 1949
    .line 1950
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1951
    .line 1952
    .line 1953
    move-result v0

    .line 1954
    const/4 v13, 0x0

    .line 1955
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 1956
    .line 1957
    .line 1958
    invoke-virtual {v7, v0}, La/qyc;->k(I)V

    .line 1959
    .line 1960
    .line 1961
    goto :goto_16

    .line 1962
    :pswitch_5d
    const/4 v13, 0x0

    .line 1963
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1964
    .line 1965
    .line 1966
    move-result v5

    .line 1967
    if-eqz v5, :cond_12

    .line 1968
    .line 1969
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 1970
    .line 1971
    .line 1972
    move-result v0

    .line 1973
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 1974
    .line 1975
    .line 1976
    invoke-virtual {v7, v0}, La/qyc;->n(I)V

    .line 1977
    .line 1978
    .line 1979
    goto :goto_17

    .line 1980
    :pswitch_5e
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 1981
    .line 1982
    .line 1983
    move-result v5

    .line 1984
    if-eqz v5, :cond_13

    .line 1985
    .line 1986
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v0

    .line 1990
    check-cast v0, La/lg9;

    .line 1991
    .line 1992
    const/4 v11, 0x2

    .line 1993
    invoke-virtual {v7, v12, v11}, La/qyc;->m(II)V

    .line 1994
    .line 1995
    .line 1996
    invoke-virtual {v7, v0}, La/qyc;->h(La/lg9;)V

    .line 1997
    .line 1998
    .line 1999
    goto :goto_17

    .line 2000
    :pswitch_5f
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2001
    .line 2002
    .line 2003
    move-result v5

    .line 2004
    if-eqz v5, :cond_3

    .line 2005
    .line 2006
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v5

    .line 2010
    invoke-virtual {v0, v2}, La/p640;->j(I)La/p2h0;

    .line 2011
    .line 2012
    .line 2013
    move-result-object v10

    .line 2014
    invoke-virtual {v6, v12, v5, v10}, La/prc;->r(ILjava/lang/Object;La/p2h0;)V

    .line 2015
    .line 2016
    .line 2017
    goto/16 :goto_3

    .line 2018
    .line 2019
    :pswitch_60
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2020
    .line 2021
    .line 2022
    move-result v5

    .line 2023
    if-eqz v5, :cond_13

    .line 2024
    .line 2025
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v0

    .line 2029
    instance-of v5, v0, Ljava/lang/String;

    .line 2030
    .line 2031
    if-eqz v5, :cond_14

    .line 2032
    .line 2033
    check-cast v0, Ljava/lang/String;

    .line 2034
    .line 2035
    const/4 v11, 0x2

    .line 2036
    invoke-virtual {v7, v12, v11}, La/qyc;->m(II)V

    .line 2037
    .line 2038
    .line 2039
    invoke-virtual {v7, v0}, La/qyc;->l(Ljava/lang/String;)V

    .line 2040
    .line 2041
    .line 2042
    goto/16 :goto_17

    .line 2043
    .line 2044
    :cond_14
    const/4 v11, 0x2

    .line 2045
    check-cast v0, La/lg9;

    .line 2046
    .line 2047
    invoke-virtual {v7, v12, v11}, La/qyc;->m(II)V

    .line 2048
    .line 2049
    .line 2050
    invoke-virtual {v7, v0}, La/qyc;->h(La/lg9;)V

    .line 2051
    .line 2052
    .line 2053
    goto/16 :goto_17

    .line 2054
    .line 2055
    :pswitch_61
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2056
    .line 2057
    .line 2058
    move-result v5

    .line 2059
    if-eqz v5, :cond_13

    .line 2060
    .line 2061
    sget-object v0, La/ift0;->c:La/gft0;

    .line 2062
    .line 2063
    invoke-virtual {v0, v1, v10, v11}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 2064
    .line 2065
    .line 2066
    move-result v0

    .line 2067
    const/4 v13, 0x0

    .line 2068
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 2069
    .line 2070
    .line 2071
    int-to-byte v0, v0

    .line 2072
    invoke-virtual {v7, v0}, La/qyc;->f(B)V

    .line 2073
    .line 2074
    .line 2075
    goto/16 :goto_17

    .line 2076
    .line 2077
    :pswitch_62
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2078
    .line 2079
    .line 2080
    move-result v5

    .line 2081
    if-eqz v5, :cond_13

    .line 2082
    .line 2083
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2084
    .line 2085
    .line 2086
    move-result v0

    .line 2087
    const/4 v10, 0x5

    .line 2088
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 2089
    .line 2090
    .line 2091
    invoke-virtual {v7, v0}, La/qyc;->i(I)V

    .line 2092
    .line 2093
    .line 2094
    goto/16 :goto_17

    .line 2095
    .line 2096
    :pswitch_63
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2097
    .line 2098
    .line 2099
    move-result v5

    .line 2100
    if-eqz v5, :cond_13

    .line 2101
    .line 2102
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2103
    .line 2104
    .line 2105
    move-result-wide v10

    .line 2106
    const/4 v5, 0x1

    .line 2107
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 2108
    .line 2109
    .line 2110
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 2111
    .line 2112
    .line 2113
    goto/16 :goto_17

    .line 2114
    .line 2115
    :pswitch_64
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2116
    .line 2117
    .line 2118
    move-result v5

    .line 2119
    if-eqz v5, :cond_13

    .line 2120
    .line 2121
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    .line 2122
    .line 2123
    .line 2124
    move-result v0

    .line 2125
    const/4 v13, 0x0

    .line 2126
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 2127
    .line 2128
    .line 2129
    invoke-virtual {v7, v0}, La/qyc;->k(I)V

    .line 2130
    .line 2131
    .line 2132
    goto/16 :goto_16

    .line 2133
    .line 2134
    :pswitch_65
    const/4 v13, 0x0

    .line 2135
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2136
    .line 2137
    .line 2138
    move-result v5

    .line 2139
    if-eqz v5, :cond_12

    .line 2140
    .line 2141
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2142
    .line 2143
    .line 2144
    move-result-wide v10

    .line 2145
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 2146
    .line 2147
    .line 2148
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 2149
    .line 2150
    .line 2151
    goto/16 :goto_16

    .line 2152
    .line 2153
    :pswitch_66
    const/4 v13, 0x0

    .line 2154
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2155
    .line 2156
    .line 2157
    move-result v5

    .line 2158
    if-eqz v5, :cond_12

    .line 2159
    .line 2160
    invoke-virtual {v15, v1, v10, v11}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 2161
    .line 2162
    .line 2163
    move-result-wide v10

    .line 2164
    invoke-virtual {v7, v12, v13}, La/qyc;->m(II)V

    .line 2165
    .line 2166
    .line 2167
    invoke-virtual {v7, v10, v11}, La/qyc;->o(J)V

    .line 2168
    .line 2169
    .line 2170
    goto/16 :goto_16

    .line 2171
    .line 2172
    :pswitch_67
    const/4 v13, 0x0

    .line 2173
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2174
    .line 2175
    .line 2176
    move-result v5

    .line 2177
    if-eqz v5, :cond_12

    .line 2178
    .line 2179
    sget-object v0, La/ift0;->c:La/gft0;

    .line 2180
    .line 2181
    invoke-virtual {v0, v1, v10, v11}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 2182
    .line 2183
    .line 2184
    move-result v0

    .line 2185
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2186
    .line 2187
    .line 2188
    move-result v0

    .line 2189
    const/4 v10, 0x5

    .line 2190
    invoke-virtual {v7, v12, v10}, La/qyc;->m(II)V

    .line 2191
    .line 2192
    .line 2193
    invoke-virtual {v7, v0}, La/qyc;->i(I)V

    .line 2194
    .line 2195
    .line 2196
    goto/16 :goto_16

    .line 2197
    .line 2198
    :pswitch_68
    const/4 v13, 0x0

    .line 2199
    invoke-virtual/range {v0 .. v5}, La/p640;->l(Ljava/lang/Object;IIII)Z

    .line 2200
    .line 2201
    .line 2202
    move-result v5

    .line 2203
    if-eqz v5, :cond_15

    .line 2204
    .line 2205
    sget-object v5, La/ift0;->c:La/gft0;

    .line 2206
    .line 2207
    invoke-virtual {v5, v1, v10, v11}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 2208
    .line 2209
    .line 2210
    move-result-wide v10

    .line 2211
    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 2212
    .line 2213
    .line 2214
    move-result-wide v10

    .line 2215
    const/4 v5, 0x1

    .line 2216
    invoke-virtual {v7, v12, v5}, La/qyc;->m(II)V

    .line 2217
    .line 2218
    .line 2219
    invoke-virtual {v7, v10, v11}, La/qyc;->j(J)V

    .line 2220
    .line 2221
    .line 2222
    :cond_15
    :goto_18
    add-int/lit8 v2, v2, 0x3

    .line 2223
    .line 2224
    const v10, 0xfffff

    .line 2225
    .line 2226
    .line 2227
    goto/16 :goto_0

    .line 2228
    .line 2229
    :cond_16
    iget-object v0, v0, La/p640;->h:La/aet0;

    .line 2230
    .line 2231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2232
    .line 2233
    .line 2234
    move-object v0, v1

    .line 2235
    check-cast v0, La/kjt;

    .line 2236
    .line 2237
    iget-object v0, v0, La/kjt;->unknownFields:La/xdt0;

    .line 2238
    .line 2239
    invoke-virtual {v0, v6}, La/xdt0;->b(La/prc;)V

    .line 2240
    .line 2241
    .line 2242
    return-void

    .line 2243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
        :pswitch_5b
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
        :pswitch_53
        :pswitch_52
        :pswitch_51
        :pswitch_50
        :pswitch_4f
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
    .end packed-switch

    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
    .end packed-switch
.end method

.method public final h(La/kjt;)I
    .locals 11

    .line 1
    iget-object v0, p0, La/p640;->a:[I

    .line 2
    .line 3
    array-length v1, v0

    .line 4
    const/4 v2, 0x0

    .line 5
    move v3, v2

    .line 6
    :goto_0
    if-ge v2, v1, :cond_3

    .line 7
    .line 8
    invoke-virtual {p0, v2}, La/p640;->w(I)I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    aget v5, v0, v2

    .line 13
    .line 14
    const v6, 0xfffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v6, v4

    .line 18
    int-to-long v6, v6

    .line 19
    invoke-static {v4}, La/p640;->v(I)I

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    const/16 v8, 0x4d5

    .line 24
    .line 25
    const/16 v9, 0x4cf

    .line 26
    .line 27
    const/16 v10, 0x25

    .line 28
    .line 29
    packed-switch v4, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    goto/16 :goto_4

    .line 33
    .line 34
    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    mul-int/lit8 v3, v3, 0x35

    .line 45
    .line 46
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 47
    .line 48
    .line 49
    move-result v4

    .line 50
    :goto_1
    add-int/2addr v4, v3

    .line 51
    move v3, v4

    .line 52
    goto/16 :goto_4

    .line 53
    .line 54
    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    mul-int/lit8 v3, v3, 0x35

    .line 61
    .line 62
    invoke-static {p1, v6, v7}, La/p640;->s(Ljava/lang/Object;J)J

    .line 63
    .line 64
    .line 65
    move-result-wide v4

    .line 66
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    goto :goto_1

    .line 71
    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    mul-int/lit8 v3, v3, 0x35

    .line 78
    .line 79
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    goto :goto_1

    .line 84
    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    mul-int/lit8 v3, v3, 0x35

    .line 91
    .line 92
    invoke-static {p1, v6, v7}, La/p640;->s(Ljava/lang/Object;J)J

    .line 93
    .line 94
    .line 95
    move-result-wide v4

    .line 96
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    goto :goto_1

    .line 101
    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_2

    .line 106
    .line 107
    mul-int/lit8 v3, v3, 0x35

    .line 108
    .line 109
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    goto :goto_1

    .line 114
    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_2

    .line 119
    .line 120
    mul-int/lit8 v3, v3, 0x35

    .line 121
    .line 122
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 123
    .line 124
    .line 125
    move-result v4

    .line 126
    goto :goto_1

    .line 127
    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_2

    .line 132
    .line 133
    mul-int/lit8 v3, v3, 0x35

    .line 134
    .line 135
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 136
    .line 137
    .line 138
    move-result v4

    .line 139
    goto :goto_1

    .line 140
    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v4

    .line 144
    if-eqz v4, :cond_2

    .line 145
    .line 146
    mul-int/lit8 v3, v3, 0x35

    .line 147
    .line 148
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 153
    .line 154
    .line 155
    move-result v4

    .line 156
    goto :goto_1

    .line 157
    :pswitch_8
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v4

    .line 161
    if-eqz v4, :cond_2

    .line 162
    .line 163
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    mul-int/lit8 v3, v3, 0x35

    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    goto :goto_1

    .line 174
    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v4

    .line 178
    if-eqz v4, :cond_2

    .line 179
    .line 180
    mul-int/lit8 v3, v3, 0x35

    .line 181
    .line 182
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v4

    .line 186
    check-cast v4, Ljava/lang/String;

    .line 187
    .line 188
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 189
    .line 190
    .line 191
    move-result v4

    .line 192
    goto/16 :goto_1

    .line 193
    .line 194
    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 195
    .line 196
    .line 197
    move-result v4

    .line 198
    if-eqz v4, :cond_2

    .line 199
    .line 200
    mul-int/lit8 v3, v3, 0x35

    .line 201
    .line 202
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, Ljava/lang/Boolean;

    .line 207
    .line 208
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    sget-object v5, La/dmx;->a:Ljava/nio/charset/Charset;

    .line 213
    .line 214
    if-eqz v4, :cond_0

    .line 215
    .line 216
    :goto_2
    move v8, v9

    .line 217
    :cond_0
    add-int/2addr v8, v3

    .line 218
    move v3, v8

    .line 219
    goto/16 :goto_4

    .line 220
    .line 221
    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v4

    .line 225
    if-eqz v4, :cond_2

    .line 226
    .line 227
    mul-int/lit8 v3, v3, 0x35

    .line 228
    .line 229
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 230
    .line 231
    .line 232
    move-result v4

    .line 233
    goto/16 :goto_1

    .line 234
    .line 235
    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v4

    .line 239
    if-eqz v4, :cond_2

    .line 240
    .line 241
    mul-int/lit8 v3, v3, 0x35

    .line 242
    .line 243
    invoke-static {p1, v6, v7}, La/p640;->s(Ljava/lang/Object;J)J

    .line 244
    .line 245
    .line 246
    move-result-wide v4

    .line 247
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 248
    .line 249
    .line 250
    move-result v4

    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v4

    .line 257
    if-eqz v4, :cond_2

    .line 258
    .line 259
    mul-int/lit8 v3, v3, 0x35

    .line 260
    .line 261
    invoke-static {p1, v6, v7}, La/p640;->r(Ljava/lang/Object;J)I

    .line 262
    .line 263
    .line 264
    move-result v4

    .line 265
    goto/16 :goto_1

    .line 266
    .line 267
    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v4

    .line 271
    if-eqz v4, :cond_2

    .line 272
    .line 273
    mul-int/lit8 v3, v3, 0x35

    .line 274
    .line 275
    invoke-static {p1, v6, v7}, La/p640;->s(Ljava/lang/Object;J)J

    .line 276
    .line 277
    .line 278
    move-result-wide v4

    .line 279
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    goto/16 :goto_1

    .line 284
    .line 285
    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v4

    .line 289
    if-eqz v4, :cond_2

    .line 290
    .line 291
    mul-int/lit8 v3, v3, 0x35

    .line 292
    .line 293
    invoke-static {p1, v6, v7}, La/p640;->s(Ljava/lang/Object;J)J

    .line 294
    .line 295
    .line 296
    move-result-wide v4

    .line 297
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    goto/16 :goto_1

    .line 302
    .line 303
    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-eqz v4, :cond_2

    .line 308
    .line 309
    mul-int/lit8 v3, v3, 0x35

    .line 310
    .line 311
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    check-cast v4, Ljava/lang/Float;

    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    .line 318
    .line 319
    .line 320
    move-result v4

    .line 321
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 322
    .line 323
    .line 324
    move-result v4

    .line 325
    goto/16 :goto_1

    .line 326
    .line 327
    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, La/p640;->n(IILjava/lang/Object;)Z

    .line 328
    .line 329
    .line 330
    move-result v4

    .line 331
    if-eqz v4, :cond_2

    .line 332
    .line 333
    mul-int/lit8 v3, v3, 0x35

    .line 334
    .line 335
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-result-object v4

    .line 339
    check-cast v4, Ljava/lang/Double;

    .line 340
    .line 341
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 342
    .line 343
    .line 344
    move-result-wide v4

    .line 345
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 346
    .line 347
    .line 348
    move-result-wide v4

    .line 349
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 350
    .line 351
    .line 352
    move-result v4

    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    .line 356
    .line 357
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 362
    .line 363
    .line 364
    move-result v4

    .line 365
    goto/16 :goto_1

    .line 366
    .line 367
    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    .line 368
    .line 369
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v4

    .line 373
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    goto/16 :goto_1

    .line 378
    .line 379
    :pswitch_14
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v4

    .line 383
    if-eqz v4, :cond_1

    .line 384
    .line 385
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 386
    .line 387
    .line 388
    move-result v10

    .line 389
    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    .line 390
    .line 391
    add-int/2addr v3, v10

    .line 392
    goto/16 :goto_4

    .line 393
    .line 394
    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    .line 395
    .line 396
    invoke-static {p1, v6, v7}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 397
    .line 398
    .line 399
    move-result-wide v4

    .line 400
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 401
    .line 402
    .line 403
    move-result v4

    .line 404
    goto/16 :goto_1

    .line 405
    .line 406
    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    .line 407
    .line 408
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 409
    .line 410
    .line 411
    move-result v4

    .line 412
    goto/16 :goto_1

    .line 413
    .line 414
    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    .line 415
    .line 416
    invoke-static {p1, v6, v7}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 417
    .line 418
    .line 419
    move-result-wide v4

    .line 420
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 421
    .line 422
    .line 423
    move-result v4

    .line 424
    goto/16 :goto_1

    .line 425
    .line 426
    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    .line 427
    .line 428
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 429
    .line 430
    .line 431
    move-result v4

    .line 432
    goto/16 :goto_1

    .line 433
    .line 434
    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    .line 435
    .line 436
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 437
    .line 438
    .line 439
    move-result v4

    .line 440
    goto/16 :goto_1

    .line 441
    .line 442
    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    .line 443
    .line 444
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 445
    .line 446
    .line 447
    move-result v4

    .line 448
    goto/16 :goto_1

    .line 449
    .line 450
    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    .line 451
    .line 452
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v4

    .line 456
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    goto/16 :goto_1

    .line 461
    .line 462
    :pswitch_1c
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    if-eqz v4, :cond_1

    .line 467
    .line 468
    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    .line 469
    .line 470
    .line 471
    move-result v10

    .line 472
    goto :goto_3

    .line 473
    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    .line 474
    .line 475
    invoke-static {p1, v6, v7}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 476
    .line 477
    .line 478
    move-result-object v4

    .line 479
    check-cast v4, Ljava/lang/String;

    .line 480
    .line 481
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 482
    .line 483
    .line 484
    move-result v4

    .line 485
    goto/16 :goto_1

    .line 486
    .line 487
    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    .line 488
    .line 489
    sget-object v4, La/ift0;->c:La/gft0;

    .line 490
    .line 491
    invoke-virtual {v4, p1, v6, v7}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    sget-object v5, La/dmx;->a:Ljava/nio/charset/Charset;

    .line 496
    .line 497
    if-eqz v4, :cond_0

    .line 498
    .line 499
    goto/16 :goto_2

    .line 500
    .line 501
    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    .line 502
    .line 503
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    goto/16 :goto_1

    .line 508
    .line 509
    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    .line 510
    .line 511
    invoke-static {p1, v6, v7}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 512
    .line 513
    .line 514
    move-result-wide v4

    .line 515
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 516
    .line 517
    .line 518
    move-result v4

    .line 519
    goto/16 :goto_1

    .line 520
    .line 521
    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    .line 522
    .line 523
    invoke-static {p1, v6, v7}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 524
    .line 525
    .line 526
    move-result v4

    .line 527
    goto/16 :goto_1

    .line 528
    .line 529
    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    .line 530
    .line 531
    invoke-static {p1, v6, v7}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 532
    .line 533
    .line 534
    move-result-wide v4

    .line 535
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    goto/16 :goto_1

    .line 540
    .line 541
    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    .line 542
    .line 543
    invoke-static {p1, v6, v7}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 544
    .line 545
    .line 546
    move-result-wide v4

    .line 547
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    goto/16 :goto_1

    .line 552
    .line 553
    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    .line 554
    .line 555
    sget-object v4, La/ift0;->c:La/gft0;

    .line 556
    .line 557
    invoke-virtual {v4, p1, v6, v7}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 558
    .line 559
    .line 560
    move-result v4

    .line 561
    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    .line 562
    .line 563
    .line 564
    move-result v4

    .line 565
    goto/16 :goto_1

    .line 566
    .line 567
    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    .line 568
    .line 569
    sget-object v4, La/ift0;->c:La/gft0;

    .line 570
    .line 571
    invoke-virtual {v4, p1, v6, v7}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 572
    .line 573
    .line 574
    move-result-wide v4

    .line 575
    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    .line 576
    .line 577
    .line 578
    move-result-wide v4

    .line 579
    invoke-static {v4, v5}, La/dmx;->a(J)I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    goto/16 :goto_1

    .line 584
    .line 585
    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    .line 586
    .line 587
    goto/16 :goto_0

    .line 588
    .line 589
    :cond_3
    mul-int/lit8 v3, v3, 0x35

    .line 590
    .line 591
    iget-object p0, p0, La/p640;->h:La/aet0;

    .line 592
    .line 593
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object p0, p1, La/kjt;->unknownFields:La/xdt0;

    .line 597
    .line 598
    invoke-virtual {p0}, La/xdt0;->hashCode()I

    .line 599
    .line 600
    .line 601
    move-result p0

    .line 602
    add-int/2addr p0, v3

    .line 603
    return p0

    .line 604
    nop

    .line 605
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

.method public final i(La/kjt;La/kjt;I)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p3, p1}, La/p640;->k(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-virtual {p0, p3, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-ne p1, p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
.end method

.method public final j(I)La/p2h0;
    .locals 2

    .line 1
    div-int/lit8 p1, p1, 0x3

    .line 2
    .line 3
    mul-int/lit8 p1, p1, 0x2

    .line 4
    .line 5
    iget-object p0, p0, La/p640;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aget-object v0, p0, p1

    .line 8
    .line 9
    check-cast v0, La/p2h0;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    sget-object v0, La/b5d0;->c:La/b5d0;

    .line 15
    .line 16
    add-int/lit8 v1, p1, 0x1

    .line 17
    .line 18
    aget-object v1, p0, v1

    .line 19
    .line 20
    check-cast v1, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/b5d0;->a(Ljava/lang/Class;)La/p2h0;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    aput-object v0, p0, p1

    .line 27
    .line 28
    return-object v0
.end method

.method public final k(ILjava/lang/Object;)Z
    .locals 7

    .line 1
    add-int/lit8 v0, p1, 0x2

    .line 2
    .line 3
    iget-object v1, p0, La/p640;->a:[I

    .line 4
    .line 5
    aget v0, v1, v0

    .line 6
    .line 7
    const v1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int v2, v0, v1

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    const-wide/32 v4, 0xfffff

    .line 14
    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x1

    .line 20
    if-nez v4, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, La/p640;->w(I)I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    and-int p1, p0, v1

    .line 27
    .line 28
    int-to-long v0, p1

    .line 29
    invoke-static {p0}, La/p640;->v(I)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    const-wide/16 v2, 0x0

    .line 34
    .line 35
    packed-switch p0, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    invoke-static {}, La/e9d0;->o()V

    .line 39
    .line 40
    .line 41
    return v5

    .line 42
    :pswitch_0
    invoke-static {p2, v0, v1}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    goto/16 :goto_0

    .line 49
    .line 50
    :pswitch_1
    invoke-static {p2, v0, v1}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 51
    .line 52
    .line 53
    move-result-wide p0

    .line 54
    cmp-long p0, p0, v2

    .line 55
    .line 56
    if-eqz p0, :cond_3

    .line 57
    .line 58
    goto/16 :goto_0

    .line 59
    .line 60
    :pswitch_2
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    goto/16 :goto_0

    .line 67
    .line 68
    :pswitch_3
    invoke-static {p2, v0, v1}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 69
    .line 70
    .line 71
    move-result-wide p0

    .line 72
    cmp-long p0, p0, v2

    .line 73
    .line 74
    if-eqz p0, :cond_3

    .line 75
    .line 76
    goto/16 :goto_0

    .line 77
    .line 78
    :pswitch_4
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-eqz p0, :cond_3

    .line 83
    .line 84
    goto/16 :goto_0

    .line 85
    .line 86
    :pswitch_5
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-eqz p0, :cond_3

    .line 91
    .line 92
    goto/16 :goto_0

    .line 93
    .line 94
    :pswitch_6
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    goto/16 :goto_0

    .line 101
    .line 102
    :pswitch_7
    sget-object p0, La/lg9;->c:La/lg9;

    .line 103
    .line 104
    invoke-static {p2, v0, v1}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {p0, p1}, La/lg9;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    xor-int/2addr p0, v6

    .line 113
    return p0

    .line 114
    :pswitch_8
    invoke-static {p2, v0, v1}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    if-eqz p0, :cond_3

    .line 119
    .line 120
    goto/16 :goto_0

    .line 121
    .line 122
    :pswitch_9
    invoke-static {p2, v0, v1}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    instance-of p1, p0, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz p1, :cond_0

    .line 129
    .line 130
    check-cast p0, Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    xor-int/2addr p0, v6

    .line 137
    return p0

    .line 138
    :cond_0
    instance-of p1, p0, La/lg9;

    .line 139
    .line 140
    if-eqz p1, :cond_1

    .line 141
    .line 142
    sget-object p1, La/lg9;->c:La/lg9;

    .line 143
    .line 144
    invoke-virtual {p1, p0}, La/lg9;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    xor-int/2addr p0, v6

    .line 149
    return p0

    .line 150
    :cond_1
    invoke-static {}, La/e9d0;->o()V

    .line 151
    .line 152
    .line 153
    return v5

    .line 154
    :pswitch_a
    sget-object p0, La/ift0;->c:La/gft0;

    .line 155
    .line 156
    invoke-virtual {p0, p2, v0, v1}, La/gft0;->a(Ljava/lang/Object;J)Z

    .line 157
    .line 158
    .line 159
    move-result p0

    .line 160
    return p0

    .line 161
    :pswitch_b
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    if-eqz p0, :cond_3

    .line 166
    .line 167
    goto :goto_0

    .line 168
    :pswitch_c
    invoke-static {p2, v0, v1}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 169
    .line 170
    .line 171
    move-result-wide p0

    .line 172
    cmp-long p0, p0, v2

    .line 173
    .line 174
    if-eqz p0, :cond_3

    .line 175
    .line 176
    goto :goto_0

    .line 177
    :pswitch_d
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 178
    .line 179
    .line 180
    move-result p0

    .line 181
    if-eqz p0, :cond_3

    .line 182
    .line 183
    goto :goto_0

    .line 184
    :pswitch_e
    invoke-static {p2, v0, v1}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 185
    .line 186
    .line 187
    move-result-wide p0

    .line 188
    cmp-long p0, p0, v2

    .line 189
    .line 190
    if-eqz p0, :cond_3

    .line 191
    .line 192
    goto :goto_0

    .line 193
    :pswitch_f
    invoke-static {p2, v0, v1}, La/ift0;->i(Ljava/lang/Object;J)J

    .line 194
    .line 195
    .line 196
    move-result-wide p0

    .line 197
    cmp-long p0, p0, v2

    .line 198
    .line 199
    if-eqz p0, :cond_3

    .line 200
    .line 201
    goto :goto_0

    .line 202
    :pswitch_10
    sget-object p0, La/ift0;->c:La/gft0;

    .line 203
    .line 204
    invoke-virtual {p0, p2, v0, v1}, La/gft0;->d(Ljava/lang/Object;J)F

    .line 205
    .line 206
    .line 207
    move-result p0

    .line 208
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-eqz p0, :cond_3

    .line 213
    .line 214
    goto :goto_0

    .line 215
    :pswitch_11
    sget-object p0, La/ift0;->c:La/gft0;

    .line 216
    .line 217
    invoke-virtual {p0, p2, v0, v1}, La/gft0;->c(Ljava/lang/Object;J)D

    .line 218
    .line 219
    .line 220
    move-result-wide p0

    .line 221
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    .line 222
    .line 223
    .line 224
    move-result-wide p0

    .line 225
    cmp-long p0, p0, v2

    .line 226
    .line 227
    if-eqz p0, :cond_3

    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_2
    ushr-int/lit8 p0, v0, 0x14

    .line 231
    .line 232
    shl-int p0, v6, p0

    .line 233
    .line 234
    invoke-static {p2, v2, v3}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 235
    .line 236
    .line 237
    move-result p1

    .line 238
    and-int/2addr p0, p1

    .line 239
    if-eqz p0, :cond_3

    .line 240
    .line 241
    :goto_0
    return v6

    .line 242
    :cond_3
    return v5

    .line 243
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
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

.method public final l(Ljava/lang/Object;IIII)Z
    .locals 1

    .line 1
    const v0, 0xfffff

    .line 2
    .line 3
    .line 4
    if-ne p3, v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0, p2, p1}, La/p640;->k(ILjava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result p0

    .line 10
    return p0

    .line 11
    :cond_0
    and-int p0, p4, p5

    .line 12
    .line 13
    if-eqz p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final n(IILjava/lang/Object;)Z
    .locals 2

    .line 1
    add-int/lit8 p2, p2, 0x2

    .line 2
    .line 3
    iget-object p0, p0, La/p640;->a:[I

    .line 4
    .line 5
    aget p0, p0, p2

    .line 6
    .line 7
    const p2, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p0, p2

    .line 11
    int-to-long v0, p0

    .line 12
    invoke-static {p3, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-ne p0, p1, :cond_0

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_0
    const/4 p0, 0x0

    .line 21
    return p0
.end method

.method public final o(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    .line 1
    invoke-virtual {p0, p1, p3}, La/p640;->k(ILjava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, p1}, La/p640;->w(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const v1, 0xfffff

    .line 13
    .line 14
    .line 15
    and-int/2addr v0, v1

    .line 16
    int-to-long v0, v0

    .line 17
    sget-object v2, La/p640;->k:Lsun/misc/Unsafe;

    .line 18
    .line 19
    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    if-eqz v3, :cond_4

    .line 24
    .line 25
    invoke-virtual {p0, p1}, La/p640;->j(I)La/p2h0;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p0, p1, p2}, La/p640;->k(ILjava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-nez v4, :cond_2

    .line 34
    .line 35
    invoke-static {v3}, La/p640;->m(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-nez v4, :cond_1

    .line 40
    .line 41
    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_1
    invoke-interface {p3}, La/p2h0;->d()La/kjt;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-interface {p3, v4, v3}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p0, p1, p2}, La/p640;->u(ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    return-void

    .line 59
    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, La/p640;->m(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_3

    .line 68
    .line 69
    invoke-interface {p3}, La/p2h0;->d()La/kjt;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    invoke-interface {p3, p1, p0}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, p2, v0, v1, p1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    move-object p0, p1

    .line 80
    :cond_3
    invoke-interface {p3, p0, v3}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_4
    iget-object p0, p0, La/p640;->a:[I

    .line 85
    .line 86
    aget p0, p0, p1

    .line 87
    .line 88
    invoke-static {p0, p3}, La/hny;->i(ILjava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final p(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 7

    .line 1
    iget-object v0, p0, La/p640;->a:[I

    .line 2
    .line 3
    aget v1, v0, p1

    .line 4
    .line 5
    invoke-virtual {p0, v1, p1, p3}, La/p640;->n(IILjava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-nez v2, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-virtual {p0, p1}, La/p640;->w(I)I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    const v3, 0xfffff

    .line 17
    .line 18
    .line 19
    and-int/2addr v2, v3

    .line 20
    int-to-long v4, v2

    .line 21
    sget-object v2, La/p640;->k:Lsun/misc/Unsafe;

    .line 22
    .line 23
    invoke-virtual {v2, p3, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v6

    .line 27
    if-eqz v6, :cond_4

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/p640;->j(I)La/p2h0;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    invoke-virtual {p0, v1, p1, p2}, La/p640;->n(IILjava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_2

    .line 38
    .line 39
    invoke-static {v6}, La/p640;->m(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_1

    .line 44
    .line 45
    invoke-virtual {v2, p2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    invoke-interface {p3}, La/p2h0;->d()La/kjt;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-interface {p3, p0, v6}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2, p2, v4, v5, p0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    add-int/lit8 p1, p1, 0x2

    .line 60
    .line 61
    aget p0, v0, p1

    .line 62
    .line 63
    and-int/2addr p0, v3

    .line 64
    int-to-long p0, p0

    .line 65
    invoke-static {p2, v1, p0, p1}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    invoke-virtual {v2, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, La/p640;->m(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    if-nez p1, :cond_3

    .line 78
    .line 79
    invoke-interface {p3}, La/p2h0;->d()La/kjt;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-interface {p3, p1, p0}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v2, p2, v4, v5, p1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    move-object p0, p1

    .line 90
    :cond_3
    invoke-interface {p3, p0, v6}, La/p2h0;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_4
    aget p0, v0, p1

    .line 95
    .line 96
    invoke-static {p0, p3}, La/hny;->i(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    return-void
.end method

.method public final u(ILjava/lang/Object;)V
    .locals 4

    .line 1
    add-int/lit8 p1, p1, 0x2

    .line 2
    .line 3
    iget-object p0, p0, La/p640;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    const p1, 0xfffff

    .line 8
    .line 9
    .line 10
    and-int/2addr p1, p0

    .line 11
    int-to-long v0, p1

    .line 12
    const-wide/32 v2, 0xfffff

    .line 13
    .line 14
    .line 15
    cmp-long p1, v0, v2

    .line 16
    .line 17
    if-nez p1, :cond_0

    .line 18
    .line 19
    return-void

    .line 20
    :cond_0
    ushr-int/lit8 p0, p0, 0x14

    .line 21
    .line 22
    const/4 p1, 0x1

    .line 23
    shl-int p0, p1, p0

    .line 24
    .line 25
    invoke-static {p2, v0, v1}, La/ift0;->h(Ljava/lang/Object;J)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    or-int/2addr p0, p1

    .line 30
    invoke-static {p2, p0, v0, v1}, La/ift0;->o(Ljava/lang/Object;IJ)V

    .line 31
    .line 32
    .line 33
    return-void
.end method

.method public final w(I)I
    .locals 0

    .line 1
    add-int/lit8 p1, p1, 0x1

    .line 2
    .line 3
    iget-object p0, p0, La/p640;->a:[I

    .line 4
    .line 5
    aget p0, p0, p1

    .line 6
    .line 7
    return p0
.end method
