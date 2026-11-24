.class public abstract La/u18;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:J

.field public static final f:F

.field public static final g:F

.field public static final h:F

.field public static final i:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42280000    # 42.0f

    .line 4
    .line 5
    sput v0, La/u18;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42c80000    # 100.0f

    .line 8
    .line 9
    sput v0, La/u18;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x41400000    # 12.0f

    .line 12
    .line 13
    sput v0, La/u18;->c:F

    .line 14
    .line 15
    const/high16 v0, 0x40000000    # 2.0f

    .line 16
    .line 17
    sput v0, La/u18;->d:F

    .line 18
    .line 19
    const/high16 v0, 0x3f000000    # 0.5f

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {v0, v1}, La/osm0;->e(FF)J

    .line 23
    .line 24
    .line 25
    move-result-wide v0

    .line 26
    sput-wide v0, La/u18;->e:J

    .line 27
    .line 28
    const/high16 v0, 0x42580000    # 54.0f

    .line 29
    .line 30
    sput v0, La/u18;->f:F

    .line 31
    .line 32
    const/high16 v0, 0x428c0000    # 70.0f

    .line 33
    .line 34
    sput v0, La/u18;->g:F

    .line 35
    .line 36
    const/high16 v0, 0x40c00000    # 6.0f

    .line 37
    .line 38
    sput v0, La/u18;->h:F

    .line 39
    .line 40
    const/high16 v0, 0x40800000    # 4.0f

    .line 41
    .line 42
    sput v0, La/u18;->i:F

    .line 43
    .line 44
    return-void
.end method

