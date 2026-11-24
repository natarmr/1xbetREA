.class public abstract La/b9m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/ugg0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    sget-object v0, La/qmk;->i:La/zcl;

    .line 2
    .line 3
    sget-object v1, La/vgg0;->a:La/ugg0;

    .line 4
    .line 5
    new-instance v1, La/ugg0;

    .line 6
    .line 7
    invoke-direct {v1, v0, v0, v0, v0}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 8
    .line 9
    .line 10
    sput-object v1, La/b9m;->a:La/ugg0;

    .line 11
    .line 12
    return-void
.end method

.method public static final a(JLa/y8m;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 28

    .line 1
    move-wide/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v11, p4

    .line 8
    .line 9
    move/from16 v0, p5

    .line 10
    .line 11
    iget-object v14, v3, La/y8m;->c:La/n0x;

    .line 12
    .line 13
    iget-object v15, v3, La/y8m;->d:Ljava/lang/String;

    .line 14
    .line 15
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    const v5, 0x480ba9ef

    .line 19
    .line 20
    .line 21
    invoke-virtual {v11, v5}, La/fet;->g0(I)La/fet;

    .line 22
    .line 23
    .line 24
    and-int/lit8 v5, v0, 0x6

    .line 25
    .line 26
    if-nez v5, :cond_1

    .line 27
    .line 28
    invoke-virtual {v11, v1, v2}, La/fet;->f(J)Z

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    const/4 v5, 0x4

    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v5, 0x2

    .line 37
    :goto_0
    or-int/2addr v5, v0

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    move v5, v0

    .line 40
    :goto_1
    and-int/lit8 v6, v0, 0x30

    .line 41
    .line 42
    if-nez v6, :cond_3

    .line 43
    .line 44
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x20

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v6, 0x10

    .line 54
    .line 55
    :goto_2
    or-int/2addr v5, v6

    .line 56
    :cond_3
    and-int/lit16 v6, v0, 0x180

    .line 57
    .line 58
    const/16 v8, 0x100

    .line 59
    .line 60
    if-nez v6, :cond_5

    .line 61
    .line 62
    invoke-virtual {v11, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    move v6, v8

    .line 69
    goto :goto_3

    .line 70
    :cond_4
    const/16 v6, 0x80

    .line 71
    .line 72
    :goto_3
    or-int/2addr v5, v6

    .line 73
    :cond_5
    and-int/lit16 v6, v5, 0x93

    .line 74
    .line 75
    const/16 v9, 0x92

    .line 76
    .line 77
    const/4 v12, 0x0

    .line 78
    if-eq v6, v9, :cond_6

    .line 79
    .line 80
    const/4 v6, 0x1

    .line 81
    goto :goto_4

    .line 82
    :cond_6
    move v6, v12

    .line 83
    :goto_4
    and-int/lit8 v9, v5, 0x1

    .line 84
    .line 85
    invoke-virtual {v11, v9, v6}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-eqz v6, :cond_11

    .line 90
    .line 91
    sget-object v6, La/gqw0;->a:La/zx7;

    .line 92
    .line 93
    invoke-static {v6, v12}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    iget-wide v12, v11, La/fet;->T:J

    .line 98
    .line 99
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 100
    .line 101
    .line 102
    move-result v12

    .line 103
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    move-object/from16 v17, v6

    .line 108
    .line 109
    sget-object v6, La/jm40;->b:La/jm40;

    .line 110
    .line 111
    invoke-static {v11, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 112
    .line 113
    .line 114
    move-result-object v10

    .line 115
    sget-object v19, La/mkd;->c0:La/gqw0;

    .line 116
    .line 117
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v11}, La/fet;->i0()V

    .line 121
    .line 122
    .line 123
    iget-boolean v7, v11, La/fet;->S:Z

    .line 124
    .line 125
    move/from16 v20, v7

    .line 126
    .line 127
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 128
    .line 129
    if-eqz v20, :cond_7

    .line 130
    .line 131
    invoke-virtual {v11, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 132
    .line 133
    .line 134
    :goto_5
    move-object/from16 v20, v7

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_7
    invoke-virtual {v11}, La/fet;->r0()V

    .line 138
    .line 139
    .line 140
    goto :goto_5

    .line 141
    :goto_6
    sget-object v7, La/gqw0;->x:La/shd;

    .line 142
    .line 143
    invoke-static {v11, v9, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 144
    .line 145
    .line 146
    sget-object v9, La/gqw0;->w:La/shd;

    .line 147
    .line 148
    invoke-static {v11, v13, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 152
    .line 153
    .line 154
    move-result-object v12

    .line 155
    sget-object v13, La/gqw0;->y:La/shd;

    .line 156
    .line 157
    invoke-static {v11, v12, v13}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 161
    .line 162
    .line 163
    sget-object v12, La/gqw0;->v:La/shd;

    .line 164
    .line 165
    invoke-static {v11, v10, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    sget-object v10, La/qmk;->a:La/zcl;

    .line 169
    .line 170
    const/high16 v10, 0x42800000    # 64.0f

    .line 171
    .line 172
    invoke-static {v6, v10}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 173
    .line 174
    .line 175
    move-result-object v21

    .line 176
    and-int/lit16 v10, v5, 0x380

    .line 177
    .line 178
    if-ne v10, v8, :cond_8

    .line 179
    .line 180
    const/4 v8, 0x1

    .line 181
    goto :goto_7

    .line 182
    :cond_8
    const/4 v8, 0x0

    .line 183
    :goto_7
    and-int/lit8 v5, v5, 0x70

    .line 184
    .line 185
    const/16 v10, 0x20

    .line 186
    .line 187
    if-ne v5, v10, :cond_9

    .line 188
    .line 189
    const/4 v5, 0x1

    .line 190
    goto :goto_8

    .line 191
    :cond_9
    const/4 v5, 0x0

    .line 192
    :goto_8
    or-int/2addr v5, v8

    .line 193
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v8

    .line 197
    sget-object v10, La/ukd;->a:La/cl5;

    .line 198
    .line 199
    if-nez v5, :cond_b

    .line 200
    .line 201
    if-ne v8, v10, :cond_a

    .line 202
    .line 203
    goto :goto_9

    .line 204
    :cond_a
    const/4 v5, 0x1

    .line 205
    goto :goto_a

    .line 206
    :cond_b
    :goto_9
    new-instance v8, La/z8m;

    .line 207
    .line 208
    const/4 v5, 0x1

    .line 209
    invoke-direct {v8, v4, v3, v5}, La/z8m;-><init>(Lkotlin/jvm/functions/Function1;La/y8m;B)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v11, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    :goto_a
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 216
    .line 217
    move-object/from16 v18, v12

    .line 218
    .line 219
    const/16 v12, 0x6180

    .line 220
    .line 221
    move-object/from16 v19, v13

    .line 222
    .line 223
    const/4 v13, 0x5

    .line 224
    move-object/from16 v22, v6

    .line 225
    .line 226
    const/4 v6, 0x0

    .line 227
    move-object/from16 v23, v7

    .line 228
    .line 229
    const/4 v7, 0x0

    .line 230
    move-object/from16 v24, v10

    .line 231
    .line 232
    move-object v10, v8

    .line 233
    const/4 v8, 0x0

    .line 234
    move-object/from16 v25, v9

    .line 235
    .line 236
    const/4 v9, 0x0

    .line 237
    move-object/from16 v16, v14

    .line 238
    .line 239
    move-object/from16 v0, v17

    .line 240
    .line 241
    move-object/from16 v1, v18

    .line 242
    .line 243
    move-object/from16 v3, v19

    .line 244
    .line 245
    move-object/from16 v27, v20

    .line 246
    .line 247
    move-object/from16 v5, v21

    .line 248
    .line 249
    move-object/from16 v26, v22

    .line 250
    .line 251
    move-object/from16 v4, v23

    .line 252
    .line 253
    move-object/from16 v14, v25

    .line 254
    .line 255
    const/4 v2, 0x0

    .line 256
    invoke-static/range {v5 .. v13}, La/phu0;->F(La/mm40;La/ymx;La/d6x;ZLa/gy40;Lkotlin/jvm/functions/Function0;La/fet;II)La/mm40;

    .line 257
    .line 258
    .line 259
    move-result-object v5

    .line 260
    new-instance v6, Ljava/lang/StringBuilder;

    .line 261
    .line 262
    const-string v7, "TAG_DS_CYBER_LOGO_COLLECTION_ITEM"

    .line 263
    .line 264
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 268
    .line 269
    .line 270
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    invoke-static {v5, v6}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 275
    .line 276
    .line 277
    move-result-object v5

    .line 278
    sget-object v6, La/uc9;->c:La/mw3;

    .line 279
    .line 280
    sget-object v7, La/gqw0;->m:La/xx7;

    .line 281
    .line 282
    invoke-static {v6, v7, v11, v2}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 283
    .line 284
    .line 285
    move-result-object v6

    .line 286
    iget-wide v7, v11, La/fet;->T:J

    .line 287
    .line 288
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 289
    .line 290
    .line 291
    move-result v7

    .line 292
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    invoke-static {v11, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 297
    .line 298
    .line 299
    move-result-object v5

    .line 300
    invoke-virtual {v11}, La/fet;->i0()V

    .line 301
    .line 302
    .line 303
    iget-boolean v9, v11, La/fet;->S:Z

    .line 304
    .line 305
    if-eqz v9, :cond_c

    .line 306
    .line 307
    move-object/from16 v9, v27

    .line 308
    .line 309
    invoke-virtual {v11, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 310
    .line 311
    .line 312
    goto :goto_b

    .line 313
    :cond_c
    move-object/from16 v9, v27

    .line 314
    .line 315
    invoke-virtual {v11}, La/fet;->r0()V

    .line 316
    .line 317
    .line 318
    :goto_b
    invoke-static {v11, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v11, v8, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 322
    .line 323
    .line 324
    invoke-static {v7, v11, v3, v11}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v11, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 328
    .line 329
    .line 330
    move-object/from16 v6, v26

    .line 331
    .line 332
    const/high16 v5, 0x42800000    # 64.0f

    .line 333
    .line 334
    invoke-static {v6, v5}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 335
    .line 336
    .line 337
    move-result-object v5

    .line 338
    invoke-static {v0, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    iget-wide v7, v11, La/fet;->T:J

    .line 343
    .line 344
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 345
    .line 346
    .line 347
    move-result v7

    .line 348
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 349
    .line 350
    .line 351
    move-result-object v8

    .line 352
    invoke-static {v11, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 353
    .line 354
    .line 355
    move-result-object v5

    .line 356
    invoke-virtual {v11}, La/fet;->i0()V

    .line 357
    .line 358
    .line 359
    iget-boolean v10, v11, La/fet;->S:Z

    .line 360
    .line 361
    if-eqz v10, :cond_d

    .line 362
    .line 363
    invoke-virtual {v11, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 364
    .line 365
    .line 366
    goto :goto_c

    .line 367
    :cond_d
    invoke-virtual {v11}, La/fet;->r0()V

    .line 368
    .line 369
    .line 370
    :goto_c
    invoke-static {v11, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 371
    .line 372
    .line 373
    invoke-static {v11, v8, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 374
    .line 375
    .line 376
    invoke-static {v7, v11, v3, v11}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 377
    .line 378
    .line 379
    invoke-static {v11, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 380
    .line 381
    .line 382
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 383
    .line 384
    sget-object v5, La/b9m;->a:La/ugg0;

    .line 385
    .line 386
    move-wide/from16 v7, p0

    .line 387
    .line 388
    invoke-static {v0, v7, v8, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    sget-object v5, La/gqw0;->e:La/zx7;

    .line 393
    .line 394
    invoke-static {v5, v2}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 395
    .line 396
    .line 397
    move-result-object v5

    .line 398
    iget-wide v12, v11, La/fet;->T:J

    .line 399
    .line 400
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 405
    .line 406
    .line 407
    move-result-object v12

    .line 408
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v11}, La/fet;->i0()V

    .line 413
    .line 414
    .line 415
    iget-boolean v13, v11, La/fet;->S:Z

    .line 416
    .line 417
    if-eqz v13, :cond_e

    .line 418
    .line 419
    invoke-virtual {v11, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 420
    .line 421
    .line 422
    goto :goto_d

    .line 423
    :cond_e
    invoke-virtual {v11}, La/fet;->r0()V

    .line 424
    .line 425
    .line 426
    :goto_d
    invoke-static {v11, v5, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 427
    .line 428
    .line 429
    invoke-static {v11, v12, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 430
    .line 431
    .line 432
    invoke-static {v10, v11, v3, v11}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 433
    .line 434
    .line 435
    invoke-static {v11, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    const/high16 v1, 0x42000000    # 32.0f

    .line 443
    .line 444
    const-string v3, "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_IMAGE"

    .line 445
    .line 446
    move-object/from16 v4, v24

    .line 447
    .line 448
    if-ne v0, v4, :cond_f

    .line 449
    .line 450
    const/high16 v0, 0x42100000    # 36.0f

    .line 451
    .line 452
    invoke-static {v6, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 453
    .line 454
    .line 455
    move-result-object v0

    .line 456
    invoke-static {v0, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    invoke-virtual {v11, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 461
    .line 462
    .line 463
    :cond_f
    move-object v5, v0

    .line 464
    check-cast v5, La/mm40;

    .line 465
    .line 466
    invoke-static {v6, v1}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-static {v0, v3}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 471
    .line 472
    .line 473
    move-result-object v6

    .line 474
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 475
    .line 476
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 481
    .line 482
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary60-0d7_KjU()J

    .line 483
    .line 484
    .line 485
    move-result-wide v0

    .line 486
    new-instance v9, La/y3d;

    .line 487
    .line 488
    invoke-direct {v9, v0, v1}, La/y3d;-><init>(J)V

    .line 489
    .line 490
    .line 491
    sget-object v12, La/gqw0;->B:La/pge;

    .line 492
    .line 493
    move-object v0, v15

    .line 494
    const v15, 0xc00006

    .line 495
    .line 496
    .line 497
    move-object/from16 v7, v16

    .line 498
    .line 499
    const/16 v16, 0x160

    .line 500
    .line 501
    const v8, 0x7f08082c

    .line 502
    .line 503
    .line 504
    const/4 v10, 0x0

    .line 505
    const/4 v11, 0x0

    .line 506
    const/4 v13, 0x0

    .line 507
    move-object/from16 v14, p4

    .line 508
    .line 509
    invoke-static/range {v5 .. v16}, La/rq8;->b(La/mm40;La/mm40;La/o0x;ILa/y3d;La/y3d;La/u12;La/qge;La/a4x;La/fet;II)V

    .line 510
    .line 511
    .line 512
    move-object v11, v14

    .line 513
    const/4 v5, 0x1

    .line 514
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 515
    .line 516
    .line 517
    const v1, -0x19f4bb2f

    .line 518
    .line 519
    .line 520
    invoke-virtual {v11, v1}, La/fet;->e0(I)V

    .line 521
    .line 522
    .line 523
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 527
    .line 528
    .line 529
    invoke-static {v0, v11, v2}, La/b9m;->b(Ljava/lang/String;La/fet;I)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 533
    .line 534
    .line 535
    move-object/from16 v3, p2

    .line 536
    .line 537
    iget-boolean v0, v3, La/y8m;->e:Z

    .line 538
    .line 539
    if-eqz v0, :cond_10

    .line 540
    .line 541
    const v0, 0x6457d3ec

    .line 542
    .line 543
    .line 544
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 545
    .line 546
    .line 547
    iget-object v0, v3, La/y8m;->f:La/d4d;

    .line 548
    .line 549
    const/4 v1, 0x6

    .line 550
    invoke-static {v0, v11, v1}, La/n4c;->k(La/d4d;La/fet;I)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 554
    .line 555
    .line 556
    goto :goto_e

    .line 557
    :cond_10
    const v0, 0x6459b82d

    .line 558
    .line 559
    .line 560
    invoke-virtual {v11, v0}, La/fet;->e0(I)V

    .line 561
    .line 562
    .line 563
    invoke-virtual {v11, v2}, La/fet;->r(Z)V

    .line 564
    .line 565
    .line 566
    :goto_e
    invoke-virtual {v11, v5}, La/fet;->r(Z)V

    .line 567
    .line 568
    .line 569
    goto :goto_f

    .line 570
    :cond_11
    invoke-virtual {v11}, La/fet;->X()V

    .line 571
    .line 572
    .line 573
    :goto_f
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 574
    .line 575
    .line 576
    move-result-object v7

    .line 577
    if-eqz v7, :cond_12

    .line 578
    .line 579
    new-instance v0, La/xhh;

    .line 580
    .line 581
    const/4 v6, 0x2

    .line 582
    move-wide/from16 v1, p0

    .line 583
    .line 584
    move-object/from16 v4, p3

    .line 585
    .line 586
    move/from16 v5, p5

    .line 587
    .line 588
    invoke-direct/range {v0 .. v6}, La/xhh;-><init>(JLjava/lang/Object;La/wdr;IB)V

    .line 589
    .line 590
    .line 591
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 592
    .line 593
    :cond_12
    return-void
.end method

.method public static final b(Ljava/lang/String;La/fet;I)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const v2, -0xb7a91cc

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1, v2}, La/fet;->g0(I)La/fet;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x2

    .line 16
    if-eqz v2, :cond_0

    .line 17
    .line 18
    const/4 v2, 0x4

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    move v2, v3

    .line 21
    :goto_0
    or-int v2, p2, v2

    .line 22
    .line 23
    and-int/lit8 v4, v2, 0x3

    .line 24
    .line 25
    if-eq v4, v3, :cond_1

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v3, 0x0

    .line 30
    :goto_1
    and-int/lit8 v4, v2, 0x1

    .line 31
    .line 32
    invoke-virtual {v1, v4, v3}, La/fet;->U(IZ)Z

    .line 33
    .line 34
    .line 35
    move-result v3

    .line 36
    if-eqz v3, :cond_2

    .line 37
    .line 38
    sget-object v3, La/qmk;->a:La/zcl;

    .line 39
    .line 40
    const/4 v8, 0x0

    .line 41
    const/16 v9, 0xd

    .line 42
    .line 43
    sget-object v4, La/jm40;->b:La/jm40;

    .line 44
    .line 45
    const/4 v5, 0x0

    .line 46
    const/high16 v6, 0x40800000    # 4.0f

    .line 47
    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-static/range {v4 .. v9}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/high16 v4, 0x41c00000    # 24.0f

    .line 54
    .line 55
    invoke-static {v3, v4}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    const/high16 v4, 0x3f800000    # 1.0f

    .line 60
    .line 61
    invoke-static {v3, v4}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const-string v4, "TAG_DS_CYBER_LOGO_COLLECTION_ITEM_LABEL"

    .line 66
    .line 67
    invoke-static {v3, v4}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    sget-object v4, La/zaq0;->b:La/zfn;

    .line 72
    .line 73
    invoke-virtual {v1, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    check-cast v4, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 78
    .line 79
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 80
    .line 81
    .line 82
    move-result-wide v4

    .line 83
    sget-object v6, La/j1t0;->e:La/zfn;

    .line 84
    .line 85
    invoke-virtual {v1, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    check-cast v6, La/g1t0;

    .line 90
    .line 91
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    invoke-static {}, La/g1t0;->e()La/y9q0;

    .line 95
    .line 96
    .line 97
    move-result-object v20

    .line 98
    new-instance v12, La/f2q0;

    .line 99
    .line 100
    const/4 v6, 0x3

    .line 101
    invoke-direct {v12, v6}, La/f2q0;-><init>(I)V

    .line 102
    .line 103
    .line 104
    and-int/lit8 v22, v2, 0xe

    .line 105
    .line 106
    const/16 v23, 0x6180

    .line 107
    .line 108
    const v24, 0x1abf8

    .line 109
    .line 110
    .line 111
    move-object v1, v3

    .line 112
    move-wide v2, v4

    .line 113
    const/4 v4, 0x0

    .line 114
    const-wide/16 v5, 0x0

    .line 115
    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v8, 0x0

    .line 118
    const/4 v9, 0x0

    .line 119
    const-wide/16 v10, 0x0

    .line 120
    .line 121
    const-wide/16 v13, 0x0

    .line 122
    .line 123
    const/4 v15, 0x2

    .line 124
    const/16 v16, 0x0

    .line 125
    .line 126
    const/16 v17, 0x2

    .line 127
    .line 128
    const/16 v18, 0x0

    .line 129
    .line 130
    const/16 v19, 0x0

    .line 131
    .line 132
    move-object/from16 v21, p1

    .line 133
    .line 134
    invoke-static/range {v0 .. v24}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    invoke-virtual/range {p1 .. p1}, La/fet;->X()V

    .line 139
    .line 140
    .line 141
    :goto_2
    invoke-virtual/range {p1 .. p1}, La/fet;->u()La/yfe0;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    if-eqz v1, :cond_3

    .line 146
    .line 147
    new-instance v2, La/hxk;

    .line 148
    .line 149
    const/16 v3, 0x8

    .line 150
    .line 151
    move/from16 v4, p2

    .line 152
    .line 153
    invoke-direct {v2, v3, v4, v0}, La/hxk;-><init>(BILjava/lang/String;)V

    .line 154
    .line 155
    .line 156
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 157
    .line 158
    :cond_3
    return-void
.end method
