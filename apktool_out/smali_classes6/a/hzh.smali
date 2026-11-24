.class public final synthetic La/hzh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/mm40;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/hzh;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/hzh;->b:La/mm40;

    iput-wide p2, p0, La/hzh;->c:J

    iput-wide p4, p0, La/hzh;->d:J

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;JJIB)V
    .locals 0

    .line 2
    iput-byte p7, p0, La/hzh;->a:B

    iput-object p1, p0, La/hzh;->b:La/mm40;

    iput-wide p2, p0, La/hzh;->c:J

    iput-wide p4, p0, La/hzh;->d:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/hzh;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    move-object/from16 v1, p1

    .line 10
    .line 11
    check-cast v1, La/fet;

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    check-cast v3, Ljava/lang/Integer;

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    and-int/lit8 v4, v3, 0x3

    .line 22
    .line 23
    const/4 v5, 0x2

    .line 24
    const/4 v6, 0x0

    .line 25
    if-eq v4, v5, :cond_0

    .line 26
    .line 27
    move v4, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v6

    .line 30
    :goto_0
    and-int/2addr v3, v2

    .line 31
    invoke-virtual {v1, v3, v4}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    sget-object v3, La/uc9;->a:La/lw3;

    .line 38
    .line 39
    sget-object v4, La/gqw0;->j:La/yx7;

    .line 40
    .line 41
    invoke-static {v3, v4, v1, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    iget-wide v4, v1, La/fet;->T:J

    .line 46
    .line 47
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    iget-object v6, v0, La/hzh;->b:La/mm40;

    .line 56
    .line 57
    invoke-static {v1, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 58
    .line 59
    .line 60
    move-result-object v6

    .line 61
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 62
    .line 63
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1}, La/fet;->i0()V

    .line 67
    .line 68
    .line 69
    iget-boolean v7, v1, La/fet;->S:Z

    .line 70
    .line 71
    if-eqz v7, :cond_1

    .line 72
    .line 73
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 74
    .line 75
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    invoke-virtual {v1}, La/fet;->r0()V

    .line 80
    .line 81
    .line 82
    :goto_1
    sget-object v7, La/gqw0;->x:La/shd;

    .line 83
    .line 84
    invoke-static {v1, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 85
    .line 86
    .line 87
    sget-object v3, La/gqw0;->w:La/shd;

    .line 88
    .line 89
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    sget-object v4, La/gqw0;->y:La/shd;

    .line 97
    .line 98
    invoke-static {v1, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 102
    .line 103
    .line 104
    sget-object v3, La/gqw0;->v:La/shd;

    .line 105
    .line 106
    invoke-static {v1, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 107
    .line 108
    .line 109
    sget-object v28, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 110
    .line 111
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    sget-object v5, La/qmk;->c:La/zcl;

    .line 116
    .line 117
    sget-object v6, La/vgg0;->a:La/ugg0;

    .line 118
    .line 119
    new-instance v6, La/ugg0;

    .line 120
    .line 121
    invoke-direct {v6, v5, v5, v5, v5}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 122
    .line 123
    .line 124
    sget-object v7, La/jm40;->b:La/jm40;

    .line 125
    .line 126
    invoke-static {v7, v3, v4, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const/high16 v4, 0x40800000    # 4.0f

    .line 131
    .line 132
    const/high16 v6, 0x40000000    # 2.0f

    .line 133
    .line 134
    invoke-static {v3, v4, v6}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    const-string v8, "MinutesTestTag"

    .line 139
    .line 140
    invoke-static {v3, v8}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    sget-object v8, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 145
    .line 146
    iget-wide v9, v0, La/hzh;->c:J

    .line 147
    .line 148
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v9

    .line 156
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v9

    .line 160
    const-string v10, "%02d"

    .line 161
    .line 162
    invoke-static {v8, v10, v9}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v9

    .line 166
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 167
    .line 168
    .line 169
    move-result-object v23

    .line 170
    move-object v11, v5

    .line 171
    move v12, v6

    .line 172
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 173
    .line 174
    .line 175
    move-result-wide v5

    .line 176
    new-instance v15, La/f2q0;

    .line 177
    .line 178
    const/4 v13, 0x6

    .line 179
    invoke-direct {v15, v13}, La/f2q0;-><init>(I)V

    .line 180
    .line 181
    .line 182
    const/16 v26, 0x6000

    .line 183
    .line 184
    const v27, 0x1bbf8

    .line 185
    .line 186
    .line 187
    move-object v14, v7

    .line 188
    const/4 v7, 0x0

    .line 189
    move/from16 v17, v4

    .line 190
    .line 191
    move-object/from16 v16, v8

    .line 192
    .line 193
    move-object v4, v3

    .line 194
    move-object v3, v9

    .line 195
    const-wide/16 v8, 0x0

    .line 196
    .line 197
    move-object/from16 v18, v10

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    move-object/from16 v19, v11

    .line 201
    .line 202
    const/4 v11, 0x0

    .line 203
    move/from16 v20, v12

    .line 204
    .line 205
    const/4 v12, 0x0

    .line 206
    move/from16 v21, v13

    .line 207
    .line 208
    move-object/from16 v22, v14

    .line 209
    .line 210
    const-wide/16 v13, 0x0

    .line 211
    .line 212
    move-object/from16 v24, v16

    .line 213
    .line 214
    move/from16 v25, v17

    .line 215
    .line 216
    const-wide/16 v16, 0x0

    .line 217
    .line 218
    move-object/from16 v29, v18

    .line 219
    .line 220
    const/16 v18, 0x0

    .line 221
    .line 222
    move-object/from16 v30, v19

    .line 223
    .line 224
    const/16 v19, 0x0

    .line 225
    .line 226
    move/from16 v31, v20

    .line 227
    .line 228
    const/16 v20, 0x1

    .line 229
    .line 230
    move/from16 v32, v21

    .line 231
    .line 232
    const/16 v21, 0x0

    .line 233
    .line 234
    move-object/from16 v33, v22

    .line 235
    .line 236
    const/16 v22, 0x0

    .line 237
    .line 238
    move/from16 v34, v25

    .line 239
    .line 240
    const/16 v25, 0x0

    .line 241
    .line 242
    move-object/from16 v35, v24

    .line 243
    .line 244
    move-object/from16 v36, v29

    .line 245
    .line 246
    move-object/from16 v0, v33

    .line 247
    .line 248
    move/from16 v2, v34

    .line 249
    .line 250
    move-object/from16 v24, v1

    .line 251
    .line 252
    move-object/from16 v1, v30

    .line 253
    .line 254
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 255
    .line 256
    .line 257
    sget-object v3, La/gqw0;->k:La/yx7;

    .line 258
    .line 259
    new-instance v4, La/ecu0;

    .line 260
    .line 261
    invoke-direct {v4, v3}, La/ecu0;-><init>(La/yx7;)V

    .line 262
    .line 263
    .line 264
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 265
    .line 266
    .line 267
    move-result-object v23

    .line 268
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 269
    .line 270
    .line 271
    move-result-wide v5

    .line 272
    const/16 v26, 0x0

    .line 273
    .line 274
    const v27, 0x1fff8

    .line 275
    .line 276
    .line 277
    const-string v3, " : "

    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    const/16 v20, 0x0

    .line 281
    .line 282
    const/16 v25, 0x6

    .line 283
    .line 284
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 285
    .line 286
    .line 287
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 288
    .line 289
    .line 290
    move-result-wide v3

    .line 291
    new-instance v5, La/ugg0;

    .line 292
    .line 293
    invoke-direct {v5, v1, v1, v1, v1}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v0, v3, v4, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const/high16 v12, 0x40000000    # 2.0f

    .line 301
    .line 302
    invoke-static {v0, v2, v12}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v1, "SecondsTestTag"

    .line 307
    .line 308
    invoke-static {v0, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    move-object/from16 v0, p0

    .line 313
    .line 314
    iget-wide v0, v0, La/hzh;->d:J

    .line 315
    .line 316
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    const/4 v1, 0x1

    .line 325
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    move-object/from16 v1, v35

    .line 330
    .line 331
    move-object/from16 v2, v36

    .line 332
    .line 333
    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v3

    .line 337
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 338
    .line 339
    .line 340
    move-result-object v23

    .line 341
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 342
    .line 343
    .line 344
    move-result-wide v5

    .line 345
    new-instance v15, La/f2q0;

    .line 346
    .line 347
    const/4 v0, 0x6

    .line 348
    invoke-direct {v15, v0}, La/f2q0;-><init>(I)V

    .line 349
    .line 350
    .line 351
    const/16 v26, 0x6000

    .line 352
    .line 353
    const v27, 0x1bbf8

    .line 354
    .line 355
    .line 356
    const/4 v12, 0x0

    .line 357
    const/16 v20, 0x1

    .line 358
    .line 359
    const/16 v25, 0x0

    .line 360
    .line 361
    invoke-static/range {v3 .. v27}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 362
    .line 363
    .line 364
    move-object/from16 v0, v24

    .line 365
    .line 366
    const/4 v1, 0x1

    .line 367
    invoke-virtual {v0, v1}, La/fet;->r(Z)V

    .line 368
    .line 369
    .line 370
    goto :goto_2

    .line 371
    :cond_2
    move-object v0, v1

    .line 372
    invoke-virtual {v0}, La/fet;->X()V

    .line 373
    .line 374
    .line 375
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_0
    move v1, v2

    .line 379
    move-object/from16 v6, p1

    .line 380
    .line 381
    check-cast v6, La/fet;

    .line 382
    .line 383
    move-object/from16 v2, p2

    .line 384
    .line 385
    check-cast v2, Ljava/lang/Integer;

    .line 386
    .line 387
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-static {v1}, La/x8x;->L(I)I

    .line 391
    .line 392
    .line 393
    move-result v7

    .line 394
    iget-object v1, v0, La/hzh;->b:La/mm40;

    .line 395
    .line 396
    iget-wide v2, v0, La/hzh;->c:J

    .line 397
    .line 398
    iget-wide v4, v0, La/hzh;->d:J

    .line 399
    .line 400
    invoke-static/range {v1 .. v7}, La/dyb;->a(La/mm40;JJLa/fet;I)V

    .line 401
    .line 402
    .line 403
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 404
    .line 405
    return-object v0

    .line 406
    :pswitch_1
    move v1, v2

    .line 407
    move-object/from16 v6, p1

    .line 408
    .line 409
    check-cast v6, La/fet;

    .line 410
    .line 411
    move-object/from16 v2, p2

    .line 412
    .line 413
    check-cast v2, Ljava/lang/Integer;

    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 416
    .line 417
    .line 418
    invoke-static {v1}, La/x8x;->L(I)I

    .line 419
    .line 420
    .line 421
    move-result v7

    .line 422
    iget-object v1, v0, La/hzh;->b:La/mm40;

    .line 423
    .line 424
    iget-wide v2, v0, La/hzh;->c:J

    .line 425
    .line 426
    iget-wide v4, v0, La/hzh;->d:J

    .line 427
    .line 428
    invoke-static/range {v1 .. v7}, La/i2m;->a(La/mm40;JJLa/fet;I)V

    .line 429
    .line 430
    .line 431
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object v0

    .line 434
    :pswitch_2
    move-object/from16 v6, p1

    .line 435
    .line 436
    check-cast v6, La/fet;

    .line 437
    .line 438
    move-object/from16 v1, p2

    .line 439
    .line 440
    check-cast v1, Ljava/lang/Integer;

    .line 441
    .line 442
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    const/4 v1, 0x7

    .line 446
    invoke-static {v1}, La/x8x;->L(I)I

    .line 447
    .line 448
    .line 449
    move-result v7

    .line 450
    iget-object v1, v0, La/hzh;->b:La/mm40;

    .line 451
    .line 452
    iget-wide v2, v0, La/hzh;->c:J

    .line 453
    .line 454
    iget-wide v4, v0, La/hzh;->d:J

    .line 455
    .line 456
    invoke-static/range {v1 .. v7}, La/wvb;->A(La/mm40;JJLa/fet;I)V

    .line 457
    .line 458
    .line 459
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    nop

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
