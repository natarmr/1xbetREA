.class public final synthetic La/e57;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w2d;

.field public final synthetic c:La/z77;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/w2d;La/z77;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/e57;->a:B

    iput-object p1, p0, La/e57;->b:La/w2d;

    iput-object p2, p0, La/e57;->c:La/z77;

    iput-object p3, p0, La/e57;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e57;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    iget-object v4, v0, La/e57;->d:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    iget-object v5, v0, La/e57;->c:La/z77;

    .line 12
    .line 13
    sget-object v6, La/ukd;->a:La/cl5;

    .line 14
    .line 15
    iget-object v7, v0, La/e57;->b:La/w2d;

    .line 16
    .line 17
    const/4 v8, 0x2

    .line 18
    const/4 v9, 0x1

    .line 19
    const/4 v10, 0x0

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    iget-object v1, v7, La/w2d;->a:La/x2d;

    .line 24
    .line 25
    move-object/from16 v2, p1

    .line 26
    .line 27
    check-cast v2, La/fet;

    .line 28
    .line 29
    move-object/from16 v3, p2

    .line 30
    .line 31
    check-cast v3, Ljava/lang/Integer;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    and-int/lit8 v4, v3, 0x3

    .line 38
    .line 39
    if-eq v4, v8, :cond_0

    .line 40
    .line 41
    move v4, v9

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v4, v10

    .line 44
    :goto_0
    and-int/2addr v3, v9

    .line 45
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    if-eqz v3, :cond_4

    .line 50
    .line 51
    iget-object v3, v1, La/x2d;->d:La/agk0;

    .line 52
    .line 53
    invoke-virtual {v3}, La/agk0;->l()F

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    iget-object v1, v1, La/x2d;->f:La/agk0;

    .line 58
    .line 59
    invoke-virtual {v1}, La/agk0;->l()F

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    cmpg-float v1, v3, v1

    .line 64
    .line 65
    if-nez v1, :cond_1

    .line 66
    .line 67
    move v10, v9

    .line 68
    :cond_1
    xor-int/lit8 v13, v10, 0x1

    .line 69
    .line 70
    iget-object v15, v0, La/e57;->d:Lkotlin/jvm/functions/Function1;

    .line 71
    .line 72
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    if-nez v1, :cond_2

    .line 81
    .line 82
    if-ne v3, v6, :cond_3

    .line 83
    .line 84
    :cond_2
    new-instance v3, La/gno0;

    .line 85
    .line 86
    const/16 v1, 0x8

    .line 87
    .line 88
    invoke-direct {v3, v15, v1}, La/gno0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    :cond_3
    move-object v14, v3

    .line 95
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 96
    .line 97
    const/16 v17, 0x0

    .line 98
    .line 99
    const/4 v11, 0x0

    .line 100
    iget-object v12, v0, La/e57;->c:La/z77;

    .line 101
    .line 102
    move-object/from16 v16, v2

    .line 103
    .line 104
    invoke-static/range {v11 .. v17}, La/ay3;->h(La/mm40;La/z77;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    move-object/from16 v16, v2

    .line 109
    .line 110
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 111
    .line 112
    .line 113
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_0
    move-object/from16 v1, p1

    .line 117
    .line 118
    check-cast v1, La/fet;

    .line 119
    .line 120
    move-object/from16 v6, p2

    .line 121
    .line 122
    check-cast v6, Ljava/lang/Integer;

    .line 123
    .line 124
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    and-int/lit8 v7, v6, 0x3

    .line 129
    .line 130
    if-eq v7, v8, :cond_5

    .line 131
    .line 132
    move v7, v9

    .line 133
    goto :goto_2

    .line 134
    :cond_5
    move v7, v10

    .line 135
    :goto_2
    and-int/2addr v6, v9

    .line 136
    invoke-virtual {v1, v6, v7}, La/fet;->U(IZ)Z

    .line 137
    .line 138
    .line 139
    move-result v6

    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    sget-object v6, La/uc9;->c:La/mw3;

    .line 143
    .line 144
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 145
    .line 146
    invoke-static {v6, v7, v1, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    iget-wide v7, v1, La/fet;->T:J

    .line 151
    .line 152
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 153
    .line 154
    .line 155
    move-result v7

    .line 156
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 157
    .line 158
    .line 159
    move-result-object v8

    .line 160
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 165
    .line 166
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, La/fet;->i0()V

    .line 170
    .line 171
    .line 172
    iget-boolean v10, v1, La/fet;->S:Z

    .line 173
    .line 174
    if-eqz v10, :cond_6

    .line 175
    .line 176
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 177
    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_6
    invoke-virtual {v1}, La/fet;->r0()V

    .line 181
    .line 182
    .line 183
    :goto_3
    sget-object v2, La/gqw0;->x:La/shd;

    .line 184
    .line 185
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 186
    .line 187
    .line 188
    sget-object v2, La/gqw0;->w:La/shd;

    .line 189
    .line 190
    invoke-static {v1, v8, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 194
    .line 195
    .line 196
    move-result-object v2

    .line 197
    sget-object v6, La/gqw0;->y:La/shd;

    .line 198
    .line 199
    invoke-static {v1, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 203
    .line 204
    .line 205
    sget-object v2, La/gqw0;->v:La/shd;

    .line 206
    .line 207
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 208
    .line 209
    .line 210
    new-instance v2, La/k57;

    .line 211
    .line 212
    const/4 v3, 0x6

    .line 213
    invoke-direct {v2, v5, v4, v3}, La/k57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 214
    .line 215
    .line 216
    const v3, 0x13182213

    .line 217
    .line 218
    .line 219
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    new-instance v2, La/e57;

    .line 224
    .line 225
    iget-object v0, v0, La/e57;->b:La/w2d;

    .line 226
    .line 227
    const/4 v6, 0x3

    .line 228
    invoke-direct {v2, v0, v5, v4, v6}, La/e57;-><init>(La/w2d;La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 229
    .line 230
    .line 231
    const v4, 0x3ebc3e72

    .line 232
    .line 233
    .line 234
    invoke-static {v4, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 235
    .line 236
    .line 237
    move-result-object v4

    .line 238
    const/16 v6, 0xdc0

    .line 239
    .line 240
    move-object v5, v1

    .line 241
    const/4 v1, 0x0

    .line 242
    move-object v2, v0

    .line 243
    invoke-static/range {v1 .. v6}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 244
    .line 245
    .line 246
    const/4 v0, 0x6

    .line 247
    const/4 v6, 0x6

    .line 248
    sget-object v1, La/zfi0;->a:La/zfi0;

    .line 249
    .line 250
    const/4 v2, 0x0

    .line 251
    const/4 v3, 0x0

    .line 252
    move-object v4, v5

    .line 253
    move v5, v0

    .line 254
    invoke-static/range {v1 .. v6}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 255
    .line 256
    .line 257
    move-object v5, v4

    .line 258
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_7
    move-object v5, v1

    .line 263
    invoke-virtual {v5}, La/fet;->X()V

    .line 264
    .line 265
    .line 266
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_1
    iget-object v1, v7, La/w2d;->a:La/x2d;

    .line 270
    .line 271
    move-object/from16 v2, p1

    .line 272
    .line 273
    check-cast v2, La/fet;

    .line 274
    .line 275
    move-object/from16 v3, p2

    .line 276
    .line 277
    check-cast v3, Ljava/lang/Integer;

    .line 278
    .line 279
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 280
    .line 281
    .line 282
    move-result v3

    .line 283
    and-int/lit8 v4, v3, 0x3

    .line 284
    .line 285
    if-eq v4, v8, :cond_8

    .line 286
    .line 287
    move v4, v9

    .line 288
    goto :goto_5

    .line 289
    :cond_8
    move v4, v10

    .line 290
    :goto_5
    and-int/2addr v3, v9

    .line 291
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 292
    .line 293
    .line 294
    move-result v3

    .line 295
    if-eqz v3, :cond_c

    .line 296
    .line 297
    iget-object v3, v1, La/x2d;->d:La/agk0;

    .line 298
    .line 299
    invoke-virtual {v3}, La/agk0;->l()F

    .line 300
    .line 301
    .line 302
    move-result v3

    .line 303
    iget-object v1, v1, La/x2d;->f:La/agk0;

    .line 304
    .line 305
    invoke-virtual {v1}, La/agk0;->l()F

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    cmpg-float v1, v3, v1

    .line 310
    .line 311
    if-nez v1, :cond_9

    .line 312
    .line 313
    move v10, v9

    .line 314
    :cond_9
    xor-int/lit8 v13, v10, 0x1

    .line 315
    .line 316
    iget-object v15, v0, La/e57;->d:Lkotlin/jvm/functions/Function1;

    .line 317
    .line 318
    invoke-virtual {v2, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 319
    .line 320
    .line 321
    move-result v1

    .line 322
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v3

    .line 326
    if-nez v1, :cond_a

    .line 327
    .line 328
    if-ne v3, v6, :cond_b

    .line 329
    .line 330
    :cond_a
    new-instance v3, La/to6;

    .line 331
    .line 332
    const/4 v1, 0x4

    .line 333
    invoke-direct {v3, v15, v1}, La/to6;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v2, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    :cond_b
    move-object v14, v3

    .line 340
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 341
    .line 342
    const/16 v17, 0x0

    .line 343
    .line 344
    const/4 v11, 0x0

    .line 345
    iget-object v12, v0, La/e57;->c:La/z77;

    .line 346
    .line 347
    move-object/from16 v16, v2

    .line 348
    .line 349
    invoke-static/range {v11 .. v17}, La/ay3;->h(La/mm40;La/z77;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 350
    .line 351
    .line 352
    goto :goto_6

    .line 353
    :cond_c
    move-object/from16 v16, v2

    .line 354
    .line 355
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 356
    .line 357
    .line 358
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 359
    .line 360
    return-object v0

    .line 361
    :pswitch_2
    move-object/from16 v1, p1

    .line 362
    .line 363
    check-cast v1, La/fet;

    .line 364
    .line 365
    move-object/from16 v6, p2

    .line 366
    .line 367
    check-cast v6, Ljava/lang/Integer;

    .line 368
    .line 369
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    and-int/lit8 v7, v6, 0x3

    .line 374
    .line 375
    if-eq v7, v8, :cond_d

    .line 376
    .line 377
    move v7, v9

    .line 378
    goto :goto_7

    .line 379
    :cond_d
    move v7, v10

    .line 380
    :goto_7
    and-int/2addr v6, v9

    .line 381
    invoke-virtual {v1, v6, v7}, La/fet;->U(IZ)Z

    .line 382
    .line 383
    .line 384
    move-result v6

    .line 385
    if-eqz v6, :cond_f

    .line 386
    .line 387
    sget-object v6, La/uc9;->c:La/mw3;

    .line 388
    .line 389
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 390
    .line 391
    invoke-static {v6, v7, v1, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 392
    .line 393
    .line 394
    move-result-object v6

    .line 395
    iget-wide v7, v1, La/fet;->T:J

    .line 396
    .line 397
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 398
    .line 399
    .line 400
    move-result v7

    .line 401
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 402
    .line 403
    .line 404
    move-result-object v8

    .line 405
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    sget-object v11, La/mkd;->c0:La/gqw0;

    .line 410
    .line 411
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    invoke-virtual {v1}, La/fet;->i0()V

    .line 415
    .line 416
    .line 417
    iget-boolean v11, v1, La/fet;->S:Z

    .line 418
    .line 419
    if-eqz v11, :cond_e

    .line 420
    .line 421
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 422
    .line 423
    .line 424
    goto :goto_8

    .line 425
    :cond_e
    invoke-virtual {v1}, La/fet;->r0()V

    .line 426
    .line 427
    .line 428
    :goto_8
    sget-object v2, La/gqw0;->x:La/shd;

    .line 429
    .line 430
    invoke-static {v1, v6, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 431
    .line 432
    .line 433
    sget-object v2, La/gqw0;->w:La/shd;

    .line 434
    .line 435
    invoke-static {v1, v8, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    .line 437
    .line 438
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 439
    .line 440
    .line 441
    move-result-object v2

    .line 442
    sget-object v6, La/gqw0;->y:La/shd;

    .line 443
    .line 444
    invoke-static {v1, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 445
    .line 446
    .line 447
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 448
    .line 449
    .line 450
    sget-object v2, La/gqw0;->v:La/shd;

    .line 451
    .line 452
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 453
    .line 454
    .line 455
    new-instance v2, La/k57;

    .line 456
    .line 457
    invoke-direct {v2, v5, v4, v10}, La/k57;-><init>(La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 458
    .line 459
    .line 460
    const v3, 0x1aaeb05d

    .line 461
    .line 462
    .line 463
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 464
    .line 465
    .line 466
    move-result-object v3

    .line 467
    new-instance v2, La/e57;

    .line 468
    .line 469
    iget-object v0, v0, La/e57;->b:La/w2d;

    .line 470
    .line 471
    invoke-direct {v2, v0, v5, v4, v9}, La/e57;-><init>(La/w2d;La/z77;Lkotlin/jvm/functions/Function1;B)V

    .line 472
    .line 473
    .line 474
    const v4, 0x453139bc

    .line 475
    .line 476
    .line 477
    invoke-static {v4, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 478
    .line 479
    .line 480
    move-result-object v4

    .line 481
    const/16 v6, 0xdc0

    .line 482
    .line 483
    move-object v5, v1

    .line 484
    const/4 v1, 0x0

    .line 485
    move-object v2, v0

    .line 486
    invoke-static/range {v1 .. v6}, La/agc;->y(La/mm40;La/w2d;La/ugd;La/ugd;La/fet;I)V

    .line 487
    .line 488
    .line 489
    const/4 v0, 0x6

    .line 490
    const/4 v6, 0x6

    .line 491
    sget-object v1, La/zfi0;->a:La/zfi0;

    .line 492
    .line 493
    const/4 v2, 0x0

    .line 494
    const/4 v3, 0x0

    .line 495
    move-object v4, v5

    .line 496
    move v5, v0

    .line 497
    invoke-static/range {v1 .. v6}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 498
    .line 499
    .line 500
    move-object v5, v4

    .line 501
    invoke-virtual {v5, v9}, La/fet;->r(Z)V

    .line 502
    .line 503
    .line 504
    goto :goto_9

    .line 505
    :cond_f
    move-object v5, v1

    .line 506
    invoke-virtual {v5}, La/fet;->X()V

    .line 507
    .line 508
    .line 509
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    return-object v0

    .line 512
    nop

    .line 513
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
