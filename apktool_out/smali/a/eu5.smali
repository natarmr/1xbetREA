.class public abstract La/eu5;
.super La/kwb;
.source "SourceFile"

# interfaces
.implements La/pwb;


# instance fields
.field public A1:La/ywq0;

.field public B1:La/vrv0;

.field public C1:J

.field public D1:J

.field public E1:Landroid/graphics/RectF;

.field public F1:Landroid/graphics/Matrix;

.field public G1:Z

.field public H1:La/bp10;

.field public I1:La/bp10;

.field public J1:[F

.field public f1:I

.field public g1:Z

.field public h1:Z

.field public i1:Z

.field public j1:Z

.field public k1:Z

.field public l1:Z

.field public m1:Z

.field public n1:Z

.field public o1:Landroid/graphics/Paint;

.field public p1:Landroid/graphics/Paint;

.field public q1:Z

.field public r1:Z

.field public s1:Z

.field public t1:F

.field public u1:Z

.field public v1:La/a2w0;

.field public w1:La/a2w0;

.field public x1:La/b2w0;

.field public y1:La/b2w0;

.field public z1:La/ywq0;


# virtual methods
.method public final a()V
    .locals 11

    .line 1
    iget-object v0, p0, La/eu5;->E1:Landroid/graphics/RectF;

    .line 2
    .line 3
    iget-object v1, p0, La/kwb;->r:La/xju0;

    .line 4
    .line 5
    iget-boolean v2, p0, La/eu5;->G1:Z

    .line 6
    .line 7
    if-nez v2, :cond_f

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    iput v2, v0, Landroid/graphics/RectF;->left:F

    .line 11
    .line 12
    iput v2, v0, Landroid/graphics/RectF;->right:F

    .line 13
    .line 14
    iput v2, v0, Landroid/graphics/RectF;->top:F

    .line 15
    .line 16
    iput v2, v0, Landroid/graphics/RectF;->bottom:F

    .line 17
    .line 18
    iget-object v3, p0, La/kwb;->l:La/vjz;

    .line 19
    .line 20
    const/4 v4, 0x2

    .line 21
    const/4 v5, 0x1

    .line 22
    if-eqz v3, :cond_9

    .line 23
    .line 24
    iget-boolean v6, v3, La/cgd;->a:Z

    .line 25
    .line 26
    if-eqz v6, :cond_9

    .line 27
    .line 28
    iget v3, v3, La/vjz;->i:I

    .line 29
    .line 30
    invoke-static {v3}, La/hne;->E(I)I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_6

    .line 35
    .line 36
    if-eq v3, v5, :cond_0

    .line 37
    .line 38
    goto/16 :goto_0

    .line 39
    .line 40
    :cond_0
    iget-object v3, p0, La/kwb;->l:La/vjz;

    .line 41
    .line 42
    iget v3, v3, La/vjz;->g:I

    .line 43
    .line 44
    invoke-static {v3}, La/hne;->E(I)I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    if-eq v3, v5, :cond_2

    .line 51
    .line 52
    if-eq v3, v4, :cond_1

    .line 53
    .line 54
    goto/16 :goto_0

    .line 55
    .line 56
    :cond_1
    iget v3, v0, Landroid/graphics/RectF;->right:F

    .line 57
    .line 58
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 59
    .line 60
    iget v7, v6, La/vjz;->r:F

    .line 61
    .line 62
    iget v8, v1, La/xju0;->c:F

    .line 63
    .line 64
    iget v6, v6, La/vjz;->q:F

    .line 65
    .line 66
    mul-float/2addr v8, v6

    .line 67
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 72
    .line 73
    iget v7, v7, La/cgd;->b:F

    .line 74
    .line 75
    add-float/2addr v6, v7

    .line 76
    add-float/2addr v6, v3

    .line 77
    iput v6, v0, Landroid/graphics/RectF;->right:F

    .line 78
    .line 79
    goto/16 :goto_0

    .line 80
    .line 81
    :cond_2
    iget-object v3, p0, La/kwb;->l:La/vjz;

    .line 82
    .line 83
    iget v3, v3, La/vjz;->h:I

    .line 84
    .line 85
    invoke-static {v3}, La/hne;->E(I)I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_4

    .line 90
    .line 91
    if-eq v3, v4, :cond_3

    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_3
    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    .line 96
    .line 97
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 98
    .line 99
    iget v7, v6, La/vjz;->s:F

    .line 100
    .line 101
    iget v8, v1, La/xju0;->d:F

    .line 102
    .line 103
    iget v6, v6, La/vjz;->q:F

    .line 104
    .line 105
    mul-float/2addr v8, v6

    .line 106
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 111
    .line 112
    iget v7, v7, La/cgd;->c:F

    .line 113
    .line 114
    add-float/2addr v6, v7

    .line 115
    add-float/2addr v6, v3

    .line 116
    iput v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_4
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 120
    .line 121
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 122
    .line 123
    iget v7, v6, La/vjz;->s:F

    .line 124
    .line 125
    iget v8, v1, La/xju0;->d:F

    .line 126
    .line 127
    iget v6, v6, La/vjz;->q:F

    .line 128
    .line 129
    mul-float/2addr v8, v6

    .line 130
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 131
    .line 132
    .line 133
    move-result v6

    .line 134
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 135
    .line 136
    iget v7, v7, La/cgd;->c:F

    .line 137
    .line 138
    add-float/2addr v6, v7

    .line 139
    add-float/2addr v6, v3

    .line 140
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 141
    .line 142
    goto :goto_0

    .line 143
    :cond_5
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 144
    .line 145
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 146
    .line 147
    iget v7, v6, La/vjz;->r:F

    .line 148
    .line 149
    iget v8, v1, La/xju0;->c:F

    .line 150
    .line 151
    iget v6, v6, La/vjz;->q:F

    .line 152
    .line 153
    mul-float/2addr v8, v6

    .line 154
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 159
    .line 160
    iget v7, v7, La/cgd;->b:F

    .line 161
    .line 162
    add-float/2addr v6, v7

    .line 163
    add-float/2addr v6, v3

    .line 164
    iput v6, v0, Landroid/graphics/RectF;->left:F

    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_6
    iget-object v3, p0, La/kwb;->l:La/vjz;

    .line 168
    .line 169
    iget v3, v3, La/vjz;->h:I

    .line 170
    .line 171
    invoke-static {v3}, La/hne;->E(I)I

    .line 172
    .line 173
    .line 174
    move-result v3

    .line 175
    if-eqz v3, :cond_8

    .line 176
    .line 177
    if-eq v3, v4, :cond_7

    .line 178
    .line 179
    goto :goto_0

    .line 180
    :cond_7
    iget v3, v0, Landroid/graphics/RectF;->bottom:F

    .line 181
    .line 182
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 183
    .line 184
    iget v7, v6, La/vjz;->s:F

    .line 185
    .line 186
    iget v8, v1, La/xju0;->d:F

    .line 187
    .line 188
    iget v6, v6, La/vjz;->q:F

    .line 189
    .line 190
    mul-float/2addr v8, v6

    .line 191
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 192
    .line 193
    .line 194
    move-result v6

    .line 195
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 196
    .line 197
    iget v7, v7, La/cgd;->c:F

    .line 198
    .line 199
    add-float/2addr v6, v7

    .line 200
    add-float/2addr v6, v3

    .line 201
    iput v6, v0, Landroid/graphics/RectF;->bottom:F

    .line 202
    .line 203
    goto :goto_0

    .line 204
    :cond_8
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 205
    .line 206
    iget-object v6, p0, La/kwb;->l:La/vjz;

    .line 207
    .line 208
    iget v7, v6, La/vjz;->s:F

    .line 209
    .line 210
    iget v8, v1, La/xju0;->d:F

    .line 211
    .line 212
    iget v6, v6, La/vjz;->q:F

    .line 213
    .line 214
    mul-float/2addr v8, v6

    .line 215
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    iget-object v7, p0, La/kwb;->l:La/vjz;

    .line 220
    .line 221
    iget v7, v7, La/cgd;->c:F

    .line 222
    .line 223
    add-float/2addr v6, v7

    .line 224
    add-float/2addr v6, v3

    .line 225
    iput v6, v0, Landroid/graphics/RectF;->top:F

    .line 226
    .line 227
    :cond_9
    :goto_0
    iget v3, v0, Landroid/graphics/RectF;->left:F

    .line 228
    .line 229
    add-float/2addr v3, v2

    .line 230
    iget v6, v0, Landroid/graphics/RectF;->top:F

    .line 231
    .line 232
    add-float/2addr v6, v2

    .line 233
    iget v7, v0, Landroid/graphics/RectF;->right:F

    .line 234
    .line 235
    add-float/2addr v7, v2

    .line 236
    iget v0, v0, Landroid/graphics/RectF;->bottom:F

    .line 237
    .line 238
    add-float/2addr v0, v2

    .line 239
    iget-object v2, p0, La/eu5;->v1:La/a2w0;

    .line 240
    .line 241
    iget-boolean v8, v2, La/cgd;->a:Z

    .line 242
    .line 243
    if-eqz v8, :cond_a

    .line 244
    .line 245
    iget-boolean v8, v2, La/wa5;->n:Z

    .line 246
    .line 247
    if-eqz v8, :cond_a

    .line 248
    .line 249
    iget-object v8, p0, La/eu5;->x1:La/b2w0;

    .line 250
    .line 251
    iget-object v8, v8, La/xa5;->f:Landroid/graphics/Paint;

    .line 252
    .line 253
    invoke-virtual {v2, v8}, La/a2w0;->d(Landroid/graphics/Paint;)F

    .line 254
    .line 255
    .line 256
    move-result v2

    .line 257
    add-float/2addr v3, v2

    .line 258
    :cond_a
    iget-object v2, p0, La/eu5;->w1:La/a2w0;

    .line 259
    .line 260
    iget-boolean v8, v2, La/cgd;->a:Z

    .line 261
    .line 262
    if-eqz v8, :cond_b

    .line 263
    .line 264
    iget-boolean v8, v2, La/wa5;->n:Z

    .line 265
    .line 266
    if-eqz v8, :cond_b

    .line 267
    .line 268
    iget-object v8, p0, La/eu5;->y1:La/b2w0;

    .line 269
    .line 270
    iget-object v8, v8, La/xa5;->f:Landroid/graphics/Paint;

    .line 271
    .line 272
    invoke-virtual {v2, v8}, La/a2w0;->d(Landroid/graphics/Paint;)F

    .line 273
    .line 274
    .line 275
    move-result v2

    .line 276
    add-float/2addr v7, v2

    .line 277
    :cond_b
    iget-object v2, p0, La/kwb;->i:La/urv0;

    .line 278
    .line 279
    iget-boolean v8, v2, La/cgd;->a:Z

    .line 280
    .line 281
    if-eqz v8, :cond_e

    .line 282
    .line 283
    iget-boolean v8, v2, La/wa5;->n:Z

    .line 284
    .line 285
    if-eqz v8, :cond_e

    .line 286
    .line 287
    iget v8, v2, La/urv0;->v:I

    .line 288
    .line 289
    int-to-float v8, v8

    .line 290
    iget v9, v2, La/cgd;->c:F

    .line 291
    .line 292
    add-float/2addr v8, v9

    .line 293
    iget v2, v2, La/urv0;->x:I

    .line 294
    .line 295
    if-ne v2, v4, :cond_c

    .line 296
    .line 297
    add-float/2addr v0, v8

    .line 298
    goto :goto_2

    .line 299
    :cond_c
    if-ne v2, v5, :cond_d

    .line 300
    .line 301
    :goto_1
    add-float/2addr v6, v8

    .line 302
    goto :goto_2

    .line 303
    :cond_d
    const/4 v4, 0x3

    .line 304
    if-ne v2, v4, :cond_e

    .line 305
    .line 306
    add-float/2addr v0, v8

    .line 307
    goto :goto_1

    .line 308
    :cond_e
    :goto_2
    invoke-virtual {p0}, La/kwb;->getExtraTopOffset()F

    .line 309
    .line 310
    .line 311
    move-result v2

    .line 312
    add-float/2addr v2, v6

    .line 313
    invoke-virtual {p0}, La/kwb;->getExtraRightOffset()F

    .line 314
    .line 315
    .line 316
    move-result v4

    .line 317
    add-float/2addr v4, v7

    .line 318
    invoke-virtual {p0}, La/kwb;->getExtraBottomOffset()F

    .line 319
    .line 320
    .line 321
    move-result v5

    .line 322
    add-float/2addr v5, v0

    .line 323
    invoke-virtual {p0}, La/kwb;->getExtraLeftOffset()F

    .line 324
    .line 325
    .line 326
    move-result v0

    .line 327
    add-float/2addr v0, v3

    .line 328
    iget v3, p0, La/eu5;->t1:F

    .line 329
    .line 330
    invoke-static {v3}, La/dut0;->c(F)F

    .line 331
    .line 332
    .line 333
    move-result v3

    .line 334
    invoke-static {v3, v0}, Ljava/lang/Math;->max(FF)F

    .line 335
    .line 336
    .line 337
    move-result v6

    .line 338
    invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F

    .line 339
    .line 340
    .line 341
    move-result v7

    .line 342
    invoke-static {v3, v4}, Ljava/lang/Math;->max(FF)F

    .line 343
    .line 344
    .line 345
    move-result v8

    .line 346
    invoke-static {v3, v5}, Ljava/lang/Math;->max(FF)F

    .line 347
    .line 348
    .line 349
    move-result v3

    .line 350
    iget-object v9, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 351
    .line 352
    iget v10, v1, La/xju0;->c:F

    .line 353
    .line 354
    sub-float/2addr v10, v8

    .line 355
    iget v8, v1, La/xju0;->d:F

    .line 356
    .line 357
    sub-float/2addr v8, v3

    .line 358
    invoke-virtual {v9, v6, v7, v10, v8}, Landroid/graphics/RectF;->set(FFFF)V

    .line 359
    .line 360
    .line 361
    iget-boolean v3, p0, La/kwb;->a:Z

    .line 362
    .line 363
    if-eqz v3, :cond_f

    .line 364
    .line 365
    const-string v3, ", offsetTop: "

    .line 366
    .line 367
    const-string v6, ", offsetRight: "

    .line 368
    .line 369
    const-string v7, "offsetLeft: "

    .line 370
    .line 371
    invoke-static {v0, v2, v7, v3, v6}, La/dw9;->s(FFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    const-string v2, ", offsetBottom: "

    .line 379
    .line 380
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    const-string v2, "MPAndroidChart"

    .line 391
    .line 392
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 393
    .line 394
    .line 395
    new-instance v0, Ljava/lang/StringBuilder;

    .line 396
    .line 397
    const-string v3, "Content: "

    .line 398
    .line 399
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 400
    .line 401
    .line 402
    iget-object v1, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 403
    .line 404
    invoke-virtual {v1}, Landroid/graphics/RectF;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v1

    .line 408
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    invoke-static {v2, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 416
    .line 417
    .line 418
    :cond_f
    iget-object v0, p0, La/eu5;->A1:La/ywq0;

    .line 419
    .line 420
    iget-object v1, p0, La/eu5;->w1:La/a2w0;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    invoke-virtual {v0}, La/ywq0;->y()V

    .line 426
    .line 427
    .line 428
    iget-object v0, p0, La/eu5;->z1:La/ywq0;

    .line 429
    .line 430
    iget-object v1, p0, La/eu5;->v1:La/a2w0;

    .line 431
    .line 432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, La/ywq0;->y()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {p0}, La/eu5;->g()V

    .line 439
    .line 440
    .line 441
    return-void
.end method

.method public final computeScroll()V
    .locals 14

    .line 1
    iget-object p0, p0, La/kwb;->m:La/ywb;

    .line 2
    .line 3
    instance-of v0, p0, La/fu5;

    .line 4
    .line 5
    if-eqz v0, :cond_5

    .line 6
    .line 7
    check-cast p0, La/fu5;

    .line 8
    .line 9
    iget-object v0, p0, La/fu5;->p:La/cp10;

    .line 10
    .line 11
    iget-object v1, p0, La/ywb;->d:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 12
    .line 13
    iget-object v2, p0, La/fu5;->g:La/cp10;

    .line 14
    .line 15
    iget-object v3, p0, La/fu5;->o:La/cp10;

    .line 16
    .line 17
    iget v4, v0, La/cp10;->b:F

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    cmpl-float v4, v4, v5

    .line 21
    .line 22
    if-nez v4, :cond_0

    .line 23
    .line 24
    iget v4, v0, La/cp10;->c:F

    .line 25
    .line 26
    cmpl-float v4, v4, v5

    .line 27
    .line 28
    if-nez v4, :cond_0

    .line 29
    .line 30
    goto/16 :goto_3

    .line 31
    .line 32
    :cond_0
    invoke-static {}, Landroid/view/animation/AnimationUtils;->currentAnimationTimeMillis()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    iget v4, v0, La/cp10;->b:F

    .line 37
    .line 38
    invoke-virtual {v1}, La/kwb;->getDragDecelerationFrictionCoef()F

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    mul-float/2addr v8, v4

    .line 43
    iput v8, v0, La/cp10;->b:F

    .line 44
    .line 45
    iget v4, v0, La/cp10;->c:F

    .line 46
    .line 47
    invoke-virtual {v1}, La/kwb;->getDragDecelerationFrictionCoef()F

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    mul-float/2addr v8, v4

    .line 52
    iput v8, v0, La/cp10;->c:F

    .line 53
    .line 54
    iget-wide v9, p0, La/fu5;->n:J

    .line 55
    .line 56
    sub-long v9, v6, v9

    .line 57
    .line 58
    long-to-float v4, v9

    .line 59
    const/high16 v9, 0x447a0000    # 1000.0f

    .line 60
    .line 61
    div-float/2addr v4, v9

    .line 62
    iget v9, v0, La/cp10;->b:F

    .line 63
    .line 64
    mul-float/2addr v9, v4

    .line 65
    mul-float/2addr v8, v4

    .line 66
    iget v4, v3, La/cp10;->b:F

    .line 67
    .line 68
    add-float v11, v4, v9

    .line 69
    .line 70
    iput v11, v3, La/cp10;->b:F

    .line 71
    .line 72
    iget v4, v3, La/cp10;->c:F

    .line 73
    .line 74
    add-float v12, v4, v8

    .line 75
    .line 76
    iput v12, v3, La/cp10;->c:F

    .line 77
    .line 78
    const/4 v10, 0x2

    .line 79
    const/4 v13, 0x0

    .line 80
    move-wide v8, v6

    .line 81
    invoke-static/range {v6 .. v13}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    iget-boolean v8, v1, La/eu5;->k1:Z

    .line 86
    .line 87
    if-eqz v8, :cond_1

    .line 88
    .line 89
    iget v8, v3, La/cp10;->b:F

    .line 90
    .line 91
    iget v9, v2, La/cp10;->b:F

    .line 92
    .line 93
    sub-float/2addr v8, v9

    .line 94
    goto :goto_0

    .line 95
    :cond_1
    move v8, v5

    .line 96
    :goto_0
    iget-boolean v9, v1, La/eu5;->l1:Z

    .line 97
    .line 98
    if-eqz v9, :cond_2

    .line 99
    .line 100
    iget v3, v3, La/cp10;->c:F

    .line 101
    .line 102
    iget v2, v2, La/cp10;->c:F

    .line 103
    .line 104
    sub-float/2addr v3, v2

    .line 105
    goto :goto_1

    .line 106
    :cond_2
    move v3, v5

    .line 107
    :goto_1
    iget-object v2, p0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 108
    .line 109
    iget-object v9, p0, La/fu5;->f:Landroid/graphics/Matrix;

    .line 110
    .line 111
    invoke-virtual {v2, v9}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, La/kwb;->getOnChartGestureListener()La/mg60;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, La/fu5;->b()V

    .line 118
    .line 119
    .line 120
    iget-object v2, p0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 121
    .line 122
    invoke-virtual {v2, v8, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 123
    .line 124
    .line 125
    invoke-virtual {v4}, Landroid/view/MotionEvent;->recycle()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, La/kwb;->getViewPortHandler()La/xju0;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    iget-object v3, p0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 133
    .line 134
    const/4 v4, 0x0

    .line 135
    invoke-virtual {v2, v3, v1, v4}, La/xju0;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 136
    .line 137
    .line 138
    iput-object v3, p0, La/fu5;->e:Landroid/graphics/Matrix;

    .line 139
    .line 140
    iput-wide v6, p0, La/fu5;->n:J

    .line 141
    .line 142
    iget p0, v0, La/cp10;->b:F

    .line 143
    .line 144
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    float-to-double v2, p0

    .line 149
    const-wide v6, 0x3f847ae147ae147bL    # 0.01

    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    cmpl-double p0, v2, v6

    .line 155
    .line 156
    if-gez p0, :cond_4

    .line 157
    .line 158
    iget p0, v0, La/cp10;->c:F

    .line 159
    .line 160
    invoke-static {p0}, Ljava/lang/Math;->abs(F)F

    .line 161
    .line 162
    .line 163
    move-result p0

    .line 164
    float-to-double v2, p0

    .line 165
    cmpl-double p0, v2, v6

    .line 166
    .line 167
    if-ltz p0, :cond_3

    .line 168
    .line 169
    goto :goto_2

    .line 170
    :cond_3
    invoke-virtual {v1}, La/eu5;->a()V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, Landroid/view/View;->postInvalidate()V

    .line 174
    .line 175
    .line 176
    iput v5, v0, La/cp10;->b:F

    .line 177
    .line 178
    iput v5, v0, La/cp10;->c:F

    .line 179
    .line 180
    return-void

    .line 181
    :cond_4
    :goto_2
    sget-object p0, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 182
    .line 183
    invoke-virtual {v1}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 184
    .line 185
    .line 186
    :cond_5
    :goto_3
    return-void
.end method

.method public final d()V
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/kwb;->b:La/mwb;

    .line 4
    .line 5
    iget-boolean v2, v0, La/kwb;->a:Z

    .line 6
    .line 7
    const-string v3, "MPAndroidChart"

    .line 8
    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    const-string v0, "Preparing... DATA NOT SET."

    .line 14
    .line 15
    invoke-static {v3, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void

    .line 19
    :cond_1
    if-eqz v2, :cond_2

    .line 20
    .line 21
    const-string v1, "Preparing..."

    .line 22
    .line 23
    invoke-static {v3, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    .line 25
    .line 26
    :cond_2
    iget-object v1, v0, La/kwb;->i:La/urv0;

    .line 27
    .line 28
    iget-object v2, v0, La/kwb;->b:La/mwb;

    .line 29
    .line 30
    check-cast v2, La/gu5;

    .line 31
    .line 32
    iget v3, v2, La/mwb;->d:F

    .line 33
    .line 34
    iget v2, v2, La/mwb;->c:F

    .line 35
    .line 36
    invoke-virtual {v1, v3, v2}, La/wa5;->a(FF)V

    .line 37
    .line 38
    .line 39
    iget-object v1, v0, La/eu5;->v1:La/a2w0;

    .line 40
    .line 41
    iget-object v2, v0, La/kwb;->b:La/mwb;

    .line 42
    .line 43
    check-cast v2, La/gu5;

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    invoke-virtual {v2, v3}, La/mwb;->f(I)F

    .line 47
    .line 48
    .line 49
    move-result v2

    .line 50
    iget-object v4, v0, La/kwb;->b:La/mwb;

    .line 51
    .line 52
    check-cast v4, La/gu5;

    .line 53
    .line 54
    invoke-virtual {v4, v3}, La/mwb;->e(I)F

    .line 55
    .line 56
    .line 57
    move-result v4

    .line 58
    invoke-virtual {v1, v2, v4}, La/a2w0;->a(FF)V

    .line 59
    .line 60
    .line 61
    iget-object v1, v0, La/eu5;->w1:La/a2w0;

    .line 62
    .line 63
    iget-object v2, v0, La/kwb;->b:La/mwb;

    .line 64
    .line 65
    check-cast v2, La/gu5;

    .line 66
    .line 67
    const/4 v4, 0x2

    .line 68
    invoke-virtual {v2, v4}, La/mwb;->f(I)F

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    iget-object v5, v0, La/kwb;->b:La/mwb;

    .line 73
    .line 74
    check-cast v5, La/gu5;

    .line 75
    .line 76
    invoke-virtual {v5, v4}, La/mwb;->e(I)F

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    invoke-virtual {v1, v2, v4}, La/a2w0;->a(FF)V

    .line 81
    .line 82
    .line 83
    iget-object v1, v0, La/eu5;->x1:La/b2w0;

    .line 84
    .line 85
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 86
    .line 87
    iget v4, v2, La/wa5;->t:F

    .line 88
    .line 89
    iget v2, v2, La/wa5;->s:F

    .line 90
    .line 91
    invoke-virtual {v1, v4, v2}, La/xa5;->n1(FF)V

    .line 92
    .line 93
    .line 94
    iget-object v1, v0, La/eu5;->y1:La/b2w0;

    .line 95
    .line 96
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 97
    .line 98
    iget v4, v2, La/wa5;->t:F

    .line 99
    .line 100
    iget v2, v2, La/wa5;->s:F

    .line 101
    .line 102
    invoke-virtual {v1, v4, v2}, La/xa5;->n1(FF)V

    .line 103
    .line 104
    .line 105
    iget-object v1, v0, La/eu5;->B1:La/vrv0;

    .line 106
    .line 107
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 108
    .line 109
    iget v4, v2, La/wa5;->t:F

    .line 110
    .line 111
    iget v2, v2, La/wa5;->s:F

    .line 112
    .line 113
    invoke-virtual {v1, v4, v2}, La/vrv0;->n1(FF)V

    .line 114
    .line 115
    .line 116
    iget-object v1, v0, La/kwb;->l:La/vjz;

    .line 117
    .line 118
    if-eqz v1, :cond_2a

    .line 119
    .line 120
    iget-object v1, v0, La/kwb;->o:La/xjz;

    .line 121
    .line 122
    iget-object v2, v0, La/kwb;->b:La/mwb;

    .line 123
    .line 124
    iget-object v4, v1, La/xjz;->c:Landroid/graphics/Paint;

    .line 125
    .line 126
    iget-object v5, v1, La/xjz;->e:La/vjz;

    .line 127
    .line 128
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    iget-object v6, v1, La/xjz;->f:Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 134
    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    :goto_0
    iget-object v9, v2, La/mwb;->i:Ljava/util/ArrayList;

    .line 138
    .line 139
    if-nez v9, :cond_3

    .line 140
    .line 141
    const/4 v9, 0x0

    .line 142
    goto :goto_1

    .line 143
    :cond_3
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 144
    .line 145
    .line 146
    move-result v9

    .line 147
    :goto_1
    if-ge v8, v9, :cond_6

    .line 148
    .line 149
    invoke-virtual {v2, v8}, La/mwb;->c(I)La/iuw;

    .line 150
    .line 151
    .line 152
    move-result-object v9

    .line 153
    move-object v10, v9

    .line 154
    check-cast v10, La/v500;

    .line 155
    .line 156
    iget-object v10, v10, La/v500;->a:Ljava/util/ArrayList;

    .line 157
    .line 158
    move-object v11, v9

    .line 159
    check-cast v11, La/v500;

    .line 160
    .line 161
    iget-object v11, v11, La/v500;->o:Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 164
    .line 165
    .line 166
    move-result v11

    .line 167
    const/4 v12, 0x0

    .line 168
    :goto_2
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 169
    .line 170
    .line 171
    move-result v13

    .line 172
    if-ge v12, v13, :cond_5

    .line 173
    .line 174
    if-ge v12, v11, :cond_5

    .line 175
    .line 176
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    sub-int/2addr v13, v3

    .line 181
    if-ge v12, v13, :cond_4

    .line 182
    .line 183
    add-int/lit8 v13, v11, -0x1

    .line 184
    .line 185
    if-ge v12, v13, :cond_4

    .line 186
    .line 187
    const/4 v13, 0x0

    .line 188
    goto :goto_3

    .line 189
    :cond_4
    invoke-virtual {v2, v8}, La/mwb;->c(I)La/iuw;

    .line 190
    .line 191
    .line 192
    move-result-object v13

    .line 193
    check-cast v13, La/v500;

    .line 194
    .line 195
    iget-object v13, v13, La/v500;->c:Ljava/lang/String;

    .line 196
    .line 197
    :goto_3
    new-instance v14, La/wjz;

    .line 198
    .line 199
    move-object v15, v9

    .line 200
    check-cast v15, La/v500;

    .line 201
    .line 202
    iget v7, v15, La/v500;->g:I

    .line 203
    .line 204
    iget v3, v15, La/v500;->h:F

    .line 205
    .line 206
    iget v15, v15, La/v500;->i:F

    .line 207
    .line 208
    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v17

    .line 212
    check-cast v17, Ljava/lang/Integer;

    .line 213
    .line 214
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    .line 215
    .line 216
    .line 217
    move-result v0

    .line 218
    invoke-direct {v14}, Ljava/lang/Object;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object v13, v14, La/wjz;->a:Ljava/lang/String;

    .line 222
    .line 223
    iput v7, v14, La/wjz;->b:I

    .line 224
    .line 225
    iput v3, v14, La/wjz;->c:F

    .line 226
    .line 227
    iput v15, v14, La/wjz;->d:F

    .line 228
    .line 229
    iput v0, v14, La/wjz;->e:I

    .line 230
    .line 231
    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 232
    .line 233
    .line 234
    add-int/lit8 v12, v12, 0x1

    .line 235
    .line 236
    const/4 v3, 0x1

    .line 237
    move-object/from16 v0, p0

    .line 238
    .line 239
    goto :goto_2

    .line 240
    :cond_5
    add-int/lit8 v8, v8, 0x1

    .line 241
    .line 242
    const/4 v3, 0x1

    .line 243
    move-object/from16 v0, p0

    .line 244
    .line 245
    goto :goto_0

    .line 246
    :cond_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 247
    .line 248
    .line 249
    move-result v0

    .line 250
    new-array v0, v0, [La/wjz;

    .line 251
    .line 252
    invoke-interface {v6, v0}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    check-cast v0, [La/wjz;

    .line 257
    .line 258
    iput-object v0, v5, La/vjz;->f:[La/wjz;

    .line 259
    .line 260
    iget v0, v5, La/cgd;->d:F

    .line 261
    .line 262
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 263
    .line 264
    .line 265
    iget v0, v5, La/cgd;->e:I

    .line 266
    .line 267
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    .line 269
    .line 270
    iget-object v0, v1, La/p4;->b:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v0, La/xju0;

    .line 273
    .line 274
    iget-object v1, v5, La/vjz;->u:Ljava/util/ArrayList;

    .line 275
    .line 276
    iget-object v2, v5, La/vjz;->t:Ljava/util/ArrayList;

    .line 277
    .line 278
    iget-object v3, v5, La/vjz;->v:Ljava/util/ArrayList;

    .line 279
    .line 280
    iget v6, v5, La/vjz;->l:F

    .line 281
    .line 282
    invoke-static {v6}, La/dut0;->c(F)F

    .line 283
    .line 284
    .line 285
    move-result v7

    .line 286
    iget v8, v5, La/vjz;->p:F

    .line 287
    .line 288
    invoke-static {v8}, La/dut0;->c(F)F

    .line 289
    .line 290
    .line 291
    move-result v8

    .line 292
    iget v9, v5, La/vjz;->o:F

    .line 293
    .line 294
    invoke-static {v9}, La/dut0;->c(F)F

    .line 295
    .line 296
    .line 297
    move-result v10

    .line 298
    iget v11, v5, La/vjz;->n:F

    .line 299
    .line 300
    invoke-static {v11}, La/dut0;->c(F)F

    .line 301
    .line 302
    .line 303
    move-result v11

    .line 304
    const/4 v12, 0x0

    .line 305
    invoke-static {v12}, La/dut0;->c(F)F

    .line 306
    .line 307
    .line 308
    move-result v13

    .line 309
    iget-object v14, v5, La/vjz;->f:[La/wjz;

    .line 310
    .line 311
    array-length v15, v14

    .line 312
    invoke-static {v9}, La/dut0;->c(F)F

    .line 313
    .line 314
    .line 315
    iget-object v9, v5, La/vjz;->f:[La/wjz;

    .line 316
    .line 317
    array-length v12, v9

    .line 318
    move/from16 v20, v6

    .line 319
    .line 320
    const/4 v6, 0x0

    .line 321
    const/16 v18, 0x0

    .line 322
    .line 323
    const/16 v19, 0x0

    .line 324
    .line 325
    :goto_4
    if-ge v6, v12, :cond_b

    .line 326
    .line 327
    move/from16 v21, v6

    .line 328
    .line 329
    aget-object v6, v9, v21

    .line 330
    .line 331
    move/from16 v22, v7

    .line 332
    .line 333
    iget v7, v6, La/wjz;->c:F

    .line 334
    .line 335
    invoke-static {v7}, Ljava/lang/Float;->isNaN(F)Z

    .line 336
    .line 337
    .line 338
    move-result v7

    .line 339
    if-eqz v7, :cond_7

    .line 340
    .line 341
    move/from16 v7, v20

    .line 342
    .line 343
    goto :goto_5

    .line 344
    :cond_7
    iget v7, v6, La/wjz;->c:F

    .line 345
    .line 346
    :goto_5
    invoke-static {v7}, La/dut0;->c(F)F

    .line 347
    .line 348
    .line 349
    move-result v7

    .line 350
    cmpl-float v23, v7, v19

    .line 351
    .line 352
    if-lez v23, :cond_8

    .line 353
    .line 354
    move/from16 v19, v7

    .line 355
    .line 356
    :cond_8
    iget-object v6, v6, La/wjz;->a:Ljava/lang/String;

    .line 357
    .line 358
    if-nez v6, :cond_9

    .line 359
    .line 360
    goto :goto_6

    .line 361
    :cond_9
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 362
    .line 363
    .line 364
    move-result v6

    .line 365
    float-to-int v6, v6

    .line 366
    int-to-float v6, v6

    .line 367
    cmpl-float v7, v6, v18

    .line 368
    .line 369
    if-lez v7, :cond_a

    .line 370
    .line 371
    move/from16 v18, v6

    .line 372
    .line 373
    :cond_a
    :goto_6
    add-int/lit8 v6, v21, 0x1

    .line 374
    .line 375
    move/from16 v7, v22

    .line 376
    .line 377
    goto :goto_4

    .line 378
    :cond_b
    move/from16 v22, v7

    .line 379
    .line 380
    iget-object v6, v5, La/vjz;->f:[La/wjz;

    .line 381
    .line 382
    array-length v7, v6

    .line 383
    const/4 v9, 0x0

    .line 384
    const/4 v12, 0x0

    .line 385
    :goto_7
    if-ge v12, v7, :cond_e

    .line 386
    .line 387
    move-object/from16 v18, v6

    .line 388
    .line 389
    aget-object v6, v18, v12

    .line 390
    .line 391
    iget-object v6, v6, La/wjz;->a:Ljava/lang/String;

    .line 392
    .line 393
    if-nez v6, :cond_c

    .line 394
    .line 395
    goto :goto_8

    .line 396
    :cond_c
    invoke-static {v4, v6}, La/dut0;->a(Landroid/graphics/Paint;Ljava/lang/String;)I

    .line 397
    .line 398
    .line 399
    move-result v6

    .line 400
    int-to-float v6, v6

    .line 401
    cmpl-float v19, v6, v9

    .line 402
    .line 403
    if-lez v19, :cond_d

    .line 404
    .line 405
    move v9, v6

    .line 406
    :cond_d
    :goto_8
    add-int/lit8 v12, v12, 0x1

    .line 407
    .line 408
    move-object/from16 v6, v18

    .line 409
    .line 410
    goto :goto_7

    .line 411
    :cond_e
    iget v6, v5, La/vjz;->i:I

    .line 412
    .line 413
    invoke-static {v6}, La/hne;->E(I)I

    .line 414
    .line 415
    .line 416
    move-result v6

    .line 417
    if-eqz v6, :cond_1b

    .line 418
    .line 419
    const/4 v7, 0x1

    .line 420
    if-eq v6, v7, :cond_f

    .line 421
    .line 422
    goto/16 :goto_19

    .line 423
    .line 424
    :cond_f
    sget-object v0, La/dut0;->e:Landroid/graphics/Paint$FontMetrics;

    .line 425
    .line 426
    invoke-virtual {v4, v0}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 427
    .line 428
    .line 429
    iget v1, v0, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 430
    .line 431
    iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 432
    .line 433
    sub-float/2addr v1, v0

    .line 434
    const/4 v0, 0x0

    .line 435
    const/4 v2, 0x0

    .line 436
    const/4 v3, 0x0

    .line 437
    const/4 v6, 0x0

    .line 438
    const/4 v7, 0x0

    .line 439
    :goto_9
    if-ge v6, v15, :cond_1a

    .line 440
    .line 441
    aget-object v9, v14, v6

    .line 442
    .line 443
    iget v11, v9, La/wjz;->b:I

    .line 444
    .line 445
    iget v12, v9, La/wjz;->c:F

    .line 446
    .line 447
    move/from16 v18, v1

    .line 448
    .line 449
    const/4 v1, 0x1

    .line 450
    if-eq v11, v1, :cond_10

    .line 451
    .line 452
    const/4 v1, 0x1

    .line 453
    goto :goto_a

    .line 454
    :cond_10
    const/4 v1, 0x0

    .line 455
    :goto_a
    invoke-static {v12}, Ljava/lang/Float;->isNaN(F)Z

    .line 456
    .line 457
    .line 458
    move-result v11

    .line 459
    if-eqz v11, :cond_11

    .line 460
    .line 461
    move/from16 v11, v22

    .line 462
    .line 463
    goto :goto_b

    .line 464
    :cond_11
    invoke-static {v12}, La/dut0;->c(F)F

    .line 465
    .line 466
    .line 467
    move-result v11

    .line 468
    :goto_b
    iget-object v9, v9, La/wjz;->a:Ljava/lang/String;

    .line 469
    .line 470
    if-nez v7, :cond_12

    .line 471
    .line 472
    const/4 v3, 0x0

    .line 473
    :cond_12
    if-eqz v1, :cond_14

    .line 474
    .line 475
    if-eqz v7, :cond_13

    .line 476
    .line 477
    add-float/2addr v3, v8

    .line 478
    :cond_13
    add-float/2addr v3, v11

    .line 479
    :cond_14
    if-eqz v9, :cond_18

    .line 480
    .line 481
    if-eqz v1, :cond_15

    .line 482
    .line 483
    if-nez v7, :cond_15

    .line 484
    .line 485
    add-float v1, v3, v10

    .line 486
    .line 487
    goto :goto_c

    .line 488
    :cond_15
    if-eqz v7, :cond_16

    .line 489
    .line 490
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 491
    .line 492
    .line 493
    move-result v0

    .line 494
    add-float v1, v18, v13

    .line 495
    .line 496
    add-float/2addr v2, v1

    .line 497
    const/4 v1, 0x0

    .line 498
    const/4 v7, 0x0

    .line 499
    goto :goto_c

    .line 500
    :cond_16
    move v1, v3

    .line 501
    :goto_c
    invoke-virtual {v4, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    .line 502
    .line 503
    .line 504
    move-result v3

    .line 505
    float-to-int v3, v3

    .line 506
    int-to-float v3, v3

    .line 507
    add-float/2addr v1, v3

    .line 508
    add-int/lit8 v3, v15, -0x1

    .line 509
    .line 510
    if-ge v6, v3, :cond_17

    .line 511
    .line 512
    add-float v3, v18, v13

    .line 513
    .line 514
    add-float/2addr v3, v2

    .line 515
    move v2, v3

    .line 516
    :cond_17
    move v3, v1

    .line 517
    goto :goto_d

    .line 518
    :cond_18
    add-float/2addr v3, v11

    .line 519
    add-int/lit8 v1, v15, -0x1

    .line 520
    .line 521
    if-ge v6, v1, :cond_19

    .line 522
    .line 523
    add-float/2addr v3, v8

    .line 524
    :cond_19
    const/4 v7, 0x1

    .line 525
    :goto_d
    invoke-static {v0, v3}, Ljava/lang/Math;->max(FF)F

    .line 526
    .line 527
    .line 528
    move-result v0

    .line 529
    add-int/lit8 v6, v6, 0x1

    .line 530
    .line 531
    move/from16 v1, v18

    .line 532
    .line 533
    goto :goto_9

    .line 534
    :cond_1a
    iput v0, v5, La/vjz;->r:F

    .line 535
    .line 536
    iput v2, v5, La/vjz;->s:F

    .line 537
    .line 538
    goto/16 :goto_19

    .line 539
    .line 540
    :cond_1b
    sget-object v6, La/dut0;->e:Landroid/graphics/Paint$FontMetrics;

    .line 541
    .line 542
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 543
    .line 544
    .line 545
    iget v7, v6, Landroid/graphics/Paint$FontMetrics;->descent:F

    .line 546
    .line 547
    iget v9, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 548
    .line 549
    sub-float/2addr v7, v9

    .line 550
    invoke-virtual {v4, v6}, Landroid/graphics/Paint;->getFontMetrics(Landroid/graphics/Paint$FontMetrics;)F

    .line 551
    .line 552
    .line 553
    iget v9, v6, Landroid/graphics/Paint$FontMetrics;->ascent:F

    .line 554
    .line 555
    iget v12, v6, Landroid/graphics/Paint$FontMetrics;->top:F

    .line 556
    .line 557
    sub-float/2addr v9, v12

    .line 558
    iget v6, v6, Landroid/graphics/Paint$FontMetrics;->bottom:F

    .line 559
    .line 560
    add-float/2addr v9, v6

    .line 561
    add-float/2addr v9, v13

    .line 562
    iget-object v0, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 563
    .line 564
    invoke-virtual {v0}, Landroid/graphics/RectF;->width()F

    .line 565
    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 571
    .line 572
    .line 573
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 574
    .line 575
    .line 576
    const/4 v6, -0x1

    .line 577
    const/4 v12, 0x0

    .line 578
    const/4 v13, 0x0

    .line 579
    const/16 v18, 0x0

    .line 580
    .line 581
    const/16 v19, 0x0

    .line 582
    .line 583
    :goto_e
    if-ge v12, v15, :cond_28

    .line 584
    .line 585
    aget-object v0, v14, v12

    .line 586
    .line 587
    move/from16 v21, v8

    .line 588
    .line 589
    iget v8, v0, La/wjz;->b:I

    .line 590
    .line 591
    move/from16 v23, v9

    .line 592
    .line 593
    iget v9, v0, La/wjz;->c:F

    .line 594
    .line 595
    move/from16 v24, v9

    .line 596
    .line 597
    const/4 v9, 0x1

    .line 598
    if-eq v8, v9, :cond_1c

    .line 599
    .line 600
    const/4 v8, 0x1

    .line 601
    goto :goto_f

    .line 602
    :cond_1c
    const/4 v8, 0x0

    .line 603
    :goto_f
    invoke-static/range {v24 .. v24}, Ljava/lang/Float;->isNaN(F)Z

    .line 604
    .line 605
    .line 606
    move-result v9

    .line 607
    if-eqz v9, :cond_1d

    .line 608
    .line 609
    move/from16 v9, v22

    .line 610
    .line 611
    goto :goto_10

    .line 612
    :cond_1d
    invoke-static/range {v24 .. v24}, La/dut0;->c(F)F

    .line 613
    .line 614
    .line 615
    move-result v9

    .line 616
    :goto_10
    iget-object v0, v0, La/wjz;->a:Ljava/lang/String;

    .line 617
    .line 618
    move/from16 v24, v8

    .line 619
    .line 620
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 621
    .line 622
    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 623
    .line 624
    .line 625
    const/4 v8, -0x1

    .line 626
    if-ne v6, v8, :cond_1e

    .line 627
    .line 628
    const/4 v8, 0x0

    .line 629
    goto :goto_11

    .line 630
    :cond_1e
    add-float v8, v18, v21

    .line 631
    .line 632
    :goto_11
    if-eqz v0, :cond_20

    .line 633
    .line 634
    move-object/from16 v18, v1

    .line 635
    .line 636
    invoke-static {v4, v0}, La/dut0;->b(Landroid/graphics/Paint;Ljava/lang/String;)La/ruo;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 641
    .line 642
    .line 643
    if-eqz v24, :cond_1f

    .line 644
    .line 645
    add-float v1, v10, v9

    .line 646
    .line 647
    goto :goto_12

    .line 648
    :cond_1f
    const/4 v1, 0x0

    .line 649
    :goto_12
    add-float/2addr v8, v1

    .line 650
    invoke-virtual {v2, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    check-cast v1, La/ruo;

    .line 655
    .line 656
    iget v1, v1, La/ruo;->b:F

    .line 657
    .line 658
    add-float/2addr v8, v1

    .line 659
    move-object/from16 v25, v0

    .line 660
    .line 661
    const/4 v0, -0x1

    .line 662
    goto :goto_14

    .line 663
    :cond_20
    move-object/from16 v18, v1

    .line 664
    .line 665
    sget-object v1, La/ruo;->d:La/z960;

    .line 666
    .line 667
    invoke-virtual {v1}, La/z960;->b()La/y960;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    check-cast v1, La/ruo;

    .line 672
    .line 673
    move-object/from16 v25, v0

    .line 674
    .line 675
    const/4 v0, 0x0

    .line 676
    iput v0, v1, La/ruo;->b:F

    .line 677
    .line 678
    iput v0, v1, La/ruo;->c:F

    .line 679
    .line 680
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    if-eqz v24, :cond_21

    .line 684
    .line 685
    goto :goto_13

    .line 686
    :cond_21
    const/4 v9, 0x0

    .line 687
    :goto_13
    add-float/2addr v8, v9

    .line 688
    const/4 v0, -0x1

    .line 689
    if-ne v6, v0, :cond_22

    .line 690
    .line 691
    move v6, v12

    .line 692
    :cond_22
    :goto_14
    if-nez v25, :cond_23

    .line 693
    .line 694
    add-int/lit8 v1, v15, -0x1

    .line 695
    .line 696
    if-ne v12, v1, :cond_24

    .line 697
    .line 698
    :cond_23
    const/16 v17, 0x0

    .line 699
    .line 700
    goto :goto_15

    .line 701
    :cond_24
    const/16 v17, 0x0

    .line 702
    .line 703
    goto :goto_17

    .line 704
    :goto_15
    cmpl-float v1, v19, v17

    .line 705
    .line 706
    if-nez v1, :cond_25

    .line 707
    .line 708
    move/from16 v1, v17

    .line 709
    .line 710
    goto :goto_16

    .line 711
    :cond_25
    move v1, v11

    .line 712
    :goto_16
    add-float/2addr v1, v8

    .line 713
    add-float v1, v1, v19

    .line 714
    .line 715
    add-int/lit8 v9, v15, -0x1

    .line 716
    .line 717
    if-ne v12, v9, :cond_26

    .line 718
    .line 719
    sget-object v9, La/ruo;->d:La/z960;

    .line 720
    .line 721
    invoke-virtual {v9}, La/z960;->b()La/y960;

    .line 722
    .line 723
    .line 724
    move-result-object v9

    .line 725
    check-cast v9, La/ruo;

    .line 726
    .line 727
    iput v1, v9, La/ruo;->b:F

    .line 728
    .line 729
    iput v7, v9, La/ruo;->c:F

    .line 730
    .line 731
    invoke-virtual {v3, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    invoke-static {v13, v1}, Ljava/lang/Math;->max(FF)F

    .line 735
    .line 736
    .line 737
    move-result v13

    .line 738
    :cond_26
    move/from16 v19, v1

    .line 739
    .line 740
    :goto_17
    if-eqz v25, :cond_27

    .line 741
    .line 742
    move v6, v0

    .line 743
    :cond_27
    add-int/lit8 v12, v12, 0x1

    .line 744
    .line 745
    move-object/from16 v1, v18

    .line 746
    .line 747
    move/from16 v9, v23

    .line 748
    .line 749
    move/from16 v18, v8

    .line 750
    .line 751
    move/from16 v8, v21

    .line 752
    .line 753
    goto/16 :goto_e

    .line 754
    .line 755
    :cond_28
    move/from16 v23, v9

    .line 756
    .line 757
    iput v13, v5, La/vjz;->r:F

    .line 758
    .line 759
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 760
    .line 761
    .line 762
    move-result v0

    .line 763
    int-to-float v0, v0

    .line 764
    mul-float/2addr v7, v0

    .line 765
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 766
    .line 767
    .line 768
    move-result v0

    .line 769
    if-nez v0, :cond_29

    .line 770
    .line 771
    const/4 v0, 0x0

    .line 772
    goto :goto_18

    .line 773
    :cond_29
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 774
    .line 775
    .line 776
    move-result v0

    .line 777
    const/16 v16, 0x1

    .line 778
    .line 779
    add-int/lit8 v0, v0, -0x1

    .line 780
    .line 781
    :goto_18
    int-to-float v0, v0

    .line 782
    mul-float v9, v23, v0

    .line 783
    .line 784
    add-float/2addr v9, v7

    .line 785
    iput v9, v5, La/vjz;->s:F

    .line 786
    .line 787
    :goto_19
    iget v0, v5, La/vjz;->s:F

    .line 788
    .line 789
    iget v1, v5, La/cgd;->c:F

    .line 790
    .line 791
    add-float/2addr v0, v1

    .line 792
    iput v0, v5, La/vjz;->s:F

    .line 793
    .line 794
    iget v0, v5, La/vjz;->r:F

    .line 795
    .line 796
    iget v1, v5, La/cgd;->b:F

    .line 797
    .line 798
    add-float/2addr v0, v1

    .line 799
    iput v0, v5, La/vjz;->r:F

    .line 800
    .line 801
    :cond_2a
    invoke-virtual/range {p0 .. p0}, La/eu5;->a()V

    .line 802
    .line 803
    .line 804
    return-void
.end method

.method public final f(I)La/ywq0;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_0

    .line 3
    .line 4
    iget-object p0, p0, La/eu5;->z1:La/ywq0;

    .line 5
    .line 6
    return-object p0

    .line 7
    :cond_0
    iget-object p0, p0, La/eu5;->A1:La/ywq0;

    .line 8
    .line 9
    return-object p0
.end method

.method public final g()V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/kwb;->a:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    const-string v1, "Preparing Value-Px Matrix, xmin: "

    .line 8
    .line 9
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, La/kwb;->i:La/urv0;

    .line 13
    .line 14
    iget v1, v1, La/wa5;->t:F

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, ", xmax: "

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    iget-object v1, p0, La/kwb;->i:La/urv0;

    .line 25
    .line 26
    iget v1, v1, La/wa5;->s:F

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v1, ", xdelta: "

    .line 32
    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/kwb;->i:La/urv0;

    .line 37
    .line 38
    iget v1, v1, La/wa5;->u:F

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "MPAndroidChart"

    .line 48
    .line 49
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    .line 51
    .line 52
    :cond_0
    iget-object v0, p0, La/eu5;->A1:La/ywq0;

    .line 53
    .line 54
    iget-object v1, p0, La/kwb;->i:La/urv0;

    .line 55
    .line 56
    iget v2, v1, La/wa5;->t:F

    .line 57
    .line 58
    iget v1, v1, La/wa5;->u:F

    .line 59
    .line 60
    iget-object v3, p0, La/eu5;->w1:La/a2w0;

    .line 61
    .line 62
    iget v4, v3, La/wa5;->u:F

    .line 63
    .line 64
    iget v3, v3, La/wa5;->t:F

    .line 65
    .line 66
    invoke-virtual {v0, v2, v1, v4, v3}, La/ywq0;->z(FFFF)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p0, La/eu5;->z1:La/ywq0;

    .line 70
    .line 71
    iget-object v1, p0, La/kwb;->i:La/urv0;

    .line 72
    .line 73
    iget v2, v1, La/wa5;->t:F

    .line 74
    .line 75
    iget v1, v1, La/wa5;->u:F

    .line 76
    .line 77
    iget-object p0, p0, La/eu5;->v1:La/a2w0;

    .line 78
    .line 79
    iget v3, p0, La/wa5;->u:F

    .line 80
    .line 81
    iget p0, p0, La/wa5;->t:F

    .line 82
    .line 83
    invoke-virtual {v0, v2, v1, v3, p0}, La/ywq0;->z(FFFF)V

    .line 84
    .line 85
    .line 86
    return-void
.end method

.method public getAxisLeft()La/a2w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->v1:La/a2w0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getAxisRight()La/a2w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->w1:La/a2w0;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge getData()La/gu5;
    .locals 0

    .line 1
    invoke-super {p0}, La/kwb;->getData()La/mwb;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/gu5;

    .line 6
    .line 7
    return-object p0
.end method

.method public getDrawListener()La/ch60;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getHighestVisibleX()F
    .locals 4

    .line 1
    iget-object v0, p0, La/eu5;->z1:La/ywq0;

    .line 2
    .line 3
    iget-object v1, p0, La/kwb;->r:La/xju0;

    .line 4
    .line 5
    iget-object v1, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/RectF;->right:F

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    iget-object v3, p0, La/eu5;->I1:La/bp10;

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1, v3}, La/ywq0;->n(FFLa/bp10;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/kwb;->i:La/urv0;

    .line 17
    .line 18
    iget p0, p0, La/wa5;->s:F

    .line 19
    .line 20
    float-to-double v0, p0

    .line 21
    iget-wide v2, v3, La/bp10;->b:D

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-float p0, v0

    .line 28
    return p0
.end method

.method public getLowestVisibleX()F
    .locals 4

    .line 1
    iget-object v0, p0, La/eu5;->z1:La/ywq0;

    .line 2
    .line 3
    iget-object v1, p0, La/kwb;->r:La/xju0;

    .line 4
    .line 5
    iget-object v1, v1, La/xju0;->b:Landroid/graphics/RectF;

    .line 6
    .line 7
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 8
    .line 9
    iget v1, v1, Landroid/graphics/RectF;->bottom:F

    .line 10
    .line 11
    iget-object v3, p0, La/eu5;->H1:La/bp10;

    .line 12
    .line 13
    invoke-virtual {v0, v2, v1, v3}, La/ywq0;->n(FFLa/bp10;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, p0, La/kwb;->i:La/urv0;

    .line 17
    .line 18
    iget p0, p0, La/wa5;->t:F

    .line 19
    .line 20
    float-to-double v0, p0

    .line 21
    iget-wide v2, v3, La/bp10;->b:D

    .line 22
    .line 23
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(DD)D

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    double-to-float p0, v0

    .line 28
    return p0
.end method

.method public getMaxVisibleCount()I
    .locals 0

    .line 1
    iget p0, p0, La/eu5;->f1:I

    .line 2
    .line 3
    return p0
.end method

.method public getMinOffset()F
    .locals 0

    .line 1
    iget p0, p0, La/eu5;->t1:F

    .line 2
    .line 3
    return p0
.end method

.method public getRendererLeftYAxis()La/b2w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->x1:La/b2w0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRendererRightYAxis()La/b2w0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->y1:La/b2w0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getRendererXAxis()La/vrv0;
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->B1:La/vrv0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getScaleX()F
    .locals 0

    .line 1
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, La/xju0;->g:F

    .line 9
    .line 10
    return p0
.end method

.method public getScaleY()F
    .locals 0

    .line 1
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/high16 p0, 0x3f800000    # 1.0f

    .line 6
    .line 7
    return p0

    .line 8
    :cond_0
    iget p0, p0, La/xju0;->h:F

    .line 9
    .line 10
    return p0
.end method

.method public getVisibleXRange()F
    .locals 1

    .line 1
    invoke-virtual {p0}, La/eu5;->getHighestVisibleX()F

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, La/eu5;->getLowestVisibleX()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    sub-float/2addr v0, p0

    .line 10
    invoke-static {v0}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    return p0
.end method

.method public getYChartMax()F
    .locals 1

    .line 1
    iget-object v0, p0, La/eu5;->v1:La/a2w0;

    .line 2
    .line 3
    iget v0, v0, La/wa5;->s:F

    .line 4
    .line 5
    iget-object p0, p0, La/eu5;->w1:La/a2w0;

    .line 6
    .line 7
    iget p0, p0, La/wa5;->s:F

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->max(FF)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public getYChartMin()F
    .locals 1

    .line 1
    iget-object v0, p0, La/eu5;->v1:La/a2w0;

    .line 2
    .line 3
    iget v0, v0, La/wa5;->t:F

    .line 4
    .line 5
    iget-object p0, p0, La/eu5;->w1:La/a2w0;

    .line 6
    .line 7
    iget p0, p0, La/wa5;->t:F

    .line 8
    .line 9
    invoke-static {v0, p0}, Ljava/lang/Math;->min(FF)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 45

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v7, v0, La/kwb;->r:La/xju0;

    .line 6
    .line 7
    invoke-super/range {p0 .. p1}, La/kwb;->onDraw(Landroid/graphics/Canvas;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/kwb;->b:La/mwb;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    goto/16 :goto_38

    .line 15
    .line 16
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 17
    .line 18
    .line 19
    move-result-wide v8

    .line 20
    iget-boolean v2, v0, La/eu5;->q1:Z

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, v7, La/xju0;->b:Landroid/graphics/RectF;

    .line 25
    .line 26
    iget-object v3, v0, La/eu5;->o1:Landroid/graphics/Paint;

    .line 27
    .line 28
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    iget-boolean v2, v0, La/eu5;->r1:Z

    .line 32
    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    iget-object v2, v7, La/xju0;->b:Landroid/graphics/RectF;

    .line 36
    .line 37
    iget-object v3, v0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 38
    .line 39
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-boolean v2, v0, La/eu5;->g1:Z

    .line 43
    .line 44
    const/4 v10, 0x2

    .line 45
    const/4 v11, 0x1

    .line 46
    if-eqz v2, :cond_a

    .line 47
    .line 48
    invoke-virtual {v0}, La/eu5;->getLowestVisibleX()F

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-virtual {v0}, La/eu5;->getHighestVisibleX()F

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    iget-object v4, v0, La/kwb;->b:La/mwb;

    .line 57
    .line 58
    check-cast v4, La/gu5;

    .line 59
    .line 60
    iget-object v5, v4, La/mwb;->i:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_7

    .line 71
    .line 72
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    check-cast v6, La/iuw;

    .line 77
    .line 78
    check-cast v6, La/v500;

    .line 79
    .line 80
    iget-object v12, v6, La/v500;->o:Ljava/util/ArrayList;

    .line 81
    .line 82
    if-eqz v12, :cond_6

    .line 83
    .line 84
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 85
    .line 86
    .line 87
    move-result v13

    .line 88
    if-eqz v13, :cond_3

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_3
    const v13, -0x800001

    .line 92
    .line 93
    .line 94
    iput v13, v6, La/v500;->p:F

    .line 95
    .line 96
    const v13, 0x7f7fffff    # Float.MAX_VALUE

    .line 97
    .line 98
    .line 99
    iput v13, v6, La/v500;->q:F

    .line 100
    .line 101
    const/high16 v13, 0x7fc00000    # Float.NaN

    .line 102
    .line 103
    invoke-virtual {v6, v2, v13, v10}, La/v500;->d(FFI)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    invoke-virtual {v6, v3, v13, v11}, La/v500;->d(FFI)I

    .line 108
    .line 109
    .line 110
    move-result v13

    .line 111
    :goto_1
    if-gt v14, v13, :cond_6

    .line 112
    .line 113
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v15

    .line 117
    check-cast v15, Lcom/github/mikephil/charting/data/Entry;

    .line 118
    .line 119
    iget v15, v15, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 120
    .line 121
    iget v10, v6, La/v500;->q:F

    .line 122
    .line 123
    cmpg-float v10, v15, v10

    .line 124
    .line 125
    if-gez v10, :cond_4

    .line 126
    .line 127
    iput v15, v6, La/v500;->q:F

    .line 128
    .line 129
    :cond_4
    iget v10, v6, La/v500;->p:F

    .line 130
    .line 131
    cmpl-float v10, v15, v10

    .line 132
    .line 133
    if-lez v10, :cond_5

    .line 134
    .line 135
    iput v15, v6, La/v500;->p:F

    .line 136
    .line 137
    :cond_5
    add-int/lit8 v14, v14, 0x1

    .line 138
    .line 139
    const/4 v10, 0x2

    .line 140
    goto :goto_1

    .line 141
    :cond_6
    :goto_2
    const/4 v10, 0x2

    .line 142
    goto :goto_0

    .line 143
    :cond_7
    invoke-virtual {v4}, La/mwb;->a()V

    .line 144
    .line 145
    .line 146
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 147
    .line 148
    iget-object v3, v0, La/kwb;->b:La/mwb;

    .line 149
    .line 150
    check-cast v3, La/gu5;

    .line 151
    .line 152
    iget v4, v3, La/mwb;->d:F

    .line 153
    .line 154
    iget v3, v3, La/mwb;->c:F

    .line 155
    .line 156
    invoke-virtual {v2, v4, v3}, La/wa5;->a(FF)V

    .line 157
    .line 158
    .line 159
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 160
    .line 161
    iget-boolean v3, v2, La/cgd;->a:Z

    .line 162
    .line 163
    if-eqz v3, :cond_8

    .line 164
    .line 165
    iget-object v3, v0, La/kwb;->b:La/mwb;

    .line 166
    .line 167
    check-cast v3, La/gu5;

    .line 168
    .line 169
    invoke-virtual {v3, v11}, La/mwb;->f(I)F

    .line 170
    .line 171
    .line 172
    move-result v3

    .line 173
    iget-object v4, v0, La/kwb;->b:La/mwb;

    .line 174
    .line 175
    check-cast v4, La/gu5;

    .line 176
    .line 177
    invoke-virtual {v4, v11}, La/mwb;->e(I)F

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    invoke-virtual {v2, v3, v4}, La/a2w0;->a(FF)V

    .line 182
    .line 183
    .line 184
    :cond_8
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 185
    .line 186
    iget-boolean v3, v2, La/cgd;->a:Z

    .line 187
    .line 188
    if-eqz v3, :cond_9

    .line 189
    .line 190
    iget-object v3, v0, La/kwb;->b:La/mwb;

    .line 191
    .line 192
    check-cast v3, La/gu5;

    .line 193
    .line 194
    const/4 v4, 0x2

    .line 195
    invoke-virtual {v3, v4}, La/mwb;->f(I)F

    .line 196
    .line 197
    .line 198
    move-result v3

    .line 199
    iget-object v5, v0, La/kwb;->b:La/mwb;

    .line 200
    .line 201
    check-cast v5, La/gu5;

    .line 202
    .line 203
    invoke-virtual {v5, v4}, La/mwb;->e(I)F

    .line 204
    .line 205
    .line 206
    move-result v5

    .line 207
    invoke-virtual {v2, v3, v5}, La/a2w0;->a(FF)V

    .line 208
    .line 209
    .line 210
    :cond_9
    invoke-virtual {v0}, La/eu5;->a()V

    .line 211
    .line 212
    .line 213
    :cond_a
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 214
    .line 215
    iget-boolean v3, v2, La/cgd;->a:Z

    .line 216
    .line 217
    if-eqz v3, :cond_b

    .line 218
    .line 219
    iget-object v3, v0, La/eu5;->x1:La/b2w0;

    .line 220
    .line 221
    iget v4, v2, La/wa5;->t:F

    .line 222
    .line 223
    iget v2, v2, La/wa5;->s:F

    .line 224
    .line 225
    invoke-virtual {v3, v4, v2}, La/xa5;->n1(FF)V

    .line 226
    .line 227
    .line 228
    :cond_b
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 229
    .line 230
    iget-boolean v3, v2, La/cgd;->a:Z

    .line 231
    .line 232
    if-eqz v3, :cond_c

    .line 233
    .line 234
    iget-object v3, v0, La/eu5;->y1:La/b2w0;

    .line 235
    .line 236
    iget v4, v2, La/wa5;->t:F

    .line 237
    .line 238
    iget v2, v2, La/wa5;->s:F

    .line 239
    .line 240
    invoke-virtual {v3, v4, v2}, La/xa5;->n1(FF)V

    .line 241
    .line 242
    .line 243
    :cond_c
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 244
    .line 245
    iget-boolean v3, v2, La/cgd;->a:Z

    .line 246
    .line 247
    if-eqz v3, :cond_d

    .line 248
    .line 249
    iget-object v3, v0, La/eu5;->B1:La/vrv0;

    .line 250
    .line 251
    iget v4, v2, La/wa5;->t:F

    .line 252
    .line 253
    iget v2, v2, La/wa5;->s:F

    .line 254
    .line 255
    invoke-virtual {v3, v4, v2}, La/vrv0;->n1(FF)V

    .line 256
    .line 257
    .line 258
    :cond_d
    iget-object v2, v0, La/eu5;->B1:La/vrv0;

    .line 259
    .line 260
    iget-object v3, v2, La/p4;->b:Ljava/lang/Object;

    .line 261
    .line 262
    move-object v10, v3

    .line 263
    check-cast v10, La/xju0;

    .line 264
    .line 265
    iget-object v6, v2, La/xa5;->g:Landroid/graphics/Paint;

    .line 266
    .line 267
    iget-object v12, v2, La/vrv0;->h:La/urv0;

    .line 268
    .line 269
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    iget-boolean v2, v12, La/cgd;->a:Z

    .line 273
    .line 274
    const/4 v13, 0x3

    .line 275
    const/4 v14, 0x5

    .line 276
    const/4 v15, 0x4

    .line 277
    const/high16 v3, 0x3f800000    # 1.0f

    .line 278
    .line 279
    const/4 v4, 0x0

    .line 280
    if-nez v2, :cond_e

    .line 281
    .line 282
    move/from16 v19, v15

    .line 283
    .line 284
    move-object v15, v4

    .line 285
    goto :goto_5

    .line 286
    :cond_e
    const v2, -0x777778

    .line 287
    .line 288
    .line 289
    invoke-virtual {v6, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v6, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 296
    .line 297
    .line 298
    iget v2, v12, La/urv0;->x:I

    .line 299
    .line 300
    if-eq v2, v11, :cond_10

    .line 301
    .line 302
    if-eq v2, v15, :cond_10

    .line 303
    .line 304
    if-ne v2, v13, :cond_f

    .line 305
    .line 306
    goto :goto_3

    .line 307
    :cond_f
    move/from16 v19, v15

    .line 308
    .line 309
    move-object v15, v4

    .line 310
    goto :goto_4

    .line 311
    :cond_10
    :goto_3
    iget-object v2, v10, La/xju0;->b:Landroid/graphics/RectF;

    .line 312
    .line 313
    iget v5, v2, Landroid/graphics/RectF;->left:F

    .line 314
    .line 315
    move/from16 v17, v3

    .line 316
    .line 317
    iget v3, v2, Landroid/graphics/RectF;->top:F

    .line 318
    .line 319
    iget v2, v2, Landroid/graphics/RectF;->right:F

    .line 320
    .line 321
    move-object/from16 v18, v4

    .line 322
    .line 323
    move v4, v2

    .line 324
    move v2, v5

    .line 325
    move v5, v3

    .line 326
    move/from16 v19, v15

    .line 327
    .line 328
    move-object/from16 v15, v18

    .line 329
    .line 330
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 331
    .line 332
    .line 333
    :goto_4
    iget v1, v12, La/urv0;->x:I

    .line 334
    .line 335
    const/4 v4, 0x2

    .line 336
    if-eq v1, v4, :cond_12

    .line 337
    .line 338
    if-eq v1, v14, :cond_12

    .line 339
    .line 340
    if-ne v1, v13, :cond_11

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_11
    :goto_5
    move-object/from16 v1, p1

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_12
    :goto_6
    iget-object v1, v10, La/xju0;->b:Landroid/graphics/RectF;

    .line 347
    .line 348
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 349
    .line 350
    iget v3, v1, Landroid/graphics/RectF;->bottom:F

    .line 351
    .line 352
    iget v4, v1, Landroid/graphics/RectF;->right:F

    .line 353
    .line 354
    move v5, v3

    .line 355
    move-object/from16 v1, p1

    .line 356
    .line 357
    invoke-virtual/range {v1 .. v6}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 358
    .line 359
    .line 360
    :goto_7
    iget-object v2, v0, La/eu5;->x1:La/b2w0;

    .line 361
    .line 362
    invoke-virtual {v2, v1}, La/b2w0;->r1(Landroid/graphics/Canvas;)V

    .line 363
    .line 364
    .line 365
    iget-object v2, v0, La/eu5;->y1:La/b2w0;

    .line 366
    .line 367
    invoke-virtual {v2, v1}, La/b2w0;->r1(Landroid/graphics/Canvas;)V

    .line 368
    .line 369
    .line 370
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 371
    .line 372
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget-object v2, v0, La/eu5;->B1:La/vrv0;

    .line 376
    .line 377
    iget-object v3, v2, La/xa5;->e:Landroid/graphics/Paint;

    .line 378
    .line 379
    iget-object v4, v2, La/xa5;->c:La/wa5;

    .line 380
    .line 381
    iget-object v5, v2, La/p4;->b:Ljava/lang/Object;

    .line 382
    .line 383
    check-cast v5, La/xju0;

    .line 384
    .line 385
    iget-object v6, v2, La/vrv0;->h:La/urv0;

    .line 386
    .line 387
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 388
    .line 389
    .line 390
    iget-boolean v10, v6, La/cgd;->a:Z

    .line 391
    .line 392
    const/4 v12, 0x0

    .line 393
    move/from16 v17, v14

    .line 394
    .line 395
    const/4 v14, 0x0

    .line 396
    if-nez v10, :cond_13

    .line 397
    .line 398
    goto/16 :goto_a

    .line 399
    .line 400
    :cond_13
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    iget-object v13, v2, La/vrv0;->k:Landroid/graphics/RectF;

    .line 405
    .line 406
    iget-object v15, v5, La/xju0;->b:Landroid/graphics/RectF;

    .line 407
    .line 408
    iget-object v5, v5, La/xju0;->b:Landroid/graphics/RectF;

    .line 409
    .line 410
    invoke-virtual {v13, v15}, Landroid/graphics/RectF;->set(Landroid/graphics/RectF;)V

    .line 411
    .line 412
    .line 413
    iget v15, v4, La/wa5;->h:F

    .line 414
    .line 415
    neg-float v15, v15

    .line 416
    invoke-virtual {v13, v15, v12}, Landroid/graphics/RectF;->inset(FF)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v1, v13}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 420
    .line 421
    .line 422
    iget-object v13, v2, La/vrv0;->j:[F

    .line 423
    .line 424
    array-length v15, v13

    .line 425
    iget v4, v4, La/wa5;->j:I

    .line 426
    .line 427
    const/16 v16, 0x2

    .line 428
    .line 429
    mul-int/lit8 v4, v4, 0x2

    .line 430
    .line 431
    if-eq v15, v4, :cond_14

    .line 432
    .line 433
    iget v4, v6, La/wa5;->j:I

    .line 434
    .line 435
    mul-int/lit8 v4, v4, 0x2

    .line 436
    .line 437
    new-array v13, v4, [F

    .line 438
    .line 439
    iput-object v13, v2, La/vrv0;->j:[F

    .line 440
    .line 441
    :cond_14
    move v4, v14

    .line 442
    :goto_8
    array-length v15, v13

    .line 443
    if-ge v4, v15, :cond_15

    .line 444
    .line 445
    iget-object v15, v6, La/wa5;->i:[F

    .line 446
    .line 447
    div-int/lit8 v21, v4, 0x2

    .line 448
    .line 449
    aget v22, v15, v21

    .line 450
    .line 451
    aput v22, v13, v4

    .line 452
    .line 453
    add-int/lit8 v22, v4, 0x1

    .line 454
    .line 455
    aget v15, v15, v21

    .line 456
    .line 457
    aput v15, v13, v22

    .line 458
    .line 459
    add-int/lit8 v4, v4, 0x2

    .line 460
    .line 461
    goto :goto_8

    .line 462
    :cond_15
    iget-object v4, v2, La/xa5;->d:La/ywq0;

    .line 463
    .line 464
    invoke-virtual {v4, v13}, La/ywq0;->x([F)V

    .line 465
    .line 466
    .line 467
    iget v4, v6, La/wa5;->g:I

    .line 468
    .line 469
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 470
    .line 471
    .line 472
    iget v4, v6, La/wa5;->h:F

    .line 473
    .line 474
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 475
    .line 476
    .line 477
    iget-object v4, v6, La/wa5;->o:Landroid/graphics/DashPathEffect;

    .line 478
    .line 479
    invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 480
    .line 481
    .line 482
    iget-object v2, v2, La/vrv0;->i:Landroid/graphics/Path;

    .line 483
    .line 484
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 485
    .line 486
    .line 487
    move v4, v14

    .line 488
    :goto_9
    array-length v6, v13

    .line 489
    if-ge v4, v6, :cond_16

    .line 490
    .line 491
    aget v6, v13, v4

    .line 492
    .line 493
    add-int/lit8 v15, v4, 0x1

    .line 494
    .line 495
    aget v15, v13, v15

    .line 496
    .line 497
    iget v15, v5, Landroid/graphics/RectF;->bottom:F

    .line 498
    .line 499
    invoke-virtual {v2, v6, v15}, Landroid/graphics/Path;->moveTo(FF)V

    .line 500
    .line 501
    .line 502
    iget v15, v5, Landroid/graphics/RectF;->top:F

    .line 503
    .line 504
    invoke-virtual {v2, v6, v15}, Landroid/graphics/Path;->lineTo(FF)V

    .line 505
    .line 506
    .line 507
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 511
    .line 512
    .line 513
    add-int/lit8 v4, v4, 0x2

    .line 514
    .line 515
    goto :goto_9

    .line 516
    :cond_16
    invoke-virtual {v1, v10}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 517
    .line 518
    .line 519
    :goto_a
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 520
    .line 521
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 522
    .line 523
    .line 524
    iget-object v2, v0, La/eu5;->x1:La/b2w0;

    .line 525
    .line 526
    invoke-virtual {v2, v1}, La/b2w0;->s1(Landroid/graphics/Canvas;)V

    .line 527
    .line 528
    .line 529
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 530
    .line 531
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    iget-object v2, v0, La/eu5;->y1:La/b2w0;

    .line 535
    .line 536
    invoke-virtual {v2, v1}, La/b2w0;->s1(Landroid/graphics/Canvas;)V

    .line 537
    .line 538
    .line 539
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 540
    .line 541
    iget-boolean v2, v2, La/cgd;->a:Z

    .line 542
    .line 543
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 544
    .line 545
    iget-boolean v2, v2, La/cgd;->a:Z

    .line 546
    .line 547
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 548
    .line 549
    iget-boolean v2, v2, La/cgd;->a:Z

    .line 550
    .line 551
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    iget-object v3, v7, La/xju0;->b:Landroid/graphics/RectF;

    .line 556
    .line 557
    iget-object v4, v7, La/xju0;->b:Landroid/graphics/RectF;

    .line 558
    .line 559
    invoke-virtual {v1, v3}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 560
    .line 561
    .line 562
    iget-object v3, v0, La/kwb;->p:La/cbj;

    .line 563
    .line 564
    check-cast v3, La/s500;

    .line 565
    .line 566
    iget-object v5, v3, La/cbj;->d:Landroid/graphics/Paint;

    .line 567
    .line 568
    iget-object v6, v3, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 569
    .line 570
    iget-object v10, v3, La/p4;->b:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v10, La/xju0;

    .line 573
    .line 574
    iget v13, v10, La/xju0;->c:F

    .line 575
    .line 576
    float-to-int v13, v13

    .line 577
    iget v15, v10, La/xju0;->d:F

    .line 578
    .line 579
    float-to-int v15, v15

    .line 580
    iget-object v12, v3, La/s500;->k:Ljava/lang/ref/WeakReference;

    .line 581
    .line 582
    if-nez v12, :cond_17

    .line 583
    .line 584
    const/4 v12, 0x0

    .line 585
    goto :goto_b

    .line 586
    :cond_17
    invoke-virtual {v12}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v12

    .line 590
    check-cast v12, Landroid/graphics/Bitmap;

    .line 591
    .line 592
    :goto_b
    const/high16 v28, 0x42c80000    # 100.0f

    .line 593
    .line 594
    if-eqz v12, :cond_18

    .line 595
    .line 596
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    .line 597
    .line 598
    .line 599
    move-result v11

    .line 600
    if-ne v11, v13, :cond_18

    .line 601
    .line 602
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 603
    .line 604
    .line 605
    move-result v11

    .line 606
    if-eq v11, v15, :cond_19

    .line 607
    .line 608
    :cond_18
    if-lez v13, :cond_41

    .line 609
    .line 610
    if-lez v15, :cond_41

    .line 611
    .line 612
    iget-object v11, v3, La/s500;->m:Landroid/graphics/Bitmap$Config;

    .line 613
    .line 614
    invoke-static {v13, v15, v11}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 615
    .line 616
    .line 617
    move-result-object v12

    .line 618
    new-instance v11, Ljava/lang/ref/WeakReference;

    .line 619
    .line 620
    invoke-direct {v11, v12}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 621
    .line 622
    .line 623
    iput-object v11, v3, La/s500;->k:Ljava/lang/ref/WeakReference;

    .line 624
    .line 625
    new-instance v11, Landroid/graphics/Canvas;

    .line 626
    .line 627
    invoke-direct {v11, v12}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 628
    .line 629
    .line 630
    iput-object v11, v3, La/s500;->l:Landroid/graphics/Canvas;

    .line 631
    .line 632
    :cond_19
    invoke-virtual {v12, v14}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v6}, La/q500;->getLineData()La/u500;

    .line 636
    .line 637
    .line 638
    move-result-object v11

    .line 639
    iget-object v11, v11, La/mwb;->i:Ljava/util/ArrayList;

    .line 640
    .line 641
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 642
    .line 643
    .line 644
    move-result-object v11

    .line 645
    :goto_c
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    .line 646
    .line 647
    .line 648
    move-result v13

    .line 649
    if-eqz v13, :cond_40

    .line 650
    .line 651
    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 652
    .line 653
    .line 654
    move-result-object v13

    .line 655
    check-cast v13, La/v500;

    .line 656
    .line 657
    iget-boolean v15, v13, La/v500;->n:Z

    .line 658
    .line 659
    if-eqz v15, :cond_3f

    .line 660
    .line 661
    iget-object v15, v3, La/s500;->n:Landroid/graphics/Path;

    .line 662
    .line 663
    move/from16 v37, v14

    .line 664
    .line 665
    iget-object v14, v3, La/s500;->o:Landroid/graphics/Path;

    .line 666
    .line 667
    move-wide/from16 v38, v8

    .line 668
    .line 669
    iget-object v8, v3, La/s500;->g:La/hu5;

    .line 670
    .line 671
    iget-object v9, v3, La/cbj;->c:La/lwb;

    .line 672
    .line 673
    move-object/from16 v21, v9

    .line 674
    .line 675
    iget-object v9, v13, La/v500;->o:Ljava/util/ArrayList;

    .line 676
    .line 677
    move-object/from16 v22, v9

    .line 678
    .line 679
    iget v9, v13, La/v500;->B:I

    .line 680
    .line 681
    move-object/from16 v40, v11

    .line 682
    .line 683
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    .line 684
    .line 685
    .line 686
    move-result v11

    .line 687
    move-object/from16 v41, v7

    .line 688
    .line 689
    const/4 v7, 0x1

    .line 690
    if-ge v11, v7, :cond_1a

    .line 691
    .line 692
    move/from16 v43, v2

    .line 693
    .line 694
    move-object/from16 v42, v4

    .line 695
    .line 696
    goto/16 :goto_22

    .line 697
    .line 698
    :cond_1a
    iget v7, v13, La/v500;->z:F

    .line 699
    .line 700
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 701
    .line 702
    .line 703
    const/4 v7, 0x0

    .line 704
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 705
    .line 706
    .line 707
    invoke-static {v9}, La/hne;->E(I)I

    .line 708
    .line 709
    .line 710
    move-result v7

    .line 711
    const/4 v11, 0x2

    .line 712
    if-eq v7, v11, :cond_38

    .line 713
    .line 714
    const/4 v11, 0x3

    .line 715
    if-eq v7, v11, :cond_35

    .line 716
    .line 717
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    .line 718
    .line 719
    .line 720
    move-result v7

    .line 721
    const/4 v11, 0x2

    .line 722
    if-ne v9, v11, :cond_1b

    .line 723
    .line 724
    const/4 v11, 0x1

    .line 725
    goto :goto_d

    .line 726
    :cond_1b
    move/from16 v11, v37

    .line 727
    .line 728
    :goto_d
    if-eqz v11, :cond_1c

    .line 729
    .line 730
    move/from16 v14, v19

    .line 731
    .line 732
    goto :goto_e

    .line 733
    :cond_1c
    const/4 v14, 0x2

    .line 734
    :goto_e
    iget v15, v13, La/v500;->d:I

    .line 735
    .line 736
    invoke-virtual {v6, v15}, La/eu5;->f(I)La/ywq0;

    .line 737
    .line 738
    .line 739
    move-result-object v15

    .line 740
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 741
    .line 742
    .line 743
    move/from16 v22, v7

    .line 744
    .line 745
    sget-object v7, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 746
    .line 747
    invoke-virtual {v5, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v8, v6, v13}, La/hu5;->X(La/eu5;La/v500;)V

    .line 751
    .line 752
    .line 753
    iget-boolean v7, v13, La/v500;->A:Z

    .line 754
    .line 755
    if-eqz v7, :cond_24

    .line 756
    .line 757
    if-lez v22, :cond_24

    .line 758
    .line 759
    iget-object v7, v3, La/s500;->q:Landroid/graphics/Path;

    .line 760
    .line 761
    move/from16 v23, v11

    .line 762
    .line 763
    iget v11, v8, La/hu5;->b:I

    .line 764
    .line 765
    move/from16 v21, v11

    .line 766
    .line 767
    iget v11, v8, La/hu5;->d:I

    .line 768
    .line 769
    add-int v11, v11, v21

    .line 770
    .line 771
    move-object/from16 v42, v4

    .line 772
    .line 773
    move/from16 v4, v37

    .line 774
    .line 775
    :goto_f
    move/from16 v43, v2

    .line 776
    .line 777
    mul-int/lit16 v2, v4, 0x80

    .line 778
    .line 779
    add-int v2, v2, v21

    .line 780
    .line 781
    move/from16 v24, v4

    .line 782
    .line 783
    add-int/lit16 v4, v2, 0x80

    .line 784
    .line 785
    if-le v4, v11, :cond_1d

    .line 786
    .line 787
    move v4, v11

    .line 788
    :cond_1d
    if-gt v2, v4, :cond_22

    .line 789
    .line 790
    move/from16 v25, v11

    .line 791
    .line 792
    iget-object v11, v13, La/v500;->H:La/usd;

    .line 793
    .line 794
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    invoke-static {v13, v6}, La/usd;->c(La/v500;La/q500;)F

    .line 798
    .line 799
    .line 800
    move-result v11

    .line 801
    const/4 v0, 0x2

    .line 802
    if-ne v9, v0, :cond_1e

    .line 803
    .line 804
    const/4 v0, 0x1

    .line 805
    goto :goto_10

    .line 806
    :cond_1e
    move/from16 v0, v37

    .line 807
    .line 808
    :goto_10
    invoke-virtual {v7}, Landroid/graphics/Path;->reset()V

    .line 809
    .line 810
    .line 811
    move/from16 v26, v0

    .line 812
    .line 813
    invoke-virtual {v13, v2}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    move/from16 v30, v9

    .line 818
    .line 819
    iget v9, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 820
    .line 821
    invoke-virtual {v7, v9, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 822
    .line 823
    .line 824
    iget v9, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 825
    .line 826
    move-object/from16 v44, v12

    .line 827
    .line 828
    iget v12, v0, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 829
    .line 830
    move-object/from16 v31, v0

    .line 831
    .line 832
    const/high16 v0, 0x3f800000    # 1.0f

    .line 833
    .line 834
    mul-float/2addr v12, v0

    .line 835
    invoke-virtual {v7, v9, v12}, Landroid/graphics/Path;->lineTo(FF)V

    .line 836
    .line 837
    .line 838
    add-int/lit8 v9, v2, 0x1

    .line 839
    .line 840
    move/from16 v20, v0

    .line 841
    .line 842
    move v0, v9

    .line 843
    move-object/from16 v9, v31

    .line 844
    .line 845
    const/4 v12, 0x0

    .line 846
    :goto_11
    if-gt v0, v4, :cond_20

    .line 847
    .line 848
    invoke-virtual {v13, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 849
    .line 850
    .line 851
    move-result-object v12

    .line 852
    move/from16 v31, v0

    .line 853
    .line 854
    if-eqz v26, :cond_1f

    .line 855
    .line 856
    iget v0, v12, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 857
    .line 858
    iget v9, v9, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 859
    .line 860
    mul-float v9, v9, v20

    .line 861
    .line 862
    invoke-virtual {v7, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 863
    .line 864
    .line 865
    :cond_1f
    iget v0, v12, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 866
    .line 867
    iget v9, v12, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 868
    .line 869
    mul-float v9, v9, v20

    .line 870
    .line 871
    invoke-virtual {v7, v0, v9}, Landroid/graphics/Path;->lineTo(FF)V

    .line 872
    .line 873
    .line 874
    add-int/lit8 v0, v31, 0x1

    .line 875
    .line 876
    move-object v9, v12

    .line 877
    goto :goto_11

    .line 878
    :cond_20
    if-eqz v12, :cond_21

    .line 879
    .line 880
    iget v0, v12, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 881
    .line 882
    invoke-virtual {v7, v0, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 883
    .line 884
    .line 885
    :cond_21
    invoke-virtual {v7}, Landroid/graphics/Path;->close()V

    .line 886
    .line 887
    .line 888
    invoke-virtual {v15, v7}, La/ywq0;->u(Landroid/graphics/Path;)V

    .line 889
    .line 890
    .line 891
    iget v0, v13, La/v500;->x:I

    .line 892
    .line 893
    iget-byte v9, v13, La/v500;->y:B

    .line 894
    .line 895
    shl-int/lit8 v9, v9, 0x18

    .line 896
    .line 897
    const v11, 0xffffff

    .line 898
    .line 899
    .line 900
    and-int/2addr v0, v11

    .line 901
    or-int/2addr v0, v9

    .line 902
    sget-object v9, La/dut0;->a:Landroid/util/DisplayMetrics;

    .line 903
    .line 904
    invoke-virtual {v1}, Landroid/graphics/Canvas;->save()I

    .line 905
    .line 906
    .line 907
    move-result v9

    .line 908
    invoke-virtual {v1, v7}, Landroid/graphics/Canvas;->clipPath(Landroid/graphics/Path;)Z

    .line 909
    .line 910
    .line 911
    invoke-virtual {v1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 912
    .line 913
    .line 914
    invoke-virtual {v1, v9}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 915
    .line 916
    .line 917
    goto :goto_12

    .line 918
    :cond_22
    move/from16 v30, v9

    .line 919
    .line 920
    move/from16 v25, v11

    .line 921
    .line 922
    move-object/from16 v44, v12

    .line 923
    .line 924
    const/high16 v20, 0x3f800000    # 1.0f

    .line 925
    .line 926
    :goto_12
    add-int/lit8 v0, v24, 0x1

    .line 927
    .line 928
    if-le v2, v4, :cond_23

    .line 929
    .line 930
    goto :goto_13

    .line 931
    :cond_23
    move v4, v0

    .line 932
    move/from16 v11, v25

    .line 933
    .line 934
    move/from16 v9, v30

    .line 935
    .line 936
    move/from16 v2, v43

    .line 937
    .line 938
    move-object/from16 v12, v44

    .line 939
    .line 940
    move-object/from16 v0, p0

    .line 941
    .line 942
    goto/16 :goto_f

    .line 943
    .line 944
    :cond_24
    move/from16 v43, v2

    .line 945
    .line 946
    move-object/from16 v42, v4

    .line 947
    .line 948
    move/from16 v23, v11

    .line 949
    .line 950
    move-object/from16 v44, v12

    .line 951
    .line 952
    const/high16 v20, 0x3f800000    # 1.0f

    .line 953
    .line 954
    :goto_13
    iget-object v0, v13, La/v500;->a:Ljava/util/ArrayList;

    .line 955
    .line 956
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 957
    .line 958
    .line 959
    move-result v0

    .line 960
    iget-object v2, v3, La/s500;->p:[F

    .line 961
    .line 962
    const/4 v7, 0x1

    .line 963
    if-le v0, v7, :cond_2e

    .line 964
    .line 965
    array-length v0, v2

    .line 966
    mul-int/lit8 v2, v14, 0x2

    .line 967
    .line 968
    if-gt v0, v2, :cond_25

    .line 969
    .line 970
    mul-int/lit8 v14, v14, 0x4

    .line 971
    .line 972
    new-array v0, v14, [F

    .line 973
    .line 974
    iput-object v0, v3, La/s500;->p:[F

    .line 975
    .line 976
    :cond_25
    iget v0, v8, La/hu5;->b:I

    .line 977
    .line 978
    :goto_14
    iget v4, v8, La/hu5;->d:I

    .line 979
    .line 980
    iget v7, v8, La/hu5;->b:I

    .line 981
    .line 982
    add-int/2addr v4, v7

    .line 983
    if-gt v0, v4, :cond_2d

    .line 984
    .line 985
    invoke-virtual {v13, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 986
    .line 987
    .line 988
    move-result-object v4

    .line 989
    if-nez v4, :cond_26

    .line 990
    .line 991
    goto/16 :goto_17

    .line 992
    .line 993
    :cond_26
    iget-object v7, v3, La/s500;->p:[F

    .line 994
    .line 995
    iget v9, v4, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 996
    .line 997
    aput v9, v7, v37

    .line 998
    .line 999
    iget v4, v4, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1000
    .line 1001
    mul-float v4, v4, v20

    .line 1002
    .line 1003
    const/16 v29, 0x1

    .line 1004
    .line 1005
    aput v4, v7, v29

    .line 1006
    .line 1007
    iget v11, v8, La/hu5;->c:I

    .line 1008
    .line 1009
    if-ge v0, v11, :cond_29

    .line 1010
    .line 1011
    add-int/lit8 v4, v0, 0x1

    .line 1012
    .line 1013
    invoke-virtual {v13, v4}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v4

    .line 1017
    if-nez v4, :cond_27

    .line 1018
    .line 1019
    goto/16 :goto_18

    .line 1020
    .line 1021
    :cond_27
    iget v7, v4, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1022
    .line 1023
    iget-object v9, v3, La/s500;->p:[F

    .line 1024
    .line 1025
    if-eqz v23, :cond_28

    .line 1026
    .line 1027
    const/16 v16, 0x2

    .line 1028
    .line 1029
    aput v7, v9, v16

    .line 1030
    .line 1031
    const/16 v29, 0x1

    .line 1032
    .line 1033
    aget v11, v9, v29

    .line 1034
    .line 1035
    const/16 v18, 0x3

    .line 1036
    .line 1037
    aput v11, v9, v18

    .line 1038
    .line 1039
    aput v7, v9, v19

    .line 1040
    .line 1041
    aput v11, v9, v17

    .line 1042
    .line 1043
    const/4 v11, 0x6

    .line 1044
    aput v7, v9, v11

    .line 1045
    .line 1046
    iget v4, v4, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1047
    .line 1048
    mul-float v4, v4, v20

    .line 1049
    .line 1050
    const/4 v7, 0x7

    .line 1051
    aput v4, v9, v7

    .line 1052
    .line 1053
    move-object v7, v9

    .line 1054
    const/16 v16, 0x2

    .line 1055
    .line 1056
    goto :goto_15

    .line 1057
    :cond_28
    const/16 v16, 0x2

    .line 1058
    .line 1059
    aput v7, v9, v16

    .line 1060
    .line 1061
    iget v4, v4, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1062
    .line 1063
    mul-float v4, v4, v20

    .line 1064
    .line 1065
    const/16 v18, 0x3

    .line 1066
    .line 1067
    aput v4, v9, v18

    .line 1068
    .line 1069
    move-object v7, v9

    .line 1070
    goto :goto_15

    .line 1071
    :cond_29
    const/16 v16, 0x2

    .line 1072
    .line 1073
    const/16 v18, 0x3

    .line 1074
    .line 1075
    aput v9, v7, v16

    .line 1076
    .line 1077
    aput v4, v7, v18

    .line 1078
    .line 1079
    :goto_15
    invoke-virtual {v15, v7}, La/ywq0;->x([F)V

    .line 1080
    .line 1081
    .line 1082
    iget-object v4, v3, La/s500;->p:[F

    .line 1083
    .line 1084
    aget v4, v4, v37

    .line 1085
    .line 1086
    invoke-virtual {v10, v4}, La/xju0;->c(F)Z

    .line 1087
    .line 1088
    .line 1089
    move-result v4

    .line 1090
    if-nez v4, :cond_2a

    .line 1091
    .line 1092
    goto :goto_18

    .line 1093
    :cond_2a
    iget-object v4, v3, La/s500;->p:[F

    .line 1094
    .line 1095
    aget v4, v4, v16

    .line 1096
    .line 1097
    invoke-virtual {v10, v4}, La/xju0;->b(F)Z

    .line 1098
    .line 1099
    .line 1100
    move-result v4

    .line 1101
    if-eqz v4, :cond_2c

    .line 1102
    .line 1103
    iget-object v4, v3, La/s500;->p:[F

    .line 1104
    .line 1105
    const/16 v29, 0x1

    .line 1106
    .line 1107
    aget v7, v4, v29

    .line 1108
    .line 1109
    iget-object v9, v10, La/xju0;->b:Landroid/graphics/RectF;

    .line 1110
    .line 1111
    iget v11, v9, Landroid/graphics/RectF;->top:F

    .line 1112
    .line 1113
    cmpg-float v7, v11, v7

    .line 1114
    .line 1115
    if-gtz v7, :cond_2b

    .line 1116
    .line 1117
    goto :goto_16

    .line 1118
    :cond_2b
    const/16 v18, 0x3

    .line 1119
    .line 1120
    aget v4, v4, v18

    .line 1121
    .line 1122
    mul-float v4, v4, v28

    .line 1123
    .line 1124
    float-to-int v4, v4

    .line 1125
    int-to-float v4, v4

    .line 1126
    div-float v4, v4, v28

    .line 1127
    .line 1128
    iget v7, v9, Landroid/graphics/RectF;->bottom:F

    .line 1129
    .line 1130
    cmpl-float v4, v7, v4

    .line 1131
    .line 1132
    if-ltz v4, :cond_2c

    .line 1133
    .line 1134
    :goto_16
    iget-object v4, v13, La/v500;->a:Ljava/util/ArrayList;

    .line 1135
    .line 1136
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 1137
    .line 1138
    .line 1139
    move-result v7

    .line 1140
    rem-int v7, v0, v7

    .line 1141
    .line 1142
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v4

    .line 1146
    check-cast v4, Ljava/lang/Integer;

    .line 1147
    .line 1148
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1149
    .line 1150
    .line 1151
    move-result v4

    .line 1152
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1153
    .line 1154
    .line 1155
    iget-object v4, v3, La/s500;->p:[F

    .line 1156
    .line 1157
    move/from16 v7, v37

    .line 1158
    .line 1159
    invoke-virtual {v1, v4, v7, v2, v5}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 1160
    .line 1161
    .line 1162
    :cond_2c
    :goto_17
    add-int/lit8 v0, v0, 0x1

    .line 1163
    .line 1164
    const/16 v37, 0x0

    .line 1165
    .line 1166
    goto/16 :goto_14

    .line 1167
    .line 1168
    :cond_2d
    :goto_18
    const/4 v15, 0x0

    .line 1169
    goto/16 :goto_1c

    .line 1170
    .line 1171
    :cond_2e
    array-length v0, v2

    .line 1172
    mul-int v7, v22, v14

    .line 1173
    .line 1174
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    const/16 v16, 0x2

    .line 1179
    .line 1180
    mul-int/lit8 v2, v2, 0x2

    .line 1181
    .line 1182
    if-ge v0, v2, :cond_2f

    .line 1183
    .line 1184
    invoke-static {v7, v14}, Ljava/lang/Math;->max(II)I

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    mul-int/lit8 v0, v0, 0x4

    .line 1189
    .line 1190
    new-array v0, v0, [F

    .line 1191
    .line 1192
    iput-object v0, v3, La/s500;->p:[F

    .line 1193
    .line 1194
    :cond_2f
    iget v0, v8, La/hu5;->b:I

    .line 1195
    .line 1196
    invoke-virtual {v13, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    if-eqz v0, :cond_2d

    .line 1201
    .line 1202
    iget v0, v8, La/hu5;->b:I

    .line 1203
    .line 1204
    const/4 v2, 0x0

    .line 1205
    :goto_19
    iget v4, v8, La/hu5;->d:I

    .line 1206
    .line 1207
    iget v7, v8, La/hu5;->b:I

    .line 1208
    .line 1209
    add-int/2addr v4, v7

    .line 1210
    if-gt v0, v4, :cond_34

    .line 1211
    .line 1212
    if-nez v0, :cond_30

    .line 1213
    .line 1214
    const/4 v4, 0x0

    .line 1215
    goto :goto_1a

    .line 1216
    :cond_30
    add-int/lit8 v4, v0, -0x1

    .line 1217
    .line 1218
    :goto_1a
    invoke-virtual {v13, v4}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1219
    .line 1220
    .line 1221
    move-result-object v4

    .line 1222
    invoke-virtual {v13, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v7

    .line 1226
    if-eqz v4, :cond_31

    .line 1227
    .line 1228
    if-nez v7, :cond_32

    .line 1229
    .line 1230
    :cond_31
    move/from16 v21, v0

    .line 1231
    .line 1232
    goto :goto_1b

    .line 1233
    :cond_32
    iget v9, v7, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1234
    .line 1235
    iget-object v11, v3, La/s500;->p:[F

    .line 1236
    .line 1237
    add-int/lit8 v12, v2, 0x1

    .line 1238
    .line 1239
    move/from16 v21, v0

    .line 1240
    .line 1241
    iget v0, v4, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1242
    .line 1243
    aput v0, v11, v2

    .line 1244
    .line 1245
    add-int/lit8 v0, v2, 0x2

    .line 1246
    .line 1247
    iget v4, v4, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1248
    .line 1249
    mul-float v4, v4, v20

    .line 1250
    .line 1251
    aput v4, v11, v12

    .line 1252
    .line 1253
    if-eqz v23, :cond_33

    .line 1254
    .line 1255
    add-int/lit8 v12, v2, 0x3

    .line 1256
    .line 1257
    aput v9, v11, v0

    .line 1258
    .line 1259
    add-int/lit8 v0, v2, 0x4

    .line 1260
    .line 1261
    aput v4, v11, v12

    .line 1262
    .line 1263
    add-int/lit8 v12, v2, 0x5

    .line 1264
    .line 1265
    aput v9, v11, v0

    .line 1266
    .line 1267
    add-int/lit8 v0, v2, 0x6

    .line 1268
    .line 1269
    aput v4, v11, v12

    .line 1270
    .line 1271
    :cond_33
    add-int/lit8 v2, v0, 0x1

    .line 1272
    .line 1273
    aput v9, v11, v0

    .line 1274
    .line 1275
    const/16 v16, 0x2

    .line 1276
    .line 1277
    add-int/lit8 v0, v0, 0x2

    .line 1278
    .line 1279
    iget v4, v7, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1280
    .line 1281
    mul-float v4, v4, v20

    .line 1282
    .line 1283
    aput v4, v11, v2

    .line 1284
    .line 1285
    move v2, v0

    .line 1286
    :goto_1b
    add-int/lit8 v0, v21, 0x1

    .line 1287
    .line 1288
    goto :goto_19

    .line 1289
    :cond_34
    if-lez v2, :cond_2d

    .line 1290
    .line 1291
    iget-object v0, v3, La/s500;->p:[F

    .line 1292
    .line 1293
    invoke-virtual {v15, v0}, La/ywq0;->x([F)V

    .line 1294
    .line 1295
    .line 1296
    iget v0, v8, La/hu5;->d:I

    .line 1297
    .line 1298
    const/16 v29, 0x1

    .line 1299
    .line 1300
    add-int/lit8 v0, v0, 0x1

    .line 1301
    .line 1302
    mul-int/2addr v0, v14

    .line 1303
    invoke-static {v0, v14}, Ljava/lang/Math;->max(II)I

    .line 1304
    .line 1305
    .line 1306
    move-result v0

    .line 1307
    const/16 v16, 0x2

    .line 1308
    .line 1309
    mul-int/lit8 v0, v0, 0x2

    .line 1310
    .line 1311
    iget-object v2, v13, La/v500;->a:Ljava/util/ArrayList;

    .line 1312
    .line 1313
    const/4 v7, 0x0

    .line 1314
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v2

    .line 1318
    check-cast v2, Ljava/lang/Integer;

    .line 1319
    .line 1320
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 1321
    .line 1322
    .line 1323
    move-result v2

    .line 1324
    invoke-virtual {v5, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 1325
    .line 1326
    .line 1327
    iget-object v2, v3, La/s500;->p:[F

    .line 1328
    .line 1329
    invoke-virtual {v1, v2, v7, v0, v5}, Landroid/graphics/Canvas;->drawLines([FIILandroid/graphics/Paint;)V

    .line 1330
    .line 1331
    .line 1332
    goto/16 :goto_18

    .line 1333
    .line 1334
    :goto_1c
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1335
    .line 1336
    .line 1337
    goto/16 :goto_21

    .line 1338
    .line 1339
    :cond_35
    move/from16 v43, v2

    .line 1340
    .line 1341
    move-object/from16 v42, v4

    .line 1342
    .line 1343
    move-object/from16 v44, v12

    .line 1344
    .line 1345
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1346
    .line 1347
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1348
    .line 1349
    .line 1350
    iget v0, v13, La/v500;->d:I

    .line 1351
    .line 1352
    invoke-virtual {v6, v0}, La/eu5;->f(I)La/ywq0;

    .line 1353
    .line 1354
    .line 1355
    move-result-object v25

    .line 1356
    invoke-virtual {v8, v6, v13}, La/hu5;->X(La/eu5;La/v500;)V

    .line 1357
    .line 1358
    .line 1359
    invoke-virtual {v15}, Landroid/graphics/Path;->reset()V

    .line 1360
    .line 1361
    .line 1362
    iget v0, v8, La/hu5;->d:I

    .line 1363
    .line 1364
    const/4 v7, 0x1

    .line 1365
    if-lt v0, v7, :cond_36

    .line 1366
    .line 1367
    iget v0, v8, La/hu5;->b:I

    .line 1368
    .line 1369
    invoke-virtual {v13, v0}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1370
    .line 1371
    .line 1372
    move-result-object v0

    .line 1373
    iget v2, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1374
    .line 1375
    iget v4, v0, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1376
    .line 1377
    mul-float v4, v4, v20

    .line 1378
    .line 1379
    invoke-virtual {v15, v2, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1380
    .line 1381
    .line 1382
    iget v2, v8, La/hu5;->b:I

    .line 1383
    .line 1384
    add-int/2addr v2, v7

    .line 1385
    :goto_1d
    iget v4, v8, La/hu5;->d:I

    .line 1386
    .line 1387
    iget v7, v8, La/hu5;->b:I

    .line 1388
    .line 1389
    add-int/2addr v4, v7

    .line 1390
    if-gt v2, v4, :cond_36

    .line 1391
    .line 1392
    invoke-virtual {v13, v2}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v4

    .line 1396
    iget v7, v0, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1397
    .line 1398
    iget v9, v4, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1399
    .line 1400
    const/high16 v11, 0x40000000    # 2.0f

    .line 1401
    .line 1402
    invoke-static {v9, v7, v11, v7}, La/rw2;->z(FFFF)F

    .line 1403
    .line 1404
    .line 1405
    move-result v31

    .line 1406
    iget v0, v0, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1407
    .line 1408
    mul-float v32, v0, v20

    .line 1409
    .line 1410
    iget v0, v4, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1411
    .line 1412
    mul-float v34, v0, v20

    .line 1413
    .line 1414
    move/from16 v33, v31

    .line 1415
    .line 1416
    move/from16 v36, v34

    .line 1417
    .line 1418
    move/from16 v35, v9

    .line 1419
    .line 1420
    move-object/from16 v30, v15

    .line 1421
    .line 1422
    invoke-virtual/range {v30 .. v36}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 1423
    .line 1424
    .line 1425
    move-object/from16 v0, v30

    .line 1426
    .line 1427
    add-int/lit8 v2, v2, 0x1

    .line 1428
    .line 1429
    move-object v15, v0

    .line 1430
    move-object v0, v4

    .line 1431
    goto :goto_1d

    .line 1432
    :cond_36
    move-object v0, v15

    .line 1433
    iget-boolean v2, v13, La/v500;->A:Z

    .line 1434
    .line 1435
    if-eqz v2, :cond_37

    .line 1436
    .line 1437
    invoke-virtual {v14}, Landroid/graphics/Path;->reset()V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v14, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1441
    .line 1442
    .line 1443
    iget-object v2, v3, La/s500;->l:Landroid/graphics/Canvas;

    .line 1444
    .line 1445
    iget-object v4, v3, La/s500;->g:La/hu5;

    .line 1446
    .line 1447
    move-object/from16 v22, v2

    .line 1448
    .line 1449
    move-object/from16 v21, v3

    .line 1450
    .line 1451
    move-object/from16 v26, v4

    .line 1452
    .line 1453
    move-object/from16 v23, v13

    .line 1454
    .line 1455
    move-object/from16 v24, v14

    .line 1456
    .line 1457
    invoke-virtual/range {v21 .. v26}, La/s500;->o1(Landroid/graphics/Canvas;La/v500;Landroid/graphics/Path;La/ywq0;La/hu5;)V

    .line 1458
    .line 1459
    .line 1460
    :cond_37
    move-object/from16 v2, v25

    .line 1461
    .line 1462
    iget-object v4, v13, La/v500;->a:Ljava/util/ArrayList;

    .line 1463
    .line 1464
    const/4 v7, 0x0

    .line 1465
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v4

    .line 1469
    check-cast v4, Ljava/lang/Integer;

    .line 1470
    .line 1471
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1472
    .line 1473
    .line 1474
    move-result v4

    .line 1475
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1476
    .line 1477
    .line 1478
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 1479
    .line 1480
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1481
    .line 1482
    .line 1483
    invoke-virtual {v2, v0}, La/ywq0;->u(Landroid/graphics/Path;)V

    .line 1484
    .line 1485
    .line 1486
    iget-object v2, v3, La/s500;->l:Landroid/graphics/Canvas;

    .line 1487
    .line 1488
    invoke-virtual {v2, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1489
    .line 1490
    .line 1491
    const/4 v15, 0x0

    .line 1492
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1493
    .line 1494
    .line 1495
    goto/16 :goto_21

    .line 1496
    .line 1497
    :cond_38
    move/from16 v43, v2

    .line 1498
    .line 1499
    move-object/from16 v42, v4

    .line 1500
    .line 1501
    move-object/from16 v44, v12

    .line 1502
    .line 1503
    move-object v2, v14

    .line 1504
    move-object v0, v15

    .line 1505
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1506
    .line 1507
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1508
    .line 1509
    .line 1510
    iget v4, v13, La/v500;->d:I

    .line 1511
    .line 1512
    invoke-virtual {v6, v4}, La/eu5;->f(I)La/ywq0;

    .line 1513
    .line 1514
    .line 1515
    move-result-object v25

    .line 1516
    invoke-virtual {v8, v6, v13}, La/hu5;->X(La/eu5;La/v500;)V

    .line 1517
    .line 1518
    .line 1519
    iget v4, v13, La/v500;->G:F

    .line 1520
    .line 1521
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    .line 1522
    .line 1523
    .line 1524
    iget v7, v8, La/hu5;->d:I

    .line 1525
    .line 1526
    const/4 v9, 0x1

    .line 1527
    if-lt v7, v9, :cond_3d

    .line 1528
    .line 1529
    iget v7, v8, La/hu5;->b:I

    .line 1530
    .line 1531
    add-int/lit8 v9, v7, -0x1

    .line 1532
    .line 1533
    const/4 v11, 0x0

    .line 1534
    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    .line 1535
    .line 1536
    .line 1537
    move-result v9

    .line 1538
    invoke-virtual {v13, v9}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1539
    .line 1540
    .line 1541
    move-result-object v9

    .line 1542
    invoke-static {v7, v11}, Ljava/lang/Math;->max(II)I

    .line 1543
    .line 1544
    .line 1545
    move-result v7

    .line 1546
    invoke-virtual {v13, v7}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v7

    .line 1550
    if-nez v7, :cond_39

    .line 1551
    .line 1552
    const/4 v15, 0x0

    .line 1553
    goto/16 :goto_21

    .line 1554
    .line 1555
    :cond_39
    iget v11, v7, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1556
    .line 1557
    iget v12, v7, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1558
    .line 1559
    mul-float v12, v12, v20

    .line 1560
    .line 1561
    invoke-virtual {v0, v11, v12}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1562
    .line 1563
    .line 1564
    iget v11, v8, La/hu5;->b:I

    .line 1565
    .line 1566
    const/16 v29, 0x1

    .line 1567
    .line 1568
    add-int/lit8 v11, v11, 0x1

    .line 1569
    .line 1570
    const/4 v12, -0x1

    .line 1571
    move v14, v12

    .line 1572
    move v12, v11

    .line 1573
    move-object v11, v7

    .line 1574
    :goto_1e
    iget v15, v8, La/hu5;->d:I

    .line 1575
    .line 1576
    move-object/from16 v30, v0

    .line 1577
    .line 1578
    iget v0, v8, La/hu5;->b:I

    .line 1579
    .line 1580
    add-int/2addr v15, v0

    .line 1581
    if-gt v12, v15, :cond_3c

    .line 1582
    .line 1583
    if-ne v14, v12, :cond_3a

    .line 1584
    .line 1585
    goto :goto_1f

    .line 1586
    :cond_3a
    invoke-virtual {v13, v12}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v7

    .line 1590
    :goto_1f
    add-int/lit8 v0, v12, 0x1

    .line 1591
    .line 1592
    invoke-virtual/range {v22 .. v22}, Ljava/util/ArrayList;->size()I

    .line 1593
    .line 1594
    .line 1595
    move-result v14

    .line 1596
    if-ge v0, v14, :cond_3b

    .line 1597
    .line 1598
    move v14, v0

    .line 1599
    goto :goto_20

    .line 1600
    :cond_3b
    move v14, v12

    .line 1601
    :goto_20
    invoke-virtual {v13, v14}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v12

    .line 1605
    iget v15, v7, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1606
    .line 1607
    move/from16 v21, v0

    .line 1608
    .line 1609
    iget v0, v9, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1610
    .line 1611
    sub-float v0, v15, v0

    .line 1612
    .line 1613
    mul-float/2addr v0, v4

    .line 1614
    move/from16 v23, v0

    .line 1615
    .line 1616
    iget v0, v7, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1617
    .line 1618
    iget v9, v9, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1619
    .line 1620
    sub-float v9, v0, v9

    .line 1621
    .line 1622
    mul-float/2addr v9, v4

    .line 1623
    move/from16 v24, v0

    .line 1624
    .line 1625
    iget v0, v12, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1626
    .line 1627
    move/from16 v26, v0

    .line 1628
    .line 1629
    iget v0, v11, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1630
    .line 1631
    sub-float v26, v26, v0

    .line 1632
    .line 1633
    mul-float v26, v26, v4

    .line 1634
    .line 1635
    move/from16 v31, v0

    .line 1636
    .line 1637
    iget v0, v12, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1638
    .line 1639
    move/from16 v32, v0

    .line 1640
    .line 1641
    iget v0, v11, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1642
    .line 1643
    sub-float v32, v32, v0

    .line 1644
    .line 1645
    mul-float v32, v32, v4

    .line 1646
    .line 1647
    add-float v31, v31, v23

    .line 1648
    .line 1649
    add-float/2addr v0, v9

    .line 1650
    mul-float v0, v0, v20

    .line 1651
    .line 1652
    sub-float v33, v15, v26

    .line 1653
    .line 1654
    sub-float v9, v24, v32

    .line 1655
    .line 1656
    mul-float v34, v9, v20

    .line 1657
    .line 1658
    mul-float v36, v24, v20

    .line 1659
    .line 1660
    move/from16 v32, v0

    .line 1661
    .line 1662
    move/from16 v35, v15

    .line 1663
    .line 1664
    invoke-virtual/range {v30 .. v36}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    .line 1665
    .line 1666
    .line 1667
    move-object v9, v11

    .line 1668
    move-object/from16 v0, v30

    .line 1669
    .line 1670
    move-object v11, v7

    .line 1671
    move-object v7, v12

    .line 1672
    move/from16 v12, v21

    .line 1673
    .line 1674
    goto :goto_1e

    .line 1675
    :cond_3c
    move-object/from16 v0, v30

    .line 1676
    .line 1677
    :cond_3d
    iget-boolean v4, v13, La/v500;->A:Z

    .line 1678
    .line 1679
    if-eqz v4, :cond_3e

    .line 1680
    .line 1681
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 1682
    .line 1683
    .line 1684
    invoke-virtual {v2, v0}, Landroid/graphics/Path;->addPath(Landroid/graphics/Path;)V

    .line 1685
    .line 1686
    .line 1687
    iget-object v4, v3, La/s500;->l:Landroid/graphics/Canvas;

    .line 1688
    .line 1689
    iget-object v7, v3, La/s500;->g:La/hu5;

    .line 1690
    .line 1691
    move-object/from16 v24, v2

    .line 1692
    .line 1693
    move-object/from16 v21, v3

    .line 1694
    .line 1695
    move-object/from16 v22, v4

    .line 1696
    .line 1697
    move-object/from16 v26, v7

    .line 1698
    .line 1699
    move-object/from16 v23, v13

    .line 1700
    .line 1701
    invoke-virtual/range {v21 .. v26}, La/s500;->o1(Landroid/graphics/Canvas;La/v500;Landroid/graphics/Path;La/ywq0;La/hu5;)V

    .line 1702
    .line 1703
    .line 1704
    :cond_3e
    move-object/from16 v2, v25

    .line 1705
    .line 1706
    iget-object v4, v13, La/v500;->a:Ljava/util/ArrayList;

    .line 1707
    .line 1708
    const/4 v7, 0x0

    .line 1709
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1710
    .line 1711
    .line 1712
    move-result-object v4

    .line 1713
    check-cast v4, Ljava/lang/Integer;

    .line 1714
    .line 1715
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1716
    .line 1717
    .line 1718
    move-result v4

    .line 1719
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setColor(I)V

    .line 1720
    .line 1721
    .line 1722
    sget-object v4, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 1723
    .line 1724
    invoke-virtual {v5, v4}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 1725
    .line 1726
    .line 1727
    invoke-virtual {v2, v0}, La/ywq0;->u(Landroid/graphics/Path;)V

    .line 1728
    .line 1729
    .line 1730
    iget-object v2, v3, La/s500;->l:Landroid/graphics/Canvas;

    .line 1731
    .line 1732
    invoke-virtual {v2, v0, v5}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1733
    .line 1734
    .line 1735
    const/4 v15, 0x0

    .line 1736
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1737
    .line 1738
    .line 1739
    :goto_21
    invoke-virtual {v5, v15}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1740
    .line 1741
    .line 1742
    goto :goto_23

    .line 1743
    :cond_3f
    move/from16 v43, v2

    .line 1744
    .line 1745
    move-object/from16 v42, v4

    .line 1746
    .line 1747
    move-object/from16 v41, v7

    .line 1748
    .line 1749
    move-wide/from16 v38, v8

    .line 1750
    .line 1751
    move-object/from16 v40, v11

    .line 1752
    .line 1753
    :goto_22
    move-object/from16 v44, v12

    .line 1754
    .line 1755
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1756
    .line 1757
    :goto_23
    move-object/from16 v0, p0

    .line 1758
    .line 1759
    move-wide/from16 v8, v38

    .line 1760
    .line 1761
    move-object/from16 v11, v40

    .line 1762
    .line 1763
    move-object/from16 v7, v41

    .line 1764
    .line 1765
    move-object/from16 v4, v42

    .line 1766
    .line 1767
    move/from16 v2, v43

    .line 1768
    .line 1769
    move-object/from16 v12, v44

    .line 1770
    .line 1771
    const/4 v14, 0x0

    .line 1772
    goto/16 :goto_c

    .line 1773
    .line 1774
    :cond_40
    move/from16 v43, v2

    .line 1775
    .line 1776
    move-object/from16 v42, v4

    .line 1777
    .line 1778
    move-object/from16 v41, v7

    .line 1779
    .line 1780
    move-wide/from16 v38, v8

    .line 1781
    .line 1782
    const/4 v0, 0x0

    .line 1783
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1784
    .line 1785
    invoke-virtual {v1, v12, v0, v0, v5}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1786
    .line 1787
    .line 1788
    :goto_24
    move-object/from16 v0, p0

    .line 1789
    .line 1790
    goto :goto_25

    .line 1791
    :cond_41
    move/from16 v43, v2

    .line 1792
    .line 1793
    move-object/from16 v42, v4

    .line 1794
    .line 1795
    move-object/from16 v41, v7

    .line 1796
    .line 1797
    move-wide/from16 v38, v8

    .line 1798
    .line 1799
    const/high16 v20, 0x3f800000    # 1.0f

    .line 1800
    .line 1801
    goto :goto_24

    .line 1802
    :goto_25
    iget-object v2, v0, La/kwb;->i:La/urv0;

    .line 1803
    .line 1804
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1805
    .line 1806
    .line 1807
    iget-object v2, v0, La/eu5;->v1:La/a2w0;

    .line 1808
    .line 1809
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1810
    .line 1811
    .line 1812
    iget-object v2, v0, La/eu5;->w1:La/a2w0;

    .line 1813
    .line 1814
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1815
    .line 1816
    .line 1817
    iget-object v2, v0, La/kwb;->y:[La/vxv;

    .line 1818
    .line 1819
    if-eqz v2, :cond_48

    .line 1820
    .line 1821
    array-length v3, v2

    .line 1822
    if-lez v3, :cond_48

    .line 1823
    .line 1824
    const/16 v37, 0x0

    .line 1825
    .line 1826
    aget-object v3, v2, v37

    .line 1827
    .line 1828
    if-nez v3, :cond_42

    .line 1829
    .line 1830
    goto/16 :goto_28

    .line 1831
    .line 1832
    :cond_42
    iget-object v3, v0, La/kwb;->p:La/cbj;

    .line 1833
    .line 1834
    check-cast v3, La/s500;

    .line 1835
    .line 1836
    iget-object v4, v3, La/cbj;->c:La/lwb;

    .line 1837
    .line 1838
    iget-object v5, v3, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 1839
    .line 1840
    invoke-virtual {v5}, La/q500;->getLineData()La/u500;

    .line 1841
    .line 1842
    .line 1843
    move-result-object v6

    .line 1844
    array-length v7, v2

    .line 1845
    const/4 v8, 0x0

    .line 1846
    :goto_26
    if-ge v8, v7, :cond_48

    .line 1847
    .line 1848
    aget-object v9, v2, v8

    .line 1849
    .line 1850
    iget v10, v9, La/vxv;->e:I

    .line 1851
    .line 1852
    invoke-virtual {v6, v10}, La/mwb;->c(I)La/iuw;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v10

    .line 1856
    check-cast v10, La/v500;

    .line 1857
    .line 1858
    if-eqz v10, :cond_47

    .line 1859
    .line 1860
    iget-object v11, v10, La/v500;->o:Ljava/util/ArrayList;

    .line 1861
    .line 1862
    iget-boolean v12, v10, La/v500;->e:Z

    .line 1863
    .line 1864
    if-nez v12, :cond_43

    .line 1865
    .line 1866
    goto/16 :goto_27

    .line 1867
    .line 1868
    :cond_43
    iget v12, v9, La/vxv;->a:F

    .line 1869
    .line 1870
    iget v9, v9, La/vxv;->b:F

    .line 1871
    .line 1872
    const/4 v13, 0x3

    .line 1873
    invoke-virtual {v10, v12, v9, v13}, La/v500;->c(FFI)Lcom/github/mikephil/charting/data/Entry;

    .line 1874
    .line 1875
    .line 1876
    move-result-object v9

    .line 1877
    if-nez v9, :cond_44

    .line 1878
    .line 1879
    goto/16 :goto_27

    .line 1880
    .line 1881
    :cond_44
    invoke-virtual {v11, v9}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 1882
    .line 1883
    .line 1884
    move-result v12

    .line 1885
    int-to-float v12, v12

    .line 1886
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 1887
    .line 1888
    .line 1889
    move-result v11

    .line 1890
    int-to-float v11, v11

    .line 1891
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1892
    .line 1893
    .line 1894
    mul-float v11, v11, v20

    .line 1895
    .line 1896
    cmpl-float v11, v12, v11

    .line 1897
    .line 1898
    if-ltz v11, :cond_45

    .line 1899
    .line 1900
    goto :goto_27

    .line 1901
    :cond_45
    iget v11, v10, La/v500;->d:I

    .line 1902
    .line 1903
    invoke-virtual {v5, v11}, La/eu5;->f(I)La/ywq0;

    .line 1904
    .line 1905
    .line 1906
    move-result-object v11

    .line 1907
    iget v12, v9, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 1908
    .line 1909
    iget v9, v9, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 1910
    .line 1911
    mul-float v9, v9, v20

    .line 1912
    .line 1913
    iget-object v14, v11, La/ywq0;->f:Ljava/lang/Object;

    .line 1914
    .line 1915
    check-cast v14, [F

    .line 1916
    .line 1917
    const/16 v37, 0x0

    .line 1918
    .line 1919
    aput v12, v14, v37

    .line 1920
    .line 1921
    const/16 v29, 0x1

    .line 1922
    .line 1923
    aput v9, v14, v29

    .line 1924
    .line 1925
    invoke-virtual {v11, v14}, La/ywq0;->x([F)V

    .line 1926
    .line 1927
    .line 1928
    aget v9, v14, v37

    .line 1929
    .line 1930
    float-to-double v11, v9

    .line 1931
    aget v9, v14, v29

    .line 1932
    .line 1933
    float-to-double v14, v9

    .line 1934
    sget-object v9, La/bp10;->d:La/z960;

    .line 1935
    .line 1936
    invoke-virtual {v9}, La/z960;->b()La/y960;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v9

    .line 1940
    check-cast v9, La/bp10;

    .line 1941
    .line 1942
    iput-wide v11, v9, La/bp10;->b:D

    .line 1943
    .line 1944
    iput-wide v14, v9, La/bp10;->c:D

    .line 1945
    .line 1946
    double-to-float v9, v11

    .line 1947
    double-to-float v11, v14

    .line 1948
    iget-object v12, v3, La/p4;->b:Ljava/lang/Object;

    .line 1949
    .line 1950
    check-cast v12, La/xju0;

    .line 1951
    .line 1952
    iget-object v14, v3, La/s500;->h:Landroid/graphics/Path;

    .line 1953
    .line 1954
    iget-object v15, v3, La/cbj;->e:Landroid/graphics/Paint;

    .line 1955
    .line 1956
    iget v13, v10, La/v500;->t:I

    .line 1957
    .line 1958
    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setColor(I)V

    .line 1959
    .line 1960
    .line 1961
    iget v13, v10, La/v500;->w:F

    .line 1962
    .line 1963
    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 1964
    .line 1965
    .line 1966
    const/4 v13, 0x0

    .line 1967
    invoke-virtual {v15, v13}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 1968
    .line 1969
    .line 1970
    iget-boolean v13, v10, La/v500;->u:Z

    .line 1971
    .line 1972
    if-eqz v13, :cond_46

    .line 1973
    .line 1974
    invoke-virtual {v14}, Landroid/graphics/Path;->reset()V

    .line 1975
    .line 1976
    .line 1977
    iget-object v13, v12, La/xju0;->b:Landroid/graphics/RectF;

    .line 1978
    .line 1979
    iget v13, v13, Landroid/graphics/RectF;->top:F

    .line 1980
    .line 1981
    invoke-virtual {v14, v9, v13}, Landroid/graphics/Path;->moveTo(FF)V

    .line 1982
    .line 1983
    .line 1984
    iget-object v13, v12, La/xju0;->b:Landroid/graphics/RectF;

    .line 1985
    .line 1986
    iget v13, v13, Landroid/graphics/RectF;->bottom:F

    .line 1987
    .line 1988
    invoke-virtual {v14, v9, v13}, Landroid/graphics/Path;->lineTo(FF)V

    .line 1989
    .line 1990
    .line 1991
    invoke-virtual {v1, v14, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 1992
    .line 1993
    .line 1994
    :cond_46
    iget-boolean v9, v10, La/v500;->v:Z

    .line 1995
    .line 1996
    if-eqz v9, :cond_47

    .line 1997
    .line 1998
    invoke-virtual {v14}, Landroid/graphics/Path;->reset()V

    .line 1999
    .line 2000
    .line 2001
    iget-object v9, v12, La/xju0;->b:Landroid/graphics/RectF;

    .line 2002
    .line 2003
    iget v9, v9, Landroid/graphics/RectF;->left:F

    .line 2004
    .line 2005
    invoke-virtual {v14, v9, v11}, Landroid/graphics/Path;->moveTo(FF)V

    .line 2006
    .line 2007
    .line 2008
    iget-object v9, v12, La/xju0;->b:Landroid/graphics/RectF;

    .line 2009
    .line 2010
    iget v9, v9, Landroid/graphics/RectF;->right:F

    .line 2011
    .line 2012
    invoke-virtual {v14, v9, v11}, Landroid/graphics/Path;->lineTo(FF)V

    .line 2013
    .line 2014
    .line 2015
    invoke-virtual {v1, v14, v15}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2016
    .line 2017
    .line 2018
    :cond_47
    :goto_27
    add-int/lit8 v8, v8, 0x1

    .line 2019
    .line 2020
    goto/16 :goto_26

    .line 2021
    .line 2022
    :cond_48
    :goto_28
    move/from16 v2, v43

    .line 2023
    .line 2024
    invoke-virtual {v1, v2}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2025
    .line 2026
    .line 2027
    iget-object v2, v0, La/kwb;->p:La/cbj;

    .line 2028
    .line 2029
    check-cast v2, La/s500;

    .line 2030
    .line 2031
    iget-object v3, v2, La/s500;->g:La/hu5;

    .line 2032
    .line 2033
    iget-object v4, v2, La/p4;->b:Ljava/lang/Object;

    .line 2034
    .line 2035
    check-cast v4, La/xju0;

    .line 2036
    .line 2037
    iget-object v5, v2, La/s500;->r:Ljava/util/HashMap;

    .line 2038
    .line 2039
    iget-object v6, v2, La/cbj;->d:Landroid/graphics/Paint;

    .line 2040
    .line 2041
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 2042
    .line 2043
    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 2044
    .line 2045
    .line 2046
    iget-object v6, v2, La/cbj;->c:La/lwb;

    .line 2047
    .line 2048
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2049
    .line 2050
    .line 2051
    iget-object v6, v2, La/s500;->s:[F

    .line 2052
    .line 2053
    const/16 v27, 0x0

    .line 2054
    .line 2055
    const/16 v37, 0x0

    .line 2056
    .line 2057
    aput v27, v6, v37

    .line 2058
    .line 2059
    const/16 v29, 0x1

    .line 2060
    .line 2061
    aput v27, v6, v29

    .line 2062
    .line 2063
    iget-object v7, v2, La/s500;->i:Lorg/xplatform/feature/fin_bet/impl/presentation/view/FinBetChartView;

    .line 2064
    .line 2065
    invoke-virtual {v7}, La/q500;->getLineData()La/u500;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v8

    .line 2069
    iget-object v8, v8, La/mwb;->i:Ljava/util/ArrayList;

    .line 2070
    .line 2071
    const/4 v9, 0x0

    .line 2072
    :goto_29
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    .line 2073
    .line 2074
    .line 2075
    move-result v10

    .line 2076
    if-ge v9, v10, :cond_57

    .line 2077
    .line 2078
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2079
    .line 2080
    .line 2081
    move-result-object v10

    .line 2082
    check-cast v10, La/v500;

    .line 2083
    .line 2084
    iget-boolean v11, v10, La/v500;->n:Z

    .line 2085
    .line 2086
    iget-object v12, v10, La/v500;->C:Ljava/util/ArrayList;

    .line 2087
    .line 2088
    iget v13, v10, La/v500;->F:F

    .line 2089
    .line 2090
    iget v14, v10, La/v500;->E:F

    .line 2091
    .line 2092
    iget v15, v10, La/v500;->D:I

    .line 2093
    .line 2094
    if-eqz v11, :cond_49

    .line 2095
    .line 2096
    iget-boolean v11, v10, La/v500;->I:Z

    .line 2097
    .line 2098
    if-eqz v11, :cond_49

    .line 2099
    .line 2100
    iget-object v11, v10, La/v500;->o:Ljava/util/ArrayList;

    .line 2101
    .line 2102
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 2103
    .line 2104
    .line 2105
    move-result v11

    .line 2106
    if-nez v11, :cond_4a

    .line 2107
    .line 2108
    :cond_49
    move-object/from16 v22, v2

    .line 2109
    .line 2110
    move-object/from16 v23, v5

    .line 2111
    .line 2112
    move-object/from16 v18, v7

    .line 2113
    .line 2114
    move-object/from16 v25, v8

    .line 2115
    .line 2116
    move-object v8, v1

    .line 2117
    goto/16 :goto_33

    .line 2118
    .line 2119
    :cond_4a
    iget-object v11, v2, La/s500;->j:Landroid/graphics/Paint;

    .line 2120
    .line 2121
    invoke-virtual {v11, v15}, Landroid/graphics/Paint;->setColor(I)V

    .line 2122
    .line 2123
    .line 2124
    iget v11, v10, La/v500;->d:I

    .line 2125
    .line 2126
    invoke-virtual {v7, v11}, La/eu5;->f(I)La/ywq0;

    .line 2127
    .line 2128
    .line 2129
    move-result-object v11

    .line 2130
    invoke-virtual {v3, v7, v10}, La/hu5;->X(La/eu5;La/v500;)V

    .line 2131
    .line 2132
    .line 2133
    move-object/from16 v18, v7

    .line 2134
    .line 2135
    iget-boolean v7, v10, La/v500;->J:Z

    .line 2136
    .line 2137
    if-eqz v7, :cond_4b

    .line 2138
    .line 2139
    cmpg-float v7, v13, v14

    .line 2140
    .line 2141
    if-gez v7, :cond_4b

    .line 2142
    .line 2143
    const/16 v27, 0x0

    .line 2144
    .line 2145
    cmpl-float v7, v13, v27

    .line 2146
    .line 2147
    if-lez v7, :cond_4b

    .line 2148
    .line 2149
    const/4 v7, 0x1

    .line 2150
    goto :goto_2a

    .line 2151
    :cond_4b
    const/4 v7, 0x0

    .line 2152
    :goto_2a
    move/from16 v21, v7

    .line 2153
    .line 2154
    if-eqz v7, :cond_4c

    .line 2155
    .line 2156
    const v7, 0x112233

    .line 2157
    .line 2158
    .line 2159
    if-ne v15, v7, :cond_4c

    .line 2160
    .line 2161
    const/4 v7, 0x1

    .line 2162
    goto :goto_2b

    .line 2163
    :cond_4c
    const/4 v7, 0x0

    .line 2164
    :goto_2b
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 2165
    .line 2166
    .line 2167
    move-result v15

    .line 2168
    if-eqz v15, :cond_4d

    .line 2169
    .line 2170
    invoke-virtual {v5, v10}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2171
    .line 2172
    .line 2173
    move-result-object v15

    .line 2174
    check-cast v15, La/r500;

    .line 2175
    .line 2176
    goto :goto_2c

    .line 2177
    :cond_4d
    new-instance v15, La/r500;

    .line 2178
    .line 2179
    invoke-direct {v15, v2}, La/r500;-><init>(La/s500;)V

    .line 2180
    .line 2181
    .line 2182
    invoke-virtual {v5, v10, v15}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 2183
    .line 2184
    .line 2185
    :goto_2c
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2186
    .line 2187
    .line 2188
    move-object/from16 v22, v2

    .line 2189
    .line 2190
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 2191
    .line 2192
    .line 2193
    move-result v2

    .line 2194
    move-object/from16 v23, v5

    .line 2195
    .line 2196
    iget-object v5, v15, La/r500;->b:[Landroid/graphics/Bitmap;

    .line 2197
    .line 2198
    if-nez v5, :cond_4e

    .line 2199
    .line 2200
    new-array v2, v2, [Landroid/graphics/Bitmap;

    .line 2201
    .line 2202
    iput-object v2, v15, La/r500;->b:[Landroid/graphics/Bitmap;

    .line 2203
    .line 2204
    goto :goto_2d

    .line 2205
    :cond_4e
    array-length v5, v5

    .line 2206
    if-eq v5, v2, :cond_51

    .line 2207
    .line 2208
    new-array v2, v2, [Landroid/graphics/Bitmap;

    .line 2209
    .line 2210
    iput-object v2, v15, La/r500;->b:[Landroid/graphics/Bitmap;

    .line 2211
    .line 2212
    :goto_2d
    iget-object v2, v15, La/r500;->a:Landroid/graphics/Path;

    .line 2213
    .line 2214
    iget-object v5, v15, La/r500;->c:La/s500;

    .line 2215
    .line 2216
    move/from16 v24, v7

    .line 2217
    .line 2218
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 2219
    .line 2220
    .line 2221
    move-result v7

    .line 2222
    move-object/from16 v25, v8

    .line 2223
    .line 2224
    const/4 v8, 0x0

    .line 2225
    :goto_2e
    if-ge v8, v7, :cond_52

    .line 2226
    .line 2227
    move/from16 v26, v7

    .line 2228
    .line 2229
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_4444:Landroid/graphics/Bitmap$Config;

    .line 2230
    .line 2231
    float-to-double v0, v14

    .line 2232
    const-wide v30, 0x4000cccccccccccdL    # 2.1

    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    mul-double v0, v0, v30

    .line 2238
    .line 2239
    double-to-int v0, v0

    .line 2240
    invoke-static {v0, v0, v7}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    .line 2241
    .line 2242
    .line 2243
    move-result-object v0

    .line 2244
    new-instance v1, Landroid/graphics/Canvas;

    .line 2245
    .line 2246
    invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2247
    .line 2248
    .line 2249
    iget-object v7, v15, La/r500;->b:[Landroid/graphics/Bitmap;

    .line 2250
    .line 2251
    aput-object v0, v7, v8

    .line 2252
    .line 2253
    iget-object v0, v5, La/cbj;->d:Landroid/graphics/Paint;

    .line 2254
    .line 2255
    invoke-virtual {v12, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v7

    .line 2259
    check-cast v7, Ljava/lang/Integer;

    .line 2260
    .line 2261
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 2262
    .line 2263
    .line 2264
    move-result v7

    .line 2265
    invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 2266
    .line 2267
    .line 2268
    if-eqz v24, :cond_4f

    .line 2269
    .line 2270
    invoke-virtual {v2}, Landroid/graphics/Path;->reset()V

    .line 2271
    .line 2272
    .line 2273
    sget-object v7, Landroid/graphics/Path$Direction;->CW:Landroid/graphics/Path$Direction;

    .line 2274
    .line 2275
    invoke-virtual {v2, v14, v14, v14, v7}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 2276
    .line 2277
    .line 2278
    sget-object v7, Landroid/graphics/Path$Direction;->CCW:Landroid/graphics/Path$Direction;

    .line 2279
    .line 2280
    invoke-virtual {v2, v14, v14, v13, v7}, Landroid/graphics/Path;->addCircle(FFFLandroid/graphics/Path$Direction;)V

    .line 2281
    .line 2282
    .line 2283
    invoke-virtual {v1, v2, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 2284
    .line 2285
    .line 2286
    goto :goto_2f

    .line 2287
    :cond_4f
    invoke-virtual {v1, v14, v14, v14, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 2288
    .line 2289
    .line 2290
    if-eqz v21, :cond_50

    .line 2291
    .line 2292
    iget-object v0, v5, La/s500;->j:Landroid/graphics/Paint;

    .line 2293
    .line 2294
    invoke-virtual {v1, v14, v14, v13, v0}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 2295
    .line 2296
    .line 2297
    :cond_50
    :goto_2f
    add-int/lit8 v8, v8, 0x1

    .line 2298
    .line 2299
    move-object/from16 v0, p0

    .line 2300
    .line 2301
    move-object/from16 v1, p1

    .line 2302
    .line 2303
    move/from16 v7, v26

    .line 2304
    .line 2305
    goto :goto_2e

    .line 2306
    :cond_51
    move-object/from16 v25, v8

    .line 2307
    .line 2308
    :cond_52
    iget v0, v3, La/hu5;->d:I

    .line 2309
    .line 2310
    iget v1, v3, La/hu5;->b:I

    .line 2311
    .line 2312
    add-int/2addr v0, v1

    .line 2313
    :goto_30
    if-gt v1, v0, :cond_53

    .line 2314
    .line 2315
    invoke-virtual {v10, v1}, La/v500;->b(I)Lcom/github/mikephil/charting/data/Entry;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v2

    .line 2319
    if-nez v2, :cond_54

    .line 2320
    .line 2321
    :cond_53
    :goto_31
    move-object/from16 v8, p1

    .line 2322
    .line 2323
    goto :goto_33

    .line 2324
    :cond_54
    iget v5, v2, Lcom/github/mikephil/charting/data/Entry;->c:F

    .line 2325
    .line 2326
    const/16 v37, 0x0

    .line 2327
    .line 2328
    aput v5, v6, v37

    .line 2329
    .line 2330
    iget v2, v2, Lcom/github/mikephil/charting/data/Entry;->a:F

    .line 2331
    .line 2332
    mul-float v2, v2, v20

    .line 2333
    .line 2334
    const/16 v29, 0x1

    .line 2335
    .line 2336
    aput v2, v6, v29

    .line 2337
    .line 2338
    invoke-virtual {v11, v6}, La/ywq0;->x([F)V

    .line 2339
    .line 2340
    .line 2341
    aget v2, v6, v37

    .line 2342
    .line 2343
    invoke-virtual {v4, v2}, La/xju0;->c(F)Z

    .line 2344
    .line 2345
    .line 2346
    move-result v2

    .line 2347
    if-nez v2, :cond_55

    .line 2348
    .line 2349
    goto :goto_31

    .line 2350
    :cond_55
    aget v2, v6, v37

    .line 2351
    .line 2352
    invoke-virtual {v4, v2}, La/xju0;->b(F)Z

    .line 2353
    .line 2354
    .line 2355
    move-result v2

    .line 2356
    if-eqz v2, :cond_56

    .line 2357
    .line 2358
    aget v2, v6, v29

    .line 2359
    .line 2360
    iget-object v5, v4, La/xju0;->b:Landroid/graphics/RectF;

    .line 2361
    .line 2362
    iget v7, v5, Landroid/graphics/RectF;->top:F

    .line 2363
    .line 2364
    cmpg-float v7, v7, v2

    .line 2365
    .line 2366
    if-gtz v7, :cond_56

    .line 2367
    .line 2368
    mul-float v7, v2, v28

    .line 2369
    .line 2370
    float-to-int v7, v7

    .line 2371
    int-to-float v7, v7

    .line 2372
    div-float v7, v7, v28

    .line 2373
    .line 2374
    iget v5, v5, Landroid/graphics/RectF;->bottom:F

    .line 2375
    .line 2376
    cmpl-float v5, v5, v7

    .line 2377
    .line 2378
    if-ltz v5, :cond_56

    .line 2379
    .line 2380
    iget-object v5, v15, La/r500;->b:[Landroid/graphics/Bitmap;

    .line 2381
    .line 2382
    array-length v7, v5

    .line 2383
    rem-int v7, v1, v7

    .line 2384
    .line 2385
    aget-object v5, v5, v7

    .line 2386
    .line 2387
    if-eqz v5, :cond_56

    .line 2388
    .line 2389
    const/16 v37, 0x0

    .line 2390
    .line 2391
    aget v7, v6, v37

    .line 2392
    .line 2393
    sub-float/2addr v7, v14

    .line 2394
    sub-float/2addr v2, v14

    .line 2395
    move-object/from16 v8, p1

    .line 2396
    .line 2397
    const/4 v13, 0x0

    .line 2398
    invoke-virtual {v8, v5, v7, v2, v13}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 2399
    .line 2400
    .line 2401
    goto :goto_32

    .line 2402
    :cond_56
    move-object/from16 v8, p1

    .line 2403
    .line 2404
    :goto_32
    add-int/lit8 v1, v1, 0x1

    .line 2405
    .line 2406
    goto :goto_30

    .line 2407
    :goto_33
    add-int/lit8 v9, v9, 0x1

    .line 2408
    .line 2409
    move-object/from16 v0, p0

    .line 2410
    .line 2411
    move-object v1, v8

    .line 2412
    move-object/from16 v7, v18

    .line 2413
    .line 2414
    move-object/from16 v2, v22

    .line 2415
    .line 2416
    move-object/from16 v5, v23

    .line 2417
    .line 2418
    move-object/from16 v8, v25

    .line 2419
    .line 2420
    goto/16 :goto_29

    .line 2421
    .line 2422
    :cond_57
    move-object v8, v1

    .line 2423
    iget-object v1, v0, La/kwb;->i:La/urv0;

    .line 2424
    .line 2425
    iget-boolean v1, v1, La/cgd;->a:Z

    .line 2426
    .line 2427
    if-eqz v1, :cond_5a

    .line 2428
    .line 2429
    iget-object v1, v0, La/eu5;->B1:La/vrv0;

    .line 2430
    .line 2431
    iget-object v2, v1, La/vrv0;->h:La/urv0;

    .line 2432
    .line 2433
    iget-object v2, v2, La/wa5;->p:Ljava/util/ArrayList;

    .line 2434
    .line 2435
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2436
    .line 2437
    .line 2438
    move-result v3

    .line 2439
    if-gtz v3, :cond_58

    .line 2440
    .line 2441
    goto :goto_34

    .line 2442
    :cond_58
    iget-object v1, v1, La/vrv0;->l:[F

    .line 2443
    .line 2444
    const/4 v7, 0x0

    .line 2445
    const/16 v27, 0x0

    .line 2446
    .line 2447
    aput v27, v1, v7

    .line 2448
    .line 2449
    const/16 v29, 0x1

    .line 2450
    .line 2451
    aput v27, v1, v29

    .line 2452
    .line 2453
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 2454
    .line 2455
    .line 2456
    move-result v1

    .line 2457
    if-gtz v1, :cond_59

    .line 2458
    .line 2459
    goto :goto_34

    .line 2460
    :cond_59
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v0

    .line 2464
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2465
    .line 2466
    .line 2467
    invoke-static {}, La/hny;->b()V

    .line 2468
    .line 2469
    .line 2470
    return-void

    .line 2471
    :cond_5a
    :goto_34
    iget-object v1, v0, La/eu5;->v1:La/a2w0;

    .line 2472
    .line 2473
    iget-boolean v1, v1, La/cgd;->a:Z

    .line 2474
    .line 2475
    if-eqz v1, :cond_5b

    .line 2476
    .line 2477
    iget-object v1, v0, La/eu5;->x1:La/b2w0;

    .line 2478
    .line 2479
    invoke-virtual {v1}, La/b2w0;->t1()V

    .line 2480
    .line 2481
    .line 2482
    :cond_5b
    iget-object v1, v0, La/eu5;->w1:La/a2w0;

    .line 2483
    .line 2484
    iget-boolean v1, v1, La/cgd;->a:Z

    .line 2485
    .line 2486
    if-eqz v1, :cond_5c

    .line 2487
    .line 2488
    iget-object v1, v0, La/eu5;->y1:La/b2w0;

    .line 2489
    .line 2490
    invoke-virtual {v1}, La/b2w0;->t1()V

    .line 2491
    .line 2492
    .line 2493
    :cond_5c
    iget-object v1, v0, La/eu5;->B1:La/vrv0;

    .line 2494
    .line 2495
    iget-object v2, v1, La/xa5;->f:Landroid/graphics/Paint;

    .line 2496
    .line 2497
    iget-object v3, v1, La/p4;->b:Ljava/lang/Object;

    .line 2498
    .line 2499
    check-cast v3, La/xju0;

    .line 2500
    .line 2501
    iget-object v4, v1, La/vrv0;->h:La/urv0;

    .line 2502
    .line 2503
    iget-boolean v5, v4, La/cgd;->a:Z

    .line 2504
    .line 2505
    if-eqz v5, :cond_62

    .line 2506
    .line 2507
    iget-boolean v5, v4, La/wa5;->n:Z

    .line 2508
    .line 2509
    if-nez v5, :cond_5d

    .line 2510
    .line 2511
    goto/16 :goto_36

    .line 2512
    .line 2513
    :cond_5d
    iget v5, v4, La/cgd;->c:F

    .line 2514
    .line 2515
    const/4 v15, 0x0

    .line 2516
    invoke-virtual {v2, v15}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2517
    .line 2518
    .line 2519
    iget v6, v4, La/cgd;->d:F

    .line 2520
    .line 2521
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2522
    .line 2523
    .line 2524
    iget v6, v4, La/cgd;->e:I

    .line 2525
    .line 2526
    invoke-virtual {v2, v6}, Landroid/graphics/Paint;->setColor(I)V

    .line 2527
    .line 2528
    .line 2529
    const/4 v2, 0x0

    .line 2530
    invoke-static {v2, v2}, La/cp10;->b(FF)La/cp10;

    .line 2531
    .line 2532
    .line 2533
    move-result-object v6

    .line 2534
    iget v2, v4, La/urv0;->x:I

    .line 2535
    .line 2536
    const/high16 v7, 0x3f000000    # 0.5f

    .line 2537
    .line 2538
    const/4 v9, 0x1

    .line 2539
    if-ne v2, v9, :cond_5e

    .line 2540
    .line 2541
    iput v7, v6, La/cp10;->b:F

    .line 2542
    .line 2543
    move/from16 v9, v20

    .line 2544
    .line 2545
    iput v9, v6, La/cp10;->c:F

    .line 2546
    .line 2547
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2548
    .line 2549
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 2550
    .line 2551
    sub-float/2addr v2, v5

    .line 2552
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2553
    .line 2554
    .line 2555
    goto :goto_35

    .line 2556
    :cond_5e
    move/from16 v10, v19

    .line 2557
    .line 2558
    move/from16 v9, v20

    .line 2559
    .line 2560
    if-ne v2, v10, :cond_5f

    .line 2561
    .line 2562
    iput v7, v6, La/cp10;->b:F

    .line 2563
    .line 2564
    iput v9, v6, La/cp10;->c:F

    .line 2565
    .line 2566
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2567
    .line 2568
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 2569
    .line 2570
    add-float/2addr v2, v5

    .line 2571
    iget v3, v4, La/urv0;->v:I

    .line 2572
    .line 2573
    int-to-float v3, v3

    .line 2574
    add-float/2addr v2, v3

    .line 2575
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2576
    .line 2577
    .line 2578
    goto :goto_35

    .line 2579
    :cond_5f
    const/4 v11, 0x2

    .line 2580
    if-ne v2, v11, :cond_60

    .line 2581
    .line 2582
    iput v7, v6, La/cp10;->b:F

    .line 2583
    .line 2584
    const/4 v9, 0x0

    .line 2585
    iput v9, v6, La/cp10;->c:F

    .line 2586
    .line 2587
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2588
    .line 2589
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 2590
    .line 2591
    add-float/2addr v2, v5

    .line 2592
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2593
    .line 2594
    .line 2595
    goto :goto_35

    .line 2596
    :cond_60
    move/from16 v10, v17

    .line 2597
    .line 2598
    const/4 v9, 0x0

    .line 2599
    if-ne v2, v10, :cond_61

    .line 2600
    .line 2601
    iput v7, v6, La/cp10;->b:F

    .line 2602
    .line 2603
    iput v9, v6, La/cp10;->c:F

    .line 2604
    .line 2605
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2606
    .line 2607
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 2608
    .line 2609
    sub-float/2addr v2, v5

    .line 2610
    iget v3, v4, La/urv0;->v:I

    .line 2611
    .line 2612
    int-to-float v3, v3

    .line 2613
    sub-float/2addr v2, v3

    .line 2614
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2615
    .line 2616
    .line 2617
    goto :goto_35

    .line 2618
    :cond_61
    iput v7, v6, La/cp10;->b:F

    .line 2619
    .line 2620
    const/high16 v9, 0x3f800000    # 1.0f

    .line 2621
    .line 2622
    iput v9, v6, La/cp10;->c:F

    .line 2623
    .line 2624
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2625
    .line 2626
    iget v2, v2, Landroid/graphics/RectF;->top:F

    .line 2627
    .line 2628
    sub-float/2addr v2, v5

    .line 2629
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2630
    .line 2631
    .line 2632
    iput v7, v6, La/cp10;->b:F

    .line 2633
    .line 2634
    const/4 v2, 0x0

    .line 2635
    iput v2, v6, La/cp10;->c:F

    .line 2636
    .line 2637
    iget-object v2, v3, La/xju0;->b:Landroid/graphics/RectF;

    .line 2638
    .line 2639
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 2640
    .line 2641
    add-float/2addr v2, v5

    .line 2642
    invoke-virtual {v1, v8, v2, v6}, La/vrv0;->p1(Landroid/graphics/Canvas;FLa/cp10;)V

    .line 2643
    .line 2644
    .line 2645
    :goto_35
    sget-object v1, La/cp10;->d:La/z960;

    .line 2646
    .line 2647
    invoke-virtual {v1, v6}, La/z960;->c(La/y960;)V

    .line 2648
    .line 2649
    .line 2650
    :cond_62
    :goto_36
    iget-object v1, v0, La/eu5;->x1:La/b2w0;

    .line 2651
    .line 2652
    invoke-virtual {v1, v8}, La/b2w0;->q1(Landroid/graphics/Canvas;)V

    .line 2653
    .line 2654
    .line 2655
    iget-object v1, v0, La/eu5;->y1:La/b2w0;

    .line 2656
    .line 2657
    invoke-virtual {v1, v8}, La/b2w0;->q1(Landroid/graphics/Canvas;)V

    .line 2658
    .line 2659
    .line 2660
    iget-boolean v1, v0, La/eu5;->s1:Z

    .line 2661
    .line 2662
    if-eqz v1, :cond_63

    .line 2663
    .line 2664
    invoke-virtual {v8}, Landroid/graphics/Canvas;->save()I

    .line 2665
    .line 2666
    .line 2667
    move-result v1

    .line 2668
    move-object/from16 v2, v42

    .line 2669
    .line 2670
    invoke-virtual {v8, v2}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/RectF;)Z

    .line 2671
    .line 2672
    .line 2673
    iget-object v3, v0, La/kwb;->p:La/cbj;

    .line 2674
    .line 2675
    invoke-virtual {v3, v8}, La/cbj;->n1(Landroid/graphics/Canvas;)V

    .line 2676
    .line 2677
    .line 2678
    invoke-virtual {v8, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 2679
    .line 2680
    .line 2681
    goto :goto_37

    .line 2682
    :cond_63
    move-object/from16 v2, v42

    .line 2683
    .line 2684
    iget-object v1, v0, La/kwb;->p:La/cbj;

    .line 2685
    .line 2686
    invoke-virtual {v1, v8}, La/cbj;->n1(Landroid/graphics/Canvas;)V

    .line 2687
    .line 2688
    .line 2689
    :goto_37
    iget-object v1, v0, La/kwb;->o:La/xjz;

    .line 2690
    .line 2691
    invoke-virtual {v1, v8}, La/xjz;->o1(Landroid/graphics/Canvas;)V

    .line 2692
    .line 2693
    .line 2694
    iget-object v1, v0, La/kwb;->k:La/bck;

    .line 2695
    .line 2696
    if-eqz v1, :cond_64

    .line 2697
    .line 2698
    iget-boolean v1, v1, La/cgd;->a:Z

    .line 2699
    .line 2700
    if-eqz v1, :cond_64

    .line 2701
    .line 2702
    iget-object v1, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 2703
    .line 2704
    const/4 v15, 0x0

    .line 2705
    invoke-virtual {v1, v15}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 2706
    .line 2707
    .line 2708
    iget-object v1, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 2709
    .line 2710
    iget-object v3, v0, La/kwb;->k:La/bck;

    .line 2711
    .line 2712
    iget v3, v3, La/cgd;->d:F

    .line 2713
    .line 2714
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2715
    .line 2716
    .line 2717
    iget-object v1, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 2718
    .line 2719
    iget-object v3, v0, La/kwb;->k:La/bck;

    .line 2720
    .line 2721
    iget v3, v3, La/cgd;->e:I

    .line 2722
    .line 2723
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 2724
    .line 2725
    .line 2726
    iget-object v1, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 2727
    .line 2728
    iget-object v3, v0, La/kwb;->k:La/bck;

    .line 2729
    .line 2730
    iget-object v3, v3, La/bck;->g:Landroid/graphics/Paint$Align;

    .line 2731
    .line 2732
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 2733
    .line 2734
    .line 2735
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 2736
    .line 2737
    .line 2738
    move-result v1

    .line 2739
    int-to-float v1, v1

    .line 2740
    move-object/from16 v3, v41

    .line 2741
    .line 2742
    iget v4, v3, La/xju0;->c:F

    .line 2743
    .line 2744
    iget v5, v2, Landroid/graphics/RectF;->right:F

    .line 2745
    .line 2746
    sub-float/2addr v4, v5

    .line 2747
    sub-float/2addr v1, v4

    .line 2748
    iget-object v4, v0, La/kwb;->k:La/bck;

    .line 2749
    .line 2750
    iget v4, v4, La/cgd;->b:F

    .line 2751
    .line 2752
    sub-float/2addr v1, v4

    .line 2753
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 2754
    .line 2755
    .line 2756
    move-result v4

    .line 2757
    int-to-float v4, v4

    .line 2758
    iget v3, v3, La/xju0;->d:F

    .line 2759
    .line 2760
    iget v2, v2, Landroid/graphics/RectF;->bottom:F

    .line 2761
    .line 2762
    sub-float/2addr v3, v2

    .line 2763
    sub-float/2addr v4, v3

    .line 2764
    iget-object v2, v0, La/kwb;->k:La/bck;

    .line 2765
    .line 2766
    iget v3, v2, La/cgd;->c:F

    .line 2767
    .line 2768
    sub-float/2addr v4, v3

    .line 2769
    iget-object v2, v2, La/bck;->f:Ljava/lang/String;

    .line 2770
    .line 2771
    iget-object v3, v0, La/kwb;->g:Landroid/graphics/Paint;

    .line 2772
    .line 2773
    invoke-virtual {v8, v2, v1, v4, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 2774
    .line 2775
    .line 2776
    :cond_64
    iget-boolean v1, v0, La/kwb;->a:Z

    .line 2777
    .line 2778
    if-eqz v1, :cond_65

    .line 2779
    .line 2780
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2781
    .line 2782
    .line 2783
    move-result-wide v1

    .line 2784
    sub-long v1, v1, v38

    .line 2785
    .line 2786
    iget-wide v3, v0, La/eu5;->C1:J

    .line 2787
    .line 2788
    add-long/2addr v3, v1

    .line 2789
    iput-wide v3, v0, La/eu5;->C1:J

    .line 2790
    .line 2791
    iget-wide v5, v0, La/eu5;->D1:J

    .line 2792
    .line 2793
    const-wide/16 v7, 0x1

    .line 2794
    .line 2795
    add-long/2addr v5, v7

    .line 2796
    iput-wide v5, v0, La/eu5;->D1:J

    .line 2797
    .line 2798
    div-long/2addr v3, v5

    .line 2799
    const-string v5, "Drawtime: "

    .line 2800
    .line 2801
    const-string v6, " ms, average: "

    .line 2802
    .line 2803
    invoke-static {v1, v2, v5, v6}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2804
    .line 2805
    .line 2806
    move-result-object v1

    .line 2807
    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2808
    .line 2809
    .line 2810
    const-string v2, " ms, cycles: "

    .line 2811
    .line 2812
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 2813
    .line 2814
    .line 2815
    iget-wide v2, v0, La/eu5;->D1:J

    .line 2816
    .line 2817
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 2818
    .line 2819
    .line 2820
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 2821
    .line 2822
    .line 2823
    move-result-object v0

    .line 2824
    const-string v1, "MPAndroidChart"

    .line 2825
    .line 2826
    invoke-static {v1, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 2827
    .line 2828
    .line 2829
    :cond_65
    :goto_38
    return-void
.end method

.method public final onSizeChanged(IIII)V
    .locals 6

    .line 1
    iget-object v0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    iget-object v1, p0, La/eu5;->J1:[F

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    aput v3, v1, v2

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    aput v3, v1, v4

    .line 11
    .line 12
    iget-boolean v3, p0, La/eu5;->u1:Z

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    iget-object v3, v0, La/xju0;->b:Landroid/graphics/RectF;

    .line 17
    .line 18
    iget v5, v3, Landroid/graphics/RectF;->left:F

    .line 19
    .line 20
    aput v5, v1, v4

    .line 21
    .line 22
    iget v3, v3, Landroid/graphics/RectF;->top:F

    .line 23
    .line 24
    aput v3, v1, v2

    .line 25
    .line 26
    iget-object v3, p0, La/eu5;->z1:La/ywq0;

    .line 27
    .line 28
    invoke-virtual {v3, v1}, La/ywq0;->w([F)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, La/kwb;->onSizeChanged(IIII)V

    .line 32
    .line 33
    .line 34
    iget-boolean p1, p0, La/eu5;->u1:Z

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, La/eu5;->z1:La/ywq0;

    .line 39
    .line 40
    invoke-virtual {p1, v1}, La/ywq0;->x([F)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p0, v1}, La/xju0;->a(Landroid/view/View;[F)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    iget-object p1, v0, La/xju0;->a:Landroid/graphics/Matrix;

    .line 48
    .line 49
    invoke-virtual {v0, p1, p0, v2}, La/xju0;->e(Landroid/graphics/Matrix;Landroid/view/View;Z)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/kwb;->m:La/ywb;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    iget-object v2, p0, La/kwb;->b:La/mwb;

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-boolean v2, p0, La/kwb;->j:Z

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    .line 18
    return v1

    .line 19
    :cond_1
    check-cast v0, La/fu5;

    .line 20
    .line 21
    invoke-virtual {v0, p0, p1}, La/fu5;->onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_2
    :goto_0
    return v1
.end method

.method public setAutoScaleMinMaxEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->g1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setBorderColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setBorderWidth(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->p1:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-static {p1}, La/dut0;->c(F)F

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public setClipValuesToContent(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->s1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDoubleTapToZoomEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->i1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDragEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->k1:Z

    .line 2
    .line 3
    iput-boolean p1, p0, La/eu5;->l1:Z

    .line 4
    .line 5
    return-void
.end method

.method public setDragOffsetX(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/dut0;->c(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, La/xju0;->j:F

    .line 11
    .line 12
    return-void
.end method

.method public setDragOffsetY(F)V
    .locals 0

    .line 1
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, La/dut0;->c(F)F

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    iput p1, p0, La/xju0;->k:F

    .line 11
    .line 12
    return-void
.end method

.method public setDragXEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->k1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDragYEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->l1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawBorders(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->r1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setDrawGridBackground(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->q1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setGridBackgroundColor(I)V
    .locals 0

    .line 1
    iget-object p0, p0, La/eu5;->o1:Landroid/graphics/Paint;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setHighlightPerDragEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->j1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setKeepPositionOnRotation(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->u1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setMaxVisibleValueCount(I)V
    .locals 0

    .line 1
    iput p1, p0, La/eu5;->f1:I

    .line 2
    .line 3
    return-void
.end method

.method public setMinOffset(F)V
    .locals 0

    .line 1
    iput p1, p0, La/eu5;->t1:F

    .line 2
    .line 3
    return-void
.end method

.method public setOnDrawListener(La/ch60;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setPinchZoom(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->h1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRendererLeftYAxis(La/b2w0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/eu5;->x1:La/b2w0;

    .line 2
    .line 3
    return-void
.end method

.method public setRendererRightYAxis(La/b2w0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/eu5;->y1:La/b2w0;

    .line 2
    .line 3
    return-void
.end method

.method public setScaleEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->m1:Z

    .line 2
    .line 3
    iput-boolean p1, p0, La/eu5;->n1:Z

    .line 4
    .line 5
    return-void
.end method

.method public setScaleXEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->m1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setScaleYEnabled(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, La/eu5;->n1:Z

    .line 2
    .line 3
    return-void
.end method

.method public setVisibleXRangeMaximum(F)V
    .locals 2

    .line 1
    iget-object v0, p0, La/kwb;->i:La/urv0;

    .line 2
    .line 3
    iget v0, v0, La/wa5;->u:F

    .line 4
    .line 5
    div-float/2addr v0, p1

    .line 6
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/high16 p1, 0x3f800000    # 1.0f

    .line 12
    .line 13
    cmpg-float v1, v0, p1

    .line 14
    .line 15
    if-gez v1, :cond_0

    .line 16
    .line 17
    move v0, p1

    .line 18
    :cond_0
    iput v0, p0, La/xju0;->e:F

    .line 19
    .line 20
    iget-object p1, p0, La/xju0;->a:Landroid/graphics/Matrix;

    .line 21
    .line 22
    iget-object v0, p0, La/xju0;->b:Landroid/graphics/RectF;

    .line 23
    .line 24
    invoke-virtual {p0, p1, v0}, La/xju0;->d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public setVisibleXRangeMinimum(F)V
    .locals 1

    .line 1
    iget-object v0, p0, La/kwb;->i:La/urv0;

    .line 2
    .line 3
    iget v0, v0, La/wa5;->u:F

    .line 4
    .line 5
    div-float/2addr v0, p1

    .line 6
    iget-object p0, p0, La/kwb;->r:La/xju0;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    cmpl-float p1, v0, p1

    .line 13
    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 17
    .line 18
    .line 19
    :cond_0
    iput v0, p0, La/xju0;->f:F

    .line 20
    .line 21
    iget-object p1, p0, La/xju0;->a:Landroid/graphics/Matrix;

    .line 22
    .line 23
    iget-object v0, p0, La/xju0;->b:Landroid/graphics/RectF;

    .line 24
    .line 25
    invoke-virtual {p0, p1, v0}, La/xju0;->d(Landroid/graphics/Matrix;Landroid/graphics/RectF;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public setXAxisRenderer(La/vrv0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/eu5;->B1:La/vrv0;

    .line 2
    .line 3
    return-void
.end method
