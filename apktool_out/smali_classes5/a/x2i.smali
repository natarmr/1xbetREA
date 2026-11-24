.class public final synthetic La/x2i;
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
    iput-byte p1, p0, La/x2i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/zrj;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/x2i;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/x2i;->a:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    const/4 v2, 0x1

    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Throwable;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_3
    check-cast p1, La/abi0;

    .line 54
    .line 55
    invoke-static {p1}, La/yai0;->j(La/abi0;)V

    .line 56
    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 59
    .line 60
    return-object p0

    .line 61
    :pswitch_4
    check-cast p1, Ljava/util/List;

    .line 62
    .line 63
    new-instance p0, La/kwj;

    .line 64
    .line 65
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v0, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    check-cast v1, Ljava/lang/Float;

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    new-instance v3, La/awj;

    .line 92
    .line 93
    invoke-direct {v3, p1, v2}, La/awj;-><init>(Ljava/util/List;B)V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, v0, v1, v3}, La/kwj;-><init>(IFLkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    return-object p0

    .line 100
    :pswitch_5
    check-cast p1, Ljava/util/List;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    new-instance p0, La/bwj;

    .line 106
    .line 107
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast v0, Ljava/lang/Integer;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 117
    .line 118
    .line 119
    move-result v0

    .line 120
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v2

    .line 124
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    check-cast v2, Ljava/lang/Float;

    .line 128
    .line 129
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 130
    .line 131
    .line 132
    move-result v2

    .line 133
    new-instance v3, La/awj;

    .line 134
    .line 135
    invoke-direct {v3, p1, v1}, La/awj;-><init>(Ljava/util/List;B)V

    .line 136
    .line 137
    .line 138
    invoke-direct {p0, v0, v2, v3}, La/bwj;-><init>(IFLkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    return-object p0

    .line 142
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 143
    .line 144
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_7
    check-cast p1, La/k0w0;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    new-instance p0, Lorg/xplatform/bethistory/coupon_scanner/presentation/CouponScannerScreen;

    .line 156
    .line 157
    invoke-direct {p0, v1}, Lorg/xplatform/bethistory/coupon_scanner/presentation/CouponScannerScreen;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, La/c8d;

    .line 167
    .line 168
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 169
    .line 170
    new-instance v0, La/v7d;

    .line 171
    .line 172
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 173
    .line 174
    .line 175
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 176
    .line 177
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_8
    check-cast p1, La/k0w0;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    sget-object p0, La/fd10;->b:La/fd10;

    .line 186
    .line 187
    new-instance v0, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;

    .line 188
    .line 189
    invoke-direct {v0, p0}, Lorg/xplatform/lotto/impl/navigation/LottoScreenFactoryImpl$getLottoScreen$1;-><init>(La/fd10;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast p0, La/c8d;

    .line 199
    .line 200
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 201
    .line 202
    new-instance v0, La/v7d;

    .line 203
    .line 204
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 205
    .line 206
    .line 207
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_9
    check-cast p1, La/k0w0;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    new-instance p0, Lorg/xplatform/bethistory/coupon_scanner/presentation/CouponScannerScreen;

    .line 218
    .line 219
    invoke-direct {p0, v2}, Lorg/xplatform/bethistory/coupon_scanner/presentation/CouponScannerScreen;-><init>(I)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p1, p0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    iget-object p0, p0, La/ikt0;->a:Ljava/lang/Object;

    .line 227
    .line 228
    check-cast p0, La/c8d;

    .line 229
    .line 230
    sget-object p1, La/cfx0;->o:La/bjk;

    .line 231
    .line 232
    new-instance v0, La/v7d;

    .line 233
    .line 234
    invoke-direct {v0, v2, p1, p1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 235
    .line 236
    .line 237
    iput-object v0, p0, La/c8d;->a:La/w7d;

    .line 238
    .line 239
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 240
    .line 241
    return-object p0

    .line 242
    :pswitch_a
    check-cast p1, La/k0w0;

    .line 243
    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    sget-object p0, La/o0w0;->a:La/o0w0;

    .line 248
    .line 249
    invoke-virtual {p1, p0}, La/k0w0;->a(La/g1w0;)La/okt0;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    invoke-virtual {p0}, La/okt0;->c()La/t44;

    .line 254
    .line 255
    .line 256
    move-result-object p1

    .line 257
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    new-instance v3, La/bjk;

    .line 261
    .line 262
    invoke-direct {v3, v0, v1, v1, v2}, La/bjk;-><init>(Ljava/lang/String;ZZZ)V

    .line 263
    .line 264
    .line 265
    iput-object v3, p1, La/t44;->a:La/bjk;

    .line 266
    .line 267
    iget-object p1, p0, La/okt0;->a:Ljava/lang/Object;

    .line 268
    .line 269
    check-cast p1, La/c8d;

    .line 270
    .line 271
    invoke-virtual {p0}, La/okt0;->c()La/t44;

    .line 272
    .line 273
    .line 274
    move-result-object p0

    .line 275
    invoke-virtual {p0}, La/t44;->a()La/u7d;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    iput-object p0, p1, La/c8d;->a:La/w7d;

    .line 280
    .line 281
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 282
    .line 283
    return-object p0

    .line 284
    :pswitch_b
    instance-of p0, p1, [Ljava/lang/Object;

    .line 285
    .line 286
    if-eqz p0, :cond_0

    .line 287
    .line 288
    move-object v0, p1

    .line 289
    check-cast v0, [Ljava/lang/Object;

    .line 290
    .line 291
    new-instance v4, La/x2i;

    .line 292
    .line 293
    const/16 p0, 0x11

    .line 294
    .line 295
    invoke-direct {v4, p0}, La/x2i;-><init>(B)V

    .line 296
    .line 297
    .line 298
    const/16 v5, 0x19

    .line 299
    .line 300
    const/4 v1, 0x0

    .line 301
    const-string v2, "["

    .line 302
    .line 303
    const-string v3, "]"

    .line 304
    .line 305
    invoke-static/range {v0 .. v5}, La/tx3;->N([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object p0

    .line 309
    goto :goto_0

    .line 310
    :cond_0
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p0

    .line 314
    :goto_0
    return-object p0

    .line 315
    :pswitch_c
    check-cast p1, La/lhj;

    .line 316
    .line 317
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 318
    .line 319
    .line 320
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object p0

    .line 323
    :pswitch_d
    check-cast p1, La/cp;

    .line 324
    .line 325
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 326
    .line 327
    .line 328
    new-instance p0, La/ok;

    .line 329
    .line 330
    const/16 v0, 0x1c

    .line 331
    .line 332
    invoke-direct {p0, p1, p1, v0}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 333
    .line 334
    .line 335
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 336
    .line 337
    .line 338
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object p0

    .line 341
    :pswitch_e
    check-cast p1, La/c53;

    .line 342
    .line 343
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 344
    .line 345
    .line 346
    sget-object p0, La/ihn;->a:La/zsf;

    .line 347
    .line 348
    const/16 v2, 0xc8

    .line 349
    .line 350
    const/4 v3, 0x2

    .line 351
    invoke-static {v2, v1, p0, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    const/4 v4, 0x0

    .line 356
    invoke-static {v2, v4, v3}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    const/16 v4, 0x12c

    .line 361
    .line 362
    invoke-static {v4, v1, p0, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 363
    .line 364
    .line 365
    move-result-object p0

    .line 366
    invoke-static {p0, v3}, La/kzn;->e(La/cfq;I)La/alo;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    invoke-static {v2, p0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 371
    .line 372
    .line 373
    move-result-object p0

    .line 374
    invoke-static {v0, v3}, La/ay3;->F(La/t4s;I)La/u7k0;

    .line 375
    .line 376
    .line 377
    move-result-object v0

    .line 378
    invoke-interface {p1, p0, v0}, La/c53;->a(La/lie;La/u7k0;)La/lie;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    return-object p0

    .line 383
    :pswitch_f
    check-cast p1, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 384
    .line 385
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object p0

    .line 391
    :pswitch_10
    check-cast p1, Ljava/util/Map$Entry;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    check-cast p0, Ljava/lang/String;

    .line 401
    .line 402
    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object p1

    .line 406
    instance-of v0, p1, [Ljava/lang/Object;

    .line 407
    .line 408
    if-eqz v0, :cond_1

    .line 409
    .line 410
    check-cast p1, [Ljava/lang/Object;

    .line 411
    .line 412
    invoke-static {p1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object p1

    .line 416
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 420
    .line 421
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 425
    .line 426
    .line 427
    const-string p0, " : "

    .line 428
    .line 429
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 430
    .line 431
    .line 432
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    return-object p0

    .line 440
    :pswitch_11
    check-cast p1, La/hcz;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    :goto_1
    const/16 p0, 0x28

    .line 446
    .line 447
    if-ge v1, p0, :cond_2

    .line 448
    .line 449
    new-instance p0, La/cl2;

    .line 450
    .line 451
    invoke-direct {p0, v1, v2}, La/cl2;-><init>(IB)V

    .line 452
    .line 453
    .line 454
    new-instance v3, La/ugd;

    .line 455
    .line 456
    const v4, 0x2246c9f6

    .line 457
    .line 458
    .line 459
    invoke-direct {v3, v4, v2, p0}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 460
    .line 461
    .line 462
    const/4 p0, 0x3

    .line 463
    invoke-static {p1, v0, v0, v3, p0}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 464
    .line 465
    .line 466
    add-int/lit8 v1, v1, 0x1

    .line 467
    .line 468
    goto :goto_1

    .line 469
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 470
    .line 471
    return-object p0

    .line 472
    :pswitch_12
    check-cast p1, Ljava/lang/Throwable;

    .line 473
    .line 474
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 478
    .line 479
    .line 480
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 481
    .line 482
    return-object p0

    .line 483
    :pswitch_13
    check-cast p1, Ljava/lang/Throwable;

    .line 484
    .line 485
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 489
    .line 490
    .line 491
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object p0

    .line 494
    :pswitch_14
    check-cast p1, Ljava/lang/Throwable;

    .line 495
    .line 496
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 497
    .line 498
    .line 499
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 500
    .line 501
    .line 502
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    return-object p0

    .line 505
    :pswitch_15
    check-cast p1, Ljava/lang/Throwable;

    .line 506
    .line 507
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 511
    .line 512
    .line 513
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 514
    .line 515
    return-object p0

    .line 516
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 517
    .line 518
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 522
    .line 523
    .line 524
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 525
    .line 526
    return-object p0

    .line 527
    :pswitch_17
    check-cast p1, Ljava/lang/Integer;

    .line 528
    .line 529
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 530
    .line 531
    .line 532
    move-result p0

    .line 533
    new-instance v0, La/mdm;

    .line 534
    .line 535
    sget-object p1, La/pb10;->c:La/xuz;

    .line 536
    .line 537
    sget-object v1, La/pb10;->g:La/pb10;

    .line 538
    .line 539
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 540
    .line 541
    .line 542
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    const-wide/16 v11, 0x0

    .line 547
    .line 548
    const/16 v13, 0x25e

    .line 549
    .line 550
    const/4 v2, 0x0

    .line 551
    const/4 v3, 0x0

    .line 552
    const/4 v4, 0x0

    .line 553
    const/4 v5, 0x0

    .line 554
    const v6, 0x7f1307c4

    .line 555
    .line 556
    .line 557
    const/4 v7, 0x0

    .line 558
    const v8, 0x7f131690

    .line 559
    .line 560
    .line 561
    const-wide/16 v9, 0x2710

    .line 562
    .line 563
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 564
    .line 565
    .line 566
    return-object v0

    .line 567
    :pswitch_18
    check-cast p1, Ljava/lang/Throwable;

    .line 568
    .line 569
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 573
    .line 574
    .line 575
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 576
    .line 577
    return-object p0

    .line 578
    :pswitch_19
    check-cast p1, Ljava/lang/Throwable;

    .line 579
    .line 580
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 584
    .line 585
    .line 586
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object p0

    .line 589
    :pswitch_1a
    check-cast p1, Ljava/lang/Throwable;

    .line 590
    .line 591
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 595
    .line 596
    .line 597
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object p0

    .line 600
    :pswitch_1b
    check-cast p1, Ljava/lang/Boolean;

    .line 601
    .line 602
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    return-object p0

    .line 608
    :pswitch_1c
    check-cast p1, La/abi0;

    .line 609
    .line 610
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 611
    .line 612
    .line 613
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 614
    .line 615
    return-object p0

    .line 616
    nop

    .line 617
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
