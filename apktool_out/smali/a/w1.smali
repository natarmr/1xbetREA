.class public final synthetic La/w1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/x1a;Ljava/util/Set;)V
    .locals 0

    .line 1
    const/16 p1, 0x16

    iput-byte p1, p0, La/w1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/w1;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/w1;->a:B

    iput-object p1, p0, La/w1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/w1;->a:B

    .line 4
    .line 5
    const-wide/16 v2, 0x0

    .line 6
    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x0

    .line 9
    const/4 v6, 0x0

    .line 10
    const/4 v7, 0x1

    .line 11
    iget-object v0, v0, La/w1;->b:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v0, Landroid/app/Dialog;

    .line 17
    .line 18
    sget-object v1, La/dbe;->k2:La/kud;

    .line 19
    .line 20
    invoke-virtual {v0, v7}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :pswitch_0
    check-cast v0, La/hgd;

    .line 25
    .line 26
    invoke-static {v0}, La/hgd;->d(La/hgd;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_1
    check-cast v0, La/xfd;

    .line 31
    .line 32
    iget-object v1, v0, La/xfd;->b:Ljava/lang/Runnable;

    .line 33
    .line 34
    if-eqz v1, :cond_0

    .line 35
    .line 36
    invoke-interface {v1}, Ljava/lang/Runnable;->run()V

    .line 37
    .line 38
    .line 39
    iput-object v5, v0, La/xfd;->b:Ljava/lang/Runnable;

    .line 40
    .line 41
    :cond_0
    return-void

    .line 42
    :pswitch_2
    check-cast v0, La/ssc;

    .line 43
    .line 44
    invoke-virtual {v0, v7}, La/ssc;->s(Z)V

    .line 45
    .line 46
    .line 47
    return-void

    .line 48
    :pswitch_3
    check-cast v0, Lcom/google/android/material/carousel/CarouselLayoutManager;

    .line 49
    .line 50
    invoke-virtual {v0}, Landroidx/recyclerview/widget/b;->F0()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :pswitch_4
    check-cast v0, La/wx9;

    .line 55
    .line 56
    iget-object v0, v0, La/wx9;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast v0, La/esg0;

    .line 59
    .line 60
    iget-object v0, v0, La/esg0;->a:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, La/dzb0;

    .line 63
    .line 64
    if-eqz v0, :cond_2

    .line 65
    .line 66
    const-string v1, "ProcessingRequest"

    .line 67
    .line 68
    new-instance v2, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    const-string v3, "onCaptureStarted: request ID = "

    .line 71
    .line 72
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    iget v3, v0, La/dzb0;->a:I

    .line 76
    .line 77
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v2

    .line 84
    invoke-static {v1, v2}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    iget-object v0, v0, La/dzb0;->g:La/snf0;

    .line 88
    .line 89
    invoke-static {}, La/ofm0;->m()V

    .line 90
    .line 91
    .line 92
    iget-boolean v1, v0, La/snf0;->g:Z

    .line 93
    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    iget-boolean v1, v0, La/snf0;->h:Z

    .line 97
    .line 98
    if-eqz v1, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    iput-boolean v7, v0, La/snf0;->h:Z

    .line 102
    .line 103
    :cond_2
    :goto_0
    return-void

    .line 104
    :pswitch_5
    check-cast v0, La/yk50;

    .line 105
    .line 106
    iget-object v0, v0, La/yk50;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Lcom/journeyapps/barcodescanner/BarcodeView;

    .line 109
    .line 110
    invoke-virtual {v0}, La/d2a;->e()V

    .line 111
    .line 112
    .line 113
    return-void

    .line 114
    :pswitch_6
    check-cast v0, Ljava/util/Set;

    .line 115
    .line 116
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_7
    check-cast v0, Ljava/lang/Runnable;

    .line 121
    .line 122
    const/4 v1, -0x3

    .line 123
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 124
    .line 125
    .line 126
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 127
    .line 128
    .line 129
    return-void

    .line 130
    :pswitch_8
    check-cast v0, La/nx9;

    .line 131
    .line 132
    new-instance v1, La/qv3;

    .line 133
    .line 134
    const/16 v2, 0x19

    .line 135
    .line 136
    invoke-direct {v1, v0, v5, v2}, La/qv3;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 137
    .line 138
    .line 139
    invoke-static {v1}, La/saj;->b0(Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :pswitch_9
    check-cast v0, La/cx9;

    .line 144
    .line 145
    iget-object v0, v0, La/cx9;->e:La/sje;

    .line 146
    .line 147
    invoke-static {v0, v5}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :pswitch_a
    check-cast v0, La/yi9;

    .line 152
    .line 153
    :try_start_0
    invoke-virtual {v0}, La/yi9;->a()Lokhttp3/internal/cache/DiskLruCache;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    invoke-virtual {v1}, Lokhttp3/internal/cache/DiskLruCache;->isClosed()Z

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-nez v1, :cond_3

    .line 162
    .line 163
    invoke-virtual {v0}, La/yi9;->a()Lokhttp3/internal/cache/DiskLruCache;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, Lokhttp3/internal/cache/DiskLruCache;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :catchall_0
    move-exception v0

    .line 172
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 173
    .line 174
    .line 175
    :cond_3
    :goto_1
    return-void

    .line 176
    :pswitch_b
    check-cast v0, La/yx5;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->Q()Z

    .line 179
    .line 180
    .line 181
    move-result v1

    .line 182
    if-eqz v1, :cond_4

    .line 183
    .line 184
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->S()Z

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    if-eqz v1, :cond_4

    .line 189
    .line 190
    invoke-virtual {v0}, La/yx5;->F0()V

    .line 191
    .line 192
    .line 193
    :cond_4
    return-void

    .line 194
    :pswitch_c
    check-cast v0, La/nz4;

    .line 195
    .line 196
    iget-object v0, v0, La/nz4;->a:La/oz4;

    .line 197
    .line 198
    iput-boolean v6, v0, La/oz4;->b:Z

    .line 199
    .line 200
    invoke-virtual {v0}, La/oz4;->a()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_d
    check-cast v0, La/vg00;

    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    iget-object v2, v0, La/vg00;->a:Ljava/lang/Thread;

    .line 214
    .line 215
    if-ne v1, v2, :cond_5

    .line 216
    .line 217
    new-instance v1, La/jf4;

    .line 218
    .line 219
    const/16 v2, 0x11

    .line 220
    .line 221
    invoke-direct {v1, v2}, La/jf4;-><init>(B)V

    .line 222
    .line 223
    .line 224
    const/4 v2, -0x1

    .line 225
    invoke-virtual {v0, v2, v1}, La/vg00;->e(ILa/sg00;)V

    .line 226
    .line 227
    .line 228
    :cond_5
    return-void

    .line 229
    :pswitch_e
    check-cast v0, La/x34;

    .line 230
    .line 231
    iget-object v0, v0, La/x34;->a:La/sje;

    .line 232
    .line 233
    invoke-static {v0, v5}, La/d5c;->G(La/vne;Ljava/util/concurrent/CancellationException;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_f
    check-cast v0, La/krs0;

    .line 238
    .line 239
    invoke-virtual {v0}, La/krs0;->j()V

    .line 240
    .line 241
    .line 242
    return-void

    .line 243
    :pswitch_10
    check-cast v0, La/n24;

    .line 244
    .line 245
    iget-object v1, v0, La/n24;->c:La/o24;

    .line 246
    .line 247
    iget-boolean v1, v1, La/o24;->a:Z

    .line 248
    .line 249
    if-eqz v1, :cond_6

    .line 250
    .line 251
    iget-object v0, v0, La/n24;->a:La/qlo;

    .line 252
    .line 253
    iget-object v0, v0, La/qlo;->a:La/ulo;

    .line 254
    .line 255
    const/4 v1, 0x3

    .line 256
    invoke-virtual {v0, v1, v6}, La/ulo;->Z(IZ)V

    .line 257
    .line 258
    .line 259
    :cond_6
    return-void

    .line 260
    :pswitch_11
    check-cast v0, La/o24;

    .line 261
    .line 262
    iget-object v1, v0, La/o24;->b:Ljava/lang/Object;

    .line 263
    .line 264
    check-cast v1, Landroid/content/Context;

    .line 265
    .line 266
    iget-object v0, v0, La/o24;->c:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, La/n24;

    .line 269
    .line 270
    invoke-virtual {v1, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 271
    .line 272
    .line 273
    return-void

    .line 274
    :pswitch_12
    check-cast v0, La/u04;

    .line 275
    .line 276
    iget-object v1, v0, La/u04;->a:Ljava/lang/Object;

    .line 277
    .line 278
    monitor-enter v1

    .line 279
    :try_start_1
    iget-boolean v4, v0, La/u04;->m:Z

    .line 280
    .line 281
    if-eqz v4, :cond_7

    .line 282
    .line 283
    monitor-exit v1

    .line 284
    goto :goto_2

    .line 285
    :catchall_1
    move-exception v0

    .line 286
    goto :goto_3

    .line 287
    :cond_7
    iget-wide v4, v0, La/u04;->l:J

    .line 288
    .line 289
    const-wide/16 v6, 0x1

    .line 290
    .line 291
    sub-long/2addr v4, v6

    .line 292
    iput-wide v4, v0, La/u04;->l:J

    .line 293
    .line 294
    cmp-long v2, v4, v2

    .line 295
    .line 296
    if-lez v2, :cond_8

    .line 297
    .line 298
    monitor-exit v1

    .line 299
    goto :goto_2

    .line 300
    :cond_8
    if-gez v2, :cond_9

    .line 301
    .line 302
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 303
    .line 304
    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    .line 305
    .line 306
    .line 307
    iget-object v3, v0, La/u04;->a:Ljava/lang/Object;

    .line 308
    .line 309
    monitor-enter v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 310
    :try_start_2
    iput-object v2, v0, La/u04;->n:Ljava/lang/IllegalStateException;

    .line 311
    .line 312
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 313
    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 314
    goto :goto_2

    .line 315
    :catchall_2
    move-exception v0

    .line 316
    :try_start_4
    monitor-exit v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 317
    :try_start_5
    throw v0

    .line 318
    :cond_9
    invoke-virtual {v0}, La/u04;->a()V

    .line 319
    .line 320
    .line 321
    monitor-exit v1

    .line 322
    :goto_2
    return-void

    .line 323
    :goto_3
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 324
    throw v0

    .line 325
    :pswitch_13
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 326
    .line 327
    sget v1, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 328
    .line 329
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    invoke-virtual {v0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 342
    .line 343
    .line 344
    check-cast v0, Landroid/view/ViewGroup;

    .line 345
    .line 346
    invoke-static {v0}, La/f7k;->a0(Landroid/view/ViewGroup;)V

    .line 347
    .line 348
    .line 349
    return-void

    .line 350
    :pswitch_14
    check-cast v0, La/t3e;

    .line 351
    .line 352
    invoke-virtual {v0}, La/t3e;->invoke()Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_15
    check-cast v0, La/e73;

    .line 357
    .line 358
    iget-object v0, v0, La/e73;->c:La/yk50;

    .line 359
    .line 360
    iget-object v0, v0, La/yk50;->b:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast v0, La/e73;

    .line 363
    .line 364
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 365
    .line 366
    .line 367
    move-result-wide v8

    .line 368
    iget-object v1, v0, La/e73;->b:Ljava/util/ArrayList;

    .line 369
    .line 370
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 371
    .line 372
    .line 373
    move-result-wide v10

    .line 374
    move v4, v6

    .line 375
    :goto_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 376
    .line 377
    .line 378
    move-result v12

    .line 379
    if-ge v4, v12, :cond_1a

    .line 380
    .line 381
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v12

    .line 385
    check-cast v12, La/kul0;

    .line 386
    .line 387
    if-nez v12, :cond_b

    .line 388
    .line 389
    :cond_a
    :goto_5
    move v14, v4

    .line 390
    move-wide/from16 v25, v8

    .line 391
    .line 392
    goto/16 :goto_10

    .line 393
    .line 394
    :cond_b
    iget-object v13, v0, La/e73;->a:La/nuj0;

    .line 395
    .line 396
    invoke-virtual {v13, v12}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    .line 398
    .line 399
    move-result-object v14

    .line 400
    check-cast v14, Ljava/lang/Long;

    .line 401
    .line 402
    if-nez v14, :cond_c

    .line 403
    .line 404
    goto :goto_6

    .line 405
    :cond_c
    invoke-virtual {v14}, Ljava/lang/Long;->longValue()J

    .line 406
    .line 407
    .line 408
    move-result-wide v14

    .line 409
    cmp-long v14, v14, v10

    .line 410
    .line 411
    if-gez v14, :cond_a

    .line 412
    .line 413
    invoke-virtual {v13, v12}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 414
    .line 415
    .line 416
    :goto_6
    iget-wide v13, v12, La/kul0;->i:J

    .line 417
    .line 418
    cmp-long v15, v13, v2

    .line 419
    .line 420
    if-nez v15, :cond_d

    .line 421
    .line 422
    iput-wide v8, v12, La/kul0;->i:J

    .line 423
    .line 424
    iget v13, v12, La/kul0;->b:F

    .line 425
    .line 426
    invoke-virtual {v12, v13}, La/kul0;->c(F)V

    .line 427
    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_d
    sub-long v13, v8, v13

    .line 431
    .line 432
    iput-wide v8, v12, La/kul0;->i:J

    .line 433
    .line 434
    invoke-static {}, La/e73;->a()La/e73;

    .line 435
    .line 436
    .line 437
    move-result-object v15

    .line 438
    iget v15, v15, La/e73;->g:F

    .line 439
    .line 440
    const/4 v2, 0x0

    .line 441
    cmpl-float v3, v15, v2

    .line 442
    .line 443
    if-nez v3, :cond_e

    .line 444
    .line 445
    const-wide/32 v13, 0x7fffffff

    .line 446
    .line 447
    .line 448
    :goto_7
    move-wide/from16 v23, v13

    .line 449
    .line 450
    goto :goto_8

    .line 451
    :cond_e
    long-to-float v3, v13

    .line 452
    div-float/2addr v3, v15

    .line 453
    float-to-long v13, v3

    .line 454
    goto :goto_7

    .line 455
    :goto_8
    iget-boolean v3, v12, La/kul0;->o:Z

    .line 456
    .line 457
    iget v13, v12, La/kul0;->n:F

    .line 458
    .line 459
    const v14, 0x7f7fffff    # Float.MAX_VALUE

    .line 460
    .line 461
    .line 462
    if-eqz v3, :cond_10

    .line 463
    .line 464
    cmpl-float v3, v13, v14

    .line 465
    .line 466
    if-eqz v3, :cond_f

    .line 467
    .line 468
    iget-object v3, v12, La/kul0;->m:La/lul0;

    .line 469
    .line 470
    move-wide/from16 v25, v8

    .line 471
    .line 472
    float-to-double v7, v13

    .line 473
    iput-wide v7, v3, La/lul0;->i:D

    .line 474
    .line 475
    iput v14, v12, La/kul0;->n:F

    .line 476
    .line 477
    goto :goto_9

    .line 478
    :cond_f
    move-wide/from16 v25, v8

    .line 479
    .line 480
    :goto_9
    iget-object v3, v12, La/kul0;->m:La/lul0;

    .line 481
    .line 482
    iget-wide v7, v3, La/lul0;->i:D

    .line 483
    .line 484
    double-to-float v3, v7

    .line 485
    iput v3, v12, La/kul0;->b:F

    .line 486
    .line 487
    iput v2, v12, La/kul0;->a:F

    .line 488
    .line 489
    iput-boolean v6, v12, La/kul0;->o:Z

    .line 490
    .line 491
    move v14, v4

    .line 492
    :goto_a
    const/4 v2, 0x1

    .line 493
    goto/16 :goto_c

    .line 494
    .line 495
    :cond_10
    move-wide/from16 v25, v8

    .line 496
    .line 497
    cmpl-float v3, v13, v14

    .line 498
    .line 499
    iget-object v7, v12, La/kul0;->m:La/lul0;

    .line 500
    .line 501
    iget v8, v12, La/kul0;->b:F

    .line 502
    .line 503
    iget v9, v12, La/kul0;->a:F

    .line 504
    .line 505
    if-eqz v3, :cond_11

    .line 506
    .line 507
    float-to-double v5, v8

    .line 508
    float-to-double v8, v9

    .line 509
    const-wide/16 v18, 0x2

    .line 510
    .line 511
    div-long v32, v23, v18

    .line 512
    .line 513
    move-wide/from16 v28, v5

    .line 514
    .line 515
    move-object/from16 v27, v7

    .line 516
    .line 517
    move-wide/from16 v30, v8

    .line 518
    .line 519
    invoke-virtual/range {v27 .. v33}, La/lul0;->c(DDJ)La/yx3;

    .line 520
    .line 521
    .line 522
    move-result-object v5

    .line 523
    iget-object v6, v12, La/kul0;->m:La/lul0;

    .line 524
    .line 525
    iget v7, v12, La/kul0;->n:F

    .line 526
    .line 527
    float-to-double v7, v7

    .line 528
    iput-wide v7, v6, La/lul0;->i:D

    .line 529
    .line 530
    iput v14, v12, La/kul0;->n:F

    .line 531
    .line 532
    iget v7, v5, La/yx3;->a:F

    .line 533
    .line 534
    float-to-double v7, v7

    .line 535
    iget v5, v5, La/yx3;->b:F

    .line 536
    .line 537
    move v14, v4

    .line 538
    float-to-double v3, v5

    .line 539
    move-wide/from16 v30, v3

    .line 540
    .line 541
    move-object/from16 v27, v6

    .line 542
    .line 543
    move-wide/from16 v28, v7

    .line 544
    .line 545
    invoke-virtual/range {v27 .. v33}, La/lul0;->c(DDJ)La/yx3;

    .line 546
    .line 547
    .line 548
    move-result-object v3

    .line 549
    iget v4, v3, La/yx3;->a:F

    .line 550
    .line 551
    iput v4, v12, La/kul0;->b:F

    .line 552
    .line 553
    iget v3, v3, La/yx3;->b:F

    .line 554
    .line 555
    iput v3, v12, La/kul0;->a:F

    .line 556
    .line 557
    goto :goto_b

    .line 558
    :cond_11
    move v14, v4

    .line 559
    move-object/from16 v18, v7

    .line 560
    .line 561
    float-to-double v3, v8

    .line 562
    float-to-double v5, v9

    .line 563
    move-wide/from16 v19, v3

    .line 564
    .line 565
    move-wide/from16 v21, v5

    .line 566
    .line 567
    invoke-virtual/range {v18 .. v24}, La/lul0;->c(DDJ)La/yx3;

    .line 568
    .line 569
    .line 570
    move-result-object v3

    .line 571
    iget v4, v3, La/yx3;->a:F

    .line 572
    .line 573
    iput v4, v12, La/kul0;->b:F

    .line 574
    .line 575
    iget v3, v3, La/yx3;->b:F

    .line 576
    .line 577
    iput v3, v12, La/kul0;->a:F

    .line 578
    .line 579
    :goto_b
    iget v3, v12, La/kul0;->h:F

    .line 580
    .line 581
    invoke-static {v4, v3}, Ljava/lang/Math;->max(FF)F

    .line 582
    .line 583
    .line 584
    move-result v3

    .line 585
    iput v3, v12, La/kul0;->b:F

    .line 586
    .line 587
    iget v4, v12, La/kul0;->g:F

    .line 588
    .line 589
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 590
    .line 591
    .line 592
    move-result v3

    .line 593
    iput v3, v12, La/kul0;->b:F

    .line 594
    .line 595
    iget v4, v12, La/kul0;->a:F

    .line 596
    .line 597
    iget-object v5, v12, La/kul0;->m:La/lul0;

    .line 598
    .line 599
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 603
    .line 604
    .line 605
    move-result v4

    .line 606
    float-to-double v6, v4

    .line 607
    iget-wide v8, v5, La/lul0;->e:D

    .line 608
    .line 609
    cmpg-double v4, v6, v8

    .line 610
    .line 611
    if-gez v4, :cond_12

    .line 612
    .line 613
    iget-wide v6, v5, La/lul0;->i:D

    .line 614
    .line 615
    double-to-float v4, v6

    .line 616
    sub-float/2addr v3, v4

    .line 617
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 618
    .line 619
    .line 620
    move-result v3

    .line 621
    float-to-double v3, v3

    .line 622
    iget-wide v5, v5, La/lul0;->d:D

    .line 623
    .line 624
    cmpg-double v3, v3, v5

    .line 625
    .line 626
    if-gez v3, :cond_12

    .line 627
    .line 628
    iget-object v3, v12, La/kul0;->m:La/lul0;

    .line 629
    .line 630
    iget-wide v3, v3, La/lul0;->i:D

    .line 631
    .line 632
    double-to-float v3, v3

    .line 633
    iput v3, v12, La/kul0;->b:F

    .line 634
    .line 635
    iput v2, v12, La/kul0;->a:F

    .line 636
    .line 637
    goto/16 :goto_a

    .line 638
    .line 639
    :cond_12
    const/4 v2, 0x0

    .line 640
    :goto_c
    iget v3, v12, La/kul0;->b:F

    .line 641
    .line 642
    iget v4, v12, La/kul0;->g:F

    .line 643
    .line 644
    invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F

    .line 645
    .line 646
    .line 647
    move-result v3

    .line 648
    iput v3, v12, La/kul0;->b:F

    .line 649
    .line 650
    iget v4, v12, La/kul0;->h:F

    .line 651
    .line 652
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 653
    .line 654
    .line 655
    move-result v3

    .line 656
    iput v3, v12, La/kul0;->b:F

    .line 657
    .line 658
    invoke-virtual {v12, v3}, La/kul0;->c(F)V

    .line 659
    .line 660
    .line 661
    if-eqz v2, :cond_19

    .line 662
    .line 663
    iget-object v2, v12, La/kul0;->k:Ljava/util/ArrayList;

    .line 664
    .line 665
    const/4 v13, 0x0

    .line 666
    iput-boolean v13, v12, La/kul0;->f:Z

    .line 667
    .line 668
    invoke-static {}, La/e73;->a()La/e73;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    iget-object v3, v4, La/e73;->a:La/nuj0;

    .line 673
    .line 674
    invoke-virtual {v3, v12}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 675
    .line 676
    .line 677
    iget-object v3, v4, La/e73;->b:Ljava/util/ArrayList;

    .line 678
    .line 679
    invoke-virtual {v3, v12}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 680
    .line 681
    .line 682
    move-result v5

    .line 683
    if-ltz v5, :cond_13

    .line 684
    .line 685
    const/4 v6, 0x0

    .line 686
    invoke-virtual {v3, v5, v6}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    const/4 v15, 0x1

    .line 690
    iput-boolean v15, v4, La/e73;->f:Z

    .line 691
    .line 692
    :cond_13
    const-wide/16 v4, 0x0

    .line 693
    .line 694
    iput-wide v4, v12, La/kul0;->i:J

    .line 695
    .line 696
    const/4 v13, 0x0

    .line 697
    iput-boolean v13, v12, La/kul0;->c:Z

    .line 698
    .line 699
    const/4 v6, 0x0

    .line 700
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    if-ge v6, v7, :cond_17

    .line 705
    .line 706
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 707
    .line 708
    .line 709
    move-result-object v7

    .line 710
    if-eqz v7, :cond_16

    .line 711
    .line 712
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v7

    .line 716
    check-cast v7, La/q06;

    .line 717
    .line 718
    iget v8, v12, La/kul0;->b:F

    .line 719
    .line 720
    iget-object v7, v7, La/q06;->a:La/t06;

    .line 721
    .line 722
    invoke-virtual {v7}, La/t06;->getProgressDrawable()La/hgk;

    .line 723
    .line 724
    .line 725
    move-result-object v8

    .line 726
    if-eqz v8, :cond_16

    .line 727
    .line 728
    invoke-virtual {v7}, La/t06;->getProgressDrawable()La/hgk;

    .line 729
    .line 730
    .line 731
    move-result-object v8

    .line 732
    invoke-virtual {v8}, Landroid/graphics/drawable/Drawable;->getLevel()I

    .line 733
    .line 734
    .line 735
    move-result v8

    .line 736
    const/16 v9, 0x2710

    .line 737
    .line 738
    if-ne v8, v9, :cond_16

    .line 739
    .line 740
    iget-object v8, v7, La/t06;->l:La/r06;

    .line 741
    .line 742
    invoke-virtual {v7}, Landroid/view/View;->getVisibility()I

    .line 743
    .line 744
    .line 745
    move-result v9

    .line 746
    if-eqz v9, :cond_14

    .line 747
    .line 748
    iget-object v8, v7, La/t06;->k:La/r06;

    .line 749
    .line 750
    invoke-virtual {v7, v8}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 751
    .line 752
    .line 753
    goto :goto_e

    .line 754
    :cond_14
    invoke-virtual {v7, v8}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 755
    .line 756
    .line 757
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 758
    .line 759
    .line 760
    move-result-wide v16

    .line 761
    iget-wide v3, v7, La/t06;->e:J

    .line 762
    .line 763
    sub-long v16, v16, v3

    .line 764
    .line 765
    iget v3, v7, La/t06;->d:I

    .line 766
    .line 767
    int-to-long v3, v3

    .line 768
    cmp-long v5, v16, v3

    .line 769
    .line 770
    if-ltz v5, :cond_15

    .line 771
    .line 772
    invoke-virtual {v8}, La/r06;->run()V

    .line 773
    .line 774
    .line 775
    goto :goto_e

    .line 776
    :cond_15
    sub-long v3, v3, v16

    .line 777
    .line 778
    invoke-virtual {v7, v8, v3, v4}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 779
    .line 780
    .line 781
    :cond_16
    :goto_e
    add-int/lit8 v6, v6, 0x1

    .line 782
    .line 783
    const-wide/16 v4, 0x0

    .line 784
    .line 785
    goto :goto_d

    .line 786
    :cond_17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    const/4 v15, 0x1

    .line 791
    sub-int/2addr v3, v15

    .line 792
    :goto_f
    if-ltz v3, :cond_19

    .line 793
    .line 794
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 795
    .line 796
    .line 797
    move-result-object v4

    .line 798
    if-nez v4, :cond_18

    .line 799
    .line 800
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    :cond_18
    add-int/lit8 v3, v3, -0x1

    .line 804
    .line 805
    goto :goto_f

    .line 806
    :cond_19
    :goto_10
    add-int/lit8 v4, v14, 0x1

    .line 807
    .line 808
    move-wide/from16 v8, v25

    .line 809
    .line 810
    const-wide/16 v2, 0x0

    .line 811
    .line 812
    const/4 v5, 0x0

    .line 813
    const/4 v6, 0x0

    .line 814
    const/4 v7, 0x1

    .line 815
    goto/16 :goto_4

    .line 816
    .line 817
    :cond_1a
    iget-boolean v2, v0, La/e73;->f:Z

    .line 818
    .line 819
    if-eqz v2, :cond_1e

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    const/4 v15, 0x1

    .line 826
    sub-int/2addr v2, v15

    .line 827
    :goto_11
    if-ltz v2, :cond_1c

    .line 828
    .line 829
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object v3

    .line 833
    if-nez v3, :cond_1b

    .line 834
    .line 835
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    :cond_1b
    add-int/lit8 v2, v2, -0x1

    .line 839
    .line 840
    goto :goto_11

    .line 841
    :cond_1c
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 842
    .line 843
    .line 844
    move-result v2

    .line 845
    if-nez v2, :cond_1d

    .line 846
    .line 847
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 848
    .line 849
    const/16 v3, 0x21

    .line 850
    .line 851
    if-lt v2, v3, :cond_1d

    .line 852
    .line 853
    iget-object v2, v0, La/e73;->h:La/c5k;

    .line 854
    .line 855
    iget-object v3, v2, La/c5k;->a:Ljava/lang/Object;

    .line 856
    .line 857
    check-cast v3, La/c73;

    .line 858
    .line 859
    invoke-static {v3}, La/c7;->q(La/c73;)Z

    .line 860
    .line 861
    .line 862
    const/4 v3, 0x0

    .line 863
    iput-object v3, v2, La/c5k;->a:Ljava/lang/Object;

    .line 864
    .line 865
    :cond_1d
    const/4 v13, 0x0

    .line 866
    iput-boolean v13, v0, La/e73;->f:Z

    .line 867
    .line 868
    goto :goto_12

    .line 869
    :cond_1e
    const/4 v13, 0x0

    .line 870
    :goto_12
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 871
    .line 872
    .line 873
    move-result v1

    .line 874
    if-lez v1, :cond_1f

    .line 875
    .line 876
    iget-object v1, v0, La/e73;->e:La/xex;

    .line 877
    .line 878
    iget-object v0, v0, La/e73;->d:La/w1;

    .line 879
    .line 880
    iget-object v1, v1, La/xex;->a:Ljava/lang/Object;

    .line 881
    .line 882
    check-cast v1, Landroid/view/Choreographer;

    .line 883
    .line 884
    new-instance v2, La/d73;

    .line 885
    .line 886
    invoke-direct {v2, v0, v13}, La/d73;-><init>(Ljava/lang/Runnable;B)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v1, v2}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    .line 890
    .line 891
    .line 892
    :cond_1f
    return-void

    .line 893
    :pswitch_16
    check-cast v0, La/a13;

    .line 894
    .line 895
    invoke-virtual {v0}, La/a13;->invoke()Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    return-void

    .line 899
    :pswitch_17
    check-cast v0, La/g8l;

    .line 900
    .line 901
    invoke-virtual {v0}, La/g8l;->invoke()Ljava/lang/Object;

    .line 902
    .line 903
    .line 904
    return-void

    .line 905
    :pswitch_18
    check-cast v0, La/h23;

    .line 906
    .line 907
    iget-object v0, v0, La/h23;->h:Landroid/view/ActionMode;

    .line 908
    .line 909
    if-eqz v0, :cond_20

    .line 910
    .line 911
    invoke-virtual {v0}, Landroid/view/ActionMode;->finish()V

    .line 912
    .line 913
    .line 914
    :cond_20
    return-void

    .line 915
    :pswitch_19
    check-cast v0, La/iy2;

    .line 916
    .line 917
    invoke-virtual {v0}, La/iy2;->d()Z

    .line 918
    .line 919
    .line 920
    move-result v1

    .line 921
    iget-object v2, v0, La/iy2;->a:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 922
    .line 923
    if-nez v1, :cond_21

    .line 924
    .line 925
    goto/16 :goto_15

    .line 926
    .line 927
    :cond_21
    const-string v1, "ContentCapture:changeChecker"

    .line 928
    .line 929
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 930
    .line 931
    .line 932
    const/4 v15, 0x1

    .line 933
    :try_start_6
    invoke-virtual {v2, v15}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V

    .line 934
    .line 935
    .line 936
    iget-object v1, v0, La/iy2;->j:La/ey40;

    .line 937
    .line 938
    iget-object v3, v1, La/gkx;->b:[I

    .line 939
    .line 940
    iget-object v1, v1, La/gkx;->a:[J

    .line 941
    .line 942
    array-length v5, v1

    .line 943
    sub-int/2addr v5, v4

    .line 944
    if-ltz v5, :cond_25

    .line 945
    .line 946
    const/4 v4, 0x0

    .line 947
    :goto_13
    aget-wide v6, v1, v4

    .line 948
    .line 949
    not-long v8, v6

    .line 950
    const/4 v10, 0x7

    .line 951
    shl-long/2addr v8, v10

    .line 952
    and-long/2addr v8, v6

    .line 953
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    and-long/2addr v8, v10

    .line 959
    cmp-long v8, v8, v10

    .line 960
    .line 961
    if-eqz v8, :cond_24

    .line 962
    .line 963
    sub-int v8, v4, v5

    .line 964
    .line 965
    not-int v8, v8

    .line 966
    ushr-int/lit8 v8, v8, 0x1f

    .line 967
    .line 968
    const/16 v9, 0x8

    .line 969
    .line 970
    rsub-int/lit8 v8, v8, 0x8

    .line 971
    .line 972
    const/4 v10, 0x0

    .line 973
    :goto_14
    if-ge v10, v8, :cond_23

    .line 974
    .line 975
    const-wide/16 v11, 0xff

    .line 976
    .line 977
    and-long/2addr v11, v6

    .line 978
    const-wide/16 v14, 0x80

    .line 979
    .line 980
    cmp-long v11, v11, v14

    .line 981
    .line 982
    if-gez v11, :cond_22

    .line 983
    .line 984
    shl-int/lit8 v11, v4, 0x3

    .line 985
    .line 986
    add-int/2addr v11, v10

    .line 987
    aget v15, v3, v11

    .line 988
    .line 989
    invoke-virtual {v0}, La/iy2;->c()La/gkx;

    .line 990
    .line 991
    .line 992
    move-result-object v11

    .line 993
    invoke-virtual {v11, v15}, La/gkx;->a(I)Z

    .line 994
    .line 995
    .line 996
    move-result v11

    .line 997
    if-nez v11, :cond_22

    .line 998
    .line 999
    iget-object v11, v0, La/iy2;->d:Ljava/util/ArrayList;

    .line 1000
    .line 1001
    new-instance v14, La/wde;

    .line 1002
    .line 1003
    move-object/from16 p0, v14

    .line 1004
    .line 1005
    iget-wide v13, v0, La/iy2;->i:J

    .line 1006
    .line 1007
    sget-object v18, La/xde;->b:La/xde;

    .line 1008
    .line 1009
    const/16 v19, 0x0

    .line 1010
    .line 1011
    move-wide/from16 v16, v13

    .line 1012
    .line 1013
    move-object/from16 v14, p0

    .line 1014
    .line 1015
    invoke-direct/range {v14 .. v19}, La/wde;-><init>(IJLa/xde;La/rkt0;)V

    .line 1016
    .line 1017
    .line 1018
    invoke-virtual {v11, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    iget-object v11, v0, La/iy2;->g:La/q99;

    .line 1022
    .line 1023
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1024
    .line 1025
    invoke-interface {v11, v13}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    :cond_22
    shr-long/2addr v6, v9

    .line 1029
    add-int/lit8 v10, v10, 0x1

    .line 1030
    .line 1031
    goto :goto_14

    .line 1032
    :cond_23
    if-ne v8, v9, :cond_25

    .line 1033
    .line 1034
    :cond_24
    if-eq v4, v5, :cond_25

    .line 1035
    .line 1036
    add-int/lit8 v4, v4, 0x1

    .line 1037
    .line 1038
    goto :goto_13

    .line 1039
    :cond_25
    const-string v1, "ContentCapture:sendAppearEvents"

    .line 1040
    .line 1041
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 1042
    .line 1043
    .line 1044
    :try_start_7
    invoke-virtual {v2}, Landroidx/compose/ui/platform/AndroidComposeView;->getSemanticsOwner()La/wai0;

    .line 1045
    .line 1046
    .line 1047
    move-result-object v1

    .line 1048
    invoke-virtual {v1}, La/wai0;->a()La/tai0;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v1

    .line 1052
    iget-object v2, v0, La/iy2;->k:La/uai0;

    .line 1053
    .line 1054
    invoke-virtual {v0, v1, v2}, La/iy2;->f(La/tai0;La/uai0;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 1055
    .line 1056
    .line 1057
    :try_start_8
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1058
    .line 1059
    .line 1060
    invoke-virtual {v0}, La/iy2;->c()La/gkx;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v1

    .line 1064
    invoke-virtual {v0, v1}, La/iy2;->b(La/gkx;)V

    .line 1065
    .line 1066
    .line 1067
    invoke-virtual {v0}, La/iy2;->j()V

    .line 1068
    .line 1069
    .line 1070
    const/4 v13, 0x0

    .line 1071
    iput-boolean v13, v0, La/iy2;->l:Z
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 1072
    .line 1073
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1074
    .line 1075
    .line 1076
    :goto_15
    return-void

    .line 1077
    :catchall_3
    move-exception v0

    .line 1078
    :try_start_9
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1079
    .line 1080
    .line 1081
    throw v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 1082
    :catchall_4
    move-exception v0

    .line 1083
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1084
    .line 1085
    .line 1086
    throw v0

    .line 1087
    :pswitch_1a
    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;

    .line 1088
    .line 1089
    sget-object v1, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->o1:Landroidx/collection/MutableIntList;

    .line 1090
    .line 1091
    const-string v1, "Compose:semantics:measureAndLayout"

    .line 1092
    .line 1093
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1094
    .line 1095
    .line 1096
    :try_start_a
    iget-object v1, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->d:Landroidx/compose/ui/platform/AndroidComposeView;

    .line 1097
    .line 1098
    const/4 v15, 0x1

    .line 1099
    invoke-virtual {v1, v15}, Landroidx/compose/ui/platform/AndroidComposeView;->s(Z)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 1100
    .line 1101
    .line 1102
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1103
    .line 1104
    .line 1105
    const-string v1, "Compose:semantics:checkForSemanticsChanges"

    .line 1106
    .line 1107
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1108
    .line 1109
    .line 1110
    :try_start_b
    invoke-virtual {v0}, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->n()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 1111
    .line 1112
    .line 1113
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1114
    .line 1115
    .line 1116
    const/4 v13, 0x0

    .line 1117
    iput-boolean v13, v0, Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;->j1:Z

    .line 1118
    .line 1119
    return-void

    .line 1120
    :catchall_5
    move-exception v0

    .line 1121
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1122
    .line 1123
    .line 1124
    throw v0

    .line 1125
    :catchall_6
    move-exception v0

    .line 1126
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1127
    .line 1128
    .line 1129
    throw v0

    .line 1130
    :pswitch_1b
    move-object v1, v0

    .line 1131
    check-cast v1, Landroid/app/Activity;

    .line 1132
    .line 1133
    invoke-virtual {v1}, Landroid/app/Activity;->isFinishing()Z

    .line 1134
    .line 1135
    .line 1136
    move-result v0

    .line 1137
    if-nez v0, :cond_2f

    .line 1138
    .line 1139
    sget-object v2, La/vn;->g:Landroid/os/Handler;

    .line 1140
    .line 1141
    sget-object v0, La/vn;->f:Ljava/lang/reflect/Method;

    .line 1142
    .line 1143
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1144
    .line 1145
    const/16 v5, 0x1c

    .line 1146
    .line 1147
    if-lt v3, v5, :cond_26

    .line 1148
    .line 1149
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1150
    .line 1151
    .line 1152
    goto/16 :goto_1a

    .line 1153
    .line 1154
    :cond_26
    const/16 v5, 0x1b

    .line 1155
    .line 1156
    const/16 v6, 0x1a

    .line 1157
    .line 1158
    if-eq v3, v6, :cond_27

    .line 1159
    .line 1160
    if-ne v3, v5, :cond_28

    .line 1161
    .line 1162
    :cond_27
    if-nez v0, :cond_28

    .line 1163
    .line 1164
    goto/16 :goto_19

    .line 1165
    .line 1166
    :cond_28
    sget-object v7, La/vn;->e:Ljava/lang/reflect/Method;

    .line 1167
    .line 1168
    if-nez v7, :cond_29

    .line 1169
    .line 1170
    sget-object v7, La/vn;->d:Ljava/lang/reflect/Method;

    .line 1171
    .line 1172
    if-nez v7, :cond_29

    .line 1173
    .line 1174
    goto :goto_19

    .line 1175
    :cond_29
    :try_start_c
    sget-object v7, La/vn;->c:Ljava/lang/reflect/Field;

    .line 1176
    .line 1177
    invoke-virtual {v7, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v7

    .line 1181
    if-nez v7, :cond_2a

    .line 1182
    .line 1183
    goto :goto_19

    .line 1184
    :cond_2a
    sget-object v8, La/vn;->b:Ljava/lang/reflect/Field;

    .line 1185
    .line 1186
    invoke-virtual {v8, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v8

    .line 1190
    if-nez v8, :cond_2b

    .line 1191
    .line 1192
    goto :goto_19

    .line 1193
    :cond_2b
    invoke-virtual {v1}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 1194
    .line 1195
    .line 1196
    move-result-object v9

    .line 1197
    new-instance v10, La/un;

    .line 1198
    .line 1199
    invoke-direct {v10, v1}, La/un;-><init>(Landroid/app/Activity;)V

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v9, v10}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v11, La/mfr;

    .line 1206
    .line 1207
    const/4 v15, 0x1

    .line 1208
    invoke-direct {v11, v10, v7, v15}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v2, v11}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_8

    .line 1212
    .line 1213
    .line 1214
    if-eq v3, v6, :cond_2d

    .line 1215
    .line 1216
    if-ne v3, v5, :cond_2c

    .line 1217
    .line 1218
    goto :goto_16

    .line 1219
    :cond_2c
    const/4 v15, 0x0

    .line 1220
    :cond_2d
    :goto_16
    if-eqz v15, :cond_2e

    .line 1221
    .line 1222
    const/4 v13, 0x0

    .line 1223
    :try_start_d
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v19

    .line 1227
    sget-object v20, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1228
    .line 1229
    const/16 v21, 0x0

    .line 1230
    .line 1231
    const/16 v22, 0x0

    .line 1232
    .line 1233
    const/16 v17, 0x0

    .line 1234
    .line 1235
    const/16 v18, 0x0

    .line 1236
    .line 1237
    move-object/from16 v23, v20

    .line 1238
    .line 1239
    move-object/from16 v24, v20

    .line 1240
    .line 1241
    move-object/from16 v16, v7

    .line 1242
    .line 1243
    filled-new-array/range {v16 .. v24}, [Ljava/lang/Object;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v3

    .line 1247
    invoke-virtual {v0, v8, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 1248
    .line 1249
    .line 1250
    goto :goto_17

    .line 1251
    :catchall_7
    move-exception v0

    .line 1252
    goto :goto_18

    .line 1253
    :cond_2e
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_7

    .line 1254
    .line 1255
    .line 1256
    :goto_17
    :try_start_e
    new-instance v0, La/lfr;

    .line 1257
    .line 1258
    invoke-direct {v0, v9, v10, v4}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v2, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1262
    .line 1263
    .line 1264
    goto :goto_1a

    .line 1265
    :goto_18
    new-instance v3, La/lfr;

    .line 1266
    .line 1267
    invoke-direct {v3, v9, v10, v4}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1268
    .line 1269
    .line 1270
    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1271
    .line 1272
    .line 1273
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_8

    .line 1274
    :catchall_8
    :goto_19
    invoke-virtual {v1}, Landroid/app/Activity;->recreate()V

    .line 1275
    .line 1276
    .line 1277
    :cond_2f
    :goto_1a
    return-void

    .line 1278
    :pswitch_1c
    check-cast v0, La/x1;

    .line 1279
    .line 1280
    invoke-virtual {v0}, La/x1;->b()V

    .line 1281
    .line 1282
    .line 1283
    return-void

    .line 1284
    nop

    .line 1285
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
