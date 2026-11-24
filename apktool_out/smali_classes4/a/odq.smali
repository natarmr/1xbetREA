.class public abstract La/odq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final synthetic b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/wen;->b:La/uen;

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    sget-object v1, La/bfn;->e:La/bfn;

    .line 5
    .line 6
    invoke-static {v0, v1}, La/ibc;->v0(ILa/bfn;)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    sput-wide v0, La/odq;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public static final a(La/mm40;La/pdq;La/fet;I)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v6, p2

    .line 6
    .line 7
    iget-wide v2, v1, La/pdq;->b:J

    .line 8
    .line 9
    const v4, -0x5925c916

    .line 10
    .line 11
    .line 12
    invoke-virtual {v6, v4}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    const/4 v5, 0x2

    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    const/4 v4, 0x4

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v4, v5

    .line 25
    :goto_0
    or-int v4, p3, v4

    .line 26
    .line 27
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v7

    .line 31
    if-eqz v7, :cond_1

    .line 32
    .line 33
    const/16 v7, 0x20

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v7, 0x10

    .line 37
    .line 38
    :goto_1
    or-int/2addr v4, v7

    .line 39
    and-int/lit8 v7, v4, 0x13

    .line 40
    .line 41
    const/16 v8, 0x12

    .line 42
    .line 43
    const/4 v9, 0x0

    .line 44
    const/4 v10, 0x1

    .line 45
    if-eq v7, v8, :cond_2

    .line 46
    .line 47
    move v7, v10

    .line 48
    goto :goto_2

    .line 49
    :cond_2
    move v7, v9

    .line 50
    :goto_2
    and-int/2addr v4, v10

    .line 51
    invoke-virtual {v6, v4, v7}, La/fet;->U(IZ)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    const/4 v11, 0x5

    .line 56
    if-eqz v4, :cond_6

    .line 57
    .line 58
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    sget-object v7, La/ukd;->a:La/cl5;

    .line 63
    .line 64
    if-ne v4, v7, :cond_3

    .line 65
    .line 66
    sget-object v4, La/wen;->b:La/uen;

    .line 67
    .line 68
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 69
    .line 70
    .line 71
    move-result-wide v12

    .line 72
    sget-object v4, La/bfn;->d:La/bfn;

    .line 73
    .line 74
    invoke-static {v12, v13, v4}, La/ibc;->w0(JLa/bfn;)J

    .line 75
    .line 76
    .line 77
    move-result-wide v12

    .line 78
    invoke-static {v2, v3, v12, v13}, La/wen;->j(JJ)J

    .line 79
    .line 80
    .line 81
    move-result-wide v12

    .line 82
    sget-wide v14, La/odq;->a:J

    .line 83
    .line 84
    invoke-static {v12, v13, v14, v15}, La/wen;->k(JJ)J

    .line 85
    .line 86
    .line 87
    move-result-wide v12

    .line 88
    new-instance v4, La/wen;

    .line 89
    .line 90
    invoke-direct {v4, v12, v13}, La/wen;-><init>(J)V

    .line 91
    .line 92
    .line 93
    invoke-static {v4}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-virtual {v6, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    :cond_3
    check-cast v4, La/pz40;

    .line 101
    .line 102
    new-instance v8, La/wen;

    .line 103
    .line 104
    invoke-direct {v8, v2, v3}, La/wen;-><init>(J)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    if-ne v2, v7, :cond_4

    .line 112
    .line 113
    new-instance v2, La/u6h;

    .line 114
    .line 115
    const/4 v3, 0x0

    .line 116
    invoke-direct {v2, v4, v3, v11}, La/u6h;-><init>(La/pz40;La/yje;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_4
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 123
    .line 124
    invoke-static {v6, v8, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 125
    .line 126
    .line 127
    iget v2, v1, La/pdq;->c:I

    .line 128
    .line 129
    invoke-static {v2, v9, v6}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 134
    .line 135
    invoke-interface {v0, v2}, La/mm40;->e(La/mm40;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    sget-object v3, La/gqw0;->n:La/xx7;

    .line 140
    .line 141
    sget-object v7, La/uc9;->e:La/nw3;

    .line 142
    .line 143
    const/16 v8, 0x36

    .line 144
    .line 145
    invoke-static {v7, v3, v6, v8}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iget-wide v7, v6, La/fet;->T:J

    .line 150
    .line 151
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 152
    .line 153
    .line 154
    move-result v7

    .line 155
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 156
    .line 157
    .line 158
    move-result-object v8

    .line 159
    invoke-static {v6, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 164
    .line 165
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v6}, La/fet;->i0()V

    .line 169
    .line 170
    .line 171
    iget-boolean v12, v6, La/fet;->S:Z

    .line 172
    .line 173
    if-eqz v12, :cond_5

    .line 174
    .line 175
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 176
    .line 177
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 178
    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_5
    invoke-virtual {v6}, La/fet;->r0()V

    .line 182
    .line 183
    .line 184
    :goto_3
    sget-object v12, La/gqw0;->x:La/shd;

    .line 185
    .line 186
    invoke-static {v6, v3, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 187
    .line 188
    .line 189
    sget-object v3, La/gqw0;->w:La/shd;

    .line 190
    .line 191
    invoke-static {v6, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    sget-object v7, La/gqw0;->y:La/shd;

    .line 199
    .line 200
    invoke-static {v6, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 201
    .line 202
    .line 203
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 204
    .line 205
    .line 206
    sget-object v3, La/gqw0;->v:La/shd;

    .line 207
    .line 208
    invoke-static {v6, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    invoke-interface {v4}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    check-cast v2, La/wen;

    .line 216
    .line 217
    iget-wide v2, v2, La/wen;->a:J

    .line 218
    .line 219
    sget-object v4, La/bfn;->e:La/bfn;

    .line 220
    .line 221
    invoke-static {v2, v3, v4}, La/wen;->l(JLa/bfn;)J

    .line 222
    .line 223
    .line 224
    move-result-wide v2

    .line 225
    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 226
    .line 227
    const-wide/16 v7, 0x3c

    .line 228
    .line 229
    div-long v12, v2, v7

    .line 230
    .line 231
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 232
    .line 233
    .line 234
    move-result-object v12

    .line 235
    rem-long/2addr v2, v7

    .line 236
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    filled-new-array {v12, v2}, [Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v2

    .line 244
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const-string v3, "%02d:%02d"

    .line 249
    .line 250
    invoke-static {v4, v3, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v12

    .line 254
    iget-object v3, v1, La/pdq;->a:La/mdm;

    .line 255
    .line 256
    const/16 v7, 0x180

    .line 257
    .line 258
    const/16 v8, 0x9

    .line 259
    .line 260
    const/4 v2, 0x0

    .line 261
    const/4 v4, 0x1

    .line 262
    const/4 v5, 0x0

    .line 263
    invoke-static/range {v2 .. v8}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 264
    .line 265
    .line 266
    const-string v2, "\n"

    .line 267
    .line 268
    invoke-static {v9, v2, v12}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    sget-object v18, La/j1t0;->c:La/qrq;

    .line 273
    .line 274
    sget-wide v15, La/qmk;->s:J

    .line 275
    .line 276
    sget-wide v24, La/qmk;->G:J

    .line 277
    .line 278
    new-instance v12, La/y9q0;

    .line 279
    .line 280
    const/16 v23, 0x0

    .line 281
    .line 282
    const v26, 0xfdffdd

    .line 283
    .line 284
    .line 285
    const-wide/16 v13, 0x0

    .line 286
    .line 287
    const/16 v17, 0x0

    .line 288
    .line 289
    const-wide/16 v19, 0x0

    .line 290
    .line 291
    const/16 v21, 0x0

    .line 292
    .line 293
    const/16 v22, 0x0

    .line 294
    .line 295
    invoke-direct/range {v12 .. v26}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 296
    .line 297
    .line 298
    sget-object v3, La/m8m0;->a:La/zfn;

    .line 299
    .line 300
    invoke-virtual {v6, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v3

    .line 304
    check-cast v3, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 305
    .line 306
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 307
    .line 308
    .line 309
    move-result-wide v4

    .line 310
    const/16 v17, 0x0

    .line 311
    .line 312
    const/16 v18, 0xa

    .line 313
    .line 314
    sget-object v13, La/jm40;->b:La/jm40;

    .line 315
    .line 316
    const/high16 v14, 0x41800000    # 16.0f

    .line 317
    .line 318
    const/4 v15, 0x0

    .line 319
    const/high16 v16, 0x41800000    # 16.0f

    .line 320
    .line 321
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    new-instance v14, La/f2q0;

    .line 326
    .line 327
    const/4 v7, 0x3

    .line 328
    invoke-direct {v14, v7}, La/f2q0;-><init>(I)V

    .line 329
    .line 330
    .line 331
    const/16 v25, 0x0

    .line 332
    .line 333
    const v26, 0x1fbf8

    .line 334
    .line 335
    .line 336
    const/4 v6, 0x0

    .line 337
    const-wide/16 v7, 0x0

    .line 338
    .line 339
    const/4 v9, 0x0

    .line 340
    move v13, v10

    .line 341
    const/4 v10, 0x0

    .line 342
    move v15, v11

    .line 343
    const/4 v11, 0x0

    .line 344
    move-object/from16 v22, v12

    .line 345
    .line 346
    move/from16 v16, v13

    .line 347
    .line 348
    const-wide/16 v12, 0x0

    .line 349
    .line 350
    move/from16 v17, v15

    .line 351
    .line 352
    move/from16 v18, v16

    .line 353
    .line 354
    const-wide/16 v15, 0x0

    .line 355
    .line 356
    move/from16 v19, v17

    .line 357
    .line 358
    const/16 v17, 0x0

    .line 359
    .line 360
    move/from16 v20, v18

    .line 361
    .line 362
    const/16 v18, 0x0

    .line 363
    .line 364
    move/from16 v21, v19

    .line 365
    .line 366
    const/16 v19, 0x0

    .line 367
    .line 368
    move/from16 v23, v20

    .line 369
    .line 370
    const/16 v20, 0x0

    .line 371
    .line 372
    move/from16 v24, v21

    .line 373
    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    move/from16 v27, v24

    .line 377
    .line 378
    const/16 v24, 0x0

    .line 379
    .line 380
    move/from16 v0, v23

    .line 381
    .line 382
    move-object/from16 v23, p2

    .line 383
    .line 384
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 385
    .line 386
    .line 387
    move-object/from16 v6, v23

    .line 388
    .line 389
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 390
    .line 391
    .line 392
    goto :goto_4

    .line 393
    :cond_6
    invoke-virtual {v6}, La/fet;->X()V

    .line 394
    .line 395
    .line 396
    :goto_4
    invoke-virtual {v6}, La/fet;->u()La/yfe0;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    if-eqz v0, :cond_7

    .line 401
    .line 402
    new-instance v2, La/gup;

    .line 403
    .line 404
    const/4 v15, 0x5

    .line 405
    move-object/from16 v3, p0

    .line 406
    .line 407
    move/from16 v4, p3

    .line 408
    .line 409
    invoke-direct {v2, v3, v1, v4, v15}, La/gup;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 410
    .line 411
    .line 412
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 413
    .line 414
    :cond_7
    return-void
.end method
