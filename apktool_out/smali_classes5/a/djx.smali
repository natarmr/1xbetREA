.class public final synthetic La/djx;
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
    iput-byte p1, p0, La/djx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/djx;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte p0, p0, La/djx;->a:B

    .line 2
    .line 3
    const/16 v0, 0x3a

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x1

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/ou90;

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :pswitch_1
    check-cast p1, La/e7z;

    .line 23
    .line 24
    iput-boolean v3, p1, La/e7z;->g1:Z

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    check-cast p1, La/fns0;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    new-instance v0, La/e4z;

    .line 35
    .line 36
    iget-wide v1, p1, La/fns0;->a:J

    .line 37
    .line 38
    iget-wide v4, p1, La/fns0;->b:J

    .line 39
    .line 40
    iget-boolean v3, p1, La/fns0;->c:Z

    .line 41
    .line 42
    invoke-direct/range {v0 .. v5}, La/e4z;-><init>(JZJ)V

    .line 43
    .line 44
    .line 45
    return-object v0

    .line 46
    :pswitch_3
    check-cast p1, La/k9s;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p0, La/w3z;

    .line 52
    .line 53
    invoke-direct {p0, p1}, La/w3z;-><init>(La/k9s;)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_4
    check-cast p1, La/l9s;

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    new-instance p0, La/a3z;

    .line 63
    .line 64
    invoke-direct {p0, p1}, La/a3z;-><init>(La/l9s;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_5
    move-object v0, p1

    .line 69
    check-cast v0, La/hcz;

    .line 70
    .line 71
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    sget-object p0, La/phu0;->e:La/ugd;

    .line 75
    .line 76
    const/4 p1, 0x3

    .line 77
    invoke-static {v0, v1, v1, p0, p1}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 78
    .line 79
    .line 80
    sget-object v4, La/phu0;->f:La/ugd;

    .line 81
    .line 82
    const/4 v5, 0x6

    .line 83
    const/16 v1, 0xa

    .line 84
    .line 85
    const/4 v2, 0x0

    .line 86
    const/4 v3, 0x0

    .line 87
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 88
    .line 89
    .line 90
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_6
    check-cast p1, La/fzy;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    const-class p0, La/fzy;

    .line 99
    .line 100
    sget-object p1, La/sre0;->a:La/tre0;

    .line 101
    .line 102
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    return-object p0

    .line 107
    :pswitch_7
    check-cast p1, La/ezy;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    const-class p0, La/ezy;

    .line 113
    .line 114
    sget-object p1, La/sre0;->a:La/tre0;

    .line 115
    .line 116
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0

    .line 121
    :pswitch_8
    move-object v0, p1

    .line 122
    check-cast v0, La/hcz;

    .line 123
    .line 124
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    sget-object v4, La/bsr0;->c:La/ugd;

    .line 128
    .line 129
    const/4 v5, 0x6

    .line 130
    const/16 v1, 0xe

    .line 131
    .line 132
    const/4 v2, 0x0

    .line 133
    const/4 v3, 0x0

    .line 134
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 135
    .line 136
    .line 137
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 138
    .line 139
    return-object p0

    .line 140
    :pswitch_9
    move-object v0, p1

    .line 141
    check-cast v0, La/hcz;

    .line 142
    .line 143
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    sget-object v4, La/rsr0;->c:La/ugd;

    .line 147
    .line 148
    const/4 v5, 0x6

    .line 149
    const/16 v1, 0xe

    .line 150
    .line 151
    const/4 v2, 0x0

    .line 152
    const/4 v3, 0x0

    .line 153
    invoke-static/range {v0 .. v5}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_a
    check-cast p1, La/p6t0;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    sget-object p1, La/sre0;->a:La/tre0;

    .line 169
    .line 170
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    return-object p0

    .line 175
    :pswitch_b
    check-cast p1, La/p6t0;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    return-object p0

    .line 185
    :pswitch_c
    check-cast p1, La/jvy;

    .line 186
    .line 187
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    iget-wide p0, p1, La/jvy;->a:J

    .line 191
    .line 192
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    check-cast p1, Ljava/util/Set;

    .line 201
    .line 202
    return-object p1

    .line 203
    :pswitch_e
    check-cast p1, La/w6k;

    .line 204
    .line 205
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const/4 p0, 0x0

    .line 209
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    return-object p0

    .line 214
    :pswitch_f
    check-cast p1, Ljava/util/Map$Entry;

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object p0

    .line 223
    check-cast p0, Ljava/lang/String;

    .line 224
    .line 225
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, La/mcy;

    .line 230
    .line 231
    new-instance v1, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 234
    .line 235
    .line 236
    invoke-static {p0, v1}, La/wsm0;->a(Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object p0

    .line 249
    return-object p0

    .line 250
    :pswitch_10
    check-cast p1, La/cmc;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance p0, La/qgx;

    .line 256
    .line 257
    const/16 v0, 0x1b

    .line 258
    .line 259
    invoke-direct {p0, v0}, La/qgx;-><init>(B)V

    .line 260
    .line 261
    .line 262
    new-instance v0, La/rcy;

    .line 263
    .line 264
    invoke-direct {v0, p0}, La/rcy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 265
    .line 266
    .line 267
    sget-object p0, La/iun;->a:La/iun;

    .line 268
    .line 269
    const-string v1, "JsonPrimitive"

    .line 270
    .line 271
    invoke-virtual {p1, v1, v0, p0}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 272
    .line 273
    .line 274
    new-instance v0, La/qgx;

    .line 275
    .line 276
    const/16 v1, 0x1c

    .line 277
    .line 278
    invoke-direct {v0, v1}, La/qgx;-><init>(B)V

    .line 279
    .line 280
    .line 281
    new-instance v1, La/rcy;

    .line 282
    .line 283
    invoke-direct {v1, v0}, La/rcy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 284
    .line 285
    .line 286
    const-string v0, "JsonNull"

    .line 287
    .line 288
    invoke-virtual {p1, v0, v1, p0}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 289
    .line 290
    .line 291
    new-instance v0, La/qgx;

    .line 292
    .line 293
    const/16 v1, 0x1d

    .line 294
    .line 295
    invoke-direct {v0, v1}, La/qgx;-><init>(B)V

    .line 296
    .line 297
    .line 298
    new-instance v1, La/rcy;

    .line 299
    .line 300
    invoke-direct {v1, v0}, La/rcy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 301
    .line 302
    .line 303
    const-string v0, "JsonLiteral"

    .line 304
    .line 305
    invoke-virtual {p1, v0, v1, p0}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 306
    .line 307
    .line 308
    new-instance v0, La/pcy;

    .line 309
    .line 310
    invoke-direct {v0, v2}, La/pcy;-><init>(B)V

    .line 311
    .line 312
    .line 313
    new-instance v1, La/rcy;

    .line 314
    .line 315
    invoke-direct {v1, v0}, La/rcy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 316
    .line 317
    .line 318
    const-string v0, "JsonObject"

    .line 319
    .line 320
    invoke-virtual {p1, v0, v1, p0}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 321
    .line 322
    .line 323
    new-instance v0, La/pcy;

    .line 324
    .line 325
    invoke-direct {v0, v3}, La/pcy;-><init>(B)V

    .line 326
    .line 327
    .line 328
    new-instance v1, La/rcy;

    .line 329
    .line 330
    invoke-direct {v1, v0}, La/rcy;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 331
    .line 332
    .line 333
    const-string v0, "JsonArray"

    .line 334
    .line 335
    invoke-virtual {p1, v0, v1, p0}, La/cmc;->a(Ljava/lang/String;La/ugi0;Ljava/util/List;)V

    .line 336
    .line 337
    .line 338
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_11
    check-cast p1, La/vay;

    .line 342
    .line 343
    if-eqz p1, :cond_0

    .line 344
    .line 345
    iget p0, p1, La/vay;->a:I

    .line 346
    .line 347
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    :cond_0
    return-object v1

    .line 352
    :pswitch_12
    check-cast p1, La/vay;

    .line 353
    .line 354
    if-eqz p1, :cond_1

    .line 355
    .line 356
    iget p0, p1, La/vay;->a:I

    .line 357
    .line 358
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    :cond_1
    return-object v1

    .line 363
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 364
    .line 365
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 369
    .line 370
    .line 371
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object p0

    .line 374
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 375
    .line 376
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 377
    .line 378
    .line 379
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 380
    .line 381
    .line 382
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 383
    .line 384
    return-object p0

    .line 385
    :pswitch_15
    check-cast p1, La/p6t0;

    .line 386
    .line 387
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    move-result-object p0

    .line 394
    sget-object p1, La/sre0;->a:La/tre0;

    .line 395
    .line 396
    invoke-virtual {p1, p0}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    return-object p0

    .line 401
    :pswitch_16
    check-cast p1, La/p6t0;

    .line 402
    .line 403
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object p0

    .line 410
    return-object p0

    .line 411
    :pswitch_17
    check-cast p1, La/cp;

    .line 412
    .line 413
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    new-instance p0, La/b1w;

    .line 417
    .line 418
    const/16 v0, 0xb

    .line 419
    .line 420
    invoke-direct {p0, p1, v0}, La/b1w;-><init>(La/cp;B)V

    .line 421
    .line 422
    .line 423
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 424
    .line 425
    .line 426
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 427
    .line 428
    return-object p0

    .line 429
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 430
    .line 431
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    sget p0, Lorg/xplatform/cyber/game/core/InterceptTouchRecyclerView;->w2:I

    .line 435
    .line 436
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 437
    .line 438
    return-object p0

    .line 439
    :pswitch_19
    check-cast p1, Ljava/lang/Character;

    .line 440
    .line 441
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 442
    .line 443
    .line 444
    move-result p0

    .line 445
    const/16 p1, 0x30

    .line 446
    .line 447
    if-gt p1, p0, :cond_2

    .line 448
    .line 449
    if-ge p0, v0, :cond_2

    .line 450
    .line 451
    move v2, v3

    .line 452
    :cond_2
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    return-object p0

    .line 457
    :pswitch_1a
    check-cast p1, Ljava/lang/Character;

    .line 458
    .line 459
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 460
    .line 461
    .line 462
    move-result p0

    .line 463
    if-ne p0, v0, :cond_3

    .line 464
    .line 465
    move v2, v3

    .line 466
    :cond_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    return-object p0

    .line 471
    :pswitch_1b
    check-cast p1, Ljava/lang/Character;

    .line 472
    .line 473
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 474
    .line 475
    .line 476
    move-result p0

    .line 477
    if-ne p0, v0, :cond_4

    .line 478
    .line 479
    move v2, v3

    .line 480
    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 481
    .line 482
    .line 483
    move-result-object p0

    .line 484
    return-object p0

    .line 485
    :pswitch_1c
    check-cast p1, Ljava/lang/Character;

    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Character;->charValue()C

    .line 488
    .line 489
    .line 490
    move-result p0

    .line 491
    const/16 p1, 0x54

    .line 492
    .line 493
    if-eq p0, p1, :cond_5

    .line 494
    .line 495
    const/16 p1, 0x74

    .line 496
    .line 497
    if-ne p0, p1, :cond_6

    .line 498
    .line 499
    :cond_5
    move v2, v3

    .line 500
    :cond_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 501
    .line 502
    .line 503
    move-result-object p0

    .line 504
    return-object p0

    .line 505
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
