.class public final synthetic La/ka70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ka70;->a:B

    iput-object p1, p0, La/ka70;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ka70;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ka70;->a:B

    .line 4
    .line 5
    const/4 v8, 0x0

    .line 6
    const/16 v9, 0x12

    .line 7
    .line 8
    const/4 v10, 0x3

    .line 9
    const-string v11, ""

    .line 10
    .line 11
    const-wide/16 v12, -0x1

    .line 12
    .line 13
    const v2, 0x799532c4

    .line 14
    .line 15
    .line 16
    const/16 v18, 0x8

    .line 17
    .line 18
    const/16 v15, 0x10

    .line 19
    .line 20
    const/4 v14, 0x2

    .line 21
    const/4 v4, 0x4

    .line 22
    const/4 v3, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x1

    .line 25
    iget-object v7, v0, La/ka70;->c:Ljava/lang/Object;

    .line 26
    .line 27
    iget-object v0, v0, La/ka70;->b:Ljava/lang/Object;

    .line 28
    .line 29
    packed-switch v1, :pswitch_data_0

    .line 30
    .line 31
    .line 32
    check-cast v0, La/z430;

    .line 33
    .line 34
    check-cast v7, La/k3t0;

    .line 35
    .line 36
    move-object/from16 v1, p1

    .line 37
    .line 38
    check-cast v1, La/bdn;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    iget-object v1, v1, La/bdn;->a:La/y130;

    .line 44
    .line 45
    invoke-virtual {v0, v1, v12, v13, v11}, La/z430;->a(La/y130;JLjava/lang/String;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, La/qcn;->a:La/qcn;

    .line 49
    .line 50
    invoke-virtual {v7, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_0
    check-cast v0, La/cp;

    .line 57
    .line 58
    check-cast v7, La/rpg;

    .line 59
    .line 60
    move-object/from16 v1, p1

    .line 61
    .line 62
    check-cast v1, Ljava/util/List;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 68
    .line 69
    check-cast v1, La/vjd;

    .line 70
    .line 71
    iget-object v1, v1, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 72
    .line 73
    new-instance v2, La/r7a0;

    .line 74
    .line 75
    invoke-direct {v2, v0, v7, v4}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 76
    .line 77
    .line 78
    new-instance v0, La/ugd;

    .line 79
    .line 80
    const v3, -0x3d83708e

    .line 81
    .line 82
    .line 83
    invoke-direct {v0, v3, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    :pswitch_1
    check-cast v0, La/cp;

    .line 93
    .line 94
    check-cast v7, La/x6f;

    .line 95
    .line 96
    move-object/from16 v1, p1

    .line 97
    .line 98
    check-cast v1, Ljava/util/List;

    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 104
    .line 105
    check-cast v1, La/vjd;

    .line 106
    .line 107
    iget-object v1, v1, La/vjd;->b:Landroidx/compose/ui/platform/ComposeView;

    .line 108
    .line 109
    new-instance v2, La/r7a0;

    .line 110
    .line 111
    invoke-direct {v2, v0, v7, v10}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/ugd;

    .line 115
    .line 116
    const v3, -0x1c0facbf

    .line 117
    .line 118
    .line 119
    invoke-direct {v0, v3, v6, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v0}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object v0

    .line 128
    :pswitch_2
    check-cast v0, La/vne;

    .line 129
    .line 130
    check-cast v7, La/pz40;

    .line 131
    .line 132
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Landroid/view/SurfaceView;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 140
    .line 141
    const/16 v4, 0x22

    .line 142
    .line 143
    if-ne v2, v4, :cond_0

    .line 144
    .line 145
    sget-object v2, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    .line 146
    .line 147
    const-string v4, "robolectric"

    .line 148
    .line 149
    invoke-static {v2, v4}, Lkotlin/text/c;->o(Ljava/lang/String;Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    if-nez v2, :cond_0

    .line 154
    .line 155
    sget-object v2, La/tvk;->a:La/rwj;

    .line 156
    .line 157
    sget-object v2, La/ys10;->a:La/vs10;

    .line 158
    .line 159
    new-instance v4, La/qba0;

    .line 160
    .line 161
    invoke-direct {v4, v1, v7, v3}, La/qba0;-><init>(Landroid/view/SurfaceView;La/pz40;La/yje;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v2, v3, v4, v14}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 165
    .line 166
    .line 167
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_3
    check-cast v0, La/z430;

    .line 171
    .line 172
    check-cast v7, La/i3t0;

    .line 173
    .line 174
    move-object/from16 v1, p1

    .line 175
    .line 176
    check-cast v1, La/w6a0;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v1, v1, La/w6a0;->a:La/y130;

    .line 182
    .line 183
    invoke-virtual {v0, v1, v12, v13, v11}, La/z430;->a(La/y130;JLjava/lang/String;)V

    .line 184
    .line 185
    .line 186
    sget-object v0, La/k6a0;->a:La/k6a0;

    .line 187
    .line 188
    invoke-virtual {v7, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object v0

    .line 194
    :pswitch_4
    check-cast v0, La/z5a0;

    .line 195
    .line 196
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 197
    .line 198
    move-object/from16 v1, p1

    .line 199
    .line 200
    check-cast v1, La/hcz;

    .line 201
    .line 202
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    move-object v4, v0

    .line 206
    check-cast v4, La/w5a0;

    .line 207
    .line 208
    iget-object v4, v4, La/w5a0;->d:La/a4x;

    .line 209
    .line 210
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 211
    .line 212
    .line 213
    move-result v5

    .line 214
    new-instance v8, La/ubn;

    .line 215
    .line 216
    invoke-direct {v8, v4, v9}, La/ubn;-><init>(La/a4x;B)V

    .line 217
    .line 218
    .line 219
    new-instance v9, La/h8w;

    .line 220
    .line 221
    invoke-direct {v9, v4, v0, v7, v15}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 222
    .line 223
    .line 224
    new-instance v0, La/ugd;

    .line 225
    .line 226
    invoke-direct {v0, v2, v6, v9}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v5, v3, v8, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 230
    .line 231
    .line 232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_5
    check-cast v0, La/pu90;

    .line 236
    .line 237
    check-cast v7, Ljava/util/ArrayList;

    .line 238
    .line 239
    move-object/from16 v1, p1

    .line 240
    .line 241
    check-cast v1, La/ou90;

    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v0, v5, v5, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    move v2, v5

    .line 254
    :goto_0
    if-ge v2, v0, :cond_3

    .line 255
    .line 256
    invoke-virtual {v7, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    check-cast v4, La/pu90;

    .line 261
    .line 262
    invoke-virtual {v4}, La/pu90;->n()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    instance-of v9, v6, La/tnf0;

    .line 267
    .line 268
    if-eqz v9, :cond_1

    .line 269
    .line 270
    check-cast v6, La/tnf0;

    .line 271
    .line 272
    goto :goto_1

    .line 273
    :cond_1
    move-object v6, v3

    .line 274
    :goto_1
    if-eqz v6, :cond_2

    .line 275
    .line 276
    iget v9, v6, La/tnf0;->b:F

    .line 277
    .line 278
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    iget v6, v6, La/tnf0;->c:F

    .line 283
    .line 284
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 285
    .line 286
    .line 287
    move-result v6

    .line 288
    invoke-virtual {v1, v4, v9, v6, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 289
    .line 290
    .line 291
    goto :goto_2

    .line 292
    :cond_2
    invoke-virtual {v1, v4, v5, v5, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 293
    .line 294
    .line 295
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 296
    .line 297
    goto :goto_0

    .line 298
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_6
    check-cast v0, Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;

    .line 302
    .line 303
    check-cast v7, La/ocl;

    .line 304
    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    check-cast v1, La/p2a0;

    .line 308
    .line 309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    .line 311
    .line 312
    new-instance v2, La/y2a0;

    .line 313
    .line 314
    invoke-direct {v2, v0, v1, v7}, La/y2a0;-><init>(Lorg/xplatform/playersduel/impl/presentation/players_duel/screen/PlayersDuelParams;La/p2a0;La/ocl;)V

    .line 315
    .line 316
    .line 317
    return-object v2

    .line 318
    :pswitch_7
    check-cast v0, La/wno0;

    .line 319
    .line 320
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 321
    .line 322
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, La/hcz;

    .line 325
    .line 326
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object v0, v0, La/wno0;->b:La/a4x;

    .line 330
    .line 331
    new-instance v3, La/so90;

    .line 332
    .line 333
    const/16 v4, 0xd

    .line 334
    .line 335
    invoke-direct {v3, v4}, La/so90;-><init>(B)V

    .line 336
    .line 337
    .line 338
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 339
    .line 340
    .line 341
    move-result v4

    .line 342
    new-instance v5, La/zu90;

    .line 343
    .line 344
    invoke-direct {v5, v6, v3, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    new-instance v3, La/a580;

    .line 348
    .line 349
    const/16 v8, 0x11

    .line 350
    .line 351
    invoke-direct {v3, v0, v8}, La/a580;-><init>(Ljava/util/List;B)V

    .line 352
    .line 353
    .line 354
    new-instance v8, La/a100;

    .line 355
    .line 356
    invoke-direct {v8, v0, v7, v9}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 357
    .line 358
    .line 359
    new-instance v0, La/ugd;

    .line 360
    .line 361
    invoke-direct {v0, v2, v6, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v1, v4, v5, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 365
    .line 366
    .line 367
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_8
    check-cast v0, La/vno0;

    .line 371
    .line 372
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 373
    .line 374
    move-object/from16 v8, p1

    .line 375
    .line 376
    check-cast v8, La/i8z;

    .line 377
    .line 378
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    iget-object v0, v0, La/vno0;->b:La/a4x;

    .line 382
    .line 383
    new-instance v1, La/so90;

    .line 384
    .line 385
    const/16 v2, 0xb

    .line 386
    .line 387
    invoke-direct {v1, v2}, La/so90;-><init>(B)V

    .line 388
    .line 389
    .line 390
    new-instance v2, La/t330;

    .line 391
    .line 392
    const/4 v3, 0x6

    .line 393
    invoke-direct {v2, v3}, La/t330;-><init>(B)V

    .line 394
    .line 395
    .line 396
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 397
    .line 398
    .line 399
    move-result v9

    .line 400
    new-instance v10, La/zu90;

    .line 401
    .line 402
    invoke-direct {v10, v5, v1, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    new-instance v11, La/a8;

    .line 406
    .line 407
    const/16 v1, 0x14

    .line 408
    .line 409
    invoke-direct {v11, v2, v0, v1}, La/a8;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 410
    .line 411
    .line 412
    new-instance v12, La/a580;

    .line 413
    .line 414
    const/16 v1, 0xf

    .line 415
    .line 416
    invoke-direct {v12, v0, v1}, La/a580;-><init>(Ljava/util/List;B)V

    .line 417
    .line 418
    .line 419
    new-instance v1, La/a100;

    .line 420
    .line 421
    const/16 v2, 0x11

    .line 422
    .line 423
    invoke-direct {v1, v0, v7, v2}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 424
    .line 425
    .line 426
    new-instance v13, La/ugd;

    .line 427
    .line 428
    const v0, -0x73c450aa

    .line 429
    .line 430
    .line 431
    invoke-direct {v13, v0, v6, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual/range {v8 .. v13}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 435
    .line 436
    .line 437
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_9
    check-cast v0, La/du90;

    .line 441
    .line 442
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 443
    .line 444
    move-object/from16 v8, p1

    .line 445
    .line 446
    check-cast v8, La/i8z;

    .line 447
    .line 448
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    iget-object v0, v0, La/du90;->d:La/a4x;

    .line 452
    .line 453
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 454
    .line 455
    .line 456
    move-result v9

    .line 457
    new-instance v12, La/a580;

    .line 458
    .line 459
    const/16 v1, 0xe

    .line 460
    .line 461
    invoke-direct {v12, v0, v1}, La/a580;-><init>(Ljava/util/List;B)V

    .line 462
    .line 463
    .line 464
    new-instance v1, La/a100;

    .line 465
    .line 466
    invoke-direct {v1, v0, v7, v15}, La/a100;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;B)V

    .line 467
    .line 468
    .line 469
    new-instance v13, La/ugd;

    .line 470
    .line 471
    const v0, -0x4297e015

    .line 472
    .line 473
    .line 474
    invoke-direct {v13, v0, v6, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    const/4 v10, 0x0

    .line 478
    const/4 v11, 0x0

    .line 479
    invoke-virtual/range {v8 .. v13}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_a
    check-cast v0, La/xr90;

    .line 486
    .line 487
    check-cast v7, Lorg/xplatform/picker/api/presentation/PickerDialogParams;

    .line 488
    .line 489
    move-object/from16 v1, p1

    .line 490
    .line 491
    check-cast v1, Ljava/util/List;

    .line 492
    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 497
    .line 498
    .line 499
    move-result v2

    .line 500
    if-eqz v2, :cond_4

    .line 501
    .line 502
    new-instance v1, La/nr90;

    .line 503
    .line 504
    iget-object v0, v0, La/xr90;->f:La/n0o0;

    .line 505
    .line 506
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, La/mdm;

    .line 511
    .line 512
    invoke-direct {v1, v0}, La/nr90;-><init>(La/mdm;)V

    .line 513
    .line 514
    .line 515
    goto/16 :goto_f

    .line 516
    .line 517
    :cond_4
    new-instance v2, La/mr90;

    .line 518
    .line 519
    iget-object v0, v0, La/xr90;->a:La/ctf0;

    .line 520
    .line 521
    iget-object v4, v7, Lorg/xplatform/picker/api/presentation/PickerDialogParams;->a:Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;

    .line 522
    .line 523
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    invoke-interface {v4}, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType;->b0()Ljava/lang/Integer;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    instance-of v8, v4, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Language;

    .line 534
    .line 535
    const/16 v9, 0xa

    .line 536
    .line 537
    if-eqz v8, :cond_5

    .line 538
    .line 539
    goto :goto_3

    .line 540
    :cond_5
    instance-of v8, v4, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$Gender;

    .line 541
    .line 542
    if-eqz v8, :cond_6

    .line 543
    .line 544
    goto :goto_3

    .line 545
    :cond_6
    instance-of v4, v4, Lorg/xplatform/picker/api/presentation/PickerDialogParams$PickerType$ResidentStatus;

    .line 546
    .line 547
    if-eqz v4, :cond_a

    .line 548
    .line 549
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 550
    .line 551
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 556
    .line 557
    .line 558
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 563
    .line 564
    .line 565
    move-result v3

    .line 566
    if-eqz v3, :cond_9

    .line 567
    .line 568
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    move-result-object v3

    .line 572
    check-cast v3, La/nq90;

    .line 573
    .line 574
    invoke-interface {v3}, La/nq90;->getId()I

    .line 575
    .line 576
    .line 577
    move-result v4

    .line 578
    if-nez v7, :cond_7

    .line 579
    .line 580
    goto :goto_5

    .line 581
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 582
    .line 583
    .line 584
    move-result v8

    .line 585
    if-ne v4, v8, :cond_8

    .line 586
    .line 587
    move v4, v6

    .line 588
    goto :goto_6

    .line 589
    :cond_8
    :goto_5
    move v4, v5

    .line 590
    :goto_6
    invoke-static {v3, v4}, La/r8x;->Z(La/nq90;Z)La/aq90;

    .line 591
    .line 592
    .line 593
    move-result-object v3

    .line 594
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    goto :goto_4

    .line 598
    :cond_9
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    goto/16 :goto_e

    .line 603
    .line 604
    :cond_a
    new-instance v4, Ljava/util/ArrayList;

    .line 605
    .line 606
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 607
    .line 608
    .line 609
    new-instance v8, Ljava/util/ArrayList;

    .line 610
    .line 611
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 612
    .line 613
    .line 614
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 615
    .line 616
    .line 617
    move-result-object v10

    .line 618
    :cond_b
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 619
    .line 620
    .line 621
    move-result v11

    .line 622
    if-eqz v11, :cond_e

    .line 623
    .line 624
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 625
    .line 626
    .line 627
    move-result-object v11

    .line 628
    move-object v12, v11

    .line 629
    check-cast v12, La/nq90;

    .line 630
    .line 631
    invoke-interface {v12}, La/nq90;->a()Z

    .line 632
    .line 633
    .line 634
    move-result v13

    .line 635
    if-eqz v13, :cond_c

    .line 636
    .line 637
    goto :goto_8

    .line 638
    :cond_c
    invoke-interface {v12}, La/nq90;->getId()I

    .line 639
    .line 640
    .line 641
    move-result v12

    .line 642
    if-nez v7, :cond_d

    .line 643
    .line 644
    goto :goto_7

    .line 645
    :cond_d
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    if-ne v12, v13, :cond_b

    .line 650
    .line 651
    :goto_8
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 652
    .line 653
    .line 654
    goto :goto_7

    .line 655
    :cond_e
    new-instance v10, La/dq90;

    .line 656
    .line 657
    invoke-direct {v10, v7, v5}, La/dq90;-><init>(Ljava/lang/Integer;B)V

    .line 658
    .line 659
    .line 660
    invoke-static {v8, v10}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 661
    .line 662
    .line 663
    move-result-object v8

    .line 664
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 665
    .line 666
    .line 667
    move-result v10

    .line 668
    if-nez v10, :cond_f

    .line 669
    .line 670
    new-instance v10, La/bq90;

    .line 671
    .line 672
    new-array v11, v5, [Ljava/lang/Object;

    .line 673
    .line 674
    iget-object v12, v0, La/ctf0;->b:La/lsm0;

    .line 675
    .line 676
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v11

    .line 680
    const v13, 0x7f1310d8

    .line 681
    .line 682
    .line 683
    invoke-virtual {v12, v13, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 684
    .line 685
    .line 686
    move-result-object v11

    .line 687
    invoke-direct {v10, v11}, La/bq90;-><init>(Ljava/lang/String;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    :cond_f
    new-instance v10, Ljava/util/ArrayList;

    .line 694
    .line 695
    invoke-static {v8, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 696
    .line 697
    .line 698
    move-result v11

    .line 699
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 700
    .line 701
    .line 702
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 703
    .line 704
    .line 705
    move-result-object v11

    .line 706
    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 707
    .line 708
    .line 709
    move-result v12

    .line 710
    if-eqz v12, :cond_12

    .line 711
    .line 712
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v12

    .line 716
    check-cast v12, La/nq90;

    .line 717
    .line 718
    invoke-interface {v12}, La/nq90;->getId()I

    .line 719
    .line 720
    .line 721
    move-result v13

    .line 722
    if-nez v7, :cond_10

    .line 723
    .line 724
    goto :goto_a

    .line 725
    :cond_10
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 726
    .line 727
    .line 728
    move-result v14

    .line 729
    if-ne v13, v14, :cond_11

    .line 730
    .line 731
    move v13, v6

    .line 732
    goto :goto_b

    .line 733
    :cond_11
    :goto_a
    move v13, v5

    .line 734
    :goto_b
    invoke-static {v12, v13}, La/r8x;->Z(La/nq90;Z)La/aq90;

    .line 735
    .line 736
    .line 737
    move-result-object v12

    .line 738
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 739
    .line 740
    .line 741
    move-result v12

    .line 742
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 743
    .line 744
    .line 745
    move-result-object v12

    .line 746
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 747
    .line 748
    .line 749
    goto :goto_9

    .line 750
    :cond_12
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 751
    .line 752
    .line 753
    move-result v7

    .line 754
    if-nez v7, :cond_13

    .line 755
    .line 756
    new-instance v7, La/bq90;

    .line 757
    .line 758
    new-array v10, v5, [Ljava/lang/Object;

    .line 759
    .line 760
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 761
    .line 762
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v10

    .line 766
    const v11, 0x7f130ee1

    .line 767
    .line 768
    .line 769
    invoke-virtual {v0, v11, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 770
    .line 771
    .line 772
    move-result-object v0

    .line 773
    invoke-direct {v7, v0}, La/bq90;-><init>(Ljava/lang/String;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    :cond_13
    new-instance v0, Ljava/util/ArrayList;

    .line 780
    .line 781
    invoke-static {v1, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 782
    .line 783
    .line 784
    move-result v7

    .line 785
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 786
    .line 787
    .line 788
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 793
    .line 794
    .line 795
    move-result v7

    .line 796
    if-eqz v7, :cond_17

    .line 797
    .line 798
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v7

    .line 802
    check-cast v7, La/nq90;

    .line 803
    .line 804
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 805
    .line 806
    .line 807
    move-result-object v9

    .line 808
    :cond_14
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 809
    .line 810
    .line 811
    move-result v10

    .line 812
    if-eqz v10, :cond_15

    .line 813
    .line 814
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v10

    .line 818
    move-object v11, v10

    .line 819
    check-cast v11, La/nq90;

    .line 820
    .line 821
    invoke-interface {v11}, La/nq90;->getId()I

    .line 822
    .line 823
    .line 824
    move-result v11

    .line 825
    invoke-interface {v7}, La/nq90;->getId()I

    .line 826
    .line 827
    .line 828
    move-result v12

    .line 829
    if-ne v11, v12, :cond_14

    .line 830
    .line 831
    goto :goto_d

    .line 832
    :cond_15
    move-object v10, v3

    .line 833
    :goto_d
    if-nez v10, :cond_16

    .line 834
    .line 835
    invoke-static {v7, v5}, La/r8x;->Z(La/nq90;Z)La/aq90;

    .line 836
    .line 837
    .line 838
    move-result-object v7

    .line 839
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 840
    .line 841
    .line 842
    :cond_16
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 843
    .line 844
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 845
    .line 846
    .line 847
    goto :goto_c

    .line 848
    :cond_17
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v0

    .line 852
    instance-of v0, v0, La/bq90;

    .line 853
    .line 854
    if-eqz v0, :cond_18

    .line 855
    .line 856
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 857
    .line 858
    .line 859
    move-result v0

    .line 860
    sub-int/2addr v0, v6

    .line 861
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 862
    .line 863
    .line 864
    :cond_18
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    :goto_e
    invoke-direct {v2, v0}, La/mr90;-><init>(La/a4x;)V

    .line 869
    .line 870
    .line 871
    move-object v1, v2

    .line 872
    :goto_f
    return-object v1

    .line 873
    :pswitch_b
    check-cast v0, Ljava/lang/String;

    .line 874
    .line 875
    check-cast v7, La/ar90;

    .line 876
    .line 877
    move-object/from16 v1, p1

    .line 878
    .line 879
    check-cast v1, La/abi0;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    sget-object v2, La/cbi0;->a:[La/iiy;

    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    sget-object v2, La/cbi0;->j:La/zai0;

    .line 890
    .line 891
    sget-object v3, La/cbi0;->a:[La/iiy;

    .line 892
    .line 893
    aget-object v4, v3, v18

    .line 894
    .line 895
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 902
    .line 903
    .line 904
    move-result-object v0

    .line 905
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    sget-object v2, La/cbi0;->k:La/zai0;

    .line 909
    .line 910
    const/16 v4, 0x9

    .line 911
    .line 912
    aget-object v3, v3, v4

    .line 913
    .line 914
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 918
    .line 919
    .line 920
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 921
    .line 922
    return-object v0

    .line 923
    :pswitch_c
    check-cast v0, La/l7m0;

    .line 924
    .line 925
    check-cast v7, La/dn90;

    .line 926
    .line 927
    move-object/from16 v1, p1

    .line 928
    .line 929
    check-cast v1, La/hcz;

    .line 930
    .line 931
    sget v3, La/dn90;->m2:I

    .line 932
    .line 933
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 937
    .line 938
    .line 939
    move-result-object v3

    .line 940
    check-cast v3, La/in90;

    .line 941
    .line 942
    iget-object v3, v3, La/in90;->a:La/a4x;

    .line 943
    .line 944
    new-instance v4, La/ch90;

    .line 945
    .line 946
    const/16 v5, 0x1b

    .line 947
    .line 948
    invoke-direct {v4, v5}, La/ch90;-><init>(B)V

    .line 949
    .line 950
    .line 951
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 952
    .line 953
    .line 954
    move-result v5

    .line 955
    new-instance v8, La/m160;

    .line 956
    .line 957
    const/16 v9, 0x1c

    .line 958
    .line 959
    invoke-direct {v8, v4, v3, v9}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 960
    .line 961
    .line 962
    new-instance v4, La/ubn;

    .line 963
    .line 964
    invoke-direct {v4, v3, v15}, La/ubn;-><init>(La/a4x;B)V

    .line 965
    .line 966
    .line 967
    new-instance v9, La/h8w;

    .line 968
    .line 969
    const/16 v10, 0xf

    .line 970
    .line 971
    invoke-direct {v9, v3, v7, v0, v10}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 972
    .line 973
    .line 974
    new-instance v0, La/ugd;

    .line 975
    .line 976
    invoke-direct {v0, v2, v6, v9}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 977
    .line 978
    .line 979
    invoke-virtual {v1, v5, v8, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 980
    .line 981
    .line 982
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 983
    .line 984
    return-object v0

    .line 985
    :pswitch_d
    check-cast v0, La/hz;

    .line 986
    .line 987
    check-cast v7, La/cp;

    .line 988
    .line 989
    move-object/from16 v1, p1

    .line 990
    .line 991
    check-cast v1, Ljava/lang/String;

    .line 992
    .line 993
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 994
    .line 995
    .line 996
    invoke-virtual {v7}, La/cp;->u()Ljava/lang/Object;

    .line 997
    .line 998
    .line 999
    move-result-object v2

    .line 1000
    check-cast v2, La/xl90;

    .line 1001
    .line 1002
    iget-object v2, v2, La/xl90;->a:La/vqp;

    .line 1003
    .line 1004
    invoke-virtual {v0, v1, v2}, La/hz;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_e
    check-cast v0, La/hz;

    .line 1011
    .line 1012
    check-cast v7, La/gz;

    .line 1013
    .line 1014
    move-object/from16 v1, p1

    .line 1015
    .line 1016
    check-cast v1, La/cp;

    .line 1017
    .line 1018
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1022
    .line 1023
    check-cast v2, La/cfx;

    .line 1024
    .line 1025
    iget-object v3, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1026
    .line 1027
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->b()V

    .line 1028
    .line 1029
    .line 1030
    iget-object v3, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1031
    .line 1032
    invoke-virtual {v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->a()V

    .line 1033
    .line 1034
    .line 1035
    iget-object v2, v2, La/cfx;->b:Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;

    .line 1036
    .line 1037
    new-instance v3, La/ka70;

    .line 1038
    .line 1039
    const/16 v10, 0xf

    .line 1040
    .line 1041
    invoke-direct {v3, v0, v1, v10}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1042
    .line 1043
    .line 1044
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setAfterTextFormattingCallback(Lkotlin/jvm/functions/Function1;)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeFocusable(Z)V

    .line 1048
    .line 1049
    .line 1050
    new-instance v0, La/l910;

    .line 1051
    .line 1052
    const/16 v3, 0xe

    .line 1053
    .line 1054
    invoke-direct {v0, v7, v3}, La/l910;-><init>(Ljava/lang/Object;B)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/phone_text_field/DsPhoneTextField;->setCodeClickListener(Landroid/view/View$OnClickListener;)V

    .line 1058
    .line 1059
    .line 1060
    new-instance v0, La/bb;

    .line 1061
    .line 1062
    const/16 v2, 0xc

    .line 1063
    .line 1064
    invoke-direct {v0, v1, v2}, La/bb;-><init>(La/cp;B)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v1, v0}, La/cp;->y(Lkotlin/jvm/functions/Function0;)V

    .line 1068
    .line 1069
    .line 1070
    new-instance v0, La/ctv;

    .line 1071
    .line 1072
    move/from16 v2, v18

    .line 1073
    .line 1074
    invoke-direct {v0, v1, v1, v2}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 1075
    .line 1076
    .line 1077
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1078
    .line 1079
    .line 1080
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1081
    .line 1082
    return-object v0

    .line 1083
    :pswitch_f
    check-cast v0, La/ta90;

    .line 1084
    .line 1085
    check-cast v7, La/pz40;

    .line 1086
    .line 1087
    move-object/from16 v1, p1

    .line 1088
    .line 1089
    check-cast v1, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;

    .line 1090
    .line 1091
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1092
    .line 1093
    .line 1094
    check-cast v0, La/pa90;

    .line 1095
    .line 1096
    iget-object v2, v0, La/pa90;->a:Ljava/lang/String;

    .line 1097
    .line 1098
    iget-object v0, v0, La/pa90;->b:Ljava/util/Map;

    .line 1099
    .line 1100
    new-instance v3, Lkotlin/Pair;

    .line 1101
    .line 1102
    invoke-direct {v3, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 1106
    .line 1107
    .line 1108
    move-result v4

    .line 1109
    if-lez v4, :cond_19

    .line 1110
    .line 1111
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v4

    .line 1115
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1116
    .line 1117
    .line 1118
    move-result v4

    .line 1119
    if-nez v4, :cond_19

    .line 1120
    .line 1121
    invoke-interface {v7, v3}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1122
    .line 1123
    .line 1124
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 1125
    .line 1126
    .line 1127
    :cond_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1128
    .line 1129
    return-object v0

    .line 1130
    :pswitch_10
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1131
    .line 1132
    check-cast v7, La/l590;

    .line 1133
    .line 1134
    move-object/from16 v1, p1

    .line 1135
    .line 1136
    check-cast v1, La/w690;

    .line 1137
    .line 1138
    sget-object v2, La/l590;->Y1:La/nh70;

    .line 1139
    .line 1140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1144
    .line 1145
    .line 1146
    invoke-virtual {v7}, La/l590;->L0()La/k3t0;

    .line 1147
    .line 1148
    .line 1149
    move-result-object v0

    .line 1150
    sget-object v1, La/u490;->a:La/u490;

    .line 1151
    .line 1152
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1153
    .line 1154
    .line 1155
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1156
    .line 1157
    return-object v0

    .line 1158
    :pswitch_11
    check-cast v0, Landroidx/viewpager/widget/ViewPager;

    .line 1159
    .line 1160
    check-cast v7, La/b190;

    .line 1161
    .line 1162
    move-object/from16 v1, p1

    .line 1163
    .line 1164
    check-cast v1, Ljava/lang/Integer;

    .line 1165
    .line 1166
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1167
    .line 1168
    .line 1169
    move-result v1

    .line 1170
    sget-object v2, La/b190;->V1:La/fl70;

    .line 1171
    .line 1172
    invoke-virtual {v0, v1}, Landroidx/viewpager/widget/ViewPager;->setCurrentItem(I)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v1

    .line 1183
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 1184
    .line 1185
    .line 1186
    move-result-object v1

    .line 1187
    new-instance v2, La/t32;

    .line 1188
    .line 1189
    const/16 v9, 0x1c

    .line 1190
    .line 1191
    invoke-direct {v2, v9}, La/t32;-><init>(B)V

    .line 1192
    .line 1193
    .line 1194
    if-nez v1, :cond_1a

    .line 1195
    .line 1196
    goto :goto_10

    .line 1197
    :cond_1a
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v1

    .line 1201
    new-instance v3, Landroid/os/Handler;

    .line 1202
    .line 1203
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v4

    .line 1207
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1208
    .line 1209
    .line 1210
    new-instance v4, La/b1;

    .line 1211
    .line 1212
    invoke-direct {v4, v0, v1, v2, v14}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1213
    .line 1214
    .line 1215
    const-wide/16 v0, 0x0

    .line 1216
    .line 1217
    invoke-virtual {v3, v4, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1218
    .line 1219
    .line 1220
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1221
    .line 1222
    return-object v0

    .line 1223
    :pswitch_12
    move-object v1, v0

    .line 1224
    check-cast v1, La/b190;

    .line 1225
    .line 1226
    check-cast v7, La/qzf0;

    .line 1227
    .line 1228
    move-object/from16 v0, p1

    .line 1229
    .line 1230
    check-cast v0, Ljava/lang/Integer;

    .line 1231
    .line 1232
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1233
    .line 1234
    .line 1235
    move-result v2

    .line 1236
    iput v2, v1, La/b190;->U1:I

    .line 1237
    .line 1238
    invoke-virtual {v1}, La/b190;->H0()La/t190;

    .line 1239
    .line 1240
    .line 1241
    move-result-object v6

    .line 1242
    iget-object v0, v7, La/qzf0;->h:Landroid/util/SparseArray;

    .line 1243
    .line 1244
    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 1245
    .line 1246
    .line 1247
    move-result-object v0

    .line 1248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    check-cast v0, Landroidx/fragment/app/Fragment;

    .line 1252
    .line 1253
    instance-of v8, v0, La/hxf0;

    .line 1254
    .line 1255
    iget-object v9, v6, La/t190;->c:La/vzg0;

    .line 1256
    .line 1257
    iget-object v11, v6, La/t190;->t:La/p7m0;

    .line 1258
    .line 1259
    :goto_11
    invoke-virtual {v11}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    move-object v5, v0

    .line 1264
    check-cast v5, La/m190;

    .line 1265
    .line 1266
    invoke-static {v5, v3, v2, v10}, La/m190;->a(La/m190;La/dxh0;II)La/m190;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v5

    .line 1270
    invoke-virtual {v11, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1271
    .line 1272
    .line 1273
    move-result v0

    .line 1274
    if-eqz v0, :cond_1e

    .line 1275
    .line 1276
    iget-object v0, v6, La/t190;->p:La/we50;

    .line 1277
    .line 1278
    sget-object v2, La/we50;->c:La/we50;

    .line 1279
    .line 1280
    if-eq v0, v2, :cond_1b

    .line 1281
    .line 1282
    if-eqz v8, :cond_1b

    .line 1283
    .line 1284
    const v0, 0x7f070636

    .line 1285
    .line 1286
    .line 1287
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    const v2, 0x7f131261

    .line 1292
    .line 1293
    .line 1294
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v2

    .line 1298
    new-instance v3, Lkotlin/Pair;

    .line 1299
    .line 1300
    invoke-direct {v3, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1301
    .line 1302
    .line 1303
    goto :goto_12

    .line 1304
    :cond_1b
    const v0, 0x7f070657

    .line 1305
    .line 1306
    .line 1307
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v0

    .line 1311
    const v2, 0x7f130dfb

    .line 1312
    .line 1313
    .line 1314
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v2

    .line 1318
    new-instance v3, Lkotlin/Pair;

    .line 1319
    .line 1320
    invoke-direct {v3, v0, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1321
    .line 1322
    .line 1323
    :goto_12
    iget-object v0, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1324
    .line 1325
    check-cast v0, Ljava/lang/Number;

    .line 1326
    .line 1327
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 1328
    .line 1329
    .line 1330
    move-result v0

    .line 1331
    iget-object v2, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1332
    .line 1333
    check-cast v2, Ljava/lang/Number;

    .line 1334
    .line 1335
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 1336
    .line 1337
    .line 1338
    move-result v5

    .line 1339
    const-string v2, "SAVED_VP_SIZE"

    .line 1340
    .line 1341
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v3

    .line 1345
    invoke-virtual {v9, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1346
    .line 1347
    .line 1348
    const-string v2, "SAVED_PROCEED_TITLE"

    .line 1349
    .line 1350
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v3

    .line 1354
    invoke-virtual {v9, v2, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    iget-object v2, v6, La/t190;->r:La/n0o0;

    .line 1358
    .line 1359
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v2

    .line 1363
    move-object v7, v2

    .line 1364
    check-cast v7, La/qz40;

    .line 1365
    .line 1366
    :cond_1c
    move-object v2, v7

    .line 1367
    check-cast v2, La/p7m0;

    .line 1368
    .line 1369
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v3

    .line 1373
    move-object v6, v3

    .line 1374
    check-cast v6, La/n190;

    .line 1375
    .line 1376
    invoke-static {v6, v5, v0, v4}, La/n190;->a(La/n190;III)La/n190;

    .line 1377
    .line 1378
    .line 1379
    move-result-object v6

    .line 1380
    invoke-virtual {v2, v3, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1381
    .line 1382
    .line 1383
    move-result v2

    .line 1384
    if-eqz v2, :cond_1c

    .line 1385
    .line 1386
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v0

    .line 1390
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    invoke-virtual {v1}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v1

    .line 1398
    new-instance v2, La/t32;

    .line 1399
    .line 1400
    const/16 v12, 0x1c

    .line 1401
    .line 1402
    invoke-direct {v2, v12}, La/t32;-><init>(B)V

    .line 1403
    .line 1404
    .line 1405
    if-nez v1, :cond_1d

    .line 1406
    .line 1407
    goto :goto_13

    .line 1408
    :cond_1d
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    new-instance v3, Landroid/os/Handler;

    .line 1413
    .line 1414
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v4

    .line 1418
    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 1419
    .line 1420
    .line 1421
    new-instance v4, La/b1;

    .line 1422
    .line 1423
    invoke-direct {v4, v0, v1, v2, v14}, La/b1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1424
    .line 1425
    .line 1426
    const-wide/16 v8, 0x0

    .line 1427
    .line 1428
    invoke-virtual {v3, v4, v8, v9}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1429
    .line 1430
    .line 1431
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1432
    .line 1433
    return-object v0

    .line 1434
    :cond_1e
    const-wide/16 v16, 0x0

    .line 1435
    .line 1436
    goto/16 :goto_11

    .line 1437
    .line 1438
    :pswitch_13
    check-cast v0, La/iz80;

    .line 1439
    .line 1440
    check-cast v7, Landroid/app/Dialog;

    .line 1441
    .line 1442
    move-object/from16 v1, p1

    .line 1443
    .line 1444
    check-cast v1, Landroid/view/View;

    .line 1445
    .line 1446
    sget-object v2, La/iz80;->g2:La/nh70;

    .line 1447
    .line 1448
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v0}, La/iz80;->T0()La/cjk;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v1

    .line 1455
    iget-object v1, v1, La/cjk;->c:Landroidx/appcompat/widget/AppCompatEditText;

    .line 1456
    .line 1457
    invoke-virtual {v1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v1

    .line 1461
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v1

    .line 1465
    iget-object v2, v0, La/iz80;->e2:La/phf0;

    .line 1466
    .line 1467
    sget-object v3, La/iz80;->h2:[La/iiy;

    .line 1468
    .line 1469
    aget-object v4, v3, v5

    .line 1470
    .line 1471
    invoke-virtual {v2, v0, v4}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v4

    .line 1475
    aget-object v3, v3, v5

    .line 1476
    .line 1477
    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    new-instance v3, Lkotlin/Pair;

    .line 1482
    .line 1483
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1484
    .line 1485
    .line 1486
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v1

    .line 1490
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v1

    .line 1494
    invoke-static {v1, v0, v4}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1495
    .line 1496
    .line 1497
    invoke-virtual {v7}, Landroid/app/Dialog;->dismiss()V

    .line 1498
    .line 1499
    .line 1500
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1501
    .line 1502
    return-object v0

    .line 1503
    :pswitch_14
    check-cast v0, La/wx80;

    .line 1504
    .line 1505
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 1506
    .line 1507
    move-object/from16 v8, p1

    .line 1508
    .line 1509
    check-cast v8, La/xdz;

    .line 1510
    .line 1511
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1512
    .line 1513
    .line 1514
    iget-object v0, v0, La/wx80;->a:La/a4x;

    .line 1515
    .line 1516
    new-instance v1, La/ev80;

    .line 1517
    .line 1518
    const/16 v2, 0x8

    .line 1519
    .line 1520
    invoke-direct {v1, v2}, La/ev80;-><init>(B)V

    .line 1521
    .line 1522
    .line 1523
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1524
    .line 1525
    .line 1526
    move-result v9

    .line 1527
    new-instance v10, La/m160;

    .line 1528
    .line 1529
    const/16 v2, 0x13

    .line 1530
    .line 1531
    invoke-direct {v10, v1, v0, v2}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1532
    .line 1533
    .line 1534
    new-instance v11, La/a580;

    .line 1535
    .line 1536
    const/4 v1, 0x7

    .line 1537
    invoke-direct {v11, v0, v1}, La/a580;-><init>(Ljava/util/List;B)V

    .line 1538
    .line 1539
    .line 1540
    new-instance v1, La/o0i;

    .line 1541
    .line 1542
    invoke-direct {v1, v0, v7, v4}, La/o0i;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function2;B)V

    .line 1543
    .line 1544
    .line 1545
    new-instance v13, La/ugd;

    .line 1546
    .line 1547
    const v0, -0x13f780b2

    .line 1548
    .line 1549
    .line 1550
    invoke-direct {v13, v0, v6, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1551
    .line 1552
    .line 1553
    const/4 v12, 0x0

    .line 1554
    invoke-virtual/range {v8 .. v13}, La/xdz;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ebz;La/ugd;)V

    .line 1555
    .line 1556
    .line 1557
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1558
    .line 1559
    return-object v0

    .line 1560
    :pswitch_15
    const/16 v10, 0xf

    .line 1561
    .line 1562
    check-cast v0, La/jt80;

    .line 1563
    .line 1564
    check-cast v7, Ljava/lang/String;

    .line 1565
    .line 1566
    move-object/from16 v1, p1

    .line 1567
    .line 1568
    check-cast v1, La/k0w0;

    .line 1569
    .line 1570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1571
    .line 1572
    .line 1573
    iget-object v2, v0, La/jt80;->M:La/roq0;

    .line 1574
    .line 1575
    iget-wide v3, v0, La/jt80;->o:J

    .line 1576
    .line 1577
    sget-object v0, La/nw80;->b:La/nw80;

    .line 1578
    .line 1579
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 1580
    .line 1581
    .line 1582
    move-result-wide v5

    .line 1583
    cmp-long v0, v3, v5

    .line 1584
    .line 1585
    if-nez v0, :cond_1f

    .line 1586
    .line 1587
    sget-object v0, La/fk60;->b:La/uuz;

    .line 1588
    .line 1589
    :goto_14
    move v3, v10

    .line 1590
    goto :goto_15

    .line 1591
    :cond_1f
    sget-object v0, La/nw80;->a:La/nw80;

    .line 1592
    .line 1593
    invoke-virtual {v0}, La/nw80;->getId()J

    .line 1594
    .line 1595
    .line 1596
    move-result-wide v5

    .line 1597
    cmp-long v0, v3, v5

    .line 1598
    .line 1599
    if-nez v0, :cond_20

    .line 1600
    .line 1601
    sget-object v0, La/fk60;->b:La/uuz;

    .line 1602
    .line 1603
    move v3, v15

    .line 1604
    goto :goto_15

    .line 1605
    :cond_20
    sget-object v0, La/fk60;->b:La/uuz;

    .line 1606
    .line 1607
    goto :goto_14

    .line 1608
    :goto_15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1609
    .line 1610
    .line 1611
    new-instance v0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;

    .line 1612
    .line 1613
    invoke-direct {v0, v3, v7}, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;-><init>(ILjava/lang/String;)V

    .line 1614
    .line 1615
    .line 1616
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1617
    .line 1618
    .line 1619
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1620
    .line 1621
    return-object v0

    .line 1622
    :pswitch_16
    check-cast v0, Ljava/util/List;

    .line 1623
    .line 1624
    check-cast v7, La/v9c;

    .line 1625
    .line 1626
    move-object/from16 v1, p1

    .line 1627
    .line 1628
    check-cast v1, La/hcz;

    .line 1629
    .line 1630
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1631
    .line 1632
    .line 1633
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 1634
    .line 1635
    .line 1636
    move-result v2

    .line 1637
    new-instance v4, La/a580;

    .line 1638
    .line 1639
    const/4 v5, 0x6

    .line 1640
    invoke-direct {v4, v0, v5}, La/a580;-><init>(Ljava/util/List;B)V

    .line 1641
    .line 1642
    .line 1643
    new-instance v5, La/xe4;

    .line 1644
    .line 1645
    const/16 v8, 0xb

    .line 1646
    .line 1647
    invoke-direct {v5, v0, v7, v8}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 1648
    .line 1649
    .line 1650
    new-instance v0, La/ugd;

    .line 1651
    .line 1652
    const v7, 0x2fd4df92

    .line 1653
    .line 1654
    .line 1655
    invoke-direct {v0, v7, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1656
    .line 1657
    .line 1658
    invoke-virtual {v1, v2, v3, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 1659
    .line 1660
    .line 1661
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1662
    .line 1663
    return-object v0

    .line 1664
    :pswitch_17
    check-cast v0, La/pz40;

    .line 1665
    .line 1666
    check-cast v7, Ljava/util/ArrayList;

    .line 1667
    .line 1668
    move-object/from16 v1, p1

    .line 1669
    .line 1670
    check-cast v1, La/ou90;

    .line 1671
    .line 1672
    new-instance v2, La/uy2;

    .line 1673
    .line 1674
    invoke-direct {v2, v7, v4}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 1675
    .line 1676
    .line 1677
    invoke-virtual {v1, v2}, La/ou90;->H(Lkotlin/jvm/functions/Function1;)V

    .line 1678
    .line 1679
    .line 1680
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1681
    .line 1682
    .line 1683
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1684
    .line 1685
    return-object v0

    .line 1686
    :pswitch_18
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 1687
    .line 1688
    check-cast v7, La/nvu;

    .line 1689
    .line 1690
    move-object/from16 v1, p1

    .line 1691
    .line 1692
    check-cast v1, La/ktb0;

    .line 1693
    .line 1694
    iget v1, v1, La/ktb0;->a:I

    .line 1695
    .line 1696
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v1

    .line 1700
    invoke-virtual {v7}, La/nvu;->A()La/pk80;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v2

    .line 1704
    iget v2, v2, La/pk80;->b:I

    .line 1705
    .line 1706
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1707
    .line 1708
    .line 1709
    move-result-object v2

    .line 1710
    invoke-interface {v0, v1, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1711
    .line 1712
    .line 1713
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1714
    .line 1715
    return-object v0

    .line 1716
    :pswitch_19
    check-cast v0, La/dh80;

    .line 1717
    .line 1718
    check-cast v7, La/pu90;

    .line 1719
    .line 1720
    move-object/from16 v1, p1

    .line 1721
    .line 1722
    check-cast v1, La/ou90;

    .line 1723
    .line 1724
    iget-boolean v2, v0, La/dh80;->s:Z

    .line 1725
    .line 1726
    iget v3, v0, La/dh80;->o:F

    .line 1727
    .line 1728
    if-eqz v2, :cond_21

    .line 1729
    .line 1730
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 1731
    .line 1732
    .line 1733
    move-result v2

    .line 1734
    iget v0, v0, La/dh80;->p:F

    .line 1735
    .line 1736
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 1737
    .line 1738
    .line 1739
    move-result v0

    .line 1740
    invoke-virtual {v1, v7, v2, v0, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 1741
    .line 1742
    .line 1743
    goto :goto_16

    .line 1744
    :cond_21
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 1745
    .line 1746
    .line 1747
    move-result v2

    .line 1748
    iget v0, v0, La/dh80;->p:F

    .line 1749
    .line 1750
    invoke-interface {v1, v0}, La/w6k;->T(F)I

    .line 1751
    .line 1752
    .line 1753
    move-result v0

    .line 1754
    invoke-virtual {v1, v7, v2, v0, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 1755
    .line 1756
    .line 1757
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1758
    .line 1759
    return-object v0

    .line 1760
    :pswitch_1a
    check-cast v0, La/wv70;

    .line 1761
    .line 1762
    check-cast v7, La/uvc;

    .line 1763
    .line 1764
    move-object/from16 v1, p1

    .line 1765
    .line 1766
    check-cast v1, La/k0w0;

    .line 1767
    .line 1768
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1769
    .line 1770
    .line 1771
    iget-object v0, v0, La/wv70;->s:La/uzc0;

    .line 1772
    .line 1773
    iget v2, v7, La/uvc;->a:I

    .line 1774
    .line 1775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1776
    .line 1777
    .line 1778
    new-instance v0, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1;

    .line 1779
    .line 1780
    invoke-direct {v0, v2, v5}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsBannerScreen$1;-><init>(IZ)V

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1784
    .line 1785
    .line 1786
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1787
    .line 1788
    return-object v0

    .line 1789
    :pswitch_1b
    check-cast v0, La/wv70;

    .line 1790
    .line 1791
    check-cast v7, La/kr5;

    .line 1792
    .line 1793
    move-object/from16 v1, p1

    .line 1794
    .line 1795
    check-cast v1, La/k0w0;

    .line 1796
    .line 1797
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1798
    .line 1799
    .line 1800
    iget-object v0, v0, La/wv70;->r:La/nv20;

    .line 1801
    .line 1802
    iget-object v0, v0, La/nv20;->a:Ljava/lang/Object;

    .line 1803
    .line 1804
    check-cast v0, La/h6i;

    .line 1805
    .line 1806
    invoke-virtual {v0}, La/h6i;->c()La/yox;

    .line 1807
    .line 1808
    .line 1809
    iget-object v0, v7, La/kr5;->w:Ljava/lang/String;

    .line 1810
    .line 1811
    new-instance v2, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

    .line 1812
    .line 1813
    invoke-direct {v2, v0}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;-><init>(Ljava/lang/String;)V

    .line 1814
    .line 1815
    .line 1816
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1817
    .line 1818
    .line 1819
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1820
    .line 1821
    return-object v0

    .line 1822
    :pswitch_1c
    check-cast v0, La/cjv0;

    .line 1823
    .line 1824
    check-cast v7, La/cc70;

    .line 1825
    .line 1826
    move-object/from16 v1, p1

    .line 1827
    .line 1828
    check-cast v1, La/lwk;

    .line 1829
    .line 1830
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1831
    .line 1832
    .line 1833
    if-eqz v0, :cond_22

    .line 1834
    .line 1835
    iget-object v1, v0, La/cjv0;->a:La/ycm0;

    .line 1836
    .line 1837
    invoke-virtual {v1}, La/ycm0;->q()I

    .line 1838
    .line 1839
    .line 1840
    move-result v1

    .line 1841
    goto :goto_17

    .line 1842
    :cond_22
    move v1, v6

    .line 1843
    :goto_17
    iget-boolean v2, v7, La/cc70;->b:Z

    .line 1844
    .line 1845
    const/16 v3, 0x207

    .line 1846
    .line 1847
    if-eqz v2, :cond_23

    .line 1848
    .line 1849
    if-eqz v0, :cond_24

    .line 1850
    .line 1851
    invoke-virtual {v0, v14}, La/cjv0;->c(I)V

    .line 1852
    .line 1853
    .line 1854
    invoke-virtual {v0, v3}, La/cjv0;->a(I)V

    .line 1855
    .line 1856
    .line 1857
    goto :goto_18

    .line 1858
    :cond_23
    if-eqz v0, :cond_24

    .line 1859
    .line 1860
    invoke-virtual {v0, v6}, La/cjv0;->c(I)V

    .line 1861
    .line 1862
    .line 1863
    invoke-virtual {v0, v3}, La/cjv0;->d(I)V

    .line 1864
    .line 1865
    .line 1866
    :cond_24
    :goto_18
    new-instance v2, La/oa70;

    .line 1867
    .line 1868
    invoke-direct {v2, v0, v1, v5}, La/oa70;-><init>(Ljava/lang/Object;IB)V

    .line 1869
    .line 1870
    .line 1871
    return-object v2

    .line 1872
    nop

    .line 1873
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
