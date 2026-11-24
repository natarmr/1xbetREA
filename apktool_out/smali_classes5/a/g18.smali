.class public final synthetic La/g18;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;ILjava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/g18;->a:B

    iput-object p1, p0, La/g18;->c:Ljava/lang/Object;

    iput p2, p0, La/g18;->b:I

    iput-object p3, p0, La/g18;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/g18;->a:B

    iput-object p1, p0, La/g18;->c:Ljava/lang/Object;

    iput-object p2, p0, La/g18;->d:Ljava/lang/Object;

    iput p3, p0, La/g18;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g18;->a:B

    .line 4
    .line 5
    const/16 v2, 0xc

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const v4, 0x2fd4df92

    .line 9
    .line 10
    .line 11
    const/16 v5, 0x18

    .line 12
    .line 13
    const/16 v6, 0xa

    .line 14
    .line 15
    const/16 v7, 0x8

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    const/4 v9, 0x0

    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x1

    .line 21
    iget v12, v0, La/g18;->b:I

    .line 22
    .line 23
    iget-object v13, v0, La/g18;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v14, v0, La/g18;->c:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v14, La/lcu0;

    .line 31
    .line 32
    check-cast v13, La/pu90;

    .line 33
    .line 34
    move-object/from16 v0, p1

    .line 35
    .line 36
    check-cast v0, La/ou90;

    .line 37
    .line 38
    iget v1, v14, La/lcu0;->c:I

    .line 39
    .line 40
    iget-object v6, v14, La/lcu0;->b:La/d7q0;

    .line 41
    .line 42
    iget-object v2, v14, La/lcu0;->d:La/nls0;

    .line 43
    .line 44
    iget-object v3, v14, La/lcu0;->e:Lkotlin/jvm/functions/Function0;

    .line 45
    .line 46
    invoke-interface {v3}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    check-cast v3, La/b9q0;

    .line 51
    .line 52
    if-eqz v3, :cond_0

    .line 53
    .line 54
    iget-object v9, v3, La/b9q0;->a:La/a9q0;

    .line 55
    .line 56
    :cond_0
    move-object v3, v9

    .line 57
    const/4 v4, 0x0

    .line 58
    iget v5, v13, La/pu90;->a:I

    .line 59
    .line 60
    invoke-static/range {v0 .. v5}, La/yum0;->g(La/ou90;ILa/nls0;La/a9q0;ZI)La/jge0;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    sget-object v2, La/ma80;->a:La/ma80;

    .line 65
    .line 66
    iget v3, v13, La/pu90;->b:I

    .line 67
    .line 68
    invoke-virtual {v6, v2, v1, v12, v3}, La/d7q0;->a(La/ma80;La/jge0;II)V

    .line 69
    .line 70
    .line 71
    iget-object v1, v6, La/d7q0;->a:La/agk0;

    .line 72
    .line 73
    invoke-virtual {v1}, La/agk0;->l()F

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    neg-float v1, v1

    .line 78
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    invoke-virtual {v0, v13, v10, v1, v8}, La/ou90;->m(La/pu90;IIF)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_0
    check-cast v14, La/g2g0;

    .line 89
    .line 90
    check-cast v13, La/uvc;

    .line 91
    .line 92
    move-object/from16 v0, p1

    .line 93
    .line 94
    check-cast v0, La/k0w0;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v1, v14, La/g2g0;->k:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, La/uzc0;

    .line 102
    .line 103
    iget v2, v13, La/uvc;->a:I

    .line 104
    .line 105
    sget-object v3, La/mvc;->c:La/mvc;

    .line 106
    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

    .line 111
    .line 112
    invoke-direct {v1, v2, v12, v3, v11}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;-><init>(IILa/mvc;Z)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 116
    .line 117
    .line 118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    return-object v0

    .line 121
    :pswitch_1
    check-cast v14, La/g2g0;

    .line 122
    .line 123
    check-cast v13, La/kr5;

    .line 124
    .line 125
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, La/k0w0;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    new-instance v1, La/bh1;

    .line 133
    .line 134
    invoke-direct {v1, v14, v13, v12, v6}, La/bh1;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 135
    .line 136
    .line 137
    new-instance v2, La/a1w0;

    .line 138
    .line 139
    invoke-direct {v2, v1}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v2}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, La/c8d;

    .line 149
    .line 150
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 151
    .line 152
    new-instance v2, La/v7d;

    .line 153
    .line 154
    invoke-direct {v2, v11, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 155
    .line 156
    .line 157
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 158
    .line 159
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 160
    .line 161
    return-object v0

    .line 162
    :pswitch_2
    check-cast v14, La/bbl0;

    .line 163
    .line 164
    check-cast v13, La/cp;

    .line 165
    .line 166
    move-object/from16 v0, p1

    .line 167
    .line 168
    check-cast v0, Landroid/view/View;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    invoke-virtual {v13}, La/cp;->u()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    check-cast v1, La/qwl0;

    .line 182
    .line 183
    iget-object v1, v1, La/qwl0;->a:Ljava/util/ArrayList;

    .line 184
    .line 185
    invoke-virtual {v14, v0, v1}, La/bbl0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_3
    check-cast v14, Lorg/xplatform/ui_core/viewcomponents/imageview/RoundCornerImageView;

    .line 192
    .line 193
    check-cast v13, Ljava/util/List;

    .line 194
    .line 195
    move-object/from16 v0, p1

    .line 196
    .line 197
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 198
    .line 199
    sget-object v0, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    .line 200
    .line 201
    invoke-virtual {v14, v0}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 202
    .line 203
    .line 204
    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    check-cast v0, Landroid/view/View;

    .line 212
    .line 213
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 217
    .line 218
    return-object v0

    .line 219
    :pswitch_4
    check-cast v14, Ljava/util/ArrayList;

    .line 220
    .line 221
    check-cast v13, Lkotlin/jvm/functions/Function2;

    .line 222
    .line 223
    move-object/from16 v0, p1

    .line 224
    .line 225
    check-cast v0, La/ou90;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    move v2, v10

    .line 235
    move v3, v2

    .line 236
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 237
    .line 238
    .line 239
    move-result v4

    .line 240
    if-eqz v4, :cond_8

    .line 241
    .line 242
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v4

    .line 246
    add-int/lit8 v5, v2, 0x1

    .line 247
    .line 248
    if-ltz v2, :cond_7

    .line 249
    .line 250
    check-cast v4, La/pu90;

    .line 251
    .line 252
    if-nez v2, :cond_5

    .line 253
    .line 254
    if-eqz v13, :cond_5

    .line 255
    .line 256
    invoke-virtual {v4}, La/pu90;->n()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v2

    .line 260
    instance-of v6, v2, La/w0v0;

    .line 261
    .line 262
    if-eqz v6, :cond_1

    .line 263
    .line 264
    check-cast v2, La/w0v0;

    .line 265
    .line 266
    goto :goto_1

    .line 267
    :cond_1
    move-object v2, v9

    .line 268
    :goto_1
    if-eqz v2, :cond_2

    .line 269
    .line 270
    iget-object v2, v2, La/w0v0;->b:La/v0v0;

    .line 271
    .line 272
    goto :goto_2

    .line 273
    :cond_2
    move-object v2, v9

    .line 274
    :goto_2
    if-eqz v2, :cond_6

    .line 275
    .line 276
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 277
    .line 278
    .line 279
    move-result v2

    .line 280
    const/high16 v6, 0x42000000    # 32.0f

    .line 281
    .line 282
    const/high16 v7, 0x41800000    # 16.0f

    .line 283
    .line 284
    if-eqz v2, :cond_4

    .line 285
    .line 286
    if-ne v2, v11, :cond_3

    .line 287
    .line 288
    sget-object v2, La/qmk;->a:La/zcl;

    .line 289
    .line 290
    invoke-interface {v0, v7}, La/w6k;->T(F)I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    rsub-int/lit8 v2, v2, 0x0

    .line 295
    .line 296
    invoke-interface {v0, v6}, La/w6k;->T(F)I

    .line 297
    .line 298
    .line 299
    move-result v6

    .line 300
    rsub-int/lit8 v6, v6, 0x0

    .line 301
    .line 302
    invoke-virtual {v0, v4, v2, v6, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 303
    .line 304
    .line 305
    goto :goto_3

    .line 306
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 307
    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_4
    iget v2, v4, La/pu90;->a:I

    .line 311
    .line 312
    sub-int v2, v12, v2

    .line 313
    .line 314
    sget-object v14, La/qmk;->a:La/zcl;

    .line 315
    .line 316
    invoke-interface {v0, v7}, La/w6k;->T(F)I

    .line 317
    .line 318
    .line 319
    move-result v7

    .line 320
    add-int/2addr v7, v2

    .line 321
    invoke-interface {v0, v6}, La/w6k;->T(F)I

    .line 322
    .line 323
    .line 324
    move-result v2

    .line 325
    rsub-int/lit8 v2, v2, 0x0

    .line 326
    .line 327
    invoke-virtual {v0, v4, v7, v2, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 328
    .line 329
    .line 330
    goto :goto_3

    .line 331
    :cond_5
    invoke-virtual {v0, v4, v10, v3, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 332
    .line 333
    .line 334
    iget v2, v4, La/pu90;->b:I

    .line 335
    .line 336
    add-int/2addr v3, v2

    .line 337
    :cond_6
    :goto_3
    move v2, v5

    .line 338
    goto :goto_0

    .line 339
    :cond_7
    invoke-static {}, La/q3d;->p()V

    .line 340
    .line 341
    .line 342
    throw v9

    .line 343
    :cond_8
    sget-object v9, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 344
    .line 345
    :goto_4
    return-object v9

    .line 346
    :pswitch_5
    check-cast v14, Ljava/util/List;

    .line 347
    .line 348
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 349
    .line 350
    move-object/from16 v0, p1

    .line 351
    .line 352
    check-cast v0, La/hcz;

    .line 353
    .line 354
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    new-instance v1, La/wvi0;

    .line 358
    .line 359
    invoke-direct {v1, v6}, La/wvi0;-><init>(B)V

    .line 360
    .line 361
    .line 362
    invoke-interface {v14}, Ljava/util/List;->size()I

    .line 363
    .line 364
    .line 365
    move-result v2

    .line 366
    new-instance v3, La/pwe0;

    .line 367
    .line 368
    invoke-direct {v3, v1, v14, v5}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 369
    .line 370
    .line 371
    new-instance v1, La/d1c0;

    .line 372
    .line 373
    const/16 v5, 0x1b

    .line 374
    .line 375
    invoke-direct {v1, v14, v5}, La/d1c0;-><init>(Ljava/util/List;B)V

    .line 376
    .line 377
    .line 378
    new-instance v5, La/cit;

    .line 379
    .line 380
    invoke-direct {v5, v14, v12, v13}, La/cit;-><init>(Ljava/util/List;ILkotlin/jvm/functions/Function1;)V

    .line 381
    .line 382
    .line 383
    new-instance v6, La/ugd;

    .line 384
    .line 385
    invoke-direct {v6, v4, v11, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v2, v3, v1, v6}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_6
    check-cast v14, La/ctf0;

    .line 395
    .line 396
    check-cast v13, La/y78;

    .line 397
    .line 398
    move-object/from16 v0, p1

    .line 399
    .line 400
    check-cast v0, La/uhh0;

    .line 401
    .line 402
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    new-instance v1, La/aih0;

    .line 406
    .line 407
    invoke-direct {v1, v0, v14, v13, v12}, La/aih0;-><init>(La/uhh0;La/ctf0;La/y78;I)V

    .line 408
    .line 409
    .line 410
    return-object v1

    .line 411
    :pswitch_7
    check-cast v14, La/oah0;

    .line 412
    .line 413
    move-object v1, v13

    .line 414
    check-cast v1, La/pu90;

    .line 415
    .line 416
    move-object/from16 v0, p1

    .line 417
    .line 418
    check-cast v0, La/ou90;

    .line 419
    .line 420
    iget-object v2, v14, La/oah0;->o:La/rah0;

    .line 421
    .line 422
    iget-object v2, v2, La/rah0;->a:La/cgk0;

    .line 423
    .line 424
    invoke-virtual {v2}, La/cgk0;->l()I

    .line 425
    .line 426
    .line 427
    move-result v2

    .line 428
    if-gez v2, :cond_9

    .line 429
    .line 430
    move v2, v10

    .line 431
    :cond_9
    if-le v2, v12, :cond_a

    .line 432
    .line 433
    move v2, v12

    .line 434
    :cond_a
    iget-boolean v3, v14, La/oah0;->p:Z

    .line 435
    .line 436
    if-eqz v3, :cond_b

    .line 437
    .line 438
    sub-int/2addr v2, v12

    .line 439
    goto :goto_5

    .line 440
    :cond_b
    neg-int v2, v2

    .line 441
    :goto_5
    iget-boolean v3, v14, La/oah0;->q:Z

    .line 442
    .line 443
    move v4, v2

    .line 444
    if-eqz v3, :cond_c

    .line 445
    .line 446
    move v2, v10

    .line 447
    :cond_c
    if-eqz v3, :cond_d

    .line 448
    .line 449
    move v3, v4

    .line 450
    goto :goto_6

    .line 451
    :cond_d
    move v3, v10

    .line 452
    :goto_6
    iput-boolean v11, v0, La/ou90;->a:Z

    .line 453
    .line 454
    const/4 v4, 0x0

    .line 455
    const/16 v5, 0xc

    .line 456
    .line 457
    invoke-static/range {v0 .. v5}, La/ou90;->w(La/ou90;La/pu90;IILa/cj;I)V

    .line 458
    .line 459
    .line 460
    iput-boolean v10, v0, La/ou90;->a:Z

    .line 461
    .line 462
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 463
    .line 464
    return-object v0

    .line 465
    :pswitch_8
    check-cast v14, La/srf0;

    .line 466
    .line 467
    check-cast v13, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;

    .line 468
    .line 469
    move-object/from16 v0, p1

    .line 470
    .line 471
    check-cast v0, Landroid/view/View;

    .line 472
    .line 473
    sget v1, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->m:I

    .line 474
    .line 475
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    iget-object v0, v14, La/srf0;->c:La/mrf0;

    .line 479
    .line 480
    if-eqz v0, :cond_e

    .line 481
    .line 482
    iget-object v9, v0, La/mrf0;->d:La/qrf0;

    .line 483
    .line 484
    :cond_e
    sget-object v0, La/qrf0;->g:La/qrf0;

    .line 485
    .line 486
    if-eq v9, v0, :cond_f

    .line 487
    .line 488
    goto :goto_7

    .line 489
    :cond_f
    iget-object v0, v13, Lorg/xplatform/resident/presentation/views/ResidentSafeLineView;->b:Lkotlin/jvm/functions/Function1;

    .line 490
    .line 491
    add-int/2addr v12, v11

    .line 492
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 493
    .line 494
    .line 495
    move-result-object v1

    .line 496
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 500
    .line 501
    return-object v0

    .line 502
    :pswitch_9
    check-cast v14, La/mof0;

    .line 503
    .line 504
    check-cast v13, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;

    .line 505
    .line 506
    move-object/from16 v0, p1

    .line 507
    .line 508
    check-cast v0, Landroid/view/View;

    .line 509
    .line 510
    sget v1, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->e:I

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    iget-object v0, v14, La/mof0;->c:La/lof0;

    .line 516
    .line 517
    sget-object v1, La/lof0;->c:La/lof0;

    .line 518
    .line 519
    if-eq v0, v1, :cond_10

    .line 520
    .line 521
    goto :goto_8

    .line 522
    :cond_10
    iget-object v0, v13, Lorg/xplatform/resident/presentation/views/ResidentDoorLineView;->b:Lkotlin/jvm/functions/Function1;

    .line 523
    .line 524
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 529
    .line 530
    .line 531
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 532
    .line 533
    return-object v0

    .line 534
    :pswitch_a
    check-cast v14, La/aoo0;

    .line 535
    .line 536
    check-cast v13, La/a4x;

    .line 537
    .line 538
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, Lorg/xplatform/uikit/components/tabs/DsTabs;

    .line 541
    .line 542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 543
    .line 544
    .line 545
    iget-object v1, v0, Lorg/xplatform/uikit/components/tabs/DsTabs;->t:Ljava/util/ArrayList;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 548
    .line 549
    .line 550
    move-result v1

    .line 551
    if-lt v1, v3, :cond_11

    .line 552
    .line 553
    goto :goto_9

    .line 554
    :cond_11
    invoke-virtual {v0, v14}, Lorg/xplatform/uikit/components/tabs/DsTabs;->setTabsStyle(La/aoo0;)V

    .line 555
    .line 556
    .line 557
    invoke-virtual {v0, v13}, Lorg/xplatform/uikit/components/tabs/DsTabs;->c(Ljava/util/List;)V

    .line 558
    .line 559
    .line 560
    :goto_9
    invoke-virtual {v0, v12}, Lorg/xplatform/uikit/components/tabs/DsTabs;->k(I)V

    .line 561
    .line 562
    .line 563
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 564
    .line 565
    return-object v0

    .line 566
    :pswitch_b
    check-cast v14, La/yfe0;

    .line 567
    .line 568
    check-cast v13, La/ry40;

    .line 569
    .line 570
    move-object/from16 v0, p1

    .line 571
    .line 572
    check-cast v0, La/mld;

    .line 573
    .line 574
    iget v1, v14, La/yfe0;->e:I

    .line 575
    .line 576
    if-ne v1, v12, :cond_1a

    .line 577
    .line 578
    iget-object v1, v14, La/yfe0;->f:La/ry40;

    .line 579
    .line 580
    invoke-static {v13, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v1

    .line 584
    if-eqz v1, :cond_1a

    .line 585
    .line 586
    instance-of v1, v0, La/tld;

    .line 587
    .line 588
    if-eqz v1, :cond_1a

    .line 589
    .line 590
    iget-object v1, v13, La/ry40;->a:[J

    .line 591
    .line 592
    array-length v2, v1

    .line 593
    sub-int/2addr v2, v3

    .line 594
    if-ltz v2, :cond_1a

    .line 595
    .line 596
    move v3, v10

    .line 597
    :goto_a
    aget-wide v4, v1, v3

    .line 598
    .line 599
    not-long v8, v4

    .line 600
    const/4 v6, 0x7

    .line 601
    shl-long/2addr v8, v6

    .line 602
    and-long/2addr v8, v4

    .line 603
    const-wide v15, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    and-long/2addr v8, v15

    .line 609
    cmp-long v6, v8, v15

    .line 610
    .line 611
    if-eqz v6, :cond_19

    .line 612
    .line 613
    sub-int v6, v3, v2

    .line 614
    .line 615
    not-int v6, v6

    .line 616
    ushr-int/lit8 v6, v6, 0x1f

    .line 617
    .line 618
    rsub-int/lit8 v6, v6, 0x8

    .line 619
    .line 620
    move v8, v10

    .line 621
    :goto_b
    if-ge v8, v6, :cond_18

    .line 622
    .line 623
    const-wide/16 v15, 0xff

    .line 624
    .line 625
    and-long/2addr v15, v4

    .line 626
    const-wide/16 v17, 0x80

    .line 627
    .line 628
    cmp-long v9, v15, v17

    .line 629
    .line 630
    if-gez v9, :cond_16

    .line 631
    .line 632
    shl-int/lit8 v9, v3, 0x3

    .line 633
    .line 634
    add-int/2addr v9, v8

    .line 635
    iget-object v15, v13, La/ry40;->b:[Ljava/lang/Object;

    .line 636
    .line 637
    aget-object v15, v15, v9

    .line 638
    .line 639
    iget-object v10, v13, La/ry40;->c:[I

    .line 640
    .line 641
    aget v10, v10, v9

    .line 642
    .line 643
    if-eq v10, v12, :cond_12

    .line 644
    .line 645
    move v10, v11

    .line 646
    goto :goto_c

    .line 647
    :cond_12
    const/4 v10, 0x0

    .line 648
    :goto_c
    if-eqz v10, :cond_14

    .line 649
    .line 650
    move-object v11, v0

    .line 651
    check-cast v11, La/tld;

    .line 652
    .line 653
    move/from16 v18, v7

    .line 654
    .line 655
    iget-object v7, v11, La/tld;->g:La/hz40;

    .line 656
    .line 657
    invoke-static {v7, v15, v14}, La/e9x;->S(La/hz40;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 658
    .line 659
    .line 660
    move-object/from16 p0, v0

    .line 661
    .line 662
    instance-of v0, v15, La/zbk;

    .line 663
    .line 664
    if-eqz v0, :cond_15

    .line 665
    .line 666
    move-object v0, v15

    .line 667
    check-cast v0, La/zbk;

    .line 668
    .line 669
    invoke-virtual {v7, v0}, La/hz40;->c(Ljava/lang/Object;)Z

    .line 670
    .line 671
    .line 672
    move-result v7

    .line 673
    if-nez v7, :cond_13

    .line 674
    .line 675
    iget-object v7, v11, La/tld;->j:La/hz40;

    .line 676
    .line 677
    invoke-static {v7, v0}, La/e9x;->T(La/hz40;Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    :cond_13
    iget-object v0, v14, La/yfe0;->g:La/hz40;

    .line 681
    .line 682
    if-eqz v0, :cond_15

    .line 683
    .line 684
    invoke-virtual {v0, v15}, La/hz40;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    goto :goto_d

    .line 688
    :cond_14
    move-object/from16 p0, v0

    .line 689
    .line 690
    move/from16 v18, v7

    .line 691
    .line 692
    :cond_15
    :goto_d
    if-eqz v10, :cond_17

    .line 693
    .line 694
    invoke-virtual {v13, v9}, La/ry40;->f(I)V

    .line 695
    .line 696
    .line 697
    goto :goto_e

    .line 698
    :cond_16
    move-object/from16 p0, v0

    .line 699
    .line 700
    move/from16 v18, v7

    .line 701
    .line 702
    :cond_17
    :goto_e
    shr-long v4, v4, v18

    .line 703
    .line 704
    add-int/lit8 v8, v8, 0x1

    .line 705
    .line 706
    move-object/from16 v0, p0

    .line 707
    .line 708
    move/from16 v7, v18

    .line 709
    .line 710
    const/4 v10, 0x0

    .line 711
    const/4 v11, 0x1

    .line 712
    goto :goto_b

    .line 713
    :cond_18
    move-object/from16 p0, v0

    .line 714
    .line 715
    move v0, v7

    .line 716
    if-ne v6, v0, :cond_1a

    .line 717
    .line 718
    goto :goto_f

    .line 719
    :cond_19
    move-object/from16 p0, v0

    .line 720
    .line 721
    :goto_f
    if-eq v3, v2, :cond_1a

    .line 722
    .line 723
    add-int/lit8 v3, v3, 0x1

    .line 724
    .line 725
    move-object/from16 v0, p0

    .line 726
    .line 727
    const/16 v7, 0x8

    .line 728
    .line 729
    const/4 v10, 0x0

    .line 730
    const/4 v11, 0x1

    .line 731
    goto/16 :goto_a

    .line 732
    .line 733
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 734
    .line 735
    return-object v0

    .line 736
    :pswitch_c
    check-cast v14, La/sbb0;

    .line 737
    .line 738
    check-cast v13, La/uvc;

    .line 739
    .line 740
    move-object/from16 v0, p1

    .line 741
    .line 742
    check-cast v0, La/k0w0;

    .line 743
    .line 744
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    iget-object v1, v14, La/sbb0;->Q:La/uzc0;

    .line 748
    .line 749
    iget v2, v13, La/uvc;->a:I

    .line 750
    .line 751
    sget-object v3, La/mvc;->c:La/mvc;

    .line 752
    .line 753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    new-instance v1, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

    .line 757
    .line 758
    const/4 v4, 0x1

    .line 759
    invoke-direct {v1, v2, v12, v3, v4}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;-><init>(IILa/mvc;Z)V

    .line 760
    .line 761
    .line 762
    invoke-virtual {v0, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 763
    .line 764
    .line 765
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 766
    .line 767
    return-object v0

    .line 768
    :pswitch_d
    check-cast v14, La/bb00;

    .line 769
    .line 770
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 771
    .line 772
    move-object/from16 v0, p1

    .line 773
    .line 774
    check-cast v0, La/hcz;

    .line 775
    .line 776
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    iget-object v1, v14, La/bb00;->e:La/a4x;

    .line 780
    .line 781
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    check-cast v1, La/ynp0;

    .line 786
    .line 787
    iget-object v1, v1, La/ynp0;->b:La/a4x;

    .line 788
    .line 789
    new-instance v3, La/zc70;

    .line 790
    .line 791
    const/16 v4, 0x8

    .line 792
    .line 793
    invoke-direct {v3, v4}, La/zc70;-><init>(B)V

    .line 794
    .line 795
    .line 796
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 797
    .line 798
    .line 799
    move-result v4

    .line 800
    new-instance v5, La/m160;

    .line 801
    .line 802
    const/16 v6, 0xb

    .line 803
    .line 804
    invoke-direct {v5, v3, v1, v6}, La/m160;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 805
    .line 806
    .line 807
    new-instance v3, La/ubn;

    .line 808
    .line 809
    const/16 v6, 0xf

    .line 810
    .line 811
    invoke-direct {v3, v1, v6}, La/ubn;-><init>(La/a4x;B)V

    .line 812
    .line 813
    .line 814
    new-instance v6, La/h8w;

    .line 815
    .line 816
    invoke-direct {v6, v1, v14, v13, v2}, La/h8w;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 817
    .line 818
    .line 819
    new-instance v1, La/ugd;

    .line 820
    .line 821
    const v2, 0x799532c4

    .line 822
    .line 823
    .line 824
    const/4 v7, 0x1

    .line 825
    invoke-direct {v1, v2, v7, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v0, v4, v5, v3, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_e
    check-cast v14, Ljava/util/ArrayList;

    .line 835
    .line 836
    check-cast v13, Ljava/util/ArrayList;

    .line 837
    .line 838
    move-object/from16 v0, p1

    .line 839
    .line 840
    check-cast v0, La/ou90;

    .line 841
    .line 842
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 846
    .line 847
    .line 848
    move-result v1

    .line 849
    const/4 v2, 0x0

    .line 850
    :goto_10
    if-ge v2, v1, :cond_1b

    .line 851
    .line 852
    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 853
    .line 854
    .line 855
    move-result-object v3

    .line 856
    check-cast v3, La/pu90;

    .line 857
    .line 858
    const/4 v4, 0x0

    .line 859
    invoke-virtual {v0, v3, v4, v12, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 860
    .line 861
    .line 862
    add-int/lit8 v2, v2, 0x1

    .line 863
    .line 864
    goto :goto_10

    .line 865
    :cond_1b
    const/4 v4, 0x0

    .line 866
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    move v2, v4

    .line 871
    :goto_11
    if-ge v2, v1, :cond_1c

    .line 872
    .line 873
    invoke-virtual {v13, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 874
    .line 875
    .line 876
    move-result-object v3

    .line 877
    check-cast v3, La/pu90;

    .line 878
    .line 879
    invoke-virtual {v0, v3, v4, v4, v8}, La/ou90;->g(La/pu90;IIF)V

    .line 880
    .line 881
    .line 882
    add-int/lit8 v2, v2, 0x1

    .line 883
    .line 884
    goto :goto_11

    .line 885
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 886
    .line 887
    return-object v0

    .line 888
    :pswitch_f
    check-cast v14, La/bu20;

    .line 889
    .line 890
    check-cast v13, La/pao;

    .line 891
    .line 892
    move-object/from16 v0, p1

    .line 893
    .line 894
    check-cast v0, Landroid/view/View;

    .line 895
    .line 896
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    iget-object v0, v14, La/bu20;->j:La/xdr;

    .line 900
    .line 901
    if-eqz v0, :cond_1d

    .line 902
    .line 903
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 904
    .line 905
    .line 906
    move-result-object v1

    .line 907
    invoke-virtual {v13}, La/pao;->a()Z

    .line 908
    .line 909
    .line 910
    move-result v2

    .line 911
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 912
    .line 913
    .line 914
    move-result-object v2

    .line 915
    invoke-interface {v0, v13, v1, v2}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 916
    .line 917
    .line 918
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 919
    .line 920
    return-object v0

    .line 921
    :pswitch_10
    check-cast v14, La/sg10;

    .line 922
    .line 923
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 924
    .line 925
    move-object/from16 v0, p1

    .line 926
    .line 927
    check-cast v0, La/hcz;

    .line 928
    .line 929
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    check-cast v14, La/qg10;

    .line 933
    .line 934
    iget-object v1, v14, La/qg10;->a:La/a4x;

    .line 935
    .line 936
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 937
    .line 938
    .line 939
    move-result v3

    .line 940
    new-instance v5, La/ubn;

    .line 941
    .line 942
    invoke-direct {v5, v1, v2}, La/ubn;-><init>(La/a4x;B)V

    .line 943
    .line 944
    .line 945
    new-instance v2, La/ws1;

    .line 946
    .line 947
    invoke-direct {v2, v1, v13, v12}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;I)V

    .line 948
    .line 949
    .line 950
    new-instance v1, La/ugd;

    .line 951
    .line 952
    const/4 v7, 0x1

    .line 953
    invoke-direct {v1, v4, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v0, v3, v9, v5, v1}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 957
    .line 958
    .line 959
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_11
    move v4, v10

    .line 963
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 964
    .line 965
    check-cast v13, La/mcz;

    .line 966
    .line 967
    move-object/from16 v0, p1

    .line 968
    .line 969
    check-cast v0, La/ktb0;

    .line 970
    .line 971
    if-eqz v14, :cond_23

    .line 972
    .line 973
    iget-object v1, v0, La/ktb0;->e:La/a5n0;

    .line 974
    .line 975
    if-eqz v1, :cond_1e

    .line 976
    .line 977
    invoke-interface {v1}, La/a5n0;->c()I

    .line 978
    .line 979
    .line 980
    move-result v1

    .line 981
    goto :goto_12

    .line 982
    :cond_1e
    move v1, v4

    .line 983
    :goto_12
    move v10, v4

    .line 984
    :goto_13
    if-ge v10, v1, :cond_22

    .line 985
    .line 986
    iget-object v2, v13, La/mcz;->q:La/ma80;

    .line 987
    .line 988
    sget-object v3, La/ma80;->a:La/ma80;

    .line 989
    .line 990
    iget-object v5, v0, La/ktb0;->e:La/a5n0;

    .line 991
    .line 992
    const-wide/16 v6, 0x0

    .line 993
    .line 994
    if-ne v2, v3, :cond_20

    .line 995
    .line 996
    if-eqz v5, :cond_1f

    .line 997
    .line 998
    invoke-interface {v5, v10}, La/a5n0;->b(I)J

    .line 999
    .line 1000
    .line 1001
    move-result-wide v6

    .line 1002
    :cond_1f
    const-wide v2, 0xffffffffL

    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    and-long/2addr v2, v6

    .line 1008
    :goto_14
    long-to-int v2, v2

    .line 1009
    goto :goto_15

    .line 1010
    :cond_20
    if-eqz v5, :cond_21

    .line 1011
    .line 1012
    invoke-interface {v5, v10}, La/a5n0;->b(I)J

    .line 1013
    .line 1014
    .line 1015
    move-result-wide v6

    .line 1016
    :cond_21
    const/16 v2, 0x20

    .line 1017
    .line 1018
    shr-long v2, v6, v2

    .line 1019
    .line 1020
    goto :goto_14

    .line 1021
    :goto_15
    add-int/2addr v4, v2

    .line 1022
    add-int/lit8 v10, v10, 0x1

    .line 1023
    .line 1024
    goto :goto_13

    .line 1025
    :cond_22
    new-instance v0, La/ocz;

    .line 1026
    .line 1027
    invoke-direct {v0, v12, v4}, La/ocz;-><init>(II)V

    .line 1028
    .line 1029
    .line 1030
    invoke-interface {v14, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1031
    .line 1032
    .line 1033
    :cond_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1034
    .line 1035
    return-object v0

    .line 1036
    :pswitch_12
    move v4, v10

    .line 1037
    check-cast v14, La/l7m;

    .line 1038
    .line 1039
    check-cast v13, La/vpm0;

    .line 1040
    .line 1041
    move-object/from16 v0, p1

    .line 1042
    .line 1043
    check-cast v0, La/hcz;

    .line 1044
    .line 1045
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1046
    .line 1047
    .line 1048
    iget-object v1, v14, La/l7m;->e:La/a4x;

    .line 1049
    .line 1050
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v1

    .line 1054
    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1055
    .line 1056
    .line 1057
    move-result v2

    .line 1058
    if-eqz v2, :cond_27

    .line 1059
    .line 1060
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v2

    .line 1064
    add-int/lit8 v3, v10, 0x1

    .line 1065
    .line 1066
    if-ltz v10, :cond_26

    .line 1067
    .line 1068
    check-cast v2, La/q7m;

    .line 1069
    .line 1070
    const/4 v4, 0x3

    .line 1071
    if-lez v12, :cond_24

    .line 1072
    .line 1073
    iget-object v6, v14, La/l7m;->e:La/a4x;

    .line 1074
    .line 1075
    invoke-static {v6}, La/q3d;->i(Ljava/util/List;)I

    .line 1076
    .line 1077
    .line 1078
    move-result v6

    .line 1079
    if-ne v10, v6, :cond_24

    .line 1080
    .line 1081
    new-instance v6, La/ec30;

    .line 1082
    .line 1083
    invoke-direct {v6, v2, v13, v5}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1084
    .line 1085
    .line 1086
    new-instance v2, La/ugd;

    .line 1087
    .line 1088
    const v7, 0x327e9d39

    .line 1089
    .line 1090
    .line 1091
    const/4 v10, 0x1

    .line 1092
    invoke-direct {v2, v7, v10, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1093
    .line 1094
    .line 1095
    invoke-static {v0, v2, v4}, La/hcz;->h(La/hcz;La/ugd;I)V

    .line 1096
    .line 1097
    .line 1098
    iget v2, v13, La/vpm0;->b:F

    .line 1099
    .line 1100
    sget-object v6, La/qmk;->a:La/zcl;

    .line 1101
    .line 1102
    invoke-static {v2, v8}, La/ycl;->a(FF)I

    .line 1103
    .line 1104
    .line 1105
    move-result v2

    .line 1106
    if-lez v2, :cond_25

    .line 1107
    .line 1108
    new-instance v2, La/sd8;

    .line 1109
    .line 1110
    const/16 v6, 0x1d

    .line 1111
    .line 1112
    invoke-direct {v2, v13, v6}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 1113
    .line 1114
    .line 1115
    new-instance v6, La/ugd;

    .line 1116
    .line 1117
    const v7, -0x6c4b5f8

    .line 1118
    .line 1119
    .line 1120
    invoke-direct {v6, v7, v10, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v0, v9, v9, v6, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1124
    .line 1125
    .line 1126
    goto :goto_17

    .line 1127
    :cond_24
    iget-object v6, v14, La/l7m;->d:La/a4x;

    .line 1128
    .line 1129
    invoke-static {v10, v6}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v6

    .line 1133
    check-cast v6, La/f7m;

    .line 1134
    .line 1135
    invoke-static {v6}, La/dub;->k0(La/f7m;)F

    .line 1136
    .line 1137
    .line 1138
    move-result v6

    .line 1139
    new-instance v7, La/h7m;

    .line 1140
    .line 1141
    invoke-direct {v7, v2, v6}, La/h7m;-><init>(La/q7m;F)V

    .line 1142
    .line 1143
    .line 1144
    new-instance v2, La/ugd;

    .line 1145
    .line 1146
    const v6, -0x644f93ca

    .line 1147
    .line 1148
    .line 1149
    const/4 v10, 0x1

    .line 1150
    invoke-direct {v2, v6, v10, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1151
    .line 1152
    .line 1153
    invoke-static {v0, v9, v9, v2, v4}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 1154
    .line 1155
    .line 1156
    :cond_25
    :goto_17
    move v10, v3

    .line 1157
    goto :goto_16

    .line 1158
    :cond_26
    invoke-static {}, La/q3d;->p()V

    .line 1159
    .line 1160
    .line 1161
    throw v9

    .line 1162
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1163
    .line 1164
    return-object v0

    .line 1165
    :pswitch_13
    check-cast v14, Ljava/lang/Integer;

    .line 1166
    .line 1167
    check-cast v13, La/pz40;

    .line 1168
    .line 1169
    move-object/from16 v0, p1

    .line 1170
    .line 1171
    check-cast v0, La/abi0;

    .line 1172
    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v1

    .line 1180
    check-cast v1, Ljava/lang/Boolean;

    .line 1181
    .line 1182
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v1

    .line 1186
    invoke-static {v0, v1}, La/cbi0;->d(La/abi0;Z)V

    .line 1187
    .line 1188
    .line 1189
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1190
    .line 1191
    .line 1192
    move-result-object v1

    .line 1193
    check-cast v1, Ljava/lang/Boolean;

    .line 1194
    .line 1195
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1196
    .line 1197
    .line 1198
    move-result v1

    .line 1199
    if-nez v1, :cond_29

    .line 1200
    .line 1201
    if-eqz v14, :cond_28

    .line 1202
    .line 1203
    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    .line 1204
    .line 1205
    .line 1206
    move-result v12

    .line 1207
    :cond_28
    invoke-static {v0, v12}, La/cbi0;->c(La/abi0;I)V

    .line 1208
    .line 1209
    .line 1210
    :cond_29
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1211
    .line 1212
    return-object v0

    .line 1213
    :pswitch_14
    check-cast v14, La/uzg;

    .line 1214
    .line 1215
    move-object v3, v13

    .line 1216
    check-cast v3, Ljava/lang/String;

    .line 1217
    .line 1218
    move-object/from16 v6, p1

    .line 1219
    .line 1220
    check-cast v6, La/k0w0;

    .line 1221
    .line 1222
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1223
    .line 1224
    .line 1225
    iget-object v1, v14, La/uzg;->g:La/nv20;

    .line 1226
    .line 1227
    iget-object v1, v1, La/nv20;->a:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v1, La/h6i;

    .line 1230
    .line 1231
    invoke-virtual {v1}, La/h6i;->c()La/yox;

    .line 1232
    .line 1233
    .line 1234
    move-result-object v1

    .line 1235
    new-instance v2, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;

    .line 1236
    .line 1237
    move-object v4, v2

    .line 1238
    const v2, 0x7f1317e4

    .line 1239
    .line 1240
    .line 1241
    iget v0, v0, La/g18;->b:I

    .line 1242
    .line 1243
    const/4 v5, 0x0

    .line 1244
    move-object/from16 v19, v4

    .line 1245
    .line 1246
    move v4, v0

    .line 1247
    move-object/from16 v0, v19

    .line 1248
    .line 1249
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/rules/impl/navigation/PaymentInfoScreenFactoryImpl$getPaymentInfoScreen$1;-><init>(La/yox;ILjava/lang/String;IZ)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v6, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1253
    .line 1254
    .line 1255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :pswitch_15
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1259
    .line 1260
    check-cast v13, La/a4x;

    .line 1261
    .line 1262
    move-object/from16 v0, p1

    .line 1263
    .line 1264
    check-cast v0, La/uag0;

    .line 1265
    .line 1266
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    invoke-interface {v14}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    check-cast v1, Ljava/lang/Number;

    .line 1274
    .line 1275
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 1276
    .line 1277
    .line 1278
    move-result v1

    .line 1279
    float-to-int v1, v1

    .line 1280
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 1281
    .line 1282
    .line 1283
    move-result v2

    .line 1284
    const/16 v17, 0x1

    .line 1285
    .line 1286
    add-int/lit8 v2, v2, -0x1

    .line 1287
    .line 1288
    if-le v1, v2, :cond_2a

    .line 1289
    .line 1290
    move v1, v2

    .line 1291
    :cond_2a
    if-ne v1, v12, :cond_2b

    .line 1292
    .line 1293
    const/high16 v8, 0x3f800000    # 1.0f

    .line 1294
    .line 1295
    :cond_2b
    invoke-virtual {v0, v8}, La/uag0;->b(F)V

    .line 1296
    .line 1297
    .line 1298
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1299
    .line 1300
    return-object v0

    .line 1301
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_15
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
