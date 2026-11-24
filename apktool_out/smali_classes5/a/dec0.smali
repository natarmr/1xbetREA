.class public final synthetic La/dec0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FFLjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/dec0;->a:B

    iput p1, p0, La/dec0;->b:F

    iput p2, p0, La/dec0;->c:F

    iput-object p3, p0, La/dec0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/dec0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/dec0;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iget v5, v0, La/dec0;->c:F

    .line 10
    .line 11
    iget v0, v0, La/dec0;->b:F

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v4, La/owk0;

    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/yhg0;

    .line 21
    .line 22
    move-object/from16 v6, p2

    .line 23
    .line 24
    check-cast v6, La/fet;

    .line 25
    .line 26
    move-object/from16 v7, p3

    .line 27
    .line 28
    check-cast v7, Ljava/lang/Integer;

    .line 29
    .line 30
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 31
    .line 32
    .line 33
    move-result v7

    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    and-int/lit8 v8, v7, 0x6

    .line 38
    .line 39
    const/4 v9, 0x2

    .line 40
    if-nez v8, :cond_1

    .line 41
    .line 42
    invoke-virtual {v6, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v8

    .line 46
    if-eqz v8, :cond_0

    .line 47
    .line 48
    const/4 v8, 0x4

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v8, v9

    .line 51
    :goto_0
    or-int/2addr v7, v8

    .line 52
    :cond_1
    and-int/lit8 v8, v7, 0x13

    .line 53
    .line 54
    const/16 v10, 0x12

    .line 55
    .line 56
    if-eq v8, v10, :cond_2

    .line 57
    .line 58
    move v8, v2

    .line 59
    goto :goto_1

    .line 60
    :cond_2
    move v8, v3

    .line 61
    :goto_1
    and-int/2addr v7, v2

    .line 62
    invoke-virtual {v6, v7, v8}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    if-eqz v7, :cond_8

    .line 67
    .line 68
    const/high16 v7, 0x3f800000    # 1.0f

    .line 69
    .line 70
    sget-object v8, La/jm40;->b:La/jm40;

    .line 71
    .line 72
    invoke-interface {v1, v7, v8, v2}, La/yhg0;->a(FLa/mm40;Z)La/mm40;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1, v0}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    sget-object v10, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-ne v1, v10, :cond_3

    .line 87
    .line 88
    new-instance v1, La/ejk0;

    .line 89
    .line 90
    const/16 v11, 0x8

    .line 91
    .line 92
    invoke-direct {v1, v11}, La/ejk0;-><init>(B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v6, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 99
    .line 100
    invoke-static {v0, v1}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v6, v5}, La/fet;->d(F)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    invoke-virtual {v6}, La/fet;->P()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v11

    .line 112
    if-nez v1, :cond_4

    .line 113
    .line 114
    if-ne v11, v10, :cond_5

    .line 115
    .line 116
    :cond_4
    new-instance v11, La/f54;

    .line 117
    .line 118
    const/16 v1, 0x1d

    .line 119
    .line 120
    invoke-direct {v11, v5, v1}, La/f54;-><init>(FB)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v6, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_5
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 127
    .line 128
    invoke-static {v0, v11}, La/rq8;->M(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    sget-object v1, La/gqw0;->n:La/xx7;

    .line 133
    .line 134
    sget-object v5, La/uc9;->c:La/mw3;

    .line 135
    .line 136
    const/16 v10, 0x30

    .line 137
    .line 138
    invoke-static {v5, v1, v6, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-wide v10, v6, La/fet;->T:J

    .line 143
    .line 144
    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    .line 145
    .line 146
    .line 147
    move-result v5

    .line 148
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 149
    .line 150
    .line 151
    move-result-object v10

    .line 152
    invoke-static {v6, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 157
    .line 158
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v6}, La/fet;->i0()V

    .line 162
    .line 163
    .line 164
    iget-boolean v11, v6, La/fet;->S:Z

    .line 165
    .line 166
    if-eqz v11, :cond_6

    .line 167
    .line 168
    sget-object v11, La/e7z;->u1:La/pcy;

    .line 169
    .line 170
    invoke-virtual {v6, v11}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 171
    .line 172
    .line 173
    goto :goto_2

    .line 174
    :cond_6
    invoke-virtual {v6}, La/fet;->r0()V

    .line 175
    .line 176
    .line 177
    :goto_2
    sget-object v11, La/gqw0;->x:La/shd;

    .line 178
    .line 179
    invoke-static {v6, v1, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    sget-object v1, La/gqw0;->w:La/shd;

    .line 183
    .line 184
    invoke-static {v6, v10, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 185
    .line 186
    .line 187
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    sget-object v5, La/gqw0;->y:La/shd;

    .line 192
    .line 193
    invoke-static {v6, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 194
    .line 195
    .line 196
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 197
    .line 198
    .line 199
    sget-object v1, La/gqw0;->v:La/shd;

    .line 200
    .line 201
    invoke-static {v6, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 202
    .line 203
    .line 204
    move v0, v7

    .line 205
    invoke-static {v8, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    move-object/from16 v27, v6

    .line 210
    .line 211
    iget-object v6, v4, La/owk0;->a:Ljava/lang/String;

    .line 212
    .line 213
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 214
    .line 215
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 216
    .line 217
    .line 218
    move-result-object v1

    .line 219
    invoke-static {v1}, La/r8x;->c0(La/y9q0;)La/y9q0;

    .line 220
    .line 221
    .line 222
    move-result-object v26

    .line 223
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 224
    .line 225
    .line 226
    move-result-object v1

    .line 227
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 228
    .line 229
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v10

    .line 233
    sget-wide v13, La/qmk;->r:J

    .line 234
    .line 235
    sget-wide v15, La/qmk;->u:J

    .line 236
    .line 237
    invoke-static {v9}, La/idm0;->t(I)J

    .line 238
    .line 239
    .line 240
    move-result-wide v17

    .line 241
    new-instance v12, La/n05;

    .line 242
    .line 243
    invoke-direct/range {v12 .. v18}, La/n05;-><init>(JJJ)V

    .line 244
    .line 245
    .line 246
    new-instance v1, La/f2q0;

    .line 247
    .line 248
    const/4 v5, 0x3

    .line 249
    invoke-direct {v1, v5}, La/f2q0;-><init>(I)V

    .line 250
    .line 251
    .line 252
    const/16 v29, 0x6180

    .line 253
    .line 254
    const v30, 0x1abf0

    .line 255
    .line 256
    .line 257
    move-object v13, v8

    .line 258
    move-wide v8, v10

    .line 259
    move-object v10, v12

    .line 260
    const-wide/16 v11, 0x0

    .line 261
    .line 262
    move-object v14, v13

    .line 263
    const/4 v13, 0x0

    .line 264
    move-object v15, v14

    .line 265
    const/4 v14, 0x0

    .line 266
    move-object/from16 v16, v15

    .line 267
    .line 268
    const/4 v15, 0x0

    .line 269
    move-object/from16 v18, v16

    .line 270
    .line 271
    const-wide/16 v16, 0x0

    .line 272
    .line 273
    const-wide/16 v19, 0x0

    .line 274
    .line 275
    const/16 v21, 0x2

    .line 276
    .line 277
    const/16 v22, 0x0

    .line 278
    .line 279
    const/16 v23, 0x2

    .line 280
    .line 281
    const/16 v24, 0x0

    .line 282
    .line 283
    const/16 v25, 0x0

    .line 284
    .line 285
    const/16 v28, 0x30

    .line 286
    .line 287
    move-object/from16 v31, v18

    .line 288
    .line 289
    move-object/from16 v18, v1

    .line 290
    .line 291
    move-object/from16 v1, v31

    .line 292
    .line 293
    invoke-static/range {v6 .. v30}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 294
    .line 295
    .line 296
    move-object/from16 v6, v27

    .line 297
    .line 298
    iget-object v4, v4, La/owk0;->b:Ljava/lang/String;

    .line 299
    .line 300
    if-nez v4, :cond_7

    .line 301
    .line 302
    const v0, 0x14c41008

    .line 303
    .line 304
    .line 305
    invoke-virtual {v6, v0}, La/fet;->e0(I)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v6, v3}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_3

    .line 312
    :cond_7
    const v7, 0x14c41009

    .line 313
    .line 314
    .line 315
    invoke-virtual {v6, v7}, La/fet;->e0(I)V

    .line 316
    .line 317
    .line 318
    invoke-static {v1, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 319
    .line 320
    .line 321
    move-result-object v7

    .line 322
    invoke-static {}, La/g1t0;->g()La/y9q0;

    .line 323
    .line 324
    .line 325
    move-result-object v26

    .line 326
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 331
    .line 332
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 333
    .line 334
    .line 335
    move-result-wide v8

    .line 336
    new-instance v0, La/f2q0;

    .line 337
    .line 338
    invoke-direct {v0, v5}, La/f2q0;-><init>(I)V

    .line 339
    .line 340
    .line 341
    const/16 v29, 0x6180

    .line 342
    .line 343
    const v30, 0x1abf8

    .line 344
    .line 345
    .line 346
    const/4 v10, 0x0

    .line 347
    const-wide/16 v11, 0x0

    .line 348
    .line 349
    const/4 v13, 0x0

    .line 350
    const/4 v14, 0x0

    .line 351
    const/4 v15, 0x0

    .line 352
    const-wide/16 v16, 0x0

    .line 353
    .line 354
    const-wide/16 v19, 0x0

    .line 355
    .line 356
    const/16 v21, 0x2

    .line 357
    .line 358
    const/16 v22, 0x0

    .line 359
    .line 360
    const/16 v23, 0x1

    .line 361
    .line 362
    const/16 v24, 0x0

    .line 363
    .line 364
    const/16 v25, 0x0

    .line 365
    .line 366
    const/16 v28, 0x30

    .line 367
    .line 368
    move-object/from16 v18, v0

    .line 369
    .line 370
    move-object/from16 v27, v6

    .line 371
    .line 372
    move-object v6, v4

    .line 373
    invoke-static/range {v6 .. v30}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 374
    .line 375
    .line 376
    move-object/from16 v6, v27

    .line 377
    .line 378
    invoke-virtual {v6, v3}, La/fet;->r(Z)V

    .line 379
    .line 380
    .line 381
    :goto_3
    invoke-virtual {v6, v2}, La/fet;->r(Z)V

    .line 382
    .line 383
    .line 384
    goto :goto_4

    .line 385
    :cond_8
    invoke-virtual {v6}, La/fet;->X()V

    .line 386
    .line 387
    .line 388
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_0
    check-cast v4, La/hjm;

    .line 392
    .line 393
    move-object/from16 v1, p1

    .line 394
    .line 395
    check-cast v1, La/g9z;

    .line 396
    .line 397
    move-object/from16 v7, p2

    .line 398
    .line 399
    check-cast v7, La/fet;

    .line 400
    .line 401
    move-object/from16 v6, p3

    .line 402
    .line 403
    check-cast v6, Ljava/lang/Integer;

    .line 404
    .line 405
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 406
    .line 407
    .line 408
    move-result v6

    .line 409
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    and-int/lit8 v1, v6, 0x11

    .line 413
    .line 414
    const/16 v8, 0x10

    .line 415
    .line 416
    if-eq v1, v8, :cond_9

    .line 417
    .line 418
    move v3, v2

    .line 419
    :cond_9
    and-int/lit8 v1, v6, 0x1

    .line 420
    .line 421
    invoke-virtual {v7, v1, v3}, La/fet;->U(IZ)Z

    .line 422
    .line 423
    .line 424
    move-result v1

    .line 425
    if-eqz v1, :cond_a

    .line 426
    .line 427
    add-float v9, v0, v5

    .line 428
    .line 429
    sget-object v0, La/qmk;->a:La/zcl;

    .line 430
    .line 431
    const/4 v12, 0x0

    .line 432
    const/16 v13, 0x8

    .line 433
    .line 434
    sget-object v8, La/jm40;->b:La/jm40;

    .line 435
    .line 436
    const/high16 v10, 0x42400000    # 48.0f

    .line 437
    .line 438
    move v11, v9

    .line 439
    invoke-static/range {v8 .. v13}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    sget-object v3, La/kjm;->b:La/kjm;

    .line 444
    .line 445
    const/16 v8, 0x180

    .line 446
    .line 447
    const/16 v9, 0x38

    .line 448
    .line 449
    move-object v2, v4

    .line 450
    const/4 v4, 0x0

    .line 451
    const/4 v5, 0x0

    .line 452
    const/4 v6, 0x0

    .line 453
    invoke-static/range {v1 .. v9}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 454
    .line 455
    .line 456
    goto :goto_5

    .line 457
    :cond_a
    invoke-virtual {v7}, La/fet;->X()V

    .line 458
    .line 459
    .line 460
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 461
    .line 462
    return-object v0

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
