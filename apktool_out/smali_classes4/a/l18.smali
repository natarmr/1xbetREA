.class public abstract La/l18;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F

.field public static final g:F

.field public static final h:F

.field public static final i:F

.field public static final j:F

.field public static final k:F

.field public static final l:F

.field public static final m:F

.field public static final n:F

.field public static final o:F

.field public static final p:F

.field public static final q:F

.field public static final r:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42000000    # 32.0f

    .line 4
    .line 5
    sput v0, La/l18;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x42840000    # 66.0f

    .line 8
    .line 9
    sput v0, La/l18;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x42a00000    # 80.0f

    .line 12
    .line 13
    sput v0, La/l18;->c:F

    .line 14
    .line 15
    const/high16 v0, 0x42800000    # 64.0f

    .line 16
    .line 17
    sput v0, La/l18;->d:F

    .line 18
    .line 19
    const/high16 v0, -0x40000000    # -2.0f

    .line 20
    .line 21
    sput v0, La/l18;->e:F

    .line 22
    .line 23
    const/high16 v0, 0x42680000    # 58.0f

    .line 24
    .line 25
    sput v0, La/l18;->f:F

    .line 26
    .line 27
    const/high16 v0, 0x42900000    # 72.0f

    .line 28
    .line 29
    sput v0, La/l18;->g:F

    .line 30
    .line 31
    const/high16 v0, 0x42300000    # 44.0f

    .line 32
    .line 33
    sput v0, La/l18;->h:F

    .line 34
    .line 35
    const/high16 v0, 0x42580000    # 54.0f

    .line 36
    .line 37
    sput v0, La/l18;->i:F

    .line 38
    .line 39
    const/high16 v1, 0x40000000    # 2.0f

    .line 40
    .line 41
    sput v1, La/l18;->j:F

    .line 42
    .line 43
    const/high16 v1, -0x3f800000    # -4.0f

    .line 44
    .line 45
    sput v1, La/l18;->k:F

    .line 46
    .line 47
    sput v0, La/l18;->l:F

    .line 48
    .line 49
    const/high16 v0, 0x428c0000    # 70.0f

    .line 50
    .line 51
    sput v0, La/l18;->m:F

    .line 52
    .line 53
    const/high16 v0, 0x42500000    # 52.0f

    .line 54
    .line 55
    sput v0, La/l18;->n:F

    .line 56
    .line 57
    const/high16 v0, 0x42700000    # 60.0f

    .line 58
    .line 59
    sput v0, La/l18;->o:F

    .line 60
    .line 61
    const/high16 v0, 0x41200000    # 10.0f

    .line 62
    .line 63
    sput v0, La/l18;->p:F

    .line 64
    .line 65
    const/high16 v0, -0x3ec00000    # -12.0f

    .line 66
    .line 67
    sput v0, La/l18;->q:F

    .line 68
    .line 69
    const/4 v0, 0x0

    .line 70
    invoke-static {v0, v0}, La/osm0;->e(FF)J

    .line 71
    .line 72
    .line 73
    move-result-wide v0

    .line 74
    sput-wide v0, La/l18;->r:J

    .line 75
    .line 76
    return-void
.end method

