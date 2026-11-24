.class public final La/sz2;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/sz2;->a:B

    iput-object p1, p0, La/sz2;->b:Ljava/lang/Object;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/sz2;->a:B

    .line 4
    .line 5
    const-string v2, "android_id"

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/16 v4, 0x2e

    .line 9
    .line 10
    const/4 v5, -0x1

    .line 11
    const/4 v6, 0x2

    .line 12
    const/4 v7, 0x1

    .line 13
    const/4 v8, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    new-instance v1, La/ktf0;

    .line 18
    .line 19
    new-instance v2, La/jdg0;

    .line 20
    .line 21
    invoke-direct {v2, v6}, La/jdg0;-><init>(I)V

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/wut0;

    .line 27
    .line 28
    iget-object v0, v0, La/wut0;->w:Ljava/util/List;

    .line 29
    .line 30
    new-array v3, v8, [La/mvj;

    .line 31
    .line 32
    invoke-interface {v0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v2, v0}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    new-instance v0, La/mvj;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2, v0}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, v2, La/jdg0;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    new-array v2, v2, [La/mvj;

    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {v1, v0}, La/ktf0;-><init>(Ljava/util/List;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :pswitch_0
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Landroid/content/Context;

    .line 70
    .line 71
    const-string v1, "rate_limit_backoff_storage"

    .line 72
    .line 73
    invoke-virtual {v0, v1, v8}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_1
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, La/eyg0;

    .line 81
    .line 82
    iget-object v0, v0, La/eyg0;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, Landroid/hardware/SensorManager;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v5}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    new-instance v1, Ljava/util/ArrayList;

    .line 97
    .line 98
    const/16 v2, 0xa

    .line 99
    .line 100
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_0

    .line 116
    .line 117
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v2

    .line 121
    check-cast v2, Landroid/hardware/Sensor;

    .line 122
    .line 123
    new-instance v3, La/nfi0;

    .line 124
    .line 125
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v2}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-direct {v3, v4, v2}, La/nfi0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_0
    return-object v1

    .line 150
    :pswitch_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v2, "Section temporary unavailable for "

    .line 153
    .line 154
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 158
    .line 159
    check-cast v0, La/imx;

    .line 160
    .line 161
    iget-object v0, v0, La/imx;->d:Ljava/lang/String;

    .line 162
    .line 163
    invoke-static {v1, v0, v4}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    return-object v0

    .line 168
    :pswitch_3
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, Ljava/util/List;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_4
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v1

    .line 185
    if-nez v1, :cond_2

    .line 186
    .line 187
    iget-object v1, v0, La/sz2;->b:Ljava/lang/Object;

    .line 188
    .line 189
    check-cast v1, La/kf60;

    .line 190
    .line 191
    iget-object v2, v1, La/kf60;->a:La/jw20;

    .line 192
    .line 193
    iget-object v2, v2, La/jw20;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v2, La/wut0;

    .line 196
    .line 197
    iget-object v2, v2, La/wut0;->f:La/uvt0;

    .line 198
    .line 199
    check-cast v2, La/tvt0;

    .line 200
    .line 201
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2}, La/tvt0;->a()Lokhttp3/OkHttpClient;

    .line 205
    .line 206
    .line 207
    move-result-object v3

    .line 208
    invoke-virtual {v3}, Lokhttp3/OkHttpClient;->b()Lokhttp3/OkHttpClient$Builder;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    sget-object v4, La/vv00;->e:La/vv00;

    .line 213
    .line 214
    iget-object v5, v1, La/kf60;->a:La/jw20;

    .line 215
    .line 216
    iget-object v5, v5, La/jw20;->b:Ljava/lang/Object;

    .line 217
    .line 218
    check-cast v5, La/wut0;

    .line 219
    .line 220
    iget-object v5, v5, La/wut0;->g:La/gsj;

    .line 221
    .line 222
    iget-object v5, v5, La/gsj;->a:La/n0o0;

    .line 223
    .line 224
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v5

    .line 228
    if-eq v4, v5, :cond_1

    .line 229
    .line 230
    iget-object v1, v1, La/kf60;->a:La/jw20;

    .line 231
    .line 232
    iget-object v1, v1, La/jw20;->b:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v1, La/wut0;

    .line 235
    .line 236
    iget-boolean v4, v1, La/wut0;->k:Z

    .line 237
    .line 238
    iget-object v5, v1, La/wut0;->g:La/gsj;

    .line 239
    .line 240
    iget-object v1, v1, La/wut0;->h:La/yvj;

    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    new-instance v6, La/dw00;

    .line 249
    .line 250
    invoke-direct {v6, v4, v5, v1}, La/dw00;-><init>(ZLa/gsj;La/yvj;)V

    .line 251
    .line 252
    .line 253
    iget-object v1, v3, Lokhttp3/OkHttpClient$Builder;->c:Ljava/util/ArrayList;

    .line 254
    .line 255
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    :cond_1
    new-instance v1, Lokhttp3/OkHttpClient;

    .line 259
    .line 260
    invoke-direct {v1, v3}, Lokhttp3/OkHttpClient;-><init>(Lokhttp3/OkHttpClient$Builder;)V

    .line 261
    .line 262
    .line 263
    iput-object v1, v2, La/tvt0;->a:Lokhttp3/OkHttpClient;

    .line 264
    .line 265
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v0, La/kf60;

    .line 268
    .line 269
    iget-object v0, v0, La/kf60;->a:La/jw20;

    .line 270
    .line 271
    iget-object v0, v0, La/jw20;->b:Ljava/lang/Object;

    .line 272
    .line 273
    check-cast v0, La/wut0;

    .line 274
    .line 275
    iget-object v3, v0, La/wut0;->f:La/uvt0;

    .line 276
    .line 277
    goto :goto_1

    .line 278
    :cond_2
    const-string v0, "UI thread"

    .line 279
    .line 280
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 281
    .line 282
    .line 283
    :goto_1
    return-object v3

    .line 284
    :pswitch_5
    sget-object v1, La/rnh0;->b:Ljava/util/List;

    .line 285
    .line 286
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 287
    .line 288
    check-cast v0, La/dw00;

    .line 289
    .line 290
    iget-object v0, v0, La/dw00;->b:Ljava/util/List;

    .line 291
    .line 292
    invoke-static {v0}, La/g8x;->A(Ljava/util/Collection;)La/rnh0;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    return-object v0

    .line 297
    :pswitch_6
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, La/xc00;

    .line 300
    .line 301
    invoke-static {v0}, La/vvw;->y(La/j;)Z

    .line 302
    .line 303
    .line 304
    move-result v1

    .line 305
    if-eqz v1, :cond_3

    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_3
    iget-object v0, v0, La/zkd;->e:Ljava/util/List;

    .line 309
    .line 310
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 311
    .line 312
    .line 313
    move-result-object v0

    .line 314
    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v1

    .line 318
    if-eqz v1, :cond_5

    .line 319
    .line 320
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v1

    .line 324
    check-cast v1, La/j;

    .line 325
    .line 326
    iget-object v2, v1, La/j;->a:La/ar20;

    .line 327
    .line 328
    sget-object v3, La/wb;->p:La/ar20;

    .line 329
    .line 330
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    if-eqz v2, :cond_4

    .line 335
    .line 336
    invoke-static {v1}, La/vvw;->y(La/j;)Z

    .line 337
    .line 338
    .line 339
    move-result v1

    .line 340
    if-eqz v1, :cond_4

    .line 341
    .line 342
    goto :goto_2

    .line 343
    :cond_5
    move v7, v8

    .line 344
    :goto_2
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    return-object v0

    .line 349
    :pswitch_7
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 350
    .line 351
    check-cast v0, La/qb00;

    .line 352
    .line 353
    sget-object v1, La/cy2;->D:La/ar20;

    .line 354
    .line 355
    sget-object v2, La/cy2;->E:La/ar20;

    .line 356
    .line 357
    invoke-virtual {v0, v1, v2}, La/qb00;->b(La/ar20;La/ar20;)[I

    .line 358
    .line 359
    .line 360
    move-result-object v3

    .line 361
    iget-object v0, v0, La/qb00;->a:Ljava/util/ArrayList;

    .line 362
    .line 363
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 364
    .line 365
    .line 366
    move-result v4

    .line 367
    new-array v4, v4, [I

    .line 368
    .line 369
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 370
    .line 371
    .line 372
    move-result v6

    .line 373
    sub-int/2addr v6, v7

    .line 374
    move v9, v5

    .line 375
    :goto_3
    if-ge v5, v6, :cond_e

    .line 376
    .line 377
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v10

    .line 381
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    check-cast v10, La/wvq0;

    .line 385
    .line 386
    invoke-virtual {v10}, La/wvq0;->g()La/ar20;

    .line 387
    .line 388
    .line 389
    move-result-object v11

    .line 390
    invoke-virtual {v10, v7}, La/wvq0;->b(I)C

    .line 391
    .line 392
    .line 393
    move-result v12

    .line 394
    if-eqz v12, :cond_8

    .line 395
    .line 396
    invoke-static {v12}, Ljava/lang/Character;->isSpaceChar(C)Z

    .line 397
    .line 398
    .line 399
    move-result v13

    .line 400
    if-nez v13, :cond_8

    .line 401
    .line 402
    invoke-static {v12}, Lkotlin/text/CharsKt;->d(C)Z

    .line 403
    .line 404
    .line 405
    move-result v12

    .line 406
    if-eqz v12, :cond_6

    .line 407
    .line 408
    goto :goto_4

    .line 409
    :cond_6
    if-nez v11, :cond_7

    .line 410
    .line 411
    goto :goto_4

    .line 412
    :cond_7
    move v12, v8

    .line 413
    goto :goto_5

    .line 414
    :cond_8
    :goto_4
    move v12, v7

    .line 415
    :goto_5
    if-eqz v12, :cond_9

    .line 416
    .line 417
    move v9, v6

    .line 418
    :cond_9
    aget v13, v3, v6

    .line 419
    .line 420
    invoke-virtual {v10}, La/wvq0;->e()La/ar20;

    .line 421
    .line 422
    .line 423
    move-result-object v10

    .line 424
    invoke-static {v10, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 425
    .line 426
    .line 427
    move-result v10

    .line 428
    if-eqz v10, :cond_b

    .line 429
    .line 430
    if-eq v13, v5, :cond_a

    .line 431
    .line 432
    if-gt v13, v9, :cond_a

    .line 433
    .line 434
    aget v10, v4, v13

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :cond_a
    move v10, v5

    .line 438
    goto :goto_7

    .line 439
    :cond_b
    if-nez v12, :cond_d

    .line 440
    .line 441
    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v10

    .line 445
    if-eqz v10, :cond_c

    .line 446
    .line 447
    goto :goto_6

    .line 448
    :cond_c
    add-int/lit8 v10, v6, 0x1

    .line 449
    .line 450
    aget v10, v4, v10

    .line 451
    .line 452
    goto :goto_7

    .line 453
    :cond_d
    :goto_6
    move v10, v6

    .line 454
    :goto_7
    aput v10, v4, v6

    .line 455
    .line 456
    add-int/lit8 v6, v6, -0x1

    .line 457
    .line 458
    goto :goto_3

    .line 459
    :cond_e
    return-object v4

    .line 460
    :pswitch_8
    new-instance v1, Ljava/lang/StringBuilder;

    .line 461
    .line 462
    const-string v2, "Internal server error occurred while executing "

    .line 463
    .line 464
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 465
    .line 466
    .line 467
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v0, La/imx;

    .line 470
    .line 471
    iget-object v0, v0, La/imx;->d:Ljava/lang/String;

    .line 472
    .line 473
    invoke-static {v1, v0, v4}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    return-object v0

    .line 478
    :pswitch_9
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 479
    .line 480
    check-cast v0, La/svu;

    .line 481
    .line 482
    iget-object v0, v0, La/svu;->a:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, Landroid/hardware/input/InputManager;

    .line 485
    .line 486
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 487
    .line 488
    .line 489
    invoke-virtual {v0}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    .line 490
    .line 491
    .line 492
    move-result-object v1

    .line 493
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 494
    .line 495
    .line 496
    new-instance v2, Ljava/util/ArrayList;

    .line 497
    .line 498
    array-length v3, v1

    .line 499
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 500
    .line 501
    .line 502
    array-length v3, v1

    .line 503
    :goto_8
    if-ge v8, v3, :cond_f

    .line 504
    .line 505
    aget v4, v1, v8

    .line 506
    .line 507
    invoke-virtual {v0, v4}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    .line 508
    .line 509
    .line 510
    move-result-object v4

    .line 511
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    .line 513
    .line 514
    invoke-virtual {v4}, Landroid/view/InputDevice;->getVendorId()I

    .line 515
    .line 516
    .line 517
    move-result v5

    .line 518
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v5

    .line 522
    new-instance v6, La/pex;

    .line 523
    .line 524
    invoke-virtual {v4}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    .line 525
    .line 526
    .line 527
    move-result-object v4

    .line 528
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    invoke-direct {v6, v4, v5}, La/pex;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 535
    .line 536
    .line 537
    add-int/lit8 v8, v8, 0x1

    .line 538
    .line 539
    goto :goto_8

    .line 540
    :cond_f
    return-object v2

    .line 541
    :pswitch_a
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 542
    .line 543
    check-cast v0, La/xsu;

    .line 544
    .line 545
    const-string v1, "content://com.google.android.gsf.gservices"

    .line 546
    .line 547
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 548
    .line 549
    .line 550
    move-result-object v9

    .line 551
    filled-new-array {v2}, [Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v12

    .line 555
    :try_start_0
    iget-object v0, v0, La/xsu;->a:Ljava/lang/Object;

    .line 556
    .line 557
    move-object v8, v0

    .line 558
    check-cast v8, Landroid/content/ContentResolver;

    .line 559
    .line 560
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    const/4 v11, 0x0

    .line 564
    const/4 v13, 0x0

    .line 565
    const/4 v10, 0x0

    .line 566
    invoke-virtual/range {v8 .. v13}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 571
    .line 572
    .line 573
    :try_start_1
    invoke-interface {v1}, Landroid/database/Cursor;->moveToFirst()Z

    .line 574
    .line 575
    .line 576
    move-result v0

    .line 577
    if-eqz v0, :cond_10

    .line 578
    .line 579
    invoke-interface {v1}, Landroid/database/Cursor;->getColumnCount()I

    .line 580
    .line 581
    .line 582
    move-result v0

    .line 583
    if-lt v0, v6, :cond_10

    .line 584
    .line 585
    invoke-interface {v1, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 593
    .line 594
    .line 595
    move-result-wide v4

    .line 596
    invoke-static {v4, v5}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    .line 597
    .line 598
    .line 599
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 600
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 601
    .line 602
    .line 603
    move-object v3, v0

    .line 604
    goto :goto_a

    .line 605
    :catchall_0
    move-exception v0

    .line 606
    move-object v2, v0

    .line 607
    goto :goto_9

    .line 608
    :cond_10
    :try_start_3
    const-string v0, "Check failed."

    .line 609
    .line 610
    new-instance v2, Ljava/lang/IllegalStateException;

    .line 611
    .line 612
    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 613
    .line 614
    .line 615
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 616
    :goto_9
    :try_start_4
    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 617
    :catchall_1
    move-exception v0

    .line 618
    :try_start_5
    invoke-static {v1, v2}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 619
    .line 620
    .line 621
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    .line 622
    :catch_0
    :goto_a
    return-object v3

    .line 623
    :pswitch_b
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 624
    .line 625
    check-cast v0, La/hnu;

    .line 626
    .line 627
    iget-object v0, v0, La/hnu;->a:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v0, Landroid/app/ActivityManager;

    .line 630
    .line 631
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    .line 635
    .line 636
    .line 637
    move-result-object v0

    .line 638
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 639
    .line 640
    .line 641
    invoke-virtual {v0}, Landroid/content/pm/ConfigurationInfo;->getGlEsVersion()Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 646
    .line 647
    .line 648
    return-object v0

    .line 649
    :pswitch_c
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 650
    .line 651
    check-cast v0, La/iqi;

    .line 652
    .line 653
    :try_start_6
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 654
    .line 655
    iget-object v0, v0, La/iqi;->c:Ljava/lang/Object;

    .line 656
    .line 657
    check-cast v0, La/neq;

    .line 658
    .line 659
    invoke-virtual {v0}, La/neq;->invoke()Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    check-cast v0, La/peq;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 664
    .line 665
    goto :goto_b

    .line 666
    :catchall_2
    move-exception v0

    .line 667
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 668
    .line 669
    new-instance v1, La/g0g0;

    .line 670
    .line 671
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 672
    .line 673
    .line 674
    move-object v0, v1

    .line 675
    :goto_b
    new-instance v1, La/j0g0;

    .line 676
    .line 677
    invoke-direct {v1, v0}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 678
    .line 679
    .line 680
    return-object v1

    .line 681
    :pswitch_d
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 682
    .line 683
    check-cast v0, La/a7q;

    .line 684
    .line 685
    iget-object v0, v0, La/a7q;->a:Ljava/lang/Object;

    .line 686
    .line 687
    check-cast v0, La/heq;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    sget-object v0, La/jeq;->b:La/jeq;

    .line 693
    .line 694
    return-object v0

    .line 695
    :pswitch_e
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 696
    .line 697
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 698
    .line 699
    check-cast v0, La/xyj;

    .line 700
    .line 701
    iget-object v10, v0, La/xyj;->a:Ljava/lang/String;

    .line 702
    .line 703
    iget-object v11, v0, La/xyj;->b:Ljava/lang/String;

    .line 704
    .line 705
    sget-object v12, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 706
    .line 707
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 708
    .line 709
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 710
    .line 711
    .line 712
    move-result-object v13

    .line 713
    sget-object v14, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 714
    .line 715
    sget-object v15, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    .line 716
    .line 717
    sget-object v16, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 718
    .line 719
    const-string v2, "user.language"

    .line 720
    .line 721
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 722
    .line 723
    .line 724
    move-result-object v17

    .line 725
    iget-object v0, v0, La/xyj;->c:Landroid/graphics/Point;

    .line 726
    .line 727
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 728
    .line 729
    iget v3, v0, Landroid/graphics/Point;->y:I

    .line 730
    .line 731
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 732
    .line 733
    .line 734
    move-result v2

    .line 735
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 736
    .line 737
    .line 738
    move-result-object v18

    .line 739
    iget v2, v0, Landroid/graphics/Point;->x:I

    .line 740
    .line 741
    iget v0, v0, Landroid/graphics/Point;->y:I

    .line 742
    .line 743
    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    .line 744
    .line 745
    .line 746
    move-result v0

    .line 747
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 748
    .line 749
    .line 750
    move-result-object v19

    .line 751
    const-string v9, "VKAndroidSDK"

    .line 752
    .line 753
    filled-new-array/range {v9 .. v19}, [Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    const/16 v2, 0xb

    .line 758
    .line 759
    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 760
    .line 761
    .line 762
    move-result-object v0

    .line 763
    const-string v2, "%s/%s-%s (Android %s; SDK %d; %s; %s %s; %s; %dx%d)"

    .line 764
    .line 765
    invoke-static {v1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 766
    .line 767
    .line 768
    move-result-object v0

    .line 769
    move v1, v8

    .line 770
    :goto_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 771
    .line 772
    .line 773
    move-result v2

    .line 774
    if-ge v1, v2, :cond_14

    .line 775
    .line 776
    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 777
    .line 778
    .line 779
    move-result v2

    .line 780
    const/16 v3, 0x7f

    .line 781
    .line 782
    const/16 v4, 0x20

    .line 783
    .line 784
    if-gt v4, v2, :cond_11

    .line 785
    .line 786
    if-ge v2, v3, :cond_11

    .line 787
    .line 788
    invoke-static {v2}, Ljava/lang/Character;->charCount(I)I

    .line 789
    .line 790
    .line 791
    move-result v2

    .line 792
    add-int/2addr v1, v2

    .line 793
    goto :goto_c

    .line 794
    :cond_11
    new-instance v2, La/f99;

    .line 795
    .line 796
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 797
    .line 798
    .line 799
    invoke-virtual {v2, v8, v1, v0}, La/f99;->b0(IILjava/lang/String;)V

    .line 800
    .line 801
    .line 802
    :goto_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 803
    .line 804
    .line 805
    move-result v5

    .line 806
    if-ge v1, v5, :cond_13

    .line 807
    .line 808
    invoke-virtual {v0, v1}, Ljava/lang/String;->codePointAt(I)I

    .line 809
    .line 810
    .line 811
    move-result v5

    .line 812
    if-gt v4, v5, :cond_12

    .line 813
    .line 814
    if-ge v5, v3, :cond_12

    .line 815
    .line 816
    move v6, v5

    .line 817
    goto :goto_e

    .line 818
    :cond_12
    const/16 v6, 0x3f

    .line 819
    .line 820
    :goto_e
    invoke-virtual {v2, v6}, La/f99;->e0(I)V

    .line 821
    .line 822
    .line 823
    invoke-static {v5}, Ljava/lang/Character;->charCount(I)I

    .line 824
    .line 825
    .line 826
    move-result v5

    .line 827
    add-int/2addr v1, v5

    .line 828
    goto :goto_d

    .line 829
    :cond_13
    invoke-virtual {v2}, La/f99;->O()Ljava/lang/String;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    :cond_14
    return-object v0

    .line 834
    :pswitch_f
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 835
    .line 836
    check-cast v0, La/rrc;

    .line 837
    .line 838
    iget-object v0, v0, La/rrc;->b:Ljava/lang/Object;

    .line 839
    .line 840
    check-cast v0, Landroid/media/MediaCodecList;

    .line 841
    .line 842
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 843
    .line 844
    .line 845
    invoke-virtual {v0}, Landroid/media/MediaCodecList;->getCodecInfos()[Landroid/media/MediaCodecInfo;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    new-instance v1, Ljava/util/ArrayList;

    .line 853
    .line 854
    array-length v2, v0

    .line 855
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 856
    .line 857
    .line 858
    array-length v2, v0

    .line 859
    move v3, v8

    .line 860
    :goto_f
    if-ge v3, v2, :cond_16

    .line 861
    .line 862
    aget-object v4, v0, v3

    .line 863
    .line 864
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getName()Ljava/lang/String;

    .line 868
    .line 869
    .line 870
    move-result-object v5

    .line 871
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 872
    .line 873
    .line 874
    invoke-virtual {v4}, Landroid/media/MediaCodecInfo;->getSupportedTypes()[Ljava/lang/String;

    .line 875
    .line 876
    .line 877
    move-result-object v4

    .line 878
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    new-instance v6, Ljava/util/ArrayList;

    .line 882
    .line 883
    array-length v7, v4

    .line 884
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 885
    .line 886
    .line 887
    array-length v7, v4

    .line 888
    move v9, v8

    .line 889
    :goto_10
    if-ge v9, v7, :cond_15

    .line 890
    .line 891
    aget-object v10, v4, v9

    .line 892
    .line 893
    invoke-static {v10}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v10

    .line 897
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 898
    .line 899
    .line 900
    add-int/lit8 v9, v9, 0x1

    .line 901
    .line 902
    goto :goto_10

    .line 903
    :cond_15
    new-instance v4, La/im30;

    .line 904
    .line 905
    invoke-direct {v4, v5, v6}, La/im30;-><init>(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    add-int/lit8 v3, v3, 0x1

    .line 912
    .line 913
    goto :goto_f

    .line 914
    :cond_16
    return-object v1

    .line 915
    :pswitch_10
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 916
    .line 917
    check-cast v0, La/sz2;

    .line 918
    .line 919
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 920
    .line 921
    check-cast v0, La/xnb;

    .line 922
    .line 923
    invoke-interface {v0}, La/riu0;->g()La/piu0;

    .line 924
    .line 925
    .line 926
    move-result-object v0

    .line 927
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    return-object v0

    .line 931
    :pswitch_11
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 932
    .line 933
    check-cast v0, La/xnb;

    .line 934
    .line 935
    return-object v0

    .line 936
    :pswitch_12
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 937
    .line 938
    check-cast v0, La/wa3;

    .line 939
    .line 940
    iget-object v0, v0, La/wa3;->d:La/gfk0;

    .line 941
    .line 942
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 943
    .line 944
    .line 945
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 946
    .line 947
    .line 948
    move-result-object v0

    .line 949
    return-object v0

    .line 950
    :pswitch_13
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v0, La/oms0;

    .line 953
    .line 954
    iget-object v1, v0, La/oms0;->a:La/p4;

    .line 955
    .line 956
    invoke-virtual {v1}, La/p4;->y0()Ljava/lang/Object;

    .line 957
    .line 958
    .line 959
    move-result-object v1

    .line 960
    sget-object v2, La/azn;->c:La/azn;

    .line 961
    .line 962
    if-ne v1, v2, :cond_17

    .line 963
    .line 964
    iget-object v0, v0, La/oms0;->d:La/pz40;

    .line 965
    .line 966
    check-cast v0, La/hgk0;

    .line 967
    .line 968
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 969
    .line 970
    .line 971
    move-result-object v0

    .line 972
    if-ne v0, v2, :cond_17

    .line 973
    .line 974
    goto :goto_11

    .line 975
    :cond_17
    move v7, v8

    .line 976
    :goto_11
    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 977
    .line 978
    .line 979
    move-result-object v0

    .line 980
    return-object v0

    .line 981
    :pswitch_14
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 982
    .line 983
    check-cast v0, La/pz40;

    .line 984
    .line 985
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 986
    .line 987
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 988
    .line 989
    .line 990
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 991
    .line 992
    return-object v0

    .line 993
    :pswitch_15
    iget-object v0, v0, La/sz2;->b:Ljava/lang/Object;

    .line 994
    .line 995
    check-cast v0, La/h03;

    .line 996
    .line 997
    iget-object v0, v0, La/h03;->b:Ljava/lang/Object;

    .line 998
    .line 999
    check-cast v0, Landroid/content/ContentResolver;

    .line 1000
    .line 1001
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    invoke-static {v0, v2}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1009
    .line 1010
    .line 1011
    return-object v0

    .line 1012
    nop

    .line 1013
    :pswitch_data_0
    .packed-switch 0x0
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
