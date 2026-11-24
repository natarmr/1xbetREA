.class public final synthetic La/rnp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/rnp;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/rnp;->a:B

    .line 4
    .line 5
    const-string v1, "CXCP"

    .line 6
    .line 7
    const/16 v2, 0x1d

    .line 8
    .line 9
    const/4 v3, 0x6

    .line 10
    const/4 v4, 0x0

    .line 11
    const/4 v5, 0x3

    .line 12
    const/4 v6, 0x0

    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, La/tjr0;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v1, La/y00;

    .line 24
    .line 25
    new-instance v2, La/u00;

    .line 26
    .line 27
    iget-object v3, v0, La/tjr0;->b:La/lmr0;

    .line 28
    .line 29
    iget-object v3, v3, La/lmr0;->b:Ljava/lang/String;

    .line 30
    .line 31
    const-string v4, ""

    .line 32
    .line 33
    invoke-direct {v2, v3, v6, v4}, La/u00;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-boolean v0, v0, La/tjr0;->a:Z

    .line 37
    .line 38
    invoke-static {v0}, La/bcm0;->i(Z)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    const v0, 0x7f08028d

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const v0, 0x7f08028c

    .line 49
    .line 50
    .line 51
    :goto_0
    invoke-direct {v1, v2, v3, v0}, La/y00;-><init>(La/w00;Ljava/lang/String;I)V

    .line 52
    .line 53
    .line 54
    return-object v1

    .line 55
    :pswitch_0
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, La/ly6;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {v0}, La/j47;->C0(La/ly6;)La/y00;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :pswitch_1
    move-object/from16 v0, p1

    .line 68
    .line 69
    check-cast v0, La/fee;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, La/my6;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    new-instance v1, La/y00;

    .line 84
    .line 85
    new-instance v2, La/r00;

    .line 86
    .line 87
    iget-object v3, v0, La/my6;->b:La/j580;

    .line 88
    .line 89
    iget-object v4, v3, La/j580;->a:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v3, v3, La/j580;->b:Ljava/lang/String;

    .line 92
    .line 93
    invoke-direct {v2, v4, v3}, La/r00;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, La/my6;->a:La/md5;

    .line 97
    .line 98
    iget-object v3, v0, La/md5;->a:Ljava/lang/String;

    .line 99
    .line 100
    iget v0, v0, La/md5;->b:I

    .line 101
    .line 102
    invoke-direct {v1, v2, v3, v0}, La/y00;-><init>(La/w00;Ljava/lang/String;I)V

    .line 103
    .line 104
    .line 105
    return-object v1

    .line 106
    :pswitch_2
    move-object/from16 v0, p1

    .line 107
    .line 108
    check-cast v0, La/fee;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    check-cast v0, La/my6;

    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v1, La/r820;

    .line 123
    .line 124
    new-instance v2, La/oy6;

    .line 125
    .line 126
    new-instance v3, La/vf40;

    .line 127
    .line 128
    new-instance v5, La/jgs;

    .line 129
    .line 130
    iget-object v0, v0, La/my6;->c:La/kur;

    .line 131
    .line 132
    iget-object v6, v0, La/kur;->a:La/ww20;

    .line 133
    .line 134
    iget-object v6, v6, La/ww20;->a:Ljava/lang/String;

    .line 135
    .line 136
    invoke-direct {v5, v6}, La/jgs;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v0, La/kur;->b:La/j43;

    .line 140
    .line 141
    invoke-direct {v3, v5, v0}, La/vf40;-><init>(La/pgs;La/j43;)V

    .line 142
    .line 143
    .line 144
    invoke-direct {v2, v3}, La/oy6;-><init>(La/vf40;)V

    .line 145
    .line 146
    .line 147
    invoke-direct {v1, v2, v4}, La/r820;-><init>(La/yy6;La/k680;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :pswitch_3
    move-object/from16 v0, p1

    .line 152
    .line 153
    check-cast v0, Landroid/content/Context;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    new-instance v1, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 159
    .line 160
    new-instance v2, La/tje;

    .line 161
    .line 162
    const v5, 0x7f140197

    .line 163
    .line 164
    .line 165
    invoke-direct {v2, v0, v5}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 166
    .line 167
    .line 168
    invoke-direct {v1, v2, v4, v3, v6}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 172
    .line 173
    .line 174
    const v2, 0x7f130b47

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 185
    .line 186
    .line 187
    return-object v1

    .line 188
    :pswitch_4
    move-object/from16 v0, p1

    .line 189
    .line 190
    check-cast v0, La/dar;

    .line 191
    .line 192
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 196
    .line 197
    return-object v0

    .line 198
    :pswitch_5
    move-object/from16 v0, p1

    .line 199
    .line 200
    check-cast v0, La/pz40;

    .line 201
    .line 202
    new-instance v1, La/d5r;

    .line 203
    .line 204
    invoke-direct {v1, v0}, La/d5r;-><init>(La/pz40;)V

    .line 205
    .line 206
    .line 207
    return-object v1

    .line 208
    :pswitch_6
    move-object/from16 v0, p1

    .line 209
    .line 210
    check-cast v0, La/cp;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    new-instance v1, La/kgh;

    .line 216
    .line 217
    const/16 v2, 0x12

    .line 218
    .line 219
    invoke-direct {v1, v0, v2}, La/kgh;-><init>(La/cp;B)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 223
    .line 224
    .line 225
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    return-object v0

    .line 228
    :pswitch_7
    move-object/from16 v0, p1

    .line 229
    .line 230
    check-cast v0, La/cp;

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    .line 234
    .line 235
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 236
    .line 237
    check-cast v1, La/vcu0;

    .line 238
    .line 239
    iget-object v3, v1, La/vcu0;->a:Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 240
    .line 241
    iget-object v4, v0, La/cp;->w:Landroid/content/Context;

    .line 242
    .line 243
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 244
    .line 245
    .line 246
    move-result-object v6

    .line 247
    const v7, 0x7f070722

    .line 248
    .line 249
    .line 250
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 255
    .line 256
    .line 257
    move-result-object v6

    .line 258
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 259
    .line 260
    .line 261
    move-result v11

    .line 262
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 263
    .line 264
    .line 265
    move-result-object v6

    .line 266
    const v7, 0x7f0706fe

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 270
    .line 271
    .line 272
    move-result v13

    .line 273
    new-instance v8, La/qmk0;

    .line 274
    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    const/16 v17, 0x1ca

    .line 278
    .line 279
    const/4 v10, 0x0

    .line 280
    const/4 v12, 0x0

    .line 281
    const/4 v14, 0x1

    .line 282
    const/4 v15, 0x0

    .line 283
    invoke-direct/range {v8 .. v17}, La/qmk0;-><init>(IIIIIILkotlin/jvm/functions/Function1;La/rmk0;I)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v3, v8}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 287
    .line 288
    .line 289
    new-instance v3, La/k4f;

    .line 290
    .line 291
    invoke-direct {v3}, La/i26;-><init>()V

    .line 292
    .line 293
    .line 294
    iget-object v6, v3, La/i26;->e:Ljava/lang/Object;

    .line 295
    .line 296
    check-cast v6, La/dp;

    .line 297
    .line 298
    new-instance v7, La/jbp;

    .line 299
    .line 300
    invoke-direct {v7, v2}, La/jbp;-><init>(B)V

    .line 301
    .line 302
    .line 303
    new-instance v2, La/rnp;

    .line 304
    .line 305
    const/16 v8, 0x16

    .line 306
    .line 307
    invoke-direct {v2, v8}, La/rnp;-><init>(B)V

    .line 308
    .line 309
    .line 310
    new-instance v8, La/atq;

    .line 311
    .line 312
    invoke-direct {v8, v5, v5}, La/atq;-><init>(IB)V

    .line 313
    .line 314
    .line 315
    sget-object v5, La/gzn;->A:La/gzn;

    .line 316
    .line 317
    new-instance v9, La/gbn;

    .line 318
    .line 319
    invoke-direct {v9, v7, v8, v2, v5}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v6, v9}, La/dp;->b(La/gbn;)V

    .line 323
    .line 324
    .line 325
    iget-object v2, v1, La/vcu0;->a:Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 326
    .line 327
    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 328
    .line 329
    invoke-direct {v5, v4}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 333
    .line 334
    .line 335
    iget-object v1, v1, La/vcu0;->a:Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 336
    .line 337
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 338
    .line 339
    .line 340
    new-instance v1, La/f5p;

    .line 341
    .line 342
    const/16 v2, 0xe

    .line 343
    .line 344
    invoke-direct {v1, v3, v0, v2}, La/f5p;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 348
    .line 349
    .line 350
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_8
    move-object/from16 v0, p1

    .line 354
    .line 355
    check-cast v0, La/ou90;

    .line 356
    .line 357
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 361
    .line 362
    return-object v0

    .line 363
    :pswitch_9
    move-object/from16 v0, p1

    .line 364
    .line 365
    check-cast v0, La/ou90;

    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_a
    move-object/from16 v0, p1

    .line 374
    .line 375
    check-cast v0, La/cp;

    .line 376
    .line 377
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    new-instance v3, La/gkz;

    .line 381
    .line 382
    sget-object v1, La/ysq;->d:La/ek5;

    .line 383
    .line 384
    invoke-direct {v3, v1}, La/zz3;-><init>(La/dtb;)V

    .line 385
    .line 386
    .line 387
    new-instance v1, La/jbp;

    .line 388
    .line 389
    const/16 v4, 0x19

    .line 390
    .line 391
    invoke-direct {v1, v4}, La/jbp;-><init>(B)V

    .line 392
    .line 393
    .line 394
    new-instance v4, La/rnp;

    .line 395
    .line 396
    const/16 v6, 0x11

    .line 397
    .line 398
    invoke-direct {v4, v6}, La/rnp;-><init>(B)V

    .line 399
    .line 400
    .line 401
    new-instance v6, La/e9k;

    .line 402
    .line 403
    invoke-direct {v6, v5, v2}, La/e9k;-><init>(IB)V

    .line 404
    .line 405
    .line 406
    sget-object v2, La/gzn;->w:La/gzn;

    .line 407
    .line 408
    new-instance v5, La/gbn;

    .line 409
    .line 410
    invoke-direct {v5, v1, v6, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 411
    .line 412
    .line 413
    iget-object v1, v3, La/zz3;->d:La/dp;

    .line 414
    .line 415
    invoke-virtual {v1, v5}, La/dp;->b(La/gbn;)V

    .line 416
    .line 417
    .line 418
    iget-object v1, v0, La/cp;->u:La/yfu0;

    .line 419
    .line 420
    check-cast v1, La/qsx;

    .line 421
    .line 422
    iget-object v2, v1, La/qsx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 423
    .line 424
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 425
    .line 426
    .line 427
    iget-object v1, v1, La/qsx;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 428
    .line 429
    new-instance v2, La/bie0;

    .line 430
    .line 431
    invoke-direct {v2, v1}, La/bie0;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 432
    .line 433
    .line 434
    invoke-virtual {v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->n(La/khe0;)V

    .line 435
    .line 436
    .line 437
    new-instance v1, La/if6;

    .line 438
    .line 439
    const/4 v6, 0x5

    .line 440
    move-object v4, v0

    .line 441
    move-object v5, v3

    .line 442
    move-object v2, v0

    .line 443
    invoke-direct/range {v1 .. v6}, La/if6;-><init>(La/cp;Ljava/lang/Object;La/cp;Ljava/lang/Object;B)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v2, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 447
    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_b
    move-object/from16 v0, p1

    .line 453
    .line 454
    check-cast v0, La/cp;

    .line 455
    .line 456
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 457
    .line 458
    .line 459
    new-instance v1, La/k2l;

    .line 460
    .line 461
    invoke-direct {v1, v0, v0, v3}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, v1}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 468
    .line 469
    return-object v0

    .line 470
    :pswitch_c
    move-object/from16 v0, p1

    .line 471
    .line 472
    check-cast v0, La/d5a;

    .line 473
    .line 474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_d
    move-object/from16 v0, p1

    .line 478
    .line 479
    check-cast v0, La/d5a;

    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    return-object v0

    .line 484
    :pswitch_e
    move-object/from16 v0, p1

    .line 485
    .line 486
    check-cast v0, La/ou90;

    .line 487
    .line 488
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 489
    .line 490
    return-object v0

    .line 491
    :pswitch_f
    move-object/from16 v0, p1

    .line 492
    .line 493
    check-cast v0, La/ou90;

    .line 494
    .line 495
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 496
    .line 497
    return-object v0

    .line 498
    :pswitch_10
    move-object/from16 v0, p1

    .line 499
    .line 500
    check-cast v0, Ljava/lang/Throwable;

    .line 501
    .line 502
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    .line 504
    .line 505
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 506
    .line 507
    return-object v0

    .line 508
    :pswitch_11
    move-object/from16 v0, p1

    .line 509
    .line 510
    check-cast v0, Ljava/lang/Throwable;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 513
    .line 514
    .line 515
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 516
    .line 517
    return-object v0

    .line 518
    :pswitch_12
    move-object/from16 v0, p1

    .line 519
    .line 520
    check-cast v0, Ljava/lang/Throwable;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 526
    .line 527
    return-object v0

    .line 528
    :pswitch_13
    move-object/from16 v0, p1

    .line 529
    .line 530
    check-cast v0, La/abi0;

    .line 531
    .line 532
    invoke-static {v0, v6}, La/yai0;->e(La/abi0;I)V

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_14
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, Ljava/lang/Throwable;

    .line 541
    .line 542
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 543
    .line 544
    .line 545
    move-result v0

    .line 546
    if-eqz v0, :cond_1

    .line 547
    .line 548
    const-string v0, "setExternalFlashAeModeAsync: state3AControl.updateSignal completed"

    .line 549
    .line 550
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 551
    .line 552
    .line 553
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_15
    move-object/from16 v0, p1

    .line 557
    .line 558
    check-cast v0, Ljava/lang/Throwable;

    .line 559
    .line 560
    invoke-static {v1}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 561
    .line 562
    .line 563
    move-result v0

    .line 564
    if-eqz v0, :cond_2

    .line 565
    .line 566
    const-string v0, "setTorchIfRequired: torch control completed"

    .line 567
    .line 568
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 569
    .line 570
    .line 571
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 572
    .line 573
    return-object v0

    .line 574
    :pswitch_16
    move-object/from16 v0, p1

    .line 575
    .line 576
    check-cast v0, La/soe;

    .line 577
    .line 578
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    const-string v1, "FirebaseSessions"

    .line 582
    .line 583
    const-string v2, "CorruptionException in session configs DataStore"

    .line 584
    .line 585
    invoke-static {v1, v2, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 586
    .line 587
    .line 588
    sget-object v0, La/lwf;->B:La/dji0;

    .line 589
    .line 590
    return-object v0

    .line 591
    :pswitch_17
    move-object/from16 v0, p1

    .line 592
    .line 593
    check-cast v0, La/t9q;

    .line 594
    .line 595
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v1, v0, La/t9q;->a:Ljava/util/List;

    .line 599
    .line 600
    new-instance v2, Ljava/util/ArrayList;

    .line 601
    .line 602
    const/16 v3, 0xa

    .line 603
    .line 604
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 605
    .line 606
    .line 607
    move-result v3

    .line 608
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 609
    .line 610
    .line 611
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 616
    .line 617
    .line 618
    move-result v3

    .line 619
    if-eqz v3, :cond_5

    .line 620
    .line 621
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v3

    .line 625
    check-cast v3, La/gcq;

    .line 626
    .line 627
    new-instance v4, La/njx;

    .line 628
    .line 629
    iget v5, v3, La/gcq;->a:I

    .line 630
    .line 631
    iget-object v7, v3, La/gcq;->b:Ljava/lang/String;

    .line 632
    .line 633
    const-string v8, "\u202a"

    .line 634
    .line 635
    const-string v9, "\u202c"

    .line 636
    .line 637
    invoke-static {v8, v7, v9}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v7

    .line 641
    iget v8, v3, La/gcq;->a:I

    .line 642
    .line 643
    iget-object v9, v0, La/t9q;->b:Ljava/lang/Integer;

    .line 644
    .line 645
    if-nez v9, :cond_3

    .line 646
    .line 647
    goto :goto_2

    .line 648
    :cond_3
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 649
    .line 650
    .line 651
    move-result v9

    .line 652
    if-ne v8, v9, :cond_4

    .line 653
    .line 654
    const/4 v8, 0x1

    .line 655
    goto :goto_3

    .line 656
    :cond_4
    :goto_2
    move v8, v6

    .line 657
    :goto_3
    iget-object v3, v3, La/gcq;->d:La/fcq;

    .line 658
    .line 659
    invoke-direct {v4, v5, v7, v8, v3}, La/njx;-><init>(ILjava/lang/String;ZLa/fcq;)V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 663
    .line 664
    .line 665
    goto :goto_1

    .line 666
    :cond_5
    invoke-static {v2}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    new-instance v1, La/u9q;

    .line 671
    .line 672
    invoke-direct {v1, v0}, La/u9q;-><init>(La/i4;)V

    .line 673
    .line 674
    .line 675
    return-object v1

    .line 676
    :pswitch_18
    move-object/from16 v0, p1

    .line 677
    .line 678
    check-cast v0, Ljava/lang/Throwable;

    .line 679
    .line 680
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 681
    .line 682
    .line 683
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 684
    .line 685
    .line 686
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_19
    move-object/from16 v0, p1

    .line 690
    .line 691
    check-cast v0, Ljava/io/File;

    .line 692
    .line 693
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v0

    .line 704
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    new-instance v1, La/l3k0;

    .line 708
    .line 709
    invoke-direct {v1, v0}, La/l3k0;-><init>(Ljava/lang/String;)V

    .line 710
    .line 711
    .line 712
    return-object v1

    .line 713
    :pswitch_1a
    move-object/from16 v0, p1

    .line 714
    .line 715
    check-cast v0, La/sjd;

    .line 716
    .line 717
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 718
    .line 719
    .line 720
    new-instance v1, La/hxp;

    .line 721
    .line 722
    invoke-direct {v1, v0}, La/hxp;-><init>(La/sjd;)V

    .line 723
    .line 724
    .line 725
    return-object v1

    .line 726
    :pswitch_1b
    move-object/from16 v0, p1

    .line 727
    .line 728
    check-cast v0, La/hup;

    .line 729
    .line 730
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 731
    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_1c
    move-object/from16 v0, p1

    .line 735
    .line 736
    check-cast v0, Ljava/lang/Throwable;

    .line 737
    .line 738
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 742
    .line 743
    .line 744
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 745
    .line 746
    return-object v0

    .line 747
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
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
