.class public final La/nu7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:La/l7m0;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILa/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/nu7;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/nu7;->b:I

    .line 8
    .line 9
    iput-object p3, p0, La/nu7;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p2, p0, La/nu7;->c:La/l7m0;

    .line 12
    .line 13
    return-void
.end method

.method public constructor <init>(La/a4x;ILa/l7m0;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/nu7;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/nu7;->d:Ljava/lang/Object;

    iput p2, p0, La/nu7;->b:I

    iput-object p3, p0, La/nu7;->c:La/l7m0;

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    iget-byte v3, v0, La/nu7;->a:B

    .line 8
    .line 9
    iget-object v4, v0, La/nu7;->d:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v5, v0, La/nu7;->c:La/l7m0;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    packed-switch v3, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    sget-object v3, La/qmk;->a:La/zcl;

    .line 21
    .line 22
    const/high16 v3, 0x40800000    # 4.0f

    .line 23
    .line 24
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    const/high16 v7, 0x41000000    # 8.0f

    .line 29
    .line 30
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    const/high16 v8, 0x42200000    # 40.0f

    .line 35
    .line 36
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/high16 v10, 0x42800000    # 64.0f

    .line 41
    .line 42
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 43
    .line 44
    .line 45
    move-result v10

    .line 46
    const/high16 v11, 0x41c00000    # 24.0f

    .line 47
    .line 48
    invoke-interface {v1, v11}, La/w6k;->T(F)I

    .line 49
    .line 50
    .line 51
    move-result v11

    .line 52
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    check-cast v4, La/a4x;

    .line 57
    .line 58
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    const/4 v12, 0x5

    .line 63
    if-le v4, v12, :cond_0

    .line 64
    .line 65
    move v4, v12

    .line 66
    :cond_0
    const/4 v12, 0x1

    .line 67
    if-lez v4, :cond_1

    .line 68
    .line 69
    add-int/2addr v11, v7

    .line 70
    mul-int/2addr v8, v4

    .line 71
    add-int/2addr v8, v11

    .line 72
    invoke-static {v4, v12, v7, v8}, La/twn;->b(IIII)I

    .line 73
    .line 74
    .line 75
    move-result v11

    .line 76
    :cond_1
    const/4 v4, 0x4

    .line 77
    iget v0, v0, La/nu7;->b:I

    .line 78
    .line 79
    if-nez v0, :cond_2

    .line 80
    .line 81
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    check-cast v0, La/pj30;

    .line 86
    .line 87
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 92
    .line 93
    .line 94
    move-result v3

    .line 95
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 96
    .line 97
    .line 98
    move-result v7

    .line 99
    invoke-static {v2, v3, v6, v7, v4}, La/r4e;->b(IIIII)J

    .line 100
    .line 101
    .line 102
    move-result-wide v2

    .line 103
    invoke-interface {v0, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    int-to-float v2, v11

    .line 108
    iget v3, v0, La/pu90;->b:I

    .line 109
    .line 110
    sub-int/2addr v3, v11

    .line 111
    int-to-float v3, v3

    .line 112
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    check-cast v4, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v4}, Ljava/lang/Number;->floatValue()F

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    mul-float/2addr v4, v3

    .line 123
    add-float/2addr v4, v2

    .line 124
    invoke-static {v4}, La/si30;->b(F)I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    iget v3, v0, La/pu90;->b:I

    .line 129
    .line 130
    invoke-static {v2, v11, v3}, La/l1e0;->d(III)I

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    new-instance v4, La/cam;

    .line 139
    .line 140
    invoke-direct {v4, v0, v6}, La/cam;-><init>(La/pu90;B)V

    .line 141
    .line 142
    .line 143
    invoke-static {v1, v3, v2, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    goto/16 :goto_1

    .line 148
    .line 149
    :cond_2
    mul-int v7, v0, v9

    .line 150
    .line 151
    invoke-static {v0, v12, v3, v7}, La/twn;->b(IIII)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    add-int v7, v9, v3

    .line 156
    .line 157
    add-int/2addr v7, v9

    .line 158
    add-int/2addr v7, v3

    .line 159
    add-int/2addr v7, v10

    .line 160
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    sub-int/2addr v8, v3

    .line 165
    sub-int/2addr v8, v0

    .line 166
    if-ge v8, v7, :cond_3

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_3
    move v7, v8

    .line 170
    :goto_0
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    if-le v7, v0, :cond_4

    .line 175
    .line 176
    move v7, v0

    .line 177
    :cond_4
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 178
    .line 179
    .line 180
    move-result v0

    .line 181
    sub-int/2addr v0, v7

    .line 182
    sub-int/2addr v0, v3

    .line 183
    if-gez v0, :cond_5

    .line 184
    .line 185
    move v0, v6

    .line 186
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    check-cast v8, La/pj30;

    .line 191
    .line 192
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    invoke-static {v7, v7, v6, v9, v4}, La/r4e;->b(IIIII)J

    .line 197
    .line 198
    .line 199
    move-result-wide v9

    .line 200
    invoke-interface {v8, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 201
    .line 202
    .line 203
    move-result-object v8

    .line 204
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, La/pj30;

    .line 209
    .line 210
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 211
    .line 212
    .line 213
    move-result v9

    .line 214
    invoke-static {v0, v0, v6, v9, v4}, La/r4e;->b(IIIII)J

    .line 215
    .line 216
    .line 217
    move-result-wide v9

    .line 218
    invoke-interface {v2, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget v2, v8, La/pu90;->b:I

    .line 223
    .line 224
    iget v4, v0, La/pu90;->b:I

    .line 225
    .line 226
    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    int-to-float v4, v11

    .line 231
    sub-int v6, v2, v11

    .line 232
    .line 233
    int-to-float v6, v6

    .line 234
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v5

    .line 238
    check-cast v5, Ljava/lang/Number;

    .line 239
    .line 240
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 241
    .line 242
    .line 243
    move-result v5

    .line 244
    mul-float/2addr v5, v6

    .line 245
    add-float/2addr v5, v4

    .line 246
    invoke-static {v5}, La/si30;->b(F)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    invoke-static {v4, v11, v2}, La/l1e0;->d(III)I

    .line 251
    .line 252
    .line 253
    move-result v2

    .line 254
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 255
    .line 256
    .line 257
    move-result v4

    .line 258
    new-instance v5, La/d4i;

    .line 259
    .line 260
    invoke-direct {v5, v8, v0, v7, v3}, La/d4i;-><init>(La/pu90;La/pu90;II)V

    .line 261
    .line 262
    .line 263
    invoke-static {v1, v4, v2, v5}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    :goto_1
    return-object v0

    .line 268
    :pswitch_0
    move-object v3, v4

    .line 269
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 270
    .line 271
    .line 272
    move-result v4

    .line 273
    sget-object v7, La/qmk;->a:La/zcl;

    .line 274
    .line 275
    const/high16 v7, 0x42600000    # 56.0f

    .line 276
    .line 277
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    const/high16 v7, 0x41a00000    # 20.0f

    .line 282
    .line 283
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 284
    .line 285
    .line 286
    move-result v7

    .line 287
    const/high16 v8, 0x43ee0000    # 476.0f

    .line 288
    .line 289
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 290
    .line 291
    .line 292
    move-result v8

    .line 293
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 294
    .line 295
    .line 296
    move-result-object v10

    .line 297
    :cond_6
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 298
    .line 299
    .line 300
    move-result v11

    .line 301
    const-string v12, "SEGMENT_CONTROL_ID"

    .line 302
    .line 303
    if-eqz v11, :cond_7

    .line 304
    .line 305
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    move-result-object v11

    .line 309
    move-object v14, v11

    .line 310
    check-cast v14, La/pj30;

    .line 311
    .line 312
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    invoke-static {v14, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 317
    .line 318
    .line 319
    move-result v14

    .line 320
    if-eqz v14, :cond_6

    .line 321
    .line 322
    goto :goto_2

    .line 323
    :cond_7
    const/4 v11, 0x0

    .line 324
    :goto_2
    check-cast v11, La/pj30;

    .line 325
    .line 326
    if-eqz v11, :cond_8

    .line 327
    .line 328
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 329
    .line 330
    .line 331
    move-result v10

    .line 332
    invoke-interface {v11, v10}, La/pj30;->b(I)I

    .line 333
    .line 334
    .line 335
    move-result v10

    .line 336
    goto :goto_3

    .line 337
    :cond_8
    move v10, v6

    .line 338
    :goto_3
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 339
    .line 340
    .line 341
    move-result v11

    .line 342
    iget v0, v0, La/nu7;->b:I

    .line 343
    .line 344
    sub-int/2addr v11, v0

    .line 345
    sub-int/2addr v11, v9

    .line 346
    sub-int/2addr v11, v10

    .line 347
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 348
    .line 349
    .line 350
    move-result-object v14

    .line 351
    :goto_4
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 352
    .line 353
    .line 354
    move-result v15

    .line 355
    const-string v13, "MIDDLE_CONTENT_ID"

    .line 356
    .line 357
    if-eqz v15, :cond_a

    .line 358
    .line 359
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 360
    .line 361
    .line 362
    move-result-object v15

    .line 363
    move-object/from16 v17, v15

    .line 364
    .line 365
    check-cast v17, La/pj30;

    .line 366
    .line 367
    invoke-static/range {v17 .. v17}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v6

    .line 371
    invoke-static {v6, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    if-eqz v6, :cond_9

    .line 376
    .line 377
    goto :goto_5

    .line 378
    :cond_9
    const/4 v6, 0x0

    .line 379
    goto :goto_4

    .line 380
    :cond_a
    const/4 v15, 0x0

    .line 381
    :goto_5
    check-cast v15, La/pj30;

    .line 382
    .line 383
    move-object v14, v3

    .line 384
    if-eqz v15, :cond_b

    .line 385
    .line 386
    const/4 v6, 0x0

    .line 387
    invoke-static {v4, v4, v6, v11}, La/r4e;->a(IIII)J

    .line 388
    .line 389
    .line 390
    move-result-wide v2

    .line 391
    invoke-interface {v15, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 392
    .line 393
    .line 394
    move-result-object v2

    .line 395
    move-object v11, v2

    .line 396
    goto :goto_6

    .line 397
    :cond_b
    const/4 v11, 0x0

    .line 398
    :goto_6
    if-eqz v11, :cond_c

    .line 399
    .line 400
    iget v6, v11, La/pu90;->b:I

    .line 401
    .line 402
    goto :goto_7

    .line 403
    :cond_c
    const/4 v6, 0x0

    .line 404
    :goto_7
    move-object v2, v14

    .line 405
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 406
    .line 407
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 408
    .line 409
    .line 410
    move-result-object v3

    .line 411
    invoke-interface {v2, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    int-to-float v2, v6

    .line 415
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    check-cast v3, Ljava/lang/Number;

    .line 420
    .line 421
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 422
    .line 423
    .line 424
    move-result v3

    .line 425
    const/high16 v5, 0x3f800000    # 1.0f

    .line 426
    .line 427
    sub-float/2addr v5, v3

    .line 428
    mul-float/2addr v5, v2

    .line 429
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 430
    .line 431
    .line 432
    move-result v2

    .line 433
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    sub-int/2addr v3, v0

    .line 438
    sub-int/2addr v3, v9

    .line 439
    sub-int/2addr v3, v10

    .line 440
    sub-int/2addr v3, v2

    .line 441
    const/4 v6, 0x0

    .line 442
    invoke-static {v6, v3}, Ljava/lang/Math;->max(II)I

    .line 443
    .line 444
    .line 445
    move-result v14

    .line 446
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 447
    .line 448
    .line 449
    move-result v2

    .line 450
    sub-int/2addr v2, v14

    .line 451
    add-int/2addr v2, v7

    .line 452
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 453
    .line 454
    .line 455
    move-result v3

    .line 456
    if-le v2, v3, :cond_d

    .line 457
    .line 458
    move v2, v3

    .line 459
    :cond_d
    invoke-static {v8, v2}, Ljava/lang/Math;->max(II)I

    .line 460
    .line 461
    .line 462
    move-result v6

    .line 463
    new-instance v15, Ljava/util/ArrayList;

    .line 464
    .line 465
    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 469
    .line 470
    .line 471
    move-result-object v17

    .line 472
    :goto_8
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    .line 473
    .line 474
    .line 475
    move-result v2

    .line 476
    if-eqz v2, :cond_14

    .line 477
    .line 478
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object v2

    .line 482
    check-cast v2, La/pj30;

    .line 483
    .line 484
    invoke-static {v2}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v3

    .line 488
    const-string v5, "TOOLBAR_ID"

    .line 489
    .line 490
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    move-result v5

    .line 494
    if-eqz v5, :cond_e

    .line 495
    .line 496
    invoke-static {v4, v4, v9, v9}, La/p4e;->a(IIII)J

    .line 497
    .line 498
    .line 499
    move-result-wide v7

    .line 500
    invoke-interface {v2, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 501
    .line 502
    .line 503
    move-result-object v2

    .line 504
    :goto_9
    move/from16 v18, v0

    .line 505
    .line 506
    goto :goto_a

    .line 507
    :cond_e
    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v5

    .line 511
    if-eqz v5, :cond_f

    .line 512
    .line 513
    move/from16 v18, v0

    .line 514
    .line 515
    move-object v2, v11

    .line 516
    goto :goto_a

    .line 517
    :cond_f
    invoke-static {v3, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 518
    .line 519
    .line 520
    move-result v5

    .line 521
    if-eqz v5, :cond_10

    .line 522
    .line 523
    invoke-static {v4, v4, v10, v10}, La/p4e;->a(IIII)J

    .line 524
    .line 525
    .line 526
    move-result-wide v7

    .line 527
    invoke-interface {v2, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 528
    .line 529
    .line 530
    move-result-object v2

    .line 531
    goto :goto_9

    .line 532
    :cond_10
    const-string v5, "BETTING_ID"

    .line 533
    .line 534
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    move-result v5

    .line 538
    if-eqz v5, :cond_11

    .line 539
    .line 540
    invoke-static {v4, v4, v14, v14}, La/p4e;->a(IIII)J

    .line 541
    .line 542
    .line 543
    move-result-wide v7

    .line 544
    invoke-interface {v2, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    goto :goto_9

    .line 549
    :cond_11
    const-string v5, "BACKGROUND_ID"

    .line 550
    .line 551
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 552
    .line 553
    .line 554
    move-result v3

    .line 555
    if-eqz v3, :cond_12

    .line 556
    .line 557
    const/4 v5, 0x0

    .line 558
    const/4 v8, 0x2

    .line 559
    move v7, v6

    .line 560
    move/from16 v18, v0

    .line 561
    .line 562
    move-object v0, v2

    .line 563
    move-wide/from16 v2, p3

    .line 564
    .line 565
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 566
    .line 567
    .line 568
    move-result-wide v7

    .line 569
    invoke-interface {v0, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 570
    .line 571
    .line 572
    move-result-object v2

    .line 573
    goto :goto_a

    .line 574
    :cond_12
    move/from16 v18, v0

    .line 575
    .line 576
    const/4 v2, 0x0

    .line 577
    :goto_a
    if-eqz v2, :cond_13

    .line 578
    .line 579
    invoke-virtual {v15, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 580
    .line 581
    .line 582
    :cond_13
    move/from16 v0, v18

    .line 583
    .line 584
    goto :goto_8

    .line 585
    :cond_14
    move/from16 v18, v0

    .line 586
    .line 587
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 588
    .line 589
    .line 590
    move-result v0

    .line 591
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 592
    .line 593
    .line 594
    move-result v2

    .line 595
    new-instance v14, La/mu7;

    .line 596
    .line 597
    move-object/from16 v19, v15

    .line 598
    .line 599
    const/4 v15, 0x0

    .line 600
    move/from16 v16, v18

    .line 601
    .line 602
    move-wide/from16 v17, p3

    .line 603
    .line 604
    invoke-direct/range {v14 .. v19}, La/mu7;-><init>(BIJLjava/lang/Object;)V

    .line 605
    .line 606
    .line 607
    invoke-static {v1, v0, v2, v14}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 608
    .line 609
    .line 610
    move-result-object v0

    .line 611
    return-object v0

    .line 612
    nop

    .line 613
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
