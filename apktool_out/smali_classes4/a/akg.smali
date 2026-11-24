.class public final synthetic La/akg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/qdz;

.field public final synthetic d:La/xk80;

.field public final synthetic e:Lkotlin/jvm/functions/Function1;

.field public final synthetic f:F

.field public final synthetic g:Lkotlin/jvm/functions/Function1;

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/l7m0;La/qdz;La/xk80;Lkotlin/jvm/functions/Function1;FLa/rdo0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/akg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/akg;->b:La/l7m0;

    iput-object p2, p0, La/akg;->c:La/qdz;

    iput-object p3, p0, La/akg;->d:La/xk80;

    iput-object p4, p0, La/akg;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/akg;->f:F

    iput-object p6, p0, La/akg;->i:Ljava/lang/Object;

    iput-object p7, p0, La/akg;->g:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/akg;->h:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/l7m0;La/qdz;La/xk80;Lkotlin/jvm/functions/Function1;FLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput-byte v0, p0, La/akg;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/akg;->b:La/l7m0;

    iput-object p2, p0, La/akg;->c:La/qdz;

    iput-object p3, p0, La/akg;->d:La/xk80;

    iput-object p4, p0, La/akg;->e:Lkotlin/jvm/functions/Function1;

    iput p5, p0, La/akg;->f:F

    iput-object p6, p0, La/akg;->g:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, La/akg;->h:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, La/akg;->i:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/akg;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/16 v3, 0x90

    .line 8
    .line 9
    const/16 v4, 0x10

    .line 10
    .line 11
    const/16 v6, 0x20

    .line 12
    .line 13
    iget-object v7, v0, La/akg;->i:Ljava/lang/Object;

    .line 14
    .line 15
    iget-object v8, v0, La/akg;->b:La/l7m0;

    .line 16
    .line 17
    const/4 v9, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v17, v7

    .line 22
    .line 23
    check-cast v17, Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, La/rk80;

    .line 28
    .line 29
    move-object/from16 v7, p2

    .line 30
    .line 31
    check-cast v7, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    move-object/from16 v10, p3

    .line 38
    .line 39
    check-cast v10, La/fet;

    .line 40
    .line 41
    move-object/from16 v11, p4

    .line 42
    .line 43
    check-cast v11, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v11

    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    and-int/lit8 v1, v11, 0x30

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v10, v7}, La/fet;->e(I)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    move v4, v6

    .line 63
    :cond_0
    or-int/2addr v11, v4

    .line 64
    :cond_1
    and-int/lit16 v1, v11, 0x91

    .line 65
    .line 66
    if-eq v1, v3, :cond_2

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    goto :goto_0

    .line 70
    :cond_2
    move v1, v9

    .line 71
    :goto_0
    and-int/lit8 v3, v11, 0x1

    .line 72
    .line 73
    invoke-virtual {v10, v3, v1}, La/fet;->U(IZ)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-eqz v1, :cond_9

    .line 78
    .line 79
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    check-cast v1, La/kkw;

    .line 84
    .line 85
    iget-object v1, v1, La/kkw;->c:La/l7m0;

    .line 86
    .line 87
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    check-cast v1, La/gkw;

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    iget-object v1, v1, La/gkw;->b:La/a4x;

    .line 96
    .line 97
    if-eqz v1, :cond_8

    .line 98
    .line 99
    invoke-static {v7, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    check-cast v1, La/ekw;

    .line 104
    .line 105
    if-nez v1, :cond_3

    .line 106
    .line 107
    goto/16 :goto_5

    .line 108
    .line 109
    :cond_3
    invoke-static {v1, v10}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    new-instance v4, La/x2w;

    .line 118
    .line 119
    const/16 v12, 0xf

    .line 120
    .line 121
    invoke-direct {v4, v12}, La/x2w;-><init>(B)V

    .line 122
    .line 123
    .line 124
    iget-object v15, v0, La/akg;->c:La/qdz;

    .line 125
    .line 126
    invoke-virtual {v15, v3, v4, v10, v9}, La/qdz;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/fet;I)La/xcz;

    .line 127
    .line 128
    .line 129
    move-result-object v14

    .line 130
    iget-object v3, v0, La/akg;->d:La/xk80;

    .line 131
    .line 132
    invoke-virtual {v3}, La/xk80;->k()I

    .line 133
    .line 134
    .line 135
    move-result v4

    .line 136
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 137
    .line 138
    .line 139
    move-result-object v4

    .line 140
    invoke-virtual {v10, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    move-result v12

    .line 144
    iget v13, v0, La/akg;->f:F

    .line 145
    .line 146
    invoke-virtual {v10, v13}, La/fet;->d(F)Z

    .line 147
    .line 148
    .line 149
    move-result v16

    .line 150
    or-int v12, v12, v16

    .line 151
    .line 152
    invoke-virtual {v10, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 153
    .line 154
    .line 155
    move-result v16

    .line 156
    or-int v12, v12, v16

    .line 157
    .line 158
    and-int/lit8 v11, v11, 0x70

    .line 159
    .line 160
    if-ne v11, v6, :cond_4

    .line 161
    .line 162
    const/4 v6, 0x1

    .line 163
    goto :goto_1

    .line 164
    :cond_4
    move v6, v9

    .line 165
    :goto_1
    or-int/2addr v6, v12

    .line 166
    iget-object v11, v0, La/akg;->e:Lkotlin/jvm/functions/Function1;

    .line 167
    .line 168
    invoke-virtual {v10, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v12

    .line 172
    or-int/2addr v6, v12

    .line 173
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    if-nez v6, :cond_6

    .line 178
    .line 179
    if-ne v12, v2, :cond_5

    .line 180
    .line 181
    goto :goto_2

    .line 182
    :cond_5
    move-object/from16 v21, v3

    .line 183
    .line 184
    move v2, v7

    .line 185
    move-object v3, v11

    .line 186
    goto :goto_3

    .line 187
    :cond_6
    :goto_2
    new-instance v18, La/ekg;

    .line 188
    .line 189
    const/16 v24, 0x0

    .line 190
    .line 191
    const/16 v25, 0x1

    .line 192
    .line 193
    move-object/from16 v21, v3

    .line 194
    .line 195
    move/from16 v22, v7

    .line 196
    .line 197
    move-object/from16 v23, v11

    .line 198
    .line 199
    move/from16 v20, v13

    .line 200
    .line 201
    move-object/from16 v19, v14

    .line 202
    .line 203
    invoke-direct/range {v18 .. v25}, La/ekg;-><init>(La/xcz;FLa/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 204
    .line 205
    .line 206
    move-object/from16 v12, v18

    .line 207
    .line 208
    move/from16 v2, v22

    .line 209
    .line 210
    move-object/from16 v3, v23

    .line 211
    .line 212
    invoke-virtual {v10, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_3
    check-cast v12, Lkotlin/jvm/functions/Function2;

    .line 216
    .line 217
    invoke-static {v4, v3, v12, v10}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 218
    .line 219
    .line 220
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v3

    .line 224
    check-cast v3, La/kkw;

    .line 225
    .line 226
    iget-boolean v3, v3, La/kkw;->b:Z

    .line 227
    .line 228
    iget-object v4, v0, La/akg;->g:Lkotlin/jvm/functions/Function1;

    .line 229
    .line 230
    invoke-static {v3, v14, v4, v10, v9}, La/cfx0;->m(ZLa/xcz;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 231
    .line 232
    .line 233
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    check-cast v3, La/kkw;

    .line 238
    .line 239
    iget-object v3, v3, La/kkw;->a:La/g5h;

    .line 240
    .line 241
    invoke-virtual/range {v21 .. v21}, La/xk80;->k()I

    .line 242
    .line 243
    .line 244
    move-result v4

    .line 245
    if-ne v4, v2, :cond_7

    .line 246
    .line 247
    const/4 v12, 0x1

    .line 248
    goto :goto_4

    .line 249
    :cond_7
    move v12, v9

    .line 250
    :goto_4
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object v2

    .line 254
    check-cast v2, La/kkw;

    .line 255
    .line 256
    iget-boolean v13, v2, La/kkw;->b:Z

    .line 257
    .line 258
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    check-cast v2, La/kkw;

    .line 263
    .line 264
    iget-object v2, v2, La/kkw;->d:La/th90;

    .line 265
    .line 266
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    check-cast v1, La/ekw;

    .line 271
    .line 272
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 273
    .line 274
    invoke-static {v2, v1}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    move-object v11, v1

    .line 279
    check-cast v11, La/l7m0;

    .line 280
    .line 281
    const/16 v19, 0x0

    .line 282
    .line 283
    iget-object v0, v0, La/akg;->h:Lkotlin/jvm/functions/Function1;

    .line 284
    .line 285
    move-object/from16 v16, v0

    .line 286
    .line 287
    move-object/from16 v18, v10

    .line 288
    .line 289
    move-object v10, v3

    .line 290
    invoke-static/range {v10 .. v19}, La/cfx0;->q(La/g5h;La/l7m0;ZZLa/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 291
    .line 292
    .line 293
    goto :goto_6

    .line 294
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_9
    move-object/from16 v18, v10

    .line 298
    .line 299
    invoke-virtual/range {v18 .. v18}, La/fet;->X()V

    .line 300
    .line 301
    .line 302
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 303
    .line 304
    :goto_7
    return-object v0

    .line 305
    :pswitch_0
    check-cast v7, La/rdo0;

    .line 306
    .line 307
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, La/rk80;

    .line 310
    .line 311
    move-object/from16 v10, p2

    .line 312
    .line 313
    check-cast v10, Ljava/lang/Integer;

    .line 314
    .line 315
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 316
    .line 317
    .line 318
    move-result v15

    .line 319
    move-object/from16 v10, p3

    .line 320
    .line 321
    check-cast v10, La/fet;

    .line 322
    .line 323
    move-object/from16 v11, p4

    .line 324
    .line 325
    check-cast v11, Ljava/lang/Integer;

    .line 326
    .line 327
    invoke-virtual {v11}, Ljava/lang/Integer;->intValue()I

    .line 328
    .line 329
    .line 330
    move-result v11

    .line 331
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    and-int/lit8 v1, v11, 0x30

    .line 335
    .line 336
    if-nez v1, :cond_b

    .line 337
    .line 338
    invoke-virtual {v10, v15}, La/fet;->e(I)Z

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    if-eqz v1, :cond_a

    .line 343
    .line 344
    move v4, v6

    .line 345
    :cond_a
    or-int/2addr v11, v4

    .line 346
    :cond_b
    and-int/lit16 v1, v11, 0x91

    .line 347
    .line 348
    if-eq v1, v3, :cond_c

    .line 349
    .line 350
    const/4 v1, 0x1

    .line 351
    goto :goto_8

    .line 352
    :cond_c
    move v1, v9

    .line 353
    :goto_8
    and-int/lit8 v3, v11, 0x1

    .line 354
    .line 355
    invoke-virtual {v10, v3, v1}, La/fet;->U(IZ)Z

    .line 356
    .line 357
    .line 358
    move-result v1

    .line 359
    if-eqz v1, :cond_16

    .line 360
    .line 361
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v1

    .line 365
    check-cast v1, La/kkw;

    .line 366
    .line 367
    iget-object v1, v1, La/kkw;->c:La/l7m0;

    .line 368
    .line 369
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v1

    .line 373
    check-cast v1, La/gkw;

    .line 374
    .line 375
    if-eqz v1, :cond_15

    .line 376
    .line 377
    iget-object v1, v1, La/gkw;->b:La/a4x;

    .line 378
    .line 379
    if-eqz v1, :cond_15

    .line 380
    .line 381
    invoke-static {v15, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    check-cast v1, La/ekw;

    .line 386
    .line 387
    if-nez v1, :cond_d

    .line 388
    .line 389
    goto/16 :goto_e

    .line 390
    .line 391
    :cond_d
    invoke-static {v1, v10}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v15}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v3

    .line 399
    new-instance v4, La/jyf;

    .line 400
    .line 401
    const/16 v12, 0x16

    .line 402
    .line 403
    invoke-direct {v4, v12}, La/jyf;-><init>(B)V

    .line 404
    .line 405
    .line 406
    iget-object v12, v0, La/akg;->c:La/qdz;

    .line 407
    .line 408
    invoke-virtual {v12, v3, v4, v10, v9}, La/qdz;->b(Ljava/lang/String;Lkotlin/jvm/functions/Function2;La/fet;I)La/xcz;

    .line 409
    .line 410
    .line 411
    move-result-object v3

    .line 412
    iget-object v14, v0, La/akg;->d:La/xk80;

    .line 413
    .line 414
    invoke-virtual {v14}, La/xk80;->k()I

    .line 415
    .line 416
    .line 417
    move-result v4

    .line 418
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    invoke-virtual {v10, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    move-result v13

    .line 426
    move/from16 v16, v13

    .line 427
    .line 428
    iget v13, v0, La/akg;->f:F

    .line 429
    .line 430
    invoke-virtual {v10, v13}, La/fet;->d(F)Z

    .line 431
    .line 432
    .line 433
    move-result v17

    .line 434
    or-int v16, v16, v17

    .line 435
    .line 436
    invoke-virtual {v10, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v17

    .line 440
    or-int v16, v16, v17

    .line 441
    .line 442
    and-int/lit8 v11, v11, 0x70

    .line 443
    .line 444
    if-ne v11, v6, :cond_e

    .line 445
    .line 446
    const/4 v6, 0x1

    .line 447
    goto :goto_9

    .line 448
    :cond_e
    move v6, v9

    .line 449
    :goto_9
    or-int v6, v16, v6

    .line 450
    .line 451
    iget-object v11, v0, La/akg;->e:Lkotlin/jvm/functions/Function1;

    .line 452
    .line 453
    invoke-virtual {v10, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v16

    .line 457
    or-int v6, v6, v16

    .line 458
    .line 459
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    if-nez v6, :cond_f

    .line 464
    .line 465
    if-ne v5, v2, :cond_10

    .line 466
    .line 467
    :cond_f
    move-object/from16 v16, v11

    .line 468
    .line 469
    goto :goto_a

    .line 470
    :cond_10
    move-object/from16 v21, v12

    .line 471
    .line 472
    move-object v12, v3

    .line 473
    move-object v3, v11

    .line 474
    goto :goto_b

    .line 475
    :goto_a
    new-instance v11, La/ekg;

    .line 476
    .line 477
    const/16 v17, 0x0

    .line 478
    .line 479
    const/16 v18, 0x0

    .line 480
    .line 481
    move-object/from16 v21, v12

    .line 482
    .line 483
    move-object v12, v3

    .line 484
    invoke-direct/range {v11 .. v18}, La/ekg;-><init>(La/xcz;FLa/xk80;ILkotlin/jvm/functions/Function1;La/yje;B)V

    .line 485
    .line 486
    .line 487
    move-object/from16 v3, v16

    .line 488
    .line 489
    invoke-virtual {v10, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    move-object v5, v11

    .line 493
    :goto_b
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 494
    .line 495
    invoke-static {v4, v3, v5, v10}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 496
    .line 497
    .line 498
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v3

    .line 502
    check-cast v3, La/kkw;

    .line 503
    .line 504
    iget-boolean v3, v3, La/kkw;->b:Z

    .line 505
    .line 506
    if-eqz v3, :cond_13

    .line 507
    .line 508
    const v3, 0x75286da5

    .line 509
    .line 510
    .line 511
    invoke-virtual {v10, v3}, La/fet;->e0(I)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v10, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    invoke-virtual {v10, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v4

    .line 522
    or-int/2addr v3, v4

    .line 523
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 524
    .line 525
    .line 526
    move-result-object v4

    .line 527
    if-nez v3, :cond_11

    .line 528
    .line 529
    if-ne v4, v2, :cond_12

    .line 530
    .line 531
    :cond_11
    new-instance v4, La/fkg;

    .line 532
    .line 533
    const/4 v2, 0x0

    .line 534
    invoke-direct {v4, v12, v7, v2, v9}, La/fkg;-><init>(La/xcz;La/rdo0;La/yje;B)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 538
    .line 539
    .line 540
    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function2;

    .line 541
    .line 542
    invoke-static {v4, v10, v9}, La/pvm0;->e(Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 543
    .line 544
    .line 545
    invoke-virtual {v10, v9}, La/fet;->r(Z)V

    .line 546
    .line 547
    .line 548
    goto :goto_c

    .line 549
    :cond_13
    const v2, 0x752dd6d6

    .line 550
    .line 551
    .line 552
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v10, v9}, La/fet;->r(Z)V

    .line 556
    .line 557
    .line 558
    :goto_c
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v2

    .line 562
    check-cast v2, La/kkw;

    .line 563
    .line 564
    iget-object v2, v2, La/kkw;->a:La/g5h;

    .line 565
    .line 566
    invoke-virtual {v14}, La/xk80;->k()I

    .line 567
    .line 568
    .line 569
    move-result v3

    .line 570
    if-ne v3, v15, :cond_14

    .line 571
    .line 572
    const/16 v18, 0x1

    .line 573
    .line 574
    goto :goto_d

    .line 575
    :cond_14
    move/from16 v18, v9

    .line 576
    .line 577
    :goto_d
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    check-cast v3, La/kkw;

    .line 582
    .line 583
    iget-boolean v3, v3, La/kkw;->b:Z

    .line 584
    .line 585
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    check-cast v4, La/kkw;

    .line 590
    .line 591
    iget-object v4, v4, La/kkw;->d:La/th90;

    .line 592
    .line 593
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v1

    .line 597
    check-cast v1, La/ekw;

    .line 598
    .line 599
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 600
    .line 601
    invoke-static {v4, v1}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v1

    .line 605
    move-object/from16 v17, v1

    .line 606
    .line 607
    check-cast v17, La/l7m0;

    .line 608
    .line 609
    const/16 v25, 0x0

    .line 610
    .line 611
    iget-object v1, v0, La/akg;->g:Lkotlin/jvm/functions/Function1;

    .line 612
    .line 613
    iget-object v0, v0, La/akg;->h:Lkotlin/jvm/functions/Function1;

    .line 614
    .line 615
    move-object/from16 v23, v0

    .line 616
    .line 617
    move-object/from16 v22, v1

    .line 618
    .line 619
    move-object/from16 v16, v2

    .line 620
    .line 621
    move/from16 v19, v3

    .line 622
    .line 623
    move-object/from16 v24, v10

    .line 624
    .line 625
    move-object/from16 v20, v12

    .line 626
    .line 627
    invoke-static/range {v16 .. v25}, La/ntr;->K(La/g5h;La/l7m0;ZZLa/xcz;La/qdz;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 628
    .line 629
    .line 630
    goto :goto_f

    .line 631
    :cond_15
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_16
    move-object/from16 v24, v10

    .line 635
    .line 636
    invoke-virtual/range {v24 .. v24}, La/fet;->X()V

    .line 637
    .line 638
    .line 639
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 640
    .line 641
    :goto_10
    return-object v0

    .line 642
    nop

    .line 643
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
