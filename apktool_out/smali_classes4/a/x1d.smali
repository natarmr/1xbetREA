.class public final synthetic La/x1d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;


# direct methods
.method public synthetic constructor <init>(La/l7m0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x1d;->a:B

    iput-object p1, p0, La/x1d;->b:La/l7m0;

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
    iget-byte v1, v0, La/x1d;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const-string v3, "Expanded"

    .line 7
    .line 8
    const-string v4, "Collapsed"

    .line 9
    .line 10
    const/4 v5, 0x0

    .line 11
    const/high16 v6, 0x40000000    # 2.0f

    .line 12
    .line 13
    const/high16 v7, 0x3f800000    # 1.0f

    .line 14
    .line 15
    const-wide v8, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    const/16 v10, 0x20

    .line 21
    .line 22
    iget-object v11, v0, La/x1d;->b:La/l7m0;

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v0, p1

    .line 28
    .line 29
    check-cast v0, La/uag0;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    check-cast v1, Ljava/lang/Number;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 45
    .line 46
    .line 47
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 48
    .line 49
    return-object v0

    .line 50
    :pswitch_0
    move-object/from16 v0, p1

    .line 51
    .line 52
    check-cast v0, La/uag0;

    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    check-cast v1, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_1
    move-object/from16 v0, p1

    .line 74
    .line 75
    check-cast v0, La/uag0;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

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
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_3
    move-object/from16 v0, p1

    .line 120
    .line 121
    check-cast v0, La/uag0;

    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    check-cast v1, Ljava/lang/Number;

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 137
    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_4
    move-object/from16 v0, p1

    .line 143
    .line 144
    check-cast v0, La/pi9;

    .line 145
    .line 146
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v1, v0, La/pi9;->a:La/y99;

    .line 150
    .line 151
    invoke-interface {v1}, La/y99;->d()J

    .line 152
    .line 153
    .line 154
    move-result-wide v1

    .line 155
    invoke-static {v1, v2}, La/h7k0;->d(J)F

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    div-float/2addr v1, v6

    .line 160
    new-instance v2, La/cel;

    .line 161
    .line 162
    const/4 v3, 0x4

    .line 163
    invoke-direct {v2, v1, v11, v3}, La/cel;-><init>(FLjava/lang/Object;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0, v2}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 167
    .line 168
    .line 169
    move-result-object v0

    .line 170
    return-object v0

    .line 171
    :pswitch_5
    move-object/from16 v0, p1

    .line 172
    .line 173
    check-cast v0, La/pi9;

    .line 174
    .line 175
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    iget-object v1, v0, La/pi9;->a:La/y99;

    .line 179
    .line 180
    invoke-interface {v1}, La/y99;->d()J

    .line 181
    .line 182
    .line 183
    move-result-wide v1

    .line 184
    and-long/2addr v1, v8

    .line 185
    long-to-int v1, v1

    .line 186
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    div-float/2addr v1, v6

    .line 191
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 192
    .line 193
    .line 194
    move-result v2

    .line 195
    int-to-long v2, v2

    .line 196
    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 197
    .line 198
    .line 199
    move-result v1

    .line 200
    int-to-long v6, v1

    .line 201
    shl-long v1, v2, v10

    .line 202
    .line 203
    and-long v3, v6, v8

    .line 204
    .line 205
    or-long/2addr v1, v3

    .line 206
    new-instance v3, La/m5n;

    .line 207
    .line 208
    invoke-direct {v3, v1, v2, v11, v5}, La/m5n;-><init>(JLa/l7m0;B)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0, v3}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    return-object v0

    .line 216
    :pswitch_6
    move-object/from16 v0, p1

    .line 217
    .line 218
    check-cast v0, La/uag0;

    .line 219
    .line 220
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    check-cast v1, Ljava/lang/Number;

    .line 228
    .line 229
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 230
    .line 231
    .line 232
    move-result v1

    .line 233
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    return-object v0

    .line 239
    :pswitch_7
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, La/w6k;

    .line 242
    .line 243
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 244
    .line 245
    .line 246
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v0

    .line 250
    check-cast v0, Ljava/lang/Number;

    .line 251
    .line 252
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    invoke-static {v0}, La/si30;->b(F)I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    int-to-long v0, v0

    .line 261
    shl-long/2addr v0, v10

    .line 262
    new-instance v2, La/ikx;

    .line 263
    .line 264
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 265
    .line 266
    .line 267
    return-object v2

    .line 268
    :pswitch_8
    move-object/from16 v0, p1

    .line 269
    .line 270
    check-cast v0, La/uag0;

    .line 271
    .line 272
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    check-cast v1, Ljava/lang/Number;

    .line 280
    .line 281
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 282
    .line 283
    .line 284
    move-result v1

    .line 285
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_9
    move-object/from16 v0, p1

    .line 292
    .line 293
    check-cast v0, La/uag0;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, Ljava/lang/Number;

    .line 303
    .line 304
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 309
    .line 310
    .line 311
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 312
    .line 313
    return-object v0

    .line 314
    :pswitch_a
    move-object/from16 v0, p1

    .line 315
    .line 316
    check-cast v0, La/uag0;

    .line 317
    .line 318
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result v1

    .line 331
    invoke-virtual {v0, v1}, La/uag0;->w(F)V

    .line 332
    .line 333
    .line 334
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, Ljava/lang/Number;

    .line 339
    .line 340
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 341
    .line 342
    .line 343
    move-result v1

    .line 344
    invoke-virtual {v0, v1}, La/uag0;->y(F)V

    .line 345
    .line 346
    .line 347
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object v0

    .line 350
    :pswitch_b
    move-object/from16 v0, p1

    .line 351
    .line 352
    check-cast v0, La/uag0;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    check-cast v1, Ljava/lang/Number;

    .line 362
    .line 363
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 364
    .line 365
    .line 366
    move-result v1

    .line 367
    invoke-virtual {v0, v1}, La/uag0;->w(F)V

    .line 368
    .line 369
    .line 370
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    check-cast v1, Ljava/lang/Number;

    .line 375
    .line 376
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 377
    .line 378
    .line 379
    move-result v1

    .line 380
    invoke-virtual {v0, v1}, La/uag0;->y(F)V

    .line 381
    .line 382
    .line 383
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 384
    .line 385
    return-object v0

    .line 386
    :pswitch_c
    move-object/from16 v0, p1

    .line 387
    .line 388
    check-cast v0, La/abi0;

    .line 389
    .line 390
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, Ljava/lang/Number;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    cmpg-float v1, v1, v7

    .line 404
    .line 405
    if-nez v1, :cond_0

    .line 406
    .line 407
    move-object v3, v4

    .line 408
    :cond_0
    invoke-static {v0, v3}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_d
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, La/abi0;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v1

    .line 425
    check-cast v1, Ljava/lang/Boolean;

    .line 426
    .line 427
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 428
    .line 429
    .line 430
    move-result v1

    .line 431
    if-eqz v1, :cond_1

    .line 432
    .line 433
    goto :goto_0

    .line 434
    :cond_1
    move-object v3, v4

    .line 435
    :goto_0
    invoke-static {v0, v3}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_e
    move-object/from16 v0, p1

    .line 442
    .line 443
    check-cast v0, La/uag0;

    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 446
    .line 447
    .line 448
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    check-cast v1, Ljava/lang/Number;

    .line 453
    .line 454
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 455
    .line 456
    .line 457
    move-result v1

    .line 458
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 459
    .line 460
    .line 461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_f
    move-object/from16 v1, p1

    .line 465
    .line 466
    check-cast v1, La/fhl;

    .line 467
    .line 468
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    check-cast v0, La/y3d;

    .line 473
    .line 474
    iget-wide v2, v0, La/y3d;->a:J

    .line 475
    .line 476
    sget-wide v4, La/y3d;->g:J

    .line 477
    .line 478
    invoke-static {v2, v3, v4, v5}, La/h2t0;->a(JJ)Z

    .line 479
    .line 480
    .line 481
    move-result v0

    .line 482
    if-nez v0, :cond_2

    .line 483
    .line 484
    const/4 v11, 0x0

    .line 485
    const/16 v12, 0x7e

    .line 486
    .line 487
    const-wide/16 v4, 0x0

    .line 488
    .line 489
    const-wide/16 v6, 0x0

    .line 490
    .line 491
    const/4 v8, 0x0

    .line 492
    const/4 v9, 0x0

    .line 493
    const/4 v10, 0x0

    .line 494
    invoke-static/range {v1 .. v12}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 495
    .line 496
    .line 497
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 498
    .line 499
    return-object v0

    .line 500
    :pswitch_10
    move-object/from16 v0, p1

    .line 501
    .line 502
    check-cast v0, La/hcz;

    .line 503
    .line 504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 505
    .line 506
    .line 507
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v1

    .line 511
    check-cast v1, La/o5j;

    .line 512
    .line 513
    iget-object v1, v1, La/o5j;->b:La/a4x;

    .line 514
    .line 515
    new-instance v3, La/zuh;

    .line 516
    .line 517
    const/16 v4, 0xa

    .line 518
    .line 519
    invoke-direct {v3, v4}, La/zuh;-><init>(B)V

    .line 520
    .line 521
    .line 522
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 523
    .line 524
    .line 525
    move-result v4

    .line 526
    new-instance v5, La/vtf;

    .line 527
    .line 528
    const/16 v6, 0xe

    .line 529
    .line 530
    invoke-direct {v5, v3, v1, v6}, La/vtf;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 531
    .line 532
    .line 533
    new-instance v3, La/wl0;

    .line 534
    .line 535
    const/16 v6, 0x19

    .line 536
    .line 537
    invoke-direct {v3, v1, v6}, La/wl0;-><init>(La/a4x;B)V

    .line 538
    .line 539
    .line 540
    new-instance v6, La/zd1;

    .line 541
    .line 542
    const/4 v7, 0x5

    .line 543
    invoke-direct {v6, v1, v7}, La/zd1;-><init>(La/a4x;B)V

    .line 544
    .line 545
    .line 546
    new-instance v1, La/ugd;

    .line 547
    .line 548
    const v7, 0x799532c4

    .line 549
    .line 550
    .line 551
    invoke-direct {v1, v7, v2, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    invoke-virtual {v0, v4, v5, v3, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 555
    .line 556
    .line 557
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_11
    move-object/from16 v0, p1

    .line 561
    .line 562
    check-cast v0, La/uag0;

    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 568
    .line 569
    .line 570
    move-result-object v1

    .line 571
    check-cast v1, Ljava/lang/Number;

    .line 572
    .line 573
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 574
    .line 575
    .line 576
    move-result v1

    .line 577
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 578
    .line 579
    .line 580
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_12
    move-object/from16 v0, p1

    .line 584
    .line 585
    check-cast v0, La/uag0;

    .line 586
    .line 587
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 591
    .line 592
    .line 593
    move-result-object v1

    .line 594
    check-cast v1, Ljava/lang/Number;

    .line 595
    .line 596
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 597
    .line 598
    .line 599
    move-result v1

    .line 600
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 601
    .line 602
    .line 603
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object v0

    .line 606
    :pswitch_13
    move-object/from16 v0, p1

    .line 607
    .line 608
    check-cast v0, La/uag0;

    .line 609
    .line 610
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    check-cast v1, Ljava/lang/Number;

    .line 618
    .line 619
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 620
    .line 621
    .line 622
    move-result v1

    .line 623
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 624
    .line 625
    .line 626
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 627
    .line 628
    return-object v0

    .line 629
    :pswitch_14
    move-object/from16 v0, p1

    .line 630
    .line 631
    check-cast v0, La/uag0;

    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    check-cast v1, Ljava/lang/Number;

    .line 641
    .line 642
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    invoke-virtual {v0, v1}, La/uag0;->v(F)V

    .line 647
    .line 648
    .line 649
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 650
    .line 651
    return-object v0

    .line 652
    :pswitch_15
    move-object/from16 v0, p1

    .line 653
    .line 654
    check-cast v0, La/abi0;

    .line 655
    .line 656
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    check-cast v1, La/a4x;

    .line 664
    .line 665
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    invoke-static {v0, v1}, La/cbi0;->g(La/abi0;I)V

    .line 670
    .line 671
    .line 672
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 673
    .line 674
    return-object v0

    .line 675
    :pswitch_16
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, La/fhl;

    .line 678
    .line 679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    sget-object v13, La/gqj0;->b:Ljava/util/List;

    .line 683
    .line 684
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v0

    .line 688
    check-cast v0, Ljava/lang/Number;

    .line 689
    .line 690
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v2

    .line 698
    check-cast v2, Ljava/lang/Number;

    .line 699
    .line 700
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 701
    .line 702
    .line 703
    move-result v2

    .line 704
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 705
    .line 706
    .line 707
    move-result v0

    .line 708
    int-to-long v3, v0

    .line 709
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 710
    .line 711
    .line 712
    move-result v0

    .line 713
    int-to-long v5, v0

    .line 714
    shl-long v2, v3, v10

    .line 715
    .line 716
    and-long v4, v5, v8

    .line 717
    .line 718
    or-long v15, v2, v4

    .line 719
    .line 720
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, Ljava/lang/Number;

    .line 725
    .line 726
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 727
    .line 728
    .line 729
    move-result v0

    .line 730
    const/high16 v2, 0x42c80000    # 100.0f

    .line 731
    .line 732
    add-float/2addr v0, v2

    .line 733
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v3

    .line 737
    check-cast v3, Ljava/lang/Number;

    .line 738
    .line 739
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    add-float/2addr v3, v2

    .line 744
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 745
    .line 746
    .line 747
    move-result v0

    .line 748
    int-to-long v4, v0

    .line 749
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    int-to-long v2, v0

    .line 754
    shl-long/2addr v4, v10

    .line 755
    and-long/2addr v2, v8

    .line 756
    or-long v17, v4, v2

    .line 757
    .line 758
    new-instance v2, La/e900;

    .line 759
    .line 760
    const/4 v14, 0x0

    .line 761
    move-object v12, v2

    .line 762
    invoke-direct/range {v12 .. v18}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 763
    .line 764
    .line 765
    const/4 v10, 0x0

    .line 766
    const/16 v11, 0x7e

    .line 767
    .line 768
    const-wide/16 v3, 0x0

    .line 769
    .line 770
    const-wide/16 v5, 0x0

    .line 771
    .line 772
    const/4 v7, 0x0

    .line 773
    const/4 v8, 0x0

    .line 774
    const/4 v9, 0x0

    .line 775
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 776
    .line 777
    .line 778
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 779
    .line 780
    return-object v0

    .line 781
    :pswitch_17
    move-object/from16 v1, p1

    .line 782
    .line 783
    check-cast v1, La/g7z;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    invoke-virtual {v1}, La/g7z;->a()V

    .line 789
    .line 790
    .line 791
    const/high16 v0, 0x42100000    # 36.0f

    .line 792
    .line 793
    invoke-virtual {v1, v0}, La/g7z;->w0(F)F

    .line 794
    .line 795
    .line 796
    move-result v0

    .line 797
    const/4 v2, 0x0

    .line 798
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 799
    .line 800
    .line 801
    move-result-object v3

    .line 802
    sget-wide v4, La/y3d;->f:J

    .line 803
    .line 804
    new-instance v6, La/y3d;

    .line 805
    .line 806
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 807
    .line 808
    .line 809
    new-instance v8, Lkotlin/Pair;

    .line 810
    .line 811
    invoke-direct {v8, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 812
    .line 813
    .line 814
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    move-result-object v3

    .line 818
    check-cast v3, Lkotlin/Pair;

    .line 819
    .line 820
    iget-object v3, v3, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 821
    .line 822
    sget-wide v12, La/y3d;->b:J

    .line 823
    .line 824
    new-instance v6, La/y3d;

    .line 825
    .line 826
    invoke-direct {v6, v12, v13}, La/y3d;-><init>(J)V

    .line 827
    .line 828
    .line 829
    new-instance v9, Lkotlin/Pair;

    .line 830
    .line 831
    invoke-direct {v9, v3, v6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 832
    .line 833
    .line 834
    filled-new-array {v8, v9}, [Lkotlin/Pair;

    .line 835
    .line 836
    .line 837
    move-result-object v3

    .line 838
    const/16 v6, 0x8

    .line 839
    .line 840
    invoke-static {v3, v2, v0, v6}, La/yk5;->h([Lkotlin/Pair;FFI)La/e900;

    .line 841
    .line 842
    .line 843
    move-result-object v2

    .line 844
    const/16 v21, 0x6

    .line 845
    .line 846
    const/16 v22, 0x3e

    .line 847
    .line 848
    const-wide/16 v14, 0x0

    .line 849
    .line 850
    const-wide/16 v16, 0x0

    .line 851
    .line 852
    const/16 v18, 0x0

    .line 853
    .line 854
    const/16 v19, 0x0

    .line 855
    .line 856
    const/16 v20, 0x0

    .line 857
    .line 858
    move-wide/from16 v23, v12

    .line 859
    .line 860
    move-object v12, v1

    .line 861
    move-object v13, v2

    .line 862
    move-wide/from16 v1, v23

    .line 863
    .line 864
    invoke-static/range {v12 .. v22}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 865
    .line 866
    .line 867
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v3

    .line 871
    check-cast v3, Lkotlin/Pair;

    .line 872
    .line 873
    iget-object v3, v3, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 874
    .line 875
    check-cast v3, Ljava/lang/Number;

    .line 876
    .line 877
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    sub-float v3, v7, v3

    .line 882
    .line 883
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 884
    .line 885
    .line 886
    move-result-object v3

    .line 887
    new-instance v8, La/y3d;

    .line 888
    .line 889
    invoke-direct {v8, v1, v2}, La/y3d;-><init>(J)V

    .line 890
    .line 891
    .line 892
    new-instance v1, Lkotlin/Pair;

    .line 893
    .line 894
    invoke-direct {v1, v3, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 895
    .line 896
    .line 897
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 898
    .line 899
    .line 900
    move-result-object v2

    .line 901
    new-instance v3, La/y3d;

    .line 902
    .line 903
    invoke-direct {v3, v4, v5}, La/y3d;-><init>(J)V

    .line 904
    .line 905
    .line 906
    new-instance v4, Lkotlin/Pair;

    .line 907
    .line 908
    invoke-direct {v4, v2, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 909
    .line 910
    .line 911
    filled-new-array {v1, v4}, [Lkotlin/Pair;

    .line 912
    .line 913
    .line 914
    move-result-object v1

    .line 915
    iget-object v2, v12, La/g7z;->a:La/a6a;

    .line 916
    .line 917
    invoke-interface {v2}, La/fhl;->d()J

    .line 918
    .line 919
    .line 920
    move-result-wide v3

    .line 921
    shr-long/2addr v3, v10

    .line 922
    long-to-int v3, v3

    .line 923
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 924
    .line 925
    .line 926
    move-result v3

    .line 927
    sub-float/2addr v3, v0

    .line 928
    invoke-interface {v2}, La/fhl;->d()J

    .line 929
    .line 930
    .line 931
    move-result-wide v4

    .line 932
    shr-long/2addr v4, v10

    .line 933
    long-to-int v0, v4

    .line 934
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 935
    .line 936
    .line 937
    move-result v0

    .line 938
    invoke-static {v1, v3, v0, v6}, La/yk5;->h([Lkotlin/Pair;FFI)La/e900;

    .line 939
    .line 940
    .line 941
    move-result-object v2

    .line 942
    const/4 v10, 0x6

    .line 943
    const/16 v11, 0x3e

    .line 944
    .line 945
    const-wide/16 v3, 0x0

    .line 946
    .line 947
    const-wide/16 v5, 0x0

    .line 948
    .line 949
    const/4 v7, 0x0

    .line 950
    const/4 v8, 0x0

    .line 951
    const/4 v9, 0x0

    .line 952
    move-object v1, v12

    .line 953
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 954
    .line 955
    .line 956
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 957
    .line 958
    return-object v0

    .line 959
    :pswitch_18
    move-object/from16 v0, p1

    .line 960
    .line 961
    check-cast v0, Landroid/view/MotionEvent;

    .line 962
    .line 963
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 964
    .line 965
    .line 966
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    check-cast v0, Ljava/lang/Number;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    cmpg-float v0, v0, v7

    .line 977
    .line 978
    if-gez v0, :cond_3

    .line 979
    .line 980
    goto :goto_1

    .line 981
    :cond_3
    move v2, v5

    .line 982
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    return-object v0

    .line 987
    :pswitch_19
    move-object/from16 v0, p1

    .line 988
    .line 989
    check-cast v0, La/uag0;

    .line 990
    .line 991
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    move-result-object v1

    .line 998
    check-cast v1, Ljava/lang/Number;

    .line 999
    .line 1000
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1001
    .line 1002
    .line 1003
    move-result v1

    .line 1004
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 1005
    .line 1006
    .line 1007
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1008
    .line 1009
    return-object v0

    .line 1010
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1011
    .line 1012
    check-cast v0, La/uag0;

    .line 1013
    .line 1014
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1018
    .line 1019
    .line 1020
    move-result-object v1

    .line 1021
    check-cast v1, La/nn8;

    .line 1022
    .line 1023
    iget v1, v1, La/nn8;->c:F

    .line 1024
    .line 1025
    invoke-virtual {v0, v1}, La/uag0;->b(F)V

    .line 1026
    .line 1027
    .line 1028
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1032
    .line 1033
    check-cast v1, La/pi9;

    .line 1034
    .line 1035
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1036
    .line 1037
    .line 1038
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 1039
    .line 1040
    invoke-interface {v2}, La/y99;->d()J

    .line 1041
    .line 1042
    .line 1043
    move-result-wide v2

    .line 1044
    const-wide/16 v4, 0x0

    .line 1045
    .line 1046
    invoke-static {v4, v5, v2, v3}, La/k9x;->r(JJ)La/jge0;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v9

    .line 1050
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v10

    .line 1054
    sget-wide v2, La/y3d;->b:J

    .line 1055
    .line 1056
    new-instance v4, La/y3d;

    .line 1057
    .line 1058
    invoke-direct {v4, v2, v3}, La/y3d;-><init>(J)V

    .line 1059
    .line 1060
    .line 1061
    const/high16 v5, 0x3f000000    # 0.5f

    .line 1062
    .line 1063
    invoke-static {v5, v2, v3}, La/y3d;->c(FJ)J

    .line 1064
    .line 1065
    .line 1066
    move-result-wide v2

    .line 1067
    new-instance v5, La/y3d;

    .line 1068
    .line 1069
    invoke-direct {v5, v2, v3}, La/y3d;-><init>(J)V

    .line 1070
    .line 1071
    .line 1072
    sget-wide v2, La/y3d;->f:J

    .line 1073
    .line 1074
    new-instance v6, La/y3d;

    .line 1075
    .line 1076
    invoke-direct {v6, v2, v3}, La/y3d;-><init>(J)V

    .line 1077
    .line 1078
    .line 1079
    filled-new-array {v4, v5, v6}, [La/y3d;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v2

    .line 1083
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v11

    .line 1087
    invoke-static {}, La/z03;->a()La/w03;

    .line 1088
    .line 1089
    .line 1090
    move-result-object v8

    .line 1091
    new-instance v6, La/dg;

    .line 1092
    .line 1093
    const/16 v12, 0x8

    .line 1094
    .line 1095
    iget-object v7, v0, La/x1d;->b:La/l7m0;

    .line 1096
    .line 1097
    invoke-direct/range {v6 .. v12}, La/dg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v1, v6}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v0

    .line 1104
    return-object v0

    .line 1105
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1106
    .line 1107
    check-cast v0, La/uag0;

    .line 1108
    .line 1109
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1110
    .line 1111
    .line 1112
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v1

    .line 1116
    check-cast v1, La/nn8;

    .line 1117
    .line 1118
    iget v2, v1, La/nn8;->a:F

    .line 1119
    .line 1120
    iget v1, v1, La/nn8;->b:F

    .line 1121
    .line 1122
    sub-float/2addr v2, v1

    .line 1123
    iget-wide v3, v0, La/uag0;->r:J

    .line 1124
    .line 1125
    and-long/2addr v3, v8

    .line 1126
    long-to-int v1, v3

    .line 1127
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1128
    .line 1129
    .line 1130
    move-result v1

    .line 1131
    mul-float/2addr v1, v2

    .line 1132
    invoke-virtual {v0, v1}, La/uag0;->I(F)V

    .line 1133
    .line 1134
    .line 1135
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1136
    .line 1137
    return-object v0

    .line 1138
    nop

    .line 1139
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
