.class public final La/x4a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function2;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function2;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x4a0;->a:B

    iput-object p1, p0, La/x4a0;->b:Lkotlin/jvm/functions/Function2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 10

    .line 1
    iget-byte v0, p0, La/x4a0;->a:B

    .line 2
    .line 3
    const/16 v6, 0xb

    .line 4
    .line 5
    const/16 v7, 0xc

    .line 6
    .line 7
    const/16 v8, 0xa

    .line 8
    .line 9
    const-string v3, "Collection contains no element matching the predicate."

    .line 10
    .line 11
    const-string v4, "LOGO"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    iget-object p0, p0, La/x4a0;->b:Lkotlin/jvm/functions/Function2;

    .line 15
    .line 16
    const/4 v9, 0x0

    .line 17
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    packed-switch v0, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-static {p2, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 30
    .line 31
    .line 32
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_2

    .line 41
    .line 42
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    check-cast v3, La/pj30;

    .line 47
    .line 48
    invoke-interface {v3}, La/pj30;->n()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    instance-of v4, v4, La/w0v0;

    .line 53
    .line 54
    if-eqz v4, :cond_0

    .line 55
    .line 56
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-static {p3, p4}, La/p4e;->h(J)I

    .line 61
    .line 62
    .line 63
    move-result v6

    .line 64
    invoke-static {v5, v4, v5, v6}, La/p4e;->a(IIII)J

    .line 65
    .line 66
    .line 67
    move-result-wide v6

    .line 68
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 69
    .line 70
    .line 71
    move-result-object v3

    .line 72
    goto :goto_2

    .line 73
    :cond_0
    invoke-static {p3, p4}, La/p4e;->i(J)I

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-ltz v4, :cond_1

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const-string v6, "width must be >= 0"

    .line 81
    .line 82
    invoke-static {v6}, La/zcx;->a(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    :goto_1
    const v6, 0x7fffffff

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v4, v5, v6}, La/r4e;->h(IIII)J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    invoke-interface {v3, v6, v7}, La/pj30;->S(J)La/pu90;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    :goto_2
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    if-eqz p0, :cond_3

    .line 101
    .line 102
    const/4 p2, 0x1

    .line 103
    invoke-static {v0, p2}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    goto :goto_3

    .line 108
    :cond_3
    move-object p2, v0

    .line 109
    :goto_3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-nez v2, :cond_4

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    check-cast v2, La/pu90;

    .line 125
    .line 126
    iget v2, v2, La/pu90;->a:I

    .line 127
    .line 128
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    :goto_4
    move-object v9, v2

    .line 133
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    if-eqz v2, :cond_6

    .line 138
    .line 139
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    check-cast v2, La/pu90;

    .line 144
    .line 145
    iget v2, v2, La/pu90;->a:I

    .line 146
    .line 147
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    invoke-virtual {v9, v2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 152
    .line 153
    .line 154
    move-result v3

    .line 155
    if-gez v3, :cond_5

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    :goto_5
    if-eqz v9, :cond_7

    .line 159
    .line 160
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 161
    .line 162
    .line 163
    move-result v1

    .line 164
    goto :goto_6

    .line 165
    :cond_7
    move v1, v5

    .line 166
    :goto_6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object p2

    .line 170
    :goto_7
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v2

    .line 174
    if-eqz v2, :cond_8

    .line 175
    .line 176
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, La/pu90;

    .line 181
    .line 182
    iget v2, v2, La/pu90;->b:I

    .line 183
    .line 184
    add-int/2addr v5, v2

    .line 185
    goto :goto_7

    .line 186
    :cond_8
    new-instance p2, La/g18;

    .line 187
    .line 188
    const/16 v2, 0x11

    .line 189
    .line 190
    invoke-direct {p2, v0, p0, v1, v2}, La/g18;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 191
    .line 192
    .line 193
    invoke-static {p1, v1, v5, p2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    return-object p0

    .line 198
    :pswitch_0
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 199
    .line 200
    .line 201
    move-result v0

    .line 202
    if-eqz v0, :cond_9

    .line 203
    .line 204
    new-instance p0, La/er90;

    .line 205
    .line 206
    const/16 p2, 0xe

    .line 207
    .line 208
    invoke-direct {p0, p2}, La/er90;-><init>(B)V

    .line 209
    .line 210
    .line 211
    invoke-static {p1, v5, v5, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 212
    .line 213
    .line 214
    move-result-object v9

    .line 215
    goto/16 :goto_c

    .line 216
    .line 217
    :cond_9
    if-nez p0, :cond_c

    .line 218
    .line 219
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    :goto_8
    if-ge v5, p0, :cond_b

    .line 224
    .line 225
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    check-cast v0, La/pj30;

    .line 230
    .line 231
    invoke-static {v0}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 232
    .line 233
    .line 234
    move-result-object v6

    .line 235
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v6

    .line 239
    if-eqz v6, :cond_a

    .line 240
    .line 241
    invoke-interface {v0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 242
    .line 243
    .line 244
    move-result-object p0

    .line 245
    iget p2, p0, La/pu90;->a:I

    .line 246
    .line 247
    iget v0, p0, La/pu90;->b:I

    .line 248
    .line 249
    new-instance v1, La/cam;

    .line 250
    .line 251
    const/16 v2, 0x18

    .line 252
    .line 253
    invoke-direct {v1, p0, v2}, La/cam;-><init>(La/pu90;B)V

    .line 254
    .line 255
    .line 256
    invoke-static {p1, p2, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    goto/16 :goto_c

    .line 261
    .line 262
    :cond_a
    add-int/lit8 v5, v5, 0x1

    .line 263
    .line 264
    goto :goto_8

    .line 265
    :cond_b
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 266
    .line 267
    .line 268
    invoke-static {}, La/csj;->b()V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_c

    .line 272
    .line 273
    :cond_c
    new-instance v3, Ljava/util/ArrayList;

    .line 274
    .line 275
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 276
    .line 277
    .line 278
    move-result p0

    .line 279
    invoke-direct {v3, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 280
    .line 281
    .line 282
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 283
    .line 284
    .line 285
    move-result p0

    .line 286
    move v4, v5

    .line 287
    :goto_9
    if-ge v4, p0, :cond_d

    .line 288
    .line 289
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v0

    .line 293
    check-cast v0, La/pj30;

    .line 294
    .line 295
    const/4 v5, 0x1

    .line 296
    move-wide v1, p3

    .line 297
    invoke-static/range {v0 .. v5}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 298
    .line 299
    .line 300
    move-result v4

    .line 301
    goto :goto_9

    .line 302
    :cond_d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 307
    .line 308
    .line 309
    move-result p2

    .line 310
    if-eqz p2, :cond_13

    .line 311
    .line 312
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 313
    .line 314
    .line 315
    move-result-object p2

    .line 316
    check-cast p2, La/pu90;

    .line 317
    .line 318
    iget p2, p2, La/pu90;->a:I

    .line 319
    .line 320
    :cond_e
    :goto_a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-eqz v0, :cond_f

    .line 325
    .line 326
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    check-cast v0, La/pu90;

    .line 331
    .line 332
    iget v0, v0, La/pu90;->a:I

    .line 333
    .line 334
    if-ge p2, v0, :cond_e

    .line 335
    .line 336
    move p2, v0

    .line 337
    goto :goto_a

    .line 338
    :cond_f
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 339
    .line 340
    .line 341
    move-result-object p0

    .line 342
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 343
    .line 344
    .line 345
    move-result v0

    .line 346
    if-eqz v0, :cond_12

    .line 347
    .line 348
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v0

    .line 352
    check-cast v0, La/pu90;

    .line 353
    .line 354
    iget v0, v0, La/pu90;->b:I

    .line 355
    .line 356
    :cond_10
    :goto_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v1

    .line 360
    if-eqz v1, :cond_11

    .line 361
    .line 362
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    check-cast v1, La/pu90;

    .line 367
    .line 368
    iget v1, v1, La/pu90;->b:I

    .line 369
    .line 370
    if-ge v0, v1, :cond_10

    .line 371
    .line 372
    move v0, v1

    .line 373
    goto :goto_b

    .line 374
    :cond_11
    new-instance p0, La/uy2;

    .line 375
    .line 376
    invoke-direct {p0, v3, v7}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 377
    .line 378
    .line 379
    invoke-static {p1, p2, v0, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 380
    .line 381
    .line 382
    move-result-object v9

    .line 383
    goto :goto_c

    .line 384
    :cond_12
    invoke-static {}, La/itt0;->a()V

    .line 385
    .line 386
    .line 387
    goto :goto_c

    .line 388
    :cond_13
    invoke-static {}, La/itt0;->a()V

    .line 389
    .line 390
    .line 391
    :goto_c
    return-object v9

    .line 392
    :pswitch_1
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 393
    .line 394
    .line 395
    move-result v0

    .line 396
    if-eqz v0, :cond_14

    .line 397
    .line 398
    new-instance p0, La/er90;

    .line 399
    .line 400
    const/16 p2, 0xd

    .line 401
    .line 402
    invoke-direct {p0, p2}, La/er90;-><init>(B)V

    .line 403
    .line 404
    .line 405
    invoke-static {p1, v5, v5, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 406
    .line 407
    .line 408
    move-result-object v9

    .line 409
    goto/16 :goto_11

    .line 410
    .line 411
    :cond_14
    if-nez p0, :cond_17

    .line 412
    .line 413
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 414
    .line 415
    .line 416
    move-result p0

    .line 417
    :goto_d
    if-ge v5, p0, :cond_16

    .line 418
    .line 419
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    check-cast v0, La/pj30;

    .line 424
    .line 425
    invoke-static {v0}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-result-object v6

    .line 429
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    if-eqz v6, :cond_15

    .line 434
    .line 435
    invoke-interface {v0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    iget p2, p0, La/pu90;->a:I

    .line 440
    .line 441
    iget v0, p0, La/pu90;->b:I

    .line 442
    .line 443
    new-instance v1, La/cam;

    .line 444
    .line 445
    const/16 v2, 0x17

    .line 446
    .line 447
    invoke-direct {v1, p0, v2}, La/cam;-><init>(La/pu90;B)V

    .line 448
    .line 449
    .line 450
    invoke-static {p1, p2, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 451
    .line 452
    .line 453
    move-result-object v9

    .line 454
    goto/16 :goto_11

    .line 455
    .line 456
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 457
    .line 458
    goto :goto_d

    .line 459
    :cond_16
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 460
    .line 461
    .line 462
    invoke-static {}, La/csj;->b()V

    .line 463
    .line 464
    .line 465
    goto/16 :goto_11

    .line 466
    .line 467
    :cond_17
    new-instance v3, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 470
    .line 471
    .line 472
    move-result p0

    .line 473
    invoke-direct {v3, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 474
    .line 475
    .line 476
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 477
    .line 478
    .line 479
    move-result p0

    .line 480
    move v4, v5

    .line 481
    :goto_e
    if-ge v4, p0, :cond_18

    .line 482
    .line 483
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v0

    .line 487
    check-cast v0, La/pj30;

    .line 488
    .line 489
    const/4 v5, 0x1

    .line 490
    move-wide v1, p3

    .line 491
    invoke-static/range {v0 .. v5}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 492
    .line 493
    .line 494
    move-result v4

    .line 495
    goto :goto_e

    .line 496
    :cond_18
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 497
    .line 498
    .line 499
    move-result-object p0

    .line 500
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 501
    .line 502
    .line 503
    move-result p2

    .line 504
    if-eqz p2, :cond_1e

    .line 505
    .line 506
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object p2

    .line 510
    check-cast p2, La/pu90;

    .line 511
    .line 512
    iget p2, p2, La/pu90;->a:I

    .line 513
    .line 514
    :cond_19
    :goto_f
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 515
    .line 516
    .line 517
    move-result v0

    .line 518
    if-eqz v0, :cond_1a

    .line 519
    .line 520
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    check-cast v0, La/pu90;

    .line 525
    .line 526
    iget v0, v0, La/pu90;->a:I

    .line 527
    .line 528
    if-ge p2, v0, :cond_19

    .line 529
    .line 530
    move p2, v0

    .line 531
    goto :goto_f

    .line 532
    :cond_1a
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 533
    .line 534
    .line 535
    move-result-object p0

    .line 536
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 537
    .line 538
    .line 539
    move-result v0

    .line 540
    if-eqz v0, :cond_1d

    .line 541
    .line 542
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    check-cast v0, La/pu90;

    .line 547
    .line 548
    iget v0, v0, La/pu90;->b:I

    .line 549
    .line 550
    :cond_1b
    :goto_10
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 551
    .line 552
    .line 553
    move-result v1

    .line 554
    if-eqz v1, :cond_1c

    .line 555
    .line 556
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 557
    .line 558
    .line 559
    move-result-object v1

    .line 560
    check-cast v1, La/pu90;

    .line 561
    .line 562
    iget v1, v1, La/pu90;->b:I

    .line 563
    .line 564
    if-ge v0, v1, :cond_1b

    .line 565
    .line 566
    move v0, v1

    .line 567
    goto :goto_10

    .line 568
    :cond_1c
    new-instance p0, La/uy2;

    .line 569
    .line 570
    invoke-direct {p0, v3, v6}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 571
    .line 572
    .line 573
    invoke-static {p1, p2, v0, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 574
    .line 575
    .line 576
    move-result-object v9

    .line 577
    goto :goto_11

    .line 578
    :cond_1d
    invoke-static {}, La/itt0;->a()V

    .line 579
    .line 580
    .line 581
    goto :goto_11

    .line 582
    :cond_1e
    invoke-static {}, La/itt0;->a()V

    .line 583
    .line 584
    .line 585
    :goto_11
    return-object v9

    .line 586
    :pswitch_2
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 587
    .line 588
    .line 589
    move-result v0

    .line 590
    if-eqz v0, :cond_1f

    .line 591
    .line 592
    new-instance p0, La/er90;

    .line 593
    .line 594
    invoke-direct {p0, v7}, La/er90;-><init>(B)V

    .line 595
    .line 596
    .line 597
    invoke-static {p1, v5, v5, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 598
    .line 599
    .line 600
    move-result-object v9

    .line 601
    goto/16 :goto_16

    .line 602
    .line 603
    :cond_1f
    if-nez p0, :cond_22

    .line 604
    .line 605
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 606
    .line 607
    .line 608
    move-result p0

    .line 609
    :goto_12
    if-ge v5, p0, :cond_21

    .line 610
    .line 611
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v0

    .line 615
    check-cast v0, La/pj30;

    .line 616
    .line 617
    invoke-static {v0}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v6

    .line 621
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 622
    .line 623
    .line 624
    move-result v6

    .line 625
    if-eqz v6, :cond_20

    .line 626
    .line 627
    invoke-interface {v0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 628
    .line 629
    .line 630
    move-result-object p0

    .line 631
    iget p2, p0, La/pu90;->a:I

    .line 632
    .line 633
    iget v0, p0, La/pu90;->b:I

    .line 634
    .line 635
    new-instance v1, La/cam;

    .line 636
    .line 637
    const/16 v2, 0x16

    .line 638
    .line 639
    invoke-direct {v1, p0, v2}, La/cam;-><init>(La/pu90;B)V

    .line 640
    .line 641
    .line 642
    invoke-static {p1, p2, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 643
    .line 644
    .line 645
    move-result-object v9

    .line 646
    goto/16 :goto_16

    .line 647
    .line 648
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 649
    .line 650
    goto :goto_12

    .line 651
    :cond_21
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 652
    .line 653
    .line 654
    invoke-static {}, La/csj;->b()V

    .line 655
    .line 656
    .line 657
    goto/16 :goto_16

    .line 658
    .line 659
    :cond_22
    new-instance v3, Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 662
    .line 663
    .line 664
    move-result p0

    .line 665
    invoke-direct {v3, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 669
    .line 670
    .line 671
    move-result p0

    .line 672
    move v4, v5

    .line 673
    :goto_13
    if-ge v4, p0, :cond_23

    .line 674
    .line 675
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 676
    .line 677
    .line 678
    move-result-object v0

    .line 679
    check-cast v0, La/pj30;

    .line 680
    .line 681
    const/4 v5, 0x1

    .line 682
    move-wide v1, p3

    .line 683
    invoke-static/range {v0 .. v5}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 684
    .line 685
    .line 686
    move-result v4

    .line 687
    goto :goto_13

    .line 688
    :cond_23
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 689
    .line 690
    .line 691
    move-result-object p0

    .line 692
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 693
    .line 694
    .line 695
    move-result p2

    .line 696
    if-eqz p2, :cond_29

    .line 697
    .line 698
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 699
    .line 700
    .line 701
    move-result-object p2

    .line 702
    check-cast p2, La/pu90;

    .line 703
    .line 704
    iget p2, p2, La/pu90;->a:I

    .line 705
    .line 706
    :cond_24
    :goto_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 707
    .line 708
    .line 709
    move-result v0

    .line 710
    if-eqz v0, :cond_25

    .line 711
    .line 712
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v0

    .line 716
    check-cast v0, La/pu90;

    .line 717
    .line 718
    iget v0, v0, La/pu90;->a:I

    .line 719
    .line 720
    if-ge p2, v0, :cond_24

    .line 721
    .line 722
    move p2, v0

    .line 723
    goto :goto_14

    .line 724
    :cond_25
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 729
    .line 730
    .line 731
    move-result v0

    .line 732
    if-eqz v0, :cond_28

    .line 733
    .line 734
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    check-cast v0, La/pu90;

    .line 739
    .line 740
    iget v0, v0, La/pu90;->b:I

    .line 741
    .line 742
    :cond_26
    :goto_15
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 743
    .line 744
    .line 745
    move-result v1

    .line 746
    if-eqz v1, :cond_27

    .line 747
    .line 748
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    check-cast v1, La/pu90;

    .line 753
    .line 754
    iget v1, v1, La/pu90;->b:I

    .line 755
    .line 756
    if-ge v0, v1, :cond_26

    .line 757
    .line 758
    move v0, v1

    .line 759
    goto :goto_15

    .line 760
    :cond_27
    new-instance p0, La/uy2;

    .line 761
    .line 762
    invoke-direct {p0, v3, v8}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 763
    .line 764
    .line 765
    invoke-static {p1, p2, v0, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 766
    .line 767
    .line 768
    move-result-object v9

    .line 769
    goto :goto_16

    .line 770
    :cond_28
    invoke-static {}, La/itt0;->a()V

    .line 771
    .line 772
    .line 773
    goto :goto_16

    .line 774
    :cond_29
    invoke-static {}, La/itt0;->a()V

    .line 775
    .line 776
    .line 777
    :goto_16
    return-object v9

    .line 778
    :pswitch_3
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 779
    .line 780
    .line 781
    move-result v0

    .line 782
    if-eqz v0, :cond_2a

    .line 783
    .line 784
    new-instance p0, La/er90;

    .line 785
    .line 786
    invoke-direct {p0, v6}, La/er90;-><init>(B)V

    .line 787
    .line 788
    .line 789
    invoke-static {p1, v5, v5, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    goto/16 :goto_1b

    .line 794
    .line 795
    :cond_2a
    if-nez p0, :cond_2d

    .line 796
    .line 797
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 798
    .line 799
    .line 800
    move-result p0

    .line 801
    :goto_17
    if-ge v5, p0, :cond_2c

    .line 802
    .line 803
    invoke-interface {p2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 804
    .line 805
    .line 806
    move-result-object v0

    .line 807
    check-cast v0, La/pj30;

    .line 808
    .line 809
    invoke-static {v0}, La/mrv;->i0(La/pj30;)Ljava/lang/Object;

    .line 810
    .line 811
    .line 812
    move-result-object v6

    .line 813
    invoke-static {v6, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 814
    .line 815
    .line 816
    move-result v6

    .line 817
    if-eqz v6, :cond_2b

    .line 818
    .line 819
    invoke-interface {v0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 820
    .line 821
    .line 822
    move-result-object p0

    .line 823
    iget p2, p0, La/pu90;->a:I

    .line 824
    .line 825
    iget v0, p0, La/pu90;->b:I

    .line 826
    .line 827
    new-instance v1, La/cam;

    .line 828
    .line 829
    const/16 v2, 0x15

    .line 830
    .line 831
    invoke-direct {v1, p0, v2}, La/cam;-><init>(La/pu90;B)V

    .line 832
    .line 833
    .line 834
    invoke-static {p1, p2, v0, v1}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 835
    .line 836
    .line 837
    move-result-object v9

    .line 838
    goto/16 :goto_1b

    .line 839
    .line 840
    :cond_2b
    add-int/lit8 v5, v5, 0x1

    .line 841
    .line 842
    goto :goto_17

    .line 843
    :cond_2c
    invoke-static {v3}, La/qf00;->b(Ljava/lang/String;)Ljava/lang/Void;

    .line 844
    .line 845
    .line 846
    invoke-static {}, La/csj;->b()V

    .line 847
    .line 848
    .line 849
    goto/16 :goto_1b

    .line 850
    .line 851
    :cond_2d
    new-instance v3, Ljava/util/ArrayList;

    .line 852
    .line 853
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 854
    .line 855
    .line 856
    move-result p0

    .line 857
    invoke-direct {v3, p0}, Ljava/util/ArrayList;-><init>(I)V

    .line 858
    .line 859
    .line 860
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 861
    .line 862
    .line 863
    move-result p0

    .line 864
    move v4, v5

    .line 865
    :goto_18
    if-ge v4, p0, :cond_2e

    .line 866
    .line 867
    invoke-interface {p2, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v0

    .line 871
    check-cast v0, La/pj30;

    .line 872
    .line 873
    const/4 v5, 0x1

    .line 874
    move-wide v1, p3

    .line 875
    invoke-static/range {v0 .. v5}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 876
    .line 877
    .line 878
    move-result v4

    .line 879
    goto :goto_18

    .line 880
    :cond_2e
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 881
    .line 882
    .line 883
    move-result-object p0

    .line 884
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 885
    .line 886
    .line 887
    move-result p2

    .line 888
    if-eqz p2, :cond_34

    .line 889
    .line 890
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 891
    .line 892
    .line 893
    move-result-object p2

    .line 894
    check-cast p2, La/pu90;

    .line 895
    .line 896
    iget p2, p2, La/pu90;->a:I

    .line 897
    .line 898
    :cond_2f
    :goto_19
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 899
    .line 900
    .line 901
    move-result v0

    .line 902
    if-eqz v0, :cond_30

    .line 903
    .line 904
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v0

    .line 908
    check-cast v0, La/pu90;

    .line 909
    .line 910
    iget v0, v0, La/pu90;->a:I

    .line 911
    .line 912
    if-ge p2, v0, :cond_2f

    .line 913
    .line 914
    move p2, v0

    .line 915
    goto :goto_19

    .line 916
    :cond_30
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 917
    .line 918
    .line 919
    move-result-object p0

    .line 920
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    if-eqz v0, :cond_33

    .line 925
    .line 926
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    check-cast v0, La/pu90;

    .line 931
    .line 932
    iget v0, v0, La/pu90;->b:I

    .line 933
    .line 934
    :cond_31
    :goto_1a
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v1

    .line 938
    if-eqz v1, :cond_32

    .line 939
    .line 940
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    check-cast v1, La/pu90;

    .line 945
    .line 946
    iget v1, v1, La/pu90;->b:I

    .line 947
    .line 948
    if-ge v0, v1, :cond_31

    .line 949
    .line 950
    move v0, v1

    .line 951
    goto :goto_1a

    .line 952
    :cond_32
    new-instance p0, La/uy2;

    .line 953
    .line 954
    const/16 v1, 0x9

    .line 955
    .line 956
    invoke-direct {p0, v3, v1}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 957
    .line 958
    .line 959
    invoke-static {p1, p2, v0, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 960
    .line 961
    .line 962
    move-result-object v9

    .line 963
    goto :goto_1b

    .line 964
    :cond_33
    invoke-static {}, La/itt0;->a()V

    .line 965
    .line 966
    .line 967
    goto :goto_1b

    .line 968
    :cond_34
    invoke-static {}, La/itt0;->a()V

    .line 969
    .line 970
    .line 971
    :goto_1b
    return-object v9

    .line 972
    nop

    .line 973
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
