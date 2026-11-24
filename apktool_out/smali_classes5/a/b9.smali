.class public final synthetic La/b9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/f9;


# direct methods
.method public synthetic constructor <init>(La/f9;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b9;->a:B

    iput-object p1, p0, La/b9;->b:La/f9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/b9;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/b9;->b:La/f9;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    sget-object v1, La/f9;->P1:La/rek0;

    .line 12
    .line 13
    iget-object v0, v0, La/f9;->N1:La/a8z;

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
    sget-object v1, La/f9;->P1:La/rek0;

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
    sget-object v1, La/f9;->P1:La/rek0;

    .line 105
    .line 106
    new-instance v1, La/a9;

    .line 107
    .line 108
    new-instance v3, La/c9;

    .line 109
    .line 110
    invoke-direct {v3, v0, v2}, La/c9;-><init>(La/f9;B)V

    .line 111
    .line 112
    .line 113
    new-instance v2, La/iob0;

    .line 114
    .line 115
    const/16 v4, 0x18

    .line 116
    .line 117
    invoke-direct {v2, v0, v4}, La/iob0;-><init>(Ljava/lang/Object;B)V

    .line 118
    .line 119
    .line 120
    new-instance v4, La/c9;

    .line 121
    .line 122
    const/4 v5, 0x1

    .line 123
    invoke-direct {v4, v0, v5}, La/c9;-><init>(La/f9;B)V

    .line 124
    .line 125
    .line 126
    new-instance v6, La/c9;

    .line 127
    .line 128
    const/4 v7, 0x2

    .line 129
    invoke-direct {v6, v0, v7}, La/c9;-><init>(La/f9;B)V

    .line 130
    .line 131
    .line 132
    new-instance v8, La/c9;

    .line 133
    .line 134
    const/4 v9, 0x3

    .line 135
    invoke-direct {v8, v0, v9}, La/c9;-><init>(La/f9;B)V

    .line 136
    .line 137
    .line 138
    new-instance v10, La/t0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/f9;->H0()La/ab;

    .line 141
    .line 142
    .line 143
    move-result-object v12

    .line 144
    const/16 v16, 0x0

    .line 145
    .line 146
    const/16 v17, 0x4

    .line 147
    .line 148
    const/4 v11, 0x1

    .line 149
    const-class v21, La/ab;

    .line 150
    .line 151
    const-string v14, "onAccordionClick"

    .line 152
    .line 153
    const-string v15, "onAccordionClick(Lorg/xplatform/main_menu/impl/presentation/common/models/AccordionTabUiItem$SimpleAccordionMenuUiItem;)V"

    .line 154
    .line 155
    move-object/from16 v13, v21

    .line 156
    .line 157
    invoke-direct/range {v10 .. v17}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 158
    .line 159
    .line 160
    new-instance v18, La/f8;

    .line 161
    .line 162
    invoke-virtual {v0}, La/f9;->H0()La/ab;

    .line 163
    .line 164
    .line 165
    move-result-object v20

    .line 166
    const/16 v24, 0x0

    .line 167
    .line 168
    const/16 v25, 0x2

    .line 169
    .line 170
    const/16 v19, 0x0

    .line 171
    .line 172
    const-string v22, "onEndCallClicked"

    .line 173
    .line 174
    const-string v23, "onEndCallClicked()V"

    .line 175
    .line 176
    invoke-direct/range {v18 .. v25}, La/f8;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v0, v18

    .line 180
    .line 181
    invoke-direct {v1}, La/qv5;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-static {v3}, La/ccq0;->S(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 185
    .line 186
    .line 187
    move-result-object v11

    .line 188
    iget-object v12, v1, La/zz3;->d:La/dp;

    .line 189
    .line 190
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 191
    .line 192
    .line 193
    invoke-static {v3}, La/cwr0;->O(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 194
    .line 195
    .line 196
    move-result-object v11

    .line 197
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v3}, La/zjb;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 201
    .line 202
    .line 203
    move-result-object v11

    .line 204
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 205
    .line 206
    .line 207
    invoke-static {v3}, La/bfb;->P(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v3}, La/ofm0;->p(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 215
    .line 216
    .line 217
    move-result-object v11

    .line 218
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 219
    .line 220
    .line 221
    new-instance v11, La/sfc;

    .line 222
    .line 223
    const/16 v13, 0x13

    .line 224
    .line 225
    invoke-direct {v11, v13}, La/sfc;-><init>(B)V

    .line 226
    .line 227
    .line 228
    new-instance v14, La/trb;

    .line 229
    .line 230
    const/16 v15, 0x14

    .line 231
    .line 232
    invoke-direct {v14, v3, v15}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 233
    .line 234
    .line 235
    new-instance v15, La/tad;

    .line 236
    .line 237
    const/4 v5, 0x4

    .line 238
    invoke-direct {v15, v9, v5}, La/tad;-><init>(IB)V

    .line 239
    .line 240
    .line 241
    sget-object v5, La/qja;->o:La/qja;

    .line 242
    .line 243
    new-instance v13, La/gbn;

    .line 244
    .line 245
    invoke-direct {v13, v11, v15, v14, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v12, v13}, La/dp;->b(La/gbn;)V

    .line 249
    .line 250
    .line 251
    new-instance v5, La/sfc;

    .line 252
    .line 253
    const/16 v11, 0x11

    .line 254
    .line 255
    invoke-direct {v5, v11}, La/sfc;-><init>(B)V

    .line 256
    .line 257
    .line 258
    new-instance v13, La/trb;

    .line 259
    .line 260
    const/16 v14, 0x12

    .line 261
    .line 262
    invoke-direct {v13, v3, v14}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 263
    .line 264
    .line 265
    new-instance v15, La/tad;

    .line 266
    .line 267
    invoke-direct {v15, v9, v7}, La/tad;-><init>(IB)V

    .line 268
    .line 269
    .line 270
    sget-object v7, La/qja;->m:La/qja;

    .line 271
    .line 272
    new-instance v11, La/gbn;

    .line 273
    .line 274
    invoke-direct {v11, v5, v15, v13, v7}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v12, v11}, La/dp;->b(La/gbn;)V

    .line 278
    .line 279
    .line 280
    new-instance v5, La/sfc;

    .line 281
    .line 282
    invoke-direct {v5, v14}, La/sfc;-><init>(B)V

    .line 283
    .line 284
    .line 285
    new-instance v7, La/trb;

    .line 286
    .line 287
    const/16 v11, 0x13

    .line 288
    .line 289
    invoke-direct {v7, v3, v11}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 290
    .line 291
    .line 292
    new-instance v11, La/tad;

    .line 293
    .line 294
    invoke-direct {v11, v9, v9}, La/tad;-><init>(IB)V

    .line 295
    .line 296
    .line 297
    sget-object v13, La/qja;->n:La/qja;

    .line 298
    .line 299
    new-instance v14, La/gbn;

    .line 300
    .line 301
    invoke-direct {v14, v5, v11, v7, v13}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v12, v14}, La/dp;->b(La/gbn;)V

    .line 305
    .line 306
    .line 307
    invoke-static {v3}, La/zcm0;->l(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 308
    .line 309
    .line 310
    move-result-object v5

    .line 311
    invoke-virtual {v12, v5}, La/dp;->b(La/gbn;)V

    .line 312
    .line 313
    .line 314
    invoke-static {v3}, La/m7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 315
    .line 316
    .line 317
    move-result-object v5

    .line 318
    invoke-virtual {v12, v5}, La/dp;->b(La/gbn;)V

    .line 319
    .line 320
    .line 321
    invoke-static {v3}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 322
    .line 323
    .line 324
    move-result-object v5

    .line 325
    invoke-virtual {v12, v5}, La/dp;->b(La/gbn;)V

    .line 326
    .line 327
    .line 328
    invoke-static {v0, v3}, La/rsr0;->U(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 333
    .line 334
    .line 335
    invoke-static {v3, v2}, La/pym0;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 340
    .line 341
    .line 342
    invoke-static {v4}, La/m7x;->L(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 347
    .line 348
    .line 349
    invoke-static {v6}, La/ihm0;->m(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 354
    .line 355
    .line 356
    invoke-static {v10}, La/ahy;->Y(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 361
    .line 362
    .line 363
    invoke-static {v4}, La/n7x;->B(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 368
    .line 369
    .line 370
    invoke-static {v3, v2}, La/p7x;->v(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/gbn;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 375
    .line 376
    .line 377
    invoke-static {v3}, La/k7x;->G(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 382
    .line 383
    .line 384
    invoke-static {v3}, La/l7x;->K(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v8}, La/ny9;->R(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-virtual {v12, v0}, La/dp;->b(La/gbn;)V

    .line 396
    .line 397
    .line 398
    new-instance v0, La/sfc;

    .line 399
    .line 400
    const/16 v2, 0x10

    .line 401
    .line 402
    invoke-direct {v0, v2}, La/sfc;-><init>(B)V

    .line 403
    .line 404
    .line 405
    new-instance v2, La/trb;

    .line 406
    .line 407
    const/16 v4, 0x11

    .line 408
    .line 409
    invoke-direct {v2, v3, v4}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 410
    .line 411
    .line 412
    new-instance v4, La/tad;

    .line 413
    .line 414
    const/4 v5, 0x1

    .line 415
    invoke-direct {v4, v9, v5}, La/tad;-><init>(IB)V

    .line 416
    .line 417
    .line 418
    sget-object v5, La/qja;->l:La/qja;

    .line 419
    .line 420
    new-instance v6, La/gbn;

    .line 421
    .line 422
    invoke-direct {v6, v0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 423
    .line 424
    .line 425
    invoke-virtual {v12, v6}, La/dp;->b(La/gbn;)V

    .line 426
    .line 427
    .line 428
    new-instance v0, La/sfc;

    .line 429
    .line 430
    const/16 v2, 0x17

    .line 431
    .line 432
    invoke-direct {v0, v2}, La/sfc;-><init>(B)V

    .line 433
    .line 434
    .line 435
    new-instance v2, La/trb;

    .line 436
    .line 437
    const/16 v4, 0x16

    .line 438
    .line 439
    invoke-direct {v2, v3, v4}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 440
    .line 441
    .line 442
    new-instance v4, La/tad;

    .line 443
    .line 444
    const/16 v5, 0x8

    .line 445
    .line 446
    invoke-direct {v4, v9, v5}, La/tad;-><init>(IB)V

    .line 447
    .line 448
    .line 449
    sget-object v5, La/qja;->s:La/qja;

    .line 450
    .line 451
    new-instance v6, La/gbn;

    .line 452
    .line 453
    invoke-direct {v6, v0, v4, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 454
    .line 455
    .line 456
    invoke-virtual {v12, v6}, La/dp;->b(La/gbn;)V

    .line 457
    .line 458
    .line 459
    new-instance v0, La/sfc;

    .line 460
    .line 461
    const/16 v2, 0x15

    .line 462
    .line 463
    invoke-direct {v0, v2}, La/sfc;-><init>(B)V

    .line 464
    .line 465
    .line 466
    new-instance v4, La/trb;

    .line 467
    .line 468
    invoke-direct {v4, v3, v2}, La/trb;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 469
    .line 470
    .line 471
    new-instance v2, La/tad;

    .line 472
    .line 473
    const/4 v3, 0x6

    .line 474
    invoke-direct {v2, v9, v3}, La/tad;-><init>(IB)V

    .line 475
    .line 476
    .line 477
    sget-object v3, La/qja;->q:La/qja;

    .line 478
    .line 479
    new-instance v5, La/gbn;

    .line 480
    .line 481
    invoke-direct {v5, v0, v2, v4, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v12, v5}, La/dp;->b(La/gbn;)V

    .line 485
    .line 486
    .line 487
    return-object v1

    .line 488
    nop

    .line 489
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
