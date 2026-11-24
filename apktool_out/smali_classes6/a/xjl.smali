.class public final synthetic La/xjl;
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
    iput-byte p1, p0, La/xjl;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte p0, p0, La/xjl;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Long;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    check-cast p1, La/ybm;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-interface {p1}, La/ybm;->getId()J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-static {p0, p1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :pswitch_1
    check-cast p1, La/ibm;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const-class p0, La/ibm;

    .line 34
    .line 35
    sget-object p1, La/sre0;->a:La/tre0;

    .line 36
    .line 37
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_2
    check-cast p1, La/ibm;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    iget-object p0, p1, La/ibm;->a:Ljava/lang/String;

    .line 48
    .line 49
    return-object p0

    .line 50
    :pswitch_3
    check-cast p1, La/t2m;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    sget-object p1, La/sre0;->a:La/tre0;

    .line 60
    .line 61
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    :pswitch_4
    check-cast p1, La/c53;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    const/16 p0, 0x78

    .line 72
    .line 73
    const/4 p1, 0x0

    .line 74
    const/4 v0, 0x0

    .line 75
    const/4 v1, 0x6

    .line 76
    invoke-static {p0, p1, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    const/4 v3, 0x0

    .line 81
    const/4 v4, 0x2

    .line 82
    invoke-static {v2, v3, v4}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    invoke-static {p0, p1, v0, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-static {p0, v4}, La/kzn;->e(La/cfq;I)La/alo;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {v2, p0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    return-object p0

    .line 99
    :pswitch_5
    check-cast p1, La/uag0;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const/high16 p0, -0x40800000    # -1.0f

    .line 105
    .line 106
    invoke-virtual {p1, p0}, La/uag0;->w(F)V

    .line 107
    .line 108
    .line 109
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 110
    .line 111
    return-object p0

    .line 112
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_7
    check-cast p1, Ljava/lang/Long;

    .line 121
    .line 122
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 126
    .line 127
    return-object p0

    .line 128
    :pswitch_8
    check-cast p1, Ljava/lang/Long;

    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object p0

    .line 136
    :pswitch_9
    check-cast p1, Ljava/lang/Long;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_a
    check-cast p1, Ljava/lang/Long;

    .line 145
    .line 146
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 150
    .line 151
    return-object p0

    .line 152
    :pswitch_b
    move-object v0, p1

    .line 153
    check-cast v0, La/hcz;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    sget-object v4, La/y0x0;->c:La/ugd;

    .line 159
    .line 160
    const/4 v5, 0x6

    .line 161
    const/4 v1, 0x6

    .line 162
    const/4 v2, 0x0

    .line 163
    const/4 v3, 0x0

    .line 164
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 165
    .line 166
    .line 167
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object p0

    .line 170
    :pswitch_c
    check-cast p1, Ljava/lang/Float;

    .line 171
    .line 172
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    const/high16 p1, 0x3f000000    # 0.5f

    .line 177
    .line 178
    mul-float/2addr p0, p1

    .line 179
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 180
    .line 181
    .line 182
    move-result-object p0

    .line 183
    return-object p0

    .line 184
    :pswitch_d
    check-cast p1, La/abi0;

    .line 185
    .line 186
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_e
    check-cast p1, Ljava/lang/Long;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 198
    .line 199
    return-object p0

    .line 200
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object p0

    .line 208
    :pswitch_10
    check-cast p1, Ljava/lang/Boolean;

    .line 209
    .line 210
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_11
    check-cast p1, Lorg/xplatform/uikit/components/chips/DsChip;

    .line 217
    .line 218
    sget p0, Lorg/xplatform/uikit/components/chips/DsChipGroup;->r:I

    .line 219
    .line 220
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    invoke-virtual {p1}, Lorg/xplatform/uikit/components/chips/DsChip;->isSelected()Z

    .line 224
    .line 225
    .line 226
    move-result p0

    .line 227
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    return-object p0

    .line 232
    :pswitch_12
    check-cast p1, La/mvl;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_13
    check-cast p1, La/mvl;

    .line 241
    .line 242
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 246
    .line 247
    return-object p0

    .line 248
    :pswitch_14
    check-cast p1, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 249
    .line 250
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object p0

    .line 256
    :pswitch_15
    check-cast p1, La/xk9;

    .line 257
    .line 258
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object p0

    .line 261
    :pswitch_16
    check-cast p1, La/wk9;

    .line 262
    .line 263
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 264
    .line 265
    return-object p0

    .line 266
    :pswitch_17
    check-cast p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 267
    .line 268
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    return-object p0

    .line 274
    :pswitch_18
    check-cast p1, La/w6k;

    .line 275
    .line 276
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    sget-object p0, La/qmk;->a:La/zcl;

    .line 280
    .line 281
    const/high16 p0, 0x3f800000    # 1.0f

    .line 282
    .line 283
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 284
    .line 285
    .line 286
    move-result v0

    .line 287
    neg-int v0, v0

    .line 288
    invoke-interface {p1, p0}, La/w6k;->T(F)I

    .line 289
    .line 290
    .line 291
    move-result p0

    .line 292
    neg-int p0, p0

    .line 293
    int-to-long v0, v0

    .line 294
    const/16 p1, 0x20

    .line 295
    .line 296
    shl-long/2addr v0, p1

    .line 297
    int-to-long p0, p0

    .line 298
    const-wide v2, 0xffffffffL

    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    and-long/2addr p0, v2

    .line 304
    or-long/2addr p0, v0

    .line 305
    new-instance v0, La/ikx;

    .line 306
    .line 307
    invoke-direct {v0, p0, p1}, La/ikx;-><init>(J)V

    .line 308
    .line 309
    .line 310
    return-object v0

    .line 311
    :pswitch_19
    check-cast p1, Ljava/lang/Long;

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 317
    .line 318
    return-object p0

    .line 319
    :pswitch_1a
    check-cast p1, La/daq0;

    .line 320
    .line 321
    iget-wide p0, p1, La/daq0;->a:J

    .line 322
    .line 323
    invoke-static {p0, p1}, La/daq0;->c(J)F

    .line 324
    .line 325
    .line 326
    move-result p0

    .line 327
    sget-wide v0, La/qmk;->n:J

    .line 328
    .line 329
    invoke-static {v0, v1}, La/daq0;->c(J)F

    .line 330
    .line 331
    .line 332
    move-result p1

    .line 333
    sub-float/2addr p0, p1

    .line 334
    const-wide v0, 0x100000000L

    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    invoke-static {p0, v0, v1}, La/idm0;->v(FJ)J

    .line 340
    .line 341
    .line 342
    move-result-wide p0

    .line 343
    new-instance v0, La/daq0;

    .line 344
    .line 345
    invoke-direct {v0, p0, p1}, La/daq0;-><init>(J)V

    .line 346
    .line 347
    .line 348
    return-object v0

    .line 349
    :pswitch_1b
    check-cast p1, Ljava/util/Map;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 355
    .line 356
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 357
    .line 358
    .line 359
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 360
    .line 361
    .line 362
    move-result-object p1

    .line 363
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 364
    .line 365
    .line 366
    move-result-object p1

    .line 367
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 368
    .line 369
    .line 370
    move-result v0

    .line 371
    if-eqz v0, :cond_1

    .line 372
    .line 373
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v0, Ljava/util/Map$Entry;

    .line 378
    .line 379
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    instance-of v1, v1, Ljava/lang/Integer;

    .line 384
    .line 385
    if-eqz v1, :cond_0

    .line 386
    .line 387
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 388
    .line 389
    .line 390
    move-result-object v1

    .line 391
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    goto :goto_0

    .line 399
    :cond_1
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 400
    .line 401
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 405
    .line 406
    .line 407
    move-result-object p0

    .line 408
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 413
    .line 414
    .line 415
    move-result v0

    .line 416
    if-eqz v0, :cond_3

    .line 417
    .line 418
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    check-cast v0, Ljava/util/Map$Entry;

    .line 423
    .line 424
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, Ljava/lang/String;

    .line 429
    .line 430
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 431
    .line 432
    .line 433
    move-result-object v1

    .line 434
    if-eqz v1, :cond_2

    .line 435
    .line 436
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v1

    .line 440
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {p1, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    goto :goto_1

    .line 448
    :cond_3
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 449
    .line 450
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    invoke-static {v0}, La/wp20;->a(I)I

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 462
    .line 463
    .line 464
    move-result-object p1

    .line 465
    check-cast p1, Ljava/lang/Iterable;

    .line 466
    .line 467
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 468
    .line 469
    .line 470
    move-result-object p1

    .line 471
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 472
    .line 473
    .line 474
    move-result v0

    .line 475
    if-eqz v0, :cond_4

    .line 476
    .line 477
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    check-cast v0, Ljava/util/Map$Entry;

    .line 482
    .line 483
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    check-cast v1, Ljava/lang/String;

    .line 488
    .line 489
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 490
    .line 491
    .line 492
    move-result-wide v1

    .line 493
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 494
    .line 495
    .line 496
    move-result-object v1

    .line 497
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    goto :goto_2

    .line 505
    :cond_4
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 506
    .line 507
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    invoke-static {v0}, La/wp20;->a(I)I

    .line 512
    .line 513
    .line 514
    move-result v0

    .line 515
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 516
    .line 517
    .line 518
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 519
    .line 520
    .line 521
    move-result-object p0

    .line 522
    check-cast p0, Ljava/lang/Iterable;

    .line 523
    .line 524
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object p0

    .line 528
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v0

    .line 532
    if-eqz v0, :cond_5

    .line 533
    .line 534
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v0

    .line 538
    check-cast v0, Ljava/util/Map$Entry;

    .line 539
    .line 540
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v0

    .line 548
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    check-cast v0, Ljava/lang/Integer;

    .line 552
    .line 553
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 554
    .line 555
    .line 556
    move-result v0

    .line 557
    invoke-static {v0}, La/fbc;->d(I)J

    .line 558
    .line 559
    .line 560
    move-result-wide v2

    .line 561
    new-instance v0, La/y3d;

    .line 562
    .line 563
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 564
    .line 565
    .line 566
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    goto :goto_3

    .line 570
    :cond_5
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 571
    .line 572
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 573
    .line 574
    .line 575
    return-object p0

    .line 576
    :pswitch_1c
    check-cast p1, Ljava/util/Map;

    .line 577
    .line 578
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 582
    .line 583
    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 584
    .line 585
    .line 586
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 587
    .line 588
    .line 589
    move-result-object p1

    .line 590
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 591
    .line 592
    .line 593
    move-result-object p1

    .line 594
    :cond_6
    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 595
    .line 596
    .line 597
    move-result v0

    .line 598
    if-eqz v0, :cond_7

    .line 599
    .line 600
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v0

    .line 604
    check-cast v0, Ljava/util/Map$Entry;

    .line 605
    .line 606
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v1

    .line 610
    instance-of v1, v1, Ljava/lang/Integer;

    .line 611
    .line 612
    if-eqz v1, :cond_6

    .line 613
    .line 614
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v0

    .line 622
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    goto :goto_4

    .line 626
    :cond_7
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 627
    .line 628
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 629
    .line 630
    .line 631
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 632
    .line 633
    .line 634
    move-result-object p0

    .line 635
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 636
    .line 637
    .line 638
    move-result-object p0

    .line 639
    :cond_8
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 640
    .line 641
    .line 642
    move-result v0

    .line 643
    if-eqz v0, :cond_9

    .line 644
    .line 645
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 646
    .line 647
    .line 648
    move-result-object v0

    .line 649
    check-cast v0, Ljava/util/Map$Entry;

    .line 650
    .line 651
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    check-cast v1, Ljava/lang/String;

    .line 656
    .line 657
    invoke-static {v1}, Lkotlin/text/StringsKt;->t0(Ljava/lang/String;)Ljava/lang/Long;

    .line 658
    .line 659
    .line 660
    move-result-object v1

    .line 661
    if-eqz v1, :cond_8

    .line 662
    .line 663
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v0

    .line 671
    invoke-virtual {p1, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    goto :goto_5

    .line 675
    :cond_9
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 676
    .line 677
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 678
    .line 679
    .line 680
    move-result v0

    .line 681
    invoke-static {v0}, La/wp20;->a(I)I

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    invoke-direct {p0, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 689
    .line 690
    .line 691
    move-result-object p1

    .line 692
    check-cast p1, Ljava/lang/Iterable;

    .line 693
    .line 694
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 695
    .line 696
    .line 697
    move-result-object p1

    .line 698
    :goto_6
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 699
    .line 700
    .line 701
    move-result v0

    .line 702
    if-eqz v0, :cond_a

    .line 703
    .line 704
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    check-cast v0, Ljava/util/Map$Entry;

    .line 709
    .line 710
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v1

    .line 714
    check-cast v1, Ljava/lang/String;

    .line 715
    .line 716
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 717
    .line 718
    .line 719
    move-result-wide v1

    .line 720
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object v0

    .line 728
    invoke-interface {p0, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    goto :goto_6

    .line 732
    :cond_a
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 733
    .line 734
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 735
    .line 736
    .line 737
    move-result v0

    .line 738
    invoke-static {v0}, La/wp20;->a(I)I

    .line 739
    .line 740
    .line 741
    move-result v0

    .line 742
    invoke-direct {p1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 743
    .line 744
    .line 745
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    check-cast p0, Ljava/lang/Iterable;

    .line 750
    .line 751
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 752
    .line 753
    .line 754
    move-result-object p0

    .line 755
    :goto_7
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 756
    .line 757
    .line 758
    move-result v0

    .line 759
    if-eqz v0, :cond_b

    .line 760
    .line 761
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    check-cast v0, Ljava/util/Map$Entry;

    .line 766
    .line 767
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 768
    .line 769
    .line 770
    move-result-object v1

    .line 771
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    check-cast v0, Ljava/lang/Integer;

    .line 779
    .line 780
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 781
    .line 782
    .line 783
    move-result v0

    .line 784
    invoke-static {v0}, La/fbc;->d(I)J

    .line 785
    .line 786
    .line 787
    move-result-wide v2

    .line 788
    new-instance v0, La/y3d;

    .line 789
    .line 790
    invoke-direct {v0, v2, v3}, La/y3d;-><init>(J)V

    .line 791
    .line 792
    .line 793
    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    goto :goto_7

    .line 797
    :cond_b
    new-instance p0, Ljava/util/LinkedHashMap;

    .line 798
    .line 799
    invoke-direct {p0, p1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 800
    .line 801
    .line 802
    return-object p0

    .line 803
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
