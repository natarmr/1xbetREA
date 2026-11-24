.class public final synthetic La/ena0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/o2a0;

.field public final synthetic c:J

.field public final synthetic d:J


# direct methods
.method public synthetic constructor <init>(La/o2a0;JJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/ena0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ena0;->b:La/o2a0;

    iput-wide p2, p0, La/ena0;->c:J

    iput-wide p4, p0, La/ena0;->d:J

    return-void
.end method

.method public synthetic constructor <init>(La/o2a0;JJI)V
    .locals 0

    .line 2
    const/4 p6, 0x1

    iput-byte p6, p0, La/ena0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ena0;->b:La/o2a0;

    iput-wide p2, p0, La/ena0;->c:J

    iput-wide p4, p0, La/ena0;->d:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ena0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v7, p1

    .line 9
    .line 10
    check-cast v7, La/fet;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x7

    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    iget-object v2, v0, La/ena0;->b:La/o2a0;

    .line 25
    .line 26
    iget-wide v3, v0, La/ena0;->c:J

    .line 27
    .line 28
    iget-wide v5, v0, La/ena0;->d:J

    .line 29
    .line 30
    invoke-static/range {v2 .. v8}, La/g1x;->a(La/o2a0;JJLa/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v6, p1

    .line 37
    .line 38
    check-cast v6, La/fet;

    .line 39
    .line 40
    move-object/from16 v1, p2

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Integer;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    and-int/lit8 v2, v1, 0x3

    .line 49
    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x1

    .line 52
    const/4 v5, 0x2

    .line 53
    if-eq v2, v5, :cond_0

    .line 54
    .line 55
    move v2, v4

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move v2, v3

    .line 58
    :goto_0
    and-int/2addr v1, v4

    .line 59
    invoke-virtual {v6, v1, v2}, La/fet;->U(IZ)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    sget-object v1, La/jm40;->b:La/jm40;

    .line 66
    .line 67
    const/high16 v2, 0x3f800000    # 1.0f

    .line 68
    .line 69
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 70
    .line 71
    .line 72
    move-result-object v7

    .line 73
    sget-object v8, La/qmk;->a:La/zcl;

    .line 74
    .line 75
    const/high16 v8, 0x42000000    # 32.0f

    .line 76
    .line 77
    invoke-static {v7, v8}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 78
    .line 79
    .line 80
    move-result-object v9

    .line 81
    const/4 v13, 0x0

    .line 82
    const/16 v14, 0xd

    .line 83
    .line 84
    const/4 v10, 0x0

    .line 85
    const/high16 v11, 0x40c00000    # 6.0f

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    invoke-static/range {v9 .. v14}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    sget-object v9, La/uc9;->c:La/mw3;

    .line 93
    .line 94
    sget-object v10, La/gqw0;->m:La/xx7;

    .line 95
    .line 96
    invoke-static {v9, v10, v6, v3}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    iget-wide v9, v6, La/fet;->T:J

    .line 101
    .line 102
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 103
    .line 104
    .line 105
    move-result v9

    .line 106
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    invoke-static {v6, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v7

    .line 114
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 115
    .line 116
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v6}, La/fet;->i0()V

    .line 120
    .line 121
    .line 122
    iget-boolean v11, v6, La/fet;->S:Z

    .line 123
    .line 124
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 125
    .line 126
    if-eqz v11, :cond_1

    .line 127
    .line 128
    invoke-virtual {v6, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 129
    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_1
    invoke-virtual {v6}, La/fet;->r0()V

    .line 133
    .line 134
    .line 135
    :goto_1
    sget-object v11, La/gqw0;->x:La/shd;

    .line 136
    .line 137
    invoke-static {v6, v3, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    sget-object v3, La/gqw0;->w:La/shd;

    .line 141
    .line 142
    invoke-static {v6, v10, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 143
    .line 144
    .line 145
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    sget-object v10, La/gqw0;->y:La/shd;

    .line 150
    .line 151
    invoke-static {v6, v9, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v6}, La/jpm0;->n(La/fet;)V

    .line 155
    .line 156
    .line 157
    sget-object v9, La/gqw0;->v:La/shd;

    .line 158
    .line 159
    invoke-static {v6, v7, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    iget-object v7, v0, La/ena0;->b:La/o2a0;

    .line 163
    .line 164
    iget-object v13, v7, La/o2a0;->i:Ljava/lang/String;

    .line 165
    .line 166
    invoke-static {v1, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 167
    .line 168
    .line 169
    move-result-object v14

    .line 170
    const/high16 v15, 0x42200000    # 40.0f

    .line 171
    .line 172
    const/4 v2, 0x0

    .line 173
    invoke-static {v14, v15, v2, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 178
    .line 179
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 180
    .line 181
    .line 182
    move-result-wide v14

    .line 183
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 184
    .line 185
    .line 186
    move-result-object v21

    .line 187
    move-object v5, v1

    .line 188
    move-object v1, v13

    .line 189
    new-instance v13, La/f2q0;

    .line 190
    .line 191
    const/4 v4, 0x3

    .line 192
    invoke-direct {v13, v4}, La/f2q0;-><init>(I)V

    .line 193
    .line 194
    .line 195
    const/16 v24, 0x6180

    .line 196
    .line 197
    const v25, 0x1abf8

    .line 198
    .line 199
    .line 200
    move-object v4, v5

    .line 201
    const/4 v5, 0x0

    .line 202
    move-object/from16 v22, v6

    .line 203
    .line 204
    move-object/from16 v16, v7

    .line 205
    .line 206
    const-wide/16 v6, 0x0

    .line 207
    .line 208
    move/from16 v17, v8

    .line 209
    .line 210
    const/4 v8, 0x0

    .line 211
    move-object/from16 v18, v9

    .line 212
    .line 213
    const/4 v9, 0x0

    .line 214
    move-object/from16 v19, v10

    .line 215
    .line 216
    const/4 v10, 0x0

    .line 217
    move-object/from16 v20, v11

    .line 218
    .line 219
    move-object/from16 v23, v12

    .line 220
    .line 221
    const-wide/16 v11, 0x0

    .line 222
    .line 223
    move-object/from16 v26, v3

    .line 224
    .line 225
    move-object/from16 v27, v4

    .line 226
    .line 227
    move-wide v3, v14

    .line 228
    const-wide/16 v14, 0x0

    .line 229
    .line 230
    move-object/from16 v28, v16

    .line 231
    .line 232
    const/16 v16, 0x2

    .line 233
    .line 234
    move/from16 v29, v17

    .line 235
    .line 236
    const/16 v17, 0x0

    .line 237
    .line 238
    move-object/from16 v30, v18

    .line 239
    .line 240
    const/16 v18, 0x1

    .line 241
    .line 242
    move-object/from16 v31, v19

    .line 243
    .line 244
    const/16 v19, 0x0

    .line 245
    .line 246
    move-object/from16 v32, v20

    .line 247
    .line 248
    const/16 v20, 0x0

    .line 249
    .line 250
    move-object/from16 v33, v23

    .line 251
    .line 252
    const/16 v23, 0x0

    .line 253
    .line 254
    move-object/from16 v34, v26

    .line 255
    .line 256
    move-object/from16 v37, v27

    .line 257
    .line 258
    move-object/from16 v38, v28

    .line 259
    .line 260
    move-object/from16 v36, v30

    .line 261
    .line 262
    move-object/from16 v35, v31

    .line 263
    .line 264
    move-object/from16 v39, v33

    .line 265
    .line 266
    const/high16 v0, 0x3f800000    # 1.0f

    .line 267
    .line 268
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 269
    .line 270
    .line 271
    move-object/from16 v6, v22

    .line 272
    .line 273
    move-object/from16 v1, v37

    .line 274
    .line 275
    invoke-static {v1, v0}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    sget-object v2, La/gqw0;->k:La/yx7;

    .line 280
    .line 281
    sget-object v3, La/uc9;->a:La/lw3;

    .line 282
    .line 283
    const/16 v4, 0x30

    .line 284
    .line 285
    invoke-static {v3, v2, v6, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 286
    .line 287
    .line 288
    move-result-object v2

    .line 289
    iget-wide v3, v6, La/fet;->T:J

    .line 290
    .line 291
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    invoke-virtual {v6}, La/fet;->m()La/bh90;

    .line 296
    .line 297
    .line 298
    move-result-object v4

    .line 299
    invoke-static {v6, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    invoke-virtual {v6}, La/fet;->i0()V

    .line 304
    .line 305
    .line 306
    iget-boolean v5, v6, La/fet;->S:Z

    .line 307
    .line 308
    if-eqz v5, :cond_2

    .line 309
    .line 310
    move-object/from16 v5, v39

    .line 311
    .line 312
    invoke-virtual {v6, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 313
    .line 314
    .line 315
    :goto_2
    move-object/from16 v5, v32

    .line 316
    .line 317
    goto :goto_3

    .line 318
    :cond_2
    invoke-virtual {v6}, La/fet;->r0()V

    .line 319
    .line 320
    .line 321
    goto :goto_2

    .line 322
    :goto_3
    invoke-static {v6, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v2, v34

    .line 326
    .line 327
    invoke-static {v6, v4, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v2, v35

    .line 331
    .line 332
    invoke-static {v3, v6, v2, v6}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 333
    .line 334
    .line 335
    move-object/from16 v2, v36

    .line 336
    .line 337
    invoke-static {v6, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 338
    .line 339
    .line 340
    const/high16 v0, 0x42000000    # 32.0f

    .line 341
    .line 342
    invoke-static {v1, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    move-object v4, v1

    .line 347
    move-object/from16 v3, v38

    .line 348
    .line 349
    iget-object v1, v3, La/o2a0;->c:Ljava/lang/String;

    .line 350
    .line 351
    move-object v7, v3

    .line 352
    move-object v5, v4

    .line 353
    iget-wide v3, v7, La/o2a0;->e:J

    .line 354
    .line 355
    invoke-static {}, La/g1t0;->e()La/y9q0;

    .line 356
    .line 357
    .line 358
    move-result-object v21

    .line 359
    new-instance v13, La/f2q0;

    .line 360
    .line 361
    const/4 v8, 0x6

    .line 362
    invoke-direct {v13, v8}, La/f2q0;-><init>(I)V

    .line 363
    .line 364
    .line 365
    const/16 v24, 0x6000

    .line 366
    .line 367
    const v25, 0x1bbf8

    .line 368
    .line 369
    .line 370
    move-object/from16 v37, v5

    .line 371
    .line 372
    const/4 v5, 0x0

    .line 373
    move-object/from16 v22, v6

    .line 374
    .line 375
    move-object/from16 v16, v7

    .line 376
    .line 377
    const-wide/16 v6, 0x0

    .line 378
    .line 379
    const/4 v8, 0x0

    .line 380
    const/4 v9, 0x0

    .line 381
    const/4 v10, 0x0

    .line 382
    const-wide/16 v11, 0x0

    .line 383
    .line 384
    const-wide/16 v14, 0x0

    .line 385
    .line 386
    move-object/from16 v38, v16

    .line 387
    .line 388
    const/16 v16, 0x0

    .line 389
    .line 390
    const/16 v17, 0x0

    .line 391
    .line 392
    const/16 v18, 0x1

    .line 393
    .line 394
    const/16 v19, 0x0

    .line 395
    .line 396
    const/16 v20, 0x0

    .line 397
    .line 398
    const/16 v23, 0x0

    .line 399
    .line 400
    move-object/from16 v40, v37

    .line 401
    .line 402
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 403
    .line 404
    .line 405
    const/4 v7, 0x6

    .line 406
    move-object/from16 v1, p0

    .line 407
    .line 408
    iget-wide v2, v1, La/ena0;->c:J

    .line 409
    .line 410
    iget-wide v4, v1, La/ena0;->d:J

    .line 411
    .line 412
    move-object/from16 v6, v22

    .line 413
    .line 414
    move-object/from16 v1, v38

    .line 415
    .line 416
    invoke-static/range {v1 .. v7}, La/g1x;->a(La/o2a0;JJLa/fet;I)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v4, v40

    .line 420
    .line 421
    invoke-static {v4, v0}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    iget-object v0, v1, La/o2a0;->d:Ljava/lang/String;

    .line 426
    .line 427
    iget-wide v3, v1, La/o2a0;->f:J

    .line 428
    .line 429
    invoke-static {}, La/g1t0;->e()La/y9q0;

    .line 430
    .line 431
    .line 432
    move-result-object v21

    .line 433
    new-instance v13, La/f2q0;

    .line 434
    .line 435
    const/4 v1, 0x5

    .line 436
    invoke-direct {v13, v1}, La/f2q0;-><init>(I)V

    .line 437
    .line 438
    .line 439
    const/4 v5, 0x0

    .line 440
    const-wide/16 v6, 0x0

    .line 441
    .line 442
    move-object v1, v0

    .line 443
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 444
    .line 445
    .line 446
    move-object/from16 v6, v22

    .line 447
    .line 448
    const/4 v0, 0x1

    .line 449
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v6, v0}, La/fet;->r(Z)V

    .line 453
    .line 454
    .line 455
    goto :goto_4

    .line 456
    :cond_3
    invoke-virtual {v6}, La/fet;->X()V

    .line 457
    .line 458
    .line 459
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object v0

    .line 462
    nop

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
