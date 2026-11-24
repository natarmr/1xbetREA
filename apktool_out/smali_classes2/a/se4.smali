.class public final synthetic La/se4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ze4;


# direct methods
.method public synthetic constructor <init>(La/ze4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/se4;->a:B

    iput-object p1, p0, La/se4;->b:La/ze4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/se4;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/se4;->b:La/ze4;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    sget-object v3, La/ze4;->g2:La/qek0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-object v0, v2, La/ze4;->a2:La/rl70;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    const-string v0, "PICKER_DIALOG_TAG"

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    new-instance v2, La/ud4;

    .line 41
    .line 42
    invoke-direct {v2, v0}, La/ud4;-><init>(Z)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_0
    const-string v0, "pickerDialogFactory"

    .line 52
    .line 53
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const/4 v0, 0x0

    .line 57
    throw v0

    .line 58
    :pswitch_0
    move-object/from16 v0, p1

    .line 59
    .line 60
    check-cast v0, Ljava/lang/String;

    .line 61
    .line 62
    move-object/from16 v1, p2

    .line 63
    .line 64
    check-cast v1, Landroid/os/Bundle;

    .line 65
    .line 66
    sget-object v3, La/ze4;->g2:La/qek0;

    .line 67
    .line 68
    const-string v3, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 69
    .line 70
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const-string v3, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 75
    .line 76
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    new-instance v3, La/td4;

    .line 85
    .line 86
    invoke-direct {v3, v0, v1}, La/td4;-><init>(IZ)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_1
    move-object/from16 v0, p1

    .line 96
    .line 97
    check-cast v0, Ljava/lang/String;

    .line 98
    .line 99
    move-object/from16 v1, p2

    .line 100
    .line 101
    check-cast v1, Landroid/os/Bundle;

    .line 102
    .line 103
    sget-object v3, La/ze4;->g2:La/qek0;

    .line 104
    .line 105
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 106
    .line 107
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v2, La/sd4;

    .line 116
    .line 117
    invoke-direct {v2, v0}, La/sd4;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 121
    .line 122
    .line 123
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object v0

    .line 126
    :pswitch_2
    move-object/from16 v0, p1

    .line 127
    .line 128
    check-cast v0, Ljava/lang/String;

    .line 129
    .line 130
    move-object/from16 v1, p2

    .line 131
    .line 132
    check-cast v1, Landroid/os/Bundle;

    .line 133
    .line 134
    sget-object v3, La/ze4;->g2:La/qek0;

    .line 135
    .line 136
    const-string v3, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 137
    .line 138
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 139
    .line 140
    .line 141
    move-result v0

    .line 142
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    new-instance v2, La/od4;

    .line 147
    .line 148
    invoke-direct {v2, v0}, La/od4;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_3
    move-object/from16 v4, p1

    .line 158
    .line 159
    check-cast v4, La/fet;

    .line 160
    .line 161
    move-object/from16 v1, p2

    .line 162
    .line 163
    check-cast v1, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    sget-object v2, La/ze4;->g2:La/qek0;

    .line 170
    .line 171
    and-int/lit8 v2, v1, 0x3

    .line 172
    .line 173
    const/4 v7, 0x2

    .line 174
    const/4 v8, 0x1

    .line 175
    const/4 v9, 0x0

    .line 176
    if-eq v2, v7, :cond_1

    .line 177
    .line 178
    move v2, v8

    .line 179
    goto :goto_0

    .line 180
    :cond_1
    move v2, v9

    .line 181
    :goto_0
    and-int/2addr v1, v8

    .line 182
    invoke-virtual {v4, v1, v2}, La/fet;->U(IZ)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_29

    .line 187
    .line 188
    sget-object v1, La/dy2;->c:La/lqd;

    .line 189
    .line 190
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v1

    .line 194
    check-cast v1, Landroid/content/res/Resources;

    .line 195
    .line 196
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    .line 201
    .line 202
    sget-object v2, La/bmd;->u:La/zfn;

    .line 203
    .line 204
    invoke-virtual {v4, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, La/rhv0;

    .line 209
    .line 210
    check-cast v2, La/yez;

    .line 211
    .line 212
    invoke-virtual {v2}, La/yez;->b()J

    .line 213
    .line 214
    .line 215
    move-result-wide v2

    .line 216
    invoke-virtual {v4, v2, v3}, La/fet;->f(J)Z

    .line 217
    .line 218
    .line 219
    move-result v5

    .line 220
    invoke-virtual {v4, v1}, La/fet;->d(F)Z

    .line 221
    .line 222
    .line 223
    move-result v6

    .line 224
    or-int/2addr v5, v6

    .line 225
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v6

    .line 229
    sget-object v10, La/ukd;->a:La/cl5;

    .line 230
    .line 231
    if-nez v5, :cond_2

    .line 232
    .line 233
    if-ne v6, v10, :cond_3

    .line 234
    .line 235
    :cond_2
    const/16 v5, 0x20

    .line 236
    .line 237
    shr-long v5, v2, v5

    .line 238
    .line 239
    long-to-int v5, v5

    .line 240
    const-wide v11, 0xffffffffL

    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    and-long/2addr v2, v11

    .line 246
    long-to-int v2, v2

    .line 247
    invoke-static {v5, v2}, Ljava/lang/Math;->min(II)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    int-to-float v3, v3

    .line 252
    div-float/2addr v3, v1

    .line 253
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    int-to-float v2, v2

    .line 258
    div-float/2addr v2, v1

    .line 259
    new-instance v6, La/ujv0;

    .line 260
    .line 261
    invoke-direct {v6, v3, v2}, La/ujv0;-><init>(FF)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_3
    move-object v11, v6

    .line 268
    check-cast v11, La/ujv0;

    .line 269
    .line 270
    sget-object v1, La/bmd;->i:La/zfn;

    .line 271
    .line 272
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    move-object v14, v1

    .line 277
    check-cast v14, La/wpq;

    .line 278
    .line 279
    sget-object v1, La/bmd;->q:La/zfn;

    .line 280
    .line 281
    invoke-virtual {v4, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v1

    .line 285
    move-object v15, v1

    .line 286
    check-cast v15, La/pkk0;

    .line 287
    .line 288
    iget-object v0, v0, La/se4;->b:La/ze4;

    .line 289
    .line 290
    invoke-virtual {v0}, La/ze4;->K0()La/k3t0;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    check-cast v1, La/i3t0;

    .line 295
    .line 296
    invoke-virtual {v1, v4}, La/i3t0;->y(La/fet;)La/pz40;

    .line 297
    .line 298
    .line 299
    move-result-object v12

    .line 300
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    if-nez v1, :cond_4

    .line 309
    .line 310
    if-ne v2, v10, :cond_5

    .line 311
    .line 312
    :cond_4
    new-instance v2, La/pe4;

    .line 313
    .line 314
    const/4 v1, 0x6

    .line 315
    invoke-direct {v2, v0, v1}, La/pe4;-><init>(La/ze4;B)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 319
    .line 320
    .line 321
    :cond_5
    move-object v1, v2

    .line 322
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 323
    .line 324
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v2

    .line 328
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v3

    .line 332
    if-nez v2, :cond_6

    .line 333
    .line 334
    if-ne v3, v10, :cond_7

    .line 335
    .line 336
    :cond_6
    new-instance v3, La/pe4;

    .line 337
    .line 338
    invoke-direct {v3, v0, v8}, La/pe4;-><init>(La/ze4;B)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 342
    .line 343
    .line 344
    :cond_7
    move-object v2, v3

    .line 345
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 346
    .line 347
    const/4 v5, 0x0

    .line 348
    const/4 v6, 0x4

    .line 349
    const/4 v3, 0x0

    .line 350
    invoke-static/range {v1 .. v6}, La/v3c;->A(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0}, La/ze4;->K0()La/k3t0;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v2

    .line 361
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v3

    .line 365
    if-nez v2, :cond_8

    .line 366
    .line 367
    if-ne v3, v10, :cond_9

    .line 368
    .line 369
    :cond_8
    new-instance v3, La/re4;

    .line 370
    .line 371
    invoke-direct {v3, v0, v9}, La/re4;-><init>(La/ze4;B)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 378
    .line 379
    sget-object v2, La/lkz;->a:La/lkz;

    .line 380
    .line 381
    invoke-static {v3, v4}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    invoke-virtual {v4, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 386
    .line 387
    .line 388
    move-result v3

    .line 389
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 390
    .line 391
    .line 392
    move-result v5

    .line 393
    or-int/2addr v3, v5

    .line 394
    const/4 v5, 0x3

    .line 395
    invoke-virtual {v4, v5}, La/fet;->e(I)Z

    .line 396
    .line 397
    .line 398
    move-result v6

    .line 399
    or-int/2addr v3, v6

    .line 400
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v6

    .line 404
    or-int/2addr v3, v6

    .line 405
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    const/16 v20, 0x0

    .line 410
    .line 411
    if-nez v3, :cond_a

    .line 412
    .line 413
    if-ne v6, v10, :cond_b

    .line 414
    .line 415
    :cond_a
    new-instance v16, La/l10;

    .line 416
    .line 417
    const/16 v21, 0x18

    .line 418
    .line 419
    move-object/from16 v18, v0

    .line 420
    .line 421
    move-object/from16 v17, v1

    .line 422
    .line 423
    move-object/from16 v19, v2

    .line 424
    .line 425
    invoke-direct/range {v16 .. v21}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 426
    .line 427
    .line 428
    move-object/from16 v6, v16

    .line 429
    .line 430
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :cond_b
    check-cast v6, Lkotlin/jvm/functions/Function2;

    .line 434
    .line 435
    invoke-static {v4, v0, v6}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    .line 437
    .line 438
    new-array v1, v9, [Ljava/lang/Object;

    .line 439
    .line 440
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 441
    .line 442
    .line 443
    move-result v2

    .line 444
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    if-nez v2, :cond_c

    .line 449
    .line 450
    if-ne v3, v10, :cond_d

    .line 451
    .line 452
    :cond_c
    new-instance v3, La/jb;

    .line 453
    .line 454
    const/16 v2, 0x17

    .line 455
    .line 456
    invoke-direct {v3, v12, v2}, La/jb;-><init>(La/l7m0;B)V

    .line 457
    .line 458
    .line 459
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    :cond_d
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 463
    .line 464
    invoke-static {v1, v3, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 465
    .line 466
    .line 467
    move-result-object v3

    .line 468
    new-array v1, v9, [Ljava/lang/Object;

    .line 469
    .line 470
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 471
    .line 472
    .line 473
    move-result v2

    .line 474
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v6

    .line 478
    if-nez v2, :cond_e

    .line 479
    .line 480
    if-ne v6, v10, :cond_f

    .line 481
    .line 482
    :cond_e
    new-instance v6, La/jb;

    .line 483
    .line 484
    const/16 v2, 0x18

    .line 485
    .line 486
    invoke-direct {v6, v12, v2}, La/jb;-><init>(La/l7m0;B)V

    .line 487
    .line 488
    .line 489
    invoke-virtual {v4, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 490
    .line 491
    .line 492
    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 493
    .line 494
    invoke-static {v1, v6, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 495
    .line 496
    .line 497
    move-result-object v1

    .line 498
    new-array v2, v9, [Ljava/lang/Object;

    .line 499
    .line 500
    invoke-virtual {v4, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 501
    .line 502
    .line 503
    move-result v6

    .line 504
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v13

    .line 508
    if-nez v6, :cond_10

    .line 509
    .line 510
    if-ne v13, v10, :cond_11

    .line 511
    .line 512
    :cond_10
    new-instance v13, La/jb;

    .line 513
    .line 514
    const/16 v6, 0x19

    .line 515
    .line 516
    invoke-direct {v13, v1, v6}, La/jb;-><init>(La/l7m0;B)V

    .line 517
    .line 518
    .line 519
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    :cond_11
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 523
    .line 524
    invoke-static {v2, v13, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    new-array v6, v9, [Ljava/lang/Object;

    .line 529
    .line 530
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 531
    .line 532
    .line 533
    move-result v13

    .line 534
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v5

    .line 538
    if-nez v13, :cond_12

    .line 539
    .line 540
    if-ne v5, v10, :cond_13

    .line 541
    .line 542
    :cond_12
    new-instance v5, La/jb;

    .line 543
    .line 544
    const/16 v13, 0x1a

    .line 545
    .line 546
    invoke-direct {v5, v12, v13}, La/jb;-><init>(La/l7m0;B)V

    .line 547
    .line 548
    .line 549
    invoke-virtual {v4, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    :cond_13
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 553
    .line 554
    invoke-static {v6, v5, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 555
    .line 556
    .line 557
    move-result-object v5

    .line 558
    new-array v6, v9, [Ljava/lang/Object;

    .line 559
    .line 560
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v13

    .line 564
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 565
    .line 566
    .line 567
    move-result-object v7

    .line 568
    if-nez v13, :cond_14

    .line 569
    .line 570
    if-ne v7, v10, :cond_15

    .line 571
    .line 572
    :cond_14
    new-instance v7, La/jb;

    .line 573
    .line 574
    const/16 v13, 0x1b

    .line 575
    .line 576
    invoke-direct {v7, v12, v13}, La/jb;-><init>(La/l7m0;B)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v4, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 580
    .line 581
    .line 582
    :cond_15
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 583
    .line 584
    invoke-static {v6, v7, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 585
    .line 586
    .line 587
    move-result-object v18

    .line 588
    new-array v6, v9, [Ljava/lang/Object;

    .line 589
    .line 590
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 591
    .line 592
    .line 593
    move-result v7

    .line 594
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v13

    .line 598
    if-nez v7, :cond_16

    .line 599
    .line 600
    if-ne v13, v10, :cond_17

    .line 601
    .line 602
    :cond_16
    new-instance v13, La/jb;

    .line 603
    .line 604
    const/16 v7, 0x1c

    .line 605
    .line 606
    invoke-direct {v13, v12, v7}, La/jb;-><init>(La/l7m0;B)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 610
    .line 611
    .line 612
    :cond_17
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 613
    .line 614
    invoke-static {v6, v13, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 615
    .line 616
    .line 617
    move-result-object v19

    .line 618
    new-array v6, v9, [Ljava/lang/Object;

    .line 619
    .line 620
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 621
    .line 622
    .line 623
    move-result v7

    .line 624
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v13

    .line 628
    if-nez v7, :cond_18

    .line 629
    .line 630
    if-ne v13, v10, :cond_19

    .line 631
    .line 632
    :cond_18
    new-instance v13, La/jb;

    .line 633
    .line 634
    const/16 v7, 0x1d

    .line 635
    .line 636
    invoke-direct {v13, v12, v7}, La/jb;-><init>(La/l7m0;B)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 640
    .line 641
    .line 642
    :cond_19
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 643
    .line 644
    invoke-static {v6, v13, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 645
    .line 646
    .line 647
    move-result-object v21

    .line 648
    new-array v6, v9, [Ljava/lang/Object;

    .line 649
    .line 650
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v7

    .line 654
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v13

    .line 658
    if-nez v7, :cond_1a

    .line 659
    .line 660
    if-ne v13, v10, :cond_1b

    .line 661
    .line 662
    :cond_1a
    new-instance v13, La/we4;

    .line 663
    .line 664
    invoke-direct {v13, v12, v9}, La/we4;-><init>(La/l7m0;B)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 668
    .line 669
    .line 670
    :cond_1b
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 671
    .line 672
    invoke-static {v6, v13, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 673
    .line 674
    .line 675
    move-result-object v6

    .line 676
    new-array v7, v9, [Ljava/lang/Object;

    .line 677
    .line 678
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v13

    .line 682
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v9

    .line 686
    if-nez v13, :cond_1c

    .line 687
    .line 688
    if-ne v9, v10, :cond_1d

    .line 689
    .line 690
    :cond_1c
    new-instance v9, La/we4;

    .line 691
    .line 692
    invoke-direct {v9, v12, v8}, La/we4;-><init>(La/l7m0;B)V

    .line 693
    .line 694
    .line 695
    invoke-virtual {v4, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 696
    .line 697
    .line 698
    :cond_1d
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 699
    .line 700
    invoke-static {v7, v9, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 701
    .line 702
    .line 703
    move-result-object v7

    .line 704
    const/4 v8, 0x0

    .line 705
    new-array v9, v8, [Ljava/lang/Object;

    .line 706
    .line 707
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    move-result v8

    .line 711
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v13

    .line 715
    if-nez v8, :cond_1e

    .line 716
    .line 717
    if-ne v13, v10, :cond_1f

    .line 718
    .line 719
    :cond_1e
    new-instance v13, La/we4;

    .line 720
    .line 721
    const/4 v8, 0x2

    .line 722
    invoke-direct {v13, v12, v8}, La/we4;-><init>(La/l7m0;B)V

    .line 723
    .line 724
    .line 725
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    :cond_1f
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 729
    .line 730
    invoke-static {v9, v13, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 731
    .line 732
    .line 733
    move-result-object v8

    .line 734
    const/4 v9, 0x0

    .line 735
    new-array v13, v9, [Ljava/lang/Object;

    .line 736
    .line 737
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v9

    .line 741
    move-object/from16 p1, v2

    .line 742
    .line 743
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v2

    .line 747
    if-nez v9, :cond_20

    .line 748
    .line 749
    if-ne v2, v10, :cond_21

    .line 750
    .line 751
    :cond_20
    new-instance v2, La/we4;

    .line 752
    .line 753
    const/4 v9, 0x3

    .line 754
    invoke-direct {v2, v12, v9}, La/we4;-><init>(La/l7m0;B)V

    .line 755
    .line 756
    .line 757
    invoke-virtual {v4, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 758
    .line 759
    .line 760
    :cond_21
    check-cast v2, Lkotlin/jvm/functions/Function0;

    .line 761
    .line 762
    invoke-static {v13, v2, v4}, La/v3c;->Y([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;)La/l7m0;

    .line 763
    .line 764
    .line 765
    move-result-object v2

    .line 766
    sget-object v9, La/o7k0;->c:La/n0q;

    .line 767
    .line 768
    invoke-static {v9}, La/o050;->S(La/mm40;)La/mm40;

    .line 769
    .line 770
    .line 771
    move-result-object v9

    .line 772
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    move-result v13

    .line 776
    move-object/from16 p0, v3

    .line 777
    .line 778
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 779
    .line 780
    .line 781
    move-result-object v3

    .line 782
    if-nez v13, :cond_22

    .line 783
    .line 784
    if-ne v3, v10, :cond_23

    .line 785
    .line 786
    :cond_22
    new-instance v3, La/yd1;

    .line 787
    .line 788
    const/16 v13, 0x11

    .line 789
    .line 790
    invoke-direct {v3, v12, v13}, La/yd1;-><init>(La/l7m0;B)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 794
    .line 795
    .line 796
    :cond_23
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 797
    .line 798
    invoke-static {v9, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    invoke-interface/range {p1 .. p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v9

    .line 806
    check-cast v9, Ljava/lang/Boolean;

    .line 807
    .line 808
    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    .line 809
    .line 810
    .line 811
    move-result v9

    .line 812
    if-eqz v9, :cond_24

    .line 813
    .line 814
    const v9, 0x29429f51

    .line 815
    .line 816
    .line 817
    invoke-virtual {v4, v9}, La/fet;->e0(I)V

    .line 818
    .line 819
    .line 820
    new-instance v9, La/ve4;

    .line 821
    .line 822
    const/4 v13, 0x4

    .line 823
    invoke-direct {v9, v1, v0, v13}, La/ve4;-><init>(La/l7m0;La/ze4;B)V

    .line 824
    .line 825
    .line 826
    const v1, -0x545cf224

    .line 827
    .line 828
    .line 829
    invoke-static {v1, v9, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 830
    .line 831
    .line 832
    move-result-object v1

    .line 833
    const/4 v9, 0x0

    .line 834
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 835
    .line 836
    .line 837
    goto :goto_1

    .line 838
    :cond_24
    const/4 v9, 0x0

    .line 839
    const v1, 0x29519582    # 4.6537E-14f

    .line 840
    .line 841
    .line 842
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 846
    .line 847
    .line 848
    move-object/from16 v1, v20

    .line 849
    .line 850
    :goto_1
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 851
    .line 852
    .line 853
    move-result-object v6

    .line 854
    move-object v13, v6

    .line 855
    check-cast v13, La/wul;

    .line 856
    .line 857
    if-nez v13, :cond_25

    .line 858
    .line 859
    const v6, 0x2952f850

    .line 860
    .line 861
    .line 862
    invoke-virtual {v4, v6}, La/fet;->e0(I)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 866
    .line 867
    .line 868
    move-object/from16 v16, v0

    .line 869
    .line 870
    move-object v6, v12

    .line 871
    move-object/from16 v0, v20

    .line 872
    .line 873
    goto :goto_2

    .line 874
    :cond_25
    const v6, 0x2952f851

    .line 875
    .line 876
    .line 877
    invoke-virtual {v4, v6}, La/fet;->e0(I)V

    .line 878
    .line 879
    .line 880
    move-object v6, v12

    .line 881
    new-instance v12, La/x2g;

    .line 882
    .line 883
    const/16 v17, 0x9

    .line 884
    .line 885
    move-object/from16 v16, v0

    .line 886
    .line 887
    invoke-direct/range {v12 .. v17}, La/x2g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 888
    .line 889
    .line 890
    const v0, -0x17c9e036

    .line 891
    .line 892
    .line 893
    invoke-static {v0, v12, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 894
    .line 895
    .line 896
    move-result-object v0

    .line 897
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 898
    .line 899
    .line 900
    :goto_2
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 901
    .line 902
    .line 903
    move-result-object v7

    .line 904
    move-object v13, v7

    .line 905
    check-cast v13, La/if4;

    .line 906
    .line 907
    if-nez v13, :cond_26

    .line 908
    .line 909
    const v7, 0x295c4f6e

    .line 910
    .line 911
    .line 912
    invoke-virtual {v4, v7}, La/fet;->e0(I)V

    .line 913
    .line 914
    .line 915
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 916
    .line 917
    .line 918
    move-object/from16 v7, v16

    .line 919
    .line 920
    :goto_3
    move-object/from16 v22, v20

    .line 921
    .line 922
    goto :goto_4

    .line 923
    :cond_26
    const v7, 0x295c4f6f

    .line 924
    .line 925
    .line 926
    invoke-virtual {v4, v7}, La/fet;->e0(I)V

    .line 927
    .line 928
    .line 929
    new-instance v12, La/oe4;

    .line 930
    .line 931
    const/16 v17, 0x0

    .line 932
    .line 933
    invoke-direct/range {v12 .. v17}, La/oe4;-><init>(La/if4;La/wpq;La/pkk0;La/ze4;B)V

    .line 934
    .line 935
    .line 936
    move-object/from16 v7, v16

    .line 937
    .line 938
    const v13, 0xf8083e7

    .line 939
    .line 940
    .line 941
    invoke-static {v13, v12, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 942
    .line 943
    .line 944
    move-result-object v20

    .line 945
    invoke-virtual {v4, v9}, La/fet;->r(Z)V

    .line 946
    .line 947
    .line 948
    goto :goto_3

    .line 949
    :goto_4
    invoke-virtual {v4, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v12

    .line 953
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 954
    .line 955
    .line 956
    move-result-object v13

    .line 957
    if-nez v12, :cond_27

    .line 958
    .line 959
    if-ne v13, v10, :cond_28

    .line 960
    .line 961
    :cond_27
    new-instance v13, La/pe4;

    .line 962
    .line 963
    invoke-direct {v13, v7, v9}, La/pe4;-><init>(La/ze4;B)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v4, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 967
    .line 968
    .line 969
    :cond_28
    move-object v9, v13

    .line 970
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 971
    .line 972
    new-instance v10, La/un6;

    .line 973
    .line 974
    const/16 v12, 0x15

    .line 975
    .line 976
    invoke-direct {v10, v7, v12}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 977
    .line 978
    .line 979
    const v12, -0x989832c

    .line 980
    .line 981
    .line 982
    invoke-static {v12, v10, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 983
    .line 984
    .line 985
    move-result-object v10

    .line 986
    new-instance v12, La/v7i0;

    .line 987
    .line 988
    const/16 v13, 0x8

    .line 989
    .line 990
    invoke-direct {v12, v2, v13}, La/v7i0;-><init>(La/l7m0;B)V

    .line 991
    .line 992
    .line 993
    const v2, 0x1d19a755

    .line 994
    .line 995
    .line 996
    invoke-static {v2, v12, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    new-instance v12, La/qe4;

    .line 1001
    .line 1002
    move-object v13, v6

    .line 1003
    move-object/from16 v17, v7

    .line 1004
    .line 1005
    move-object/from16 v20, v8

    .line 1006
    .line 1007
    move-object/from16 v16, v15

    .line 1008
    .line 1009
    move-object v15, v14

    .line 1010
    move-object v14, v5

    .line 1011
    invoke-direct/range {v12 .. v21}, La/qe4;-><init>(La/pz40;La/l7m0;La/wpq;La/pkk0;La/ze4;La/l7m0;La/l7m0;La/l7m0;La/l7m0;)V

    .line 1012
    .line 1013
    .line 1014
    const v5, 0x43bcd1d6

    .line 1015
    .line 1016
    .line 1017
    invoke-static {v5, v12, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v7

    .line 1021
    const v12, 0x1b6000

    .line 1022
    .line 1023
    .line 1024
    move-object v8, v0

    .line 1025
    move-object v6, v2

    .line 1026
    move-object v5, v10

    .line 1027
    move-object v2, v11

    .line 1028
    move-object v10, v1

    .line 1029
    move-object v1, v3

    .line 1030
    move-object v11, v4

    .line 1031
    move-object v4, v9

    .line 1032
    move-object/from16 v9, v22

    .line 1033
    .line 1034
    move-object/from16 v3, p0

    .line 1035
    .line 1036
    invoke-static/range {v1 .. v12}, La/qjj;->e(La/mm40;La/ujv0;La/l7m0;Lkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/ugd;La/xdr;La/xdr;La/xdr;La/fet;I)V

    .line 1037
    .line 1038
    .line 1039
    goto :goto_5

    .line 1040
    :cond_29
    invoke-virtual {v4}, La/fet;->X()V

    .line 1041
    .line 1042
    .line 1043
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    nop

    .line 1047
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
