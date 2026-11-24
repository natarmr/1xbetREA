.class public final La/h5;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/t5;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/h5;->a:B

    iput-object p1, p0, La/h5;->c:Ljava/lang/Object;

    iput-object p2, p0, La/h5;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/h5;->a:B

    iput-object p1, p0, La/h5;->b:Ljava/lang/Object;

    iput-object p2, p0, La/h5;->c:Ljava/lang/Object;

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
    iget-byte v1, v0, La/h5;->a:B

    .line 4
    .line 5
    const v2, 0x7f0a06b9

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const-string v4, "Missing required view with ID: "

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    iget-object v6, v0, La/h5;->b:Ljava/lang/Object;

    .line 13
    .line 14
    iget-object v7, v0, La/h5;->c:Ljava/lang/Object;

    .line 15
    .line 16
    packed-switch v1, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast v6, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;

    .line 20
    .line 21
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-object v9, v7

    .line 33
    check-cast v9, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;

    .line 34
    .line 35
    const v1, 0x7f0d00b5

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 39
    .line 40
    .line 41
    const v0, 0x7f0a06ba

    .line 42
    .line 43
    .line 44
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 49
    .line 50
    if-eqz v1, :cond_0

    .line 51
    .line 52
    const v0, 0x7f0a06bb

    .line 53
    .line 54
    .line 55
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 60
    .line 61
    if-eqz v1, :cond_0

    .line 62
    .line 63
    const v0, 0x7f0a06bc

    .line 64
    .line 65
    .line 66
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 71
    .line 72
    if-eqz v1, :cond_0

    .line 73
    .line 74
    const v0, 0x7f0a0844

    .line 75
    .line 76
    .line 77
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    move-object v10, v1

    .line 82
    check-cast v10, Landroid/widget/ImageView;

    .line 83
    .line 84
    if-eqz v10, :cond_0

    .line 85
    .line 86
    const v0, 0x7f0a084c

    .line 87
    .line 88
    .line 89
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 90
    .line 91
    .line 92
    move-result-object v1

    .line 93
    move-object v11, v1

    .line 94
    check-cast v11, Landroid/widget/ImageView;

    .line 95
    .line 96
    if-eqz v11, :cond_0

    .line 97
    .line 98
    const v0, 0x7f0a084e

    .line 99
    .line 100
    .line 101
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    move-object v12, v1

    .line 106
    check-cast v12, Landroid/widget/ImageView;

    .line 107
    .line 108
    if-eqz v12, :cond_0

    .line 109
    .line 110
    const v0, 0x7f0a0850

    .line 111
    .line 112
    .line 113
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    move-object v13, v1

    .line 118
    check-cast v13, Landroid/widget/ImageView;

    .line 119
    .line 120
    if-eqz v13, :cond_0

    .line 121
    .line 122
    const v0, 0x7f0a08a6

    .line 123
    .line 124
    .line 125
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    move-object v14, v1

    .line 130
    check-cast v14, Landroid/widget/ImageView;

    .line 131
    .line 132
    if-eqz v14, :cond_0

    .line 133
    .line 134
    const v0, 0x7f0a08ad

    .line 135
    .line 136
    .line 137
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    move-object v15, v1

    .line 142
    check-cast v15, Landroid/widget/ImageView;

    .line 143
    .line 144
    if-eqz v15, :cond_0

    .line 145
    .line 146
    const v0, 0x7f0a08af

    .line 147
    .line 148
    .line 149
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    move-object/from16 v16, v1

    .line 154
    .line 155
    check-cast v16, Landroid/widget/ImageView;

    .line 156
    .line 157
    if-eqz v16, :cond_0

    .line 158
    .line 159
    const v0, 0x7f0a08b1

    .line 160
    .line 161
    .line 162
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    move-object/from16 v17, v1

    .line 167
    .line 168
    check-cast v17, Landroid/widget/ImageView;

    .line 169
    .line 170
    if-eqz v17, :cond_0

    .line 171
    .line 172
    const v0, 0x7f0a1112

    .line 173
    .line 174
    .line 175
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 176
    .line 177
    .line 178
    move-result-object v1

    .line 179
    move-object/from16 v18, v1

    .line 180
    .line 181
    check-cast v18, Landroid/widget/TextView;

    .line 182
    .line 183
    if-eqz v18, :cond_0

    .line 184
    .line 185
    const v0, 0x7f0a1117

    .line 186
    .line 187
    .line 188
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    move-object/from16 v19, v1

    .line 193
    .line 194
    check-cast v19, Landroid/widget/TextView;

    .line 195
    .line 196
    if-eqz v19, :cond_0

    .line 197
    .line 198
    const v0, 0x7f0a1118

    .line 199
    .line 200
    .line 201
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    move-object/from16 v20, v1

    .line 206
    .line 207
    check-cast v20, Landroid/widget/TextView;

    .line 208
    .line 209
    if-eqz v20, :cond_0

    .line 210
    .line 211
    const v0, 0x7f0a1119

    .line 212
    .line 213
    .line 214
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 215
    .line 216
    .line 217
    move-result-object v1

    .line 218
    move-object/from16 v21, v1

    .line 219
    .line 220
    check-cast v21, Landroid/widget/TextView;

    .line 221
    .line 222
    if-eqz v21, :cond_0

    .line 223
    .line 224
    const v0, 0x7f0a111e

    .line 225
    .line 226
    .line 227
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    check-cast v1, Landroid/widget/TextView;

    .line 232
    .line 233
    if-eqz v1, :cond_0

    .line 234
    .line 235
    const v0, 0x7f0a11e3

    .line 236
    .line 237
    .line 238
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 239
    .line 240
    .line 241
    move-result-object v1

    .line 242
    check-cast v1, Landroid/widget/TextView;

    .line 243
    .line 244
    if-eqz v1, :cond_0

    .line 245
    .line 246
    const v0, 0x7f0a11fe

    .line 247
    .line 248
    .line 249
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 250
    .line 251
    .line 252
    move-result-object v1

    .line 253
    move-object/from16 v22, v1

    .line 254
    .line 255
    check-cast v22, Landroid/widget/TextView;

    .line 256
    .line 257
    if-eqz v22, :cond_0

    .line 258
    .line 259
    const v0, 0x7f0a1203

    .line 260
    .line 261
    .line 262
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    move-object/from16 v23, v1

    .line 267
    .line 268
    check-cast v23, Landroid/widget/TextView;

    .line 269
    .line 270
    if-eqz v23, :cond_0

    .line 271
    .line 272
    const v0, 0x7f0a1204

    .line 273
    .line 274
    .line 275
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    move-object/from16 v24, v1

    .line 280
    .line 281
    check-cast v24, Landroid/widget/TextView;

    .line 282
    .line 283
    if-eqz v24, :cond_0

    .line 284
    .line 285
    const v0, 0x7f0a1205

    .line 286
    .line 287
    .line 288
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 289
    .line 290
    .line 291
    move-result-object v1

    .line 292
    move-object/from16 v25, v1

    .line 293
    .line 294
    check-cast v25, Landroid/widget/TextView;

    .line 295
    .line 296
    if-eqz v25, :cond_0

    .line 297
    .line 298
    const v0, 0x7f0a120a

    .line 299
    .line 300
    .line 301
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 302
    .line 303
    .line 304
    move-result-object v1

    .line 305
    check-cast v1, Landroid/widget/TextView;

    .line 306
    .line 307
    if-eqz v1, :cond_0

    .line 308
    .line 309
    new-instance v8, La/okg;

    .line 310
    .line 311
    invoke-direct/range {v8 .. v25}, La/okg;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 312
    .line 313
    .line 314
    move-object v5, v8

    .line 315
    goto :goto_0

    .line 316
    :cond_0
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 317
    .line 318
    .line 319
    move-result-object v1

    .line 320
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    :goto_0
    return-object v5

    .line 332
    :pswitch_0
    check-cast v7, La/a8z;

    .line 333
    .line 334
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    check-cast v0, La/riu0;

    .line 339
    .line 340
    instance-of v1, v0, La/wmv;

    .line 341
    .line 342
    if-eqz v1, :cond_1

    .line 343
    .line 344
    move-object v5, v0

    .line 345
    check-cast v5, La/wmv;

    .line 346
    .line 347
    :cond_1
    if-eqz v5, :cond_2

    .line 348
    .line 349
    invoke-interface {v5}, La/wmv;->n()La/miu0;

    .line 350
    .line 351
    .line 352
    move-result-object v0

    .line 353
    if-nez v0, :cond_3

    .line 354
    .line 355
    :cond_2
    check-cast v6, La/bqe;

    .line 356
    .line 357
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 358
    .line 359
    .line 360
    move-result-object v0

    .line 361
    :cond_3
    return-object v0

    .line 362
    :pswitch_1
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 363
    .line 364
    check-cast v7, La/pi90;

    .line 365
    .line 366
    invoke-interface {v6, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_2
    check-cast v6, La/fqy;

    .line 373
    .line 374
    check-cast v7, Ljava/lang/ClassLoader;

    .line 375
    .line 376
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-static {v6}, La/j0x;->w(La/fqy;)La/lgy;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    iget-object v0, v0, La/lgy;->b:Ljava/util/ArrayList;

    .line 384
    .line 385
    new-instance v1, Ljava/util/ArrayList;

    .line 386
    .line 387
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 388
    .line 389
    .line 390
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 391
    .line 392
    .line 393
    move-result-object v0

    .line 394
    :cond_4
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    if-eqz v2, :cond_6

    .line 399
    .line 400
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    move-object v3, v2

    .line 405
    check-cast v3, La/voy;

    .line 406
    .line 407
    iget-object v3, v3, La/voy;->a:Ljava/lang/String;

    .line 408
    .line 409
    invoke-static {v3}, La/jwb;->V(Ljava/lang/String;)La/qlc;

    .line 410
    .line 411
    .line 412
    move-result-object v3

    .line 413
    invoke-virtual {v3}, La/qlc;->a()La/swq;

    .line 414
    .line 415
    .line 416
    move-result-object v3

    .line 417
    sget-object v4, La/cey;->a:La/swq;

    .line 418
    .line 419
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    sget-object v4, La/bey;->q:La/swq;

    .line 423
    .line 424
    invoke-virtual {v3, v4}, La/swq;->equals(Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v4

    .line 428
    if-nez v4, :cond_4

    .line 429
    .line 430
    invoke-virtual {v3}, La/swq;->b()La/swq;

    .line 431
    .line 432
    .line 433
    move-result-object v3

    .line 434
    sget-object v4, La/e4m0;->f:La/swq;

    .line 435
    .line 436
    invoke-virtual {v3, v4}, La/swq;->equals(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_5

    .line 441
    .line 442
    goto :goto_1

    .line 443
    :cond_5
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 444
    .line 445
    .line 446
    goto :goto_1

    .line 447
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 448
    .line 449
    const/16 v2, 0xa

    .line 450
    .line 451
    invoke-static {v1, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 452
    .line 453
    .line 454
    move-result v2

    .line 455
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 459
    .line 460
    .line 461
    move-result-object v1

    .line 462
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-eqz v2, :cond_7

    .line 467
    .line 468
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    check-cast v2, La/voy;

    .line 473
    .line 474
    invoke-static {v2, v7}, La/jwb;->S(La/voy;Ljava/lang/ClassLoader;)Ljava/lang/annotation/Annotation;

    .line 475
    .line 476
    .line 477
    move-result-object v2

    .line 478
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 479
    .line 480
    .line 481
    goto :goto_2

    .line 482
    :cond_7
    return-object v0

    .line 483
    :pswitch_3
    check-cast v6, La/f7u;

    .line 484
    .line 485
    check-cast v7, La/g93;

    .line 486
    .line 487
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    .line 492
    .line 493
    iget-object v0, v6, La/f7u;->b:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, La/v7i;

    .line 496
    .line 497
    iget-object v0, v0, La/v7i;->l:Ljava/lang/Object;

    .line 498
    .line 499
    check-cast v0, La/a93;

    .line 500
    .line 501
    iget-object v1, v6, La/f7u;->d:Ljava/lang/Object;

    .line 502
    .line 503
    check-cast v1, La/a8z;

    .line 504
    .line 505
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 506
    .line 507
    .line 508
    move-result-object v1

    .line 509
    check-cast v1, La/jay;

    .line 510
    .line 511
    invoke-static {v0, v1, v7}, La/u0;->b(La/u0;La/jay;Ljava/lang/Iterable;)La/jay;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    return-object v0

    .line 516
    :pswitch_4
    check-cast v6, La/f7u;

    .line 517
    .line 518
    check-cast v7, La/vlc;

    .line 519
    .line 520
    invoke-interface {v7}, La/e83;->getAnnotations()La/g93;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 525
    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    iget-object v1, v6, La/f7u;->b:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v1, La/v7i;

    .line 533
    .line 534
    iget-object v1, v1, La/v7i;->l:Ljava/lang/Object;

    .line 535
    .line 536
    check-cast v1, La/a93;

    .line 537
    .line 538
    iget-object v2, v6, La/f7u;->d:Ljava/lang/Object;

    .line 539
    .line 540
    check-cast v2, La/a8z;

    .line 541
    .line 542
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v2

    .line 546
    check-cast v2, La/jay;

    .line 547
    .line 548
    invoke-static {v1, v2, v0}, La/u0;->b(La/u0;La/jay;Ljava/lang/Iterable;)La/jay;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    return-object v0

    .line 553
    :pswitch_5
    check-cast v6, Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 554
    .line 555
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 556
    .line 557
    .line 558
    move-result-object v0

    .line 559
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    check-cast v7, Lorg/xplatform/rules/impl/util/ContactsWebView;

    .line 567
    .line 568
    const v1, 0x7f0d008e

    .line 569
    .line 570
    .line 571
    invoke-virtual {v0, v1, v7, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 576
    .line 577
    .line 578
    move-object v1, v0

    .line 579
    check-cast v1, Landroid/widget/FrameLayout;

    .line 580
    .line 581
    const v2, 0x7f0a143e

    .line 582
    .line 583
    .line 584
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    check-cast v3, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 589
    .line 590
    if-eqz v3, :cond_8

    .line 591
    .line 592
    new-instance v5, La/rce;

    .line 593
    .line 594
    invoke-direct {v5, v1, v3}, La/rce;-><init>(Landroid/widget/FrameLayout;Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;)V

    .line 595
    .line 596
    .line 597
    goto :goto_3

    .line 598
    :cond_8
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 611
    .line 612
    .line 613
    :goto_3
    return-object v5

    .line 614
    :pswitch_6
    check-cast v7, La/a8z;

    .line 615
    .line 616
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 617
    .line 618
    .line 619
    move-result-object v0

    .line 620
    check-cast v0, La/riu0;

    .line 621
    .line 622
    instance-of v1, v0, La/wmv;

    .line 623
    .line 624
    if-eqz v1, :cond_9

    .line 625
    .line 626
    move-object v5, v0

    .line 627
    check-cast v5, La/wmv;

    .line 628
    .line 629
    :cond_9
    if-eqz v5, :cond_a

    .line 630
    .line 631
    invoke-interface {v5}, La/wmv;->n()La/miu0;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    if-nez v0, :cond_b

    .line 636
    .line 637
    :cond_a
    check-cast v6, La/dbe;

    .line 638
    .line 639
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 640
    .line 641
    .line 642
    move-result-object v0

    .line 643
    :cond_b
    return-object v0

    .line 644
    :pswitch_7
    check-cast v6, La/b0d;

    .line 645
    .line 646
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    check-cast v7, La/b0d;

    .line 658
    .line 659
    const v1, 0x7f0d0683

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 663
    .line 664
    .line 665
    const v0, 0x7f0a0367

    .line 666
    .line 667
    .line 668
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 669
    .line 670
    .line 671
    move-result-object v1

    .line 672
    check-cast v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 673
    .line 674
    if-eqz v1, :cond_c

    .line 675
    .line 676
    new-instance v5, La/xfu0;

    .line 677
    .line 678
    invoke-direct {v5, v7, v1}, La/xfu0;-><init>(La/b0d;Landroidx/appcompat/widget/AppCompatTextView;)V

    .line 679
    .line 680
    .line 681
    goto :goto_4

    .line 682
    :cond_c
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 691
    .line 692
    .line 693
    move-result-object v0

    .line 694
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 695
    .line 696
    .line 697
    :goto_4
    return-object v5

    .line 698
    :pswitch_8
    check-cast v6, La/esc;

    .line 699
    .line 700
    sget v0, La/esc;->m2:I

    .line 701
    .line 702
    iget-object v0, v6, La/esc;->l2:La/a8z;

    .line 703
    .line 704
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    check-cast v0, La/k3t0;

    .line 709
    .line 710
    check-cast v7, La/csc;

    .line 711
    .line 712
    iget-object v1, v7, La/csc;->a:La/pif0;

    .line 713
    .line 714
    new-instance v2, La/dsc;

    .line 715
    .line 716
    invoke-direct {v2, v1}, La/dsc;-><init>(La/pif0;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_9
    check-cast v6, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/CircleBorderImageView;

    .line 726
    .line 727
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 736
    .line 737
    .line 738
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/layouts/frame/CircleBorderImageView;

    .line 739
    .line 740
    const v1, 0x7f0d033b

    .line 741
    .line 742
    .line 743
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 744
    .line 745
    .line 746
    const v0, 0x7f0a052c

    .line 747
    .line 748
    .line 749
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 750
    .line 751
    .line 752
    move-result-object v1

    .line 753
    if-eqz v1, :cond_d

    .line 754
    .line 755
    const v0, 0x7f0a0747

    .line 756
    .line 757
    .line 758
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 759
    .line 760
    .line 761
    move-result-object v2

    .line 762
    check-cast v2, Landroid/widget/ImageView;

    .line 763
    .line 764
    if-eqz v2, :cond_d

    .line 765
    .line 766
    const v0, 0x7f0a07e3

    .line 767
    .line 768
    .line 769
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    if-eqz v3, :cond_d

    .line 774
    .line 775
    new-instance v5, La/v2x;

    .line 776
    .line 777
    invoke-direct {v5, v7, v1, v2, v3}, La/v2x;-><init>(Lorg/xplatform/ui_core/viewcomponents/layouts/frame/CircleBorderImageView;Landroid/view/View;Landroid/widget/ImageView;Landroid/view/View;)V

    .line 778
    .line 779
    .line 780
    goto :goto_5

    .line 781
    :cond_d
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 782
    .line 783
    .line 784
    move-result-object v1

    .line 785
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 794
    .line 795
    .line 796
    :goto_5
    return-object v5

    .line 797
    :pswitch_a
    check-cast v6, La/oic;

    .line 798
    .line 799
    sget-object v0, La/oic;->l2:La/yk5;

    .line 800
    .line 801
    invoke-virtual {v6}, La/oic;->P0()Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    iget-object v0, v0, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;->a:Ljava/lang/String;

    .line 806
    .line 807
    new-instance v1, Landroid/os/Bundle;

    .line 808
    .line 809
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 810
    .line 811
    .line 812
    check-cast v7, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;

    .line 813
    .line 814
    const-string v2, "RESULT_ON_CHOSE_FILTER_LISTENER_KEY"

    .line 815
    .line 816
    iget-object v3, v7, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterUiModel;->b:Ljava/lang/String;

    .line 817
    .line 818
    invoke-virtual {v1, v2, v3}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 819
    .line 820
    .line 821
    invoke-static {v1, v6, v0}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->R()Z

    .line 825
    .line 826
    .line 827
    move-result v0

    .line 828
    if-eqz v0, :cond_e

    .line 829
    .line 830
    goto :goto_6

    .line 831
    :cond_e
    invoke-virtual {v6}, La/yo8;->y0()V

    .line 832
    .line 833
    .line 834
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 835
    .line 836
    return-object v0

    .line 837
    :pswitch_b
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 838
    .line 839
    check-cast v7, La/e1q0;

    .line 840
    .line 841
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    new-instance v0, La/yec;

    .line 845
    .line 846
    invoke-direct {v0, v7}, La/yec;-><init>(La/e1q0;)V

    .line 847
    .line 848
    .line 849
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 850
    .line 851
    .line 852
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 853
    .line 854
    return-object v0

    .line 855
    :pswitch_c
    check-cast v6, Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 856
    .line 857
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 858
    .line 859
    .line 860
    move-result-object v0

    .line 861
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 866
    .line 867
    .line 868
    check-cast v7, Lorg/xplatform/core/presentation/bet_settings/ChipView;

    .line 869
    .line 870
    const v1, 0x7f0d0690

    .line 871
    .line 872
    .line 873
    invoke-virtual {v0, v1, v7, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 878
    .line 879
    .line 880
    const v1, 0x7f0a02ed

    .line 881
    .line 882
    .line 883
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 884
    .line 885
    .line 886
    move-result-object v2

    .line 887
    check-cast v2, Landroid/widget/ImageView;

    .line 888
    .line 889
    if-eqz v2, :cond_10

    .line 890
    .line 891
    move-object v1, v0

    .line 892
    check-cast v1, Landroid/widget/FrameLayout;

    .line 893
    .line 894
    const v3, 0x7f0a02ef

    .line 895
    .line 896
    .line 897
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 898
    .line 899
    .line 900
    move-result-object v6

    .line 901
    check-cast v6, Landroid/widget/TextView;

    .line 902
    .line 903
    if-eqz v6, :cond_f

    .line 904
    .line 905
    new-instance v5, La/dgu0;

    .line 906
    .line 907
    invoke-direct {v5, v1, v2, v1, v6}, La/dgu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/ImageView;Landroid/widget/FrameLayout;Landroid/widget/TextView;)V

    .line 908
    .line 909
    .line 910
    goto :goto_7

    .line 911
    :cond_f
    move v1, v3

    .line 912
    :cond_10
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 913
    .line 914
    .line 915
    move-result-object v0

    .line 916
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 917
    .line 918
    .line 919
    move-result-object v0

    .line 920
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 925
    .line 926
    .line 927
    :goto_7
    return-object v5

    .line 928
    :pswitch_d
    check-cast v6, La/sab;

    .line 929
    .line 930
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 931
    .line 932
    .line 933
    move-result-object v0

    .line 934
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    check-cast v7, La/sab;

    .line 942
    .line 943
    const v1, 0x7f0d0682

    .line 944
    .line 945
    .line 946
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 947
    .line 948
    .line 949
    const v0, 0x7f0a027c

    .line 950
    .line 951
    .line 952
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    check-cast v1, Landroid/widget/ImageView;

    .line 957
    .line 958
    if-eqz v1, :cond_11

    .line 959
    .line 960
    new-instance v5, La/wfu0;

    .line 961
    .line 962
    invoke-direct {v5, v7, v1}, La/wfu0;-><init>(La/sab;Landroid/widget/ImageView;)V

    .line 963
    .line 964
    .line 965
    goto :goto_8

    .line 966
    :cond_11
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 967
    .line 968
    .line 969
    move-result-object v1

    .line 970
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 975
    .line 976
    .line 977
    move-result-object v0

    .line 978
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 979
    .line 980
    .line 981
    :goto_8
    return-object v5

    .line 982
    :pswitch_e
    check-cast v6, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 983
    .line 984
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 993
    .line 994
    .line 995
    check-cast v7, Lorg/xplatform/games_section/feature/cashback/presentation/custom_view/CashbackChoiceView;

    .line 996
    .line 997
    const v1, 0x7f0d068b

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v0, v1, v7, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v0

    .line 1004
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1005
    .line 1006
    .line 1007
    const v1, 0x7f0a01fa

    .line 1008
    .line 1009
    .line 1010
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    move-object v8, v3

    .line 1015
    check-cast v8, Lcom/google/android/material/button/MaterialButton;

    .line 1016
    .line 1017
    if-eqz v8, :cond_12

    .line 1018
    .line 1019
    const v1, 0x7f0a01fb

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v3

    .line 1026
    move-object v9, v3

    .line 1027
    check-cast v9, Lcom/google/android/material/card/MaterialCardView;

    .line 1028
    .line 1029
    if-eqz v9, :cond_12

    .line 1030
    .line 1031
    const v1, 0x7f0a0203

    .line 1032
    .line 1033
    .line 1034
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v3

    .line 1038
    move-object v10, v3

    .line 1039
    check-cast v10, Lcom/google/android/material/button/MaterialButton;

    .line 1040
    .line 1041
    if-eqz v10, :cond_12

    .line 1042
    .line 1043
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v1

    .line 1047
    check-cast v1, Landroidx/constraintlayout/widget/Guideline;

    .line 1048
    .line 1049
    if-eqz v1, :cond_13

    .line 1050
    .line 1051
    const v2, 0x7f0a12d8

    .line 1052
    .line 1053
    .line 1054
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v1

    .line 1058
    move-object v11, v1

    .line 1059
    check-cast v11, Landroid/widget/TextView;

    .line 1060
    .line 1061
    if-eqz v11, :cond_13

    .line 1062
    .line 1063
    new-instance v6, La/bgu0;

    .line 1064
    .line 1065
    move-object v7, v0

    .line 1066
    check-cast v7, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1067
    .line 1068
    invoke-direct/range {v6 .. v11}, La/bgu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/google/android/material/button/MaterialButton;Lcom/google/android/material/card/MaterialCardView;Lcom/google/android/material/button/MaterialButton;Landroid/widget/TextView;)V

    .line 1069
    .line 1070
    .line 1071
    move-object v5, v6

    .line 1072
    goto :goto_9

    .line 1073
    :cond_12
    move v2, v1

    .line 1074
    :cond_13
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v0

    .line 1078
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v0

    .line 1082
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1083
    .line 1084
    .line 1085
    move-result-object v0

    .line 1086
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1087
    .line 1088
    .line 1089
    :goto_9
    return-object v5

    .line 1090
    :pswitch_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1091
    .line 1092
    new-instance v0, La/oz8;

    .line 1093
    .line 1094
    check-cast v7, La/vz8;

    .line 1095
    .line 1096
    iget v1, v7, La/vz8;->a:I

    .line 1097
    .line 1098
    invoke-direct {v0, v1}, La/oz8;-><init>(I)V

    .line 1099
    .line 1100
    .line 1101
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1102
    .line 1103
    .line 1104
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1105
    .line 1106
    return-object v0

    .line 1107
    :pswitch_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1108
    .line 1109
    check-cast v6, La/zv8;

    .line 1110
    .line 1111
    check-cast v6, La/wv8;

    .line 1112
    .line 1113
    iget-object v0, v6, La/wv8;->a:Ljava/lang/String;

    .line 1114
    .line 1115
    const-string v1, "SORTING_SETTING_CELL_ID"

    .line 1116
    .line 1117
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1118
    .line 1119
    .line 1120
    move-result v0

    .line 1121
    if-eqz v0, :cond_14

    .line 1122
    .line 1123
    sget-object v0, La/jv8;->a:La/jv8;

    .line 1124
    .line 1125
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    :cond_14
    iget-object v0, v6, La/wv8;->a:Ljava/lang/String;

    .line 1129
    .line 1130
    const-string v1, "LANGUAGES_SETTING_CELL_ID"

    .line 1131
    .line 1132
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v0

    .line 1136
    if-eqz v0, :cond_15

    .line 1137
    .line 1138
    sget-object v0, La/iv8;->a:La/iv8;

    .line 1139
    .line 1140
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1141
    .line 1142
    .line 1143
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1144
    .line 1145
    return-object v0

    .line 1146
    :pswitch_11
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1147
    .line 1148
    new-instance v0, La/s2f0;

    .line 1149
    .line 1150
    check-cast v7, La/bh8;

    .line 1151
    .line 1152
    iget v1, v7, La/bh8;->a:I

    .line 1153
    .line 1154
    invoke-direct {v0, v1}, La/s2f0;-><init>(I)V

    .line 1155
    .line 1156
    .line 1157
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1161
    .line 1162
    return-object v0

    .line 1163
    :pswitch_12
    check-cast v6, La/ad6;

    .line 1164
    .line 1165
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v0

    .line 1173
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    check-cast v7, La/ad6;

    .line 1177
    .line 1178
    const v1, 0x7f0d004d

    .line 1179
    .line 1180
    .line 1181
    invoke-virtual {v0, v1, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1182
    .line 1183
    .line 1184
    const v0, 0x7f0a10ff

    .line 1185
    .line 1186
    .line 1187
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1188
    .line 1189
    .line 1190
    move-result-object v1

    .line 1191
    check-cast v1, Landroid/widget/TextView;

    .line 1192
    .line 1193
    if-eqz v1, :cond_16

    .line 1194
    .line 1195
    const v0, 0x7f0a1260

    .line 1196
    .line 1197
    .line 1198
    invoke-static {v7, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    check-cast v2, Landroid/widget/TextView;

    .line 1203
    .line 1204
    if-eqz v2, :cond_16

    .line 1205
    .line 1206
    new-instance v5, La/bd6;

    .line 1207
    .line 1208
    invoke-direct {v5, v7, v1, v2}, La/bd6;-><init>(La/ad6;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1209
    .line 1210
    .line 1211
    goto :goto_a

    .line 1212
    :cond_16
    invoke-virtual {v7}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v0

    .line 1220
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1221
    .line 1222
    .line 1223
    move-result-object v0

    .line 1224
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1225
    .line 1226
    .line 1227
    :goto_a
    return-object v5

    .line 1228
    :pswitch_13
    check-cast v7, La/a8z;

    .line 1229
    .line 1230
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v0

    .line 1234
    check-cast v0, La/riu0;

    .line 1235
    .line 1236
    instance-of v1, v0, La/wmv;

    .line 1237
    .line 1238
    if-eqz v1, :cond_17

    .line 1239
    .line 1240
    move-object v5, v0

    .line 1241
    check-cast v5, La/wmv;

    .line 1242
    .line 1243
    :cond_17
    if-eqz v5, :cond_18

    .line 1244
    .line 1245
    invoke-interface {v5}, La/wmv;->n()La/miu0;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v0

    .line 1249
    if-nez v0, :cond_19

    .line 1250
    .line 1251
    :cond_18
    check-cast v6, La/rw4;

    .line 1252
    .line 1253
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 1254
    .line 1255
    .line 1256
    move-result-object v0

    .line 1257
    :cond_19
    return-object v0

    .line 1258
    :pswitch_14
    check-cast v6, La/ze4;

    .line 1259
    .line 1260
    sget-object v0, La/ze4;->g2:La/qek0;

    .line 1261
    .line 1262
    invoke-virtual {v6}, La/ze4;->K0()La/k3t0;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v0

    .line 1266
    new-instance v1, La/od4;

    .line 1267
    .line 1268
    check-cast v7, La/af4;

    .line 1269
    .line 1270
    iget v2, v7, La/af4;->b:I

    .line 1271
    .line 1272
    invoke-direct {v1, v2}, La/od4;-><init>(I)V

    .line 1273
    .line 1274
    .line 1275
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1276
    .line 1277
    .line 1278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1279
    .line 1280
    return-object v0

    .line 1281
    :pswitch_15
    check-cast v6, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 1282
    .line 1283
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v0

    .line 1287
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1292
    .line 1293
    .line 1294
    move-object v9, v7

    .line 1295
    check-cast v9, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 1296
    .line 1297
    const v1, 0x7f0d0042

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v0, v1, v9}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1301
    .line 1302
    .line 1303
    const v0, 0x7f0a00bb

    .line 1304
    .line 1305
    .line 1306
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v1

    .line 1310
    move-object v10, v1

    .line 1311
    check-cast v10, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;

    .line 1312
    .line 1313
    if-eqz v10, :cond_1a

    .line 1314
    .line 1315
    const v0, 0x7f0a01a0

    .line 1316
    .line 1317
    .line 1318
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v1

    .line 1322
    check-cast v1, Landroidx/appcompat/widget/AppCompatTextView;

    .line 1323
    .line 1324
    if-eqz v1, :cond_1a

    .line 1325
    .line 1326
    const v0, 0x7f0a03e5

    .line 1327
    .line 1328
    .line 1329
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v1

    .line 1333
    move-object v11, v1

    .line 1334
    check-cast v11, Landroid/widget/TextView;

    .line 1335
    .line 1336
    if-eqz v11, :cond_1a

    .line 1337
    .line 1338
    const v0, 0x7f0a066e

    .line 1339
    .line 1340
    .line 1341
    invoke-static {v9, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v1

    .line 1345
    move-object v12, v1

    .line 1346
    check-cast v12, Landroid/widget/Button;

    .line 1347
    .line 1348
    if-eqz v12, :cond_1a

    .line 1349
    .line 1350
    invoke-static {v9, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v0

    .line 1354
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 1355
    .line 1356
    if-eqz v0, :cond_1b

    .line 1357
    .line 1358
    const v2, 0x7f0a0da8

    .line 1359
    .line 1360
    .line 1361
    invoke-static {v9, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v13

    .line 1365
    if-eqz v13, :cond_1b

    .line 1366
    .line 1367
    new-instance v8, La/lp3;

    .line 1368
    .line 1369
    invoke-direct/range {v8 .. v13}, La/lp3;-><init>(Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneGameView;Landroid/widget/TextView;Landroid/widget/Button;Landroid/view/View;)V

    .line 1370
    .line 1371
    .line 1372
    move-object v5, v8

    .line 1373
    goto :goto_b

    .line 1374
    :cond_1a
    move v2, v0

    .line 1375
    :cond_1b
    invoke-virtual {v9}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v0

    .line 1379
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v0

    .line 1383
    invoke-virtual {v4, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    :goto_b
    return-object v5

    .line 1391
    :pswitch_16
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1392
    .line 1393
    new-instance v0, La/l93;

    .line 1394
    .line 1395
    check-cast v7, La/qa5;

    .line 1396
    .line 1397
    iget-wide v1, v7, La/qa5;->a:J

    .line 1398
    .line 1399
    invoke-direct {v0, v1, v2}, La/l93;-><init>(J)V

    .line 1400
    .line 1401
    .line 1402
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1406
    .line 1407
    return-object v0

    .line 1408
    :pswitch_17
    check-cast v6, Ljava/lang/Class;

    .line 1409
    .line 1410
    check-cast v7, Ljava/util/Map;

    .line 1411
    .line 1412
    new-instance v9, Ljava/lang/StringBuilder;

    .line 1413
    .line 1414
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 1415
    .line 1416
    .line 1417
    const/16 v0, 0x40

    .line 1418
    .line 1419
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v6}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1427
    .line 1428
    .line 1429
    invoke-interface {v7}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    move-object v8, v0

    .line 1434
    check-cast v8, Ljava/lang/Iterable;

    .line 1435
    .line 1436
    sget-object v13, La/i13;->c:La/i13;

    .line 1437
    .line 1438
    const/16 v14, 0x30

    .line 1439
    .line 1440
    const-string v10, ", "

    .line 1441
    .line 1442
    const-string v11, "("

    .line 1443
    .line 1444
    const-string v12, ")"

    .line 1445
    .line 1446
    invoke-static/range {v8 .. v14}, Lkotlin/collections/CollectionsKt;->a0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    return-object v0

    .line 1454
    :pswitch_18
    check-cast v7, La/a8z;

    .line 1455
    .line 1456
    invoke-interface {v7}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1457
    .line 1458
    .line 1459
    move-result-object v0

    .line 1460
    check-cast v0, La/riu0;

    .line 1461
    .line 1462
    instance-of v1, v0, La/wmv;

    .line 1463
    .line 1464
    if-eqz v1, :cond_1c

    .line 1465
    .line 1466
    move-object v5, v0

    .line 1467
    check-cast v5, La/wmv;

    .line 1468
    .line 1469
    :cond_1c
    if-eqz v5, :cond_1d

    .line 1470
    .line 1471
    invoke-interface {v5}, La/wmv;->n()La/miu0;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v0

    .line 1475
    if-nez v0, :cond_1e

    .line 1476
    .line 1477
    :cond_1d
    check-cast v6, La/q21;

    .line 1478
    .line 1479
    invoke-virtual {v6}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v0

    .line 1483
    :cond_1e
    return-object v0

    .line 1484
    :pswitch_19
    sget-object v1, La/ays0;->b:La/fck0;

    .line 1485
    .line 1486
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1487
    .line 1488
    .line 1489
    sget-object v1, La/ays0;->c:La/ays0;

    .line 1490
    .line 1491
    check-cast v7, La/t5;

    .line 1492
    .line 1493
    invoke-virtual {v7}, La/t5;->h()La/iys0;

    .line 1494
    .line 1495
    .line 1496
    move-result-object v2

    .line 1497
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 1498
    .line 1499
    new-instance v5, La/mdz;

    .line 1500
    .line 1501
    new-instance v6, La/o5;

    .line 1502
    .line 1503
    const/4 v7, 0x2

    .line 1504
    invoke-direct {v6, v0, v7}, La/o5;-><init>(Ljava/lang/Object;B)V

    .line 1505
    .line 1506
    .line 1507
    sget-object v0, La/eu00;->e:La/wt00;

    .line 1508
    .line 1509
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1510
    .line 1511
    .line 1512
    invoke-direct {v5, v0, v6}, La/mdz;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 1513
    .line 1514
    .line 1515
    invoke-static {v5, v1, v2, v4, v3}, La/ucx;->h0(La/cr30;La/ays0;La/iys0;Ljava/util/List;Z)La/kzj0;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    return-object v0

    .line 1520
    :pswitch_1a
    new-instance v0, La/s5;

    .line 1521
    .line 1522
    check-cast v7, La/t5;

    .line 1523
    .line 1524
    check-cast v6, La/eu00;

    .line 1525
    .line 1526
    invoke-direct {v0, v7, v6}, La/s5;-><init>(La/t5;La/eu00;)V

    .line 1527
    .line 1528
    .line 1529
    return-object v0

    .line 1530
    :pswitch_1b
    check-cast v6, Ljava/util/List;

    .line 1531
    .line 1532
    check-cast v7, La/q8a;

    .line 1533
    .line 1534
    new-instance v0, Ljava/util/ArrayList;

    .line 1535
    .line 1536
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1537
    .line 1538
    .line 1539
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v1

    .line 1543
    :cond_1f
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1544
    .line 1545
    .line 1546
    move-result v2

    .line 1547
    if-eqz v2, :cond_20

    .line 1548
    .line 1549
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v2

    .line 1553
    check-cast v2, La/aty;

    .line 1554
    .line 1555
    invoke-virtual {v7, v2}, La/q8a;->c0(La/aty;)La/aty;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v2

    .line 1559
    if-eqz v2, :cond_1f

    .line 1560
    .line 1561
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1562
    .line 1563
    .line 1564
    goto :goto_c

    .line 1565
    :cond_20
    return-object v0

    .line 1566
    nop

    .line 1567
    :pswitch_data_0
    .packed-switch 0x0
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
