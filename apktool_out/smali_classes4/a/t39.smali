.class public final synthetic La/t39;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/nwd;Landroidx/fragment/app/Fragment;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;La/x3m;La/jtv;)V
    .locals 0

    .line 2
    const/4 p2, 0x1

    iput-byte p2, p0, La/t39;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t39;->b:Ljava/lang/Object;

    iput-object p3, p0, La/t39;->c:Ljava/lang/Object;

    iput-object p4, p0, La/t39;->d:Ljava/lang/Object;

    iput-object p5, p0, La/t39;->e:Ljava/lang/Object;

    iput-object p6, p0, La/t39;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/y9j;La/nek;Lkotlin/jvm/functions/Function0;La/xak;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/t39;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/t39;->b:Ljava/lang/Object;

    iput-object p2, p0, La/t39;->c:Ljava/lang/Object;

    iput-object p3, p0, La/t39;->d:Ljava/lang/Object;

    iput-object p4, p0, La/t39;->f:Ljava/lang/Object;

    iput-object p5, p0, La/t39;->e:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/t39;->a:B

    iput-object p1, p0, La/t39;->b:Ljava/lang/Object;

    iput-object p2, p0, La/t39;->c:Ljava/lang/Object;

    iput-object p3, p0, La/t39;->d:Ljava/lang/Object;

    iput-object p4, p0, La/t39;->e:Ljava/lang/Object;

    iput-object p5, p0, La/t39;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/t39;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x2

    .line 7
    sget-object v4, La/ukd;->a:La/cl5;

    .line 8
    .line 9
    const/16 v5, 0x90

    .line 10
    .line 11
    const/16 v6, 0x10

    .line 12
    .line 13
    const/16 v7, 0x20

    .line 14
    .line 15
    iget-object v9, v0, La/t39;->f:Ljava/lang/Object;

    .line 16
    .line 17
    iget-object v10, v0, La/t39;->e:Ljava/lang/Object;

    .line 18
    .line 19
    iget-object v11, v0, La/t39;->d:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v12, v0, La/t39;->c:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v0, v0, La/t39;->b:Ljava/lang/Object;

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/4 v14, 0x1

    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v0, La/g960;

    .line 31
    .line 32
    check-cast v12, La/nrq;

    .line 33
    .line 34
    check-cast v11, La/l7m0;

    .line 35
    .line 36
    check-cast v10, La/l7m0;

    .line 37
    .line 38
    check-cast v9, La/pz40;

    .line 39
    .line 40
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, La/b53;

    .line 43
    .line 44
    move-object/from16 v2, p2

    .line 45
    .line 46
    check-cast v2, La/wke;

    .line 47
    .line 48
    move-object/from16 v4, p3

    .line 49
    .line 50
    check-cast v4, La/fet;

    .line 51
    .line 52
    move-object/from16 v15, p4

    .line 53
    .line 54
    check-cast v15, Ljava/lang/Integer;

    .line 55
    .line 56
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 57
    .line 58
    .line 59
    move-result v15

    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    and-int/lit8 v1, v15, 0x30

    .line 67
    .line 68
    if-nez v1, :cond_1

    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    invoke-virtual {v4, v1}, La/fet;->e(I)Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_0

    .line 79
    .line 80
    move v6, v7

    .line 81
    :cond_0
    or-int/2addr v15, v6

    .line 82
    :cond_1
    and-int/lit16 v1, v15, 0x91

    .line 83
    .line 84
    if-eq v1, v5, :cond_2

    .line 85
    .line 86
    move v1, v14

    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move v1, v13

    .line 89
    :goto_0
    and-int/lit8 v5, v15, 0x1

    .line 90
    .line 91
    invoke-virtual {v4, v5, v1}, La/fet;->U(IZ)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_9

    .line 96
    .line 97
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    if-eq v1, v14, :cond_7

    .line 104
    .line 105
    if-ne v1, v3, :cond_6

    .line 106
    .line 107
    const v1, -0x4c901463

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/g960;->g:Ljava/lang/String;

    .line 114
    .line 115
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    check-cast v1, La/e960;

    .line 120
    .line 121
    instance-of v2, v1, La/d960;

    .line 122
    .line 123
    if-eqz v2, :cond_3

    .line 124
    .line 125
    check-cast v1, La/d960;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_3
    const/4 v1, 0x0

    .line 129
    :goto_1
    if-eqz v1, :cond_4

    .line 130
    .line 131
    iget-object v8, v1, La/d960;->a:Ljava/lang/String;

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_4
    const/4 v8, 0x0

    .line 135
    :goto_2
    if-nez v8, :cond_5

    .line 136
    .line 137
    const-string v8, ""

    .line 138
    .line 139
    :cond_5
    invoke-static {v0, v8, v12, v4, v13}, La/dak0;->b(Ljava/lang/String;Ljava/lang/String;La/nrq;La/fet;I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 143
    .line 144
    .line 145
    goto :goto_3

    .line 146
    :cond_6
    const v0, 0x79668009

    .line 147
    .line 148
    .line 149
    invoke-static {v0, v4, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    throw v0

    .line 154
    :cond_7
    const v1, -0x4c93f979

    .line 155
    .line 156
    .line 157
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, Ljava/lang/Number;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v2

    .line 174
    check-cast v2, Ljava/lang/Number;

    .line 175
    .line 176
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 177
    .line 178
    .line 179
    move-result v2

    .line 180
    invoke-static {v0, v1, v2, v4, v13}, La/dak0;->d(La/g960;FFLa/fet;I)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 184
    .line 185
    .line 186
    goto :goto_3

    .line 187
    :cond_8
    const v1, -0x4c95e691

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    iget-object v0, v0, La/g960;->c:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v0, v4, v13}, La/dak0;->a(Ljava/lang/String;La/fet;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v4, v13}, La/fet;->r(Z)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_9
    invoke-virtual {v4}, La/fet;->X()V

    .line 203
    .line 204
    .line 205
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object v0

    .line 208
    :pswitch_0
    move-object v2, v0

    .line 209
    check-cast v2, La/xk80;

    .line 210
    .line 211
    check-cast v12, La/k6z;

    .line 212
    .line 213
    check-cast v11, La/a4x;

    .line 214
    .line 215
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 216
    .line 217
    move-object/from16 v18, v9

    .line 218
    .line 219
    check-cast v18, La/zsf;

    .line 220
    .line 221
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, La/rk80;

    .line 224
    .line 225
    move-object/from16 v1, p2

    .line 226
    .line 227
    check-cast v1, Ljava/lang/Integer;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 230
    .line 231
    .line 232
    move-result v3

    .line 233
    move-object/from16 v8, p3

    .line 234
    .line 235
    check-cast v8, La/fet;

    .line 236
    .line 237
    move-object/from16 v1, p4

    .line 238
    .line 239
    check-cast v1, Ljava/lang/Integer;

    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    and-int/lit8 v0, v1, 0x30

    .line 249
    .line 250
    if-nez v0, :cond_b

    .line 251
    .line 252
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_a

    .line 257
    .line 258
    move v6, v7

    .line 259
    :cond_a
    or-int/2addr v1, v6

    .line 260
    :cond_b
    and-int/lit16 v0, v1, 0x91

    .line 261
    .line 262
    if-eq v0, v5, :cond_c

    .line 263
    .line 264
    move v0, v14

    .line 265
    goto :goto_4

    .line 266
    :cond_c
    move v0, v13

    .line 267
    :goto_4
    and-int/lit8 v5, v1, 0x1

    .line 268
    .line 269
    invoke-virtual {v8, v5, v0}, La/fet;->U(IZ)Z

    .line 270
    .line 271
    .line 272
    move-result v0

    .line 273
    if-eqz v0, :cond_15

    .line 274
    .line 275
    invoke-virtual {v2}, La/xk80;->r()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    if-ne v0, v3, :cond_d

    .line 280
    .line 281
    move v0, v14

    .line 282
    goto :goto_5

    .line 283
    :cond_d
    move v0, v13

    .line 284
    :goto_5
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    const/4 v6, 0x0

    .line 289
    if-ne v5, v4, :cond_e

    .line 290
    .line 291
    invoke-static {v6}, La/xf0;->c(F)La/t33;

    .line 292
    .line 293
    .line 294
    move-result-object v5

    .line 295
    invoke-virtual {v8, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    :cond_e
    check-cast v5, La/t33;

    .line 299
    .line 300
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 301
    .line 302
    .line 303
    move-result-object v9

    .line 304
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v15

    .line 308
    invoke-virtual {v8, v0}, La/fet;->h(Z)Z

    .line 309
    .line 310
    .line 311
    move-result v16

    .line 312
    or-int v15, v15, v16

    .line 313
    .line 314
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v6

    .line 318
    if-nez v15, :cond_10

    .line 319
    .line 320
    if-ne v6, v4, :cond_f

    .line 321
    .line 322
    goto :goto_6

    .line 323
    :cond_f
    move/from16 v17, v0

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_10
    :goto_6
    new-instance v15, La/ys8;

    .line 327
    .line 328
    const/16 v20, 0x5

    .line 329
    .line 330
    const/16 v19, 0x0

    .line 331
    .line 332
    move/from16 v17, v0

    .line 333
    .line 334
    move-object/from16 v16, v5

    .line 335
    .line 336
    invoke-direct/range {v15 .. v20}, La/ys8;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v8, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    move-object v6, v15

    .line 343
    :goto_7
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 344
    .line 345
    invoke-static {v8, v9, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 346
    .line 347
    .line 348
    sget-object v0, La/jm40;->b:La/jm40;

    .line 349
    .line 350
    const/high16 v6, 0x3f800000    # 1.0f

    .line 351
    .line 352
    invoke-static {v0, v6}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    if-eqz v17, :cond_11

    .line 357
    .line 358
    goto :goto_8

    .line 359
    :cond_11
    const/4 v6, 0x0

    .line 360
    :goto_8
    invoke-static {v0, v6}, La/k7n0;->H(La/mm40;F)La/mm40;

    .line 361
    .line 362
    .line 363
    move-result-object v0

    .line 364
    invoke-virtual {v8, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    and-int/lit8 v1, v1, 0x70

    .line 369
    .line 370
    if-ne v1, v7, :cond_12

    .line 371
    .line 372
    move v13, v14

    .line 373
    :cond_12
    or-int v1, v6, v13

    .line 374
    .line 375
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    invoke-virtual {v8, v6}, La/fet;->e(I)Z

    .line 380
    .line 381
    .line 382
    move-result v6

    .line 383
    or-int/2addr v1, v6

    .line 384
    invoke-virtual {v8, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v6

    .line 388
    or-int/2addr v1, v6

    .line 389
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 390
    .line 391
    .line 392
    move-result-object v6

    .line 393
    if-nez v1, :cond_13

    .line 394
    .line 395
    if-ne v6, v4, :cond_14

    .line 396
    .line 397
    :cond_13
    new-instance v1, La/ec3;

    .line 398
    .line 399
    const/4 v6, 0x6

    .line 400
    move-object v4, v12

    .line 401
    invoke-direct/range {v1 .. v6}, La/ec3;-><init>(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;B)V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 405
    .line 406
    .line 407
    move-object v6, v1

    .line 408
    :cond_14
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 409
    .line 410
    invoke-static {v0, v6}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    invoke-interface {v11, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    check-cast v1, La/ghm;

    .line 419
    .line 420
    invoke-static {v0, v1, v10, v8}, La/bfb;->q(La/mm40;La/ghm;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 421
    .line 422
    .line 423
    goto :goto_9

    .line 424
    :cond_15
    invoke-virtual {v8}, La/fet;->X()V

    .line 425
    .line 426
    .line 427
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_1
    check-cast v0, La/pz40;

    .line 431
    .line 432
    move-object/from16 v16, v12

    .line 433
    .line 434
    check-cast v16, Landroidx/fragment/app/Fragment;

    .line 435
    .line 436
    move-object/from16 v17, v11

    .line 437
    .line 438
    check-cast v17, Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;

    .line 439
    .line 440
    check-cast v10, La/x3m;

    .line 441
    .line 442
    check-cast v9, La/jtv;

    .line 443
    .line 444
    move-object/from16 v1, p1

    .line 445
    .line 446
    check-cast v1, La/ir8;

    .line 447
    .line 448
    move-object/from16 v11, p2

    .line 449
    .line 450
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 451
    .line 452
    move-object/from16 v12, p3

    .line 453
    .line 454
    check-cast v12, La/fet;

    .line 455
    .line 456
    move-object/from16 v15, p4

    .line 457
    .line 458
    check-cast v15, Ljava/lang/Integer;

    .line 459
    .line 460
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 461
    .line 462
    .line 463
    move-result v15

    .line 464
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    and-int/lit8 v1, v15, 0x30

    .line 471
    .line 472
    if-nez v1, :cond_17

    .line 473
    .line 474
    invoke-virtual {v12, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 475
    .line 476
    .line 477
    move-result v1

    .line 478
    if-eqz v1, :cond_16

    .line 479
    .line 480
    move v6, v7

    .line 481
    :cond_16
    or-int/2addr v15, v6

    .line 482
    :cond_17
    move v1, v15

    .line 483
    and-int/lit16 v6, v1, 0x91

    .line 484
    .line 485
    if-eq v6, v5, :cond_18

    .line 486
    .line 487
    move v5, v14

    .line 488
    goto :goto_a

    .line 489
    :cond_18
    move v5, v13

    .line 490
    :goto_a
    and-int/lit8 v6, v1, 0x1

    .line 491
    .line 492
    invoke-virtual {v12, v6, v5}, La/fet;->U(IZ)Z

    .line 493
    .line 494
    .line 495
    move-result v5

    .line 496
    if-eqz v5, :cond_36

    .line 497
    .line 498
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v0

    .line 502
    check-cast v0, La/h3g;

    .line 503
    .line 504
    iget-object v0, v0, La/h3g;->b:La/w2g;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 507
    .line 508
    .line 509
    move-result v0

    .line 510
    if-eqz v0, :cond_35

    .line 511
    .line 512
    if-eq v0, v14, :cond_1b

    .line 513
    .line 514
    if-ne v0, v3, :cond_1a

    .line 515
    .line 516
    const v0, 0x2295e27d

    .line 517
    .line 518
    .line 519
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 520
    .line 521
    .line 522
    sget-object v15, La/o7k0;->c:La/n0q;

    .line 523
    .line 524
    invoke-virtual {v10}, La/x3m;->c()La/y3m;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    sget-object v2, La/y3m;->a:La/y3m;

    .line 529
    .line 530
    if-eq v0, v2, :cond_19

    .line 531
    .line 532
    move/from16 v20, v14

    .line 533
    .line 534
    goto :goto_b

    .line 535
    :cond_19
    move/from16 v20, v13

    .line 536
    .line 537
    :goto_b
    shl-int/lit8 v0, v1, 0xf

    .line 538
    .line 539
    const/high16 v1, 0x380000

    .line 540
    .line 541
    and-int/2addr v0, v1

    .line 542
    or-int/lit16 v0, v0, 0x6c06

    .line 543
    .line 544
    const/16 v18, 0x1

    .line 545
    .line 546
    const/16 v19, 0x0

    .line 547
    .line 548
    move/from16 v23, v0

    .line 549
    .line 550
    move-object/from16 v21, v11

    .line 551
    .line 552
    move-object/from16 v22, v12

    .line 553
    .line 554
    invoke-static/range {v15 .. v23}, La/jtv;->f0(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;ZLjava/lang/String;ZLkotlin/jvm/functions/Function0;La/fet;I)V

    .line 555
    .line 556
    .line 557
    move-object/from16 v0, v22

    .line 558
    .line 559
    invoke-virtual {v0, v13}, La/fet;->r(Z)V

    .line 560
    .line 561
    .line 562
    goto/16 :goto_14

    .line 563
    .line 564
    :cond_1a
    move-object v0, v12

    .line 565
    const v1, 0x6435e633

    .line 566
    .line 567
    .line 568
    invoke-static {v1, v0, v13}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 569
    .line 570
    .line 571
    move-result-object v0

    .line 572
    throw v0

    .line 573
    :cond_1b
    move-object/from16 v20, v11

    .line 574
    .line 575
    move-object v0, v12

    .line 576
    const v3, 0x6435f94d

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0, v3}, La/fet;->e0(I)V

    .line 580
    .line 581
    .line 582
    new-instance v15, La/x2g;

    .line 583
    .line 584
    move-object/from16 v18, v16

    .line 585
    .line 586
    move-object/from16 v19, v17

    .line 587
    .line 588
    move-object/from16 v17, v9

    .line 589
    .line 590
    move-object/from16 v16, v10

    .line 591
    .line 592
    invoke-direct/range {v15 .. v20}, La/x2g;-><init>(La/x3m;La/jtv;Landroidx/fragment/app/Fragment;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;Lkotlin/jvm/functions/Function0;)V

    .line 593
    .line 594
    .line 595
    move-object/from16 v16, v18

    .line 596
    .line 597
    move-object/from16 v17, v19

    .line 598
    .line 599
    move-object/from16 v3, v20

    .line 600
    .line 601
    const v5, 0x77b53e3f

    .line 602
    .line 603
    .line 604
    invoke-static {v5, v15, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    shl-int/2addr v1, v2

    .line 609
    and-int/lit16 v1, v1, 0x380

    .line 610
    .line 611
    or-int/lit16 v1, v1, 0xc00

    .line 612
    .line 613
    const v2, 0x7456db29

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v2}, La/fet;->e0(I)V

    .line 617
    .line 618
    .line 619
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v2

    .line 623
    if-ne v2, v4, :cond_22

    .line 624
    .line 625
    invoke-static/range {v16 .. v16}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 626
    .line 627
    .line 628
    move-result-object v2

    .line 629
    instance-of v6, v2, La/af3;

    .line 630
    .line 631
    if-eqz v6, :cond_1c

    .line 632
    .line 633
    check-cast v2, La/af3;

    .line 634
    .line 635
    goto :goto_c

    .line 636
    :cond_1c
    const/4 v2, 0x0

    .line 637
    :goto_c
    const-class v6, La/p6h;

    .line 638
    .line 639
    if-eqz v2, :cond_21

    .line 640
    .line 641
    invoke-interface {v2}, La/af3;->d()La/wcf0;

    .line 642
    .line 643
    .line 644
    move-result-object v2

    .line 645
    invoke-virtual {v2, v6}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v2

    .line 649
    check-cast v2, La/o5d0;

    .line 650
    .line 651
    if-eqz v2, :cond_1d

    .line 652
    .line 653
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v2

    .line 657
    check-cast v2, La/ze3;

    .line 658
    .line 659
    goto :goto_d

    .line 660
    :cond_1d
    const/4 v2, 0x0

    .line 661
    :goto_d
    instance-of v7, v2, La/p6h;

    .line 662
    .line 663
    if-nez v7, :cond_1e

    .line 664
    .line 665
    const/4 v2, 0x0

    .line 666
    :cond_1e
    check-cast v2, La/p6h;

    .line 667
    .line 668
    if-eqz v2, :cond_21

    .line 669
    .line 670
    move-object/from16 v6, v16

    .line 671
    .line 672
    :goto_e
    if-eqz v6, :cond_20

    .line 673
    .line 674
    instance-of v7, v6, La/drs;

    .line 675
    .line 676
    if-eqz v7, :cond_1f

    .line 677
    .line 678
    check-cast v6, La/drs;

    .line 679
    .line 680
    invoke-static/range {v16 .. v16}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 681
    .line 682
    .line 683
    move-result-object v7

    .line 684
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    iget-object v7, v2, La/p6h;->a:La/cad;

    .line 688
    .line 689
    invoke-interface {v6}, La/drs;->q()La/xhi;

    .line 690
    .line 691
    .line 692
    move-result-object v19

    .line 693
    iget-object v6, v2, La/p6h;->b:La/sue;

    .line 694
    .line 695
    iget-object v9, v2, La/p6h;->c:La/onv;

    .line 696
    .line 697
    iget-object v10, v2, La/p6h;->d:La/rmd0;

    .line 698
    .line 699
    iget-object v11, v2, La/p6h;->e:La/onv;

    .line 700
    .line 701
    iget-object v12, v2, La/p6h;->f:La/pru;

    .line 702
    .line 703
    iget-object v15, v2, La/p6h;->g:La/r9u;

    .line 704
    .line 705
    iget-object v14, v2, La/p6h;->h:La/ctf0;

    .line 706
    .line 707
    iget-object v13, v2, La/p6h;->i:La/wsz;

    .line 708
    .line 709
    iget-object v8, v2, La/p6h;->j:La/ii;

    .line 710
    .line 711
    move-object/from16 p1, v3

    .line 712
    .line 713
    iget-object v3, v2, La/p6h;->k:La/ouu;

    .line 714
    .line 715
    move-object/from16 v30, v3

    .line 716
    .line 717
    iget-object v3, v2, La/p6h;->l:La/v88;

    .line 718
    .line 719
    move-object/from16 v31, v3

    .line 720
    .line 721
    iget-object v3, v2, La/p6h;->m:La/wdk0;

    .line 722
    .line 723
    iget-object v2, v2, La/p6h;->n:La/lgn0;

    .line 724
    .line 725
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 726
    .line 727
    .line 728
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    move-object/from16 v26, v17

    .line 744
    .line 745
    new-instance v17, La/tei;

    .line 746
    .line 747
    move-object/from16 v33, v2

    .line 748
    .line 749
    move-object/from16 v32, v3

    .line 750
    .line 751
    move-object/from16 v20, v6

    .line 752
    .line 753
    move-object/from16 v18, v7

    .line 754
    .line 755
    move-object/from16 v29, v8

    .line 756
    .line 757
    move-object/from16 v21, v9

    .line 758
    .line 759
    move-object/from16 v22, v10

    .line 760
    .line 761
    move-object/from16 v23, v11

    .line 762
    .line 763
    move-object/from16 v24, v12

    .line 764
    .line 765
    move-object/from16 v28, v13

    .line 766
    .line 767
    move-object/from16 v27, v14

    .line 768
    .line 769
    move-object/from16 v25, v15

    .line 770
    .line 771
    invoke-direct/range {v17 .. v33}, La/tei;-><init>(La/cad;La/xhi;La/sue;La/onv;La/rmd0;La/onv;La/pru;La/r9u;Lorg/xplatform/cyber/game/core/game_screen/presentation/bottomsheet/CyberBottomSheetParams;La/ctf0;La/wsz;La/ii;La/ouu;La/v88;La/wdk0;La/lgn0;)V

    .line 772
    .line 773
    .line 774
    move-object/from16 v2, v17

    .line 775
    .line 776
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    goto :goto_10

    .line 780
    :cond_1f
    move-object/from16 p1, v3

    .line 781
    .line 782
    iget-object v6, v6, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 783
    .line 784
    const/4 v13, 0x0

    .line 785
    const/4 v14, 0x1

    .line 786
    goto :goto_e

    .line 787
    :cond_20
    const-string v0, "Can\'t find feature provider!"

    .line 788
    .line 789
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 790
    .line 791
    .line 792
    :goto_f
    const/4 v8, 0x0

    .line 793
    goto/16 :goto_15

    .line 794
    .line 795
    :cond_21
    const-string v0, "Cannot create dependency "

    .line 796
    .line 797
    invoke-static {v6, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    goto :goto_f

    .line 805
    :cond_22
    move-object/from16 p1, v3

    .line 806
    .line 807
    :goto_10
    check-cast v2, La/tei;

    .line 808
    .line 809
    new-instance v3, La/q0h0;

    .line 810
    .line 811
    iget-object v6, v2, La/tei;->q:La/n5d0;

    .line 812
    .line 813
    invoke-interface {v6}, La/o5d0;->get()Ljava/lang/Object;

    .line 814
    .line 815
    .line 816
    move-result-object v6

    .line 817
    check-cast v6, La/sei;

    .line 818
    .line 819
    invoke-direct {v3, v6}, La/q0h0;-><init>(La/p0h0;)V

    .line 820
    .line 821
    .line 822
    const-class v6, La/a8h;

    .line 823
    .line 824
    sget-object v7, La/sre0;->a:La/tre0;

    .line 825
    .line 826
    invoke-virtual {v7, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 827
    .line 828
    .line 829
    move-result-object v6

    .line 830
    sget v7, La/a8h;->O:I

    .line 831
    .line 832
    const/16 v7, 0xe

    .line 833
    .line 834
    const/4 v8, 0x0

    .line 835
    invoke-static {v6, v8, v3, v0, v7}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 836
    .line 837
    .line 838
    move-result-object v3

    .line 839
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 840
    .line 841
    .line 842
    move-result-object v6

    .line 843
    if-ne v6, v4, :cond_23

    .line 844
    .line 845
    new-instance v15, La/z6h;

    .line 846
    .line 847
    iget-object v6, v2, La/tei;->i:La/onv;

    .line 848
    .line 849
    iget-object v6, v6, La/onv;->a:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v6, La/ali;

    .line 852
    .line 853
    invoke-virtual {v6}, La/ali;->z()La/e720;

    .line 854
    .line 855
    .line 856
    move-result-object v17

    .line 857
    iget-object v6, v2, La/tei;->j:La/sue;

    .line 858
    .line 859
    invoke-interface {v6}, La/sue;->w()La/vq;

    .line 860
    .line 861
    .line 862
    move-result-object v18

    .line 863
    invoke-static/range {v18 .. v18}, La/x1x;->x(Ljava/lang/Object;)V

    .line 864
    .line 865
    .line 866
    iget-object v6, v2, La/tei;->k:La/wsz;

    .line 867
    .line 868
    iget-object v7, v2, La/tei;->l:La/ii;

    .line 869
    .line 870
    iget-object v8, v2, La/tei;->m:La/ouu;

    .line 871
    .line 872
    iget-object v9, v2, La/tei;->n:La/v88;

    .line 873
    .line 874
    iget-object v10, v2, La/tei;->o:La/wdk0;

    .line 875
    .line 876
    iget-object v2, v2, La/tei;->p:La/lgn0;

    .line 877
    .line 878
    move-object/from16 v24, v2

    .line 879
    .line 880
    move-object/from16 v19, v6

    .line 881
    .line 882
    move-object/from16 v20, v7

    .line 883
    .line 884
    move-object/from16 v21, v8

    .line 885
    .line 886
    move-object/from16 v22, v9

    .line 887
    .line 888
    move-object/from16 v23, v10

    .line 889
    .line 890
    invoke-direct/range {v15 .. v24}, La/z6h;-><init>(Landroidx/fragment/app/Fragment;La/e720;La/vq;La/wsz;La/ii;La/ouu;La/v88;La/wdk0;La/lgn0;)V

    .line 891
    .line 892
    .line 893
    move-object/from16 v12, v16

    .line 894
    .line 895
    invoke-virtual {v0, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 896
    .line 897
    .line 898
    move-object v6, v15

    .line 899
    goto :goto_11

    .line 900
    :cond_23
    move-object/from16 v12, v16

    .line 901
    .line 902
    :goto_11
    check-cast v6, La/z6h;

    .line 903
    .line 904
    invoke-virtual {v0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v2

    .line 908
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    move-result v7

    .line 912
    or-int/2addr v2, v7

    .line 913
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 914
    .line 915
    .line 916
    move-result-object v7

    .line 917
    if-nez v2, :cond_24

    .line 918
    .line 919
    if-ne v7, v4, :cond_25

    .line 920
    .line 921
    :cond_24
    new-instance v7, La/w6h;

    .line 922
    .line 923
    const/4 v2, 0x0

    .line 924
    invoke-direct {v7, v6, v3, v2}, La/w6h;-><init>(La/z6h;La/k3t0;B)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    :cond_25
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 931
    .line 932
    invoke-static {v6, v7, v0}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 933
    .line 934
    .line 935
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 936
    .line 937
    .line 938
    move-result-object v2

    .line 939
    if-ne v2, v4, :cond_26

    .line 940
    .line 941
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 942
    .line 943
    invoke-static {v2, v0}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 944
    .line 945
    .line 946
    move-result-object v2

    .line 947
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    :cond_26
    check-cast v2, La/vne;

    .line 951
    .line 952
    invoke-virtual {v0, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 953
    .line 954
    .line 955
    move-result v7

    .line 956
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result v8

    .line 960
    or-int/2addr v7, v8

    .line 961
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v8

    .line 965
    if-nez v7, :cond_27

    .line 966
    .line 967
    if-ne v8, v4, :cond_28

    .line 968
    .line 969
    :cond_27
    new-instance v8, La/w6h;

    .line 970
    .line 971
    const/4 v7, 0x1

    .line 972
    invoke-direct {v8, v6, v3, v7}, La/w6h;-><init>(La/z6h;La/k3t0;B)V

    .line 973
    .line 974
    .line 975
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    :cond_28
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 979
    .line 980
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 983
    .line 984
    .line 985
    move-result v9

    .line 986
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 987
    .line 988
    .line 989
    move-result v10

    .line 990
    or-int/2addr v9, v10

    .line 991
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 992
    .line 993
    .line 994
    move-result v10

    .line 995
    or-int/2addr v9, v10

    .line 996
    const/4 v10, 0x0

    .line 997
    invoke-virtual {v0, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v10

    .line 1001
    or-int/2addr v9, v10

    .line 1002
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v10

    .line 1006
    if-nez v9, :cond_29

    .line 1007
    .line 1008
    if-ne v10, v4, :cond_2a

    .line 1009
    .line 1010
    :cond_29
    new-instance v10, La/et;

    .line 1011
    .line 1012
    const/16 v9, 0x16

    .line 1013
    .line 1014
    invoke-direct {v10, v2, v3, v8, v9}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1018
    .line 1019
    .line 1020
    :cond_2a
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 1021
    .line 1022
    invoke-static {v7, v10, v0}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 1023
    .line 1024
    .line 1025
    move-object v15, v3

    .line 1026
    check-cast v15, La/i3t0;

    .line 1027
    .line 1028
    invoke-virtual {v15, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1029
    .line 1030
    .line 1031
    move-result-object v2

    .line 1032
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1033
    .line 1034
    .line 1035
    move-result v3

    .line 1036
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v7

    .line 1040
    if-nez v3, :cond_2b

    .line 1041
    .line 1042
    if-ne v7, v4, :cond_2c

    .line 1043
    .line 1044
    :cond_2b
    new-instance v7, La/ui6;

    .line 1045
    .line 1046
    const/4 v3, 0x4

    .line 1047
    invoke-direct {v7, v15, v3}, La/ui6;-><init>(La/i3t0;B)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1051
    .line 1052
    .line 1053
    :cond_2c
    move-object/from16 v18, v7

    .line 1054
    .line 1055
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 1056
    .line 1057
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    move-result v3

    .line 1061
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v7

    .line 1065
    if-nez v3, :cond_2d

    .line 1066
    .line 1067
    if-ne v7, v4, :cond_2e

    .line 1068
    .line 1069
    :cond_2d
    new-instance v7, La/ui6;

    .line 1070
    .line 1071
    const/4 v3, 0x5

    .line 1072
    invoke-direct {v7, v15, v3}, La/ui6;-><init>(La/i3t0;B)V

    .line 1073
    .line 1074
    .line 1075
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1076
    .line 1077
    .line 1078
    :cond_2e
    move-object/from16 v19, v7

    .line 1079
    .line 1080
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 1081
    .line 1082
    const/16 v22, 0x0

    .line 1083
    .line 1084
    const/16 v23, 0x4

    .line 1085
    .line 1086
    const/16 v20, 0x0

    .line 1087
    .line 1088
    move-object/from16 v21, v0

    .line 1089
    .line 1090
    invoke-static/range {v18 .. v23}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1091
    .line 1092
    .line 1093
    sget-object v3, La/or00;->a:La/zfn;

    .line 1094
    .line 1095
    invoke-virtual {v0, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v3

    .line 1099
    check-cast v3, La/clz;

    .line 1100
    .line 1101
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1102
    .line 1103
    .line 1104
    move-result v7

    .line 1105
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    move-result-object v8

    .line 1109
    if-nez v7, :cond_2f

    .line 1110
    .line 1111
    if-ne v8, v4, :cond_30

    .line 1112
    .line 1113
    :cond_2f
    new-instance v8, La/eka;

    .line 1114
    .line 1115
    const/16 v7, 0x1c

    .line 1116
    .line 1117
    invoke-direct {v8, v2, v7}, La/eka;-><init>(La/l7m0;B)V

    .line 1118
    .line 1119
    .line 1120
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    :cond_30
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1124
    .line 1125
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1126
    .line 1127
    .line 1128
    move-result v7

    .line 1129
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v9

    .line 1133
    if-nez v7, :cond_31

    .line 1134
    .line 1135
    if-ne v9, v4, :cond_32

    .line 1136
    .line 1137
    :cond_31
    new-instance v13, La/y6h;

    .line 1138
    .line 1139
    const/16 v19, 0x0

    .line 1140
    .line 1141
    const/16 v20, 0x0

    .line 1142
    .line 1143
    const/4 v14, 0x1

    .line 1144
    const-class v16, La/k3t0;

    .line 1145
    .line 1146
    const-string v17, "onAction"

    .line 1147
    .line 1148
    const-string v18, "onAction(Ljava/lang/Object;)V"

    .line 1149
    .line 1150
    invoke-direct/range {v13 .. v20}, La/y6h;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v0, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1154
    .line 1155
    .line 1156
    move-object v9, v13

    .line 1157
    :cond_32
    check-cast v9, La/jhy;

    .line 1158
    .line 1159
    move-object/from16 v21, v9

    .line 1160
    .line 1161
    check-cast v21, Lkotlin/jvm/functions/Function1;

    .line 1162
    .line 1163
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1164
    .line 1165
    .line 1166
    move-result v7

    .line 1167
    invoke-virtual {v0, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1168
    .line 1169
    .line 1170
    move-result v9

    .line 1171
    or-int/2addr v7, v9

    .line 1172
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1173
    .line 1174
    .line 1175
    move-result v9

    .line 1176
    or-int/2addr v7, v9

    .line 1177
    invoke-virtual {v0, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v9

    .line 1181
    or-int/2addr v7, v9

    .line 1182
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v9

    .line 1186
    if-nez v7, :cond_33

    .line 1187
    .line 1188
    if-ne v9, v4, :cond_34

    .line 1189
    .line 1190
    :cond_33
    move-object/from16 v19, v15

    .line 1191
    .line 1192
    goto :goto_12

    .line 1193
    :cond_34
    move-object v3, v15

    .line 1194
    goto :goto_13

    .line 1195
    :goto_12
    new-instance v15, La/mr0;

    .line 1196
    .line 1197
    const/16 v20, 0x8

    .line 1198
    .line 1199
    move-object/from16 v16, v2

    .line 1200
    .line 1201
    move-object/from16 v18, v3

    .line 1202
    .line 1203
    move-object/from16 v17, v12

    .line 1204
    .line 1205
    invoke-direct/range {v15 .. v20}, La/mr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1206
    .line 1207
    .line 1208
    move-object/from16 v3, v19

    .line 1209
    .line 1210
    invoke-virtual {v0, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1211
    .line 1212
    .line 1213
    move-object v9, v15

    .line 1214
    :goto_13
    move-object/from16 v22, v9

    .line 1215
    .line 1216
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 1217
    .line 1218
    new-instance v2, La/qb;

    .line 1219
    .line 1220
    const/16 v4, 0x1a

    .line 1221
    .line 1222
    invoke-direct {v2, v6, v3, v5, v4}, La/qb;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1223
    .line 1224
    .line 1225
    const v3, 0x3c17f7ad

    .line 1226
    .line 1227
    .line 1228
    invoke-static {v3, v2, v0}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v23

    .line 1232
    const/high16 v2, 0x30000

    .line 1233
    .line 1234
    and-int/lit16 v1, v1, 0x380

    .line 1235
    .line 1236
    or-int v25, v1, v2

    .line 1237
    .line 1238
    const/16 v18, 0x0

    .line 1239
    .line 1240
    move-object/from16 v20, p1

    .line 1241
    .line 1242
    move-object/from16 v24, v0

    .line 1243
    .line 1244
    move-object/from16 v19, v8

    .line 1245
    .line 1246
    invoke-static/range {v18 .. v25}, La/ahy;->n(La/mm40;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/ugd;La/fet;I)V

    .line 1247
    .line 1248
    .line 1249
    const/4 v2, 0x0

    .line 1250
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 1254
    .line 1255
    .line 1256
    goto :goto_14

    .line 1257
    :cond_35
    move-object v0, v12

    .line 1258
    move v2, v13

    .line 1259
    const v1, 0x6435ece6

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 1263
    .line 1264
    .line 1265
    invoke-virtual {v0, v2}, La/fet;->r(Z)V

    .line 1266
    .line 1267
    .line 1268
    goto :goto_14

    .line 1269
    :cond_36
    move-object v0, v12

    .line 1270
    invoke-virtual {v0}, La/fet;->X()V

    .line 1271
    .line 1272
    .line 1273
    :goto_14
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1274
    .line 1275
    :goto_15
    return-object v8

    .line 1276
    :pswitch_2
    check-cast v0, La/y9j;

    .line 1277
    .line 1278
    move-object v13, v12

    .line 1279
    check-cast v13, La/nek;

    .line 1280
    .line 1281
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 1282
    .line 1283
    check-cast v9, La/xak;

    .line 1284
    .line 1285
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 1286
    .line 1287
    move-object/from16 v1, p1

    .line 1288
    .line 1289
    check-cast v1, La/rk80;

    .line 1290
    .line 1291
    move-object/from16 v3, p2

    .line 1292
    .line 1293
    check-cast v3, Ljava/lang/Integer;

    .line 1294
    .line 1295
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1296
    .line 1297
    .line 1298
    move-result v3

    .line 1299
    move-object/from16 v8, p3

    .line 1300
    .line 1301
    check-cast v8, La/fet;

    .line 1302
    .line 1303
    move-object/from16 v12, p4

    .line 1304
    .line 1305
    check-cast v12, Ljava/lang/Integer;

    .line 1306
    .line 1307
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 1308
    .line 1309
    .line 1310
    move-result v12

    .line 1311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1312
    .line 1313
    .line 1314
    and-int/lit8 v1, v12, 0x30

    .line 1315
    .line 1316
    if-nez v1, :cond_38

    .line 1317
    .line 1318
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 1319
    .line 1320
    .line 1321
    move-result v1

    .line 1322
    if-eqz v1, :cond_37

    .line 1323
    .line 1324
    move v6, v7

    .line 1325
    :cond_37
    or-int/2addr v12, v6

    .line 1326
    :cond_38
    and-int/lit16 v1, v12, 0x91

    .line 1327
    .line 1328
    if-eq v1, v5, :cond_39

    .line 1329
    .line 1330
    const/4 v1, 0x1

    .line 1331
    :goto_16
    const/4 v7, 0x1

    .line 1332
    goto :goto_17

    .line 1333
    :cond_39
    const/4 v1, 0x0

    .line 1334
    goto :goto_16

    .line 1335
    :goto_17
    and-int/lit8 v5, v12, 0x1

    .line 1336
    .line 1337
    invoke-virtual {v8, v5, v1}, La/fet;->U(IZ)Z

    .line 1338
    .line 1339
    .line 1340
    move-result v1

    .line 1341
    if-eqz v1, :cond_47

    .line 1342
    .line 1343
    iget-object v1, v0, La/y9j;->c:La/a4x;

    .line 1344
    .line 1345
    iget-object v0, v0, La/y9j;->a:La/u9j;

    .line 1346
    .line 1347
    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v1

    .line 1351
    check-cast v1, La/x9j;

    .line 1352
    .line 1353
    if-eqz v1, :cond_46

    .line 1354
    .line 1355
    instance-of v3, v1, La/v9j;

    .line 1356
    .line 1357
    const/4 v5, 0x6

    .line 1358
    if-eqz v3, :cond_3f

    .line 1359
    .line 1360
    const v1, -0x1ad2ee45

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 1364
    .line 1365
    .line 1366
    sget-object v14, La/o7k0;->c:La/n0q;

    .line 1367
    .line 1368
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1369
    .line 1370
    .line 1371
    instance-of v1, v0, La/r9j;

    .line 1372
    .line 1373
    if-eqz v1, :cond_3a

    .line 1374
    .line 1375
    const v1, -0x19379ef

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v8, v1}, La/fet;->e0(I)V

    .line 1379
    .line 1380
    .line 1381
    check-cast v0, La/r9j;

    .line 1382
    .line 1383
    iget-object v15, v0, La/r9j;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 1384
    .line 1385
    new-instance v0, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 1386
    .line 1387
    sget-object v1, La/jxs;->a:[La/jxs;

    .line 1388
    .line 1389
    const/4 v4, -0x1

    .line 1390
    sget-object v5, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;->a:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;

    .line 1391
    .line 1392
    const-string v1, "16:9"

    .line 1393
    .line 1394
    const v2, 0x7f0700a5

    .line 1395
    .line 1396
    .line 1397
    const/4 v3, -0x1

    .line 1398
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;-><init>(Ljava/lang/String;IIILorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)V

    .line 1399
    .line 1400
    .line 1401
    const/16 v18, 0x46

    .line 1402
    .line 1403
    move-object/from16 v16, v0

    .line 1404
    .line 1405
    move-object/from16 v17, v8

    .line 1406
    .line 1407
    invoke-virtual/range {v13 .. v18}, La/nek;->e(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;La/fet;I)V

    .line 1408
    .line 1409
    .line 1410
    move-object/from16 v3, v17

    .line 1411
    .line 1412
    const/4 v2, 0x0

    .line 1413
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1414
    .line 1415
    .line 1416
    goto :goto_18

    .line 1417
    :cond_3a
    move-object v3, v8

    .line 1418
    instance-of v1, v0, La/s9j;

    .line 1419
    .line 1420
    if-eqz v1, :cond_3d

    .line 1421
    .line 1422
    const v1, -0x18a917f

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1426
    .line 1427
    .line 1428
    check-cast v0, La/s9j;

    .line 1429
    .line 1430
    iget-object v0, v0, La/s9j;->a:Ljava/lang/String;

    .line 1431
    .line 1432
    invoke-virtual {v3, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    move-result v1

    .line 1436
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v6

    .line 1440
    if-nez v1, :cond_3b

    .line 1441
    .line 1442
    if-ne v6, v4, :cond_3c

    .line 1443
    .line 1444
    :cond_3b
    new-instance v6, La/xks0;

    .line 1445
    .line 1446
    invoke-direct {v6, v11, v2}, La/xks0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v3, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1450
    .line 1451
    .line 1452
    :cond_3c
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 1453
    .line 1454
    invoke-static {v14, v0, v6, v3, v5}, La/hp4;->f(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1455
    .line 1456
    .line 1457
    const/4 v2, 0x0

    .line 1458
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1459
    .line 1460
    .line 1461
    goto :goto_18

    .line 1462
    :cond_3d
    const/4 v2, 0x0

    .line 1463
    instance-of v1, v0, La/t9j;

    .line 1464
    .line 1465
    if-eqz v1, :cond_3e

    .line 1466
    .line 1467
    const v1, -0x1870da6

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1471
    .line 1472
    .line 1473
    check-cast v0, La/t9j;

    .line 1474
    .line 1475
    iget-object v0, v0, La/t9j;->a:Ljava/lang/String;

    .line 1476
    .line 1477
    invoke-static {v5, v3, v14, v0}, La/kc5;->R(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 1478
    .line 1479
    .line 1480
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1481
    .line 1482
    .line 1483
    :goto_18
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1484
    .line 1485
    .line 1486
    goto/16 :goto_1c

    .line 1487
    .line 1488
    :cond_3e
    const v0, -0xd089c

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v0, v3, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    throw v0

    .line 1496
    :cond_3f
    move-object v3, v8

    .line 1497
    instance-of v1, v1, La/w9j;

    .line 1498
    .line 1499
    if-eqz v1, :cond_45

    .line 1500
    .line 1501
    const v1, -0x1acd36da

    .line 1502
    .line 1503
    .line 1504
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1505
    .line 1506
    .line 1507
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 1508
    .line 1509
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    instance-of v2, v0, La/r9j;

    .line 1513
    .line 1514
    if-eqz v2, :cond_40

    .line 1515
    .line 1516
    const v2, 0x4376d992

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 1520
    .line 1521
    .line 1522
    check-cast v0, La/r9j;

    .line 1523
    .line 1524
    iget-object v0, v0, La/r9j;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 1525
    .line 1526
    const/16 v2, 0x46

    .line 1527
    .line 1528
    invoke-virtual {v9, v1, v0, v3, v2}, La/xak;->o(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V

    .line 1529
    .line 1530
    .line 1531
    const/4 v2, 0x0

    .line 1532
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1533
    .line 1534
    .line 1535
    goto :goto_19

    .line 1536
    :cond_40
    instance-of v2, v0, La/s9j;

    .line 1537
    .line 1538
    if-eqz v2, :cond_43

    .line 1539
    .line 1540
    const v2, 0x4379b367

    .line 1541
    .line 1542
    .line 1543
    invoke-virtual {v3, v2}, La/fet;->e0(I)V

    .line 1544
    .line 1545
    .line 1546
    check-cast v0, La/s9j;

    .line 1547
    .line 1548
    iget-object v0, v0, La/s9j;->a:Ljava/lang/String;

    .line 1549
    .line 1550
    invoke-virtual {v3, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1551
    .line 1552
    .line 1553
    move-result v2

    .line 1554
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v6

    .line 1558
    if-nez v2, :cond_41

    .line 1559
    .line 1560
    if-ne v6, v4, :cond_42

    .line 1561
    .line 1562
    :cond_41
    new-instance v6, La/xks0;

    .line 1563
    .line 1564
    const/16 v2, 0x8

    .line 1565
    .line 1566
    invoke-direct {v6, v10, v2}, La/xks0;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 1567
    .line 1568
    .line 1569
    invoke-virtual {v3, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1570
    .line 1571
    .line 1572
    :cond_42
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 1573
    .line 1574
    invoke-static {v1, v0, v6, v3, v5}, La/hp4;->f(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1575
    .line 1576
    .line 1577
    const/4 v2, 0x0

    .line 1578
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1579
    .line 1580
    .line 1581
    goto :goto_19

    .line 1582
    :cond_43
    const/4 v2, 0x0

    .line 1583
    instance-of v4, v0, La/t9j;

    .line 1584
    .line 1585
    if-eqz v4, :cond_44

    .line 1586
    .line 1587
    const v4, 0x437cbf01

    .line 1588
    .line 1589
    .line 1590
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 1591
    .line 1592
    .line 1593
    check-cast v0, La/t9j;

    .line 1594
    .line 1595
    iget-object v0, v0, La/t9j;->a:Ljava/lang/String;

    .line 1596
    .line 1597
    invoke-static {v5, v3, v1, v0}, La/kc5;->R(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 1598
    .line 1599
    .line 1600
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1601
    .line 1602
    .line 1603
    :goto_19
    invoke-virtual {v3, v2}, La/fet;->r(Z)V

    .line 1604
    .line 1605
    .line 1606
    goto :goto_1c

    .line 1607
    :cond_44
    const v0, 0x4c7fafc0    # 6.702669E7f

    .line 1608
    .line 1609
    .line 1610
    invoke-static {v0, v3, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1611
    .line 1612
    .line 1613
    move-result-object v0

    .line 1614
    throw v0

    .line 1615
    :cond_45
    :goto_1a
    const/4 v2, 0x0

    .line 1616
    goto :goto_1b

    .line 1617
    :cond_46
    move-object v3, v8

    .line 1618
    goto :goto_1a

    .line 1619
    :goto_1b
    const v0, 0x6a7d48a7

    .line 1620
    .line 1621
    .line 1622
    invoke-static {v0, v3, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v0

    .line 1626
    throw v0

    .line 1627
    :cond_47
    move-object v3, v8

    .line 1628
    invoke-virtual {v3}, La/fet;->X()V

    .line 1629
    .line 1630
    .line 1631
    :goto_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1632
    .line 1633
    return-object v0

    .line 1634
    nop

    .line 1635
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
