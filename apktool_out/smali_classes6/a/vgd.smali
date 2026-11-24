.class public final synthetic La/vgd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/vgd;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/vgd;->a:B

    .line 4
    .line 5
    const/high16 v1, 0x1c00000

    .line 6
    .line 7
    const/high16 v2, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/16 v3, 0x492

    .line 10
    .line 11
    const/4 v4, 0x4

    .line 12
    const/16 v5, 0x80

    .line 13
    .line 14
    const/16 v6, 0x100

    .line 15
    .line 16
    const/16 v7, 0x10

    .line 17
    .line 18
    const/16 v8, 0x20

    .line 19
    .line 20
    const/4 v9, 0x2

    .line 21
    const/4 v10, 0x0

    .line 22
    const/4 v11, 0x1

    .line 23
    packed-switch v0, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, Landroid/content/Context;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 33
    .line 34
    move-object/from16 v2, p3

    .line 35
    .line 36
    check-cast v2, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    move-object/from16 v3, p4

    .line 43
    .line 44
    check-cast v3, Ljava/lang/CharSequence;

    .line 45
    .line 46
    move-object/from16 v4, p5

    .line 47
    .line 48
    check-cast v4, La/o9q0;

    .line 49
    .line 50
    iget-wide v4, v4, La/o9q0;->a:J

    .line 51
    .line 52
    invoke-static {v4, v5}, La/o9q0;->f(J)I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    invoke-static {v4, v5}, La/o9q0;->e(J)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-interface {v3, v6, v4}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    new-instance v4, Landroid/content/Intent;

    .line 69
    .line 70
    invoke-direct {v4}, Landroid/content/Intent;-><init>()V

    .line 71
    .line 72
    .line 73
    const-string v5, "android.intent.action.PROCESS_TEXT"

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    const-string v5, "text/plain"

    .line 80
    .line 81
    invoke-virtual {v4, v5}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    const-string v5, "android.intent.extra.PROCESS_TEXT_READONLY"

    .line 86
    .line 87
    invoke-virtual {v4, v5, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 92
    .line 93
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v2, v4, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    const-string v2, "android.intent.extra.PROCESS_TEXT"

    .line 102
    .line 103
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 107
    .line 108
    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object v0

    .line 112
    :pswitch_0
    move-object/from16 v0, p1

    .line 113
    .line 114
    check-cast v0, La/g5q0;

    .line 115
    .line 116
    move-object/from16 v1, p2

    .line 117
    .line 118
    check-cast v1, La/v4q0;

    .line 119
    .line 120
    move-object/from16 v2, p3

    .line 121
    .line 122
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 123
    .line 124
    move-object/from16 v12, p4

    .line 125
    .line 126
    check-cast v12, La/fet;

    .line 127
    .line 128
    move-object/from16 v13, p5

    .line 129
    .line 130
    check-cast v13, Ljava/lang/Integer;

    .line 131
    .line 132
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 133
    .line 134
    .line 135
    move-result v13

    .line 136
    and-int/lit8 v14, v13, 0x6

    .line 137
    .line 138
    if-nez v14, :cond_2

    .line 139
    .line 140
    and-int/lit8 v14, v13, 0x8

    .line 141
    .line 142
    if-nez v14, :cond_0

    .line 143
    .line 144
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v14

    .line 148
    goto :goto_0

    .line 149
    :cond_0
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    move-result v14

    .line 153
    :goto_0
    if-eqz v14, :cond_1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_1
    move v4, v9

    .line 157
    :goto_1
    or-int/2addr v4, v13

    .line 158
    goto :goto_2

    .line 159
    :cond_2
    move v4, v13

    .line 160
    :goto_2
    and-int/lit8 v9, v13, 0x30

    .line 161
    .line 162
    if-nez v9, :cond_5

    .line 163
    .line 164
    and-int/lit8 v9, v13, 0x40

    .line 165
    .line 166
    if-nez v9, :cond_3

    .line 167
    .line 168
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    goto :goto_3

    .line 173
    :cond_3
    invoke-virtual {v12, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 174
    .line 175
    .line 176
    move-result v9

    .line 177
    :goto_3
    if-eqz v9, :cond_4

    .line 178
    .line 179
    move v7, v8

    .line 180
    :cond_4
    or-int/2addr v4, v7

    .line 181
    :cond_5
    and-int/lit16 v7, v13, 0x180

    .line 182
    .line 183
    if-nez v7, :cond_7

    .line 184
    .line 185
    invoke-virtual {v12, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    move-result v7

    .line 189
    if-eqz v7, :cond_6

    .line 190
    .line 191
    move v5, v6

    .line 192
    :cond_6
    or-int/2addr v4, v5

    .line 193
    :cond_7
    and-int/lit16 v5, v4, 0x493

    .line 194
    .line 195
    if-eq v5, v3, :cond_8

    .line 196
    .line 197
    move v10, v11

    .line 198
    :cond_8
    and-int/lit8 v3, v4, 0x1

    .line 199
    .line 200
    invoke-virtual {v12, v3, v10}, La/fet;->U(IZ)Z

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    if-eqz v3, :cond_9

    .line 205
    .line 206
    and-int/lit16 v3, v4, 0x3fe

    .line 207
    .line 208
    invoke-static {v0, v1, v2, v12, v3}, La/xxj;->c(La/g5q0;La/v4q0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 209
    .line 210
    .line 211
    goto :goto_4

    .line 212
    :cond_9
    invoke-virtual {v12}, La/fet;->X()V

    .line 213
    .line 214
    .line 215
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_1
    move-object/from16 v0, p1

    .line 219
    .line 220
    check-cast v0, La/g5q0;

    .line 221
    .line 222
    move-object/from16 v1, p2

    .line 223
    .line 224
    check-cast v1, La/v4q0;

    .line 225
    .line 226
    move-object/from16 v2, p3

    .line 227
    .line 228
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 229
    .line 230
    move-object/from16 v12, p4

    .line 231
    .line 232
    check-cast v12, La/fet;

    .line 233
    .line 234
    move-object/from16 v13, p5

    .line 235
    .line 236
    check-cast v13, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 239
    .line 240
    .line 241
    move-result v13

    .line 242
    and-int/lit8 v14, v13, 0x6

    .line 243
    .line 244
    if-nez v14, :cond_c

    .line 245
    .line 246
    and-int/lit8 v14, v13, 0x8

    .line 247
    .line 248
    if-nez v14, :cond_a

    .line 249
    .line 250
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v14

    .line 254
    goto :goto_5

    .line 255
    :cond_a
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v14

    .line 259
    :goto_5
    if-eqz v14, :cond_b

    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_b
    move v4, v9

    .line 263
    :goto_6
    or-int/2addr v4, v13

    .line 264
    goto :goto_7

    .line 265
    :cond_c
    move v4, v13

    .line 266
    :goto_7
    and-int/lit8 v9, v13, 0x30

    .line 267
    .line 268
    if-nez v9, :cond_f

    .line 269
    .line 270
    and-int/lit8 v9, v13, 0x40

    .line 271
    .line 272
    if-nez v9, :cond_d

    .line 273
    .line 274
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v9

    .line 278
    goto :goto_8

    .line 279
    :cond_d
    invoke-virtual {v12, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v9

    .line 283
    :goto_8
    if-eqz v9, :cond_e

    .line 284
    .line 285
    move v7, v8

    .line 286
    :cond_e
    or-int/2addr v4, v7

    .line 287
    :cond_f
    and-int/lit16 v7, v13, 0x180

    .line 288
    .line 289
    if-nez v7, :cond_11

    .line 290
    .line 291
    invoke-virtual {v12, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v7

    .line 295
    if-eqz v7, :cond_10

    .line 296
    .line 297
    move v5, v6

    .line 298
    :cond_10
    or-int/2addr v4, v5

    .line 299
    :cond_11
    and-int/lit16 v5, v4, 0x493

    .line 300
    .line 301
    if-eq v5, v3, :cond_12

    .line 302
    .line 303
    move v10, v11

    .line 304
    :cond_12
    and-int/lit8 v3, v4, 0x1

    .line 305
    .line 306
    invoke-virtual {v12, v3, v10}, La/fet;->U(IZ)Z

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    if-eqz v3, :cond_13

    .line 311
    .line 312
    and-int/lit16 v3, v4, 0x3fe

    .line 313
    .line 314
    invoke-static {v0, v1, v2, v12, v3}, La/xxj;->c(La/g5q0;La/v4q0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_13
    invoke-virtual {v12}, La/fet;->X()V

    .line 319
    .line 320
    .line 321
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_2
    move-object/from16 v0, p1

    .line 325
    .line 326
    check-cast v0, La/mm40;

    .line 327
    .line 328
    move-object/from16 v12, p2

    .line 329
    .line 330
    check-cast v12, Ljava/lang/String;

    .line 331
    .line 332
    move-object/from16 v13, p3

    .line 333
    .line 334
    check-cast v13, La/y9q0;

    .line 335
    .line 336
    move-object/from16 v14, p4

    .line 337
    .line 338
    check-cast v14, La/fet;

    .line 339
    .line 340
    move-object/from16 v15, p5

    .line 341
    .line 342
    check-cast v15, Ljava/lang/Integer;

    .line 343
    .line 344
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 345
    .line 346
    .line 347
    move-result v15

    .line 348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    and-int/lit8 v16, v15, 0x6

    .line 358
    .line 359
    if-nez v16, :cond_15

    .line 360
    .line 361
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v16

    .line 365
    if-eqz v16, :cond_14

    .line 366
    .line 367
    goto :goto_a

    .line 368
    :cond_14
    move v4, v9

    .line 369
    :goto_a
    or-int/2addr v4, v15

    .line 370
    goto :goto_b

    .line 371
    :cond_15
    move v4, v15

    .line 372
    :goto_b
    and-int/lit8 v9, v15, 0x30

    .line 373
    .line 374
    if-nez v9, :cond_17

    .line 375
    .line 376
    invoke-virtual {v14, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    move-result v9

    .line 380
    if-eqz v9, :cond_16

    .line 381
    .line 382
    move v7, v8

    .line 383
    :cond_16
    or-int/2addr v4, v7

    .line 384
    :cond_17
    and-int/lit16 v7, v15, 0x180

    .line 385
    .line 386
    if-nez v7, :cond_19

    .line 387
    .line 388
    invoke-virtual {v14, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    move-result v7

    .line 392
    if-eqz v7, :cond_18

    .line 393
    .line 394
    move v5, v6

    .line 395
    :cond_18
    or-int/2addr v4, v5

    .line 396
    :cond_19
    and-int/lit16 v5, v4, 0x493

    .line 397
    .line 398
    if-eq v5, v3, :cond_1a

    .line 399
    .line 400
    move v10, v11

    .line 401
    :cond_1a
    and-int/lit8 v3, v4, 0x1

    .line 402
    .line 403
    invoke-virtual {v14, v3, v10}, La/fet;->U(IZ)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-eqz v3, :cond_1b

    .line 408
    .line 409
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 414
    .line 415
    invoke-virtual {v14, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v2

    .line 419
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 420
    .line 421
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 422
    .line 423
    .line 424
    move-result-wide v2

    .line 425
    shr-int/lit8 v5, v4, 0x3

    .line 426
    .line 427
    and-int/lit8 v34, v5, 0xe

    .line 428
    .line 429
    shl-int/lit8 v4, v4, 0xf

    .line 430
    .line 431
    and-int v35, v4, v1

    .line 432
    .line 433
    const v36, 0x1fff8

    .line 434
    .line 435
    .line 436
    const/16 v16, 0x0

    .line 437
    .line 438
    const-wide/16 v17, 0x0

    .line 439
    .line 440
    const/16 v19, 0x0

    .line 441
    .line 442
    const/16 v20, 0x0

    .line 443
    .line 444
    const/16 v21, 0x0

    .line 445
    .line 446
    const-wide/16 v22, 0x0

    .line 447
    .line 448
    const/16 v24, 0x0

    .line 449
    .line 450
    const-wide/16 v25, 0x0

    .line 451
    .line 452
    const/16 v27, 0x0

    .line 453
    .line 454
    const/16 v28, 0x0

    .line 455
    .line 456
    const/16 v29, 0x0

    .line 457
    .line 458
    const/16 v30, 0x0

    .line 459
    .line 460
    const/16 v31, 0x0

    .line 461
    .line 462
    move-object/from16 v32, v13

    .line 463
    .line 464
    move-object/from16 v33, v14

    .line 465
    .line 466
    move-object v13, v0

    .line 467
    move-wide v14, v2

    .line 468
    invoke-static/range {v12 .. v36}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 469
    .line 470
    .line 471
    goto :goto_c

    .line 472
    :cond_1b
    move-object/from16 v33, v14

    .line 473
    .line 474
    invoke-virtual/range {v33 .. v33}, La/fet;->X()V

    .line 475
    .line 476
    .line 477
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object v0

    .line 480
    :pswitch_3
    move-object/from16 v0, p1

    .line 481
    .line 482
    check-cast v0, La/mm40;

    .line 483
    .line 484
    move-object/from16 v12, p2

    .line 485
    .line 486
    check-cast v12, Ljava/lang/String;

    .line 487
    .line 488
    move-object/from16 v13, p3

    .line 489
    .line 490
    check-cast v13, La/y9q0;

    .line 491
    .line 492
    move-object/from16 v14, p4

    .line 493
    .line 494
    check-cast v14, La/fet;

    .line 495
    .line 496
    move-object/from16 v15, p5

    .line 497
    .line 498
    check-cast v15, Ljava/lang/Integer;

    .line 499
    .line 500
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 501
    .line 502
    .line 503
    move-result v15

    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    and-int/lit8 v16, v15, 0x6

    .line 514
    .line 515
    if-nez v16, :cond_1d

    .line 516
    .line 517
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v16

    .line 521
    if-eqz v16, :cond_1c

    .line 522
    .line 523
    goto :goto_d

    .line 524
    :cond_1c
    move v4, v9

    .line 525
    :goto_d
    or-int/2addr v4, v15

    .line 526
    goto :goto_e

    .line 527
    :cond_1d
    move v4, v15

    .line 528
    :goto_e
    and-int/lit8 v9, v15, 0x30

    .line 529
    .line 530
    if-nez v9, :cond_1f

    .line 531
    .line 532
    invoke-virtual {v14, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v9

    .line 536
    if-eqz v9, :cond_1e

    .line 537
    .line 538
    move v7, v8

    .line 539
    :cond_1e
    or-int/2addr v4, v7

    .line 540
    :cond_1f
    and-int/lit16 v7, v15, 0x180

    .line 541
    .line 542
    if-nez v7, :cond_21

    .line 543
    .line 544
    invoke-virtual {v14, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 545
    .line 546
    .line 547
    move-result v7

    .line 548
    if-eqz v7, :cond_20

    .line 549
    .line 550
    move v5, v6

    .line 551
    :cond_20
    or-int/2addr v4, v5

    .line 552
    :cond_21
    and-int/lit16 v5, v4, 0x493

    .line 553
    .line 554
    if-eq v5, v3, :cond_22

    .line 555
    .line 556
    move v10, v11

    .line 557
    :cond_22
    and-int/lit8 v3, v4, 0x1

    .line 558
    .line 559
    invoke-virtual {v14, v3, v10}, La/fet;->U(IZ)Z

    .line 560
    .line 561
    .line 562
    move-result v3

    .line 563
    if-eqz v3, :cond_23

    .line 564
    .line 565
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 570
    .line 571
    invoke-virtual {v14, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 576
    .line 577
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 578
    .line 579
    .line 580
    move-result-wide v2

    .line 581
    shr-int/lit8 v5, v4, 0x3

    .line 582
    .line 583
    and-int/lit8 v34, v5, 0xe

    .line 584
    .line 585
    shl-int/lit8 v4, v4, 0xf

    .line 586
    .line 587
    and-int v35, v4, v1

    .line 588
    .line 589
    const v36, 0x1fff8

    .line 590
    .line 591
    .line 592
    const/16 v16, 0x0

    .line 593
    .line 594
    const-wide/16 v17, 0x0

    .line 595
    .line 596
    const/16 v19, 0x0

    .line 597
    .line 598
    const/16 v20, 0x0

    .line 599
    .line 600
    const/16 v21, 0x0

    .line 601
    .line 602
    const-wide/16 v22, 0x0

    .line 603
    .line 604
    const/16 v24, 0x0

    .line 605
    .line 606
    const-wide/16 v25, 0x0

    .line 607
    .line 608
    const/16 v27, 0x0

    .line 609
    .line 610
    const/16 v28, 0x0

    .line 611
    .line 612
    const/16 v29, 0x0

    .line 613
    .line 614
    const/16 v30, 0x0

    .line 615
    .line 616
    const/16 v31, 0x0

    .line 617
    .line 618
    move-object/from16 v32, v13

    .line 619
    .line 620
    move-object/from16 v33, v14

    .line 621
    .line 622
    move-object v13, v0

    .line 623
    move-wide v14, v2

    .line 624
    invoke-static/range {v12 .. v36}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 625
    .line 626
    .line 627
    goto :goto_f

    .line 628
    :cond_23
    move-object/from16 v33, v14

    .line 629
    .line 630
    invoke-virtual/range {v33 .. v33}, La/fet;->X()V

    .line 631
    .line 632
    .line 633
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_4
    move-object/from16 v0, p1

    .line 637
    .line 638
    check-cast v0, La/mm40;

    .line 639
    .line 640
    move-object/from16 v12, p2

    .line 641
    .line 642
    check-cast v12, Ljava/lang/String;

    .line 643
    .line 644
    move-object/from16 v13, p3

    .line 645
    .line 646
    check-cast v13, La/y9q0;

    .line 647
    .line 648
    move-object/from16 v14, p4

    .line 649
    .line 650
    check-cast v14, La/fet;

    .line 651
    .line 652
    move-object/from16 v15, p5

    .line 653
    .line 654
    check-cast v15, Ljava/lang/Integer;

    .line 655
    .line 656
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 657
    .line 658
    .line 659
    move-result v15

    .line 660
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 664
    .line 665
    .line 666
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    and-int/lit8 v16, v15, 0x6

    .line 670
    .line 671
    if-nez v16, :cond_25

    .line 672
    .line 673
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 674
    .line 675
    .line 676
    move-result v16

    .line 677
    if-eqz v16, :cond_24

    .line 678
    .line 679
    goto :goto_10

    .line 680
    :cond_24
    move v4, v9

    .line 681
    :goto_10
    or-int/2addr v4, v15

    .line 682
    goto :goto_11

    .line 683
    :cond_25
    move v4, v15

    .line 684
    :goto_11
    and-int/lit8 v9, v15, 0x30

    .line 685
    .line 686
    if-nez v9, :cond_27

    .line 687
    .line 688
    invoke-virtual {v14, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    move-result v9

    .line 692
    if-eqz v9, :cond_26

    .line 693
    .line 694
    move v7, v8

    .line 695
    :cond_26
    or-int/2addr v4, v7

    .line 696
    :cond_27
    and-int/lit16 v7, v15, 0x180

    .line 697
    .line 698
    if-nez v7, :cond_29

    .line 699
    .line 700
    invoke-virtual {v14, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    if-eqz v7, :cond_28

    .line 705
    .line 706
    move v5, v6

    .line 707
    :cond_28
    or-int/2addr v4, v5

    .line 708
    :cond_29
    and-int/lit16 v5, v4, 0x493

    .line 709
    .line 710
    if-eq v5, v3, :cond_2a

    .line 711
    .line 712
    move v10, v11

    .line 713
    :cond_2a
    and-int/lit8 v3, v4, 0x1

    .line 714
    .line 715
    invoke-virtual {v14, v3, v10}, La/fet;->U(IZ)Z

    .line 716
    .line 717
    .line 718
    move-result v3

    .line 719
    if-eqz v3, :cond_2b

    .line 720
    .line 721
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 726
    .line 727
    invoke-virtual {v14, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v2

    .line 731
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 732
    .line 733
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 734
    .line 735
    .line 736
    move-result-wide v2

    .line 737
    shr-int/lit8 v5, v4, 0x3

    .line 738
    .line 739
    and-int/lit8 v34, v5, 0xe

    .line 740
    .line 741
    shl-int/lit8 v4, v4, 0xf

    .line 742
    .line 743
    and-int v35, v4, v1

    .line 744
    .line 745
    const v36, 0x1fff8

    .line 746
    .line 747
    .line 748
    const/16 v16, 0x0

    .line 749
    .line 750
    const-wide/16 v17, 0x0

    .line 751
    .line 752
    const/16 v19, 0x0

    .line 753
    .line 754
    const/16 v20, 0x0

    .line 755
    .line 756
    const/16 v21, 0x0

    .line 757
    .line 758
    const-wide/16 v22, 0x0

    .line 759
    .line 760
    const/16 v24, 0x0

    .line 761
    .line 762
    const-wide/16 v25, 0x0

    .line 763
    .line 764
    const/16 v27, 0x0

    .line 765
    .line 766
    const/16 v28, 0x0

    .line 767
    .line 768
    const/16 v29, 0x0

    .line 769
    .line 770
    const/16 v30, 0x0

    .line 771
    .line 772
    const/16 v31, 0x0

    .line 773
    .line 774
    move-object/from16 v32, v13

    .line 775
    .line 776
    move-object/from16 v33, v14

    .line 777
    .line 778
    move-object v13, v0

    .line 779
    move-wide v14, v2

    .line 780
    invoke-static/range {v12 .. v36}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 781
    .line 782
    .line 783
    goto :goto_12

    .line 784
    :cond_2b
    move-object/from16 v33, v14

    .line 785
    .line 786
    invoke-virtual/range {v33 .. v33}, La/fet;->X()V

    .line 787
    .line 788
    .line 789
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 790
    .line 791
    return-object v0

    .line 792
    :pswitch_5
    move-object/from16 v0, p1

    .line 793
    .line 794
    check-cast v0, La/mm40;

    .line 795
    .line 796
    move-object/from16 v12, p2

    .line 797
    .line 798
    check-cast v12, Ljava/lang/String;

    .line 799
    .line 800
    move-object/from16 v13, p3

    .line 801
    .line 802
    check-cast v13, La/y9q0;

    .line 803
    .line 804
    move-object/from16 v14, p4

    .line 805
    .line 806
    check-cast v14, La/fet;

    .line 807
    .line 808
    move-object/from16 v15, p5

    .line 809
    .line 810
    check-cast v15, Ljava/lang/Integer;

    .line 811
    .line 812
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 813
    .line 814
    .line 815
    move-result v15

    .line 816
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 817
    .line 818
    .line 819
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 820
    .line 821
    .line 822
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    and-int/lit8 v16, v15, 0x6

    .line 826
    .line 827
    if-nez v16, :cond_2d

    .line 828
    .line 829
    invoke-virtual {v14, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 830
    .line 831
    .line 832
    move-result v16

    .line 833
    if-eqz v16, :cond_2c

    .line 834
    .line 835
    goto :goto_13

    .line 836
    :cond_2c
    move v4, v9

    .line 837
    :goto_13
    or-int/2addr v4, v15

    .line 838
    goto :goto_14

    .line 839
    :cond_2d
    move v4, v15

    .line 840
    :goto_14
    and-int/lit8 v9, v15, 0x30

    .line 841
    .line 842
    if-nez v9, :cond_2f

    .line 843
    .line 844
    invoke-virtual {v14, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    move-result v9

    .line 848
    if-eqz v9, :cond_2e

    .line 849
    .line 850
    move v7, v8

    .line 851
    :cond_2e
    or-int/2addr v4, v7

    .line 852
    :cond_2f
    and-int/lit16 v7, v15, 0x180

    .line 853
    .line 854
    if-nez v7, :cond_31

    .line 855
    .line 856
    invoke-virtual {v14, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v7

    .line 860
    if-eqz v7, :cond_30

    .line 861
    .line 862
    move v5, v6

    .line 863
    :cond_30
    or-int/2addr v4, v5

    .line 864
    :cond_31
    and-int/lit16 v5, v4, 0x493

    .line 865
    .line 866
    if-eq v5, v3, :cond_32

    .line 867
    .line 868
    move v10, v11

    .line 869
    :cond_32
    and-int/lit8 v3, v4, 0x1

    .line 870
    .line 871
    invoke-virtual {v14, v3, v10}, La/fet;->U(IZ)Z

    .line 872
    .line 873
    .line 874
    move-result v3

    .line 875
    if-eqz v3, :cond_33

    .line 876
    .line 877
    invoke-static {v0, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 878
    .line 879
    .line 880
    move-result-object v0

    .line 881
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 882
    .line 883
    invoke-virtual {v14, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 888
    .line 889
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 890
    .line 891
    .line 892
    move-result-wide v2

    .line 893
    shr-int/lit8 v5, v4, 0x3

    .line 894
    .line 895
    and-int/lit8 v34, v5, 0xe

    .line 896
    .line 897
    shl-int/lit8 v4, v4, 0xf

    .line 898
    .line 899
    and-int v35, v4, v1

    .line 900
    .line 901
    const v36, 0x1fff8

    .line 902
    .line 903
    .line 904
    const/16 v16, 0x0

    .line 905
    .line 906
    const-wide/16 v17, 0x0

    .line 907
    .line 908
    const/16 v19, 0x0

    .line 909
    .line 910
    const/16 v20, 0x0

    .line 911
    .line 912
    const/16 v21, 0x0

    .line 913
    .line 914
    const-wide/16 v22, 0x0

    .line 915
    .line 916
    const/16 v24, 0x0

    .line 917
    .line 918
    const-wide/16 v25, 0x0

    .line 919
    .line 920
    const/16 v27, 0x0

    .line 921
    .line 922
    const/16 v28, 0x0

    .line 923
    .line 924
    const/16 v29, 0x0

    .line 925
    .line 926
    const/16 v30, 0x0

    .line 927
    .line 928
    const/16 v31, 0x0

    .line 929
    .line 930
    move-object/from16 v32, v13

    .line 931
    .line 932
    move-object/from16 v33, v14

    .line 933
    .line 934
    move-object v13, v0

    .line 935
    move-wide v14, v2

    .line 936
    invoke-static/range {v12 .. v36}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 937
    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_33
    move-object/from16 v33, v14

    .line 941
    .line 942
    invoke-virtual/range {v33 .. v33}, La/fet;->X()V

    .line 943
    .line 944
    .line 945
    :goto_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 946
    .line 947
    return-object v0

    .line 948
    :pswitch_6
    move-object/from16 v0, p1

    .line 949
    .line 950
    check-cast v0, La/y5d;

    .line 951
    .line 952
    move-object/from16 v12, p2

    .line 953
    .line 954
    check-cast v12, La/mm40;

    .line 955
    .line 956
    move-object/from16 v1, p3

    .line 957
    .line 958
    check-cast v1, La/qal0;

    .line 959
    .line 960
    move-object/from16 v2, p4

    .line 961
    .line 962
    check-cast v2, La/fet;

    .line 963
    .line 964
    move-object/from16 v3, p5

    .line 965
    .line 966
    check-cast v3, Ljava/lang/Integer;

    .line 967
    .line 968
    invoke-static {v3, v0, v12}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 969
    .line 970
    .line 971
    move-result v0

    .line 972
    and-int/lit8 v3, v0, 0x30

    .line 973
    .line 974
    if-nez v3, :cond_35

    .line 975
    .line 976
    invoke-virtual {v2, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v3

    .line 980
    if-eqz v3, :cond_34

    .line 981
    .line 982
    move v7, v8

    .line 983
    :cond_34
    or-int v3, v0, v7

    .line 984
    .line 985
    goto :goto_16

    .line 986
    :cond_35
    move v3, v0

    .line 987
    :goto_16
    and-int/lit16 v4, v0, 0x180

    .line 988
    .line 989
    if-nez v4, :cond_38

    .line 990
    .line 991
    and-int/lit16 v0, v0, 0x200

    .line 992
    .line 993
    if-nez v0, :cond_36

    .line 994
    .line 995
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 996
    .line 997
    .line 998
    move-result v0

    .line 999
    goto :goto_17

    .line 1000
    :cond_36
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v0

    .line 1004
    :goto_17
    if-eqz v0, :cond_37

    .line 1005
    .line 1006
    move v5, v6

    .line 1007
    :cond_37
    or-int/2addr v3, v5

    .line 1008
    :cond_38
    and-int/lit16 v0, v3, 0x491

    .line 1009
    .line 1010
    const/16 v4, 0x490

    .line 1011
    .line 1012
    if-eq v0, v4, :cond_39

    .line 1013
    .line 1014
    move v0, v11

    .line 1015
    goto :goto_18

    .line 1016
    :cond_39
    move v0, v10

    .line 1017
    :goto_18
    and-int/lit8 v4, v3, 0x1

    .line 1018
    .line 1019
    invoke-virtual {v2, v4, v0}, La/fet;->U(IZ)Z

    .line 1020
    .line 1021
    .line 1022
    move-result v0

    .line 1023
    if-eqz v0, :cond_3b

    .line 1024
    .line 1025
    if-nez v1, :cond_3a

    .line 1026
    .line 1027
    const v0, -0xba51587

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1031
    .line 1032
    .line 1033
    invoke-virtual {v2, v10}, La/fet;->r(Z)V

    .line 1034
    .line 1035
    .line 1036
    goto :goto_19

    .line 1037
    :cond_3a
    const v0, -0xba51586

    .line 1038
    .line 1039
    .line 1040
    invoke-virtual {v2, v0}, La/fet;->e0(I)V

    .line 1041
    .line 1042
    .line 1043
    new-instance v0, La/ygd;

    .line 1044
    .line 1045
    invoke-direct {v0, v1, v10}, La/ygd;-><init>(La/qal0;B)V

    .line 1046
    .line 1047
    .line 1048
    const v4, 0x353b8c49

    .line 1049
    .line 1050
    .line 1051
    invoke-static {v4, v0, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v13

    .line 1055
    new-instance v0, La/ygd;

    .line 1056
    .line 1057
    invoke-direct {v0, v1, v11}, La/ygd;-><init>(La/qal0;B)V

    .line 1058
    .line 1059
    .line 1060
    const v4, 0x1dac6190

    .line 1061
    .line 1062
    .line 1063
    invoke-static {v4, v0, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v14

    .line 1067
    new-instance v0, La/ygd;

    .line 1068
    .line 1069
    invoke-direct {v0, v1, v9}, La/ygd;-><init>(La/qal0;B)V

    .line 1070
    .line 1071
    .line 1072
    const v4, 0x57fcc9ef

    .line 1073
    .line 1074
    .line 1075
    invoke-static {v4, v0, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v15

    .line 1079
    new-instance v0, La/ygd;

    .line 1080
    .line 1081
    const/4 v4, 0x3

    .line 1082
    invoke-direct {v0, v1, v4}, La/ygd;-><init>(La/qal0;B)V

    .line 1083
    .line 1084
    .line 1085
    const v1, -0x6db2cdb2

    .line 1086
    .line 1087
    .line 1088
    invoke-static {v1, v0, v2}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v16

    .line 1092
    shr-int/lit8 v0, v3, 0x3

    .line 1093
    .line 1094
    and-int/lit8 v0, v0, 0xe

    .line 1095
    .line 1096
    or-int/lit16 v0, v0, 0x6db0

    .line 1097
    .line 1098
    move/from16 v18, v0

    .line 1099
    .line 1100
    move-object/from16 v17, v2

    .line 1101
    .line 1102
    invoke-static/range {v12 .. v18}, La/z1x;->f(La/mm40;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 1103
    .line 1104
    .line 1105
    move-object/from16 v0, v17

    .line 1106
    .line 1107
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 1108
    .line 1109
    .line 1110
    goto :goto_19

    .line 1111
    :cond_3b
    move-object v0, v2

    .line 1112
    invoke-virtual {v0}, La/fet;->X()V

    .line 1113
    .line 1114
    .line 1115
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1116
    .line 1117
    return-object v0

    .line 1118
    :pswitch_7
    move-object/from16 v0, p1

    .line 1119
    .line 1120
    check-cast v0, La/vpl;

    .line 1121
    .line 1122
    move-object/from16 v1, p2

    .line 1123
    .line 1124
    check-cast v1, Ljava/lang/Integer;

    .line 1125
    .line 1126
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1127
    .line 1128
    .line 1129
    move-result v1

    .line 1130
    move-object/from16 v2, p3

    .line 1131
    .line 1132
    check-cast v2, La/ycl;

    .line 1133
    .line 1134
    move-object/from16 v12, p4

    .line 1135
    .line 1136
    check-cast v12, La/fet;

    .line 1137
    .line 1138
    move-object/from16 v13, p5

    .line 1139
    .line 1140
    check-cast v13, Ljava/lang/Integer;

    .line 1141
    .line 1142
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 1143
    .line 1144
    .line 1145
    move-result v13

    .line 1146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1147
    .line 1148
    .line 1149
    and-int/lit8 v14, v13, 0x6

    .line 1150
    .line 1151
    if-nez v14, :cond_3e

    .line 1152
    .line 1153
    and-int/lit8 v14, v13, 0x8

    .line 1154
    .line 1155
    if-nez v14, :cond_3c

    .line 1156
    .line 1157
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1158
    .line 1159
    .line 1160
    move-result v14

    .line 1161
    goto :goto_1a

    .line 1162
    :cond_3c
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1163
    .line 1164
    .line 1165
    move-result v14

    .line 1166
    :goto_1a
    if-eqz v14, :cond_3d

    .line 1167
    .line 1168
    goto :goto_1b

    .line 1169
    :cond_3d
    move v4, v9

    .line 1170
    :goto_1b
    or-int/2addr v4, v13

    .line 1171
    goto :goto_1c

    .line 1172
    :cond_3e
    move v4, v13

    .line 1173
    :goto_1c
    and-int/lit8 v9, v13, 0x30

    .line 1174
    .line 1175
    if-nez v9, :cond_40

    .line 1176
    .line 1177
    invoke-virtual {v12, v1}, La/fet;->e(I)Z

    .line 1178
    .line 1179
    .line 1180
    move-result v9

    .line 1181
    if-eqz v9, :cond_3f

    .line 1182
    .line 1183
    move v7, v8

    .line 1184
    :cond_3f
    or-int/2addr v4, v7

    .line 1185
    :cond_40
    and-int/lit16 v7, v13, 0x180

    .line 1186
    .line 1187
    if-nez v7, :cond_42

    .line 1188
    .line 1189
    iget v7, v2, La/ycl;->a:F

    .line 1190
    .line 1191
    invoke-virtual {v12, v7}, La/fet;->d(F)Z

    .line 1192
    .line 1193
    .line 1194
    move-result v7

    .line 1195
    if-eqz v7, :cond_41

    .line 1196
    .line 1197
    move v5, v6

    .line 1198
    :cond_41
    or-int/2addr v4, v5

    .line 1199
    :cond_42
    and-int/lit16 v5, v4, 0x493

    .line 1200
    .line 1201
    if-eq v5, v3, :cond_43

    .line 1202
    .line 1203
    move v10, v11

    .line 1204
    :cond_43
    and-int/lit8 v3, v4, 0x1

    .line 1205
    .line 1206
    invoke-virtual {v12, v3, v10}, La/fet;->U(IZ)Z

    .line 1207
    .line 1208
    .line 1209
    move-result v3

    .line 1210
    if-eqz v3, :cond_44

    .line 1211
    .line 1212
    iget v2, v2, La/ycl;->a:F

    .line 1213
    .line 1214
    shl-int/lit8 v3, v4, 0x3

    .line 1215
    .line 1216
    and-int/lit8 v3, v3, 0x70

    .line 1217
    .line 1218
    const/4 v5, 0x6

    .line 1219
    or-int/2addr v3, v5

    .line 1220
    and-int/lit16 v6, v4, 0x380

    .line 1221
    .line 1222
    or-int/2addr v3, v6

    .line 1223
    shl-int/2addr v4, v5

    .line 1224
    and-int/lit16 v4, v4, 0x1c00

    .line 1225
    .line 1226
    or-int/2addr v3, v4

    .line 1227
    sget-object v4, La/jm40;->b:La/jm40;

    .line 1228
    .line 1229
    move-object/from16 p1, v0

    .line 1230
    .line 1231
    move/from16 p3, v1

    .line 1232
    .line 1233
    move/from16 p2, v2

    .line 1234
    .line 1235
    move/from16 p5, v3

    .line 1236
    .line 1237
    move-object/from16 p0, v4

    .line 1238
    .line 1239
    move-object/from16 p4, v12

    .line 1240
    .line 1241
    invoke-static/range {p0 .. p5}, La/ccq0;->o(La/mm40;La/vpl;FILa/fet;I)V

    .line 1242
    .line 1243
    .line 1244
    goto :goto_1d

    .line 1245
    :cond_44
    move-object v0, v12

    .line 1246
    invoke-virtual {v0}, La/fet;->X()V

    .line 1247
    .line 1248
    .line 1249
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1250
    .line 1251
    return-object v0

    .line 1252
    nop

    .line 1253
    :pswitch_data_0
    .packed-switch 0x0
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
