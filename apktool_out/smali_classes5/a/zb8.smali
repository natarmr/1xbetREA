.class public final synthetic La/zb8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/mwa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V
    .locals 0

    .line 1
    const/16 p4, 0x1d

    iput-byte p4, p0, La/zb8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zb8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zb8;->d:Ljava/lang/Object;

    iput-object p3, p0, La/zb8;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/ydr;La/mm40;Ljava/util/List;)V
    .locals 1

    .line 2
    const/16 v0, 0x17

    iput-byte v0, p0, La/zb8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zb8;->c:Ljava/lang/Object;

    iput-object p2, p0, La/zb8;->b:Ljava/lang/Object;

    iput-object p3, p0, La/zb8;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p4, p0, La/zb8;->a:B

    iput-object p1, p0, La/zb8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zb8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/zb8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V
    .locals 0

    .line 4
    iput-byte p5, p0, La/zb8;->a:B

    iput-object p1, p0, La/zb8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zb8;->c:Ljava/lang/Object;

    iput-object p3, p0, La/zb8;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lorg/xplatform/uikit/compose/color/ThemeColors;La/g1t0;Ljava/lang/String;)V
    .locals 0

    .line 5
    const/4 p3, 0x1

    iput-byte p3, p0, La/zb8;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zb8;->b:Ljava/lang/Object;

    iput-object p2, p0, La/zb8;->c:Ljava/lang/Object;

    iput-object p4, p0, La/zb8;->d:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zb8;->a:B

    .line 4
    .line 5
    const/high16 v2, 0x3f800000    # 1.0f

    .line 6
    .line 7
    sget-object v3, La/e7z;->u1:La/pcy;

    .line 8
    .line 9
    const/16 v4, 0x181

    .line 10
    .line 11
    sget-object v5, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    sget-object v6, La/jm40;->b:La/jm40;

    .line 14
    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x7

    .line 17
    const/16 v9, 0x30

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const/4 v11, 0x2

    .line 21
    const/4 v12, 0x1

    .line 22
    iget-object v13, v0, La/zb8;->c:Ljava/lang/Object;

    .line 23
    .line 24
    iget-object v14, v0, La/zb8;->d:Ljava/lang/Object;

    .line 25
    .line 26
    iget-object v0, v0, La/zb8;->b:Ljava/lang/Object;

    .line 27
    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    check-cast v0, La/mwa;

    .line 32
    .line 33
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 34
    .line 35
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La/fet;

    .line 40
    .line 41
    move-object/from16 v2, p2

    .line 42
    .line 43
    check-cast v2, Ljava/lang/Integer;

    .line 44
    .line 45
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-static {v8}, La/x8x;->L(I)I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-static {v0, v14, v13, v1, v2}, La/y9a;->k(La/mwa;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    check-cast v0, La/mm40;

    .line 59
    .line 60
    check-cast v13, La/mua;

    .line 61
    .line 62
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 63
    .line 64
    move-object/from16 v1, p1

    .line 65
    .line 66
    check-cast v1, La/fet;

    .line 67
    .line 68
    move-object/from16 v2, p2

    .line 69
    .line 70
    check-cast v2, Ljava/lang/Integer;

    .line 71
    .line 72
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-static {v12}, La/x8x;->L(I)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    invoke-static {v0, v13, v14, v1, v2}, La/q8a;->d(La/mm40;La/mua;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 80
    .line 81
    .line 82
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_1
    check-cast v0, La/ara;

    .line 86
    .line 87
    check-cast v13, La/xak;

    .line 88
    .line 89
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 90
    .line 91
    move-object/from16 v1, p1

    .line 92
    .line 93
    check-cast v1, La/fet;

    .line 94
    .line 95
    move-object/from16 v2, p2

    .line 96
    .line 97
    check-cast v2, Ljava/lang/Integer;

    .line 98
    .line 99
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    and-int/lit8 v3, v2, 0x3

    .line 104
    .line 105
    if-eq v3, v11, :cond_0

    .line 106
    .line 107
    move v3, v12

    .line 108
    goto :goto_0

    .line 109
    :cond_0
    move v3, v10

    .line 110
    :goto_0
    and-int/2addr v2, v12

    .line 111
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 112
    .line 113
    .line 114
    move-result v2

    .line 115
    if-eqz v2, :cond_6

    .line 116
    .line 117
    instance-of v2, v0, La/xqa;

    .line 118
    .line 119
    if-eqz v2, :cond_1

    .line 120
    .line 121
    const v2, 0x248a0974

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 125
    .line 126
    .line 127
    check-cast v0, La/xqa;

    .line 128
    .line 129
    iget-object v0, v0, La/xqa;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 130
    .line 131
    const/16 v2, 0x46

    .line 132
    .line 133
    invoke-virtual {v13, v6, v0, v1, v2}, La/xak;->o(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;La/fet;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 137
    .line 138
    .line 139
    goto :goto_1

    .line 140
    :cond_1
    instance-of v2, v0, La/yqa;

    .line 141
    .line 142
    if-eqz v2, :cond_4

    .line 143
    .line 144
    const v2, 0x248d78d6

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 148
    .line 149
    .line 150
    move-object v2, v0

    .line 151
    check-cast v2, La/yqa;

    .line 152
    .line 153
    iget-object v2, v2, La/yqa;->a:Ljava/lang/String;

    .line 154
    .line 155
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v4

    .line 163
    or-int/2addr v3, v4

    .line 164
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v4

    .line 168
    if-nez v3, :cond_2

    .line 169
    .line 170
    if-ne v4, v5, :cond_3

    .line 171
    .line 172
    :cond_2
    new-instance v4, La/yw9;

    .line 173
    .line 174
    const/4 v3, 0x3

    .line 175
    invoke-direct {v4, v14, v0, v3}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 182
    .line 183
    invoke-static {v7, v2, v4, v1, v10}, La/ahy;->j(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 187
    .line 188
    .line 189
    goto :goto_1

    .line 190
    :cond_4
    instance-of v2, v0, La/zqa;

    .line 191
    .line 192
    if-eqz v2, :cond_5

    .line 193
    .line 194
    const v2, 0x2490e7bc

    .line 195
    .line 196
    .line 197
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    check-cast v0, La/zqa;

    .line 201
    .line 202
    iget-object v0, v0, La/zqa;->a:Ljava/lang/String;

    .line 203
    .line 204
    invoke-static {v10, v1, v7, v0}, La/lv00;->p(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 208
    .line 209
    .line 210
    goto :goto_1

    .line 211
    :cond_5
    const v0, 0x2235f97d

    .line 212
    .line 213
    .line 214
    invoke-static {v0, v1, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    throw v0

    .line 219
    :cond_6
    invoke-virtual {v1}, La/fet;->X()V

    .line 220
    .line 221
    .line 222
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 223
    .line 224
    return-object v0

    .line 225
    :pswitch_2
    check-cast v0, La/soa;

    .line 226
    .line 227
    move-object v15, v13

    .line 228
    check-cast v15, La/nek;

    .line 229
    .line 230
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 231
    .line 232
    move-object/from16 v1, p1

    .line 233
    .line 234
    check-cast v1, La/fet;

    .line 235
    .line 236
    move-object/from16 v2, p2

    .line 237
    .line 238
    check-cast v2, Ljava/lang/Integer;

    .line 239
    .line 240
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 241
    .line 242
    .line 243
    move-result v2

    .line 244
    and-int/lit8 v3, v2, 0x3

    .line 245
    .line 246
    if-eq v3, v11, :cond_7

    .line 247
    .line 248
    move v3, v12

    .line 249
    goto :goto_2

    .line 250
    :cond_7
    move v3, v10

    .line 251
    :goto_2
    and-int/2addr v2, v12

    .line 252
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 253
    .line 254
    .line 255
    move-result v2

    .line 256
    if-eqz v2, :cond_d

    .line 257
    .line 258
    instance-of v2, v0, La/poa;

    .line 259
    .line 260
    if-eqz v2, :cond_8

    .line 261
    .line 262
    const v2, 0x5c71eb70

    .line 263
    .line 264
    .line 265
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 266
    .line 267
    .line 268
    check-cast v0, La/poa;

    .line 269
    .line 270
    iget-object v0, v0, La/poa;->a:Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;

    .line 271
    .line 272
    new-instance v2, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;

    .line 273
    .line 274
    sget-object v3, La/jxs;->a:[La/jxs;

    .line 275
    .line 276
    const/4 v6, -0x1

    .line 277
    sget-object v7, Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;->a:Lorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme$Static;

    .line 278
    .line 279
    const-string v3, "16:9"

    .line 280
    .line 281
    const v4, 0x7f0700a5

    .line 282
    .line 283
    .line 284
    const/4 v5, -0x1

    .line 285
    invoke-direct/range {v2 .. v7}, Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;-><init>(Ljava/lang/String;IIILorg/xplatform/game_broadcasting/api/presentation/GameVideoPlayerColorScheme;)V

    .line 286
    .line 287
    .line 288
    const/16 v20, 0x46

    .line 289
    .line 290
    sget-object v16, La/jm40;->b:La/jm40;

    .line 291
    .line 292
    move-object/from16 v17, v0

    .line 293
    .line 294
    move-object/from16 v19, v1

    .line 295
    .line 296
    move-object/from16 v18, v2

    .line 297
    .line 298
    invoke-virtual/range {v15 .. v20}, La/nek;->e(La/mm40;Lorg/xplatform/game_broadcasting/api/presentation/models/GameBroadcastingParams;Lorg/xplatform/game_broadcasting/api/presentation/models/GameVideoUiConfig;La/fet;I)V

    .line 299
    .line 300
    .line 301
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 302
    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_8
    instance-of v2, v0, La/qoa;

    .line 306
    .line 307
    if-eqz v2, :cond_b

    .line 308
    .line 309
    const v2, 0x5c7bd4f5

    .line 310
    .line 311
    .line 312
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 313
    .line 314
    .line 315
    move-object v2, v0

    .line 316
    check-cast v2, La/qoa;

    .line 317
    .line 318
    iget-object v2, v2, La/qoa;->a:Ljava/lang/String;

    .line 319
    .line 320
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v3

    .line 324
    invoke-virtual {v1, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v4

    .line 328
    or-int/2addr v3, v4

    .line 329
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    if-nez v3, :cond_9

    .line 334
    .line 335
    if-ne v4, v5, :cond_a

    .line 336
    .line 337
    :cond_9
    new-instance v4, La/yw9;

    .line 338
    .line 339
    invoke-direct {v4, v14, v0, v11}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 343
    .line 344
    .line 345
    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 346
    .line 347
    invoke-static {v7, v2, v4, v1, v10}, La/ahy;->j(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 351
    .line 352
    .line 353
    goto :goto_3

    .line 354
    :cond_b
    instance-of v2, v0, La/roa;

    .line 355
    .line 356
    if-eqz v2, :cond_c

    .line 357
    .line 358
    const v2, 0x5c7f91f6

    .line 359
    .line 360
    .line 361
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 362
    .line 363
    .line 364
    check-cast v0, La/roa;

    .line 365
    .line 366
    iget-object v0, v0, La/roa;->a:Ljava/lang/String;

    .line 367
    .line 368
    invoke-static {v10, v1, v7, v0}, La/lv00;->p(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v1, v10}, La/fet;->r(Z)V

    .line 372
    .line 373
    .line 374
    goto :goto_3

    .line 375
    :cond_c
    const v0, 0x450be7d3

    .line 376
    .line 377
    .line 378
    invoke-static {v0, v1, v10}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    throw v0

    .line 383
    :cond_d
    invoke-virtual {v1}, La/fet;->X()V

    .line 384
    .line 385
    .line 386
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    return-object v0

    .line 389
    :pswitch_3
    check-cast v0, La/mm40;

    .line 390
    .line 391
    check-cast v13, La/wka;

    .line 392
    .line 393
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 394
    .line 395
    move-object/from16 v1, p1

    .line 396
    .line 397
    check-cast v1, La/fet;

    .line 398
    .line 399
    move-object/from16 v2, p2

    .line 400
    .line 401
    check-cast v2, Ljava/lang/Integer;

    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-static {v12}, La/x8x;->L(I)I

    .line 407
    .line 408
    .line 409
    move-result v2

    .line 410
    invoke-static {v0, v13, v14, v1, v2}, La/j47;->Q(La/mm40;La/wka;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 411
    .line 412
    .line 413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 414
    .line 415
    return-object v0

    .line 416
    :pswitch_4
    check-cast v0, La/mm40;

    .line 417
    .line 418
    check-cast v13, La/vka;

    .line 419
    .line 420
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 421
    .line 422
    move-object/from16 v1, p1

    .line 423
    .line 424
    check-cast v1, La/fet;

    .line 425
    .line 426
    move-object/from16 v2, p2

    .line 427
    .line 428
    check-cast v2, Ljava/lang/Integer;

    .line 429
    .line 430
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 431
    .line 432
    .line 433
    invoke-static {v12}, La/x8x;->L(I)I

    .line 434
    .line 435
    .line 436
    move-result v2

    .line 437
    invoke-static {v0, v13, v14, v1, v2}, La/kc5;->S(La/mm40;La/vka;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 438
    .line 439
    .line 440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 441
    .line 442
    return-object v0

    .line 443
    :pswitch_5
    check-cast v13, La/ydr;

    .line 444
    .line 445
    check-cast v0, La/mm40;

    .line 446
    .line 447
    check-cast v14, Ljava/util/List;

    .line 448
    .line 449
    move-object/from16 v1, p1

    .line 450
    .line 451
    check-cast v1, La/fet;

    .line 452
    .line 453
    move-object/from16 v2, p2

    .line 454
    .line 455
    check-cast v2, Ljava/lang/Integer;

    .line 456
    .line 457
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 458
    .line 459
    .line 460
    move-result v2

    .line 461
    and-int/lit8 v3, v2, 0x3

    .line 462
    .line 463
    if-eq v3, v11, :cond_e

    .line 464
    .line 465
    move v10, v12

    .line 466
    :cond_e
    and-int/2addr v2, v12

    .line 467
    invoke-virtual {v1, v2, v10}, La/fet;->U(IZ)Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-eqz v2, :cond_f

    .line 472
    .line 473
    new-instance v2, La/jka;

    .line 474
    .line 475
    invoke-direct {v2, v14, v12}, La/jka;-><init>(Ljava/util/List;B)V

    .line 476
    .line 477
    .line 478
    const v3, 0x66d9a0ee

    .line 479
    .line 480
    .line 481
    invoke-static {v3, v2, v1}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-interface {v13, v0, v2, v1, v3}, La/ydr;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    goto :goto_4

    .line 493
    :cond_f
    invoke-virtual {v1}, La/fet;->X()V

    .line 494
    .line 495
    .line 496
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 497
    .line 498
    return-object v0

    .line 499
    :pswitch_6
    move-object v1, v0

    .line 500
    check-cast v1, La/mm40;

    .line 501
    .line 502
    move-object v2, v13

    .line 503
    check-cast v2, La/gdp0;

    .line 504
    .line 505
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 506
    .line 507
    move-object/from16 v5, p1

    .line 508
    .line 509
    check-cast v5, La/fet;

    .line 510
    .line 511
    move-object/from16 v0, p2

    .line 512
    .line 513
    check-cast v0, Ljava/lang/Integer;

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    and-int/lit8 v3, v0, 0x3

    .line 520
    .line 521
    if-eq v3, v11, :cond_10

    .line 522
    .line 523
    move v10, v12

    .line 524
    :cond_10
    and-int/2addr v0, v12

    .line 525
    invoke-virtual {v5, v0, v10}, La/fet;->U(IZ)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_11

    .line 530
    .line 531
    new-instance v0, La/naa;

    .line 532
    .line 533
    invoke-direct {v0, v14, v11}, La/naa;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 534
    .line 535
    .line 536
    const v3, -0x231fd4a9

    .line 537
    .line 538
    .line 539
    invoke-static {v3, v0, v5}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 540
    .line 541
    .line 542
    move-result-object v4

    .line 543
    const/16 v6, 0x6000

    .line 544
    .line 545
    const/16 v7, 0xc

    .line 546
    .line 547
    const/4 v3, 0x0

    .line 548
    invoke-static/range {v1 .. v7}, La/dwi0;->h(La/mm40;La/xdp0;La/ow3;La/ugd;La/fet;II)V

    .line 549
    .line 550
    .line 551
    goto :goto_5

    .line 552
    :cond_11
    invoke-virtual {v5}, La/fet;->X()V

    .line 553
    .line 554
    .line 555
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 556
    .line 557
    return-object v0

    .line 558
    :pswitch_7
    check-cast v0, La/mm40;

    .line 559
    .line 560
    check-cast v13, La/nea;

    .line 561
    .line 562
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 563
    .line 564
    move-object/from16 v1, p1

    .line 565
    .line 566
    check-cast v1, La/fet;

    .line 567
    .line 568
    move-object/from16 v2, p2

    .line 569
    .line 570
    check-cast v2, Ljava/lang/Integer;

    .line 571
    .line 572
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-static {v4}, La/x8x;->L(I)I

    .line 576
    .line 577
    .line 578
    move-result v2

    .line 579
    invoke-static {v0, v13, v14, v1, v2}, La/ffb0;->i(La/mm40;La/nea;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_8
    check-cast v0, La/mm40;

    .line 586
    .line 587
    check-cast v13, La/iea;

    .line 588
    .line 589
    check-cast v14, La/l7m0;

    .line 590
    .line 591
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, La/fet;

    .line 594
    .line 595
    move-object/from16 v2, p2

    .line 596
    .line 597
    check-cast v2, Ljava/lang/Integer;

    .line 598
    .line 599
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-static {v4}, La/x8x;->L(I)I

    .line 603
    .line 604
    .line 605
    move-result v2

    .line 606
    invoke-static {v0, v13, v14, v1, v2}, La/dea;->b(La/mm40;La/iea;La/l7m0;La/fet;I)V

    .line 607
    .line 608
    .line 609
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 610
    .line 611
    return-object v0

    .line 612
    :pswitch_9
    check-cast v0, La/mm40;

    .line 613
    .line 614
    check-cast v13, La/oda;

    .line 615
    .line 616
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 617
    .line 618
    move-object/from16 v1, p1

    .line 619
    .line 620
    check-cast v1, La/fet;

    .line 621
    .line 622
    move-object/from16 v2, p2

    .line 623
    .line 624
    check-cast v2, Ljava/lang/Integer;

    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    invoke-static {v12}, La/x8x;->L(I)I

    .line 630
    .line 631
    .line 632
    move-result v2

    .line 633
    invoke-static {v0, v13, v14, v1, v2}, La/xia0;->m(La/mm40;La/oda;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 634
    .line 635
    .line 636
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object v0

    .line 639
    :pswitch_a
    check-cast v0, La/mm40;

    .line 640
    .line 641
    check-cast v13, La/nda;

    .line 642
    .line 643
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 644
    .line 645
    move-object/from16 v1, p1

    .line 646
    .line 647
    check-cast v1, La/fet;

    .line 648
    .line 649
    move-object/from16 v2, p2

    .line 650
    .line 651
    check-cast v2, Ljava/lang/Integer;

    .line 652
    .line 653
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 654
    .line 655
    .line 656
    invoke-static {v12}, La/x8x;->L(I)I

    .line 657
    .line 658
    .line 659
    move-result v2

    .line 660
    invoke-static {v0, v13, v14, v1, v2}, La/i120;->l(La/mm40;La/nda;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 661
    .line 662
    .line 663
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 664
    .line 665
    return-object v0

    .line 666
    :pswitch_b
    check-cast v0, La/uaa;

    .line 667
    .line 668
    check-cast v13, La/uaa;

    .line 669
    .line 670
    check-cast v14, La/uaa;

    .line 671
    .line 672
    move-object/from16 v1, p1

    .line 673
    .line 674
    check-cast v1, La/fet;

    .line 675
    .line 676
    move-object/from16 v4, p2

    .line 677
    .line 678
    check-cast v4, Ljava/lang/Integer;

    .line 679
    .line 680
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    and-int/lit8 v5, v4, 0x3

    .line 685
    .line 686
    if-eq v5, v11, :cond_12

    .line 687
    .line 688
    move v5, v12

    .line 689
    goto :goto_6

    .line 690
    :cond_12
    move v5, v10

    .line 691
    :goto_6
    and-int/2addr v4, v12

    .line 692
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 693
    .line 694
    .line 695
    move-result v4

    .line 696
    if-eqz v4, :cond_18

    .line 697
    .line 698
    invoke-static {v6, v2}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 699
    .line 700
    .line 701
    move-result-object v4

    .line 702
    sget-object v5, La/qmk;->a:La/zcl;

    .line 703
    .line 704
    const/high16 v5, 0x42100000    # 36.0f

    .line 705
    .line 706
    invoke-static {v4, v5}, La/o7k0;->e(La/mm40;F)La/mm40;

    .line 707
    .line 708
    .line 709
    move-result-object v4

    .line 710
    const/high16 v5, 0x41c00000    # 24.0f

    .line 711
    .line 712
    const/high16 v6, 0x40800000    # 4.0f

    .line 713
    .line 714
    invoke-static {v4, v5, v6}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 715
    .line 716
    .line 717
    move-result-object v4

    .line 718
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 719
    .line 720
    sget-object v6, La/uc9;->a:La/lw3;

    .line 721
    .line 722
    invoke-static {v6, v5, v1, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 723
    .line 724
    .line 725
    move-result-object v5

    .line 726
    iget-wide v8, v1, La/fet;->T:J

    .line 727
    .line 728
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 729
    .line 730
    .line 731
    move-result v6

    .line 732
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 733
    .line 734
    .line 735
    move-result-object v8

    .line 736
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 737
    .line 738
    .line 739
    move-result-object v4

    .line 740
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 741
    .line 742
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1}, La/fet;->i0()V

    .line 746
    .line 747
    .line 748
    iget-boolean v9, v1, La/fet;->S:Z

    .line 749
    .line 750
    if-eqz v9, :cond_13

    .line 751
    .line 752
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 753
    .line 754
    .line 755
    goto :goto_7

    .line 756
    :cond_13
    invoke-virtual {v1}, La/fet;->r0()V

    .line 757
    .line 758
    .line 759
    :goto_7
    sget-object v3, La/gqw0;->x:La/shd;

    .line 760
    .line 761
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 762
    .line 763
    .line 764
    sget-object v3, La/gqw0;->w:La/shd;

    .line 765
    .line 766
    invoke-static {v1, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 767
    .line 768
    .line 769
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 770
    .line 771
    .line 772
    move-result-object v3

    .line 773
    sget-object v5, La/gqw0;->y:La/shd;

    .line 774
    .line 775
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 776
    .line 777
    .line 778
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 779
    .line 780
    .line 781
    sget-object v3, La/gqw0;->v:La/shd;

    .line 782
    .line 783
    invoke-static {v1, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 784
    .line 785
    .line 786
    float-to-double v3, v2

    .line 787
    const-wide/16 v5, 0x0

    .line 788
    .line 789
    cmpl-double v3, v3, v5

    .line 790
    .line 791
    const-string v4, "invalid weight; must be greater than zero"

    .line 792
    .line 793
    if-lez v3, :cond_14

    .line 794
    .line 795
    goto :goto_8

    .line 796
    :cond_14
    invoke-static {v4}, La/vcx;->a(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    :goto_8
    new-instance v3, La/x7z;

    .line 800
    .line 801
    const v8, 0x7f7fffff    # Float.MAX_VALUE

    .line 802
    .line 803
    .line 804
    cmpl-float v9, v2, v8

    .line 805
    .line 806
    if-lez v9, :cond_15

    .line 807
    .line 808
    move v9, v8

    .line 809
    goto :goto_9

    .line 810
    :cond_15
    move v9, v2

    .line 811
    :goto_9
    invoke-direct {v3, v9, v12}, La/x7z;-><init>(FZ)V

    .line 812
    .line 813
    .line 814
    invoke-static {v3, v0, v1, v10, v10}, La/kc5;->J0(La/mm40;La/uaa;La/fet;II)V

    .line 815
    .line 816
    .line 817
    invoke-static {v7, v13, v1, v10, v12}, La/kc5;->J0(La/mm40;La/uaa;La/fet;II)V

    .line 818
    .line 819
    .line 820
    move-wide/from16 p0, v5

    .line 821
    .line 822
    float-to-double v5, v2

    .line 823
    cmpl-double v0, v5, p0

    .line 824
    .line 825
    if-lez v0, :cond_16

    .line 826
    .line 827
    goto :goto_a

    .line 828
    :cond_16
    invoke-static {v4}, La/vcx;->a(Ljava/lang/String;)V

    .line 829
    .line 830
    .line 831
    :goto_a
    new-instance v0, La/x7z;

    .line 832
    .line 833
    cmpl-float v3, v2, v8

    .line 834
    .line 835
    if-lez v3, :cond_17

    .line 836
    .line 837
    move v2, v8

    .line 838
    :cond_17
    invoke-direct {v0, v2, v12}, La/x7z;-><init>(FZ)V

    .line 839
    .line 840
    .line 841
    invoke-static {v0, v14, v1, v10, v10}, La/kc5;->J0(La/mm40;La/uaa;La/fet;II)V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 845
    .line 846
    .line 847
    goto :goto_b

    .line 848
    :cond_18
    invoke-virtual {v1}, La/fet;->X()V

    .line 849
    .line 850
    .line 851
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 852
    .line 853
    return-object v0

    .line 854
    :pswitch_c
    check-cast v0, La/taa;

    .line 855
    .line 856
    check-cast v13, La/taa;

    .line 857
    .line 858
    check-cast v14, La/taa;

    .line 859
    .line 860
    move-object/from16 v1, p1

    .line 861
    .line 862
    check-cast v1, La/fet;

    .line 863
    .line 864
    move-object/from16 v4, p2

    .line 865
    .line 866
    check-cast v4, Ljava/lang/Integer;

    .line 867
    .line 868
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 869
    .line 870
    .line 871
    move-result v4

    .line 872
    and-int/lit8 v5, v4, 0x3

    .line 873
    .line 874
    if-eq v5, v11, :cond_19

    .line 875
    .line 876
    move v5, v12

    .line 877
    goto :goto_c

    .line 878
    :cond_19
    move v5, v10

    .line 879
    :goto_c
    and-int/2addr v4, v12

    .line 880
    invoke-virtual {v1, v4, v5}, La/fet;->U(IZ)Z

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    if-eqz v4, :cond_1b

    .line 885
    .line 886
    sget-object v4, La/qmk;->a:La/zcl;

    .line 887
    .line 888
    const/high16 v4, 0x41e00000    # 28.0f

    .line 889
    .line 890
    const/high16 v5, 0x43800000    # 256.0f

    .line 891
    .line 892
    invoke-static {v6, v5, v4}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 893
    .line 894
    .line 895
    move-result-object v4

    .line 896
    const/high16 v5, 0x41a00000    # 20.0f

    .line 897
    .line 898
    const/4 v7, 0x0

    .line 899
    invoke-static {v4, v5, v7, v11}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 900
    .line 901
    .line 902
    move-result-object v4

    .line 903
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 904
    .line 905
    sget-object v7, La/uc9;->a:La/lw3;

    .line 906
    .line 907
    invoke-static {v7, v5, v1, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 908
    .line 909
    .line 910
    move-result-object v5

    .line 911
    iget-wide v7, v1, La/fet;->T:J

    .line 912
    .line 913
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 914
    .line 915
    .line 916
    move-result v7

    .line 917
    invoke-virtual {v1}, La/fet;->m()La/bh90;

    .line 918
    .line 919
    .line 920
    move-result-object v8

    .line 921
    invoke-static {v1, v4}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 926
    .line 927
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 928
    .line 929
    .line 930
    invoke-virtual {v1}, La/fet;->i0()V

    .line 931
    .line 932
    .line 933
    iget-boolean v9, v1, La/fet;->S:Z

    .line 934
    .line 935
    if-eqz v9, :cond_1a

    .line 936
    .line 937
    invoke-virtual {v1, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 938
    .line 939
    .line 940
    goto :goto_d

    .line 941
    :cond_1a
    invoke-virtual {v1}, La/fet;->r0()V

    .line 942
    .line 943
    .line 944
    :goto_d
    sget-object v3, La/gqw0;->x:La/shd;

    .line 945
    .line 946
    invoke-static {v1, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 947
    .line 948
    .line 949
    sget-object v3, La/gqw0;->w:La/shd;

    .line 950
    .line 951
    invoke-static {v1, v8, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 952
    .line 953
    .line 954
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 955
    .line 956
    .line 957
    move-result-object v3

    .line 958
    sget-object v5, La/gqw0;->y:La/shd;

    .line 959
    .line 960
    invoke-static {v1, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 961
    .line 962
    .line 963
    invoke-static {v1}, La/jpm0;->n(La/fet;)V

    .line 964
    .line 965
    .line 966
    sget-object v3, La/gqw0;->v:La/shd;

    .line 967
    .line 968
    invoke-static {v1, v4, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 969
    .line 970
    .line 971
    sget-object v3, La/zhg0;->a:La/zhg0;

    .line 972
    .line 973
    invoke-virtual {v3, v2, v6, v12}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 974
    .line 975
    .line 976
    move-result-object v4

    .line 977
    invoke-static {v4, v0, v1, v10}, La/x8f;->W(La/mm40;La/taa;La/fet;I)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v3, v2, v6, v12}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    invoke-static {v0, v13, v1, v10}, La/x8f;->W(La/mm40;La/taa;La/fet;I)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v3, v2, v6, v12}, La/zhg0;->a(FLa/mm40;Z)La/mm40;

    .line 988
    .line 989
    .line 990
    move-result-object v0

    .line 991
    invoke-static {v0, v14, v1, v10}, La/x8f;->W(La/mm40;La/taa;La/fet;I)V

    .line 992
    .line 993
    .line 994
    invoke-virtual {v1, v12}, La/fet;->r(Z)V

    .line 995
    .line 996
    .line 997
    goto :goto_e

    .line 998
    :cond_1b
    invoke-virtual {v1}, La/fet;->X()V

    .line 999
    .line 1000
    .line 1001
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1002
    .line 1003
    return-object v0

    .line 1004
    :pswitch_d
    check-cast v0, La/mm40;

    .line 1005
    .line 1006
    check-cast v13, La/waa;

    .line 1007
    .line 1008
    check-cast v14, Lkotlin/jvm/functions/Function2;

    .line 1009
    .line 1010
    move-object/from16 v1, p1

    .line 1011
    .line 1012
    check-cast v1, La/fet;

    .line 1013
    .line 1014
    move-object/from16 v2, p2

    .line 1015
    .line 1016
    check-cast v2, Ljava/lang/Integer;

    .line 1017
    .line 1018
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1019
    .line 1020
    .line 1021
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1022
    .line 1023
    .line 1024
    move-result v2

    .line 1025
    invoke-static {v0, v13, v14, v1, v2}, La/kc5;->H(La/mm40;La/waa;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1026
    .line 1027
    .line 1028
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1029
    .line 1030
    return-object v0

    .line 1031
    :pswitch_e
    check-cast v0, La/cp;

    .line 1032
    .line 1033
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 1034
    .line 1035
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1036
    .line 1037
    move-object/from16 v1, p1

    .line 1038
    .line 1039
    check-cast v1, La/fet;

    .line 1040
    .line 1041
    move-object/from16 v2, p2

    .line 1042
    .line 1043
    check-cast v2, Ljava/lang/Integer;

    .line 1044
    .line 1045
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    and-int/lit8 v3, v2, 0x3

    .line 1050
    .line 1051
    if-eq v3, v11, :cond_1c

    .line 1052
    .line 1053
    move v10, v12

    .line 1054
    :cond_1c
    and-int/2addr v2, v12

    .line 1055
    invoke-virtual {v1, v2, v10}, La/fet;->U(IZ)Z

    .line 1056
    .line 1057
    .line 1058
    move-result v2

    .line 1059
    if-eqz v2, :cond_21

    .line 1060
    .line 1061
    invoke-virtual {v0}, La/cp;->u()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v2

    .line 1065
    check-cast v2, La/i140;

    .line 1066
    .line 1067
    iget-object v2, v2, La/i140;->d:La/gy30;

    .line 1068
    .line 1069
    invoke-virtual {v1, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    move-result v3

    .line 1073
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1074
    .line 1075
    .line 1076
    move-result v4

    .line 1077
    or-int/2addr v3, v4

    .line 1078
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v4

    .line 1082
    if-nez v3, :cond_1d

    .line 1083
    .line 1084
    if-ne v4, v5, :cond_1e

    .line 1085
    .line 1086
    :cond_1d
    new-instance v4, La/cp9;

    .line 1087
    .line 1088
    invoke-direct {v4, v13, v0}, La/cp9;-><init>(Lkotlin/jvm/functions/Function1;La/cp;)V

    .line 1089
    .line 1090
    .line 1091
    invoke-virtual {v1, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1092
    .line 1093
    .line 1094
    :cond_1e
    move-object/from16 v17, v4

    .line 1095
    .line 1096
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 1097
    .line 1098
    invoke-virtual {v1, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    move-result v0

    .line 1102
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v3

    .line 1106
    if-nez v0, :cond_1f

    .line 1107
    .line 1108
    if-ne v3, v5, :cond_20

    .line 1109
    .line 1110
    :cond_1f
    new-instance v3, La/pk9;

    .line 1111
    .line 1112
    const/4 v0, 0x4

    .line 1113
    invoke-direct {v3, v14, v0}, La/pk9;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1117
    .line 1118
    .line 1119
    :cond_20
    move-object/from16 v19, v3

    .line 1120
    .line 1121
    check-cast v19, Lkotlin/jvm/functions/Function0;

    .line 1122
    .line 1123
    const/16 v21, 0x0

    .line 1124
    .line 1125
    const/16 v22, 0x9

    .line 1126
    .line 1127
    const/4 v15, 0x0

    .line 1128
    const/16 v18, 0x0

    .line 1129
    .line 1130
    move-object/from16 v20, v1

    .line 1131
    .line 1132
    move-object/from16 v16, v2

    .line 1133
    .line 1134
    invoke-static/range {v15 .. v22}, La/jiq0;->y(La/mm40;La/gy30;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_f

    .line 1138
    :cond_21
    move-object/from16 v20, v1

    .line 1139
    .line 1140
    invoke-virtual/range {v20 .. v20}, La/fet;->X()V

    .line 1141
    .line 1142
    .line 1143
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1144
    .line 1145
    return-object v0

    .line 1146
    :pswitch_f
    check-cast v0, La/mm40;

    .line 1147
    .line 1148
    check-cast v13, La/pc9;

    .line 1149
    .line 1150
    check-cast v14, La/uwe;

    .line 1151
    .line 1152
    move-object/from16 v1, p1

    .line 1153
    .line 1154
    check-cast v1, La/fet;

    .line 1155
    .line 1156
    move-object/from16 v2, p2

    .line 1157
    .line 1158
    check-cast v2, Ljava/lang/Integer;

    .line 1159
    .line 1160
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1161
    .line 1162
    .line 1163
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1164
    .line 1165
    .line 1166
    move-result v2

    .line 1167
    invoke-static {v0, v13, v14, v1, v2}, La/tke;->n(La/mm40;La/pc9;La/uwe;La/fet;I)V

    .line 1168
    .line 1169
    .line 1170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1171
    .line 1172
    return-object v0

    .line 1173
    :pswitch_10
    check-cast v0, La/mm40;

    .line 1174
    .line 1175
    check-cast v13, La/va9;

    .line 1176
    .line 1177
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1178
    .line 1179
    move-object/from16 v1, p1

    .line 1180
    .line 1181
    check-cast v1, La/fet;

    .line 1182
    .line 1183
    move-object/from16 v2, p2

    .line 1184
    .line 1185
    check-cast v2, Ljava/lang/Integer;

    .line 1186
    .line 1187
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1188
    .line 1189
    .line 1190
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1191
    .line 1192
    .line 1193
    move-result v2

    .line 1194
    invoke-static {v0, v13, v14, v1, v2}, La/xf0;->g(La/mm40;La/va9;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1195
    .line 1196
    .line 1197
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1198
    .line 1199
    return-object v0

    .line 1200
    :pswitch_11
    check-cast v0, La/mm40;

    .line 1201
    .line 1202
    check-cast v13, La/c09;

    .line 1203
    .line 1204
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1205
    .line 1206
    move-object/from16 v1, p1

    .line 1207
    .line 1208
    check-cast v1, La/fet;

    .line 1209
    .line 1210
    move-object/from16 v2, p2

    .line 1211
    .line 1212
    check-cast v2, Ljava/lang/Integer;

    .line 1213
    .line 1214
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1215
    .line 1216
    .line 1217
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1218
    .line 1219
    .line 1220
    move-result v2

    .line 1221
    invoke-static {v0, v13, v14, v1, v2}, La/y0x0;->g(La/mm40;La/c09;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1222
    .line 1223
    .line 1224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_12
    check-cast v0, La/mm40;

    .line 1228
    .line 1229
    check-cast v13, La/dln;

    .line 1230
    .line 1231
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1232
    .line 1233
    move-object/from16 v1, p1

    .line 1234
    .line 1235
    check-cast v1, La/fet;

    .line 1236
    .line 1237
    move-object/from16 v2, p2

    .line 1238
    .line 1239
    check-cast v2, Ljava/lang/Integer;

    .line 1240
    .line 1241
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1245
    .line 1246
    .line 1247
    move-result v2

    .line 1248
    invoke-static {v0, v13, v14, v1, v2}, La/hew0;->c(La/mm40;La/dln;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1249
    .line 1250
    .line 1251
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1252
    .line 1253
    return-object v0

    .line 1254
    :pswitch_13
    check-cast v0, La/mm40;

    .line 1255
    .line 1256
    check-cast v13, La/fo8;

    .line 1257
    .line 1258
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1259
    .line 1260
    move-object/from16 v1, p1

    .line 1261
    .line 1262
    check-cast v1, La/fet;

    .line 1263
    .line 1264
    move-object/from16 v2, p2

    .line 1265
    .line 1266
    check-cast v2, Ljava/lang/Integer;

    .line 1267
    .line 1268
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1269
    .line 1270
    .line 1271
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1272
    .line 1273
    .line 1274
    move-result v2

    .line 1275
    invoke-static {v0, v13, v14, v1, v2}, La/rsr0;->l(La/mm40;La/fo8;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1276
    .line 1277
    .line 1278
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1279
    .line 1280
    return-object v0

    .line 1281
    :pswitch_14
    check-cast v0, La/mm40;

    .line 1282
    .line 1283
    check-cast v13, La/vl8;

    .line 1284
    .line 1285
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1286
    .line 1287
    move-object/from16 v1, p1

    .line 1288
    .line 1289
    check-cast v1, La/fet;

    .line 1290
    .line 1291
    move-object/from16 v2, p2

    .line 1292
    .line 1293
    check-cast v2, Ljava/lang/Integer;

    .line 1294
    .line 1295
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1296
    .line 1297
    .line 1298
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1299
    .line 1300
    .line 1301
    move-result v2

    .line 1302
    invoke-static {v0, v13, v14, v1, v2}, La/cwr0;->d(La/mm40;La/vl8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1303
    .line 1304
    .line 1305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1306
    .line 1307
    return-object v0

    .line 1308
    :pswitch_15
    check-cast v0, La/mm40;

    .line 1309
    .line 1310
    check-cast v13, La/sj8;

    .line 1311
    .line 1312
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1313
    .line 1314
    move-object/from16 v1, p1

    .line 1315
    .line 1316
    check-cast v1, La/fet;

    .line 1317
    .line 1318
    move-object/from16 v2, p2

    .line 1319
    .line 1320
    check-cast v2, Ljava/lang/Integer;

    .line 1321
    .line 1322
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1326
    .line 1327
    .line 1328
    move-result v2

    .line 1329
    invoke-static {v0, v13, v14, v1, v2}, La/rsr0;->k(La/mm40;La/sj8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1330
    .line 1331
    .line 1332
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1333
    .line 1334
    return-object v0

    .line 1335
    :pswitch_16
    check-cast v0, La/mm40;

    .line 1336
    .line 1337
    check-cast v13, Ljava/util/ArrayList;

    .line 1338
    .line 1339
    check-cast v14, La/ow3;

    .line 1340
    .line 1341
    move-object/from16 v1, p1

    .line 1342
    .line 1343
    check-cast v1, La/fet;

    .line 1344
    .line 1345
    move-object/from16 v2, p2

    .line 1346
    .line 1347
    check-cast v2, Ljava/lang/Integer;

    .line 1348
    .line 1349
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1350
    .line 1351
    .line 1352
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1353
    .line 1354
    .line 1355
    move-result v2

    .line 1356
    invoke-static {v0, v13, v14, v1, v2}, La/cjx;->j(La/mm40;Ljava/util/ArrayList;La/ow3;La/fet;I)V

    .line 1357
    .line 1358
    .line 1359
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1360
    .line 1361
    return-object v0

    .line 1362
    :pswitch_17
    check-cast v0, La/mm40;

    .line 1363
    .line 1364
    check-cast v13, La/ge8;

    .line 1365
    .line 1366
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1367
    .line 1368
    move-object/from16 v1, p1

    .line 1369
    .line 1370
    check-cast v1, La/fet;

    .line 1371
    .line 1372
    move-object/from16 v2, p2

    .line 1373
    .line 1374
    check-cast v2, Ljava/lang/Integer;

    .line 1375
    .line 1376
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1377
    .line 1378
    .line 1379
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1380
    .line 1381
    .line 1382
    move-result v2

    .line 1383
    invoke-static {v0, v13, v14, v1, v2}, La/j2e;->j(La/mm40;La/ge8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1384
    .line 1385
    .line 1386
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1387
    .line 1388
    return-object v0

    .line 1389
    :pswitch_18
    check-cast v0, La/mm40;

    .line 1390
    .line 1391
    check-cast v13, La/ie8;

    .line 1392
    .line 1393
    check-cast v14, La/ugd;

    .line 1394
    .line 1395
    move-object/from16 v1, p1

    .line 1396
    .line 1397
    check-cast v1, La/fet;

    .line 1398
    .line 1399
    move-object/from16 v2, p2

    .line 1400
    .line 1401
    check-cast v2, Ljava/lang/Integer;

    .line 1402
    .line 1403
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    invoke-static {v4}, La/x8x;->L(I)I

    .line 1407
    .line 1408
    .line 1409
    move-result v2

    .line 1410
    invoke-static {v0, v13, v14, v1, v2}, La/tke;->k(La/mm40;La/ie8;La/ugd;La/fet;I)V

    .line 1411
    .line 1412
    .line 1413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1414
    .line 1415
    return-object v0

    .line 1416
    :pswitch_19
    check-cast v0, La/mm40;

    .line 1417
    .line 1418
    check-cast v13, La/he8;

    .line 1419
    .line 1420
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1421
    .line 1422
    move-object/from16 v1, p1

    .line 1423
    .line 1424
    check-cast v1, La/fet;

    .line 1425
    .line 1426
    move-object/from16 v2, p2

    .line 1427
    .line 1428
    check-cast v2, Ljava/lang/Integer;

    .line 1429
    .line 1430
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1434
    .line 1435
    .line 1436
    move-result v2

    .line 1437
    invoke-static {v0, v13, v14, v1, v2}, La/o2e;->j(La/mm40;La/he8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1438
    .line 1439
    .line 1440
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1441
    .line 1442
    return-object v0

    .line 1443
    :pswitch_1a
    check-cast v0, La/rd8;

    .line 1444
    .line 1445
    check-cast v13, La/od8;

    .line 1446
    .line 1447
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 1448
    .line 1449
    move-object/from16 v1, p1

    .line 1450
    .line 1451
    check-cast v1, La/fet;

    .line 1452
    .line 1453
    move-object/from16 v2, p2

    .line 1454
    .line 1455
    check-cast v2, Ljava/lang/Integer;

    .line 1456
    .line 1457
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v8}, La/x8x;->L(I)I

    .line 1461
    .line 1462
    .line 1463
    move-result v2

    .line 1464
    invoke-static {v0, v13, v14, v1, v2}, La/q8a;->b(La/rd8;La/od8;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 1465
    .line 1466
    .line 1467
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1468
    .line 1469
    return-object v0

    .line 1470
    :pswitch_1b
    check-cast v0, Ljava/lang/String;

    .line 1471
    .line 1472
    move-object v1, v13

    .line 1473
    check-cast v1, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1474
    .line 1475
    move-object v2, v14

    .line 1476
    check-cast v2, Ljava/lang/String;

    .line 1477
    .line 1478
    move-object/from16 v4, p1

    .line 1479
    .line 1480
    check-cast v4, La/fet;

    .line 1481
    .line 1482
    move-object/from16 v5, p2

    .line 1483
    .line 1484
    check-cast v5, Ljava/lang/Integer;

    .line 1485
    .line 1486
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 1487
    .line 1488
    .line 1489
    move-result v5

    .line 1490
    and-int/lit8 v6, v5, 0x3

    .line 1491
    .line 1492
    if-eq v6, v11, :cond_22

    .line 1493
    .line 1494
    move v10, v12

    .line 1495
    :cond_22
    and-int/2addr v5, v12

    .line 1496
    invoke-virtual {v4, v5, v10}, La/fet;->U(IZ)Z

    .line 1497
    .line 1498
    .line 1499
    move-result v5

    .line 1500
    if-eqz v5, :cond_24

    .line 1501
    .line 1502
    sget-object v5, La/qmk;->a:La/zcl;

    .line 1503
    .line 1504
    const/16 v17, 0x0

    .line 1505
    .line 1506
    const/16 v18, 0xd

    .line 1507
    .line 1508
    sget-object v13, La/jm40;->b:La/jm40;

    .line 1509
    .line 1510
    const/4 v14, 0x0

    .line 1511
    const/high16 v15, 0x41000000    # 8.0f

    .line 1512
    .line 1513
    const/16 v16, 0x0

    .line 1514
    .line 1515
    invoke-static/range {v13 .. v18}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v5

    .line 1519
    move-object v6, v13

    .line 1520
    sget-object v7, La/gqw0;->k:La/yx7;

    .line 1521
    .line 1522
    sget-object v8, La/uc9;->a:La/lw3;

    .line 1523
    .line 1524
    invoke-static {v8, v7, v4, v9}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v7

    .line 1528
    iget-wide v8, v4, La/fet;->T:J

    .line 1529
    .line 1530
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 1531
    .line 1532
    .line 1533
    move-result v8

    .line 1534
    invoke-virtual {v4}, La/fet;->m()La/bh90;

    .line 1535
    .line 1536
    .line 1537
    move-result-object v9

    .line 1538
    invoke-static {v4, v5}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v5

    .line 1542
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 1543
    .line 1544
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1545
    .line 1546
    .line 1547
    invoke-virtual {v4}, La/fet;->i0()V

    .line 1548
    .line 1549
    .line 1550
    iget-boolean v10, v4, La/fet;->S:Z

    .line 1551
    .line 1552
    if-eqz v10, :cond_23

    .line 1553
    .line 1554
    invoke-virtual {v4, v3}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1555
    .line 1556
    .line 1557
    goto :goto_10

    .line 1558
    :cond_23
    invoke-virtual {v4}, La/fet;->r0()V

    .line 1559
    .line 1560
    .line 1561
    :goto_10
    sget-object v3, La/gqw0;->x:La/shd;

    .line 1562
    .line 1563
    invoke-static {v4, v7, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1564
    .line 1565
    .line 1566
    sget-object v3, La/gqw0;->w:La/shd;

    .line 1567
    .line 1568
    invoke-static {v4, v9, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1569
    .line 1570
    .line 1571
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v3

    .line 1575
    sget-object v7, La/gqw0;->y:La/shd;

    .line 1576
    .line 1577
    invoke-static {v4, v3, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1578
    .line 1579
    .line 1580
    invoke-static {v4}, La/jpm0;->n(La/fet;)V

    .line 1581
    .line 1582
    .line 1583
    sget-object v3, La/gqw0;->v:La/shd;

    .line 1584
    .line 1585
    invoke-static {v4, v5, v3}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1586
    .line 1587
    .line 1588
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 1589
    .line 1590
    .line 1591
    move-result-wide v15

    .line 1592
    invoke-static {}, La/g1t0;->l()La/y9q0;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v33

    .line 1596
    const/16 v36, 0x0

    .line 1597
    .line 1598
    const v37, 0x1fffa

    .line 1599
    .line 1600
    .line 1601
    const/4 v14, 0x0

    .line 1602
    const/16 v17, 0x0

    .line 1603
    .line 1604
    const-wide/16 v18, 0x0

    .line 1605
    .line 1606
    const/16 v20, 0x0

    .line 1607
    .line 1608
    const/16 v21, 0x0

    .line 1609
    .line 1610
    const/16 v22, 0x0

    .line 1611
    .line 1612
    const-wide/16 v23, 0x0

    .line 1613
    .line 1614
    const/16 v25, 0x0

    .line 1615
    .line 1616
    const-wide/16 v26, 0x0

    .line 1617
    .line 1618
    const/16 v28, 0x0

    .line 1619
    .line 1620
    const/16 v29, 0x0

    .line 1621
    .line 1622
    const/16 v30, 0x0

    .line 1623
    .line 1624
    const/16 v31, 0x0

    .line 1625
    .line 1626
    const/16 v32, 0x0

    .line 1627
    .line 1628
    const/16 v35, 0x0

    .line 1629
    .line 1630
    move-object v13, v0

    .line 1631
    move-object/from16 v34, v4

    .line 1632
    .line 1633
    invoke-static/range {v13 .. v37}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1634
    .line 1635
    .line 1636
    const/16 v23, 0x0

    .line 1637
    .line 1638
    const/16 v24, 0xe

    .line 1639
    .line 1640
    const/high16 v20, 0x40800000    # 4.0f

    .line 1641
    .line 1642
    const/16 v21, 0x0

    .line 1643
    .line 1644
    const/16 v22, 0x0

    .line 1645
    .line 1646
    move-object/from16 v19, v6

    .line 1647
    .line 1648
    invoke-static/range {v19 .. v24}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 1649
    .line 1650
    .line 1651
    move-result-object v16

    .line 1652
    invoke-virtual {v1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 1653
    .line 1654
    .line 1655
    move-result-wide v17

    .line 1656
    invoke-static {}, La/g1t0;->n()La/y9q0;

    .line 1657
    .line 1658
    .line 1659
    move-result-object v35

    .line 1660
    const/16 v38, 0x0

    .line 1661
    .line 1662
    const v39, 0x1fff8

    .line 1663
    .line 1664
    .line 1665
    const/16 v19, 0x0

    .line 1666
    .line 1667
    const-wide/16 v20, 0x0

    .line 1668
    .line 1669
    const/16 v22, 0x0

    .line 1670
    .line 1671
    const/16 v23, 0x0

    .line 1672
    .line 1673
    const/16 v24, 0x0

    .line 1674
    .line 1675
    const-wide/16 v25, 0x0

    .line 1676
    .line 1677
    const/16 v27, 0x0

    .line 1678
    .line 1679
    const-wide/16 v28, 0x0

    .line 1680
    .line 1681
    const/16 v32, 0x0

    .line 1682
    .line 1683
    const/16 v33, 0x0

    .line 1684
    .line 1685
    move-object/from16 v36, v34

    .line 1686
    .line 1687
    const/16 v34, 0x0

    .line 1688
    .line 1689
    const/16 v37, 0x0

    .line 1690
    .line 1691
    move-object v15, v2

    .line 1692
    invoke-static/range {v15 .. v39}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 1693
    .line 1694
    .line 1695
    move-object/from16 v0, v36

    .line 1696
    .line 1697
    invoke-virtual {v0, v12}, La/fet;->r(Z)V

    .line 1698
    .line 1699
    .line 1700
    goto :goto_11

    .line 1701
    :cond_24
    move-object v0, v4

    .line 1702
    invoke-virtual {v0}, La/fet;->X()V

    .line 1703
    .line 1704
    .line 1705
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1706
    .line 1707
    return-object v0

    .line 1708
    :pswitch_1c
    check-cast v0, La/mm40;

    .line 1709
    .line 1710
    check-cast v13, La/xb8;

    .line 1711
    .line 1712
    check-cast v14, Lkotlin/jvm/functions/Function0;

    .line 1713
    .line 1714
    move-object/from16 v1, p1

    .line 1715
    .line 1716
    check-cast v1, La/fet;

    .line 1717
    .line 1718
    move-object/from16 v2, p2

    .line 1719
    .line 1720
    check-cast v2, Ljava/lang/Integer;

    .line 1721
    .line 1722
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1723
    .line 1724
    .line 1725
    invoke-static {v12}, La/x8x;->L(I)I

    .line 1726
    .line 1727
    .line 1728
    move-result v2

    .line 1729
    invoke-static {v0, v13, v14, v1, v2}, La/ac8;->a(La/mm40;La/xb8;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 1730
    .line 1731
    .line 1732
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1733
    .line 1734
    return-object v0

    .line 1735
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
