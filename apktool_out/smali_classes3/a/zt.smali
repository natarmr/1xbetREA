.class public final synthetic La/zt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;JB)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zt;->a:B

    iput-object p1, p0, La/zt;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/zt;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 11

    .line 1
    iget-byte v0, p0, La/zt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, La/w5z;

    .line 12
    .line 13
    iget-wide v1, p0, La/zt;->b:J

    .line 14
    .line 15
    sget-object p0, La/fzs0;->c:La/c0o;

    .line 16
    .line 17
    invoke-virtual {p0}, La/b3;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    check-cast v4, La/fzs0;

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4}, La/fzs0;->b()I

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    mul-int/lit16 v5, v5, 0xe10

    .line 41
    .line 42
    int-to-long v5, v5

    .line 43
    const-wide/16 v7, 0x3e8

    .line 44
    .line 45
    mul-long/2addr v5, v7

    .line 46
    add-long/2addr v5, v1

    .line 47
    iget-object v7, v0, La/w5z;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, La/on4;

    .line 50
    .line 51
    invoke-virtual {v7, v4, v5, v6}, La/on4;->d(La/fzs0;J)V

    .line 52
    .line 53
    .line 54
    iget-object v5, v0, La/w5z;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v5, La/gst0;

    .line 57
    .line 58
    new-instance v6, La/mn4;

    .line 59
    .line 60
    invoke-virtual {v4}, La/fzs0;->b()I

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    invoke-direct {v6, v4, v3}, La/mn4;-><init>(IZ)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v5, v6}, La/gst0;->g(La/mn4;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_0
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast v0, La/oif0;

    .line 77
    .line 78
    iget-wide v1, p0, La/zt;->b:J

    .line 79
    .line 80
    iget-object p0, v0, La/oif0;->b:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast p0, La/y3v;

    .line 83
    .line 84
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p0, La/y9n0;

    .line 87
    .line 88
    iget-object v0, p0, La/y9n0;->a:La/p7m0;

    .line 89
    .line 90
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    move-object v3, p0

    .line 95
    check-cast v3, Ljava/util/Set;

    .line 96
    .line 97
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-static {v3, v4}, La/eui0;->e(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-virtual {v0, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    if-eqz p0, :cond_1

    .line 110
    .line 111
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_1
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/lhf0;

    .line 117
    .line 118
    iget-wide v3, p0, La/zt;->b:J

    .line 119
    .line 120
    iget-object p0, v0, La/lhf0;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast p0, La/m0o0;

    .line 123
    .line 124
    iget-object p0, p0, La/m0o0;->b:La/abp;

    .line 125
    .line 126
    iget-object v0, p0, La/abp;->b:La/p7m0;

    .line 127
    .line 128
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    move-object v1, p0

    .line 133
    check-cast v1, La/kap;

    .line 134
    .line 135
    invoke-static {v1}, La/abp;->e(La/kap;)Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object v1

    .line 139
    new-instance v2, Ljava/util/ArrayList;

    .line 140
    .line 141
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 142
    .line 143
    .line 144
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v1

    .line 148
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-eqz v5, :cond_4

    .line 153
    .line 154
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    move-object v6, v5

    .line 159
    check-cast v6, La/k8p;

    .line 160
    .line 161
    iget-wide v6, v6, La/k8p;->a:J

    .line 162
    .line 163
    cmp-long v6, v6, v3

    .line 164
    .line 165
    if-eqz v6, :cond_3

    .line 166
    .line 167
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_4
    new-instance v1, La/iap;

    .line 172
    .line 173
    invoke-direct {v1, v2}, La/iap;-><init>(Ljava/lang/Object;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0, p0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result p0

    .line 180
    if-eqz p0, :cond_2

    .line 181
    .line 182
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 183
    .line 184
    return-object p0

    .line 185
    :pswitch_2
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 186
    .line 187
    move-object v3, v0

    .line 188
    check-cast v3, Lokhttp3/internal/ws/RealWebSocket;

    .line 189
    .line 190
    iget-wide v4, p0, La/zt;->b:J

    .line 191
    .line 192
    sget-object p0, Lokhttp3/internal/ws/RealWebSocket;->x:Ljava/util/List;

    .line 193
    .line 194
    monitor-enter v3

    .line 195
    :try_start_0
    iget-boolean p0, v3, Lokhttp3/internal/ws/RealWebSocket;->u:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 196
    .line 197
    if-eqz p0, :cond_5

    .line 198
    .line 199
    :goto_2
    monitor-exit v3

    .line 200
    goto :goto_4

    .line 201
    :cond_5
    :try_start_1
    iget-object p0, v3, Lokhttp3/internal/ws/RealWebSocket;->k:Lokhttp3/internal/ws/WebSocketWriter;

    .line 202
    .line 203
    if-nez p0, :cond_6

    .line 204
    .line 205
    goto :goto_2

    .line 206
    :cond_6
    iget-boolean v0, v3, Lokhttp3/internal/ws/RealWebSocket;->w:Z

    .line 207
    .line 208
    const/4 v6, -0x1

    .line 209
    if-eqz v0, :cond_7

    .line 210
    .line 211
    iget v0, v3, Lokhttp3/internal/ws/RealWebSocket;->v:I

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :catchall_0
    move-exception v0

    .line 215
    move-object p0, v0

    .line 216
    goto :goto_5

    .line 217
    :cond_7
    move v0, v6

    .line 218
    :goto_3
    iget v7, v3, Lokhttp3/internal/ws/RealWebSocket;->v:I

    .line 219
    .line 220
    add-int/2addr v7, v1

    .line 221
    iput v7, v3, Lokhttp3/internal/ws/RealWebSocket;->v:I

    .line 222
    .line 223
    iput-boolean v1, v3, Lokhttp3/internal/ws/RealWebSocket;->w:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 224
    .line 225
    monitor-exit v3

    .line 226
    const/4 v7, 0x2

    .line 227
    if-eq v0, v6, :cond_8

    .line 228
    .line 229
    new-instance p0, Ljava/net/SocketTimeoutException;

    .line 230
    .line 231
    new-instance v6, Ljava/lang/StringBuilder;

    .line 232
    .line 233
    const-string v8, "sent ping but didn\'t receive pong within "

    .line 234
    .line 235
    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    iget-wide v8, v3, Lokhttp3/internal/ws/RealWebSocket;->c:J

    .line 239
    .line 240
    invoke-virtual {v6, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    const-string v8, "ms (after "

    .line 244
    .line 245
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 246
    .line 247
    .line 248
    sub-int/2addr v0, v1

    .line 249
    const-string v1, " successful ping/pongs)"

    .line 250
    .line 251
    invoke-static {v0, v1, v6}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    invoke-direct {p0, v0}, Ljava/net/SocketTimeoutException;-><init>(Ljava/lang/String;)V

    .line 256
    .line 257
    .line 258
    invoke-static {v3, p0, v2, v7}, Lokhttp3/internal/ws/RealWebSocket;->j(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/Exception;Lokhttp3/Response;I)V

    .line 259
    .line 260
    .line 261
    goto :goto_4

    .line 262
    :cond_8
    :try_start_2
    sget-object v0, La/qg9;->d:La/qg9;

    .line 263
    .line 264
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 265
    .line 266
    .line 267
    const/16 v1, 0x9

    .line 268
    .line 269
    invoke-virtual {p0, v1, v0}, Lokhttp3/internal/ws/WebSocketWriter;->a(ILa/qg9;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 270
    .line 271
    .line 272
    goto :goto_4

    .line 273
    :catch_0
    move-exception v0

    .line 274
    move-object p0, v0

    .line 275
    invoke-static {v3, p0, v2, v7}, Lokhttp3/internal/ws/RealWebSocket;->j(Lokhttp3/internal/ws/RealWebSocket;Ljava/lang/Exception;Lokhttp3/Response;I)V

    .line 276
    .line 277
    .line 278
    :goto_4
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 279
    .line 280
    .line 281
    move-result-object p0

    .line 282
    return-object p0

    .line 283
    :goto_5
    monitor-exit v3

    .line 284
    throw p0

    .line 285
    :pswitch_3
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 286
    .line 287
    move-object v4, v0

    .line 288
    check-cast v4, Lokhttp3/internal/http2/Http2Connection;

    .line 289
    .line 290
    iget-wide v5, p0, La/zt;->b:J

    .line 291
    .line 292
    sget-object p0, Lokhttp3/internal/http2/Http2Connection;->A:Lokhttp3/internal/http2/Settings;

    .line 293
    .line 294
    monitor-enter v4

    .line 295
    :try_start_3
    iget-wide v7, v4, Lokhttp3/internal/http2/Http2Connection;->m:J

    .line 296
    .line 297
    iget-wide v9, v4, Lokhttp3/internal/http2/Http2Connection;->l:J

    .line 298
    .line 299
    cmp-long p0, v7, v9

    .line 300
    .line 301
    if-gez p0, :cond_9

    .line 302
    .line 303
    move p0, v1

    .line 304
    goto :goto_6

    .line 305
    :cond_9
    const-wide/16 v7, 0x1

    .line 306
    .line 307
    add-long/2addr v9, v7

    .line 308
    iput-wide v9, v4, Lokhttp3/internal/http2/Http2Connection;->l:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 309
    .line 310
    move p0, v3

    .line 311
    :goto_6
    monitor-exit v4

    .line 312
    if-eqz p0, :cond_a

    .line 313
    .line 314
    sget-object p0, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 315
    .line 316
    invoke-virtual {v4, p0, p0, v2}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 317
    .line 318
    .line 319
    const-wide/16 v5, -0x1

    .line 320
    .line 321
    goto :goto_7

    .line 322
    :cond_a
    :try_start_4
    iget-object p0, v4, Lokhttp3/internal/http2/Http2Connection;->x:Lokhttp3/internal/http2/Http2Writer;

    .line 323
    .line 324
    invoke-virtual {p0, v1, v3, v3}, Lokhttp3/internal/http2/Http2Writer;->l(IIZ)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1

    .line 325
    .line 326
    .line 327
    goto :goto_7

    .line 328
    :catch_1
    move-exception v0

    .line 329
    move-object p0, v0

    .line 330
    sget-object v0, Lokhttp3/internal/http2/ErrorCode;->d:Lokhttp3/internal/http2/ErrorCode;

    .line 331
    .line 332
    invoke-virtual {v4, v0, v0, p0}, Lokhttp3/internal/http2/Http2Connection;->a(Lokhttp3/internal/http2/ErrorCode;Lokhttp3/internal/http2/ErrorCode;Ljava/io/IOException;)V

    .line 333
    .line 334
    .line 335
    :goto_7
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 336
    .line 337
    .line 338
    move-result-object p0

    .line 339
    return-object p0

    .line 340
    :catchall_1
    move-exception v0

    .line 341
    move-object p0, v0

    .line 342
    monitor-exit v4

    .line 343
    throw p0

    .line 344
    :pswitch_4
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 345
    .line 346
    check-cast v0, La/vzg0;

    .line 347
    .line 348
    iget-wide v1, p0, La/zt;->b:J

    .line 349
    .line 350
    new-instance v3, La/cs9;

    .line 351
    .line 352
    sget-object v4, La/iun;->a:La/iun;

    .line 353
    .line 354
    sget-object v5, La/bs9;->a:La/bs9;

    .line 355
    .line 356
    const-string p0, "ANIMATED_ITEM_SAVED_KEY"

    .line 357
    .line 358
    invoke-virtual {v0, p0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    check-cast p0, Ljava/lang/Long;

    .line 363
    .line 364
    if-eqz p0, :cond_b

    .line 365
    .line 366
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 367
    .line 368
    .line 369
    move-result-wide v1

    .line 370
    :cond_b
    move-wide v7, v1

    .line 371
    const/4 v9, 0x0

    .line 372
    const/4 v6, 0x0

    .line 373
    invoke-direct/range {v3 .. v9}, La/cs9;-><init>(Ljava/util/List;La/bs9;ZJLa/sp9;)V

    .line 374
    .line 375
    .line 376
    return-object v3

    .line 377
    :pswitch_5
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 378
    .line 379
    check-cast v0, La/uwe;

    .line 380
    .line 381
    iget-wide v1, p0, La/zt;->b:J

    .line 382
    .line 383
    new-instance p0, La/lc9;

    .line 384
    .line 385
    invoke-direct {p0, v1, v2}, La/lc9;-><init>(J)V

    .line 386
    .line 387
    .line 388
    invoke-virtual {v0, p0}, La/uwe;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 392
    .line 393
    return-object p0

    .line 394
    :pswitch_6
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 395
    .line 396
    check-cast v0, La/vz40;

    .line 397
    .line 398
    iget-wide v1, p0, La/zt;->b:J

    .line 399
    .line 400
    invoke-static {v1, v2}, La/m5k0;->a(J)La/t33;

    .line 401
    .line 402
    .line 403
    move-result-object p0

    .line 404
    iput-object p0, v0, La/vz40;->a:Ljava/lang/Object;

    .line 405
    .line 406
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 407
    .line 408
    return-object p0

    .line 409
    :pswitch_7
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 410
    .line 411
    check-cast v0, La/t89;

    .line 412
    .line 413
    iget-wide v1, p0, La/zt;->b:J

    .line 414
    .line 415
    check-cast v0, La/ijj0;

    .line 416
    .line 417
    invoke-virtual {v0, v1, v2}, La/ijj0;->b(J)Landroid/graphics/Shader;

    .line 418
    .line 419
    .line 420
    move-result-object p0

    .line 421
    return-object p0

    .line 422
    :pswitch_8
    iget-object v0, p0, La/zt;->c:Ljava/lang/Object;

    .line 423
    .line 424
    check-cast v0, La/cu;

    .line 425
    .line 426
    iget-wide v1, p0, La/zt;->b:J

    .line 427
    .line 428
    iget-object p0, v0, La/cu;->c:Ljava/lang/Object;

    .line 429
    .line 430
    check-cast p0, La/y3v;

    .line 431
    .line 432
    iget-object p0, p0, La/y3v;->b:Ljava/lang/Object;

    .line 433
    .line 434
    check-cast p0, La/y9n0;

    .line 435
    .line 436
    iget-object p0, p0, La/y9n0;->a:La/p7m0;

    .line 437
    .line 438
    :cond_c
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object v0

    .line 442
    move-object v3, v0

    .line 443
    check-cast v3, Ljava/util/Set;

    .line 444
    .line 445
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 446
    .line 447
    .line 448
    move-result-object v4

    .line 449
    invoke-static {v3, v4}, La/eui0;->h(Ljava/util/Set;Ljava/lang/Object;)Ljava/util/LinkedHashSet;

    .line 450
    .line 451
    .line 452
    move-result-object v3

    .line 453
    invoke-virtual {p0, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 454
    .line 455
    .line 456
    move-result v0

    .line 457
    if-eqz v0, :cond_c

    .line 458
    .line 459
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 460
    .line 461
    return-object p0

    .line 462
    nop

    .line 463
    :pswitch_data_0
    .packed-switch 0x0
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
