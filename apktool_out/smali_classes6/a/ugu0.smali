.class public final synthetic La/ugu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ugu0;->a:B

    iput-object p1, p0, La/ugu0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ugu0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ugu0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/ugu0;->c:Ljava/lang/Object;

    .line 7
    .line 8
    iget-object v0, v0, La/ugu0;->b:Ljava/lang/Object;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v0, La/akh0;

    .line 14
    .line 15
    check-cast v3, La/vby;

    .line 16
    .line 17
    new-instance v1, La/s4w0;

    .line 18
    .line 19
    invoke-direct {v1, v0, v3}, La/s4w0;-><init>(La/akh0;La/vby;)V

    .line 20
    .line 21
    .line 22
    return-object v1

    .line 23
    :pswitch_0
    check-cast v0, La/ywv0;

    .line 24
    .line 25
    check-cast v3, La/euv0;

    .line 26
    .line 27
    iget-object v0, v0, La/ywv0;->a:La/duv0;

    .line 28
    .line 29
    invoke-virtual {v0, v3}, La/duv0;->e(La/euv0;)V

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_1
    check-cast v0, La/wwv0;

    .line 36
    .line 37
    check-cast v3, La/euv0;

    .line 38
    .line 39
    new-instance v1, La/ywv0;

    .line 40
    .line 41
    iget-object v2, v0, La/wwv0;->a:La/fck0;

    .line 42
    .line 43
    new-instance v4, La/bsv0;

    .line 44
    .line 45
    iget-object v5, v2, La/fck0;->b:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v5, La/dsv0;

    .line 48
    .line 49
    iget-object v2, v2, La/fck0;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v2, La/esv0;

    .line 52
    .line 53
    invoke-direct {v4, v5, v2}, La/bsv0;-><init>(La/esv0;La/esv0;)V

    .line 54
    .line 55
    .line 56
    new-instance v2, La/msv0;

    .line 57
    .line 58
    const/high16 v5, 0x42f00000    # 120.0f

    .line 59
    .line 60
    invoke-direct {v2, v5}, La/msv0;-><init>(F)V

    .line 61
    .line 62
    .line 63
    sget-object v5, La/ssv0;->b:La/ssv0;

    .line 64
    .line 65
    new-instance v6, La/bxv0;

    .line 66
    .line 67
    new-instance v7, La/cxv0;

    .line 68
    .line 69
    iget-object v8, v0, La/wwv0;->b:La/g2e0;

    .line 70
    .line 71
    iget-wide v9, v8, La/g2e0;->a:J

    .line 72
    .line 73
    const/high16 v11, 0x41a00000    # 20.0f

    .line 74
    .line 75
    invoke-direct {v7, v11, v9, v10}, La/cxv0;-><init>(FJ)V

    .line 76
    .line 77
    .line 78
    iget-object v0, v0, La/wwv0;->c:La/ktv0;

    .line 79
    .line 80
    new-instance v9, La/jtv0;

    .line 81
    .line 82
    iget-object v10, v0, La/ktv0;->a:La/qtv0;

    .line 83
    .line 84
    iget-wide v11, v0, La/ktv0;->b:J

    .line 85
    .line 86
    iget-object v13, v0, La/ktv0;->c:La/ntv0;

    .line 87
    .line 88
    iget v14, v0, La/ktv0;->d:F

    .line 89
    .line 90
    move-object/from16 p0, v6

    .line 91
    .line 92
    move-object/from16 v17, v7

    .line 93
    .line 94
    iget-wide v6, v0, La/ktv0;->e:J

    .line 95
    .line 96
    move-wide v15, v6

    .line 97
    invoke-direct/range {v9 .. v16}, La/jtv0;-><init>(La/qtv0;JLa/ntv0;FJ)V

    .line 98
    .line 99
    .line 100
    iget-object v0, v8, La/g2e0;->c:Ljava/io/Serializable;

    .line 101
    .line 102
    check-cast v0, La/isv0;

    .line 103
    .line 104
    iget-wide v10, v8, La/g2e0;->b:J

    .line 105
    .line 106
    const/4 v12, 0x0

    .line 107
    sget-object v13, La/stv0;->a:La/stv0;

    .line 108
    .line 109
    move-object/from16 v6, p0

    .line 110
    .line 111
    move-object v8, v9

    .line 112
    move-object/from16 v7, v17

    .line 113
    .line 114
    move-object v9, v0

    .line 115
    invoke-direct/range {v6 .. v13}, La/bxv0;-><init>(La/cxv0;La/jtv0;La/lsv0;JZLa/stv0;)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v4, v2, v5, v6}, La/ywv0;-><init>(La/bsv0;La/msv0;La/ssv0;La/bxv0;)V

    .line 119
    .line 120
    .line 121
    iget-object v0, v1, La/ywv0;->a:La/duv0;

    .line 122
    .line 123
    invoke-virtual {v0, v3}, La/duv0;->e(La/euv0;)V

    .line 124
    .line 125
    .line 126
    return-object v1

    .line 127
    :pswitch_2
    check-cast v0, La/wzu0;

    .line 128
    .line 129
    check-cast v3, La/lwv0;

    .line 130
    .line 131
    invoke-virtual {v0, v3}, La/wzu0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 135
    .line 136
    return-object v0

    .line 137
    :pswitch_3
    check-cast v0, La/ywv0;

    .line 138
    .line 139
    check-cast v3, La/qwv0;

    .line 140
    .line 141
    iget-object v0, v0, La/ywv0;->j:La/ruv0;

    .line 142
    .line 143
    iput-boolean v2, v0, La/ruv0;->m:Z

    .line 144
    .line 145
    iget-object v0, v3, La/qwv0;->a:La/ywv0;

    .line 146
    .line 147
    iget-object v1, v0, La/ywv0;->a:La/duv0;

    .line 148
    .line 149
    iget-object v1, v1, La/duv0;->g:La/pz40;

    .line 150
    .line 151
    check-cast v1, La/hgk0;

    .line 152
    .line 153
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    check-cast v1, La/pkk0;

    .line 158
    .line 159
    if-eqz v1, :cond_0

    .line 160
    .line 161
    check-cast v1, La/r3k;

    .line 162
    .line 163
    invoke-virtual {v1}, La/r3k;->a()V

    .line 164
    .line 165
    .line 166
    :cond_0
    iget-object v0, v0, La/ywv0;->a:La/duv0;

    .line 167
    .line 168
    iget-object v0, v0, La/duv0;->h:La/pz40;

    .line 169
    .line 170
    check-cast v0, La/hgk0;

    .line 171
    .line 172
    invoke-virtual {v0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    check-cast v0, La/wpq;

    .line 177
    .line 178
    if-eqz v0, :cond_1

    .line 179
    .line 180
    const/4 v1, 0x1

    .line 181
    check-cast v0, La/ypq;

    .line 182
    .line 183
    invoke-virtual {v0, v1}, La/ypq;->b(Z)V

    .line 184
    .line 185
    .line 186
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 187
    .line 188
    return-object v0

    .line 189
    :pswitch_4
    check-cast v0, La/w4p0;

    .line 190
    .line 191
    check-cast v3, La/ad3;

    .line 192
    .line 193
    iget-object v0, v0, La/w4p0;->b:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v0, La/jhv0;

    .line 196
    .line 197
    invoke-interface {v0, v3}, La/jhv0;->b(La/sbe;)V

    .line 198
    .line 199
    .line 200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 201
    .line 202
    return-object v0

    .line 203
    :pswitch_5
    check-cast v0, La/xcz;

    .line 204
    .line 205
    check-cast v3, La/w6k;

    .line 206
    .line 207
    invoke-virtual {v0}, La/xcz;->j()La/mcz;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    const/high16 v1, 0x42100000    # 36.0f

    .line 212
    .line 213
    invoke-interface {v3, v1}, La/w6k;->w0(F)F

    .line 214
    .line 215
    .line 216
    move-result v1

    .line 217
    iget-object v2, v0, La/mcz;->l:Ljava/util/List;

    .line 218
    .line 219
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    check-cast v2, La/ncz;

    .line 224
    .line 225
    iget-object v3, v0, La/mcz;->l:Ljava/util/List;

    .line 226
    .line 227
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    check-cast v3, La/ncz;

    .line 232
    .line 233
    const/high16 v4, 0x3f800000    # 1.0f

    .line 234
    .line 235
    const/4 v5, 0x0

    .line 236
    if-eqz v2, :cond_2

    .line 237
    .line 238
    iget v6, v0, La/mcz;->m:I

    .line 239
    .line 240
    iget v2, v2, La/ncz;->p:I

    .line 241
    .line 242
    sub-int/2addr v6, v2

    .line 243
    int-to-float v2, v6

    .line 244
    div-float/2addr v2, v1

    .line 245
    invoke-static {v2, v5, v4}, La/l1e0;->c(FFF)F

    .line 246
    .line 247
    .line 248
    move-result v2

    .line 249
    goto :goto_0

    .line 250
    :cond_2
    move v2, v5

    .line 251
    :goto_0
    if-eqz v3, :cond_3

    .line 252
    .line 253
    iget v6, v3, La/ncz;->p:I

    .line 254
    .line 255
    iget v3, v3, La/ncz;->q:I

    .line 256
    .line 257
    add-int/2addr v6, v3

    .line 258
    iget v0, v0, La/mcz;->n:I

    .line 259
    .line 260
    sub-int/2addr v6, v0

    .line 261
    int-to-float v0, v6

    .line 262
    div-float/2addr v0, v1

    .line 263
    invoke-static {v0, v5, v4}, La/l1e0;->c(FFF)F

    .line 264
    .line 265
    .line 266
    move-result v5

    .line 267
    :cond_3
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    new-instance v2, Lkotlin/Pair;

    .line 276
    .line 277
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    return-object v2

    .line 281
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 282
    .line 283
    check-cast v3, La/hdv0;

    .line 284
    .line 285
    iget-object v1, v3, La/hdv0;->c:La/fdv0;

    .line 286
    .line 287
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 291
    .line 292
    return-object v0

    .line 293
    :pswitch_7
    check-cast v0, La/xrs;

    .line 294
    .line 295
    check-cast v3, La/vzg0;

    .line 296
    .line 297
    new-instance v4, La/txu0;

    .line 298
    .line 299
    iget-boolean v5, v0, La/xrs;->c:Z

    .line 300
    .line 301
    const-string v0, "SUM_TEXT_STATE"

    .line 302
    .line 303
    invoke-virtual {v3, v0}, La/vzg0;->a(Ljava/lang/String;)Ljava/lang/Object;

    .line 304
    .line 305
    .line 306
    move-result-object v0

    .line 307
    check-cast v0, Ljava/lang/String;

    .line 308
    .line 309
    if-nez v0, :cond_4

    .line 310
    .line 311
    const-string v0, ""

    .line 312
    .line 313
    :cond_4
    move-object v6, v0

    .line 314
    new-instance v7, La/axu0;

    .line 315
    .line 316
    const-string v14, ""

    .line 317
    .line 318
    const-wide/16 v15, 0x0

    .line 319
    .line 320
    const/4 v8, 0x0

    .line 321
    const-wide/16 v9, 0x0

    .line 322
    .line 323
    const-string v11, ""

    .line 324
    .line 325
    const-wide/16 v12, 0x0

    .line 326
    .line 327
    invoke-direct/range {v7 .. v16}, La/axu0;-><init>(ZDLjava/lang/String;DLjava/lang/String;D)V

    .line 328
    .line 329
    .line 330
    new-instance v9, La/fwu0;

    .line 331
    .line 332
    sget-object v0, La/gwu0;->a:La/gwu0;

    .line 333
    .line 334
    sget-object v1, La/hwu0;->a:La/hwu0;

    .line 335
    .line 336
    invoke-direct {v9, v0, v1, v2}, La/fwu0;-><init>(La/gwu0;La/hwu0;Z)V

    .line 337
    .line 338
    .line 339
    const/4 v12, 0x0

    .line 340
    const-wide/16 v13, 0x0

    .line 341
    .line 342
    move-object v8, v7

    .line 343
    const/4 v7, 0x1

    .line 344
    const/4 v10, 0x0

    .line 345
    const/4 v11, 0x0

    .line 346
    invoke-direct/range {v4 .. v14}, La/txu0;-><init>(ZLjava/lang/String;ZLa/axu0;La/fwu0;La/dxu0;ZZD)V

    .line 347
    .line 348
    .line 349
    return-object v4

    .line 350
    :pswitch_8
    check-cast v0, La/gfg;

    .line 351
    .line 352
    iget-object v1, v0, La/gfg;->f:La/n0o0;

    .line 353
    .line 354
    iget-object v2, v0, La/gfg;->e:La/n0o0;

    .line 355
    .line 356
    check-cast v3, La/upu0;

    .line 357
    .line 358
    iget-object v0, v0, La/gfg;->d:La/n0o0;

    .line 359
    .line 360
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    check-cast v4, La/fee;

    .line 365
    .line 366
    iget-object v3, v3, La/upu0;->c:La/j0g0;

    .line 367
    .line 368
    const/4 v5, 0x0

    .line 369
    if-eqz v3, :cond_7

    .line 370
    .line 371
    iget-object v6, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 372
    .line 373
    instance-of v7, v6, La/g0g0;

    .line 374
    .line 375
    if-eqz v7, :cond_5

    .line 376
    .line 377
    move-object v6, v5

    .line 378
    :cond_5
    check-cast v6, La/fqu0;

    .line 379
    .line 380
    if-eqz v6, :cond_7

    .line 381
    .line 382
    iget-object v6, v6, La/fqu0;->c:La/j0g0;

    .line 383
    .line 384
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 385
    .line 386
    instance-of v7, v6, La/g0g0;

    .line 387
    .line 388
    if-eqz v7, :cond_6

    .line 389
    .line 390
    move-object v6, v5

    .line 391
    :cond_6
    check-cast v6, Ljava/util/List;

    .line 392
    .line 393
    goto :goto_1

    .line 394
    :cond_7
    move-object v6, v5

    .line 395
    :goto_1
    if-nez v6, :cond_8

    .line 396
    .line 397
    sget-object v6, La/iun;->a:La/iun;

    .line 398
    .line 399
    :cond_8
    invoke-virtual {v4, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    move-result-object v4

    .line 406
    check-cast v4, La/fee;

    .line 407
    .line 408
    if-eqz v3, :cond_b

    .line 409
    .line 410
    iget-object v6, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 411
    .line 412
    instance-of v7, v6, La/g0g0;

    .line 413
    .line 414
    if-eqz v7, :cond_9

    .line 415
    .line 416
    move-object v6, v5

    .line 417
    :cond_9
    check-cast v6, La/fqu0;

    .line 418
    .line 419
    if-eqz v6, :cond_b

    .line 420
    .line 421
    iget-object v6, v6, La/fqu0;->a:La/j0g0;

    .line 422
    .line 423
    iget-object v6, v6, La/j0g0;->a:Ljava/lang/Object;

    .line 424
    .line 425
    instance-of v7, v6, La/g0g0;

    .line 426
    .line 427
    if-eqz v7, :cond_a

    .line 428
    .line 429
    move-object v6, v5

    .line 430
    :cond_a
    check-cast v6, Ljava/util/List;

    .line 431
    .line 432
    if-nez v6, :cond_c

    .line 433
    .line 434
    :cond_b
    sget-object v6, La/iun;->a:La/iun;

    .line 435
    .line 436
    :cond_c
    invoke-virtual {v4, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v4

    .line 443
    check-cast v4, La/fee;

    .line 444
    .line 445
    if-eqz v3, :cond_f

    .line 446
    .line 447
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 448
    .line 449
    instance-of v6, v3, La/g0g0;

    .line 450
    .line 451
    if-eqz v6, :cond_d

    .line 452
    .line 453
    move-object v3, v5

    .line 454
    :cond_d
    check-cast v3, La/fqu0;

    .line 455
    .line 456
    if-eqz v3, :cond_f

    .line 457
    .line 458
    iget-object v3, v3, La/fqu0;->b:La/j0g0;

    .line 459
    .line 460
    iget-object v3, v3, La/j0g0;->a:Ljava/lang/Object;

    .line 461
    .line 462
    instance-of v6, v3, La/g0g0;

    .line 463
    .line 464
    if-eqz v6, :cond_e

    .line 465
    .line 466
    goto :goto_2

    .line 467
    :cond_e
    move-object v5, v3

    .line 468
    :goto_2
    check-cast v5, Ljava/util/List;

    .line 469
    .line 470
    if-nez v5, :cond_10

    .line 471
    .line 472
    :cond_f
    sget-object v5, La/iun;->a:La/iun;

    .line 473
    .line 474
    :cond_10
    invoke-virtual {v4, v5}, La/fee;->d(Ljava/lang/Object;)V

    .line 475
    .line 476
    .line 477
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    check-cast v2, La/fee;

    .line 486
    .line 487
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v2

    .line 491
    check-cast v2, Ljava/util/Collection;

    .line 492
    .line 493
    invoke-virtual {v3, v2}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 494
    .line 495
    .line 496
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    check-cast v0, La/fee;

    .line 501
    .line 502
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v0

    .line 506
    check-cast v0, Ljava/util/Collection;

    .line 507
    .line 508
    invoke-virtual {v3, v0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v0

    .line 515
    check-cast v0, La/fee;

    .line 516
    .line 517
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 518
    .line 519
    .line 520
    move-result-object v0

    .line 521
    check-cast v0, Ljava/util/Collection;

    .line 522
    .line 523
    invoke-static {v3, v0, v3}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    return-object v0

    .line 528
    :pswitch_9
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 529
    .line 530
    check-cast v3, La/pnu0;

    .line 531
    .line 532
    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 533
    .line 534
    .line 535
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 536
    .line 537
    return-object v0

    .line 538
    :pswitch_a
    check-cast v0, La/glz;

    .line 539
    .line 540
    check-cast v3, La/g02;

    .line 541
    .line 542
    invoke-virtual {v0, v3}, La/glz;->f(La/blz;)V

    .line 543
    .line 544
    .line 545
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object v0

    .line 548
    :pswitch_b
    check-cast v0, La/x1;

    .line 549
    .line 550
    check-cast v3, La/j14;

    .line 551
    .line 552
    invoke-virtual {v0, v3}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 553
    .line 554
    .line 555
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 556
    .line 557
    return-object v0

    .line 558
    nop

    .line 559
    :pswitch_data_0
    .packed-switch 0x0
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
