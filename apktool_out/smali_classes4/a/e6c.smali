.class public final synthetic La/e6c;
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
    iput-byte p1, p0, La/e6c;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/e6c;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p1

    .line 13
    .line 14
    check-cast v0, Ljava/util/List;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    new-instance v1, La/x2d;

    .line 20
    .line 21
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    check-cast v4, Ljava/lang/Number;

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result v4

    .line 31
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-direct {v1, v4, v3, v0}, La/x2d;-><init>(FFF)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_0
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, La/uag0;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v3}, La/uag0;->h(I)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_1
    move-object/from16 v0, p1

    .line 69
    .line 70
    check-cast v0, La/ou90;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_2
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, La/ou90;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_3
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/g7z;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, La/g7z;->a()V

    .line 96
    .line 97
    .line 98
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 99
    .line 100
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 101
    .line 102
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v2

    .line 106
    const/4 v11, 0x0

    .line 107
    const/16 v12, 0x7e

    .line 108
    .line 109
    const-wide/16 v4, 0x0

    .line 110
    .line 111
    const-wide/16 v6, 0x0

    .line 112
    .line 113
    const/4 v8, 0x0

    .line 114
    const/4 v9, 0x0

    .line 115
    const/4 v10, 0x0

    .line 116
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 117
    .line 118
    .line 119
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 120
    .line 121
    return-object v0

    .line 122
    :pswitch_4
    move-object/from16 v0, p1

    .line 123
    .line 124
    check-cast v0, La/pi9;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    const/16 v1, 0x1931

    .line 130
    .line 131
    invoke-static {v1}, La/fbc;->d(I)J

    .line 132
    .line 133
    .line 134
    move-result-wide v3

    .line 135
    new-instance v1, La/y3d;

    .line 136
    .line 137
    invoke-direct {v1, v3, v4}, La/y3d;-><init>(J)V

    .line 138
    .line 139
    .line 140
    const-wide v3, 0x80001931L

    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    invoke-static {v3, v4}, La/fbc;->f(J)J

    .line 146
    .line 147
    .line 148
    move-result-wide v3

    .line 149
    new-instance v5, La/y3d;

    .line 150
    .line 151
    invoke-direct {v5, v3, v4}, La/y3d;-><init>(J)V

    .line 152
    .line 153
    .line 154
    filled-new-array {v1, v5}, [La/y3d;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    const/4 v3, 0x0

    .line 163
    const/16 v4, 0xe

    .line 164
    .line 165
    invoke-static {v1, v3, v3, v4}, La/yk5;->n(Ljava/util/List;FFI)La/e900;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    new-instance v3, La/n51;

    .line 170
    .line 171
    invoke-direct {v3, v1, v2}, La/n51;-><init>(La/e900;B)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, v3}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    return-object v0

    .line 179
    :pswitch_5
    move-object/from16 v0, p1

    .line 180
    .line 181
    check-cast v0, Ljava/lang/Float;

    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 184
    .line 185
    .line 186
    move-result v0

    .line 187
    const/high16 v1, 0x3f000000    # 0.5f

    .line 188
    .line 189
    mul-float/2addr v0, v1

    .line 190
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    return-object v0

    .line 195
    :pswitch_6
    move-object/from16 v0, p1

    .line 196
    .line 197
    check-cast v0, Ljava/lang/Throwable;

    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_7
    move-object/from16 v0, p1

    .line 203
    .line 204
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 205
    .line 206
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 207
    .line 208
    return-object v0

    .line 209
    :pswitch_8
    move-object/from16 v0, p1

    .line 210
    .line 211
    check-cast v0, Ljava/lang/Throwable;

    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_9
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, Ljava/lang/Throwable;

    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_a
    move-object/from16 v0, p1

    .line 224
    .line 225
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 226
    .line 227
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 228
    .line 229
    return-object v0

    .line 230
    :pswitch_b
    move-object/from16 v0, p1

    .line 231
    .line 232
    check-cast v0, Ljava/lang/Throwable;

    .line 233
    .line 234
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 235
    .line 236
    return-object v0

    .line 237
    :pswitch_c
    move-object/from16 v0, p1

    .line 238
    .line 239
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 240
    .line 241
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_d
    move-object/from16 v0, p1

    .line 245
    .line 246
    check-cast v0, La/o1x;

    .line 247
    .line 248
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v1, v0, La/o1x;->b:Ljava/lang/Object;

    .line 252
    .line 253
    iget-object v0, v0, La/o1x;->u:La/luo;

    .line 254
    .line 255
    new-instance v2, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v0

    .line 270
    return-object v0

    .line 271
    :pswitch_e
    move-object/from16 v0, p1

    .line 272
    .line 273
    check-cast v0, La/o1x;

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v0, v0, La/o1x;->b:Ljava/lang/Object;

    .line 279
    .line 280
    instance-of v1, v0, La/aot0;

    .line 281
    .line 282
    if-eqz v1, :cond_0

    .line 283
    .line 284
    check-cast v0, La/aot0;

    .line 285
    .line 286
    invoke-static {v0}, La/kpb;->c0(La/aot0;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    goto :goto_0

    .line 291
    :cond_0
    instance-of v1, v0, Ljava/lang/String;

    .line 292
    .line 293
    if-eqz v1, :cond_1

    .line 294
    .line 295
    check-cast v0, Ljava/lang/String;

    .line 296
    .line 297
    invoke-static {v0}, La/dqm0;->H(Ljava/lang/String;)La/aot0;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    invoke-static {v0}, La/kpb;->c0(La/aot0;)Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    :cond_1
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    return-object v0

    .line 310
    :pswitch_f
    move-object/from16 v0, p1

    .line 311
    .line 312
    check-cast v0, Ljava/lang/Byte;

    .line 313
    .line 314
    invoke-virtual {v0}, Ljava/lang/Byte;->byteValue()B

    .line 315
    .line 316
    .line 317
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v0

    .line 321
    invoke-static {v0, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    const-string v1, "%02x"

    .line 326
    .line 327
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    return-object v0

    .line 332
    :pswitch_10
    move-object/from16 v0, p1

    .line 333
    .line 334
    check-cast v0, Ljava/lang/Throwable;

    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 340
    .line 341
    .line 342
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_11
    move-object/from16 v0, p1

    .line 346
    .line 347
    check-cast v0, La/hcz;

    .line 348
    .line 349
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    :goto_1
    const/16 v2, 0x28

    .line 353
    .line 354
    if-ge v4, v2, :cond_2

    .line 355
    .line 356
    sget-object v2, La/i120;->b:La/ugd;

    .line 357
    .line 358
    const/4 v3, 0x3

    .line 359
    invoke-static {v0, v1, v1, v2, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 360
    .line 361
    .line 362
    add-int/lit8 v4, v4, 0x1

    .line 363
    .line 364
    goto :goto_1

    .line 365
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object v0

    .line 368
    :pswitch_12
    move-object/from16 v0, p1

    .line 369
    .line 370
    check-cast v0, La/whc;

    .line 371
    .line 372
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    new-instance v5, La/xhc;

    .line 376
    .line 377
    iget-object v1, v0, La/whc;->e:Ljava/util/List;

    .line 378
    .line 379
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    iget-object v7, v0, La/whc;->d:Ljava/lang/String;

    .line 384
    .line 385
    iget-object v8, v0, La/whc;->h:Ljava/lang/String;

    .line 386
    .line 387
    iget-boolean v9, v0, La/whc;->g:Z

    .line 388
    .line 389
    iget-wide v1, v0, La/whc;->c:J

    .line 390
    .line 391
    const-wide/16 v10, -0x1

    .line 392
    .line 393
    cmp-long v10, v1, v10

    .line 394
    .line 395
    if-eqz v10, :cond_3

    .line 396
    .line 397
    iget-wide v10, v0, La/whc;->a:J

    .line 398
    .line 399
    cmp-long v10, v1, v10

    .line 400
    .line 401
    if-eqz v10, :cond_3

    .line 402
    .line 403
    iget-wide v10, v0, La/whc;->b:J

    .line 404
    .line 405
    cmp-long v1, v1, v10

    .line 406
    .line 407
    if-eqz v1, :cond_3

    .line 408
    .line 409
    move v10, v3

    .line 410
    goto :goto_2

    .line 411
    :cond_3
    move v10, v4

    .line 412
    :goto_2
    iget-boolean v11, v0, La/whc;->f:Z

    .line 413
    .line 414
    invoke-direct/range {v5 .. v11}, La/xhc;-><init>(La/a4x;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 415
    .line 416
    .line 417
    return-object v5

    .line 418
    :pswitch_13
    move-object/from16 v0, p1

    .line 419
    .line 420
    check-cast v0, La/egc;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    iget-object v7, v0, La/egc;->a:Ljava/lang/String;

    .line 426
    .line 427
    iget-object v9, v0, La/egc;->c:Ljava/lang/String;

    .line 428
    .line 429
    iget-object v1, v0, La/egc;->e:Ljava/lang/String;

    .line 430
    .line 431
    iget-object v8, v0, La/egc;->b:Ljava/lang/String;

    .line 432
    .line 433
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    iget-object v0, v0, La/egc;->d:La/a4x;

    .line 438
    .line 439
    if-nez v2, :cond_4

    .line 440
    .line 441
    invoke-static {v1, v0}, La/kpb;->n0(Ljava/lang/String;Ljava/util/List;)La/a4x;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    :goto_3
    move-object v10, v1

    .line 446
    goto :goto_5

    .line 447
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 448
    .line 449
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 450
    .line 451
    .line 452
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 453
    .line 454
    .line 455
    move-result-object v5

    .line 456
    :cond_5
    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    if-eqz v6, :cond_7

    .line 461
    .line 462
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    move-object v10, v6

    .line 467
    check-cast v10, La/muy;

    .line 468
    .line 469
    iget-object v11, v10, La/muy;->c:Ljava/lang/String;

    .line 470
    .line 471
    invoke-static {v11, v9, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 472
    .line 473
    .line 474
    move-result v11

    .line 475
    if-nez v11, :cond_6

    .line 476
    .line 477
    iget-object v11, v10, La/muy;->g:Ljava/lang/String;

    .line 478
    .line 479
    invoke-static {v11, v9, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 480
    .line 481
    .line 482
    move-result v11

    .line 483
    if-nez v11, :cond_6

    .line 484
    .line 485
    iget-object v10, v10, La/muy;->d:Ljava/lang/String;

    .line 486
    .line 487
    invoke-static {v10, v9, v3}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 488
    .line 489
    .line 490
    move-result v10

    .line 491
    if-eqz v10, :cond_5

    .line 492
    .line 493
    :cond_6
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    goto :goto_4

    .line 497
    :cond_7
    invoke-static {v1, v2}, La/kpb;->n0(Ljava/lang/String;Ljava/util/List;)La/a4x;

    .line 498
    .line 499
    .line 500
    move-result-object v1

    .line 501
    goto :goto_3

    .line 502
    :goto_5
    sget-object v13, La/pdm;->c:La/pdm;

    .line 503
    .line 504
    new-instance v11, La/mdm;

    .line 505
    .line 506
    const-wide/16 v22, 0x0

    .line 507
    .line 508
    const/16 v24, 0x2d4

    .line 509
    .line 510
    const v12, 0x7f130be8

    .line 511
    .line 512
    .line 513
    const/4 v14, 0x0

    .line 514
    const v15, 0x7f080828

    .line 515
    .line 516
    .line 517
    const/16 v16, 0x0

    .line 518
    .line 519
    const v17, 0x7f130e37

    .line 520
    .line 521
    .line 522
    const/16 v18, 0x0

    .line 523
    .line 524
    const/16 v19, 0x0

    .line 525
    .line 526
    const-wide/16 v20, 0x0

    .line 527
    .line 528
    invoke-direct/range {v11 .. v24}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 529
    .line 530
    .line 531
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 532
    .line 533
    .line 534
    move-result v1

    .line 535
    if-nez v1, :cond_8

    .line 536
    .line 537
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 538
    .line 539
    .line 540
    move-result v0

    .line 541
    if-eqz v0, :cond_8

    .line 542
    .line 543
    move v6, v3

    .line 544
    goto :goto_6

    .line 545
    :cond_8
    move v6, v4

    .line 546
    :goto_6
    new-instance v5, La/bp8;

    .line 547
    .line 548
    invoke-direct/range {v5 .. v11}, La/bp8;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;La/a4x;La/mdm;)V

    .line 549
    .line 550
    .line 551
    return-object v5

    .line 552
    :pswitch_14
    move-object/from16 v0, p1

    .line 553
    .line 554
    check-cast v0, Ljava/lang/Long;

    .line 555
    .line 556
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 557
    .line 558
    .line 559
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 560
    .line 561
    return-object v0

    .line 562
    :pswitch_15
    move-object/from16 v0, p1

    .line 563
    .line 564
    check-cast v0, Landroid/content/Context;

    .line 565
    .line 566
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    new-instance v5, La/zac;

    .line 570
    .line 571
    invoke-direct {v5, v0}, La/zac;-><init>(Landroid/content/Context;)V

    .line 572
    .line 573
    .line 574
    new-instance v6, Landroid/widget/HorizontalScrollView;

    .line 575
    .line 576
    invoke-direct {v6, v0}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v6, v4}, Landroid/view/View;->setHorizontalScrollBarEnabled(Z)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v6, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 583
    .line 584
    .line 585
    invoke-virtual {v6, v2}, Landroid/view/View;->setOverScrollMode(I)V

    .line 586
    .line 587
    .line 588
    sget-object v7, La/l4b;->i:La/c0o;

    .line 589
    .line 590
    invoke-virtual {v7}, La/b3;->iterator()Ljava/util/Iterator;

    .line 591
    .line 592
    .line 593
    move-result-object v7

    .line 594
    move v8, v4

    .line 595
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 596
    .line 597
    .line 598
    move-result v9

    .line 599
    if-eqz v9, :cond_b

    .line 600
    .line 601
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 602
    .line 603
    .line 604
    move-result-object v9

    .line 605
    add-int/lit8 v10, v8, 0x1

    .line 606
    .line 607
    if-ltz v8, :cond_a

    .line 608
    .line 609
    check-cast v9, La/l4b;

    .line 610
    .line 611
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 612
    .line 613
    .line 614
    move-result-object v11

    .line 615
    invoke-static {v11}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 616
    .line 617
    .line 618
    move-result-object v11

    .line 619
    const v12, 0x7f0d0083

    .line 620
    .line 621
    .line 622
    invoke-virtual {v11, v12, v5, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 623
    .line 624
    .line 625
    move-result-object v11

    .line 626
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    check-cast v11, Lorg/xplatform/uikit/components/chips/Chip;

    .line 630
    .line 631
    const v12, 0x7f14070e

    .line 632
    .line 633
    .line 634
    invoke-virtual {v11, v12}, Lorg/xplatform/uikit/components/chips/Chip;->setStyle(I)V

    .line 635
    .line 636
    .line 637
    iget v9, v9, La/l4b;->a:I

    .line 638
    .line 639
    invoke-virtual {v0, v9}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v9

    .line 643
    invoke-virtual {v11, v9}, Lorg/xplatform/uikit/components/chips/Chip;->setText(Ljava/lang/CharSequence;)V

    .line 644
    .line 645
    .line 646
    if-nez v8, :cond_9

    .line 647
    .line 648
    move v8, v3

    .line 649
    goto :goto_8

    .line 650
    :cond_9
    move v8, v4

    .line 651
    :goto_8
    invoke-virtual {v11, v8}, Lorg/xplatform/uikit/components/chips/Chip;->setSelected(Z)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 655
    .line 656
    .line 657
    move v8, v10

    .line 658
    goto :goto_7

    .line 659
    :cond_a
    invoke-static {}, La/q3d;->p()V

    .line 660
    .line 661
    .line 662
    throw v1

    .line 663
    :cond_b
    invoke-virtual {v5, v3}, La/abc;->setSingleSelection(Z)V

    .line 664
    .line 665
    .line 666
    invoke-virtual {v5, v3}, La/abc;->setSingleLine(Z)V

    .line 667
    .line 668
    .line 669
    invoke-virtual {v5, v3}, La/abc;->setSelectionRequired(Z)V

    .line 670
    .line 671
    .line 672
    invoke-virtual {v5, v3}, La/zac;->setMiddleScroll(Z)V

    .line 673
    .line 674
    .line 675
    invoke-virtual {v5, v4}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 676
    .line 677
    .line 678
    invoke-virtual {v5, v2}, Landroid/view/View;->setOverScrollMode(I)V

    .line 679
    .line 680
    .line 681
    invoke-virtual {v6, v5}, Landroid/widget/HorizontalScrollView;->addView(Landroid/view/View;)V

    .line 682
    .line 683
    .line 684
    return-object v6

    .line 685
    :pswitch_16
    move-object/from16 v0, p1

    .line 686
    .line 687
    check-cast v0, Lorg/xplatform/uikit/components/chips/Chip;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0}, Lorg/xplatform/uikit/components/chips/Chip;->isSelected()Z

    .line 693
    .line 694
    .line 695
    move-result v0

    .line 696
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    return-object v0

    .line 701
    :pswitch_17
    move-object/from16 v0, p1

    .line 702
    .line 703
    check-cast v0, La/hps0;

    .line 704
    .line 705
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 706
    .line 707
    .line 708
    check-cast v0, La/jp80;

    .line 709
    .line 710
    iput-boolean v4, v0, La/jp80;->p:Z

    .line 711
    .line 712
    invoke-static {v0}, La/s0x;->S(La/qai0;)V

    .line 713
    .line 714
    .line 715
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 716
    .line 717
    return-object v0

    .line 718
    :pswitch_18
    move-object/from16 v0, p1

    .line 719
    .line 720
    check-cast v0, La/abi0;

    .line 721
    .line 722
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_19
    move-object/from16 v0, p1

    .line 726
    .line 727
    check-cast v0, Ljava/lang/Throwable;

    .line 728
    .line 729
    throw v0

    .line 730
    :pswitch_1a
    move-object/from16 v0, p1

    .line 731
    .line 732
    check-cast v0, Ljava/lang/Throwable;

    .line 733
    .line 734
    throw v0

    .line 735
    :pswitch_1b
    move-object/from16 v0, p1

    .line 736
    .line 737
    check-cast v0, Ljava/lang/Throwable;

    .line 738
    .line 739
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 740
    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 743
    .line 744
    .line 745
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 746
    .line 747
    return-object v0

    .line 748
    :pswitch_1c
    move-object/from16 v0, p1

    .line 749
    .line 750
    check-cast v0, Ljava/lang/Throwable;

    .line 751
    .line 752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 753
    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 756
    .line 757
    .line 758
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 759
    .line 760
    return-object v0

    .line 761
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
