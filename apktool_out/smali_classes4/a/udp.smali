.class public final synthetic La/udp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/dhm;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/dhm;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    iput-byte p4, p0, La/udp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/udp;->b:La/mm40;

    iput-object p2, p0, La/udp;->c:La/dhm;

    iput-object p3, p0, La/udp;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Lkotlin/jvm/functions/Function1;La/dhm;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/udp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/udp;->b:La/mm40;

    iput-object p2, p0, La/udp;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/udp;->c:La/dhm;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/udp;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/udp;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    iget-object v4, v0, La/udp;->c:La/dhm;

    .line 9
    .line 10
    iget-object v0, v0, La/udp;->b:La/mm40;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fet;

    .line 18
    .line 19
    move-object/from16 v5, p2

    .line 20
    .line 21
    check-cast v5, Ljava/lang/Integer;

    .line 22
    .line 23
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, La/x8x;->L(I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v0, v4, v3, v1, v2}, La/gkb;->p(La/mm40;La/dhm;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v9, p1

    .line 37
    .line 38
    check-cast v9, La/fet;

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
    and-int/lit8 v5, v1, 0x3

    .line 49
    .line 50
    const/4 v6, 0x2

    .line 51
    const/4 v11, 0x0

    .line 52
    if-eq v5, v6, :cond_0

    .line 53
    .line 54
    move v5, v2

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    move v5, v11

    .line 57
    :goto_0
    and-int/2addr v1, v2

    .line 58
    invoke-virtual {v9, v1, v5}, La/fet;->U(IZ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-eqz v1, :cond_6

    .line 63
    .line 64
    sget-object v1, La/qmk;->a:La/zcl;

    .line 65
    .line 66
    const/high16 v1, 0x42f00000    # 120.0f

    .line 67
    .line 68
    invoke-static {v0, v1}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 73
    .line 74
    invoke-virtual {v9, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    check-cast v5, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 79
    .line 80
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 81
    .line 82
    .line 83
    move-result-wide v5

    .line 84
    const/high16 v7, 0x41800000    # 16.0f

    .line 85
    .line 86
    invoke-static {v7}, La/vgg0;->a(F)La/ugg0;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    invoke-static {v0, v5, v6, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 91
    .line 92
    .line 93
    move-result-object v12

    .line 94
    invoke-virtual {v9, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v5

    .line 102
    or-int/2addr v0, v5

    .line 103
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    if-nez v0, :cond_1

    .line 108
    .line 109
    sget-object v0, La/ukd;->a:La/cl5;

    .line 110
    .line 111
    if-ne v5, v0, :cond_2

    .line 112
    .line 113
    :cond_1
    new-instance v5, La/gmo;

    .line 114
    .line 115
    const/4 v0, 0x5

    .line 116
    invoke-direct {v5, v3, v4, v0}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v9, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_2
    move-object/from16 v17, v5

    .line 123
    .line 124
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 125
    .line 126
    const/16 v18, 0x1c

    .line 127
    .line 128
    const/4 v13, 0x0

    .line 129
    const/4 v14, 0x0

    .line 130
    const/4 v15, 0x0

    .line 131
    const/16 v16, 0x0

    .line 132
    .line 133
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    sget-object v3, La/uc9;->c:La/mw3;

    .line 138
    .line 139
    sget-object v5, La/gqw0;->m:La/xx7;

    .line 140
    .line 141
    invoke-static {v3, v5, v9, v11}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    iget-wide v5, v9, La/fet;->T:J

    .line 146
    .line 147
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 152
    .line 153
    .line 154
    move-result-object v6

    .line 155
    invoke-static {v9, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 160
    .line 161
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v9}, La/fet;->i0()V

    .line 165
    .line 166
    .line 167
    iget-boolean v7, v9, La/fet;->S:Z

    .line 168
    .line 169
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 170
    .line 171
    if-eqz v7, :cond_3

    .line 172
    .line 173
    invoke-virtual {v9, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 174
    .line 175
    .line 176
    goto :goto_1

    .line 177
    :cond_3
    invoke-virtual {v9}, La/fet;->r0()V

    .line 178
    .line 179
    .line 180
    :goto_1
    sget-object v13, La/gqw0;->x:La/shd;

    .line 181
    .line 182
    invoke-static {v9, v3, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    sget-object v3, La/gqw0;->w:La/shd;

    .line 186
    .line 187
    invoke-static {v9, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    .line 192
    .line 193
    move-result-object v5

    .line 194
    sget-object v14, La/gqw0;->y:La/shd;

    .line 195
    .line 196
    invoke-static {v9, v5, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v9}, La/jpm0;->n(La/fet;)V

    .line 200
    .line 201
    .line 202
    sget-object v15, La/gqw0;->v:La/shd;

    .line 203
    .line 204
    invoke-static {v9, v0, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 205
    .line 206
    .line 207
    const/16 v20, 0x0

    .line 208
    .line 209
    const/16 v21, 0x8

    .line 210
    .line 211
    sget-object v16, La/jm40;->b:La/jm40;

    .line 212
    .line 213
    const/high16 v17, 0x41400000    # 12.0f

    .line 214
    .line 215
    const/high16 v18, 0x40c00000    # 6.0f

    .line 216
    .line 217
    const/high16 v19, 0x41400000    # 12.0f

    .line 218
    .line 219
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    const/high16 v5, 0x41e00000    # 28.0f

    .line 224
    .line 225
    invoke-static {v0, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 230
    .line 231
    new-instance v6, La/qw3;

    .line 232
    .line 233
    new-instance v7, La/jf4;

    .line 234
    .line 235
    const/16 v8, 0xe

    .line 236
    .line 237
    invoke-direct {v7, v8}, La/jf4;-><init>(B)V

    .line 238
    .line 239
    .line 240
    const/high16 v8, 0x40800000    # 4.0f

    .line 241
    .line 242
    invoke-direct {v6, v8, v2, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 243
    .line 244
    .line 245
    const/16 v7, 0x30

    .line 246
    .line 247
    invoke-static {v6, v5, v9, v7}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    iget-wide v6, v9, La/fet;->T:J

    .line 252
    .line 253
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 254
    .line 255
    .line 256
    move-result v6

    .line 257
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 258
    .line 259
    .line 260
    move-result-object v7

    .line 261
    invoke-static {v9, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 262
    .line 263
    .line 264
    move-result-object v0

    .line 265
    invoke-virtual {v9}, La/fet;->i0()V

    .line 266
    .line 267
    .line 268
    iget-boolean v8, v9, La/fet;->S:Z

    .line 269
    .line 270
    if-eqz v8, :cond_4

    .line 271
    .line 272
    invoke-virtual {v9, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 273
    .line 274
    .line 275
    goto :goto_2

    .line 276
    :cond_4
    invoke-virtual {v9}, La/fet;->r0()V

    .line 277
    .line 278
    .line 279
    :goto_2
    invoke-static {v9, v5, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 280
    .line 281
    .line 282
    invoke-static {v9, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v6, v9, v14, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 286
    .line 287
    .line 288
    invoke-static {v9, v0, v15}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 289
    .line 290
    .line 291
    iget-object v8, v4, La/dhm;->l:La/n0x;

    .line 292
    .line 293
    iget-wide v6, v4, La/dhm;->k:J

    .line 294
    .line 295
    const/4 v5, 0x0

    .line 296
    const/4 v10, 0x0

    .line 297
    move-object/from16 v0, v16

    .line 298
    .line 299
    invoke-static/range {v5 .. v10}, La/gkb;->N(La/mm40;JLa/n0x;La/fet;I)V

    .line 300
    .line 301
    .line 302
    iget-object v5, v4, La/dhm;->j:Ljava/lang/String;

    .line 303
    .line 304
    const/16 v6, 0xa

    .line 305
    .line 306
    invoke-static {v6}, La/idm0;->t(I)J

    .line 307
    .line 308
    .line 309
    move-result-wide v18

    .line 310
    invoke-virtual {v9, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 315
    .line 316
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 317
    .line 318
    .line 319
    move-result-wide v7

    .line 320
    sget-object v26, La/j1t0;->b:La/qrq;

    .line 321
    .line 322
    sget-wide v23, La/qmk;->q:J

    .line 323
    .line 324
    sget-wide v32, La/qmk;->D:J

    .line 325
    .line 326
    new-instance v20, La/y9q0;

    .line 327
    .line 328
    const/16 v31, 0x0

    .line 329
    .line 330
    const v34, 0xfdff9d

    .line 331
    .line 332
    .line 333
    const-wide/16 v21, 0x0

    .line 334
    .line 335
    const/16 v25, 0x0

    .line 336
    .line 337
    const-wide/16 v27, 0x0

    .line 338
    .line 339
    const/16 v29, 0x0

    .line 340
    .line 341
    const/16 v30, 0x0

    .line 342
    .line 343
    invoke-direct/range {v20 .. v34}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 344
    .line 345
    .line 346
    move-object/from16 v1, v20

    .line 347
    .line 348
    invoke-static {v1, v9}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 349
    .line 350
    .line 351
    move-result-object v25

    .line 352
    const/16 v28, 0x61b0

    .line 353
    .line 354
    const v29, 0x1a7fa

    .line 355
    .line 356
    .line 357
    const/4 v6, 0x0

    .line 358
    move-object/from16 v26, v9

    .line 359
    .line 360
    const/4 v9, 0x0

    .line 361
    move v1, v11

    .line 362
    const-wide/16 v10, 0x0

    .line 363
    .line 364
    move-object/from16 v16, v12

    .line 365
    .line 366
    const/4 v12, 0x0

    .line 367
    move-object/from16 v17, v13

    .line 368
    .line 369
    const/4 v13, 0x0

    .line 370
    move-object/from16 v20, v14

    .line 371
    .line 372
    const/4 v14, 0x0

    .line 373
    move-object/from16 v21, v15

    .line 374
    .line 375
    move-object/from16 v22, v16

    .line 376
    .line 377
    const-wide/16 v15, 0x0

    .line 378
    .line 379
    move-object/from16 v23, v17

    .line 380
    .line 381
    const/16 v17, 0x0

    .line 382
    .line 383
    move-object/from16 v24, v20

    .line 384
    .line 385
    const/16 v20, 0x2

    .line 386
    .line 387
    move-object/from16 v27, v21

    .line 388
    .line 389
    const/16 v21, 0x0

    .line 390
    .line 391
    move-object/from16 v30, v22

    .line 392
    .line 393
    const/16 v22, 0x2

    .line 394
    .line 395
    move-object/from16 v31, v23

    .line 396
    .line 397
    const/16 v23, 0x0

    .line 398
    .line 399
    move-object/from16 v32, v24

    .line 400
    .line 401
    const/16 v24, 0x0

    .line 402
    .line 403
    move-object/from16 v33, v27

    .line 404
    .line 405
    const/16 v27, 0x0

    .line 406
    .line 407
    move-object/from16 v36, v30

    .line 408
    .line 409
    move-object/from16 v35, v33

    .line 410
    .line 411
    move-object/from16 v30, v4

    .line 412
    .line 413
    move v4, v1

    .line 414
    move-object/from16 v1, v31

    .line 415
    .line 416
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v9, v26

    .line 420
    .line 421
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 422
    .line 423
    .line 424
    const/high16 v5, 0x41000000    # 8.0f

    .line 425
    .line 426
    const/high16 v6, 0x41400000    # 12.0f

    .line 427
    .line 428
    invoke-static {v0, v6, v5, v6, v6}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    sget-object v6, La/uc9;->a:La/lw3;

    .line 433
    .line 434
    sget-object v7, La/gqw0;->j:La/yx7;

    .line 435
    .line 436
    invoke-static {v6, v7, v9, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 437
    .line 438
    .line 439
    move-result-object v6

    .line 440
    iget-wide v7, v9, La/fet;->T:J

    .line 441
    .line 442
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 443
    .line 444
    .line 445
    move-result v7

    .line 446
    invoke-virtual {v9}, La/fet;->m()La/bh90;

    .line 447
    .line 448
    .line 449
    move-result-object v8

    .line 450
    invoke-static {v9, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    invoke-virtual {v9}, La/fet;->i0()V

    .line 455
    .line 456
    .line 457
    iget-boolean v10, v9, La/fet;->S:Z

    .line 458
    .line 459
    if-eqz v10, :cond_5

    .line 460
    .line 461
    move-object/from16 v10, v36

    .line 462
    .line 463
    invoke-virtual {v9, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 464
    .line 465
    .line 466
    goto :goto_3

    .line 467
    :cond_5
    invoke-virtual {v9}, La/fet;->r0()V

    .line 468
    .line 469
    .line 470
    :goto_3
    invoke-static {v9, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v9, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 474
    .line 475
    .line 476
    move-object/from16 v1, v32

    .line 477
    .line 478
    invoke-static {v7, v9, v1, v9}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 479
    .line 480
    .line 481
    move-object/from16 v1, v35

    .line 482
    .line 483
    invoke-static {v9, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 484
    .line 485
    .line 486
    sget-object v1, La/zhg0;->a:La/zhg0;

    .line 487
    .line 488
    const v3, 0x3ea8f5c3    # 0.33f

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, v3, v0, v2}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 492
    .line 493
    .line 494
    move-result-object v5

    .line 495
    move-object/from16 v6, v30

    .line 496
    .line 497
    iget-object v7, v6, La/dhm;->c:La/d280;

    .line 498
    .line 499
    iget-object v8, v6, La/dhm;->b:Ljava/lang/String;

    .line 500
    .line 501
    invoke-static {v4, v9, v5, v7, v8}, La/gkb;->w(ILa/fet;La/mm40;La/d280;Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-virtual {v1, v3, v0, v2}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 505
    .line 506
    .line 507
    move-result-object v5

    .line 508
    invoke-static {v5, v6, v9, v4}, La/gkb;->v(La/mm40;La/dhm;La/fet;I)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v3, v0, v2}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    iget-object v1, v6, La/dhm;->e:La/d280;

    .line 516
    .line 517
    iget-object v3, v6, La/dhm;->d:Ljava/lang/String;

    .line 518
    .line 519
    invoke-static {v4, v9, v0, v1, v3}, La/gkb;->w(ILa/fet;La/mm40;La/d280;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v9, v2}, La/fet;->r(Z)V

    .line 526
    .line 527
    .line 528
    goto :goto_4

    .line 529
    :cond_6
    invoke-virtual {v9}, La/fet;->X()V

    .line 530
    .line 531
    .line 532
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object v0

    .line 535
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
