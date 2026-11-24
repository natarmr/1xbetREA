.class public final synthetic La/zbg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/xdk0;La/wdk0;La/rrm;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/zbg0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zbg0;->c:Ljava/lang/Object;

    iput-object p2, p0, La/zbg0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/zbg0;->e:Ljava/lang/Object;

    iput-object p4, p0, La/zbg0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/zbg0;->a:B

    iput-object p1, p0, La/zbg0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zbg0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/zbg0;->d:Ljava/lang/Object;

    iput-object p4, p0, La/zbg0;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/zbg0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    packed-switch v0, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, La/wov0;

    .line 10
    .line 11
    iget-object v2, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v2, Ljava/util/UUID;

    .line 14
    .line 15
    iget-object v3, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v3, La/lvq;

    .line 18
    .line 19
    iget-object p0, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/content/Context;

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v4, v0, La/wov0;->c:La/upv0;

    .line 28
    .line 29
    invoke-virtual {v4, v2}, La/upv0;->e(Ljava/lang/String;)La/ppv0;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    iget-object v5, v4, La/ppv0;->b:La/zov0;

    .line 36
    .line 37
    invoke-virtual {v5}, La/zov0;->a()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-nez v5, :cond_3

    .line 42
    .line 43
    iget-object v0, v0, La/wov0;->b:La/ezb0;

    .line 44
    .line 45
    const-string v5, "Moving WorkSpec ("

    .line 46
    .line 47
    iget-object v6, v0, La/ezb0;->k:Ljava/lang/Object;

    .line 48
    .line 49
    monitor-enter v6

    .line 50
    :try_start_0
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    sget-object v8, La/ezb0;->l:Ljava/lang/String;

    .line 55
    .line 56
    new-instance v9, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-direct {v9, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string v5, ") to the foreground"

    .line 65
    .line 66
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v7, v8, v5}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iget-object v5, v0, La/ezb0;->g:Ljava/util/HashMap;

    .line 77
    .line 78
    invoke-virtual {v5, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, La/nqv0;

    .line 83
    .line 84
    if-eqz v5, :cond_2

    .line 85
    .line 86
    iget-object v7, v0, La/ezb0;->a:Landroid/os/PowerManager$WakeLock;

    .line 87
    .line 88
    if-nez v7, :cond_0

    .line 89
    .line 90
    iget-object v7, v0, La/ezb0;->b:Landroid/content/Context;

    .line 91
    .line 92
    invoke-static {v7}, La/rvu0;->a(Landroid/content/Context;)Landroid/os/PowerManager$WakeLock;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    iput-object v7, v0, La/ezb0;->a:Landroid/os/PowerManager$WakeLock;

    .line 97
    .line 98
    invoke-virtual {v7}, Landroid/os/PowerManager$WakeLock;->acquire()V

    .line 99
    .line 100
    .line 101
    goto :goto_0

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object p0, v0

    .line 104
    goto :goto_2

    .line 105
    :cond_0
    :goto_0
    iget-object v7, v0, La/ezb0;->f:Ljava/util/HashMap;

    .line 106
    .line 107
    invoke-virtual {v7, v2, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    iget-object v2, v0, La/ezb0;->b:Landroid/content/Context;

    .line 111
    .line 112
    iget-object v5, v5, La/nqv0;->a:La/ppv0;

    .line 113
    .line 114
    invoke-static {v5}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 115
    .line 116
    .line 117
    move-result-object v5

    .line 118
    invoke-static {v2, v5, v3}, La/o9o0;->b(Landroid/content/Context;La/xov0;La/lvq;)Landroid/content/Intent;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iget-object v0, v0, La/ezb0;->b:Landroid/content/Context;

    .line 123
    .line 124
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 125
    .line 126
    const/16 v7, 0x1a

    .line 127
    .line 128
    if-lt v5, v7, :cond_1

    .line 129
    .line 130
    invoke-static {v0, v2}, La/ga3;->J(Landroid/content/Context;Landroid/content/Intent;)V

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_1
    invoke-virtual {v0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 135
    .line 136
    .line 137
    :cond_2
    :goto_1
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 138
    invoke-static {v4}, La/jpm0;->k(La/ppv0;)La/xov0;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    sget-object v2, La/o9o0;->j:Ljava/lang/String;

    .line 143
    .line 144
    new-instance v2, Landroid/content/Intent;

    .line 145
    .line 146
    const-class v4, Landroidx/work/impl/foreground/SystemForegroundService;

    .line 147
    .line 148
    invoke-direct {v2, p0, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 149
    .line 150
    .line 151
    const-string v4, "ACTION_NOTIFY"

    .line 152
    .line 153
    invoke-virtual {v2, v4}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 154
    .line 155
    .line 156
    const-string v4, "KEY_NOTIFICATION_ID"

    .line 157
    .line 158
    iget v5, v3, La/lvq;->a:I

    .line 159
    .line 160
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 161
    .line 162
    .line 163
    const-string v4, "KEY_FOREGROUND_SERVICE_TYPE"

    .line 164
    .line 165
    iget v5, v3, La/lvq;->b:I

    .line 166
    .line 167
    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 168
    .line 169
    .line 170
    const-string v4, "KEY_NOTIFICATION"

    .line 171
    .line 172
    iget-object v3, v3, La/lvq;->c:Landroid/app/Notification;

    .line 173
    .line 174
    invoke-virtual {v2, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 175
    .line 176
    .line 177
    const-string v3, "KEY_WORKSPEC_ID"

    .line 178
    .line 179
    iget-object v4, v0, La/xov0;->a:Ljava/lang/String;

    .line 180
    .line 181
    invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 182
    .line 183
    .line 184
    const-string v3, "KEY_GENERATION"

    .line 185
    .line 186
    iget v0, v0, La/xov0;->b:I

    .line 187
    .line 188
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0, v2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :goto_2
    :try_start_1
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 196
    throw p0

    .line 197
    :cond_3
    const-string p0, "Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result."

    .line 198
    .line 199
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    :goto_3
    return-object v1

    .line 203
    :pswitch_0
    iget-object v0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;

    .line 206
    .line 207
    iget-object v2, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 208
    .line 209
    check-cast v2, La/wiu;

    .line 210
    .line 211
    iget-object v3, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 212
    .line 213
    check-cast v3, La/pru;

    .line 214
    .line 215
    iget-object p0, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p0, La/r9u;

    .line 218
    .line 219
    iget-wide v4, v0, Lorg/xplatform/cyber/section/api/championships/universal/presentation/UniversalChampResultsParams;->d:J

    .line 220
    .line 221
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    const-wide/16 v6, 0x0

    .line 226
    .line 227
    cmp-long v4, v4, v6

    .line 228
    .line 229
    if-eqz v4, :cond_4

    .line 230
    .line 231
    move-object v1, v0

    .line 232
    :cond_4
    if-eqz v1, :cond_5

    .line 233
    .line 234
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 235
    .line 236
    .line 237
    move-result-wide v0

    .line 238
    goto :goto_4

    .line 239
    :cond_5
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 240
    .line 241
    .line 242
    move-result-wide v0

    .line 243
    :goto_4
    new-instance v6, Ljava/util/Date;

    .line 244
    .line 245
    invoke-direct {v6, v0, v1}, Ljava/util/Date;-><init>(J)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, La/wiu;->a()Ljava/util/Locale;

    .line 249
    .line 250
    .line 251
    move-result-object v8

    .line 252
    invoke-virtual {v3}, La/pru;->a()La/sff0;

    .line 253
    .line 254
    .line 255
    move-result-object v10

    .line 256
    sget-object v0, La/ygp;->t:La/ygp;

    .line 257
    .line 258
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 259
    .line 260
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 261
    .line 262
    .line 263
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 264
    .line 265
    invoke-virtual {p0, v0}, La/m1q0;->d(La/ygp;)Z

    .line 266
    .line 267
    .line 268
    move-result v11

    .line 269
    new-instance v4, La/ubt0;

    .line 270
    .line 271
    const/4 v7, 0x0

    .line 272
    const/4 v9, 0x0

    .line 273
    const/4 v5, 0x1

    .line 274
    invoke-direct/range {v4 .. v11}, La/ubt0;-><init>(ZLjava/util/Date;La/j0g0;Ljava/util/Locale;La/qbt0;La/sff0;Z)V

    .line 275
    .line 276
    .line 277
    return-object v4

    .line 278
    :pswitch_1
    iget-object v0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 279
    .line 280
    check-cast v0, La/ujd;

    .line 281
    .line 282
    iget-object v1, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 283
    .line 284
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 285
    .line 286
    iget-object v2, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v2, La/v2t0;

    .line 289
    .line 290
    iget-object p0, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast p0, La/k3t0;

    .line 293
    .line 294
    new-instance v3, La/lr2;

    .line 295
    .line 296
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 297
    .line 298
    .line 299
    new-instance v4, La/ebh;

    .line 300
    .line 301
    const/16 v5, 0xc

    .line 302
    .line 303
    invoke-direct {v4, p0, v5}, La/ebh;-><init>(La/k3t0;B)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v0, v1, v3, v4}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 307
    .line 308
    .line 309
    new-instance v0, La/ebh;

    .line 310
    .line 311
    const/16 v3, 0xd

    .line 312
    .line 313
    invoke-direct {v0, p0, v3}, La/ebh;-><init>(La/k3t0;B)V

    .line 314
    .line 315
    .line 316
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    const-string v2, "REQUEST_KEY_CLOSE_GAME"

    .line 324
    .line 325
    new-instance v3, La/b0l0;

    .line 326
    .line 327
    const/16 v4, 0x1b

    .line 328
    .line 329
    invoke-direct {v3, v0, v4}, La/b0l0;-><init>(Ljava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p0, v2, v1, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 333
    .line 334
    .line 335
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 336
    .line 337
    return-object p0

    .line 338
    :pswitch_2
    iget-object v0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v0, La/kie0;

    .line 341
    .line 342
    iget-object v2, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 345
    .line 346
    iget-object v3, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v3, Ljava/util/List;

    .line 349
    .line 350
    iget-object p0, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast p0, Ljava/util/List;

    .line 353
    .line 354
    sget v4, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 355
    .line 356
    iget v4, v0, La/kie0;->a:I

    .line 357
    .line 358
    const/4 v5, 0x1

    .line 359
    add-int/2addr v4, v5

    .line 360
    iput v4, v0, La/kie0;->a:I

    .line 361
    .line 362
    iget-object v4, v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->d:Ljava/util/ArrayList;

    .line 363
    .line 364
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 365
    .line 366
    .line 367
    move-result v6

    .line 368
    iget v0, v0, La/kie0;->a:I

    .line 369
    .line 370
    if-ne v6, v0, :cond_10

    .line 371
    .line 372
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_6

    .line 381
    .line 382
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 383
    .line 384
    .line 385
    move-result-object v4

    .line 386
    check-cast v4, La/zdq0;

    .line 387
    .line 388
    invoke-virtual {v4}, La/zdq0;->getRow$tile_matching()I

    .line 389
    .line 390
    .line 391
    move-result v6

    .line 392
    add-int/lit8 v6, v6, -0x5

    .line 393
    .line 394
    invoke-virtual {v4, v6}, La/zdq0;->setRow$tile_matching(I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    invoke-virtual {v2}, Landroid/view/View;->getHeight()I

    .line 402
    .line 403
    .line 404
    move-result v7

    .line 405
    mul-int/lit8 v7, v7, 0x5

    .line 406
    .line 407
    int-to-float v7, v7

    .line 408
    sub-float/2addr v6, v7

    .line 409
    invoke-virtual {v4, v6}, Landroid/view/View;->setY(F)V

    .line 410
    .line 411
    .line 412
    goto :goto_5

    .line 413
    :cond_6
    new-instance v0, La/kie0;

    .line 414
    .line 415
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 416
    .line 417
    .line 418
    new-instance v4, La/kie0;

    .line 419
    .line 420
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 421
    .line 422
    .line 423
    new-instance v6, Ljava/util/ArrayList;

    .line 424
    .line 425
    const/16 v7, 0xa

    .line 426
    .line 427
    invoke-static {v3, v7}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 432
    .line 433
    .line 434
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 435
    .line 436
    .line 437
    move-result-object v3

    .line 438
    :goto_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 439
    .line 440
    .line 441
    move-result v7

    .line 442
    if-eqz v7, :cond_9

    .line 443
    .line 444
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object v7

    .line 448
    check-cast v7, La/xdq0;

    .line 449
    .line 450
    iget v7, v7, La/xdq0;->c:I

    .line 451
    .line 452
    iget-object v8, v2, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 453
    .line 454
    new-instance v9, Ljava/util/ArrayList;

    .line 455
    .line 456
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 457
    .line 458
    .line 459
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v8

    .line 463
    :cond_7
    :goto_7
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v10

    .line 467
    if-eqz v10, :cond_8

    .line 468
    .line 469
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v10

    .line 473
    move-object v11, v10

    .line 474
    check-cast v11, La/zdq0;

    .line 475
    .line 476
    invoke-virtual {v11}, La/zdq0;->getColumn$tile_matching()I

    .line 477
    .line 478
    .line 479
    move-result v11

    .line 480
    if-ne v11, v7, :cond_7

    .line 481
    .line 482
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 483
    .line 484
    .line 485
    goto :goto_7

    .line 486
    :cond_8
    new-instance v7, La/tgo0;

    .line 487
    .line 488
    const/16 v8, 0xf

    .line 489
    .line 490
    invoke-direct {v7, v8}, La/tgo0;-><init>(B)V

    .line 491
    .line 492
    .line 493
    invoke-static {v9, v7}, Lkotlin/collections/CollectionsKt;->A0(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 494
    .line 495
    .line 496
    move-result-object v7

    .line 497
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    goto :goto_6

    .line 501
    :cond_9
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v3

    .line 505
    :cond_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    if-eqz v6, :cond_10

    .line 510
    .line 511
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    check-cast v6, Ljava/util/List;

    .line 516
    .line 517
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 518
    .line 519
    .line 520
    move-result-object v6

    .line 521
    const/4 v7, 0x0

    .line 522
    move v8, v7

    .line 523
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-eqz v9, :cond_a

    .line 528
    .line 529
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    move-result-object v9

    .line 533
    add-int/lit8 v10, v8, 0x1

    .line 534
    .line 535
    if-ltz v8, :cond_f

    .line 536
    .line 537
    check-cast v9, La/zdq0;

    .line 538
    .line 539
    invoke-virtual {v9}, La/zdq0;->getRow$tile_matching()I

    .line 540
    .line 541
    .line 542
    move-result v11

    .line 543
    if-eq v11, v8, :cond_e

    .line 544
    .line 545
    iget v11, v0, La/kie0;->a:I

    .line 546
    .line 547
    add-int/2addr v11, v5

    .line 548
    iput v11, v0, La/kie0;->a:I

    .line 549
    .line 550
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 551
    .line 552
    .line 553
    move-result-object v11

    .line 554
    :cond_b
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 555
    .line 556
    .line 557
    move-result v12

    .line 558
    if-eqz v12, :cond_c

    .line 559
    .line 560
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 561
    .line 562
    .line 563
    move-result-object v12

    .line 564
    move-object v13, v12

    .line 565
    check-cast v13, La/xdq0;

    .line 566
    .line 567
    iget v14, v13, La/xdq0;->b:I

    .line 568
    .line 569
    if-ne v14, v8, :cond_b

    .line 570
    .line 571
    iget v13, v13, La/xdq0;->c:I

    .line 572
    .line 573
    invoke-virtual {v9}, La/zdq0;->getColumn$tile_matching()I

    .line 574
    .line 575
    .line 576
    move-result v14

    .line 577
    if-ne v13, v14, :cond_b

    .line 578
    .line 579
    goto :goto_9

    .line 580
    :cond_c
    move-object v12, v1

    .line 581
    :goto_9
    check-cast v12, La/xdq0;

    .line 582
    .line 583
    if-eqz v12, :cond_d

    .line 584
    .line 585
    iget-object v11, v12, La/xdq0;->a:La/lgq0;

    .line 586
    .line 587
    invoke-virtual {v9, v11}, La/zdq0;->setType$tile_matching(La/lgq0;)V

    .line 588
    .line 589
    .line 590
    :cond_d
    new-instance v11, La/ck60;

    .line 591
    .line 592
    const/16 v12, 0x15

    .line 593
    .line 594
    invoke-direct {v11, v4, v0, v2, v12}, La/ck60;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 595
    .line 596
    .line 597
    int-to-float v12, v8

    .line 598
    invoke-virtual {v9}, Landroid/view/View;->getHeight()I

    .line 599
    .line 600
    .line 601
    move-result v13

    .line 602
    int-to-float v13, v13

    .line 603
    mul-float/2addr v12, v13

    .line 604
    iput v8, v9, La/zdq0;->i:I

    .line 605
    .line 606
    sget-object v8, Landroid/view/View;->Y:Landroid/util/Property;

    .line 607
    .line 608
    new-array v13, v5, [F

    .line 609
    .line 610
    aput v12, v13, v7

    .line 611
    .line 612
    invoke-static {v9, v8, v13}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 613
    .line 614
    .line 615
    move-result-object v8

    .line 616
    new-instance v9, La/x73;

    .line 617
    .line 618
    new-instance v12, La/h3q0;

    .line 619
    .line 620
    const/16 v13, 0xb

    .line 621
    .line 622
    invoke-direct {v12, v11, v13}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 623
    .line 624
    .line 625
    invoke-direct {v9, v1, v12, v13}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v8, v9}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 629
    .line 630
    .line 631
    const-wide/16 v11, 0x28a

    .line 632
    .line 633
    invoke-virtual {v8, v11, v12}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    .line 634
    .line 635
    .line 636
    move-result-object v8

    .line 637
    invoke-virtual {v8}, Landroid/animation/ObjectAnimator;->start()V

    .line 638
    .line 639
    .line 640
    :cond_e
    move v8, v10

    .line 641
    goto :goto_8

    .line 642
    :cond_f
    invoke-static {}, La/q3d;->p()V

    .line 643
    .line 644
    .line 645
    throw v1

    .line 646
    :cond_10
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 647
    .line 648
    return-object p0

    .line 649
    :pswitch_3
    iget-object v0, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v0, La/xdk0;

    .line 652
    .line 653
    iget-object v2, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 654
    .line 655
    check-cast v2, La/wdk0;

    .line 656
    .line 657
    iget-object v3, v2, La/wdk0;->d:Ljava/util/LinkedHashMap;

    .line 658
    .line 659
    iget-object v4, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 660
    .line 661
    check-cast v4, La/rrm;

    .line 662
    .line 663
    iget-object p0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 664
    .line 665
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 666
    .line 667
    iget-object v0, v0, La/xdk0;->g:Ljava/lang/String;

    .line 668
    .line 669
    if-eqz v0, :cond_13

    .line 670
    .line 671
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 672
    .line 673
    .line 674
    move-result v5

    .line 675
    if-nez v5, :cond_11

    .line 676
    .line 677
    goto :goto_a

    .line 678
    :cond_11
    move-object v0, v1

    .line 679
    :goto_a
    if-eqz v0, :cond_13

    .line 680
    .line 681
    invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 682
    .line 683
    .line 684
    move-result-object v5

    .line 685
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 686
    .line 687
    if-eqz v5, :cond_12

    .line 688
    .line 689
    invoke-virtual {v5}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 690
    .line 691
    .line 692
    move-result-object v1

    .line 693
    check-cast v1, La/rrm;

    .line 694
    .line 695
    :cond_12
    if-ne v1, v4, :cond_13

    .line 696
    .line 697
    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    :cond_13
    iget-object v0, v2, La/wdk0;->e:Ljava/util/Set;

    .line 701
    .line 702
    invoke-interface {v0, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 703
    .line 704
    .line 705
    move-result v0

    .line 706
    if-eqz v0, :cond_14

    .line 707
    .line 708
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 709
    .line 710
    goto :goto_b

    .line 711
    :cond_14
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 715
    .line 716
    :goto_b
    return-object p0

    .line 717
    :pswitch_4
    iget-object v0, p0, La/zbg0;->b:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 720
    .line 721
    iget-object v1, p0, La/zbg0;->c:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 724
    .line 725
    iget-object v2, p0, La/zbg0;->d:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v2, La/hc50;

    .line 728
    .line 729
    iget-object p0, p0, La/zbg0;->e:Ljava/lang/Object;

    .line 730
    .line 731
    check-cast p0, La/acg0;

    .line 732
    .line 733
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 737
    .line 738
    .line 739
    iget-object v0, v2, La/hc50;->d:Lkotlin/jvm/functions/Function0;

    .line 740
    .line 741
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 742
    .line 743
    .line 744
    iget-object p0, p0, La/acg0;->i:La/j6g0;

    .line 745
    .line 746
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 750
    .line 751
    return-object p0

    .line 752
    nop

    .line 753
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
