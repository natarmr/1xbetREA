.class public final synthetic La/rai0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rai0;->a:B

    iput-object p1, p0, La/rai0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-byte v0, p0, La/rai0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x4

    .line 5
    const/4 v3, 0x3

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x2

    .line 8
    const/4 v6, 0x1

    .line 9
    const/4 v7, 0x0

    .line 10
    iget-object p0, p0, La/rai0;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/rok0;

    .line 16
    .line 17
    check-cast p1, Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    iget-object p0, p0, La/rok0;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lorg/xplatform/uikit/components/cells/right/DsCellRightBanner;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_0
    check-cast p0, La/wma0;

    .line 28
    .line 29
    check-cast p1, La/cp;

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 35
    .line 36
    check-cast v0, La/rok0;

    .line 37
    .line 38
    iget-object v0, v0, La/rok0;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v1, La/huh0;

    .line 44
    .line 45
    const/16 v2, 0x18

    .line 46
    .line 47
    invoke-direct {v1, p0, p1, v2}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0, v1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 51
    .line 52
    .line 53
    new-instance p0, La/kzi0;

    .line 54
    .line 55
    const/16 v0, 0x8

    .line 56
    .line 57
    invoke-direct {p0, p1, v0}, La/kzi0;-><init>(La/cp;B)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_1
    check-cast p0, La/jpk0;

    .line 67
    .line 68
    check-cast p1, La/lwk0;

    .line 69
    .line 70
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    iget v9, p0, La/jpk0;->a:I

    .line 74
    .line 75
    iget-object v10, p0, La/jpk0;->b:Ljava/lang/String;

    .line 76
    .line 77
    sget-object p0, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;

    .line 78
    .line 79
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    iget-object v0, p1, La/lwk0;->b:Ljava/util/List;

    .line 83
    .line 84
    iget-object v1, p1, La/lwk0;->a:Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 85
    .line 86
    invoke-interface {v0, v1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    new-instance v2, Ljava/util/ArrayList;

    .line 91
    .line 92
    const/16 v4, 0xa

    .line 93
    .line 94
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 99
    .line 100
    .line 101
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_8

    .line 110
    .line 111
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lorg/xplatform/special_event/impl/main/presentation/model/SpecialEventTabs;

    .line 116
    .line 117
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-eqz v8, :cond_3

    .line 122
    .line 123
    if-eq v8, v6, :cond_2

    .line 124
    .line 125
    if-eq v8, v5, :cond_1

    .line 126
    .line 127
    if-ne v8, v3, :cond_0

    .line 128
    .line 129
    sget-object v8, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;

    .line 130
    .line 131
    :goto_1
    move-object v11, v8

    .line 132
    goto :goto_2

    .line 133
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 134
    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_1
    sget-object v8, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;

    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_2
    sget-object v8, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;

    .line 141
    .line 142
    goto :goto_1

    .line 143
    :cond_3
    move-object v11, p0

    .line 144
    :goto_2
    invoke-virtual {v11, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v12

    .line 148
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 149
    .line 150
    .line 151
    move-result v4

    .line 152
    if-eqz v4, :cond_7

    .line 153
    .line 154
    if-eq v4, v6, :cond_6

    .line 155
    .line 156
    if-eq v4, v5, :cond_5

    .line 157
    .line 158
    if-ne v4, v3, :cond_4

    .line 159
    .line 160
    iget-object v4, p1, La/lwk0;->g:Ljava/util/List;

    .line 161
    .line 162
    :goto_3
    move-object v13, v4

    .line 163
    goto :goto_4

    .line 164
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 165
    .line 166
    .line 167
    goto :goto_5

    .line 168
    :cond_5
    iget-object v4, p1, La/lwk0;->f:Ljava/util/List;

    .line 169
    .line 170
    goto :goto_3

    .line 171
    :cond_6
    iget-object v4, p1, La/lwk0;->e:Ljava/util/List;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    iget-object v4, p1, La/lwk0;->d:Ljava/util/List;

    .line 175
    .line 176
    goto :goto_3

    .line 177
    :goto_4
    new-instance v8, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 178
    .line 179
    invoke-direct/range {v8 .. v13}, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;-><init>(ILjava/lang/String;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;ZLjava/util/List;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    goto :goto_0

    .line 186
    :cond_8
    new-instance v7, La/kwk0;

    .line 187
    .line 188
    invoke-direct {v7, v1, v2}, La/kwk0;-><init>(ILjava/util/ArrayList;)V

    .line 189
    .line 190
    .line 191
    :goto_5
    return-object v7

    .line 192
    :pswitch_2
    check-cast p0, La/yjt;

    .line 193
    .line 194
    check-cast p1, La/uag0;

    .line 195
    .line 196
    sget-object v0, La/fpk0;->V1:La/zie0;

    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {p1, v6}, La/uag0;->g(Z)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p1, p0}, La/uag0;->D(La/yjj0;)V

    .line 205
    .line 206
    .line 207
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object p0

    .line 210
    :pswitch_3
    check-cast p0, La/bhk0;

    .line 211
    .line 212
    check-cast p1, La/abi0;

    .line 213
    .line 214
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget p0, p0, La/bhk0;->b:I

    .line 218
    .line 219
    invoke-static {p1, p0}, La/cbi0;->c(La/abi0;I)V

    .line 220
    .line 221
    .line 222
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object p0

    .line 225
    :pswitch_4
    check-cast p0, La/qe9;

    .line 226
    .line 227
    check-cast p1, La/abi0;

    .line 228
    .line 229
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 230
    .line 231
    .line 232
    sget-object v0, La/cbi0;->a:[La/iiy;

    .line 233
    .line 234
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    sget-object v0, La/cbi0;->g:La/zai0;

    .line 238
    .line 239
    sget-object v1, La/cbi0;->a:[La/iiy;

    .line 240
    .line 241
    const/4 v2, 0x5

    .line 242
    aget-object v1, v1, v2

    .line 243
    .line 244
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    .line 246
    .line 247
    invoke-interface {p1, v0, p0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 248
    .line 249
    .line 250
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object p0

    .line 253
    :pswitch_5
    check-cast p0, Ljava/lang/reflect/Field;

    .line 254
    .line 255
    check-cast p1, Landroid/net/wifi/WifiConfiguration;

    .line 256
    .line 257
    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 258
    .line 259
    .line 260
    move-result-object v7
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 261
    goto :goto_6

    .line 262
    :catch_0
    move-exception v0

    .line 263
    move-object p0, v0

    .line 264
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 265
    .line 266
    .line 267
    :goto_6
    return-object v7

    .line 268
    :pswitch_6
    check-cast p0, La/pgk0;

    .line 269
    .line 270
    iget-object v1, p0, La/pgk0;->g:Ljava/lang/Object;

    .line 271
    .line 272
    monitor-enter v1

    .line 273
    :try_start_1
    iget-object p0, p0, La/pgk0;->i:La/ogk0;

    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v0, p0, La/ogk0;->b:Ljava/lang/Object;

    .line 279
    .line 280
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 281
    .line 282
    .line 283
    iget v2, p0, La/ogk0;->d:I

    .line 284
    .line 285
    iget-object v3, p0, La/ogk0;->c:La/ry40;

    .line 286
    .line 287
    if-nez v3, :cond_9

    .line 288
    .line 289
    new-instance v3, La/ry40;

    .line 290
    .line 291
    invoke-direct {v3}, La/ry40;-><init>()V

    .line 292
    .line 293
    .line 294
    iput-object v3, p0, La/ogk0;->c:La/ry40;

    .line 295
    .line 296
    iget-object v4, p0, La/ogk0;->f:La/hz40;

    .line 297
    .line 298
    invoke-virtual {v4, v0, v3}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    :cond_9
    invoke-virtual {p0, p1, v2, v0, v3}, La/ogk0;->b(Ljava/lang/Object;ILjava/lang/Object;La/ry40;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 302
    .line 303
    .line 304
    monitor-exit v1

    .line 305
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object p0

    .line 308
    :catchall_0
    move-exception v0

    .line 309
    move-object p0, v0

    .line 310
    monitor-exit v1

    .line 311
    throw p0

    .line 312
    :pswitch_7
    check-cast p0, La/fdk0;

    .line 313
    .line 314
    check-cast p1, Ljava/lang/Throwable;

    .line 315
    .line 316
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    .line 318
    .line 319
    instance-of v0, p1, La/zhi0;

    .line 320
    .line 321
    if-eqz v0, :cond_c

    .line 322
    .line 323
    move-object v0, p1

    .line 324
    check-cast v0, La/zhi0;

    .line 325
    .line 326
    iget-object v0, v0, La/zhi0;->c:La/kuw;

    .line 327
    .line 328
    sget-object v1, La/i2o;->M2:La/i2o;

    .line 329
    .line 330
    if-ne v0, v1, :cond_c

    .line 331
    .line 332
    iget-object v0, p0, La/i3t0;->i:La/ocj;

    .line 333
    .line 334
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 335
    .line 336
    :cond_a
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    .line 342
    .line 343
    iget-object v2, p0, La/i3t0;->f:La/oyg0;

    .line 344
    .line 345
    move-object v3, v1

    .line 346
    check-cast v3, La/cdk0;

    .line 347
    .line 348
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    if-nez v2, :cond_b

    .line 356
    .line 357
    const-string v2, ""

    .line 358
    .line 359
    :cond_b
    move-object v5, v2

    .line 360
    const/4 v10, 0x0

    .line 361
    const/16 v11, 0x67f7

    .line 362
    .line 363
    const/4 v4, 0x0

    .line 364
    const/4 v6, 0x0

    .line 365
    const/4 v7, 0x0

    .line 366
    const/4 v8, 0x1

    .line 367
    const/4 v9, 0x0

    .line 368
    invoke-static/range {v3 .. v11}, La/cdk0;->a(La/cdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLa/xck0;ZI)La/cdk0;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 373
    .line 374
    .line 375
    move-result v1

    .line 376
    if-eqz v1, :cond_a

    .line 377
    .line 378
    goto :goto_7

    .line 379
    :cond_c
    iget-object v0, p0, La/fdk0;->v:La/duj;

    .line 380
    .line 381
    new-instance v1, La/edk0;

    .line 382
    .line 383
    invoke-direct {v1, p0, v4}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0, p1, v1}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 387
    .line 388
    .line 389
    :goto_7
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 390
    .line 391
    return-object p0

    .line 392
    :pswitch_8
    check-cast p0, La/ecr;

    .line 393
    .line 394
    check-cast p1, La/xck0;

    .line 395
    .line 396
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    instance-of v0, p1, La/wck0;

    .line 400
    .line 401
    if-eqz v0, :cond_d

    .line 402
    .line 403
    iget-object p0, p0, La/ecr;->b:La/ctf0;

    .line 404
    .line 405
    check-cast p1, La/wck0;

    .line 406
    .line 407
    iget-wide v0, p1, La/wck0;->a:J

    .line 408
    .line 409
    sget-object p1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 410
    .line 411
    const-string v2, "%02d:%02d"

    .line 412
    .line 413
    const-wide/16 v3, 0x3c

    .line 414
    .line 415
    div-long v7, v0, v3

    .line 416
    .line 417
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 418
    .line 419
    .line 420
    move-result-object v7

    .line 421
    rem-long/2addr v0, v3

    .line 422
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    filled-new-array {v7, v0}, [Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    invoke-static {p1, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 435
    .line 436
    .line 437
    move-result-object p1

    .line 438
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    move-result-object p1

    .line 442
    iget-object p0, p0, La/ctf0;->b:La/lsm0;

    .line 443
    .line 444
    invoke-static {p1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 445
    .line 446
    .line 447
    move-result-object p1

    .line 448
    const v0, 0x7f1312fb

    .line 449
    .line 450
    .line 451
    invoke-virtual {p0, v0, p1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    goto :goto_8

    .line 456
    :cond_d
    sget-object p0, La/vck0;->a:La/vck0;

    .line 457
    .line 458
    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 459
    .line 460
    .line 461
    move-result p0

    .line 462
    if-eqz p0, :cond_e

    .line 463
    .line 464
    goto :goto_8

    .line 465
    :cond_e
    invoke-static {}, La/t9f;->b()V

    .line 466
    .line 467
    .line 468
    :goto_8
    return-object v7

    .line 469
    :pswitch_9
    check-cast p0, La/q9k0;

    .line 470
    .line 471
    check-cast p1, La/mu40;

    .line 472
    .line 473
    iget-object p1, p1, La/mu40;->e:La/bet;

    .line 474
    .line 475
    invoke-static {p1}, La/obc;->J(La/bet;)La/bet;

    .line 476
    .line 477
    .line 478
    move-result-object p1

    .line 479
    invoke-virtual {p0, p1}, La/q9k0;->b(La/bet;)I

    .line 480
    .line 481
    .line 482
    move-result p0

    .line 483
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object p0

    .line 487
    return-object p0

    .line 488
    :pswitch_a
    check-cast p0, La/c4k0;

    .line 489
    .line 490
    iget-object v0, p0, La/c4k0;->g:La/jbi0;

    .line 491
    .line 492
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 493
    .line 494
    .line 495
    iget-object v1, p0, La/c4k0;->g:La/jbi0;

    .line 496
    .line 497
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 498
    .line 499
    .line 500
    move-result v0

    .line 501
    if-nez v0, :cond_f

    .line 502
    .line 503
    const-string v0, "Requested a SingleSubscriptionSnapshotFlowManager to manage multiple subscriptions"

    .line 504
    .line 505
    invoke-static {v0}, La/dsb0;->b(Ljava/lang/String;)V

    .line 506
    .line 507
    .line 508
    :cond_f
    iget-object v0, p0, La/c4k0;->f:La/iz40;

    .line 509
    .line 510
    iget-object v1, p0, La/c4k0;->d:Ljava/lang/Object;

    .line 511
    .line 512
    if-nez v0, :cond_11

    .line 513
    .line 514
    if-nez v1, :cond_10

    .line 515
    .line 516
    iput-object p1, p0, La/c4k0;->d:Ljava/lang/Object;

    .line 517
    .line 518
    goto :goto_a

    .line 519
    :cond_10
    sget-object v0, La/v1h0;->a:La/iz40;

    .line 520
    .line 521
    new-instance v0, La/iz40;

    .line 522
    .line 523
    invoke-direct {v0}, La/iz40;-><init>()V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v0, v1}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 527
    .line 528
    .line 529
    invoke-virtual {v0, p1}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 530
    .line 531
    .line 532
    iput-object v0, p0, La/c4k0;->f:La/iz40;

    .line 533
    .line 534
    iput-object v7, p0, La/c4k0;->d:Ljava/lang/Object;

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_11
    if-nez v1, :cond_12

    .line 538
    .line 539
    goto :goto_9

    .line 540
    :cond_12
    const-string p0, "workingSoleWatchedObject must be null when workingWatchSet is non-null"

    .line 541
    .line 542
    invoke-static {p0}, La/dsb0;->b(Ljava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :goto_9
    invoke-virtual {v0, p1}, La/iz40;->a(Ljava/lang/Object;)Z

    .line 546
    .line 547
    .line 548
    :goto_a
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 549
    .line 550
    return-object p0

    .line 551
    :pswitch_b
    check-cast p0, La/gyj0;

    .line 552
    .line 553
    check-cast p1, La/uag0;

    .line 554
    .line 555
    iget v0, p0, La/gyj0;->o:F

    .line 556
    .line 557
    invoke-virtual {p1, v0}, La/uag0;->w(F)V

    .line 558
    .line 559
    .line 560
    iget v0, p0, La/gyj0;->p:F

    .line 561
    .line 562
    invoke-virtual {p1, v0}, La/uag0;->y(F)V

    .line 563
    .line 564
    .line 565
    iget v0, p0, La/gyj0;->q:F

    .line 566
    .line 567
    invoke-virtual {p1, v0}, La/uag0;->b(F)V

    .line 568
    .line 569
    .line 570
    iget v0, p0, La/gyj0;->r:F

    .line 571
    .line 572
    invoke-virtual {p1, v0}, La/uag0;->H(F)V

    .line 573
    .line 574
    .line 575
    iget v0, p0, La/gyj0;->s:F

    .line 576
    .line 577
    invoke-virtual {p1, v0}, La/uag0;->I(F)V

    .line 578
    .line 579
    .line 580
    iget v0, p0, La/gyj0;->t:F

    .line 581
    .line 582
    invoke-virtual {p1, v0}, La/uag0;->C(F)V

    .line 583
    .line 584
    .line 585
    iget v0, p0, La/gyj0;->u:F

    .line 586
    .line 587
    invoke-virtual {p1, v0}, La/uag0;->m(F)V

    .line 588
    .line 589
    .line 590
    iget v0, p0, La/gyj0;->v:F

    .line 591
    .line 592
    invoke-virtual {p1, v0}, La/uag0;->n(F)V

    .line 593
    .line 594
    .line 595
    iget v0, p0, La/gyj0;->w:F

    .line 596
    .line 597
    invoke-virtual {p1, v0}, La/uag0;->v(F)V

    .line 598
    .line 599
    .line 600
    iget v0, p0, La/gyj0;->x:F

    .line 601
    .line 602
    iget v1, p1, La/uag0;->m:F

    .line 603
    .line 604
    cmpg-float v1, v1, v0

    .line 605
    .line 606
    if-nez v1, :cond_13

    .line 607
    .line 608
    goto :goto_b

    .line 609
    :cond_13
    iget v1, p1, La/uag0;->a:I

    .line 610
    .line 611
    or-int/lit16 v1, v1, 0x800

    .line 612
    .line 613
    iput v1, p1, La/uag0;->a:I

    .line 614
    .line 615
    iput v0, p1, La/uag0;->m:F

    .line 616
    .line 617
    :goto_b
    iget-wide v0, p0, La/gyj0;->y:J

    .line 618
    .line 619
    invoke-virtual {p1, v0, v1}, La/uag0;->G(J)V

    .line 620
    .line 621
    .line 622
    iget-object v0, p0, La/gyj0;->z:La/yjj0;

    .line 623
    .line 624
    invoke-virtual {p1, v0}, La/uag0;->D(La/yjj0;)V

    .line 625
    .line 626
    .line 627
    iget-boolean v0, p0, La/gyj0;->A:Z

    .line 628
    .line 629
    invoke-virtual {p1, v0}, La/uag0;->g(Z)V

    .line 630
    .line 631
    .line 632
    iget-object v0, p0, La/gyj0;->B:La/p4;

    .line 633
    .line 634
    invoke-virtual {p1, v0}, La/uag0;->j(La/p4;)V

    .line 635
    .line 636
    .line 637
    iget-wide v0, p0, La/gyj0;->Y:J

    .line 638
    .line 639
    invoke-virtual {p1, v0, v1}, La/uag0;->c(J)V

    .line 640
    .line 641
    .line 642
    iget-wide v0, p0, La/gyj0;->Z:J

    .line 643
    .line 644
    invoke-virtual {p1, v0, v1}, La/uag0;->F(J)V

    .line 645
    .line 646
    .line 647
    iget v0, p0, La/gyj0;->f1:I

    .line 648
    .line 649
    invoke-virtual {p1, v0}, La/uag0;->h(I)V

    .line 650
    .line 651
    .line 652
    iget v0, p0, La/gyj0;->g1:I

    .line 653
    .line 654
    invoke-virtual {p1, v0}, La/uag0;->e(I)V

    .line 655
    .line 656
    .line 657
    iget-object v0, p0, La/gyj0;->h1:La/a4d;

    .line 658
    .line 659
    iget-object v1, p1, La/uag0;->w:La/a4d;

    .line 660
    .line 661
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v1

    .line 665
    if-nez v1, :cond_14

    .line 666
    .line 667
    iget v1, p1, La/uag0;->a:I

    .line 668
    .line 669
    const/high16 v2, 0x40000

    .line 670
    .line 671
    or-int/2addr v1, v2

    .line 672
    iput v1, p1, La/uag0;->a:I

    .line 673
    .line 674
    iput-object v0, p1, La/uag0;->w:La/a4d;

    .line 675
    .line 676
    :cond_14
    iget-object p0, p0, La/gyj0;->i1:La/z5z;

    .line 677
    .line 678
    iget-object v0, p1, La/uag0;->s:La/z5z;

    .line 679
    .line 680
    invoke-static {v0, p0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    move-result v0

    .line 684
    if-nez v0, :cond_15

    .line 685
    .line 686
    iget v0, p1, La/uag0;->a:I

    .line 687
    .line 688
    const/high16 v1, 0x100000

    .line 689
    .line 690
    or-int/2addr v0, v1

    .line 691
    iput v0, p1, La/uag0;->a:I

    .line 692
    .line 693
    iput-object p0, p1, La/uag0;->s:La/z5z;

    .line 694
    .line 695
    :cond_15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object p0

    .line 698
    :pswitch_c
    check-cast p0, La/jvj0;

    .line 699
    .line 700
    check-cast p1, Landroid/view/View;

    .line 701
    .line 702
    sget-object v0, La/jvj0;->W1:La/zie0;

    .line 703
    .line 704
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 705
    .line 706
    .line 707
    invoke-virtual {p0}, La/jvj0;->J0()La/xxj0;

    .line 708
    .line 709
    .line 710
    move-result-object p0

    .line 711
    iget-object p1, p0, La/xxj0;->O:La/ms2;

    .line 712
    .line 713
    instance-of v0, p1, La/ds2;

    .line 714
    .line 715
    if-eqz v0, :cond_16

    .line 716
    .line 717
    check-cast p1, La/ds2;

    .line 718
    .line 719
    invoke-static {p1}, La/g1x;->v(La/ds2;)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    goto :goto_c

    .line 723
    :cond_16
    invoke-static {p1}, La/kpb;->v0(La/ms2;)Ljava/lang/String;

    .line 724
    .line 725
    .line 726
    :goto_c
    iget-object p1, p0, La/xxj0;->S:La/mii0;

    .line 727
    .line 728
    iget-object p1, p1, La/mii0;->b:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast p1, La/kt2;

    .line 731
    .line 732
    const-string v0, "bet_avance_responce"

    .line 733
    .line 734
    invoke-interface {p1, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 735
    .line 736
    .line 737
    iget-object p1, p0, La/xxj0;->X:La/x20;

    .line 738
    .line 739
    iget-object p1, p1, La/x20;->a:La/s1p;

    .line 740
    .line 741
    const-wide/16 v3, 0xc5e

    .line 742
    .line 743
    sget-object v0, La/xun;->a:La/xun;

    .line 744
    .line 745
    invoke-virtual {p1, v0, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 746
    .line 747
    .line 748
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 749
    .line 750
    .line 751
    move-result-object v8

    .line 752
    new-instance v9, La/iwj0;

    .line 753
    .line 754
    invoke-direct {v9, p0, v2}, La/iwj0;-><init>(La/xxj0;B)V

    .line 755
    .line 756
    .line 757
    new-instance v10, La/goi0;

    .line 758
    .line 759
    invoke-direct {v10, p0, v1}, La/goi0;-><init>(Ljava/lang/Object;B)V

    .line 760
    .line 761
    .line 762
    iget-object p1, p0, La/xxj0;->d:La/mne;

    .line 763
    .line 764
    iget-object v11, p1, La/mne;->b:La/dvj;

    .line 765
    .line 766
    new-instance v12, La/ze1;

    .line 767
    .line 768
    invoke-direct {v12, p0, v7}, La/ze1;-><init>(La/xxj0;La/yje;)V

    .line 769
    .line 770
    .line 771
    const/16 v13, 0x8

    .line 772
    .line 773
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 774
    .line 775
    .line 776
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 777
    .line 778
    return-object p0

    .line 779
    :pswitch_d
    check-cast p0, La/hoj0;

    .line 780
    .line 781
    check-cast p1, Ljava/lang/Throwable;

    .line 782
    .line 783
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 784
    .line 785
    .line 786
    iget-object p1, p0, La/hoj0;->n:La/p7m0;

    .line 787
    .line 788
    new-instance v0, La/hm00;

    .line 789
    .line 790
    iget-object v1, p0, La/hoj0;->g:La/sa10;

    .line 791
    .line 792
    sget-object v2, La/pb10;->g:La/pb10;

    .line 793
    .line 794
    const/4 v5, 0x0

    .line 795
    const/16 v6, 0x1c

    .line 796
    .line 797
    const v3, 0x7f130677

    .line 798
    .line 799
    .line 800
    const/4 v4, 0x0

    .line 801
    invoke-static/range {v1 .. v6}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 802
    .line 803
    .line 804
    move-result-object p0

    .line 805
    invoke-direct {v0, p0}, La/hm00;-><init>(La/ra10;)V

    .line 806
    .line 807
    .line 808
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 809
    .line 810
    .line 811
    invoke-virtual {p1, v7, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 812
    .line 813
    .line 814
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 815
    .line 816
    return-object p0

    .line 817
    :pswitch_e
    move-object v0, p0

    .line 818
    check-cast v0, La/eoj0;

    .line 819
    .line 820
    check-cast p1, Ljava/lang/Throwable;

    .line 821
    .line 822
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 823
    .line 824
    .line 825
    iget-object p0, v0, La/i3t0;->i:La/ocj;

    .line 826
    .line 827
    iget-object v3, p0, La/ocj;->a:La/p7m0;

    .line 828
    .line 829
    :cond_17
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 830
    .line 831
    .line 832
    move-result-object p0

    .line 833
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 834
    .line 835
    .line 836
    iget-object p1, v0, La/i3t0;->f:La/oyg0;

    .line 837
    .line 838
    move-object v4, p0

    .line 839
    check-cast v4, La/rnj0;

    .line 840
    .line 841
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 842
    .line 843
    .line 844
    const/4 v8, 0x0

    .line 845
    const/16 v9, 0x9

    .line 846
    .line 847
    const/4 v5, 0x0

    .line 848
    const/4 v6, 0x0

    .line 849
    const/4 v7, 0x1

    .line 850
    invoke-static/range {v4 .. v9}, La/rnj0;->a(La/rnj0;Ljava/io/File;ZZZI)La/rnj0;

    .line 851
    .line 852
    .line 853
    move-result-object p1

    .line 854
    invoke-virtual {v3, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 855
    .line 856
    .line 857
    move-result p0

    .line 858
    if-eqz p0, :cond_17

    .line 859
    .line 860
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 861
    .line 862
    return-object p0

    .line 863
    :pswitch_f
    check-cast p0, La/umj0;

    .line 864
    .line 865
    check-cast p1, La/qnj0;

    .line 866
    .line 867
    sget-object v0, La/umj0;->S1:La/lme0;

    .line 868
    .line 869
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    const-string v0, "image/*"

    .line 873
    .line 874
    sget-object v3, La/mnj0;->a:La/mnj0;

    .line 875
    .line 876
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 877
    .line 878
    .line 879
    move-result v3

    .line 880
    if-eqz v3, :cond_18

    .line 881
    .line 882
    iget-object p1, p0, La/umj0;->Q1:La/n0o0;

    .line 883
    .line 884
    invoke-virtual {p1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 885
    .line 886
    .line 887
    move-result-object p1

    .line 888
    check-cast p1, La/qog0;

    .line 889
    .line 890
    new-instance v0, La/lz9;

    .line 891
    .line 892
    invoke-direct {v0, p1, p0, v1}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 893
    .line 894
    .line 895
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    iget-object v1, p1, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 899
    .line 900
    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    invoke-virtual {p1}, La/qog0;->a()V

    .line 904
    .line 905
    .line 906
    goto/16 :goto_e

    .line 907
    .line 908
    :cond_18
    instance-of v1, p1, La/onj0;

    .line 909
    .line 910
    if-eqz v1, :cond_19

    .line 911
    .line 912
    check-cast p1, La/onj0;

    .line 913
    .line 914
    iget-object v0, p1, La/onj0;->a:Landroid/net/Uri;

    .line 915
    .line 916
    iget-object v1, p1, La/onj0;->b:Ljava/lang/String;

    .line 917
    .line 918
    iget-object p1, p1, La/onj0;->c:Ljava/lang/String;

    .line 919
    .line 920
    new-instance v2, La/g760;

    .line 921
    .line 922
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 923
    .line 924
    .line 925
    move-result-object v3

    .line 926
    invoke-direct {v2, v3, p1}, La/g760;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 927
    .line 928
    .line 929
    const p1, 0x7f080bba

    .line 930
    .line 931
    .line 932
    iget-object v3, v2, La/g760;->s:Landroid/app/Notification;

    .line 933
    .line 934
    iput p1, v3, Landroid/app/Notification;->icon:I

    .line 935
    .line 936
    const p1, 0x7f130734

    .line 937
    .line 938
    .line 939
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 940
    .line 941
    .line 942
    move-result-object v3

    .line 943
    invoke-static {v3}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 944
    .line 945
    .line 946
    move-result-object v3

    .line 947
    iput-object v3, v2, La/g760;->e:Ljava/lang/CharSequence;

    .line 948
    .line 949
    invoke-static {v1}, La/g760;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 950
    .line 951
    .line 952
    move-result-object v1

    .line 953
    iput-object v1, v2, La/g760;->f:Ljava/lang/CharSequence;

    .line 954
    .line 955
    iput v4, v2, La/g760;->j:I

    .line 956
    .line 957
    invoke-virtual {v2, v6}, La/g760;->c(Z)V

    .line 958
    .line 959
    .line 960
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 961
    .line 962
    .line 963
    move-result-object v1

    .line 964
    invoke-static {v1, v0}, La/sj3;->u0(Landroid/content/Context;Landroid/net/Uri;)Landroid/app/PendingIntent;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    iput-object v0, v2, La/g760;->g:Landroid/app/PendingIntent;

    .line 969
    .line 970
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 971
    .line 972
    .line 973
    move-result-object v0

    .line 974
    new-instance v1, La/o760;

    .line 975
    .line 976
    invoke-direct {v1, v0}, La/o760;-><init>(Landroid/content/Context;)V

    .line 977
    .line 978
    .line 979
    sget-object v0, La/f1e0;->a:La/e1e0;

    .line 980
    .line 981
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 982
    .line 983
    .line 984
    sget-object v0, La/f1e0;->b:La/k4;

    .line 985
    .line 986
    invoke-virtual {v0}, La/k4;->b()I

    .line 987
    .line 988
    .line 989
    move-result v0

    .line 990
    invoke-virtual {v2}, La/g760;->a()Landroid/app/Notification;

    .line 991
    .line 992
    .line 993
    move-result-object v2

    .line 994
    invoke-virtual {v1, v0, v2}, La/o760;->a(ILandroid/app/Notification;)V

    .line 995
    .line 996
    .line 997
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 998
    .line 999
    .line 1000
    move-result-object p1

    .line 1001
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1002
    .line 1003
    .line 1004
    invoke-static {p0, p1, v7, v5}, La/umj0;->H0(La/umj0;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1005
    .line 1006
    .line 1007
    goto :goto_e

    .line 1008
    :cond_19
    instance-of v1, p1, La/nnj0;

    .line 1009
    .line 1010
    if-eqz v1, :cond_1a

    .line 1011
    .line 1012
    check-cast p1, La/nnj0;

    .line 1013
    .line 1014
    iget-object p1, p1, La/nnj0;->a:Ljava/io/File;

    .line 1015
    .line 1016
    :try_start_2
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 1017
    .line 1018
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1019
    .line 1020
    .line 1021
    move-result-object v1

    .line 1022
    const-string v2, "org.xbet.client1.provider"

    .line 1023
    .line 1024
    invoke-static {v1, p1, v2}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 1025
    .line 1026
    .line 1027
    move-result-object p1

    .line 1028
    new-instance v1, Landroid/content/Intent;

    .line 1029
    .line 1030
    const-string v2, "android.intent.action.SEND"

    .line 1031
    .line 1032
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 1036
    .line 1037
    .line 1038
    const-string v0, "android.intent.extra.STREAM"

    .line 1039
    .line 1040
    invoke-virtual {v1, v0, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 1041
    .line 1042
    .line 1043
    invoke-static {v7, p1}, Landroid/content/ClipData;->newRawUri(Ljava/lang/CharSequence;Landroid/net/Uri;)Landroid/content/ClipData;

    .line 1044
    .line 1045
    .line 1046
    move-result-object p1

    .line 1047
    invoke-virtual {v1, p1}, Landroid/content/Intent;->setClipData(Landroid/content/ClipData;)V

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v1, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1051
    .line 1052
    .line 1053
    invoke-static {v1, v7}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1054
    .line 1055
    .line 1056
    move-result-object p1

    .line 1057
    invoke-virtual {p0, p1}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 1058
    .line 1059
    .line 1060
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1061
    .line 1062
    goto :goto_d

    .line 1063
    :catchall_1
    move-exception v0

    .line 1064
    move-object p1, v0

    .line 1065
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 1066
    .line 1067
    new-instance v0, La/g0g0;

    .line 1068
    .line 1069
    invoke-direct {v0, p1}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 1070
    .line 1071
    .line 1072
    move-object p1, v0

    .line 1073
    :goto_d
    invoke-static {p1}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1074
    .line 1075
    .line 1076
    move-result-object p1

    .line 1077
    if-eqz p1, :cond_1b

    .line 1078
    .line 1079
    invoke-virtual {p0}, La/umj0;->G0()La/k3t0;

    .line 1080
    .line 1081
    .line 1082
    move-result-object v0

    .line 1083
    new-instance v1, La/gmj0;

    .line 1084
    .line 1085
    invoke-direct {v1, p1}, La/gmj0;-><init>(Ljava/lang/Throwable;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1089
    .line 1090
    .line 1091
    goto :goto_e

    .line 1092
    :cond_1a
    instance-of v0, p1, La/pnj0;

    .line 1093
    .line 1094
    if-eqz v0, :cond_1c

    .line 1095
    .line 1096
    check-cast p1, La/pnj0;

    .line 1097
    .line 1098
    iget-object v0, p1, La/pnj0;->a:Ljava/lang/String;

    .line 1099
    .line 1100
    iget-object p1, p1, La/pnj0;->b:Ljava/lang/String;

    .line 1101
    .line 1102
    invoke-static {p0, v0, p1, v2}, La/umj0;->H0(La/umj0;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1103
    .line 1104
    .line 1105
    :cond_1b
    :goto_e
    invoke-virtual {p0}, La/umj0;->G0()La/k3t0;

    .line 1106
    .line 1107
    .line 1108
    move-result-object p0

    .line 1109
    sget-object p1, La/fmj0;->a:La/fmj0;

    .line 1110
    .line 1111
    invoke-virtual {p0, p1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1112
    .line 1113
    .line 1114
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1115
    .line 1116
    goto :goto_f

    .line 1117
    :cond_1c
    invoke-static {}, La/t9f;->b()V

    .line 1118
    .line 1119
    .line 1120
    :goto_f
    return-object v7

    .line 1121
    :pswitch_10
    check-cast p0, La/njj0;

    .line 1122
    .line 1123
    check-cast p1, La/uag0;

    .line 1124
    .line 1125
    iget v0, p0, La/njj0;->b:F

    .line 1126
    .line 1127
    iget-object v1, p1, La/uag0;->t:La/w6k;

    .line 1128
    .line 1129
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 1130
    .line 1131
    .line 1132
    move-result v1

    .line 1133
    mul-float/2addr v1, v0

    .line 1134
    invoke-virtual {p1, v1}, La/uag0;->C(F)V

    .line 1135
    .line 1136
    .line 1137
    iget-object v0, p0, La/njj0;->c:La/yjj0;

    .line 1138
    .line 1139
    invoke-virtual {p1, v0}, La/uag0;->D(La/yjj0;)V

    .line 1140
    .line 1141
    .line 1142
    iget-boolean v0, p0, La/njj0;->d:Z

    .line 1143
    .line 1144
    invoke-virtual {p1, v0}, La/uag0;->g(Z)V

    .line 1145
    .line 1146
    .line 1147
    iget-wide v0, p0, La/njj0;->e:J

    .line 1148
    .line 1149
    invoke-virtual {p1, v0, v1}, La/uag0;->c(J)V

    .line 1150
    .line 1151
    .line 1152
    iget-wide v0, p0, La/njj0;->f:J

    .line 1153
    .line 1154
    invoke-virtual {p1, v0, v1}, La/uag0;->F(J)V

    .line 1155
    .line 1156
    .line 1157
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1158
    .line 1159
    return-object p0

    .line 1160
    :pswitch_11
    check-cast p0, La/q1j0;

    .line 1161
    .line 1162
    check-cast p1, La/cp;

    .line 1163
    .line 1164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1165
    .line 1166
    .line 1167
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 1168
    .line 1169
    check-cast v0, La/nxx;

    .line 1170
    .line 1171
    iget-object v0, v0, La/nxx;->d:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1172
    .line 1173
    new-instance v1, La/okv;

    .line 1174
    .line 1175
    invoke-direct {v1, p1, p0}, La/okv;-><init>(La/cp;La/q1j0;)V

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1179
    .line 1180
    .line 1181
    new-instance p0, La/ctv;

    .line 1182
    .line 1183
    const/16 v0, 0x1d

    .line 1184
    .line 1185
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 1186
    .line 1187
    .line 1188
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1189
    .line 1190
    .line 1191
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1192
    .line 1193
    return-object p0

    .line 1194
    :pswitch_12
    check-cast p0, La/k7u;

    .line 1195
    .line 1196
    check-cast p1, La/vzg0;

    .line 1197
    .line 1198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    new-instance p1, La/f0j0;

    .line 1202
    .line 1203
    iget-object p0, p0, La/k7u;->a:La/uzc;

    .line 1204
    .line 1205
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 1206
    .line 1207
    .line 1208
    move-result-object p0

    .line 1209
    sget-object v0, La/jvn;->i:La/c0o;

    .line 1210
    .line 1211
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v0

    .line 1215
    invoke-direct {p1, p0, v0}, La/f0j0;-><init>(La/jvn;Ljava/util/List;)V

    .line 1216
    .line 1217
    .line 1218
    return-object p1

    .line 1219
    :pswitch_13
    check-cast p0, La/i0j0;

    .line 1220
    .line 1221
    check-cast p1, La/k0w0;

    .line 1222
    .line 1223
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1224
    .line 1225
    .line 1226
    iget-object p0, p0, La/i0j0;->o:La/gle0;

    .line 1227
    .line 1228
    new-instance v1, Lorg/xplatform/rules/api/presentation/models/RuleData;

    .line 1229
    .line 1230
    const-string v0, "rules_odds_type"

    .line 1231
    .line 1232
    const/16 v2, 0xe

    .line 1233
    .line 1234
    invoke-direct {v1, v0, v2, v7, v7}, Lorg/xplatform/rules/api/presentation/models/RuleData;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1238
    .line 1239
    .line 1240
    new-instance v0, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;

    .line 1241
    .line 1242
    const v2, 0x7f130a47

    .line 1243
    .line 1244
    .line 1245
    const/4 v3, 0x0

    .line 1246
    const/4 v4, 0x0

    .line 1247
    const/4 v5, 0x0

    .line 1248
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/rules/impl/navigation/RulesScreenFactoryImpl$getRulesFragmentScreen$1;-><init>(Lorg/xplatform/rules/api/presentation/models/RuleData;IZZZ)V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {p1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1252
    .line 1253
    .line 1254
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1255
    .line 1256
    return-object p0

    .line 1257
    :pswitch_14
    check-cast p0, La/nui0;

    .line 1258
    .line 1259
    check-cast p1, La/abi0;

    .line 1260
    .line 1261
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1262
    .line 1263
    .line 1264
    iget-object p0, p0, La/nui0;->c:La/o0x;

    .line 1265
    .line 1266
    instance-of v0, p0, La/m0x;

    .line 1267
    .line 1268
    if-eqz v0, :cond_1d

    .line 1269
    .line 1270
    check-cast p0, La/m0x;

    .line 1271
    .line 1272
    iget v4, p0, La/m0x;->a:I

    .line 1273
    .line 1274
    :cond_1d
    invoke-static {p1, v4}, La/cbi0;->c(La/abi0;I)V

    .line 1275
    .line 1276
    .line 1277
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1278
    .line 1279
    return-object p0

    .line 1280
    :pswitch_15
    check-cast p0, La/lma0;

    .line 1281
    .line 1282
    check-cast p1, La/cp;

    .line 1283
    .line 1284
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 1288
    .line 1289
    check-cast v0, La/exx;

    .line 1290
    .line 1291
    iget-object v0, v0, La/exx;->b:Lorg/xplatform/uikit/components/cells/right/DsCellRightSwitch;

    .line 1292
    .line 1293
    new-instance v1, La/okv;

    .line 1294
    .line 1295
    invoke-direct {v1, v5, p0, p1}, La/okv;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 1296
    .line 1297
    .line 1298
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 1299
    .line 1300
    .line 1301
    new-instance p0, La/ctv;

    .line 1302
    .line 1303
    const/16 v0, 0x16

    .line 1304
    .line 1305
    invoke-direct {p0, p1, p1, v0}, La/ctv;-><init>(La/cp;La/cp;B)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1309
    .line 1310
    .line 1311
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1312
    .line 1313
    return-object p0

    .line 1314
    :pswitch_16
    check-cast p0, La/lmi0;

    .line 1315
    .line 1316
    check-cast p1, Ljava/lang/Throwable;

    .line 1317
    .line 1318
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    iget-boolean p1, p0, La/lmi0;->i:Z

    .line 1322
    .line 1323
    if-eqz p1, :cond_1e

    .line 1324
    .line 1325
    invoke-virtual {p0}, La/lmi0;->c()V

    .line 1326
    .line 1327
    .line 1328
    :cond_1e
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1329
    .line 1330
    return-object p0

    .line 1331
    :pswitch_17
    check-cast p0, La/uki0;

    .line 1332
    .line 1333
    check-cast p1, La/cp;

    .line 1334
    .line 1335
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1336
    .line 1337
    .line 1338
    iget-object v0, p1, La/cp;->u:La/yfu0;

    .line 1339
    .line 1340
    check-cast v0, La/djj0;

    .line 1341
    .line 1342
    iget-object v0, v0, La/djj0;->a:Landroid/widget/FrameLayout;

    .line 1343
    .line 1344
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1345
    .line 1346
    .line 1347
    new-instance v1, La/huh0;

    .line 1348
    .line 1349
    invoke-direct {v1, p0, p1, v3}, La/huh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1350
    .line 1351
    .line 1352
    invoke-static {v0, v1}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1353
    .line 1354
    .line 1355
    new-instance p0, La/ui80;

    .line 1356
    .line 1357
    const/16 v0, 0x19

    .line 1358
    .line 1359
    invoke-direct {p0, p1, v0}, La/ui80;-><init>(La/cp;B)V

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1363
    .line 1364
    .line 1365
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1366
    .line 1367
    return-object p0

    .line 1368
    :pswitch_18
    check-cast p0, La/jiy;

    .line 1369
    .line 1370
    check-cast p1, Ljava/util/List;

    .line 1371
    .line 1372
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1373
    .line 1374
    .line 1375
    return-object p0

    .line 1376
    :pswitch_19
    check-cast p0, Lkotlin/ranges/IntRange;

    .line 1377
    .line 1378
    check-cast p1, La/kls0;

    .line 1379
    .line 1380
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1381
    .line 1382
    .line 1383
    iget-object p1, p1, La/kls0;->a:[I

    .line 1384
    .line 1385
    array-length v0, p1

    .line 1386
    move v1, v4

    .line 1387
    :goto_10
    if-ge v1, v0, :cond_20

    .line 1388
    .line 1389
    aget v2, p1, v1

    .line 1390
    .line 1391
    invoke-virtual {p0, v2}, Lkotlin/ranges/IntRange;->b(I)Z

    .line 1392
    .line 1393
    .line 1394
    move-result v2

    .line 1395
    if-eqz v2, :cond_1f

    .line 1396
    .line 1397
    move v4, v6

    .line 1398
    goto :goto_11

    .line 1399
    :cond_1f
    add-int/lit8 v1, v1, 0x1

    .line 1400
    .line 1401
    goto :goto_10

    .line 1402
    :cond_20
    :goto_11
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1403
    .line 1404
    .line 1405
    move-result-object p0

    .line 1406
    return-object p0

    .line 1407
    :pswitch_1a
    check-cast p0, La/ldi0;

    .line 1408
    .line 1409
    check-cast p1, Ljava/lang/Boolean;

    .line 1410
    .line 1411
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1412
    .line 1413
    .line 1414
    move-result v7

    .line 1415
    iget-object v9, p0, La/ldi0;->H:La/p7m0;

    .line 1416
    .line 1417
    :cond_21
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1418
    .line 1419
    .line 1420
    move-result-object p0

    .line 1421
    move-object v0, p0

    .line 1422
    check-cast v0, La/uci0;

    .line 1423
    .line 1424
    const/4 v6, 0x0

    .line 1425
    const/16 v8, 0x7ff

    .line 1426
    .line 1427
    const/4 v1, 0x0

    .line 1428
    const/4 v2, 0x0

    .line 1429
    const/4 v3, 0x0

    .line 1430
    const/4 v4, 0x0

    .line 1431
    const/4 v5, 0x0

    .line 1432
    invoke-static/range {v0 .. v8}, La/uci0;->a(La/uci0;ZZZZLa/eci0;ZZI)La/uci0;

    .line 1433
    .line 1434
    .line 1435
    move-result-object p1

    .line 1436
    invoke-virtual {v9, p0, p1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1437
    .line 1438
    .line 1439
    move-result p0

    .line 1440
    if-eqz p0, :cond_21

    .line 1441
    .line 1442
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1443
    .line 1444
    return-object p0

    .line 1445
    :pswitch_1b
    check-cast p0, La/ccz;

    .line 1446
    .line 1447
    check-cast p1, Ljava/util/List;

    .line 1448
    .line 1449
    invoke-virtual {p0}, La/ccz;->invoke()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object p0

    .line 1453
    check-cast p0, Ljava/lang/Float;

    .line 1454
    .line 1455
    invoke-interface {p1, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1456
    .line 1457
    .line 1458
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1459
    .line 1460
    .line 1461
    move-result-object p0

    .line 1462
    return-object p0

    .line 1463
    :pswitch_1c
    check-cast p0, La/ucg0;

    .line 1464
    .line 1465
    check-cast p1, La/abi0;

    .line 1466
    .line 1467
    iget-byte p0, p0, La/ucg0;->a:B

    .line 1468
    .line 1469
    invoke-static {p1, p0}, La/yai0;->e(La/abi0;I)V

    .line 1470
    .line 1471
    .line 1472
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1473
    .line 1474
    return-object p0

    .line 1475
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
