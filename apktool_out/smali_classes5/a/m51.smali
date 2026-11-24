.class public final synthetic La/m51;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vne;La/qj1;La/d9z;)V
    .locals 0

    .line 1
    const/4 p1, 0x6

    iput-byte p1, p0, La/m51;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/m51;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/m51;->a:B

    iput-object p1, p0, La/m51;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m51;->a:B

    .line 4
    .line 5
    sget-object v2, La/fa50;->a:La/fa50;

    .line 6
    .line 7
    const-string v3, "snackbarManager"

    .line 8
    .line 9
    const-string v4, "actionDialogManager"

    .line 10
    .line 11
    const/16 v5, 0xa

    .line 12
    .line 13
    const v6, 0x799532c4

    .line 14
    .line 15
    .line 16
    const-wide v7, 0xffffffffL

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    const/16 v9, 0x20

    .line 22
    .line 23
    const/4 v10, 0x3

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x1

    .line 26
    const/4 v13, 0x0

    .line 27
    iget-object v0, v0, La/m51;->b:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v0, La/ye60;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/abi0;

    .line 37
    .line 38
    sget-object v2, La/h5i0;->a:La/zai0;

    .line 39
    .line 40
    new-instance v3, La/g5i0;

    .line 41
    .line 42
    sget-object v4, La/blv;->a:La/blv;

    .line 43
    .line 44
    invoke-interface {v0}, La/ye60;->a()J

    .line 45
    .line 46
    .line 47
    move-result-wide v5

    .line 48
    sget-object v7, La/f5i0;->b:La/f5i0;

    .line 49
    .line 50
    const/4 v8, 0x1

    .line 51
    invoke-direct/range {v3 .. v8}, La/g5i0;-><init>(La/blv;JLa/f5i0;Z)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v2, v3}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object v0

    .line 60
    :pswitch_0
    check-cast v0, Landroid/content/res/Resources;

    .line 61
    .line 62
    move-object/from16 v1, p1

    .line 63
    .line 64
    check-cast v1, La/tai0;

    .line 65
    .line 66
    invoke-static {v1, v0}, La/p8a;->Y(La/tai0;Landroid/content/res/Resources;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    return-object v0

    .line 75
    :pswitch_1
    check-cast v0, La/gkx;

    .line 76
    .line 77
    move-object/from16 v1, p1

    .line 78
    .line 79
    check-cast v1, La/tai0;

    .line 80
    .line 81
    iget v1, v1, La/tai0;->f:I

    .line 82
    .line 83
    invoke-virtual {v0, v1}, La/gkx;->a(I)Z

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    return-object v0

    .line 92
    :pswitch_2
    check-cast v0, La/ix2;

    .line 93
    .line 94
    move-object/from16 v1, p1

    .line 95
    .line 96
    check-cast v1, La/a810;

    .line 97
    .line 98
    iget-object v0, v0, La/ix2;->p:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 99
    .line 100
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()La/xfx;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    iget-object v2, v2, La/xfx;->g:La/cgk0;

    .line 105
    .line 106
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-lez v2, :cond_3

    .line 111
    .line 112
    sget-object v2, La/ijv0;->a:La/ey40;

    .line 113
    .line 114
    iput-boolean v12, v1, La/a810;->a:Z

    .line 115
    .line 116
    iget-object v2, v1, La/a810;->d:La/c810;

    .line 117
    .line 118
    invoke-virtual {v2}, La/c810;->I0()La/j6z;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    iget-wide v4, v1, La/a810;->b:J

    .line 123
    .line 124
    const-wide v12, 0x7fffffff7fffffffL

    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    invoke-static {v4, v5, v12, v13}, La/ikx;->b(JJ)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-eqz v4, :cond_0

    .line 134
    .line 135
    const-wide/16 v4, 0x0

    .line 136
    .line 137
    invoke-interface {v3, v4, v5}, La/j6z;->R(J)J

    .line 138
    .line 139
    .line 140
    move-result-wide v4

    .line 141
    invoke-static {v4, v5}, La/x1x;->J(J)J

    .line 142
    .line 143
    .line 144
    move-result-wide v4

    .line 145
    iput-wide v4, v1, La/a810;->b:J

    .line 146
    .line 147
    invoke-interface {v3}, La/j6z;->g()J

    .line 148
    .line 149
    .line 150
    move-result-wide v4

    .line 151
    iput-wide v4, v1, La/a810;->c:J

    .line 152
    .line 153
    :cond_0
    invoke-virtual {v2}, La/c810;->L0()La/e7z;

    .line 154
    .line 155
    .line 156
    move-result-object v2

    .line 157
    iget-object v2, v2, La/e7z;->i1:La/i7z;

    .line 158
    .line 159
    invoke-virtual {v2}, La/i7z;->b()V

    .line 160
    .line 161
    .line 162
    invoke-interface {v3}, La/j6z;->g()J

    .line 163
    .line 164
    .line 165
    move-result-wide v2

    .line 166
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()La/xfx;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    iget-object v10, v4, La/xfx;->f:La/hz40;

    .line 171
    .line 172
    shr-long v4, v2, v9

    .line 173
    .line 174
    long-to-int v5, v4

    .line 175
    and-long/2addr v2, v7

    .line 176
    long-to-int v6, v2

    .line 177
    sget-object v7, La/ijv0;->b:[La/gjv0;

    .line 178
    .line 179
    array-length v8, v7

    .line 180
    move v9, v11

    .line 181
    :goto_0
    if-ge v9, v8, :cond_2

    .line 182
    .line 183
    aget-object v12, v7, v9

    .line 184
    .line 185
    invoke-virtual {v10, v12}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v2

    .line 189
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-object v13, v2

    .line 193
    check-cast v13, La/vjv0;

    .line 194
    .line 195
    move-object v2, v12

    .line 196
    check-cast v2, La/hjv0;

    .line 197
    .line 198
    iget-object v2, v2, La/hjv0;->c:La/tdx;

    .line 199
    .line 200
    iget-wide v3, v13, La/vjv0;->h:J

    .line 201
    .line 202
    invoke-static/range {v1 .. v6}, La/ijv0;->a(La/a810;La/tdx;JII)V

    .line 203
    .line 204
    .line 205
    iget-object v2, v13, La/vjv0;->b:La/pz40;

    .line 206
    .line 207
    check-cast v2, La/hgk0;

    .line 208
    .line 209
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    check-cast v2, Ljava/lang/Boolean;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 216
    .line 217
    .line 218
    move-result v2

    .line 219
    if-eqz v2, :cond_1

    .line 220
    .line 221
    iget-object v2, v13, La/vjv0;->f:La/tdx;

    .line 222
    .line 223
    iget-wide v3, v13, La/vjv0;->j:J

    .line 224
    .line 225
    invoke-static/range {v1 .. v6}, La/ijv0;->a(La/a810;La/tdx;JII)V

    .line 226
    .line 227
    .line 228
    iget-object v2, v13, La/vjv0;->g:La/tdx;

    .line 229
    .line 230
    iget-wide v3, v13, La/vjv0;->k:J

    .line 231
    .line 232
    invoke-static/range {v1 .. v6}, La/ijv0;->a(La/a810;La/tdx;JII)V

    .line 233
    .line 234
    .line 235
    :cond_1
    check-cast v12, La/hjv0;

    .line 236
    .line 237
    iget-object v2, v12, La/hjv0;->d:La/tdx;

    .line 238
    .line 239
    iget-wide v3, v13, La/vjv0;->i:J

    .line 240
    .line 241
    invoke-static/range {v1 .. v6}, La/ijv0;->a(La/a810;La/tdx;JII)V

    .line 242
    .line 243
    .line 244
    add-int/lit8 v9, v9, 0x1

    .line 245
    .line 246
    goto :goto_0

    .line 247
    :cond_2
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()La/xfx;

    .line 248
    .line 249
    .line 250
    move-result-object v2

    .line 251
    iget-object v2, v2, La/xfx;->h:La/vy40;

    .line 252
    .line 253
    invoke-virtual {v2}, La/vy40;->j()Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-eqz v3, :cond_3

    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeView;->getInsetsListener()La/xfx;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v0, v0, La/xfx;->i:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 264
    .line 265
    iget-object v3, v2, La/vy40;->a:[Ljava/lang/Object;

    .line 266
    .line 267
    iget v2, v2, La/vy40;->b:I

    .line 268
    .line 269
    :goto_1
    if-ge v11, v2, :cond_3

    .line 270
    .line 271
    aget-object v4, v3, v11

    .line 272
    .line 273
    check-cast v4, La/pz40;

    .line 274
    .line 275
    invoke-virtual {v0, v11}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->get(I)Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v5

    .line 279
    check-cast v5, La/tdx;

    .line 280
    .line 281
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    check-cast v4, Landroid/graphics/Rect;

    .line 286
    .line 287
    invoke-virtual {v5}, La/tdx;->b()La/xlw;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    iget v7, v4, Landroid/graphics/Rect;->left:I

    .line 292
    .line 293
    int-to-float v7, v7

    .line 294
    invoke-virtual {v1, v6, v7}, La/a810;->a(La/xlw;F)V

    .line 295
    .line 296
    .line 297
    invoke-virtual {v5}, La/tdx;->d()La/xlw;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    iget v7, v4, Landroid/graphics/Rect;->top:I

    .line 302
    .line 303
    int-to-float v7, v7

    .line 304
    invoke-virtual {v1, v6, v7}, La/a810;->a(La/xlw;F)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v5}, La/tdx;->c()La/xlw;

    .line 308
    .line 309
    .line 310
    move-result-object v6

    .line 311
    iget v7, v4, Landroid/graphics/Rect;->right:I

    .line 312
    .line 313
    int-to-float v7, v7

    .line 314
    invoke-virtual {v1, v6, v7}, La/a810;->a(La/xlw;F)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v5}, La/tdx;->a()La/xlw;

    .line 318
    .line 319
    .line 320
    move-result-object v5

    .line 321
    iget v4, v4, Landroid/graphics/Rect;->bottom:I

    .line 322
    .line 323
    int-to-float v4, v4

    .line 324
    invoke-virtual {v1, v5, v4}, La/a810;->a(La/xlw;F)V

    .line 325
    .line 326
    .line 327
    add-int/lit8 v11, v11, 0x1

    .line 328
    .line 329
    goto :goto_1

    .line 330
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_3
    check-cast v0, La/gp2;

    .line 334
    .line 335
    move-object/from16 v1, p1

    .line 336
    .line 337
    check-cast v1, Ljava/lang/Throwable;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    iget-object v2, v0, La/gp2;->i:La/p7m0;

    .line 343
    .line 344
    new-instance v3, La/cp2;

    .line 345
    .line 346
    iget-object v4, v0, La/gp2;->d:La/sa10;

    .line 347
    .line 348
    sget-object v5, La/pb10;->g:La/pb10;

    .line 349
    .line 350
    const/4 v8, 0x0

    .line 351
    const/16 v9, 0x1c

    .line 352
    .line 353
    const v6, 0x7f130677

    .line 354
    .line 355
    .line 356
    const/4 v7, 0x0

    .line 357
    invoke-static/range {v4 .. v9}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-direct {v3, v4}, La/cp2;-><init>(La/ra10;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2, v13, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 368
    .line 369
    .line 370
    iget-object v0, v0, La/gp2;->g:La/duj;

    .line 371
    .line 372
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 373
    .line 374
    .line 375
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 376
    .line 377
    return-object v0

    .line 378
    :pswitch_4
    check-cast v0, La/mo2;

    .line 379
    .line 380
    move-object/from16 v1, p1

    .line 381
    .line 382
    check-cast v1, La/cp;

    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    new-instance v2, La/j9;

    .line 388
    .line 389
    invoke-direct {v2, v1, v0}, La/j9;-><init>(La/cp;La/mo2;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v1, v2}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 393
    .line 394
    .line 395
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_5
    check-cast v0, La/yn2;

    .line 399
    .line 400
    move-object/from16 v1, p1

    .line 401
    .line 402
    check-cast v1, Ljava/lang/Throwable;

    .line 403
    .line 404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 405
    .line 406
    .line 407
    iget-object v0, v0, La/yn2;->H:La/duj;

    .line 408
    .line 409
    new-instance v2, La/ma2;

    .line 410
    .line 411
    const/16 v3, 0x11

    .line 412
    .line 413
    invoke-direct {v2, v3}, La/ma2;-><init>(B)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 417
    .line 418
    .line 419
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 420
    .line 421
    return-object v0

    .line 422
    :pswitch_6
    check-cast v0, La/fie;

    .line 423
    .line 424
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, La/hcz;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    new-instance v2, La/un6;

    .line 432
    .line 433
    const/16 v3, 0x10

    .line 434
    .line 435
    invoke-direct {v2, v0, v3}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 436
    .line 437
    .line 438
    new-instance v0, La/ugd;

    .line 439
    .line 440
    const v3, 0x32523602

    .line 441
    .line 442
    .line 443
    invoke-direct {v0, v3, v12, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    invoke-static {v1, v13, v13, v0, v10}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 447
    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_7
    check-cast v0, La/whe;

    .line 453
    .line 454
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, La/i8z;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget v2, v0, La/whe;->a:I

    .line 462
    .line 463
    sget-object v5, La/epv0;->a:La/ugd;

    .line 464
    .line 465
    const/16 v6, 0xe

    .line 466
    .line 467
    const/4 v3, 0x0

    .line 468
    const/4 v4, 0x0

    .line 469
    invoke-static/range {v1 .. v6}, La/i8z;->f(La/i8z;ILa/oea;La/oea;La/ugd;I)V

    .line 470
    .line 471
    .line 472
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_8
    check-cast v0, La/uce;

    .line 476
    .line 477
    move-object/from16 v1, p1

    .line 478
    .line 479
    check-cast v1, La/hcz;

    .line 480
    .line 481
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    new-instance v2, La/un6;

    .line 485
    .line 486
    const/16 v3, 0xf

    .line 487
    .line 488
    invoke-direct {v2, v0, v3}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 489
    .line 490
    .line 491
    new-instance v0, La/ugd;

    .line 492
    .line 493
    const v3, 0x43913028

    .line 494
    .line 495
    .line 496
    invoke-direct {v0, v3, v12, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-static {v1, v13, v13, v0, v10}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 500
    .line 501
    .line 502
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object v0

    .line 505
    :pswitch_9
    check-cast v0, La/vce;

    .line 506
    .line 507
    move-object/from16 v1, p1

    .line 508
    .line 509
    check-cast v1, La/hcz;

    .line 510
    .line 511
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    new-instance v2, La/un6;

    .line 515
    .line 516
    const/16 v3, 0xe

    .line 517
    .line 518
    invoke-direct {v2, v0, v3}, La/un6;-><init>(Ljava/lang/Object;B)V

    .line 519
    .line 520
    .line 521
    new-instance v0, La/ugd;

    .line 522
    .line 523
    const v3, -0x3b218d2

    .line 524
    .line 525
    .line 526
    invoke-direct {v0, v3, v12, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v1, v13, v13, v0, v10}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 530
    .line 531
    .line 532
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_a
    check-cast v0, La/ef2;

    .line 536
    .line 537
    move-object/from16 v1, p1

    .line 538
    .line 539
    check-cast v1, La/h2i0;

    .line 540
    .line 541
    sget-object v2, La/ef2;->V1:La/hfk0;

    .line 542
    .line 543
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, La/ef2;->L0()La/k3t0;

    .line 547
    .line 548
    .line 549
    move-result-object v0

    .line 550
    new-instance v2, La/qe2;

    .line 551
    .line 552
    iget v3, v1, La/h2i0;->a:I

    .line 553
    .line 554
    iget v4, v1, La/h2i0;->b:I

    .line 555
    .line 556
    iget v1, v1, La/h2i0;->c:I

    .line 557
    .line 558
    invoke-direct {v2, v3, v4, v1}, La/qe2;-><init>(III)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 565
    .line 566
    return-object v0

    .line 567
    :pswitch_b
    check-cast v0, La/hd2;

    .line 568
    .line 569
    move-object/from16 v1, p1

    .line 570
    .line 571
    check-cast v1, Ljava/lang/Throwable;

    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    iget-object v2, v0, La/hd2;->t:La/duj;

    .line 577
    .line 578
    new-instance v3, La/fa2;

    .line 579
    .line 580
    invoke-direct {v3, v0, v12}, La/fa2;-><init>(Ljava/lang/Object;B)V

    .line 581
    .line 582
    .line 583
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 584
    .line 585
    .line 586
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object v0

    .line 589
    :pswitch_c
    move-object v1, v0

    .line 590
    check-cast v1, La/hb2;

    .line 591
    .line 592
    move-object/from16 v2, p1

    .line 593
    .line 594
    check-cast v2, Ljava/lang/Throwable;

    .line 595
    .line 596
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 600
    .line 601
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 602
    .line 603
    :cond_4
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 608
    .line 609
    .line 610
    iget-object v4, v1, La/i3t0;->f:La/oyg0;

    .line 611
    .line 612
    move-object v5, v0

    .line 613
    check-cast v5, La/ab2;

    .line 614
    .line 615
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    new-instance v9, La/wa2;

    .line 619
    .line 620
    invoke-direct {v9, v2}, La/wa2;-><init>(Ljava/lang/Throwable;)V

    .line 621
    .line 622
    .line 623
    const/4 v15, 0x0

    .line 624
    const v16, 0xfdef

    .line 625
    .line 626
    .line 627
    const/4 v6, 0x0

    .line 628
    const/4 v7, 0x0

    .line 629
    const/4 v8, 0x0

    .line 630
    const/4 v10, 0x0

    .line 631
    const/4 v11, 0x0

    .line 632
    const/4 v12, 0x0

    .line 633
    const/4 v13, 0x0

    .line 634
    const/4 v14, 0x0

    .line 635
    invoke-static/range {v5 .. v16}, La/ab2;->a(La/ab2;Ljava/lang/String;Ljava/util/Date;ZLa/za2;ZZZLjava/util/List;La/wcb;Ljava/util/Set;I)La/ab2;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_4

    .line 644
    .line 645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 646
    .line 647
    return-object v0

    .line 648
    :pswitch_d
    check-cast v0, La/ia2;

    .line 649
    .line 650
    move-object/from16 v1, p1

    .line 651
    .line 652
    check-cast v1, La/h2i0;

    .line 653
    .line 654
    sget-object v2, La/ia2;->Q1:La/rek0;

    .line 655
    .line 656
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, La/ia2;->G0()La/k3t0;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    new-instance v2, La/v92;

    .line 664
    .line 665
    iget v3, v1, La/h2i0;->a:I

    .line 666
    .line 667
    iget v4, v1, La/h2i0;->b:I

    .line 668
    .line 669
    iget v1, v1, La/h2i0;->c:I

    .line 670
    .line 671
    invoke-direct {v2, v3, v4, v1}, La/v92;-><init>(III)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 675
    .line 676
    .line 677
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 678
    .line 679
    return-object v0

    .line 680
    :pswitch_e
    check-cast v0, La/w62;

    .line 681
    .line 682
    move-object/from16 v1, p1

    .line 683
    .line 684
    check-cast v1, La/h2i0;

    .line 685
    .line 686
    sget-object v2, La/w62;->Q1:La/pek0;

    .line 687
    .line 688
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0}, La/w62;->G0()La/k3t0;

    .line 692
    .line 693
    .line 694
    move-result-object v0

    .line 695
    new-instance v2, La/g62;

    .line 696
    .line 697
    iget v3, v1, La/h2i0;->a:I

    .line 698
    .line 699
    iget v4, v1, La/h2i0;->b:I

    .line 700
    .line 701
    iget v1, v1, La/h2i0;->c:I

    .line 702
    .line 703
    invoke-direct {v2, v3, v4, v1}, La/g62;-><init>(III)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 710
    .line 711
    return-object v0

    .line 712
    :pswitch_f
    check-cast v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;

    .line 713
    .line 714
    move-object/from16 v1, p1

    .line 715
    .line 716
    check-cast v1, La/uid;

    .line 717
    .line 718
    sget-object v2, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->U1:La/hfk0;

    .line 719
    .line 720
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/a;->H0()La/k3t0;

    .line 724
    .line 725
    .line 726
    move-result-object v0

    .line 727
    new-instance v2, La/o22;

    .line 728
    .line 729
    invoke-direct {v2, v1}, La/o22;-><init>(La/uid;)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_10
    check-cast v0, La/f7z;

    .line 739
    .line 740
    move-object/from16 v1, p1

    .line 741
    .line 742
    check-cast v1, La/b22;

    .line 743
    .line 744
    invoke-interface {v1}, La/b22;->N()I

    .line 745
    .line 746
    .line 747
    move-result v2

    .line 748
    const v3, 0x7fffffff

    .line 749
    .line 750
    .line 751
    if-ne v2, v3, :cond_5

    .line 752
    .line 753
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 754
    .line 755
    goto/16 :goto_5

    .line 756
    .line 757
    :cond_5
    invoke-interface {v1}, La/b22;->a()La/f7z;

    .line 758
    .line 759
    .line 760
    move-result-object v2

    .line 761
    iget-boolean v2, v2, La/f7z;->b:Z

    .line 762
    .line 763
    if-eqz v2, :cond_6

    .line 764
    .line 765
    invoke-interface {v1}, La/b22;->y()V

    .line 766
    .line 767
    .line 768
    :cond_6
    invoke-interface {v1}, La/b22;->a()La/f7z;

    .line 769
    .line 770
    .line 771
    move-result-object v2

    .line 772
    iget-object v2, v2, La/f7z;->i:Ljava/util/HashMap;

    .line 773
    .line 774
    invoke-virtual {v2}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    .line 775
    .line 776
    .line 777
    move-result-object v2

    .line 778
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 779
    .line 780
    .line 781
    move-result-object v2

    .line 782
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 783
    .line 784
    .line 785
    move-result v3

    .line 786
    if-eqz v3, :cond_7

    .line 787
    .line 788
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v3

    .line 792
    check-cast v3, Ljava/util/Map$Entry;

    .line 793
    .line 794
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    check-cast v4, La/w12;

    .line 799
    .line 800
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    check-cast v3, Ljava/lang/Number;

    .line 805
    .line 806
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 807
    .line 808
    .line 809
    move-result v3

    .line 810
    invoke-interface {v1}, La/b22;->H()La/rdx;

    .line 811
    .line 812
    .line 813
    move-result-object v5

    .line 814
    invoke-virtual {v0, v4, v3, v5}, La/f7z;->a(La/w12;ILa/s460;)V

    .line 815
    .line 816
    .line 817
    goto :goto_2

    .line 818
    :cond_7
    invoke-interface {v1}, La/b22;->H()La/rdx;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    iget-object v1, v1, La/s460;->w:La/s460;

    .line 823
    .line 824
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 825
    .line 826
    .line 827
    :goto_3
    iget-object v2, v0, La/f7z;->a:La/b22;

    .line 828
    .line 829
    invoke-interface {v2}, La/b22;->H()La/rdx;

    .line 830
    .line 831
    .line 832
    move-result-object v2

    .line 833
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    if-nez v2, :cond_9

    .line 838
    .line 839
    invoke-virtual {v0, v1}, La/f7z;->b(La/s460;)Ljava/util/Map;

    .line 840
    .line 841
    .line 842
    move-result-object v2

    .line 843
    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 844
    .line 845
    .line 846
    move-result-object v2

    .line 847
    check-cast v2, Ljava/lang/Iterable;

    .line 848
    .line 849
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 850
    .line 851
    .line 852
    move-result-object v2

    .line 853
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 854
    .line 855
    .line 856
    move-result v3

    .line 857
    if-eqz v3, :cond_8

    .line 858
    .line 859
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 860
    .line 861
    .line 862
    move-result-object v3

    .line 863
    check-cast v3, La/w12;

    .line 864
    .line 865
    invoke-virtual {v0, v1, v3}, La/f7z;->c(La/s460;La/w12;)I

    .line 866
    .line 867
    .line 868
    move-result v4

    .line 869
    invoke-virtual {v0, v3, v4, v1}, La/f7z;->a(La/w12;ILa/s460;)V

    .line 870
    .line 871
    .line 872
    goto :goto_4

    .line 873
    :cond_8
    iget-object v1, v1, La/s460;->w:La/s460;

    .line 874
    .line 875
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    goto :goto_3

    .line 879
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 880
    .line 881
    :goto_5
    return-object v0

    .line 882
    :pswitch_11
    check-cast v0, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 883
    .line 884
    move-object/from16 v1, p1

    .line 885
    .line 886
    check-cast v1, La/q12;

    .line 887
    .line 888
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 889
    .line 890
    .line 891
    iget-object v1, v1, La/q12;->a:Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;

    .line 892
    .line 893
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    move-result v0

    .line 897
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    return-object v0

    .line 902
    :pswitch_12
    check-cast v0, La/cbs0;

    .line 903
    .line 904
    move-object/from16 v1, p1

    .line 905
    .line 906
    check-cast v1, La/hcz;

    .line 907
    .line 908
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 909
    .line 910
    .line 911
    iget-object v0, v0, La/cbs0;->a:La/i4;

    .line 912
    .line 913
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 914
    .line 915
    .line 916
    move-result v2

    .line 917
    new-instance v3, La/b8;

    .line 918
    .line 919
    const/16 v4, 0x14

    .line 920
    .line 921
    invoke-direct {v3, v0, v4}, La/b8;-><init>(Ljava/util/List;B)V

    .line 922
    .line 923
    .line 924
    new-instance v4, La/xy1;

    .line 925
    .line 926
    invoke-direct {v4, v0, v11}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 927
    .line 928
    .line 929
    new-instance v0, La/ugd;

    .line 930
    .line 931
    invoke-direct {v0, v6, v12, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 932
    .line 933
    .line 934
    invoke-virtual {v1, v2, v13, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 935
    .line 936
    .line 937
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 938
    .line 939
    return-object v0

    .line 940
    :pswitch_13
    check-cast v0, La/ou1;

    .line 941
    .line 942
    move-object/from16 v1, p1

    .line 943
    .line 944
    check-cast v1, La/hcz;

    .line 945
    .line 946
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 947
    .line 948
    .line 949
    check-cast v0, La/mu1;

    .line 950
    .line 951
    iget-object v0, v0, La/mu1;->a:La/a4x;

    .line 952
    .line 953
    new-instance v2, La/xg1;

    .line 954
    .line 955
    invoke-direct {v2, v5}, La/xg1;-><init>(B)V

    .line 956
    .line 957
    .line 958
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 959
    .line 960
    .line 961
    move-result v3

    .line 962
    new-instance v4, La/g5;

    .line 963
    .line 964
    const/16 v5, 0x16

    .line 965
    .line 966
    invoke-direct {v4, v2, v0, v5}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 967
    .line 968
    .line 969
    new-instance v2, La/wl0;

    .line 970
    .line 971
    const/4 v5, 0x4

    .line 972
    invoke-direct {v2, v0, v5}, La/wl0;-><init>(La/a4x;B)V

    .line 973
    .line 974
    .line 975
    new-instance v5, La/zd1;

    .line 976
    .line 977
    const/4 v7, 0x2

    .line 978
    invoke-direct {v5, v0, v7}, La/zd1;-><init>(La/a4x;B)V

    .line 979
    .line 980
    .line 981
    new-instance v0, La/ugd;

    .line 982
    .line 983
    invoke-direct {v0, v6, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 984
    .line 985
    .line 986
    invoke-virtual {v1, v3, v4, v2, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 987
    .line 988
    .line 989
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 990
    .line 991
    return-object v0

    .line 992
    :pswitch_14
    check-cast v0, La/au1;

    .line 993
    .line 994
    move-object/from16 v1, p1

    .line 995
    .line 996
    check-cast v1, La/xu1;

    .line 997
    .line 998
    sget-object v2, La/au1;->Z1:La/jdk0;

    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    sget-object v2, La/tu1;->a:La/tu1;

    .line 1004
    .line 1005
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1006
    .line 1007
    .line 1008
    move-result v2

    .line 1009
    if-eqz v2, :cond_b

    .line 1010
    .line 1011
    invoke-static {v0}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 1012
    .line 1013
    .line 1014
    :cond_a
    :goto_6
    move-object v3, v0

    .line 1015
    goto/16 :goto_7

    .line 1016
    .line 1017
    :cond_b
    instance-of v2, v1, La/uu1;

    .line 1018
    .line 1019
    if-eqz v2, :cond_d

    .line 1020
    .line 1021
    iget-object v2, v0, La/au1;->M1:La/ii;

    .line 1022
    .line 1023
    if-eqz v2, :cond_c

    .line 1024
    .line 1025
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1026
    .line 1027
    check-cast v1, La/uu1;

    .line 1028
    .line 1029
    iget-object v15, v1, La/uu1;->a:Ljava/lang/String;

    .line 1030
    .line 1031
    iget-object v3, v1, La/uu1;->b:Ljava/lang/String;

    .line 1032
    .line 1033
    iget-object v1, v1, La/uu1;->c:Ljava/lang/String;

    .line 1034
    .line 1035
    sget-object v23, La/n12;->b:La/n12;

    .line 1036
    .line 1037
    const/16 v24, 0x0

    .line 1038
    .line 1039
    const/16 v25, 0x5f8

    .line 1040
    .line 1041
    const/16 v18, 0x0

    .line 1042
    .line 1043
    const/16 v19, 0x0

    .line 1044
    .line 1045
    const/16 v20, 0x0

    .line 1046
    .line 1047
    const/16 v21, 0x0

    .line 1048
    .line 1049
    const/16 v22, 0x0

    .line 1050
    .line 1051
    move-object/from16 v17, v1

    .line 1052
    .line 1053
    move-object/from16 v16, v3

    .line 1054
    .line 1055
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v1

    .line 1062
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v2, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1066
    .line 1067
    .line 1068
    goto :goto_6

    .line 1069
    :cond_c
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1070
    .line 1071
    .line 1072
    throw v13

    .line 1073
    :cond_d
    instance-of v2, v1, La/wu1;

    .line 1074
    .line 1075
    if-eqz v2, :cond_e

    .line 1076
    .line 1077
    sget-object v2, La/cl1;->o2:La/gfk0;

    .line 1078
    .line 1079
    check-cast v1, La/wu1;

    .line 1080
    .line 1081
    iget-wide v3, v1, La/wu1;->a:J

    .line 1082
    .line 1083
    iget-object v1, v1, La/wu1;->b:Ljava/lang/String;

    .line 1084
    .line 1085
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1086
    .line 1087
    .line 1088
    invoke-static {v3, v4, v1}, La/gfk0;->g(JLjava/lang/String;)La/cl1;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v1

    .line 1092
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1093
    .line 1094
    .line 1095
    move-result-object v2

    .line 1096
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    invoke-static {v1, v2}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 1100
    .line 1101
    .line 1102
    goto :goto_6

    .line 1103
    :cond_e
    instance-of v2, v1, La/su1;

    .line 1104
    .line 1105
    if-eqz v2, :cond_15

    .line 1106
    .line 1107
    check-cast v1, La/su1;

    .line 1108
    .line 1109
    iget-object v1, v1, La/su1;->a:La/ob0;

    .line 1110
    .line 1111
    instance-of v2, v1, La/mb0;

    .line 1112
    .line 1113
    if-eqz v2, :cond_10

    .line 1114
    .line 1115
    check-cast v1, La/mb0;

    .line 1116
    .line 1117
    iget-object v4, v1, La/mb0;->a:Ljava/lang/String;

    .line 1118
    .line 1119
    iget-object v2, v0, La/au1;->L1:La/ynb;

    .line 1120
    .line 1121
    if-eqz v2, :cond_f

    .line 1122
    .line 1123
    sget-object v3, La/bm5;->e:La/bm5;

    .line 1124
    .line 1125
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v5

    .line 1129
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1130
    .line 1131
    .line 1132
    const-string v7, "REQUEST_CHANGE_BALANCE_KEY"

    .line 1133
    .line 1134
    const/16 v8, 0x1e6

    .line 1135
    .line 1136
    const/4 v6, 0x0

    .line 1137
    invoke-static/range {v2 .. v8}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_6

    .line 1141
    :cond_f
    const-string v0, "changeBalanceDialogProvider"

    .line 1142
    .line 1143
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1144
    .line 1145
    .line 1146
    throw v13

    .line 1147
    :cond_10
    sget-object v2, La/lb0;->a:La/lb0;

    .line 1148
    .line 1149
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v2

    .line 1153
    const v3, 0x7f130e5c

    .line 1154
    .line 1155
    .line 1156
    const v5, 0x7f130162

    .line 1157
    .line 1158
    .line 1159
    if-eqz v2, :cond_12

    .line 1160
    .line 1161
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    if-eqz v1, :cond_a

    .line 1166
    .line 1167
    iget-object v2, v0, La/au1;->M1:La/ii;

    .line 1168
    .line 1169
    if-eqz v2, :cond_11

    .line 1170
    .line 1171
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1172
    .line 1173
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v15

    .line 1177
    const v4, 0x7f1303dc

    .line 1178
    .line 1179
    .line 1180
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v16

    .line 1184
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v17

    .line 1188
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1189
    .line 1190
    .line 1191
    sget-object v23, La/n12;->b:La/n12;

    .line 1192
    .line 1193
    const/16 v24, 0x0

    .line 1194
    .line 1195
    const/16 v25, 0x5d8

    .line 1196
    .line 1197
    const/16 v18, 0x0

    .line 1198
    .line 1199
    const/16 v19, 0x0

    .line 1200
    .line 1201
    const-string v20, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 1202
    .line 1203
    const/16 v21, 0x0

    .line 1204
    .line 1205
    const/16 v22, 0x0

    .line 1206
    .line 1207
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v1

    .line 1214
    invoke-virtual {v2, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1215
    .line 1216
    .line 1217
    goto/16 :goto_6

    .line 1218
    .line 1219
    :cond_11
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1220
    .line 1221
    .line 1222
    throw v13

    .line 1223
    :cond_12
    sget-object v2, La/nb0;->a:La/nb0;

    .line 1224
    .line 1225
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1226
    .line 1227
    .line 1228
    move-result v1

    .line 1229
    if-eqz v1, :cond_14

    .line 1230
    .line 1231
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    if-eqz v1, :cond_a

    .line 1236
    .line 1237
    iget-object v2, v0, La/au1;->M1:La/ii;

    .line 1238
    .line 1239
    if-eqz v2, :cond_13

    .line 1240
    .line 1241
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1242
    .line 1243
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v15

    .line 1247
    const v4, 0x7f13123b

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1251
    .line 1252
    .line 1253
    move-result-object v16

    .line 1254
    invoke-virtual {v1, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v17

    .line 1258
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1259
    .line 1260
    .line 1261
    sget-object v23, La/n12;->b:La/n12;

    .line 1262
    .line 1263
    const/16 v24, 0x0

    .line 1264
    .line 1265
    const/16 v25, 0x5d8

    .line 1266
    .line 1267
    const/16 v18, 0x0

    .line 1268
    .line 1269
    const/16 v19, 0x0

    .line 1270
    .line 1271
    const-string v20, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 1272
    .line 1273
    const/16 v21, 0x0

    .line 1274
    .line 1275
    const/16 v22, 0x0

    .line 1276
    .line 1277
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1278
    .line 1279
    .line 1280
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v1

    .line 1284
    invoke-virtual {v2, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1285
    .line 1286
    .line 1287
    goto/16 :goto_6

    .line 1288
    .line 1289
    :cond_13
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    throw v13

    .line 1293
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_8

    .line 1297
    :cond_15
    instance-of v2, v1, La/vu1;

    .line 1298
    .line 1299
    if-eqz v2, :cond_17

    .line 1300
    .line 1301
    check-cast v1, La/vu1;

    .line 1302
    .line 1303
    iget-object v6, v1, La/vu1;->a:Ljava/lang/String;

    .line 1304
    .line 1305
    iget-object v1, v0, La/au1;->N1:La/wdk0;

    .line 1306
    .line 1307
    if-eqz v1, :cond_16

    .line 1308
    .line 1309
    new-instance v2, La/xdk0;

    .line 1310
    .line 1311
    sget-object v5, La/rek0;->b:La/rek0;

    .line 1312
    .line 1313
    const/4 v10, 0x0

    .line 1314
    const/16 v11, 0x7c

    .line 1315
    .line 1316
    const/4 v7, 0x0

    .line 1317
    const/4 v8, 0x0

    .line 1318
    const/4 v9, 0x0

    .line 1319
    move-object v4, v2

    .line 1320
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1321
    .line 1322
    .line 1323
    const/16 v8, 0x3fc

    .line 1324
    .line 1325
    const/4 v4, 0x0

    .line 1326
    const/4 v5, 0x0

    .line 1327
    const/4 v6, 0x0

    .line 1328
    move-object v3, v0

    .line 1329
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1330
    .line 1331
    .line 1332
    :goto_7
    invoke-virtual {v3}, La/au1;->G0()La/k3t0;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    sget-object v1, La/as1;->a:La/as1;

    .line 1337
    .line 1338
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1342
    .line 1343
    goto :goto_8

    .line 1344
    :cond_16
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    throw v13

    .line 1348
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 1349
    .line 1350
    .line 1351
    :goto_8
    return-object v13

    .line 1352
    :pswitch_15
    check-cast v0, La/qk1;

    .line 1353
    .line 1354
    move-object/from16 v1, p1

    .line 1355
    .line 1356
    check-cast v1, Ljava/lang/Boolean;

    .line 1357
    .line 1358
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1359
    .line 1360
    .line 1361
    new-instance v3, La/imm;

    .line 1362
    .line 1363
    new-instance v4, La/ilm;

    .line 1364
    .line 1365
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 1366
    .line 1367
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v1

    .line 1371
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1372
    .line 1373
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1374
    .line 1375
    .line 1376
    move-result-wide v5

    .line 1377
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 1378
    .line 1379
    .line 1380
    new-instance v5, La/plm;

    .line 1381
    .line 1382
    iget-object v0, v0, La/qk1;->b:La/ctf0;

    .line 1383
    .line 1384
    new-array v1, v11, [Ljava/lang/Object;

    .line 1385
    .line 1386
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1387
    .line 1388
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v1

    .line 1392
    const v6, 0x7f131663

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v0, v6, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v0

    .line 1399
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v1

    .line 1403
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1404
    .line 1405
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1406
    .line 1407
    .line 1408
    move-result-wide v6

    .line 1409
    invoke-direct {v5, v0, v6, v7, v2}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 1410
    .line 1411
    .line 1412
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v0

    .line 1416
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1417
    .line 1418
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1419
    .line 1420
    .line 1421
    move-result-wide v7

    .line 1422
    const/4 v9, 0x1

    .line 1423
    const/4 v10, 0x0

    .line 1424
    sget-object v6, La/fmm;->a:La/fmm;

    .line 1425
    .line 1426
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 1427
    .line 1428
    .line 1429
    return-object v3

    .line 1430
    :pswitch_16
    move-object v6, v0

    .line 1431
    check-cast v6, La/qj1;

    .line 1432
    .line 1433
    move-object/from16 v0, p1

    .line 1434
    .line 1435
    check-cast v0, La/i8d0;

    .line 1436
    .line 1437
    sget-object v1, La/qj1;->X1:La/qek0;

    .line 1438
    .line 1439
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    instance-of v1, v0, La/h8d0;

    .line 1443
    .line 1444
    if-eqz v1, :cond_19

    .line 1445
    .line 1446
    check-cast v0, La/h8d0;

    .line 1447
    .line 1448
    iget-object v15, v0, La/h8d0;->a:Ljava/lang/String;

    .line 1449
    .line 1450
    iget-object v1, v0, La/h8d0;->b:Ljava/lang/String;

    .line 1451
    .line 1452
    iget-object v0, v0, La/h8d0;->c:Ljava/lang/String;

    .line 1453
    .line 1454
    iget-object v2, v6, La/qj1;->L1:La/ii;

    .line 1455
    .line 1456
    if-eqz v2, :cond_18

    .line 1457
    .line 1458
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1459
    .line 1460
    sget-object v23, La/n12;->b:La/n12;

    .line 1461
    .line 1462
    const/16 v24, 0x0

    .line 1463
    .line 1464
    const/16 v25, 0x5f8

    .line 1465
    .line 1466
    const/16 v18, 0x0

    .line 1467
    .line 1468
    const/16 v19, 0x0

    .line 1469
    .line 1470
    const/16 v20, 0x0

    .line 1471
    .line 1472
    const/16 v21, 0x0

    .line 1473
    .line 1474
    const/16 v22, 0x0

    .line 1475
    .line 1476
    move-object/from16 v17, v0

    .line 1477
    .line 1478
    move-object/from16 v16, v1

    .line 1479
    .line 1480
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v0

    .line 1487
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    invoke-virtual {v2, v14, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1491
    .line 1492
    .line 1493
    goto :goto_9

    .line 1494
    :cond_18
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1495
    .line 1496
    .line 1497
    throw v13

    .line 1498
    :cond_19
    sget-object v1, La/f8d0;->a:La/f8d0;

    .line 1499
    .line 1500
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1501
    .line 1502
    .line 1503
    move-result v1

    .line 1504
    if-eqz v1, :cond_1b

    .line 1505
    .line 1506
    iget-object v0, v6, La/qj1;->M1:La/q5j;

    .line 1507
    .line 1508
    if-eqz v0, :cond_1a

    .line 1509
    .line 1510
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v1

    .line 1514
    invoke-virtual {v0, v1}, La/q5j;->a(Landroidx/fragment/app/e;)V

    .line 1515
    .line 1516
    .line 1517
    goto :goto_9

    .line 1518
    :cond_1a
    const-string v0, "dailyTasksScreenFactory"

    .line 1519
    .line 1520
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1521
    .line 1522
    .line 1523
    throw v13

    .line 1524
    :cond_1b
    instance-of v1, v0, La/g8d0;

    .line 1525
    .line 1526
    if-eqz v1, :cond_1d

    .line 1527
    .line 1528
    check-cast v0, La/g8d0;

    .line 1529
    .line 1530
    iget-object v0, v0, La/g8d0;->a:Ljava/lang/String;

    .line 1531
    .line 1532
    iget-object v4, v6, La/qj1;->N1:La/wdk0;

    .line 1533
    .line 1534
    if-eqz v4, :cond_1c

    .line 1535
    .line 1536
    new-instance v14, La/xdk0;

    .line 1537
    .line 1538
    sget-object v15, La/rek0;->b:La/rek0;

    .line 1539
    .line 1540
    const/16 v20, 0x0

    .line 1541
    .line 1542
    const/16 v21, 0x7c

    .line 1543
    .line 1544
    const/16 v17, 0x0

    .line 1545
    .line 1546
    const/16 v18, 0x0

    .line 1547
    .line 1548
    const/16 v19, 0x0

    .line 1549
    .line 1550
    move-object/from16 v16, v0

    .line 1551
    .line 1552
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1553
    .line 1554
    .line 1555
    const/4 v10, 0x0

    .line 1556
    const/16 v11, 0x3fc

    .line 1557
    .line 1558
    const/4 v7, 0x0

    .line 1559
    const/4 v8, 0x0

    .line 1560
    const/4 v9, 0x0

    .line 1561
    move-object v5, v14

    .line 1562
    invoke-static/range {v4 .. v11}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1563
    .line 1564
    .line 1565
    :goto_9
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1566
    .line 1567
    goto :goto_a

    .line 1568
    :cond_1c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1569
    .line 1570
    .line 1571
    throw v13

    .line 1572
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 1573
    .line 1574
    .line 1575
    :goto_a
    return-object v13

    .line 1576
    :pswitch_17
    check-cast v0, La/ej1;

    .line 1577
    .line 1578
    move-object/from16 v1, p1

    .line 1579
    .line 1580
    check-cast v1, Ljava/lang/Boolean;

    .line 1581
    .line 1582
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1583
    .line 1584
    .line 1585
    new-instance v12, La/imm;

    .line 1586
    .line 1587
    new-instance v13, La/ilm;

    .line 1588
    .line 1589
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 1590
    .line 1591
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v1

    .line 1595
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1596
    .line 1597
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1598
    .line 1599
    .line 1600
    move-result-wide v3

    .line 1601
    invoke-direct {v13, v3, v4}, La/ilm;-><init>(J)V

    .line 1602
    .line 1603
    .line 1604
    iget-object v1, v0, La/ej1;->k:La/n0o0;

    .line 1605
    .line 1606
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1607
    .line 1608
    .line 1609
    move-result-object v3

    .line 1610
    check-cast v3, La/fee;

    .line 1611
    .line 1612
    iget-object v4, v0, La/ej1;->b:La/ctf0;

    .line 1613
    .line 1614
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v3

    .line 1618
    check-cast v3, Ljava/lang/Boolean;

    .line 1619
    .line 1620
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1621
    .line 1622
    .line 1623
    move-result v3

    .line 1624
    if-eqz v3, :cond_1e

    .line 1625
    .line 1626
    new-instance v2, La/nlm;

    .line 1627
    .line 1628
    new-instance v3, La/hmm;

    .line 1629
    .line 1630
    iget-object v0, v0, La/ej1;->l:La/n0o0;

    .line 1631
    .line 1632
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v0

    .line 1636
    check-cast v0, La/fee;

    .line 1637
    .line 1638
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v0

    .line 1642
    check-cast v0, Ljava/lang/String;

    .line 1643
    .line 1644
    new-array v6, v11, [Ljava/lang/Object;

    .line 1645
    .line 1646
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 1647
    .line 1648
    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v6

    .line 1652
    const v7, 0x7f1311c9

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v4, v7, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v4

    .line 1659
    invoke-direct {v3, v5, v0, v4, v11}, La/hmm;-><init>(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 1660
    .line 1661
    .line 1662
    invoke-direct {v2, v3}, La/nlm;-><init>(La/hmm;)V

    .line 1663
    .line 1664
    .line 1665
    move-object v14, v2

    .line 1666
    goto :goto_b

    .line 1667
    :cond_1e
    new-instance v0, La/plm;

    .line 1668
    .line 1669
    new-array v3, v11, [Ljava/lang/Object;

    .line 1670
    .line 1671
    iget-object v4, v4, La/ctf0;->b:La/lsm0;

    .line 1672
    .line 1673
    invoke-static {v3, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v3

    .line 1677
    const v5, 0x7f131070

    .line 1678
    .line 1679
    .line 1680
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v3

    .line 1684
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v4

    .line 1688
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1689
    .line 1690
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1691
    .line 1692
    .line 1693
    move-result-wide v4

    .line 1694
    invoke-direct {v0, v3, v4, v5, v2}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 1695
    .line 1696
    .line 1697
    move-object v14, v0

    .line 1698
    :goto_b
    new-instance v15, La/dmm;

    .line 1699
    .line 1700
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v0

    .line 1704
    check-cast v0, La/fee;

    .line 1705
    .line 1706
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v0

    .line 1710
    check-cast v0, Ljava/lang/Boolean;

    .line 1711
    .line 1712
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1713
    .line 1714
    .line 1715
    move-result v0

    .line 1716
    sget-object v5, La/ra50;->a:La/ra50;

    .line 1717
    .line 1718
    if-eqz v0, :cond_1f

    .line 1719
    .line 1720
    new-instance v0, La/ta50;

    .line 1721
    .line 1722
    new-instance v1, La/wkm;

    .line 1723
    .line 1724
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1725
    .line 1726
    .line 1727
    move-result-object v2

    .line 1728
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1729
    .line 1730
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1731
    .line 1732
    .line 1733
    move-result-wide v6

    .line 1734
    const/4 v2, 0x1

    .line 1735
    const v3, 0x7f080a07

    .line 1736
    .line 1737
    .line 1738
    const/4 v4, 0x1

    .line 1739
    invoke-direct/range {v1 .. v7}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 1740
    .line 1741
    .line 1742
    invoke-direct {v0, v1}, La/ta50;-><init>(La/wkm;)V

    .line 1743
    .line 1744
    .line 1745
    goto :goto_c

    .line 1746
    :cond_1f
    new-instance v0, La/va50;

    .line 1747
    .line 1748
    new-instance v1, La/wkm;

    .line 1749
    .line 1750
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1751
    .line 1752
    .line 1753
    move-result-object v2

    .line 1754
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1755
    .line 1756
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1757
    .line 1758
    .line 1759
    move-result-wide v6

    .line 1760
    const/4 v2, 0x0

    .line 1761
    const v3, 0x7f0809ee

    .line 1762
    .line 1763
    .line 1764
    const/4 v4, 0x1

    .line 1765
    invoke-direct/range {v1 .. v7}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 1766
    .line 1767
    .line 1768
    move-object v8, v1

    .line 1769
    new-instance v1, La/wkm;

    .line 1770
    .line 1771
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v2

    .line 1775
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1776
    .line 1777
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1778
    .line 1779
    .line 1780
    move-result-wide v6

    .line 1781
    const/4 v2, 0x1

    .line 1782
    const v3, 0x7f080a07

    .line 1783
    .line 1784
    .line 1785
    invoke-direct/range {v1 .. v7}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 1786
    .line 1787
    .line 1788
    invoke-direct {v0, v8, v1}, La/va50;-><init>(La/wkm;La/wkm;)V

    .line 1789
    .line 1790
    .line 1791
    :goto_c
    invoke-direct {v15, v0}, La/dmm;-><init>(La/wa50;)V

    .line 1792
    .line 1793
    .line 1794
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v0

    .line 1798
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1799
    .line 1800
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1801
    .line 1802
    .line 1803
    move-result-wide v16

    .line 1804
    const/16 v18, 0x0

    .line 1805
    .line 1806
    const/16 v19, 0x0

    .line 1807
    .line 1808
    invoke-direct/range {v12 .. v19}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 1809
    .line 1810
    .line 1811
    return-object v12

    .line 1812
    :pswitch_18
    check-cast v0, La/ce1;

    .line 1813
    .line 1814
    move-object/from16 v1, p1

    .line 1815
    .line 1816
    check-cast v1, La/k0w0;

    .line 1817
    .line 1818
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1819
    .line 1820
    .line 1821
    iget-object v0, v0, La/ce1;->p:La/peg0;

    .line 1822
    .line 1823
    new-instance v2, La/jr1;

    .line 1824
    .line 1825
    new-instance v3, La/cvc0;

    .line 1826
    .line 1827
    sget-object v4, La/d7v;->b:La/d7v;

    .line 1828
    .line 1829
    invoke-direct {v3, v4}, La/cvc0;-><init>(La/d7v;)V

    .line 1830
    .line 1831
    .line 1832
    invoke-direct {v2, v3}, La/jr1;-><init>(La/fvc0;)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v0

    .line 1839
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1840
    .line 1841
    .line 1842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1843
    .line 1844
    return-object v0

    .line 1845
    :pswitch_19
    check-cast v0, La/m71;

    .line 1846
    .line 1847
    move-object/from16 v1, p1

    .line 1848
    .line 1849
    check-cast v1, La/eg60;

    .line 1850
    .line 1851
    sget-object v2, La/m71;->e2:La/rek0;

    .line 1852
    .line 1853
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1854
    .line 1855
    .line 1856
    invoke-virtual {v0}, La/m71;->J0()La/k3t0;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    sget-object v1, La/q61;->a:La/q61;

    .line 1861
    .line 1862
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1863
    .line 1864
    .line 1865
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1866
    .line 1867
    return-object v0

    .line 1868
    :pswitch_1a
    check-cast v0, La/b61;

    .line 1869
    .line 1870
    move-object/from16 v1, p1

    .line 1871
    .line 1872
    check-cast v1, Ljava/lang/Throwable;

    .line 1873
    .line 1874
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1875
    .line 1876
    .line 1877
    iget-object v0, v0, La/b61;->q:La/duj;

    .line 1878
    .line 1879
    new-instance v2, La/yr0;

    .line 1880
    .line 1881
    invoke-direct {v2, v1, v10}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 1882
    .line 1883
    .line 1884
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1885
    .line 1886
    .line 1887
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1888
    .line 1889
    return-object v0

    .line 1890
    :pswitch_1b
    check-cast v0, La/yzh;

    .line 1891
    .line 1892
    move-object/from16 v1, p1

    .line 1893
    .line 1894
    check-cast v1, La/pi9;

    .line 1895
    .line 1896
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1897
    .line 1898
    .line 1899
    iget-object v14, v0, La/yzh;->f:La/a4x;

    .line 1900
    .line 1901
    iget-object v0, v1, La/pi9;->a:La/y99;

    .line 1902
    .line 1903
    invoke-interface {v0}, La/y99;->d()J

    .line 1904
    .line 1905
    .line 1906
    move-result-wide v2

    .line 1907
    shr-long/2addr v2, v9

    .line 1908
    long-to-int v0, v2

    .line 1909
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1910
    .line 1911
    .line 1912
    move-result v0

    .line 1913
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 1914
    .line 1915
    invoke-interface {v2}, La/y99;->d()J

    .line 1916
    .line 1917
    .line 1918
    move-result-wide v2

    .line 1919
    and-long/2addr v2, v7

    .line 1920
    long-to-int v2, v2

    .line 1921
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1922
    .line 1923
    .line 1924
    move-result v2

    .line 1925
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1926
    .line 1927
    .line 1928
    move-result v0

    .line 1929
    int-to-long v3, v0

    .line 1930
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1931
    .line 1932
    .line 1933
    move-result v0

    .line 1934
    int-to-long v5, v0

    .line 1935
    shl-long v2, v3, v9

    .line 1936
    .line 1937
    and-long v4, v5, v7

    .line 1938
    .line 1939
    or-long v18, v2, v4

    .line 1940
    .line 1941
    new-instance v13, La/e900;

    .line 1942
    .line 1943
    const/4 v15, 0x0

    .line 1944
    const-wide/16 v16, 0x0

    .line 1945
    .line 1946
    invoke-direct/range {v13 .. v19}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 1947
    .line 1948
    .line 1949
    new-instance v0, La/n51;

    .line 1950
    .line 1951
    invoke-direct {v0, v13, v12}, La/n51;-><init>(La/e900;B)V

    .line 1952
    .line 1953
    .line 1954
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v0

    .line 1958
    return-object v0

    .line 1959
    :pswitch_1c
    check-cast v0, La/xzh;

    .line 1960
    .line 1961
    move-object/from16 v1, p1

    .line 1962
    .line 1963
    check-cast v1, La/pi9;

    .line 1964
    .line 1965
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1966
    .line 1967
    .line 1968
    iget-object v13, v0, La/xzh;->n:La/a4x;

    .line 1969
    .line 1970
    iget-object v0, v1, La/pi9;->a:La/y99;

    .line 1971
    .line 1972
    invoke-interface {v0}, La/y99;->d()J

    .line 1973
    .line 1974
    .line 1975
    move-result-wide v2

    .line 1976
    shr-long/2addr v2, v9

    .line 1977
    long-to-int v0, v2

    .line 1978
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1979
    .line 1980
    .line 1981
    move-result v0

    .line 1982
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 1983
    .line 1984
    invoke-interface {v2}, La/y99;->d()J

    .line 1985
    .line 1986
    .line 1987
    move-result-wide v2

    .line 1988
    and-long/2addr v2, v7

    .line 1989
    long-to-int v2, v2

    .line 1990
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1991
    .line 1992
    .line 1993
    move-result v2

    .line 1994
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1995
    .line 1996
    .line 1997
    move-result v0

    .line 1998
    int-to-long v3, v0

    .line 1999
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2000
    .line 2001
    .line 2002
    move-result v0

    .line 2003
    int-to-long v5, v0

    .line 2004
    shl-long v2, v3, v9

    .line 2005
    .line 2006
    and-long v4, v5, v7

    .line 2007
    .line 2008
    or-long v17, v2, v4

    .line 2009
    .line 2010
    new-instance v12, La/e900;

    .line 2011
    .line 2012
    const/4 v14, 0x0

    .line 2013
    const-wide/16 v15, 0x0

    .line 2014
    .line 2015
    invoke-direct/range {v12 .. v18}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 2016
    .line 2017
    .line 2018
    new-instance v0, La/n51;

    .line 2019
    .line 2020
    invoke-direct {v0, v12, v11}, La/n51;-><init>(La/e900;B)V

    .line 2021
    .line 2022
    .line 2023
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    return-object v0

    .line 2028
    nop

    .line 2029
    :pswitch_data_0
    .packed-switch 0x0
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
