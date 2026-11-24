.class public final La/fju0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/d9w0;La/y78;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    iput-byte v0, p0, La/fju0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, La/fju0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    return-void
.end method

.method public constructor <init>(La/jvw0;Z)V
    .locals 0

    const/16 p2, 0x8

    iput-byte p2, p0, La/fju0;->a:B

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fju0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/m6x0;La/ilp0;)V
    .locals 0

    const/16 p2, 0xc

    iput-byte p2, p0, La/fju0;->a:B

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fju0;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/r9w0;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/fju0;->a:B

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, La/fju0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 13
    iput-byte p2, p0, La/fju0;->a:B

    iput-object p1, p0, La/fju0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 10

    .line 1
    iget-byte v0, p0, La/fju0;->a:B

    .line 2
    .line 3
    const-wide/16 v1, 0x0

    .line 4
    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x1

    .line 8
    const/4 v6, 0x0

    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, La/kxw0;

    .line 15
    .line 16
    iget-object v0, p0, La/kxw0;->i:La/x6x0;

    .line 17
    .line 18
    iget-object v1, p0, La/kxw0;->m:La/b1x0;

    .line 19
    .line 20
    invoke-static {v0}, La/kxw0;->e(La/p4;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, La/p4;->m1()V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0}, La/x6x0;->J1()J

    .line 27
    .line 28
    .line 29
    move-result-wide v4

    .line 30
    const-wide/16 v6, 0x1

    .line 31
    .line 32
    cmp-long v0, v4, v6

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    .line 36
    invoke-static {v1}, La/kxw0;->f(La/etw0;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, La/zrw0;->m1()V

    .line 40
    .line 41
    .line 42
    iget-object p0, v1, La/b1x0;->m:La/ezw0;

    .line 43
    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    invoke-virtual {p0}, La/bmw0;->c()V

    .line 47
    .line 48
    .line 49
    :cond_0
    new-instance p0, Ljava/lang/Thread;

    .line 50
    .line 51
    invoke-static {v1}, La/kxw0;->f(La/etw0;)V

    .line 52
    .line 53
    .line 54
    new-instance v0, La/dzw0;

    .line 55
    .line 56
    invoke-direct {v0, v1, v3}, La/dzw0;-><init>(La/b1x0;B)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 67
    .line 68
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 69
    .line 70
    .line 71
    iget-object p0, p0, La/uuw0;->j:La/quw0;

    .line 72
    .line 73
    const-string v0, "registerTrigger called but app not eligible"

    .line 74
    .line 75
    invoke-virtual {p0, v0}, La/quw0;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    :goto_0
    return-void

    .line 79
    :pswitch_0
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast p0, La/md3;

    .line 82
    .line 83
    iget-object p0, p0, La/md3;->b:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast p0, La/kxw0;

    .line 86
    .line 87
    iget-object v0, p0, La/kxw0;->u:La/o1x0;

    .line 88
    .line 89
    invoke-static {v0}, La/kxw0;->d(La/zrw0;)V

    .line 90
    .line 91
    .line 92
    iget-object p0, p0, La/kxw0;->u:La/o1x0;

    .line 93
    .line 94
    sget-object v0, La/btw0;->D:La/atw0;

    .line 95
    .line 96
    invoke-virtual {v0, v6}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    check-cast v0, Ljava/lang/Long;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 103
    .line 104
    .line 105
    move-result-wide v0

    .line 106
    invoke-virtual {p0, v0, v1}, La/o1x0;->p1(J)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :pswitch_1
    const-string v0, "StorageInfoHandler"

    .line 111
    .line 112
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast p0, La/fpq;

    .line 115
    .line 116
    :try_start_0
    invoke-static {p0}, La/hkb;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :catch_0
    move-exception p0

    .line 121
    invoke-static {v0, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_2

    .line 126
    .line 127
    const-string v1, "Failed to get storage info from GMS"

    .line 128
    .line 129
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 130
    .line 131
    .line 132
    :cond_2
    :goto_1
    return-void

    .line 133
    :pswitch_2
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, La/epq;

    .line 136
    .line 137
    :try_start_1
    invoke-static {p0}, La/hkb;->E(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 138
    .line 139
    .line 140
    goto :goto_2

    .line 141
    :catch_1
    move-exception p0

    .line 142
    const-string v0, "PhFlagUpdateRegistry"

    .line 143
    .line 144
    const-string v1, "Failed to register flag update listener which may lead to stale flags."

    .line 145
    .line 146
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 147
    .line 148
    .line 149
    :goto_2
    return-void

    .line 150
    :pswitch_3
    new-instance v0, Ljava/lang/RuntimeException;

    .line 151
    .line 152
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Ljava/util/concurrent/ExecutionException;

    .line 155
    .line 156
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    throw v0

    .line 164
    :pswitch_4
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 165
    .line 166
    check-cast p0, La/m6x0;

    .line 167
    .line 168
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 169
    .line 170
    .line 171
    move-result-object v0

    .line 172
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 173
    .line 174
    .line 175
    new-instance v0, La/drm0;

    .line 176
    .line 177
    invoke-direct {v0, p0}, La/drm0;-><init>(La/m6x0;)V

    .line 178
    .line 179
    .line 180
    iput-object v0, p0, La/m6x0;->k:La/drm0;

    .line 181
    .line 182
    new-instance v0, La/zlw0;

    .line 183
    .line 184
    invoke-direct {v0, p0}, La/zlw0;-><init>(La/m6x0;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0}, La/u5x0;->o1()V

    .line 188
    .line 189
    .line 190
    iput-object v0, p0, La/m6x0;->c:La/zlw0;

    .line 191
    .line 192
    iget-object v0, p0, La/m6x0;->a:La/uww0;

    .line 193
    .line 194
    invoke-virtual {p0}, La/m6x0;->e0()La/bkw0;

    .line 195
    .line 196
    .line 197
    move-result-object v3

    .line 198
    invoke-static {v0}, La/s0x;->H(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    iput-object v0, v3, La/bkw0;->e:La/rjw0;

    .line 202
    .line 203
    new-instance v0, La/d4x0;

    .line 204
    .line 205
    invoke-direct {v0, p0}, La/d4x0;-><init>(La/m6x0;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0}, La/u5x0;->o1()V

    .line 209
    .line 210
    .line 211
    iput-object v0, p0, La/m6x0;->i:La/d4x0;

    .line 212
    .line 213
    new-instance v0, La/ydw0;

    .line 214
    .line 215
    invoke-direct {v0, p0}, La/u5x0;-><init>(La/m6x0;)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, La/u5x0;->o1()V

    .line 219
    .line 220
    .line 221
    iput-object v0, p0, La/m6x0;->f:La/ydw0;

    .line 222
    .line 223
    new-instance v0, La/fvw0;

    .line 224
    .line 225
    invoke-direct {v0, p0, v5}, La/fvw0;-><init>(La/m6x0;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v0}, La/u5x0;->o1()V

    .line 229
    .line 230
    .line 231
    iput-object v0, p0, La/m6x0;->h:La/fvw0;

    .line 232
    .line 233
    new-instance v0, La/i5x0;

    .line 234
    .line 235
    invoke-direct {v0, p0}, La/i5x0;-><init>(La/m6x0;)V

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, La/u5x0;->o1()V

    .line 239
    .line 240
    .line 241
    iput-object v0, p0, La/m6x0;->e:La/i5x0;

    .line 242
    .line 243
    new-instance v0, La/jvw0;

    .line 244
    .line 245
    invoke-direct {v0, p0}, La/jvw0;-><init>(La/m6x0;)V

    .line 246
    .line 247
    .line 248
    iput-object v0, p0, La/m6x0;->d:La/jvw0;

    .line 249
    .line 250
    iget v0, p0, La/m6x0;->r:I

    .line 251
    .line 252
    iget v3, p0, La/m6x0;->s:I

    .line 253
    .line 254
    if-eq v0, v3, :cond_3

    .line 255
    .line 256
    invoke-virtual {p0}, La/m6x0;->r()La/uuw0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    iget-object v0, v0, La/uuw0;->g:La/quw0;

    .line 261
    .line 262
    iget v3, p0, La/m6x0;->r:I

    .line 263
    .line 264
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    iget v4, p0, La/m6x0;->s:I

    .line 269
    .line 270
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    const-string v7, "Not all upload components initialized"

    .line 275
    .line 276
    invoke-virtual {v0, v3, v4, v7}, La/quw0;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 277
    .line 278
    .line 279
    :cond_3
    iget-object v0, p0, La/m6x0;->m:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 280
    .line 281
    invoke-virtual {v0, v5}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {p0}, La/m6x0;->r()La/uuw0;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 289
    .line 290
    const-string v3, "UploadController is now fully initialized"

    .line 291
    .line 292
    invoke-virtual {v0, v3}, La/quw0;->a(Ljava/lang/String;)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {p0}, La/m6x0;->J()La/fxw0;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    invoke-virtual {v0}, La/fxw0;->m1()V

    .line 300
    .line 301
    .line 302
    iget-object v0, p0, La/m6x0;->c:La/zlw0;

    .line 303
    .line 304
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0}, La/zlw0;->w1()V

    .line 308
    .line 309
    .line 310
    iget-object v0, p0, La/m6x0;->c:La/zlw0;

    .line 311
    .line 312
    invoke-static {v0}, La/m6x0;->T(La/u5x0;)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, La/p4;->m1()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v0}, La/u5x0;->n1()V

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, La/zlw0;->X1()Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_5

    .line 326
    .line 327
    sget-object v3, La/btw0;->u0:La/atw0;

    .line 328
    .line 329
    invoke-virtual {v3, v6}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    check-cast v4, Ljava/lang/Long;

    .line 334
    .line 335
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 336
    .line 337
    .line 338
    move-result-wide v4

    .line 339
    cmp-long v4, v4, v1

    .line 340
    .line 341
    if-nez v4, :cond_4

    .line 342
    .line 343
    goto :goto_3

    .line 344
    :cond_4
    invoke-virtual {v0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 345
    .line 346
    .line 347
    move-result-object v4

    .line 348
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast v0, La/kxw0;

    .line 351
    .line 352
    iget-object v5, v0, La/kxw0;->k:La/lwf;

    .line 353
    .line 354
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 355
    .line 356
    .line 357
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 358
    .line 359
    .line 360
    move-result-wide v7

    .line 361
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v5

    .line 365
    invoke-virtual {v3, v6}, La/atw0;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    .line 367
    .line 368
    move-result-object v3

    .line 369
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    filled-new-array {v5, v3}, [Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v3

    .line 377
    const-string v5, "trigger_uris"

    .line 378
    .line 379
    const-string v6, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 380
    .line 381
    invoke-virtual {v4, v5, v6, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 382
    .line 383
    .line 384
    move-result v3

    .line 385
    if-lez v3, :cond_5

    .line 386
    .line 387
    iget-object v0, v0, La/kxw0;->f:La/uuw0;

    .line 388
    .line 389
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 390
    .line 391
    .line 392
    iget-object v0, v0, La/uuw0;->o:La/quw0;

    .line 393
    .line 394
    const-string v4, "Deleted stale trigger uris. rowsDeleted"

    .line 395
    .line 396
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 397
    .line 398
    .line 399
    move-result-object v3

    .line 400
    invoke-virtual {v0, v3, v4}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    :cond_5
    :goto_3
    iget-object v0, p0, La/m6x0;->i:La/d4x0;

    .line 404
    .line 405
    iget-object v0, v0, La/d4x0;->i:La/rvw0;

    .line 406
    .line 407
    invoke-virtual {v0}, La/rvw0;->a()J

    .line 408
    .line 409
    .line 410
    move-result-wide v3

    .line 411
    cmp-long v0, v3, v1

    .line 412
    .line 413
    if-nez v0, :cond_6

    .line 414
    .line 415
    iget-object v0, p0, La/m6x0;->i:La/d4x0;

    .line 416
    .line 417
    iget-object v0, v0, La/d4x0;->i:La/rvw0;

    .line 418
    .line 419
    invoke-virtual {p0}, La/m6x0;->S()La/lwf;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 427
    .line 428
    .line 429
    move-result-wide v1

    .line 430
    invoke-virtual {v0, v1, v2}, La/rvw0;->b(J)V

    .line 431
    .line 432
    .line 433
    :cond_6
    invoke-virtual {p0}, La/m6x0;->M()V

    .line 434
    .line 435
    .line 436
    return-void

    .line 437
    :pswitch_5
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 438
    .line 439
    check-cast p0, La/o4x0;

    .line 440
    .line 441
    iget-object v0, p0, La/o4x0;->c:La/afm0;

    .line 442
    .line 443
    iget-object v0, v0, La/afm0;->c:Ljava/lang/Object;

    .line 444
    .line 445
    check-cast v0, La/w4x0;

    .line 446
    .line 447
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 448
    .line 449
    .line 450
    iget-object v1, v0, La/p4;->b:Ljava/lang/Object;

    .line 451
    .line 452
    check-cast v1, La/kxw0;

    .line 453
    .line 454
    iget-object v2, v1, La/kxw0;->f:La/uuw0;

    .line 455
    .line 456
    iget-object v3, v1, La/kxw0;->a:Landroid/content/Context;

    .line 457
    .line 458
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 459
    .line 460
    .line 461
    iget-object v7, v2, La/uuw0;->n:La/quw0;

    .line 462
    .line 463
    const-string v8, "Application going to the background"

    .line 464
    .line 465
    invoke-virtual {v7, v8}, La/quw0;->a(Ljava/lang/String;)V

    .line 466
    .line 467
    .line 468
    iget-object v7, v1, La/kxw0;->e:La/wvw0;

    .line 469
    .line 470
    invoke-static {v7}, La/kxw0;->e(La/p4;)V

    .line 471
    .line 472
    .line 473
    iget-object v7, v7, La/wvw0;->t:La/mvw0;

    .line 474
    .line 475
    invoke-virtual {v7, v5}, La/mvw0;->b(Z)V

    .line 476
    .line 477
    .line 478
    invoke-virtual {v0}, La/zrw0;->m1()V

    .line 479
    .line 480
    .line 481
    iput-boolean v5, v0, La/w4x0;->e:Z

    .line 482
    .line 483
    iget-object v7, v1, La/kxw0;->d:La/bkw0;

    .line 484
    .line 485
    invoke-virtual {v7}, La/bkw0;->B1()Z

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-nez v8, :cond_7

    .line 490
    .line 491
    iget-wide v8, p0, La/o4x0;->b:J

    .line 492
    .line 493
    iget-object v0, v0, La/w4x0;->g:La/dr8;

    .line 494
    .line 495
    invoke-virtual {v0, v8, v9, v4, v4}, La/dr8;->r(JZZ)Z

    .line 496
    .line 497
    .line 498
    iget-object v0, v0, La/dr8;->c:Ljava/lang/Object;

    .line 499
    .line 500
    check-cast v0, La/q4x0;

    .line 501
    .line 502
    invoke-virtual {v0}, La/bmw0;->c()V

    .line 503
    .line 504
    .line 505
    :cond_7
    iget-wide v8, p0, La/o4x0;->a:J

    .line 506
    .line 507
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 508
    .line 509
    .line 510
    iget-object p0, v2, La/uuw0;->m:La/quw0;

    .line 511
    .line 512
    const-string v0, "Application backgrounded at: timestamp_millis"

    .line 513
    .line 514
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v4

    .line 518
    invoke-virtual {p0, v4, v0}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 519
    .line 520
    .line 521
    iget-object p0, v1, La/kxw0;->m:La/b1x0;

    .line 522
    .line 523
    invoke-static {p0}, La/kxw0;->f(La/etw0;)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 527
    .line 528
    .line 529
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 530
    .line 531
    check-cast v0, La/kxw0;

    .line 532
    .line 533
    invoke-virtual {p0}, La/etw0;->n1()V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 537
    .line 538
    .line 539
    move-result-object p0

    .line 540
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 541
    .line 542
    .line 543
    invoke-virtual {p0}, La/etw0;->n1()V

    .line 544
    .line 545
    .line 546
    invoke-virtual {p0}, La/a4x0;->s1()Z

    .line 547
    .line 548
    .line 549
    move-result v4

    .line 550
    if-nez v4, :cond_8

    .line 551
    .line 552
    goto :goto_4

    .line 553
    :cond_8
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 554
    .line 555
    check-cast p0, La/kxw0;

    .line 556
    .line 557
    iget-object p0, p0, La/kxw0;->i:La/x6x0;

    .line 558
    .line 559
    invoke-static {p0}, La/kxw0;->e(La/p4;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {p0}, La/x6x0;->X1()I

    .line 563
    .line 564
    .line 565
    move-result p0

    .line 566
    const v4, 0x3b3a8

    .line 567
    .line 568
    .line 569
    if-lt p0, v4, :cond_9

    .line 570
    .line 571
    :goto_4
    invoke-virtual {v0}, La/kxw0;->i()La/a4x0;

    .line 572
    .line 573
    .line 574
    move-result-object p0

    .line 575
    invoke-virtual {p0}, La/zrw0;->m1()V

    .line 576
    .line 577
    .line 578
    invoke-virtual {p0}, La/etw0;->n1()V

    .line 579
    .line 580
    .line 581
    invoke-virtual {p0, v5}, La/a4x0;->B1(Z)Lcom/google/android/gms/measurement/internal/zzr;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    new-instance v4, La/o2x0;

    .line 586
    .line 587
    invoke-direct {v4, p0, v0, v5}, La/o2x0;-><init>(La/a4x0;Lcom/google/android/gms/measurement/internal/zzr;B)V

    .line 588
    .line 589
    .line 590
    invoke-virtual {p0, v4}, La/a4x0;->z1(Ljava/lang/Runnable;)V

    .line 591
    .line 592
    .line 593
    :cond_9
    sget-object p0, La/btw0;->N0:La/atw0;

    .line 594
    .line 595
    invoke-virtual {v7, v6, p0}, La/bkw0;->x1(Ljava/lang/String;La/atw0;)Z

    .line 596
    .line 597
    .line 598
    move-result p0

    .line 599
    if-eqz p0, :cond_b

    .line 600
    .line 601
    iget-object p0, v1, La/kxw0;->i:La/x6x0;

    .line 602
    .line 603
    invoke-static {p0}, La/kxw0;->e(La/p4;)V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    iget-object v4, v7, La/bkw0;->d:Ljava/lang/String;

    .line 611
    .line 612
    invoke-virtual {p0, v0, v4}, La/x6x0;->R1(Ljava/lang/String;Ljava/lang/String;)Z

    .line 613
    .line 614
    .line 615
    move-result p0

    .line 616
    if-eqz p0, :cond_a

    .line 617
    .line 618
    const-wide/16 v3, 0x3e8

    .line 619
    .line 620
    goto :goto_5

    .line 621
    :cond_a
    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object p0

    .line 625
    sget-object v0, La/btw0;->E:La/atw0;

    .line 626
    .line 627
    invoke-virtual {v7, p0, v0}, La/bkw0;->u1(Ljava/lang/String;La/atw0;)J

    .line 628
    .line 629
    .line 630
    move-result-wide v3

    .line 631
    :goto_5
    invoke-static {v2}, La/kxw0;->g(La/ryw0;)V

    .line 632
    .line 633
    .line 634
    iget-object p0, v2, La/uuw0;->o:La/quw0;

    .line 635
    .line 636
    const-string v0, "[sgtm] Scheduling batch upload with minimum latency in millis"

    .line 637
    .line 638
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    invoke-virtual {p0, v2, v0}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 643
    .line 644
    .line 645
    iget-object p0, v1, La/kxw0;->u:La/o1x0;

    .line 646
    .line 647
    invoke-static {p0}, La/kxw0;->d(La/zrw0;)V

    .line 648
    .line 649
    .line 650
    iget-object p0, v1, La/kxw0;->u:La/o1x0;

    .line 651
    .line 652
    invoke-virtual {p0, v3, v4}, La/o1x0;->p1(J)V

    .line 653
    .line 654
    .line 655
    :cond_b
    return-void

    .line 656
    :pswitch_6
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 657
    .line 658
    check-cast p0, La/k3x0;

    .line 659
    .line 660
    iget-object p0, p0, La/k3x0;->c:Ljava/lang/Object;

    .line 661
    .line 662
    check-cast p0, La/t3x0;

    .line 663
    .line 664
    iget-object p0, p0, La/t3x0;->c:La/a4x0;

    .line 665
    .line 666
    iget-object v0, p0, La/p4;->b:Ljava/lang/Object;

    .line 667
    .line 668
    check-cast v0, La/kxw0;

    .line 669
    .line 670
    iget-object v0, v0, La/kxw0;->g:La/fxw0;

    .line 671
    .line 672
    invoke-static {v0}, La/kxw0;->g(La/ryw0;)V

    .line 673
    .line 674
    .line 675
    new-instance v1, La/r3x0;

    .line 676
    .line 677
    invoke-direct {v1, p0, v4}, La/r3x0;-><init>(La/a4x0;B)V

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v1}, La/fxw0;->v1(Ljava/lang/Runnable;)V

    .line 681
    .line 682
    .line 683
    return-void

    .line 684
    :pswitch_7
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 685
    .line 686
    check-cast p0, La/t3x0;

    .line 687
    .line 688
    iget-object p0, p0, La/t3x0;->c:La/a4x0;

    .line 689
    .line 690
    new-instance v0, Landroid/content/ComponentName;

    .line 691
    .line 692
    iget-object v1, p0, La/p4;->b:Ljava/lang/Object;

    .line 693
    .line 694
    check-cast v1, La/kxw0;

    .line 695
    .line 696
    iget-object v1, v1, La/kxw0;->a:Landroid/content/Context;

    .line 697
    .line 698
    const-string v2, "com.google.android.gms.measurement.AppMeasurementService"

    .line 699
    .line 700
    invoke-direct {v0, v1, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 701
    .line 702
    .line 703
    invoke-virtual {p0, v0}, La/a4x0;->w1(Landroid/content/ComponentName;)V

    .line 704
    .line 705
    .line 706
    return-void

    .line 707
    :pswitch_8
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 708
    .line 709
    check-cast p0, La/jvw0;

    .line 710
    .line 711
    iget-object p0, p0, La/jvw0;->a:La/m6x0;

    .line 712
    .line 713
    invoke-virtual {p0}, La/m6x0;->M()V

    .line 714
    .line 715
    .line 716
    return-void

    .line 717
    :pswitch_9
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 718
    .line 719
    check-cast p0, La/zlw0;

    .line 720
    .line 721
    :try_start_2
    invoke-virtual {p0}, La/zlw0;->c2()Landroid/database/sqlite/SQLiteDatabase;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    new-instance v3, Landroid/content/ContentValues;

    .line 726
    .line 727
    invoke-direct {v3}, Landroid/content/ContentValues;-><init>()V

    .line 728
    .line 729
    .line 730
    const-string v4, "elapsed_time"

    .line 731
    .line 732
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-virtual {v3, v4, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 737
    .line 738
    .line 739
    const-string v1, "raw_events"

    .line 740
    .line 741
    invoke-virtual {v0, v1, v3, v6, v6}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I
    :try_end_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_2 .. :try_end_2} :catch_2

    .line 742
    .line 743
    .line 744
    goto :goto_6

    .line 745
    :catch_2
    move-exception v0

    .line 746
    iget-object p0, p0, La/p4;->b:Ljava/lang/Object;

    .line 747
    .line 748
    check-cast p0, La/kxw0;

    .line 749
    .line 750
    iget-object p0, p0, La/kxw0;->f:La/uuw0;

    .line 751
    .line 752
    invoke-static {p0}, La/kxw0;->g(La/ryw0;)V

    .line 753
    .line 754
    .line 755
    iget-object p0, p0, La/uuw0;->g:La/quw0;

    .line 756
    .line 757
    const-string v1, "Failed to remove elapsed times from raw events table"

    .line 758
    .line 759
    invoke-virtual {p0, v0, v1}, La/quw0;->b(Ljava/lang/Object;Ljava/lang/String;)V

    .line 760
    .line 761
    .line 762
    :goto_6
    return-void

    .line 763
    :pswitch_a
    new-instance v0, Ljava/io/IOException;

    .line 764
    .line 765
    const-string v1, "TIMEOUT"

    .line 766
    .line 767
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 768
    .line 769
    .line 770
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 771
    .line 772
    check-cast p0, Lcom/google/android/gms/tasks/TaskCompletionSource;

    .line 773
    .line 774
    invoke-virtual {p0, v0}, Lcom/google/android/gms/tasks/TaskCompletionSource;->trySetException(Ljava/lang/Exception;)Z

    .line 775
    .line 776
    .line 777
    move-result p0

    .line 778
    if-eqz p0, :cond_c

    .line 779
    .line 780
    const-string p0, "Rpc"

    .line 781
    .line 782
    const-string v0, "No response"

    .line 783
    .line 784
    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 785
    .line 786
    .line 787
    :cond_c
    return-void

    .line 788
    :pswitch_b
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 789
    .line 790
    check-cast p0, La/pvu0;

    .line 791
    .line 792
    iget-object v0, p0, La/pvu0;->a:Ljava/lang/Object;

    .line 793
    .line 794
    monitor-enter v0

    .line 795
    :try_start_3
    invoke-virtual {p0}, La/pvu0;->b()Z

    .line 796
    .line 797
    .line 798
    move-result v1

    .line 799
    if-nez v1, :cond_d

    .line 800
    .line 801
    monitor-exit v0

    .line 802
    goto :goto_7

    .line 803
    :catchall_0
    move-exception p0

    .line 804
    goto :goto_8

    .line 805
    :cond_d
    const-string v1, "WakeLock"

    .line 806
    .line 807
    iget-object v2, p0, La/pvu0;->j:Ljava/lang/String;

    .line 808
    .line 809
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 810
    .line 811
    .line 812
    move-result-object v2

    .line 813
    const-string v3, " ** IS FORCE-RELEASED ON TIMEOUT **"

    .line 814
    .line 815
    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 816
    .line 817
    .line 818
    move-result-object v2

    .line 819
    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 820
    .line 821
    .line 822
    invoke-virtual {p0}, La/pvu0;->d()V

    .line 823
    .line 824
    .line 825
    invoke-virtual {p0}, La/pvu0;->b()Z

    .line 826
    .line 827
    .line 828
    move-result v1

    .line 829
    if-nez v1, :cond_e

    .line 830
    .line 831
    monitor-exit v0

    .line 832
    goto :goto_7

    .line 833
    :cond_e
    iput v5, p0, La/pvu0;->c:I

    .line 834
    .line 835
    invoke-virtual {p0}, La/pvu0;->e()V

    .line 836
    .line 837
    .line 838
    monitor-exit v0

    .line 839
    :goto_7
    return-void

    .line 840
    :goto_8
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 841
    throw p0

    .line 842
    :pswitch_c
    throw v6

    .line 843
    :pswitch_d
    new-instance v0, Lcom/google/android/gms/common/ConnectionResult;

    .line 844
    .line 845
    const/4 v1, 0x4

    .line 846
    invoke-direct {v0, v1, v6, v6}, Lcom/google/android/gms/common/ConnectionResult;-><init>(ILandroid/app/PendingIntent;Ljava/lang/String;)V

    .line 847
    .line 848
    .line 849
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast p0, La/r9w0;

    .line 852
    .line 853
    iget-object p0, p0, La/r9w0;->m:La/qaj;

    .line 854
    .line 855
    invoke-virtual {p0, v0}, La/qaj;->l(Lcom/google/android/gms/common/ConnectionResult;)V

    .line 856
    .line 857
    .line 858
    return-void

    .line 859
    :pswitch_e
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 860
    .line 861
    check-cast p0, La/w4p0;

    .line 862
    .line 863
    iget-object p0, p0, La/w4p0;->b:Ljava/lang/Object;

    .line 864
    .line 865
    check-cast p0, La/h9w0;

    .line 866
    .line 867
    iget-object p0, p0, La/h9w0;->b:La/b9v;

    .line 868
    .line 869
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    const-string v1, " disconnecting because it was signed out."

    .line 878
    .line 879
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    check-cast p0, La/hz5;

    .line 884
    .line 885
    invoke-virtual {p0, v0}, La/hz5;->d(Ljava/lang/String;)V

    .line 886
    .line 887
    .line 888
    return-void

    .line 889
    :pswitch_f
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 890
    .line 891
    check-cast p0, La/h9w0;

    .line 892
    .line 893
    invoke-virtual {p0}, La/h9w0;->a()V

    .line 894
    .line 895
    .line 896
    return-void

    .line 897
    :pswitch_10
    iget-object p0, p0, La/fju0;->b:Ljava/lang/Object;

    .line 898
    .line 899
    check-cast p0, Landroidx/viewpager/widget/ViewPager;

    .line 900
    .line 901
    invoke-virtual {p0, v4}, Landroidx/viewpager/widget/ViewPager;->setScrollState(I)V

    .line 902
    .line 903
    .line 904
    invoke-virtual {p0}, Landroidx/viewpager/widget/ViewPager;->q()V

    .line 905
    .line 906
    .line 907
    return-void

    .line 908
    nop

    .line 909
    :pswitch_data_0
    .packed-switch 0x0
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
