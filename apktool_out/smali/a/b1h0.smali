.class public final synthetic La/b1h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/vhv0;

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:Lkotlin/jvm/functions/Function2;

.field public final synthetic e:B

.field public final synthetic f:Lkotlin/jvm/functions/Function2;

.field public final synthetic g:La/f1h0;

.field public final synthetic h:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(La/vhv0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ILkotlin/jvm/functions/Function2;La/f1h0;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/b1h0;->a:La/vhv0;

    iput-object p2, p0, La/b1h0;->b:Lkotlin/jvm/functions/Function2;

    iput-object p3, p0, La/b1h0;->c:Lkotlin/jvm/functions/Function2;

    iput-object p4, p0, La/b1h0;->d:Lkotlin/jvm/functions/Function2;

    iput-byte p5, p0, La/b1h0;->e:B

    iput-object p6, p0, La/b1h0;->f:Lkotlin/jvm/functions/Function2;

    iput-object p7, p0, La/b1h0;->g:La/f1h0;

    iput-object p8, p0, La/b1h0;->h:Lkotlin/jvm/functions/Function2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    check-cast v6, La/c5n0;

    .line 6
    .line 7
    move-object/from16 v1, p2

    .line 8
    .line 9
    check-cast v1, La/p4e;

    .line 10
    .line 11
    iget-wide v2, v1, La/p4e;->a:J

    .line 12
    .line 13
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget-wide v2, v1, La/p4e;->a:J

    .line 18
    .line 19
    invoke-static {v2, v3}, La/p4e;->h(J)I

    .line 20
    .line 21
    .line 22
    move-result v7

    .line 23
    iget-wide v8, v1, La/p4e;->a:J

    .line 24
    .line 25
    const/4 v13, 0x0

    .line 26
    const/16 v14, 0xa

    .line 27
    .line 28
    const/4 v10, 0x0

    .line 29
    const/4 v11, 0x0

    .line 30
    const/4 v12, 0x0

    .line 31
    invoke-static/range {v8 .. v14}, La/p4e;->b(JIIIII)J

    .line 32
    .line 33
    .line 34
    move-result-wide v1

    .line 35
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    iget-object v5, v0, La/b1h0;->a:La/vhv0;

    .line 40
    .line 41
    invoke-interface {v5, v6, v3}, La/vhv0;->a(La/w6k;La/k6z;)I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-interface {v5, v6, v8}, La/vhv0;->c(La/w6k;La/k6z;)I

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    invoke-interface {v5, v6}, La/vhv0;->b(La/w6k;)I

    .line 54
    .line 55
    .line 56
    move-result v9

    .line 57
    sget-object v10, La/i1h0;->a:La/i1h0;

    .line 58
    .line 59
    iget-object v11, v0, La/b1h0;->b:Lkotlin/jvm/functions/Function2;

    .line 60
    .line 61
    invoke-interface {v6, v10, v11}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-static {v10}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    check-cast v10, La/pj30;

    .line 70
    .line 71
    invoke-interface {v10, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 72
    .line 73
    .line 74
    move-result-object v10

    .line 75
    sget-object v11, La/i1h0;->c:La/i1h0;

    .line 76
    .line 77
    iget-object v12, v0, La/b1h0;->c:Lkotlin/jvm/functions/Function2;

    .line 78
    .line 79
    invoke-interface {v6, v11, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v11

    .line 87
    check-cast v11, La/pj30;

    .line 88
    .line 89
    neg-int v12, v3

    .line 90
    sub-int/2addr v12, v8

    .line 91
    neg-int v9, v9

    .line 92
    invoke-static {v12, v9, v1, v2}, La/r4e;->i(IIJ)J

    .line 93
    .line 94
    .line 95
    move-result-wide v13

    .line 96
    invoke-interface {v11, v13, v14}, La/pj30;->S(J)La/pu90;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    sget-object v13, La/i1h0;->d:La/i1h0;

    .line 101
    .line 102
    iget-object v14, v0, La/b1h0;->d:Lkotlin/jvm/functions/Function2;

    .line 103
    .line 104
    invoke-interface {v6, v13, v14}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v13

    .line 112
    check-cast v13, La/pj30;

    .line 113
    .line 114
    invoke-static {v12, v9, v1, v2}, La/r4e;->i(IIJ)J

    .line 115
    .line 116
    .line 117
    move-result-wide v14

    .line 118
    invoke-interface {v13, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    iget v12, v9, La/pu90;->a:I

    .line 123
    .line 124
    iget-byte v13, v0, La/b1h0;->e:B

    .line 125
    .line 126
    if-nez v12, :cond_0

    .line 127
    .line 128
    iget v14, v9, La/pu90;->b:I

    .line 129
    .line 130
    if-nez v14, :cond_0

    .line 131
    .line 132
    const/4 v3, 0x0

    .line 133
    goto :goto_3

    .line 134
    :cond_0
    iget v14, v9, La/pu90;->b:I

    .line 135
    .line 136
    if-nez v13, :cond_2

    .line 137
    .line 138
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    move/from16 v17, v3

    .line 143
    .line 144
    sget-object v3, La/k6z;->a:La/k6z;

    .line 145
    .line 146
    if-ne v15, v3, :cond_1

    .line 147
    .line 148
    const/high16 v3, 0x41800000    # 16.0f

    .line 149
    .line 150
    invoke-interface {v6, v3}, La/w6k;->T(F)I

    .line 151
    .line 152
    .line 153
    move-result v8

    .line 154
    :goto_0
    add-int v8, v8, v17

    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_1
    const/high16 v3, 0x41800000    # 16.0f

    .line 158
    .line 159
    invoke-interface {v6, v3}, La/w6k;->T(F)I

    .line 160
    .line 161
    .line 162
    move-result v15

    .line 163
    sub-int v3, v4, v15

    .line 164
    .line 165
    sub-int/2addr v3, v12

    .line 166
    sub-int v8, v3, v8

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_2
    move/from16 v17, v3

    .line 170
    .line 171
    const/4 v3, 0x2

    .line 172
    if-ne v13, v3, :cond_3

    .line 173
    .line 174
    goto :goto_1

    .line 175
    :cond_3
    const/4 v15, 0x3

    .line 176
    if-ne v13, v15, :cond_5

    .line 177
    .line 178
    :goto_1
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 179
    .line 180
    .line 181
    move-result-object v3

    .line 182
    sget-object v15, La/k6z;->a:La/k6z;

    .line 183
    .line 184
    if-ne v3, v15, :cond_4

    .line 185
    .line 186
    const/high16 v3, 0x41800000    # 16.0f

    .line 187
    .line 188
    invoke-interface {v6, v3}, La/w6k;->T(F)I

    .line 189
    .line 190
    .line 191
    move-result v15

    .line 192
    sub-int v15, v4, v15

    .line 193
    .line 194
    sub-int/2addr v15, v12

    .line 195
    sub-int v8, v15, v8

    .line 196
    .line 197
    goto :goto_2

    .line 198
    :cond_4
    const/high16 v3, 0x41800000    # 16.0f

    .line 199
    .line 200
    invoke-interface {v6, v3}, La/w6k;->T(F)I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    goto :goto_0

    .line 205
    :cond_5
    sub-int v12, v4, v12

    .line 206
    .line 207
    add-int v12, v12, v17

    .line 208
    .line 209
    sub-int/2addr v12, v8

    .line 210
    div-int/lit8 v8, v12, 0x2

    .line 211
    .line 212
    :goto_2
    new-instance v3, La/eld0;

    .line 213
    .line 214
    const/4 v12, 0x4

    .line 215
    invoke-direct {v3, v8, v14, v12}, La/eld0;-><init>(IIB)V

    .line 216
    .line 217
    .line 218
    :goto_3
    sget-object v8, La/i1h0;->e:La/i1h0;

    .line 219
    .line 220
    iget-object v12, v0, La/b1h0;->f:Lkotlin/jvm/functions/Function2;

    .line 221
    .line 222
    invoke-interface {v6, v8, v12}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v8

    .line 230
    check-cast v8, La/pj30;

    .line 231
    .line 232
    invoke-interface {v8, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 233
    .line 234
    .line 235
    move-result-object v8

    .line 236
    iget v12, v8, La/pu90;->a:I

    .line 237
    .line 238
    if-nez v12, :cond_6

    .line 239
    .line 240
    iget v12, v8, La/pu90;->b:I

    .line 241
    .line 242
    if-nez v12, :cond_6

    .line 243
    .line 244
    const/4 v12, 0x1

    .line 245
    goto :goto_4

    .line 246
    :cond_6
    const/4 v12, 0x0

    .line 247
    :goto_4
    if-eqz v3, :cond_9

    .line 248
    .line 249
    iget v15, v3, La/eld0;->c:I

    .line 250
    .line 251
    if-nez v12, :cond_7

    .line 252
    .line 253
    const/4 v14, 0x3

    .line 254
    if-ne v13, v14, :cond_8

    .line 255
    .line 256
    :cond_7
    const/high16 v14, 0x41800000    # 16.0f

    .line 257
    .line 258
    goto :goto_6

    .line 259
    :cond_8
    iget v13, v8, La/pu90;->b:I

    .line 260
    .line 261
    add-int/2addr v13, v15

    .line 262
    const/high16 v14, 0x41800000    # 16.0f

    .line 263
    .line 264
    invoke-interface {v6, v14}, La/w6k;->T(F)I

    .line 265
    .line 266
    .line 267
    move-result v14

    .line 268
    :goto_5
    add-int/2addr v14, v13

    .line 269
    goto :goto_7

    .line 270
    :goto_6
    invoke-interface {v6, v14}, La/w6k;->T(F)I

    .line 271
    .line 272
    .line 273
    move-result v13

    .line 274
    add-int/2addr v13, v15

    .line 275
    invoke-interface {v5, v6}, La/vhv0;->b(La/w6k;)I

    .line 276
    .line 277
    .line 278
    move-result v14

    .line 279
    goto :goto_5

    .line 280
    :goto_7
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v13

    .line 284
    goto :goto_8

    .line 285
    :cond_9
    const/4 v13, 0x0

    .line 286
    :goto_8
    iget v14, v11, La/pu90;->b:I

    .line 287
    .line 288
    if-eqz v14, :cond_d

    .line 289
    .line 290
    if-eqz v13, :cond_a

    .line 291
    .line 292
    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v15

    .line 296
    goto :goto_a

    .line 297
    :cond_a
    iget v15, v8, La/pu90;->b:I

    .line 298
    .line 299
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 300
    .line 301
    .line 302
    move-result-object v15

    .line 303
    if-nez v12, :cond_b

    .line 304
    .line 305
    goto :goto_9

    .line 306
    :cond_b
    const/4 v15, 0x0

    .line 307
    :goto_9
    if-eqz v15, :cond_c

    .line 308
    .line 309
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 310
    .line 311
    .line 312
    move-result v15

    .line 313
    goto :goto_a

    .line 314
    :cond_c
    invoke-interface {v5, v6}, La/vhv0;->b(La/w6k;)I

    .line 315
    .line 316
    .line 317
    move-result v15

    .line 318
    :goto_a
    add-int/2addr v14, v15

    .line 319
    goto :goto_b

    .line 320
    :cond_d
    const/4 v14, 0x0

    .line 321
    :goto_b
    new-instance v15, La/bgx;

    .line 322
    .line 323
    invoke-direct {v15, v5, v6}, La/bgx;-><init>(La/vhv0;La/w6k;)V

    .line 324
    .line 325
    .line 326
    move-object/from16 p1, v3

    .line 327
    .line 328
    iget v3, v10, La/pu90;->a:I

    .line 329
    .line 330
    if-nez v3, :cond_e

    .line 331
    .line 332
    iget v3, v10, La/pu90;->b:I

    .line 333
    .line 334
    if-nez v3, :cond_e

    .line 335
    .line 336
    invoke-virtual {v15}, La/bgx;->d()F

    .line 337
    .line 338
    .line 339
    move-result v3

    .line 340
    goto :goto_c

    .line 341
    :cond_e
    iget v3, v10, La/pu90;->b:I

    .line 342
    .line 343
    invoke-interface {v6, v3}, La/w6k;->r0(I)F

    .line 344
    .line 345
    .line 346
    move-result v3

    .line 347
    :goto_c
    if-eqz v12, :cond_f

    .line 348
    .line 349
    invoke-virtual {v15}, La/bgx;->a()F

    .line 350
    .line 351
    .line 352
    move-result v12

    .line 353
    :goto_d
    move/from16 p2, v4

    .line 354
    .line 355
    goto :goto_e

    .line 356
    :cond_f
    iget v12, v8, La/pu90;->b:I

    .line 357
    .line 358
    invoke-interface {v6, v12}, La/w6k;->r0(I)F

    .line 359
    .line 360
    .line 361
    move-result v12

    .line 362
    goto :goto_d

    .line 363
    :goto_e
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 364
    .line 365
    .line 366
    move-result-object v4

    .line 367
    invoke-static {v15, v4}, La/s5x0;->B(La/hh80;La/k6z;)F

    .line 368
    .line 369
    .line 370
    move-result v4

    .line 371
    move-object/from16 v16, v5

    .line 372
    .line 373
    invoke-interface {v6}, La/cnx;->getLayoutDirection()La/k6z;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    invoke-static {v15, v5}, La/s5x0;->A(La/hh80;La/k6z;)F

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    new-instance v15, La/lh80;

    .line 382
    .line 383
    invoke-direct {v15, v4, v3, v5, v12}, La/lh80;-><init>(FFFF)V

    .line 384
    .line 385
    .line 386
    iget-object v3, v0, La/b1h0;->g:La/f1h0;

    .line 387
    .line 388
    iget-object v3, v3, La/f1h0;->b:La/pz40;

    .line 389
    .line 390
    check-cast v3, La/hgk0;

    .line 391
    .line 392
    invoke-virtual {v3, v15}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 393
    .line 394
    .line 395
    sget-object v3, La/i1h0;->b:La/i1h0;

    .line 396
    .line 397
    iget-object v0, v0, La/b1h0;->h:Lkotlin/jvm/functions/Function2;

    .line 398
    .line 399
    invoke-interface {v6, v3, v0}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v0

    .line 407
    check-cast v0, La/pj30;

    .line 408
    .line 409
    invoke-interface {v0, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    new-instance v0, La/c1h0;

    .line 414
    .line 415
    move/from16 v4, p2

    .line 416
    .line 417
    move-object v2, v10

    .line 418
    move-object v3, v11

    .line 419
    move-object v12, v13

    .line 420
    move-object/from16 v5, v16

    .line 421
    .line 422
    move-object/from16 v10, p1

    .line 423
    .line 424
    move-object v11, v9

    .line 425
    move-object v9, v8

    .line 426
    move v8, v14

    .line 427
    invoke-direct/range {v0 .. v12}, La/c1h0;-><init>(La/pu90;La/pu90;La/pu90;ILa/vhv0;La/c5n0;IILa/pu90;La/eld0;La/pu90;Ljava/lang/Integer;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v6, v4, v7, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    return-object v0
.end method
