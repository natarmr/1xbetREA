.class public final synthetic La/og1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/mh1;


# direct methods
.method public synthetic constructor <init>(La/mh1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/og1;->a:B

    iput-object p1, p0, La/og1;->b:La/mh1;

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
    iget-byte v1, v0, La/og1;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/og1;->b:La/mh1;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/k0w0;

    .line 13
    .line 14
    iget-object v2, v0, La/mh1;->P:La/jh70;

    .line 15
    .line 16
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    check-cast v3, La/pf1;

    .line 21
    .line 22
    iget v3, v3, La/pf1;->p:I

    .line 23
    .line 24
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    check-cast v4, La/pf1;

    .line 29
    .line 30
    iget v4, v4, La/pf1;->q:I

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    new-instance v2, Lorg/xplatform/feature/promo_aggregator/impl/navigation/PromoCheckAggregatorFragmentScreen;

    .line 36
    .line 37
    invoke-direct {v2, v3, v4}, Lorg/xplatform/feature/promo_aggregator/impl/navigation/PromoCheckAggregatorFragmentScreen;-><init>(II)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    iget-object v1, v1, La/ikt0;->a:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v1, La/c8d;

    .line 47
    .line 48
    sget-object v2, La/cfx0;->o:La/bjk;

    .line 49
    .line 50
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    check-cast v0, La/pf1;

    .line 55
    .line 56
    iget-boolean v0, v0, La/pf1;->r:Z

    .line 57
    .line 58
    xor-int/lit8 v0, v0, 0x1

    .line 59
    .line 60
    new-instance v3, La/v7d;

    .line 61
    .line 62
    invoke-direct {v3, v0, v2, v2}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 63
    .line 64
    .line 65
    iput-object v3, v1, La/c8d;->a:La/w7d;

    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_0
    move-object/from16 v1, p1

    .line 71
    .line 72
    check-cast v1, Ljava/lang/Throwable;

    .line 73
    .line 74
    iget-object v0, v0, La/mh1;->U:La/duj;

    .line 75
    .line 76
    new-instance v2, La/xg1;

    .line 77
    .line 78
    const/4 v3, 0x0

    .line 79
    invoke-direct {v2, v3}, La/xg1;-><init>(B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 83
    .line 84
    .line 85
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_1
    move-object/from16 v1, p1

    .line 89
    .line 90
    check-cast v1, La/pb0;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 96
    .line 97
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 98
    .line 99
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 107
    .line 108
    move-object v5, v3

    .line 109
    check-cast v5, La/pf1;

    .line 110
    .line 111
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v4, v1, La/pb0;->a:La/ql5;

    .line 115
    .line 116
    const/16 v23, -0x1

    .line 117
    .line 118
    const/16 v24, 0xe

    .line 119
    .line 120
    const/4 v6, 0x0

    .line 121
    const/4 v7, 0x0

    .line 122
    const/4 v8, 0x0

    .line 123
    const/4 v9, 0x0

    .line 124
    const-wide/16 v10, 0x0

    .line 125
    .line 126
    const/4 v12, 0x0

    .line 127
    const/4 v13, 0x0

    .line 128
    const/4 v14, 0x0

    .line 129
    const/4 v15, 0x0

    .line 130
    const/16 v16, 0x0

    .line 131
    .line 132
    const/16 v17, 0x0

    .line 133
    .line 134
    const/16 v18, 0x0

    .line 135
    .line 136
    const/16 v19, 0x0

    .line 137
    .line 138
    const/16 v20, 0x0

    .line 139
    .line 140
    const/16 v22, 0x0

    .line 141
    .line 142
    move-object/from16 v21, v4

    .line 143
    .line 144
    invoke-static/range {v5 .. v24}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 145
    .line 146
    .line 147
    move-result-object v4

    .line 148
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_0

    .line 153
    .line 154
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 155
    .line 156
    return-object v0

    .line 157
    :pswitch_2
    move-object/from16 v1, p1

    .line 158
    .line 159
    check-cast v1, Ljava/lang/Throwable;

    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    iget-object v0, v0, La/mh1;->U:La/duj;

    .line 165
    .line 166
    new-instance v2, La/g20;

    .line 167
    .line 168
    const/16 v3, 0x1c

    .line 169
    .line 170
    invoke-direct {v2, v3}, La/g20;-><init>(B)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 177
    .line 178
    return-object v0

    .line 179
    :pswitch_3
    move-object/from16 v1, p1

    .line 180
    .line 181
    check-cast v1, La/k0w0;

    .line 182
    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    iget-object v0, v0, La/mh1;->L:La/roq0;

    .line 187
    .line 188
    sget-object v2, La/fk60;->b:La/uuz;

    .line 189
    .line 190
    sget-object v2, La/je1;->S1:La/hfk0;

    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    sget-object v2, La/je1;->V1:Ljava/lang/String;

    .line 196
    .line 197
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    new-instance v0, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;

    .line 204
    .line 205
    const/16 v3, 0x11

    .line 206
    .line 207
    invoke-direct {v0, v3, v2}, Lorg/xplatform/onboarding/impl/navigation/OnBoardingScreens$TipsDialogScreen;-><init>(ILjava/lang/String;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 211
    .line 212
    .line 213
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    return-object v0

    .line 216
    :pswitch_4
    move-object/from16 v1, p1

    .line 217
    .line 218
    check-cast v1, Ljava/lang/Throwable;

    .line 219
    .line 220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 221
    .line 222
    .line 223
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 224
    .line 225
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 226
    .line 227
    :cond_1
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 235
    .line 236
    move-object v5, v3

    .line 237
    check-cast v5, La/pf1;

    .line 238
    .line 239
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    const v23, -0x1000001

    .line 243
    .line 244
    .line 245
    const/16 v24, 0xf

    .line 246
    .line 247
    const/4 v6, 0x0

    .line 248
    const/4 v7, 0x0

    .line 249
    const/4 v8, 0x0

    .line 250
    const/4 v9, 0x0

    .line 251
    const-wide/16 v10, 0x0

    .line 252
    .line 253
    const/4 v12, 0x0

    .line 254
    const/4 v13, 0x0

    .line 255
    sget-object v14, La/jlc0;->a:La/jlc0;

    .line 256
    .line 257
    const/4 v15, 0x0

    .line 258
    const/16 v16, 0x0

    .line 259
    .line 260
    const/16 v17, 0x0

    .line 261
    .line 262
    const/16 v18, 0x0

    .line 263
    .line 264
    const/16 v19, 0x0

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    .line 270
    const/16 v22, 0x0

    .line 271
    .line 272
    invoke-static/range {v5 .. v24}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v3

    .line 280
    if-eqz v3, :cond_1

    .line 281
    .line 282
    invoke-virtual {v0, v1}, La/mh1;->T(Ljava/lang/Throwable;)V

    .line 283
    .line 284
    .line 285
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 286
    .line 287
    return-object v0

    .line 288
    :pswitch_5
    move-object/from16 v1, p1

    .line 289
    .line 290
    check-cast v1, Ljava/lang/Throwable;

    .line 291
    .line 292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    iget-object v0, v0, La/mh1;->U:La/duj;

    .line 296
    .line 297
    new-instance v2, La/g20;

    .line 298
    .line 299
    const/16 v3, 0x1a

    .line 300
    .line 301
    invoke-direct {v2, v3}, La/g20;-><init>(B)V

    .line 302
    .line 303
    .line 304
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 305
    .line 306
    .line 307
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 308
    .line 309
    return-object v0

    .line 310
    :pswitch_6
    move-object/from16 v1, p1

    .line 311
    .line 312
    check-cast v1, Ljava/lang/Throwable;

    .line 313
    .line 314
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v0, v1}, La/mh1;->T(Ljava/lang/Throwable;)V

    .line 318
    .line 319
    .line 320
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 321
    .line 322
    return-object v0

    .line 323
    :pswitch_7
    move-object/from16 v1, p1

    .line 324
    .line 325
    check-cast v1, Ljava/lang/Throwable;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 331
    .line 332
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 333
    .line 334
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 342
    .line 343
    move-object v5, v3

    .line 344
    check-cast v5, La/pf1;

    .line 345
    .line 346
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    const v23, -0x10000001

    .line 350
    .line 351
    .line 352
    const/16 v24, 0xf

    .line 353
    .line 354
    const/4 v6, 0x0

    .line 355
    const/4 v7, 0x0

    .line 356
    const/4 v8, 0x0

    .line 357
    const/4 v9, 0x0

    .line 358
    const-wide/16 v10, 0x0

    .line 359
    .line 360
    const/4 v12, 0x0

    .line 361
    const/4 v13, 0x0

    .line 362
    const/4 v14, 0x0

    .line 363
    const/4 v15, 0x0

    .line 364
    const/16 v16, 0x0

    .line 365
    .line 366
    sget-object v17, La/ttc0;->a:La/ttc0;

    .line 367
    .line 368
    const/16 v18, 0x0

    .line 369
    .line 370
    const/16 v19, 0x0

    .line 371
    .line 372
    const/16 v20, 0x0

    .line 373
    .line 374
    const/16 v21, 0x0

    .line 375
    .line 376
    const/16 v22, 0x0

    .line 377
    .line 378
    invoke-static/range {v5 .. v24}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 383
    .line 384
    .line 385
    move-result v3

    .line 386
    if-eqz v3, :cond_2

    .line 387
    .line 388
    invoke-virtual {v0, v1}, La/mh1;->T(Ljava/lang/Throwable;)V

    .line 389
    .line 390
    .line 391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object v0

    .line 394
    :pswitch_8
    move-object/from16 v1, p1

    .line 395
    .line 396
    check-cast v1, Ljava/lang/Throwable;

    .line 397
    .line 398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 402
    .line 403
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 404
    .line 405
    :cond_3
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 410
    .line 411
    .line 412
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 413
    .line 414
    move-object v5, v3

    .line 415
    check-cast v5, La/pf1;

    .line 416
    .line 417
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    const v23, -0x4000001

    .line 421
    .line 422
    .line 423
    const/16 v24, 0xf

    .line 424
    .line 425
    const/4 v6, 0x0

    .line 426
    const/4 v7, 0x0

    .line 427
    const/4 v8, 0x0

    .line 428
    const/4 v9, 0x0

    .line 429
    const-wide/16 v10, 0x0

    .line 430
    .line 431
    const/4 v12, 0x0

    .line 432
    const/4 v13, 0x0

    .line 433
    const/4 v14, 0x0

    .line 434
    sget-object v15, La/vuc0;->a:La/vuc0;

    .line 435
    .line 436
    const/16 v16, 0x0

    .line 437
    .line 438
    const/16 v17, 0x0

    .line 439
    .line 440
    const/16 v18, 0x0

    .line 441
    .line 442
    const/16 v19, 0x0

    .line 443
    .line 444
    const/16 v20, 0x0

    .line 445
    .line 446
    const/16 v21, 0x0

    .line 447
    .line 448
    const/16 v22, 0x0

    .line 449
    .line 450
    invoke-static/range {v5 .. v24}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 451
    .line 452
    .line 453
    move-result-object v4

    .line 454
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v3

    .line 458
    if-eqz v3, :cond_3

    .line 459
    .line 460
    invoke-virtual {v0, v1}, La/mh1;->T(Ljava/lang/Throwable;)V

    .line 461
    .line 462
    .line 463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_9
    move-object/from16 v1, p1

    .line 467
    .line 468
    check-cast v1, Ljava/lang/Throwable;

    .line 469
    .line 470
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    iget-object v2, v0, La/i3t0;->i:La/ocj;

    .line 474
    .line 475
    iget-object v2, v2, La/ocj;->a:La/p7m0;

    .line 476
    .line 477
    :cond_4
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 482
    .line 483
    .line 484
    iget-object v4, v0, La/i3t0;->f:La/oyg0;

    .line 485
    .line 486
    move-object v5, v3

    .line 487
    check-cast v5, La/pf1;

    .line 488
    .line 489
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    const v23, -0x8000001

    .line 493
    .line 494
    .line 495
    const/16 v24, 0xf

    .line 496
    .line 497
    const/4 v6, 0x0

    .line 498
    const/4 v7, 0x0

    .line 499
    const/4 v8, 0x0

    .line 500
    const/4 v9, 0x0

    .line 501
    const-wide/16 v10, 0x0

    .line 502
    .line 503
    const/4 v12, 0x0

    .line 504
    const/4 v13, 0x0

    .line 505
    const/4 v14, 0x0

    .line 506
    const/4 v15, 0x0

    .line 507
    sget-object v16, La/a6c0;->a:La/a6c0;

    .line 508
    .line 509
    const/16 v17, 0x0

    .line 510
    .line 511
    const/16 v18, 0x0

    .line 512
    .line 513
    const/16 v19, 0x0

    .line 514
    .line 515
    const/16 v20, 0x0

    .line 516
    .line 517
    const/16 v21, 0x0

    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    invoke-static/range {v5 .. v24}, La/pf1;->a(La/pf1;Ljava/lang/String;IIZJLa/a4x;ZLa/klc0;La/yuc0;La/c6c0;La/vtc0;La/w2j;La/th90;ZLa/ql5;ZII)La/pf1;

    .line 522
    .line 523
    .line 524
    move-result-object v4

    .line 525
    invoke-virtual {v2, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-eqz v3, :cond_4

    .line 530
    .line 531
    invoke-virtual {v0, v1}, La/mh1;->T(Ljava/lang/Throwable;)V

    .line 532
    .line 533
    .line 534
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 535
    .line 536
    return-object v0

    .line 537
    :pswitch_a
    move-object/from16 v1, p1

    .line 538
    .line 539
    check-cast v1, Ljava/lang/Throwable;

    .line 540
    .line 541
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 542
    .line 543
    .line 544
    iget-object v0, v0, La/mh1;->U:La/duj;

    .line 545
    .line 546
    new-instance v2, La/yr0;

    .line 547
    .line 548
    const/4 v3, 0x5

    .line 549
    invoke-direct {v2, v1, v3}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 553
    .line 554
    .line 555
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 556
    .line 557
    return-object v0

    .line 558
    :pswitch_b
    move-object/from16 v1, p1

    .line 559
    .line 560
    check-cast v1, Ljava/lang/Throwable;

    .line 561
    .line 562
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 563
    .line 564
    .line 565
    iget-object v0, v0, La/mh1;->U:La/duj;

    .line 566
    .line 567
    new-instance v2, La/yr0;

    .line 568
    .line 569
    const/4 v3, 0x4

    .line 570
    invoke-direct {v2, v1, v3}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 574
    .line 575
    .line 576
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 577
    .line 578
    return-object v0

    .line 579
    :pswitch_c
    move-object/from16 v1, p1

    .line 580
    .line 581
    check-cast v1, Ljava/lang/Throwable;

    .line 582
    .line 583
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    sget-object v1, La/if1;->a:La/if1;

    .line 587
    .line 588
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 592
    .line 593
    return-object v0

    .line 594
    nop

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
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
