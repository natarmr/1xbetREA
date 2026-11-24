.class public final synthetic La/ys3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ys3;->a:B

    iput-object p1, p0, La/ys3;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ys3;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ys3;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/16 v4, 0x17

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    iget-object v6, v0, La/ys3;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/ys3;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/a4x;

    .line 18
    .line 19
    check-cast v6, La/rfv;

    .line 20
    .line 21
    move-object/from16 v7, p1

    .line 22
    .line 23
    check-cast v7, La/i8z;

    .line 24
    .line 25
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, La/ij4;

    .line 29
    .line 30
    const/16 v2, 0x16

    .line 31
    .line 32
    invoke-direct {v1, v2}, La/ij4;-><init>(B)V

    .line 33
    .line 34
    .line 35
    new-instance v2, La/ij4;

    .line 36
    .line 37
    invoke-direct {v2, v4}, La/ij4;-><init>(B)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 41
    .line 42
    .line 43
    move-result v8

    .line 44
    new-instance v9, La/ci2;

    .line 45
    .line 46
    const/16 v3, 0x12

    .line 47
    .line 48
    invoke-direct {v9, v1, v0, v3}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 49
    .line 50
    .line 51
    new-instance v11, La/ci2;

    .line 52
    .line 53
    const/16 v1, 0x13

    .line 54
    .line 55
    invoke-direct {v11, v2, v0, v1}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance v1, La/xe4;

    .line 59
    .line 60
    invoke-direct {v1, v0, v6, v5}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 61
    .line 62
    .line 63
    new-instance v12, La/ugd;

    .line 64
    .line 65
    const v0, -0x4297e015

    .line 66
    .line 67
    .line 68
    invoke-direct {v12, v0, v5, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    const/4 v10, 0x0

    .line 72
    invoke-virtual/range {v7 .. v12}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 73
    .line 74
    .line 75
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 76
    .line 77
    return-object v0

    .line 78
    :pswitch_0
    check-cast v0, La/cg5;

    .line 79
    .line 80
    check-cast v6, La/vne;

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, Ljava/lang/Throwable;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    iget-object v2, v0, La/cg5;->j:La/p7m0;

    .line 93
    .line 94
    sget-object v4, La/i8d;->e:La/i8d;

    .line 95
    .line 96
    invoke-virtual {v2, v3, v4}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0, v1, v6}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 100
    .line 101
    .line 102
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_1
    check-cast v0, La/rb5;

    .line 106
    .line 107
    check-cast v6, La/uhd;

    .line 108
    .line 109
    move-object/from16 v1, p1

    .line 110
    .line 111
    check-cast v1, La/lwk;

    .line 112
    .line 113
    invoke-virtual {v0, v6}, La/rb5;->a(La/c2;)V

    .line 114
    .line 115
    .line 116
    new-instance v1, La/pr0;

    .line 117
    .line 118
    const/4 v2, 0x2

    .line 119
    invoke-direct {v1, v0, v6, v2}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 120
    .line 121
    .line 122
    return-object v1

    .line 123
    :pswitch_2
    check-cast v0, La/ka5;

    .line 124
    .line 125
    check-cast v6, La/la5;

    .line 126
    .line 127
    move-object/from16 v1, p1

    .line 128
    .line 129
    check-cast v1, La/bff0;

    .line 130
    .line 131
    iget-object v1, v0, La/ka5;->o:La/scq0;

    .line 132
    .line 133
    if-eqz v1, :cond_0

    .line 134
    .line 135
    invoke-virtual {v1}, La/scq0;->b()V

    .line 136
    .line 137
    .line 138
    :cond_0
    iput-object v3, v0, La/ka5;->o:La/scq0;

    .line 139
    .line 140
    iget-object v0, v6, La/la5;->c:La/odd;

    .line 141
    .line 142
    if-eqz v0, :cond_1

    .line 143
    .line 144
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    invoke-virtual {v0, v1}, La/pby;->N(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    :cond_1
    iput-object v3, v6, La/la5;->c:La/odd;

    .line 150
    .line 151
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    return-object v0

    .line 154
    :pswitch_3
    check-cast v0, La/fy4;

    .line 155
    .line 156
    move-object v9, v6

    .line 157
    check-cast v9, Ljava/lang/String;

    .line 158
    .line 159
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, La/m97;

    .line 162
    .line 163
    iget-object v2, v0, La/fy4;->J:La/loi0;

    .line 164
    .line 165
    iget-boolean v1, v1, La/m97;->d:Z

    .line 166
    .line 167
    iget-object v2, v2, La/loi0;->a:La/h03;

    .line 168
    .line 169
    iget-object v2, v2, La/h03;->b:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v2, La/nb7;

    .line 172
    .line 173
    iput-boolean v1, v2, La/nb7;->b:Z

    .line 174
    .line 175
    iget-object v0, v0, La/fy4;->a0:La/ol60;

    .line 176
    .line 177
    new-instance v1, La/fw4;

    .line 178
    .line 179
    new-instance v7, La/xdk0;

    .line 180
    .line 181
    sget-object v8, La/rek0;->b:La/rek0;

    .line 182
    .line 183
    sget-object v12, La/jdk0;->a:La/jdk0;

    .line 184
    .line 185
    const/4 v13, 0x0

    .line 186
    const/16 v14, 0x6c

    .line 187
    .line 188
    const/4 v10, 0x0

    .line 189
    const/4 v11, 0x0

    .line 190
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 191
    .line 192
    .line 193
    invoke-direct {v1, v7}, La/fw4;-><init>(La/xdk0;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 197
    .line 198
    .line 199
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 200
    .line 201
    return-object v0

    .line 202
    :pswitch_4
    check-cast v0, La/ku4;

    .line 203
    .line 204
    check-cast v6, Lkotlin/jvm/functions/Function0;

    .line 205
    .line 206
    move-object/from16 v1, p1

    .line 207
    .line 208
    check-cast v1, Ljava/lang/Integer;

    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    if-eqz v1, :cond_3

    .line 215
    .line 216
    if-eq v1, v5, :cond_2

    .line 217
    .line 218
    goto :goto_0

    .line 219
    :cond_2
    invoke-interface {v6}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    goto :goto_0

    .line 223
    :cond_3
    iget-object v1, v0, La/ku4;->v:La/ol60;

    .line 224
    .line 225
    new-instance v2, La/qt4;

    .line 226
    .line 227
    iget-object v3, v0, La/ku4;->B:Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;

    .line 228
    .line 229
    iget-object v0, v0, La/ku4;->C:Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;

    .line 230
    .line 231
    invoke-direct {v2, v3, v0}, La/qt4;-><init>(Lorg/xplatform/authenticator/impl/util/NotificationTypeInfo;Lorg/xplatform/authenticator/impl/util/NotificationPeriodInfo;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 235
    .line 236
    .line 237
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    return-object v0

    .line 240
    :pswitch_5
    check-cast v0, La/jkm;

    .line 241
    .line 242
    check-cast v6, Ljava/lang/String;

    .line 243
    .line 244
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, La/kkm;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v1, v1, La/kkm;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 252
    .line 253
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result v0

    .line 260
    if-lez v0, :cond_4

    .line 261
    .line 262
    invoke-virtual {v1, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setSubtitleText(Ljava/lang/CharSequence;)V

    .line 263
    .line 264
    .line 265
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 269
    .line 270
    check-cast v6, La/wq4;

    .line 271
    .line 272
    move-object/from16 v1, p1

    .line 273
    .line 274
    check-cast v1, La/mvl;

    .line 275
    .line 276
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 277
    .line 278
    .line 279
    iget-object v1, v6, La/wq4;->b:La/yq4;

    .line 280
    .line 281
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_7
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 288
    .line 289
    check-cast v6, La/ydj;

    .line 290
    .line 291
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, Ljava/lang/Long;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    iget-object v1, v6, La/ydj;->a:La/q760;

    .line 299
    .line 300
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 304
    .line 305
    return-object v0

    .line 306
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 307
    .line 308
    check-cast v6, La/e860;

    .line 309
    .line 310
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Ljava/lang/Long;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    iget-object v1, v6, La/e860;->a:La/c860;

    .line 318
    .line 319
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    return-object v0

    .line 325
    :pswitch_9
    check-cast v0, La/kp4;

    .line 326
    .line 327
    check-cast v6, Ljava/lang/Throwable;

    .line 328
    .line 329
    move-object/from16 v1, p1

    .line 330
    .line 331
    check-cast v1, La/k0w0;

    .line 332
    .line 333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    iget-object v0, v0, La/kp4;->s:La/rek0;

    .line 337
    .line 338
    invoke-virtual {v6}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v3

    .line 342
    if-nez v3, :cond_5

    .line 343
    .line 344
    const-string v3, ""

    .line 345
    .line 346
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    new-instance v0, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;

    .line 350
    .line 351
    invoke-direct {v0, v3, v2}, Lorg/xplatform/authenticator/impl/navigation/AuthenticatorScreenFactoryImpl$registrationFailScreen$1;-><init>(Ljava/lang/String;Z)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 361
    .line 362
    check-cast v6, La/xo4;

    .line 363
    .line 364
    move-object/from16 v1, p1

    .line 365
    .line 366
    check-cast v1, Ljava/lang/String;

    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    invoke-interface {v0, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    .line 373
    .line 374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 375
    .line 376
    return-object v0

    .line 377
    :pswitch_b
    check-cast v0, La/df2;

    .line 378
    .line 379
    check-cast v6, La/uu4;

    .line 380
    .line 381
    move-object/from16 v1, p1

    .line 382
    .line 383
    check-cast v1, Ljava/lang/Throwable;

    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, v1, v6}, La/df2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_c
    check-cast v0, La/df2;

    .line 395
    .line 396
    check-cast v6, La/ru4;

    .line 397
    .line 398
    move-object/from16 v1, p1

    .line 399
    .line 400
    check-cast v1, Ljava/lang/Throwable;

    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v0, v1, v6}, La/df2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_d
    check-cast v0, La/df2;

    .line 412
    .line 413
    check-cast v6, La/uu4;

    .line 414
    .line 415
    move-object/from16 v1, p1

    .line 416
    .line 417
    check-cast v1, Ljava/lang/Throwable;

    .line 418
    .line 419
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v1, v6}, La/df2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 426
    .line 427
    return-object v0

    .line 428
    :pswitch_e
    check-cast v0, La/df2;

    .line 429
    .line 430
    check-cast v6, La/uu4;

    .line 431
    .line 432
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, Ljava/lang/Throwable;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v1, v6}, La/df2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 443
    .line 444
    return-object v0

    .line 445
    :pswitch_f
    check-cast v0, La/hk4;

    .line 446
    .line 447
    check-cast v6, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 448
    .line 449
    move-object/from16 v1, p1

    .line 450
    .line 451
    check-cast v1, Ljava/lang/Throwable;

    .line 452
    .line 453
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 457
    .line 458
    invoke-direct {v2, v1, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0, v2}, La/hk4;->P(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 462
    .line 463
    .line 464
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_10
    check-cast v0, La/hk4;

    .line 468
    .line 469
    check-cast v6, Ljava/lang/String;

    .line 470
    .line 471
    move-object/from16 v1, p1

    .line 472
    .line 473
    check-cast v1, Ljava/lang/Throwable;

    .line 474
    .line 475
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 479
    .line 480
    new-instance v3, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 481
    .line 482
    invoke-direct {v3, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;-><init>(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    invoke-direct {v2, v1, v3}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v2}, La/hk4;->P(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 489
    .line 490
    .line 491
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    return-object v0

    .line 494
    :pswitch_11
    move-object v2, v0

    .line 495
    check-cast v2, La/t89;

    .line 496
    .line 497
    check-cast v6, La/pz40;

    .line 498
    .line 499
    move-object/from16 v1, p1

    .line 500
    .line 501
    check-cast v1, La/g7z;

    .line 502
    .line 503
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 504
    .line 505
    .line 506
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 507
    .line 508
    .line 509
    move-result-object v0

    .line 510
    check-cast v0, Ljava/lang/Boolean;

    .line 511
    .line 512
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 513
    .line 514
    .line 515
    move-result v0

    .line 516
    if-eqz v0, :cond_6

    .line 517
    .line 518
    invoke-virtual {v1}, La/g7z;->a()V

    .line 519
    .line 520
    .line 521
    goto :goto_1

    .line 522
    :cond_6
    const/4 v10, 0x0

    .line 523
    const/16 v11, 0x7e

    .line 524
    .line 525
    const-wide/16 v3, 0x0

    .line 526
    .line 527
    const-wide/16 v5, 0x0

    .line 528
    .line 529
    const/4 v7, 0x0

    .line 530
    const/4 v8, 0x0

    .line 531
    const/4 v9, 0x0

    .line 532
    invoke-static/range {v1 .. v11}, La/fhl;->r(La/fhl;La/t89;JJFLa/agc;La/a4d;II)V

    .line 533
    .line 534
    .line 535
    :goto_1
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 536
    .line 537
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getBlack30-0d7_KjU()J

    .line 538
    .line 539
    .line 540
    move-result-wide v8

    .line 541
    const/16 v17, 0x0

    .line 542
    .line 543
    const/16 v18, 0x7e

    .line 544
    .line 545
    const-wide/16 v10, 0x0

    .line 546
    .line 547
    const-wide/16 v12, 0x0

    .line 548
    .line 549
    const/4 v14, 0x0

    .line 550
    const/4 v15, 0x0

    .line 551
    const/16 v16, 0x0

    .line 552
    .line 553
    move-object v7, v1

    .line 554
    invoke-static/range {v7 .. v18}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 555
    .line 556
    .line 557
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 558
    .line 559
    return-object v0

    .line 560
    :pswitch_12
    check-cast v0, La/fh4;

    .line 561
    .line 562
    check-cast v6, Ljava/lang/String;

    .line 563
    .line 564
    move-object/from16 v1, p1

    .line 565
    .line 566
    check-cast v1, Ljava/lang/Throwable;

    .line 567
    .line 568
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 569
    .line 570
    .line 571
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 572
    .line 573
    new-instance v3, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 574
    .line 575
    invoke-direct {v3, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;-><init>(Ljava/lang/String;)V

    .line 576
    .line 577
    .line 578
    invoke-direct {v2, v1, v3}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v2}, La/fh4;->P(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 582
    .line 583
    .line 584
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 585
    .line 586
    return-object v0

    .line 587
    :pswitch_13
    check-cast v0, La/fh4;

    .line 588
    .line 589
    check-cast v6, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 590
    .line 591
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, Ljava/lang/Throwable;

    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 599
    .line 600
    invoke-direct {v2, v1, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 601
    .line 602
    .line 603
    invoke-virtual {v0, v2}, La/fh4;->P(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 604
    .line 605
    .line 606
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 607
    .line 608
    return-object v0

    .line 609
    :pswitch_14
    check-cast v0, La/fh4;

    .line 610
    .line 611
    check-cast v6, Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;

    .line 612
    .line 613
    move-object/from16 v1, p1

    .line 614
    .line 615
    check-cast v1, La/k0w0;

    .line 616
    .line 617
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    iget-object v0, v0, La/fh4;->V:La/kwd;

    .line 621
    .line 622
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 623
    .line 624
    .line 625
    new-instance v0, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;

    .line 626
    .line 627
    invoke-direct {v0, v6}, Lorg/xplatform/login/new_place/impl/navigation/ConfirmationNewPlaceScreen;-><init>(Lorg/xplatform/login/new_place/api/navigation/ConfirmationNewPlaceScreenType;)V

    .line 628
    .line 629
    .line 630
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 631
    .line 632
    .line 633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 634
    .line 635
    return-object v0

    .line 636
    :pswitch_15
    check-cast v0, La/l7m0;

    .line 637
    .line 638
    check-cast v6, La/ze4;

    .line 639
    .line 640
    move-object/from16 v1, p1

    .line 641
    .line 642
    check-cast v1, La/hcz;

    .line 643
    .line 644
    sget-object v3, La/ze4;->g2:La/qek0;

    .line 645
    .line 646
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 647
    .line 648
    .line 649
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    move-result-object v0

    .line 653
    check-cast v0, Ljava/util/List;

    .line 654
    .line 655
    new-instance v3, La/or3;

    .line 656
    .line 657
    const/16 v7, 0x11

    .line 658
    .line 659
    invoke-direct {v3, v7}, La/or3;-><init>(B)V

    .line 660
    .line 661
    .line 662
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 663
    .line 664
    .line 665
    move-result v7

    .line 666
    new-instance v8, La/ci2;

    .line 667
    .line 668
    const/16 v9, 0xf

    .line 669
    .line 670
    invoke-direct {v8, v3, v0, v9}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 671
    .line 672
    .line 673
    new-instance v3, La/b8;

    .line 674
    .line 675
    invoke-direct {v3, v0, v4}, La/b8;-><init>(Ljava/util/List;B)V

    .line 676
    .line 677
    .line 678
    new-instance v4, La/xe4;

    .line 679
    .line 680
    invoke-direct {v4, v0, v6, v2}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 681
    .line 682
    .line 683
    new-instance v0, La/ugd;

    .line 684
    .line 685
    const v2, 0x2fd4df92

    .line 686
    .line 687
    .line 688
    invoke-direct {v0, v2, v5, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v1, v7, v8, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 692
    .line 693
    .line 694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_16
    check-cast v0, La/kc4;

    .line 698
    .line 699
    check-cast v6, Ljava/util/List;

    .line 700
    .line 701
    move-object/from16 v1, p1

    .line 702
    .line 703
    check-cast v1, La/k0w0;

    .line 704
    .line 705
    iget-object v0, v0, La/kc4;->T:La/dmt;

    .line 706
    .line 707
    new-instance v2, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;

    .line 708
    .line 709
    invoke-static {v6}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object v3

    .line 713
    check-cast v3, La/q7f0;

    .line 714
    .line 715
    invoke-direct {v2, v3}, Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;-><init>(La/q7f0;)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0, v2}, La/dmt;->a(Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;)Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 723
    .line 724
    .line 725
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 726
    .line 727
    return-object v0

    .line 728
    :pswitch_17
    check-cast v0, La/kc4;

    .line 729
    .line 730
    check-cast v6, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Social;

    .line 731
    .line 732
    move-object/from16 v1, p1

    .line 733
    .line 734
    check-cast v1, Ljava/lang/Throwable;

    .line 735
    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 740
    .line 741
    invoke-direct {v2, v1, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v0, v2}, La/kc4;->O(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 745
    .line 746
    .line 747
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 748
    .line 749
    return-object v0

    .line 750
    :pswitch_18
    check-cast v0, La/kc4;

    .line 751
    .line 752
    check-cast v6, Ljava/lang/String;

    .line 753
    .line 754
    move-object/from16 v1, p1

    .line 755
    .line 756
    check-cast v1, Ljava/lang/Throwable;

    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 759
    .line 760
    .line 761
    new-instance v2, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;

    .line 762
    .line 763
    new-instance v3, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;

    .line 764
    .line 765
    invoke-direct {v3, v6}, Lorg/xplatform/login/core/presentation/model/AuthDataModel$Qr;-><init>(Ljava/lang/String;)V

    .line 766
    .line 767
    .line 768
    invoke-direct {v2, v1, v3}, Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;-><init>(Ljava/lang/Throwable;Lorg/xplatform/login/core/presentation/model/AuthDataModel;)V

    .line 769
    .line 770
    .line 771
    invoke-virtual {v0, v2}, La/kc4;->O(Lorg/xplatform/login/core/presentation/model/AuthDataErrorModel;)V

    .line 772
    .line 773
    .line 774
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 775
    .line 776
    return-object v0

    .line 777
    :pswitch_19
    check-cast v0, La/x1o;

    .line 778
    .line 779
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 780
    .line 781
    move-object/from16 v1, p1

    .line 782
    .line 783
    check-cast v1, La/db10;

    .line 784
    .line 785
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    iget-object v1, v1, La/db10;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 789
    .line 790
    check-cast v0, La/v1o;

    .line 791
    .line 792
    iget-object v0, v0, La/v1o;->a:La/jkm;

    .line 793
    .line 794
    sget v2, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 795
    .line 796
    new-instance v2, La/bmh;

    .line 797
    .line 798
    const/16 v3, 0xc

    .line 799
    .line 800
    invoke-direct {v2, v3}, La/bmh;-><init>(B)V

    .line 801
    .line 802
    .line 803
    const-wide/16 v3, 0x2710

    .line 804
    .line 805
    invoke-virtual {v1, v0, v3, v4, v2}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 806
    .line 807
    .line 808
    new-instance v0, La/zk2;

    .line 809
    .line 810
    const/16 v2, 0x10

    .line 811
    .line 812
    invoke-direct {v0, v6, v2}, La/zk2;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setButtonOnClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 816
    .line 817
    .line 818
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_1a
    check-cast v0, La/bk2;

    .line 822
    .line 823
    check-cast v6, La/cp;

    .line 824
    .line 825
    move-object/from16 v1, p1

    .line 826
    .line 827
    check-cast v1, Landroid/view/View;

    .line 828
    .line 829
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    invoke-virtual {v6}, La/cp;->u()Ljava/lang/Object;

    .line 833
    .line 834
    .line 835
    move-result-object v1

    .line 836
    check-cast v1, La/v54;

    .line 837
    .line 838
    iget v1, v1, La/v54;->d:I

    .line 839
    .line 840
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 841
    .line 842
    .line 843
    move-result-object v1

    .line 844
    invoke-virtual {v0, v1}, La/bk2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 845
    .line 846
    .line 847
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 848
    .line 849
    return-object v0

    .line 850
    :pswitch_1b
    check-cast v0, La/pz40;

    .line 851
    .line 852
    check-cast v6, La/agk0;

    .line 853
    .line 854
    move-object/from16 v1, p1

    .line 855
    .line 856
    check-cast v1, Ljava/lang/Float;

    .line 857
    .line 858
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 859
    .line 860
    .line 861
    move-result v1

    .line 862
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v0

    .line 866
    check-cast v0, La/tly;

    .line 867
    .line 868
    iget-boolean v0, v0, La/tly;->a:Z

    .line 869
    .line 870
    if-nez v0, :cond_7

    .line 871
    .line 872
    invoke-virtual {v6, v1}, La/agk0;->m(F)V

    .line 873
    .line 874
    .line 875
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 876
    .line 877
    return-object v0

    .line 878
    :pswitch_1c
    check-cast v0, La/zu3;

    .line 879
    .line 880
    check-cast v6, La/mie0;

    .line 881
    .line 882
    move-object/from16 v1, p1

    .line 883
    .line 884
    check-cast v1, Ljava/lang/Throwable;

    .line 885
    .line 886
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    instance-of v2, v1, La/zhi0;

    .line 890
    .line 891
    if-eqz v2, :cond_8

    .line 892
    .line 893
    move-object v2, v1

    .line 894
    check-cast v2, La/zhi0;

    .line 895
    .line 896
    iget v2, v2, La/zhi0;->a:I

    .line 897
    .line 898
    sget-object v3, La/i2o;->k1:La/i2o;

    .line 899
    .line 900
    invoke-virtual {v3}, La/i2o;->getErrorCode()I

    .line 901
    .line 902
    .line 903
    move-result v3

    .line 904
    if-ne v2, v3, :cond_8

    .line 905
    .line 906
    iget-object v2, v0, La/zu3;->K:La/z7z;

    .line 907
    .line 908
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v2

    .line 912
    check-cast v2, La/r70;

    .line 913
    .line 914
    iget-object v3, v6, La/mie0;->a:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v3, Ljava/lang/String;

    .line 917
    .line 918
    iget-object v4, v0, La/zu3;->L:La/z7z;

    .line 919
    .line 920
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 921
    .line 922
    .line 923
    move-result-object v4

    .line 924
    check-cast v4, La/rmt;

    .line 925
    .line 926
    iget-object v4, v4, La/rmt;->a:La/sd60;

    .line 927
    .line 928
    invoke-virtual {v4}, La/sd60;->b()Ljava/lang/String;

    .line 929
    .line 930
    .line 931
    move-result-object v4

    .line 932
    iget-object v5, v0, La/zu3;->M:La/z7z;

    .line 933
    .line 934
    invoke-interface {v5}, La/z7z;->get()Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    move-result-object v5

    .line 938
    check-cast v5, La/igu;

    .line 939
    .line 940
    iget-object v5, v5, La/igu;->a:La/sd60;

    .line 941
    .line 942
    invoke-virtual {v5}, La/sd60;->d()Z

    .line 943
    .line 944
    .line 945
    move-result v5

    .line 946
    iget-object v6, v0, La/zu3;->N:La/z7z;

    .line 947
    .line 948
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 949
    .line 950
    .line 951
    move-result-object v6

    .line 952
    check-cast v6, La/aqt;

    .line 953
    .line 954
    invoke-virtual {v6}, La/aqt;->a()V

    .line 955
    .line 956
    .line 957
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 958
    .line 959
    .line 960
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    iget-object v2, v2, La/r70;->a:La/ony;

    .line 964
    .line 965
    new-instance v6, Ljava/util/LinkedHashMap;

    .line 966
    .line 967
    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    .line 968
    .line 969
    .line 970
    const-string v7, "deviceId"

    .line 971
    .line 972
    invoke-static {v3}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    invoke-interface {v6, v7, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    const-string v3, "bTag"

    .line 980
    .line 981
    invoke-static {v4}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 982
    .line 983
    .line 984
    move-result-object v4

    .line 985
    invoke-interface {v6, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 986
    .line 987
    .line 988
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 989
    .line 990
    .line 991
    move-result-object v3

    .line 992
    invoke-static {v3}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 993
    .line 994
    .line 995
    move-result-object v3

    .line 996
    const-string v4, "type"

    .line 997
    .line 998
    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 999
    .line 1000
    .line 1001
    const-string v3, "android"

    .line 1002
    .line 1003
    invoke-static {v3}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 1004
    .line 1005
    .line 1006
    move-result-object v3

    .line 1007
    const-string v4, "os"

    .line 1008
    .line 1009
    invoke-interface {v6, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1010
    .line 1011
    .line 1012
    const-string v3, "bundle"

    .line 1013
    .line 1014
    const-string v4, "org.xbet.client1"

    .line 1015
    .line 1016
    invoke-static {v4}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v4

    .line 1020
    invoke-interface {v6, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1021
    .line 1022
    .line 1023
    new-instance v3, La/tny;

    .line 1024
    .line 1025
    invoke-static {v6}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v4

    .line 1029
    const-string v5, "logAffiliateInstallRequest"

    .line 1030
    .line 1031
    invoke-direct {v3, v5, v4}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 1032
    .line 1033
    .line 1034
    check-cast v2, La/rny;

    .line 1035
    .line 1036
    const-string v4, "AffiliateInstallBadRequestException"

    .line 1037
    .line 1038
    invoke-virtual {v2, v4, v3}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 1039
    .line 1040
    .line 1041
    :cond_8
    iget-object v0, v0, La/zu3;->F:La/z7z;

    .line 1042
    .line 1043
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    check-cast v0, La/duj;

    .line 1048
    .line 1049
    new-instance v2, La/o33;

    .line 1050
    .line 1051
    const/4 v3, 0x6

    .line 1052
    invoke-direct {v2, v3}, La/o33;-><init>(B)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1056
    .line 1057
    .line 1058
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1059
    .line 1060
    return-object v0

    .line 1061
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
