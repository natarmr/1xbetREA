.class public final synthetic La/g4s0;
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
    iput-byte p1, p0, La/g4s0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/g4s0;->a:B

    .line 4
    .line 5
    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v0, p1

    .line 12
    .line 13
    check-cast v0, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    new-instance v1, La/mdm;

    .line 20
    .line 21
    sget-object v2, La/pb10;->c:La/xuz;

    .line 22
    .line 23
    sget-object v3, La/pb10;->g:La/pb10;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    sget-object v3, La/pdm;->b:La/pdm;

    .line 33
    .line 34
    const-wide/16 v12, 0x0

    .line 35
    .line 36
    const/16 v14, 0x3d4

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    const v5, 0x7f080827

    .line 40
    .line 41
    .line 42
    const/4 v6, 0x0

    .line 43
    const v7, 0x7f130ef3

    .line 44
    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    const/4 v9, 0x0

    .line 48
    const-wide/16 v10, 0x0

    .line 49
    .line 50
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 51
    .line 52
    .line 53
    return-object v1

    .line 54
    :pswitch_0
    move-object/from16 v0, p1

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    new-instance v1, La/mdm;

    .line 63
    .line 64
    sget-object v2, La/pb10;->c:La/xuz;

    .line 65
    .line 66
    sget-object v3, La/pb10;->g:La/pb10;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 72
    .line 73
    .line 74
    move-result v2

    .line 75
    const-wide/16 v12, 0x0

    .line 76
    .line 77
    const/16 v14, 0x25e

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x0

    .line 81
    const/4 v5, 0x0

    .line 82
    const/4 v6, 0x0

    .line 83
    const v7, 0x7f1307c4

    .line 84
    .line 85
    .line 86
    const/4 v8, 0x0

    .line 87
    const v9, 0x7f131690

    .line 88
    .line 89
    .line 90
    const-wide/16 v10, 0x2710

    .line 91
    .line 92
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_1
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, La/rss0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    const-class v0, La/rss0;

    .line 104
    .line 105
    sget-object v1, La/sre0;->a:La/tre0;

    .line 106
    .line 107
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    return-object v0

    .line 112
    :pswitch_2
    move-object/from16 v0, p1

    .line 113
    .line 114
    check-cast v0, La/rss0;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, La/rss0;->a:Ljava/lang/String;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_3
    move-object/from16 v0, p1

    .line 123
    .line 124
    check-cast v0, La/xpg0;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    new-instance v1, La/yni0;

    .line 130
    .line 131
    invoke-direct {v1}, La/yni0;-><init>()V

    .line 132
    .line 133
    .line 134
    :goto_0
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 135
    .line 136
    .line 137
    move-result v2

    .line 138
    if-eqz v2, :cond_0

    .line 139
    .line 140
    invoke-interface {v0, v3}, La/xpg0;->getLong(I)J

    .line 141
    .line 142
    .line 143
    move-result-wide v4

    .line 144
    long-to-int v2, v4

    .line 145
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-virtual {v1, v2}, La/yni0;->add(Ljava/lang/Object;)Z

    .line 150
    .line 151
    .line 152
    goto :goto_0

    .line 153
    :cond_0
    invoke-static {v1}, La/cui0;->a(Ljava/util/Set;)La/yni0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_4
    move-object/from16 v0, p1

    .line 159
    .line 160
    check-cast v0, La/pvh0;

    .line 161
    .line 162
    iget-wide v4, v0, La/pvh0;->g:J

    .line 163
    .line 164
    iget-object v6, v0, La/pvh0;->i:La/pgk0;

    .line 165
    .line 166
    if-eqz v6, :cond_1

    .line 167
    .line 168
    sget-object v7, La/phu0;->j:La/g4s0;

    .line 169
    .line 170
    iget-object v8, v0, La/pvh0;->h:La/a7g0;

    .line 171
    .line 172
    invoke-virtual {v6, v0, v7, v8}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 173
    .line 174
    .line 175
    :cond_1
    iget-wide v6, v0, La/pvh0;->g:J

    .line 176
    .line 177
    cmp-long v4, v4, v6

    .line 178
    .line 179
    if-eqz v4, :cond_4

    .line 180
    .line 181
    iget-object v4, v0, La/pvh0;->p:La/jvh0;

    .line 182
    .line 183
    if-eqz v4, :cond_3

    .line 184
    .line 185
    iget-wide v8, v4, La/jvh0;->a:J

    .line 186
    .line 187
    cmp-long v5, v8, v6

    .line 188
    .line 189
    if-lez v5, :cond_2

    .line 190
    .line 191
    invoke-virtual {v0}, La/pvh0;->o1()V

    .line 192
    .line 193
    .line 194
    goto :goto_1

    .line 195
    :cond_2
    iput-wide v6, v4, La/jvh0;->g:J

    .line 196
    .line 197
    iget-object v5, v4, La/jvh0;->b:La/p5u0;

    .line 198
    .line 199
    if-nez v5, :cond_4

    .line 200
    .line 201
    iget-object v5, v4, La/jvh0;->e:La/p73;

    .line 202
    .line 203
    invoke-virtual {v5, v3}, La/p73;->a(I)F

    .line 204
    .line 205
    .line 206
    move-result v3

    .line 207
    float-to-double v5, v3

    .line 208
    sub-double/2addr v1, v5

    .line 209
    iget-wide v5, v0, La/pvh0;->g:J

    .line 210
    .line 211
    long-to-double v5, v5

    .line 212
    mul-double/2addr v1, v5

    .line 213
    invoke-static {v1, v2}, La/si30;->c(D)J

    .line 214
    .line 215
    .line 216
    move-result-wide v0

    .line 217
    iput-wide v0, v4, La/jvh0;->h:J

    .line 218
    .line 219
    goto :goto_1

    .line 220
    :cond_3
    const-wide/16 v1, 0x0

    .line 221
    .line 222
    cmp-long v1, v6, v1

    .line 223
    .line 224
    if-eqz v1, :cond_4

    .line 225
    .line 226
    invoke-virtual {v0}, La/pvh0;->t1()V

    .line 227
    .line 228
    .line 229
    :cond_4
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object v0

    .line 232
    :pswitch_5
    move-object/from16 v0, p1

    .line 233
    .line 234
    check-cast v0, La/xpg0;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-interface {v0}, La/xpg0;->W0()Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    return-object v0

    .line 248
    :pswitch_6
    move-object/from16 v0, p1

    .line 249
    .line 250
    check-cast v0, La/lvw;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    sget-object v1, La/sre0;->a:La/tre0;

    .line 260
    .line 261
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0

    .line 266
    :pswitch_7
    move-object/from16 v0, p1

    .line 267
    .line 268
    check-cast v0, La/lvw;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-interface {v0}, La/lvw;->a()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    return-object v0

    .line 278
    :pswitch_8
    move-object/from16 v1, p1

    .line 279
    .line 280
    check-cast v1, La/fhl;

    .line 281
    .line 282
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 286
    .line 287
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 292
    .line 293
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 294
    .line 295
    .line 296
    move-result-wide v2

    .line 297
    const/4 v11, 0x0

    .line 298
    const/16 v12, 0x7e

    .line 299
    .line 300
    const-wide/16 v4, 0x0

    .line 301
    .line 302
    const-wide/16 v6, 0x0

    .line 303
    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v9, 0x0

    .line 306
    const/4 v10, 0x0

    .line 307
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 308
    .line 309
    .line 310
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_9
    move-object/from16 v0, p1

    .line 314
    .line 315
    check-cast v0, La/fee;

    .line 316
    .line 317
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Ljava/lang/Boolean;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 327
    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_a
    move-object/from16 v0, p1

    .line 331
    .line 332
    check-cast v0, La/fee;

    .line 333
    .line 334
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    check-cast v0, La/lgs0;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_b
    move-object/from16 v0, p1

    .line 345
    .line 346
    check-cast v0, La/fee;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v0

    .line 355
    check-cast v0, La/a5w;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_c
    move-object/from16 v0, p1

    .line 359
    .line 360
    check-cast v0, La/fee;

    .line 361
    .line 362
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v0

    .line 369
    check-cast v0, La/ql5;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_d
    move-object/from16 v0, p1

    .line 373
    .line 374
    check-cast v0, Ljava/lang/Integer;

    .line 375
    .line 376
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 377
    .line 378
    .line 379
    move-result v0

    .line 380
    new-instance v1, La/mdm;

    .line 381
    .line 382
    sget-object v2, La/pb10;->c:La/xuz;

    .line 383
    .line 384
    sget-object v3, La/pb10;->g:La/pb10;

    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 390
    .line 391
    .line 392
    move-result v2

    .line 393
    const-wide/16 v12, 0x0

    .line 394
    .line 395
    const/16 v14, 0x25e

    .line 396
    .line 397
    const/4 v3, 0x0

    .line 398
    const/4 v4, 0x0

    .line 399
    const/4 v5, 0x0

    .line 400
    const/4 v6, 0x0

    .line 401
    const v7, 0x7f1307c4

    .line 402
    .line 403
    .line 404
    const/4 v8, 0x0

    .line 405
    const v9, 0x7f131690

    .line 406
    .line 407
    .line 408
    const-wide/16 v10, 0x2710

    .line 409
    .line 410
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 411
    .line 412
    .line 413
    return-object v1

    .line 414
    :pswitch_e
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, Ljava/lang/Integer;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    new-instance v1, La/mdm;

    .line 423
    .line 424
    sget-object v2, La/pb10;->c:La/xuz;

    .line 425
    .line 426
    sget-object v3, La/pb10;->g:La/pb10;

    .line 427
    .line 428
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    const-wide/16 v12, 0x0

    .line 436
    .line 437
    const/16 v14, 0x3de

    .line 438
    .line 439
    const/4 v3, 0x0

    .line 440
    const/4 v4, 0x0

    .line 441
    const/4 v5, 0x0

    .line 442
    const/4 v6, 0x0

    .line 443
    const v7, 0x7f130674

    .line 444
    .line 445
    .line 446
    const/4 v8, 0x0

    .line 447
    const/4 v9, 0x0

    .line 448
    const-wide/16 v10, 0x0

    .line 449
    .line 450
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 451
    .line 452
    .line 453
    return-object v1

    .line 454
    :pswitch_f
    move-object/from16 v0, p1

    .line 455
    .line 456
    check-cast v0, La/cp;

    .line 457
    .line 458
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    new-instance v1, La/kzi0;

    .line 462
    .line 463
    const/16 v2, 0x18

    .line 464
    .line 465
    invoke-direct {v1, v0, v2}, La/kzi0;-><init>(La/cp;B)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 469
    .line 470
    .line 471
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_10
    move-object/from16 v0, p1

    .line 475
    .line 476
    check-cast v0, Ljava/lang/Throwable;

    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    .line 480
    .line 481
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 482
    .line 483
    .line 484
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 485
    .line 486
    return-object v0

    .line 487
    :pswitch_11
    move-object/from16 v0, p1

    .line 488
    .line 489
    check-cast v0, Ljava/lang/Throwable;

    .line 490
    .line 491
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 495
    .line 496
    .line 497
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_12
    move-object/from16 v0, p1

    .line 501
    .line 502
    check-cast v0, Ljava/lang/Integer;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    invoke-static {v0}, La/epv0;->O(I)La/mdm;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    return-object v0

    .line 513
    :pswitch_13
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, La/q5s0;

    .line 516
    .line 517
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    const-class v0, La/q5s0;

    .line 521
    .line 522
    sget-object v1, La/sre0;->a:La/tre0;

    .line 523
    .line 524
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    return-object v0

    .line 529
    :pswitch_14
    move-object/from16 v0, p1

    .line 530
    .line 531
    check-cast v0, La/q5s0;

    .line 532
    .line 533
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    iget-object v0, v0, La/q5s0;->a:Ljava/lang/String;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_15
    move-object/from16 v0, p1

    .line 540
    .line 541
    check-cast v0, Ljava/lang/Throwable;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 547
    .line 548
    .line 549
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 550
    .line 551
    return-object v0

    .line 552
    :pswitch_16
    move-object/from16 v0, p1

    .line 553
    .line 554
    check-cast v0, Ljava/lang/Throwable;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 560
    .line 561
    .line 562
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object v0

    .line 565
    :pswitch_17
    move-object/from16 v0, p1

    .line 566
    .line 567
    check-cast v0, Ljava/lang/Integer;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 570
    .line 571
    .line 572
    move-result v0

    .line 573
    invoke-static {v0}, La/epv0;->O(I)La/mdm;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :pswitch_18
    move-object/from16 v0, p1

    .line 579
    .line 580
    check-cast v0, La/f3s0;

    .line 581
    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    sget-object v1, La/sre0;->a:La/tre0;

    .line 590
    .line 591
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 592
    .line 593
    .line 594
    move-result-object v0

    .line 595
    return-object v0

    .line 596
    :pswitch_19
    move-object/from16 v0, p1

    .line 597
    .line 598
    check-cast v0, La/f3s0;

    .line 599
    .line 600
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 601
    .line 602
    .line 603
    invoke-interface {v0}, La/f3s0;->getKey()Ljava/lang/String;

    .line 604
    .line 605
    .line 606
    move-result-object v0

    .line 607
    return-object v0

    .line 608
    :pswitch_1a
    move-object/from16 v0, p1

    .line 609
    .line 610
    check-cast v0, Ljava/lang/Throwable;

    .line 611
    .line 612
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 616
    .line 617
    .line 618
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_1b
    move-object/from16 v0, p1

    .line 622
    .line 623
    check-cast v0, Ljava/lang/Throwable;

    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 629
    .line 630
    .line 631
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 632
    .line 633
    return-object v0

    .line 634
    :pswitch_1c
    move-object/from16 v0, p1

    .line 635
    .line 636
    check-cast v0, La/fee;

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    check-cast v0, La/s7s0;

    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    instance-of v4, v0, La/q7s0;

    .line 651
    .line 652
    const/4 v5, 0x0

    .line 653
    if-eqz v4, :cond_10

    .line 654
    .line 655
    check-cast v0, La/q7s0;

    .line 656
    .line 657
    iget-object v0, v0, La/q7s0;->a:La/gu1;

    .line 658
    .line 659
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    new-instance v4, Ljava/util/ArrayList;

    .line 663
    .line 664
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 665
    .line 666
    .line 667
    iget-object v6, v0, La/gu1;->k:La/o98;

    .line 668
    .line 669
    iget-object v6, v6, La/o98;->b:Ljava/util/List;

    .line 670
    .line 671
    new-instance v7, La/tgo0;

    .line 672
    .line 673
    const/16 v8, 0x16

    .line 674
    .line 675
    invoke-direct {v7, v8}, La/tgo0;-><init>(B)V

    .line 676
    .line 677
    .line 678
    invoke-static {v6, v7}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 679
    .line 680
    .line 681
    move-result-object v6

    .line 682
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v7

    .line 690
    if-eqz v7, :cond_f

    .line 691
    .line 692
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v7

    .line 696
    add-int/lit8 v8, v3, 0x1

    .line 697
    .line 698
    if-ltz v3, :cond_e

    .line 699
    .line 700
    check-cast v7, La/jng0;

    .line 701
    .line 702
    iget-object v9, v0, La/gu1;->l:La/w98;

    .line 703
    .line 704
    iget-object v9, v9, La/w98;->a:Ljava/util/List;

    .line 705
    .line 706
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 707
    .line 708
    .line 709
    move-result-object v9

    .line 710
    :cond_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 711
    .line 712
    .line 713
    move-result v10

    .line 714
    if-eqz v10, :cond_6

    .line 715
    .line 716
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 717
    .line 718
    .line 719
    move-result-object v10

    .line 720
    move-object v11, v10

    .line 721
    check-cast v11, La/fzl0;

    .line 722
    .line 723
    iget-wide v11, v11, La/fzl0;->c:J

    .line 724
    .line 725
    iget-wide v13, v7, La/jng0;->b:J

    .line 726
    .line 727
    cmp-long v11, v11, v13

    .line 728
    .line 729
    if-nez v11, :cond_5

    .line 730
    .line 731
    goto :goto_3

    .line 732
    :cond_6
    move-object v10, v5

    .line 733
    :goto_3
    check-cast v10, La/fzl0;

    .line 734
    .line 735
    if-eqz v10, :cond_d

    .line 736
    .line 737
    iget-wide v11, v10, La/fzl0;->c:J

    .line 738
    .line 739
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 740
    .line 741
    .line 742
    move-result-object v9

    .line 743
    iget-wide v12, v10, La/fzl0;->c:J

    .line 744
    .line 745
    sget-object v11, La/rdj;->a:La/rdj;

    .line 746
    .line 747
    iget-object v14, v7, La/jng0;->d:Ljava/util/Date;

    .line 748
    .line 749
    iget-object v15, v7, La/jng0;->c:Ljava/util/Date;

    .line 750
    .line 751
    move-wide/from16 v19, v1

    .line 752
    .line 753
    sget-object v1, La/sdj;->c:La/sdj;

    .line 754
    .line 755
    const/16 v2, 0x3c

    .line 756
    .line 757
    invoke-static {v11, v1, v14, v5, v2}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v14

    .line 761
    invoke-static {v11, v1, v15, v5, v2}, La/rdj;->c(La/rdj;La/sdj;Ljava/util/Date;Ljava/util/Locale;I)Ljava/lang/String;

    .line 762
    .line 763
    .line 764
    move-result-object v1

    .line 765
    const-string v2, " - "

    .line 766
    .line 767
    invoke-static {v14, v2, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    iget-object v1, v10, La/fzl0;->a:La/w88;

    .line 772
    .line 773
    move-object v2, v15

    .line 774
    iget-object v15, v1, La/w88;->e:Ljava/lang/String;

    .line 775
    .line 776
    iget-object v1, v1, La/w88;->c:Ljava/util/List;

    .line 777
    .line 778
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 779
    .line 780
    .line 781
    move-result v1

    .line 782
    const/4 v10, 0x1

    .line 783
    xor-int/lit8 v17, v1, 0x1

    .line 784
    .line 785
    move-object/from16 p0, v5

    .line 786
    .line 787
    move-object/from16 p1, v6

    .line 788
    .line 789
    iget-wide v5, v0, La/gu1;->q:J

    .line 790
    .line 791
    long-to-int v1, v5

    .line 792
    iget-object v5, v7, La/jng0;->d:Ljava/util/Date;

    .line 793
    .line 794
    iget-object v6, v0, La/gu1;->b:La/z1s0;

    .line 795
    .line 796
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 797
    .line 798
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 799
    .line 800
    .line 801
    move-result-object v7

    .line 802
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 803
    .line 804
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 805
    .line 806
    .line 807
    move-result-wide v23

    .line 808
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 809
    .line 810
    .line 811
    move-result-object v7

    .line 812
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 813
    .line 814
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 815
    .line 816
    .line 817
    move-result-wide v27

    .line 818
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 819
    .line 820
    .line 821
    move-result-object v7

    .line 822
    new-instance v11, Ljava/util/Date;

    .line 823
    .line 824
    invoke-direct {v11}, Ljava/util/Date;-><init>()V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v11}, Ljava/util/Date;->getTime()J

    .line 828
    .line 829
    .line 830
    move-result-wide v21

    .line 831
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 832
    .line 833
    .line 834
    move-result-wide v25

    .line 835
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 836
    .line 837
    .line 838
    move-result-wide v29

    .line 839
    sub-long v25, v25, v29

    .line 840
    .line 841
    const-wide/16 v29, 0x3e8

    .line 842
    .line 843
    move-object/from16 v18, v11

    .line 844
    .line 845
    div-long v10, v25, v29

    .line 846
    .line 847
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 848
    .line 849
    .line 850
    move-result-wide v25

    .line 851
    sub-long v21, v21, v25

    .line 852
    .line 853
    move-wide/from16 v35, v12

    .line 854
    .line 855
    div-long v12, v21, v29

    .line 856
    .line 857
    long-to-double v12, v12

    .line 858
    long-to-double v10, v10

    .line 859
    div-double/2addr v12, v10

    .line 860
    const-wide/high16 v10, 0x4059000000000000L    # 100.0

    .line 861
    .line 862
    mul-double/2addr v12, v10

    .line 863
    const-wide/16 v10, 0x0

    .line 864
    .line 865
    cmpl-double v10, v12, v10

    .line 866
    .line 867
    if-lez v10, :cond_7

    .line 868
    .line 869
    cmpg-double v10, v12, v19

    .line 870
    .line 871
    if-gez v10, :cond_7

    .line 872
    .line 873
    const/16 v31, 0x1

    .line 874
    .line 875
    goto :goto_4

    .line 876
    :cond_7
    double-to-int v10, v12

    .line 877
    move/from16 v31, v10

    .line 878
    .line 879
    :goto_4
    sget-object v10, La/z1s0;->a:La/z1s0;

    .line 880
    .line 881
    if-ne v6, v10, :cond_a

    .line 882
    .line 883
    if-ge v3, v1, :cond_8

    .line 884
    .line 885
    new-instance v1, La/qr1;

    .line 886
    .line 887
    sget-object v2, La/czr0;->c:La/czr0;

    .line 888
    .line 889
    invoke-direct {v1, v7, v2}, La/qr1;-><init>(Ljava/lang/String;La/czr0;)V

    .line 890
    .line 891
    .line 892
    :goto_5
    move-object/from16 v18, v1

    .line 893
    .line 894
    goto/16 :goto_6

    .line 895
    .line 896
    :cond_8
    if-ne v3, v1, :cond_9

    .line 897
    .line 898
    move-object/from16 v1, v18

    .line 899
    .line 900
    invoke-virtual {v1, v5}, Ljava/util/Date;->before(Ljava/util/Date;)Z

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    if-nez v1, :cond_9

    .line 905
    .line 906
    new-instance v1, La/pr1;

    .line 907
    .line 908
    new-instance v21, La/unm;

    .line 909
    .line 910
    sget-object v22, La/tnm;->b:La/tnm;

    .line 911
    .line 912
    sget-object v2, La/qmk;->a:La/zcl;

    .line 913
    .line 914
    const/16 v33, 0x1

    .line 915
    .line 916
    const/16 v34, 0x200

    .line 917
    .line 918
    const/high16 v29, 0x40c00000    # 6.0f

    .line 919
    .line 920
    const/high16 v30, 0x40c00000    # 6.0f

    .line 921
    .line 922
    const/16 v32, 0x64

    .line 923
    .line 924
    move-wide/from16 v25, v23

    .line 925
    .line 926
    invoke-direct/range {v21 .. v34}, La/unm;-><init>(La/tnm;JJJFFIIZI)V

    .line 927
    .line 928
    .line 929
    move-object/from16 v2, v21

    .line 930
    .line 931
    invoke-direct {v1, v7, v2}, La/pr1;-><init>(Ljava/lang/String;La/unm;)V

    .line 932
    .line 933
    .line 934
    goto :goto_5

    .line 935
    :cond_9
    new-instance v1, La/qr1;

    .line 936
    .line 937
    sget-object v2, La/czr0;->a:La/czr0;

    .line 938
    .line 939
    invoke-direct {v1, v7, v2}, La/qr1;-><init>(Ljava/lang/String;La/czr0;)V

    .line 940
    .line 941
    .line 942
    goto :goto_5

    .line 943
    :cond_a
    move-object/from16 v1, v18

    .line 944
    .line 945
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 946
    .line 947
    .line 948
    move-result-wide v10

    .line 949
    invoke-virtual {v5}, Ljava/util/Date;->getTime()J

    .line 950
    .line 951
    .line 952
    move-result-wide v5

    .line 953
    cmp-long v3, v10, v5

    .line 954
    .line 955
    if-ltz v3, :cond_b

    .line 956
    .line 957
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 958
    .line 959
    .line 960
    move-result-wide v5

    .line 961
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 962
    .line 963
    .line 964
    move-result-wide v10

    .line 965
    cmp-long v3, v5, v10

    .line 966
    .line 967
    if-gez v3, :cond_b

    .line 968
    .line 969
    new-instance v1, La/pr1;

    .line 970
    .line 971
    new-instance v21, La/unm;

    .line 972
    .line 973
    sget-object v22, La/tnm;->b:La/tnm;

    .line 974
    .line 975
    sget-object v2, La/qmk;->a:La/zcl;

    .line 976
    .line 977
    const/16 v33, 0x1

    .line 978
    .line 979
    const/16 v34, 0x200

    .line 980
    .line 981
    const/high16 v29, 0x40c00000    # 6.0f

    .line 982
    .line 983
    const/high16 v30, 0x40c00000    # 6.0f

    .line 984
    .line 985
    const/16 v32, 0x64

    .line 986
    .line 987
    move-wide/from16 v25, v23

    .line 988
    .line 989
    invoke-direct/range {v21 .. v34}, La/unm;-><init>(La/tnm;JJJFFIIZI)V

    .line 990
    .line 991
    .line 992
    move-object/from16 v2, v21

    .line 993
    .line 994
    invoke-direct {v1, v7, v2}, La/pr1;-><init>(Ljava/lang/String;La/unm;)V

    .line 995
    .line 996
    .line 997
    goto :goto_5

    .line 998
    :cond_b
    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v5

    .line 1002
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 1003
    .line 1004
    .line 1005
    move-result-wide v1

    .line 1006
    cmp-long v1, v5, v1

    .line 1007
    .line 1008
    if-ltz v1, :cond_c

    .line 1009
    .line 1010
    new-instance v1, La/qr1;

    .line 1011
    .line 1012
    sget-object v2, La/czr0;->c:La/czr0;

    .line 1013
    .line 1014
    invoke-direct {v1, v7, v2}, La/qr1;-><init>(Ljava/lang/String;La/czr0;)V

    .line 1015
    .line 1016
    .line 1017
    goto :goto_5

    .line 1018
    :cond_c
    new-instance v1, La/qr1;

    .line 1019
    .line 1020
    sget-object v2, La/czr0;->a:La/czr0;

    .line 1021
    .line 1022
    invoke-direct {v1, v7, v2}, La/qr1;-><init>(Ljava/lang/String;La/czr0;)V

    .line 1023
    .line 1024
    .line 1025
    goto/16 :goto_5

    .line 1026
    .line 1027
    :goto_6
    new-instance v11, La/tr1;

    .line 1028
    .line 1029
    const/16 v16, 0x0

    .line 1030
    .line 1031
    move-wide/from16 v12, v35

    .line 1032
    .line 1033
    invoke-direct/range {v11 .. v18}, La/tr1;-><init>(JLjava/lang/String;Ljava/lang/String;ZZLa/rr1;)V

    .line 1034
    .line 1035
    .line 1036
    new-instance v1, La/d3s0;

    .line 1037
    .line 1038
    invoke-direct {v1, v11, v9}, La/d3s0;-><init>(La/vr1;Ljava/lang/String;)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1042
    .line 1043
    .line 1044
    goto :goto_7

    .line 1045
    :cond_d
    move-wide/from16 v19, v1

    .line 1046
    .line 1047
    move-object/from16 p0, v5

    .line 1048
    .line 1049
    move-object/from16 p1, v6

    .line 1050
    .line 1051
    :goto_7
    move-object/from16 v5, p0

    .line 1052
    .line 1053
    move-object/from16 v6, p1

    .line 1054
    .line 1055
    move v3, v8

    .line 1056
    move-wide/from16 v1, v19

    .line 1057
    .line 1058
    goto/16 :goto_2

    .line 1059
    .line 1060
    :cond_e
    move-object/from16 p0, v5

    .line 1061
    .line 1062
    invoke-static {}, La/q3d;->p()V

    .line 1063
    .line 1064
    .line 1065
    throw p0

    .line 1066
    :cond_f
    invoke-static {v4}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    goto :goto_9

    .line 1071
    :cond_10
    move-object/from16 p0, v5

    .line 1072
    .line 1073
    sget-object v1, La/r7s0;->a:La/r7s0;

    .line 1074
    .line 1075
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    if-eqz v0, :cond_12

    .line 1080
    .line 1081
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    :goto_8
    const/16 v1, 0xf

    .line 1086
    .line 1087
    if-ge v3, v1, :cond_11

    .line 1088
    .line 1089
    const-string v1, "card_shimmer_key"

    .line 1090
    .line 1091
    invoke-static {v3, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v1

    .line 1095
    new-instance v2, La/d3s0;

    .line 1096
    .line 1097
    sget-object v4, La/ur1;->a:La/ur1;

    .line 1098
    .line 1099
    invoke-direct {v2, v4, v1}, La/d3s0;-><init>(La/vr1;Ljava/lang/String;)V

    .line 1100
    .line 1101
    .line 1102
    invoke-virtual {v0, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1103
    .line 1104
    .line 1105
    add-int/lit8 v3, v3, 0x1

    .line 1106
    .line 1107
    goto :goto_8

    .line 1108
    :cond_11
    invoke-static {v0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v5

    .line 1116
    goto :goto_9

    .line 1117
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 1118
    .line 1119
    .line 1120
    move-object/from16 v5, p0

    .line 1121
    .line 1122
    :goto_9
    return-object v5

    .line 1123
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
