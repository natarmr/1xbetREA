.class public final synthetic La/mvg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w2d;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/pl7;

.field public final synthetic e:J


# direct methods
.method public synthetic constructor <init>(La/w2d;La/pl7;Lkotlin/jvm/functions/Function1;JB)V
    .locals 0

    .line 2
    iput-byte p6, p0, La/mvg0;->a:B

    iput-object p1, p0, La/mvg0;->b:La/w2d;

    iput-object p2, p0, La/mvg0;->d:La/pl7;

    iput-object p3, p0, La/mvg0;->c:Lkotlin/jvm/functions/Function1;

    iput-wide p4, p0, La/mvg0;->e:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/w2d;Lkotlin/jvm/functions/Function1;La/pl7;J)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/mvg0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mvg0;->b:La/w2d;

    iput-object p2, p0, La/mvg0;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/mvg0;->d:La/pl7;

    iput-wide p4, p0, La/mvg0;->e:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mvg0;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const-string v3, ""

    .line 8
    .line 9
    sget-object v4, La/ukd;->a:La/cl5;

    .line 10
    .line 11
    iget-object v5, v0, La/mvg0;->c:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    iget-object v6, v0, La/mvg0;->d:La/pl7;

    .line 14
    .line 15
    iget-object v7, v0, La/mvg0;->b:La/w2d;

    .line 16
    .line 17
    sget-object v8, La/jm40;->b:La/jm40;

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v11, 0x2

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/fet;

    .line 27
    .line 28
    move-object/from16 v12, p2

    .line 29
    .line 30
    check-cast v12, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v12

    .line 36
    and-int/lit8 v13, v12, 0x3

    .line 37
    .line 38
    if-eq v13, v11, :cond_0

    .line 39
    .line 40
    move v11, v9

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 v11, 0x0

    .line 43
    :goto_0
    and-int/2addr v12, v9

    .line 44
    invoke-virtual {v1, v12, v11}, La/fet;->U(IZ)Z

    .line 45
    .line 46
    .line 47
    move-result v11

    .line 48
    if-eqz v11, :cond_9

    .line 49
    .line 50
    invoke-static {v8, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v12

    .line 54
    new-instance v14, La/ilm;

    .line 55
    .line 56
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v8

    .line 62
    check-cast v8, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 63
    .line 64
    move v13, v9

    .line 65
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 66
    .line 67
    .line 68
    move-result-wide v9

    .line 69
    invoke-direct {v14, v9, v10}, La/ilm;-><init>(J)V

    .line 70
    .line 71
    .line 72
    iget-object v7, v7, La/w2d;->a:La/x2d;

    .line 73
    .line 74
    iget-object v8, v7, La/x2d;->d:La/agk0;

    .line 75
    .line 76
    iget-object v9, v7, La/x2d;->f:La/agk0;

    .line 77
    .line 78
    invoke-virtual {v8}, La/agk0;->l()F

    .line 79
    .line 80
    .line 81
    move-result v8

    .line 82
    invoke-virtual {v9}, La/agk0;->l()F

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    cmpg-float v8, v8, v10

    .line 87
    .line 88
    if-nez v8, :cond_1

    .line 89
    .line 90
    move v10, v13

    .line 91
    goto :goto_1

    .line 92
    :cond_1
    const/4 v10, 0x0

    .line 93
    :goto_1
    xor-int/lit8 v8, v10, 0x1

    .line 94
    .line 95
    invoke-interface {v6}, La/pl7;->b()La/on5;

    .line 96
    .line 97
    .line 98
    move-result-object v10

    .line 99
    instance-of v11, v10, La/dn5;

    .line 100
    .line 101
    if-eqz v11, :cond_2

    .line 102
    .line 103
    check-cast v10, La/dn5;

    .line 104
    .line 105
    iget-object v10, v10, La/dn5;->c:Ljava/lang/String;

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_2
    move-object v10, v3

    .line 109
    :goto_2
    invoke-virtual {v1, v8}, La/fet;->h(Z)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    or-int/2addr v8, v10

    .line 118
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    if-nez v8, :cond_3

    .line 123
    .line 124
    if-ne v10, v4, :cond_6

    .line 125
    .line 126
    :cond_3
    iget-object v7, v7, La/x2d;->d:La/agk0;

    .line 127
    .line 128
    invoke-virtual {v7}, La/agk0;->l()F

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    invoke-virtual {v9}, La/agk0;->l()F

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    cmpg-float v7, v7, v8

    .line 137
    .line 138
    iget-wide v8, v0, La/mvg0;->e:J

    .line 139
    .line 140
    sget-object v22, La/fa50;->a:La/fa50;

    .line 141
    .line 142
    if-nez v7, :cond_5

    .line 143
    .line 144
    invoke-interface {v6}, La/pl7;->getTitle()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v16

    .line 148
    invoke-interface {v6}, La/pl7;->b()La/on5;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    instance-of v6, v0, La/dn5;

    .line 153
    .line 154
    if-eqz v6, :cond_4

    .line 155
    .line 156
    check-cast v0, La/dn5;

    .line 157
    .line 158
    iget-object v3, v0, La/dn5;->c:Ljava/lang/String;

    .line 159
    .line 160
    :cond_4
    move-object/from16 v17, v3

    .line 161
    .line 162
    new-instance v15, La/rlm;

    .line 163
    .line 164
    move-wide/from16 v20, v8

    .line 165
    .line 166
    move-wide/from16 v18, v8

    .line 167
    .line 168
    invoke-direct/range {v15 .. v22}, La/rlm;-><init>(Ljava/lang/String;Ljava/lang/String;JJLa/ga50;)V

    .line 169
    .line 170
    .line 171
    move-object v10, v15

    .line 172
    goto :goto_3

    .line 173
    :cond_5
    move-wide v7, v8

    .line 174
    move-object/from16 v0, v22

    .line 175
    .line 176
    new-instance v3, La/plm;

    .line 177
    .line 178
    invoke-interface {v6}, La/pl7;->getTitle()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v6

    .line 182
    invoke-direct {v3, v6, v7, v8, v0}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 183
    .line 184
    .line 185
    move-object v10, v3

    .line 186
    :goto_3
    invoke-virtual {v1, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    :cond_6
    move-object v15, v10

    .line 190
    check-cast v15, La/tlm;

    .line 191
    .line 192
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 197
    .line 198
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 199
    .line 200
    .line 201
    move-result-wide v17

    .line 202
    new-instance v13, La/imm;

    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    sget-object v16, La/fmm;->a:La/fmm;

    .line 207
    .line 208
    const/16 v19, 0x0

    .line 209
    .line 210
    invoke-direct/range {v13 .. v20}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v1, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 214
    .line 215
    .line 216
    move-result v0

    .line 217
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-nez v0, :cond_7

    .line 222
    .line 223
    if-ne v2, v4, :cond_8

    .line 224
    .line 225
    :cond_7
    new-instance v2, La/gno0;

    .line 226
    .line 227
    const/16 v0, 0xf

    .line 228
    .line 229
    invoke-direct {v2, v5, v0}, La/gno0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v1, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    :cond_8
    move-object v15, v2

    .line 236
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 237
    .line 238
    const/16 v26, 0x0

    .line 239
    .line 240
    const/16 v27, 0xff4

    .line 241
    .line 242
    const/4 v14, 0x0

    .line 243
    const/16 v16, 0x0

    .line 244
    .line 245
    const/16 v17, 0x0

    .line 246
    .line 247
    const/16 v18, 0x0

    .line 248
    .line 249
    const/16 v19, 0x0

    .line 250
    .line 251
    const/16 v20, 0x0

    .line 252
    .line 253
    const/16 v21, 0x0

    .line 254
    .line 255
    const/16 v22, 0x0

    .line 256
    .line 257
    const/16 v23, 0x0

    .line 258
    .line 259
    const/16 v25, 0x6

    .line 260
    .line 261
    move-object/from16 v24, v1

    .line 262
    .line 263
    invoke-static/range {v12 .. v27}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 264
    .line 265
    .line 266
    goto :goto_4

    .line 267
    :cond_9
    move-object/from16 v24, v1

    .line 268
    .line 269
    invoke-virtual/range {v24 .. v24}, La/fet;->X()V

    .line 270
    .line 271
    .line 272
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_0
    move v1, v9

    .line 276
    move-object/from16 v13, p1

    .line 277
    .line 278
    check-cast v13, La/fet;

    .line 279
    .line 280
    move-object/from16 v9, p2

    .line 281
    .line 282
    check-cast v9, Ljava/lang/Integer;

    .line 283
    .line 284
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 285
    .line 286
    .line 287
    move-result v9

    .line 288
    and-int/lit8 v10, v9, 0x3

    .line 289
    .line 290
    if-eq v10, v11, :cond_a

    .line 291
    .line 292
    move v10, v1

    .line 293
    goto :goto_5

    .line 294
    :cond_a
    const/4 v10, 0x0

    .line 295
    :goto_5
    and-int/2addr v9, v1

    .line 296
    invoke-virtual {v13, v9, v10}, La/fet;->U(IZ)Z

    .line 297
    .line 298
    .line 299
    move-result v9

    .line 300
    if-eqz v9, :cond_12

    .line 301
    .line 302
    invoke-static {v8, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 303
    .line 304
    .line 305
    move-result-object v2

    .line 306
    new-instance v8, La/ilm;

    .line 307
    .line 308
    sget-object v9, La/zaq0;->b:La/zfn;

    .line 309
    .line 310
    invoke-virtual {v13, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    check-cast v10, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 315
    .line 316
    move v12, v1

    .line 317
    move-object/from16 p1, v2

    .line 318
    .line 319
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 320
    .line 321
    .line 322
    move-result-wide v1

    .line 323
    invoke-direct {v8, v1, v2}, La/ilm;-><init>(J)V

    .line 324
    .line 325
    .line 326
    iget-object v1, v7, La/w2d;->a:La/x2d;

    .line 327
    .line 328
    iget-object v2, v1, La/x2d;->d:La/agk0;

    .line 329
    .line 330
    iget-object v7, v1, La/x2d;->f:La/agk0;

    .line 331
    .line 332
    invoke-virtual {v2}, La/agk0;->l()F

    .line 333
    .line 334
    .line 335
    move-result v2

    .line 336
    invoke-virtual {v7}, La/agk0;->l()F

    .line 337
    .line 338
    .line 339
    move-result v10

    .line 340
    cmpg-float v2, v2, v10

    .line 341
    .line 342
    if-nez v2, :cond_b

    .line 343
    .line 344
    move v10, v12

    .line 345
    goto :goto_6

    .line 346
    :cond_b
    const/4 v10, 0x0

    .line 347
    :goto_6
    xor-int/lit8 v2, v10, 0x1

    .line 348
    .line 349
    invoke-virtual {v13, v2}, La/fet;->h(Z)Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    if-nez v2, :cond_c

    .line 358
    .line 359
    if-ne v10, v4, :cond_f

    .line 360
    .line 361
    :cond_c
    iget-object v1, v1, La/x2d;->d:La/agk0;

    .line 362
    .line 363
    invoke-virtual {v1}, La/agk0;->l()F

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-virtual {v7}, La/agk0;->l()F

    .line 368
    .line 369
    .line 370
    move-result v2

    .line 371
    cmpg-float v1, v1, v2

    .line 372
    .line 373
    iget-wide v14, v0, La/mvg0;->e:J

    .line 374
    .line 375
    sget-object v21, La/fa50;->a:La/fa50;

    .line 376
    .line 377
    if-nez v1, :cond_e

    .line 378
    .line 379
    move-wide/from16 v17, v14

    .line 380
    .line 381
    invoke-interface {v6}, La/pl7;->getTitle()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v15

    .line 385
    invoke-interface {v6}, La/pl7;->b()La/on5;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    instance-of v1, v0, La/dn5;

    .line 390
    .line 391
    if-eqz v1, :cond_d

    .line 392
    .line 393
    check-cast v0, La/dn5;

    .line 394
    .line 395
    iget-object v3, v0, La/dn5;->c:Ljava/lang/String;

    .line 396
    .line 397
    :cond_d
    move-object/from16 v16, v3

    .line 398
    .line 399
    new-instance v14, La/rlm;

    .line 400
    .line 401
    move-wide/from16 v19, v17

    .line 402
    .line 403
    invoke-direct/range {v14 .. v21}, La/rlm;-><init>(Ljava/lang/String;Ljava/lang/String;JJLa/ga50;)V

    .line 404
    .line 405
    .line 406
    move-object v10, v14

    .line 407
    goto :goto_7

    .line 408
    :cond_e
    move-wide v0, v14

    .line 409
    move-object/from16 v2, v21

    .line 410
    .line 411
    new-instance v3, La/plm;

    .line 412
    .line 413
    invoke-interface {v6}, La/pl7;->getTitle()Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v6

    .line 417
    invoke-direct {v3, v6, v0, v1, v2}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 418
    .line 419
    .line 420
    move-object v10, v3

    .line 421
    :goto_7
    invoke-virtual {v13, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    :cond_f
    move-object/from16 v18, v10

    .line 425
    .line 426
    check-cast v18, La/tlm;

    .line 427
    .line 428
    invoke-virtual {v13, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 433
    .line 434
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 435
    .line 436
    .line 437
    move-result-wide v20

    .line 438
    new-instance v16, La/imm;

    .line 439
    .line 440
    const/16 v23, 0x0

    .line 441
    .line 442
    sget-object v19, La/fmm;->a:La/fmm;

    .line 443
    .line 444
    const/16 v22, 0x0

    .line 445
    .line 446
    move-object/from16 v17, v8

    .line 447
    .line 448
    invoke-direct/range {v16 .. v23}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v13, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 452
    .line 453
    .line 454
    move-result v0

    .line 455
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    if-nez v0, :cond_10

    .line 460
    .line 461
    if-ne v1, v4, :cond_11

    .line 462
    .line 463
    :cond_10
    new-instance v1, La/dng0;

    .line 464
    .line 465
    invoke-direct {v1, v5, v11}, La/dng0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v13, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    :cond_11
    move-object v4, v1

    .line 472
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 473
    .line 474
    const/4 v15, 0x0

    .line 475
    move-object/from16 v2, v16

    .line 476
    .line 477
    const/16 v16, 0xff4

    .line 478
    .line 479
    const/4 v3, 0x0

    .line 480
    const/4 v5, 0x0

    .line 481
    const/4 v6, 0x0

    .line 482
    const/4 v7, 0x0

    .line 483
    const/4 v8, 0x0

    .line 484
    const/4 v9, 0x0

    .line 485
    const/4 v10, 0x0

    .line 486
    const/4 v11, 0x0

    .line 487
    const/4 v12, 0x0

    .line 488
    const/4 v14, 0x6

    .line 489
    move-object/from16 v1, p1

    .line 490
    .line 491
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 492
    .line 493
    .line 494
    goto :goto_8

    .line 495
    :cond_12
    invoke-virtual {v13}, La/fet;->X()V

    .line 496
    .line 497
    .line 498
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_1
    move v12, v9

    .line 502
    move-object/from16 v4, p1

    .line 503
    .line 504
    check-cast v4, La/fet;

    .line 505
    .line 506
    move-object/from16 v1, p2

    .line 507
    .line 508
    check-cast v1, Ljava/lang/Integer;

    .line 509
    .line 510
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 511
    .line 512
    .line 513
    move-result v1

    .line 514
    and-int/lit8 v2, v1, 0x3

    .line 515
    .line 516
    if-eq v2, v11, :cond_13

    .line 517
    .line 518
    move v2, v12

    .line 519
    goto :goto_9

    .line 520
    :cond_13
    const/4 v2, 0x0

    .line 521
    :goto_9
    and-int/2addr v1, v12

    .line 522
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 523
    .line 524
    .line 525
    move-result v1

    .line 526
    if-eqz v1, :cond_15

    .line 527
    .line 528
    sget-object v1, La/uc9;->c:La/mw3;

    .line 529
    .line 530
    sget-object v2, La/gqw0;->m:La/xx7;

    .line 531
    .line 532
    const/4 v15, 0x0

    .line 533
    invoke-static {v1, v2, v4, v15}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    iget-wide v2, v4, La/fet;->T:J

    .line 538
    .line 539
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 540
    .line 541
    .line 542
    move-result v2

    .line 543
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-static {v4, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 548
    .line 549
    .line 550
    move-result-object v5

    .line 551
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 552
    .line 553
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    invoke-virtual {v4}, La/fet;->i0()V

    .line 557
    .line 558
    .line 559
    iget-boolean v6, v4, La/fet;->S:Z

    .line 560
    .line 561
    if-eqz v6, :cond_14

    .line 562
    .line 563
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 564
    .line 565
    invoke-virtual {v4, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 566
    .line 567
    .line 568
    goto :goto_a

    .line 569
    :cond_14
    invoke-virtual {v4}, La/fet;->r0()V

    .line 570
    .line 571
    .line 572
    :goto_a
    sget-object v6, La/gqw0;->x:La/shd;

    .line 573
    .line 574
    invoke-static {v4, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 575
    .line 576
    .line 577
    sget-object v1, La/gqw0;->w:La/shd;

    .line 578
    .line 579
    invoke-static {v4, v3, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 580
    .line 581
    .line 582
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v1

    .line 586
    sget-object v2, La/gqw0;->y:La/shd;

    .line 587
    .line 588
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 589
    .line 590
    .line 591
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 592
    .line 593
    .line 594
    sget-object v1, La/gqw0;->v:La/shd;

    .line 595
    .line 596
    invoke-static {v4, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 597
    .line 598
    .line 599
    new-instance v1, La/xbd;

    .line 600
    .line 601
    iget-object v8, v0, La/mvg0;->d:La/pl7;

    .line 602
    .line 603
    iget-object v7, v0, La/mvg0;->c:Lkotlin/jvm/functions/Function1;

    .line 604
    .line 605
    const/4 v2, 0x3

    .line 606
    invoke-direct {v1, v8, v7, v2}, La/xbd;-><init>(La/pl7;Lkotlin/jvm/functions/Function1;B)V

    .line 607
    .line 608
    .line 609
    const v2, 0x63ff276b

    .line 610
    .line 611
    .line 612
    invoke-static {v2, v1, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 613
    .line 614
    .line 615
    move-result-object v3

    .line 616
    new-instance v5, La/mvg0;

    .line 617
    .line 618
    iget-object v2, v0, La/mvg0;->b:La/w2d;

    .line 619
    .line 620
    iget-wide v9, v0, La/mvg0;->e:J

    .line 621
    .line 622
    move-object v6, v2

    .line 623
    invoke-direct/range {v5 .. v10}, La/mvg0;-><init>(La/w2d;Lkotlin/jvm/functions/Function1;La/pl7;J)V

    .line 624
    .line 625
    .line 626
    const v0, 0x5f79f30a

    .line 627
    .line 628
    .line 629
    invoke-static {v0, v5, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    const/16 v6, 0xdc0

    .line 634
    .line 635
    const/4 v1, 0x0

    .line 636
    move-object v5, v4

    .line 637
    move-object v4, v0

    .line 638
    invoke-static/range {v1 .. v6}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 639
    .line 640
    .line 641
    move-object v4, v5

    .line 642
    const/4 v5, 0x6

    .line 643
    const/4 v6, 0x6

    .line 644
    sget-object v1, La/zfi0;->a:La/zfi0;

    .line 645
    .line 646
    const/4 v2, 0x0

    .line 647
    const/4 v3, 0x0

    .line 648
    invoke-static/range {v1 .. v6}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 649
    .line 650
    .line 651
    move v13, v12

    .line 652
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 653
    .line 654
    .line 655
    goto :goto_b

    .line 656
    :cond_15
    invoke-virtual {v4}, La/fet;->X()V

    .line 657
    .line 658
    .line 659
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 660
    .line 661
    return-object v0

    .line 662
    nop

    .line 663
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
