.class public final La/mz4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mz4;->a:B

    iput-object p1, p0, La/mz4;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/mz4;->a:B

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v2, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget v2, v1, Landroid/os/Message;->what:I

    .line 16
    .line 17
    const-string v8, "Timeout waiting for ServiceConnection callback "

    .line 18
    .line 19
    if-eqz v2, :cond_4

    .line 20
    .line 21
    if-eq v2, v6, :cond_0

    .line 22
    .line 23
    move v6, v7

    .line 24
    goto/16 :goto_3

    .line 25
    .line 26
    :cond_0
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, La/d7x0;

    .line 29
    .line 30
    iget-object v2, v0, La/d7x0;->a:Ljava/util/HashMap;

    .line 31
    .line 32
    monitor-enter v2

    .line 33
    :try_start_0
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast v1, La/m3x0;

    .line 36
    .line 37
    iget-object v0, v0, La/d7x0;->a:Ljava/util/HashMap;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/t4x0;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-byte v3, v0, La/t4x0;->b:B

    .line 48
    .line 49
    if-ne v3, v4, :cond_3

    .line 50
    .line 51
    const-string v3, "GmsClientSupervisor"

    .line 52
    .line 53
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    add-int/lit8 v7, v7, 0x2f

    .line 62
    .line 63
    new-instance v9, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v9, v7}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v7, Ljava/lang/Exception;

    .line 79
    .line 80
    invoke-direct {v7}, Ljava/lang/Exception;-><init>()V

    .line 81
    .line 82
    .line 83
    invoke-static {v3, v4, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 84
    .line 85
    .line 86
    iget-object v3, v0, La/t4x0;->f:Landroid/content/ComponentName;

    .line 87
    .line 88
    if-nez v3, :cond_1

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :catchall_0
    move-exception v0

    .line 95
    goto :goto_1

    .line 96
    :cond_1
    move-object v5, v3

    .line 97
    :goto_0
    if-nez v5, :cond_2

    .line 98
    .line 99
    new-instance v5, Landroid/content/ComponentName;

    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    const-string v1, "com.google.android.gms"

    .line 105
    .line 106
    const-string v3, "unknown"

    .line 107
    .line 108
    invoke-direct {v5, v1, v3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    :cond_2
    invoke-virtual {v0, v5}, La/t4x0;->onServiceDisconnected(Landroid/content/ComponentName;)V

    .line 112
    .line 113
    .line 114
    :cond_3
    monitor-exit v2

    .line 115
    goto :goto_3

    .line 116
    :goto_1
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 117
    throw v0

    .line 118
    :cond_4
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 119
    .line 120
    check-cast v0, La/d7x0;

    .line 121
    .line 122
    iget-object v2, v0, La/d7x0;->a:Ljava/util/HashMap;

    .line 123
    .line 124
    monitor-enter v2

    .line 125
    :try_start_1
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, La/m3x0;

    .line 128
    .line 129
    iget-object v4, v0, La/d7x0;->a:Ljava/util/HashMap;

    .line 130
    .line 131
    invoke-virtual {v4, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    check-cast v4, La/t4x0;

    .line 136
    .line 137
    if-eqz v4, :cond_6

    .line 138
    .line 139
    iget-object v5, v4, La/t4x0;->a:Ljava/util/HashMap;

    .line 140
    .line 141
    invoke-virtual {v5}, Ljava/util/HashMap;->isEmpty()Z

    .line 142
    .line 143
    .line 144
    move-result v5

    .line 145
    if-eqz v5, :cond_6

    .line 146
    .line 147
    iget-boolean v5, v4, La/t4x0;->c:Z

    .line 148
    .line 149
    if-eqz v5, :cond_5

    .line 150
    .line 151
    iget-object v5, v4, La/t4x0;->e:La/m3x0;

    .line 152
    .line 153
    iget-object v8, v4, La/t4x0;->g:La/d7x0;

    .line 154
    .line 155
    iget-object v9, v8, La/d7x0;->c:La/jaw0;

    .line 156
    .line 157
    invoke-virtual {v9, v6, v5}, Landroid/os/Handler;->removeMessages(ILjava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    iget-object v5, v8, La/d7x0;->d:La/bbw0;

    .line 161
    .line 162
    iget-object v8, v8, La/d7x0;->b:Landroid/content/Context;

    .line 163
    .line 164
    invoke-virtual {v5, v8, v4}, La/bbw0;->s(Landroid/content/Context;Landroid/content/ServiceConnection;)V

    .line 165
    .line 166
    .line 167
    iput-boolean v7, v4, La/t4x0;->c:Z

    .line 168
    .line 169
    iput-byte v3, v4, La/t4x0;->b:B

    .line 170
    .line 171
    :cond_5
    iget-object v0, v0, La/d7x0;->a:Ljava/util/HashMap;

    .line 172
    .line 173
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    goto :goto_2

    .line 177
    :catchall_1
    move-exception v0

    .line 178
    goto :goto_4

    .line 179
    :cond_6
    :goto_2
    monitor-exit v2

    .line 180
    :goto_3
    return v6

    .line 181
    :goto_4
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 182
    throw v0

    .line 183
    :pswitch_0
    const-string v2, "MessengerIpcClient"

    .line 184
    .line 185
    const-string v3, "Received response for unknown request: "

    .line 186
    .line 187
    iget v8, v1, Landroid/os/Message;->arg1:I

    .line 188
    .line 189
    invoke-static {v2, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 190
    .line 191
    .line 192
    move-result v2

    .line 193
    if-eqz v2, :cond_7

    .line 194
    .line 195
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 200
    .line 201
    .line 202
    move-result v2

    .line 203
    new-instance v4, Ljava/lang/StringBuilder;

    .line 204
    .line 205
    add-int/lit8 v2, v2, 0x1e

    .line 206
    .line 207
    invoke-direct {v4, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 208
    .line 209
    .line 210
    const-string v2, "Received response to request: "

    .line 211
    .line 212
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    const-string v4, "MessengerIpcClient"

    .line 223
    .line 224
    invoke-static {v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    .line 226
    .line 227
    :cond_7
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 228
    .line 229
    move-object v2, v0

    .line 230
    check-cast v2, La/d6x0;

    .line 231
    .line 232
    monitor-enter v2

    .line 233
    :try_start_2
    iget-object v0, v2, La/d6x0;->e:Landroid/util/SparseArray;

    .line 234
    .line 235
    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, La/f8x0;

    .line 240
    .line 241
    if-nez v4, :cond_8

    .line 242
    .line 243
    const-string v0, "MessengerIpcClient"

    .line 244
    .line 245
    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    add-int/lit8 v1, v1, 0x27

    .line 254
    .line 255
    new-instance v4, Ljava/lang/StringBuilder;

    .line 256
    .line 257
    invoke-direct {v4, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 261
    .line 262
    .line 263
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 264
    .line 265
    .line 266
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v1

    .line 270
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 271
    .line 272
    .line 273
    monitor-exit v2

    .line 274
    goto :goto_5

    .line 275
    :catchall_2
    move-exception v0

    .line 276
    goto :goto_6

    .line 277
    :cond_8
    invoke-virtual {v0, v8}, Landroid/util/SparseArray;->remove(I)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v2}, La/d6x0;->d()V

    .line 281
    .line 282
    .line 283
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 284
    invoke-virtual {v1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    const-string v1, "unsupported"

    .line 289
    .line 290
    invoke-virtual {v0, v1, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 291
    .line 292
    .line 293
    move-result v1

    .line 294
    const/16 v2, 0x14

    .line 295
    .line 296
    if-eqz v1, :cond_9

    .line 297
    .line 298
    const-string v0, "Not supported by GmsCore"

    .line 299
    .line 300
    new-instance v1, La/c44;

    .line 301
    .line 302
    invoke-direct {v1, v0, v5, v2}, La/c44;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v4, v1}, La/f8x0;->c(La/c44;)V

    .line 306
    .line 307
    .line 308
    goto :goto_5

    .line 309
    :cond_9
    iget-byte v1, v4, La/f8x0;->e:B

    .line 310
    .line 311
    packed-switch v1, :pswitch_data_1

    .line 312
    .line 313
    .line 314
    const-string v1, "data"

    .line 315
    .line 316
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-nez v0, :cond_a

    .line 321
    .line 322
    sget-object v0, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 323
    .line 324
    :cond_a
    invoke-virtual {v4, v0}, La/f8x0;->b(Landroid/os/Bundle;)V

    .line 325
    .line 326
    .line 327
    goto :goto_5

    .line 328
    :pswitch_1
    const-string v1, "ack"

    .line 329
    .line 330
    invoke-virtual {v0, v1, v7}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_b

    .line 335
    .line 336
    invoke-virtual {v4, v5}, La/f8x0;->b(Landroid/os/Bundle;)V

    .line 337
    .line 338
    .line 339
    goto :goto_5

    .line 340
    :cond_b
    const-string v0, "Invalid response to one way request"

    .line 341
    .line 342
    new-instance v1, La/c44;

    .line 343
    .line 344
    invoke-direct {v1, v0, v5, v2}, La/c44;-><init>(Ljava/lang/String;Ljava/lang/Throwable;B)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v4, v1}, La/f8x0;->c(La/c44;)V

    .line 348
    .line 349
    .line 350
    :goto_5
    return v6

    .line 351
    :goto_6
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 352
    throw v0

    .line 353
    :pswitch_2
    iget v2, v1, Landroid/os/Message;->what:I

    .line 354
    .line 355
    if-eqz v2, :cond_c

    .line 356
    .line 357
    move v6, v7

    .line 358
    goto :goto_7

    .line 359
    :cond_c
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/n660;

    .line 362
    .line 363
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 364
    .line 365
    check-cast v1, La/sdk0;

    .line 366
    .line 367
    iget-object v2, v0, La/n660;->a:Ljava/lang/Object;

    .line 368
    .line 369
    monitor-enter v2

    .line 370
    :try_start_4
    iget-object v4, v0, La/n660;->c:Ljava/lang/Object;

    .line 371
    .line 372
    check-cast v4, La/sdk0;

    .line 373
    .line 374
    if-eq v4, v1, :cond_d

    .line 375
    .line 376
    iget-object v4, v0, La/n660;->d:Ljava/lang/Object;

    .line 377
    .line 378
    check-cast v4, La/sdk0;

    .line 379
    .line 380
    if-ne v4, v1, :cond_e

    .line 381
    .line 382
    :cond_d
    invoke-virtual {v0, v1, v3}, La/n660;->c(La/sdk0;I)Z

    .line 383
    .line 384
    .line 385
    :cond_e
    monitor-exit v2

    .line 386
    :goto_7
    return v6

    .line 387
    :catchall_3
    move-exception v0

    .line 388
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 389
    throw v0

    .line 390
    :pswitch_3
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 391
    .line 392
    check-cast v0, La/jrs0;

    .line 393
    .line 394
    iget-object v2, v0, La/jrs0;->j:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v2, La/yqc;

    .line 397
    .line 398
    iget-object v3, v0, La/jrs0;->b:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v3, La/q0a;

    .line 401
    .line 402
    iget v4, v1, Landroid/os/Message;->what:I

    .line 403
    .line 404
    const v8, 0x7f0a147f

    .line 405
    .line 406
    .line 407
    if-ne v4, v8, :cond_20

    .line 408
    .line 409
    iget-object v1, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v1, La/fmk0;

    .line 412
    .line 413
    iget-object v4, v0, La/jrs0;->f:Ljava/lang/Object;

    .line 414
    .line 415
    check-cast v4, Landroid/os/Handler;

    .line 416
    .line 417
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 418
    .line 419
    .line 420
    move-result-wide v8

    .line 421
    iget-object v10, v0, La/jrs0;->g:Ljava/lang/Object;

    .line 422
    .line 423
    check-cast v10, Landroid/graphics/Rect;

    .line 424
    .line 425
    iput-object v10, v1, La/fmk0;->d:Landroid/graphics/Rect;

    .line 426
    .line 427
    iget-object v11, v1, La/fmk0;->a:La/t68;

    .line 428
    .line 429
    iget v12, v11, La/t68;->b:I

    .line 430
    .line 431
    if-nez v10, :cond_f

    .line 432
    .line 433
    move/from16 v16, v6

    .line 434
    .line 435
    goto/16 :goto_f

    .line 436
    .line 437
    :cond_f
    iget v10, v1, La/fmk0;->c:I

    .line 438
    .line 439
    iget-object v13, v11, La/t68;->a:[B

    .line 440
    .line 441
    iget v14, v11, La/t68;->c:I

    .line 442
    .line 443
    const/16 v15, 0x5a

    .line 444
    .line 445
    if-eq v10, v15, :cond_15

    .line 446
    .line 447
    const/16 v15, 0xb4

    .line 448
    .line 449
    if-eq v10, v15, :cond_13

    .line 450
    .line 451
    const/16 v15, 0x10e

    .line 452
    .line 453
    if-eq v10, v15, :cond_10

    .line 454
    .line 455
    move/from16 v16, v6

    .line 456
    .line 457
    goto :goto_d

    .line 458
    :cond_10
    new-instance v11, La/t68;

    .line 459
    .line 460
    mul-int v10, v12, v14

    .line 461
    .line 462
    new-array v15, v10, [B

    .line 463
    .line 464
    sub-int/2addr v10, v6

    .line 465
    move/from16 v16, v6

    .line 466
    .line 467
    move v6, v7

    .line 468
    :goto_8
    if-ge v6, v12, :cond_12

    .line 469
    .line 470
    add-int/lit8 v17, v14, -0x1

    .line 471
    .line 472
    :goto_9
    if-ltz v17, :cond_11

    .line 473
    .line 474
    mul-int v18, v17, v12

    .line 475
    .line 476
    add-int v18, v18, v6

    .line 477
    .line 478
    aget-byte v18, v13, v18

    .line 479
    .line 480
    aput-byte v18, v15, v10

    .line 481
    .line 482
    add-int/lit8 v10, v10, -0x1

    .line 483
    .line 484
    add-int/lit8 v17, v17, -0x1

    .line 485
    .line 486
    goto :goto_9

    .line 487
    :cond_11
    add-int/lit8 v6, v6, 0x1

    .line 488
    .line 489
    goto :goto_8

    .line 490
    :cond_12
    invoke-direct {v11, v15, v14, v12}, La/t68;-><init>([BII)V

    .line 491
    .line 492
    .line 493
    goto :goto_d

    .line 494
    :cond_13
    move/from16 v16, v6

    .line 495
    .line 496
    new-instance v11, La/t68;

    .line 497
    .line 498
    mul-int v6, v12, v14

    .line 499
    .line 500
    new-array v10, v6, [B

    .line 501
    .line 502
    add-int/lit8 v15, v6, -0x1

    .line 503
    .line 504
    :goto_a
    if-ge v7, v6, :cond_14

    .line 505
    .line 506
    aget-byte v18, v13, v7

    .line 507
    .line 508
    aput-byte v18, v10, v15

    .line 509
    .line 510
    add-int/lit8 v15, v15, -0x1

    .line 511
    .line 512
    add-int/lit8 v7, v7, 0x1

    .line 513
    .line 514
    goto :goto_a

    .line 515
    :cond_14
    invoke-direct {v11, v10, v12, v14}, La/t68;-><init>([BII)V

    .line 516
    .line 517
    .line 518
    goto :goto_d

    .line 519
    :cond_15
    move/from16 v16, v6

    .line 520
    .line 521
    new-instance v11, La/t68;

    .line 522
    .line 523
    mul-int v6, v12, v14

    .line 524
    .line 525
    new-array v6, v6, [B

    .line 526
    .line 527
    const/4 v7, 0x0

    .line 528
    const/4 v10, 0x0

    .line 529
    :goto_b
    if-ge v7, v12, :cond_17

    .line 530
    .line 531
    add-int/lit8 v15, v14, -0x1

    .line 532
    .line 533
    :goto_c
    if-ltz v15, :cond_16

    .line 534
    .line 535
    mul-int v18, v15, v12

    .line 536
    .line 537
    add-int v18, v18, v7

    .line 538
    .line 539
    aget-byte v18, v13, v18

    .line 540
    .line 541
    aput-byte v18, v6, v10

    .line 542
    .line 543
    add-int/lit8 v10, v10, 0x1

    .line 544
    .line 545
    add-int/lit8 v15, v15, -0x1

    .line 546
    .line 547
    goto :goto_c

    .line 548
    :cond_16
    add-int/lit8 v7, v7, 0x1

    .line 549
    .line 550
    goto :goto_b

    .line 551
    :cond_17
    invoke-direct {v11, v6, v14, v12}, La/t68;-><init>([BII)V

    .line 552
    .line 553
    .line 554
    :goto_d
    iget-object v6, v1, La/fmk0;->d:Landroid/graphics/Rect;

    .line 555
    .line 556
    iget-object v7, v11, La/t68;->a:[B

    .line 557
    .line 558
    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    .line 559
    .line 560
    .line 561
    move-result v10

    .line 562
    invoke-virtual {v6}, Landroid/graphics/Rect;->height()I

    .line 563
    .line 564
    .line 565
    move-result v13

    .line 566
    iget v14, v6, Landroid/graphics/Rect;->top:I

    .line 567
    .line 568
    mul-int v15, v10, v13

    .line 569
    .line 570
    new-array v15, v15, [B

    .line 571
    .line 572
    iget v11, v11, La/t68;->b:I

    .line 573
    .line 574
    mul-int/2addr v14, v11

    .line 575
    iget v6, v6, Landroid/graphics/Rect;->left:I

    .line 576
    .line 577
    add-int/2addr v14, v6

    .line 578
    const/4 v6, 0x0

    .line 579
    :goto_e
    if-ge v6, v13, :cond_18

    .line 580
    .line 581
    mul-int v5, v6, v10

    .line 582
    .line 583
    invoke-static {v7, v14, v15, v5, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 584
    .line 585
    .line 586
    add-int/2addr v14, v11

    .line 587
    add-int/lit8 v6, v6, 0x1

    .line 588
    .line 589
    const/4 v5, 0x0

    .line 590
    goto :goto_e

    .line 591
    :cond_18
    new-instance v18, La/gv90;

    .line 592
    .line 593
    move/from16 v22, v10

    .line 594
    .line 595
    move/from16 v23, v13

    .line 596
    .line 597
    move/from16 v20, v10

    .line 598
    .line 599
    move/from16 v21, v13

    .line 600
    .line 601
    move-object/from16 v19, v15

    .line 602
    .line 603
    invoke-direct/range {v18 .. v23}, La/gv90;-><init>([BIIII)V

    .line 604
    .line 605
    .line 606
    move-object/from16 v5, v18

    .line 607
    .line 608
    :goto_f
    if-eqz v5, :cond_1a

    .line 609
    .line 610
    iget-object v6, v0, La/jrs0;->e:Ljava/lang/Object;

    .line 611
    .line 612
    check-cast v6, La/qkj;

    .line 613
    .line 614
    invoke-virtual {v6, v5}, La/qkj;->b(La/gv90;)La/chf0;

    .line 615
    .line 616
    .line 617
    move-result-object v5

    .line 618
    iget-object v7, v6, La/qkj;->a:La/vv40;

    .line 619
    .line 620
    iget-object v6, v6, La/qkj;->b:Ljava/util/ArrayList;

    .line 621
    .line 622
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 623
    .line 624
    .line 625
    :try_start_5
    iget-object v6, v7, La/vv40;->b:[La/rae0;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 626
    .line 627
    if-nez v6, :cond_19

    .line 628
    .line 629
    const/4 v6, 0x0

    .line 630
    :try_start_6
    invoke-virtual {v7, v6}, La/vv40;->c(Ljava/util/Map;)V

    .line 631
    .line 632
    .line 633
    goto :goto_10

    .line 634
    :cond_19
    const/4 v6, 0x0

    .line 635
    :goto_10
    invoke-virtual {v7, v5}, La/vv40;->b(La/chf0;)La/i0g0;

    .line 636
    .line 637
    .line 638
    move-result-object v5
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    .line 639
    invoke-virtual {v7}, La/vv40;->reset()V

    .line 640
    .line 641
    .line 642
    goto :goto_12

    .line 643
    :catchall_4
    move-exception v0

    .line 644
    invoke-virtual {v7}, La/vv40;->reset()V

    .line 645
    .line 646
    .line 647
    throw v0

    .line 648
    :catch_0
    const/4 v6, 0x0

    .line 649
    :catch_1
    invoke-virtual {v7}, La/vv40;->reset()V

    .line 650
    .line 651
    .line 652
    goto :goto_11

    .line 653
    :cond_1a
    const/4 v6, 0x0

    .line 654
    :goto_11
    move-object v5, v6

    .line 655
    :goto_12
    if-eqz v5, :cond_1b

    .line 656
    .line 657
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 658
    .line 659
    .line 660
    move-result-wide v6

    .line 661
    const-string v10, "jrs0"

    .line 662
    .line 663
    new-instance v11, Ljava/lang/StringBuilder;

    .line 664
    .line 665
    const-string v13, "Found barcode in "

    .line 666
    .line 667
    invoke-direct {v11, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 668
    .line 669
    .line 670
    sub-long/2addr v6, v8

    .line 671
    invoke-virtual {v11, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 672
    .line 673
    .line 674
    const-string v6, " ms"

    .line 675
    .line 676
    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 677
    .line 678
    .line 679
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 680
    .line 681
    .line 682
    move-result-object v6

    .line 683
    invoke-static {v10, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 684
    .line 685
    .line 686
    if-eqz v4, :cond_1c

    .line 687
    .line 688
    new-instance v6, La/lu5;

    .line 689
    .line 690
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 691
    .line 692
    .line 693
    iput-object v5, v6, La/lu5;->a:La/i0g0;

    .line 694
    .line 695
    iput-object v1, v6, La/lu5;->b:La/fmk0;

    .line 696
    .line 697
    const v5, 0x7f0a1481

    .line 698
    .line 699
    .line 700
    invoke-static {v4, v5, v6}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 701
    .line 702
    .line 703
    move-result-object v5

    .line 704
    new-instance v6, Landroid/os/Bundle;

    .line 705
    .line 706
    invoke-direct {v6}, Landroid/os/Bundle;-><init>()V

    .line 707
    .line 708
    .line 709
    invoke-virtual {v5, v6}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 710
    .line 711
    .line 712
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 713
    .line 714
    .line 715
    goto :goto_13

    .line 716
    :cond_1b
    if-eqz v4, :cond_1c

    .line 717
    .line 718
    const v5, 0x7f0a1480

    .line 719
    .line 720
    .line 721
    invoke-static {v4, v5}, Landroid/os/Message;->obtain(Landroid/os/Handler;I)Landroid/os/Message;

    .line 722
    .line 723
    .line 724
    move-result-object v5

    .line 725
    invoke-virtual {v5}, Landroid/os/Message;->sendToTarget()V

    .line 726
    .line 727
    .line 728
    :cond_1c
    :goto_13
    if-eqz v4, :cond_1f

    .line 729
    .line 730
    iget-object v0, v0, La/jrs0;->e:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, La/qkj;

    .line 733
    .line 734
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 735
    .line 736
    .line 737
    new-instance v5, Ljava/util/ArrayList;

    .line 738
    .line 739
    iget-object v0, v0, La/qkj;->b:Ljava/util/ArrayList;

    .line 740
    .line 741
    invoke-direct {v5, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 742
    .line 743
    .line 744
    new-instance v0, Ljava/util/ArrayList;

    .line 745
    .line 746
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 747
    .line 748
    .line 749
    move-result v6

    .line 750
    invoke-direct {v0, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 751
    .line 752
    .line 753
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 754
    .line 755
    .line 756
    move-result-object v5

    .line 757
    :goto_14
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 758
    .line 759
    .line 760
    move-result v6

    .line 761
    if-eqz v6, :cond_1e

    .line 762
    .line 763
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v6

    .line 767
    check-cast v6, La/d3g0;

    .line 768
    .line 769
    iget v7, v6, La/d3g0;->a:F

    .line 770
    .line 771
    const/high16 v8, 0x3f800000    # 1.0f

    .line 772
    .line 773
    mul-float/2addr v7, v8

    .line 774
    iget-object v9, v1, La/fmk0;->d:Landroid/graphics/Rect;

    .line 775
    .line 776
    iget v10, v9, Landroid/graphics/Rect;->left:I

    .line 777
    .line 778
    int-to-float v10, v10

    .line 779
    add-float/2addr v7, v10

    .line 780
    iget v6, v6, La/d3g0;->b:F

    .line 781
    .line 782
    mul-float/2addr v6, v8

    .line 783
    iget v8, v9, Landroid/graphics/Rect;->top:I

    .line 784
    .line 785
    int-to-float v8, v8

    .line 786
    add-float/2addr v6, v8

    .line 787
    iget-boolean v8, v1, La/fmk0;->e:Z

    .line 788
    .line 789
    if-eqz v8, :cond_1d

    .line 790
    .line 791
    int-to-float v8, v12

    .line 792
    sub-float v7, v8, v7

    .line 793
    .line 794
    :cond_1d
    new-instance v8, La/d3g0;

    .line 795
    .line 796
    invoke-direct {v8, v7, v6}, La/d3g0;-><init>(FF)V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    goto :goto_14

    .line 803
    :cond_1e
    const v1, 0x7f0a1482

    .line 804
    .line 805
    .line 806
    invoke-static {v4, v1, v0}, Landroid/os/Message;->obtain(Landroid/os/Handler;ILjava/lang/Object;)Landroid/os/Message;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 811
    .line 812
    .line 813
    :cond_1f
    iget-object v0, v3, La/q0a;->h:Landroid/os/Handler;

    .line 814
    .line 815
    new-instance v1, La/o0a;

    .line 816
    .line 817
    const/4 v5, 0x0

    .line 818
    invoke-direct {v1, v3, v2, v5}, La/o0a;-><init>(La/q0a;La/yqc;B)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 822
    .line 823
    .line 824
    goto :goto_15

    .line 825
    :cond_20
    move/from16 v16, v6

    .line 826
    .line 827
    move v5, v7

    .line 828
    const v0, 0x7f0a1483

    .line 829
    .line 830
    .line 831
    if-ne v4, v0, :cond_21

    .line 832
    .line 833
    iget-object v0, v3, La/q0a;->h:Landroid/os/Handler;

    .line 834
    .line 835
    new-instance v1, La/o0a;

    .line 836
    .line 837
    invoke-direct {v1, v3, v2, v5}, La/o0a;-><init>(La/q0a;La/yqc;B)V

    .line 838
    .line 839
    .line 840
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 841
    .line 842
    .line 843
    :cond_21
    :goto_15
    return v16

    .line 844
    :pswitch_4
    move/from16 v16, v6

    .line 845
    .line 846
    move v5, v7

    .line 847
    iget v1, v1, Landroid/os/Message;->what:I

    .line 848
    .line 849
    iget-object v0, v0, La/mz4;->b:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v0, La/oz4;

    .line 852
    .line 853
    move/from16 v2, v16

    .line 854
    .line 855
    if-ne v1, v2, :cond_22

    .line 856
    .line 857
    invoke-virtual {v0}, La/oz4;->b()V

    .line 858
    .line 859
    .line 860
    move v6, v2

    .line 861
    goto :goto_16

    .line 862
    :cond_22
    move v6, v5

    .line 863
    :goto_16
    return v6

    .line 864
    nop

    .line 865
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
    .end packed-switch

    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method
