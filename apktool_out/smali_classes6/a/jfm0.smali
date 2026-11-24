.class public final synthetic La/jfm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/jfm0;->a:B

    iput-object p1, p0, La/jfm0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/jfm0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x7

    .line 8
    const/4 v5, 0x1

    .line 9
    const/4 v6, 0x0

    .line 10
    iget-object v0, v0, La/jfm0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast v0, La/hvo0;

    .line 16
    .line 17
    sget v1, La/hvo0;->k2:I

    .line 18
    .line 19
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v1, "TAX_INFO_DIALOG_RESULT_KEY"

    .line 27
    .line 28
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 36
    .line 37
    .line 38
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    check-cast v0, La/yno0;

    .line 42
    .line 43
    iget-object v0, v0, La/yno0;->a:La/a4x;

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :pswitch_1
    check-cast v0, La/xno0;

    .line 55
    .line 56
    iget-object v0, v0, La/xno0;->a:La/a4x;

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    return-object v0

    .line 67
    :pswitch_2
    move-object v9, v0

    .line 68
    check-cast v9, La/umo0;

    .line 69
    .line 70
    iget-object v0, v9, La/umo0;->H:La/bby;

    .line 71
    .line 72
    if-eqz v0, :cond_1

    .line 73
    .line 74
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-ne v0, v5, :cond_1

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_1
    invoke-static {v9}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    new-instance v7, La/tfo0;

    .line 86
    .line 87
    const/4 v13, 0x0

    .line 88
    const/16 v14, 0xd

    .line 89
    .line 90
    const/4 v8, 0x1

    .line 91
    const-class v10, La/umo0;

    .line 92
    .line 93
    const-string v11, "handleError"

    .line 94
    .line 95
    const-string v12, "handleError(Ljava/lang/Throwable;)V"

    .line 96
    .line 97
    invoke-direct/range {v7 .. v14}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v9, La/umo0;->t:La/mne;

    .line 101
    .line 102
    iget-object v13, v1, La/mne;->b:La/dvj;

    .line 103
    .line 104
    new-instance v14, La/rmo0;

    .line 105
    .line 106
    invoke-direct {v14, v9, v6, v5}, La/rmo0;-><init>(La/umo0;La/yje;B)V

    .line 107
    .line 108
    .line 109
    const/16 v15, 0xa

    .line 110
    .line 111
    const/4 v12, 0x0

    .line 112
    move-object v10, v0

    .line 113
    move-object v11, v7

    .line 114
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    iput-object v0, v9, La/umo0;->H:La/bby;

    .line 119
    .line 120
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object v0

    .line 123
    :pswitch_3
    check-cast v0, La/nfo0;

    .line 124
    .line 125
    sget-object v1, La/nfo0;->O1:La/s9m0;

    .line 126
    .line 127
    new-instance v1, La/kfo0;

    .line 128
    .line 129
    new-instance v2, La/ttn0;

    .line 130
    .line 131
    invoke-direct {v2, v0, v4}, La/ttn0;-><init>(Ljava/lang/Object;B)V

    .line 132
    .line 133
    .line 134
    sget-object v0, La/ek5;->h:La/ek5;

    .line 135
    .line 136
    invoke-direct {v1, v0}, La/qv5;-><init>(La/dtb;)V

    .line 137
    .line 138
    .line 139
    iget-object v0, v1, La/zz3;->d:La/dp;

    .line 140
    .line 141
    invoke-static {v2}, La/pym0;->h(Lkotlin/jvm/functions/Function1;)La/gbn;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v0, v2}, La/dp;->b(La/gbn;)V

    .line 146
    .line 147
    .line 148
    return-object v1

    .line 149
    :pswitch_4
    check-cast v0, La/zco0;

    .line 150
    .line 151
    iget-object v0, v0, La/zco0;->r:La/pru;

    .line 152
    .line 153
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    return-object v0

    .line 158
    :pswitch_5
    check-cast v0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_6
    check-cast v0, La/trm0;

    .line 162
    .line 163
    iget-object v0, v0, La/trm0;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/n0o0;

    .line 166
    .line 167
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/gii0;

    .line 172
    .line 173
    const-class v1, La/x8o0;

    .line 174
    .line 175
    sget-object v2, La/sre0;->a:La/tre0;

    .line 176
    .line 177
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 178
    .line 179
    .line 180
    move-result-object v1

    .line 181
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    check-cast v0, La/x8o0;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_7
    check-cast v0, La/a7o0;

    .line 189
    .line 190
    iget-object v0, v0, La/a7o0;->a:La/mdm;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_8
    check-cast v0, La/afm0;

    .line 194
    .line 195
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v0, La/gii0;

    .line 198
    .line 199
    const-class v1, La/isn0;

    .line 200
    .line 201
    sget-object v2, La/sre0;->a:La/tre0;

    .line 202
    .line 203
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 204
    .line 205
    .line 206
    move-result-object v1

    .line 207
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    check-cast v0, La/isn0;

    .line 212
    .line 213
    return-object v0

    .line 214
    :pswitch_9
    move-object v1, v0

    .line 215
    check-cast v1, La/bvn0;

    .line 216
    .line 217
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 218
    .line 219
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 220
    .line 221
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 226
    .line 227
    .line 228
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 229
    .line 230
    move-object v4, v0

    .line 231
    check-cast v4, La/gvn0;

    .line 232
    .line 233
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    const/4 v11, 0x0

    .line 237
    const/16 v12, 0xfd

    .line 238
    .line 239
    const/4 v5, 0x0

    .line 240
    const/4 v6, 0x0

    .line 241
    const/4 v7, 0x0

    .line 242
    const/4 v8, 0x0

    .line 243
    const/4 v9, 0x0

    .line 244
    const/4 v10, 0x0

    .line 245
    invoke-static/range {v4 .. v12}, La/gvn0;->a(La/gvn0;ZZZZLjava/util/List;Ljava/util/List;Ljava/util/Set;I)La/gvn0;

    .line 246
    .line 247
    .line 248
    move-result-object v3

    .line 249
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 250
    .line 251
    .line 252
    move-result v0

    .line 253
    if-eqz v0, :cond_2

    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_a
    check-cast v0, La/tun0;

    .line 259
    .line 260
    sget-object v1, La/tun0;->P1:La/y2m0;

    .line 261
    .line 262
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    instance-of v2, v1, La/af3;

    .line 274
    .line 275
    if-eqz v2, :cond_3

    .line 276
    .line 277
    check-cast v1, La/af3;

    .line 278
    .line 279
    goto :goto_2

    .line 280
    :cond_3
    move-object v1, v6

    .line 281
    :goto_2
    const-class v2, La/run0;

    .line 282
    .line 283
    if-eqz v1, :cond_6

    .line 284
    .line 285
    invoke-interface {v1}, La/af3;->d()La/wcf0;

    .line 286
    .line 287
    .line 288
    move-result-object v1

    .line 289
    invoke-virtual {v1, v2}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v1

    .line 293
    check-cast v1, La/o5d0;

    .line 294
    .line 295
    if-eqz v1, :cond_4

    .line 296
    .line 297
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 298
    .line 299
    .line 300
    move-result-object v1

    .line 301
    check-cast v1, La/ze3;

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_4
    move-object v1, v6

    .line 305
    :goto_3
    instance-of v4, v1, La/run0;

    .line 306
    .line 307
    if-nez v4, :cond_5

    .line 308
    .line 309
    move-object v1, v6

    .line 310
    :cond_5
    check-cast v1, La/run0;

    .line 311
    .line 312
    if-eqz v1, :cond_6

    .line 313
    .line 314
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 315
    .line 316
    .line 317
    move-result-object v9

    .line 318
    new-instance v15, La/u3q;

    .line 319
    .line 320
    iget-object v2, v0, La/tun0;->N1:La/r34;

    .line 321
    .line 322
    sget-object v4, La/tun0;->Q1:[La/iiy;

    .line 323
    .line 324
    aget-object v5, v4, v5

    .line 325
    .line 326
    invoke-virtual {v2, v0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 327
    .line 328
    .line 329
    move-result-object v2

    .line 330
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    .line 331
    .line 332
    .line 333
    move-result-wide v5

    .line 334
    iget-object v2, v0, La/tun0;->O1:La/r34;

    .line 335
    .line 336
    aget-object v3, v4, v3

    .line 337
    .line 338
    invoke-virtual {v2, v0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v0

    .line 342
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 343
    .line 344
    .line 345
    move-result-wide v2

    .line 346
    invoke-direct {v15, v5, v6, v2, v3}, La/u3q;-><init>(JJ)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 350
    .line 351
    .line 352
    iget-object v10, v1, La/run0;->a:La/mne;

    .line 353
    .line 354
    iget-object v11, v1, La/run0;->b:La/gii0;

    .line 355
    .line 356
    iget-object v12, v1, La/run0;->c:La/knf0;

    .line 357
    .line 358
    iget-object v13, v1, La/run0;->d:La/yvn0;

    .line 359
    .line 360
    iget-object v0, v1, La/run0;->e:La/q7d0;

    .line 361
    .line 362
    iget-object v2, v1, La/run0;->f:La/vby;

    .line 363
    .line 364
    iget-object v8, v1, La/run0;->g:La/ii;

    .line 365
    .line 366
    iget-object v14, v1, La/run0;->h:La/g9m0;

    .line 367
    .line 368
    iget-object v3, v1, La/run0;->j:La/sjl0;

    .line 369
    .line 370
    iget-object v4, v1, La/run0;->k:La/s31;

    .line 371
    .line 372
    iget-object v5, v1, La/run0;->l:La/e41;

    .line 373
    .line 374
    iget-object v6, v1, La/run0;->i:La/g2v;

    .line 375
    .line 376
    iget-object v7, v1, La/run0;->m:La/wdk0;

    .line 377
    .line 378
    move-object/from16 v16, v0

    .line 379
    .line 380
    iget-object v0, v1, La/run0;->n:La/rou;

    .line 381
    .line 382
    iget-object v1, v1, La/run0;->o:La/ctf0;

    .line 383
    .line 384
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 391
    .line 392
    .line 393
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 394
    .line 395
    .line 396
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    move-object/from16 v20, v7

    .line 412
    .line 413
    new-instance v7, La/vvi;

    .line 414
    .line 415
    move-object/from16 v21, v0

    .line 416
    .line 417
    move-object/from16 v22, v1

    .line 418
    .line 419
    move-object/from16 v16, v3

    .line 420
    .line 421
    move-object/from16 v17, v4

    .line 422
    .line 423
    move-object/from16 v19, v5

    .line 424
    .line 425
    move-object/from16 v18, v6

    .line 426
    .line 427
    invoke-direct/range {v7 .. v22}, La/vvi;-><init>(La/ii;La/i1w0;La/mne;La/gii0;La/knf0;La/yvn0;La/g9m0;La/u3q;La/sjl0;La/s31;La/g2v;La/e41;La/wdk0;La/rou;La/ctf0;)V

    .line 428
    .line 429
    .line 430
    move-object v6, v7

    .line 431
    goto :goto_4

    .line 432
    :cond_6
    const-string v0, "Cannot create dependency "

    .line 433
    .line 434
    invoke-static {v2, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    :goto_4
    return-object v6

    .line 442
    :pswitch_b
    check-cast v0, La/arn0;

    .line 443
    .line 444
    iget-object v0, v0, La/arn0;->q:La/pru;

    .line 445
    .line 446
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    return-object v0

    .line 451
    :pswitch_c
    check-cast v0, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;

    .line 452
    .line 453
    new-instance v1, La/non0;

    .line 454
    .line 455
    iget-object v0, v0, Lorg/xplatform/swipex/impl/presentation/dialogs/confirmation/models/SwipeActionConfirmationParams;->a:Ljava/lang/String;

    .line 456
    .line 457
    new-instance v3, La/yvl;

    .line 458
    .line 459
    invoke-direct {v3, v6, v2, v4}, La/yvl;-><init>(La/evq0;ZI)V

    .line 460
    .line 461
    .line 462
    invoke-direct {v1, v0, v3}, La/non0;-><init>(Ljava/lang/String;La/yvl;)V

    .line 463
    .line 464
    .line 465
    return-object v1

    .line 466
    :pswitch_d
    check-cast v0, La/snn0;

    .line 467
    .line 468
    sget-object v1, La/snn0;->n2:La/j6m0;

    .line 469
    .line 470
    iget-object v0, v0, La/snn0;->k2:La/fiu0;

    .line 471
    .line 472
    if-eqz v0, :cond_7

    .line 473
    .line 474
    return-object v0

    .line 475
    :cond_7
    const-string v0, "viewModelFactory"

    .line 476
    .line 477
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    throw v6

    .line 481
    :pswitch_e
    move-object v1, v0

    .line 482
    check-cast v1, La/mnn0;

    .line 483
    .line 484
    iget-object v0, v1, La/mnn0;->a:La/y1x;

    .line 485
    .line 486
    iget-object v2, v1, La/mnn0;->b:La/a780;

    .line 487
    .line 488
    invoke-interface {v0}, La/y1x;->V0()La/u99;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    sget-object v0, La/knn0;->a:La/knn0;

    .line 493
    .line 494
    :try_start_0
    invoke-virtual {v0, v4}, La/knn0;->a(La/u99;)La/yzn0;

    .line 495
    .line 496
    .line 497
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 498
    :try_start_1
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 499
    .line 500
    .line 501
    move-object v0, v6

    .line 502
    goto :goto_6

    .line 503
    :catchall_0
    move-exception v0

    .line 504
    goto :goto_6

    .line 505
    :catchall_1
    move-exception v0

    .line 506
    move-object v7, v0

    .line 507
    :try_start_2
    invoke-interface {v4}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 508
    .line 509
    .line 510
    goto :goto_5

    .line 511
    :catchall_2
    move-exception v0

    .line 512
    invoke-static {v7, v0}, La/tjo;->a(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    .line 513
    .line 514
    .line 515
    :goto_5
    move-object v0, v7

    .line 516
    move-object v7, v6

    .line 517
    :goto_6
    if-nez v0, :cond_1b

    .line 518
    .line 519
    iget-object v0, v7, La/yzn0;->a:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, La/cyu;

    .line 522
    .line 523
    iget-object v4, v0, La/cyu;->a:Ljava/lang/Object;

    .line 524
    .line 525
    check-cast v4, La/yqg0;

    .line 526
    .line 527
    const-string v8, "SVG document is empty"

    .line 528
    .line 529
    if-eqz v4, :cond_1a

    .line 530
    .line 531
    iget-object v4, v4, La/jrg0;->o:La/gz40;

    .line 532
    .line 533
    if-nez v4, :cond_8

    .line 534
    .line 535
    move-object v9, v6

    .line 536
    goto :goto_7

    .line 537
    :cond_8
    new-instance v9, Landroid/graphics/RectF;

    .line 538
    .line 539
    iget v10, v4, La/gz40;->b:F

    .line 540
    .line 541
    iget v11, v4, La/gz40;->c:F

    .line 542
    .line 543
    invoke-virtual {v4}, La/gz40;->c()F

    .line 544
    .line 545
    .line 546
    move-result v12

    .line 547
    invoke-virtual {v4}, La/gz40;->d()F

    .line 548
    .line 549
    .line 550
    move-result v4

    .line 551
    invoke-direct {v9, v10, v11, v12, v4}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 552
    .line 553
    .line 554
    :goto_7
    if-eqz v9, :cond_9

    .line 555
    .line 556
    new-instance v4, La/lnn0;

    .line 557
    .line 558
    iget v10, v9, Landroid/graphics/RectF;->left:F

    .line 559
    .line 560
    iget v11, v9, Landroid/graphics/RectF;->top:F

    .line 561
    .line 562
    iget v12, v9, Landroid/graphics/RectF;->right:F

    .line 563
    .line 564
    iget v9, v9, Landroid/graphics/RectF;->bottom:F

    .line 565
    .line 566
    invoke-direct {v4, v10, v11, v12, v9}, La/lnn0;-><init>(FFFF)V

    .line 567
    .line 568
    .line 569
    goto :goto_8

    .line 570
    :cond_9
    move-object v4, v6

    .line 571
    :goto_8
    if-eqz v4, :cond_a

    .line 572
    .line 573
    iget v9, v4, La/lnn0;->c:F

    .line 574
    .line 575
    iget v10, v4, La/lnn0;->a:F

    .line 576
    .line 577
    sub-float/2addr v9, v10

    .line 578
    iget v10, v4, La/lnn0;->d:F

    .line 579
    .line 580
    iget v11, v4, La/lnn0;->b:F

    .line 581
    .line 582
    sub-float/2addr v10, v11

    .line 583
    goto :goto_9

    .line 584
    :cond_a
    iget-object v9, v0, La/cyu;->a:Ljava/lang/Object;

    .line 585
    .line 586
    check-cast v9, La/yqg0;

    .line 587
    .line 588
    if-eqz v9, :cond_19

    .line 589
    .line 590
    invoke-virtual {v0}, La/cyu;->m()La/gz40;

    .line 591
    .line 592
    .line 593
    move-result-object v9

    .line 594
    iget v9, v9, La/gz40;->d:F

    .line 595
    .line 596
    iget-object v10, v0, La/cyu;->a:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v10, La/yqg0;

    .line 599
    .line 600
    if-eqz v10, :cond_18

    .line 601
    .line 602
    invoke-virtual {v0}, La/cyu;->m()La/gz40;

    .line 603
    .line 604
    .line 605
    move-result-object v10

    .line 606
    iget v10, v10, La/gz40;->e:F

    .line 607
    .line 608
    :goto_9
    iget-object v11, v2, La/a780;->b:La/f7k0;

    .line 609
    .line 610
    iget-object v12, v2, La/a780;->c:La/j1h0;

    .line 611
    .line 612
    sget-object v13, La/f7k0;->c:La/f7k0;

    .line 613
    .line 614
    invoke-static {v11, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 615
    .line 616
    .line 617
    move-result v11

    .line 618
    const/4 v13, 0x0

    .line 619
    if-eqz v11, :cond_c

    .line 620
    .line 621
    iget-object v1, v1, La/mnn0;->c:Lkotlin/jvm/functions/Function1;

    .line 622
    .line 623
    iget-object v11, v2, La/a780;->a:Landroid/content/Context;

    .line 624
    .line 625
    invoke-interface {v1, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    check-cast v1, Ljava/lang/Number;

    .line 630
    .line 631
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    .line 632
    .line 633
    .line 634
    move-result v1

    .line 635
    cmpl-float v11, v9, v13

    .line 636
    .line 637
    if-lez v11, :cond_b

    .line 638
    .line 639
    mul-float/2addr v9, v1

    .line 640
    :cond_b
    cmpl-float v11, v10, v13

    .line 641
    .line 642
    if-lez v11, :cond_c

    .line 643
    .line 644
    mul-float/2addr v10, v1

    .line 645
    :cond_c
    cmpl-float v1, v9, v13

    .line 646
    .line 647
    const/16 v11, 0x200

    .line 648
    .line 649
    if-lez v1, :cond_d

    .line 650
    .line 651
    invoke-static {v9}, La/si30;->b(F)I

    .line 652
    .line 653
    .line 654
    move-result v14

    .line 655
    goto :goto_a

    .line 656
    :cond_d
    move v14, v11

    .line 657
    :goto_a
    cmpl-float v15, v10, v13

    .line 658
    .line 659
    if-lez v15, :cond_e

    .line 660
    .line 661
    invoke-static {v10}, La/si30;->b(F)I

    .line 662
    .line 663
    .line 664
    move-result v11

    .line 665
    :cond_e
    iget-object v6, v2, La/a780;->b:La/f7k0;

    .line 666
    .line 667
    sget-object v3, La/q1x;->b:La/kuo;

    .line 668
    .line 669
    invoke-static {v2, v3}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 670
    .line 671
    .line 672
    move-result-object v18

    .line 673
    move/from16 p0, v13

    .line 674
    .line 675
    move-object/from16 v13, v18

    .line 676
    .line 677
    check-cast v13, La/f7k0;

    .line 678
    .line 679
    invoke-static {v14, v11, v6, v12, v13}, La/u1c;->z(IILa/f7k0;La/j1h0;La/f7k0;)J

    .line 680
    .line 681
    .line 682
    move-result-wide v13

    .line 683
    const/16 v6, 0x20

    .line 684
    .line 685
    shr-long v5, v13, v6

    .line 686
    .line 687
    long-to-int v5, v5

    .line 688
    const-wide v18, 0xffffffffL

    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    and-long v13, v13, v18

    .line 694
    .line 695
    long-to-int v6, v13

    .line 696
    if-lez v1, :cond_14

    .line 697
    .line 698
    if-lez v15, :cond_14

    .line 699
    .line 700
    int-to-float v1, v5

    .line 701
    int-to-float v5, v6

    .line 702
    invoke-static {v2, v3}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 703
    .line 704
    .line 705
    move-result-object v3

    .line 706
    check-cast v3, La/f7k0;

    .line 707
    .line 708
    div-float/2addr v1, v9

    .line 709
    div-float/2addr v5, v10

    .line 710
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 711
    .line 712
    .line 713
    move-result v6

    .line 714
    if-eqz v6, :cond_10

    .line 715
    .line 716
    const/4 v11, 0x1

    .line 717
    if-ne v6, v11, :cond_f

    .line 718
    .line 719
    invoke-static {v1, v5}, Ljava/lang/Math;->min(FF)F

    .line 720
    .line 721
    .line 722
    move-result v1

    .line 723
    goto :goto_c

    .line 724
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 725
    .line 726
    .line 727
    :goto_b
    const/4 v6, 0x0

    .line 728
    goto/16 :goto_e

    .line 729
    .line 730
    :cond_10
    invoke-static {v1, v5}, Ljava/lang/Math;->max(FF)F

    .line 731
    .line 732
    .line 733
    move-result v1

    .line 734
    :goto_c
    iget-object v5, v3, La/f7k0;->a:La/umk;

    .line 735
    .line 736
    instance-of v6, v5, La/rmk;

    .line 737
    .line 738
    if-eqz v6, :cond_11

    .line 739
    .line 740
    check-cast v5, La/rmk;

    .line 741
    .line 742
    iget v5, v5, La/rmk;->a:I

    .line 743
    .line 744
    int-to-float v5, v5

    .line 745
    div-float/2addr v5, v9

    .line 746
    cmpl-float v6, v1, v5

    .line 747
    .line 748
    if-lez v6, :cond_11

    .line 749
    .line 750
    move v1, v5

    .line 751
    :cond_11
    iget-object v3, v3, La/f7k0;->b:La/umk;

    .line 752
    .line 753
    instance-of v5, v3, La/rmk;

    .line 754
    .line 755
    if-eqz v5, :cond_12

    .line 756
    .line 757
    check-cast v3, La/rmk;

    .line 758
    .line 759
    iget v3, v3, La/rmk;->a:I

    .line 760
    .line 761
    int-to-float v3, v3

    .line 762
    div-float/2addr v3, v10

    .line 763
    cmpl-float v5, v1, v3

    .line 764
    .line 765
    if-lez v5, :cond_12

    .line 766
    .line 767
    move v1, v3

    .line 768
    :cond_12
    mul-float v3, v1, v9

    .line 769
    .line 770
    float-to-int v5, v3

    .line 771
    mul-float/2addr v1, v10

    .line 772
    float-to-int v6, v1

    .line 773
    if-nez v4, :cond_14

    .line 774
    .line 775
    sub-float v9, v9, p0

    .line 776
    .line 777
    sub-float v10, v10, p0

    .line 778
    .line 779
    iget-object v1, v0, La/cyu;->a:Ljava/lang/Object;

    .line 780
    .line 781
    check-cast v1, La/yqg0;

    .line 782
    .line 783
    if-eqz v1, :cond_13

    .line 784
    .line 785
    new-instance v3, La/gz40;

    .line 786
    .line 787
    move/from16 v4, p0

    .line 788
    .line 789
    invoke-direct {v3, v4, v4, v9, v10}, La/gz40;-><init>(FFFF)V

    .line 790
    .line 791
    .line 792
    iput-object v3, v1, La/jrg0;->o:La/gz40;

    .line 793
    .line 794
    goto :goto_d

    .line 795
    :cond_13
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    goto :goto_b

    .line 799
    :cond_14
    :goto_d
    iget-object v1, v0, La/cyu;->a:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v1, La/yqg0;

    .line 802
    .line 803
    if-eqz v1, :cond_17

    .line 804
    .line 805
    const-string v3, "100%"

    .line 806
    .line 807
    invoke-static {v3}, La/osg0;->s(Ljava/lang/String;)La/jqg0;

    .line 808
    .line 809
    .line 810
    move-result-object v4

    .line 811
    iput-object v4, v1, La/yqg0;->r:La/jqg0;

    .line 812
    .line 813
    iget-object v1, v0, La/cyu;->a:Ljava/lang/Object;

    .line 814
    .line 815
    check-cast v1, La/yqg0;

    .line 816
    .line 817
    if-eqz v1, :cond_16

    .line 818
    .line 819
    invoke-static {v3}, La/osg0;->s(Ljava/lang/String;)La/jqg0;

    .line 820
    .line 821
    .line 822
    move-result-object v3

    .line 823
    iput-object v3, v1, La/yqg0;->s:La/jqg0;

    .line 824
    .line 825
    sget-object v1, La/s1x;->a:La/kuo;

    .line 826
    .line 827
    invoke-static {v2, v1}, La/qbc;->Q(La/a780;La/kuo;)Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v1

    .line 831
    check-cast v1, Ljava/lang/String;

    .line 832
    .line 833
    if-eqz v1, :cond_15

    .line 834
    .line 835
    new-instance v2, La/dq00;

    .line 836
    .line 837
    const/16 v3, 0x18

    .line 838
    .line 839
    invoke-direct {v2, v3}, La/dq00;-><init>(B)V

    .line 840
    .line 841
    .line 842
    new-instance v3, La/u3u0;

    .line 843
    .line 844
    const/4 v4, 0x2

    .line 845
    invoke-direct {v3, v4}, La/u3u0;-><init>(I)V

    .line 846
    .line 847
    .line 848
    new-instance v4, La/rh9;

    .line 849
    .line 850
    invoke-direct {v4, v1}, La/rh9;-><init>(Ljava/lang/String;)V

    .line 851
    .line 852
    .line 853
    invoke-virtual {v4}, La/tyc;->h0()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v3, v4}, La/u3u0;->f(La/rh9;)La/bi9;

    .line 857
    .line 858
    .line 859
    move-result-object v1

    .line 860
    iput-object v1, v2, La/dq00;->b:Ljava/lang/Object;

    .line 861
    .line 862
    iput-object v2, v7, La/yzn0;->b:Ljava/lang/Object;

    .line 863
    .line 864
    :cond_15
    new-instance v1, La/onn0;

    .line 865
    .line 866
    iget-object v2, v7, La/yzn0;->b:Ljava/lang/Object;

    .line 867
    .line 868
    check-cast v2, La/dq00;

    .line 869
    .line 870
    invoke-direct {v1, v0, v2, v5, v6}, La/onn0;-><init>(La/cyu;La/dq00;II)V

    .line 871
    .line 872
    .line 873
    invoke-static {v1}, La/c3x;->F(La/dyw;)Landroid/graphics/Bitmap;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    new-instance v1, La/b78;

    .line 878
    .line 879
    invoke-direct {v1, v0}, La/b78;-><init>(Landroid/graphics/Bitmap;)V

    .line 880
    .line 881
    .line 882
    new-instance v6, La/hkj;

    .line 883
    .line 884
    const/4 v11, 0x1

    .line 885
    invoke-direct {v6, v1, v11}, La/hkj;-><init>(La/dyw;Z)V

    .line 886
    .line 887
    .line 888
    goto :goto_e

    .line 889
    :cond_16
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_b

    .line 893
    .line 894
    :cond_17
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    goto/16 :goto_b

    .line 898
    .line 899
    :cond_18
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 900
    .line 901
    .line 902
    goto/16 :goto_b

    .line 903
    .line 904
    :cond_19
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 905
    .line 906
    .line 907
    goto/16 :goto_b

    .line 908
    .line 909
    :cond_1a
    invoke-static {v8}, La/jf4;->o(Ljava/lang/String;)V

    .line 910
    .line 911
    .line 912
    goto/16 :goto_b

    .line 913
    .line 914
    :goto_e
    return-object v6

    .line 915
    :cond_1b
    throw v0

    .line 916
    :pswitch_f
    check-cast v0, La/mkn0;

    .line 917
    .line 918
    iget-object v0, v0, La/mkn0;->d:La/iw20;

    .line 919
    .line 920
    iget-object v0, v0, La/iw20;->a:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v0, La/uii;

    .line 923
    .line 924
    invoke-virtual {v0}, La/uii;->r()La/pru;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 929
    .line 930
    .line 931
    move-result-object v0

    .line 932
    return-object v0

    .line 933
    :pswitch_10
    check-cast v0, La/yfn0;

    .line 934
    .line 935
    sget-object v1, La/yfn0;->c2:La/y2m0;

    .line 936
    .line 937
    sget-object v1, La/fhn0;->c:La/fhn0;

    .line 938
    .line 939
    invoke-virtual {v0, v1, v2}, La/yfn0;->K0(La/fhn0;Z)V

    .line 940
    .line 941
    .line 942
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 943
    .line 944
    return-object v0

    .line 945
    :pswitch_11
    check-cast v0, La/ven0;

    .line 946
    .line 947
    iget-object v0, v0, La/ven0;->t:La/pru;

    .line 948
    .line 949
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 950
    .line 951
    .line 952
    move-result-object v0

    .line 953
    return-object v0

    .line 954
    :pswitch_12
    check-cast v0, La/oen0;

    .line 955
    .line 956
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_13
    check-cast v0, La/rdn0;

    .line 963
    .line 964
    iget-object v0, v0, La/rdn0;->s:La/pru;

    .line 965
    .line 966
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    return-object v0

    .line 971
    :pswitch_14
    check-cast v0, La/b5n0;

    .line 972
    .line 973
    invoke-virtual {v0}, La/b5n0;->a()La/r7z;

    .line 974
    .line 975
    .line 976
    move-result-object v0

    .line 977
    iget-object v1, v0, La/r7z;->a:La/e7z;

    .line 978
    .line 979
    invoke-virtual {v1}, La/e7z;->p()Ljava/util/List;

    .line 980
    .line 981
    .line 982
    move-result-object v3

    .line 983
    check-cast v3, La/ty40;

    .line 984
    .line 985
    iget-object v3, v3, La/ty40;->b:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v3, La/xz40;

    .line 988
    .line 989
    iget v3, v3, La/xz40;->c:I

    .line 990
    .line 991
    iget v5, v0, La/r7z;->n:I

    .line 992
    .line 993
    if-eq v5, v3, :cond_21

    .line 994
    .line 995
    iget-object v0, v0, La/r7z;->f:La/hz40;

    .line 996
    .line 997
    iget-object v3, v0, La/hz40;->c:[Ljava/lang/Object;

    .line 998
    .line 999
    iget-object v0, v0, La/hz40;->a:[J

    .line 1000
    .line 1001
    array-length v5, v0

    .line 1002
    const/16 v17, 0x2

    .line 1003
    .line 1004
    add-int/lit8 v5, v5, -0x2

    .line 1005
    .line 1006
    if-ltz v5, :cond_1f

    .line 1007
    .line 1008
    move v6, v2

    .line 1009
    :goto_f
    aget-wide v7, v0, v6

    .line 1010
    .line 1011
    not-long v9, v7

    .line 1012
    shl-long/2addr v9, v4

    .line 1013
    and-long/2addr v9, v7

    .line 1014
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    and-long/2addr v9, v12

    .line 1020
    cmp-long v9, v9, v12

    .line 1021
    .line 1022
    if-eqz v9, :cond_1e

    .line 1023
    .line 1024
    sub-int v9, v6, v5

    .line 1025
    .line 1026
    not-int v9, v9

    .line 1027
    ushr-int/lit8 v9, v9, 0x1f

    .line 1028
    .line 1029
    const/16 v10, 0x8

    .line 1030
    .line 1031
    rsub-int/lit8 v9, v9, 0x8

    .line 1032
    .line 1033
    move v12, v2

    .line 1034
    :goto_10
    if-ge v12, v9, :cond_1d

    .line 1035
    .line 1036
    const-wide/16 v13, 0xff

    .line 1037
    .line 1038
    and-long/2addr v13, v7

    .line 1039
    const-wide/16 v15, 0x80

    .line 1040
    .line 1041
    cmp-long v13, v13, v15

    .line 1042
    .line 1043
    if-gez v13, :cond_1c

    .line 1044
    .line 1045
    shl-int/lit8 v13, v6, 0x3

    .line 1046
    .line 1047
    add-int/2addr v13, v12

    .line 1048
    aget-object v13, v3, v13

    .line 1049
    .line 1050
    check-cast v13, La/k7z;

    .line 1051
    .line 1052
    const/4 v11, 0x1

    .line 1053
    iput-boolean v11, v13, La/k7z;->d:Z

    .line 1054
    .line 1055
    goto :goto_11

    .line 1056
    :cond_1c
    const/4 v11, 0x1

    .line 1057
    :goto_11
    shr-long/2addr v7, v10

    .line 1058
    add-int/lit8 v12, v12, 0x1

    .line 1059
    .line 1060
    goto :goto_10

    .line 1061
    :cond_1d
    const/4 v11, 0x1

    .line 1062
    if-ne v9, v10, :cond_1f

    .line 1063
    .line 1064
    goto :goto_12

    .line 1065
    :cond_1e
    const/4 v11, 0x1

    .line 1066
    :goto_12
    if-eq v6, v5, :cond_1f

    .line 1067
    .line 1068
    add-int/lit8 v6, v6, 0x1

    .line 1069
    .line 1070
    goto :goto_f

    .line 1071
    :cond_1f
    iget-object v0, v1, La/e7z;->i:La/e7z;

    .line 1072
    .line 1073
    if-eqz v0, :cond_20

    .line 1074
    .line 1075
    iget-object v0, v1, La/e7z;->i1:La/i7z;

    .line 1076
    .line 1077
    iget-boolean v0, v0, La/i7z;->e:Z

    .line 1078
    .line 1079
    if-nez v0, :cond_21

    .line 1080
    .line 1081
    invoke-static {v1, v2, v4}, La/e7z;->U(La/e7z;ZI)V

    .line 1082
    .line 1083
    .line 1084
    goto :goto_13

    .line 1085
    :cond_20
    invoke-virtual {v1}, La/e7z;->r()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v0

    .line 1089
    if-nez v0, :cond_21

    .line 1090
    .line 1091
    invoke-static {v1, v2, v4}, La/e7z;->W(La/e7z;ZI)V

    .line 1092
    .line 1093
    .line 1094
    :cond_21
    :goto_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1095
    .line 1096
    return-object v0

    .line 1097
    :pswitch_15
    check-cast v0, La/r4n0;

    .line 1098
    .line 1099
    invoke-virtual {v0}, La/r4n0;->i()V

    .line 1100
    .line 1101
    .line 1102
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1103
    .line 1104
    return-object v0

    .line 1105
    :pswitch_16
    move-object v2, v0

    .line 1106
    check-cast v2, La/o2n0;

    .line 1107
    .line 1108
    new-instance v1, La/w0n0;

    .line 1109
    .line 1110
    const/16 v8, 0x32

    .line 1111
    .line 1112
    sget-object v9, La/ljj;->a:La/ljj;

    .line 1113
    .line 1114
    const/4 v3, 0x0

    .line 1115
    sget-object v4, La/z0q0;->g:La/z0q0;

    .line 1116
    .line 1117
    const-string v5, ""

    .line 1118
    .line 1119
    const-string v6, ""

    .line 1120
    .line 1121
    const/4 v7, 0x0

    .line 1122
    invoke-direct/range {v1 .. v9}, La/w0n0;-><init>(La/o2n0;La/l1q0;La/z0q0;Ljava/lang/String;Ljava/lang/String;ZILa/ljj;)V

    .line 1123
    .line 1124
    .line 1125
    return-object v1

    .line 1126
    :pswitch_17
    check-cast v0, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;

    .line 1127
    .line 1128
    iget-wide v0, v0, Lorg/xplatform/cyber/game/core/betting/presentation/sub_games_filter/SubGamesFilterBottomSheetParams;->a:J

    .line 1129
    .line 1130
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    const-wide/16 v3, -0x1

    .line 1135
    .line 1136
    cmp-long v0, v0, v3

    .line 1137
    .line 1138
    if-eqz v0, :cond_22

    .line 1139
    .line 1140
    goto :goto_14

    .line 1141
    :cond_22
    const/4 v2, 0x0

    .line 1142
    :goto_14
    new-instance v0, La/txm0;

    .line 1143
    .line 1144
    const-string v1, ""

    .line 1145
    .line 1146
    const/4 v3, 0x0

    .line 1147
    invoke-direct {v0, v3, v2, v1}, La/txm0;-><init>(Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;)V

    .line 1148
    .line 1149
    .line 1150
    return-object v0

    .line 1151
    :pswitch_18
    check-cast v0, La/afm0;

    .line 1152
    .line 1153
    iget-object v0, v0, La/afm0;->b:Ljava/lang/Object;

    .line 1154
    .line 1155
    check-cast v0, La/gii0;

    .line 1156
    .line 1157
    const-class v1, La/bhm0;

    .line 1158
    .line 1159
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1160
    .line 1161
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v1

    .line 1165
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    check-cast v0, La/bhm0;

    .line 1170
    .line 1171
    return-object v0

    .line 1172
    :pswitch_19
    check-cast v0, La/g090;

    .line 1173
    .line 1174
    iget-object v0, v0, La/g090;->a:Ljava/lang/Object;

    .line 1175
    .line 1176
    check-cast v0, La/gii0;

    .line 1177
    .line 1178
    const-class v1, La/xgm0;

    .line 1179
    .line 1180
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1181
    .line 1182
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    check-cast v0, La/xgm0;

    .line 1191
    .line 1192
    return-object v0

    .line 1193
    :pswitch_1a
    check-cast v0, La/gxu;

    .line 1194
    .line 1195
    iget-object v0, v0, La/gxu;->b:Ljava/lang/Object;

    .line 1196
    .line 1197
    check-cast v0, La/gii0;

    .line 1198
    .line 1199
    const-class v1, La/sgm0;

    .line 1200
    .line 1201
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1202
    .line 1203
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v1

    .line 1207
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    check-cast v0, La/sgm0;

    .line 1212
    .line 1213
    return-object v0

    .line 1214
    :pswitch_1b
    check-cast v0, La/fuj0;

    .line 1215
    .line 1216
    iget-object v0, v0, La/fuj0;->a:Ljava/lang/Object;

    .line 1217
    .line 1218
    check-cast v0, La/gii0;

    .line 1219
    .line 1220
    const-class v1, La/hgm0;

    .line 1221
    .line 1222
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1223
    .line 1224
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1225
    .line 1226
    .line 1227
    move-result-object v1

    .line 1228
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v0

    .line 1232
    check-cast v0, La/hgm0;

    .line 1233
    .line 1234
    return-object v0

    .line 1235
    :pswitch_1c
    check-cast v0, La/kd30;

    .line 1236
    .line 1237
    iget-object v0, v0, La/kd30;->a:Ljava/lang/Object;

    .line 1238
    .line 1239
    check-cast v0, La/gii0;

    .line 1240
    .line 1241
    const-class v1, La/e9m0;

    .line 1242
    .line 1243
    sget-object v2, La/sre0;->a:La/tre0;

    .line 1244
    .line 1245
    invoke-virtual {v2, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 1246
    .line 1247
    .line 1248
    move-result-object v1

    .line 1249
    invoke-virtual {v0, v1}, La/gii0;->b(La/sgy;)Ljava/lang/Object;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v0

    .line 1253
    check-cast v0, La/e9m0;

    .line 1254
    .line 1255
    return-object v0

    .line 1256
    nop

    .line 1257
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
