.class public final synthetic La/v4f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/v4f;->a:B

    iput-object p1, p0, La/v4f;->b:Ljava/lang/Object;

    iput-object p2, p0, La/v4f;->c:Ljava/lang/Object;

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
    iget-byte v1, v0, La/v4f;->a:B

    .line 4
    .line 5
    const-string v2, "EXTRA_FLOW_PENDING_INTENT"

    .line 6
    .line 7
    const-class v3, Landroidx/credentials/playservices/controllers/identityauth/HiddenActivity;

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const v5, 0x7f070717

    .line 11
    .line 12
    .line 13
    const/16 v6, 0xa

    .line 14
    .line 15
    const-wide/16 v7, 0x0

    .line 16
    .line 17
    const/16 v9, 0x8

    .line 18
    .line 19
    const/4 v10, 0x0

    .line 20
    const v11, 0x7f080cf8

    .line 21
    .line 22
    .line 23
    const/4 v12, 0x3

    .line 24
    const/4 v13, 0x1

    .line 25
    const/4 v14, 0x0

    .line 26
    iget-object v15, v0, La/v4f;->c:Ljava/lang/Object;

    .line 27
    .line 28
    iget-object v0, v0, La/v4f;->b:Ljava/lang/Object;

    .line 29
    .line 30
    packed-switch v1, :pswitch_data_0

    .line 31
    .line 32
    .line 33
    check-cast v0, La/opg;

    .line 34
    .line 35
    check-cast v15, La/cp;

    .line 36
    .line 37
    move-object/from16 v1, p1

    .line 38
    .line 39
    check-cast v1, Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v15}, La/cp;->u()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, La/yfh;

    .line 49
    .line 50
    iget-byte v1, v1, La/yfh;->a:B

    .line 51
    .line 52
    int-to-long v1, v1

    .line 53
    iget-object v0, v0, La/opg;->a:La/vqg;

    .line 54
    .line 55
    iget-object v3, v0, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 56
    .line 57
    iget-object v4, v0, La/vqg;->w:La/zr1;

    .line 58
    .line 59
    iget-object v5, v0, La/vqg;->v:La/ih5;

    .line 60
    .line 61
    const-wide/16 v9, 0x4

    .line 62
    .line 63
    cmp-long v6, v1, v9

    .line 64
    .line 65
    if-nez v6, :cond_2

    .line 66
    .line 67
    sget-object v1, La/r1g;->b:La/r1g;

    .line 68
    .line 69
    const-string v1, "\u0441yber_postmatch_statistics"

    .line 70
    .line 71
    invoke-virtual {v5, v1}, La/ih5;->o(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v4, v1}, La/zr1;->x(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v1, v0, La/vqg;->E:La/dqg;

    .line 78
    .line 79
    if-eqz v1, :cond_0

    .line 80
    .line 81
    iget-object v2, v1, La/dqg;->a:La/ljg;

    .line 82
    .line 83
    if-eqz v2, :cond_0

    .line 84
    .line 85
    iget-wide v4, v2, La/ljg;->i:J

    .line 86
    .line 87
    move-wide/from16 v16, v4

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_0
    move-wide/from16 v16, v7

    .line 91
    .line 92
    :goto_0
    if-eqz v1, :cond_1

    .line 93
    .line 94
    iget-boolean v14, v1, La/dqg;->f:Z

    .line 95
    .line 96
    :cond_1
    cmp-long v1, v16, v7

    .line 97
    .line 98
    if-eqz v1, :cond_3

    .line 99
    .line 100
    iget-wide v1, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 101
    .line 102
    const-wide/16 v4, 0x2e

    .line 103
    .line 104
    cmp-long v4, v1, v4

    .line 105
    .line 106
    if-nez v4, :cond_3

    .line 107
    .line 108
    if-eqz v14, :cond_3

    .line 109
    .line 110
    iget-object v0, v0, La/vqg;->d:La/hzg;

    .line 111
    .line 112
    iget-object v4, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 113
    .line 114
    iget v5, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->d:I

    .line 115
    .line 116
    int-to-long v5, v5

    .line 117
    iget-wide v7, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->i:J

    .line 118
    .line 119
    move-object v15, v0

    .line 120
    check-cast v15, La/uzg;

    .line 121
    .line 122
    const/16 v25, 0x0

    .line 123
    .line 124
    move-wide/from16 v18, v1

    .line 125
    .line 126
    move-object/from16 v24, v4

    .line 127
    .line 128
    move-wide/from16 v20, v5

    .line 129
    .line 130
    move-wide/from16 v22, v7

    .line 131
    .line 132
    invoke-virtual/range {v15 .. v25}, La/uzg;->p(JJJJLjava/lang/String;Z)V

    .line 133
    .line 134
    .line 135
    goto :goto_1

    .line 136
    :cond_2
    const-wide/16 v6, 0x14

    .line 137
    .line 138
    cmp-long v1, v1, v6

    .line 139
    .line 140
    if-nez v1, :cond_3

    .line 141
    .line 142
    iget-object v1, v5, La/ih5;->a:La/kt2;

    .line 143
    .line 144
    const-string v2, "cyber_result_full_stat_call"

    .line 145
    .line 146
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    iget-object v1, v4, La/zr1;->a:La/s1p;

    .line 150
    .line 151
    const-wide/16 v4, 0x2ef1

    .line 152
    .line 153
    sget-object v2, La/xun;->a:La/xun;

    .line 154
    .line 155
    invoke-virtual {v1, v2, v4, v5}, La/s1p;->a(Ljava/util/Set;J)V

    .line 156
    .line 157
    .line 158
    iget-object v1, v0, La/vqg;->k:La/nvu;

    .line 159
    .line 160
    iget-object v2, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->a:Ljava/lang/String;

    .line 161
    .line 162
    iget-wide v3, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 163
    .line 164
    long-to-int v3, v3

    .line 165
    invoke-static {}, La/cy7;->c()Z

    .line 166
    .line 167
    .line 168
    move-result v4

    .line 169
    iget v5, v0, La/vqg;->j:I

    .line 170
    .line 171
    invoke-virtual {v1, v3, v5, v2, v4}, La/nvu;->H(IILjava/lang/String;Z)La/s4v0;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    iget-object v0, v0, La/vqg;->D:La/ol60;

    .line 176
    .line 177
    new-instance v2, La/nqg;

    .line 178
    .line 179
    invoke-direct {v2, v1}, La/nqg;-><init>(La/s4v0;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    :cond_3
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 186
    .line 187
    return-object v0

    .line 188
    :pswitch_0
    check-cast v0, La/dch;

    .line 189
    .line 190
    check-cast v15, Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 191
    .line 192
    move-object/from16 v1, p1

    .line 193
    .line 194
    check-cast v1, Ljava/lang/Throwable;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v15}, La/dch;->M(Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;)V

    .line 200
    .line 201
    .line 202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_1
    check-cast v0, La/h7h;

    .line 206
    .line 207
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 208
    .line 209
    move-object/from16 v1, p1

    .line 210
    .line 211
    check-cast v1, La/hcz;

    .line 212
    .line 213
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    iget-wide v2, v0, La/h7h;->d:J

    .line 217
    .line 218
    cmp-long v2, v2, v7

    .line 219
    .line 220
    if-lez v2, :cond_4

    .line 221
    .line 222
    iget-wide v2, v0, La/h7h;->a:J

    .line 223
    .line 224
    const-string v4, "_hidden_markets"

    .line 225
    .line 226
    invoke-static {v2, v3, v4}, La/dw9;->o(JLjava/lang/String;)Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    new-instance v3, La/sd8;

    .line 231
    .line 232
    const/16 v4, 0x13

    .line 233
    .line 234
    invoke-direct {v3, v0, v4}, La/sd8;-><init>(Ljava/lang/Object;B)V

    .line 235
    .line 236
    .line 237
    new-instance v4, La/ugd;

    .line 238
    .line 239
    const v5, -0x162ee14e

    .line 240
    .line 241
    .line 242
    invoke-direct {v4, v5, v13, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 243
    .line 244
    .line 245
    const/4 v3, 0x2

    .line 246
    invoke-static {v1, v2, v10, v4, v3}, La/hcz;->e(La/hcz;Ljava/lang/String;La/sgy;La/xdr;I)V

    .line 247
    .line 248
    .line 249
    :cond_4
    iget-object v2, v0, La/h7h;->g:La/a4x;

    .line 250
    .line 251
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 252
    .line 253
    .line 254
    move-result v2

    .line 255
    new-instance v3, La/hfg;

    .line 256
    .line 257
    const/16 v4, 0xd

    .line 258
    .line 259
    invoke-direct {v3, v0, v4}, La/hfg;-><init>(Ljava/lang/Object;B)V

    .line 260
    .line 261
    .line 262
    new-instance v4, La/ec30;

    .line 263
    .line 264
    const/16 v5, 0x14

    .line 265
    .line 266
    invoke-direct {v4, v0, v15, v5}, La/ec30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 267
    .line 268
    .line 269
    new-instance v5, La/ugd;

    .line 270
    .line 271
    const v0, -0x6fe9c60

    .line 272
    .line 273
    .line 274
    invoke-direct {v5, v0, v13, v4}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    const/4 v6, 0x4

    .line 278
    const/4 v4, 0x0

    .line 279
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 280
    .line 281
    .line 282
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 283
    .line 284
    return-object v0

    .line 285
    :pswitch_2
    check-cast v0, La/z6h;

    .line 286
    .line 287
    check-cast v15, La/i3t0;

    .line 288
    .line 289
    move-object/from16 v1, p1

    .line 290
    .line 291
    check-cast v1, La/lwk;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    new-instance v1, La/pr0;

    .line 297
    .line 298
    invoke-direct {v1, v0, v15, v9}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 299
    .line 300
    .line 301
    return-object v1

    .line 302
    :pswitch_3
    check-cast v0, La/ppg;

    .line 303
    .line 304
    check-cast v15, La/cp;

    .line 305
    .line 306
    move-object/from16 v1, p1

    .line 307
    .line 308
    check-cast v1, Landroid/view/View;

    .line 309
    .line 310
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-virtual {v15}, La/cp;->u()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, La/b2z;

    .line 318
    .line 319
    iget-object v0, v0, La/ppg;->a:La/vqg;

    .line 320
    .line 321
    iget-object v0, v0, La/vqg;->L:La/p7m0;

    .line 322
    .line 323
    iget-byte v1, v1, La/b2z;->a:B

    .line 324
    .line 325
    int-to-long v1, v1

    .line 326
    const-wide/16 v3, 0x12

    .line 327
    .line 328
    cmp-long v3, v1, v3

    .line 329
    .line 330
    if-nez v3, :cond_6

    .line 331
    .line 332
    :cond_5
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 333
    .line 334
    .line 335
    move-result-object v1

    .line 336
    move-object v2, v1

    .line 337
    check-cast v2, La/lpg;

    .line 338
    .line 339
    iget-boolean v3, v2, La/lpg;->a:Z

    .line 340
    .line 341
    xor-int/2addr v3, v13

    .line 342
    iget-boolean v2, v2, La/lpg;->b:Z

    .line 343
    .line 344
    new-instance v4, La/lpg;

    .line 345
    .line 346
    invoke-direct {v4, v3, v2}, La/lpg;-><init>(ZZ)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_5

    .line 354
    .line 355
    goto :goto_2

    .line 356
    :cond_6
    const-wide/16 v3, 0x13

    .line 357
    .line 358
    cmp-long v1, v1, v3

    .line 359
    .line 360
    if-nez v1, :cond_8

    .line 361
    .line 362
    :cond_7
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    move-object v2, v1

    .line 367
    check-cast v2, La/lpg;

    .line 368
    .line 369
    iget-boolean v3, v2, La/lpg;->b:Z

    .line 370
    .line 371
    xor-int/2addr v3, v13

    .line 372
    iget-boolean v2, v2, La/lpg;->a:Z

    .line 373
    .line 374
    new-instance v4, La/lpg;

    .line 375
    .line 376
    invoke-direct {v4, v2, v3}, La/lpg;-><init>(ZZ)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v0, v1, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v1

    .line 383
    if-eqz v1, :cond_7

    .line 384
    .line 385
    :cond_8
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object v0

    .line 388
    :pswitch_4
    check-cast v0, La/uzg;

    .line 389
    .line 390
    check-cast v15, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 391
    .line 392
    move-object/from16 v1, p1

    .line 393
    .line 394
    check-cast v1, La/k0w0;

    .line 395
    .line 396
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 400
    .line 401
    new-instance v2, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;

    .line 402
    .line 403
    invoke-direct {v2, v15}, Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;-><init>(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;)V

    .line 404
    .line 405
    .line 406
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$mainDisciplinesScreen$1;

    .line 407
    .line 408
    invoke-direct {v3, v0, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$mainDisciplinesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/CyberMainDisciplinesParams$Disciplines;)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 412
    .line 413
    .line 414
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 415
    .line 416
    return-object v0

    .line 417
    :pswitch_5
    check-cast v0, La/uzg;

    .line 418
    .line 419
    check-cast v15, Ljava/util/List;

    .line 420
    .line 421
    move-object/from16 v1, p1

    .line 422
    .line 423
    check-cast v1, La/k0w0;

    .line 424
    .line 425
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    iget-object v0, v0, La/uzg;->b:La/vqc;

    .line 429
    .line 430
    new-instance v2, Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;

    .line 431
    .line 432
    invoke-direct {v2, v15}, Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;-><init>(Ljava/util/List;)V

    .line 433
    .line 434
    .line 435
    new-instance v3, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualRecommendedEventsScreen$1;

    .line 436
    .line 437
    invoke-direct {v3, v0, v2}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$virtualRecommendedEventsScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/virtualrecommended/VirtualRecommendedEventsParams;)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v1, v3}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 441
    .line 442
    .line 443
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_6
    check-cast v0, La/vqg;

    .line 447
    .line 448
    move-object/from16 v23, v15

    .line 449
    .line 450
    check-cast v23, Ljava/lang/String;

    .line 451
    .line 452
    move-object/from16 v1, p1

    .line 453
    .line 454
    check-cast v1, La/k0w0;

    .line 455
    .line 456
    iget-object v2, v0, La/vqg;->u:La/qgh;

    .line 457
    .line 458
    sget-object v3, La/sip;->a:La/bek;

    .line 459
    .line 460
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 461
    .line 462
    .line 463
    sget-object v17, La/sip;->b:La/sip;

    .line 464
    .line 465
    sget-object v18, La/dam0;->b:La/dam0;

    .line 466
    .line 467
    iget-object v3, v0, La/vqg;->b:Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 468
    .line 469
    iget-wide v3, v3, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;->b:J

    .line 470
    .line 471
    iget-object v5, v0, La/vqg;->F:Ljava/util/List;

    .line 472
    .line 473
    new-instance v7, Ljava/util/ArrayList;

    .line 474
    .line 475
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 476
    .line 477
    .line 478
    move-result v6

    .line 479
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 480
    .line 481
    .line 482
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 483
    .line 484
    .line 485
    move-result-object v5

    .line 486
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 487
    .line 488
    .line 489
    move-result v6

    .line 490
    if-eqz v6, :cond_9

    .line 491
    .line 492
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 493
    .line 494
    .line 495
    move-result-object v6

    .line 496
    check-cast v6, La/t9m0;

    .line 497
    .line 498
    iget-short v6, v6, La/t9m0;->a:S

    .line 499
    .line 500
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 501
    .line 502
    .line 503
    move-result-object v6

    .line 504
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    goto :goto_3

    .line 508
    :cond_9
    iget-object v0, v0, La/vqg;->O:Ljava/util/List;

    .line 509
    .line 510
    new-instance v16, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 511
    .line 512
    const-wide/16 v19, 0x28

    .line 513
    .line 514
    move-object/from16 v25, v0

    .line 515
    .line 516
    move-wide/from16 v21, v3

    .line 517
    .line 518
    move-object/from16 v24, v7

    .line 519
    .line 520
    invoke-direct/range {v16 .. v25}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 521
    .line 522
    .line 523
    move-object/from16 v0, v16

    .line 524
    .line 525
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    new-instance v2, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 529
    .line 530
    invoke-direct {v2, v0}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 531
    .line 532
    .line 533
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 534
    .line 535
    .line 536
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 537
    .line 538
    return-object v0

    .line 539
    :pswitch_7
    check-cast v0, La/ulg;

    .line 540
    .line 541
    check-cast v15, La/xah;

    .line 542
    .line 543
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, La/k0w0;

    .line 546
    .line 547
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    new-instance v2, La/ffd;

    .line 551
    .line 552
    const/4 v3, 0x4

    .line 553
    invoke-direct {v2, v0, v15, v10, v3}, La/ffd;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 554
    .line 555
    .line 556
    new-instance v0, La/b1w0;

    .line 557
    .line 558
    invoke-direct {v0, v2}, La/b1w0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v1, v0}, La/k0w0;->b(La/g1w0;)La/ikt0;

    .line 562
    .line 563
    .line 564
    move-result-object v0

    .line 565
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, La/c8d;

    .line 568
    .line 569
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 570
    .line 571
    new-instance v2, La/v7d;

    .line 572
    .line 573
    invoke-direct {v2, v13, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 574
    .line 575
    .line 576
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 577
    .line 578
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 579
    .line 580
    return-object v0

    .line 581
    :pswitch_8
    check-cast v0, La/xig;

    .line 582
    .line 583
    check-cast v15, Ljava/util/List;

    .line 584
    .line 585
    move-object/from16 v1, p1

    .line 586
    .line 587
    check-cast v1, La/k0w0;

    .line 588
    .line 589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    iget-object v2, v0, La/xig;->E:La/vqc;

    .line 593
    .line 594
    new-instance v3, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;

    .line 595
    .line 596
    iget-object v4, v0, La/xig;->p:Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;

    .line 597
    .line 598
    iget-object v4, v4, Lorg/xplatform/cyber/section/api/championships/list/presentation/CyberChampsMainParams;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 599
    .line 600
    iget-byte v4, v4, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 601
    .line 602
    iget-object v0, v0, La/xig;->o:La/sip;

    .line 603
    .line 604
    sget-object v5, La/sip;->c:La/sip;

    .line 605
    .line 606
    if-ne v0, v5, :cond_a

    .line 607
    .line 608
    goto :goto_4

    .line 609
    :cond_a
    move v13, v14

    .line 610
    :goto_4
    invoke-direct {v3, v4, v15, v13}, Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams$ChampsGames;-><init>(ILjava/util/List;Z)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    new-instance v0, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;

    .line 617
    .line 618
    invoke-direct {v0, v2, v3}, Lorg/xplatform/cyber/section/impl/navigation/CyberGamesScreenFactoryImpl$esportsGamesScreen$1;-><init>(La/vqc;Lorg/xplatform/cyber/section/api/presentation/EsportsGamesScreenParams;)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 622
    .line 623
    .line 624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_9
    check-cast v0, La/kei;

    .line 628
    .line 629
    move-object v3, v15

    .line 630
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 631
    .line 632
    move-object/from16 v1, p1

    .line 633
    .line 634
    check-cast v1, La/rig;

    .line 635
    .line 636
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    iget-object v0, v0, La/kei;->r:La/wdk0;

    .line 640
    .line 641
    new-instance v2, La/xdk0;

    .line 642
    .line 643
    sget-object v5, La/rek0;->b:La/rek0;

    .line 644
    .line 645
    iget-object v6, v1, La/rig;->a:Ljava/lang/String;

    .line 646
    .line 647
    const/4 v10, 0x0

    .line 648
    const/16 v11, 0x7c

    .line 649
    .line 650
    const/4 v7, 0x0

    .line 651
    const/4 v8, 0x0

    .line 652
    const/4 v9, 0x0

    .line 653
    move-object v4, v2

    .line 654
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 655
    .line 656
    .line 657
    const/16 v8, 0x3fc

    .line 658
    .line 659
    const/4 v4, 0x0

    .line 660
    const/4 v5, 0x0

    .line 661
    const/4 v6, 0x0

    .line 662
    move-object v1, v0

    .line 663
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 664
    .line 665
    .line 666
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_a
    check-cast v0, La/cnb;

    .line 670
    .line 671
    check-cast v15, La/a4x;

    .line 672
    .line 673
    move-object/from16 v1, p1

    .line 674
    .line 675
    check-cast v1, La/ov40;

    .line 676
    .line 677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    iput-object v0, v1, La/ov40;->b:La/mbo0;

    .line 681
    .line 682
    invoke-interface {v15}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 687
    .line 688
    .line 689
    move-result v2

    .line 690
    if-eqz v2, :cond_b

    .line 691
    .line 692
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v2

    .line 696
    check-cast v2, Lkotlin/Pair;

    .line 697
    .line 698
    iget-object v3, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 699
    .line 700
    check-cast v3, La/cnb;

    .line 701
    .line 702
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 703
    .line 704
    check-cast v2, La/ajg;

    .line 705
    .line 706
    invoke-virtual {v1, v3, v2}, La/ov40;->a(La/mbo0;La/v7h0;)V

    .line 707
    .line 708
    .line 709
    goto :goto_5

    .line 710
    :cond_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 711
    .line 712
    return-object v0

    .line 713
    :pswitch_b
    check-cast v0, La/gdg;

    .line 714
    .line 715
    check-cast v15, Ljava/lang/Throwable;

    .line 716
    .line 717
    move-object/from16 v1, p1

    .line 718
    .line 719
    check-cast v1, Ljava/lang/Throwable;

    .line 720
    .line 721
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 722
    .line 723
    .line 724
    iget-object v0, v0, La/gdg;->l:La/duj;

    .line 725
    .line 726
    invoke-virtual {v0, v15}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 727
    .line 728
    .line 729
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 730
    .line 731
    return-object v0

    .line 732
    :pswitch_c
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 733
    .line 734
    check-cast v15, La/bcg;

    .line 735
    .line 736
    move-object/from16 v1, p1

    .line 737
    .line 738
    check-cast v1, La/h2l0;

    .line 739
    .line 740
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    check-cast v15, La/zbg;

    .line 744
    .line 745
    iget-wide v2, v15, La/zbg;->b:J

    .line 746
    .line 747
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    invoke-interface {v0, v2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 755
    .line 756
    return-object v0

    .line 757
    :pswitch_d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 758
    .line 759
    check-cast v15, La/i9g;

    .line 760
    .line 761
    move-object/from16 v1, p1

    .line 762
    .line 763
    check-cast v1, Landroid/view/View;

    .line 764
    .line 765
    sget v2, Lorg/xplatform/cyber/calendar/impl/presentation/content/calendarperiod/CyberCalendarPeriodView;->p:I

    .line 766
    .line 767
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 768
    .line 769
    .line 770
    invoke-interface {v0, v15}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    invoke-static {}, La/dyb;->u0()V

    .line 774
    .line 775
    .line 776
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 777
    .line 778
    return-object v0

    .line 779
    :pswitch_e
    check-cast v0, La/mhc;

    .line 780
    .line 781
    check-cast v15, La/cp;

    .line 782
    .line 783
    move-object/from16 v1, p1

    .line 784
    .line 785
    check-cast v1, Landroid/view/View;

    .line 786
    .line 787
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 788
    .line 789
    .line 790
    invoke-virtual {v15}, La/cp;->u()Ljava/lang/Object;

    .line 791
    .line 792
    .line 793
    move-result-object v1

    .line 794
    check-cast v1, La/a7g;

    .line 795
    .line 796
    iget-wide v1, v1, La/a7g;->a:J

    .line 797
    .line 798
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 799
    .line 800
    .line 801
    move-result-object v1

    .line 802
    invoke-virtual {v15}, La/cp;->u()Ljava/lang/Object;

    .line 803
    .line 804
    .line 805
    move-result-object v2

    .line 806
    check-cast v2, La/a7g;

    .line 807
    .line 808
    iget-boolean v2, v2, La/a7g;->d:Z

    .line 809
    .line 810
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 811
    .line 812
    .line 813
    move-result-object v2

    .line 814
    invoke-virtual {v0, v1, v2}, La/mhc;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 815
    .line 816
    .line 817
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 818
    .line 819
    return-object v0

    .line 820
    :pswitch_f
    check-cast v0, La/uxf;

    .line 821
    .line 822
    check-cast v15, La/pz40;

    .line 823
    .line 824
    move-object/from16 v1, p1

    .line 825
    .line 826
    check-cast v1, La/j6z;

    .line 827
    .line 828
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    invoke-interface {v1}, La/j6z;->g()J

    .line 832
    .line 833
    .line 834
    move-result-wide v1

    .line 835
    const/16 v3, 0x20

    .line 836
    .line 837
    shr-long/2addr v1, v3

    .line 838
    long-to-int v1, v1

    .line 839
    invoke-static {v1}, La/sj3;->d0(I)I

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    int-to-float v1, v1

    .line 844
    sget-object v2, La/qmk;->a:La/zcl;

    .line 845
    .line 846
    const/4 v2, 0x0

    .line 847
    invoke-static {v1, v2}, La/ycl;->b(FF)Z

    .line 848
    .line 849
    .line 850
    move-result v2

    .line 851
    if-nez v2, :cond_c

    .line 852
    .line 853
    iget v0, v0, La/uxf;->e:F

    .line 854
    .line 855
    const/high16 v2, 0x41e00000    # 28.0f

    .line 856
    .line 857
    sub-float/2addr v1, v2

    .line 858
    mul-float/2addr v1, v0

    .line 859
    float-to-int v14, v1

    .line 860
    :cond_c
    int-to-float v0, v14

    .line 861
    new-instance v1, La/ycl;

    .line 862
    .line 863
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 864
    .line 865
    .line 866
    invoke-interface {v15, v1}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 867
    .line 868
    .line 869
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 870
    .line 871
    return-object v0

    .line 872
    :pswitch_10
    check-cast v0, La/ouf;

    .line 873
    .line 874
    check-cast v15, La/vne;

    .line 875
    .line 876
    move-object/from16 v1, p1

    .line 877
    .line 878
    check-cast v1, Ljava/lang/Throwable;

    .line 879
    .line 880
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    invoke-virtual {v1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    .line 884
    .line 885
    .line 886
    iget-object v2, v0, La/ouf;->j:La/p7m0;

    .line 887
    .line 888
    sget-object v3, La/i8d;->e:La/i8d;

    .line 889
    .line 890
    invoke-virtual {v2, v10, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    invoke-virtual {v0, v1, v15}, La/vw5;->f(Ljava/lang/Throwable;La/vne;)V

    .line 894
    .line 895
    .line 896
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 897
    .line 898
    return-object v0

    .line 899
    :pswitch_11
    check-cast v0, La/ddh;

    .line 900
    .line 901
    check-cast v15, Landroid/content/Context;

    .line 902
    .line 903
    move-object/from16 v1, p1

    .line 904
    .line 905
    check-cast v1, La/oth;

    .line 906
    .line 907
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 908
    .line 909
    .line 910
    iget-object v2, v1, La/oth;->f:Landroid/widget/TextView;

    .line 911
    .line 912
    iget-object v3, v0, La/ddh;->c:La/uch;

    .line 913
    .line 914
    iget-boolean v4, v0, La/ddh;->k:Z

    .line 915
    .line 916
    iget-object v5, v3, La/uch;->b:Ljava/lang/String;

    .line 917
    .line 918
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 919
    .line 920
    .line 921
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 922
    .line 923
    iget-object v2, v1, La/oth;->c:Landroid/widget/ImageView;

    .line 924
    .line 925
    iget-object v3, v3, La/uch;->a:Ljava/lang/String;

    .line 926
    .line 927
    invoke-static {v2, v3, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 928
    .line 929
    .line 930
    iget-object v2, v1, La/oth;->j:Landroid/widget/TextView;

    .line 931
    .line 932
    iget-object v3, v0, La/ddh;->d:La/adh;

    .line 933
    .line 934
    iget-object v5, v3, La/adh;->b:Ljava/lang/String;

    .line 935
    .line 936
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 937
    .line 938
    .line 939
    iget-object v2, v1, La/oth;->e:Landroid/widget/ImageView;

    .line 940
    .line 941
    iget-object v3, v3, La/adh;->a:Ljava/lang/String;

    .line 942
    .line 943
    invoke-static {v2, v3, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 944
    .line 945
    .line 946
    iget-object v2, v1, La/oth;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 947
    .line 948
    iget-object v3, v0, La/ddh;->e:La/wch;

    .line 949
    .line 950
    iget-object v3, v3, La/wch;->a:Ljava/lang/String;

    .line 951
    .line 952
    const/16 v22, 0x0

    .line 953
    .line 954
    const/16 v23, 0x1fe

    .line 955
    .line 956
    const/16 v18, 0x0

    .line 957
    .line 958
    const/16 v19, 0x0

    .line 959
    .line 960
    const/16 v20, 0x0

    .line 961
    .line 962
    const/16 v21, 0x0

    .line 963
    .line 964
    move-object/from16 v16, v2

    .line 965
    .line 966
    move-object/from16 v17, v3

    .line 967
    .line 968
    invoke-static/range {v16 .. v23}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 969
    .line 970
    .line 971
    iget-object v2, v1, La/oth;->g:Landroid/widget/TextView;

    .line 972
    .line 973
    iget-object v3, v0, La/ddh;->f:La/ank0;

    .line 974
    .line 975
    invoke-virtual {v3, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 980
    .line 981
    .line 982
    iget-object v3, v1, La/oth;->k:Landroid/widget/TextView;

    .line 983
    .line 984
    iget-object v5, v0, La/ddh;->g:La/ank0;

    .line 985
    .line 986
    invoke-virtual {v5, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 987
    .line 988
    .line 989
    move-result-object v5

    .line 990
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 991
    .line 992
    .line 993
    iget-object v5, v1, La/oth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 994
    .line 995
    iget v6, v0, La/ddh;->h:I

    .line 996
    .line 997
    invoke-virtual {v15, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 998
    .line 999
    .line 1000
    move-result-object v6

    .line 1001
    invoke-virtual {v5, v6}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1002
    .line 1003
    .line 1004
    iget-object v5, v1, La/oth;->h:Landroid/widget/TextView;

    .line 1005
    .line 1006
    iget-object v6, v0, La/ddh;->i:La/xch;

    .line 1007
    .line 1008
    iget-object v7, v6, La/xch;->a:Ljava/lang/String;

    .line 1009
    .line 1010
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1011
    .line 1012
    .line 1013
    iget-object v5, v1, La/oth;->d:Landroid/widget/ImageView;

    .line 1014
    .line 1015
    iget-boolean v6, v6, La/xch;->b:Z

    .line 1016
    .line 1017
    if-eqz v6, :cond_d

    .line 1018
    .line 1019
    move v6, v14

    .line 1020
    goto :goto_6

    .line 1021
    :cond_d
    move v6, v9

    .line 1022
    :goto_6
    invoke-virtual {v5, v6}, Landroid/view/View;->setVisibility(I)V

    .line 1023
    .line 1024
    .line 1025
    iget-object v1, v1, La/oth;->i:Landroid/widget/TextView;

    .line 1026
    .line 1027
    iget-object v0, v0, La/ddh;->j:Ljava/lang/String;

    .line 1028
    .line 1029
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1030
    .line 1031
    .line 1032
    if-eqz v4, :cond_e

    .line 1033
    .line 1034
    move v0, v14

    .line 1035
    goto :goto_7

    .line 1036
    :cond_e
    move v0, v9

    .line 1037
    :goto_7
    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 1038
    .line 1039
    .line 1040
    if-eqz v4, :cond_f

    .line 1041
    .line 1042
    move v9, v14

    .line 1043
    :cond_f
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1044
    .line 1045
    .line 1046
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1047
    .line 1048
    return-object v0

    .line 1049
    :pswitch_12
    check-cast v0, La/chv0;

    .line 1050
    .line 1051
    check-cast v15, Landroid/content/Context;

    .line 1052
    .line 1053
    move-object/from16 v1, p1

    .line 1054
    .line 1055
    check-cast v1, La/op20;

    .line 1056
    .line 1057
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    iget-object v2, v1, La/op20;->e:Landroid/widget/TextView;

    .line 1061
    .line 1062
    iget-object v3, v0, La/chv0;->b:Ljava/lang/String;

    .line 1063
    .line 1064
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1065
    .line 1066
    .line 1067
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1068
    .line 1069
    iget-object v3, v1, La/op20;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1070
    .line 1071
    iget-object v4, v0, La/chv0;->c:Ljava/lang/String;

    .line 1072
    .line 1073
    const/4 v9, 0x0

    .line 1074
    const/16 v10, 0x1fc

    .line 1075
    .line 1076
    const v5, 0x7f080394

    .line 1077
    .line 1078
    .line 1079
    const/4 v6, 0x0

    .line 1080
    const/4 v7, 0x0

    .line 1081
    const/4 v8, 0x0

    .line 1082
    invoke-static/range {v3 .. v10}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1083
    .line 1084
    .line 1085
    iget-object v2, v1, La/op20;->d:Landroid/widget/TextView;

    .line 1086
    .line 1087
    iget-object v3, v0, La/chv0;->d:La/ank0;

    .line 1088
    .line 1089
    invoke-virtual {v3, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v3

    .line 1093
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1094
    .line 1095
    .line 1096
    iget-object v2, v1, La/op20;->g:Landroid/widget/TextView;

    .line 1097
    .line 1098
    iget-object v3, v0, La/chv0;->e:La/ank0;

    .line 1099
    .line 1100
    invoke-virtual {v3, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v3

    .line 1104
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1105
    .line 1106
    .line 1107
    iget-object v2, v1, La/op20;->c:Landroid/widget/TextView;

    .line 1108
    .line 1109
    iget-object v3, v0, La/chv0;->f:Ljava/lang/String;

    .line 1110
    .line 1111
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1112
    .line 1113
    .line 1114
    iget-object v2, v1, La/op20;->f:Landroid/widget/TextView;

    .line 1115
    .line 1116
    iget-object v3, v0, La/chv0;->g:Ljava/lang/String;

    .line 1117
    .line 1118
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1119
    .line 1120
    .line 1121
    iget-object v1, v1, La/op20;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1122
    .line 1123
    iget v2, v0, La/chv0;->h:I

    .line 1124
    .line 1125
    invoke-virtual {v15, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1130
    .line 1131
    .line 1132
    iget-boolean v0, v0, La/chv0;->i:Z

    .line 1133
    .line 1134
    if-eqz v0, :cond_10

    .line 1135
    .line 1136
    invoke-virtual {v1, v12}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1137
    .line 1138
    .line 1139
    goto :goto_8

    .line 1140
    :cond_10
    invoke-virtual {v1, v14}, Landroid/view/View;->setLayoutDirection(I)V

    .line 1141
    .line 1142
    .line 1143
    :goto_8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1144
    .line 1145
    return-object v0

    .line 1146
    :pswitch_13
    check-cast v0, La/cof;

    .line 1147
    .line 1148
    check-cast v15, Landroid/content/Context;

    .line 1149
    .line 1150
    move-object/from16 v1, p1

    .line 1151
    .line 1152
    check-cast v1, La/gth;

    .line 1153
    .line 1154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1155
    .line 1156
    .line 1157
    iget-object v2, v1, La/gth;->P:Landroid/widget/TextView;

    .line 1158
    .line 1159
    iget-object v3, v0, La/cof;->c:La/vnf;

    .line 1160
    .line 1161
    iget-object v4, v3, La/vnf;->b:Ljava/lang/String;

    .line 1162
    .line 1163
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1164
    .line 1165
    .line 1166
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1167
    .line 1168
    iget-object v2, v1, La/gth;->J:Landroid/widget/ImageView;

    .line 1169
    .line 1170
    iget-object v3, v3, La/vnf;->a:Ljava/lang/String;

    .line 1171
    .line 1172
    invoke-static {v2, v3, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1173
    .line 1174
    .line 1175
    iget-object v2, v1, La/gth;->L:Landroid/widget/TextView;

    .line 1176
    .line 1177
    iget-object v3, v0, La/cof;->e:La/oqf;

    .line 1178
    .line 1179
    iget-object v4, v3, La/oqf;->a:La/ank0;

    .line 1180
    .line 1181
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v4

    .line 1185
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1186
    .line 1187
    .line 1188
    iget-object v2, v3, La/oqf;->b:Ljava/lang/String;

    .line 1189
    .line 1190
    iget-object v4, v1, La/gth;->e:Landroid/widget/ImageView;

    .line 1191
    .line 1192
    invoke-static {v4, v2}, La/qbc;->G(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1193
    .line 1194
    .line 1195
    iget-object v2, v3, La/oqf;->c:Ljava/lang/String;

    .line 1196
    .line 1197
    iget-object v4, v1, La/gth;->F:Landroid/widget/ImageView;

    .line 1198
    .line 1199
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1200
    .line 1201
    .line 1202
    iget-object v2, v3, La/oqf;->d:Ljava/lang/String;

    .line 1203
    .line 1204
    iget-object v4, v1, La/gth;->b:Landroid/widget/ImageView;

    .line 1205
    .line 1206
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1207
    .line 1208
    .line 1209
    iget-object v2, v3, La/oqf;->e:Ljava/lang/String;

    .line 1210
    .line 1211
    iget-object v4, v1, La/gth;->f:Landroid/widget/ImageView;

    .line 1212
    .line 1213
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1214
    .line 1215
    .line 1216
    iget-object v2, v3, La/oqf;->f:Ljava/lang/String;

    .line 1217
    .line 1218
    iget-object v4, v1, La/gth;->g:Landroid/widget/ImageView;

    .line 1219
    .line 1220
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1221
    .line 1222
    .line 1223
    iget-object v2, v3, La/oqf;->g:Ljava/lang/String;

    .line 1224
    .line 1225
    iget-object v4, v1, La/gth;->d:Landroid/widget/ImageView;

    .line 1226
    .line 1227
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    iget-object v2, v3, La/oqf;->h:Ljava/lang/String;

    .line 1231
    .line 1232
    iget-object v3, v1, La/gth;->c:Landroid/widget/ImageView;

    .line 1233
    .line 1234
    invoke-static {v3, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1235
    .line 1236
    .line 1237
    iget-object v2, v1, La/gth;->O:Landroid/widget/TextView;

    .line 1238
    .line 1239
    iget-object v3, v0, La/cof;->f:La/oqf;

    .line 1240
    .line 1241
    iget-object v4, v3, La/oqf;->a:La/ank0;

    .line 1242
    .line 1243
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v4

    .line 1247
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1248
    .line 1249
    .line 1250
    iget-object v2, v3, La/oqf;->b:Ljava/lang/String;

    .line 1251
    .line 1252
    iget-object v4, v1, La/gth;->w:Landroid/widget/ImageView;

    .line 1253
    .line 1254
    invoke-static {v4, v2}, La/qbc;->G(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1255
    .line 1256
    .line 1257
    iget-object v2, v3, La/oqf;->c:Ljava/lang/String;

    .line 1258
    .line 1259
    iget-object v4, v1, La/gth;->I:Landroid/widget/ImageView;

    .line 1260
    .line 1261
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1262
    .line 1263
    .line 1264
    iget-object v2, v3, La/oqf;->d:Ljava/lang/String;

    .line 1265
    .line 1266
    iget-object v4, v1, La/gth;->t:Landroid/widget/ImageView;

    .line 1267
    .line 1268
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1269
    .line 1270
    .line 1271
    iget-object v2, v3, La/oqf;->e:Ljava/lang/String;

    .line 1272
    .line 1273
    iget-object v4, v1, La/gth;->x:Landroid/widget/ImageView;

    .line 1274
    .line 1275
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1276
    .line 1277
    .line 1278
    iget-object v2, v3, La/oqf;->f:Ljava/lang/String;

    .line 1279
    .line 1280
    iget-object v4, v1, La/gth;->y:Landroid/widget/ImageView;

    .line 1281
    .line 1282
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    iget-object v2, v3, La/oqf;->g:Ljava/lang/String;

    .line 1286
    .line 1287
    iget-object v4, v1, La/gth;->v:Landroid/widget/ImageView;

    .line 1288
    .line 1289
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1290
    .line 1291
    .line 1292
    iget-object v2, v3, La/oqf;->h:Ljava/lang/String;

    .line 1293
    .line 1294
    iget-object v3, v1, La/gth;->u:Landroid/widget/ImageView;

    .line 1295
    .line 1296
    invoke-static {v3, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1297
    .line 1298
    .line 1299
    iget-object v2, v1, La/gth;->Q:Landroid/widget/TextView;

    .line 1300
    .line 1301
    iget-object v3, v0, La/cof;->g:La/oqf;

    .line 1302
    .line 1303
    iget-object v4, v3, La/oqf;->a:La/ank0;

    .line 1304
    .line 1305
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1306
    .line 1307
    .line 1308
    move-result-object v4

    .line 1309
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1310
    .line 1311
    .line 1312
    iget-object v2, v3, La/oqf;->b:Ljava/lang/String;

    .line 1313
    .line 1314
    iget-object v4, v1, La/gth;->C:Landroid/widget/ImageView;

    .line 1315
    .line 1316
    invoke-static {v4, v2}, La/qbc;->G(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1317
    .line 1318
    .line 1319
    iget-object v2, v3, La/oqf;->c:Ljava/lang/String;

    .line 1320
    .line 1321
    iget-object v4, v1, La/gth;->K:Landroid/widget/ImageView;

    .line 1322
    .line 1323
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1324
    .line 1325
    .line 1326
    iget-object v2, v3, La/oqf;->d:Ljava/lang/String;

    .line 1327
    .line 1328
    iget-object v4, v1, La/gth;->z:Landroid/widget/ImageView;

    .line 1329
    .line 1330
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1331
    .line 1332
    .line 1333
    iget-object v2, v3, La/oqf;->e:Ljava/lang/String;

    .line 1334
    .line 1335
    iget-object v4, v1, La/gth;->D:Landroid/widget/ImageView;

    .line 1336
    .line 1337
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1338
    .line 1339
    .line 1340
    iget-object v2, v3, La/oqf;->f:Ljava/lang/String;

    .line 1341
    .line 1342
    iget-object v4, v1, La/gth;->E:Landroid/widget/ImageView;

    .line 1343
    .line 1344
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1345
    .line 1346
    .line 1347
    iget-object v2, v3, La/oqf;->g:Ljava/lang/String;

    .line 1348
    .line 1349
    iget-object v4, v1, La/gth;->B:Landroid/widget/ImageView;

    .line 1350
    .line 1351
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1352
    .line 1353
    .line 1354
    iget-object v2, v3, La/oqf;->h:Ljava/lang/String;

    .line 1355
    .line 1356
    iget-object v3, v1, La/gth;->A:Landroid/widget/ImageView;

    .line 1357
    .line 1358
    invoke-static {v3, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    iget-object v2, v1, La/gth;->N:Landroid/widget/TextView;

    .line 1362
    .line 1363
    iget-object v3, v0, La/cof;->h:La/oqf;

    .line 1364
    .line 1365
    iget-object v4, v3, La/oqf;->a:La/ank0;

    .line 1366
    .line 1367
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1368
    .line 1369
    .line 1370
    move-result-object v4

    .line 1371
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1372
    .line 1373
    .line 1374
    iget-object v2, v3, La/oqf;->b:Ljava/lang/String;

    .line 1375
    .line 1376
    iget-object v4, v1, La/gth;->q:Landroid/widget/ImageView;

    .line 1377
    .line 1378
    invoke-static {v4, v2}, La/qbc;->G(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1379
    .line 1380
    .line 1381
    iget-object v6, v1, La/gth;->H:Landroid/widget/ImageView;

    .line 1382
    .line 1383
    iget-object v7, v3, La/oqf;->c:Ljava/lang/String;

    .line 1384
    .line 1385
    const/4 v12, 0x0

    .line 1386
    const/16 v13, 0x1fc

    .line 1387
    .line 1388
    const v8, 0x7f0803a1

    .line 1389
    .line 1390
    .line 1391
    const/4 v9, 0x0

    .line 1392
    const/4 v10, 0x0

    .line 1393
    const/4 v11, 0x0

    .line 1394
    invoke-static/range {v6 .. v13}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 1395
    .line 1396
    .line 1397
    iget-object v2, v3, La/oqf;->d:Ljava/lang/String;

    .line 1398
    .line 1399
    iget-object v4, v1, La/gth;->n:Landroid/widget/ImageView;

    .line 1400
    .line 1401
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1402
    .line 1403
    .line 1404
    iget-object v2, v3, La/oqf;->e:Ljava/lang/String;

    .line 1405
    .line 1406
    iget-object v4, v1, La/gth;->r:Landroid/widget/ImageView;

    .line 1407
    .line 1408
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    iget-object v2, v3, La/oqf;->f:Ljava/lang/String;

    .line 1412
    .line 1413
    iget-object v4, v1, La/gth;->s:Landroid/widget/ImageView;

    .line 1414
    .line 1415
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1416
    .line 1417
    .line 1418
    iget-object v2, v3, La/oqf;->g:Ljava/lang/String;

    .line 1419
    .line 1420
    iget-object v4, v1, La/gth;->p:Landroid/widget/ImageView;

    .line 1421
    .line 1422
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1423
    .line 1424
    .line 1425
    iget-object v2, v3, La/oqf;->h:Ljava/lang/String;

    .line 1426
    .line 1427
    iget-object v3, v1, La/gth;->o:Landroid/widget/ImageView;

    .line 1428
    .line 1429
    invoke-static {v3, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1430
    .line 1431
    .line 1432
    iget-object v2, v1, La/gth;->M:Landroid/widget/TextView;

    .line 1433
    .line 1434
    iget-object v3, v0, La/cof;->i:La/oqf;

    .line 1435
    .line 1436
    iget-object v4, v3, La/oqf;->a:La/ank0;

    .line 1437
    .line 1438
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v4

    .line 1442
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1443
    .line 1444
    .line 1445
    iget-object v2, v3, La/oqf;->b:Ljava/lang/String;

    .line 1446
    .line 1447
    iget-object v4, v1, La/gth;->k:Landroid/widget/ImageView;

    .line 1448
    .line 1449
    invoke-static {v4, v2}, La/qbc;->G(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1450
    .line 1451
    .line 1452
    iget-object v2, v3, La/oqf;->c:Ljava/lang/String;

    .line 1453
    .line 1454
    iget-object v4, v1, La/gth;->G:Landroid/widget/ImageView;

    .line 1455
    .line 1456
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1457
    .line 1458
    .line 1459
    iget-object v2, v3, La/oqf;->d:Ljava/lang/String;

    .line 1460
    .line 1461
    iget-object v4, v1, La/gth;->h:Landroid/widget/ImageView;

    .line 1462
    .line 1463
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1464
    .line 1465
    .line 1466
    iget-object v2, v3, La/oqf;->e:Ljava/lang/String;

    .line 1467
    .line 1468
    iget-object v4, v1, La/gth;->l:Landroid/widget/ImageView;

    .line 1469
    .line 1470
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1471
    .line 1472
    .line 1473
    iget-object v2, v3, La/oqf;->f:Ljava/lang/String;

    .line 1474
    .line 1475
    iget-object v4, v1, La/gth;->m:Landroid/widget/ImageView;

    .line 1476
    .line 1477
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1478
    .line 1479
    .line 1480
    iget-object v2, v3, La/oqf;->g:Ljava/lang/String;

    .line 1481
    .line 1482
    iget-object v4, v1, La/gth;->j:Landroid/widget/ImageView;

    .line 1483
    .line 1484
    invoke-static {v4, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1485
    .line 1486
    .line 1487
    iget-object v2, v3, La/oqf;->h:Ljava/lang/String;

    .line 1488
    .line 1489
    iget-object v3, v1, La/gth;->i:Landroid/widget/ImageView;

    .line 1490
    .line 1491
    invoke-static {v3, v2}, La/qbc;->H(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 1492
    .line 1493
    .line 1494
    iget-object v2, v1, La/gth;->V:Landroid/view/View;

    .line 1495
    .line 1496
    iget v3, v0, La/cof;->d:I

    .line 1497
    .line 1498
    invoke-virtual {v15, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v4

    .line 1502
    invoke-virtual {v2, v4}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1503
    .line 1504
    .line 1505
    iget-object v2, v1, La/gth;->R:Landroid/widget/TextView;

    .line 1506
    .line 1507
    invoke-virtual {v15, v3}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v3

    .line 1511
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 1512
    .line 1513
    .line 1514
    iget-object v3, v0, La/cof;->j:Ljava/lang/String;

    .line 1515
    .line 1516
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1517
    .line 1518
    .line 1519
    iget-boolean v0, v0, La/cof;->k:Z

    .line 1520
    .line 1521
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v2

    .line 1525
    invoke-virtual {v2, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 1526
    .line 1527
    .line 1528
    move-result v2

    .line 1529
    if-eqz v0, :cond_11

    .line 1530
    .line 1531
    iget-object v0, v1, La/gth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1532
    .line 1533
    invoke-virtual {v0, v14, v14, v14, v2}, Landroid/view/View;->setPadding(IIII)V

    .line 1534
    .line 1535
    .line 1536
    :cond_11
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1537
    .line 1538
    return-object v0

    .line 1539
    :pswitch_14
    check-cast v0, La/rnf;

    .line 1540
    .line 1541
    move-object/from16 v23, v15

    .line 1542
    .line 1543
    check-cast v23, Ljava/lang/String;

    .line 1544
    .line 1545
    move-object/from16 v1, p1

    .line 1546
    .line 1547
    check-cast v1, La/k0w0;

    .line 1548
    .line 1549
    iget-object v2, v0, La/rnf;->P:La/qgh;

    .line 1550
    .line 1551
    sget-object v3, La/sip;->a:La/bek;

    .line 1552
    .line 1553
    iget-object v4, v0, La/rnf;->q:Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;

    .line 1554
    .line 1555
    iget-boolean v5, v4, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;->b:Z

    .line 1556
    .line 1557
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1558
    .line 1559
    .line 1560
    invoke-static {v5}, La/bek;->f(Z)La/sip;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v17

    .line 1564
    sget-object v18, La/dam0;->a:La/dam0;

    .line 1565
    .line 1566
    iget-wide v3, v4, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;->d:J

    .line 1567
    .line 1568
    sget-object v5, La/xmf;->c:La/c0o;

    .line 1569
    .line 1570
    new-instance v7, Ljava/util/ArrayList;

    .line 1571
    .line 1572
    invoke-static {v5, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1573
    .line 1574
    .line 1575
    move-result v6

    .line 1576
    invoke-direct {v7, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v5}, La/b3;->iterator()Ljava/util/Iterator;

    .line 1580
    .line 1581
    .line 1582
    move-result-object v5

    .line 1583
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1584
    .line 1585
    .line 1586
    move-result v6

    .line 1587
    if-eqz v6, :cond_12

    .line 1588
    .line 1589
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v6

    .line 1593
    check-cast v6, La/xmf;

    .line 1594
    .line 1595
    iget-object v6, v6, La/xmf;->a:La/t9m0;

    .line 1596
    .line 1597
    iget-short v6, v6, La/t9m0;->a:S

    .line 1598
    .line 1599
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v6

    .line 1603
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1604
    .line 1605
    .line 1606
    goto :goto_9

    .line 1607
    :cond_12
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1608
    .line 1609
    .line 1610
    move-result-object v5

    .line 1611
    check-cast v5, La/wmf;

    .line 1612
    .line 1613
    iget-object v5, v5, La/wmf;->f:La/mrf;

    .line 1614
    .line 1615
    if-eqz v5, :cond_14

    .line 1616
    .line 1617
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    .line 1618
    .line 1619
    .line 1620
    move-result-object v0

    .line 1621
    check-cast v0, La/wmf;

    .line 1622
    .line 1623
    iget-object v0, v0, La/wmf;->b:La/jlr;

    .line 1624
    .line 1625
    invoke-static {v0}, La/d5c;->C(La/jlr;)La/m9s;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v0

    .line 1629
    invoke-static {v5, v0}, La/u1c;->v(La/mrf;La/m9s;)La/lc00;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    if-nez v0, :cond_13

    .line 1634
    .line 1635
    goto :goto_b

    .line 1636
    :cond_13
    :goto_a
    move-object/from16 v25, v0

    .line 1637
    .line 1638
    goto :goto_c

    .line 1639
    :cond_14
    :goto_b
    sget-object v0, La/iun;->a:La/iun;

    .line 1640
    .line 1641
    goto :goto_a

    .line 1642
    :goto_c
    new-instance v16, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;

    .line 1643
    .line 1644
    const-wide/16 v19, 0x28

    .line 1645
    .line 1646
    move-wide/from16 v21, v3

    .line 1647
    .line 1648
    move-object/from16 v24, v7

    .line 1649
    .line 1650
    invoke-direct/range {v16 .. v25}, Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;-><init>(La/sip;La/dam0;JJLjava/lang/String;Ljava/util/List;Ljava/util/List;)V

    .line 1651
    .line 1652
    .line 1653
    move-object/from16 v0, v16

    .line 1654
    .line 1655
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    new-instance v2, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;

    .line 1659
    .line 1660
    invoke-direct {v2, v0}, Lorg/xplatform/cyber/statistics_blocks/impl/navigation/CyberStatisticsBlocksScreensFactoryImpl$getStatisticBlocksScreen$1;-><init>(Lorg/xplatform/cyber/statistics_blocks/api/StatisticBlocksParams;)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v1, v2}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1664
    .line 1665
    .line 1666
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1667
    .line 1668
    return-object v0

    .line 1669
    :pswitch_15
    check-cast v0, La/qgg0;

    .line 1670
    .line 1671
    check-cast v15, La/drf;

    .line 1672
    .line 1673
    move-object/from16 v1, p1

    .line 1674
    .line 1675
    check-cast v1, La/cth;

    .line 1676
    .line 1677
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1678
    .line 1679
    .line 1680
    iget-object v1, v1, La/cth;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 1681
    .line 1682
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v2

    .line 1686
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1687
    .line 1688
    .line 1689
    move-result v2

    .line 1690
    if-nez v2, :cond_15

    .line 1691
    .line 1692
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 1693
    .line 1694
    .line 1695
    :cond_15
    iget-object v1, v15, La/drf;->a:Ljava/util/ArrayList;

    .line 1696
    .line 1697
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 1698
    .line 1699
    .line 1700
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1701
    .line 1702
    return-object v0

    .line 1703
    :pswitch_16
    check-cast v0, La/lmf;

    .line 1704
    .line 1705
    check-cast v15, Landroid/content/Context;

    .line 1706
    .line 1707
    move-object/from16 v1, p1

    .line 1708
    .line 1709
    check-cast v1, La/dth;

    .line 1710
    .line 1711
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1712
    .line 1713
    .line 1714
    iget-object v2, v1, La/dth;->K:Landroid/widget/TextView;

    .line 1715
    .line 1716
    iget-object v3, v0, La/lmf;->c:La/jmf;

    .line 1717
    .line 1718
    iget-object v4, v3, La/jmf;->b:Ljava/lang/String;

    .line 1719
    .line 1720
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1721
    .line 1722
    .line 1723
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1724
    .line 1725
    iget-object v2, v1, La/dth;->b:Landroid/widget/ImageView;

    .line 1726
    .line 1727
    iget-object v3, v3, La/jmf;->a:Ljava/lang/String;

    .line 1728
    .line 1729
    invoke-static {v2, v3, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 1730
    .line 1731
    .line 1732
    iget-object v2, v0, La/lmf;->d:La/orf;

    .line 1733
    .line 1734
    iget-object v3, v1, La/dth;->l:Landroid/widget/TextView;

    .line 1735
    .line 1736
    iget-object v4, v2, La/orf;->a:La/ank0;

    .line 1737
    .line 1738
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1739
    .line 1740
    .line 1741
    move-result-object v4

    .line 1742
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1743
    .line 1744
    .line 1745
    iget-object v3, v1, La/dth;->f:Landroid/widget/TextView;

    .line 1746
    .line 1747
    iget-object v4, v2, La/orf;->g:La/ank0;

    .line 1748
    .line 1749
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v4

    .line 1753
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1754
    .line 1755
    .line 1756
    iget-object v3, v1, La/dth;->h:Landroid/widget/TextView;

    .line 1757
    .line 1758
    iget-object v4, v2, La/orf;->f:La/ank0;

    .line 1759
    .line 1760
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v4

    .line 1764
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1765
    .line 1766
    .line 1767
    iget-object v3, v1, La/dth;->g:Landroid/widget/TextView;

    .line 1768
    .line 1769
    iget-object v4, v2, La/orf;->e:La/ank0;

    .line 1770
    .line 1771
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v4

    .line 1775
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1776
    .line 1777
    .line 1778
    iget-object v3, v1, La/dth;->j:Landroid/widget/TextView;

    .line 1779
    .line 1780
    iget-object v4, v2, La/orf;->d:La/ank0;

    .line 1781
    .line 1782
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1783
    .line 1784
    .line 1785
    move-result-object v4

    .line 1786
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1787
    .line 1788
    .line 1789
    iget-object v3, v1, La/dth;->k:Landroid/widget/TextView;

    .line 1790
    .line 1791
    iget-object v4, v2, La/orf;->c:La/ank0;

    .line 1792
    .line 1793
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v4

    .line 1797
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1798
    .line 1799
    .line 1800
    iget-object v3, v1, La/dth;->i:Landroid/widget/TextView;

    .line 1801
    .line 1802
    iget-object v2, v2, La/orf;->b:La/ank0;

    .line 1803
    .line 1804
    invoke-virtual {v2, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1805
    .line 1806
    .line 1807
    move-result-object v2

    .line 1808
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1809
    .line 1810
    .line 1811
    iget-object v2, v0, La/lmf;->e:La/orf;

    .line 1812
    .line 1813
    iget-object v3, v1, La/dth;->J:Landroid/widget/TextView;

    .line 1814
    .line 1815
    iget-object v4, v2, La/orf;->a:La/ank0;

    .line 1816
    .line 1817
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v4

    .line 1821
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1822
    .line 1823
    .line 1824
    iget-object v3, v1, La/dth;->D:Landroid/widget/TextView;

    .line 1825
    .line 1826
    iget-object v4, v2, La/orf;->g:La/ank0;

    .line 1827
    .line 1828
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v4

    .line 1832
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1833
    .line 1834
    .line 1835
    iget-object v3, v1, La/dth;->F:Landroid/widget/TextView;

    .line 1836
    .line 1837
    iget-object v4, v2, La/orf;->f:La/ank0;

    .line 1838
    .line 1839
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v4

    .line 1843
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1844
    .line 1845
    .line 1846
    iget-object v3, v1, La/dth;->E:Landroid/widget/TextView;

    .line 1847
    .line 1848
    iget-object v4, v2, La/orf;->e:La/ank0;

    .line 1849
    .line 1850
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1851
    .line 1852
    .line 1853
    move-result-object v4

    .line 1854
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1855
    .line 1856
    .line 1857
    iget-object v3, v1, La/dth;->H:Landroid/widget/TextView;

    .line 1858
    .line 1859
    iget-object v4, v2, La/orf;->d:La/ank0;

    .line 1860
    .line 1861
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v4

    .line 1865
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1866
    .line 1867
    .line 1868
    iget-object v3, v1, La/dth;->I:Landroid/widget/TextView;

    .line 1869
    .line 1870
    iget-object v4, v2, La/orf;->c:La/ank0;

    .line 1871
    .line 1872
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1873
    .line 1874
    .line 1875
    move-result-object v4

    .line 1876
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1877
    .line 1878
    .line 1879
    iget-object v3, v1, La/dth;->G:Landroid/widget/TextView;

    .line 1880
    .line 1881
    iget-object v2, v2, La/orf;->b:La/ank0;

    .line 1882
    .line 1883
    invoke-virtual {v2, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v2

    .line 1887
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1888
    .line 1889
    .line 1890
    iget-object v2, v0, La/lmf;->f:La/orf;

    .line 1891
    .line 1892
    iget-object v3, v1, La/dth;->R:Landroid/widget/TextView;

    .line 1893
    .line 1894
    iget-object v4, v2, La/orf;->a:La/ank0;

    .line 1895
    .line 1896
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1897
    .line 1898
    .line 1899
    move-result-object v4

    .line 1900
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1901
    .line 1902
    .line 1903
    iget-object v3, v1, La/dth;->L:Landroid/widget/TextView;

    .line 1904
    .line 1905
    iget-object v4, v2, La/orf;->g:La/ank0;

    .line 1906
    .line 1907
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1908
    .line 1909
    .line 1910
    move-result-object v4

    .line 1911
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1912
    .line 1913
    .line 1914
    iget-object v3, v1, La/dth;->N:Landroid/widget/TextView;

    .line 1915
    .line 1916
    iget-object v4, v2, La/orf;->f:La/ank0;

    .line 1917
    .line 1918
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v4

    .line 1922
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1923
    .line 1924
    .line 1925
    iget-object v3, v1, La/dth;->M:Landroid/widget/TextView;

    .line 1926
    .line 1927
    iget-object v4, v2, La/orf;->e:La/ank0;

    .line 1928
    .line 1929
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1930
    .line 1931
    .line 1932
    move-result-object v4

    .line 1933
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1934
    .line 1935
    .line 1936
    iget-object v3, v1, La/dth;->P:Landroid/widget/TextView;

    .line 1937
    .line 1938
    iget-object v4, v2, La/orf;->d:La/ank0;

    .line 1939
    .line 1940
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v4

    .line 1944
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1945
    .line 1946
    .line 1947
    iget-object v3, v1, La/dth;->Q:Landroid/widget/TextView;

    .line 1948
    .line 1949
    iget-object v4, v2, La/orf;->c:La/ank0;

    .line 1950
    .line 1951
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v4

    .line 1955
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1956
    .line 1957
    .line 1958
    iget-object v3, v1, La/dth;->O:Landroid/widget/TextView;

    .line 1959
    .line 1960
    iget-object v2, v2, La/orf;->b:La/ank0;

    .line 1961
    .line 1962
    invoke-virtual {v2, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v2

    .line 1966
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1967
    .line 1968
    .line 1969
    iget-object v2, v0, La/lmf;->g:La/orf;

    .line 1970
    .line 1971
    iget-object v3, v1, La/dth;->z:Landroid/widget/TextView;

    .line 1972
    .line 1973
    iget-object v4, v2, La/orf;->a:La/ank0;

    .line 1974
    .line 1975
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1976
    .line 1977
    .line 1978
    move-result-object v4

    .line 1979
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1980
    .line 1981
    .line 1982
    iget-object v3, v1, La/dth;->t:Landroid/widget/TextView;

    .line 1983
    .line 1984
    iget-object v4, v2, La/orf;->g:La/ank0;

    .line 1985
    .line 1986
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1987
    .line 1988
    .line 1989
    move-result-object v4

    .line 1990
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1991
    .line 1992
    .line 1993
    iget-object v3, v1, La/dth;->v:Landroid/widget/TextView;

    .line 1994
    .line 1995
    iget-object v4, v2, La/orf;->f:La/ank0;

    .line 1996
    .line 1997
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 1998
    .line 1999
    .line 2000
    move-result-object v4

    .line 2001
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2002
    .line 2003
    .line 2004
    iget-object v3, v1, La/dth;->u:Landroid/widget/TextView;

    .line 2005
    .line 2006
    iget-object v4, v2, La/orf;->e:La/ank0;

    .line 2007
    .line 2008
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2009
    .line 2010
    .line 2011
    move-result-object v4

    .line 2012
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2013
    .line 2014
    .line 2015
    iget-object v3, v1, La/dth;->x:Landroid/widget/TextView;

    .line 2016
    .line 2017
    iget-object v4, v2, La/orf;->d:La/ank0;

    .line 2018
    .line 2019
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v4

    .line 2023
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2024
    .line 2025
    .line 2026
    iget-object v3, v1, La/dth;->y:Landroid/widget/TextView;

    .line 2027
    .line 2028
    iget-object v4, v2, La/orf;->c:La/ank0;

    .line 2029
    .line 2030
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2031
    .line 2032
    .line 2033
    move-result-object v4

    .line 2034
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2035
    .line 2036
    .line 2037
    iget-object v3, v1, La/dth;->w:Landroid/widget/TextView;

    .line 2038
    .line 2039
    iget-object v2, v2, La/orf;->b:La/ank0;

    .line 2040
    .line 2041
    invoke-virtual {v2, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v2

    .line 2045
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2046
    .line 2047
    .line 2048
    iget-object v2, v0, La/lmf;->h:La/orf;

    .line 2049
    .line 2050
    iget-object v3, v1, La/dth;->s:Landroid/widget/TextView;

    .line 2051
    .line 2052
    iget-object v4, v2, La/orf;->a:La/ank0;

    .line 2053
    .line 2054
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v4

    .line 2058
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2059
    .line 2060
    .line 2061
    iget-object v3, v1, La/dth;->m:Landroid/widget/TextView;

    .line 2062
    .line 2063
    iget-object v4, v2, La/orf;->g:La/ank0;

    .line 2064
    .line 2065
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v4

    .line 2069
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2070
    .line 2071
    .line 2072
    iget-object v3, v1, La/dth;->o:Landroid/widget/TextView;

    .line 2073
    .line 2074
    iget-object v4, v2, La/orf;->f:La/ank0;

    .line 2075
    .line 2076
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v4

    .line 2080
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2081
    .line 2082
    .line 2083
    iget-object v3, v1, La/dth;->n:Landroid/widget/TextView;

    .line 2084
    .line 2085
    iget-object v4, v2, La/orf;->e:La/ank0;

    .line 2086
    .line 2087
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2088
    .line 2089
    .line 2090
    move-result-object v4

    .line 2091
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2092
    .line 2093
    .line 2094
    iget-object v3, v1, La/dth;->q:Landroid/widget/TextView;

    .line 2095
    .line 2096
    iget-object v4, v2, La/orf;->d:La/ank0;

    .line 2097
    .line 2098
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2099
    .line 2100
    .line 2101
    move-result-object v4

    .line 2102
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2103
    .line 2104
    .line 2105
    iget-object v3, v1, La/dth;->r:Landroid/widget/TextView;

    .line 2106
    .line 2107
    iget-object v4, v2, La/orf;->c:La/ank0;

    .line 2108
    .line 2109
    invoke-virtual {v4, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2110
    .line 2111
    .line 2112
    move-result-object v4

    .line 2113
    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2114
    .line 2115
    .line 2116
    iget-object v3, v1, La/dth;->p:Landroid/widget/TextView;

    .line 2117
    .line 2118
    iget-object v2, v2, La/orf;->b:La/ank0;

    .line 2119
    .line 2120
    invoke-virtual {v2, v15}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v2

    .line 2124
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2125
    .line 2126
    .line 2127
    iget-boolean v2, v0, La/lmf;->j:Z

    .line 2128
    .line 2129
    invoke-virtual {v15}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2130
    .line 2131
    .line 2132
    move-result-object v3

    .line 2133
    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 2134
    .line 2135
    .line 2136
    move-result v3

    .line 2137
    if-eqz v2, :cond_16

    .line 2138
    .line 2139
    iget-object v2, v1, La/dth;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2140
    .line 2141
    invoke-virtual {v2, v14, v14, v14, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 2142
    .line 2143
    .line 2144
    :cond_16
    iget v0, v0, La/lmf;->i:I

    .line 2145
    .line 2146
    iget-object v2, v1, La/dth;->S:Landroid/view/View;

    .line 2147
    .line 2148
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v3

    .line 2152
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2153
    .line 2154
    .line 2155
    iget-object v2, v1, La/dth;->A:Landroid/widget/TextView;

    .line 2156
    .line 2157
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2158
    .line 2159
    .line 2160
    move-result-object v3

    .line 2161
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2162
    .line 2163
    .line 2164
    iget-object v2, v1, La/dth;->C:Landroid/widget/TextView;

    .line 2165
    .line 2166
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2167
    .line 2168
    .line 2169
    move-result-object v3

    .line 2170
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2171
    .line 2172
    .line 2173
    iget-object v2, v1, La/dth;->B:Landroid/widget/TextView;

    .line 2174
    .line 2175
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2176
    .line 2177
    .line 2178
    move-result-object v3

    .line 2179
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2180
    .line 2181
    .line 2182
    iget-object v2, v1, La/dth;->d:Landroid/widget/TextView;

    .line 2183
    .line 2184
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v3

    .line 2188
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2189
    .line 2190
    .line 2191
    iget-object v2, v1, La/dth;->e:Landroid/widget/TextView;

    .line 2192
    .line 2193
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v3

    .line 2197
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2198
    .line 2199
    .line 2200
    iget-object v1, v1, La/dth;->c:Landroid/widget/TextView;

    .line 2201
    .line 2202
    invoke-virtual {v15, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v0

    .line 2206
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2207
    .line 2208
    .line 2209
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2210
    .line 2211
    return-object v0

    .line 2212
    :pswitch_17
    check-cast v0, La/elf;

    .line 2213
    .line 2214
    check-cast v15, La/ilf;

    .line 2215
    .line 2216
    move-object/from16 v1, p1

    .line 2217
    .line 2218
    check-cast v1, La/lwk;

    .line 2219
    .line 2220
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v0, v15}, La/yge0;->v(La/ahe0;)V

    .line 2224
    .line 2225
    .line 2226
    new-instance v1, La/pr0;

    .line 2227
    .line 2228
    invoke-direct {v1, v0, v15, v4}, La/pr0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2229
    .line 2230
    .line 2231
    return-object v1

    .line 2232
    :pswitch_18
    check-cast v0, La/llf;

    .line 2233
    .line 2234
    check-cast v15, La/ctf0;

    .line 2235
    .line 2236
    move-object/from16 v1, p1

    .line 2237
    .line 2238
    check-cast v1, La/bnk0;

    .line 2239
    .line 2240
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2241
    .line 2242
    .line 2243
    iget-object v8, v0, La/llf;->d:Ljava/lang/String;

    .line 2244
    .line 2245
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 2246
    .line 2247
    .line 2248
    move-result v2

    .line 2249
    if-nez v2, :cond_17

    .line 2250
    .line 2251
    new-array v2, v14, [Ljava/lang/Object;

    .line 2252
    .line 2253
    iget-object v3, v15, La/ctf0;->b:La/lsm0;

    .line 2254
    .line 2255
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v2

    .line 2259
    const v4, 0x7f130583

    .line 2260
    .line 2261
    .line 2262
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2263
    .line 2264
    .line 2265
    move-result-object v2

    .line 2266
    const/4 v6, 0x0

    .line 2267
    const/16 v7, 0x36

    .line 2268
    .line 2269
    const/4 v3, 0x0

    .line 2270
    const v4, 0x7f0606da

    .line 2271
    .line 2272
    .line 2273
    const/4 v5, 0x0

    .line 2274
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2275
    .line 2276
    .line 2277
    goto :goto_d

    .line 2278
    :cond_17
    new-array v2, v14, [Ljava/lang/Object;

    .line 2279
    .line 2280
    iget-object v3, v15, La/ctf0;->b:La/lsm0;

    .line 2281
    .line 2282
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2283
    .line 2284
    .line 2285
    move-result-object v2

    .line 2286
    const v4, 0x7f130581

    .line 2287
    .line 2288
    .line 2289
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2290
    .line 2291
    .line 2292
    move-result-object v2

    .line 2293
    const/4 v6, 0x0

    .line 2294
    const/16 v7, 0x36

    .line 2295
    .line 2296
    const/4 v3, 0x0

    .line 2297
    const v4, 0x7f0606da

    .line 2298
    .line 2299
    .line 2300
    const/4 v5, 0x0

    .line 2301
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2302
    .line 2303
    .line 2304
    const-string v2, " "

    .line 2305
    .line 2306
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2307
    .line 2308
    .line 2309
    move-object v2, v8

    .line 2310
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2311
    .line 2312
    .line 2313
    :goto_d
    const/4 v6, 0x0

    .line 2314
    const/16 v7, 0x36

    .line 2315
    .line 2316
    const-string v2, " ("

    .line 2317
    .line 2318
    const/4 v3, 0x0

    .line 2319
    const v4, 0x7f0606da

    .line 2320
    .line 2321
    .line 2322
    const/4 v5, 0x0

    .line 2323
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2324
    .line 2325
    .line 2326
    iget v2, v0, La/llf;->c:I

    .line 2327
    .line 2328
    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2329
    .line 2330
    .line 2331
    move-result-object v2

    .line 2332
    const v4, 0x7f06010b

    .line 2333
    .line 2334
    .line 2335
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2336
    .line 2337
    .line 2338
    const-string v2, " "

    .line 2339
    .line 2340
    const v4, 0x7f0606da

    .line 2341
    .line 2342
    .line 2343
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2344
    .line 2345
    .line 2346
    new-array v2, v14, [Ljava/lang/Object;

    .line 2347
    .line 2348
    iget-object v3, v15, La/ctf0;->b:La/lsm0;

    .line 2349
    .line 2350
    invoke-static {v2, v14}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v2

    .line 2354
    const v4, 0x7f130582

    .line 2355
    .line 2356
    .line 2357
    invoke-virtual {v3, v4, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2358
    .line 2359
    .line 2360
    move-result-object v2

    .line 2361
    const/4 v3, 0x0

    .line 2362
    const v4, 0x7f0606da

    .line 2363
    .line 2364
    .line 2365
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2366
    .line 2367
    .line 2368
    const-string v2, " "

    .line 2369
    .line 2370
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2371
    .line 2372
    .line 2373
    iget v0, v0, La/llf;->b:I

    .line 2374
    .line 2375
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2376
    .line 2377
    .line 2378
    move-result-object v2

    .line 2379
    const v4, 0x7f06010a

    .line 2380
    .line 2381
    .line 2382
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2383
    .line 2384
    .line 2385
    const-string v2, ")"

    .line 2386
    .line 2387
    const v4, 0x7f0606da

    .line 2388
    .line 2389
    .line 2390
    invoke-static/range {v1 .. v7}, La/pzw;->E(La/bnk0;Ljava/lang/String;IIIII)V

    .line 2391
    .line 2392
    .line 2393
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2394
    .line 2395
    return-object v0

    .line 2396
    :pswitch_19
    check-cast v0, La/xkf;

    .line 2397
    .line 2398
    check-cast v15, Landroid/content/Context;

    .line 2399
    .line 2400
    move-object/from16 v1, p1

    .line 2401
    .line 2402
    check-cast v1, La/ath;

    .line 2403
    .line 2404
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2405
    .line 2406
    .line 2407
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 2408
    .line 2409
    iget-object v2, v1, La/ath;->c:Landroid/widget/ImageView;

    .line 2410
    .line 2411
    iget-object v3, v1, La/ath;->d:Landroid/widget/ImageView;

    .line 2412
    .line 2413
    iget-object v4, v1, La/ath;->f:Landroid/widget/TextView;

    .line 2414
    .line 2415
    iget-object v5, v0, La/xkf;->d:La/tkf;

    .line 2416
    .line 2417
    iget-object v6, v0, La/xkf;->e:La/wkf;

    .line 2418
    .line 2419
    iget-object v7, v5, La/tkf;->a:Ljava/lang/String;

    .line 2420
    .line 2421
    invoke-static {v2, v7, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2422
    .line 2423
    .line 2424
    iget-boolean v7, v5, La/tkf;->b:Z

    .line 2425
    .line 2426
    iget-object v5, v5, La/tkf;->c:Ljava/lang/String;

    .line 2427
    .line 2428
    if-eqz v7, :cond_18

    .line 2429
    .line 2430
    move v7, v14

    .line 2431
    goto :goto_e

    .line 2432
    :cond_18
    move v7, v9

    .line 2433
    :goto_e
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2434
    .line 2435
    .line 2436
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 2437
    .line 2438
    .line 2439
    move-result v2

    .line 2440
    if-lez v2, :cond_19

    .line 2441
    .line 2442
    move v2, v14

    .line 2443
    goto :goto_f

    .line 2444
    :cond_19
    move v2, v9

    .line 2445
    :goto_f
    invoke-virtual {v4, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2446
    .line 2447
    .line 2448
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2449
    .line 2450
    .line 2451
    iget-object v2, v1, La/ath;->h:Landroid/widget/TextView;

    .line 2452
    .line 2453
    iget-object v4, v6, La/wkf;->a:Ljava/lang/String;

    .line 2454
    .line 2455
    invoke-static {v3, v4, v11, v12}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 2456
    .line 2457
    .line 2458
    iget-boolean v4, v6, La/wkf;->b:Z

    .line 2459
    .line 2460
    iget-object v5, v6, La/wkf;->c:Ljava/lang/String;

    .line 2461
    .line 2462
    if-eqz v4, :cond_1a

    .line 2463
    .line 2464
    move v4, v14

    .line 2465
    goto :goto_10

    .line 2466
    :cond_1a
    move v4, v9

    .line 2467
    :goto_10
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2468
    .line 2469
    .line 2470
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 2471
    .line 2472
    .line 2473
    move-result v3

    .line 2474
    if-lez v3, :cond_1b

    .line 2475
    .line 2476
    move v3, v14

    .line 2477
    goto :goto_11

    .line 2478
    :cond_1b
    move v3, v9

    .line 2479
    :goto_11
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 2480
    .line 2481
    .line 2482
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2483
    .line 2484
    .line 2485
    iget-object v2, v1, La/ath;->e:Landroid/widget/TextView;

    .line 2486
    .line 2487
    iget-boolean v3, v0, La/xkf;->f:Z

    .line 2488
    .line 2489
    if-eqz v3, :cond_1c

    .line 2490
    .line 2491
    move v9, v14

    .line 2492
    :cond_1c
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2493
    .line 2494
    .line 2495
    iget-object v2, v1, La/ath;->g:Landroid/widget/TextView;

    .line 2496
    .line 2497
    iget-object v3, v0, La/xkf;->b:Ljava/lang/String;

    .line 2498
    .line 2499
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2500
    .line 2501
    .line 2502
    iget-object v4, v1, La/ath;->b:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 2503
    .line 2504
    iget-object v5, v0, La/xkf;->c:Ljava/lang/String;

    .line 2505
    .line 2506
    const/4 v10, 0x0

    .line 2507
    const/16 v11, 0x1fe

    .line 2508
    .line 2509
    const/4 v6, 0x0

    .line 2510
    const/4 v7, 0x0

    .line 2511
    const/4 v8, 0x0

    .line 2512
    const/4 v9, 0x0

    .line 2513
    invoke-static/range {v4 .. v11}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 2514
    .line 2515
    .line 2516
    iget-object v1, v1, La/ath;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2517
    .line 2518
    iget v0, v0, La/xkf;->g:I

    .line 2519
    .line 2520
    invoke-static {v0, v15}, La/sj3;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 2521
    .line 2522
    .line 2523
    move-result-object v0

    .line 2524
    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 2525
    .line 2526
    .line 2527
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2528
    .line 2529
    return-object v0

    .line 2530
    :pswitch_1a
    check-cast v0, Landroid/os/CancellationSignal;

    .line 2531
    .line 2532
    check-cast v15, La/icf;

    .line 2533
    .line 2534
    iget-object v1, v15, La/icf;->d:Landroid/content/Context;

    .line 2535
    .line 2536
    move-object/from16 v4, p1

    .line 2537
    .line 2538
    check-cast v4, Landroid/app/PendingIntent;

    .line 2539
    .line 2540
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2541
    .line 2542
    .line 2543
    sget-object v5, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 2544
    .line 2545
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2546
    .line 2547
    .line 2548
    invoke-static {v0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 2549
    .line 2550
    .line 2551
    move-result v5

    .line 2552
    if-eqz v5, :cond_1d

    .line 2553
    .line 2554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2555
    .line 2556
    goto :goto_13

    .line 2557
    :cond_1d
    new-instance v5, Landroid/content/Intent;

    .line 2558
    .line 2559
    invoke-direct {v5, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2560
    .line 2561
    .line 2562
    iget-object v3, v15, La/icf;->h:Landroidx/credentials/playservices/controllers/identityauth/getsigninintent/CredentialProviderGetSignInIntentController$resultReceiver$1;

    .line 2563
    .line 2564
    const-string v6, "SIGN_IN_INTENT"

    .line 2565
    .line 2566
    invoke-static {v3, v5, v6}, La/ecf;->a(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 2567
    .line 2568
    .line 2569
    invoke-virtual {v5, v2, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2570
    .line 2571
    .line 2572
    :try_start_0
    invoke-virtual {v1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 2573
    .line 2574
    .line 2575
    goto :goto_12

    .line 2576
    :catch_0
    sget-object v1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 2577
    .line 2578
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2579
    .line 2580
    .line 2581
    invoke-static {v0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 2582
    .line 2583
    .line 2584
    move-result v0

    .line 2585
    if-eqz v0, :cond_1e

    .line 2586
    .line 2587
    goto :goto_12

    .line 2588
    :cond_1e
    invoke-virtual {v15}, La/icf;->e()Ljava/util/concurrent/Executor;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v0

    .line 2592
    new-instance v1, La/ccf;

    .line 2593
    .line 2594
    invoke-direct {v1, v15, v13}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 2595
    .line 2596
    .line 2597
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2598
    .line 2599
    .line 2600
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2601
    .line 2602
    :goto_13
    return-object v0

    .line 2603
    :pswitch_1b
    check-cast v0, Landroid/os/CancellationSignal;

    .line 2604
    .line 2605
    check-cast v15, La/dcf;

    .line 2606
    .line 2607
    iget-object v1, v15, La/dcf;->d:Landroid/content/Context;

    .line 2608
    .line 2609
    move-object/from16 v4, p1

    .line 2610
    .line 2611
    check-cast v4, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;

    .line 2612
    .line 2613
    sget-object v5, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 2614
    .line 2615
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2616
    .line 2617
    .line 2618
    invoke-static {v0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 2619
    .line 2620
    .line 2621
    move-result v5

    .line 2622
    if-eqz v5, :cond_1f

    .line 2623
    .line 2624
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2625
    .line 2626
    goto :goto_15

    .line 2627
    :cond_1f
    new-instance v5, Landroid/content/Intent;

    .line 2628
    .line 2629
    invoke-direct {v5, v1, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 2630
    .line 2631
    .line 2632
    iget-object v3, v15, La/dcf;->h:Landroidx/credentials/playservices/controllers/identityauth/beginsignin/CredentialProviderBeginSignInController$resultReceiver$1;

    .line 2633
    .line 2634
    const-string v6, "BEGIN_SIGN_IN"

    .line 2635
    .line 2636
    invoke-static {v3, v5, v6}, La/ecf;->a(Landroid/os/ResultReceiver;Landroid/content/Intent;Ljava/lang/String;)V

    .line 2637
    .line 2638
    .line 2639
    iget-object v3, v4, Lcom/google/android/gms/auth/api/identity/BeginSignInResult;->a:Landroid/app/PendingIntent;

    .line 2640
    .line 2641
    invoke-virtual {v5, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 2642
    .line 2643
    .line 2644
    :try_start_1
    invoke-virtual {v1, v5}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 2645
    .line 2646
    .line 2647
    goto :goto_14

    .line 2648
    :catch_1
    sget-object v1, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->Companion:La/ocf;

    .line 2649
    .line 2650
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2651
    .line 2652
    .line 2653
    invoke-static {v0}, La/ocf;->a(Landroid/os/CancellationSignal;)Z

    .line 2654
    .line 2655
    .line 2656
    move-result v0

    .line 2657
    if-eqz v0, :cond_20

    .line 2658
    .line 2659
    goto :goto_14

    .line 2660
    :cond_20
    invoke-virtual {v15}, La/dcf;->e()Ljava/util/concurrent/Executor;

    .line 2661
    .line 2662
    .line 2663
    move-result-object v0

    .line 2664
    new-instance v1, La/ccf;

    .line 2665
    .line 2666
    invoke-direct {v1, v15, v14}, La/ccf;-><init>(Ljava/lang/Object;B)V

    .line 2667
    .line 2668
    .line 2669
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 2670
    .line 2671
    .line 2672
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2673
    .line 2674
    :goto_15
    return-object v0

    .line 2675
    :pswitch_1c
    check-cast v0, La/r7f;

    .line 2676
    .line 2677
    check-cast v15, Lkotlin/jvm/functions/Function0;

    .line 2678
    .line 2679
    move-object/from16 v1, p1

    .line 2680
    .line 2681
    check-cast v1, Ljava/lang/Throwable;

    .line 2682
    .line 2683
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2684
    .line 2685
    .line 2686
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 2687
    .line 2688
    if-nez v2, :cond_22

    .line 2689
    .line 2690
    iget-object v2, v0, La/r7f;->U0:La/duj;

    .line 2691
    .line 2692
    new-instance v3, La/u4f;

    .line 2693
    .line 2694
    invoke-direct {v3, v0, v13}, La/u4f;-><init>(La/r7f;B)V

    .line 2695
    .line 2696
    .line 2697
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2698
    .line 2699
    .line 2700
    invoke-interface {v15}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 2701
    .line 2702
    .line 2703
    iget-object v2, v0, La/r7f;->E1:La/bby;

    .line 2704
    .line 2705
    invoke-static {v2}, La/v3c;->N(La/bby;)V

    .line 2706
    .line 2707
    .line 2708
    sget-object v2, La/f3f;->a:La/f3f;

    .line 2709
    .line 2710
    invoke-virtual {v0, v2}, La/r7f;->R(La/c4f;)V

    .line 2711
    .line 2712
    .line 2713
    invoke-static {v1}, La/agc;->L(Ljava/lang/Throwable;)Z

    .line 2714
    .line 2715
    .line 2716
    move-result v2

    .line 2717
    if-nez v2, :cond_21

    .line 2718
    .line 2719
    invoke-static {v1}, La/agc;->N(Ljava/lang/Throwable;)Z

    .line 2720
    .line 2721
    .line 2722
    move-result v1

    .line 2723
    if-eqz v1, :cond_22

    .line 2724
    .line 2725
    :cond_21
    new-instance v1, La/t4f;

    .line 2726
    .line 2727
    invoke-direct {v1, v0, v4}, La/t4f;-><init>(La/r7f;B)V

    .line 2728
    .line 2729
    .line 2730
    invoke-virtual {v0, v1}, La/r7f;->y(Lkotlin/jvm/functions/Function1;)V

    .line 2731
    .line 2732
    .line 2733
    :cond_22
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2734
    .line 2735
    return-object v0

    .line 2736
    nop

    .line 2737
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
