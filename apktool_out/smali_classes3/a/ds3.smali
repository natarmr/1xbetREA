.class public final synthetic La/ds3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/platform/app/ApplicationLoader;


# direct methods
.method public synthetic constructor <init>(Lorg/platform/app/ApplicationLoader;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ds3;->a:B

    iput-object p1, p0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ds3;->a:B

    .line 4
    .line 5
    const/4 v2, 0x7

    .line 6
    const/4 v3, 0x5

    .line 7
    const/16 v4, 0x16

    .line 8
    .line 9
    const/16 v5, 0x14

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v7, 0x6

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v13, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 17
    .line 18
    sget-object v0, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 19
    .line 20
    iget-object v0, v13, Lorg/platform/app/ApplicationLoader;->n1:La/n0o0;

    .line 21
    .line 22
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/t5w0;

    .line 27
    .line 28
    iget-object v1, v1, La/t5w0;->c:La/n5d0;

    .line 29
    .line 30
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    move-object v11, v1

    .line 35
    check-cast v11, La/wnh0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/t5w0;

    .line 42
    .line 43
    invoke-virtual {v0}, La/t5w0;->a()La/mmy;

    .line 44
    .line 45
    .line 46
    move-result-object v12

    .line 47
    new-instance v14, La/psc;

    .line 48
    .line 49
    new-instance v0, La/ds3;

    .line 50
    .line 51
    invoke-direct {v0, v13, v7}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {v14, v0, v7}, La/psc;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance v8, La/v4w0;

    .line 64
    .line 65
    new-instance v9, La/std;

    .line 66
    .line 67
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    invoke-direct/range {v8 .. v14}, La/v4w0;-><init>(La/std;Ljava/lang/Integer;La/wnh0;La/mmy;Landroid/content/Context;La/psc;)V

    .line 75
    .line 76
    .line 77
    return-object v8

    .line 78
    :pswitch_0
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 79
    .line 80
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 81
    .line 82
    new-instance v1, La/yjh0;

    .line 83
    .line 84
    new-instance v2, La/ds3;

    .line 85
    .line 86
    invoke-direct {v2, v0, v3}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 87
    .line 88
    .line 89
    invoke-direct {v1, v2}, La/yjh0;-><init>(La/ds3;)V

    .line 90
    .line 91
    .line 92
    new-instance v0, La/t5w0;

    .line 93
    .line 94
    new-instance v2, La/kys0;

    .line 95
    .line 96
    const/16 v3, 0x13

    .line 97
    .line 98
    invoke-direct {v2, v3}, La/kys0;-><init>(B)V

    .line 99
    .line 100
    .line 101
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    invoke-direct {v0, v2, v3, v1}, La/t5w0;-><init>(La/kys0;Ljava/lang/Integer;La/yjh0;)V

    .line 106
    .line 107
    .line 108
    return-object v0

    .line 109
    :pswitch_1
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 110
    .line 111
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 112
    .line 113
    new-instance v1, La/jvq;

    .line 114
    .line 115
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->t1:La/n0o0;

    .line 116
    .line 117
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    check-cast v0, La/us00;

    .line 122
    .line 123
    invoke-direct {v1, v0}, La/jvq;-><init>(La/us00;)V

    .line 124
    .line 125
    .line 126
    return-object v1

    .line 127
    :pswitch_2
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 128
    .line 129
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 130
    .line 131
    new-instance v1, La/js3;

    .line 132
    .line 133
    invoke-direct {v1, v0}, La/js3;-><init>(Lorg/platform/app/ApplicationLoader;)V

    .line 134
    .line 135
    .line 136
    return-object v1

    .line 137
    :pswitch_3
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 138
    .line 139
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 140
    .line 141
    new-instance v1, La/es3;

    .line 142
    .line 143
    invoke-direct {v1, v0}, La/es3;-><init>(Lorg/platform/app/ApplicationLoader;)V

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :pswitch_4
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 148
    .line 149
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 150
    .line 151
    new-instance v1, La/us00;

    .line 152
    .line 153
    iget-object v2, v0, Lorg/platform/app/ApplicationLoader;->u1:La/n0o0;

    .line 154
    .line 155
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    check-cast v2, La/l4x;

    .line 160
    .line 161
    invoke-direct {v1, v0, v2}, La/us00;-><init>(Landroid/content/Context;La/l4x;)V

    .line 162
    .line 163
    .line 164
    return-object v1

    .line 165
    :pswitch_5
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 166
    .line 167
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 168
    .line 169
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->t1:La/n0o0;

    .line 170
    .line 171
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    move-object/from16 v18, v1

    .line 176
    .line 177
    check-cast v18, La/us00;

    .line 178
    .line 179
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->m1:La/n0o0;

    .line 180
    .line 181
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    move-object/from16 v19, v1

    .line 186
    .line 187
    check-cast v19, La/jvq;

    .line 188
    .line 189
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->n1:La/n0o0;

    .line 190
    .line 191
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v1

    .line 195
    move-object v13, v1

    .line 196
    check-cast v13, La/t5w0;

    .line 197
    .line 198
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->p1:La/n0o0;

    .line 199
    .line 200
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    move-object v14, v1

    .line 205
    check-cast v14, La/nfi;

    .line 206
    .line 207
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->o1:La/n0o0;

    .line 208
    .line 209
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v1

    .line 213
    move-object v15, v1

    .line 214
    check-cast v15, La/v4w0;

    .line 215
    .line 216
    iget-object v1, v0, Lorg/platform/app/ApplicationLoader;->q1:La/n0o0;

    .line 217
    .line 218
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    move-object/from16 v16, v1

    .line 223
    .line 224
    check-cast v16, La/ibi;

    .line 225
    .line 226
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->r1:La/n0o0;

    .line 227
    .line 228
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    move-object/from16 v17, v0

    .line 233
    .line 234
    check-cast v17, La/x7w0;

    .line 235
    .line 236
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 237
    .line 238
    .line 239
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    new-instance v3, La/g8i;

    .line 258
    .line 259
    new-instance v4, La/dl50;

    .line 260
    .line 261
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 262
    .line 263
    .line 264
    new-instance v5, La/kud;

    .line 265
    .line 266
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 267
    .line 268
    .line 269
    new-instance v6, La/kl5;

    .line 270
    .line 271
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 272
    .line 273
    .line 274
    new-instance v7, La/g9m0;

    .line 275
    .line 276
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 277
    .line 278
    .line 279
    new-instance v8, La/gl5;

    .line 280
    .line 281
    invoke-direct {v8, v2}, La/gl5;-><init>(B)V

    .line 282
    .line 283
    .line 284
    new-instance v9, La/g9m0;

    .line 285
    .line 286
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 287
    .line 288
    .line 289
    new-instance v10, La/lme0;

    .line 290
    .line 291
    const/16 v0, 0x1d

    .line 292
    .line 293
    invoke-direct {v10, v0}, La/lme0;-><init>(B)V

    .line 294
    .line 295
    .line 296
    new-instance v11, La/sek;

    .line 297
    .line 298
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 299
    .line 300
    .line 301
    new-instance v12, La/uuz;

    .line 302
    .line 303
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 304
    .line 305
    .line 306
    invoke-direct/range {v3 .. v19}, La/g8i;-><init>(La/dl50;La/kud;La/kl5;La/g9m0;La/gl5;La/g9m0;La/lme0;La/sek;La/uuz;La/t5w0;La/nfi;La/v4w0;La/ibi;La/x7w0;La/us00;La/jvq;)V

    .line 307
    .line 308
    .line 309
    return-object v3

    .line 310
    :pswitch_6
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 311
    .line 312
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 313
    .line 314
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    return-object v0

    .line 319
    :pswitch_7
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 320
    .line 321
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 322
    .line 323
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 324
    .line 325
    .line 326
    move-result-object v0

    .line 327
    return-object v0

    .line 328
    :pswitch_8
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 329
    .line 330
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 331
    .line 332
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    return-object v0

    .line 337
    :pswitch_9
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 338
    .line 339
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 340
    .line 341
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    return-object v0

    .line 346
    :pswitch_a
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 347
    .line 348
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 349
    .line 350
    invoke-virtual {v0}, Lorg/platform/app/ApplicationLoader;->c()La/g8i;

    .line 351
    .line 352
    .line 353
    move-result-object v0

    .line 354
    iget-object v0, v0, La/g8i;->K1:La/n5d0;

    .line 355
    .line 356
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v0

    .line 360
    move-object v1, v0

    .line 361
    check-cast v1, La/euc;

    .line 362
    .line 363
    monitor-enter v1

    .line 364
    :try_start_0
    new-instance v0, La/buc;

    .line 365
    .line 366
    invoke-direct {v0, v1, v6}, La/buc;-><init>(Ljava/lang/Object;B)V

    .line 367
    .line 368
    .line 369
    iget-object v2, v1, La/euc;->j:La/duc;

    .line 370
    .line 371
    if-nez v2, :cond_0

    .line 372
    .line 373
    iget-object v2, v1, La/euc;->c:Ljava/util/List;

    .line 374
    .line 375
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 384
    .line 385
    .line 386
    move-result-object v0

    .line 387
    new-instance v2, La/duc;

    .line 388
    .line 389
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 390
    .line 391
    .line 392
    iput-object v2, v1, La/euc;->j:La/duc;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 393
    .line 394
    :goto_0
    monitor-exit v1

    .line 395
    goto :goto_1

    .line 396
    :catchall_0
    move-exception v0

    .line 397
    goto :goto_2

    .line 398
    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 399
    .line 400
    .line 401
    move-result-wide v3

    .line 402
    iget-wide v5, v2, La/duc;->b:J

    .line 403
    .line 404
    sub-long/2addr v3, v5

    .line 405
    const-wide/32 v5, 0x493e0

    .line 406
    .line 407
    .line 408
    cmp-long v3, v3, v5

    .line 409
    .line 410
    if-gez v3, :cond_1

    .line 411
    .line 412
    iget-object v0, v2, La/duc;->a:Lokhttp3/OkHttpClient;

    .line 413
    .line 414
    goto :goto_0

    .line 415
    :cond_1
    iget-object v2, v1, La/euc;->c:Ljava/util/List;

    .line 416
    .line 417
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v1, v0}, La/euc;->a(Ljava/util/List;)Lokhttp3/OkHttpClient;

    .line 426
    .line 427
    .line 428
    move-result-object v0

    .line 429
    new-instance v2, La/duc;

    .line 430
    .line 431
    invoke-direct {v2, v0}, La/duc;-><init>(Lokhttp3/OkHttpClient;)V

    .line 432
    .line 433
    .line 434
    iput-object v2, v1, La/euc;->j:La/duc;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 435
    .line 436
    goto :goto_0

    .line 437
    :goto_1
    return-object v0

    .line 438
    :goto_2
    monitor-exit v1

    .line 439
    throw v0

    .line 440
    :pswitch_b
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 441
    .line 442
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 443
    .line 444
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->t1:La/n0o0;

    .line 445
    .line 446
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v0

    .line 450
    move-object v7, v0

    .line 451
    check-cast v7, La/us00;

    .line 452
    .line 453
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 454
    .line 455
    .line 456
    new-instance v8, La/kys0;

    .line 457
    .line 458
    invoke-direct {v8, v5}, La/kys0;-><init>(B)V

    .line 459
    .line 460
    .line 461
    new-instance v9, La/ln4;

    .line 462
    .line 463
    invoke-direct {v9, v7}, La/ln4;-><init>(La/us00;)V

    .line 464
    .line 465
    .line 466
    new-instance v10, Lorg/xplatform/fingerprint/impl/JniProfiler;

    .line 467
    .line 468
    invoke-direct {v10}, Lorg/xplatform/fingerprint/impl/JniProfiler;-><init>()V

    .line 469
    .line 470
    .line 471
    new-instance v11, La/wxs0;

    .line 472
    .line 473
    invoke-direct {v11, v5}, La/wxs0;-><init>(B)V

    .line 474
    .line 475
    .line 476
    new-instance v12, Lorg/xplatform/fingerprint/impl/MathTribunal;

    .line 477
    .line 478
    invoke-direct {v12}, Lorg/xplatform/fingerprint/impl/MathTribunal;-><init>()V

    .line 479
    .line 480
    .line 481
    new-instance v13, Lorg/xplatform/fingerprint/impl/AudioTract;

    .line 482
    .line 483
    invoke-direct {v13}, Lorg/xplatform/fingerprint/impl/AudioTract;-><init>()V

    .line 484
    .line 485
    .line 486
    new-instance v6, La/x7w0;

    .line 487
    .line 488
    invoke-direct/range {v6 .. v13}, La/x7w0;-><init>(La/us00;La/kys0;La/ln4;Lorg/xplatform/fingerprint/impl/JniProfiler;La/wxs0;Lorg/xplatform/fingerprint/impl/MathTribunal;Lorg/xplatform/fingerprint/impl/AudioTract;)V

    .line 489
    .line 490
    .line 491
    return-object v6

    .line 492
    :pswitch_c
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 493
    .line 494
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 495
    .line 496
    new-instance v1, La/j6a;

    .line 497
    .line 498
    new-instance v2, La/ds3;

    .line 499
    .line 500
    const/4 v4, 0x4

    .line 501
    invoke-direct {v2, v0, v4}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 502
    .line 503
    .line 504
    invoke-direct {v1, v2}, La/j6a;-><init>(La/ds3;)V

    .line 505
    .line 506
    .line 507
    new-instance v0, La/ibi;

    .line 508
    .line 509
    new-instance v9, La/svs0;

    .line 510
    .line 511
    invoke-direct {v9, v5}, La/svs0;-><init>(B)V

    .line 512
    .line 513
    .line 514
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 515
    .line 516
    .line 517
    new-instance v2, La/p8i;

    .line 518
    .line 519
    const/16 v5, 0xe

    .line 520
    .line 521
    invoke-direct {v2, v9, v5}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 522
    .line 523
    .line 524
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 525
    .line 526
    .line 527
    move-result-object v2

    .line 528
    iput-object v2, v0, La/ibi;->a:La/n5d0;

    .line 529
    .line 530
    invoke-static {v1}, La/zix;->a(Ljava/lang/Object;)La/zix;

    .line 531
    .line 532
    .line 533
    move-result-object v1

    .line 534
    iput-object v1, v0, La/ibi;->b:La/zix;

    .line 535
    .line 536
    new-instance v2, La/t6w0;

    .line 537
    .line 538
    invoke-direct {v2, v9, v1, v4}, La/t6w0;-><init>(Ljava/lang/Object;La/zix;B)V

    .line 539
    .line 540
    .line 541
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    new-instance v2, La/a7w0;

    .line 546
    .line 547
    const/4 v5, 0x1

    .line 548
    invoke-direct {v2, v9, v1, v5}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 549
    .line 550
    .line 551
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    iget-object v2, v0, La/ibi;->a:La/n5d0;

    .line 556
    .line 557
    new-instance v8, La/d7w0;

    .line 558
    .line 559
    invoke-direct {v8, v9, v2, v1, v5}, La/d7w0;-><init>(Ljava/lang/Object;La/n5d0;La/n5d0;B)V

    .line 560
    .line 561
    .line 562
    invoke-static {v8}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 563
    .line 564
    .line 565
    move-result-object v1

    .line 566
    iput-object v1, v0, La/ibi;->c:La/n5d0;

    .line 567
    .line 568
    iget-object v1, v0, La/ibi;->b:La/zix;

    .line 569
    .line 570
    new-instance v2, La/a7w0;

    .line 571
    .line 572
    invoke-direct {v2, v9, v1, v6}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 573
    .line 574
    .line 575
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 576
    .line 577
    .line 578
    move-result-object v1

    .line 579
    iput-object v1, v0, La/ibi;->d:La/n5d0;

    .line 580
    .line 581
    iget-object v2, v0, La/ibi;->c:La/n5d0;

    .line 582
    .line 583
    new-instance v5, La/d7w0;

    .line 584
    .line 585
    const/4 v8, 0x2

    .line 586
    invoke-direct {v5, v9, v2, v1, v8}, La/d7w0;-><init>(Ljava/lang/Object;La/n5d0;La/n5d0;B)V

    .line 587
    .line 588
    .line 589
    invoke-static {v5}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    iput-object v1, v0, La/ibi;->e:La/n5d0;

    .line 594
    .line 595
    new-instance v1, La/p8i;

    .line 596
    .line 597
    const/16 v2, 0x10

    .line 598
    .line 599
    invoke-direct {v1, v9, v2}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 600
    .line 601
    .line 602
    invoke-static {v1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 603
    .line 604
    .line 605
    move-result-object v1

    .line 606
    iput-object v1, v0, La/ibi;->f:La/n5d0;

    .line 607
    .line 608
    new-instance v2, La/a7w0;

    .line 609
    .line 610
    invoke-direct {v2, v9, v1, v3}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 611
    .line 612
    .line 613
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    iput-object v1, v0, La/ibi;->g:La/n5d0;

    .line 618
    .line 619
    new-instance v1, La/p8i;

    .line 620
    .line 621
    const/16 v2, 0xf

    .line 622
    .line 623
    invoke-direct {v1, v9, v2}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 624
    .line 625
    .line 626
    invoke-static {v1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 627
    .line 628
    .line 629
    move-result-object v1

    .line 630
    iput-object v1, v0, La/ibi;->h:La/n5d0;

    .line 631
    .line 632
    iget-object v1, v0, La/ibi;->b:La/zix;

    .line 633
    .line 634
    new-instance v2, La/a7w0;

    .line 635
    .line 636
    invoke-direct {v2, v9, v1, v7}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 637
    .line 638
    .line 639
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 640
    .line 641
    .line 642
    move-result-object v1

    .line 643
    iput-object v1, v0, La/ibi;->i:La/n5d0;

    .line 644
    .line 645
    iget-object v1, v0, La/ibi;->b:La/zix;

    .line 646
    .line 647
    new-instance v2, La/a7w0;

    .line 648
    .line 649
    invoke-direct {v2, v9, v1, v8}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 650
    .line 651
    .line 652
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    iget-object v2, v0, La/ibi;->d:La/n5d0;

    .line 657
    .line 658
    new-instance v3, La/d7w0;

    .line 659
    .line 660
    invoke-direct {v3, v9, v2, v1, v6}, La/d7w0;-><init>(Ljava/lang/Object;La/n5d0;La/n5d0;B)V

    .line 661
    .line 662
    .line 663
    invoke-static {v3}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    iput-object v1, v0, La/ibi;->j:La/n5d0;

    .line 668
    .line 669
    new-instance v1, La/p8i;

    .line 670
    .line 671
    const/16 v2, 0xd

    .line 672
    .line 673
    invoke-direct {v1, v9, v2}, La/p8i;-><init>(Ljava/lang/Object;B)V

    .line 674
    .line 675
    .line 676
    invoke-static {v1}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    iput-object v1, v0, La/ibi;->k:La/n5d0;

    .line 681
    .line 682
    iget-object v1, v0, La/ibi;->f:La/n5d0;

    .line 683
    .line 684
    new-instance v2, La/a7w0;

    .line 685
    .line 686
    const/4 v3, 0x3

    .line 687
    invoke-direct {v2, v9, v1, v3}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 688
    .line 689
    .line 690
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 691
    .line 692
    .line 693
    move-result-object v16

    .line 694
    iget-object v10, v0, La/ibi;->e:La/n5d0;

    .line 695
    .line 696
    iget-object v11, v0, La/ibi;->g:La/n5d0;

    .line 697
    .line 698
    iget-object v12, v0, La/ibi;->h:La/n5d0;

    .line 699
    .line 700
    iget-object v13, v0, La/ibi;->i:La/n5d0;

    .line 701
    .line 702
    iget-object v14, v0, La/ibi;->j:La/n5d0;

    .line 703
    .line 704
    iget-object v15, v0, La/ibi;->k:La/n5d0;

    .line 705
    .line 706
    new-instance v8, La/vgq;

    .line 707
    .line 708
    invoke-direct/range {v8 .. v16}, La/vgq;-><init>(La/svs0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;La/n5d0;)V

    .line 709
    .line 710
    .line 711
    invoke-static {v8}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 712
    .line 713
    .line 714
    move-result-object v1

    .line 715
    iput-object v1, v0, La/ibi;->l:La/n5d0;

    .line 716
    .line 717
    iget-object v1, v0, La/ibi;->f:La/n5d0;

    .line 718
    .line 719
    new-instance v2, La/a7w0;

    .line 720
    .line 721
    invoke-direct {v2, v9, v1, v4}, La/a7w0;-><init>(La/svs0;La/n5d0;B)V

    .line 722
    .line 723
    .line 724
    invoke-static {v2}, La/mbl;->b(La/n5d0;)La/n5d0;

    .line 725
    .line 726
    .line 727
    move-result-object v1

    .line 728
    iput-object v1, v0, La/ibi;->m:La/n5d0;

    .line 729
    .line 730
    return-object v0

    .line 731
    :pswitch_d
    iget-object v0, v0, La/ds3;->b:Lorg/platform/app/ApplicationLoader;

    .line 732
    .line 733
    sget-object v1, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 734
    .line 735
    invoke-static {}, Lorg/xplatform/domain/resolver/impl/di/DaggerDomainResolverComponent;->factory()La/xyk;

    .line 736
    .line 737
    .line 738
    move-result-object v1

    .line 739
    new-instance v3, La/a1d;

    .line 740
    .line 741
    new-instance v4, La/ds3;

    .line 742
    .line 743
    invoke-direct {v4, v0, v2}, La/ds3;-><init>(Lorg/platform/app/ApplicationLoader;B)V

    .line 744
    .line 745
    .line 746
    const/16 v2, 0x12

    .line 747
    .line 748
    invoke-direct {v3, v4, v2}, La/a1d;-><init>(Ljava/lang/Object;B)V

    .line 749
    .line 750
    .line 751
    iget-object v0, v0, Lorg/platform/app/ApplicationLoader;->o1:La/n0o0;

    .line 752
    .line 753
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    check-cast v0, La/v4w0;

    .line 758
    .line 759
    invoke-virtual {v0}, La/v4w0;->a()La/z8w0;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    check-cast v1, La/usd;

    .line 764
    .line 765
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 766
    .line 767
    .line 768
    new-instance v1, La/nfi;

    .line 769
    .line 770
    new-instance v2, La/ddk;

    .line 771
    .line 772
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 773
    .line 774
    .line 775
    invoke-direct {v1, v2, v3, v0}, La/nfi;-><init>(La/ddk;La/a1d;La/z8w0;)V

    .line 776
    .line 777
    .line 778
    return-object v1

    .line 779
    :pswitch_data_0
    .packed-switch 0x0
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
