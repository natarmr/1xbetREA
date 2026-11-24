.class public final synthetic La/mpk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/p92;


# direct methods
.method public synthetic constructor <init>(La/p92;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mpk0;->a:B

    iput-object p1, p0, La/mpk0;->b:La/p92;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/mpk0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    iget-object p0, p0, La/mpk0;->b:La/p92;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance p1, La/owk0;

    .line 17
    .line 18
    iget-object v0, p0, La/p92;->e:La/n0o0;

    .line 19
    .line 20
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    check-cast v0, La/fee;

    .line 25
    .line 26
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Ljava/lang/String;

    .line 31
    .line 32
    iget-object p0, p0, La/p92;->i:La/n0o0;

    .line 33
    .line 34
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/fee;

    .line 39
    .line 40
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, La/vnq0;

    .line 45
    .line 46
    if-eqz p0, :cond_0

    .line 47
    .line 48
    iget-object v3, p0, La/vnq0;->a:Ljava/lang/String;

    .line 49
    .line 50
    :cond_0
    invoke-direct {p1, v0, v3}, La/owk0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    return-object p1

    .line 54
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    new-instance v0, La/z1d;

    .line 60
    .line 61
    iget-object p1, p0, La/p92;->f:La/n0o0;

    .line 62
    .line 63
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    check-cast p1, La/fee;

    .line 68
    .line 69
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    move-object v1, p1

    .line 74
    check-cast v1, Ljava/lang/String;

    .line 75
    .line 76
    iget-object p1, p0, La/p92;->g:La/n0o0;

    .line 77
    .line 78
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, La/fee;

    .line 83
    .line 84
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    move-object v2, p1

    .line 89
    check-cast v2, Ljava/lang/String;

    .line 90
    .line 91
    iget-object p1, p0, La/p92;->h:La/n0o0;

    .line 92
    .line 93
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    check-cast p1, La/fee;

    .line 98
    .line 99
    invoke-virtual {p1}, La/fee;->c()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    move-object v3, p1

    .line 104
    check-cast v3, Ljava/lang/String;

    .line 105
    .line 106
    iget-object p1, p0, La/p92;->d:La/n0o0;

    .line 107
    .line 108
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    move-object v4, p1

    .line 113
    check-cast v4, La/ohk;

    .line 114
    .line 115
    iget-object p0, p0, La/p92;->c:La/n0o0;

    .line 116
    .line 117
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    invoke-direct/range {v0 .. v5}, La/z1d;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/ohk;I)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 132
    .line 133
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance p1, La/wnk0;

    .line 137
    .line 138
    iget-object v0, p0, La/p92;->e:La/n0o0;

    .line 139
    .line 140
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    check-cast v0, La/fee;

    .line 145
    .line 146
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    iget-object v1, p0, La/p92;->d:La/n0o0;

    .line 153
    .line 154
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    check-cast v1, La/ohk;

    .line 159
    .line 160
    iget-object p0, p0, La/p92;->i:La/n0o0;

    .line 161
    .line 162
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    check-cast p0, La/fee;

    .line 167
    .line 168
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    check-cast p0, La/vnq0;

    .line 173
    .line 174
    invoke-direct {p1, v0, v1, p0}, La/wnk0;-><init>(Ljava/lang/String;La/ohk;La/vnq0;)V

    .line 175
    .line 176
    .line 177
    return-object p1

    .line 178
    :pswitch_2
    check-cast p1, La/lwk0;

    .line 179
    .line 180
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, La/p92;->b:La/ctf0;

    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object v0, p1, La/lwk0;->b:Ljava/util/List;

    .line 189
    .line 190
    iget-object v4, p1, La/lwk0;->a:Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 191
    .line 192
    invoke-interface {v0, v4}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 193
    .line 194
    .line 195
    move-result v4

    .line 196
    new-instance v5, Ljava/util/ArrayList;

    .line 197
    .line 198
    const/16 v6, 0xa

    .line 199
    .line 200
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 201
    .line 202
    .line 203
    move-result v6

    .line 204
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 205
    .line 206
    .line 207
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 212
    .line 213
    .line 214
    move-result v6

    .line 215
    if-eqz v6, :cond_5

    .line 216
    .line 217
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    check-cast v6, Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 222
    .line 223
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 227
    .line 228
    .line 229
    move-result v6

    .line 230
    if-eqz v6, :cond_4

    .line 231
    .line 232
    if-eq v6, v2, :cond_3

    .line 233
    .line 234
    const/4 v7, 0x2

    .line 235
    if-eq v6, v7, :cond_2

    .line 236
    .line 237
    const/4 v7, 0x3

    .line 238
    if-ne v6, v7, :cond_1

    .line 239
    .line 240
    const v6, 0x7f131643

    .line 241
    .line 242
    .line 243
    goto :goto_1

    .line 244
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 245
    .line 246
    .line 247
    goto :goto_2

    .line 248
    :cond_2
    const v6, 0x7f131388

    .line 249
    .line 250
    .line 251
    goto :goto_1

    .line 252
    :cond_3
    const v6, 0x7f131329    # 1.95496E38f

    .line 253
    .line 254
    .line 255
    goto :goto_1

    .line 256
    :cond_4
    const v6, 0x7f1311b6

    .line 257
    .line 258
    .line 259
    :goto_1
    new-instance v7, La/yvh0;

    .line 260
    .line 261
    new-array v8, v1, [Ljava/lang/Object;

    .line 262
    .line 263
    iget-object v9, p0, La/ctf0;->b:La/lsm0;

    .line 264
    .line 265
    invoke-static {v8, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v8

    .line 269
    invoke-virtual {v9, v6, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    sget-object v8, La/bwh0;->a:La/bwh0;

    .line 274
    .line 275
    invoke-direct {v7, v6, v8}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    goto :goto_0

    .line 282
    :cond_5
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    iget-object p1, p1, La/lwk0;->c:La/dxh0;

    .line 287
    .line 288
    new-instance v3, La/mwk0;

    .line 289
    .line 290
    invoke-direct {v3, v4, p0, p1}, La/mwk0;-><init>(ILa/a4x;La/dxh0;)V

    .line 291
    .line 292
    .line 293
    :goto_2
    return-object v3

    .line 294
    :pswitch_3
    check-cast p1, La/ynq0;

    .line 295
    .line 296
    iget-wide v4, p1, La/ynq0;->a:J

    .line 297
    .line 298
    iget-object p0, p0, La/p92;->b:La/ctf0;

    .line 299
    .line 300
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-static {v4, v5}, La/ynq0;->e(J)J

    .line 304
    .line 305
    .line 306
    move-result-wide v4

    .line 307
    const-wide/16 v6, 0x0

    .line 308
    .line 309
    cmp-long p1, v4, v6

    .line 310
    .line 311
    if-lez p1, :cond_b

    .line 312
    .line 313
    new-instance p1, Ljava/lang/StringBuilder;

    .line 314
    .line 315
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 316
    .line 317
    .line 318
    const-wide/32 v8, 0x5265c00

    .line 319
    .line 320
    .line 321
    div-long v8, v4, v8

    .line 322
    .line 323
    cmp-long v0, v8, v6

    .line 324
    .line 325
    if-lez v0, :cond_6

    .line 326
    .line 327
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    iget-object v10, p0, La/ctf0;->b:La/lsm0;

    .line 336
    .line 337
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    const v11, 0x7f130686

    .line 342
    .line 343
    .line 344
    invoke-virtual {v10, v11, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    :cond_6
    sget-object v0, La/bfn;->h:La/bfn;

    .line 352
    .line 353
    invoke-static {v8, v9, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 354
    .line 355
    .line 356
    move-result-wide v8

    .line 357
    invoke-static {v8, v9}, La/wen;->e(J)J

    .line 358
    .line 359
    .line 360
    move-result-wide v8

    .line 361
    sub-long/2addr v4, v8

    .line 362
    const-wide/32 v8, 0x36ee80

    .line 363
    .line 364
    .line 365
    div-long v8, v4, v8

    .line 366
    .line 367
    cmp-long v0, v8, v6

    .line 368
    .line 369
    const-string v10, " "

    .line 370
    .line 371
    if-lez v0, :cond_8

    .line 372
    .line 373
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 374
    .line 375
    .line 376
    move-result v0

    .line 377
    if-lez v0, :cond_7

    .line 378
    .line 379
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 380
    .line 381
    .line 382
    :cond_7
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 383
    .line 384
    .line 385
    move-result-object v0

    .line 386
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    iget-object v11, p0, La/ctf0;->b:La/lsm0;

    .line 391
    .line 392
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    const v12, 0x7f130b06

    .line 397
    .line 398
    .line 399
    invoke-virtual {v11, v12, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v0

    .line 403
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 404
    .line 405
    .line 406
    :cond_8
    sget-object v0, La/bfn;->g:La/bfn;

    .line 407
    .line 408
    invoke-static {v8, v9, v0}, La/ibc;->w0(JLa/bfn;)J

    .line 409
    .line 410
    .line 411
    move-result-wide v8

    .line 412
    invoke-static {v8, v9}, La/wen;->e(J)J

    .line 413
    .line 414
    .line 415
    move-result-wide v8

    .line 416
    sub-long/2addr v4, v8

    .line 417
    const-wide/32 v8, 0xea60

    .line 418
    .line 419
    .line 420
    div-long/2addr v4, v8

    .line 421
    cmp-long v0, v4, v6

    .line 422
    .line 423
    if-lez v0, :cond_a

    .line 424
    .line 425
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 426
    .line 427
    .line 428
    move-result v0

    .line 429
    if-lez v0, :cond_9

    .line 430
    .line 431
    invoke-virtual {p1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    :cond_9
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    iget-object v4, p0, La/ctf0;->b:La/lsm0;

    .line 443
    .line 444
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v0

    .line 448
    const v2, 0x7f1310cc

    .line 449
    .line 450
    .line 451
    invoke-virtual {v4, v2, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    :cond_a
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->length()I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    if-lez v0, :cond_b

    .line 463
    .line 464
    new-instance v3, La/vnq0;

    .line 465
    .line 466
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 467
    .line 468
    .line 469
    move-result-object p1

    .line 470
    new-array v0, v1, [Ljava/lang/Object;

    .line 471
    .line 472
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 473
    .line 474
    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    const v1, 0x7f1315a6

    .line 479
    .line 480
    .line 481
    invoke-virtual {p0, v1, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object p0

    .line 485
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 486
    .line 487
    invoke-virtual {p0, v0}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 488
    .line 489
    .line 490
    move-result-object p0

    .line 491
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-direct {v3, p1, p0}, La/vnq0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 495
    .line 496
    .line 497
    :cond_b
    return-object v3

    .line 498
    nop

    .line 499
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
