.class public final La/zfr0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:La/fd40;

.field public final c:La/ouu;

.field public final d:La/gx3;

.field public final e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

.field public f:Z

.field public final g:La/xfr0;


# direct methods
.method public constructor <init>(La/fd40;La/xfr0;La/ouu;Landroid/content/Context;Ljava/util/concurrent/ScheduledThreadPoolExecutor;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/gx3;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, La/nuj0;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, La/zfr0;->d:La/gx3;

    .line 11
    .line 12
    iput-boolean v1, p0, La/zfr0;->f:Z

    .line 13
    .line 14
    iput-object p1, p0, La/zfr0;->b:La/fd40;

    .line 15
    .line 16
    iput-object p2, p0, La/zfr0;->g:La/xfr0;

    .line 17
    .line 18
    iput-object p3, p0, La/zfr0;->c:La/ouu;

    .line 19
    .line 20
    iput-object p4, p0, La/zfr0;->a:Landroid/content/Context;

    .line 21
    .line 22
    iput-object p5, p0, La/zfr0;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final declared-synchronized a(Z)V
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    iput-boolean p1, p0, La/zfr0;->f:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    monitor-exit p0

    .line 5
    return-void

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 8
    throw p1
.end method

.method public final b()Z
    .locals 13

    .line 1
    :goto_0
    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, La/zfr0;->g:La/xfr0;

    .line 3
    .line 4
    invoke-virtual {v0}, La/xfr0;->a()La/wfr0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x3

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    const-string v0, "FirebaseMessaging"

    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    const-string v0, "FirebaseMessaging"

    .line 20
    .line 21
    const-string v1, "topic sync succeeded"

    .line 22
    .line 23
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    goto :goto_1

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto/16 :goto_8

    .line 29
    .line 30
    :cond_0
    :goto_1
    const/4 v0, 0x1

    .line 31
    monitor-exit p0

    .line 32
    return v0

    .line 33
    :cond_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    const-string v2, " succeeded."

    .line 35
    .line 36
    iget-object v3, p0, La/zfr0;->c:La/ouu;

    .line 37
    .line 38
    const-string v4, "FirebaseMessaging"

    .line 39
    .line 40
    const-string v5, "Subscribe to topic: "

    .line 41
    .line 42
    const-string v6, "Unsubscribe from topic: "

    .line 43
    .line 44
    const-string v7, "Unknown topic operation"

    .line 45
    .line 46
    const/4 v8, 0x0

    .line 47
    :try_start_1
    iget-object v9, v0, La/wfr0;->b:Ljava/lang/String;

    .line 48
    .line 49
    iget-object v10, v0, La/wfr0;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v9}, Ljava/lang/String;->hashCode()I

    .line 52
    .line 53
    .line 54
    move-result v11

    .line 55
    const/16 v12, 0x53

    .line 56
    .line 57
    if-eq v11, v12, :cond_3

    .line 58
    .line 59
    const/16 v5, 0x55

    .line 60
    .line 61
    if-eq v11, v5, :cond_2

    .line 62
    .line 63
    goto/16 :goto_2

    .line 64
    .line 65
    :cond_2
    const-string v5, "U"

    .line 66
    .line 67
    invoke-virtual {v9, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_4

    .line 72
    .line 73
    iget-object v5, v3, La/ouu;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v5, La/dgq;

    .line 76
    .line 77
    check-cast v5, La/cgq;

    .line 78
    .line 79
    invoke-virtual {v5}, La/cgq;->d()Lcom/google/android/gms/tasks/Task;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-static {v7}, La/ouu;->k(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    check-cast v7, La/d45;

    .line 88
    .line 89
    iget-object v7, v7, La/d45;->a:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v9, v3, La/ouu;->d:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v9, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 94
    .line 95
    invoke-virtual {v9}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v5}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-static {v5}, La/ouu;->k(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    check-cast v5, Ljava/lang/String;

    .line 107
    .line 108
    const-string v9, "unsubscribe"

    .line 109
    .line 110
    invoke-virtual {v3, v10, v7, v5, v9}, La/ouu;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    const-string v3, "FirebaseMessaging"

    .line 114
    .line 115
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    if-eqz v1, :cond_5

    .line 120
    .line 121
    new-instance v1, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 137
    .line 138
    .line 139
    goto :goto_3

    .line 140
    :catch_0
    move-exception p0

    .line 141
    goto/16 :goto_5

    .line 142
    .line 143
    :cond_3
    const-string v6, "S"

    .line 144
    .line 145
    invoke-virtual {v9, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v6

    .line 149
    if-eqz v6, :cond_4

    .line 150
    .line 151
    iget-object v6, v3, La/ouu;->b:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v6, La/dgq;

    .line 154
    .line 155
    check-cast v6, La/cgq;

    .line 156
    .line 157
    invoke-virtual {v6}, La/cgq;->d()Lcom/google/android/gms/tasks/Task;

    .line 158
    .line 159
    .line 160
    move-result-object v7

    .line 161
    invoke-static {v7}, La/ouu;->k(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v7

    .line 165
    check-cast v7, La/d45;

    .line 166
    .line 167
    iget-object v7, v7, La/d45;->a:Ljava/lang/String;

    .line 168
    .line 169
    iget-object v9, v3, La/ouu;->d:Ljava/lang/Object;

    .line 170
    .line 171
    check-cast v9, Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 172
    .line 173
    invoke-virtual {v9}, Lcom/google/firebase/messaging/FirebaseMessaging;->a()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v6}, La/cgq;->c()Lcom/google/android/gms/tasks/Task;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    invoke-static {v6}, La/ouu;->k(Lcom/google/android/gms/tasks/Task;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    check-cast v6, Ljava/lang/String;

    .line 185
    .line 186
    const-string v9, "subscribe"

    .line 187
    .line 188
    invoke-virtual {v3, v10, v7, v6, v9}, La/ouu;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    const-string v3, "FirebaseMessaging"

    .line 192
    .line 193
    invoke-static {v3, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 194
    .line 195
    .line 196
    move-result v1

    .line 197
    if-eqz v1, :cond_5

    .line 198
    .line 199
    new-instance v1, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    goto :goto_3

    .line 218
    :cond_4
    :goto_2
    const-string v2, "FirebaseMessaging"

    .line 219
    .line 220
    invoke-static {v2, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 221
    .line 222
    .line 223
    move-result v1

    .line 224
    if-eqz v1, :cond_5

    .line 225
    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    const-string v2, "."

    .line 235
    .line 236
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object v1

    .line 243
    invoke-static {v4, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 244
    .line 245
    .line 246
    :cond_5
    :goto_3
    iget-object v1, p0, La/zfr0;->g:La/xfr0;

    .line 247
    .line 248
    monitor-enter v1

    .line 249
    :try_start_2
    iget-object v2, v1, La/xfr0;->a:La/y3v;

    .line 250
    .line 251
    iget-object v3, v0, La/wfr0;->c:Ljava/lang/String;

    .line 252
    .line 253
    iget-object v4, v2, La/y3v;->c:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v4, Ljava/util/ArrayDeque;

    .line 256
    .line 257
    monitor-enter v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 258
    :try_start_3
    iget-object v5, v2, La/y3v;->c:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v5, Ljava/util/ArrayDeque;

    .line 261
    .line 262
    invoke-virtual {v5, v3}, Ljava/util/ArrayDeque;->remove(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-eqz v3, :cond_6

    .line 267
    .line 268
    iget-object v3, v2, La/y3v;->d:Ljava/lang/Object;

    .line 269
    .line 270
    check-cast v3, Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 271
    .line 272
    new-instance v5, La/apj0;

    .line 273
    .line 274
    invoke-direct {v5, v2, v8}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v3, v5}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 278
    .line 279
    .line 280
    :cond_6
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 281
    monitor-exit v1

    .line 282
    iget-object v2, p0, La/zfr0;->d:La/gx3;

    .line 283
    .line 284
    monitor-enter v2

    .line 285
    :try_start_4
    iget-object v0, v0, La/wfr0;->c:Ljava/lang/String;

    .line 286
    .line 287
    iget-object v1, p0, La/zfr0;->d:La/gx3;

    .line 288
    .line 289
    invoke-virtual {v1, v0}, La/nuj0;->containsKey(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    if-nez v1, :cond_7

    .line 294
    .line 295
    monitor-exit v2

    .line 296
    goto/16 :goto_0

    .line 297
    .line 298
    :catchall_1
    move-exception p0

    .line 299
    goto :goto_4

    .line 300
    :cond_7
    iget-object v1, p0, La/zfr0;->d:La/gx3;

    .line 301
    .line 302
    invoke-virtual {v1, v0}, La/nuj0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    move-result-object v1

    .line 306
    check-cast v1, Ljava/util/ArrayDeque;

    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v3

    .line 312
    check-cast v3, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 313
    .line 314
    if-eqz v3, :cond_8

    .line 315
    .line 316
    const/4 v4, 0x0

    .line 317
    invoke-virtual {v3, v4}, Lcom/google/android/gms/tasks/TaskCompletionSource;->setResult(Ljava/lang/Object;)V

    .line 318
    .line 319
    .line 320
    :cond_8
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 321
    .line 322
    .line 323
    move-result v1

    .line 324
    if-eqz v1, :cond_9

    .line 325
    .line 326
    iget-object v1, p0, La/zfr0;->d:La/gx3;

    .line 327
    .line 328
    invoke-virtual {v1, v0}, La/nuj0;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    :cond_9
    monitor-exit v2

    .line 332
    goto/16 :goto_0

    .line 333
    .line 334
    :goto_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 335
    throw p0

    .line 336
    :catchall_2
    move-exception p0

    .line 337
    :try_start_5
    monitor-exit v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 338
    :try_start_6
    throw p0

    .line 339
    :catchall_3
    move-exception p0

    .line 340
    monitor-exit v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 341
    throw p0

    .line 342
    :goto_5
    const-string v0, "SERVICE_NOT_AVAILABLE"

    .line 343
    .line 344
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    if-nez v0, :cond_c

    .line 353
    .line 354
    const-string v0, "INTERNAL_SERVER_ERROR"

    .line 355
    .line 356
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v0

    .line 364
    if-eqz v0, :cond_a

    .line 365
    .line 366
    goto :goto_6

    .line 367
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    if-nez v0, :cond_b

    .line 372
    .line 373
    const-string p0, "Topic operation failed without exception message. Will retry Topic operation."

    .line 374
    .line 375
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 376
    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_b
    throw p0

    .line 380
    :cond_c
    :goto_6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 381
    .line 382
    const-string v1, "Topic operation failed: "

    .line 383
    .line 384
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object p0

    .line 391
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 392
    .line 393
    .line 394
    const-string p0, ". Will retry Topic operation."

    .line 395
    .line 396
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 404
    .line 405
    .line 406
    :goto_7
    return v8

    .line 407
    :goto_8
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 408
    throw v0
.end method

.method public final c(J)V
    .locals 10

    .line 1
    const-wide/16 v0, 0x2

    .line 2
    .line 3
    mul-long/2addr v0, p1

    .line 4
    const-wide/16 v2, 0x1e

    .line 5
    .line 6
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 7
    .line 8
    .line 9
    move-result-wide v0

    .line 10
    const-wide/16 v2, 0x7080

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 13
    .line 14
    .line 15
    move-result-wide v8

    .line 16
    new-instance v4, La/bgr0;

    .line 17
    .line 18
    iget-object v6, p0, La/zfr0;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v7, p0, La/zfr0;->b:La/fd40;

    .line 21
    .line 22
    move-object v5, p0

    .line 23
    invoke-direct/range {v4 .. v9}, La/bgr0;-><init>(La/zfr0;Landroid/content/Context;La/fd40;J)V

    .line 24
    .line 25
    .line 26
    iget-object p0, v5, La/zfr0;->e:Ljava/util/concurrent/ScheduledThreadPoolExecutor;

    .line 27
    .line 28
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 29
    .line 30
    invoke-virtual {p0, v4, p1, p2, v0}, Ljava/util/concurrent/ScheduledThreadPoolExecutor;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 31
    .line 32
    .line 33
    const/4 p0, 0x1

    .line 34
    invoke-virtual {v5, p0}, La/zfr0;->a(Z)V

    .line 35
    .line 36
    .line 37
    return-void
.end method
