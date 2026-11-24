.class public final synthetic La/llo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/llo;->a:B

    iput-object p1, p0, La/llo;->b:Ljava/lang/Object;

    iput-object p2, p0, La/llo;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 15

    .line 1
    iget-byte v0, p0, La/llo;->a:B

    .line 2
    .line 3
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    const/4 v3, 0x7

    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, La/md3;

    .line 17
    .line 18
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/content/Context;

    .line 21
    .line 22
    iget-object v0, v0, La/md3;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, La/wl50;

    .line 25
    .line 26
    const-string v1, "connectivity"

    .line 27
    .line 28
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Landroid/net/ConnectivityManager;

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    :catch_0
    :cond_0
    move v3, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    :try_start_0
    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    .line 40
    .line 41
    .line 42
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 43
    if-eqz v1, :cond_6

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    .line 46
    .line 47
    .line 48
    move-result v6

    .line 49
    if-nez v6, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I

    .line 53
    .line 54
    .line 55
    move-result v6

    .line 56
    const/4 v7, 0x2

    .line 57
    const/16 v8, 0x9

    .line 58
    .line 59
    const/4 v9, 0x6

    .line 60
    const/4 v10, 0x4

    .line 61
    if-eqz v6, :cond_5

    .line 62
    .line 63
    if-eq v6, v4, :cond_4

    .line 64
    .line 65
    if-eq v6, v10, :cond_5

    .line 66
    .line 67
    if-eq v6, v2, :cond_5

    .line 68
    .line 69
    if-eq v6, v9, :cond_3

    .line 70
    .line 71
    if-eq v6, v8, :cond_7

    .line 72
    .line 73
    const/16 v3, 0x8

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_3
    :pswitch_0
    move v3, v2

    .line 77
    goto :goto_1

    .line 78
    :cond_4
    :pswitch_1
    move v3, v7

    .line 79
    goto :goto_1

    .line 80
    :cond_5
    invoke-virtual {v1}, Landroid/net/NetworkInfo;->getSubtype()I

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    packed-switch v1, :pswitch_data_1

    .line 85
    .line 86
    .line 87
    :pswitch_2
    move v3, v9

    .line 88
    goto :goto_1

    .line 89
    :pswitch_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .line 91
    const/16 v3, 0x1d

    .line 92
    .line 93
    if-lt v1, v3, :cond_0

    .line 94
    .line 95
    move v3, v8

    .line 96
    goto :goto_1

    .line 97
    :pswitch_4
    move v3, v10

    .line 98
    goto :goto_1

    .line 99
    :pswitch_5
    const/4 v3, 0x3

    .line 100
    goto :goto_1

    .line 101
    :cond_6
    :goto_0
    move v3, v4

    .line 102
    :cond_7
    :goto_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 103
    .line 104
    const/16 v4, 0x1f

    .line 105
    .line 106
    if-lt v1, v4, :cond_8

    .line 107
    .line 108
    if-ne v3, v2, :cond_8

    .line 109
    .line 110
    :try_start_1
    const-string v1, "phone"

    .line 111
    .line 112
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, Landroid/telephony/TelephonyManager;

    .line 117
    .line 118
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    new-instance v1, La/ul50;

    .line 122
    .line 123
    invoke-direct {v1, v0}, La/ul50;-><init>(La/wl50;)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v0, La/wl50;->a:Ljava/util/concurrent/Executor;

    .line 127
    .line 128
    invoke-static {p0, v3, v1}, La/tl50;->x(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;La/ul50;)V

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v1}, La/tl50;->w(Landroid/telephony/TelephonyManager;La/ul50;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 132
    .line 133
    .line 134
    goto :goto_2

    .line 135
    :catch_1
    invoke-virtual {v0, v2}, La/wl50;->c(I)V

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_8
    invoke-virtual {v0, v3}, La/wl50;->c(I)V

    .line 140
    .line 141
    .line 142
    :goto_2
    return-void

    .line 143
    :pswitch_6
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, La/wl50;

    .line 146
    .line 147
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast p0, Landroid/content/Context;

    .line 150
    .line 151
    new-instance v1, Landroid/content/IntentFilter;

    .line 152
    .line 153
    invoke-direct {v1}, Landroid/content/IntentFilter;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v2, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 157
    .line 158
    invoke-virtual {v1, v2}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    new-instance v2, La/md3;

    .line 162
    .line 163
    invoke-direct {v2, v0, v3}, La/md3;-><init>(Ljava/lang/Object;B)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :pswitch_7
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v0, Landroid/view/Surface;

    .line 173
    .line 174
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 175
    .line 176
    check-cast p0, Landroid/graphics/SurfaceTexture;

    .line 177
    .line 178
    invoke-virtual {v0}, Landroid/view/Surface;->release()V

    .line 179
    .line 180
    .line 181
    invoke-virtual {p0}, Landroid/graphics/SurfaceTexture;->release()V

    .line 182
    .line 183
    .line 184
    return-void

    .line 185
    :pswitch_8
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v0, La/ld40;

    .line 188
    .line 189
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast p0, La/d1x;

    .line 192
    .line 193
    invoke-interface {p0, v0}, La/d1x;->e(La/e1x;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :pswitch_9
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 198
    .line 199
    check-cast v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;

    .line 200
    .line 201
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast p0, La/mbz;

    .line 204
    .line 205
    iput-boolean v5, v0, Lorg/xplatform/bonus_games/impl/memories/presentation/views/MemoryGameView;->d:Z

    .line 206
    .line 207
    invoke-virtual {p0}, La/mbz;->invoke()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    return-void

    .line 211
    :pswitch_a
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v0, La/rbe;

    .line 214
    .line 215
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p0, La/bo30;

    .line 218
    .line 219
    invoke-interface {v0, p0}, La/rbe;->accept(Ljava/lang/Object;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :pswitch_b
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 224
    .line 225
    check-cast v0, La/kn30;

    .line 226
    .line 227
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast p0, Landroid/media/metrics/PlaybackStateEvent;

    .line 230
    .line 231
    iget-object v0, v0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 232
    .line 233
    invoke-static {v0, p0}, La/isj;->p(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackStateEvent;)V

    .line 234
    .line 235
    .line 236
    return-void

    .line 237
    :pswitch_c
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 238
    .line 239
    check-cast v0, La/kn30;

    .line 240
    .line 241
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 242
    .line 243
    check-cast p0, Landroid/media/metrics/PlaybackMetrics;

    .line 244
    .line 245
    iget-object v0, v0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 246
    .line 247
    invoke-static {v0, p0}, La/isj;->o(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackMetrics;)V

    .line 248
    .line 249
    .line 250
    return-void

    .line 251
    :pswitch_d
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, La/kn30;

    .line 254
    .line 255
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast p0, Landroid/media/metrics/PlaybackErrorEvent;

    .line 258
    .line 259
    iget-object v0, v0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 260
    .line 261
    invoke-static {v0, p0}, La/isj;->n(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/PlaybackErrorEvent;)V

    .line 262
    .line 263
    .line 264
    return-void

    .line 265
    :pswitch_e
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/kn30;

    .line 268
    .line 269
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast p0, Landroid/media/metrics/NetworkEvent;

    .line 272
    .line 273
    iget-object v0, v0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 274
    .line 275
    invoke-static {v0, p0}, La/isj;->m(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/NetworkEvent;)V

    .line 276
    .line 277
    .line 278
    return-void

    .line 279
    :pswitch_f
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v0, La/kn30;

    .line 282
    .line 283
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast p0, Landroid/media/metrics/TrackChangeEvent;

    .line 286
    .line 287
    iget-object v0, v0, La/kn30;->d:Landroid/media/metrics/PlaybackSession;

    .line 288
    .line 289
    invoke-static {v0, p0}, La/isj;->q(Landroid/media/metrics/PlaybackSession;Landroid/media/metrics/TrackChangeEvent;)V

    .line 290
    .line 291
    .line 292
    return-void

    .line 293
    :pswitch_10
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v0, Lcom/google/android/material/button/MaterialButton;

    .line 296
    .line 297
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast p0, Ljava/lang/Runnable;

    .line 300
    .line 301
    sget-object v1, Lcom/google/android/material/button/MaterialButton;->r1:[I

    .line 302
    .line 303
    invoke-interface {p0}, Ljava/lang/Runnable;->run()V

    .line 304
    .line 305
    .line 306
    iget-object p0, v0, Lcom/google/android/material/button/MaterialButton;->g1:Landroid/widget/LinearLayout$LayoutParams;

    .line 307
    .line 308
    if-eqz p0, :cond_9

    .line 309
    .line 310
    invoke-virtual {v0, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 311
    .line 312
    .line 313
    const/4 p0, 0x0

    .line 314
    iput-object p0, v0, Lcom/google/android/material/button/MaterialButton;->g1:Landroid/widget/LinearLayout$LayoutParams;

    .line 315
    .line 316
    const/high16 p0, -0x31000000

    .line 317
    .line 318
    iput p0, v0, Lcom/google/android/material/button/MaterialButton;->A:F

    .line 319
    .line 320
    :cond_9
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 321
    .line 322
    .line 323
    return-void

    .line 324
    :pswitch_11
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 325
    .line 326
    check-cast v0, La/i820;

    .line 327
    .line 328
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 329
    .line 330
    check-cast p0, Landroidx/viewpager2/widget/ViewPager2;

    .line 331
    .line 332
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->N()Z

    .line 333
    .line 334
    .line 335
    move-result v0

    .line 336
    if-eqz v0, :cond_a

    .line 337
    .line 338
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 339
    .line 340
    .line 341
    :cond_a
    return-void

    .line 342
    :pswitch_12
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 345
    .line 346
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast p0, Ljava/lang/Throwable;

    .line 349
    .line 350
    sget v1, Lorg/xplatform/uikit/components/views/LoadableImageView;->i:I

    .line 351
    .line 352
    invoke-interface {v0, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 353
    .line 354
    .line 355
    return-void

    .line 356
    :pswitch_13
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v0, Ljava/util/Map$Entry;

    .line 359
    .line 360
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 361
    .line 362
    check-cast p0, La/yh00;

    .line 363
    .line 364
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    check-cast v0, La/ca60;

    .line 369
    .line 370
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object p0, p0, La/yh00;->a:Ljava/lang/Object;

    .line 374
    .line 375
    invoke-interface {v0, p0}, La/ca60;->a(Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    return-void

    .line 379
    :pswitch_14
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, La/cyu;

    .line 382
    .line 383
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 384
    .line 385
    check-cast p0, La/ca60;

    .line 386
    .line 387
    iget-object v0, v0, La/cyu;->a:Ljava/lang/Object;

    .line 388
    .line 389
    check-cast v0, La/hy40;

    .line 390
    .line 391
    invoke-virtual {v0}, La/wh00;->d()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v0

    .line 395
    check-cast v0, La/yh00;

    .line 396
    .line 397
    if-nez v0, :cond_b

    .line 398
    .line 399
    goto :goto_3

    .line 400
    :cond_b
    iget-object v0, v0, La/yh00;->a:Ljava/lang/Object;

    .line 401
    .line 402
    invoke-interface {p0, v0}, La/ca60;->a(Ljava/lang/Object;)V

    .line 403
    .line 404
    .line 405
    :goto_3
    return-void

    .line 406
    :pswitch_15
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 407
    .line 408
    check-cast v0, La/wsf0;

    .line 409
    .line 410
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 411
    .line 412
    check-cast p0, La/rrd;

    .line 413
    .line 414
    new-instance v1, Ljava/util/HashSet;

    .line 415
    .line 416
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 417
    .line 418
    .line 419
    if-eqz v0, :cond_c

    .line 420
    .line 421
    iget-object v0, v0, La/wsf0;->b:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v0, Ljava/util/LinkedHashSet;

    .line 424
    .line 425
    invoke-interface {v1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    .line 426
    .line 427
    .line 428
    :cond_c
    iget-object p0, p0, La/rrd;->h:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p0, La/jhk;

    .line 431
    .line 432
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    return-void

    .line 436
    :pswitch_16
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v0, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;

    .line 439
    .line 440
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 441
    .line 442
    check-cast p0, Landroid/app/job/JobParameters;

    .line 443
    .line 444
    sget v1, Lcom/google/android/datatransport/runtime/scheduling/jobscheduling/JobInfoSchedulerService;->a:I

    .line 445
    .line 446
    invoke-virtual {v0, p0, v5}, Landroid/app/job/JobService;->jobFinished(Landroid/app/job/JobParameters;Z)V

    .line 447
    .line 448
    .line 449
    return-void

    .line 450
    :pswitch_17
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v0, Landroid/view/Window;

    .line 453
    .line 454
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast p0, La/q7y;

    .line 457
    .line 458
    if-eqz v0, :cond_d

    .line 459
    .line 460
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-eqz v0, :cond_d

    .line 465
    .line 466
    invoke-virtual {v0, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 467
    .line 468
    .line 469
    :cond_d
    return-void

    .line 470
    :pswitch_18
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 471
    .line 472
    check-cast v0, La/vzw;

    .line 473
    .line 474
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 477
    .line 478
    :try_start_2
    invoke-virtual {v0}, La/vzw;->a()Landroid/graphics/Bitmap;

    .line 479
    .line 480
    .line 481
    move-result-object v0

    .line 482
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 483
    .line 484
    .line 485
    goto :goto_4

    .line 486
    :catch_2
    move-exception v0

    .line 487
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 488
    .line 489
    .line 490
    :goto_4
    return-void

    .line 491
    :pswitch_19
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 492
    .line 493
    check-cast v0, La/ibe0;

    .line 494
    .line 495
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 496
    .line 497
    check-cast p0, La/ibe0;

    .line 498
    .line 499
    invoke-virtual {v0}, La/ibe0;->e()V

    .line 500
    .line 501
    .line 502
    if-eqz p0, :cond_e

    .line 503
    .line 504
    invoke-virtual {p0}, La/ibe0;->e()V

    .line 505
    .line 506
    .line 507
    :cond_e
    return-void

    .line 508
    :pswitch_1a
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;

    .line 511
    .line 512
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 513
    .line 514
    check-cast p0, Landroid/content/Context;

    .line 515
    .line 516
    invoke-static {v0, p0}, Lcom/appsflyer/huawei_referrer/HuaweiReferrer;->a(Lcom/appsflyer/huawei_referrer/HuaweiReferrer;Landroid/content/Context;)V

    .line 517
    .line 518
    .line 519
    return-void

    .line 520
    :pswitch_1b
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 521
    .line 522
    check-cast v0, La/ybw;

    .line 523
    .line 524
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast p0, La/yaw;

    .line 527
    .line 528
    iget-object v0, v0, La/ybw;->c:La/jru;

    .line 529
    .line 530
    iget-object p0, p0, La/yaw;->m:Landroid/net/Uri;

    .line 531
    .line 532
    iget-object v0, v0, La/jru;->b:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v0, La/zaw;

    .line 535
    .line 536
    iget-object v0, v0, La/zaw;->b:La/vuj;

    .line 537
    .line 538
    iget-object v0, v0, La/vuj;->d:Ljava/util/HashMap;

    .line 539
    .line 540
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    check-cast v0, La/uuj;

    .line 545
    .line 546
    if-eqz v0, :cond_f

    .line 547
    .line 548
    invoke-virtual {v0, v4, p0}, La/uuj;->e(ZLandroid/net/Uri;)V

    .line 549
    .line 550
    .line 551
    :cond_f
    return-void

    .line 552
    :pswitch_1c
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 553
    .line 554
    check-cast v0, La/xaw;

    .line 555
    .line 556
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast p0, Ljava/lang/String;

    .line 559
    .line 560
    iget-boolean v3, v0, La/xaw;->k:Z

    .line 561
    .line 562
    invoke-static {v3}, La/x0x;->K(Z)V

    .line 563
    .line 564
    .line 565
    iget-object v3, v0, La/xaw;->i:Ljava/util/HashSet;

    .line 566
    .line 567
    invoke-virtual {v3, p0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 568
    .line 569
    .line 570
    iget-object p0, v0, La/xaw;->m:La/b4x;

    .line 571
    .line 572
    if-eqz p0, :cond_10

    .line 573
    .line 574
    invoke-virtual {v0, v1, v2}, La/xaw;->e(J)V

    .line 575
    .line 576
    .line 577
    :cond_10
    return-void

    .line 578
    :pswitch_1d
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v0, La/n5a;

    .line 581
    .line 582
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 583
    .line 584
    check-cast p0, La/hmv;

    .line 585
    .line 586
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    invoke-virtual {v0, p0, v1}, La/n5a;->D(La/lne;Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    return-void

    .line 592
    :pswitch_1e
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 593
    .line 594
    check-cast v0, La/d930;

    .line 595
    .line 596
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast p0, La/cp;

    .line 599
    .line 600
    invoke-virtual {p0}, La/xhe0;->d()I

    .line 601
    .line 602
    .line 603
    move-result v1

    .line 604
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 605
    .line 606
    .line 607
    move-result-object v1

    .line 608
    iget-object p0, p0, La/cp;->u:La/yfu0;

    .line 609
    .line 610
    check-cast p0, La/q7b0;

    .line 611
    .line 612
    iget-object p0, p0, La/q7b0;->b:Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;

    .line 613
    .line 614
    invoke-virtual {p0}, Lorg/xplatform/uikit_web_games/top_games_collection/WebGamesTopGamesCollection;->getGameCollection()Lorg/xplatform/uikit_web_games/game_collection/WebGamesGameCollection;

    .line 615
    .line 616
    .line 617
    move-result-object p0

    .line 618
    invoke-virtual {v0, v1, p0}, La/d930;->b(Ljava/lang/String;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 619
    .line 620
    .line 621
    return-void

    .line 622
    :pswitch_1f
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, Ljava/lang/String;

    .line 625
    .line 626
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 627
    .line 628
    check-cast p0, La/wmu0;

    .line 629
    .line 630
    const-string v1, "Policy violation with PENALTY_DEATH in "

    .line 631
    .line 632
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 633
    .line 634
    .line 635
    move-result-object v0

    .line 636
    const-string v1, "FragmentStrictMode"

    .line 637
    .line 638
    invoke-static {v1, v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 639
    .line 640
    .line 641
    throw p0

    .line 642
    :pswitch_20
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 643
    .line 644
    check-cast v0, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 645
    .line 646
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 649
    .line 650
    :try_start_3
    invoke-virtual {v0}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    .line 655
    .line 656
    .line 657
    goto :goto_5

    .line 658
    :catch_3
    move-exception v0

    .line 659
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setException(Ljava/lang/Exception;)V

    .line 660
    .line 661
    .line 662
    :goto_5
    return-void

    .line 663
    :pswitch_21
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast v0, La/cgp;

    .line 666
    .line 667
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 668
    .line 669
    check-cast p0, Landroid/content/Intent;

    .line 670
    .line 671
    invoke-virtual {v0, p0}, La/cgp;->a(Landroid/content/Intent;)V

    .line 672
    .line 673
    .line 674
    return-void

    .line 675
    :pswitch_22
    iget-object v0, p0, La/llo;->b:Ljava/lang/Object;

    .line 676
    .line 677
    move-object v6, v0

    .line 678
    check-cast v6, La/ulo;

    .line 679
    .line 680
    iget-object p0, p0, La/llo;->c:Ljava/lang/Object;

    .line 681
    .line 682
    check-cast p0, La/amo;

    .line 683
    .line 684
    iget v0, v6, La/ulo;->J:I

    .line 685
    .line 686
    iget v3, p0, La/amo;->b:I

    .line 687
    .line 688
    sub-int/2addr v0, v3

    .line 689
    iput v0, v6, La/ulo;->J:I

    .line 690
    .line 691
    iget-boolean v3, p0, La/amo;->e:Z

    .line 692
    .line 693
    if-eqz v3, :cond_11

    .line 694
    .line 695
    iget v3, p0, La/amo;->c:I

    .line 696
    .line 697
    iput v3, v6, La/ulo;->K:I

    .line 698
    .line 699
    iput-boolean v4, v6, La/ulo;->L:Z

    .line 700
    .line 701
    :cond_11
    if-nez v0, :cond_1d

    .line 702
    .line 703
    iget-object v0, p0, La/amo;->f:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, La/yx90;

    .line 706
    .line 707
    iget-object v0, v0, La/yx90;->a:La/bmq0;

    .line 708
    .line 709
    iget-object v3, v6, La/ulo;->n0:La/yx90;

    .line 710
    .line 711
    iget-object v3, v3, La/yx90;->a:La/bmq0;

    .line 712
    .line 713
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 714
    .line 715
    .line 716
    move-result v3

    .line 717
    const/4 v7, -0x1

    .line 718
    if-nez v3, :cond_12

    .line 719
    .line 720
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 721
    .line 722
    .line 723
    move-result v3

    .line 724
    if-eqz v3, :cond_12

    .line 725
    .line 726
    iput v7, v6, La/ulo;->o0:I

    .line 727
    .line 728
    const-wide/16 v8, 0x0

    .line 729
    .line 730
    iput-wide v8, v6, La/ulo;->p0:J

    .line 731
    .line 732
    :cond_12
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 733
    .line 734
    .line 735
    move-result v3

    .line 736
    if-nez v3, :cond_14

    .line 737
    .line 738
    move-object v3, v0

    .line 739
    check-cast v3, La/wna0;

    .line 740
    .line 741
    iget-object v3, v3, La/wna0;->h:[La/bmq0;

    .line 742
    .line 743
    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 744
    .line 745
    .line 746
    move-result-object v3

    .line 747
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 748
    .line 749
    .line 750
    move-result v8

    .line 751
    iget-object v9, v6, La/ulo;->p:Ljava/util/ArrayList;

    .line 752
    .line 753
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 754
    .line 755
    .line 756
    move-result v9

    .line 757
    if-ne v8, v9, :cond_13

    .line 758
    .line 759
    move v8, v4

    .line 760
    goto :goto_6

    .line 761
    :cond_13
    move v8, v5

    .line 762
    :goto_6
    invoke-static {v8}, La/x0x;->K(Z)V

    .line 763
    .line 764
    .line 765
    move v8, v5

    .line 766
    :goto_7
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 767
    .line 768
    .line 769
    move-result v9

    .line 770
    if-ge v8, v9, :cond_14

    .line 771
    .line 772
    iget-object v9, v6, La/ulo;->p:Ljava/util/ArrayList;

    .line 773
    .line 774
    invoke-virtual {v9, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 775
    .line 776
    .line 777
    move-result-object v9

    .line 778
    check-cast v9, La/slo;

    .line 779
    .line 780
    invoke-interface {v3, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 781
    .line 782
    .line 783
    move-result-object v10

    .line 784
    check-cast v10, La/bmq0;

    .line 785
    .line 786
    iput-object v10, v9, La/slo;->b:La/bmq0;

    .line 787
    .line 788
    add-int/lit8 v8, v8, 0x1

    .line 789
    .line 790
    goto :goto_7

    .line 791
    :cond_14
    iget-boolean v3, v6, La/ulo;->L:Z

    .line 792
    .line 793
    if-eqz v3, :cond_1c

    .line 794
    .line 795
    iget-object v3, p0, La/amo;->f:Ljava/lang/Object;

    .line 796
    .line 797
    check-cast v3, La/yx90;

    .line 798
    .line 799
    iget-object v3, v3, La/yx90;->a:La/bmq0;

    .line 800
    .line 801
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 802
    .line 803
    .line 804
    move-result v3

    .line 805
    if-eqz v3, :cond_15

    .line 806
    .line 807
    iget-object v3, v6, La/ulo;->n0:La/yx90;

    .line 808
    .line 809
    iget-object v3, v3, La/yx90;->a:La/bmq0;

    .line 810
    .line 811
    invoke-virtual {v3}, La/bmq0;->p()Z

    .line 812
    .line 813
    .line 814
    move-result v3

    .line 815
    if-eqz v3, :cond_15

    .line 816
    .line 817
    move v3, v4

    .line 818
    goto :goto_8

    .line 819
    :cond_15
    move v3, v5

    .line 820
    :goto_8
    iget-object v8, p0, La/amo;->f:Ljava/lang/Object;

    .line 821
    .line 822
    check-cast v8, La/yx90;

    .line 823
    .line 824
    iget-object v8, v8, La/yx90;->b:La/vn30;

    .line 825
    .line 826
    iget-object v9, v6, La/ulo;->n0:La/yx90;

    .line 827
    .line 828
    iget-object v9, v9, La/yx90;->b:La/vn30;

    .line 829
    .line 830
    invoke-virtual {v8, v9}, La/vn30;->b(La/vn30;)Z

    .line 831
    .line 832
    .line 833
    move-result v8

    .line 834
    iget-object v9, p0, La/amo;->f:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v9, La/yx90;

    .line 837
    .line 838
    iget-wide v9, v9, La/yx90;->d:J

    .line 839
    .line 840
    iget-object v11, v6, La/ulo;->n0:La/yx90;

    .line 841
    .line 842
    iget-wide v11, v11, La/yx90;->s:J

    .line 843
    .line 844
    cmp-long v9, v9, v11

    .line 845
    .line 846
    if-nez v9, :cond_16

    .line 847
    .line 848
    move v9, v4

    .line 849
    goto :goto_9

    .line 850
    :cond_16
    move v9, v5

    .line 851
    :goto_9
    if-nez v3, :cond_17

    .line 852
    .line 853
    if-eqz v8, :cond_18

    .line 854
    .line 855
    if-nez v9, :cond_17

    .line 856
    .line 857
    goto :goto_a

    .line 858
    :cond_17
    move v4, v5

    .line 859
    :cond_18
    :goto_a
    if-eqz v4, :cond_1b

    .line 860
    .line 861
    invoke-virtual {v6}, La/ulo;->j()I

    .line 862
    .line 863
    .line 864
    move-result v7

    .line 865
    invoke-virtual {v0}, La/bmq0;->p()Z

    .line 866
    .line 867
    .line 868
    move-result v1

    .line 869
    if-nez v1, :cond_1a

    .line 870
    .line 871
    iget-object v1, p0, La/amo;->f:Ljava/lang/Object;

    .line 872
    .line 873
    check-cast v1, La/yx90;

    .line 874
    .line 875
    iget-object v1, v1, La/yx90;->b:La/vn30;

    .line 876
    .line 877
    invoke-virtual {v1}, La/vn30;->c()Z

    .line 878
    .line 879
    .line 880
    move-result v1

    .line 881
    if-eqz v1, :cond_19

    .line 882
    .line 883
    goto :goto_b

    .line 884
    :cond_19
    iget-object v1, p0, La/amo;->f:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v1, La/yx90;

    .line 887
    .line 888
    iget-object v2, v1, La/yx90;->b:La/vn30;

    .line 889
    .line 890
    iget-wide v8, v1, La/yx90;->d:J

    .line 891
    .line 892
    iget-object v1, v2, La/vn30;->a:Ljava/lang/Object;

    .line 893
    .line 894
    iget-object v2, v6, La/ulo;->o:La/amq0;

    .line 895
    .line 896
    invoke-virtual {v0, v1, v2}, La/bmq0;->g(Ljava/lang/Object;La/amq0;)La/amq0;

    .line 897
    .line 898
    .line 899
    iget-wide v0, v2, La/amq0;->e:J

    .line 900
    .line 901
    add-long/2addr v8, v0

    .line 902
    move-wide v1, v8

    .line 903
    goto :goto_c

    .line 904
    :cond_1a
    :goto_b
    iget-object v0, p0, La/amo;->f:Ljava/lang/Object;

    .line 905
    .line 906
    check-cast v0, La/yx90;

    .line 907
    .line 908
    iget-wide v0, v0, La/yx90;->d:J

    .line 909
    .line 910
    move-wide v1, v0

    .line 911
    :cond_1b
    :goto_c
    move-wide v11, v1

    .line 912
    move v9, v4

    .line 913
    :goto_d
    move v13, v7

    .line 914
    goto :goto_e

    .line 915
    :cond_1c
    move-wide v11, v1

    .line 916
    move v9, v5

    .line 917
    goto :goto_d

    .line 918
    :goto_e
    iput-boolean v5, v6, La/ulo;->L:Z

    .line 919
    .line 920
    iget-object p0, p0, La/amo;->f:Ljava/lang/Object;

    .line 921
    .line 922
    move-object v7, p0

    .line 923
    check-cast v7, La/yx90;

    .line 924
    .line 925
    iget v10, v6, La/ulo;->K:I

    .line 926
    .line 927
    const/4 v14, 0x0

    .line 928
    const/4 v8, 0x1

    .line 929
    invoke-virtual/range {v6 .. v14}, La/ulo;->a0(La/yx90;IZIJIZ)V

    .line 930
    .line 931
    .line 932
    :cond_1d
    return-void

    .line 933
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
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
    .end packed-switch

    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_4
        :pswitch_0
        :pswitch_4
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