.method public static final a(La/mm40;La/rz7;ZLa/fet;I)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v9, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    const v4, -0x15ca6334

    .line 15
    .line 16
    .line 17
    invoke-virtual {v9, v4}, La/fet;->g0(I)La/fet;

    .line 18
    .line 19
    .line 20
    and-int/lit8 v4, v0, 0x6

    .line 21
    .line 22
    const/4 v5, 0x2

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const/4 v4, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move v4, v5

    .line 34
    :goto_0
    or-int/2addr v4, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v4, v0

    .line 37
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 38
    .line 39
    if-nez v6, :cond_4

    .line 40
    .line 41
    and-int/lit8 v6, v0, 0x40

    .line 42
    .line 43
    if-nez v6, :cond_2

    .line 44
    .line 45
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    goto :goto_2

    .line 50
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    :goto_2
    if-eqz v6, :cond_3

    .line 55
    .line 56
    const/16 v6, 0x20

    .line 57
    .line 58
    goto :goto_3

    .line 59
    :cond_3
    const/16 v6, 0x10

    .line 60
    .line 61
    :goto_3
    or-int/2addr v4, v6

    .line 62
    :cond_4
    and-int/lit16 v6, v0, 0x180

    .line 63
    .line 64
    const/16 v7, 0x100

    .line 65
    .line 66
    if-nez v6, :cond_6

    .line 67
    .line 68
    invoke-virtual {v9, v3}, La/fet;->h(Z)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-eqz v6, :cond_5

    .line 73
    .line 74
    move v6, v7

    .line 75
    goto :goto_4

    .line 76
    :cond_5
    const/16 v6, 0x80

    .line 77
    .line 78
    :goto_4
    or-int/2addr v4, v6

    .line 79
    :cond_6
    and-int/lit16 v6, v4, 0x93

    .line 80
    .line 81
    const/16 v8, 0x92

    .line 82
    .line 83
    const/4 v10, 0x0

    .line 84
    const/4 v12, 0x1

    .line 85
    if-eq v6, v8, :cond_7

    .line 86
    .line 87
    move v6, v12

    .line 88
    goto :goto_5

    .line 89
    :cond_7
    move v6, v10

    .line 90
    :goto_5
    and-int/lit8 v8, v4, 0x1

    .line 91
    .line 92
    invoke-virtual {v9, v8, v6}, La/fet;->U(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_15

    .line 97
    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v6

    .line 102
    sget-object v13, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v6, v13, :cond_8

    .line 105
    .line 106
    const/4 v6, 0x0

    .line 107
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_8
    move-object v14, v6

    .line 115
    check-cast v14, La/t33;

    .line 116
    .line 117
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    and-int/lit16 v4, v4, 0x380

    .line 122
    .line 123
    if-ne v4, v7, :cond_9

    .line 124
    .line 125
    move v4, v12

    .line 126
    goto :goto_6

    .line 127
    :cond_9
    move v4, v10

    .line 128
    :goto_6
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    or-int/2addr v4, v7

    .line 133
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    if-nez v4, :cond_a

    .line 138
    .line 139
    if-ne v7, v13, :cond_b

    .line 140
    .line 141
    :cond_a
    new-instance v7, La/pw7;

    .line 142
    .line 143
    const/4 v4, 0x0

    .line 144
    invoke-direct {v7, v5, v14, v4, v3}, La/pw7;-><init>(BLa/t33;La/yje;Z)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 151
    .line 152
    invoke-static {v9, v6, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v4

    .line 159
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-nez v4, :cond_c

    .line 164
    .line 165
    if-ne v5, v13, :cond_d

    .line 166
    .line 167
    :cond_c
    new-instance v5, La/fu7;

    .line 168
    .line 169
    const/4 v4, 0x7

    .line 170
    invoke-direct {v5, v14, v4}, La/fu7;-><init>(La/t33;B)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    :cond_d
    move-object v15, v5

    .line 177
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 178
    .line 179
    sget v4, La/tz7;->b:F

    .line 180
    .line 181
    sget v5, La/tz7;->c:F

    .line 182
    .line 183
    invoke-static {v1, v4, v5}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-virtual {v9, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    if-nez v5, :cond_e

    .line 196
    .line 197
    if-ne v6, v13, :cond_f

    .line 198
    .line 199
    :cond_e
    new-instance v6, La/y;

    .line 200
    .line 201
    const/16 v5, 0xe

    .line 202
    .line 203
    invoke-direct {v6, v15, v5}, La/y;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v9, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 210
    .line 211
    invoke-static {v4, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 216
    .line 217
    invoke-static {v5, v10}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 218
    .line 219
    .line 220
    move-result-object v5

    .line 221
    iget-wide v6, v9, La/fet;->T:J

    .line 222
    .line 223
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 224
    .line 225
    .line 226
    move-result v6

    .line 227
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 228
    .line 229
    .line 230
    move-result-object v7

    .line 231
    invoke-static {v9, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 232
    .line 233
    .line 234
    move-result-object v4

    .line 235
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 236
    .line 237
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v9}, La/fet;->i0()V

    .line 241
    .line 242
    .line 243
    iget-boolean v8, v9, La/fet;->S:Z

    .line 244
    .line 245
    if-eqz v8, :cond_10

    .line 246
    .line 247
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 248
    .line 249
    invoke-virtual {v9, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 250
    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_10
    invoke-virtual {v9}, La/fet;->r0()V

    .line 254
    .line 255
    .line 256
    :goto_7
    sget-object v8, La/gqw0;->x:La/shd;

    .line 257
    .line 258
    invoke-static {v9, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 259
    .line 260
    .line 261
    sget-object v5, La/gqw0;->w:La/shd;

    .line 262
    .line 263
    invoke-static {v9, v7, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 264
    .line 265
    .line 266
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v5

    .line 270
    sget-object v6, La/gqw0;->y:La/shd;

    .line 271
    .line 272
    invoke-static {v9, v5, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 273
    .line 274
    .line 275
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 276
    .line 277
    .line 278
    sget-object v5, La/gqw0;->v:La/shd;

    .line 279
    .line 280
    invoke-static {v9, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 281
    .line 282
    .line 283
    sget-object v6, La/o7k0;->c:La/n0q;

    .line 284
    .line 285
    iget-object v4, v2, La/rz7;->d:Ljava/lang/String;

    .line 286
    .line 287
    const/16 v10, 0x1b0

    .line 288
    .line 289
    const/16 v11, 0x7f8

    .line 290
    .line 291
    const/4 v5, 0x0

    .line 292
    const/4 v7, 0x0

    .line 293
    const/4 v8, 0x0

    .line 294
    invoke-static/range {v4 .. v11}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 295
    .line 296
    .line 297
    iget-object v4, v2, La/rz7;->f:Ljava/lang/String;

    .line 298
    .line 299
    sget-object v5, La/gqw0;->d:La/zx7;

    .line 300
    .line 301
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    if-nez v6, :cond_11

    .line 310
    .line 311
    if-ne v7, v13, :cond_12

    .line 312
    .line 313
    :cond_11
    new-instance v7, La/fu7;

    .line 314
    .line 315
    const/16 v6, 0x8

    .line 316
    .line 317
    invoke-direct {v7, v14, v6}, La/fu7;-><init>(La/t33;B)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_12
    move-object v14, v7

    .line 324
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 325
    .line 326
    const/16 v19, 0x0

    .line 327
    .line 328
    const/16 v20, 0x1bc0

    .line 329
    .line 330
    sget v6, La/u18;->f:F

    .line 331
    .line 332
    sget v7, La/u18;->g:F

    .line 333
    .line 334
    const/4 v8, 0x0

    .line 335
    sget v9, La/u18;->h:F

    .line 336
    .line 337
    const-wide/16 v10, 0x0

    .line 338
    .line 339
    move/from16 v16, v12

    .line 340
    .line 341
    const/4 v12, 0x0

    .line 342
    move-object/from16 v17, v13

    .line 343
    .line 344
    const/4 v13, 0x0

    .line 345
    move-object/from16 v18, v15

    .line 346
    .line 347
    const/4 v15, 0x0

    .line 348
    move/from16 v21, v16

    .line 349
    .line 350
    const/16 v16, 0x0

    .line 351
    .line 352
    move-object/from16 v22, v18

    .line 353
    .line 354
    const v18, 0x1b6d86

    .line 355
    .line 356
    .line 357
    move-object/from16 v1, v17

    .line 358
    .line 359
    move-object/from16 v0, v22

    .line 360
    .line 361
    move-object/from16 v17, p3

    .line 362
    .line 363
    invoke-static/range {v4 .. v20}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 364
    .line 365
    .line 366
    move-object/from16 v9, v17

    .line 367
    .line 368
    iget-object v4, v2, La/rz7;->e:Ljava/lang/String;

    .line 369
    .line 370
    sget-object v5, La/gqw0;->i:La/zx7;

    .line 371
    .line 372
    invoke-virtual {v9, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v6

    .line 376
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v7

    .line 380
    if-nez v6, :cond_13

    .line 381
    .line 382
    if-ne v7, v1, :cond_14

    .line 383
    .line 384
    :cond_13
    new-instance v7, La/tq;

    .line 385
    .line 386
    const/16 v1, 0x18

    .line 387
    .line 388
    invoke-direct {v7, v0, v1}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    :cond_14
    move-object v14, v7

    .line 395
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 396
    .line 397
    const/16 v19, 0x0

    .line 398
    .line 399
    const/16 v20, 0x1b80

    .line 400
    .line 401
    sget v6, La/u18;->a:F

    .line 402
    .line 403
    sget v7, La/u18;->b:F

    .line 404
    .line 405
    sget v8, La/u18;->c:F

    .line 406
    .line 407
    sget v9, La/u18;->d:F

    .line 408
    .line 409
    sget-wide v10, La/u18;->e:J

    .line 410
    .line 411
    const/4 v12, 0x0

    .line 412
    const/4 v13, 0x0

    .line 413
    const/4 v15, 0x0

    .line 414
    const/16 v16, 0x0

    .line 415
    .line 416
    const v18, 0xdb6d86

    .line 417
    .line 418
    .line 419
    move-object/from16 v17, p3

    .line 420
    .line 421
    invoke-static/range {v4 .. v20}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 422
    .line 423
    .line 424
    move-object/from16 v9, v17

    .line 425
    .line 426
    const/4 v0, 0x1

    .line 427
    invoke-virtual {v9, v0}, La/fet;->r(Z)V

    .line 428
    .line 429
    .line 430
    goto :goto_8

    .line 431
    :cond_15
    invoke-virtual {v9}, La/fet;->X()V

    .line 432
    .line 433
    .line 434
    :goto_8
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 435
    .line 436
    .line 437
    move-result-object v6

    .line 438
    if-eqz v6, :cond_16

    .line 439
    .line 440
    new-instance v0, La/s18;

    .line 441
    .line 442
    const/4 v5, 0x1

    .line 443
    move-object/from16 v1, p0

    .line 444
    .line 445
    move/from16 v4, p4

    .line 446
    .line 447
    invoke-direct/range {v0 .. v5}, La/s18;-><init>(La/mm40;La/rz7;ZIB)V

    .line 448
    .line 449
    .line 450
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 451
    .line 452
    :cond_16
    return-void
.end method
