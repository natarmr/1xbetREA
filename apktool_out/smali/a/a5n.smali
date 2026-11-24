.class public final La/a5n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ow3;La/sw3;La/hh80;La/k6z;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/a5n;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/a5n;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/a5n;->e:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, La/a5n;->c:Ljava/lang/Object;

    .line 12
    .line 13
    iput-object p4, p0, La/a5n;->d:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(La/pz40;La/bk30;La/v3e;La/pz40;B)V
    .locals 0

    .line 16
    iput-byte p5, p0, La/a5n;->a:B

    iput-object p1, p0, La/a5n;->b:Ljava/lang/Object;

    iput-object p2, p0, La/a5n;->c:Ljava/lang/Object;

    iput-object p3, p0, La/a5n;->d:Ljava/lang/Object;

    iput-object p4, p0, La/a5n;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v7, p2

    .line 6
    .line 7
    iget-byte v2, v0, La/a5n;->a:B

    .line 8
    .line 9
    const/4 v9, 0x2

    .line 10
    const/4 v10, 0x3

    .line 11
    const/4 v11, 0x0

    .line 12
    const-wide v12, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/16 v14, 0x20

    .line 18
    .line 19
    iget-object v15, v0, La/a5n;->e:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v3, v0, La/a5n;->b:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v4, v0, La/a5n;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v0, v0, La/a5n;->c:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v2, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v20, v3

    .line 31
    .line 32
    check-cast v20, La/ow3;

    .line 33
    .line 34
    move-object v2, v4

    .line 35
    check-cast v2, La/k6z;

    .line 36
    .line 37
    move-object v3, v0

    .line 38
    check-cast v3, La/hh80;

    .line 39
    .line 40
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-interface {v7}, Ljava/util/List;->isEmpty()Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_0

    .line 48
    .line 49
    new-instance v0, La/d4u0;

    .line 50
    .line 51
    const/4 v2, 0x7

    .line 52
    invoke-direct {v0, v2}, La/d4u0;-><init>(B)V

    .line 53
    .line 54
    .line 55
    invoke-static {v1, v11, v11, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    invoke-interface/range {v20 .. v20}, La/ow3;->a()F

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 66
    .line 67
    .line 68
    move-result v22

    .line 69
    check-cast v15, La/sw3;

    .line 70
    .line 71
    invoke-interface {v15}, La/sw3;->a()F

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    invoke-interface {v1, v5}, La/w6k;->T(F)I

    .line 76
    .line 77
    .line 78
    move-result v19

    .line 79
    mul-int v9, v9, v22

    .line 80
    .line 81
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    invoke-interface {v3, v2}, La/hh80;->b(La/k6z;)F

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    sub-int/2addr v5, v6

    .line 94
    invoke-interface {v3, v2}, La/hh80;->c(La/k6z;)F

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    invoke-interface {v1, v2}, La/w6k;->T(F)I

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    sub-int/2addr v5, v2

    .line 103
    sub-int/2addr v5, v9

    .line 104
    div-int/lit8 v14, v5, 0x3

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    const/16 v18, 0xc

    .line 109
    .line 110
    const/16 v16, 0x0

    .line 111
    .line 112
    move v15, v14

    .line 113
    move-wide/from16 v12, p3

    .line 114
    .line 115
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 116
    .line 117
    .line 118
    move-result-wide v5

    .line 119
    new-instance v2, Ljava/util/ArrayList;

    .line 120
    .line 121
    const/16 v8, 0xa

    .line 122
    .line 123
    invoke-static {v7, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 128
    .line 129
    .line 130
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v7

    .line 134
    :goto_0
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v8

    .line 138
    if-eqz v8, :cond_1

    .line 139
    .line 140
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v8

    .line 144
    check-cast v8, La/pj30;

    .line 145
    .line 146
    invoke-interface {v8, v5, v6}, La/pj30;->S(J)La/pu90;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 151
    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_1
    new-array v5, v10, [I

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    move v7, v11

    .line 161
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v8

    .line 165
    if-eqz v8, :cond_4

    .line 166
    .line 167
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v8

    .line 171
    add-int/lit8 v9, v7, 0x1

    .line 172
    .line 173
    if-ltz v7, :cond_3

    .line 174
    .line 175
    check-cast v8, La/pu90;

    .line 176
    .line 177
    rem-int/lit8 v12, v7, 0x3

    .line 178
    .line 179
    if-lt v7, v10, :cond_2

    .line 180
    .line 181
    aget v7, v5, v12

    .line 182
    .line 183
    add-int v7, v7, v19

    .line 184
    .line 185
    aput v7, v5, v12

    .line 186
    .line 187
    :cond_2
    aget v7, v5, v12

    .line 188
    .line 189
    iget v8, v8, La/pu90;->b:I

    .line 190
    .line 191
    add-int/2addr v7, v8

    .line 192
    aput v7, v5, v12

    .line 193
    .line 194
    move v7, v9

    .line 195
    goto :goto_1

    .line 196
    :cond_3
    invoke-static {}, La/q3d;->p()V

    .line 197
    .line 198
    .line 199
    const/4 v0, 0x0

    .line 200
    throw v0

    .line 201
    :cond_4
    invoke-static {v5}, La/tx3;->R([I)Ljava/lang/Integer;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    if-eqz v5, :cond_5

    .line 206
    .line 207
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 208
    .line 209
    .line 210
    move-result v5

    .line 211
    goto :goto_2

    .line 212
    :cond_5
    move v5, v11

    .line 213
    :goto_2
    new-array v6, v10, [I

    .line 214
    .line 215
    :goto_3
    if-ge v11, v10, :cond_6

    .line 216
    .line 217
    invoke-interface {v3}, La/hh80;->d()F

    .line 218
    .line 219
    .line 220
    move-result v7

    .line 221
    invoke-interface {v1, v7}, La/w6k;->T(F)I

    .line 222
    .line 223
    .line 224
    move-result v7

    .line 225
    aput v7, v6, v11

    .line 226
    .line 227
    add-int/lit8 v11, v11, 0x1

    .line 228
    .line 229
    goto :goto_3

    .line 230
    :cond_6
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 231
    .line 232
    .line 233
    move-result v7

    .line 234
    invoke-interface {v3}, La/hh80;->d()F

    .line 235
    .line 236
    .line 237
    move-result v8

    .line 238
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 239
    .line 240
    .line 241
    move-result v8

    .line 242
    add-int/2addr v8, v5

    .line 243
    invoke-interface {v3}, La/hh80;->a()F

    .line 244
    .line 245
    .line 246
    move-result v3

    .line 247
    invoke-interface {v1, v3}, La/w6k;->T(F)I

    .line 248
    .line 249
    .line 250
    move-result v3

    .line 251
    add-int/2addr v3, v8

    .line 252
    move-object/from16 v25, v0

    .line 253
    .line 254
    check-cast v25, La/hh80;

    .line 255
    .line 256
    move-object/from16 v26, v4

    .line 257
    .line 258
    check-cast v26, La/k6z;

    .line 259
    .line 260
    new-instance v16, La/jcu0;

    .line 261
    .line 262
    move-wide/from16 v23, p3

    .line 263
    .line 264
    move-object/from16 v17, v2

    .line 265
    .line 266
    move-object/from16 v18, v6

    .line 267
    .line 268
    move/from16 v21, v14

    .line 269
    .line 270
    invoke-direct/range {v16 .. v26}, La/jcu0;-><init>(Ljava/util/ArrayList;[IILa/ow3;IIJLa/hh80;La/k6z;)V

    .line 271
    .line 272
    .line 273
    move-object/from16 v0, v16

    .line 274
    .line 275
    invoke-static {v1, v7, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    :goto_4
    return-object v0

    .line 280
    :pswitch_0
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 281
    .line 282
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 283
    .line 284
    .line 285
    check-cast v3, La/pz40;

    .line 286
    .line 287
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-object v2, v0

    .line 291
    check-cast v2, La/bk30;

    .line 292
    .line 293
    invoke-interface {v1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 294
    .line 295
    .line 296
    move-result-object v5

    .line 297
    move-object v6, v4

    .line 298
    check-cast v6, La/v3e;

    .line 299
    .line 300
    move-wide/from16 v3, p3

    .line 301
    .line 302
    invoke-virtual/range {v2 .. v8}, La/bk30;->f(JLa/k6z;La/s3e;Ljava/util/List;Ljava/util/LinkedHashMap;)J

    .line 303
    .line 304
    .line 305
    move-result-wide v2

    .line 306
    check-cast v15, La/pz40;

    .line 307
    .line 308
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    shr-long v4, v2, v14

    .line 312
    .line 313
    long-to-int v4, v4

    .line 314
    and-long/2addr v2, v12

    .line 315
    long-to-int v2, v2

    .line 316
    new-instance v3, La/z4n;

    .line 317
    .line 318
    check-cast v0, La/bk30;

    .line 319
    .line 320
    invoke-direct {v3, v0, v7, v8, v10}, La/z4n;-><init>(La/bk30;Ljava/util/List;Ljava/util/LinkedHashMap;B)V

    .line 321
    .line 322
    .line 323
    invoke-static {v1, v4, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0

    .line 328
    :pswitch_1
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 329
    .line 330
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 331
    .line 332
    .line 333
    check-cast v3, La/pz40;

    .line 334
    .line 335
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 336
    .line 337
    .line 338
    move-object v2, v0

    .line 339
    check-cast v2, La/bk30;

    .line 340
    .line 341
    invoke-interface {v1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 342
    .line 343
    .line 344
    move-result-object v5

    .line 345
    move-object v6, v4

    .line 346
    check-cast v6, La/v3e;

    .line 347
    .line 348
    move-wide/from16 v3, p3

    .line 349
    .line 350
    invoke-virtual/range {v2 .. v8}, La/bk30;->f(JLa/k6z;La/s3e;Ljava/util/List;Ljava/util/LinkedHashMap;)J

    .line 351
    .line 352
    .line 353
    move-result-wide v2

    .line 354
    check-cast v15, La/pz40;

    .line 355
    .line 356
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    shr-long v4, v2, v14

    .line 360
    .line 361
    long-to-int v4, v4

    .line 362
    and-long/2addr v2, v12

    .line 363
    long-to-int v2, v2

    .line 364
    new-instance v3, La/z4n;

    .line 365
    .line 366
    check-cast v0, La/bk30;

    .line 367
    .line 368
    invoke-direct {v3, v0, v7, v8, v9}, La/z4n;-><init>(La/bk30;Ljava/util/List;Ljava/util/LinkedHashMap;B)V

    .line 369
    .line 370
    .line 371
    invoke-static {v1, v4, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    return-object v0

    .line 376
    :pswitch_2
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 377
    .line 378
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 379
    .line 380
    .line 381
    check-cast v3, La/pz40;

    .line 382
    .line 383
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-object v2, v0

    .line 387
    check-cast v2, La/bk30;

    .line 388
    .line 389
    invoke-interface {v1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 390
    .line 391
    .line 392
    move-result-object v5

    .line 393
    move-object v6, v4

    .line 394
    check-cast v6, La/v3e;

    .line 395
    .line 396
    move-wide/from16 v3, p3

    .line 397
    .line 398
    invoke-virtual/range {v2 .. v8}, La/bk30;->f(JLa/k6z;La/s3e;Ljava/util/List;Ljava/util/LinkedHashMap;)J

    .line 399
    .line 400
    .line 401
    move-result-wide v2

    .line 402
    check-cast v15, La/pz40;

    .line 403
    .line 404
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    shr-long v4, v2, v14

    .line 408
    .line 409
    long-to-int v4, v4

    .line 410
    and-long/2addr v2, v12

    .line 411
    long-to-int v2, v2

    .line 412
    new-instance v3, La/z4n;

    .line 413
    .line 414
    check-cast v0, La/bk30;

    .line 415
    .line 416
    const/4 v5, 0x1

    .line 417
    invoke-direct {v3, v0, v7, v8, v5}, La/z4n;-><init>(La/bk30;Ljava/util/List;Ljava/util/LinkedHashMap;B)V

    .line 418
    .line 419
    .line 420
    invoke-static {v1, v4, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 421
    .line 422
    .line 423
    move-result-object v0

    .line 424
    return-object v0

    .line 425
    :pswitch_3
    new-instance v8, Ljava/util/LinkedHashMap;

    .line 426
    .line 427
    invoke-direct {v8}, Ljava/util/LinkedHashMap;-><init>()V

    .line 428
    .line 429
    .line 430
    check-cast v3, La/pz40;

    .line 431
    .line 432
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-object v2, v0

    .line 436
    check-cast v2, La/bk30;

    .line 437
    .line 438
    invoke-interface {v1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    move-object v6, v4

    .line 443
    check-cast v6, La/v3e;

    .line 444
    .line 445
    move-wide/from16 v3, p3

    .line 446
    .line 447
    invoke-virtual/range {v2 .. v8}, La/bk30;->f(JLa/k6z;La/s3e;Ljava/util/List;Ljava/util/LinkedHashMap;)J

    .line 448
    .line 449
    .line 450
    move-result-wide v2

    .line 451
    check-cast v15, La/pz40;

    .line 452
    .line 453
    invoke-interface {v15}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 454
    .line 455
    .line 456
    shr-long v4, v2, v14

    .line 457
    .line 458
    long-to-int v4, v4

    .line 459
    and-long/2addr v2, v12

    .line 460
    long-to-int v2, v2

    .line 461
    new-instance v3, La/z4n;

    .line 462
    .line 463
    check-cast v0, La/bk30;

    .line 464
    .line 465
    invoke-direct {v3, v0, v7, v8, v11}, La/z4n;-><init>(La/bk30;Ljava/util/List;Ljava/util/LinkedHashMap;B)V

    .line 466
    .line 467
    .line 468
    invoke-static {v1, v4, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    return-object v0

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
