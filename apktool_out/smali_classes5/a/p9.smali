.class public final synthetic La/p9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t9;


# direct methods
.method public synthetic constructor <init>(La/t9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p9;->a:B

    iput-object p1, p0, La/p9;->b:La/t9;

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
    iget-byte v1, v0, La/p9;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/p9;->b:La/t9;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/t9;->P1:La/gfk0;

    .line 12
    .line 13
    iget-object v0, v0, La/t9;->N1:La/a8z;

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
    sget-object v1, La/t9;->P1:La/gfk0;

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
    sget-object v1, La/t9;->P1:La/gfk0;

    .line 105
    .line 106
    new-instance v1, La/n9;

    .line 107
    .line 108
    new-instance v3, La/q9;

    .line 109
    .line 110
    const/4 v4, 0x0

    .line 111
    invoke-direct {v3, v0, v4}, La/q9;-><init>(La/t9;B)V

    .line 112
    .line 113
    .line 114
    new-instance v5, La/iob0;

    .line 115
    .line 116
    const/16 v6, 0x19

    .line 117
    .line 118
    invoke-direct {v5, v0, v6}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 119
    .line 120
    .line 121
    new-instance v7, La/q9;

    .line 122
    .line 123
    invoke-direct {v7, v0, v2}, La/q9;-><init>(La/t9;B)V

    .line 124
    .line 125
    .line 126
    new-instance v8, La/q9;

    .line 127
    .line 128
    const/4 v9, 0x2

    .line 129
    invoke-direct {v8, v0, v9}, La/q9;-><init>(La/t9;B)V

    .line 130
    .line 131
    .line 132
    new-instance v10, La/q9;

    .line 133
    .line 134
    const/4 v11, 0x3

    .line 135
    invoke-direct {v10, v0, v11}, La/q9;-><init>(La/t9;B)V

    .line 136
    .line 137
    .line 138
    new-instance v12, La/t0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/t9;->H0()La/ab;

    .line 141
    .line 142
    .line 143
    move-result-object v14

    .line 144
    const/16 v18, 0x0

    .line 145
    .line 146
    const/16 v19, 0x5

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
    invoke-virtual {v0}, La/t9;->H0()La/ab;

    .line 161
    .line 162
    .line 163
    move-result-object v22

    .line 164
    const/16 v26, 0x0

    .line 165
    .line 166
    const/16 v27, 0x3

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
    const/16 v14, 0x13

    .line 187
    .line 188
    invoke-direct {v13, v14}, La/o33;-><init>(B)V

    .line 189
    .line 190
    .line 191
    new-instance v14, La/h9;

    .line 192
    .line 193
    const/4 v15, 0x7

    .line 194
    invoke-direct {v14, v3, v15}, La/h9;-><init>(La/q9;B)V

    .line 195
    .line 196
    .line 197
    new-instance v4, La/l9;

    .line 198
    .line 199
    invoke-direct {v4, v11, v6}, La/l9;-><init>(IB)V

    .line 200
    .line 201
    .line 202
    sget-object v6, La/zx3;->e:La/zx3;

    .line 203
    .line 204
    new-instance v2, La/gbn;

    .line 205
    .line 206
    invoke-direct {v2, v13, v4, v14, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 207
    .line 208
    .line 209
    iget-object v4, v1, La/zz3;->d:La/dp;

    .line 210
    .line 211
    invoke-virtual {v4, v2}, La/dp;->b(La/gbn;)V

    .line 212
    .line 213
    .line 214
    new-instance v2, La/hhd;

    .line 215
    .line 216
    const/16 v6, 0x8

    .line 217
    .line 218
    invoke-direct {v2, v6}, La/hhd;-><init>(B)V

    .line 219
    .line 220
    .line 221
    new-instance v13, La/h9;

    .line 222
    .line 223
    invoke-direct {v13, v3, v11}, La/h9;-><init>(La/q9;B)V

    .line 224
    .line 225
    .line 226
    new-instance v14, La/l9;

    .line 227
    .line 228
    invoke-direct {v14, v11, v11}, La/l9;-><init>(IB)V

    .line 229
    .line 230
    .line 231
    sget-object v9, La/m9;->e:La/m9;

    .line 232
    .line 233
    new-instance v15, La/gbn;

    .line 234
    .line 235
    invoke-direct {v15, v2, v14, v13, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v4, v15}, La/dp;->b(La/gbn;)V

    .line 239
    .line 240
    .line 241
    new-instance v2, La/hhd;

    .line 242
    .line 243
    const/16 v9, 0xb

    .line 244
    .line 245
    invoke-direct {v2, v9}, La/hhd;-><init>(B)V

    .line 246
    .line 247
    .line 248
    new-instance v9, La/h9;

    .line 249
    .line 250
    const/4 v13, 0x5

    .line 251
    invoke-direct {v9, v3, v13}, La/h9;-><init>(La/q9;B)V

    .line 252
    .line 253
    .line 254
    new-instance v14, La/l9;

    .line 255
    .line 256
    const/4 v15, 0x6

    .line 257
    invoke-direct {v14, v11, v15}, La/l9;-><init>(IB)V

    .line 258
    .line 259
    .line 260
    sget-object v13, La/m9;->h:La/m9;

    .line 261
    .line 262
    new-instance v15, La/gbn;

    .line 263
    .line 264
    invoke-direct {v15, v2, v14, v9, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v4, v15}, La/dp;->b(La/gbn;)V

    .line 268
    .line 269
    .line 270
    new-instance v2, La/hhd;

    .line 271
    .line 272
    const/16 v9, 0xd

    .line 273
    .line 274
    invoke-direct {v2, v9}, La/hhd;-><init>(B)V

    .line 275
    .line 276
    .line 277
    new-instance v9, La/t1;

    .line 278
    .line 279
    const/4 v13, 0x4

    .line 280
    invoke-direct {v9, v8, v13}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 281
    .line 282
    .line 283
    new-instance v8, La/l9;

    .line 284
    .line 285
    invoke-direct {v8, v11, v6}, La/l9;-><init>(IB)V

    .line 286
    .line 287
    .line 288
    sget-object v14, La/m9;->j:La/m9;

    .line 289
    .line 290
    new-instance v15, La/gbn;

    .line 291
    .line 292
    invoke-direct {v15, v2, v8, v9, v14}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v4, v15}, La/dp;->b(La/gbn;)V

    .line 296
    .line 297
    .line 298
    invoke-static {v3}, La/m7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-virtual {v4, v2}, La/dp;->b(La/gbn;)V

    .line 303
    .line 304
    .line 305
    new-instance v2, La/hhd;

    .line 306
    .line 307
    const/4 v8, 0x7

    .line 308
    invoke-direct {v2, v8}, La/hhd;-><init>(B)V

    .line 309
    .line 310
    .line 311
    new-instance v8, La/h9;

    .line 312
    .line 313
    const/4 v9, 0x2

    .line 314
    invoke-direct {v8, v3, v9}, La/h9;-><init>(La/q9;B)V

    .line 315
    .line 316
    .line 317
    new-instance v14, La/l9;

    .line 318
    .line 319
    invoke-direct {v14, v11, v9}, La/l9;-><init>(IB)V

    .line 320
    .line 321
    .line 322
    sget-object v9, La/m9;->d:La/m9;

    .line 323
    .line 324
    new-instance v15, La/gbn;

    .line 325
    .line 326
    invoke-direct {v15, v2, v14, v8, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v4, v15}, La/dp;->b(La/gbn;)V

    .line 330
    .line 331
    .line 332
    new-instance v2, La/hhd;

    .line 333
    .line 334
    const/4 v8, 0x6

    .line 335
    invoke-direct {v2, v8}, La/hhd;-><init>(B)V

    .line 336
    .line 337
    .line 338
    new-instance v8, La/h9;

    .line 339
    .line 340
    const/4 v9, 0x1

    .line 341
    invoke-direct {v8, v3, v9}, La/h9;-><init>(La/q9;B)V

    .line 342
    .line 343
    .line 344
    new-instance v14, La/l9;

    .line 345
    .line 346
    invoke-direct {v14, v11, v9}, La/l9;-><init>(IB)V

    .line 347
    .line 348
    .line 349
    sget-object v9, La/m9;->c:La/m9;

    .line 350
    .line 351
    new-instance v15, La/gbn;

    .line 352
    .line 353
    invoke-direct {v15, v2, v14, v8, v9}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 354
    .line 355
    .line 356
    invoke-virtual {v4, v15}, La/dp;->b(La/gbn;)V

    .line 357
    .line 358
    .line 359
    invoke-static {v3}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 360
    .line 361
    .line 362
    move-result-object v2

    .line 363
    invoke-virtual {v4, v2}, La/dp;->b(La/gbn;)V

    .line 364
    .line 365
    .line 366
    new-instance v2, La/zuh;

    .line 367
    .line 368
    const/16 v8, 0x12

    .line 369
    .line 370
    invoke-direct {v2, v8}, La/zuh;-><init>(B)V

    .line 371
    .line 372
    .line 373
    new-instance v8, La/h9;

    .line 374
    .line 375
    const/16 v9, 0x9

    .line 376
    .line 377
    invoke-direct {v8, v3, v9}, La/h9;-><init>(La/q9;B)V

    .line 378
    .line 379
    .line 380
    new-instance v14, La/pue;

    .line 381
    .line 382
    const/16 v15, 0x1d

    .line 383
    .line 384
    invoke-direct {v14, v11, v15}, La/pue;-><init>(IB)V

    .line 385
    .line 386
    .line 387
    sget-object v15, La/zdh;->l:La/zdh;

    .line 388
    .line 389
    new-instance v13, La/gbn;

    .line 390
    .line 391
    invoke-direct {v13, v2, v14, v8, v15}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v13}, La/dp;->b(La/gbn;)V

    .line 395
    .line 396
    .line 397
    invoke-static {v0, v3}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 398
    .line 399
    .line 400
    move-result-object v0

    .line 401
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 402
    .line 403
    .line 404
    new-instance v0, La/gh5;

    .line 405
    .line 406
    const/4 v2, 0x1

    .line 407
    invoke-direct {v0, v2}, La/gh5;-><init>(B)V

    .line 408
    .line 409
    .line 410
    new-instance v2, La/h9;

    .line 411
    .line 412
    invoke-direct {v2, v3, v6}, La/h9;-><init>(La/q9;B)V

    .line 413
    .line 414
    .line 415
    new-instance v6, La/lq4;

    .line 416
    .line 417
    const/4 v8, 0x2

    .line 418
    invoke-direct {v6, v11, v8}, La/lq4;-><init>(IB)V

    .line 419
    .line 420
    .line 421
    sget-object v8, La/zx3;->l:La/zx3;

    .line 422
    .line 423
    new-instance v13, La/gbn;

    .line 424
    .line 425
    invoke-direct {v13, v0, v6, v2, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v4, v13}, La/dp;->b(La/gbn;)V

    .line 429
    .line 430
    .line 431
    invoke-static {v3, v5}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 436
    .line 437
    .line 438
    new-instance v0, La/hhd;

    .line 439
    .line 440
    const/16 v2, 0xa

    .line 441
    .line 442
    invoke-direct {v0, v2}, La/hhd;-><init>(B)V

    .line 443
    .line 444
    .line 445
    new-instance v2, La/t1;

    .line 446
    .line 447
    invoke-direct {v2, v7, v11}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 448
    .line 449
    .line 450
    new-instance v6, La/l9;

    .line 451
    .line 452
    const/4 v8, 0x5

    .line 453
    invoke-direct {v6, v11, v8}, La/l9;-><init>(IB)V

    .line 454
    .line 455
    .line 456
    sget-object v8, La/m9;->g:La/m9;

    .line 457
    .line 458
    new-instance v13, La/gbn;

    .line 459
    .line 460
    invoke-direct {v13, v0, v6, v2, v8}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 461
    .line 462
    .line 463
    invoke-virtual {v4, v13}, La/dp;->b(La/gbn;)V

    .line 464
    .line 465
    .line 466
    invoke-static {v12}, La/ahy;->Y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 471
    .line 472
    .line 473
    invoke-static {v7}, La/n7x;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 478
    .line 479
    .line 480
    invoke-static {v3, v5}, La/p7x;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 481
    .line 482
    .line 483
    move-result-object v0

    .line 484
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 485
    .line 486
    .line 487
    invoke-static {v3}, La/k7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 492
    .line 493
    .line 494
    invoke-static {v3}, La/l7x;->K(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 499
    .line 500
    .line 501
    invoke-static {v10}, La/p8a;->Q(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 506
    .line 507
    .line 508
    invoke-static {v3}, La/ycm0;->r(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    invoke-virtual {v4, v0}, La/dp;->b(La/gbn;)V

    .line 513
    .line 514
    .line 515
    new-instance v0, La/hhd;

    .line 516
    .line 517
    const/4 v8, 0x5

    .line 518
    invoke-direct {v0, v8}, La/hhd;-><init>(B)V

    .line 519
    .line 520
    .line 521
    new-instance v2, La/h9;

    .line 522
    .line 523
    const/4 v5, 0x0

    .line 524
    invoke-direct {v2, v3, v5}, La/h9;-><init>(La/q9;B)V

    .line 525
    .line 526
    .line 527
    new-instance v6, La/l9;

    .line 528
    .line 529
    invoke-direct {v6, v11, v5}, La/l9;-><init>(IB)V

    .line 530
    .line 531
    .line 532
    sget-object v5, La/m9;->b:La/m9;

    .line 533
    .line 534
    new-instance v7, La/gbn;

    .line 535
    .line 536
    invoke-direct {v7, v0, v6, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v4, v7}, La/dp;->b(La/gbn;)V

    .line 540
    .line 541
    .line 542
    new-instance v0, La/hhd;

    .line 543
    .line 544
    const/16 v2, 0xc

    .line 545
    .line 546
    invoke-direct {v0, v2}, La/hhd;-><init>(B)V

    .line 547
    .line 548
    .line 549
    new-instance v2, La/h9;

    .line 550
    .line 551
    const/4 v8, 0x6

    .line 552
    invoke-direct {v2, v3, v8}, La/h9;-><init>(La/q9;B)V

    .line 553
    .line 554
    .line 555
    new-instance v5, La/l9;

    .line 556
    .line 557
    const/4 v8, 0x7

    .line 558
    invoke-direct {v5, v11, v8}, La/l9;-><init>(IB)V

    .line 559
    .line 560
    .line 561
    sget-object v6, La/m9;->i:La/m9;

    .line 562
    .line 563
    new-instance v7, La/gbn;

    .line 564
    .line 565
    invoke-direct {v7, v0, v5, v2, v6}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v4, v7}, La/dp;->b(La/gbn;)V

    .line 569
    .line 570
    .line 571
    new-instance v0, La/hhd;

    .line 572
    .line 573
    invoke-direct {v0, v9}, La/hhd;-><init>(B)V

    .line 574
    .line 575
    .line 576
    new-instance v2, La/h9;

    .line 577
    .line 578
    const/4 v5, 0x4

    .line 579
    invoke-direct {v2, v3, v5}, La/h9;-><init>(La/q9;B)V

    .line 580
    .line 581
    .line 582
    new-instance v3, La/l9;

    .line 583
    .line 584
    invoke-direct {v3, v11, v5}, La/l9;-><init>(IB)V

    .line 585
    .line 586
    .line 587
    sget-object v5, La/m9;->f:La/m9;

    .line 588
    .line 589
    new-instance v6, La/gbn;

    .line 590
    .line 591
    invoke-direct {v6, v0, v3, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 592
    .line 593
    .line 594
    invoke-virtual {v4, v6}, La/dp;->b(La/gbn;)V

    .line 595
    .line 596
    .line 597
    return-object v1

    .line 598
    nop

    .line 599
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
