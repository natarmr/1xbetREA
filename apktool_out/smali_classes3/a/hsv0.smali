.class public final La/hsv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/fwv0;

.field public final b:La/jvv0;

.field public c:La/u950;

.field public final d:Ljava/util/ArrayList;

.field public final e:La/wzu0;

.field public final f:La/gsv0;


# direct methods
.method public constructor <init>(La/fwv0;La/jvv0;)V
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/hsv0;->a:La/fwv0;

    .line 11
    .line 12
    iput-object p2, p0, La/hsv0;->b:La/jvv0;

    .line 13
    .line 14
    new-instance p1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/hsv0;->d:Ljava/util/ArrayList;

    .line 20
    .line 21
    new-instance v0, La/wzu0;

    .line 22
    .line 23
    const/4 v6, 0x0

    .line 24
    const/16 v7, 0x11

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    const-class v3, La/hsv0;

    .line 28
    .line 29
    const-string v4, "dismiss"

    .line 30
    .line 31
    const-string v5, "dismiss$navigation(Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/XBottomSheetRoute;)V"

    .line 32
    .line 33
    move-object v2, p0

    .line 34
    invoke-direct/range {v0 .. v7}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 35
    .line 36
    .line 37
    iput-object v0, v2, La/hsv0;->e:La/wzu0;

    .line 38
    .line 39
    new-instance p0, La/gsv0;

    .line 40
    .line 41
    invoke-direct {p0, v2}, La/gsv0;-><init>(La/hsv0;)V

    .line 42
    .line 43
    .line 44
    iput-object p0, v2, La/hsv0;->f:La/gsv0;

    .line 45
    .line 46
    return-void
.end method


