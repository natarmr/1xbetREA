.class public final La/eam;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(IIB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/eam;->a:B

    iput p1, p0, La/eam;->b:I

    iput p2, p0, La/eam;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
    iget-byte v3, v0, La/eam;->a:B

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    iget v5, v0, La/eam;->b:I

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    packed-switch v3, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 19
    .line 20
    .line 21
    move-result v8

    .line 22
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 23
    .line 24
    .line 25
    move-result v15

    .line 26
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v6

    .line 34
    if-eqz v6, :cond_1

    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v6

    .line 40
    move-object v7, v6

    .line 41
    check-cast v7, La/pj30;

    .line 42
    .line 43
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v9, "TOOLBAR_ID"

    .line 48
    .line 49
    invoke-static {v7, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v7

    .line 53
    if-eqz v7, :cond_0

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    const/4 v6, 0x0

    .line 57
    :goto_0
    move-object v3, v6

    .line 58
    check-cast v3, La/pj30;

    .line 59
    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    const/4 v11, 0x0

    .line 63
    const/16 v12, 0x8

    .line 64
    .line 65
    const/4 v10, 0x0

    .line 66
    move v9, v8

    .line 67
    move-wide/from16 v6, p3

    .line 68
    .line 69
    invoke-static/range {v6 .. v12}, La/p4e;->b(JIIIII)J

    .line 70
    .line 71
    .line 72
    move-result-wide v9

    .line 73
    invoke-interface {v3, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    goto :goto_1

    .line 78
    :cond_2
    const/4 v3, 0x0

    .line 79
    :goto_1
    if-eqz v3, :cond_3

    .line 80
    .line 81
    iget v6, v3, La/pu90;->b:I

    .line 82
    .line 83
    move v14, v6

    .line 84
    goto :goto_2

    .line 85
    :cond_3
    move v14, v4

    .line 86
    :goto_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    :cond_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    if-eqz v7, :cond_5

    .line 95
    .line 96
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    move-object v9, v7

    .line 101
    check-cast v9, La/pj30;

    .line 102
    .line 103
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v9

    .line 107
    const-string v10, "BOTTOM_BAR_ID"

    .line 108
    .line 109
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eqz v9, :cond_4

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_5
    const/4 v7, 0x0

    .line 117
    :goto_3
    check-cast v7, La/pj30;

    .line 118
    .line 119
    if-eqz v7, :cond_6

    .line 120
    .line 121
    const/4 v11, 0x0

    .line 122
    const/16 v12, 0x8

    .line 123
    .line 124
    const/4 v10, 0x0

    .line 125
    move v9, v8

    .line 126
    move-object v13, v7

    .line 127
    move-wide/from16 v6, p3

    .line 128
    .line 129
    invoke-static/range {v6 .. v12}, La/p4e;->b(JIIIII)J

    .line 130
    .line 131
    .line 132
    move-result-wide v6

    .line 133
    invoke-interface {v13, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    goto :goto_4

    .line 138
    :cond_6
    const/4 v6, 0x0

    .line 139
    :goto_4
    if-eqz v6, :cond_7

    .line 140
    .line 141
    iget v7, v6, La/pu90;->b:I

    .line 142
    .line 143
    goto :goto_5

    .line 144
    :cond_7
    move v7, v4

    .line 145
    :goto_5
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v10

    .line 153
    if-eqz v10, :cond_9

    .line 154
    .line 155
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v10

    .line 159
    move-object v11, v10

    .line 160
    check-cast v11, La/pj30;

    .line 161
    .line 162
    invoke-static {v11}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    const-string v12, "MARKETS_SETTINGS_ID"

    .line 167
    .line 168
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v11

    .line 172
    if-eqz v11, :cond_8

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_9
    const/4 v10, 0x0

    .line 176
    :goto_6
    check-cast v10, La/pj30;

    .line 177
    .line 178
    if-eqz v10, :cond_a

    .line 179
    .line 180
    sub-int v9, v15, v5

    .line 181
    .line 182
    sub-int/2addr v9, v14

    .line 183
    sub-int/2addr v9, v7

    .line 184
    invoke-static {v8, v8, v4, v9}, La/p4e;->a(IIII)J

    .line 185
    .line 186
    .line 187
    move-result-wide v11

    .line 188
    invoke-interface {v10, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    move-object v13, v4

    .line 193
    goto :goto_7

    .line 194
    :cond_a
    const/4 v13, 0x0

    .line 195
    :goto_7
    sub-int v4, v15, v5

    .line 196
    .line 197
    sub-int/2addr v4, v14

    .line 198
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 203
    .line 204
    .line 205
    move-result v5

    .line 206
    if-eqz v5, :cond_c

    .line 207
    .line 208
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v5

    .line 212
    move-object v9, v5

    .line 213
    check-cast v9, La/pj30;

    .line 214
    .line 215
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v9

    .line 219
    const-string v10, "MARKETS_ID"

    .line 220
    .line 221
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_b

    .line 226
    .line 227
    goto :goto_8

    .line 228
    :cond_c
    const/4 v5, 0x0

    .line 229
    :goto_8
    check-cast v5, La/pj30;

    .line 230
    .line 231
    if-eqz v5, :cond_d

    .line 232
    .line 233
    invoke-static {v8, v8, v4, v4}, La/p4e;->a(IIII)J

    .line 234
    .line 235
    .line 236
    move-result-wide v9

    .line 237
    invoke-interface {v5, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 238
    .line 239
    .line 240
    move-result-object v2

    .line 241
    move-object v10, v2

    .line 242
    goto :goto_9

    .line 243
    :cond_d
    const/4 v10, 0x0

    .line 244
    :goto_9
    new-instance v9, La/b330;

    .line 245
    .line 246
    iget v11, v0, La/eam;->b:I

    .line 247
    .line 248
    iget v0, v0, La/eam;->c:I

    .line 249
    .line 250
    move/from16 v18, v0

    .line 251
    .line 252
    move-object/from16 v17, v3

    .line 253
    .line 254
    move/from16 v16, v7

    .line 255
    .line 256
    move v12, v14

    .line 257
    move-object v14, v6

    .line 258
    invoke-direct/range {v9 .. v18}, La/b330;-><init>(La/pu90;IILa/pu90;La/pu90;IILa/pu90;I)V

    .line 259
    .line 260
    .line 261
    invoke-static {v1, v8, v15, v9}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    return-object v0

    .line 266
    :pswitch_0
    sget-object v3, La/qmk;->a:La/zcl;

    .line 267
    .line 268
    const/high16 v3, 0x40800000    # 4.0f

    .line 269
    .line 270
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 271
    .line 272
    .line 273
    move-result v9

    .line 274
    const/high16 v3, 0x41000000    # 8.0f

    .line 275
    .line 276
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    const/high16 v3, 0x42200000    # 40.0f

    .line 281
    .line 282
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 283
    .line 284
    .line 285
    move-result v8

    .line 286
    const/high16 v6, 0x41c00000    # 24.0f

    .line 287
    .line 288
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 289
    .line 290
    .line 291
    move-result v12

    .line 292
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 293
    .line 294
    .line 295
    move-result v14

    .line 296
    mul-int v3, v5, v8

    .line 297
    .line 298
    add-int/lit8 v6, v5, -0x1

    .line 299
    .line 300
    if-gez v6, :cond_e

    .line 301
    .line 302
    move v6, v4

    .line 303
    :cond_e
    mul-int/2addr v6, v9

    .line 304
    add-int/2addr v3, v6

    .line 305
    new-array v10, v5, [La/pu90;

    .line 306
    .line 307
    move v6, v4

    .line 308
    :goto_a
    const-string v7, "width and height must be >= 0"

    .line 309
    .line 310
    if-ge v6, v5, :cond_12

    .line 311
    .line 312
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object v15

    .line 316
    check-cast v15, La/pj30;

    .line 317
    .line 318
    if-ltz v8, :cond_f

    .line 319
    .line 320
    const/16 v16, 0x1

    .line 321
    .line 322
    goto :goto_b

    .line 323
    :cond_f
    move/from16 v16, v4

    .line 324
    .line 325
    :goto_b
    if-ltz v12, :cond_10

    .line 326
    .line 327
    const/4 v11, 0x1

    .line 328
    goto :goto_c

    .line 329
    :cond_10
    move v11, v4

    .line 330
    :goto_c
    and-int v11, v16, v11

    .line 331
    .line 332
    if-nez v11, :cond_11

    .line 333
    .line 334
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    :cond_11
    move/from16 v17, v5

    .line 338
    .line 339
    invoke-static {v8, v8, v12, v12}, La/r4e;->h(IIII)J

    .line 340
    .line 341
    .line 342
    move-result-wide v4

    .line 343
    invoke-interface {v15, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    aput-object v4, v10, v6

    .line 348
    .line 349
    add-int/lit8 v6, v6, 0x1

    .line 350
    .line 351
    move/from16 v5, v17

    .line 352
    .line 353
    const/4 v4, 0x0

    .line 354
    goto :goto_a

    .line 355
    :cond_12
    move/from16 v17, v5

    .line 356
    .line 357
    iget v4, v0, La/eam;->c:I

    .line 358
    .line 359
    new-array v15, v4, [[La/pu90;

    .line 360
    .line 361
    const/4 v5, 0x0

    .line 362
    :goto_d
    if-ge v5, v4, :cond_17

    .line 363
    .line 364
    move/from16 v6, v17

    .line 365
    .line 366
    new-array v11, v6, [La/pu90;

    .line 367
    .line 368
    move/from16 v17, v4

    .line 369
    .line 370
    const/4 v4, 0x0

    .line 371
    :goto_e
    if-ge v4, v6, :cond_16

    .line 372
    .line 373
    mul-int v18, v5, v6

    .line 374
    .line 375
    add-int v18, v18, v6

    .line 376
    .line 377
    move/from16 p4, v4

    .line 378
    .line 379
    add-int v4, v18, p4

    .line 380
    .line 381
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v4

    .line 385
    check-cast v4, La/pj30;

    .line 386
    .line 387
    if-ltz v8, :cond_13

    .line 388
    .line 389
    const/16 v18, 0x1

    .line 390
    .line 391
    goto :goto_f

    .line 392
    :cond_13
    const/16 v18, 0x0

    .line 393
    .line 394
    :goto_f
    if-ltz v14, :cond_14

    .line 395
    .line 396
    const/16 v19, 0x1

    .line 397
    .line 398
    goto :goto_10

    .line 399
    :cond_14
    const/16 v19, 0x0

    .line 400
    .line 401
    :goto_10
    and-int v18, v18, v19

    .line 402
    .line 403
    if-nez v18, :cond_15

    .line 404
    .line 405
    invoke-static {v7}, La/zcx;->a(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    :cond_15
    move/from16 v18, v5

    .line 409
    .line 410
    move/from16 v19, v6

    .line 411
    .line 412
    invoke-static {v8, v8, v14, v14}, La/r4e;->h(IIII)J

    .line 413
    .line 414
    .line 415
    move-result-wide v5

    .line 416
    invoke-interface {v4, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 417
    .line 418
    .line 419
    move-result-object v4

    .line 420
    aput-object v4, v11, p4

    .line 421
    .line 422
    add-int/lit8 v4, p4, 0x1

    .line 423
    .line 424
    move/from16 v5, v18

    .line 425
    .line 426
    move/from16 v6, v19

    .line 427
    .line 428
    goto :goto_e

    .line 429
    :cond_16
    move/from16 v18, v5

    .line 430
    .line 431
    move/from16 v19, v6

    .line 432
    .line 433
    aput-object v11, v15, v18

    .line 434
    .line 435
    add-int/lit8 v5, v18, 0x1

    .line 436
    .line 437
    move/from16 v4, v17

    .line 438
    .line 439
    move/from16 v17, v19

    .line 440
    .line 441
    goto :goto_d

    .line 442
    :cond_17
    iget v11, v0, La/eam;->c:I

    .line 443
    .line 444
    if-lez v11, :cond_18

    .line 445
    .line 446
    add-int v2, v12, v13

    .line 447
    .line 448
    mul-int v4, v11, v14

    .line 449
    .line 450
    add-int/2addr v4, v2

    .line 451
    const/4 v2, 0x1

    .line 452
    invoke-static {v11, v2, v13, v4}, La/twn;->b(IIII)I

    .line 453
    .line 454
    .line 455
    move-result v2

    .line 456
    goto :goto_11

    .line 457
    :cond_18
    move v2, v12

    .line 458
    :goto_11
    new-instance v6, La/dam;

    .line 459
    .line 460
    iget v7, v0, La/eam;->b:I

    .line 461
    .line 462
    invoke-direct/range {v6 .. v15}, La/dam;-><init>(III[La/pu90;IIII[[La/pu90;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v1, v3, v2, v6}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    return-object v0

    .line 470
    nop

    .line 471
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
