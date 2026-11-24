.class public final synthetic La/rib;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/g2v;


# direct methods
.method public synthetic constructor <init>(La/g2v;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/rib;->a:B

    iput-object p1, p0, La/rib;->b:La/g2v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rib;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/rib;->b:La/g2v;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    sget-object v3, La/pb10;->u:La/pb10;

    .line 22
    .line 23
    const/4 v8, 0x0

    .line 24
    const/16 v9, 0x1fe

    .line 25
    .line 26
    iget-object v2, v0, La/rib;->b:La/g2v;

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    invoke-static/range {v2 .. v9}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 37
    .line 38
    .line 39
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object v0

    .line 42
    :pswitch_0
    move-object/from16 v1, p1

    .line 43
    .line 44
    check-cast v1, La/vzg0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    new-instance v1, La/h5r0;

    .line 50
    .line 51
    sget-object v8, La/pb10;->g:La/pb10;

    .line 52
    .line 53
    const-wide/16 v18, 0x0

    .line 54
    .line 55
    const/16 v20, 0x25e

    .line 56
    .line 57
    iget-object v7, v0, La/rib;->b:La/g2v;

    .line 58
    .line 59
    const/4 v9, 0x0

    .line 60
    const/4 v10, 0x0

    .line 61
    const/4 v11, 0x0

    .line 62
    const/4 v12, 0x0

    .line 63
    const v13, 0x7f130677

    .line 64
    .line 65
    .line 66
    const/4 v14, 0x0

    .line 67
    const v15, 0x7f131690

    .line 68
    .line 69
    .line 70
    const-wide/16 v16, 0x2710

    .line 71
    .line 72
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-direct {v1, v6, v6, v3, v0}, La/h5r0;-><init>(La/w4r0;La/d0t;ZLa/mdm;)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :pswitch_1
    move-object/from16 v1, p1

    .line 81
    .line 82
    check-cast v1, La/zan0;

    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    if-eqz v1, :cond_2

    .line 92
    .line 93
    iget-object v7, v0, La/rib;->b:La/g2v;

    .line 94
    .line 95
    if-eq v1, v5, :cond_1

    .line 96
    .line 97
    if-ne v1, v4, :cond_0

    .line 98
    .line 99
    sget-object v8, La/pb10;->g:La/pb10;

    .line 100
    .line 101
    const-wide/16 v18, 0x0

    .line 102
    .line 103
    const/16 v20, 0x25e

    .line 104
    .line 105
    const/4 v9, 0x0

    .line 106
    const/4 v10, 0x0

    .line 107
    const/4 v11, 0x0

    .line 108
    const/4 v12, 0x0

    .line 109
    const v13, 0x7f1305c0

    .line 110
    .line 111
    .line 112
    const/4 v14, 0x0

    .line 113
    const v15, 0x7f131111

    .line 114
    .line 115
    .line 116
    const-wide/16 v16, 0x2710

    .line 117
    .line 118
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    goto :goto_0

    .line 123
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :cond_1
    sget-object v8, La/pb10;->g:La/pb10;

    .line 128
    .line 129
    const-wide/16 v18, 0x0

    .line 130
    .line 131
    const/16 v20, 0x25e

    .line 132
    .line 133
    const/4 v9, 0x0

    .line 134
    const/4 v10, 0x0

    .line 135
    const/4 v11, 0x0

    .line 136
    const/4 v12, 0x0

    .line 137
    const v13, 0x7f130677

    .line 138
    .line 139
    .line 140
    const/4 v14, 0x0

    .line 141
    const v15, 0x7f131690

    .line 142
    .line 143
    .line 144
    const-wide/16 v16, 0x2710

    .line 145
    .line 146
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 147
    .line 148
    .line 149
    move-result-object v6

    .line 150
    :cond_2
    :goto_0
    return-object v6

    .line 151
    :pswitch_2
    move-object/from16 v1, p1

    .line 152
    .line 153
    check-cast v1, La/cdn0;

    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 159
    .line 160
    .line 161
    move-result v1

    .line 162
    if-eqz v1, :cond_5

    .line 163
    .line 164
    iget-object v7, v0, La/rib;->b:La/g2v;

    .line 165
    .line 166
    if-eq v1, v5, :cond_4

    .line 167
    .line 168
    if-ne v1, v4, :cond_3

    .line 169
    .line 170
    sget-object v8, La/pb10;->g:La/pb10;

    .line 171
    .line 172
    const-wide/16 v18, 0x0

    .line 173
    .line 174
    const/16 v20, 0x25e

    .line 175
    .line 176
    const/4 v9, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    const/4 v12, 0x0

    .line 180
    const v13, 0x7f1305c0

    .line 181
    .line 182
    .line 183
    const/4 v14, 0x0

    .line 184
    const v15, 0x7f131111

    .line 185
    .line 186
    .line 187
    const-wide/16 v16, 0x2710

    .line 188
    .line 189
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 190
    .line 191
    .line 192
    move-result-object v6

    .line 193
    goto :goto_1

    .line 194
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 195
    .line 196
    .line 197
    goto :goto_1

    .line 198
    :cond_4
    sget-object v8, La/pb10;->g:La/pb10;

    .line 199
    .line 200
    const-wide/16 v18, 0x0

    .line 201
    .line 202
    const/16 v20, 0x25e

    .line 203
    .line 204
    const/4 v9, 0x0

    .line 205
    const/4 v10, 0x0

    .line 206
    const/4 v11, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const v13, 0x7f130677

    .line 209
    .line 210
    .line 211
    const/4 v14, 0x0

    .line 212
    const v15, 0x7f131690

    .line 213
    .line 214
    .line 215
    const-wide/16 v16, 0x2710

    .line 216
    .line 217
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    :cond_5
    :goto_1
    return-object v6

    .line 222
    :pswitch_3
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, La/l1m0;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    iget-object v2, v1, La/l1m0;->g:La/nc5;

    .line 230
    .line 231
    iget-object v3, v1, La/l1m0;->c:Ljava/util/List;

    .line 232
    .line 233
    invoke-static {v2}, La/ydx;->c0(La/nc5;)La/j9m0;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    iget-object v4, v1, La/l1m0;->f:La/zdm0;

    .line 238
    .line 239
    iget-object v6, v1, La/l1m0;->d:La/vhh0;

    .line 240
    .line 241
    new-instance v7, La/z0m0;

    .line 242
    .line 243
    invoke-direct {v7, v4, v2, v6}, La/z0m0;-><init>(La/zdm0;La/j9m0;La/vhh0;)V

    .line 244
    .line 245
    .line 246
    iget-boolean v2, v1, La/l1m0;->a:Z

    .line 247
    .line 248
    if-eqz v2, :cond_6

    .line 249
    .line 250
    new-instance v0, La/o1m0;

    .line 251
    .line 252
    invoke-direct {v0, v7}, La/o1m0;-><init>(La/z0m0;)V

    .line 253
    .line 254
    .line 255
    goto :goto_3

    .line 256
    :cond_6
    iget-boolean v2, v1, La/l1m0;->b:Z

    .line 257
    .line 258
    iget-object v8, v0, La/rib;->b:La/g2v;

    .line 259
    .line 260
    if-eqz v2, :cond_7

    .line 261
    .line 262
    sget-object v9, La/pb10;->g:La/pb10;

    .line 263
    .line 264
    const/4 v14, 0x0

    .line 265
    const/16 v15, 0x15e

    .line 266
    .line 267
    const/4 v10, 0x0

    .line 268
    const/4 v11, 0x0

    .line 269
    const v12, 0x7f130677

    .line 270
    .line 271
    .line 272
    const v13, 0x7f131690

    .line 273
    .line 274
    .line 275
    invoke-static/range {v8 .. v15}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 276
    .line 277
    .line 278
    move-result-object v0

    .line 279
    new-instance v1, La/n1m0;

    .line 280
    .line 281
    invoke-direct {v1, v7, v0}, La/n1m0;-><init>(La/z0m0;La/jkm;)V

    .line 282
    .line 283
    .line 284
    :goto_2
    move-object v0, v1

    .line 285
    goto :goto_3

    .line 286
    :cond_7
    if-eqz v3, :cond_8

    .line 287
    .line 288
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-ne v0, v5, :cond_8

    .line 293
    .line 294
    sget-object v9, La/pb10;->g:La/pb10;

    .line 295
    .line 296
    const/4 v14, 0x0

    .line 297
    const/16 v15, 0x1de

    .line 298
    .line 299
    const/4 v10, 0x0

    .line 300
    const/4 v11, 0x0

    .line 301
    const v12, 0x7f130674

    .line 302
    .line 303
    .line 304
    const/4 v13, 0x0

    .line 305
    invoke-static/range {v8 .. v15}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    new-instance v1, La/m1m0;

    .line 310
    .line 311
    invoke-direct {v1, v7, v0}, La/m1m0;-><init>(La/z0m0;La/jkm;)V

    .line 312
    .line 313
    .line 314
    goto :goto_2

    .line 315
    :cond_8
    if-nez v3, :cond_9

    .line 316
    .line 317
    sget-object v3, La/iun;->a:La/iun;

    .line 318
    .line 319
    :cond_9
    iget-object v0, v1, La/l1m0;->e:La/xhh0;

    .line 320
    .line 321
    if-nez v0, :cond_a

    .line 322
    .line 323
    new-instance v8, La/xhh0;

    .line 324
    .line 325
    sget-object v11, La/iun;->a:La/iun;

    .line 326
    .line 327
    const/4 v12, 0x0

    .line 328
    const/4 v13, 0x0

    .line 329
    const-string v9, ""

    .line 330
    .line 331
    const/4 v10, 0x0

    .line 332
    invoke-direct/range {v8 .. v13}, La/xhh0;-><init>(Ljava/lang/String;La/lk50;Ljava/util/List;ZZ)V

    .line 333
    .line 334
    .line 335
    move-object v0, v8

    .line 336
    :cond_a
    new-instance v1, La/p1m0;

    .line 337
    .line 338
    invoke-direct {v1, v7, v3, v0}, La/p1m0;-><init>(La/z0m0;Ljava/util/List;La/xhh0;)V

    .line 339
    .line 340
    .line 341
    goto :goto_2

    .line 342
    :goto_3
    return-object v0

    .line 343
    :pswitch_4
    move-object/from16 v1, p1

    .line 344
    .line 345
    check-cast v1, La/vzg0;

    .line 346
    .line 347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    const-string v2, "SEARCH_QUERY_KEY"

    .line 351
    .line 352
    const-string v4, ""

    .line 353
    .line 354
    invoke-static {v1, v2, v4}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    move-object v10, v2

    .line 359
    check-cast v10, Ljava/lang/String;

    .line 360
    .line 361
    sget-object v11, La/iun;->a:La/iun;

    .line 362
    .line 363
    const-string v2, "SELECTED_IDS_KEY"

    .line 364
    .line 365
    sget-object v4, La/xun;->a:La/xun;

    .line 366
    .line 367
    invoke-static {v1, v2, v4}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v1

    .line 371
    move-object v12, v1

    .line 372
    check-cast v12, Ljava/util/Set;

    .line 373
    .line 374
    sget-object v14, La/pb10;->e:La/pb10;

    .line 375
    .line 376
    const-wide/16 v24, 0x0

    .line 377
    .line 378
    const/16 v26, 0x3de

    .line 379
    .line 380
    iget-object v13, v0, La/rib;->b:La/g2v;

    .line 381
    .line 382
    const/4 v15, 0x0

    .line 383
    const/16 v16, 0x0

    .line 384
    .line 385
    const/16 v17, 0x0

    .line 386
    .line 387
    const/16 v18, 0x0

    .line 388
    .line 389
    const v19, 0x7f130e37

    .line 390
    .line 391
    .line 392
    const/16 v20, 0x0

    .line 393
    .line 394
    const/16 v21, 0x0

    .line 395
    .line 396
    const-wide/16 v22, 0x0

    .line 397
    .line 398
    invoke-static/range {v13 .. v26}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 399
    .line 400
    .line 401
    move-result-object v13

    .line 402
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 403
    .line 404
    .line 405
    move-result v0

    .line 406
    if-lez v0, :cond_b

    .line 407
    .line 408
    move v9, v5

    .line 409
    goto :goto_4

    .line 410
    :cond_b
    move v9, v3

    .line 411
    :goto_4
    new-instance v6, La/tec;

    .line 412
    .line 413
    const/4 v7, 0x1

    .line 414
    const/4 v8, 0x0

    .line 415
    invoke-direct/range {v6 .. v13}, La/tec;-><init>(ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Set;La/mdm;)V

    .line 416
    .line 417
    .line 418
    return-object v6

    .line 419
    :pswitch_5
    move-object/from16 v0, p1

    .line 420
    .line 421
    check-cast v0, La/y690;

    .line 422
    .line 423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 424
    .line 425
    .line 426
    new-instance v1, La/zun;

    .line 427
    .line 428
    invoke-direct {v1, v0, v2}, La/zun;-><init>(La/y690;La/g2v;)V

    .line 429
    .line 430
    .line 431
    return-object v1

    .line 432
    :pswitch_6
    move-object/from16 v1, p1

    .line 433
    .line 434
    check-cast v1, La/ais;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 440
    .line 441
    .line 442
    move-result v1

    .line 443
    if-eqz v1, :cond_f

    .line 444
    .line 445
    iget-object v7, v0, La/rib;->b:La/g2v;

    .line 446
    .line 447
    if-eq v1, v5, :cond_e

    .line 448
    .line 449
    if-eq v1, v4, :cond_d

    .line 450
    .line 451
    const/4 v0, 0x3

    .line 452
    if-ne v1, v0, :cond_c

    .line 453
    .line 454
    sget-object v8, La/pb10;->e:La/pb10;

    .line 455
    .line 456
    const-wide/16 v18, 0x0

    .line 457
    .line 458
    const/16 v20, 0x3de

    .line 459
    .line 460
    const/4 v9, 0x0

    .line 461
    const/4 v10, 0x0

    .line 462
    const/4 v11, 0x0

    .line 463
    const/4 v12, 0x0

    .line 464
    const v13, 0x7f130e37

    .line 465
    .line 466
    .line 467
    const/4 v14, 0x0

    .line 468
    const/4 v15, 0x0

    .line 469
    const-wide/16 v16, 0x0

    .line 470
    .line 471
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    goto :goto_5

    .line 476
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 477
    .line 478
    .line 479
    goto :goto_5

    .line 480
    :cond_d
    sget-object v8, La/pb10;->g:La/pb10;

    .line 481
    .line 482
    const-wide/16 v18, 0x0

    .line 483
    .line 484
    const/16 v20, 0x25e

    .line 485
    .line 486
    const/4 v9, 0x0

    .line 487
    const/4 v10, 0x0

    .line 488
    const/4 v11, 0x0

    .line 489
    const/4 v12, 0x0

    .line 490
    const v13, 0x7f1305c0

    .line 491
    .line 492
    .line 493
    const/4 v14, 0x0

    .line 494
    const v15, 0x7f131111

    .line 495
    .line 496
    .line 497
    const-wide/16 v16, 0x2710

    .line 498
    .line 499
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 500
    .line 501
    .line 502
    move-result-object v6

    .line 503
    goto :goto_5

    .line 504
    :cond_e
    sget-object v8, La/pb10;->g:La/pb10;

    .line 505
    .line 506
    const-wide/16 v18, 0x0

    .line 507
    .line 508
    const/16 v20, 0x25e

    .line 509
    .line 510
    const/4 v9, 0x0

    .line 511
    const/4 v10, 0x0

    .line 512
    const/4 v11, 0x0

    .line 513
    const/4 v12, 0x0

    .line 514
    const v13, 0x7f130677

    .line 515
    .line 516
    .line 517
    const/4 v14, 0x0

    .line 518
    const v15, 0x7f131690

    .line 519
    .line 520
    .line 521
    const-wide/16 v16, 0x2710

    .line 522
    .line 523
    invoke-static/range {v7 .. v20}, La/g2v;->b(La/g2v;La/pb10;La/pdm;La/ldm;IIIIIJJI)La/mdm;

    .line 524
    .line 525
    .line 526
    move-result-object v6

    .line 527
    :cond_f
    :goto_5
    return-object v6

    .line 528
    :pswitch_7
    move-object/from16 v0, p1

    .line 529
    .line 530
    check-cast v0, La/kib;

    .line 531
    .line 532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    new-instance v1, La/lib;

    .line 536
    .line 537
    invoke-direct {v1, v0, v2}, La/lib;-><init>(La/kib;La/g2v;)V

    .line 538
    .line 539
    .line 540
    return-object v1

    .line 541
    :pswitch_data_0
    .packed-switch 0x0
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
