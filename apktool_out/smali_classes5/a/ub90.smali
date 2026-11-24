.class public final La/ub90;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;

.field public final synthetic c:Lkotlin/jvm/functions/Function2;

.field public final synthetic d:F


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;FLkotlin/jvm/functions/Function2;)V
    .locals 1

    .line 1
    const/4 v0, 0x2

    .line 2
    iput-byte v0, p0, La/ub90;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ub90;->b:Ljava/util/List;

    .line 8
    .line 9
    iput p2, p0, La/ub90;->d:F

    .line 10
    .line 11
    iput-object p3, p0, La/ub90;->c:Lkotlin/jvm/functions/Function2;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;La/ugd;FB)V
    .locals 0

    .line 14
    iput-byte p4, p0, La/ub90;->a:B

    iput-object p1, p0, La/ub90;->b:Ljava/util/List;

    iput-object p2, p0, La/ub90;->c:Lkotlin/jvm/functions/Function2;

    iput p3, p0, La/ub90;->d:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ub90;->a:B

    .line 4
    .line 5
    iget v2, v0, La/ub90;->d:F

    .line 6
    .line 7
    iget-object v3, v0, La/ub90;->b:Ljava/util/List;

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
    const/4 v8, 0x2

    .line 17
    iget-object v0, v0, La/ub90;->c:Lkotlin/jvm/functions/Function2;

    .line 18
    .line 19
    const/4 v9, 0x1

    .line 20
    const/4 v10, 0x0

    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    move-object/from16 v1, p1

    .line 25
    .line 26
    check-cast v1, La/g9z;

    .line 27
    .line 28
    move-object/from16 v11, p2

    .line 29
    .line 30
    check-cast v11, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v11

    .line 36
    move-object/from16 v12, p3

    .line 37
    .line 38
    check-cast v12, La/fet;

    .line 39
    .line 40
    move-object/from16 v13, p4

    .line 41
    .line 42
    check-cast v13, Ljava/lang/Number;

    .line 43
    .line 44
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 45
    .line 46
    .line 47
    move-result v13

    .line 48
    and-int/lit8 v14, v13, 0x6

    .line 49
    .line 50
    if-nez v14, :cond_1

    .line 51
    .line 52
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    move v7, v8

    .line 60
    :goto_0
    or-int v1, v13, v7

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    move v1, v13

    .line 64
    :goto_1
    and-int/lit8 v7, v13, 0x30

    .line 65
    .line 66
    if-nez v7, :cond_3

    .line 67
    .line 68
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-eqz v7, :cond_2

    .line 73
    .line 74
    move v5, v6

    .line 75
    :cond_2
    or-int/2addr v1, v5

    .line 76
    :cond_3
    and-int/lit16 v5, v1, 0x93

    .line 77
    .line 78
    if-eq v5, v4, :cond_4

    .line 79
    .line 80
    move v4, v9

    .line 81
    goto :goto_2

    .line 82
    :cond_4
    move v4, v10

    .line 83
    :goto_2
    and-int/2addr v1, v9

    .line 84
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_a

    .line 89
    .line 90
    check-cast v3, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    move-object v15, v1

    .line 97
    check-cast v15, La/mzc0;

    .line 98
    .line 99
    const v1, -0x79c6ccea

    .line 100
    .line 101
    .line 102
    invoke-virtual {v12, v1}, La/fet;->e0(I)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    sget-object v3, La/ukd;->a:La/cl5;

    .line 110
    .line 111
    if-ne v1, v3, :cond_5

    .line 112
    .line 113
    const/4 v1, 0x0

    .line 114
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 115
    .line 116
    .line 117
    move-result-object v1

    .line 118
    invoke-virtual {v12, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    :cond_5
    check-cast v1, La/pz40;

    .line 122
    .line 123
    sget-object v4, La/qmk;->a:La/zcl;

    .line 124
    .line 125
    const/16 v20, 0x0

    .line 126
    .line 127
    const/16 v21, 0xd

    .line 128
    .line 129
    sget-object v16, La/jm40;->b:La/jm40;

    .line 130
    .line 131
    const/16 v17, 0x0

    .line 132
    .line 133
    const/high16 v18, 0x41000000    # 8.0f

    .line 134
    .line 135
    const/16 v19, 0x0

    .line 136
    .line 137
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 138
    .line 139
    .line 140
    move-result-object v4

    .line 141
    invoke-static {v4, v2}, La/o7k0;->s(La/mm40;F)La/mm40;

    .line 142
    .line 143
    .line 144
    move-result-object v16

    .line 145
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    if-ne v2, v3, :cond_6

    .line 150
    .line 151
    invoke-static {v12}, La/dw9;->j(La/fet;)La/gy40;

    .line 152
    .line 153
    .line 154
    move-result-object v2

    .line 155
    :cond_6
    move-object/from16 v17, v2

    .line 156
    .line 157
    check-cast v17, La/gy40;

    .line 158
    .line 159
    invoke-virtual {v12, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v2

    .line 163
    invoke-virtual {v12, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result v4

    .line 167
    or-int/2addr v2, v4

    .line 168
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    if-nez v2, :cond_7

    .line 173
    .line 174
    if-ne v4, v3, :cond_8

    .line 175
    .line 176
    :cond_7
    new-instance v4, La/qzc0;

    .line 177
    .line 178
    invoke-direct {v4, v0, v15, v1, v10}, La/qzc0;-><init>(Lkotlin/jvm/functions/Function2;La/mzc0;La/pz40;B)V

    .line 179
    .line 180
    .line 181
    invoke-virtual {v12, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 182
    .line 183
    .line 184
    :cond_8
    move-object/from16 v21, v4

    .line 185
    .line 186
    check-cast v21, Lkotlin/jvm/functions/Function0;

    .line 187
    .line 188
    const/16 v22, 0x1c

    .line 189
    .line 190
    const/16 v18, 0x0

    .line 191
    .line 192
    const/16 v19, 0x0

    .line 193
    .line 194
    const/16 v20, 0x0

    .line 195
    .line 196
    invoke-static/range {v16 .. v22}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    sget-object v2, La/j1t0;->e:La/zfn;

    .line 201
    .line 202
    invoke-virtual {v12, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v2

    .line 206
    check-cast v2, La/g1t0;

    .line 207
    .line 208
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    invoke-static {}, La/g1t0;->u()La/y9q0;

    .line 212
    .line 213
    .line 214
    move-result-object v13

    .line 215
    sget-object v14, La/d4d;->B:La/d4d;

    .line 216
    .line 217
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-ne v2, v3, :cond_9

    .line 222
    .line 223
    new-instance v2, La/wta;

    .line 224
    .line 225
    invoke-direct {v2, v1, v9}, La/wta;-><init>(La/pz40;B)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v12, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 229
    .line 230
    .line 231
    :cond_9
    move-object/from16 v16, v2

    .line 232
    .line 233
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 234
    .line 235
    const/16 v18, 0x6180

    .line 236
    .line 237
    move-object/from16 v17, v12

    .line 238
    .line 239
    move-object v12, v0

    .line 240
    invoke-static/range {v12 .. v18}, La/n7x;->h(La/mm40;La/y9q0;La/d4d;La/mzc0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 241
    .line 242
    .line 243
    move-object/from16 v0, v17

    .line 244
    .line 245
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 246
    .line 247
    .line 248
    goto :goto_3

    .line 249
    :cond_a
    move-object v0, v12

    .line 250
    invoke-virtual {v0}, La/fet;->X()V

    .line 251
    .line 252
    .line 253
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 254
    .line 255
    return-object v0

    .line 256
    :pswitch_0
    move-object/from16 v1, p1

    .line 257
    .line 258
    check-cast v1, La/g9z;

    .line 259
    .line 260
    move-object/from16 v11, p2

    .line 261
    .line 262
    check-cast v11, Ljava/lang/Number;

    .line 263
    .line 264
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 265
    .line 266
    .line 267
    move-result v11

    .line 268
    move-object/from16 v12, p3

    .line 269
    .line 270
    check-cast v12, La/fet;

    .line 271
    .line 272
    move-object/from16 v13, p4

    .line 273
    .line 274
    check-cast v13, Ljava/lang/Number;

    .line 275
    .line 276
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 277
    .line 278
    .line 279
    move-result v13

    .line 280
    and-int/lit8 v14, v13, 0x6

    .line 281
    .line 282
    if-nez v14, :cond_c

    .line 283
    .line 284
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 285
    .line 286
    .line 287
    move-result v1

    .line 288
    if-eqz v1, :cond_b

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_b
    move v7, v8

    .line 292
    :goto_4
    or-int v1, v13, v7

    .line 293
    .line 294
    goto :goto_5

    .line 295
    :cond_c
    move v1, v13

    .line 296
    :goto_5
    and-int/lit8 v7, v13, 0x30

    .line 297
    .line 298
    if-nez v7, :cond_e

    .line 299
    .line 300
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 301
    .line 302
    .line 303
    move-result v7

    .line 304
    if-eqz v7, :cond_d

    .line 305
    .line 306
    move v5, v6

    .line 307
    :cond_d
    or-int/2addr v1, v5

    .line 308
    :cond_e
    and-int/lit16 v5, v1, 0x93

    .line 309
    .line 310
    if-eq v5, v4, :cond_f

    .line 311
    .line 312
    move v4, v9

    .line 313
    goto :goto_6

    .line 314
    :cond_f
    move v4, v10

    .line 315
    :goto_6
    and-int/2addr v1, v9

    .line 316
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 317
    .line 318
    .line 319
    move-result v1

    .line 320
    if-eqz v1, :cond_10

    .line 321
    .line 322
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    check-cast v1, La/grh;

    .line 327
    .line 328
    const v3, 0x3518961b

    .line 329
    .line 330
    .line 331
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 332
    .line 333
    .line 334
    check-cast v0, La/ugd;

    .line 335
    .line 336
    new-instance v3, La/ycl;

    .line 337
    .line 338
    invoke-direct {v3, v2}, La/ycl;-><init>(F)V

    .line 339
    .line 340
    .line 341
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 342
    .line 343
    .line 344
    move-result-object v2

    .line 345
    invoke-virtual {v0, v1, v3, v12, v2}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 349
    .line 350
    .line 351
    goto :goto_7

    .line 352
    :cond_10
    invoke-virtual {v12}, La/fet;->X()V

    .line 353
    .line 354
    .line 355
    :goto_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 356
    .line 357
    return-object v0

    .line 358
    :pswitch_1
    move-object/from16 v1, p1

    .line 359
    .line 360
    check-cast v1, La/g9z;

    .line 361
    .line 362
    move-object/from16 v11, p2

    .line 363
    .line 364
    check-cast v11, Ljava/lang/Number;

    .line 365
    .line 366
    invoke-virtual {v11}, Ljava/lang/Number;->intValue()I

    .line 367
    .line 368
    .line 369
    move-result v11

    .line 370
    move-object/from16 v12, p3

    .line 371
    .line 372
    check-cast v12, La/fet;

    .line 373
    .line 374
    move-object/from16 v13, p4

    .line 375
    .line 376
    check-cast v13, Ljava/lang/Number;

    .line 377
    .line 378
    invoke-virtual {v13}, Ljava/lang/Number;->intValue()I

    .line 379
    .line 380
    .line 381
    move-result v13

    .line 382
    and-int/lit8 v14, v13, 0x6

    .line 383
    .line 384
    if-nez v14, :cond_12

    .line 385
    .line 386
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v1

    .line 390
    if-eqz v1, :cond_11

    .line 391
    .line 392
    goto :goto_8

    .line 393
    :cond_11
    move v7, v8

    .line 394
    :goto_8
    or-int v1, v13, v7

    .line 395
    .line 396
    goto :goto_9

    .line 397
    :cond_12
    move v1, v13

    .line 398
    :goto_9
    and-int/lit8 v7, v13, 0x30

    .line 399
    .line 400
    if-nez v7, :cond_14

    .line 401
    .line 402
    invoke-virtual {v12, v11}, La/fet;->e(I)Z

    .line 403
    .line 404
    .line 405
    move-result v7

    .line 406
    if-eqz v7, :cond_13

    .line 407
    .line 408
    move v5, v6

    .line 409
    :cond_13
    or-int/2addr v1, v5

    .line 410
    :cond_14
    and-int/lit16 v5, v1, 0x93

    .line 411
    .line 412
    if-eq v5, v4, :cond_15

    .line 413
    .line 414
    move v4, v9

    .line 415
    goto :goto_a

    .line 416
    :cond_15
    move v4, v10

    .line 417
    :goto_a
    and-int/2addr v1, v9

    .line 418
    invoke-virtual {v12, v1, v4}, La/fet;->U(IZ)Z

    .line 419
    .line 420
    .line 421
    move-result v1

    .line 422
    if-eqz v1, :cond_16

    .line 423
    .line 424
    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    check-cast v1, La/a2n;

    .line 429
    .line 430
    const v3, -0x1fcbc3ea

    .line 431
    .line 432
    .line 433
    invoke-virtual {v12, v3}, La/fet;->e0(I)V

    .line 434
    .line 435
    .line 436
    check-cast v0, La/ugd;

    .line 437
    .line 438
    new-instance v3, La/ycl;

    .line 439
    .line 440
    invoke-direct {v3, v2}, La/ycl;-><init>(F)V

    .line 441
    .line 442
    .line 443
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 444
    .line 445
    .line 446
    move-result-object v2

    .line 447
    invoke-virtual {v0, v1, v3, v12, v2}, La/ugd;->j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v12, v10}, La/fet;->r(Z)V

    .line 451
    .line 452
    .line 453
    goto :goto_b

    .line 454
    :cond_16
    invoke-virtual {v12}, La/fet;->X()V

    .line 455
    .line 456
    .line 457
    :goto_b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 458
    .line 459
    return-object v0

    .line 460
    nop

    .line 461
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
