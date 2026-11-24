.class public final synthetic La/tia;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/pz40;

.field public final synthetic d:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;La/pz40;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput-byte v0, p0, La/tia;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tia;->c:La/pz40;

    iput-object p3, p0, La/tia;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/tia;->d:La/pz40;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/pz40;La/pz40;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/tia;->a:B

    iput-object p1, p0, La/tia;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/tia;->c:La/pz40;

    iput-object p3, p0, La/tia;->d:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/tia;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/16 v4, 0xe

    .line 10
    .line 11
    const/high16 v5, 0x40800000    # 4.0f

    .line 12
    .line 13
    const/16 v6, 0x92

    .line 14
    .line 15
    const/4 v10, 0x4

    .line 16
    const/4 v11, 0x1

    .line 17
    const/4 v12, 0x0

    .line 18
    iget-object v13, v0, La/tia;->d:La/pz40;

    .line 19
    .line 20
    iget-object v14, v0, La/tia;->c:La/pz40;

    .line 21
    .line 22
    const/high16 v15, 0x3f800000    # 1.0f

    .line 23
    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/y5d;

    .line 30
    .line 31
    move-object/from16 v7, p2

    .line 32
    .line 33
    check-cast v7, La/mm40;

    .line 34
    .line 35
    move-object/from16 v8, p3

    .line 36
    .line 37
    check-cast v8, La/fet;

    .line 38
    .line 39
    move-object/from16 v9, p4

    .line 40
    .line 41
    check-cast v9, Ljava/lang/Integer;

    .line 42
    .line 43
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 44
    .line 45
    .line 46
    move-result v9

    .line 47
    and-int/lit8 v19, v9, 0x6

    .line 48
    .line 49
    if-nez v19, :cond_1

    .line 50
    .line 51
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v19

    .line 55
    if-eqz v19, :cond_0

    .line 56
    .line 57
    move/from16 v18, v10

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    const/16 v18, 0x2

    .line 61
    .line 62
    :goto_0
    or-int v10, v9, v18

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v10, v9

    .line 66
    :goto_1
    and-int/lit8 v9, v9, 0x30

    .line 67
    .line 68
    if-nez v9, :cond_3

    .line 69
    .line 70
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v9

    .line 74
    if-eqz v9, :cond_2

    .line 75
    .line 76
    const/16 v16, 0x20

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    const/16 v16, 0x10

    .line 80
    .line 81
    :goto_2
    or-int v10, v10, v16

    .line 82
    .line 83
    :cond_3
    and-int/lit16 v9, v10, 0x93

    .line 84
    .line 85
    if-eq v9, v6, :cond_4

    .line 86
    .line 87
    move v6, v11

    .line 88
    goto :goto_3

    .line 89
    :cond_4
    move v6, v12

    .line 90
    :goto_3
    and-int/lit8 v9, v10, 0x1

    .line 91
    .line 92
    invoke-virtual {v8, v9, v6}, La/fet;->U(IZ)Z

    .line 93
    .line 94
    .line 95
    move-result v6

    .line 96
    if-eqz v6, :cond_6

    .line 97
    .line 98
    sget-object v6, La/qmk;->a:La/zcl;

    .line 99
    .line 100
    new-instance v6, La/qw3;

    .line 101
    .line 102
    new-instance v9, La/jf4;

    .line 103
    .line 104
    invoke-direct {v9, v4}, La/jf4;-><init>(B)V

    .line 105
    .line 106
    .line 107
    invoke-direct {v6, v5, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 108
    .line 109
    .line 110
    invoke-static {v1, v7}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 111
    .line 112
    .line 113
    move-result-object v16

    .line 114
    const/high16 v20, 0x40800000    # 4.0f

    .line 115
    .line 116
    const/16 v21, 0x7

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    const/16 v18, 0x0

    .line 121
    .line 122
    const/16 v19, 0x0

    .line 123
    .line 124
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 129
    .line 130
    invoke-static {v6, v4, v8, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    iget-wide v5, v8, La/fet;->T:J

    .line 135
    .line 136
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 137
    .line 138
    .line 139
    move-result v5

    .line 140
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 141
    .line 142
    .line 143
    move-result-object v6

    .line 144
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 149
    .line 150
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v8}, La/fet;->i0()V

    .line 154
    .line 155
    .line 156
    iget-boolean v7, v8, La/fet;->S:Z

    .line 157
    .line 158
    if-eqz v7, :cond_5

    .line 159
    .line 160
    invoke-virtual {v8, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 161
    .line 162
    .line 163
    goto :goto_4

    .line 164
    :cond_5
    invoke-virtual {v8}, La/fet;->r0()V

    .line 165
    .line 166
    .line 167
    :goto_4
    sget-object v3, La/gqw0;->x:La/shd;

    .line 168
    .line 169
    invoke-static {v8, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 170
    .line 171
    .line 172
    sget-object v3, La/gqw0;->w:La/shd;

    .line 173
    .line 174
    invoke-static {v8, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 178
    .line 179
    .line 180
    move-result-object v3

    .line 181
    sget-object v4, La/gqw0;->y:La/shd;

    .line 182
    .line 183
    invoke-static {v8, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 184
    .line 185
    .line 186
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 187
    .line 188
    .line 189
    sget-object v3, La/gqw0;->v:La/shd;

    .line 190
    .line 191
    invoke-static {v8, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v2, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-static {v15, v1, v11}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 199
    .line 200
    .line 201
    move-result-object v1

    .line 202
    invoke-static {v1, v14, v8, v12}, La/m7x;->o(La/mm40;La/pz40;La/fet;I)V

    .line 203
    .line 204
    .line 205
    sget-object v1, La/gqw0;->n:La/xx7;

    .line 206
    .line 207
    new-instance v2, La/wkw;

    .line 208
    .line 209
    invoke-direct {v2, v1}, La/wkw;-><init>(La/xx7;)V

    .line 210
    .line 211
    .line 212
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    move-object/from16 v18, v1

    .line 217
    .line 218
    check-cast v18, La/mmo;

    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    iget-object v0, v0, La/tia;->b:Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    move-object/from16 v19, v0

    .line 227
    .line 228
    move-object/from16 v17, v2

    .line 229
    .line 230
    move-object/from16 v20, v8

    .line 231
    .line 232
    invoke-static/range {v17 .. v22}, La/feb;->t(La/mm40;La/mmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 233
    .line 234
    .line 235
    move-object/from16 v0, v20

    .line 236
    .line 237
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 238
    .line 239
    .line 240
    goto :goto_5

    .line 241
    :cond_6
    move-object v0, v8

    .line 242
    invoke-virtual {v0}, La/fet;->X()V

    .line 243
    .line 244
    .line 245
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object v0

    .line 248
    :pswitch_0
    move-object/from16 v1, p1

    .line 249
    .line 250
    check-cast v1, La/y5d;

    .line 251
    .line 252
    move-object/from16 v7, p2

    .line 253
    .line 254
    check-cast v7, La/mm40;

    .line 255
    .line 256
    move-object/from16 v8, p3

    .line 257
    .line 258
    check-cast v8, La/fet;

    .line 259
    .line 260
    move-object/from16 v9, p4

    .line 261
    .line 262
    check-cast v9, Ljava/lang/Integer;

    .line 263
    .line 264
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    and-int/lit8 v19, v9, 0x6

    .line 269
    .line 270
    if-nez v19, :cond_8

    .line 271
    .line 272
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 273
    .line 274
    .line 275
    move-result v19

    .line 276
    if-eqz v19, :cond_7

    .line 277
    .line 278
    move/from16 v18, v10

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_7
    const/16 v18, 0x2

    .line 282
    .line 283
    :goto_6
    or-int v10, v9, v18

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_8
    move v10, v9

    .line 287
    :goto_7
    and-int/lit8 v9, v9, 0x30

    .line 288
    .line 289
    if-nez v9, :cond_a

    .line 290
    .line 291
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v9

    .line 295
    if-eqz v9, :cond_9

    .line 296
    .line 297
    const/16 v16, 0x20

    .line 298
    .line 299
    goto :goto_8

    .line 300
    :cond_9
    const/16 v16, 0x10

    .line 301
    .line 302
    :goto_8
    or-int v10, v10, v16

    .line 303
    .line 304
    :cond_a
    and-int/lit16 v9, v10, 0x93

    .line 305
    .line 306
    if-eq v9, v6, :cond_b

    .line 307
    .line 308
    move v6, v11

    .line 309
    goto :goto_9

    .line 310
    :cond_b
    move v6, v12

    .line 311
    :goto_9
    and-int/lit8 v9, v10, 0x1

    .line 312
    .line 313
    invoke-virtual {v8, v9, v6}, La/fet;->U(IZ)Z

    .line 314
    .line 315
    .line 316
    move-result v6

    .line 317
    if-eqz v6, :cond_d

    .line 318
    .line 319
    sget-object v6, La/qmk;->a:La/zcl;

    .line 320
    .line 321
    new-instance v6, La/qw3;

    .line 322
    .line 323
    new-instance v9, La/jf4;

    .line 324
    .line 325
    invoke-direct {v9, v4}, La/jf4;-><init>(B)V

    .line 326
    .line 327
    .line 328
    invoke-direct {v6, v5, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 329
    .line 330
    .line 331
    invoke-static {v1, v7}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 332
    .line 333
    .line 334
    move-result-object v16

    .line 335
    const/high16 v20, 0x40800000    # 4.0f

    .line 336
    .line 337
    const/16 v21, 0x7

    .line 338
    .line 339
    const/16 v17, 0x0

    .line 340
    .line 341
    const/16 v18, 0x0

    .line 342
    .line 343
    const/16 v19, 0x0

    .line 344
    .line 345
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 346
    .line 347
    .line 348
    move-result-object v1

    .line 349
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 350
    .line 351
    invoke-static {v6, v4, v8, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    iget-wide v5, v8, La/fet;->T:J

    .line 356
    .line 357
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 358
    .line 359
    .line 360
    move-result v5

    .line 361
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 370
    .line 371
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 372
    .line 373
    .line 374
    invoke-virtual {v8}, La/fet;->i0()V

    .line 375
    .line 376
    .line 377
    iget-boolean v7, v8, La/fet;->S:Z

    .line 378
    .line 379
    if-eqz v7, :cond_c

    .line 380
    .line 381
    invoke-virtual {v8, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 382
    .line 383
    .line 384
    goto :goto_a

    .line 385
    :cond_c
    invoke-virtual {v8}, La/fet;->r0()V

    .line 386
    .line 387
    .line 388
    :goto_a
    sget-object v3, La/gqw0;->x:La/shd;

    .line 389
    .line 390
    invoke-static {v8, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    sget-object v3, La/gqw0;->w:La/shd;

    .line 394
    .line 395
    invoke-static {v8, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 396
    .line 397
    .line 398
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 399
    .line 400
    .line 401
    move-result-object v3

    .line 402
    sget-object v4, La/gqw0;->y:La/shd;

    .line 403
    .line 404
    invoke-static {v8, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 405
    .line 406
    .line 407
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 408
    .line 409
    .line 410
    sget-object v3, La/gqw0;->v:La/shd;

    .line 411
    .line 412
    invoke-static {v8, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 413
    .line 414
    .line 415
    invoke-static {v2, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 416
    .line 417
    .line 418
    move-result-object v1

    .line 419
    invoke-static {v15, v1, v11}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    check-cast v2, La/osw;

    .line 428
    .line 429
    invoke-static {v1, v2, v8, v12}, La/agc;->z(La/mm40;La/osw;La/fet;I)V

    .line 430
    .line 431
    .line 432
    sget-object v1, La/gqw0;->n:La/xx7;

    .line 433
    .line 434
    new-instance v2, La/wkw;

    .line 435
    .line 436
    invoke-direct {v2, v1}, La/wkw;-><init>(La/xx7;)V

    .line 437
    .line 438
    .line 439
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    move-object/from16 v20, v1

    .line 444
    .line 445
    check-cast v20, La/mmo;

    .line 446
    .line 447
    const/16 v23, 0x0

    .line 448
    .line 449
    const/16 v24, 0x0

    .line 450
    .line 451
    iget-object v0, v0, La/tia;->b:Lkotlin/jvm/functions/Function1;

    .line 452
    .line 453
    move-object/from16 v21, v0

    .line 454
    .line 455
    move-object/from16 v19, v2

    .line 456
    .line 457
    move-object/from16 v22, v8

    .line 458
    .line 459
    invoke-static/range {v19 .. v24}, La/feb;->t(La/mm40;La/mmo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 460
    .line 461
    .line 462
    move-object/from16 v0, v22

    .line 463
    .line 464
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 465
    .line 466
    .line 467
    goto :goto_b

    .line 468
    :cond_d
    move-object v0, v8

    .line 469
    invoke-virtual {v0}, La/fet;->X()V

    .line 470
    .line 471
    .line 472
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object v0

    .line 475
    :pswitch_1
    move-object/from16 v1, p1

    .line 476
    .line 477
    check-cast v1, La/y5d;

    .line 478
    .line 479
    move-object/from16 v7, p2

    .line 480
    .line 481
    check-cast v7, La/mm40;

    .line 482
    .line 483
    move-object/from16 v8, p3

    .line 484
    .line 485
    check-cast v8, La/fet;

    .line 486
    .line 487
    move-object/from16 v9, p4

    .line 488
    .line 489
    check-cast v9, Ljava/lang/Integer;

    .line 490
    .line 491
    invoke-static {v9, v1, v7}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 492
    .line 493
    .line 494
    move-result v9

    .line 495
    and-int/lit8 v19, v9, 0x6

    .line 496
    .line 497
    if-nez v19, :cond_f

    .line 498
    .line 499
    invoke-virtual {v8, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 500
    .line 501
    .line 502
    move-result v19

    .line 503
    if-eqz v19, :cond_e

    .line 504
    .line 505
    move/from16 v18, v10

    .line 506
    .line 507
    goto :goto_c

    .line 508
    :cond_e
    const/16 v18, 0x2

    .line 509
    .line 510
    :goto_c
    or-int v10, v9, v18

    .line 511
    .line 512
    goto :goto_d

    .line 513
    :cond_f
    move v10, v9

    .line 514
    :goto_d
    and-int/lit8 v9, v9, 0x30

    .line 515
    .line 516
    if-nez v9, :cond_11

    .line 517
    .line 518
    invoke-virtual {v8, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 519
    .line 520
    .line 521
    move-result v9

    .line 522
    if-eqz v9, :cond_10

    .line 523
    .line 524
    const/16 v16, 0x20

    .line 525
    .line 526
    goto :goto_e

    .line 527
    :cond_10
    const/16 v16, 0x10

    .line 528
    .line 529
    :goto_e
    or-int v10, v10, v16

    .line 530
    .line 531
    :cond_11
    and-int/lit16 v9, v10, 0x93

    .line 532
    .line 533
    if-eq v9, v6, :cond_12

    .line 534
    .line 535
    move v6, v11

    .line 536
    goto :goto_f

    .line 537
    :cond_12
    move v6, v12

    .line 538
    :goto_f
    and-int/lit8 v9, v10, 0x1

    .line 539
    .line 540
    invoke-virtual {v8, v9, v6}, La/fet;->U(IZ)Z

    .line 541
    .line 542
    .line 543
    move-result v6

    .line 544
    if-eqz v6, :cond_14

    .line 545
    .line 546
    sget-object v6, La/qmk;->a:La/zcl;

    .line 547
    .line 548
    new-instance v6, La/qw3;

    .line 549
    .line 550
    new-instance v9, La/jf4;

    .line 551
    .line 552
    invoke-direct {v9, v4}, La/jf4;-><init>(B)V

    .line 553
    .line 554
    .line 555
    invoke-direct {v6, v5, v11, v9}, La/qw3;-><init>(FZLa/rw3;)V

    .line 556
    .line 557
    .line 558
    invoke-static {v1, v7}, La/y5d;->c(La/y5d;La/mm40;)La/mm40;

    .line 559
    .line 560
    .line 561
    move-result-object v16

    .line 562
    const/high16 v20, 0x40800000    # 4.0f

    .line 563
    .line 564
    const/16 v21, 0x7

    .line 565
    .line 566
    const/16 v17, 0x0

    .line 567
    .line 568
    const/16 v18, 0x0

    .line 569
    .line 570
    const/16 v19, 0x0

    .line 571
    .line 572
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 573
    .line 574
    .line 575
    move-result-object v1

    .line 576
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 577
    .line 578
    invoke-static {v6, v4, v8, v12}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 579
    .line 580
    .line 581
    move-result-object v4

    .line 582
    iget-wide v5, v8, La/fet;->T:J

    .line 583
    .line 584
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 585
    .line 586
    .line 587
    move-result v5

    .line 588
    invoke-virtual {v8}, La/fet;->m()La/bh90;

    .line 589
    .line 590
    .line 591
    move-result-object v6

    .line 592
    invoke-static {v8, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 597
    .line 598
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    invoke-virtual {v8}, La/fet;->i0()V

    .line 602
    .line 603
    .line 604
    iget-boolean v7, v8, La/fet;->S:Z

    .line 605
    .line 606
    if-eqz v7, :cond_13

    .line 607
    .line 608
    invoke-virtual {v8, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 609
    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_13
    invoke-virtual {v8}, La/fet;->r0()V

    .line 613
    .line 614
    .line 615
    :goto_10
    sget-object v3, La/gqw0;->x:La/shd;

    .line 616
    .line 617
    invoke-static {v8, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 618
    .line 619
    .line 620
    sget-object v3, La/gqw0;->w:La/shd;

    .line 621
    .line 622
    invoke-static {v8, v6, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 623
    .line 624
    .line 625
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    sget-object v4, La/gqw0;->y:La/shd;

    .line 630
    .line 631
    invoke-static {v8, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 632
    .line 633
    .line 634
    invoke-static {v8}, La/jpm0;->n(La/fet;)V

    .line 635
    .line 636
    .line 637
    sget-object v3, La/gqw0;->v:La/shd;

    .line 638
    .line 639
    invoke-static {v8, v1, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 640
    .line 641
    .line 642
    invoke-static {v2, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 643
    .line 644
    .line 645
    move-result-object v1

    .line 646
    invoke-static {v15, v1, v11}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 647
    .line 648
    .line 649
    move-result-object v1

    .line 650
    invoke-interface {v14}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v2

    .line 654
    check-cast v2, La/nsw;

    .line 655
    .line 656
    invoke-static {v1, v2, v8, v12}, La/vfc;->x(La/mm40;La/nsw;La/fet;I)V

    .line 657
    .line 658
    .line 659
    sget-object v1, La/gqw0;->n:La/xx7;

    .line 660
    .line 661
    new-instance v2, La/wkw;

    .line 662
    .line 663
    invoke-direct {v2, v1}, La/wkw;-><init>(La/xx7;)V

    .line 664
    .line 665
    .line 666
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    move-object/from16 v20, v1

    .line 671
    .line 672
    check-cast v20, La/imo;

    .line 673
    .line 674
    const/16 v23, 0x0

    .line 675
    .line 676
    const/16 v24, 0x0

    .line 677
    .line 678
    iget-object v0, v0, La/tia;->b:Lkotlin/jvm/functions/Function1;

    .line 679
    .line 680
    move-object/from16 v21, v0

    .line 681
    .line 682
    move-object/from16 v19, v2

    .line 683
    .line 684
    move-object/from16 v22, v8

    .line 685
    .line 686
    invoke-static/range {v19 .. v24}, La/jcb;->s(La/mm40;La/imo;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 687
    .line 688
    .line 689
    move-object/from16 v0, v22

    .line 690
    .line 691
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 692
    .line 693
    .line 694
    goto :goto_11

    .line 695
    :cond_14
    move-object v0, v8

    .line 696
    invoke-virtual {v0}, La/fet;->X()V

    .line 697
    .line 698
    .line 699
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 700
    .line 701
    return-object v0

    .line 702
    nop

    .line 703
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
