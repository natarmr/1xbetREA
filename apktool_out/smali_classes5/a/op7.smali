.class public final synthetic La/op7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vl8;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x7

    iput-byte v0, p0, La/op7;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/op7;->b:Ljava/lang/Object;

    iput-object p2, p0, La/op7;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/op7;->a:B

    iput-object p1, p0, La/op7;->b:Ljava/lang/Object;

    iput-object p2, p0, La/op7;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/op7;->a:B

    .line 4
    .line 5
    sget-object v2, La/pqp0;->a:La/pqp0;

    .line 6
    .line 7
    sget-object v3, La/nqp0;->a:La/nqp0;

    .line 8
    .line 9
    const/4 v4, -0x1

    .line 10
    const/16 v5, 0xb

    .line 11
    .line 12
    const-string v6, ""

    .line 13
    .line 14
    const/16 v7, 0xa

    .line 15
    .line 16
    const/16 v8, 0x8

    .line 17
    .line 18
    const/4 v9, 0x2

    .line 19
    const/4 v10, 0x3

    .line 20
    const/4 v11, 0x0

    .line 21
    const/4 v12, 0x1

    .line 22
    const/4 v13, 0x0

    .line 23
    iget-object v14, v0, La/op7;->c:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v0, v0, La/op7;->b:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v0, La/v7c;

    .line 31
    .line 32
    check-cast v14, La/an4;

    .line 33
    .line 34
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/k0w0;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, La/v7c;->H:La/rek0;

    .line 42
    .line 43
    invoke-virtual {v14}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    if-nez v2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move-object v6, v2

    .line 51
    :goto_0
    iget-object v2, v14, La/zhi0;->c:La/kuw;

    .line 52
    .line 53
    sget-object v3, La/i2o;->L2:La/i2o;

    .line 54
    .line 55
    if-ne v2, v3, :cond_1

    .line 56
    .line 57
    move v11, v12

    .line 58
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    new-instance v0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;

    .line 62
    .line 63
    invoke-direct {v0, v6, v11}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;-><init>(Ljava/lang/String;Z)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 67
    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 70
    .line 71
    return-object v0

    .line 72
    :pswitch_0
    check-cast v0, La/we50;

    .line 73
    .line 74
    check-cast v14, La/s1c;

    .line 75
    .line 76
    move-object/from16 v1, p1

    .line 77
    .line 78
    check-cast v1, La/k0w0;

    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    sget-object v2, La/g1c;->a:[I

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    aget v2, v2, v3

    .line 90
    .line 91
    if-ne v2, v12, :cond_2

    .line 92
    .line 93
    invoke-virtual {v1}, La/k0w0;->d()V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    iget-object v2, v14, La/s1c;->p:La/zn00;

    .line 98
    .line 99
    invoke-virtual {v2, v0}, La/zn00;->G0(La/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-virtual {v1, v0}, La/k0w0;->c(La/m7h0;)V

    .line 104
    .line 105
    .line 106
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_1
    check-cast v0, La/azb;

    .line 110
    .line 111
    check-cast v14, La/vne;

    .line 112
    .line 113
    move-object/from16 v1, p1

    .line 114
    .line 115
    check-cast v1, Ljava/lang/Throwable;

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    iget-object v2, v0, La/azb;->p:La/p7m0;

    .line 124
    .line 125
    sget-object v3, La/i8d;->e:La/i8d;

    .line 126
    .line 127
    invoke-virtual {v2, v13, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v1, v14}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_2
    check-cast v0, La/dob;

    .line 137
    .line 138
    check-cast v14, La/xnb;

    .line 139
    .line 140
    move-object/from16 v1, p1

    .line 141
    .line 142
    check-cast v1, La/hcz;

    .line 143
    .line 144
    sget-object v2, La/xnb;->w2:La/kj5;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    new-instance v2, La/ab4;

    .line 150
    .line 151
    const/16 v3, 0x13

    .line 152
    .line 153
    invoke-direct {v2, v0, v14, v3}, La/ab4;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 154
    .line 155
    .line 156
    new-instance v0, La/ugd;

    .line 157
    .line 158
    const v3, 0x2e5d6a90

    .line 159
    .line 160
    .line 161
    invoke-direct {v0, v3, v12, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 162
    .line 163
    .line 164
    invoke-static {v1, v13, v13, v0, v10}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 165
    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_3
    check-cast v0, La/plb;

    .line 171
    .line 172
    check-cast v14, La/d2w;

    .line 173
    .line 174
    move-object/from16 v1, p1

    .line 175
    .line 176
    check-cast v1, La/k0w0;

    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    iget-object v2, v0, La/plb;->y:La/kys0;

    .line 182
    .line 183
    invoke-virtual {v14}, La/d2w;->f()Ljava/lang/String;

    .line 184
    .line 185
    .line 186
    move-result-object v7

    .line 187
    invoke-virtual {v14}, La/d2w;->b()J

    .line 188
    .line 189
    .line 190
    move-result-wide v3

    .line 191
    invoke-virtual {v14}, La/d2w;->d()J

    .line 192
    .line 193
    .line 194
    move-result-wide v5

    .line 195
    invoke-virtual/range {v2 .. v7}, La/kys0;->e(JJLjava/lang/String;)Lorg/xplatform/ufc/impl/navigation/UfcScreensFactoryImpl$getUfcPostGameScreen$1;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 200
    .line 201
    .line 202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_4
    check-cast v0, La/plb;

    .line 206
    .line 207
    check-cast v14, La/kjb;

    .line 208
    .line 209
    move-object/from16 v1, p1

    .line 210
    .line 211
    check-cast v1, La/k0w0;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-object v2, v0, La/plb;->z:La/uxs0;

    .line 217
    .line 218
    new-instance v3, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;

    .line 219
    .line 220
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, La/alb;

    .line 225
    .line 226
    iget-object v0, v0, La/alb;->b:La/kgz;

    .line 227
    .line 228
    iget-object v4, v14, La/kjb;->a:La/f7v0;

    .line 229
    .line 230
    invoke-direct {v3, v0, v4}, Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;-><init>(La/kgz;La/f7v0;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1;

    .line 237
    .line 238
    invoke-direct {v0, v3}, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcWeightClassRatingScreen$1;-><init>(Lorg/xplatform/ufc/api/weight_class_rating/UfcWeightClassRatingParams;)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 242
    .line 243
    .line 244
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 245
    .line 246
    return-object v0

    .line 247
    :pswitch_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 248
    .line 249
    check-cast v14, La/bib;

    .line 250
    .line 251
    move-object/from16 v1, p1

    .line 252
    .line 253
    check-cast v1, La/jib;

    .line 254
    .line 255
    sget-object v2, La/bib;->X1:La/bj5;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v14}, La/bib;->J0()La/k3t0;

    .line 264
    .line 265
    .line 266
    move-result-object v0

    .line 267
    sget-object v1, La/hhb;->a:La/hhb;

    .line 268
    .line 269
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 273
    .line 274
    return-object v0

    .line 275
    :pswitch_6
    check-cast v0, La/vqa;

    .line 276
    .line 277
    check-cast v14, La/cp;

    .line 278
    .line 279
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, Ljava/util/List;

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 287
    .line 288
    .line 289
    move-result-object v1

    .line 290
    check-cast v1, La/wqa;

    .line 291
    .line 292
    iget-object v1, v1, La/wqa;->b:La/uqa;

    .line 293
    .line 294
    invoke-virtual {v14}, La/cp;->u()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v2

    .line 298
    check-cast v2, La/wqa;

    .line 299
    .line 300
    iget-object v2, v2, La/wqa;->c:La/uqa;

    .line 301
    .line 302
    new-array v3, v9, [La/uqa;

    .line 303
    .line 304
    aput-object v1, v3, v11

    .line 305
    .line 306
    aput-object v2, v3, v12

    .line 307
    .line 308
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 309
    .line 310
    .line 311
    move-result-object v1

    .line 312
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 313
    .line 314
    .line 315
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 316
    .line 317
    return-object v0

    .line 318
    :pswitch_7
    check-cast v0, La/okz;

    .line 319
    .line 320
    check-cast v14, La/qz9;

    .line 321
    .line 322
    move-object/from16 v1, p1

    .line 323
    .line 324
    check-cast v1, La/o15;

    .line 325
    .line 326
    sget-object v2, La/qz9;->t2:La/kl5;

    .line 327
    .line 328
    iget v1, v1, La/o15;->a:I

    .line 329
    .line 330
    if-ne v1, v10, :cond_3

    .line 331
    .line 332
    invoke-virtual {v0}, La/okz;->a()La/j0a;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    check-cast v0, La/ewq;

    .line 337
    .line 338
    iget-object v0, v0, La/ewq;->a:La/n0a;

    .line 339
    .line 340
    invoke-interface {v0}, La/j0a;->b()La/wh00;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    invoke-virtual {v0, v14}, La/wh00;->k(La/clz;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v14}, La/qz9;->R0()La/rz9;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v0, v0, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 352
    .line 353
    invoke-virtual {v0}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()La/wh00;

    .line 354
    .line 355
    .line 356
    move-result-object v0

    .line 357
    new-instance v1, La/iz9;

    .line 358
    .line 359
    invoke-direct {v1, v14, v8}, La/iz9;-><init>(La/qz9;B)V

    .line 360
    .line 361
    .line 362
    new-instance v2, La/pz9;

    .line 363
    .line 364
    invoke-direct {v2, v1}, La/pz9;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0, v14, v2}, La/wh00;->e(La/clz;La/ee60;)V

    .line 368
    .line 369
    .line 370
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 371
    .line 372
    return-object v0

    .line 373
    :pswitch_8
    check-cast v0, La/jf9;

    .line 374
    .line 375
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 376
    .line 377
    move-object/from16 v1, p1

    .line 378
    .line 379
    check-cast v1, La/hcz;

    .line 380
    .line 381
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    if-eqz v0, :cond_5

    .line 385
    .line 386
    instance-of v2, v0, La/hf9;

    .line 387
    .line 388
    if-eqz v2, :cond_4

    .line 389
    .line 390
    check-cast v0, La/hf9;

    .line 391
    .line 392
    iget-object v0, v0, La/hf9;->b:La/a4x;

    .line 393
    .line 394
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 395
    .line 396
    .line 397
    move-result v2

    .line 398
    new-instance v3, La/wl0;

    .line 399
    .line 400
    invoke-direct {v3, v0, v7}, La/wl0;-><init>(La/a4x;B)V

    .line 401
    .line 402
    .line 403
    new-instance v4, La/ws1;

    .line 404
    .line 405
    const/4 v5, 0x7

    .line 406
    invoke-direct {v4, v0, v14, v5}, La/ws1;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 407
    .line 408
    .line 409
    new-instance v0, La/ugd;

    .line 410
    .line 411
    const v5, 0x2fd4df92

    .line 412
    .line 413
    .line 414
    invoke-direct {v0, v5, v12, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 415
    .line 416
    .line 417
    invoke-virtual {v1, v2, v13, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 418
    .line 419
    .line 420
    goto :goto_2

    .line 421
    :cond_4
    instance-of v0, v0, La/if9;

    .line 422
    .line 423
    if-eqz v0, :cond_5

    .line 424
    .line 425
    sget-object v5, La/ny9;->a:La/ugd;

    .line 426
    .line 427
    const/4 v6, 0x6

    .line 428
    const/4 v2, 0x3

    .line 429
    const/4 v3, 0x0

    .line 430
    const/4 v4, 0x0

    .line 431
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 432
    .line 433
    .line 434
    :goto_2
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    goto :goto_3

    .line 437
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 438
    .line 439
    .line 440
    :goto_3
    return-object v13

    .line 441
    :pswitch_9
    check-cast v0, La/sa9;

    .line 442
    .line 443
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 444
    .line 445
    move-object/from16 v1, p1

    .line 446
    .line 447
    check-cast v1, La/hcz;

    .line 448
    .line 449
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    sget-object v2, La/uc9;->i:La/ugd;

    .line 453
    .line 454
    invoke-static {v1, v13, v13, v2, v10}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 455
    .line 456
    .line 457
    iget-object v2, v0, La/sa9;->d:La/a4x;

    .line 458
    .line 459
    new-instance v3, La/im8;

    .line 460
    .line 461
    invoke-direct {v3, v8}, La/im8;-><init>(B)V

    .line 462
    .line 463
    .line 464
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 465
    .line 466
    .line 467
    move-result v4

    .line 468
    new-instance v6, La/at7;

    .line 469
    .line 470
    invoke-direct {v6, v3, v2, v8}, La/at7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 471
    .line 472
    .line 473
    new-instance v3, La/dx8;

    .line 474
    .line 475
    invoke-direct {v3, v2, v9}, La/dx8;-><init>(Ljava/util/List;B)V

    .line 476
    .line 477
    .line 478
    new-instance v7, La/c8;

    .line 479
    .line 480
    invoke-direct {v7, v2, v0, v14, v5}, La/c8;-><init>(Ljava/util/List;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;B)V

    .line 481
    .line 482
    .line 483
    new-instance v0, La/ugd;

    .line 484
    .line 485
    const v2, 0x799532c4

    .line 486
    .line 487
    .line 488
    invoke-direct {v0, v2, v12, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v1, v4, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 492
    .line 493
    .line 494
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 495
    .line 496
    return-object v0

    .line 497
    :pswitch_a
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 498
    .line 499
    check-cast v14, La/agk0;

    .line 500
    .line 501
    move-object/from16 v1, p1

    .line 502
    .line 503
    check-cast v1, La/lwk;

    .line 504
    .line 505
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    new-instance v1, La/m69;

    .line 509
    .line 510
    invoke-direct {v1, v14}, La/m69;-><init>(La/agk0;)V

    .line 511
    .line 512
    .line 513
    move-object v2, v0

    .line 514
    check-cast v2, La/ulo;

    .line 515
    .line 516
    iget-object v2, v2, La/ulo;->m:La/vg00;

    .line 517
    .line 518
    invoke-virtual {v2, v1}, La/vg00;->a(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    new-instance v2, La/pr0;

    .line 522
    .line 523
    const/4 v3, 0x5

    .line 524
    invoke-direct {v2, v0, v1, v3}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 525
    .line 526
    .line 527
    return-object v2

    .line 528
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 529
    .line 530
    check-cast v14, La/l49;

    .line 531
    .line 532
    move-object/from16 v1, p1

    .line 533
    .line 534
    check-cast v1, Ljava/lang/Integer;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 537
    .line 538
    .line 539
    move-result v1

    .line 540
    check-cast v14, La/j49;

    .line 541
    .line 542
    iget-object v2, v14, La/j49;->d:La/a4x;

    .line 543
    .line 544
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    check-cast v1, La/i49;

    .line 549
    .line 550
    if-eqz v1, :cond_7

    .line 551
    .line 552
    instance-of v2, v1, La/g49;

    .line 553
    .line 554
    if-eqz v2, :cond_6

    .line 555
    .line 556
    sget-object v1, La/o49;->a:La/o49;

    .line 557
    .line 558
    goto :goto_4

    .line 559
    :cond_6
    instance-of v1, v1, La/h49;

    .line 560
    .line 561
    if-eqz v1, :cond_7

    .line 562
    .line 563
    sget-object v1, La/o49;->b:La/o49;

    .line 564
    .line 565
    :goto_4
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    goto :goto_5

    .line 571
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 572
    .line 573
    .line 574
    :goto_5
    return-object v13

    .line 575
    :pswitch_c
    check-cast v0, La/h03;

    .line 576
    .line 577
    check-cast v14, La/lee;

    .line 578
    .line 579
    move-object/from16 v1, p1

    .line 580
    .line 581
    check-cast v1, Ljava/lang/Throwable;

    .line 582
    .line 583
    iget-object v0, v0, La/h03;->b:Ljava/lang/Object;

    .line 584
    .line 585
    check-cast v0, La/xz40;

    .line 586
    .line 587
    invoke-virtual {v0, v14}, La/xz40;->j(Ljava/lang/Object;)Z

    .line 588
    .line 589
    .line 590
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 591
    .line 592
    return-object v0

    .line 593
    :pswitch_d
    check-cast v0, La/s29;

    .line 594
    .line 595
    check-cast v14, La/s5d0;

    .line 596
    .line 597
    move-object/from16 v1, p1

    .line 598
    .line 599
    check-cast v1, La/k0w0;

    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    iget-object v15, v0, La/s29;->J:La/peg0;

    .line 605
    .line 606
    iget-object v2, v14, La/s5d0;->a:Ljava/lang/String;

    .line 607
    .line 608
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 609
    .line 610
    .line 611
    move-result-wide v16

    .line 612
    iget-object v2, v14, La/s5d0;->d:Ljava/lang/String;

    .line 613
    .line 614
    iget-object v3, v14, La/s5d0;->f:Ljava/util/List;

    .line 615
    .line 616
    iget-object v4, v14, La/s5d0;->g:Ljava/lang/String;

    .line 617
    .line 618
    iget-object v0, v0, La/s29;->M:La/sff0;

    .line 619
    .line 620
    iget-object v0, v0, La/sff0;->b:La/hl1;

    .line 621
    .line 622
    iget-object v5, v0, La/hl1;->a:La/f61;

    .line 623
    .line 624
    iget-boolean v5, v5, La/f61;->k:Z

    .line 625
    .line 626
    if-nez v5, :cond_9

    .line 627
    .line 628
    iget-object v5, v14, La/s5d0;->e:La/gz8;

    .line 629
    .line 630
    sget-object v7, La/gz8;->b:La/gz8;

    .line 631
    .line 632
    if-ne v5, v7, :cond_8

    .line 633
    .line 634
    goto :goto_6

    .line 635
    :cond_8
    move/from16 v21, v11

    .line 636
    .line 637
    goto :goto_7

    .line 638
    :cond_9
    :goto_6
    move/from16 v21, v12

    .line 639
    .line 640
    :goto_7
    iget-object v5, v14, La/s5d0;->i:Ljava/lang/String;

    .line 641
    .line 642
    if-nez v5, :cond_a

    .line 643
    .line 644
    move-object/from16 v24, v6

    .line 645
    .line 646
    goto :goto_8

    .line 647
    :cond_a
    move-object/from16 v24, v5

    .line 648
    .line 649
    :goto_8
    iget-object v0, v0, La/hl1;->x:La/vc0;

    .line 650
    .line 651
    const/16 v22, 0x0

    .line 652
    .line 653
    move-object/from16 v23, v0

    .line 654
    .line 655
    move-object/from16 v18, v2

    .line 656
    .line 657
    move-object/from16 v19, v3

    .line 658
    .line 659
    move-object/from16 v20, v4

    .line 660
    .line 661
    invoke-virtual/range {v15 .. v24}, La/peg0;->j(JLjava/lang/String;Ljava/util/List;Ljava/lang/String;ZZLa/vc0;Ljava/lang/String;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$BrandGamesFragmentScreen;

    .line 662
    .line 663
    .line 664
    move-result-object v0

    .line 665
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 666
    .line 667
    .line 668
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_e
    check-cast v0, Ljava/util/ArrayList;

    .line 672
    .line 673
    check-cast v14, La/qf6;

    .line 674
    .line 675
    move-object/from16 v1, p1

    .line 676
    .line 677
    check-cast v1, La/ou90;

    .line 678
    .line 679
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    move v2, v11

    .line 687
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 688
    .line 689
    .line 690
    move-result v3

    .line 691
    if-eqz v3, :cond_d

    .line 692
    .line 693
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 694
    .line 695
    .line 696
    move-result-object v3

    .line 697
    add-int/lit8 v4, v2, 0x1

    .line 698
    .line 699
    if-ltz v2, :cond_c

    .line 700
    .line 701
    check-cast v3, La/pu90;

    .line 702
    .line 703
    iget-object v5, v14, La/qf6;->b:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v5, Ljava/util/List;

    .line 706
    .line 707
    invoke-static {v2, v5}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 708
    .line 709
    .line 710
    move-result-object v2

    .line 711
    check-cast v2, La/us8;

    .line 712
    .line 713
    const/4 v5, 0x0

    .line 714
    if-eqz v2, :cond_b

    .line 715
    .line 716
    iget-object v2, v2, La/us8;->b:Landroid/graphics/Rect;

    .line 717
    .line 718
    iget v6, v2, Landroid/graphics/Rect;->left:I

    .line 719
    .line 720
    iget v2, v2, Landroid/graphics/Rect;->top:I

    .line 721
    .line 722
    invoke-virtual {v1, v3, v6, v2, v5}, La/ou90;->g(La/pu90;IIF)V

    .line 723
    .line 724
    .line 725
    goto :goto_a

    .line 726
    :cond_b
    invoke-virtual {v1, v3, v11, v11, v5}, La/ou90;->g(La/pu90;IIF)V

    .line 727
    .line 728
    .line 729
    :goto_a
    move v2, v4

    .line 730
    goto :goto_9

    .line 731
    :cond_c
    invoke-static {}, La/q3d;->p()V

    .line 732
    .line 733
    .line 734
    throw v13

    .line 735
    :cond_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 736
    .line 737
    return-object v0

    .line 738
    :pswitch_f
    check-cast v0, La/vne;

    .line 739
    .line 740
    check-cast v14, La/es8;

    .line 741
    .line 742
    move-object/from16 v1, p1

    .line 743
    .line 744
    check-cast v1, Ljava/lang/Integer;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 747
    .line 748
    .line 749
    move-result v1

    .line 750
    new-instance v2, La/u52;

    .line 751
    .line 752
    invoke-direct {v2, v14, v1, v13, v12}, La/u52;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 753
    .line 754
    .line 755
    invoke-static {v0, v13, v13, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 756
    .line 757
    .line 758
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 759
    .line 760
    return-object v0

    .line 761
    :pswitch_10
    check-cast v0, La/vne;

    .line 762
    .line 763
    check-cast v14, La/xpj0;

    .line 764
    .line 765
    move-object/from16 v1, p1

    .line 766
    .line 767
    check-cast v1, Ljava/lang/Float;

    .line 768
    .line 769
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 770
    .line 771
    .line 772
    move-result v1

    .line 773
    new-instance v2, La/aq8;

    .line 774
    .line 775
    invoke-direct {v2, v14, v1, v13, v11}, La/aq8;-><init>(La/xpj0;FLa/yje;B)V

    .line 776
    .line 777
    .line 778
    invoke-static {v0, v13, v13, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 779
    .line 780
    .line 781
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 782
    .line 783
    return-object v0

    .line 784
    :pswitch_11
    check-cast v0, La/zbr;

    .line 785
    .line 786
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 787
    .line 788
    move-object/from16 v1, p1

    .line 789
    .line 790
    check-cast v1, La/jtl;

    .line 791
    .line 792
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 793
    .line 794
    .line 795
    sget-object v2, La/ybr;->a:La/ybr;

    .line 796
    .line 797
    if-ne v1, v2, :cond_13

    .line 798
    .line 799
    iget-object v0, v0, La/zbr;->c:La/wwh0;

    .line 800
    .line 801
    iget-object v1, v0, La/wwh0;->a:La/a4x;

    .line 802
    .line 803
    iget v0, v0, La/wwh0;->d:I

    .line 804
    .line 805
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    check-cast v0, La/oj80;

    .line 810
    .line 811
    if-eqz v0, :cond_e

    .line 812
    .line 813
    iget-object v13, v0, La/oj80;->a:La/lj80;

    .line 814
    .line 815
    :cond_e
    sget-object v0, La/w420;->a:La/w420;

    .line 816
    .line 817
    if-nez v13, :cond_f

    .line 818
    .line 819
    goto :goto_b

    .line 820
    :cond_f
    instance-of v1, v13, La/ij80;

    .line 821
    .line 822
    if-eqz v1, :cond_10

    .line 823
    .line 824
    goto :goto_b

    .line 825
    :cond_10
    instance-of v1, v13, La/fj80;

    .line 826
    .line 827
    if-eqz v1, :cond_11

    .line 828
    .line 829
    sget-object v0, La/m420;->a:La/m420;

    .line 830
    .line 831
    goto :goto_b

    .line 832
    :cond_11
    instance-of v1, v13, La/cj80;

    .line 833
    .line 834
    if-eqz v1, :cond_12

    .line 835
    .line 836
    sget-object v0, La/b420;->a:La/b420;

    .line 837
    .line 838
    :cond_12
    :goto_b
    invoke-interface {v14, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    goto :goto_c

    .line 842
    :cond_13
    sget-object v0, La/ybr;->b:La/ybr;

    .line 843
    .line 844
    if-ne v1, v0, :cond_14

    .line 845
    .line 846
    sget-object v0, La/i420;->a:La/i420;

    .line 847
    .line 848
    invoke-interface {v14, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    goto :goto_c

    .line 852
    :cond_14
    sget-object v0, La/ybr;->c:La/ybr;

    .line 853
    .line 854
    if-ne v1, v0, :cond_15

    .line 855
    .line 856
    sget-object v0, La/p420;->a:La/p420;

    .line 857
    .line 858
    invoke-interface {v14, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    :cond_15
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 862
    .line 863
    return-object v0

    .line 864
    :pswitch_12
    check-cast v0, La/ne80;

    .line 865
    .line 866
    move-object v3, v14

    .line 867
    check-cast v3, La/t89;

    .line 868
    .line 869
    move-object/from16 v1, p1

    .line 870
    .line 871
    check-cast v1, La/g7z;

    .line 872
    .line 873
    invoke-virtual {v1}, La/g7z;->a()V

    .line 874
    .line 875
    .line 876
    iget-object v2, v0, La/ne80;->a:La/w03;

    .line 877
    .line 878
    const/4 v5, 0x0

    .line 879
    const/16 v6, 0x3c

    .line 880
    .line 881
    const/4 v4, 0x0

    .line 882
    invoke-static/range {v1 .. v6}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 883
    .line 884
    .line 885
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 886
    .line 887
    return-object v0

    .line 888
    :pswitch_13
    move-object v2, v0

    .line 889
    check-cast v2, La/w03;

    .line 890
    .line 891
    move-object v3, v14

    .line 892
    check-cast v3, La/t89;

    .line 893
    .line 894
    move-object/from16 v1, p1

    .line 895
    .line 896
    check-cast v1, La/g7z;

    .line 897
    .line 898
    invoke-virtual {v1}, La/g7z;->a()V

    .line 899
    .line 900
    .line 901
    const/4 v5, 0x0

    .line 902
    const/16 v6, 0x3c

    .line 903
    .line 904
    const/4 v4, 0x0

    .line 905
    invoke-static/range {v1 .. v6}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :pswitch_14
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 912
    .line 913
    check-cast v14, La/jh8;

    .line 914
    .line 915
    move-object/from16 v1, p1

    .line 916
    .line 917
    check-cast v1, Ljava/lang/String;

    .line 918
    .line 919
    new-instance v2, La/kk0;

    .line 920
    .line 921
    invoke-direct {v2, v0, v14, v1, v5}, La/kk0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 922
    .line 923
    .line 924
    invoke-static {v2}, La/dyb;->Q(Lkotlin/jvm/functions/Function0;)Z

    .line 925
    .line 926
    .line 927
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_15
    check-cast v0, La/vl8;

    .line 931
    .line 932
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 933
    .line 934
    move-object/from16 v1, p1

    .line 935
    .line 936
    check-cast v1, La/hcz;

    .line 937
    .line 938
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 939
    .line 940
    .line 941
    move-object v2, v0

    .line 942
    check-cast v2, La/tl8;

    .line 943
    .line 944
    iget-object v2, v2, La/tl8;->n:La/a4x;

    .line 945
    .line 946
    invoke-interface {v2}, Ljava/util/Collection;->size()I

    .line 947
    .line 948
    .line 949
    move-result v2

    .line 950
    new-instance v3, La/uk8;

    .line 951
    .line 952
    invoke-direct {v3, v0, v11}, La/uk8;-><init>(La/vl8;B)V

    .line 953
    .line 954
    .line 955
    new-instance v4, La/uk8;

    .line 956
    .line 957
    invoke-direct {v4, v0, v12}, La/uk8;-><init>(La/vl8;B)V

    .line 958
    .line 959
    .line 960
    new-instance v5, La/ec30;

    .line 961
    .line 962
    invoke-direct {v5, v0, v14}, La/ec30;-><init>(La/vl8;Lkotlin/jvm/functions/Function1;)V

    .line 963
    .line 964
    .line 965
    new-instance v0, La/ugd;

    .line 966
    .line 967
    const v6, 0x4a3c132

    .line 968
    .line 969
    .line 970
    invoke-direct {v0, v6, v12, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 971
    .line 972
    .line 973
    invoke-virtual {v1, v2, v3, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 974
    .line 975
    .line 976
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 977
    .line 978
    return-object v0

    .line 979
    :pswitch_16
    check-cast v0, La/v70;

    .line 980
    .line 981
    check-cast v14, La/nf8;

    .line 982
    .line 983
    move-object/from16 v1, p1

    .line 984
    .line 985
    check-cast v1, Landroid/view/View;

    .line 986
    .line 987
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 988
    .line 989
    .line 990
    iget-object v0, v0, La/v70;->v:Ljava/lang/Object;

    .line 991
    .line 992
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 993
    .line 994
    invoke-interface {v0, v14}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 995
    .line 996
    .line 997
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 998
    .line 999
    return-object v0

    .line 1000
    :pswitch_17
    move-object v2, v0

    .line 1001
    check-cast v2, La/pu90;

    .line 1002
    .line 1003
    check-cast v14, La/i88;

    .line 1004
    .line 1005
    move-object/from16 v1, p1

    .line 1006
    .line 1007
    check-cast v1, La/ou90;

    .line 1008
    .line 1009
    iget-object v5, v14, La/i88;->o:Lkotlin/jvm/functions/Function1;

    .line 1010
    .line 1011
    const/4 v6, 0x4

    .line 1012
    const/4 v3, 0x0

    .line 1013
    const/4 v4, 0x0

    .line 1014
    invoke-static/range {v1 .. v6}, La/ou90;->F(La/ou90;La/pu90;IILkotlin/jvm/functions/Function1;I)V

    .line 1015
    .line 1016
    .line 1017
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1018
    .line 1019
    return-object v0

    .line 1020
    :pswitch_18
    check-cast v0, La/w6k;

    .line 1021
    .line 1022
    check-cast v14, La/t33;

    .line 1023
    .line 1024
    move-object/from16 v1, p1

    .line 1025
    .line 1026
    check-cast v1, La/uag0;

    .line 1027
    .line 1028
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    invoke-virtual {v14}, La/t33;->d()Ljava/lang/Object;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v2

    .line 1035
    check-cast v2, Ljava/lang/Number;

    .line 1036
    .line 1037
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 1038
    .line 1039
    .line 1040
    move-result v2

    .line 1041
    invoke-interface {v0, v2}, La/w6k;->w0(F)F

    .line 1042
    .line 1043
    .line 1044
    move-result v0

    .line 1045
    neg-float v0, v0

    .line 1046
    invoke-virtual {v1, v0}, La/uag0;->H(F)V

    .line 1047
    .line 1048
    .line 1049
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1050
    .line 1051
    return-object v0

    .line 1052
    :pswitch_19
    check-cast v0, La/ru7;

    .line 1053
    .line 1054
    check-cast v14, Ljava/lang/String;

    .line 1055
    .line 1056
    move-object/from16 v1, p1

    .line 1057
    .line 1058
    check-cast v1, La/qqp0;

    .line 1059
    .line 1060
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1061
    .line 1062
    .line 1063
    instance-of v5, v1, La/mqp0;

    .line 1064
    .line 1065
    if-eqz v5, :cond_16

    .line 1066
    .line 1067
    goto/16 :goto_18

    .line 1068
    .line 1069
    :cond_16
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v3

    .line 1073
    if-eqz v3, :cond_17

    .line 1074
    .line 1075
    goto/16 :goto_17

    .line 1076
    .line 1077
    :cond_17
    instance-of v3, v1, La/oqp0;

    .line 1078
    .line 1079
    if-eqz v3, :cond_2c

    .line 1080
    .line 1081
    iget-object v0, v0, La/ru7;->h:La/n0o0;

    .line 1082
    .line 1083
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    check-cast v0, La/fee;

    .line 1088
    .line 1089
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v0

    .line 1093
    check-cast v0, La/a8h0;

    .line 1094
    .line 1095
    if-nez v0, :cond_18

    .line 1096
    .line 1097
    goto/16 :goto_17

    .line 1098
    .line 1099
    :cond_18
    iget-object v2, v0, La/a8h0;->b:La/z7h0;

    .line 1100
    .line 1101
    if-nez v2, :cond_19

    .line 1102
    .line 1103
    goto/16 :goto_18

    .line 1104
    .line 1105
    :cond_19
    check-cast v1, La/oqp0;

    .line 1106
    .line 1107
    iget-object v1, v1, La/oqp0;->a:Ljava/util/List;

    .line 1108
    .line 1109
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1110
    .line 1111
    .line 1112
    move-result-object v1

    .line 1113
    :cond_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1114
    .line 1115
    .line 1116
    move-result v3

    .line 1117
    if-eqz v3, :cond_1b

    .line 1118
    .line 1119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v3

    .line 1123
    move-object v5, v3

    .line 1124
    check-cast v5, La/sfp0;

    .line 1125
    .line 1126
    iget-object v5, v5, La/sfp0;->a:Ljava/lang/String;

    .line 1127
    .line 1128
    iget-object v6, v0, La/a8h0;->a:Ljava/lang/String;

    .line 1129
    .line 1130
    invoke-virtual {v5, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1131
    .line 1132
    .line 1133
    move-result v5

    .line 1134
    if-eqz v5, :cond_1a

    .line 1135
    .line 1136
    goto :goto_d

    .line 1137
    :cond_1b
    move-object v3, v13

    .line 1138
    :goto_d
    check-cast v3, La/sfp0;

    .line 1139
    .line 1140
    if-eqz v3, :cond_2b

    .line 1141
    .line 1142
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    instance-of v0, v2, La/y7h0;

    .line 1146
    .line 1147
    if-eqz v0, :cond_23

    .line 1148
    .line 1149
    iget-object v0, v3, La/sfp0;->c:Ljava/util/ArrayList;

    .line 1150
    .line 1151
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    :cond_1c
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1156
    .line 1157
    .line 1158
    move-result v1

    .line 1159
    if-eqz v1, :cond_1e

    .line 1160
    .line 1161
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    move-object v3, v1

    .line 1166
    check-cast v3, La/v800;

    .line 1167
    .line 1168
    iget v3, v3, La/v800;->b:I

    .line 1169
    .line 1170
    move-object v5, v2

    .line 1171
    check-cast v5, La/y7h0;

    .line 1172
    .line 1173
    iget-object v5, v5, La/y7h0;->a:Ljava/lang/Integer;

    .line 1174
    .line 1175
    if-nez v5, :cond_1d

    .line 1176
    .line 1177
    goto :goto_e

    .line 1178
    :cond_1d
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1179
    .line 1180
    .line 1181
    move-result v5

    .line 1182
    if-ne v3, v5, :cond_1c

    .line 1183
    .line 1184
    goto :goto_f

    .line 1185
    :cond_1e
    move-object v1, v13

    .line 1186
    :goto_f
    check-cast v1, La/v800;

    .line 1187
    .line 1188
    if-eqz v1, :cond_21

    .line 1189
    .line 1190
    iget-object v0, v1, La/v800;->c:Ljava/util/List;

    .line 1191
    .line 1192
    if-eqz v0, :cond_21

    .line 1193
    .line 1194
    new-instance v1, Ljava/util/ArrayList;

    .line 1195
    .line 1196
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1197
    .line 1198
    .line 1199
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    :cond_1f
    :goto_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1204
    .line 1205
    .line 1206
    move-result v3

    .line 1207
    if-eqz v3, :cond_20

    .line 1208
    .line 1209
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v3

    .line 1213
    move-object v5, v3

    .line 1214
    check-cast v5, La/lu90;

    .line 1215
    .line 1216
    iget-boolean v5, v5, La/lu90;->g:Z

    .line 1217
    .line 1218
    if-eqz v5, :cond_1f

    .line 1219
    .line 1220
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1221
    .line 1222
    .line 1223
    goto :goto_10

    .line 1224
    :cond_20
    new-instance v13, Ljava/util/ArrayList;

    .line 1225
    .line 1226
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1227
    .line 1228
    .line 1229
    move-result v0

    .line 1230
    invoke-direct {v13, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1231
    .line 1232
    .line 1233
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v0

    .line 1237
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1238
    .line 1239
    .line 1240
    move-result v1

    .line 1241
    if-eqz v1, :cond_21

    .line 1242
    .line 1243
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v1

    .line 1247
    check-cast v1, La/lu90;

    .line 1248
    .line 1249
    invoke-static {v1, v14}, La/zvw;->c0(La/a9a0;Ljava/lang/String;)La/t0a0;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v1

    .line 1253
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1254
    .line 1255
    .line 1256
    goto :goto_11

    .line 1257
    :cond_21
    if-nez v13, :cond_22

    .line 1258
    .line 1259
    sget-object v13, La/iun;->a:La/iun;

    .line 1260
    .line 1261
    :cond_22
    invoke-static {v13}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    goto :goto_14

    .line 1266
    :cond_23
    instance-of v0, v2, La/x7h0;

    .line 1267
    .line 1268
    if-eqz v0, :cond_2a

    .line 1269
    .line 1270
    iget-object v0, v3, La/sfp0;->d:Ljava/util/ArrayList;

    .line 1271
    .line 1272
    new-instance v1, Ljava/util/ArrayList;

    .line 1273
    .line 1274
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1275
    .line 1276
    .line 1277
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    :cond_24
    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    if-eqz v3, :cond_25

    .line 1286
    .line 1287
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v3

    .line 1291
    move-object v5, v3

    .line 1292
    check-cast v5, La/zen0;

    .line 1293
    .line 1294
    iget-boolean v5, v5, La/zen0;->e:Z

    .line 1295
    .line 1296
    if-eqz v5, :cond_24

    .line 1297
    .line 1298
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    goto :goto_12

    .line 1302
    :cond_25
    new-instance v0, Ljava/util/ArrayList;

    .line 1303
    .line 1304
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1305
    .line 1306
    .line 1307
    move-result v3

    .line 1308
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v1

    .line 1315
    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v3

    .line 1319
    if-eqz v3, :cond_26

    .line 1320
    .line 1321
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v3

    .line 1325
    check-cast v3, La/zen0;

    .line 1326
    .line 1327
    invoke-static {v3, v14}, La/zvw;->c0(La/a9a0;Ljava/lang/String;)La/t0a0;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v3

    .line 1331
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1332
    .line 1333
    .line 1334
    goto :goto_13

    .line 1335
    :cond_26
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v0

    .line 1339
    :goto_14
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v1

    .line 1343
    move v3, v11

    .line 1344
    :goto_15
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1345
    .line 1346
    .line 1347
    move-result v5

    .line 1348
    if-eqz v5, :cond_28

    .line 1349
    .line 1350
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1351
    .line 1352
    .line 1353
    move-result-object v5

    .line 1354
    check-cast v5, La/t0a0;

    .line 1355
    .line 1356
    iget-object v5, v5, La/t0a0;->a:Ljava/lang/String;

    .line 1357
    .line 1358
    invoke-interface {v2}, La/z7h0;->a()Ljava/lang/String;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v6

    .line 1362
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1363
    .line 1364
    .line 1365
    move-result v5

    .line 1366
    if-eqz v5, :cond_27

    .line 1367
    .line 1368
    goto :goto_16

    .line 1369
    :cond_27
    add-int/lit8 v3, v3, 0x1

    .line 1370
    .line 1371
    goto :goto_15

    .line 1372
    :cond_28
    move v3, v4

    .line 1373
    :goto_16
    new-instance v13, La/rn8;

    .line 1374
    .line 1375
    if-eq v3, v4, :cond_29

    .line 1376
    .line 1377
    move v11, v3

    .line 1378
    :cond_29
    invoke-direct {v13, v11, v0}, La/rn8;-><init>(ILa/a4x;)V

    .line 1379
    .line 1380
    .line 1381
    goto :goto_18

    .line 1382
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1383
    .line 1384
    .line 1385
    goto :goto_18

    .line 1386
    :cond_2b
    :goto_17
    sget-object v13, La/sn8;->a:La/sn8;

    .line 1387
    .line 1388
    goto :goto_18

    .line 1389
    :cond_2c
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1390
    .line 1391
    .line 1392
    move-result v0

    .line 1393
    if-eqz v0, :cond_2d

    .line 1394
    .line 1395
    goto :goto_18

    .line 1396
    :cond_2d
    invoke-static {}, La/t9f;->b()V

    .line 1397
    .line 1398
    .line 1399
    :goto_18
    return-object v13

    .line 1400
    :pswitch_1a
    check-cast v0, La/ru7;

    .line 1401
    .line 1402
    check-cast v14, La/mum0;

    .line 1403
    .line 1404
    move-object/from16 v1, p1

    .line 1405
    .line 1406
    check-cast v1, La/qqp0;

    .line 1407
    .line 1408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1409
    .line 1410
    .line 1411
    instance-of v5, v1, La/mqp0;

    .line 1412
    .line 1413
    if-eqz v5, :cond_2e

    .line 1414
    .line 1415
    goto/16 :goto_1e

    .line 1416
    .line 1417
    :cond_2e
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1418
    .line 1419
    .line 1420
    move-result v3

    .line 1421
    if-eqz v3, :cond_2f

    .line 1422
    .line 1423
    goto/16 :goto_1d

    .line 1424
    .line 1425
    :cond_2f
    instance-of v3, v1, La/oqp0;

    .line 1426
    .line 1427
    if-eqz v3, :cond_3a

    .line 1428
    .line 1429
    iget-object v0, v0, La/ru7;->h:La/n0o0;

    .line 1430
    .line 1431
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v0

    .line 1435
    check-cast v0, La/fee;

    .line 1436
    .line 1437
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v0

    .line 1441
    check-cast v0, La/a8h0;

    .line 1442
    .line 1443
    if-eqz v0, :cond_39

    .line 1444
    .line 1445
    iget-object v0, v0, La/a8h0;->a:Ljava/lang/String;

    .line 1446
    .line 1447
    if-nez v0, :cond_30

    .line 1448
    .line 1449
    goto/16 :goto_1d

    .line 1450
    .line 1451
    :cond_30
    check-cast v1, La/oqp0;

    .line 1452
    .line 1453
    iget-object v1, v1, La/oqp0;->a:Ljava/util/List;

    .line 1454
    .line 1455
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v2

    .line 1459
    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1460
    .line 1461
    .line 1462
    move-result v3

    .line 1463
    if-eqz v3, :cond_32

    .line 1464
    .line 1465
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v3

    .line 1469
    check-cast v3, La/sfp0;

    .line 1470
    .line 1471
    iget-object v3, v3, La/sfp0;->a:Ljava/lang/String;

    .line 1472
    .line 1473
    invoke-virtual {v3, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1474
    .line 1475
    .line 1476
    move-result v3

    .line 1477
    if-eqz v3, :cond_31

    .line 1478
    .line 1479
    goto :goto_1a

    .line 1480
    :cond_31
    add-int/lit8 v11, v11, 0x1

    .line 1481
    .line 1482
    goto :goto_19

    .line 1483
    :cond_32
    move v11, v4

    .line 1484
    :goto_1a
    if-ne v11, v4, :cond_33

    .line 1485
    .line 1486
    goto :goto_1d

    .line 1487
    :cond_33
    new-instance v0, Ljava/util/ArrayList;

    .line 1488
    .line 1489
    invoke-static {v1, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1490
    .line 1491
    .line 1492
    move-result v2

    .line 1493
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1494
    .line 1495
    .line 1496
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v1

    .line 1500
    :goto_1b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1501
    .line 1502
    .line 1503
    move-result v2

    .line 1504
    if-eqz v2, :cond_34

    .line 1505
    .line 1506
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v2

    .line 1510
    check-cast v2, La/sfp0;

    .line 1511
    .line 1512
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1513
    .line 1514
    .line 1515
    new-instance v3, La/yvh0;

    .line 1516
    .line 1517
    iget-object v2, v2, La/sfp0;->b:Ljava/lang/String;

    .line 1518
    .line 1519
    sget-object v4, La/bwh0;->a:La/bwh0;

    .line 1520
    .line 1521
    invoke-direct {v3, v2, v4}, La/yvh0;-><init>(Ljava/lang/String;La/dwh0;)V

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1525
    .line 1526
    .line 1527
    goto :goto_1b

    .line 1528
    :cond_34
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    iget-object v1, v14, La/mum0;->x:La/zvh0;

    .line 1533
    .line 1534
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 1535
    .line 1536
    .line 1537
    move-result v1

    .line 1538
    if-eqz v1, :cond_38

    .line 1539
    .line 1540
    if-eq v1, v12, :cond_37

    .line 1541
    .line 1542
    if-eq v1, v9, :cond_36

    .line 1543
    .line 1544
    if-ne v1, v10, :cond_35

    .line 1545
    .line 1546
    sget-object v1, La/bxh0;->a:La/bxh0;

    .line 1547
    .line 1548
    goto :goto_1c

    .line 1549
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 1550
    .line 1551
    .line 1552
    goto :goto_1f

    .line 1553
    :cond_36
    sget-object v1, La/cxh0;->a:La/cxh0;

    .line 1554
    .line 1555
    goto :goto_1c

    .line 1556
    :cond_37
    sget-object v1, La/zwh0;->a:La/zwh0;

    .line 1557
    .line 1558
    goto :goto_1c

    .line 1559
    :cond_38
    sget-object v1, La/axh0;->a:La/axh0;

    .line 1560
    .line 1561
    :goto_1c
    new-instance v13, La/nwh0;

    .line 1562
    .line 1563
    invoke-direct {v13, v11, v0, v1}, La/nwh0;-><init>(ILa/a4x;La/dxh0;)V

    .line 1564
    .line 1565
    .line 1566
    goto :goto_1f

    .line 1567
    :cond_39
    :goto_1d
    sget-object v13, La/pwh0;->a:La/pwh0;

    .line 1568
    .line 1569
    goto :goto_1f

    .line 1570
    :cond_3a
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1571
    .line 1572
    .line 1573
    move-result v0

    .line 1574
    if-eqz v0, :cond_3b

    .line 1575
    .line 1576
    :goto_1e
    sget-object v13, La/owh0;->a:La/owh0;

    .line 1577
    .line 1578
    goto :goto_1f

    .line 1579
    :cond_3b
    invoke-static {}, La/t9f;->b()V

    .line 1580
    .line 1581
    .line 1582
    :goto_1f
    return-object v13

    .line 1583
    :pswitch_1b
    move-object v2, v0

    .line 1584
    check-cast v2, La/mhc;

    .line 1585
    .line 1586
    move-object v3, v14

    .line 1587
    check-cast v3, La/pw4;

    .line 1588
    .line 1589
    move-object/from16 v1, p1

    .line 1590
    .line 1591
    check-cast v1, La/cp;

    .line 1592
    .line 1593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1594
    .line 1595
    .line 1596
    new-instance v0, La/ft7;

    .line 1597
    .line 1598
    move-object v4, v1

    .line 1599
    move-object v5, v2

    .line 1600
    move-object v6, v3

    .line 1601
    invoke-direct/range {v0 .. v6}, La/ft7;-><init>(La/cp;La/mhc;La/pw4;La/cp;La/mhc;La/pw4;)V

    .line 1602
    .line 1603
    .line 1604
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1605
    .line 1606
    .line 1607
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1608
    .line 1609
    return-object v0

    .line 1610
    :pswitch_1c
    check-cast v0, La/gr00;

    .line 1611
    .line 1612
    check-cast v14, Ljava/lang/String;

    .line 1613
    .line 1614
    move-object/from16 v1, p1

    .line 1615
    .line 1616
    check-cast v1, La/k0w0;

    .line 1617
    .line 1618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1619
    .line 1620
    .line 1621
    iget-object v0, v0, La/gr00;->d:Ljava/lang/Object;

    .line 1622
    .line 1623
    new-instance v3, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 1624
    .line 1625
    const/16 v0, 0xe

    .line 1626
    .line 1627
    invoke-direct {v3, v14, v0, v13, v13}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 1628
    .line 1629
    .line 1630
    new-instance v2, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 1631
    .line 1632
    const v4, 0x7f1311a1

    .line 1633
    .line 1634
    .line 1635
    const/4 v5, 0x0

    .line 1636
    const/4 v6, 0x0

    .line 1637
    const/4 v7, 0x0

    .line 1638
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1642
    .line 1643
    .line 1644
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1645
    .line 1646
    return-object v0

    .line 1647
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
