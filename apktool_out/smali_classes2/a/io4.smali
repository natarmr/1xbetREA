.class public final synthetic La/io4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jo4;


# direct methods
.method public synthetic constructor <init>(La/jo4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/io4;->a:B

    iput-object p1, p0, La/io4;->b:La/jo4;

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
    iget-byte v1, v0, La/io4;->a:B

    .line 4
    .line 5
    sget-object v2, La/r7q0;->a:La/r7q0;

    .line 6
    .line 7
    const v3, 0x7f13078c

    .line 8
    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    const/4 v5, 0x0

    .line 12
    const/4 v6, 0x0

    .line 13
    iget-object v0, v0, La/io4;->b:La/jo4;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/id4;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v2, v0, La/jo4;->j:La/n0o0;

    .line 26
    .line 27
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, La/fee;

    .line 32
    .line 33
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    check-cast v2, Ljava/util/List;

    .line 38
    .line 39
    iget-object v7, v0, La/jo4;->b:La/ctf0;

    .line 40
    .line 41
    iget-object v0, v0, La/jo4;->i:La/n0o0;

    .line 42
    .line 43
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    check-cast v0, La/fee;

    .line 48
    .line 49
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Ljava/lang/Boolean;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    iget-object v8, v1, La/id4;->b:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v9, Ljava/lang/StringBuilder;

    .line 68
    .line 69
    sget-object v10, La/ujn;->h:Ljava/lang/String;

    .line 70
    .line 71
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    iget-object v10, v1, La/id4;->e:Ljava/lang/String;

    .line 75
    .line 76
    iget-object v11, v1, La/id4;->c:Ljava/lang/String;

    .line 77
    .line 78
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v12

    .line 85
    if-nez v12, :cond_0

    .line 86
    .line 87
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_0
    sget-object v12, La/ujn;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v10, v12, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v12

    .line 97
    if-nez v12, :cond_3

    .line 98
    .line 99
    const-string v12, "https://"

    .line 100
    .line 101
    invoke-static {v10, v12, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 102
    .line 103
    .line 104
    move-result v12

    .line 105
    if-eqz v12, :cond_1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 109
    .line 110
    .line 111
    move-result v12

    .line 112
    const/16 v13, 0x2f

    .line 113
    .line 114
    if-lez v12, :cond_2

    .line 115
    .line 116
    const-string v12, "/"

    .line 117
    .line 118
    invoke-static {v9, v12}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 119
    .line 120
    .line 121
    move-result v12

    .line 122
    if-nez v12, :cond_2

    .line 123
    .line 124
    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    :cond_2
    new-array v4, v4, [C

    .line 128
    .line 129
    aput-char v13, v4, v6

    .line 130
    .line 131
    invoke-static {v10, v4}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v4

    .line 135
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_3
    :goto_0
    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    :goto_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v4

    .line 149
    new-array v9, v6, [Ljava/lang/Object;

    .line 150
    .line 151
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 152
    .line 153
    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v9

    .line 157
    const v10, 0x7f131182

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v15

    .line 164
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-nez v9, :cond_4

    .line 169
    .line 170
    new-instance v0, La/xmm;

    .line 171
    .line 172
    invoke-direct {v0, v15}, La/xmm;-><init>(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    goto :goto_6

    .line 176
    :cond_4
    new-instance v12, La/ymm;

    .line 177
    .line 178
    const-string v9, "+"

    .line 179
    .line 180
    invoke-static {v11, v9, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    if-eqz v10, :cond_6

    .line 185
    .line 186
    :cond_5
    :goto_2
    move-object v13, v11

    .line 187
    goto :goto_3

    .line 188
    :cond_6
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 189
    .line 190
    .line 191
    move-result v10

    .line 192
    if-lez v10, :cond_5

    .line 193
    .line 194
    invoke-virtual {v9, v11}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v11

    .line 198
    goto :goto_2

    .line 199
    :goto_3
    if-eqz v0, :cond_7

    .line 200
    .line 201
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-lez v0, :cond_7

    .line 206
    .line 207
    new-instance v0, La/n0x;

    .line 208
    .line 209
    invoke-direct {v0, v4}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 210
    .line 211
    .line 212
    :goto_4
    move-object v14, v0

    .line 213
    goto :goto_5

    .line 214
    :cond_7
    new-instance v0, La/m0x;

    .line 215
    .line 216
    const v4, 0x7f08096d

    .line 217
    .line 218
    .line 219
    const/4 v9, 0x6

    .line 220
    invoke-direct {v0, v4, v5, v9}, La/m0x;-><init>(ILa/bzw;I)V

    .line 221
    .line 222
    .line 223
    goto :goto_4

    .line 224
    :goto_5
    const/16 v16, 0x0

    .line 225
    .line 226
    const/16 v17, 0x30

    .line 227
    .line 228
    invoke-direct/range {v12 .. v17}, La/ymm;-><init>(Ljava/lang/String;La/o0x;Ljava/lang/String;La/y3d;I)V

    .line 229
    .line 230
    .line 231
    move-object v0, v12

    .line 232
    :goto_6
    new-instance v9, La/knm;

    .line 233
    .line 234
    iget-object v10, v1, La/id4;->a:Ljava/lang/String;

    .line 235
    .line 236
    new-array v4, v6, [Ljava/lang/Object;

    .line 237
    .line 238
    invoke-static {v4, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object v4

    .line 242
    const v11, 0x7f130f66

    .line 243
    .line 244
    .line 245
    invoke-virtual {v7, v11, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v11

    .line 249
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    new-instance v12, La/bm90;

    .line 253
    .line 254
    invoke-direct {v12, v8}, La/bm90;-><init>(Ljava/lang/String;)V

    .line 255
    .line 256
    .line 257
    iget v1, v1, La/id4;->d:I

    .line 258
    .line 259
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 260
    .line 261
    .line 262
    move-result-object v13

    .line 263
    new-instance v14, La/yu90;

    .line 264
    .line 265
    invoke-direct {v14, v8}, La/yu90;-><init>(Ljava/lang/String;)V

    .line 266
    .line 267
    .line 268
    invoke-direct/range {v9 .. v14}, La/knm;-><init>(Ljava/lang/String;Ljava/lang/String;La/bm90;Ljava/lang/Integer;La/yu90;)V

    .line 269
    .line 270
    .line 271
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 276
    .line 277
    .line 278
    move-result v2

    .line 279
    if-eqz v2, :cond_9

    .line 280
    .line 281
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v2

    .line 285
    move-object v4, v2

    .line 286
    check-cast v4, La/lh4;

    .line 287
    .line 288
    instance-of v8, v4, La/kh4;

    .line 289
    .line 290
    if-nez v8, :cond_a

    .line 291
    .line 292
    instance-of v4, v4, La/ih4;

    .line 293
    .line 294
    if-eqz v4, :cond_8

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_9
    move-object v2, v5

    .line 298
    :cond_a
    :goto_7
    check-cast v2, La/lh4;

    .line 299
    .line 300
    if-eqz v2, :cond_b

    .line 301
    .line 302
    new-instance v5, La/anm;

    .line 303
    .line 304
    new-array v1, v6, [Ljava/lang/Object;

    .line 305
    .line 306
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object v1

    .line 310
    invoke-virtual {v7, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v1

    .line 314
    invoke-direct {v5, v1}, La/anm;-><init>(Ljava/lang/String;)V

    .line 315
    .line 316
    .line 317
    :cond_b
    new-instance v1, La/inm;

    .line 318
    .line 319
    invoke-direct {v1, v0, v9, v5}, La/inm;-><init>(La/zmm;La/knm;La/anm;)V

    .line 320
    .line 321
    .line 322
    return-object v1

    .line 323
    :pswitch_0
    move-object/from16 v1, p1

    .line 324
    .line 325
    check-cast v1, La/gd4;

    .line 326
    .line 327
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 328
    .line 329
    .line 330
    iget-object v7, v0, La/jo4;->b:La/ctf0;

    .line 331
    .line 332
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 333
    .line 334
    .line 335
    move-result-object v8

    .line 336
    invoke-virtual {v8}, La/fee;->c()Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    move-result-object v8

    .line 340
    check-cast v8, La/jj4;

    .line 341
    .line 342
    iget-boolean v8, v8, La/jj4;->c:Z

    .line 343
    .line 344
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 345
    .line 346
    .line 347
    move-result-object v9

    .line 348
    invoke-virtual {v9}, La/fee;->c()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    check-cast v9, La/jj4;

    .line 353
    .line 354
    iget-boolean v9, v9, La/jj4;->d:Z

    .line 355
    .line 356
    iget-object v10, v0, La/jo4;->e:La/n0o0;

    .line 357
    .line 358
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v10

    .line 362
    check-cast v10, La/fee;

    .line 363
    .line 364
    invoke-virtual {v10}, La/fee;->c()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v10

    .line 368
    check-cast v10, Ljava/lang/Boolean;

    .line 369
    .line 370
    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    .line 371
    .line 372
    .line 373
    move-result v10

    .line 374
    if-nez v8, :cond_c

    .line 375
    .line 376
    if-nez v9, :cond_c

    .line 377
    .line 378
    if-nez v10, :cond_c

    .line 379
    .line 380
    const v8, 0x7f130a22

    .line 381
    .line 382
    .line 383
    goto :goto_9

    .line 384
    :cond_c
    const v11, 0x7f130b59

    .line 385
    .line 386
    .line 387
    if-nez v8, :cond_d

    .line 388
    .line 389
    if-eqz v9, :cond_d

    .line 390
    .line 391
    if-nez v10, :cond_d

    .line 392
    .line 393
    :goto_8
    move v8, v11

    .line 394
    goto :goto_9

    .line 395
    :cond_d
    if-nez v8, :cond_e

    .line 396
    .line 397
    if-eqz v9, :cond_e

    .line 398
    .line 399
    if-eqz v10, :cond_e

    .line 400
    .line 401
    goto :goto_8

    .line 402
    :cond_e
    const v11, 0x7f130777

    .line 403
    .line 404
    .line 405
    if-eqz v8, :cond_f

    .line 406
    .line 407
    if-nez v9, :cond_f

    .line 408
    .line 409
    if-nez v10, :cond_f

    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_f
    if-eqz v8, :cond_10

    .line 413
    .line 414
    if-nez v9, :cond_10

    .line 415
    .line 416
    if-eqz v10, :cond_10

    .line 417
    .line 418
    goto :goto_8

    .line 419
    :cond_10
    const v8, 0x7f130b5d

    .line 420
    .line 421
    .line 422
    :goto_9
    new-array v9, v6, [Ljava/lang/Object;

    .line 423
    .line 424
    iget-object v10, v7, La/ctf0;->b:La/lsm0;

    .line 425
    .line 426
    invoke-static {v9, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v9

    .line 430
    invoke-virtual {v10, v8, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v19

    .line 434
    iget-object v0, v0, La/jo4;->j:La/n0o0;

    .line 435
    .line 436
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    check-cast v0, La/fee;

    .line 441
    .line 442
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    check-cast v0, Ljava/util/List;

    .line 447
    .line 448
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    iget-object v12, v1, La/gd4;->a:Ljava/lang/String;

    .line 455
    .line 456
    new-instance v1, La/y5q0;

    .line 457
    .line 458
    sget-object v8, La/oie;->a:La/mie;

    .line 459
    .line 460
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    sget-object v8, La/mie;->b:La/ky2;

    .line 464
    .line 465
    sget-object v9, La/mie;->d:La/ky2;

    .line 466
    .line 467
    invoke-virtual {v8, v9}, La/ky2;->a(La/oie;)La/ky2;

    .line 468
    .line 469
    .line 470
    move-result-object v8

    .line 471
    const/4 v9, 0x2

    .line 472
    invoke-direct {v1, v4, v5, v8, v9}, La/y5q0;-><init>(ILa/vuu0;La/oie;I)V

    .line 473
    .line 474
    .line 475
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 476
    .line 477
    .line 478
    move-result-object v8

    .line 479
    :cond_11
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 480
    .line 481
    .line 482
    move-result v9

    .line 483
    if-eqz v9, :cond_12

    .line 484
    .line 485
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v9

    .line 489
    move-object v10, v9

    .line 490
    check-cast v10, La/lh4;

    .line 491
    .line 492
    instance-of v10, v10, La/gh4;

    .line 493
    .line 494
    if-eqz v10, :cond_11

    .line 495
    .line 496
    move-object v5, v9

    .line 497
    :cond_12
    check-cast v5, La/lh4;

    .line 498
    .line 499
    if-eqz v5, :cond_13

    .line 500
    .line 501
    new-instance v2, La/s7q0;

    .line 502
    .line 503
    new-array v5, v6, [Ljava/lang/Object;

    .line 504
    .line 505
    iget-object v7, v7, La/ctf0;->b:La/lsm0;

    .line 506
    .line 507
    invoke-static {v5, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    invoke-virtual {v7, v3, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v3

    .line 515
    invoke-direct {v2, v3}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 516
    .line 517
    .line 518
    :cond_13
    move-object v15, v2

    .line 519
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 520
    .line 521
    .line 522
    move-result v2

    .line 523
    if-eqz v2, :cond_15

    .line 524
    .line 525
    :cond_14
    move/from16 v17, v6

    .line 526
    .line 527
    goto :goto_a

    .line 528
    :cond_15
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    if-eqz v2, :cond_14

    .line 537
    .line 538
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    check-cast v2, La/lh4;

    .line 543
    .line 544
    instance-of v2, v2, La/gh4;

    .line 545
    .line 546
    if-eqz v2, :cond_16

    .line 547
    .line 548
    move/from16 v17, v4

    .line 549
    .line 550
    :goto_a
    new-instance v11, La/s6q0;

    .line 551
    .line 552
    const/16 v20, 0x0

    .line 553
    .line 554
    const/16 v21, 0x7d00

    .line 555
    .line 556
    sget-object v13, La/e6q0;->a:La/e6q0;

    .line 557
    .line 558
    sget-object v14, La/o6q0;->a:La/o6q0;

    .line 559
    .line 560
    const/16 v16, 0x1

    .line 561
    .line 562
    move-object/from16 v18, v1

    .line 563
    .line 564
    invoke-direct/range {v11 .. v21}, La/s6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;I)V

    .line 565
    .line 566
    .line 567
    return-object v11

    .line 568
    :pswitch_1
    move-object/from16 v1, p1

    .line 569
    .line 570
    check-cast v1, Ljava/lang/Boolean;

    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 573
    .line 574
    .line 575
    move-result v1

    .line 576
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 577
    .line 578
    .line 579
    move-result-object v2

    .line 580
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v2

    .line 584
    check-cast v2, La/jj4;

    .line 585
    .line 586
    iget-boolean v2, v2, La/jj4;->b:Z

    .line 587
    .line 588
    if-eqz v2, :cond_19

    .line 589
    .line 590
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 591
    .line 592
    .line 593
    move-result-object v2

    .line 594
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    move-result-object v2

    .line 598
    check-cast v2, La/jj4;

    .line 599
    .line 600
    iget-boolean v2, v2, La/jj4;->c:Z

    .line 601
    .line 602
    if-nez v2, :cond_17

    .line 603
    .line 604
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 605
    .line 606
    .line 607
    move-result-object v0

    .line 608
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v0

    .line 612
    check-cast v0, La/jj4;

    .line 613
    .line 614
    iget-boolean v0, v0, La/jj4;->d:Z

    .line 615
    .line 616
    if-eqz v0, :cond_19

    .line 617
    .line 618
    :cond_17
    new-instance v6, La/wul;

    .line 619
    .line 620
    sget-object v7, La/lul;->e:La/lul;

    .line 621
    .line 622
    sget-object v8, La/oe9;->a:La/oe9;

    .line 623
    .line 624
    new-instance v9, La/te9;

    .line 625
    .line 626
    if-eqz v1, :cond_18

    .line 627
    .line 628
    const v0, 0x7f08098c

    .line 629
    .line 630
    .line 631
    goto :goto_b

    .line 632
    :cond_18
    const v0, 0x7f0808f8

    .line 633
    .line 634
    .line 635
    :goto_b
    invoke-direct {v9, v0}, La/te9;-><init>(I)V

    .line 636
    .line 637
    .line 638
    const/4 v11, 0x0

    .line 639
    const/4 v12, 0x1

    .line 640
    const/4 v10, 0x1

    .line 641
    invoke-direct/range {v6 .. v12}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 642
    .line 643
    .line 644
    move-object v5, v6

    .line 645
    :cond_19
    return-object v5

    .line 646
    :pswitch_2
    move-object/from16 v1, p1

    .line 647
    .line 648
    check-cast v1, Ljava/lang/Boolean;

    .line 649
    .line 650
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    if-eqz v1, :cond_1a

    .line 655
    .line 656
    goto :goto_c

    .line 657
    :cond_1a
    new-instance v7, La/wul;

    .line 658
    .line 659
    sget-object v8, La/mul;->e:La/mul;

    .line 660
    .line 661
    sget-object v9, La/oe9;->b:La/oe9;

    .line 662
    .line 663
    new-instance v10, La/ue9;

    .line 664
    .line 665
    iget-object v0, v0, La/jo4;->b:La/ctf0;

    .line 666
    .line 667
    new-array v1, v6, [Ljava/lang/Object;

    .line 668
    .line 669
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 670
    .line 671
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    const v2, 0x7f1308fa

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    invoke-direct {v10, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    const/4 v12, 0x0

    .line 686
    const/4 v13, 0x0

    .line 687
    const/4 v11, 0x1

    .line 688
    invoke-direct/range {v7 .. v13}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 689
    .line 690
    .line 691
    move-object v5, v7

    .line 692
    :goto_c
    return-object v5

    .line 693
    :pswitch_3
    move-object/from16 v1, p1

    .line 694
    .line 695
    check-cast v1, Ljava/lang/Boolean;

    .line 696
    .line 697
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 698
    .line 699
    .line 700
    move-result v1

    .line 701
    if-eqz v1, :cond_1b

    .line 702
    .line 703
    goto :goto_d

    .line 704
    :cond_1b
    new-instance v7, La/wul;

    .line 705
    .line 706
    sget-object v8, La/nul;->e:La/nul;

    .line 707
    .line 708
    sget-object v9, La/oe9;->a:La/oe9;

    .line 709
    .line 710
    new-instance v10, La/ue9;

    .line 711
    .line 712
    iget-object v0, v0, La/jo4;->b:La/ctf0;

    .line 713
    .line 714
    new-array v1, v6, [Ljava/lang/Object;

    .line 715
    .line 716
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 717
    .line 718
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    const v2, 0x7f13112e

    .line 723
    .line 724
    .line 725
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v0

    .line 729
    invoke-direct {v10, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 730
    .line 731
    .line 732
    const/4 v12, 0x0

    .line 733
    const/4 v13, 0x0

    .line 734
    const/4 v11, 0x1

    .line 735
    invoke-direct/range {v7 .. v13}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 736
    .line 737
    .line 738
    move-object v5, v7

    .line 739
    :goto_d
    return-object v5

    .line 740
    :pswitch_4
    move-object/from16 v1, p1

    .line 741
    .line 742
    check-cast v1, Ljava/lang/String;

    .line 743
    .line 744
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    new-instance v7, La/imm;

    .line 748
    .line 749
    invoke-virtual {v0}, La/jo4;->b()La/fee;

    .line 750
    .line 751
    .line 752
    move-result-object v2

    .line 753
    iget-object v0, v0, La/jo4;->b:La/ctf0;

    .line 754
    .line 755
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 756
    .line 757
    .line 758
    move-result-object v2

    .line 759
    check-cast v2, La/jj4;

    .line 760
    .line 761
    iget-boolean v2, v2, La/jj4;->p:Z

    .line 762
    .line 763
    if-eqz v2, :cond_1c

    .line 764
    .line 765
    sget-object v2, La/jlm;->a:La/jlm;

    .line 766
    .line 767
    :goto_e
    move-object v8, v2

    .line 768
    goto :goto_f

    .line 769
    :cond_1c
    sget-object v2, La/klm;->a:La/klm;

    .line 770
    .line 771
    goto :goto_e

    .line 772
    :goto_f
    new-array v2, v6, [Ljava/lang/Object;

    .line 773
    .line 774
    iget-object v3, v0, La/ctf0;->b:La/lsm0;

    .line 775
    .line 776
    invoke-static {v2, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 777
    .line 778
    .line 779
    move-result-object v2

    .line 780
    const v5, 0x7f13019e

    .line 781
    .line 782
    .line 783
    invoke-virtual {v3, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 784
    .line 785
    .line 786
    move-result-object v10

    .line 787
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v1

    .line 791
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 792
    .line 793
    invoke-static {v1, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 794
    .line 795
    .line 796
    move-result-object v1

    .line 797
    const v2, 0x7f130180

    .line 798
    .line 799
    .line 800
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 801
    .line 802
    .line 803
    move-result-object v11

    .line 804
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 805
    .line 806
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 807
    .line 808
    .line 809
    move-result-wide v12

    .line 810
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 811
    .line 812
    .line 813
    move-result-wide v14

    .line 814
    new-instance v9, La/rlm;

    .line 815
    .line 816
    sget-object v16, La/fa50;->a:La/fa50;

    .line 817
    .line 818
    invoke-direct/range {v9 .. v16}, La/rlm;-><init>(Ljava/lang/String;Ljava/lang/String;JJLa/ga50;)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 822
    .line 823
    .line 824
    move-result-wide v11

    .line 825
    const/4 v13, 0x0

    .line 826
    const/4 v14, 0x0

    .line 827
    sget-object v10, La/fmm;->a:La/fmm;

    .line 828
    .line 829
    invoke-direct/range {v7 .. v14}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 830
    .line 831
    .line 832
    return-object v7

    .line 833
    :pswitch_5
    move-object/from16 v1, p1

    .line 834
    .line 835
    check-cast v1, La/hd4;

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    iget-object v7, v0, La/jo4;->j:La/n0o0;

    .line 841
    .line 842
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 843
    .line 844
    .line 845
    move-result-object v7

    .line 846
    check-cast v7, La/fee;

    .line 847
    .line 848
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 849
    .line 850
    .line 851
    move-result-object v7

    .line 852
    check-cast v7, Ljava/util/List;

    .line 853
    .line 854
    iget-object v8, v0, La/jo4;->b:La/ctf0;

    .line 855
    .line 856
    iget-object v0, v0, La/jo4;->f:La/n0o0;

    .line 857
    .line 858
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 859
    .line 860
    .line 861
    move-result-object v0

    .line 862
    check-cast v0, La/fee;

    .line 863
    .line 864
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    check-cast v0, Ljava/lang/Boolean;

    .line 869
    .line 870
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 871
    .line 872
    .line 873
    move-result v0

    .line 874
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 878
    .line 879
    .line 880
    iget-object v10, v1, La/hd4;->a:Ljava/lang/String;

    .line 881
    .line 882
    if-eqz v0, :cond_1d

    .line 883
    .line 884
    sget-object v0, La/o6q0;->a:La/o6q0;

    .line 885
    .line 886
    :goto_10
    move-object v12, v0

    .line 887
    goto :goto_11

    .line 888
    :cond_1d
    sget-object v0, La/l6q0;->a:La/l6q0;

    .line 889
    .line 890
    goto :goto_10

    .line 891
    :goto_11
    new-instance v0, La/a6q0;

    .line 892
    .line 893
    invoke-direct {v0, v6, v6}, La/a6q0;-><init>(ZZ)V

    .line 894
    .line 895
    .line 896
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 897
    .line 898
    .line 899
    move-result-object v1

    .line 900
    :cond_1e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 901
    .line 902
    .line 903
    move-result v9

    .line 904
    if-eqz v9, :cond_1f

    .line 905
    .line 906
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v9

    .line 910
    move-object v11, v9

    .line 911
    check-cast v11, La/lh4;

    .line 912
    .line 913
    instance-of v11, v11, La/hh4;

    .line 914
    .line 915
    if-eqz v11, :cond_1e

    .line 916
    .line 917
    move-object v5, v9

    .line 918
    :cond_1f
    check-cast v5, La/lh4;

    .line 919
    .line 920
    if-eqz v5, :cond_20

    .line 921
    .line 922
    new-instance v2, La/s7q0;

    .line 923
    .line 924
    new-array v1, v6, [Ljava/lang/Object;

    .line 925
    .line 926
    iget-object v5, v8, La/ctf0;->b:La/lsm0;

    .line 927
    .line 928
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 929
    .line 930
    .line 931
    move-result-object v1

    .line 932
    invoke-virtual {v5, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v1

    .line 936
    invoke-direct {v2, v1}, La/s7q0;-><init>(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    :cond_20
    move-object v13, v2

    .line 940
    new-array v1, v6, [Ljava/lang/Object;

    .line 941
    .line 942
    iget-object v2, v8, La/ctf0;->b:La/lsm0;

    .line 943
    .line 944
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 945
    .line 946
    .line 947
    move-result-object v1

    .line 948
    const v3, 0x7f130f15

    .line 949
    .line 950
    .line 951
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v17

    .line 955
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 956
    .line 957
    .line 958
    move-result v1

    .line 959
    if-eqz v1, :cond_22

    .line 960
    .line 961
    :cond_21
    move v15, v6

    .line 962
    goto :goto_12

    .line 963
    :cond_22
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 964
    .line 965
    .line 966
    move-result-object v1

    .line 967
    :cond_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 968
    .line 969
    .line 970
    move-result v2

    .line 971
    if-eqz v2, :cond_21

    .line 972
    .line 973
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    move-result-object v2

    .line 977
    check-cast v2, La/lh4;

    .line 978
    .line 979
    instance-of v2, v2, La/hh4;

    .line 980
    .line 981
    if-eqz v2, :cond_23

    .line 982
    .line 983
    move v15, v4

    .line 984
    :goto_12
    new-instance v9, La/s6q0;

    .line 985
    .line 986
    const/16 v18, 0x0

    .line 987
    .line 988
    const/16 v19, 0x7d00

    .line 989
    .line 990
    sget-object v11, La/e6q0;->a:La/e6q0;

    .line 991
    .line 992
    const/4 v14, 0x1

    .line 993
    move-object/from16 v16, v0

    .line 994
    .line 995
    invoke-direct/range {v9 .. v19}, La/s6q0;-><init>(Ljava/lang/String;La/f6q0;La/p6q0;La/t7q0;ZZLa/b6q0;Ljava/lang/String;Ljava/lang/String;I)V

    .line 996
    .line 997
    .line 998
    return-object v9

    .line 999
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
