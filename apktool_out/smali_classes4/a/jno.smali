.class public final synthetic La/jno;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jno;->a:B

    iput-boolean p2, p0, La/jno;->b:Z

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
    iget-byte v1, v0, La/jno;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/high16 v3, 0x7f800000    # Float.POSITIVE_INFINITY

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/16 v5, 0x20

    .line 10
    .line 11
    const-wide v6, 0xffffffffL

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    const/4 v8, 0x3

    .line 17
    iget-boolean v0, v0, La/jno;->b:Z

    .line 18
    .line 19
    packed-switch v1, :pswitch_data_0

    .line 20
    .line 21
    .line 22
    move-object/from16 v1, p1

    .line 23
    .line 24
    check-cast v1, La/abi0;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v0}, La/p8n;->c(La/abi0;Z)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, La/abi0;

    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    if-nez v0, :cond_0

    .line 43
    .line 44
    sget-object v0, La/yai0;->a:[La/iiy;

    .line 45
    .line 46
    sget-object v0, La/xai0;->j:La/zai0;

    .line 47
    .line 48
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    invoke-interface {v1, v0, v2}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    move-object/from16 v1, p1

    .line 57
    .line 58
    check-cast v1, La/hcz;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    sget-object v0, La/wha0;->g:La/ugd;

    .line 66
    .line 67
    const/4 v2, 0x0

    .line 68
    invoke-static {v1, v2, v2, v0, v8}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 69
    .line 70
    .line 71
    :cond_1
    sget-object v5, La/wha0;->h:La/ugd;

    .line 72
    .line 73
    const/4 v6, 0x6

    .line 74
    const/16 v2, 0x8

    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    const/4 v4, 0x0

    .line 78
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 79
    .line 80
    .line 81
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 82
    .line 83
    return-object v0

    .line 84
    :pswitch_2
    move-object/from16 v1, p1

    .line 85
    .line 86
    check-cast v1, La/uag0;

    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    const/high16 v2, 0x41800000    # 16.0f

    .line 92
    .line 93
    if-eqz v0, :cond_2

    .line 94
    .line 95
    sget-object v0, La/qmk;->a:La/zcl;

    .line 96
    .line 97
    iget-object v0, v1, La/uag0;->t:La/w6k;

    .line 98
    .line 99
    invoke-interface {v0}, La/w6k;->getDensity()F

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    mul-float/2addr v0, v2

    .line 104
    neg-float v0, v0

    .line 105
    goto :goto_0

    .line 106
    :cond_2
    sget-object v0, La/qmk;->a:La/zcl;

    .line 107
    .line 108
    iget-object v0, v1, La/uag0;->t:La/w6k;

    .line 109
    .line 110
    invoke-interface {v0}, La/w6k;->getDensity()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    mul-float/2addr v0, v2

    .line 115
    :goto_0
    invoke-virtual {v1, v0}, La/uag0;->H(F)V

    .line 116
    .line 117
    .line 118
    iget-object v0, v1, La/uag0;->t:La/w6k;

    .line 119
    .line 120
    invoke-interface {v0}, La/w6k;->getDensity()F

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    const/high16 v2, 0x42000000    # 32.0f

    .line 125
    .line 126
    mul-float/2addr v0, v2

    .line 127
    neg-float v0, v0

    .line 128
    invoke-virtual {v1, v0}, La/uag0;->I(F)V

    .line 129
    .line 130
    .line 131
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 132
    .line 133
    return-object v0

    .line 134
    :pswitch_3
    move-object/from16 v1, p1

    .line 135
    .line 136
    check-cast v1, La/pi9;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    if-eqz v0, :cond_3

    .line 142
    .line 143
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 144
    .line 145
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 146
    .line 147
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v9

    .line 151
    new-instance v0, La/y3d;

    .line 152
    .line 153
    invoke-direct {v0, v9, v10}, La/y3d;-><init>(J)V

    .line 154
    .line 155
    .line 156
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 161
    .line 162
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 163
    .line 164
    .line 165
    move-result-wide v9

    .line 166
    new-instance v2, La/y3d;

    .line 167
    .line 168
    invoke-direct {v2, v9, v10}, La/y3d;-><init>(J)V

    .line 169
    .line 170
    .line 171
    filled-new-array {v0, v2}, [La/y3d;

    .line 172
    .line 173
    .line 174
    move-result-object v0

    .line 175
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v0

    .line 179
    :goto_1
    move-object v10, v0

    .line 180
    goto :goto_2

    .line 181
    :cond_3
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 182
    .line 183
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 188
    .line 189
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 190
    .line 191
    .line 192
    move-result-wide v9

    .line 193
    new-instance v0, La/y3d;

    .line 194
    .line 195
    invoke-direct {v0, v9, v10}, La/y3d;-><init>(J)V

    .line 196
    .line 197
    .line 198
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 199
    .line 200
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 201
    .line 202
    .line 203
    move-result-wide v9

    .line 204
    new-instance v2, La/y3d;

    .line 205
    .line 206
    invoke-direct {v2, v9, v10}, La/y3d;-><init>(J)V

    .line 207
    .line 208
    .line 209
    filled-new-array {v0, v2}, [La/y3d;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    goto :goto_1

    .line 218
    :goto_2
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 219
    .line 220
    .line 221
    move-result v0

    .line 222
    int-to-long v11, v0

    .line 223
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    int-to-long v13, v0

    .line 228
    shl-long/2addr v11, v5

    .line 229
    and-long/2addr v13, v6

    .line 230
    or-long v12, v11, v13

    .line 231
    .line 232
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 233
    .line 234
    .line 235
    move-result v0

    .line 236
    int-to-long v2, v0

    .line 237
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 238
    .line 239
    .line 240
    move-result v0

    .line 241
    int-to-long v14, v0

    .line 242
    shl-long/2addr v2, v5

    .line 243
    and-long v4, v14, v6

    .line 244
    .line 245
    or-long v14, v2, v4

    .line 246
    .line 247
    new-instance v9, La/e900;

    .line 248
    .line 249
    const/4 v11, 0x0

    .line 250
    invoke-direct/range {v9 .. v15}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 251
    .line 252
    .line 253
    new-instance v0, La/n51;

    .line 254
    .line 255
    invoke-direct {v0, v9, v8}, La/n51;-><init>(La/e900;B)V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    return-object v0

    .line 263
    :pswitch_4
    move-object/from16 v1, p1

    .line 264
    .line 265
    check-cast v1, La/pi9;

    .line 266
    .line 267
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    if-eqz v0, :cond_4

    .line 271
    .line 272
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 273
    .line 274
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 275
    .line 276
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 277
    .line 278
    .line 279
    move-result-wide v8

    .line 280
    new-instance v0, La/y3d;

    .line 281
    .line 282
    invoke-direct {v0, v8, v9}, La/y3d;-><init>(J)V

    .line 283
    .line 284
    .line 285
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 290
    .line 291
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 292
    .line 293
    .line 294
    move-result-wide v8

    .line 295
    new-instance v2, La/y3d;

    .line 296
    .line 297
    invoke-direct {v2, v8, v9}, La/y3d;-><init>(J)V

    .line 298
    .line 299
    .line 300
    filled-new-array {v0, v2}, [La/y3d;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 305
    .line 306
    .line 307
    move-result-object v0

    .line 308
    :goto_3
    move-object v9, v0

    .line 309
    goto :goto_4

    .line 310
    :cond_4
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 311
    .line 312
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 317
    .line 318
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 319
    .line 320
    .line 321
    move-result-wide v8

    .line 322
    new-instance v0, La/y3d;

    .line 323
    .line 324
    invoke-direct {v0, v8, v9}, La/y3d;-><init>(J)V

    .line 325
    .line 326
    .line 327
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 328
    .line 329
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v8

    .line 333
    new-instance v2, La/y3d;

    .line 334
    .line 335
    invoke-direct {v2, v8, v9}, La/y3d;-><init>(J)V

    .line 336
    .line 337
    .line 338
    filled-new-array {v0, v2}, [La/y3d;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    goto :goto_3

    .line 347
    :goto_4
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 348
    .line 349
    .line 350
    move-result v0

    .line 351
    int-to-long v2, v0

    .line 352
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    int-to-long v10, v0

    .line 357
    shl-long/2addr v2, v5

    .line 358
    and-long/2addr v10, v6

    .line 359
    or-long v11, v2, v10

    .line 360
    .line 361
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 362
    .line 363
    .line 364
    move-result v0

    .line 365
    int-to-long v2, v0

    .line 366
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 367
    .line 368
    .line 369
    move-result v0

    .line 370
    int-to-long v13, v0

    .line 371
    shl-long/2addr v2, v5

    .line 372
    and-long v4, v13, v6

    .line 373
    .line 374
    or-long v13, v2, v4

    .line 375
    .line 376
    new-instance v8, La/e900;

    .line 377
    .line 378
    const/4 v10, 0x0

    .line 379
    invoke-direct/range {v8 .. v14}, La/e900;-><init>(Ljava/util/List;Ljava/util/ArrayList;JJ)V

    .line 380
    .line 381
    .line 382
    new-instance v0, La/n51;

    .line 383
    .line 384
    const/4 v2, 0x4

    .line 385
    invoke-direct {v0, v8, v2}, La/n51;-><init>(La/e900;B)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v1, v0}, La/pi9;->a(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    return-object v0

    .line 393
    :pswitch_5
    move-object/from16 v1, p1

    .line 394
    .line 395
    check-cast v1, Landroid/content/res/Resources;

    .line 396
    .line 397
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 401
    .line 402
    .line 403
    move-result-object v0

    .line 404
    return-object v0

    .line 405
    :pswitch_6
    move-object/from16 v1, p1

    .line 406
    .line 407
    check-cast v1, La/iz30;

    .line 408
    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    if-eqz v0, :cond_6

    .line 413
    .line 414
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 415
    .line 416
    .line 417
    move-result v0

    .line 418
    if-eq v0, v8, :cond_5

    .line 419
    .line 420
    const/4 v1, 0x7

    .line 421
    if-eq v0, v1, :cond_5

    .line 422
    .line 423
    const/16 v1, 0x9

    .line 424
    .line 425
    if-eq v0, v1, :cond_5

    .line 426
    .line 427
    const/16 v1, 0x38

    .line 428
    .line 429
    if-eq v0, v1, :cond_5

    .line 430
    .line 431
    const/16 v1, 0x26

    .line 432
    .line 433
    if-eq v0, v1, :cond_5

    .line 434
    .line 435
    const/16 v1, 0x27

    .line 436
    .line 437
    if-eq v0, v1, :cond_5

    .line 438
    .line 439
    const/16 v1, 0x2a

    .line 440
    .line 441
    if-eq v0, v1, :cond_5

    .line 442
    .line 443
    const/16 v1, 0x2b

    .line 444
    .line 445
    if-eq v0, v1, :cond_5

    .line 446
    .line 447
    const/16 v1, 0x2e

    .line 448
    .line 449
    if-eq v0, v1, :cond_5

    .line 450
    .line 451
    const/16 v1, 0x2f

    .line 452
    .line 453
    if-eq v0, v1, :cond_5

    .line 454
    .line 455
    const/16 v1, 0x32

    .line 456
    .line 457
    if-eq v0, v1, :cond_5

    .line 458
    .line 459
    const/16 v1, 0x33

    .line 460
    .line 461
    if-eq v0, v1, :cond_5

    .line 462
    .line 463
    const/16 v1, 0x3f

    .line 464
    .line 465
    if-eq v0, v1, :cond_5

    .line 466
    .line 467
    const/16 v1, 0x40

    .line 468
    .line 469
    if-eq v0, v1, :cond_5

    .line 470
    .line 471
    packed-switch v0, :pswitch_data_1

    .line 472
    .line 473
    .line 474
    goto :goto_5

    .line 475
    :cond_5
    :pswitch_7
    const/4 v2, 0x0

    .line 476
    :cond_6
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    return-object v0

    .line 481
    :pswitch_8
    move-object/from16 v1, p1

    .line 482
    .line 483
    check-cast v1, La/lno;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    iget-object v1, v1, La/lno;->a:Ljava/util/Map;

    .line 489
    .line 490
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 491
    .line 492
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 493
    .line 494
    .line 495
    move-result v4

    .line 496
    invoke-static {v4}, La/wp20;->a(I)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    invoke-direct {v3, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, Ljava/lang/Iterable;

    .line 508
    .line 509
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    :goto_6
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 514
    .line 515
    .line 516
    move-result v4

    .line 517
    if-eqz v4, :cond_7

    .line 518
    .line 519
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v4

    .line 523
    check-cast v4, Ljava/util/Map$Entry;

    .line 524
    .line 525
    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 530
    .line 531
    .line 532
    move-result-object v5

    .line 533
    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    goto :goto_6

    .line 537
    :cond_7
    new-instance v0, La/lno;

    .line 538
    .line 539
    invoke-direct {v0, v3, v2}, La/lno;-><init>(Ljava/util/Map;Z)V

    .line 540
    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    :pswitch_data_1
    .packed-switch 0xe
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
        :pswitch_7
    .end packed-switch
.end method
