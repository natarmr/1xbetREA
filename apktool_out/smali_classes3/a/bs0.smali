.class public final synthetic La/bs0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J


# direct methods
.method public synthetic constructor <init>(JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x5

    iput-byte v0, p0, La/bs0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, La/bs0;->c:J

    iput-object p3, p0, La/bs0;->b:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JB)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/bs0;->a:B

    iput-object p1, p0, La/bs0;->b:Ljava/lang/String;

    iput-wide p2, p0, La/bs0;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JIB)V
    .locals 0

    .line 3
    iput-byte p5, p0, La/bs0;->a:B

    iput-object p1, p0, La/bs0;->b:Ljava/lang/String;

    iput-wide p2, p0, La/bs0;->c:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/bs0;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/high16 v3, 0x3f800000    # 1.0f

    .line 7
    .line 8
    sget-object v4, La/jm40;->b:La/jm40;

    .line 9
    .line 10
    const/4 v5, 0x2

    .line 11
    const/4 v6, 0x0

    .line 12
    iget-wide v7, v0, La/bs0;->c:J

    .line 13
    .line 14
    iget-object v9, v0, La/bs0;->b:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v10, 0x1

    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v0, p1

    .line 21
    .line 22
    check-cast v0, La/fet;

    .line 23
    .line 24
    move-object/from16 v1, p2

    .line 25
    .line 26
    check-cast v1, Ljava/lang/Integer;

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    const/4 v1, 0x7

    .line 32
    invoke-static {v1}, La/x8x;->L(I)I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    invoke-static {v9, v7, v8, v0, v1}, La/ktt0;->c(Ljava/lang/String;JLa/fet;I)V

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
    check-cast v1, La/fet;

    .line 45
    .line 46
    move-object/from16 v2, p2

    .line 47
    .line 48
    check-cast v2, Ljava/lang/Integer;

    .line 49
    .line 50
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    and-int/lit8 v7, v2, 0x3

    .line 55
    .line 56
    if-eq v7, v5, :cond_0

    .line 57
    .line 58
    move v6, v10

    .line 59
    :cond_0
    and-int/2addr v2, v10

    .line 60
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_1

    .line 65
    .line 66
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    sget-object v9, La/j1t0;->a:La/qrq;

    .line 71
    .line 72
    sget-wide v6, La/qmk;->r:J

    .line 73
    .line 74
    sget-wide v15, La/qmk;->F:J

    .line 75
    .line 76
    new-instance v3, La/y9q0;

    .line 77
    .line 78
    const/4 v14, 0x0

    .line 79
    const v17, 0xfdffdd

    .line 80
    .line 81
    .line 82
    const-wide/16 v4, 0x0

    .line 83
    .line 84
    const/4 v8, 0x0

    .line 85
    const-wide/16 v10, 0x0

    .line 86
    .line 87
    const/4 v12, 0x0

    .line 88
    const/4 v13, 0x0

    .line 89
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 90
    .line 91
    .line 92
    invoke-static {v3, v1}, La/ibm0;->t(La/y9q0;La/fet;)La/y9q0;

    .line 93
    .line 94
    .line 95
    move-result-object v21

    .line 96
    const/16 v24, 0x6180

    .line 97
    .line 98
    const v25, 0x1afec

    .line 99
    .line 100
    .line 101
    move-object/from16 v22, v1

    .line 102
    .line 103
    iget-object v1, v0, La/bs0;->b:Ljava/lang/String;

    .line 104
    .line 105
    const-wide/16 v3, 0x0

    .line 106
    .line 107
    const/4 v5, 0x0

    .line 108
    iget-wide v6, v0, La/bs0;->c:J

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const-wide/16 v11, 0x0

    .line 113
    .line 114
    const/4 v13, 0x0

    .line 115
    const-wide/16 v14, 0x0

    .line 116
    .line 117
    const/16 v16, 0x2

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    const/16 v18, 0x2

    .line 122
    .line 123
    const/16 v19, 0x0

    .line 124
    .line 125
    const/16 v20, 0x0

    .line 126
    .line 127
    const/16 v23, 0x30

    .line 128
    .line 129
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 130
    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_1
    move-object/from16 v22, v1

    .line 134
    .line 135
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 136
    .line 137
    .line 138
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 139
    .line 140
    return-object v0

    .line 141
    :pswitch_1
    move-object/from16 v1, p1

    .line 142
    .line 143
    check-cast v1, La/fet;

    .line 144
    .line 145
    move-object/from16 v2, p2

    .line 146
    .line 147
    check-cast v2, Ljava/lang/Integer;

    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    and-int/lit8 v7, v2, 0x3

    .line 154
    .line 155
    if-eq v7, v5, :cond_2

    .line 156
    .line 157
    move v6, v10

    .line 158
    :cond_2
    and-int/2addr v2, v10

    .line 159
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    if-eqz v2, :cond_3

    .line 164
    .line 165
    invoke-static {v4, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    sget-object v9, La/j1t0;->c:La/qrq;

    .line 170
    .line 171
    sget-wide v6, La/qmk;->q:J

    .line 172
    .line 173
    sget-wide v15, La/qmk;->D:J

    .line 174
    .line 175
    new-instance v17, La/y9q0;

    .line 176
    .line 177
    const/4 v14, 0x0

    .line 178
    move-object/from16 v3, v17

    .line 179
    .line 180
    const v17, 0xfdffdd

    .line 181
    .line 182
    .line 183
    const-wide/16 v4, 0x0

    .line 184
    .line 185
    const/4 v8, 0x0

    .line 186
    const-wide/16 v10, 0x0

    .line 187
    .line 188
    const/4 v12, 0x0

    .line 189
    const/4 v13, 0x0

    .line 190
    invoke-direct/range {v3 .. v17}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 191
    .line 192
    .line 193
    sget-object v4, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 194
    .line 195
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 196
    .line 197
    .line 198
    move-result-wide v18

    .line 199
    const/16 v34, 0x0

    .line 200
    .line 201
    const v35, 0xfffffe

    .line 202
    .line 203
    .line 204
    const-wide/16 v20, 0x0

    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    const/16 v24, 0x0

    .line 211
    .line 212
    const-wide/16 v25, 0x0

    .line 213
    .line 214
    const/16 v27, 0x0

    .line 215
    .line 216
    const/16 v28, 0x0

    .line 217
    .line 218
    const/16 v29, 0x0

    .line 219
    .line 220
    const/16 v30, 0x0

    .line 221
    .line 222
    const-wide/16 v31, 0x0

    .line 223
    .line 224
    const/16 v33, 0x0

    .line 225
    .line 226
    move-object/from16 v17, v3

    .line 227
    .line 228
    invoke-static/range {v17 .. v35}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 229
    .line 230
    .line 231
    move-result-object v21

    .line 232
    const/16 v24, 0x6180

    .line 233
    .line 234
    const v25, 0x1afec

    .line 235
    .line 236
    .line 237
    move-object/from16 v22, v1

    .line 238
    .line 239
    iget-object v1, v0, La/bs0;->b:Ljava/lang/String;

    .line 240
    .line 241
    const-wide/16 v3, 0x0

    .line 242
    .line 243
    const/4 v5, 0x0

    .line 244
    iget-wide v6, v0, La/bs0;->c:J

    .line 245
    .line 246
    const/4 v9, 0x0

    .line 247
    const/4 v10, 0x0

    .line 248
    const-wide/16 v11, 0x0

    .line 249
    .line 250
    const/4 v13, 0x0

    .line 251
    const-wide/16 v14, 0x0

    .line 252
    .line 253
    const/16 v16, 0x2

    .line 254
    .line 255
    const/16 v17, 0x0

    .line 256
    .line 257
    const/16 v18, 0x5

    .line 258
    .line 259
    const/16 v19, 0x0

    .line 260
    .line 261
    const/16 v20, 0x0

    .line 262
    .line 263
    const/16 v23, 0x30

    .line 264
    .line 265
    invoke-static/range {v1 .. v25}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 266
    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_3
    move-object/from16 v22, v1

    .line 270
    .line 271
    invoke-virtual/range {v22 .. v22}, La/fet;->X()V

    .line 272
    .line 273
    .line 274
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 275
    .line 276
    return-object v0

    .line 277
    :pswitch_2
    move-object/from16 v1, p1

    .line 278
    .line 279
    check-cast v1, La/oyg0;

    .line 280
    .line 281
    move-object/from16 v3, p2

    .line 282
    .line 283
    check-cast v3, La/gp40;

    .line 284
    .line 285
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 289
    .line 290
    .line 291
    iget-wide v9, v0, La/bs0;->c:J

    .line 292
    .line 293
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 294
    .line 295
    .line 296
    move-result-object v4

    .line 297
    const-string v5, "INPUT_VALUE_KEY"

    .line 298
    .line 299
    invoke-static {v1, v4, v5}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    const-string v4, "TEXT_FIELD_ERROR"

    .line 303
    .line 304
    iget-object v6, v0, La/bs0;->b:Ljava/lang/String;

    .line 305
    .line 306
    invoke-static {v1, v6, v4}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    const-string v2, "SELECTED_VALUE_INDEX_KEY"

    .line 314
    .line 315
    invoke-static {v1, v0, v2}, La/q7x;->F(La/oyg0;Ljava/lang/Object;Ljava/lang/String;)V

    .line 316
    .line 317
    .line 318
    const/4 v11, 0x0

    .line 319
    const/16 v12, 0x137

    .line 320
    .line 321
    const/4 v4, 0x0

    .line 322
    const/4 v5, 0x0

    .line 323
    const/4 v7, 0x0

    .line 324
    const/4 v8, -0x1

    .line 325
    invoke-static/range {v3 .. v12}, La/gp40;->a(La/gp40;La/pcq;ZLjava/lang/String;IIJZI)La/gp40;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    return-object v0

    .line 330
    :pswitch_3
    move-object/from16 v0, p1

    .line 331
    .line 332
    check-cast v0, La/fet;

    .line 333
    .line 334
    move-object/from16 v1, p2

    .line 335
    .line 336
    check-cast v1, Ljava/lang/Integer;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-static {v10}, La/x8x;->L(I)I

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    invoke-static {v9, v7, v8, v0, v1}, La/m7x;->b(Ljava/lang/String;JLa/fet;I)V

    .line 346
    .line 347
    .line 348
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 349
    .line 350
    return-object v0

    .line 351
    :pswitch_4
    move-object/from16 v0, p1

    .line 352
    .line 353
    check-cast v0, La/fet;

    .line 354
    .line 355
    move-object/from16 v1, p2

    .line 356
    .line 357
    check-cast v1, Ljava/lang/Integer;

    .line 358
    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-static {v10}, La/x8x;->L(I)I

    .line 363
    .line 364
    .line 365
    move-result v1

    .line 366
    invoke-static {v9, v7, v8, v0, v1}, La/ulb;->s(Ljava/lang/String;JLa/fet;I)V

    .line 367
    .line 368
    .line 369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 370
    .line 371
    return-object v0

    .line 372
    :pswitch_5
    move-object/from16 v0, p1

    .line 373
    .line 374
    check-cast v0, La/fet;

    .line 375
    .line 376
    move-object/from16 v1, p2

    .line 377
    .line 378
    check-cast v1, Ljava/lang/Integer;

    .line 379
    .line 380
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-static {v10}, La/x8x;->L(I)I

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    invoke-static {v9, v7, v8, v0, v1}, La/vdb;->J(Ljava/lang/String;JLa/fet;I)V

    .line 388
    .line 389
    .line 390
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 391
    .line 392
    return-object v0

    .line 393
    :pswitch_6
    move-object/from16 v0, p1

    .line 394
    .line 395
    check-cast v0, La/fet;

    .line 396
    .line 397
    move-object/from16 v1, p2

    .line 398
    .line 399
    check-cast v1, Ljava/lang/Integer;

    .line 400
    .line 401
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    invoke-static {v10}, La/x8x;->L(I)I

    .line 405
    .line 406
    .line 407
    move-result v1

    .line 408
    invoke-static {v9, v7, v8, v0, v1}, La/wvb;->f(Ljava/lang/String;JLa/fet;I)V

    .line 409
    .line 410
    .line 411
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 412
    .line 413
    return-object v0

    .line 414
    :pswitch_7
    move-object/from16 v0, p1

    .line 415
    .line 416
    check-cast v0, La/oyg0;

    .line 417
    .line 418
    move-object/from16 v10, p2

    .line 419
    .line 420
    check-cast v10, La/ur0;

    .line 421
    .line 422
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 426
    .line 427
    .line 428
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    iget-object v0, v10, La/ur0;->b:La/v5q;

    .line 432
    .line 433
    instance-of v1, v0, La/r5q;

    .line 434
    .line 435
    const/4 v3, 0x0

    .line 436
    if-eqz v1, :cond_4

    .line 437
    .line 438
    check-cast v0, La/r5q;

    .line 439
    .line 440
    goto :goto_2

    .line 441
    :cond_4
    move-object v0, v3

    .line 442
    :goto_2
    if-nez v0, :cond_5

    .line 443
    .line 444
    goto/16 :goto_7

    .line 445
    .line 446
    :cond_5
    iget-object v0, v0, La/r5q;->a:La/a4x;

    .line 447
    .line 448
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    move v4, v6

    .line 453
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 454
    .line 455
    .line 456
    move-result v5

    .line 457
    if-eqz v5, :cond_7

    .line 458
    .line 459
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 460
    .line 461
    .line 462
    move-result-object v5

    .line 463
    check-cast v5, La/j4b;

    .line 464
    .line 465
    iget-object v5, v5, La/j4b;->a:La/x2q;

    .line 466
    .line 467
    iget-object v5, v5, La/x2q;->a:Ljava/lang/String;

    .line 468
    .line 469
    invoke-static {v5, v9}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-eqz v5, :cond_6

    .line 474
    .line 475
    move v2, v4

    .line 476
    goto :goto_4

    .line 477
    :cond_6
    add-int/lit8 v4, v4, 0x1

    .line 478
    .line 479
    goto :goto_3

    .line 480
    :cond_7
    :goto_4
    invoke-static {v2, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    check-cast v1, La/j4b;

    .line 485
    .line 486
    if-eqz v1, :cond_d

    .line 487
    .line 488
    iget-object v4, v1, La/j4b;->b:Ljava/util/Set;

    .line 489
    .line 490
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 491
    .line 492
    .line 493
    move-result-object v5

    .line 494
    invoke-interface {v4, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-result v4

    .line 498
    if-eqz v4, :cond_9

    .line 499
    .line 500
    const-string v4, "dopInfo2"

    .line 501
    .line 502
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 503
    .line 504
    .line 505
    move-result v4

    .line 506
    if-eqz v4, :cond_8

    .line 507
    .line 508
    const-string v4, "0"

    .line 509
    .line 510
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 511
    .line 512
    .line 513
    move-result-object v4

    .line 514
    goto :goto_5

    .line 515
    :cond_8
    sget-object v4, La/xun;->a:La/xun;

    .line 516
    .line 517
    goto :goto_5

    .line 518
    :cond_9
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 519
    .line 520
    .line 521
    move-result-object v4

    .line 522
    invoke-static {v4}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 523
    .line 524
    .line 525
    move-result-object v4

    .line 526
    :goto_5
    iget-object v1, v1, La/j4b;->a:La/x2q;

    .line 527
    .line 528
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 529
    .line 530
    .line 531
    new-instance v5, La/j4b;

    .line 532
    .line 533
    invoke-direct {v5, v1, v4}, La/j4b;-><init>(La/x2q;Ljava/util/Set;)V

    .line 534
    .line 535
    .line 536
    new-instance v1, Ljava/util/ArrayList;

    .line 537
    .line 538
    const/16 v4, 0xa

    .line 539
    .line 540
    invoke-static {v0, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 541
    .line 542
    .line 543
    move-result v4

    .line 544
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 545
    .line 546
    .line 547
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 548
    .line 549
    .line 550
    move-result-object v0

    .line 551
    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 552
    .line 553
    .line 554
    move-result v4

    .line 555
    if-eqz v4, :cond_c

    .line 556
    .line 557
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v4

    .line 561
    add-int/lit8 v7, v6, 0x1

    .line 562
    .line 563
    if-ltz v6, :cond_b

    .line 564
    .line 565
    check-cast v4, La/j4b;

    .line 566
    .line 567
    if-ne v6, v2, :cond_a

    .line 568
    .line 569
    move-object v4, v5

    .line 570
    :cond_a
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 571
    .line 572
    .line 573
    move v6, v7

    .line 574
    goto :goto_6

    .line 575
    :cond_b
    invoke-static {}, La/q3d;->p()V

    .line 576
    .line 577
    .line 578
    throw v3

    .line 579
    :cond_c
    invoke-static {v1}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 584
    .line 585
    .line 586
    new-instance v11, La/r5q;

    .line 587
    .line 588
    invoke-direct {v11, v0}, La/r5q;-><init>(La/a4x;)V

    .line 589
    .line 590
    .line 591
    const/4 v14, 0x0

    .line 592
    const/16 v15, 0xfd

    .line 593
    .line 594
    const/4 v12, 0x0

    .line 595
    const/4 v13, 0x0

    .line 596
    invoke-static/range {v10 .. v15}, La/ur0;->a(La/ur0;La/v5q;La/rlk0;La/y5d0;La/uaq0;I)La/ur0;

    .line 597
    .line 598
    .line 599
    move-result-object v10

    .line 600
    :cond_d
    :goto_7
    return-object v10

    .line 601
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