.method public static final a(La/mm40;La/rz7;ZLkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v9, p4

    .line 10
    .line 11
    move/from16 v0, p5

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v13, v2, La/rz7;->j:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const v5, -0x489a4da

    .line 22
    .line 23
    .line 24
    invoke-virtual {v9, v5}, La/fet;->g0(I)La/fet;

    .line 25
    .line 26
    .line 27
    and-int/lit8 v5, v0, 0x6

    .line 28
    .line 29
    const/4 v12, 0x2

    .line 30
    if-nez v5, :cond_1

    .line 31
    .line 32
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    if-eqz v5, :cond_0

    .line 37
    .line 38
    const/4 v5, 0x4

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v5, v12

    .line 41
    :goto_0
    or-int/2addr v5, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move v5, v0

    .line 44
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 45
    .line 46
    if-nez v6, :cond_4

    .line 47
    .line 48
    and-int/lit8 v6, v0, 0x40

    .line 49
    .line 50
    if-nez v6, :cond_2

    .line 51
    .line 52
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    goto :goto_2

    .line 57
    :cond_2
    invoke-virtual {v9, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    :goto_2
    if-eqz v6, :cond_3

    .line 62
    .line 63
    const/16 v6, 0x20

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_3
    const/16 v6, 0x10

    .line 67
    .line 68
    :goto_3
    or-int/2addr v5, v6

    .line 69
    :cond_4
    and-int/lit16 v6, v0, 0x180

    .line 70
    .line 71
    if-nez v6, :cond_6

    .line 72
    .line 73
    invoke-virtual {v9, v3}, La/fet;->h(Z)Z

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    if-eqz v6, :cond_5

    .line 78
    .line 79
    const/16 v6, 0x100

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_5
    const/16 v6, 0x80

    .line 83
    .line 84
    :goto_4
    or-int/2addr v5, v6

    .line 85
    :cond_6
    and-int/lit16 v6, v0, 0xc00

    .line 86
    .line 87
    if-nez v6, :cond_8

    .line 88
    .line 89
    invoke-virtual {v9, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_7

    .line 94
    .line 95
    const/16 v6, 0x800

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_7
    const/16 v6, 0x400

    .line 99
    .line 100
    :goto_5
    or-int/2addr v5, v6

    .line 101
    :cond_8
    and-int/lit16 v6, v5, 0x493

    .line 102
    .line 103
    const/16 v7, 0x492

    .line 104
    .line 105
    const/4 v8, 0x0

    .line 106
    const/4 v10, 0x1

    .line 107
    if-eq v6, v7, :cond_9

    .line 108
    .line 109
    move v6, v10

    .line 110
    goto :goto_6

    .line 111
    :cond_9
    move v6, v8

    .line 112
    :goto_6
    and-int/lit8 v7, v5, 0x1

    .line 113
    .line 114
    invoke-virtual {v9, v7, v6}, La/fet;->U(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    if-eqz v6, :cond_25

    .line 119
    .line 120
    const/high16 v16, 0x3f800000    # 1.0f

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    move v6, v5

    .line 125
    if-eqz v3, :cond_a

    .line 126
    .line 127
    move/from16 v5, v16

    .line 128
    .line 129
    goto :goto_7

    .line 130
    :cond_a
    move/from16 v5, v17

    .line 131
    .line 132
    :goto_7
    const/16 v7, 0x96

    .line 133
    .line 134
    sget-object v11, La/jz7;->c:La/zsf;

    .line 135
    .line 136
    invoke-static {v7, v8, v11, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    move v11, v10

    .line 141
    const/16 v10, 0xc00

    .line 142
    .line 143
    move/from16 v18, v11

    .line 144
    .line 145
    const/16 v11, 0x14

    .line 146
    .line 147
    move/from16 v19, v6

    .line 148
    .line 149
    move-object v6, v7

    .line 150
    const-string v7, "BigPigHandCrossfade"

    .line 151
    .line 152
    move/from16 v20, v8

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    move/from16 v14, v19

    .line 156
    .line 157
    move/from16 v15, v20

    .line 158
    .line 159
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 160
    .line 161
    .line 162
    move-result-object v5

    .line 163
    if-eqz v3, :cond_b

    .line 164
    .line 165
    goto :goto_8

    .line 166
    :cond_b
    move/from16 v16, v17

    .line 167
    .line 168
    :goto_8
    const/16 v6, 0xa0

    .line 169
    .line 170
    sget-object v7, La/jz7;->b:La/zsf;

    .line 171
    .line 172
    invoke-static {v6, v15, v7, v12}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 173
    .line 174
    .line 175
    move-result-object v6

    .line 176
    const/16 v10, 0xc00

    .line 177
    .line 178
    const/16 v11, 0x14

    .line 179
    .line 180
    const-string v7, "BigPigThrowSwing"

    .line 181
    .line 182
    const/4 v8, 0x0

    .line 183
    move-object/from16 v9, p4

    .line 184
    .line 185
    move-object v12, v5

    .line 186
    move/from16 v5, v16

    .line 187
    .line 188
    invoke-static/range {v5 .. v11}, La/d43;->b(FLa/j73;Ljava/lang/String;Lkotlin/jvm/functions/Function1;La/fet;II)La/l7m0;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    sget v6, La/tz7;->a:F

    .line 193
    .line 194
    sget v7, La/tz7;->c:F

    .line 195
    .line 196
    invoke-static {v1, v6, v7}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v6

    .line 200
    sget-object v7, La/gqw0;->a:La/zx7;

    .line 201
    .line 202
    invoke-static {v7, v15}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 203
    .line 204
    .line 205
    move-result-object v8

    .line 206
    iget-wide v10, v9, La/fet;->T:J

    .line 207
    .line 208
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 209
    .line 210
    .line 211
    move-result v10

    .line 212
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 213
    .line 214
    .line 215
    move-result-object v11

    .line 216
    invoke-static {v9, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 217
    .line 218
    .line 219
    move-result-object v6

    .line 220
    sget-object v16, La/mkd;->c0:La/gqw0;

    .line 221
    .line 222
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    invoke-virtual {v9}, La/fet;->i0()V

    .line 226
    .line 227
    .line 228
    iget-boolean v15, v9, La/fet;->S:Z

    .line 229
    .line 230
    if-eqz v15, :cond_c

    .line 231
    .line 232
    sget-object v15, La/e7z;->u1:La/pcy;

    .line 233
    .line 234
    invoke-virtual {v9, v15}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 235
    .line 236
    .line 237
    goto :goto_9

    .line 238
    :cond_c
    invoke-virtual {v9}, La/fet;->r0()V

    .line 239
    .line 240
    .line 241
    :goto_9
    sget-object v15, La/gqw0;->x:La/shd;

    .line 242
    .line 243
    invoke-static {v9, v8, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    sget-object v8, La/gqw0;->w:La/shd;

    .line 247
    .line 248
    invoke-static {v9, v11, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 252
    .line 253
    .line 254
    move-result-object v8

    .line 255
    sget-object v10, La/gqw0;->y:La/shd;

    .line 256
    .line 257
    invoke-static {v9, v8, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 261
    .line 262
    .line 263
    sget-object v8, La/gqw0;->v:La/shd;

    .line 264
    .line 265
    invoke-static {v9, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 266
    .line 267
    .line 268
    move-object v6, v7

    .line 269
    sget-object v7, La/o7k0;->c:La/n0q;

    .line 270
    .line 271
    move-object v8, v5

    .line 272
    iget-object v5, v2, La/rz7;->c:Ljava/lang/String;

    .line 273
    .line 274
    const/16 v11, 0x1b0

    .line 275
    .line 276
    move-object v10, v12

    .line 277
    const/16 v12, 0x7f8

    .line 278
    .line 279
    move-object v15, v6

    .line 280
    const/4 v6, 0x0

    .line 281
    move-object/from16 v16, v8

    .line 282
    .line 283
    const/4 v8, 0x0

    .line 284
    const/4 v9, 0x0

    .line 285
    move-object/from16 v0, v16

    .line 286
    .line 287
    move-object/from16 v16, v15

    .line 288
    .line 289
    move-object v15, v10

    .line 290
    move-object/from16 v10, p4

    .line 291
    .line 292
    invoke-static/range {v5 .. v12}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 293
    .line 294
    .line 295
    move-object v9, v10

    .line 296
    move-object v5, v13

    .line 297
    sget-object v13, La/gqw0;->A:La/pge;

    .line 298
    .line 299
    invoke-virtual {v9, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v6

    .line 303
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v7

    .line 307
    sget-object v8, La/ukd;->a:La/cl5;

    .line 308
    .line 309
    if-nez v6, :cond_d

    .line 310
    .line 311
    if-ne v7, v8, :cond_e

    .line 312
    .line 313
    :cond_d
    new-instance v7, La/kk7;

    .line 314
    .line 315
    const/16 v6, 0xc

    .line 316
    .line 317
    invoke-direct {v7, v15, v6}, La/kk7;-><init>(La/l7m0;B)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function0;

    .line 324
    .line 325
    and-int/lit16 v6, v14, 0x1c00

    .line 326
    .line 327
    const/16 v10, 0x800

    .line 328
    .line 329
    if-ne v6, v10, :cond_f

    .line 330
    .line 331
    const/4 v11, 0x1

    .line 332
    goto :goto_a

    .line 333
    :cond_f
    const/4 v11, 0x0

    .line 334
    :goto_a
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v12

    .line 338
    if-nez v11, :cond_10

    .line 339
    .line 340
    if-ne v12, v8, :cond_11

    .line 341
    .line 342
    :cond_10
    new-instance v12, La/tq;

    .line 343
    .line 344
    const/16 v11, 0x15

    .line 345
    .line 346
    invoke-direct {v12, v4, v11}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 350
    .line 351
    .line 352
    :cond_11
    move-object/from16 v17, v12

    .line 353
    .line 354
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 355
    .line 356
    const/4 v11, 0x0

    .line 357
    const/16 v20, 0x0

    .line 358
    .line 359
    const/16 v21, 0xcc0

    .line 360
    .line 361
    move-object v14, v7

    .line 362
    sget v7, La/l18;->a:F

    .line 363
    .line 364
    move-object v12, v8

    .line 365
    sget v8, La/l18;->b:F

    .line 366
    .line 367
    sget v9, La/l18;->c:F

    .line 368
    .line 369
    move/from16 v19, v10

    .line 370
    .line 371
    sget v10, La/l18;->d:F

    .line 372
    .line 373
    move/from16 v23, v11

    .line 374
    .line 375
    move-object/from16 v22, v12

    .line 376
    .line 377
    const-wide/16 v11, 0x0

    .line 378
    .line 379
    move-object/from16 v24, v15

    .line 380
    .line 381
    const/4 v15, 0x0

    .line 382
    move/from16 v25, v6

    .line 383
    .line 384
    move-object/from16 v6, v16

    .line 385
    .line 386
    const/16 v16, 0x0

    .line 387
    .line 388
    move/from16 v26, v19

    .line 389
    .line 390
    const v19, 0x301b6d86

    .line 391
    .line 392
    .line 393
    move-object/from16 v1, v22

    .line 394
    .line 395
    move-object/from16 v22, v0

    .line 396
    .line 397
    move-object v0, v1

    .line 398
    move-object/from16 v18, p4

    .line 399
    .line 400
    move-object/from16 v1, v24

    .line 401
    .line 402
    move/from16 v3, v25

    .line 403
    .line 404
    move/from16 v24, v23

    .line 405
    .line 406
    invoke-static/range {v5 .. v21}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 407
    .line 408
    .line 409
    move v11, v10

    .line 410
    move v10, v9

    .line 411
    move-object/from16 v9, v18

    .line 412
    .line 413
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    move-result v12

    .line 417
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v14

    .line 421
    if-nez v12, :cond_12

    .line 422
    .line 423
    if-ne v14, v0, :cond_13

    .line 424
    .line 425
    :cond_12
    new-instance v14, La/kk7;

    .line 426
    .line 427
    const/16 v12, 0x10

    .line 428
    .line 429
    invoke-direct {v14, v1, v12}, La/kk7;-><init>(La/l7m0;B)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v9, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 433
    .line 434
    .line 435
    :cond_13
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 436
    .line 437
    const/16 v20, 0x0

    .line 438
    .line 439
    const/16 v21, 0x1cc0

    .line 440
    .line 441
    move v9, v10

    .line 442
    move v10, v11

    .line 443
    const-wide/16 v11, 0x0

    .line 444
    .line 445
    const/4 v15, 0x0

    .line 446
    const/16 v16, 0x0

    .line 447
    .line 448
    const/16 v17, 0x0

    .line 449
    .line 450
    move-object/from16 v18, p4

    .line 451
    .line 452
    invoke-static/range {v5 .. v21}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 453
    .line 454
    .line 455
    move-object/from16 v9, v18

    .line 456
    .line 457
    iget-object v5, v2, La/rz7;->h:Ljava/lang/String;

    .line 458
    .line 459
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 460
    .line 461
    .line 462
    move-result v7

    .line 463
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v8

    .line 467
    if-nez v7, :cond_14

    .line 468
    .line 469
    if-ne v8, v0, :cond_15

    .line 470
    .line 471
    :cond_14
    new-instance v8, La/kk7;

    .line 472
    .line 473
    const/16 v7, 0x11

    .line 474
    .line 475
    invoke-direct {v8, v1, v7}, La/kk7;-><init>(La/l7m0;B)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v9, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_15
    move-object v14, v8

    .line 482
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 483
    .line 484
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v7

    .line 488
    const/16 v8, 0xf

    .line 489
    .line 490
    if-ne v7, v0, :cond_16

    .line 491
    .line 492
    new-instance v7, La/os7;

    .line 493
    .line 494
    invoke-direct {v7, v8}, La/os7;-><init>(B)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 498
    .line 499
    .line 500
    :cond_16
    move-object v15, v7

    .line 501
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 502
    .line 503
    const/16 v10, 0x800

    .line 504
    .line 505
    if-ne v3, v10, :cond_17

    .line 506
    .line 507
    const/4 v7, 0x1

    .line 508
    goto :goto_b

    .line 509
    :cond_17
    move/from16 v7, v24

    .line 510
    .line 511
    :goto_b
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v11

    .line 515
    if-nez v7, :cond_18

    .line 516
    .line 517
    if-ne v11, v0, :cond_19

    .line 518
    .line 519
    :cond_18
    new-instance v11, La/tq;

    .line 520
    .line 521
    const/16 v7, 0x16

    .line 522
    .line 523
    invoke-direct {v11, v4, v7}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v9, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    :cond_19
    move-object/from16 v16, v11

    .line 530
    .line 531
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 532
    .line 533
    if-ne v3, v10, :cond_1a

    .line 534
    .line 535
    const/16 v24, 0x1

    .line 536
    .line 537
    :cond_1a
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 538
    .line 539
    .line 540
    move-result-object v3

    .line 541
    if-nez v24, :cond_1b

    .line 542
    .line 543
    if-ne v3, v0, :cond_1c

    .line 544
    .line 545
    :cond_1b
    new-instance v3, La/tq;

    .line 546
    .line 547
    const/16 v7, 0x17

    .line 548
    .line 549
    invoke-direct {v3, v4, v7}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v9, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 553
    .line 554
    .line 555
    :cond_1c
    move-object/from16 v17, v3

    .line 556
    .line 557
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 558
    .line 559
    const/16 v20, 0x30

    .line 560
    .line 561
    const/16 v21, 0x1c0

    .line 562
    .line 563
    sget v7, La/l18;->f:F

    .line 564
    .line 565
    move v3, v8

    .line 566
    sget v8, La/l18;->g:F

    .line 567
    .line 568
    sget v9, La/l18;->h:F

    .line 569
    .line 570
    sget v10, La/l18;->i:F

    .line 571
    .line 572
    const-wide/16 v11, 0x0

    .line 573
    .line 574
    const/4 v13, 0x0

    .line 575
    const v19, 0x1b6d86

    .line 576
    .line 577
    .line 578
    move-object/from16 v18, p4

    .line 579
    .line 580
    invoke-static/range {v5 .. v21}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 581
    .line 582
    .line 583
    move-object/from16 v9, v18

    .line 584
    .line 585
    iget-object v5, v2, La/rz7;->i:Ljava/lang/String;

    .line 586
    .line 587
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    move-result v7

    .line 591
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v8

    .line 595
    if-nez v7, :cond_1d

    .line 596
    .line 597
    if-ne v8, v0, :cond_1e

    .line 598
    .line 599
    :cond_1d
    new-instance v8, La/kk7;

    .line 600
    .line 601
    const/16 v7, 0x12

    .line 602
    .line 603
    invoke-direct {v8, v1, v7}, La/kk7;-><init>(La/l7m0;B)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v9, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 607
    .line 608
    .line 609
    :cond_1e
    move-object v14, v8

    .line 610
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 611
    .line 612
    move-object/from16 v8, v22

    .line 613
    .line 614
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v7

    .line 622
    if-nez v1, :cond_1f

    .line 623
    .line 624
    if-ne v7, v0, :cond_20

    .line 625
    .line 626
    :cond_1f
    new-instance v7, La/kk7;

    .line 627
    .line 628
    const/16 v1, 0xd

    .line 629
    .line 630
    invoke-direct {v7, v8, v1}, La/kk7;-><init>(La/l7m0;B)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    :cond_20
    move-object v15, v7

    .line 637
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 638
    .line 639
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v7

    .line 647
    if-nez v1, :cond_21

    .line 648
    .line 649
    if-ne v7, v0, :cond_22

    .line 650
    .line 651
    :cond_21
    new-instance v7, La/kk7;

    .line 652
    .line 653
    const/16 v1, 0xe

    .line 654
    .line 655
    invoke-direct {v7, v8, v1}, La/kk7;-><init>(La/l7m0;B)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 659
    .line 660
    .line 661
    :cond_22
    move-object/from16 v16, v7

    .line 662
    .line 663
    check-cast v16, Lkotlin/jvm/functions/Function0;

    .line 664
    .line 665
    invoke-virtual {v9, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 666
    .line 667
    .line 668
    move-result v1

    .line 669
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v7

    .line 673
    if-nez v1, :cond_23

    .line 674
    .line 675
    if-ne v7, v0, :cond_24

    .line 676
    .line 677
    :cond_23
    new-instance v7, La/kk7;

    .line 678
    .line 679
    invoke-direct {v7, v8, v3}, La/kk7;-><init>(La/l7m0;B)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 683
    .line 684
    .line 685
    :cond_24
    move-object/from16 v17, v7

    .line 686
    .line 687
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 688
    .line 689
    const/16 v20, 0x0

    .line 690
    .line 691
    const/16 v21, 0x180

    .line 692
    .line 693
    sget v7, La/l18;->l:F

    .line 694
    .line 695
    sget v8, La/l18;->m:F

    .line 696
    .line 697
    sget v9, La/l18;->n:F

    .line 698
    .line 699
    sget v10, La/l18;->o:F

    .line 700
    .line 701
    sget-wide v11, La/l18;->r:J

    .line 702
    .line 703
    const/4 v13, 0x0

    .line 704
    const v19, 0xdb6d86

    .line 705
    .line 706
    .line 707
    move-object/from16 v18, p4

    .line 708
    .line 709
    invoke-static/range {v5 .. v21}, La/phu0;->c(Ljava/lang/String;La/zx7;FFFFJLa/qge;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;III)V

    .line 710
    .line 711
    .line 712
    move-object/from16 v9, v18

    .line 713
    .line 714
    const/4 v11, 0x1

    .line 715
    invoke-virtual {v9, v11}, La/fet;->r(Z)V

    .line 716
    .line 717
    .line 718
    goto :goto_c

    .line 719
    :cond_25
    invoke-virtual {v9}, La/fet;->X()V

    .line 720
    .line 721
    .line 722
    :goto_c
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 723
    .line 724
    .line 725
    move-result-object v7

    .line 726
    if-eqz v7, :cond_26

    .line 727
    .line 728
    new-instance v0, La/rn1;

    .line 729
    .line 730
    const/4 v6, 0x4

    .line 731
    move-object/from16 v1, p0

    .line 732
    .line 733
    move/from16 v3, p2

    .line 734
    .line 735
    move/from16 v5, p5

    .line 736
    .line 737
    invoke-direct/range {v0 .. v6}, La/rn1;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLa/wdr;IB)V

    .line 738
    .line 739
    .line 740
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 741
    .line 742
    :cond_26
    return-void
.end method
