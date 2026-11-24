.class public final synthetic La/tr20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/tr20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/tr20;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/tr20;->a:B

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    const/16 v2, 0x14

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v0, p1

    .line 14
    .line 15
    check-cast v0, Ljava/lang/Throwable;

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 21
    .line 22
    .line 23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_0
    move-object/from16 v1, p1

    .line 27
    .line 28
    check-cast v1, La/hcz;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object v5, La/o2e;->c:La/ugd;

    .line 34
    .line 35
    const/4 v6, 0x6

    .line 36
    const/4 v2, 0x4

    .line 37
    const/4 v3, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    move-object/from16 v0, p1

    .line 46
    .line 47
    check-cast v0, La/i740;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/i740;->b:Ljava/lang/String;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_2
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, La/n1g;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance v1, La/rq2;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    iput-object v1, v0, La/n1g;->e:La/ms2;

    .line 68
    .line 69
    sget-object v1, La/l1g;->b:La/l1g;

    .line 70
    .line 71
    iput-object v1, v0, La/n1g;->f:La/l1g;

    .line 72
    .line 73
    sget-object v1, La/k1g;->b:La/k1g;

    .line 74
    .line 75
    iput-object v1, v0, La/n1g;->g:La/k1g;

    .line 76
    .line 77
    sget-object v1, La/j1g;->c:La/j1g;

    .line 78
    .line 79
    iput-object v1, v0, La/n1g;->d:La/j1g;

    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_3
    move-object/from16 v0, p1

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    sget-object v0, La/iun;->a:La/iun;

    .line 92
    .line 93
    return-object v0

    .line 94
    :pswitch_4
    move-object/from16 v0, p1

    .line 95
    .line 96
    check-cast v0, Ljava/lang/Throwable;

    .line 97
    .line 98
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_5
    move-object/from16 v0, p1

    .line 102
    .line 103
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 104
    .line 105
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 106
    .line 107
    return-object v0

    .line 108
    :pswitch_6
    move-object/from16 v0, p1

    .line 109
    .line 110
    check-cast v0, La/ht30;

    .line 111
    .line 112
    sget v1, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryPickerView;->c:I

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :pswitch_7
    move-object/from16 v0, p1

    .line 121
    .line 122
    check-cast v0, Ljava/lang/Throwable;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 128
    .line 129
    .line 130
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_8
    move-object/from16 v0, p1

    .line 134
    .line 135
    check-cast v0, Ljava/lang/Integer;

    .line 136
    .line 137
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    sget v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->e:I

    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :pswitch_9
    move-object/from16 v1, p1

    .line 146
    .line 147
    check-cast v1, La/hcz;

    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 150
    .line 151
    .line 152
    sget-object v5, La/zgc;->c:La/ugd;

    .line 153
    .line 154
    const/4 v6, 0x6

    .line 155
    const/16 v2, 0xe

    .line 156
    .line 157
    const/4 v3, 0x0

    .line 158
    const/4 v4, 0x0

    .line 159
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 160
    .line 161
    .line 162
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object v0

    .line 165
    :pswitch_a
    move-object/from16 v1, p1

    .line 166
    .line 167
    check-cast v1, La/hcz;

    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    sget-object v5, La/y9a;->c:La/ugd;

    .line 173
    .line 174
    const/4 v6, 0x6

    .line 175
    const/16 v2, 0xe

    .line 176
    .line 177
    const/4 v3, 0x0

    .line 178
    const/4 v4, 0x0

    .line 179
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 180
    .line 181
    .line 182
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object v0

    .line 185
    :pswitch_b
    move-object/from16 v0, p1

    .line 186
    .line 187
    check-cast v0, La/p6t0;

    .line 188
    .line 189
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v1, La/sre0;->a:La/tre0;

    .line 197
    .line 198
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    return-object v0

    .line 203
    :pswitch_c
    move-object/from16 v0, p1

    .line 204
    .line 205
    check-cast v0, La/p6t0;

    .line 206
    .line 207
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 208
    .line 209
    .line 210
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    return-object v0

    .line 215
    :pswitch_d
    move-object/from16 v0, p1

    .line 216
    .line 217
    check-cast v0, La/p6t0;

    .line 218
    .line 219
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    sget-object v1, La/sre0;->a:La/tre0;

    .line 227
    .line 228
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    return-object v0

    .line 233
    :pswitch_e
    move-object/from16 v0, p1

    .line 234
    .line 235
    check-cast v0, La/p6t0;

    .line 236
    .line 237
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 238
    .line 239
    .line 240
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    return-object v0

    .line 245
    :pswitch_f
    move-object/from16 v0, p1

    .line 246
    .line 247
    check-cast v0, La/vsr0;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    iget-boolean v0, v0, La/vsr0;->a:Z

    .line 253
    .line 254
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    return-object v0

    .line 259
    :pswitch_10
    move-object/from16 v0, p1

    .line 260
    .line 261
    check-cast v0, La/zvh0;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v0}, La/ydx;->a0(La/zvh0;)La/dxh0;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :pswitch_11
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, La/fee;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    check-cast v0, La/my6;

    .line 283
    .line 284
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    new-instance v5, La/xy6;

    .line 288
    .line 289
    iget-object v1, v0, La/my6;->a:La/md5;

    .line 290
    .line 291
    new-instance v6, La/td5;

    .line 292
    .line 293
    iget-object v2, v1, La/md5;->a:Ljava/lang/String;

    .line 294
    .line 295
    iget v1, v1, La/md5;->b:I

    .line 296
    .line 297
    invoke-direct {v6, v2, v1}, La/td5;-><init>(Ljava/lang/String;I)V

    .line 298
    .line 299
    .line 300
    iget-object v1, v0, La/my6;->b:La/j580;

    .line 301
    .line 302
    new-instance v7, La/m580;

    .line 303
    .line 304
    iget-object v8, v1, La/j580;->a:Ljava/lang/String;

    .line 305
    .line 306
    iget-object v9, v1, La/j580;->b:Ljava/lang/String;

    .line 307
    .line 308
    new-instance v12, La/die0;

    .line 309
    .line 310
    invoke-direct {v12, v4}, La/die0;-><init>(I)V

    .line 311
    .line 312
    .line 313
    new-instance v13, La/die0;

    .line 314
    .line 315
    invoke-direct {v13, v4}, La/die0;-><init>(I)V

    .line 316
    .line 317
    .line 318
    new-instance v14, La/lpm;

    .line 319
    .line 320
    new-instance v2, La/gpm;

    .line 321
    .line 322
    invoke-direct {v2}, La/gpm;-><init>()V

    .line 323
    .line 324
    .line 325
    sget-object v3, La/opm;->a:La/opm;

    .line 326
    .line 327
    invoke-direct {v14, v3, v2}, La/lpm;-><init>(La/rpm;La/ipm;)V

    .line 328
    .line 329
    .line 330
    const/4 v15, 0x1

    .line 331
    iget-boolean v1, v1, La/j580;->c:Z

    .line 332
    .line 333
    const-string v10, ""

    .line 334
    .line 335
    const-string v11, ""

    .line 336
    .line 337
    move/from16 v16, v1

    .line 338
    .line 339
    invoke-direct/range {v7 .. v16}, La/m580;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/die0;La/die0;La/lpm;ZZ)V

    .line 340
    .line 341
    .line 342
    iget-object v0, v0, La/my6;->c:La/kur;

    .line 343
    .line 344
    new-instance v8, La/c0s;

    .line 345
    .line 346
    iget-object v1, v0, La/kur;->a:La/ww20;

    .line 347
    .line 348
    new-instance v9, La/hy20;

    .line 349
    .line 350
    iget-object v1, v1, La/ww20;->a:Ljava/lang/String;

    .line 351
    .line 352
    invoke-direct {v9, v1}, La/hy20;-><init>(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    iget-object v11, v0, La/kur;->b:La/j43;

    .line 356
    .line 357
    sget-object v12, La/wbs0;->d:La/wbs0;

    .line 358
    .line 359
    sget-object v13, La/iho;->a:La/iho;

    .line 360
    .line 361
    sget-object v10, La/p5n0;->a:La/p5n0;

    .line 362
    .line 363
    invoke-direct/range {v8 .. v13}, La/c0s;-><init>(La/hy20;La/s5n0;La/j43;La/wbs0;La/kho;)V

    .line 364
    .line 365
    .line 366
    const/4 v10, 0x0

    .line 367
    const/4 v11, 0x0

    .line 368
    move-object v9, v8

    .line 369
    move-object v8, v7

    .line 370
    const/4 v7, 0x0

    .line 371
    invoke-direct/range {v5 .. v11}, La/xy6;-><init>(La/td5;La/itv;La/p580;La/c0s;La/g0d;La/j680;)V

    .line 372
    .line 373
    .line 374
    return-object v5

    .line 375
    :pswitch_12
    move-object/from16 v0, p1

    .line 376
    .line 377
    check-cast v0, La/cp;

    .line 378
    .line 379
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    iget-object v1, v0, La/cp;->w:Landroid/content/Context;

    .line 383
    .line 384
    const v2, 0x7f08096d

    .line 385
    .line 386
    .line 387
    invoke-virtual {v1, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    const v3, 0x7f040b10

    .line 392
    .line 393
    .line 394
    invoke-static {v2, v1, v3}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 395
    .line 396
    .line 397
    new-instance v1, La/bw20;

    .line 398
    .line 399
    const/4 v3, 0x7

    .line 400
    invoke-direct {v1, v0, v2, v3}, La/bw20;-><init>(La/cp;Ljava/lang/Object;B)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 404
    .line 405
    .line 406
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object v0

    .line 409
    :pswitch_13
    move-object/from16 v0, p1

    .line 410
    .line 411
    check-cast v0, Landroid/content/Context;

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    const v1, 0x7f0d060b

    .line 421
    .line 422
    .line 423
    invoke-virtual {v0, v1, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 424
    .line 425
    .line 426
    move-result-object v0

    .line 427
    invoke-static {v0}, La/zkk;->a(Landroid/view/View;)La/zkk;

    .line 428
    .line 429
    .line 430
    move-result-object v0

    .line 431
    iget-object v0, v0, La/zkk;->f:Landroid/view/ViewGroup;

    .line 432
    .line 433
    check-cast v0, Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 434
    .line 435
    return-object v0

    .line 436
    :pswitch_14
    move-object/from16 v0, p1

    .line 437
    .line 438
    check-cast v0, La/tg30;

    .line 439
    .line 440
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    iget-object v1, v0, La/tg30;->b:Ljava/util/List;

    .line 444
    .line 445
    new-instance v2, Ljava/util/ArrayList;

    .line 446
    .line 447
    const/16 v5, 0xa

    .line 448
    .line 449
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 450
    .line 451
    .line 452
    move-result v5

    .line 453
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 454
    .line 455
    .line 456
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v5

    .line 460
    move v6, v4

    .line 461
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v7

    .line 465
    if-eqz v7, :cond_6

    .line 466
    .line 467
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v7

    .line 471
    add-int/lit8 v8, v6, 0x1

    .line 472
    .line 473
    if-ltz v6, :cond_5

    .line 474
    .line 475
    move-object v10, v7

    .line 476
    check-cast v10, La/lg30;

    .line 477
    .line 478
    new-instance v9, La/mg30;

    .line 479
    .line 480
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    invoke-virtual {v10}, Ljava/lang/Enum;->ordinal()I

    .line 484
    .line 485
    .line 486
    move-result v7

    .line 487
    const/4 v11, 0x1

    .line 488
    if-eqz v7, :cond_2

    .line 489
    .line 490
    if-eq v7, v11, :cond_1

    .line 491
    .line 492
    const/4 v12, 0x2

    .line 493
    if-ne v7, v12, :cond_0

    .line 494
    .line 495
    const v7, 0x7f130792

    .line 496
    .line 497
    .line 498
    goto :goto_1

    .line 499
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 500
    .line 501
    .line 502
    goto :goto_5

    .line 503
    :cond_1
    const v7, 0x7f131506

    .line 504
    .line 505
    .line 506
    goto :goto_1

    .line 507
    :cond_2
    const v7, 0x7f130da8

    .line 508
    .line 509
    .line 510
    :goto_1
    iget-object v12, v0, La/tg30;->a:La/lg30;

    .line 511
    .line 512
    if-ne v10, v12, :cond_3

    .line 513
    .line 514
    sget-object v12, La/s6t0;->a:La/pz40;

    .line 515
    .line 516
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 517
    .line 518
    .line 519
    move-result-object v12

    .line 520
    iget-object v12, v12, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 521
    .line 522
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 523
    .line 524
    .line 525
    move-result-wide v12

    .line 526
    goto :goto_2

    .line 527
    :cond_3
    sget-object v12, La/s6t0;->a:La/pz40;

    .line 528
    .line 529
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 530
    .line 531
    .line 532
    move-result-object v12

    .line 533
    iget-object v12, v12, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 534
    .line 535
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 536
    .line 537
    .line 538
    move-result-wide v12

    .line 539
    :goto_2
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 540
    .line 541
    .line 542
    move-result v14

    .line 543
    sub-int/2addr v14, v11

    .line 544
    if-eq v6, v14, :cond_4

    .line 545
    .line 546
    move v14, v11

    .line 547
    :goto_3
    move v11, v7

    .line 548
    goto :goto_4

    .line 549
    :cond_4
    move v14, v4

    .line 550
    goto :goto_3

    .line 551
    :goto_4
    invoke-direct/range {v9 .. v14}, La/mg30;-><init>(La/lg30;IJZ)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move v6, v8

    .line 558
    goto :goto_0

    .line 559
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 560
    .line 561
    .line 562
    throw v3

    .line 563
    :cond_6
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 564
    .line 565
    .line 566
    move-result-object v0

    .line 567
    new-instance v3, La/ug30;

    .line 568
    .line 569
    invoke-direct {v3, v0}, La/ug30;-><init>(La/i4;)V

    .line 570
    .line 571
    .line 572
    :goto_5
    return-object v3

    .line 573
    :pswitch_15
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, La/aw20;

    .line 576
    .line 577
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 578
    .line 579
    .line 580
    invoke-static {v0}, La/x8x;->G(La/aw20;)La/qil0;

    .line 581
    .line 582
    .line 583
    move-result-object v0

    .line 584
    return-object v0

    .line 585
    :pswitch_16
    move-object/from16 v0, p1

    .line 586
    .line 587
    check-cast v0, La/ny20;

    .line 588
    .line 589
    sget-object v1, La/v330;->Q1:La/xuz;

    .line 590
    .line 591
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_17
    move-object/from16 v0, p1

    .line 598
    .line 599
    check-cast v0, La/xgl0;

    .line 600
    .line 601
    sget-object v1, La/v330;->Q1:La/xuz;

    .line 602
    .line 603
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 604
    .line 605
    .line 606
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 607
    .line 608
    return-object v0

    .line 609
    :pswitch_18
    move-object/from16 v0, p1

    .line 610
    .line 611
    check-cast v0, La/wgl0;

    .line 612
    .line 613
    sget-object v1, La/v330;->Q1:La/xuz;

    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_19
    move-object/from16 v0, p1

    .line 622
    .line 623
    check-cast v0, La/hcz;

    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    :goto_6
    if-ge v4, v2, :cond_7

    .line 629
    .line 630
    sget-object v5, La/ay3;->j:La/ugd;

    .line 631
    .line 632
    invoke-static {v0, v3, v3, v5, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 633
    .line 634
    .line 635
    add-int/lit8 v4, v4, 0x1

    .line 636
    .line 637
    goto :goto_6

    .line 638
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 639
    .line 640
    return-object v0

    .line 641
    :pswitch_1a
    move-object/from16 v0, p1

    .line 642
    .line 643
    check-cast v0, La/hcz;

    .line 644
    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    :goto_7
    if-ge v4, v2, :cond_8

    .line 649
    .line 650
    sget-object v5, La/xf0;->l:La/ugd;

    .line 651
    .line 652
    invoke-static {v0, v3, v3, v5, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 653
    .line 654
    .line 655
    add-int/lit8 v4, v4, 0x1

    .line 656
    .line 657
    goto :goto_7

    .line 658
    :cond_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 659
    .line 660
    return-object v0

    .line 661
    :pswitch_1b
    move-object/from16 v0, p1

    .line 662
    .line 663
    check-cast v0, La/hcz;

    .line 664
    .line 665
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 666
    .line 667
    .line 668
    :goto_8
    if-ge v4, v2, :cond_9

    .line 669
    .line 670
    sget-object v5, La/dwi0;->g:La/ugd;

    .line 671
    .line 672
    invoke-static {v0, v3, v3, v5, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 673
    .line 674
    .line 675
    add-int/lit8 v4, v4, 0x1

    .line 676
    .line 677
    goto :goto_8

    .line 678
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 679
    .line 680
    return-object v0

    .line 681
    :pswitch_1c
    move-object/from16 v0, p1

    .line 682
    .line 683
    check-cast v0, La/ig7;

    .line 684
    .line 685
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 686
    .line 687
    .line 688
    iget-wide v0, v0, La/ig7;->b:J

    .line 689
    .line 690
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    return-object v0

    .line 695
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
