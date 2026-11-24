.class public final synthetic La/aiq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jjl;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(La/jjl;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/aiq;->a:B

    iput-object p1, p0, La/aiq;->b:La/jjl;

    iput-wide p2, p0, La/aiq;->c:J

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
    iget-byte v1, v0, La/aiq;->a:B

    .line 4
    .line 5
    sget-object v2, La/e7z;->u1:La/pcy;

    .line 6
    .line 7
    sget-object v3, La/jm40;->b:La/jm40;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    iget-object v7, v0, La/aiq;->b:La/jjl;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, La/fet;

    .line 20
    .line 21
    move-object/from16 v2, p2

    .line 22
    .line 23
    check-cast v2, Ljava/lang/Integer;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    and-int/lit8 v3, v2, 0x3

    .line 30
    .line 31
    if-eq v3, v5, :cond_0

    .line 32
    .line 33
    move v4, v6

    .line 34
    :cond_0
    and-int/2addr v2, v6

    .line 35
    invoke-virtual {v1, v2, v4}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    iget-object v9, v7, La/jjl;->a:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v10, v7, La/jjl;->b:Ljava/lang/String;

    .line 44
    .line 45
    sget-object v2, La/j1t0;->e:La/zfn;

    .line 46
    .line 47
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, La/g1t0;

    .line 52
    .line 53
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 57
    .line 58
    .line 59
    move-result-object v13

    .line 60
    sget-wide v14, La/qmk;->r:J

    .line 61
    .line 62
    sget-wide v16, La/qmk;->q:J

    .line 63
    .line 64
    const/16 v20, 0x6

    .line 65
    .line 66
    const/16 v21, 0x80

    .line 67
    .line 68
    sget-object v8, La/jm40;->b:La/jm40;

    .line 69
    .line 70
    iget-wide v11, v0, La/aiq;->c:J

    .line 71
    .line 72
    const/16 v18, 0x0

    .line 73
    .line 74
    move-object/from16 v19, v1

    .line 75
    .line 76
    invoke-static/range {v8 .. v21}, La/paq0;->b(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;JJFLa/fet;II)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move-object/from16 v19, v1

    .line 81
    .line 82
    invoke-virtual/range {v19 .. v19}, La/fet;->X()V

    .line 83
    .line 84
    .line 85
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_0
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/fet;

    .line 91
    .line 92
    move-object/from16 v8, p2

    .line 93
    .line 94
    check-cast v8, Ljava/lang/Integer;

    .line 95
    .line 96
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    and-int/lit8 v9, v8, 0x3

    .line 101
    .line 102
    if-eq v9, v5, :cond_2

    .line 103
    .line 104
    move v5, v6

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    move v5, v4

    .line 107
    :goto_1
    and-int/2addr v8, v6

    .line 108
    invoke-virtual {v1, v8, v5}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v5

    .line 112
    if-eqz v5, :cond_5

    .line 113
    .line 114
    sget-object v5, La/gqw0;->l:La/yx7;

    .line 115
    .line 116
    sget-object v8, La/uc9;->a:La/lw3;

    .line 117
    .line 118
    const/16 v9, 0x36

    .line 119
    .line 120
    invoke-static {v8, v5, v1, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    iget-wide v8, v1, La/fet;->T:J

    .line 125
    .line 126
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 127
    .line 128
    .line 129
    move-result v8

    .line 130
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 131
    .line 132
    .line 133
    move-result-object v9

    .line 134
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v3

    .line 138
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 139
    .line 140
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1}, La/fet;->i0()V

    .line 144
    .line 145
    .line 146
    iget-boolean v10, v1, La/fet;->S:Z

    .line 147
    .line 148
    if-eqz v10, :cond_3

    .line 149
    .line 150
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 151
    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_3
    invoke-virtual {v1}, La/fet;->r0()V

    .line 155
    .line 156
    .line 157
    :goto_2
    sget-object v2, La/gqw0;->x:La/shd;

    .line 158
    .line 159
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 160
    .line 161
    .line 162
    sget-object v2, La/gqw0;->w:La/shd;

    .line 163
    .line 164
    invoke-static {v1, v9, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 165
    .line 166
    .line 167
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    sget-object v5, La/gqw0;->y:La/shd;

    .line 172
    .line 173
    invoke-static {v1, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 177
    .line 178
    .line 179
    sget-object v2, La/gqw0;->v:La/shd;

    .line 180
    .line 181
    const/high16 v5, 0x3f800000    # 1.0f

    .line 182
    .line 183
    invoke-static {v1, v3, v2, v5, v4}, La/ohs0;->i(La/fet;La/mm40;La/shd;FZ)La/x7z;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    const-string v3, "DS_ACCOUNT_SELECTION_TITLE"

    .line 188
    .line 189
    invoke-static {v2, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 190
    .line 191
    .line 192
    move-result-object v8

    .line 193
    iget-object v2, v7, La/jjl;->d:Ljava/lang/String;

    .line 194
    .line 195
    if-nez v2, :cond_4

    .line 196
    .line 197
    const-string v2, ""

    .line 198
    .line 199
    :cond_4
    move-object v7, v2

    .line 200
    sget-object v2, La/j1t0;->e:La/zfn;

    .line 201
    .line 202
    invoke-virtual {v1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, La/g1t0;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {}, La/g1t0;->h()La/y9q0;

    .line 212
    .line 213
    .line 214
    move-result-object v27

    .line 215
    const/16 v30, 0x6180

    .line 216
    .line 217
    const v31, 0x1aff8

    .line 218
    .line 219
    .line 220
    iget-wide v9, v0, La/aiq;->c:J

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    const-wide/16 v12, 0x0

    .line 224
    .line 225
    const/4 v14, 0x0

    .line 226
    const/4 v15, 0x0

    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    const-wide/16 v17, 0x0

    .line 230
    .line 231
    const/16 v19, 0x0

    .line 232
    .line 233
    const-wide/16 v20, 0x0

    .line 234
    .line 235
    const/16 v22, 0x2

    .line 236
    .line 237
    const/16 v23, 0x0

    .line 238
    .line 239
    const/16 v24, 0x1

    .line 240
    .line 241
    const/16 v25, 0x0

    .line 242
    .line 243
    const/16 v26, 0x0

    .line 244
    .line 245
    const/16 v29, 0x0

    .line 246
    .line 247
    move-object/from16 v28, v1

    .line 248
    .line 249
    invoke-static/range {v7 .. v31}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 250
    .line 251
    .line 252
    move-object/from16 v0, v28

    .line 253
    .line 254
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 255
    .line 256
    .line 257
    goto :goto_3

    .line 258
    :cond_5
    move-object v0, v1

    .line 259
    invoke-virtual {v0}, La/fet;->X()V

    .line 260
    .line 261
    .line 262
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 263
    .line 264
    return-object v0

    .line 265
    :pswitch_1
    move-object/from16 v12, p1

    .line 266
    .line 267
    check-cast v12, La/fet;

    .line 268
    .line 269
    move-object/from16 v1, p2

    .line 270
    .line 271
    check-cast v1, Ljava/lang/Integer;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 274
    .line 275
    .line 276
    move-result v1

    .line 277
    and-int/lit8 v2, v1, 0x3

    .line 278
    .line 279
    if-eq v2, v5, :cond_6

    .line 280
    .line 281
    move v4, v6

    .line 282
    :cond_6
    and-int/2addr v1, v6

    .line 283
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 284
    .line 285
    .line 286
    move-result v1

    .line 287
    if-eqz v1, :cond_7

    .line 288
    .line 289
    sget-object v1, La/qmk;->a:La/zcl;

    .line 290
    .line 291
    const/high16 v17, 0x40000000    # 2.0f

    .line 292
    .line 293
    const/16 v18, 0x7

    .line 294
    .line 295
    sget-object v13, La/jm40;->b:La/jm40;

    .line 296
    .line 297
    const/4 v14, 0x0

    .line 298
    const/4 v15, 0x0

    .line 299
    const/16 v16, 0x0

    .line 300
    .line 301
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    iget-object v2, v7, La/jjl;->a:Ljava/lang/String;

    .line 306
    .line 307
    iget-object v3, v7, La/jjl;->b:Ljava/lang/String;

    .line 308
    .line 309
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 310
    .line 311
    invoke-virtual {v12, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v4

    .line 315
    check-cast v4, La/g1t0;

    .line 316
    .line 317
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    invoke-static {}, La/g1t0;->j()La/y9q0;

    .line 321
    .line 322
    .line 323
    move-result-object v6

    .line 324
    sget-wide v7, La/qmk;->r:J

    .line 325
    .line 326
    sget-wide v9, La/qmk;->q:J

    .line 327
    .line 328
    const/4 v13, 0x0

    .line 329
    const/16 v14, 0x80

    .line 330
    .line 331
    iget-wide v4, v0, La/aiq;->c:J

    .line 332
    .line 333
    const/4 v11, 0x0

    .line 334
    invoke-static/range {v1 .. v14}, La/paq0;->b(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;JJFLa/fet;II)V

    .line 335
    .line 336
    .line 337
    goto :goto_4

    .line 338
    :cond_7
    invoke-virtual {v12}, La/fet;->X()V

    .line 339
    .line 340
    .line 341
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 342
    .line 343
    return-object v0

    .line 344
    :pswitch_2
    move-object/from16 v1, p1

    .line 345
    .line 346
    check-cast v1, La/fet;

    .line 347
    .line 348
    move-object/from16 v3, p2

    .line 349
    .line 350
    check-cast v3, Ljava/lang/Integer;

    .line 351
    .line 352
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 353
    .line 354
    .line 355
    move-result v3

    .line 356
    and-int/lit8 v8, v3, 0x3

    .line 357
    .line 358
    if-eq v8, v5, :cond_8

    .line 359
    .line 360
    move v5, v6

    .line 361
    goto :goto_5

    .line 362
    :cond_8
    move v5, v4

    .line 363
    :goto_5
    and-int/2addr v3, v6

    .line 364
    invoke-virtual {v1, v3, v5}, La/fet;->U(IZ)Z

    .line 365
    .line 366
    .line 367
    move-result v3

    .line 368
    if-eqz v3, :cond_a

    .line 369
    .line 370
    sget-object v3, La/gqw0;->a:La/zx7;

    .line 371
    .line 372
    invoke-static {v3, v4}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    iget-wide v4, v1, La/fet;->T:J

    .line 377
    .line 378
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 379
    .line 380
    .line 381
    move-result v4

    .line 382
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 383
    .line 384
    .line 385
    move-result-object v5

    .line 386
    sget-object v8, La/jm40;->b:La/jm40;

    .line 387
    .line 388
    invoke-static {v1, v8}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 389
    .line 390
    .line 391
    move-result-object v9

    .line 392
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 393
    .line 394
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1}, La/fet;->i0()V

    .line 398
    .line 399
    .line 400
    iget-boolean v10, v1, La/fet;->S:Z

    .line 401
    .line 402
    if-eqz v10, :cond_9

    .line 403
    .line 404
    invoke-virtual {v1, v2}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 405
    .line 406
    .line 407
    goto :goto_6

    .line 408
    :cond_9
    invoke-virtual {v1}, La/fet;->r0()V

    .line 409
    .line 410
    .line 411
    :goto_6
    sget-object v2, La/gqw0;->x:La/shd;

    .line 412
    .line 413
    invoke-static {v1, v3, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 414
    .line 415
    .line 416
    sget-object v2, La/gqw0;->w:La/shd;

    .line 417
    .line 418
    invoke-static {v1, v5, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 422
    .line 423
    .line 424
    move-result-object v2

    .line 425
    sget-object v3, La/gqw0;->y:La/shd;

    .line 426
    .line 427
    invoke-static {v1, v2, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 431
    .line 432
    .line 433
    sget-object v2, La/gqw0;->v:La/shd;

    .line 434
    .line 435
    invoke-static {v1, v9, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    .line 437
    .line 438
    move-object v2, v8

    .line 439
    iget-object v8, v7, La/jjl;->a:Ljava/lang/String;

    .line 440
    .line 441
    iget-object v9, v7, La/jjl;->b:Ljava/lang/String;

    .line 442
    .line 443
    sget-object v3, La/j1t0;->e:La/zfn;

    .line 444
    .line 445
    invoke-virtual {v1, v3}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    check-cast v3, La/g1t0;

    .line 450
    .line 451
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-static {}, La/g1t0;->j()La/y9q0;

    .line 455
    .line 456
    .line 457
    move-result-object v12

    .line 458
    sget-wide v13, La/qmk;->r:J

    .line 459
    .line 460
    sget-wide v15, La/qmk;->q:J

    .line 461
    .line 462
    const/16 v19, 0x6

    .line 463
    .line 464
    const/16 v20, 0x80

    .line 465
    .line 466
    iget-wide v10, v0, La/aiq;->c:J

    .line 467
    .line 468
    const/16 v17, 0x0

    .line 469
    .line 470
    move-object/from16 v18, v1

    .line 471
    .line 472
    move-object v7, v2

    .line 473
    invoke-static/range {v7 .. v20}, La/paq0;->b(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;JJFLa/fet;II)V

    .line 474
    .line 475
    .line 476
    move-object/from16 v0, v18

    .line 477
    .line 478
    invoke-virtual {v0, v6}, La/fet;->r(Z)V

    .line 479
    .line 480
    .line 481
    goto :goto_7

    .line 482
    :cond_a
    move-object v0, v1

    .line 483
    invoke-virtual {v0}, La/fet;->X()V

    .line 484
    .line 485
    .line 486
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 487
    .line 488
    return-object v0

    .line 489
    :pswitch_3
    move-object/from16 v12, p1

    .line 490
    .line 491
    check-cast v12, La/fet;

    .line 492
    .line 493
    move-object/from16 v1, p2

    .line 494
    .line 495
    check-cast v1, Ljava/lang/Integer;

    .line 496
    .line 497
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    and-int/lit8 v2, v1, 0x3

    .line 502
    .line 503
    if-eq v2, v5, :cond_b

    .line 504
    .line 505
    move v4, v6

    .line 506
    :cond_b
    and-int/2addr v1, v6

    .line 507
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 508
    .line 509
    .line 510
    move-result v1

    .line 511
    if-eqz v1, :cond_c

    .line 512
    .line 513
    sget-object v1, La/qmk;->a:La/zcl;

    .line 514
    .line 515
    const/high16 v1, 0x41000000    # 8.0f

    .line 516
    .line 517
    const/4 v2, 0x0

    .line 518
    invoke-static {v3, v1, v2, v5}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 519
    .line 520
    .line 521
    move-result-object v1

    .line 522
    iget-object v2, v7, La/jjl;->a:Ljava/lang/String;

    .line 523
    .line 524
    iget-object v3, v7, La/jjl;->b:Ljava/lang/String;

    .line 525
    .line 526
    sget-object v4, La/j1t0;->e:La/zfn;

    .line 527
    .line 528
    invoke-virtual {v12, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    move-result-object v4

    .line 532
    check-cast v4, La/g1t0;

    .line 533
    .line 534
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    sget-wide v7, La/qmk;->r:J

    .line 542
    .line 543
    sget-wide v9, La/qmk;->q:J

    .line 544
    .line 545
    const/4 v13, 0x0

    .line 546
    const/16 v14, 0x80

    .line 547
    .line 548
    iget-wide v4, v0, La/aiq;->c:J

    .line 549
    .line 550
    const/4 v11, 0x0

    .line 551
    invoke-static/range {v1 .. v14}, La/paq0;->b(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;JJFLa/fet;II)V

    .line 552
    .line 553
    .line 554
    goto :goto_8

    .line 555
    :cond_c
    invoke-virtual {v12}, La/fet;->X()V

    .line 556
    .line 557
    .line 558
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 559
    .line 560
    return-object v0

    .line 561
    :pswitch_4
    move-object/from16 v12, p1

    .line 562
    .line 563
    check-cast v12, La/fet;

    .line 564
    .line 565
    move-object/from16 v1, p2

    .line 566
    .line 567
    check-cast v1, Ljava/lang/Integer;

    .line 568
    .line 569
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 570
    .line 571
    .line 572
    move-result v1

    .line 573
    and-int/lit8 v2, v1, 0x3

    .line 574
    .line 575
    if-eq v2, v5, :cond_d

    .line 576
    .line 577
    move v4, v6

    .line 578
    :cond_d
    and-int/2addr v1, v6

    .line 579
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    if-eqz v1, :cond_e

    .line 584
    .line 585
    iget-object v2, v7, La/jjl;->a:Ljava/lang/String;

    .line 586
    .line 587
    iget-object v3, v7, La/jjl;->b:Ljava/lang/String;

    .line 588
    .line 589
    sget-object v1, La/j1t0;->e:La/zfn;

    .line 590
    .line 591
    invoke-virtual {v12, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v1

    .line 595
    check-cast v1, La/g1t0;

    .line 596
    .line 597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 598
    .line 599
    .line 600
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 601
    .line 602
    .line 603
    move-result-object v6

    .line 604
    sget-wide v7, La/qmk;->r:J

    .line 605
    .line 606
    sget-wide v9, La/qmk;->q:J

    .line 607
    .line 608
    const/4 v13, 0x6

    .line 609
    const/16 v14, 0x80

    .line 610
    .line 611
    sget-object v1, La/jm40;->b:La/jm40;

    .line 612
    .line 613
    iget-wide v4, v0, La/aiq;->c:J

    .line 614
    .line 615
    const/4 v11, 0x0

    .line 616
    invoke-static/range {v1 .. v14}, La/paq0;->b(La/mm40;Ljava/lang/String;Ljava/lang/String;JLa/y9q0;JJFLa/fet;II)V

    .line 617
    .line 618
    .line 619
    goto :goto_9

    .line 620
    :cond_e
    invoke-virtual {v12}, La/fet;->X()V

    .line 621
    .line 622
    .line 623
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 624
    .line 625
    return-object v0

    .line 626
    nop

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
