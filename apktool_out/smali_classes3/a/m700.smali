.class public final synthetic La/m700;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z19;


# direct methods
.method public synthetic constructor <init>(La/z19;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/m700;->a:B

    iput-object p1, p0, La/m700;->b:La/z19;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/m700;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v0, v0, La/m700;->b:La/z19;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    move-object/from16 v1, p1

    .line 16
    .line 17
    check-cast v1, La/fee;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    check-cast v1, La/ifc0;

    .line 27
    .line 28
    iget-object v0, v0, La/z19;->b:La/ctf0;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v6, La/z6c0;

    .line 37
    .line 38
    iget-object v7, v1, La/ifc0;->a:La/azc0;

    .line 39
    .line 40
    new-instance v8, La/zyc0;

    .line 41
    .line 42
    iget-object v9, v7, La/azc0;->a:La/pz40;

    .line 43
    .line 44
    iget-object v10, v7, La/azc0;->b:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v11, v7, La/azc0;->c:Ljava/lang/String;

    .line 47
    .line 48
    iget-boolean v12, v7, La/azc0;->d:Z

    .line 49
    .line 50
    iget-boolean v13, v7, La/azc0;->e:Z

    .line 51
    .line 52
    iget-boolean v14, v7, La/azc0;->f:Z

    .line 53
    .line 54
    invoke-direct/range {v8 .. v14}, La/zyc0;-><init>(La/pz40;Ljava/lang/String;Ljava/lang/String;ZZZ)V

    .line 55
    .line 56
    .line 57
    iget-object v7, v1, La/ifc0;->b:La/wyc0;

    .line 58
    .line 59
    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result v7

    .line 63
    if-eqz v7, :cond_1

    .line 64
    .line 65
    if-ne v7, v3, :cond_0

    .line 66
    .line 67
    sget-object v3, La/vyc0;->b:La/vyc0;

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    sget-object v3, La/vyc0;->a:La/vyc0;

    .line 75
    .line 76
    :goto_0
    new-instance v7, La/tlc0;

    .line 77
    .line 78
    sget-object v9, La/lak0;->c:La/lak0;

    .line 79
    .line 80
    invoke-direct {v7, v9, v5}, La/tlc0;-><init>(La/a4x;Z)V

    .line 81
    .line 82
    .line 83
    iget-boolean v1, v1, La/ifc0;->d:Z

    .line 84
    .line 85
    new-array v9, v5, [Ljava/lang/Object;

    .line 86
    .line 87
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 88
    .line 89
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    const v10, 0x7f130dcf

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v9

    .line 100
    new-array v10, v5, [Ljava/lang/Object;

    .line 101
    .line 102
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    const v10, 0x7f13025e

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v10, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v5, "\n"

    .line 114
    .line 115
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    move-object v4, v0

    .line 122
    :cond_2
    if-nez v4, :cond_3

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_3
    move-object v2, v4

    .line 126
    :goto_1
    invoke-virtual {v9, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-direct {v6, v8, v3, v7, v0}, La/z6c0;-><init>(La/zyc0;La/vyc0;La/tlc0;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    move-object v4, v6

    .line 134
    :goto_2
    return-object v4

    .line 135
    :pswitch_0
    move-object/from16 v1, p1

    .line 136
    .line 137
    check-cast v1, La/fee;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    check-cast v1, La/qvj0;

    .line 147
    .line 148
    iget-object v4, v0, La/z19;->d:La/n0o0;

    .line 149
    .line 150
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    check-cast v4, La/fee;

    .line 155
    .line 156
    invoke-virtual {v4}, La/fee;->c()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    check-cast v4, La/ym5;

    .line 161
    .line 162
    iget-object v4, v4, La/ym5;->c:La/ql5;

    .line 163
    .line 164
    iget-object v9, v4, La/ql5;->f:Ljava/lang/String;

    .line 165
    .line 166
    iget-object v0, v0, La/z19;->b:La/ctf0;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    new-instance v4, La/zvj0;

    .line 178
    .line 179
    iget-object v6, v1, La/qvj0;->a:La/cx6;

    .line 180
    .line 181
    iget-object v12, v1, La/qvj0;->b:La/lnb0;

    .line 182
    .line 183
    iget-object v13, v6, La/cx6;->b:La/uw6;

    .line 184
    .line 185
    new-instance v14, La/yv6;

    .line 186
    .line 187
    new-instance v15, La/mx6;

    .line 188
    .line 189
    iget-object v6, v6, La/cx6;->a:La/a8q0;

    .line 190
    .line 191
    new-array v7, v5, [Ljava/lang/Object;

    .line 192
    .line 193
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 194
    .line 195
    invoke-static {v7, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v7

    .line 199
    const v10, 0x7f130f56

    .line 200
    .line 201
    .line 202
    invoke-virtual {v8, v10, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v17

    .line 206
    iget-boolean v7, v13, La/uw6;->l:Z

    .line 207
    .line 208
    iget-boolean v8, v13, La/uw6;->h:Z

    .line 209
    .line 210
    const/16 v19, 0x1

    .line 211
    .line 212
    const/16 v20, 0x0

    .line 213
    .line 214
    move-object/from16 v16, v6

    .line 215
    .line 216
    move/from16 v18, v7

    .line 217
    .line 218
    invoke-direct/range {v15 .. v20}, La/mx6;-><init>(La/a8q0;Ljava/lang/String;ZZZ)V

    .line 219
    .line 220
    .line 221
    new-instance v6, La/oln0;

    .line 222
    .line 223
    iget-wide v10, v13, La/uw6;->a:D

    .line 224
    .line 225
    move/from16 v16, v8

    .line 226
    .line 227
    iget-wide v7, v13, La/uw6;->d:D

    .line 228
    .line 229
    cmpg-double v17, v7, v10

    .line 230
    .line 231
    const-wide/high16 v18, -0x4010000000000000L    # -1.0

    .line 232
    .line 233
    move-object/from16 p0, v4

    .line 234
    .line 235
    const-wide v3, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    if-gtz v17, :cond_4

    .line 241
    .line 242
    cmpg-double v17, v10, v3

    .line 243
    .line 244
    if-gtz v17, :cond_4

    .line 245
    .line 246
    :goto_3
    move-object v0, v6

    .line 247
    goto :goto_4

    .line 248
    :cond_4
    cmpg-double v17, v10, v18

    .line 249
    .line 250
    if-nez v17, :cond_5

    .line 251
    .line 252
    goto :goto_3

    .line 253
    :goto_4
    iget-boolean v6, v13, La/uw6;->f:Z

    .line 254
    .line 255
    move-wide/from16 v21, v10

    .line 256
    .line 257
    const-wide v10, 0x42a2309ce53ffffbL    # 9.99999999999999E12

    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    invoke-static/range {v6 .. v11}, La/l8x;->R(ZDLjava/lang/String;D)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    move-object v8, v0

    .line 267
    goto :goto_5

    .line 268
    :cond_5
    move-wide/from16 v21, v7

    .line 269
    .line 270
    move-object v8, v6

    .line 271
    move-wide/from16 v6, v21

    .line 272
    .line 273
    move-wide/from16 v21, v10

    .line 274
    .line 275
    cmpg-double v10, v21, v6

    .line 276
    .line 277
    if-gez v10, :cond_6

    .line 278
    .line 279
    invoke-static {v0, v6, v7, v9}, La/l8x;->T(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    goto :goto_5

    .line 284
    :cond_6
    cmpl-double v6, v21, v3

    .line 285
    .line 286
    if-lez v6, :cond_7

    .line 287
    .line 288
    invoke-static {v0, v3, v4, v9}, La/l8x;->S(La/ctf0;DLjava/lang/String;)Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    :cond_7
    :goto_5
    invoke-direct {v8, v2, v5, v5}, La/oln0;-><init>(Ljava/lang/String;ZZ)V

    .line 293
    .line 294
    .line 295
    move-object v0, v9

    .line 296
    new-instance v9, La/xnb0;

    .line 297
    .line 298
    iget-object v2, v12, La/lnb0;->b:Ljava/lang/String;

    .line 299
    .line 300
    iget-object v6, v12, La/lnb0;->c:Ljava/lang/String;

    .line 301
    .line 302
    iget-boolean v7, v12, La/lnb0;->a:Z

    .line 303
    .line 304
    invoke-direct {v9, v2, v6, v7}, La/xnb0;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 305
    .line 306
    .line 307
    new-instance v10, La/jke;

    .line 308
    .line 309
    iget-boolean v2, v13, La/uw6;->j:Z

    .line 310
    .line 311
    iget-wide v6, v13, La/uw6;->d:D

    .line 312
    .line 313
    cmpl-double v11, v21, v6

    .line 314
    .line 315
    if-lez v11, :cond_8

    .line 316
    .line 317
    if-eqz v16, :cond_8

    .line 318
    .line 319
    const/4 v11, 0x1

    .line 320
    goto :goto_6

    .line 321
    :cond_8
    move v11, v5

    .line 322
    :goto_6
    cmpg-double v3, v21, v3

    .line 323
    .line 324
    if-gez v3, :cond_9

    .line 325
    .line 326
    if-eqz v16, :cond_9

    .line 327
    .line 328
    const/4 v5, 0x1

    .line 329
    :cond_9
    invoke-direct {v10, v2, v2, v11, v5}, La/jke;-><init>(ZZZZ)V

    .line 330
    .line 331
    .line 332
    iget-boolean v2, v13, La/uw6;->k:Z

    .line 333
    .line 334
    if-nez v2, :cond_d

    .line 335
    .line 336
    if-nez v16, :cond_a

    .line 337
    .line 338
    goto :goto_9

    .line 339
    :cond_a
    cmpg-double v2, v6, v21

    .line 340
    .line 341
    if-gtz v2, :cond_b

    .line 342
    .line 343
    if-gtz v3, :cond_b

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_b
    cmpg-double v2, v21, v18

    .line 347
    .line 348
    if-nez v2, :cond_c

    .line 349
    .line 350
    :goto_7
    sget-object v2, La/fx6;->a:La/fx6;

    .line 351
    .line 352
    :goto_8
    move-object v11, v2

    .line 353
    goto :goto_a

    .line 354
    :cond_c
    sget-object v2, La/fx6;->b:La/fx6;

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_d
    :goto_9
    sget-object v2, La/fx6;->c:La/fx6;

    .line 358
    .line 359
    goto :goto_8

    .line 360
    :goto_a
    const/4 v13, 0x1

    .line 361
    move-object v12, v0

    .line 362
    move-object v6, v14

    .line 363
    move-object v7, v15

    .line 364
    invoke-direct/range {v6 .. v13}, La/yv6;-><init>(La/mx6;La/oln0;La/xnb0;La/jke;La/fx6;Ljava/lang/String;Z)V

    .line 365
    .line 366
    .line 367
    iget-object v0, v1, La/qvj0;->c:La/jwo0;

    .line 368
    .line 369
    new-instance v7, La/ixo0;

    .line 370
    .line 371
    iget-boolean v8, v0, La/jwo0;->a:Z

    .line 372
    .line 373
    iget-object v9, v0, La/jwo0;->b:Ljava/lang/String;

    .line 374
    .line 375
    iget-object v11, v0, La/jwo0;->c:Ljava/lang/String;

    .line 376
    .line 377
    new-instance v12, La/sn7;

    .line 378
    .line 379
    sget-object v0, La/iun;->a:La/iun;

    .line 380
    .line 381
    invoke-static {v0}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    invoke-direct {v12, v0}, La/sn7;-><init>(La/i4;)V

    .line 386
    .line 387
    .line 388
    const/4 v10, 0x0

    .line 389
    invoke-direct/range {v7 .. v12}, La/ixo0;-><init>(ZLjava/lang/String;La/bxo0;Ljava/lang/String;La/tn7;)V

    .line 390
    .line 391
    .line 392
    move-object/from16 v0, p0

    .line 393
    .line 394
    invoke-direct {v0, v6, v7}, La/zvj0;-><init>(La/yv6;La/ixo0;)V

    .line 395
    .line 396
    .line 397
    return-object v0

    .line 398
    :pswitch_1
    move-object/from16 v1, p1

    .line 399
    .line 400
    check-cast v1, La/fee;

    .line 401
    .line 402
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, La/ym5;

    .line 410
    .line 411
    iget-object v2, v0, La/z19;->b:La/ctf0;

    .line 412
    .line 413
    iget-object v3, v0, La/z19;->e:La/n0o0;

    .line 414
    .line 415
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 416
    .line 417
    .line 418
    move-result-object v3

    .line 419
    check-cast v3, La/fee;

    .line 420
    .line 421
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    check-cast v3, La/eo7;

    .line 426
    .line 427
    sget-object v6, La/bo7;->a:La/bo7;

    .line 428
    .line 429
    invoke-static {v3, v6}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v6

    .line 433
    const-wide/16 v7, 0x0

    .line 434
    .line 435
    if-eqz v6, :cond_e

    .line 436
    .line 437
    iget-object v0, v0, La/z19;->f:La/n0o0;

    .line 438
    .line 439
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    check-cast v0, La/fee;

    .line 444
    .line 445
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v0

    .line 449
    check-cast v0, La/qvj0;

    .line 450
    .line 451
    iget-object v0, v0, La/qvj0;->a:La/cx6;

    .line 452
    .line 453
    iget-object v0, v0, La/cx6;->b:La/uw6;

    .line 454
    .line 455
    iget-wide v3, v0, La/uw6;->a:D

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :cond_e
    sget-object v0, La/yn7;->a:La/yn7;

    .line 459
    .line 460
    invoke-static {v3, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    if-eqz v0, :cond_11

    .line 465
    .line 466
    move-wide v3, v7

    .line 467
    :goto_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    iget-object v0, v1, La/ym5;->c:La/ql5;

    .line 471
    .line 472
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v6, v0, La/ql5;->f:Ljava/lang/String;

    .line 476
    .line 477
    iget-wide v9, v0, La/ql5;->b:D

    .line 478
    .line 479
    new-instance v11, La/ef6;

    .line 480
    .line 481
    new-instance v12, La/g30;

    .line 482
    .line 483
    invoke-direct {v12}, La/g30;-><init>()V

    .line 484
    .line 485
    .line 486
    new-instance v13, La/rw7;

    .line 487
    .line 488
    sget-object v14, La/pn40;->a:La/pn40;

    .line 489
    .line 490
    sget-object v14, La/p3u0;->c:La/p3u0;

    .line 491
    .line 492
    invoke-static {v9, v10, v14}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v14

    .line 496
    cmpg-double v7, v9, v7

    .line 497
    .line 498
    if-nez v7, :cond_f

    .line 499
    .line 500
    goto :goto_c

    .line 501
    :cond_f
    cmpl-double v3, v3, v9

    .line 502
    .line 503
    if-lez v3, :cond_10

    .line 504
    .line 505
    :goto_c
    iget-wide v3, v0, La/ql5;->a:J

    .line 506
    .line 507
    const-wide/16 v7, 0x0

    .line 508
    .line 509
    cmp-long v0, v3, v7

    .line 510
    .line 511
    if-eqz v0, :cond_10

    .line 512
    .line 513
    invoke-virtual {v2}, La/ctf0;->i()Z

    .line 514
    .line 515
    .line 516
    move-result v0

    .line 517
    if-eqz v0, :cond_10

    .line 518
    .line 519
    const/4 v3, 0x1

    .line 520
    goto :goto_d

    .line 521
    :cond_10
    move v3, v5

    .line 522
    :goto_d
    iget-boolean v0, v1, La/ym5;->d:Z

    .line 523
    .line 524
    invoke-direct {v13, v14, v6, v3, v0}, La/rw7;-><init>(Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 525
    .line 526
    .line 527
    invoke-direct {v11, v12, v13}, La/ef6;-><init>(La/v30;La/rw7;)V

    .line 528
    .line 529
    .line 530
    move-object v4, v11

    .line 531
    goto :goto_e

    .line 532
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 533
    .line 534
    .line 535
    :goto_e
    return-object v4

    .line 536
    :pswitch_2
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, La/fee;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    check-cast v1, La/ky6;

    .line 548
    .line 549
    iget-object v0, v0, La/z19;->p:Ljava/lang/Object;

    .line 550
    .line 551
    check-cast v0, La/sg20;

    .line 552
    .line 553
    iget-object v0, v0, La/sg20;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 556
    .line 557
    .line 558
    new-instance v2, La/py6;

    .line 559
    .line 560
    new-instance v3, La/uf40;

    .line 561
    .line 562
    iget-object v1, v1, La/ky6;->b:La/iur;

    .line 563
    .line 564
    new-instance v6, La/mgs;

    .line 565
    .line 566
    iget-object v7, v1, La/iur;->b:Ljava/lang/String;

    .line 567
    .line 568
    new-instance v8, La/p6q;

    .line 569
    .line 570
    sget-object v9, La/pn40;->a:La/pn40;

    .line 571
    .line 572
    iget-wide v9, v1, La/iur;->d:D

    .line 573
    .line 574
    iget v11, v0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->g:I

    .line 575
    .line 576
    invoke-static {v9, v10, v11, v5}, La/pn40;->j(DIZ)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    iget-boolean v0, v0, Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;->k:Z

    .line 581
    .line 582
    if-eqz v0, :cond_12

    .line 583
    .line 584
    sget-object v0, La/vx3;->b:La/vx3;

    .line 585
    .line 586
    goto :goto_f

    .line 587
    :cond_12
    sget-object v0, La/vx3;->c:La/vx3;

    .line 588
    .line 589
    :goto_f
    invoke-direct {v8, v5, v0}, La/p6q;-><init>(Ljava/lang/String;La/vx3;)V

    .line 590
    .line 591
    .line 592
    invoke-direct {v6, v7, v8}, La/mgs;-><init>(Ljava/lang/String;La/p6q;)V

    .line 593
    .line 594
    .line 595
    new-instance v0, La/c480;

    .line 596
    .line 597
    iget-object v5, v1, La/iur;->a:Ljava/lang/String;

    .line 598
    .line 599
    invoke-direct {v0, v5}, La/c480;-><init>(Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    iget-object v1, v1, La/iur;->c:La/j43;

    .line 603
    .line 604
    invoke-direct {v3, v6, v0, v1, v4}, La/uf40;-><init>(La/ogs;La/d480;La/j43;Ljava/lang/String;)V

    .line 605
    .line 606
    .line 607
    invoke-direct {v2, v3}, La/py6;-><init>(La/uf40;)V

    .line 608
    .line 609
    .line 610
    return-object v2

    .line 611
    :pswitch_3
    move-object/from16 v1, p1

    .line 612
    .line 613
    check-cast v1, La/fee;

    .line 614
    .line 615
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 619
    .line 620
    .line 621
    move-result-object v1

    .line 622
    check-cast v1, Ljava/lang/Boolean;

    .line 623
    .line 624
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 625
    .line 626
    .line 627
    move-result v1

    .line 628
    if-nez v1, :cond_13

    .line 629
    .line 630
    iget-object v0, v0, La/z19;->b:La/ctf0;

    .line 631
    .line 632
    new-instance v4, La/yw00;

    .line 633
    .line 634
    new-instance v1, La/g9x;

    .line 635
    .line 636
    new-array v2, v5, [Ljava/lang/Object;

    .line 637
    .line 638
    iget-object v3, v0, La/ctf0;->b:La/lsm0;

    .line 639
    .line 640
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 641
    .line 642
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 643
    .line 644
    .line 645
    move-result-object v2

    .line 646
    const v6, 0x7f13031e

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3, v6, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v2

    .line 653
    invoke-direct {v1, v2}, La/g9x;-><init>(Ljava/lang/String;)V

    .line 654
    .line 655
    .line 656
    new-instance v6, La/wul;

    .line 657
    .line 658
    sget-object v7, La/nul;->e:La/nul;

    .line 659
    .line 660
    sget-object v8, La/oe9;->a:La/oe9;

    .line 661
    .line 662
    new-instance v9, La/ue9;

    .line 663
    .line 664
    new-array v2, v5, [Ljava/lang/Object;

    .line 665
    .line 666
    invoke-static {v2, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v2

    .line 670
    const v3, 0x7f130e55

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 674
    .line 675
    .line 676
    move-result-object v2

    .line 677
    invoke-direct {v9, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 678
    .line 679
    .line 680
    const/4 v11, 0x0

    .line 681
    const/4 v12, 0x1

    .line 682
    const/4 v10, 0x1

    .line 683
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 684
    .line 685
    .line 686
    new-instance v2, La/wul;

    .line 687
    .line 688
    sget-object v9, La/iul;->e:La/iul;

    .line 689
    .line 690
    new-instance v11, La/ue9;

    .line 691
    .line 692
    new-array v3, v5, [Ljava/lang/Object;

    .line 693
    .line 694
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object v3

    .line 698
    const v5, 0x7f130e56

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-direct {v11, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 706
    .line 707
    .line 708
    const/4 v13, 0x0

    .line 709
    const/4 v14, 0x1

    .line 710
    move-object v10, v8

    .line 711
    move-object v8, v2

    .line 712
    invoke-direct/range {v8 .. v14}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 713
    .line 714
    .line 715
    invoke-direct {v4, v1, v6, v8}, La/yw00;-><init>(La/g9x;La/wul;La/wul;)V

    .line 716
    .line 717
    .line 718
    :cond_13
    return-object v4

    .line 719
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