# virtual methods
.method public final a(La/mm40;Ljava/util/Set;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v13, p3

    .line 6
    .line 7
    move/from16 v15, p4

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v2, -0x6c88a1dd

    .line 13
    .line 14
    .line 15
    invoke-virtual {v13, v2}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    or-int/lit8 v2, v15, 0x6

    .line 19
    .line 20
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/16 v3, 0x20

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/16 v3, 0x10

    .line 30
    .line 31
    :goto_0
    or-int/2addr v2, v3

    .line 32
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    const/16 v8, 0x100

    .line 37
    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    move v3, v8

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v3, 0x80

    .line 43
    .line 44
    :goto_1
    or-int/2addr v2, v3

    .line 45
    and-int/lit16 v3, v2, 0x93

    .line 46
    .line 47
    const/16 v4, 0x92

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/4 v10, 0x1

    .line 51
    if-eq v3, v4, :cond_2

    .line 52
    .line 53
    move v3, v10

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    move v3, v9

    .line 56
    :goto_2
    and-int/lit8 v4, v2, 0x1

    .line 57
    .line 58
    invoke-virtual {v13, v4, v3}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_1b

    .line 63
    .line 64
    shr-int/lit8 v3, v2, 0x3

    .line 65
    .line 66
    and-int/lit8 v11, v3, 0xe

    .line 67
    .line 68
    xor-int/lit8 v4, v11, 0x6

    .line 69
    .line 70
    const/4 v5, 0x4

    .line 71
    if-le v4, v5, :cond_3

    .line 72
    .line 73
    invoke-virtual {v13, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_4

    .line 78
    .line 79
    :cond_3
    and-int/lit8 v3, v3, 0x6

    .line 80
    .line 81
    if-ne v3, v5, :cond_5

    .line 82
    .line 83
    :cond_4
    move v3, v10

    .line 84
    goto :goto_3

    .line 85
    :cond_5
    move v3, v9

    .line 86
    :goto_3
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    sget-object v12, La/ukd;->a:La/cl5;

    .line 91
    .line 92
    if-nez v3, :cond_6

    .line 93
    .line 94
    if-ne v4, v12, :cond_7

    .line 95
    .line 96
    :cond_6
    new-instance v3, La/qb50;

    .line 97
    .line 98
    invoke-direct {v3, v1, v10}, La/qb50;-><init>(Ljava/util/Set;B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, La/szg0;->a(Lkotlin/jvm/functions/Function1;)La/rzg0;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_7
    check-cast v4, La/rzg0;

    .line 109
    .line 110
    new-array v3, v10, [La/rb50;

    .line 111
    .line 112
    sget-object v5, La/kwv0;->INSTANCE:La/kwv0;

    .line 113
    .line 114
    aput-object v5, v3, v9

    .line 115
    .line 116
    invoke-static {v4, v3, v13}, La/c9x;->H(La/rzg0;[La/rb50;La/fet;)La/u950;

    .line 117
    .line 118
    .line 119
    move-result-object v14

    .line 120
    and-int/lit16 v2, v2, 0x380

    .line 121
    .line 122
    if-ne v2, v8, :cond_8

    .line 123
    .line 124
    move v3, v10

    .line 125
    goto :goto_4

    .line 126
    :cond_8
    move v3, v9

    .line 127
    :goto_4
    invoke-virtual {v13, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    or-int/2addr v3, v4

    .line 132
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-nez v3, :cond_9

    .line 137
    .line 138
    if-ne v4, v12, :cond_a

    .line 139
    .line 140
    :cond_9
    new-instance v4, La/zfv0;

    .line 141
    .line 142
    const/16 v3, 0xd

    .line 143
    .line 144
    invoke-direct {v4, v0, v14, v3}, La/zfv0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v13, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 151
    .line 152
    invoke-static {v14, v4, v13}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 153
    .line 154
    .line 155
    iget-object v3, v0, La/hsv0;->b:La/jvv0;

    .line 156
    .line 157
    move v4, v2

    .line 158
    iget-object v2, v3, La/jvv0;->c:La/gmq;

    .line 159
    .line 160
    iget-object v3, v3, La/jvv0;->a:La/p7m0;

    .line 161
    .line 162
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    check-cast v3, La/gvv0;

    .line 167
    .line 168
    iget-object v3, v3, La/gvv0;->c:La/kvv0;

    .line 169
    .line 170
    const/16 v6, 0x40

    .line 171
    .line 172
    const/16 v7, 0xe

    .line 173
    .line 174
    move v5, v4

    .line 175
    const/4 v4, 0x0

    .line 176
    move-object/from16 v24, v13

    .line 177
    .line 178
    move v13, v5

    .line 179
    move-object/from16 v5, v24

    .line 180
    .line 181
    invoke-static/range {v2 .. v7}, La/gkb;->O(La/gmq;Ljava/lang/Object;La/s7g;La/fet;II)La/pz40;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    if-ne v3, v12, :cond_b

    .line 190
    .line 191
    new-instance v3, La/ejv0;

    .line 192
    .line 193
    const/16 v4, 0xf

    .line 194
    .line 195
    invoke-direct {v3, v4}, La/ejv0;-><init>(B)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    :cond_b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 202
    .line 203
    or-int/lit8 v4, v11, 0x30

    .line 204
    .line 205
    invoke-static {v1, v3, v5, v4, v9}, La/mrv;->n0(Ljava/util/Set;Lkotlin/jvm/functions/Function1;La/fet;II)Lkotlin/jvm/functions/Function1;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-virtual {v5, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v4

    .line 213
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    if-nez v4, :cond_c

    .line 218
    .line 219
    if-ne v6, v12, :cond_d

    .line 220
    .line 221
    :cond_c
    new-instance v6, La/szu0;

    .line 222
    .line 223
    const/16 v4, 0xb

    .line 224
    .line 225
    invoke-direct {v6, v3, v4}, La/szu0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 232
    .line 233
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v3

    .line 237
    if-ne v3, v12, :cond_e

    .line 238
    .line 239
    new-instance v3, La/nwv0;

    .line 240
    .line 241
    invoke-direct {v3}, La/nwv0;-><init>()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v5, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_e
    check-cast v3, La/nwv0;

    .line 248
    .line 249
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v2

    .line 253
    check-cast v2, La/kvv0;

    .line 254
    .line 255
    iget-object v4, v0, La/hsv0;->b:La/jvv0;

    .line 256
    .line 257
    invoke-virtual {v5, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 258
    .line 259
    .line 260
    move-result v7

    .line 261
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v11

    .line 265
    if-nez v7, :cond_f

    .line 266
    .line 267
    if-ne v11, v12, :cond_10

    .line 268
    .line 269
    :cond_f
    new-instance v16, La/wzu0;

    .line 270
    .line 271
    const/16 v22, 0x0

    .line 272
    .line 273
    const/16 v23, 0x10

    .line 274
    .line 275
    const/16 v17, 0x1

    .line 276
    .line 277
    const-class v19, La/jvv0;

    .line 278
    .line 279
    const-string v20, "ownerOf"

    .line 280
    .line 281
    const-string v21, "ownerOf$navigation(Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/XBottomSheetRoute;)Lorg/xplatform/core/navigation/compose_nav/bottom_sheet/host/XBottomSheetOwnerToken;"

    .line 282
    .line 283
    move-object/from16 v18, v4

    .line 284
    .line 285
    invoke-direct/range {v16 .. v23}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 286
    .line 287
    .line 288
    move-object/from16 v11, v16

    .line 289
    .line 290
    invoke-virtual {v5, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_10
    check-cast v11, La/jhy;

    .line 294
    .line 295
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 296
    .line 297
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    iget-object v4, v0, La/hsv0;->e:La/wzu0;

    .line 304
    .line 305
    invoke-virtual {v5, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v7

    .line 309
    invoke-virtual {v5, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v16

    .line 313
    or-int v7, v7, v16

    .line 314
    .line 315
    move/from16 v16, v10

    .line 316
    .line 317
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    if-nez v7, :cond_11

    .line 322
    .line 323
    if-ne v10, v12, :cond_12

    .line 324
    .line 325
    :cond_11
    new-instance v10, La/owv0;

    .line 326
    .line 327
    invoke-direct {v10, v3, v11, v2, v4}, La/owv0;-><init>(La/nwv0;Lkotlin/jvm/functions/Function1;La/kvv0;La/wzu0;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v5, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 331
    .line 332
    .line 333
    :cond_12
    check-cast v10, La/owv0;

    .line 334
    .line 335
    invoke-virtual {v5, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 336
    .line 337
    .line 338
    move-result v2

    .line 339
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v4

    .line 343
    const/4 v7, 0x2

    .line 344
    if-nez v2, :cond_13

    .line 345
    .line 346
    if-ne v4, v12, :cond_14

    .line 347
    .line 348
    :cond_13
    new-instance v2, La/mjk;

    .line 349
    .line 350
    invoke-direct {v2, v9}, La/mjk;-><init>(B)V

    .line 351
    .line 352
    .line 353
    new-array v4, v7, [La/i2h0;

    .line 354
    .line 355
    aput-object v10, v4, v9

    .line 356
    .line 357
    aput-object v2, v4, v16

    .line 358
    .line 359
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 360
    .line 361
    .line 362
    move-result-object v4

    .line 363
    invoke-virtual {v5, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 364
    .line 365
    .line 366
    :cond_14
    check-cast v4, Ljava/util/List;

    .line 367
    .line 368
    invoke-static {v5}, La/u7x;->G(La/fet;)La/dzg0;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-static {v5}, La/a4n0;->k(La/fet;)La/qiu0;

    .line 373
    .line 374
    .line 375
    move-result-object v10

    .line 376
    new-array v7, v7, [La/pb50;

    .line 377
    .line 378
    aput-object v2, v7, v9

    .line 379
    .line 380
    aput-object v10, v7, v16

    .line 381
    .line 382
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 383
    .line 384
    .line 385
    move-result-object v2

    .line 386
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 387
    .line 388
    invoke-static {v7, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 389
    .line 390
    .line 391
    move-result-object v7

    .line 392
    iget-wide v10, v5, La/fet;->T:J

    .line 393
    .line 394
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 395
    .line 396
    .line 397
    move-result v10

    .line 398
    invoke-virtual {v5}, La/fet;->m()La/bh90;

    .line 399
    .line 400
    .line 401
    move-result-object v11

    .line 402
    move-object/from16 p1, v3

    .line 403
    .line 404
    sget-object v3, La/jm40;->b:La/jm40;

    .line 405
    .line 406
    invoke-static {v5, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 407
    .line 408
    .line 409
    move-result-object v9

    .line 410
    sget-object v18, La/mkd;->c0:La/gqw0;

    .line 411
    .line 412
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5}, La/fet;->i0()V

    .line 416
    .line 417
    .line 418
    iget-boolean v8, v5, La/fet;->S:Z

    .line 419
    .line 420
    if-eqz v8, :cond_15

    .line 421
    .line 422
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 423
    .line 424
    invoke-virtual {v5, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 425
    .line 426
    .line 427
    goto :goto_5

    .line 428
    :cond_15
    invoke-virtual {v5}, La/fet;->r0()V

    .line 429
    .line 430
    .line 431
    :goto_5
    sget-object v8, La/gqw0;->x:La/shd;

    .line 432
    .line 433
    invoke-static {v5, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 434
    .line 435
    .line 436
    sget-object v7, La/gqw0;->w:La/shd;

    .line 437
    .line 438
    invoke-static {v5, v11, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 439
    .line 440
    .line 441
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 442
    .line 443
    .line 444
    move-result-object v7

    .line 445
    sget-object v8, La/gqw0;->y:La/shd;

    .line 446
    .line 447
    invoke-static {v5, v7, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v5}, La/jpm0;->n(La/fet;)V

    .line 451
    .line 452
    .line 453
    sget-object v7, La/gqw0;->v:La/shd;

    .line 454
    .line 455
    invoke-static {v5, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 456
    .line 457
    .line 458
    const/16 v7, 0x100

    .line 459
    .line 460
    if-ne v13, v7, :cond_16

    .line 461
    .line 462
    move/from16 v7, v16

    .line 463
    .line 464
    goto :goto_6

    .line 465
    :cond_16
    const/4 v7, 0x0

    .line 466
    :goto_6
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v8

    .line 470
    if-nez v7, :cond_17

    .line 471
    .line 472
    if-ne v8, v12, :cond_18

    .line 473
    .line 474
    :cond_17
    new-instance v8, La/jmv0;

    .line 475
    .line 476
    const/4 v7, 0x5

    .line 477
    invoke-direct {v8, v0, v7}, La/jmv0;-><init>(Ljava/lang/Object;B)V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v5, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    :cond_18
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 484
    .line 485
    const/4 v11, 0x0

    .line 486
    move-object v12, v6

    .line 487
    move-object v6, v2

    .line 488
    move-object v2, v14

    .line 489
    const/4 v14, 0x0

    .line 490
    move-object v7, v3

    .line 491
    const/4 v3, 0x0

    .line 492
    move-object v9, v7

    .line 493
    move-object v7, v4

    .line 494
    const/4 v4, 0x0

    .line 495
    move-object v5, v8

    .line 496
    const/4 v8, 0x0

    .line 497
    move-object v10, v9

    .line 498
    const/4 v9, 0x0

    .line 499
    move-object v13, v10

    .line 500
    const/4 v10, 0x0

    .line 501
    move-object/from16 v0, p1

    .line 502
    .line 503
    move-object/from16 v16, v13

    .line 504
    .line 505
    const/4 v1, 0x0

    .line 506
    move-object/from16 v13, p3

    .line 507
    .line 508
    invoke-static/range {v2 .. v14}, La/ufx;->h(Ljava/util/List;La/mm40;La/u12;Lkotlin/jvm/functions/Function0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 509
    .line 510
    .line 511
    const v2, -0x3a742990

    .line 512
    .line 513
    .line 514
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 515
    .line 516
    .line 517
    iget-object v0, v0, La/nwv0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 518
    .line 519
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->listIterator()Ljava/util/ListIterator;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    :goto_7
    move-object v2, v0

    .line 524
    check-cast v2, La/paw;

    .line 525
    .line 526
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 527
    .line 528
    .line 529
    move-result v3

    .line 530
    if-eqz v3, :cond_1a

    .line 531
    .line 532
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    move-result-object v2

    .line 536
    check-cast v2, La/mwv0;

    .line 537
    .line 538
    iget-object v2, v2, La/mwv0;->a:La/pz40;

    .line 539
    .line 540
    check-cast v2, La/hgk0;

    .line 541
    .line 542
    invoke-virtual {v2}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    check-cast v2, La/ywv0;

    .line 547
    .line 548
    if-nez v2, :cond_19

    .line 549
    .line 550
    const v2, -0x7253e107

    .line 551
    .line 552
    .line 553
    invoke-virtual {v13, v2}, La/fet;->e0(I)V

    .line 554
    .line 555
    .line 556
    :goto_8
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 557
    .line 558
    .line 559
    goto :goto_7

    .line 560
    :cond_19
    const v3, -0x7253e106

    .line 561
    .line 562
    .line 563
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 564
    .line 565
    .line 566
    const/4 v3, 0x0

    .line 567
    invoke-static {v3, v2, v13, v1}, La/luv0;->a(La/mm40;La/ywv0;La/fet;I)V

    .line 568
    .line 569
    .line 570
    goto :goto_8

    .line 571
    :cond_1a
    invoke-virtual {v13, v1}, La/fet;->r(Z)V

    .line 572
    .line 573
    .line 574
    const/4 v0, 0x1

    .line 575
    invoke-virtual {v13, v0}, La/fet;->r(Z)V

    .line 576
    .line 577
    .line 578
    move-object/from16 v0, v16

    .line 579
    .line 580
    goto :goto_9

    .line 581
    :cond_1b
    invoke-virtual {v13}, La/fet;->X()V

    .line 582
    .line 583
    .line 584
    move-object/from16 v0, p1

    .line 585
    .line 586
    :goto_9
    invoke-virtual {v13}, La/fet;->u()La/yfe0;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    if-eqz v1, :cond_1c

    .line 591
    .line 592
    new-instance v2, La/gdr0;

    .line 593
    .line 594
    move-object/from16 v3, p0

    .line 595
    .line 596
    move-object/from16 v4, p2

    .line 597
    .line 598
    invoke-direct {v2, v3, v0, v4, v15}, La/gdr0;-><init>(La/hsv0;La/mm40;Ljava/util/Set;I)V

    .line 599
    .line 600
    .line 601
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 602
    .line 603
    :cond_1c
    return-void
.end method

.method public final b(La/rb50;)V
    .locals 10

    .line 1
    instance-of v0, p1, La/jgc;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    move-object v0, p1

    .line 7
    check-cast v0, La/jgc;

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    move-object v0, v1

    .line 11
    :goto_0
    const/4 v2, 0x0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    iget-object v3, p0, La/hsv0;->a:La/fwv0;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-object v4, v3, La/fwv0;->a:La/tkz;

    .line 20
    .line 21
    sget-object v5, La/tvk;->a:La/rwj;

    .line 22
    .line 23
    sget-object v5, La/ys10;->a:La/vs10;

    .line 24
    .line 25
    invoke-virtual {v5}, La/vs10;->x()La/vs10;

    .line 26
    .line 27
    .line 28
    move-result-object v7

    .line 29
    new-instance v8, La/ewv0;

    .line 30
    .line 31
    invoke-direct {v8, v3, v0, v1, v2}, La/ewv0;-><init>(La/fwv0;La/jgc;La/yje;B)V

    .line 32
    .line 33
    .line 34
    const/16 v9, 0xb

    .line 35
    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 39
    .line 40
    .line 41
    :cond_1
    instance-of v0, p1, La/lwv0;

    .line 42
    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    check-cast p1, La/lwv0;

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    move-object p1, v1

    .line 49
    :goto_1
    if-eqz p1, :cond_7

    .line 50
    .line 51
    iget-object p0, p0, La/hsv0;->b:La/jvv0;

    .line 52
    .line 53
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object p0, p0, La/jvv0;->a:La/p7m0;

    .line 57
    .line 58
    :cond_3
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    move-object v3, v0

    .line 63
    check-cast v3, La/gvv0;

    .line 64
    .line 65
    iget-object v4, v3, La/gvv0;->a:Ljava/util/Map;

    .line 66
    .line 67
    iget-object v5, v3, La/gvv0;->c:La/kvv0;

    .line 68
    .line 69
    invoke-interface {v4, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, La/kvv0;

    .line 74
    .line 75
    if-nez v4, :cond_4

    .line 76
    .line 77
    goto :goto_3

    .line 78
    :cond_4
    iget-object v6, v3, La/gvv0;->a:Ljava/util/Map;

    .line 79
    .line 80
    invoke-static {v6, p1}, La/xp20;->g(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;

    .line 81
    .line 82
    .line 83
    move-result-object v6

    .line 84
    invoke-static {v5, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eqz v7, :cond_5

    .line 89
    .line 90
    invoke-interface {v6, v4}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v4

    .line 94
    if-nez v4, :cond_5

    .line 95
    .line 96
    const/4 v4, 0x1

    .line 97
    goto :goto_2

    .line 98
    :cond_5
    move v4, v2

    .line 99
    :goto_2
    if-eqz v4, :cond_6

    .line 100
    .line 101
    move-object v5, v1

    .line 102
    :cond_6
    const/4 v4, 0x2

    .line 103
    invoke-static {v3, v6, v1, v5, v4}, La/gvv0;->a(La/gvv0;Ljava/util/Map;Ljava/util/Map;La/kvv0;I)La/gvv0;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    :goto_3
    invoke-virtual {p0, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-eqz v0, :cond_3

    .line 112
    .line 113
    :cond_7
    return-void
.end method

.method public final c(Ljava/util/List;La/lwv0;)V
    .locals 1

    .line 1
    invoke-interface {p1, p2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    const/4 v0, -0x1

    .line 6
    if-eq p2, v0, :cond_0

    .line 7
    .line 8
    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, La/rb50;

    .line 13
    .line 14
    invoke-virtual {p0, p1}, La/hsv0;->b(La/rb50;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method
