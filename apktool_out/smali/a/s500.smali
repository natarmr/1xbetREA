.class public final La/s500;
.super La/cbj;
.source "SourceFile"


# instance fields
.field public g:La/hu5;

.field public h:Landroid/graphics/Path;

.field public i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

.field public j:Landroid/graphics/Paint;

.field public k:Ljava/lang/ref/WeakReference;

.field public l:Landroid/graphics/Canvas;

.field public m:Landroid/graphics/Bitmap$Config;

.field public n:Landroid/graphics/Path;

.field public o:Landroid/graphics/Path;

.field public p:[F

.field public q:Landroid/graphics/Path;

.field public r:Ljava/util/HashMap;

.field public s:[F


# virtual methods
.method public final n1(Landroid/graphics/Canvas;)V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/cbj;->c:La/lwb;

    .line 4
    .line 5
    iget-object v2, v0, La/cbj;->f:Landroid/graphics/Paint;

    .line 6
    .line 7
    iget-object v3, v0, La/s500;->g:La/hu5;

    .line 8
    .line 9
    iget-object v4, v0, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 10
    .line 11
    invoke-interface {v4}, La/pwb;->getData()La/mwb;

    .line 12
    .line 13
    .line 14
    move-result-object v5

    .line 15
    invoke-virtual {v5}, La/mwb;->d()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    int-to-float v5, v5

    .line 20
    invoke-interface {v4}, La/pwb;->getMaxVisibleCount()I

    .line 21
    .line 22
    .line 23
    move-result v6

    .line 24
    int-to-float v6, v6

    .line 25
    iget-object v0, v0, La/p4;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, La/xju0;

    .line 28
    .line 29
    iget v7, v0, La/xju0;->g:F

    .line 30
    .line 31
    mul-float/2addr v6, v7

    .line 32
    cmpg-float v5, v5, v6

    .line 33
    .line 34
    if-gez v5, :cond_d

    .line 35
    .line 36
    invoke-virtual {v4}, La/q500;->getLineData()La/u500;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    iget-object v5, v5, La/mwb;->i:Ljava/util/ArrayList;

    .line 41
    .line 42
    const/4 v7, 0x0

    .line 43
    :goto_0
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v8

    .line 47
    if-ge v7, v8, :cond_d

    .line 48
    .line 49
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, La/v500;

    .line 54
    .line 55
    iget-boolean v9, v8, La/v500;->n:Z

    .line 56
    .line 57
    if-eqz v9, :cond_1

    .line 58
    .line 59
    iget-boolean v9, v8, La/v500;->j:Z

    .line 60
    .line 61
    if-nez v9, :cond_0

    .line 62
    .line 63
    iget-boolean v9, v8, La/v500;->k:Z

    .line 64
    .line 65
    if-eqz v9, :cond_1

    .line 66
    .line 67
    :cond_0
    iget-object v9, v8, La/v500;->o:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v9

    .line 73
    const/4 v10, 0x1

    .line 74
    if-ge v9, v10, :cond_2

    .line 75
    .line 76
    :cond_1
    move-object/from16 v16, v0

    .line 77
    .line 78
    move-object/from16 v18, v1

    .line 79
    .line 80
    move-object/from16 v20, v3

    .line 81
    .line 82
    move-object/from16 v1, p1

    .line 83
    .line 84
    goto/16 :goto_7

    .line 85
    .line 86
    :cond_2
    const/4 v9, 0x0

    .line 87
    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 88
    .line 89
    .line 90
    iget v9, v8, La/v500;->m:F

    .line 91
    .line 92
    invoke-virtual {v2, v9}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 93
    .line 94
    .line 95
    iget v9, v8, La/v500;->d:I

    .line 96
    .line 97
    invoke-virtual {v4, v9}, La/eu5;->f(I)La/ywq0;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    iget v11, v8, La/v500;->E:F

    .line 102
    .line 103
    const/high16 v12, 0x3fe00000    # 1.75f

    .line 104
    .line 105
    mul-float/2addr v11, v12

    .line 106
    float-to-int v11, v11

    .line 107
    iget-boolean v12, v8, La/v500;->I:Z

    .line 108
    .line 109
    if-nez v12, :cond_3

    .line 110
    .line 111
    div-int/lit8 v11, v11, 0x2

    .line 112
    .line 113
    :cond_3
    invoke-virtual {v3, v4, v8}, La/hu5;->X(La/eu5;La/v500;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget v12, v3, La/hu5;->b:I

    .line 120
    .line 121
    iget v13, v3, La/hu5;->c:I

    .line 122
    .line 123
    sub-int/2addr v13, v12

    .line 124
    int-to-float v13, v13

    .line 125
    const/high16 v14, 0x3f800000    # 1.0f

    .line 126
    .line 127
    mul-float/2addr v13, v14

    .line 128
    float-to-int v13, v13

    .line 129
    add-int/2addr v13, v10

    .line 130
    mul-int/lit8 v13, v13, 0x2

    .line 131
    .line 132
    iget-object v10, v9, La/ywq0;->d:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v10, [F

    .line 135
    .line 136
    array-length v15, v10

    .line 137
    if-eq v15, v13, :cond_4

    .line 138
    .line 139
    new-array v10, v13, [F

    .line 140
    .line 141
    iput-object v10, v9, La/ywq0;->d:Ljava/lang/Object;

    .line 142
    .line 143
    :cond_4
    const/4 v15, 0x0

    .line 144
    :goto_1
    if-ge v15, v13, :cond_6

    .line 145
    .line 146
    div-int/lit8 v16, v15, 0x2

    .line 147
    .line 148
    add-int v6, v16, v12

    .line 149
    .line 150
    invoke-virtual {v8, v6}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    if-eqz v6, :cond_5

    .line 155
    .line 156
    move/from16 v16, v14

    .line 157
    .line 158
    iget v14, v6, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 159
    .line 160
    aput v14, v10, v15

    .line 161
    .line 162
    add-int/lit8 v14, v15, 0x1

    .line 163
    .line 164
    iget v6, v6, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 165
    .line 166
    mul-float v6, v6, v16

    .line 167
    .line 168
    aput v6, v10, v14

    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_5
    move/from16 v16, v14

    .line 172
    .line 173
    const/4 v6, 0x0

    .line 174
    aput v6, v10, v15

    .line 175
    .line 176
    add-int/lit8 v14, v15, 0x1

    .line 177
    .line 178
    aput v6, v10, v14

    .line 179
    .line 180
    :goto_2
    add-int/lit8 v15, v15, 0x2

    .line 181
    .line 182
    move/from16 v14, v16

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_6
    iget-object v6, v9, La/ywq0;->g:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast v6, Landroid/graphics/Matrix;

    .line 188
    .line 189
    iget-object v12, v9, La/ywq0;->a:Ljava/lang/Object;

    .line 190
    .line 191
    check-cast v12, Landroid/graphics/Matrix;

    .line 192
    .line 193
    invoke-virtual {v6, v12}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 194
    .line 195
    .line 196
    iget-object v12, v9, La/ywq0;->c:Ljava/lang/Object;

    .line 197
    .line 198
    check-cast v12, La/xju0;

    .line 199
    .line 200
    iget-object v12, v12, La/xju0;->a:Landroid/graphics/Matrix;

    .line 201
    .line 202
    invoke-virtual {v6, v12}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 203
    .line 204
    .line 205
    iget-object v9, v9, La/ywq0;->b:Ljava/lang/Object;

    .line 206
    .line 207
    check-cast v9, Landroid/graphics/Matrix;

    .line 208
    .line 209
    invoke-virtual {v6, v9}, Landroid/graphics/Matrix;->postConcat(Landroid/graphics/Matrix;)Z

    .line 210
    .line 211
    .line 212
    invoke-virtual {v6, v10}, Landroid/graphics/Matrix;->mapPoints([F)V

    .line 213
    .line 214
    .line 215
    iget-object v6, v8, La/v500;->f:La/e3u0;

    .line 216
    .line 217
    if-nez v6, :cond_7

    .line 218
    .line 219
    sget-object v6, La/dut0;->g:La/zyj;

    .line 220
    .line 221
    :cond_7
    iget-object v9, v8, La/v500;->l:La/cp10;

    .line 222
    .line 223
    sget-object v12, La/cp10;->d:La/z960;

    .line 224
    .line 225
    invoke-virtual {v12}, La/z960;->b()La/y960;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    check-cast v12, La/cp10;

    .line 230
    .line 231
    iget v13, v9, La/cp10;->b:F

    .line 232
    .line 233
    iput v13, v12, La/cp10;->b:F

    .line 234
    .line 235
    iget v9, v9, La/cp10;->c:F

    .line 236
    .line 237
    iput v9, v12, La/cp10;->c:F

    .line 238
    .line 239
    invoke-static {v13}, La/dut0;->c(F)F

    .line 240
    .line 241
    .line 242
    move-result v9

    .line 243
    iput v9, v12, La/cp10;->b:F

    .line 244
    .line 245
    iget v9, v12, La/cp10;->c:F

    .line 246
    .line 247
    invoke-static {v9}, La/dut0;->c(F)F

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    iput v9, v12, La/cp10;->c:F

    .line 252
    .line 253
    const/4 v9, 0x0

    .line 254
    :goto_3
    array-length v13, v10

    .line 255
    if-ge v9, v13, :cond_8

    .line 256
    .line 257
    aget v13, v10, v9

    .line 258
    .line 259
    add-int/lit8 v14, v9, 0x1

    .line 260
    .line 261
    aget v14, v10, v14

    .line 262
    .line 263
    invoke-virtual {v0, v13}, La/xju0;->c(F)Z

    .line 264
    .line 265
    .line 266
    move-result v15

    .line 267
    if-nez v15, :cond_9

    .line 268
    .line 269
    :cond_8
    move-object/from16 v16, v0

    .line 270
    .line 271
    move-object/from16 v18, v1

    .line 272
    .line 273
    move-object/from16 v20, v3

    .line 274
    .line 275
    move-object/from16 v1, p1

    .line 276
    .line 277
    goto/16 :goto_6

    .line 278
    .line 279
    :cond_9
    invoke-virtual {v0, v13}, La/xju0;->b(F)Z

    .line 280
    .line 281
    .line 282
    move-result v15

    .line 283
    if-eqz v15, :cond_b

    .line 284
    .line 285
    iget-object v15, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 286
    .line 287
    move-object/from16 v16, v0

    .line 288
    .line 289
    iget v0, v15, Landroid/graphics/RectF;->top:F

    .line 290
    .line 291
    cmpg-float v0, v0, v14

    .line 292
    .line 293
    if-gtz v0, :cond_c

    .line 294
    .line 295
    const/high16 v17, 0x42c80000    # 100.0f

    .line 296
    .line 297
    mul-float v0, v14, v17

    .line 298
    .line 299
    float-to-int v0, v0

    .line 300
    int-to-float v0, v0

    .line 301
    div-float v0, v0, v17

    .line 302
    .line 303
    iget v15, v15, Landroid/graphics/RectF;->bottom:F

    .line 304
    .line 305
    cmpl-float v0, v15, v0

    .line 306
    .line 307
    if-ltz v0, :cond_c

    .line 308
    .line 309
    div-int/lit8 v0, v9, 0x2

    .line 310
    .line 311
    iget v15, v3, La/hu5;->b:I

    .line 312
    .line 313
    add-int/2addr v15, v0

    .line 314
    invoke-virtual {v8, v15}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 315
    .line 316
    .line 317
    move-result-object v15

    .line 318
    move/from16 v17, v0

    .line 319
    .line 320
    iget-boolean v0, v8, La/v500;->j:Z

    .line 321
    .line 322
    if-eqz v0, :cond_a

    .line 323
    .line 324
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 325
    .line 326
    .line 327
    iget v0, v15, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 328
    .line 329
    invoke-virtual {v6, v0}, La/e3u0;->a(F)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v0

    .line 333
    move-object/from16 v18, v1

    .line 334
    .line 335
    int-to-float v1, v11

    .line 336
    sub-float/2addr v14, v1

    .line 337
    iget-object v1, v8, La/v500;->b:Ljava/util/ArrayList;

    .line 338
    .line 339
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 340
    .line 341
    .line 342
    move-result v19

    .line 343
    move-object/from16 v20, v3

    .line 344
    .line 345
    rem-int v3, v17, v19

    .line 346
    .line 347
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    move-result-object v1

    .line 351
    check-cast v1, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    invoke-virtual {v2, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 358
    .line 359
    .line 360
    move-object/from16 v1, p1

    .line 361
    .line 362
    invoke-virtual {v1, v0, v13, v14, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 363
    .line 364
    .line 365
    goto :goto_4

    .line 366
    :cond_a
    move-object/from16 v18, v1

    .line 367
    .line 368
    move-object/from16 v20, v3

    .line 369
    .line 370
    move-object/from16 v1, p1

    .line 371
    .line 372
    :goto_4
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    goto :goto_5

    .line 376
    :cond_b
    move-object/from16 v16, v0

    .line 377
    .line 378
    :cond_c
    move-object/from16 v18, v1

    .line 379
    .line 380
    move-object/from16 v20, v3

    .line 381
    .line 382
    move-object/from16 v1, p1

    .line 383
    .line 384
    :goto_5
    add-int/lit8 v9, v9, 0x2

    .line 385
    .line 386
    move-object/from16 v0, v16

    .line 387
    .line 388
    move-object/from16 v1, v18

    .line 389
    .line 390
    move-object/from16 v3, v20

    .line 391
    .line 392
    goto/16 :goto_3

    .line 393
    .line 394
    :goto_6
    sget-object v0, La/cp10;->d:La/z960;

    .line 395
    .line 396
    invoke-virtual {v0, v12}, La/z960;->c(La/y960;)V

    .line 397
    .line 398
    .line 399
    :goto_7
    add-int/lit8 v7, v7, 0x1

    .line 400
    .line 401
    move-object/from16 v0, v16

    .line 402
    .line 403
    move-object/from16 v1, v18

    .line 404
    .line 405
    move-object/from16 v3, v20

    .line 406
    .line 407
    goto/16 :goto_0

    .line 408
    .line 409
    :cond_d
    return-void
.end method

.method public final o1(Landroid/graphics/Canvas;La/v500;Landroid/graphics/Path;La/ywq0;La/hu5;)V
    .locals 2

    .line 1
    iget-object v0, p2, La/v500;->H:La/usd;

    .line 2
    .line 3
    iget-object p0, p0, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-static {p2, p0}, La/usd;->c(La/v500;La/q500;)F

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    iget v0, p5, La/hu5;->b:I

    .line 13
    .line 14
    iget v1, p5, La/hu5;->d:I

    .line 15
    .line 16
    add-int/2addr v0, v1

    .line 17
    invoke-virtual {p2, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iget v0, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 22
    .line 23
    invoke-virtual {p3, v0, p0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 24
    .line 25
    .line 26
    iget p5, p5, La/hu5;->b:I

    .line 27
    .line 28
    invoke-virtual {p2, p5}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    iget p5, p5, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 33
    .line 34
    invoke-virtual {p3, p5, p0}, Landroid/graphics/Path;->lineTo(FF)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p3}, Landroid/graphics/Path;->close()V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p4, p3}, La/ywq0;->u(Landroid/graphics/Path;)V

    .line 41
    .line 42
    .line 43
    iget p0, p2, La/v500;->x:I

    .line 44
    .line 45
    iget-byte p2, p2, La/v500;->y:B

    .line 46
    .line 47
    shl-int/lit8 p2, p2, 0x18

    .line 48
    .line 49
    const p4, 0xffffff

    .line 50
    .line 51
    .line 52
    and-int/2addr p0, p4

    .line 53
    or-int/2addr p0, p2

    .line 54
    sget-object p2, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    invoke-virtual {p1, p3}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, p2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 67
    .line 68
    .line 69
    return-void
.end method
