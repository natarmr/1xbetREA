.class public final synthetic La/xf00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qdm0;


# direct methods
.method public synthetic constructor <init>(La/qdm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xf00;->a:B

    iput-object p1, p0, La/xf00;->b:La/qdm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/xf00;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    iget-object v0, v0, La/xf00;->b:La/qdm0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v1, p1

    .line 17
    .line 18
    check-cast v1, La/fet;

    .line 19
    .line 20
    move-object/from16 v7, p2

    .line 21
    .line 22
    check-cast v7, Ljava/lang/Integer;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    and-int/lit8 v8, v7, 0x3

    .line 29
    .line 30
    if-eq v8, v3, :cond_0

    .line 31
    .line 32
    move v3, v5

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v6

    .line 35
    :goto_0
    and-int/2addr v5, v7

    .line 36
    invoke-virtual {v1, v5, v3}, La/fet;->U(IZ)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    iget-object v3, v0, La/qdm0;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v3, v1, v6}, La/hfm0;->c(Ljava/lang/String;La/fet;I)V

    .line 45
    .line 46
    .line 47
    sget-object v3, La/qmk;->a:La/zcl;

    .line 48
    .line 49
    const/4 v9, 0x0

    .line 50
    const/16 v10, 0xd

    .line 51
    .line 52
    sget-object v5, La/jm40;->b:La/jm40;

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/high16 v7, 0x41400000    # 12.0f

    .line 56
    .line 57
    const/4 v8, 0x0

    .line 58
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    iget-object v7, v0, La/qdm0;->b:Ljava/lang/String;

    .line 67
    .line 68
    sget-wide v10, La/qmk;->q:J

    .line 69
    .line 70
    sget-wide v15, La/qmk;->r:J

    .line 71
    .line 72
    move-wide v12, v15

    .line 73
    sget-wide v14, La/qmk;->n:J

    .line 74
    .line 75
    new-instance v9, La/n05;

    .line 76
    .line 77
    invoke-direct/range {v9 .. v15}, La/n05;-><init>(JJJ)V

    .line 78
    .line 79
    .line 80
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 87
    .line 88
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 89
    .line 90
    .line 91
    move-result-wide v2

    .line 92
    sget-object v18, La/j1t0;->b:La/qrq;

    .line 93
    .line 94
    sget-wide v24, La/qmk;->F:J

    .line 95
    .line 96
    new-instance v27, La/y9q0;

    .line 97
    .line 98
    const/16 v23, 0x0

    .line 99
    .line 100
    const v26, 0xfdffdd

    .line 101
    .line 102
    .line 103
    move-wide v15, v12

    .line 104
    const-wide/16 v13, 0x0

    .line 105
    .line 106
    const/16 v17, 0x0

    .line 107
    .line 108
    const-wide/16 v19, 0x0

    .line 109
    .line 110
    const/16 v21, 0x0

    .line 111
    .line 112
    const/16 v22, 0x0

    .line 113
    .line 114
    move-object/from16 v12, v27

    .line 115
    .line 116
    invoke-direct/range {v12 .. v26}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 117
    .line 118
    .line 119
    new-instance v0, La/f2q0;

    .line 120
    .line 121
    invoke-direct {v0, v4}, La/f2q0;-><init>(I)V

    .line 122
    .line 123
    .line 124
    const/16 v30, 0x6180

    .line 125
    .line 126
    const v31, 0x1abf0

    .line 127
    .line 128
    .line 129
    const-wide/16 v12, 0x0

    .line 130
    .line 131
    const/4 v14, 0x0

    .line 132
    const/4 v15, 0x0

    .line 133
    const/16 v16, 0x0

    .line 134
    .line 135
    const-wide/16 v17, 0x0

    .line 136
    .line 137
    const-wide/16 v20, 0x0

    .line 138
    .line 139
    const/16 v22, 0x2

    .line 140
    .line 141
    const/16 v24, 0x3

    .line 142
    .line 143
    const/16 v25, 0x0

    .line 144
    .line 145
    const/16 v26, 0x0

    .line 146
    .line 147
    const/16 v29, 0x0

    .line 148
    .line 149
    move-object/from16 v19, v0

    .line 150
    .line 151
    move-object/from16 v28, v1

    .line 152
    .line 153
    move-object v11, v9

    .line 154
    move-wide v9, v2

    .line 155
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_1
    move-object/from16 v28, v1

    .line 160
    .line 161
    invoke-virtual/range {v28 .. v28}, La/fet;->X()V

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 165
    .line 166
    return-object v0

    .line 167
    :pswitch_0
    move-object/from16 v1, p1

    .line 168
    .line 169
    check-cast v1, La/fet;

    .line 170
    .line 171
    move-object/from16 v7, p2

    .line 172
    .line 173
    check-cast v7, Ljava/lang/Integer;

    .line 174
    .line 175
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 176
    .line 177
    .line 178
    move-result v7

    .line 179
    and-int/lit8 v8, v7, 0x3

    .line 180
    .line 181
    if-eq v8, v3, :cond_2

    .line 182
    .line 183
    move v3, v5

    .line 184
    goto :goto_2

    .line 185
    :cond_2
    move v3, v6

    .line 186
    :goto_2
    and-int/2addr v7, v5

    .line 187
    invoke-virtual {v1, v7, v3}, La/fet;->U(IZ)Z

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-eqz v3, :cond_4

    .line 192
    .line 193
    iget-object v3, v0, La/qdm0;->a:Ljava/lang/String;

    .line 194
    .line 195
    invoke-static {v3, v1, v6}, La/ucx;->f(Ljava/lang/String;La/fet;I)V

    .line 196
    .line 197
    .line 198
    sget-object v3, La/jm40;->b:La/jm40;

    .line 199
    .line 200
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 201
    .line 202
    .line 203
    move-result-object v2

    .line 204
    sget-object v3, La/qmk;->a:La/zcl;

    .line 205
    .line 206
    const/high16 v3, 0x41000000    # 8.0f

    .line 207
    .line 208
    const/4 v7, 0x0

    .line 209
    invoke-static {v2, v7, v3, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 214
    .line 215
    invoke-static {v3, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    iget-wide v6, v1, La/fet;->T:J

    .line 220
    .line 221
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 222
    .line 223
    .line 224
    move-result v6

    .line 225
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 226
    .line 227
    .line 228
    move-result-object v7

    .line 229
    invoke-static {v1, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 230
    .line 231
    .line 232
    move-result-object v2

    .line 233
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 234
    .line 235
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1}, La/fet;->i0()V

    .line 239
    .line 240
    .line 241
    iget-boolean v8, v1, La/fet;->S:Z

    .line 242
    .line 243
    if-eqz v8, :cond_3

    .line 244
    .line 245
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 246
    .line 247
    invoke-virtual {v1, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 248
    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 252
    .line 253
    .line 254
    :goto_3
    sget-object v8, La/gqw0;->x:La/shd;

    .line 255
    .line 256
    invoke-static {v1, v3, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 257
    .line 258
    .line 259
    sget-object v3, La/gqw0;->w:La/shd;

    .line 260
    .line 261
    invoke-static {v1, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    sget-object v6, La/gqw0;->y:La/shd;

    .line 269
    .line 270
    invoke-static {v1, v3, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 274
    .line 275
    .line 276
    sget-object v3, La/gqw0;->v:La/shd;

    .line 277
    .line 278
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 279
    .line 280
    .line 281
    iget-object v0, v0, La/qdm0;->b:Ljava/lang/String;

    .line 282
    .line 283
    const/16 v2, 0x180

    .line 284
    .line 285
    invoke-static {v0, v4, v4, v1, v2}, La/ucx;->c(Ljava/lang/String;IILa/fet;I)V

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v5}, La/fet;->r(Z)V

    .line 289
    .line 290
    .line 291
    goto :goto_4

    .line 292
    :cond_4
    invoke-virtual {v1}, La/fet;->X()V

    .line 293
    .line 294
    .line 295
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 296
    .line 297
    return-object v0

    .line 298
    :pswitch_1
    move-object/from16 v1, p1

    .line 299
    .line 300
    check-cast v1, La/fet;

    .line 301
    .line 302
    move-object/from16 v7, p2

    .line 303
    .line 304
    check-cast v7, Ljava/lang/Integer;

    .line 305
    .line 306
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    and-int/lit8 v8, v7, 0x3

    .line 311
    .line 312
    if-eq v8, v3, :cond_5

    .line 313
    .line 314
    move v3, v5

    .line 315
    goto :goto_5

    .line 316
    :cond_5
    move v3, v6

    .line 317
    :goto_5
    and-int/2addr v5, v7

    .line 318
    invoke-virtual {v1, v5, v3}, La/fet;->U(IZ)Z

    .line 319
    .line 320
    .line 321
    move-result v3

    .line 322
    if-eqz v3, :cond_6

    .line 323
    .line 324
    iget-object v3, v0, La/qdm0;->a:Ljava/lang/String;

    .line 325
    .line 326
    invoke-static {v3, v1, v6}, La/yyw;->h(Ljava/lang/String;La/fet;I)V

    .line 327
    .line 328
    .line 329
    sget-object v3, La/qmk;->a:La/zcl;

    .line 330
    .line 331
    const/4 v9, 0x0

    .line 332
    const/16 v10, 0xd

    .line 333
    .line 334
    sget-object v5, La/jm40;->b:La/jm40;

    .line 335
    .line 336
    const/4 v6, 0x0

    .line 337
    const/high16 v7, 0x41400000    # 12.0f

    .line 338
    .line 339
    const/4 v8, 0x0

    .line 340
    invoke-static/range {v5 .. v10}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-static {v3, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    iget-object v0, v0, La/qdm0;->b:Ljava/lang/String;

    .line 349
    .line 350
    sget-wide v6, La/qmk;->q:J

    .line 351
    .line 352
    sget-wide v8, La/qmk;->r:J

    .line 353
    .line 354
    sget-wide v10, La/qmk;->n:J

    .line 355
    .line 356
    new-instance v5, La/n05;

    .line 357
    .line 358
    invoke-direct/range {v5 .. v11}, La/n05;-><init>(JJJ)V

    .line 359
    .line 360
    .line 361
    sget-object v14, La/j1t0;->b:La/qrq;

    .line 362
    .line 363
    sget-wide v20, La/qmk;->F:J

    .line 364
    .line 365
    move-wide v11, v8

    .line 366
    new-instance v8, La/y9q0;

    .line 367
    .line 368
    const/16 v19, 0x0

    .line 369
    .line 370
    const v22, 0xfdffdd

    .line 371
    .line 372
    .line 373
    const-wide/16 v9, 0x0

    .line 374
    .line 375
    const/4 v13, 0x0

    .line 376
    const-wide/16 v15, 0x0

    .line 377
    .line 378
    const/16 v17, 0x0

    .line 379
    .line 380
    const/16 v18, 0x0

    .line 381
    .line 382
    invoke-direct/range {v8 .. v22}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 383
    .line 384
    .line 385
    invoke-static {v8, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 386
    .line 387
    .line 388
    move-result-object v21

    .line 389
    new-instance v13, La/f2q0;

    .line 390
    .line 391
    invoke-direct {v13, v4}, La/f2q0;-><init>(I)V

    .line 392
    .line 393
    .line 394
    const/16 v24, 0x6180

    .line 395
    .line 396
    const v25, 0x1abf4

    .line 397
    .line 398
    .line 399
    const-wide/16 v3, 0x0

    .line 400
    .line 401
    const-wide/16 v6, 0x0

    .line 402
    .line 403
    const/4 v8, 0x0

    .line 404
    const/4 v9, 0x0

    .line 405
    const/4 v10, 0x0

    .line 406
    const-wide/16 v11, 0x0

    .line 407
    .line 408
    const-wide/16 v14, 0x0

    .line 409
    .line 410
    const/16 v16, 0x2

    .line 411
    .line 412
    const/16 v17, 0x0

    .line 413
    .line 414
    const/16 v18, 0x3

    .line 415
    .line 416
    const/16 v20, 0x0

    .line 417
    .line 418
    const/16 v23, 0x0

    .line 419
    .line 420
    move-object/from16 v22, v1

    .line 421
    .line 422
    move-object v1, v0

    .line 423
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 424
    .line 425
    .line 426
    goto :goto_6

    .line 427
    :cond_6
    move-object/from16 v22, v1

    .line 428
    .line 429
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 430
    .line 431
    .line 432
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 433
    .line 434
    return-object v0

    .line 435
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
