.class public final synthetic La/r580;
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
    iput-byte p1, p0, La/r580;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte p0, p0, La/r580;->a:B

    .line 2
    .line 3
    const/4 v0, 0x7

    .line 4
    const/4 v1, 0x1

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Ljava/lang/Throwable;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    check-cast p1, La/ob0;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    new-instance p0, La/js80;

    .line 38
    .line 39
    invoke-direct {p0, p1}, La/js80;-><init>(La/ob0;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_2
    check-cast p1, La/ot0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, La/x4d0;->g0(La/ot0;)La/pt0;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :pswitch_3
    check-cast p1, La/hr10;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, La/x2x;->m0(La/hr10;)La/lq5;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :pswitch_4
    check-cast p1, La/kg;

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, La/ffb0;->S(La/kg;)La/ijl;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_5
    check-cast p1, La/ai0;

    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, La/cjx;->X(La/ai0;)La/mp0;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    :pswitch_6
    check-cast p1, Ljava/lang/Integer;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    new-instance v0, La/mdm;

    .line 90
    .line 91
    sget-object p1, La/pb10;->c:La/xuz;

    .line 92
    .line 93
    sget-object v1, La/pb10;->g:La/pb10;

    .line 94
    .line 95
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    const-wide/16 v11, 0x0

    .line 103
    .line 104
    const/16 v13, 0x25e

    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    const/4 v3, 0x0

    .line 108
    const/4 v4, 0x0

    .line 109
    const/4 v5, 0x0

    .line 110
    const v6, 0x7f1307c4

    .line 111
    .line 112
    .line 113
    const/4 v7, 0x0

    .line 114
    const v8, 0x7f131690

    .line 115
    .line 116
    .line 117
    const-wide/16 v9, 0x2710

    .line 118
    .line 119
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_7
    check-cast p1, La/es80;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    instance-of p0, p1, La/ds80;

    .line 129
    .line 130
    if-nez p0, :cond_1

    .line 131
    .line 132
    instance-of p0, p1, La/cs80;

    .line 133
    .line 134
    if-eqz p0, :cond_0

    .line 135
    .line 136
    goto :goto_0

    .line 137
    :cond_0
    move v1, v3

    .line 138
    :cond_1
    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    return-object p0

    .line 143
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 144
    .line 145
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 146
    .line 147
    .line 148
    move-result p0

    .line 149
    new-instance v0, La/mdm;

    .line 150
    .line 151
    sget-object p1, La/pb10;->c:La/xuz;

    .line 152
    .line 153
    sget-object v1, La/pb10;->e:La/pb10;

    .line 154
    .line 155
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-static {v1, p0}, La/xuz;->a(La/pb10;I)I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    const-wide/16 v11, 0x0

    .line 163
    .line 164
    const/16 v13, 0x3de

    .line 165
    .line 166
    const/4 v2, 0x0

    .line 167
    const/4 v3, 0x0

    .line 168
    const/4 v4, 0x0

    .line 169
    const/4 v5, 0x0

    .line 170
    const v6, 0x7f130e37

    .line 171
    .line 172
    .line 173
    const/4 v7, 0x0

    .line 174
    const/4 v8, 0x0

    .line 175
    const-wide/16 v9, 0x0

    .line 176
    .line 177
    invoke-direct/range {v0 .. v13}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 178
    .line 179
    .line 180
    return-object v0

    .line 181
    :pswitch_9
    check-cast p1, Lkotlin/jvm/functions/Function0;

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_a
    check-cast p1, Landroid/content/Context;

    .line 193
    .line 194
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    new-instance p0, Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 198
    .line 199
    new-instance v0, La/tje;

    .line 200
    .line 201
    const v1, 0x7f140197

    .line 202
    .line 203
    .line 204
    invoke-direct {v0, p1, v1}, La/tje;-><init>(Landroid/content/Context;I)V

    .line 205
    .line 206
    .line 207
    const/4 v1, 0x6

    .line 208
    invoke-direct {p0, v0, v2, v1, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, v3}, Lorg/xplatform/uikit/components/buttons/DsButton;->setLoading(Z)V

    .line 212
    .line 213
    .line 214
    const v0, 0x7f130b47

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/buttons/DsButton;->l(Ljava/lang/CharSequence;)V

    .line 225
    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_b
    check-cast p1, La/ou90;

    .line 229
    .line 230
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 231
    .line 232
    return-object p0

    .line 233
    :pswitch_c
    check-cast p1, La/cp;

    .line 234
    .line 235
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 236
    .line 237
    .line 238
    new-instance p0, La/ui80;

    .line 239
    .line 240
    invoke-direct {p0, p1, v3}, La/ui80;-><init>(La/cp;B)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 244
    .line 245
    .line 246
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 247
    .line 248
    return-object p0

    .line 249
    :pswitch_d
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 250
    .line 251
    .line 252
    move-result-object p0

    .line 253
    throw p0

    .line 254
    :pswitch_e
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    throw p0

    .line 259
    :pswitch_f
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 260
    .line 261
    .line 262
    move-result-object p0

    .line 263
    throw p0

    .line 264
    :pswitch_10
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 265
    .line 266
    .line 267
    move-result-object p0

    .line 268
    throw p0

    .line 269
    :pswitch_11
    invoke-static {p1}, La/rw2;->g(Ljava/lang/Object;)Ljava/lang/ClassCastException;

    .line 270
    .line 271
    .line 272
    move-result-object p0

    .line 273
    throw p0

    .line 274
    :pswitch_12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 275
    .line 276
    .line 277
    check-cast p1, La/dg80;

    .line 278
    .line 279
    invoke-interface {p1}, La/dg80;->h0()Z

    .line 280
    .line 281
    .line 282
    move-result p0

    .line 283
    xor-int/2addr p0, v1

    .line 284
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    return-object p0

    .line 289
    :pswitch_13
    check-cast p1, La/e7z;

    .line 290
    .line 291
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 292
    .line 293
    .line 294
    move-result p0

    .line 295
    if-eqz p0, :cond_2

    .line 296
    .line 297
    invoke-virtual {p1, v3}, La/e7z;->T(Z)V

    .line 298
    .line 299
    .line 300
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 301
    .line 302
    return-object p0

    .line 303
    :pswitch_14
    check-cast p1, La/e7z;

    .line 304
    .line 305
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    if-eqz p0, :cond_3

    .line 310
    .line 311
    invoke-virtual {p1, v3}, La/e7z;->T(Z)V

    .line 312
    .line 313
    .line 314
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object p0

    .line 317
    :pswitch_15
    check-cast p1, La/e7z;

    .line 318
    .line 319
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 320
    .line 321
    .line 322
    move-result p0

    .line 323
    if-eqz p0, :cond_4

    .line 324
    .line 325
    invoke-virtual {p1, v3}, La/e7z;->V(Z)V

    .line 326
    .line 327
    .line 328
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 329
    .line 330
    return-object p0

    .line 331
    :pswitch_16
    check-cast p1, La/e7z;

    .line 332
    .line 333
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 334
    .line 335
    .line 336
    move-result p0

    .line 337
    if-eqz p0, :cond_5

    .line 338
    .line 339
    invoke-virtual {p1, v3}, La/e7z;->V(Z)V

    .line 340
    .line 341
    .line 342
    :cond_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object p0

    .line 345
    :pswitch_17
    check-cast p1, La/e7z;

    .line 346
    .line 347
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 348
    .line 349
    .line 350
    move-result p0

    .line 351
    if-eqz p0, :cond_6

    .line 352
    .line 353
    invoke-virtual {p1}, La/e7z;->G()V

    .line 354
    .line 355
    .line 356
    :cond_6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    return-object p0

    .line 359
    :pswitch_18
    check-cast p1, La/e7z;

    .line 360
    .line 361
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 362
    .line 363
    .line 364
    move-result p0

    .line 365
    if-eqz p0, :cond_7

    .line 366
    .line 367
    invoke-static {p1, v3, v0}, La/e7z;->W(La/e7z;ZI)V

    .line 368
    .line 369
    .line 370
    :cond_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object p0

    .line 373
    :pswitch_19
    check-cast p1, La/e7z;

    .line 374
    .line 375
    invoke-virtual {p1}, La/e7z;->I()Z

    .line 376
    .line 377
    .line 378
    move-result p0

    .line 379
    if-eqz p0, :cond_8

    .line 380
    .line 381
    invoke-static {p1, v3, v0}, La/e7z;->U(La/e7z;ZI)V

    .line 382
    .line 383
    .line 384
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object p0

    .line 387
    :pswitch_1a
    check-cast p1, La/bh90;

    .line 388
    .line 389
    sget p0, La/p03;->a:I

    .line 390
    .line 391
    sget-object p0, La/dy2;->b:La/zfn;

    .line 392
    .line 393
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-static {p1, p0}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object p0

    .line 400
    move-object v4, p0

    .line 401
    check-cast v4, Landroid/content/Context;

    .line 402
    .line 403
    sget-object p0, La/bmd;->h:La/zfn;

    .line 404
    .line 405
    invoke-static {p1, p0}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object p0

    .line 409
    move-object v5, p0

    .line 410
    check-cast v5, La/w6k;

    .line 411
    .line 412
    sget-object p0, La/uf80;->a:La/zfn;

    .line 413
    .line 414
    invoke-static {p1, p0}, La/qbc;->V(La/bh90;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    check-cast p0, La/tf80;

    .line 419
    .line 420
    if-nez p0, :cond_9

    .line 421
    .line 422
    goto :goto_1

    .line 423
    :cond_9
    new-instance v3, La/bz2;

    .line 424
    .line 425
    iget-wide v6, p0, La/tf80;->a:J

    .line 426
    .line 427
    iget-object v8, p0, La/tf80;->b:La/lh80;

    .line 428
    .line 429
    invoke-direct/range {v3 .. v8}, La/bz2;-><init>(Landroid/content/Context;La/w6k;JLa/lh80;)V

    .line 430
    .line 431
    .line 432
    move-object v2, v3

    .line 433
    :goto_1
    return-object v2

    .line 434
    :pswitch_1b
    check-cast p1, La/jlb;

    .line 435
    .line 436
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object p0

    .line 443
    return-object p0

    .line 444
    :pswitch_1c
    check-cast p1, La/i580;

    .line 445
    .line 446
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 450
    .line 451
    .line 452
    move-result-object p0

    .line 453
    iget-object v0, p1, La/i580;->a:Ljava/util/List;

    .line 454
    .line 455
    iget-object v1, p1, La/i580;->b:La/i3m0;

    .line 456
    .line 457
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    :cond_a
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 462
    .line 463
    .line 464
    move-result v3

    .line 465
    if-eqz v3, :cond_11

    .line 466
    .line 467
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 468
    .line 469
    .line 470
    move-result-object v3

    .line 471
    check-cast v3, La/ifb;

    .line 472
    .line 473
    instance-of v4, v3, La/ffb;

    .line 474
    .line 475
    if-eqz v4, :cond_b

    .line 476
    .line 477
    sget-object v4, La/f3m0;->a:La/f3m0;

    .line 478
    .line 479
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v4

    .line 483
    if-eqz v4, :cond_b

    .line 484
    .line 485
    check-cast v3, La/ffb;

    .line 486
    .line 487
    iget-object v4, v3, La/ffb;->a:Ljava/util/List;

    .line 488
    .line 489
    iget-object v3, v3, La/ffb;->b:Ljava/util/List;

    .line 490
    .line 491
    invoke-static {v4, v3}, La/xdx;->y(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    move-result-object v3

    .line 495
    invoke-virtual {p0, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 496
    .line 497
    .line 498
    goto :goto_2

    .line 499
    :cond_b
    instance-of v4, v3, La/efb;

    .line 500
    .line 501
    if-eqz v4, :cond_10

    .line 502
    .line 503
    sget-object v4, La/e3m0;->a:La/e3m0;

    .line 504
    .line 505
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    if-eqz v4, :cond_10

    .line 510
    .line 511
    check-cast v3, La/efb;

    .line 512
    .line 513
    iget-object v4, p1, La/i580;->c:Ljava/lang/String;

    .line 514
    .line 515
    if-nez v4, :cond_c

    .line 516
    .line 517
    const-string v4, ""

    .line 518
    .line 519
    :cond_c
    iget-object v5, v3, La/efb;->a:Ljava/util/List;

    .line 520
    .line 521
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 522
    .line 523
    .line 524
    move-result-object v5

    .line 525
    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 526
    .line 527
    .line 528
    move-result v6

    .line 529
    if-eqz v6, :cond_e

    .line 530
    .line 531
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v6

    .line 535
    move-object v7, v6

    .line 536
    check-cast v7, La/dfb;

    .line 537
    .line 538
    iget-object v7, v7, La/dfb;->a:Ljava/lang/String;

    .line 539
    .line 540
    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    move-result v7

    .line 544
    if-eqz v7, :cond_d

    .line 545
    .line 546
    goto :goto_3

    .line 547
    :cond_e
    move-object v6, v2

    .line 548
    :goto_3
    check-cast v6, La/dfb;

    .line 549
    .line 550
    if-nez v6, :cond_f

    .line 551
    .line 552
    goto :goto_2

    .line 553
    :cond_f
    iget-object v4, v6, La/dfb;->b:Ljava/util/List;

    .line 554
    .line 555
    iget-object v3, v3, La/efb;->b:Ljava/util/List;

    .line 556
    .line 557
    invoke-static {v4, v3}, La/xdx;->y(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 558
    .line 559
    .line 560
    move-result-object v3

    .line 561
    invoke-virtual {p0, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 562
    .line 563
    .line 564
    goto :goto_2

    .line 565
    :cond_10
    instance-of v4, v3, La/gfb;

    .line 566
    .line 567
    if-eqz v4, :cond_a

    .line 568
    .line 569
    sget-object v4, La/g3m0;->a:La/g3m0;

    .line 570
    .line 571
    invoke-virtual {v1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 572
    .line 573
    .line 574
    move-result v4

    .line 575
    if-eqz v4, :cond_a

    .line 576
    .line 577
    check-cast v3, La/gfb;

    .line 578
    .line 579
    iget-object v4, v3, La/gfb;->a:Ljava/util/List;

    .line 580
    .line 581
    iget-object v3, v3, La/gfb;->b:Ljava/util/List;

    .line 582
    .line 583
    invoke-static {v4, v3}, La/xdx;->y(Ljava/util/List;Ljava/util/List;)Ljava/util/ArrayList;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {p0, v3}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 588
    .line 589
    .line 590
    goto/16 :goto_2

    .line 591
    .line 592
    :cond_11
    invoke-static {p0}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 593
    .line 594
    .line 595
    move-result-object p0

    .line 596
    new-instance p1, La/q580;

    .line 597
    .line 598
    invoke-static {p0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 599
    .line 600
    .line 601
    move-result-object p0

    .line 602
    invoke-direct {p1, p0}, La/q580;-><init>(La/i4;)V

    .line 603
    .line 604
    .line 605
    return-object p1

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
