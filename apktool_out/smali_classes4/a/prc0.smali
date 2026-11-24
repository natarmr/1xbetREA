.class public final synthetic La/prc0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/prc0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/prc0;->a:B

    .line 4
    .line 5
    const-string v2, "deepLinkNavigator"

    .line 6
    .line 7
    const v3, 0x7f13113a

    .line 8
    .line 9
    .line 10
    const v4, 0x7f1312c8

    .line 11
    .line 12
    .line 13
    const-string v5, ""

    .line 14
    .line 15
    const/4 v6, 0x1

    .line 16
    const/4 v7, 0x0

    .line 17
    const/4 v8, 0x0

    .line 18
    packed-switch v1, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    move-object/from16 v1, p1

    .line 22
    .line 23
    check-cast v1, La/e2m0;

    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, La/k3t0;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_0
    move-object/from16 v1, p1

    .line 39
    .line 40
    check-cast v1, Ljava/lang/Throwable;

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, La/a6e0;

    .line 48
    .line 49
    iget-object v2, v0, La/a6e0;->t:La/duj;

    .line 50
    .line 51
    new-instance v3, La/nrc0;

    .line 52
    .line 53
    const/16 v4, 0x14

    .line 54
    .line 55
    invoke-direct {v3, v0, v4}, La/nrc0;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object v0

    .line 64
    :pswitch_1
    move-object/from16 v1, p1

    .line 65
    .line 66
    check-cast v1, La/p5e0;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v0, La/k3t0;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 79
    .line 80
    return-object v0

    .line 81
    :pswitch_2
    move-object/from16 v1, p1

    .line 82
    .line 83
    check-cast v1, La/u5e0;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v0, La/s5e0;

    .line 91
    .line 92
    sget-object v2, La/s5e0;->P1:La/jh70;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    sget-object v2, La/cko0;->m2:La/m6m0;

    .line 98
    .line 99
    iget-object v3, v1, La/u5e0;->a:Ljava/util/List;

    .line 100
    .line 101
    iget-object v1, v1, La/u5e0;->b:Ljava/lang/String;

    .line 102
    .line 103
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    new-instance v2, La/cko0;

    .line 113
    .line 114
    invoke-direct {v2}, La/cko0;-><init>()V

    .line 115
    .line 116
    .line 117
    sget-object v4, La/cko0;->n2:[La/iiy;

    .line 118
    .line 119
    aget-object v5, v4, v6

    .line 120
    .line 121
    iget-object v6, v2, La/cko0;->l2:La/es;

    .line 122
    .line 123
    invoke-virtual {v6, v2, v5, v3}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 124
    .line 125
    .line 126
    iget-object v3, v2, La/cko0;->k2:La/phf0;

    .line 127
    .line 128
    aget-object v4, v4, v7

    .line 129
    .line 130
    invoke-virtual {v3, v2, v4, v1}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-static {v2, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 141
    .line 142
    .line 143
    iget-object v0, v0, La/s5e0;->O1:La/a8z;

    .line 144
    .line 145
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    check-cast v0, La/k3t0;

    .line 150
    .line 151
    sget-object v1, La/o5e0;->a:La/o5e0;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_3
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, Ljava/lang/Throwable;

    .line 162
    .line 163
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La/t4e0;

    .line 169
    .line 170
    invoke-virtual {v0, v1}, La/t4e0;->M(Ljava/lang/Throwable;)V

    .line 171
    .line 172
    .line 173
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object v0

    .line 176
    :pswitch_4
    move-object/from16 v1, p1

    .line 177
    .line 178
    check-cast v1, Ljava/lang/Throwable;

    .line 179
    .line 180
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, La/t4e0;

    .line 186
    .line 187
    invoke-virtual {v0, v1}, La/t4e0;->M(Ljava/lang/Throwable;)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_5
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/Throwable;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 198
    .line 199
    .line 200
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 201
    .line 202
    check-cast v0, La/t4e0;

    .line 203
    .line 204
    invoke-virtual {v0, v1}, La/t4e0;->M(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 208
    .line 209
    return-object v0

    .line 210
    :pswitch_6
    move-object/from16 v1, p1

    .line 211
    .line 212
    check-cast v1, Ljava/lang/Throwable;

    .line 213
    .line 214
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 215
    .line 216
    .line 217
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 218
    .line 219
    check-cast v0, La/t4e0;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, La/t4e0;->M(Ljava/lang/Throwable;)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_7
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, La/d4e0;

    .line 230
    .line 231
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 235
    .line 236
    check-cast v0, La/k3t0;

    .line 237
    .line 238
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 239
    .line 240
    .line 241
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 242
    .line 243
    return-object v0

    .line 244
    :pswitch_8
    move-object/from16 v1, p1

    .line 245
    .line 246
    check-cast v1, La/l2e0;

    .line 247
    .line 248
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 252
    .line 253
    check-cast v0, La/k3t0;

    .line 254
    .line 255
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 256
    .line 257
    .line 258
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_9
    move-object/from16 v1, p1

    .line 262
    .line 263
    check-cast v1, La/owd0;

    .line 264
    .line 265
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 266
    .line 267
    .line 268
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 269
    .line 270
    move-object v10, v0

    .line 271
    check-cast v10, La/hxd0;

    .line 272
    .line 273
    iget-object v0, v10, La/hxd0;->E:La/ol60;

    .line 274
    .line 275
    iget-object v2, v10, La/hxd0;->u:La/zr1;

    .line 276
    .line 277
    iget-object v3, v10, La/hxd0;->t:La/ih5;

    .line 278
    .line 279
    iget-object v4, v10, La/hxd0;->g:La/mne;

    .line 280
    .line 281
    iget-object v5, v10, La/hxd0;->K:La/p7m0;

    .line 282
    .line 283
    iget-object v9, v10, La/hxd0;->H:La/p7m0;

    .line 284
    .line 285
    iget-object v11, v10, La/hxd0;->d:La/hzg;

    .line 286
    .line 287
    iget-object v12, v10, La/hxd0;->b:Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;

    .line 288
    .line 289
    instance-of v13, v1, La/cwd0;

    .line 290
    .line 291
    move v14, v13

    .line 292
    const/4 v13, 0x0

    .line 293
    if-eqz v14, :cond_5

    .line 294
    .line 295
    check-cast v1, La/cwd0;

    .line 296
    .line 297
    sget-object v0, La/bwd0;->a:La/bwd0;

    .line 298
    .line 299
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 300
    .line 301
    .line 302
    move-result v0

    .line 303
    if-eqz v0, :cond_0

    .line 304
    .line 305
    iget-wide v0, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 306
    .line 307
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 308
    .line 309
    sget-object v3, La/k1g;->b:La/k1g;

    .line 310
    .line 311
    check-cast v11, La/uzg;

    .line 312
    .line 313
    invoke-virtual {v11, v0, v1, v2, v3}, La/uzg;->c(JLorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/k1g;)V

    .line 314
    .line 315
    .line 316
    goto/16 :goto_9

    .line 317
    .line 318
    :cond_0
    instance-of v0, v1, La/awd0;

    .line 319
    .line 320
    if-eqz v0, :cond_4

    .line 321
    .line 322
    check-cast v1, La/awd0;

    .line 323
    .line 324
    iget-object v0, v10, La/hxd0;->n:La/luu;

    .line 325
    .line 326
    iget-object v0, v0, La/luu;->a:La/nok0;

    .line 327
    .line 328
    invoke-virtual {v0}, La/nok0;->a()Ljava/util/List;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 337
    .line 338
    .line 339
    move-result v2

    .line 340
    if-eqz v2, :cond_2

    .line 341
    .line 342
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v2

    .line 346
    move-object v3, v2

    .line 347
    check-cast v3, La/lok0;

    .line 348
    .line 349
    iget v4, v3, La/lok0;->a:I

    .line 350
    .line 351
    iget v5, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->d:I

    .line 352
    .line 353
    if-ne v4, v5, :cond_1

    .line 354
    .line 355
    iget-object v3, v3, La/lok0;->t:Ljava/util/List;

    .line 356
    .line 357
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 358
    .line 359
    .line 360
    move-result-object v4

    .line 361
    invoke-interface {v3, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-eqz v3, :cond_1

    .line 366
    .line 367
    move-object v13, v2

    .line 368
    :cond_2
    check-cast v13, La/lok0;

    .line 369
    .line 370
    if-eqz v13, :cond_3

    .line 371
    .line 372
    iget v0, v13, La/lok0;->a:I

    .line 373
    .line 374
    int-to-long v0, v0

    .line 375
    iget-object v2, v13, La/lok0;->b:Ljava/lang/String;

    .line 376
    .line 377
    check-cast v11, La/uzg;

    .line 378
    .line 379
    invoke-virtual {v11, v0, v1, v2}, La/uzg;->o(JLjava/lang/String;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_9

    .line 383
    .line 384
    :cond_3
    iget-wide v5, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 385
    .line 386
    iget-wide v7, v1, La/awd0;->a:J

    .line 387
    .line 388
    iget-object v4, v1, La/awd0;->b:Ljava/lang/String;

    .line 389
    .line 390
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 391
    .line 392
    iget-byte v9, v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 393
    .line 394
    sget-object v0, La/k1g;->b:La/k1g;

    .line 395
    .line 396
    move-object v3, v11

    .line 397
    check-cast v3, La/uzg;

    .line 398
    .line 399
    invoke-virtual/range {v3 .. v9}, La/uzg;->f(Ljava/lang/String;JJI)V

    .line 400
    .line 401
    .line 402
    goto/16 :goto_9

    .line 403
    .line 404
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_a

    .line 408
    .line 409
    :cond_5
    instance-of v14, v1, La/lwd0;

    .line 410
    .line 411
    if-eqz v14, :cond_8

    .line 412
    .line 413
    check-cast v1, La/lwd0;

    .line 414
    .line 415
    iget v11, v1, La/lwd0;->a:I

    .line 416
    .line 417
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 418
    .line 419
    .line 420
    move-result-object v0

    .line 421
    check-cast v0, La/wwd0;

    .line 422
    .line 423
    iget v0, v0, La/wwd0;->a:I

    .line 424
    .line 425
    if-ne v0, v11, :cond_6

    .line 426
    .line 427
    goto/16 :goto_9

    .line 428
    .line 429
    :cond_6
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 430
    .line 431
    .line 432
    move-result-object v0

    .line 433
    move-object v1, v0

    .line 434
    check-cast v1, Ljava/lang/Boolean;

    .line 435
    .line 436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 440
    .line 441
    invoke-virtual {v5, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 442
    .line 443
    .line 444
    move-result v0

    .line 445
    if-eqz v0, :cond_6

    .line 446
    .line 447
    :goto_0
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    move-object v10, v0

    .line 452
    check-cast v10, La/wwd0;

    .line 453
    .line 454
    const-wide/16 v21, 0x0

    .line 455
    .line 456
    const/16 v23, 0xfe

    .line 457
    .line 458
    const-wide/16 v12, 0x0

    .line 459
    .line 460
    const-wide/16 v14, 0x0

    .line 461
    .line 462
    const/16 v16, 0x0

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    const-wide/16 v18, 0x0

    .line 467
    .line 468
    const/16 v20, 0x0

    .line 469
    .line 470
    invoke-static/range {v10 .. v23}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 471
    .line 472
    .line 473
    move-result-object v1

    .line 474
    move v14, v11

    .line 475
    invoke-virtual {v9, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 476
    .line 477
    .line 478
    move-result v0

    .line 479
    if-eqz v0, :cond_7

    .line 480
    .line 481
    goto/16 :goto_9

    .line 482
    .line 483
    :cond_7
    move v11, v14

    .line 484
    goto :goto_0

    .line 485
    :cond_8
    instance-of v14, v1, La/jwd0;

    .line 486
    .line 487
    const/4 v15, 0x2

    .line 488
    if-eqz v14, :cond_a

    .line 489
    .line 490
    check-cast v1, La/jwd0;

    .line 491
    .line 492
    iget-object v12, v1, La/jwd0;->a:Ljava/lang/String;

    .line 493
    .line 494
    iget-object v11, v10, La/hxd0;->F:La/uwd0;

    .line 495
    .line 496
    if-nez v11, :cond_9

    .line 497
    .line 498
    goto/16 :goto_9

    .line 499
    .line 500
    :cond_9
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    iget-object v1, v4, La/mne;->a:La/rwj;

    .line 505
    .line 506
    new-instance v9, La/qkb0;

    .line 507
    .line 508
    const/4 v14, 0x2

    .line 509
    invoke-direct/range {v9 .. v14}, La/qkb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 510
    .line 511
    .line 512
    invoke-static {v0, v1, v13, v9, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 513
    .line 514
    .line 515
    goto/16 :goto_9

    .line 516
    .line 517
    :cond_a
    instance-of v14, v1, La/dwd0;

    .line 518
    .line 519
    if-eqz v14, :cond_d

    .line 520
    .line 521
    check-cast v1, La/dwd0;

    .line 522
    .line 523
    sget-object v0, La/dwd0;->a:La/dwd0;

    .line 524
    .line 525
    invoke-virtual {v1, v0}, La/dwd0;->equals(Ljava/lang/Object;)Z

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    if-eqz v0, :cond_c

    .line 530
    .line 531
    iget-object v0, v10, La/hxd0;->I:La/p7m0;

    .line 532
    .line 533
    :cond_b
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v1

    .line 537
    move-object v2, v1

    .line 538
    check-cast v2, La/da10;

    .line 539
    .line 540
    sget-object v2, La/da10;->c:La/da10;

    .line 541
    .line 542
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 543
    .line 544
    .line 545
    move-result v1

    .line 546
    if-eqz v1, :cond_b

    .line 547
    .line 548
    invoke-virtual {v10}, La/hxd0;->w()V

    .line 549
    .line 550
    .line 551
    goto/16 :goto_9

    .line 552
    .line 553
    :cond_c
    invoke-static {}, La/t9f;->b()V

    .line 554
    .line 555
    .line 556
    goto/16 :goto_a

    .line 557
    .line 558
    :cond_d
    instance-of v14, v1, La/kwd0;

    .line 559
    .line 560
    if-eqz v14, :cond_1b

    .line 561
    .line 562
    check-cast v1, La/kwd0;

    .line 563
    .line 564
    iget-wide v0, v1, La/kwd0;->a:J

    .line 565
    .line 566
    :goto_1
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v2

    .line 570
    move-object v14, v2

    .line 571
    check-cast v14, La/wwd0;

    .line 572
    .line 573
    sget-object v3, La/v0e0;->a:Ljava/util/List;

    .line 574
    .line 575
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object v3

    .line 579
    :cond_e
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    if-eqz v4, :cond_f

    .line 584
    .line 585
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v4

    .line 589
    move-object v5, v4

    .line 590
    check-cast v5, La/aco0;

    .line 591
    .line 592
    iget-byte v5, v5, La/aco0;->a:B

    .line 593
    .line 594
    int-to-long v5, v5

    .line 595
    cmp-long v5, v5, v0

    .line 596
    .line 597
    if-nez v5, :cond_e

    .line 598
    .line 599
    goto :goto_2

    .line 600
    :cond_f
    move-object v4, v13

    .line 601
    :goto_2
    if-eqz v4, :cond_10

    .line 602
    .line 603
    const-wide/16 v25, 0x0

    .line 604
    .line 605
    const/16 v27, 0xfd

    .line 606
    .line 607
    const/4 v15, 0x0

    .line 608
    const-wide/16 v18, 0x0

    .line 609
    .line 610
    const/16 v20, 0x0

    .line 611
    .line 612
    const/16 v21, 0x0

    .line 613
    .line 614
    const-wide/16 v22, 0x0

    .line 615
    .line 616
    const/16 v24, 0x0

    .line 617
    .line 618
    move-wide/from16 v16, v0

    .line 619
    .line 620
    invoke-static/range {v14 .. v27}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 621
    .line 622
    .line 623
    move-result-object v14

    .line 624
    goto/16 :goto_6

    .line 625
    .line 626
    :cond_10
    move-wide/from16 v16, v0

    .line 627
    .line 628
    sget-object v0, La/v0e0;->d:Ljava/util/List;

    .line 629
    .line 630
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 631
    .line 632
    .line 633
    move-result-object v0

    .line 634
    :cond_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 635
    .line 636
    .line 637
    move-result v1

    .line 638
    if-eqz v1, :cond_12

    .line 639
    .line 640
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    move-object v3, v1

    .line 645
    check-cast v3, La/mog;

    .line 646
    .line 647
    iget-byte v3, v3, La/mog;->a:B

    .line 648
    .line 649
    int-to-long v3, v3

    .line 650
    cmp-long v3, v3, v16

    .line 651
    .line 652
    if-nez v3, :cond_11

    .line 653
    .line 654
    goto :goto_3

    .line 655
    :cond_12
    move-object v1, v13

    .line 656
    :goto_3
    if-eqz v1, :cond_13

    .line 657
    .line 658
    const-wide/16 v25, 0x0

    .line 659
    .line 660
    const/16 v27, 0xfb

    .line 661
    .line 662
    const/4 v15, 0x0

    .line 663
    move-wide/from16 v18, v16

    .line 664
    .line 665
    const-wide/16 v16, 0x0

    .line 666
    .line 667
    const/16 v20, 0x0

    .line 668
    .line 669
    const/16 v21, 0x0

    .line 670
    .line 671
    const-wide/16 v22, 0x0

    .line 672
    .line 673
    const/16 v24, 0x0

    .line 674
    .line 675
    invoke-static/range {v14 .. v27}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 676
    .line 677
    .line 678
    move-result-object v14

    .line 679
    move-wide/from16 v16, v18

    .line 680
    .line 681
    goto/16 :goto_6

    .line 682
    .line 683
    :cond_13
    sget-object v0, La/n2z;->a:Ljava/util/List;

    .line 684
    .line 685
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 690
    .line 691
    .line 692
    move-result v1

    .line 693
    if-eqz v1, :cond_15

    .line 694
    .line 695
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v1

    .line 699
    move-object v3, v1

    .line 700
    check-cast v3, La/l2z;

    .line 701
    .line 702
    iget-byte v3, v3, La/l2z;->a:B

    .line 703
    .line 704
    int-to-long v3, v3

    .line 705
    cmp-long v3, v3, v16

    .line 706
    .line 707
    if-nez v3, :cond_14

    .line 708
    .line 709
    goto :goto_4

    .line 710
    :cond_15
    move-object v1, v13

    .line 711
    :goto_4
    if-eqz v1, :cond_16

    .line 712
    .line 713
    const-wide/16 v25, 0x0

    .line 714
    .line 715
    const/16 v27, 0xdf

    .line 716
    .line 717
    const/4 v15, 0x0

    .line 718
    move-wide/from16 v18, v16

    .line 719
    .line 720
    const-wide/16 v16, 0x0

    .line 721
    .line 722
    move-wide/from16 v22, v18

    .line 723
    .line 724
    const-wide/16 v18, 0x0

    .line 725
    .line 726
    const/16 v20, 0x0

    .line 727
    .line 728
    const/16 v21, 0x0

    .line 729
    .line 730
    const/16 v24, 0x0

    .line 731
    .line 732
    invoke-static/range {v14 .. v27}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 733
    .line 734
    .line 735
    move-result-object v14

    .line 736
    move-wide/from16 v16, v22

    .line 737
    .line 738
    goto :goto_6

    .line 739
    :cond_16
    sget-object v0, La/v0e0;->c:Ljava/util/List;

    .line 740
    .line 741
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 742
    .line 743
    .line 744
    move-result-object v0

    .line 745
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 746
    .line 747
    .line 748
    move-result v1

    .line 749
    if-eqz v1, :cond_18

    .line 750
    .line 751
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 752
    .line 753
    .line 754
    move-result-object v1

    .line 755
    move-object v3, v1

    .line 756
    check-cast v3, La/aco0;

    .line 757
    .line 758
    iget-byte v3, v3, La/aco0;->a:B

    .line 759
    .line 760
    int-to-long v3, v3

    .line 761
    cmp-long v3, v3, v16

    .line 762
    .line 763
    if-nez v3, :cond_17

    .line 764
    .line 765
    goto :goto_5

    .line 766
    :cond_18
    move-object v1, v13

    .line 767
    :goto_5
    if-eqz v1, :cond_19

    .line 768
    .line 769
    const/16 v24, 0x0

    .line 770
    .line 771
    const/16 v27, 0x7f

    .line 772
    .line 773
    const/4 v15, 0x0

    .line 774
    move-wide/from16 v18, v16

    .line 775
    .line 776
    const-wide/16 v16, 0x0

    .line 777
    .line 778
    move-wide/from16 v22, v18

    .line 779
    .line 780
    const-wide/16 v18, 0x0

    .line 781
    .line 782
    const/16 v20, 0x0

    .line 783
    .line 784
    const/16 v21, 0x0

    .line 785
    .line 786
    move-wide/from16 v25, v22

    .line 787
    .line 788
    const-wide/16 v22, 0x0

    .line 789
    .line 790
    invoke-static/range {v14 .. v27}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 791
    .line 792
    .line 793
    move-result-object v14

    .line 794
    move-wide/from16 v16, v25

    .line 795
    .line 796
    :cond_19
    :goto_6
    invoke-virtual {v9, v2, v14}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 797
    .line 798
    .line 799
    move-result v0

    .line 800
    if-eqz v0, :cond_1a

    .line 801
    .line 802
    goto/16 :goto_9

    .line 803
    .line 804
    :cond_1a
    move-wide/from16 v0, v16

    .line 805
    .line 806
    goto/16 :goto_1

    .line 807
    .line 808
    :cond_1b
    instance-of v14, v1, La/zvd0;

    .line 809
    .line 810
    move/from16 p0, v15

    .line 811
    .line 812
    const/4 v15, 0x3

    .line 813
    if-eqz v14, :cond_1f

    .line 814
    .line 815
    check-cast v1, La/zvd0;

    .line 816
    .line 817
    iget-object v0, v1, La/zvd0;->a:La/ox;

    .line 818
    .line 819
    sget-object v4, La/hx;->a:La/hx;

    .line 820
    .line 821
    invoke-virtual {v0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v4

    .line 825
    if-eqz v4, :cond_1c

    .line 826
    .line 827
    iget-object v0, v10, La/hxd0;->j:La/nvu;

    .line 828
    .line 829
    iget-object v4, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->a:Ljava/lang/String;

    .line 830
    .line 831
    iget-wide v5, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 832
    .line 833
    long-to-int v5, v5

    .line 834
    invoke-static {}, La/cy7;->c()Z

    .line 835
    .line 836
    .line 837
    move-result v6

    .line 838
    iget v1, v1, La/zvd0;->b:I

    .line 839
    .line 840
    invoke-virtual {v0, v5, v1, v4, v6}, La/nvu;->H(IILjava/lang/String;Z)La/s4v0;

    .line 841
    .line 842
    .line 843
    move-result-object v0

    .line 844
    iget-object v1, v3, La/ih5;->a:La/kt2;

    .line 845
    .line 846
    const-string v3, "cyber_result_full_stat_call"

    .line 847
    .line 848
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 849
    .line 850
    .line 851
    iget-object v1, v2, La/zr1;->a:La/s1p;

    .line 852
    .line 853
    const-wide/16 v2, 0x2ef1

    .line 854
    .line 855
    sget-object v4, La/xun;->a:La/xun;

    .line 856
    .line 857
    invoke-virtual {v1, v4, v2, v3}, La/s1p;->a(Ljava/util/Set;J)V

    .line 858
    .line 859
    .line 860
    iget-object v1, v0, La/s4v0;->a:Ljava/lang/String;

    .line 861
    .line 862
    iget v0, v0, La/s4v0;->b:I

    .line 863
    .line 864
    check-cast v11, La/uzg;

    .line 865
    .line 866
    invoke-virtual {v11, v0, v1}, La/uzg;->j(ILjava/lang/String;)V

    .line 867
    .line 868
    .line 869
    goto/16 :goto_9

    .line 870
    .line 871
    :cond_1c
    sget-object v1, La/nx;->a:La/nx;

    .line 872
    .line 873
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 874
    .line 875
    .line 876
    move-result v1

    .line 877
    if-eqz v1, :cond_1d

    .line 878
    .line 879
    iget-object v7, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->a:Ljava/lang/String;

    .line 880
    .line 881
    iget-wide v3, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 882
    .line 883
    iget v0, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->d:I

    .line 884
    .line 885
    int-to-long v5, v0

    .line 886
    move-object v2, v11

    .line 887
    check-cast v2, La/uzg;

    .line 888
    .line 889
    invoke-virtual/range {v2 .. v7}, La/uzg;->l(JJLjava/lang/String;)V

    .line 890
    .line 891
    .line 892
    goto/16 :goto_9

    .line 893
    .line 894
    :cond_1d
    sget-object v1, La/mx;->a:La/mx;

    .line 895
    .line 896
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_1e

    .line 901
    .line 902
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    new-instance v1, La/coc0;

    .line 907
    .line 908
    const/4 v2, 0x6

    .line 909
    invoke-direct {v1, v10, v13, v2}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 910
    .line 911
    .line 912
    invoke-static {v0, v13, v13, v1, v15}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 913
    .line 914
    .line 915
    goto/16 :goto_9

    .line 916
    .line 917
    :cond_1e
    invoke-static {}, La/t9f;->b()V

    .line 918
    .line 919
    .line 920
    goto/16 :goto_a

    .line 921
    .line 922
    :cond_1f
    instance-of v14, v1, La/ewd0;

    .line 923
    .line 924
    if-eqz v14, :cond_21

    .line 925
    .line 926
    :cond_20
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 927
    .line 928
    .line 929
    move-result-object v0

    .line 930
    move-object v10, v0

    .line 931
    check-cast v10, La/wwd0;

    .line 932
    .line 933
    iget-boolean v1, v10, La/wwd0;->d:Z

    .line 934
    .line 935
    xor-int/lit8 v16, v1, 0x1

    .line 936
    .line 937
    const-wide/16 v21, 0x0

    .line 938
    .line 939
    const/16 v23, 0xf7

    .line 940
    .line 941
    const/4 v11, 0x0

    .line 942
    const-wide/16 v12, 0x0

    .line 943
    .line 944
    const-wide/16 v14, 0x0

    .line 945
    .line 946
    const/16 v17, 0x0

    .line 947
    .line 948
    const-wide/16 v18, 0x0

    .line 949
    .line 950
    const/16 v20, 0x0

    .line 951
    .line 952
    invoke-static/range {v10 .. v23}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 953
    .line 954
    .line 955
    move-result-object v1

    .line 956
    invoke-virtual {v9, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 957
    .line 958
    .line 959
    move-result v0

    .line 960
    if-eqz v0, :cond_20

    .line 961
    .line 962
    goto/16 :goto_9

    .line 963
    .line 964
    :cond_21
    instance-of v14, v1, La/hwd0;

    .line 965
    .line 966
    if-eqz v14, :cond_26

    .line 967
    .line 968
    check-cast v1, La/hwd0;

    .line 969
    .line 970
    sget-object v2, La/fwd0;->a:La/fwd0;

    .line 971
    .line 972
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 973
    .line 974
    .line 975
    move-result v2

    .line 976
    if-eqz v2, :cond_23

    .line 977
    .line 978
    :cond_22
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v0

    .line 982
    move-object v10, v0

    .line 983
    check-cast v10, La/wwd0;

    .line 984
    .line 985
    iget-boolean v1, v10, La/wwd0;->g:Z

    .line 986
    .line 987
    xor-int/lit8 v20, v1, 0x1

    .line 988
    .line 989
    const-wide/16 v21, 0x0

    .line 990
    .line 991
    const/16 v23, 0xbf

    .line 992
    .line 993
    const/4 v11, 0x0

    .line 994
    const-wide/16 v12, 0x0

    .line 995
    .line 996
    const-wide/16 v14, 0x0

    .line 997
    .line 998
    const/16 v16, 0x0

    .line 999
    .line 1000
    const/16 v17, 0x0

    .line 1001
    .line 1002
    const-wide/16 v18, 0x0

    .line 1003
    .line 1004
    invoke-static/range {v10 .. v23}, La/wwd0;->a(La/wwd0;IJJZLa/o4i0;JZJI)La/wwd0;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v1

    .line 1008
    invoke-virtual {v9, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_22

    .line 1013
    .line 1014
    goto/16 :goto_9

    .line 1015
    .line 1016
    :cond_23
    instance-of v2, v1, La/gwd0;

    .line 1017
    .line 1018
    if-eqz v2, :cond_25

    .line 1019
    .line 1020
    check-cast v1, La/gwd0;

    .line 1021
    .line 1022
    iget-object v1, v1, La/gwd0;->a:Ljava/lang/String;

    .line 1023
    .line 1024
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 1025
    .line 1026
    .line 1027
    move-result v2

    .line 1028
    if-nez v2, :cond_24

    .line 1029
    .line 1030
    new-instance v1, La/xwd0;

    .line 1031
    .line 1032
    const v2, 0x7f1313ec    # 1.9549996E38f

    .line 1033
    .line 1034
    .line 1035
    invoke-direct {v1, v2}, La/xwd0;-><init>(I)V

    .line 1036
    .line 1037
    .line 1038
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1039
    .line 1040
    .line 1041
    goto/16 :goto_9

    .line 1042
    .line 1043
    :cond_24
    iget-wide v2, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 1044
    .line 1045
    iget v0, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->d:I

    .line 1046
    .line 1047
    check-cast v11, La/uzg;

    .line 1048
    .line 1049
    invoke-virtual {v11, v1, v0, v2, v3}, La/uzg;->h(Ljava/lang/String;IJ)V

    .line 1050
    .line 1051
    .line 1052
    goto/16 :goto_9

    .line 1053
    .line 1054
    :cond_25
    invoke-static {}, La/t9f;->b()V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_a

    .line 1058
    .line 1059
    :cond_26
    instance-of v9, v1, La/iwd0;

    .line 1060
    .line 1061
    if-eqz v9, :cond_28

    .line 1062
    .line 1063
    :cond_27
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    move-object v1, v0

    .line 1068
    check-cast v1, Ljava/lang/Boolean;

    .line 1069
    .line 1070
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1071
    .line 1072
    .line 1073
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1074
    .line 1075
    invoke-virtual {v5, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1076
    .line 1077
    .line 1078
    move-result v0

    .line 1079
    if-eqz v0, :cond_27

    .line 1080
    .line 1081
    goto/16 :goto_9

    .line 1082
    .line 1083
    :cond_28
    instance-of v5, v1, La/nwd0;

    .line 1084
    .line 1085
    if-eqz v5, :cond_29

    .line 1086
    .line 1087
    check-cast v1, La/nwd0;

    .line 1088
    .line 1089
    iget-wide v11, v1, La/nwd0;->a:J

    .line 1090
    .line 1091
    invoke-static {v10}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1092
    .line 1093
    .line 1094
    move-result-object v0

    .line 1095
    iget-object v1, v4, La/mne;->a:La/rwj;

    .line 1096
    .line 1097
    new-instance v18, La/wn10;

    .line 1098
    .line 1099
    const/16 v14, 0xc

    .line 1100
    .line 1101
    move-object/from16 v9, v18

    .line 1102
    .line 1103
    invoke-direct/range {v9 .. v14}, La/wn10;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 1104
    .line 1105
    .line 1106
    const/16 v19, 0xb

    .line 1107
    .line 1108
    const/4 v15, 0x0

    .line 1109
    const/16 v16, 0x0

    .line 1110
    .line 1111
    move-object v14, v0

    .line 1112
    move-object/from16 v17, v1

    .line 1113
    .line 1114
    invoke-static/range {v14 .. v19}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1115
    .line 1116
    .line 1117
    goto/16 :goto_9

    .line 1118
    .line 1119
    :cond_29
    instance-of v4, v1, La/mwd0;

    .line 1120
    .line 1121
    if-eqz v4, :cond_30

    .line 1122
    .line 1123
    check-cast v1, La/mwd0;

    .line 1124
    .line 1125
    iget-wide v4, v1, La/mwd0;->a:J

    .line 1126
    .line 1127
    iget-object v1, v10, La/hxd0;->D:La/p7m0;

    .line 1128
    .line 1129
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v1

    .line 1133
    instance-of v8, v1, La/zwd0;

    .line 1134
    .line 1135
    if-eqz v8, :cond_2a

    .line 1136
    .line 1137
    check-cast v1, La/zwd0;

    .line 1138
    .line 1139
    goto :goto_7

    .line 1140
    :cond_2a
    move-object v1, v13

    .line 1141
    :goto_7
    if-eqz v1, :cond_2f

    .line 1142
    .line 1143
    iget-object v1, v1, La/zwd0;->c:Ljava/util/List;

    .line 1144
    .line 1145
    if-eqz v1, :cond_2f

    .line 1146
    .line 1147
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v1

    .line 1151
    :cond_2b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1152
    .line 1153
    .line 1154
    move-result v8

    .line 1155
    if-eqz v8, :cond_2c

    .line 1156
    .line 1157
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v8

    .line 1161
    move-object v9, v8

    .line 1162
    check-cast v9, La/f2h;

    .line 1163
    .line 1164
    iget-wide v9, v9, La/f2h;->b:J

    .line 1165
    .line 1166
    cmp-long v9, v9, v4

    .line 1167
    .line 1168
    if-nez v9, :cond_2b

    .line 1169
    .line 1170
    move-object v13, v8

    .line 1171
    :cond_2c
    check-cast v13, La/f2h;

    .line 1172
    .line 1173
    if-eqz v13, :cond_2f

    .line 1174
    .line 1175
    iget-object v1, v13, La/f2h;->c:Ljava/lang/String;

    .line 1176
    .line 1177
    if-eqz v1, :cond_2f

    .line 1178
    .line 1179
    const/4 v8, 0x5

    .line 1180
    new-array v8, v8, [La/yxg;

    .line 1181
    .line 1182
    sget-object v9, La/ttg;->d:La/ttg;

    .line 1183
    .line 1184
    aput-object v9, v8, v7

    .line 1185
    .line 1186
    sget-object v7, La/trg;->d:La/trg;

    .line 1187
    .line 1188
    aput-object v7, v8, v6

    .line 1189
    .line 1190
    sget-object v6, La/oxg;->d:La/oxg;

    .line 1191
    .line 1192
    aput-object v6, v8, p0

    .line 1193
    .line 1194
    sget-object v6, La/pug;->d:La/pug;

    .line 1195
    .line 1196
    aput-object v6, v8, v15

    .line 1197
    .line 1198
    sget-object v6, La/yvg;->d:La/yvg;

    .line 1199
    .line 1200
    const/4 v7, 0x4

    .line 1201
    aput-object v6, v8, v7

    .line 1202
    .line 1203
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1204
    .line 1205
    .line 1206
    move-result-object v6

    .line 1207
    new-instance v7, Ljava/util/ArrayList;

    .line 1208
    .line 1209
    const/16 v8, 0xa

    .line 1210
    .line 1211
    invoke-static {v6, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1212
    .line 1213
    .line 1214
    move-result v8

    .line 1215
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1216
    .line 1217
    .line 1218
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v6

    .line 1222
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1223
    .line 1224
    .line 1225
    move-result v8

    .line 1226
    if-eqz v8, :cond_2d

    .line 1227
    .line 1228
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1229
    .line 1230
    .line 1231
    move-result-object v8

    .line 1232
    check-cast v8, La/yxg;

    .line 1233
    .line 1234
    iget-wide v8, v8, La/yxg;->a:J

    .line 1235
    .line 1236
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v8

    .line 1240
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1241
    .line 1242
    .line 1243
    goto :goto_8

    .line 1244
    :cond_2d
    iget-wide v8, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 1245
    .line 1246
    iget-wide v13, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 1247
    .line 1248
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v6

    .line 1252
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1253
    .line 1254
    .line 1255
    move-result v6

    .line 1256
    const-wide/16 v8, 0x0

    .line 1257
    .line 1258
    if-eqz v6, :cond_2e

    .line 1259
    .line 1260
    cmp-long v6, v4, v8

    .line 1261
    .line 1262
    if-eqz v6, :cond_2e

    .line 1263
    .line 1264
    sget-object v0, La/r1g;->s:La/r1g;

    .line 1265
    .line 1266
    invoke-virtual {v3, v0, v13, v14}, La/ih5;->p(La/r1g;J)V

    .line 1267
    .line 1268
    .line 1269
    const-string v0, "\u0441yber_postmatch_statistics"

    .line 1270
    .line 1271
    invoke-virtual {v2, v13, v14, v0}, La/zr1;->z(JLjava/lang/String;)V

    .line 1272
    .line 1273
    .line 1274
    iget-wide v2, v12, Lorg/xplatform/cyber/game/rainbow/api/RainbowPostGameScreenParams;->b:J

    .line 1275
    .line 1276
    sget-object v22, La/k1g;->b:La/k1g;

    .line 1277
    .line 1278
    move-object/from16 v16, v11

    .line 1279
    .line 1280
    check-cast v16, La/uzg;

    .line 1281
    .line 1282
    move-object/from16 v21, v1

    .line 1283
    .line 1284
    move-wide/from16 v17, v2

    .line 1285
    .line 1286
    move-wide/from16 v19, v4

    .line 1287
    .line 1288
    invoke-virtual/range {v16 .. v22}, La/uzg;->n(JJLjava/lang/String;La/k1g;)V

    .line 1289
    .line 1290
    .line 1291
    goto :goto_9

    .line 1292
    :cond_2e
    move-wide/from16 v19, v4

    .line 1293
    .line 1294
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v1

    .line 1298
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 1299
    .line 1300
    .line 1301
    move-result v1

    .line 1302
    if-eqz v1, :cond_2f

    .line 1303
    .line 1304
    cmp-long v1, v19, v8

    .line 1305
    .line 1306
    if-nez v1, :cond_2f

    .line 1307
    .line 1308
    new-instance v1, La/xwd0;

    .line 1309
    .line 1310
    const v2, 0x7f131302

    .line 1311
    .line 1312
    .line 1313
    invoke-direct {v1, v2}, La/xwd0;-><init>(I)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 1317
    .line 1318
    .line 1319
    :cond_2f
    :goto_9
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1320
    .line 1321
    goto :goto_a

    .line 1322
    :cond_30
    invoke-static {}, La/t9f;->b()V

    .line 1323
    .line 1324
    .line 1325
    :goto_a
    return-object v8

    .line 1326
    :pswitch_a
    move-object/from16 v1, p1

    .line 1327
    .line 1328
    check-cast v1, La/mud0;

    .line 1329
    .line 1330
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1331
    .line 1332
    .line 1333
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1334
    .line 1335
    check-cast v0, La/k3t0;

    .line 1336
    .line 1337
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1338
    .line 1339
    .line 1340
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1341
    .line 1342
    return-object v0

    .line 1343
    :pswitch_b
    move-object/from16 v1, p1

    .line 1344
    .line 1345
    check-cast v1, La/prd0;

    .line 1346
    .line 1347
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1351
    .line 1352
    check-cast v0, La/k3t0;

    .line 1353
    .line 1354
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1355
    .line 1356
    .line 1357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1358
    .line 1359
    return-object v0

    .line 1360
    :pswitch_c
    move-object/from16 v1, p1

    .line 1361
    .line 1362
    check-cast v1, Ljava/lang/Throwable;

    .line 1363
    .line 1364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1365
    .line 1366
    .line 1367
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1368
    .line 1369
    check-cast v0, La/fkd0;

    .line 1370
    .line 1371
    invoke-virtual {v0, v1}, La/fkd0;->x(Ljava/lang/Throwable;)V

    .line 1372
    .line 1373
    .line 1374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1375
    .line 1376
    return-object v0

    .line 1377
    :pswitch_d
    move-object/from16 v1, p1

    .line 1378
    .line 1379
    check-cast v1, Ljava/lang/Throwable;

    .line 1380
    .line 1381
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1382
    .line 1383
    .line 1384
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1385
    .line 1386
    check-cast v0, La/fkd0;

    .line 1387
    .line 1388
    invoke-virtual {v0, v1}, La/fkd0;->x(Ljava/lang/Throwable;)V

    .line 1389
    .line 1390
    .line 1391
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1392
    .line 1393
    return-object v0

    .line 1394
    :pswitch_e
    move-object/from16 v1, p1

    .line 1395
    .line 1396
    check-cast v1, Ljava/lang/Throwable;

    .line 1397
    .line 1398
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1399
    .line 1400
    .line 1401
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1402
    .line 1403
    check-cast v0, La/fkd0;

    .line 1404
    .line 1405
    invoke-virtual {v0, v1}, La/fkd0;->x(Ljava/lang/Throwable;)V

    .line 1406
    .line 1407
    .line 1408
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1409
    .line 1410
    return-object v0

    .line 1411
    :pswitch_f
    move-object/from16 v1, p1

    .line 1412
    .line 1413
    check-cast v1, Ljava/lang/Throwable;

    .line 1414
    .line 1415
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1416
    .line 1417
    .line 1418
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1419
    .line 1420
    check-cast v0, La/fkd0;

    .line 1421
    .line 1422
    invoke-virtual {v0, v1}, La/fkd0;->x(Ljava/lang/Throwable;)V

    .line 1423
    .line 1424
    .line 1425
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1426
    .line 1427
    return-object v0

    .line 1428
    :pswitch_10
    move-object/from16 v1, p1

    .line 1429
    .line 1430
    check-cast v1, Ljava/lang/Throwable;

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1433
    .line 1434
    .line 1435
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v0, La/ijd0;

    .line 1438
    .line 1439
    iget-object v2, v0, La/ijd0;->d:La/duj;

    .line 1440
    .line 1441
    instance-of v3, v1, Ljava/net/SocketTimeoutException;

    .line 1442
    .line 1443
    if-eqz v3, :cond_31

    .line 1444
    .line 1445
    goto :goto_b

    .line 1446
    :cond_31
    instance-of v3, v1, Ljava/net/UnknownHostException;

    .line 1447
    .line 1448
    if-eqz v3, :cond_32

    .line 1449
    .line 1450
    :goto_b
    sget-object v1, La/cjd0;->a:La/cjd0;

    .line 1451
    .line 1452
    invoke-virtual {v0, v1}, La/ijd0;->x(La/ejd0;)V

    .line 1453
    .line 1454
    .line 1455
    goto :goto_d

    .line 1456
    :cond_32
    instance-of v3, v1, La/zhi0;

    .line 1457
    .line 1458
    if-eqz v3, :cond_35

    .line 1459
    .line 1460
    move-object v3, v1

    .line 1461
    check-cast v3, La/zhi0;

    .line 1462
    .line 1463
    iget-object v3, v3, La/zhi0;->c:La/kuw;

    .line 1464
    .line 1465
    sget-object v4, La/i2o;->i2:La/i2o;

    .line 1466
    .line 1467
    if-ne v3, v4, :cond_34

    .line 1468
    .line 1469
    new-instance v2, La/zid0;

    .line 1470
    .line 1471
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v1

    .line 1475
    if-nez v1, :cond_33

    .line 1476
    .line 1477
    goto :goto_c

    .line 1478
    :cond_33
    move-object v5, v1

    .line 1479
    :goto_c
    invoke-direct {v2, v5}, La/zid0;-><init>(Ljava/lang/String;)V

    .line 1480
    .line 1481
    .line 1482
    invoke-virtual {v0, v2}, La/ijd0;->x(La/ejd0;)V

    .line 1483
    .line 1484
    .line 1485
    goto :goto_d

    .line 1486
    :cond_34
    new-instance v3, La/yid0;

    .line 1487
    .line 1488
    invoke-direct {v3, v0, v7}, La/yid0;-><init>(La/ijd0;B)V

    .line 1489
    .line 1490
    .line 1491
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1492
    .line 1493
    .line 1494
    goto :goto_d

    .line 1495
    :cond_35
    new-instance v3, La/yid0;

    .line 1496
    .line 1497
    invoke-direct {v3, v0, v6}, La/yid0;-><init>(La/ijd0;B)V

    .line 1498
    .line 1499
    .line 1500
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1501
    .line 1502
    .line 1503
    :goto_d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1504
    .line 1505
    return-object v0

    .line 1506
    :pswitch_11
    move-object/from16 v1, p1

    .line 1507
    .line 1508
    check-cast v1, Ljava/lang/Throwable;

    .line 1509
    .line 1510
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1511
    .line 1512
    .line 1513
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1514
    .line 1515
    check-cast v0, La/shd0;

    .line 1516
    .line 1517
    invoke-virtual {v0, v1}, La/shd0;->y(Ljava/lang/Throwable;)V

    .line 1518
    .line 1519
    .line 1520
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1521
    .line 1522
    return-object v0

    .line 1523
    :pswitch_12
    move-object/from16 v1, p1

    .line 1524
    .line 1525
    check-cast v1, Ljava/lang/Throwable;

    .line 1526
    .line 1527
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1528
    .line 1529
    .line 1530
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1531
    .line 1532
    check-cast v0, La/shd0;

    .line 1533
    .line 1534
    invoke-virtual {v0, v1}, La/shd0;->y(Ljava/lang/Throwable;)V

    .line 1535
    .line 1536
    .line 1537
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1538
    .line 1539
    return-object v0

    .line 1540
    :pswitch_13
    move-object/from16 v1, p1

    .line 1541
    .line 1542
    check-cast v1, Ljava/lang/Throwable;

    .line 1543
    .line 1544
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1545
    .line 1546
    .line 1547
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1548
    .line 1549
    check-cast v0, La/fgd0;

    .line 1550
    .line 1551
    invoke-virtual {v0, v1}, La/fgd0;->y(Ljava/lang/Throwable;)V

    .line 1552
    .line 1553
    .line 1554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1555
    .line 1556
    return-object v0

    .line 1557
    :pswitch_14
    move-object/from16 v1, p1

    .line 1558
    .line 1559
    check-cast v1, Ljava/lang/Throwable;

    .line 1560
    .line 1561
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1562
    .line 1563
    .line 1564
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1565
    .line 1566
    check-cast v0, La/fgd0;

    .line 1567
    .line 1568
    invoke-virtual {v0, v1}, La/fgd0;->y(Ljava/lang/Throwable;)V

    .line 1569
    .line 1570
    .line 1571
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1572
    .line 1573
    return-object v0

    .line 1574
    :pswitch_15
    move-object/from16 v1, p1

    .line 1575
    .line 1576
    check-cast v1, Ljava/lang/Number;

    .line 1577
    .line 1578
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 1579
    .line 1580
    .line 1581
    move-result v1

    .line 1582
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1583
    .line 1584
    check-cast v0, Ljava/util/List;

    .line 1585
    .line 1586
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v0

    .line 1590
    check-cast v0, Ljava/lang/String;

    .line 1591
    .line 1592
    return-object v0

    .line 1593
    :pswitch_16
    move-object/from16 v1, p1

    .line 1594
    .line 1595
    check-cast v1, Ljava/util/List;

    .line 1596
    .line 1597
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1598
    .line 1599
    .line 1600
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1601
    .line 1602
    check-cast v0, La/k7d0;

    .line 1603
    .line 1604
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1605
    .line 1606
    .line 1607
    new-instance v0, Ljava/util/ArrayList;

    .line 1608
    .line 1609
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 1610
    .line 1611
    .line 1612
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v2

    .line 1616
    :cond_36
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1617
    .line 1618
    .line 1619
    move-result v3

    .line 1620
    if-eqz v3, :cond_37

    .line 1621
    .line 1622
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1623
    .line 1624
    .line 1625
    move-result-object v3

    .line 1626
    move-object v4, v3

    .line 1627
    check-cast v4, La/k2a;

    .line 1628
    .line 1629
    instance-of v4, v4, La/fmf0;

    .line 1630
    .line 1631
    if-eqz v4, :cond_36

    .line 1632
    .line 1633
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1634
    .line 1635
    .line 1636
    goto :goto_e

    .line 1637
    :cond_37
    invoke-interface {v1, v0}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 1638
    .line 1639
    .line 1640
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 1641
    .line 1642
    .line 1643
    move-result-object v0

    .line 1644
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v0

    .line 1648
    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1649
    .line 1650
    .line 1651
    move-result v2

    .line 1652
    if-eqz v2, :cond_38

    .line 1653
    .line 1654
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1655
    .line 1656
    .line 1657
    move-result-object v2

    .line 1658
    check-cast v2, La/k2a;

    .line 1659
    .line 1660
    invoke-interface {v1, v7, v2}, Ljava/util/List;->add(ILjava/lang/Object;)V

    .line 1661
    .line 1662
    .line 1663
    goto :goto_f

    .line 1664
    :cond_38
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1665
    .line 1666
    .line 1667
    move-result v0

    .line 1668
    invoke-interface {v1, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    .line 1669
    .line 1670
    .line 1671
    move-result-object v0

    .line 1672
    :cond_39
    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    .line 1673
    .line 1674
    .line 1675
    move-result v2

    .line 1676
    if-eqz v2, :cond_3a

    .line 1677
    .line 1678
    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v2

    .line 1682
    check-cast v2, La/k2a;

    .line 1683
    .line 1684
    instance-of v2, v2, La/gmf0;

    .line 1685
    .line 1686
    if-eqz v2, :cond_39

    .line 1687
    .line 1688
    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    .line 1689
    .line 1690
    .line 1691
    move-result v0

    .line 1692
    goto :goto_10

    .line 1693
    :cond_3a
    const/4 v0, -0x1

    .line 1694
    :goto_10
    if-lez v0, :cond_3f

    .line 1695
    .line 1696
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v2

    .line 1700
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1701
    .line 1702
    .line 1703
    check-cast v2, La/gmf0;

    .line 1704
    .line 1705
    move v3, v7

    .line 1706
    :goto_11
    if-ge v3, v0, :cond_3f

    .line 1707
    .line 1708
    invoke-interface {v1, v7}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 1709
    .line 1710
    .line 1711
    move-result-object v4

    .line 1712
    check-cast v4, La/k2a;

    .line 1713
    .line 1714
    instance-of v5, v4, La/hmf0;

    .line 1715
    .line 1716
    if-eqz v5, :cond_3b

    .line 1717
    .line 1718
    move-object v5, v4

    .line 1719
    check-cast v5, La/hmf0;

    .line 1720
    .line 1721
    iget-object v5, v5, La/hmf0;->b:La/odd;

    .line 1722
    .line 1723
    goto :goto_12

    .line 1724
    :cond_3b
    instance-of v5, v4, La/gmf0;

    .line 1725
    .line 1726
    if-eqz v5, :cond_3c

    .line 1727
    .line 1728
    move-object v5, v4

    .line 1729
    check-cast v5, La/gmf0;

    .line 1730
    .line 1731
    iget-object v5, v5, La/gmf0;->a:La/odd;

    .line 1732
    .line 1733
    goto :goto_12

    .line 1734
    :cond_3c
    move-object v5, v8

    .line 1735
    :goto_12
    if-eqz v5, :cond_3d

    .line 1736
    .line 1737
    iget-object v9, v2, La/gmf0;->a:La/odd;

    .line 1738
    .line 1739
    new-instance v10, La/ppb0;

    .line 1740
    .line 1741
    const/16 v11, 0x1c

    .line 1742
    .line 1743
    invoke-direct {v10, v5, v11}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 1744
    .line 1745
    .line 1746
    invoke-virtual {v9, v10}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 1747
    .line 1748
    .line 1749
    :cond_3d
    instance-of v5, v4, La/jnf0;

    .line 1750
    .line 1751
    if-eqz v5, :cond_3e

    .line 1752
    .line 1753
    check-cast v4, La/jnf0;

    .line 1754
    .line 1755
    iget-object v4, v4, La/jnf0;->a:La/jnu0;

    .line 1756
    .line 1757
    invoke-virtual {v4, v8}, La/jnu0;->a(La/az9;)V

    .line 1758
    .line 1759
    .line 1760
    :cond_3e
    add-int/lit8 v3, v3, 0x1

    .line 1761
    .line 1762
    goto :goto_11

    .line 1763
    :cond_3f
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 1764
    .line 1765
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 1766
    .line 1767
    .line 1768
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v2

    .line 1772
    move v3, v7

    .line 1773
    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1774
    .line 1775
    .line 1776
    move-result v4

    .line 1777
    if-eqz v4, :cond_48

    .line 1778
    .line 1779
    add-int/lit8 v4, v3, 0x1

    .line 1780
    .line 1781
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1782
    .line 1783
    .line 1784
    move-result-object v5

    .line 1785
    check-cast v5, La/k2a;

    .line 1786
    .line 1787
    instance-of v9, v5, La/jnf0;

    .line 1788
    .line 1789
    if-eqz v9, :cond_45

    .line 1790
    .line 1791
    move-object v9, v5

    .line 1792
    check-cast v9, La/jnf0;

    .line 1793
    .line 1794
    iget-object v10, v9, La/jnf0;->a:La/jnu0;

    .line 1795
    .line 1796
    iget-object v10, v10, La/jnu0;->a:Ljava/lang/String;

    .line 1797
    .line 1798
    iget-object v9, v9, La/jnf0;->b:Ljava/util/List;

    .line 1799
    .line 1800
    new-instance v11, La/g0a;

    .line 1801
    .line 1802
    invoke-direct {v11, v10}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 1803
    .line 1804
    .line 1805
    invoke-static {v9, v11}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v9

    .line 1809
    invoke-static {v9}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1810
    .line 1811
    .line 1812
    move-result-object v9

    .line 1813
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1814
    .line 1815
    .line 1816
    move-result v11

    .line 1817
    move v12, v4

    .line 1818
    :goto_14
    if-ge v12, v11, :cond_44

    .line 1819
    .line 1820
    invoke-interface {v1, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1821
    .line 1822
    .line 1823
    move-result-object v13

    .line 1824
    check-cast v13, La/k2a;

    .line 1825
    .line 1826
    instance-of v14, v13, La/hmf0;

    .line 1827
    .line 1828
    if-eqz v14, :cond_40

    .line 1829
    .line 1830
    check-cast v13, La/hmf0;

    .line 1831
    .line 1832
    iget-object v13, v13, La/hmf0;->a:Ljava/lang/String;

    .line 1833
    .line 1834
    new-instance v14, La/g0a;

    .line 1835
    .line 1836
    invoke-direct {v14, v13}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 1837
    .line 1838
    .line 1839
    invoke-interface {v9, v14}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 1840
    .line 1841
    .line 1842
    move-result v13

    .line 1843
    goto :goto_16

    .line 1844
    :cond_40
    instance-of v14, v13, La/jnf0;

    .line 1845
    .line 1846
    if-eqz v14, :cond_41

    .line 1847
    .line 1848
    check-cast v13, La/jnf0;

    .line 1849
    .line 1850
    iget-object v14, v13, La/jnf0;->a:La/jnu0;

    .line 1851
    .line 1852
    iget-object v14, v14, La/jnu0;->a:Ljava/lang/String;

    .line 1853
    .line 1854
    iget-object v13, v13, La/jnf0;->b:Ljava/util/List;

    .line 1855
    .line 1856
    new-instance v15, La/g0a;

    .line 1857
    .line 1858
    invoke-direct {v15, v14}, La/g0a;-><init>(Ljava/lang/String;)V

    .line 1859
    .line 1860
    .line 1861
    invoke-static {v13, v15}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 1862
    .line 1863
    .line 1864
    move-result-object v13

    .line 1865
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v13

    .line 1869
    invoke-static {v10, v14}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1870
    .line 1871
    .line 1872
    move-result v14

    .line 1873
    if-nez v14, :cond_42

    .line 1874
    .line 1875
    invoke-static {v9, v13}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1876
    .line 1877
    .line 1878
    move-result v13

    .line 1879
    if-nez v13, :cond_41

    .line 1880
    .line 1881
    goto :goto_15

    .line 1882
    :cond_41
    move v13, v7

    .line 1883
    goto :goto_16

    .line 1884
    :cond_42
    :goto_15
    move v13, v6

    .line 1885
    :goto_16
    if-eqz v13, :cond_43

    .line 1886
    .line 1887
    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v9

    .line 1891
    goto :goto_18

    .line 1892
    :cond_43
    add-int/lit8 v12, v12, 0x1

    .line 1893
    .line 1894
    goto :goto_14

    .line 1895
    :cond_44
    move-object v9, v8

    .line 1896
    goto :goto_18

    .line 1897
    :cond_45
    instance-of v9, v5, La/hmf0;

    .line 1898
    .line 1899
    if-eqz v9, :cond_44

    .line 1900
    .line 1901
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 1902
    .line 1903
    .line 1904
    move-result v9

    .line 1905
    move v10, v4

    .line 1906
    :goto_17
    if-ge v10, v9, :cond_44

    .line 1907
    .line 1908
    invoke-interface {v1, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v11

    .line 1912
    check-cast v11, La/k2a;

    .line 1913
    .line 1914
    instance-of v12, v11, La/hmf0;

    .line 1915
    .line 1916
    if-eqz v12, :cond_46

    .line 1917
    .line 1918
    check-cast v11, La/hmf0;

    .line 1919
    .line 1920
    iget-object v11, v11, La/hmf0;->a:Ljava/lang/String;

    .line 1921
    .line 1922
    move-object v12, v5

    .line 1923
    check-cast v12, La/hmf0;

    .line 1924
    .line 1925
    iget-object v12, v12, La/hmf0;->a:Ljava/lang/String;

    .line 1926
    .line 1927
    invoke-static {v11, v12}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1928
    .line 1929
    .line 1930
    move-result v11

    .line 1931
    if-eqz v11, :cond_46

    .line 1932
    .line 1933
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1934
    .line 1935
    .line 1936
    move-result-object v9

    .line 1937
    goto :goto_18

    .line 1938
    :cond_46
    add-int/lit8 v10, v10, 0x1

    .line 1939
    .line 1940
    goto :goto_17

    .line 1941
    :goto_18
    if-eqz v9, :cond_47

    .line 1942
    .line 1943
    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    .line 1944
    .line 1945
    .line 1946
    move-result v9

    .line 1947
    invoke-interface {v1, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v9

    .line 1951
    check-cast v9, La/k2a;

    .line 1952
    .line 1953
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1954
    .line 1955
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 1956
    .line 1957
    .line 1958
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1959
    .line 1960
    .line 1961
    const-string v11, " is pruned by "

    .line 1962
    .line 1963
    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1964
    .line 1965
    .line 1966
    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1967
    .line 1968
    .line 1969
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v10

    .line 1973
    const-string v11, "CXCP"

    .line 1974
    .line 1975
    invoke-static {v11, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 1976
    .line 1977
    .line 1978
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1979
    .line 1980
    .line 1981
    move-result-object v3

    .line 1982
    invoke-interface {v0, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 1983
    .line 1984
    .line 1985
    instance-of v3, v5, La/hmf0;

    .line 1986
    .line 1987
    if-eqz v3, :cond_47

    .line 1988
    .line 1989
    instance-of v3, v9, La/hmf0;

    .line 1990
    .line 1991
    if-eqz v3, :cond_47

    .line 1992
    .line 1993
    check-cast v9, La/hmf0;

    .line 1994
    .line 1995
    iget-object v3, v9, La/hmf0;->b:La/odd;

    .line 1996
    .line 1997
    new-instance v9, La/ppb0;

    .line 1998
    .line 1999
    check-cast v5, La/hmf0;

    .line 2000
    .line 2001
    const/16 v10, 0x1d

    .line 2002
    .line 2003
    invoke-direct {v9, v5, v10}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 2004
    .line 2005
    .line 2006
    invoke-virtual {v3, v9}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 2007
    .line 2008
    .line 2009
    :cond_47
    move v3, v4

    .line 2010
    goto/16 :goto_13

    .line 2011
    .line 2012
    :cond_48
    new-instance v2, Ljava/util/ArrayList;

    .line 2013
    .line 2014
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 2015
    .line 2016
    .line 2017
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->z0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 2018
    .line 2019
    .line 2020
    move-result-object v0

    .line 2021
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v0

    .line 2025
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2026
    .line 2027
    .line 2028
    move-result v3

    .line 2029
    if-eqz v3, :cond_49

    .line 2030
    .line 2031
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v3

    .line 2035
    check-cast v3, Ljava/lang/Number;

    .line 2036
    .line 2037
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 2038
    .line 2039
    .line 2040
    move-result v3

    .line 2041
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2042
    .line 2043
    .line 2044
    move-result v4

    .line 2045
    sub-int/2addr v3, v4

    .line 2046
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 2047
    .line 2048
    .line 2049
    move-result-object v3

    .line 2050
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2051
    .line 2052
    .line 2053
    goto :goto_19

    .line 2054
    :cond_49
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v0

    .line 2058
    :cond_4a
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 2059
    .line 2060
    .line 2061
    move-result v1

    .line 2062
    if-eqz v1, :cond_4b

    .line 2063
    .line 2064
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2065
    .line 2066
    .line 2067
    move-result-object v1

    .line 2068
    check-cast v1, La/k2a;

    .line 2069
    .line 2070
    instance-of v2, v1, La/jnf0;

    .line 2071
    .line 2072
    if-eqz v2, :cond_4a

    .line 2073
    .line 2074
    check-cast v1, La/jnf0;

    .line 2075
    .line 2076
    iget-object v1, v1, La/jnf0;->a:La/jnu0;

    .line 2077
    .line 2078
    invoke-virtual {v1, v8}, La/jnu0;->a(La/az9;)V

    .line 2079
    .line 2080
    .line 2081
    goto :goto_1a

    .line 2082
    :cond_4b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2083
    .line 2084
    return-object v0

    .line 2085
    :pswitch_17
    move-object/from16 v1, p1

    .line 2086
    .line 2087
    check-cast v1, La/yvc0;

    .line 2088
    .line 2089
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2090
    .line 2091
    .line 2092
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2093
    .line 2094
    check-cast v0, La/k3t0;

    .line 2095
    .line 2096
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2097
    .line 2098
    .line 2099
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2100
    .line 2101
    return-object v0

    .line 2102
    :pswitch_18
    move-object/from16 v1, p1

    .line 2103
    .line 2104
    check-cast v1, La/pxc0;

    .line 2105
    .line 2106
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2107
    .line 2108
    .line 2109
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2110
    .line 2111
    check-cast v0, La/kxc0;

    .line 2112
    .line 2113
    sget-object v6, La/kxc0;->Y1:La/jh70;

    .line 2114
    .line 2115
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2116
    .line 2117
    .line 2118
    instance-of v6, v1, La/mxc0;

    .line 2119
    .line 2120
    if-eqz v6, :cond_4c

    .line 2121
    .line 2122
    check-cast v1, La/mxc0;

    .line 2123
    .line 2124
    iput-boolean v7, v0, La/kxc0;->W1:Z

    .line 2125
    .line 2126
    iget-object v0, v0, La/kxc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2127
    .line 2128
    if-eqz v0, :cond_54

    .line 2129
    .line 2130
    iget-object v2, v1, La/mxc0;->a:Ljava/lang/String;

    .line 2131
    .line 2132
    iget-object v1, v1, La/mxc0;->b:Ljava/util/Map;

    .line 2133
    .line 2134
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 2135
    .line 2136
    .line 2137
    goto :goto_1c

    .line 2138
    :cond_4c
    instance-of v6, v1, La/oxc0;

    .line 2139
    .line 2140
    if-eqz v6, :cond_4f

    .line 2141
    .line 2142
    check-cast v1, La/oxc0;

    .line 2143
    .line 2144
    iget-object v1, v1, La/oxc0;->a:Ljava/io/File;

    .line 2145
    .line 2146
    sget-object v2, La/pek0;->a:La/pek0;

    .line 2147
    .line 2148
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v4

    .line 2152
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2153
    .line 2154
    .line 2155
    invoke-virtual {v0, v2, v4}, La/kxc0;->M0(La/sek0;Ljava/lang/String;)V

    .line 2156
    .line 2157
    .line 2158
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v2

    .line 2162
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v4

    .line 2166
    if-eqz v4, :cond_4d

    .line 2167
    .line 2168
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v8

    .line 2172
    :cond_4d
    if-nez v8, :cond_4e

    .line 2173
    .line 2174
    goto :goto_1b

    .line 2175
    :cond_4e
    move-object v5, v8

    .line 2176
    :goto_1b
    invoke-static {v2, v1, v5}, La/sj3;->v0(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 2177
    .line 2178
    .line 2179
    move-result v1

    .line 2180
    if-nez v1, :cond_54

    .line 2181
    .line 2182
    sget-object v1, La/rek0;->b:La/rek0;

    .line 2183
    .line 2184
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2185
    .line 2186
    .line 2187
    move-result-object v2

    .line 2188
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2189
    .line 2190
    .line 2191
    invoke-virtual {v0, v1, v2}, La/kxc0;->M0(La/sek0;Ljava/lang/String;)V

    .line 2192
    .line 2193
    .line 2194
    goto :goto_1c

    .line 2195
    :cond_4f
    instance-of v3, v1, La/nxc0;

    .line 2196
    .line 2197
    if-eqz v3, :cond_51

    .line 2198
    .line 2199
    iget-object v0, v0, La/kxc0;->O1:La/grj;

    .line 2200
    .line 2201
    if-eqz v0, :cond_50

    .line 2202
    .line 2203
    check-cast v1, La/nxc0;

    .line 2204
    .line 2205
    iget-object v1, v1, La/nxc0;->a:Ljava/lang/String;

    .line 2206
    .line 2207
    invoke-virtual {v0, v1}, La/grj;->a(Ljava/lang/String;)V

    .line 2208
    .line 2209
    .line 2210
    goto :goto_1c

    .line 2211
    :cond_50
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2212
    .line 2213
    .line 2214
    throw v8

    .line 2215
    :cond_51
    instance-of v2, v1, La/lxc0;

    .line 2216
    .line 2217
    if-eqz v2, :cond_55

    .line 2218
    .line 2219
    check-cast v1, La/lxc0;

    .line 2220
    .line 2221
    iget-boolean v1, v1, La/lxc0;->a:Z

    .line 2222
    .line 2223
    iget-object v0, v0, La/kxc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2224
    .line 2225
    if-nez v0, :cond_52

    .line 2226
    .line 2227
    goto :goto_1c

    .line 2228
    :cond_52
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 2229
    .line 2230
    .line 2231
    move-result v0

    .line 2232
    if-nez v0, :cond_53

    .line 2233
    .line 2234
    goto :goto_1c

    .line 2235
    :cond_53
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 2236
    .line 2237
    .line 2238
    :cond_54
    :goto_1c
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2239
    .line 2240
    goto :goto_1d

    .line 2241
    :cond_55
    invoke-static {}, La/t9f;->b()V

    .line 2242
    .line 2243
    .line 2244
    :goto_1d
    return-object v8

    .line 2245
    :pswitch_19
    move-object/from16 v1, p1

    .line 2246
    .line 2247
    check-cast v1, La/mwc0;

    .line 2248
    .line 2249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2250
    .line 2251
    .line 2252
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2253
    .line 2254
    check-cast v0, La/k3t0;

    .line 2255
    .line 2256
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2257
    .line 2258
    .line 2259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2260
    .line 2261
    return-object v0

    .line 2262
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2263
    .line 2264
    check-cast v1, La/wwc0;

    .line 2265
    .line 2266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2267
    .line 2268
    .line 2269
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2270
    .line 2271
    check-cast v0, La/qwc0;

    .line 2272
    .line 2273
    sget-object v6, La/qwc0;->Z1:La/rl70;

    .line 2274
    .line 2275
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2276
    .line 2277
    .line 2278
    instance-of v6, v1, La/twc0;

    .line 2279
    .line 2280
    if-eqz v6, :cond_56

    .line 2281
    .line 2282
    check-cast v1, La/twc0;

    .line 2283
    .line 2284
    iput-boolean v7, v0, La/qwc0;->X1:Z

    .line 2285
    .line 2286
    iput-boolean v7, v0, La/qwc0;->W1:Z

    .line 2287
    .line 2288
    iget-object v0, v0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2289
    .line 2290
    if-eqz v0, :cond_5e

    .line 2291
    .line 2292
    iget-object v2, v1, La/twc0;->a:Ljava/lang/String;

    .line 2293
    .line 2294
    iget-object v1, v1, La/twc0;->b:Ljava/util/Map;

    .line 2295
    .line 2296
    invoke-virtual {v0, v2, v1}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->d(Ljava/lang/String;Ljava/util/Map;)V

    .line 2297
    .line 2298
    .line 2299
    goto :goto_1f

    .line 2300
    :cond_56
    instance-of v6, v1, La/vwc0;

    .line 2301
    .line 2302
    if-eqz v6, :cond_59

    .line 2303
    .line 2304
    check-cast v1, La/vwc0;

    .line 2305
    .line 2306
    iget-object v1, v1, La/vwc0;->a:Ljava/io/File;

    .line 2307
    .line 2308
    sget-object v2, La/pek0;->a:La/pek0;

    .line 2309
    .line 2310
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v4

    .line 2314
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2315
    .line 2316
    .line 2317
    invoke-virtual {v0, v2, v4}, La/qwc0;->M0(La/sek0;Ljava/lang/String;)V

    .line 2318
    .line 2319
    .line 2320
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v2

    .line 2324
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2325
    .line 2326
    .line 2327
    move-result-object v4

    .line 2328
    if-eqz v4, :cond_57

    .line 2329
    .line 2330
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 2331
    .line 2332
    .line 2333
    move-result-object v8

    .line 2334
    :cond_57
    if-nez v8, :cond_58

    .line 2335
    .line 2336
    goto :goto_1e

    .line 2337
    :cond_58
    move-object v5, v8

    .line 2338
    :goto_1e
    invoke-static {v2, v1, v5}, La/sj3;->v0(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Z

    .line 2339
    .line 2340
    .line 2341
    move-result v1

    .line 2342
    if-nez v1, :cond_5e

    .line 2343
    .line 2344
    sget-object v1, La/rek0;->b:La/rek0;

    .line 2345
    .line 2346
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v2

    .line 2350
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2351
    .line 2352
    .line 2353
    invoke-virtual {v0, v1, v2}, La/qwc0;->M0(La/sek0;Ljava/lang/String;)V

    .line 2354
    .line 2355
    .line 2356
    goto :goto_1f

    .line 2357
    :cond_59
    instance-of v3, v1, La/uwc0;

    .line 2358
    .line 2359
    if-eqz v3, :cond_5b

    .line 2360
    .line 2361
    iget-object v0, v0, La/qwc0;->O1:La/grj;

    .line 2362
    .line 2363
    if-eqz v0, :cond_5a

    .line 2364
    .line 2365
    check-cast v1, La/uwc0;

    .line 2366
    .line 2367
    iget-object v1, v1, La/uwc0;->a:Ljava/lang/String;

    .line 2368
    .line 2369
    invoke-virtual {v0, v1}, La/grj;->a(Ljava/lang/String;)V

    .line 2370
    .line 2371
    .line 2372
    goto :goto_1f

    .line 2373
    :cond_5a
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2374
    .line 2375
    .line 2376
    throw v8

    .line 2377
    :cond_5b
    instance-of v2, v1, La/swc0;

    .line 2378
    .line 2379
    if-eqz v2, :cond_5f

    .line 2380
    .line 2381
    check-cast v1, La/swc0;

    .line 2382
    .line 2383
    iget-boolean v1, v1, La/swc0;->a:Z

    .line 2384
    .line 2385
    iget-object v0, v0, La/qwc0;->Q1:Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;

    .line 2386
    .line 2387
    if-nez v0, :cond_5c

    .line 2388
    .line 2389
    goto :goto_1f

    .line 2390
    :cond_5c
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/webview/FixedWebView;->b()Z

    .line 2391
    .line 2392
    .line 2393
    move-result v0

    .line 2394
    if-nez v0, :cond_5d

    .line 2395
    .line 2396
    goto :goto_1f

    .line 2397
    :cond_5d
    invoke-static {v1}, Landroid/webkit/WebView;->setWebContentsDebuggingEnabled(Z)V

    .line 2398
    .line 2399
    .line 2400
    :cond_5e
    :goto_1f
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2401
    .line 2402
    goto :goto_20

    .line 2403
    :cond_5f
    invoke-static {}, La/t9f;->b()V

    .line 2404
    .line 2405
    .line 2406
    :goto_20
    return-object v8

    .line 2407
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2408
    .line 2409
    check-cast v1, Ljava/lang/Throwable;

    .line 2410
    .line 2411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2412
    .line 2413
    .line 2414
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2415
    .line 2416
    check-cast v0, La/kvc0;

    .line 2417
    .line 2418
    invoke-virtual {v0, v1}, La/d06;->y(Ljava/lang/Throwable;)V

    .line 2419
    .line 2420
    .line 2421
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2422
    .line 2423
    return-object v0

    .line 2424
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2425
    .line 2426
    check-cast v1, Ljava/lang/Throwable;

    .line 2427
    .line 2428
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2429
    .line 2430
    .line 2431
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2432
    .line 2433
    check-cast v0, La/qrc0;

    .line 2434
    .line 2435
    iget-object v2, v0, La/qrc0;->E:La/duj;

    .line 2436
    .line 2437
    new-instance v3, La/r7a0;

    .line 2438
    .line 2439
    const/16 v4, 0x19

    .line 2440
    .line 2441
    invoke-direct {v3, v1, v0, v4}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2442
    .line 2443
    .line 2444
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2445
    .line 2446
    .line 2447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2448
    .line 2449
    return-object v0

    .line 2450
    nop

    .line 2451
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
