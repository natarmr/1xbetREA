.class public final synthetic La/fun;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/fun;->a:B

    iput-object p1, p0, La/fun;->b:Ljava/lang/Object;

    iput-object p2, p0, La/fun;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/fun;->a:B

    iput-object p1, p0, La/fun;->b:Ljava/lang/Object;

    iput-object p2, p0, La/fun;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fun;->a:B

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/fun;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/fun;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, Ljava/lang/Throwable;

    .line 18
    .line 19
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, Ljava/lang/Throwable;

    .line 24
    .line 25
    move-object/from16 v2, p2

    .line 26
    .line 27
    check-cast v2, Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v2, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 30
    .line 31
    .line 32
    instance-of v0, v0, La/n7p;

    .line 33
    .line 34
    if-eqz v0, :cond_0

    .line 35
    .line 36
    const v0, 0x7f130872

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const v0, 0x7f130873

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-interface {v6, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_0
    check-cast v0, La/mm40;

    .line 54
    .line 55
    check-cast v6, La/dhm;

    .line 56
    .line 57
    move-object/from16 v1, p1

    .line 58
    .line 59
    check-cast v1, La/fet;

    .line 60
    .line 61
    move-object/from16 v2, p2

    .line 62
    .line 63
    check-cast v2, Ljava/lang/Integer;

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {v5}, La/x8x;->L(I)I

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    invoke-static {v0, v6, v1, v2}, La/gkb;->v(La/mm40;La/dhm;La/fet;I)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_1
    check-cast v0, La/hc80;

    .line 79
    .line 80
    check-cast v6, La/mlr;

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, La/oyg0;

    .line 85
    .line 86
    move-object/from16 v7, p2

    .line 87
    .line 88
    check-cast v7, La/dd80;

    .line 89
    .line 90
    check-cast v0, La/ec80;

    .line 91
    .line 92
    iget-object v1, v0, La/ec80;->d:Ljava/util/List;

    .line 93
    .line 94
    new-instance v2, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v3

    .line 107
    if-eqz v3, :cond_2

    .line 108
    .line 109
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    move-object v5, v3

    .line 114
    check-cast v5, La/mlr;

    .line 115
    .line 116
    iget-wide v8, v6, La/mlr;->a:J

    .line 117
    .line 118
    iget-wide v10, v5, La/mlr;->a:J

    .line 119
    .line 120
    cmp-long v5, v8, v10

    .line 121
    .line 122
    if-eqz v5, :cond_1

    .line 123
    .line 124
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_2
    const/16 v1, 0x17

    .line 129
    .line 130
    invoke-static {v0, v2, v4, v1}, La/ec80;->a(La/ec80;Ljava/util/ArrayList;Ljava/util/List;I)La/ec80;

    .line 131
    .line 132
    .line 133
    move-result-object v14

    .line 134
    const/16 v16, 0x0

    .line 135
    .line 136
    const/16 v17, 0x1f7f

    .line 137
    .line 138
    const/4 v8, 0x0

    .line 139
    const/4 v9, 0x0

    .line 140
    const/4 v10, 0x0

    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x0

    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v15, 0x0

    .line 145
    invoke-static/range {v7 .. v17}, La/dd80;->a(La/dd80;ZZZZZZLa/hc80;La/ed80;ZI)La/dd80;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    return-object v0

    .line 150
    :pswitch_2
    check-cast v0, La/e7p;

    .line 151
    .line 152
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 153
    .line 154
    move-object/from16 v1, p1

    .line 155
    .line 156
    check-cast v1, La/fet;

    .line 157
    .line 158
    move-object/from16 v2, p2

    .line 159
    .line 160
    check-cast v2, Ljava/lang/Integer;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-static {v5}, La/x8x;->L(I)I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    invoke-static {v0, v6, v1, v2}, La/rcb;->H(La/e7p;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_3
    check-cast v0, La/u0p;

    .line 176
    .line 177
    check-cast v6, Ljava/lang/String;

    .line 178
    .line 179
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, La/fet;

    .line 182
    .line 183
    move-object/from16 v3, p2

    .line 184
    .line 185
    check-cast v3, Ljava/lang/Integer;

    .line 186
    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {v2}, La/x8x;->L(I)I

    .line 191
    .line 192
    .line 193
    move-result v2

    .line 194
    invoke-static {v0, v6, v1, v2}, La/hic;->q(La/u0p;Ljava/lang/String;La/fet;I)V

    .line 195
    .line 196
    .line 197
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object v0

    .line 200
    :pswitch_4
    check-cast v0, La/yyo;

    .line 201
    .line 202
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 203
    .line 204
    move-object/from16 v1, p1

    .line 205
    .line 206
    check-cast v1, La/fet;

    .line 207
    .line 208
    move-object/from16 v2, p2

    .line 209
    .line 210
    check-cast v2, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    const/4 v2, 0x7

    .line 216
    invoke-static {v2}, La/x8x;->L(I)I

    .line 217
    .line 218
    .line 219
    move-result v2

    .line 220
    invoke-static {v0, v6, v1, v2}, La/dj8;->v(La/yyo;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 224
    .line 225
    return-object v0

    .line 226
    :pswitch_5
    check-cast v0, La/qqo;

    .line 227
    .line 228
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 229
    .line 230
    move-object/from16 v1, p1

    .line 231
    .line 232
    check-cast v1, La/fet;

    .line 233
    .line 234
    move-object/from16 v2, p2

    .line 235
    .line 236
    check-cast v2, Ljava/lang/Integer;

    .line 237
    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    invoke-static {v5}, La/x8x;->L(I)I

    .line 242
    .line 243
    .line 244
    move-result v2

    .line 245
    invoke-static {v0, v6, v1, v2}, La/jd8;->B(La/qqo;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 246
    .line 247
    .line 248
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 249
    .line 250
    return-object v0

    .line 251
    :pswitch_6
    check-cast v0, La/mm40;

    .line 252
    .line 253
    check-cast v6, La/j3w;

    .line 254
    .line 255
    move-object/from16 v1, p1

    .line 256
    .line 257
    check-cast v1, La/fet;

    .line 258
    .line 259
    move-object/from16 v2, p2

    .line 260
    .line 261
    check-cast v2, Ljava/lang/Integer;

    .line 262
    .line 263
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    invoke-static {v5}, La/x8x;->L(I)I

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    invoke-static {v0, v6, v1, v2}, La/hkb;->p(La/mm40;La/j3w;La/fet;I)V

    .line 271
    .line 272
    .line 273
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object v0

    .line 276
    :pswitch_7
    check-cast v0, La/mm40;

    .line 277
    .line 278
    check-cast v6, La/qwe;

    .line 279
    .line 280
    move-object/from16 v1, p1

    .line 281
    .line 282
    check-cast v1, La/fet;

    .line 283
    .line 284
    move-object/from16 v2, p2

    .line 285
    .line 286
    check-cast v2, Ljava/lang/Integer;

    .line 287
    .line 288
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    invoke-static {v5}, La/x8x;->L(I)I

    .line 292
    .line 293
    .line 294
    move-result v2

    .line 295
    invoke-static {v0, v6, v1, v2}, La/zjb;->n(La/mm40;La/qwe;La/fet;I)V

    .line 296
    .line 297
    .line 298
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_8
    check-cast v0, La/mm40;

    .line 302
    .line 303
    check-cast v6, La/i3w;

    .line 304
    .line 305
    move-object/from16 v1, p1

    .line 306
    .line 307
    check-cast v1, La/fet;

    .line 308
    .line 309
    move-object/from16 v2, p2

    .line 310
    .line 311
    check-cast v2, Ljava/lang/Integer;

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    invoke-static {v5}, La/x8x;->L(I)I

    .line 317
    .line 318
    .line 319
    move-result v2

    .line 320
    invoke-static {v0, v6, v1, v2}, La/vfc;->u(La/mm40;La/i3w;La/fet;I)V

    .line 321
    .line 322
    .line 323
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_9
    check-cast v0, La/mm40;

    .line 327
    .line 328
    check-cast v6, La/dho;

    .line 329
    .line 330
    move-object/from16 v1, p1

    .line 331
    .line 332
    check-cast v1, La/fet;

    .line 333
    .line 334
    move-object/from16 v2, p2

    .line 335
    .line 336
    check-cast v2, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {v5}, La/x8x;->L(I)I

    .line 342
    .line 343
    .line 344
    move-result v2

    .line 345
    invoke-static {v0, v6, v1, v2}, La/vbc;->B(La/mm40;La/dho;La/fet;I)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_a
    check-cast v0, La/mm40;

    .line 352
    .line 353
    check-cast v6, Landroid/graphics/Bitmap;

    .line 354
    .line 355
    move-object/from16 v1, p1

    .line 356
    .line 357
    check-cast v1, La/fet;

    .line 358
    .line 359
    move-object/from16 v2, p2

    .line 360
    .line 361
    check-cast v2, Ljava/lang/Integer;

    .line 362
    .line 363
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 364
    .line 365
    .line 366
    invoke-static {v5}, La/x8x;->L(I)I

    .line 367
    .line 368
    .line 369
    move-result v2

    .line 370
    invoke-static {v0, v6, v1, v2}, La/qbc;->p(La/mm40;Landroid/graphics/Bitmap;La/fet;I)V

    .line 371
    .line 372
    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object v0

    .line 376
    :pswitch_b
    check-cast v0, La/mm40;

    .line 377
    .line 378
    check-cast v6, La/meo;

    .line 379
    .line 380
    move-object/from16 v1, p1

    .line 381
    .line 382
    check-cast v1, La/fet;

    .line 383
    .line 384
    move-object/from16 v2, p2

    .line 385
    .line 386
    check-cast v2, Ljava/lang/Integer;

    .line 387
    .line 388
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 389
    .line 390
    .line 391
    invoke-static {v5}, La/x8x;->L(I)I

    .line 392
    .line 393
    .line 394
    move-result v2

    .line 395
    invoke-static {v0, v6, v1, v2}, La/fbc;->A(La/mm40;La/meo;La/fet;I)V

    .line 396
    .line 397
    .line 398
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_c
    check-cast v0, La/mm40;

    .line 402
    .line 403
    check-cast v6, La/wdo;

    .line 404
    .line 405
    move-object/from16 v1, p1

    .line 406
    .line 407
    check-cast v1, La/fet;

    .line 408
    .line 409
    move-object/from16 v2, p2

    .line 410
    .line 411
    check-cast v2, Ljava/lang/Integer;

    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-static {v5}, La/x8x;->L(I)I

    .line 417
    .line 418
    .line 419
    move-result v2

    .line 420
    invoke-static {v0, v6, v1, v2}, La/n4c;->q(La/mm40;La/wdo;La/fet;I)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_d
    check-cast v0, La/mm40;

    .line 427
    .line 428
    check-cast v6, La/mao;

    .line 429
    .line 430
    move-object/from16 v1, p1

    .line 431
    .line 432
    check-cast v1, La/fet;

    .line 433
    .line 434
    move-object/from16 v2, p2

    .line 435
    .line 436
    check-cast v2, Ljava/lang/Integer;

    .line 437
    .line 438
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-static {v5}, La/x8x;->L(I)I

    .line 442
    .line 443
    .line 444
    move-result v2

    .line 445
    invoke-static {v0, v6, v1, v2}, La/sj3;->s(La/mm40;La/mao;La/fet;I)V

    .line 446
    .line 447
    .line 448
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object v0

    .line 451
    :pswitch_e
    check-cast v0, La/mm40;

    .line 452
    .line 453
    check-cast v6, La/bao;

    .line 454
    .line 455
    move-object/from16 v1, p1

    .line 456
    .line 457
    check-cast v1, La/fet;

    .line 458
    .line 459
    move-object/from16 v2, p2

    .line 460
    .line 461
    check-cast v2, Ljava/lang/Integer;

    .line 462
    .line 463
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    invoke-static {v5}, La/x8x;->L(I)I

    .line 467
    .line 468
    .line 469
    move-result v2

    .line 470
    invoke-static {v0, v6, v1, v2}, La/xkb;->s(La/mm40;La/bao;La/fet;I)V

    .line 471
    .line 472
    .line 473
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 474
    .line 475
    return-object v0

    .line 476
    :pswitch_f
    check-cast v0, La/wnk;

    .line 477
    .line 478
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 479
    .line 480
    move-object/from16 v1, p1

    .line 481
    .line 482
    check-cast v1, La/fet;

    .line 483
    .line 484
    move-object/from16 v2, p2

    .line 485
    .line 486
    check-cast v2, Ljava/lang/Integer;

    .line 487
    .line 488
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-static {v5}, La/x8x;->L(I)I

    .line 492
    .line 493
    .line 494
    move-result v2

    .line 495
    invoke-static {v0, v6, v1, v2}, La/ckb;->o(La/wnk;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 499
    .line 500
    return-object v0

    .line 501
    :pswitch_10
    check-cast v0, La/owr0;

    .line 502
    .line 503
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 504
    .line 505
    move-object/from16 v1, p1

    .line 506
    .line 507
    check-cast v1, La/fet;

    .line 508
    .line 509
    move-object/from16 v2, p2

    .line 510
    .line 511
    check-cast v2, Ljava/lang/Integer;

    .line 512
    .line 513
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-static {v5}, La/x8x;->L(I)I

    .line 517
    .line 518
    .line 519
    move-result v2

    .line 520
    invoke-static {v0, v6, v1, v2}, La/zjb;->m(La/owr0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 521
    .line 522
    .line 523
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 524
    .line 525
    return-object v0

    .line 526
    :pswitch_11
    check-cast v0, La/xdu0;

    .line 527
    .line 528
    iget-object v1, v0, La/xdu0;->k:La/udu0;

    .line 529
    .line 530
    check-cast v6, La/clz;

    .line 531
    .line 532
    move-object/from16 v2, p1

    .line 533
    .line 534
    check-cast v2, La/t8o0;

    .line 535
    .line 536
    move-object/from16 v3, p2

    .line 537
    .line 538
    check-cast v3, La/wdu0;

    .line 539
    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    iget-object v2, v2, La/t8o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;

    .line 544
    .line 545
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    instance-of v5, v3, La/ldu0;

    .line 549
    .line 550
    if-eqz v5, :cond_3

    .line 551
    .line 552
    iget-object v0, v0, La/xdu0;->g:Ljava/lang/String;

    .line 553
    .line 554
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerFormula(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    goto/16 :goto_2

    .line 558
    .line 559
    :cond_3
    instance-of v5, v3, La/qdu0;

    .line 560
    .line 561
    if-eqz v5, :cond_4

    .line 562
    .line 563
    iget-object v0, v0, La/xdu0;->h:Ljava/lang/String;

    .line 564
    .line 565
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerFormula(Ljava/lang/String;)V

    .line 566
    .line 567
    .line 568
    goto/16 :goto_2

    .line 569
    .line 570
    :cond_4
    instance-of v5, v3, La/kdu0;

    .line 571
    .line 572
    if-eqz v5, :cond_5

    .line 573
    .line 574
    iget-object v0, v0, La/xdu0;->a:Ljava/lang/String;

    .line 575
    .line 576
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerFirstNumber(Ljava/lang/String;)V

    .line 577
    .line 578
    .line 579
    goto :goto_2

    .line 580
    :cond_5
    instance-of v5, v3, La/mdu0;

    .line 581
    .line 582
    if-eqz v5, :cond_6

    .line 583
    .line 584
    iget-object v0, v0, La/xdu0;->b:Ljava/lang/String;

    .line 585
    .line 586
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerSecondNumber(Ljava/lang/String;)V

    .line 587
    .line 588
    .line 589
    goto :goto_2

    .line 590
    :cond_6
    instance-of v5, v3, La/ndu0;

    .line 591
    .line 592
    if-eqz v5, :cond_7

    .line 593
    .line 594
    iget-object v0, v0, La/xdu0;->c:Ljava/lang/String;

    .line 595
    .line 596
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerThirdNumber(Ljava/lang/String;)V

    .line 597
    .line 598
    .line 599
    goto :goto_2

    .line 600
    :cond_7
    instance-of v5, v3, La/pdu0;

    .line 601
    .line 602
    if-eqz v5, :cond_8

    .line 603
    .line 604
    iget-object v0, v0, La/xdu0;->d:Ljava/lang/String;

    .line 605
    .line 606
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerFirstNumber(Ljava/lang/String;)V

    .line 607
    .line 608
    .line 609
    goto :goto_2

    .line 610
    :cond_8
    instance-of v5, v3, La/rdu0;

    .line 611
    .line 612
    if-eqz v5, :cond_9

    .line 613
    .line 614
    iget-object v0, v0, La/xdu0;->e:Ljava/lang/String;

    .line 615
    .line 616
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerSecondNumber(Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    goto :goto_2

    .line 620
    :cond_9
    instance-of v5, v3, La/sdu0;

    .line 621
    .line 622
    if-eqz v5, :cond_a

    .line 623
    .line 624
    iget-object v0, v0, La/xdu0;->f:Ljava/lang/String;

    .line 625
    .line 626
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerThirdNumber(Ljava/lang/String;)V

    .line 627
    .line 628
    .line 629
    goto :goto_2

    .line 630
    :cond_a
    instance-of v5, v3, La/odu0;

    .line 631
    .line 632
    if-eqz v5, :cond_b

    .line 633
    .line 634
    iget-object v0, v0, La/xdu0;->i:Ljava/lang/String;

    .line 635
    .line 636
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setFirstPlayerTotalScore(Ljava/lang/String;)V

    .line 637
    .line 638
    .line 639
    goto :goto_2

    .line 640
    :cond_b
    instance-of v5, v3, La/tdu0;

    .line 641
    .line 642
    if-eqz v5, :cond_c

    .line 643
    .line 644
    iget-object v0, v0, La/xdu0;->j:Ljava/lang/String;

    .line 645
    .line 646
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setSecondPlayerTotalScore(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    goto :goto_2

    .line 650
    :cond_c
    instance-of v5, v3, La/udu0;

    .line 651
    .line 652
    if-eqz v5, :cond_d

    .line 653
    .line 654
    iget-wide v3, v1, La/udu0;->a:J

    .line 655
    .line 656
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 657
    .line 658
    .line 659
    move-result-object v0

    .line 660
    iget-object v1, v1, La/udu0;->b:Ljava/lang/Long;

    .line 661
    .line 662
    invoke-virtual {v2, v3, v4, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->u(JLa/tkz;Ljava/lang/Long;)V

    .line 663
    .line 664
    .line 665
    goto :goto_2

    .line 666
    :cond_d
    instance-of v1, v3, La/vdu0;

    .line 667
    .line 668
    if-eqz v1, :cond_e

    .line 669
    .line 670
    iget-object v0, v0, La/xdu0;->l:Ljava/lang/String;

    .line 671
    .line 672
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;->setWinnerText(Ljava/lang/String;)V

    .line 673
    .line 674
    .line 675
    :goto_2
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 676
    .line 677
    goto :goto_3

    .line 678
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 679
    .line 680
    .line 681
    :goto_3
    return-object v4

    .line 682
    :pswitch_12
    check-cast v0, La/iyh0;

    .line 683
    .line 684
    iget-object v1, v0, La/iyh0;->f:La/gyh0;

    .line 685
    .line 686
    check-cast v6, La/clz;

    .line 687
    .line 688
    move-object/from16 v2, p1

    .line 689
    .line 690
    check-cast v2, La/v7o0;

    .line 691
    .line 692
    move-object/from16 v3, p2

    .line 693
    .line 694
    check-cast v3, La/hyh0;

    .line 695
    .line 696
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    iget-object v2, v2, La/v7o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;

    .line 700
    .line 701
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 702
    .line 703
    .line 704
    instance-of v5, v3, La/byh0;

    .line 705
    .line 706
    if-eqz v5, :cond_f

    .line 707
    .line 708
    iget-object v0, v0, La/iyh0;->a:Ljava/util/ArrayList;

    .line 709
    .line 710
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setFirstPlayerCards(Ljava/util/List;)V

    .line 711
    .line 712
    .line 713
    goto :goto_4

    .line 714
    :cond_f
    instance-of v5, v3, La/eyh0;

    .line 715
    .line 716
    if-eqz v5, :cond_10

    .line 717
    .line 718
    iget-object v0, v0, La/iyh0;->b:Ljava/util/ArrayList;

    .line 719
    .line 720
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setSecondPlayerCards(Ljava/util/List;)V

    .line 721
    .line 722
    .line 723
    goto :goto_4

    .line 724
    :cond_10
    instance-of v5, v3, La/dyh0;

    .line 725
    .line 726
    if-eqz v5, :cond_11

    .line 727
    .line 728
    iget-object v0, v0, La/iyh0;->c:La/vxh0;

    .line 729
    .line 730
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setMatchStatus(La/vxh0;)V

    .line 731
    .line 732
    .line 733
    goto :goto_4

    .line 734
    :cond_11
    instance-of v5, v3, La/cyh0;

    .line 735
    .line 736
    if-eqz v5, :cond_12

    .line 737
    .line 738
    iget-object v0, v0, La/iyh0;->d:La/pxh0;

    .line 739
    .line 740
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setFirstPlayerCardsSum(La/pxh0;)V

    .line 741
    .line 742
    .line 743
    goto :goto_4

    .line 744
    :cond_12
    instance-of v5, v3, La/fyh0;

    .line 745
    .line 746
    if-eqz v5, :cond_13

    .line 747
    .line 748
    iget-object v0, v0, La/iyh0;->e:La/pxh0;

    .line 749
    .line 750
    invoke-virtual {v2, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->setSecondPlayerCardsSum(La/pxh0;)V

    .line 751
    .line 752
    .line 753
    goto :goto_4

    .line 754
    :cond_13
    instance-of v0, v3, La/gyh0;

    .line 755
    .line 756
    if-eqz v0, :cond_14

    .line 757
    .line 758
    iget-wide v3, v1, La/gyh0;->a:J

    .line 759
    .line 760
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    iget-object v1, v1, La/gyh0;->b:Ljava/lang/Long;

    .line 765
    .line 766
    invoke-virtual {v2, v3, v4, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;->u(JLa/tkz;Ljava/lang/Long;)V

    .line 767
    .line 768
    .line 769
    :goto_4
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 770
    .line 771
    goto :goto_5

    .line 772
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 773
    .line 774
    .line 775
    :goto_5
    return-object v4

    .line 776
    :pswitch_13
    check-cast v0, La/clz;

    .line 777
    .line 778
    check-cast v6, La/npg0;

    .line 779
    .line 780
    move-object/from16 v1, p1

    .line 781
    .line 782
    check-cast v1, La/t7o0;

    .line 783
    .line 784
    move-object/from16 v2, p2

    .line 785
    .line 786
    check-cast v2, La/mpg0;

    .line 787
    .line 788
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 789
    .line 790
    .line 791
    iget-object v3, v1, La/t7o0;->e:La/vd7;

    .line 792
    .line 793
    iget-object v4, v1, La/t7o0;->b:La/vd7;

    .line 794
    .line 795
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 796
    .line 797
    .line 798
    instance-of v5, v2, La/kpg0;

    .line 799
    .line 800
    if-eqz v5, :cond_15

    .line 801
    .line 802
    invoke-static {v0}, La/g1x;->u(La/clz;)La/tkz;

    .line 803
    .line 804
    .line 805
    move-result-object v10

    .line 806
    iget-object v7, v1, La/t7o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 807
    .line 808
    iget-object v0, v6, La/npg0;->a:La/kpg0;

    .line 809
    .line 810
    iget-wide v8, v0, La/kpg0;->a:J

    .line 811
    .line 812
    iget-object v11, v0, La/kpg0;->b:Ljava/lang/Long;

    .line 813
    .line 814
    const/4 v12, 0x4

    .line 815
    invoke-static/range {v7 .. v12}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 816
    .line 817
    .line 818
    goto :goto_6

    .line 819
    :cond_15
    instance-of v0, v2, La/fpg0;

    .line 820
    .line 821
    if-eqz v0, :cond_16

    .line 822
    .line 823
    invoke-static {v1, v6}, La/vfc;->C(La/t7o0;La/npg0;)V

    .line 824
    .line 825
    .line 826
    iget-object v0, v4, La/vd7;->d:Landroid/view/View;

    .line 827
    .line 828
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;

    .line 829
    .line 830
    iget-object v1, v6, La/npg0;->b:Ljava/util/ArrayList;

    .line 831
    .line 832
    iget-object v2, v6, La/npg0;->f:Ljava/util/List;

    .line 833
    .line 834
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;->d(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 835
    .line 836
    .line 837
    iget-object v0, v3, La/vd7;->d:Landroid/view/View;

    .line 838
    .line 839
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;

    .line 840
    .line 841
    iget-object v1, v6, La/npg0;->c:Ljava/util/ArrayList;

    .line 842
    .line 843
    invoke-virtual {v0, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoBiletNumbersView;->d(Ljava/util/ArrayList;Ljava/util/List;)V

    .line 844
    .line 845
    .line 846
    goto :goto_6

    .line 847
    :cond_16
    instance-of v0, v2, La/gpg0;

    .line 848
    .line 849
    if-eqz v0, :cond_17

    .line 850
    .line 851
    iget-object v0, v4, La/vd7;->c:Landroid/view/View;

    .line 852
    .line 853
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;

    .line 854
    .line 855
    iget-object v1, v6, La/npg0;->d:La/uog0;

    .line 856
    .line 857
    iget-object v2, v1, La/uog0;->a:Ljava/lang/String;

    .line 858
    .line 859
    iget v3, v1, La/uog0;->b:I

    .line 860
    .line 861
    iget v1, v1, La/uog0;->c:I

    .line 862
    .line 863
    invoke-virtual {v0, v3, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a(IILjava/lang/String;)V

    .line 864
    .line 865
    .line 866
    goto :goto_6

    .line 867
    :cond_17
    instance-of v0, v2, La/ipg0;

    .line 868
    .line 869
    if-eqz v0, :cond_18

    .line 870
    .line 871
    iget-object v0, v3, La/vd7;->c:Landroid/view/View;

    .line 872
    .line 873
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;

    .line 874
    .line 875
    iget-object v1, v6, La/npg0;->e:La/uog0;

    .line 876
    .line 877
    iget-object v2, v1, La/uog0;->a:Ljava/lang/String;

    .line 878
    .line 879
    iget v3, v1, La/uog0;->b:I

    .line 880
    .line 881
    iget v1, v1, La/uog0;->c:I

    .line 882
    .line 883
    invoke-virtual {v0, v3, v1, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/russianlotto/view/RussianLottoCounterfoilView;->a(IILjava/lang/String;)V

    .line 884
    .line 885
    .line 886
    goto :goto_6

    .line 887
    :cond_18
    instance-of v0, v2, La/lpg0;

    .line 888
    .line 889
    if-eqz v0, :cond_19

    .line 890
    .line 891
    invoke-static {v1, v6}, La/vfc;->E(La/t7o0;La/npg0;)V

    .line 892
    .line 893
    .line 894
    :cond_19
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 895
    .line 896
    return-object v0

    .line 897
    :pswitch_14
    check-cast v0, La/vqb0;

    .line 898
    .line 899
    check-cast v6, La/clz;

    .line 900
    .line 901
    move-object/from16 v1, p1

    .line 902
    .line 903
    check-cast v1, La/o6o0;

    .line 904
    .line 905
    move-object/from16 v2, p2

    .line 906
    .line 907
    check-cast v2, La/uqb0;

    .line 908
    .line 909
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    iget-object v1, v1, La/o6o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;

    .line 913
    .line 914
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 915
    .line 916
    .line 917
    instance-of v3, v2, La/qqb0;

    .line 918
    .line 919
    if-eqz v3, :cond_1a

    .line 920
    .line 921
    iget-object v0, v0, La/vqb0;->c:Ljava/lang/String;

    .line 922
    .line 923
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setDescription(Ljava/lang/String;)V

    .line 924
    .line 925
    .line 926
    goto :goto_7

    .line 927
    :cond_1a
    instance-of v3, v2, La/tqb0;

    .line 928
    .line 929
    if-eqz v3, :cond_1b

    .line 930
    .line 931
    iget-boolean v0, v0, La/vqb0;->b:Z

    .line 932
    .line 933
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setTimerVisibility(Z)V

    .line 934
    .line 935
    .line 936
    goto :goto_7

    .line 937
    :cond_1b
    instance-of v3, v2, La/sqb0;

    .line 938
    .line 939
    if-eqz v3, :cond_1c

    .line 940
    .line 941
    iget-wide v2, v0, La/vqb0;->a:J

    .line 942
    .line 943
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 944
    .line 945
    .line 946
    move-result-object v0

    .line 947
    invoke-virtual {v1, v2, v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->a(JLa/tkz;)V

    .line 948
    .line 949
    .line 950
    goto :goto_7

    .line 951
    :cond_1c
    instance-of v0, v2, La/rqb0;

    .line 952
    .line 953
    if-eqz v0, :cond_1d

    .line 954
    .line 955
    const v0, 0x7f080974

    .line 956
    .line 957
    .line 958
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/powerofpower/timer/PowerOfPowerTimerView;->setIcon(I)V

    .line 959
    .line 960
    .line 961
    :goto_7
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 962
    .line 963
    goto :goto_8

    .line 964
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 965
    .line 966
    .line 967
    :goto_8
    return-object v4

    .line 968
    :pswitch_15
    check-cast v0, La/clz;

    .line 969
    .line 970
    check-cast v6, La/poy;

    .line 971
    .line 972
    move-object/from16 v1, p1

    .line 973
    .line 974
    check-cast v1, La/f6o0;

    .line 975
    .line 976
    move-object/from16 v3, p2

    .line 977
    .line 978
    check-cast v3, La/ooy;

    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    iget-object v5, v1, La/f6o0;->f:Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;

    .line 984
    .line 985
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    instance-of v7, v3, La/noy;

    .line 989
    .line 990
    if-eqz v7, :cond_1e

    .line 991
    .line 992
    invoke-static {v0}, La/g1x;->u(La/clz;)La/tkz;

    .line 993
    .line 994
    .line 995
    move-result-object v0

    .line 996
    invoke-static {v1, v0, v6}, La/ibc;->X(La/f6o0;La/tkz;La/poy;)V

    .line 997
    .line 998
    .line 999
    goto :goto_9

    .line 1000
    :cond_1e
    instance-of v0, v3, La/ioy;

    .line 1001
    .line 1002
    if-eqz v0, :cond_1f

    .line 1003
    .line 1004
    invoke-static {v1, v6}, La/ibc;->U(La/f6o0;La/poy;)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_9

    .line 1008
    :cond_1f
    instance-of v0, v3, La/loy;

    .line 1009
    .line 1010
    if-eqz v0, :cond_20

    .line 1011
    .line 1012
    iget-object v0, v6, La/poy;->f:La/loy;

    .line 1013
    .line 1014
    iget v1, v0, La/loy;->a:I

    .line 1015
    .line 1016
    iget v0, v0, La/loy;->b:I

    .line 1017
    .line 1018
    invoke-virtual {v5, v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->j(II)V

    .line 1019
    .line 1020
    .line 1021
    goto :goto_9

    .line 1022
    :cond_20
    instance-of v0, v3, La/moy;

    .line 1023
    .line 1024
    if-eqz v0, :cond_21

    .line 1025
    .line 1026
    iget-object v0, v6, La/poy;->g:La/moy;

    .line 1027
    .line 1028
    iget v1, v0, La/moy;->a:I

    .line 1029
    .line 1030
    iget v0, v0, La/moy;->b:I

    .line 1031
    .line 1032
    invoke-virtual {v5, v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->k(II)V

    .line 1033
    .line 1034
    .line 1035
    goto :goto_9

    .line 1036
    :cond_21
    instance-of v0, v3, La/joy;

    .line 1037
    .line 1038
    if-eqz v0, :cond_22

    .line 1039
    .line 1040
    iget-object v0, v6, La/poy;->e:Ljava/util/ArrayList;

    .line 1041
    .line 1042
    new-instance v3, La/qzn;

    .line 1043
    .line 1044
    invoke-direct {v3, v1, v6, v2}, La/qzn;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1045
    .line 1046
    .line 1047
    new-instance v2, La/yhn;

    .line 1048
    .line 1049
    const/16 v4, 0xf

    .line 1050
    .line 1051
    invoke-direct {v2, v1, v4}, La/yhn;-><init>(Ljava/lang/Object;B)V

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v5, v0, v3, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/killerjoker/KillerJokerView;->i(Ljava/util/ArrayList;La/qzn;La/yhn;)V

    .line 1055
    .line 1056
    .line 1057
    goto :goto_9

    .line 1058
    :cond_22
    instance-of v0, v3, La/koy;

    .line 1059
    .line 1060
    if-eqz v0, :cond_23

    .line 1061
    .line 1062
    invoke-static {v1, v6}, La/ibc;->W(La/f6o0;La/poy;)V

    .line 1063
    .line 1064
    .line 1065
    :goto_9
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1066
    .line 1067
    goto :goto_a

    .line 1068
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1069
    .line 1070
    .line 1071
    :goto_a
    return-object v4

    .line 1072
    :pswitch_16
    check-cast v0, La/xkk;

    .line 1073
    .line 1074
    check-cast v6, La/clz;

    .line 1075
    .line 1076
    move-object/from16 v1, p1

    .line 1077
    .line 1078
    check-cast v1, La/j1o0;

    .line 1079
    .line 1080
    move-object/from16 v2, p2

    .line 1081
    .line 1082
    check-cast v2, La/wkk;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    iget-object v1, v1, La/j1o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;

    .line 1088
    .line 1089
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1090
    .line 1091
    .line 1092
    instance-of v5, v2, La/rkk;

    .line 1093
    .line 1094
    if-eqz v5, :cond_24

    .line 1095
    .line 1096
    iget-object v0, v0, La/xkk;->a:La/jkk;

    .line 1097
    .line 1098
    invoke-virtual {v1, v0, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->v(La/jkk;Z)V

    .line 1099
    .line 1100
    .line 1101
    goto :goto_b

    .line 1102
    :cond_24
    instance-of v5, v2, La/tkk;

    .line 1103
    .line 1104
    if-eqz v5, :cond_25

    .line 1105
    .line 1106
    iget-object v0, v0, La/xkk;->b:La/jkk;

    .line 1107
    .line 1108
    invoke-virtual {v1, v0, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->A(La/jkk;Z)V

    .line 1109
    .line 1110
    .line 1111
    goto :goto_b

    .line 1112
    :cond_25
    instance-of v5, v2, La/ukk;

    .line 1113
    .line 1114
    if-eqz v5, :cond_26

    .line 1115
    .line 1116
    iget-object v0, v0, La/xkk;->d:La/okk;

    .line 1117
    .line 1118
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1119
    .line 1120
    .line 1121
    move-result-object v2

    .line 1122
    invoke-virtual {v1, v0, v2, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->B(La/okk;La/tkz;Z)V

    .line 1123
    .line 1124
    .line 1125
    goto :goto_b

    .line 1126
    :cond_26
    instance-of v5, v2, La/skk;

    .line 1127
    .line 1128
    if-eqz v5, :cond_27

    .line 1129
    .line 1130
    iget-object v0, v0, La/xkk;->c:La/gkk;

    .line 1131
    .line 1132
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v2

    .line 1136
    invoke-virtual {v1, v0, v3, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->w(La/gkk;ZLa/tkz;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_b

    .line 1140
    :cond_27
    instance-of v2, v2, La/vkk;

    .line 1141
    .line 1142
    if-eqz v2, :cond_28

    .line 1143
    .line 1144
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v10

    .line 1148
    iget-object v0, v0, La/xkk;->e:La/vkk;

    .line 1149
    .line 1150
    iget-object v1, v1, Lorg/xplatform/cyber/game/universal/impl/presentation/dicepoker/DicePokerView;->q:La/zkk;

    .line 1151
    .line 1152
    iget-object v1, v1, La/zkk;->g:Ljava/lang/Object;

    .line 1153
    .line 1154
    move-object v7, v1

    .line 1155
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 1156
    .line 1157
    iget-wide v8, v0, La/vkk;->a:J

    .line 1158
    .line 1159
    iget-object v11, v0, La/vkk;->b:Ljava/lang/Long;

    .line 1160
    .line 1161
    const/4 v12, 0x4

    .line 1162
    invoke-static/range {v7 .. v12}, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;->b(Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;JLa/tkz;Ljava/lang/Long;I)V

    .line 1163
    .line 1164
    .line 1165
    :goto_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1166
    .line 1167
    goto :goto_c

    .line 1168
    :cond_28
    invoke-static {}, La/t9f;->b()V

    .line 1169
    .line 1170
    .line 1171
    :goto_c
    return-object v4

    .line 1172
    :pswitch_17
    check-cast v0, La/h9j;

    .line 1173
    .line 1174
    iget-object v1, v0, La/h9j;->k:La/f9j;

    .line 1175
    .line 1176
    check-cast v6, La/clz;

    .line 1177
    .line 1178
    move-object/from16 v2, p1

    .line 1179
    .line 1180
    check-cast v2, La/h1o0;

    .line 1181
    .line 1182
    move-object/from16 v3, p2

    .line 1183
    .line 1184
    check-cast v3, La/g9j;

    .line 1185
    .line 1186
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    iget-object v5, v2, La/h1o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;

    .line 1190
    .line 1191
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1192
    .line 1193
    .line 1194
    instance-of v7, v3, La/a9j;

    .line 1195
    .line 1196
    if-eqz v7, :cond_29

    .line 1197
    .line 1198
    invoke-virtual {v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->v()V

    .line 1199
    .line 1200
    .line 1201
    invoke-virtual {v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->x()V

    .line 1202
    .line 1203
    .line 1204
    invoke-virtual {v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->u()V

    .line 1205
    .line 1206
    .line 1207
    invoke-virtual {v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->w()V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v5}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->y()V

    .line 1211
    .line 1212
    .line 1213
    goto/16 :goto_d

    .line 1214
    .line 1215
    :cond_29
    instance-of v7, v3, La/v8j;

    .line 1216
    .line 1217
    if-eqz v7, :cond_2a

    .line 1218
    .line 1219
    iget-object v0, v0, La/h9j;->d:Ljava/lang/String;

    .line 1220
    .line 1221
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerNumberOfThrow(Ljava/lang/String;)V

    .line 1222
    .line 1223
    .line 1224
    goto/16 :goto_d

    .line 1225
    .line 1226
    :cond_2a
    instance-of v7, v3, La/x8j;

    .line 1227
    .line 1228
    if-eqz v7, :cond_2b

    .line 1229
    .line 1230
    iget-object v0, v0, La/h9j;->f:Ljava/util/ArrayList;

    .line 1231
    .line 1232
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerThrows(Ljava/util/List;)V

    .line 1233
    .line 1234
    .line 1235
    goto/16 :goto_d

    .line 1236
    .line 1237
    :cond_2b
    instance-of v7, v3, La/y8j;

    .line 1238
    .line 1239
    if-eqz v7, :cond_2c

    .line 1240
    .line 1241
    iget-object v0, v0, La/h9j;->b:Ljava/lang/String;

    .line 1242
    .line 1243
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerTotal(Ljava/lang/String;)V

    .line 1244
    .line 1245
    .line 1246
    goto :goto_d

    .line 1247
    :cond_2c
    instance-of v7, v3, La/e9j;

    .line 1248
    .line 1249
    if-eqz v7, :cond_2d

    .line 1250
    .line 1251
    iget-object v0, v0, La/h9j;->c:Ljava/lang/String;

    .line 1252
    .line 1253
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerTotal(Ljava/lang/String;)V

    .line 1254
    .line 1255
    .line 1256
    goto :goto_d

    .line 1257
    :cond_2d
    instance-of v7, v3, La/b9j;

    .line 1258
    .line 1259
    if-eqz v7, :cond_2e

    .line 1260
    .line 1261
    iget-object v0, v0, La/h9j;->e:Ljava/lang/String;

    .line 1262
    .line 1263
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerNumberOfThrow(Ljava/lang/String;)V

    .line 1264
    .line 1265
    .line 1266
    goto :goto_d

    .line 1267
    :cond_2e
    instance-of v7, v3, La/d9j;

    .line 1268
    .line 1269
    if-eqz v7, :cond_2f

    .line 1270
    .line 1271
    iget-object v0, v0, La/h9j;->g:Ljava/util/ArrayList;

    .line 1272
    .line 1273
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerThrows(Ljava/util/List;)V

    .line 1274
    .line 1275
    .line 1276
    goto :goto_d

    .line 1277
    :cond_2f
    instance-of v7, v3, La/w8j;

    .line 1278
    .line 1279
    if-eqz v7, :cond_30

    .line 1280
    .line 1281
    iget-object v0, v0, La/h9j;->h:Ljava/lang/String;

    .line 1282
    .line 1283
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFirstPlayerSumOfThrows(Ljava/lang/String;)V

    .line 1284
    .line 1285
    .line 1286
    goto :goto_d

    .line 1287
    :cond_30
    instance-of v7, v3, La/c9j;

    .line 1288
    .line 1289
    if-eqz v7, :cond_31

    .line 1290
    .line 1291
    iget-object v0, v0, La/h9j;->i:Ljava/lang/String;

    .line 1292
    .line 1293
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setSecondPlayerSumOfThrows(Ljava/lang/String;)V

    .line 1294
    .line 1295
    .line 1296
    goto :goto_d

    .line 1297
    :cond_31
    instance-of v7, v3, La/z8j;

    .line 1298
    .line 1299
    if-eqz v7, :cond_32

    .line 1300
    .line 1301
    iget-object v1, v0, La/h9j;->j:La/f9a0;

    .line 1302
    .line 1303
    invoke-static {v2, v0, v1}, La/wzb;->L(La/h1o0;La/h9j;La/f9a0;)V

    .line 1304
    .line 1305
    .line 1306
    goto :goto_d

    .line 1307
    :cond_32
    instance-of v2, v3, La/f9j;

    .line 1308
    .line 1309
    if-eqz v2, :cond_33

    .line 1310
    .line 1311
    iget-wide v2, v1, La/f9j;->a:J

    .line 1312
    .line 1313
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v0

    .line 1317
    iget-object v1, v1, La/f9j;->b:Ljava/lang/Long;

    .line 1318
    .line 1319
    invoke-virtual {v5, v2, v3, v0, v1}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->A(JLa/tkz;Ljava/lang/Long;)V

    .line 1320
    .line 1321
    .line 1322
    goto :goto_d

    .line 1323
    :cond_33
    instance-of v1, v3, La/u8j;

    .line 1324
    .line 1325
    if-eqz v1, :cond_34

    .line 1326
    .line 1327
    iget-object v0, v0, La/h9j;->l:Ljava/lang/String;

    .line 1328
    .line 1329
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setWinner(Ljava/lang/String;)V

    .line 1330
    .line 1331
    .line 1332
    goto :goto_d

    .line 1333
    :cond_34
    instance-of v0, v3, La/t8j;

    .line 1334
    .line 1335
    if-eqz v0, :cond_35

    .line 1336
    .line 1337
    const-string v0, "static/img/ImgDefault/Esports/Virtual/Darts/dartboard.png"

    .line 1338
    .line 1339
    invoke-virtual {v5, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/dartslive/view/DartsLiveView;->setFieldImage(Ljava/lang/String;)V

    .line 1340
    .line 1341
    .line 1342
    :goto_d
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1343
    .line 1344
    goto :goto_e

    .line 1345
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 1346
    .line 1347
    .line 1348
    :goto_e
    return-object v4

    .line 1349
    :pswitch_18
    check-cast v0, La/zhf;

    .line 1350
    .line 1351
    check-cast v6, La/clz;

    .line 1352
    .line 1353
    move-object/from16 v1, p1

    .line 1354
    .line 1355
    check-cast v1, La/a1o0;

    .line 1356
    .line 1357
    move-object/from16 v2, p2

    .line 1358
    .line 1359
    check-cast v2, La/yhf;

    .line 1360
    .line 1361
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1362
    .line 1363
    .line 1364
    iget-object v3, v1, La/a1o0;->i:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;

    .line 1365
    .line 1366
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1367
    .line 1368
    .line 1369
    instance-of v5, v2, La/shf;

    .line 1370
    .line 1371
    if-eqz v5, :cond_36

    .line 1372
    .line 1373
    invoke-static {v1, v0}, La/uzb;->B0(La/a1o0;La/zhf;)V

    .line 1374
    .line 1375
    .line 1376
    goto :goto_f

    .line 1377
    :cond_36
    instance-of v5, v2, La/rhf;

    .line 1378
    .line 1379
    if-eqz v5, :cond_37

    .line 1380
    .line 1381
    invoke-static {v1, v0}, La/uzb;->A0(La/a1o0;La/zhf;)V

    .line 1382
    .line 1383
    .line 1384
    goto :goto_f

    .line 1385
    :cond_37
    instance-of v5, v2, La/qhf;

    .line 1386
    .line 1387
    if-eqz v5, :cond_38

    .line 1388
    .line 1389
    invoke-static {v1, v0}, La/uzb;->z0(La/a1o0;La/zhf;)V

    .line 1390
    .line 1391
    .line 1392
    goto :goto_f

    .line 1393
    :cond_38
    instance-of v5, v2, La/thf;

    .line 1394
    .line 1395
    if-eqz v5, :cond_39

    .line 1396
    .line 1397
    iget-object v1, v1, La/a1o0;->j:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;

    .line 1398
    .line 1399
    iget-object v0, v0, La/zhf;->e:La/thf;

    .line 1400
    .line 1401
    iget-object v2, v0, La/thf;->a:Ljava/util/ArrayList;

    .line 1402
    .line 1403
    iget-boolean v4, v0, La/thf;->d:Z

    .line 1404
    .line 1405
    invoke-virtual {v1, v2, v4}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a(Ljava/util/ArrayList;Z)V

    .line 1406
    .line 1407
    .line 1408
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setFirstPlayerRounds(La/thf;)V

    .line 1409
    .line 1410
    .line 1411
    goto :goto_f

    .line 1412
    :cond_39
    instance-of v5, v2, La/vhf;

    .line 1413
    .line 1414
    if-eqz v5, :cond_3a

    .line 1415
    .line 1416
    iget-object v1, v1, La/a1o0;->k:Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;

    .line 1417
    .line 1418
    iget-object v0, v0, La/zhf;->f:La/vhf;

    .line 1419
    .line 1420
    iget-object v2, v0, La/vhf;->a:Ljava/util/ArrayList;

    .line 1421
    .line 1422
    iget-boolean v4, v0, La/vhf;->d:Z

    .line 1423
    .line 1424
    invoke-virtual {v1, v2, v4}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/view/CrystalPlayerLogView;->a(Ljava/util/ArrayList;Z)V

    .line 1425
    .line 1426
    .line 1427
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setSecondPlayerRounds(La/vhf;)V

    .line 1428
    .line 1429
    .line 1430
    goto :goto_f

    .line 1431
    :cond_3a
    instance-of v5, v2, La/phf;

    .line 1432
    .line 1433
    if-eqz v5, :cond_3b

    .line 1434
    .line 1435
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    invoke-static {v1, v2, v0}, La/uzb;->y0(La/a1o0;La/tkz;La/zhf;)V

    .line 1440
    .line 1441
    .line 1442
    goto :goto_f

    .line 1443
    :cond_3b
    instance-of v1, v2, La/xhf;

    .line 1444
    .line 1445
    if-eqz v1, :cond_3c

    .line 1446
    .line 1447
    iget-object v0, v0, La/zhf;->j:La/igg0;

    .line 1448
    .line 1449
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setRoundState-EQFU1Hg(La/igg0;)V

    .line 1450
    .line 1451
    .line 1452
    goto :goto_f

    .line 1453
    :cond_3c
    instance-of v1, v2, La/uhf;

    .line 1454
    .line 1455
    if-eqz v1, :cond_3d

    .line 1456
    .line 1457
    iget-object v0, v0, La/zhf;->h:Ljava/lang/String;

    .line 1458
    .line 1459
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setFirstPlayerResult-Z7eCPMA(Ljava/lang/String;)V

    .line 1460
    .line 1461
    .line 1462
    goto :goto_f

    .line 1463
    :cond_3d
    instance-of v1, v2, La/whf;

    .line 1464
    .line 1465
    if-eqz v1, :cond_3e

    .line 1466
    .line 1467
    iget-object v0, v0, La/zhf;->i:Ljava/lang/String;

    .line 1468
    .line 1469
    invoke-virtual {v3, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/crystal/CrystalFieldInfoView;->setSecondPlayerResult-r0dkc8Y(Ljava/lang/String;)V

    .line 1470
    .line 1471
    .line 1472
    :goto_f
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1473
    .line 1474
    goto :goto_10

    .line 1475
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 1476
    .line 1477
    .line 1478
    :goto_10
    return-object v4

    .line 1479
    :pswitch_19
    check-cast v0, La/eia;

    .line 1480
    .line 1481
    check-cast v6, La/clz;

    .line 1482
    .line 1483
    move-object/from16 v1, p1

    .line 1484
    .line 1485
    check-cast v1, La/y0o0;

    .line 1486
    .line 1487
    move-object/from16 v2, p2

    .line 1488
    .line 1489
    check-cast v2, La/dia;

    .line 1490
    .line 1491
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1492
    .line 1493
    .line 1494
    iget-object v1, v1, La/y0o0;->b:Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;

    .line 1495
    .line 1496
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1497
    .line 1498
    .line 1499
    instance-of v5, v2, La/yha;

    .line 1500
    .line 1501
    if-eqz v5, :cond_3f

    .line 1502
    .line 1503
    iget-object v0, v0, La/eia;->a:La/gha;

    .line 1504
    .line 1505
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1506
    .line 1507
    .line 1508
    move-result-object v2

    .line 1509
    invoke-virtual {v1, v0, v2, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->v(La/gha;La/tkz;Z)V

    .line 1510
    .line 1511
    .line 1512
    goto :goto_11

    .line 1513
    :cond_3f
    instance-of v5, v2, La/cia;

    .line 1514
    .line 1515
    if-eqz v5, :cond_40

    .line 1516
    .line 1517
    iget-object v0, v0, La/eia;->b:La/cia;

    .line 1518
    .line 1519
    invoke-virtual {v1, v0, v3}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->z(La/cia;Z)V

    .line 1520
    .line 1521
    .line 1522
    goto :goto_11

    .line 1523
    :cond_40
    instance-of v3, v2, La/zha;

    .line 1524
    .line 1525
    if-eqz v3, :cond_41

    .line 1526
    .line 1527
    iget-object v0, v0, La/eia;->c:La/mha;

    .line 1528
    .line 1529
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->setFirstPeriod$impl(La/mha;)V

    .line 1530
    .line 1531
    .line 1532
    goto :goto_11

    .line 1533
    :cond_41
    instance-of v3, v2, La/aia;

    .line 1534
    .line 1535
    if-eqz v3, :cond_42

    .line 1536
    .line 1537
    iget-object v0, v0, La/eia;->d:La/mha;

    .line 1538
    .line 1539
    invoke-virtual {v1, v0}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->setSecondPeriod$impl(La/mha;)V

    .line 1540
    .line 1541
    .line 1542
    goto :goto_11

    .line 1543
    :cond_42
    instance-of v2, v2, La/bia;

    .line 1544
    .line 1545
    if-eqz v2, :cond_43

    .line 1546
    .line 1547
    iget-object v0, v0, La/eia;->e:La/sha;

    .line 1548
    .line 1549
    invoke-static {v6}, La/g1x;->u(La/clz;)La/tkz;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v2

    .line 1553
    invoke-virtual {v1, v0, v2}, Lorg/xplatform/cyber/game/universal/impl/presentation/cardfootball/views/CardFootballView;->y(La/sha;La/tkz;)V

    .line 1554
    .line 1555
    .line 1556
    :goto_11
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1557
    .line 1558
    goto :goto_12

    .line 1559
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 1560
    .line 1561
    .line 1562
    :goto_12
    return-object v4

    .line 1563
    :pswitch_1a
    check-cast v0, La/xa00;

    .line 1564
    .line 1565
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1566
    .line 1567
    move-object/from16 v1, p1

    .line 1568
    .line 1569
    check-cast v1, La/fet;

    .line 1570
    .line 1571
    move-object/from16 v2, p2

    .line 1572
    .line 1573
    check-cast v2, Ljava/lang/Integer;

    .line 1574
    .line 1575
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1576
    .line 1577
    .line 1578
    invoke-static {v5}, La/x8x;->L(I)I

    .line 1579
    .line 1580
    .line 1581
    move-result v2

    .line 1582
    invoke-static {v0, v6, v1, v2}, La/xf0;->n(La/xa00;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1583
    .line 1584
    .line 1585
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1586
    .line 1587
    return-object v0

    .line 1588
    :pswitch_1b
    check-cast v0, La/pr90;

    .line 1589
    .line 1590
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 1591
    .line 1592
    move-object/from16 v12, p1

    .line 1593
    .line 1594
    check-cast v12, La/fet;

    .line 1595
    .line 1596
    move-object/from16 v1, p2

    .line 1597
    .line 1598
    check-cast v1, Ljava/lang/Integer;

    .line 1599
    .line 1600
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 1601
    .line 1602
    .line 1603
    move-result v1

    .line 1604
    and-int/lit8 v2, v1, 0x3

    .line 1605
    .line 1606
    const/4 v4, 0x2

    .line 1607
    if-eq v2, v4, :cond_44

    .line 1608
    .line 1609
    move v3, v5

    .line 1610
    :cond_44
    and-int/2addr v1, v5

    .line 1611
    invoke-virtual {v12, v1, v3}, La/fet;->U(IZ)Z

    .line 1612
    .line 1613
    .line 1614
    move-result v1

    .line 1615
    if-eqz v1, :cond_47

    .line 1616
    .line 1617
    sget-object v1, La/qmk;->a:La/zcl;

    .line 1618
    .line 1619
    const/16 v17, 0x0

    .line 1620
    .line 1621
    const/16 v18, 0xe

    .line 1622
    .line 1623
    sget-object v13, La/jm40;->b:La/jm40;

    .line 1624
    .line 1625
    const/high16 v14, 0x41000000    # 8.0f

    .line 1626
    .line 1627
    const/4 v15, 0x0

    .line 1628
    const/16 v16, 0x0

    .line 1629
    .line 1630
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v1

    .line 1634
    const/high16 v2, 0x3f800000    # 1.0f

    .line 1635
    .line 1636
    invoke-static {v2, v1, v5}, La/dw9;->h(FLa/mm40;Z)La/mm40;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v7

    .line 1640
    iget-object v8, v0, La/pr90;->a:La/c6q0;

    .line 1641
    .line 1642
    invoke-virtual {v12, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1643
    .line 1644
    .line 1645
    move-result v0

    .line 1646
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v1

    .line 1650
    if-nez v0, :cond_45

    .line 1651
    .line 1652
    sget-object v0, La/ukd;->a:La/cl5;

    .line 1653
    .line 1654
    if-ne v1, v0, :cond_46

    .line 1655
    .line 1656
    :cond_45
    new-instance v1, La/btm;

    .line 1657
    .line 1658
    const/16 v0, 0xa

    .line 1659
    .line 1660
    invoke-direct {v1, v6, v0}, La/btm;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1664
    .line 1665
    .line 1666
    :cond_46
    move-object v11, v1

    .line 1667
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 1668
    .line 1669
    const/4 v13, 0x0

    .line 1670
    const/16 v14, 0xc

    .line 1671
    .line 1672
    const/4 v9, 0x0

    .line 1673
    const/4 v10, 0x0

    .line 1674
    invoke-static/range {v7 .. v14}, La/wvb;->t(La/mm40;La/c6q0;ILa/kly;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 1675
    .line 1676
    .line 1677
    goto :goto_13

    .line 1678
    :cond_47
    invoke-virtual {v12}, La/fet;->X()V

    .line 1679
    .line 1680
    .line 1681
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1682
    .line 1683
    return-object v0

    .line 1684
    :pswitch_1c
    check-cast v0, La/mm40;

    .line 1685
    .line 1686
    check-cast v6, La/rqp0;

    .line 1687
    .line 1688
    move-object/from16 v1, p1

    .line 1689
    .line 1690
    check-cast v1, La/fet;

    .line 1691
    .line 1692
    move-object/from16 v2, p2

    .line 1693
    .line 1694
    check-cast v2, Ljava/lang/Integer;

    .line 1695
    .line 1696
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1697
    .line 1698
    .line 1699
    invoke-static {v5}, La/x8x;->L(I)I

    .line 1700
    .line 1701
    .line 1702
    move-result v2

    .line 1703
    invoke-static {v0, v6, v1, v2}, La/jeb;->u(La/mm40;La/rqp0;La/fet;I)V

    .line 1704
    .line 1705
    .line 1706
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1707
    .line 1708
    return-object v0

    .line 1709
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
