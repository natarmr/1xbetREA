.class public final La/i2d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:La/f3d;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;

.field public final synthetic e:Z


# direct methods
.method public constructor <init>(FLa/f3d;La/pz40;La/pz40;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/i2d;->a:F

    .line 5
    .line 6
    iput-object p2, p0, La/i2d;->b:La/f3d;

    .line 7
    .line 8
    iput-object p3, p0, La/i2d;->c:La/pz40;

    .line 9
    .line 10
    iput-object p4, p0, La/i2d;->d:La/pz40;

    .line 11
    .line 12
    iput-boolean p5, p0, La/i2d;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    new-instance v0, La/e6c;

    .line 16
    .line 17
    const/16 v2, 0x1b

    .line 18
    .line 19
    invoke-direct {v0, v2}, La/e6c;-><init>(B)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v3, v3, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    return-object v0

    .line 27
    :cond_0
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    const-string v5, "BACKGROUND_KEY"

    .line 36
    .line 37
    const/4 v6, 0x0

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    move-object v7, v4

    .line 45
    check-cast v7, La/pj30;

    .line 46
    .line 47
    invoke-static {v7}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v7

    .line 51
    invoke-static {v7, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_2
    move-object v4, v6

    .line 59
    :goto_0
    check-cast v4, La/pj30;

    .line 60
    .line 61
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v7

    .line 69
    const-string v8, "TOOLBAR_KEY"

    .line 70
    .line 71
    if-eqz v7, :cond_4

    .line 72
    .line 73
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v7

    .line 77
    move-object v9, v7

    .line 78
    check-cast v9, La/pj30;

    .line 79
    .line 80
    invoke-static {v9}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v9

    .line 88
    if-eqz v9, :cond_3

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_4
    move-object v7, v6

    .line 92
    :goto_1
    check-cast v7, La/pj30;

    .line 93
    .line 94
    if-eqz v4, :cond_6

    .line 95
    .line 96
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-ltz v2, :cond_5

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    const-string v9, "width must be >= 0"

    .line 104
    .line 105
    invoke-static {v9}, La/zcx;->a(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    :goto_2
    const v9, 0x7fffffff

    .line 109
    .line 110
    .line 111
    invoke-static {v2, v2, v3, v9}, La/r4e;->h(IIII)J

    .line 112
    .line 113
    .line 114
    move-result-wide v9

    .line 115
    invoke-interface {v4, v9, v10}, La/pj30;->S(J)La/pu90;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    goto :goto_3

    .line 120
    :cond_6
    move-object v2, v6

    .line 121
    :goto_3
    if-eqz v7, :cond_7

    .line 122
    .line 123
    const/4 v14, 0x0

    .line 124
    const/16 v15, 0xb

    .line 125
    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v12, 0x0

    .line 128
    const/4 v13, 0x0

    .line 129
    move-wide/from16 v9, p3

    .line 130
    .line 131
    invoke-static/range {v9 .. v15}, La/p4e;->b(JIIIII)J

    .line 132
    .line 133
    .line 134
    move-result-wide v11

    .line 135
    invoke-interface {v7, v11, v12}, La/pj30;->S(J)La/pu90;

    .line 136
    .line 137
    .line 138
    move-result-object v6

    .line 139
    :cond_7
    if-eqz v6, :cond_8

    .line 140
    .line 141
    iget v4, v6, La/pu90;->b:I

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    move v4, v3

    .line 145
    :goto_4
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    iget-object v7, v0, La/i2d;->c:La/pz40;

    .line 150
    .line 151
    invoke-interface {v7, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget v4, v0, La/i2d;->a:F

    .line 155
    .line 156
    invoke-interface {v1, v4}, La/w6k;->T(F)I

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    new-instance v9, Ljava/util/ArrayList;

    .line 161
    .line 162
    invoke-interface/range {p2 .. p2}, Ljava/util/List;->size()I

    .line 163
    .line 164
    .line 165
    move-result v10

    .line 166
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 167
    .line 168
    .line 169
    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    move v11, v3

    .line 174
    :goto_5
    if-ge v11, v10, :cond_a

    .line 175
    .line 176
    move-object/from16 v12, p2

    .line 177
    .line 178
    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v13

    .line 182
    move-object v14, v13

    .line 183
    check-cast v14, La/pj30;

    .line 184
    .line 185
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    invoke-static {v15, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v15

    .line 193
    if-nez v15, :cond_9

    .line 194
    .line 195
    invoke-static {v14}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v14

    .line 199
    invoke-static {v14, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v14

    .line 203
    if-nez v14, :cond_9

    .line 204
    .line 205
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    :cond_9
    add-int/lit8 v11, v11, 0x1

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_a
    new-instance v5, Ljava/util/ArrayList;

    .line 212
    .line 213
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 214
    .line 215
    .line 216
    move-result v8

    .line 217
    invoke-direct {v5, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 218
    .line 219
    .line 220
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 221
    .line 222
    .line 223
    move-result v8

    .line 224
    move v10, v3

    .line 225
    :goto_6
    iget-object v11, v0, La/i2d;->d:La/pz40;

    .line 226
    .line 227
    if-ge v10, v8, :cond_10

    .line 228
    .line 229
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v12

    .line 233
    check-cast v12, La/pj30;

    .line 234
    .line 235
    invoke-static {v12}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v13

    .line 239
    const-string v14, "COLLAPSING_HEADER_KEY"

    .line 240
    .line 241
    invoke-static {v13, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    if-eqz v13, :cond_f

    .line 246
    .line 247
    if-eqz v2, :cond_b

    .line 248
    .line 249
    iget v13, v2, La/pu90;->b:I

    .line 250
    .line 251
    goto :goto_7

    .line 252
    :cond_b
    move v13, v3

    .line 253
    :goto_7
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v14

    .line 257
    check-cast v14, Ljava/lang/Number;

    .line 258
    .line 259
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 260
    .line 261
    .line 262
    move-result v14

    .line 263
    sub-int/2addr v13, v14

    .line 264
    sub-int/2addr v13, v4

    .line 265
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 266
    .line 267
    .line 268
    move-result v14

    .line 269
    const/4 v15, 0x1

    .line 270
    if-ltz v14, :cond_c

    .line 271
    .line 272
    move/from16 v16, v15

    .line 273
    .line 274
    goto :goto_8

    .line 275
    :cond_c
    move/from16 v16, v3

    .line 276
    .line 277
    :goto_8
    if-ltz v13, :cond_d

    .line 278
    .line 279
    goto :goto_9

    .line 280
    :cond_d
    move v15, v3

    .line 281
    :goto_9
    and-int v15, v16, v15

    .line 282
    .line 283
    if-nez v15, :cond_e

    .line 284
    .line 285
    const-string v15, "width and height must be >= 0"

    .line 286
    .line 287
    invoke-static {v15}, La/zcx;->a(Ljava/lang/String;)V

    .line 288
    .line 289
    .line 290
    :cond_e
    invoke-static {v14, v14, v13, v13}, La/r4e;->h(IIII)J

    .line 291
    .line 292
    .line 293
    move-result-wide v13

    .line 294
    invoke-interface {v12, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 295
    .line 296
    .line 297
    move-result-object v12

    .line 298
    iget v13, v12, La/pu90;->b:I

    .line 299
    .line 300
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v13

    .line 304
    invoke-interface {v11, v13}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 305
    .line 306
    .line 307
    move/from16 v20, v4

    .line 308
    .line 309
    goto :goto_a

    .line 310
    :cond_f
    const/16 v18, 0x0

    .line 311
    .line 312
    const/16 v19, 0xb

    .line 313
    .line 314
    const/4 v15, 0x0

    .line 315
    const/16 v16, 0x0

    .line 316
    .line 317
    const/16 v17, 0x0

    .line 318
    .line 319
    move-wide/from16 v13, p3

    .line 320
    .line 321
    move/from16 v20, v4

    .line 322
    .line 323
    invoke-static/range {v13 .. v19}, La/p4e;->b(JIIIII)J

    .line 324
    .line 325
    .line 326
    move-result-wide v3

    .line 327
    invoke-interface {v12, v3, v4}, La/pj30;->S(J)La/pu90;

    .line 328
    .line 329
    .line 330
    move-result-object v12

    .line 331
    :goto_a
    invoke-virtual {v5, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    add-int/lit8 v10, v10, 0x1

    .line 335
    .line 336
    move/from16 v4, v20

    .line 337
    .line 338
    const/4 v3, 0x0

    .line 339
    goto :goto_6

    .line 340
    :cond_10
    move/from16 v20, v4

    .line 341
    .line 342
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v3

    .line 346
    check-cast v3, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 349
    .line 350
    .line 351
    move-result v3

    .line 352
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    check-cast v4, Ljava/lang/Number;

    .line 357
    .line 358
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    add-int/2addr v4, v3

    .line 363
    add-int v4, v4, v20

    .line 364
    .line 365
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    if-eqz v2, :cond_11

    .line 370
    .line 371
    invoke-virtual {v3, v2}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    :cond_11
    if-eqz v6, :cond_12

    .line 375
    .line 376
    invoke-virtual {v3, v6}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    :cond_12
    invoke-virtual {v3, v5}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 380
    .line 381
    .line 382
    invoke-static {v3}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v3

    .line 390
    check-cast v3, Ljava/lang/Number;

    .line 391
    .line 392
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    int-to-float v3, v3

    .line 397
    iget-object v10, v0, La/i2d;->b:La/f3d;

    .line 398
    .line 399
    invoke-virtual {v10, v3}, La/f3d;->f(F)V

    .line 400
    .line 401
    .line 402
    iget-object v3, v10, La/f3d;->a:La/agk0;

    .line 403
    .line 404
    invoke-virtual {v3}, La/agk0;->l()F

    .line 405
    .line 406
    .line 407
    move-result v3

    .line 408
    invoke-static {v3}, La/si30;->b(F)I

    .line 409
    .line 410
    .line 411
    move-result v3

    .line 412
    sub-int/2addr v4, v3

    .line 413
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    check-cast v3, Ljava/lang/Number;

    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 420
    .line 421
    .line 422
    move-result v3

    .line 423
    if-ge v4, v3, :cond_13

    .line 424
    .line 425
    move v4, v3

    .line 426
    :cond_13
    iget v3, v10, La/f3d;->i:I

    .line 427
    .line 428
    if-gez v3, :cond_14

    .line 429
    .line 430
    neg-int v4, v3

    .line 431
    :cond_14
    iput v4, v10, La/f3d;->i:I

    .line 432
    .line 433
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    new-instance v9, La/t13;

    .line 438
    .line 439
    const/4 v14, 0x3

    .line 440
    iget-boolean v12, v0, La/i2d;->e:Z

    .line 441
    .line 442
    move-object v11, v2

    .line 443
    move-object v13, v7

    .line 444
    invoke-direct/range {v9 .. v14}, La/t13;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;B)V

    .line 445
    .line 446
    .line 447
    invoke-static {v1, v3, v4, v9}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    return-object v0
.end method
