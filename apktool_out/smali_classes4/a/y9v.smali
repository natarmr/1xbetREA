.class public final synthetic La/y9v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/y9v;->a:B

    iput-object p1, p0, La/y9v;->b:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/y9v;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/high16 v2, 0x3f000000    # 0.5f

    .line 5
    .line 6
    const/16 v3, 0x20

    .line 7
    .line 8
    const-wide v4, 0xffffffffL

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    iget-object p0, p0, La/y9v;->b:La/pz40;

    .line 15
    .line 16
    packed-switch v0, :pswitch_data_0

    .line 17
    .line 18
    .line 19
    check-cast p1, La/iqq;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, La/lz3;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    instance-of p1, p1, La/kz3;

    .line 44
    .line 45
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object p0

    .line 55
    :pswitch_1
    check-cast p1, Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_2
    check-cast p1, Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    new-instance v0, La/pba0;

    .line 72
    .line 73
    invoke-direct {v0, p1, p0}, La/pba0;-><init>(Landroid/content/Context;La/pz40;)V

    .line 74
    .line 75
    .line 76
    return-object v0

    .line 77
    :pswitch_3
    check-cast p1, La/j6z;

    .line 78
    .line 79
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    .line 86
    .line 87
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 88
    .line 89
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_5
    check-cast p1, La/abi0;

    .line 96
    .line 97
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, La/a4x;

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result p0

    .line 110
    invoke-static {p1, p0}, La/cbi0;->g(La/abi0;I)V

    .line 111
    .line 112
    .line 113
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object p0

    .line 116
    :pswitch_6
    check-cast p1, La/o0x;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    instance-of v0, p1, La/n0x;

    .line 122
    .line 123
    if-eqz v0, :cond_0

    .line 124
    .line 125
    check-cast p1, La/n0x;

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_0
    move-object p1, v6

    .line 129
    :goto_0
    if-eqz p1, :cond_1

    .line 130
    .line 131
    iget-object v6, p1, La/n0x;->a:Ljava/lang/String;

    .line 132
    .line 133
    :cond_1
    invoke-interface {p0, v6}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 137
    .line 138
    return-object p0

    .line 139
    :pswitch_7
    check-cast p1, La/jtl;

    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v0, La/rk;->v:La/rk;

    .line 145
    .line 146
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    if-eqz v0, :cond_2

    .line 151
    .line 152
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 157
    .line 158
    sget-object p1, La/b060;->a:La/b060;

    .line 159
    .line 160
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_2
    sget-object v0, La/rk;->u:La/rk;

    .line 165
    .line 166
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-eqz p1, :cond_3

    .line 171
    .line 172
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 177
    .line 178
    sget-object p1, La/yz50;->a:La/yz50;

    .line 179
    .line 180
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 184
    .line 185
    return-object p0

    .line 186
    :pswitch_8
    check-cast p1, La/iz3;

    .line 187
    .line 188
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 197
    .line 198
    return-object p0

    .line 199
    :pswitch_9
    check-cast p1, La/kz3;

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 205
    .line 206
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 210
    .line 211
    return-object p0

    .line 212
    :pswitch_a
    check-cast p1, La/l4b;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 218
    .line 219
    .line 220
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    return-object p0

    .line 223
    :pswitch_b
    check-cast p1, La/t33;

    .line 224
    .line 225
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 226
    .line 227
    .line 228
    move-result-object p1

    .line 229
    check-cast p1, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 232
    .line 233
    .line 234
    move-result p1

    .line 235
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 236
    .line 237
    .line 238
    move-result-object p1

    .line 239
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object p0

    .line 245
    :pswitch_c
    check-cast p1, La/t33;

    .line 246
    .line 247
    invoke-virtual {p1}, La/t33;->d()Ljava/lang/Object;

    .line 248
    .line 249
    .line 250
    move-result-object p1

    .line 251
    check-cast p1, Ljava/lang/Number;

    .line 252
    .line 253
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 254
    .line 255
    .line 256
    move-result p1

    .line 257
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 265
    .line 266
    return-object p0

    .line 267
    :pswitch_d
    check-cast p1, La/qkx;

    .line 268
    .line 269
    iget-wide v0, p1, La/qkx;->a:J

    .line 270
    .line 271
    shr-long/2addr v0, v3

    .line 272
    long-to-int p1, v0

    .line 273
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    return-object p0

    .line 283
    :pswitch_e
    check-cast p1, La/j6z;

    .line 284
    .line 285
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-interface {p1}, La/j6z;->g()J

    .line 289
    .line 290
    .line 291
    move-result-wide v0

    .line 292
    and-long/2addr v0, v4

    .line 293
    long-to-int p1, v0

    .line 294
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 295
    .line 296
    .line 297
    move-result-object p1

    .line 298
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 302
    .line 303
    return-object p0

    .line 304
    :pswitch_f
    check-cast p1, La/j6z;

    .line 305
    .line 306
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    const-wide/16 v0, 0x0

    .line 310
    .line 311
    invoke-interface {p1, v0, v1}, La/j6z;->Y(J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v0

    .line 315
    and-long/2addr v0, v4

    .line 316
    long-to-int p1, v0

    .line 317
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 318
    .line 319
    .line 320
    move-result p1

    .line 321
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    check-cast v0, Ljava/lang/Number;

    .line 326
    .line 327
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 328
    .line 329
    .line 330
    move-result v0

    .line 331
    sub-float/2addr v0, p1

    .line 332
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    cmpl-float v0, v0, v2

    .line 337
    .line 338
    if-lez v0, :cond_4

    .line 339
    .line 340
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 341
    .line 342
    .line 343
    move-result-object p1

    .line 344
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 345
    .line 346
    .line 347
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 348
    .line 349
    return-object p0

    .line 350
    :pswitch_10
    check-cast p1, La/ne60;

    .line 351
    .line 352
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    check-cast v0, La/ne60;

    .line 357
    .line 358
    if-eqz v0, :cond_5

    .line 359
    .line 360
    iget-wide v0, v0, La/ne60;->a:J

    .line 361
    .line 362
    shr-long v6, v0, v3

    .line 363
    .line 364
    long-to-int v6, v6

    .line 365
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 366
    .line 367
    .line 368
    move-result v6

    .line 369
    iget-wide v7, p1, La/ne60;->a:J

    .line 370
    .line 371
    shr-long/2addr v7, v3

    .line 372
    long-to-int v3, v7

    .line 373
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 374
    .line 375
    .line 376
    move-result v3

    .line 377
    sub-float/2addr v6, v3

    .line 378
    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    .line 379
    .line 380
    .line 381
    move-result v3

    .line 382
    cmpl-float v3, v3, v2

    .line 383
    .line 384
    if-gtz v3, :cond_5

    .line 385
    .line 386
    and-long/2addr v0, v4

    .line 387
    long-to-int v0, v0

    .line 388
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 389
    .line 390
    .line 391
    move-result v0

    .line 392
    iget-wide v6, p1, La/ne60;->a:J

    .line 393
    .line 394
    and-long v3, v6, v4

    .line 395
    .line 396
    long-to-int v1, v3

    .line 397
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    sub-float/2addr v0, v1

    .line 402
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    cmpl-float v0, v0, v2

    .line 407
    .line 408
    if-lez v0, :cond_6

    .line 409
    .line 410
    :cond_5
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 411
    .line 412
    .line 413
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    return-object p0

    .line 416
    :pswitch_11
    check-cast p1, La/lz3;

    .line 417
    .line 418
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    return-object p0

    .line 427
    :pswitch_12
    check-cast p1, La/lwk;

    .line 428
    .line 429
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    new-instance p1, La/ty2;

    .line 433
    .line 434
    const/16 v0, 0xd

    .line 435
    .line 436
    invoke-direct {p1, p0, v0}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 437
    .line 438
    .line 439
    return-object p1

    .line 440
    :pswitch_13
    check-cast p1, La/lz3;

    .line 441
    .line 442
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 443
    .line 444
    .line 445
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 446
    .line 447
    .line 448
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 449
    .line 450
    return-object p0

    .line 451
    :pswitch_14
    check-cast p1, La/o0x;

    .line 452
    .line 453
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    instance-of v0, p1, La/n0x;

    .line 457
    .line 458
    if-eqz v0, :cond_7

    .line 459
    .line 460
    check-cast p1, La/n0x;

    .line 461
    .line 462
    goto :goto_2

    .line 463
    :cond_7
    move-object p1, v6

    .line 464
    :goto_2
    if-eqz p1, :cond_8

    .line 465
    .line 466
    iget-object v6, p1, La/n0x;->a:Ljava/lang/String;

    .line 467
    .line 468
    :cond_8
    invoke-interface {p0, v6}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 469
    .line 470
    .line 471
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object p0

    .line 474
    :pswitch_15
    check-cast p1, Ljava/lang/Boolean;

    .line 475
    .line 476
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 480
    .line 481
    .line 482
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object p0

    .line 485
    :pswitch_16
    check-cast p1, Ljava/lang/Boolean;

    .line 486
    .line 487
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 494
    .line 495
    return-object p0

    .line 496
    :pswitch_17
    check-cast p1, La/iqq;

    .line 497
    .line 498
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    invoke-virtual {p1}, La/iqq;->b()Z

    .line 502
    .line 503
    .line 504
    move-result p1

    .line 505
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 506
    .line 507
    .line 508
    move-result-object p1

    .line 509
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 510
    .line 511
    .line 512
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 513
    .line 514
    return-object p0

    .line 515
    :pswitch_18
    check-cast p1, La/qkx;

    .line 516
    .line 517
    iget-wide v0, p1, La/qkx;->a:J

    .line 518
    .line 519
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 523
    .line 524
    return-object p0

    .line 525
    :pswitch_19
    check-cast p1, Ljava/lang/Boolean;

    .line 526
    .line 527
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 528
    .line 529
    .line 530
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object p0

    .line 536
    :pswitch_1a
    check-cast p1, La/a9q0;

    .line 537
    .line 538
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 539
    .line 540
    .line 541
    invoke-virtual {p1, v1}, La/a9q0;->m(I)Z

    .line 542
    .line 543
    .line 544
    move-result p1

    .line 545
    if-eqz p1, :cond_9

    .line 546
    .line 547
    sget-wide v0, La/qmk;->o:J

    .line 548
    .line 549
    goto :goto_3

    .line 550
    :cond_9
    sget-wide v0, La/qmk;->p:J

    .line 551
    .line 552
    :goto_3
    new-instance p1, La/daq0;

    .line 553
    .line 554
    invoke-direct {p1, v0, v1}, La/daq0;-><init>(J)V

    .line 555
    .line 556
    .line 557
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object p0

    .line 563
    :pswitch_1b
    check-cast p1, Landroid/content/Context;

    .line 564
    .line 565
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    new-instance v0, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 569
    .line 570
    invoke-direct {v0, p1, v6, v1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 571
    .line 572
    .line 573
    new-instance p1, La/adv;

    .line 574
    .line 575
    const/4 v1, 0x1

    .line 576
    const v2, 0x7f07074a

    .line 577
    .line 578
    .line 579
    invoke-direct {p1, v0, v1, v2}, La/k5;-><init>(La/nmo0;ZI)V

    .line 580
    .line 581
    .line 582
    iput-object v0, p1, La/adv;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 583
    .line 584
    invoke-virtual {v0, p1}, Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;->setAdapter(La/k5;)V

    .line 585
    .line 586
    .line 587
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 588
    .line 589
    .line 590
    return-object v0

    .line 591
    :pswitch_1c
    check-cast p1, La/a4x;

    .line 592
    .line 593
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-static {p1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 597
    .line 598
    .line 599
    move-result-object p1

    .line 600
    invoke-interface {p0, p1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 601
    .line 602
    .line 603
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 604
    .line 605
    return-object p0

    .line 606
    nop

    .line 607
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
