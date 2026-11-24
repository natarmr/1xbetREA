.class public final synthetic La/d4u0;
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
    iput-byte p1, p0, La/d4u0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/d4u0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte p0, p0, La/d4u0;->a:B

    .line 2
    .line 3
    const-string v0, ""

    .line 4
    .line 5
    const/4 v1, 0x6

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch p0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p0, La/bgv0;->L1:La/wxs0;

    .line 14
    .line 15
    throw v3

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/ClassCastException;

    .line 17
    .line 18
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    :pswitch_0
    check-cast p1, La/uag0;

    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const p0, 0x3f7d70a4    # 0.99f

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0}, La/uag0;->b(F)V

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_1
    check-cast p1, La/hcz;

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    :goto_0
    const/4 p0, 0x3

    .line 42
    if-ge v2, p0, :cond_1

    .line 43
    .line 44
    sget-object v0, La/y0x0;->g:La/ugd;

    .line 45
    .line 46
    invoke-static {p1, v3, v3, v0, p0}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v2, v2, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_2
    check-cast p1, La/cp;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    new-instance p0, La/a8u0;

    .line 61
    .line 62
    const/4 v0, 0x7

    .line 63
    invoke-direct {p0, p1, v0}, La/a8u0;-><init>(La/cp;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_3
    check-cast p1, La/cp;

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    new-instance p0, La/a8u0;

    .line 78
    .line 79
    invoke-direct {p0, p1, v1}, La/a8u0;-><init>(La/cp;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    :pswitch_4
    check-cast p1, La/dqk0;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    instance-of p0, p1, La/bqk0;

    .line 94
    .line 95
    if-eqz p0, :cond_2

    .line 96
    .line 97
    move-object v3, p1

    .line 98
    goto :goto_2

    .line 99
    :cond_2
    instance-of p0, p1, La/cqk0;

    .line 100
    .line 101
    if-eqz p0, :cond_3

    .line 102
    .line 103
    check-cast p1, La/cqk0;

    .line 104
    .line 105
    iget-object p0, p1, La/cqk0;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p0, Ljava/lang/Iterable;

    .line 108
    .line 109
    new-instance v3, Ljava/util/ArrayList;

    .line 110
    .line 111
    const/16 p1, 0xa

    .line 112
    .line 113
    invoke-static {p0, p1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    invoke-direct {v3, p1}, Ljava/util/ArrayList;-><init>(I)V

    .line 118
    .line 119
    .line 120
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result p1

    .line 128
    if-eqz p1, :cond_4

    .line 129
    .line 130
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    check-cast p1, La/ifb;

    .line 135
    .line 136
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 145
    .line 146
    .line 147
    :cond_4
    :goto_2
    return-object v3

    .line 148
    :pswitch_5
    check-cast p1, La/c53;

    .line 149
    .line 150
    sget-object p0, La/ccv0;->Q1:La/uxs0;

    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 153
    .line 154
    .line 155
    const/16 p0, 0xc8

    .line 156
    .line 157
    invoke-static {p0, v2, v3, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    const/4 v0, 0x0

    .line 162
    const/4 v4, 0x2

    .line 163
    invoke-static {p1, v0, v4}, La/kzn;->d(La/cfq;FI)La/pzn;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    invoke-static {p0, v2, v3, v1}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-static {p0, v4}, La/kzn;->e(La/cfq;I)La/alo;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p1, p0}, La/ay3;->e0(La/pzn;La/alo;)La/lie;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :pswitch_6
    check-cast p1, Ljava/lang/Throwable;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 186
    .line 187
    .line 188
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object p0

    .line 191
    :pswitch_7
    check-cast p1, Ljava/lang/Throwable;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 197
    .line 198
    .line 199
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object p0

    .line 202
    :pswitch_8
    check-cast p1, Ljava/lang/Throwable;

    .line 203
    .line 204
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 208
    .line 209
    .line 210
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object p0

    .line 213
    :pswitch_9
    check-cast p1, Ljava/lang/Throwable;

    .line 214
    .line 215
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 219
    .line 220
    .line 221
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 222
    .line 223
    return-object p0

    .line 224
    :pswitch_a
    check-cast p1, La/v870;

    .line 225
    .line 226
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 230
    .line 231
    return-object p0

    .line 232
    :pswitch_b
    check-cast p1, La/cp;

    .line 233
    .line 234
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    new-instance p0, La/pgj0;

    .line 238
    .line 239
    const/16 v0, 0x15

    .line 240
    .line 241
    invoke-direct {p0, p1, p1, v0}, La/pgj0;-><init>(La/cp;La/cp;B)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 245
    .line 246
    .line 247
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 248
    .line 249
    return-object p0

    .line 250
    :pswitch_c
    check-cast p1, La/a0v0;

    .line 251
    .line 252
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    instance-of p0, p1, La/zzu0;

    .line 256
    .line 257
    if-eqz p0, :cond_5

    .line 258
    .line 259
    check-cast p1, La/zzu0;

    .line 260
    .line 261
    iget-object p0, p1, La/zzu0;->b:La/pg;

    .line 262
    .line 263
    new-instance p1, Ljava/lang/StringBuilder;

    .line 264
    .line 265
    const-string v0, "header_"

    .line 266
    .line 267
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    goto :goto_3

    .line 278
    :cond_5
    instance-of p0, p1, La/yzu0;

    .line 279
    .line 280
    if-eqz p0, :cond_6

    .line 281
    .line 282
    check-cast p1, La/yzu0;

    .line 283
    .line 284
    iget-wide p0, p1, La/yzu0;->a:J

    .line 285
    .line 286
    const-string v0, "account_"

    .line 287
    .line 288
    invoke-static {p0, p1, v0}, La/h97;->h(JLjava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v3

    .line 292
    goto :goto_3

    .line 293
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 294
    .line 295
    .line 296
    :goto_3
    return-object v3

    .line 297
    :pswitch_d
    check-cast p1, La/axu0;

    .line 298
    .line 299
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    iget-object p0, p1, La/axu0;->e:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    if-lez v1, :cond_7

    .line 309
    .line 310
    sget-object v0, La/pn40;->a:La/pn40;

    .line 311
    .line 312
    iget-wide v0, p1, La/axu0;->d:D

    .line 313
    .line 314
    sget-object p1, La/p3u0;->c:La/p3u0;

    .line 315
    .line 316
    invoke-static {v0, v1, p0, p1}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    :cond_7
    return-object v0

    .line 321
    :pswitch_e
    check-cast p1, La/axu0;

    .line 322
    .line 323
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 324
    .line 325
    .line 326
    iget-boolean p0, p1, La/axu0;->a:Z

    .line 327
    .line 328
    iget-object v1, p1, La/axu0;->c:Ljava/lang/String;

    .line 329
    .line 330
    if-eqz p0, :cond_8

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 333
    .line 334
    .line 335
    move-result p0

    .line 336
    if-lez p0, :cond_8

    .line 337
    .line 338
    sget-object p0, La/pn40;->a:La/pn40;

    .line 339
    .line 340
    iget-wide p0, p1, La/axu0;->b:D

    .line 341
    .line 342
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 343
    .line 344
    invoke-static {p0, p1, v1, v0}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    :cond_8
    return-object v0

    .line 349
    :pswitch_f
    check-cast p1, La/n1g;

    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    sget-object p0, La/j1g;->d:La/j1g;

    .line 355
    .line 356
    iput-object p0, p1, La/n1g;->d:La/j1g;

    .line 357
    .line 358
    new-instance p0, La/tq2;

    .line 359
    .line 360
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 361
    .line 362
    .line 363
    iput-object p0, p1, La/n1g;->e:La/ms2;

    .line 364
    .line 365
    sget-object p0, La/l1g;->b:La/l1g;

    .line 366
    .line 367
    iput-object p0, p1, La/n1g;->f:La/l1g;

    .line 368
    .line 369
    sget-object p0, La/k1g;->b:La/k1g;

    .line 370
    .line 371
    iput-object p0, p1, La/n1g;->g:La/k1g;

    .line 372
    .line 373
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    return-object p0

    .line 376
    :pswitch_10
    check-cast p1, La/sjd;

    .line 377
    .line 378
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 379
    .line 380
    .line 381
    new-instance p0, La/tpu0;

    .line 382
    .line 383
    invoke-direct {p0, p1}, La/tpu0;-><init>(La/sjd;)V

    .line 384
    .line 385
    .line 386
    return-object p0

    .line 387
    :pswitch_11
    check-cast p1, La/yfu0;

    .line 388
    .line 389
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 390
    .line 391
    .line 392
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object p0

    .line 395
    :pswitch_12
    check-cast p1, Ljava/lang/Integer;

    .line 396
    .line 397
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 401
    .line 402
    return-object p0

    .line 403
    :pswitch_13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_14
    check-cast p1, Ljava/lang/Integer;

    .line 410
    .line 411
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    return-object p0

    .line 417
    :pswitch_15
    check-cast p1, La/ou90;

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
    :pswitch_16
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
    :pswitch_17
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
    :pswitch_18
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
    :pswitch_19
    move-object v0, p1

    .line 459
    check-cast v0, La/fhl;

    .line 460
    .line 461
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    sget-object p0, La/s6t0;->a:La/pz40;

    .line 465
    .line 466
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 467
    .line 468
    .line 469
    move-result-object p0

    .line 470
    iget-object p0, p0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 471
    .line 472
    invoke-virtual {p0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 473
    .line 474
    .line 475
    move-result-wide v1

    .line 476
    const/4 v7, 0x0

    .line 477
    const/16 v8, 0x7c

    .line 478
    .line 479
    const/high16 v3, 0x40800000    # 4.0f

    .line 480
    .line 481
    const-wide/16 v4, 0x0

    .line 482
    .line 483
    const/4 v6, 0x0

    .line 484
    invoke-static/range {v0 .. v8}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V

    .line 485
    .line 486
    .line 487
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 488
    .line 489
    return-object p0

    .line 490
    :pswitch_1a
    check-cast p1, La/p73;

    .line 491
    .line 492
    iget p0, p1, La/p73;->a:F

    .line 493
    .line 494
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    return-object p0

    .line 499
    :pswitch_1b
    check-cast p1, La/s73;

    .line 500
    .line 501
    new-instance p0, La/jge0;

    .line 502
    .line 503
    iget v0, p1, La/s73;->a:F

    .line 504
    .line 505
    iget v1, p1, La/s73;->b:F

    .line 506
    .line 507
    iget v2, p1, La/s73;->c:F

    .line 508
    .line 509
    iget p1, p1, La/s73;->d:F

    .line 510
    .line 511
    invoke-direct {p0, v0, v1, v2, p1}, La/jge0;-><init>(FFFF)V

    .line 512
    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_1c
    check-cast p1, La/jge0;

    .line 516
    .line 517
    new-instance p0, La/s73;

    .line 518
    .line 519
    iget v0, p1, La/jge0;->a:F

    .line 520
    .line 521
    iget v1, p1, La/jge0;->b:F

    .line 522
    .line 523
    iget v2, p1, La/jge0;->c:F

    .line 524
    .line 525
    iget p1, p1, La/jge0;->d:F

    .line 526
    .line 527
    invoke-direct {p0, v0, v1, v2, p1}, La/s73;-><init>(FFFF)V

    .line 528
    .line 529
    .line 530
    return-object p0

    .line 531
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
