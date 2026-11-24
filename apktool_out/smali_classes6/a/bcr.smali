.class public final synthetic La/bcr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ecr;


# direct methods
.method public synthetic constructor <init>(La/ecr;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/bcr;->a:B

    iput-object p1, p0, La/bcr;->b:La/ecr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bcr;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    iget-object v0, v0, La/bcr;->b:La/ecr;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object/from16 v1, p1

    .line 13
    .line 14
    check-cast v1, La/fn8;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    iget-boolean v2, v1, La/fn8;->a:Z

    .line 20
    .line 21
    iget-object v0, v0, La/ecr;->b:La/ctf0;

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    iget-boolean v1, v1, La/fn8;->b:Z

    .line 26
    .line 27
    invoke-static {v0, v1}, La/fcr;->e(La/ctf0;Z)La/mtl;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    invoke-static {v0}, La/fcr;->c(La/ctf0;)La/mtl;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    :goto_0
    return-object v0

    .line 37
    :pswitch_0
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, La/ox4;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v8, v0, La/ecr;->b:La/ctf0;

    .line 45
    .line 46
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v0, La/rx4;

    .line 50
    .line 51
    iget-object v12, v1, La/ox4;->a:La/hx4;

    .line 52
    .line 53
    iget-boolean v13, v1, La/ox4;->c:Z

    .line 54
    .line 55
    iget-object v6, v12, La/hx4;->b:La/yyc;

    .line 56
    .line 57
    new-instance v15, La/po7;

    .line 58
    .line 59
    iget-object v7, v12, La/hx4;->a:La/a8q0;

    .line 60
    .line 61
    invoke-direct {v15, v7}, La/po7;-><init>(La/a8q0;)V

    .line 62
    .line 63
    .line 64
    iget-object v7, v12, La/hx4;->c:La/bx6;

    .line 65
    .line 66
    iget-object v9, v7, La/bx6;->b:La/tw6;

    .line 67
    .line 68
    iget-boolean v10, v9, La/tw6;->n:Z

    .line 69
    .line 70
    if-nez v10, :cond_2

    .line 71
    .line 72
    if-eqz v13, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    const/4 v10, 0x0

    .line 76
    goto :goto_2

    .line 77
    :cond_2
    :goto_1
    const/4 v10, 0x1

    .line 78
    :goto_2
    iget-object v11, v6, La/yyc;->d:Ljava/math/BigDecimal;

    .line 79
    .line 80
    new-instance v20, La/aw6;

    .line 81
    .line 82
    new-instance v14, La/sx6;

    .line 83
    .line 84
    sget-object v16, La/pn40;->a:La/pn40;

    .line 85
    .line 86
    iget-object v4, v6, La/yyc;->a:Ljava/math/BigDecimal;

    .line 87
    .line 88
    move-object/from16 p0, v4

    .line 89
    .line 90
    invoke-virtual {v11}, Ljava/math/BigDecimal;->doubleValue()D

    .line 91
    .line 92
    .line 93
    move-result-wide v3

    .line 94
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 95
    .line 96
    invoke-static {v3, v4, v5}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    iget-object v4, v8, La/ctf0;->b:La/lsm0;

    .line 105
    .line 106
    const/4 v5, 0x1

    .line 107
    invoke-static {v3, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v3

    .line 111
    const v5, 0x7f13023d

    .line 112
    .line 113
    .line 114
    invoke-virtual {v4, v5, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v16

    .line 118
    const/16 v18, 0x0

    .line 119
    .line 120
    const/16 v19, 0x0

    .line 121
    .line 122
    const/16 v17, 0x0

    .line 123
    .line 124
    invoke-direct/range {v14 .. v19}, La/sx6;-><init>(La/l7m0;Ljava/lang/String;ZZZ)V

    .line 125
    .line 126
    .line 127
    invoke-static {v6, v8}, La/bsr0;->X(La/yyc;La/ctf0;)La/rln0;

    .line 128
    .line 129
    .line 130
    move-result-object v18

    .line 131
    new-instance v3, La/nke;

    .line 132
    .line 133
    move-object/from16 v4, p0

    .line 134
    .line 135
    if-nez v10, :cond_3

    .line 136
    .line 137
    invoke-virtual {v4, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-lez v5, :cond_3

    .line 142
    .line 143
    const/4 v5, 0x1

    .line 144
    goto :goto_3

    .line 145
    :cond_3
    const/4 v5, 0x0

    .line 146
    :goto_3
    if-nez v10, :cond_4

    .line 147
    .line 148
    iget-object v11, v6, La/yyc;->e:Ljava/math/BigDecimal;

    .line 149
    .line 150
    invoke-virtual {v4, v11}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 151
    .line 152
    .line 153
    move-result v4

    .line 154
    if-gez v4, :cond_4

    .line 155
    .line 156
    const/4 v4, 0x1

    .line 157
    :goto_4
    const/4 v11, 0x1

    .line 158
    goto :goto_5

    .line 159
    :cond_4
    const/4 v4, 0x0

    .line 160
    goto :goto_4

    .line 161
    :goto_5
    invoke-direct {v3, v11, v11, v5, v4}, La/nke;-><init>(ZZZZ)V

    .line 162
    .line 163
    .line 164
    if-eqz v10, :cond_5

    .line 165
    .line 166
    sget-object v4, La/lx6;->c:La/lx6;

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_5
    if-nez v10, :cond_6

    .line 170
    .line 171
    invoke-static {v6}, La/bsr0;->T(La/yyc;)Z

    .line 172
    .line 173
    .line 174
    move-result v4

    .line 175
    if-nez v4, :cond_6

    .line 176
    .line 177
    sget-object v4, La/lx6;->a:La/lx6;

    .line 178
    .line 179
    goto :goto_6

    .line 180
    :cond_6
    sget-object v4, La/lx6;->b:La/lx6;

    .line 181
    .line 182
    :goto_6
    new-instance v21, La/prm;

    .line 183
    .line 184
    new-instance v5, La/jrm;

    .line 185
    .line 186
    new-instance v6, La/g8k0;

    .line 187
    .line 188
    const/4 v10, 0x6

    .line 189
    const/4 v11, 0x0

    .line 190
    invoke-direct {v6, v10, v2, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    new-instance v15, La/g8k0;

    .line 194
    .line 195
    invoke-direct {v15, v10, v2, v11}, La/g8k0;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-direct {v5, v6, v15}, La/jrm;-><init>(La/g8k0;La/g8k0;)V

    .line 199
    .line 200
    .line 201
    const/16 v28, 0x0

    .line 202
    .line 203
    const/16 v29, 0x76

    .line 204
    .line 205
    const/16 v24, 0x0

    .line 206
    .line 207
    const/16 v26, 0x0

    .line 208
    .line 209
    const/16 v27, 0x0

    .line 210
    .line 211
    move-object/from16 v25, v5

    .line 212
    .line 213
    move-object/from16 v23, v21

    .line 214
    .line 215
    invoke-direct/range {v23 .. v29}, La/prm;-><init>(FLa/lrm;La/nrm;La/a4x;ZI)V

    .line 216
    .line 217
    .line 218
    const-string v22, ""

    .line 219
    .line 220
    move-object/from16 v19, v3

    .line 221
    .line 222
    move-object/from16 v17, v14

    .line 223
    .line 224
    move-object/from16 v16, v20

    .line 225
    .line 226
    move-object/from16 v20, v4

    .line 227
    .line 228
    invoke-direct/range {v16 .. v22}, La/aw6;-><init>(La/sx6;La/rln0;La/nke;La/lx6;La/prm;Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    move-object/from16 v2, v16

    .line 232
    .line 233
    new-instance v3, La/po7;

    .line 234
    .line 235
    iget-object v4, v7, La/bx6;->a:La/a8q0;

    .line 236
    .line 237
    invoke-direct {v3, v4}, La/po7;-><init>(La/a8q0;)V

    .line 238
    .line 239
    .line 240
    move-object v6, v9

    .line 241
    iget-object v9, v12, La/hx4;->e:La/knb0;

    .line 242
    .line 243
    iget-object v10, v1, La/ox4;->b:Ljava/lang/String;

    .line 244
    .line 245
    iget-boolean v11, v1, La/ox4;->c:Z

    .line 246
    .line 247
    move-object v7, v3

    .line 248
    invoke-static/range {v6 .. v11}, La/bsr0;->j0(La/tw6;La/po7;La/ctf0;La/knb0;Ljava/lang/String;Z)La/aw6;

    .line 249
    .line 250
    .line 251
    move-result-object v3

    .line 252
    iget-object v4, v12, La/hx4;->d:La/iwo0;

    .line 253
    .line 254
    iget-object v1, v1, La/ox4;->b:Ljava/lang/String;

    .line 255
    .line 256
    invoke-static {v4, v1, v13}, La/lvm0;->p(La/iwo0;Ljava/lang/String;Z)La/gxo0;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-direct {v0, v2, v3, v1}, La/rx4;-><init>(La/aw6;La/aw6;La/gxo0;)V

    .line 261
    .line 262
    .line 263
    return-object v0

    .line 264
    :pswitch_1
    move-object/from16 v1, p1

    .line 265
    .line 266
    check-cast v1, La/y6c0;

    .line 267
    .line 268
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 269
    .line 270
    .line 271
    iget-object v2, v1, La/y6c0;->a:La/dzc0;

    .line 272
    .line 273
    iget-object v0, v0, La/ecr;->b:La/ctf0;

    .line 274
    .line 275
    iget-boolean v1, v1, La/y6c0;->b:Z

    .line 276
    .line 277
    invoke-static {v2, v0, v1}, La/kcx;->V(La/dzc0;La/ctf0;Z)La/b7c0;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    return-object v0

    .line 282
    :pswitch_2
    move-object/from16 v1, p1

    .line 283
    .line 284
    check-cast v1, La/yvj0;

    .line 285
    .line 286
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    .line 288
    .line 289
    iget-object v4, v0, La/ecr;->b:La/ctf0;

    .line 290
    .line 291
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 292
    .line 293
    .line 294
    new-instance v0, La/bwj0;

    .line 295
    .line 296
    iget-object v8, v1, La/yvj0;->a:La/pvj0;

    .line 297
    .line 298
    iget-object v2, v8, La/pvj0;->a:La/bx6;

    .line 299
    .line 300
    iget-object v3, v2, La/bx6;->b:La/tw6;

    .line 301
    .line 302
    move-object v5, v3

    .line 303
    new-instance v3, La/po7;

    .line 304
    .line 305
    iget-object v2, v2, La/bx6;->a:La/a8q0;

    .line 306
    .line 307
    invoke-direct {v3, v2}, La/po7;-><init>(La/a8q0;)V

    .line 308
    .line 309
    .line 310
    move-object v2, v5

    .line 311
    iget-object v5, v8, La/pvj0;->b:La/knb0;

    .line 312
    .line 313
    iget-object v6, v1, La/yvj0;->b:Ljava/lang/String;

    .line 314
    .line 315
    iget-boolean v7, v1, La/yvj0;->c:Z

    .line 316
    .line 317
    invoke-static/range {v2 .. v7}, La/bsr0;->j0(La/tw6;La/po7;La/ctf0;La/knb0;Ljava/lang/String;Z)La/aw6;

    .line 318
    .line 319
    .line 320
    move-result-object v2

    .line 321
    iget-object v3, v8, La/pvj0;->c:La/iwo0;

    .line 322
    .line 323
    iget-object v5, v1, La/yvj0;->b:Ljava/lang/String;

    .line 324
    .line 325
    iget-boolean v1, v1, La/yvj0;->c:Z

    .line 326
    .line 327
    invoke-static {v3, v5, v1}, La/lvm0;->p(La/iwo0;Ljava/lang/String;Z)La/gxo0;

    .line 328
    .line 329
    .line 330
    move-result-object v3

    .line 331
    iget-object v6, v8, La/pvj0;->d:La/nnd0;

    .line 332
    .line 333
    invoke-static {v6, v5, v4, v1}, La/w9x;->R(La/nnd0;Ljava/lang/String;La/ctf0;Z)La/epd0;

    .line 334
    .line 335
    .line 336
    move-result-object v1

    .line 337
    invoke-direct {v0, v2, v3, v1}, La/bwj0;-><init>(La/aw6;La/gxo0;La/epd0;)V

    .line 338
    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_3
    const/4 v11, 0x0

    .line 342
    move-object/from16 v1, p1

    .line 343
    .line 344
    check-cast v1, La/df6;

    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 347
    .line 348
    .line 349
    iget-object v2, v1, La/df6;->a:La/xm5;

    .line 350
    .line 351
    iget-object v0, v0, La/ecr;->b:La/ctf0;

    .line 352
    .line 353
    iget-boolean v3, v1, La/df6;->c:Z

    .line 354
    .line 355
    iget-object v4, v1, La/df6;->b:La/ko7;

    .line 356
    .line 357
    iget-boolean v10, v1, La/df6;->d:Z

    .line 358
    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    iget-object v1, v2, La/xm5;->c:La/ql5;

    .line 363
    .line 364
    iget-object v7, v1, La/ql5;->f:Ljava/lang/String;

    .line 365
    .line 366
    iget-wide v5, v1, La/ql5;->b:D

    .line 367
    .line 368
    const-wide/16 v8, 0x0

    .line 369
    .line 370
    cmpg-double v8, v5, v8

    .line 371
    .line 372
    if-nez v8, :cond_7

    .line 373
    .line 374
    const/4 v9, 0x1

    .line 375
    goto :goto_7

    .line 376
    :cond_7
    const/4 v9, 0x0

    .line 377
    :goto_7
    new-instance v12, La/gf6;

    .line 378
    .line 379
    if-eqz v9, :cond_8

    .line 380
    .line 381
    new-instance v9, La/vtn;

    .line 382
    .line 383
    const/4 v11, 0x0

    .line 384
    new-array v13, v11, [Ljava/lang/Object;

    .line 385
    .line 386
    iget-object v14, v0, La/ctf0;->b:La/lsm0;

    .line 387
    .line 388
    invoke-static {v13, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v13

    .line 392
    const v15, 0x7f1317d9

    .line 393
    .line 394
    .line 395
    invoke-virtual {v14, v15, v13}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 396
    .line 397
    .line 398
    move-result-object v13

    .line 399
    new-array v15, v11, [Ljava/lang/Object;

    .line 400
    .line 401
    invoke-static {v15, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v15

    .line 405
    move/from16 v16, v3

    .line 406
    .line 407
    const v3, 0x7f131784

    .line 408
    .line 409
    .line 410
    invoke-virtual {v14, v3, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    new-array v15, v11, [Ljava/lang/Object;

    .line 415
    .line 416
    invoke-static {v15, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    move-result-object v15

    .line 420
    const v11, 0x7f1315e0

    .line 421
    .line 422
    .line 423
    invoke-virtual {v14, v11, v15}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v11

    .line 427
    invoke-direct {v9, v13, v3, v11}, La/vtn;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 428
    .line 429
    .line 430
    move-object v3, v9

    .line 431
    goto :goto_8

    .line 432
    :cond_8
    move/from16 v16, v3

    .line 433
    .line 434
    move-object v3, v11

    .line 435
    :goto_8
    invoke-static {v2, v4, v10}, La/o2e;->f0(La/xm5;La/ko7;Z)La/x30;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    new-instance v4, La/tw7;

    .line 440
    .line 441
    sget-object v9, La/pn40;->a:La/pn40;

    .line 442
    .line 443
    sget-object v9, La/p3u0;->c:La/p3u0;

    .line 444
    .line 445
    invoke-static {v5, v6, v9}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 446
    .line 447
    .line 448
    move-result-object v6

    .line 449
    if-nez v8, :cond_9

    .line 450
    .line 451
    goto :goto_9

    .line 452
    :cond_9
    if-eqz v16, :cond_a

    .line 453
    .line 454
    :goto_9
    iget-wide v8, v1, La/ql5;->a:J

    .line 455
    .line 456
    const-wide/16 v13, 0x0

    .line 457
    .line 458
    cmp-long v1, v8, v13

    .line 459
    .line 460
    if-eqz v1, :cond_a

    .line 461
    .line 462
    invoke-virtual {v0}, La/ctf0;->i()Z

    .line 463
    .line 464
    .line 465
    move-result v1

    .line 466
    if-eqz v1, :cond_a

    .line 467
    .line 468
    const/4 v9, 0x1

    .line 469
    :goto_a
    const/4 v11, 0x0

    .line 470
    goto :goto_b

    .line 471
    :cond_a
    const/4 v9, 0x0

    .line 472
    goto :goto_a

    .line 473
    :goto_b
    new-array v1, v11, [Ljava/lang/Object;

    .line 474
    .line 475
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 476
    .line 477
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    const v5, 0x7f130200

    .line 482
    .line 483
    .line 484
    invoke-virtual {v0, v5, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 485
    .line 486
    .line 487
    move-result-object v8

    .line 488
    move-object v5, v4

    .line 489
    invoke-direct/range {v5 .. v10}, La/tw7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 490
    .line 491
    .line 492
    invoke-direct {v12, v3, v2, v5}, La/gf6;-><init>(La/vtn;La/x30;La/tw7;)V

    .line 493
    .line 494
    .line 495
    return-object v12

    .line 496
    :pswitch_4
    move-object/from16 v1, p1

    .line 497
    .line 498
    check-cast v1, La/ohp;

    .line 499
    .line 500
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 501
    .line 502
    .line 503
    iget-object v0, v0, La/ecr;->b:La/ctf0;

    .line 504
    .line 505
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 506
    .line 507
    .line 508
    new-instance v2, La/o820;

    .line 509
    .line 510
    iget-object v3, v1, La/ohp;->a:La/txe;

    .line 511
    .line 512
    iget-boolean v1, v1, La/ohp;->b:Z

    .line 513
    .line 514
    invoke-static {v3, v0, v1}, La/h8x;->R(La/txe;La/ctf0;Z)La/eye;

    .line 515
    .line 516
    .line 517
    move-result-object v0

    .line 518
    invoke-direct {v2, v0}, La/o820;-><init>(La/eye;)V

    .line 519
    .line 520
    .line 521
    return-object v2

    .line 522
    :pswitch_5
    move-object/from16 v1, p1

    .line 523
    .line 524
    check-cast v1, La/k00;

    .line 525
    .line 526
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 527
    .line 528
    .line 529
    iget-object v0, v0, La/ecr;->b:La/ctf0;

    .line 530
    .line 531
    sget-object v3, La/fcr;->a:Ljava/util/Set;

    .line 532
    .line 533
    new-instance v3, La/y00;

    .line 534
    .line 535
    new-instance v4, La/u00;

    .line 536
    .line 537
    iget-object v5, v1, La/k00;->b:La/q4f;

    .line 538
    .line 539
    invoke-static {v5}, La/lgb;->V(La/q4f;)I

    .line 540
    .line 541
    .line 542
    move-result v6

    .line 543
    const/4 v11, 0x0

    .line 544
    new-array v7, v11, [Ljava/lang/Object;

    .line 545
    .line 546
    iget-object v8, v0, La/ctf0;->b:La/lsm0;

    .line 547
    .line 548
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 549
    .line 550
    invoke-static {v7, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 551
    .line 552
    .line 553
    move-result-object v7

    .line 554
    invoke-virtual {v8, v6, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v6

    .line 558
    sget-object v7, La/fcr;->a:Ljava/util/Set;

    .line 559
    .line 560
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 561
    .line 562
    .line 563
    move-result v5

    .line 564
    iget-wide v7, v1, La/k00;->c:J

    .line 565
    .line 566
    if-eqz v5, :cond_b

    .line 567
    .line 568
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 569
    .line 570
    .line 571
    move-result-object v5

    .line 572
    iget v7, v1, La/k00;->d:I

    .line 573
    .line 574
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 575
    .line 576
    .line 577
    move-result-object v7

    .line 578
    filled-new-array {v5, v7}, [Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v5

    .line 582
    const/4 v7, 0x2

    .line 583
    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v5

    .line 587
    const v7, 0x7f130527

    .line 588
    .line 589
    .line 590
    invoke-virtual {v0, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 591
    .line 592
    .line 593
    move-result-object v0

    .line 594
    const/4 v11, 0x1

    .line 595
    goto :goto_c

    .line 596
    :cond_b
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 597
    .line 598
    .line 599
    move-result-object v5

    .line 600
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 601
    .line 602
    .line 603
    move-result-object v5

    .line 604
    const/4 v11, 0x1

    .line 605
    invoke-static {v5, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v5

    .line 609
    const v7, 0x7f130881

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v7, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 613
    .line 614
    .line 615
    move-result-object v0

    .line 616
    :goto_c
    invoke-direct {v4, v6, v11, v0}, La/u00;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    .line 617
    .line 618
    .line 619
    iget-object v0, v1, La/k00;->a:La/jd5;

    .line 620
    .line 621
    iget v0, v0, La/jd5;->a:I

    .line 622
    .line 623
    invoke-direct {v3, v4, v2, v0}, La/y00;-><init>(La/w00;Ljava/lang/String;I)V

    .line 624
    .line 625
    .line 626
    return-object v3

    .line 627
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
