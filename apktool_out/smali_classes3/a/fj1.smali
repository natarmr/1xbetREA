.class public final synthetic La/fj1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(BJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput-byte p1, p0, La/fj1;->a:B

    iput-object p4, p0, La/fj1;->c:Ljava/lang/Object;

    iput-object p5, p0, La/fj1;->d:Ljava/lang/Object;

    iput-object p6, p0, La/fj1;->e:Ljava/lang/Object;

    iput-object p7, p0, La/fj1;->f:Ljava/lang/Object;

    iput-wide p2, p0, La/fj1;->b:J

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(La/v360;La/tnp0;Ljava/lang/String;JLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    iput-byte v0, p0, La/fj1;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fj1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/fj1;->d:Ljava/lang/Object;

    iput-object p3, p0, La/fj1;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/fj1;->b:J

    iput-object p6, p0, La/fj1;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;La/l7m0;JLa/l7m0;La/l7m0;B)V
    .locals 0

    .line 3
    iput-byte p7, p0, La/fj1;->a:B

    iput-object p1, p0, La/fj1;->c:Ljava/lang/Object;

    iput-object p2, p0, La/fj1;->d:Ljava/lang/Object;

    iput-wide p3, p0, La/fj1;->b:J

    iput-object p5, p0, La/fj1;->e:Ljava/lang/Object;

    iput-object p6, p0, La/fj1;->f:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/fj1;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/high16 v3, 0x41000000    # 8.0f

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/high16 v5, 0x3f800000    # 1.0f

    .line 11
    .line 12
    const-wide v7, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    const/16 v9, 0x20

    .line 18
    .line 19
    iget-object v10, v0, La/fj1;->f:Ljava/lang/Object;

    .line 20
    .line 21
    iget-object v11, v0, La/fj1;->e:Ljava/lang/Object;

    .line 22
    .line 23
    iget-object v12, v0, La/fj1;->d:Ljava/lang/Object;

    .line 24
    .line 25
    iget-object v13, v0, La/fj1;->c:Ljava/lang/Object;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    check-cast v13, La/pz40;

    .line 31
    .line 32
    check-cast v12, La/a4x;

    .line 33
    .line 34
    check-cast v11, La/a4x;

    .line 35
    .line 36
    check-cast v10, La/a4x;

    .line 37
    .line 38
    iget-wide v0, v0, La/fj1;->b:J

    .line 39
    .line 40
    move-object/from16 v14, p1

    .line 41
    .line 42
    check-cast v14, La/fhl;

    .line 43
    .line 44
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-interface {v14}, La/fhl;->d()J

    .line 48
    .line 49
    .line 50
    move-result-wide v2

    .line 51
    shr-long/2addr v2, v9

    .line 52
    long-to-int v2, v2

    .line 53
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    const/high16 v3, 0x40000000    # 2.0f

    .line 58
    .line 59
    div-float/2addr v2, v3

    .line 60
    invoke-interface {v14}, La/fhl;->d()J

    .line 61
    .line 62
    .line 63
    move-result-wide v15

    .line 64
    move/from16 p0, v3

    .line 65
    .line 66
    and-long v3, v15, v7

    .line 67
    .line 68
    long-to-int v3, v3

    .line 69
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    div-float v3, v3, p0

    .line 74
    .line 75
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    move-wide/from16 v16, v7

    .line 80
    .line 81
    int-to-long v6, v2

    .line 82
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 83
    .line 84
    .line 85
    move-result v2

    .line 86
    int-to-long v2, v2

    .line 87
    shl-long/2addr v6, v9

    .line 88
    and-long v2, v2, v16

    .line 89
    .line 90
    or-long/2addr v2, v6

    .line 91
    new-instance v4, La/ne60;

    .line 92
    .line 93
    invoke-direct {v4, v2, v3}, La/ne60;-><init>(J)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v13, v4}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v2

    .line 103
    const/4 v6, 0x0

    .line 104
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    if-eqz v3, :cond_1

    .line 109
    .line 110
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v3

    .line 114
    add-int/lit8 v4, v6, 0x1

    .line 115
    .line 116
    if-ltz v6, :cond_0

    .line 117
    .line 118
    check-cast v3, La/l7m0;

    .line 119
    .line 120
    invoke-interface {v14}, La/fhl;->d()J

    .line 121
    .line 122
    .line 123
    move-result-wide v7

    .line 124
    shr-long/2addr v7, v9

    .line 125
    long-to-int v7, v7

    .line 126
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 127
    .line 128
    .line 129
    move-result v7

    .line 130
    div-float v7, v7, p0

    .line 131
    .line 132
    invoke-interface {v11, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    check-cast v8, La/l7m0;

    .line 137
    .line 138
    invoke-interface {v8}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    check-cast v8, Ljava/lang/Number;

    .line 143
    .line 144
    invoke-virtual {v8}, Ljava/lang/Number;->floatValue()F

    .line 145
    .line 146
    .line 147
    move-result v8

    .line 148
    mul-float v17, v8, v7

    .line 149
    .line 150
    invoke-interface {v3}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v3

    .line 154
    check-cast v3, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    invoke-interface {v14}, La/fhl;->E0()J

    .line 161
    .line 162
    .line 163
    move-result-wide v7

    .line 164
    invoke-interface {v14}, La/fhl;->A0()La/nr;

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    move/from16 v23, v9

    .line 169
    .line 170
    move-object/from16 v24, v10

    .line 171
    .line 172
    invoke-virtual {v12}, La/nr;->p()J

    .line 173
    .line 174
    .line 175
    move-result-wide v9

    .line 176
    invoke-virtual {v12}, La/nr;->i()La/x5a;

    .line 177
    .line 178
    .line 179
    move-result-object v15

    .line 180
    invoke-interface {v15}, La/x5a;->l()V

    .line 181
    .line 182
    .line 183
    :try_start_0
    iget-object v15, v12, La/nr;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v15, La/fvt0;

    .line 186
    .line 187
    invoke-virtual {v15, v3, v3, v7, v8}, La/fvt0;->z(FFJ)V

    .line 188
    .line 189
    .line 190
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v3

    .line 194
    check-cast v3, La/ne60;

    .line 195
    .line 196
    iget-wide v7, v3, La/ne60;->a:J

    .line 197
    .line 198
    new-instance v21, La/vtm0;

    .line 199
    .line 200
    invoke-interface {v14, v5}, La/w6k;->w0(F)F

    .line 201
    .line 202
    .line 203
    move-result v26

    .line 204
    const/16 v30, 0x0

    .line 205
    .line 206
    const/16 v31, 0x1e

    .line 207
    .line 208
    const/16 v27, 0x0

    .line 209
    .line 210
    const/16 v28, 0x0

    .line 211
    .line 212
    const/16 v29, 0x0

    .line 213
    .line 214
    move-object/from16 v25, v21

    .line 215
    .line 216
    invoke-direct/range {v25 .. v31}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 217
    .line 218
    .line 219
    move-object/from16 v3, v24

    .line 220
    .line 221
    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    check-cast v6, La/l7m0;

    .line 226
    .line 227
    invoke-interface {v6}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    check-cast v6, Ljava/lang/Number;

    .line 232
    .line 233
    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    .line 234
    .line 235
    .line 236
    move-result v20

    .line 237
    const/16 v22, 0x60

    .line 238
    .line 239
    move-wide v15, v0

    .line 240
    move-wide/from16 v18, v7

    .line 241
    .line 242
    invoke-static/range {v14 .. v22}, La/fhl;->E(La/fhl;JFJFLa/agc;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    .line 245
    invoke-static {v12, v9, v10}, Lc;->g(La/nr;J)V

    .line 246
    .line 247
    .line 248
    move-object v10, v3

    .line 249
    move v6, v4

    .line 250
    move-wide v0, v15

    .line 251
    move/from16 v9, v23

    .line 252
    .line 253
    goto/16 :goto_0

    .line 254
    .line 255
    :catchall_0
    move-exception v0

    .line 256
    invoke-static {v12, v9, v10}, Lc;->g(La/nr;J)V

    .line 257
    .line 258
    .line 259
    throw v0

    .line 260
    :cond_0
    invoke-static {}, La/q3d;->p()V

    .line 261
    .line 262
    .line 263
    const/4 v0, 0x0

    .line 264
    throw v0

    .line 265
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    return-object v0

    .line 268
    :pswitch_0
    check-cast v13, La/v360;

    .line 269
    .line 270
    move-object v3, v12

    .line 271
    check-cast v3, La/tnp0;

    .line 272
    .line 273
    move-object v4, v11

    .line 274
    check-cast v4, Ljava/lang/String;

    .line 275
    .line 276
    move-object v9, v10

    .line 277
    check-cast v9, Ljava/lang/String;

    .line 278
    .line 279
    move-object/from16 v10, p1

    .line 280
    .line 281
    check-cast v10, La/k0w0;

    .line 282
    .line 283
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 284
    .line 285
    .line 286
    iget-object v1, v13, La/v360;->U:La/ifp;

    .line 287
    .line 288
    move-object v5, v1

    .line 289
    invoke-interface {v3}, La/tnp0;->a()J

    .line 290
    .line 291
    .line 292
    move-result-wide v1

    .line 293
    move-object v7, v5

    .line 294
    invoke-interface {v3}, La/tnp0;->c()J

    .line 295
    .line 296
    .line 297
    move-result-wide v5

    .line 298
    move-object v11, v7

    .line 299
    iget-wide v7, v0, La/fj1;->b:J

    .line 300
    .line 301
    move-object v0, v11

    .line 302
    invoke-virtual/range {v0 .. v9}, La/ifp;->a(JLa/tnp0;Ljava/lang/String;JJLjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    invoke-virtual {v10, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 307
    .line 308
    .line 309
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 310
    .line 311
    return-object v0

    .line 312
    :pswitch_1
    move-wide/from16 v16, v7

    .line 313
    .line 314
    move/from16 v23, v9

    .line 315
    .line 316
    check-cast v13, La/f6x;

    .line 317
    .line 318
    check-cast v12, La/l7m0;

    .line 319
    .line 320
    iget-wide v0, v0, La/fj1;->b:J

    .line 321
    .line 322
    check-cast v11, La/l7m0;

    .line 323
    .line 324
    check-cast v10, La/l7m0;

    .line 325
    .line 326
    move-object/from16 v5, p1

    .line 327
    .line 328
    check-cast v5, La/fhl;

    .line 329
    .line 330
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 331
    .line 332
    .line 333
    invoke-interface {v5, v3}, La/w6k;->w0(F)F

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    invoke-interface {v5}, La/fhl;->A0()La/nr;

    .line 338
    .line 339
    .line 340
    move-result-object v6

    .line 341
    iget-object v6, v6, La/nr;->b:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v6, La/fvt0;

    .line 344
    .line 345
    invoke-virtual {v6, v2, v3, v2, v3}, La/fvt0;->u(FFFF)V

    .line 346
    .line 347
    .line 348
    :try_start_1
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object v6

    .line 352
    check-cast v6, Ljava/lang/Iterable;

    .line 353
    .line 354
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 362
    if-eqz v7, :cond_2

    .line 363
    .line 364
    :try_start_2
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    check-cast v7, La/qvx;

    .line 369
    .line 370
    iget-wide v8, v13, La/f6x;->b:J

    .line 371
    .line 372
    iget v12, v7, La/qvx;->a:F

    .line 373
    .line 374
    invoke-interface {v5, v12}, La/w6k;->w0(F)F

    .line 375
    .line 376
    .line 377
    move-result v12

    .line 378
    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 379
    .line 380
    .line 381
    move-result v12

    .line 382
    int-to-long v14, v12

    .line 383
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 384
    .line 385
    .line 386
    move-result v12
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 387
    move/from16 v18, v2

    .line 388
    .line 389
    move/from16 p0, v3

    .line 390
    .line 391
    int-to-long v2, v12

    .line 392
    shl-long v14, v14, v23

    .line 393
    .line 394
    and-long v2, v2, v16

    .line 395
    .line 396
    or-long v27, v14, v2

    .line 397
    .line 398
    :try_start_3
    iget v2, v7, La/qvx;->b:F

    .line 399
    .line 400
    invoke-interface {v5, v2}, La/w6k;->w0(F)F

    .line 401
    .line 402
    .line 403
    move-result v2

    .line 404
    invoke-interface {v5}, La/fhl;->d()J

    .line 405
    .line 406
    .line 407
    move-result-wide v14

    .line 408
    and-long v14, v14, v16

    .line 409
    .line 410
    long-to-int v3, v14

    .line 411
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 412
    .line 413
    .line 414
    move-result v3

    .line 415
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 416
    .line 417
    .line 418
    move-result v2

    .line 419
    int-to-long v14, v2

    .line 420
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 421
    .line 422
    .line 423
    move-result v2

    .line 424
    int-to-long v2, v2

    .line 425
    shl-long v14, v14, v23

    .line 426
    .line 427
    and-long v2, v2, v16

    .line 428
    .line 429
    or-long v29, v14, v2

    .line 430
    .line 431
    sget-object v33, La/l0q;->a:La/l0q;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 432
    .line 433
    const/16 v34, 0xe0

    .line 434
    .line 435
    move-wide/from16 v31, v0

    .line 436
    .line 437
    move-object/from16 v24, v5

    .line 438
    .line 439
    move-wide/from16 v25, v8

    .line 440
    .line 441
    :try_start_4
    invoke-static/range {v24 .. v34}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 442
    .line 443
    .line 444
    move-object/from16 v1, v24

    .line 445
    .line 446
    :try_start_5
    iget-wide v2, v13, La/f6x;->a:J

    .line 447
    .line 448
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v0

    .line 452
    check-cast v0, La/ycl;

    .line 453
    .line 454
    iget v0, v0, La/ycl;->a:F

    .line 455
    .line 456
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 457
    .line 458
    .line 459
    move-result v0

    .line 460
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 461
    .line 462
    .line 463
    move-result v0

    .line 464
    int-to-long v7, v0

    .line 465
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    int-to-long v14, v0

    .line 470
    shl-long v7, v7, v23

    .line 471
    .line 472
    and-long v14, v14, v16

    .line 473
    .line 474
    or-long v27, v7, v14

    .line 475
    .line 476
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 477
    .line 478
    .line 479
    move-result-object v0

    .line 480
    check-cast v0, La/ycl;

    .line 481
    .line 482
    iget v0, v0, La/ycl;->a:F

    .line 483
    .line 484
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 485
    .line 486
    .line 487
    move-result v0

    .line 488
    invoke-interface {v1}, La/fhl;->d()J

    .line 489
    .line 490
    .line 491
    move-result-wide v7

    .line 492
    and-long v7, v7, v16

    .line 493
    .line 494
    long-to-int v5, v7

    .line 495
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 496
    .line 497
    .line 498
    move-result v5

    .line 499
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 500
    .line 501
    .line 502
    move-result v0

    .line 503
    int-to-long v7, v0

    .line 504
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 505
    .line 506
    .line 507
    move-result v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 508
    int-to-long v14, v0

    .line 509
    shl-long v7, v7, v23

    .line 510
    .line 511
    and-long v14, v14, v16

    .line 512
    .line 513
    or-long v29, v7, v14

    .line 514
    .line 515
    const/16 v34, 0xe0

    .line 516
    .line 517
    move-object/from16 v24, v1

    .line 518
    .line 519
    move-wide/from16 v25, v2

    .line 520
    .line 521
    :try_start_6
    invoke-static/range {v24 .. v34}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 522
    .line 523
    .line 524
    move/from16 v3, p0

    .line 525
    .line 526
    move/from16 v2, v18

    .line 527
    .line 528
    move-object/from16 v5, v24

    .line 529
    .line 530
    move-wide/from16 v0, v31

    .line 531
    .line 532
    goto/16 :goto_1

    .line 533
    .line 534
    :catchall_1
    move-exception v0

    .line 535
    :goto_2
    move/from16 v1, p0

    .line 536
    .line 537
    goto :goto_4

    .line 538
    :catchall_2
    move-exception v0

    .line 539
    move-object/from16 v24, v1

    .line 540
    .line 541
    goto :goto_2

    .line 542
    :catchall_3
    move-exception v0

    .line 543
    :goto_3
    move-object/from16 v24, v5

    .line 544
    .line 545
    goto :goto_2

    .line 546
    :catchall_4
    move-exception v0

    .line 547
    move/from16 p0, v3

    .line 548
    .line 549
    goto :goto_3

    .line 550
    :cond_2
    move/from16 p0, v3

    .line 551
    .line 552
    move-object/from16 v24, v5

    .line 553
    .line 554
    invoke-interface/range {v24 .. v24}, La/fhl;->A0()La/nr;

    .line 555
    .line 556
    .line 557
    move-result-object v0

    .line 558
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, La/fvt0;

    .line 561
    .line 562
    move/from16 v1, p0

    .line 563
    .line 564
    neg-float v1, v1

    .line 565
    invoke-virtual {v0, v4, v1, v4, v1}, La/fvt0;->u(FFFF)V

    .line 566
    .line 567
    .line 568
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 569
    .line 570
    return-object v0

    .line 571
    :catchall_5
    move-exception v0

    .line 572
    move v1, v3

    .line 573
    move-object/from16 v24, v5

    .line 574
    .line 575
    :goto_4
    invoke-interface/range {v24 .. v24}, La/fhl;->A0()La/nr;

    .line 576
    .line 577
    .line 578
    move-result-object v2

    .line 579
    iget-object v2, v2, La/nr;->b:Ljava/lang/Object;

    .line 580
    .line 581
    check-cast v2, La/fvt0;

    .line 582
    .line 583
    neg-float v1, v1

    .line 584
    invoke-virtual {v2, v4, v1, v4, v1}, La/fvt0;->u(FFFF)V

    .line 585
    .line 586
    .line 587
    throw v0

    .line 588
    :pswitch_2
    move/from16 v18, v2

    .line 589
    .line 590
    move-wide/from16 v16, v7

    .line 591
    .line 592
    move/from16 v23, v9

    .line 593
    .line 594
    check-cast v13, La/e6x;

    .line 595
    .line 596
    check-cast v12, La/l7m0;

    .line 597
    .line 598
    iget-wide v0, v0, La/fj1;->b:J

    .line 599
    .line 600
    check-cast v11, La/l7m0;

    .line 601
    .line 602
    check-cast v10, La/l7m0;

    .line 603
    .line 604
    move-object/from16 v2, p1

    .line 605
    .line 606
    check-cast v2, La/fhl;

    .line 607
    .line 608
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-interface {v2, v3}, La/w6k;->w0(F)F

    .line 612
    .line 613
    .line 614
    move-result v3

    .line 615
    invoke-interface {v2}, La/fhl;->A0()La/nr;

    .line 616
    .line 617
    .line 618
    move-result-object v5

    .line 619
    iget-object v5, v5, La/nr;->b:Ljava/lang/Object;

    .line 620
    .line 621
    check-cast v5, La/fvt0;

    .line 622
    .line 623
    move/from16 v6, v18

    .line 624
    .line 625
    invoke-virtual {v5, v6, v3, v6, v3}, La/fvt0;->u(FFFF)V

    .line 626
    .line 627
    .line 628
    :try_start_7
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v5

    .line 632
    check-cast v5, Ljava/lang/Iterable;

    .line 633
    .line 634
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 635
    .line 636
    .line 637
    move-result-object v5

    .line 638
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v6

    .line 642
    if-eqz v6, :cond_3

    .line 643
    .line 644
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v6

    .line 648
    check-cast v6, La/ovx;

    .line 649
    .line 650
    iget-wide v7, v13, La/e6x;->b:J

    .line 651
    .line 652
    iget v9, v6, La/ovx;->a:F

    .line 653
    .line 654
    invoke-interface {v2, v9}, La/w6k;->w0(F)F

    .line 655
    .line 656
    .line 657
    move-result v9

    .line 658
    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 659
    .line 660
    .line 661
    move-result v9

    .line 662
    int-to-long v14, v9

    .line 663
    const/16 v18, 0x0

    .line 664
    .line 665
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 666
    .line 667
    .line 668
    move-result v9

    .line 669
    move-object/from16 p0, v5

    .line 670
    .line 671
    int-to-long v4, v9

    .line 672
    shl-long v14, v14, v23

    .line 673
    .line 674
    and-long v4, v4, v16

    .line 675
    .line 676
    or-long v27, v14, v4

    .line 677
    .line 678
    iget v4, v6, La/ovx;->b:F

    .line 679
    .line 680
    invoke-interface {v2, v4}, La/w6k;->w0(F)F

    .line 681
    .line 682
    .line 683
    move-result v4

    .line 684
    invoke-interface {v2}, La/fhl;->d()J

    .line 685
    .line 686
    .line 687
    move-result-wide v5

    .line 688
    and-long v5, v5, v16

    .line 689
    .line 690
    long-to-int v5, v5

    .line 691
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 692
    .line 693
    .line 694
    move-result v5

    .line 695
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 696
    .line 697
    .line 698
    move-result v4

    .line 699
    int-to-long v14, v4

    .line 700
    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 701
    .line 702
    .line 703
    move-result v4

    .line 704
    int-to-long v4, v4

    .line 705
    shl-long v14, v14, v23

    .line 706
    .line 707
    and-long v4, v4, v16

    .line 708
    .line 709
    or-long v29, v14, v4

    .line 710
    .line 711
    sget-object v33, La/l0q;->a:La/l0q;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_8

    .line 712
    .line 713
    const/16 v34, 0xe0

    .line 714
    .line 715
    move-wide/from16 v31, v0

    .line 716
    .line 717
    move-object/from16 v24, v2

    .line 718
    .line 719
    move-wide/from16 v25, v7

    .line 720
    .line 721
    :try_start_8
    invoke-static/range {v24 .. v34}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    .line 722
    .line 723
    .line 724
    move-object/from16 v1, v24

    .line 725
    .line 726
    :try_start_9
    iget-wide v4, v13, La/e6x;->a:J

    .line 727
    .line 728
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    move-result-object v0

    .line 732
    check-cast v0, La/ycl;

    .line 733
    .line 734
    iget v0, v0, La/ycl;->a:F

    .line 735
    .line 736
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 737
    .line 738
    .line 739
    move-result v0

    .line 740
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 741
    .line 742
    .line 743
    move-result v0

    .line 744
    int-to-long v6, v0

    .line 745
    const/16 v18, 0x0

    .line 746
    .line 747
    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    int-to-long v8, v0

    .line 752
    shl-long v6, v6, v23

    .line 753
    .line 754
    and-long v8, v8, v16

    .line 755
    .line 756
    or-long v27, v6, v8

    .line 757
    .line 758
    invoke-interface {v10}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v0

    .line 762
    check-cast v0, La/ycl;

    .line 763
    .line 764
    iget v0, v0, La/ycl;->a:F

    .line 765
    .line 766
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 767
    .line 768
    .line 769
    move-result v0

    .line 770
    invoke-interface {v1}, La/fhl;->d()J

    .line 771
    .line 772
    .line 773
    move-result-wide v6

    .line 774
    and-long v6, v6, v16

    .line 775
    .line 776
    long-to-int v2, v6

    .line 777
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 778
    .line 779
    .line 780
    move-result v2

    .line 781
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 782
    .line 783
    .line 784
    move-result v0

    .line 785
    int-to-long v6, v0

    .line 786
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 787
    .line 788
    .line 789
    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_7

    .line 790
    int-to-long v8, v0

    .line 791
    shl-long v6, v6, v23

    .line 792
    .line 793
    and-long v8, v8, v16

    .line 794
    .line 795
    or-long v29, v6, v8

    .line 796
    .line 797
    const/16 v34, 0xe0

    .line 798
    .line 799
    move-object/from16 v24, v1

    .line 800
    .line 801
    move-wide/from16 v25, v4

    .line 802
    .line 803
    :try_start_a
    invoke-static/range {v24 .. v34}, La/fhl;->o0(La/fhl;JJJJLa/agc;I)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_6

    .line 804
    .line 805
    .line 806
    move-object/from16 v5, p0

    .line 807
    .line 808
    move-object/from16 v2, v24

    .line 809
    .line 810
    move-wide/from16 v0, v31

    .line 811
    .line 812
    const/high16 v4, -0x80000000

    .line 813
    .line 814
    goto/16 :goto_5

    .line 815
    .line 816
    :catchall_6
    move-exception v0

    .line 817
    goto :goto_6

    .line 818
    :catchall_7
    move-exception v0

    .line 819
    move-object/from16 v24, v1

    .line 820
    .line 821
    goto :goto_6

    .line 822
    :catchall_8
    move-exception v0

    .line 823
    move-object/from16 v24, v2

    .line 824
    .line 825
    goto :goto_6

    .line 826
    :cond_3
    move-object/from16 v24, v2

    .line 827
    .line 828
    invoke-interface/range {v24 .. v24}, La/fhl;->A0()La/nr;

    .line 829
    .line 830
    .line 831
    move-result-object v0

    .line 832
    iget-object v0, v0, La/nr;->b:Ljava/lang/Object;

    .line 833
    .line 834
    check-cast v0, La/fvt0;

    .line 835
    .line 836
    neg-float v1, v3

    .line 837
    const/high16 v2, -0x80000000

    .line 838
    .line 839
    invoke-virtual {v0, v2, v1, v2, v1}, La/fvt0;->u(FFFF)V

    .line 840
    .line 841
    .line 842
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 843
    .line 844
    return-object v0

    .line 845
    :goto_6
    invoke-interface/range {v24 .. v24}, La/fhl;->A0()La/nr;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v1, La/fvt0;

    .line 852
    .line 853
    neg-float v2, v3

    .line 854
    const/high16 v3, -0x80000000

    .line 855
    .line 856
    invoke-virtual {v1, v3, v2, v3, v2}, La/fvt0;->u(FFFF)V

    .line 857
    .line 858
    .line 859
    throw v0

    .line 860
    :pswitch_3
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 861
    .line 862
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 863
    .line 864
    check-cast v11, Lkotlin/jvm/functions/Function0;

    .line 865
    .line 866
    check-cast v10, Lkotlin/jvm/functions/Function0;

    .line 867
    .line 868
    move-object/from16 v1, p1

    .line 869
    .line 870
    check-cast v1, La/uag0;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1, v5}, La/uag0;->w(F)V

    .line 876
    .line 877
    .line 878
    invoke-interface {v13}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v2

    .line 882
    check-cast v2, Ljava/lang/Number;

    .line 883
    .line 884
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    invoke-virtual {v1, v2}, La/uag0;->b(F)V

    .line 889
    .line 890
    .line 891
    invoke-interface {v12}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v2

    .line 895
    check-cast v2, Ljava/lang/Number;

    .line 896
    .line 897
    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    .line 898
    .line 899
    .line 900
    move-result v2

    .line 901
    invoke-virtual {v1, v2}, La/uag0;->v(F)V

    .line 902
    .line 903
    .line 904
    invoke-interface {v11}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 905
    .line 906
    .line 907
    move-result-object v2

    .line 908
    check-cast v2, La/ycl;

    .line 909
    .line 910
    iget v2, v2, La/ycl;->a:F

    .line 911
    .line 912
    iget-object v3, v1, La/uag0;->t:La/w6k;

    .line 913
    .line 914
    invoke-interface {v3}, La/w6k;->getDensity()F

    .line 915
    .line 916
    .line 917
    move-result v3

    .line 918
    mul-float/2addr v3, v2

    .line 919
    invoke-virtual {v1, v3}, La/uag0;->H(F)V

    .line 920
    .line 921
    .line 922
    invoke-interface {v10}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 923
    .line 924
    .line 925
    move-result-object v2

    .line 926
    check-cast v2, La/ycl;

    .line 927
    .line 928
    iget v2, v2, La/ycl;->a:F

    .line 929
    .line 930
    iget-object v3, v1, La/uag0;->t:La/w6k;

    .line 931
    .line 932
    invoke-interface {v3}, La/w6k;->getDensity()F

    .line 933
    .line 934
    .line 935
    move-result v3

    .line 936
    mul-float/2addr v3, v2

    .line 937
    invoke-virtual {v1, v3}, La/uag0;->I(F)V

    .line 938
    .line 939
    .line 940
    iget-wide v2, v0, La/fj1;->b:J

    .line 941
    .line 942
    invoke-virtual {v1, v2, v3}, La/uag0;->G(J)V

    .line 943
    .line 944
    .line 945
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 946
    .line 947
    return-object v0

    .line 948
    :pswitch_4
    check-cast v13, La/pru;

    .line 949
    .line 950
    check-cast v12, La/hgh0;

    .line 951
    .line 952
    check-cast v11, La/bzt;

    .line 953
    .line 954
    check-cast v10, La/wyu;

    .line 955
    .line 956
    move-object/from16 v1, p1

    .line 957
    .line 958
    check-cast v1, La/vzg0;

    .line 959
    .line 960
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 961
    .line 962
    .line 963
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 964
    .line 965
    .line 966
    move-result-object v2

    .line 967
    iget-object v2, v2, La/sff0;->b:La/hl1;

    .line 968
    .line 969
    iget-object v3, v2, La/hl1;->v:La/th1;

    .line 970
    .line 971
    sget-object v19, La/xun;->a:La/xun;

    .line 972
    .line 973
    iget-object v4, v12, La/hgh0;->a:Ljava/lang/String;

    .line 974
    .line 975
    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    .line 976
    .line 977
    .line 978
    move-result v5

    .line 979
    const v6, 0xcebf776

    .line 980
    .line 981
    .line 982
    if-eq v5, v6, :cond_8

    .line 983
    .line 984
    const v6, 0x504db2ec

    .line 985
    .line 986
    .line 987
    if-eq v5, v6, :cond_6

    .line 988
    .line 989
    const v6, 0x52ff50ec

    .line 990
    .line 991
    .line 992
    if-eq v5, v6, :cond_4

    .line 993
    .line 994
    goto :goto_7

    .line 995
    :cond_4
    const-string v5, "alphabeticallyAsc"

    .line 996
    .line 997
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 998
    .line 999
    .line 1000
    move-result v4

    .line 1001
    if-nez v4, :cond_5

    .line 1002
    .line 1003
    goto :goto_7

    .line 1004
    :cond_5
    sget-object v4, La/uzb0;->b:La/uzb0;

    .line 1005
    .line 1006
    goto :goto_8

    .line 1007
    :cond_6
    const-string v5, "byPopularity"

    .line 1008
    .line 1009
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1010
    .line 1011
    .line 1012
    move-result v4

    .line 1013
    if-nez v4, :cond_7

    .line 1014
    .line 1015
    goto :goto_7

    .line 1016
    :cond_7
    sget-object v4, La/uzb0;->a:La/uzb0;

    .line 1017
    .line 1018
    goto :goto_8

    .line 1019
    :cond_8
    const-string v5, "alphabeticallyDesc"

    .line 1020
    .line 1021
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1022
    .line 1023
    .line 1024
    move-result v4

    .line 1025
    if-nez v4, :cond_9

    .line 1026
    .line 1027
    :goto_7
    sget-object v4, La/uzb0;->a:La/uzb0;

    .line 1028
    .line 1029
    goto :goto_8

    .line 1030
    :cond_9
    sget-object v4, La/uzb0;->c:La/uzb0;

    .line 1031
    .line 1032
    :goto_8
    const-string v5, "SAVED_STATE_LAST_SORT_TYPE"

    .line 1033
    .line 1034
    invoke-static {v1, v5, v4}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1035
    .line 1036
    .line 1037
    move-result-object v4

    .line 1038
    move-object/from16 v21, v4

    .line 1039
    .line 1040
    check-cast v21, La/uzb0;

    .line 1041
    .line 1042
    iget-object v2, v2, La/hl1;->a:La/f61;

    .line 1043
    .line 1044
    iget-boolean v2, v2, La/f61;->k:Z

    .line 1045
    .line 1046
    const-string v4, "SEARCH_QUERY_KEY"

    .line 1047
    .line 1048
    const-string v5, ""

    .line 1049
    .line 1050
    invoke-static {v1, v4, v5}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v6

    .line 1054
    check-cast v6, Ljava/lang/CharSequence;

    .line 1055
    .line 1056
    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    .line 1057
    .line 1058
    .line 1059
    move-result v6

    .line 1060
    const/4 v7, 0x1

    .line 1061
    if-lez v6, :cond_a

    .line 1062
    .line 1063
    move/from16 v23, v7

    .line 1064
    .line 1065
    goto :goto_9

    .line 1066
    :cond_a
    const/16 v23, 0x0

    .line 1067
    .line 1068
    :goto_9
    invoke-static {v1, v4, v5}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1069
    .line 1070
    .line 1071
    move-result-object v4

    .line 1072
    move-object/from16 v24, v4

    .line 1073
    .line 1074
    check-cast v24, Ljava/lang/String;

    .line 1075
    .line 1076
    const-string v4, "FILTER_QUERY_KEY"

    .line 1077
    .line 1078
    invoke-static {v1, v4, v5}, La/a8k0;->H(La/vzg0;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1079
    .line 1080
    .line 1081
    move-result-object v1

    .line 1082
    move-object/from16 v25, v1

    .line 1083
    .line 1084
    check-cast v25, Ljava/lang/String;

    .line 1085
    .line 1086
    iget-object v1, v11, La/bzt;->a:La/fsd;

    .line 1087
    .line 1088
    invoke-virtual {v1}, La/fsd;->a()La/v8d;

    .line 1089
    .line 1090
    .line 1091
    move-result-object v1

    .line 1092
    iget v1, v1, La/v8d;->r:I

    .line 1093
    .line 1094
    sget-object v4, La/uaq0;->a:La/s9m0;

    .line 1095
    .line 1096
    invoke-static {v10, v4}, La/h97;->A(La/wyu;La/s9m0;)Z

    .line 1097
    .line 1098
    .line 1099
    move-result v4

    .line 1100
    xor-int/lit8 v29, v4, 0x1

    .line 1101
    .line 1102
    new-instance v16, La/bj1;

    .line 1103
    .line 1104
    sget-object v17, La/rhe;->a:La/rhe;

    .line 1105
    .line 1106
    iget-wide v4, v0, La/fj1;->b:J

    .line 1107
    .line 1108
    move-object/from16 v20, v19

    .line 1109
    .line 1110
    move/from16 v28, v1

    .line 1111
    .line 1112
    move/from16 v22, v2

    .line 1113
    .line 1114
    move-object/from16 v18, v3

    .line 1115
    .line 1116
    move-wide/from16 v26, v4

    .line 1117
    .line 1118
    invoke-direct/range {v16 .. v29}, La/bj1;-><init>(La/iie;La/th1;Ljava/util/Set;Ljava/util/Set;La/uzb0;ZZLjava/lang/String;Ljava/lang/String;JIZ)V

    .line 1119
    .line 1120
    .line 1121
    return-object v16

    .line 1122
    nop

    .line 1123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
