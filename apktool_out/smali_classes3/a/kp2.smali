.class public final La/kp2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Z


# direct methods
.method public synthetic constructor <init>(BZ)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/kp2;->a:B

    iput-boolean p2, p0, La/kp2;->b:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final f(La/pu90;ZLa/ou90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->g(La/pu90;IIF)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final g(La/pu90;ZLa/ou90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->g(La/pu90;IIF)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public static final h(La/pu90;ZLa/ou90;II)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->m(La/pu90;IIF)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p2, p0, p3, p4, v0}, La/ou90;->g(La/pu90;IIF)V

    .line 9
    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 52

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
    move-wide/from16 v3, p3

    .line 8
    .line 9
    iget-byte v5, v0, La/kp2;->a:B

    .line 10
    .line 11
    const/4 v10, 0x4

    .line 12
    const/high16 v6, 0x41800000    # 16.0f

    .line 13
    .line 14
    const/high16 v9, 0x40000000    # 2.0f

    .line 15
    .line 16
    const/4 v11, 0x3

    .line 17
    const/high16 v7, 0x41000000    # 8.0f

    .line 18
    .line 19
    const-string v12, "SCORE"

    .line 20
    .line 21
    const-string v13, "INFO"

    .line 22
    .line 23
    const/4 v15, 0x2

    .line 24
    iget-boolean v8, v0, La/kp2;->b:Z

    .line 25
    .line 26
    const v16, 0x3f19999a    # 0.6f

    .line 27
    .line 28
    .line 29
    const/4 v14, 0x1

    .line 30
    const/16 v17, 0x0

    .line 31
    .line 32
    move/from16 v18, v5

    .line 33
    .line 34
    const/4 v5, 0x0

    .line 35
    packed-switch v18, :pswitch_data_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    sget-object v8, La/qmk;->a:La/zcl;

    .line 42
    .line 43
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 44
    .line 45
    .line 46
    move-result v12

    .line 47
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 52
    .line 53
    .line 54
    move-result v13

    .line 55
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    div-int/2addr v6, v15

    .line 60
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    check-cast v8, La/pj30;

    .line 65
    .line 66
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 67
    .line 68
    .line 69
    move-result-object v14

    .line 70
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    check-cast v8, La/pj30;

    .line 75
    .line 76
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 77
    .line 78
    .line 79
    move-result-object v23

    .line 80
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    check-cast v8, La/pj30;

    .line 85
    .line 86
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-interface {v2, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v8

    .line 94
    check-cast v8, La/pj30;

    .line 95
    .line 96
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 97
    .line 98
    .line 99
    move-result-object v25

    .line 100
    const/4 v8, 0x5

    .line 101
    invoke-interface {v2, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v8

    .line 105
    check-cast v8, La/pj30;

    .line 106
    .line 107
    invoke-interface {v8, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 108
    .line 109
    .line 110
    move-result-object v27

    .line 111
    iget v8, v11, La/pu90;->a:I

    .line 112
    .line 113
    div-int/lit8 v10, v8, 0x2

    .line 114
    .line 115
    sub-int v18, v6, v10

    .line 116
    .line 117
    iget v8, v14, La/pu90;->a:I

    .line 118
    .line 119
    sub-int v8, v18, v8

    .line 120
    .line 121
    sub-int v21, v8, v7

    .line 122
    .line 123
    add-int v8, v6, v10

    .line 124
    .line 125
    add-int v26, v8, v7

    .line 126
    .line 127
    sub-int v16, v21, v7

    .line 128
    .line 129
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v7

    .line 133
    check-cast v7, La/pj30;

    .line 134
    .line 135
    move v8, v6

    .line 136
    if-gez v16, :cond_0

    .line 137
    .line 138
    move v6, v5

    .line 139
    goto :goto_0

    .line 140
    :cond_0
    move/from16 v6, v16

    .line 141
    .line 142
    :goto_0
    const/4 v9, 0x0

    .line 143
    move/from16 v17, v8

    .line 144
    .line 145
    move v8, v9

    .line 146
    const/16 v9, 0xc

    .line 147
    .line 148
    move/from16 v19, v5

    .line 149
    .line 150
    const/4 v5, 0x0

    .line 151
    move-object/from16 v20, v7

    .line 152
    .line 153
    const/4 v7, 0x0

    .line 154
    move/from16 v19, v15

    .line 155
    .line 156
    move/from16 v15, v17

    .line 157
    .line 158
    move-object/from16 v1, v20

    .line 159
    .line 160
    move/from16 v17, v12

    .line 161
    .line 162
    move-object/from16 v12, v23

    .line 163
    .line 164
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 165
    .line 166
    .line 167
    move-result-wide v5

    .line 168
    invoke-interface {v1, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 169
    .line 170
    .line 171
    move-result-object v1

    .line 172
    const/4 v3, 0x6

    .line 173
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    move-object v9, v2

    .line 178
    check-cast v9, La/pj30;

    .line 179
    .line 180
    if-gez v16, :cond_1

    .line 181
    .line 182
    const/4 v5, 0x0

    .line 183
    goto :goto_1

    .line 184
    :cond_1
    move/from16 v5, v16

    .line 185
    .line 186
    :goto_1
    const/4 v7, 0x0

    .line 187
    const/16 v8, 0xc

    .line 188
    .line 189
    const/4 v4, 0x0

    .line 190
    const/4 v6, 0x0

    .line 191
    move-wide/from16 v2, p3

    .line 192
    .line 193
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 194
    .line 195
    .line 196
    move-result-wide v4

    .line 197
    invoke-interface {v9, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    iget v3, v14, La/pu90;->b:I

    .line 202
    .line 203
    iget v4, v12, La/pu90;->b:I

    .line 204
    .line 205
    add-int/2addr v3, v4

    .line 206
    add-int v3, v3, v17

    .line 207
    .line 208
    iget v4, v11, La/pu90;->b:I

    .line 209
    .line 210
    iget v5, v1, La/pu90;->b:I

    .line 211
    .line 212
    iget v6, v2, La/pu90;->b:I

    .line 213
    .line 214
    filled-new-array {v5, v6, v3}, [I

    .line 215
    .line 216
    .line 217
    move-result-object v3

    .line 218
    invoke-static {v3, v4}, La/idd;->c([II)I

    .line 219
    .line 220
    .line 221
    move-result v3

    .line 222
    iget v4, v11, La/pu90;->b:I

    .line 223
    .line 224
    sub-int v4, v3, v4

    .line 225
    .line 226
    div-int/lit8 v4, v4, 0x2

    .line 227
    .line 228
    iget v5, v14, La/pu90;->b:I

    .line 229
    .line 230
    mul-int/lit8 v6, v5, 0x2

    .line 231
    .line 232
    add-int v6, v6, v17

    .line 233
    .line 234
    sub-int v22, v3, v6

    .line 235
    .line 236
    add-int v24, v5, v17

    .line 237
    .line 238
    iget v5, v1, La/pu90;->b:I

    .line 239
    .line 240
    sub-int v5, v3, v5

    .line 241
    .line 242
    div-int/lit8 v30, v5, 0x2

    .line 243
    .line 244
    iget v5, v2, La/pu90;->b:I

    .line 245
    .line 246
    sub-int v5, v3, v5

    .line 247
    .line 248
    div-int/lit8 v33, v5, 0x2

    .line 249
    .line 250
    sub-int v6, v15, v13

    .line 251
    .line 252
    sub-int/2addr v6, v10

    .line 253
    iget v5, v1, La/pu90;->a:I

    .line 254
    .line 255
    sub-int/2addr v6, v5

    .line 256
    iget v5, v14, La/pu90;->a:I

    .line 257
    .line 258
    sub-int v29, v6, v5

    .line 259
    .line 260
    invoke-static {v15, v13, v10, v5}, La/hne;->D(IIII)I

    .line 261
    .line 262
    .line 263
    move-result v32

    .line 264
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 265
    .line 266
    .line 267
    move-result v5

    .line 268
    new-instance v16, La/m180;

    .line 269
    .line 270
    iget-boolean v0, v0, La/kp2;->b:Z

    .line 271
    .line 272
    move/from16 v34, v0

    .line 273
    .line 274
    move-object/from16 v28, v1

    .line 275
    .line 276
    move-object/from16 v31, v2

    .line 277
    .line 278
    move/from16 v19, v4

    .line 279
    .line 280
    move-object/from16 v17, v11

    .line 281
    .line 282
    move-object/from16 v23, v12

    .line 283
    .line 284
    move-object/from16 v20, v14

    .line 285
    .line 286
    invoke-direct/range {v16 .. v34}, La/m180;-><init>(La/pu90;IILa/pu90;IILa/pu90;ILa/pu90;ILa/pu90;La/pu90;IILa/pu90;IIZ)V

    .line 287
    .line 288
    .line 289
    move-object/from16 v1, p1

    .line 290
    .line 291
    move-object/from16 v0, v16

    .line 292
    .line 293
    invoke-static {v1, v5, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    return-object v0

    .line 298
    :pswitch_0
    move/from16 v19, v15

    .line 299
    .line 300
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    sget-object v5, La/qmk;->a:La/zcl;

    .line 304
    .line 305
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 306
    .line 307
    .line 308
    move-result v5

    .line 309
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 310
    .line 311
    .line 312
    move-result v12

    .line 313
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    div-int/lit8 v13, v6, 0x2

    .line 318
    .line 319
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    check-cast v6, La/pj30;

    .line 324
    .line 325
    invoke-interface {v6, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 326
    .line 327
    .line 328
    move-result-object v14

    .line 329
    move/from16 v6, v19

    .line 330
    .line 331
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v7

    .line 335
    check-cast v7, La/pj30;

    .line 336
    .line 337
    invoke-interface {v7, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 338
    .line 339
    .line 340
    move-result-object v15

    .line 341
    invoke-interface {v2, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object v7

    .line 345
    check-cast v7, La/pj30;

    .line 346
    .line 347
    invoke-interface {v7, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 348
    .line 349
    .line 350
    move-result-object v11

    .line 351
    iget v7, v15, La/pu90;->a:I

    .line 352
    .line 353
    div-int/lit8 v16, v7, 0x2

    .line 354
    .line 355
    sub-int v38, v13, v16

    .line 356
    .line 357
    iget v6, v14, La/pu90;->a:I

    .line 358
    .line 359
    sub-int v6, v38, v6

    .line 360
    .line 361
    sub-int v41, v6, v5

    .line 362
    .line 363
    add-int v6, v13, v16

    .line 364
    .line 365
    add-int v44, v6, v5

    .line 366
    .line 367
    sub-int v17, v41, v5

    .line 368
    .line 369
    const/4 v5, 0x0

    .line 370
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v6

    .line 374
    check-cast v6, La/pj30;

    .line 375
    .line 376
    move-object v7, v6

    .line 377
    if-gez v17, :cond_2

    .line 378
    .line 379
    move v6, v5

    .line 380
    goto :goto_2

    .line 381
    :cond_2
    move/from16 v6, v17

    .line 382
    .line 383
    :goto_2
    const/4 v8, 0x0

    .line 384
    const/16 v9, 0xc

    .line 385
    .line 386
    move/from16 v35, v5

    .line 387
    .line 388
    const/4 v5, 0x0

    .line 389
    move-object/from16 v18, v7

    .line 390
    .line 391
    const/4 v7, 0x0

    .line 392
    move-object/from16 v10, v18

    .line 393
    .line 394
    move/from16 v18, v12

    .line 395
    .line 396
    move/from16 v12, v35

    .line 397
    .line 398
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 399
    .line 400
    .line 401
    move-result-wide v5

    .line 402
    invoke-interface {v10, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 403
    .line 404
    .line 405
    move-result-object v9

    .line 406
    const/4 v3, 0x4

    .line 407
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    move-result-object v2

    .line 411
    move-object v10, v2

    .line 412
    check-cast v10, La/pj30;

    .line 413
    .line 414
    if-gez v17, :cond_3

    .line 415
    .line 416
    move v5, v12

    .line 417
    goto :goto_3

    .line 418
    :cond_3
    move/from16 v5, v17

    .line 419
    .line 420
    :goto_3
    const/4 v7, 0x0

    .line 421
    const/16 v8, 0xc

    .line 422
    .line 423
    const/4 v4, 0x0

    .line 424
    const/4 v6, 0x0

    .line 425
    move-wide/from16 v2, p3

    .line 426
    .line 427
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 428
    .line 429
    .line 430
    move-result-wide v4

    .line 431
    invoke-interface {v10, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 432
    .line 433
    .line 434
    move-result-object v2

    .line 435
    sub-int v3, v13, v18

    .line 436
    .line 437
    sub-int v3, v3, v16

    .line 438
    .line 439
    iget v4, v9, La/pu90;->a:I

    .line 440
    .line 441
    sub-int/2addr v3, v4

    .line 442
    iget v4, v14, La/pu90;->a:I

    .line 443
    .line 444
    sub-int v46, v3, v4

    .line 445
    .line 446
    add-int v13, v13, v18

    .line 447
    .line 448
    add-int v13, v13, v16

    .line 449
    .line 450
    iget v3, v11, La/pu90;->a:I

    .line 451
    .line 452
    add-int v49, v13, v3

    .line 453
    .line 454
    iget v3, v15, La/pu90;->b:I

    .line 455
    .line 456
    iget v4, v9, La/pu90;->b:I

    .line 457
    .line 458
    iget v5, v2, La/pu90;->b:I

    .line 459
    .line 460
    iget v6, v14, La/pu90;->b:I

    .line 461
    .line 462
    filled-new-array {v4, v5, v6}, [I

    .line 463
    .line 464
    .line 465
    move-result-object v4

    .line 466
    invoke-static {v4, v3}, La/idd;->c([II)I

    .line 467
    .line 468
    .line 469
    move-result v3

    .line 470
    iget v4, v15, La/pu90;->b:I

    .line 471
    .line 472
    sub-int v4, v3, v4

    .line 473
    .line 474
    const/16 v19, 0x2

    .line 475
    .line 476
    div-int/lit8 v39, v4, 0x2

    .line 477
    .line 478
    iget v4, v11, La/pu90;->b:I

    .line 479
    .line 480
    sub-int v4, v3, v4

    .line 481
    .line 482
    div-int/lit8 v42, v4, 0x2

    .line 483
    .line 484
    iget v4, v9, La/pu90;->b:I

    .line 485
    .line 486
    sub-int v4, v3, v4

    .line 487
    .line 488
    div-int/lit8 v47, v4, 0x2

    .line 489
    .line 490
    iget v4, v2, La/pu90;->b:I

    .line 491
    .line 492
    sub-int v4, v3, v4

    .line 493
    .line 494
    div-int/lit8 v50, v4, 0x2

    .line 495
    .line 496
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 497
    .line 498
    .line 499
    move-result v4

    .line 500
    new-instance v36, La/hws0;

    .line 501
    .line 502
    iget-boolean v0, v0, La/kp2;->b:Z

    .line 503
    .line 504
    move/from16 v51, v0

    .line 505
    .line 506
    move-object/from16 v48, v2

    .line 507
    .line 508
    move-object/from16 v45, v9

    .line 509
    .line 510
    move-object/from16 v43, v11

    .line 511
    .line 512
    move-object/from16 v40, v14

    .line 513
    .line 514
    move-object/from16 v37, v15

    .line 515
    .line 516
    invoke-direct/range {v36 .. v51}, La/hws0;-><init>(La/pu90;IILa/pu90;IILa/pu90;ILa/pu90;IILa/pu90;IIZ)V

    .line 517
    .line 518
    .line 519
    move-object/from16 v0, v36

    .line 520
    .line 521
    invoke-static {v1, v4, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 522
    .line 523
    .line 524
    move-result-object v0

    .line 525
    return-object v0

    .line 526
    :pswitch_1
    move v12, v5

    .line 527
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 531
    .line 532
    .line 533
    move-result v0

    .line 534
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v4

    .line 542
    if-eqz v4, :cond_5

    .line 543
    .line 544
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v4

    .line 548
    move-object v5, v4

    .line 549
    check-cast v5, La/pj30;

    .line 550
    .line 551
    invoke-static {v5}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v5

    .line 555
    const-string v6, "accordion"

    .line 556
    .line 557
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 558
    .line 559
    .line 560
    move-result v5

    .line 561
    if-eqz v5, :cond_4

    .line 562
    .line 563
    goto :goto_4

    .line 564
    :cond_5
    move-object/from16 v4, v17

    .line 565
    .line 566
    :goto_4
    move-object v10, v4

    .line 567
    check-cast v10, La/pj30;

    .line 568
    .line 569
    if-eqz v10, :cond_6

    .line 570
    .line 571
    move v3, v8

    .line 572
    const/4 v8, 0x0

    .line 573
    const/16 v9, 0xe

    .line 574
    .line 575
    const/4 v5, 0x0

    .line 576
    const/4 v6, 0x0

    .line 577
    const/4 v7, 0x0

    .line 578
    move v15, v3

    .line 579
    move-wide/from16 v3, p3

    .line 580
    .line 581
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 582
    .line 583
    .line 584
    move-result-wide v5

    .line 585
    invoke-interface {v10, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 586
    .line 587
    .line 588
    move-result-object v3

    .line 589
    move-object v10, v3

    .line 590
    goto :goto_5

    .line 591
    :cond_6
    move v15, v8

    .line 592
    move-object/from16 v10, v17

    .line 593
    .line 594
    :goto_5
    if-eqz v10, :cond_7

    .line 595
    .line 596
    iget v5, v10, La/pu90;->a:I

    .line 597
    .line 598
    move v11, v5

    .line 599
    goto :goto_6

    .line 600
    :cond_7
    move v11, v12

    .line 601
    :goto_6
    sget-object v3, La/qmk;->a:La/zcl;

    .line 602
    .line 603
    const/high16 v3, 0x40800000    # 4.0f

    .line 604
    .line 605
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 606
    .line 607
    .line 608
    move-result v13

    .line 609
    sub-int v3, v0, v11

    .line 610
    .line 611
    sub-int v5, v3, v13

    .line 612
    .line 613
    if-gez v5, :cond_8

    .line 614
    .line 615
    move v5, v12

    .line 616
    :cond_8
    if-eqz v15, :cond_14

    .line 617
    .line 618
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 619
    .line 620
    .line 621
    move-result-object v3

    .line 622
    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 623
    .line 624
    .line 625
    move-result v4

    .line 626
    if-eqz v4, :cond_a

    .line 627
    .line 628
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v4

    .line 632
    move-object v6, v4

    .line 633
    check-cast v6, La/pj30;

    .line 634
    .line 635
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v6

    .line 639
    const-string v7, "difference"

    .line 640
    .line 641
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    if-eqz v6, :cond_9

    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_a
    move-object/from16 v4, v17

    .line 649
    .line 650
    :goto_7
    move-object v14, v4

    .line 651
    check-cast v14, La/pj30;

    .line 652
    .line 653
    if-eqz v14, :cond_b

    .line 654
    .line 655
    const/4 v8, 0x0

    .line 656
    const/16 v9, 0xc

    .line 657
    .line 658
    move v6, v5

    .line 659
    const/4 v5, 0x0

    .line 660
    const/4 v7, 0x0

    .line 661
    move-wide/from16 v3, p3

    .line 662
    .line 663
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 664
    .line 665
    .line 666
    move-result-wide v7

    .line 667
    invoke-interface {v14, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 668
    .line 669
    .line 670
    move-result-object v3

    .line 671
    move-object v9, v3

    .line 672
    goto :goto_8

    .line 673
    :cond_b
    move v6, v5

    .line 674
    move-object/from16 v9, v17

    .line 675
    .line 676
    :goto_8
    if-eqz v9, :cond_c

    .line 677
    .line 678
    iget v5, v9, La/pu90;->a:I

    .line 679
    .line 680
    goto :goto_9

    .line 681
    :cond_c
    move v5, v12

    .line 682
    :goto_9
    sub-int v5, v6, v5

    .line 683
    .line 684
    sub-int/2addr v5, v13

    .line 685
    if-gez v5, :cond_d

    .line 686
    .line 687
    move v5, v12

    .line 688
    :cond_d
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    :cond_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result v3

    .line 696
    if-eqz v3, :cond_f

    .line 697
    .line 698
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object v3

    .line 702
    move-object v4, v3

    .line 703
    check-cast v4, La/pj30;

    .line 704
    .line 705
    invoke-static {v4}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v4

    .line 709
    const-string v6, "headerLabel"

    .line 710
    .line 711
    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 712
    .line 713
    .line 714
    move-result v4

    .line 715
    if-eqz v4, :cond_e

    .line 716
    .line 717
    goto :goto_a

    .line 718
    :cond_f
    move-object/from16 v3, v17

    .line 719
    .line 720
    :goto_a
    move-object v14, v3

    .line 721
    check-cast v14, La/pj30;

    .line 722
    .line 723
    if-eqz v14, :cond_10

    .line 724
    .line 725
    const/4 v7, 0x0

    .line 726
    const/16 v8, 0xc

    .line 727
    .line 728
    const/4 v4, 0x0

    .line 729
    const/4 v6, 0x0

    .line 730
    move-wide/from16 v2, p3

    .line 731
    .line 732
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 733
    .line 734
    .line 735
    move-result-wide v2

    .line 736
    invoke-interface {v14, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 737
    .line 738
    .line 739
    move-result-object v17

    .line 740
    :cond_10
    move-object/from16 v3, v17

    .line 741
    .line 742
    if-eqz v3, :cond_11

    .line 743
    .line 744
    iget v5, v3, La/pu90;->b:I

    .line 745
    .line 746
    goto :goto_b

    .line 747
    :cond_11
    move v5, v12

    .line 748
    :goto_b
    if-eqz v9, :cond_12

    .line 749
    .line 750
    iget v2, v9, La/pu90;->b:I

    .line 751
    .line 752
    goto :goto_c

    .line 753
    :cond_12
    move v2, v12

    .line 754
    :goto_c
    if-eqz v10, :cond_13

    .line 755
    .line 756
    iget v4, v10, La/pu90;->b:I

    .line 757
    .line 758
    move v12, v4

    .line 759
    :cond_13
    invoke-static {v2, v12}, Ljava/lang/Math;->max(II)I

    .line 760
    .line 761
    .line 762
    move-result v2

    .line 763
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 764
    .line 765
    .line 766
    move-result v2

    .line 767
    move-object v5, v9

    .line 768
    move v9, v2

    .line 769
    new-instance v2, La/wv20;

    .line 770
    .line 771
    move v7, v0

    .line 772
    move-object v6, v10

    .line 773
    move v8, v11

    .line 774
    move v4, v13

    .line 775
    invoke-direct/range {v2 .. v9}, La/wv20;-><init>(La/pu90;ILa/pu90;La/pu90;III)V

    .line 776
    .line 777
    .line 778
    invoke-static {v1, v0, v9, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 779
    .line 780
    .line 781
    move-result-object v0

    .line 782
    goto :goto_e

    .line 783
    :cond_14
    move v6, v5

    .line 784
    move-object v9, v10

    .line 785
    move v10, v11

    .line 786
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v2

    .line 790
    move-object v11, v2

    .line 791
    check-cast v11, La/pj30;

    .line 792
    .line 793
    const/4 v7, 0x0

    .line 794
    const/16 v8, 0xc

    .line 795
    .line 796
    const/4 v4, 0x0

    .line 797
    const/4 v6, 0x0

    .line 798
    move-wide/from16 v2, p3

    .line 799
    .line 800
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 801
    .line 802
    .line 803
    move-result-wide v2

    .line 804
    invoke-interface {v11, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 805
    .line 806
    .line 807
    move-result-object v3

    .line 808
    iget v2, v3, La/pu90;->b:I

    .line 809
    .line 810
    if-eqz v9, :cond_15

    .line 811
    .line 812
    iget v5, v9, La/pu90;->b:I

    .line 813
    .line 814
    goto :goto_d

    .line 815
    :cond_15
    move v5, v12

    .line 816
    :goto_d
    invoke-static {v2, v5}, Ljava/lang/Math;->max(II)I

    .line 817
    .line 818
    .line 819
    move-result v7

    .line 820
    new-instance v2, La/lw7;

    .line 821
    .line 822
    const/16 v8, 0x8

    .line 823
    .line 824
    move v5, v0

    .line 825
    move-object v4, v9

    .line 826
    move v6, v10

    .line 827
    invoke-direct/range {v2 .. v8}, La/lw7;-><init>(Ljava/lang/Object;Ljava/lang/Object;IIIB)V

    .line 828
    .line 829
    .line 830
    invoke-static {v1, v0, v7, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 831
    .line 832
    .line 833
    move-result-object v0

    .line 834
    :goto_e
    return-object v0

    .line 835
    :pswitch_2
    move v12, v5

    .line 836
    move v15, v8

    .line 837
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    new-instance v0, Ljava/util/ArrayList;

    .line 841
    .line 842
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 843
    .line 844
    .line 845
    move-result v3

    .line 846
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 847
    .line 848
    .line 849
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 850
    .line 851
    .line 852
    move-result v10

    .line 853
    move v13, v12

    .line 854
    :goto_f
    if-ge v12, v10, :cond_19

    .line 855
    .line 856
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v3

    .line 860
    move-object v14, v3

    .line 861
    check-cast v14, La/pj30;

    .line 862
    .line 863
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 864
    .line 865
    .line 866
    move-result-object v3

    .line 867
    const-string v4, "SPORT_GAME_BOARD_INFO"

    .line 868
    .line 869
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 870
    .line 871
    .line 872
    move-result v4

    .line 873
    if-eqz v4, :cond_16

    .line 874
    .line 875
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 876
    .line 877
    .line 878
    move-result v3

    .line 879
    sub-int v5, v3, v13

    .line 880
    .line 881
    const/4 v8, 0x0

    .line 882
    const/16 v9, 0xc

    .line 883
    .line 884
    const/4 v7, 0x0

    .line 885
    move v6, v5

    .line 886
    move-wide/from16 v3, p3

    .line 887
    .line 888
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 889
    .line 890
    .line 891
    move-result-wide v5

    .line 892
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 893
    .line 894
    .line 895
    move-result-object v3

    .line 896
    goto :goto_10

    .line 897
    :cond_16
    const-string v4, "SPORT_GAME_BOARD_SCORE"

    .line 898
    .line 899
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 900
    .line 901
    .line 902
    move-result v3

    .line 903
    if-eqz v3, :cond_17

    .line 904
    .line 905
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 906
    .line 907
    .line 908
    move-result v3

    .line 909
    int-to-float v3, v3

    .line 910
    mul-float v3, v3, v16

    .line 911
    .line 912
    float-to-int v6, v3

    .line 913
    const/4 v8, 0x0

    .line 914
    const/16 v9, 0xc

    .line 915
    .line 916
    const/4 v5, 0x0

    .line 917
    const/4 v7, 0x0

    .line 918
    move-wide/from16 v3, p3

    .line 919
    .line 920
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 921
    .line 922
    .line 923
    move-result-wide v5

    .line 924
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 925
    .line 926
    .line 927
    move-result-object v3

    .line 928
    iget v4, v3, La/pu90;->a:I

    .line 929
    .line 930
    move v13, v4

    .line 931
    goto :goto_10

    .line 932
    :cond_17
    move-object/from16 v3, v17

    .line 933
    .line 934
    :goto_10
    if-eqz v3, :cond_18

    .line 935
    .line 936
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 937
    .line 938
    .line 939
    :cond_18
    add-int/lit8 v12, v12, 0x1

    .line 940
    .line 941
    goto :goto_f

    .line 942
    :cond_19
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 943
    .line 944
    .line 945
    move-result v2

    .line 946
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 947
    .line 948
    .line 949
    move-result-object v3

    .line 950
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 951
    .line 952
    .line 953
    move-result v4

    .line 954
    if-eqz v4, :cond_1c

    .line 955
    .line 956
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v4

    .line 960
    check-cast v4, La/pu90;

    .line 961
    .line 962
    iget v4, v4, La/pu90;->b:I

    .line 963
    .line 964
    :cond_1a
    :goto_11
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 965
    .line 966
    .line 967
    move-result v5

    .line 968
    if-eqz v5, :cond_1b

    .line 969
    .line 970
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v5

    .line 974
    check-cast v5, La/pu90;

    .line 975
    .line 976
    iget v5, v5, La/pu90;->b:I

    .line 977
    .line 978
    if-ge v4, v5, :cond_1a

    .line 979
    .line 980
    move v4, v5

    .line 981
    goto :goto_11

    .line 982
    :cond_1b
    new-instance v3, La/hka;

    .line 983
    .line 984
    invoke-direct {v3, v15, v0, v2, v11}, La/hka;-><init>(ZLjava/util/ArrayList;IB)V

    .line 985
    .line 986
    .line 987
    invoke-static {v1, v2, v4, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 988
    .line 989
    .line 990
    move-result-object v17

    .line 991
    goto :goto_12

    .line 992
    :cond_1c
    invoke-static {}, La/itt0;->a()V

    .line 993
    .line 994
    .line 995
    :goto_12
    return-object v17

    .line 996
    :pswitch_3
    move v12, v5

    .line 997
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    sget-object v3, La/qmk;->a:La/zcl;

    .line 1001
    .line 1002
    const/high16 v3, 0x42b00000    # 88.0f

    .line 1003
    .line 1004
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 1005
    .line 1006
    .line 1007
    move-result v3

    .line 1008
    new-instance v6, Ljava/util/ArrayList;

    .line 1009
    .line 1010
    const/16 v4, 0xa

    .line 1011
    .line 1012
    invoke-static {v2, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1013
    .line 1014
    .line 1015
    move-result v5

    .line 1016
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 1017
    .line 1018
    .line 1019
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1024
    .line 1025
    .line 1026
    move-result v5

    .line 1027
    if-eqz v5, :cond_1d

    .line 1028
    .line 1029
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v5

    .line 1033
    check-cast v5, La/pj30;

    .line 1034
    .line 1035
    sget-object v7, La/qmk;->a:La/zcl;

    .line 1036
    .line 1037
    const/high16 v7, 0x42f80000    # 124.0f

    .line 1038
    .line 1039
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    const/high16 v8, 0x42180000    # 38.0f

    .line 1044
    .line 1045
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 1046
    .line 1047
    .line 1048
    move-result v8

    .line 1049
    invoke-static {v7, v12, v8, v12, v4}, La/r4e;->b(IIIII)J

    .line 1050
    .line 1051
    .line 1052
    move-result-wide v7

    .line 1053
    invoke-interface {v5, v7, v8}, La/pj30;->S(J)La/pu90;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v5

    .line 1057
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1058
    .line 1059
    .line 1060
    goto :goto_13

    .line 1061
    :cond_1d
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1062
    .line 1063
    .line 1064
    move-result v8

    .line 1065
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 1066
    .line 1067
    .line 1068
    move-result v9

    .line 1069
    new-instance v2, La/h960;

    .line 1070
    .line 1071
    iget-boolean v7, v0, La/kp2;->b:Z

    .line 1072
    .line 1073
    move-wide/from16 v4, p3

    .line 1074
    .line 1075
    invoke-direct/range {v2 .. v7}, La/h960;-><init>(IJLjava/util/ArrayList;Z)V

    .line 1076
    .line 1077
    .line 1078
    invoke-static {v1, v8, v9, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    return-object v0

    .line 1083
    :pswitch_4
    move v12, v5

    .line 1084
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1088
    .line 1089
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 1090
    .line 1091
    .line 1092
    move-result v10

    .line 1093
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1094
    .line 1095
    .line 1096
    move-result v5

    .line 1097
    const/16 v19, 0x2

    .line 1098
    .line 1099
    div-int/lit8 v11, v5, 0x2

    .line 1100
    .line 1101
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    move-result-object v5

    .line 1105
    check-cast v5, La/pj30;

    .line 1106
    .line 1107
    invoke-interface {v5, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v13

    .line 1111
    iget v5, v13, La/pu90;->a:I

    .line 1112
    .line 1113
    div-int/lit8 v14, v5, 0x2

    .line 1114
    .line 1115
    sub-int v25, v11, v14

    .line 1116
    .line 1117
    sub-int v15, v25, v10

    .line 1118
    .line 1119
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v5

    .line 1123
    check-cast v5, La/pj30;

    .line 1124
    .line 1125
    if-gez v15, :cond_1e

    .line 1126
    .line 1127
    move v6, v12

    .line 1128
    goto :goto_14

    .line 1129
    :cond_1e
    move v6, v15

    .line 1130
    :goto_14
    const/4 v8, 0x0

    .line 1131
    const/16 v9, 0xc

    .line 1132
    .line 1133
    move-object v7, v5

    .line 1134
    const/4 v5, 0x0

    .line 1135
    move-object/from16 v16, v7

    .line 1136
    .line 1137
    const/4 v7, 0x0

    .line 1138
    move-object/from16 v12, v16

    .line 1139
    .line 1140
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v5

    .line 1144
    invoke-interface {v12, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v9

    .line 1148
    const/4 v6, 0x2

    .line 1149
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v2

    .line 1153
    move-object v12, v2

    .line 1154
    check-cast v12, La/pj30;

    .line 1155
    .line 1156
    if-gez v15, :cond_1f

    .line 1157
    .line 1158
    const/4 v5, 0x0

    .line 1159
    goto :goto_15

    .line 1160
    :cond_1f
    move v5, v15

    .line 1161
    :goto_15
    const/4 v7, 0x0

    .line 1162
    const/16 v8, 0xc

    .line 1163
    .line 1164
    const/4 v4, 0x0

    .line 1165
    const/4 v6, 0x0

    .line 1166
    move-wide/from16 v2, p3

    .line 1167
    .line 1168
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 1169
    .line 1170
    .line 1171
    move-result-wide v4

    .line 1172
    invoke-interface {v12, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v2

    .line 1176
    sub-int v3, v11, v10

    .line 1177
    .line 1178
    sub-int/2addr v3, v14

    .line 1179
    iget v4, v9, La/pu90;->a:I

    .line 1180
    .line 1181
    sub-int v22, v3, v4

    .line 1182
    .line 1183
    add-int/2addr v11, v10

    .line 1184
    add-int v28, v11, v14

    .line 1185
    .line 1186
    iget v3, v13, La/pu90;->b:I

    .line 1187
    .line 1188
    iget v4, v9, La/pu90;->b:I

    .line 1189
    .line 1190
    iget v5, v2, La/pu90;->b:I

    .line 1191
    .line 1192
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 1197
    .line 1198
    .line 1199
    move-result v3

    .line 1200
    iget v4, v13, La/pu90;->b:I

    .line 1201
    .line 1202
    sub-int v4, v3, v4

    .line 1203
    .line 1204
    const/16 v19, 0x2

    .line 1205
    .line 1206
    div-int/lit8 v26, v4, 0x2

    .line 1207
    .line 1208
    iget v4, v9, La/pu90;->b:I

    .line 1209
    .line 1210
    sub-int v4, v3, v4

    .line 1211
    .line 1212
    div-int/lit8 v23, v4, 0x2

    .line 1213
    .line 1214
    iget v4, v2, La/pu90;->b:I

    .line 1215
    .line 1216
    sub-int v4, v3, v4

    .line 1217
    .line 1218
    div-int/lit8 v29, v4, 0x2

    .line 1219
    .line 1220
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1221
    .line 1222
    .line 1223
    move-result v4

    .line 1224
    new-instance v20, La/cx40;

    .line 1225
    .line 1226
    iget-boolean v0, v0, La/kp2;->b:Z

    .line 1227
    .line 1228
    move/from16 v30, v0

    .line 1229
    .line 1230
    move-object/from16 v27, v2

    .line 1231
    .line 1232
    move-object/from16 v21, v9

    .line 1233
    .line 1234
    move-object/from16 v24, v13

    .line 1235
    .line 1236
    invoke-direct/range {v20 .. v30}, La/cx40;-><init>(La/pu90;IILa/pu90;IILa/pu90;IIZ)V

    .line 1237
    .line 1238
    .line 1239
    move-object/from16 v0, v20

    .line 1240
    .line 1241
    invoke-static {v1, v4, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v0

    .line 1245
    return-object v0

    .line 1246
    :pswitch_5
    move-object v10, v12

    .line 1247
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    new-instance v11, Ljava/util/ArrayList;

    .line 1251
    .line 1252
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1253
    .line 1254
    .line 1255
    move-result v3

    .line 1256
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1257
    .line 1258
    .line 1259
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1260
    .line 1261
    .line 1262
    move-result v12

    .line 1263
    const/4 v14, 0x0

    .line 1264
    const/16 v35, 0x0

    .line 1265
    .line 1266
    :goto_16
    if-ge v14, v12, :cond_23

    .line 1267
    .line 1268
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1269
    .line 1270
    .line 1271
    move-result-object v3

    .line 1272
    move-object v15, v3

    .line 1273
    check-cast v15, La/pj30;

    .line 1274
    .line 1275
    invoke-static {v15}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1276
    .line 1277
    .line 1278
    move-result-object v3

    .line 1279
    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1280
    .line 1281
    .line 1282
    move-result v4

    .line 1283
    if-eqz v4, :cond_20

    .line 1284
    .line 1285
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1286
    .line 1287
    .line 1288
    move-result v3

    .line 1289
    sub-int v5, v3, v35

    .line 1290
    .line 1291
    const/4 v8, 0x0

    .line 1292
    const/16 v9, 0xc

    .line 1293
    .line 1294
    const/4 v7, 0x0

    .line 1295
    move v6, v5

    .line 1296
    move-wide/from16 v3, p3

    .line 1297
    .line 1298
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1299
    .line 1300
    .line 1301
    move-result-wide v5

    .line 1302
    invoke-interface {v15, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v3

    .line 1306
    goto :goto_17

    .line 1307
    :cond_20
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1308
    .line 1309
    .line 1310
    move-result v3

    .line 1311
    if-eqz v3, :cond_21

    .line 1312
    .line 1313
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1314
    .line 1315
    .line 1316
    move-result v3

    .line 1317
    int-to-float v3, v3

    .line 1318
    mul-float v3, v3, v16

    .line 1319
    .line 1320
    float-to-int v6, v3

    .line 1321
    const/4 v8, 0x0

    .line 1322
    const/16 v9, 0xc

    .line 1323
    .line 1324
    const/4 v5, 0x0

    .line 1325
    const/4 v7, 0x0

    .line 1326
    move-wide/from16 v3, p3

    .line 1327
    .line 1328
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1329
    .line 1330
    .line 1331
    move-result-wide v5

    .line 1332
    invoke-interface {v15, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v3

    .line 1336
    iget v4, v3, La/pu90;->a:I

    .line 1337
    .line 1338
    move/from16 v35, v4

    .line 1339
    .line 1340
    goto :goto_17

    .line 1341
    :cond_21
    move-object/from16 v3, v17

    .line 1342
    .line 1343
    :goto_17
    if-eqz v3, :cond_22

    .line 1344
    .line 1345
    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1346
    .line 1347
    .line 1348
    :cond_22
    add-int/lit8 v14, v14, 0x1

    .line 1349
    .line 1350
    goto :goto_16

    .line 1351
    :cond_23
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1352
    .line 1353
    .line 1354
    move-result v5

    .line 1355
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v2

    .line 1359
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    if-eqz v3, :cond_26

    .line 1364
    .line 1365
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    check-cast v3, La/pu90;

    .line 1370
    .line 1371
    iget v3, v3, La/pu90;->b:I

    .line 1372
    .line 1373
    :goto_18
    move v6, v3

    .line 1374
    :cond_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1375
    .line 1376
    .line 1377
    move-result v3

    .line 1378
    if-eqz v3, :cond_25

    .line 1379
    .line 1380
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    check-cast v3, La/pu90;

    .line 1385
    .line 1386
    iget v3, v3, La/pu90;->b:I

    .line 1387
    .line 1388
    if-ge v6, v3, :cond_24

    .line 1389
    .line 1390
    goto :goto_18

    .line 1391
    :cond_25
    new-instance v2, La/fjs;

    .line 1392
    .line 1393
    const/4 v7, 0x2

    .line 1394
    iget-boolean v3, v0, La/kp2;->b:Z

    .line 1395
    .line 1396
    move-object v4, v11

    .line 1397
    invoke-direct/range {v2 .. v7}, La/fjs;-><init>(ZLjava/util/ArrayList;IIB)V

    .line 1398
    .line 1399
    .line 1400
    invoke-static {v1, v5, v6, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v17

    .line 1404
    goto :goto_19

    .line 1405
    :cond_26
    invoke-static {}, La/itt0;->a()V

    .line 1406
    .line 1407
    .line 1408
    :goto_19
    return-object v17

    .line 1409
    :pswitch_6
    move-object v10, v12

    .line 1410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1411
    .line 1412
    .line 1413
    new-instance v11, Ljava/util/ArrayList;

    .line 1414
    .line 1415
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1416
    .line 1417
    .line 1418
    move-result v3

    .line 1419
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1420
    .line 1421
    .line 1422
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1423
    .line 1424
    .line 1425
    move-result v12

    .line 1426
    const/4 v14, 0x0

    .line 1427
    const/16 v35, 0x0

    .line 1428
    .line 1429
    :goto_1a
    if-ge v14, v12, :cond_2a

    .line 1430
    .line 1431
    invoke-interface {v2, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v3

    .line 1435
    move-object v15, v3

    .line 1436
    check-cast v15, La/pj30;

    .line 1437
    .line 1438
    invoke-static {v15}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v3

    .line 1442
    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1443
    .line 1444
    .line 1445
    move-result v4

    .line 1446
    if-eqz v4, :cond_27

    .line 1447
    .line 1448
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1449
    .line 1450
    .line 1451
    move-result v3

    .line 1452
    sub-int v5, v3, v35

    .line 1453
    .line 1454
    const/4 v8, 0x0

    .line 1455
    const/16 v9, 0xc

    .line 1456
    .line 1457
    const/4 v7, 0x0

    .line 1458
    move v6, v5

    .line 1459
    move-wide/from16 v3, p3

    .line 1460
    .line 1461
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1462
    .line 1463
    .line 1464
    move-result-wide v5

    .line 1465
    invoke-interface {v15, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    move-object v5, v3

    .line 1470
    move-wide/from16 v3, p3

    .line 1471
    .line 1472
    goto :goto_1b

    .line 1473
    :cond_27
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    if-eqz v3, :cond_28

    .line 1478
    .line 1479
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1480
    .line 1481
    .line 1482
    move-result v3

    .line 1483
    int-to-float v3, v3

    .line 1484
    mul-float v3, v3, v16

    .line 1485
    .line 1486
    float-to-int v6, v3

    .line 1487
    const/4 v8, 0x0

    .line 1488
    const/16 v9, 0xc

    .line 1489
    .line 1490
    const/4 v5, 0x0

    .line 1491
    const/4 v7, 0x0

    .line 1492
    move-wide/from16 v3, p3

    .line 1493
    .line 1494
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1495
    .line 1496
    .line 1497
    move-result-wide v5

    .line 1498
    invoke-interface {v15, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v5

    .line 1502
    iget v6, v5, La/pu90;->a:I

    .line 1503
    .line 1504
    move/from16 v35, v6

    .line 1505
    .line 1506
    goto :goto_1b

    .line 1507
    :cond_28
    move-wide/from16 v3, p3

    .line 1508
    .line 1509
    move-object/from16 v5, v17

    .line 1510
    .line 1511
    :goto_1b
    if-eqz v5, :cond_29

    .line 1512
    .line 1513
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1514
    .line 1515
    .line 1516
    :cond_29
    add-int/lit8 v14, v14, 0x1

    .line 1517
    .line 1518
    goto :goto_1a

    .line 1519
    :cond_2a
    move-wide/from16 v3, p3

    .line 1520
    .line 1521
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1522
    .line 1523
    .line 1524
    move-result v5

    .line 1525
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v2

    .line 1529
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1530
    .line 1531
    .line 1532
    move-result v3

    .line 1533
    if-eqz v3, :cond_2d

    .line 1534
    .line 1535
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v3

    .line 1539
    check-cast v3, La/pu90;

    .line 1540
    .line 1541
    iget v3, v3, La/pu90;->b:I

    .line 1542
    .line 1543
    :goto_1c
    move v6, v3

    .line 1544
    :cond_2b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1545
    .line 1546
    .line 1547
    move-result v3

    .line 1548
    if-eqz v3, :cond_2c

    .line 1549
    .line 1550
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v3

    .line 1554
    check-cast v3, La/pu90;

    .line 1555
    .line 1556
    iget v3, v3, La/pu90;->b:I

    .line 1557
    .line 1558
    if-ge v6, v3, :cond_2b

    .line 1559
    .line 1560
    goto :goto_1c

    .line 1561
    :cond_2c
    new-instance v2, La/fjs;

    .line 1562
    .line 1563
    const/4 v7, 0x1

    .line 1564
    iget-boolean v3, v0, La/kp2;->b:Z

    .line 1565
    .line 1566
    move-object v4, v11

    .line 1567
    invoke-direct/range {v2 .. v7}, La/fjs;-><init>(ZLjava/util/ArrayList;IIB)V

    .line 1568
    .line 1569
    .line 1570
    invoke-static {v1, v5, v6, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1571
    .line 1572
    .line 1573
    move-result-object v17

    .line 1574
    goto :goto_1d

    .line 1575
    :cond_2d
    invoke-static {}, La/itt0;->a()V

    .line 1576
    .line 1577
    .line 1578
    :goto_1d
    return-object v17

    .line 1579
    :pswitch_7
    move v15, v8

    .line 1580
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1581
    .line 1582
    .line 1583
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1584
    .line 1585
    .line 1586
    move-result v0

    .line 1587
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 1588
    .line 1589
    .line 1590
    move-result v9

    .line 1591
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1592
    .line 1593
    .line 1594
    move-result-object v5

    .line 1595
    :cond_2e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1596
    .line 1597
    .line 1598
    move-result v6

    .line 1599
    if-eqz v6, :cond_2f

    .line 1600
    .line 1601
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v6

    .line 1605
    move-object v7, v6

    .line 1606
    check-cast v7, La/pj30;

    .line 1607
    .line 1608
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1609
    .line 1610
    .line 1611
    move-result-object v7

    .line 1612
    const-string v8, "middleContent"

    .line 1613
    .line 1614
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1615
    .line 1616
    .line 1617
    move-result v7

    .line 1618
    if-eqz v7, :cond_2e

    .line 1619
    .line 1620
    goto :goto_1e

    .line 1621
    :cond_2f
    move-object/from16 v6, v17

    .line 1622
    .line 1623
    :goto_1e
    move-object v10, v6

    .line 1624
    check-cast v10, La/pj30;

    .line 1625
    .line 1626
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v5

    .line 1630
    :cond_30
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1631
    .line 1632
    .line 1633
    move-result v6

    .line 1634
    if-eqz v6, :cond_31

    .line 1635
    .line 1636
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v6

    .line 1640
    move-object v7, v6

    .line 1641
    check-cast v7, La/pj30;

    .line 1642
    .line 1643
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1644
    .line 1645
    .line 1646
    move-result-object v7

    .line 1647
    const-string v8, "rightContent"

    .line 1648
    .line 1649
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1650
    .line 1651
    .line 1652
    move-result v7

    .line 1653
    if-eqz v7, :cond_30

    .line 1654
    .line 1655
    goto :goto_1f

    .line 1656
    :cond_31
    move-object/from16 v6, v17

    .line 1657
    .line 1658
    :goto_1f
    move-object v11, v6

    .line 1659
    check-cast v11, La/pj30;

    .line 1660
    .line 1661
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v5

    .line 1665
    :cond_32
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1666
    .line 1667
    .line 1668
    move-result v6

    .line 1669
    if-eqz v6, :cond_33

    .line 1670
    .line 1671
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v6

    .line 1675
    move-object v7, v6

    .line 1676
    check-cast v7, La/pj30;

    .line 1677
    .line 1678
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v7

    .line 1682
    const-string v8, "leftContent"

    .line 1683
    .line 1684
    invoke-static {v7, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1685
    .line 1686
    .line 1687
    move-result v7

    .line 1688
    if-eqz v7, :cond_32

    .line 1689
    .line 1690
    goto :goto_20

    .line 1691
    :cond_33
    move-object/from16 v6, v17

    .line 1692
    .line 1693
    :goto_20
    check-cast v6, La/pj30;

    .line 1694
    .line 1695
    if-eqz v6, :cond_34

    .line 1696
    .line 1697
    invoke-interface {v6, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 1698
    .line 1699
    .line 1700
    move-result-object v5

    .line 1701
    move-object v12, v5

    .line 1702
    goto :goto_21

    .line 1703
    :cond_34
    move-object/from16 v12, v17

    .line 1704
    .line 1705
    :goto_21
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1706
    .line 1707
    .line 1708
    move-result-object v2

    .line 1709
    :cond_35
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1710
    .line 1711
    .line 1712
    move-result v5

    .line 1713
    if-eqz v5, :cond_36

    .line 1714
    .line 1715
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v5

    .line 1719
    move-object v6, v5

    .line 1720
    check-cast v6, La/pj30;

    .line 1721
    .line 1722
    invoke-static {v6}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v6

    .line 1726
    const-string v7, "separator"

    .line 1727
    .line 1728
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1729
    .line 1730
    .line 1731
    move-result v6

    .line 1732
    if-eqz v6, :cond_35

    .line 1733
    .line 1734
    goto :goto_22

    .line 1735
    :cond_36
    move-object/from16 v5, v17

    .line 1736
    .line 1737
    :goto_22
    check-cast v5, La/pj30;

    .line 1738
    .line 1739
    if-eqz v5, :cond_37

    .line 1740
    .line 1741
    invoke-interface {v5, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 1742
    .line 1743
    .line 1744
    move-result-object v2

    .line 1745
    move-object v13, v2

    .line 1746
    goto :goto_23

    .line 1747
    :cond_37
    move-object/from16 v13, v17

    .line 1748
    .line 1749
    :goto_23
    if-eqz v12, :cond_38

    .line 1750
    .line 1751
    iget v5, v12, La/pu90;->a:I

    .line 1752
    .line 1753
    move v14, v5

    .line 1754
    goto :goto_24

    .line 1755
    :cond_38
    const/4 v14, 0x0

    .line 1756
    :goto_24
    if-eqz v15, :cond_3e

    .line 1757
    .line 1758
    if-eqz v10, :cond_3a

    .line 1759
    .line 1760
    sub-int v5, v0, v14

    .line 1761
    .line 1762
    if-gez v5, :cond_39

    .line 1763
    .line 1764
    const/4 v5, 0x0

    .line 1765
    :cond_39
    const/4 v7, 0x0

    .line 1766
    const/16 v8, 0xc

    .line 1767
    .line 1768
    const/4 v4, 0x0

    .line 1769
    const/4 v6, 0x0

    .line 1770
    move-wide/from16 v2, p3

    .line 1771
    .line 1772
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 1773
    .line 1774
    .line 1775
    move-result-wide v4

    .line 1776
    invoke-interface {v10, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v2

    .line 1780
    move-object v10, v2

    .line 1781
    goto :goto_25

    .line 1782
    :cond_3a
    move-object/from16 v10, v17

    .line 1783
    .line 1784
    :goto_25
    if-eqz v11, :cond_3d

    .line 1785
    .line 1786
    if-eqz v10, :cond_3b

    .line 1787
    .line 1788
    iget v5, v10, La/pu90;->a:I

    .line 1789
    .line 1790
    goto :goto_26

    .line 1791
    :cond_3b
    const/4 v5, 0x0

    .line 1792
    :goto_26
    sub-int v2, v0, v5

    .line 1793
    .line 1794
    const/16 v19, 0x2

    .line 1795
    .line 1796
    div-int/lit8 v5, v2, 0x2

    .line 1797
    .line 1798
    if-gez v5, :cond_3c

    .line 1799
    .line 1800
    const/4 v5, 0x0

    .line 1801
    :cond_3c
    const/4 v7, 0x0

    .line 1802
    const/16 v8, 0xc

    .line 1803
    .line 1804
    const/4 v4, 0x0

    .line 1805
    const/4 v6, 0x0

    .line 1806
    move-wide/from16 v2, p3

    .line 1807
    .line 1808
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 1809
    .line 1810
    .line 1811
    move-result-wide v2

    .line 1812
    invoke-interface {v11, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v17

    .line 1816
    :cond_3d
    move-object v8, v10

    .line 1817
    move-object/from16 v5, v17

    .line 1818
    .line 1819
    goto :goto_29

    .line 1820
    :cond_3e
    if-eqz v11, :cond_3f

    .line 1821
    .line 1822
    invoke-interface {v11, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v2

    .line 1826
    move-object v11, v2

    .line 1827
    goto :goto_27

    .line 1828
    :cond_3f
    move-object/from16 v11, v17

    .line 1829
    .line 1830
    :goto_27
    if-eqz v10, :cond_42

    .line 1831
    .line 1832
    sub-int v2, v0, v14

    .line 1833
    .line 1834
    if-eqz v11, :cond_40

    .line 1835
    .line 1836
    iget v5, v11, La/pu90;->a:I

    .line 1837
    .line 1838
    goto :goto_28

    .line 1839
    :cond_40
    const/4 v5, 0x0

    .line 1840
    :goto_28
    sub-int v5, v2, v5

    .line 1841
    .line 1842
    if-gez v5, :cond_41

    .line 1843
    .line 1844
    const/4 v5, 0x0

    .line 1845
    :cond_41
    const/4 v7, 0x0

    .line 1846
    const/16 v8, 0xd

    .line 1847
    .line 1848
    const/4 v4, 0x0

    .line 1849
    const/4 v6, 0x0

    .line 1850
    move-wide/from16 v2, p3

    .line 1851
    .line 1852
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 1853
    .line 1854
    .line 1855
    move-result-wide v2

    .line 1856
    invoke-interface {v10, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v17

    .line 1860
    :cond_42
    move-object v5, v11

    .line 1861
    move-object/from16 v8, v17

    .line 1862
    .line 1863
    :goto_29
    if-eqz v5, :cond_43

    .line 1864
    .line 1865
    iget v2, v5, La/pu90;->a:I

    .line 1866
    .line 1867
    goto :goto_2a

    .line 1868
    :cond_43
    const/4 v2, 0x0

    .line 1869
    :goto_2a
    if-eqz v8, :cond_44

    .line 1870
    .line 1871
    iget v3, v8, La/pu90;->a:I

    .line 1872
    .line 1873
    goto :goto_2b

    .line 1874
    :cond_44
    const/4 v3, 0x0

    .line 1875
    :goto_2b
    sub-int v4, v0, v14

    .line 1876
    .line 1877
    sub-int v7, v4, v2

    .line 1878
    .line 1879
    invoke-static {v14, v2}, Ljava/lang/Math;->max(II)I

    .line 1880
    .line 1881
    .line 1882
    move-result v4

    .line 1883
    const/16 v19, 0x2

    .line 1884
    .line 1885
    mul-int/lit8 v4, v4, 0x2

    .line 1886
    .line 1887
    sub-int v4, v0, v4

    .line 1888
    .line 1889
    if-gt v3, v4, :cond_45

    .line 1890
    .line 1891
    sub-int v2, v0, v3

    .line 1892
    .line 1893
    div-int/lit8 v2, v2, 0x2

    .line 1894
    .line 1895
    goto :goto_2c

    .line 1896
    :cond_45
    if-le v14, v2, :cond_46

    .line 1897
    .line 1898
    move v2, v14

    .line 1899
    goto :goto_2c

    .line 1900
    :cond_46
    sub-int v2, v0, v2

    .line 1901
    .line 1902
    sub-int/2addr v2, v3

    .line 1903
    :goto_2c
    new-instance v3, La/glm;

    .line 1904
    .line 1905
    move v4, v9

    .line 1906
    move-object v10, v13

    .line 1907
    move v6, v14

    .line 1908
    move v9, v2

    .line 1909
    move-object v2, v3

    .line 1910
    move-object v3, v12

    .line 1911
    invoke-direct/range {v2 .. v10}, La/glm;-><init>(La/pu90;ILa/pu90;IILa/pu90;ILa/pu90;)V

    .line 1912
    .line 1913
    .line 1914
    invoke-static {v1, v0, v4, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1915
    .line 1916
    .line 1917
    move-result-object v0

    .line 1918
    return-object v0

    .line 1919
    :pswitch_8
    move v15, v8

    .line 1920
    move-object v10, v12

    .line 1921
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1922
    .line 1923
    .line 1924
    new-instance v0, Ljava/util/ArrayList;

    .line 1925
    .line 1926
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 1927
    .line 1928
    .line 1929
    move-result v3

    .line 1930
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1931
    .line 1932
    .line 1933
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 1934
    .line 1935
    .line 1936
    move-result v11

    .line 1937
    const/4 v12, 0x0

    .line 1938
    const/16 v35, 0x0

    .line 1939
    .line 1940
    :goto_2d
    if-ge v12, v11, :cond_4a

    .line 1941
    .line 1942
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1943
    .line 1944
    .line 1945
    move-result-object v3

    .line 1946
    move-object v14, v3

    .line 1947
    check-cast v14, La/pj30;

    .line 1948
    .line 1949
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v3

    .line 1953
    invoke-static {v3, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1954
    .line 1955
    .line 1956
    move-result v4

    .line 1957
    if-eqz v4, :cond_47

    .line 1958
    .line 1959
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1960
    .line 1961
    .line 1962
    move-result v3

    .line 1963
    sub-int v5, v3, v35

    .line 1964
    .line 1965
    const/4 v8, 0x0

    .line 1966
    const/16 v9, 0xc

    .line 1967
    .line 1968
    const/4 v7, 0x0

    .line 1969
    move v6, v5

    .line 1970
    move-wide/from16 v3, p3

    .line 1971
    .line 1972
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 1973
    .line 1974
    .line 1975
    move-result-wide v5

    .line 1976
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 1977
    .line 1978
    .line 1979
    move-result-object v3

    .line 1980
    goto :goto_2e

    .line 1981
    :cond_47
    invoke-static {v3, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1982
    .line 1983
    .line 1984
    move-result v3

    .line 1985
    if-eqz v3, :cond_48

    .line 1986
    .line 1987
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 1988
    .line 1989
    .line 1990
    move-result v3

    .line 1991
    int-to-float v3, v3

    .line 1992
    mul-float v3, v3, v16

    .line 1993
    .line 1994
    float-to-int v6, v3

    .line 1995
    const/4 v8, 0x0

    .line 1996
    const/16 v9, 0xc

    .line 1997
    .line 1998
    const/4 v5, 0x0

    .line 1999
    const/4 v7, 0x0

    .line 2000
    move-wide/from16 v3, p3

    .line 2001
    .line 2002
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 2003
    .line 2004
    .line 2005
    move-result-wide v5

    .line 2006
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v3

    .line 2010
    iget v4, v3, La/pu90;->a:I

    .line 2011
    .line 2012
    move/from16 v35, v4

    .line 2013
    .line 2014
    goto :goto_2e

    .line 2015
    :cond_48
    move-object/from16 v3, v17

    .line 2016
    .line 2017
    :goto_2e
    if-eqz v3, :cond_49

    .line 2018
    .line 2019
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2020
    .line 2021
    .line 2022
    :cond_49
    add-int/lit8 v12, v12, 0x1

    .line 2023
    .line 2024
    goto :goto_2d

    .line 2025
    :cond_4a
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2026
    .line 2027
    .line 2028
    move-result v2

    .line 2029
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2030
    .line 2031
    .line 2032
    move-result-object v3

    .line 2033
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2034
    .line 2035
    .line 2036
    move-result v4

    .line 2037
    if-eqz v4, :cond_4d

    .line 2038
    .line 2039
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v4

    .line 2043
    check-cast v4, La/pu90;

    .line 2044
    .line 2045
    iget v4, v4, La/pu90;->b:I

    .line 2046
    .line 2047
    :cond_4b
    :goto_2f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2048
    .line 2049
    .line 2050
    move-result v5

    .line 2051
    if-eqz v5, :cond_4c

    .line 2052
    .line 2053
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v5

    .line 2057
    check-cast v5, La/pu90;

    .line 2058
    .line 2059
    iget v5, v5, La/pu90;->b:I

    .line 2060
    .line 2061
    if-ge v4, v5, :cond_4b

    .line 2062
    .line 2063
    move v4, v5

    .line 2064
    goto :goto_2f

    .line 2065
    :cond_4c
    new-instance v3, La/hka;

    .line 2066
    .line 2067
    const/4 v6, 0x2

    .line 2068
    invoke-direct {v3, v15, v0, v2, v6}, La/hka;-><init>(ZLjava/util/ArrayList;IB)V

    .line 2069
    .line 2070
    .line 2071
    invoke-static {v1, v2, v4, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2072
    .line 2073
    .line 2074
    move-result-object v17

    .line 2075
    goto :goto_30

    .line 2076
    :cond_4d
    invoke-static {}, La/itt0;->a()V

    .line 2077
    .line 2078
    .line 2079
    :goto_30
    return-object v17

    .line 2080
    :pswitch_9
    move v15, v8

    .line 2081
    move-object v10, v12

    .line 2082
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2083
    .line 2084
    .line 2085
    new-instance v0, Ljava/util/ArrayList;

    .line 2086
    .line 2087
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2088
    .line 2089
    .line 2090
    move-result v3

    .line 2091
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2092
    .line 2093
    .line 2094
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2095
    .line 2096
    .line 2097
    move-result v11

    .line 2098
    const/4 v12, 0x0

    .line 2099
    const/16 v35, 0x0

    .line 2100
    .line 2101
    :goto_31
    if-ge v12, v11, :cond_51

    .line 2102
    .line 2103
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2104
    .line 2105
    .line 2106
    move-result-object v3

    .line 2107
    check-cast v3, La/pj30;

    .line 2108
    .line 2109
    invoke-static {v3}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v4

    .line 2113
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2114
    .line 2115
    .line 2116
    move-result v5

    .line 2117
    if-eqz v5, :cond_4e

    .line 2118
    .line 2119
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2120
    .line 2121
    .line 2122
    move-result v4

    .line 2123
    sub-int v5, v4, v35

    .line 2124
    .line 2125
    const/4 v8, 0x0

    .line 2126
    const/16 v9, 0xc

    .line 2127
    .line 2128
    const/4 v7, 0x0

    .line 2129
    move v6, v5

    .line 2130
    move-object v14, v3

    .line 2131
    move-wide/from16 v3, p3

    .line 2132
    .line 2133
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 2134
    .line 2135
    .line 2136
    move-result-wide v5

    .line 2137
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 2138
    .line 2139
    .line 2140
    move-result-object v3

    .line 2141
    goto :goto_32

    .line 2142
    :cond_4e
    move-object v14, v3

    .line 2143
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2144
    .line 2145
    .line 2146
    move-result v3

    .line 2147
    if-eqz v3, :cond_4f

    .line 2148
    .line 2149
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2150
    .line 2151
    .line 2152
    move-result v3

    .line 2153
    int-to-float v3, v3

    .line 2154
    mul-float v3, v3, v16

    .line 2155
    .line 2156
    float-to-int v6, v3

    .line 2157
    const/4 v8, 0x0

    .line 2158
    const/16 v9, 0xc

    .line 2159
    .line 2160
    const/4 v5, 0x0

    .line 2161
    const/4 v7, 0x0

    .line 2162
    move-wide/from16 v3, p3

    .line 2163
    .line 2164
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 2165
    .line 2166
    .line 2167
    move-result-wide v5

    .line 2168
    invoke-interface {v14, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v3

    .line 2172
    iget v4, v3, La/pu90;->a:I

    .line 2173
    .line 2174
    move/from16 v35, v4

    .line 2175
    .line 2176
    goto :goto_32

    .line 2177
    :cond_4f
    move-object/from16 v3, v17

    .line 2178
    .line 2179
    :goto_32
    if-eqz v3, :cond_50

    .line 2180
    .line 2181
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2182
    .line 2183
    .line 2184
    :cond_50
    add-int/lit8 v12, v12, 0x1

    .line 2185
    .line 2186
    const/4 v14, 0x1

    .line 2187
    goto :goto_31

    .line 2188
    :cond_51
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2189
    .line 2190
    .line 2191
    move-result v2

    .line 2192
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2193
    .line 2194
    .line 2195
    move-result-object v3

    .line 2196
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2197
    .line 2198
    .line 2199
    move-result v4

    .line 2200
    if-eqz v4, :cond_54

    .line 2201
    .line 2202
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v4

    .line 2206
    check-cast v4, La/pu90;

    .line 2207
    .line 2208
    iget v4, v4, La/pu90;->b:I

    .line 2209
    .line 2210
    :cond_52
    :goto_33
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2211
    .line 2212
    .line 2213
    move-result v5

    .line 2214
    if-eqz v5, :cond_53

    .line 2215
    .line 2216
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2217
    .line 2218
    .line 2219
    move-result-object v5

    .line 2220
    check-cast v5, La/pu90;

    .line 2221
    .line 2222
    iget v5, v5, La/pu90;->b:I

    .line 2223
    .line 2224
    if-ge v4, v5, :cond_52

    .line 2225
    .line 2226
    move v4, v5

    .line 2227
    goto :goto_33

    .line 2228
    :cond_53
    new-instance v3, La/hka;

    .line 2229
    .line 2230
    const/4 v5, 0x1

    .line 2231
    invoke-direct {v3, v15, v0, v2, v5}, La/hka;-><init>(ZLjava/util/ArrayList;IB)V

    .line 2232
    .line 2233
    .line 2234
    invoke-static {v1, v2, v4, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2235
    .line 2236
    .line 2237
    move-result-object v17

    .line 2238
    goto :goto_34

    .line 2239
    :cond_54
    invoke-static {}, La/itt0;->a()V

    .line 2240
    .line 2241
    .line 2242
    :goto_34
    return-object v17

    .line 2243
    :pswitch_a
    move v15, v8

    .line 2244
    move-object v10, v12

    .line 2245
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2246
    .line 2247
    .line 2248
    new-instance v0, Ljava/util/ArrayList;

    .line 2249
    .line 2250
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2251
    .line 2252
    .line 2253
    move-result v3

    .line 2254
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2255
    .line 2256
    .line 2257
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 2258
    .line 2259
    .line 2260
    move-result v11

    .line 2261
    const/4 v12, 0x0

    .line 2262
    const/4 v14, 0x0

    .line 2263
    :goto_35
    if-ge v12, v11, :cond_58

    .line 2264
    .line 2265
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v3

    .line 2269
    check-cast v3, La/pj30;

    .line 2270
    .line 2271
    invoke-static {v3}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v4

    .line 2275
    invoke-static {v4, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2276
    .line 2277
    .line 2278
    move-result v5

    .line 2279
    if-eqz v5, :cond_55

    .line 2280
    .line 2281
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2282
    .line 2283
    .line 2284
    move-result v4

    .line 2285
    sub-int v5, v4, v14

    .line 2286
    .line 2287
    const/4 v8, 0x0

    .line 2288
    const/16 v9, 0xc

    .line 2289
    .line 2290
    const/4 v7, 0x0

    .line 2291
    move v6, v5

    .line 2292
    move/from16 p0, v11

    .line 2293
    .line 2294
    move-object v11, v3

    .line 2295
    move-wide/from16 v3, p3

    .line 2296
    .line 2297
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 2298
    .line 2299
    .line 2300
    move-result-wide v5

    .line 2301
    invoke-interface {v11, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 2302
    .line 2303
    .line 2304
    move-result-object v3

    .line 2305
    goto :goto_36

    .line 2306
    :cond_55
    move/from16 p0, v11

    .line 2307
    .line 2308
    move-object v11, v3

    .line 2309
    invoke-static {v4, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2310
    .line 2311
    .line 2312
    move-result v3

    .line 2313
    if-eqz v3, :cond_56

    .line 2314
    .line 2315
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2316
    .line 2317
    .line 2318
    move-result v3

    .line 2319
    int-to-float v3, v3

    .line 2320
    mul-float v3, v3, v16

    .line 2321
    .line 2322
    float-to-int v6, v3

    .line 2323
    const/4 v8, 0x0

    .line 2324
    const/16 v9, 0xc

    .line 2325
    .line 2326
    const/4 v5, 0x0

    .line 2327
    const/4 v7, 0x0

    .line 2328
    move-wide/from16 v3, p3

    .line 2329
    .line 2330
    invoke-static/range {v3 .. v9}, La/p4e;->b(JIIIII)J

    .line 2331
    .line 2332
    .line 2333
    move-result-wide v5

    .line 2334
    invoke-interface {v11, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 2335
    .line 2336
    .line 2337
    move-result-object v3

    .line 2338
    iget v4, v3, La/pu90;->a:I

    .line 2339
    .line 2340
    move v14, v4

    .line 2341
    goto :goto_36

    .line 2342
    :cond_56
    move-object/from16 v3, v17

    .line 2343
    .line 2344
    :goto_36
    if-eqz v3, :cond_57

    .line 2345
    .line 2346
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2347
    .line 2348
    .line 2349
    :cond_57
    add-int/lit8 v12, v12, 0x1

    .line 2350
    .line 2351
    move/from16 v11, p0

    .line 2352
    .line 2353
    goto :goto_35

    .line 2354
    :cond_58
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2355
    .line 2356
    .line 2357
    move-result v2

    .line 2358
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2359
    .line 2360
    .line 2361
    move-result-object v3

    .line 2362
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2363
    .line 2364
    .line 2365
    move-result v4

    .line 2366
    if-eqz v4, :cond_5b

    .line 2367
    .line 2368
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2369
    .line 2370
    .line 2371
    move-result-object v4

    .line 2372
    check-cast v4, La/pu90;

    .line 2373
    .line 2374
    iget v4, v4, La/pu90;->b:I

    .line 2375
    .line 2376
    :cond_59
    :goto_37
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 2377
    .line 2378
    .line 2379
    move-result v5

    .line 2380
    if-eqz v5, :cond_5a

    .line 2381
    .line 2382
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v5

    .line 2386
    check-cast v5, La/pu90;

    .line 2387
    .line 2388
    iget v5, v5, La/pu90;->b:I

    .line 2389
    .line 2390
    if-ge v4, v5, :cond_59

    .line 2391
    .line 2392
    move v4, v5

    .line 2393
    goto :goto_37

    .line 2394
    :cond_5a
    new-instance v3, La/hka;

    .line 2395
    .line 2396
    const/4 v12, 0x0

    .line 2397
    invoke-direct {v3, v15, v0, v2, v12}, La/hka;-><init>(ZLjava/util/ArrayList;IB)V

    .line 2398
    .line 2399
    .line 2400
    invoke-static {v1, v2, v4, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2401
    .line 2402
    .line 2403
    move-result-object v17

    .line 2404
    goto :goto_38

    .line 2405
    :cond_5b
    invoke-static {}, La/itt0;->a()V

    .line 2406
    .line 2407
    .line 2408
    :goto_38
    return-object v17

    .line 2409
    :pswitch_b
    move v15, v8

    .line 2410
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2411
    .line 2412
    .line 2413
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 2414
    .line 2415
    .line 2416
    move-result v0

    .line 2417
    const/4 v6, 0x2

    .line 2418
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v3

    .line 2422
    move-object v10, v3

    .line 2423
    check-cast v10, La/pj30;

    .line 2424
    .line 2425
    const/4 v5, 0x1

    .line 2426
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v3

    .line 2430
    move-object v11, v3

    .line 2431
    check-cast v11, La/pj30;

    .line 2432
    .line 2433
    const/4 v12, 0x0

    .line 2434
    invoke-interface {v2, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v2

    .line 2438
    move-object v13, v2

    .line 2439
    check-cast v13, La/pj30;

    .line 2440
    .line 2441
    const/4 v7, 0x0

    .line 2442
    const/16 v8, 0xe

    .line 2443
    .line 2444
    const/4 v4, 0x0

    .line 2445
    const/4 v5, 0x0

    .line 2446
    const/4 v6, 0x0

    .line 2447
    move-wide/from16 v2, p3

    .line 2448
    .line 2449
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 2450
    .line 2451
    .line 2452
    move-result-wide v4

    .line 2453
    invoke-interface {v10, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v10

    .line 2457
    const/4 v4, 0x0

    .line 2458
    const/4 v5, 0x0

    .line 2459
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 2460
    .line 2461
    .line 2462
    move-result-wide v4

    .line 2463
    invoke-interface {v11, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 2464
    .line 2465
    .line 2466
    move-result-object v11

    .line 2467
    iget v2, v10, La/pu90;->a:I

    .line 2468
    .line 2469
    sub-int v2, v0, v2

    .line 2470
    .line 2471
    sget-object v3, La/qmk;->a:La/zcl;

    .line 2472
    .line 2473
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 2474
    .line 2475
    .line 2476
    move-result v3

    .line 2477
    sub-int/2addr v2, v3

    .line 2478
    iget v3, v11, La/pu90;->a:I

    .line 2479
    .line 2480
    sub-int v5, v2, v3

    .line 2481
    .line 2482
    if-gez v5, :cond_5c

    .line 2483
    .line 2484
    move v4, v12

    .line 2485
    goto :goto_39

    .line 2486
    :cond_5c
    move v4, v5

    .line 2487
    :goto_39
    if-lez v4, :cond_5d

    .line 2488
    .line 2489
    const/4 v7, 0x0

    .line 2490
    const/16 v8, 0xc

    .line 2491
    .line 2492
    const/4 v6, 0x0

    .line 2493
    move v5, v4

    .line 2494
    move-wide/from16 v2, p3

    .line 2495
    .line 2496
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 2497
    .line 2498
    .line 2499
    move-result-wide v2

    .line 2500
    goto :goto_3a

    .line 2501
    :cond_5d
    const/4 v7, 0x0

    .line 2502
    const/16 v8, 0xc

    .line 2503
    .line 2504
    const/4 v4, 0x0

    .line 2505
    const/4 v5, 0x0

    .line 2506
    const/4 v6, 0x0

    .line 2507
    move-wide/from16 v2, p3

    .line 2508
    .line 2509
    invoke-static/range {v2 .. v8}, La/p4e;->b(JIIIII)J

    .line 2510
    .line 2511
    .line 2512
    move-result-wide v2

    .line 2513
    :goto_3a
    invoke-interface {v13, v2, v3}, La/pj30;->S(J)La/pu90;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v2

    .line 2517
    iget v3, v2, La/pu90;->b:I

    .line 2518
    .line 2519
    iget v4, v11, La/pu90;->b:I

    .line 2520
    .line 2521
    iget v5, v10, La/pu90;->b:I

    .line 2522
    .line 2523
    invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I

    .line 2524
    .line 2525
    .line 2526
    move-result v4

    .line 2527
    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    .line 2528
    .line 2529
    .line 2530
    move-result v3

    .line 2531
    invoke-interface {v1, v9}, La/w6k;->T(F)I

    .line 2532
    .line 2533
    .line 2534
    move-result v4

    .line 2535
    if-eqz v15, :cond_5e

    .line 2536
    .line 2537
    iget v5, v11, La/pu90;->a:I

    .line 2538
    .line 2539
    add-int/2addr v5, v4

    .line 2540
    iget v4, v2, La/pu90;->a:I

    .line 2541
    .line 2542
    sub-int v4, v0, v4

    .line 2543
    .line 2544
    move/from16 v28, v4

    .line 2545
    .line 2546
    move/from16 v25, v12

    .line 2547
    .line 2548
    :goto_3b
    move/from16 v22, v5

    .line 2549
    .line 2550
    goto :goto_3c

    .line 2551
    :cond_5e
    iget v5, v10, La/pu90;->a:I

    .line 2552
    .line 2553
    sub-int v5, v0, v5

    .line 2554
    .line 2555
    sub-int v4, v5, v4

    .line 2556
    .line 2557
    iget v6, v11, La/pu90;->a:I

    .line 2558
    .line 2559
    sub-int/2addr v4, v6

    .line 2560
    if-gez v4, :cond_5f

    .line 2561
    .line 2562
    move v4, v12

    .line 2563
    :cond_5f
    move/from16 v25, v4

    .line 2564
    .line 2565
    move/from16 v28, v12

    .line 2566
    .line 2567
    goto :goto_3b

    .line 2568
    :goto_3c
    iget v4, v10, La/pu90;->b:I

    .line 2569
    .line 2570
    sub-int v4, v3, v4

    .line 2571
    .line 2572
    const/16 v19, 0x2

    .line 2573
    .line 2574
    div-int/lit8 v23, v4, 0x2

    .line 2575
    .line 2576
    iget v4, v11, La/pu90;->b:I

    .line 2577
    .line 2578
    sub-int v4, v3, v4

    .line 2579
    .line 2580
    div-int/lit8 v26, v4, 0x2

    .line 2581
    .line 2582
    iget v4, v2, La/pu90;->b:I

    .line 2583
    .line 2584
    sub-int v4, v3, v4

    .line 2585
    .line 2586
    div-int/lit8 v29, v4, 0x2

    .line 2587
    .line 2588
    new-instance v20, La/jp2;

    .line 2589
    .line 2590
    move-object/from16 v27, v2

    .line 2591
    .line 2592
    move-object/from16 v21, v10

    .line 2593
    .line 2594
    move-object/from16 v24, v11

    .line 2595
    .line 2596
    invoke-direct/range {v20 .. v29}, La/jp2;-><init>(La/pu90;IILa/pu90;IILa/pu90;II)V

    .line 2597
    .line 2598
    .line 2599
    move-object/from16 v2, v20

    .line 2600
    .line 2601
    invoke-static {v1, v0, v3, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 2602
    .line 2603
    .line 2604
    move-result-object v0

    .line 2605
    return-object v0

    .line 2606
    nop

    .line 2607
    :pswitch_data_0
    .packed-switch 0x0
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
