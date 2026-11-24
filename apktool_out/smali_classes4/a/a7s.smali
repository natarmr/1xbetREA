.class public final synthetic La/a7s;
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
    iput-byte p2, p0, La/a7s;->a:B

    iput-object p1, p0, La/a7s;->b:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/a7s;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/a7s;->b:La/xcz;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 12
    .line 13
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, La/xcz;->j:La/ywj;

    .line 23
    .line 24
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0

    .line 33
    :pswitch_1
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    iget p0, p0, La/mcz;->o:I

    .line 38
    .line 39
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :pswitch_2
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    iget p0, p0, La/mcz;->o:I

    .line 49
    .line 50
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    return-object p0

    .line 55
    :pswitch_3
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    iget p0, p0, La/mcz;->o:I

    .line 60
    .line 61
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_4
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    iget p0, p0, La/mcz;->o:I

    .line 71
    .line 72
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    return-object p0

    .line 77
    :pswitch_5
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    iget p0, p0, La/mcz;->o:I

    .line 82
    .line 83
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    return-object p0

    .line 88
    :pswitch_6
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 89
    .line 90
    .line 91
    move-result p0

    .line 92
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    return-object p0

    .line 97
    :pswitch_7
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_1

    .line 102
    .line 103
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_0

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_0
    move v2, v3

    .line 111
    :cond_1
    :goto_0
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    return-object p0

    .line 116
    :pswitch_8
    invoke-virtual {p0}, La/xcz;->h()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    invoke-virtual {p0}, La/xcz;->i()I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    new-instance v1, Lkotlin/Pair;

    .line 133
    .line 134
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :pswitch_9
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    iget p0, p0, La/mcz;->o:I

    .line 143
    .line 144
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :pswitch_a
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 154
    .line 155
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    check-cast p0, La/ncz;

    .line 160
    .line 161
    if-eqz p0, :cond_2

    .line 162
    .line 163
    iget p0, p0, La/ncz;->a:I

    .line 164
    .line 165
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object v1

    .line 169
    :cond_2
    return-object v1

    .line 170
    :pswitch_b
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 175
    .line 176
    invoke-static {p0}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    check-cast p0, La/ncz;

    .line 181
    .line 182
    if-eqz p0, :cond_3

    .line 183
    .line 184
    iget p0, p0, La/ncz;->a:I

    .line 185
    .line 186
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    :cond_3
    return-object v1

    .line 191
    :pswitch_c
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 196
    .line 197
    return-object p0

    .line 198
    :pswitch_d
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 199
    .line 200
    .line 201
    move-result-object p0

    .line 202
    iget p0, p0, La/mcz;->n:I

    .line 203
    .line 204
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 205
    .line 206
    .line 207
    move-result-object p0

    .line 208
    return-object p0

    .line 209
    :pswitch_e
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    iget p0, p0, La/mcz;->n:I

    .line 214
    .line 215
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    return-object p0

    .line 220
    :pswitch_f
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    iget p0, p0, La/mcz;->o:I

    .line 225
    .line 226
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 227
    .line 228
    .line 229
    move-result-object p0

    .line 230
    return-object p0

    .line 231
    :pswitch_10
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    iget p0, p0, La/mcz;->o:I

    .line 236
    .line 237
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 238
    .line 239
    .line 240
    move-result-object p0

    .line 241
    return-object p0

    .line 242
    :pswitch_11
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    iget p0, p0, La/mcz;->o:I

    .line 247
    .line 248
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    return-object p0

    .line 253
    :pswitch_12
    invoke-virtual {p0}, La/xcz;->h()I

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-virtual {p0}, La/xcz;->i()I

    .line 262
    .line 263
    .line 264
    move-result p0

    .line 265
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    new-instance v1, Lkotlin/Pair;

    .line 270
    .line 271
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    return-object v1

    .line 275
    :pswitch_13
    invoke-virtual {p0}, La/xcz;->h()I

    .line 276
    .line 277
    .line 278
    move-result v0

    .line 279
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 280
    .line 281
    .line 282
    move-result-object v0

    .line 283
    invoke-virtual {p0}, La/xcz;->i()I

    .line 284
    .line 285
    .line 286
    move-result p0

    .line 287
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 288
    .line 289
    .line 290
    move-result-object p0

    .line 291
    new-instance v1, Lkotlin/Pair;

    .line 292
    .line 293
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    return-object v1

    .line 297
    :pswitch_14
    invoke-virtual {p0}, La/xcz;->h()I

    .line 298
    .line 299
    .line 300
    move-result v0

    .line 301
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    invoke-virtual {p0}, La/xcz;->i()I

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object p0

    .line 313
    new-instance v1, Lkotlin/Pair;

    .line 314
    .line 315
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    return-object v1

    .line 319
    :pswitch_15
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    iget p0, p0, La/mcz;->o:I

    .line 324
    .line 325
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 326
    .line 327
    .line 328
    move-result-object p0

    .line 329
    return-object p0

    .line 330
    :pswitch_16
    invoke-virtual {p0}, La/xcz;->h()I

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 335
    .line 336
    .line 337
    move-result-object v0

    .line 338
    invoke-virtual {p0}, La/xcz;->i()I

    .line 339
    .line 340
    .line 341
    move-result p0

    .line 342
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 343
    .line 344
    .line 345
    move-result-object p0

    .line 346
    new-instance v1, Lkotlin/Pair;

    .line 347
    .line 348
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 349
    .line 350
    .line 351
    return-object v1

    .line 352
    :pswitch_17
    invoke-virtual {p0}, La/xcz;->d()Z

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    if-nez v0, :cond_5

    .line 357
    .line 358
    invoke-virtual {p0}, La/xcz;->c()Z

    .line 359
    .line 360
    .line 361
    move-result p0

    .line 362
    if-eqz p0, :cond_4

    .line 363
    .line 364
    goto :goto_1

    .line 365
    :cond_4
    move v2, v3

    .line 366
    :cond_5
    :goto_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    return-object p0

    .line 371
    :pswitch_18
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 372
    .line 373
    .line 374
    move-result-object p0

    .line 375
    iget p0, p0, La/mcz;->o:I

    .line 376
    .line 377
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 378
    .line 379
    .line 380
    move-result-object p0

    .line 381
    return-object p0

    .line 382
    :pswitch_19
    iget-object p0, p0, La/xcz;->f:La/pz40;

    .line 383
    .line 384
    check-cast p0, La/hgk0;

    .line 385
    .line 386
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object p0

    .line 390
    check-cast p0, La/mcz;

    .line 391
    .line 392
    iget p0, p0, La/mcz;->k:I

    .line 393
    .line 394
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 395
    .line 396
    .line 397
    move-result-object p0

    .line 398
    return-object p0

    .line 399
    :pswitch_1a
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    iget p0, p0, La/mcz;->o:I

    .line 404
    .line 405
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    return-object p0

    .line 410
    :pswitch_1b
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 411
    .line 412
    .line 413
    move-result-object v0

    .line 414
    iget-object v0, v0, La/mcz;->l:Ljava/util/List;

    .line 415
    .line 416
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    check-cast v0, La/ncz;

    .line 421
    .line 422
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 423
    .line 424
    .line 425
    move-result-object v1

    .line 426
    iget-object v1, v1, La/mcz;->l:Ljava/util/List;

    .line 427
    .line 428
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    check-cast v1, La/ncz;

    .line 433
    .line 434
    if-eqz v0, :cond_6

    .line 435
    .line 436
    iget v0, v0, La/ncz;->p:I

    .line 437
    .line 438
    goto :goto_2

    .line 439
    :cond_6
    move v0, v3

    .line 440
    :goto_2
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 441
    .line 442
    .line 443
    move-result-object v4

    .line 444
    iget v4, v4, La/mcz;->m:I

    .line 445
    .line 446
    if-ge v0, v4, :cond_7

    .line 447
    .line 448
    move v0, v2

    .line 449
    goto :goto_3

    .line 450
    :cond_7
    move v0, v3

    .line 451
    :goto_3
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    if-eqz v1, :cond_8

    .line 456
    .line 457
    iget v4, v1, La/ncz;->p:I

    .line 458
    .line 459
    iget v1, v1, La/ncz;->q:I

    .line 460
    .line 461
    add-int/2addr v4, v1

    .line 462
    goto :goto_4

    .line 463
    :cond_8
    move v4, v3

    .line 464
    :goto_4
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 465
    .line 466
    .line 467
    move-result-object p0

    .line 468
    iget p0, p0, La/mcz;->n:I

    .line 469
    .line 470
    if-le v4, p0, :cond_9

    .line 471
    .line 472
    goto :goto_5

    .line 473
    :cond_9
    move v2, v3

    .line 474
    :goto_5
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 475
    .line 476
    .line 477
    move-result-object p0

    .line 478
    new-instance v1, Lkotlin/Pair;

    .line 479
    .line 480
    invoke-direct {v1, v0, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 481
    .line 482
    .line 483
    return-object v1

    .line 484
    :pswitch_1c
    invoke-virtual {p0}, La/xcz;->j()La/mcz;

    .line 485
    .line 486
    .line 487
    move-result-object p0

    .line 488
    iget-object p0, p0, La/mcz;->l:Ljava/util/List;

    .line 489
    .line 490
    if-eqz p0, :cond_b

    .line 491
    .line 492
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 493
    .line 494
    .line 495
    move-result v0

    .line 496
    if-eqz v0, :cond_b

    .line 497
    .line 498
    :cond_a
    move v2, v3

    .line 499
    goto :goto_6

    .line 500
    :cond_b
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    :cond_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 505
    .line 506
    .line 507
    move-result v0

    .line 508
    if-eqz v0, :cond_a

    .line 509
    .line 510
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    check-cast v0, La/ncz;

    .line 515
    .line 516
    iget v0, v0, La/ncz;->a:I

    .line 517
    .line 518
    if-ne v0, v2, :cond_c

    .line 519
    .line 520
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 521
    .line 522
    .line 523
    move-result-object p0

    .line 524
    return-object p0

    .line 525
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
