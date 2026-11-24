.class public final La/kaw;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/kaw;->i:B

    iput-object p1, p0, La/kaw;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/kaw;->i:B

    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    iput-object p2, p0, La/kaw;->k:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method private final l(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v2

    .line 8
    iget-object v3, v0, La/kaw;->k:Ljava/lang/Object;

    .line 9
    .line 10
    move-object v4, v3

    .line 11
    check-cast v4, La/ukw;

    .line 12
    .line 13
    iget-object v3, v4, La/ukw;->u:La/luu;

    .line 14
    .line 15
    iget-object v5, v4, La/ukw;->H:La/vqc;

    .line 16
    .line 17
    iget-object v6, v4, La/i3t0;->f:La/oyg0;

    .line 18
    .line 19
    iget-object v7, v4, La/i3t0;->i:La/ocj;

    .line 20
    .line 21
    iget-object v8, v4, La/ukw;->G:La/vqc;

    .line 22
    .line 23
    iget-object v9, v4, La/ukw;->y:La/zr1;

    .line 24
    .line 25
    iget-object v10, v4, La/ukw;->w:La/ih5;

    .line 26
    .line 27
    iget-object v11, v4, La/ukw;->E:La/oeg0;

    .line 28
    .line 29
    iget-object v13, v4, La/ukw;->p:La/hzg;

    .line 30
    .line 31
    sget-object v12, La/wne;->a:La/wne;

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v0, La/whw;

    .line 39
    .line 40
    instance-of v12, v0, La/ogw;

    .line 41
    .line 42
    if-eqz v12, :cond_0

    .line 43
    .line 44
    sget v0, La/ukw;->X:I

    .line 45
    .line 46
    check-cast v13, La/uzg;

    .line 47
    .line 48
    invoke-virtual {v13}, La/uzg;->a()V

    .line 49
    .line 50
    .line 51
    goto/16 :goto_35

    .line 52
    .line 53
    :cond_0
    instance-of v12, v0, La/mhw;

    .line 54
    .line 55
    const/4 v14, 0x3

    .line 56
    const/4 v15, 0x0

    .line 57
    if-eqz v12, :cond_2

    .line 58
    .line 59
    check-cast v0, La/mhw;

    .line 60
    .line 61
    iget-object v0, v0, La/mhw;->a:La/ekw;

    .line 62
    .line 63
    sget v1, La/ukw;->X:I

    .line 64
    .line 65
    iget-object v12, v7, La/ocj;->a:La/p7m0;

    .line 66
    .line 67
    :goto_0
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-object/from16 v16, v1

    .line 75
    .line 76
    check-cast v16, La/zjw;

    .line 77
    .line 78
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    const/16 v28, 0x0

    .line 82
    .line 83
    const v29, 0x7ffbf

    .line 84
    .line 85
    .line 86
    const/16 v17, 0x0

    .line 87
    .line 88
    const/16 v19, 0x0

    .line 89
    .line 90
    const/16 v20, 0x0

    .line 91
    .line 92
    const/16 v21, 0x0

    .line 93
    .line 94
    const/16 v22, 0x0

    .line 95
    .line 96
    const/16 v23, 0x0

    .line 97
    .line 98
    const/16 v24, 0x0

    .line 99
    .line 100
    const/16 v25, 0x0

    .line 101
    .line 102
    const/16 v26, 0x0

    .line 103
    .line 104
    const/16 v27, 0x0

    .line 105
    .line 106
    move-object/from16 v18, v0

    .line 107
    .line 108
    invoke-static/range {v16 .. v29}, La/zjw;->a(La/zjw;Ljava/util/List;La/ekw;Ljava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)La/zjw;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    move-object/from16 v2, v18

    .line 113
    .line 114
    invoke-virtual {v12, v1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v0

    .line 118
    if-eqz v0, :cond_1

    .line 119
    .line 120
    new-instance v0, La/pkw;

    .line 121
    .line 122
    invoke-direct {v0, v4, v15}, La/pkw;-><init>(La/ukw;La/yje;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v4, v15, v15, v0, v14}, La/i3t0;->K(La/i3t0;La/lne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)La/bby;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/zjw;

    .line 133
    .line 134
    iget-boolean v0, v0, La/zjw;->i:Z

    .line 135
    .line 136
    invoke-virtual {v4, v0, v2}, La/ukw;->O(ZLa/ekw;)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, La/ukw;->Z()V

    .line 140
    .line 141
    .line 142
    goto/16 :goto_35

    .line 143
    .line 144
    :cond_1
    move-object v0, v2

    .line 145
    goto :goto_0

    .line 146
    :cond_2
    instance-of v12, v0, La/qhw;

    .line 147
    .line 148
    if-eqz v12, :cond_3

    .line 149
    .line 150
    sget v0, La/ukw;->X:I

    .line 151
    .line 152
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    check-cast v0, La/zjw;

    .line 157
    .line 158
    iget-boolean v0, v0, La/zjw;->i:Z

    .line 159
    .line 160
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    check-cast v1, La/zjw;

    .line 165
    .line 166
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 167
    .line 168
    invoke-virtual {v4, v0, v1}, La/ukw;->O(ZLa/ekw;)V

    .line 169
    .line 170
    .line 171
    goto/16 :goto_35

    .line 172
    .line 173
    :cond_3
    instance-of v12, v0, La/ghw;

    .line 174
    .line 175
    if-eqz v12, :cond_4

    .line 176
    .line 177
    check-cast v0, La/ghw;

    .line 178
    .line 179
    sget v1, La/ukw;->X:I

    .line 180
    .line 181
    invoke-virtual {v4, v0}, La/ukw;->T(La/ghw;)V

    .line 182
    .line 183
    .line 184
    goto/16 :goto_35

    .line 185
    .line 186
    :cond_4
    instance-of v12, v0, La/khw;

    .line 187
    .line 188
    const-string v15, ""

    .line 189
    .line 190
    const-string v1, "cyber_partner_call"

    .line 191
    .line 192
    move-object/from16 v18, v15

    .line 193
    .line 194
    const/4 v14, 0x0

    .line 195
    if-eqz v12, :cond_b

    .line 196
    .line 197
    check-cast v0, La/khw;

    .line 198
    .line 199
    sget v2, La/ukw;->X:I

    .line 200
    .line 201
    iget-object v0, v0, La/khw;->a:Ljava/lang/String;

    .line 202
    .line 203
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 204
    .line 205
    .line 206
    move-result v2

    .line 207
    sparse-switch v2, :sswitch_data_0

    .line 208
    .line 209
    .line 210
    goto/16 :goto_35

    .line 211
    .line 212
    :sswitch_0
    const-string v2, "HEADER_PARTNER_ALL"

    .line 213
    .line 214
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    if-nez v0, :cond_5

    .line 219
    .line 220
    goto/16 :goto_35

    .line 221
    .line 222
    :cond_5
    iget-object v0, v9, La/zr1;->a:La/s1p;

    .line 223
    .line 224
    sget-object v2, La/xun;->a:La/xun;

    .line 225
    .line 226
    const-wide/16 v3, 0x2ef5

    .line 227
    .line 228
    invoke-virtual {v0, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 229
    .line 230
    .line 231
    iget-object v0, v10, La/ih5;->a:La/kt2;

    .line 232
    .line 233
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    check-cast v13, La/uzg;

    .line 237
    .line 238
    move-object/from16 v12, v18

    .line 239
    .line 240
    invoke-virtual {v13, v12}, La/uzg;->i(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto/16 :goto_35

    .line 244
    .line 245
    :sswitch_1
    const-string v1, "HEADER_CHAMPIONSHIPS"

    .line 246
    .line 247
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 248
    .line 249
    .line 250
    move-result v0

    .line 251
    if-nez v0, :cond_6

    .line 252
    .line 253
    goto/16 :goto_35

    .line 254
    .line 255
    :cond_6
    invoke-virtual {v4}, La/ukw;->P()V

    .line 256
    .line 257
    .line 258
    goto/16 :goto_35

    .line 259
    .line 260
    :sswitch_2
    const-string v1, "ITEM_VIRTUAL_BANNER"

    .line 261
    .line 262
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-nez v0, :cond_7

    .line 267
    .line 268
    goto/16 :goto_35

    .line 269
    .line 270
    :cond_7
    new-instance v0, La/h7w;

    .line 271
    .line 272
    const/4 v1, 0x6

    .line 273
    invoke-direct {v0, v1}, La/h7w;-><init>(B)V

    .line 274
    .line 275
    .line 276
    invoke-static {v0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    invoke-virtual {v5, v0}, La/vqc;->k(La/m1g;)V

    .line 281
    .line 282
    .line 283
    check-cast v13, La/uzg;

    .line 284
    .line 285
    iget-object v0, v13, La/uzg;->a:La/oeg0;

    .line 286
    .line 287
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    new-instance v1, La/hfg;

    .line 292
    .line 293
    const/16 v2, 0xa

    .line 294
    .line 295
    invoke-direct {v1, v13, v2}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 299
    .line 300
    .line 301
    goto/16 :goto_35

    .line 302
    .line 303
    :sswitch_3
    const-string v1, "HEADER_DISCIPLINES_ALL"

    .line 304
    .line 305
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-nez v0, :cond_8

    .line 310
    .line 311
    goto/16 :goto_35

    .line 312
    .line 313
    :cond_8
    invoke-virtual {v4}, La/ukw;->Q()V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_35

    .line 317
    .line 318
    :sswitch_4
    const-string v1, "HEADER_CHAMPIONSHIPS_REAL_LIVE"

    .line 319
    .line 320
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 321
    .line 322
    .line 323
    move-result v0

    .line 324
    if-nez v0, :cond_9

    .line 325
    .line 326
    goto/16 :goto_35

    .line 327
    .line 328
    :cond_9
    const/4 v0, 0x1

    .line 329
    invoke-virtual {v4, v0}, La/ukw;->V(Z)V

    .line 330
    .line 331
    .line 332
    goto/16 :goto_35

    .line 333
    .line 334
    :sswitch_5
    const-string v1, "HEADER_CHAMPIONSHIPS_REAL_LINE"

    .line 335
    .line 336
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    move-result v0

    .line 340
    if-nez v0, :cond_a

    .line 341
    .line 342
    goto/16 :goto_35

    .line 343
    .line 344
    :cond_a
    invoke-virtual {v4, v14}, La/ukw;->V(Z)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_35

    .line 348
    .line 349
    :cond_b
    move-object/from16 v12, v18

    .line 350
    .line 351
    instance-of v15, v0, La/shw;

    .line 352
    .line 353
    const-wide/16 v21, 0x28

    .line 354
    .line 355
    if-eqz v15, :cond_10

    .line 356
    .line 357
    check-cast v0, La/shw;

    .line 358
    .line 359
    iget-wide v1, v0, La/shw;->a:J

    .line 360
    .line 361
    sget v3, La/ukw;->X:I

    .line 362
    .line 363
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object v3

    .line 367
    check-cast v3, La/zjw;

    .line 368
    .line 369
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 370
    .line 371
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 372
    .line 373
    iget-byte v6, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 374
    .line 375
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    check-cast v3, La/zjw;

    .line 380
    .line 381
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 382
    .line 383
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 384
    .line 385
    sget-object v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 386
    .line 387
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 388
    .line 389
    .line 390
    move-result v3

    .line 391
    if-eqz v3, :cond_c

    .line 392
    .line 393
    move-wide/from16 v7, v21

    .line 394
    .line 395
    goto :goto_1

    .line 396
    :cond_c
    move-wide v7, v1

    .line 397
    :goto_1
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 398
    .line 399
    .line 400
    move-result-object v3

    .line 401
    check-cast v3, La/zjw;

    .line 402
    .line 403
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 404
    .line 405
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 406
    .line 407
    invoke-static {v3, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    move-result v3

    .line 411
    if-eqz v3, :cond_d

    .line 412
    .line 413
    :goto_2
    move-wide v9, v1

    .line 414
    goto :goto_3

    .line 415
    :cond_d
    const-wide/16 v1, -0x1

    .line 416
    .line 417
    goto :goto_2

    .line 418
    :goto_3
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v1

    .line 422
    check-cast v1, La/zjw;

    .line 423
    .line 424
    iget-boolean v1, v1, La/zjw;->f:Z

    .line 425
    .line 426
    if-eqz v1, :cond_f

    .line 427
    .line 428
    iget-boolean v1, v0, La/shw;->b:Z

    .line 429
    .line 430
    if-eqz v1, :cond_e

    .line 431
    .line 432
    sget-object v1, La/i1g;->c:La/i1g;

    .line 433
    .line 434
    :goto_4
    move-object v15, v1

    .line 435
    goto :goto_5

    .line 436
    :cond_e
    sget-object v1, La/i1g;->d:La/i1g;

    .line 437
    .line 438
    goto :goto_4

    .line 439
    :goto_5
    iget-object v14, v4, La/ukw;->z:La/chf0;

    .line 440
    .line 441
    const-wide/16 v16, 0x28

    .line 442
    .line 443
    iget-wide v1, v0, La/shw;->a:J

    .line 444
    .line 445
    move-wide/from16 v18, v1

    .line 446
    .line 447
    invoke-virtual/range {v14 .. v19}, La/chf0;->i0(La/i1g;JJ)V

    .line 448
    .line 449
    .line 450
    move-wide v10, v9

    .line 451
    move-wide v8, v7

    .line 452
    goto :goto_6

    .line 453
    :cond_f
    move-wide v10, v9

    .line 454
    move-wide v8, v7

    .line 455
    iget-object v7, v4, La/ukw;->z:La/chf0;

    .line 456
    .line 457
    invoke-static {v6}, Lorg/xplatform/cyber/section/api/domain/entity/d;->e(I)Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v12

    .line 461
    invoke-virtual/range {v7 .. v12}, La/chf0;->h0(JJLjava/lang/String;)V

    .line 462
    .line 463
    .line 464
    :goto_6
    iget-boolean v0, v0, La/shw;->b:Z

    .line 465
    .line 466
    move-object v5, v13

    .line 467
    check-cast v5, La/uzg;

    .line 468
    .line 469
    move-wide v7, v8

    .line 470
    move-wide v9, v10

    .line 471
    move v11, v0

    .line 472
    invoke-virtual/range {v5 .. v11}, La/uzg;->e(IJJZ)V

    .line 473
    .line 474
    .line 475
    goto/16 :goto_35

    .line 476
    .line 477
    :cond_10
    instance-of v15, v0, La/qgw;

    .line 478
    .line 479
    if-eqz v15, :cond_24

    .line 480
    .line 481
    check-cast v0, La/qgw;

    .line 482
    .line 483
    sget v1, La/ukw;->X:I

    .line 484
    .line 485
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 486
    .line 487
    .line 488
    move-result-object v1

    .line 489
    check-cast v1, La/zjw;

    .line 490
    .line 491
    iget-object v1, v1, La/zjw;->h:Ljava/util/Map;

    .line 492
    .line 493
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    check-cast v2, La/zjw;

    .line 498
    .line 499
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 500
    .line 501
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 502
    .line 503
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v1

    .line 507
    check-cast v1, La/jih;

    .line 508
    .line 509
    if-eqz v1, :cond_85

    .line 510
    .line 511
    iget-object v1, v1, La/jih;->a:Ljava/lang/Object;

    .line 512
    .line 513
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 514
    .line 515
    instance-of v2, v1, La/g0g0;

    .line 516
    .line 517
    if-eqz v2, :cond_11

    .line 518
    .line 519
    const/4 v1, 0x0

    .line 520
    :cond_11
    check-cast v1, Ljava/util/List;

    .line 521
    .line 522
    if-eqz v1, :cond_85

    .line 523
    .line 524
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object v1

    .line 528
    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 529
    .line 530
    .line 531
    move-result v2

    .line 532
    if-eqz v2, :cond_13

    .line 533
    .line 534
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 535
    .line 536
    .line 537
    move-result-object v2

    .line 538
    move-object v3, v2

    .line 539
    check-cast v3, La/uog;

    .line 540
    .line 541
    iget v3, v3, La/uog;->a:I

    .line 542
    .line 543
    iget v5, v0, La/qgw;->a:I

    .line 544
    .line 545
    if-ne v3, v5, :cond_12

    .line 546
    .line 547
    goto :goto_7

    .line 548
    :cond_13
    const/4 v2, 0x0

    .line 549
    :goto_7
    check-cast v2, La/uog;

    .line 550
    .line 551
    if-eqz v2, :cond_85

    .line 552
    .line 553
    iget v1, v2, La/uog;->a:I

    .line 554
    .line 555
    iget-object v3, v2, La/uog;->g:Ljava/lang/String;

    .line 556
    .line 557
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v5

    .line 561
    check-cast v5, La/zjw;

    .line 562
    .line 563
    iget-object v5, v5, La/zjw;->h:Ljava/util/Map;

    .line 564
    .line 565
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v6

    .line 569
    check-cast v6, La/zjw;

    .line 570
    .line 571
    iget-object v6, v6, La/zjw;->g:La/ekw;

    .line 572
    .line 573
    iget-object v6, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 574
    .line 575
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    move-result-object v5

    .line 579
    check-cast v5, La/jih;

    .line 580
    .line 581
    if-eqz v5, :cond_15

    .line 582
    .line 583
    iget-object v5, v5, La/jih;->a:Ljava/lang/Object;

    .line 584
    .line 585
    instance-of v6, v5, La/g0g0;

    .line 586
    .line 587
    if-eqz v6, :cond_14

    .line 588
    .line 589
    const/4 v5, 0x0

    .line 590
    :cond_14
    check-cast v5, Ljava/util/List;

    .line 591
    .line 592
    if-eqz v5, :cond_15

    .line 593
    .line 594
    invoke-interface {v5, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 595
    .line 596
    .line 597
    move-result v5

    .line 598
    move/from16 v19, v5

    .line 599
    .line 600
    goto :goto_8

    .line 601
    :cond_15
    move/from16 v19, v14

    .line 602
    .line 603
    :goto_8
    iget-object v0, v0, La/qgw;->b:Ljava/lang/String;

    .line 604
    .line 605
    invoke-static {v3}, La/c3x;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v20

    .line 609
    sget-object v5, La/oo5;->b:La/bj5;

    .line 610
    .line 611
    iget-byte v6, v2, La/uog;->i:B

    .line 612
    .line 613
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 614
    .line 615
    .line 616
    move-result-object v6

    .line 617
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 618
    .line 619
    .line 620
    invoke-static {v6}, La/bj5;->c(Ljava/lang/Integer;)La/oo5;

    .line 621
    .line 622
    .line 623
    move-result-object v5

    .line 624
    if-nez v5, :cond_16

    .line 625
    .line 626
    sget-object v5, La/oo5;->d:La/oo5;

    .line 627
    .line 628
    :cond_16
    invoke-static {v5, v0}, La/ks60;->a(La/oo5;Ljava/lang/String;)Ljava/lang/Integer;

    .line 629
    .line 630
    .line 631
    move-result-object v0

    .line 632
    iget-object v5, v4, La/ukw;->y:La/zr1;

    .line 633
    .line 634
    iget v6, v2, La/uog;->a:I

    .line 635
    .line 636
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    move-result-object v7

    .line 640
    check-cast v7, La/zjw;

    .line 641
    .line 642
    iget-boolean v7, v7, La/zjw;->f:Z

    .line 643
    .line 644
    if-eqz v7, :cond_17

    .line 645
    .line 646
    sget-object v7, La/y1p;->b:La/y1p;

    .line 647
    .line 648
    const-string v7, "popular_new_esports"

    .line 649
    .line 650
    :goto_9
    move-object/from16 v21, v7

    .line 651
    .line 652
    goto :goto_a

    .line 653
    :cond_17
    sget-object v7, La/y1p;->b:La/y1p;

    .line 654
    .line 655
    const-string v7, "cybersport_main"

    .line 656
    .line 657
    goto :goto_9

    .line 658
    :goto_a
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v7

    .line 662
    check-cast v7, La/zjw;

    .line 663
    .line 664
    iget-boolean v7, v7, La/zjw;->f:Z

    .line 665
    .line 666
    if-eqz v0, :cond_18

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 669
    .line 670
    .line 671
    move-result v8

    .line 672
    int-to-float v8, v8

    .line 673
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 674
    .line 675
    .line 676
    move-result-object v8

    .line 677
    move-object/from16 v23, v8

    .line 678
    .line 679
    :goto_b
    move-object/from16 v17, v5

    .line 680
    .line 681
    move/from16 v18, v6

    .line 682
    .line 683
    move/from16 v22, v7

    .line 684
    .line 685
    goto :goto_c

    .line 686
    :cond_18
    const/16 v23, 0x0

    .line 687
    .line 688
    goto :goto_b

    .line 689
    :goto_c
    invoke-virtual/range {v17 .. v23}, La/zr1;->b(IILjava/lang/String;Ljava/lang/String;ZLjava/lang/Float;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v5

    .line 696
    check-cast v5, La/zjw;

    .line 697
    .line 698
    iget-boolean v5, v5, La/zjw;->f:Z

    .line 699
    .line 700
    if-eqz v5, :cond_19

    .line 701
    .line 702
    iget-object v5, v4, La/ukw;->x:La/yo4;

    .line 703
    .line 704
    iget v6, v2, La/uog;->a:I

    .line 705
    .line 706
    const-string v22, "popular_new_esports"

    .line 707
    .line 708
    move-object/from16 v17, v5

    .line 709
    .line 710
    move/from16 v18, v6

    .line 711
    .line 712
    move-object/from16 v21, v20

    .line 713
    .line 714
    move-object/from16 v20, v0

    .line 715
    .line 716
    invoke-virtual/range {v17 .. v22}, La/yo4;->o(IILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 717
    .line 718
    .line 719
    :cond_19
    move/from16 v5, v19

    .line 720
    .line 721
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v0

    .line 725
    check-cast v0, La/zjw;

    .line 726
    .line 727
    iget-object v0, v0, La/zjw;->b:La/sff0;

    .line 728
    .line 729
    iget-boolean v0, v0, La/sff0;->O0:Z

    .line 730
    .line 731
    if-eqz v0, :cond_1d

    .line 732
    .line 733
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 734
    .line 735
    .line 736
    move-result v0

    .line 737
    if-lez v0, :cond_1a

    .line 738
    .line 739
    iget-object v0, v4, La/ukw;->A:La/grj;

    .line 740
    .line 741
    invoke-virtual {v0, v3}, La/grj;->a(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    goto :goto_f

    .line 745
    :cond_1a
    sget-object v0, La/mvc;->l:La/mvc;

    .line 746
    .line 747
    check-cast v13, La/uzg;

    .line 748
    .line 749
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    iget-object v3, v13, La/uzg;->a:La/oeg0;

    .line 753
    .line 754
    invoke-virtual {v3}, La/oeg0;->c()La/i1w0;

    .line 755
    .line 756
    .line 757
    move-result-object v3

    .line 758
    invoke-static {v3}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 759
    .line 760
    .line 761
    move-result-object v6

    .line 762
    new-instance v7, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;

    .line 763
    .line 764
    const/4 v8, 0x1

    .line 765
    invoke-direct {v7, v1, v5, v0, v8}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getCmsNewsMainScreen$1;-><init>(IILa/mvc;Z)V

    .line 766
    .line 767
    .line 768
    instance-of v0, v7, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 769
    .line 770
    if-eqz v0, :cond_1b

    .line 771
    .line 772
    new-instance v0, La/e1w0;

    .line 773
    .line 774
    check-cast v7, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 775
    .line 776
    invoke-direct {v0, v7}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 777
    .line 778
    .line 779
    new-instance v1, La/c8d;

    .line 780
    .line 781
    sget-object v5, La/y7d;->a:La/v7d;

    .line 782
    .line 783
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 784
    .line 785
    .line 786
    invoke-virtual {v6, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    goto :goto_d

    .line 790
    :cond_1b
    new-instance v0, La/w0w0;

    .line 791
    .line 792
    invoke-direct {v0, v7}, La/w0w0;-><init>(La/m7h0;)V

    .line 793
    .line 794
    .line 795
    new-instance v1, La/c8d;

    .line 796
    .line 797
    sget-object v5, La/y7d;->a:La/v7d;

    .line 798
    .line 799
    invoke-direct {v1, v5, v0}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 800
    .line 801
    .line 802
    invoke-virtual {v6, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 803
    .line 804
    .line 805
    :goto_d
    invoke-static {v3, v6, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 806
    .line 807
    .line 808
    move-result-object v0

    .line 809
    :goto_e
    move-object v1, v0

    .line 810
    check-cast v1, La/paw;

    .line 811
    .line 812
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 813
    .line 814
    .line 815
    move-result v5

    .line 816
    if-eqz v5, :cond_1c

    .line 817
    .line 818
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 819
    .line 820
    .line 821
    move-result-object v1

    .line 822
    check-cast v1, La/oe50;

    .line 823
    .line 824
    invoke-virtual {v3, v1}, La/i1w0;->a(La/oe50;)V

    .line 825
    .line 826
    .line 827
    goto :goto_e

    .line 828
    :cond_1c
    :goto_f
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 829
    .line 830
    .line 831
    move-result-object v5

    .line 832
    new-instance v9, La/rkw;

    .line 833
    .line 834
    const/4 v0, 0x0

    .line 835
    invoke-direct {v9, v4, v2, v0, v14}, La/rkw;-><init>(La/ukw;La/uog;La/yje;B)V

    .line 836
    .line 837
    .line 838
    const/16 v10, 0xf

    .line 839
    .line 840
    const/4 v6, 0x0

    .line 841
    const/4 v7, 0x0

    .line 842
    const/4 v8, 0x0

    .line 843
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 844
    .line 845
    .line 846
    goto/16 :goto_35

    .line 847
    .line 848
    :cond_1d
    iget-object v0, v2, La/uog;->h:Ljava/lang/String;

    .line 849
    .line 850
    sget-object v6, La/r1g;->b:La/r1g;

    .line 851
    .line 852
    invoke-virtual {v10, v1, v6}, La/ih5;->j(ILa/r1g;)V

    .line 853
    .line 854
    .line 855
    iget-boolean v6, v2, La/uog;->f:Z

    .line 856
    .line 857
    if-eqz v6, :cond_1e

    .line 858
    .line 859
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 860
    .line 861
    .line 862
    move-result v7

    .line 863
    if-lez v7, :cond_1e

    .line 864
    .line 865
    check-cast v13, La/uzg;

    .line 866
    .line 867
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 868
    .line 869
    .line 870
    iget-object v0, v13, La/uzg;->i:La/grj;

    .line 871
    .line 872
    invoke-virtual {v0, v3}, La/grj;->a(Ljava/lang/String;)V

    .line 873
    .line 874
    .line 875
    goto/16 :goto_14

    .line 876
    .line 877
    :cond_1e
    if-eqz v6, :cond_1f

    .line 878
    .line 879
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 880
    .line 881
    .line 882
    move-result v3

    .line 883
    if-lez v3, :cond_1f

    .line 884
    .line 885
    check-cast v13, La/uzg;

    .line 886
    .line 887
    invoke-virtual {v13, v0}, La/uzg;->m(Ljava/lang/String;)V

    .line 888
    .line 889
    .line 890
    goto/16 :goto_14

    .line 891
    .line 892
    :cond_1f
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    check-cast v0, La/zjw;

    .line 897
    .line 898
    iget-object v0, v0, La/zjw;->g:La/ekw;

    .line 899
    .line 900
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 901
    .line 902
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 903
    .line 904
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 905
    .line 906
    .line 907
    move-result v3

    .line 908
    if-eqz v3, :cond_20

    .line 909
    .line 910
    const/16 v0, 0x2d

    .line 911
    .line 912
    :goto_10
    move/from16 v20, v0

    .line 913
    .line 914
    goto :goto_11

    .line 915
    :cond_20
    sget-object v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 916
    .line 917
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    if-eqz v0, :cond_21

    .line 922
    .line 923
    const/16 v0, 0x56

    .line 924
    .line 925
    goto :goto_10

    .line 926
    :cond_21
    const/16 v0, 0x2e

    .line 927
    .line 928
    goto :goto_10

    .line 929
    :goto_11
    check-cast v13, La/uzg;

    .line 930
    .line 931
    iget-object v0, v13, La/uzg;->a:La/oeg0;

    .line 932
    .line 933
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 934
    .line 935
    .line 936
    move-result-object v0

    .line 937
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    new-instance v17, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;

    .line 942
    .line 943
    const/16 v21, 0x0

    .line 944
    .line 945
    const/16 v22, 0x1

    .line 946
    .line 947
    move/from16 v18, v1

    .line 948
    .line 949
    move/from16 v19, v5

    .line 950
    .line 951
    invoke-direct/range {v17 .. v22}, Lorg/xplatform/promotions/news/impl/navigation/PromotionsNewsScreenFactoryImpl$getNewsMainScreen$1;-><init>(IIIZZ)V

    .line 952
    .line 953
    .line 954
    move-object/from16 v1, v17

    .line 955
    .line 956
    instance-of v5, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 957
    .line 958
    if-eqz v5, :cond_22

    .line 959
    .line 960
    new-instance v5, La/e1w0;

    .line 961
    .line 962
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 963
    .line 964
    invoke-direct {v5, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 965
    .line 966
    .line 967
    new-instance v1, La/c8d;

    .line 968
    .line 969
    sget-object v6, La/y7d;->a:La/v7d;

    .line 970
    .line 971
    invoke-direct {v1, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 975
    .line 976
    .line 977
    goto :goto_12

    .line 978
    :cond_22
    new-instance v5, La/w0w0;

    .line 979
    .line 980
    invoke-direct {v5, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 981
    .line 982
    .line 983
    new-instance v1, La/c8d;

    .line 984
    .line 985
    sget-object v6, La/y7d;->a:La/v7d;

    .line 986
    .line 987
    invoke-direct {v1, v6, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 988
    .line 989
    .line 990
    invoke-virtual {v3, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 991
    .line 992
    .line 993
    :goto_12
    invoke-static {v0, v3, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    :goto_13
    move-object v3, v1

    .line 998
    check-cast v3, La/paw;

    .line 999
    .line 1000
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 1001
    .line 1002
    .line 1003
    move-result v5

    .line 1004
    if-eqz v5, :cond_23

    .line 1005
    .line 1006
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    check-cast v3, La/oe50;

    .line 1011
    .line 1012
    invoke-virtual {v0, v3}, La/i1w0;->a(La/oe50;)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_13

    .line 1016
    :cond_23
    :goto_14
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v5

    .line 1020
    new-instance v9, La/rkw;

    .line 1021
    .line 1022
    const/4 v0, 0x1

    .line 1023
    const/4 v1, 0x0

    .line 1024
    invoke-direct {v9, v4, v2, v1, v0}, La/rkw;-><init>(La/ukw;La/uog;La/yje;B)V

    .line 1025
    .line 1026
    .line 1027
    const/16 v10, 0xf

    .line 1028
    .line 1029
    const/4 v6, 0x0

    .line 1030
    const/4 v7, 0x0

    .line 1031
    const/4 v8, 0x0

    .line 1032
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1033
    .line 1034
    .line 1035
    goto/16 :goto_35

    .line 1036
    .line 1037
    :cond_24
    instance-of v15, v0, La/jgw;

    .line 1038
    .line 1039
    if-eqz v15, :cond_25

    .line 1040
    .line 1041
    sget v0, La/ukw;->X:I

    .line 1042
    .line 1043
    invoke-virtual {v4}, La/ukw;->Q()V

    .line 1044
    .line 1045
    .line 1046
    goto/16 :goto_35

    .line 1047
    .line 1048
    :cond_25
    instance-of v15, v0, La/zgw;

    .line 1049
    .line 1050
    if-eqz v15, :cond_30

    .line 1051
    .line 1052
    check-cast v0, La/zgw;

    .line 1053
    .line 1054
    sget v1, La/ukw;->X:I

    .line 1055
    .line 1056
    iget-wide v0, v0, La/zgw;->a:J

    .line 1057
    .line 1058
    const-wide/16 v2, -0xa

    .line 1059
    .line 1060
    cmp-long v2, v0, v2

    .line 1061
    .line 1062
    if-nez v2, :cond_27

    .line 1063
    .line 1064
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v0

    .line 1068
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v1

    .line 1072
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1073
    .line 1074
    .line 1075
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;

    .line 1076
    .line 1077
    invoke-direct {v2, v8}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;-><init>(La/vqc;)V

    .line 1078
    .line 1079
    .line 1080
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1081
    .line 1082
    if-eqz v3, :cond_26

    .line 1083
    .line 1084
    new-instance v3, La/e1w0;

    .line 1085
    .line 1086
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1087
    .line 1088
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1089
    .line 1090
    .line 1091
    new-instance v2, La/c8d;

    .line 1092
    .line 1093
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1094
    .line 1095
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1099
    .line 1100
    .line 1101
    goto :goto_15

    .line 1102
    :cond_26
    new-instance v3, La/w0w0;

    .line 1103
    .line 1104
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 1105
    .line 1106
    .line 1107
    new-instance v2, La/c8d;

    .line 1108
    .line 1109
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1110
    .line 1111
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1115
    .line 1116
    .line 1117
    :goto_15
    invoke-static {v0, v1, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1118
    .line 1119
    .line 1120
    move-result-object v1

    .line 1121
    :goto_16
    move-object v2, v1

    .line 1122
    check-cast v2, La/paw;

    .line 1123
    .line 1124
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 1125
    .line 1126
    .line 1127
    move-result v3

    .line 1128
    if-eqz v3, :cond_85

    .line 1129
    .line 1130
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v2

    .line 1134
    check-cast v2, La/oe50;

    .line 1135
    .line 1136
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_16

    .line 1140
    :cond_27
    const-wide/16 v2, -0xb

    .line 1141
    .line 1142
    cmp-long v2, v0, v2

    .line 1143
    .line 1144
    if-nez v2, :cond_28

    .line 1145
    .line 1146
    invoke-virtual {v4}, La/ukw;->Q()V

    .line 1147
    .line 1148
    .line 1149
    goto/16 :goto_35

    .line 1150
    .line 1151
    :cond_28
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v2

    .line 1155
    check-cast v2, La/zjw;

    .line 1156
    .line 1157
    iget-object v2, v2, La/zjw;->h:Ljava/util/Map;

    .line 1158
    .line 1159
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1160
    .line 1161
    .line 1162
    move-result-object v3

    .line 1163
    check-cast v3, La/zjw;

    .line 1164
    .line 1165
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 1166
    .line 1167
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1168
    .line 1169
    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1170
    .line 1171
    .line 1172
    move-result-object v2

    .line 1173
    check-cast v2, La/jih;

    .line 1174
    .line 1175
    if-eqz v2, :cond_85

    .line 1176
    .line 1177
    iget-object v2, v2, La/jih;->b:Ljava/lang/Object;

    .line 1178
    .line 1179
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 1180
    .line 1181
    instance-of v3, v2, La/g0g0;

    .line 1182
    .line 1183
    if-eqz v3, :cond_29

    .line 1184
    .line 1185
    const/4 v2, 0x0

    .line 1186
    :cond_29
    check-cast v2, Ljava/util/List;

    .line 1187
    .line 1188
    if-eqz v2, :cond_85

    .line 1189
    .line 1190
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v2

    .line 1194
    :cond_2a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v3

    .line 1198
    if-eqz v3, :cond_2b

    .line 1199
    .line 1200
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v3

    .line 1204
    move-object v5, v3

    .line 1205
    check-cast v5, La/ypl0;

    .line 1206
    .line 1207
    iget-wide v5, v5, La/ypl0;->a:J

    .line 1208
    .line 1209
    cmp-long v5, v5, v0

    .line 1210
    .line 1211
    if-nez v5, :cond_2a

    .line 1212
    .line 1213
    move-object v15, v3

    .line 1214
    goto :goto_17

    .line 1215
    :cond_2b
    const/4 v15, 0x0

    .line 1216
    :goto_17
    check-cast v15, La/ypl0;

    .line 1217
    .line 1218
    if-eqz v15, :cond_85

    .line 1219
    .line 1220
    iget-wide v0, v15, La/ypl0;->a:J

    .line 1221
    .line 1222
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v2

    .line 1226
    check-cast v2, La/zjw;

    .line 1227
    .line 1228
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1229
    .line 1230
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1231
    .line 1232
    invoke-static {v0, v1, v2}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v2

    .line 1236
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 1237
    .line 1238
    check-cast v3, Ljava/lang/Number;

    .line 1239
    .line 1240
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 1241
    .line 1242
    .line 1243
    move-result-wide v6

    .line 1244
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 1245
    .line 1246
    check-cast v2, Ljava/lang/Number;

    .line 1247
    .line 1248
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 1249
    .line 1250
    .line 1251
    move-result-wide v8

    .line 1252
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v2

    .line 1256
    check-cast v2, La/zjw;

    .line 1257
    .line 1258
    iget-boolean v2, v2, La/zjw;->f:Z

    .line 1259
    .line 1260
    if-eqz v2, :cond_2c

    .line 1261
    .line 1262
    sget-object v2, La/r1g;->h:La/r1g;

    .line 1263
    .line 1264
    :goto_18
    move-object v10, v2

    .line 1265
    goto :goto_19

    .line 1266
    :cond_2c
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1267
    .line 1268
    .line 1269
    move-result-object v2

    .line 1270
    check-cast v2, La/zjw;

    .line 1271
    .line 1272
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1273
    .line 1274
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1275
    .line 1276
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1277
    .line 1278
    if-eqz v2, :cond_2d

    .line 1279
    .line 1280
    sget-object v2, La/r1g;->k:La/r1g;

    .line 1281
    .line 1282
    goto :goto_18

    .line 1283
    :cond_2d
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v2

    .line 1287
    check-cast v2, La/zjw;

    .line 1288
    .line 1289
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1290
    .line 1291
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1292
    .line 1293
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1294
    .line 1295
    if-eqz v2, :cond_2e

    .line 1296
    .line 1297
    sget-object v2, La/r1g;->l:La/r1g;

    .line 1298
    .line 1299
    goto :goto_18

    .line 1300
    :cond_2e
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v2

    .line 1304
    check-cast v2, La/zjw;

    .line 1305
    .line 1306
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1307
    .line 1308
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1309
    .line 1310
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1311
    .line 1312
    if-eqz v2, :cond_2f

    .line 1313
    .line 1314
    sget-object v2, La/r1g;->c:La/r1g;

    .line 1315
    .line 1316
    goto :goto_18

    .line 1317
    :goto_19
    iget-object v5, v4, La/ukw;->w:La/ih5;

    .line 1318
    .line 1319
    const/4 v11, 0x0

    .line 1320
    const/4 v12, 0x0

    .line 1321
    invoke-virtual/range {v5 .. v12}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 1322
    .line 1323
    .line 1324
    iget-object v5, v4, La/ukw;->y:La/zr1;

    .line 1325
    .line 1326
    iget-object v10, v10, La/r1g;->a:Ljava/lang/String;

    .line 1327
    .line 1328
    invoke-virtual/range {v5 .. v12}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 1329
    .line 1330
    .line 1331
    :cond_2f
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v2

    .line 1335
    check-cast v2, La/zjw;

    .line 1336
    .line 1337
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1338
    .line 1339
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1340
    .line 1341
    sget-object v3, La/k1g;->b:La/k1g;

    .line 1342
    .line 1343
    check-cast v13, La/uzg;

    .line 1344
    .line 1345
    invoke-virtual {v13, v0, v1, v2, v3}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 1346
    .line 1347
    .line 1348
    goto/16 :goto_35

    .line 1349
    .line 1350
    :cond_30
    instance-of v15, v0, La/kgw;

    .line 1351
    .line 1352
    if-eqz v15, :cond_31

    .line 1353
    .line 1354
    sget v0, La/ukw;->X:I

    .line 1355
    .line 1356
    iget-object v0, v9, La/zr1;->a:La/s1p;

    .line 1357
    .line 1358
    sget-object v2, La/xun;->a:La/xun;

    .line 1359
    .line 1360
    const-wide/16 v3, 0x2ef5

    .line 1361
    .line 1362
    invoke-virtual {v0, v2, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1363
    .line 1364
    .line 1365
    iget-object v0, v10, La/ih5;->a:La/kt2;

    .line 1366
    .line 1367
    invoke-interface {v0, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 1368
    .line 1369
    .line 1370
    check-cast v13, La/uzg;

    .line 1371
    .line 1372
    invoke-virtual {v13, v12}, La/uzg;->i(Ljava/lang/String;)V

    .line 1373
    .line 1374
    .line 1375
    goto/16 :goto_35

    .line 1376
    .line 1377
    :cond_31
    instance-of v12, v0, La/nhw;

    .line 1378
    .line 1379
    if-eqz v12, :cond_32

    .line 1380
    .line 1381
    check-cast v0, La/nhw;

    .line 1382
    .line 1383
    sget v2, La/ukw;->X:I

    .line 1384
    .line 1385
    iget-object v2, v9, La/zr1;->a:La/s1p;

    .line 1386
    .line 1387
    sget-object v3, La/xun;->a:La/xun;

    .line 1388
    .line 1389
    const-wide/16 v4, 0x2ef5

    .line 1390
    .line 1391
    invoke-virtual {v2, v3, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1392
    .line 1393
    .line 1394
    iget-object v2, v10, La/ih5;->a:La/kt2;

    .line 1395
    .line 1396
    invoke-interface {v2, v1}, La/kt2;->c(Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    iget-object v0, v0, La/nhw;->a:Ljava/lang/String;

    .line 1400
    .line 1401
    check-cast v13, La/uzg;

    .line 1402
    .line 1403
    invoke-virtual {v13, v0}, La/uzg;->i(Ljava/lang/String;)V

    .line 1404
    .line 1405
    .line 1406
    goto/16 :goto_35

    .line 1407
    .line 1408
    :cond_32
    instance-of v1, v0, La/hhw;

    .line 1409
    .line 1410
    if-eqz v1, :cond_33

    .line 1411
    .line 1412
    sget v0, La/ukw;->X:I

    .line 1413
    .line 1414
    invoke-virtual {v4}, La/ukw;->U()V

    .line 1415
    .line 1416
    .line 1417
    goto/16 :goto_35

    .line 1418
    .line 1419
    :cond_33
    instance-of v1, v0, La/rgw;

    .line 1420
    .line 1421
    if-eqz v1, :cond_34

    .line 1422
    .line 1423
    sget v0, La/ukw;->X:I

    .line 1424
    .line 1425
    invoke-virtual {v4}, La/ukw;->S()V

    .line 1426
    .line 1427
    .line 1428
    goto/16 :goto_35

    .line 1429
    .line 1430
    :cond_34
    instance-of v1, v0, La/xgw;

    .line 1431
    .line 1432
    if-eqz v1, :cond_40

    .line 1433
    .line 1434
    check-cast v0, La/xgw;

    .line 1435
    .line 1436
    iget-wide v0, v0, La/xgw;->a:J

    .line 1437
    .line 1438
    sget v5, La/ukw;->X:I

    .line 1439
    .line 1440
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1441
    .line 1442
    .line 1443
    move-result-object v5

    .line 1444
    check-cast v5, La/zjw;

    .line 1445
    .line 1446
    iget-object v5, v5, La/zjw;->h:Ljava/util/Map;

    .line 1447
    .line 1448
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1449
    .line 1450
    .line 1451
    move-result-object v6

    .line 1452
    check-cast v6, La/zjw;

    .line 1453
    .line 1454
    iget-object v6, v6, La/zjw;->g:La/ekw;

    .line 1455
    .line 1456
    iget-object v6, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1457
    .line 1458
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1459
    .line 1460
    .line 1461
    move-result-object v5

    .line 1462
    check-cast v5, La/jih;

    .line 1463
    .line 1464
    if-eqz v5, :cond_85

    .line 1465
    .line 1466
    iget-object v6, v5, La/jih;->f:Ljava/lang/Object;

    .line 1467
    .line 1468
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 1469
    .line 1470
    instance-of v7, v6, La/g0g0;

    .line 1471
    .line 1472
    if-eqz v7, :cond_35

    .line 1473
    .line 1474
    const/4 v6, 0x0

    .line 1475
    :cond_35
    check-cast v6, Ljava/util/List;

    .line 1476
    .line 1477
    if-nez v6, :cond_36

    .line 1478
    .line 1479
    sget-object v6, La/iun;->a:La/iun;

    .line 1480
    .line 1481
    :cond_36
    iget-object v5, v5, La/jih;->g:Ljava/lang/Object;

    .line 1482
    .line 1483
    instance-of v7, v5, La/g0g0;

    .line 1484
    .line 1485
    if-eqz v7, :cond_37

    .line 1486
    .line 1487
    const/4 v5, 0x0

    .line 1488
    :cond_37
    check-cast v5, Ljava/util/List;

    .line 1489
    .line 1490
    if-nez v5, :cond_38

    .line 1491
    .line 1492
    sget-object v5, La/iun;->a:La/iun;

    .line 1493
    .line 1494
    :cond_38
    invoke-static {v6, v5}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v5

    .line 1502
    :cond_39
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1503
    .line 1504
    .line 1505
    move-result v6

    .line 1506
    if-eqz v6, :cond_3a

    .line 1507
    .line 1508
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v6

    .line 1512
    move-object v7, v6

    .line 1513
    check-cast v7, La/nyg;

    .line 1514
    .line 1515
    iget-wide v7, v7, La/nyg;->g:J

    .line 1516
    .line 1517
    cmp-long v7, v7, v0

    .line 1518
    .line 1519
    if-nez v7, :cond_39

    .line 1520
    .line 1521
    goto :goto_1a

    .line 1522
    :cond_3a
    const/4 v6, 0x0

    .line 1523
    :goto_1a
    move-object v14, v6

    .line 1524
    check-cast v14, La/nyg;

    .line 1525
    .line 1526
    if-eqz v14, :cond_85

    .line 1527
    .line 1528
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v5

    .line 1532
    check-cast v5, La/zjw;

    .line 1533
    .line 1534
    iget-object v5, v5, La/zjw;->b:La/sff0;

    .line 1535
    .line 1536
    iget-object v5, v5, La/sff0;->c:La/ech;

    .line 1537
    .line 1538
    iget-object v5, v5, La/ech;->p:Ljava/util/List;

    .line 1539
    .line 1540
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1545
    .line 1546
    .line 1547
    move-result v0

    .line 1548
    iget-object v1, v3, La/luu;->a:La/nok0;

    .line 1549
    .line 1550
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v1

    .line 1554
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v1

    .line 1558
    :cond_3b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1559
    .line 1560
    .line 1561
    move-result v3

    .line 1562
    if-eqz v3, :cond_3c

    .line 1563
    .line 1564
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1565
    .line 1566
    .line 1567
    move-result-object v3

    .line 1568
    move-object v5, v3

    .line 1569
    check-cast v5, La/lok0;

    .line 1570
    .line 1571
    iget v6, v5, La/lok0;->a:I

    .line 1572
    .line 1573
    iget v7, v14, La/nyg;->h:I

    .line 1574
    .line 1575
    if-ne v6, v7, :cond_3b

    .line 1576
    .line 1577
    iget-object v5, v5, La/lok0;->t:Ljava/util/List;

    .line 1578
    .line 1579
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 1580
    .line 1581
    .line 1582
    move-result v5

    .line 1583
    if-eqz v5, :cond_3b

    .line 1584
    .line 1585
    move-object v15, v3

    .line 1586
    goto :goto_1b

    .line 1587
    :cond_3c
    const/4 v15, 0x0

    .line 1588
    :goto_1b
    check-cast v15, La/lok0;

    .line 1589
    .line 1590
    iget-wide v1, v14, La/nyg;->i:J

    .line 1591
    .line 1592
    cmp-long v3, v1, v21

    .line 1593
    .line 1594
    if-nez v3, :cond_3d

    .line 1595
    .line 1596
    iget-wide v1, v14, La/nyg;->l:J

    .line 1597
    .line 1598
    :cond_3d
    if-eqz v0, :cond_3e

    .line 1599
    .line 1600
    check-cast v13, La/uzg;

    .line 1601
    .line 1602
    invoke-virtual {v13}, La/uzg;->g()V

    .line 1603
    .line 1604
    .line 1605
    goto/16 :goto_35

    .line 1606
    .line 1607
    :cond_3e
    if-eqz v15, :cond_3f

    .line 1608
    .line 1609
    iget v0, v15, La/lok0;->a:I

    .line 1610
    .line 1611
    int-to-long v5, v0

    .line 1612
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v0

    .line 1616
    check-cast v0, La/zjw;

    .line 1617
    .line 1618
    iget-boolean v11, v0, La/zjw;->f:Z

    .line 1619
    .line 1620
    iget-wide v7, v15, La/lok0;->f:J

    .line 1621
    .line 1622
    iget-wide v9, v15, La/lok0;->g:J

    .line 1623
    .line 1624
    iget-boolean v12, v14, La/nyg;->m:Z

    .line 1625
    .line 1626
    invoke-virtual/range {v4 .. v12}, La/ukw;->N(JJJZZ)V

    .line 1627
    .line 1628
    .line 1629
    iget-object v0, v15, La/lok0;->b:Ljava/lang/String;

    .line 1630
    .line 1631
    check-cast v13, La/uzg;

    .line 1632
    .line 1633
    invoke-virtual {v13, v5, v6, v0}, La/uzg;->o(JLjava/lang/String;)V

    .line 1634
    .line 1635
    .line 1636
    goto/16 :goto_35

    .line 1637
    .line 1638
    :cond_3f
    iget-wide v5, v14, La/nyg;->g:J

    .line 1639
    .line 1640
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v0

    .line 1644
    check-cast v0, La/zjw;

    .line 1645
    .line 1646
    iget-boolean v11, v0, La/zjw;->f:Z

    .line 1647
    .line 1648
    iget-wide v7, v14, La/nyg;->i:J

    .line 1649
    .line 1650
    iget-wide v9, v14, La/nyg;->l:J

    .line 1651
    .line 1652
    iget-boolean v12, v14, La/nyg;->m:Z

    .line 1653
    .line 1654
    invoke-virtual/range {v4 .. v12}, La/ukw;->N(JJJZZ)V

    .line 1655
    .line 1656
    .line 1657
    iget-wide v9, v14, La/nyg;->g:J

    .line 1658
    .line 1659
    iget-object v6, v14, La/nyg;->f:Ljava/lang/String;

    .line 1660
    .line 1661
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v0

    .line 1665
    check-cast v0, La/zjw;

    .line 1666
    .line 1667
    iget-object v0, v0, La/zjw;->g:La/ekw;

    .line 1668
    .line 1669
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1670
    .line 1671
    iget-byte v11, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 1672
    .line 1673
    sget-object v0, La/k1g;->b:La/k1g;

    .line 1674
    .line 1675
    move-object v5, v13

    .line 1676
    check-cast v5, La/uzg;

    .line 1677
    .line 1678
    move-wide v7, v1

    .line 1679
    invoke-virtual/range {v5 .. v11}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 1680
    .line 1681
    .line 1682
    goto/16 :goto_35

    .line 1683
    .line 1684
    :cond_40
    instance-of v1, v0, La/lhw;

    .line 1685
    .line 1686
    if-eqz v1, :cond_42

    .line 1687
    .line 1688
    move-object v1, v0

    .line 1689
    check-cast v1, La/lhw;

    .line 1690
    .line 1691
    sget v0, La/ukw;->X:I

    .line 1692
    .line 1693
    iget-object v7, v7, La/ocj;->a:La/p7m0;

    .line 1694
    .line 1695
    :cond_41
    invoke-virtual {v7}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1696
    .line 1697
    .line 1698
    move-result-object v0

    .line 1699
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1700
    .line 1701
    .line 1702
    move-object v8, v0

    .line 1703
    check-cast v8, La/zjw;

    .line 1704
    .line 1705
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1706
    .line 1707
    .line 1708
    iget-object v2, v8, La/zjw;->l:Ljava/util/Map;

    .line 1709
    .line 1710
    invoke-static {v2}, La/xp20;->p(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 1711
    .line 1712
    .line 1713
    move-result-object v15

    .line 1714
    iget-object v2, v8, La/zjw;->g:La/ekw;

    .line 1715
    .line 1716
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1717
    .line 1718
    iget-object v3, v1, La/lhw;->a:La/sip;

    .line 1719
    .line 1720
    invoke-interface {v15, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1721
    .line 1722
    .line 1723
    const/16 v20, 0x0

    .line 1724
    .line 1725
    const v21, 0x7f7ff

    .line 1726
    .line 1727
    .line 1728
    const/4 v9, 0x0

    .line 1729
    const/4 v10, 0x0

    .line 1730
    const/4 v11, 0x0

    .line 1731
    const/4 v12, 0x0

    .line 1732
    const/4 v13, 0x0

    .line 1733
    const/4 v14, 0x0

    .line 1734
    const/16 v16, 0x0

    .line 1735
    .line 1736
    const/16 v17, 0x0

    .line 1737
    .line 1738
    const/16 v18, 0x0

    .line 1739
    .line 1740
    const/16 v19, 0x0

    .line 1741
    .line 1742
    invoke-static/range {v8 .. v21}, La/zjw;->a(La/zjw;Ljava/util/List;La/ekw;Ljava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;ZLjava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;Ljava/util/LinkedHashMap;I)La/zjw;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v2

    .line 1746
    invoke-virtual {v7, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1747
    .line 1748
    .line 1749
    move-result v0

    .line 1750
    if-eqz v0, :cond_41

    .line 1751
    .line 1752
    goto/16 :goto_35

    .line 1753
    .line 1754
    :cond_42
    instance-of v1, v0, La/rhw;

    .line 1755
    .line 1756
    const/4 v6, 0x2

    .line 1757
    if-eqz v1, :cond_4b

    .line 1758
    .line 1759
    check-cast v0, La/rhw;

    .line 1760
    .line 1761
    iget v1, v0, La/rhw;->a:I

    .line 1762
    .line 1763
    sget v2, La/ukw;->X:I

    .line 1764
    .line 1765
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v2

    .line 1769
    check-cast v2, La/zjw;

    .line 1770
    .line 1771
    iget-boolean v2, v2, La/zjw;->f:Z

    .line 1772
    .line 1773
    if-eqz v2, :cond_43

    .line 1774
    .line 1775
    sget-object v3, La/r1g;->g:La/r1g;

    .line 1776
    .line 1777
    goto :goto_1c

    .line 1778
    :cond_43
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v3

    .line 1782
    check-cast v3, La/zjw;

    .line 1783
    .line 1784
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 1785
    .line 1786
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1787
    .line 1788
    instance-of v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1789
    .line 1790
    if-eqz v3, :cond_44

    .line 1791
    .line 1792
    sget-object v3, La/r1g;->k:La/r1g;

    .line 1793
    .line 1794
    goto :goto_1c

    .line 1795
    :cond_44
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v3

    .line 1799
    check-cast v3, La/zjw;

    .line 1800
    .line 1801
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 1802
    .line 1803
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1804
    .line 1805
    instance-of v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1806
    .line 1807
    if-eqz v3, :cond_45

    .line 1808
    .line 1809
    sget-object v3, La/r1g;->l:La/r1g;

    .line 1810
    .line 1811
    goto :goto_1c

    .line 1812
    :cond_45
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1813
    .line 1814
    .line 1815
    move-result-object v3

    .line 1816
    check-cast v3, La/zjw;

    .line 1817
    .line 1818
    iget-object v3, v3, La/zjw;->g:La/ekw;

    .line 1819
    .line 1820
    iget-object v3, v3, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1821
    .line 1822
    instance-of v3, v3, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1823
    .line 1824
    if-eqz v3, :cond_49

    .line 1825
    .line 1826
    sget-object v3, La/r1g;->d:La/r1g;

    .line 1827
    .line 1828
    :goto_1c
    if-eqz v2, :cond_46

    .line 1829
    .line 1830
    sget-object v2, La/r1g;->g:La/r1g;

    .line 1831
    .line 1832
    goto :goto_1d

    .line 1833
    :cond_46
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1834
    .line 1835
    .line 1836
    move-result-object v2

    .line 1837
    check-cast v2, La/zjw;

    .line 1838
    .line 1839
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1840
    .line 1841
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1842
    .line 1843
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 1844
    .line 1845
    if-eqz v2, :cond_47

    .line 1846
    .line 1847
    sget-object v2, La/r1g;->k:La/r1g;

    .line 1848
    .line 1849
    goto :goto_1d

    .line 1850
    :cond_47
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v2

    .line 1854
    check-cast v2, La/zjw;

    .line 1855
    .line 1856
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1857
    .line 1858
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1859
    .line 1860
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 1861
    .line 1862
    if-eqz v2, :cond_48

    .line 1863
    .line 1864
    sget-object v2, La/r1g;->l:La/r1g;

    .line 1865
    .line 1866
    goto :goto_1d

    .line 1867
    :cond_48
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 1868
    .line 1869
    .line 1870
    move-result-object v2

    .line 1871
    check-cast v2, La/zjw;

    .line 1872
    .line 1873
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 1874
    .line 1875
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 1876
    .line 1877
    instance-of v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$OneXCyber;

    .line 1878
    .line 1879
    if-eqz v2, :cond_49

    .line 1880
    .line 1881
    sget-object v2, La/r1g;->d:La/r1g;

    .line 1882
    .line 1883
    :goto_1d
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1884
    .line 1885
    .line 1886
    iget-object v5, v10, La/ih5;->a:La/kt2;

    .line 1887
    .line 1888
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1889
    .line 1890
    .line 1891
    move-result-object v7

    .line 1892
    new-instance v8, Lkotlin/Pair;

    .line 1893
    .line 1894
    const-string v10, "championship_id"

    .line 1895
    .line 1896
    invoke-direct {v8, v10, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1897
    .line 1898
    .line 1899
    iget-object v3, v3, La/r1g;->a:Ljava/lang/String;

    .line 1900
    .line 1901
    new-instance v7, Lkotlin/Pair;

    .line 1902
    .line 1903
    const-string v10, "screen"

    .line 1904
    .line 1905
    invoke-direct {v7, v10, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1906
    .line 1907
    .line 1908
    filled-new-array {v8, v7}, [Lkotlin/Pair;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v3

    .line 1912
    invoke-static {v3}, La/xp20;->f([Lkotlin/Pair;)Ljava/util/Map;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v3

    .line 1916
    const-string v7, "cyber_champ_call"

    .line 1917
    .line 1918
    invoke-interface {v5, v7, v3}, La/kt2;->a(Ljava/lang/String;Ljava/util/Map;)V

    .line 1919
    .line 1920
    .line 1921
    iget-object v2, v2, La/r1g;->a:Ljava/lang/String;

    .line 1922
    .line 1923
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1924
    .line 1925
    .line 1926
    iget-object v3, v9, La/zr1;->a:La/s1p;

    .line 1927
    .line 1928
    new-instance v5, La/i1p;

    .line 1929
    .line 1930
    invoke-direct {v5, v1, v6}, La/i1p;-><init>(IB)V

    .line 1931
    .line 1932
    .line 1933
    new-instance v7, La/j1p;

    .line 1934
    .line 1935
    invoke-direct {v7, v2, v14}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1936
    .line 1937
    .line 1938
    new-array v2, v6, [La/k1p;

    .line 1939
    .line 1940
    aput-object v5, v2, v14

    .line 1941
    .line 1942
    const/16 v16, 0x1

    .line 1943
    .line 1944
    aput-object v7, v2, v16

    .line 1945
    .line 1946
    invoke-static {v2}, La/tx3;->l0([Ljava/lang/Object;)Ljava/util/Set;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v2

    .line 1950
    const-wide/16 v5, 0x2b5e

    .line 1951
    .line 1952
    invoke-virtual {v3, v2, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1953
    .line 1954
    .line 1955
    :cond_49
    iget-object v2, v4, La/ukw;->F:La/y3v;

    .line 1956
    .line 1957
    iget-object v0, v0, La/rhw;->b:Ljava/lang/String;

    .line 1958
    .line 1959
    invoke-virtual {v2, v1, v0}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1960
    .line 1961
    .line 1962
    move-result-object v0

    .line 1963
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 1964
    .line 1965
    .line 1966
    move-result-object v1

    .line 1967
    invoke-static {v1}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v2

    .line 1971
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1972
    .line 1973
    if-eqz v3, :cond_4a

    .line 1974
    .line 1975
    new-instance v3, La/e1w0;

    .line 1976
    .line 1977
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1978
    .line 1979
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1980
    .line 1981
    .line 1982
    new-instance v0, La/c8d;

    .line 1983
    .line 1984
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1985
    .line 1986
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1987
    .line 1988
    .line 1989
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1990
    .line 1991
    .line 1992
    goto :goto_1e

    .line 1993
    :cond_4a
    new-instance v3, La/w0w0;

    .line 1994
    .line 1995
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 1996
    .line 1997
    .line 1998
    new-instance v0, La/c8d;

    .line 1999
    .line 2000
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2001
    .line 2002
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2003
    .line 2004
    .line 2005
    invoke-virtual {v2, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2006
    .line 2007
    .line 2008
    :goto_1e
    invoke-static {v1, v2, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v0

    .line 2012
    :goto_1f
    move-object v2, v0

    .line 2013
    check-cast v2, La/paw;

    .line 2014
    .line 2015
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2016
    .line 2017
    .line 2018
    move-result v3

    .line 2019
    if-eqz v3, :cond_85

    .line 2020
    .line 2021
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v2

    .line 2025
    check-cast v2, La/oe50;

    .line 2026
    .line 2027
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 2028
    .line 2029
    .line 2030
    goto :goto_1f

    .line 2031
    :cond_4b
    instance-of v1, v0, La/mgw;

    .line 2032
    .line 2033
    if-eqz v1, :cond_4c

    .line 2034
    .line 2035
    sget v0, La/ukw;->X:I

    .line 2036
    .line 2037
    invoke-virtual {v4}, La/ukw;->R()V

    .line 2038
    .line 2039
    .line 2040
    goto/16 :goto_35

    .line 2041
    .line 2042
    :cond_4c
    instance-of v1, v0, La/igw;

    .line 2043
    .line 2044
    if-eqz v1, :cond_4d

    .line 2045
    .line 2046
    sget v0, La/ukw;->X:I

    .line 2047
    .line 2048
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v0

    .line 2052
    invoke-static {v0, v0}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v1

    .line 2056
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2057
    .line 2058
    .line 2059
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;

    .line 2060
    .line 2061
    invoke-direct {v2, v8}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;-><init>(La/vqc;)V

    .line 2062
    .line 2063
    .line 2064
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 2065
    .line 2066
    .line 2067
    iget-object v1, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2068
    .line 2069
    invoke-static {v0, v1, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2070
    .line 2071
    .line 2072
    move-result-object v1

    .line 2073
    :goto_20
    move-object v2, v1

    .line 2074
    check-cast v2, La/paw;

    .line 2075
    .line 2076
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2077
    .line 2078
    .line 2079
    move-result v3

    .line 2080
    if-eqz v3, :cond_85

    .line 2081
    .line 2082
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    check-cast v2, La/oe50;

    .line 2087
    .line 2088
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2089
    .line 2090
    .line 2091
    goto :goto_20

    .line 2092
    :cond_4d
    instance-of v1, v0, La/sgw;

    .line 2093
    .line 2094
    if-eqz v1, :cond_51

    .line 2095
    .line 2096
    check-cast v0, La/sgw;

    .line 2097
    .line 2098
    sget v1, La/ukw;->X:I

    .line 2099
    .line 2100
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2101
    .line 2102
    .line 2103
    move-result-object v1

    .line 2104
    check-cast v1, La/zjw;

    .line 2105
    .line 2106
    iget-object v1, v1, La/zjw;->h:Ljava/util/Map;

    .line 2107
    .line 2108
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2109
    .line 2110
    .line 2111
    move-result-object v2

    .line 2112
    check-cast v2, La/zjw;

    .line 2113
    .line 2114
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 2115
    .line 2116
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2117
    .line 2118
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2119
    .line 2120
    .line 2121
    move-result-object v1

    .line 2122
    check-cast v1, La/jih;

    .line 2123
    .line 2124
    if-eqz v1, :cond_85

    .line 2125
    .line 2126
    iget-object v1, v1, La/jih;->h:Ljava/lang/Object;

    .line 2127
    .line 2128
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 2129
    .line 2130
    instance-of v2, v1, La/g0g0;

    .line 2131
    .line 2132
    if-eqz v2, :cond_4e

    .line 2133
    .line 2134
    const/4 v1, 0x0

    .line 2135
    :cond_4e
    check-cast v1, Ljava/util/List;

    .line 2136
    .line 2137
    if-eqz v1, :cond_85

    .line 2138
    .line 2139
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2140
    .line 2141
    .line 2142
    move-result-object v1

    .line 2143
    :cond_4f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2144
    .line 2145
    .line 2146
    move-result v2

    .line 2147
    if-eqz v2, :cond_50

    .line 2148
    .line 2149
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v2

    .line 2153
    move-object v3, v2

    .line 2154
    check-cast v3, La/oru0;

    .line 2155
    .line 2156
    iget v3, v3, La/oru0;->a:I

    .line 2157
    .line 2158
    iget v6, v0, La/sgw;->a:I

    .line 2159
    .line 2160
    if-ne v3, v6, :cond_4f

    .line 2161
    .line 2162
    move-object v15, v2

    .line 2163
    goto :goto_21

    .line 2164
    :cond_50
    const/4 v15, 0x0

    .line 2165
    :goto_21
    check-cast v15, La/oru0;

    .line 2166
    .line 2167
    if-eqz v15, :cond_85

    .line 2168
    .line 2169
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    new-instance v1, La/okw;

    .line 2174
    .line 2175
    invoke-direct {v1, v4, v15, v14}, La/okw;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2176
    .line 2177
    .line 2178
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 2179
    .line 2180
    .line 2181
    new-instance v0, La/h7w;

    .line 2182
    .line 2183
    const/16 v1, 0x8

    .line 2184
    .line 2185
    invoke-direct {v0, v1}, La/h7w;-><init>(B)V

    .line 2186
    .line 2187
    .line 2188
    invoke-static {v0}, La/pzb;->C(Lkotlin/jvm/functions/Function1;)La/m1g;

    .line 2189
    .line 2190
    .line 2191
    move-result-object v0

    .line 2192
    invoke-virtual {v5, v0}, La/vqc;->k(La/m1g;)V

    .line 2193
    .line 2194
    .line 2195
    goto/16 :goto_35

    .line 2196
    .line 2197
    :cond_51
    instance-of v1, v0, La/ygw;

    .line 2198
    .line 2199
    if-eqz v1, :cond_57

    .line 2200
    .line 2201
    check-cast v0, La/ygw;

    .line 2202
    .line 2203
    sget v1, La/ukw;->X:I

    .line 2204
    .line 2205
    iget-object v0, v0, La/ygw;->a:La/exf;

    .line 2206
    .line 2207
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 2208
    .line 2209
    .line 2210
    move-result v0

    .line 2211
    if-eqz v0, :cond_56

    .line 2212
    .line 2213
    const/4 v1, 0x1

    .line 2214
    if-eq v0, v1, :cond_55

    .line 2215
    .line 2216
    if-eq v0, v6, :cond_54

    .line 2217
    .line 2218
    const/4 v1, 0x3

    .line 2219
    if-ne v0, v1, :cond_53

    .line 2220
    .line 2221
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 2222
    .line 2223
    .line 2224
    move-result-object v0

    .line 2225
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2226
    .line 2227
    .line 2228
    move-result-object v1

    .line 2229
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2230
    .line 2231
    .line 2232
    new-instance v2, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;

    .line 2233
    .line 2234
    invoke-direct {v2, v8}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualGamesCategoriesListScreen$1;-><init>(La/vqc;)V

    .line 2235
    .line 2236
    .line 2237
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2238
    .line 2239
    if-eqz v3, :cond_52

    .line 2240
    .line 2241
    new-instance v3, La/e1w0;

    .line 2242
    .line 2243
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 2244
    .line 2245
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 2246
    .line 2247
    .line 2248
    new-instance v2, La/c8d;

    .line 2249
    .line 2250
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2251
    .line 2252
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2253
    .line 2254
    .line 2255
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2256
    .line 2257
    .line 2258
    goto :goto_22

    .line 2259
    :cond_52
    new-instance v3, La/w0w0;

    .line 2260
    .line 2261
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 2262
    .line 2263
    .line 2264
    new-instance v2, La/c8d;

    .line 2265
    .line 2266
    sget-object v4, La/y7d;->a:La/v7d;

    .line 2267
    .line 2268
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 2269
    .line 2270
    .line 2271
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 2272
    .line 2273
    .line 2274
    :goto_22
    invoke-static {v0, v1, v14}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 2275
    .line 2276
    .line 2277
    move-result-object v1

    .line 2278
    :goto_23
    move-object v2, v1

    .line 2279
    check-cast v2, La/paw;

    .line 2280
    .line 2281
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 2282
    .line 2283
    .line 2284
    move-result v3

    .line 2285
    if-eqz v3, :cond_85

    .line 2286
    .line 2287
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v2

    .line 2291
    check-cast v2, La/oe50;

    .line 2292
    .line 2293
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 2294
    .line 2295
    .line 2296
    goto :goto_23

    .line 2297
    :cond_53
    invoke-static {}, La/t9f;->b()V

    .line 2298
    .line 2299
    .line 2300
    :goto_24
    const/4 v0, 0x0

    .line 2301
    return-object v0

    .line 2302
    :cond_54
    invoke-virtual {v4}, La/ukw;->S()V

    .line 2303
    .line 2304
    .line 2305
    goto/16 :goto_35

    .line 2306
    .line 2307
    :cond_55
    invoke-virtual {v4}, La/ukw;->U()V

    .line 2308
    .line 2309
    .line 2310
    goto/16 :goto_35

    .line 2311
    .line 2312
    :cond_56
    invoke-virtual {v4}, La/ukw;->P()V

    .line 2313
    .line 2314
    .line 2315
    goto/16 :goto_35

    .line 2316
    .line 2317
    :cond_57
    instance-of v1, v0, La/thw;

    .line 2318
    .line 2319
    if-eqz v1, :cond_5a

    .line 2320
    .line 2321
    check-cast v0, La/thw;

    .line 2322
    .line 2323
    sget v1, La/ukw;->X:I

    .line 2324
    .line 2325
    iget-object v0, v0, La/thw;->a:La/fdv0;

    .line 2326
    .line 2327
    sget-object v1, La/adv0;->a:La/adv0;

    .line 2328
    .line 2329
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2330
    .line 2331
    .line 2332
    move-result v1

    .line 2333
    if-eqz v1, :cond_58

    .line 2334
    .line 2335
    invoke-virtual {v4}, La/ukw;->S()V

    .line 2336
    .line 2337
    .line 2338
    goto/16 :goto_35

    .line 2339
    .line 2340
    :cond_58
    sget-object v1, La/cdv0;->a:La/cdv0;

    .line 2341
    .line 2342
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2343
    .line 2344
    .line 2345
    move-result v1

    .line 2346
    if-eqz v1, :cond_59

    .line 2347
    .line 2348
    invoke-virtual {v4}, La/ukw;->U()V

    .line 2349
    .line 2350
    .line 2351
    goto/16 :goto_35

    .line 2352
    .line 2353
    :cond_59
    sget-object v1, La/edv0;->a:La/edv0;

    .line 2354
    .line 2355
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2356
    .line 2357
    .line 2358
    move-result v0

    .line 2359
    if-eqz v0, :cond_85

    .line 2360
    .line 2361
    invoke-virtual {v4}, La/ukw;->R()V

    .line 2362
    .line 2363
    .line 2364
    goto/16 :goto_35

    .line 2365
    .line 2366
    :cond_5a
    instance-of v1, v0, La/uhw;

    .line 2367
    .line 2368
    if-eqz v1, :cond_65

    .line 2369
    .line 2370
    check-cast v0, La/uhw;

    .line 2371
    .line 2372
    sget v1, La/ukw;->X:I

    .line 2373
    .line 2374
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2375
    .line 2376
    .line 2377
    move-result-object v1

    .line 2378
    check-cast v1, La/zjw;

    .line 2379
    .line 2380
    iget-object v1, v1, La/zjw;->h:Ljava/util/Map;

    .line 2381
    .line 2382
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2383
    .line 2384
    .line 2385
    move-result-object v2

    .line 2386
    check-cast v2, La/zjw;

    .line 2387
    .line 2388
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 2389
    .line 2390
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2391
    .line 2392
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2393
    .line 2394
    .line 2395
    move-result-object v1

    .line 2396
    check-cast v1, La/jih;

    .line 2397
    .line 2398
    if-eqz v1, :cond_5c

    .line 2399
    .line 2400
    iget-object v2, v1, La/jih;->c:Ljava/lang/Object;

    .line 2401
    .line 2402
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 2403
    .line 2404
    instance-of v3, v2, La/g0g0;

    .line 2405
    .line 2406
    if-eqz v3, :cond_5b

    .line 2407
    .line 2408
    const/4 v2, 0x0

    .line 2409
    :cond_5b
    check-cast v2, Ljava/util/List;

    .line 2410
    .line 2411
    goto :goto_25

    .line 2412
    :cond_5c
    const/4 v2, 0x0

    .line 2413
    :goto_25
    if-nez v2, :cond_5d

    .line 2414
    .line 2415
    sget-object v2, La/iun;->a:La/iun;

    .line 2416
    .line 2417
    :cond_5d
    if-eqz v1, :cond_5f

    .line 2418
    .line 2419
    iget-object v1, v1, La/jih;->d:Ljava/lang/Object;

    .line 2420
    .line 2421
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 2422
    .line 2423
    instance-of v3, v1, La/g0g0;

    .line 2424
    .line 2425
    if-eqz v3, :cond_5e

    .line 2426
    .line 2427
    const/4 v1, 0x0

    .line 2428
    :cond_5e
    check-cast v1, Ljava/util/List;

    .line 2429
    .line 2430
    goto :goto_26

    .line 2431
    :cond_5f
    const/4 v1, 0x0

    .line 2432
    :goto_26
    if-nez v1, :cond_60

    .line 2433
    .line 2434
    sget-object v1, La/iun;->a:La/iun;

    .line 2435
    .line 2436
    :cond_60
    invoke-static {v2, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v1

    .line 2440
    new-instance v2, Ljava/util/ArrayList;

    .line 2441
    .line 2442
    const/16 v3, 0xa

    .line 2443
    .line 2444
    invoke-static {v1, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 2445
    .line 2446
    .line 2447
    move-result v3

    .line 2448
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 2449
    .line 2450
    .line 2451
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v1

    .line 2455
    :goto_27
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2456
    .line 2457
    .line 2458
    move-result v3

    .line 2459
    if-eqz v3, :cond_61

    .line 2460
    .line 2461
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2462
    .line 2463
    .line 2464
    move-result-object v3

    .line 2465
    check-cast v3, La/eih;

    .line 2466
    .line 2467
    iget-object v3, v3, La/eih;->e:Ljava/util/ArrayList;

    .line 2468
    .line 2469
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2470
    .line 2471
    .line 2472
    goto :goto_27

    .line 2473
    :cond_61
    invoke-static {v2}, La/r3d;->r(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v1

    .line 2477
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v1

    .line 2481
    :cond_62
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2482
    .line 2483
    .line 2484
    move-result v2

    .line 2485
    if-eqz v2, :cond_63

    .line 2486
    .line 2487
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2488
    .line 2489
    .line 2490
    move-result-object v2

    .line 2491
    move-object v3, v2

    .line 2492
    check-cast v3, La/d0t;

    .line 2493
    .line 2494
    iget-wide v5, v3, La/d0t;->a:J

    .line 2495
    .line 2496
    iget-wide v7, v0, La/uhw;->c:J

    .line 2497
    .line 2498
    cmp-long v3, v5, v7

    .line 2499
    .line 2500
    if-nez v3, :cond_62

    .line 2501
    .line 2502
    move-object v15, v2

    .line 2503
    goto :goto_28

    .line 2504
    :cond_63
    const/4 v15, 0x0

    .line 2505
    :goto_28
    check-cast v15, La/d0t;

    .line 2506
    .line 2507
    if-nez v15, :cond_64

    .line 2508
    .line 2509
    goto/16 :goto_35

    .line 2510
    .line 2511
    :cond_64
    new-instance v0, La/chw;

    .line 2512
    .line 2513
    new-instance v1, La/pid;

    .line 2514
    .line 2515
    iget-wide v2, v15, La/d0t;->a:J

    .line 2516
    .line 2517
    invoke-direct {v1, v2, v3}, La/pid;-><init>(J)V

    .line 2518
    .line 2519
    .line 2520
    invoke-direct {v0, v1}, La/chw;-><init>(La/uid;)V

    .line 2521
    .line 2522
    .line 2523
    invoke-virtual {v4, v0}, La/ukw;->T(La/ghw;)V

    .line 2524
    .line 2525
    .line 2526
    goto/16 :goto_35

    .line 2527
    .line 2528
    :cond_65
    instance-of v1, v0, La/ahw;

    .line 2529
    .line 2530
    if-eqz v1, :cond_67

    .line 2531
    .line 2532
    check-cast v0, La/ahw;

    .line 2533
    .line 2534
    sget v1, La/ukw;->X:I

    .line 2535
    .line 2536
    iget-object v1, v0, La/ahw;->a:La/sip;

    .line 2537
    .line 2538
    invoke-static {v1}, La/kpb;->u(La/sip;)Z

    .line 2539
    .line 2540
    .line 2541
    move-result v1

    .line 2542
    iget-wide v2, v0, La/ahw;->b:J

    .line 2543
    .line 2544
    if-eqz v1, :cond_66

    .line 2545
    .line 2546
    new-instance v0, La/a21;

    .line 2547
    .line 2548
    const/16 v1, 0x13

    .line 2549
    .line 2550
    invoke-direct {v0, v1, v2, v3}, La/a21;-><init>(BJ)V

    .line 2551
    .line 2552
    .line 2553
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 2554
    .line 2555
    .line 2556
    goto/16 :goto_35

    .line 2557
    .line 2558
    :cond_66
    new-instance v0, La/a21;

    .line 2559
    .line 2560
    const/16 v1, 0x14

    .line 2561
    .line 2562
    invoke-direct {v0, v1, v2, v3}, La/a21;-><init>(BJ)V

    .line 2563
    .line 2564
    .line 2565
    invoke-virtual {v4, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 2566
    .line 2567
    .line 2568
    goto/16 :goto_35

    .line 2569
    .line 2570
    :cond_67
    instance-of v1, v0, La/lgw;

    .line 2571
    .line 2572
    if-eqz v1, :cond_6b

    .line 2573
    .line 2574
    check-cast v0, La/lgw;

    .line 2575
    .line 2576
    sget v1, La/ukw;->X:I

    .line 2577
    .line 2578
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2579
    .line 2580
    .line 2581
    move-result-object v1

    .line 2582
    check-cast v1, La/zjw;

    .line 2583
    .line 2584
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 2585
    .line 2586
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2587
    .line 2588
    iget-object v0, v0, La/lgw;->a:La/sip;

    .line 2589
    .line 2590
    invoke-static {v0}, La/kpb;->u(La/sip;)Z

    .line 2591
    .line 2592
    .line 2593
    move-result v11

    .line 2594
    if-eqz v11, :cond_68

    .line 2595
    .line 2596
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2597
    .line 2598
    .line 2599
    move-result-object v0

    .line 2600
    check-cast v0, La/zjw;

    .line 2601
    .line 2602
    iget-object v0, v0, La/zjw;->m:Ljava/util/Map;

    .line 2603
    .line 2604
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2605
    .line 2606
    .line 2607
    move-result-object v0

    .line 2608
    check-cast v0, Ljava/lang/Long;

    .line 2609
    .line 2610
    goto :goto_29

    .line 2611
    :cond_68
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2612
    .line 2613
    .line 2614
    move-result-object v0

    .line 2615
    check-cast v0, La/zjw;

    .line 2616
    .line 2617
    iget-object v0, v0, La/zjw;->n:Ljava/util/Map;

    .line 2618
    .line 2619
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2620
    .line 2621
    .line 2622
    move-result-object v0

    .line 2623
    check-cast v0, Ljava/lang/Long;

    .line 2624
    .line 2625
    :goto_29
    if-eqz v0, :cond_85

    .line 2626
    .line 2627
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 2628
    .line 2629
    .line 2630
    move-result-wide v2

    .line 2631
    invoke-static {v2, v3, v1}, Lorg/xplatform/cyber/section/api/domain/entity/d;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)Lkotlin/Pair;

    .line 2632
    .line 2633
    .line 2634
    move-result-object v0

    .line 2635
    iget-object v2, v0, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2636
    .line 2637
    check-cast v2, Ljava/lang/Number;

    .line 2638
    .line 2639
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 2640
    .line 2641
    .line 2642
    move-result-wide v7

    .line 2643
    iget-object v0, v0, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2644
    .line 2645
    check-cast v0, Ljava/lang/Number;

    .line 2646
    .line 2647
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 2648
    .line 2649
    .line 2650
    move-result-wide v9

    .line 2651
    iget-byte v0, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 2652
    .line 2653
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2654
    .line 2655
    .line 2656
    move-result-object v1

    .line 2657
    check-cast v1, La/zjw;

    .line 2658
    .line 2659
    iget-boolean v1, v1, La/zjw;->f:Z

    .line 2660
    .line 2661
    if-eqz v1, :cond_6a

    .line 2662
    .line 2663
    if-eqz v11, :cond_69

    .line 2664
    .line 2665
    sget-object v1, La/i1g;->c:La/i1g;

    .line 2666
    .line 2667
    :goto_2a
    move-object v6, v1

    .line 2668
    goto :goto_2b

    .line 2669
    :cond_69
    sget-object v1, La/i1g;->d:La/i1g;

    .line 2670
    .line 2671
    goto :goto_2a

    .line 2672
    :goto_2b
    iget-object v5, v4, La/ukw;->z:La/chf0;

    .line 2673
    .line 2674
    invoke-virtual/range {v5 .. v10}, La/chf0;->i0(La/i1g;JJ)V

    .line 2675
    .line 2676
    .line 2677
    goto :goto_2c

    .line 2678
    :cond_6a
    iget-object v5, v4, La/ukw;->z:La/chf0;

    .line 2679
    .line 2680
    move-wide v6, v7

    .line 2681
    move-wide v8, v9

    .line 2682
    invoke-static {v0}, Lorg/xplatform/cyber/section/api/domain/entity/d;->e(I)Ljava/lang/String;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v10

    .line 2686
    invoke-virtual/range {v5 .. v10}, La/chf0;->h0(JJLjava/lang/String;)V

    .line 2687
    .line 2688
    .line 2689
    move-wide v9, v8

    .line 2690
    move-wide v7, v6

    .line 2691
    :goto_2c
    move-object v5, v13

    .line 2692
    check-cast v5, La/uzg;

    .line 2693
    .line 2694
    move v6, v0

    .line 2695
    invoke-virtual/range {v5 .. v11}, La/uzg;->e(IJJZ)V

    .line 2696
    .line 2697
    .line 2698
    goto/16 :goto_35

    .line 2699
    .line 2700
    :cond_6b
    instance-of v1, v0, La/wgw;

    .line 2701
    .line 2702
    if-eqz v1, :cond_6c

    .line 2703
    .line 2704
    check-cast v0, La/wgw;

    .line 2705
    .line 2706
    sget v1, La/ukw;->X:I

    .line 2707
    .line 2708
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2709
    .line 2710
    .line 2711
    move-result-object v1

    .line 2712
    check-cast v1, La/zjw;

    .line 2713
    .line 2714
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 2715
    .line 2716
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2717
    .line 2718
    iget-byte v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 2719
    .line 2720
    iget-wide v2, v0, La/wgw;->a:J

    .line 2721
    .line 2722
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2723
    .line 2724
    .line 2725
    move-result-object v0

    .line 2726
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2727
    .line 2728
    .line 2729
    move-result-object v0

    .line 2730
    check-cast v13, La/uzg;

    .line 2731
    .line 2732
    const/4 v8, 0x1

    .line 2733
    invoke-virtual {v13, v1, v0, v8}, La/uzg;->d(ILjava/util/List;Z)V

    .line 2734
    .line 2735
    .line 2736
    goto/16 :goto_35

    .line 2737
    .line 2738
    :cond_6c
    instance-of v1, v0, La/vgw;

    .line 2739
    .line 2740
    if-eqz v1, :cond_6d

    .line 2741
    .line 2742
    check-cast v0, La/vgw;

    .line 2743
    .line 2744
    sget v1, La/ukw;->X:I

    .line 2745
    .line 2746
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2747
    .line 2748
    .line 2749
    move-result-object v1

    .line 2750
    check-cast v1, La/zjw;

    .line 2751
    .line 2752
    iget-object v1, v1, La/zjw;->g:La/ekw;

    .line 2753
    .line 2754
    iget-object v1, v1, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2755
    .line 2756
    iget-byte v1, v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 2757
    .line 2758
    iget-wide v2, v0, La/vgw;->a:J

    .line 2759
    .line 2760
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2761
    .line 2762
    .line 2763
    move-result-object v0

    .line 2764
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 2765
    .line 2766
    .line 2767
    move-result-object v0

    .line 2768
    check-cast v13, La/uzg;

    .line 2769
    .line 2770
    invoke-virtual {v13, v1, v0, v14}, La/uzg;->d(ILjava/util/List;Z)V

    .line 2771
    .line 2772
    .line 2773
    goto/16 :goto_35

    .line 2774
    .line 2775
    :cond_6d
    instance-of v1, v0, La/ugw;

    .line 2776
    .line 2777
    if-eqz v1, :cond_76

    .line 2778
    .line 2779
    check-cast v0, La/ugw;

    .line 2780
    .line 2781
    sget v1, La/ukw;->X:I

    .line 2782
    .line 2783
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2784
    .line 2785
    .line 2786
    move-result-object v1

    .line 2787
    check-cast v1, La/zjw;

    .line 2788
    .line 2789
    iget-object v1, v1, La/zjw;->h:Ljava/util/Map;

    .line 2790
    .line 2791
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2792
    .line 2793
    .line 2794
    move-result-object v2

    .line 2795
    check-cast v2, La/zjw;

    .line 2796
    .line 2797
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 2798
    .line 2799
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2800
    .line 2801
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2802
    .line 2803
    .line 2804
    move-result-object v1

    .line 2805
    check-cast v1, La/jih;

    .line 2806
    .line 2807
    if-eqz v1, :cond_85

    .line 2808
    .line 2809
    iget-object v1, v1, La/jih;->i:Ljava/lang/Object;

    .line 2810
    .line 2811
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 2812
    .line 2813
    instance-of v2, v1, La/g0g0;

    .line 2814
    .line 2815
    if-eqz v2, :cond_6e

    .line 2816
    .line 2817
    const/4 v1, 0x0

    .line 2818
    :cond_6e
    check-cast v1, Ljava/util/List;

    .line 2819
    .line 2820
    if-eqz v1, :cond_85

    .line 2821
    .line 2822
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2823
    .line 2824
    .line 2825
    move-result-object v1

    .line 2826
    :cond_6f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 2827
    .line 2828
    .line 2829
    move-result v2

    .line 2830
    if-eqz v2, :cond_70

    .line 2831
    .line 2832
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2833
    .line 2834
    .line 2835
    move-result-object v2

    .line 2836
    move-object v3, v2

    .line 2837
    check-cast v3, La/xah;

    .line 2838
    .line 2839
    iget-wide v5, v3, La/xah;->g:J

    .line 2840
    .line 2841
    iget-wide v7, v0, La/ugw;->a:J

    .line 2842
    .line 2843
    cmp-long v3, v5, v7

    .line 2844
    .line 2845
    if-nez v3, :cond_6f

    .line 2846
    .line 2847
    goto :goto_2d

    .line 2848
    :cond_70
    const/4 v2, 0x0

    .line 2849
    :goto_2d
    check-cast v2, La/xah;

    .line 2850
    .line 2851
    if-eqz v2, :cond_85

    .line 2852
    .line 2853
    iget-object v0, v4, La/ukw;->o:Lorg/xplatform/cyber/section/api/home/CyberHomeParams;

    .line 2854
    .line 2855
    iget-object v0, v0, Lorg/xplatform/cyber/section/api/home/CyberHomeParams;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel;

    .line 2856
    .line 2857
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromNewPopular;

    .line 2858
    .line 2859
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2860
    .line 2861
    .line 2862
    move-result v1

    .line 2863
    if-eqz v1, :cond_71

    .line 2864
    .line 2865
    sget-object v0, La/r1g;->h:La/r1g;

    .line 2866
    .line 2867
    invoke-virtual {v4, v2, v0}, La/ukw;->W(La/xah;La/r1g;)V

    .line 2868
    .line 2869
    .line 2870
    goto :goto_2f

    .line 2871
    :cond_71
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromMain;

    .line 2872
    .line 2873
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2874
    .line 2875
    .line 2876
    move-result v1

    .line 2877
    if-nez v1, :cond_74

    .line 2878
    .line 2879
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromSection;

    .line 2880
    .line 2881
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2882
    .line 2883
    .line 2884
    move-result v1

    .line 2885
    if-eqz v1, :cond_72

    .line 2886
    .line 2887
    goto :goto_2e

    .line 2888
    :cond_72
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromGame;

    .line 2889
    .line 2890
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2891
    .line 2892
    .line 2893
    move-result v1

    .line 2894
    if-nez v1, :cond_75

    .line 2895
    .line 2896
    sget-object v1, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesParentSectionModel$FromPopular;

    .line 2897
    .line 2898
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2899
    .line 2900
    .line 2901
    move-result v0

    .line 2902
    if-eqz v0, :cond_73

    .line 2903
    .line 2904
    goto :goto_2f

    .line 2905
    :cond_73
    invoke-static {}, La/t9f;->b()V

    .line 2906
    .line 2907
    .line 2908
    goto/16 :goto_24

    .line 2909
    .line 2910
    :cond_74
    :goto_2e
    sget-object v0, La/r1g;->b:La/r1g;

    .line 2911
    .line 2912
    invoke-virtual {v4, v2, v0}, La/ukw;->W(La/xah;La/r1g;)V

    .line 2913
    .line 2914
    .line 2915
    :cond_75
    :goto_2f
    new-instance v12, La/npn;

    .line 2916
    .line 2917
    iget-wide v13, v2, La/xah;->g:J

    .line 2918
    .line 2919
    iget-wide v0, v2, La/xah;->i:J

    .line 2920
    .line 2921
    iget-wide v5, v2, La/xah;->k:J

    .line 2922
    .line 2923
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2924
    .line 2925
    .line 2926
    move-result-object v17

    .line 2927
    iget-boolean v3, v2, La/xah;->n:Z

    .line 2928
    .line 2929
    move-wide v15, v0

    .line 2930
    move/from16 v18, v3

    .line 2931
    .line 2932
    invoke-direct/range {v12 .. v18}, La/npn;-><init>(JJLjava/lang/Long;Z)V

    .line 2933
    .line 2934
    .line 2935
    invoke-virtual {v11}, La/oeg0;->c()La/i1w0;

    .line 2936
    .line 2937
    .line 2938
    move-result-object v0

    .line 2939
    new-instance v1, La/k9v;

    .line 2940
    .line 2941
    const/4 v3, 0x4

    .line 2942
    invoke-direct {v1, v4, v12, v2, v3}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2943
    .line 2944
    .line 2945
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 2946
    .line 2947
    .line 2948
    goto/16 :goto_35

    .line 2949
    .line 2950
    :cond_76
    instance-of v1, v0, La/tgw;

    .line 2951
    .line 2952
    if-eqz v1, :cond_7c

    .line 2953
    .line 2954
    check-cast v0, La/tgw;

    .line 2955
    .line 2956
    sget v1, La/ukw;->X:I

    .line 2957
    .line 2958
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2959
    .line 2960
    .line 2961
    move-result-object v1

    .line 2962
    check-cast v1, La/zjw;

    .line 2963
    .line 2964
    iget-object v1, v1, La/zjw;->h:Ljava/util/Map;

    .line 2965
    .line 2966
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v2

    .line 2970
    check-cast v2, La/zjw;

    .line 2971
    .line 2972
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 2973
    .line 2974
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 2975
    .line 2976
    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2977
    .line 2978
    .line 2979
    move-result-object v1

    .line 2980
    check-cast v1, La/jih;

    .line 2981
    .line 2982
    if-eqz v1, :cond_85

    .line 2983
    .line 2984
    iget-object v1, v1, La/jih;->i:Ljava/lang/Object;

    .line 2985
    .line 2986
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 2987
    .line 2988
    instance-of v2, v1, La/g0g0;

    .line 2989
    .line 2990
    if-eqz v2, :cond_77

    .line 2991
    .line 2992
    const/4 v1, 0x0

    .line 2993
    :cond_77
    check-cast v1, Ljava/util/List;

    .line 2994
    .line 2995
    if-eqz v1, :cond_85

    .line 2996
    .line 2997
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 2998
    .line 2999
    .line 3000
    move-result-object v1

    .line 3001
    :cond_78
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 3002
    .line 3003
    .line 3004
    move-result v2

    .line 3005
    if-eqz v2, :cond_79

    .line 3006
    .line 3007
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3008
    .line 3009
    .line 3010
    move-result-object v2

    .line 3011
    move-object v3, v2

    .line 3012
    check-cast v3, La/xah;

    .line 3013
    .line 3014
    iget-wide v5, v3, La/xah;->g:J

    .line 3015
    .line 3016
    iget-wide v7, v0, La/tgw;->a:J

    .line 3017
    .line 3018
    cmp-long v3, v5, v7

    .line 3019
    .line 3020
    if-nez v3, :cond_78

    .line 3021
    .line 3022
    move-object v15, v2

    .line 3023
    goto :goto_30

    .line 3024
    :cond_79
    const/4 v15, 0x0

    .line 3025
    :goto_30
    check-cast v15, La/xah;

    .line 3026
    .line 3027
    if-eqz v15, :cond_85

    .line 3028
    .line 3029
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3030
    .line 3031
    .line 3032
    move-result-object v0

    .line 3033
    check-cast v0, La/zjw;

    .line 3034
    .line 3035
    iget-boolean v0, v0, La/zjw;->f:Z

    .line 3036
    .line 3037
    if-eqz v0, :cond_7a

    .line 3038
    .line 3039
    sget-object v0, La/r1g;->h:La/r1g;

    .line 3040
    .line 3041
    :goto_31
    move-object v10, v0

    .line 3042
    goto :goto_32

    .line 3043
    :cond_7a
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3044
    .line 3045
    .line 3046
    move-result-object v0

    .line 3047
    check-cast v0, La/zjw;

    .line 3048
    .line 3049
    iget-object v0, v0, La/zjw;->g:La/ekw;

    .line 3050
    .line 3051
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 3052
    .line 3053
    instance-of v0, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 3054
    .line 3055
    if-eqz v0, :cond_7b

    .line 3056
    .line 3057
    sget-object v0, La/r1g;->k:La/r1g;

    .line 3058
    .line 3059
    goto :goto_31

    .line 3060
    :goto_32
    iget-object v5, v4, La/ukw;->w:La/ih5;

    .line 3061
    .line 3062
    iget-wide v6, v15, La/xah;->i:J

    .line 3063
    .line 3064
    iget-boolean v0, v15, La/xah;->n:Z

    .line 3065
    .line 3066
    iget-wide v1, v15, La/xah;->g:J

    .line 3067
    .line 3068
    iget-wide v8, v15, La/xah;->k:J

    .line 3069
    .line 3070
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3071
    .line 3072
    .line 3073
    move-result-object v11

    .line 3074
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 3075
    .line 3076
    .line 3077
    move-result-object v12

    .line 3078
    invoke-virtual/range {v5 .. v12}, La/ih5;->l(JJLa/r1g;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 3079
    .line 3080
    .line 3081
    iget-object v3, v4, La/ukw;->y:La/zr1;

    .line 3082
    .line 3083
    iget-wide v5, v15, La/xah;->i:J

    .line 3084
    .line 3085
    iget-wide v7, v15, La/xah;->k:J

    .line 3086
    .line 3087
    iget-object v9, v10, La/r1g;->a:Ljava/lang/String;

    .line 3088
    .line 3089
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3090
    .line 3091
    .line 3092
    move-result-object v22

    .line 3093
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 3094
    .line 3095
    .line 3096
    move-result-object v23

    .line 3097
    move-object/from16 v16, v3

    .line 3098
    .line 3099
    move-wide/from16 v17, v5

    .line 3100
    .line 3101
    move-wide/from16 v19, v7

    .line 3102
    .line 3103
    move-object/from16 v21, v9

    .line 3104
    .line 3105
    invoke-virtual/range {v16 .. v23}, La/zr1;->m(JJLjava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;)V

    .line 3106
    .line 3107
    .line 3108
    :cond_7b
    iget-wide v0, v15, La/xah;->k:J

    .line 3109
    .line 3110
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3111
    .line 3112
    .line 3113
    move-result-object v2

    .line 3114
    check-cast v2, La/zjw;

    .line 3115
    .line 3116
    iget-object v2, v2, La/zjw;->g:La/ekw;

    .line 3117
    .line 3118
    iget-object v2, v2, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 3119
    .line 3120
    sget-object v3, La/k1g;->b:La/k1g;

    .line 3121
    .line 3122
    check-cast v13, La/uzg;

    .line 3123
    .line 3124
    invoke-virtual {v13, v0, v1, v2, v3}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 3125
    .line 3126
    .line 3127
    goto/16 :goto_35

    .line 3128
    .line 3129
    :cond_7c
    instance-of v1, v0, La/ohw;

    .line 3130
    .line 3131
    if-eqz v1, :cond_86

    .line 3132
    .line 3133
    check-cast v0, La/ohw;

    .line 3134
    .line 3135
    iget-wide v0, v0, La/ohw;->a:J

    .line 3136
    .line 3137
    sget v5, La/ukw;->X:I

    .line 3138
    .line 3139
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3140
    .line 3141
    .line 3142
    move-result-object v5

    .line 3143
    check-cast v5, La/zjw;

    .line 3144
    .line 3145
    iget-object v5, v5, La/zjw;->h:Ljava/util/Map;

    .line 3146
    .line 3147
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3148
    .line 3149
    .line 3150
    move-result-object v6

    .line 3151
    check-cast v6, La/zjw;

    .line 3152
    .line 3153
    iget-object v6, v6, La/zjw;->g:La/ekw;

    .line 3154
    .line 3155
    iget-object v6, v6, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 3156
    .line 3157
    invoke-interface {v5, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 3158
    .line 3159
    .line 3160
    move-result-object v5

    .line 3161
    check-cast v5, La/jih;

    .line 3162
    .line 3163
    if-eqz v5, :cond_85

    .line 3164
    .line 3165
    iget-object v5, v5, La/jih;->i:Ljava/lang/Object;

    .line 3166
    .line 3167
    sget-object v6, La/j0g0;->b:La/e0g0;

    .line 3168
    .line 3169
    instance-of v6, v5, La/g0g0;

    .line 3170
    .line 3171
    if-eqz v6, :cond_7d

    .line 3172
    .line 3173
    const/4 v5, 0x0

    .line 3174
    :cond_7d
    check-cast v5, Ljava/util/List;

    .line 3175
    .line 3176
    if-eqz v5, :cond_85

    .line 3177
    .line 3178
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3179
    .line 3180
    .line 3181
    move-result-object v5

    .line 3182
    :cond_7e
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 3183
    .line 3184
    .line 3185
    move-result v6

    .line 3186
    if-eqz v6, :cond_7f

    .line 3187
    .line 3188
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3189
    .line 3190
    .line 3191
    move-result-object v6

    .line 3192
    move-object v7, v6

    .line 3193
    check-cast v7, La/xah;

    .line 3194
    .line 3195
    iget-wide v7, v7, La/xah;->g:J

    .line 3196
    .line 3197
    cmp-long v7, v7, v0

    .line 3198
    .line 3199
    if-nez v7, :cond_7e

    .line 3200
    .line 3201
    goto :goto_33

    .line 3202
    :cond_7f
    const/4 v6, 0x0

    .line 3203
    :goto_33
    move-object v14, v6

    .line 3204
    check-cast v14, La/xah;

    .line 3205
    .line 3206
    if-eqz v14, :cond_85

    .line 3207
    .line 3208
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3209
    .line 3210
    .line 3211
    move-result-object v5

    .line 3212
    check-cast v5, La/zjw;

    .line 3213
    .line 3214
    iget-object v5, v5, La/zjw;->b:La/sff0;

    .line 3215
    .line 3216
    iget-object v5, v5, La/sff0;->c:La/ech;

    .line 3217
    .line 3218
    iget-object v5, v5, La/ech;->p:Ljava/util/List;

    .line 3219
    .line 3220
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 3221
    .line 3222
    .line 3223
    move-result-object v0

    .line 3224
    invoke-interface {v5, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 3225
    .line 3226
    .line 3227
    move-result v0

    .line 3228
    iget-object v1, v3, La/luu;->a:La/nok0;

    .line 3229
    .line 3230
    invoke-virtual {v1}, La/nok0;->a()Ljava/util/List;

    .line 3231
    .line 3232
    .line 3233
    move-result-object v1

    .line 3234
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 3235
    .line 3236
    .line 3237
    move-result-object v1

    .line 3238
    :cond_80
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 3239
    .line 3240
    .line 3241
    move-result v3

    .line 3242
    if-eqz v3, :cond_81

    .line 3243
    .line 3244
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 3245
    .line 3246
    .line 3247
    move-result-object v3

    .line 3248
    move-object v5, v3

    .line 3249
    check-cast v5, La/lok0;

    .line 3250
    .line 3251
    iget v6, v5, La/lok0;->a:I

    .line 3252
    .line 3253
    iget v7, v14, La/xah;->h:I

    .line 3254
    .line 3255
    if-ne v6, v7, :cond_80

    .line 3256
    .line 3257
    iget-object v5, v5, La/lok0;->t:Ljava/util/List;

    .line 3258
    .line 3259
    invoke-interface {v5, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 3260
    .line 3261
    .line 3262
    move-result v5

    .line 3263
    if-eqz v5, :cond_80

    .line 3264
    .line 3265
    move-object v15, v3

    .line 3266
    goto :goto_34

    .line 3267
    :cond_81
    const/4 v15, 0x0

    .line 3268
    :goto_34
    check-cast v15, La/lok0;

    .line 3269
    .line 3270
    iget-wide v1, v14, La/xah;->i:J

    .line 3271
    .line 3272
    cmp-long v3, v1, v21

    .line 3273
    .line 3274
    if-nez v3, :cond_82

    .line 3275
    .line 3276
    iget-wide v1, v14, La/xah;->k:J

    .line 3277
    .line 3278
    :cond_82
    if-eqz v0, :cond_83

    .line 3279
    .line 3280
    check-cast v13, La/uzg;

    .line 3281
    .line 3282
    invoke-virtual {v13}, La/uzg;->g()V

    .line 3283
    .line 3284
    .line 3285
    goto :goto_35

    .line 3286
    :cond_83
    if-eqz v15, :cond_84

    .line 3287
    .line 3288
    iget v0, v15, La/lok0;->a:I

    .line 3289
    .line 3290
    int-to-long v5, v0

    .line 3291
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3292
    .line 3293
    .line 3294
    move-result-object v0

    .line 3295
    check-cast v0, La/zjw;

    .line 3296
    .line 3297
    iget-boolean v11, v0, La/zjw;->f:Z

    .line 3298
    .line 3299
    iget-wide v7, v15, La/lok0;->f:J

    .line 3300
    .line 3301
    iget-wide v9, v15, La/lok0;->g:J

    .line 3302
    .line 3303
    iget-boolean v12, v14, La/xah;->n:Z

    .line 3304
    .line 3305
    invoke-virtual/range {v4 .. v12}, La/ukw;->N(JJJZZ)V

    .line 3306
    .line 3307
    .line 3308
    iget-object v0, v15, La/lok0;->b:Ljava/lang/String;

    .line 3309
    .line 3310
    check-cast v13, La/uzg;

    .line 3311
    .line 3312
    invoke-virtual {v13, v5, v6, v0}, La/uzg;->o(JLjava/lang/String;)V

    .line 3313
    .line 3314
    .line 3315
    goto :goto_35

    .line 3316
    :cond_84
    iget-wide v5, v14, La/xah;->g:J

    .line 3317
    .line 3318
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3319
    .line 3320
    .line 3321
    move-result-object v0

    .line 3322
    check-cast v0, La/zjw;

    .line 3323
    .line 3324
    iget-boolean v11, v0, La/zjw;->f:Z

    .line 3325
    .line 3326
    iget-wide v7, v14, La/xah;->i:J

    .line 3327
    .line 3328
    iget-wide v9, v14, La/xah;->k:J

    .line 3329
    .line 3330
    iget-boolean v12, v14, La/xah;->n:Z

    .line 3331
    .line 3332
    invoke-virtual/range {v4 .. v12}, La/ukw;->N(JJJZZ)V

    .line 3333
    .line 3334
    .line 3335
    iget-wide v9, v14, La/xah;->g:J

    .line 3336
    .line 3337
    iget-object v6, v14, La/xah;->f:Ljava/lang/String;

    .line 3338
    .line 3339
    invoke-virtual {v4}, La/i3t0;->D()Ljava/lang/Object;

    .line 3340
    .line 3341
    .line 3342
    move-result-object v0

    .line 3343
    check-cast v0, La/zjw;

    .line 3344
    .line 3345
    iget-object v0, v0, La/zjw;->g:La/ekw;

    .line 3346
    .line 3347
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 3348
    .line 3349
    iget-byte v11, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 3350
    .line 3351
    sget-object v0, La/k1g;->b:La/k1g;

    .line 3352
    .line 3353
    move-object v5, v13

    .line 3354
    check-cast v5, La/uzg;

    .line 3355
    .line 3356
    move-wide v7, v1

    .line 3357
    invoke-virtual/range {v5 .. v11}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 3358
    .line 3359
    .line 3360
    :cond_85
    :goto_35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 3361
    .line 3362
    return-object v0

    .line 3363
    :cond_86
    invoke-static {}, La/t9f;->b()V

    .line 3364
    .line 3365
    .line 3366
    goto/16 :goto_24

    .line 3367
    .line 3368
    nop

    .line 3369
    :sswitch_data_0
    .sparse-switch
        -0x6def2dee -> :sswitch_5
        -0x6def2cf6 -> :sswitch_4
        -0x2620238d -> :sswitch_3
        -0x7423654 -> :sswitch_2
        0x5c889c -> :sswitch_1
        0x74dcab8 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/kaw;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/kaw;->k:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p1, La/kaw;

    .line 9
    .line 10
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p0, La/ge10;

    .line 13
    .line 14
    check-cast v1, Ljava/util/List;

    .line 15
    .line 16
    const/16 v0, 0x1d

    .line 17
    .line 18
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 19
    .line 20
    .line 21
    return-object p1

    .line 22
    :pswitch_0
    new-instance p0, La/kaw;

    .line 23
    .line 24
    check-cast v1, La/b310;

    .line 25
    .line 26
    const/16 v0, 0x1c

    .line 27
    .line 28
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    new-instance p0, La/kaw;

    .line 35
    .line 36
    check-cast v1, La/k210;

    .line 37
    .line 38
    const/16 v0, 0x1b

    .line 39
    .line 40
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 41
    .line 42
    .line 43
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 44
    .line 45
    return-object p0

    .line 46
    :pswitch_2
    new-instance p0, La/kaw;

    .line 47
    .line 48
    check-cast v1, La/ct00;

    .line 49
    .line 50
    const/16 v0, 0x1a

    .line 51
    .line 52
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 56
    .line 57
    return-object p0

    .line 58
    :pswitch_3
    new-instance p0, La/kaw;

    .line 59
    .line 60
    check-cast v1, Lorg/xplatform/localtimedif/impl/presentation/localtimediffworker/LocalTimeDiffWorker;

    .line 61
    .line 62
    const/16 v0, 0x19

    .line 63
    .line 64
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 65
    .line 66
    .line 67
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_4
    new-instance p0, La/kaw;

    .line 71
    .line 72
    check-cast v1, La/bq00;

    .line 73
    .line 74
    const/16 v0, 0x18

    .line 75
    .line 76
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 77
    .line 78
    .line 79
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 80
    .line 81
    return-object p0

    .line 82
    :pswitch_5
    new-instance p0, La/kaw;

    .line 83
    .line 84
    check-cast v1, La/co00;

    .line 85
    .line 86
    const/16 v0, 0x17

    .line 87
    .line 88
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 89
    .line 90
    .line 91
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 92
    .line 93
    return-object p0

    .line 94
    :pswitch_6
    new-instance p1, La/kaw;

    .line 95
    .line 96
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast p0, La/xm00;

    .line 99
    .line 100
    check-cast v1, Ljava/lang/Throwable;

    .line 101
    .line 102
    const/16 v0, 0x16

    .line 103
    .line 104
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 105
    .line 106
    .line 107
    return-object p1

    .line 108
    :pswitch_7
    new-instance p0, La/kaw;

    .line 109
    .line 110
    check-cast v1, La/yl00;

    .line 111
    .line 112
    const/16 v0, 0x15

    .line 113
    .line 114
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 115
    .line 116
    .line 117
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_8
    new-instance p0, La/kaw;

    .line 121
    .line 122
    check-cast v1, La/qi00;

    .line 123
    .line 124
    const/16 v0, 0x14

    .line 125
    .line 126
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_9
    new-instance p0, La/kaw;

    .line 133
    .line 134
    check-cast v1, La/ef00;

    .line 135
    .line 136
    const/16 v0, 0x13

    .line 137
    .line 138
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 139
    .line 140
    .line 141
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_a
    new-instance p0, La/kaw;

    .line 145
    .line 146
    check-cast v1, La/gb00;

    .line 147
    .line 148
    const/16 v0, 0x12

    .line 149
    .line 150
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_b
    new-instance p0, La/kaw;

    .line 157
    .line 158
    check-cast v1, La/tkz;

    .line 159
    .line 160
    const/16 v0, 0x11

    .line 161
    .line 162
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_c
    new-instance p0, La/kaw;

    .line 169
    .line 170
    check-cast v1, La/u1z;

    .line 171
    .line 172
    const/16 v0, 0x10

    .line 173
    .line 174
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 175
    .line 176
    .line 177
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_d
    new-instance p0, La/kaw;

    .line 181
    .line 182
    check-cast v1, La/jty;

    .line 183
    .line 184
    const/16 v0, 0xf

    .line 185
    .line 186
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 187
    .line 188
    .line 189
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 190
    .line 191
    return-object p0

    .line 192
    :pswitch_e
    new-instance p0, La/kaw;

    .line 193
    .line 194
    check-cast v1, La/e6y;

    .line 195
    .line 196
    const/16 v0, 0xe

    .line 197
    .line 198
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 199
    .line 200
    .line 201
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 202
    .line 203
    return-object p0

    .line 204
    :pswitch_f
    new-instance p0, La/kaw;

    .line 205
    .line 206
    check-cast v1, La/c5y;

    .line 207
    .line 208
    const/16 v0, 0xd

    .line 209
    .line 210
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 211
    .line 212
    .line 213
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 214
    .line 215
    return-object p0

    .line 216
    :pswitch_10
    new-instance p0, La/kaw;

    .line 217
    .line 218
    check-cast v1, La/d4y;

    .line 219
    .line 220
    const/16 v0, 0xc

    .line 221
    .line 222
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 223
    .line 224
    .line 225
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 226
    .line 227
    return-object p0

    .line 228
    :pswitch_11
    new-instance p0, La/kaw;

    .line 229
    .line 230
    check-cast v1, La/a2y;

    .line 231
    .line 232
    const/16 v0, 0xb

    .line 233
    .line 234
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 235
    .line 236
    .line 237
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 238
    .line 239
    return-object p0

    .line 240
    :pswitch_12
    new-instance p0, La/kaw;

    .line 241
    .line 242
    check-cast v1, La/hzx;

    .line 243
    .line 244
    const/16 v0, 0xa

    .line 245
    .line 246
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 247
    .line 248
    .line 249
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 250
    .line 251
    return-object p0

    .line 252
    :pswitch_13
    new-instance p0, La/kaw;

    .line 253
    .line 254
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 255
    .line 256
    const/16 v0, 0x9

    .line 257
    .line 258
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 259
    .line 260
    .line 261
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 262
    .line 263
    return-object p0

    .line 264
    :pswitch_14
    new-instance p0, La/kaw;

    .line 265
    .line 266
    check-cast v1, La/yax;

    .line 267
    .line 268
    const/16 v0, 0x8

    .line 269
    .line 270
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 271
    .line 272
    .line 273
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 274
    .line 275
    return-object p0

    .line 276
    :pswitch_15
    new-instance p0, La/kaw;

    .line 277
    .line 278
    check-cast v1, La/qqw;

    .line 279
    .line 280
    const/4 v0, 0x7

    .line 281
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 282
    .line 283
    .line 284
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 285
    .line 286
    return-object p0

    .line 287
    :pswitch_16
    new-instance p0, La/kaw;

    .line 288
    .line 289
    check-cast v1, La/yow;

    .line 290
    .line 291
    const/4 v0, 0x6

    .line 292
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 293
    .line 294
    .line 295
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 296
    .line 297
    return-object p0

    .line 298
    :pswitch_17
    new-instance p0, La/kaw;

    .line 299
    .line 300
    check-cast v1, La/snw;

    .line 301
    .line 302
    const/4 v0, 0x5

    .line 303
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 304
    .line 305
    .line 306
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 307
    .line 308
    return-object p0

    .line 309
    :pswitch_18
    new-instance p1, La/kaw;

    .line 310
    .line 311
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 312
    .line 313
    check-cast p0, La/whw;

    .line 314
    .line 315
    check-cast v1, La/ukw;

    .line 316
    .line 317
    const/4 v0, 0x4

    .line 318
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 319
    .line 320
    .line 321
    return-object p1

    .line 322
    :pswitch_19
    new-instance p0, La/kaw;

    .line 323
    .line 324
    check-cast v1, La/tkw;

    .line 325
    .line 326
    const/4 v0, 0x3

    .line 327
    invoke-direct {p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 328
    .line 329
    .line 330
    iput-object p1, p0, La/kaw;->j:Ljava/lang/Object;

    .line 331
    .line 332
    return-object p0

    .line 333
    :pswitch_1a
    new-instance p1, La/kaw;

    .line 334
    .line 335
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 338
    .line 339
    check-cast v1, La/bjw;

    .line 340
    .line 341
    const/4 v0, 0x2

    .line 342
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 343
    .line 344
    .line 345
    return-object p1

    .line 346
    :pswitch_1b
    new-instance p1, La/kaw;

    .line 347
    .line 348
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 349
    .line 350
    check-cast p0, La/scw;

    .line 351
    .line 352
    check-cast v1, La/hfw;

    .line 353
    .line 354
    const/4 v0, 0x1

    .line 355
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 356
    .line 357
    .line 358
    return-object p1

    .line 359
    :pswitch_1c
    new-instance p1, La/kaw;

    .line 360
    .line 361
    iget-object p0, p0, La/kaw;->j:Ljava/lang/Object;

    .line 362
    .line 363
    check-cast p0, La/naw;

    .line 364
    .line 365
    check-cast v1, La/n3w;

    .line 366
    .line 367
    const/4 v0, 0x0

    .line 368
    invoke-direct {p1, p0, v1, p2, v0}, La/kaw;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 369
    .line 370
    .line 371
    return-object p1

    .line 372
    nop

    .line 373
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kaw;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/kaw;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/kam0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/kaw;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/w210;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/kaw;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/jt00;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/kaw;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/vne;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/kaw;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/sf50;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/kaw;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/vne;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/kaw;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_6
    check-cast p1, La/vne;

    .line 126
    .line 127
    check-cast p2, La/yje;

    .line 128
    .line 129
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 130
    .line 131
    .line 132
    move-result-object p0

    .line 133
    check-cast p0, La/kaw;

    .line 134
    .line 135
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 136
    .line 137
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    return-object p0

    .line 142
    :pswitch_7
    check-cast p1, La/tm00;

    .line 143
    .line 144
    check-cast p2, La/yje;

    .line 145
    .line 146
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, La/kaw;

    .line 151
    .line 152
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 153
    .line 154
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    return-object p0

    .line 159
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 160
    .line 161
    check-cast p2, La/yje;

    .line 162
    .line 163
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    check-cast p0, La/kaw;

    .line 168
    .line 169
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    return-object p0

    .line 176
    :pswitch_9
    check-cast p1, La/sw00;

    .line 177
    .line 178
    check-cast p2, La/yje;

    .line 179
    .line 180
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 181
    .line 182
    .line 183
    move-result-object p0

    .line 184
    check-cast p0, La/kaw;

    .line 185
    .line 186
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    :pswitch_a
    check-cast p1, La/uaq0;

    .line 194
    .line 195
    check-cast p2, La/yje;

    .line 196
    .line 197
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    check-cast p0, La/kaw;

    .line 202
    .line 203
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p0

    .line 209
    return-object p0

    .line 210
    :pswitch_b
    check-cast p1, La/vne;

    .line 211
    .line 212
    check-cast p2, La/yje;

    .line 213
    .line 214
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 215
    .line 216
    .line 217
    move-result-object p0

    .line 218
    check-cast p0, La/kaw;

    .line 219
    .line 220
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 221
    .line 222
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object p0

    .line 226
    return-object p0

    .line 227
    :pswitch_c
    check-cast p1, La/uaq0;

    .line 228
    .line 229
    check-cast p2, La/yje;

    .line 230
    .line 231
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    check-cast p0, La/kaw;

    .line 236
    .line 237
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    return-object p0

    .line 244
    :pswitch_d
    check-cast p1, Ljava/lang/String;

    .line 245
    .line 246
    check-cast p2, La/yje;

    .line 247
    .line 248
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    check-cast p0, La/kaw;

    .line 253
    .line 254
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 255
    .line 256
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object p0

    .line 260
    return-object p0

    .line 261
    :pswitch_e
    check-cast p1, Ljava/lang/Throwable;

    .line 262
    .line 263
    check-cast p2, La/yje;

    .line 264
    .line 265
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 266
    .line 267
    .line 268
    move-result-object p0

    .line 269
    check-cast p0, La/kaw;

    .line 270
    .line 271
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 272
    .line 273
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p0

    .line 277
    return-object p0

    .line 278
    :pswitch_f
    check-cast p1, Ljava/lang/Throwable;

    .line 279
    .line 280
    check-cast p2, La/yje;

    .line 281
    .line 282
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 283
    .line 284
    .line 285
    move-result-object p0

    .line 286
    check-cast p0, La/kaw;

    .line 287
    .line 288
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 289
    .line 290
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object p0

    .line 294
    return-object p0

    .line 295
    :pswitch_10
    check-cast p1, Ljava/lang/Throwable;

    .line 296
    .line 297
    check-cast p2, La/yje;

    .line 298
    .line 299
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 300
    .line 301
    .line 302
    move-result-object p0

    .line 303
    check-cast p0, La/kaw;

    .line 304
    .line 305
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object p0

    .line 311
    return-object p0

    .line 312
    :pswitch_11
    check-cast p1, Ljava/lang/Throwable;

    .line 313
    .line 314
    check-cast p2, La/yje;

    .line 315
    .line 316
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 317
    .line 318
    .line 319
    move-result-object p0

    .line 320
    check-cast p0, La/kaw;

    .line 321
    .line 322
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 323
    .line 324
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    return-object p0

    .line 329
    :pswitch_12
    check-cast p1, Ljava/lang/String;

    .line 330
    .line 331
    check-cast p2, La/yje;

    .line 332
    .line 333
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/kaw;

    .line 338
    .line 339
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    return-object p0

    .line 346
    :pswitch_13
    check-cast p1, La/vne;

    .line 347
    .line 348
    check-cast p2, La/yje;

    .line 349
    .line 350
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 351
    .line 352
    .line 353
    move-result-object p0

    .line 354
    check-cast p0, La/kaw;

    .line 355
    .line 356
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 357
    .line 358
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object p0

    .line 362
    return-object p0

    .line 363
    :pswitch_14
    check-cast p1, La/fbx;

    .line 364
    .line 365
    check-cast p2, La/yje;

    .line 366
    .line 367
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 368
    .line 369
    .line 370
    move-result-object p0

    .line 371
    check-cast p0, La/kaw;

    .line 372
    .line 373
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 374
    .line 375
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object p0

    .line 379
    return-object p0

    .line 380
    :pswitch_15
    check-cast p1, La/uaq0;

    .line 381
    .line 382
    check-cast p2, La/yje;

    .line 383
    .line 384
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, La/kaw;

    .line 389
    .line 390
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    .line 394
    .line 395
    move-result-object p0

    .line 396
    return-object p0

    .line 397
    :pswitch_16
    check-cast p1, Ljava/lang/Throwable;

    .line 398
    .line 399
    check-cast p2, La/yje;

    .line 400
    .line 401
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 402
    .line 403
    .line 404
    move-result-object p0

    .line 405
    check-cast p0, La/kaw;

    .line 406
    .line 407
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 408
    .line 409
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object p0

    .line 413
    return-object p0

    .line 414
    :pswitch_17
    check-cast p1, La/uaq0;

    .line 415
    .line 416
    check-cast p2, La/yje;

    .line 417
    .line 418
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 419
    .line 420
    .line 421
    move-result-object p0

    .line 422
    check-cast p0, La/kaw;

    .line 423
    .line 424
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 425
    .line 426
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object p0

    .line 430
    return-object p0

    .line 431
    :pswitch_18
    check-cast p1, La/vne;

    .line 432
    .line 433
    check-cast p2, La/yje;

    .line 434
    .line 435
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 436
    .line 437
    .line 438
    move-result-object p0

    .line 439
    check-cast p0, La/kaw;

    .line 440
    .line 441
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 442
    .line 443
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object p0

    .line 447
    return-object p0

    .line 448
    :pswitch_19
    check-cast p1, La/viw;

    .line 449
    .line 450
    check-cast p2, La/yje;

    .line 451
    .line 452
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    check-cast p0, La/kaw;

    .line 457
    .line 458
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 459
    .line 460
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object p0

    .line 464
    return-object p0

    .line 465
    :pswitch_1a
    check-cast p1, La/vne;

    .line 466
    .line 467
    check-cast p2, La/yje;

    .line 468
    .line 469
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 470
    .line 471
    .line 472
    move-result-object p0

    .line 473
    check-cast p0, La/kaw;

    .line 474
    .line 475
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 476
    .line 477
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object p0

    .line 481
    return-object p0

    .line 482
    :pswitch_1b
    check-cast p1, La/vne;

    .line 483
    .line 484
    check-cast p2, La/yje;

    .line 485
    .line 486
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 487
    .line 488
    .line 489
    move-result-object p0

    .line 490
    check-cast p0, La/kaw;

    .line 491
    .line 492
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 493
    .line 494
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object p0

    .line 498
    return-object p0

    .line 499
    :pswitch_1c
    check-cast p1, La/vne;

    .line 500
    .line 501
    check-cast p2, La/yje;

    .line 502
    .line 503
    invoke-virtual {p0, p1, p2}, La/kaw;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 504
    .line 505
    .line 506
    move-result-object p0

    .line 507
    check-cast p0, La/kaw;

    .line 508
    .line 509
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 510
    .line 511
    invoke-virtual {p0, p1}, La/kaw;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object p0

    .line 515
    return-object p0

    .line 516
    nop

    .line 517
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kaw;->i:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    iget-object v8, v0, La/kaw;->k:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    sget-object v0, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    check-cast v8, Ljava/util/List;

    .line 23
    .line 24
    new-instance v0, La/wii0;

    .line 25
    .line 26
    invoke-direct {v0}, La/wii0;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, La/fot0;

    .line 44
    .line 45
    iget-object v2, v2, La/fot0;->p:La/xii0;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, La/wii0;->a(La/xii0;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-virtual {v0}, La/wii0;->b()La/xii0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    iget-object v0, v0, La/xii0;->g:La/t7a;

    .line 56
    .line 57
    invoke-virtual {v0}, La/t7a;->a()Landroid/util/Range;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0}, Landroid/util/Range;->getUpper()Ljava/lang/Comparable;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    check-cast v0, Ljava/lang/Number;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    const/16 v1, 0x1e

    .line 72
    .line 73
    if-le v0, v1, :cond_1

    .line 74
    .line 75
    move v5, v6

    .line 76
    :cond_1
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    return-object v0

    .line 81
    :pswitch_0
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, La/kam0;

    .line 84
    .line 85
    sget-object v1, La/wne;->a:La/wne;

    .line 86
    .line 87
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-boolean v0, v0, La/kam0;->b:Z

    .line 91
    .line 92
    if-eqz v0, :cond_3

    .line 93
    .line 94
    check-cast v8, La/b310;

    .line 95
    .line 96
    iget-object v0, v8, La/b310;->K:La/p7m0;

    .line 97
    .line 98
    :cond_2
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    move-object v2, v1

    .line 103
    check-cast v2, Ljava/lang/Boolean;

    .line 104
    .line 105
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 109
    .line 110
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-eqz v1, :cond_2

    .line 115
    .line 116
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_1
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v0, La/w210;

    .line 122
    .line 123
    sget-object v1, La/wne;->a:La/wne;

    .line 124
    .line 125
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    if-eqz v0, :cond_5

    .line 129
    .line 130
    move-object v11, v8

    .line 131
    check-cast v11, La/k210;

    .line 132
    .line 133
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    iget v0, v0, La/w210;->a:I

    .line 138
    .line 139
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    iget-object v9, v11, La/k210;->M1:La/wdk0;

    .line 147
    .line 148
    if-eqz v9, :cond_4

    .line 149
    .line 150
    new-instance v10, La/xdk0;

    .line 151
    .line 152
    sget-object v13, La/rek0;->b:La/rek0;

    .line 153
    .line 154
    const/16 v18, 0x0

    .line 155
    .line 156
    const/16 v19, 0x7c

    .line 157
    .line 158
    const/4 v15, 0x0

    .line 159
    const/16 v16, 0x0

    .line 160
    .line 161
    const/16 v17, 0x0

    .line 162
    .line 163
    move-object v12, v10

    .line 164
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 165
    .line 166
    .line 167
    const/16 v16, 0x3fc

    .line 168
    .line 169
    const/4 v12, 0x0

    .line 170
    const/4 v13, 0x0

    .line 171
    const/4 v14, 0x0

    .line 172
    invoke-static/range {v9 .. v16}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 173
    .line 174
    .line 175
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 176
    .line 177
    goto :goto_1

    .line 178
    :cond_4
    const-string v0, "snackbarManager"

    .line 179
    .line 180
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 181
    .line 182
    .line 183
    throw v7

    .line 184
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 185
    .line 186
    .line 187
    :goto_1
    return-object v7

    .line 188
    :pswitch_2
    move-object v10, v8

    .line 189
    check-cast v10, La/ct00;

    .line 190
    .line 191
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast v0, La/jt00;

    .line 194
    .line 195
    sget-object v1, La/wne;->a:La/wne;

    .line 196
    .line 197
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    if-eqz v0, :cond_7

    .line 201
    .line 202
    instance-of v1, v0, La/ht00;

    .line 203
    .line 204
    if-eqz v1, :cond_6

    .line 205
    .line 206
    check-cast v0, La/ht00;

    .line 207
    .line 208
    iget-object v0, v0, La/ht00;->a:La/rue0;

    .line 209
    .line 210
    sget-object v1, La/ct00;->n2:La/atz;

    .line 211
    .line 212
    invoke-virtual {v10}, La/ct00;->P0()La/ft00;

    .line 213
    .line 214
    .line 215
    move-result-object v1

    .line 216
    iget-object v1, v1, La/ft00;->b:Ljava/lang/String;

    .line 217
    .line 218
    invoke-virtual {v10}, La/ct00;->P0()La/ft00;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    iget-object v2, v2, La/ft00;->b:Ljava/lang/String;

    .line 223
    .line 224
    new-instance v3, Lkotlin/Pair;

    .line 225
    .line 226
    invoke-direct {v3, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 227
    .line 228
    .line 229
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    invoke-static {v0, v10, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v10}, La/yo8;->y0()V

    .line 241
    .line 242
    .line 243
    goto :goto_2

    .line 244
    :cond_6
    instance-of v0, v0, La/it00;

    .line 245
    .line 246
    if-eqz v0, :cond_7

    .line 247
    .line 248
    sget-object v0, La/ct00;->n2:La/atz;

    .line 249
    .line 250
    iget-object v0, v10, La/ct00;->k2:La/a8z;

    .line 251
    .line 252
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, La/zji;

    .line 257
    .line 258
    iget-object v8, v0, La/zji;->e:La/wdk0;

    .line 259
    .line 260
    new-instance v0, La/xdk0;

    .line 261
    .line 262
    sget-object v1, La/rek0;->b:La/rek0;

    .line 263
    .line 264
    const v2, 0x7f1307bb

    .line 265
    .line 266
    .line 267
    invoke-virtual {v10, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v2

    .line 271
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 272
    .line 273
    .line 274
    const/4 v6, 0x0

    .line 275
    const/16 v7, 0x7c

    .line 276
    .line 277
    const/4 v3, 0x0

    .line 278
    const/4 v4, 0x0

    .line 279
    const/4 v5, 0x0

    .line 280
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 281
    .line 282
    .line 283
    const/4 v14, 0x0

    .line 284
    const/16 v15, 0x3fc

    .line 285
    .line 286
    const/4 v11, 0x0

    .line 287
    const/4 v12, 0x0

    .line 288
    const/4 v13, 0x0

    .line 289
    move-object v9, v0

    .line 290
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 291
    .line 292
    .line 293
    :goto_2
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 294
    .line 295
    goto :goto_3

    .line 296
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 297
    .line 298
    .line 299
    :goto_3
    return-object v7

    .line 300
    :pswitch_3
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 301
    .line 302
    move-object v9, v0

    .line 303
    check-cast v9, La/vne;

    .line 304
    .line 305
    sget-object v0, La/wne;->a:La/wne;

    .line 306
    .line 307
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 308
    .line 309
    .line 310
    new-instance v0, La/slx;

    .line 311
    .line 312
    check-cast v8, Lorg/xplatform/localtimedif/impl/presentation/localtimediffworker/LocalTimeDiffWorker;

    .line 313
    .line 314
    const/16 v1, 0x13

    .line 315
    .line 316
    invoke-direct {v0, v8, v7, v1}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 317
    .line 318
    .line 319
    new-instance v1, La/km00;

    .line 320
    .line 321
    invoke-direct {v1, v8, v4}, La/km00;-><init>(Ljava/lang/Object;B)V

    .line 322
    .line 323
    .line 324
    const/16 v20, 0x0

    .line 325
    .line 326
    const/16 v21, 0x2dc

    .line 327
    .line 328
    const-string v10, "LocalTimeDiffWorker"

    .line 329
    .line 330
    const/4 v11, 0x5

    .line 331
    const-wide/16 v12, 0x0

    .line 332
    .line 333
    const/4 v14, 0x0

    .line 334
    const/4 v15, 0x0

    .line 335
    const/16 v17, 0x0

    .line 336
    .line 337
    const/16 v18, 0x0

    .line 338
    .line 339
    move-object/from16 v16, v0

    .line 340
    .line 341
    move-object/from16 v19, v1

    .line 342
    .line 343
    invoke-static/range {v9 .. v21}, La/sac;->i0(La/vne;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;I)La/bby;

    .line 344
    .line 345
    .line 346
    move-result-object v0

    .line 347
    return-object v0

    .line 348
    :pswitch_4
    check-cast v8, La/bq00;

    .line 349
    .line 350
    iget-object v1, v8, La/bq00;->j0:La/p7m0;

    .line 351
    .line 352
    iget-object v2, v8, La/bq00;->p:La/gr00;

    .line 353
    .line 354
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 355
    .line 356
    check-cast v0, La/sf50;

    .line 357
    .line 358
    sget-object v3, La/wne;->a:La/wne;

    .line 359
    .line 360
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 361
    .line 362
    .line 363
    sget-object v3, La/nf50;->a:La/nf50;

    .line 364
    .line 365
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    move-result v4

    .line 369
    if-nez v4, :cond_12

    .line 370
    .line 371
    sget-object v4, La/of50;->a:La/of50;

    .line 372
    .line 373
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 374
    .line 375
    .line 376
    move-result v4

    .line 377
    if-eqz v4, :cond_8

    .line 378
    .line 379
    goto/16 :goto_9

    .line 380
    .line 381
    :cond_8
    sget-object v4, La/rf50;->a:La/rf50;

    .line 382
    .line 383
    invoke-static {v0, v4}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    move-result v4

    .line 387
    if-eqz v4, :cond_a

    .line 388
    .line 389
    iget-object v0, v2, La/gr00;->a:Ljava/lang/Object;

    .line 390
    .line 391
    check-cast v0, La/i1w0;

    .line 392
    .line 393
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    new-instance v2, Lorg/xplatform/proxy/navigation/ProxySettingsScreen;

    .line 398
    .line 399
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 400
    .line 401
    .line 402
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 403
    .line 404
    if-eqz v3, :cond_9

    .line 405
    .line 406
    new-instance v3, La/e1w0;

    .line 407
    .line 408
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 409
    .line 410
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 411
    .line 412
    .line 413
    new-instance v2, La/c8d;

    .line 414
    .line 415
    sget-object v4, La/y7d;->a:La/v7d;

    .line 416
    .line 417
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 421
    .line 422
    .line 423
    goto :goto_4

    .line 424
    :cond_9
    new-instance v3, La/w0w0;

    .line 425
    .line 426
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 427
    .line 428
    .line 429
    new-instance v2, La/c8d;

    .line 430
    .line 431
    sget-object v4, La/y7d;->a:La/v7d;

    .line 432
    .line 433
    invoke-direct {v2, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 437
    .line 438
    .line 439
    :goto_4
    invoke-static {v0, v1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    :goto_5
    move-object v2, v1

    .line 444
    check-cast v2, La/paw;

    .line 445
    .line 446
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 447
    .line 448
    .line 449
    move-result v3

    .line 450
    if-eqz v3, :cond_10

    .line 451
    .line 452
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    check-cast v2, La/oe50;

    .line 457
    .line 458
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 459
    .line 460
    .line 461
    goto :goto_5

    .line 462
    :cond_a
    instance-of v4, v0, La/pf50;

    .line 463
    .line 464
    if-eqz v4, :cond_c

    .line 465
    .line 466
    invoke-virtual {v8}, La/i3t0;->D()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v4

    .line 470
    check-cast v4, La/cp00;

    .line 471
    .line 472
    iget-boolean v4, v4, La/cp00;->l:Z

    .line 473
    .line 474
    if-eqz v4, :cond_b

    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual {v1, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    goto/16 :goto_8

    .line 483
    .line 484
    :cond_b
    check-cast v0, La/pf50;

    .line 485
    .line 486
    iget-object v0, v0, La/pf50;->a:La/im3;

    .line 487
    .line 488
    iget-object v1, v2, La/gr00;->a:Ljava/lang/Object;

    .line 489
    .line 490
    check-cast v1, La/i1w0;

    .line 491
    .line 492
    new-instance v3, La/b33;

    .line 493
    .line 494
    invoke-direct {v3, v0, v2}, La/b33;-><init>(La/im3;La/gr00;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v1, v3}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 498
    .line 499
    .line 500
    goto :goto_8

    .line 501
    :cond_c
    instance-of v4, v0, La/qf50;

    .line 502
    .line 503
    if-eqz v4, :cond_11

    .line 504
    .line 505
    check-cast v0, La/qf50;

    .line 506
    .line 507
    sget v4, La/bq00;->n0:I

    .line 508
    .line 509
    iget-boolean v4, v0, La/qf50;->a:Z

    .line 510
    .line 511
    if-eqz v4, :cond_d

    .line 512
    .line 513
    invoke-virtual {v2}, La/gr00;->C()V

    .line 514
    .line 515
    .line 516
    goto :goto_8

    .line 517
    :cond_d
    iget-boolean v0, v0, La/qf50;->b:Z

    .line 518
    .line 519
    if-eqz v0, :cond_f

    .line 520
    .line 521
    iget-object v0, v2, La/gr00;->a:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, La/i1w0;

    .line 524
    .line 525
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    new-instance v2, La/i38;

    .line 530
    .line 531
    const/16 v3, 0x11

    .line 532
    .line 533
    invoke-direct {v2, v3}, La/i38;-><init>(I)V

    .line 534
    .line 535
    .line 536
    new-instance v3, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 537
    .line 538
    invoke-direct {v3, v2}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 539
    .line 540
    .line 541
    instance-of v2, v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 542
    .line 543
    if-eqz v2, :cond_e

    .line 544
    .line 545
    new-instance v2, La/e1w0;

    .line 546
    .line 547
    check-cast v3, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 548
    .line 549
    invoke-direct {v2, v3}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 550
    .line 551
    .line 552
    new-instance v3, La/c8d;

    .line 553
    .line 554
    sget-object v4, La/y7d;->a:La/v7d;

    .line 555
    .line 556
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 557
    .line 558
    .line 559
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 560
    .line 561
    .line 562
    goto :goto_6

    .line 563
    :cond_e
    new-instance v2, La/w0w0;

    .line 564
    .line 565
    invoke-direct {v2, v3}, La/w0w0;-><init>(La/m7h0;)V

    .line 566
    .line 567
    .line 568
    new-instance v3, La/c8d;

    .line 569
    .line 570
    sget-object v4, La/y7d;->a:La/v7d;

    .line 571
    .line 572
    invoke-direct {v3, v4, v2}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 576
    .line 577
    .line 578
    :goto_6
    invoke-static {v0, v1, v5}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 579
    .line 580
    .line 581
    move-result-object v1

    .line 582
    :goto_7
    move-object v2, v1

    .line 583
    check-cast v2, La/paw;

    .line 584
    .line 585
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v3

    .line 589
    if-eqz v3, :cond_10

    .line 590
    .line 591
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    check-cast v2, La/oe50;

    .line 596
    .line 597
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 598
    .line 599
    .line 600
    goto :goto_7

    .line 601
    :cond_f
    iget-object v0, v8, La/bq00;->M:La/xqt0;

    .line 602
    .line 603
    invoke-virtual {v0}, La/vw5;->g()V

    .line 604
    .line 605
    .line 606
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 607
    .line 608
    .line 609
    invoke-virtual {v1, v7, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 610
    .line 611
    .line 612
    :cond_10
    :goto_8
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    goto :goto_a

    .line 615
    :cond_11
    invoke-static {}, La/t9f;->b()V

    .line 616
    .line 617
    .line 618
    goto :goto_a

    .line 619
    :cond_12
    :goto_9
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    :goto_a
    return-object v7

    .line 622
    :pswitch_5
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 623
    .line 624
    check-cast v0, La/vne;

    .line 625
    .line 626
    sget-object v0, La/wne;->a:La/wne;

    .line 627
    .line 628
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 629
    .line 630
    .line 631
    check-cast v8, La/co00;

    .line 632
    .line 633
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 634
    .line 635
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    if-eqz v0, :cond_13

    .line 640
    .line 641
    invoke-static {v0}, Landroid/webkit/WebSettings;->getDefaultUserAgent(Landroid/content/Context;)Ljava/lang/String;

    .line 642
    .line 643
    .line 644
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 645
    goto :goto_b

    .line 646
    :catchall_0
    move-exception v0

    .line 647
    goto :goto_c

    .line 648
    :cond_13
    :goto_b
    if-nez v7, :cond_14

    .line 649
    .line 650
    move-object v7, v2

    .line 651
    goto :goto_d

    .line 652
    :goto_c
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 653
    .line 654
    new-instance v7, La/g0g0;

    .line 655
    .line 656
    invoke-direct {v7, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 657
    .line 658
    .line 659
    :cond_14
    :goto_d
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    if-eqz v0, :cond_16

    .line 664
    .line 665
    const v1, 0x7f1317e5

    .line 666
    .line 667
    .line 668
    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0

    .line 672
    if-nez v0, :cond_15

    .line 673
    .line 674
    goto :goto_e

    .line 675
    :cond_15
    move-object v2, v0

    .line 676
    :cond_16
    :goto_e
    instance-of v0, v7, La/g0g0;

    .line 677
    .line 678
    if-eqz v0, :cond_17

    .line 679
    .line 680
    move-object v7, v2

    .line 681
    :cond_17
    check-cast v7, Ljava/lang/String;

    .line 682
    .line 683
    invoke-virtual {v8}, La/co00;->G0()La/k3t0;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    new-instance v1, La/rk00;

    .line 688
    .line 689
    invoke-direct {v1, v7}, La/rk00;-><init>(Ljava/lang/String;)V

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 693
    .line 694
    .line 695
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object v0

    .line 698
    :pswitch_6
    sget-object v1, La/wne;->a:La/wne;

    .line 699
    .line 700
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 704
    .line 705
    check-cast v0, La/xm00;

    .line 706
    .line 707
    iget-object v1, v0, La/xm00;->b:La/duj;

    .line 708
    .line 709
    check-cast v8, Ljava/lang/Throwable;

    .line 710
    .line 711
    new-instance v2, La/r7y;

    .line 712
    .line 713
    const/16 v3, 0x18

    .line 714
    .line 715
    invoke-direct {v2, v8, v0, v3}, La/r7y;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v1, v8, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 719
    .line 720
    .line 721
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 722
    .line 723
    return-object v0

    .line 724
    :pswitch_7
    check-cast v8, La/yl00;

    .line 725
    .line 726
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 727
    .line 728
    check-cast v0, La/tm00;

    .line 729
    .line 730
    sget-object v1, La/wne;->a:La/wne;

    .line 731
    .line 732
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 733
    .line 734
    .line 735
    sget-object v1, La/sm00;->a:La/sm00;

    .line 736
    .line 737
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 738
    .line 739
    .line 740
    move-result v1

    .line 741
    if-eqz v1, :cond_18

    .line 742
    .line 743
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    iget-object v0, v0, La/zl00;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 748
    .line 749
    invoke-virtual {v0, v5}, Landroid/view/View;->setClickable(Z)V

    .line 750
    .line 751
    .line 752
    goto :goto_f

    .line 753
    :cond_18
    instance-of v1, v0, La/pm00;

    .line 754
    .line 755
    if-eqz v1, :cond_19

    .line 756
    .line 757
    sget-object v1, La/yl00;->n2:La/htz;

    .line 758
    .line 759
    invoke-virtual {v8, v5}, La/yl00;->W0(Z)V

    .line 760
    .line 761
    .line 762
    invoke-static {v2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 763
    .line 764
    .line 765
    move-result v1

    .line 766
    xor-int/2addr v1, v6

    .line 767
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 768
    .line 769
    .line 770
    move-result-object v3

    .line 771
    iget-object v3, v3, La/zl00;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 772
    .line 773
    invoke-virtual {v3, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 777
    .line 778
    .line 779
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 780
    .line 781
    .line 782
    move-result-object v1

    .line 783
    iget-object v1, v1, La/zl00;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 784
    .line 785
    invoke-virtual {v1, v6}, Landroid/view/View;->setClickable(Z)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 789
    .line 790
    .line 791
    move-result-object v1

    .line 792
    iget-object v1, v1, La/zl00;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 793
    .line 794
    check-cast v0, La/pm00;

    .line 795
    .line 796
    iget-boolean v0, v0, La/pm00;->a:Z

    .line 797
    .line 798
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/buttons/DsButton;->setEnabled(Z)V

    .line 799
    .line 800
    .line 801
    goto :goto_f

    .line 802
    :cond_19
    instance-of v1, v0, La/qm00;

    .line 803
    .line 804
    if-eqz v1, :cond_1a

    .line 805
    .line 806
    sget-object v1, La/yl00;->n2:La/htz;

    .line 807
    .line 808
    invoke-virtual {v8, v5}, La/yl00;->W0(Z)V

    .line 809
    .line 810
    .line 811
    check-cast v0, La/qm00;

    .line 812
    .line 813
    iget-object v0, v0, La/qm00;->a:Ljava/lang/String;

    .line 814
    .line 815
    invoke-static {v0}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 816
    .line 817
    .line 818
    move-result v1

    .line 819
    xor-int/2addr v1, v6

    .line 820
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 821
    .line 822
    .line 823
    move-result-object v2

    .line 824
    iget-object v2, v2, La/zl00;->c:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 825
    .line 826
    invoke-virtual {v2, v0}, Lorg/xplatform/uikit/components/text_field/DsTextField;->setErrorText(Ljava/lang/CharSequence;)V

    .line 827
    .line 828
    .line 829
    invoke-virtual {v2, v1}, Lorg/xplatform/uikit/components/text_field/DsTextField;->f(Z)V

    .line 830
    .line 831
    .line 832
    invoke-virtual {v8}, La/yl00;->V0()La/zl00;

    .line 833
    .line 834
    .line 835
    move-result-object v0

    .line 836
    iget-object v0, v0, La/zl00;->b:Lorg/xplatform/uikit/components/buttons/DsButton;

    .line 837
    .line 838
    invoke-virtual {v0, v6}, Landroid/view/View;->setClickable(Z)V

    .line 839
    .line 840
    .line 841
    :cond_1a
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 842
    .line 843
    return-object v0

    .line 844
    :pswitch_8
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 845
    .line 846
    move-object/from16 v16, v0

    .line 847
    .line 848
    check-cast v16, Ljava/lang/String;

    .line 849
    .line 850
    sget-object v0, La/wne;->a:La/wne;

    .line 851
    .line 852
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 853
    .line 854
    .line 855
    move-object v1, v8

    .line 856
    check-cast v1, La/qi00;

    .line 857
    .line 858
    sget v0, La/qi00;->I:I

    .line 859
    .line 860
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 861
    .line 862
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 863
    .line 864
    :goto_10
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 869
    .line 870
    .line 871
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 872
    .line 873
    move-object v9, v0

    .line 874
    check-cast v9, La/nj00;

    .line 875
    .line 876
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 877
    .line 878
    .line 879
    const/16 v17, 0x0

    .line 880
    .line 881
    const/16 v18, 0x17f

    .line 882
    .line 883
    const/4 v10, 0x0

    .line 884
    const/4 v11, 0x0

    .line 885
    const/4 v12, 0x0

    .line 886
    const/4 v13, 0x0

    .line 887
    const/4 v14, 0x0

    .line 888
    const/4 v15, 0x0

    .line 889
    invoke-static/range {v9 .. v18}, La/nj00;->a(La/nj00;Ljava/lang/String;La/mj00;Ljava/util/List;La/ais;Ljava/util/Set;ZLjava/lang/String;ZI)La/nj00;

    .line 890
    .line 891
    .line 892
    move-result-object v3

    .line 893
    move-object/from16 v4, v16

    .line 894
    .line 895
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 896
    .line 897
    .line 898
    move-result v0

    .line 899
    if-eqz v0, :cond_1b

    .line 900
    .line 901
    iget-object v0, v1, La/qi00;->o:La/vzg0;

    .line 902
    .line 903
    const-string v1, "QUERY_STATE_KEY"

    .line 904
    .line 905
    invoke-virtual {v0, v1, v4}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :cond_1b
    move-object/from16 v16, v4

    .line 912
    .line 913
    goto :goto_10

    .line 914
    :pswitch_9
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 915
    .line 916
    check-cast v0, La/sw00;

    .line 917
    .line 918
    sget-object v1, La/wne;->a:La/wne;

    .line 919
    .line 920
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 921
    .line 922
    .line 923
    iget-boolean v1, v0, La/sw00;->b:Z

    .line 924
    .line 925
    iget-boolean v0, v0, La/sw00;->a:Z

    .line 926
    .line 927
    if-eq v1, v0, :cond_1c

    .line 928
    .line 929
    check-cast v8, La/ef00;

    .line 930
    .line 931
    iget-object v0, v8, La/ef00;->q0:La/nhf0;

    .line 932
    .line 933
    invoke-virtual {v0}, La/nhf0;->y()Z

    .line 934
    .line 935
    .line 936
    :cond_1c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 937
    .line 938
    return-object v0

    .line 939
    :pswitch_a
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 940
    .line 941
    move-object/from16 v16, v0

    .line 942
    .line 943
    check-cast v16, La/uaq0;

    .line 944
    .line 945
    sget-object v0, La/wne;->a:La/wne;

    .line 946
    .line 947
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 948
    .line 949
    .line 950
    check-cast v8, La/gb00;

    .line 951
    .line 952
    sget v0, La/gb00;->x:I

    .line 953
    .line 954
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 955
    .line 956
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 957
    .line 958
    :cond_1d
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 963
    .line 964
    .line 965
    move-object v9, v0

    .line 966
    check-cast v9, La/ma00;

    .line 967
    .line 968
    const/4 v15, 0x0

    .line 969
    const/16 v17, 0xbf

    .line 970
    .line 971
    const/4 v10, 0x0

    .line 972
    const/4 v11, 0x0

    .line 973
    const/4 v12, 0x0

    .line 974
    const/4 v13, 0x0

    .line 975
    const/4 v14, 0x0

    .line 976
    invoke-static/range {v9 .. v17}, La/ma00;->a(La/ma00;ZZIIILa/l800;La/uaq0;I)La/ma00;

    .line 977
    .line 978
    .line 979
    move-result-object v2

    .line 980
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 981
    .line 982
    .line 983
    move-result v0

    .line 984
    if-eqz v0, :cond_1d

    .line 985
    .line 986
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 987
    .line 988
    return-object v0

    .line 989
    :pswitch_b
    sget-object v1, La/wne;->a:La/wne;

    .line 990
    .line 991
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 992
    .line 993
    .line 994
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 995
    .line 996
    check-cast v0, La/vne;

    .line 997
    .line 998
    check-cast v8, La/tkz;

    .line 999
    .line 1000
    iget-object v1, v8, La/tkz;->a:La/glz;

    .line 1001
    .line 1002
    iget-object v2, v1, La/glz;->i:La/lkz;

    .line 1003
    .line 1004
    sget-object v3, La/lkz;->b:La/lkz;

    .line 1005
    .line 1006
    invoke-virtual {v2, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    .line 1007
    .line 1008
    .line 1009
    move-result v2

    .line 1010
    if-ltz v2, :cond_1e

    .line 1011
    .line 1012
    invoke-virtual {v1, v8}, La/glz;->a(La/blz;)V

    .line 1013
    .line 1014
    .line 1015
    goto :goto_11

    .line 1016
    :cond_1e
    invoke-interface {v0}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 1017
    .line 1018
    .line 1019
    move-result-object v0

    .line 1020
    invoke-static {v0, v7}, La/zvw;->F(Lkotlin/coroutines/CoroutineContext;Ljava/util/concurrent/CancellationException;)V

    .line 1021
    .line 1022
    .line 1023
    :goto_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1024
    .line 1025
    return-object v0

    .line 1026
    :pswitch_c
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1027
    .line 1028
    move-object v5, v0

    .line 1029
    check-cast v5, La/uaq0;

    .line 1030
    .line 1031
    sget-object v0, La/wne;->a:La/wne;

    .line 1032
    .line 1033
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1034
    .line 1035
    .line 1036
    check-cast v8, La/u1z;

    .line 1037
    .line 1038
    iget-object v1, v8, La/u1z;->v:La/fhj;

    .line 1039
    .line 1040
    iget-object v2, v8, La/u1z;->o:Ljava/lang/String;

    .line 1041
    .line 1042
    iget-wide v3, v8, La/u1z;->p:J

    .line 1043
    .line 1044
    const-wide/16 v6, 0x0

    .line 1045
    .line 1046
    invoke-virtual/range {v1 .. v7}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v14

    .line 1050
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 1051
    .line 1052
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1053
    .line 1054
    :cond_1f
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v0

    .line 1058
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    move-object v9, v0

    .line 1062
    check-cast v9, La/d1z;

    .line 1063
    .line 1064
    const/16 v18, 0x0

    .line 1065
    .line 1066
    const/16 v19, 0x1ef

    .line 1067
    .line 1068
    const/4 v10, 0x0

    .line 1069
    const/4 v11, 0x0

    .line 1070
    const/4 v12, 0x0

    .line 1071
    const/4 v13, 0x0

    .line 1072
    const/4 v15, 0x0

    .line 1073
    const/16 v16, 0x0

    .line 1074
    .line 1075
    const/16 v17, 0x0

    .line 1076
    .line 1077
    invoke-static/range {v9 .. v19}, La/d1z;->a(La/d1z;ZZILa/zdm0;La/nc5;La/n3q;Ljava/util/ArrayList;La/hxs0;ZI)La/d1z;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    move-result v0

    .line 1085
    if-eqz v0, :cond_1f

    .line 1086
    .line 1087
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1088
    .line 1089
    return-object v0

    .line 1090
    :pswitch_d
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1091
    .line 1092
    move-object v10, v0

    .line 1093
    check-cast v10, Ljava/lang/String;

    .line 1094
    .line 1095
    sget-object v0, La/wne;->a:La/wne;

    .line 1096
    .line 1097
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1098
    .line 1099
    .line 1100
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 1101
    .line 1102
    check-cast v8, La/jty;

    .line 1103
    .line 1104
    invoke-virtual {v8}, La/jty;->Q0()La/kty;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    iget-object v9, v0, La/kty;->c:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1109
    .line 1110
    new-instance v14, La/adw;

    .line 1111
    .line 1112
    const/16 v0, 0x15

    .line 1113
    .line 1114
    invoke-direct {v14, v8, v0}, La/adw;-><init>(Ljava/lang/Object;B)V

    .line 1115
    .line 1116
    .line 1117
    const/4 v15, 0x0

    .line 1118
    const/16 v16, 0x174

    .line 1119
    .line 1120
    const v11, 0x7f080e17

    .line 1121
    .line 1122
    .line 1123
    const/4 v12, 0x0

    .line 1124
    const/4 v13, 0x0

    .line 1125
    invoke-static/range {v9 .. v16}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    return-object v0

    .line 1131
    :pswitch_e
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1132
    .line 1133
    check-cast v0, Ljava/lang/Throwable;

    .line 1134
    .line 1135
    sget-object v1, La/wne;->a:La/wne;

    .line 1136
    .line 1137
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1138
    .line 1139
    .line 1140
    check-cast v8, La/e6y;

    .line 1141
    .line 1142
    iget-object v1, v8, La/e6y;->z:La/duj;

    .line 1143
    .line 1144
    new-instance v2, La/a6y;

    .line 1145
    .line 1146
    invoke-direct {v2, v8, v4}, La/a6y;-><init>(La/e6y;B)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1150
    .line 1151
    .line 1152
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1153
    .line 1154
    return-object v0

    .line 1155
    :pswitch_f
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1156
    .line 1157
    check-cast v0, Ljava/lang/Throwable;

    .line 1158
    .line 1159
    sget-object v1, La/wne;->a:La/wne;

    .line 1160
    .line 1161
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1162
    .line 1163
    .line 1164
    check-cast v8, La/c5y;

    .line 1165
    .line 1166
    iget-object v1, v8, La/c5y;->y:La/duj;

    .line 1167
    .line 1168
    new-instance v2, La/z4y;

    .line 1169
    .line 1170
    invoke-direct {v2, v8, v3}, La/z4y;-><init>(La/c5y;B)V

    .line 1171
    .line 1172
    .line 1173
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1174
    .line 1175
    .line 1176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1177
    .line 1178
    return-object v0

    .line 1179
    :pswitch_10
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1180
    .line 1181
    check-cast v0, Ljava/lang/Throwable;

    .line 1182
    .line 1183
    sget-object v1, La/wne;->a:La/wne;

    .line 1184
    .line 1185
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1186
    .line 1187
    .line 1188
    check-cast v8, La/d4y;

    .line 1189
    .line 1190
    iget-object v1, v8, La/d4y;->y:La/duj;

    .line 1191
    .line 1192
    new-instance v2, La/a4y;

    .line 1193
    .line 1194
    invoke-direct {v2, v8, v3}, La/a4y;-><init>(La/d4y;B)V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1198
    .line 1199
    .line 1200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1201
    .line 1202
    return-object v0

    .line 1203
    :pswitch_11
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1204
    .line 1205
    check-cast v0, Ljava/lang/Throwable;

    .line 1206
    .line 1207
    sget-object v1, La/wne;->a:La/wne;

    .line 1208
    .line 1209
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1210
    .line 1211
    .line 1212
    check-cast v8, La/a2y;

    .line 1213
    .line 1214
    iget-object v1, v8, La/a2y;->z:La/duj;

    .line 1215
    .line 1216
    new-instance v2, La/v1y;

    .line 1217
    .line 1218
    invoke-direct {v2, v8, v4}, La/v1y;-><init>(La/a2y;B)V

    .line 1219
    .line 1220
    .line 1221
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1222
    .line 1223
    .line 1224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_12
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1228
    .line 1229
    check-cast v0, Ljava/lang/String;

    .line 1230
    .line 1231
    sget-object v1, La/wne;->a:La/wne;

    .line 1232
    .line 1233
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1234
    .line 1235
    .line 1236
    check-cast v8, La/hzx;

    .line 1237
    .line 1238
    sget-object v1, La/hzx;->j2:La/bst;

    .line 1239
    .line 1240
    iget-object v1, v8, La/hzx;->g2:La/phf0;

    .line 1241
    .line 1242
    sget-object v2, La/hzx;->k2:[La/iiy;

    .line 1243
    .line 1244
    aget-object v3, v2, v4

    .line 1245
    .line 1246
    invoke-virtual {v1, v8, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v3

    .line 1250
    invoke-static {v0, v3, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1251
    .line 1252
    .line 1253
    move-result v3

    .line 1254
    if-eqz v3, :cond_20

    .line 1255
    .line 1256
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    const-string v3, "code"

    .line 1261
    .line 1262
    invoke-virtual {v0, v3}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v11

    .line 1266
    if-eqz v11, :cond_20

    .line 1267
    .line 1268
    invoke-static {v11}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1269
    .line 1270
    .line 1271
    move-result v0

    .line 1272
    xor-int/2addr v0, v6

    .line 1273
    if-ne v0, v6, :cond_20

    .line 1274
    .line 1275
    new-instance v9, La/ghk0;

    .line 1276
    .line 1277
    aget-object v0, v2, v4

    .line 1278
    .line 1279
    invoke-virtual {v1, v8, v0}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    move-result-object v12

    .line 1283
    const/16 v17, 0x0

    .line 1284
    .line 1285
    const/16 v18, 0xf8

    .line 1286
    .line 1287
    const/16 v10, 0x1a

    .line 1288
    .line 1289
    const/4 v13, 0x0

    .line 1290
    const/4 v14, 0x0

    .line 1291
    const/4 v15, 0x0

    .line 1292
    const/16 v16, 0x0

    .line 1293
    .line 1294
    invoke-direct/range {v9 .. v18}, La/ghk0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 1295
    .line 1296
    .line 1297
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1298
    .line 1299
    .line 1300
    move-result-object v0

    .line 1301
    new-instance v1, Lkotlin/Pair;

    .line 1302
    .line 1303
    const-string v2, "SUCCESS_SOCIAL"

    .line 1304
    .line 1305
    invoke-direct {v1, v2, v9}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1306
    .line 1307
    .line 1308
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v1

    .line 1316
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v8}, La/sik;->y0()V

    .line 1320
    .line 1321
    .line 1322
    :cond_20
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_13
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1326
    .line 1327
    check-cast v0, La/vne;

    .line 1328
    .line 1329
    sget-object v1, La/wne;->a:La/wne;

    .line 1330
    .line 1331
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1332
    .line 1333
    .line 1334
    invoke-interface {v0}, La/vne;->getCoroutineContext()Lkotlin/coroutines/CoroutineContext;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v0

    .line 1338
    check-cast v8, Lkotlin/jvm/functions/Function0;

    .line 1339
    .line 1340
    :try_start_1
    new-instance v10, La/mcq0;

    .line 1341
    .line 1342
    invoke-direct {v10}, La/mcq0;-><init>()V

    .line 1343
    .line 1344
    .line 1345
    invoke-static {v0}, La/zvw;->R(Lkotlin/coroutines/CoroutineContext;)La/bby;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    invoke-static {v0, v6, v10}, La/zvw;->W(La/bby;ZLa/eby;)La/nwk;

    .line 1350
    .line 1351
    .line 1352
    move-result-object v0

    .line 1353
    iput-object v0, v10, La/mcq0;->f:La/nwk;

    .line 1354
    .line 1355
    :cond_21
    sget-object v9, La;->a:Lsun/misc/Unsafe;

    .line 1356
    .line 1357
    sget-wide v11, La/mcq0;->g:J

    .line 1358
    .line 1359
    invoke-virtual {v9, v10, v11, v12}, Lsun/misc/Unsafe;->getIntVolatile(Ljava/lang/Object;J)I

    .line 1360
    .line 1361
    .line 1362
    move-result v13

    .line 1363
    if-eqz v13, :cond_23

    .line 1364
    .line 1365
    if-eq v13, v4, :cond_24

    .line 1366
    .line 1367
    if-ne v13, v3, :cond_22

    .line 1368
    .line 1369
    goto :goto_12

    .line 1370
    :cond_22
    invoke-static {v13}, La/mcq0;->o(I)V

    .line 1371
    .line 1372
    .line 1373
    throw v7

    .line 1374
    :cond_23
    const/4 v14, 0x0

    .line 1375
    invoke-virtual/range {v9 .. v14}, Lsun/misc/Unsafe;->compareAndSwapInt(Ljava/lang/Object;JII)Z

    .line 1376
    .line 1377
    .line 1378
    move-result v0
    :try_end_1
    .catch Ljava/lang/InterruptedException; {:try_start_1 .. :try_end_1} :catch_0

    .line 1379
    if-eqz v0, :cond_21

    .line 1380
    .line 1381
    :cond_24
    :goto_12
    :try_start_2
    invoke-interface {v8}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1382
    .line 1383
    .line 1384
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 1385
    :try_start_3
    invoke-virtual {v10}, La/mcq0;->n()V

    .line 1386
    .line 1387
    .line 1388
    return-object v0

    .line 1389
    :catchall_1
    move-exception v0

    .line 1390
    invoke-virtual {v10}, La/mcq0;->n()V

    .line 1391
    .line 1392
    .line 1393
    throw v0
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0

    .line 1394
    :catch_0
    move-exception v0

    .line 1395
    new-instance v1, Ljava/util/concurrent/CancellationException;

    .line 1396
    .line 1397
    const-string v2, "Blocking call was interrupted due to parent cancellation"

    .line 1398
    .line 1399
    invoke-direct {v1, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 1400
    .line 1401
    .line 1402
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v0

    .line 1406
    throw v0

    .line 1407
    :pswitch_14
    check-cast v8, La/yax;

    .line 1408
    .line 1409
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1410
    .line 1411
    check-cast v0, La/fbx;

    .line 1412
    .line 1413
    sget-object v1, La/wne;->a:La/wne;

    .line 1414
    .line 1415
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1416
    .line 1417
    .line 1418
    if-eqz v0, :cond_2a

    .line 1419
    .line 1420
    instance-of v1, v0, La/cbx;

    .line 1421
    .line 1422
    if-eqz v1, :cond_25

    .line 1423
    .line 1424
    sget-object v0, La/yax;->S1:La/art;

    .line 1425
    .line 1426
    invoke-virtual {v8, v5}, La/yax;->I0(Z)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v8}, La/yax;->G0()La/p6r;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v0

    .line 1433
    iget-object v0, v0, La/p6r;->c:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 1434
    .line 1435
    iget-object v1, v8, La/yax;->Q1:La/n0o0;

    .line 1436
    .line 1437
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v1

    .line 1441
    check-cast v1, La/ra10;

    .line 1442
    .line 1443
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v8}, La/yax;->G0()La/p6r;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 1454
    .line 1455
    const/16 v1, 0x8

    .line 1456
    .line 1457
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 1458
    .line 1459
    .line 1460
    goto :goto_13

    .line 1461
    :cond_25
    instance-of v1, v0, La/dbx;

    .line 1462
    .line 1463
    if-eqz v1, :cond_28

    .line 1464
    .line 1465
    check-cast v0, La/dbx;

    .line 1466
    .line 1467
    iget-object v1, v0, La/dbx;->a:Ljava/lang/String;

    .line 1468
    .line 1469
    iget-object v0, v0, La/dbx;->b:Ljava/lang/String;

    .line 1470
    .line 1471
    sget-object v2, La/yax;->S1:La/art;

    .line 1472
    .line 1473
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1474
    .line 1475
    .line 1476
    move-result v2

    .line 1477
    if-lez v2, :cond_26

    .line 1478
    .line 1479
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1480
    .line 1481
    .line 1482
    move-result-object v2

    .line 1483
    invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v2

    .line 1487
    const-string v3, "SESSION="

    .line 1488
    .line 1489
    const-string v4, "; path=/; domain="

    .line 1490
    .line 1491
    invoke-static {v3, v0, v4, v2}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v2

    .line 1499
    invoke-virtual {v2, v1, v0}, Landroid/webkit/CookieManager;->setCookie(Ljava/lang/String;Ljava/lang/String;)V

    .line 1500
    .line 1501
    .line 1502
    :cond_26
    const-string v0, ".pdf"

    .line 1503
    .line 1504
    invoke-static {v1, v0, v5}, Lkotlin/text/c;->n(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 1505
    .line 1506
    .line 1507
    move-result v0

    .line 1508
    if-eqz v0, :cond_27

    .line 1509
    .line 1510
    new-instance v0, Landroid/content/Intent;

    .line 1511
    .line 1512
    const-string v2, "android.intent.action.VIEW"

    .line 1513
    .line 1514
    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1515
    .line 1516
    .line 1517
    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 1518
    .line 1519
    .line 1520
    move-result-object v1

    .line 1521
    invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1522
    .line 1523
    .line 1524
    invoke-virtual {v8, v0}, La/yax;->H0(Landroid/content/Intent;)V

    .line 1525
    .line 1526
    .line 1527
    goto :goto_13

    .line 1528
    :cond_27
    invoke-virtual {v8}, La/yax;->G0()La/p6r;

    .line 1529
    .line 1530
    .line 1531
    move-result-object v0

    .line 1532
    iget-object v0, v0, La/p6r;->g:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 1533
    .line 1534
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->c(Ljava/lang/String;)V

    .line 1535
    .line 1536
    .line 1537
    goto :goto_13

    .line 1538
    :cond_28
    instance-of v1, v0, La/ebx;

    .line 1539
    .line 1540
    if-eqz v1, :cond_29

    .line 1541
    .line 1542
    check-cast v0, La/ebx;

    .line 1543
    .line 1544
    iget-boolean v0, v0, La/ebx;->a:Z

    .line 1545
    .line 1546
    xor-int/2addr v0, v6

    .line 1547
    sget-object v1, La/yax;->S1:La/art;

    .line 1548
    .line 1549
    invoke-virtual {v8, v0}, La/yax;->I0(Z)V

    .line 1550
    .line 1551
    .line 1552
    goto :goto_13

    .line 1553
    :cond_29
    instance-of v0, v0, La/bbx;

    .line 1554
    .line 1555
    if-eqz v0, :cond_2a

    .line 1556
    .line 1557
    :goto_13
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1558
    .line 1559
    goto :goto_14

    .line 1560
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1561
    .line 1562
    .line 1563
    :goto_14
    return-object v7

    .line 1564
    :pswitch_15
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1565
    .line 1566
    move-object v5, v0

    .line 1567
    check-cast v5, La/uaq0;

    .line 1568
    .line 1569
    sget-object v0, La/wne;->a:La/wne;

    .line 1570
    .line 1571
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1572
    .line 1573
    .line 1574
    check-cast v8, La/qqw;

    .line 1575
    .line 1576
    iget-object v1, v8, La/qqw;->t:La/fhj;

    .line 1577
    .line 1578
    iget-object v2, v8, La/qqw;->o:Ljava/lang/String;

    .line 1579
    .line 1580
    iget-wide v3, v8, La/qqw;->p:J

    .line 1581
    .line 1582
    const-wide/16 v6, 0x0

    .line 1583
    .line 1584
    invoke-virtual/range {v1 .. v7}, La/fhj;->s(Ljava/lang/String;JLa/uaq0;J)La/nc5;

    .line 1585
    .line 1586
    .line 1587
    move-result-object v18

    .line 1588
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 1589
    .line 1590
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1591
    .line 1592
    :cond_2b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v0

    .line 1596
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1597
    .line 1598
    .line 1599
    move-object v9, v0

    .line 1600
    check-cast v9, La/dqw;

    .line 1601
    .line 1602
    const/16 v17, 0x0

    .line 1603
    .line 1604
    const/16 v19, 0x1ff

    .line 1605
    .line 1606
    const/4 v10, 0x0

    .line 1607
    const/4 v11, 0x0

    .line 1608
    const/4 v12, 0x0

    .line 1609
    const/4 v13, 0x0

    .line 1610
    const/4 v14, 0x0

    .line 1611
    const/4 v15, 0x0

    .line 1612
    const/16 v16, 0x0

    .line 1613
    .line 1614
    invoke-static/range {v9 .. v19}, La/dqw;->a(La/dqw;ZZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;La/nc5;I)La/dqw;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v2

    .line 1618
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1619
    .line 1620
    .line 1621
    move-result v0

    .line 1622
    if-eqz v0, :cond_2b

    .line 1623
    .line 1624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1625
    .line 1626
    return-object v0

    .line 1627
    :pswitch_16
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1628
    .line 1629
    check-cast v0, Ljava/lang/Throwable;

    .line 1630
    .line 1631
    sget-object v1, La/wne;->a:La/wne;

    .line 1632
    .line 1633
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1634
    .line 1635
    .line 1636
    check-cast v8, La/yow;

    .line 1637
    .line 1638
    iget-object v1, v8, La/yow;->q:La/duj;

    .line 1639
    .line 1640
    new-instance v2, La/wow;

    .line 1641
    .line 1642
    invoke-direct {v2, v8, v6}, La/wow;-><init>(La/yow;B)V

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1646
    .line 1647
    .line 1648
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1649
    .line 1650
    return-object v0

    .line 1651
    :pswitch_17
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1652
    .line 1653
    check-cast v0, La/uaq0;

    .line 1654
    .line 1655
    sget-object v1, La/wne;->a:La/wne;

    .line 1656
    .line 1657
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1658
    .line 1659
    .line 1660
    new-instance v15, La/mc5;

    .line 1661
    .line 1662
    check-cast v8, La/snw;

    .line 1663
    .line 1664
    iget-object v1, v8, La/snw;->o:Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;

    .line 1665
    .line 1666
    iget-wide v1, v1, Lorg/xplatform/statistic/horse_menu/domain/model/HorseInfoModel;->a:J

    .line 1667
    .line 1668
    sget-object v3, La/uaq0;->a:La/s9m0;

    .line 1669
    .line 1670
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    invoke-static {v0}, La/s9m0;->l(La/uaq0;)Z

    .line 1674
    .line 1675
    .line 1676
    move-result v0

    .line 1677
    invoke-direct {v15, v0, v1, v2}, La/mc5;-><init>(ZJ)V

    .line 1678
    .line 1679
    .line 1680
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 1681
    .line 1682
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 1683
    .line 1684
    :cond_2c
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v0

    .line 1688
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1689
    .line 1690
    .line 1691
    move-object v9, v0

    .line 1692
    check-cast v9, La/gnw;

    .line 1693
    .line 1694
    const/4 v14, 0x0

    .line 1695
    const/16 v16, 0x3f

    .line 1696
    .line 1697
    const/4 v10, 0x0

    .line 1698
    const/4 v11, 0x0

    .line 1699
    const/4 v12, 0x0

    .line 1700
    const/4 v13, 0x0

    .line 1701
    invoke-static/range {v9 .. v16}, La/gnw;->a(La/gnw;ZZZLjava/util/ArrayList;La/wmw;La/nc5;I)La/gnw;

    .line 1702
    .line 1703
    .line 1704
    move-result-object v2

    .line 1705
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1706
    .line 1707
    .line 1708
    move-result v0

    .line 1709
    if-eqz v0, :cond_2c

    .line 1710
    .line 1711
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1712
    .line 1713
    return-object v0

    .line 1714
    :pswitch_18
    invoke-direct/range {p0 .. p1}, La/kaw;->l(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1715
    .line 1716
    .line 1717
    move-result-object v0

    .line 1718
    return-object v0

    .line 1719
    :pswitch_19
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1720
    .line 1721
    move-object v1, v0

    .line 1722
    check-cast v1, La/viw;

    .line 1723
    .line 1724
    sget-object v0, La/wne;->a:La/wne;

    .line 1725
    .line 1726
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1727
    .line 1728
    .line 1729
    check-cast v8, La/tkw;

    .line 1730
    .line 1731
    sget v0, La/tkw;->C:I

    .line 1732
    .line 1733
    iget-object v0, v8, La/i3t0;->i:La/ocj;

    .line 1734
    .line 1735
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 1736
    .line 1737
    :cond_2d
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1738
    .line 1739
    .line 1740
    move-result-object v0

    .line 1741
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1742
    .line 1743
    .line 1744
    move-object v3, v0

    .line 1745
    check-cast v3, La/yjw;

    .line 1746
    .line 1747
    const/16 v4, 0x7f

    .line 1748
    .line 1749
    invoke-static {v3, v5, v1, v4}, La/yjw;->a(La/yjw;ZLa/viw;I)La/yjw;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v3

    .line 1753
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1754
    .line 1755
    .line 1756
    move-result v0

    .line 1757
    if-eqz v0, :cond_2d

    .line 1758
    .line 1759
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1760
    .line 1761
    return-object v0

    .line 1762
    :pswitch_1a
    sget-object v1, La/wne;->a:La/wne;

    .line 1763
    .line 1764
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1765
    .line 1766
    .line 1767
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1768
    .line 1769
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1770
    .line 1771
    check-cast v8, La/bjw;

    .line 1772
    .line 1773
    invoke-interface {v0, v8}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1774
    .line 1775
    .line 1776
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1777
    .line 1778
    return-object v0

    .line 1779
    :pswitch_1b
    move-object v2, v8

    .line 1780
    check-cast v2, La/hfw;

    .line 1781
    .line 1782
    iget-object v1, v2, La/hfw;->p:La/hzg;

    .line 1783
    .line 1784
    sget-object v3, La/wne;->a:La/wne;

    .line 1785
    .line 1786
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1787
    .line 1788
    .line 1789
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 1790
    .line 1791
    check-cast v0, La/scw;

    .line 1792
    .line 1793
    instance-of v3, v0, La/kcw;

    .line 1794
    .line 1795
    if-eqz v3, :cond_2e

    .line 1796
    .line 1797
    sget v0, La/hfw;->J:I

    .line 1798
    .line 1799
    check-cast v1, La/uzg;

    .line 1800
    .line 1801
    invoke-virtual {v1}, La/uzg;->a()V

    .line 1802
    .line 1803
    .line 1804
    goto/16 :goto_1c

    .line 1805
    .line 1806
    :cond_2e
    instance-of v3, v0, La/ncw;

    .line 1807
    .line 1808
    if-eqz v3, :cond_30

    .line 1809
    .line 1810
    check-cast v0, La/ncw;

    .line 1811
    .line 1812
    iget-object v3, v0, La/ncw;->a:La/uew;

    .line 1813
    .line 1814
    sget v0, La/hfw;->J:I

    .line 1815
    .line 1816
    iget-wide v0, v3, La/uew;->a:J

    .line 1817
    .line 1818
    invoke-virtual {v2, v0, v1}, La/hfw;->Q(J)V

    .line 1819
    .line 1820
    .line 1821
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 1822
    .line 1823
    iget-object v4, v0, La/ocj;->a:La/p7m0;

    .line 1824
    .line 1825
    :cond_2f
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1826
    .line 1827
    .line 1828
    move-result-object v0

    .line 1829
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1830
    .line 1831
    .line 1832
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 1833
    .line 1834
    move-object v5, v0

    .line 1835
    check-cast v5, La/lew;

    .line 1836
    .line 1837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1838
    .line 1839
    .line 1840
    iget-wide v6, v3, La/uew;->a:J

    .line 1841
    .line 1842
    const/4 v9, 0x0

    .line 1843
    const/16 v10, 0xe

    .line 1844
    .line 1845
    const/4 v8, 0x0

    .line 1846
    invoke-static/range {v5 .. v10}, La/lew;->a(La/lew;JLa/tew;Ljava/util/LinkedHashMap;I)La/lew;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v1

    .line 1850
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1851
    .line 1852
    .line 1853
    move-result v0

    .line 1854
    if-eqz v0, :cond_2f

    .line 1855
    .line 1856
    goto/16 :goto_1c

    .line 1857
    .line 1858
    :cond_30
    instance-of v3, v0, La/jcw;

    .line 1859
    .line 1860
    if-eqz v3, :cond_31

    .line 1861
    .line 1862
    sget v0, La/hfw;->J:I

    .line 1863
    .line 1864
    iget-object v0, v2, La/hfw;->x:La/oeg0;

    .line 1865
    .line 1866
    invoke-virtual {v0}, La/oeg0;->c()La/i1w0;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v0

    .line 1870
    new-instance v1, La/dfw;

    .line 1871
    .line 1872
    invoke-direct {v1, v2, v6}, La/dfw;-><init>(La/hfw;B)V

    .line 1873
    .line 1874
    .line 1875
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1876
    .line 1877
    .line 1878
    goto/16 :goto_1c

    .line 1879
    .line 1880
    :cond_31
    instance-of v3, v0, La/icw;

    .line 1881
    .line 1882
    if-eqz v3, :cond_32

    .line 1883
    .line 1884
    check-cast v0, La/icw;

    .line 1885
    .line 1886
    sget v1, La/hfw;->J:I

    .line 1887
    .line 1888
    iget v0, v0, La/icw;->a:I

    .line 1889
    .line 1890
    int-to-long v0, v0

    .line 1891
    invoke-virtual {v2, v0, v1}, La/hfw;->P(J)V

    .line 1892
    .line 1893
    .line 1894
    goto/16 :goto_1c

    .line 1895
    .line 1896
    :cond_32
    instance-of v3, v0, La/ocw;

    .line 1897
    .line 1898
    if-eqz v3, :cond_33

    .line 1899
    .line 1900
    check-cast v0, La/ocw;

    .line 1901
    .line 1902
    sget v1, La/hfw;->J:I

    .line 1903
    .line 1904
    iget-wide v0, v0, La/ocw;->a:J

    .line 1905
    .line 1906
    invoke-virtual {v2, v0, v1}, La/hfw;->P(J)V

    .line 1907
    .line 1908
    .line 1909
    goto/16 :goto_1c

    .line 1910
    .line 1911
    :cond_33
    instance-of v3, v0, La/qcw;

    .line 1912
    .line 1913
    if-eqz v3, :cond_35

    .line 1914
    .line 1915
    check-cast v0, La/qcw;

    .line 1916
    .line 1917
    iget-object v0, v0, La/qcw;->a:La/jfw;

    .line 1918
    .line 1919
    iget-boolean v2, v0, La/jfw;->b:Z

    .line 1920
    .line 1921
    sget v3, La/hfw;->J:I

    .line 1922
    .line 1923
    iget-object v3, v0, La/jfw;->d:Ljava/lang/String;

    .line 1924
    .line 1925
    iget-object v0, v0, La/jfw;->c:Ljava/lang/String;

    .line 1926
    .line 1927
    if-eqz v2, :cond_34

    .line 1928
    .line 1929
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 1930
    .line 1931
    .line 1932
    move-result v4

    .line 1933
    if-lez v4, :cond_34

    .line 1934
    .line 1935
    check-cast v1, La/uzg;

    .line 1936
    .line 1937
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1938
    .line 1939
    .line 1940
    iget-object v1, v1, La/uzg;->i:La/grj;

    .line 1941
    .line 1942
    invoke-virtual {v1, v0}, La/grj;->a(Ljava/lang/String;)V

    .line 1943
    .line 1944
    .line 1945
    goto/16 :goto_1c

    .line 1946
    .line 1947
    :cond_34
    if-eqz v2, :cond_49

    .line 1948
    .line 1949
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1950
    .line 1951
    .line 1952
    move-result v0

    .line 1953
    if-lez v0, :cond_49

    .line 1954
    .line 1955
    check-cast v1, La/uzg;

    .line 1956
    .line 1957
    invoke-virtual {v1, v3}, La/uzg;->m(Ljava/lang/String;)V

    .line 1958
    .line 1959
    .line 1960
    goto/16 :goto_1c

    .line 1961
    .line 1962
    :cond_35
    instance-of v1, v0, La/pcw;

    .line 1963
    .line 1964
    if-eqz v1, :cond_36

    .line 1965
    .line 1966
    sget v0, La/hfw;->J:I

    .line 1967
    .line 1968
    invoke-virtual {v2}, La/hfw;->O()V

    .line 1969
    .line 1970
    .line 1971
    goto/16 :goto_1c

    .line 1972
    .line 1973
    :cond_36
    instance-of v1, v0, La/lcw;

    .line 1974
    .line 1975
    const-wide/16 v3, 0x0

    .line 1976
    .line 1977
    const/4 v5, 0x0

    .line 1978
    if-eqz v1, :cond_3f

    .line 1979
    .line 1980
    check-cast v0, La/lcw;

    .line 1981
    .line 1982
    iget-wide v0, v0, La/lcw;->a:J

    .line 1983
    .line 1984
    sget v6, La/hfw;->J:I

    .line 1985
    .line 1986
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v6

    .line 1990
    check-cast v6, La/lew;

    .line 1991
    .line 1992
    iget-object v6, v6, La/lew;->d:Ljava/util/Map;

    .line 1993
    .line 1994
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 1995
    .line 1996
    .line 1997
    move-result-object v7

    .line 1998
    check-cast v7, La/lew;

    .line 1999
    .line 2000
    iget-wide v7, v7, La/lew;->a:J

    .line 2001
    .line 2002
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2003
    .line 2004
    .line 2005
    move-result-object v7

    .line 2006
    invoke-static {v6, v7}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v6

    .line 2010
    check-cast v6, La/edw;

    .line 2011
    .line 2012
    iget-object v6, v6, La/edw;->a:Ljava/lang/Object;

    .line 2013
    .line 2014
    new-instance v7, La/j0g0;

    .line 2015
    .line 2016
    invoke-direct {v7, v6}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 2017
    .line 2018
    .line 2019
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v6

    .line 2023
    check-cast v6, La/lew;

    .line 2024
    .line 2025
    iget-object v6, v6, La/lew;->d:Ljava/util/Map;

    .line 2026
    .line 2027
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2028
    .line 2029
    .line 2030
    move-result-object v8

    .line 2031
    check-cast v8, La/lew;

    .line 2032
    .line 2033
    iget-wide v8, v8, La/lew;->a:J

    .line 2034
    .line 2035
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2036
    .line 2037
    .line 2038
    move-result-object v8

    .line 2039
    invoke-static {v6, v8}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2040
    .line 2041
    .line 2042
    move-result-object v6

    .line 2043
    check-cast v6, La/edw;

    .line 2044
    .line 2045
    iget-object v6, v6, La/edw;->b:Ljava/lang/Object;

    .line 2046
    .line 2047
    new-instance v8, La/j0g0;

    .line 2048
    .line 2049
    invoke-direct {v8, v6}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 2050
    .line 2051
    .line 2052
    filled-new-array {v7, v8}, [La/j0g0;

    .line 2053
    .line 2054
    .line 2055
    move-result-object v6

    .line 2056
    invoke-static {v6}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 2057
    .line 2058
    .line 2059
    move-result-object v6

    .line 2060
    check-cast v6, Ljava/util/ArrayList;

    .line 2061
    .line 2062
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2063
    .line 2064
    .line 2065
    move-result-object v6

    .line 2066
    :cond_37
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2067
    .line 2068
    .line 2069
    move-result v7

    .line 2070
    if-eqz v7, :cond_3a

    .line 2071
    .line 2072
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2073
    .line 2074
    .line 2075
    move-result-object v7

    .line 2076
    check-cast v7, La/j0g0;

    .line 2077
    .line 2078
    iget-object v8, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 2079
    .line 2080
    instance-of v9, v8, La/g0g0;

    .line 2081
    .line 2082
    if-eqz v9, :cond_38

    .line 2083
    .line 2084
    move-object v8, v5

    .line 2085
    :cond_38
    check-cast v8, La/m9s;

    .line 2086
    .line 2087
    if-eqz v8, :cond_39

    .line 2088
    .line 2089
    iget-object v8, v8, La/m9s;->H:Ljava/util/List;

    .line 2090
    .line 2091
    if-eqz v8, :cond_39

    .line 2092
    .line 2093
    invoke-static {v0, v1, v8}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v8

    .line 2097
    if-eqz v8, :cond_39

    .line 2098
    .line 2099
    new-instance v9, Lkotlin/Pair;

    .line 2100
    .line 2101
    invoke-direct {v9, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2102
    .line 2103
    .line 2104
    goto :goto_15

    .line 2105
    :cond_39
    move-object v9, v5

    .line 2106
    :goto_15
    if-eqz v9, :cond_37

    .line 2107
    .line 2108
    goto :goto_16

    .line 2109
    :cond_3a
    move-object v9, v5

    .line 2110
    :goto_16
    if-nez v9, :cond_3b

    .line 2111
    .line 2112
    goto/16 :goto_1c

    .line 2113
    .line 2114
    :cond_3b
    iget-object v0, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2115
    .line 2116
    check-cast v0, La/j0g0;

    .line 2117
    .line 2118
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 2119
    .line 2120
    iget-object v1, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2121
    .line 2122
    check-cast v1, La/dao;

    .line 2123
    .line 2124
    instance-of v6, v0, La/g0g0;

    .line 2125
    .line 2126
    if-eqz v6, :cond_3c

    .line 2127
    .line 2128
    move-object v7, v5

    .line 2129
    goto :goto_17

    .line 2130
    :cond_3c
    move-object v7, v0

    .line 2131
    :goto_17
    check-cast v7, La/m9s;

    .line 2132
    .line 2133
    if-eqz v7, :cond_49

    .line 2134
    .line 2135
    if-eqz v6, :cond_3d

    .line 2136
    .line 2137
    goto :goto_18

    .line 2138
    :cond_3d
    move-object v5, v0

    .line 2139
    :goto_18
    check-cast v5, La/m9s;

    .line 2140
    .line 2141
    if-eqz v5, :cond_3e

    .line 2142
    .line 2143
    iget-wide v3, v5, La/m9s;->a:J

    .line 2144
    .line 2145
    :cond_3e
    invoke-static {v7, v3, v4}, La/g1x;->F(La/m9s;J)La/m0k0;

    .line 2146
    .line 2147
    .line 2148
    move-result-object v0

    .line 2149
    invoke-static {v1}, La/jd8;->l0(La/dao;)La/m97;

    .line 2150
    .line 2151
    .line 2152
    move-result-object v1

    .line 2153
    new-instance v3, La/jew;

    .line 2154
    .line 2155
    new-instance v4, La/mq2;

    .line 2156
    .line 2157
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 2158
    .line 2159
    .line 2160
    invoke-direct {v3, v0, v1, v4}, La/jew;-><init>(La/m0k0;La/m97;La/mq2;)V

    .line 2161
    .line 2162
    .line 2163
    invoke-virtual {v2, v3}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 2164
    .line 2165
    .line 2166
    goto/16 :goto_1c

    .line 2167
    .line 2168
    :cond_3f
    instance-of v1, v0, La/mcw;

    .line 2169
    .line 2170
    if-eqz v1, :cond_48

    .line 2171
    .line 2172
    check-cast v0, La/mcw;

    .line 2173
    .line 2174
    iget-wide v0, v0, La/mcw;->a:J

    .line 2175
    .line 2176
    sget v6, La/hfw;->J:I

    .line 2177
    .line 2178
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2179
    .line 2180
    .line 2181
    move-result-object v6

    .line 2182
    check-cast v6, La/lew;

    .line 2183
    .line 2184
    iget-object v6, v6, La/lew;->d:Ljava/util/Map;

    .line 2185
    .line 2186
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v7

    .line 2190
    check-cast v7, La/lew;

    .line 2191
    .line 2192
    iget-wide v7, v7, La/lew;->a:J

    .line 2193
    .line 2194
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2195
    .line 2196
    .line 2197
    move-result-object v7

    .line 2198
    invoke-static {v6, v7}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2199
    .line 2200
    .line 2201
    move-result-object v6

    .line 2202
    check-cast v6, La/edw;

    .line 2203
    .line 2204
    iget-object v6, v6, La/edw;->a:Ljava/lang/Object;

    .line 2205
    .line 2206
    new-instance v7, La/j0g0;

    .line 2207
    .line 2208
    invoke-direct {v7, v6}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 2209
    .line 2210
    .line 2211
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2212
    .line 2213
    .line 2214
    move-result-object v6

    .line 2215
    check-cast v6, La/lew;

    .line 2216
    .line 2217
    iget-object v6, v6, La/lew;->d:Ljava/util/Map;

    .line 2218
    .line 2219
    invoke-virtual {v2}, La/i3t0;->D()Ljava/lang/Object;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v8

    .line 2223
    check-cast v8, La/lew;

    .line 2224
    .line 2225
    iget-wide v8, v8, La/lew;->a:J

    .line 2226
    .line 2227
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 2228
    .line 2229
    .line 2230
    move-result-object v8

    .line 2231
    invoke-static {v6, v8}, La/xp20;->d(Ljava/util/Map;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2232
    .line 2233
    .line 2234
    move-result-object v6

    .line 2235
    check-cast v6, La/edw;

    .line 2236
    .line 2237
    iget-object v6, v6, La/edw;->b:Ljava/lang/Object;

    .line 2238
    .line 2239
    new-instance v8, La/j0g0;

    .line 2240
    .line 2241
    invoke-direct {v8, v6}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 2242
    .line 2243
    .line 2244
    filled-new-array {v7, v8}, [La/j0g0;

    .line 2245
    .line 2246
    .line 2247
    move-result-object v6

    .line 2248
    invoke-static {v6}, La/tx3;->z([Ljava/lang/Object;)Ljava/util/List;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v6

    .line 2252
    check-cast v6, Ljava/util/ArrayList;

    .line 2253
    .line 2254
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2255
    .line 2256
    .line 2257
    move-result-object v6

    .line 2258
    :cond_40
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 2259
    .line 2260
    .line 2261
    move-result v7

    .line 2262
    if-eqz v7, :cond_43

    .line 2263
    .line 2264
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v7

    .line 2268
    check-cast v7, La/j0g0;

    .line 2269
    .line 2270
    iget-object v8, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 2271
    .line 2272
    instance-of v9, v8, La/g0g0;

    .line 2273
    .line 2274
    if-eqz v9, :cond_41

    .line 2275
    .line 2276
    move-object v8, v5

    .line 2277
    :cond_41
    check-cast v8, La/m9s;

    .line 2278
    .line 2279
    if-eqz v8, :cond_42

    .line 2280
    .line 2281
    iget-object v8, v8, La/m9s;->H:Ljava/util/List;

    .line 2282
    .line 2283
    if-eqz v8, :cond_42

    .line 2284
    .line 2285
    invoke-static {v0, v1, v8}, La/yum0;->e(JLjava/util/List;)La/dao;

    .line 2286
    .line 2287
    .line 2288
    move-result-object v8

    .line 2289
    if-eqz v8, :cond_42

    .line 2290
    .line 2291
    new-instance v9, Lkotlin/Pair;

    .line 2292
    .line 2293
    invoke-direct {v9, v7, v8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2294
    .line 2295
    .line 2296
    goto :goto_19

    .line 2297
    :cond_42
    move-object v9, v5

    .line 2298
    :goto_19
    if-eqz v9, :cond_40

    .line 2299
    .line 2300
    goto :goto_1a

    .line 2301
    :cond_43
    move-object v9, v5

    .line 2302
    :goto_1a
    if-nez v9, :cond_44

    .line 2303
    .line 2304
    goto :goto_1c

    .line 2305
    :cond_44
    iget-object v0, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 2306
    .line 2307
    check-cast v0, La/j0g0;

    .line 2308
    .line 2309
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 2310
    .line 2311
    iget-object v1, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 2312
    .line 2313
    check-cast v1, La/dao;

    .line 2314
    .line 2315
    instance-of v6, v0, La/g0g0;

    .line 2316
    .line 2317
    if-eqz v6, :cond_45

    .line 2318
    .line 2319
    move-object v7, v5

    .line 2320
    goto :goto_1b

    .line 2321
    :cond_45
    move-object v7, v0

    .line 2322
    :goto_1b
    check-cast v7, La/m9s;

    .line 2323
    .line 2324
    if-eqz v7, :cond_49

    .line 2325
    .line 2326
    if-eqz v6, :cond_46

    .line 2327
    .line 2328
    move-object v0, v5

    .line 2329
    :cond_46
    check-cast v0, La/m9s;

    .line 2330
    .line 2331
    if-eqz v0, :cond_47

    .line 2332
    .line 2333
    iget-wide v3, v0, La/m9s;->a:J

    .line 2334
    .line 2335
    :cond_47
    invoke-static {v7, v3, v4}, La/g1x;->F(La/m9s;J)La/m0k0;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v3

    .line 2339
    invoke-static {v1}, La/x9x;->c0(La/dao;)La/zxj0;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v4

    .line 2343
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v0

    .line 2347
    new-instance v6, La/n5w;

    .line 2348
    .line 2349
    iget-object v8, v2, La/hfw;->q:La/duj;

    .line 2350
    .line 2351
    const/4 v12, 0x0

    .line 2352
    const/16 v13, 0xf

    .line 2353
    .line 2354
    const/4 v7, 0x1

    .line 2355
    const-class v9, La/duj;

    .line 2356
    .line 2357
    const-string v10, "handleError"

    .line 2358
    .line 2359
    const-string v11, "handleError(Ljava/lang/Throwable;)V"

    .line 2360
    .line 2361
    invoke-direct/range {v6 .. v13}, La/n5w;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2362
    .line 2363
    .line 2364
    move-object v7, v6

    .line 2365
    iget-object v1, v2, La/hfw;->o:La/mne;

    .line 2366
    .line 2367
    iget-object v9, v1, La/mne;->b:La/dvj;

    .line 2368
    .line 2369
    new-instance v1, La/efw;

    .line 2370
    .line 2371
    const/4 v6, 0x1

    .line 2372
    invoke-direct/range {v1 .. v6}, La/efw;-><init>(La/hfw;La/m0k0;La/zxj0;La/yje;B)V

    .line 2373
    .line 2374
    .line 2375
    const/16 v11, 0xa

    .line 2376
    .line 2377
    const/4 v8, 0x0

    .line 2378
    move-object v6, v0

    .line 2379
    move-object v10, v1

    .line 2380
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2381
    .line 2382
    .line 2383
    goto :goto_1c

    .line 2384
    :cond_48
    instance-of v0, v0, La/rcw;

    .line 2385
    .line 2386
    if-eqz v0, :cond_4a

    .line 2387
    .line 2388
    sget v0, La/hfw;->J:I

    .line 2389
    .line 2390
    iget-object v0, v2, La/hfw;->F:La/c4m0;

    .line 2391
    .line 2392
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 2393
    .line 2394
    .line 2395
    iget-object v0, v2, La/hfw;->G:La/c4m0;

    .line 2396
    .line 2397
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 2398
    .line 2399
    .line 2400
    invoke-virtual {v2}, La/hfw;->N()V

    .line 2401
    .line 2402
    .line 2403
    invoke-virtual {v2}, La/hfw;->M()V

    .line 2404
    .line 2405
    .line 2406
    :cond_49
    :goto_1c
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2407
    .line 2408
    goto :goto_1d

    .line 2409
    :cond_4a
    invoke-static {}, La/t9f;->b()V

    .line 2410
    .line 2411
    .line 2412
    :goto_1d
    return-object v7

    .line 2413
    :pswitch_1c
    sget-object v1, La/wne;->a:La/wne;

    .line 2414
    .line 2415
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2416
    .line 2417
    .line 2418
    iget-object v0, v0, La/kaw;->j:Ljava/lang/Object;

    .line 2419
    .line 2420
    check-cast v0, La/naw;

    .line 2421
    .line 2422
    iget-object v1, v0, La/naw;->W0:La/p7m0;

    .line 2423
    .line 2424
    :cond_4b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2425
    .line 2426
    .line 2427
    move-result-object v2

    .line 2428
    move-object v9, v2

    .line 2429
    check-cast v9, La/l9h0;

    .line 2430
    .line 2431
    const/16 v22, 0x0

    .line 2432
    .line 2433
    const/16 v23, 0x7ffd

    .line 2434
    .line 2435
    const/4 v10, 0x0

    .line 2436
    const/4 v11, 0x0

    .line 2437
    const/4 v12, 0x0

    .line 2438
    const/4 v13, 0x0

    .line 2439
    const/4 v14, 0x0

    .line 2440
    const/4 v15, 0x0

    .line 2441
    const/16 v16, 0x0

    .line 2442
    .line 2443
    const/16 v17, 0x0

    .line 2444
    .line 2445
    const/16 v18, 0x0

    .line 2446
    .line 2447
    const/16 v19, 0x0

    .line 2448
    .line 2449
    const/16 v20, 0x0

    .line 2450
    .line 2451
    const/16 v21, 0x0

    .line 2452
    .line 2453
    invoke-static/range {v9 .. v23}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 2454
    .line 2455
    .line 2456
    move-result-object v3

    .line 2457
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2458
    .line 2459
    .line 2460
    move-result v2

    .line 2461
    if-eqz v2, :cond_4b

    .line 2462
    .line 2463
    iget-object v1, v0, La/naw;->J:La/td9;

    .line 2464
    .line 2465
    check-cast v8, La/n3w;

    .line 2466
    .line 2467
    invoke-virtual {v1, v8}, La/td9;->g(La/n3w;)V

    .line 2468
    .line 2469
    .line 2470
    iget-object v0, v0, La/naw;->Z0:La/ol60;

    .line 2471
    .line 2472
    sget-object v1, La/c9w;->a:La/c9w;

    .line 2473
    .line 2474
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2475
    .line 2476
    .line 2477
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2478
    .line 2479
    return-object v0

    .line 2480
    nop

    .line 2481
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
