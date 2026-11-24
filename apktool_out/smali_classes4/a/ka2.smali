.class public final synthetic La/ka2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pz40;

.field public final synthetic c:Z

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(La/pz40;ZLkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/ka2;->a:B

    iput-object p1, p0, La/ka2;->b:La/pz40;

    iput-boolean p2, p0, La/ka2;->c:Z

    iput-object p3, p0, La/ka2;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ZLkotlin/jvm/functions/Function1;La/pz40;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/ka2;->a:B

    iput-boolean p1, p0, La/ka2;->c:Z

    iput-object p2, p0, La/ka2;->d:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/ka2;->b:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ka2;->a:B

    .line 4
    .line 5
    const/16 v3, 0x1b

    .line 6
    .line 7
    const/16 v4, 0xc

    .line 8
    .line 9
    const/16 v5, 0xb

    .line 10
    .line 11
    const/4 v6, 0x3

    .line 12
    const/4 v7, 0x2

    .line 13
    const v8, -0x4297e015

    .line 14
    .line 15
    .line 16
    const/4 v9, 0x4

    .line 17
    const/4 v10, 0x0

    .line 18
    const/4 v11, 0x5

    .line 19
    sget-object v12, La/v5q0;->a:La/v5q0;

    .line 20
    .line 21
    const v13, 0x2fd4df92

    .line 22
    .line 23
    .line 24
    iget-object v14, v0, La/ka2;->d:Lkotlin/jvm/functions/Function1;

    .line 25
    .line 26
    iget-boolean v15, v0, La/ka2;->c:Z

    .line 27
    .line 28
    iget-object v0, v0, La/ka2;->b:La/pz40;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    packed-switch v1, :pswitch_data_0

    .line 32
    .line 33
    .line 34
    move-object/from16 v16, p1

    .line 35
    .line 36
    check-cast v16, La/i8z;

    .line 37
    .line 38
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, La/a4x;

    .line 46
    .line 47
    new-instance v1, La/rgn0;

    .line 48
    .line 49
    const/16 v3, 0x17

    .line 50
    .line 51
    invoke-direct {v1, v3}, La/rgn0;-><init>(B)V

    .line 52
    .line 53
    .line 54
    new-instance v3, La/rgn0;

    .line 55
    .line 56
    const/16 v4, 0x18

    .line 57
    .line 58
    invoke-direct {v3, v4}, La/rgn0;-><init>(B)V

    .line 59
    .line 60
    .line 61
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 62
    .line 63
    .line 64
    move-result v17

    .line 65
    new-instance v4, La/zcn0;

    .line 66
    .line 67
    invoke-direct {v4, v1, v0, v9}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 68
    .line 69
    .line 70
    new-instance v1, La/zcn0;

    .line 71
    .line 72
    invoke-direct {v1, v3, v0, v11}, La/zcn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 73
    .line 74
    .line 75
    new-instance v3, La/ra2;

    .line 76
    .line 77
    invoke-direct {v3, v0, v15, v14, v11}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 78
    .line 79
    .line 80
    new-instance v0, La/ugd;

    .line 81
    .line 82
    invoke-direct {v0, v8, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    move-object/from16 v21, v0

    .line 88
    .line 89
    move-object/from16 v20, v1

    .line 90
    .line 91
    move-object/from16 v18, v4

    .line 92
    .line 93
    invoke-virtual/range {v16 .. v21}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 94
    .line 95
    .line 96
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 97
    .line 98
    return-object v0

    .line 99
    :pswitch_0
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, La/hcz;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/a4x;

    .line 111
    .line 112
    new-instance v3, La/wtf0;

    .line 113
    .line 114
    invoke-direct {v3, v7}, La/wtf0;-><init>(B)V

    .line 115
    .line 116
    .line 117
    new-instance v4, La/wtf0;

    .line 118
    .line 119
    invoke-direct {v4, v6}, La/wtf0;-><init>(B)V

    .line 120
    .line 121
    .line 122
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 123
    .line 124
    .line 125
    move-result v5

    .line 126
    new-instance v6, La/pwe0;

    .line 127
    .line 128
    invoke-direct {v6, v3, v0, v11}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 129
    .line 130
    .line 131
    new-instance v3, La/pwe0;

    .line 132
    .line 133
    const/4 v7, 0x6

    .line 134
    invoke-direct {v3, v4, v0, v7}, La/pwe0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 135
    .line 136
    .line 137
    new-instance v4, La/ra2;

    .line 138
    .line 139
    invoke-direct {v4, v0, v15, v14, v9}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 140
    .line 141
    .line 142
    new-instance v0, La/ugd;

    .line 143
    .line 144
    invoke-direct {v0, v13, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v5, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_1
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, La/i8z;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    check-cast v0, La/a4x;

    .line 165
    .line 166
    new-instance v3, La/kma0;

    .line 167
    .line 168
    const/16 v7, 0x12

    .line 169
    .line 170
    invoke-direct {v3, v7}, La/kma0;-><init>(B)V

    .line 171
    .line 172
    .line 173
    new-instance v7, La/kma0;

    .line 174
    .line 175
    const/16 v9, 0x13

    .line 176
    .line 177
    invoke-direct {v7, v9}, La/kma0;-><init>(B)V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 181
    .line 182
    .line 183
    move-result v9

    .line 184
    new-instance v10, La/zu90;

    .line 185
    .line 186
    invoke-direct {v10, v5, v3, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 187
    .line 188
    .line 189
    new-instance v5, La/zu90;

    .line 190
    .line 191
    invoke-direct {v5, v4, v7, v0}, La/zu90;-><init>(BLa/wdr;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance v3, La/ra2;

    .line 195
    .line 196
    invoke-direct {v3, v0, v15, v14, v6}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 197
    .line 198
    .line 199
    new-instance v6, La/ugd;

    .line 200
    .line 201
    invoke-direct {v6, v8, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    move v2, v9

    .line 206
    move-object v3, v10

    .line 207
    invoke-virtual/range {v1 .. v6}, La/i8z;->e(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;La/ugd;)V

    .line 208
    .line 209
    .line 210
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 211
    .line 212
    return-object v0

    .line 213
    :pswitch_2
    move-object/from16 v1, p1

    .line 214
    .line 215
    check-cast v1, La/x5q0;

    .line 216
    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    if-eqz v15, :cond_0

    .line 221
    .line 222
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 223
    .line 224
    .line 225
    move-result v3

    .line 226
    if-eqz v3, :cond_0

    .line 227
    .line 228
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    check-cast v3, Ljava/lang/Boolean;

    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 235
    .line 236
    .line 237
    move-result v3

    .line 238
    xor-int/2addr v2, v3

    .line 239
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 240
    .line 241
    .line 242
    move-result-object v2

    .line 243
    invoke-interface {v0, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    :cond_0
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    :pswitch_3
    move-object/from16 v1, p1

    .line 253
    .line 254
    check-cast v1, La/x5q0;

    .line 255
    .line 256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    if-eqz v15, :cond_1

    .line 260
    .line 261
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v3

    .line 265
    if-eqz v3, :cond_1

    .line 266
    .line 267
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    check-cast v3, Ljava/lang/Boolean;

    .line 272
    .line 273
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 274
    .line 275
    .line 276
    move-result v3

    .line 277
    xor-int/2addr v2, v3

    .line 278
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 279
    .line 280
    .line 281
    move-result-object v2

    .line 282
    invoke-interface {v0, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_1
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    return-object v0

    .line 291
    :pswitch_4
    move-object/from16 v1, p1

    .line 292
    .line 293
    check-cast v1, La/x5q0;

    .line 294
    .line 295
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    if-eqz v15, :cond_2

    .line 299
    .line 300
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_2

    .line 305
    .line 306
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v3

    .line 310
    check-cast v3, Ljava/lang/Boolean;

    .line 311
    .line 312
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 313
    .line 314
    .line 315
    move-result v3

    .line 316
    xor-int/2addr v2, v3

    .line 317
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    invoke-interface {v0, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    :cond_2
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 328
    .line 329
    return-object v0

    .line 330
    :pswitch_5
    move-object/from16 v1, p1

    .line 331
    .line 332
    check-cast v1, La/x5q0;

    .line 333
    .line 334
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    if-eqz v15, :cond_3

    .line 338
    .line 339
    invoke-virtual {v1, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v3

    .line 343
    if-eqz v3, :cond_3

    .line 344
    .line 345
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v3

    .line 349
    check-cast v3, Ljava/lang/Boolean;

    .line 350
    .line 351
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 352
    .line 353
    .line 354
    move-result v3

    .line 355
    xor-int/2addr v2, v3

    .line 356
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    invoke-interface {v0, v2}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    :cond_3
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 367
    .line 368
    return-object v0

    .line 369
    :pswitch_6
    move-object/from16 v1, p1

    .line 370
    .line 371
    check-cast v1, La/iqq;

    .line 372
    .line 373
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    if-nez v3, :cond_4

    .line 381
    .line 382
    if-nez v15, :cond_5

    .line 383
    .line 384
    :cond_4
    invoke-virtual {v1}, La/iqq;->b()Z

    .line 385
    .line 386
    .line 387
    move-result v1

    .line 388
    if-eqz v1, :cond_6

    .line 389
    .line 390
    :cond_5
    move v10, v2

    .line 391
    :cond_6
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v1

    .line 395
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 396
    .line 397
    .line 398
    move-result-object v2

    .line 399
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v1

    .line 403
    if-nez v1, :cond_7

    .line 404
    .line 405
    if-eqz v14, :cond_7

    .line 406
    .line 407
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    invoke-interface {v14, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    :cond_7
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    invoke-interface {v0, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 422
    .line 423
    return-object v0

    .line 424
    :pswitch_7
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, La/hcz;

    .line 427
    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    move-result-object v0

    .line 435
    check-cast v0, Ljava/util/List;

    .line 436
    .line 437
    new-instance v3, La/h26;

    .line 438
    .line 439
    invoke-direct {v3, v5}, La/h26;-><init>(B)V

    .line 440
    .line 441
    .line 442
    new-instance v5, La/h26;

    .line 443
    .line 444
    invoke-direct {v5, v4}, La/h26;-><init>(B)V

    .line 445
    .line 446
    .line 447
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 448
    .line 449
    .line 450
    move-result v4

    .line 451
    new-instance v6, La/ci2;

    .line 452
    .line 453
    const/16 v8, 0x15

    .line 454
    .line 455
    invoke-direct {v6, v3, v0, v8}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 456
    .line 457
    .line 458
    new-instance v3, La/ci2;

    .line 459
    .line 460
    const/16 v8, 0x16

    .line 461
    .line 462
    invoke-direct {v3, v5, v0, v8}, La/ci2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 463
    .line 464
    .line 465
    new-instance v5, La/cz0;

    .line 466
    .line 467
    invoke-direct {v5, v0, v15, v14, v7}, La/cz0;-><init>(Ljava/util/List;ZLkotlin/jvm/functions/Function1;B)V

    .line 468
    .line 469
    .line 470
    new-instance v0, La/ugd;

    .line 471
    .line 472
    invoke-direct {v0, v13, v2, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v1, v4, v6, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 476
    .line 477
    .line 478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 479
    .line 480
    return-object v0

    .line 481
    :pswitch_8
    move-object/from16 v1, p1

    .line 482
    .line 483
    check-cast v1, La/hcz;

    .line 484
    .line 485
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    check-cast v0, La/a4x;

    .line 493
    .line 494
    new-instance v4, La/xd2;

    .line 495
    .line 496
    invoke-direct {v4, v10}, La/xd2;-><init>(B)V

    .line 497
    .line 498
    .line 499
    new-instance v5, La/xd2;

    .line 500
    .line 501
    invoke-direct {v5, v2}, La/xd2;-><init>(B)V

    .line 502
    .line 503
    .line 504
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    new-instance v7, La/g5;

    .line 509
    .line 510
    invoke-direct {v7, v4, v0, v3}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 511
    .line 512
    .line 513
    new-instance v3, La/g5;

    .line 514
    .line 515
    const/16 v4, 0x1c

    .line 516
    .line 517
    invoke-direct {v3, v5, v0, v4}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 518
    .line 519
    .line 520
    new-instance v4, La/ra2;

    .line 521
    .line 522
    invoke-direct {v4, v0, v15, v14, v2}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 523
    .line 524
    .line 525
    new-instance v0, La/ugd;

    .line 526
    .line 527
    invoke-direct {v0, v13, v2, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v6, v7, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_9
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, La/hcz;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    check-cast v0, La/a4x;

    .line 548
    .line 549
    new-instance v4, La/dj1;

    .line 550
    .line 551
    invoke-direct {v4, v3}, La/dj1;-><init>(B)V

    .line 552
    .line 553
    .line 554
    new-instance v3, La/dj1;

    .line 555
    .line 556
    const/16 v5, 0x1c

    .line 557
    .line 558
    invoke-direct {v3, v5}, La/dj1;-><init>(B)V

    .line 559
    .line 560
    .line 561
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 562
    .line 563
    .line 564
    move-result v5

    .line 565
    new-instance v6, La/g5;

    .line 566
    .line 567
    const/16 v7, 0x19

    .line 568
    .line 569
    invoke-direct {v6, v4, v0, v7}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 570
    .line 571
    .line 572
    new-instance v4, La/g5;

    .line 573
    .line 574
    const/16 v7, 0x1a

    .line 575
    .line 576
    invoke-direct {v4, v3, v0, v7}, La/g5;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 577
    .line 578
    .line 579
    new-instance v3, La/ra2;

    .line 580
    .line 581
    invoke-direct {v3, v0, v15, v14, v10}, La/ra2;-><init>(La/a4x;ZLkotlin/jvm/functions/Function1;B)V

    .line 582
    .line 583
    .line 584
    new-instance v0, La/ugd;

    .line 585
    .line 586
    invoke-direct {v0, v13, v2, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v1, v5, v6, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 590
    .line 591
    .line 592
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object v0

    .line 595
    :pswitch_data_0
    .packed-switch 0x0
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
