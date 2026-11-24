.class public final synthetic La/zc70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 3
    iput-byte p1, p0, La/zc70;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/zc70;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/z880;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    iput-byte p1, p0, La/zc70;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/zc70;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/Throwable;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 19
    .line 20
    .line 21
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object v0

    .line 24
    :pswitch_0
    move-object/from16 v0, p1

    .line 25
    .line 26
    check-cast v0, Ljava/lang/Throwable;

    .line 27
    .line 28
    move-object/from16 v1, p2

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    move-object/from16 v0, p1

    .line 39
    .line 40
    check-cast v0, La/oyg0;

    .line 41
    .line 42
    move-object/from16 v3, p2

    .line 43
    .line 44
    check-cast v3, La/rs80;

    .line 45
    .line 46
    iget-object v0, v3, La/rs80;->w:La/wr80;

    .line 47
    .line 48
    new-instance v4, La/ur80;

    .line 49
    .line 50
    new-instance v5, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;

    .line 51
    .line 52
    const-string v6, "0"

    .line 53
    .line 54
    const-string v7, "ALL_FILTER_DEFAULT_CHIP"

    .line 55
    .line 56
    invoke-direct {v5, v6, v7, v1, v2}, Lorg/xplatform/aggregator/impl/category/presentation/models/PromotedCategoryUiModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 57
    .line 58
    .line 59
    invoke-static {v5}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-direct {v4, v1}, La/ur80;-><init>(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v9

    .line 70
    const/16 v22, 0x0

    .line 71
    .line 72
    const v23, 0x7ffffdf

    .line 73
    .line 74
    .line 75
    const/4 v4, 0x0

    .line 76
    const/4 v5, 0x0

    .line 77
    const/4 v6, 0x0

    .line 78
    const/4 v7, 0x0

    .line 79
    const/4 v8, 0x0

    .line 80
    const/4 v10, 0x0

    .line 81
    const/4 v11, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    const/4 v13, 0x0

    .line 84
    const/4 v14, 0x0

    .line 85
    const/4 v15, 0x0

    .line 86
    const/16 v16, 0x0

    .line 87
    .line 88
    const/16 v17, 0x0

    .line 89
    .line 90
    const/16 v18, 0x0

    .line 91
    .line 92
    const/16 v19, 0x0

    .line 93
    .line 94
    const/16 v20, 0x0

    .line 95
    .line 96
    const/16 v21, 0x0

    .line 97
    .line 98
    invoke-static/range {v3 .. v23}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    return-object v0

    .line 103
    :pswitch_2
    move-object/from16 v0, p1

    .line 104
    .line 105
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 106
    .line 107
    move-object/from16 v1, p2

    .line 108
    .line 109
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    new-instance v2, La/r580;

    .line 118
    .line 119
    const/16 v3, 0x1b

    .line 120
    .line 121
    invoke-direct {v2, v3}, La/r580;-><init>(B)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    new-instance v0, La/i280;

    .line 128
    .line 129
    const/16 v2, 0xf

    .line 130
    .line 131
    invoke-direct {v0, v2}, La/i280;-><init>(B)V

    .line 132
    .line 133
    .line 134
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object v0

    .line 140
    :pswitch_3
    move-object/from16 v0, p1

    .line 141
    .line 142
    check-cast v0, La/oyg0;

    .line 143
    .line 144
    move-object/from16 v1, p2

    .line 145
    .line 146
    check-cast v1, La/rs80;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v12, v1, La/rs80;->r:Ljava/util/List;

    .line 155
    .line 156
    const/16 v20, 0x0

    .line 157
    .line 158
    const v21, 0x7fdffff

    .line 159
    .line 160
    .line 161
    const/4 v2, 0x0

    .line 162
    const/4 v3, 0x0

    .line 163
    const/4 v4, 0x0

    .line 164
    const/4 v5, 0x0

    .line 165
    const/4 v6, 0x0

    .line 166
    const/4 v7, 0x0

    .line 167
    const/4 v8, 0x0

    .line 168
    const/4 v9, 0x0

    .line 169
    const/4 v10, 0x0

    .line 170
    const/4 v11, 0x0

    .line 171
    const/4 v13, 0x0

    .line 172
    const/4 v14, 0x0

    .line 173
    const/4 v15, 0x0

    .line 174
    const/16 v16, 0x0

    .line 175
    .line 176
    const/16 v17, 0x0

    .line 177
    .line 178
    const/16 v18, 0x0

    .line 179
    .line 180
    const/16 v19, 0x0

    .line 181
    .line 182
    invoke-static/range {v1 .. v21}, La/rs80;->a(La/rs80;ZZZZZZZLjava/lang/String;Ljava/lang/String;Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreenModel;Ljava/util/List;Ljava/util/Set;La/pr80;La/ql5;La/wr80;Ljava/util/List;Ljava/util/List;ZLkotlin/Pair;I)La/rs80;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    return-object v0

    .line 187
    :pswitch_4
    move-object/from16 v0, p1

    .line 188
    .line 189
    check-cast v0, Ljava/lang/Throwable;

    .line 190
    .line 191
    move-object/from16 v1, p2

    .line 192
    .line 193
    check-cast v1, Ljava/lang/String;

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 202
    .line 203
    return-object v0

    .line 204
    :pswitch_5
    move-object/from16 v0, p1

    .line 205
    .line 206
    check-cast v0, Ljava/lang/Throwable;

    .line 207
    .line 208
    move-object/from16 v1, p2

    .line 209
    .line 210
    check-cast v1, Ljava/lang/String;

    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 219
    .line 220
    return-object v0

    .line 221
    :pswitch_6
    move-object/from16 v0, p1

    .line 222
    .line 223
    check-cast v0, Ljava/lang/Throwable;

    .line 224
    .line 225
    move-object/from16 v1, p2

    .line 226
    .line 227
    check-cast v1, Ljava/lang/String;

    .line 228
    .line 229
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 233
    .line 234
    return-object v0

    .line 235
    :pswitch_7
    move-object/from16 v0, p1

    .line 236
    .line 237
    check-cast v0, Ljava/lang/Long;

    .line 238
    .line 239
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    move-object/from16 v0, p2

    .line 243
    .line 244
    check-cast v0, Ljava/lang/Boolean;

    .line 245
    .line 246
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_8
    move-object/from16 v0, p1

    .line 253
    .line 254
    check-cast v0, Ljava/lang/Long;

    .line 255
    .line 256
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    move-object/from16 v0, p2

    .line 260
    .line 261
    check-cast v0, Ljava/lang/Boolean;

    .line 262
    .line 263
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    return-object v0

    .line 269
    :pswitch_9
    move-object/from16 v0, p1

    .line 270
    .line 271
    check-cast v0, Ljava/lang/Long;

    .line 272
    .line 273
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    move-object/from16 v0, p2

    .line 277
    .line 278
    check-cast v0, Ljava/lang/Boolean;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 284
    .line 285
    return-object v0

    .line 286
    :pswitch_a
    move-object/from16 v0, p1

    .line 287
    .line 288
    check-cast v0, Ljava/lang/Long;

    .line 289
    .line 290
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-object/from16 v0, p2

    .line 294
    .line 295
    check-cast v0, Ljava/lang/Boolean;

    .line 296
    .line 297
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object v0

    .line 303
    :pswitch_b
    move-object/from16 v0, p1

    .line 304
    .line 305
    check-cast v0, La/fet;

    .line 306
    .line 307
    move-object/from16 v1, p2

    .line 308
    .line 309
    check-cast v1, Ljava/lang/Integer;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    invoke-static {v2}, La/x8x;->L(I)I

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    invoke-static {v1, v0}, La/m7x;->g(ILa/fet;)V

    .line 319
    .line 320
    .line 321
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 322
    .line 323
    return-object v0

    .line 324
    :pswitch_c
    move-object/from16 v0, p1

    .line 325
    .line 326
    check-cast v0, Landroid/view/LayoutInflater;

    .line 327
    .line 328
    move-object/from16 v2, p2

    .line 329
    .line 330
    check-cast v2, Landroid/view/ViewGroup;

    .line 331
    .line 332
    const v3, 0x7f0d0505

    .line 333
    .line 334
    .line 335
    const/4 v4, 0x0

    .line 336
    invoke-static {v0, v2, v3, v2, v4}, La/rw2;->f(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    if-eqz v0, :cond_0

    .line 341
    .line 342
    new-instance v1, La/vi80;

    .line 343
    .line 344
    check-cast v0, Lorg/xplatform/uikit/components/views/AppCompatView;

    .line 345
    .line 346
    invoke-direct {v1, v0}, La/vi80;-><init>(Lorg/xplatform/uikit/components/views/AppCompatView;)V

    .line 347
    .line 348
    .line 349
    goto :goto_0

    .line 350
    :cond_0
    const-string v0, "rootView"

    .line 351
    .line 352
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 353
    .line 354
    .line 355
    :goto_0
    return-object v1

    .line 356
    :pswitch_d
    move-object/from16 v0, p1

    .line 357
    .line 358
    check-cast v0, La/fet;

    .line 359
    .line 360
    move-object/from16 v1, p2

    .line 361
    .line 362
    check-cast v1, Ljava/lang/Integer;

    .line 363
    .line 364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 365
    .line 366
    .line 367
    invoke-static {v2}, La/x8x;->L(I)I

    .line 368
    .line 369
    .line 370
    move-result v1

    .line 371
    invoke-static {v1, v0}, La/nnw0;->j(ILa/fet;)V

    .line 372
    .line 373
    .line 374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_e
    move-object/from16 v0, p1

    .line 378
    .line 379
    check-cast v0, Ljava/lang/Integer;

    .line 380
    .line 381
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    move-object/from16 v0, p2

    .line 385
    .line 386
    check-cast v0, La/zhr0;

    .line 387
    .line 388
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-interface {v0}, La/zhr0;->a()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    return-object v0

    .line 396
    :pswitch_f
    move-object/from16 v0, p1

    .line 397
    .line 398
    check-cast v0, Ljava/lang/Integer;

    .line 399
    .line 400
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 401
    .line 402
    .line 403
    move-object/from16 v1, p2

    .line 404
    .line 405
    check-cast v1, La/fdp;

    .line 406
    .line 407
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 408
    .line 409
    .line 410
    instance-of v2, v1, La/edp;

    .line 411
    .line 412
    if-eqz v2, :cond_1

    .line 413
    .line 414
    check-cast v1, La/edp;

    .line 415
    .line 416
    iget-object v0, v1, La/edp;->b:Ljava/lang/String;

    .line 417
    .line 418
    :cond_1
    return-object v0

    .line 419
    :pswitch_10
    move-object/from16 v0, p1

    .line 420
    .line 421
    check-cast v0, Ljava/lang/Integer;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    move-object/from16 v2, p2

    .line 428
    .line 429
    check-cast v2, La/p6t0;

    .line 430
    .line 431
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    instance-of v3, v2, La/dee0;

    .line 435
    .line 436
    if-eqz v3, :cond_2

    .line 437
    .line 438
    check-cast v2, La/dee0;

    .line 439
    .line 440
    iget-object v0, v2, La/dee0;->a:La/a2n;

    .line 441
    .line 442
    invoke-interface {v0}, La/a2n;->getKey()Ljava/lang/String;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    goto :goto_1

    .line 447
    :cond_2
    instance-of v3, v2, La/bc80;

    .line 448
    .line 449
    if-eqz v3, :cond_3

    .line 450
    .line 451
    check-cast v2, La/bc80;

    .line 452
    .line 453
    iget-object v0, v2, La/bc80;->b:Ljava/lang/String;

    .line 454
    .line 455
    goto :goto_1

    .line 456
    :cond_3
    instance-of v3, v2, La/rc80;

    .line 457
    .line 458
    if-eqz v3, :cond_4

    .line 459
    .line 460
    check-cast v2, La/rc80;

    .line 461
    .line 462
    iget-object v0, v2, La/rc80;->a:La/jjm;

    .line 463
    .line 464
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    invoke-static {v1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v0

    .line 472
    :cond_4
    :goto_1
    return-object v0

    .line 473
    :pswitch_11
    move-object/from16 v0, p1

    .line 474
    .line 475
    check-cast v0, Ljava/lang/Integer;

    .line 476
    .line 477
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 478
    .line 479
    .line 480
    move-result v1

    .line 481
    move-object/from16 v2, p2

    .line 482
    .line 483
    check-cast v2, La/p6t0;

    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    instance-of v3, v2, La/nt0;

    .line 489
    .line 490
    if-eqz v3, :cond_5

    .line 491
    .line 492
    check-cast v2, La/nt0;

    .line 493
    .line 494
    invoke-virtual {v2}, La/nt0;->getKey()Ljava/lang/String;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    goto :goto_2

    .line 499
    :cond_5
    instance-of v3, v2, La/rt0;

    .line 500
    .line 501
    if-eqz v3, :cond_6

    .line 502
    .line 503
    check-cast v2, La/rt0;

    .line 504
    .line 505
    invoke-virtual {v2}, La/rt0;->getKey()Ljava/lang/String;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    goto :goto_2

    .line 510
    :cond_6
    instance-of v3, v2, La/rfp;

    .line 511
    .line 512
    if-eqz v3, :cond_7

    .line 513
    .line 514
    invoke-interface {v2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    goto :goto_2

    .line 519
    :cond_7
    instance-of v3, v2, La/sfp;

    .line 520
    .line 521
    if-eqz v3, :cond_8

    .line 522
    .line 523
    invoke-interface {v2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    goto :goto_2

    .line 528
    :cond_8
    instance-of v3, v2, La/wde0;

    .line 529
    .line 530
    if-eqz v3, :cond_9

    .line 531
    .line 532
    check-cast v2, La/wde0;

    .line 533
    .line 534
    iget-object v0, v2, La/wde0;->b:Ljava/lang/String;

    .line 535
    .line 536
    goto :goto_2

    .line 537
    :cond_9
    instance-of v3, v2, La/rc80;

    .line 538
    .line 539
    if-eqz v3, :cond_a

    .line 540
    .line 541
    check-cast v2, La/rc80;

    .line 542
    .line 543
    iget-object v0, v2, La/rc80;->a:La/jjm;

    .line 544
    .line 545
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 546
    .line 547
    .line 548
    move-result-object v0

    .line 549
    invoke-static {v1, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    :cond_a
    :goto_2
    return-object v0

    .line 554
    :pswitch_12
    move-object/from16 v0, p1

    .line 555
    .line 556
    check-cast v0, Ljava/lang/String;

    .line 557
    .line 558
    move-object/from16 v1, p2

    .line 559
    .line 560
    check-cast v1, Landroid/os/Bundle;

    .line 561
    .line 562
    sget-object v2, La/z880;->U1:La/xi70;

    .line 563
    .line 564
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    return-object v0

    .line 573
    :pswitch_13
    move-object/from16 v0, p1

    .line 574
    .line 575
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 576
    .line 577
    move-object/from16 v1, p2

    .line 578
    .line 579
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    sget-object v2, La/s580;->a:La/s580;

    .line 588
    .line 589
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    new-instance v0, La/i280;

    .line 593
    .line 594
    const/4 v2, 0x7

    .line 595
    invoke-direct {v0, v2}, La/i280;-><init>(B)V

    .line 596
    .line 597
    .line 598
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 602
    .line 603
    return-object v0

    .line 604
    :pswitch_14
    move-object/from16 v0, p1

    .line 605
    .line 606
    check-cast v0, Ljava/lang/Integer;

    .line 607
    .line 608
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    move-object/from16 v2, p2

    .line 613
    .line 614
    check-cast v2, La/ka00;

    .line 615
    .line 616
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 617
    .line 618
    .line 619
    instance-of v3, v2, La/ia00;

    .line 620
    .line 621
    const-string v4, "_"

    .line 622
    .line 623
    if-eqz v3, :cond_b

    .line 624
    .line 625
    check-cast v2, La/ia00;

    .line 626
    .line 627
    iget-object v1, v2, La/ia00;->a:Ljava/lang/String;

    .line 628
    .line 629
    new-instance v2, Ljava/lang/StringBuilder;

    .line 630
    .line 631
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 632
    .line 633
    .line 634
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 638
    .line 639
    .line 640
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    goto :goto_3

    .line 645
    :cond_b
    instance-of v3, v2, La/ja00;

    .line 646
    .line 647
    if-eqz v3, :cond_c

    .line 648
    .line 649
    check-cast v2, La/ja00;

    .line 650
    .line 651
    iget-object v1, v2, La/ja00;->a:Ljava/lang/String;

    .line 652
    .line 653
    new-instance v2, Ljava/lang/StringBuilder;

    .line 654
    .line 655
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 656
    .line 657
    .line 658
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 659
    .line 660
    .line 661
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    goto :goto_3

    .line 669
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 670
    .line 671
    .line 672
    :goto_3
    return-object v1

    .line 673
    :pswitch_15
    move-object/from16 v0, p1

    .line 674
    .line 675
    check-cast v0, La/fet;

    .line 676
    .line 677
    move-object/from16 v1, p2

    .line 678
    .line 679
    check-cast v1, Ljava/lang/Integer;

    .line 680
    .line 681
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-static {v2}, La/x8x;->L(I)I

    .line 685
    .line 686
    .line 687
    move-result v1

    .line 688
    invoke-static {v1, v0}, La/m7x;->e(ILa/fet;)V

    .line 689
    .line 690
    .line 691
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 692
    .line 693
    return-object v0

    .line 694
    :pswitch_16
    move-object/from16 v0, p1

    .line 695
    .line 696
    check-cast v0, La/oyg0;

    .line 697
    .line 698
    move-object/from16 v1, p2

    .line 699
    .line 700
    check-cast v1, La/xb70;

    .line 701
    .line 702
    iget-object v2, v1, La/xb70;->n:La/fa70;

    .line 703
    .line 704
    const/4 v11, 0x0

    .line 705
    const/16 v12, 0x39

    .line 706
    .line 707
    const/4 v3, 0x0

    .line 708
    const/4 v4, 0x0

    .line 709
    const/4 v5, 0x0

    .line 710
    const/4 v6, 0x0

    .line 711
    const-wide/16 v7, 0x0

    .line 712
    .line 713
    const/4 v9, 0x0

    .line 714
    const/4 v10, 0x1

    .line 715
    invoke-static/range {v2 .. v12}, La/fa70;->a(La/fa70;ZZZZJZZZI)La/fa70;

    .line 716
    .line 717
    .line 718
    move-result-object v15

    .line 719
    iget-object v2, v1, La/xb70;->o:La/f970;

    .line 720
    .line 721
    const/4 v10, 0x0

    .line 722
    const/4 v11, 0x1

    .line 723
    const-wide/16 v6, 0x0

    .line 724
    .line 725
    const/4 v8, 0x0

    .line 726
    invoke-static/range {v2 .. v11}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 727
    .line 728
    .line 729
    move-result-object v16

    .line 730
    const/16 v18, 0x0

    .line 731
    .line 732
    const v19, 0x19fff

    .line 733
    .line 734
    .line 735
    const/4 v2, 0x0

    .line 736
    const/4 v3, 0x0

    .line 737
    const/4 v4, 0x0

    .line 738
    const/4 v6, 0x0

    .line 739
    const/4 v7, 0x0

    .line 740
    const/4 v10, 0x0

    .line 741
    const/4 v11, 0x0

    .line 742
    const/4 v12, 0x0

    .line 743
    const/4 v13, 0x0

    .line 744
    const/4 v14, 0x0

    .line 745
    const/16 v17, 0x0

    .line 746
    .line 747
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    return-object v0

    .line 752
    :pswitch_17
    move-object/from16 v0, p1

    .line 753
    .line 754
    check-cast v0, La/oyg0;

    .line 755
    .line 756
    move-object/from16 v1, p2

    .line 757
    .line 758
    check-cast v1, La/xb70;

    .line 759
    .line 760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    const/16 v18, 0x0

    .line 767
    .line 768
    const v19, 0x1efff

    .line 769
    .line 770
    .line 771
    const/4 v2, 0x0

    .line 772
    const/4 v3, 0x0

    .line 773
    const/4 v4, 0x0

    .line 774
    const/4 v5, 0x0

    .line 775
    const/4 v6, 0x0

    .line 776
    const/4 v7, 0x0

    .line 777
    const/4 v8, 0x0

    .line 778
    const/4 v9, 0x0

    .line 779
    const/4 v10, 0x0

    .line 780
    const/4 v11, 0x0

    .line 781
    const/4 v12, 0x0

    .line 782
    const/4 v13, 0x0

    .line 783
    const/4 v14, 0x1

    .line 784
    const/4 v15, 0x0

    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    return-object v0

    .line 794
    :pswitch_18
    move-object/from16 v0, p1

    .line 795
    .line 796
    check-cast v0, La/oyg0;

    .line 797
    .line 798
    move-object/from16 v1, p2

    .line 799
    .line 800
    check-cast v1, La/xb70;

    .line 801
    .line 802
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    iget-object v2, v1, La/xb70;->o:La/f970;

    .line 809
    .line 810
    const/4 v10, 0x0

    .line 811
    const/16 v11, 0x7d

    .line 812
    .line 813
    const/4 v3, 0x0

    .line 814
    const/4 v4, 0x1

    .line 815
    const/4 v5, 0x0

    .line 816
    const-wide/16 v6, 0x0

    .line 817
    .line 818
    const/4 v8, 0x0

    .line 819
    const/4 v9, 0x0

    .line 820
    invoke-static/range {v2 .. v11}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 821
    .line 822
    .line 823
    move-result-object v16

    .line 824
    const/16 v18, 0x0

    .line 825
    .line 826
    const v19, 0x1bfff

    .line 827
    .line 828
    .line 829
    const/4 v2, 0x0

    .line 830
    const/4 v3, 0x0

    .line 831
    const/4 v4, 0x0

    .line 832
    const/4 v6, 0x0

    .line 833
    const/4 v7, 0x0

    .line 834
    const/4 v10, 0x0

    .line 835
    const/4 v11, 0x0

    .line 836
    const/4 v12, 0x0

    .line 837
    const/4 v13, 0x0

    .line 838
    const/4 v14, 0x0

    .line 839
    const/4 v15, 0x0

    .line 840
    const/16 v17, 0x0

    .line 841
    .line 842
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 843
    .line 844
    .line 845
    move-result-object v0

    .line 846
    return-object v0

    .line 847
    :pswitch_19
    move-object/from16 v0, p1

    .line 848
    .line 849
    check-cast v0, La/oyg0;

    .line 850
    .line 851
    move-object/from16 v1, p2

    .line 852
    .line 853
    check-cast v1, La/xb70;

    .line 854
    .line 855
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    iget-object v2, v1, La/xb70;->n:La/fa70;

    .line 862
    .line 863
    const/4 v11, 0x0

    .line 864
    const/16 v12, 0xfb

    .line 865
    .line 866
    const/4 v3, 0x0

    .line 867
    const/4 v4, 0x0

    .line 868
    const/4 v5, 0x1

    .line 869
    const/4 v6, 0x0

    .line 870
    const-wide/16 v7, 0x0

    .line 871
    .line 872
    const/4 v9, 0x0

    .line 873
    const/4 v10, 0x0

    .line 874
    invoke-static/range {v2 .. v12}, La/fa70;->a(La/fa70;ZZZZJZZZI)La/fa70;

    .line 875
    .line 876
    .line 877
    move-result-object v15

    .line 878
    const/16 v18, 0x0

    .line 879
    .line 880
    const v19, 0x1dfff

    .line 881
    .line 882
    .line 883
    const/4 v2, 0x0

    .line 884
    const/4 v3, 0x0

    .line 885
    const/4 v4, 0x0

    .line 886
    const/4 v5, 0x0

    .line 887
    const/4 v7, 0x0

    .line 888
    const/4 v8, 0x0

    .line 889
    const/4 v10, 0x0

    .line 890
    const/4 v12, 0x0

    .line 891
    const/4 v13, 0x0

    .line 892
    const/4 v14, 0x0

    .line 893
    const/16 v16, 0x0

    .line 894
    .line 895
    const/16 v17, 0x0

    .line 896
    .line 897
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    return-object v0

    .line 902
    :pswitch_1a
    move-object/from16 v0, p1

    .line 903
    .line 904
    check-cast v0, Ljava/lang/Throwable;

    .line 905
    .line 906
    move-object/from16 v1, p2

    .line 907
    .line 908
    check-cast v1, Ljava/lang/String;

    .line 909
    .line 910
    invoke-static {v1, v0}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 911
    .line 912
    .line 913
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 914
    .line 915
    return-object v0

    .line 916
    :pswitch_1b
    move-object/from16 v0, p1

    .line 917
    .line 918
    check-cast v0, La/oyg0;

    .line 919
    .line 920
    move-object/from16 v1, p2

    .line 921
    .line 922
    check-cast v1, La/xb70;

    .line 923
    .line 924
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 925
    .line 926
    .line 927
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    iget-object v2, v1, La/xb70;->o:La/f970;

    .line 931
    .line 932
    const/4 v10, 0x0

    .line 933
    const/16 v11, 0x5f

    .line 934
    .line 935
    const/4 v3, 0x0

    .line 936
    const/4 v4, 0x0

    .line 937
    const/4 v5, 0x0

    .line 938
    const-wide/16 v6, 0x0

    .line 939
    .line 940
    const/4 v8, 0x0

    .line 941
    const/4 v9, 0x0

    .line 942
    invoke-static/range {v2 .. v11}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 943
    .line 944
    .line 945
    move-result-object v16

    .line 946
    const/16 v18, 0x0

    .line 947
    .line 948
    const v19, 0x1bfff

    .line 949
    .line 950
    .line 951
    const/4 v2, 0x0

    .line 952
    const/4 v3, 0x0

    .line 953
    const/4 v4, 0x0

    .line 954
    const/4 v6, 0x0

    .line 955
    const/4 v7, 0x0

    .line 956
    const/4 v10, 0x0

    .line 957
    const/4 v11, 0x0

    .line 958
    const/4 v12, 0x0

    .line 959
    const/4 v13, 0x0

    .line 960
    const/4 v14, 0x0

    .line 961
    const/4 v15, 0x0

    .line 962
    const/16 v17, 0x0

    .line 963
    .line 964
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    return-object v0

    .line 969
    :pswitch_1c
    move-object/from16 v0, p1

    .line 970
    .line 971
    check-cast v0, La/oyg0;

    .line 972
    .line 973
    move-object/from16 v1, p2

    .line 974
    .line 975
    check-cast v1, La/xb70;

    .line 976
    .line 977
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 978
    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    iget-object v2, v1, La/xb70;->o:La/f970;

    .line 984
    .line 985
    const/4 v10, 0x0

    .line 986
    const/16 v11, 0x5f

    .line 987
    .line 988
    const/4 v3, 0x0

    .line 989
    const/4 v4, 0x0

    .line 990
    const/4 v5, 0x0

    .line 991
    const-wide/16 v6, 0x0

    .line 992
    .line 993
    const/4 v8, 0x0

    .line 994
    const/4 v9, 0x1

    .line 995
    invoke-static/range {v2 .. v11}, La/f970;->a(La/f970;ZZZDZZZI)La/f970;

    .line 996
    .line 997
    .line 998
    move-result-object v16

    .line 999
    const/16 v18, 0x0

    .line 1000
    .line 1001
    const v19, 0x1bfff

    .line 1002
    .line 1003
    .line 1004
    const/4 v2, 0x0

    .line 1005
    const/4 v3, 0x0

    .line 1006
    const/4 v4, 0x0

    .line 1007
    const/4 v6, 0x0

    .line 1008
    const/4 v7, 0x0

    .line 1009
    const/4 v9, 0x0

    .line 1010
    const/4 v10, 0x0

    .line 1011
    const/4 v11, 0x0

    .line 1012
    const/4 v12, 0x0

    .line 1013
    const/4 v13, 0x0

    .line 1014
    const/4 v14, 0x0

    .line 1015
    const/4 v15, 0x0

    .line 1016
    const/16 v17, 0x0

    .line 1017
    .line 1018
    invoke-static/range {v1 .. v19}, La/xb70;->a(La/xb70;La/uaq0;Ljava/lang/String;La/c5v0;ZZZZZLa/x870;ZZIZLa/fa70;La/f970;La/c970;La/z870;I)La/xb70;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v0

    .line 1022
    return-object v0

    .line 1023
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
