.class public final synthetic La/mw8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nw8;


# direct methods
.method public synthetic constructor <init>(La/nw8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mw8;->a:B

    iput-object p1, p0, La/mw8;->b:La/nw8;

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
    iget-byte v1, v0, La/mw8;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    iget-object v0, v0, La/mw8;->b:La/nw8;

    .line 8
    .line 9
    const/high16 v4, 0x41800000    # 16.0f

    .line 10
    .line 11
    const/16 v5, 0xa

    .line 12
    .line 13
    const/4 v6, 0x2

    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    move-object/from16 v1, p1

    .line 20
    .line 21
    check-cast v1, La/ux8;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    instance-of v9, v1, La/tx8;

    .line 27
    .line 28
    if-nez v9, :cond_1

    .line 29
    .line 30
    iget-object v9, v0, La/nw8;->h:La/n0o0;

    .line 31
    .line 32
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v9

    .line 36
    check-cast v9, La/fee;

    .line 37
    .line 38
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    instance-of v9, v1, La/qx8;

    .line 42
    .line 43
    if-eqz v9, :cond_0

    .line 44
    .line 45
    iget-object v0, v0, La/nw8;->k:La/n0o0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/hjm;

    .line 52
    .line 53
    sget-object v9, La/kjm;->a:La/kjm;

    .line 54
    .line 55
    new-instance v9, La/cv8;

    .line 56
    .line 57
    sget-object v10, La/qmk;->a:La/zcl;

    .line 58
    .line 59
    invoke-static {v4, v2, v4, v2, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    sget-object v10, La/bv8;->d:La/bv8;

    .line 68
    .line 69
    invoke-direct {v9, v4, v5, v10}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 70
    .line 71
    .line 72
    new-instance v4, La/vv8;

    .line 73
    .line 74
    const-string v5, "SORTING_HEADER_ID"

    .line 75
    .line 76
    invoke-direct {v4, v5, v9, v0}, La/vv8;-><init>(Ljava/lang/String;La/cv8;La/jjm;)V

    .line 77
    .line 78
    .line 79
    check-cast v1, La/qx8;

    .line 80
    .line 81
    new-instance v9, La/rqm;

    .line 82
    .line 83
    new-instance v10, La/tui0;

    .line 84
    .line 85
    iget-object v0, v1, La/qx8;->b:Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;

    .line 86
    .line 87
    iget-object v0, v0, Lorg/xplatform/aggregator/impl/category/data/models/AggregatorSortingOptionModel;->a:Ljava/lang/String;

    .line 88
    .line 89
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 90
    .line 91
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 96
    .line 97
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 98
    .line 99
    .line 100
    move-result-wide v11

    .line 101
    new-instance v1, La/y3d;

    .line 102
    .line 103
    invoke-direct {v1, v11, v12}, La/y3d;-><init>(J)V

    .line 104
    .line 105
    .line 106
    invoke-direct {v10, v0, v1}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 107
    .line 108
    .line 109
    new-instance v12, La/fvi0;

    .line 110
    .line 111
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 116
    .line 117
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 118
    .line 119
    .line 120
    move-result-wide v0

    .line 121
    new-instance v5, La/y3d;

    .line 122
    .line 123
    invoke-direct {v5, v0, v1}, La/y3d;-><init>(J)V

    .line 124
    .line 125
    .line 126
    invoke-direct {v12, v5}, La/fvi0;-><init>(La/y3d;)V

    .line 127
    .line 128
    .line 129
    sget-object v13, La/d4d;->B:La/d4d;

    .line 130
    .line 131
    sget-object v15, La/wui0;->a:La/wui0;

    .line 132
    .line 133
    const/16 v17, 0x0

    .line 134
    .line 135
    const/16 v18, 0x1aa

    .line 136
    .line 137
    const/4 v11, 0x0

    .line 138
    const/4 v14, 0x0

    .line 139
    const/16 v16, 0x0

    .line 140
    .line 141
    invoke-direct/range {v9 .. v18}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 142
    .line 143
    .line 144
    new-instance v0, La/cv8;

    .line 145
    .line 146
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    sget-object v3, La/bv8;->c:La/bv8;

    .line 155
    .line 156
    invoke-direct {v0, v1, v2, v3}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/wv8;

    .line 160
    .line 161
    const-string v2, "SORTING_SETTING_CELL_ID"

    .line 162
    .line 163
    invoke-direct {v1, v2, v0, v9}, La/wv8;-><init>(Ljava/lang/String;La/cv8;La/rqm;)V

    .line 164
    .line 165
    .line 166
    new-array v0, v6, [La/zv8;

    .line 167
    .line 168
    aput-object v4, v0, v8

    .line 169
    .line 170
    aput-object v1, v0, v7

    .line 171
    .line 172
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    goto :goto_0

    .line 177
    :cond_0
    sget-object v0, La/iun;->a:La/iun;

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_1
    new-instance v0, La/ijm;

    .line 181
    .line 182
    new-instance v1, La/qjm;

    .line 183
    .line 184
    invoke-direct {v1}, La/qjm;-><init>()V

    .line 185
    .line 186
    .line 187
    invoke-direct {v0, v1}, La/ijm;-><init>(La/qjm;)V

    .line 188
    .line 189
    .line 190
    sget-object v1, La/kjm;->a:La/kjm;

    .line 191
    .line 192
    sget-object v1, La/bv8;->d:La/bv8;

    .line 193
    .line 194
    sget-object v9, La/qmk;->a:La/zcl;

    .line 195
    .line 196
    invoke-static {v4, v2, v4, v2, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    new-instance v9, La/cv8;

    .line 205
    .line 206
    invoke-direct {v9, v4, v5, v1}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 207
    .line 208
    .line 209
    new-instance v4, La/vv8;

    .line 210
    .line 211
    const-string v5, "SORTING_HEADER_SHIMMER_ID"

    .line 212
    .line 213
    invoke-direct {v4, v5, v9, v0}, La/vv8;-><init>(Ljava/lang/String;La/cv8;La/jjm;)V

    .line 214
    .line 215
    .line 216
    new-instance v0, La/yv8;

    .line 217
    .line 218
    new-instance v5, La/cv8;

    .line 219
    .line 220
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 225
    .line 226
    .line 227
    move-result-object v2

    .line 228
    invoke-direct {v5, v9, v2, v1}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 229
    .line 230
    .line 231
    sget-object v1, La/xv8;->a:La/xv8;

    .line 232
    .line 233
    const-string v1, "SORTING_SETTING_CELL_SHIMMER_ID"

    .line 234
    .line 235
    invoke-direct {v0, v1, v5}, La/yv8;-><init>(Ljava/lang/String;La/cv8;)V

    .line 236
    .line 237
    .line 238
    new-array v1, v6, [La/zv8;

    .line 239
    .line 240
    aput-object v4, v1, v8

    .line 241
    .line 242
    aput-object v0, v1, v7

    .line 243
    .line 244
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 245
    .line 246
    .line 247
    move-result-object v0

    .line 248
    :goto_0
    return-object v0

    .line 249
    :pswitch_0
    move-object/from16 v1, p1

    .line 250
    .line 251
    check-cast v1, La/xw8;

    .line 252
    .line 253
    sget-object v9, La/s6t0;->a:La/pz40;

    .line 254
    .line 255
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    iget-object v9, v0, La/nw8;->i:La/n0o0;

    .line 259
    .line 260
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    move-result-object v9

    .line 264
    check-cast v9, La/fee;

    .line 265
    .line 266
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    instance-of v9, v9, La/tx8;

    .line 271
    .line 272
    const/16 v10, 0xd

    .line 273
    .line 274
    const/high16 v11, 0x41000000    # 8.0f

    .line 275
    .line 276
    if-eqz v9, :cond_2

    .line 277
    .line 278
    new-instance v0, La/ijm;

    .line 279
    .line 280
    new-instance v1, La/qjm;

    .line 281
    .line 282
    invoke-direct {v1}, La/qjm;-><init>()V

    .line 283
    .line 284
    .line 285
    invoke-direct {v0, v1}, La/ijm;-><init>(La/qjm;)V

    .line 286
    .line 287
    .line 288
    sget-object v1, La/kjm;->a:La/kjm;

    .line 289
    .line 290
    sget-object v1, La/bv8;->d:La/bv8;

    .line 291
    .line 292
    sget-object v9, La/qmk;->a:La/zcl;

    .line 293
    .line 294
    invoke-static {v4, v2, v4, v2, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 295
    .line 296
    .line 297
    move-result-object v4

    .line 298
    invoke-static {v2, v11, v2, v2, v10}, La/s5x0;->u(FFFFI)La/lh80;

    .line 299
    .line 300
    .line 301
    move-result-object v5

    .line 302
    new-instance v9, La/cv8;

    .line 303
    .line 304
    invoke-direct {v9, v4, v5, v1}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 305
    .line 306
    .line 307
    new-instance v4, La/vv8;

    .line 308
    .line 309
    const-string v5, "LANGUAGES_HEADER_SHIMMER_ID"

    .line 310
    .line 311
    invoke-direct {v4, v5, v9, v0}, La/vv8;-><init>(Ljava/lang/String;La/cv8;La/jjm;)V

    .line 312
    .line 313
    .line 314
    new-instance v0, La/yv8;

    .line 315
    .line 316
    new-instance v5, La/cv8;

    .line 317
    .line 318
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 319
    .line 320
    .line 321
    move-result-object v9

    .line 322
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-direct {v5, v9, v2, v1}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 327
    .line 328
    .line 329
    sget-object v1, La/xv8;->a:La/xv8;

    .line 330
    .line 331
    const-string v1, "LANGUAGES_SETTING_CELL_SHIMMER_ID"

    .line 332
    .line 333
    invoke-direct {v0, v1, v5}, La/yv8;-><init>(Ljava/lang/String;La/cv8;)V

    .line 334
    .line 335
    .line 336
    new-array v1, v6, [La/zv8;

    .line 337
    .line 338
    aput-object v4, v1, v8

    .line 339
    .line 340
    aput-object v0, v1, v7

    .line 341
    .line 342
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    goto/16 :goto_b

    .line 347
    .line 348
    :cond_2
    instance-of v6, v1, La/vw8;

    .line 349
    .line 350
    if-eqz v6, :cond_d

    .line 351
    .line 352
    check-cast v1, La/vw8;

    .line 353
    .line 354
    iget-object v1, v1, La/vw8;->a:Ljava/util/List;

    .line 355
    .line 356
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 357
    .line 358
    .line 359
    move-result v6

    .line 360
    const/4 v9, 0x6

    .line 361
    if-nez v6, :cond_3

    .line 362
    .line 363
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 364
    .line 365
    .line 366
    move-result v6

    .line 367
    if-gt v6, v9, :cond_3

    .line 368
    .line 369
    move v6, v7

    .line 370
    goto :goto_1

    .line 371
    :cond_3
    move v6, v8

    .line 372
    :goto_1
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 373
    .line 374
    .line 375
    move-result-object v12

    .line 376
    iget-object v13, v0, La/nw8;->d:La/n0o0;

    .line 377
    .line 378
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v13

    .line 382
    check-cast v13, La/hjm;

    .line 383
    .line 384
    sget-object v14, La/kjm;->a:La/kjm;

    .line 385
    .line 386
    new-instance v14, La/cv8;

    .line 387
    .line 388
    sget-object v15, La/qmk;->a:La/zcl;

    .line 389
    .line 390
    invoke-static {v4, v2, v4, v2, v5}, La/s5x0;->u(FFFFI)La/lh80;

    .line 391
    .line 392
    .line 393
    move-result-object v15

    .line 394
    invoke-static {v2, v11, v2, v2, v10}, La/s5x0;->u(FFFFI)La/lh80;

    .line 395
    .line 396
    .line 397
    move-result-object v10

    .line 398
    sget-object v7, La/bv8;->d:La/bv8;

    .line 399
    .line 400
    invoke-direct {v14, v15, v10, v7}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 401
    .line 402
    .line 403
    new-instance v7, La/vv8;

    .line 404
    .line 405
    const-string v10, "LANGUAGES_HEADER_ID"

    .line 406
    .line 407
    invoke-direct {v7, v10, v14, v13}, La/vv8;-><init>(Ljava/lang/String;La/cv8;La/jjm;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v12, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 414
    .line 415
    .line 416
    move-result v7

    .line 417
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 418
    .line 419
    .line 420
    move-result v10

    .line 421
    if-nez v10, :cond_4

    .line 422
    .line 423
    if-gt v7, v9, :cond_4

    .line 424
    .line 425
    const/4 v10, 0x1

    .line 426
    goto :goto_2

    .line 427
    :cond_4
    move v10, v8

    .line 428
    :goto_2
    if-gt v7, v9, :cond_5

    .line 429
    .line 430
    new-instance v7, La/fvi0;

    .line 431
    .line 432
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 433
    .line 434
    .line 435
    move-result-object v9

    .line 436
    iget-object v9, v9, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 437
    .line 438
    invoke-virtual {v9}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 439
    .line 440
    .line 441
    move-result-wide v13

    .line 442
    new-instance v9, La/y3d;

    .line 443
    .line 444
    invoke-direct {v9, v13, v14}, La/y3d;-><init>(J)V

    .line 445
    .line 446
    .line 447
    invoke-direct {v7, v9}, La/fvi0;-><init>(La/y3d;)V

    .line 448
    .line 449
    .line 450
    move-object/from16 v19, v7

    .line 451
    .line 452
    goto :goto_3

    .line 453
    :cond_5
    new-instance v9, La/kpe;

    .line 454
    .line 455
    invoke-direct {v9}, La/kpe;-><init>()V

    .line 456
    .line 457
    .line 458
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 459
    .line 460
    .line 461
    move-result-object v13

    .line 462
    iget-object v13, v13, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 463
    .line 464
    invoke-virtual {v13}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 465
    .line 466
    .line 467
    move-result-wide v13

    .line 468
    new-instance v15, La/gvi0;

    .line 469
    .line 470
    new-instance v4, La/y3d;

    .line 471
    .line 472
    invoke-direct {v4, v13, v14}, La/y3d;-><init>(J)V

    .line 473
    .line 474
    .line 475
    invoke-direct {v15, v9, v7, v4}, La/gvi0;-><init>(La/kpe;ILa/y3d;)V

    .line 476
    .line 477
    .line 478
    move-object/from16 v19, v15

    .line 479
    .line 480
    :goto_3
    new-instance v16, La/rqm;

    .line 481
    .line 482
    new-instance v4, La/tui0;

    .line 483
    .line 484
    iget-object v0, v0, La/nw8;->b:La/ctf0;

    .line 485
    .line 486
    new-array v7, v8, [Ljava/lang/Object;

    .line 487
    .line 488
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 489
    .line 490
    invoke-static {v7, v8}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    move-result-object v7

    .line 494
    const v8, 0x7f131233

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0, v8, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 502
    .line 503
    .line 504
    move-result-object v7

    .line 505
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 506
    .line 507
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 508
    .line 509
    .line 510
    move-result-wide v7

    .line 511
    new-instance v9, La/y3d;

    .line 512
    .line 513
    invoke-direct {v9, v7, v8}, La/y3d;-><init>(J)V

    .line 514
    .line 515
    .line 516
    invoke-direct {v4, v0, v9}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 517
    .line 518
    .line 519
    if-eqz v10, :cond_6

    .line 520
    .line 521
    sget-object v0, La/d4d;->z:La/d4d;

    .line 522
    .line 523
    :goto_4
    move-object/from16 v20, v0

    .line 524
    .line 525
    goto :goto_5

    .line 526
    :cond_6
    sget-object v0, La/d4d;->B:La/d4d;

    .line 527
    .line 528
    goto :goto_4

    .line 529
    :goto_5
    const/16 v24, 0x0

    .line 530
    .line 531
    const/16 v25, 0x1ea

    .line 532
    .line 533
    const/16 v18, 0x0

    .line 534
    .line 535
    const/16 v21, 0x0

    .line 536
    .line 537
    const/16 v22, 0x0

    .line 538
    .line 539
    const/16 v23, 0x0

    .line 540
    .line 541
    move-object/from16 v17, v4

    .line 542
    .line 543
    invoke-direct/range {v16 .. v25}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 544
    .line 545
    .line 546
    move-object/from16 v0, v16

    .line 547
    .line 548
    new-instance v4, La/cv8;

    .line 549
    .line 550
    if-eqz v10, :cond_7

    .line 551
    .line 552
    const/high16 v7, 0x41800000    # 16.0f

    .line 553
    .line 554
    goto :goto_6

    .line 555
    :cond_7
    move v7, v2

    .line 556
    :goto_6
    if-eqz v10, :cond_8

    .line 557
    .line 558
    const/high16 v8, 0x41800000    # 16.0f

    .line 559
    .line 560
    goto :goto_7

    .line 561
    :cond_8
    move v8, v2

    .line 562
    :goto_7
    if-eqz v10, :cond_9

    .line 563
    .line 564
    const/high16 v9, 0x41800000    # 16.0f

    .line 565
    .line 566
    goto :goto_8

    .line 567
    :cond_9
    move v9, v2

    .line 568
    :goto_8
    const/16 v13, 0x8

    .line 569
    .line 570
    invoke-static {v7, v8, v9, v2, v13}, La/s5x0;->u(FFFFI)La/lh80;

    .line 571
    .line 572
    .line 573
    move-result-object v7

    .line 574
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 575
    .line 576
    .line 577
    move-result-object v8

    .line 578
    if-eqz v10, :cond_a

    .line 579
    .line 580
    sget-object v9, La/bv8;->a:La/bv8;

    .line 581
    .line 582
    goto :goto_9

    .line 583
    :cond_a
    sget-object v9, La/bv8;->c:La/bv8;

    .line 584
    .line 585
    :goto_9
    invoke-direct {v4, v7, v8, v9}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 586
    .line 587
    .line 588
    new-instance v7, La/wv8;

    .line 589
    .line 590
    const-string v8, "LANGUAGES_SETTING_CELL_ID"

    .line 591
    .line 592
    invoke-direct {v7, v8, v4, v0}, La/wv8;-><init>(Ljava/lang/String;La/cv8;La/rqm;)V

    .line 593
    .line 594
    .line 595
    invoke-virtual {v12, v7}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 596
    .line 597
    .line 598
    if-eqz v6, :cond_c

    .line 599
    .line 600
    new-instance v0, Ljava/util/ArrayList;

    .line 601
    .line 602
    invoke-static {v1, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    invoke-direct {v0, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 607
    .line 608
    .line 609
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 614
    .line 615
    .line 616
    move-result v4

    .line 617
    if-eqz v4, :cond_b

    .line 618
    .line 619
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    check-cast v4, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;

    .line 624
    .line 625
    new-instance v13, La/lxl;

    .line 626
    .line 627
    iget v5, v4, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;->a:I

    .line 628
    .line 629
    int-to-long v14, v5

    .line 630
    new-instance v5, La/xxl;

    .line 631
    .line 632
    iget-object v4, v4, Lorg/xplatform/aggregator/impl/core/domain/models/AggregatorGameLanguage;->b:Ljava/lang/String;

    .line 633
    .line 634
    invoke-direct {v5, v4}, La/xxl;-><init>(Ljava/lang/String;)V

    .line 635
    .line 636
    .line 637
    sget-object v18, La/uxl;->a:La/uxl;

    .line 638
    .line 639
    const/16 v19, 0x0

    .line 640
    .line 641
    const/16 v20, 0x68

    .line 642
    .line 643
    const/16 v17, 0x0

    .line 644
    .line 645
    move-object/from16 v16, v5

    .line 646
    .line 647
    invoke-direct/range {v13 .. v20}, La/lxl;-><init>(JLa/dyl;ZLa/uxl;La/cwl;I)V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v0, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    goto :goto_a

    .line 654
    :cond_b
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 655
    .line 656
    .line 657
    move-result-object v5

    .line 658
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 659
    .line 660
    .line 661
    move-result-object v8

    .line 662
    sget-object v6, La/tyl;->a:La/tyl;

    .line 663
    .line 664
    sget-object v7, La/syl;->b:La/syl;

    .line 665
    .line 666
    new-instance v4, La/fyl;

    .line 667
    .line 668
    const/4 v9, 0x0

    .line 669
    const/16 v10, 0x10

    .line 670
    .line 671
    invoke-direct/range {v4 .. v10}, La/fyl;-><init>(La/a4x;La/tyl;La/syl;La/hh80;La/jyl;I)V

    .line 672
    .line 673
    .line 674
    sget-object v0, La/vxl;->a:La/vxl;

    .line 675
    .line 676
    new-instance v0, La/cv8;

    .line 677
    .line 678
    sget-object v1, La/qmk;->a:La/zcl;

    .line 679
    .line 680
    new-instance v1, La/lh80;

    .line 681
    .line 682
    const/high16 v5, 0x41800000    # 16.0f

    .line 683
    .line 684
    invoke-direct {v1, v5, v11, v5, v5}, La/lh80;-><init>(FFFF)V

    .line 685
    .line 686
    .line 687
    invoke-static {v2, v2, v3}, La/s5x0;->t(FFI)La/lh80;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    sget-object v3, La/bv8;->b:La/bv8;

    .line 692
    .line 693
    invoke-direct {v0, v1, v2, v3}, La/cv8;-><init>(La/lh80;La/lh80;La/bv8;)V

    .line 694
    .line 695
    .line 696
    new-instance v1, La/uv8;

    .line 697
    .line 698
    invoke-direct {v1, v0, v4}, La/uv8;-><init>(La/cv8;La/fyl;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v12, v1}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    :cond_c
    invoke-static {v12}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    goto :goto_b

    .line 709
    :cond_d
    sget-object v0, La/iun;->a:La/iun;

    .line 710
    .line 711
    :goto_b
    return-object v0

    .line 712
    nop

    .line 713
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
