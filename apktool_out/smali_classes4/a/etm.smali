.class public final synthetic La/etm;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:La/xx7;

.field public final synthetic d:La/a4x;


# direct methods
.method public synthetic constructor <init>(FLa/xx7;La/a4x;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/etm;->a:B

    iput p1, p0, La/etm;->b:F

    iput-object p2, p0, La/etm;->c:La/xx7;

    iput-object p3, p0, La/etm;->d:La/a4x;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/etm;->a:B

    .line 4
    .line 5
    const/16 v2, 0xe

    .line 6
    .line 7
    const/high16 v3, 0x40000000    # 2.0f

    .line 8
    .line 9
    const/16 v4, 0xc

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, v0, La/etm;->d:La/a4x;

    .line 13
    .line 14
    iget-object v7, v0, La/etm;->c:La/xx7;

    .line 15
    .line 16
    iget v0, v0, La/etm;->b:F

    .line 17
    .line 18
    const/4 v8, 0x2

    .line 19
    const/4 v9, 0x1

    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    move-object/from16 v1, p1

    .line 24
    .line 25
    check-cast v1, La/fet;

    .line 26
    .line 27
    move-object/from16 v10, p2

    .line 28
    .line 29
    check-cast v10, Ljava/lang/Integer;

    .line 30
    .line 31
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 32
    .line 33
    .line 34
    move-result v10

    .line 35
    and-int/lit8 v11, v10, 0x3

    .line 36
    .line 37
    if-eq v11, v8, :cond_0

    .line 38
    .line 39
    move v5, v9

    .line 40
    :cond_0
    and-int/lit8 v8, v10, 0x1

    .line 41
    .line 42
    invoke-virtual {v1, v8, v5}, La/fet;->U(IZ)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_1

    .line 47
    .line 48
    new-instance v11, La/qw3;

    .line 49
    .line 50
    new-instance v5, La/gne;

    .line 51
    .line 52
    invoke-direct {v5, v7, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    invoke-direct {v11, v0, v9, v5}, La/qw3;-><init>(FZLa/rw3;)V

    .line 56
    .line 57
    .line 58
    sget-object v0, La/qmk;->a:La/zcl;

    .line 59
    .line 60
    new-instance v12, La/qw3;

    .line 61
    .line 62
    new-instance v0, La/jf4;

    .line 63
    .line 64
    invoke-direct {v0, v2}, La/jf4;-><init>(B)V

    .line 65
    .line 66
    .line 67
    invoke-direct {v12, v3, v9, v0}, La/qw3;-><init>(FZLa/rw3;)V

    .line 68
    .line 69
    .line 70
    new-instance v0, La/yoh;

    .line 71
    .line 72
    const/4 v2, 0x4

    .line 73
    invoke-direct {v0, v6, v2}, La/yoh;-><init>(La/a4x;B)V

    .line 74
    .line 75
    .line 76
    const v2, -0x7c989402

    .line 77
    .line 78
    .line 79
    invoke-static {v2, v0, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 80
    .line 81
    .line 82
    move-result-object v16

    .line 83
    const/high16 v18, 0x180000

    .line 84
    .line 85
    const/16 v19, 0x39

    .line 86
    .line 87
    const/4 v10, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    const/4 v14, 0x0

    .line 90
    const/4 v15, 0x0

    .line 91
    move-object/from16 v17, v1

    .line 92
    .line 93
    invoke-static/range {v10 .. v19}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 94
    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    move-object/from16 v17, v1

    .line 98
    .line 99
    invoke-virtual/range {v17 .. v17}, La/fet;->X()V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_0
    move-object/from16 v1, p1

    .line 106
    .line 107
    check-cast v1, La/fet;

    .line 108
    .line 109
    move-object/from16 v10, p2

    .line 110
    .line 111
    check-cast v10, Ljava/lang/Integer;

    .line 112
    .line 113
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    and-int/lit8 v11, v10, 0x3

    .line 118
    .line 119
    if-eq v11, v8, :cond_2

    .line 120
    .line 121
    move v5, v9

    .line 122
    :cond_2
    and-int/lit8 v8, v10, 0x1

    .line 123
    .line 124
    invoke-virtual {v1, v8, v5}, La/fet;->U(IZ)Z

    .line 125
    .line 126
    .line 127
    move-result v5

    .line 128
    if-eqz v5, :cond_3

    .line 129
    .line 130
    new-instance v5, La/qw3;

    .line 131
    .line 132
    new-instance v8, La/gne;

    .line 133
    .line 134
    invoke-direct {v8, v7, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, v0, v9, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 138
    .line 139
    .line 140
    sget-object v0, La/qmk;->a:La/zcl;

    .line 141
    .line 142
    new-instance v0, La/qw3;

    .line 143
    .line 144
    new-instance v4, La/jf4;

    .line 145
    .line 146
    invoke-direct {v4, v2}, La/jf4;-><init>(B)V

    .line 147
    .line 148
    .line 149
    invoke-direct {v0, v3, v9, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 150
    .line 151
    .line 152
    new-instance v2, La/yoh;

    .line 153
    .line 154
    const/4 v3, 0x3

    .line 155
    invoke-direct {v2, v6, v3}, La/yoh;-><init>(La/a4x;B)V

    .line 156
    .line 157
    .line 158
    const v3, -0x7c990861

    .line 159
    .line 160
    .line 161
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    const/high16 v9, 0x180000

    .line 166
    .line 167
    const/16 v10, 0x39

    .line 168
    .line 169
    move-object v8, v1

    .line 170
    const/4 v1, 0x0

    .line 171
    const/4 v4, 0x0

    .line 172
    move-object v2, v5

    .line 173
    const/4 v5, 0x0

    .line 174
    const/4 v6, 0x0

    .line 175
    move-object v3, v0

    .line 176
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 177
    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_3
    move-object v8, v1

    .line 181
    invoke-virtual {v8}, La/fet;->X()V

    .line 182
    .line 183
    .line 184
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 185
    .line 186
    return-object v0

    .line 187
    :pswitch_1
    move-object/from16 v1, p1

    .line 188
    .line 189
    check-cast v1, La/fet;

    .line 190
    .line 191
    move-object/from16 v10, p2

    .line 192
    .line 193
    check-cast v10, Ljava/lang/Integer;

    .line 194
    .line 195
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 196
    .line 197
    .line 198
    move-result v10

    .line 199
    and-int/lit8 v11, v10, 0x3

    .line 200
    .line 201
    if-eq v11, v8, :cond_4

    .line 202
    .line 203
    move v5, v9

    .line 204
    :cond_4
    and-int/2addr v10, v9

    .line 205
    invoke-virtual {v1, v10, v5}, La/fet;->U(IZ)Z

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    if-eqz v5, :cond_5

    .line 210
    .line 211
    new-instance v5, La/qw3;

    .line 212
    .line 213
    new-instance v10, La/gne;

    .line 214
    .line 215
    invoke-direct {v10, v7, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 216
    .line 217
    .line 218
    invoke-direct {v5, v0, v9, v10}, La/qw3;-><init>(FZLa/rw3;)V

    .line 219
    .line 220
    .line 221
    sget-object v0, La/qmk;->a:La/zcl;

    .line 222
    .line 223
    new-instance v0, La/qw3;

    .line 224
    .line 225
    new-instance v4, La/jf4;

    .line 226
    .line 227
    invoke-direct {v4, v2}, La/jf4;-><init>(B)V

    .line 228
    .line 229
    .line 230
    invoke-direct {v0, v3, v9, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 231
    .line 232
    .line 233
    new-instance v2, La/yoh;

    .line 234
    .line 235
    invoke-direct {v2, v6, v8}, La/yoh;-><init>(La/a4x;B)V

    .line 236
    .line 237
    .line 238
    const v3, -0x7c997cc0

    .line 239
    .line 240
    .line 241
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 242
    .line 243
    .line 244
    move-result-object v7

    .line 245
    const/high16 v9, 0x180000

    .line 246
    .line 247
    const/16 v10, 0x39

    .line 248
    .line 249
    move-object v8, v1

    .line 250
    const/4 v1, 0x0

    .line 251
    const/4 v4, 0x0

    .line 252
    move-object v2, v5

    .line 253
    const/4 v5, 0x0

    .line 254
    const/4 v6, 0x0

    .line 255
    move-object v3, v0

    .line 256
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 257
    .line 258
    .line 259
    goto :goto_2

    .line 260
    :cond_5
    move-object v8, v1

    .line 261
    invoke-virtual {v8}, La/fet;->X()V

    .line 262
    .line 263
    .line 264
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object v0

    .line 267
    :pswitch_2
    move-object/from16 v1, p1

    .line 268
    .line 269
    check-cast v1, La/fet;

    .line 270
    .line 271
    move-object/from16 v2, p2

    .line 272
    .line 273
    check-cast v2, Ljava/lang/Integer;

    .line 274
    .line 275
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    and-int/lit8 v3, v2, 0x3

    .line 280
    .line 281
    if-eq v3, v8, :cond_6

    .line 282
    .line 283
    move v3, v9

    .line 284
    goto :goto_3

    .line 285
    :cond_6
    move v3, v5

    .line 286
    :goto_3
    and-int/2addr v2, v9

    .line 287
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 288
    .line 289
    .line 290
    move-result v2

    .line 291
    if-eqz v2, :cond_b

    .line 292
    .line 293
    const/high16 v2, 0x3f800000    # 1.0f

    .line 294
    .line 295
    float-to-double v10, v2

    .line 296
    const-wide/16 v12, 0x0

    .line 297
    .line 298
    cmpl-double v3, v10, v12

    .line 299
    .line 300
    if-lez v3, :cond_7

    .line 301
    .line 302
    goto :goto_4

    .line 303
    :cond_7
    const-string v3, "invalid weight; must be greater than zero"

    .line 304
    .line 305
    invoke-static {v3}, La/vcx;->a(Ljava/lang/String;)V

    .line 306
    .line 307
    .line 308
    :goto_4
    new-instance v3, La/x7z;

    .line 309
    .line 310
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 311
    .line 312
    .line 313
    cmpl-float v10, v2, v8

    .line 314
    .line 315
    if-lez v10, :cond_8

    .line 316
    .line 317
    move v2, v8

    .line 318
    :cond_8
    invoke-direct {v3, v2, v9}, La/x7z;-><init>(FZ)V

    .line 319
    .line 320
    .line 321
    new-instance v2, La/qw3;

    .line 322
    .line 323
    new-instance v8, La/gne;

    .line 324
    .line 325
    invoke-direct {v8, v7, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 326
    .line 327
    .line 328
    invoke-direct {v2, v0, v9, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 329
    .line 330
    .line 331
    sget-object v0, La/gqw0;->j:La/yx7;

    .line 332
    .line 333
    invoke-static {v2, v0, v1, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    iget-wide v7, v1, La/fet;->T:J

    .line 338
    .line 339
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 344
    .line 345
    .line 346
    move-result-object v4

    .line 347
    invoke-static {v1, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 348
    .line 349
    .line 350
    move-result-object v3

    .line 351
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 352
    .line 353
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    invoke-virtual {v1}, La/fet;->i0()V

    .line 357
    .line 358
    .line 359
    iget-boolean v7, v1, La/fet;->S:Z

    .line 360
    .line 361
    if-eqz v7, :cond_9

    .line 362
    .line 363
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 364
    .line 365
    invoke-virtual {v1, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 366
    .line 367
    .line 368
    goto :goto_5

    .line 369
    :cond_9
    invoke-virtual {v1}, La/fet;->r0()V

    .line 370
    .line 371
    .line 372
    :goto_5
    sget-object v7, La/gqw0;->x:La/shd;

    .line 373
    .line 374
    invoke-static {v1, v0, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    sget-object v0, La/gqw0;->w:La/shd;

    .line 378
    .line 379
    invoke-static {v1, v4, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 380
    .line 381
    .line 382
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    sget-object v2, La/gqw0;->y:La/shd;

    .line 387
    .line 388
    invoke-static {v1, v0, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 392
    .line 393
    .line 394
    sget-object v0, La/gqw0;->v:La/shd;

    .line 395
    .line 396
    const v2, -0x68860666

    .line 397
    .line 398
    .line 399
    invoke-static {v1, v3, v0, v2, v6}, La/h97;->o(La/fet;La/mm40;La/shd;ILa/a4x;)Ljava/util/Iterator;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 404
    .line 405
    .line 406
    move-result v2

    .line 407
    if-eqz v2, :cond_a

    .line 408
    .line 409
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v2

    .line 413
    check-cast v2, Ljava/lang/Number;

    .line 414
    .line 415
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    invoke-static {v2, v5, v1}, La/a8k0;->F(IILa/fet;)La/pm80;

    .line 420
    .line 421
    .line 422
    move-result-object v10

    .line 423
    sget-object v2, La/qmk;->a:La/zcl;

    .line 424
    .line 425
    const/high16 v2, 0x41c00000    # 24.0f

    .line 426
    .line 427
    const/high16 v3, 0x42000000    # 32.0f

    .line 428
    .line 429
    sget-object v4, La/jm40;->b:La/jm40;

    .line 430
    .line 431
    invoke-static {v4, v2, v3}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 432
    .line 433
    .line 434
    move-result-object v12

    .line 435
    const/16 v18, 0x38

    .line 436
    .line 437
    const/16 v19, 0x78

    .line 438
    .line 439
    const/4 v11, 0x0

    .line 440
    const/4 v13, 0x0

    .line 441
    const/4 v14, 0x0

    .line 442
    const/4 v15, 0x0

    .line 443
    const/16 v16, 0x0

    .line 444
    .line 445
    move-object/from16 v17, v1

    .line 446
    .line 447
    invoke-static/range {v10 .. v19}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 448
    .line 449
    .line 450
    goto :goto_6

    .line 451
    :cond_a
    invoke-virtual {v1, v5}, La/fet;->r(Z)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v9}, La/fet;->r(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_7

    .line 458
    :cond_b
    invoke-virtual {v1}, La/fet;->X()V

    .line 459
    .line 460
    .line 461
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_3
    move-object/from16 v1, p1

    .line 465
    .line 466
    check-cast v1, La/fet;

    .line 467
    .line 468
    move-object/from16 v10, p2

    .line 469
    .line 470
    check-cast v10, Ljava/lang/Integer;

    .line 471
    .line 472
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 473
    .line 474
    .line 475
    move-result v10

    .line 476
    and-int/lit8 v11, v10, 0x3

    .line 477
    .line 478
    if-eq v11, v8, :cond_c

    .line 479
    .line 480
    move v5, v9

    .line 481
    :cond_c
    and-int/lit8 v8, v10, 0x1

    .line 482
    .line 483
    invoke-virtual {v1, v8, v5}, La/fet;->U(IZ)Z

    .line 484
    .line 485
    .line 486
    move-result v5

    .line 487
    if-eqz v5, :cond_d

    .line 488
    .line 489
    new-instance v5, La/qw3;

    .line 490
    .line 491
    new-instance v8, La/gne;

    .line 492
    .line 493
    invoke-direct {v8, v7, v4}, La/gne;-><init>(Ljava/lang/Object;B)V

    .line 494
    .line 495
    .line 496
    invoke-direct {v5, v0, v9, v8}, La/qw3;-><init>(FZLa/rw3;)V

    .line 497
    .line 498
    .line 499
    sget-object v0, La/qmk;->a:La/zcl;

    .line 500
    .line 501
    new-instance v0, La/qw3;

    .line 502
    .line 503
    new-instance v4, La/jf4;

    .line 504
    .line 505
    invoke-direct {v4, v2}, La/jf4;-><init>(B)V

    .line 506
    .line 507
    .line 508
    invoke-direct {v0, v3, v9, v4}, La/qw3;-><init>(FZLa/rw3;)V

    .line 509
    .line 510
    .line 511
    new-instance v2, La/yoh;

    .line 512
    .line 513
    invoke-direct {v2, v6, v9}, La/yoh;-><init>(La/a4x;B)V

    .line 514
    .line 515
    .line 516
    const v3, -0x4efe99cf

    .line 517
    .line 518
    .line 519
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 520
    .line 521
    .line 522
    move-result-object v7

    .line 523
    const/high16 v9, 0x1b0000

    .line 524
    .line 525
    const/16 v10, 0x19

    .line 526
    .line 527
    move-object v8, v1

    .line 528
    const/4 v1, 0x0

    .line 529
    const/4 v4, 0x0

    .line 530
    move-object v2, v5

    .line 531
    const/4 v5, 0x0

    .line 532
    const/4 v6, 0x2

    .line 533
    move-object v3, v0

    .line 534
    invoke-static/range {v1 .. v10}, La/jwb;->p(La/mm40;La/ow3;La/sw3;La/yx7;IILa/ugd;La/fet;II)V

    .line 535
    .line 536
    .line 537
    goto :goto_8

    .line 538
    :cond_d
    move-object v8, v1

    .line 539
    invoke-virtual {v8}, La/fet;->X()V

    .line 540
    .line 541
    .line 542
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 543
    .line 544
    return-object v0

    .line 545
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
