.class public final synthetic La/f54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/f54;->a:B

    iput p1, p0, La/f54;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/f54;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x41800000    # 16.0f

    .line 6
    .line 7
    sget-object v3, La/ouu0;->b:La/ouu0;

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    const/4 v5, 0x4

    .line 12
    const/high16 v6, 0x3f800000    # 1.0f

    .line 13
    .line 14
    iget v7, v0, La/f54;->b:F

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v8, p1

    .line 20
    .line 21
    check-cast v8, La/g7z;

    .line 22
    .line 23
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v8}, La/g7z;->a()V

    .line 27
    .line 28
    .line 29
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 30
    .line 31
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 32
    .line 33
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 42
    .line 43
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 44
    .line 45
    .line 46
    move-result-wide v2

    .line 47
    invoke-static {v7, v0, v1, v2, v3}, La/fbc;->P(FJJ)J

    .line 48
    .line 49
    .line 50
    move-result-wide v9

    .line 51
    const/16 v18, 0x9

    .line 52
    .line 53
    const/16 v19, 0x3e

    .line 54
    .line 55
    const-wide/16 v11, 0x0

    .line 56
    .line 57
    const-wide/16 v13, 0x0

    .line 58
    .line 59
    const/4 v15, 0x0

    .line 60
    const/16 v16, 0x0

    .line 61
    .line 62
    const/16 v17, 0x0

    .line 63
    .line 64
    invoke-static/range {v8 .. v19}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    move-object/from16 v0, p1

    .line 71
    .line 72
    check-cast v0, La/uag0;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_1
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, La/uag0;

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 91
    .line 92
    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 94
    .line 95
    return-object v0

    .line 96
    :pswitch_2
    move-object/from16 v0, p1

    .line 97
    .line 98
    check-cast v0, La/uag0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v7}, La/uag0;->v(F)V

    .line 104
    .line 105
    .line 106
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_3
    move-object/from16 v0, p1

    .line 110
    .line 111
    check-cast v0, Landroid/os/Vibrator;

    .line 112
    .line 113
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v0}, La/um30;->x(Landroid/os/Vibrator;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const/4 v2, 0x7

    .line 121
    filled-new-array {v2}, [I

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    invoke-static {v0, v2}, La/a7;->x(Landroid/os/Vibrator;[I)Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v1, :cond_0

    .line 130
    .line 131
    if-eqz v2, :cond_0

    .line 132
    .line 133
    const/high16 v1, 0x3f000000    # 0.5f

    .line 134
    .line 135
    mul-float/2addr v7, v1

    .line 136
    const v1, 0x3d4ccccd    # 0.05f

    .line 137
    .line 138
    .line 139
    invoke-static {v7, v1, v6}, La/l1e0;->c(FFF)F

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    invoke-static {}, La/a7;->h()Landroid/os/VibrationEffect$Composition;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    invoke-static {v2, v1}, La/a7;->i(Landroid/os/VibrationEffect$Composition;F)Landroid/os/VibrationEffect$Composition;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    invoke-static {v1}, La/a7;->j(Landroid/os/VibrationEffect$Composition;)Landroid/os/VibrationEffect;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v0, v1}, La/jw90;->t(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 159
    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_0
    const/high16 v1, 0x3fc00000    # 1.5f

    .line 163
    .line 164
    mul-float/2addr v7, v1

    .line 165
    const/4 v1, 0x0

    .line 166
    invoke-static {v7, v1, v6}, La/l1e0;->c(FFF)F

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    const v2, 0x3f59999a    # 0.85f

    .line 171
    .line 172
    .line 173
    cmpl-float v1, v1, v2

    .line 174
    .line 175
    if-ltz v1, :cond_1

    .line 176
    .line 177
    const/4 v1, 0x0

    .line 178
    goto :goto_0

    .line 179
    :cond_1
    const/4 v1, 0x2

    .line 180
    :goto_0
    invoke-static {v1}, La/xl50;->h(I)Landroid/os/VibrationEffect;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-static {v0, v1}, La/jw90;->t(Landroid/os/Vibrator;Landroid/os/VibrationEffect;)V

    .line 185
    .line 186
    .line 187
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 188
    .line 189
    return-object v0

    .line 190
    :pswitch_4
    move-object/from16 v1, p1

    .line 191
    .line 192
    check-cast v1, La/hcz;

    .line 193
    .line 194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    float-to-int v2, v7

    .line 198
    new-instance v0, La/ohd;

    .line 199
    .line 200
    const/16 v3, 0x10

    .line 201
    .line 202
    invoke-direct {v0, v3}, La/ohd;-><init>(B)V

    .line 203
    .line 204
    .line 205
    new-instance v5, La/ugd;

    .line 206
    .line 207
    const v3, 0x240e9200

    .line 208
    .line 209
    .line 210
    const/4 v4, 0x1

    .line 211
    invoke-direct {v5, v3, v4, v0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 212
    .line 213
    .line 214
    const/4 v6, 0x6

    .line 215
    const/4 v3, 0x0

    .line 216
    const/4 v4, 0x0

    .line 217
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 218
    .line 219
    .line 220
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object v0

    .line 223
    :pswitch_5
    move-object/from16 v0, p1

    .line 224
    .line 225
    check-cast v0, La/uag0;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v7}, La/uag0;->I(F)V

    .line 231
    .line 232
    .line 233
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 234
    .line 235
    return-object v0

    .line 236
    :pswitch_6
    move-object/from16 v0, p1

    .line 237
    .line 238
    check-cast v0, La/uag0;

    .line 239
    .line 240
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0, v7}, La/uag0;->v(F)V

    .line 244
    .line 245
    .line 246
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object v0

    .line 249
    :pswitch_7
    move-object/from16 v0, p1

    .line 250
    .line 251
    check-cast v0, La/uag0;

    .line 252
    .line 253
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v7}, La/uag0;->v(F)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_8
    move-object/from16 v0, p1

    .line 263
    .line 264
    check-cast v0, La/uag0;

    .line 265
    .line 266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    sub-float/2addr v6, v7

    .line 270
    invoke-virtual {v0, v6}, La/uag0;->b(F)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_9
    move-object/from16 v0, p1

    .line 277
    .line 278
    check-cast v0, La/w6k;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    invoke-static {v7}, La/si30;->b(F)I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    int-to-long v0, v0

    .line 288
    shl-long/2addr v0, v4

    .line 289
    new-instance v2, La/ikx;

    .line 290
    .line 291
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 292
    .line 293
    .line 294
    return-object v2

    .line 295
    :pswitch_a
    move-object/from16 v0, p1

    .line 296
    .line 297
    check-cast v0, La/uag0;

    .line 298
    .line 299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_b
    move-object/from16 v0, p1

    .line 309
    .line 310
    check-cast v0, La/uag0;

    .line 311
    .line 312
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 316
    .line 317
    .line 318
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 319
    .line 320
    return-object v0

    .line 321
    :pswitch_c
    move-object/from16 v0, p1

    .line 322
    .line 323
    check-cast v0, La/uag0;

    .line 324
    .line 325
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 329
    .line 330
    .line 331
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 332
    .line 333
    return-object v0

    .line 334
    :pswitch_d
    move-object/from16 v0, p1

    .line 335
    .line 336
    check-cast v0, La/uag0;

    .line 337
    .line 338
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 342
    .line 343
    .line 344
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 345
    .line 346
    return-object v0

    .line 347
    :pswitch_e
    move-object/from16 v0, p1

    .line 348
    .line 349
    check-cast v0, La/uag0;

    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_f
    move-object/from16 v0, p1

    .line 361
    .line 362
    check-cast v0, La/uag0;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_10
    move-object/from16 v1, p1

    .line 374
    .line 375
    check-cast v1, La/hcz;

    .line 376
    .line 377
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    float-to-int v2, v7

    .line 381
    sget-object v5, La/aad;->g:La/ugd;

    .line 382
    .line 383
    const/4 v6, 0x6

    .line 384
    const/4 v3, 0x0

    .line 385
    const/4 v4, 0x0

    .line 386
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 387
    .line 388
    .line 389
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object v0

    .line 392
    :pswitch_11
    move-object/from16 v0, p1

    .line 393
    .line 394
    check-cast v0, La/t2e;

    .line 395
    .line 396
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0, v3}, La/t2e;->d(La/ouu0;)V

    .line 400
    .line 401
    .line 402
    iget-object v1, v0, La/t2e;->i:La/yzn0;

    .line 403
    .line 404
    iget-object v0, v0, La/t2e;->c:La/u2e;

    .line 405
    .line 406
    iget-object v0, v0, La/u2e;->h:La/b3e;

    .line 407
    .line 408
    sget-object v3, La/qmk;->a:La/zcl;

    .line 409
    .line 410
    add-float/2addr v2, v7

    .line 411
    invoke-static {v1, v0, v2, v5}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 412
    .line 413
    .line 414
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    return-object v0

    .line 417
    :pswitch_12
    move-object/from16 v0, p1

    .line 418
    .line 419
    check-cast v0, La/t2e;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    sget-object v1, La/ouu0;->c:La/ouu0;

    .line 425
    .line 426
    invoke-virtual {v0, v1}, La/t2e;->d(La/ouu0;)V

    .line 427
    .line 428
    .line 429
    iget-object v1, v0, La/t2e;->i:La/yzn0;

    .line 430
    .line 431
    iget-object v0, v0, La/t2e;->c:La/u2e;

    .line 432
    .line 433
    iget-object v0, v0, La/u2e;->h:La/b3e;

    .line 434
    .line 435
    sget-object v3, La/qmk;->a:La/zcl;

    .line 436
    .line 437
    add-float/2addr v2, v7

    .line 438
    invoke-static {v1, v0, v2, v5}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 439
    .line 440
    .line 441
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    return-object v0

    .line 444
    :pswitch_13
    move-object/from16 v0, p1

    .line 445
    .line 446
    check-cast v0, La/t2e;

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v0, v3}, La/t2e;->d(La/ouu0;)V

    .line 452
    .line 453
    .line 454
    iget-object v1, v0, La/t2e;->i:La/yzn0;

    .line 455
    .line 456
    iget-object v0, v0, La/t2e;->c:La/u2e;

    .line 457
    .line 458
    iget-object v0, v0, La/u2e;->h:La/b3e;

    .line 459
    .line 460
    invoke-static {v1, v0, v7, v5}, La/yzn0;->p(La/yzn0;La/b3e;FI)V

    .line 461
    .line 462
    .line 463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_14
    move-object/from16 v0, p1

    .line 467
    .line 468
    check-cast v0, La/g7z;

    .line 469
    .line 470
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-static {}, La/z03;->a()La/w03;

    .line 474
    .line 475
    .line 476
    move-result-object v1

    .line 477
    iget-object v2, v0, La/g7z;->a:La/a6a;

    .line 478
    .line 479
    invoke-interface {v2}, La/fhl;->d()J

    .line 480
    .line 481
    .line 482
    move-result-wide v5

    .line 483
    shr-long/2addr v5, v4

    .line 484
    long-to-int v3, v5

    .line 485
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 486
    .line 487
    .line 488
    move-result v10

    .line 489
    invoke-interface {v2}, La/fhl;->d()J

    .line 490
    .line 491
    .line 492
    move-result-wide v5

    .line 493
    const-wide v8, 0xffffffffL

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    and-long/2addr v5, v8

    .line 499
    long-to-int v3, v5

    .line 500
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 501
    .line 502
    .line 503
    move-result v11

    .line 504
    invoke-virtual {v0, v7}, La/g7z;->w0(F)F

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 509
    .line 510
    .line 511
    move-result v5

    .line 512
    int-to-long v5, v5

    .line 513
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 514
    .line 515
    .line 516
    move-result v3

    .line 517
    int-to-long v12, v3

    .line 518
    shl-long/2addr v5, v4

    .line 519
    and-long/2addr v12, v8

    .line 520
    or-long/2addr v5, v12

    .line 521
    shr-long v3, v5, v4

    .line 522
    .line 523
    long-to-int v3, v3

    .line 524
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 525
    .line 526
    .line 527
    move-result v12

    .line 528
    and-long v3, v5, v8

    .line 529
    .line 530
    long-to-int v3, v3

    .line 531
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 532
    .line 533
    .line 534
    move-result v13

    .line 535
    const/4 v8, 0x0

    .line 536
    const/4 v9, 0x0

    .line 537
    invoke-static/range {v8 .. v13}, La/r8x;->t(FFFFFF)La/wfg0;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    invoke-static {v1, v3}, La/w03;->b(La/w03;La/wfg0;)V

    .line 542
    .line 543
    .line 544
    iget-object v2, v2, La/a6a;->b:La/nr;

    .line 545
    .line 546
    invoke-virtual {v2}, La/nr;->p()J

    .line 547
    .line 548
    .line 549
    move-result-wide v3

    .line 550
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    invoke-interface {v5}, La/x5a;->l()V

    .line 555
    .line 556
    .line 557
    :try_start_0
    iget-object v5, v2, La/nr;->b:Ljava/lang/Object;

    .line 558
    .line 559
    check-cast v5, La/fvt0;

    .line 560
    .line 561
    invoke-virtual {v5, v1}, La/fvt0;->i(La/w03;)V

    .line 562
    .line 563
    .line 564
    invoke-virtual {v0}, La/g7z;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 565
    .line 566
    .line 567
    invoke-static {v2, v3, v4}, Lc;->g(La/nr;J)V

    .line 568
    .line 569
    .line 570
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object v0

    .line 573
    :catchall_0
    move-exception v0

    .line 574
    invoke-static {v2, v3, v4}, Lc;->g(La/nr;J)V

    .line 575
    .line 576
    .line 577
    throw v0

    .line 578
    :pswitch_15
    move-object/from16 v5, p1

    .line 579
    .line 580
    check-cast v5, La/g7z;

    .line 581
    .line 582
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    invoke-virtual {v5}, La/g7z;->a()V

    .line 586
    .line 587
    .line 588
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 589
    .line 590
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 595
    .line 596
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 597
    .line 598
    .line 599
    move-result-wide v6

    .line 600
    const/4 v15, 0x0

    .line 601
    const/16 v16, 0x76

    .line 602
    .line 603
    const-wide/16 v8, 0x0

    .line 604
    .line 605
    const-wide/16 v10, 0x0

    .line 606
    .line 607
    iget v12, v0, La/f54;->b:F

    .line 608
    .line 609
    const/4 v13, 0x0

    .line 610
    const/4 v14, 0x0

    .line 611
    invoke-static/range {v5 .. v16}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 612
    .line 613
    .line 614
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_16
    move-object/from16 v0, p1

    .line 618
    .line 619
    check-cast v0, La/uag0;

    .line 620
    .line 621
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 625
    .line 626
    .line 627
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 628
    .line 629
    return-object v0

    .line 630
    :pswitch_17
    move-object/from16 v0, p1

    .line 631
    .line 632
    check-cast v0, La/uag0;

    .line 633
    .line 634
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 638
    .line 639
    .line 640
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 641
    .line 642
    return-object v0

    .line 643
    :pswitch_18
    move-object/from16 v0, p1

    .line 644
    .line 645
    check-cast v0, La/uag0;

    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 648
    .line 649
    .line 650
    sub-float/2addr v6, v7

    .line 651
    invoke-virtual {v0, v6}, La/uag0;->b(F)V

    .line 652
    .line 653
    .line 654
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 655
    .line 656
    return-object v0

    .line 657
    :pswitch_19
    move-object/from16 v0, p1

    .line 658
    .line 659
    check-cast v0, La/uag0;

    .line 660
    .line 661
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 665
    .line 666
    .line 667
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 668
    .line 669
    return-object v0

    .line 670
    :pswitch_1a
    move-object/from16 v0, p1

    .line 671
    .line 672
    check-cast v0, La/uag0;

    .line 673
    .line 674
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 675
    .line 676
    .line 677
    sub-float/2addr v6, v7

    .line 678
    invoke-virtual {v0, v6}, La/uag0;->b(F)V

    .line 679
    .line 680
    .line 681
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 682
    .line 683
    return-object v0

    .line 684
    :pswitch_1b
    move-object/from16 v0, p1

    .line 685
    .line 686
    check-cast v0, La/uag0;

    .line 687
    .line 688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 689
    .line 690
    .line 691
    invoke-virtual {v0, v7}, La/uag0;->b(F)V

    .line 692
    .line 693
    .line 694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_1c
    move-object/from16 v0, p1

    .line 698
    .line 699
    check-cast v0, La/uag0;

    .line 700
    .line 701
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    neg-float v1, v7

    .line 705
    invoke-virtual {v0, v1}, La/uag0;->I(F)V

    .line 706
    .line 707
    .line 708
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    return-object v0

    .line 711
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
