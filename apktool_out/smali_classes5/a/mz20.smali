.class public final synthetic La/mz20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qk1;


# direct methods
.method public synthetic constructor <init>(La/qk1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/mz20;->a:B

    iput-object p1, p0, La/mz20;->b:La/qk1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mz20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/mz20;->b:La/qk1;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ljava/util/List;

    .line 16
    .line 17
    if-eqz v1, :cond_e

    .line 18
    .line 19
    new-instance v5, Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    .line 24
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 29
    .line 30
    .line 31
    move-result v6

    .line 32
    if-eqz v6, :cond_d

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    check-cast v6, La/xvm0;

    .line 39
    .line 40
    iget-object v7, v0, La/qk1;->f:La/n0o0;

    .line 41
    .line 42
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    check-cast v7, La/fee;

    .line 47
    .line 48
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/lang/Long;

    .line 53
    .line 54
    iget-object v8, v0, La/qk1;->b:La/ctf0;

    .line 55
    .line 56
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    instance-of v9, v6, La/wvm0;

    .line 63
    .line 64
    const v10, 0x7f130c89

    .line 65
    .line 66
    .line 67
    if-eqz v9, :cond_4

    .line 68
    .line 69
    new-instance v11, La/rwm0;

    .line 70
    .line 71
    check-cast v6, La/wvm0;

    .line 72
    .line 73
    invoke-interface {v6}, La/xvm0;->a()J

    .line 74
    .line 75
    .line 76
    move-result-wide v12

    .line 77
    invoke-interface {v6}, La/xvm0;->getId()J

    .line 78
    .line 79
    .line 80
    move-result-wide v14

    .line 81
    invoke-interface {v6}, La/wvm0;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    if-nez v9, :cond_1

    .line 86
    .line 87
    new-array v9, v2, [Ljava/lang/Object;

    .line 88
    .line 89
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 90
    .line 91
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v9

    .line 95
    invoke-virtual {v8, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v9

    .line 99
    :cond_1
    move-object/from16 v16, v9

    .line 100
    .line 101
    invoke-interface {v6}, La/xvm0;->getId()J

    .line 102
    .line 103
    .line 104
    move-result-wide v8

    .line 105
    if-nez v7, :cond_2

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_2
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 109
    .line 110
    .line 111
    move-result-wide v6

    .line 112
    cmp-long v6, v6, v8

    .line 113
    .line 114
    if-nez v6, :cond_3

    .line 115
    .line 116
    move/from16 v18, v3

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_3
    :goto_1
    move/from16 v18, v2

    .line 120
    .line 121
    :goto_2
    const/16 v17, 0x0

    .line 122
    .line 123
    invoke-direct/range {v11 .. v18}, La/rwm0;-><init>(JJLjava/lang/String;ZZ)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_7

    .line 127
    .line 128
    :cond_4
    instance-of v9, v6, La/svm0;

    .line 129
    .line 130
    if-eqz v9, :cond_7

    .line 131
    .line 132
    new-instance v11, La/rwm0;

    .line 133
    .line 134
    check-cast v6, La/svm0;

    .line 135
    .line 136
    iget-wide v12, v6, La/svm0;->b:J

    .line 137
    .line 138
    iget-wide v14, v6, La/svm0;->a:J

    .line 139
    .line 140
    new-array v9, v2, [Ljava/lang/Object;

    .line 141
    .line 142
    const v10, 0x7f130923

    .line 143
    .line 144
    .line 145
    invoke-virtual {v8, v10, v9}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v16

    .line 149
    iget-wide v8, v6, La/svm0;->a:J

    .line 150
    .line 151
    if-nez v7, :cond_5

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_5
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 155
    .line 156
    .line 157
    move-result-wide v6

    .line 158
    cmp-long v6, v6, v8

    .line 159
    .line 160
    if-nez v6, :cond_6

    .line 161
    .line 162
    move/from16 v18, v3

    .line 163
    .line 164
    goto :goto_4

    .line 165
    :cond_6
    :goto_3
    move/from16 v18, v2

    .line 166
    .line 167
    :goto_4
    const/16 v17, 0x1

    .line 168
    .line 169
    invoke-direct/range {v11 .. v18}, La/rwm0;-><init>(JJLjava/lang/String;ZZ)V

    .line 170
    .line 171
    .line 172
    goto :goto_7

    .line 173
    :cond_7
    instance-of v9, v6, La/rvm0;

    .line 174
    .line 175
    if-eqz v9, :cond_8

    .line 176
    .line 177
    move-object v11, v4

    .line 178
    goto :goto_7

    .line 179
    :cond_8
    instance-of v9, v6, La/tvm0;

    .line 180
    .line 181
    if-eqz v9, :cond_c

    .line 182
    .line 183
    new-instance v11, La/rwm0;

    .line 184
    .line 185
    check-cast v6, La/tvm0;

    .line 186
    .line 187
    iget-wide v12, v6, La/tvm0;->b:J

    .line 188
    .line 189
    iget-wide v14, v6, La/tvm0;->a:J

    .line 190
    .line 191
    iget-object v9, v6, La/tvm0;->d:Ljava/lang/String;

    .line 192
    .line 193
    if-nez v9, :cond_9

    .line 194
    .line 195
    new-array v9, v2, [Ljava/lang/Object;

    .line 196
    .line 197
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 198
    .line 199
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v9

    .line 203
    invoke-virtual {v8, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v9

    .line 207
    :cond_9
    move-object/from16 v16, v9

    .line 208
    .line 209
    iget-wide v8, v6, La/tvm0;->a:J

    .line 210
    .line 211
    if-nez v7, :cond_a

    .line 212
    .line 213
    goto :goto_5

    .line 214
    :cond_a
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 215
    .line 216
    .line 217
    move-result-wide v6

    .line 218
    cmp-long v6, v6, v8

    .line 219
    .line 220
    if-nez v6, :cond_b

    .line 221
    .line 222
    move/from16 v18, v3

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_b
    :goto_5
    move/from16 v18, v2

    .line 226
    .line 227
    :goto_6
    const/16 v17, 0x0

    .line 228
    .line 229
    invoke-direct/range {v11 .. v18}, La/rwm0;-><init>(JJLjava/lang/String;ZZ)V

    .line 230
    .line 231
    .line 232
    :goto_7
    if-eqz v11, :cond_0

    .line 233
    .line 234
    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    goto/16 :goto_0

    .line 238
    .line 239
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 240
    .line 241
    .line 242
    goto :goto_9

    .line 243
    :cond_d
    move-object v4, v5

    .line 244
    :cond_e
    if-nez v4, :cond_f

    .line 245
    .line 246
    sget-object v0, La/iun;->a:La/iun;

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :cond_f
    move-object v0, v4

    .line 250
    :goto_8
    if-eqz v4, :cond_10

    .line 251
    .line 252
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    const/4 v4, 0x4

    .line 257
    if-lt v1, v4, :cond_10

    .line 258
    .line 259
    move v2, v3

    .line 260
    :cond_10
    new-instance v4, La/qym0;

    .line 261
    .line 262
    invoke-direct {v4, v0, v2}, La/qym0;-><init>(Ljava/util/List;Z)V

    .line 263
    .line 264
    .line 265
    :goto_9
    return-object v4

    .line 266
    :pswitch_0
    move-object/from16 v1, p1

    .line 267
    .line 268
    check-cast v1, Ljava/util/List;

    .line 269
    .line 270
    if-eqz v1, :cond_1f

    .line 271
    .line 272
    new-instance v5, Ljava/util/ArrayList;

    .line 273
    .line 274
    const/16 v6, 0xa

    .line 275
    .line 276
    invoke-static {v1, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 277
    .line 278
    .line 279
    move-result v6

    .line 280
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 281
    .line 282
    .line 283
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    if-eqz v6, :cond_1e

    .line 292
    .line 293
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    check-cast v6, La/js20;

    .line 298
    .line 299
    iget-object v7, v0, La/qk1;->d:La/n0o0;

    .line 300
    .line 301
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v7

    .line 305
    check-cast v7, La/fee;

    .line 306
    .line 307
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v7

    .line 311
    check-cast v7, Ljava/lang/Long;

    .line 312
    .line 313
    iget-object v8, v0, La/qk1;->b:La/ctf0;

    .line 314
    .line 315
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 316
    .line 317
    .line 318
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    instance-of v9, v6, La/gs20;

    .line 322
    .line 323
    if-eqz v9, :cond_13

    .line 324
    .line 325
    new-instance v6, La/os20;

    .line 326
    .line 327
    new-array v9, v2, [Ljava/lang/Object;

    .line 328
    .line 329
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 330
    .line 331
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v9

    .line 335
    const v10, 0x7f1300eb

    .line 336
    .line 337
    .line 338
    invoke-virtual {v8, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 339
    .line 340
    .line 341
    move-result-object v8

    .line 342
    const-wide/16 v9, -0x1a

    .line 343
    .line 344
    if-nez v7, :cond_11

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_11
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 348
    .line 349
    .line 350
    move-result-wide v11

    .line 351
    cmp-long v7, v11, v9

    .line 352
    .line 353
    if-nez v7, :cond_12

    .line 354
    .line 355
    move v7, v3

    .line 356
    goto :goto_c

    .line 357
    :cond_12
    :goto_b
    move v7, v2

    .line 358
    :goto_c
    invoke-direct {v6, v8, v9, v10, v7}, La/os20;-><init>(Ljava/lang/String;JZ)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_13

    .line 362
    .line 363
    :cond_13
    instance-of v9, v6, La/hs20;

    .line 364
    .line 365
    if-eqz v9, :cond_14

    .line 366
    .line 367
    new-instance v6, La/ns20;

    .line 368
    .line 369
    new-array v7, v2, [Ljava/lang/Object;

    .line 370
    .line 371
    iget-object v8, v8, La/ctf0;->b:La/lsm0;

    .line 372
    .line 373
    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v7

    .line 377
    const v9, 0x7f130fa7

    .line 378
    .line 379
    .line 380
    invoke-virtual {v8, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 381
    .line 382
    .line 383
    move-result-object v7

    .line 384
    invoke-direct {v6, v7}, La/ns20;-><init>(Ljava/lang/String;)V

    .line 385
    .line 386
    .line 387
    goto :goto_13

    .line 388
    :cond_14
    instance-of v8, v6, La/is20;

    .line 389
    .line 390
    if-eqz v8, :cond_1d

    .line 391
    .line 392
    check-cast v6, La/is20;

    .line 393
    .line 394
    iget-object v8, v6, La/is20;->b:Ljava/lang/String;

    .line 395
    .line 396
    iget-wide v9, v6, La/is20;->a:J

    .line 397
    .line 398
    const-wide/16 v11, 0x2

    .line 399
    .line 400
    cmp-long v6, v9, v11

    .line 401
    .line 402
    if-nez v6, :cond_17

    .line 403
    .line 404
    new-instance v6, La/qs20;

    .line 405
    .line 406
    if-nez v7, :cond_15

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :cond_15
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 410
    .line 411
    .line 412
    move-result-wide v11

    .line 413
    cmp-long v7, v11, v9

    .line 414
    .line 415
    if-nez v7, :cond_16

    .line 416
    .line 417
    move v7, v3

    .line 418
    goto :goto_e

    .line 419
    :cond_16
    :goto_d
    move v7, v2

    .line 420
    :goto_e
    invoke-direct {v6, v8, v9, v10, v7}, La/qs20;-><init>(Ljava/lang/String;JZ)V

    .line 421
    .line 422
    .line 423
    goto :goto_13

    .line 424
    :cond_17
    const-wide/16 v11, 0x13

    .line 425
    .line 426
    cmp-long v6, v9, v11

    .line 427
    .line 428
    if-nez v6, :cond_1a

    .line 429
    .line 430
    new-instance v6, La/ps20;

    .line 431
    .line 432
    if-nez v7, :cond_18

    .line 433
    .line 434
    goto :goto_f

    .line 435
    :cond_18
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 436
    .line 437
    .line 438
    move-result-wide v11

    .line 439
    cmp-long v7, v11, v9

    .line 440
    .line 441
    if-nez v7, :cond_19

    .line 442
    .line 443
    move v7, v3

    .line 444
    goto :goto_10

    .line 445
    :cond_19
    :goto_f
    move v7, v2

    .line 446
    :goto_10
    invoke-direct {v6, v8, v9, v10, v7}, La/ps20;-><init>(Ljava/lang/String;JZ)V

    .line 447
    .line 448
    .line 449
    goto :goto_13

    .line 450
    :cond_1a
    new-instance v6, La/os20;

    .line 451
    .line 452
    if-nez v7, :cond_1b

    .line 453
    .line 454
    goto :goto_11

    .line 455
    :cond_1b
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 456
    .line 457
    .line 458
    move-result-wide v11

    .line 459
    cmp-long v7, v11, v9

    .line 460
    .line 461
    if-nez v7, :cond_1c

    .line 462
    .line 463
    move v7, v3

    .line 464
    goto :goto_12

    .line 465
    :cond_1c
    :goto_11
    move v7, v2

    .line 466
    :goto_12
    invoke-direct {v6, v8, v9, v10, v7}, La/os20;-><init>(Ljava/lang/String;JZ)V

    .line 467
    .line 468
    .line 469
    :goto_13
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    goto/16 :goto_a

    .line 473
    .line 474
    :cond_1d
    invoke-static {}, La/t9f;->b()V

    .line 475
    .line 476
    .line 477
    goto :goto_14

    .line 478
    :cond_1e
    move-object v4, v5

    .line 479
    goto :goto_14

    .line 480
    :cond_1f
    sget-object v4, La/iun;->a:La/iun;

    .line 481
    .line 482
    :goto_14
    return-object v4

    .line 483
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
