.class public final La/aam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(FIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/aam;->a:B

    iput p1, p0, La/aam;->b:F

    iput p2, p0, La/aam;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 29

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
    iget-byte v3, v0, La/aam;->a:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget v5, v0, La/aam;->b:F

    .line 11
    .line 12
    const/high16 v6, 0x40800000    # 4.0f

    .line 13
    .line 14
    const/high16 v7, 0x42200000    # 40.0f

    .line 15
    .line 16
    const/high16 v8, 0x41c00000    # 24.0f

    .line 17
    .line 18
    const/high16 v9, 0x41000000    # 8.0f

    .line 19
    .line 20
    const-string v11, "width and height must be >= 0"

    .line 21
    .line 22
    iget v12, v0, La/aam;->c:I

    .line 23
    .line 24
    packed-switch v3, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object v3, La/qmk;->a:La/zcl;

    .line 31
    .line 32
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 37
    .line 38
    .line 39
    move-result v8

    .line 40
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 53
    .line 54
    .line 55
    move-result v9

    .line 56
    if-gez v9, :cond_0

    .line 57
    .line 58
    move v9, v4

    .line 59
    :cond_0
    sub-int v13, v9, v5

    .line 60
    .line 61
    sub-int/2addr v13, v6

    .line 62
    if-gez v13, :cond_1

    .line 63
    .line 64
    move v13, v4

    .line 65
    :cond_1
    add-int v20, v5, v6

    .line 66
    .line 67
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    check-cast v6, La/pj30;

    .line 72
    .line 73
    if-ltz v9, :cond_2

    .line 74
    .line 75
    const/4 v14, 0x1

    .line 76
    goto :goto_0

    .line 77
    :cond_2
    move v14, v4

    .line 78
    :goto_0
    if-ltz v8, :cond_3

    .line 79
    .line 80
    const/4 v15, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_3
    move v15, v4

    .line 83
    :goto_1
    and-int/2addr v14, v15

    .line 84
    if-nez v14, :cond_4

    .line 85
    .line 86
    invoke-static {v11}, La/zcx;->a(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    :cond_4
    invoke-static {v9, v9, v8, v8}, La/r4e;->h(IIII)J

    .line 90
    .line 91
    .line 92
    move-result-wide v14

    .line 93
    invoke-interface {v6, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 94
    .line 95
    .line 96
    move-result-object v14

    .line 97
    new-array v6, v12, [[La/pu90;

    .line 98
    .line 99
    move v9, v4

    .line 100
    :goto_2
    if-ge v9, v12, :cond_b

    .line 101
    .line 102
    mul-int/lit8 v15, v9, 0x2

    .line 103
    .line 104
    add-int/lit8 v4, v15, 0x1

    .line 105
    .line 106
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    check-cast v4, La/pj30;

    .line 111
    .line 112
    if-ltz v5, :cond_5

    .line 113
    .line 114
    const/16 v17, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    const/16 v17, 0x0

    .line 118
    .line 119
    :goto_3
    if-ltz v7, :cond_6

    .line 120
    .line 121
    const/16 v18, 0x1

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_6
    const/16 v18, 0x0

    .line 125
    .line 126
    :goto_4
    and-int v17, v17, v18

    .line 127
    .line 128
    if-nez v17, :cond_7

    .line 129
    .line 130
    invoke-static {v11}, La/zcx;->a(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    move-object/from16 v18, v11

    .line 134
    .line 135
    invoke-static {v5, v5, v7, v7}, La/r4e;->h(IIII)J

    .line 136
    .line 137
    .line 138
    move-result-wide v10

    .line 139
    invoke-interface {v4, v10, v11}, La/pj30;->S(J)La/pu90;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    add-int/lit8 v15, v15, 0x2

    .line 144
    .line 145
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v10

    .line 149
    check-cast v10, La/pj30;

    .line 150
    .line 151
    if-ltz v13, :cond_8

    .line 152
    .line 153
    const/4 v11, 0x1

    .line 154
    goto :goto_5

    .line 155
    :cond_8
    const/4 v11, 0x0

    .line 156
    :goto_5
    if-ltz v7, :cond_9

    .line 157
    .line 158
    const/4 v15, 0x1

    .line 159
    goto :goto_6

    .line 160
    :cond_9
    const/4 v15, 0x0

    .line 161
    :goto_6
    and-int/2addr v11, v15

    .line 162
    if-nez v11, :cond_a

    .line 163
    .line 164
    invoke-static/range {v18 .. v18}, La/zcx;->a(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_a
    move v11, v5

    .line 168
    move-object/from16 v19, v6

    .line 169
    .line 170
    invoke-static {v13, v13, v7, v7}, La/r4e;->h(IIII)J

    .line 171
    .line 172
    .line 173
    move-result-wide v5

    .line 174
    invoke-interface {v10, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 175
    .line 176
    .line 177
    move-result-object v5

    .line 178
    filled-new-array {v4, v5}, [La/pu90;

    .line 179
    .line 180
    .line 181
    move-result-object v4

    .line 182
    aput-object v4, v19, v9

    .line 183
    .line 184
    add-int/lit8 v9, v9, 0x1

    .line 185
    .line 186
    move v5, v11

    .line 187
    move-object/from16 v11, v18

    .line 188
    .line 189
    move-object/from16 v6, v19

    .line 190
    .line 191
    const/4 v4, 0x0

    .line 192
    goto :goto_2

    .line 193
    :cond_b
    move-object/from16 v19, v6

    .line 194
    .line 195
    if-lez v12, :cond_c

    .line 196
    .line 197
    add-int v2, v8, v3

    .line 198
    .line 199
    mul-int v4, v12, v7

    .line 200
    .line 201
    add-int/2addr v4, v2

    .line 202
    const/4 v2, 0x1

    .line 203
    invoke-static {v12, v2, v3, v4}, La/twn;->b(IIII)I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    goto :goto_7

    .line 208
    :cond_c
    move v2, v8

    .line 209
    :goto_7
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    new-instance v13, La/bam;

    .line 214
    .line 215
    iget v15, v0, La/aam;->c:I

    .line 216
    .line 217
    move/from16 v17, v3

    .line 218
    .line 219
    move/from16 v18, v7

    .line 220
    .line 221
    move/from16 v16, v8

    .line 222
    .line 223
    invoke-direct/range {v13 .. v20}, La/bam;-><init>(La/pu90;IIII[[La/pu90;I)V

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v4, v2, v13}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    return-object v0

    .line 231
    :pswitch_0
    move-object/from16 v18, v11

    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    sget-object v3, La/qmk;->a:La/zcl;

    .line 237
    .line 238
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 239
    .line 240
    .line 241
    move-result v3

    .line 242
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 243
    .line 244
    .line 245
    move-result v4

    .line 246
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 255
    .line 256
    .line 257
    move-result v7

    .line 258
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 263
    .line 264
    .line 265
    move-result v5

    .line 266
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 267
    .line 268
    .line 269
    move-result v10

    .line 270
    sub-int/2addr v10, v9

    .line 271
    sub-int/2addr v10, v3

    .line 272
    if-gez v10, :cond_d

    .line 273
    .line 274
    const/4 v10, 0x0

    .line 275
    :cond_d
    sub-int v11, v10, v5

    .line 276
    .line 277
    sub-int/2addr v11, v6

    .line 278
    if-gez v11, :cond_e

    .line 279
    .line 280
    const/4 v11, 0x0

    .line 281
    :cond_e
    add-int v22, v9, v3

    .line 282
    .line 283
    add-int v3, v22, v5

    .line 284
    .line 285
    add-int v28, v3, v6

    .line 286
    .line 287
    const/4 v3, 0x0

    .line 288
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v6

    .line 292
    check-cast v6, La/pj30;

    .line 293
    .line 294
    if-ltz v9, :cond_f

    .line 295
    .line 296
    const/4 v13, 0x1

    .line 297
    goto :goto_8

    .line 298
    :cond_f
    move v13, v3

    .line 299
    :goto_8
    if-ltz v8, :cond_10

    .line 300
    .line 301
    const/4 v14, 0x1

    .line 302
    goto :goto_9

    .line 303
    :cond_10
    move v14, v3

    .line 304
    :goto_9
    and-int/2addr v13, v14

    .line 305
    if-nez v13, :cond_11

    .line 306
    .line 307
    invoke-static/range {v18 .. v18}, La/zcx;->a(Ljava/lang/String;)V

    .line 308
    .line 309
    .line 310
    :cond_11
    invoke-static {v9, v9, v8, v8}, La/r4e;->h(IIII)J

    .line 311
    .line 312
    .line 313
    move-result-wide v13

    .line 314
    invoke-interface {v6, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 315
    .line 316
    .line 317
    move-result-object v20

    .line 318
    const/4 v6, 0x1

    .line 319
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    check-cast v13, La/pj30;

    .line 324
    .line 325
    if-ltz v10, :cond_12

    .line 326
    .line 327
    const/4 v6, 0x1

    .line 328
    goto :goto_a

    .line 329
    :cond_12
    move v6, v3

    .line 330
    :goto_a
    if-ltz v8, :cond_13

    .line 331
    .line 332
    const/4 v14, 0x1

    .line 333
    goto :goto_b

    .line 334
    :cond_13
    move v14, v3

    .line 335
    :goto_b
    and-int/2addr v6, v14

    .line 336
    if-nez v6, :cond_14

    .line 337
    .line 338
    invoke-static/range {v18 .. v18}, La/zcx;->a(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    :cond_14
    invoke-static {v10, v10, v8, v8}, La/r4e;->h(IIII)J

    .line 342
    .line 343
    .line 344
    move-result-wide v14

    .line 345
    invoke-interface {v13, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 346
    .line 347
    .line 348
    move-result-object v21

    .line 349
    new-array v6, v12, [[La/pu90;

    .line 350
    .line 351
    :goto_c
    if-ge v3, v12, :cond_15

    .line 352
    .line 353
    mul-int/lit8 v10, v3, 0x3

    .line 354
    .line 355
    add-int/lit8 v13, v10, 0x2

    .line 356
    .line 357
    invoke-interface {v2, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 358
    .line 359
    .line 360
    move-result-object v13

    .line 361
    check-cast v13, La/pj30;

    .line 362
    .line 363
    invoke-static {v9, v7}, La/lgb;->P(II)J

    .line 364
    .line 365
    .line 366
    move-result-wide v14

    .line 367
    invoke-interface {v13, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 368
    .line 369
    .line 370
    move-result-object v13

    .line 371
    add-int/lit8 v14, v10, 0x3

    .line 372
    .line 373
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v14

    .line 377
    check-cast v14, La/pj30;

    .line 378
    .line 379
    move/from16 v24, v8

    .line 380
    .line 381
    move v15, v9

    .line 382
    invoke-static {v5, v7}, La/lgb;->P(II)J

    .line 383
    .line 384
    .line 385
    move-result-wide v8

    .line 386
    invoke-interface {v14, v8, v9}, La/pj30;->S(J)La/pu90;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    add-int/lit8 v10, v10, 0x4

    .line 391
    .line 392
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v9

    .line 396
    check-cast v9, La/pj30;

    .line 397
    .line 398
    move v10, v3

    .line 399
    invoke-static {v11, v7}, La/lgb;->P(II)J

    .line 400
    .line 401
    .line 402
    move-result-wide v2

    .line 403
    invoke-interface {v9, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 404
    .line 405
    .line 406
    move-result-object v2

    .line 407
    filled-new-array {v13, v8, v2}, [La/pu90;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    aput-object v2, v6, v10

    .line 412
    .line 413
    add-int/lit8 v3, v10, 0x1

    .line 414
    .line 415
    move-object/from16 v2, p2

    .line 416
    .line 417
    move v9, v15

    .line 418
    move/from16 v8, v24

    .line 419
    .line 420
    goto :goto_c

    .line 421
    :cond_15
    move/from16 v24, v8

    .line 422
    .line 423
    if-lez v12, :cond_16

    .line 424
    .line 425
    add-int v8, v24, v4

    .line 426
    .line 427
    mul-int v2, v12, v7

    .line 428
    .line 429
    add-int/2addr v2, v8

    .line 430
    const/4 v3, 0x1

    .line 431
    invoke-static {v12, v3, v4, v2}, La/twn;->b(IIII)I

    .line 432
    .line 433
    .line 434
    move-result v2

    .line 435
    goto :goto_d

    .line 436
    :cond_16
    move/from16 v2, v24

    .line 437
    .line 438
    :goto_d
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 439
    .line 440
    .line 441
    move-result v3

    .line 442
    new-instance v19, La/jp2;

    .line 443
    .line 444
    iget v0, v0, La/aam;->c:I

    .line 445
    .line 446
    move/from16 v23, v0

    .line 447
    .line 448
    move/from16 v25, v4

    .line 449
    .line 450
    move-object/from16 v27, v6

    .line 451
    .line 452
    move/from16 v26, v7

    .line 453
    .line 454
    invoke-direct/range {v19 .. v28}, La/jp2;-><init>(La/pu90;La/pu90;IIIII[[La/pu90;I)V

    .line 455
    .line 456
    .line 457
    move-object/from16 v0, v19

    .line 458
    .line 459
    invoke-static {v1, v3, v2, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 460
    .line 461
    .line 462
    move-result-object v0

    .line 463
    return-object v0

    .line 464
    nop

    .line 465
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
