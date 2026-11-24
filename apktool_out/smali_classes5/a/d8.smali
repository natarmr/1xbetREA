.class public final synthetic La/d8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l8;


# direct methods
.method public synthetic constructor <init>(La/l8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d8;->a:B

    iput-object p1, p0, La/d8;->b:La/l8;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d8;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/d8;->b:La/l8;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/l8;->P1:La/pek0;

    .line 12
    .line 13
    iget-object v0, v0, La/l8;->N1:La/a8z;

    .line 14
    .line 15
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, La/s5i;

    .line 20
    .line 21
    iget-object v0, v0, La/s5i;->y:La/n5d0;

    .line 22
    .line 23
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, La/p5i;

    .line 28
    .line 29
    return-object v0

    .line 30
    :pswitch_0
    sget-object v1, La/l8;->P1:La/pek0;

    .line 31
    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of v3, v1, La/af3;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    if-eqz v3, :cond_0

    .line 47
    .line 48
    check-cast v1, La/af3;

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    move-object v1, v4

    .line 52
    :goto_0
    const-class v3, La/o9;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v1, v3}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/o5d0;

    .line 65
    .line 66
    if-eqz v1, :cond_1

    .line 67
    .line 68
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v1, La/ze3;

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    move-object v1, v4

    .line 76
    :goto_1
    instance-of v5, v1, La/o9;

    .line 77
    .line 78
    if-nez v5, :cond_2

    .line 79
    .line 80
    move-object v1, v4

    .line 81
    :cond_2
    check-cast v1, La/o9;

    .line 82
    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    invoke-virtual {v1, v0, v2}, La/o9;->a(La/i1w0;Z)La/s5i;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    goto :goto_2

    .line 94
    :cond_3
    const-string v0, "Cannot create dependency "

    .line 95
    .line 96
    invoke-static {v3, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    :goto_2
    return-object v4

    .line 104
    :pswitch_1
    sget-object v1, La/l8;->P1:La/pek0;

    .line 105
    .line 106
    new-instance v1, La/z8;

    .line 107
    .line 108
    new-instance v3, La/e8;

    .line 109
    .line 110
    invoke-direct {v3, v0, v2}, La/e8;-><init>(La/l8;B)V

    .line 111
    .line 112
    .line 113
    new-instance v4, La/iob0;

    .line 114
    .line 115
    const/16 v5, 0x16

    .line 116
    .line 117
    invoke-direct {v4, v0, v5}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    new-instance v6, La/e8;

    .line 121
    .line 122
    const/4 v7, 0x1

    .line 123
    invoke-direct {v6, v0, v7}, La/e8;-><init>(La/l8;B)V

    .line 124
    .line 125
    .line 126
    new-instance v8, La/e8;

    .line 127
    .line 128
    const/4 v9, 0x2

    .line 129
    invoke-direct {v8, v0, v9}, La/e8;-><init>(La/l8;B)V

    .line 130
    .line 131
    .line 132
    new-instance v10, La/e8;

    .line 133
    .line 134
    const/4 v11, 0x3

    .line 135
    invoke-direct {v10, v0, v11}, La/e8;-><init>(La/l8;B)V

    .line 136
    .line 137
    .line 138
    new-instance v12, La/t0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/l8;->H0()La/ab;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x2

    .line 147
    .line 148
    const/4 v13, 0x1

    .line 149
    const-class v15, La/ab;

    .line 150
    .line 151
    const-string v16, "onAccordionClick"

    .line 152
    .line 153
    const-string v17, "onAccordionClick(Lorg/xplatform/main_menu/impl/presentation/common/models/AccordionTabUiItem$SimpleAccordionMenuUiItem;)V"

    .line 154
    .line 155
    invoke-direct/range {v12 .. v19}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 156
    .line 157
    .line 158
    new-instance v20, La/f8;

    .line 159
    .line 160
    invoke-virtual {v0}, La/l8;->H0()La/ab;

    .line 161
    .line 162
    .line 163
    move-result-object v22

    .line 164
    const/16 v26, 0x0

    .line 165
    .line 166
    const/16 v27, 0x0

    .line 167
    .line 168
    const/16 v21, 0x0

    .line 169
    .line 170
    const-string v24, "onEndCallClicked"

    .line 171
    .line 172
    const-string v25, "onEndCallClicked()V"

    .line 173
    .line 174
    move-object/from16 v23, v15

    .line 175
    .line 176
    invoke-direct/range {v20 .. v27}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v0, v20

    .line 180
    .line 181
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 182
    .line 183
    .line 184
    new-instance v13, La/o33;

    .line 185
    .line 186
    const/16 v14, 0x15

    .line 187
    .line 188
    invoke-direct {v13, v14}, La/o33;-><init>(B)V

    .line 189
    .line 190
    .line 191
    new-instance v14, La/eq4;

    .line 192
    .line 193
    invoke-direct {v14, v3, v2}, La/eq4;-><init>(La/e8;B)V

    .line 194
    .line 195
    .line 196
    new-instance v15, La/l9;

    .line 197
    .line 198
    const/16 v9, 0x1b

    .line 199
    .line 200
    invoke-direct {v15, v11, v9}, La/l9;-><init>(IB)V

    .line 201
    .line 202
    .line 203
    sget-object v9, La/zx3;->g:La/zx3;

    .line 204
    .line 205
    new-instance v5, La/gbn;

    .line 206
    .line 207
    invoke-direct {v5, v13, v15, v14, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 208
    .line 209
    .line 210
    iget-object v9, v1, La/zz3;->d:La/dp;

    .line 211
    .line 212
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 213
    .line 214
    .line 215
    invoke-static {v3}, La/cwr0;->O(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 216
    .line 217
    .line 218
    move-result-object v5

    .line 219
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 220
    .line 221
    .line 222
    new-instance v5, La/sfc;

    .line 223
    .line 224
    const/16 v13, 0x14

    .line 225
    .line 226
    invoke-direct {v5, v13}, La/sfc;-><init>(B)V

    .line 227
    .line 228
    .line 229
    new-instance v13, La/eq4;

    .line 230
    .line 231
    invoke-direct {v13, v3, v7}, La/eq4;-><init>(La/e8;B)V

    .line 232
    .line 233
    .line 234
    new-instance v14, La/tad;

    .line 235
    .line 236
    const/4 v15, 0x5

    .line 237
    invoke-direct {v14, v11, v15}, La/tad;-><init>(IB)V

    .line 238
    .line 239
    .line 240
    sget-object v7, La/qja;->p:La/qja;

    .line 241
    .line 242
    new-instance v15, La/gbn;

    .line 243
    .line 244
    invoke-direct {v15, v5, v14, v13, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v3}, La/m7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 251
    .line 252
    .line 253
    move-result-object v5

    .line 254
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 255
    .line 256
    .line 257
    new-instance v5, La/qbd;

    .line 258
    .line 259
    invoke-direct {v5, v2}, La/qbd;-><init>(B)V

    .line 260
    .line 261
    .line 262
    new-instance v2, La/eq4;

    .line 263
    .line 264
    const/4 v7, 0x7

    .line 265
    invoke-direct {v2, v3, v7}, La/eq4;-><init>(La/e8;B)V

    .line 266
    .line 267
    .line 268
    new-instance v13, La/tad;

    .line 269
    .line 270
    const/16 v14, 0xf

    .line 271
    .line 272
    invoke-direct {v13, v11, v14}, La/tad;-><init>(IB)V

    .line 273
    .line 274
    .line 275
    sget-object v14, La/qja;->z:La/qja;

    .line 276
    .line 277
    new-instance v15, La/gbn;

    .line 278
    .line 279
    invoke-direct {v15, v5, v13, v2, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v9, v15}, La/dp;->b(La/gbn;)V

    .line 283
    .line 284
    .line 285
    new-instance v2, La/sfc;

    .line 286
    .line 287
    const/16 v5, 0x16

    .line 288
    .line 289
    invoke-direct {v2, v5}, La/sfc;-><init>(B)V

    .line 290
    .line 291
    .line 292
    new-instance v5, La/eq4;

    .line 293
    .line 294
    const/4 v13, 0x2

    .line 295
    invoke-direct {v5, v3, v13}, La/eq4;-><init>(La/e8;B)V

    .line 296
    .line 297
    .line 298
    new-instance v13, La/tad;

    .line 299
    .line 300
    invoke-direct {v13, v11, v7}, La/tad;-><init>(IB)V

    .line 301
    .line 302
    .line 303
    sget-object v7, La/qja;->r:La/qja;

    .line 304
    .line 305
    new-instance v14, La/gbn;

    .line 306
    .line 307
    invoke-direct {v14, v2, v13, v5, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 308
    .line 309
    .line 310
    invoke-virtual {v9, v14}, La/dp;->b(La/gbn;)V

    .line 311
    .line 312
    .line 313
    invoke-static {v3}, La/l7x;->K(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-virtual {v9, v2}, La/dp;->b(La/gbn;)V

    .line 318
    .line 319
    .line 320
    new-instance v2, La/sfc;

    .line 321
    .line 322
    const/16 v5, 0x1c

    .line 323
    .line 324
    invoke-direct {v2, v5}, La/sfc;-><init>(B)V

    .line 325
    .line 326
    .line 327
    new-instance v5, La/eq4;

    .line 328
    .line 329
    const/4 v7, 0x5

    .line 330
    invoke-direct {v5, v3, v7}, La/eq4;-><init>(La/e8;B)V

    .line 331
    .line 332
    .line 333
    new-instance v7, La/tad;

    .line 334
    .line 335
    const/16 v13, 0xd

    .line 336
    .line 337
    invoke-direct {v7, v11, v13}, La/tad;-><init>(IB)V

    .line 338
    .line 339
    .line 340
    sget-object v13, La/qja;->x:La/qja;

    .line 341
    .line 342
    new-instance v14, La/gbn;

    .line 343
    .line 344
    invoke-direct {v14, v2, v7, v5, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v9, v14}, La/dp;->b(La/gbn;)V

    .line 348
    .line 349
    .line 350
    invoke-static {v3}, La/k7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-virtual {v9, v2}, La/dp;->b(La/gbn;)V

    .line 355
    .line 356
    .line 357
    invoke-static {v3}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v9, v2}, La/dp;->b(La/gbn;)V

    .line 362
    .line 363
    .line 364
    new-instance v2, La/sfc;

    .line 365
    .line 366
    const/16 v5, 0x1d

    .line 367
    .line 368
    invoke-direct {v2, v5}, La/sfc;-><init>(B)V

    .line 369
    .line 370
    .line 371
    new-instance v5, La/eq4;

    .line 372
    .line 373
    const/4 v7, 0x6

    .line 374
    invoke-direct {v5, v3, v7}, La/eq4;-><init>(La/e8;B)V

    .line 375
    .line 376
    .line 377
    new-instance v7, La/tad;

    .line 378
    .line 379
    const/16 v13, 0xe

    .line 380
    .line 381
    invoke-direct {v7, v11, v13}, La/tad;-><init>(IB)V

    .line 382
    .line 383
    .line 384
    sget-object v13, La/qja;->y:La/qja;

    .line 385
    .line 386
    new-instance v14, La/gbn;

    .line 387
    .line 388
    invoke-direct {v14, v2, v7, v5, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 389
    .line 390
    .line 391
    invoke-virtual {v9, v14}, La/dp;->b(La/gbn;)V

    .line 392
    .line 393
    .line 394
    invoke-static {v0, v3}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 395
    .line 396
    .line 397
    move-result-object v0

    .line 398
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 399
    .line 400
    .line 401
    new-instance v0, La/sfc;

    .line 402
    .line 403
    const/16 v2, 0x1a

    .line 404
    .line 405
    invoke-direct {v0, v2}, La/sfc;-><init>(B)V

    .line 406
    .line 407
    .line 408
    new-instance v2, La/eq4;

    .line 409
    .line 410
    invoke-direct {v2, v3, v11}, La/eq4;-><init>(La/e8;B)V

    .line 411
    .line 412
    .line 413
    new-instance v5, La/tad;

    .line 414
    .line 415
    const/16 v7, 0xb

    .line 416
    .line 417
    invoke-direct {v5, v11, v7}, La/tad;-><init>(IB)V

    .line 418
    .line 419
    .line 420
    sget-object v7, La/qja;->v:La/qja;

    .line 421
    .line 422
    new-instance v13, La/gbn;

    .line 423
    .line 424
    invoke-direct {v13, v0, v5, v2, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v9, v13}, La/dp;->b(La/gbn;)V

    .line 428
    .line 429
    .line 430
    invoke-static {v3, v4}, La/p7x;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 435
    .line 436
    .line 437
    invoke-static {v6}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 442
    .line 443
    .line 444
    invoke-static {v6}, La/n7x;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 449
    .line 450
    .line 451
    invoke-static {v8}, La/ihm0;->m(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 456
    .line 457
    .line 458
    invoke-static {v3}, La/zcm0;->l(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 463
    .line 464
    .line 465
    invoke-static {v12}, La/ahy;->Y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 466
    .line 467
    .line 468
    move-result-object v0

    .line 469
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 470
    .line 471
    .line 472
    invoke-static {v10}, La/ny9;->R(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    invoke-virtual {v9, v0}, La/dp;->b(La/gbn;)V

    .line 477
    .line 478
    .line 479
    new-instance v0, La/sfc;

    .line 480
    .line 481
    const/16 v2, 0x1b

    .line 482
    .line 483
    invoke-direct {v0, v2}, La/sfc;-><init>(B)V

    .line 484
    .line 485
    .line 486
    new-instance v2, La/eq4;

    .line 487
    .line 488
    const/4 v4, 0x4

    .line 489
    invoke-direct {v2, v3, v4}, La/eq4;-><init>(La/e8;B)V

    .line 490
    .line 491
    .line 492
    new-instance v4, La/tad;

    .line 493
    .line 494
    const/16 v5, 0xc

    .line 495
    .line 496
    invoke-direct {v4, v11, v5}, La/tad;-><init>(IB)V

    .line 497
    .line 498
    .line 499
    sget-object v5, La/qja;->w:La/qja;

    .line 500
    .line 501
    new-instance v6, La/gbn;

    .line 502
    .line 503
    invoke-direct {v6, v0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 504
    .line 505
    .line 506
    invoke-virtual {v9, v6}, La/dp;->b(La/gbn;)V

    .line 507
    .line 508
    .line 509
    new-instance v0, La/qbd;

    .line 510
    .line 511
    const/4 v13, 0x2

    .line 512
    invoke-direct {v0, v13}, La/qbd;-><init>(B)V

    .line 513
    .line 514
    .line 515
    new-instance v2, La/eq4;

    .line 516
    .line 517
    const/16 v4, 0x9

    .line 518
    .line 519
    invoke-direct {v2, v3, v4}, La/eq4;-><init>(La/e8;B)V

    .line 520
    .line 521
    .line 522
    new-instance v4, La/tad;

    .line 523
    .line 524
    const/16 v5, 0x11

    .line 525
    .line 526
    invoke-direct {v4, v11, v5}, La/tad;-><init>(IB)V

    .line 527
    .line 528
    .line 529
    sget-object v5, La/qja;->B:La/qja;

    .line 530
    .line 531
    new-instance v6, La/gbn;

    .line 532
    .line 533
    invoke-direct {v6, v0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v9, v6}, La/dp;->b(La/gbn;)V

    .line 537
    .line 538
    .line 539
    new-instance v0, La/qbd;

    .line 540
    .line 541
    const/4 v2, 0x1

    .line 542
    invoke-direct {v0, v2}, La/qbd;-><init>(B)V

    .line 543
    .line 544
    .line 545
    new-instance v2, La/eq4;

    .line 546
    .line 547
    const/16 v4, 0x8

    .line 548
    .line 549
    invoke-direct {v2, v3, v4}, La/eq4;-><init>(La/e8;B)V

    .line 550
    .line 551
    .line 552
    new-instance v3, La/tad;

    .line 553
    .line 554
    const/16 v4, 0x10

    .line 555
    .line 556
    invoke-direct {v3, v11, v4}, La/tad;-><init>(IB)V

    .line 557
    .line 558
    .line 559
    sget-object v4, La/qja;->A:La/qja;

    .line 560
    .line 561
    new-instance v5, La/gbn;

    .line 562
    .line 563
    invoke-direct {v5, v0, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {v9, v5}, La/dp;->b(La/gbn;)V

    .line 567
    .line 568
    .line 569
    return-object v1

    .line 570
    nop

    .line 571
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
