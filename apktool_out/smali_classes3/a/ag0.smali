.class public final synthetic La/ag0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/ag0;->a:B

    iput-object p1, p0, La/ag0;->b:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    const/16 p2, 0x10

    iput-byte p2, p0, La/ag0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ag0;->b:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ag0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x6

    .line 6
    sget-object v3, La/ukd;->a:La/cl5;

    .line 7
    .line 8
    sget-object v4, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x1

    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v0, La/ag0;->b:Lkotlin/jvm/functions/Function1;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v0, p1

    .line 19
    .line 20
    check-cast v0, La/m9n;

    .line 21
    .line 22
    move-object/from16 v1, p2

    .line 23
    .line 24
    check-cast v1, Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    new-instance v2, La/d2t;

    .line 30
    .line 31
    invoke-interface {v0}, La/m9n;->getId()J

    .line 32
    .line 33
    .line 34
    move-result-wide v3

    .line 35
    invoke-direct {v2, v3, v4, v1}, La/d2t;-><init>(JLjava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_0
    move-object/from16 v0, p1

    .line 45
    .line 46
    check-cast v0, La/m9n;

    .line 47
    .line 48
    move-object/from16 v1, p2

    .line 49
    .line 50
    check-cast v1, Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v2, La/d2t;

    .line 56
    .line 57
    invoke-interface {v0}, La/m9n;->getId()J

    .line 58
    .line 59
    .line 60
    move-result-wide v3

    .line 61
    invoke-direct {v2, v3, v4, v1}, La/d2t;-><init>(JLjava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object v0

    .line 70
    :pswitch_1
    move-object/from16 v0, p1

    .line 71
    .line 72
    check-cast v0, Ljava/lang/Integer;

    .line 73
    .line 74
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    move-object/from16 v1, p2

    .line 79
    .line 80
    check-cast v1, Ljava/lang/String;

    .line 81
    .line 82
    new-instance v2, La/qgw;

    .line 83
    .line 84
    invoke-direct {v2, v0, v1}, La/qgw;-><init>(ILjava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 91
    .line 92
    return-object v0

    .line 93
    :pswitch_2
    move-object/from16 v0, p1

    .line 94
    .line 95
    check-cast v0, Ljava/lang/Integer;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    move-object/from16 v1, p2

    .line 102
    .line 103
    check-cast v1, Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    new-instance v2, La/rhw;

    .line 109
    .line 110
    invoke-direct {v2, v0, v1}, La/rhw;-><init>(ILjava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_3
    move-object/from16 v0, p1

    .line 120
    .line 121
    check-cast v0, Ljava/lang/String;

    .line 122
    .line 123
    move-object/from16 v1, p2

    .line 124
    .line 125
    check-cast v1, Ljava/lang/String;

    .line 126
    .line 127
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v2, La/mih;

    .line 134
    .line 135
    invoke-direct {v2, v0, v1}, La/mih;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 142
    .line 143
    return-object v0

    .line 144
    :pswitch_4
    move-object/from16 v0, p1

    .line 145
    .line 146
    check-cast v0, Ljava/lang/Long;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 149
    .line 150
    .line 151
    move-result-wide v0

    .line 152
    move-object/from16 v2, p2

    .line 153
    .line 154
    check-cast v2, La/h2l0;

    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    new-instance v3, La/iig;

    .line 160
    .line 161
    invoke-direct {v3, v0, v1, v2}, La/iig;-><init>(JLa/h2l0;)V

    .line 162
    .line 163
    .line 164
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 168
    .line 169
    return-object v0

    .line 170
    :pswitch_5
    move-object/from16 v13, p1

    .line 171
    .line 172
    check-cast v13, La/fet;

    .line 173
    .line 174
    move-object/from16 v0, p2

    .line 175
    .line 176
    check-cast v0, Ljava/lang/Integer;

    .line 177
    .line 178
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 179
    .line 180
    .line 181
    move-result v0

    .line 182
    and-int/lit8 v1, v0, 0x3

    .line 183
    .line 184
    if-eq v1, v5, :cond_0

    .line 185
    .line 186
    move v7, v6

    .line 187
    :cond_0
    and-int/2addr v0, v6

    .line 188
    invoke-virtual {v13, v0, v7}, La/fet;->U(IZ)Z

    .line 189
    .line 190
    .line 191
    move-result v0

    .line 192
    if-eqz v0, :cond_3

    .line 193
    .line 194
    invoke-static {v4}, La/o050;->W(La/mm40;)La/mm40;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    new-instance v14, La/imm;

    .line 199
    .line 200
    new-instance v15, La/ilm;

    .line 201
    .line 202
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 203
    .line 204
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 209
    .line 210
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 211
    .line 212
    .line 213
    move-result-wide v4

    .line 214
    invoke-direct {v15, v4, v5}, La/ilm;-><init>(J)V

    .line 215
    .line 216
    .line 217
    new-instance v16, La/plm;

    .line 218
    .line 219
    const v2, 0x7f130b09

    .line 220
    .line 221
    .line 222
    invoke-static {v2, v13}, La/xsm0;->s(ILa/fet;)Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v17

    .line 226
    sget-object v18, La/ha50;->b:La/ha50;

    .line 227
    .line 228
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 233
    .line 234
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 235
    .line 236
    .line 237
    move-result-wide v19

    .line 238
    sget-object v21, La/fa50;->a:La/fa50;

    .line 239
    .line 240
    invoke-direct/range {v16 .. v21}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v13, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 248
    .line 249
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 250
    .line 251
    .line 252
    move-result-wide v18

    .line 253
    const/16 v20, 0x1

    .line 254
    .line 255
    const/16 v21, 0x0

    .line 256
    .line 257
    sget-object v17, La/fmm;->a:La/fmm;

    .line 258
    .line 259
    invoke-direct/range {v14 .. v21}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v13, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    if-nez v0, :cond_1

    .line 271
    .line 272
    if-ne v2, v3, :cond_2

    .line 273
    .line 274
    :cond_1
    new-instance v2, La/dib;

    .line 275
    .line 276
    const/16 v0, 0xb

    .line 277
    .line 278
    invoke-direct {v2, v8, v0}, La/dib;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v13, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_2
    move-object v4, v2

    .line 285
    check-cast v4, Lkotlin/jvm/functions/Function0;

    .line 286
    .line 287
    const/16 v15, 0x36

    .line 288
    .line 289
    const/16 v16, 0x1f4

    .line 290
    .line 291
    const/4 v3, 0x0

    .line 292
    const/4 v5, 0x0

    .line 293
    const/4 v6, 0x0

    .line 294
    const/4 v7, 0x0

    .line 295
    const/4 v8, 0x0

    .line 296
    const/4 v9, 0x0

    .line 297
    const/4 v10, 0x0

    .line 298
    const/4 v11, 0x0

    .line 299
    const/4 v12, 0x0

    .line 300
    move-object v2, v14

    .line 301
    const/high16 v14, 0x30000000

    .line 302
    .line 303
    invoke-static/range {v1 .. v16}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 304
    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_3
    invoke-virtual {v13}, La/fet;->X()V

    .line 308
    .line 309
    .line 310
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 311
    .line 312
    return-object v0

    .line 313
    :pswitch_6
    move-object/from16 v0, p1

    .line 314
    .line 315
    check-cast v0, La/mxl;

    .line 316
    .line 317
    move-object/from16 v1, p2

    .line 318
    .line 319
    check-cast v1, Ljava/lang/Integer;

    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 331
    .line 332
    return-object v0

    .line 333
    :pswitch_7
    move-object/from16 v0, p1

    .line 334
    .line 335
    check-cast v0, Ljava/lang/Boolean;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 338
    .line 339
    .line 340
    move-result v0

    .line 341
    move-object/from16 v1, p2

    .line 342
    .line 343
    check-cast v1, Ljava/lang/Long;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 346
    .line 347
    .line 348
    move-result-wide v1

    .line 349
    new-instance v3, La/c6b;

    .line 350
    .line 351
    invoke-direct {v3, v0, v1, v2}, La/c6b;-><init>(ZJ)V

    .line 352
    .line 353
    .line 354
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 358
    .line 359
    return-object v0

    .line 360
    :pswitch_8
    move-object/from16 v0, p1

    .line 361
    .line 362
    check-cast v0, Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 365
    .line 366
    .line 367
    move-result v0

    .line 368
    move-object/from16 v1, p2

    .line 369
    .line 370
    check-cast v1, Ljava/lang/Long;

    .line 371
    .line 372
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 373
    .line 374
    .line 375
    move-result-wide v1

    .line 376
    new-instance v3, La/c6b;

    .line 377
    .line 378
    invoke-direct {v3, v0, v1, v2}, La/c6b;-><init>(ZJ)V

    .line 379
    .line 380
    .line 381
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 385
    .line 386
    return-object v0

    .line 387
    :pswitch_9
    move-object/from16 v0, p1

    .line 388
    .line 389
    check-cast v0, Ljava/lang/Boolean;

    .line 390
    .line 391
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 392
    .line 393
    .line 394
    move-result v0

    .line 395
    move-object/from16 v1, p2

    .line 396
    .line 397
    check-cast v1, Ljava/lang/Long;

    .line 398
    .line 399
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 400
    .line 401
    .line 402
    move-result-wide v1

    .line 403
    new-instance v3, La/c6b;

    .line 404
    .line 405
    invoke-direct {v3, v0, v1, v2}, La/c6b;-><init>(ZJ)V

    .line 406
    .line 407
    .line 408
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_a
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, Ljava/lang/Boolean;

    .line 417
    .line 418
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 419
    .line 420
    .line 421
    move-result v0

    .line 422
    move-object/from16 v1, p2

    .line 423
    .line 424
    check-cast v1, Ljava/lang/Long;

    .line 425
    .line 426
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 427
    .line 428
    .line 429
    move-result-wide v1

    .line 430
    new-instance v3, La/c6b;

    .line 431
    .line 432
    invoke-direct {v3, v0, v1, v2}, La/c6b;-><init>(ZJ)V

    .line 433
    .line 434
    .line 435
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_b
    move-object/from16 v0, p1

    .line 442
    .line 443
    check-cast v0, Ljava/lang/Integer;

    .line 444
    .line 445
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 446
    .line 447
    .line 448
    move-result v0

    .line 449
    move-object/from16 v1, p2

    .line 450
    .line 451
    check-cast v1, Ljava/lang/String;

    .line 452
    .line 453
    new-instance v1, La/k09;

    .line 454
    .line 455
    invoke-direct {v1, v0}, La/k09;-><init>(I)V

    .line 456
    .line 457
    .line 458
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 459
    .line 460
    .line 461
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 462
    .line 463
    return-object v0

    .line 464
    :pswitch_c
    move-object/from16 v0, p1

    .line 465
    .line 466
    check-cast v0, La/fet;

    .line 467
    .line 468
    move-object/from16 v1, p2

    .line 469
    .line 470
    check-cast v1, Ljava/lang/Integer;

    .line 471
    .line 472
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    invoke-static {v6}, La/x8x;->L(I)I

    .line 476
    .line 477
    .line 478
    move-result v1

    .line 479
    invoke-static {v8, v0, v1}, La/o050;->d(Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 480
    .line 481
    .line 482
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 483
    .line 484
    return-object v0

    .line 485
    :pswitch_d
    move-object/from16 v0, p1

    .line 486
    .line 487
    check-cast v0, Ljava/lang/Integer;

    .line 488
    .line 489
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 490
    .line 491
    .line 492
    move-result v0

    .line 493
    move-object/from16 v1, p2

    .line 494
    .line 495
    check-cast v1, Ljava/lang/String;

    .line 496
    .line 497
    new-instance v2, La/oxq0;

    .line 498
    .line 499
    new-instance v3, La/tyq0;

    .line 500
    .line 501
    invoke-direct {v3, v0, v1}, La/tyq0;-><init>(ILjava/lang/String;)V

    .line 502
    .line 503
    .line 504
    invoke-direct {v2, v3}, La/oxq0;-><init>(La/tyq0;)V

    .line 505
    .line 506
    .line 507
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 511
    .line 512
    return-object v0

    .line 513
    :pswitch_e
    move-object/from16 v0, p1

    .line 514
    .line 515
    check-cast v0, Ljava/lang/String;

    .line 516
    .line 517
    move-object/from16 v1, p2

    .line 518
    .line 519
    check-cast v1, Landroid/os/Bundle;

    .line 520
    .line 521
    const-string v2, "KEY_PICKER_MODEL_REQUEST"

    .line 522
    .line 523
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 524
    .line 525
    .line 526
    move-result v0

    .line 527
    new-instance v1, La/x94;

    .line 528
    .line 529
    invoke-direct {v1, v0}, La/x94;-><init>(I)V

    .line 530
    .line 531
    .line 532
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_f
    move-object/from16 v0, p1

    .line 539
    .line 540
    check-cast v0, Ljava/lang/String;

    .line 541
    .line 542
    move-object/from16 v1, p2

    .line 543
    .line 544
    check-cast v1, Landroid/os/Bundle;

    .line 545
    .line 546
    const-string v2, "KEY_AUTH_ENTRY_POINT_REQUEST"

    .line 547
    .line 548
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 549
    .line 550
    .line 551
    move-result v0

    .line 552
    new-instance v1, La/t94;

    .line 553
    .line 554
    invoke-direct {v1, v0}, La/t94;-><init>(I)V

    .line 555
    .line 556
    .line 557
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object v0

    .line 563
    :pswitch_10
    move-object/from16 v0, p1

    .line 564
    .line 565
    check-cast v0, Ljava/lang/String;

    .line 566
    .line 567
    move-object/from16 v1, p2

    .line 568
    .line 569
    check-cast v1, Landroid/os/Bundle;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    const-string v0, "PICKER_DIALOG_TAG"

    .line 578
    .line 579
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 580
    .line 581
    .line 582
    sget-object v0, La/z94;->a:La/z94;

    .line 583
    .line 584
    invoke-interface {v8, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    :pswitch_11
    move-object/from16 v0, p1

    .line 591
    .line 592
    check-cast v0, Ljava/lang/String;

    .line 593
    .line 594
    move-object/from16 v1, p2

    .line 595
    .line 596
    check-cast v1, Landroid/os/Bundle;

    .line 597
    .line 598
    const-string v2, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 599
    .line 600
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 601
    .line 602
    .line 603
    move-result v0

    .line 604
    const-string v2, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 605
    .line 606
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 607
    .line 608
    .line 609
    move-result v1

    .line 610
    new-instance v2, La/y94;

    .line 611
    .line 612
    invoke-direct {v2, v0, v1}, La/y94;-><init>(IZ)V

    .line 613
    .line 614
    .line 615
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 619
    .line 620
    return-object v0

    .line 621
    :pswitch_12
    move-object/from16 v0, p1

    .line 622
    .line 623
    check-cast v0, Ljava/lang/Integer;

    .line 624
    .line 625
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 626
    .line 627
    .line 628
    move-object/from16 v1, p2

    .line 629
    .line 630
    check-cast v1, Ljava/lang/String;

    .line 631
    .line 632
    invoke-interface {v8, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 633
    .line 634
    .line 635
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 636
    .line 637
    return-object v0

    .line 638
    :pswitch_13
    move-object/from16 v0, p1

    .line 639
    .line 640
    check-cast v0, Ljava/lang/Long;

    .line 641
    .line 642
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 643
    .line 644
    .line 645
    move-result-wide v0

    .line 646
    move-object/from16 v2, p2

    .line 647
    .line 648
    check-cast v2, Ljava/lang/String;

    .line 649
    .line 650
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    new-instance v3, La/kxq0;

    .line 654
    .line 655
    new-instance v4, La/ek0;

    .line 656
    .line 657
    invoke-direct {v4, v0, v1, v2}, La/ek0;-><init>(JLjava/lang/String;)V

    .line 658
    .line 659
    .line 660
    invoke-direct {v3, v4}, La/kxq0;-><init>(La/ik0;)V

    .line 661
    .line 662
    .line 663
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 667
    .line 668
    return-object v0

    .line 669
    :pswitch_14
    move-object/from16 v0, p1

    .line 670
    .line 671
    check-cast v0, La/eol;

    .line 672
    .line 673
    move-object/from16 v1, p2

    .line 674
    .line 675
    check-cast v1, Ljava/lang/Boolean;

    .line 676
    .line 677
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 678
    .line 679
    .line 680
    move-result v1

    .line 681
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    new-instance v2, La/zh1;

    .line 685
    .line 686
    iget-object v0, v0, La/eol;->a:Ljava/lang/String;

    .line 687
    .line 688
    invoke-direct {v2, v0, v1}, La/zh1;-><init>(Ljava/lang/String;Z)V

    .line 689
    .line 690
    .line 691
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 695
    .line 696
    return-object v0

    .line 697
    :pswitch_15
    move-object/from16 v0, p1

    .line 698
    .line 699
    check-cast v0, La/eol;

    .line 700
    .line 701
    move-object/from16 v1, p2

    .line 702
    .line 703
    check-cast v1, Ljava/lang/Boolean;

    .line 704
    .line 705
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 706
    .line 707
    .line 708
    move-result v1

    .line 709
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    new-instance v2, La/zh1;

    .line 713
    .line 714
    iget-object v0, v0, La/eol;->a:Ljava/lang/String;

    .line 715
    .line 716
    invoke-direct {v2, v0, v1}, La/zh1;-><init>(Ljava/lang/String;Z)V

    .line 717
    .line 718
    .line 719
    invoke-interface {v8, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 720
    .line 721
    .line 722
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 723
    .line 724
    return-object v0

    .line 725
    :pswitch_16
    move-object/from16 v0, p1

    .line 726
    .line 727
    check-cast v0, Ljava/lang/Integer;

    .line 728
    .line 729
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 730
    .line 731
    .line 732
    move-result v0

    .line 733
    move-object/from16 v1, p2

    .line 734
    .line 735
    check-cast v1, Ljava/lang/String;

    .line 736
    .line 737
    new-instance v1, La/re1;

    .line 738
    .line 739
    invoke-direct {v1, v8, v0, v7}, La/re1;-><init>(Lkotlin/jvm/functions/Function1;IB)V

    .line 740
    .line 741
    .line 742
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 743
    .line 744
    invoke-static {v0, v1}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    invoke-virtual {v0}, La/bjj;->a()V

    .line 749
    .line 750
    .line 751
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 752
    .line 753
    return-object v0

    .line 754
    :pswitch_17
    move-object/from16 v1, p1

    .line 755
    .line 756
    check-cast v1, Ljava/lang/Long;

    .line 757
    .line 758
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 759
    .line 760
    .line 761
    move-result-wide v4

    .line 762
    move-object/from16 v6, p2

    .line 763
    .line 764
    check-cast v6, Ljava/lang/String;

    .line 765
    .line 766
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 767
    .line 768
    .line 769
    new-instance v2, La/pe1;

    .line 770
    .line 771
    const/4 v7, 0x0

    .line 772
    iget-object v3, v0, La/ag0;->b:Lkotlin/jvm/functions/Function1;

    .line 773
    .line 774
    invoke-direct/range {v2 .. v7}, La/pe1;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 775
    .line 776
    .line 777
    sget-object v0, La/ivb0;->b:La/ymx;

    .line 778
    .line 779
    invoke-static {v0, v2}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    invoke-virtual {v0}, La/bjj;->a()V

    .line 784
    .line 785
    .line 786
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    return-object v0

    .line 789
    :pswitch_18
    move-object/from16 v0, p1

    .line 790
    .line 791
    check-cast v0, Ljava/lang/Long;

    .line 792
    .line 793
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 794
    .line 795
    .line 796
    move-result-wide v0

    .line 797
    move-object/from16 v2, p2

    .line 798
    .line 799
    check-cast v2, Ljava/lang/Boolean;

    .line 800
    .line 801
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    new-instance v3, La/kxq0;

    .line 806
    .line 807
    new-instance v4, La/bk0;

    .line 808
    .line 809
    invoke-direct {v4, v2, v0, v1}, La/bk0;-><init>(ZJ)V

    .line 810
    .line 811
    .line 812
    invoke-direct {v3, v4}, La/kxq0;-><init>(La/ik0;)V

    .line 813
    .line 814
    .line 815
    invoke-interface {v8, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 816
    .line 817
    .line 818
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 819
    .line 820
    return-object v0

    .line 821
    :pswitch_19
    move-object/from16 v0, p1

    .line 822
    .line 823
    check-cast v0, La/fet;

    .line 824
    .line 825
    move-object/from16 v1, p2

    .line 826
    .line 827
    check-cast v1, Ljava/lang/Integer;

    .line 828
    .line 829
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 830
    .line 831
    .line 832
    move-result v1

    .line 833
    and-int/lit8 v9, v1, 0x3

    .line 834
    .line 835
    if-eq v9, v5, :cond_4

    .line 836
    .line 837
    move v7, v6

    .line 838
    :cond_4
    and-int/2addr v1, v6

    .line 839
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 840
    .line 841
    .line 842
    move-result v1

    .line 843
    if-eqz v1, :cond_7

    .line 844
    .line 845
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 846
    .line 847
    invoke-static {v4, v1, v5}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 848
    .line 849
    .line 850
    move-result-object v1

    .line 851
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 856
    .line 857
    .line 858
    move-result-object v5

    .line 859
    if-nez v4, :cond_5

    .line 860
    .line 861
    if-ne v5, v3, :cond_6

    .line 862
    .line 863
    :cond_5
    new-instance v5, La/nr0;

    .line 864
    .line 865
    const/4 v3, 0x3

    .line 866
    invoke-direct {v5, v8, v3}, La/nr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 870
    .line 871
    .line 872
    :cond_6
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 873
    .line 874
    invoke-static {v2, v0, v1, v5}, La/bsr0;->N(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 875
    .line 876
    .line 877
    goto :goto_1

    .line 878
    :cond_7
    invoke-virtual {v0}, La/fet;->X()V

    .line 879
    .line 880
    .line 881
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 882
    .line 883
    return-object v0

    .line 884
    :pswitch_1a
    move-object/from16 v0, p1

    .line 885
    .line 886
    check-cast v0, La/fet;

    .line 887
    .line 888
    move-object/from16 v1, p2

    .line 889
    .line 890
    check-cast v1, Ljava/lang/Integer;

    .line 891
    .line 892
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    and-int/lit8 v9, v1, 0x3

    .line 897
    .line 898
    if-eq v9, v5, :cond_8

    .line 899
    .line 900
    move v7, v6

    .line 901
    :cond_8
    and-int/2addr v1, v6

    .line 902
    invoke-virtual {v0, v1, v7}, La/fet;->U(IZ)Z

    .line 903
    .line 904
    .line 905
    move-result v1

    .line 906
    if-eqz v1, :cond_b

    .line 907
    .line 908
    sget-object v1, La/gqw0;->e:La/zx7;

    .line 909
    .line 910
    invoke-static {v4, v1, v5}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 911
    .line 912
    .line 913
    move-result-object v1

    .line 914
    invoke-virtual {v0, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 915
    .line 916
    .line 917
    move-result v4

    .line 918
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 919
    .line 920
    .line 921
    move-result-object v5

    .line 922
    if-nez v4, :cond_9

    .line 923
    .line 924
    if-ne v5, v3, :cond_a

    .line 925
    .line 926
    :cond_9
    new-instance v5, La/nr0;

    .line 927
    .line 928
    const/4 v3, 0x4

    .line 929
    invoke-direct {v5, v8, v3}, La/nr0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 930
    .line 931
    .line 932
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 933
    .line 934
    .line 935
    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 936
    .line 937
    invoke-static {v2, v0, v1, v5}, La/bsr0;->M(ILa/fet;La/mm40;Lkotlin/jvm/functions/Function0;)V

    .line 938
    .line 939
    .line 940
    goto :goto_2

    .line 941
    :cond_b
    invoke-virtual {v0}, La/fet;->X()V

    .line 942
    .line 943
    .line 944
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 945
    .line 946
    return-object v0

    .line 947
    :pswitch_1b
    move-object/from16 v0, p1

    .line 948
    .line 949
    check-cast v0, Ljava/lang/Integer;

    .line 950
    .line 951
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 952
    .line 953
    .line 954
    move-result v0

    .line 955
    move-object/from16 v1, p2

    .line 956
    .line 957
    check-cast v1, Ljava/lang/String;

    .line 958
    .line 959
    new-instance v1, La/ue0;

    .line 960
    .line 961
    invoke-direct {v1, v0}, La/ue0;-><init>(I)V

    .line 962
    .line 963
    .line 964
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 968
    .line 969
    return-object v0

    .line 970
    :pswitch_1c
    move-object/from16 v0, p1

    .line 971
    .line 972
    check-cast v0, Ljava/lang/Integer;

    .line 973
    .line 974
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    move-object/from16 v1, p2

    .line 979
    .line 980
    check-cast v1, Ljava/lang/String;

    .line 981
    .line 982
    new-instance v1, La/ue0;

    .line 983
    .line 984
    invoke-direct {v1, v0}, La/ue0;-><init>(I)V

    .line 985
    .line 986
    .line 987
    invoke-interface {v8, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 991
    .line 992
    return-object v0

    .line 993
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
