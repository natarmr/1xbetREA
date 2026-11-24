.class public final synthetic La/dj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/dj1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/rw;)V
    .locals 0

    .line 1
    const/16 p1, 0xf

    iput-byte p1, p0, La/dj1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/dj1;->a:B

    .line 4
    .line 5
    const/16 v1, 0x13

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/16 v3, 0x12c

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x2

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    check-cast v0, La/j2g0;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v1, La/ta2;

    .line 25
    .line 26
    invoke-direct {v1, v0}, La/ta2;-><init>(La/j2g0;)V

    .line 27
    .line 28
    .line 29
    return-object v1

    .line 30
    :pswitch_0
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/p6t0;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, La/sre0;->a:La/tre0;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    :pswitch_1
    move-object/from16 v0, p1

    .line 49
    .line 50
    check-cast v0, La/p6t0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    return-object v0

    .line 60
    :pswitch_2
    move-object/from16 v0, p1

    .line 61
    .line 62
    check-cast v0, La/b92;

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    new-instance v1, La/z82;

    .line 68
    .line 69
    iget-boolean v2, v0, La/b92;->c:Z

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    const v2, 0x7f0802ed

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_0
    iget-boolean v2, v0, La/b92;->e:Z

    .line 78
    .line 79
    if-eqz v2, :cond_1

    .line 80
    .line 81
    const v2, 0x7f0802ec

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    const v2, 0x7f0802eb

    .line 86
    .line 87
    .line 88
    :goto_0
    iget-boolean v3, v0, La/b92;->f:Z

    .line 89
    .line 90
    iget-object v4, v0, La/b92;->d:La/lok0;

    .line 91
    .line 92
    iget-object v4, v4, La/lok0;->u:Ljava/lang/String;

    .line 93
    .line 94
    iget v0, v0, La/b92;->a:I

    .line 95
    .line 96
    invoke-static {v4, v0, v3}, La/q5x;->B(Ljava/lang/String;IZ)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-direct {v1, v2, v0}, La/z82;-><init>(ILjava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v1

    .line 104
    :pswitch_3
    move-object/from16 v0, p1

    .line 105
    .line 106
    check-cast v0, La/inh0;

    .line 107
    .line 108
    sget-object v1, La/t42;->p2:La/jdk0;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    iget-object v0, v0, La/inh0;->a:Ljava/lang/String;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_4
    move-object/from16 v0, p1

    .line 117
    .line 118
    check-cast v0, Ljava/lang/Throwable;

    .line 119
    .line 120
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object v0

    .line 129
    :pswitch_5
    move-object/from16 v0, p1

    .line 130
    .line 131
    check-cast v0, Ljava/lang/Throwable;

    .line 132
    .line 133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 137
    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_6
    move-object/from16 v0, p1

    .line 143
    .line 144
    check-cast v0, La/p6t0;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    invoke-interface {v0}, La/p6t0;->getKey()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    return-object v0

    .line 154
    :pswitch_7
    move-object/from16 v0, p1

    .line 155
    .line 156
    check-cast v0, Ljava/lang/Throwable;

    .line 157
    .line 158
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 162
    .line 163
    .line 164
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_8
    move-object/from16 v0, p1

    .line 168
    .line 169
    check-cast v0, La/fhl;

    .line 170
    .line 171
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 175
    .line 176
    return-object v0

    .line 177
    :pswitch_9
    move-object/from16 v0, p1

    .line 178
    .line 179
    check-cast v0, La/abi0;

    .line 180
    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    const v1, 0x7f0808fd

    .line 185
    .line 186
    .line 187
    invoke-static {v0, v1}, La/cbi0;->c(La/abi0;I)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_a
    move-object/from16 v0, p1

    .line 194
    .line 195
    check-cast v0, Landroid/widget/FrameLayout;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 201
    .line 202
    .line 203
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_b
    move-object/from16 v0, p1

    .line 207
    .line 208
    check-cast v0, Landroid/content/Context;

    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    new-instance v1, Landroid/widget/FrameLayout;

    .line 214
    .line 215
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 216
    .line 217
    .line 218
    return-object v1

    .line 219
    :pswitch_c
    move-object/from16 v0, p1

    .line 220
    .line 221
    check-cast v0, La/ob0;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    new-instance v1, La/yy1;

    .line 227
    .line 228
    invoke-direct {v1, v0}, La/yy1;-><init>(La/ob0;)V

    .line 229
    .line 230
    .line 231
    return-object v1

    .line 232
    :pswitch_d
    move-object/from16 v0, p1

    .line 233
    .line 234
    check-cast v0, La/kg;

    .line 235
    .line 236
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-eqz v0, :cond_6

    .line 244
    .line 245
    if-eq v0, v6, :cond_5

    .line 246
    .line 247
    if-eq v0, v7, :cond_4

    .line 248
    .line 249
    if-eq v0, v5, :cond_3

    .line 250
    .line 251
    const/4 v1, 0x4

    .line 252
    if-ne v0, v1, :cond_2

    .line 253
    .line 254
    sget-object v4, La/ijl;->e:La/ijl;

    .line 255
    .line 256
    goto :goto_1

    .line 257
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 258
    .line 259
    .line 260
    goto :goto_1

    .line 261
    :cond_3
    sget-object v4, La/ijl;->d:La/ijl;

    .line 262
    .line 263
    goto :goto_1

    .line 264
    :cond_4
    sget-object v4, La/ijl;->c:La/ijl;

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_5
    sget-object v4, La/ijl;->b:La/ijl;

    .line 268
    .line 269
    goto :goto_1

    .line 270
    :cond_6
    sget-object v4, La/ijl;->a:La/ijl;

    .line 271
    .line 272
    :goto_1
    return-object v4

    .line 273
    :pswitch_e
    move-object/from16 v0, p1

    .line 274
    .line 275
    check-cast v0, La/ry1;

    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 278
    .line 279
    .line 280
    check-cast v0, La/py1;

    .line 281
    .line 282
    iget-wide v0, v0, La/py1;->b:J

    .line 283
    .line 284
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    return-object v0

    .line 289
    :pswitch_f
    move-object/from16 v0, p1

    .line 290
    .line 291
    check-cast v0, Ljava/lang/Integer;

    .line 292
    .line 293
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 294
    .line 295
    .line 296
    move-result v0

    .line 297
    neg-int v0, v0

    .line 298
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    return-object v0

    .line 303
    :pswitch_10
    move-object/from16 v0, p1

    .line 304
    .line 305
    check-cast v0, La/c53;

    .line 306
    .line 307
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    sget-object v0, La/kx1;->a:La/zsf;

    .line 311
    .line 312
    invoke-static {v3, v2, v0, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    new-instance v5, La/or3;

    .line 317
    .line 318
    invoke-direct {v5, v1}, La/or3;-><init>(B)V

    .line 319
    .line 320
    .line 321
    invoke-static {v4, v5}, La/kzn;->j(La/cfq;Lkotlin/jvm/functions/Function1;)La/pzn;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    invoke-static {v3, v2, v0, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v2, La/dj1;

    .line 330
    .line 331
    const/16 v3, 0xd

    .line 332
    .line 333
    invoke-direct {v2, v3}, La/dj1;-><init>(B)V

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v2}, La/kzn;->l(La/cfq;Lkotlin/jvm/functions/Function1;)La/alo;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v1, v0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    return-object v0

    .line 345
    :pswitch_11
    move-object/from16 v0, p1

    .line 346
    .line 347
    check-cast v0, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v0

    .line 353
    neg-int v0, v0

    .line 354
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :pswitch_12
    move-object/from16 v0, p1

    .line 360
    .line 361
    check-cast v0, La/c53;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    sget-object v0, La/ix1;->a:La/zsf;

    .line 367
    .line 368
    invoke-static {v3, v2, v0, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 369
    .line 370
    .line 371
    move-result-object v4

    .line 372
    new-instance v5, La/or3;

    .line 373
    .line 374
    invoke-direct {v5, v1}, La/or3;-><init>(B)V

    .line 375
    .line 376
    .line 377
    invoke-static {v4, v5}, La/kzn;->j(La/cfq;Lkotlin/jvm/functions/Function1;)La/pzn;

    .line 378
    .line 379
    .line 380
    move-result-object v1

    .line 381
    invoke-static {v3, v2, v0, v7}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    new-instance v2, La/dj1;

    .line 386
    .line 387
    const/16 v3, 0xb

    .line 388
    .line 389
    invoke-direct {v2, v3}, La/dj1;-><init>(B)V

    .line 390
    .line 391
    .line 392
    invoke-static {v0, v2}, La/kzn;->l(La/cfq;Lkotlin/jvm/functions/Function1;)La/alo;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-static {v1, v0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    return-object v0

    .line 401
    :pswitch_13
    move-object/from16 v0, p1

    .line 402
    .line 403
    check-cast v0, Ljava/lang/Throwable;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_14
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, La/ob0;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    new-instance v1, La/su1;

    .line 422
    .line 423
    invoke-direct {v1, v0}, La/su1;-><init>(La/ob0;)V

    .line 424
    .line 425
    .line 426
    return-object v1

    .line 427
    :pswitch_15
    move-object/from16 v0, p1

    .line 428
    .line 429
    check-cast v0, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 432
    .line 433
    .line 434
    move-result v0

    .line 435
    new-instance v1, La/mdm;

    .line 436
    .line 437
    sget-object v2, La/pb10;->c:La/xuz;

    .line 438
    .line 439
    sget-object v3, La/pb10;->g:La/pb10;

    .line 440
    .line 441
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    const-wide/16 v12, 0x0

    .line 449
    .line 450
    const/16 v14, 0x25e

    .line 451
    .line 452
    const/4 v3, 0x0

    .line 453
    const/4 v4, 0x0

    .line 454
    const/4 v5, 0x0

    .line 455
    const/4 v6, 0x0

    .line 456
    const v7, 0x7f1307c4

    .line 457
    .line 458
    .line 459
    const/4 v8, 0x0

    .line 460
    const v9, 0x7f131690

    .line 461
    .line 462
    .line 463
    const-wide/16 v10, 0x2710

    .line 464
    .line 465
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 466
    .line 467
    .line 468
    return-object v1

    .line 469
    :pswitch_16
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, La/qu1;

    .line 472
    .line 473
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    sget-object v1, La/av1;->a:La/zu1;

    .line 477
    .line 478
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-eqz v0, :cond_a

    .line 483
    .line 484
    if-eq v0, v6, :cond_9

    .line 485
    .line 486
    if-eq v0, v7, :cond_8

    .line 487
    .line 488
    if-ne v0, v5, :cond_7

    .line 489
    .line 490
    sget-object v4, La/av1;->d:La/zu1;

    .line 491
    .line 492
    goto :goto_2

    .line 493
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 494
    .line 495
    .line 496
    goto :goto_2

    .line 497
    :cond_8
    sget-object v4, La/av1;->c:La/zu1;

    .line 498
    .line 499
    goto :goto_2

    .line 500
    :cond_9
    sget-object v4, La/av1;->b:La/zu1;

    .line 501
    .line 502
    goto :goto_2

    .line 503
    :cond_a
    sget-object v4, La/av1;->a:La/zu1;

    .line 504
    .line 505
    :goto_2
    return-object v4

    .line 506
    :pswitch_17
    move-object/from16 v5, p1

    .line 507
    .line 508
    check-cast v5, La/fhl;

    .line 509
    .line 510
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 511
    .line 512
    .line 513
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 514
    .line 515
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 520
    .line 521
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 522
    .line 523
    .line 524
    move-result-wide v6

    .line 525
    sget-object v0, La/qmk;->a:La/zcl;

    .line 526
    .line 527
    const/high16 v0, 0x41800000    # 16.0f

    .line 528
    .line 529
    invoke-interface {v5, v0}, La/w6k;->w0(F)F

    .line 530
    .line 531
    .line 532
    move-result v0

    .line 533
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 534
    .line 535
    .line 536
    move-result v1

    .line 537
    int-to-long v1, v1

    .line 538
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 539
    .line 540
    .line 541
    move-result v0

    .line 542
    int-to-long v3, v0

    .line 543
    const/16 v0, 0x20

    .line 544
    .line 545
    shl-long v0, v1, v0

    .line 546
    .line 547
    const-wide v8, 0xffffffffL

    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    and-long v2, v3, v8

    .line 553
    .line 554
    or-long v12, v0, v2

    .line 555
    .line 556
    const/4 v14, 0x0

    .line 557
    const/16 v15, 0xf6

    .line 558
    .line 559
    const-wide/16 v8, 0x0

    .line 560
    .line 561
    const-wide/16 v10, 0x0

    .line 562
    .line 563
    invoke-static/range {v5 .. v15}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V

    .line 564
    .line 565
    .line 566
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object v0

    .line 569
    :pswitch_18
    move-object/from16 v0, p1

    .line 570
    .line 571
    check-cast v0, Ljava/lang/String;

    .line 572
    .line 573
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    .line 575
    .line 576
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 577
    .line 578
    .line 579
    move-result v0

    .line 580
    if-nez v0, :cond_b

    .line 581
    .line 582
    const-wide/16 v0, 0x0

    .line 583
    .line 584
    goto :goto_3

    .line 585
    :cond_b
    const-wide/16 v0, 0x1f4

    .line 586
    .line 587
    :goto_3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 588
    .line 589
    .line 590
    move-result-object v0

    .line 591
    return-object v0

    .line 592
    :pswitch_19
    move-object/from16 v0, p1

    .line 593
    .line 594
    check-cast v0, La/ob0;

    .line 595
    .line 596
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    new-instance v1, La/un1;

    .line 600
    .line 601
    invoke-direct {v1, v0}, La/un1;-><init>(La/ob0;)V

    .line 602
    .line 603
    .line 604
    return-object v1

    .line 605
    :pswitch_1a
    move-object/from16 v0, p1

    .line 606
    .line 607
    check-cast v0, La/dl1;

    .line 608
    .line 609
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 610
    .line 611
    .line 612
    new-instance v1, La/el1;

    .line 613
    .line 614
    iget-object v2, v0, La/dl1;->a:Ljava/lang/String;

    .line 615
    .line 616
    iget-object v3, v0, La/dl1;->b:Ljava/lang/String;

    .line 617
    .line 618
    iget-object v0, v0, La/dl1;->c:La/o0x;

    .line 619
    .line 620
    invoke-direct {v1, v2, v3, v0}, La/el1;-><init>(Ljava/lang/String;Ljava/lang/String;La/o0x;)V

    .line 621
    .line 622
    .line 623
    return-object v1

    .line 624
    :pswitch_1b
    move-object/from16 v0, p1

    .line 625
    .line 626
    check-cast v0, Ljava/lang/Integer;

    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    check-cast v0, Ljava/lang/Integer;

    .line 637
    .line 638
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 639
    .line 640
    .line 641
    move-result v0

    .line 642
    new-instance v1, La/mdm;

    .line 643
    .line 644
    sget-object v2, La/pb10;->c:La/xuz;

    .line 645
    .line 646
    sget-object v3, La/pb10;->g:La/pb10;

    .line 647
    .line 648
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 649
    .line 650
    .line 651
    invoke-static {v3, v0}, La/xuz;->a(La/pb10;I)I

    .line 652
    .line 653
    .line 654
    move-result v2

    .line 655
    const-wide/16 v12, 0x0

    .line 656
    .line 657
    const/16 v14, 0x25e

    .line 658
    .line 659
    const/4 v3, 0x0

    .line 660
    const/4 v4, 0x0

    .line 661
    const/4 v5, 0x0

    .line 662
    const/4 v6, 0x0

    .line 663
    const v7, 0x7f1307c4

    .line 664
    .line 665
    .line 666
    const/4 v8, 0x0

    .line 667
    const v9, 0x7f131690

    .line 668
    .line 669
    .line 670
    const-wide/16 v10, 0x2710

    .line 671
    .line 672
    invoke-direct/range {v1 .. v14}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 673
    .line 674
    .line 675
    return-object v1

    .line 676
    nop

    .line 677
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
