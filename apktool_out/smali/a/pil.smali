.class public final La/pil;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/x1x;

.field public b:La/w03;

.field public c:La/m78;

.field public d:J

.field public e:J

.field public f:J

.field public g:La/k6z;

.field public h:F

.field public final i:La/kjj0;

.field public final j:La/ucs0;

.field public k:La/vz2;


# direct methods
.method public constructor <init>(La/kjj0;La/x1x;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/pil;->a:La/x1x;

    .line 5
    .line 6
    sget p2, La/y3d;->h:I

    .line 7
    .line 8
    sget-wide v0, La/y3d;->g:J

    .line 9
    .line 10
    iput-wide v0, p0, La/pil;->d:J

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    iput-wide v0, p0, La/pil;->e:J

    .line 15
    .line 16
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    iput-wide v0, p0, La/pil;->f:J

    .line 22
    .line 23
    sget-object p2, La/k6z;->a:La/k6z;

    .line 24
    .line 25
    iput-object p2, p0, La/pil;->g:La/k6z;

    .line 26
    .line 27
    const/high16 p2, 0x3f800000    # 1.0f

    .line 28
    .line 29
    iput p2, p0, La/pil;->h:F

    .line 30
    .line 31
    iput-object p1, p0, La/pil;->i:La/kjj0;

    .line 32
    .line 33
    invoke-static {}, La/saj;->D()La/ucs0;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, La/pil;->j:La/ucs0;

    .line 38
    .line 39
    return-void
.end method


# virtual methods
.method public final a(La/fhl;La/a4d;JJFI)V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    move-wide/from16 v4, p5

    .line 8
    .line 9
    iget-object v6, v0, La/pil;->a:La/x1x;

    .line 10
    .line 11
    instance-of v7, v6, La/ne80;

    .line 12
    .line 13
    const/4 v8, 0x0

    .line 14
    const-wide/16 v9, 0x0

    .line 15
    .line 16
    if-eqz v7, :cond_0

    .line 17
    .line 18
    check-cast v6, La/ne80;

    .line 19
    .line 20
    iget-object v6, v6, La/ne80;->a:La/w03;

    .line 21
    .line 22
    iput-object v6, v0, La/pil;->b:La/w03;

    .line 23
    .line 24
    iput-wide v9, v0, La/pil;->e:J

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    instance-of v7, v6, La/pe80;

    .line 28
    .line 29
    if-eqz v7, :cond_2

    .line 30
    .line 31
    check-cast v6, La/pe80;

    .line 32
    .line 33
    iget-object v7, v6, La/pe80;->a:La/wfg0;

    .line 34
    .line 35
    invoke-static {v7}, La/r8x;->S(La/wfg0;)Z

    .line 36
    .line 37
    .line 38
    move-result v11

    .line 39
    if-eqz v11, :cond_1

    .line 40
    .line 41
    iput-object v8, v0, La/pil;->b:La/w03;

    .line 42
    .line 43
    iget-wide v6, v7, La/wfg0;->e:J

    .line 44
    .line 45
    iput-wide v6, v0, La/pil;->e:J

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    iget-object v6, v6, La/pe80;->b:La/w03;

    .line 49
    .line 50
    iput-object v6, v0, La/pil;->b:La/w03;

    .line 51
    .line 52
    iput-wide v9, v0, La/pil;->e:J

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_2
    instance-of v6, v6, La/oe80;

    .line 56
    .line 57
    if-eqz v6, :cond_10

    .line 58
    .line 59
    iput-object v8, v0, La/pil;->b:La/w03;

    .line 60
    .line 61
    iput-wide v9, v0, La/pil;->e:J

    .line 62
    .line 63
    :goto_0
    if-eqz p2, :cond_3

    .line 64
    .line 65
    move-object/from16 v5, p2

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    const-wide/16 v6, 0x10

    .line 69
    .line 70
    cmp-long v6, v4, v6

    .line 71
    .line 72
    if-eqz v6, :cond_6

    .line 73
    .line 74
    iget-object v6, v0, La/pil;->c:La/m78;

    .line 75
    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    iget-wide v9, v0, La/pil;->d:J

    .line 79
    .line 80
    sget v7, La/y3d;->h:I

    .line 81
    .line 82
    invoke-static {v9, v10, v4, v5}, La/h2t0;->a(JJ)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-nez v7, :cond_5

    .line 87
    .line 88
    :cond_4
    new-instance v6, La/m78;

    .line 89
    .line 90
    const/4 v7, 0x5

    .line 91
    invoke-direct {v6, v4, v5, v7}, La/m78;-><init>(JI)V

    .line 92
    .line 93
    .line 94
    iput-wide v4, v0, La/pil;->d:J

    .line 95
    .line 96
    iput-object v6, v0, La/pil;->c:La/m78;

    .line 97
    .line 98
    :cond_5
    move-object v5, v6

    .line 99
    goto :goto_1

    .line 100
    :cond_6
    move-object v5, v8

    .line 101
    :goto_1
    iget-wide v6, v0, La/pil;->f:J

    .line 102
    .line 103
    const-wide v9, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    cmp-long v4, v6, v9

    .line 109
    .line 110
    const/4 v9, 0x0

    .line 111
    if-nez v4, :cond_7

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    invoke-static {v6, v7, v2, v3}, La/h7k0;->b(JJ)Z

    .line 115
    .line 116
    .line 117
    move-result v4

    .line 118
    if-eqz v4, :cond_8

    .line 119
    .line 120
    iget-object v4, v0, La/pil;->g:La/k6z;

    .line 121
    .line 122
    invoke-interface {v1}, La/fhl;->getLayoutDirection()La/k6z;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    if-ne v4, v6, :cond_8

    .line 127
    .line 128
    iget v4, v0, La/pil;->h:F

    .line 129
    .line 130
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    cmpg-float v4, v4, v6

    .line 135
    .line 136
    if-nez v4, :cond_8

    .line 137
    .line 138
    move/from16 v22, v9

    .line 139
    .line 140
    const/16 p2, 0x20

    .line 141
    .line 142
    const-wide p5, 0xffffffffL

    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    goto/16 :goto_b

    .line 148
    .line 149
    :cond_8
    :goto_2
    iget-wide v6, v0, La/pil;->e:J

    .line 150
    .line 151
    iget-object v4, v0, La/pil;->b:La/w03;

    .line 152
    .line 153
    iget-object v13, v0, La/pil;->i:La/kjj0;

    .line 154
    .line 155
    iget v13, v13, La/kjj0;->a:F

    .line 156
    .line 157
    invoke-interface {v1, v13}, La/w6k;->w0(F)F

    .line 158
    .line 159
    .line 160
    move-result v15

    .line 161
    invoke-interface {v1, v9}, La/w6k;->w0(F)F

    .line 162
    .line 163
    .line 164
    move-result v13

    .line 165
    const/4 v14, 0x1

    .line 166
    const/16 p2, 0x20

    .line 167
    .line 168
    iget-object v10, v0, La/pil;->j:La/ucs0;

    .line 169
    .line 170
    const/high16 v17, 0x40000000    # 2.0f

    .line 171
    .line 172
    if-eqz v4, :cond_d

    .line 173
    .line 174
    mul-float v6, v15, v17

    .line 175
    .line 176
    mul-float v7, v13, v17

    .line 177
    .line 178
    add-float/2addr v6, v7

    .line 179
    const-wide p5, 0xffffffffL

    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    shr-long v11, v2, p2

    .line 185
    .line 186
    long-to-int v11, v11

    .line 187
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 188
    .line 189
    .line 190
    move-result v11

    .line 191
    add-float/2addr v11, v6

    .line 192
    move v12, v9

    .line 193
    and-long v8, v2, p5

    .line 194
    .line 195
    long-to-int v8, v8

    .line 196
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    add-float/2addr v8, v6

    .line 201
    move/from16 v22, v12

    .line 202
    .line 203
    move v9, v13

    .line 204
    float-to-double v12, v11

    .line 205
    invoke-static {v12, v13}, Ljava/lang/Math;->ceil(D)D

    .line 206
    .line 207
    .line 208
    move-result-wide v11

    .line 209
    double-to-float v6, v11

    .line 210
    float-to-int v6, v6

    .line 211
    float-to-double v11, v8

    .line 212
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 213
    .line 214
    .line 215
    move-result-wide v11

    .line 216
    double-to-float v8, v11

    .line 217
    float-to-int v8, v8

    .line 218
    invoke-static {v6, v8, v14}, La/azw;->c(III)La/vz2;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-static {v6}, La/vw2;->a(La/vz2;)La/uw2;

    .line 223
    .line 224
    .line 225
    move-result-object v8

    .line 226
    cmpl-float v11, v9, v22

    .line 227
    .line 228
    if-lez v11, :cond_b

    .line 229
    .line 230
    add-float v13, v15, v9

    .line 231
    .line 232
    invoke-virtual {v8, v13, v13}, La/uw2;->g(FF)V

    .line 233
    .line 234
    .line 235
    cmpl-float v9, v15, v22

    .line 236
    .line 237
    if-lez v9, :cond_9

    .line 238
    .line 239
    new-instance v11, Landroid/graphics/BlurMaskFilter;

    .line 240
    .line 241
    sget-object v12, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 242
    .line 243
    invoke-direct {v11, v15, v12}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 244
    .line 245
    .line 246
    :goto_3
    const/16 v12, 0xb

    .line 247
    .line 248
    goto :goto_4

    .line 249
    :cond_9
    const/4 v11, 0x0

    .line 250
    goto :goto_3

    .line 251
    :goto_4
    invoke-static {v10, v11, v12}, La/j47;->u0(La/ucs0;Landroid/graphics/BlurMaskFilter;I)V

    .line 252
    .line 253
    .line 254
    invoke-virtual {v8, v4, v10}, La/uw2;->p(La/w03;La/ucs0;)V

    .line 255
    .line 256
    .line 257
    if-lez v9, :cond_a

    .line 258
    .line 259
    new-instance v9, Landroid/graphics/BlurMaskFilter;

    .line 260
    .line 261
    sget-object v11, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 262
    .line 263
    invoke-direct {v9, v15, v11}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 264
    .line 265
    .line 266
    goto :goto_5

    .line 267
    :cond_a
    const/4 v9, 0x0

    .line 268
    :goto_5
    const/4 v11, 0x3

    .line 269
    invoke-static {v10, v9, v11}, La/j47;->u0(La/ucs0;Landroid/graphics/BlurMaskFilter;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v10, v7}, La/ucs0;->z(F)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v8, v4, v10}, La/uw2;->p(La/w03;La/ucs0;)V

    .line 276
    .line 277
    .line 278
    goto/16 :goto_a

    .line 279
    .line 280
    :cond_b
    cmpl-float v7, v15, v22

    .line 281
    .line 282
    if-lez v7, :cond_c

    .line 283
    .line 284
    new-instance v7, Landroid/graphics/BlurMaskFilter;

    .line 285
    .line 286
    sget-object v9, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 287
    .line 288
    invoke-direct {v7, v15, v9}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 289
    .line 290
    .line 291
    :goto_6
    const/16 v12, 0xb

    .line 292
    .line 293
    goto :goto_7

    .line 294
    :cond_c
    const/4 v7, 0x0

    .line 295
    goto :goto_6

    .line 296
    :goto_7
    invoke-static {v10, v7, v12}, La/j47;->u0(La/ucs0;Landroid/graphics/BlurMaskFilter;I)V

    .line 297
    .line 298
    .line 299
    invoke-virtual {v8, v15, v15}, La/uw2;->g(FF)V

    .line 300
    .line 301
    .line 302
    invoke-virtual {v8, v4, v10}, La/uw2;->p(La/w03;La/ucs0;)V

    .line 303
    .line 304
    .line 305
    goto :goto_a

    .line 306
    :cond_d
    move/from16 v22, v9

    .line 307
    .line 308
    move v9, v13

    .line 309
    const-wide p5, 0xffffffffL

    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    mul-float v4, v15, v17

    .line 315
    .line 316
    mul-float v13, v9, v17

    .line 317
    .line 318
    add-float/2addr v13, v4

    .line 319
    shr-long v8, v2, p2

    .line 320
    .line 321
    long-to-int v4, v8

    .line 322
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 323
    .line 324
    .line 325
    move-result v4

    .line 326
    add-float/2addr v4, v13

    .line 327
    and-long v8, v2, p5

    .line 328
    .line 329
    long-to-int v8, v8

    .line 330
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 331
    .line 332
    .line 333
    move-result v8

    .line 334
    add-float/2addr v8, v13

    .line 335
    float-to-double v11, v4

    .line 336
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 337
    .line 338
    .line 339
    move-result-wide v11

    .line 340
    double-to-float v9, v11

    .line 341
    float-to-int v9, v9

    .line 342
    float-to-double v11, v8

    .line 343
    invoke-static {v11, v12}, Ljava/lang/Math;->ceil(D)D

    .line 344
    .line 345
    .line 346
    move-result-wide v11

    .line 347
    double-to-float v11, v11

    .line 348
    float-to-int v11, v11

    .line 349
    invoke-static {v9, v11, v14}, La/azw;->c(III)La/vz2;

    .line 350
    .line 351
    .line 352
    move-result-object v9

    .line 353
    invoke-static {v9}, La/vw2;->a(La/vz2;)La/uw2;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    sub-float v17, v4, v15

    .line 358
    .line 359
    sub-float/2addr v8, v15

    .line 360
    shr-long v12, v6, p2

    .line 361
    .line 362
    long-to-int v4, v12

    .line 363
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 364
    .line 365
    .line 366
    move-result v19

    .line 367
    and-long v6, v6, p5

    .line 368
    .line 369
    long-to-int v4, v6

    .line 370
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 371
    .line 372
    .line 373
    move-result v20

    .line 374
    cmpl-float v4, v15, v22

    .line 375
    .line 376
    if-lez v4, :cond_e

    .line 377
    .line 378
    new-instance v4, Landroid/graphics/BlurMaskFilter;

    .line 379
    .line 380
    sget-object v6, Landroid/graphics/BlurMaskFilter$Blur;->NORMAL:Landroid/graphics/BlurMaskFilter$Blur;

    .line 381
    .line 382
    invoke-direct {v4, v15, v6}, Landroid/graphics/BlurMaskFilter;-><init>(FLandroid/graphics/BlurMaskFilter$Blur;)V

    .line 383
    .line 384
    .line 385
    :goto_8
    const/16 v12, 0xb

    .line 386
    .line 387
    goto :goto_9

    .line 388
    :cond_e
    const/4 v4, 0x0

    .line 389
    goto :goto_8

    .line 390
    :goto_9
    invoke-static {v10, v4, v12}, La/j47;->u0(La/ucs0;Landroid/graphics/BlurMaskFilter;I)V

    .line 391
    .line 392
    .line 393
    iget-object v14, v11, La/uw2;->a:Landroid/graphics/Canvas;

    .line 394
    .line 395
    iget-object v4, v10, La/ucs0;->c:Ljava/lang/Object;

    .line 396
    .line 397
    move-object/from16 v21, v4

    .line 398
    .line 399
    check-cast v21, Landroid/graphics/Paint;

    .line 400
    .line 401
    move/from16 v16, v15

    .line 402
    .line 403
    move/from16 v18, v8

    .line 404
    .line 405
    invoke-virtual/range {v14 .. v21}, Landroid/graphics/Canvas;->drawRoundRect(FFFFFFLandroid/graphics/Paint;)V

    .line 406
    .line 407
    .line 408
    move-object v6, v9

    .line 409
    :goto_a
    iput-object v6, v0, La/pil;->k:La/vz2;

    .line 410
    .line 411
    iput-wide v2, v0, La/pil;->f:J

    .line 412
    .line 413
    invoke-interface {v1}, La/fhl;->getLayoutDirection()La/k6z;

    .line 414
    .line 415
    .line 416
    move-result-object v2

    .line 417
    iput-object v2, v0, La/pil;->g:La/k6z;

    .line 418
    .line 419
    invoke-interface {v1}, La/w6k;->getDensity()F

    .line 420
    .line 421
    .line 422
    move-result v2

    .line 423
    iput v2, v0, La/pil;->h:F

    .line 424
    .line 425
    :goto_b
    iget-object v2, v0, La/pil;->k:La/vz2;

    .line 426
    .line 427
    if-eqz v2, :cond_f

    .line 428
    .line 429
    iget-object v0, v0, La/pil;->i:La/kjj0;

    .line 430
    .line 431
    iget v0, v0, La/kjj0;->a:F

    .line 432
    .line 433
    invoke-interface {v1, v0}, La/w6k;->w0(F)F

    .line 434
    .line 435
    .line 436
    move-result v0

    .line 437
    move/from16 v12, v22

    .line 438
    .line 439
    invoke-interface {v1, v12}, La/w6k;->w0(F)F

    .line 440
    .line 441
    .line 442
    move-result v3

    .line 443
    add-float/2addr v3, v0

    .line 444
    neg-float v0, v3

    .line 445
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 446
    .line 447
    .line 448
    move-result v3

    .line 449
    int-to-long v3, v3

    .line 450
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 451
    .line 452
    .line 453
    move-result v0

    .line 454
    int-to-long v6, v0

    .line 455
    shl-long v3, v3, p2

    .line 456
    .line 457
    and-long v6, v6, p5

    .line 458
    .line 459
    or-long/2addr v3, v6

    .line 460
    const/16 v7, 0x8

    .line 461
    .line 462
    move/from16 v6, p8

    .line 463
    .line 464
    move-object v0, v1

    .line 465
    move-object v1, v2

    .line 466
    move-wide v2, v3

    .line 467
    move/from16 v4, p7

    .line 468
    .line 469
    invoke-static/range {v0 .. v7}, La/fhl;->m0(La/fhl;La/vz2;JFLa/a4d;II)V

    .line 470
    .line 471
    .line 472
    :cond_f
    return-void

    .line 473
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 474
    .line 475
    .line 476
    return-void
.end method
