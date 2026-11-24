.class public final synthetic La/eb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xcz;


# direct methods
.method public synthetic constructor <init>(La/xcz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eb;->a:B

    iput-object p1, p0, La/eb;->b:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/eb;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, La/eb;->b:La/xcz;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, La/xcz;->j:La/ywj;

    .line 12
    .line 13
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_2

    .line 20
    :cond_0
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 25
    .line 26
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    move-object v2, v0

    .line 41
    check-cast v2, La/ncz;

    .line 42
    .line 43
    iget v2, v2, La/ncz;->p:I

    .line 44
    .line 45
    if-ltz v2, :cond_1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    move-object v0, v1

    .line 49
    :goto_0
    check-cast v0, La/ncz;

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    iget-object p0, v0, La/ncz;->l:Ljava/lang/Object;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    move-object p0, v1

    .line 57
    :goto_1
    instance-of v0, p0, La/dja;

    .line 58
    .line 59
    if-eqz v0, :cond_4

    .line 60
    .line 61
    move-object v1, p0

    .line 62
    check-cast v1, La/dja;

    .line 63
    .line 64
    :cond_4
    :goto_2
    return-object v1

    .line 65
    :pswitch_0
    iget-object v0, p0, La/xcz;->j:La/ywj;

    .line 66
    .line 67
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-eqz v0, :cond_5

    .line 72
    .line 73
    goto :goto_3

    .line 74
    :cond_5
    invoke-static {p0}, La/dtb;->H(La/xcz;)La/dja;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    :goto_3
    return-object v1

    .line 79
    :pswitch_1
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    iget-object v0, v0, La/mcz;->l:Ljava/util/List;

    .line 84
    .line 85
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, La/ncz;

    .line 90
    .line 91
    if-nez v0, :cond_6

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_6
    iget v1, v0, La/ncz;->p:I

    .line 95
    .line 96
    iget v0, v0, La/ncz;->q:I

    .line 97
    .line 98
    add-int/2addr v1, v0

    .line 99
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    iget p0, p0, La/mcz;->n:I

    .line 104
    .line 105
    if-le v1, p0, :cond_7

    .line 106
    .line 107
    move v2, v3

    .line 108
    :cond_7
    :goto_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 109
    .line 110
    .line 111
    move-result-object p0

    .line 112
    return-object p0

    .line 113
    :pswitch_2
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    iget-object v0, v0, La/mcz;->l:Ljava/util/List;

    .line 118
    .line 119
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    check-cast v0, La/ncz;

    .line 124
    .line 125
    if-nez v0, :cond_8

    .line 126
    .line 127
    goto :goto_5

    .line 128
    :cond_8
    iget v0, v0, La/ncz;->p:I

    .line 129
    .line 130
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iget p0, p0, La/mcz;->m:I

    .line 135
    .line 136
    if-ge v0, p0, :cond_9

    .line 137
    .line 138
    move v2, v3

    .line 139
    :cond_9
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    return-object p0

    .line 144
    :pswitch_3
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v0, v0, La/mcz;->l:Ljava/util/List;

    .line 149
    .line 150
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/ncz;

    .line 155
    .line 156
    if-nez v0, :cond_a

    .line 157
    .line 158
    goto :goto_6

    .line 159
    :cond_a
    iget v1, v0, La/ncz;->p:I

    .line 160
    .line 161
    iget v0, v0, La/ncz;->q:I

    .line 162
    .line 163
    add-int/2addr v1, v0

    .line 164
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    iget p0, p0, La/mcz;->n:I

    .line 169
    .line 170
    if-le v1, p0, :cond_b

    .line 171
    .line 172
    move v2, v3

    .line 173
    :cond_b
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    return-object p0

    .line 178
    :pswitch_4
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 179
    .line 180
    .line 181
    move-result-object v0

    .line 182
    iget-object v0, v0, La/mcz;->l:Ljava/util/List;

    .line 183
    .line 184
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    check-cast v0, La/ncz;

    .line 189
    .line 190
    if-nez v0, :cond_c

    .line 191
    .line 192
    goto :goto_7

    .line 193
    :cond_c
    iget v0, v0, La/ncz;->p:I

    .line 194
    .line 195
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 196
    .line 197
    .line 198
    move-result-object p0

    .line 199
    iget p0, p0, La/mcz;->m:I

    .line 200
    .line 201
    if-ge v0, p0, :cond_d

    .line 202
    .line 203
    move v2, v3

    .line 204
    :cond_d
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_5
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_6
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    iget-object v0, p0, La/mcz;->l:Ljava/util/List;

    .line 219
    .line 220
    iget v2, p0, La/mcz;->n:I

    .line 221
    .line 222
    iget p0, p0, La/mcz;->m:I

    .line 223
    .line 224
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 229
    .line 230
    .line 231
    move-result v3

    .line 232
    if-nez v3, :cond_e

    .line 233
    .line 234
    move-object v3, v1

    .line 235
    goto :goto_8

    .line 236
    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 241
    .line 242
    .line 243
    move-result v4

    .line 244
    if-nez v4, :cond_f

    .line 245
    .line 246
    goto :goto_8

    .line 247
    :cond_f
    move-object v4, v3

    .line 248
    check-cast v4, La/ncz;

    .line 249
    .line 250
    iget v5, v4, La/ncz;->p:I

    .line 251
    .line 252
    iget v4, v4, La/ncz;->q:I

    .line 253
    .line 254
    div-int/lit8 v4, v4, 0x2

    .line 255
    .line 256
    add-int/2addr v4, v5

    .line 257
    add-int/2addr p0, v2

    .line 258
    div-int/lit8 v5, p0, 0x2

    .line 259
    .line 260
    sub-int/2addr v4, v5

    .line 261
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    move-object v4, v2

    .line 270
    check-cast v4, La/ncz;

    .line 271
    .line 272
    iget v6, v4, La/ncz;->p:I

    .line 273
    .line 274
    iget v4, v4, La/ncz;->q:I

    .line 275
    .line 276
    div-int/lit8 v4, v4, 0x2

    .line 277
    .line 278
    add-int/2addr v4, v6

    .line 279
    sub-int/2addr v4, v5

    .line 280
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-le p0, v4, :cond_11

    .line 285
    .line 286
    move-object v3, v2

    .line 287
    move p0, v4

    .line 288
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 289
    .line 290
    .line 291
    move-result v2

    .line 292
    if-nez v2, :cond_10

    .line 293
    .line 294
    :goto_8
    check-cast v3, La/ncz;

    .line 295
    .line 296
    if-eqz v3, :cond_12

    .line 297
    .line 298
    iget p0, v3, La/ncz;->a:I

    .line 299
    .line 300
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    :cond_12
    return-object v1

    .line 305
    :pswitch_7
    invoke-virtual {p0}, La/xcz;->h()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-nez v0, :cond_13

    .line 310
    .line 311
    invoke-virtual {p0}, La/xcz;->i()I

    .line 312
    .line 313
    .line 314
    move-result v0

    .line 315
    if-gtz v0, :cond_14

    .line 316
    .line 317
    :cond_13
    invoke-virtual {p0}, La/xcz;->h()I

    .line 318
    .line 319
    .line 320
    move-result p0

    .line 321
    if-lez p0, :cond_15

    .line 322
    .line 323
    :cond_14
    move v2, v3

    .line 324
    :cond_15
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_8
    invoke-virtual {p0}, La/xcz;->h()I

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-nez v0, :cond_16

    .line 334
    .line 335
    invoke-virtual {p0}, La/xcz;->i()I

    .line 336
    .line 337
    .line 338
    move-result v0

    .line 339
    if-gtz v0, :cond_17

    .line 340
    .line 341
    :cond_16
    invoke-virtual {p0}, La/xcz;->h()I

    .line 342
    .line 343
    .line 344
    move-result p0

    .line 345
    if-lez p0, :cond_18

    .line 346
    .line 347
    :cond_17
    move v2, v3

    .line 348
    :cond_18
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    return-object p0

    .line 353
    :pswitch_9
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 354
    .line 355
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 356
    .line 357
    .line 358
    move-result p0

    .line 359
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    return-object p0

    .line 364
    :pswitch_a
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    iget p0, p0, La/mcz;->o:I

    .line 369
    .line 370
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    return-object p0

    .line 375
    :pswitch_b
    invoke-virtual {p0}, La/xcz;->h()I

    .line 376
    .line 377
    .line 378
    move-result v0

    .line 379
    if-nez v0, :cond_1a

    .line 380
    .line 381
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-nez v0, :cond_19

    .line 386
    .line 387
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 388
    .line 389
    .line 390
    move-result p0

    .line 391
    if-eqz p0, :cond_1a

    .line 392
    .line 393
    :cond_19
    move v2, v3

    .line 394
    :cond_1a
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    return-object p0

    .line 399
    :pswitch_c
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 400
    .line 401
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 402
    .line 403
    .line 404
    move-result p0

    .line 405
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    return-object p0

    .line 410
    :pswitch_d
    iget-object v0, p0, La/xcz;->j:La/ywj;

    .line 411
    .line 412
    invoke-virtual {v0}, La/ywj;->a()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_1b

    .line 417
    .line 418
    goto :goto_b

    .line 419
    :cond_1b
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 420
    .line 421
    .line 422
    move-result-object p0

    .line 423
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 424
    .line 425
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 426
    .line 427
    .line 428
    move-result-object p0

    .line 429
    :cond_1c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 430
    .line 431
    .line 432
    move-result v0

    .line 433
    if-eqz v0, :cond_1d

    .line 434
    .line 435
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    move-object v2, v0

    .line 440
    check-cast v2, La/ncz;

    .line 441
    .line 442
    iget v2, v2, La/ncz;->p:I

    .line 443
    .line 444
    if-ltz v2, :cond_1c

    .line 445
    .line 446
    goto :goto_9

    .line 447
    :cond_1d
    move-object v0, v1

    .line 448
    :goto_9
    check-cast v0, La/ncz;

    .line 449
    .line 450
    if-eqz v0, :cond_1e

    .line 451
    .line 452
    iget-object p0, v0, La/ncz;->l:Ljava/lang/Object;

    .line 453
    .line 454
    goto :goto_a

    .line 455
    :cond_1e
    move-object p0, v1

    .line 456
    :goto_a
    instance-of v0, p0, La/dja;

    .line 457
    .line 458
    if-eqz v0, :cond_1f

    .line 459
    .line 460
    move-object v1, p0

    .line 461
    check-cast v1, La/dja;

    .line 462
    .line 463
    :cond_1f
    :goto_b
    return-object v1

    .line 464
    :pswitch_e
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 465
    .line 466
    .line 467
    move-result-object v0

    .line 468
    iget v0, v0, La/mcz;->n:I

    .line 469
    .line 470
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    invoke-virtual {p0}, La/xcz;->i()I

    .line 475
    .line 476
    .line 477
    move-result p0

    .line 478
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 479
    .line 480
    .line 481
    move-result-object p0

    .line 482
    new-instance v1, Lkotlin/Pair;

    .line 483
    .line 484
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 485
    .line 486
    .line 487
    return-object v1

    .line 488
    :pswitch_f
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    iget v0, v0, La/mcz;->n:I

    .line 493
    .line 494
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    invoke-virtual {p0}, La/xcz;->i()I

    .line 499
    .line 500
    .line 501
    move-result p0

    .line 502
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 503
    .line 504
    .line 505
    move-result-object p0

    .line 506
    new-instance v1, Lkotlin/Pair;

    .line 507
    .line 508
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 509
    .line 510
    .line 511
    return-object v1

    .line 512
    :pswitch_10
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 513
    .line 514
    .line 515
    move-result-object p0

    .line 516
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 517
    .line 518
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    check-cast p0, La/ncz;

    .line 523
    .line 524
    if-eqz p0, :cond_20

    .line 525
    .line 526
    iget p0, p0, La/ncz;->p:I

    .line 527
    .line 528
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 529
    .line 530
    .line 531
    move-result p0

    .line 532
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 533
    .line 534
    .line 535
    move-result-object v1

    .line 536
    :cond_20
    return-object v1

    .line 537
    :pswitch_11
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 538
    .line 539
    .line 540
    move-result-object p0

    .line 541
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 542
    .line 543
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object p0

    .line 547
    check-cast p0, La/ncz;

    .line 548
    .line 549
    if-eqz p0, :cond_21

    .line 550
    .line 551
    iget p0, p0, La/ncz;->p:I

    .line 552
    .line 553
    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    .line 554
    .line 555
    .line 556
    move-result p0

    .line 557
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 558
    .line 559
    .line 560
    move-result-object v1

    .line 561
    :cond_21
    return-object v1

    .line 562
    :pswitch_12
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 563
    .line 564
    .line 565
    move-result-object p0

    .line 566
    iget p0, p0, La/mcz;->o:I

    .line 567
    .line 568
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 569
    .line 570
    .line 571
    move-result-object p0

    .line 572
    return-object p0

    .line 573
    :pswitch_13
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 574
    .line 575
    .line 576
    move-result-object p0

    .line 577
    iget p0, p0, La/mcz;->o:I

    .line 578
    .line 579
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    return-object p0

    .line 584
    :pswitch_14
    invoke-virtual {p0}, La/xcz;->h()I

    .line 585
    .line 586
    .line 587
    move-result p0

    .line 588
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 589
    .line 590
    .line 591
    move-result-object p0

    .line 592
    return-object p0

    .line 593
    :pswitch_15
    invoke-virtual {p0}, La/xcz;->h()I

    .line 594
    .line 595
    .line 596
    move-result p0

    .line 597
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 598
    .line 599
    .line 600
    move-result-object p0

    .line 601
    return-object p0

    .line 602
    :pswitch_16
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 603
    .line 604
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 605
    .line 606
    .line 607
    move-result p0

    .line 608
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 609
    .line 610
    .line 611
    move-result-object p0

    .line 612
    return-object p0

    .line 613
    :pswitch_17
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    iget v0, v0, La/mcz;->n:I

    .line 618
    .line 619
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 620
    .line 621
    .line 622
    move-result-object p0

    .line 623
    iget p0, p0, La/mcz;->m:I

    .line 624
    .line 625
    add-int/2addr v0, p0

    .line 626
    div-int/lit8 v0, v0, 0x2

    .line 627
    .line 628
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object p0

    .line 632
    return-object p0

    .line 633
    :pswitch_18
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 634
    .line 635
    .line 636
    move-result-object p0

    .line 637
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 638
    .line 639
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 640
    .line 641
    .line 642
    move-result p0

    .line 643
    xor-int/2addr p0, v3

    .line 644
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 645
    .line 646
    .line 647
    move-result-object p0

    .line 648
    return-object p0

    .line 649
    :pswitch_19
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 650
    .line 651
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 652
    .line 653
    .line 654
    move-result p0

    .line 655
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 656
    .line 657
    .line 658
    move-result-object p0

    .line 659
    return-object p0

    .line 660
    :pswitch_1a
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 661
    .line 662
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 663
    .line 664
    .line 665
    move-result p0

    .line 666
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 667
    .line 668
    .line 669
    move-result-object p0

    .line 670
    return-object p0

    .line 671
    :pswitch_1b
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 672
    .line 673
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 674
    .line 675
    .line 676
    move-result p0

    .line 677
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 678
    .line 679
    .line 680
    move-result-object p0

    .line 681
    return-object p0

    .line 682
    :pswitch_1c
    invoke-virtual {p0}, La/xcz;->h()I

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-nez v0, :cond_23

    .line 687
    .line 688
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 689
    .line 690
    .line 691
    move-result v0

    .line 692
    if-nez v0, :cond_22

    .line 693
    .line 694
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 695
    .line 696
    .line 697
    move-result p0

    .line 698
    if-eqz p0, :cond_23

    .line 699
    .line 700
    :cond_22
    move v2, v3

    .line 701
    :cond_23
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 702
    .line 703
    .line 704
    move-result-object p0

    .line 705
    return-object p0

    .line 706
    nop

    .line 707
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
