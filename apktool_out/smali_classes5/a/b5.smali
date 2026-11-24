.class public final synthetic La/b5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/b5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/jg0;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    iput-byte p1, p0, La/b5;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte p0, p0, La/b5;->a:B

    .line 2
    .line 3
    const/4 v0, 0x6

    .line 4
    const/4 v1, 0x3

    .line 5
    const/4 v2, 0x2

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/4 v5, 0x0

    .line 9
    packed-switch p0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/ot0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    :pswitch_0
    check-cast p1, La/zvh0;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    if-eq p0, v3, :cond_2

    .line 34
    .line 35
    if-eq p0, v2, :cond_1

    .line 36
    .line 37
    if-ne p0, v1, :cond_0

    .line 38
    .line 39
    sget-object v5, La/bxh0;->a:La/bxh0;

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    sget-object v5, La/cxh0;->a:La/cxh0;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    sget-object v5, La/zwh0;->a:La/zwh0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    sget-object v5, La/axh0;->a:La/axh0;

    .line 53
    .line 54
    :goto_0
    return-object v5

    .line 55
    :pswitch_1
    check-cast p1, La/kg;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {p1}, La/oja0;->b0(La/kg;)La/ijl;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0

    .line 65
    :pswitch_2
    check-cast p1, La/ph0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    sget-object p1, La/sre0;->a:La/tre0;

    .line 75
    .line 76
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0

    .line 81
    :pswitch_3
    check-cast p1, La/ph0;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    instance-of p0, p1, La/nh0;

    .line 87
    .line 88
    if-eqz p0, :cond_4

    .line 89
    .line 90
    check-cast p1, La/nh0;

    .line 91
    .line 92
    iget-wide p0, p1, La/nh0;->a:J

    .line 93
    .line 94
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    goto :goto_1

    .line 99
    :cond_4
    instance-of p0, p1, La/oh0;

    .line 100
    .line 101
    if-eqz p0, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 105
    .line 106
    .line 107
    :goto_1
    return-object v5

    .line 108
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 114
    .line 115
    .line 116
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object p0

    .line 119
    :pswitch_5
    check-cast p1, La/ob0;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    new-instance p0, La/eg0;

    .line 125
    .line 126
    invoke-direct {p0, p1}, La/eg0;-><init>(La/ob0;)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :pswitch_6
    check-cast p1, La/kg;

    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 136
    .line 137
    .line 138
    move-result p0

    .line 139
    if-eqz p0, :cond_a

    .line 140
    .line 141
    if-eq p0, v3, :cond_9

    .line 142
    .line 143
    if-eq p0, v2, :cond_8

    .line 144
    .line 145
    if-eq p0, v1, :cond_7

    .line 146
    .line 147
    const/4 p1, 0x4

    .line 148
    if-ne p0, p1, :cond_6

    .line 149
    .line 150
    sget-object v5, La/ijl;->e:La/ijl;

    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_7
    sget-object v5, La/ijl;->d:La/ijl;

    .line 158
    .line 159
    goto :goto_2

    .line 160
    :cond_8
    sget-object v5, La/ijl;->c:La/ijl;

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_9
    sget-object v5, La/ijl;->b:La/ijl;

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_a
    sget-object v5, La/ijl;->a:La/ijl;

    .line 167
    .line 168
    :goto_2
    return-object v5

    .line 169
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 175
    .line 176
    .line 177
    move-result p0

    .line 178
    if-nez p0, :cond_b

    .line 179
    .line 180
    const-wide/16 p0, 0x0

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_b
    const-wide/16 p0, 0x12c

    .line 184
    .line 185
    :goto_3
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    return-object p0

    .line 190
    :pswitch_8
    check-cast p1, Ljava/util/Map;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 196
    .line 197
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 201
    .line 202
    .line 203
    move-result-object p1

    .line 204
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 205
    .line 206
    .line 207
    move-result-object p1

    .line 208
    :cond_c
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-eqz v0, :cond_d

    .line 213
    .line 214
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    check-cast v0, Ljava/util/Map$Entry;

    .line 219
    .line 220
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    instance-of v1, v1, Ljava/lang/Integer;

    .line 225
    .line 226
    if-eqz v1, :cond_c

    .line 227
    .line 228
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v1

    .line 232
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    goto :goto_4

    .line 240
    :cond_d
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 241
    .line 242
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    :cond_e
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 254
    .line 255
    .line 256
    move-result v0

    .line 257
    if-eqz v0, :cond_f

    .line 258
    .line 259
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    check-cast v0, Ljava/util/Map$Entry;

    .line 264
    .line 265
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, Ljava/lang/String;

    .line 270
    .line 271
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    if-eqz v1, :cond_e

    .line 276
    .line 277
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {p1, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    goto :goto_5

    .line 289
    :cond_f
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 290
    .line 291
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 292
    .line 293
    .line 294
    move-result v0

    .line 295
    invoke-static {v0}, La/wp20;->a(I)I

    .line 296
    .line 297
    .line 298
    move-result v0

    .line 299
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 303
    .line 304
    .line 305
    move-result-object p1

    .line 306
    check-cast p1, Ljava/lang/Iterable;

    .line 307
    .line 308
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 309
    .line 310
    .line 311
    move-result-object p1

    .line 312
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 313
    .line 314
    .line 315
    move-result v0

    .line 316
    if-eqz v0, :cond_10

    .line 317
    .line 318
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    check-cast v0, Ljava/util/Map$Entry;

    .line 323
    .line 324
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v1

    .line 328
    check-cast v1, Ljava/lang/String;

    .line 329
    .line 330
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 331
    .line 332
    .line 333
    move-result-wide v1

    .line 334
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    goto :goto_6

    .line 346
    :cond_10
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 347
    .line 348
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    invoke-static {v0}, La/wp20;->a(I)I

    .line 353
    .line 354
    .line 355
    move-result v0

    .line 356
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 360
    .line 361
    .line 362
    move-result-object p0

    .line 363
    check-cast p0, Ljava/lang/Iterable;

    .line 364
    .line 365
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 366
    .line 367
    .line 368
    move-result-object p0

    .line 369
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 370
    .line 371
    .line 372
    move-result v0

    .line 373
    if-eqz v0, :cond_11

    .line 374
    .line 375
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, Ljava/util/Map$Entry;

    .line 380
    .line 381
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v0

    .line 389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    check-cast v0, Ljava/lang/Integer;

    .line 393
    .line 394
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 395
    .line 396
    .line 397
    move-result v0

    .line 398
    invoke-static {v0}, La/fbc;->d(I)J

    .line 399
    .line 400
    .line 401
    move-result-wide v2

    .line 402
    new-instance v0, La/y3d;

    .line 403
    .line 404
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 405
    .line 406
    .line 407
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_11
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 412
    .line 413
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 414
    .line 415
    .line 416
    return-object p0

    .line 417
    :pswitch_9
    check-cast p1, Landroid/text/Editable;

    .line 418
    .line 419
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 423
    .line 424
    return-object p0

    .line 425
    :pswitch_a
    check-cast p1, Ljava/lang/Throwable;

    .line 426
    .line 427
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 428
    .line 429
    .line 430
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 431
    .line 432
    .line 433
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 434
    .line 435
    return-object p0

    .line 436
    :pswitch_b
    check-cast p1, Ljava/lang/Throwable;

    .line 437
    .line 438
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 442
    .line 443
    .line 444
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 445
    .line 446
    return-object p0

    .line 447
    :pswitch_c
    check-cast p1, Ljava/lang/Throwable;

    .line 448
    .line 449
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 453
    .line 454
    .line 455
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object p0

    .line 458
    :pswitch_d
    check-cast p1, Ljava/lang/Throwable;

    .line 459
    .line 460
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 464
    .line 465
    .line 466
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 467
    .line 468
    return-object p0

    .line 469
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 470
    .line 471
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 475
    .line 476
    .line 477
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 478
    .line 479
    return-object p0

    .line 480
    :pswitch_f
    check-cast p1, La/z70;

    .line 481
    .line 482
    sget p0, Lorg/xplatform/african_roulette/presentation/views/AfricanRouletteCell;->c:I

    .line 483
    .line 484
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 485
    .line 486
    .line 487
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    return-object p0

    .line 490
    :pswitch_10
    check-cast p1, La/hcz;

    .line 491
    .line 492
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    new-instance p0, La/kie0;

    .line 496
    .line 497
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 498
    .line 499
    .line 500
    move v0, v4

    .line 501
    :goto_8
    const/16 v2, 0x28

    .line 502
    .line 503
    if-ge v0, v2, :cond_12

    .line 504
    .line 505
    new-instance v2, La/z30;

    .line 506
    .line 507
    invoke-direct {v2, v0, p0, v4}, La/z30;-><init>(ILjava/lang/Object;B)V

    .line 508
    .line 509
    .line 510
    new-instance v6, La/ugd;

    .line 511
    .line 512
    const v7, 0x63dbfcd2

    .line 513
    .line 514
    .line 515
    invoke-direct {v6, v7, v3, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 516
    .line 517
    .line 518
    invoke-static {p1, v5, v5, v6, v1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 519
    .line 520
    .line 521
    add-int/lit8 v0, v0, 0x1

    .line 522
    .line 523
    goto :goto_8

    .line 524
    :cond_12
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object p0

    .line 527
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    .line 531
    .line 532
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 533
    .line 534
    return-object p0

    .line 535
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 536
    .line 537
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    .line 539
    .line 540
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object p0

    .line 543
    :pswitch_13
    check-cast p1, La/ex;

    .line 544
    .line 545
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    const-class p0, La/ex;

    .line 549
    .line 550
    sget-object p1, La/sre0;->a:La/tre0;

    .line 551
    .line 552
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 553
    .line 554
    .line 555
    move-result-object p0

    .line 556
    return-object p0

    .line 557
    :pswitch_14
    check-cast p1, La/ex;

    .line 558
    .line 559
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 560
    .line 561
    .line 562
    iget p0, p1, La/ex;->a:I

    .line 563
    .line 564
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 565
    .line 566
    .line 567
    move-result-object p0

    .line 568
    return-object p0

    .line 569
    :pswitch_15
    check-cast p1, La/cp;

    .line 570
    .line 571
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 575
    .line 576
    return-object p0

    .line 577
    :pswitch_16
    check-cast p1, Landroid/content/Context;

    .line 578
    .line 579
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 580
    .line 581
    .line 582
    new-instance p0, La/tje;

    .line 583
    .line 584
    const v0, 0x7f14071f

    .line 585
    .line 586
    .line 587
    invoke-direct {p0, p1, v0}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 588
    .line 589
    .line 590
    new-instance p1, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 591
    .line 592
    invoke-direct {p1, p0, v5}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 593
    .line 594
    .line 595
    return-object p1

    .line 596
    :pswitch_17
    check-cast p1, Landroid/content/Context;

    .line 597
    .line 598
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    new-instance p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 602
    .line 603
    invoke-direct {p0, p1, v5, v0, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 604
    .line 605
    .line 606
    sget-object p1, La/ful;->f:La/ful;

    .line 607
    .line 608
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 609
    .line 610
    .line 611
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 612
    .line 613
    .line 614
    move-result-object p1

    .line 615
    const v0, 0x7f131827

    .line 616
    .line 617
    .line 618
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 619
    .line 620
    .line 621
    move-result-object p1

    .line 622
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 629
    .line 630
    .line 631
    return-object p0

    .line 632
    :pswitch_18
    check-cast p1, Landroid/content/Context;

    .line 633
    .line 634
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 635
    .line 636
    .line 637
    new-instance p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 638
    .line 639
    invoke-direct {p0, p1, v5, v0, v4}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 640
    .line 641
    .line 642
    sget-object p1, La/ful;->i:La/ful;

    .line 643
    .line 644
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->setButtonStyle(La/ful;)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 648
    .line 649
    .line 650
    move-result-object p1

    .line 651
    const v0, 0x7f1315e0

    .line 652
    .line 653
    .line 654
    invoke-virtual {p1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object p1

    .line 658
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 662
    .line 663
    .line 664
    invoke-virtual {p0}, Lorg/xplatform/uikit/components/buttons/DsButton;->h()V

    .line 665
    .line 666
    .line 667
    return-object p0

    .line 668
    :pswitch_19
    check-cast p1, La/n1g;

    .line 669
    .line 670
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 671
    .line 672
    .line 673
    new-instance p0, La/rq2;

    .line 674
    .line 675
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 676
    .line 677
    .line 678
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 679
    .line 680
    sget-object p0, La/l1g;->b:La/l1g;

    .line 681
    .line 682
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 683
    .line 684
    sget-object p0, La/k1g;->b:La/k1g;

    .line 685
    .line 686
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 687
    .line 688
    sget-object p0, La/j1g;->c:La/j1g;

    .line 689
    .line 690
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 691
    .line 692
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    return-object p0

    .line 695
    :pswitch_1a
    check-cast p1, La/abi0;

    .line 696
    .line 697
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    return-object p0

    .line 700
    :pswitch_1b
    check-cast p1, La/abi0;

    .line 701
    .line 702
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    return-object p0

    .line 705
    :pswitch_1c
    check-cast p1, La/lpa0;

    .line 706
    .line 707
    if-nez p1, :cond_13

    .line 708
    .line 709
    goto :goto_9

    .line 710
    :cond_13
    iget p0, p1, La/lpa0;->a:I

    .line 711
    .line 712
    if-ne p0, v2, :cond_14

    .line 713
    .line 714
    move v4, v3

    .line 715
    :cond_14
    :goto_9
    xor-int/lit8 p0, v4, 0x1

    .line 716
    .line 717
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 718
    .line 719
    .line 720
    move-result-object p0

    .line 721
    return-object p0

    .line 722
    nop

    .line 723
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
