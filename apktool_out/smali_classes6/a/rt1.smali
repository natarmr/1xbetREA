.class public final synthetic La/rt1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/l7m0;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/xcz;

.field public final synthetic e:La/d9z;

.field public final synthetic f:La/xcz;

.field public final synthetic g:La/xcz;


# direct methods
.method public synthetic constructor <init>(BLa/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/rt1;->a:B

    iput-object p6, p0, La/rt1;->b:La/l7m0;

    iput-object p7, p0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/rt1;->d:La/xcz;

    iput-object p2, p0, La/rt1;->e:La/d9z;

    iput-object p4, p0, La/rt1;->f:La/xcz;

    iput-object p5, p0, La/rt1;->g:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/rt1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p5, p0, La/rt1;->b:La/l7m0;

    iput-object p6, p0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/rt1;->d:La/xcz;

    iput-object p1, p0, La/rt1;->e:La/d9z;

    iput-object p3, p0, La/rt1;->f:La/xcz;

    iput-object p4, p0, La/rt1;->g:La/xcz;

    return-void
.end method


# virtual methods
.method public final O(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rt1;->a:B

    .line 4
    .line 5
    const/16 v2, 0x410

    .line 6
    .line 7
    const/16 v3, 0x10

    .line 8
    .line 9
    const/16 v4, 0x20

    .line 10
    .line 11
    sget-object v5, La/ukd;->a:La/cl5;

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const/4 v7, 0x1

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/hh80;

    .line 21
    .line 22
    move-object/from16 v9, p2

    .line 23
    .line 24
    check-cast v9, La/l7m0;

    .line 25
    .line 26
    move-object/from16 v8, p3

    .line 27
    .line 28
    check-cast v8, La/l7m0;

    .line 29
    .line 30
    move-object/from16 v13, p4

    .line 31
    .line 32
    check-cast v13, La/fet;

    .line 33
    .line 34
    move-object/from16 v10, p5

    .line 35
    .line 36
    check-cast v10, Ljava/lang/Integer;

    .line 37
    .line 38
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 39
    .line 40
    .line 41
    move-result v10

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    and-int/lit8 v1, v10, 0x30

    .line 52
    .line 53
    if-nez v1, :cond_1

    .line 54
    .line 55
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_0

    .line 60
    .line 61
    move v3, v4

    .line 62
    :cond_0
    or-int/2addr v10, v3

    .line 63
    :cond_1
    and-int/lit16 v1, v10, 0x411

    .line 64
    .line 65
    if-eq v1, v2, :cond_2

    .line 66
    .line 67
    move v6, v7

    .line 68
    :cond_2
    and-int/lit8 v1, v10, 0x1

    .line 69
    .line 70
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    iget-object v1, v0, La/rt1;->b:La/l7m0;

    .line 77
    .line 78
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    check-cast v2, La/ev1;

    .line 83
    .line 84
    invoke-interface {v2}, La/ev1;->e()La/fu1;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    iget-object v2, v2, La/fu1;->e:La/ru1;

    .line 89
    .line 90
    iget-object v3, v0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    .line 91
    .line 92
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v6

    .line 100
    if-nez v4, :cond_3

    .line 101
    .line 102
    if-ne v6, v5, :cond_4

    .line 103
    .line 104
    :cond_3
    new-instance v6, La/h61;

    .line 105
    .line 106
    const/16 v4, 0x19

    .line 107
    .line 108
    invoke-direct {v6, v3, v4}, La/h61;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    :cond_4
    move-object v11, v6

    .line 115
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 116
    .line 117
    new-instance v14, La/tt1;

    .line 118
    .line 119
    const/4 v15, 0x3

    .line 120
    iget-object v4, v0, La/rt1;->e:La/d9z;

    .line 121
    .line 122
    iget-object v5, v0, La/rt1;->d:La/xcz;

    .line 123
    .line 124
    iget-object v6, v0, La/rt1;->f:La/xcz;

    .line 125
    .line 126
    iget-object v0, v0, La/rt1;->g:La/xcz;

    .line 127
    .line 128
    move-object/from16 v19, v0

    .line 129
    .line 130
    move-object/from16 v20, v1

    .line 131
    .line 132
    move-object/from16 v21, v3

    .line 133
    .line 134
    move-object/from16 v16, v4

    .line 135
    .line 136
    move-object/from16 v17, v5

    .line 137
    .line 138
    move-object/from16 v18, v6

    .line 139
    .line 140
    invoke-direct/range {v14 .. v21}, La/tt1;-><init>(BLa/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 141
    .line 142
    .line 143
    const v0, -0x6c1da990

    .line 144
    .line 145
    .line 146
    invoke-static {v0, v14, v13}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 147
    .line 148
    .line 149
    move-result-object v12

    .line 150
    and-int/lit8 v0, v10, 0x70

    .line 151
    .line 152
    or-int/lit16 v14, v0, 0x6000

    .line 153
    .line 154
    const/4 v8, 0x0

    .line 155
    move-object v10, v2

    .line 156
    invoke-static/range {v8 .. v14}, La/oja0;->a(La/mm40;La/l7m0;La/ru1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 157
    .line 158
    .line 159
    goto :goto_0

    .line 160
    :cond_5
    invoke-virtual {v13}, La/fet;->X()V

    .line 161
    .line 162
    .line 163
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 164
    .line 165
    return-object v0

    .line 166
    :pswitch_0
    move-object/from16 v1, p1

    .line 167
    .line 168
    check-cast v1, La/hh80;

    .line 169
    .line 170
    move-object/from16 v9, p2

    .line 171
    .line 172
    check-cast v9, La/l7m0;

    .line 173
    .line 174
    move-object/from16 v8, p3

    .line 175
    .line 176
    check-cast v8, La/l7m0;

    .line 177
    .line 178
    move-object/from16 v13, p4

    .line 179
    .line 180
    check-cast v13, La/fet;

    .line 181
    .line 182
    move-object/from16 v10, p5

    .line 183
    .line 184
    check-cast v10, Ljava/lang/Integer;

    .line 185
    .line 186
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v10

    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    and-int/lit8 v1, v10, 0x30

    .line 200
    .line 201
    if-nez v1, :cond_7

    .line 202
    .line 203
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 204
    .line 205
    .line 206
    move-result v1

    .line 207
    if-eqz v1, :cond_6

    .line 208
    .line 209
    move v3, v4

    .line 210
    :cond_6
    or-int/2addr v10, v3

    .line 211
    :cond_7
    and-int/lit16 v1, v10, 0x411

    .line 212
    .line 213
    if-eq v1, v2, :cond_8

    .line 214
    .line 215
    move v6, v7

    .line 216
    :cond_8
    and-int/lit8 v1, v10, 0x1

    .line 217
    .line 218
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    if-eqz v1, :cond_b

    .line 223
    .line 224
    iget-object v1, v0, La/rt1;->b:La/l7m0;

    .line 225
    .line 226
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, La/ev1;

    .line 231
    .line 232
    invoke-interface {v2}, La/ev1;->e()La/fu1;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    iget-object v3, v0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    .line 237
    .line 238
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move-result v4

    .line 242
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v6

    .line 246
    if-nez v4, :cond_9

    .line 247
    .line 248
    if-ne v6, v5, :cond_a

    .line 249
    .line 250
    :cond_9
    new-instance v6, La/h61;

    .line 251
    .line 252
    const/16 v4, 0x18

    .line 253
    .line 254
    invoke-direct {v6, v3, v4}, La/h61;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 258
    .line 259
    .line 260
    :cond_a
    move-object v11, v6

    .line 261
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 262
    .line 263
    new-instance v14, La/tt1;

    .line 264
    .line 265
    const/4 v15, 0x2

    .line 266
    iget-object v4, v0, La/rt1;->e:La/d9z;

    .line 267
    .line 268
    iget-object v5, v0, La/rt1;->d:La/xcz;

    .line 269
    .line 270
    iget-object v6, v0, La/rt1;->f:La/xcz;

    .line 271
    .line 272
    iget-object v0, v0, La/rt1;->g:La/xcz;

    .line 273
    .line 274
    move-object/from16 v19, v0

    .line 275
    .line 276
    move-object/from16 v20, v1

    .line 277
    .line 278
    move-object/from16 v21, v3

    .line 279
    .line 280
    move-object/from16 v16, v4

    .line 281
    .line 282
    move-object/from16 v17, v5

    .line 283
    .line 284
    move-object/from16 v18, v6

    .line 285
    .line 286
    invoke-direct/range {v14 .. v21}, La/tt1;-><init>(BLa/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 287
    .line 288
    .line 289
    const v0, -0x61810335

    .line 290
    .line 291
    .line 292
    invoke-static {v0, v14, v13}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 293
    .line 294
    .line 295
    move-result-object v12

    .line 296
    and-int/lit8 v0, v10, 0x70

    .line 297
    .line 298
    or-int/lit16 v14, v0, 0x6000

    .line 299
    .line 300
    const/4 v8, 0x0

    .line 301
    move-object v10, v2

    .line 302
    invoke-static/range {v8 .. v14}, La/ffb0;->a(La/mm40;La/l7m0;La/fu1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 303
    .line 304
    .line 305
    goto :goto_1

    .line 306
    :cond_b
    invoke-virtual {v13}, La/fet;->X()V

    .line 307
    .line 308
    .line 309
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_1
    move-object/from16 v1, p1

    .line 313
    .line 314
    check-cast v1, La/hh80;

    .line 315
    .line 316
    move-object/from16 v9, p2

    .line 317
    .line 318
    check-cast v9, La/l7m0;

    .line 319
    .line 320
    move-object/from16 v8, p3

    .line 321
    .line 322
    check-cast v8, La/l7m0;

    .line 323
    .line 324
    move-object/from16 v13, p4

    .line 325
    .line 326
    check-cast v13, La/fet;

    .line 327
    .line 328
    move-object/from16 v10, p5

    .line 329
    .line 330
    check-cast v10, Ljava/lang/Integer;

    .line 331
    .line 332
    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    .line 333
    .line 334
    .line 335
    move-result v10

    .line 336
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 343
    .line 344
    .line 345
    and-int/lit8 v1, v10, 0x30

    .line 346
    .line 347
    if-nez v1, :cond_d

    .line 348
    .line 349
    invoke-virtual {v13, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-eqz v1, :cond_c

    .line 354
    .line 355
    move v3, v4

    .line 356
    :cond_c
    or-int/2addr v10, v3

    .line 357
    :cond_d
    and-int/lit16 v1, v10, 0x411

    .line 358
    .line 359
    if-eq v1, v2, :cond_e

    .line 360
    .line 361
    move v6, v7

    .line 362
    :cond_e
    and-int/lit8 v1, v10, 0x1

    .line 363
    .line 364
    invoke-virtual {v13, v1, v6}, La/fet;->U(IZ)Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_11

    .line 369
    .line 370
    iget-object v1, v0, La/rt1;->b:La/l7m0;

    .line 371
    .line 372
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    check-cast v2, La/ev1;

    .line 377
    .line 378
    invoke-interface {v2}, La/ev1;->e()La/fu1;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    iget-object v3, v0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    .line 383
    .line 384
    invoke-virtual {v13, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 385
    .line 386
    .line 387
    move-result v4

    .line 388
    invoke-virtual {v13}, La/fet;->P()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    if-nez v4, :cond_f

    .line 393
    .line 394
    if-ne v6, v5, :cond_10

    .line 395
    .line 396
    :cond_f
    new-instance v6, La/h61;

    .line 397
    .line 398
    const/16 v4, 0x17

    .line 399
    .line 400
    invoke-direct {v6, v3, v4}, La/h61;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v13, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 404
    .line 405
    .line 406
    :cond_10
    move-object v11, v6

    .line 407
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 408
    .line 409
    new-instance v14, La/tt1;

    .line 410
    .line 411
    const/4 v15, 0x1

    .line 412
    iget-object v4, v0, La/rt1;->e:La/d9z;

    .line 413
    .line 414
    iget-object v5, v0, La/rt1;->d:La/xcz;

    .line 415
    .line 416
    iget-object v6, v0, La/rt1;->f:La/xcz;

    .line 417
    .line 418
    iget-object v0, v0, La/rt1;->g:La/xcz;

    .line 419
    .line 420
    move-object/from16 v19, v0

    .line 421
    .line 422
    move-object/from16 v20, v1

    .line 423
    .line 424
    move-object/from16 v21, v3

    .line 425
    .line 426
    move-object/from16 v16, v4

    .line 427
    .line 428
    move-object/from16 v17, v5

    .line 429
    .line 430
    move-object/from16 v18, v6

    .line 431
    .line 432
    invoke-direct/range {v14 .. v21}, La/tt1;-><init>(BLa/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 433
    .line 434
    .line 435
    const v0, 0x4bdacab6    # 2.8677484E7f

    .line 436
    .line 437
    .line 438
    invoke-static {v0, v14, v13}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 439
    .line 440
    .line 441
    move-result-object v12

    .line 442
    and-int/lit8 v0, v10, 0x70

    .line 443
    .line 444
    or-int/lit16 v14, v0, 0x6000

    .line 445
    .line 446
    const/4 v8, 0x0

    .line 447
    move-object v10, v2

    .line 448
    invoke-static/range {v8 .. v14}, La/nia0;->e(La/mm40;La/l7m0;La/fu1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 449
    .line 450
    .line 451
    goto :goto_2

    .line 452
    :cond_11
    invoke-virtual {v13}, La/fet;->X()V

    .line 453
    .line 454
    .line 455
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 456
    .line 457
    return-object v0

    .line 458
    :pswitch_2
    move-object/from16 v1, p1

    .line 459
    .line 460
    check-cast v1, La/hh80;

    .line 461
    .line 462
    move-object/from16 v2, p2

    .line 463
    .line 464
    check-cast v2, La/l7m0;

    .line 465
    .line 466
    move-object/from16 v3, p3

    .line 467
    .line 468
    check-cast v3, La/l7m0;

    .line 469
    .line 470
    move-object/from16 v4, p4

    .line 471
    .line 472
    check-cast v4, La/fet;

    .line 473
    .line 474
    move-object/from16 v8, p5

    .line 475
    .line 476
    check-cast v8, Ljava/lang/Integer;

    .line 477
    .line 478
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    .line 479
    .line 480
    .line 481
    move-result v8

    .line 482
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    and-int/lit16 v1, v8, 0x401

    .line 492
    .line 493
    const/16 v2, 0x400

    .line 494
    .line 495
    if-eq v1, v2, :cond_12

    .line 496
    .line 497
    move v6, v7

    .line 498
    :cond_12
    and-int/lit8 v1, v8, 0x1

    .line 499
    .line 500
    invoke-virtual {v4, v1, v6}, La/fet;->U(IZ)Z

    .line 501
    .line 502
    .line 503
    move-result v1

    .line 504
    if-eqz v1, :cond_15

    .line 505
    .line 506
    iget-object v11, v0, La/rt1;->b:La/l7m0;

    .line 507
    .line 508
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 509
    .line 510
    .line 511
    move-result-object v1

    .line 512
    check-cast v1, La/ev1;

    .line 513
    .line 514
    invoke-interface {v1}, La/ev1;->e()La/fu1;

    .line 515
    .line 516
    .line 517
    move-result-object v1

    .line 518
    iget-object v12, v0, La/rt1;->c:Lkotlin/jvm/functions/Function1;

    .line 519
    .line 520
    invoke-virtual {v4, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v2

    .line 524
    invoke-virtual {v4}, La/fet;->P()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v3

    .line 528
    if-nez v2, :cond_13

    .line 529
    .line 530
    if-ne v3, v5, :cond_14

    .line 531
    .line 532
    :cond_13
    new-instance v3, La/h61;

    .line 533
    .line 534
    const/16 v2, 0x13

    .line 535
    .line 536
    invoke-direct {v3, v12, v2}, La/h61;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v4, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    :cond_14
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 543
    .line 544
    new-instance v6, La/tt1;

    .line 545
    .line 546
    iget-object v7, v0, La/rt1;->e:La/d9z;

    .line 547
    .line 548
    iget-object v8, v0, La/rt1;->d:La/xcz;

    .line 549
    .line 550
    iget-object v9, v0, La/rt1;->f:La/xcz;

    .line 551
    .line 552
    iget-object v10, v0, La/rt1;->g:La/xcz;

    .line 553
    .line 554
    invoke-direct/range {v6 .. v12}, La/tt1;-><init>(La/d9z;La/xcz;La/xcz;La/xcz;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 555
    .line 556
    .line 557
    const v0, 0x198577d

    .line 558
    .line 559
    .line 560
    invoke-static {v0, v6, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const/16 v2, 0xc00

    .line 565
    .line 566
    const/4 v5, 0x0

    .line 567
    move-object/from16 p3, v0

    .line 568
    .line 569
    move-object/from16 p1, v1

    .line 570
    .line 571
    move/from16 p5, v2

    .line 572
    .line 573
    move-object/from16 p2, v3

    .line 574
    .line 575
    move-object/from16 p4, v4

    .line 576
    .line 577
    move-object/from16 p0, v5

    .line 578
    .line 579
    invoke-static/range {p0 .. p5}, La/ju70;->d(La/mm40;La/fu1;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 580
    .line 581
    .line 582
    goto :goto_3

    .line 583
    :cond_15
    move-object v0, v4

    .line 584
    invoke-virtual {v0}, La/fet;->X()V

    .line 585
    .line 586
    .line 587
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 588
    .line 589
    return-object v0

    .line 590
    nop

    .line 591
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
