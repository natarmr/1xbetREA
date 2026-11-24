.class public final synthetic La/csw;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gdg0;La/edg0;)V
    .locals 0

    .line 1
    const/16 p1, 0xf

    iput-byte p1, p0, La/csw;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/csw;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/csw;->a:B

    iput-object p1, p0, La/csw;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/csw;->a:B

    .line 4
    .line 5
    sget-object v2, La/ukd;->a:La/cl5;

    .line 6
    .line 7
    const/high16 v3, 0x3f800000    # 1.0f

    .line 8
    .line 9
    const/16 v4, 0x80

    .line 10
    .line 11
    const/16 v5, 0x92

    .line 12
    .line 13
    sget-object v6, La/e7z;->u1:La/pcy;

    .line 14
    .line 15
    const/4 v7, 0x3

    .line 16
    sget-object v9, La/jm40;->b:La/jm40;

    .line 17
    .line 18
    const/4 v10, 0x4

    .line 19
    const/4 v11, 0x2

    .line 20
    const/4 v12, 0x6

    .line 21
    const/4 v13, 0x0

    .line 22
    const/16 v14, 0x90

    .line 23
    .line 24
    const/16 v16, 0x20

    .line 25
    .line 26
    const/4 v15, 0x1

    .line 27
    const/16 v18, 0xe

    .line 28
    .line 29
    const/4 v8, 0x0

    .line 30
    iget-object v0, v0, La/csw;->b:Ljava/lang/Object;

    .line 31
    .line 32
    packed-switch v1, :pswitch_data_0

    .line 33
    .line 34
    .line 35
    check-cast v0, Ljava/util/List;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Ljava/lang/Integer;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    move-object/from16 v2, p2

    .line 46
    .line 47
    check-cast v2, La/mm40;

    .line 48
    .line 49
    move-object/from16 v3, p3

    .line 50
    .line 51
    check-cast v3, La/fet;

    .line 52
    .line 53
    move-object/from16 v4, p4

    .line 54
    .line 55
    check-cast v4, Ljava/lang/Integer;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    and-int/lit8 v12, v4, 0x6

    .line 65
    .line 66
    if-nez v12, :cond_1

    .line 67
    .line 68
    invoke-virtual {v3, v1}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v12

    .line 72
    if-eqz v12, :cond_0

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    move v10, v11

    .line 76
    :goto_0
    or-int/2addr v10, v4

    .line 77
    goto :goto_1

    .line 78
    :cond_1
    move v10, v4

    .line 79
    :goto_1
    and-int/lit8 v4, v4, 0x30

    .line 80
    .line 81
    if-nez v4, :cond_3

    .line 82
    .line 83
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_2

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_2
    const/16 v16, 0x10

    .line 91
    .line 92
    :goto_2
    or-int v10, v10, v16

    .line 93
    .line 94
    :cond_3
    and-int/lit16 v4, v10, 0x93

    .line 95
    .line 96
    if-eq v4, v5, :cond_4

    .line 97
    .line 98
    move v4, v15

    .line 99
    goto :goto_3

    .line 100
    :cond_4
    move v4, v8

    .line 101
    :goto_3
    and-int/lit8 v5, v10, 0x1

    .line 102
    .line 103
    invoke-virtual {v3, v5, v4}, La/fet;->U(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result v4

    .line 107
    if-eqz v4, :cond_6

    .line 108
    .line 109
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    check-cast v0, La/d6v0;

    .line 114
    .line 115
    invoke-static {v9, v13, v8, v7}, La/o7k0;->w(La/mm40;La/yx7;ZI)La/mm40;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 120
    .line 121
    invoke-static {v4, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    iget-wide v8, v3, La/fet;->T:J

    .line 126
    .line 127
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    invoke-static {v3, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 140
    .line 141
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v3}, La/fet;->i0()V

    .line 145
    .line 146
    .line 147
    iget-boolean v9, v3, La/fet;->S:Z

    .line 148
    .line 149
    if-eqz v9, :cond_5

    .line 150
    .line 151
    invoke-virtual {v3, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 152
    .line 153
    .line 154
    goto :goto_4

    .line 155
    :cond_5
    invoke-virtual {v3}, La/fet;->r0()V

    .line 156
    .line 157
    .line 158
    :goto_4
    sget-object v6, La/gqw0;->x:La/shd;

    .line 159
    .line 160
    invoke-static {v3, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 161
    .line 162
    .line 163
    sget-object v4, La/gqw0;->w:La/shd;

    .line 164
    .line 165
    invoke-static {v3, v8, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    sget-object v5, La/gqw0;->y:La/shd;

    .line 173
    .line 174
    invoke-static {v3, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v3}, La/jpm0;->n(La/fet;)V

    .line 178
    .line 179
    .line 180
    sget-object v4, La/gqw0;->v:La/shd;

    .line 181
    .line 182
    invoke-static {v3, v1, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    shr-int/lit8 v1, v10, 0x3

    .line 186
    .line 187
    and-int/lit8 v1, v1, 0xe

    .line 188
    .line 189
    invoke-static {v2, v0, v3, v1}, La/qsm0;->p(La/mm40;La/d6v0;La/fet;I)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 193
    .line 194
    .line 195
    goto :goto_5

    .line 196
    :cond_6
    invoke-virtual {v3}, La/fet;->X()V

    .line 197
    .line 198
    .line 199
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_0
    check-cast v0, La/jts0;

    .line 203
    .line 204
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, La/g9z;

    .line 207
    .line 208
    move-object/from16 v2, p2

    .line 209
    .line 210
    check-cast v2, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    move-object/from16 v2, p3

    .line 216
    .line 217
    check-cast v2, La/fet;

    .line 218
    .line 219
    move-object/from16 v5, p4

    .line 220
    .line 221
    check-cast v5, Ljava/lang/Integer;

    .line 222
    .line 223
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 224
    .line 225
    .line 226
    move-result v5

    .line 227
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    and-int/lit16 v1, v5, 0x81

    .line 231
    .line 232
    if-eq v1, v4, :cond_7

    .line 233
    .line 234
    move v1, v15

    .line 235
    goto :goto_6

    .line 236
    :cond_7
    move v1, v8

    .line 237
    :goto_6
    and-int/lit8 v4, v5, 0x1

    .line 238
    .line 239
    invoke-virtual {v2, v4, v1}, La/fet;->U(IZ)Z

    .line 240
    .line 241
    .line 242
    move-result v1

    .line 243
    if-eqz v1, :cond_a

    .line 244
    .line 245
    sget-object v1, La/uc9;->c:La/mw3;

    .line 246
    .line 247
    sget-object v4, La/gqw0;->m:La/xx7;

    .line 248
    .line 249
    invoke-static {v1, v4, v2, v8}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    iget-wide v4, v2, La/fet;->T:J

    .line 254
    .line 255
    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    .line 256
    .line 257
    .line 258
    move-result v4

    .line 259
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    invoke-static {v2, v9}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 264
    .line 265
    .line 266
    move-result-object v7

    .line 267
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 268
    .line 269
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v2}, La/fet;->i0()V

    .line 273
    .line 274
    .line 275
    iget-boolean v10, v2, La/fet;->S:Z

    .line 276
    .line 277
    if-eqz v10, :cond_8

    .line 278
    .line 279
    invoke-virtual {v2, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 280
    .line 281
    .line 282
    goto :goto_7

    .line 283
    :cond_8
    invoke-virtual {v2}, La/fet;->r0()V

    .line 284
    .line 285
    .line 286
    :goto_7
    sget-object v10, La/gqw0;->x:La/shd;

    .line 287
    .line 288
    invoke-static {v2, v1, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 289
    .line 290
    .line 291
    sget-object v1, La/gqw0;->w:La/shd;

    .line 292
    .line 293
    invoke-static {v2, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 294
    .line 295
    .line 296
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    sget-object v5, La/gqw0;->y:La/shd;

    .line 301
    .line 302
    invoke-static {v2, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 303
    .line 304
    .line 305
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 306
    .line 307
    .line 308
    sget-object v4, La/gqw0;->v:La/shd;

    .line 309
    .line 310
    invoke-static {v2, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 311
    .line 312
    .line 313
    sget-object v7, La/qmk;->a:La/zcl;

    .line 314
    .line 315
    const/high16 v7, 0x42300000    # 44.0f

    .line 316
    .line 317
    invoke-static {v9, v7}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 318
    .line 319
    .line 320
    move-result-object v7

    .line 321
    sget-object v11, La/zaq0;->b:La/zfn;

    .line 322
    .line 323
    invoke-virtual {v2, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v12

    .line 327
    check-cast v12, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 328
    .line 329
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 330
    .line 331
    .line 332
    move-result-wide v12

    .line 333
    sget-object v14, La/jd8;->n:La/ljc;

    .line 334
    .line 335
    invoke-static {v7, v12, v13, v14}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 336
    .line 337
    .line 338
    move-result-object v7

    .line 339
    invoke-static {v7, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 340
    .line 341
    .line 342
    move-result-object v3

    .line 343
    sget-object v7, La/uc9;->h:La/nw3;

    .line 344
    .line 345
    sget-object v12, La/gqw0;->k:La/yx7;

    .line 346
    .line 347
    const/16 v13, 0x36

    .line 348
    .line 349
    invoke-static {v7, v12, v2, v13}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 350
    .line 351
    .line 352
    move-result-object v7

    .line 353
    iget-wide v12, v2, La/fet;->T:J

    .line 354
    .line 355
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 356
    .line 357
    .line 358
    move-result v12

    .line 359
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 360
    .line 361
    .line 362
    move-result-object v13

    .line 363
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    invoke-virtual {v2}, La/fet;->i0()V

    .line 368
    .line 369
    .line 370
    iget-boolean v14, v2, La/fet;->S:Z

    .line 371
    .line 372
    if-eqz v14, :cond_9

    .line 373
    .line 374
    invoke-virtual {v2, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 375
    .line 376
    .line 377
    goto :goto_8

    .line 378
    :cond_9
    invoke-virtual {v2}, La/fet;->r0()V

    .line 379
    .line 380
    .line 381
    :goto_8
    invoke-static {v2, v7, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v2, v13, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 385
    .line 386
    .line 387
    invoke-static {v12, v2, v5, v2}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 388
    .line 389
    .line 390
    invoke-static {v2, v3, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 391
    .line 392
    .line 393
    const/high16 v1, 0x42a00000    # 80.0f

    .line 394
    .line 395
    invoke-static {v9, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 396
    .line 397
    .line 398
    move-result-object v1

    .line 399
    iget-object v3, v0, La/jts0;->a:Ljava/lang/String;

    .line 400
    .line 401
    invoke-static {v8, v2, v1, v3}, La/vbw0;->x(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 402
    .line 403
    .line 404
    const/high16 v1, 0x42d80000    # 108.0f

    .line 405
    .line 406
    invoke-static {v9, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 407
    .line 408
    .line 409
    move-result-object v1

    .line 410
    iget-object v3, v0, La/jts0;->b:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v8, v2, v1, v3}, La/vbw0;->x(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 413
    .line 414
    .line 415
    const/high16 v1, 0x43000000    # 128.0f

    .line 416
    .line 417
    invoke-static {v9, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    iget-object v0, v0, La/jts0;->c:Ljava/lang/String;

    .line 422
    .line 423
    invoke-static {v8, v2, v1, v0}, La/vbw0;->x(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 424
    .line 425
    .line 426
    invoke-virtual {v2, v15}, La/fet;->r(Z)V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v2, v11}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 434
    .line 435
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSeparator-0d7_KjU()J

    .line 436
    .line 437
    .line 438
    move-result-wide v18

    .line 439
    const/16 v21, 0x0

    .line 440
    .line 441
    const/16 v22, 0x3

    .line 442
    .line 443
    const/16 v16, 0x0

    .line 444
    .line 445
    const/16 v17, 0x0

    .line 446
    .line 447
    move-object/from16 v20, v2

    .line 448
    .line 449
    invoke-static/range {v16 .. v22}, La/jcb;->v(La/mm40;FJLa/fet;II)V

    .line 450
    .line 451
    .line 452
    move-object/from16 v0, v20

    .line 453
    .line 454
    invoke-virtual {v0, v15}, La/fet;->r(Z)V

    .line 455
    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_a
    move-object v0, v2

    .line 459
    invoke-virtual {v0}, La/fet;->X()V

    .line 460
    .line 461
    .line 462
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_1
    check-cast v0, La/v3q0;

    .line 466
    .line 467
    move-object/from16 v1, p1

    .line 468
    .line 469
    check-cast v1, La/rk80;

    .line 470
    .line 471
    move-object/from16 v2, p2

    .line 472
    .line 473
    check-cast v2, Ljava/lang/Integer;

    .line 474
    .line 475
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 476
    .line 477
    .line 478
    move-result v2

    .line 479
    move-object/from16 v3, p3

    .line 480
    .line 481
    check-cast v3, La/fet;

    .line 482
    .line 483
    move-object/from16 v4, p4

    .line 484
    .line 485
    check-cast v4, Ljava/lang/Integer;

    .line 486
    .line 487
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 488
    .line 489
    .line 490
    move-result v4

    .line 491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    and-int/lit8 v1, v4, 0x30

    .line 495
    .line 496
    if-nez v1, :cond_c

    .line 497
    .line 498
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 499
    .line 500
    .line 501
    move-result v1

    .line 502
    if-eqz v1, :cond_b

    .line 503
    .line 504
    goto :goto_a

    .line 505
    :cond_b
    const/16 v16, 0x10

    .line 506
    .line 507
    :goto_a
    or-int v4, v4, v16

    .line 508
    .line 509
    :cond_c
    and-int/lit16 v1, v4, 0x91

    .line 510
    .line 511
    if-eq v1, v14, :cond_d

    .line 512
    .line 513
    move v1, v15

    .line 514
    goto :goto_b

    .line 515
    :cond_d
    move v1, v8

    .line 516
    :goto_b
    and-int/2addr v4, v15

    .line 517
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 518
    .line 519
    .line 520
    move-result v1

    .line 521
    if-eqz v1, :cond_10

    .line 522
    .line 523
    if-eqz v2, :cond_f

    .line 524
    .line 525
    if-eq v2, v15, :cond_e

    .line 526
    .line 527
    const v0, -0x4f6bc587

    .line 528
    .line 529
    .line 530
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 534
    .line 535
    .line 536
    goto :goto_c

    .line 537
    :cond_e
    const v1, -0x4f6d2f99

    .line 538
    .line 539
    .line 540
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 541
    .line 542
    .line 543
    iget-object v0, v0, La/v3q0;->f:Ljava/util/ArrayList;

    .line 544
    .line 545
    invoke-static {v0, v3, v8}, La/tke;->A(Ljava/util/List;La/fet;I)V

    .line 546
    .line 547
    .line 548
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 549
    .line 550
    .line 551
    goto :goto_c

    .line 552
    :cond_f
    const v1, -0x4f6ec679

    .line 553
    .line 554
    .line 555
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 556
    .line 557
    .line 558
    iget-object v0, v0, La/v3q0;->e:Ljava/util/List;

    .line 559
    .line 560
    invoke-static {v0, v3, v8}, La/tke;->A(Ljava/util/List;La/fet;I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 564
    .line 565
    .line 566
    goto :goto_c

    .line 567
    :cond_10
    invoke-virtual {v3}, La/fet;->X()V

    .line 568
    .line 569
    .line 570
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_2
    check-cast v0, Landroid/widget/ImageView;

    .line 574
    .line 575
    move-object/from16 v1, p1

    .line 576
    .line 577
    check-cast v1, Ljava/lang/Integer;

    .line 578
    .line 579
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 580
    .line 581
    .line 582
    move-result v1

    .line 583
    move-object/from16 v2, p2

    .line 584
    .line 585
    check-cast v2, Ljava/lang/Integer;

    .line 586
    .line 587
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 588
    .line 589
    .line 590
    move-result v2

    .line 591
    move-object/from16 v3, p3

    .line 592
    .line 593
    check-cast v3, Ljava/lang/Integer;

    .line 594
    .line 595
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 596
    .line 597
    .line 598
    move-result v3

    .line 599
    move-object/from16 v4, p4

    .line 600
    .line 601
    check-cast v4, Ljava/lang/Integer;

    .line 602
    .line 603
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 604
    .line 605
    .line 606
    move-result v4

    .line 607
    sget v5, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->x:I

    .line 608
    .line 609
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 610
    .line 611
    .line 612
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_3
    check-cast v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;

    .line 616
    .line 617
    move-object/from16 v1, p1

    .line 618
    .line 619
    check-cast v1, Ljava/lang/Integer;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result v1

    .line 625
    move-object/from16 v2, p2

    .line 626
    .line 627
    check-cast v2, Ljava/lang/Integer;

    .line 628
    .line 629
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    move-object/from16 v3, p3

    .line 634
    .line 635
    check-cast v3, Ljava/lang/Integer;

    .line 636
    .line 637
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 638
    .line 639
    .line 640
    move-result v3

    .line 641
    move-object/from16 v4, p4

    .line 642
    .line 643
    check-cast v4, Ljava/lang/Integer;

    .line 644
    .line 645
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 646
    .line 647
    .line 648
    move-result v4

    .line 649
    iget-object v0, v0, Lorg/xplatform/cyber/game/core/presentation/team_statistic/view/TeamStatisticView;->k:La/z6p0;

    .line 650
    .line 651
    if-eqz v0, :cond_11

    .line 652
    .line 653
    invoke-virtual {v0, v1, v2, v3, v4}, La/z6p0;->b(IIII)V

    .line 654
    .line 655
    .line 656
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 657
    .line 658
    return-object v0

    .line 659
    :pswitch_4
    check-cast v0, La/gaj;

    .line 660
    .line 661
    iget-object v0, v0, La/gaj;->f:La/l1v0;

    .line 662
    .line 663
    move-object/from16 v1, p1

    .line 664
    .line 665
    check-cast v1, La/y5d;

    .line 666
    .line 667
    move-object/from16 v3, p2

    .line 668
    .line 669
    check-cast v3, La/mm40;

    .line 670
    .line 671
    move-object/from16 v4, p3

    .line 672
    .line 673
    check-cast v4, La/fet;

    .line 674
    .line 675
    move-object/from16 v5, p4

    .line 676
    .line 677
    check-cast v5, Ljava/lang/Integer;

    .line 678
    .line 679
    invoke-static {v5, v1, v3}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 680
    .line 681
    .line 682
    move-result v1

    .line 683
    and-int/lit8 v5, v1, 0x30

    .line 684
    .line 685
    if-nez v5, :cond_13

    .line 686
    .line 687
    invoke-virtual {v4, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    if-eqz v5, :cond_12

    .line 692
    .line 693
    goto :goto_d

    .line 694
    :cond_12
    const/16 v16, 0x10

    .line 695
    .line 696
    :goto_d
    or-int v1, v1, v16

    .line 697
    .line 698
    :cond_13
    and-int/lit16 v5, v1, 0x91

    .line 699
    .line 700
    if-eq v5, v14, :cond_14

    .line 701
    .line 702
    move v5, v15

    .line 703
    goto :goto_e

    .line 704
    :cond_14
    move v5, v8

    .line 705
    :goto_e
    and-int/2addr v1, v15

    .line 706
    invoke-virtual {v4, v1, v5}, La/fet;->U(IZ)Z

    .line 707
    .line 708
    .line 709
    move-result v1

    .line 710
    if-eqz v1, :cond_17

    .line 711
    .line 712
    if-nez v0, :cond_15

    .line 713
    .line 714
    const v0, -0x54cd5fc1

    .line 715
    .line 716
    .line 717
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v4, v8}, La/fet;->r(Z)V

    .line 721
    .line 722
    .line 723
    goto :goto_f

    .line 724
    :cond_15
    const v1, -0x54cd5fc0

    .line 725
    .line 726
    .line 727
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 728
    .line 729
    .line 730
    sget-object v1, La/qmk;->a:La/zcl;

    .line 731
    .line 732
    const/16 v22, 0x0

    .line 733
    .line 734
    const/16 v23, 0xd

    .line 735
    .line 736
    const/16 v19, 0x0

    .line 737
    .line 738
    const/high16 v20, 0x40800000    # 4.0f

    .line 739
    .line 740
    const/16 v21, 0x0

    .line 741
    .line 742
    move-object/from16 v18, v3

    .line 743
    .line 744
    invoke-static/range {v18 .. v23}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 745
    .line 746
    .line 747
    move-result-object v1

    .line 748
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v3

    .line 752
    if-ne v3, v2, :cond_16

    .line 753
    .line 754
    new-instance v3, La/f8l0;

    .line 755
    .line 756
    const/16 v2, 0xb

    .line 757
    .line 758
    invoke-direct {v3, v2}, La/f8l0;-><init>(B)V

    .line 759
    .line 760
    .line 761
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 762
    .line 763
    .line 764
    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 765
    .line 766
    invoke-static {v1, v3}, La/rq8;->K(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-static {v1, v0, v4, v8}, La/dqm0;->i(La/mm40;La/l1v0;La/fet;I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v4, v8}, La/fet;->r(Z)V

    .line 774
    .line 775
    .line 776
    goto :goto_f

    .line 777
    :cond_17
    invoke-virtual {v4}, La/fet;->X()V

    .line 778
    .line 779
    .line 780
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 781
    .line 782
    return-object v0

    .line 783
    :pswitch_5
    move-object/from16 v0, p1

    .line 784
    .line 785
    check-cast v0, La/ir8;

    .line 786
    .line 787
    move-object/from16 v1, p2

    .line 788
    .line 789
    check-cast v1, La/mm40;

    .line 790
    .line 791
    move-object/from16 v2, p3

    .line 792
    .line 793
    check-cast v2, La/fet;

    .line 794
    .line 795
    move-object/from16 v3, p4

    .line 796
    .line 797
    check-cast v3, Ljava/lang/Integer;

    .line 798
    .line 799
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 800
    .line 801
    .line 802
    move-result v3

    .line 803
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 804
    .line 805
    .line 806
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 807
    .line 808
    .line 809
    and-int/lit8 v0, v3, 0x30

    .line 810
    .line 811
    if-nez v0, :cond_19

    .line 812
    .line 813
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v0

    .line 817
    if-eqz v0, :cond_18

    .line 818
    .line 819
    goto :goto_10

    .line 820
    :cond_18
    const/16 v16, 0x10

    .line 821
    .line 822
    :goto_10
    or-int v3, v3, v16

    .line 823
    .line 824
    :cond_19
    and-int/lit16 v0, v3, 0x91

    .line 825
    .line 826
    if-eq v0, v14, :cond_1a

    .line 827
    .line 828
    move v8, v15

    .line 829
    :cond_1a
    and-int/lit8 v0, v3, 0x1

    .line 830
    .line 831
    invoke-virtual {v2, v0, v8}, La/fet;->U(IZ)Z

    .line 832
    .line 833
    .line 834
    move-result v0

    .line 835
    if-nez v0, :cond_1b

    .line 836
    .line 837
    invoke-virtual {v2}, La/fet;->X()V

    .line 838
    .line 839
    .line 840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :cond_1b
    throw v13

    .line 844
    :pswitch_6
    check-cast v0, La/xhd0;

    .line 845
    .line 846
    move-object/from16 v1, p1

    .line 847
    .line 848
    check-cast v1, Ljava/lang/CharSequence;

    .line 849
    .line 850
    move-object/from16 v2, p2

    .line 851
    .line 852
    check-cast v2, Ljava/lang/Integer;

    .line 853
    .line 854
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 855
    .line 856
    .line 857
    move-object/from16 v2, p3

    .line 858
    .line 859
    check-cast v2, Ljava/lang/Integer;

    .line 860
    .line 861
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    move-object/from16 v2, p4

    .line 865
    .line 866
    check-cast v2, Ljava/lang/Integer;

    .line 867
    .line 868
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    sget-object v2, La/xhd0;->S1:La/fl70;

    .line 872
    .line 873
    invoke-virtual {v0}, La/xhd0;->H0()La/jid0;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 878
    .line 879
    .line 880
    move-result-object v1

    .line 881
    sget-object v2, La/zhd0;->a:La/zhd0;

    .line 882
    .line 883
    invoke-virtual {v0, v2}, La/jid0;->y(La/hid0;)V

    .line 884
    .line 885
    .line 886
    iget-object v2, v0, La/jid0;->k:La/p7m0;

    .line 887
    .line 888
    :cond_1c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 889
    .line 890
    .line 891
    move-result-object v0

    .line 892
    move-object v3, v0

    .line 893
    check-cast v3, La/iid0;

    .line 894
    .line 895
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 896
    .line 897
    .line 898
    move-result-object v4

    .line 899
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    invoke-static {v1}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 904
    .line 905
    .line 906
    move-result v5

    .line 907
    xor-int/2addr v5, v15

    .line 908
    const/16 v6, 0x9

    .line 909
    .line 910
    invoke-static {v3, v4, v5, v8, v6}, La/iid0;->a(La/iid0;Ljava/lang/String;ZZI)La/iid0;

    .line 911
    .line 912
    .line 913
    move-result-object v3

    .line 914
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v0

    .line 918
    if-eqz v0, :cond_1c

    .line 919
    .line 920
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 921
    .line 922
    return-object v0

    .line 923
    :pswitch_7
    check-cast v0, La/jgd0;

    .line 924
    .line 925
    move-object/from16 v1, p1

    .line 926
    .line 927
    check-cast v1, Ljava/lang/CharSequence;

    .line 928
    .line 929
    move-object/from16 v2, p2

    .line 930
    .line 931
    check-cast v2, Ljava/lang/Integer;

    .line 932
    .line 933
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 934
    .line 935
    .line 936
    move-object/from16 v2, p3

    .line 937
    .line 938
    check-cast v2, Ljava/lang/Integer;

    .line 939
    .line 940
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 941
    .line 942
    .line 943
    move-object/from16 v2, p4

    .line 944
    .line 945
    check-cast v2, Ljava/lang/Integer;

    .line 946
    .line 947
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 948
    .line 949
    .line 950
    sget-object v2, La/jgd0;->V1:La/xi70;

    .line 951
    .line 952
    invoke-virtual {v0}, La/jgd0;->I0()La/shd0;

    .line 953
    .line 954
    .line 955
    move-result-object v2

    .line 956
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    sget-object v3, La/zgd0;->a:La/zgd0;

    .line 961
    .line 962
    invoke-virtual {v2, v3}, La/shd0;->B(La/khd0;)V

    .line 963
    .line 964
    .line 965
    iget-object v2, v2, La/shd0;->s:La/p7m0;

    .line 966
    .line 967
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 968
    .line 969
    .line 970
    move-result-object v1

    .line 971
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 972
    .line 973
    .line 974
    move-result-object v1

    .line 975
    invoke-virtual {v2, v1}, La/p7m0;->n(Ljava/lang/Object;)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v0}, La/jgd0;->H0()La/l3r;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    iget-object v0, v0, La/l3r;->e:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 983
    .line 984
    invoke-virtual {v0, v8}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 985
    .line 986
    .line 987
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 988
    .line 989
    return-object v0

    .line 990
    :pswitch_8
    check-cast v0, La/gfd0;

    .line 991
    .line 992
    move-object/from16 v1, p1

    .line 993
    .line 994
    check-cast v1, Ljava/lang/CharSequence;

    .line 995
    .line 996
    move-object/from16 v2, p2

    .line 997
    .line 998
    check-cast v2, Ljava/lang/Integer;

    .line 999
    .line 1000
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1001
    .line 1002
    .line 1003
    move-object/from16 v2, p3

    .line 1004
    .line 1005
    check-cast v2, Ljava/lang/Integer;

    .line 1006
    .line 1007
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1008
    .line 1009
    .line 1010
    move-object/from16 v2, p4

    .line 1011
    .line 1012
    check-cast v2, Ljava/lang/Integer;

    .line 1013
    .line 1014
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1015
    .line 1016
    .line 1017
    sget-object v2, La/gfd0;->S1:La/mi70;

    .line 1018
    .line 1019
    invoke-virtual {v0}, La/gfd0;->I0()La/fgd0;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v0

    .line 1023
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v1

    .line 1027
    sget-object v2, La/nfd0;->a:La/nfd0;

    .line 1028
    .line 1029
    invoke-virtual {v0, v2}, La/fgd0;->C(La/xfd0;)V

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v1}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1037
    .line 1038
    .line 1039
    move-result-object v1

    .line 1040
    iget-object v2, v0, La/fgd0;->q:La/p7m0;

    .line 1041
    .line 1042
    :cond_1d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    move-object v3, v0

    .line 1047
    check-cast v3, La/yfd0;

    .line 1048
    .line 1049
    invoke-static {v3, v1, v13, v12}, La/yfd0;->a(La/yfd0;Ljava/lang/String;Ljava/lang/String;I)La/yfd0;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v3

    .line 1053
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1054
    .line 1055
    .line 1056
    move-result v0

    .line 1057
    if-eqz v0, :cond_1d

    .line 1058
    .line 1059
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1060
    .line 1061
    return-object v0

    .line 1062
    :pswitch_9
    check-cast v0, La/npo;

    .line 1063
    .line 1064
    move-object/from16 v1, p1

    .line 1065
    .line 1066
    check-cast v1, La/g9z;

    .line 1067
    .line 1068
    move-object/from16 v2, p2

    .line 1069
    .line 1070
    check-cast v2, Ljava/lang/Integer;

    .line 1071
    .line 1072
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    move-object/from16 v2, p3

    .line 1076
    .line 1077
    check-cast v2, La/fet;

    .line 1078
    .line 1079
    move-object/from16 v3, p4

    .line 1080
    .line 1081
    check-cast v3, Ljava/lang/Integer;

    .line 1082
    .line 1083
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1084
    .line 1085
    .line 1086
    move-result v3

    .line 1087
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1088
    .line 1089
    .line 1090
    and-int/lit16 v1, v3, 0x81

    .line 1091
    .line 1092
    if-eq v1, v4, :cond_1e

    .line 1093
    .line 1094
    move v1, v15

    .line 1095
    goto :goto_11

    .line 1096
    :cond_1e
    move v1, v8

    .line 1097
    :goto_11
    and-int/2addr v3, v15

    .line 1098
    invoke-virtual {v2, v3, v1}, La/fet;->U(IZ)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v1

    .line 1102
    if-eqz v1, :cond_1f

    .line 1103
    .line 1104
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1105
    .line 1106
    const/high16 v1, 0x43960000    # 300.0f

    .line 1107
    .line 1108
    invoke-static {v9, v1}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    invoke-static {v1, v0, v2, v8}, La/efx;->o(La/mm40;La/npo;La/fet;I)V

    .line 1113
    .line 1114
    .line 1115
    goto :goto_12

    .line 1116
    :cond_1f
    invoke-virtual {v2}, La/fet;->X()V

    .line 1117
    .line 1118
    .line 1119
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1120
    .line 1121
    return-object v0

    .line 1122
    :pswitch_a
    check-cast v0, La/hga0;

    .line 1123
    .line 1124
    move-object/from16 v1, p1

    .line 1125
    .line 1126
    check-cast v1, La/rk80;

    .line 1127
    .line 1128
    move-object/from16 v2, p2

    .line 1129
    .line 1130
    check-cast v2, Ljava/lang/Integer;

    .line 1131
    .line 1132
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1133
    .line 1134
    .line 1135
    move-result v2

    .line 1136
    move-object/from16 v3, p3

    .line 1137
    .line 1138
    check-cast v3, La/fet;

    .line 1139
    .line 1140
    move-object/from16 v4, p4

    .line 1141
    .line 1142
    check-cast v4, Ljava/lang/Integer;

    .line 1143
    .line 1144
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1145
    .line 1146
    .line 1147
    move-result v4

    .line 1148
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    and-int/lit8 v1, v4, 0x30

    .line 1152
    .line 1153
    if-nez v1, :cond_21

    .line 1154
    .line 1155
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    if-eqz v1, :cond_20

    .line 1160
    .line 1161
    goto :goto_13

    .line 1162
    :cond_20
    const/16 v16, 0x10

    .line 1163
    .line 1164
    :goto_13
    or-int v4, v4, v16

    .line 1165
    .line 1166
    :cond_21
    and-int/lit16 v1, v4, 0x91

    .line 1167
    .line 1168
    if-eq v1, v14, :cond_22

    .line 1169
    .line 1170
    move v1, v15

    .line 1171
    goto :goto_14

    .line 1172
    :cond_22
    move v1, v8

    .line 1173
    :goto_14
    and-int/2addr v4, v15

    .line 1174
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v1

    .line 1178
    if-eqz v1, :cond_26

    .line 1179
    .line 1180
    iget-object v1, v0, La/hga0;->d:La/a4x;

    .line 1181
    .line 1182
    iget-object v0, v0, La/hga0;->c:La/q2a0;

    .line 1183
    .line 1184
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v1

    .line 1188
    check-cast v1, La/cga0;

    .line 1189
    .line 1190
    if-nez v1, :cond_23

    .line 1191
    .line 1192
    goto :goto_15

    .line 1193
    :cond_23
    instance-of v2, v1, La/bga0;

    .line 1194
    .line 1195
    if-eqz v2, :cond_24

    .line 1196
    .line 1197
    const v1, 0x5e057c7b

    .line 1198
    .line 1199
    .line 1200
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1201
    .line 1202
    .line 1203
    invoke-static {v13, v0, v3, v8}, La/xww;->i(La/mm40;La/q2a0;La/fet;I)V

    .line 1204
    .line 1205
    .line 1206
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 1207
    .line 1208
    .line 1209
    goto :goto_16

    .line 1210
    :cond_24
    instance-of v1, v1, La/aga0;

    .line 1211
    .line 1212
    if-eqz v1, :cond_25

    .line 1213
    .line 1214
    const v1, 0x5e0588df

    .line 1215
    .line 1216
    .line 1217
    invoke-virtual {v3, v1}, La/fet;->e0(I)V

    .line 1218
    .line 1219
    .line 1220
    invoke-static {v0, v3, v8}, La/azw;->o(La/q2a0;La/fet;I)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 1224
    .line 1225
    .line 1226
    goto :goto_16

    .line 1227
    :cond_25
    :goto_15
    const v0, 0x62acba9a

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v3, v8}, La/fet;->r(Z)V

    .line 1234
    .line 1235
    .line 1236
    goto :goto_16

    .line 1237
    :cond_26
    invoke-virtual {v3}, La/fet;->X()V

    .line 1238
    .line 1239
    .line 1240
    :goto_16
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1241
    .line 1242
    return-object v0

    .line 1243
    :pswitch_b
    check-cast v0, La/vea0;

    .line 1244
    .line 1245
    move-object/from16 v1, p1

    .line 1246
    .line 1247
    check-cast v1, La/g9z;

    .line 1248
    .line 1249
    move-object/from16 v2, p2

    .line 1250
    .line 1251
    check-cast v2, Ljava/lang/Integer;

    .line 1252
    .line 1253
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1254
    .line 1255
    .line 1256
    move-result v2

    .line 1257
    move-object/from16 v3, p3

    .line 1258
    .line 1259
    check-cast v3, La/fet;

    .line 1260
    .line 1261
    move-object/from16 v4, p4

    .line 1262
    .line 1263
    check-cast v4, Ljava/lang/Integer;

    .line 1264
    .line 1265
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1266
    .line 1267
    .line 1268
    move-result v4

    .line 1269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1270
    .line 1271
    .line 1272
    and-int/lit8 v1, v4, 0x30

    .line 1273
    .line 1274
    if-nez v1, :cond_28

    .line 1275
    .line 1276
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1277
    .line 1278
    .line 1279
    move-result v1

    .line 1280
    if-eqz v1, :cond_27

    .line 1281
    .line 1282
    goto :goto_17

    .line 1283
    :cond_27
    const/16 v16, 0x10

    .line 1284
    .line 1285
    :goto_17
    or-int v4, v4, v16

    .line 1286
    .line 1287
    :cond_28
    and-int/lit16 v1, v4, 0x91

    .line 1288
    .line 1289
    if-eq v1, v14, :cond_29

    .line 1290
    .line 1291
    move v1, v15

    .line 1292
    goto :goto_18

    .line 1293
    :cond_29
    move v1, v8

    .line 1294
    :goto_18
    and-int/2addr v4, v15

    .line 1295
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 1296
    .line 1297
    .line 1298
    move-result v1

    .line 1299
    if-eqz v1, :cond_2a

    .line 1300
    .line 1301
    iget-object v0, v0, La/vea0;->d:La/a4x;

    .line 1302
    .line 1303
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1304
    .line 1305
    .line 1306
    move-result-object v0

    .line 1307
    check-cast v0, La/lga0;

    .line 1308
    .line 1309
    invoke-static {v0, v3, v8}, La/pzw;->m(La/lga0;La/fet;I)V

    .line 1310
    .line 1311
    .line 1312
    goto :goto_19

    .line 1313
    :cond_2a
    invoke-virtual {v3}, La/fet;->X()V

    .line 1314
    .line 1315
    .line 1316
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1317
    .line 1318
    return-object v0

    .line 1319
    :pswitch_c
    check-cast v0, La/u7a0;

    .line 1320
    .line 1321
    move-object/from16 v1, p1

    .line 1322
    .line 1323
    check-cast v1, La/g9z;

    .line 1324
    .line 1325
    move-object/from16 v2, p2

    .line 1326
    .line 1327
    check-cast v2, Ljava/lang/Integer;

    .line 1328
    .line 1329
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1330
    .line 1331
    .line 1332
    move-result v2

    .line 1333
    move-object/from16 v3, p3

    .line 1334
    .line 1335
    check-cast v3, La/fet;

    .line 1336
    .line 1337
    move-object/from16 v4, p4

    .line 1338
    .line 1339
    check-cast v4, Ljava/lang/Integer;

    .line 1340
    .line 1341
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1342
    .line 1343
    .line 1344
    move-result v4

    .line 1345
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1346
    .line 1347
    .line 1348
    and-int/lit8 v1, v4, 0x30

    .line 1349
    .line 1350
    if-nez v1, :cond_2c

    .line 1351
    .line 1352
    invoke-virtual {v3, v2}, La/fet;->e(I)Z

    .line 1353
    .line 1354
    .line 1355
    move-result v1

    .line 1356
    if-eqz v1, :cond_2b

    .line 1357
    .line 1358
    goto :goto_1a

    .line 1359
    :cond_2b
    const/16 v16, 0x10

    .line 1360
    .line 1361
    :goto_1a
    or-int v4, v4, v16

    .line 1362
    .line 1363
    :cond_2c
    and-int/lit16 v1, v4, 0x91

    .line 1364
    .line 1365
    if-eq v1, v14, :cond_2d

    .line 1366
    .line 1367
    move v1, v15

    .line 1368
    goto :goto_1b

    .line 1369
    :cond_2d
    move v1, v8

    .line 1370
    :goto_1b
    and-int/2addr v4, v15

    .line 1371
    invoke-virtual {v3, v4, v1}, La/fet;->U(IZ)Z

    .line 1372
    .line 1373
    .line 1374
    move-result v1

    .line 1375
    if-eqz v1, :cond_2f

    .line 1376
    .line 1377
    rem-int/lit8 v1, v2, 0x2

    .line 1378
    .line 1379
    if-nez v1, :cond_2e

    .line 1380
    .line 1381
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 1382
    .line 1383
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v1

    .line 1387
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1388
    .line 1389
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 1390
    .line 1391
    .line 1392
    move-result-wide v4

    .line 1393
    goto :goto_1c

    .line 1394
    :cond_2e
    sget-object v1, La/s6t0;->a:La/pz40;

    .line 1395
    .line 1396
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v1

    .line 1400
    iget-object v1, v1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1401
    .line 1402
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1403
    .line 1404
    .line 1405
    move-result-wide v4

    .line 1406
    :goto_1c
    sget-object v1, La/jd8;->n:La/ljc;

    .line 1407
    .line 1408
    invoke-static {v9, v4, v5, v1}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v1

    .line 1412
    iget-object v0, v0, La/u7a0;->b:La/a4x;

    .line 1413
    .line 1414
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    check-cast v0, La/t7a0;

    .line 1419
    .line 1420
    invoke-static {v1, v0, v3, v8}, La/qjj;->E(La/mm40;La/t7a0;La/fet;I)V

    .line 1421
    .line 1422
    .line 1423
    goto :goto_1d

    .line 1424
    :cond_2f
    invoke-virtual {v3}, La/fet;->X()V

    .line 1425
    .line 1426
    .line 1427
    :goto_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1428
    .line 1429
    return-object v0

    .line 1430
    :pswitch_d
    move-object v3, v0

    .line 1431
    check-cast v3, La/z1a0;

    .line 1432
    .line 1433
    move-object/from16 v2, p1

    .line 1434
    .line 1435
    check-cast v2, La/mm40;

    .line 1436
    .line 1437
    move-object/from16 v4, p2

    .line 1438
    .line 1439
    check-cast v4, Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;

    .line 1440
    .line 1441
    move-object/from16 v0, p3

    .line 1442
    .line 1443
    check-cast v0, La/fet;

    .line 1444
    .line 1445
    move-object/from16 v1, p4

    .line 1446
    .line 1447
    check-cast v1, Ljava/lang/Integer;

    .line 1448
    .line 1449
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1450
    .line 1451
    .line 1452
    move-result v1

    .line 1453
    sget-object v6, La/z1a0;->U1:La/fl70;

    .line 1454
    .line 1455
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1456
    .line 1457
    .line 1458
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1459
    .line 1460
    .line 1461
    and-int/lit8 v6, v1, 0x6

    .line 1462
    .line 1463
    if-nez v6, :cond_31

    .line 1464
    .line 1465
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1466
    .line 1467
    .line 1468
    move-result v6

    .line 1469
    if-eqz v6, :cond_30

    .line 1470
    .line 1471
    goto :goto_1e

    .line 1472
    :cond_30
    move v10, v11

    .line 1473
    :goto_1e
    or-int v6, v1, v10

    .line 1474
    .line 1475
    goto :goto_1f

    .line 1476
    :cond_31
    move v6, v1

    .line 1477
    :goto_1f
    and-int/lit8 v9, v1, 0x30

    .line 1478
    .line 1479
    if-nez v9, :cond_34

    .line 1480
    .line 1481
    and-int/lit8 v1, v1, 0x40

    .line 1482
    .line 1483
    if-nez v1, :cond_32

    .line 1484
    .line 1485
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1486
    .line 1487
    .line 1488
    move-result v1

    .line 1489
    goto :goto_20

    .line 1490
    :cond_32
    invoke-virtual {v0, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1491
    .line 1492
    .line 1493
    move-result v1

    .line 1494
    :goto_20
    if-eqz v1, :cond_33

    .line 1495
    .line 1496
    goto :goto_21

    .line 1497
    :cond_33
    const/16 v16, 0x10

    .line 1498
    .line 1499
    :goto_21
    or-int v6, v6, v16

    .line 1500
    .line 1501
    :cond_34
    and-int/lit16 v1, v6, 0x93

    .line 1502
    .line 1503
    if-eq v1, v5, :cond_35

    .line 1504
    .line 1505
    goto :goto_22

    .line 1506
    :cond_35
    move v15, v8

    .line 1507
    :goto_22
    and-int/lit8 v1, v6, 0x1

    .line 1508
    .line 1509
    invoke-virtual {v0, v1, v15}, La/fet;->U(IZ)Z

    .line 1510
    .line 1511
    .line 1512
    move-result v1

    .line 1513
    if-eqz v1, :cond_37

    .line 1514
    .line 1515
    iget-object v1, v3, La/z1a0;->Q1:La/h430;

    .line 1516
    .line 1517
    if-eqz v1, :cond_36

    .line 1518
    .line 1519
    and-int/lit8 v5, v6, 0xe

    .line 1520
    .line 1521
    shl-int/2addr v6, v7

    .line 1522
    and-int/lit16 v6, v6, 0x380

    .line 1523
    .line 1524
    or-int/2addr v6, v5

    .line 1525
    move-object v5, v0

    .line 1526
    invoke-virtual/range {v1 .. v6}, La/h430;->a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V

    .line 1527
    .line 1528
    .line 1529
    goto :goto_23

    .line 1530
    :cond_36
    const-string v0, "marketsFactory"

    .line 1531
    .line 1532
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1533
    .line 1534
    .line 1535
    throw v13

    .line 1536
    :cond_37
    move-object v5, v0

    .line 1537
    invoke-virtual {v5}, La/fet;->X()V

    .line 1538
    .line 1539
    .line 1540
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1541
    .line 1542
    return-object v0

    .line 1543
    :pswitch_e
    check-cast v0, La/zo90;

    .line 1544
    .line 1545
    move-object/from16 v1, p1

    .line 1546
    .line 1547
    check-cast v1, Ljava/lang/CharSequence;

    .line 1548
    .line 1549
    move-object/from16 v2, p2

    .line 1550
    .line 1551
    check-cast v2, Ljava/lang/Integer;

    .line 1552
    .line 1553
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1554
    .line 1555
    .line 1556
    move-result v2

    .line 1557
    move-object/from16 v3, p3

    .line 1558
    .line 1559
    check-cast v3, Ljava/lang/Integer;

    .line 1560
    .line 1561
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1562
    .line 1563
    .line 1564
    move-result v3

    .line 1565
    move-object/from16 v4, p4

    .line 1566
    .line 1567
    check-cast v4, Ljava/lang/Integer;

    .line 1568
    .line 1569
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1570
    .line 1571
    .line 1572
    move-result v4

    .line 1573
    sget-object v5, La/zo90;->p2:La/fl70;

    .line 1574
    .line 1575
    if-nez v2, :cond_38

    .line 1576
    .line 1577
    if-nez v3, :cond_38

    .line 1578
    .line 1579
    if-eqz v4, :cond_3a

    .line 1580
    .line 1581
    :cond_38
    invoke-virtual {v0}, La/zo90;->W0()La/es90;

    .line 1582
    .line 1583
    .line 1584
    move-result-object v0

    .line 1585
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1586
    .line 1587
    .line 1588
    move-result-object v3

    .line 1589
    iget-object v1, v0, La/es90;->i:La/g090;

    .line 1590
    .line 1591
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1592
    .line 1593
    .line 1594
    iget-object v0, v1, La/g090;->b:Ljava/lang/Object;

    .line 1595
    .line 1596
    move-object v10, v0

    .line 1597
    check-cast v10, La/p7m0;

    .line 1598
    .line 1599
    :cond_39
    invoke-virtual {v10}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    move-object v2, v0

    .line 1604
    check-cast v2, La/cr90;

    .line 1605
    .line 1606
    const/4 v8, 0x0

    .line 1607
    const/16 v9, 0x1bb

    .line 1608
    .line 1609
    const/4 v4, 0x0

    .line 1610
    const/4 v5, 0x0

    .line 1611
    const/4 v6, 0x0

    .line 1612
    const/4 v7, 0x0

    .line 1613
    invoke-static/range {v2 .. v9}, La/cr90;->a(La/cr90;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZLjava/lang/Throwable;Ljava/lang/Integer;I)La/cr90;

    .line 1614
    .line 1615
    .line 1616
    move-result-object v2

    .line 1617
    invoke-virtual {v10, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1618
    .line 1619
    .line 1620
    move-result v0

    .line 1621
    if-eqz v0, :cond_39

    .line 1622
    .line 1623
    iget-object v0, v1, La/g090;->a:Ljava/lang/Object;

    .line 1624
    .line 1625
    check-cast v0, La/vzg0;

    .line 1626
    .line 1627
    const-string v1, "KEY_PHONE_CODE_BY_MANUALLY"

    .line 1628
    .line 1629
    invoke-virtual {v0, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1630
    .line 1631
    .line 1632
    :cond_3a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1633
    .line 1634
    return-object v0

    .line 1635
    :pswitch_f
    check-cast v0, La/z880;

    .line 1636
    .line 1637
    move-object/from16 v1, p1

    .line 1638
    .line 1639
    check-cast v1, Ljava/lang/CharSequence;

    .line 1640
    .line 1641
    move-object/from16 v2, p2

    .line 1642
    .line 1643
    check-cast v2, Ljava/lang/Integer;

    .line 1644
    .line 1645
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1646
    .line 1647
    .line 1648
    move-object/from16 v2, p3

    .line 1649
    .line 1650
    check-cast v2, Ljava/lang/Integer;

    .line 1651
    .line 1652
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1653
    .line 1654
    .line 1655
    move-object/from16 v2, p4

    .line 1656
    .line 1657
    check-cast v2, Ljava/lang/Integer;

    .line 1658
    .line 1659
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1660
    .line 1661
    .line 1662
    sget-object v2, La/z880;->U1:La/xi70;

    .line 1663
    .line 1664
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 1665
    .line 1666
    .line 1667
    move-result-object v0

    .line 1668
    if-eqz v1, :cond_3b

    .line 1669
    .line 1670
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v13

    .line 1674
    :cond_3b
    if-nez v13, :cond_3c

    .line 1675
    .line 1676
    const-string v13, ""

    .line 1677
    .line 1678
    :cond_3c
    move-object v3, v13

    .line 1679
    iget-object v12, v0, La/aa80;->z:La/p7m0;

    .line 1680
    .line 1681
    :cond_3d
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    move-object v1, v0

    .line 1686
    check-cast v1, La/d980;

    .line 1687
    .line 1688
    const/4 v8, 0x0

    .line 1689
    const/16 v9, 0x7d

    .line 1690
    .line 1691
    const/4 v2, 0x0

    .line 1692
    const/4 v4, 0x0

    .line 1693
    const/4 v5, 0x0

    .line 1694
    const/4 v6, 0x0

    .line 1695
    const/4 v7, 0x0

    .line 1696
    invoke-static/range {v1 .. v9}, La/d980;->a(La/d980;ZLjava/lang/String;La/c980;La/a980;La/b980;ZZI)La/d980;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v1

    .line 1700
    invoke-virtual {v12, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1701
    .line 1702
    .line 1703
    move-result v0

    .line 1704
    if-eqz v0, :cond_3d

    .line 1705
    .line 1706
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1707
    .line 1708
    return-object v0

    .line 1709
    :pswitch_10
    check-cast v0, La/ir8;

    .line 1710
    .line 1711
    move-object/from16 v1, p1

    .line 1712
    .line 1713
    check-cast v1, La/pm80;

    .line 1714
    .line 1715
    move-object/from16 v2, p2

    .line 1716
    .line 1717
    check-cast v2, La/o0x;

    .line 1718
    .line 1719
    move-object/from16 v3, p3

    .line 1720
    .line 1721
    check-cast v3, La/fet;

    .line 1722
    .line 1723
    move-object/from16 v4, p4

    .line 1724
    .line 1725
    check-cast v4, Ljava/lang/Integer;

    .line 1726
    .line 1727
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1728
    .line 1729
    .line 1730
    move-result v4

    .line 1731
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1732
    .line 1733
    .line 1734
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1735
    .line 1736
    .line 1737
    and-int/lit8 v2, v4, 0x6

    .line 1738
    .line 1739
    if-nez v2, :cond_40

    .line 1740
    .line 1741
    and-int/lit8 v2, v4, 0x8

    .line 1742
    .line 1743
    if-nez v2, :cond_3e

    .line 1744
    .line 1745
    invoke-virtual {v3, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1746
    .line 1747
    .line 1748
    move-result v2

    .line 1749
    goto :goto_24

    .line 1750
    :cond_3e
    invoke-virtual {v3, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1751
    .line 1752
    .line 1753
    move-result v2

    .line 1754
    :goto_24
    if-eqz v2, :cond_3f

    .line 1755
    .line 1756
    goto :goto_25

    .line 1757
    :cond_3f
    move v10, v11

    .line 1758
    :goto_25
    or-int/2addr v4, v10

    .line 1759
    :cond_40
    and-int/lit16 v2, v4, 0x83

    .line 1760
    .line 1761
    const/16 v5, 0x82

    .line 1762
    .line 1763
    if-eq v2, v5, :cond_41

    .line 1764
    .line 1765
    goto :goto_26

    .line 1766
    :cond_41
    move v15, v8

    .line 1767
    :goto_26
    and-int/lit8 v2, v4, 0x1

    .line 1768
    .line 1769
    invoke-virtual {v3, v2, v15}, La/fet;->U(IZ)Z

    .line 1770
    .line 1771
    .line 1772
    move-result v2

    .line 1773
    if-eqz v2, :cond_42

    .line 1774
    .line 1775
    invoke-interface {v0, v9}, La/ir8;->a(La/mm40;)La/mm40;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v0

    .line 1779
    sget-object v2, La/qmk;->a:La/zcl;

    .line 1780
    .line 1781
    const/high16 v2, 0x41200000    # 10.0f

    .line 1782
    .line 1783
    invoke-static {v2}, La/vgg0;->a(F)La/ugg0;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v2

    .line 1787
    invoke-static {v0, v2}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 1788
    .line 1789
    .line 1790
    move-result-object v21

    .line 1791
    sget-object v23, La/gqw0;->A:La/pge;

    .line 1792
    .line 1793
    const/16 v0, 0x6038

    .line 1794
    .line 1795
    and-int/lit8 v2, v4, 0xe

    .line 1796
    .line 1797
    or-int v27, v0, v2

    .line 1798
    .line 1799
    const/16 v28, 0x68

    .line 1800
    .line 1801
    const/16 v20, 0x0

    .line 1802
    .line 1803
    const/16 v22, 0x0

    .line 1804
    .line 1805
    const/16 v24, 0x0

    .line 1806
    .line 1807
    const/16 v25, 0x0

    .line 1808
    .line 1809
    move-object/from16 v19, v1

    .line 1810
    .line 1811
    move-object/from16 v26, v3

    .line 1812
    .line 1813
    invoke-static/range {v19 .. v28}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 1814
    .line 1815
    .line 1816
    goto :goto_27

    .line 1817
    :cond_42
    move-object/from16 v26, v3

    .line 1818
    .line 1819
    invoke-virtual/range {v26 .. v26}, La/fet;->X()V

    .line 1820
    .line 1821
    .line 1822
    :goto_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1823
    .line 1824
    return-object v0

    .line 1825
    :pswitch_11
    check-cast v0, La/qr10;

    .line 1826
    .line 1827
    move-object/from16 v1, p1

    .line 1828
    .line 1829
    check-cast v1, La/y5d;

    .line 1830
    .line 1831
    move-object/from16 v3, p2

    .line 1832
    .line 1833
    check-cast v3, La/sr10;

    .line 1834
    .line 1835
    move-object/from16 v4, p3

    .line 1836
    .line 1837
    check-cast v4, La/fet;

    .line 1838
    .line 1839
    move-object/from16 v5, p4

    .line 1840
    .line 1841
    check-cast v5, Ljava/lang/Integer;

    .line 1842
    .line 1843
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1844
    .line 1845
    .line 1846
    move-result v5

    .line 1847
    sget-object v6, La/qr10;->V1:La/evz;

    .line 1848
    .line 1849
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1853
    .line 1854
    .line 1855
    and-int/lit8 v1, v5, 0x30

    .line 1856
    .line 1857
    if-nez v1, :cond_44

    .line 1858
    .line 1859
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1860
    .line 1861
    .line 1862
    move-result v1

    .line 1863
    invoke-virtual {v4, v1}, La/fet;->e(I)Z

    .line 1864
    .line 1865
    .line 1866
    move-result v1

    .line 1867
    if-eqz v1, :cond_43

    .line 1868
    .line 1869
    goto :goto_28

    .line 1870
    :cond_43
    const/16 v16, 0x10

    .line 1871
    .line 1872
    :goto_28
    or-int v5, v5, v16

    .line 1873
    .line 1874
    :cond_44
    and-int/lit16 v1, v5, 0x91

    .line 1875
    .line 1876
    if-eq v1, v14, :cond_45

    .line 1877
    .line 1878
    move v1, v15

    .line 1879
    goto :goto_29

    .line 1880
    :cond_45
    move v1, v8

    .line 1881
    :goto_29
    and-int/2addr v5, v15

    .line 1882
    invoke-virtual {v4, v5, v1}, La/fet;->U(IZ)Z

    .line 1883
    .line 1884
    .line 1885
    move-result v1

    .line 1886
    if-eqz v1, :cond_50

    .line 1887
    .line 1888
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1889
    .line 1890
    .line 1891
    move-result v1

    .line 1892
    if-eqz v1, :cond_4d

    .line 1893
    .line 1894
    if-ne v1, v15, :cond_4c

    .line 1895
    .line 1896
    const v1, -0xdadf579

    .line 1897
    .line 1898
    .line 1899
    invoke-virtual {v4, v1}, La/fet;->e0(I)V

    .line 1900
    .line 1901
    .line 1902
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1903
    .line 1904
    .line 1905
    move-result v1

    .line 1906
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v3

    .line 1910
    if-nez v1, :cond_46

    .line 1911
    .line 1912
    if-ne v3, v2, :cond_47

    .line 1913
    .line 1914
    :cond_46
    new-instance v3, La/nr10;

    .line 1915
    .line 1916
    invoke-direct {v3, v0, v7}, La/nr10;-><init>(La/qr10;B)V

    .line 1917
    .line 1918
    .line 1919
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1920
    .line 1921
    .line 1922
    :cond_47
    move-object/from16 v18, v3

    .line 1923
    .line 1924
    check-cast v18, Lkotlin/jvm/functions/Function0;

    .line 1925
    .line 1926
    invoke-virtual {v4, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1927
    .line 1928
    .line 1929
    move-result v1

    .line 1930
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 1931
    .line 1932
    .line 1933
    move-result-object v3

    .line 1934
    if-nez v1, :cond_48

    .line 1935
    .line 1936
    if-ne v3, v2, :cond_49

    .line 1937
    .line 1938
    :cond_48
    new-instance v3, La/nr10;

    .line 1939
    .line 1940
    invoke-direct {v3, v0, v10}, La/nr10;-><init>(La/qr10;B)V

    .line 1941
    .line 1942
    .line 1943
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1944
    .line 1945
    .line 1946
    :cond_49
    move-object/from16 v19, v3

    .line 1947
    .line 1948
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 1949
    .line 1950
    const/16 v22, 0x0

    .line 1951
    .line 1952
    const/16 v23, 0x4

    .line 1953
    .line 1954
    const/16 v20, 0x0

    .line 1955
    .line 1956
    move-object/from16 v21, v4

    .line 1957
    .line 1958
    invoke-static/range {v18 .. v23}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1959
    .line 1960
    .line 1961
    move-object/from16 v1, v21

    .line 1962
    .line 1963
    invoke-virtual {v0}, La/qr10;->G0()La/k3t0;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v3

    .line 1967
    check-cast v3, La/i3t0;

    .line 1968
    .line 1969
    invoke-virtual {v3, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v3

    .line 1973
    invoke-virtual {v0}, La/qr10;->G0()La/k3t0;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v11

    .line 1977
    invoke-virtual {v1, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1978
    .line 1979
    .line 1980
    move-result v0

    .line 1981
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v4

    .line 1985
    if-nez v0, :cond_4a

    .line 1986
    .line 1987
    if-ne v4, v2, :cond_4b

    .line 1988
    .line 1989
    :cond_4a
    new-instance v9, La/pf10;

    .line 1990
    .line 1991
    const/4 v15, 0x0

    .line 1992
    const/16 v16, 0x16

    .line 1993
    .line 1994
    const/4 v10, 0x1

    .line 1995
    const-class v12, La/k3t0;

    .line 1996
    .line 1997
    const-string v13, "onAction"

    .line 1998
    .line 1999
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 2000
    .line 2001
    invoke-direct/range {v9 .. v16}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2002
    .line 2003
    .line 2004
    invoke-virtual {v1, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2005
    .line 2006
    .line 2007
    move-object v4, v9

    .line 2008
    :cond_4b
    check-cast v4, La/jhy;

    .line 2009
    .line 2010
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 2011
    .line 2012
    invoke-static {v3, v4, v1, v8}, La/cwr0;->k(La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 2016
    .line 2017
    .line 2018
    goto :goto_2a

    .line 2019
    :cond_4c
    move-object v1, v4

    .line 2020
    const v0, -0x7c501aab

    .line 2021
    .line 2022
    .line 2023
    invoke-static {v0, v1, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 2024
    .line 2025
    .line 2026
    move-result-object v0

    .line 2027
    throw v0

    .line 2028
    :cond_4d
    move-object v1, v4

    .line 2029
    const v3, -0xdb29fd2

    .line 2030
    .line 2031
    .line 2032
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 2033
    .line 2034
    .line 2035
    invoke-virtual {v0}, La/qr10;->I0()La/k3t0;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v3

    .line 2039
    check-cast v3, La/i3t0;

    .line 2040
    .line 2041
    invoke-virtual {v3, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v3

    .line 2045
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v3

    .line 2049
    check-cast v3, La/c880;

    .line 2050
    .line 2051
    invoke-virtual {v0}, La/qr10;->I0()La/k3t0;

    .line 2052
    .line 2053
    .line 2054
    move-result-object v0

    .line 2055
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 2056
    .line 2057
    .line 2058
    move-result v4

    .line 2059
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 2060
    .line 2061
    .line 2062
    move-result-object v5

    .line 2063
    if-nez v4, :cond_4e

    .line 2064
    .line 2065
    if-ne v5, v2, :cond_4f

    .line 2066
    .line 2067
    :cond_4e
    new-instance v14, La/pf10;

    .line 2068
    .line 2069
    const/16 v20, 0x0

    .line 2070
    .line 2071
    const/16 v21, 0x15

    .line 2072
    .line 2073
    const/4 v15, 0x1

    .line 2074
    const-class v17, La/k3t0;

    .line 2075
    .line 2076
    const-string v18, "onAction"

    .line 2077
    .line 2078
    const-string v19, "onAction(Ljava/lang/Object;)V"

    .line 2079
    .line 2080
    move-object/from16 v16, v0

    .line 2081
    .line 2082
    invoke-direct/range {v14 .. v21}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2083
    .line 2084
    .line 2085
    invoke-virtual {v1, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 2086
    .line 2087
    .line 2088
    move-object v5, v14

    .line 2089
    :cond_4f
    check-cast v5, La/jhy;

    .line 2090
    .line 2091
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 2092
    .line 2093
    invoke-static {v13, v3, v5, v1, v8}, La/phu0;->v(La/mm40;La/c880;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 2094
    .line 2095
    .line 2096
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 2097
    .line 2098
    .line 2099
    goto :goto_2a

    .line 2100
    :cond_50
    move-object v1, v4

    .line 2101
    invoke-virtual {v1}, La/fet;->X()V

    .line 2102
    .line 2103
    .line 2104
    :goto_2a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2105
    .line 2106
    return-object v0

    .line 2107
    :pswitch_12
    check-cast v0, La/xdr;

    .line 2108
    .line 2109
    move-object/from16 v1, p1

    .line 2110
    .line 2111
    check-cast v1, La/g9z;

    .line 2112
    .line 2113
    move-object/from16 v2, p2

    .line 2114
    .line 2115
    check-cast v2, Ljava/lang/Integer;

    .line 2116
    .line 2117
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2118
    .line 2119
    .line 2120
    move-object/from16 v2, p3

    .line 2121
    .line 2122
    check-cast v2, La/fet;

    .line 2123
    .line 2124
    move-object/from16 v3, p4

    .line 2125
    .line 2126
    check-cast v3, Ljava/lang/Integer;

    .line 2127
    .line 2128
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 2129
    .line 2130
    .line 2131
    move-result v3

    .line 2132
    and-int/lit8 v4, v3, 0x6

    .line 2133
    .line 2134
    if-nez v4, :cond_52

    .line 2135
    .line 2136
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2137
    .line 2138
    .line 2139
    move-result v4

    .line 2140
    if-eqz v4, :cond_51

    .line 2141
    .line 2142
    goto :goto_2b

    .line 2143
    :cond_51
    move v10, v11

    .line 2144
    :goto_2b
    or-int/2addr v3, v10

    .line 2145
    :cond_52
    and-int/lit16 v4, v3, 0x83

    .line 2146
    .line 2147
    const/16 v5, 0x82

    .line 2148
    .line 2149
    if-eq v4, v5, :cond_53

    .line 2150
    .line 2151
    goto :goto_2c

    .line 2152
    :cond_53
    move v15, v8

    .line 2153
    :goto_2c
    and-int/lit8 v4, v3, 0x1

    .line 2154
    .line 2155
    invoke-virtual {v2, v4, v15}, La/fet;->U(IZ)Z

    .line 2156
    .line 2157
    .line 2158
    move-result v4

    .line 2159
    if-eqz v4, :cond_54

    .line 2160
    .line 2161
    and-int/lit8 v3, v3, 0xe

    .line 2162
    .line 2163
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2164
    .line 2165
    .line 2166
    move-result-object v3

    .line 2167
    invoke-interface {v0, v1, v2, v3}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2168
    .line 2169
    .line 2170
    goto :goto_2d

    .line 2171
    :cond_54
    invoke-virtual {v2}, La/fet;->X()V

    .line 2172
    .line 2173
    .line 2174
    :goto_2d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2175
    .line 2176
    return-object v0

    .line 2177
    :pswitch_13
    check-cast v0, La/fax;

    .line 2178
    .line 2179
    move-object/from16 v1, p1

    .line 2180
    .line 2181
    check-cast v1, La/y5d;

    .line 2182
    .line 2183
    move-object/from16 v2, p2

    .line 2184
    .line 2185
    check-cast v2, La/mm40;

    .line 2186
    .line 2187
    move-object/from16 v3, p3

    .line 2188
    .line 2189
    check-cast v3, La/fet;

    .line 2190
    .line 2191
    move-object/from16 v4, p4

    .line 2192
    .line 2193
    check-cast v4, Ljava/lang/Integer;

    .line 2194
    .line 2195
    invoke-static {v4, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 2196
    .line 2197
    .line 2198
    move-result v1

    .line 2199
    and-int/lit8 v4, v1, 0x30

    .line 2200
    .line 2201
    if-nez v4, :cond_56

    .line 2202
    .line 2203
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2204
    .line 2205
    .line 2206
    move-result v4

    .line 2207
    if-eqz v4, :cond_55

    .line 2208
    .line 2209
    goto :goto_2e

    .line 2210
    :cond_55
    const/16 v16, 0x10

    .line 2211
    .line 2212
    :goto_2e
    or-int v1, v1, v16

    .line 2213
    .line 2214
    :cond_56
    and-int/lit16 v4, v1, 0x91

    .line 2215
    .line 2216
    if-eq v4, v14, :cond_57

    .line 2217
    .line 2218
    move v8, v15

    .line 2219
    :cond_57
    and-int/2addr v1, v15

    .line 2220
    invoke-virtual {v3, v1, v8}, La/fet;->U(IZ)Z

    .line 2221
    .line 2222
    .line 2223
    move-result v1

    .line 2224
    if-eqz v1, :cond_58

    .line 2225
    .line 2226
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2227
    .line 2228
    const/high16 v1, 0x41400000    # 12.0f

    .line 2229
    .line 2230
    const/4 v4, 0x0

    .line 2231
    invoke-static {v2, v1, v4, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v1

    .line 2235
    const/high16 v2, 0x41000000    # 8.0f

    .line 2236
    .line 2237
    invoke-static {v1, v4, v2, v15}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v19

    .line 2241
    iget-object v0, v0, La/fax;->b:Ljava/lang/String;

    .line 2242
    .line 2243
    sget-object v26, La/j1t0;->a:La/qrq;

    .line 2244
    .line 2245
    sget-wide v23, La/qmk;->q:J

    .line 2246
    .line 2247
    sget-wide v32, La/qmk;->D:J

    .line 2248
    .line 2249
    new-instance v20, La/y9q0;

    .line 2250
    .line 2251
    const/16 v31, 0x0

    .line 2252
    .line 2253
    const v34, 0xfdffdd

    .line 2254
    .line 2255
    .line 2256
    const-wide/16 v21, 0x0

    .line 2257
    .line 2258
    const/16 v25, 0x0

    .line 2259
    .line 2260
    const-wide/16 v27, 0x0

    .line 2261
    .line 2262
    const/16 v29, 0x0

    .line 2263
    .line 2264
    const/16 v30, 0x0

    .line 2265
    .line 2266
    invoke-direct/range {v20 .. v34}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 2267
    .line 2268
    .line 2269
    sget-object v1, La/zaq0;->b:La/zfn;

    .line 2270
    .line 2271
    invoke-virtual {v3, v1}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v1

    .line 2275
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2276
    .line 2277
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2278
    .line 2279
    .line 2280
    move-result-wide v1

    .line 2281
    new-instance v4, La/f2q0;

    .line 2282
    .line 2283
    invoke-direct {v4, v7}, La/f2q0;-><init>(I)V

    .line 2284
    .line 2285
    .line 2286
    const/16 v41, 0x6180

    .line 2287
    .line 2288
    const v42, 0x1abf8

    .line 2289
    .line 2290
    .line 2291
    const/16 v22, 0x0

    .line 2292
    .line 2293
    const-wide/16 v23, 0x0

    .line 2294
    .line 2295
    const/16 v26, 0x0

    .line 2296
    .line 2297
    const/16 v27, 0x0

    .line 2298
    .line 2299
    const-wide/16 v28, 0x0

    .line 2300
    .line 2301
    const-wide/16 v31, 0x0

    .line 2302
    .line 2303
    const/16 v33, 0x2

    .line 2304
    .line 2305
    const/16 v34, 0x0

    .line 2306
    .line 2307
    const/16 v35, 0x1

    .line 2308
    .line 2309
    const/16 v36, 0x0

    .line 2310
    .line 2311
    const/16 v37, 0x0

    .line 2312
    .line 2313
    const/16 v40, 0x0

    .line 2314
    .line 2315
    move-object/from16 v18, v0

    .line 2316
    .line 2317
    move-object/from16 v39, v3

    .line 2318
    .line 2319
    move-object/from16 v30, v4

    .line 2320
    .line 2321
    move-object/from16 v38, v20

    .line 2322
    .line 2323
    move-wide/from16 v20, v1

    .line 2324
    .line 2325
    invoke-static/range {v18 .. v42}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2326
    .line 2327
    .line 2328
    goto :goto_2f

    .line 2329
    :cond_58
    move-object/from16 v39, v3

    .line 2330
    .line 2331
    invoke-virtual/range {v39 .. v39}, La/fet;->X()V

    .line 2332
    .line 2333
    .line 2334
    :goto_2f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2335
    .line 2336
    return-object v0

    .line 2337
    :pswitch_14
    check-cast v0, La/eax;

    .line 2338
    .line 2339
    move-object/from16 v1, p1

    .line 2340
    .line 2341
    check-cast v1, La/y5d;

    .line 2342
    .line 2343
    move-object/from16 v2, p2

    .line 2344
    .line 2345
    check-cast v2, La/mm40;

    .line 2346
    .line 2347
    move-object/from16 v4, p3

    .line 2348
    .line 2349
    check-cast v4, La/fet;

    .line 2350
    .line 2351
    move-object/from16 v5, p4

    .line 2352
    .line 2353
    check-cast v5, Ljava/lang/Integer;

    .line 2354
    .line 2355
    invoke-static {v5, v1, v2}, La/dw9;->d(Ljava/lang/Integer;La/y5d;La/mm40;)I

    .line 2356
    .line 2357
    .line 2358
    move-result v1

    .line 2359
    and-int/lit8 v5, v1, 0x30

    .line 2360
    .line 2361
    if-nez v5, :cond_5a

    .line 2362
    .line 2363
    invoke-virtual {v4, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 2364
    .line 2365
    .line 2366
    move-result v5

    .line 2367
    if-eqz v5, :cond_59

    .line 2368
    .line 2369
    goto :goto_30

    .line 2370
    :cond_59
    const/16 v16, 0x10

    .line 2371
    .line 2372
    :goto_30
    or-int v1, v1, v16

    .line 2373
    .line 2374
    :cond_5a
    and-int/lit16 v5, v1, 0x91

    .line 2375
    .line 2376
    if-eq v5, v14, :cond_5b

    .line 2377
    .line 2378
    move v5, v15

    .line 2379
    goto :goto_31

    .line 2380
    :cond_5b
    move v5, v8

    .line 2381
    :goto_31
    and-int/2addr v1, v15

    .line 2382
    invoke-virtual {v4, v1, v5}, La/fet;->U(IZ)Z

    .line 2383
    .line 2384
    .line 2385
    move-result v1

    .line 2386
    if-eqz v1, :cond_61

    .line 2387
    .line 2388
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2389
    .line 2390
    const/high16 v1, 0x41400000    # 12.0f

    .line 2391
    .line 2392
    const/high16 v5, 0x41000000    # 8.0f

    .line 2393
    .line 2394
    invoke-static {v2, v1, v5}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v1

    .line 2398
    new-instance v2, La/qw3;

    .line 2399
    .line 2400
    new-instance v7, La/jf4;

    .line 2401
    .line 2402
    move/from16 v9, v18

    .line 2403
    .line 2404
    invoke-direct {v7, v9}, La/jf4;-><init>(B)V

    .line 2405
    .line 2406
    .line 2407
    invoke-direct {v2, v5, v15, v7}, La/qw3;-><init>(FZLa/rw3;)V

    .line 2408
    .line 2409
    .line 2410
    sget-object v5, La/gqw0;->j:La/yx7;

    .line 2411
    .line 2412
    invoke-static {v2, v5, v4, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v2

    .line 2416
    iget-wide v7, v4, La/fet;->T:J

    .line 2417
    .line 2418
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 2419
    .line 2420
    .line 2421
    move-result v5

    .line 2422
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v7

    .line 2426
    invoke-static {v4, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 2427
    .line 2428
    .line 2429
    move-result-object v1

    .line 2430
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 2431
    .line 2432
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2433
    .line 2434
    .line 2435
    invoke-virtual {v4}, La/fet;->i0()V

    .line 2436
    .line 2437
    .line 2438
    iget-boolean v8, v4, La/fet;->S:Z

    .line 2439
    .line 2440
    if-eqz v8, :cond_5c

    .line 2441
    .line 2442
    invoke-virtual {v4, v6}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 2443
    .line 2444
    .line 2445
    goto :goto_32

    .line 2446
    :cond_5c
    invoke-virtual {v4}, La/fet;->r0()V

    .line 2447
    .line 2448
    .line 2449
    :goto_32
    sget-object v6, La/gqw0;->x:La/shd;

    .line 2450
    .line 2451
    invoke-static {v4, v2, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2452
    .line 2453
    .line 2454
    sget-object v2, La/gqw0;->w:La/shd;

    .line 2455
    .line 2456
    invoke-static {v4, v7, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2457
    .line 2458
    .line 2459
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v2

    .line 2463
    sget-object v5, La/gqw0;->y:La/shd;

    .line 2464
    .line 2465
    invoke-static {v4, v2, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2466
    .line 2467
    .line 2468
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 2469
    .line 2470
    .line 2471
    sget-object v2, La/gqw0;->v:La/shd;

    .line 2472
    .line 2473
    invoke-static {v4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 2474
    .line 2475
    .line 2476
    float-to-double v1, v3

    .line 2477
    const-wide/16 v5, 0x0

    .line 2478
    .line 2479
    cmpl-double v1, v1, v5

    .line 2480
    .line 2481
    const-string v2, "invalid weight; must be greater than zero"

    .line 2482
    .line 2483
    if-lez v1, :cond_5d

    .line 2484
    .line 2485
    goto :goto_33

    .line 2486
    :cond_5d
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 2487
    .line 2488
    .line 2489
    :goto_33
    new-instance v1, La/x7z;

    .line 2490
    .line 2491
    const v7, 0x7f7fffff    # Float.MAX_VALUE

    .line 2492
    .line 2493
    .line 2494
    cmpl-float v8, v3, v7

    .line 2495
    .line 2496
    if-lez v8, :cond_5e

    .line 2497
    .line 2498
    move v8, v7

    .line 2499
    goto :goto_34

    .line 2500
    :cond_5e
    move v8, v3

    .line 2501
    :goto_34
    invoke-direct {v1, v8, v15}, La/x7z;-><init>(FZ)V

    .line 2502
    .line 2503
    .line 2504
    iget-object v8, v0, La/eax;->a:Ljava/lang/String;

    .line 2505
    .line 2506
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v39

    .line 2510
    sget-object v9, La/zaq0;->b:La/zfn;

    .line 2511
    .line 2512
    invoke-virtual {v4, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2513
    .line 2514
    .line 2515
    move-result-object v10

    .line 2516
    check-cast v10, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2517
    .line 2518
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2519
    .line 2520
    .line 2521
    move-result-wide v21

    .line 2522
    new-instance v10, La/f2q0;

    .line 2523
    .line 2524
    const/4 v11, 0x5

    .line 2525
    invoke-direct {v10, v11}, La/f2q0;-><init>(I)V

    .line 2526
    .line 2527
    .line 2528
    const/16 v42, 0x6180

    .line 2529
    .line 2530
    const v43, 0x1abf8

    .line 2531
    .line 2532
    .line 2533
    const/16 v23, 0x0

    .line 2534
    .line 2535
    const-wide/16 v24, 0x0

    .line 2536
    .line 2537
    const/16 v26, 0x0

    .line 2538
    .line 2539
    const/16 v27, 0x0

    .line 2540
    .line 2541
    const/16 v28, 0x0

    .line 2542
    .line 2543
    const-wide/16 v29, 0x0

    .line 2544
    .line 2545
    const-wide/16 v32, 0x0

    .line 2546
    .line 2547
    const/16 v34, 0x2

    .line 2548
    .line 2549
    const/16 v35, 0x0

    .line 2550
    .line 2551
    const/16 v36, 0x1

    .line 2552
    .line 2553
    const/16 v37, 0x0

    .line 2554
    .line 2555
    const/16 v38, 0x0

    .line 2556
    .line 2557
    const/16 v41, 0x0

    .line 2558
    .line 2559
    move-object/from16 v20, v1

    .line 2560
    .line 2561
    move-object/from16 v40, v4

    .line 2562
    .line 2563
    move-object/from16 v19, v8

    .line 2564
    .line 2565
    move-object/from16 v31, v10

    .line 2566
    .line 2567
    invoke-static/range {v19 .. v43}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2568
    .line 2569
    .line 2570
    move-object/from16 v1, v40

    .line 2571
    .line 2572
    float-to-double v10, v3

    .line 2573
    cmpl-double v4, v10, v5

    .line 2574
    .line 2575
    if-lez v4, :cond_5f

    .line 2576
    .line 2577
    goto :goto_35

    .line 2578
    :cond_5f
    invoke-static {v2}, La/vcx;->a(Ljava/lang/String;)V

    .line 2579
    .line 2580
    .line 2581
    :goto_35
    new-instance v2, La/x7z;

    .line 2582
    .line 2583
    cmpl-float v4, v3, v7

    .line 2584
    .line 2585
    if-lez v4, :cond_60

    .line 2586
    .line 2587
    move v3, v7

    .line 2588
    :cond_60
    invoke-direct {v2, v3, v15}, La/x7z;-><init>(FZ)V

    .line 2589
    .line 2590
    .line 2591
    iget-object v0, v0, La/eax;->b:Ljava/lang/String;

    .line 2592
    .line 2593
    invoke-static {}, La/g1t0;->a()La/y9q0;

    .line 2594
    .line 2595
    .line 2596
    move-result-object v39

    .line 2597
    invoke-virtual {v1, v9}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 2598
    .line 2599
    .line 2600
    move-result-object v3

    .line 2601
    check-cast v3, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 2602
    .line 2603
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 2604
    .line 2605
    .line 2606
    move-result-wide v21

    .line 2607
    new-instance v3, La/f2q0;

    .line 2608
    .line 2609
    invoke-direct {v3, v12}, La/f2q0;-><init>(I)V

    .line 2610
    .line 2611
    .line 2612
    const/16 v42, 0x6180

    .line 2613
    .line 2614
    const v43, 0x1abf8

    .line 2615
    .line 2616
    .line 2617
    const/16 v23, 0x0

    .line 2618
    .line 2619
    const-wide/16 v24, 0x0

    .line 2620
    .line 2621
    const/16 v26, 0x0

    .line 2622
    .line 2623
    const/16 v27, 0x0

    .line 2624
    .line 2625
    const/16 v28, 0x0

    .line 2626
    .line 2627
    const-wide/16 v29, 0x0

    .line 2628
    .line 2629
    const-wide/16 v32, 0x0

    .line 2630
    .line 2631
    const/16 v34, 0x2

    .line 2632
    .line 2633
    const/16 v35, 0x0

    .line 2634
    .line 2635
    const/16 v36, 0x1

    .line 2636
    .line 2637
    const/16 v37, 0x0

    .line 2638
    .line 2639
    const/16 v38, 0x0

    .line 2640
    .line 2641
    const/16 v41, 0x0

    .line 2642
    .line 2643
    move-object/from16 v19, v0

    .line 2644
    .line 2645
    move-object/from16 v40, v1

    .line 2646
    .line 2647
    move-object/from16 v20, v2

    .line 2648
    .line 2649
    move-object/from16 v31, v3

    .line 2650
    .line 2651
    invoke-static/range {v19 .. v43}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 2652
    .line 2653
    .line 2654
    invoke-virtual {v1, v15}, La/fet;->r(Z)V

    .line 2655
    .line 2656
    .line 2657
    goto :goto_36

    .line 2658
    :cond_61
    move-object v1, v4

    .line 2659
    invoke-virtual {v1}, La/fet;->X()V

    .line 2660
    .line 2661
    .line 2662
    :goto_36
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2663
    .line 2664
    return-object v0

    .line 2665
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
