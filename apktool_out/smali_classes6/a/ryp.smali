.class public final synthetic La/ryp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/syp;


# direct methods
.method public synthetic constructor <init>(La/syp;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ryp;->a:B

    iput-object p1, p0, La/ryp;->b:La/syp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ryp;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const v3, 0x7f1300cc

    .line 8
    .line 9
    .line 10
    const/16 v5, 0x7f

    .line 11
    .line 12
    const/4 v6, 0x3

    .line 13
    iget-object v0, v0, La/ryp;->b:La/syp;

    .line 14
    .line 15
    const/4 v8, 0x2

    .line 16
    const/4 v9, 0x1

    .line 17
    const/4 v10, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/mxp;

    .line 24
    .line 25
    iget-object v0, v0, La/syp;->i:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/ctf0;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    if-eqz v1, :cond_9

    .line 33
    .line 34
    iget-object v2, v1, La/mxp;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-nez v4, :cond_0

    .line 41
    .line 42
    goto/16 :goto_6

    .line 43
    .line 44
    :cond_0
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-object v11, v1, La/mxp;->B:Ljava/lang/String;

    .line 49
    .line 50
    new-array v12, v10, [Ljava/lang/Object;

    .line 51
    .line 52
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 53
    .line 54
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v12

    .line 58
    const v13, 0x7f131402

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v12

    .line 65
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v13

    .line 69
    if-nez v13, :cond_1

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_1
    new-instance v13, La/b3m;

    .line 73
    .line 74
    invoke-direct {v13, v12, v11}, La/b3m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v4, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    :goto_0
    iget-object v11, v1, La/mxp;->n:Ljava/lang/String;

    .line 81
    .line 82
    new-array v12, v10, [Ljava/lang/Object;

    .line 83
    .line 84
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v12

    .line 88
    const v13, 0x7f130fe4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v13, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v12

    .line 95
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    if-nez v13, :cond_2

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_2
    new-instance v13, La/b3m;

    .line 103
    .line 104
    invoke-direct {v13, v12, v11}, La/b3m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v4, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    :goto_1
    iget-object v11, v1, La/mxp;->k:Ljava/lang/String;

    .line 111
    .line 112
    iget-object v12, v1, La/mxp;->l:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v13

    .line 118
    if-nez v13, :cond_3

    .line 119
    .line 120
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 121
    .line 122
    .line 123
    move-result v13

    .line 124
    if-nez v13, :cond_3

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v13

    .line 131
    if-nez v13, :cond_4

    .line 132
    .line 133
    move-object v11, v12

    .line 134
    goto :goto_2

    .line 135
    :cond_4
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 136
    .line 137
    .line 138
    move-result v13

    .line 139
    if-nez v13, :cond_5

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    const-string v13, ", "

    .line 143
    .line 144
    invoke-static {v11, v13, v12}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v11

    .line 148
    :goto_2
    new-instance v12, La/b3m;

    .line 149
    .line 150
    new-array v13, v10, [Ljava/lang/Object;

    .line 151
    .line 152
    invoke-static {v13, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v13

    .line 156
    const v14, 0x7f130f7d

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v13

    .line 163
    invoke-direct {v12, v13, v11}, La/b3m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v4, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    :goto_3
    iget v11, v1, La/mxp;->f:I

    .line 170
    .line 171
    new-array v12, v10, [Ljava/lang/Object;

    .line 172
    .line 173
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v12

    .line 177
    invoke-virtual {v0, v3, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    if-gtz v11, :cond_6

    .line 182
    .line 183
    goto :goto_4

    .line 184
    :cond_6
    new-instance v12, La/b3m;

    .line 185
    .line 186
    invoke-static {v11}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v11

    .line 190
    invoke-direct {v12, v3, v11}, La/b3m;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    invoke-virtual {v4, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 194
    .line 195
    .line 196
    :goto_4
    iget v3, v1, La/mxp;->i:F

    .line 197
    .line 198
    new-array v11, v10, [Ljava/lang/Object;

    .line 199
    .line 200
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    const v12, 0x7f1317e8

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-static {v4, v3, v11}, La/wwb;->A(La/lc00;FLjava/lang/String;)V

    .line 212
    .line 213
    .line 214
    iget v3, v1, La/mxp;->h:F

    .line 215
    .line 216
    new-array v11, v10, [Ljava/lang/Object;

    .line 217
    .line 218
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v11

    .line 222
    const v12, 0x7f1309ad

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-static {v4, v3, v11}, La/wwb;->A(La/lc00;FLjava/lang/String;)V

    .line 230
    .line 231
    .line 232
    iget v3, v1, La/mxp;->j:F

    .line 233
    .line 234
    new-array v11, v10, [Ljava/lang/Object;

    .line 235
    .line 236
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    const v12, 0x7f130159

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v11

    .line 247
    invoke-static {v4, v3, v11}, La/wwb;->A(La/lc00;FLjava/lang/String;)V

    .line 248
    .line 249
    .line 250
    iget v3, v1, La/mxp;->C:F

    .line 251
    .line 252
    new-array v11, v10, [Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v11

    .line 258
    const v12, 0x7f130ad5

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    invoke-static {v4, v3, v11}, La/wwb;->A(La/lc00;FLjava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-static {v4}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 269
    .line 270
    .line 271
    move-result-object v3

    .line 272
    invoke-virtual {v3}, La/e4;->b()I

    .line 273
    .line 274
    .line 275
    move-result v4

    .line 276
    if-ge v4, v8, :cond_7

    .line 277
    .line 278
    sget-object v0, La/iun;->a:La/iun;

    .line 279
    .line 280
    goto/16 :goto_7

    .line 281
    .line 282
    :cond_7
    new-instance v4, La/vvp;

    .line 283
    .line 284
    new-array v11, v10, [Ljava/lang/Object;

    .line 285
    .line 286
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    const v12, 0x7f1302a5

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 294
    .line 295
    .line 296
    move-result-object v14

    .line 297
    sget-object v11, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 298
    .line 299
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 300
    .line 301
    .line 302
    move-result-wide v11

    .line 303
    new-instance v15, La/njm;

    .line 304
    .line 305
    invoke-direct {v15, v5}, La/njm;-><init>(I)V

    .line 306
    .line 307
    .line 308
    new-instance v13, La/hjm;

    .line 309
    .line 310
    new-instance v5, La/y3d;

    .line 311
    .line 312
    invoke-direct {v5, v11, v12}, La/y3d;-><init>(J)V

    .line 313
    .line 314
    .line 315
    const/16 v25, 0x0

    .line 316
    .line 317
    const/16 v26, 0x1ff8

    .line 318
    .line 319
    const/16 v17, 0x0

    .line 320
    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    const/16 v20, 0x0

    .line 326
    .line 327
    const/16 v21, 0x0

    .line 328
    .line 329
    const/16 v22, 0x0

    .line 330
    .line 331
    const/16 v23, 0x0

    .line 332
    .line 333
    const/16 v24, 0x0

    .line 334
    .line 335
    move-object/from16 v16, v5

    .line 336
    .line 337
    invoke-direct/range {v13 .. v26}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 338
    .line 339
    .line 340
    const-string v5, "HEADER_BIOGRAPHY"

    .line 341
    .line 342
    invoke-direct {v4, v13, v5}, La/vvp;-><init>(La/hjm;Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    new-instance v5, La/mvp;

    .line 346
    .line 347
    new-instance v11, La/h3m;

    .line 348
    .line 349
    new-instance v12, La/g3m;

    .line 350
    .line 351
    new-instance v13, La/n0x;

    .line 352
    .line 353
    iget-object v14, v1, La/mxp;->o:Ljava/lang/String;

    .line 354
    .line 355
    invoke-direct {v13, v14}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    iget v14, v1, La/mxp;->p:I

    .line 359
    .line 360
    iget v15, v1, La/mxp;->r:I

    .line 361
    .line 362
    iget v1, v1, La/mxp;->q:I

    .line 363
    .line 364
    if-ltz v14, :cond_8

    .line 365
    .line 366
    if-ltz v1, :cond_8

    .line 367
    .line 368
    if-ltz v15, :cond_8

    .line 369
    .line 370
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 379
    .line 380
    .line 381
    move-result-object v14

    .line 382
    filled-new-array {v7, v1, v14}, [Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v1

    .line 386
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v1

    .line 390
    const v6, 0x7f131829

    .line 391
    .line 392
    .line 393
    invoke-virtual {v0, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object v7

    .line 397
    goto :goto_5

    .line 398
    :cond_8
    const/4 v7, 0x0

    .line 399
    :goto_5
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-direct {v12, v13, v2, v7, v0}, La/g3m;-><init>(La/n0x;Ljava/lang/String;Ljava/lang/String;La/a4x;)V

    .line 404
    .line 405
    .line 406
    invoke-direct {v11, v12}, La/h3m;-><init>(La/g3m;)V

    .line 407
    .line 408
    .line 409
    invoke-direct {v5, v11}, La/mvp;-><init>(La/h3m;)V

    .line 410
    .line 411
    .line 412
    new-array v0, v8, [La/p6t0;

    .line 413
    .line 414
    aput-object v4, v0, v10

    .line 415
    .line 416
    aput-object v5, v0, v9

    .line 417
    .line 418
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    goto :goto_7

    .line 423
    :cond_9
    :goto_6
    sget-object v0, La/iun;->a:La/iun;

    .line 424
    .line 425
    :goto_7
    return-object v0

    .line 426
    :pswitch_0
    move-object/from16 v1, p1

    .line 427
    .line 428
    check-cast v1, La/kxp;

    .line 429
    .line 430
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    iget-object v2, v1, La/kxp;->b:La/xwp;

    .line 434
    .line 435
    if-eqz v2, :cond_3b

    .line 436
    .line 437
    iget-object v2, v2, La/xwp;->a:Ljava/lang/Object;

    .line 438
    .line 439
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 440
    .line 441
    instance-of v3, v2, La/g0g0;

    .line 442
    .line 443
    if-eqz v3, :cond_a

    .line 444
    .line 445
    const/4 v2, 0x0

    .line 446
    :cond_a
    check-cast v2, La/mxp;

    .line 447
    .line 448
    if-eqz v2, :cond_3b

    .line 449
    .line 450
    iget v3, v2, La/mxp;->x:F

    .line 451
    .line 452
    iget v11, v2, La/mxp;->w:F

    .line 453
    .line 454
    iget v12, v2, La/mxp;->v:F

    .line 455
    .line 456
    iget v13, v2, La/mxp;->E:I

    .line 457
    .line 458
    iget v14, v2, La/mxp;->D:I

    .line 459
    .line 460
    iget v15, v2, La/mxp;->F:F

    .line 461
    .line 462
    iget v4, v2, La/mxp;->I:I

    .line 463
    .line 464
    iget v5, v2, La/mxp;->A:F

    .line 465
    .line 466
    iget v7, v2, La/mxp;->z:F

    .line 467
    .line 468
    iget v10, v2, La/mxp;->H:I

    .line 469
    .line 470
    iget v6, v2, La/mxp;->G:I

    .line 471
    .line 472
    iget v8, v2, La/mxp;->J:I

    .line 473
    .line 474
    iget v9, v2, La/mxp;->t:I

    .line 475
    .line 476
    move/from16 v22, v7

    .line 477
    .line 478
    iget v7, v2, La/mxp;->s:I

    .line 479
    .line 480
    move/from16 v24, v7

    .line 481
    .line 482
    move/from16 v23, v8

    .line 483
    .line 484
    iget-wide v7, v1, La/kxp;->c:J

    .line 485
    .line 486
    iget-object v0, v0, La/syp;->i:Ljava/lang/Object;

    .line 487
    .line 488
    check-cast v0, La/ctf0;

    .line 489
    .line 490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    sget-object v1, La/zxp;->d:La/c0o;

    .line 494
    .line 495
    move-object/from16 p1, v1

    .line 496
    .line 497
    new-instance v1, Ljava/util/ArrayList;

    .line 498
    .line 499
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 500
    .line 501
    .line 502
    invoke-virtual/range {p1 .. p1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 503
    .line 504
    .line 505
    move-result-object v25

    .line 506
    :goto_8
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->hasNext()Z

    .line 507
    .line 508
    .line 509
    move-result v26

    .line 510
    move-wide/from16 v27, v7

    .line 511
    .line 512
    if-eqz v26, :cond_15

    .line 513
    .line 514
    invoke-interface/range {v25 .. v25}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 515
    .line 516
    .line 517
    move-result-object v8

    .line 518
    move-object/from16 v26, v8

    .line 519
    .line 520
    check-cast v26, La/zxp;

    .line 521
    .line 522
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    const/16 p1, 0x0

    .line 526
    .line 527
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Enum;->ordinal()I

    .line 528
    .line 529
    .line 530
    move-result v7

    .line 531
    if-eqz v7, :cond_10

    .line 532
    .line 533
    move/from16 v26, v9

    .line 534
    .line 535
    const/4 v9, 0x1

    .line 536
    if-eq v7, v9, :cond_d

    .line 537
    .line 538
    const/4 v9, 0x2

    .line 539
    if-eq v7, v9, :cond_c

    .line 540
    .line 541
    const/4 v9, 0x3

    .line 542
    if-ne v7, v9, :cond_b

    .line 543
    .line 544
    invoke-static {v2}, La/vzb;->Z(La/mxp;)Z

    .line 545
    .line 546
    .line 547
    move-result v7

    .line 548
    if-nez v7, :cond_14

    .line 549
    .line 550
    if-gez v24, :cond_14

    .line 551
    .line 552
    if-gez v26, :cond_14

    .line 553
    .line 554
    if-ltz v23, :cond_13

    .line 555
    .line 556
    goto :goto_b

    .line 557
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 558
    .line 559
    .line 560
    :goto_9
    const/4 v7, 0x0

    .line 561
    goto/16 :goto_27

    .line 562
    .line 563
    :cond_c
    invoke-static {v2}, La/vzb;->b0(La/mxp;)Z

    .line 564
    .line 565
    .line 566
    move-result v7

    .line 567
    if-nez v7, :cond_14

    .line 568
    .line 569
    invoke-static {v2}, La/vzb;->a0(La/mxp;)Z

    .line 570
    .line 571
    .line 572
    move-result v7

    .line 573
    if-eqz v7, :cond_13

    .line 574
    .line 575
    goto :goto_b

    .line 576
    :cond_d
    iget v7, v2, La/mxp;->y:F

    .line 577
    .line 578
    cmpl-float v7, v7, p1

    .line 579
    .line 580
    if-ltz v7, :cond_e

    .line 581
    .line 582
    if-ltz v6, :cond_e

    .line 583
    .line 584
    if-ltz v10, :cond_e

    .line 585
    .line 586
    goto :goto_b

    .line 587
    :cond_e
    cmpl-float v7, v22, p1

    .line 588
    .line 589
    if-gez v7, :cond_14

    .line 590
    .line 591
    cmpl-float v7, v5, p1

    .line 592
    .line 593
    if-ltz v7, :cond_f

    .line 594
    .line 595
    goto :goto_b

    .line 596
    :cond_f
    if-gez v4, :cond_14

    .line 597
    .line 598
    cmpl-float v7, v15, p1

    .line 599
    .line 600
    if-ltz v7, :cond_13

    .line 601
    .line 602
    goto :goto_b

    .line 603
    :cond_10
    move/from16 v26, v9

    .line 604
    .line 605
    iget v7, v2, La/mxp;->u:F

    .line 606
    .line 607
    cmpl-float v7, v7, p1

    .line 608
    .line 609
    if-ltz v7, :cond_11

    .line 610
    .line 611
    if-ltz v14, :cond_11

    .line 612
    .line 613
    if-ltz v13, :cond_11

    .line 614
    .line 615
    goto :goto_b

    .line 616
    :cond_11
    cmpl-float v7, v12, p1

    .line 617
    .line 618
    if-gez v7, :cond_14

    .line 619
    .line 620
    cmpl-float v7, v11, p1

    .line 621
    .line 622
    if-ltz v7, :cond_12

    .line 623
    .line 624
    goto :goto_b

    .line 625
    :cond_12
    cmpl-float v7, v3, p1

    .line 626
    .line 627
    if-ltz v7, :cond_13

    .line 628
    .line 629
    goto :goto_b

    .line 630
    :cond_13
    :goto_a
    move/from16 v9, v26

    .line 631
    .line 632
    move-wide/from16 v7, v27

    .line 633
    .line 634
    goto/16 :goto_8

    .line 635
    .line 636
    :cond_14
    :goto_b
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    goto :goto_a

    .line 640
    :cond_15
    move/from16 v26, v9

    .line 641
    .line 642
    const/16 p1, 0x0

    .line 643
    .line 644
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 645
    .line 646
    .line 647
    move-result-object v7

    .line 648
    :goto_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 649
    .line 650
    .line 651
    move-result v8

    .line 652
    if-eqz v8, :cond_17

    .line 653
    .line 654
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v8

    .line 658
    move-object v9, v8

    .line 659
    check-cast v9, La/zxp;

    .line 660
    .line 661
    iget-byte v9, v9, La/zxp;->a:B

    .line 662
    .line 663
    move-object/from16 v25, v7

    .line 664
    .line 665
    move-object/from16 v29, v8

    .line 666
    .line 667
    int-to-long v7, v9

    .line 668
    cmp-long v7, v7, v27

    .line 669
    .line 670
    if-nez v7, :cond_16

    .line 671
    .line 672
    goto :goto_d

    .line 673
    :cond_16
    move-object/from16 v7, v25

    .line 674
    .line 675
    goto :goto_c

    .line 676
    :cond_17
    const/16 v29, 0x0

    .line 677
    .line 678
    :goto_d
    check-cast v29, La/zxp;

    .line 679
    .line 680
    if-nez v29, :cond_18

    .line 681
    .line 682
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v7

    .line 686
    move-object/from16 v29, v7

    .line 687
    .line 688
    check-cast v29, La/zxp;

    .line 689
    .line 690
    if-nez v29, :cond_18

    .line 691
    .line 692
    sget-object v0, La/iun;->a:La/iun;

    .line 693
    .line 694
    :goto_e
    move-object v7, v0

    .line 695
    goto/16 :goto_26

    .line 696
    .line 697
    :cond_18
    move-object/from16 v7, v29

    .line 698
    .line 699
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 700
    .line 701
    .line 702
    move-result v8

    .line 703
    if-eqz v8, :cond_31

    .line 704
    .line 705
    const/4 v9, 0x1

    .line 706
    if-eq v8, v9, :cond_26

    .line 707
    .line 708
    const/4 v3, 0x4

    .line 709
    const v4, 0x7f130e69

    .line 710
    .line 711
    .line 712
    const/4 v9, 0x2

    .line 713
    if-eq v8, v9, :cond_20

    .line 714
    .line 715
    const/4 v9, 0x3

    .line 716
    if-ne v8, v9, :cond_1f

    .line 717
    .line 718
    invoke-static {v2}, La/vzb;->Z(La/mxp;)Z

    .line 719
    .line 720
    .line 721
    move-result v5

    .line 722
    iget-object v2, v2, La/mxp;->M:La/fyp;

    .line 723
    .line 724
    if-eqz v5, :cond_19

    .line 725
    .line 726
    new-instance v5, La/lqh;

    .line 727
    .line 728
    new-instance v6, La/fph;

    .line 729
    .line 730
    const/4 v8, 0x0

    .line 731
    new-array v9, v8, [Ljava/lang/Object;

    .line 732
    .line 733
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 734
    .line 735
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 736
    .line 737
    .line 738
    move-result-object v9

    .line 739
    const v11, 0x7f130aa4

    .line 740
    .line 741
    .line 742
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 743
    .line 744
    .line 745
    move-result-object v9

    .line 746
    iget-object v11, v2, La/fyp;->a:La/byp;

    .line 747
    .line 748
    invoke-static {v11}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v11

    .line 752
    iget-object v12, v2, La/fyp;->a:La/byp;

    .line 753
    .line 754
    iget-object v13, v2, La/fyp;->b:La/byp;

    .line 755
    .line 756
    iget-object v2, v2, La/fyp;->c:La/byp;

    .line 757
    .line 758
    iget v12, v12, La/byp;->a:I

    .line 759
    .line 760
    invoke-direct {v6, v12, v9, v11}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 761
    .line 762
    .line 763
    new-instance v9, La/fph;

    .line 764
    .line 765
    new-array v11, v8, [Ljava/lang/Object;

    .line 766
    .line 767
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v11

    .line 771
    const v12, 0x7f1316e4

    .line 772
    .line 773
    .line 774
    invoke-virtual {v10, v12, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 775
    .line 776
    .line 777
    move-result-object v11

    .line 778
    invoke-static {v2}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 779
    .line 780
    .line 781
    move-result-object v12

    .line 782
    iget v2, v2, La/byp;->a:I

    .line 783
    .line 784
    invoke-direct {v9, v2, v11, v12}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    new-instance v2, La/fph;

    .line 788
    .line 789
    new-array v11, v8, [Ljava/lang/Object;

    .line 790
    .line 791
    invoke-static {v11, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 792
    .line 793
    .line 794
    move-result-object v11

    .line 795
    const v8, 0x7f13068f

    .line 796
    .line 797
    .line 798
    invoke-virtual {v10, v8, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 799
    .line 800
    .line 801
    move-result-object v8

    .line 802
    invoke-static {v13}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 803
    .line 804
    .line 805
    move-result-object v10

    .line 806
    iget v11, v13, La/byp;->a:I

    .line 807
    .line 808
    invoke-direct {v2, v11, v8, v10}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 809
    .line 810
    .line 811
    filled-new-array {v6, v9, v2}, [La/fph;

    .line 812
    .line 813
    .line 814
    move-result-object v2

    .line 815
    invoke-static {v2}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    const/4 v6, 0x0

    .line 820
    invoke-direct {v5, v2, v6}, La/lqh;-><init>(La/i4;La/cqh;)V

    .line 821
    .line 822
    .line 823
    goto :goto_f

    .line 824
    :cond_19
    const/4 v5, 0x0

    .line 825
    :goto_f
    if-gez v24, :cond_1b

    .line 826
    .line 827
    if-gez v26, :cond_1b

    .line 828
    .line 829
    if-ltz v23, :cond_1a

    .line 830
    .line 831
    goto :goto_10

    .line 832
    :cond_1a
    const/4 v4, 0x0

    .line 833
    goto :goto_12

    .line 834
    :cond_1b
    :goto_10
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 835
    .line 836
    .line 837
    move-result-object v2

    .line 838
    if-ltz v24, :cond_1c

    .line 839
    .line 840
    new-instance v6, La/dqh;

    .line 841
    .line 842
    const/4 v8, 0x0

    .line 843
    new-array v9, v8, [Ljava/lang/Object;

    .line 844
    .line 845
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 846
    .line 847
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 848
    .line 849
    .line 850
    move-result-object v9

    .line 851
    const v11, 0x7f130304

    .line 852
    .line 853
    .line 854
    invoke-virtual {v10, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v9

    .line 858
    invoke-static/range {v24 .. v24}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 859
    .line 860
    .line 861
    move-result-object v10

    .line 862
    invoke-direct {v6, v9, v10}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 866
    .line 867
    .line 868
    goto :goto_11

    .line 869
    :cond_1c
    const/4 v8, 0x0

    .line 870
    :goto_11
    if-ltz v26, :cond_1d

    .line 871
    .line 872
    new-instance v6, La/dqh;

    .line 873
    .line 874
    new-array v9, v8, [Ljava/lang/Object;

    .line 875
    .line 876
    iget-object v10, v0, La/ctf0;->b:La/lsm0;

    .line 877
    .line 878
    invoke-static {v9, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v9

    .line 882
    invoke-virtual {v10, v4, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 883
    .line 884
    .line 885
    move-result-object v4

    .line 886
    invoke-static/range {v26 .. v26}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 887
    .line 888
    .line 889
    move-result-object v9

    .line 890
    invoke-direct {v6, v4, v9}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    :cond_1d
    if-ltz v23, :cond_1e

    .line 897
    .line 898
    new-instance v4, La/dqh;

    .line 899
    .line 900
    new-array v6, v8, [Ljava/lang/Object;

    .line 901
    .line 902
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 903
    .line 904
    invoke-static {v6, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v6

    .line 908
    const v8, 0x7f130a3a

    .line 909
    .line 910
    .line 911
    invoke-virtual {v9, v8, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 912
    .line 913
    .line 914
    move-result-object v6

    .line 915
    invoke-static/range {v23 .. v23}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v8

    .line 919
    invoke-direct {v4, v6, v8}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 923
    .line 924
    .line 925
    :cond_1e
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 926
    .line 927
    .line 928
    move-result-object v2

    .line 929
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 930
    .line 931
    .line 932
    move-result-object v2

    .line 933
    new-instance v4, La/wph;

    .line 934
    .line 935
    invoke-direct {v4, v2}, La/wph;-><init>(La/a4x;)V

    .line 936
    .line 937
    .line 938
    :goto_12
    new-instance v2, La/pqh;

    .line 939
    .line 940
    invoke-direct {v2, v5, v4, v3}, La/pqh;-><init>(La/oqh;La/xph;I)V

    .line 941
    .line 942
    .line 943
    goto/16 :goto_22

    .line 944
    .line 945
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 946
    .line 947
    .line 948
    goto/16 :goto_9

    .line 949
    .line 950
    :cond_20
    invoke-static {v2}, La/vzb;->b0(La/mxp;)Z

    .line 951
    .line 952
    .line 953
    move-result v5

    .line 954
    iget-object v6, v2, La/mxp;->L:La/vxp;

    .line 955
    .line 956
    if-eqz v5, :cond_21

    .line 957
    .line 958
    new-instance v5, La/kqh;

    .line 959
    .line 960
    new-instance v8, La/xoh;

    .line 961
    .line 962
    sget-object v9, La/aph;->a:La/aph;

    .line 963
    .line 964
    const/4 v10, 0x0

    .line 965
    new-array v11, v10, [Ljava/lang/Object;

    .line 966
    .line 967
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 968
    .line 969
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 970
    .line 971
    .line 972
    move-result-object v11

    .line 973
    const v10, 0x7f131744

    .line 974
    .line 975
    .line 976
    invoke-virtual {v12, v10, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 977
    .line 978
    .line 979
    move-result-object v10

    .line 980
    iget-object v11, v6, La/vxp;->a:La/byp;

    .line 981
    .line 982
    invoke-static {v11}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v11

    .line 986
    iget-object v13, v6, La/vxp;->a:La/byp;

    .line 987
    .line 988
    iget-object v14, v6, La/vxp;->c:La/byp;

    .line 989
    .line 990
    iget-object v6, v6, La/vxp;->b:La/byp;

    .line 991
    .line 992
    iget v13, v13, La/byp;->b:F

    .line 993
    .line 994
    float-to-int v13, v13

    .line 995
    invoke-direct {v8, v9, v10, v11, v13}, La/xoh;-><init>(La/aph;Ljava/lang/String;Ljava/lang/String;I)V

    .line 996
    .line 997
    .line 998
    new-instance v9, La/xoh;

    .line 999
    .line 1000
    sget-object v10, La/aph;->b:La/aph;

    .line 1001
    .line 1002
    const/4 v11, 0x0

    .line 1003
    new-array v13, v11, [Ljava/lang/Object;

    .line 1004
    .line 1005
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v13

    .line 1009
    const v15, 0x7f1302b2

    .line 1010
    .line 1011
    .line 1012
    invoke-virtual {v12, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v13

    .line 1016
    invoke-static {v6}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v15

    .line 1020
    iget v6, v6, La/byp;->b:F

    .line 1021
    .line 1022
    float-to-int v6, v6

    .line 1023
    invoke-direct {v9, v10, v13, v15, v6}, La/xoh;-><init>(La/aph;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1024
    .line 1025
    .line 1026
    new-instance v6, La/xoh;

    .line 1027
    .line 1028
    sget-object v10, La/aph;->c:La/aph;

    .line 1029
    .line 1030
    new-array v13, v11, [Ljava/lang/Object;

    .line 1031
    .line 1032
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v13

    .line 1036
    const v11, 0x7f131746

    .line 1037
    .line 1038
    .line 1039
    invoke-virtual {v12, v11, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v11

    .line 1043
    invoke-static {v14}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v12

    .line 1047
    iget v13, v14, La/byp;->b:F

    .line 1048
    .line 1049
    float-to-int v13, v13

    .line 1050
    invoke-direct {v6, v10, v11, v12, v13}, La/xoh;-><init>(La/aph;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1051
    .line 1052
    .line 1053
    filled-new-array {v8, v9, v6}, [La/xoh;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v6

    .line 1057
    invoke-static {v6}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v6

    .line 1061
    invoke-direct {v5, v6}, La/kqh;-><init>(La/i4;)V

    .line 1062
    .line 1063
    .line 1064
    goto :goto_13

    .line 1065
    :cond_21
    const/4 v5, 0x0

    .line 1066
    :goto_13
    invoke-static {v2}, La/vzb;->a0(La/mxp;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v6

    .line 1070
    if-eqz v6, :cond_25

    .line 1071
    .line 1072
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1073
    .line 1074
    .line 1075
    move-result-object v6

    .line 1076
    iget-object v2, v2, La/mxp;->K:La/rxp;

    .line 1077
    .line 1078
    iget-object v8, v2, La/rxp;->a:La/byp;

    .line 1079
    .line 1080
    iget-object v9, v2, La/rxp;->b:La/byp;

    .line 1081
    .line 1082
    invoke-static {v8}, La/vzb;->c0(La/byp;)Z

    .line 1083
    .line 1084
    .line 1085
    move-result v8

    .line 1086
    if-eqz v8, :cond_22

    .line 1087
    .line 1088
    new-instance v8, La/dqh;

    .line 1089
    .line 1090
    const/4 v10, 0x0

    .line 1091
    new-array v11, v10, [Ljava/lang/Object;

    .line 1092
    .line 1093
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 1094
    .line 1095
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v11

    .line 1099
    const v10, 0x7f130a38

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v12, v10, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v10

    .line 1106
    iget-object v11, v2, La/rxp;->a:La/byp;

    .line 1107
    .line 1108
    invoke-static {v11}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v11

    .line 1112
    invoke-direct {v8, v10, v11}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    :cond_22
    iget-object v2, v2, La/rxp;->c:La/byp;

    .line 1119
    .line 1120
    invoke-static {v9}, La/vzb;->c0(La/byp;)Z

    .line 1121
    .line 1122
    .line 1123
    move-result v8

    .line 1124
    if-eqz v8, :cond_23

    .line 1125
    .line 1126
    new-instance v8, La/dqh;

    .line 1127
    .line 1128
    const/4 v10, 0x0

    .line 1129
    new-array v11, v10, [Ljava/lang/Object;

    .line 1130
    .line 1131
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 1132
    .line 1133
    invoke-static {v11, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v11

    .line 1137
    const v13, 0x7f130a39

    .line 1138
    .line 1139
    .line 1140
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1141
    .line 1142
    .line 1143
    move-result-object v11

    .line 1144
    invoke-static {v9}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v9

    .line 1148
    invoke-direct {v8, v11, v9}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1152
    .line 1153
    .line 1154
    goto :goto_14

    .line 1155
    :cond_23
    const/4 v10, 0x0

    .line 1156
    :goto_14
    invoke-static {v2}, La/vzb;->c0(La/byp;)Z

    .line 1157
    .line 1158
    .line 1159
    move-result v8

    .line 1160
    if-eqz v8, :cond_24

    .line 1161
    .line 1162
    new-instance v8, La/dqh;

    .line 1163
    .line 1164
    new-array v9, v10, [Ljava/lang/Object;

    .line 1165
    .line 1166
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1167
    .line 1168
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v9

    .line 1172
    invoke-virtual {v11, v4, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v4

    .line 1176
    invoke-static {v2}, La/wzb;->B0(La/byp;)Ljava/lang/String;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v2

    .line 1180
    invoke-direct {v8, v4, v2}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1181
    .line 1182
    .line 1183
    invoke-virtual {v6, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1184
    .line 1185
    .line 1186
    :cond_24
    invoke-static {v6}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v2

    .line 1190
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    new-instance v4, La/uph;

    .line 1195
    .line 1196
    const/4 v6, 0x0

    .line 1197
    invoke-direct {v4, v2, v6}, La/uph;-><init>(La/a4x;Ljava/lang/String;)V

    .line 1198
    .line 1199
    .line 1200
    goto :goto_15

    .line 1201
    :cond_25
    const/4 v4, 0x0

    .line 1202
    :goto_15
    new-instance v2, La/pqh;

    .line 1203
    .line 1204
    invoke-direct {v2, v5, v4, v3}, La/pqh;-><init>(La/oqh;La/xph;I)V

    .line 1205
    .line 1206
    .line 1207
    goto/16 :goto_22

    .line 1208
    .line 1209
    :cond_26
    iget v2, v2, La/mxp;->y:F

    .line 1210
    .line 1211
    cmpl-float v3, v2, p1

    .line 1212
    .line 1213
    if-ltz v3, :cond_27

    .line 1214
    .line 1215
    if-ltz v6, :cond_27

    .line 1216
    .line 1217
    if-ltz v10, :cond_27

    .line 1218
    .line 1219
    const/4 v3, 0x1

    .line 1220
    goto :goto_16

    .line 1221
    :cond_27
    const/4 v3, 0x0

    .line 1222
    :goto_16
    if-eqz v3, :cond_28

    .line 1223
    .line 1224
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v2

    .line 1228
    invoke-static {v2}, La/wzb;->E0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v2

    .line 1232
    new-instance v3, La/lqh;

    .line 1233
    .line 1234
    new-instance v8, La/fph;

    .line 1235
    .line 1236
    const/4 v11, 0x0

    .line 1237
    new-array v9, v11, [Ljava/lang/Object;

    .line 1238
    .line 1239
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 1240
    .line 1241
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v9

    .line 1245
    const v13, 0x7f131499

    .line 1246
    .line 1247
    .line 1248
    invoke-virtual {v12, v13, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v9

    .line 1252
    invoke-static {v6}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v13

    .line 1256
    invoke-direct {v8, v6, v9, v13}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1257
    .line 1258
    .line 1259
    new-instance v6, La/fph;

    .line 1260
    .line 1261
    new-array v9, v11, [Ljava/lang/Object;

    .line 1262
    .line 1263
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1264
    .line 1265
    .line 1266
    move-result-object v9

    .line 1267
    const v13, 0x7f130161

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v12, v13, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v9

    .line 1274
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v13

    .line 1278
    invoke-direct {v6, v10, v9, v13}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1279
    .line 1280
    .line 1281
    new-instance v9, La/gph;

    .line 1282
    .line 1283
    new-array v10, v11, [Ljava/lang/Object;

    .line 1284
    .line 1285
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v10

    .line 1289
    const v13, 0x7f13003c

    .line 1290
    .line 1291
    .line 1292
    invoke-virtual {v12, v13, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v10

    .line 1296
    invoke-direct {v9, v10, v2}, La/gph;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    const/4 v10, 0x3

    .line 1300
    new-array v14, v10, [La/hph;

    .line 1301
    .line 1302
    aput-object v8, v14, v11

    .line 1303
    .line 1304
    const/16 v21, 0x1

    .line 1305
    .line 1306
    aput-object v6, v14, v21

    .line 1307
    .line 1308
    const/16 v20, 0x2

    .line 1309
    .line 1310
    aput-object v9, v14, v20

    .line 1311
    .line 1312
    invoke-static {v14}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v6

    .line 1316
    new-array v8, v11, [Ljava/lang/Object;

    .line 1317
    .line 1318
    invoke-static {v8, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v8

    .line 1322
    invoke-virtual {v12, v13, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1323
    .line 1324
    .line 1325
    move-result-object v8

    .line 1326
    new-instance v9, La/cqh;

    .line 1327
    .line 1328
    invoke-direct {v9, v2, v8}, La/cqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1329
    .line 1330
    .line 1331
    invoke-direct {v3, v6, v9}, La/lqh;-><init>(La/i4;La/cqh;)V

    .line 1332
    .line 1333
    .line 1334
    move-object v6, v3

    .line 1335
    goto :goto_17

    .line 1336
    :cond_28
    const/4 v6, 0x0

    .line 1337
    :goto_17
    cmpl-float v2, v22, p1

    .line 1338
    .line 1339
    const/4 v3, 0x6

    .line 1340
    if-gez v2, :cond_2a

    .line 1341
    .line 1342
    cmpl-float v2, v5, p1

    .line 1343
    .line 1344
    if-ltz v2, :cond_29

    .line 1345
    .line 1346
    goto :goto_18

    .line 1347
    :cond_29
    const/4 v5, 0x0

    .line 1348
    goto :goto_19

    .line 1349
    :cond_2a
    :goto_18
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v2

    .line 1353
    cmpl-float v8, v22, p1

    .line 1354
    .line 1355
    if-ltz v8, :cond_2b

    .line 1356
    .line 1357
    new-instance v8, La/nph;

    .line 1358
    .line 1359
    const/4 v10, 0x0

    .line 1360
    new-array v9, v10, [Ljava/lang/Object;

    .line 1361
    .line 1362
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1363
    .line 1364
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v9

    .line 1368
    const v10, 0x7f1301c4

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v11, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v9

    .line 1375
    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v10

    .line 1379
    invoke-static {v10}, La/wzb;->H0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v10

    .line 1383
    new-instance v11, La/m0x;

    .line 1384
    .line 1385
    const v12, 0x7f080865

    .line 1386
    .line 1387
    .line 1388
    const/4 v13, 0x0

    .line 1389
    invoke-direct {v11, v12, v13, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1390
    .line 1391
    .line 1392
    invoke-direct {v8, v9, v10, v11}, La/nph;-><init>(Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v2, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1396
    .line 1397
    .line 1398
    :cond_2b
    cmpl-float v8, v5, p1

    .line 1399
    .line 1400
    if-ltz v8, :cond_2c

    .line 1401
    .line 1402
    new-instance v8, La/oph;

    .line 1403
    .line 1404
    const/4 v10, 0x0

    .line 1405
    new-array v9, v10, [Ljava/lang/Object;

    .line 1406
    .line 1407
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1408
    .line 1409
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v9

    .line 1413
    const v10, 0x7f130698

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v11, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v9

    .line 1420
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v10

    .line 1424
    invoke-static {v10}, La/wzb;->E0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v10

    .line 1428
    float-to-int v5, v5

    .line 1429
    invoke-direct {v8, v5, v9, v10}, La/oph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    invoke-virtual {v2, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1433
    .line 1434
    .line 1435
    :cond_2c
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    new-instance v5, La/tph;

    .line 1444
    .line 1445
    invoke-direct {v5, v2}, La/tph;-><init>(La/a4x;)V

    .line 1446
    .line 1447
    .line 1448
    :goto_19
    if-gez v4, :cond_2e

    .line 1449
    .line 1450
    cmpl-float v2, v15, p1

    .line 1451
    .line 1452
    if-ltz v2, :cond_2d

    .line 1453
    .line 1454
    goto :goto_1a

    .line 1455
    :cond_2d
    const/4 v3, 0x0

    .line 1456
    goto/16 :goto_1b

    .line 1457
    .line 1458
    :cond_2e
    :goto_1a
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v2

    .line 1462
    int-to-float v8, v4

    .line 1463
    cmpl-float v8, v8, p1

    .line 1464
    .line 1465
    if-ltz v8, :cond_2f

    .line 1466
    .line 1467
    new-instance v8, La/mph;

    .line 1468
    .line 1469
    const/4 v10, 0x0

    .line 1470
    new-array v9, v10, [Ljava/lang/Object;

    .line 1471
    .line 1472
    iget-object v11, v0, La/ctf0;->b:La/lsm0;

    .line 1473
    .line 1474
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1475
    .line 1476
    .line 1477
    move-result-object v9

    .line 1478
    const v10, 0x7f1301c5

    .line 1479
    .line 1480
    .line 1481
    invoke-virtual {v11, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1482
    .line 1483
    .line 1484
    move-result-object v9

    .line 1485
    int-to-long v10, v4

    .line 1486
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 1487
    .line 1488
    const-wide/16 v12, 0x3c

    .line 1489
    .line 1490
    div-long v22, v10, v12

    .line 1491
    .line 1492
    invoke-static/range {v22 .. v23}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v14

    .line 1496
    rem-long/2addr v10, v12

    .line 1497
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1498
    .line 1499
    .line 1500
    move-result-object v10

    .line 1501
    filled-new-array {v14, v10}, [Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object v10

    .line 1505
    const/4 v11, 0x2

    .line 1506
    invoke-static {v10, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v10

    .line 1510
    const-string v11, "%02d:%02d"

    .line 1511
    .line 1512
    invoke-static {v4, v11, v10}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v4

    .line 1516
    new-instance v10, La/m0x;

    .line 1517
    .line 1518
    const v11, 0x7f08092c

    .line 1519
    .line 1520
    .line 1521
    const/4 v13, 0x0

    .line 1522
    invoke-direct {v10, v11, v13, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1523
    .line 1524
    .line 1525
    invoke-direct {v8, v9, v4, v10}, La/mph;-><init>(Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 1526
    .line 1527
    .line 1528
    invoke-virtual {v2, v8}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1529
    .line 1530
    .line 1531
    :cond_2f
    cmpl-float v4, v15, p1

    .line 1532
    .line 1533
    if-ltz v4, :cond_30

    .line 1534
    .line 1535
    new-instance v4, La/mph;

    .line 1536
    .line 1537
    const/4 v10, 0x0

    .line 1538
    new-array v8, v10, [Ljava/lang/Object;

    .line 1539
    .line 1540
    iget-object v9, v0, La/ctf0;->b:La/lsm0;

    .line 1541
    .line 1542
    invoke-static {v8, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v8

    .line 1546
    const v10, 0x7f1301c6

    .line 1547
    .line 1548
    .line 1549
    invoke-virtual {v9, v10, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v8

    .line 1553
    invoke-static {v15}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v9

    .line 1557
    invoke-static {v9}, La/wzb;->H0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v9

    .line 1561
    new-instance v10, La/m0x;

    .line 1562
    .line 1563
    const v11, 0x7f080c18

    .line 1564
    .line 1565
    .line 1566
    const/4 v15, 0x0

    .line 1567
    invoke-direct {v10, v11, v15, v3}, La/m0x;-><init>(ILa/bzw;I)V

    .line 1568
    .line 1569
    .line 1570
    invoke-direct {v4, v8, v9, v10}, La/mph;-><init>(Ljava/lang/String;Ljava/lang/String;La/m0x;)V

    .line 1571
    .line 1572
    .line 1573
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1574
    .line 1575
    .line 1576
    :cond_30
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1577
    .line 1578
    .line 1579
    move-result-object v2

    .line 1580
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    new-instance v3, La/cph;

    .line 1585
    .line 1586
    invoke-direct {v3, v2}, La/cph;-><init>(La/a4x;)V

    .line 1587
    .line 1588
    .line 1589
    :goto_1b
    new-instance v2, La/pqh;

    .line 1590
    .line 1591
    invoke-direct {v2, v6, v5, v3}, La/pqh;-><init>(La/oqh;La/xph;La/eph;)V

    .line 1592
    .line 1593
    .line 1594
    goto/16 :goto_22

    .line 1595
    .line 1596
    :cond_31
    const/4 v15, 0x0

    .line 1597
    iget v2, v2, La/mxp;->u:F

    .line 1598
    .line 1599
    cmpl-float v4, v2, p1

    .line 1600
    .line 1601
    if-ltz v4, :cond_32

    .line 1602
    .line 1603
    if-ltz v14, :cond_32

    .line 1604
    .line 1605
    if-ltz v13, :cond_32

    .line 1606
    .line 1607
    const/4 v4, 0x1

    .line 1608
    goto :goto_1c

    .line 1609
    :cond_32
    const/4 v4, 0x0

    .line 1610
    :goto_1c
    if-eqz v4, :cond_33

    .line 1611
    .line 1612
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v2

    .line 1616
    invoke-static {v2}, La/wzb;->E0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v2

    .line 1620
    new-instance v6, La/lqh;

    .line 1621
    .line 1622
    new-instance v4, La/fph;

    .line 1623
    .line 1624
    const/4 v10, 0x0

    .line 1625
    new-array v5, v10, [Ljava/lang/Object;

    .line 1626
    .line 1627
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 1628
    .line 1629
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v5

    .line 1633
    const v9, 0x7f1309f8

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v8, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v5

    .line 1640
    invoke-static {v14}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v9

    .line 1644
    invoke-direct {v4, v14, v5, v9}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1645
    .line 1646
    .line 1647
    new-instance v5, La/fph;

    .line 1648
    .line 1649
    new-array v9, v10, [Ljava/lang/Object;

    .line 1650
    .line 1651
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v9

    .line 1655
    const v14, 0x7f130160

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v8, v14, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1659
    .line 1660
    .line 1661
    move-result-object v9

    .line 1662
    invoke-static {v13}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v14

    .line 1666
    invoke-direct {v5, v13, v9, v14}, La/fph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1667
    .line 1668
    .line 1669
    new-instance v9, La/gph;

    .line 1670
    .line 1671
    new-array v13, v10, [Ljava/lang/Object;

    .line 1672
    .line 1673
    invoke-static {v13, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v13

    .line 1677
    const v14, 0x7f13003c

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v8, v14, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v13

    .line 1684
    invoke-direct {v9, v13, v2}, La/gph;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1685
    .line 1686
    .line 1687
    const/4 v13, 0x3

    .line 1688
    new-array v15, v13, [La/hph;

    .line 1689
    .line 1690
    aput-object v4, v15, v10

    .line 1691
    .line 1692
    const/16 v21, 0x1

    .line 1693
    .line 1694
    aput-object v5, v15, v21

    .line 1695
    .line 1696
    const/16 v20, 0x2

    .line 1697
    .line 1698
    aput-object v9, v15, v20

    .line 1699
    .line 1700
    invoke-static {v15}, La/dyb;->g0([Ljava/lang/Object;)La/i4;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    new-array v5, v10, [Ljava/lang/Object;

    .line 1705
    .line 1706
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v5

    .line 1710
    invoke-virtual {v8, v14, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v5

    .line 1714
    new-instance v8, La/cqh;

    .line 1715
    .line 1716
    invoke-direct {v8, v2, v5}, La/cqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1717
    .line 1718
    .line 1719
    invoke-direct {v6, v4, v8}, La/lqh;-><init>(La/i4;La/cqh;)V

    .line 1720
    .line 1721
    .line 1722
    goto :goto_1d

    .line 1723
    :cond_33
    const/4 v6, 0x0

    .line 1724
    :goto_1d
    cmpl-float v2, v12, p1

    .line 1725
    .line 1726
    if-gez v2, :cond_35

    .line 1727
    .line 1728
    cmpl-float v2, v11, p1

    .line 1729
    .line 1730
    if-ltz v2, :cond_34

    .line 1731
    .line 1732
    goto :goto_1e

    .line 1733
    :cond_34
    const/4 v5, 0x0

    .line 1734
    const/4 v10, 0x0

    .line 1735
    goto :goto_20

    .line 1736
    :cond_35
    :goto_1e
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1737
    .line 1738
    .line 1739
    move-result-object v2

    .line 1740
    cmpl-float v4, v12, p1

    .line 1741
    .line 1742
    if-ltz v4, :cond_36

    .line 1743
    .line 1744
    new-instance v4, La/dqh;

    .line 1745
    .line 1746
    const/4 v10, 0x0

    .line 1747
    new-array v5, v10, [Ljava/lang/Object;

    .line 1748
    .line 1749
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 1750
    .line 1751
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v5

    .line 1755
    const v9, 0x7f1312d0

    .line 1756
    .line 1757
    .line 1758
    invoke-virtual {v8, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1759
    .line 1760
    .line 1761
    move-result-object v5

    .line 1762
    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1763
    .line 1764
    .line 1765
    move-result-object v8

    .line 1766
    invoke-static {v8}, La/wzb;->H0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1767
    .line 1768
    .line 1769
    move-result-object v8

    .line 1770
    invoke-direct {v4, v5, v8}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1771
    .line 1772
    .line 1773
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1774
    .line 1775
    .line 1776
    :cond_36
    cmpl-float v4, v11, p1

    .line 1777
    .line 1778
    if-ltz v4, :cond_37

    .line 1779
    .line 1780
    new-instance v4, La/dqh;

    .line 1781
    .line 1782
    const/4 v10, 0x0

    .line 1783
    new-array v5, v10, [Ljava/lang/Object;

    .line 1784
    .line 1785
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 1786
    .line 1787
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v5

    .line 1791
    const v9, 0x7f1312d1

    .line 1792
    .line 1793
    .line 1794
    invoke-virtual {v8, v9, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v5

    .line 1798
    invoke-static {v11}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v8

    .line 1802
    invoke-static {v8}, La/wzb;->H0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v8

    .line 1806
    invoke-direct {v4, v5, v8}, La/dqh;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1807
    .line 1808
    .line 1809
    invoke-virtual {v2, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1810
    .line 1811
    .line 1812
    goto :goto_1f

    .line 1813
    :cond_37
    const/4 v10, 0x0

    .line 1814
    :goto_1f
    invoke-static {v2}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1815
    .line 1816
    .line 1817
    move-result-object v2

    .line 1818
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1819
    .line 1820
    .line 1821
    move-result-object v2

    .line 1822
    new-array v4, v10, [Ljava/lang/Object;

    .line 1823
    .line 1824
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 1825
    .line 1826
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v4

    .line 1830
    const v8, 0x7f130f2b

    .line 1831
    .line 1832
    .line 1833
    invoke-virtual {v5, v8, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v4

    .line 1837
    new-instance v5, La/uph;

    .line 1838
    .line 1839
    invoke-direct {v5, v2, v4}, La/uph;-><init>(La/a4x;Ljava/lang/String;)V

    .line 1840
    .line 1841
    .line 1842
    :goto_20
    cmpl-float v2, v3, p1

    .line 1843
    .line 1844
    if-ltz v2, :cond_38

    .line 1845
    .line 1846
    new-instance v2, La/dph;

    .line 1847
    .line 1848
    new-array v4, v10, [Ljava/lang/Object;

    .line 1849
    .line 1850
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 1851
    .line 1852
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v4

    .line 1856
    const v9, 0x7f1312d2

    .line 1857
    .line 1858
    .line 1859
    invoke-virtual {v8, v9, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1860
    .line 1861
    .line 1862
    move-result-object v4

    .line 1863
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1864
    .line 1865
    .line 1866
    move-result-object v8

    .line 1867
    invoke-static {v8}, La/wzb;->E0(Ljava/lang/Float;)Ljava/lang/String;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v8

    .line 1871
    float-to-int v3, v3

    .line 1872
    invoke-direct {v2, v3, v4, v8}, La/dph;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 1873
    .line 1874
    .line 1875
    goto :goto_21

    .line 1876
    :cond_38
    const/4 v2, 0x0

    .line 1877
    :goto_21
    new-instance v3, La/pqh;

    .line 1878
    .line 1879
    invoke-direct {v3, v6, v5, v2}, La/pqh;-><init>(La/oqh;La/xph;La/eph;)V

    .line 1880
    .line 1881
    .line 1882
    move-object v2, v3

    .line 1883
    :goto_22
    new-instance v3, La/vvp;

    .line 1884
    .line 1885
    const/4 v10, 0x0

    .line 1886
    new-array v4, v10, [Ljava/lang/Object;

    .line 1887
    .line 1888
    iget-object v5, v0, La/ctf0;->b:La/lsm0;

    .line 1889
    .line 1890
    invoke-static {v4, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1891
    .line 1892
    .line 1893
    move-result-object v4

    .line 1894
    const v6, 0x7f131388

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v5, v6, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v23

    .line 1901
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 1902
    .line 1903
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 1904
    .line 1905
    .line 1906
    move-result-wide v4

    .line 1907
    new-instance v6, La/njm;

    .line 1908
    .line 1909
    const/16 v8, 0x7f

    .line 1910
    .line 1911
    invoke-direct {v6, v8}, La/njm;-><init>(I)V

    .line 1912
    .line 1913
    .line 1914
    new-instance v22, La/hjm;

    .line 1915
    .line 1916
    new-instance v8, La/y3d;

    .line 1917
    .line 1918
    invoke-direct {v8, v4, v5}, La/y3d;-><init>(J)V

    .line 1919
    .line 1920
    .line 1921
    const/16 v34, 0x0

    .line 1922
    .line 1923
    const/16 v35, 0x1ff8

    .line 1924
    .line 1925
    const/16 v26, 0x0

    .line 1926
    .line 1927
    const/16 v27, 0x0

    .line 1928
    .line 1929
    const/16 v28, 0x0

    .line 1930
    .line 1931
    const/16 v29, 0x0

    .line 1932
    .line 1933
    const/16 v30, 0x0

    .line 1934
    .line 1935
    const/16 v31, 0x0

    .line 1936
    .line 1937
    const/16 v32, 0x0

    .line 1938
    .line 1939
    const/16 v33, 0x0

    .line 1940
    .line 1941
    move-object/from16 v24, v6

    .line 1942
    .line 1943
    move-object/from16 v25, v8

    .line 1944
    .line 1945
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 1946
    .line 1947
    .line 1948
    move-object/from16 v4, v22

    .line 1949
    .line 1950
    const-string v5, "HEADER_STATISTIC"

    .line 1951
    .line 1952
    invoke-direct {v3, v4, v5}, La/vvp;-><init>(La/hjm;Ljava/lang/String;)V

    .line 1953
    .line 1954
    .line 1955
    new-instance v4, Ljava/util/ArrayList;

    .line 1956
    .line 1957
    const/16 v5, 0xa

    .line 1958
    .line 1959
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1960
    .line 1961
    .line 1962
    move-result v5

    .line 1963
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1967
    .line 1968
    .line 1969
    move-result-object v1

    .line 1970
    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1971
    .line 1972
    .line 1973
    move-result v5

    .line 1974
    if-eqz v5, :cond_3a

    .line 1975
    .line 1976
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v5

    .line 1980
    check-cast v5, La/zxp;

    .line 1981
    .line 1982
    new-instance v8, La/lxl;

    .line 1983
    .line 1984
    iget-byte v6, v5, La/zxp;->a:B

    .line 1985
    .line 1986
    int-to-long v9, v6

    .line 1987
    new-instance v11, La/xxl;

    .line 1988
    .line 1989
    iget v6, v5, La/zxp;->b:I

    .line 1990
    .line 1991
    const/4 v12, 0x0

    .line 1992
    new-array v13, v12, [Ljava/lang/Object;

    .line 1993
    .line 1994
    iget-object v14, v0, La/ctf0;->b:La/lsm0;

    .line 1995
    .line 1996
    invoke-static {v13, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1997
    .line 1998
    .line 1999
    move-result-object v13

    .line 2000
    invoke-virtual {v14, v6, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2001
    .line 2002
    .line 2003
    move-result-object v6

    .line 2004
    invoke-direct {v11, v6}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 2005
    .line 2006
    .line 2007
    iget-byte v5, v5, La/zxp;->a:B

    .line 2008
    .line 2009
    int-to-long v5, v5

    .line 2010
    iget-byte v12, v7, La/zxp;->a:B

    .line 2011
    .line 2012
    int-to-long v12, v12

    .line 2013
    cmp-long v5, v5, v12

    .line 2014
    .line 2015
    if-nez v5, :cond_39

    .line 2016
    .line 2017
    sget-object v5, La/uxl;->b:La/uxl;

    .line 2018
    .line 2019
    :goto_24
    move-object v13, v5

    .line 2020
    goto :goto_25

    .line 2021
    :cond_39
    sget-object v5, La/uxl;->a:La/uxl;

    .line 2022
    .line 2023
    goto :goto_24

    .line 2024
    :goto_25
    const/4 v14, 0x0

    .line 2025
    const/16 v15, 0x6c

    .line 2026
    .line 2027
    const/4 v12, 0x0

    .line 2028
    invoke-direct/range {v8 .. v15}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2032
    .line 2033
    .line 2034
    goto :goto_23

    .line 2035
    :cond_3a
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v10

    .line 2039
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 2040
    .line 2041
    .line 2042
    move-result v0

    .line 2043
    invoke-static {v0}, La/xfn;->b(Z)La/wfn;

    .line 2044
    .line 2045
    .line 2046
    move-result-object v0

    .line 2047
    iget v0, v0, La/wfn;->e:F

    .line 2048
    .line 2049
    move/from16 v1, p1

    .line 2050
    .line 2051
    const/4 v9, 0x2

    .line 2052
    invoke-static {v0, v1, v9}, La/s5x0;->t(FFI)La/lh80;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v13

    .line 2056
    new-instance v9, La/fyl;

    .line 2057
    .line 2058
    const/4 v11, 0x0

    .line 2059
    const/4 v12, 0x0

    .line 2060
    const/4 v14, 0x0

    .line 2061
    const/16 v15, 0x16

    .line 2062
    .line 2063
    invoke-direct/range {v9 .. v15}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 2064
    .line 2065
    .line 2066
    new-instance v0, La/nvp;

    .line 2067
    .line 2068
    invoke-direct {v0, v9}, La/nvp;-><init>(La/fyl;)V

    .line 2069
    .line 2070
    .line 2071
    new-instance v1, La/ayp;

    .line 2072
    .line 2073
    invoke-direct {v1, v2}, La/ayp;-><init>(La/pqh;)V

    .line 2074
    .line 2075
    .line 2076
    const/4 v9, 0x3

    .line 2077
    new-array v2, v9, [La/p6t0;

    .line 2078
    .line 2079
    const/4 v10, 0x0

    .line 2080
    aput-object v3, v2, v10

    .line 2081
    .line 2082
    const/16 v21, 0x1

    .line 2083
    .line 2084
    aput-object v0, v2, v21

    .line 2085
    .line 2086
    const/16 v20, 0x2

    .line 2087
    .line 2088
    aput-object v1, v2, v20

    .line 2089
    .line 2090
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2091
    .line 2092
    .line 2093
    move-result-object v0

    .line 2094
    goto/16 :goto_e

    .line 2095
    .line 2096
    :cond_3b
    const/4 v7, 0x0

    .line 2097
    :goto_26
    if-nez v7, :cond_3c

    .line 2098
    .line 2099
    sget-object v7, La/iun;->a:La/iun;

    .line 2100
    .line 2101
    :cond_3c
    :goto_27
    return-object v7

    .line 2102
    :pswitch_1
    move-object/from16 v1, p1

    .line 2103
    .line 2104
    check-cast v1, La/kxp;

    .line 2105
    .line 2106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2107
    .line 2108
    .line 2109
    iget-object v3, v1, La/kxp;->b:La/xwp;

    .line 2110
    .line 2111
    if-eqz v3, :cond_4e

    .line 2112
    .line 2113
    iget-object v0, v0, La/syp;->i:Ljava/lang/Object;

    .line 2114
    .line 2115
    check-cast v0, La/ctf0;

    .line 2116
    .line 2117
    iget-object v1, v1, La/kxp;->h:La/ypl0;

    .line 2118
    .line 2119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2120
    .line 2121
    .line 2122
    iget-object v3, v3, La/xwp;->d:Ljava/lang/Object;

    .line 2123
    .line 2124
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 2125
    .line 2126
    instance-of v4, v3, La/g0g0;

    .line 2127
    .line 2128
    if-eqz v4, :cond_3d

    .line 2129
    .line 2130
    const/4 v7, 0x0

    .line 2131
    goto :goto_28

    .line 2132
    :cond_3d
    move-object v7, v3

    .line 2133
    :goto_28
    check-cast v7, Ljava/util/List;

    .line 2134
    .line 2135
    if-nez v7, :cond_3e

    .line 2136
    .line 2137
    sget-object v7, La/iun;->a:La/iun;

    .line 2138
    .line 2139
    :cond_3e
    new-instance v3, Ljava/util/ArrayList;

    .line 2140
    .line 2141
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 2142
    .line 2143
    .line 2144
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2145
    .line 2146
    .line 2147
    move-result-object v4

    .line 2148
    :cond_3f
    :goto_29
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 2149
    .line 2150
    .line 2151
    move-result v5

    .line 2152
    if-eqz v5, :cond_40

    .line 2153
    .line 2154
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2155
    .line 2156
    .line 2157
    move-result-object v5

    .line 2158
    move-object v6, v5

    .line 2159
    check-cast v6, La/swp;

    .line 2160
    .line 2161
    iget-object v7, v6, La/swp;->e:Ljava/lang/String;

    .line 2162
    .line 2163
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 2164
    .line 2165
    .line 2166
    move-result v7

    .line 2167
    if-lez v7, :cond_3f

    .line 2168
    .line 2169
    iget-object v6, v6, La/swp;->f:Ljava/lang/String;

    .line 2170
    .line 2171
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 2172
    .line 2173
    .line 2174
    move-result v6

    .line 2175
    if-lez v6, :cond_3f

    .line 2176
    .line 2177
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2178
    .line 2179
    .line 2180
    goto :goto_29

    .line 2181
    :cond_40
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2182
    .line 2183
    .line 2184
    move-result v4

    .line 2185
    if-eqz v4, :cond_41

    .line 2186
    .line 2187
    sget-object v0, La/iun;->a:La/iun;

    .line 2188
    .line 2189
    :goto_2a
    move-object v7, v0

    .line 2190
    goto/16 :goto_33

    .line 2191
    .line 2192
    :cond_41
    new-instance v4, La/vvp;

    .line 2193
    .line 2194
    const/4 v10, 0x0

    .line 2195
    new-array v5, v10, [Ljava/lang/Object;

    .line 2196
    .line 2197
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 2198
    .line 2199
    invoke-static {v5, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2200
    .line 2201
    .line 2202
    move-result-object v5

    .line 2203
    const v6, 0x7f130ab8

    .line 2204
    .line 2205
    .line 2206
    invoke-virtual {v0, v6, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v23

    .line 2210
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 2211
    .line 2212
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 2213
    .line 2214
    .line 2215
    move-result-wide v5

    .line 2216
    new-instance v7, La/njm;

    .line 2217
    .line 2218
    sget-object v8, La/oe9;->a:La/oe9;

    .line 2219
    .line 2220
    const/16 v8, 0x6f

    .line 2221
    .line 2222
    invoke-direct {v7, v8}, La/njm;-><init>(I)V

    .line 2223
    .line 2224
    .line 2225
    new-instance v8, La/ue9;

    .line 2226
    .line 2227
    new-array v9, v10, [Ljava/lang/Object;

    .line 2228
    .line 2229
    invoke-static {v9, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v9

    .line 2233
    const v10, 0x7f1300e4

    .line 2234
    .line 2235
    .line 2236
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v0

    .line 2240
    invoke-direct {v8, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 2241
    .line 2242
    .line 2243
    new-instance v22, La/hjm;

    .line 2244
    .line 2245
    new-instance v0, La/y3d;

    .line 2246
    .line 2247
    invoke-direct {v0, v5, v6}, La/y3d;-><init>(J)V

    .line 2248
    .line 2249
    .line 2250
    const/16 v34, 0x0

    .line 2251
    .line 2252
    const/16 v35, 0x1bf8

    .line 2253
    .line 2254
    const/16 v26, 0x0

    .line 2255
    .line 2256
    const/16 v27, 0x0

    .line 2257
    .line 2258
    const/16 v28, 0x0

    .line 2259
    .line 2260
    const/16 v29, 0x0

    .line 2261
    .line 2262
    const/16 v30, 0x0

    .line 2263
    .line 2264
    const/16 v31, 0x0

    .line 2265
    .line 2266
    const/16 v32, 0x0

    .line 2267
    .line 2268
    move-object/from16 v25, v0

    .line 2269
    .line 2270
    move-object/from16 v24, v7

    .line 2271
    .line 2272
    move-object/from16 v33, v8

    .line 2273
    .line 2274
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 2275
    .line 2276
    .line 2277
    move-object/from16 v0, v22

    .line 2278
    .line 2279
    const-string v5, "HEADER_LAST_FIGHTS"

    .line 2280
    .line 2281
    invoke-direct {v4, v0, v5}, La/vvp;-><init>(La/hjm;Ljava/lang/String;)V

    .line 2282
    .line 2283
    .line 2284
    const/4 v9, 0x3

    .line 2285
    invoke-static {v3, v9}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v0

    .line 2289
    new-instance v3, Ljava/util/ArrayList;

    .line 2290
    .line 2291
    const/16 v5, 0xa

    .line 2292
    .line 2293
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2294
    .line 2295
    .line 2296
    move-result v5

    .line 2297
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 2298
    .line 2299
    .line 2300
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v0

    .line 2304
    :goto_2b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2305
    .line 2306
    .line 2307
    move-result v5

    .line 2308
    if-eqz v5, :cond_4d

    .line 2309
    .line 2310
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v5

    .line 2314
    check-cast v5, La/swp;

    .line 2315
    .line 2316
    new-instance v6, La/qoh;

    .line 2317
    .line 2318
    iget-wide v7, v5, La/swp;->a:J

    .line 2319
    .line 2320
    iget-object v9, v5, La/swp;->t:Ljava/lang/String;

    .line 2321
    .line 2322
    new-instance v10, La/n0x;

    .line 2323
    .line 2324
    iget-object v11, v1, La/ypl0;->c:La/lel0;

    .line 2325
    .line 2326
    iget-object v11, v11, La/lel0;->j:Ljava/lang/String;

    .line 2327
    .line 2328
    invoke-direct {v10, v11}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 2329
    .line 2330
    .line 2331
    iget-object v11, v5, La/swp;->d:Ljava/lang/String;

    .line 2332
    .line 2333
    new-instance v12, La/roh;

    .line 2334
    .line 2335
    iget-object v13, v5, La/swp;->e:Ljava/lang/String;

    .line 2336
    .line 2337
    new-instance v14, La/c280;

    .line 2338
    .line 2339
    new-instance v15, Ljava/lang/StringBuilder;

    .line 2340
    .line 2341
    move-object/from16 p1, v0

    .line 2342
    .line 2343
    sget-object v0, La/ujn;->h:Ljava/lang/String;

    .line 2344
    .line 2345
    invoke-direct {v15, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2346
    .line 2347
    .line 2348
    iget-object v0, v5, La/swp;->g:Ljava/util/List;

    .line 2349
    .line 2350
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v0

    .line 2354
    check-cast v0, Ljava/lang/String;

    .line 2355
    .line 2356
    if-nez v0, :cond_42

    .line 2357
    .line 2358
    move-object v0, v2

    .line 2359
    :cond_42
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2360
    .line 2361
    .line 2362
    move-result v16

    .line 2363
    move-object/from16 v17, v1

    .line 2364
    .line 2365
    const-string v1, "/"

    .line 2366
    .line 2367
    move-object/from16 v19, v2

    .line 2368
    .line 2369
    const-string v2, "https://"

    .line 2370
    .line 2371
    move-object/from16 v18, v4

    .line 2372
    .line 2373
    if-nez v16, :cond_43

    .line 2374
    .line 2375
    const/4 v4, 0x0

    .line 2376
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2377
    .line 2378
    .line 2379
    move-object/from16 v22, v6

    .line 2380
    .line 2381
    goto :goto_2e

    .line 2382
    :cond_43
    move-object/from16 v22, v6

    .line 2383
    .line 2384
    const/4 v4, 0x0

    .line 2385
    sget-object v6, La/ujn;->h:Ljava/lang/String;

    .line 2386
    .line 2387
    invoke-static {v0, v6, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2388
    .line 2389
    .line 2390
    move-result v6

    .line 2391
    if-nez v6, :cond_46

    .line 2392
    .line 2393
    invoke-static {v0, v2, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2394
    .line 2395
    .line 2396
    move-result v6

    .line 2397
    if-eqz v6, :cond_44

    .line 2398
    .line 2399
    const/4 v6, 0x0

    .line 2400
    goto :goto_2d

    .line 2401
    :cond_44
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->length()I

    .line 2402
    .line 2403
    .line 2404
    move-result v4

    .line 2405
    if-lez v4, :cond_45

    .line 2406
    .line 2407
    invoke-static {v15, v1}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2408
    .line 2409
    .line 2410
    move-result v4

    .line 2411
    if-nez v4, :cond_45

    .line 2412
    .line 2413
    const/16 v4, 0x2f

    .line 2414
    .line 2415
    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2416
    .line 2417
    .line 2418
    move/from16 v16, v4

    .line 2419
    .line 2420
    const/4 v6, 0x1

    .line 2421
    goto :goto_2c

    .line 2422
    :cond_45
    const/4 v6, 0x1

    .line 2423
    const/16 v16, 0x2f

    .line 2424
    .line 2425
    :goto_2c
    new-array v4, v6, [C

    .line 2426
    .line 2427
    const/4 v6, 0x0

    .line 2428
    aput-char v16, v4, v6

    .line 2429
    .line 2430
    invoke-static {v0, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v0

    .line 2434
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2435
    .line 2436
    .line 2437
    goto :goto_2e

    .line 2438
    :cond_46
    move v6, v4

    .line 2439
    :goto_2d
    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2440
    .line 2441
    .line 2442
    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2443
    .line 2444
    .line 2445
    :goto_2e
    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2446
    .line 2447
    .line 2448
    move-result-object v0

    .line 2449
    const v4, 0x7f0809ae

    .line 2450
    .line 2451
    .line 2452
    invoke-direct {v14, v0, v4}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 2453
    .line 2454
    .line 2455
    invoke-direct {v12, v14, v13}, La/roh;-><init>(La/c280;Ljava/lang/String;)V

    .line 2456
    .line 2457
    .line 2458
    new-instance v13, La/roh;

    .line 2459
    .line 2460
    iget-object v0, v5, La/swp;->f:Ljava/lang/String;

    .line 2461
    .line 2462
    new-instance v6, La/c280;

    .line 2463
    .line 2464
    new-instance v14, Ljava/lang/StringBuilder;

    .line 2465
    .line 2466
    sget-object v15, La/ujn;->h:Ljava/lang/String;

    .line 2467
    .line 2468
    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 2469
    .line 2470
    .line 2471
    iget-object v15, v5, La/swp;->h:Ljava/util/List;

    .line 2472
    .line 2473
    invoke-static {v15}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v15

    .line 2477
    check-cast v15, Ljava/lang/String;

    .line 2478
    .line 2479
    if-nez v15, :cond_47

    .line 2480
    .line 2481
    move-object/from16 v15, v19

    .line 2482
    .line 2483
    :cond_47
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 2484
    .line 2485
    .line 2486
    move-result v23

    .line 2487
    if-nez v23, :cond_48

    .line 2488
    .line 2489
    const/4 v4, 0x0

    .line 2490
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2491
    .line 2492
    .line 2493
    move-wide/from16 v24, v7

    .line 2494
    .line 2495
    goto :goto_32

    .line 2496
    :cond_48
    move-wide/from16 v24, v7

    .line 2497
    .line 2498
    const/4 v4, 0x0

    .line 2499
    sget-object v7, La/ujn;->h:Ljava/lang/String;

    .line 2500
    .line 2501
    invoke-static {v15, v7, v4}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 2502
    .line 2503
    .line 2504
    move-result v7

    .line 2505
    if-nez v7, :cond_4b

    .line 2506
    .line 2507
    invoke-static {v15, v2, v4}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 2508
    .line 2509
    .line 2510
    move-result v2

    .line 2511
    if-eqz v2, :cond_49

    .line 2512
    .line 2513
    const/4 v8, 0x0

    .line 2514
    goto :goto_31

    .line 2515
    :cond_49
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->length()I

    .line 2516
    .line 2517
    .line 2518
    move-result v2

    .line 2519
    if-lez v2, :cond_4a

    .line 2520
    .line 2521
    invoke-static {v14, v1}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 2522
    .line 2523
    .line 2524
    move-result v1

    .line 2525
    if-nez v1, :cond_4a

    .line 2526
    .line 2527
    const/16 v4, 0x2f

    .line 2528
    .line 2529
    invoke-virtual {v14, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 2530
    .line 2531
    .line 2532
    :goto_2f
    const/4 v1, 0x1

    .line 2533
    goto :goto_30

    .line 2534
    :cond_4a
    const/16 v4, 0x2f

    .line 2535
    .line 2536
    goto :goto_2f

    .line 2537
    :goto_30
    new-array v2, v1, [C

    .line 2538
    .line 2539
    const/4 v8, 0x0

    .line 2540
    aput-char v4, v2, v8

    .line 2541
    .line 2542
    invoke-static {v15, v2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 2543
    .line 2544
    .line 2545
    move-result-object v1

    .line 2546
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2547
    .line 2548
    .line 2549
    goto :goto_32

    .line 2550
    :cond_4b
    move v8, v4

    .line 2551
    :goto_31
    invoke-virtual {v14, v8}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 2552
    .line 2553
    .line 2554
    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2555
    .line 2556
    .line 2557
    :goto_32
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2558
    .line 2559
    .line 2560
    move-result-object v1

    .line 2561
    const v2, 0x7f0809ae

    .line 2562
    .line 2563
    .line 2564
    invoke-direct {v6, v1, v2}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 2565
    .line 2566
    .line 2567
    invoke-direct {v13, v6, v0}, La/roh;-><init>(La/c280;Ljava/lang/String;)V

    .line 2568
    .line 2569
    .line 2570
    sget-object v14, La/toh;->c:La/toh;

    .line 2571
    .line 2572
    iget-object v0, v5, La/swp;->l:Ljava/lang/String;

    .line 2573
    .line 2574
    invoke-static {v0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2575
    .line 2576
    .line 2577
    move-result-object v0

    .line 2578
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v0

    .line 2582
    iget-object v1, v5, La/swp;->k:Ljava/lang/String;

    .line 2583
    .line 2584
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2585
    .line 2586
    .line 2587
    move-result-object v1

    .line 2588
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v1

    .line 2592
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 2593
    .line 2594
    .line 2595
    move-result v2

    .line 2596
    if-lez v2, :cond_4c

    .line 2597
    .line 2598
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2599
    .line 2600
    .line 2601
    move-result v2

    .line 2602
    if-lez v2, :cond_4c

    .line 2603
    .line 2604
    const-string v2, " ("

    .line 2605
    .line 2606
    const-string v4, ")"

    .line 2607
    .line 2608
    invoke-static {v1, v2, v0, v4}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2609
    .line 2610
    .line 2611
    move-result-object v1

    .line 2612
    :cond_4c
    move-object v15, v1

    .line 2613
    move-object/from16 v6, v22

    .line 2614
    .line 2615
    move-wide/from16 v7, v24

    .line 2616
    .line 2617
    invoke-direct/range {v6 .. v15}, La/qoh;-><init>(JLjava/lang/String;La/n0x;Ljava/lang/String;La/roh;La/roh;La/toh;Ljava/lang/String;)V

    .line 2618
    .line 2619
    .line 2620
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2621
    .line 2622
    .line 2623
    move-object/from16 v0, p1

    .line 2624
    .line 2625
    move-object/from16 v1, v17

    .line 2626
    .line 2627
    move-object/from16 v4, v18

    .line 2628
    .line 2629
    move-object/from16 v2, v19

    .line 2630
    .line 2631
    goto/16 :goto_2b

    .line 2632
    .line 2633
    :cond_4d
    move-object/from16 v18, v4

    .line 2634
    .line 2635
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2636
    .line 2637
    .line 2638
    move-result-object v0

    .line 2639
    new-instance v1, La/nwp;

    .line 2640
    .line 2641
    invoke-direct {v1, v0}, La/nwp;-><init>(La/a4x;)V

    .line 2642
    .line 2643
    .line 2644
    const/4 v9, 0x2

    .line 2645
    new-array v0, v9, [La/p6t0;

    .line 2646
    .line 2647
    const/4 v10, 0x0

    .line 2648
    aput-object v18, v0, v10

    .line 2649
    .line 2650
    const/16 v21, 0x1

    .line 2651
    .line 2652
    aput-object v1, v0, v21

    .line 2653
    .line 2654
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v0

    .line 2658
    goto/16 :goto_2a

    .line 2659
    .line 2660
    :cond_4e
    const/4 v7, 0x0

    .line 2661
    :goto_33
    if-nez v7, :cond_4f

    .line 2662
    .line 2663
    sget-object v7, La/iun;->a:La/iun;

    .line 2664
    .line 2665
    :cond_4f
    return-object v7

    .line 2666
    :pswitch_2
    move-object/from16 v19, v2

    .line 2667
    .line 2668
    move-object/from16 v1, p1

    .line 2669
    .line 2670
    check-cast v1, La/kxp;

    .line 2671
    .line 2672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2673
    .line 2674
    .line 2675
    iget-object v2, v1, La/kxp;->b:La/xwp;

    .line 2676
    .line 2677
    if-eqz v2, :cond_6d

    .line 2678
    .line 2679
    iget-object v3, v0, La/syp;->i:Ljava/lang/Object;

    .line 2680
    .line 2681
    check-cast v3, La/ctf0;

    .line 2682
    .line 2683
    iget-object v4, v1, La/kxp;->d:La/sff0;

    .line 2684
    .line 2685
    iget-boolean v4, v4, La/sff0;->J:Z

    .line 2686
    .line 2687
    iget-boolean v5, v1, La/kxp;->e:Z

    .line 2688
    .line 2689
    iget-object v0, v0, La/syp;->j:Ljava/lang/Object;

    .line 2690
    .line 2691
    move-object/from16 v22, v0

    .line 2692
    .line 2693
    check-cast v22, La/y78;

    .line 2694
    .line 2695
    iget-object v0, v1, La/kxp;->f:Ljava/util/List;

    .line 2696
    .line 2697
    iget-boolean v6, v1, La/kxp;->g:Z

    .line 2698
    .line 2699
    iget-object v1, v1, La/kxp;->h:La/ypl0;

    .line 2700
    .line 2701
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2702
    .line 2703
    .line 2704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2705
    .line 2706
    .line 2707
    iget-object v1, v1, La/ypl0;->c:La/lel0;

    .line 2708
    .line 2709
    iget-object v7, v2, La/xwp;->b:La/uvp;

    .line 2710
    .line 2711
    iget-object v2, v2, La/xwp;->c:La/uvp;

    .line 2712
    .line 2713
    iget-object v8, v7, La/uvp;->a:Ljava/lang/Object;

    .line 2714
    .line 2715
    sget-object v9, La/j0g0;->b:La/e0g0;

    .line 2716
    .line 2717
    instance-of v9, v8, La/g0g0;

    .line 2718
    .line 2719
    if-eqz v9, :cond_50

    .line 2720
    .line 2721
    const/4 v8, 0x0

    .line 2722
    :cond_50
    check-cast v8, Ljava/util/List;

    .line 2723
    .line 2724
    if-nez v8, :cond_51

    .line 2725
    .line 2726
    sget-object v8, La/iun;->a:La/iun;

    .line 2727
    .line 2728
    :cond_51
    new-instance v9, Ljava/util/ArrayList;

    .line 2729
    .line 2730
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 2731
    .line 2732
    .line 2733
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2734
    .line 2735
    .line 2736
    move-result-object v8

    .line 2737
    :cond_52
    :goto_34
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2738
    .line 2739
    .line 2740
    move-result v10

    .line 2741
    if-eqz v10, :cond_53

    .line 2742
    .line 2743
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2744
    .line 2745
    .line 2746
    move-result-object v10

    .line 2747
    move-object v11, v10

    .line 2748
    check-cast v11, La/d0t;

    .line 2749
    .line 2750
    invoke-static {v11}, La/pvm0;->w(La/d0t;)Z

    .line 2751
    .line 2752
    .line 2753
    move-result v11

    .line 2754
    if-eqz v11, :cond_52

    .line 2755
    .line 2756
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2757
    .line 2758
    .line 2759
    goto :goto_34

    .line 2760
    :cond_53
    iget-object v8, v2, La/uvp;->a:Ljava/lang/Object;

    .line 2761
    .line 2762
    instance-of v10, v8, La/g0g0;

    .line 2763
    .line 2764
    if-eqz v10, :cond_54

    .line 2765
    .line 2766
    const/4 v8, 0x0

    .line 2767
    :cond_54
    check-cast v8, Ljava/util/List;

    .line 2768
    .line 2769
    if-nez v8, :cond_55

    .line 2770
    .line 2771
    sget-object v8, La/iun;->a:La/iun;

    .line 2772
    .line 2773
    :cond_55
    new-instance v10, Ljava/util/ArrayList;

    .line 2774
    .line 2775
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 2776
    .line 2777
    .line 2778
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2779
    .line 2780
    .line 2781
    move-result-object v8

    .line 2782
    :cond_56
    :goto_35
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 2783
    .line 2784
    .line 2785
    move-result v11

    .line 2786
    if-eqz v11, :cond_57

    .line 2787
    .line 2788
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v11

    .line 2792
    move-object v12, v11

    .line 2793
    check-cast v12, La/d0t;

    .line 2794
    .line 2795
    invoke-static {v12}, La/pvm0;->w(La/d0t;)Z

    .line 2796
    .line 2797
    .line 2798
    move-result v12

    .line 2799
    if-eqz v12, :cond_56

    .line 2800
    .line 2801
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2802
    .line 2803
    .line 2804
    goto :goto_35

    .line 2805
    :cond_57
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2806
    .line 2807
    .line 2808
    move-result v8

    .line 2809
    if-eqz v8, :cond_58

    .line 2810
    .line 2811
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 2812
    .line 2813
    .line 2814
    move-result v8

    .line 2815
    if-eqz v8, :cond_58

    .line 2816
    .line 2817
    sget-object v0, La/iun;->a:La/iun;

    .line 2818
    .line 2819
    :goto_36
    move-object v7, v0

    .line 2820
    goto/16 :goto_4d

    .line 2821
    .line 2822
    :cond_58
    iget-object v8, v7, La/uvp;->c:Ljava/util/Set;

    .line 2823
    .line 2824
    iget-object v11, v2, La/uvp;->c:Ljava/util/Set;

    .line 2825
    .line 2826
    check-cast v11, Ljava/lang/Iterable;

    .line 2827
    .line 2828
    invoke-static {v8, v11}, La/eui0;->g(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    .line 2829
    .line 2830
    .line 2831
    move-result-object v8

    .line 2832
    iget-object v7, v7, La/uvp;->b:Ljava/util/List;

    .line 2833
    .line 2834
    iget-object v2, v2, La/uvp;->b:Ljava/util/List;

    .line 2835
    .line 2836
    invoke-static {v7, v2}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2837
    .line 2838
    .line 2839
    move-result-object v30

    .line 2840
    new-instance v2, Ljava/util/ArrayList;

    .line 2841
    .line 2842
    const/16 v7, 0xa

    .line 2843
    .line 2844
    invoke-static {v9, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2845
    .line 2846
    .line 2847
    move-result v11

    .line 2848
    invoke-direct {v2, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2849
    .line 2850
    .line 2851
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2852
    .line 2853
    .line 2854
    move-result-object v7

    .line 2855
    :goto_37
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 2856
    .line 2857
    .line 2858
    move-result v9

    .line 2859
    if-eqz v9, :cond_62

    .line 2860
    .line 2861
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2862
    .line 2863
    .line 2864
    move-result-object v9

    .line 2865
    check-cast v9, La/d0t;

    .line 2866
    .line 2867
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2868
    .line 2869
    .line 2870
    move-result-object v12

    .line 2871
    :cond_59
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 2872
    .line 2873
    .line 2874
    move-result v13

    .line 2875
    if-eqz v13, :cond_5a

    .line 2876
    .line 2877
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2878
    .line 2879
    .line 2880
    move-result-object v13

    .line 2881
    move-object v14, v13

    .line 2882
    check-cast v14, La/lok0;

    .line 2883
    .line 2884
    iget v14, v14, La/lok0;->a:I

    .line 2885
    .line 2886
    iget v15, v9, La/d0t;->O:I

    .line 2887
    .line 2888
    if-ne v14, v15, :cond_59

    .line 2889
    .line 2890
    goto :goto_38

    .line 2891
    :cond_5a
    const/4 v13, 0x0

    .line 2892
    :goto_38
    check-cast v13, La/lok0;

    .line 2893
    .line 2894
    iget-object v12, v1, La/lel0;->j:Ljava/lang/String;

    .line 2895
    .line 2896
    new-instance v14, Ljava/util/ArrayList;

    .line 2897
    .line 2898
    const/16 v15, 0xa

    .line 2899
    .line 2900
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2901
    .line 2902
    .line 2903
    move-result v11

    .line 2904
    invoke-direct {v14, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 2905
    .line 2906
    .line 2907
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2908
    .line 2909
    .line 2910
    move-result-object v11

    .line 2911
    :goto_39
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 2912
    .line 2913
    .line 2914
    move-result v15

    .line 2915
    if-eqz v15, :cond_5b

    .line 2916
    .line 2917
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2918
    .line 2919
    .line 2920
    move-result-object v15

    .line 2921
    check-cast v15, La/lok0;

    .line 2922
    .line 2923
    iget v15, v15, La/lok0;->a:I

    .line 2924
    .line 2925
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2926
    .line 2927
    .line 2928
    move-result-object v15

    .line 2929
    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2930
    .line 2931
    .line 2932
    goto :goto_39

    .line 2933
    :cond_5b
    if-eqz v13, :cond_5c

    .line 2934
    .line 2935
    iget-boolean v11, v13, La/lok0;->n:Z

    .line 2936
    .line 2937
    move/from16 v32, v11

    .line 2938
    .line 2939
    goto :goto_3a

    .line 2940
    :cond_5c
    const/16 v32, 0x0

    .line 2941
    .line 2942
    :goto_3a
    if-eqz v13, :cond_5d

    .line 2943
    .line 2944
    iget-boolean v11, v13, La/lok0;->p:Z

    .line 2945
    .line 2946
    move/from16 v33, v11

    .line 2947
    .line 2948
    goto :goto_3b

    .line 2949
    :cond_5d
    const/16 v33, 0x0

    .line 2950
    .line 2951
    :goto_3b
    invoke-static {v9}, La/fxb;->A(La/d0t;)La/m5l0;

    .line 2952
    .line 2953
    .line 2954
    move-result-object v25

    .line 2955
    if-eqz v13, :cond_5e

    .line 2956
    .line 2957
    iget-object v11, v13, La/lok0;->u:Ljava/lang/String;

    .line 2958
    .line 2959
    goto :goto_3c

    .line 2960
    :cond_5e
    const/4 v11, 0x0

    .line 2961
    :goto_3c
    if-nez v11, :cond_5f

    .line 2962
    .line 2963
    move-object/from16 v27, v19

    .line 2964
    .line 2965
    :goto_3d
    const/4 v11, 0x0

    .line 2966
    goto :goto_3e

    .line 2967
    :cond_5f
    move-object/from16 v27, v11

    .line 2968
    .line 2969
    goto :goto_3d

    .line 2970
    :goto_3e
    new-array v13, v11, [Ljava/lang/Object;

    .line 2971
    .line 2972
    iget-object v15, v3, La/ctf0;->b:La/lsm0;

    .line 2973
    .line 2974
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2975
    .line 2976
    .line 2977
    move-result-object v13

    .line 2978
    const v11, 0x7f1316d0

    .line 2979
    .line 2980
    .line 2981
    invoke-virtual {v15, v11, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2982
    .line 2983
    .line 2984
    move-result-object v11

    .line 2985
    move-object/from16 v24, v3

    .line 2986
    .line 2987
    move/from16 v34, v4

    .line 2988
    .line 2989
    iget-wide v3, v9, La/d0t;->a:J

    .line 2990
    .line 2991
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2992
    .line 2993
    .line 2994
    move-result-object v3

    .line 2995
    invoke-interface {v8, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2996
    .line 2997
    .line 2998
    move-result v3

    .line 2999
    if-eqz v3, :cond_60

    .line 3000
    .line 3001
    goto :goto_3f

    .line 3002
    :cond_60
    const/4 v11, 0x0

    .line 3003
    :goto_3f
    if-nez v11, :cond_61

    .line 3004
    .line 3005
    move-object/from16 v28, v19

    .line 3006
    .line 3007
    :goto_40
    move/from16 v31, v5

    .line 3008
    .line 3009
    move-object/from16 v23, v9

    .line 3010
    .line 3011
    move-object/from16 v26, v12

    .line 3012
    .line 3013
    move-object/from16 v29, v14

    .line 3014
    .line 3015
    goto :goto_41

    .line 3016
    :cond_61
    move-object/from16 v28, v11

    .line 3017
    .line 3018
    goto :goto_40

    .line 3019
    :goto_41
    invoke-static/range {v22 .. v34}, La/a4n0;->o(La/y78;La/d0t;La/ctf0;La/m5l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;ZZZZ)La/frh;

    .line 3020
    .line 3021
    .line 3022
    move-result-object v3

    .line 3023
    move-object/from16 v4, v24

    .line 3024
    .line 3025
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3026
    .line 3027
    .line 3028
    move-object v3, v4

    .line 3029
    move/from16 v5, v31

    .line 3030
    .line 3031
    move/from16 v4, v34

    .line 3032
    .line 3033
    goto/16 :goto_37

    .line 3034
    .line 3035
    :cond_62
    move/from16 v34, v4

    .line 3036
    .line 3037
    move/from16 v31, v5

    .line 3038
    .line 3039
    move-object v4, v3

    .line 3040
    new-instance v3, Ljava/util/ArrayList;

    .line 3041
    .line 3042
    const/16 v5, 0xa

    .line 3043
    .line 3044
    invoke-static {v10, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3045
    .line 3046
    .line 3047
    move-result v7

    .line 3048
    invoke-direct {v3, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 3049
    .line 3050
    .line 3051
    invoke-virtual {v10}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 3052
    .line 3053
    .line 3054
    move-result-object v5

    .line 3055
    :goto_42
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 3056
    .line 3057
    .line 3058
    move-result v7

    .line 3059
    if-eqz v7, :cond_6c

    .line 3060
    .line 3061
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3062
    .line 3063
    .line 3064
    move-result-object v7

    .line 3065
    check-cast v7, La/d0t;

    .line 3066
    .line 3067
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3068
    .line 3069
    .line 3070
    move-result-object v9

    .line 3071
    :cond_63
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 3072
    .line 3073
    .line 3074
    move-result v10

    .line 3075
    if-eqz v10, :cond_64

    .line 3076
    .line 3077
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3078
    .line 3079
    .line 3080
    move-result-object v10

    .line 3081
    move-object v11, v10

    .line 3082
    check-cast v11, La/lok0;

    .line 3083
    .line 3084
    iget v11, v11, La/lok0;->a:I

    .line 3085
    .line 3086
    iget v12, v7, La/d0t;->O:I

    .line 3087
    .line 3088
    if-ne v11, v12, :cond_63

    .line 3089
    .line 3090
    goto :goto_43

    .line 3091
    :cond_64
    const/4 v10, 0x0

    .line 3092
    :goto_43
    check-cast v10, La/lok0;

    .line 3093
    .line 3094
    iget-object v9, v1, La/lel0;->j:Ljava/lang/String;

    .line 3095
    .line 3096
    new-instance v11, Ljava/util/ArrayList;

    .line 3097
    .line 3098
    const/16 v15, 0xa

    .line 3099
    .line 3100
    invoke-static {v0, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 3101
    .line 3102
    .line 3103
    move-result v12

    .line 3104
    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    .line 3105
    .line 3106
    .line 3107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3108
    .line 3109
    .line 3110
    move-result-object v12

    .line 3111
    :goto_44
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 3112
    .line 3113
    .line 3114
    move-result v13

    .line 3115
    if-eqz v13, :cond_65

    .line 3116
    .line 3117
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3118
    .line 3119
    .line 3120
    move-result-object v13

    .line 3121
    check-cast v13, La/lok0;

    .line 3122
    .line 3123
    iget v13, v13, La/lok0;->a:I

    .line 3124
    .line 3125
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3126
    .line 3127
    .line 3128
    move-result-object v13

    .line 3129
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3130
    .line 3131
    .line 3132
    goto :goto_44

    .line 3133
    :cond_65
    if-eqz v10, :cond_66

    .line 3134
    .line 3135
    iget-boolean v12, v10, La/lok0;->n:Z

    .line 3136
    .line 3137
    move/from16 v32, v12

    .line 3138
    .line 3139
    goto :goto_45

    .line 3140
    :cond_66
    const/16 v32, 0x0

    .line 3141
    .line 3142
    :goto_45
    if-eqz v10, :cond_67

    .line 3143
    .line 3144
    iget-boolean v12, v10, La/lok0;->p:Z

    .line 3145
    .line 3146
    move/from16 v33, v12

    .line 3147
    .line 3148
    goto :goto_46

    .line 3149
    :cond_67
    const/16 v33, 0x0

    .line 3150
    .line 3151
    :goto_46
    invoke-static {v7}, La/fxb;->A(La/d0t;)La/m5l0;

    .line 3152
    .line 3153
    .line 3154
    move-result-object v25

    .line 3155
    if-eqz v10, :cond_68

    .line 3156
    .line 3157
    iget-object v10, v10, La/lok0;->u:Ljava/lang/String;

    .line 3158
    .line 3159
    goto :goto_47

    .line 3160
    :cond_68
    const/4 v10, 0x0

    .line 3161
    :goto_47
    if-nez v10, :cond_69

    .line 3162
    .line 3163
    move-object/from16 v27, v19

    .line 3164
    .line 3165
    :goto_48
    const/4 v10, 0x0

    .line 3166
    goto :goto_49

    .line 3167
    :cond_69
    move-object/from16 v27, v10

    .line 3168
    .line 3169
    goto :goto_48

    .line 3170
    :goto_49
    new-array v12, v10, [Ljava/lang/Object;

    .line 3171
    .line 3172
    iget-object v13, v4, La/ctf0;->b:La/lsm0;

    .line 3173
    .line 3174
    invoke-static {v12, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3175
    .line 3176
    .line 3177
    move-result-object v12

    .line 3178
    const v10, 0x7f1316d0

    .line 3179
    .line 3180
    .line 3181
    invoke-virtual {v13, v10, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3182
    .line 3183
    .line 3184
    move-result-object v12

    .line 3185
    iget-wide v13, v7, La/d0t;->a:J

    .line 3186
    .line 3187
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3188
    .line 3189
    .line 3190
    move-result-object v13

    .line 3191
    invoke-interface {v8, v13}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 3192
    .line 3193
    .line 3194
    move-result v13

    .line 3195
    if-eqz v13, :cond_6a

    .line 3196
    .line 3197
    goto :goto_4a

    .line 3198
    :cond_6a
    const/4 v12, 0x0

    .line 3199
    :goto_4a
    if-nez v12, :cond_6b

    .line 3200
    .line 3201
    move-object/from16 v28, v19

    .line 3202
    .line 3203
    :goto_4b
    move-object/from16 v24, v4

    .line 3204
    .line 3205
    move-object/from16 v23, v7

    .line 3206
    .line 3207
    move-object/from16 v26, v9

    .line 3208
    .line 3209
    move-object/from16 v29, v11

    .line 3210
    .line 3211
    goto :goto_4c

    .line 3212
    :cond_6b
    move-object/from16 v28, v12

    .line 3213
    .line 3214
    goto :goto_4b

    .line 3215
    :goto_4c
    invoke-static/range {v22 .. v34}, La/pym0;->q(La/y78;La/d0t;La/ctf0;La/m5l0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/List;ZZZZ)La/erh;

    .line 3216
    .line 3217
    .line 3218
    move-result-object v4

    .line 3219
    move-object/from16 v7, v24

    .line 3220
    .line 3221
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3222
    .line 3223
    .line 3224
    move-object v4, v7

    .line 3225
    goto/16 :goto_42

    .line 3226
    .line 3227
    :cond_6c
    move-object v7, v4

    .line 3228
    new-instance v0, La/vvp;

    .line 3229
    .line 3230
    const/4 v10, 0x0

    .line 3231
    new-array v1, v10, [Ljava/lang/Object;

    .line 3232
    .line 3233
    iget-object v4, v7, La/ctf0;->b:La/lsm0;

    .line 3234
    .line 3235
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3236
    .line 3237
    .line 3238
    move-result-object v1

    .line 3239
    const v5, 0x7f131706

    .line 3240
    .line 3241
    .line 3242
    invoke-virtual {v4, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3243
    .line 3244
    .line 3245
    move-result-object v23

    .line 3246
    sget-object v1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 3247
    .line 3248
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 3249
    .line 3250
    .line 3251
    move-result-wide v4

    .line 3252
    new-instance v1, La/njm;

    .line 3253
    .line 3254
    const/16 v8, 0x7f

    .line 3255
    .line 3256
    invoke-direct {v1, v8}, La/njm;-><init>(I)V

    .line 3257
    .line 3258
    .line 3259
    new-instance v22, La/hjm;

    .line 3260
    .line 3261
    new-instance v7, La/y3d;

    .line 3262
    .line 3263
    invoke-direct {v7, v4, v5}, La/y3d;-><init>(J)V

    .line 3264
    .line 3265
    .line 3266
    const/16 v34, 0x0

    .line 3267
    .line 3268
    const/16 v35, 0x1ff8

    .line 3269
    .line 3270
    const/16 v26, 0x0

    .line 3271
    .line 3272
    const/16 v27, 0x0

    .line 3273
    .line 3274
    const/16 v28, 0x0

    .line 3275
    .line 3276
    const/16 v29, 0x0

    .line 3277
    .line 3278
    const/16 v30, 0x0

    .line 3279
    .line 3280
    const/16 v31, 0x0

    .line 3281
    .line 3282
    const/16 v32, 0x0

    .line 3283
    .line 3284
    const/16 v33, 0x0

    .line 3285
    .line 3286
    move-object/from16 v24, v1

    .line 3287
    .line 3288
    move-object/from16 v25, v7

    .line 3289
    .line 3290
    invoke-direct/range {v22 .. v35}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 3291
    .line 3292
    .line 3293
    move-object/from16 v1, v22

    .line 3294
    .line 3295
    const-string v4, "HEADER_UPCOMING_FIGHTS"

    .line 3296
    .line 3297
    invoke-direct {v0, v1, v4}, La/vvp;-><init>(La/hjm;Ljava/lang/String;)V

    .line 3298
    .line 3299
    .line 3300
    new-instance v1, La/q4t0;

    .line 3301
    .line 3302
    sget-object v4, La/y3t0;->a:La/y3t0;

    .line 3303
    .line 3304
    invoke-static {v2, v3}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 3305
    .line 3306
    .line 3307
    move-result-object v2

    .line 3308
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3309
    .line 3310
    .line 3311
    move-result-object v2

    .line 3312
    const-string v3, "UPCOMING_FIGHTS"

    .line 3313
    .line 3314
    invoke-direct {v1, v3, v4, v2, v6}, La/q4t0;-><init>(Ljava/lang/String;La/y3t0;La/a4x;Z)V

    .line 3315
    .line 3316
    .line 3317
    const/4 v9, 0x2

    .line 3318
    new-array v2, v9, [La/p6t0;

    .line 3319
    .line 3320
    const/4 v10, 0x0

    .line 3321
    aput-object v0, v2, v10

    .line 3322
    .line 3323
    const/16 v21, 0x1

    .line 3324
    .line 3325
    aput-object v1, v2, v21

    .line 3326
    .line 3327
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 3328
    .line 3329
    .line 3330
    move-result-object v0

    .line 3331
    goto/16 :goto_36

    .line 3332
    .line 3333
    :cond_6d
    const/4 v7, 0x0

    .line 3334
    :goto_4d
    if-nez v7, :cond_6e

    .line 3335
    .line 3336
    sget-object v7, La/iun;->a:La/iun;

    .line 3337
    .line 3338
    :cond_6e
    return-object v7

    .line 3339
    :pswitch_3
    move-object/from16 v1, p1

    .line 3340
    .line 3341
    check-cast v1, La/mxp;

    .line 3342
    .line 3343
    iget-object v0, v0, La/syp;->i:Ljava/lang/Object;

    .line 3344
    .line 3345
    check-cast v0, La/ctf0;

    .line 3346
    .line 3347
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3348
    .line 3349
    .line 3350
    if-eqz v1, :cond_73

    .line 3351
    .line 3352
    iget v2, v1, La/mxp;->p:I

    .line 3353
    .line 3354
    iget-object v4, v1, La/mxp;->m:Ljava/lang/String;

    .line 3355
    .line 3356
    new-instance v5, La/nyp;

    .line 3357
    .line 3358
    new-instance v6, La/n9m;

    .line 3359
    .line 3360
    iget-object v7, v1, La/mxp;->c:Ljava/lang/String;

    .line 3361
    .line 3362
    new-instance v8, La/n0x;

    .line 3363
    .line 3364
    iget-object v9, v1, La/mxp;->o:Ljava/lang/String;

    .line 3365
    .line 3366
    invoke-direct {v8, v9}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 3367
    .line 3368
    .line 3369
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3370
    .line 3371
    .line 3372
    move-result-object v9

    .line 3373
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 3374
    .line 3375
    .line 3376
    move-result v10

    .line 3377
    if-lez v10, :cond_6f

    .line 3378
    .line 3379
    new-instance v10, La/r2m;

    .line 3380
    .line 3381
    new-instance v11, La/t6n;

    .line 3382
    .line 3383
    sget-object v12, La/d4d;->Q1:La/d4d;

    .line 3384
    .line 3385
    sget-object v13, La/w6n;->k:La/w6n;

    .line 3386
    .line 3387
    new-instance v14, La/c280;

    .line 3388
    .line 3389
    const v15, 0x7f08082c

    .line 3390
    .line 3391
    .line 3392
    invoke-direct {v14, v4, v15}, La/c280;-><init>(Ljava/lang/String;I)V

    .line 3393
    .line 3394
    .line 3395
    invoke-direct {v11, v12, v13, v14}, La/t6n;-><init>(La/d4d;La/w6n;La/c280;)V

    .line 3396
    .line 3397
    .line 3398
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 3399
    .line 3400
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 3401
    .line 3402
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 3403
    .line 3404
    .line 3405
    move-result-wide v12

    .line 3406
    new-instance v14, La/y3d;

    .line 3407
    .line 3408
    invoke-direct {v14, v12, v13}, La/y3d;-><init>(J)V

    .line 3409
    .line 3410
    .line 3411
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 3412
    .line 3413
    .line 3414
    move-result-wide v12

    .line 3415
    new-instance v4, La/y3d;

    .line 3416
    .line 3417
    invoke-direct {v4, v12, v13}, La/y3d;-><init>(J)V

    .line 3418
    .line 3419
    .line 3420
    const-string v12, "BADGE_LOGO_ID"

    .line 3421
    .line 3422
    invoke-direct {v10, v12, v11, v14, v4}, La/r2m;-><init>(Ljava/lang/String;La/v6n;La/y3d;La/y3d;)V

    .line 3423
    .line 3424
    .line 3425
    invoke-virtual {v9, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3426
    .line 3427
    .line 3428
    :cond_6f
    iget-object v4, v1, La/mxp;->g:La/f7v0;

    .line 3429
    .line 3430
    sget-object v10, La/f7v0;->a:La/f7v0;

    .line 3431
    .line 3432
    if-eq v4, v10, :cond_70

    .line 3433
    .line 3434
    new-instance v10, La/q2m;

    .line 3435
    .line 3436
    invoke-static {v4, v0}, La/tnq0;->r(La/f7v0;La/ctf0;)Ljava/lang/String;

    .line 3437
    .line 3438
    .line 3439
    move-result-object v4

    .line 3440
    sget-object v11, La/s6t0;->a:La/pz40;

    .line 3441
    .line 3442
    sget-object v11, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 3443
    .line 3444
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 3445
    .line 3446
    .line 3447
    move-result-wide v12

    .line 3448
    new-instance v14, La/y3d;

    .line 3449
    .line 3450
    invoke-direct {v14, v12, v13}, La/y3d;-><init>(J)V

    .line 3451
    .line 3452
    .line 3453
    invoke-virtual {v11}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 3454
    .line 3455
    .line 3456
    move-result-wide v11

    .line 3457
    new-instance v13, La/y3d;

    .line 3458
    .line 3459
    invoke-direct {v13, v11, v12}, La/y3d;-><init>(J)V

    .line 3460
    .line 3461
    .line 3462
    invoke-direct {v10, v4, v14, v13}, La/q2m;-><init>(Ljava/lang/String;La/y3d;La/y3d;)V

    .line 3463
    .line 3464
    .line 3465
    invoke-virtual {v9, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3466
    .line 3467
    .line 3468
    :cond_70
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3469
    .line 3470
    .line 3471
    move-result-object v4

    .line 3472
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3473
    .line 3474
    .line 3475
    move-result-object v4

    .line 3476
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 3477
    .line 3478
    .line 3479
    move-result-object v9

    .line 3480
    iget v10, v1, La/mxp;->f:I

    .line 3481
    .line 3482
    iget v11, v1, La/mxp;->r:I

    .line 3483
    .line 3484
    iget v1, v1, La/mxp;->q:I

    .line 3485
    .line 3486
    if-ltz v2, :cond_71

    .line 3487
    .line 3488
    if-ltz v1, :cond_71

    .line 3489
    .line 3490
    if-ltz v11, :cond_71

    .line 3491
    .line 3492
    new-instance v12, La/m9m;

    .line 3493
    .line 3494
    const/4 v13, 0x0

    .line 3495
    new-array v14, v13, [Ljava/lang/Object;

    .line 3496
    .line 3497
    iget-object v15, v0, La/ctf0;->b:La/lsm0;

    .line 3498
    .line 3499
    invoke-static {v14, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3500
    .line 3501
    .line 3502
    move-result-object v14

    .line 3503
    const v13, 0x7f1316e8

    .line 3504
    .line 3505
    .line 3506
    invoke-virtual {v15, v13, v14}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3507
    .line 3508
    .line 3509
    move-result-object v13

    .line 3510
    new-instance v14, Ljava/lang/StringBuilder;

    .line 3511
    .line 3512
    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    .line 3513
    .line 3514
    .line 3515
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3516
    .line 3517
    .line 3518
    const-string v2, "-"

    .line 3519
    .line 3520
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3521
    .line 3522
    .line 3523
    invoke-virtual {v14, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3524
    .line 3525
    .line 3526
    invoke-virtual {v14, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 3527
    .line 3528
    .line 3529
    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 3530
    .line 3531
    .line 3532
    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 3533
    .line 3534
    .line 3535
    move-result-object v1

    .line 3536
    const/4 v2, 0x1

    .line 3537
    invoke-direct {v12, v2, v13, v1}, La/m9m;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 3538
    .line 3539
    .line 3540
    invoke-virtual {v9, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3541
    .line 3542
    .line 3543
    :cond_71
    if-ltz v10, :cond_72

    .line 3544
    .line 3545
    new-instance v1, La/m9m;

    .line 3546
    .line 3547
    const/4 v11, 0x0

    .line 3548
    new-array v2, v11, [Ljava/lang/Object;

    .line 3549
    .line 3550
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 3551
    .line 3552
    invoke-static {v2, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 3553
    .line 3554
    .line 3555
    move-result-object v2

    .line 3556
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 3557
    .line 3558
    .line 3559
    move-result-object v0

    .line 3560
    invoke-static {v10}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 3561
    .line 3562
    .line 3563
    move-result-object v2

    .line 3564
    const/4 v11, 0x2

    .line 3565
    invoke-direct {v1, v11, v0, v2}, La/m9m;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 3566
    .line 3567
    .line 3568
    invoke-virtual {v9, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 3569
    .line 3570
    .line 3571
    :cond_72
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 3572
    .line 3573
    .line 3574
    move-result-object v0

    .line 3575
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 3576
    .line 3577
    .line 3578
    move-result-object v0

    .line 3579
    invoke-direct {v6, v7, v8, v4, v0}, La/n9m;-><init>(Ljava/lang/String;La/n0x;La/a4x;La/a4x;)V

    .line 3580
    .line 3581
    .line 3582
    invoke-direct {v5, v6}, La/nyp;-><init>(La/n9m;)V

    .line 3583
    .line 3584
    .line 3585
    goto :goto_4e

    .line 3586
    :cond_73
    sget-object v5, La/oyp;->a:La/oyp;

    .line 3587
    .line 3588
    :goto_4e
    return-object v5

    .line 3589
    :pswitch_4
    move-object/from16 v1, p1

    .line 3590
    .line 3591
    check-cast v1, La/lel0;

    .line 3592
    .line 3593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3594
    .line 3595
    .line 3596
    iget-object v0, v0, La/syp;->i:Ljava/lang/Object;

    .line 3597
    .line 3598
    check-cast v0, La/ctf0;

    .line 3599
    .line 3600
    invoke-virtual {v0}, La/ctf0;->j()Z

    .line 3601
    .line 3602
    .line 3603
    move-result v0

    .line 3604
    if-eqz v0, :cond_74

    .line 3605
    .line 3606
    iget-object v0, v1, La/lel0;->r:Ljava/lang/String;

    .line 3607
    .line 3608
    goto :goto_4f

    .line 3609
    :cond_74
    iget-object v0, v1, La/lel0;->q:Ljava/lang/String;

    .line 3610
    .line 3611
    :goto_4f
    return-object v0

    .line 3612
    nop

    .line 3613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
