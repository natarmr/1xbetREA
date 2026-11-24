.class public final synthetic La/u8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y8;


# direct methods
.method public synthetic constructor <init>(La/y8;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/u8;->a:B

    iput-object p1, p0, La/u8;->b:La/y8;

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
    iget-byte v1, v0, La/u8;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/u8;->b:La/y8;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/y8;->P1:La/qek0;

    .line 12
    .line 13
    iget-object v0, v0, La/y8;->N1:La/a8z;

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
    sget-object v1, La/y8;->P1:La/qek0;

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
    sget-object v1, La/y8;->P1:La/qek0;

    .line 105
    .line 106
    new-instance v1, La/t8;

    .line 107
    .line 108
    new-instance v3, La/v8;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, v0, v4}, La/v8;-><init>(La/y8;B)V

    .line 112
    .line 113
    .line 114
    new-instance v5, La/iob0;

    .line 115
    .line 116
    const/16 v6, 0x17

    .line 117
    .line 118
    invoke-direct {v5, v0, v6}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    new-instance v7, La/v8;

    .line 122
    .line 123
    invoke-direct {v7, v0, v2}, La/v8;-><init>(La/y8;B)V

    .line 124
    .line 125
    .line 126
    new-instance v8, La/v8;

    .line 127
    .line 128
    const/4 v9, 0x2

    .line 129
    invoke-direct {v8, v0, v9}, La/v8;-><init>(La/y8;B)V

    .line 130
    .line 131
    .line 132
    new-instance v10, La/v8;

    .line 133
    .line 134
    const/4 v11, 0x3

    .line 135
    invoke-direct {v10, v0, v11}, La/v8;-><init>(La/y8;B)V

    .line 136
    .line 137
    .line 138
    new-instance v12, La/t0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/y8;->H0()La/ab;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x3

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
    invoke-virtual {v0}, La/y8;->H0()La/ab;

    .line 161
    .line 162
    .line 163
    move-result-object v22

    .line 164
    const/16 v26, 0x0

    .line 165
    .line 166
    const/16 v27, 0x1

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
    invoke-direct {v13, v6}, La/o33;-><init>(B)V

    .line 187
    .line 188
    .line 189
    new-instance v14, La/jq4;

    .line 190
    .line 191
    invoke-direct {v14, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 192
    .line 193
    .line 194
    new-instance v15, La/l9;

    .line 195
    .line 196
    const/16 v9, 0x1d

    .line 197
    .line 198
    invoke-direct {v15, v11, v9}, La/l9;-><init>(IB)V

    .line 199
    .line 200
    .line 201
    sget-object v6, La/zx3;->i:La/zx3;

    .line 202
    .line 203
    new-instance v2, La/gbn;

    .line 204
    .line 205
    invoke-direct {v2, v13, v15, v14, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 206
    .line 207
    .line 208
    iget-object v6, v1, La/zz3;->d:La/dp;

    .line 209
    .line 210
    invoke-virtual {v6, v2}, La/dp;->b(La/gbn;)V

    .line 211
    .line 212
    .line 213
    invoke-static {v3}, La/cwr0;->O(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 214
    .line 215
    .line 216
    move-result-object v2

    .line 217
    invoke-virtual {v6, v2}, La/dp;->b(La/gbn;)V

    .line 218
    .line 219
    .line 220
    new-instance v2, La/kyz;

    .line 221
    .line 222
    const/16 v13, 0x8

    .line 223
    .line 224
    invoke-direct {v2, v13}, La/kyz;-><init>(B)V

    .line 225
    .line 226
    .line 227
    new-instance v14, La/jq4;

    .line 228
    .line 229
    invoke-direct {v14, v3, v13}, La/jq4;-><init>(La/v8;B)V

    .line 230
    .line 231
    .line 232
    new-instance v13, La/tvx;

    .line 233
    .line 234
    const/16 v15, 0xb

    .line 235
    .line 236
    invoke-direct {v13, v11, v15}, La/tvx;-><init>(IB)V

    .line 237
    .line 238
    .line 239
    sget-object v4, La/gvy;->l:La/gvy;

    .line 240
    .line 241
    new-instance v15, La/gbn;

    .line 242
    .line 243
    invoke-direct {v15, v2, v13, v14, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v6, v15}, La/dp;->b(La/gbn;)V

    .line 247
    .line 248
    .line 249
    new-instance v2, La/kyz;

    .line 250
    .line 251
    const/4 v4, 0x6

    .line 252
    invoke-direct {v2, v4}, La/kyz;-><init>(B)V

    .line 253
    .line 254
    .line 255
    new-instance v13, La/thd;

    .line 256
    .line 257
    const/16 v14, 0x1c

    .line 258
    .line 259
    invoke-direct {v13, v14}, La/thd;-><init>(B)V

    .line 260
    .line 261
    .line 262
    new-instance v14, La/jq4;

    .line 263
    .line 264
    invoke-direct {v14, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 265
    .line 266
    .line 267
    sget-object v4, La/gvy;->j:La/gvy;

    .line 268
    .line 269
    new-instance v15, La/gbn;

    .line 270
    .line 271
    invoke-direct {v15, v2, v13, v14, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v6, v15}, La/dp;->b(La/gbn;)V

    .line 275
    .line 276
    .line 277
    new-instance v2, La/kyz;

    .line 278
    .line 279
    const/4 v4, 0x7

    .line 280
    invoke-direct {v2, v4}, La/kyz;-><init>(B)V

    .line 281
    .line 282
    .line 283
    new-instance v13, La/thd;

    .line 284
    .line 285
    invoke-direct {v13, v9}, La/thd;-><init>(B)V

    .line 286
    .line 287
    .line 288
    new-instance v9, La/jq4;

    .line 289
    .line 290
    invoke-direct {v9, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 291
    .line 292
    .line 293
    sget-object v14, La/gvy;->k:La/gvy;

    .line 294
    .line 295
    new-instance v15, La/gbn;

    .line 296
    .line 297
    invoke-direct {v15, v2, v13, v9, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual {v6, v15}, La/dp;->b(La/gbn;)V

    .line 301
    .line 302
    .line 303
    new-instance v2, La/kyz;

    .line 304
    .line 305
    const/4 v9, 0x5

    .line 306
    invoke-direct {v2, v9}, La/kyz;-><init>(B)V

    .line 307
    .line 308
    .line 309
    new-instance v13, La/jq4;

    .line 310
    .line 311
    invoke-direct {v13, v3, v9}, La/jq4;-><init>(La/v8;B)V

    .line 312
    .line 313
    .line 314
    new-instance v9, La/tvx;

    .line 315
    .line 316
    const/16 v14, 0xa

    .line 317
    .line 318
    invoke-direct {v9, v11, v14}, La/tvx;-><init>(IB)V

    .line 319
    .line 320
    .line 321
    sget-object v15, La/gvy;->i:La/gvy;

    .line 322
    .line 323
    new-instance v14, La/gbn;

    .line 324
    .line 325
    invoke-direct {v14, v2, v9, v13, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v6, v14}, La/dp;->b(La/gbn;)V

    .line 329
    .line 330
    .line 331
    new-instance v2, La/svj;

    .line 332
    .line 333
    const/16 v9, 0x19

    .line 334
    .line 335
    invoke-direct {v2, v9}, La/svj;-><init>(B)V

    .line 336
    .line 337
    .line 338
    new-instance v13, La/e3j;

    .line 339
    .line 340
    const/16 v14, 0x16

    .line 341
    .line 342
    invoke-direct {v13, v8, v14}, La/e3j;-><init>(Ljava/lang/Object;B)V

    .line 343
    .line 344
    .line 345
    new-instance v8, La/e9k;

    .line 346
    .line 347
    invoke-direct {v8, v11, v4}, La/e9k;-><init>(IB)V

    .line 348
    .line 349
    .line 350
    sget-object v14, La/zdh;->t:La/zdh;

    .line 351
    .line 352
    new-instance v15, La/gbn;

    .line 353
    .line 354
    invoke-direct {v15, v2, v8, v13, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v6, v15}, La/dp;->b(La/gbn;)V

    .line 358
    .line 359
    .line 360
    invoke-static {v3}, La/m7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    invoke-virtual {v6, v2}, La/dp;->b(La/gbn;)V

    .line 365
    .line 366
    .line 367
    new-instance v2, La/f4m;

    .line 368
    .line 369
    invoke-direct {v2, v9}, La/f4m;-><init>(B)V

    .line 370
    .line 371
    .line 372
    new-instance v8, La/jq4;

    .line 373
    .line 374
    const/4 v9, 0x4

    .line 375
    invoke-direct {v8, v3, v9}, La/jq4;-><init>(La/v8;B)V

    .line 376
    .line 377
    .line 378
    new-instance v9, La/e9k;

    .line 379
    .line 380
    const/16 v13, 0xf

    .line 381
    .line 382
    invoke-direct {v9, v11, v13}, La/e9k;-><init>(IB)V

    .line 383
    .line 384
    .line 385
    sget-object v13, La/zdh;->B:La/zdh;

    .line 386
    .line 387
    new-instance v14, La/gbn;

    .line 388
    .line 389
    invoke-direct {v14, v2, v9, v8, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v6, v14}, La/dp;->b(La/gbn;)V

    .line 393
    .line 394
    .line 395
    new-instance v2, La/zuh;

    .line 396
    .line 397
    const/16 v8, 0x10

    .line 398
    .line 399
    invoke-direct {v2, v8}, La/zuh;-><init>(B)V

    .line 400
    .line 401
    .line 402
    new-instance v9, La/jq4;

    .line 403
    .line 404
    invoke-direct {v9, v3, v11}, La/jq4;-><init>(La/v8;B)V

    .line 405
    .line 406
    .line 407
    new-instance v13, La/pue;

    .line 408
    .line 409
    const/16 v14, 0x1b

    .line 410
    .line 411
    invoke-direct {v13, v11, v14}, La/pue;-><init>(IB)V

    .line 412
    .line 413
    .line 414
    sget-object v15, La/zdh;->j:La/zdh;

    .line 415
    .line 416
    new-instance v4, La/gbn;

    .line 417
    .line 418
    invoke-direct {v4, v2, v13, v9, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v6, v4}, La/dp;->b(La/gbn;)V

    .line 422
    .line 423
    .line 424
    new-instance v2, La/b4u0;

    .line 425
    .line 426
    const/16 v4, 0xb

    .line 427
    .line 428
    invoke-direct {v2, v4}, La/b4u0;-><init>(B)V

    .line 429
    .line 430
    .line 431
    new-instance v9, La/jq4;

    .line 432
    .line 433
    invoke-direct {v9, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 434
    .line 435
    .line 436
    new-instance v4, La/d8q0;

    .line 437
    .line 438
    const/16 v13, 0x15

    .line 439
    .line 440
    invoke-direct {v4, v11, v13}, La/d8q0;-><init>(IB)V

    .line 441
    .line 442
    .line 443
    sget-object v13, La/pfo0;->Z:La/pfo0;

    .line 444
    .line 445
    new-instance v15, La/gbn;

    .line 446
    .line 447
    invoke-direct {v15, v2, v4, v9, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 448
    .line 449
    .line 450
    invoke-virtual {v6, v15}, La/dp;->b(La/gbn;)V

    .line 451
    .line 452
    .line 453
    invoke-static {v3}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 454
    .line 455
    .line 456
    move-result-object v2

    .line 457
    invoke-virtual {v6, v2}, La/dp;->b(La/gbn;)V

    .line 458
    .line 459
    .line 460
    invoke-static {v0, v3}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 465
    .line 466
    .line 467
    new-instance v0, La/gh5;

    .line 468
    .line 469
    const/4 v2, 0x0

    .line 470
    invoke-direct {v0, v2}, La/gh5;-><init>(B)V

    .line 471
    .line 472
    .line 473
    new-instance v2, La/jq4;

    .line 474
    .line 475
    const/4 v4, 0x1

    .line 476
    invoke-direct {v2, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 477
    .line 478
    .line 479
    new-instance v9, La/lq4;

    .line 480
    .line 481
    invoke-direct {v9, v11, v4}, La/lq4;-><init>(IB)V

    .line 482
    .line 483
    .line 484
    sget-object v4, La/zx3;->k:La/zx3;

    .line 485
    .line 486
    new-instance v13, La/gbn;

    .line 487
    .line 488
    invoke-direct {v13, v0, v9, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v6, v13}, La/dp;->b(La/gbn;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v3, v5}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v7}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 506
    .line 507
    .line 508
    invoke-static {v12}, La/ahy;->Y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 513
    .line 514
    .line 515
    invoke-static {v7}, La/n7x;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 520
    .line 521
    .line 522
    invoke-static {v3, v5}, La/p7x;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 527
    .line 528
    .line 529
    invoke-static {v3}, La/k7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 534
    .line 535
    .line 536
    invoke-static {v3}, La/l7x;->K(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 541
    .line 542
    .line 543
    invoke-static {v10}, La/p8a;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    invoke-virtual {v6, v0}, La/dp;->b(La/gbn;)V

    .line 548
    .line 549
    .line 550
    new-instance v0, La/jyf;

    .line 551
    .line 552
    const/16 v2, 0x17

    .line 553
    .line 554
    invoke-direct {v0, v2}, La/jyf;-><init>(B)V

    .line 555
    .line 556
    .line 557
    new-instance v2, La/jq4;

    .line 558
    .line 559
    const/4 v4, 0x2

    .line 560
    invoke-direct {v2, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 561
    .line 562
    .line 563
    new-instance v4, La/pue;

    .line 564
    .line 565
    const/16 v5, 0xa

    .line 566
    .line 567
    invoke-direct {v4, v11, v5}, La/pue;-><init>(IB)V

    .line 568
    .line 569
    .line 570
    sget-object v7, La/fpd;->w:La/fpd;

    .line 571
    .line 572
    new-instance v9, La/gbn;

    .line 573
    .line 574
    invoke-direct {v9, v0, v4, v2, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 575
    .line 576
    .line 577
    invoke-virtual {v6, v9}, La/dp;->b(La/gbn;)V

    .line 578
    .line 579
    .line 580
    new-instance v0, La/efr0;

    .line 581
    .line 582
    invoke-direct {v0, v14}, La/efr0;-><init>(B)V

    .line 583
    .line 584
    .line 585
    new-instance v2, La/jq4;

    .line 586
    .line 587
    invoke-direct {v2, v3, v5}, La/jq4;-><init>(La/v8;B)V

    .line 588
    .line 589
    .line 590
    new-instance v4, La/d8q0;

    .line 591
    .line 592
    invoke-direct {v4, v11, v8}, La/d8q0;-><init>(IB)V

    .line 593
    .line 594
    .line 595
    sget-object v5, La/pfo0;->y:La/pfo0;

    .line 596
    .line 597
    new-instance v7, La/gbn;

    .line 598
    .line 599
    invoke-direct {v7, v0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 600
    .line 601
    .line 602
    invoke-virtual {v6, v7}, La/dp;->b(La/gbn;)V

    .line 603
    .line 604
    .line 605
    new-instance v0, La/jfa0;

    .line 606
    .line 607
    const/4 v2, 0x7

    .line 608
    invoke-direct {v0, v2}, La/jfa0;-><init>(B)V

    .line 609
    .line 610
    .line 611
    new-instance v2, La/jq4;

    .line 612
    .line 613
    const/16 v4, 0x9

    .line 614
    .line 615
    invoke-direct {v2, v3, v4}, La/jq4;-><init>(La/v8;B)V

    .line 616
    .line 617
    .line 618
    new-instance v3, La/iv60;

    .line 619
    .line 620
    const/16 v4, 0x11

    .line 621
    .line 622
    invoke-direct {v3, v11, v4}, La/iv60;-><init>(IB)V

    .line 623
    .line 624
    .line 625
    sget-object v4, La/xk60;->t:La/xk60;

    .line 626
    .line 627
    new-instance v5, La/gbn;

    .line 628
    .line 629
    invoke-direct {v5, v0, v3, v2, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 630
    .line 631
    .line 632
    invoke-virtual {v6, v5}, La/dp;->b(La/gbn;)V

    .line 633
    .line 634
    .line 635
    return-object v1

    .line 636
    nop

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
