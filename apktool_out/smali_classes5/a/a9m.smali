.class public final La/a9m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;JLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/a9m;->a:B

    iput-object p1, p0, La/a9m;->d:Ljava/util/List;

    iput-wide p2, p0, La/a9m;->b:J

    iput-object p4, p0, La/a9m;->c:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a9m;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/a9m;->d:Ljava/util/List;

    .line 6
    .line 7
    const/16 v3, 0x92

    .line 8
    .line 9
    const/4 v6, 0x4

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x1

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    sget-object v1, La/gqw0;->v:La/shd;

    .line 16
    .line 17
    sget-object v10, La/gqw0;->y:La/shd;

    .line 18
    .line 19
    sget-object v11, La/gqw0;->w:La/shd;

    .line 20
    .line 21
    sget-object v12, La/gqw0;->x:La/shd;

    .line 22
    .line 23
    sget-object v13, La/jd8;->n:La/ljc;

    .line 24
    .line 25
    move-object/from16 v14, p1

    .line 26
    .line 27
    check-cast v14, La/g9z;

    .line 28
    .line 29
    move-object/from16 v15, p2

    .line 30
    .line 31
    check-cast v15, Ljava/lang/Number;

    .line 32
    .line 33
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v15

    .line 37
    move-object/from16 v4, p3

    .line 38
    .line 39
    check-cast v4, La/fet;

    .line 40
    .line 41
    move-object/from16 v17, p4

    .line 42
    .line 43
    check-cast v17, Ljava/lang/Number;

    .line 44
    .line 45
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->intValue()I

    .line 46
    .line 47
    .line 48
    move-result v17

    .line 49
    sget-object v5, La/gqw0;->a:La/zx7;

    .line 50
    .line 51
    and-int/lit8 v19, v17, 0x6

    .line 52
    .line 53
    if-nez v19, :cond_1

    .line 54
    .line 55
    invoke-virtual {v4, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v14

    .line 59
    if-eqz v14, :cond_0

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_0
    const/4 v6, 0x2

    .line 63
    :goto_0
    or-int v6, v17, v6

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_1
    move/from16 v6, v17

    .line 67
    .line 68
    :goto_1
    and-int/lit8 v14, v17, 0x30

    .line 69
    .line 70
    if-nez v14, :cond_3

    .line 71
    .line 72
    invoke-virtual {v4, v15}, La/fet;->e(I)Z

    .line 73
    .line 74
    .line 75
    move-result v14

    .line 76
    if-eqz v14, :cond_2

    .line 77
    .line 78
    const/16 v16, 0x20

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_2
    const/16 v16, 0x10

    .line 82
    .line 83
    :goto_2
    or-int v6, v6, v16

    .line 84
    .line 85
    :cond_3
    and-int/lit16 v14, v6, 0x93

    .line 86
    .line 87
    if-eq v14, v3, :cond_4

    .line 88
    .line 89
    move v3, v8

    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move v3, v7

    .line 92
    :goto_3
    and-int/2addr v6, v8

    .line 93
    invoke-virtual {v4, v6, v3}, La/fet;->U(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    if-eqz v3, :cond_19

    .line 98
    .line 99
    invoke-interface {v2, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    check-cast v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;

    .line 104
    .line 105
    const v3, 0x1ad51ccd

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4, v3}, La/fet;->e0(I)V

    .line 109
    .line 110
    .line 111
    if-eqz v2, :cond_18

    .line 112
    .line 113
    instance-of v3, v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditTitleTjUiModel;

    .line 114
    .line 115
    sget-object v16, La/jm40;->b:La/jm40;

    .line 116
    .line 117
    if-eqz v3, :cond_5

    .line 118
    .line 119
    const v0, 0x1ad37b06

    .line 120
    .line 121
    .line 122
    invoke-virtual {v4, v0}, La/fet;->e0(I)V

    .line 123
    .line 124
    .line 125
    sget-object v0, La/qmk;->a:La/zcl;

    .line 126
    .line 127
    const/16 v18, 0x0

    .line 128
    .line 129
    const/16 v19, 0xd

    .line 130
    .line 131
    const/4 v15, 0x0

    .line 132
    move-object/from16 v14, v16

    .line 133
    .line 134
    const/high16 v16, 0x41000000    # 8.0f

    .line 135
    .line 136
    const/16 v17, 0x0

    .line 137
    .line 138
    invoke-static/range {v14 .. v19}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v16

    .line 142
    new-instance v17, La/hjm;

    .line 143
    .line 144
    check-cast v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditTitleTjUiModel;

    .line 145
    .line 146
    iget v0, v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditTitleTjUiModel;->a:I

    .line 147
    .line 148
    invoke-static {v0, v4}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v18

    .line 152
    new-instance v0, La/ojm;

    .line 153
    .line 154
    const/16 v1, 0x7f

    .line 155
    .line 156
    invoke-direct {v0, v1}, La/ojm;-><init>(I)V

    .line 157
    .line 158
    .line 159
    const/16 v29, 0x0

    .line 160
    .line 161
    const/16 v30, 0x1ffc

    .line 162
    .line 163
    const/16 v20, 0x0

    .line 164
    .line 165
    const/16 v21, 0x0

    .line 166
    .line 167
    const/16 v22, 0x0

    .line 168
    .line 169
    const/16 v23, 0x0

    .line 170
    .line 171
    const/16 v24, 0x0

    .line 172
    .line 173
    const/16 v25, 0x0

    .line 174
    .line 175
    const/16 v26, 0x0

    .line 176
    .line 177
    const/16 v27, 0x0

    .line 178
    .line 179
    const/16 v28, 0x0

    .line 180
    .line 181
    move-object/from16 v19, v0

    .line 182
    .line 183
    invoke-direct/range {v17 .. v30}, La/hjm;-><init>(Ljava/lang/CharSequence;La/pjm;La/y3d;La/o0x;La/y3d;La/m0x;ZLjava/lang/CharSequence;La/sso0;ZLa/ue9;Ljava/lang/Integer;I)V

    .line 184
    .line 185
    .line 186
    sget-object v18, La/kjm;->b:La/kjm;

    .line 187
    .line 188
    const/16 v23, 0x180

    .line 189
    .line 190
    const/16 v24, 0x38

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    move-object/from16 v22, v4

    .line 195
    .line 196
    invoke-static/range {v16 .. v24}, La/nkb;->h(La/mm40;La/jjm;La/kjm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 197
    .line 198
    .line 199
    move-object/from16 v3, v22

    .line 200
    .line 201
    invoke-virtual {v3, v7}, La/fet;->r(Z)V

    .line 202
    .line 203
    .line 204
    move v15, v7

    .line 205
    goto/16 :goto_10

    .line 206
    .line 207
    :cond_5
    move-object v3, v4

    .line 208
    move-object/from16 v14, v16

    .line 209
    .line 210
    instance-of v4, v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;

    .line 211
    .line 212
    iget-wide v7, v0, La/a9m;->b:J

    .line 213
    .line 214
    const/high16 v16, 0x41400000    # 12.0f

    .line 215
    .line 216
    sget-object v15, La/ukd;->a:La/cl5;

    .line 217
    .line 218
    sget-object v17, La/r7q0;->a:La/r7q0;

    .line 219
    .line 220
    sget-object v27, La/e6q0;->a:La/e6q0;

    .line 221
    .line 222
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 223
    .line 224
    iget-object v0, v0, La/a9m;->c:Lkotlin/jvm/functions/Function1;

    .line 225
    .line 226
    if-eqz v4, :cond_e

    .line 227
    .line 228
    const v4, 0x1adbb0d9

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 232
    .line 233
    .line 234
    move-object v4, v2

    .line 235
    check-cast v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;

    .line 236
    .line 237
    iget-object v6, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->i:Ljava/lang/String;

    .line 238
    .line 239
    move-object/from16 p4, v15

    .line 240
    .line 241
    iget-boolean v15, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->g:Z

    .line 242
    .line 243
    move/from16 v18, v15

    .line 244
    .line 245
    iget-boolean v15, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->f:Z

    .line 246
    .line 247
    move/from16 v20, v15

    .line 248
    .line 249
    iget-boolean v15, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->h:Z

    .line 250
    .line 251
    if-eqz v15, :cond_d

    .line 252
    .line 253
    const v15, 0x1adc5016

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3, v15}, La/fet;->e0(I)V

    .line 257
    .line 258
    .line 259
    invoke-static/range {v20 .. v20}, La/e1c0;->f(Z)F

    .line 260
    .line 261
    .line 262
    move-result v15

    .line 263
    move-object/from16 v21, v2

    .line 264
    .line 265
    invoke-static/range {v20 .. v20}, La/e1c0;->f(Z)F

    .line 266
    .line 267
    .line 268
    move-result v2

    .line 269
    move-object/from16 v22, v0

    .line 270
    .line 271
    invoke-static/range {v18 .. v18}, La/e1c0;->f(Z)F

    .line 272
    .line 273
    .line 274
    move-result v0

    .line 275
    move-object/from16 v23, v6

    .line 276
    .line 277
    invoke-static/range {v18 .. v18}, La/e1c0;->f(Z)F

    .line 278
    .line 279
    .line 280
    move-result v6

    .line 281
    invoke-static {v15, v2, v6, v0}, La/vgg0;->b(FFFF)La/ugg0;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    const/high16 v2, 0x3f800000    # 1.0f

    .line 286
    .line 287
    invoke-static {v14, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 288
    .line 289
    .line 290
    move-result-object v2

    .line 291
    invoke-static {v2, v0}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 292
    .line 293
    .line 294
    move-result-object v0

    .line 295
    invoke-static {v0, v7, v8, v13}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sget-object v2, La/qmk;->a:La/zcl;

    .line 300
    .line 301
    const/4 v2, 0x2

    .line 302
    const/high16 v6, 0x41800000    # 16.0f

    .line 303
    .line 304
    const/4 v7, 0x0

    .line 305
    invoke-static {v0, v6, v7, v2}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 306
    .line 307
    .line 308
    move-result-object v28

    .line 309
    if-eqz v20, :cond_6

    .line 310
    .line 311
    const/high16 v30, 0x41800000    # 16.0f

    .line 312
    .line 313
    goto :goto_4

    .line 314
    :cond_6
    move/from16 v30, v16

    .line 315
    .line 316
    :goto_4
    if-eqz v18, :cond_7

    .line 317
    .line 318
    const/high16 v32, 0x41800000    # 16.0f

    .line 319
    .line 320
    goto :goto_5

    .line 321
    :cond_7
    move/from16 v32, v16

    .line 322
    .line 323
    :goto_5
    const/16 v33, 0x5

    .line 324
    .line 325
    const/16 v29, 0x0

    .line 326
    .line 327
    const/16 v31, 0x0

    .line 328
    .line 329
    invoke-static/range {v28 .. v33}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    const/4 v15, 0x0

    .line 334
    invoke-static {v5, v15}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 335
    .line 336
    .line 337
    move-result-object v2

    .line 338
    iget-wide v5, v3, La/fet;->T:J

    .line 339
    .line 340
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 345
    .line 346
    .line 347
    move-result-object v6

    .line 348
    invoke-static {v3, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 353
    .line 354
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, La/fet;->i0()V

    .line 358
    .line 359
    .line 360
    iget-boolean v7, v3, La/fet;->S:Z

    .line 361
    .line 362
    if-eqz v7, :cond_8

    .line 363
    .line 364
    invoke-virtual {v3, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 365
    .line 366
    .line 367
    goto :goto_6

    .line 368
    :cond_8
    invoke-virtual {v3}, La/fet;->r0()V

    .line 369
    .line 370
    .line 371
    :goto_6
    invoke-static {v3, v2, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 372
    .line 373
    .line 374
    invoke-static {v3, v6, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v5, v3, v10, v3}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 378
    .line 379
    .line 380
    invoke-static {v3, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 381
    .line 382
    .line 383
    new-instance v25, La/c6q0;

    .line 384
    .line 385
    iget-object v0, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->b:Ljava/lang/String;

    .line 386
    .line 387
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    .line 388
    .line 389
    .line 390
    move-result v1

    .line 391
    if-nez v1, :cond_9

    .line 392
    .line 393
    move-object/from16 v29, v17

    .line 394
    .line 395
    move-object/from16 v2, v23

    .line 396
    .line 397
    goto :goto_7

    .line 398
    :cond_9
    new-instance v1, La/s7q0;

    .line 399
    .line 400
    move-object/from16 v2, v23

    .line 401
    .line 402
    invoke-direct {v1, v2}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    move-object/from16 v29, v1

    .line 406
    .line 407
    :goto_7
    iget-boolean v1, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->e:Z

    .line 408
    .line 409
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 410
    .line 411
    .line 412
    move-result v2

    .line 413
    if-lez v2, :cond_a

    .line 414
    .line 415
    const/16 v31, 0x1

    .line 416
    .line 417
    goto :goto_8

    .line 418
    :cond_a
    const/16 v31, 0x0

    .line 419
    .line 420
    :goto_8
    iget v2, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemTjUiModel;->d:I

    .line 421
    .line 422
    invoke-static {v2, v3}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 423
    .line 424
    .line 425
    move-result-object v33

    .line 426
    const/16 v37, 0x0

    .line 427
    .line 428
    const v38, 0x3f880

    .line 429
    .line 430
    .line 431
    sget-object v28, La/o6q0;->a:La/o6q0;

    .line 432
    .line 433
    const/16 v32, 0x0

    .line 434
    .line 435
    const-string v34, ""

    .line 436
    .line 437
    const/16 v35, 0x0

    .line 438
    .line 439
    const/16 v36, 0x0

    .line 440
    .line 441
    move-object/from16 v26, v0

    .line 442
    .line 443
    move/from16 v30, v1

    .line 444
    .line 445
    invoke-direct/range {v25 .. v38}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 446
    .line 447
    .line 448
    move-object/from16 v0, v22

    .line 449
    .line 450
    move-object/from16 v17, v25

    .line 451
    .line 452
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 453
    .line 454
    .line 455
    move-result v1

    .line 456
    move-object/from16 v2, v21

    .line 457
    .line 458
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result v4

    .line 462
    or-int/2addr v1, v4

    .line 463
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v4

    .line 467
    if-nez v1, :cond_b

    .line 468
    .line 469
    move-object/from16 v6, p4

    .line 470
    .line 471
    if-ne v4, v6, :cond_c

    .line 472
    .line 473
    :cond_b
    new-instance v4, La/b1c0;

    .line 474
    .line 475
    invoke-direct {v4, v0, v2}, La/b1c0;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 479
    .line 480
    .line 481
    :cond_c
    move-object/from16 v20, v4

    .line 482
    .line 483
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 484
    .line 485
    const/16 v22, 0x6

    .line 486
    .line 487
    const/16 v23, 0xc

    .line 488
    .line 489
    const/16 v18, 0x0

    .line 490
    .line 491
    const/16 v19, 0x0

    .line 492
    .line 493
    move-object/from16 v21, v3

    .line 494
    .line 495
    move-object/from16 v16, v14

    .line 496
    .line 497
    invoke-static/range {v16 .. v23}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 498
    .line 499
    .line 500
    const/4 v0, 0x1

    .line 501
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 502
    .line 503
    .line 504
    const/4 v15, 0x0

    .line 505
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 506
    .line 507
    .line 508
    goto :goto_9

    .line 509
    :cond_d
    const/4 v15, 0x0

    .line 510
    const v0, 0x1b0320ad

    .line 511
    .line 512
    .line 513
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 514
    .line 515
    .line 516
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 517
    .line 518
    .line 519
    :goto_9
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 520
    .line 521
    .line 522
    const/4 v15, 0x0

    .line 523
    goto/16 :goto_10

    .line 524
    .line 525
    :cond_e
    move-object v6, v15

    .line 526
    instance-of v4, v2, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;

    .line 527
    .line 528
    if-eqz v4, :cond_17

    .line 529
    .line 530
    const v4, 0x1b05777c

    .line 531
    .line 532
    .line 533
    invoke-virtual {v3, v4}, La/fet;->e0(I)V

    .line 534
    .line 535
    .line 536
    move-object v4, v2

    .line 537
    check-cast v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;

    .line 538
    .line 539
    iget-object v15, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->i:Ljava/lang/String;

    .line 540
    .line 541
    move-object/from16 p4, v6

    .line 542
    .line 543
    iget-boolean v6, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->g:Z

    .line 544
    .line 545
    move/from16 v18, v6

    .line 546
    .line 547
    iget-boolean v6, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->f:Z

    .line 548
    .line 549
    move/from16 v20, v6

    .line 550
    .line 551
    iget-boolean v6, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->h:Z

    .line 552
    .line 553
    if-eqz v6, :cond_16

    .line 554
    .line 555
    const v6, 0x1b0616b9

    .line 556
    .line 557
    .line 558
    invoke-virtual {v3, v6}, La/fet;->e0(I)V

    .line 559
    .line 560
    .line 561
    invoke-static/range {v20 .. v20}, La/e1c0;->f(Z)F

    .line 562
    .line 563
    .line 564
    move-result v6

    .line 565
    move-object/from16 v21, v2

    .line 566
    .line 567
    invoke-static/range {v20 .. v20}, La/e1c0;->f(Z)F

    .line 568
    .line 569
    .line 570
    move-result v2

    .line 571
    move-object/from16 v22, v0

    .line 572
    .line 573
    invoke-static/range {v18 .. v18}, La/e1c0;->f(Z)F

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    move-object/from16 v23, v15

    .line 578
    .line 579
    invoke-static/range {v18 .. v18}, La/e1c0;->f(Z)F

    .line 580
    .line 581
    .line 582
    move-result v15

    .line 583
    invoke-static {v6, v2, v15, v0}, La/vgg0;->b(FFFF)La/ugg0;

    .line 584
    .line 585
    .line 586
    move-result-object v0

    .line 587
    const/high16 v2, 0x3f800000    # 1.0f

    .line 588
    .line 589
    invoke-static {v14, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 590
    .line 591
    .line 592
    move-result-object v2

    .line 593
    invoke-static {v2, v0}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 594
    .line 595
    .line 596
    move-result-object v0

    .line 597
    invoke-static {v0, v7, v8, v13}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 598
    .line 599
    .line 600
    move-result-object v0

    .line 601
    sget-object v2, La/qmk;->a:La/zcl;

    .line 602
    .line 603
    const/4 v2, 0x0

    .line 604
    const/high16 v6, 0x41800000    # 16.0f

    .line 605
    .line 606
    const/4 v7, 0x2

    .line 607
    invoke-static {v0, v6, v2, v7}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 608
    .line 609
    .line 610
    move-result-object v28

    .line 611
    if-eqz v20, :cond_f

    .line 612
    .line 613
    move/from16 v30, v6

    .line 614
    .line 615
    goto :goto_a

    .line 616
    :cond_f
    move/from16 v30, v16

    .line 617
    .line 618
    :goto_a
    if-eqz v18, :cond_10

    .line 619
    .line 620
    move/from16 v32, v6

    .line 621
    .line 622
    goto :goto_b

    .line 623
    :cond_10
    move/from16 v32, v16

    .line 624
    .line 625
    :goto_b
    const/16 v33, 0x5

    .line 626
    .line 627
    const/16 v29, 0x0

    .line 628
    .line 629
    const/16 v31, 0x0

    .line 630
    .line 631
    invoke-static/range {v28 .. v33}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    const/4 v15, 0x0

    .line 636
    invoke-static {v5, v15}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    iget-wide v5, v3, La/fet;->T:J

    .line 641
    .line 642
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 643
    .line 644
    .line 645
    move-result v5

    .line 646
    invoke-virtual {v3}, La/fet;->m()La/bh90;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    invoke-static {v3, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 655
    .line 656
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 657
    .line 658
    .line 659
    invoke-virtual {v3}, La/fet;->i0()V

    .line 660
    .line 661
    .line 662
    iget-boolean v7, v3, La/fet;->S:Z

    .line 663
    .line 664
    if-eqz v7, :cond_11

    .line 665
    .line 666
    invoke-virtual {v3, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 667
    .line 668
    .line 669
    goto :goto_c

    .line 670
    :cond_11
    invoke-virtual {v3}, La/fet;->r0()V

    .line 671
    .line 672
    .line 673
    :goto_c
    invoke-static {v3, v2, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 674
    .line 675
    .line 676
    invoke-static {v3, v6, v11}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 677
    .line 678
    .line 679
    invoke-static {v5, v3, v10, v3}, La/vqd;->u(ILa/fet;La/shd;La/fet;)V

    .line 680
    .line 681
    .line 682
    invoke-static {v3, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 683
    .line 684
    .line 685
    new-instance v25, La/c6q0;

    .line 686
    .line 687
    iget-object v0, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->b:Ljava/lang/String;

    .line 688
    .line 689
    invoke-virtual/range {v23 .. v23}, Ljava/lang/String;->length()I

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-nez v1, :cond_12

    .line 694
    .line 695
    move-object/from16 v29, v17

    .line 696
    .line 697
    move-object/from16 v2, v23

    .line 698
    .line 699
    goto :goto_d

    .line 700
    :cond_12
    new-instance v1, La/s7q0;

    .line 701
    .line 702
    move-object/from16 v2, v23

    .line 703
    .line 704
    invoke-direct {v1, v2}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 705
    .line 706
    .line 707
    move-object/from16 v29, v1

    .line 708
    .line 709
    :goto_d
    iget-boolean v1, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->e:Z

    .line 710
    .line 711
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 712
    .line 713
    .line 714
    move-result v2

    .line 715
    if-lez v2, :cond_13

    .line 716
    .line 717
    const/16 v31, 0x1

    .line 718
    .line 719
    goto :goto_e

    .line 720
    :cond_13
    const/16 v31, 0x0

    .line 721
    .line 722
    :goto_e
    iget v2, v4, Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel$ProfileEditItemClickableTjUiModel;->d:I

    .line 723
    .line 724
    invoke-static {v2, v3}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 725
    .line 726
    .line 727
    move-result-object v33

    .line 728
    const/16 v37, 0x0

    .line 729
    .line 730
    const v38, 0x3f880

    .line 731
    .line 732
    .line 733
    sget-object v28, La/g6q0;->a:La/g6q0;

    .line 734
    .line 735
    const/16 v32, 0x0

    .line 736
    .line 737
    const-string v34, ""

    .line 738
    .line 739
    const/16 v35, 0x0

    .line 740
    .line 741
    const/16 v36, 0x0

    .line 742
    .line 743
    move-object/from16 v26, v0

    .line 744
    .line 745
    move/from16 v30, v1

    .line 746
    .line 747
    invoke-direct/range {v25 .. v38}, La/c6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 748
    .line 749
    .line 750
    move-object/from16 v0, v22

    .line 751
    .line 752
    move-object/from16 v17, v25

    .line 753
    .line 754
    invoke-virtual {v3, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 755
    .line 756
    .line 757
    move-result v1

    .line 758
    move-object/from16 v2, v21

    .line 759
    .line 760
    invoke-virtual {v3, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    move-result v4

    .line 764
    or-int/2addr v1, v4

    .line 765
    invoke-virtual {v3}, La/fet;->P()Ljava/lang/Object;

    .line 766
    .line 767
    .line 768
    move-result-object v4

    .line 769
    if-nez v1, :cond_14

    .line 770
    .line 771
    move-object/from16 v6, p4

    .line 772
    .line 773
    if-ne v4, v6, :cond_15

    .line 774
    .line 775
    :cond_14
    new-instance v4, La/c1c0;

    .line 776
    .line 777
    invoke-direct {v4, v0, v2}, La/c1c0;-><init>(Lkotlin/jvm/functions/Function1;Lorg/xplatform/personal/impl/presentation/edit_tj/models/ProfileEditTjUiModel;)V

    .line 778
    .line 779
    .line 780
    invoke-virtual {v3, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 781
    .line 782
    .line 783
    :cond_15
    move-object/from16 v20, v4

    .line 784
    .line 785
    check-cast v20, Lkotlin/jvm/functions/Function1;

    .line 786
    .line 787
    const/16 v22, 0x6

    .line 788
    .line 789
    const/16 v23, 0xc

    .line 790
    .line 791
    const/16 v18, 0x0

    .line 792
    .line 793
    const/16 v19, 0x0

    .line 794
    .line 795
    move-object/from16 v21, v3

    .line 796
    .line 797
    move-object/from16 v16, v14

    .line 798
    .line 799
    invoke-static/range {v16 .. v23}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 800
    .line 801
    .line 802
    const/4 v0, 0x1

    .line 803
    invoke-virtual {v3, v0}, La/fet;->r(Z)V

    .line 804
    .line 805
    .line 806
    const/4 v15, 0x0

    .line 807
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 808
    .line 809
    .line 810
    goto :goto_f

    .line 811
    :cond_16
    const/4 v15, 0x0

    .line 812
    const v0, 0x1b2a836d

    .line 813
    .line 814
    .line 815
    invoke-virtual {v3, v0}, La/fet;->e0(I)V

    .line 816
    .line 817
    .line 818
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 819
    .line 820
    .line 821
    :goto_f
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 822
    .line 823
    .line 824
    :goto_10
    invoke-virtual {v3, v15}, La/fet;->r(Z)V

    .line 825
    .line 826
    .line 827
    goto :goto_12

    .line 828
    :cond_17
    const/4 v15, 0x0

    .line 829
    goto :goto_11

    .line 830
    :cond_18
    move-object v3, v4

    .line 831
    move v15, v7

    .line 832
    :goto_11
    const v0, -0x38f0de0a

    .line 833
    .line 834
    .line 835
    invoke-static {v0, v3, v15}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 836
    .line 837
    .line 838
    move-result-object v0

    .line 839
    throw v0

    .line 840
    :cond_19
    move-object v3, v4

    .line 841
    invoke-virtual {v3}, La/fet;->X()V

    .line 842
    .line 843
    .line 844
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_0
    const/4 v7, 0x2

    .line 848
    move-object/from16 v1, p1

    .line 849
    .line 850
    check-cast v1, La/g9z;

    .line 851
    .line 852
    move-object/from16 v4, p2

    .line 853
    .line 854
    check-cast v4, Ljava/lang/Number;

    .line 855
    .line 856
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 857
    .line 858
    .line 859
    move-result v4

    .line 860
    move-object/from16 v12, p3

    .line 861
    .line 862
    check-cast v12, La/fet;

    .line 863
    .line 864
    move-object/from16 v5, p4

    .line 865
    .line 866
    check-cast v5, Ljava/lang/Number;

    .line 867
    .line 868
    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    .line 869
    .line 870
    .line 871
    move-result v5

    .line 872
    and-int/lit8 v8, v5, 0x6

    .line 873
    .line 874
    if-nez v8, :cond_1b

    .line 875
    .line 876
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v1

    .line 880
    if-eqz v1, :cond_1a

    .line 881
    .line 882
    goto :goto_13

    .line 883
    :cond_1a
    move v6, v7

    .line 884
    :goto_13
    or-int v1, v5, v6

    .line 885
    .line 886
    goto :goto_14

    .line 887
    :cond_1b
    move v1, v5

    .line 888
    :goto_14
    and-int/lit8 v5, v5, 0x30

    .line 889
    .line 890
    if-nez v5, :cond_1d

    .line 891
    .line 892
    invoke-virtual {v12, v4}, La/fet;->e(I)Z

    .line 893
    .line 894
    .line 895
    move-result v5

    .line 896
    if-eqz v5, :cond_1c

    .line 897
    .line 898
    const/16 v16, 0x20

    .line 899
    .line 900
    goto :goto_15

    .line 901
    :cond_1c
    const/16 v16, 0x10

    .line 902
    .line 903
    :goto_15
    or-int v1, v1, v16

    .line 904
    .line 905
    :cond_1d
    and-int/lit16 v5, v1, 0x93

    .line 906
    .line 907
    if-eq v5, v3, :cond_1e

    .line 908
    .line 909
    const/4 v3, 0x1

    .line 910
    :goto_16
    const/16 v24, 0x1

    .line 911
    .line 912
    goto :goto_17

    .line 913
    :cond_1e
    const/4 v3, 0x0

    .line 914
    goto :goto_16

    .line 915
    :goto_17
    and-int/lit8 v1, v1, 0x1

    .line 916
    .line 917
    invoke-virtual {v12, v1, v3}, La/fet;->U(IZ)Z

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    if-eqz v1, :cond_1f

    .line 922
    .line 923
    check-cast v2, La/a4x;

    .line 924
    .line 925
    invoke-interface {v2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    move-object v10, v1

    .line 930
    check-cast v10, La/y8m;

    .line 931
    .line 932
    const v1, -0x617f6352

    .line 933
    .line 934
    .line 935
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 936
    .line 937
    .line 938
    iget-object v11, v0, La/a9m;->c:Lkotlin/jvm/functions/Function1;

    .line 939
    .line 940
    const/4 v13, 0x0

    .line 941
    iget-wide v8, v0, La/a9m;->b:J

    .line 942
    .line 943
    invoke-static/range {v8 .. v13}, La/ffb0;->p(JLa/y8m;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 944
    .line 945
    .line 946
    const/4 v15, 0x0

    .line 947
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 948
    .line 949
    .line 950
    goto :goto_18

    .line 951
    :cond_1f
    invoke-virtual {v12}, La/fet;->X()V

    .line 952
    .line 953
    .line 954
    :goto_18
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 955
    .line 956
    return-object v0

    .line 957
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
