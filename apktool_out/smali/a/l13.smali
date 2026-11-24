.class public final synthetic La/l13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/l13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/nqd;)V
    .locals 0

    .line 1
    const/16 p1, 0x1c

    iput-byte p1, p0, La/l13;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 5

    .line 1
    iget-byte p0, p0, La/l13;->a:B

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/a55;

    .line 9
    .line 10
    check-cast p2, La/a55;

    .line 11
    .line 12
    iget-object p0, p1, La/a55;->a:La/hzj;

    .line 13
    .line 14
    iget-object p0, p0, La/hzj;->j:Ljava/lang/Class;

    .line 15
    .line 16
    const-class p1, La/qrm0;

    .line 17
    .line 18
    const-class v2, La/oub0;

    .line 19
    .line 20
    const/4 v3, 0x2

    .line 21
    const-class v4, Landroid/media/MediaCodec;

    .line 22
    .line 23
    if-ne p0, v4, :cond_0

    .line 24
    .line 25
    move p0, v3

    .line 26
    goto :goto_1

    .line 27
    :cond_0
    if-eq p0, v2, :cond_2

    .line 28
    .line 29
    if-ne p0, p1, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    move p0, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    :goto_0
    move p0, v1

    .line 35
    :goto_1
    iget-object p2, p2, La/a55;->a:La/hzj;

    .line 36
    .line 37
    iget-object p2, p2, La/hzj;->j:Ljava/lang/Class;

    .line 38
    .line 39
    if-ne p2, v4, :cond_3

    .line 40
    .line 41
    move v0, v3

    .line 42
    goto :goto_2

    .line 43
    :cond_3
    if-eq p2, v2, :cond_4

    .line 44
    .line 45
    if-ne p2, p1, :cond_5

    .line 46
    .line 47
    :cond_4
    move v0, v1

    .line 48
    :cond_5
    :goto_2
    sub-int/2addr p0, v0

    .line 49
    return p0

    .line 50
    :pswitch_0
    check-cast p1, La/cnk0;

    .line 51
    .line 52
    check-cast p2, La/cnk0;

    .line 53
    .line 54
    iget p0, p2, La/cnk0;->a:I

    .line 55
    .line 56
    iget v0, p1, La/cnk0;->a:I

    .line 57
    .line 58
    invoke-static {p0, v0}, Ljava/lang/Integer;->compare(II)I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_6

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_6
    iget-object p0, p2, La/cnk0;->c:Ljava/lang/String;

    .line 66
    .line 67
    iget-object v0, p1, La/cnk0;->c:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    if-eqz p0, :cond_7

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_7
    iget-object p0, p2, La/cnk0;->d:Ljava/lang/String;

    .line 77
    .line 78
    iget-object p1, p1, La/cnk0;->d:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    :goto_3
    return p0

    .line 85
    :pswitch_1
    check-cast p1, La/cnk0;

    .line 86
    .line 87
    check-cast p2, La/cnk0;

    .line 88
    .line 89
    iget p0, p2, La/cnk0;->b:I

    .line 90
    .line 91
    iget v0, p1, La/cnk0;->b:I

    .line 92
    .line 93
    invoke-static {p0, v0}, Ljava/lang/Integer;->compare(II)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_8

    .line 98
    .line 99
    goto :goto_4

    .line 100
    :cond_8
    iget-object p0, p1, La/cnk0;->c:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v0, p2, La/cnk0;->c:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {p0, v0}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_9

    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_9
    iget-object p0, p1, La/cnk0;->d:Ljava/lang/String;

    .line 112
    .line 113
    iget-object p1, p2, La/cnk0;->d:Ljava/lang/String;

    .line 114
    .line 115
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 116
    .line 117
    .line 118
    move-result p0

    .line 119
    :goto_4
    return p0

    .line 120
    :pswitch_2
    check-cast p1, La/k8k0;

    .line 121
    .line 122
    check-cast p2, La/k8k0;

    .line 123
    .line 124
    iget p0, p1, La/k8k0;->c:F

    .line 125
    .line 126
    iget p1, p2, La/k8k0;->c:F

    .line 127
    .line 128
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 129
    .line 130
    .line 131
    move-result p0

    .line 132
    return p0

    .line 133
    :pswitch_3
    check-cast p1, La/k8k0;

    .line 134
    .line 135
    check-cast p2, La/k8k0;

    .line 136
    .line 137
    iget p0, p1, La/k8k0;->a:I

    .line 138
    .line 139
    iget p1, p2, La/k8k0;->a:I

    .line 140
    .line 141
    sub-int/2addr p0, p1

    .line 142
    return p0

    .line 143
    :pswitch_4
    check-cast p1, La/s8f;

    .line 144
    .line 145
    check-cast p2, La/s8f;

    .line 146
    .line 147
    check-cast p1, La/b25;

    .line 148
    .line 149
    iget-object p0, p1, La/b25;->a:Ljava/lang/String;

    .line 150
    .line 151
    check-cast p2, La/b25;

    .line 152
    .line 153
    iget-object p1, p2, La/b25;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 156
    .line 157
    .line 158
    move-result p0

    .line 159
    return p0

    .line 160
    :pswitch_5
    sget-object p0, La/bbi0;->b:La/d1i0;

    .line 161
    .line 162
    invoke-virtual {p0, p1, p2}, La/d1i0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, Ljava/lang/Number;

    .line 167
    .line 168
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    return p0

    .line 173
    :pswitch_6
    check-cast p1, La/u15;

    .line 174
    .line 175
    check-cast p2, La/u15;

    .line 176
    .line 177
    iget-object p0, p1, La/u15;->a:Ljava/lang/String;

    .line 178
    .line 179
    iget-object p1, p2, La/u15;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    return p0

    .line 186
    :pswitch_7
    check-cast p1, La/kbz;

    .line 187
    .line 188
    check-cast p2, La/kbz;

    .line 189
    .line 190
    invoke-interface {p1}, La/kbz;->getIndex()I

    .line 191
    .line 192
    .line 193
    move-result p0

    .line 194
    invoke-interface {p2}, La/kbz;->getIndex()I

    .line 195
    .line 196
    .line 197
    move-result p1

    .line 198
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 199
    .line 200
    .line 201
    move-result p0

    .line 202
    return p0

    .line 203
    :pswitch_8
    check-cast p1, La/e7z;

    .line 204
    .line 205
    check-cast p2, La/e7z;

    .line 206
    .line 207
    iget-object p0, p1, La/e7z;->i1:La/i7z;

    .line 208
    .line 209
    iget-object p0, p0, La/i7z;->p:La/sj30;

    .line 210
    .line 211
    iget p0, p0, La/sj30;->g1:F

    .line 212
    .line 213
    iget-object v0, p2, La/e7z;->i1:La/i7z;

    .line 214
    .line 215
    iget-object v0, v0, La/i7z;->p:La/sj30;

    .line 216
    .line 217
    iget v0, v0, La/sj30;->g1:F

    .line 218
    .line 219
    cmpg-float v1, p0, v0

    .line 220
    .line 221
    if-nez v1, :cond_a

    .line 222
    .line 223
    invoke-virtual {p1}, La/e7z;->w()I

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    invoke-virtual {p2}, La/e7z;->w()I

    .line 228
    .line 229
    .line 230
    move-result p1

    .line 231
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 232
    .line 233
    .line 234
    move-result p0

    .line 235
    goto :goto_5

    .line 236
    :cond_a
    invoke-static {p0, v0}, Ljava/lang/Float;->compare(FF)I

    .line 237
    .line 238
    .line 239
    move-result p0

    .line 240
    :goto_5
    return p0

    .line 241
    :pswitch_9
    check-cast p1, Lkotlin/ranges/IntRange;

    .line 242
    .line 243
    check-cast p2, Lkotlin/ranges/IntRange;

    .line 244
    .line 245
    iget p0, p1, Lkotlin/ranges/a;->b:I

    .line 246
    .line 247
    iget p1, p1, Lkotlin/ranges/a;->a:I

    .line 248
    .line 249
    sub-int/2addr p0, p1

    .line 250
    iget p1, p2, Lkotlin/ranges/a;->b:I

    .line 251
    .line 252
    iget p2, p2, Lkotlin/ranges/a;->a:I

    .line 253
    .line 254
    sub-int/2addr p1, p2

    .line 255
    sub-int/2addr p0, p1

    .line 256
    return p0

    .line 257
    :pswitch_a
    check-cast p1, La/abw;

    .line 258
    .line 259
    check-cast p2, La/abw;

    .line 260
    .line 261
    iget-object p0, p1, La/abw;->a:Ljava/lang/String;

    .line 262
    .line 263
    iget-object p1, p2, La/abw;->a:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    move-result p0

    .line 269
    return p0

    .line 270
    :pswitch_b
    check-cast p1, Ljava/lang/String;

    .line 271
    .line 272
    check-cast p2, Ljava/lang/String;

    .line 273
    .line 274
    const-string p0, ":"

    .line 275
    .line 276
    invoke-virtual {p1, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object p1

    .line 280
    aget-object p1, p1, v1

    .line 281
    .line 282
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    move-result p1

    .line 286
    invoke-virtual {p2, p0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object p0

    .line 290
    aget-object p0, p0, v1

    .line 291
    .line 292
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 293
    .line 294
    .line 295
    move-result p0

    .line 296
    sub-int/2addr p1, p0

    .line 297
    return p1

    .line 298
    :pswitch_c
    check-cast p1, La/fox;

    .line 299
    .line 300
    check-cast p2, La/fox;

    .line 301
    .line 302
    iget p0, p1, La/fox;->b:I

    .line 303
    .line 304
    iget p1, p2, La/fox;->b:I

    .line 305
    .line 306
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 307
    .line 308
    .line 309
    move-result p0

    .line 310
    return p0

    .line 311
    :pswitch_d
    check-cast p1, [B

    .line 312
    .line 313
    check-cast p2, [B

    .line 314
    .line 315
    array-length p0, p1

    .line 316
    array-length v0, p2

    .line 317
    if-eq p0, v0, :cond_b

    .line 318
    .line 319
    array-length p0, p1

    .line 320
    array-length p1, p2

    .line 321
    sub-int v1, p0, p1

    .line 322
    .line 323
    goto :goto_7

    .line 324
    :cond_b
    move p0, v1

    .line 325
    :goto_6
    array-length v0, p1

    .line 326
    if-ge p0, v0, :cond_d

    .line 327
    .line 328
    aget-byte v0, p1, p0

    .line 329
    .line 330
    aget-byte v2, p2, p0

    .line 331
    .line 332
    if-eq v0, v2, :cond_c

    .line 333
    .line 334
    sub-int v1, v0, v2

    .line 335
    .line 336
    goto :goto_7

    .line 337
    :cond_c
    add-int/lit8 p0, p0, 0x1

    .line 338
    .line 339
    goto :goto_6

    .line 340
    :cond_d
    :goto_7
    return v1

    .line 341
    :pswitch_e
    check-cast p1, La/ryj;

    .line 342
    .line 343
    check-cast p2, La/ryj;

    .line 344
    .line 345
    iget-boolean p0, p1, La/ryj;->e:Z

    .line 346
    .line 347
    iget v0, p1, La/ryj;->j:I

    .line 348
    .line 349
    if-eqz p0, :cond_e

    .line 350
    .line 351
    iget-boolean p0, p1, La/ryj;->h:Z

    .line 352
    .line 353
    if-eqz p0, :cond_e

    .line 354
    .line 355
    sget-object p0, La/syj;->k:La/ia80;

    .line 356
    .line 357
    goto :goto_8

    .line 358
    :cond_e
    sget-object p0, La/syj;->k:La/ia80;

    .line 359
    .line 360
    invoke-virtual {p0}, La/ia80;->a()La/ia80;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    :goto_8
    iget-object v1, p1, La/ryj;->f:La/nyj;

    .line 365
    .line 366
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    iget-boolean v1, p1, La/ryj;->y:Z

    .line 370
    .line 371
    iget-boolean v2, p2, La/ryj;->y:Z

    .line 372
    .line 373
    sget-object v3, La/gdd;->a:La/edd;

    .line 374
    .line 375
    invoke-virtual {v3, v1, v2}, La/gdd;->c(ZZ)La/gdd;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    iget v2, p1, La/ryj;->k:I

    .line 380
    .line 381
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 382
    .line 383
    .line 384
    move-result-object v2

    .line 385
    iget v3, p2, La/ryj;->k:I

    .line 386
    .line 387
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 388
    .line 389
    .line 390
    move-result-object v3

    .line 391
    invoke-virtual {v1, v2, v3, p0}, La/gdd;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)La/gdd;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    iget-boolean v2, p1, La/ryj;->u:Z

    .line 396
    .line 397
    if-eqz v2, :cond_f

    .line 398
    .line 399
    iget-boolean v2, p1, La/ryj;->w:Z

    .line 400
    .line 401
    if-eqz v2, :cond_f

    .line 402
    .line 403
    iget v2, p1, La/ryj;->x:I

    .line 404
    .line 405
    iget v3, p2, La/ryj;->x:I

    .line 406
    .line 407
    invoke-virtual {v1, v2, v3}, La/gdd;->a(II)La/gdd;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    :cond_f
    iget-boolean p1, p1, La/ryj;->v:Z

    .line 412
    .line 413
    iget-boolean v2, p2, La/ryj;->v:Z

    .line 414
    .line 415
    invoke-virtual {v1, p1, v2}, La/gdd;->c(ZZ)La/gdd;

    .line 416
    .line 417
    .line 418
    move-result-object p1

    .line 419
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget p2, p2, La/ryj;->j:I

    .line 424
    .line 425
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 426
    .line 427
    .line 428
    move-result-object p2

    .line 429
    invoke-virtual {p1, v0, p2, p0}, La/gdd;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)La/gdd;

    .line 430
    .line 431
    .line 432
    move-result-object p0

    .line 433
    invoke-virtual {p0}, La/gdd;->e()I

    .line 434
    .line 435
    .line 436
    move-result p0

    .line 437
    return p0

    .line 438
    :pswitch_f
    check-cast p1, La/ryj;

    .line 439
    .line 440
    check-cast p2, La/ryj;

    .line 441
    .line 442
    invoke-static {p1, p2}, La/ryj;->c(La/ryj;La/ryj;)I

    .line 443
    .line 444
    .line 445
    move-result p0

    .line 446
    return p0

    .line 447
    :pswitch_10
    check-cast p1, Ljava/util/List;

    .line 448
    .line 449
    check-cast p2, Ljava/util/List;

    .line 450
    .line 451
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object p0

    .line 455
    check-cast p0, La/oyj;

    .line 456
    .line 457
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object p1

    .line 461
    check-cast p1, La/oyj;

    .line 462
    .line 463
    invoke-virtual {p0, p1}, La/oyj;->c(La/oyj;)I

    .line 464
    .line 465
    .line 466
    move-result p0

    .line 467
    return p0

    .line 468
    :pswitch_11
    check-cast p1, Ljava/util/List;

    .line 469
    .line 470
    check-cast p2, Ljava/util/List;

    .line 471
    .line 472
    invoke-static {p1}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object p0

    .line 476
    check-cast p0, La/jyj;

    .line 477
    .line 478
    invoke-static {p2}, Ljava/util/Collections;->max(Ljava/util/Collection;)Ljava/lang/Object;

    .line 479
    .line 480
    .line 481
    move-result-object p1

    .line 482
    check-cast p1, La/jyj;

    .line 483
    .line 484
    invoke-virtual {p0, p1}, La/jyj;->c(La/jyj;)I

    .line 485
    .line 486
    .line 487
    move-result p0

    .line 488
    return p0

    .line 489
    :pswitch_12
    check-cast p1, Ljava/util/List;

    .line 490
    .line 491
    check-cast p2, Ljava/util/List;

    .line 492
    .line 493
    new-instance p0, La/l13;

    .line 494
    .line 495
    const/16 v0, 0xc

    .line 496
    .line 497
    invoke-direct {p0, v0}, La/l13;-><init>(B)V

    .line 498
    .line 499
    .line 500
    invoke-static {p1, p0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    check-cast p0, La/ryj;

    .line 505
    .line 506
    new-instance v1, La/l13;

    .line 507
    .line 508
    invoke-direct {v1, v0}, La/l13;-><init>(B)V

    .line 509
    .line 510
    .line 511
    invoke-static {p2, v1}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, La/ryj;

    .line 516
    .line 517
    invoke-static {p0, v0}, La/ryj;->c(La/ryj;La/ryj;)I

    .line 518
    .line 519
    .line 520
    move-result p0

    .line 521
    invoke-static {p0}, La/edd;->f(I)La/gdd;

    .line 522
    .line 523
    .line 524
    move-result-object p0

    .line 525
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    invoke-virtual {p0, v0, v1}, La/gdd;->a(II)La/gdd;

    .line 534
    .line 535
    .line 536
    move-result-object p0

    .line 537
    new-instance v0, La/l13;

    .line 538
    .line 539
    const/16 v1, 0xd

    .line 540
    .line 541
    invoke-direct {v0, v1}, La/l13;-><init>(B)V

    .line 542
    .line 543
    .line 544
    invoke-static {p1, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object p1

    .line 548
    check-cast p1, La/ryj;

    .line 549
    .line 550
    new-instance v0, La/l13;

    .line 551
    .line 552
    invoke-direct {v0, v1}, La/l13;-><init>(B)V

    .line 553
    .line 554
    .line 555
    invoke-static {p2, v0}, Ljava/util/Collections;->max(Ljava/util/Collection;Ljava/util/Comparator;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object p2

    .line 559
    check-cast p2, La/ryj;

    .line 560
    .line 561
    new-instance v0, La/l13;

    .line 562
    .line 563
    invoke-direct {v0, v1}, La/l13;-><init>(B)V

    .line 564
    .line 565
    .line 566
    invoke-virtual {p0, p1, p2, v0}, La/gdd;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)La/gdd;

    .line 567
    .line 568
    .line 569
    move-result-object p0

    .line 570
    invoke-virtual {p0}, La/gdd;->e()I

    .line 571
    .line 572
    .line 573
    move-result p0

    .line 574
    return p0

    .line 575
    :pswitch_13
    check-cast p1, Ljava/util/List;

    .line 576
    .line 577
    check-cast p2, Ljava/util/List;

    .line 578
    .line 579
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    move-result-object p0

    .line 583
    check-cast p0, La/kyj;

    .line 584
    .line 585
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object p1

    .line 589
    check-cast p1, La/kyj;

    .line 590
    .line 591
    iget p0, p0, La/kyj;->f:I

    .line 592
    .line 593
    iget p1, p1, La/kyj;->f:I

    .line 594
    .line 595
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 596
    .line 597
    .line 598
    move-result p0

    .line 599
    return p0

    .line 600
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 601
    .line 602
    check-cast p2, Ljava/lang/Integer;

    .line 603
    .line 604
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 605
    .line 606
    .line 607
    move-result p0

    .line 608
    const/4 v2, -0x1

    .line 609
    if-ne p0, v2, :cond_11

    .line 610
    .line 611
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 612
    .line 613
    .line 614
    move-result p0

    .line 615
    if-ne p0, v2, :cond_10

    .line 616
    .line 617
    move v0, v1

    .line 618
    goto :goto_9

    .line 619
    :cond_10
    move v0, v2

    .line 620
    goto :goto_9

    .line 621
    :cond_11
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 622
    .line 623
    .line 624
    move-result p0

    .line 625
    if-ne p0, v2, :cond_12

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_12
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 629
    .line 630
    .line 631
    move-result p0

    .line 632
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 633
    .line 634
    .line 635
    move-result p1

    .line 636
    sub-int v0, p0, p1

    .line 637
    .line 638
    :goto_9
    return v0

    .line 639
    :pswitch_15
    check-cast p1, Ljava/io/File;

    .line 640
    .line 641
    check-cast p2, Ljava/io/File;

    .line 642
    .line 643
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 644
    .line 645
    .line 646
    move-result-object p0

    .line 647
    sget-byte p1, La/x9f;->f:B

    .line 648
    .line 649
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object p0

    .line 653
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 654
    .line 655
    .line 656
    move-result-object p2

    .line 657
    invoke-virtual {p2, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object p1

    .line 661
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 662
    .line 663
    .line 664
    move-result p0

    .line 665
    return p0

    .line 666
    :pswitch_16
    check-cast p1, Ljava/io/File;

    .line 667
    .line 668
    check-cast p2, Ljava/io/File;

    .line 669
    .line 670
    invoke-virtual {p2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 671
    .line 672
    .line 673
    move-result-object p0

    .line 674
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object p1

    .line 678
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    .line 679
    .line 680
    .line 681
    move-result p0

    .line 682
    return p0

    .line 683
    :pswitch_17
    check-cast p1, Ljava/io/File;

    .line 684
    .line 685
    check-cast p2, Ljava/io/File;

    .line 686
    .line 687
    invoke-virtual {p2}, Ljava/io/File;->lastModified()J

    .line 688
    .line 689
    .line 690
    move-result-wide v0

    .line 691
    invoke-virtual {p1}, Ljava/io/File;->lastModified()J

    .line 692
    .line 693
    .line 694
    move-result-wide p0

    .line 695
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Long;->compare(JJ)I

    .line 696
    .line 697
    .line 698
    move-result p0

    .line 699
    return p0

    .line 700
    :pswitch_18
    check-cast p1, La/o8b;

    .line 701
    .line 702
    check-cast p2, La/o8b;

    .line 703
    .line 704
    iget p0, p2, La/o8b;->b:I

    .line 705
    .line 706
    iget p1, p1, La/o8b;->b:I

    .line 707
    .line 708
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 709
    .line 710
    .line 711
    move-result p0

    .line 712
    return p0

    .line 713
    :pswitch_19
    check-cast p1, Landroidx/media3/common/b;

    .line 714
    .line 715
    check-cast p2, Landroidx/media3/common/b;

    .line 716
    .line 717
    iget p0, p2, Landroidx/media3/common/b;->k:I

    .line 718
    .line 719
    iget p1, p1, Landroidx/media3/common/b;->k:I

    .line 720
    .line 721
    invoke-static {p0, p1}, Ljava/lang/Integer;->compare(II)I

    .line 722
    .line 723
    .line 724
    move-result p0

    .line 725
    return p0

    .line 726
    :pswitch_1a
    check-cast p1, Ljava/lang/Integer;

    .line 727
    .line 728
    check-cast p2, Ljava/lang/Integer;

    .line 729
    .line 730
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 731
    .line 732
    .line 733
    move-result p0

    .line 734
    invoke-static {p0}, Ljava/lang/Integer;->bitCount(I)I

    .line 735
    .line 736
    .line 737
    move-result p0

    .line 738
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 739
    .line 740
    .line 741
    move-result p1

    .line 742
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    .line 743
    .line 744
    .line 745
    move-result p1

    .line 746
    sub-int/2addr p0, p1

    .line 747
    return p0

    .line 748
    :pswitch_1b
    check-cast p1, La/qwb0;

    .line 749
    .line 750
    check-cast p2, La/qwb0;

    .line 751
    .line 752
    iget-boolean p0, p2, La/qwb0;->a:Z

    .line 753
    .line 754
    iget-boolean p1, p1, La/qwb0;->a:Z

    .line 755
    .line 756
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->e(II)I

    .line 757
    .line 758
    .line 759
    move-result p0

    .line 760
    return p0

    .line 761
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
