.class public final synthetic La/rpa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rpa0;->a:B

    iput-object p1, p0, La/rpa0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/rpa0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xb

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, 0x6

    .line 7
    const-string v4, "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789"

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object p0, p0, La/rpa0;->b:Lkotlin/jvm/functions/Function1;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast p1, Ljava/lang/Long;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    new-instance p1, La/nrd0;

    .line 23
    .line 24
    invoke-direct {p1, v0, v1}, La/nrd0;-><init>(J)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    new-instance v0, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :goto_0
    if-ge v5, v1, :cond_1

    .line 48
    .line 49
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    invoke-static {v4, v2}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 60
    .line 61
    .line 62
    :cond_0
    add-int/lit8 v5, v5, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    new-instance v0, Ljava/lang/StringBuilder;

    .line 81
    .line 82
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    :goto_1
    if-ge v5, v1, :cond_3

    .line 90
    .line 91
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    invoke-static {v4, v2}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_2

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 102
    .line 103
    .line 104
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_2
    check-cast p1, Ljava/lang/String;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    new-instance v0, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    :goto_2
    if-ge v5, v1, :cond_5

    .line 132
    .line 133
    invoke-virtual {p1, v5}, Ljava/lang/String;->charAt(I)C

    .line 134
    .line 135
    .line 136
    move-result v2

    .line 137
    invoke-static {v4, v2}, Lkotlin/text/StringsKt;->P(Ljava/lang/CharSequence;C)Z

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-eqz v3, :cond_4

    .line 142
    .line 143
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 144
    .line 145
    .line 146
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 147
    .line 148
    goto :goto_2

    .line 149
    :cond_5
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_3
    check-cast p1, La/cp;

    .line 160
    .line 161
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 165
    .line 166
    check-cast v0, La/xtx;

    .line 167
    .line 168
    iget-object v0, v0, La/xtx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    new-instance v1, La/o7x;

    .line 174
    .line 175
    invoke-direct {v1, p0, p1, v3}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 176
    .line 177
    .line 178
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 179
    .line 180
    .line 181
    new-instance p0, La/ui80;

    .line 182
    .line 183
    const/16 v0, 0xe

    .line 184
    .line 185
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 189
    .line 190
    .line 191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 192
    .line 193
    return-object p0

    .line 194
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 197
    .line 198
    .line 199
    move-result p1

    .line 200
    if-nez p1, :cond_6

    .line 201
    .line 202
    sget-object p1, La/qgc0;->a:La/qgc0;

    .line 203
    .line 204
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_5
    check-cast p1, Ljava/lang/Integer;

    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 213
    .line 214
    .line 215
    move-result p1

    .line 216
    new-instance v0, La/rgc0;

    .line 217
    .line 218
    invoke-direct {v0, p1}, La/rgc0;-><init>(I)V

    .line 219
    .line 220
    .line 221
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object p0

    .line 227
    :pswitch_6
    check-cast p1, Ljava/lang/Long;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 230
    .line 231
    .line 232
    move-result-wide v0

    .line 233
    new-instance p1, La/tdc0;

    .line 234
    .line 235
    invoke-direct {p1, v0, v1}, La/tdc0;-><init>(J)V

    .line 236
    .line 237
    .line 238
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object p0

    .line 244
    :pswitch_7
    check-cast p1, Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    new-instance v0, La/g9c0;

    .line 250
    .line 251
    invoke-direct {v0, p1}, La/g9c0;-><init>(Ljava/lang/String;)V

    .line 252
    .line 253
    .line 254
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    return-object p0

    .line 260
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 263
    .line 264
    .line 265
    new-instance v0, La/l420;

    .line 266
    .line 267
    invoke-direct {v0, p1}, La/l420;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_9
    check-cast p1, Ljava/lang/String;

    .line 277
    .line 278
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    .line 280
    .line 281
    new-instance v0, La/l420;

    .line 282
    .line 283
    invoke-direct {v0, p1}, La/l420;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 290
    .line 291
    return-object p0

    .line 292
    :pswitch_a
    check-cast p1, La/cp;

    .line 293
    .line 294
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 298
    .line 299
    check-cast v0, La/j2k;

    .line 300
    .line 301
    iget-object v0, v0, La/j2k;->b:Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;

    .line 302
    .line 303
    new-instance v3, La/ru80;

    .line 304
    .line 305
    invoke-direct {v3, p0, v2}, La/ru80;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0, v3}, Lorg/xplatform/promo/impl/settings/presentation/components/PromoAdditionalCardCollection;->setOnItemClickListener(Lkotlin/jvm/functions/Function2;)V

    .line 309
    .line 310
    .line 311
    new-instance p0, La/ctv;

    .line 312
    .line 313
    invoke-direct {p0, p1, p1, v1}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 317
    .line 318
    .line 319
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 320
    .line 321
    return-object p0

    .line 322
    :pswitch_b
    check-cast p1, La/jtl;

    .line 323
    .line 324
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    sget-object p1, La/i0c0;->a:La/i0c0;

    .line 328
    .line 329
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 333
    .line 334
    return-object p0

    .line 335
    :pswitch_c
    check-cast p1, La/nd50;

    .line 336
    .line 337
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 338
    .line 339
    .line 340
    new-instance v0, La/r0c0;

    .line 341
    .line 342
    invoke-direct {v0, p1}, La/r0c0;-><init>(La/nd50;)V

    .line 343
    .line 344
    .line 345
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object p0

    .line 351
    :pswitch_d
    check-cast p1, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result p1

    .line 357
    new-instance v0, La/eu30;

    .line 358
    .line 359
    invoke-direct {v0, p1}, La/eu30;-><init>(I)V

    .line 360
    .line 361
    .line 362
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 366
    .line 367
    return-object p0

    .line 368
    :pswitch_e
    check-cast p1, La/jtl;

    .line 369
    .line 370
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    sget-object v0, La/sh00;->k:La/sh00;

    .line 374
    .line 375
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result p1

    .line 379
    if-eqz p1, :cond_7

    .line 380
    .line 381
    sget-object p1, La/cob0;->a:La/cob0;

    .line 382
    .line 383
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object p0

    .line 389
    :pswitch_f
    check-cast p1, Ljava/lang/Long;

    .line 390
    .line 391
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 392
    .line 393
    .line 394
    move-result-wide v2

    .line 395
    new-instance p1, La/i11;

    .line 396
    .line 397
    invoke-direct {p1, v1, v2, v3, p0}, La/i11;-><init>(BJLkotlin/jvm/functions/Function1;)V

    .line 398
    .line 399
    .line 400
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 401
    .line 402
    invoke-static {p0, p1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 403
    .line 404
    .line 405
    move-result-object p0

    .line 406
    invoke-virtual {p0}, La/bjj;->a()V

    .line 407
    .line 408
    .line 409
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 410
    .line 411
    return-object p0

    .line 412
    :pswitch_10
    check-cast p1, La/cvl;

    .line 413
    .line 414
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    new-instance v0, La/xul;

    .line 418
    .line 419
    invoke-direct {v0, p0, p1, v6}, La/xul;-><init>(Lkotlin/jvm/functions/Function1;La/cvl;B)V

    .line 420
    .line 421
    .line 422
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 423
    .line 424
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 425
    .line 426
    .line 427
    move-result-object p0

    .line 428
    invoke-virtual {p0}, La/bjj;->a()V

    .line 429
    .line 430
    .line 431
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 432
    .line 433
    return-object p0

    .line 434
    :pswitch_11
    move-object v0, p1

    .line 435
    check-cast v0, La/j6z;

    .line 436
    .line 437
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    const/4 p1, -0x2

    .line 441
    invoke-static {p1}, La/f7k;->M(I)I

    .line 442
    .line 443
    .line 444
    move-result p1

    .line 445
    int-to-float v2, p1

    .line 446
    invoke-static {v3}, La/f7k;->M(I)I

    .line 447
    .line 448
    .line 449
    move-result p1

    .line 450
    int-to-float v1, p1

    .line 451
    const/16 v5, 0x168

    .line 452
    .line 453
    move v3, v1

    .line 454
    move v4, v2

    .line 455
    invoke-static/range {v0 .. v5}, La/uzb;->E0(La/j6z;FFFFI)La/egd;

    .line 456
    .line 457
    .line 458
    move-result-object p1

    .line 459
    new-instance v0, La/lxa0;

    .line 460
    .line 461
    new-instance v1, La/wkb0;

    .line 462
    .line 463
    invoke-direct {v1, p1}, La/wkb0;-><init>(La/egd;)V

    .line 464
    .line 465
    .line 466
    invoke-direct {v0, v1}, La/lxa0;-><init>(La/wkb0;)V

    .line 467
    .line 468
    .line 469
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 473
    .line 474
    return-object p0

    .line 475
    :pswitch_12
    check-cast p1, La/wlm;

    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    sget-object v0, La/ulm;->a:La/ulm;

    .line 481
    .line 482
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    move-result v0

    .line 486
    if-eqz v0, :cond_8

    .line 487
    .line 488
    sget-object p1, La/sxa0;->a:La/sxa0;

    .line 489
    .line 490
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    goto :goto_3

    .line 494
    :cond_8
    sget-object v0, La/vlm;->a:La/vlm;

    .line 495
    .line 496
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 497
    .line 498
    .line 499
    move-result p1

    .line 500
    if-eqz p1, :cond_9

    .line 501
    .line 502
    sget-object p1, La/fya0;->a:La/fya0;

    .line 503
    .line 504
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    goto :goto_4

    .line 510
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 511
    .line 512
    .line 513
    const/4 p0, 0x0

    .line 514
    :goto_4
    return-object p0

    .line 515
    :pswitch_13
    check-cast p1, La/chq0;

    .line 516
    .line 517
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v0, La/iqa0;

    .line 521
    .line 522
    invoke-direct {v0, p1}, La/iqa0;-><init>(La/chq0;)V

    .line 523
    .line 524
    .line 525
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    return-object p0

    .line 531
    :pswitch_14
    check-cast p1, La/kim;

    .line 532
    .line 533
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 534
    .line 535
    .line 536
    instance-of v0, p1, La/eim;

    .line 537
    .line 538
    if-eqz v0, :cond_a

    .line 539
    .line 540
    sget-object p1, La/cqa0;->a:La/cqa0;

    .line 541
    .line 542
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    goto :goto_5

    .line 546
    :cond_a
    instance-of v0, p1, La/fim;

    .line 547
    .line 548
    if-eqz v0, :cond_e

    .line 549
    .line 550
    check-cast p1, La/fim;

    .line 551
    .line 552
    iget p1, p1, La/fim;->a:I

    .line 553
    .line 554
    if-eqz p1, :cond_d

    .line 555
    .line 556
    const/4 v0, 0x3

    .line 557
    if-eq p1, v0, :cond_c

    .line 558
    .line 559
    const/4 v0, 0x4

    .line 560
    if-eq p1, v0, :cond_b

    .line 561
    .line 562
    goto :goto_5

    .line 563
    :cond_b
    sget-object p1, La/hqa0;->a:La/hqa0;

    .line 564
    .line 565
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    goto :goto_5

    .line 569
    :cond_c
    sget-object p1, La/fqa0;->a:La/fqa0;

    .line 570
    .line 571
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    goto :goto_5

    .line 575
    :cond_d
    sget-object p1, La/gqa0;->a:La/gqa0;

    .line 576
    .line 577
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    goto :goto_5

    .line 581
    :cond_e
    instance-of v0, p1, La/iim;

    .line 582
    .line 583
    if-eqz v0, :cond_f

    .line 584
    .line 585
    new-instance v0, La/kqa0;

    .line 586
    .line 587
    check-cast p1, La/iim;

    .line 588
    .line 589
    iget-object p1, p1, La/iim;->a:Ljava/lang/String;

    .line 590
    .line 591
    invoke-direct {v0, p1}, La/kqa0;-><init>(Ljava/lang/String;)V

    .line 592
    .line 593
    .line 594
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    :cond_f
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object p0

    .line 600
    :pswitch_15
    check-cast p1, La/cp;

    .line 601
    .line 602
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 606
    .line 607
    check-cast v0, La/dux;

    .line 608
    .line 609
    iget-object v0, v0, La/dux;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 610
    .line 611
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    new-instance v1, La/o7x;

    .line 615
    .line 616
    invoke-direct {v1, p0, p1, v2}, La/o7x;-><init>(Lkotlin/jvm/functions/Function1;La/cp;B)V

    .line 617
    .line 618
    .line 619
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 620
    .line 621
    .line 622
    new-instance p0, La/ui80;

    .line 623
    .line 624
    const/16 v0, 0x9

    .line 625
    .line 626
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 627
    .line 628
    .line 629
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 630
    .line 631
    .line 632
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 633
    .line 634
    return-object p0

    .line 635
    :pswitch_16
    check-cast p1, La/wgl0;

    .line 636
    .line 637
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 638
    .line 639
    .line 640
    instance-of v0, p1, La/vgl0;

    .line 641
    .line 642
    if-eqz v0, :cond_10

    .line 643
    .line 644
    new-instance v0, La/tra0;

    .line 645
    .line 646
    check-cast p1, La/vgl0;

    .line 647
    .line 648
    iget-object p1, p1, La/vgl0;->a:La/xgl0;

    .line 649
    .line 650
    invoke-direct {v0, p1}, La/tra0;-><init>(La/xgl0;)V

    .line 651
    .line 652
    .line 653
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 657
    .line 658
    return-object p0

    .line 659
    :pswitch_17
    check-cast p1, Ljava/lang/Boolean;

    .line 660
    .line 661
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 662
    .line 663
    .line 664
    move-result p1

    .line 665
    new-instance v0, La/ura0;

    .line 666
    .line 667
    invoke-direct {v0, p1}, La/ura0;-><init>(Z)V

    .line 668
    .line 669
    .line 670
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 671
    .line 672
    .line 673
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 674
    .line 675
    return-object p0

    .line 676
    :pswitch_18
    check-cast p1, Ljava/lang/Integer;

    .line 677
    .line 678
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 679
    .line 680
    .line 681
    move-result p1

    .line 682
    if-eq p1, v6, :cond_12

    .line 683
    .line 684
    const/4 v0, 0x2

    .line 685
    if-eq p1, v0, :cond_11

    .line 686
    .line 687
    goto :goto_6

    .line 688
    :cond_11
    sget-object p1, La/wra0;->a:La/wra0;

    .line 689
    .line 690
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    goto :goto_6

    .line 694
    :cond_12
    sget-object p1, La/xra0;->a:La/xra0;

    .line 695
    .line 696
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 697
    .line 698
    .line 699
    :goto_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 700
    .line 701
    return-object p0

    .line 702
    :pswitch_19
    check-cast p1, La/xgl0;

    .line 703
    .line 704
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    new-instance v0, La/vra0;

    .line 708
    .line 709
    invoke-direct {v0, p1}, La/vra0;-><init>(La/xgl0;)V

    .line 710
    .line 711
    .line 712
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 716
    .line 717
    return-object p0

    .line 718
    :pswitch_1a
    check-cast p1, La/hcz;

    .line 719
    .line 720
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 721
    .line 722
    .line 723
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 724
    .line 725
    .line 726
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 727
    .line 728
    return-object p0

    .line 729
    :pswitch_1b
    check-cast p1, La/jtl;

    .line 730
    .line 731
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    sget-object v0, La/rk;->y:La/rk;

    .line 735
    .line 736
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    if-eqz v0, :cond_13

    .line 741
    .line 742
    sget-object p1, La/qqa0;->a:La/qqa0;

    .line 743
    .line 744
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 745
    .line 746
    .line 747
    goto :goto_7

    .line 748
    :cond_13
    sget-object v0, La/rk;->x:La/rk;

    .line 749
    .line 750
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result p1

    .line 754
    if-eqz p1, :cond_14

    .line 755
    .line 756
    sget-object p1, La/eqa0;->a:La/eqa0;

    .line 757
    .line 758
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    :cond_14
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 762
    .line 763
    return-object p0

    .line 764
    :pswitch_1c
    check-cast p1, Ljava/lang/Long;

    .line 765
    .line 766
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 767
    .line 768
    .line 769
    move-result-wide v0

    .line 770
    new-instance p1, La/g3f0;

    .line 771
    .line 772
    sget-object v2, La/xpa0;->b:La/rl70;

    .line 773
    .line 774
    long-to-int v0, v0

    .line 775
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    sget-object v1, La/xpa0;->c:Ljava/util/LinkedHashMap;

    .line 779
    .line 780
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 781
    .line 782
    .line 783
    move-result-object v0

    .line 784
    invoke-virtual {v1, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 785
    .line 786
    .line 787
    move-result-object v0

    .line 788
    check-cast v0, La/xpa0;

    .line 789
    .line 790
    if-nez v0, :cond_15

    .line 791
    .line 792
    sget-object v0, La/xpa0;->e:La/xpa0;

    .line 793
    .line 794
    :cond_15
    invoke-direct {p1, v0}, La/g3f0;-><init>(La/xpa0;)V

    .line 795
    .line 796
    .line 797
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

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
