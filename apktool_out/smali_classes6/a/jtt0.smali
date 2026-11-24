.class public final La/jtt0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jtt0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final a(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V
    .locals 41

    .line 1
    move-object/from16 v12, p1

    .line 2
    .line 3
    const v0, -0x5f5879d8

    .line 4
    .line 5
    .line 6
    invoke-virtual {v12, v0}, La/fet;->g0(I)La/fet;

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p1 .. p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int v0, p0, v0

    .line 20
    .line 21
    move-object/from16 v4, p3

    .line 22
    .line 23
    invoke-virtual {v12, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    const/16 v2, 0x20

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const/16 v2, 0x10

    .line 33
    .line 34
    :goto_1
    or-int/2addr v0, v2

    .line 35
    move-object/from16 v2, p4

    .line 36
    .line 37
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eqz v3, :cond_2

    .line 42
    .line 43
    const/16 v3, 0x100

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v3, 0x80

    .line 47
    .line 48
    :goto_2
    or-int/2addr v0, v3

    .line 49
    and-int/lit16 v3, v0, 0x93

    .line 50
    .line 51
    const/16 v5, 0x92

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    const/4 v7, 0x1

    .line 55
    if-eq v3, v5, :cond_3

    .line 56
    .line 57
    move v3, v7

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move v3, v6

    .line 60
    :goto_3
    and-int/lit8 v5, v0, 0x1

    .line 61
    .line 62
    invoke-virtual {v12, v5, v3}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_8

    .line 67
    .line 68
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    sget-object v5, La/ukd;->a:La/cl5;

    .line 73
    .line 74
    if-ne v3, v5, :cond_4

    .line 75
    .line 76
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 77
    .line 78
    invoke-static {v3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 79
    .line 80
    .line 81
    move-result-object v3

    .line 82
    invoke-virtual {v12, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_4
    check-cast v3, La/pz40;

    .line 86
    .line 87
    sget-object v8, La/gqw0;->k:La/yx7;

    .line 88
    .line 89
    sget-object v9, La/uc9;->a:La/lw3;

    .line 90
    .line 91
    const/16 v10, 0x30

    .line 92
    .line 93
    invoke-static {v9, v8, v12, v10}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    iget-wide v9, v12, La/fet;->T:J

    .line 98
    .line 99
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 100
    .line 101
    .line 102
    move-result v9

    .line 103
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 104
    .line 105
    .line 106
    move-result-object v10

    .line 107
    invoke-static/range {p1 .. p2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 112
    .line 113
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v12}, La/fet;->i0()V

    .line 117
    .line 118
    .line 119
    iget-boolean v13, v12, La/fet;->S:Z

    .line 120
    .line 121
    if-eqz v13, :cond_5

    .line 122
    .line 123
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 124
    .line 125
    invoke-virtual {v12, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 126
    .line 127
    .line 128
    goto :goto_4

    .line 129
    :cond_5
    invoke-virtual {v12}, La/fet;->r0()V

    .line 130
    .line 131
    .line 132
    :goto_4
    sget-object v13, La/gqw0;->x:La/shd;

    .line 133
    .line 134
    invoke-static {v12, v8, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 135
    .line 136
    .line 137
    sget-object v8, La/gqw0;->w:La/shd;

    .line 138
    .line 139
    invoke-static {v12, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v8

    .line 146
    sget-object v9, La/gqw0;->y:La/shd;

    .line 147
    .line 148
    invoke-static {v12, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 152
    .line 153
    .line 154
    sget-object v8, La/gqw0;->v:La/shd;

    .line 155
    .line 156
    invoke-static {v12, v11, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    sget-object v8, La/qmk;->a:La/zcl;

    .line 160
    .line 161
    const/high16 v8, 0x41c00000    # 24.0f

    .line 162
    .line 163
    sget-object v9, La/jm40;->b:La/jm40;

    .line 164
    .line 165
    invoke-static {v9, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    const-string v10, "TeamLogoTestTag"

    .line 170
    .line 171
    invoke-static {v8, v10}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    const v10, 0x7f080cf7

    .line 176
    .line 177
    .line 178
    move-object v11, v3

    .line 179
    invoke-static {v10, v6, v12}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    invoke-static {v10, v6, v12}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    shr-int/lit8 v13, v0, 0x3

    .line 188
    .line 189
    and-int/lit8 v13, v13, 0xe

    .line 190
    .line 191
    const v14, 0x9030

    .line 192
    .line 193
    .line 194
    or-int/2addr v13, v14

    .line 195
    const/4 v14, 0x0

    .line 196
    const/16 v15, 0x7fe0

    .line 197
    .line 198
    move/from16 v16, v1

    .line 199
    .line 200
    const/4 v1, 0x0

    .line 201
    move-object/from16 v17, v5

    .line 202
    .line 203
    const/4 v5, 0x0

    .line 204
    move/from16 v18, v6

    .line 205
    .line 206
    const/4 v6, 0x0

    .line 207
    move/from16 v19, v7

    .line 208
    .line 209
    const/4 v7, 0x0

    .line 210
    move-object v2, v8

    .line 211
    const/4 v8, 0x0

    .line 212
    move-object/from16 v20, v9

    .line 213
    .line 214
    const/4 v9, 0x0

    .line 215
    move-object v4, v10

    .line 216
    const/4 v10, 0x0

    .line 217
    move-object/from16 v21, v11

    .line 218
    .line 219
    const/4 v11, 0x0

    .line 220
    move/from16 v16, v0

    .line 221
    .line 222
    move-object/from16 v28, v17

    .line 223
    .line 224
    move-object/from16 v25, v21

    .line 225
    .line 226
    move-object/from16 v0, p3

    .line 227
    .line 228
    invoke-static/range {v0 .. v15}, La/k7x;->b(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/pm80;La/pm80;La/pm80;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/u12;La/qge;La/a4d;La/fet;III)V

    .line 229
    .line 230
    .line 231
    move-object v0, v12

    .line 232
    const/4 v13, 0x0

    .line 233
    const/16 v14, 0xe

    .line 234
    .line 235
    const/high16 v10, 0x41000000    # 8.0f

    .line 236
    .line 237
    const/4 v11, 0x0

    .line 238
    const/4 v12, 0x0

    .line 239
    move-object/from16 v9, v20

    .line 240
    .line 241
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    const-string v2, "TeamNameTestTag"

    .line 246
    .line 247
    invoke-static {v1, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v1

    .line 251
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v2

    .line 255
    move-object/from16 v3, v28

    .line 256
    .line 257
    if-ne v2, v3, :cond_6

    .line 258
    .line 259
    new-instance v2, La/dbo0;

    .line 260
    .line 261
    move-object/from16 v11, v25

    .line 262
    .line 263
    const/4 v4, 0x1

    .line 264
    invoke-direct {v2, v11, v4}, La/dbo0;-><init>(La/pz40;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    goto :goto_5

    .line 271
    :cond_6
    move-object/from16 v11, v25

    .line 272
    .line 273
    const/4 v4, 0x1

    .line 274
    :goto_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 275
    .line 276
    const/4 v5, 0x0

    .line 277
    invoke-static {v1, v5, v2}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    sget-object v32, La/j1t0;->b:La/qrq;

    .line 282
    .line 283
    sget-wide v29, La/qmk;->p:J

    .line 284
    .line 285
    sget-wide v38, La/qmk;->C:J

    .line 286
    .line 287
    new-instance v26, La/y9q0;

    .line 288
    .line 289
    const/16 v37, 0x0

    .line 290
    .line 291
    const v40, 0xfdffdd

    .line 292
    .line 293
    .line 294
    const-wide/16 v27, 0x0

    .line 295
    .line 296
    const/16 v31, 0x0

    .line 297
    .line 298
    const-wide/16 v33, 0x0

    .line 299
    .line 300
    const/16 v35, 0x0

    .line 301
    .line 302
    const/16 v36, 0x0

    .line 303
    .line 304
    invoke-direct/range {v26 .. v40}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 305
    .line 306
    .line 307
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 308
    .line 309
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 310
    .line 311
    .line 312
    move-result-wide v5

    .line 313
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    if-ne v2, v3, :cond_7

    .line 318
    .line 319
    new-instance v2, La/dbo0;

    .line 320
    .line 321
    const/4 v3, 0x2

    .line 322
    invoke-direct {v2, v11, v3}, La/dbo0;-><init>(La/pz40;B)V

    .line 323
    .line 324
    .line 325
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    :cond_7
    move-object/from16 v19, v2

    .line 329
    .line 330
    check-cast v19, Lkotlin/jvm/functions/Function1;

    .line 331
    .line 332
    shr-int/lit8 v2, v16, 0x6

    .line 333
    .line 334
    and-int/lit8 v22, v2, 0xe

    .line 335
    .line 336
    const v23, 0x186180

    .line 337
    .line 338
    .line 339
    const v24, 0xaff8

    .line 340
    .line 341
    .line 342
    move/from16 v27, v4

    .line 343
    .line 344
    const/4 v4, 0x0

    .line 345
    move-wide v2, v5

    .line 346
    const-wide/16 v5, 0x0

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    const/4 v8, 0x0

    .line 350
    const/4 v9, 0x0

    .line 351
    const-wide/16 v10, 0x0

    .line 352
    .line 353
    const/4 v12, 0x0

    .line 354
    const-wide/16 v13, 0x0

    .line 355
    .line 356
    const/4 v15, 0x2

    .line 357
    const/16 v16, 0x0

    .line 358
    .line 359
    const/16 v17, 0x2

    .line 360
    .line 361
    const/16 v18, 0x0

    .line 362
    .line 363
    move-object/from16 v21, v0

    .line 364
    .line 365
    move-object/from16 v20, v26

    .line 366
    .line 367
    move-object/from16 v0, p4

    .line 368
    .line 369
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 370
    .line 371
    .line 372
    move-object/from16 v12, v21

    .line 373
    .line 374
    const/4 v4, 0x1

    .line 375
    invoke-virtual {v12, v4}, La/fet;->r(Z)V

    .line 376
    .line 377
    .line 378
    goto :goto_6

    .line 379
    :cond_8
    invoke-virtual {v12}, La/fet;->X()V

    .line 380
    .line 381
    .line 382
    :goto_6
    invoke-virtual {v12}, La/fet;->u()La/yfe0;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    if-eqz v0, :cond_9

    .line 387
    .line 388
    new-instance v2, La/man;

    .line 389
    .line 390
    const/16 v7, 0x18

    .line 391
    .line 392
    move/from16 v6, p0

    .line 393
    .line 394
    move-object/from16 v3, p2

    .line 395
    .line 396
    move-object/from16 v4, p3

    .line 397
    .line 398
    move-object/from16 v5, p4

    .line 399
    .line 400
    invoke-direct/range {v2 .. v7}, La/man;-><init>(La/mm40;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 401
    .line 402
    .line 403
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 404
    .line 405
    :cond_9
    return-void
.end method

.method public static final b(La/x1z;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 49

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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-boolean v3, v0, La/x1z;->h:Z

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v4, 0x7815f38c

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v4}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    const/4 v5, 0x4

    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    move v4, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v4, 0x2

    .line 31
    :goto_0
    or-int v4, p3, v4

    .line 32
    .line 33
    invoke-virtual {v2, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v7

    .line 37
    const/16 v8, 0x20

    .line 38
    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    move v7, v8

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const/16 v7, 0x10

    .line 44
    .line 45
    :goto_1
    or-int/2addr v4, v7

    .line 46
    and-int/lit8 v7, v4, 0x13

    .line 47
    .line 48
    const/16 v9, 0x12

    .line 49
    .line 50
    if-eq v7, v9, :cond_2

    .line 51
    .line 52
    const/4 v7, 0x1

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    const/4 v7, 0x0

    .line 55
    :goto_2
    and-int/lit8 v9, v4, 0x1

    .line 56
    .line 57
    invoke-virtual {v2, v9, v7}, La/fet;->U(IZ)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_d

    .line 62
    .line 63
    sget-object v7, La/bmd;->n:La/zfn;

    .line 64
    .line 65
    invoke-virtual {v2, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    sget-object v9, La/k6z;->b:La/k6z;

    .line 70
    .line 71
    if-ne v7, v9, :cond_3

    .line 72
    .line 73
    const/16 v27, 0x1

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const/16 v27, 0x0

    .line 77
    .line 78
    :goto_3
    iget-object v7, v0, La/x1z;->f:Ljava/lang/String;

    .line 79
    .line 80
    iget-object v9, v0, La/x1z;->e:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v12, v0, La/x1z;->d:La/jb30;

    .line 83
    .line 84
    sget-object v13, La/qmk;->a:La/zcl;

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    const/4 v13, 0x0

    .line 89
    :goto_4
    move/from16 v18, v13

    .line 90
    .line 91
    goto :goto_5

    .line 92
    :cond_4
    const/high16 v13, 0x40000000    # 2.0f

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :goto_5
    const/16 v17, 0x0

    .line 96
    .line 97
    const/16 v19, 0x7

    .line 98
    .line 99
    sget-object v14, La/jm40;->b:La/jm40;

    .line 100
    .line 101
    const/4 v15, 0x0

    .line 102
    const/16 v16, 0x0

    .line 103
    .line 104
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 105
    .line 106
    .line 107
    move-result-object v13

    .line 108
    const/high16 v15, 0x3f800000    # 1.0f

    .line 109
    .line 110
    invoke-static {v13, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v13

    .line 114
    const/high16 v6, 0x42880000    # 68.0f

    .line 115
    .line 116
    invoke-static {v13, v6}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 117
    .line 118
    .line 119
    move-result-object v6

    .line 120
    invoke-static {v3}, La/b5x;->Q(Z)La/yjj0;

    .line 121
    .line 122
    .line 123
    move-result-object v3

    .line 124
    invoke-static {v6, v3}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v3

    .line 128
    sget-object v28, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 129
    .line 130
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack40-0d7_KjU()J

    .line 131
    .line 132
    .line 133
    move-result-wide v10

    .line 134
    sget-object v6, La/jd8;->n:La/ljc;

    .line 135
    .line 136
    invoke-static {v3, v10, v11, v6}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 137
    .line 138
    .line 139
    move-result-object v3

    .line 140
    const/high16 v6, 0x41000000    # 8.0f

    .line 141
    .line 142
    const/high16 v10, 0x40c00000    # 6.0f

    .line 143
    .line 144
    invoke-static {v3, v6, v10}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v18

    .line 148
    and-int/lit8 v3, v4, 0x70

    .line 149
    .line 150
    if-ne v3, v8, :cond_5

    .line 151
    .line 152
    const/4 v6, 0x1

    .line 153
    goto :goto_6

    .line 154
    :cond_5
    const/4 v6, 0x0

    .line 155
    :goto_6
    and-int/lit8 v3, v4, 0xe

    .line 156
    .line 157
    if-ne v3, v5, :cond_6

    .line 158
    .line 159
    const/4 v3, 0x1

    .line 160
    goto :goto_7

    .line 161
    :cond_6
    const/4 v3, 0x0

    .line 162
    :goto_7
    or-int/2addr v3, v6

    .line 163
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-nez v3, :cond_7

    .line 168
    .line 169
    sget-object v3, La/ukd;->a:La/cl5;

    .line 170
    .line 171
    if-ne v4, v3, :cond_8

    .line 172
    .line 173
    :cond_7
    new-instance v4, La/o0k0;

    .line 174
    .line 175
    const/16 v3, 0x1d

    .line 176
    .line 177
    invoke-direct {v4, v1, v0, v3}, La/o0k0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    :cond_8
    move-object/from16 v22, v4

    .line 184
    .line 185
    check-cast v22, Lkotlin/jvm/functions/Function0;

    .line 186
    .line 187
    const/16 v23, 0xf

    .line 188
    .line 189
    const/16 v19, 0x0

    .line 190
    .line 191
    const/16 v20, 0x0

    .line 192
    .line 193
    const/16 v21, 0x0

    .line 194
    .line 195
    invoke-static/range {v18 .. v23}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    const-string v4, "LastTeamMatchTestTag"

    .line 200
    .line 201
    invoke-static {v3, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    sget-object v4, La/gqw0;->n:La/xx7;

    .line 206
    .line 207
    sget-object v5, La/uc9;->c:La/mw3;

    .line 208
    .line 209
    const/16 v6, 0x30

    .line 210
    .line 211
    invoke-static {v5, v4, v2, v6}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    iget-wide v5, v2, La/fet;->T:J

    .line 216
    .line 217
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 218
    .line 219
    .line 220
    move-result v5

    .line 221
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 230
    .line 231
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v2}, La/fet;->i0()V

    .line 235
    .line 236
    .line 237
    iget-boolean v8, v2, La/fet;->S:Z

    .line 238
    .line 239
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 240
    .line 241
    if-eqz v8, :cond_9

    .line 242
    .line 243
    invoke-virtual {v2, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 244
    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_9
    invoke-virtual {v2}, La/fet;->r0()V

    .line 248
    .line 249
    .line 250
    :goto_8
    sget-object v8, La/gqw0;->x:La/shd;

    .line 251
    .line 252
    invoke-static {v2, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 253
    .line 254
    .line 255
    sget-object v4, La/gqw0;->w:La/shd;

    .line 256
    .line 257
    invoke-static {v2, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 258
    .line 259
    .line 260
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 261
    .line 262
    .line 263
    move-result-object v5

    .line 264
    sget-object v11, La/gqw0;->y:La/shd;

    .line 265
    .line 266
    invoke-static {v2, v5, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 267
    .line 268
    .line 269
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 270
    .line 271
    .line 272
    sget-object v5, La/gqw0;->v:La/shd;

    .line 273
    .line 274
    invoke-static {v2, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 275
    .line 276
    .line 277
    iget-object v3, v12, La/jb30;->a:Ljava/lang/String;

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    invoke-static {v3, v2, v6}, La/o5n0;->h(Ljava/lang/String;La/fet;I)V

    .line 281
    .line 282
    .line 283
    new-instance v3, La/x7z;

    .line 284
    .line 285
    const/4 v13, 0x1

    .line 286
    invoke-direct {v3, v15, v13}, La/x7z;-><init>(FZ)V

    .line 287
    .line 288
    .line 289
    sget-object v13, La/uc9;->a:La/lw3;

    .line 290
    .line 291
    move-object/from16 v18, v7

    .line 292
    .line 293
    sget-object v7, La/gqw0;->j:La/yx7;

    .line 294
    .line 295
    invoke-static {v13, v7, v2, v6}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 296
    .line 297
    .line 298
    move-result-object v13

    .line 299
    move-object/from16 v19, v7

    .line 300
    .line 301
    iget-wide v6, v2, La/fet;->T:J

    .line 302
    .line 303
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 304
    .line 305
    .line 306
    move-result v6

    .line 307
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 312
    .line 313
    .line 314
    move-result-object v3

    .line 315
    invoke-virtual {v2}, La/fet;->i0()V

    .line 316
    .line 317
    .line 318
    iget-boolean v15, v2, La/fet;->S:Z

    .line 319
    .line 320
    if-eqz v15, :cond_a

    .line 321
    .line 322
    invoke-virtual {v2, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 323
    .line 324
    .line 325
    goto :goto_9

    .line 326
    :cond_a
    invoke-virtual {v2}, La/fet;->r0()V

    .line 327
    .line 328
    .line 329
    :goto_9
    invoke-static {v2, v13, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 330
    .line 331
    .line 332
    invoke-static {v2, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v6, v2, v11, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 336
    .line 337
    .line 338
    invoke-static {v2, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 339
    .line 340
    .line 341
    sget-object v3, La/zhg0;->a:La/zhg0;

    .line 342
    .line 343
    const/high16 v6, 0x3f800000    # 1.0f

    .line 344
    .line 345
    const/4 v13, 0x1

    .line 346
    invoke-virtual {v3, v6, v14, v13}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 347
    .line 348
    .line 349
    move-result-object v7

    .line 350
    sget-object v15, La/gqw0;->k:La/yx7;

    .line 351
    .line 352
    invoke-virtual {v3, v15, v7}, La/zhg0;->b(La/yx7;La/mm40;)La/mm40;

    .line 353
    .line 354
    .line 355
    move-result-object v7

    .line 356
    iget-object v6, v0, La/x1z;->b:Ljava/lang/String;

    .line 357
    .line 358
    move-object/from16 v17, v4

    .line 359
    .line 360
    iget-object v4, v0, La/x1z;->c:Ljava/lang/String;

    .line 361
    .line 362
    move-object/from16 v22, v5

    .line 363
    .line 364
    const/4 v5, 0x0

    .line 365
    invoke-static {v5, v2, v7, v6, v4}, La/jtt0;->a(ILa/fet;La/mm40;Ljava/lang/String;Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    const/high16 v6, 0x3f800000    # 1.0f

    .line 369
    .line 370
    invoke-virtual {v3, v6, v14, v13}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    invoke-virtual {v3, v15, v4}, La/zhg0;->b(La/yx7;La/mm40;)La/mm40;

    .line 375
    .line 376
    .line 377
    move-result-object v4

    .line 378
    const-string v5, "BestOfTestTag"

    .line 379
    .line 380
    invoke-static {v4, v5}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 381
    .line 382
    .line 383
    move-result-object v4

    .line 384
    move-object/from16 v5, v22

    .line 385
    .line 386
    invoke-static {}, La/g1t0;->j()La/y9q0;

    .line 387
    .line 388
    .line 389
    move-result-object v22

    .line 390
    move-object/from16 v20, v3

    .line 391
    .line 392
    move-object v3, v4

    .line 393
    move-object v7, v5

    .line 394
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 395
    .line 396
    .line 397
    move-result-wide v4

    .line 398
    iget-object v2, v12, La/jb30;->b:Ljava/lang/String;

    .line 399
    .line 400
    move-object/from16 v21, v14

    .line 401
    .line 402
    new-instance v14, La/f2q0;

    .line 403
    .line 404
    const/4 v6, 0x3

    .line 405
    invoke-direct {v14, v6}, La/f2q0;-><init>(I)V

    .line 406
    .line 407
    .line 408
    const/16 v25, 0x0

    .line 409
    .line 410
    const v26, 0x1fbf8

    .line 411
    .line 412
    .line 413
    const/4 v6, 0x0

    .line 414
    move-object/from16 v29, v7

    .line 415
    .line 416
    move-object/from16 v24, v8

    .line 417
    .line 418
    const-wide/16 v7, 0x0

    .line 419
    .line 420
    move-object/from16 v30, v9

    .line 421
    .line 422
    const/4 v9, 0x0

    .line 423
    move-object/from16 v31, v10

    .line 424
    .line 425
    const/4 v10, 0x0

    .line 426
    move-object/from16 v32, v11

    .line 427
    .line 428
    const/4 v11, 0x0

    .line 429
    move-object/from16 v33, v12

    .line 430
    .line 431
    move/from16 v34, v13

    .line 432
    .line 433
    const-wide/16 v12, 0x0

    .line 434
    .line 435
    move-object/from16 v35, v15

    .line 436
    .line 437
    const/16 v36, 0x2

    .line 438
    .line 439
    const-wide/16 v15, 0x0

    .line 440
    .line 441
    move-object/from16 v37, v17

    .line 442
    .line 443
    const/16 v17, 0x0

    .line 444
    .line 445
    move-object/from16 v38, v18

    .line 446
    .line 447
    const/16 v18, 0x0

    .line 448
    .line 449
    move-object/from16 v39, v19

    .line 450
    .line 451
    const/16 v19, 0x0

    .line 452
    .line 453
    move-object/from16 v40, v20

    .line 454
    .line 455
    const/16 v20, 0x0

    .line 456
    .line 457
    move-object/from16 v41, v21

    .line 458
    .line 459
    const/16 v21, 0x0

    .line 460
    .line 461
    move-object/from16 v42, v24

    .line 462
    .line 463
    const/16 v24, 0x0

    .line 464
    .line 465
    move-object/from16 v23, p2

    .line 466
    .line 467
    move-object/from16 v45, v29

    .line 468
    .line 469
    move-object/from16 v47, v31

    .line 470
    .line 471
    move-object/from16 v44, v32

    .line 472
    .line 473
    move-object/from16 v43, v33

    .line 474
    .line 475
    move/from16 v0, v34

    .line 476
    .line 477
    move-object/from16 v48, v40

    .line 478
    .line 479
    move-object/from16 v46, v41

    .line 480
    .line 481
    const/high16 v1, 0x3f800000    # 1.0f

    .line 482
    .line 483
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 484
    .line 485
    .line 486
    move-object/from16 v2, v23

    .line 487
    .line 488
    move-object/from16 v14, v46

    .line 489
    .line 490
    move-object/from16 v3, v48

    .line 491
    .line 492
    invoke-virtual {v3, v1, v14, v0}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    move-object/from16 v4, v35

    .line 497
    .line 498
    invoke-virtual {v3, v4, v1}, La/zhg0;->b(La/yx7;La/mm40;)La/mm40;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    sget-object v3, La/uc9;->b:La/lw3;

    .line 503
    .line 504
    const/4 v4, 0x6

    .line 505
    move-object/from16 v5, v39

    .line 506
    .line 507
    invoke-static {v3, v5, v2, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 508
    .line 509
    .line 510
    move-result-object v3

    .line 511
    iget-wide v5, v2, La/fet;->T:J

    .line 512
    .line 513
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    invoke-static {v2, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 522
    .line 523
    .line 524
    move-result-object v1

    .line 525
    invoke-virtual {v2}, La/fet;->i0()V

    .line 526
    .line 527
    .line 528
    iget-boolean v7, v2, La/fet;->S:Z

    .line 529
    .line 530
    if-eqz v7, :cond_b

    .line 531
    .line 532
    move-object/from16 v7, v47

    .line 533
    .line 534
    invoke-virtual {v2, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 535
    .line 536
    .line 537
    :goto_a
    move-object/from16 v7, v42

    .line 538
    .line 539
    goto :goto_b

    .line 540
    :cond_b
    invoke-virtual {v2}, La/fet;->r0()V

    .line 541
    .line 542
    .line 543
    goto :goto_a

    .line 544
    :goto_b
    invoke-static {v2, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 545
    .line 546
    .line 547
    move-object/from16 v3, v37

    .line 548
    .line 549
    invoke-static {v2, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 550
    .line 551
    .line 552
    move-object/from16 v3, v44

    .line 553
    .line 554
    invoke-static {v5, v2, v3, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 555
    .line 556
    .line 557
    move-object/from16 v5, v45

    .line 558
    .line 559
    invoke-static {v2, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 560
    .line 561
    .line 562
    const-string v1, "-"

    .line 563
    .line 564
    if-eqz v27, :cond_c

    .line 565
    .line 566
    move-object/from16 v5, v30

    .line 567
    .line 568
    move-object/from16 v3, v38

    .line 569
    .line 570
    invoke-static {v5, v1, v3}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v1

    .line 574
    :goto_c
    move-object/from16 v3, p0

    .line 575
    .line 576
    goto :goto_d

    .line 577
    :cond_c
    move-object/from16 v5, v30

    .line 578
    .line 579
    move-object/from16 v3, v38

    .line 580
    .line 581
    invoke-static {v3, v1, v5}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v1

    .line 585
    goto :goto_c

    .line 586
    :goto_d
    iget-wide v5, v3, La/x1z;->g:J

    .line 587
    .line 588
    invoke-static {v1, v5, v6, v2, v4}, La/ktt0;->c(Ljava/lang/String;JLa/fet;I)V

    .line 589
    .line 590
    .line 591
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 595
    .line 596
    .line 597
    const-string v1, "EventDateTestTag"

    .line 598
    .line 599
    invoke-static {v14, v1}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 600
    .line 601
    .line 602
    move-result-object v1

    .line 603
    invoke-static {}, La/g1t0;->e()La/y9q0;

    .line 604
    .line 605
    .line 606
    move-result-object v22

    .line 607
    invoke-virtual/range {v28 .. v28}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 608
    .line 609
    .line 610
    move-result-wide v4

    .line 611
    move-object/from16 v6, v43

    .line 612
    .line 613
    iget-object v6, v6, La/jb30;->c:Ljava/lang/String;

    .line 614
    .line 615
    const/16 v25, 0x6180

    .line 616
    .line 617
    const v26, 0x1aff8

    .line 618
    .line 619
    .line 620
    move-object v2, v6

    .line 621
    const/4 v6, 0x0

    .line 622
    const-wide/16 v7, 0x0

    .line 623
    .line 624
    const/4 v9, 0x0

    .line 625
    const/4 v10, 0x0

    .line 626
    const/4 v11, 0x0

    .line 627
    const-wide/16 v12, 0x0

    .line 628
    .line 629
    const/4 v14, 0x0

    .line 630
    const-wide/16 v15, 0x0

    .line 631
    .line 632
    const/16 v17, 0x2

    .line 633
    .line 634
    const/16 v18, 0x0

    .line 635
    .line 636
    const/16 v19, 0x1

    .line 637
    .line 638
    const/16 v20, 0x0

    .line 639
    .line 640
    const/16 v21, 0x0

    .line 641
    .line 642
    const/16 v24, 0x30

    .line 643
    .line 644
    move-object/from16 v23, v3

    .line 645
    .line 646
    move-object v3, v1

    .line 647
    move-object/from16 v1, v23

    .line 648
    .line 649
    move-object/from16 v23, p2

    .line 650
    .line 651
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v2, v23

    .line 655
    .line 656
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 657
    .line 658
    .line 659
    goto :goto_e

    .line 660
    :cond_d
    move-object v1, v0

    .line 661
    invoke-virtual {v2}, La/fet;->X()V

    .line 662
    .line 663
    .line 664
    :goto_e
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    if-eqz v0, :cond_e

    .line 669
    .line 670
    new-instance v2, La/a6p0;

    .line 671
    .line 672
    move-object/from16 v3, p1

    .line 673
    .line 674
    move/from16 v4, p3

    .line 675
    .line 676
    const/4 v5, 0x2

    .line 677
    invoke-direct {v2, v1, v3, v4, v5}, La/a6p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 678
    .line 679
    .line 680
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 681
    .line 682
    :cond_e
    return-void
.end method

.method public static final c(La/n0x;La/fet;I)V
    .locals 14

    .line 1
    move/from16 v12, p2

    .line 2
    .line 3
    const v0, 0xad6bbc7

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x2

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v0, v1

    .line 19
    :goto_0
    or-int/2addr v0, v12

    .line 20
    and-int/lit8 v3, v0, 0x3

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v13, 0x1

    .line 24
    if-eq v3, v1, :cond_1

    .line 25
    .line 26
    move v1, v13

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v1, v4

    .line 29
    :goto_1
    and-int/lit8 v3, v0, 0x1

    .line 30
    .line 31
    invoke-virtual {p1, v3, v1}, La/fet;->U(IZ)Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    sget-object v1, La/qmk;->a:La/zcl;

    .line 38
    .line 39
    const/high16 v1, 0x42800000    # 64.0f

    .line 40
    .line 41
    sget-object v3, La/jm40;->b:La/jm40;

    .line 42
    .line 43
    invoke-static {v3, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    sget-object v5, La/zaq0;->b:La/zfn;

    .line 48
    .line 49
    invoke-virtual {p1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    check-cast v6, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 54
    .line 55
    invoke-virtual {v6}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator60-0d7_KjU()J

    .line 56
    .line 57
    .line 58
    move-result-wide v6

    .line 59
    sget-object v8, La/qmk;->g:La/zcl;

    .line 60
    .line 61
    sget-object v10, La/vgg0;->a:La/ugg0;

    .line 62
    .line 63
    new-instance v10, La/ugg0;

    .line 64
    .line 65
    invoke-direct {v10, v8, v8, v8, v8}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 66
    .line 67
    .line 68
    const/high16 v8, 0x3f800000    # 1.0f

    .line 69
    .line 70
    invoke-static {v1, v8, v6, v7, v10}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    sget-object v6, La/gqw0;->e:La/zx7;

    .line 75
    .line 76
    invoke-static {v6, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 77
    .line 78
    .line 79
    move-result-object v4

    .line 80
    iget-wide v6, p1, La/fet;->T:J

    .line 81
    .line 82
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 83
    .line 84
    .line 85
    move-result v6

    .line 86
    invoke-virtual {p1}, La/fet;->m()La/bh90;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {p1, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, La/fet;->i0()V

    .line 100
    .line 101
    .line 102
    iget-boolean v8, p1, La/fet;->S:Z

    .line 103
    .line 104
    if-eqz v8, :cond_2

    .line 105
    .line 106
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 107
    .line 108
    invoke-virtual {p1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_2
    invoke-virtual {p1}, La/fet;->r0()V

    .line 113
    .line 114
    .line 115
    :goto_2
    sget-object v8, La/gqw0;->x:La/shd;

    .line 116
    .line 117
    invoke-static {p1, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 118
    .line 119
    .line 120
    sget-object v4, La/gqw0;->w:La/shd;

    .line 121
    .line 122
    invoke-static {p1, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    sget-object v6, La/gqw0;->y:La/shd;

    .line 130
    .line 131
    invoke-static {p1, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 132
    .line 133
    .line 134
    invoke-static {p1}, La/jpm0;->n(La/fet;)V

    .line 135
    .line 136
    .line 137
    sget-object v4, La/gqw0;->v:La/shd;

    .line 138
    .line 139
    invoke-static {p1, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 140
    .line 141
    .line 142
    const/high16 v1, 0x42000000    # 32.0f

    .line 143
    .line 144
    invoke-static {v3, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v3, La/vgg0;->a:La/ugg0;

    .line 149
    .line 150
    invoke-static {v1, v3}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v1

    .line 154
    const v3, 0x7f08082c

    .line 155
    .line 156
    .line 157
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    invoke-virtual {p1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 166
    .line 167
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 168
    .line 169
    .line 170
    move-result-wide v4

    .line 171
    new-instance v6, La/y3d;

    .line 172
    .line 173
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 174
    .line 175
    .line 176
    sget-object v7, La/gqw0;->A:La/pge;

    .line 177
    .line 178
    shl-int/lit8 v0, v0, 0x6

    .line 179
    .line 180
    and-int/lit16 v0, v0, 0x380

    .line 181
    .line 182
    const/high16 v4, 0xc00000

    .line 183
    .line 184
    or-int v10, v0, v4

    .line 185
    .line 186
    const/16 v11, 0x160

    .line 187
    .line 188
    const/4 v5, 0x0

    .line 189
    move-object v4, v6

    .line 190
    const/4 v6, 0x0

    .line 191
    const/4 v8, 0x0

    .line 192
    move-object v0, v1

    .line 193
    move-object v2, p0

    .line 194
    move-object v9, p1

    .line 195
    invoke-static/range {v0 .. v11}, La/uc9;->c(La/mm40;La/mm40;La/o0x;Ljava/lang/Integer;La/y3d;La/y3d;La/u12;La/qge;La/a4x;La/fet;II)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1, v13}, La/fet;->r(Z)V

    .line 199
    .line 200
    .line 201
    goto :goto_3

    .line 202
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 203
    .line 204
    .line 205
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    if-eqz v0, :cond_4

    .line 210
    .line 211
    new-instance v1, La/g0g;

    .line 212
    .line 213
    const/16 v3, 0x8

    .line 214
    .line 215
    invoke-direct {v1, p0, v12, v3}, La/g0g;-><init>(La/n0x;IB)V

    .line 216
    .line 217
    .line 218
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 219
    .line 220
    :cond_4
    return-void
.end method

.method public static final d(ILa/fet;La/mm40;)V
    .locals 5

    .line 1
    const v0, 0x233918a9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p0, 0x6

    .line 8
    .line 9
    const/4 v1, 0x2

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    invoke-virtual {p1, p2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v0, v1

    .line 21
    :goto_0
    or-int/2addr v0, p0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    move v0, p0

    .line 24
    :goto_1
    and-int/lit8 v2, v0, 0x3

    .line 25
    .line 26
    const/4 v3, 0x0

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eq v2, v1, :cond_2

    .line 29
    .line 30
    move v1, v4

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move v1, v3

    .line 33
    :goto_2
    and-int/2addr v0, v4

    .line 34
    invoke-virtual {p1, v0, v1}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    const/high16 v0, 0x3f800000    # 1.0f

    .line 41
    .line 42
    invoke-static {p2, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v1, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/high16 v1, 0x43950000    # 298.0f

    .line 49
    .line 50
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sget-object v1, La/qmk;->i:La/zcl;

    .line 55
    .line 56
    sget-object v2, La/vgg0;->a:La/ugg0;

    .line 57
    .line 58
    invoke-static {v1, v1, v1, v1, v0}, La/h97;->e(La/zcl;La/zcl;La/zcl;La/zcl;La/mm40;)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-static {v1, p1, v3, v4}, La/vbc;->d0(La/vqm;La/fet;II)La/fqj0;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v0, v1}, La/xbc;->c0(La/mm40;La/fqj0;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-static {v3, p1, v0}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 72
    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_3
    invoke-virtual {p1}, La/fet;->X()V

    .line 76
    .line 77
    .line 78
    :goto_3
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    new-instance v0, La/e0g;

    .line 85
    .line 86
    const/4 v1, 0x3

    .line 87
    invoke-direct {v0, p2, p0, v1}, La/e0g;-><init>(Ljava/lang/Object;IB)V

    .line 88
    .line 89
    .line 90
    iput-object v0, p1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 91
    .line 92
    :cond_4
    return-void
.end method

.method public static final e(La/lc00;La/gdu0;La/m9s;La/ctf0;Z)V
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    iget-object v3, v0, La/gdu0;->c:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v4, v0, La/gdu0;->d:Ljava/lang/String;

    .line 16
    .line 17
    iget-object v5, v0, La/gdu0;->b:Ljava/util/List;

    .line 18
    .line 19
    iget-object v6, v0, La/gdu0;->a:Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 22
    .line 23
    .line 24
    move-result v7

    .line 25
    if-nez v7, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-nez v7, :cond_1

    .line 33
    .line 34
    :goto_0
    return-void

    .line 35
    :cond_1
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    const/4 v8, 0x0

    .line 40
    const-string v9, ""

    .line 41
    .line 42
    if-lez v7, :cond_2

    .line 43
    .line 44
    invoke-interface {v6, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v7, v9

    .line 50
    :goto_1
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v11

    .line 54
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    const/4 v10, 0x1

    .line 62
    if-ge v10, v7, :cond_3

    .line 63
    .line 64
    invoke-interface {v6, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    goto :goto_2

    .line 69
    :cond_3
    move-object v7, v9

    .line 70
    :goto_2
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v12

    .line 74
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 78
    .line 79
    .line 80
    move-result v7

    .line 81
    const/4 v13, 0x2

    .line 82
    if-ge v13, v7, :cond_4

    .line 83
    .line 84
    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move-object v6, v9

    .line 90
    :goto_3
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v6

    .line 94
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 98
    .line 99
    .line 100
    move-result v7

    .line 101
    if-lez v7, :cond_5

    .line 102
    .line 103
    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    move-object v7, v9

    .line 109
    :goto_4
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v14

    .line 113
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-ge v10, v7, :cond_6

    .line 121
    .line 122
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v7

    .line 126
    goto :goto_5

    .line 127
    :cond_6
    move-object v7, v9

    .line 128
    :goto_5
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v15

    .line 132
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    if-ge v13, v7, :cond_7

    .line 140
    .line 141
    invoke-interface {v5, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object v5

    .line 145
    goto :goto_6

    .line 146
    :cond_7
    move-object v5, v9

    .line 147
    :goto_6
    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v16

    .line 151
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, La/jtt0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v17

    .line 158
    invoke-static {v4}, La/jtt0;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v18

    .line 162
    move-object/from16 v3, p2

    .line 163
    .line 164
    iget-object v3, v3, La/m9s;->h:La/qqs;

    .line 165
    .line 166
    iget-object v4, v3, La/qqs;->b:Ljava/lang/String;

    .line 167
    .line 168
    const-string v5, "-"

    .line 169
    .line 170
    filled-new-array {v5}, [Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    const/4 v10, 0x6

    .line 175
    invoke-static {v4, v7, v8, v10}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    check-cast v4, Ljava/lang/String;

    .line 184
    .line 185
    if-eqz v4, :cond_8

    .line 186
    .line 187
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 188
    .line 189
    .line 190
    move-result v4

    .line 191
    goto :goto_7

    .line 192
    :cond_8
    move v4, v8

    .line 193
    :goto_7
    invoke-static {v1, v4, v2}, La/jtt0;->i(La/ctf0;IZ)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object v19

    .line 197
    iget-object v4, v3, La/qqs;->b:Ljava/lang/String;

    .line 198
    .line 199
    filled-new-array {v5}, [Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    invoke-static {v4, v5, v8, v10}, Lkotlin/text/StringsKt;->j0(Ljava/lang/CharSequence;[Ljava/lang/String;II)Ljava/util/List;

    .line 204
    .line 205
    .line 206
    move-result-object v4

    .line 207
    invoke-static {v4}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    check-cast v4, Ljava/lang/String;

    .line 212
    .line 213
    if-eqz v4, :cond_9

    .line 214
    .line 215
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 216
    .line 217
    .line 218
    move-result v4

    .line 219
    goto :goto_8

    .line 220
    :cond_9
    move v4, v8

    .line 221
    :goto_8
    invoke-static {v1, v4, v2}, La/jtt0;->i(La/ctf0;IZ)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v20

    .line 225
    new-instance v2, La/udu0;

    .line 226
    .line 227
    iget-wide v4, v3, La/qqs;->h:J

    .line 228
    .line 229
    invoke-static {v4, v5}, La/znq0;->f(J)J

    .line 230
    .line 231
    .line 232
    move-result-wide v4

    .line 233
    iget-object v3, v3, La/qqs;->k:La/znq0;

    .line 234
    .line 235
    move-object v10, v9

    .line 236
    if-eqz v3, :cond_a

    .line 237
    .line 238
    iget-wide v8, v3, La/znq0;->a:J

    .line 239
    .line 240
    invoke-static {v8, v9}, La/znq0;->f(J)J

    .line 241
    .line 242
    .line 243
    move-result-wide v8

    .line 244
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 245
    .line 246
    .line 247
    move-result-object v3

    .line 248
    goto :goto_9

    .line 249
    :cond_a
    const/4 v3, 0x0

    .line 250
    :goto_9
    invoke-direct {v2, v3, v4, v5}, La/udu0;-><init>(Ljava/lang/Long;J)V

    .line 251
    .line 252
    .line 253
    iget-object v0, v0, La/gdu0;->e:La/ydu0;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 256
    .line 257
    .line 258
    move-result v0

    .line 259
    if-eqz v0, :cond_e

    .line 260
    .line 261
    if-eq v0, v13, :cond_d

    .line 262
    .line 263
    const/4 v3, 0x3

    .line 264
    if-eq v0, v3, :cond_c

    .line 265
    .line 266
    const/4 v3, 0x4

    .line 267
    if-eq v0, v3, :cond_b

    .line 268
    .line 269
    move-object/from16 v22, v10

    .line 270
    .line 271
    goto :goto_b

    .line 272
    :cond_b
    const/4 v7, 0x0

    .line 273
    new-array v0, v7, [Ljava/lang/Object;

    .line 274
    .line 275
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 276
    .line 277
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    const v3, 0x7f130744

    .line 282
    .line 283
    .line 284
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v9

    .line 288
    :goto_a
    move-object/from16 v22, v9

    .line 289
    .line 290
    goto :goto_b

    .line 291
    :cond_c
    const/4 v7, 0x0

    .line 292
    new-array v0, v7, [Ljava/lang/Object;

    .line 293
    .line 294
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 295
    .line 296
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    const v3, 0x7f130fa4

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v9

    .line 307
    goto :goto_a

    .line 308
    :cond_d
    const/4 v7, 0x0

    .line 309
    new-array v0, v7, [Ljava/lang/Object;

    .line 310
    .line 311
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 312
    .line 313
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    const v3, 0x7f130f9e

    .line 318
    .line 319
    .line 320
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v9

    .line 324
    goto :goto_a

    .line 325
    :cond_e
    const/4 v7, 0x0

    .line 326
    new-array v0, v7, [Ljava/lang/Object;

    .line 327
    .line 328
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 329
    .line 330
    invoke-static {v0, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v0

    .line 334
    const v3, 0x7f130232

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object v9

    .line 341
    goto :goto_a

    .line 342
    :goto_b
    new-instance v10, La/xdu0;

    .line 343
    .line 344
    move-object/from16 v21, v2

    .line 345
    .line 346
    move-object v13, v6

    .line 347
    invoke-direct/range {v10 .. v22}, La/xdu0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/udu0;Ljava/lang/String;)V

    .line 348
    .line 349
    .line 350
    move-object/from16 v0, p0

    .line 351
    .line 352
    invoke-virtual {v0, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 353
    .line 354
    .line 355
    return-void
.end method

.method public static final h(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    sparse-switch v0, :sswitch_data_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :sswitch_0
    const-string v0, "multsum"

    .line 19
    .line 20
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const-string p0, "X1 * X2 + X3"

    .line 28
    .line 29
    return-object p0

    .line 30
    :sswitch_1
    const-string v0, "multmult"

    .line 31
    .line 32
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    const-string p0, "X1 * X2 * X3"

    .line 40
    .line 41
    return-object p0

    .line 42
    :sswitch_2
    const-string v0, "sumsum"

    .line 43
    .line 44
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    if-nez p0, :cond_2

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const-string p0, "X1 + X2 + X3"

    .line 52
    .line 53
    return-object p0

    .line 54
    :sswitch_3
    const-string v0, "summult"

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-nez p0, :cond_3

    .line 61
    .line 62
    :goto_0
    const-string p0, ""

    .line 63
    .line 64
    return-object p0

    .line 65
    :cond_3
    const-string p0, "(X1 + X2) * X3"

    .line 66
    .line 67
    return-object p0

    .line 68
    nop

    .line 69
    :sswitch_data_0
    .sparse-switch
        -0x6eb90e05 -> :sswitch_3
        -0x351ea7e0 -> :sswitch_2
        0x26fa8a60 -> :sswitch_1
        0x53d69f1b -> :sswitch_0
    .end sparse-switch
.end method

.method public static final i(La/ctf0;IZ)Ljava/lang/String;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const v1, 0x7f131475

    .line 3
    .line 4
    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    new-array p1, v0, [Ljava/lang/Object;

    .line 8
    .line 9
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 10
    .line 11
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p0, v1, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    new-array p2, v0, [Ljava/lang/Object;

    .line 30
    .line 31
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 32
    .line 33
    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-virtual {p0, v1, p2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    sget-object p2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 42
    .line 43
    invoke-virtual {p0, p2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    new-instance p2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    invoke-direct {p2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string p0, " "

    .line 56
    .line 57
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method public static final j(ILa/fet;)Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La/dy2;->a:La/zfn;

    .line 2
    .line 3
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object v0, La/dy2;->b:La/zfn;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    check-cast p1, Landroid/content/Context;

    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static final k(La/fet;)La/y7t0;
    .locals 2

    .line 1
    sget-object v0, La/djv0;->w:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-static {p0}, La/zcm0;->i(La/fet;)La/djv0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/djv0;->g:La/q33;

    .line 8
    .line 9
    invoke-static {p0}, La/zcm0;->i(La/fet;)La/djv0;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    iget-object p0, p0, La/djv0;->b:La/q33;

    .line 14
    .line 15
    new-instance v1, La/y7t0;

    .line 16
    .line 17
    invoke-direct {v1, v0, p0}, La/y7t0;-><init>(La/vhv0;La/vhv0;)V

    .line 18
    .line 19
    .line 20
    return-object v1
.end method

.method public static final l(II)I
    .locals 0

    .line 1
    shr-int/2addr p0, p1

    .line 2
    and-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    return p0
.end method

.method public static final m([Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    add-int/lit8 v0, v0, 0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p1, v2, p0, v0}, La/qx3;->i(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p1, 0x2

    .line 12
    .line 13
    array-length v2, p0

    .line 14
    invoke-static {v1, p1, v2, p0, v0}, La/qx3;->e(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    aput-object p2, v0, p1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x1

    .line 20
    .line 21
    aput-object p3, v0, p1

    .line 22
    .line 23
    return-object v0
.end method

.method public static final o(FJ)J
    .locals 1

    .line 1
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    const/high16 v0, 0x3f800000    # 1.0f

    .line 8
    .line 9
    cmpl-float v0, p0, v0

    .line 10
    .line 11
    if-ltz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {p1, p2}, La/y3d;->d(J)F

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    mul-float/2addr v0, p0

    .line 19
    invoke-static {v0, p1, p2}, La/y3d;->c(FJ)J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    return-wide p0

    .line 24
    :cond_1
    :goto_0
    return-wide p1
.end method

.method public static final p(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x2

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p0, v2, p1, v0}, La/qx3;->i(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x2

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p0, v1, v2, p1, v0}, La/qx3;->e(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final q(I[Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    .line 1
    array-length v0, p1

    .line 2
    add-int/lit8 v0, v0, -0x1

    .line 3
    .line 4
    new-array v0, v0, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    const/4 v2, 0x6

    .line 8
    invoke-static {v1, p0, v2, p1, v0}, La/qx3;->i(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    add-int/lit8 v1, p0, 0x1

    .line 12
    .line 13
    array-length v2, p1

    .line 14
    invoke-static {p0, v1, v2, p1, v0}, La/qx3;->e(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    return-object v0
.end method

.method public static final r(La/iwo0;Ljava/lang/String;Z)La/ixo0;
    .locals 9

    .line 1
    iget-boolean v1, p0, La/iwo0;->a:Z

    .line 2
    .line 3
    iget-wide v2, p0, La/iwo0;->d:D

    .line 4
    .line 5
    move-wide v3, v2

    .line 6
    iget-object v2, p0, La/iwo0;->c:Ljava/lang/String;

    .line 7
    .line 8
    iget-boolean v0, p0, La/iwo0;->b:Z

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    goto :goto_2

    .line 15
    :cond_0
    const-wide/16 v5, 0x0

    .line 16
    .line 17
    cmpg-double v7, v3, v5

    .line 18
    .line 19
    if-nez v7, :cond_1

    .line 20
    .line 21
    const/4 p1, 0x0

    .line 22
    :goto_0
    move-object v3, p1

    .line 23
    goto :goto_3

    .line 24
    :cond_1
    new-instance v7, La/zwo0;

    .line 25
    .line 26
    sget v8, La/cy7;->a:I

    .line 27
    .line 28
    sget-object v8, La/pn40;->a:La/pn40;

    .line 29
    .line 30
    invoke-static {p1, v3, v4}, La/pn40;->p(Ljava/lang/String;D)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-static {p1}, La/cy7;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    cmpl-double v3, v3, v5

    .line 39
    .line 40
    if-lez v3, :cond_2

    .line 41
    .line 42
    sget-object v3, La/d4d;->j:La/d4d;

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_2
    sget-object v3, La/d4d;->y:La/d4d;

    .line 46
    .line 47
    :goto_1
    invoke-direct {v7, p1, v3}, La/zwo0;-><init>(Ljava/lang/String;La/d4d;)V

    .line 48
    .line 49
    .line 50
    move-object v3, v7

    .line 51
    goto :goto_3

    .line 52
    :cond_3
    :goto_2
    sget-object p1, La/xwo0;->a:La/xwo0;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :goto_3
    iget-object v4, p0, La/iwo0;->e:Ljava/lang/String;

    .line 56
    .line 57
    if-nez v0, :cond_6

    .line 58
    .line 59
    if-eqz p2, :cond_4

    .line 60
    .line 61
    goto :goto_6

    .line 62
    :cond_4
    iget-object p0, p0, La/iwo0;->f:Ljava/util/List;

    .line 63
    .line 64
    new-instance p1, Ljava/util/ArrayList;

    .line 65
    .line 66
    const/16 p2, 0xa

    .line 67
    .line 68
    invoke-static {p0, p2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-eqz p2, :cond_5

    .line 84
    .line 85
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, La/mvo0;

    .line 90
    .line 91
    new-instance v0, La/fuy;

    .line 92
    .line 93
    iget-object v5, p2, La/mvo0;->a:Ljava/lang/String;

    .line 94
    .line 95
    iget-object p2, p2, La/mvo0;->b:Ljava/lang/String;

    .line 96
    .line 97
    invoke-direct {v0, v5, p2}, La/fuy;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_4

    .line 104
    :cond_5
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    new-instance p1, La/sn7;

    .line 109
    .line 110
    invoke-direct {p1, p0}, La/sn7;-><init>(La/i4;)V

    .line 111
    .line 112
    .line 113
    :goto_5
    move-object v5, p1

    .line 114
    goto :goto_7

    .line 115
    :cond_6
    :goto_6
    sget-object p1, La/rn7;->a:La/rn7;

    .line 116
    .line 117
    goto :goto_5

    .line 118
    :goto_7
    new-instance v0, La/ixo0;

    .line 119
    .line 120
    invoke-direct/range {v0 .. v5}, La/ixo0;-><init>(ZLjava/lang/String;La/bxo0;Ljava/lang/String;La/tn7;)V

    .line 121
    .line 122
    .line 123
    return-object v0
.end method

.method public static final s(La/kpq0;)La/gpq0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v0, v0, La/kpq0;->a:Ljava/util/List;

    .line 4
    .line 5
    if-eqz v0, :cond_7

    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v2, 0xa

    .line 10
    .line 11
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-eqz v2, :cond_8

    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/e3b;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance v3, La/z2b;

    .line 38
    .line 39
    iget-object v4, v2, La/e3b;->a:Ljava/lang/String;

    .line 40
    .line 41
    const-string v5, ""

    .line 42
    .line 43
    if-nez v4, :cond_0

    .line 44
    .line 45
    move-object v12, v5

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    move-object v12, v4

    .line 48
    :goto_1
    iget-object v4, v2, La/e3b;->b:Ljava/lang/Integer;

    .line 49
    .line 50
    const/4 v6, -0x1

    .line 51
    if-eqz v4, :cond_1

    .line 52
    .line 53
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    move v10, v4

    .line 58
    goto :goto_2

    .line 59
    :cond_1
    move v10, v6

    .line 60
    :goto_2
    iget-object v4, v2, La/e3b;->c:Ljava/lang/Double;

    .line 61
    .line 62
    const-wide/high16 v7, -0x4010000000000000L    # -1.0

    .line 63
    .line 64
    if-eqz v4, :cond_2

    .line 65
    .line 66
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 67
    .line 68
    .line 69
    move-result-wide v13

    .line 70
    goto :goto_3

    .line 71
    :cond_2
    move-wide v13, v7

    .line 72
    :goto_3
    iget-object v4, v2, La/e3b;->d:Ljava/lang/Double;

    .line 73
    .line 74
    if-eqz v4, :cond_3

    .line 75
    .line 76
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 77
    .line 78
    .line 79
    move-result-wide v15

    .line 80
    goto :goto_4

    .line 81
    :cond_3
    move-wide v15, v7

    .line 82
    :goto_4
    iget-object v4, v2, La/e3b;->e:Ljava/lang/String;

    .line 83
    .line 84
    if-nez v4, :cond_4

    .line 85
    .line 86
    goto :goto_5

    .line 87
    :cond_4
    move-object v5, v4

    .line 88
    :goto_5
    iget-object v4, v2, La/e3b;->f:Ljava/lang/Double;

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    .line 93
    .line 94
    .line 95
    move-result-wide v7

    .line 96
    :cond_5
    move-wide v8, v7

    .line 97
    iget-object v2, v2, La/e3b;->g:Ljava/lang/Integer;

    .line 98
    .line 99
    if-eqz v2, :cond_6

    .line 100
    .line 101
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    :cond_6
    move-wide/from16 v17, v13

    .line 106
    .line 107
    move-object v13, v5

    .line 108
    move-wide/from16 v4, v17

    .line 109
    .line 110
    move v11, v6

    .line 111
    move-wide v6, v15

    .line 112
    invoke-direct/range {v3 .. v13}, La/z2b;-><init>(DDDIILjava/lang/String;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_7
    const/4 v1, 0x0

    .line 120
    :cond_8
    if-nez v1, :cond_9

    .line 121
    .line 122
    sget-object v1, La/iun;->a:La/iun;

    .line 123
    .line 124
    :cond_9
    new-instance v0, La/gpq0;

    .line 125
    .line 126
    invoke-direct {v0, v1}, La/gpq0;-><init>(Ljava/util/List;)V

    .line 127
    .line 128
    .line 129
    return-object v0
.end method

.method public static final t(Ljava/util/Map$Entry;)La/xjr0;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    check-cast v0, Ljava/lang/Integer;

    .line 9
    .line 10
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, Ljava/lang/Iterable;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayList;

    .line 17
    .line 18
    const/16 v2, 0xa

    .line 19
    .line 20
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, La/md80;

    .line 42
    .line 43
    iget-byte v2, v2, La/md80;->a:B

    .line 44
    .line 45
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    new-instance p0, La/xjr0;

    .line 54
    .line 55
    invoke-direct {p0, v0, v1}, La/xjr0;-><init>(Ljava/lang/Integer;Ljava/util/ArrayList;)V

    .line 56
    .line 57
    .line 58
    return-object p0
.end method

.method public static final u(La/f280;Ljava/lang/Integer;La/v12;I)La/wbv0;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    new-instance v1, La/wbv0;

    .line 7
    .line 8
    iget v2, v0, La/f280;->a:I

    .line 9
    .line 10
    iget-object v3, v0, La/f280;->d:La/seo;

    .line 11
    .line 12
    iget-wide v4, v3, La/seo;->e:D

    .line 13
    .line 14
    iget-object v6, v3, La/seo;->f:Ljava/lang/Double;

    .line 15
    .line 16
    const-string v7, "_"

    .line 17
    .line 18
    move/from16 v8, p3

    .line 19
    .line 20
    invoke-static {v2, v8, v7}, La/w6x;->n(IILjava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    move-object v7, v1

    .line 25
    move-object v1, v2

    .line 26
    iget v2, v0, La/f280;->a:I

    .line 27
    .line 28
    iget-object v0, v0, La/f280;->c:Ljava/lang/String;

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    sget-object v8, La/ujn;->h:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v8, v0}, La/ohs0;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    const-string v0, ""

    .line 40
    .line 41
    :goto_0
    new-instance v8, La/chl0;

    .line 42
    .line 43
    iget-object v9, v3, La/seo;->m:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v10, v3, La/seo;->g:Ljava/lang/String;

    .line 46
    .line 47
    iget-boolean v11, v3, La/seo;->h:Z

    .line 48
    .line 49
    if-eqz v11, :cond_1

    .line 50
    .line 51
    sget-object v4, La/k0d;->b:La/k0d;

    .line 52
    .line 53
    :goto_1
    move-object v11, v4

    .line 54
    goto :goto_2

    .line 55
    :cond_1
    if-nez v6, :cond_2

    .line 56
    .line 57
    sget-object v4, La/k0d;->a:La/k0d;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 61
    .line 62
    .line 63
    move-result-wide v11

    .line 64
    cmpl-double v11, v4, v11

    .line 65
    .line 66
    if-lez v11, :cond_3

    .line 67
    .line 68
    sget-object v4, La/k0d;->c:La/k0d;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    .line 72
    .line 73
    .line 74
    move-result-wide v11

    .line 75
    cmpg-double v4, v4, v11

    .line 76
    .line 77
    if-gez v4, :cond_4

    .line 78
    .line 79
    sget-object v4, La/k0d;->d:La/k0d;

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_4
    sget-object v4, La/k0d;->a:La/k0d;

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :goto_2
    sget-object v12, La/a65;->a:La/a65;

    .line 86
    .line 87
    iget-boolean v13, v3, La/seo;->j:Z

    .line 88
    .line 89
    iget-boolean v14, v3, La/seo;->k:Z

    .line 90
    .line 91
    new-instance v15, La/xgl0;

    .line 92
    .line 93
    const-wide/16 v27, 0x0

    .line 94
    .line 95
    const/16 v29, 0x0

    .line 96
    .line 97
    const-wide/16 v16, -0x1

    .line 98
    .line 99
    const-wide/16 v18, 0x0

    .line 100
    .line 101
    const-wide/16 v20, 0x0

    .line 102
    .line 103
    const-string v22, ""

    .line 104
    .line 105
    const/16 v23, 0x0

    .line 106
    .line 107
    const-wide/16 v24, 0x0

    .line 108
    .line 109
    const/16 v26, 0x0

    .line 110
    .line 111
    invoke-direct/range {v15 .. v29}, La/xgl0;-><init>(JDDLjava/lang/String;IJIJZ)V

    .line 112
    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    const/16 v16, 0x0

    .line 116
    .line 117
    move-object/from16 v17, v15

    .line 118
    .line 119
    move v15, v3

    .line 120
    invoke-direct/range {v8 .. v17}, La/chl0;-><init>(Ljava/lang/String;Ljava/lang/String;La/k0d;La/a65;ZZZZLa/xgl0;)V

    .line 121
    .line 122
    .line 123
    move-object/from16 v5, p1

    .line 124
    .line 125
    move-object/from16 v6, p2

    .line 126
    .line 127
    move-object v3, v0

    .line 128
    move-object v0, v7

    .line 129
    move-object v4, v8

    .line 130
    invoke-direct/range {v0 .. v6}, La/wbv0;-><init>(Ljava/lang/String;ILjava/lang/String;La/chl0;Ljava/lang/Integer;La/v12;)V

    .line 131
    .line 132
    .line 133
    return-object v0
.end method

.method public static v(J[BII)I
    .locals 2

    .line 1
    if-eqz p4, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    if-eq p4, v0, :cond_1

    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    if-ne p4, v0, :cond_0

    .line 8
    .line 9
    invoke-static {p2, p0, p1}, La/hft0;->e([BJ)B

    .line 10
    .line 11
    .line 12
    move-result p4

    .line 13
    const-wide/16 v0, 0x1

    .line 14
    .line 15
    add-long/2addr p0, v0

    .line 16
    invoke-static {p2, p0, p1}, La/hft0;->e([BJ)B

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    invoke-static {p3, p4, p0}, La/ptt0;->c(III)I

    .line 21
    .line 22
    .line 23
    move-result p0

    .line 24
    return p0

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/AssertionError;

    .line 26
    .line 27
    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    .line 28
    .line 29
    .line 30
    throw p0

    .line 31
    :cond_1
    invoke-static {p2, p0, p1}, La/hft0;->e([BJ)B

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p3, p0}, La/ptt0;->b(II)I

    .line 36
    .line 37
    .line 38
    move-result p0

    .line 39
    return p0

    .line 40
    :cond_2
    sget-object p0, La/ptt0;->a:La/jtt0;

    .line 41
    .line 42
    const/16 p0, -0xc

    .line 43
    .line 44
    if-le p3, p0, :cond_3

    .line 45
    .line 46
    const/4 p0, -0x1

    .line 47
    return p0

    .line 48
    :cond_3
    return p3
.end method

.method public static final w(La/lwv0;)Ljava/util/LinkedHashMap;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "XBottomSheetMetadataKey"

    .line 7
    .line 8
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public static x(Ljava/util/Comparator;Ljava/util/Collection;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p1, Ljava/util/SortedSet;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, Ljava/util/SortedSet;

    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/SortedSet;->comparator()Ljava/util/Comparator;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object p1, La/dpw0;->b:La/dpw0;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    instance-of v0, p1, La/oow0;

    .line 23
    .line 24
    if-eqz v0, :cond_2

    .line 25
    .line 26
    check-cast p1, La/oow0;

    .line 27
    .line 28
    iget-object p1, p1, La/oow0;->g:Ljava/util/Comparator;

    .line 29
    .line 30
    :cond_1
    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    :cond_2
    const/4 p0, 0x0

    .line 36
    return p0
.end method


# virtual methods
.method public final f([BII)Ljava/lang/String;
    .locals 9

    .line 1
    iget-byte p0, p0, La/jtt0;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/String;

    .line 7
    .line 8
    sget-object v0, La/cmx;->a:Ljava/nio/charset/Charset;

    .line 9
    .line 10
    invoke-direct {p0, p1, p2, p3, v0}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    .line 11
    .line 12
    .line 13
    const-string v1, "\ufffd"

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    add-int/2addr p3, p2

    .line 27
    invoke-static {p1, p2, p3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    if-eqz p1, :cond_1

    .line 36
    .line 37
    :goto_0
    return-object p0

    .line 38
    :cond_1
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    throw p0

    .line 43
    :pswitch_0
    or-int p0, p2, p3

    .line 44
    .line 45
    array-length v0, p1

    .line 46
    sub-int/2addr v0, p2

    .line 47
    sub-int/2addr v0, p3

    .line 48
    or-int/2addr p0, v0

    .line 49
    if-ltz p0, :cond_10

    .line 50
    .line 51
    add-int p0, p2, p3

    .line 52
    .line 53
    new-array p3, p3, [C

    .line 54
    .line 55
    const/4 v0, 0x0

    .line 56
    move v1, v0

    .line 57
    :goto_1
    if-ge p2, p0, :cond_2

    .line 58
    .line 59
    aget-byte v2, p1, p2

    .line 60
    .line 61
    if-ltz v2, :cond_2

    .line 62
    .line 63
    add-int/lit8 p2, p2, 0x1

    .line 64
    .line 65
    add-int/lit8 v3, v1, 0x1

    .line 66
    .line 67
    int-to-char v2, v2

    .line 68
    aput-char v2, p3, v1

    .line 69
    .line 70
    move v1, v3

    .line 71
    goto :goto_1

    .line 72
    :cond_2
    :goto_2
    if-ge p2, p0, :cond_f

    .line 73
    .line 74
    add-int/lit8 v2, p2, 0x1

    .line 75
    .line 76
    aget-byte v3, p1, p2

    .line 77
    .line 78
    if-ltz v3, :cond_4

    .line 79
    .line 80
    add-int/lit8 p2, v1, 0x1

    .line 81
    .line 82
    int-to-char v3, v3

    .line 83
    aput-char v3, p3, v1

    .line 84
    .line 85
    :goto_3
    if-ge v2, p0, :cond_3

    .line 86
    .line 87
    aget-byte v1, p1, v2

    .line 88
    .line 89
    if-ltz v1, :cond_3

    .line 90
    .line 91
    add-int/lit8 v2, v2, 0x1

    .line 92
    .line 93
    add-int/lit8 v3, p2, 0x1

    .line 94
    .line 95
    int-to-char v1, v1

    .line 96
    aput-char v1, p3, p2

    .line 97
    .line 98
    move p2, v3

    .line 99
    goto :goto_3

    .line 100
    :cond_3
    move v1, p2

    .line 101
    move p2, v2

    .line 102
    goto :goto_2

    .line 103
    :cond_4
    const/16 v4, -0x20

    .line 104
    .line 105
    if-ge v3, v4, :cond_7

    .line 106
    .line 107
    if-ge v2, p0, :cond_6

    .line 108
    .line 109
    add-int/lit8 p2, p2, 0x2

    .line 110
    .line 111
    aget-byte v2, p1, v2

    .line 112
    .line 113
    add-int/lit8 v4, v1, 0x1

    .line 114
    .line 115
    const/16 v5, -0x3e

    .line 116
    .line 117
    if-lt v3, v5, :cond_5

    .line 118
    .line 119
    invoke-static {v2}, La/etm0;->o(B)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-nez v5, :cond_5

    .line 124
    .line 125
    and-int/lit8 v3, v3, 0x1f

    .line 126
    .line 127
    shl-int/lit8 v3, v3, 0x6

    .line 128
    .line 129
    and-int/lit8 v2, v2, 0x3f

    .line 130
    .line 131
    or-int/2addr v2, v3

    .line 132
    int-to-char v2, v2

    .line 133
    aput-char v2, p3, v1

    .line 134
    .line 135
    move v1, v4

    .line 136
    goto :goto_2

    .line 137
    :cond_5
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    throw p0

    .line 142
    :cond_6
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    throw p0

    .line 147
    :cond_7
    const/16 v5, -0x10

    .line 148
    .line 149
    if-ge v3, v5, :cond_c

    .line 150
    .line 151
    add-int/lit8 v5, p0, -0x1

    .line 152
    .line 153
    if-ge v2, v5, :cond_b

    .line 154
    .line 155
    add-int/lit8 v5, p2, 0x2

    .line 156
    .line 157
    aget-byte v2, p1, v2

    .line 158
    .line 159
    add-int/lit8 p2, p2, 0x3

    .line 160
    .line 161
    aget-byte v5, p1, v5

    .line 162
    .line 163
    add-int/lit8 v6, v1, 0x1

    .line 164
    .line 165
    invoke-static {v2}, La/etm0;->o(B)Z

    .line 166
    .line 167
    .line 168
    move-result v7

    .line 169
    if-nez v7, :cond_a

    .line 170
    .line 171
    const/16 v7, -0x60

    .line 172
    .line 173
    if-ne v3, v4, :cond_8

    .line 174
    .line 175
    if-lt v2, v7, :cond_a

    .line 176
    .line 177
    :cond_8
    const/16 v4, -0x13

    .line 178
    .line 179
    if-ne v3, v4, :cond_9

    .line 180
    .line 181
    if-ge v2, v7, :cond_a

    .line 182
    .line 183
    :cond_9
    invoke-static {v5}, La/etm0;->o(B)Z

    .line 184
    .line 185
    .line 186
    move-result v4

    .line 187
    if-nez v4, :cond_a

    .line 188
    .line 189
    and-int/lit8 v3, v3, 0xf

    .line 190
    .line 191
    shl-int/lit8 v3, v3, 0xc

    .line 192
    .line 193
    and-int/lit8 v2, v2, 0x3f

    .line 194
    .line 195
    shl-int/lit8 v2, v2, 0x6

    .line 196
    .line 197
    or-int/2addr v2, v3

    .line 198
    and-int/lit8 v3, v5, 0x3f

    .line 199
    .line 200
    or-int/2addr v2, v3

    .line 201
    int-to-char v2, v2

    .line 202
    aput-char v2, p3, v1

    .line 203
    .line 204
    move v1, v6

    .line 205
    goto/16 :goto_2

    .line 206
    .line 207
    :cond_a
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    throw p0

    .line 212
    :cond_b
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    throw p0

    .line 217
    :cond_c
    add-int/lit8 v4, p0, -0x2

    .line 218
    .line 219
    if-ge v2, v4, :cond_e

    .line 220
    .line 221
    add-int/lit8 v4, p2, 0x2

    .line 222
    .line 223
    aget-byte v2, p1, v2

    .line 224
    .line 225
    add-int/lit8 v5, p2, 0x3

    .line 226
    .line 227
    aget-byte v4, p1, v4

    .line 228
    .line 229
    add-int/lit8 p2, p2, 0x4

    .line 230
    .line 231
    aget-byte v5, p1, v5

    .line 232
    .line 233
    add-int/lit8 v6, v1, 0x1

    .line 234
    .line 235
    invoke-static {v2}, La/etm0;->o(B)Z

    .line 236
    .line 237
    .line 238
    move-result v7

    .line 239
    if-nez v7, :cond_d

    .line 240
    .line 241
    shl-int/lit8 v7, v3, 0x1c

    .line 242
    .line 243
    add-int/lit8 v8, v2, 0x70

    .line 244
    .line 245
    add-int/2addr v8, v7

    .line 246
    shr-int/lit8 v7, v8, 0x1e

    .line 247
    .line 248
    if-nez v7, :cond_d

    .line 249
    .line 250
    invoke-static {v4}, La/etm0;->o(B)Z

    .line 251
    .line 252
    .line 253
    move-result v7

    .line 254
    if-nez v7, :cond_d

    .line 255
    .line 256
    invoke-static {v5}, La/etm0;->o(B)Z

    .line 257
    .line 258
    .line 259
    move-result v7

    .line 260
    if-nez v7, :cond_d

    .line 261
    .line 262
    and-int/lit8 v3, v3, 0x7

    .line 263
    .line 264
    shl-int/lit8 v3, v3, 0x12

    .line 265
    .line 266
    and-int/lit8 v2, v2, 0x3f

    .line 267
    .line 268
    shl-int/lit8 v2, v2, 0xc

    .line 269
    .line 270
    or-int/2addr v2, v3

    .line 271
    and-int/lit8 v3, v4, 0x3f

    .line 272
    .line 273
    shl-int/lit8 v3, v3, 0x6

    .line 274
    .line 275
    or-int/2addr v2, v3

    .line 276
    and-int/lit8 v3, v5, 0x3f

    .line 277
    .line 278
    or-int/2addr v2, v3

    .line 279
    ushr-int/lit8 v3, v2, 0xa

    .line 280
    .line 281
    const v4, 0xd7c0

    .line 282
    .line 283
    .line 284
    add-int/2addr v3, v4

    .line 285
    int-to-char v3, v3

    .line 286
    aput-char v3, p3, v1

    .line 287
    .line 288
    and-int/lit16 v2, v2, 0x3ff

    .line 289
    .line 290
    const v3, 0xdc00

    .line 291
    .line 292
    .line 293
    add-int/2addr v2, v3

    .line 294
    int-to-char v2, v2

    .line 295
    aput-char v2, p3, v6

    .line 296
    .line 297
    add-int/lit8 v1, v1, 0x2

    .line 298
    .line 299
    goto/16 :goto_2

    .line 300
    .line 301
    :cond_d
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 302
    .line 303
    .line 304
    move-result-object p0

    .line 305
    throw p0

    .line 306
    :cond_e
    invoke-static {}, La/ynx;->b()La/ynx;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    throw p0

    .line 311
    :cond_f
    new-instance p0, Ljava/lang/String;

    .line 312
    .line 313
    invoke-direct {p0, p3, v0, v1}, Ljava/lang/String;-><init>([CII)V

    .line 314
    .line 315
    .line 316
    return-object p0

    .line 317
    :cond_10
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 318
    .line 319
    array-length p1, p1

    .line 320
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 321
    .line 322
    .line 323
    move-result-object p1

    .line 324
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p2

    .line 328
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 329
    .line 330
    .line 331
    move-result-object p3

    .line 332
    filled-new-array {p1, p2, p3}, [Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    const-string p2, "buffer length=%d, index=%d, size=%d"

    .line 337
    .line 338
    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object p1

    .line 342
    invoke-direct {p0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 343
    .line 344
    .line 345
    throw p0

    .line 346
    nop

    .line 347
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/String;[BII)I
    .locals 22

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p0

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    iget-byte v3, v3, La/jtt0;->a:B

    .line 12
    .line 13
    const/16 v5, 0x800

    .line 14
    .line 15
    const/16 v6, 0x80

    .line 16
    .line 17
    const v7, 0xd800

    .line 18
    .line 19
    .line 20
    const v8, 0xdfff

    .line 21
    .line 22
    .line 23
    packed-switch v3, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    int-to-long v10, v2

    .line 27
    int-to-long v12, v4

    .line 28
    add-long/2addr v12, v10

    .line 29
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-gt v3, v4, :cond_c

    .line 34
    .line 35
    array-length v14, v1

    .line 36
    sub-int/2addr v14, v4

    .line 37
    if-lt v14, v2, :cond_c

    .line 38
    .line 39
    const/4 v2, 0x0

    .line 40
    :goto_0
    const-wide/16 v14, 0x1

    .line 41
    .line 42
    if-ge v2, v3, :cond_0

    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    if-ge v4, v6, :cond_0

    .line 49
    .line 50
    add-long/2addr v14, v10

    .line 51
    int-to-byte v4, v4

    .line 52
    invoke-static {v1, v10, v11, v4}, La/hft0;->l([BJB)V

    .line 53
    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    move-wide v10, v14

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    if-ne v2, v3, :cond_2

    .line 60
    .line 61
    :cond_1
    long-to-int v9, v10

    .line 62
    goto/16 :goto_7

    .line 63
    .line 64
    :cond_2
    :goto_1
    if-ge v2, v3, :cond_1

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-ge v4, v6, :cond_3

    .line 71
    .line 72
    cmp-long v16, v10, v12

    .line 73
    .line 74
    if-gez v16, :cond_3

    .line 75
    .line 76
    add-long v16, v10, v14

    .line 77
    .line 78
    int-to-byte v4, v4

    .line 79
    invoke-static {v1, v10, v11, v4}, La/hft0;->l([BJB)V

    .line 80
    .line 81
    .line 82
    move-wide/from16 p3, v14

    .line 83
    .line 84
    move-wide/from16 v10, v16

    .line 85
    .line 86
    goto/16 :goto_4

    .line 87
    .line 88
    :cond_3
    const-wide/16 v16, 0x2

    .line 89
    .line 90
    if-ge v4, v5, :cond_4

    .line 91
    .line 92
    sub-long v18, v12, v16

    .line 93
    .line 94
    cmp-long v18, v10, v18

    .line 95
    .line 96
    if-gtz v18, :cond_4

    .line 97
    .line 98
    move-wide/from16 p3, v14

    .line 99
    .line 100
    add-long v14, v10, p3

    .line 101
    .line 102
    ushr-int/lit8 v9, v4, 0x6

    .line 103
    .line 104
    or-int/lit16 v9, v9, 0x3c0

    .line 105
    .line 106
    int-to-byte v9, v9

    .line 107
    invoke-static {v1, v10, v11, v9}, La/hft0;->l([BJB)V

    .line 108
    .line 109
    .line 110
    add-long v10, v10, v16

    .line 111
    .line 112
    and-int/lit8 v4, v4, 0x3f

    .line 113
    .line 114
    or-int/2addr v4, v6

    .line 115
    int-to-byte v4, v4

    .line 116
    invoke-static {v1, v14, v15, v4}, La/hft0;->l([BJB)V

    .line 117
    .line 118
    .line 119
    goto/16 :goto_4

    .line 120
    .line 121
    :cond_4
    move-wide/from16 p3, v14

    .line 122
    .line 123
    const-wide/16 v14, 0x3

    .line 124
    .line 125
    if-lt v4, v7, :cond_6

    .line 126
    .line 127
    if-ge v8, v4, :cond_5

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_5
    move-wide/from16 v18, v14

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    :goto_2
    sub-long v18, v12, v14

    .line 134
    .line 135
    cmp-long v9, v10, v18

    .line 136
    .line 137
    if-gtz v9, :cond_5

    .line 138
    .line 139
    move-wide/from16 v18, v14

    .line 140
    .line 141
    add-long v14, v10, p3

    .line 142
    .line 143
    ushr-int/lit8 v9, v4, 0xc

    .line 144
    .line 145
    or-int/lit16 v9, v9, 0x1e0

    .line 146
    .line 147
    int-to-byte v9, v9

    .line 148
    invoke-static {v1, v10, v11, v9}, La/hft0;->l([BJB)V

    .line 149
    .line 150
    .line 151
    add-long v8, v10, v16

    .line 152
    .line 153
    ushr-int/lit8 v16, v4, 0x6

    .line 154
    .line 155
    and-int/lit8 v5, v16, 0x3f

    .line 156
    .line 157
    or-int/2addr v5, v6

    .line 158
    int-to-byte v5, v5

    .line 159
    invoke-static {v1, v14, v15, v5}, La/hft0;->l([BJB)V

    .line 160
    .line 161
    .line 162
    add-long v10, v10, v18

    .line 163
    .line 164
    and-int/lit8 v4, v4, 0x3f

    .line 165
    .line 166
    or-int/2addr v4, v6

    .line 167
    int-to-byte v4, v4

    .line 168
    invoke-static {v1, v8, v9, v4}, La/hft0;->l([BJB)V

    .line 169
    .line 170
    .line 171
    goto :goto_4

    .line 172
    :goto_3
    const-wide/16 v8, 0x4

    .line 173
    .line 174
    sub-long v14, v12, v8

    .line 175
    .line 176
    cmp-long v5, v10, v14

    .line 177
    .line 178
    if-gtz v5, :cond_9

    .line 179
    .line 180
    add-int/lit8 v5, v2, 0x1

    .line 181
    .line 182
    if-eq v5, v3, :cond_8

    .line 183
    .line 184
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 185
    .line 186
    .line 187
    move-result v2

    .line 188
    invoke-static {v4, v2}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 189
    .line 190
    .line 191
    move-result v14

    .line 192
    if-eqz v14, :cond_7

    .line 193
    .line 194
    invoke-static {v4, v2}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 195
    .line 196
    .line 197
    move-result v2

    .line 198
    add-long v14, v10, p3

    .line 199
    .line 200
    ushr-int/lit8 v4, v2, 0x12

    .line 201
    .line 202
    or-int/lit16 v4, v4, 0xf0

    .line 203
    .line 204
    int-to-byte v4, v4

    .line 205
    invoke-static {v1, v10, v11, v4}, La/hft0;->l([BJB)V

    .line 206
    .line 207
    .line 208
    move-wide/from16 v20, v8

    .line 209
    .line 210
    add-long v8, v10, v16

    .line 211
    .line 212
    ushr-int/lit8 v4, v2, 0xc

    .line 213
    .line 214
    and-int/lit8 v4, v4, 0x3f

    .line 215
    .line 216
    or-int/2addr v4, v6

    .line 217
    int-to-byte v4, v4

    .line 218
    invoke-static {v1, v14, v15, v4}, La/hft0;->l([BJB)V

    .line 219
    .line 220
    .line 221
    add-long v14, v10, v18

    .line 222
    .line 223
    ushr-int/lit8 v4, v2, 0x6

    .line 224
    .line 225
    and-int/lit8 v4, v4, 0x3f

    .line 226
    .line 227
    or-int/2addr v4, v6

    .line 228
    int-to-byte v4, v4

    .line 229
    invoke-static {v1, v8, v9, v4}, La/hft0;->l([BJB)V

    .line 230
    .line 231
    .line 232
    add-long v10, v10, v20

    .line 233
    .line 234
    and-int/lit8 v2, v2, 0x3f

    .line 235
    .line 236
    or-int/2addr v2, v6

    .line 237
    int-to-byte v2, v2

    .line 238
    invoke-static {v1, v14, v15, v2}, La/hft0;->l([BJB)V

    .line 239
    .line 240
    .line 241
    move v2, v5

    .line 242
    :goto_4
    add-int/lit8 v2, v2, 0x1

    .line 243
    .line 244
    move-wide/from16 v14, p3

    .line 245
    .line 246
    const/16 v5, 0x800

    .line 247
    .line 248
    const v8, 0xdfff

    .line 249
    .line 250
    .line 251
    goto/16 :goto_1

    .line 252
    .line 253
    :cond_7
    move v2, v5

    .line 254
    :cond_8
    new-instance v0, La/mtt0;

    .line 255
    .line 256
    add-int/lit8 v2, v2, -0x1

    .line 257
    .line 258
    invoke-direct {v0, v2, v3}, La/mtt0;-><init>(II)V

    .line 259
    .line 260
    .line 261
    throw v0

    .line 262
    :cond_9
    if-gt v7, v4, :cond_b

    .line 263
    .line 264
    const v1, 0xdfff

    .line 265
    .line 266
    .line 267
    if-gt v4, v1, :cond_b

    .line 268
    .line 269
    add-int/lit8 v1, v2, 0x1

    .line 270
    .line 271
    if-eq v1, v3, :cond_a

    .line 272
    .line 273
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 274
    .line 275
    .line 276
    move-result v0

    .line 277
    invoke-static {v4, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 278
    .line 279
    .line 280
    move-result v0

    .line 281
    if-eqz v0, :cond_a

    .line 282
    .line 283
    goto :goto_5

    .line 284
    :cond_a
    new-instance v0, La/mtt0;

    .line 285
    .line 286
    invoke-direct {v0, v2, v3}, La/mtt0;-><init>(II)V

    .line 287
    .line 288
    .line 289
    throw v0

    .line 290
    :cond_b
    :goto_5
    invoke-static {v4, v10, v11}, La/itt0;->h(IJ)V

    .line 291
    .line 292
    .line 293
    :goto_6
    const/4 v9, 0x0

    .line 294
    goto :goto_7

    .line 295
    :cond_c
    add-int/lit8 v3, v3, -0x1

    .line 296
    .line 297
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    add-int v1, v2, v4

    .line 302
    .line 303
    invoke-static {v0, v1}, La/itt0;->q(II)V

    .line 304
    .line 305
    .line 306
    goto :goto_6

    .line 307
    :goto_7
    return v9

    .line 308
    :pswitch_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 309
    .line 310
    .line 311
    move-result v3

    .line 312
    add-int/2addr v4, v2

    .line 313
    const/4 v5, 0x0

    .line 314
    :goto_8
    if-ge v5, v3, :cond_d

    .line 315
    .line 316
    add-int v8, v5, v2

    .line 317
    .line 318
    if-ge v8, v4, :cond_d

    .line 319
    .line 320
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 321
    .line 322
    .line 323
    move-result v9

    .line 324
    if-ge v9, v6, :cond_d

    .line 325
    .line 326
    int-to-byte v9, v9

    .line 327
    aput-byte v9, v1, v8

    .line 328
    .line 329
    add-int/lit8 v5, v5, 0x1

    .line 330
    .line 331
    goto :goto_8

    .line 332
    :cond_d
    if-ne v5, v3, :cond_e

    .line 333
    .line 334
    add-int v9, v2, v3

    .line 335
    .line 336
    goto/16 :goto_c

    .line 337
    .line 338
    :cond_e
    add-int/2addr v2, v5

    .line 339
    :goto_9
    if-ge v5, v3, :cond_18

    .line 340
    .line 341
    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    .line 342
    .line 343
    .line 344
    move-result v8

    .line 345
    if-ge v8, v6, :cond_f

    .line 346
    .line 347
    if-ge v2, v4, :cond_f

    .line 348
    .line 349
    add-int/lit8 v9, v2, 0x1

    .line 350
    .line 351
    int-to-byte v8, v8

    .line 352
    aput-byte v8, v1, v2

    .line 353
    .line 354
    move v2, v9

    .line 355
    const/16 v9, 0x800

    .line 356
    .line 357
    goto/16 :goto_a

    .line 358
    .line 359
    :cond_f
    const/16 v9, 0x800

    .line 360
    .line 361
    if-ge v8, v9, :cond_10

    .line 362
    .line 363
    add-int/lit8 v10, v4, -0x2

    .line 364
    .line 365
    if-gt v2, v10, :cond_10

    .line 366
    .line 367
    add-int/lit8 v10, v2, 0x1

    .line 368
    .line 369
    ushr-int/lit8 v11, v8, 0x6

    .line 370
    .line 371
    or-int/lit16 v11, v11, 0x3c0

    .line 372
    .line 373
    int-to-byte v11, v11

    .line 374
    aput-byte v11, v1, v2

    .line 375
    .line 376
    add-int/lit8 v2, v2, 0x2

    .line 377
    .line 378
    and-int/lit8 v8, v8, 0x3f

    .line 379
    .line 380
    or-int/2addr v8, v6

    .line 381
    int-to-byte v8, v8

    .line 382
    aput-byte v8, v1, v10

    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_10
    if-lt v8, v7, :cond_11

    .line 386
    .line 387
    const v10, 0xdfff

    .line 388
    .line 389
    .line 390
    if-ge v10, v8, :cond_12

    .line 391
    .line 392
    :cond_11
    add-int/lit8 v10, v4, -0x3

    .line 393
    .line 394
    if-gt v2, v10, :cond_12

    .line 395
    .line 396
    add-int/lit8 v10, v2, 0x1

    .line 397
    .line 398
    ushr-int/lit8 v11, v8, 0xc

    .line 399
    .line 400
    or-int/lit16 v11, v11, 0x1e0

    .line 401
    .line 402
    int-to-byte v11, v11

    .line 403
    aput-byte v11, v1, v2

    .line 404
    .line 405
    add-int/lit8 v11, v2, 0x2

    .line 406
    .line 407
    ushr-int/lit8 v12, v8, 0x6

    .line 408
    .line 409
    and-int/lit8 v12, v12, 0x3f

    .line 410
    .line 411
    or-int/2addr v12, v6

    .line 412
    int-to-byte v12, v12

    .line 413
    aput-byte v12, v1, v10

    .line 414
    .line 415
    add-int/lit8 v2, v2, 0x3

    .line 416
    .line 417
    and-int/lit8 v8, v8, 0x3f

    .line 418
    .line 419
    or-int/2addr v8, v6

    .line 420
    int-to-byte v8, v8

    .line 421
    aput-byte v8, v1, v11

    .line 422
    .line 423
    goto :goto_a

    .line 424
    :cond_12
    add-int/lit8 v10, v4, -0x4

    .line 425
    .line 426
    if-gt v2, v10, :cond_15

    .line 427
    .line 428
    add-int/lit8 v10, v5, 0x1

    .line 429
    .line 430
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 431
    .line 432
    .line 433
    move-result v11

    .line 434
    if-eq v10, v11, :cond_14

    .line 435
    .line 436
    invoke-virtual {v0, v10}, Ljava/lang/String;->charAt(I)C

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    invoke-static {v8, v5}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 441
    .line 442
    .line 443
    move-result v11

    .line 444
    if-eqz v11, :cond_13

    .line 445
    .line 446
    invoke-static {v8, v5}, Ljava/lang/Character;->toCodePoint(CC)I

    .line 447
    .line 448
    .line 449
    move-result v5

    .line 450
    add-int/lit8 v8, v2, 0x1

    .line 451
    .line 452
    ushr-int/lit8 v11, v5, 0x12

    .line 453
    .line 454
    or-int/lit16 v11, v11, 0xf0

    .line 455
    .line 456
    int-to-byte v11, v11

    .line 457
    aput-byte v11, v1, v2

    .line 458
    .line 459
    add-int/lit8 v11, v2, 0x2

    .line 460
    .line 461
    ushr-int/lit8 v12, v5, 0xc

    .line 462
    .line 463
    and-int/lit8 v12, v12, 0x3f

    .line 464
    .line 465
    or-int/2addr v12, v6

    .line 466
    int-to-byte v12, v12

    .line 467
    aput-byte v12, v1, v8

    .line 468
    .line 469
    add-int/lit8 v8, v2, 0x3

    .line 470
    .line 471
    ushr-int/lit8 v12, v5, 0x6

    .line 472
    .line 473
    and-int/lit8 v12, v12, 0x3f

    .line 474
    .line 475
    or-int/2addr v12, v6

    .line 476
    int-to-byte v12, v12

    .line 477
    aput-byte v12, v1, v11

    .line 478
    .line 479
    add-int/lit8 v2, v2, 0x4

    .line 480
    .line 481
    and-int/lit8 v5, v5, 0x3f

    .line 482
    .line 483
    or-int/2addr v5, v6

    .line 484
    int-to-byte v5, v5

    .line 485
    aput-byte v5, v1, v8

    .line 486
    .line 487
    move v5, v10

    .line 488
    :goto_a
    add-int/lit8 v5, v5, 0x1

    .line 489
    .line 490
    goto/16 :goto_9

    .line 491
    .line 492
    :cond_13
    move v5, v10

    .line 493
    :cond_14
    new-instance v0, La/mtt0;

    .line 494
    .line 495
    add-int/lit8 v5, v5, -0x1

    .line 496
    .line 497
    invoke-direct {v0, v5, v3}, La/mtt0;-><init>(II)V

    .line 498
    .line 499
    .line 500
    throw v0

    .line 501
    :cond_15
    if-gt v7, v8, :cond_17

    .line 502
    .line 503
    const v1, 0xdfff

    .line 504
    .line 505
    .line 506
    if-gt v8, v1, :cond_17

    .line 507
    .line 508
    add-int/lit8 v1, v5, 0x1

    .line 509
    .line 510
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 511
    .line 512
    .line 513
    move-result v4

    .line 514
    if-eq v1, v4, :cond_16

    .line 515
    .line 516
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    invoke-static {v8, v0}, Ljava/lang/Character;->isSurrogatePair(CC)Z

    .line 521
    .line 522
    .line 523
    move-result v0

    .line 524
    if-eqz v0, :cond_16

    .line 525
    .line 526
    goto :goto_b

    .line 527
    :cond_16
    new-instance v0, La/mtt0;

    .line 528
    .line 529
    invoke-direct {v0, v5, v3}, La/mtt0;-><init>(II)V

    .line 530
    .line 531
    .line 532
    throw v0

    .line 533
    :cond_17
    :goto_b
    invoke-static {v8, v2}, La/itt0;->e(II)V

    .line 534
    .line 535
    .line 536
    const/4 v9, 0x0

    .line 537
    goto :goto_c

    .line 538
    :cond_18
    move v9, v2

    .line 539
    :goto_c
    return v9

    .line 540
    nop

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public n([BII)Z
    .locals 21

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p0

    .line 6
    .line 7
    move/from16 v3, p3

    .line 8
    .line 9
    iget-byte v2, v2, La/jtt0;->a:B

    .line 10
    .line 11
    const/16 v4, -0x41

    .line 12
    .line 13
    const/4 v5, -0x1

    .line 14
    const/16 v6, -0x20

    .line 15
    .line 16
    const/16 v7, -0x60

    .line 17
    .line 18
    const/16 v8, -0x3e

    .line 19
    .line 20
    const/16 v9, -0x10

    .line 21
    .line 22
    const/16 v10, -0x13

    .line 23
    .line 24
    packed-switch v2, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    or-int v2, v1, v3

    .line 28
    .line 29
    array-length v12, v0

    .line 30
    sub-int/2addr v12, v3

    .line 31
    or-int/2addr v2, v12

    .line 32
    if-ltz v2, :cond_13

    .line 33
    .line 34
    int-to-long v1, v1

    .line 35
    int-to-long v12, v3

    .line 36
    sub-long/2addr v12, v1

    .line 37
    long-to-int v3, v12

    .line 38
    const/16 v12, 0x10

    .line 39
    .line 40
    if-ge v3, v12, :cond_0

    .line 41
    .line 42
    const/16 p0, 0x0

    .line 43
    .line 44
    const-wide/16 p2, 0x1

    .line 45
    .line 46
    const/4 v15, 0x0

    .line 47
    goto :goto_3

    .line 48
    :cond_0
    long-to-int v12, v1

    .line 49
    and-int/lit8 v12, v12, 0x7

    .line 50
    .line 51
    rsub-int/lit8 v12, v12, 0x8

    .line 52
    .line 53
    move-wide v13, v1

    .line 54
    const-wide/16 p2, 0x1

    .line 55
    .line 56
    const/4 v15, 0x0

    .line 57
    :goto_0
    if-ge v15, v12, :cond_2

    .line 58
    .line 59
    add-long v16, v13, p2

    .line 60
    .line 61
    invoke-static {v0, v13, v14}, La/hft0;->e([BJ)B

    .line 62
    .line 63
    .line 64
    move-result v13

    .line 65
    if-gez v13, :cond_1

    .line 66
    .line 67
    const/16 p0, 0x0

    .line 68
    .line 69
    goto :goto_3

    .line 70
    :cond_1
    add-int/lit8 v15, v15, 0x1

    .line 71
    .line 72
    move-wide/from16 v13, v16

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_2
    :goto_1
    add-int/lit8 v12, v15, 0x8

    .line 76
    .line 77
    if-gt v12, v3, :cond_4

    .line 78
    .line 79
    sget-wide v16, La/hft0;->f:J

    .line 80
    .line 81
    move/from16 v18, v12

    .line 82
    .line 83
    const/16 p0, 0x0

    .line 84
    .line 85
    add-long v11, v16, v13

    .line 86
    .line 87
    invoke-static {v0, v11, v12}, La/hft0;->i(Ljava/lang/Object;J)J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    const-wide v16, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long v11, v11, v16

    .line 97
    .line 98
    const-wide/16 v16, 0x0

    .line 99
    .line 100
    cmp-long v11, v11, v16

    .line 101
    .line 102
    if-eqz v11, :cond_3

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_3
    const-wide/16 v11, 0x8

    .line 106
    .line 107
    add-long/2addr v13, v11

    .line 108
    move/from16 v15, v18

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    const/16 p0, 0x0

    .line 112
    .line 113
    :goto_2
    if-ge v15, v3, :cond_6

    .line 114
    .line 115
    add-long v11, v13, p2

    .line 116
    .line 117
    invoke-static {v0, v13, v14}, La/hft0;->e([BJ)B

    .line 118
    .line 119
    .line 120
    move-result v13

    .line 121
    if-gez v13, :cond_5

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_5
    add-int/lit8 v15, v15, 0x1

    .line 125
    .line 126
    move-wide v13, v11

    .line 127
    goto :goto_2

    .line 128
    :cond_6
    move v15, v3

    .line 129
    :goto_3
    sub-int/2addr v3, v15

    .line 130
    int-to-long v11, v15

    .line 131
    add-long/2addr v1, v11

    .line 132
    :cond_7
    :goto_4
    move/from16 v11, p0

    .line 133
    .line 134
    :goto_5
    if-lez v3, :cond_9

    .line 135
    .line 136
    add-long v11, v1, p2

    .line 137
    .line 138
    invoke-static {v0, v1, v2}, La/hft0;->e([BJ)B

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-ltz v1, :cond_8

    .line 143
    .line 144
    add-int/lit8 v3, v3, -0x1

    .line 145
    .line 146
    move-wide/from16 v19, v11

    .line 147
    .line 148
    move v11, v1

    .line 149
    move-wide/from16 v1, v19

    .line 150
    .line 151
    goto :goto_5

    .line 152
    :cond_8
    move-wide/from16 v19, v11

    .line 153
    .line 154
    move v11, v1

    .line 155
    move-wide/from16 v1, v19

    .line 156
    .line 157
    :cond_9
    if-nez v3, :cond_a

    .line 158
    .line 159
    :goto_6
    move/from16 v5, p0

    .line 160
    .line 161
    goto/16 :goto_b

    .line 162
    .line 163
    :cond_a
    add-int/lit8 v12, v3, -0x1

    .line 164
    .line 165
    if-ge v11, v6, :cond_d

    .line 166
    .line 167
    if-nez v12, :cond_b

    .line 168
    .line 169
    :goto_7
    move v5, v11

    .line 170
    goto/16 :goto_b

    .line 171
    .line 172
    :cond_b
    add-int/lit8 v3, v3, -0x2

    .line 173
    .line 174
    if-lt v11, v8, :cond_1e

    .line 175
    .line 176
    add-long v13, v1, p2

    .line 177
    .line 178
    invoke-static {v0, v1, v2}, La/hft0;->e([BJ)B

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-le v1, v4, :cond_c

    .line 183
    .line 184
    goto/16 :goto_b

    .line 185
    .line 186
    :cond_c
    move-wide v1, v13

    .line 187
    goto :goto_4

    .line 188
    :cond_d
    if-ge v11, v9, :cond_11

    .line 189
    .line 190
    const/4 v15, 0x2

    .line 191
    if-ge v12, v15, :cond_e

    .line 192
    .line 193
    invoke-static {v1, v2, v0, v11, v12}, La/jtt0;->v(J[BII)I

    .line 194
    .line 195
    .line 196
    move-result v5

    .line 197
    goto/16 :goto_b

    .line 198
    .line 199
    :cond_e
    add-int/lit8 v3, v3, -0x3

    .line 200
    .line 201
    const-wide/16 v15, 0x2

    .line 202
    .line 203
    add-long v13, v1, p2

    .line 204
    .line 205
    invoke-static {v0, v1, v2}, La/hft0;->e([BJ)B

    .line 206
    .line 207
    .line 208
    move-result v12

    .line 209
    if-gt v12, v4, :cond_1e

    .line 210
    .line 211
    if-ne v11, v6, :cond_f

    .line 212
    .line 213
    if-lt v12, v7, :cond_1e

    .line 214
    .line 215
    :cond_f
    if-ne v11, v10, :cond_10

    .line 216
    .line 217
    if-ge v12, v7, :cond_1e

    .line 218
    .line 219
    :cond_10
    add-long/2addr v1, v15

    .line 220
    invoke-static {v0, v13, v14}, La/hft0;->e([BJ)B

    .line 221
    .line 222
    .line 223
    move-result v11

    .line 224
    if-le v11, v4, :cond_7

    .line 225
    .line 226
    goto/16 :goto_b

    .line 227
    .line 228
    :cond_11
    const-wide/16 v15, 0x2

    .line 229
    .line 230
    const/4 v13, 0x3

    .line 231
    if-ge v12, v13, :cond_12

    .line 232
    .line 233
    invoke-static {v1, v2, v0, v11, v12}, La/jtt0;->v(J[BII)I

    .line 234
    .line 235
    .line 236
    move-result v5

    .line 237
    goto/16 :goto_b

    .line 238
    .line 239
    :cond_12
    add-int/lit8 v3, v3, -0x4

    .line 240
    .line 241
    add-long v13, v1, p2

    .line 242
    .line 243
    invoke-static {v0, v1, v2}, La/hft0;->e([BJ)B

    .line 244
    .line 245
    .line 246
    move-result v12

    .line 247
    if-gt v12, v4, :cond_1e

    .line 248
    .line 249
    shl-int/lit8 v11, v11, 0x1c

    .line 250
    .line 251
    add-int/lit8 v12, v12, 0x70

    .line 252
    .line 253
    add-int/2addr v12, v11

    .line 254
    shr-int/lit8 v11, v12, 0x1e

    .line 255
    .line 256
    if-nez v11, :cond_1e

    .line 257
    .line 258
    add-long v11, v1, v15

    .line 259
    .line 260
    invoke-static {v0, v13, v14}, La/hft0;->e([BJ)B

    .line 261
    .line 262
    .line 263
    move-result v13

    .line 264
    if-gt v13, v4, :cond_1e

    .line 265
    .line 266
    const-wide/16 v13, 0x3

    .line 267
    .line 268
    add-long/2addr v1, v13

    .line 269
    invoke-static {v0, v11, v12}, La/hft0;->e([BJ)B

    .line 270
    .line 271
    .line 272
    move-result v11

    .line 273
    if-le v11, v4, :cond_7

    .line 274
    .line 275
    goto/16 :goto_b

    .line 276
    .line 277
    :cond_13
    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 278
    .line 279
    array-length v0, v0

    .line 280
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    filled-new-array {v0, v1, v3}, [Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    const-string v1, "Array length=%d, index=%d, limit=%d"

    .line 297
    .line 298
    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    invoke-direct {v2, v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    throw v2

    .line 306
    :pswitch_0
    const/16 p0, 0x0

    .line 307
    .line 308
    :goto_8
    if-ge v1, v3, :cond_14

    .line 309
    .line 310
    aget-byte v2, v0, v1

    .line 311
    .line 312
    if-ltz v2, :cond_14

    .line 313
    .line 314
    add-int/lit8 v1, v1, 0x1

    .line 315
    .line 316
    goto :goto_8

    .line 317
    :cond_14
    if-lt v1, v3, :cond_15

    .line 318
    .line 319
    goto :goto_a

    .line 320
    :cond_15
    :goto_9
    if-lt v1, v3, :cond_16

    .line 321
    .line 322
    :goto_a
    goto/16 :goto_6

    .line 323
    .line 324
    :cond_16
    add-int/lit8 v2, v1, 0x1

    .line 325
    .line 326
    aget-byte v11, v0, v1

    .line 327
    .line 328
    if-gez v11, :cond_20

    .line 329
    .line 330
    if-ge v11, v6, :cond_18

    .line 331
    .line 332
    if-lt v2, v3, :cond_17

    .line 333
    .line 334
    goto/16 :goto_7

    .line 335
    .line 336
    :cond_17
    if-lt v11, v8, :cond_1e

    .line 337
    .line 338
    add-int/lit8 v1, v1, 0x2

    .line 339
    .line 340
    aget-byte v2, v0, v2

    .line 341
    .line 342
    if-le v2, v4, :cond_15

    .line 343
    .line 344
    goto :goto_b

    .line 345
    :cond_18
    if-ge v11, v9, :cond_1c

    .line 346
    .line 347
    add-int/lit8 v12, v3, -0x1

    .line 348
    .line 349
    if-lt v2, v12, :cond_19

    .line 350
    .line 351
    invoke-static {v0, v2, v3}, La/ptt0;->d([BII)I

    .line 352
    .line 353
    .line 354
    move-result v5

    .line 355
    goto :goto_b

    .line 356
    :cond_19
    add-int/lit8 v12, v1, 0x2

    .line 357
    .line 358
    aget-byte v2, v0, v2

    .line 359
    .line 360
    if-gt v2, v4, :cond_1e

    .line 361
    .line 362
    if-ne v11, v6, :cond_1a

    .line 363
    .line 364
    if-lt v2, v7, :cond_1e

    .line 365
    .line 366
    :cond_1a
    if-ne v11, v10, :cond_1b

    .line 367
    .line 368
    if-ge v2, v7, :cond_1e

    .line 369
    .line 370
    :cond_1b
    add-int/lit8 v1, v1, 0x3

    .line 371
    .line 372
    aget-byte v2, v0, v12

    .line 373
    .line 374
    if-le v2, v4, :cond_15

    .line 375
    .line 376
    goto :goto_b

    .line 377
    :cond_1c
    add-int/lit8 v12, v3, -0x2

    .line 378
    .line 379
    if-lt v2, v12, :cond_1d

    .line 380
    .line 381
    invoke-static {v0, v2, v3}, La/ptt0;->d([BII)I

    .line 382
    .line 383
    .line 384
    move-result v5

    .line 385
    goto :goto_b

    .line 386
    :cond_1d
    add-int/lit8 v12, v1, 0x2

    .line 387
    .line 388
    aget-byte v2, v0, v2

    .line 389
    .line 390
    if-gt v2, v4, :cond_1e

    .line 391
    .line 392
    shl-int/lit8 v11, v11, 0x1c

    .line 393
    .line 394
    add-int/lit8 v2, v2, 0x70

    .line 395
    .line 396
    add-int/2addr v2, v11

    .line 397
    shr-int/lit8 v2, v2, 0x1e

    .line 398
    .line 399
    if-nez v2, :cond_1e

    .line 400
    .line 401
    add-int/lit8 v2, v1, 0x3

    .line 402
    .line 403
    aget-byte v11, v0, v12

    .line 404
    .line 405
    if-gt v11, v4, :cond_1e

    .line 406
    .line 407
    add-int/lit8 v1, v1, 0x4

    .line 408
    .line 409
    aget-byte v2, v0, v2

    .line 410
    .line 411
    if-le v2, v4, :cond_15

    .line 412
    .line 413
    :cond_1e
    :goto_b
    if-nez v5, :cond_1f

    .line 414
    .line 415
    const/4 v0, 0x1

    .line 416
    return v0

    .line 417
    :cond_1f
    return p0

    .line 418
    :cond_20
    move v1, v2

    .line 419
    goto :goto_9

    .line 420
    nop

    .line 421
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
