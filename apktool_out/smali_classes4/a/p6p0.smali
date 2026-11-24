.class public final La/p6p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Ljava/util/List;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/p6p0;->a:B

    iput-object p1, p0, La/p6p0;->b:Ljava/util/List;

    iput-object p2, p0, La/p6p0;->c:Lkotlin/jvm/functions/Function0;

    iput-object p3, p0, La/p6p0;->d:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/p6p0;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/p6p0;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    iget-object v3, v0, La/p6p0;->b:Ljava/util/List;

    .line 8
    .line 9
    const/16 v4, 0x92

    .line 10
    .line 11
    const/16 v5, 0x10

    .line 12
    .line 13
    const/16 v6, 0x20

    .line 14
    .line 15
    const/4 v7, 0x4

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v9, 0x1

    .line 18
    const/4 v10, 0x2

    .line 19
    const/16 v11, 0x30

    .line 20
    .line 21
    iget-object v12, v0, La/p6p0;->c:Lkotlin/jvm/functions/Function0;

    .line 22
    .line 23
    packed-switch v1, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    move-object/from16 v0, p1

    .line 27
    .line 28
    check-cast v0, La/g9z;

    .line 29
    .line 30
    move-object/from16 v1, p2

    .line 31
    .line 32
    check-cast v1, Ljava/lang/Number;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    move-object/from16 v13, p3

    .line 39
    .line 40
    check-cast v13, La/fet;

    .line 41
    .line 42
    move-object/from16 v14, p4

    .line 43
    .line 44
    check-cast v14, Ljava/lang/Number;

    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Number;->intValue()I

    .line 47
    .line 48
    .line 49
    move-result v14

    .line 50
    and-int/lit8 v15, v14, 0x6

    .line 51
    .line 52
    if-nez v15, :cond_1

    .line 53
    .line 54
    invoke-virtual {v13, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move v7, v10

    .line 62
    :goto_0
    or-int v0, v14, v7

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v0, v14

    .line 66
    :goto_1
    and-int/lit8 v7, v14, 0x30

    .line 67
    .line 68
    if-nez v7, :cond_3

    .line 69
    .line 70
    invoke-virtual {v13, v1}, La/fet;->e(I)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_2

    .line 75
    .line 76
    move v5, v6

    .line 77
    :cond_2
    or-int/2addr v0, v5

    .line 78
    :cond_3
    and-int/lit16 v5, v0, 0x93

    .line 79
    .line 80
    if-eq v5, v4, :cond_4

    .line 81
    .line 82
    move v4, v9

    .line 83
    goto :goto_2

    .line 84
    :cond_4
    move v4, v8

    .line 85
    :goto_2
    and-int/2addr v0, v9

    .line 86
    invoke-virtual {v13, v0, v4}, La/fet;->U(IZ)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-eqz v0, :cond_9

    .line 91
    .line 92
    invoke-interface {v3, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    check-cast v0, La/p6t0;

    .line 97
    .line 98
    const v3, 0x474db4b7

    .line 99
    .line 100
    .line 101
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 102
    .line 103
    .line 104
    if-nez v0, :cond_5

    .line 105
    .line 106
    move-object v1, v13

    .line 107
    goto :goto_4

    .line 108
    :cond_5
    instance-of v3, v0, La/wks0;

    .line 109
    .line 110
    if-eqz v3, :cond_7

    .line 111
    .line 112
    const v3, 0x474ecb97

    .line 113
    .line 114
    .line 115
    invoke-virtual {v13, v3}, La/fet;->e0(I)V

    .line 116
    .line 117
    .line 118
    if-eqz v1, :cond_6

    .line 119
    .line 120
    const v1, 0x474fe9db

    .line 121
    .line 122
    .line 123
    invoke-virtual {v13, v1}, La/fet;->e0(I)V

    .line 124
    .line 125
    .line 126
    sget-object v1, La/jm40;->b:La/jm40;

    .line 127
    .line 128
    const/high16 v3, 0x3f800000    # 1.0f

    .line 129
    .line 130
    invoke-static {v1, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    sget-object v3, La/qmk;->a:La/zcl;

    .line 135
    .line 136
    const/high16 v3, 0x41400000    # 12.0f

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    invoke-static {v1, v3, v4, v10}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 140
    .line 141
    .line 142
    move-result-object v14

    .line 143
    const/16 v17, 0x6

    .line 144
    .line 145
    const/16 v18, 0x4

    .line 146
    .line 147
    move-object/from16 v16, v13

    .line 148
    .line 149
    sget-object v13, La/zfi0;->a:La/zfi0;

    .line 150
    .line 151
    const/4 v15, 0x0

    .line 152
    invoke-static/range {v13 .. v18}, La/mbc;->o(La/bgi0;La/mm40;ZLa/fet;II)V

    .line 153
    .line 154
    .line 155
    move-object/from16 v1, v16

    .line 156
    .line 157
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 158
    .line 159
    .line 160
    goto :goto_3

    .line 161
    :cond_6
    move-object v1, v13

    .line 162
    const v3, 0x47555eac

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v3}, La/fet;->e0(I)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 169
    .line 170
    .line 171
    :goto_3
    check-cast v0, La/wks0;

    .line 172
    .line 173
    const/16 v3, 0x1b0

    .line 174
    .line 175
    invoke-static {v0, v12, v2, v1, v3}, La/yqm0;->e(La/wks0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_7
    move-object v1, v13

    .line 183
    instance-of v2, v0, La/yks0;

    .line 184
    .line 185
    if-eqz v2, :cond_8

    .line 186
    .line 187
    const v2, 0x475b974c

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 191
    .line 192
    .line 193
    check-cast v0, La/yks0;

    .line 194
    .line 195
    invoke-static {v0, v12, v1, v11}, La/msm0;->d(La/yks0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 199
    .line 200
    .line 201
    goto :goto_5

    .line 202
    :cond_8
    :goto_4
    const v0, 0x475fe7ea

    .line 203
    .line 204
    .line 205
    invoke-virtual {v1, v0}, La/fet;->e0(I)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 209
    .line 210
    .line 211
    :goto_5
    invoke-virtual {v1, v8}, La/fet;->r(Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_6

    .line 215
    :cond_9
    move-object v1, v13

    .line 216
    invoke-virtual {v1}, La/fet;->X()V

    .line 217
    .line 218
    .line 219
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object v0

    .line 222
    :pswitch_0
    move-object/from16 v1, p1

    .line 223
    .line 224
    check-cast v1, La/g9z;

    .line 225
    .line 226
    move-object/from16 v13, p2

    .line 227
    .line 228
    check-cast v13, Ljava/lang/Number;

    .line 229
    .line 230
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 231
    .line 232
    .line 233
    move-result v13

    .line 234
    move-object/from16 v14, p3

    .line 235
    .line 236
    check-cast v14, La/fet;

    .line 237
    .line 238
    move-object/from16 v15, p4

    .line 239
    .line 240
    check-cast v15, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    .line 243
    .line 244
    .line 245
    move-result v15

    .line 246
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    and-int/lit8 v16, v15, 0x6

    .line 250
    .line 251
    if-nez v16, :cond_b

    .line 252
    .line 253
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_a

    .line 258
    .line 259
    goto :goto_7

    .line 260
    :cond_a
    move v7, v10

    .line 261
    :goto_7
    or-int v1, v15, v7

    .line 262
    .line 263
    goto :goto_8

    .line 264
    :cond_b
    move v1, v15

    .line 265
    :goto_8
    and-int/lit8 v7, v15, 0x30

    .line 266
    .line 267
    if-nez v7, :cond_d

    .line 268
    .line 269
    invoke-virtual {v14, v13}, La/fet;->e(I)Z

    .line 270
    .line 271
    .line 272
    move-result v7

    .line 273
    if-eqz v7, :cond_c

    .line 274
    .line 275
    move v5, v6

    .line 276
    :cond_c
    or-int/2addr v1, v5

    .line 277
    :cond_d
    and-int/lit16 v5, v1, 0x93

    .line 278
    .line 279
    if-eq v5, v4, :cond_e

    .line 280
    .line 281
    move v4, v9

    .line 282
    goto :goto_9

    .line 283
    :cond_e
    move v4, v8

    .line 284
    :goto_9
    and-int/2addr v1, v9

    .line 285
    invoke-virtual {v14, v1, v4}, La/fet;->U(IZ)Z

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    if-eqz v1, :cond_15

    .line 290
    .line 291
    invoke-interface {v3, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v1

    .line 295
    check-cast v1, La/s6p0;

    .line 296
    .line 297
    const v3, -0x617f962d

    .line 298
    .line 299
    .line 300
    invoke-virtual {v14, v3}, La/fet;->e0(I)V

    .line 301
    .line 302
    .line 303
    if-eqz v1, :cond_14

    .line 304
    .line 305
    instance-of v3, v1, La/q6p0;

    .line 306
    .line 307
    sget-object v15, La/jm40;->b:La/jm40;

    .line 308
    .line 309
    sget-object v4, La/ukd;->a:La/cl5;

    .line 310
    .line 311
    if-eqz v3, :cond_11

    .line 312
    .line 313
    const v2, -0x617e7d3e

    .line 314
    .line 315
    .line 316
    invoke-virtual {v14, v2}, La/fet;->e0(I)V

    .line 317
    .line 318
    .line 319
    invoke-virtual {v14, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 320
    .line 321
    .line 322
    move-result v2

    .line 323
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 324
    .line 325
    .line 326
    move-result-object v3

    .line 327
    if-nez v2, :cond_f

    .line 328
    .line 329
    if-ne v3, v4, :cond_10

    .line 330
    .line 331
    :cond_f
    new-instance v16, La/cym0;

    .line 332
    .line 333
    const/16 v22, 0x0

    .line 334
    .line 335
    const/16 v23, 0x9

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    iget-object v0, v0, La/p6p0;->c:Lkotlin/jvm/functions/Function0;

    .line 340
    .line 341
    const-class v19, Lkotlin/jvm/functions/Function0;

    .line 342
    .line 343
    const-string v20, "invoke"

    .line 344
    .line 345
    const-string v21, "invoke()Ljava/lang/Object;"

    .line 346
    .line 347
    move-object/from16 v18, v0

    .line 348
    .line 349
    invoke-direct/range {v16 .. v23}, La/cym0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 350
    .line 351
    .line 352
    move-object/from16 v3, v16

    .line 353
    .line 354
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_10
    check-cast v3, La/jhy;

    .line 358
    .line 359
    move-object/from16 v20, v3

    .line 360
    .line 361
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 362
    .line 363
    const/16 v21, 0x1c

    .line 364
    .line 365
    const/16 v16, 0x0

    .line 366
    .line 367
    const/16 v17, 0x0

    .line 368
    .line 369
    const/16 v18, 0x0

    .line 370
    .line 371
    const/16 v19, 0x0

    .line 372
    .line 373
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    check-cast v1, La/q6p0;

    .line 378
    .line 379
    invoke-static {v0, v1, v14, v8}, La/mbc;->w(La/mm40;La/q6p0;La/fet;I)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 383
    .line 384
    .line 385
    goto :goto_a

    .line 386
    :cond_11
    instance-of v0, v1, La/r6p0;

    .line 387
    .line 388
    if-eqz v0, :cond_14

    .line 389
    .line 390
    const v0, -0x61785d33

    .line 391
    .line 392
    .line 393
    invoke-virtual {v14, v0}, La/fet;->e0(I)V

    .line 394
    .line 395
    .line 396
    invoke-virtual {v14, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 397
    .line 398
    .line 399
    move-result v0

    .line 400
    invoke-virtual {v14, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v3

    .line 404
    or-int/2addr v0, v3

    .line 405
    invoke-virtual {v14}, La/fet;->P()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v3

    .line 409
    if-nez v0, :cond_12

    .line 410
    .line 411
    if-ne v3, v4, :cond_13

    .line 412
    .line 413
    :cond_12
    new-instance v3, La/ywm0;

    .line 414
    .line 415
    const/16 v0, 0x9

    .line 416
    .line 417
    invoke-direct {v3, v2, v1, v0}, La/ywm0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v14, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 421
    .line 422
    .line 423
    :cond_13
    move-object/from16 v20, v3

    .line 424
    .line 425
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 426
    .line 427
    const/16 v21, 0x1c

    .line 428
    .line 429
    const/16 v16, 0x0

    .line 430
    .line 431
    const/16 v17, 0x0

    .line 432
    .line 433
    const/16 v18, 0x0

    .line 434
    .line 435
    const/16 v19, 0x0

    .line 436
    .line 437
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 438
    .line 439
    .line 440
    move-result-object v0

    .line 441
    check-cast v1, La/r6p0;

    .line 442
    .line 443
    invoke-static {v0, v1, v14, v8}, La/u4n0;->f(La/mm40;La/r6p0;La/fet;I)V

    .line 444
    .line 445
    .line 446
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 447
    .line 448
    .line 449
    :goto_a
    invoke-virtual {v14, v8}, La/fet;->r(Z)V

    .line 450
    .line 451
    .line 452
    goto :goto_b

    .line 453
    :cond_14
    const v0, 0x1de31c30

    .line 454
    .line 455
    .line 456
    invoke-static {v0, v14, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    throw v0

    .line 461
    :cond_15
    invoke-virtual {v14}, La/fet;->X()V

    .line 462
    .line 463
    .line 464
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 465
    .line 466
    return-object v0

    .line 467
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
