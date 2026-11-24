.class public final synthetic La/vod;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vod;->a:B

    iput-object p1, p0, La/vod;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vod;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0x90

    .line 9
    .line 10
    const/16 v6, 0x10

    .line 11
    .line 12
    const/16 v7, 0x20

    .line 13
    .line 14
    const/4 v8, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/y5d;

    .line 21
    .line 22
    move-object/from16 v9, p2

    .line 23
    .line 24
    check-cast v9, La/mm40;

    .line 25
    .line 26
    move-object/from16 v10, p3

    .line 27
    .line 28
    check-cast v10, La/fet;

    .line 29
    .line 30
    move-object/from16 v11, p4

    .line 31
    .line 32
    check-cast v11, Ljava/lang/Integer;

    .line 33
    .line 34
    invoke-static {v11, v1, v9}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    and-int/lit8 v11, v1, 0x30

    .line 39
    .line 40
    if-nez v11, :cond_1

    .line 41
    .line 42
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    if-eqz v11, :cond_0

    .line 47
    .line 48
    move v6, v7

    .line 49
    :cond_0
    or-int/2addr v1, v6

    .line 50
    :cond_1
    and-int/lit16 v6, v1, 0x91

    .line 51
    .line 52
    if-eq v6, v5, :cond_2

    .line 53
    .line 54
    move v4, v8

    .line 55
    :cond_2
    and-int/2addr v1, v8

    .line 56
    invoke-virtual {v10, v1, v4}, La/fet;->U(IZ)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    sget-object v1, La/qmk;->a:La/zcl;

    .line 63
    .line 64
    const/high16 v1, 0x41000000    # 8.0f

    .line 65
    .line 66
    const/4 v4, 0x2

    .line 67
    invoke-static {v9, v1, v2, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v11

    .line 71
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 72
    .line 73
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, La/g1t0;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 83
    .line 84
    .line 85
    move-result-object v30

    .line 86
    sget-object v1, La/m8m0;->a:La/zfn;

    .line 87
    .line 88
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    check-cast v1, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 93
    .line 94
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 95
    .line 96
    .line 97
    move-result-wide v12

    .line 98
    new-instance v1, La/f2q0;

    .line 99
    .line 100
    invoke-direct {v1, v3}, La/f2q0;-><init>(I)V

    .line 101
    .line 102
    .line 103
    const/16 v33, 0x6180

    .line 104
    .line 105
    const v34, 0x1abf8

    .line 106
    .line 107
    .line 108
    move-object/from16 v31, v10

    .line 109
    .line 110
    iget-object v10, v0, La/vod;->b:Ljava/lang/String;

    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const-wide/16 v15, 0x0

    .line 114
    .line 115
    const/16 v17, 0x0

    .line 116
    .line 117
    const/16 v18, 0x0

    .line 118
    .line 119
    const/16 v19, 0x0

    .line 120
    .line 121
    const-wide/16 v20, 0x0

    .line 122
    .line 123
    const-wide/16 v23, 0x0

    .line 124
    .line 125
    const/16 v25, 0x2

    .line 126
    .line 127
    const/16 v26, 0x0

    .line 128
    .line 129
    const/16 v27, 0x4

    .line 130
    .line 131
    const/16 v28, 0x0

    .line 132
    .line 133
    const/16 v29, 0x0

    .line 134
    .line 135
    const/16 v32, 0x0

    .line 136
    .line 137
    move-object/from16 v22, v1

    .line 138
    .line 139
    invoke-static/range {v10 .. v34}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 140
    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_3
    move-object/from16 v31, v10

    .line 144
    .line 145
    invoke-virtual/range {v31 .. v31}, La/fet;->X()V

    .line 146
    .line 147
    .line 148
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_0
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, La/y5d;

    .line 154
    .line 155
    move-object/from16 v9, p2

    .line 156
    .line 157
    check-cast v9, La/mm40;

    .line 158
    .line 159
    move-object/from16 v10, p3

    .line 160
    .line 161
    check-cast v10, La/fet;

    .line 162
    .line 163
    move-object/from16 v11, p4

    .line 164
    .line 165
    check-cast v11, Ljava/lang/Integer;

    .line 166
    .line 167
    invoke-static {v11, v1, v9}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 168
    .line 169
    .line 170
    move-result v1

    .line 171
    and-int/lit8 v11, v1, 0x30

    .line 172
    .line 173
    if-nez v11, :cond_5

    .line 174
    .line 175
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    if-eqz v11, :cond_4

    .line 180
    .line 181
    move v6, v7

    .line 182
    :cond_4
    or-int/2addr v1, v6

    .line 183
    :cond_5
    and-int/lit16 v6, v1, 0x91

    .line 184
    .line 185
    if-eq v6, v5, :cond_6

    .line 186
    .line 187
    move v5, v8

    .line 188
    goto :goto_1

    .line 189
    :cond_6
    move v5, v4

    .line 190
    :goto_1
    and-int/2addr v1, v8

    .line 191
    invoke-virtual {v10, v1, v5}, La/fet;->U(IZ)Z

    .line 192
    .line 193
    .line 194
    move-result v1

    .line 195
    if-eqz v1, :cond_8

    .line 196
    .line 197
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 198
    .line 199
    sget-object v5, La/qmk;->a:La/zcl;

    .line 200
    .line 201
    const/high16 v5, 0x41600000    # 14.0f

    .line 202
    .line 203
    invoke-static {v9, v2, v5, v8}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 204
    .line 205
    .line 206
    move-result-object v2

    .line 207
    const/high16 v5, 0x41e00000    # 28.0f

    .line 208
    .line 209
    invoke-static {v2, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-static {v1, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    iget-wide v4, v10, La/fet;->T:J

    .line 218
    .line 219
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 220
    .line 221
    .line 222
    move-result v4

    .line 223
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 224
    .line 225
    .line 226
    move-result-object v5

    .line 227
    invoke-static {v10, v2}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 228
    .line 229
    .line 230
    move-result-object v2

    .line 231
    sget-object v6, La/mkd;->c0:La/gqw0;

    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v10}, La/fet;->i0()V

    .line 237
    .line 238
    .line 239
    iget-boolean v6, v10, La/fet;->S:Z

    .line 240
    .line 241
    if-eqz v6, :cond_7

    .line 242
    .line 243
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 244
    .line 245
    invoke-virtual {v10, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 246
    .line 247
    .line 248
    goto :goto_2

    .line 249
    :cond_7
    invoke-virtual {v10}, La/fet;->r0()V

    .line 250
    .line 251
    .line 252
    :goto_2
    sget-object v6, La/gqw0;->x:La/shd;

    .line 253
    .line 254
    invoke-static {v10, v1, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 255
    .line 256
    .line 257
    sget-object v1, La/gqw0;->w:La/shd;

    .line 258
    .line 259
    invoke-static {v10, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 260
    .line 261
    .line 262
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    sget-object v4, La/gqw0;->y:La/shd;

    .line 267
    .line 268
    invoke-static {v10, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 269
    .line 270
    .line 271
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 272
    .line 273
    .line 274
    sget-object v1, La/gqw0;->v:La/shd;

    .line 275
    .line 276
    invoke-static {v10, v2, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 277
    .line 278
    .line 279
    sget-object v1, La/jm40;->b:La/jm40;

    .line 280
    .line 281
    const/high16 v2, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 284
    .line 285
    .line 286
    move-result-object v11

    .line 287
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 288
    .line 289
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, La/g1t0;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 299
    .line 300
    .line 301
    move-result-object v30

    .line 302
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 303
    .line 304
    invoke-virtual {v10, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 309
    .line 310
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 311
    .line 312
    .line 313
    move-result-wide v12

    .line 314
    new-instance v1, La/f2q0;

    .line 315
    .line 316
    invoke-direct {v1, v3}, La/f2q0;-><init>(I)V

    .line 317
    .line 318
    .line 319
    const/16 v33, 0x6180

    .line 320
    .line 321
    const v34, 0x1abf8

    .line 322
    .line 323
    .line 324
    move-object/from16 v31, v10

    .line 325
    .line 326
    iget-object v10, v0, La/vod;->b:Ljava/lang/String;

    .line 327
    .line 328
    const/4 v14, 0x0

    .line 329
    const-wide/16 v15, 0x0

    .line 330
    .line 331
    const/16 v17, 0x0

    .line 332
    .line 333
    const/16 v18, 0x0

    .line 334
    .line 335
    const/16 v19, 0x0

    .line 336
    .line 337
    const-wide/16 v20, 0x0

    .line 338
    .line 339
    const-wide/16 v23, 0x0

    .line 340
    .line 341
    const/16 v25, 0x2

    .line 342
    .line 343
    const/16 v26, 0x0

    .line 344
    .line 345
    const/16 v27, 0x1

    .line 346
    .line 347
    const/16 v28, 0x0

    .line 348
    .line 349
    const/16 v29, 0x0

    .line 350
    .line 351
    const/16 v32, 0x30

    .line 352
    .line 353
    move-object/from16 v22, v1

    .line 354
    .line 355
    invoke-static/range {v10 .. v34}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 356
    .line 357
    .line 358
    move-object/from16 v0, v31

    .line 359
    .line 360
    invoke-virtual {v0, v8}, La/fet;->r(Z)V

    .line 361
    .line 362
    .line 363
    goto :goto_3

    .line 364
    :cond_8
    move-object v0, v10

    .line 365
    invoke-virtual {v0}, La/fet;->X()V

    .line 366
    .line 367
    .line 368
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_1
    move-object/from16 v1, p1

    .line 372
    .line 373
    check-cast v1, La/y5d;

    .line 374
    .line 375
    move-object/from16 v2, p2

    .line 376
    .line 377
    check-cast v2, La/mm40;

    .line 378
    .line 379
    move-object/from16 v9, p3

    .line 380
    .line 381
    check-cast v9, La/fet;

    .line 382
    .line 383
    move-object/from16 v10, p4

    .line 384
    .line 385
    check-cast v10, Ljava/lang/Integer;

    .line 386
    .line 387
    invoke-static {v10, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    and-int/lit8 v10, v1, 0x30

    .line 392
    .line 393
    if-nez v10, :cond_a

    .line 394
    .line 395
    invoke-virtual {v9, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 396
    .line 397
    .line 398
    move-result v10

    .line 399
    if-eqz v10, :cond_9

    .line 400
    .line 401
    move v6, v7

    .line 402
    :cond_9
    or-int/2addr v1, v6

    .line 403
    :cond_a
    and-int/lit16 v6, v1, 0x91

    .line 404
    .line 405
    if-eq v6, v5, :cond_b

    .line 406
    .line 407
    move v4, v8

    .line 408
    :cond_b
    and-int/lit8 v5, v1, 0x1

    .line 409
    .line 410
    invoke-virtual {v9, v5, v4}, La/fet;->U(IZ)Z

    .line 411
    .line 412
    .line 413
    move-result v4

    .line 414
    if-eqz v4, :cond_c

    .line 415
    .line 416
    shr-int/2addr v1, v3

    .line 417
    and-int/lit8 v1, v1, 0xe

    .line 418
    .line 419
    iget-object v0, v0, La/vod;->b:Ljava/lang/String;

    .line 420
    .line 421
    invoke-static {v1, v9, v2, v0}, La/wdx;->k(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    goto :goto_4

    .line 425
    :cond_c
    invoke-virtual {v9}, La/fet;->X()V

    .line 426
    .line 427
    .line 428
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    return-object v0

    .line 431
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
