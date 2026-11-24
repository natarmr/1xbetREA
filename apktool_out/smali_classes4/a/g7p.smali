.class public final synthetic La/g7p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/l0s;La/nia;)V
    .locals 0

    .line 1
    const/16 p1, 0x14

    iput-byte p1, p0, La/g7p;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/g7p;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/g7p;->a:B

    iput-object p1, p0, La/g7p;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g7p;->a:B

    .line 4
    .line 5
    const/16 v2, 0x16

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x8

    .line 10
    .line 11
    const v5, 0x2fd4df92

    .line 12
    .line 13
    .line 14
    const/4 v6, 0x5

    .line 15
    const/4 v7, 0x0

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    iget-object v0, v0, La/g7p;->b:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;

    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Landroid/view/View;

    .line 28
    .line 29
    sget v2, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;->g:I

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-boolean v1, v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;->f:Z

    .line 35
    .line 36
    xor-int/2addr v1, v9

    .line 37
    iput-boolean v1, v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;->f:Z

    .line 38
    .line 39
    iget-object v2, v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;->e:La/t4s;

    .line 40
    .line 41
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    iget-object v0, v0, Lorg/xplatform/core/presentation/bonuses/views/GamesBonusButtonView1;->d:La/csr;

    .line 46
    .line 47
    invoke-virtual {v2, v1, v0}, La/t4s;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_0
    move-object v1, v0

    .line 54
    check-cast v1, La/c0t;

    .line 55
    .line 56
    move-object/from16 v7, p1

    .line 57
    .line 58
    check-cast v7, La/xus;

    .line 59
    .line 60
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 64
    .line 65
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 75
    .line 76
    move-object v4, v2

    .line 77
    move-object v2, v4

    .line 78
    check-cast v2, La/wrs;

    .line 79
    .line 80
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    const-wide/16 v21, 0x0

    .line 84
    .line 85
    const v23, 0x3ffffdf

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    move-object v5, v4

    .line 90
    const/4 v4, 0x0

    .line 91
    move-object v6, v5

    .line 92
    const/4 v5, 0x0

    .line 93
    move-object v8, v6

    .line 94
    const/4 v6, 0x0

    .line 95
    move-object v9, v8

    .line 96
    const/4 v8, 0x0

    .line 97
    move-object v10, v9

    .line 98
    const/4 v9, 0x0

    .line 99
    move-object v11, v10

    .line 100
    const/4 v10, 0x0

    .line 101
    move-object v12, v11

    .line 102
    const/4 v11, 0x0

    .line 103
    move-object v13, v12

    .line 104
    const/4 v12, 0x0

    .line 105
    move-object v14, v13

    .line 106
    const/4 v13, 0x0

    .line 107
    move-object v15, v14

    .line 108
    const/4 v14, 0x0

    .line 109
    move-object/from16 v16, v15

    .line 110
    .line 111
    const/4 v15, 0x0

    .line 112
    move-object/from16 v17, v16

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    move-object/from16 v18, v17

    .line 117
    .line 118
    const/16 v17, 0x0

    .line 119
    .line 120
    move-object/from16 v19, v18

    .line 121
    .line 122
    const/16 v18, 0x0

    .line 123
    .line 124
    move-object/from16 v24, v19

    .line 125
    .line 126
    const-wide/16 v19, 0x0

    .line 127
    .line 128
    move-object/from16 p0, v1

    .line 129
    .line 130
    move-object/from16 v1, v24

    .line 131
    .line 132
    invoke-static/range {v2 .. v23}, La/wrs;->a(La/wrs;La/gps;La/jlr;La/ypl0;La/bqr;La/xus;Ljava/lang/String;Ljava/util/List;La/rsp;La/lov;Ljava/util/List;La/yws;ZZZLjava/util/ArrayList;ZJJI)La/wrs;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v1

    .line 140
    if-eqz v1, :cond_0

    .line 141
    .line 142
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 143
    .line 144
    return-object v0

    .line 145
    :cond_0
    move-object/from16 v1, p0

    .line 146
    .line 147
    goto :goto_0

    .line 148
    :pswitch_1
    check-cast v0, La/yys;

    .line 149
    .line 150
    move-object/from16 v12, p1

    .line 151
    .line 152
    check-cast v12, Ljava/lang/Throwable;

    .line 153
    .line 154
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    iget-object v0, v0, La/yys;->B:La/p7m0;

    .line 158
    .line 159
    :cond_1
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    move-object v2, v1

    .line 164
    move-object v1, v2

    .line 165
    check-cast v1, La/ixs;

    .line 166
    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const v17, 0x7e7ff

    .line 170
    .line 171
    .line 172
    move-object v4, v2

    .line 173
    const-wide/16 v2, 0x0

    .line 174
    .line 175
    move-object v5, v4

    .line 176
    const/4 v4, 0x0

    .line 177
    move-object v6, v5

    .line 178
    const/4 v5, 0x0

    .line 179
    move-object v7, v6

    .line 180
    const/4 v6, 0x0

    .line 181
    move-object v8, v7

    .line 182
    const/4 v7, 0x0

    .line 183
    move-object v9, v8

    .line 184
    const/4 v8, 0x0

    .line 185
    move-object v10, v9

    .line 186
    const/4 v9, 0x0

    .line 187
    move-object v11, v10

    .line 188
    const/4 v10, 0x0

    .line 189
    move-object v13, v11

    .line 190
    const/4 v11, 0x0

    .line 191
    move-object v14, v13

    .line 192
    const/4 v13, 0x0

    .line 193
    move-object v15, v14

    .line 194
    const/4 v14, 0x0

    .line 195
    move-object/from16 v18, v15

    .line 196
    .line 197
    const/4 v15, 0x0

    .line 198
    move-object/from16 v25, v18

    .line 199
    .line 200
    invoke-static/range {v1 .. v17}, La/ixs;->a(La/ixs;JLjava/lang/String;ZZZZLa/hl90;ZZLjava/lang/Throwable;ZLjava/lang/String;ZZI)La/ixs;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    move-object/from16 v2, v25

    .line 205
    .line 206
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    move-result v1

    .line 210
    if-eqz v1, :cond_1

    .line 211
    .line 212
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 213
    .line 214
    return-object v0

    .line 215
    :pswitch_2
    check-cast v0, La/f3j;

    .line 216
    .line 217
    move-object/from16 v1, p1

    .line 218
    .line 219
    check-cast v1, La/k0w0;

    .line 220
    .line 221
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    .line 223
    .line 224
    new-instance v2, La/jcs;

    .line 225
    .line 226
    const/4 v3, 0x6

    .line 227
    invoke-direct {v2, v0, v3}, La/jcs;-><init>(Ljava/lang/Object;B)V

    .line 228
    .line 229
    .line 230
    new-instance v0, La/a1w0;

    .line 231
    .line 232
    invoke-direct {v0, v2}, La/a1w0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 240
    .line 241
    check-cast v0, La/c8d;

    .line 242
    .line 243
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 244
    .line 245
    new-instance v2, La/v7d;

    .line 246
    .line 247
    invoke-direct {v2, v9, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 248
    .line 249
    .line 250
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 251
    .line 252
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_3
    check-cast v0, La/ui9;

    .line 256
    .line 257
    move-object/from16 v1, p1

    .line 258
    .line 259
    check-cast v1, La/bnk0;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    iget v2, v0, La/ui9;->c:I

    .line 265
    .line 266
    iget v9, v0, La/ui9;->d:I

    .line 267
    .line 268
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v2

    .line 272
    iget v3, v0, La/ui9;->c:I

    .line 273
    .line 274
    iget-object v4, v0, La/ui9;->e:Ljava/lang/Integer;

    .line 275
    .line 276
    if-eqz v4, :cond_2

    .line 277
    .line 278
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 279
    .line 280
    .line 281
    move-result v5

    .line 282
    goto :goto_1

    .line 283
    :cond_2
    move v5, v8

    .line 284
    :goto_1
    const v10, 0x7f0606da

    .line 285
    .line 286
    .line 287
    const v11, 0x7f0606c1

    .line 288
    .line 289
    .line 290
    if-le v3, v5, :cond_3

    .line 291
    .line 292
    if-eqz v4, :cond_3

    .line 293
    .line 294
    move v4, v11

    .line 295
    goto :goto_2

    .line 296
    :cond_3
    move v4, v10

    .line 297
    :goto_2
    const/4 v6, 0x0

    .line 298
    const/16 v7, 0x36

    .line 299
    .line 300
    const/4 v3, 0x0

    .line 301
    const/4 v5, 0x0

    .line 302
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 303
    .line 304
    .line 305
    const-string v2, " : "

    .line 306
    .line 307
    const v4, 0x7f0606da

    .line 308
    .line 309
    .line 310
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 311
    .line 312
    .line 313
    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    iget-object v0, v0, La/ui9;->f:Ljava/lang/Integer;

    .line 318
    .line 319
    if-eqz v0, :cond_4

    .line 320
    .line 321
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v8

    .line 325
    :cond_4
    if-le v9, v8, :cond_5

    .line 326
    .line 327
    if-eqz v0, :cond_5

    .line 328
    .line 329
    move v4, v11

    .line 330
    goto :goto_3

    .line 331
    :cond_5
    move v4, v10

    .line 332
    :goto_3
    const/4 v6, 0x0

    .line 333
    const/16 v7, 0x36

    .line 334
    .line 335
    const/4 v3, 0x0

    .line 336
    const/4 v5, 0x0

    .line 337
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 338
    .line 339
    .line 340
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 341
    .line 342
    return-object v0

    .line 343
    :pswitch_4
    check-cast v0, La/g3j;

    .line 344
    .line 345
    move-object/from16 v1, p1

    .line 346
    .line 347
    check-cast v1, Ljava/lang/Integer;

    .line 348
    .line 349
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    new-instance v2, La/wa30;

    .line 354
    .line 355
    invoke-direct {v2, v1}, La/wa30;-><init>(I)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v0, v2}, La/x2t0;->g(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    return-object v0

    .line 364
    :pswitch_5
    check-cast v0, La/pls;

    .line 365
    .line 366
    move-object/from16 v1, p1

    .line 367
    .line 368
    check-cast v1, La/hcz;

    .line 369
    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v0, v0, La/pls;->c:La/i4;

    .line 374
    .line 375
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 376
    .line 377
    .line 378
    move-result v2

    .line 379
    new-instance v3, La/far;

    .line 380
    .line 381
    invoke-direct {v3, v0, v6}, La/far;-><init>(Ljava/util/List;B)V

    .line 382
    .line 383
    .line 384
    new-instance v4, La/xy1;

    .line 385
    .line 386
    const/16 v6, 0x11

    .line 387
    .line 388
    invoke-direct {v4, v0, v6}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 389
    .line 390
    .line 391
    new-instance v0, La/ugd;

    .line 392
    .line 393
    invoke-direct {v0, v5, v9, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v1, v2, v7, v3, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 397
    .line 398
    .line 399
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_6
    check-cast v0, La/uhs;

    .line 403
    .line 404
    move-object/from16 v1, p1

    .line 405
    .line 406
    check-cast v1, Ljava/lang/Throwable;

    .line 407
    .line 408
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    .line 410
    .line 411
    iget-object v2, v0, La/uhs;->x:La/duj;

    .line 412
    .line 413
    new-instance v3, La/jar;

    .line 414
    .line 415
    const/16 v4, 0xf

    .line 416
    .line 417
    invoke-direct {v3, v0, v4}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_7
    check-cast v0, La/i7s;

    .line 427
    .line 428
    move-object/from16 v1, p1

    .line 429
    .line 430
    check-cast v1, La/py20;

    .line 431
    .line 432
    sget-object v2, La/i7s;->a2:La/nek;

    .line 433
    .line 434
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual {v0}, La/i7s;->I0()La/k3t0;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    new-instance v2, La/o6s;

    .line 442
    .line 443
    invoke-direct {v2, v1}, La/o6s;-><init>(La/py20;)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 447
    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    return-object v0

    .line 452
    :pswitch_8
    check-cast v0, La/nia;

    .line 453
    .line 454
    move-object/from16 v1, p1

    .line 455
    .line 456
    check-cast v1, La/k0w0;

    .line 457
    .line 458
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    iget-wide v11, v0, La/nia;->a:J

    .line 462
    .line 463
    iget-wide v2, v0, La/nia;->d:J

    .line 464
    .line 465
    iget-wide v4, v0, La/nia;->e:J

    .line 466
    .line 467
    iget-wide v13, v0, La/nia;->c:J

    .line 468
    .line 469
    iget-object v6, v0, La/nia;->f:Ljava/lang/String;

    .line 470
    .line 471
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 472
    .line 473
    .line 474
    move-result-object v19

    .line 475
    iget-boolean v0, v0, La/nia;->g:Z

    .line 476
    .line 477
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    new-instance v10, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;

    .line 481
    .line 482
    move/from16 v20, v0

    .line 483
    .line 484
    move-wide v15, v2

    .line 485
    move-wide/from16 v17, v4

    .line 486
    .line 487
    invoke-direct/range {v10 .. v20}, Lorg/xplatform/feed/navigation/OldGameNotificationScreenFactoryImpl$getGameNotificationScreen$1;-><init>(JJJJLjava/lang/String;Z)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v1, v10}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 495
    .line 496
    check-cast v0, La/c8d;

    .line 497
    .line 498
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 499
    .line 500
    new-instance v2, La/v7d;

    .line 501
    .line 502
    invoke-direct {v2, v9, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 503
    .line 504
    .line 505
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 506
    .line 507
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    return-object v0

    .line 510
    :pswitch_9
    check-cast v0, La/wbs0;

    .line 511
    .line 512
    move-object/from16 v1, p1

    .line 513
    .line 514
    check-cast v1, La/abi0;

    .line 515
    .line 516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    sget-object v2, La/fur;->a:La/zai0;

    .line 523
    .line 524
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 525
    .line 526
    .line 527
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object v0

    .line 530
    :pswitch_a
    check-cast v0, La/ali;

    .line 531
    .line 532
    move-object/from16 v1, p1

    .line 533
    .line 534
    check-cast v1, La/k0w0;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    iget-object v0, v0, La/ali;->c:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, La/mi70;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    new-instance v0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 547
    .line 548
    sget-object v2, La/k38;->a:La/k38;

    .line 549
    .line 550
    invoke-direct {v0, v2}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 551
    .line 552
    .line 553
    invoke-virtual {v1, v0}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 554
    .line 555
    .line 556
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    return-object v0

    .line 559
    :pswitch_b
    check-cast v0, La/ypr;

    .line 560
    .line 561
    move-object/from16 v1, p1

    .line 562
    .line 563
    check-cast v1, La/n1g;

    .line 564
    .line 565
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 566
    .line 567
    .line 568
    iget-wide v2, v0, La/ypr;->a:J

    .line 569
    .line 570
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 571
    .line 572
    .line 573
    move-result-object v2

    .line 574
    invoke-virtual {v1, v2}, La/n1g;->b(Ljava/lang/String;)V

    .line 575
    .line 576
    .line 577
    iget-wide v2, v0, La/ypr;->b:J

    .line 578
    .line 579
    const-wide/16 v4, 0x28

    .line 580
    .line 581
    cmp-long v4, v2, v4

    .line 582
    .line 583
    if-nez v4, :cond_6

    .line 584
    .line 585
    iget-wide v2, v0, La/ypr;->c:J

    .line 586
    .line 587
    :cond_6
    iput-wide v2, v1, La/n1g;->c:J

    .line 588
    .line 589
    iget-wide v2, v0, La/ypr;->d:J

    .line 590
    .line 591
    iput-wide v2, v1, La/n1g;->b:J

    .line 592
    .line 593
    new-instance v2, La/lq2;

    .line 594
    .line 595
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 596
    .line 597
    .line 598
    iput-object v2, v1, La/n1g;->e:La/ms2;

    .line 599
    .line 600
    if-nez v4, :cond_7

    .line 601
    .line 602
    sget-object v2, La/j1g;->c:La/j1g;

    .line 603
    .line 604
    goto :goto_4

    .line 605
    :cond_7
    sget-object v2, La/j1g;->d:La/j1g;

    .line 606
    .line 607
    :goto_4
    iput-object v2, v1, La/n1g;->d:La/j1g;

    .line 608
    .line 609
    sget-object v2, La/l1g;->b:La/l1g;

    .line 610
    .line 611
    iput-object v2, v1, La/n1g;->f:La/l1g;

    .line 612
    .line 613
    iget-object v0, v0, La/ypr;->e:La/k1g;

    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    iput-object v0, v1, La/n1g;->g:La/k1g;

    .line 619
    .line 620
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 621
    .line 622
    return-object v0

    .line 623
    :pswitch_c
    check-cast v0, La/vkr;

    .line 624
    .line 625
    move-object/from16 v1, p1

    .line 626
    .line 627
    check-cast v1, Ljava/lang/Throwable;

    .line 628
    .line 629
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    iget-object v2, v0, La/vkr;->f:La/duj;

    .line 633
    .line 634
    new-instance v3, La/jar;

    .line 635
    .line 636
    invoke-direct {v3, v0, v6}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 637
    .line 638
    .line 639
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 640
    .line 641
    .line 642
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 643
    .line 644
    return-object v0

    .line 645
    :pswitch_d
    check-cast v0, La/brk;

    .line 646
    .line 647
    move-object/from16 v1, p1

    .line 648
    .line 649
    check-cast v1, La/cp;

    .line 650
    .line 651
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 652
    .line 653
    .line 654
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 655
    .line 656
    check-cast v2, La/qux;

    .line 657
    .line 658
    iget-object v3, v2, La/qux;->c:Lcom/google/android/material/button/MaterialButton;

    .line 659
    .line 660
    new-instance v5, La/qkr;

    .line 661
    .line 662
    invoke-direct {v5, v0, v1, v8}, La/qkr;-><init>(La/brk;La/cp;B)V

    .line 663
    .line 664
    .line 665
    invoke-static {v3, v5}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 666
    .line 667
    .line 668
    iget-object v2, v2, La/qux;->b:Lcom/google/android/material/button/MaterialButton;

    .line 669
    .line 670
    new-instance v3, La/qkr;

    .line 671
    .line 672
    invoke-direct {v3, v0, v1, v9}, La/qkr;-><init>(La/brk;La/cp;B)V

    .line 673
    .line 674
    .line 675
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 676
    .line 677
    .line 678
    new-instance v0, La/k2l;

    .line 679
    .line 680
    invoke-direct {v0, v1, v1, v4}, La/k2l;-><init>(La/cp;La/cp;B)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 684
    .line 685
    .line 686
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 687
    .line 688
    return-object v0

    .line 689
    :pswitch_e
    check-cast v0, La/hkr;

    .line 690
    .line 691
    move-object/from16 v1, p1

    .line 692
    .line 693
    check-cast v1, Ljava/lang/Throwable;

    .line 694
    .line 695
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    iget-object v2, v0, La/hkr;->t:La/duj;

    .line 699
    .line 700
    invoke-virtual {v1}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 701
    .line 702
    .line 703
    move-result-object v3

    .line 704
    if-nez v3, :cond_8

    .line 705
    .line 706
    goto :goto_5

    .line 707
    :cond_8
    move-object v1, v3

    .line 708
    :goto_5
    new-instance v3, La/jar;

    .line 709
    .line 710
    const/4 v4, 0x4

    .line 711
    invoke-direct {v3, v0, v4}, La/jar;-><init>(Ljava/lang/Object;B)V

    .line 712
    .line 713
    .line 714
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 715
    .line 716
    .line 717
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 718
    .line 719
    return-object v0

    .line 720
    :pswitch_f
    check-cast v0, La/ljr;

    .line 721
    .line 722
    move-object/from16 v1, p1

    .line 723
    .line 724
    check-cast v1, Landroid/view/View;

    .line 725
    .line 726
    sget-object v5, La/ljr;->Q1:[La/iiy;

    .line 727
    .line 728
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 729
    .line 730
    .line 731
    invoke-virtual {v0}, La/ljr;->H0()La/vkr;

    .line 732
    .line 733
    .line 734
    move-result-object v1

    .line 735
    iget-object v6, v1, La/vkr;->g:La/p7m0;

    .line 736
    .line 737
    :cond_9
    invoke-virtual {v6}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v0

    .line 741
    move-object v5, v0

    .line 742
    check-cast v5, Ljava/lang/Boolean;

    .line 743
    .line 744
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 748
    .line 749
    invoke-virtual {v6, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 750
    .line 751
    .line 752
    move-result v0

    .line 753
    if-eqz v0, :cond_9

    .line 754
    .line 755
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 756
    .line 757
    .line 758
    move-result-object v8

    .line 759
    new-instance v9, La/g7p;

    .line 760
    .line 761
    invoke-direct {v9, v1, v3}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 762
    .line 763
    .line 764
    new-instance v10, La/yip;

    .line 765
    .line 766
    invoke-direct {v10, v1, v2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 767
    .line 768
    .line 769
    new-instance v12, La/cbq;

    .line 770
    .line 771
    invoke-direct {v12, v1, v7, v4}, La/cbq;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 772
    .line 773
    .line 774
    const/16 v13, 0xc

    .line 775
    .line 776
    const/4 v11, 0x0

    .line 777
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 778
    .line 779
    .line 780
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 781
    .line 782
    return-object v0

    .line 783
    :pswitch_10
    check-cast v0, La/tar;

    .line 784
    .line 785
    move-object/from16 v1, p1

    .line 786
    .line 787
    check-cast v1, La/hcz;

    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    iget-object v0, v0, La/tar;->a:La/sar;

    .line 793
    .line 794
    iget-object v0, v0, La/sar;->a:Ljava/util/List;

    .line 795
    .line 796
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 797
    .line 798
    .line 799
    move-result v2

    .line 800
    new-instance v4, La/far;

    .line 801
    .line 802
    invoke-direct {v4, v0, v8}, La/far;-><init>(Ljava/util/List;B)V

    .line 803
    .line 804
    .line 805
    new-instance v6, La/xy1;

    .line 806
    .line 807
    invoke-direct {v6, v0, v3}, La/xy1;-><init>(Ljava/util/List;B)V

    .line 808
    .line 809
    .line 810
    new-instance v0, La/ugd;

    .line 811
    .line 812
    invoke-direct {v0, v5, v9, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 813
    .line 814
    .line 815
    invoke-virtual {v1, v2, v7, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 816
    .line 817
    .line 818
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_11
    check-cast v0, La/ivq;

    .line 822
    .line 823
    move-object/from16 v1, p1

    .line 824
    .line 825
    check-cast v1, Ljava/lang/Throwable;

    .line 826
    .line 827
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 828
    .line 829
    .line 830
    iget-object v2, v0, La/ivq;->r:La/duj;

    .line 831
    .line 832
    new-instance v3, La/f5o;

    .line 833
    .line 834
    const/16 v4, 0x1b

    .line 835
    .line 836
    invoke-direct {v3, v0, v4}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 840
    .line 841
    .line 842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 843
    .line 844
    return-object v0

    .line 845
    :pswitch_12
    check-cast v0, La/orq;

    .line 846
    .line 847
    move-object/from16 v1, p1

    .line 848
    .line 849
    check-cast v1, La/y0t0;

    .line 850
    .line 851
    iget-object v4, v1, La/y0t0;->b:La/psq;

    .line 852
    .line 853
    iget v5, v1, La/y0t0;->c:I

    .line 854
    .line 855
    iget v6, v1, La/y0t0;->d:I

    .line 856
    .line 857
    iget-object v7, v1, La/y0t0;->e:Ljava/lang/Object;

    .line 858
    .line 859
    new-instance v2, La/y0t0;

    .line 860
    .line 861
    const/4 v3, 0x0

    .line 862
    invoke-direct/range {v2 .. v7}, La/y0t0;-><init>(La/nrq;La/psq;IILjava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v0, v2}, La/orq;->a(La/y0t0;)La/b1t0;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    return-object v0

    .line 874
    :pswitch_13
    check-cast v0, La/xz40;

    .line 875
    .line 876
    move-object/from16 v1, p1

    .line 877
    .line 878
    check-cast v1, La/ou90;

    .line 879
    .line 880
    iget-object v1, v0, La/xz40;->a:[Ljava/lang/Object;

    .line 881
    .line 882
    iget v0, v0, La/xz40;->c:I

    .line 883
    .line 884
    :goto_6
    if-ge v8, v0, :cond_a

    .line 885
    .line 886
    aget-object v2, v1, v8

    .line 887
    .line 888
    check-cast v2, La/uj30;

    .line 889
    .line 890
    invoke-interface {v2}, La/uj30;->b()V

    .line 891
    .line 892
    .line 893
    add-int/lit8 v8, v8, 0x1

    .line 894
    .line 895
    goto :goto_6

    .line 896
    :cond_a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
    :pswitch_14
    check-cast v0, La/kji0;

    .line 900
    .line 901
    move-object/from16 v1, p1

    .line 902
    .line 903
    check-cast v1, La/soe;

    .line 904
    .line 905
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 906
    .line 907
    .line 908
    const-string v2, "FirebaseSessions"

    .line 909
    .line 910
    const-string v3, "CorruptionException in session data DataStore"

    .line 911
    .line 912
    invoke-static {v2, v3, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 913
    .line 914
    .line 915
    new-instance v1, La/gji0;

    .line 916
    .line 917
    iget-object v0, v0, La/kji0;->a:La/vji0;

    .line 918
    .line 919
    invoke-virtual {v0, v7}, La/vji0;->a(La/pji0;)La/pji0;

    .line 920
    .line 921
    .line 922
    move-result-object v0

    .line 923
    invoke-direct {v1, v0, v7, v7}, La/gji0;-><init>(La/pji0;La/pgq0;Ljava/util/Map;)V

    .line 924
    .line 925
    .line 926
    return-object v1

    .line 927
    :pswitch_15
    check-cast v0, La/hgq;

    .line 928
    .line 929
    move-object/from16 v1, p1

    .line 930
    .line 931
    check-cast v1, Lcom/google/firebase/auth/AuthResult;

    .line 932
    .line 933
    sget-object v3, La/hgq;->g2:La/nek;

    .line 934
    .line 935
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 936
    .line 937
    .line 938
    move-object v3, v1

    .line 939
    check-cast v3, Lcom/google/firebase/auth/internal/zzx;

    .line 940
    .line 941
    iget-object v3, v3, Lcom/google/firebase/auth/internal/zzx;->a:Lcom/google/firebase/auth/internal/zzad;

    .line 942
    .line 943
    if-eqz v3, :cond_b

    .line 944
    .line 945
    iget-object v4, v3, Lcom/google/firebase/auth/internal/zzad;->c:Ljava/lang/String;

    .line 946
    .line 947
    invoke-static {v4}, La/nfq;->e(Ljava/lang/String;)La/nfq;

    .line 948
    .line 949
    .line 950
    move-result-object v4

    .line 951
    invoke-static {v4}, Lcom/google/firebase/auth/FirebaseAuth;->getInstance(La/nfq;)Lcom/google/firebase/auth/FirebaseAuth;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    invoke-virtual {v4, v3, v8}, Lcom/google/firebase/auth/FirebaseAuth;->d(Lcom/google/firebase/auth/FirebaseUser;Z)Lcom/google/android/gms/tasks/Task;

    .line 956
    .line 957
    .line 958
    move-result-object v4

    .line 959
    new-instance v5, La/f8m;

    .line 960
    .line 961
    invoke-direct {v5, v0, v1, v3, v2}, La/f8m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 962
    .line 963
    .line 964
    new-instance v0, La/z9f;

    .line 965
    .line 966
    const/16 v1, 0x1d

    .line 967
    .line 968
    invoke-direct {v0, v5, v1}, La/z9f;-><init>(Ljava/lang/Object;B)V

    .line 969
    .line 970
    .line 971
    invoke-virtual {v4, v0}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    .line 972
    .line 973
    .line 974
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 975
    .line 976
    return-object v0

    .line 977
    :pswitch_16
    move-object v3, v0

    .line 978
    check-cast v3, La/n9q;

    .line 979
    .line 980
    move-object/from16 v0, p1

    .line 981
    .line 982
    check-cast v0, La/naq;

    .line 983
    .line 984
    sget-object v1, La/n9q;->S1:[La/iiy;

    .line 985
    .line 986
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    instance-of v1, v0, La/daq;

    .line 990
    .line 991
    if-eqz v1, :cond_c

    .line 992
    .line 993
    new-instance v0, La/q9q;

    .line 994
    .line 995
    invoke-direct {v0}, La/q9q;-><init>()V

    .line 996
    .line 997
    .line 998
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 999
    .line 1000
    .line 1001
    move-result-object v1

    .line 1002
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    invoke-static {v0, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 1006
    .line 1007
    .line 1008
    goto/16 :goto_7

    .line 1009
    .line 1010
    :cond_c
    sget-object v1, La/kaq;->a:La/kaq;

    .line 1011
    .line 1012
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1013
    .line 1014
    .line 1015
    move-result v1

    .line 1016
    if-eqz v1, :cond_e

    .line 1017
    .line 1018
    iget-object v0, v3, La/n9q;->M1:La/xi70;

    .line 1019
    .line 1020
    if-eqz v0, :cond_d

    .line 1021
    .line 1022
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 1030
    .line 1031
    .line 1032
    goto/16 :goto_7

    .line 1033
    .line 1034
    :cond_d
    const-string v0, "quickBetDialogProvider"

    .line 1035
    .line 1036
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1037
    .line 1038
    .line 1039
    throw v7

    .line 1040
    :cond_e
    sget-object v1, La/jaq;->a:La/jaq;

    .line 1041
    .line 1042
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1043
    .line 1044
    .line 1045
    move-result v1

    .line 1046
    const-string v2, "snackbarManager"

    .line 1047
    .line 1048
    if-eqz v1, :cond_10

    .line 1049
    .line 1050
    iget-object v1, v3, La/n9q;->N1:La/wdk0;

    .line 1051
    .line 1052
    if-eqz v1, :cond_f

    .line 1053
    .line 1054
    new-instance v2, La/xdk0;

    .line 1055
    .line 1056
    sget-object v9, La/qek0;->a:La/qek0;

    .line 1057
    .line 1058
    const v0, 0x7f130e86

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v10

    .line 1065
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1066
    .line 1067
    .line 1068
    const/4 v14, 0x0

    .line 1069
    const/16 v15, 0x7c

    .line 1070
    .line 1071
    const/4 v11, 0x0

    .line 1072
    const/4 v12, 0x0

    .line 1073
    const/4 v13, 0x0

    .line 1074
    move-object v8, v2

    .line 1075
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1076
    .line 1077
    .line 1078
    const/4 v7, 0x0

    .line 1079
    const/16 v8, 0x3fc

    .line 1080
    .line 1081
    const/4 v4, 0x0

    .line 1082
    const/4 v5, 0x0

    .line 1083
    const/4 v6, 0x0

    .line 1084
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1085
    .line 1086
    .line 1087
    goto/16 :goto_7

    .line 1088
    .line 1089
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    throw v7

    .line 1093
    :cond_10
    sget-object v1, La/eaq;->a:La/eaq;

    .line 1094
    .line 1095
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1096
    .line 1097
    .line 1098
    move-result v1

    .line 1099
    const-string v4, "actionDialogManager"

    .line 1100
    .line 1101
    if-eqz v1, :cond_12

    .line 1102
    .line 1103
    iget-object v0, v3, La/n9q;->Q1:La/ii;

    .line 1104
    .line 1105
    if-eqz v0, :cond_11

    .line 1106
    .line 1107
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1108
    .line 1109
    const v1, 0x7f130162

    .line 1110
    .line 1111
    .line 1112
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1113
    .line 1114
    .line 1115
    move-result-object v9

    .line 1116
    const v1, 0x7f1316ef

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v10

    .line 1123
    const v1, 0x7f130e5c

    .line 1124
    .line 1125
    .line 1126
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v11

    .line 1130
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    sget-object v17, La/n12;->b:La/n12;

    .line 1134
    .line 1135
    const/16 v18, 0x0

    .line 1136
    .line 1137
    const/16 v19, 0x5f8

    .line 1138
    .line 1139
    const/4 v12, 0x0

    .line 1140
    const/4 v13, 0x0

    .line 1141
    const/4 v14, 0x0

    .line 1142
    const/4 v15, 0x0

    .line 1143
    const/16 v16, 0x0

    .line 1144
    .line 1145
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1146
    .line 1147
    .line 1148
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v1

    .line 1152
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1153
    .line 1154
    .line 1155
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1156
    .line 1157
    .line 1158
    goto/16 :goto_7

    .line 1159
    .line 1160
    :cond_11
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1161
    .line 1162
    .line 1163
    throw v7

    .line 1164
    :cond_12
    instance-of v1, v0, La/haq;

    .line 1165
    .line 1166
    const-string v5, "successBetAlertManager"

    .line 1167
    .line 1168
    const v9, 0x7f1308b8

    .line 1169
    .line 1170
    .line 1171
    const v10, 0x7f13025d

    .line 1172
    .line 1173
    .line 1174
    if-eqz v1, :cond_15

    .line 1175
    .line 1176
    check-cast v0, La/haq;

    .line 1177
    .line 1178
    iget-object v13, v0, La/haq;->a:Ljava/lang/String;

    .line 1179
    .line 1180
    iget-wide v1, v0, La/haq;->b:J

    .line 1181
    .line 1182
    iget-object v4, v0, La/haq;->c:Ljava/lang/String;

    .line 1183
    .line 1184
    iget-wide v11, v0, La/haq;->d:D

    .line 1185
    .line 1186
    iget-object v14, v0, La/haq;->e:Ljava/lang/String;

    .line 1187
    .line 1188
    iget-object v15, v0, La/haq;->f:Ljava/lang/String;

    .line 1189
    .line 1190
    iget-object v8, v0, La/haq;->g:Ljava/lang/String;

    .line 1191
    .line 1192
    iget-boolean v0, v0, La/haq;->h:Z

    .line 1193
    .line 1194
    iget-object v6, v3, La/n9q;->P1:La/lgn0;

    .line 1195
    .line 1196
    if-eqz v6, :cond_14

    .line 1197
    .line 1198
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 1199
    .line 1200
    invoke-virtual {v3, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v10

    .line 1204
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1205
    .line 1206
    .line 1207
    invoke-direct {v5, v10, v7, v7, v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1208
    .line 1209
    .line 1210
    invoke-virtual {v3, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v7

    .line 1214
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v9

    .line 1218
    new-instance v10, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 1219
    .line 1220
    move/from16 v21, v0

    .line 1221
    .line 1222
    const v0, 0x7f130494

    .line 1223
    .line 1224
    .line 1225
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1226
    .line 1227
    .line 1228
    move-result-object v0

    .line 1229
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1230
    .line 1231
    .line 1232
    invoke-direct {v10, v0, v14}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1233
    .line 1234
    .line 1235
    invoke-virtual {v9, v10}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1236
    .line 1237
    .line 1238
    new-instance v14, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 1239
    .line 1240
    const v0, 0x7f130270

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v3, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v16

    .line 1247
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    sget-object v0, La/pn40;->a:La/pn40;

    .line 1251
    .line 1252
    sget-object v0, La/p3u0;->c:La/p3u0;

    .line 1253
    .line 1254
    invoke-static {v11, v12, v0}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v17

    .line 1258
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v0

    .line 1262
    const v10, 0x7f040b72

    .line 1263
    .line 1264
    .line 1265
    invoke-static {v10, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1266
    .line 1267
    .line 1268
    move-result v0

    .line 1269
    const/16 v19, 0x1

    .line 1270
    .line 1271
    move-object/from16 v18, v15

    .line 1272
    .line 1273
    move v15, v0

    .line 1274
    move-object/from16 v0, v18

    .line 1275
    .line 1276
    move-object/from16 v18, v4

    .line 1277
    .line 1278
    invoke-direct/range {v14 .. v19}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1279
    .line 1280
    .line 1281
    invoke-virtual {v9, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1282
    .line 1283
    .line 1284
    if-nez v21, :cond_13

    .line 1285
    .line 1286
    new-instance v14, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;

    .line 1287
    .line 1288
    const-string v10, ":"

    .line 1289
    .line 1290
    const-string v11, ""

    .line 1291
    .line 1292
    const/4 v12, 0x0

    .line 1293
    invoke-static {v8, v10, v11, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1294
    .line 1295
    .line 1296
    move-result-object v8

    .line 1297
    invoke-static {v8}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v8

    .line 1301
    invoke-virtual {v8}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v16

    .line 1305
    invoke-static {v0, v4, v11, v12}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v0

    .line 1309
    invoke-static {v0}, Lkotlin/text/StringsKt;->v0(Ljava/lang/String;)Ljava/lang/CharSequence;

    .line 1310
    .line 1311
    .line 1312
    move-result-object v0

    .line 1313
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v17

    .line 1317
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v0

    .line 1321
    const v8, 0x7f040aeb

    .line 1322
    .line 1323
    .line 1324
    invoke-static {v8, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 1325
    .line 1326
    .line 1327
    move-result v15

    .line 1328
    const/16 v19, 0x0

    .line 1329
    .line 1330
    move-object/from16 v18, v4

    .line 1331
    .line 1332
    invoke-direct/range {v14 .. v19}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$WithCurrency;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 1333
    .line 1334
    .line 1335
    invoke-virtual {v9, v14}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 1336
    .line 1337
    .line 1338
    :cond_13
    invoke-static {v9}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v17

    .line 1342
    new-instance v11, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 1343
    .line 1344
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1345
    .line 1346
    .line 1347
    move-result-object v15

    .line 1348
    const-string v16, "SIMPLE"

    .line 1349
    .line 1350
    const-string v14, "REQUEST_SUCCESS_BET_KEY"

    .line 1351
    .line 1352
    move-object v12, v7

    .line 1353
    invoke-direct/range {v11 .. v17}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 1354
    .line 1355
    .line 1356
    invoke-virtual {v6, v5, v11, v3}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 1357
    .line 1358
    .line 1359
    goto/16 :goto_7

    .line 1360
    .line 1361
    :cond_14
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1362
    .line 1363
    .line 1364
    throw v7

    .line 1365
    :cond_15
    instance-of v1, v0, La/faq;

    .line 1366
    .line 1367
    const-string v6, "makeBetBottomSheetProvider"

    .line 1368
    .line 1369
    if-eqz v1, :cond_17

    .line 1370
    .line 1371
    check-cast v0, La/faq;

    .line 1372
    .line 1373
    iget-object v0, v0, La/faq;->a:Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;

    .line 1374
    .line 1375
    iget-object v1, v3, La/n9q;->O1:La/d720;

    .line 1376
    .line 1377
    if-eqz v1, :cond_16

    .line 1378
    .line 1379
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1380
    .line 1381
    .line 1382
    move-result-object v2

    .line 1383
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v1, v2, v0}, La/d720;->a(Landroidx/fragment/app/e;Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;)V

    .line 1387
    .line 1388
    .line 1389
    goto/16 :goto_7

    .line 1390
    .line 1391
    :cond_16
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    throw v7

    .line 1395
    :cond_17
    instance-of v1, v0, La/gaq;

    .line 1396
    .line 1397
    const v8, 0x7f1307bb

    .line 1398
    .line 1399
    .line 1400
    if-eqz v1, :cond_19

    .line 1401
    .line 1402
    check-cast v0, La/gaq;

    .line 1403
    .line 1404
    iget-object v11, v0, La/gaq;->a:Ljava/lang/String;

    .line 1405
    .line 1406
    iget-object v0, v3, La/n9q;->Q1:La/ii;

    .line 1407
    .line 1408
    if-eqz v0, :cond_18

    .line 1409
    .line 1410
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1411
    .line 1412
    invoke-virtual {v3, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v10

    .line 1416
    const v1, 0x7f131843

    .line 1417
    .line 1418
    .line 1419
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v12

    .line 1423
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1424
    .line 1425
    .line 1426
    const v1, 0x7f130e07

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v13

    .line 1433
    sget-object v18, La/n12;->b:La/n12;

    .line 1434
    .line 1435
    const/16 v19, 0x0

    .line 1436
    .line 1437
    const/16 v20, 0x5d0

    .line 1438
    .line 1439
    const/4 v14, 0x0

    .line 1440
    const-string v15, "BET_ALREADY_DONE_REQUEST_KEY"

    .line 1441
    .line 1442
    const/16 v16, 0x0

    .line 1443
    .line 1444
    const/16 v17, 0x0

    .line 1445
    .line 1446
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1454
    .line 1455
    .line 1456
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1457
    .line 1458
    .line 1459
    goto/16 :goto_7

    .line 1460
    .line 1461
    :cond_18
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1462
    .line 1463
    .line 1464
    throw v7

    .line 1465
    :cond_19
    instance-of v1, v0, La/iaq;

    .line 1466
    .line 1467
    if-eqz v1, :cond_1b

    .line 1468
    .line 1469
    check-cast v0, La/iaq;

    .line 1470
    .line 1471
    iget-object v11, v0, La/iaq;->a:Ljava/lang/String;

    .line 1472
    .line 1473
    iget-object v0, v3, La/n9q;->Q1:La/ii;

    .line 1474
    .line 1475
    if-eqz v0, :cond_1a

    .line 1476
    .line 1477
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1478
    .line 1479
    invoke-virtual {v3, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v10

    .line 1483
    const v1, 0x7f13115a

    .line 1484
    .line 1485
    .line 1486
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v12

    .line 1490
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1491
    .line 1492
    .line 1493
    const v1, 0x7f13032f

    .line 1494
    .line 1495
    .line 1496
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1497
    .line 1498
    .line 1499
    move-result-object v13

    .line 1500
    sget-object v18, La/n12;->b:La/n12;

    .line 1501
    .line 1502
    const/16 v19, 0x0

    .line 1503
    .line 1504
    const/16 v20, 0x5d0

    .line 1505
    .line 1506
    const/4 v14, 0x0

    .line 1507
    const-string v15, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY"

    .line 1508
    .line 1509
    const/16 v16, 0x0

    .line 1510
    .line 1511
    const/16 v17, 0x0

    .line 1512
    .line 1513
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v1

    .line 1520
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1521
    .line 1522
    .line 1523
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1524
    .line 1525
    .line 1526
    goto/16 :goto_7

    .line 1527
    .line 1528
    :cond_1a
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1529
    .line 1530
    .line 1531
    throw v7

    .line 1532
    :cond_1b
    instance-of v1, v0, La/caq;

    .line 1533
    .line 1534
    if-eqz v1, :cond_1e

    .line 1535
    .line 1536
    iget-object v0, v3, La/n9q;->O1:La/d720;

    .line 1537
    .line 1538
    if-eqz v0, :cond_1d

    .line 1539
    .line 1540
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v1

    .line 1544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1545
    .line 1546
    .line 1547
    iget-object v0, v0, La/d720;->d:Ljava/lang/String;

    .line 1548
    .line 1549
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1550
    .line 1551
    .line 1552
    move-result-object v0

    .line 1553
    instance-of v1, v0, La/sik;

    .line 1554
    .line 1555
    if-eqz v1, :cond_1c

    .line 1556
    .line 1557
    move-object v7, v0

    .line 1558
    check-cast v7, La/sik;

    .line 1559
    .line 1560
    :cond_1c
    if-eqz v7, :cond_21

    .line 1561
    .line 1562
    invoke-virtual {v7}, La/sik;->x0()V

    .line 1563
    .line 1564
    .line 1565
    goto/16 :goto_7

    .line 1566
    .line 1567
    :cond_1d
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1568
    .line 1569
    .line 1570
    throw v7

    .line 1571
    :cond_1e
    instance-of v1, v0, La/maq;

    .line 1572
    .line 1573
    if-eqz v1, :cond_20

    .line 1574
    .line 1575
    iget-object v1, v3, La/n9q;->N1:La/wdk0;

    .line 1576
    .line 1577
    if-eqz v1, :cond_1f

    .line 1578
    .line 1579
    new-instance v2, La/xdk0;

    .line 1580
    .line 1581
    sget-object v9, La/rek0;->b:La/rek0;

    .line 1582
    .line 1583
    check-cast v0, La/maq;

    .line 1584
    .line 1585
    iget-object v10, v0, La/maq;->a:Ljava/lang/String;

    .line 1586
    .line 1587
    const/4 v14, 0x0

    .line 1588
    const/16 v15, 0x7c

    .line 1589
    .line 1590
    const/4 v11, 0x0

    .line 1591
    const/4 v12, 0x0

    .line 1592
    const/4 v13, 0x0

    .line 1593
    move-object v8, v2

    .line 1594
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1595
    .line 1596
    .line 1597
    const/4 v7, 0x0

    .line 1598
    const/16 v8, 0x3fc

    .line 1599
    .line 1600
    const/4 v4, 0x0

    .line 1601
    const/4 v5, 0x0

    .line 1602
    const/4 v6, 0x0

    .line 1603
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1604
    .line 1605
    .line 1606
    goto :goto_7

    .line 1607
    :cond_1f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1608
    .line 1609
    .line 1610
    throw v7

    .line 1611
    :cond_20
    instance-of v1, v0, La/laq;

    .line 1612
    .line 1613
    if-eqz v1, :cond_23

    .line 1614
    .line 1615
    check-cast v0, La/laq;

    .line 1616
    .line 1617
    iget-object v13, v0, La/laq;->a:Ljava/lang/String;

    .line 1618
    .line 1619
    iget-wide v1, v0, La/laq;->b:J

    .line 1620
    .line 1621
    iget-object v0, v0, La/laq;->c:Ljava/lang/String;

    .line 1622
    .line 1623
    iget-object v4, v3, La/n9q;->P1:La/lgn0;

    .line 1624
    .line 1625
    if-eqz v4, :cond_22

    .line 1626
    .line 1627
    new-instance v5, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;

    .line 1628
    .line 1629
    invoke-virtual {v3, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v6

    .line 1633
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    invoke-direct {v5, v6, v7, v7, v7}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1637
    .line 1638
    .line 1639
    const v6, 0x7f131011

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v3, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v6

    .line 1646
    invoke-virtual {v3, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v7

    .line 1650
    const-string v8, ": "

    .line 1651
    .line 1652
    invoke-static {v6, v8, v7}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v12

    .line 1656
    new-instance v6, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;

    .line 1657
    .line 1658
    const v7, 0x7f130494

    .line 1659
    .line 1660
    .line 1661
    invoke-virtual {v3, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v7

    .line 1665
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1666
    .line 1667
    .line 1668
    invoke-direct {v6, v7, v0}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetInfoItem$Simple;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 1669
    .line 1670
    .line 1671
    invoke-static {v6}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v17

    .line 1675
    new-instance v11, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;

    .line 1676
    .line 1677
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v15

    .line 1681
    const-string v16, "PROMO"

    .line 1682
    .line 1683
    const-string v14, "REQUEST_SUCCESS_BET_KEY"

    .line 1684
    .line 1685
    invoke-direct/range {v11 .. v17}, Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/util/List;)V

    .line 1686
    .line 1687
    .line 1688
    invoke-virtual {v4, v5, v11, v3}, La/lgn0;->c(Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetStringModel;Lorg/xplatform/betting/core/success_bet_alert/presentation/models/SuccessBetAlertModel;Landroidx/fragment/app/Fragment;)V

    .line 1689
    .line 1690
    .line 1691
    :cond_21
    :goto_7
    invoke-virtual {v3}, La/n9q;->G0()La/k3t0;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    sget-object v1, La/t8q;->a:La/t8q;

    .line 1696
    .line 1697
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1698
    .line 1699
    .line 1700
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1701
    .line 1702
    goto :goto_8

    .line 1703
    :cond_22
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1704
    .line 1705
    .line 1706
    throw v7

    .line 1707
    :cond_23
    invoke-static {}, La/t9f;->b()V

    .line 1708
    .line 1709
    .line 1710
    :goto_8
    return-object v7

    .line 1711
    :pswitch_17
    check-cast v0, La/typ;

    .line 1712
    .line 1713
    move-object/from16 v1, p1

    .line 1714
    .line 1715
    check-cast v1, La/k0w0;

    .line 1716
    .line 1717
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1718
    .line 1719
    .line 1720
    iget-object v2, v0, La/typ;->w:La/uxs0;

    .line 1721
    .line 1722
    new-instance v3, Lorg/xplatform/ufc/api/last_fights/LastFightsParams;

    .line 1723
    .line 1724
    iget-object v0, v0, La/typ;->o:Lorg/xplatform/ufc/api/fighter/FighterParams;

    .line 1725
    .line 1726
    iget-wide v4, v0, Lorg/xplatform/ufc/api/fighter/FighterParams;->a:J

    .line 1727
    .line 1728
    invoke-direct {v3, v4, v5}, Lorg/xplatform/ufc/api/last_fights/LastFightsParams;-><init>(J)V

    .line 1729
    .line 1730
    .line 1731
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1732
    .line 1733
    .line 1734
    new-instance v0, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcLastFightsScreen$1;

    .line 1735
    .line 1736
    invoke-direct {v0, v3}, Lorg/xplatform/ufc/impl/navigation/UfcInternalScreensFactory$getUfcLastFightsScreen$1;-><init>(Lorg/xplatform/ufc/api/last_fights/LastFightsParams;)V

    .line 1737
    .line 1738
    .line 1739
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1740
    .line 1741
    .line 1742
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1743
    .line 1744
    return-object v0

    .line 1745
    :pswitch_18
    check-cast v0, La/svp;

    .line 1746
    .line 1747
    move-object/from16 v1, p1

    .line 1748
    .line 1749
    check-cast v1, La/uid;

    .line 1750
    .line 1751
    sget-object v2, La/svp;->S1:La/ddk;

    .line 1752
    .line 1753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    invoke-virtual {v0}, La/svp;->G0()La/k3t0;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v0

    .line 1760
    new-instance v2, La/dvp;

    .line 1761
    .line 1762
    invoke-direct {v2, v1}, La/dvp;-><init>(La/uid;)V

    .line 1763
    .line 1764
    .line 1765
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1766
    .line 1767
    .line 1768
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1769
    .line 1770
    return-object v0

    .line 1771
    :pswitch_19
    check-cast v0, La/wgp;

    .line 1772
    .line 1773
    move-object/from16 v1, p1

    .line 1774
    .line 1775
    check-cast v1, Ljava/lang/Throwable;

    .line 1776
    .line 1777
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1778
    .line 1779
    .line 1780
    iget-object v2, v0, La/wgp;->o:La/duj;

    .line 1781
    .line 1782
    new-instance v3, La/f5o;

    .line 1783
    .line 1784
    const/16 v4, 0x12

    .line 1785
    .line 1786
    invoke-direct {v3, v0, v4}, La/f5o;-><init>(Ljava/lang/Object;B)V

    .line 1787
    .line 1788
    .line 1789
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1790
    .line 1791
    .line 1792
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1793
    .line 1794
    return-object v0

    .line 1795
    :pswitch_1a
    check-cast v0, La/gfp;

    .line 1796
    .line 1797
    move-object/from16 v1, p1

    .line 1798
    .line 1799
    check-cast v1, La/k0w0;

    .line 1800
    .line 1801
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1802
    .line 1803
    .line 1804
    iget-object v2, v0, La/gfp;->u:La/oct;

    .line 1805
    .line 1806
    sget-object v7, La/t270;->a:La/t270;

    .line 1807
    .line 1808
    const/4 v8, 0x0

    .line 1809
    const/16 v9, 0x17

    .line 1810
    .line 1811
    const-wide/16 v3, 0x0

    .line 1812
    .line 1813
    const/4 v5, 0x0

    .line 1814
    const/4 v6, 0x0

    .line 1815
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v0

    .line 1819
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1820
    .line 1821
    .line 1822
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1823
    .line 1824
    return-object v0

    .line 1825
    :pswitch_1b
    check-cast v0, Lorg/xplatform/favorites/impl/presentation/category/e;

    .line 1826
    .line 1827
    move-object/from16 v3, p1

    .line 1828
    .line 1829
    check-cast v3, Ljava/lang/String;

    .line 1830
    .line 1831
    sget-object v1, Lorg/xplatform/favorites/impl/presentation/category/e;->V1:La/sek;

    .line 1832
    .line 1833
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v0}, Lorg/xplatform/favorites/impl/presentation/category/e;->H0()Lorg/xplatform/favorites/impl/presentation/category/f;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v2

    .line 1840
    sget-object v4, Lorg/xplatform/favorites/impl/presentation/category/e;->X1:Ljava/lang/String;

    .line 1841
    .line 1842
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1843
    .line 1844
    .line 1845
    iget-object v0, v2, Lorg/xplatform/favorites/impl/presentation/category/f;->t:La/bby;

    .line 1846
    .line 1847
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 1848
    .line 1849
    .line 1850
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v0

    .line 1854
    iget-object v1, v2, Lorg/xplatform/favorites/impl/presentation/category/f;->m:La/mne;

    .line 1855
    .line 1856
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 1857
    .line 1858
    sget-object v7, La/vep;->a:La/vep;

    .line 1859
    .line 1860
    new-instance v1, La/ofl;

    .line 1861
    .line 1862
    const/4 v5, 0x0

    .line 1863
    const/16 v6, 0x1a

    .line 1864
    .line 1865
    invoke-direct/range {v1 .. v6}, La/ofl;-><init>(La/diu0;Ljava/io/Serializable;Ljava/lang/Object;La/yje;B)V

    .line 1866
    .line 1867
    .line 1868
    const/16 v10, 0xa

    .line 1869
    .line 1870
    move-object v6, v7

    .line 1871
    const/4 v7, 0x0

    .line 1872
    move-object v5, v0

    .line 1873
    move-object v9, v1

    .line 1874
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1875
    .line 1876
    .line 1877
    move-result-object v0

    .line 1878
    iput-object v0, v2, Lorg/xplatform/favorites/impl/presentation/category/f;->t:La/bby;

    .line 1879
    .line 1880
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1881
    .line 1882
    return-object v0

    .line 1883
    :pswitch_1c
    check-cast v0, La/qk1;

    .line 1884
    .line 1885
    move-object/from16 v1, p1

    .line 1886
    .line 1887
    check-cast v1, La/fee;

    .line 1888
    .line 1889
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1890
    .line 1891
    .line 1892
    invoke-virtual {v1}, La/fee;->c()Ljava/lang/Object;

    .line 1893
    .line 1894
    .line 1895
    move-result-object v1

    .line 1896
    check-cast v1, Ljava/util/List;

    .line 1897
    .line 1898
    iget-object v2, v0, La/qk1;->d:La/n0o0;

    .line 1899
    .line 1900
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1901
    .line 1902
    .line 1903
    move-result-object v2

    .line 1904
    check-cast v2, La/fee;

    .line 1905
    .line 1906
    invoke-virtual {v2}, La/fee;->c()Ljava/lang/Object;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v2

    .line 1910
    check-cast v2, Ljava/util/Set;

    .line 1911
    .line 1912
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 1913
    .line 1914
    .line 1915
    move-result v3

    .line 1916
    if-eqz v3, :cond_24

    .line 1917
    .line 1918
    sget-object v0, La/lak0;->c:La/lak0;

    .line 1919
    .line 1920
    goto/16 :goto_10

    .line 1921
    .line 1922
    :cond_24
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1923
    .line 1924
    .line 1925
    move-result v3

    .line 1926
    if-le v3, v9, :cond_25

    .line 1927
    .line 1928
    move v12, v9

    .line 1929
    goto :goto_9

    .line 1930
    :cond_25
    const/4 v12, 0x0

    .line 1931
    :goto_9
    new-instance v3, Ljava/util/ArrayList;

    .line 1932
    .line 1933
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1934
    .line 1935
    .line 1936
    if-eqz v12, :cond_28

    .line 1937
    .line 1938
    iget-object v0, v0, La/qk1;->b:La/ctf0;

    .line 1939
    .line 1940
    const/4 v4, 0x0

    .line 1941
    new-array v5, v4, [Ljava/lang/Object;

    .line 1942
    .line 1943
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 1944
    .line 1945
    invoke-static {v5, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v5

    .line 1949
    const v4, 0x7f131229

    .line 1950
    .line 1951
    .line 1952
    invoke-virtual {v0, v4, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1953
    .line 1954
    .line 1955
    move-result-object v0

    .line 1956
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v4

    .line 1960
    const/4 v5, 0x0

    .line 1961
    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1962
    .line 1963
    .line 1964
    move-result v6

    .line 1965
    if-eqz v6, :cond_26

    .line 1966
    .line 1967
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v6

    .line 1971
    check-cast v6, La/s9p;

    .line 1972
    .line 1973
    invoke-interface {v6}, La/s9p;->b()I

    .line 1974
    .line 1975
    .line 1976
    move-result v6

    .line 1977
    add-int/2addr v5, v6

    .line 1978
    goto :goto_a

    .line 1979
    :cond_26
    new-instance v4, La/l9p;

    .line 1980
    .line 1981
    invoke-direct {v4, v0, v5}, La/l9p;-><init>(Ljava/lang/String;I)V

    .line 1982
    .line 1983
    .line 1984
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 1985
    .line 1986
    .line 1987
    move-result v0

    .line 1988
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1989
    .line 1990
    .line 1991
    move-result v5

    .line 1992
    if-ne v0, v5, :cond_27

    .line 1993
    .line 1994
    move v0, v9

    .line 1995
    goto :goto_b

    .line 1996
    :cond_27
    const/4 v0, 0x0

    .line 1997
    :goto_b
    new-instance v5, La/e7p;

    .line 1998
    .line 1999
    sget-object v6, La/wui0;->b:La/wui0;

    .line 2000
    .line 2001
    invoke-static {v4, v0, v6}, La/qk1;->a(La/s9p;ZLa/wui0;)La/kvl;

    .line 2002
    .line 2003
    .line 2004
    move-result-object v0

    .line 2005
    const/4 v6, 0x0

    .line 2006
    invoke-direct {v5, v4, v0, v6}, La/e7p;-><init>(La/s9p;La/kvl;Z)V

    .line 2007
    .line 2008
    .line 2009
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2010
    .line 2011
    .line 2012
    goto :goto_c

    .line 2013
    :cond_28
    const/4 v6, 0x0

    .line 2014
    :goto_c
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2015
    .line 2016
    .line 2017
    move-result-object v0

    .line 2018
    move v4, v6

    .line 2019
    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2020
    .line 2021
    .line 2022
    move-result v5

    .line 2023
    if-eqz v5, :cond_2e

    .line 2024
    .line 2025
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v5

    .line 2029
    add-int/lit8 v8, v4, 0x1

    .line 2030
    .line 2031
    if-ltz v4, :cond_2d

    .line 2032
    .line 2033
    check-cast v5, La/s9p;

    .line 2034
    .line 2035
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2036
    .line 2037
    .line 2038
    move-result v10

    .line 2039
    sub-int/2addr v10, v9

    .line 2040
    if-ne v4, v10, :cond_29

    .line 2041
    .line 2042
    move v10, v9

    .line 2043
    goto :goto_e

    .line 2044
    :cond_29
    move v10, v6

    .line 2045
    :goto_e
    invoke-interface {v2, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 2046
    .line 2047
    .line 2048
    move-result v11

    .line 2049
    if-nez v12, :cond_2a

    .line 2050
    .line 2051
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 2052
    .line 2053
    .line 2054
    move-result v13

    .line 2055
    if-ne v13, v9, :cond_2a

    .line 2056
    .line 2057
    sget-object v4, La/wui0;->a:La/wui0;

    .line 2058
    .line 2059
    goto :goto_f

    .line 2060
    :cond_2a
    if-eqz v10, :cond_2b

    .line 2061
    .line 2062
    sget-object v4, La/wui0;->d:La/wui0;

    .line 2063
    .line 2064
    goto :goto_f

    .line 2065
    :cond_2b
    if-nez v12, :cond_2c

    .line 2066
    .line 2067
    if-nez v4, :cond_2c

    .line 2068
    .line 2069
    sget-object v4, La/wui0;->b:La/wui0;

    .line 2070
    .line 2071
    goto :goto_f

    .line 2072
    :cond_2c
    sget-object v4, La/wui0;->c:La/wui0;

    .line 2073
    .line 2074
    :goto_f
    new-instance v13, La/e7p;

    .line 2075
    .line 2076
    invoke-static {v5, v11, v4}, La/qk1;->a(La/s9p;ZLa/wui0;)La/kvl;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v4

    .line 2080
    invoke-direct {v13, v5, v4, v10}, La/e7p;-><init>(La/s9p;La/kvl;Z)V

    .line 2081
    .line 2082
    .line 2083
    invoke-virtual {v3, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2084
    .line 2085
    .line 2086
    move v4, v8

    .line 2087
    goto :goto_d

    .line 2088
    :cond_2d
    invoke-static {}, La/q3d;->p()V

    .line 2089
    .line 2090
    .line 2091
    throw v7

    .line 2092
    :cond_2e
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2093
    .line 2094
    .line 2095
    move-result-object v0

    .line 2096
    :goto_10
    return-object v0

    .line 2097
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
