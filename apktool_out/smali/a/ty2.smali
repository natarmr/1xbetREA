.class public final La/ty2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kwk;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ty2;->a:B

    iput-object p1, p0, La/ty2;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ty2;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x0

    .line 8
    iget-object v0, v0, La/ty2;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/ywv0;

    .line 14
    .line 15
    iget-object v1, v0, La/ywv0;->l:La/oxv0;

    .line 16
    .line 17
    iget-object v1, v1, La/oxv0;->j:La/hcp0;

    .line 18
    .line 19
    iget-object v1, v1, La/hcp0;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v1, La/q99;

    .line 22
    .line 23
    invoke-virtual {v1, v4}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 24
    .line 25
    .line 26
    iget-object v0, v0, La/ywv0;->m:La/vkr0;

    .line 27
    .line 28
    iget-object v0, v0, La/vkr0;->e:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/hcp0;

    .line 31
    .line 32
    iget-object v0, v0, La/hcp0;->c:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, La/q99;

    .line 35
    .line 36
    invoke-virtual {v0, v4}, La/q99;->d(Ljava/lang/Throwable;)Z

    .line 37
    .line 38
    .line 39
    return-void

    .line 40
    :pswitch_0
    check-cast v0, La/mwv0;

    .line 41
    .line 42
    iget-object v0, v0, La/mwv0;->a:La/pz40;

    .line 43
    .line 44
    check-cast v0, La/hgk0;

    .line 45
    .line 46
    invoke-virtual {v0, v4}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :pswitch_1
    check-cast v0, La/hsv0;

    .line 51
    .line 52
    iget-object v1, v0, La/hsv0;->b:La/jvv0;

    .line 53
    .line 54
    iget-object v2, v0, La/hsv0;->f:La/gsv0;

    .line 55
    .line 56
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-object v3, v1, La/jvv0;->b:La/gsv0;

    .line 60
    .line 61
    if-eq v3, v2, :cond_0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    iput-object v4, v1, La/jvv0;->b:La/gsv0;

    .line 65
    .line 66
    :goto_0
    iput-object v4, v0, La/hsv0;->c:La/u950;

    .line 67
    .line 68
    return-void

    .line 69
    :pswitch_2
    check-cast v0, La/nmu0;

    .line 70
    .line 71
    sget-object v1, La/nmu0;->O1:La/svs0;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :pswitch_3
    check-cast v0, La/mld;

    .line 82
    .line 83
    invoke-interface {v0}, La/mld;->a()V

    .line 84
    .line 85
    .line 86
    return-void

    .line 87
    :pswitch_4
    check-cast v0, La/p4;

    .line 88
    .line 89
    check-cast v0, La/pvh0;

    .line 90
    .line 91
    invoke-virtual {v0, v4}, La/pvh0;->v1(La/pgk0;)V

    .line 92
    .line 93
    .line 94
    return-void

    .line 95
    :pswitch_5
    check-cast v0, La/k3t0;

    .line 96
    .line 97
    sget-object v1, La/dkb0;->a:La/dkb0;

    .line 98
    .line 99
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void

    .line 103
    :pswitch_6
    check-cast v0, La/uiu0;

    .line 104
    .line 105
    instance-of v1, v0, Ljava/lang/AutoCloseable;

    .line 106
    .line 107
    if-eqz v1, :cond_1

    .line 108
    .line 109
    invoke-virtual {v0}, La/uiu0;->close()V

    .line 110
    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_1
    instance-of v1, v0, Ljava/util/concurrent/ExecutorService;

    .line 114
    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    .line 118
    .line 119
    invoke-static {}, Ljava/util/concurrent/ForkJoinPool;->commonPool()Ljava/util/concurrent/ForkJoinPool;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    if-ne v0, v1, :cond_2

    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_2
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->isTerminated()Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-nez v1, :cond_6

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdown()V

    .line 133
    .line 134
    .line 135
    :cond_3
    :goto_1
    if-nez v1, :cond_4

    .line 136
    .line 137
    :try_start_0
    sget-object v4, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    .line 138
    .line 139
    const-wide/16 v5, 0x1

    .line 140
    .line 141
    invoke-interface {v0, v5, v6, v4}, Ljava/util/concurrent/ExecutorService;->awaitTermination(JLjava/util/concurrent/TimeUnit;)Z

    .line 142
    .line 143
    .line 144
    move-result v1
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 145
    goto :goto_1

    .line 146
    :catch_0
    if-nez v3, :cond_3

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 149
    .line 150
    .line 151
    move v3, v2

    .line 152
    goto :goto_1

    .line 153
    :cond_4
    if-eqz v3, :cond_6

    .line 154
    .line 155
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 160
    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_5
    invoke-static {}, La/e9d0;->o()V

    .line 164
    .line 165
    .line 166
    :cond_6
    :goto_2
    return-void

    .line 167
    :pswitch_7
    check-cast v0, La/ye50;

    .line 168
    .line 169
    invoke-virtual {v0}, La/ye50;->d()V

    .line 170
    .line 171
    .line 172
    iput-boolean v2, v0, La/ye50;->c:Z

    .line 173
    .line 174
    new-instance v1, La/xw3;

    .line 175
    .line 176
    invoke-direct {v1}, La/xw3;-><init>()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v1, v0}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 180
    .line 181
    .line 182
    :goto_3
    invoke-virtual {v1}, La/xw3;->isEmpty()Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-nez v5, :cond_b

    .line 187
    .line 188
    invoke-virtual {v1}, La/xw3;->removeFirst()Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object v5

    .line 192
    check-cast v5, La/ye50;

    .line 193
    .line 194
    iput-boolean v2, v5, La/ye50;->c:Z

    .line 195
    .line 196
    iget-object v6, v5, La/ye50;->g:La/xy40;

    .line 197
    .line 198
    iget-object v7, v5, La/ye50;->h:La/xy40;

    .line 199
    .line 200
    iget-object v8, v5, La/ye50;->f:La/xy40;

    .line 201
    .line 202
    iget-object v9, v8, La/xy40;->b:[Ljava/lang/Object;

    .line 203
    .line 204
    iget-object v10, v8, La/xy40;->c:[J

    .line 205
    .line 206
    iget v11, v8, La/xy40;->e:I

    .line 207
    .line 208
    :goto_4
    const-wide/32 v12, 0x7fffffff

    .line 209
    .line 210
    .line 211
    const/16 v14, 0x1f

    .line 212
    .line 213
    const v15, 0x7fffffff

    .line 214
    .line 215
    .line 216
    if-eq v11, v15, :cond_7

    .line 217
    .line 218
    aget-wide v15, v10, v11

    .line 219
    .line 220
    shr-long v14, v15, v14

    .line 221
    .line 222
    and-long/2addr v12, v14

    .line 223
    long-to-int v12, v12

    .line 224
    aget-object v11, v9, v11

    .line 225
    .line 226
    check-cast v11, La/ye50;

    .line 227
    .line 228
    invoke-virtual {v1, v11}, La/xw3;->addLast(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    move v11, v12

    .line 232
    goto :goto_4

    .line 233
    :cond_7
    invoke-static {v7}, La/bww;->Y(La/xy40;)La/xy40;

    .line 234
    .line 235
    .line 236
    move-result-object v9

    .line 237
    iget-object v10, v9, La/xy40;->b:[Ljava/lang/Object;

    .line 238
    .line 239
    iget-object v11, v9, La/xy40;->c:[J

    .line 240
    .line 241
    iget v9, v9, La/xy40;->e:I

    .line 242
    .line 243
    :goto_5
    if-eq v9, v15, :cond_8

    .line 244
    .line 245
    aget-wide v16, v11, v9

    .line 246
    .line 247
    shr-long v16, v16, v14

    .line 248
    .line 249
    move-wide/from16 v18, v12

    .line 250
    .line 251
    and-long v12, v16, v18

    .line 252
    .line 253
    long-to-int v12, v12

    .line 254
    aget-object v9, v10, v9

    .line 255
    .line 256
    check-cast v9, La/ef50;

    .line 257
    .line 258
    iget-object v13, v0, La/ye50;->e:La/ff50;

    .line 259
    .line 260
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 264
    .line 265
    .line 266
    iget-object v2, v13, La/ff50;->k:La/xy40;

    .line 267
    .line 268
    invoke-virtual {v2, v9}, La/xy40;->h(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    iget-object v2, v13, La/ff50;->j:La/xy40;

    .line 272
    .line 273
    invoke-virtual {v2, v9}, La/xy40;->h(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    iget-object v2, v13, La/ff50;->i:La/xy40;

    .line 277
    .line 278
    invoke-virtual {v2, v9}, La/xy40;->h(Ljava/lang/Object;)Z

    .line 279
    .line 280
    .line 281
    iput-object v4, v9, La/ef50;->a:La/ye50;

    .line 282
    .line 283
    iput-boolean v3, v9, La/ef50;->b:Z

    .line 284
    .line 285
    invoke-virtual {v9}, La/ef50;->d()V

    .line 286
    .line 287
    .line 288
    move v9, v12

    .line 289
    move-wide/from16 v12, v18

    .line 290
    .line 291
    const/4 v2, 0x1

    .line 292
    goto :goto_5

    .line 293
    :cond_8
    move-wide/from16 v18, v12

    .line 294
    .line 295
    invoke-virtual {v7}, La/xy40;->b()V

    .line 296
    .line 297
    .line 298
    invoke-static {v6}, La/bww;->Y(La/xy40;)La/xy40;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    iget-object v7, v2, La/xy40;->b:[Ljava/lang/Object;

    .line 303
    .line 304
    iget-object v9, v2, La/xy40;->c:[J

    .line 305
    .line 306
    iget v2, v2, La/xy40;->e:I

    .line 307
    .line 308
    :goto_6
    if-eq v2, v15, :cond_9

    .line 309
    .line 310
    aget-wide v10, v9, v2

    .line 311
    .line 312
    shr-long/2addr v10, v14

    .line 313
    and-long v10, v10, v18

    .line 314
    .line 315
    long-to-int v10, v10

    .line 316
    aget-object v2, v7, v2

    .line 317
    .line 318
    check-cast v2, La/af50;

    .line 319
    .line 320
    invoke-virtual {v2}, La/af50;->h()V

    .line 321
    .line 322
    .line 323
    move v2, v10

    .line 324
    goto :goto_6

    .line 325
    :cond_9
    invoke-virtual {v6}, La/xy40;->b()V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v8}, La/xy40;->b()V

    .line 329
    .line 330
    .line 331
    iget-object v2, v5, La/ye50;->a:La/ye50;

    .line 332
    .line 333
    if-eqz v2, :cond_a

    .line 334
    .line 335
    iget-object v2, v2, La/ye50;->f:La/xy40;

    .line 336
    .line 337
    if-eqz v2, :cond_a

    .line 338
    .line 339
    invoke-virtual {v2, v5}, La/xy40;->h(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    :cond_a
    iput-object v4, v5, La/ye50;->a:La/ye50;

    .line 343
    .line 344
    const/4 v2, 0x1

    .line 345
    goto/16 :goto_3

    .line 346
    .line 347
    :cond_b
    return-void

    .line 348
    :pswitch_8
    check-cast v0, La/lmc0;

    .line 349
    .line 350
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 355
    .line 356
    .line 357
    return-void

    .line 358
    :pswitch_9
    check-cast v0, La/ccb0;

    .line 359
    .line 360
    sget-object v1, La/ccb0;->X1:La/mi70;

    .line 361
    .line 362
    const-string v1, "ADD_ADDITIONAL_EVENTS_TO_COUPON_DIALOG_REQUEST__KEY"

    .line 363
    .line 364
    invoke-static {v0, v1}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    const-string v2, "KEY_2FA_ALERT"

    .line 372
    .line 373
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    const-string v2, "REQUEST_SUCCESS_AUTHENTICATOR_DIALOG_KEY"

    .line 381
    .line 382
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    const-string v2, "SWITCH_ON_NOTIFICATION_INFO_DIALOG_REQUEST_KEY"

    .line 390
    .line 391
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    const-string v1, "RESET_HASH_SECRET_KEY"

    .line 395
    .line 396
    invoke-static {v0, v1}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    const-string v2, "KZ_IDENTIFICATION_ALERT_REQUEST_KEY"

    .line 404
    .line 405
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, La/ccb0;->H0()La/wdk0;

    .line 409
    .line 410
    .line 411
    const-string v1, "request_key_notification_updated"

    .line 412
    .line 413
    invoke-static {v0, v1}, La/vcc;->C(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 414
    .line 415
    .line 416
    return-void

    .line 417
    :pswitch_a
    check-cast v0, La/gx60;

    .line 418
    .line 419
    sget-object v1, La/gx60;->R1:La/atz;

    .line 420
    .line 421
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 426
    .line 427
    .line 428
    return-void

    .line 429
    :pswitch_b
    check-cast v0, La/xt60;

    .line 430
    .line 431
    sget-object v1, La/xt60;->V1:La/xuz;

    .line 432
    .line 433
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 438
    .line 439
    .line 440
    return-void

    .line 441
    :pswitch_c
    check-cast v0, La/dm60;

    .line 442
    .line 443
    sget-object v1, La/dm60;->P1:La/wsz;

    .line 444
    .line 445
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 450
    .line 451
    .line 452
    return-void

    .line 453
    :pswitch_d
    check-cast v0, La/ufk0;

    .line 454
    .line 455
    iget-object v1, v0, La/ufk0;->a:La/dw5;

    .line 456
    .line 457
    if-eqz v1, :cond_c

    .line 458
    .line 459
    goto :goto_7

    .line 460
    :cond_c
    const-string v2, "Called dispose on a manager that has been disposed of"

    .line 461
    .line 462
    invoke-static {v2}, La/dsb0;->b(Ljava/lang/String;)V

    .line 463
    .line 464
    .line 465
    :goto_7
    invoke-virtual {v1}, La/dw5;->e()V

    .line 466
    .line 467
    .line 468
    iput-object v4, v0, La/ufk0;->a:La/dw5;

    .line 469
    .line 470
    return-void

    .line 471
    :pswitch_e
    check-cast v0, La/wl40;

    .line 472
    .line 473
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 474
    .line 475
    .line 476
    iget-object v0, v0, La/wl40;->i:La/tl40;

    .line 477
    .line 478
    invoke-virtual {v0}, La/x1;->e()V

    .line 479
    .line 480
    .line 481
    return-void

    .line 482
    :pswitch_f
    check-cast v0, La/pz40;

    .line 483
    .line 484
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 485
    .line 486
    .line 487
    move-result-object v0

    .line 488
    check-cast v0, Landroid/webkit/WebView;

    .line 489
    .line 490
    if-eqz v0, :cond_d

    .line 491
    .line 492
    invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V

    .line 493
    .line 494
    .line 495
    :cond_d
    return-void

    .line 496
    :pswitch_10
    check-cast v0, La/tbz;

    .line 497
    .line 498
    iget-object v1, v0, La/tbz;->c:La/o24;

    .line 499
    .line 500
    if-eqz v1, :cond_e

    .line 501
    .line 502
    iput-boolean v3, v1, La/o24;->a:Z

    .line 503
    .line 504
    :cond_e
    iput-object v4, v0, La/tbz;->c:La/o24;

    .line 505
    .line 506
    return-void

    .line 507
    :pswitch_11
    check-cast v0, La/fbz;

    .line 508
    .line 509
    iput-object v4, v0, La/fbz;->d:La/ugd;

    .line 510
    .line 511
    return-void

    .line 512
    :pswitch_12
    check-cast v0, La/i3t0;

    .line 513
    .line 514
    sget-object v1, La/big;->a:La/big;

    .line 515
    .line 516
    invoke-virtual {v0, v1}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_13
    check-cast v0, La/aig;

    .line 521
    .line 522
    sget-object v1, La/fhg;->a:La/fhg;

    .line 523
    .line 524
    invoke-virtual {v0, v1}, La/aig;->M(La/shg;)V

    .line 525
    .line 526
    .line 527
    return-void

    .line 528
    :pswitch_14
    check-cast v0, La/k7q0;

    .line 529
    .line 530
    invoke-virtual {v0}, La/k7q0;->m()V

    .line 531
    .line 532
    .line 533
    return-void

    .line 534
    :pswitch_15
    check-cast v0, La/gnc;

    .line 535
    .line 536
    sget-object v1, La/gnc;->Z1:La/kl5;

    .line 537
    .line 538
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 543
    .line 544
    .line 545
    return-void

    .line 546
    :pswitch_16
    check-cast v0, La/g5b;

    .line 547
    .line 548
    sget-object v1, La/g5b;->c2:La/gl5;

    .line 549
    .line 550
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 551
    .line 552
    .line 553
    move-result-object v0

    .line 554
    invoke-static {v0}, La/o2t;->a(Landroidx/fragment/app/e;)V

    .line 555
    .line 556
    .line 557
    return-void

    .line 558
    :pswitch_17
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 559
    .line 560
    :try_start_1
    move-object v1, v0

    .line 561
    check-cast v1, La/ulo;

    .line 562
    .line 563
    invoke-virtual {v1}, La/ulo;->W()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 564
    .line 565
    .line 566
    :catch_1
    :try_start_2
    check-cast v0, La/ulo;

    .line 567
    .line 568
    invoke-virtual {v0}, La/ulo;->F()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 569
    .line 570
    .line 571
    :catch_2
    return-void

    .line 572
    :pswitch_18
    check-cast v0, La/bxq0;

    .line 573
    .line 574
    iget-object v0, v0, La/bxq0;->c:La/n5a;

    .line 575
    .line 576
    if-eqz v0, :cond_f

    .line 577
    .line 578
    invoke-virtual {v0, v4}, La/n5a;->h(Ljava/lang/Throwable;)Z

    .line 579
    .line 580
    .line 581
    :cond_f
    return-void

    .line 582
    :pswitch_19
    check-cast v0, La/v96;

    .line 583
    .line 584
    iget-object v0, v0, La/v96;->c:La/pz40;

    .line 585
    .line 586
    check-cast v0, La/hgk0;

    .line 587
    .line 588
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    check-cast v0, La/u96;

    .line 593
    .line 594
    if-eqz v0, :cond_10

    .line 595
    .line 596
    invoke-virtual {v0}, La/u96;->close()V

    .line 597
    .line 598
    .line 599
    :cond_10
    return-void

    .line 600
    :pswitch_1a
    check-cast v0, La/h23;

    .line 601
    .line 602
    iget-object v1, v0, La/h23;->e:La/pgk0;

    .line 603
    .line 604
    iget-object v2, v1, La/pgk0;->h:La/jk8;

    .line 605
    .line 606
    if-eqz v2, :cond_11

    .line 607
    .line 608
    invoke-virtual {v2}, La/jk8;->a()V

    .line 609
    .line 610
    .line 611
    :cond_11
    invoke-virtual {v1}, La/pgk0;->a()V

    .line 612
    .line 613
    .line 614
    iget-object v1, v0, La/h23;->h:Landroid/view/ActionMode;

    .line 615
    .line 616
    if-eqz v1, :cond_12

    .line 617
    .line 618
    invoke-virtual {v1}, Landroid/view/ActionMode;->finish()V

    .line 619
    .line 620
    .line 621
    :cond_12
    iput-object v4, v0, La/h23;->h:Landroid/view/ActionMode;

    .line 622
    .line 623
    return-void

    .line 624
    :pswitch_1b
    check-cast v0, La/rmb0;

    .line 625
    .line 626
    invoke-virtual {v0}, La/x1;->e()V

    .line 627
    .line 628
    .line 629
    const v1, 0x7f0a1426

    .line 630
    .line 631
    .line 632
    invoke-virtual {v0, v1, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    iget-object v1, v0, La/rmb0;->p:Landroid/view/WindowManager;

    .line 636
    .line 637
    invoke-interface {v1, v0}, Landroid/view/WindowManager;->removeViewImmediate(Landroid/view/View;)V

    .line 638
    .line 639
    .line 640
    return-void

    .line 641
    :pswitch_1c
    check-cast v0, La/xjk;

    .line 642
    .line 643
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 644
    .line 645
    .line 646
    iget-object v0, v0, La/xjk;->h:La/xik;

    .line 647
    .line 648
    invoke-virtual {v0}, La/x1;->e()V

    .line 649
    .line 650
    .line 651
    return-void

    .line 652
    nop

    .line 653
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
