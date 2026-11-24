.class public final synthetic La/azy;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mm40;

.field public final synthetic c:La/fzy;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/mm40;La/fzy;Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/4 p4, 0x1

    iput-byte p4, p0, La/azy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/azy;->b:La/mm40;

    iput-object p2, p0, La/azy;->c:La/fzy;

    iput-object p3, p0, La/azy;->d:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(La/mm40;Lkotlin/jvm/functions/Function1;La/fzy;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/azy;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/azy;->b:La/mm40;

    iput-object p2, p0, La/azy;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/azy;->c:La/fzy;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 50

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/azy;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, v0, La/azy;->d:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/fet;

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    check-cast v4, Ljava/lang/Integer;

    .line 18
    .line 19
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {v2}, La/x8x;->L(I)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-object v4, v0, La/azy;->b:La/mm40;

    .line 27
    .line 28
    iget-object v0, v0, La/azy;->c:La/fzy;

    .line 29
    .line 30
    invoke-static {v4, v0, v3, v1, v2}, La/qxw;->d(La/mm40;La/fzy;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 31
    .line 32
    .line 33
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object v0

    .line 36
    :pswitch_0
    move-object/from16 v8, p1

    .line 37
    .line 38
    check-cast v8, La/fet;

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
    sget-object v10, La/qja;->j:La/qja;

    .line 49
    .line 50
    and-int/lit8 v4, v1, 0x3

    .line 51
    .line 52
    const/4 v11, 0x2

    .line 53
    const/4 v12, 0x0

    .line 54
    if-eq v4, v11, :cond_0

    .line 55
    .line 56
    move v4, v2

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    move v4, v12

    .line 59
    :goto_0
    and-int/2addr v1, v2

    .line 60
    invoke-virtual {v8, v1, v4}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_21

    .line 65
    .line 66
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    iget-object v14, v0, La/azy;->c:La/fzy;

    .line 71
    .line 72
    invoke-virtual {v8, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    or-int/2addr v1, v4

    .line 77
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const/16 v13, 0x17

    .line 82
    .line 83
    sget-object v15, La/ukd;->a:La/cl5;

    .line 84
    .line 85
    if-nez v1, :cond_1

    .line 86
    .line 87
    if-ne v4, v15, :cond_2

    .line 88
    .line 89
    :cond_1
    new-instance v4, La/wqv;

    .line 90
    .line 91
    invoke-direct {v4, v3, v14, v13}, La/wqv;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :cond_2
    move-object/from16 v21, v4

    .line 98
    .line 99
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 100
    .line 101
    const/16 v22, 0x1c

    .line 102
    .line 103
    iget-object v0, v0, La/azy;->b:La/mm40;

    .line 104
    .line 105
    const/16 v17, 0x0

    .line 106
    .line 107
    const/16 v18, 0x0

    .line 108
    .line 109
    const/16 v19, 0x0

    .line 110
    .line 111
    const/16 v20, 0x0

    .line 112
    .line 113
    move-object/from16 v16, v0

    .line 114
    .line 115
    invoke-static/range {v16 .. v22}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 120
    .line 121
    sget-object v3, La/uc9;->g:La/nw3;

    .line 122
    .line 123
    const/16 v4, 0x36

    .line 124
    .line 125
    invoke-static {v3, v1, v8, v4}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    iget-wide v3, v8, La/fet;->T:J

    .line 130
    .line 131
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 132
    .line 133
    .line 134
    move-result v3

    .line 135
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 136
    .line 137
    .line 138
    move-result-object v4

    .line 139
    invoke-static {v8, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    sget-object v5, La/mkd;->c0:La/gqw0;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    invoke-virtual {v8}, La/fet;->i0()V

    .line 149
    .line 150
    .line 151
    iget-boolean v5, v8, La/fet;->S:Z

    .line 152
    .line 153
    if-eqz v5, :cond_3

    .line 154
    .line 155
    sget-object v5, La/e7z;->u1:La/pcy;

    .line 156
    .line 157
    invoke-virtual {v8, v5}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_3
    invoke-virtual {v8}, La/fet;->r0()V

    .line 162
    .line 163
    .line 164
    :goto_1
    sget-object v5, La/gqw0;->x:La/shd;

    .line 165
    .line 166
    invoke-static {v8, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    sget-object v1, La/gqw0;->w:La/shd;

    .line 170
    .line 171
    invoke-static {v8, v4, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 172
    .line 173
    .line 174
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    sget-object v3, La/gqw0;->y:La/shd;

    .line 179
    .line 180
    invoke-static {v8, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 181
    .line 182
    .line 183
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 184
    .line 185
    .line 186
    sget-object v1, La/gqw0;->v:La/shd;

    .line 187
    .line 188
    invoke-static {v8, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 189
    .line 190
    .line 191
    iget-object v0, v14, La/fzy;->f:La/hkv0;

    .line 192
    .line 193
    sget-object v1, La/hkv0;->c:La/hkv0;

    .line 194
    .line 195
    if-eq v0, v1, :cond_4

    .line 196
    .line 197
    move v0, v2

    .line 198
    goto :goto_2

    .line 199
    :cond_4
    move v0, v12

    .line 200
    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-static {v0, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v1, v14, La/fzy;->f:La/hkv0;

    .line 209
    .line 210
    const/4 v3, 0x0

    .line 211
    invoke-static {v1, v3, v8, v12, v11}, La/phu0;->Z(Ljava/lang/Object;Ljava/lang/String;La/fet;II)La/oms0;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    iget-object v4, v1, La/oms0;->d:La/pz40;

    .line 216
    .line 217
    iget-object v5, v1, La/oms0;->a:La/p4;

    .line 218
    .line 219
    move-object/from16 v16, v4

    .line 220
    .line 221
    check-cast v16, La/hgk0;

    .line 222
    .line 223
    invoke-virtual/range {v16 .. v16}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v4

    .line 227
    check-cast v4, La/hkv0;

    .line 228
    .line 229
    const v6, 0x7c38c053

    .line 230
    .line 231
    .line 232
    invoke-virtual {v8, v6}, La/fet;->e0(I)V

    .line 233
    .line 234
    .line 235
    sget-object v17, La/dzy;->a:[I

    .line 236
    .line 237
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    aget v4, v17, v4

    .line 242
    .line 243
    const v7, 0x510a0ffe

    .line 244
    .line 245
    .line 246
    const v9, 0x510a08b8

    .line 247
    .line 248
    .line 249
    if-ne v4, v2, :cond_5

    .line 250
    .line 251
    invoke-static {v8, v9, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 252
    .line 253
    .line 254
    move-result-wide v18

    .line 255
    goto :goto_3

    .line 256
    :cond_5
    invoke-static {v8, v7, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 257
    .line 258
    .line 259
    move-result-wide v18

    .line 260
    :goto_3
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 261
    .line 262
    .line 263
    invoke-static/range {v18 .. v19}, La/y3d;->f(J)La/y4d;

    .line 264
    .line 265
    .line 266
    move-result-object v4

    .line 267
    invoke-virtual {v8, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 268
    .line 269
    .line 270
    move-result v18

    .line 271
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v13

    .line 275
    if-nez v18, :cond_6

    .line 276
    .line 277
    if-ne v13, v15, :cond_7

    .line 278
    .line 279
    :cond_6
    new-instance v13, La/s43;

    .line 280
    .line 281
    invoke-direct {v13, v4, v11}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 282
    .line 283
    .line 284
    invoke-static {v10, v13, v8}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 285
    .line 286
    .line 287
    move-result-object v13

    .line 288
    :cond_7
    check-cast v13, La/lxs0;

    .line 289
    .line 290
    invoke-virtual {v1}, La/oms0;->h()Z

    .line 291
    .line 292
    .line 293
    move-result v4

    .line 294
    const v11, 0x6359c50d

    .line 295
    .line 296
    .line 297
    const v3, 0x6355e4b0

    .line 298
    .line 299
    .line 300
    if-nez v4, :cond_b

    .line 301
    .line 302
    invoke-virtual {v8, v3}, La/fet;->e0(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v4

    .line 309
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 310
    .line 311
    .line 312
    move-result-object v3

    .line 313
    if-nez v4, :cond_8

    .line 314
    .line 315
    if-ne v3, v15, :cond_a

    .line 316
    .line 317
    :cond_8
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 318
    .line 319
    .line 320
    move-result-object v3

    .line 321
    if-eqz v3, :cond_9

    .line 322
    .line 323
    invoke-virtual {v3}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    goto :goto_4

    .line 328
    :cond_9
    const/4 v4, 0x0

    .line 329
    :goto_4
    invoke-static {v3}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 330
    .line 331
    .line 332
    move-result-object v7

    .line 333
    :try_start_0
    invoke-virtual {v5}, La/p4;->y0()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 337
    invoke-static {v3, v7, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 338
    .line 339
    .line 340
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    move-object v3, v9

    .line 344
    :cond_a
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 345
    .line 346
    .line 347
    goto :goto_5

    .line 348
    :catchall_0
    move-exception v0

    .line 349
    invoke-static {v3, v7, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 350
    .line 351
    .line 352
    throw v0

    .line 353
    :cond_b
    invoke-static {v8, v11, v12, v5}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v3

    .line 357
    :goto_5
    check-cast v3, La/hkv0;

    .line 358
    .line 359
    invoke-virtual {v8, v6}, La/fet;->e0(I)V

    .line 360
    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 363
    .line 364
    .line 365
    move-result v3

    .line 366
    aget v3, v17, v3

    .line 367
    .line 368
    if-ne v3, v2, :cond_c

    .line 369
    .line 370
    const v3, 0x510a08b8

    .line 371
    .line 372
    .line 373
    invoke-static {v8, v3, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 374
    .line 375
    .line 376
    move-result-wide v21

    .line 377
    :goto_6
    move-wide/from16 v3, v21

    .line 378
    .line 379
    goto :goto_7

    .line 380
    :cond_c
    const v3, 0x510a0ffe

    .line 381
    .line 382
    .line 383
    invoke-static {v8, v3, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 384
    .line 385
    .line 386
    move-result-wide v21

    .line 387
    goto :goto_6

    .line 388
    :goto_7
    invoke-static {v8, v12, v3, v4}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 393
    .line 394
    .line 395
    move-result v3

    .line 396
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v7

    .line 400
    if-nez v3, :cond_d

    .line 401
    .line 402
    if-ne v7, v15, :cond_e

    .line 403
    .line 404
    :cond_d
    new-instance v3, La/m6x;

    .line 405
    .line 406
    const/16 v7, 0x13

    .line 407
    .line 408
    invoke-direct {v3, v1, v7}, La/m6x;-><init>(La/oms0;B)V

    .line 409
    .line 410
    .line 411
    invoke-static {v3}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    :cond_e
    check-cast v7, La/l7m0;

    .line 419
    .line 420
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v3

    .line 424
    check-cast v3, La/hkv0;

    .line 425
    .line 426
    invoke-virtual {v8, v6}, La/fet;->e0(I)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 430
    .line 431
    .line 432
    move-result v3

    .line 433
    aget v3, v17, v3

    .line 434
    .line 435
    if-ne v3, v2, :cond_f

    .line 436
    .line 437
    const v3, 0x510a08b8

    .line 438
    .line 439
    .line 440
    invoke-static {v8, v3, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 441
    .line 442
    .line 443
    move-result-wide v6

    .line 444
    goto :goto_8

    .line 445
    :cond_f
    const v3, 0x510a0ffe

    .line 446
    .line 447
    .line 448
    invoke-static {v8, v3, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 449
    .line 450
    .line 451
    move-result-wide v6

    .line 452
    :goto_8
    invoke-static {v8, v12, v6, v7}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 457
    .line 458
    .line 459
    move-result v6

    .line 460
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v7

    .line 464
    if-nez v6, :cond_10

    .line 465
    .line 466
    if-ne v7, v15, :cond_11

    .line 467
    .line 468
    :cond_10
    new-instance v6, La/m6x;

    .line 469
    .line 470
    const/16 v7, 0x15

    .line 471
    .line 472
    invoke-direct {v6, v1, v7}, La/m6x;-><init>(La/oms0;B)V

    .line 473
    .line 474
    .line 475
    invoke-static {v6}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 476
    .line 477
    .line 478
    move-result-object v7

    .line 479
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    :cond_11
    check-cast v7, La/l7m0;

    .line 483
    .line 484
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v6

    .line 488
    check-cast v6, La/ams0;

    .line 489
    .line 490
    const v6, -0x2e941554

    .line 491
    .line 492
    .line 493
    invoke-virtual {v8, v6}, La/fet;->e0(I)V

    .line 494
    .line 495
    .line 496
    const/4 v7, 0x0

    .line 497
    const/4 v9, 0x7

    .line 498
    const/4 v6, 0x0

    .line 499
    invoke-static {v7, v7, v6, v9}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 500
    .line 501
    .line 502
    move-result-object v20

    .line 503
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 504
    .line 505
    .line 506
    move/from16 v21, v9

    .line 507
    .line 508
    const/4 v9, 0x0

    .line 509
    move-object v7, v13

    .line 510
    move-object/from16 v6, v20

    .line 511
    .line 512
    const v2, 0x6355e4b0

    .line 513
    .line 514
    .line 515
    move-object v13, v5

    .line 516
    move-object v5, v3

    .line 517
    move-object v3, v1

    .line 518
    const v1, -0x2e941554

    .line 519
    .line 520
    .line 521
    invoke-static/range {v3 .. v9}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 522
    .line 523
    .line 524
    move-result-object v18

    .line 525
    invoke-virtual/range {v16 .. v16}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v4

    .line 529
    check-cast v4, La/hkv0;

    .line 530
    .line 531
    const v5, 0x5ab7f7b9

    .line 532
    .line 533
    .line 534
    invoke-virtual {v8, v5}, La/fet;->e0(I)V

    .line 535
    .line 536
    .line 537
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 538
    .line 539
    .line 540
    move-result v4

    .line 541
    aget v4, v17, v4

    .line 542
    .line 543
    const v6, -0x7366fa1c

    .line 544
    .line 545
    .line 546
    const v7, -0x73670162

    .line 547
    .line 548
    .line 549
    const/4 v9, 0x2

    .line 550
    if-ne v4, v9, :cond_12

    .line 551
    .line 552
    invoke-static {v8, v7, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 553
    .line 554
    .line 555
    move-result-wide v24

    .line 556
    goto :goto_9

    .line 557
    :cond_12
    invoke-static {v8, v6, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 558
    .line 559
    .line 560
    move-result-wide v24

    .line 561
    :goto_9
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 562
    .line 563
    .line 564
    invoke-static/range {v24 .. v25}, La/y3d;->f(J)La/y4d;

    .line 565
    .line 566
    .line 567
    move-result-object v4

    .line 568
    invoke-virtual {v8, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v9

    .line 572
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    if-nez v9, :cond_13

    .line 577
    .line 578
    if-ne v1, v15, :cond_14

    .line 579
    .line 580
    :cond_13
    new-instance v1, La/s43;

    .line 581
    .line 582
    const/4 v9, 0x2

    .line 583
    invoke-direct {v1, v4, v9}, La/s43;-><init>(Ljava/lang/Object;B)V

    .line 584
    .line 585
    .line 586
    invoke-static {v10, v1, v8}, La/kng0;->d(La/qja;La/s43;La/fet;)La/lxs0;

    .line 587
    .line 588
    .line 589
    move-result-object v1

    .line 590
    :cond_14
    check-cast v1, La/lxs0;

    .line 591
    .line 592
    invoke-virtual {v3}, La/oms0;->h()Z

    .line 593
    .line 594
    .line 595
    move-result v4

    .line 596
    if-nez v4, :cond_18

    .line 597
    .line 598
    invoke-virtual {v8, v2}, La/fet;->e0(I)V

    .line 599
    .line 600
    .line 601
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v2

    .line 605
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v4

    .line 609
    if-nez v2, :cond_15

    .line 610
    .line 611
    if-ne v4, v15, :cond_17

    .line 612
    .line 613
    :cond_15
    invoke-static {}, La/vdx;->J()La/rfk0;

    .line 614
    .line 615
    .line 616
    move-result-object v2

    .line 617
    if-eqz v2, :cond_16

    .line 618
    .line 619
    invoke-virtual {v2}, La/rfk0;->e()Lkotlin/jvm/functions/Function1;

    .line 620
    .line 621
    .line 622
    move-result-object v4

    .line 623
    goto :goto_a

    .line 624
    :cond_16
    const/4 v4, 0x0

    .line 625
    :goto_a
    invoke-static {v2}, La/vdx;->W(La/rfk0;)La/rfk0;

    .line 626
    .line 627
    .line 628
    move-result-object v9

    .line 629
    :try_start_1
    invoke-virtual {v13}, La/p4;->y0()Ljava/lang/Object;

    .line 630
    .line 631
    .line 632
    move-result-object v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 633
    invoke-static {v2, v9, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 634
    .line 635
    .line 636
    invoke-virtual {v8, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 637
    .line 638
    .line 639
    move-object v4, v10

    .line 640
    :cond_17
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 641
    .line 642
    .line 643
    goto :goto_b

    .line 644
    :catchall_1
    move-exception v0

    .line 645
    invoke-static {v2, v9, v4}, La/vdx;->Y(La/rfk0;La/rfk0;Lkotlin/jvm/functions/Function1;)V

    .line 646
    .line 647
    .line 648
    throw v0

    .line 649
    :cond_18
    invoke-static {v8, v11, v12, v13}, La/vqd;->j(La/fet;IZLa/p4;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v4

    .line 653
    :goto_b
    check-cast v4, La/hkv0;

    .line 654
    .line 655
    invoke-virtual {v8, v5}, La/fet;->e0(I)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 659
    .line 660
    .line 661
    move-result v2

    .line 662
    aget v2, v17, v2

    .line 663
    .line 664
    const/4 v9, 0x2

    .line 665
    if-ne v2, v9, :cond_19

    .line 666
    .line 667
    invoke-static {v8, v7, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 668
    .line 669
    .line 670
    move-result-wide v9

    .line 671
    goto :goto_c

    .line 672
    :cond_19
    invoke-static {v8, v6, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 673
    .line 674
    .line 675
    move-result-wide v9

    .line 676
    :goto_c
    invoke-static {v8, v12, v9, v10}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v2

    .line 684
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v9

    .line 688
    if-nez v2, :cond_1a

    .line 689
    .line 690
    if-ne v9, v15, :cond_1b

    .line 691
    .line 692
    :cond_1a
    new-instance v2, La/m6x;

    .line 693
    .line 694
    const/16 v9, 0x17

    .line 695
    .line 696
    invoke-direct {v2, v3, v9}, La/m6x;-><init>(La/oms0;B)V

    .line 697
    .line 698
    .line 699
    invoke-static {v2}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 700
    .line 701
    .line 702
    move-result-object v9

    .line 703
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 704
    .line 705
    .line 706
    :cond_1b
    check-cast v9, La/l7m0;

    .line 707
    .line 708
    invoke-interface {v9}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v2

    .line 712
    check-cast v2, La/hkv0;

    .line 713
    .line 714
    invoke-virtual {v8, v5}, La/fet;->e0(I)V

    .line 715
    .line 716
    .line 717
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 718
    .line 719
    .line 720
    move-result v2

    .line 721
    aget v2, v17, v2

    .line 722
    .line 723
    const/4 v9, 0x2

    .line 724
    if-ne v2, v9, :cond_1c

    .line 725
    .line 726
    invoke-static {v8, v7, v8, v12}, La/cs0;->D(La/fet;ILa/fet;Z)J

    .line 727
    .line 728
    .line 729
    move-result-wide v5

    .line 730
    goto :goto_d

    .line 731
    :cond_1c
    invoke-static {v8, v6, v8, v12}, La/b1j;->e(La/fet;ILa/fet;Z)J

    .line 732
    .line 733
    .line 734
    move-result-wide v5

    .line 735
    :goto_d
    invoke-static {v8, v12, v5, v6}, La/dw9;->f(La/fet;ZJ)La/y3d;

    .line 736
    .line 737
    .line 738
    move-result-object v5

    .line 739
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 740
    .line 741
    .line 742
    move-result v2

    .line 743
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v6

    .line 747
    if-nez v2, :cond_1d

    .line 748
    .line 749
    if-ne v6, v15, :cond_1e

    .line 750
    .line 751
    :cond_1d
    new-instance v2, La/m6x;

    .line 752
    .line 753
    const/16 v6, 0x19

    .line 754
    .line 755
    invoke-direct {v2, v3, v6}, La/m6x;-><init>(La/oms0;B)V

    .line 756
    .line 757
    .line 758
    invoke-static {v2}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 759
    .line 760
    .line 761
    move-result-object v6

    .line 762
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 763
    .line 764
    .line 765
    :cond_1e
    check-cast v6, La/l7m0;

    .line 766
    .line 767
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v2

    .line 771
    check-cast v2, La/ams0;

    .line 772
    .line 773
    const v2, -0x2e941554

    .line 774
    .line 775
    .line 776
    invoke-virtual {v8, v2}, La/fet;->e0(I)V

    .line 777
    .line 778
    .line 779
    const/4 v2, 0x7

    .line 780
    const/4 v6, 0x0

    .line 781
    const/4 v10, 0x0

    .line 782
    invoke-static {v10, v10, v6, v2}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 783
    .line 784
    .line 785
    move-result-object v6

    .line 786
    invoke-virtual {v8, v12}, La/fet;->r(Z)V

    .line 787
    .line 788
    .line 789
    move-object v7, v1

    .line 790
    const/4 v9, 0x0

    .line 791
    invoke-static/range {v3 .. v9}, La/phu0;->E(La/oms0;Ljava/lang/Object;Ljava/lang/Object;La/cfq;La/lxs0;La/fet;I)La/cms0;

    .line 792
    .line 793
    .line 794
    move-result-object v1

    .line 795
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    move-result-object v2

    .line 799
    if-ne v2, v15, :cond_1f

    .line 800
    .line 801
    sget-object v2, La/qmk;->a:La/zcl;

    .line 802
    .line 803
    sget-object v2, La/jm40;->b:La/jm40;

    .line 804
    .line 805
    const/high16 v3, 0x41000000    # 8.0f

    .line 806
    .line 807
    const/4 v9, 0x2

    .line 808
    invoke-static {v2, v3, v10, v9}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    invoke-static {v2, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 813
    .line 814
    .line 815
    move-result-object v2

    .line 816
    invoke-virtual {v8, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 817
    .line 818
    .line 819
    goto :goto_e

    .line 820
    :cond_1f
    const/4 v9, 0x2

    .line 821
    :goto_e
    move-object/from16 v16, v2

    .line 822
    .line 823
    check-cast v16, La/mm40;

    .line 824
    .line 825
    sget-object v2, La/dy2;->a:La/zfn;

    .line 826
    .line 827
    invoke-virtual {v8, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    check-cast v2, Landroid/content/res/Configuration;

    .line 832
    .line 833
    invoke-virtual {v2}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 834
    .line 835
    .line 836
    move-result v2

    .line 837
    const/4 v3, 0x1

    .line 838
    if-ne v2, v3, :cond_20

    .line 839
    .line 840
    move/from16 v34, v9

    .line 841
    .line 842
    goto :goto_f

    .line 843
    :cond_20
    const/16 v34, 0x1

    .line 844
    .line 845
    :goto_f
    sget-object v2, La/dgp0;->d:La/zfn;

    .line 846
    .line 847
    sget-object v41, La/j1t0;->c:La/qrq;

    .line 848
    .line 849
    sget-wide v38, La/qmk;->q:J

    .line 850
    .line 851
    sget-wide v47, La/qmk;->D:J

    .line 852
    .line 853
    new-instance v35, La/y9q0;

    .line 854
    .line 855
    const/16 v46, 0x0

    .line 856
    .line 857
    const v49, 0xfdffdd

    .line 858
    .line 859
    .line 860
    const-wide/16 v36, 0x0

    .line 861
    .line 862
    const/16 v40, 0x0

    .line 863
    .line 864
    const-wide/16 v42, 0x0

    .line 865
    .line 866
    const/16 v44, 0x0

    .line 867
    .line 868
    const/16 v45, 0x0

    .line 869
    .line 870
    invoke-direct/range {v35 .. v49}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 871
    .line 872
    .line 873
    const/16 v38, 0x0

    .line 874
    .line 875
    const v39, 0xfeffff

    .line 876
    .line 877
    .line 878
    const-wide/16 v22, 0x0

    .line 879
    .line 880
    const-wide/16 v24, 0x0

    .line 881
    .line 882
    const/16 v26, 0x0

    .line 883
    .line 884
    const/16 v27, 0x0

    .line 885
    .line 886
    const/16 v28, 0x0

    .line 887
    .line 888
    const-wide/16 v29, 0x0

    .line 889
    .line 890
    const/16 v31, 0x0

    .line 891
    .line 892
    const/16 v32, 0x0

    .line 893
    .line 894
    const/16 v33, 0x0

    .line 895
    .line 896
    move-object/from16 v21, v35

    .line 897
    .line 898
    const-wide/16 v35, 0x0

    .line 899
    .line 900
    const/16 v37, 0x0

    .line 901
    .line 902
    invoke-static/range {v21 .. v39}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 903
    .line 904
    .line 905
    move-result-object v3

    .line 906
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 907
    .line 908
    .line 909
    move-result-object v2

    .line 910
    new-instance v13, La/ajw;

    .line 911
    .line 912
    const/16 v19, 0x4

    .line 913
    .line 914
    move-object v15, v0

    .line 915
    move-object/from16 v17, v18

    .line 916
    .line 917
    move-object/from16 v18, v1

    .line 918
    .line 919
    invoke-direct/range {v13 .. v19}, La/ajw;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/l7m0;La/l7m0;B)V

    .line 920
    .line 921
    .line 922
    const v0, -0x2b5897e2

    .line 923
    .line 924
    .line 925
    invoke-static {v0, v13, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 926
    .line 927
    .line 928
    move-result-object v0

    .line 929
    const/16 v1, 0x38

    .line 930
    .line 931
    invoke-static {v2, v0, v8, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 932
    .line 933
    .line 934
    const/4 v3, 0x1

    .line 935
    invoke-virtual {v8, v3}, La/fet;->r(Z)V

    .line 936
    .line 937
    .line 938
    goto :goto_10

    .line 939
    :cond_21
    invoke-virtual {v8}, La/fet;->X()V

    .line 940
    .line 941
    .line 942
    :goto_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 943
    .line 944
    return-object v0

    .line 945
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
