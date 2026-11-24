.class public abstract La/r9v;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x2f

    .line 2
    .line 3
    const-string v1, "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus.png"

    .line 4
    .line 5
    invoke-static {v0, v1, v1}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    sput-object v1, La/r9v;->a:Ljava/lang/String;

    .line 10
    .line 11
    const-string v1, "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus1.png"

    .line 12
    .line 13
    invoke-static {v0, v1, v1}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sput-object v1, La/r9v;->b:Ljava/lang/String;

    .line 18
    .line 19
    const-string v1, "static/img/ImgDefault/Esports/Virtual/GoldRush/Bonuses/Bonus2.png"

    .line 20
    .line 21
    invoke-static {v0, v1, v1}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, La/r9v;->c:Ljava/lang/String;

    .line 26
    .line 27
    return-void
.end method

.method public static final a(La/mm40;La/u9v;ZLjava/lang/String;La/fet;I)V
    .locals 51

    .line 1
    move-object/from16 v4, p1

    .line 2
    .line 3
    move/from16 v6, p2

    .line 4
    .line 5
    move-object/from16 v12, p4

    .line 6
    .line 7
    const v0, -0x37e98fda

    .line 8
    .line 9
    .line 10
    invoke-virtual {v12, v0}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v12, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const/16 v0, 0x20

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/16 v0, 0x10

    .line 23
    .line 24
    :goto_0
    or-int v0, p5, v0

    .line 25
    .line 26
    invoke-virtual {v12, v6}, La/fet;->h(Z)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/16 v1, 0x100

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    const/16 v1, 0x80

    .line 36
    .line 37
    :goto_1
    or-int/2addr v0, v1

    .line 38
    move-object/from16 v5, p3

    .line 39
    .line 40
    invoke-virtual {v12, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x800

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_2
    const/16 v1, 0x400

    .line 50
    .line 51
    :goto_2
    or-int/2addr v0, v1

    .line 52
    and-int/lit16 v1, v0, 0x493

    .line 53
    .line 54
    const/16 v2, 0x492

    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v15, 0x1

    .line 58
    if-eq v1, v2, :cond_3

    .line 59
    .line 60
    move v1, v15

    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v1, v3

    .line 63
    :goto_3
    and-int/2addr v0, v15

    .line 64
    invoke-virtual {v12, v0, v1}, La/fet;->U(IZ)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-eqz v0, :cond_f

    .line 69
    .line 70
    const-string v0, ""

    .line 71
    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    iget-object v1, v4, La/u9v;->b:Ljava/lang/String;

    .line 75
    .line 76
    if-nez v1, :cond_5

    .line 77
    .line 78
    :cond_4
    move-object v1, v0

    .line 79
    :cond_5
    if-eqz v4, :cond_6

    .line 80
    .line 81
    iget-wide v7, v4, La/u9v;->c:J

    .line 82
    .line 83
    :goto_4
    move-wide/from16 v16, v7

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_6
    sget-object v2, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 87
    .line 88
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v7

    .line 92
    goto :goto_4

    .line 93
    :goto_5
    if-eqz v4, :cond_7

    .line 94
    .line 95
    iget-object v0, v4, La/u9v;->d:Ljava/lang/String;

    .line 96
    .line 97
    :cond_7
    if-eqz v6, :cond_8

    .line 98
    .line 99
    if-eqz v4, :cond_9

    .line 100
    .line 101
    iget-object v2, v4, La/u9v;->e:Ljava/lang/String;

    .line 102
    .line 103
    :goto_6
    move-object v7, v2

    .line 104
    goto :goto_7

    .line 105
    :cond_8
    if-eqz v4, :cond_9

    .line 106
    .line 107
    iget-object v2, v4, La/u9v;->a:Ljava/lang/String;

    .line 108
    .line 109
    goto :goto_6

    .line 110
    :cond_9
    move-object v7, v5

    .line 111
    :goto_7
    sget-object v2, La/gqw0;->e:La/zx7;

    .line 112
    .line 113
    invoke-static {v2, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 114
    .line 115
    .line 116
    move-result-object v2

    .line 117
    iget-wide v8, v12, La/fet;->T:J

    .line 118
    .line 119
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 120
    .line 121
    .line 122
    move-result v8

    .line 123
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    move-object/from16 v10, p0

    .line 128
    .line 129
    invoke-static {v12, v10}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v11

    .line 133
    sget-object v13, La/mkd;->c0:La/gqw0;

    .line 134
    .line 135
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v12}, La/fet;->i0()V

    .line 139
    .line 140
    .line 141
    iget-boolean v13, v12, La/fet;->S:Z

    .line 142
    .line 143
    if-eqz v13, :cond_a

    .line 144
    .line 145
    sget-object v13, La/e7z;->u1:La/pcy;

    .line 146
    .line 147
    invoke-virtual {v12, v13}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 148
    .line 149
    .line 150
    goto :goto_8

    .line 151
    :cond_a
    invoke-virtual {v12}, La/fet;->r0()V

    .line 152
    .line 153
    .line 154
    :goto_8
    sget-object v13, La/gqw0;->x:La/shd;

    .line 155
    .line 156
    invoke-static {v12, v2, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 157
    .line 158
    .line 159
    sget-object v2, La/gqw0;->w:La/shd;

    .line 160
    .line 161
    invoke-static {v12, v9, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    sget-object v8, La/gqw0;->y:La/shd;

    .line 169
    .line 170
    invoke-static {v12, v2, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 174
    .line 175
    .line 176
    sget-object v2, La/gqw0;->v:La/shd;

    .line 177
    .line 178
    invoke-static {v12, v11, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 179
    .line 180
    .line 181
    sget-object v10, La/gqw0;->A:La/pge;

    .line 182
    .line 183
    const v13, 0x1801b0

    .line 184
    .line 185
    .line 186
    const/16 v14, 0x7b8

    .line 187
    .line 188
    const/4 v8, 0x0

    .line 189
    sget-object v9, La/jm40;->b:La/jm40;

    .line 190
    .line 191
    const/4 v11, 0x0

    .line 192
    invoke-static/range {v7 .. v14}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 193
    .line 194
    .line 195
    const/16 v2, 0x2f

    .line 196
    .line 197
    invoke-static {v2, v0, v0}, Lkotlin/text/StringsKt;->o0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    sget-object v7, La/r9v;->a:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v7

    .line 207
    if-eqz v7, :cond_b

    .line 208
    .line 209
    const-string v2, "GOLD_RUSH_GREEN_BONUS_CELL"

    .line 210
    .line 211
    invoke-static {v9, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    goto :goto_9

    .line 216
    :cond_b
    sget-object v7, La/r9v;->b:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 219
    .line 220
    .line 221
    move-result v7

    .line 222
    if-eqz v7, :cond_c

    .line 223
    .line 224
    const-string v2, "GOLD_RUSH_RED_BONUS_CELL"

    .line 225
    .line 226
    invoke-static {v9, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 227
    .line 228
    .line 229
    move-result-object v9

    .line 230
    goto :goto_9

    .line 231
    :cond_c
    sget-object v7, La/r9v;->c:Ljava/lang/String;

    .line 232
    .line 233
    invoke-virtual {v2, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 234
    .line 235
    .line 236
    move-result v2

    .line 237
    if-eqz v2, :cond_d

    .line 238
    .line 239
    const-string v2, "GOLD_RUSH_GRAY_BONUS_CELL"

    .line 240
    .line 241
    invoke-static {v9, v2}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 242
    .line 243
    .line 244
    move-result-object v9

    .line 245
    :cond_d
    :goto_9
    sget-object v2, La/qmk;->a:La/zcl;

    .line 246
    .line 247
    const/high16 v2, 0x40000000    # 2.0f

    .line 248
    .line 249
    invoke-static {v9, v2}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    const v13, 0x180030

    .line 254
    .line 255
    .line 256
    const/16 v14, 0x7b8

    .line 257
    .line 258
    const/4 v8, 0x0

    .line 259
    const/4 v11, 0x0

    .line 260
    move-object/from16 v12, p4

    .line 261
    .line 262
    move-object v7, v0

    .line 263
    invoke-static/range {v7 .. v14}, La/k7x;->a(Ljava/lang/Object;Ljava/lang/String;La/mm40;La/qge;La/a4d;La/fet;II)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 267
    .line 268
    .line 269
    move-result v0

    .line 270
    if-lez v0, :cond_e

    .line 271
    .line 272
    const v0, -0x625a17bf

    .line 273
    .line 274
    .line 275
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 276
    .line 277
    .line 278
    sget-object v24, La/j1t0;->d:La/qrq;

    .line 279
    .line 280
    sget-wide v21, La/qmk;->z:J

    .line 281
    .line 282
    sget-wide v30, La/qmk;->K:J

    .line 283
    .line 284
    sget-object v23, La/psq;->g:La/psq;

    .line 285
    .line 286
    new-instance v32, La/y9q0;

    .line 287
    .line 288
    const/16 v29, 0x0

    .line 289
    .line 290
    move-object/from16 v18, v32

    .line 291
    .line 292
    const v32, 0xfdffd9

    .line 293
    .line 294
    .line 295
    const-wide/16 v19, 0x0

    .line 296
    .line 297
    const-wide/16 v25, 0x0

    .line 298
    .line 299
    const/16 v27, 0x0

    .line 300
    .line 301
    const/16 v28, 0x0

    .line 302
    .line 303
    invoke-direct/range {v18 .. v32}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 304
    .line 305
    .line 306
    const/16 v49, 0x0

    .line 307
    .line 308
    const v50, 0xfeffff

    .line 309
    .line 310
    .line 311
    const-wide/16 v33, 0x0

    .line 312
    .line 313
    const-wide/16 v35, 0x0

    .line 314
    .line 315
    const/16 v37, 0x0

    .line 316
    .line 317
    const/16 v38, 0x0

    .line 318
    .line 319
    const/16 v39, 0x0

    .line 320
    .line 321
    const-wide/16 v40, 0x0

    .line 322
    .line 323
    const/16 v42, 0x0

    .line 324
    .line 325
    const/16 v43, 0x0

    .line 326
    .line 327
    const/16 v44, 0x0

    .line 328
    .line 329
    const/16 v45, 0x1

    .line 330
    .line 331
    const-wide/16 v46, 0x0

    .line 332
    .line 333
    const/16 v48, 0x0

    .line 334
    .line 335
    move-object/from16 v32, v18

    .line 336
    .line 337
    invoke-static/range {v32 .. v50}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 338
    .line 339
    .line 340
    move-result-object v27

    .line 341
    sget-wide v12, La/qmk;->s:J

    .line 342
    .line 343
    new-instance v0, La/f2q0;

    .line 344
    .line 345
    const/4 v2, 0x3

    .line 346
    invoke-direct {v0, v2}, La/f2q0;-><init>(I)V

    .line 347
    .line 348
    .line 349
    const/16 v30, 0x6000

    .line 350
    .line 351
    const v31, 0x1bbea

    .line 352
    .line 353
    .line 354
    const/4 v8, 0x0

    .line 355
    const/4 v11, 0x0

    .line 356
    const/4 v14, 0x0

    .line 357
    move v2, v15

    .line 358
    const/4 v15, 0x0

    .line 359
    move-wide/from16 v9, v16

    .line 360
    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    const-wide/16 v17, 0x0

    .line 364
    .line 365
    const-wide/16 v20, 0x0

    .line 366
    .line 367
    const/16 v22, 0x0

    .line 368
    .line 369
    const/16 v23, 0x0

    .line 370
    .line 371
    const/16 v24, 0x1

    .line 372
    .line 373
    const/16 v25, 0x0

    .line 374
    .line 375
    const/16 v26, 0x0

    .line 376
    .line 377
    move-object/from16 v28, p4

    .line 378
    .line 379
    move-object/from16 v19, v0

    .line 380
    .line 381
    move-object v7, v1

    .line 382
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 383
    .line 384
    .line 385
    move-object/from16 v12, v28

    .line 386
    .line 387
    invoke-virtual {v12, v3}, La/fet;->r(Z)V

    .line 388
    .line 389
    .line 390
    goto :goto_a

    .line 391
    :cond_e
    move v2, v15

    .line 392
    const v0, -0x6255b41e

    .line 393
    .line 394
    .line 395
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 396
    .line 397
    .line 398
    invoke-virtual {v12, v3}, La/fet;->r(Z)V

    .line 399
    .line 400
    .line 401
    :goto_a
    invoke-virtual {v12, v2}, La/fet;->r(Z)V

    .line 402
    .line 403
    .line 404
    goto :goto_b

    .line 405
    :cond_f
    invoke-virtual {v12}, La/fet;->X()V

    .line 406
    .line 407
    .line 408
    :goto_b
    invoke-virtual {v12}, La/fet;->u()La/yfe0;

    .line 409
    .line 410
    .line 411
    move-result-object v7

    .line 412
    if-eqz v7, :cond_10

    .line 413
    .line 414
    new-instance v0, La/p2n;

    .line 415
    .line 416
    const/16 v1, 0xc

    .line 417
    .line 418
    move-object/from16 v3, p0

    .line 419
    .line 420
    move/from16 v2, p5

    .line 421
    .line 422
    invoke-direct/range {v0 .. v6}, La/p2n;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 423
    .line 424
    .line 425
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 426
    .line 427
    :cond_10
    return-void
.end method
