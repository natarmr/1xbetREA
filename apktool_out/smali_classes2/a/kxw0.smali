.class public final La/kxw0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/syw0;


# static fields
.field public static volatile g1:La/kxw0;


# instance fields
.field public A:I

.field public B:I

.field public final Y:Ljava/util/concurrent/atomic/AtomicInteger;

.field public final Z:J

.field public final a:Landroid/content/Context;

.field public final b:Z

.field public final c:La/svs0;

.field public final d:La/bkw0;

.field public final e:La/wvw0;

.field public final f:La/uuw0;

.field public final f1:J

.field public final g:La/fxw0;

.field public final h:La/w4x0;

.field public final i:La/x6x0;

.field public final j:La/iuw0;

.field public final k:La/lwf;

.field public final l:La/c2x0;

.field public final m:La/b1x0;

.field public final n:La/dqw0;

.field public final o:La/k1x0;

.field public final p:Ljava/lang/String;

.field public q:La/euw0;

.field public r:La/a4x0;

.field public s:La/kmw0;

.field public t:La/vtw0;

.field public u:La/o1x0;

.field public v:Z

.field public w:Ljava/lang/Boolean;

.field public x:J

.field public volatile y:Ljava/lang/Boolean;

.field public volatile z:Z


# direct methods
.method public constructor <init>(La/bzw0;)V
    .locals 10

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, La/kxw0;->v:Z

    .line 6
    .line 7
    new-instance v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    .line 10
    .line 11
    .line 12
    iput-object v1, p0, La/kxw0;->Y:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    .line 14
    iget-object v1, p1, La/bzw0;->a:Landroid/content/Context;

    .line 15
    .line 16
    new-instance v2, La/svs0;

    .line 17
    .line 18
    const/16 v3, 0x17

    .line 19
    .line 20
    invoke-direct {v2, v3}, La/svs0;-><init>(B)V

    .line 21
    .line 22
    .line 23
    iput-object v2, p0, La/kxw0;->c:La/svs0;

    .line 24
    .line 25
    sput-object v2, La/ltt0;->c:La/svs0;

    .line 26
    .line 27
    iput-object v1, p0, La/kxw0;->a:Landroid/content/Context;

    .line 28
    .line 29
    iget-boolean v2, p1, La/bzw0;->e:Z

    .line 30
    .line 31
    iput-boolean v2, p0, La/kxw0;->b:Z

    .line 32
    .line 33
    iget-object v2, p1, La/bzw0;->b:Ljava/lang/Boolean;

    .line 34
    .line 35
    iput-object v2, p0, La/kxw0;->y:Ljava/lang/Boolean;

    .line 36
    .line 37
    iget-object v2, p1, La/bzw0;->h:Ljava/lang/String;

    .line 38
    .line 39
    iput-object v2, p0, La/kxw0;->p:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v2, 0x1

    .line 42
    iput-boolean v2, p0, La/kxw0;->z:Z

    .line 43
    .line 44
    sget-object v3, La/t1x0;->b:La/r0x0;

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    const/4 v5, 0x0

    .line 48
    if-nez v3, :cond_7

    .line 49
    .line 50
    sget-object v3, La/t1x0;->a:Ljava/lang/Object;

    .line 51
    .line 52
    monitor-enter v3

    .line 53
    :try_start_0
    sget-object v6, La/t1x0;->b:La/r0x0;

    .line 54
    .line 55
    if-nez v6, :cond_6

    .line 56
    .line 57
    monitor-enter v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 58
    :try_start_1
    sget-object v6, La/t1x0;->b:La/r0x0;

    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 61
    .line 62
    .line 63
    move-result-object v7

    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    move-object v7, v1

    .line 68
    :goto_0
    if-eqz v6, :cond_1

    .line 69
    .line 70
    iget-object v8, v6, La/r0x0;->a:Landroid/content/Context;

    .line 71
    .line 72
    if-eq v8, v7, :cond_5

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :catchall_0
    move-exception p0

    .line 76
    goto :goto_3

    .line 77
    :cond_1
    :goto_1
    if-eqz v6, :cond_4

    .line 78
    .line 79
    sget-object v6, La/u0x0;->a:Ljava/util/concurrent/ConcurrentHashMap;

    .line 80
    .line 81
    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    invoke-interface {v6}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-nez v8, :cond_2

    .line 94
    .line 95
    invoke-static {}, La/a2x0;->a()V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    if-nez p0, :cond_3

    .line 104
    .line 105
    throw v5

    .line 106
    :cond_3
    new-instance p0, Ljava/lang/ClassCastException;

    .line 107
    .line 108
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 109
    .line 110
    .line 111
    throw p0

    .line 112
    :cond_4
    :goto_2
    new-instance v6, La/f1x0;

    .line 113
    .line 114
    invoke-direct {v6, v7, v4}, La/f1x0;-><init>(Landroid/content/Context;B)V

    .line 115
    .line 116
    .line 117
    invoke-static {v6}, La/hfm0;->z(La/lin0;)La/lin0;

    .line 118
    .line 119
    .line 120
    move-result-object v6

    .line 121
    new-instance v8, La/r0x0;

    .line 122
    .line 123
    invoke-direct {v8, v7, v6}, La/r0x0;-><init>(Landroid/content/Context;La/lin0;)V

    .line 124
    .line 125
    .line 126
    sput-object v8, La/t1x0;->b:La/r0x0;

    .line 127
    .line 128
    sget-object v6, La/t1x0;->c:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 129
    .line 130
    invoke-virtual {v6}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    .line 131
    .line 132
    .line 133
    :cond_5
    monitor-exit v3

    .line 134
    goto :goto_4

    .line 135
    :goto_3
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 136
    :try_start_2
    throw p0

    .line 137
    :catchall_1
    move-exception p0

    .line 138
    goto :goto_5

    .line 139
    :cond_6
    :goto_4
    monitor-exit v3

    .line 140
    goto :goto_6

    .line 141
    :goto_5
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 142
    throw p0

    .line 143
    :cond_7
    :goto_6
    sget-object v3, La/lwf;->i:La/lwf;

    .line 144
    .line 145
    iput-object v3, p0, La/kxw0;->k:La/lwf;

    .line 146
    .line 147
    new-instance v3, La/tzw0;

    .line 148
    .line 149
    sget-object v6, La/gzw0;->a:La/yzn0;

    .line 150
    .line 151
    sget-object v7, La/ea3;->D:La/da3;

    .line 152
    .line 153
    sget-object v8, La/mav;->c:La/mav;

    .line 154
    .line 155
    invoke-direct {v3, v1, v6, v7, v8}, La/nav;-><init>(Landroid/content/Context;La/yzn0;La/ea3;La/mav;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v6

    .line 166
    new-array v7, v0, [Ljava/lang/String;

    .line 167
    .line 168
    const-string v8, "com.google.android.gms.measurement#"

    .line 169
    .line 170
    invoke-virtual {v8, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v6

    .line 174
    invoke-static {}, La/s9w0;->a()La/euo0;

    .line 175
    .line 176
    .line 177
    move-result-object v8

    .line 178
    new-instance v9, La/okt0;

    .line 179
    .line 180
    invoke-direct {v9, v6, v7}, La/okt0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iput-object v9, v8, La/euo0;->a:La/mff0;

    .line 184
    .line 185
    invoke-virtual {v8}, La/euo0;->a()La/s9w0;

    .line 186
    .line 187
    .line 188
    move-result-object v6

    .line 189
    invoke-virtual {v3, v0, v6}, La/nav;->b(ILa/s9w0;)Lcom/google/android/gms/tasks/Task;

    .line 190
    .line 191
    .line 192
    sget-object v3, La/c1x0;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 193
    .line 194
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v6

    .line 198
    if-eqz v6, :cond_8

    .line 199
    .line 200
    goto :goto_8

    .line 201
    :cond_8
    :try_start_3
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 202
    .line 203
    .line 204
    move-result-object v1
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0

    .line 205
    goto :goto_7

    .line 206
    :catch_0
    invoke-static {}, La/c1x0;->b()V

    .line 207
    .line 208
    .line 209
    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    .line 210
    .line 211
    sget-object v6, La/c1x0;->m:La/lin0;

    .line 212
    .line 213
    invoke-interface {v6}, La/lin0;->get()Ljava/lang/Object;

    .line 214
    .line 215
    .line 216
    move-result-object v6

    .line 217
    check-cast v6, Ljava/util/concurrent/Executor;

    .line 218
    .line 219
    const-string v7, "context.getApplicationContext() yielded NullPointerException"

    .line 220
    .line 221
    new-array v8, v0, [Ljava/lang/Object;

    .line 222
    .line 223
    invoke-static {v1, v6, v5, v7, v8}, La/k7n0;->I(Ljava/util/logging/Level;Ljava/util/concurrent/Executor;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    move-object v1, v5

    .line 227
    :goto_7
    if-eqz v1, :cond_b

    .line 228
    .line 229
    :cond_9
    invoke-virtual {v3, v5, v1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v6

    .line 233
    if-eqz v6, :cond_a

    .line 234
    .line 235
    goto :goto_8

    .line 236
    :cond_a
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v6

    .line 240
    if-eqz v6, :cond_9

    .line 241
    .line 242
    :cond_b
    :goto_8
    iget-object v1, p1, La/bzw0;->f:Ljava/lang/Long;

    .line 243
    .line 244
    if-eqz v1, :cond_c

    .line 245
    .line 246
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 247
    .line 248
    .line 249
    move-result-wide v5

    .line 250
    goto :goto_9

    .line 251
    :cond_c
    iget-object v1, p0, La/kxw0;->k:La/lwf;

    .line 252
    .line 253
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 257
    .line 258
    .line 259
    move-result-wide v5

    .line 260
    :goto_9
    iput-wide v5, p0, La/kxw0;->Z:J

    .line 261
    .line 262
    iget-object v1, p1, La/bzw0;->g:Ljava/lang/Long;

    .line 263
    .line 264
    if-eqz v1, :cond_d

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 267
    .line 268
    .line 269
    move-result-wide v5

    .line 270
    goto :goto_a

    .line 271
    :cond_d
    iget-object v1, p0, La/kxw0;->k:La/lwf;

    .line 272
    .line 273
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 274
    .line 275
    .line 276
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 277
    .line 278
    .line 279
    move-result-wide v5

    .line 280
    :goto_a
    iput-wide v5, p0, La/kxw0;->f1:J

    .line 281
    .line 282
    new-instance v1, La/bkw0;

    .line 283
    .line 284
    invoke-direct {v1, p0}, La/p4;-><init>(La/kxw0;)V

    .line 285
    .line 286
    .line 287
    sget-object v3, La/svs0;->b:La/svs0;

    .line 288
    .line 289
    iput-object v3, v1, La/bkw0;->e:La/rjw0;

    .line 290
    .line 291
    iput-object v1, p0, La/kxw0;->d:La/bkw0;

    .line 292
    .line 293
    new-instance v1, La/wvw0;

    .line 294
    .line 295
    invoke-direct {v1, p0}, La/wvw0;-><init>(La/kxw0;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, La/ryw0;->p1()V

    .line 299
    .line 300
    .line 301
    iput-object v1, p0, La/kxw0;->e:La/wvw0;

    .line 302
    .line 303
    new-instance v1, La/uuw0;

    .line 304
    .line 305
    invoke-direct {v1, p0}, La/uuw0;-><init>(La/kxw0;)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, La/ryw0;->p1()V

    .line 309
    .line 310
    .line 311
    iput-object v1, p0, La/kxw0;->f:La/uuw0;

    .line 312
    .line 313
    new-instance v3, La/x6x0;

    .line 314
    .line 315
    invoke-direct {v3, p0}, La/x6x0;-><init>(La/kxw0;)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v3}, La/ryw0;->p1()V

    .line 319
    .line 320
    .line 321
    iput-object v3, p0, La/kxw0;->i:La/x6x0;

    .line 322
    .line 323
    new-instance v3, La/ilp0;

    .line 324
    .line 325
    invoke-direct {v3, p1, p0}, La/ilp0;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 326
    .line 327
    .line 328
    new-instance v5, La/iuw0;

    .line 329
    .line 330
    invoke-direct {v5, v3}, La/iuw0;-><init>(La/ilp0;)V

    .line 331
    .line 332
    .line 333
    iput-object v5, p0, La/kxw0;->j:La/iuw0;

    .line 334
    .line 335
    new-instance v3, La/dqw0;

    .line 336
    .line 337
    invoke-direct {v3, p0}, La/dqw0;-><init>(La/kxw0;)V

    .line 338
    .line 339
    .line 340
    iput-object v3, p0, La/kxw0;->n:La/dqw0;

    .line 341
    .line 342
    new-instance v3, La/c2x0;

    .line 343
    .line 344
    invoke-direct {v3, p0}, La/c2x0;-><init>(La/kxw0;)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v3}, La/etw0;->f1()V

    .line 348
    .line 349
    .line 350
    iput-object v3, p0, La/kxw0;->l:La/c2x0;

    .line 351
    .line 352
    new-instance v3, La/b1x0;

    .line 353
    .line 354
    invoke-direct {v3, p0}, La/b1x0;-><init>(La/kxw0;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v3}, La/etw0;->f1()V

    .line 358
    .line 359
    .line 360
    iput-object v3, p0, La/kxw0;->m:La/b1x0;

    .line 361
    .line 362
    new-instance v5, La/w4x0;

    .line 363
    .line 364
    invoke-direct {v5, p0}, La/w4x0;-><init>(La/kxw0;)V

    .line 365
    .line 366
    .line 367
    invoke-virtual {v5}, La/etw0;->f1()V

    .line 368
    .line 369
    .line 370
    iput-object v5, p0, La/kxw0;->h:La/w4x0;

    .line 371
    .line 372
    new-instance v5, La/k1x0;

    .line 373
    .line 374
    invoke-direct {v5, p0}, La/p4;-><init>(La/kxw0;)V

    .line 375
    .line 376
    .line 377
    iget-object v6, v5, La/p4;->b:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v6, La/kxw0;

    .line 380
    .line 381
    iget v7, v6, La/kxw0;->A:I

    .line 382
    .line 383
    add-int/2addr v7, v2

    .line 384
    iput v7, v6, La/kxw0;->A:I

    .line 385
    .line 386
    invoke-virtual {v5}, La/ryw0;->p1()V

    .line 387
    .line 388
    .line 389
    iput-object v5, p0, La/kxw0;->o:La/k1x0;

    .line 390
    .line 391
    new-instance v5, La/fxw0;

    .line 392
    .line 393
    invoke-direct {v5, p0}, La/fxw0;-><init>(La/kxw0;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v5}, La/ryw0;->p1()V

    .line 397
    .line 398
    .line 399
    iput-object v5, p0, La/kxw0;->g:La/fxw0;

    .line 400
    .line 401
    iget-object v6, p1, La/bzw0;->d:Lcom/google/android/gms/internal/measurement/zzdb;

    .line 402
    .line 403
    if-eqz v6, :cond_e

    .line 404
    .line 405
    iget-wide v6, v6, Lcom/google/android/gms/internal/measurement/zzdb;->b:J

    .line 406
    .line 407
    const-wide/16 v8, 0x0

    .line 408
    .line 409
    cmp-long v6, v6, v8

    .line 410
    .line 411
    if-eqz v6, :cond_e

    .line 412
    .line 413
    move v2, v0

    .line 414
    :cond_e
    iget-object v6, p0, La/kxw0;->a:Landroid/content/Context;

    .line 415
    .line 416
    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    instance-of v6, v6, Landroid/app/Application;

    .line 421
    .line 422
    if-eqz v6, :cond_10

    .line 423
    .line 424
    invoke-static {v3}, La/kxw0;->f(La/etw0;)V

    .line 425
    .line 426
    .line 427
    iget-object v1, v3, La/p4;->b:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v1, La/kxw0;

    .line 430
    .line 431
    iget-object v1, v1, La/kxw0;->a:Landroid/content/Context;

    .line 432
    .line 433
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    instance-of v1, v1, Landroid/app/Application;

    .line 438
    .line 439
    if-eqz v1, :cond_11

    .line 440
    .line 441
    iget-object v1, v3, La/p4;->b:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v1, La/kxw0;

    .line 444
    .line 445
    iget-object v1, v1, La/kxw0;->a:Landroid/content/Context;

    .line 446
    .line 447
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, Landroid/app/Application;

    .line 452
    .line 453
    iget-object v6, v3, La/b1x0;->d:La/cgp;

    .line 454
    .line 455
    if-nez v6, :cond_f

    .line 456
    .line 457
    new-instance v6, La/cgp;

    .line 458
    .line 459
    invoke-direct {v6, v3, v4}, La/cgp;-><init>(Ljava/lang/Object;B)V

    .line 460
    .line 461
    .line 462
    iput-object v6, v3, La/b1x0;->d:La/cgp;

    .line 463
    .line 464
    :cond_f
    if-eqz v2, :cond_11

    .line 465
    .line 466
    invoke-virtual {v1, v6}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 467
    .line 468
    .line 469
    iget-object v2, v3, La/b1x0;->d:La/cgp;

    .line 470
    .line 471
    invoke-virtual {v1, v2}, Landroid/app/Application;->registerActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 472
    .line 473
    .line 474
    iget-object v1, v3, La/p4;->b:Ljava/lang/Object;

    .line 475
    .line 476
    check-cast v1, La/kxw0;

    .line 477
    .line 478
    iget-object v1, v1, La/kxw0;->f:La/uuw0;

    .line 479
    .line 480
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 481
    .line 482
    .line 483
    iget-object v1, v1, La/uuw0;->o:La/quw0;

    .line 484
    .line 485
    const-string v2, "Registered activity lifecycle callback"

    .line 486
    .line 487
    invoke-virtual {v1, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 488
    .line 489
    .line 490
    goto :goto_b

    .line 491
    :cond_10
    invoke-static {v1}, La/kxw0;->g(La/ryw0;)V

    .line 492
    .line 493
    .line 494
    iget-object v1, v1, La/uuw0;->j:La/quw0;

    .line 495
    .line 496
    const-string v2, "Application context is not an Application"

    .line 497
    .line 498
    invoke-virtual {v1, v2}, La/quw0;->a(Ljava/lang/String;)V

    .line 499
    .line 500
    .line 501
    :cond_11
    :goto_b
    new-instance v1, La/mfr;

    .line 502
    .line 503
    const/16 v2, 0x16

    .line 504
    .line 505
    invoke-direct {v1, p0, p1, v0, v2}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZB)V

    .line 506
    .line 507
    .line 508
    invoke-virtual {v5, v1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 509
    .line 510
    .line 511
    return-void
.end method

.method public static final d(La/zrw0;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final e(La/p4;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const-string p0, "Component not created"

    .line 5
    .line 6
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public static final f(La/etw0;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, La/etw0;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static final g(La/ryw0;)V
    .locals 1

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    iget-boolean v0, p0, La/ryw0;->c:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "Component not initialized: "

    .line 17
    .line 18
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    const-string p0, "Component not created"

    .line 27
    .line 28
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public static l(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdb;Ljava/lang/Long;Ljava/lang/Long;)La/kxw0;
    .locals 8

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object v6, p1, Lcom/google/android/gms/internal/measurement/zzdb;->d:Landroid/os/Bundle;

    .line 4
    .line 5
    iget-boolean v5, p1, Lcom/google/android/gms/internal/measurement/zzdb;->c:Z

    .line 6
    .line 7
    iget-wide v3, p1, Lcom/google/android/gms/internal/measurement/zzdb;->b:J

    .line 8
    .line 9
    iget-wide v1, p1, Lcom/google/android/gms/internal/measurement/zzdb;->a:J

    .line 10
    .line 11
    new-instance v0, Lcom/google/android/gms/internal/measurement/zzdb;

    .line 12
    .line 13
    const/4 v7, 0x0

    .line 14
    invoke-direct/range {v0 .. v7}, Lcom/google/android/gms/internal/measurement/zzdb;-><init>(JJZLandroid/os/Bundle;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    move-object p1, v0

    .line 18
    :cond_0
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, La/kxw0;->g1:La/kxw0;

    .line 29
    .line 30
    if-nez v0, :cond_2

    .line 31
    .line 32
    const-class v1, La/kxw0;

    .line 33
    .line 34
    monitor-enter v1

    .line 35
    :try_start_0
    sget-object v0, La/kxw0;->g1:La/kxw0;

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    new-instance v0, La/bzw0;

    .line 40
    .line 41
    invoke-direct {v0, p0, p1, p2, p3}, La/bzw0;-><init>(Landroid/content/Context;Lcom/google/android/gms/internal/measurement/zzdb;Ljava/lang/Long;Ljava/lang/Long;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, La/kxw0;

    .line 45
    .line 46
    invoke-direct {p0, v0}, La/kxw0;-><init>(La/bzw0;)V

    .line 47
    .line 48
    .line 49
    sput-object p0, La/kxw0;->g1:La/kxw0;

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v0

    .line 53
    move-object p0, v0

    .line 54
    goto :goto_1

    .line 55
    :cond_1
    :goto_0
    monitor-exit v1

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    throw p0

    .line 59
    :cond_2
    if-eqz p1, :cond_3

    .line 60
    .line 61
    iget-object p0, p1, Lcom/google/android/gms/internal/measurement/zzdb;->d:Landroid/os/Bundle;

    .line 62
    .line 63
    if-eqz p0, :cond_3

    .line 64
    .line 65
    const-string p1, "dataCollectionDefaultEnabled"

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    sget-object p1, La/kxw0;->g1:La/kxw0;

    .line 74
    .line 75
    invoke-static {p1}, La/s0x;->H(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, La/kxw0;->g1:La/kxw0;

    .line 79
    .line 80
    const-string p2, "dataCollectionDefaultEnabled"

    .line 81
    .line 82
    invoke-virtual {p0, p2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    iput-object p0, p1, La/kxw0;->y:Ljava/lang/Boolean;

    .line 91
    .line 92
    :cond_3
    :goto_2
    sget-object p0, La/kxw0;->g1:La/kxw0;

    .line 93
    .line 94
    invoke-static {p0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    sget-object p0, La/kxw0;->g1:La/kxw0;

    .line 98
    .line 99
    return-object p0
.end method


# virtual methods
.method public final J()La/fxw0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxw0;->g:La/fxw0;

    .line 2
    .line 3
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public final K()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxw0;->a:Landroid/content/Context;

    .line 2
    .line 3
    return-object p0
.end method

.method public final S()La/lwf;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxw0;->k:La/lwf;

    .line 2
    .line 3
    return-object p0
.end method

.method public final a()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kxw0;->b()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public final b()I
    .locals 5

    .line 1
    iget-object v0, p0, La/kxw0;->g:La/fxw0;

    .line 2
    .line 3
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, La/kxw0;->d:La/bkw0;

    .line 10
    .line 11
    invoke-virtual {v1}, La/bkw0;->A1()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x1

    .line 16
    if-nez v2, :cond_8

    .line 17
    .line 18
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 22
    .line 23
    .line 24
    iget-boolean v0, p0, La/kxw0;->z:Z

    .line 25
    .line 26
    if-eqz v0, :cond_7

    .line 27
    .line 28
    iget-object v0, p0, La/kxw0;->e:La/wvw0;

    .line 29
    .line 30
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, La/p4;->m1()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    const-string v4, "measurement_enabled"

    .line 41
    .line 42
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    invoke-virtual {v0}, La/wvw0;->q1()Landroid/content/SharedPreferences;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-interface {v0, v4, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    const/4 v0, 0x0

    .line 62
    :goto_0
    if-eqz v0, :cond_2

    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    if-eqz p0, :cond_1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    const/4 p0, 0x3

    .line 72
    return p0

    .line 73
    :cond_2
    iget-object v0, v1, La/p4;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/kxw0;

    .line 76
    .line 77
    iget-object v0, v0, La/kxw0;->c:La/svs0;

    .line 78
    .line 79
    const-string v0, "firebase_analytics_collection_enabled"

    .line 80
    .line 81
    invoke-virtual {v1, v0}, La/bkw0;->z1(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    if-eqz p0, :cond_3

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    const/4 p0, 0x4

    .line 95
    return p0

    .line 96
    :cond_4
    iget-object v0, p0, La/kxw0;->y:Ljava/lang/Boolean;

    .line 97
    .line 98
    if-eqz v0, :cond_6

    .line 99
    .line 100
    iget-object p0, p0, La/kxw0;->y:Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_5

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_5
    const/4 p0, 0x7

    .line 110
    return p0

    .line 111
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 112
    return p0

    .line 113
    :cond_7
    const/16 p0, 0x8

    .line 114
    .line 115
    return p0

    .line 116
    :cond_8
    return v3
.end method

.method public final c()Z
    .locals 7

    .line 1
    iget-boolean v0, p0, La/kxw0;->v:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_4

    .line 5
    .line 6
    iget-object v0, p0, La/kxw0;->g:La/fxw0;

    .line 7
    .line 8
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, La/kxw0;->w:Ljava/lang/Boolean;

    .line 15
    .line 16
    iget-object v2, p0, La/kxw0;->k:La/lwf;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-wide v3, p0, La/kxw0;->x:J

    .line 21
    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    cmp-long v3, v3, v5

    .line 25
    .line 26
    if-eqz v3, :cond_0

    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 38
    .line 39
    .line 40
    move-result-wide v3

    .line 41
    iget-wide v5, p0, La/kxw0;->x:J

    .line 42
    .line 43
    sub-long/2addr v3, v5

    .line 44
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    .line 45
    .line 46
    .line 47
    move-result-wide v3

    .line 48
    const-wide/16 v5, 0x3e8

    .line 49
    .line 50
    cmp-long v0, v3, v5

    .line 51
    .line 52
    if-lez v0, :cond_3

    .line 53
    .line 54
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 58
    .line 59
    .line 60
    move-result-wide v2

    .line 61
    iput-wide v2, p0, La/kxw0;->x:J

    .line 62
    .line 63
    iget-object v0, p0, La/kxw0;->i:La/x6x0;

    .line 64
    .line 65
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 66
    .line 67
    .line 68
    const-string v2, "android.permission.INTERNET"

    .line 69
    .line 70
    invoke-virtual {v0, v2}, La/x6x0;->P1(Ljava/lang/String;)Z

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-eqz v2, :cond_2

    .line 75
    .line 76
    const-string v2, "android.permission.ACCESS_NETWORK_STATE"

    .line 77
    .line 78
    invoke-virtual {v0, v2}, La/x6x0;->P1(Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v2

    .line 82
    if-eqz v2, :cond_2

    .line 83
    .line 84
    iget-object v2, p0, La/kxw0;->a:Landroid/content/Context;

    .line 85
    .line 86
    invoke-static {v2}, La/grv0;->a(Landroid/content/Context;)La/o58;

    .line 87
    .line 88
    .line 89
    move-result-object v3

    .line 90
    invoke-virtual {v3}, La/o58;->c()Z

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    const/4 v4, 0x1

    .line 95
    if-nez v3, :cond_1

    .line 96
    .line 97
    iget-object v3, p0, La/kxw0;->d:La/bkw0;

    .line 98
    .line 99
    invoke-virtual {v3}, La/bkw0;->p1()Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    if-nez v3, :cond_1

    .line 104
    .line 105
    invoke-static {v2}, La/x6x0;->h2(Landroid/content/Context;)Z

    .line 106
    .line 107
    .line 108
    move-result v3

    .line 109
    if-eqz v3, :cond_2

    .line 110
    .line 111
    invoke-static {v2}, La/x6x0;->H1(Landroid/content/Context;)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_2

    .line 116
    .line 117
    :cond_1
    move v1, v4

    .line 118
    :cond_2
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    iput-object v2, p0, La/kxw0;->w:Ljava/lang/Boolean;

    .line 123
    .line 124
    if-eqz v1, :cond_3

    .line 125
    .line 126
    invoke-virtual {p0}, La/kxw0;->k()La/vtw0;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-virtual {v1}, La/vtw0;->s1()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-virtual {v0, v1}, La/x6x0;->s1(Ljava/lang/String;)Z

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    iput-object v0, p0, La/kxw0;->w:Ljava/lang/Boolean;

    .line 143
    .line 144
    :cond_3
    iget-object p0, p0, La/kxw0;->w:Ljava/lang/Boolean;

    .line 145
    .line 146
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    return p0

    .line 151
    :cond_4
    const-string p0, "AppMeasurement is not initialized"

    .line 152
    .line 153
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return v1
.end method

.method public final h()La/euw0;
    .locals 1

    .line 1
    iget-object v0, p0, La/kxw0;->q:La/euw0;

    .line 2
    .line 3
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/kxw0;->q:La/euw0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final i()La/a4x0;
    .locals 1

    .line 1
    iget-object v0, p0, La/kxw0;->r:La/a4x0;

    .line 2
    .line 3
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/kxw0;->r:La/a4x0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final j()La/kmw0;
    .locals 1

    .line 1
    iget-object v0, p0, La/kxw0;->s:La/kmw0;

    .line 2
    .line 3
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/kxw0;->s:La/kmw0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final k()La/vtw0;
    .locals 1

    .line 1
    iget-object v0, p0, La/kxw0;->t:La/vtw0;

    .line 2
    .line 3
    invoke-static {v0}, La/kxw0;->f(La/etw0;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/kxw0;->t:La/vtw0;

    .line 7
    .line 8
    return-object p0
.end method

.method public final p()La/svs0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxw0;->c:La/svs0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final r()La/uuw0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 2
    .line 3
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method
