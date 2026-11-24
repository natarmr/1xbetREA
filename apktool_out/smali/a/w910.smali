.class public final La/w910;
.super La/guy;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Landroid/graphics/Rect;

.field public final synthetic b:La/qge;

.field public final synthetic c:Landroid/graphics/Matrix;

.field public final synthetic d:La/bb10;

.field public final synthetic e:La/fa10;

.field public final synthetic f:Landroid/content/Context;

.field public final synthetic g:Lkotlin/jvm/functions/Function0;

.field public final synthetic h:La/pz40;


# direct methods
.method public constructor <init>(Landroid/graphics/Rect;La/qge;Landroid/graphics/Matrix;La/bb10;La/fa10;Landroid/content/Context;Lkotlin/jvm/functions/Function0;La/pz40;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/w910;->a:Landroid/graphics/Rect;

    .line 2
    .line 3
    iput-object p2, p0, La/w910;->b:La/qge;

    .line 4
    .line 5
    iput-object p3, p0, La/w910;->c:Landroid/graphics/Matrix;

    .line 6
    .line 7
    iput-object p4, p0, La/w910;->d:La/bb10;

    .line 8
    .line 9
    iput-object p5, p0, La/w910;->e:La/fa10;

    .line 10
    .line 11
    iput-object p6, p0, La/w910;->f:Landroid/content/Context;

    .line 12
    .line 13
    iput-object p7, p0, La/w910;->g:Lkotlin/jvm/functions/Function0;

    .line 14
    .line 15
    iput-object p8, p0, La/w910;->h:La/pz40;

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    invoke-direct {p0, p1}, La/guy;-><init>(I)V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    check-cast v1, La/fhl;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1}, La/fhl;->A0()La/nr;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, La/nr;->i()La/x5a;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, p0, La/w910;->a:Landroid/graphics/Rect;

    .line 17
    .line 18
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    int-to-float v4, v4

    .line 23
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 24
    .line 25
    .line 26
    move-result v5

    .line 27
    int-to-float v5, v5

    .line 28
    invoke-static {v4, v5}, La/p7x;->n(FF)J

    .line 29
    .line 30
    .line 31
    move-result-wide v4

    .line 32
    invoke-interface {v1}, La/fhl;->d()J

    .line 33
    .line 34
    .line 35
    move-result-wide v6

    .line 36
    invoke-static {v6, v7}, La/h7k0;->e(J)F

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    invoke-static {v6}, La/si30;->b(F)I

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    invoke-interface {v1}, La/fhl;->d()J

    .line 45
    .line 46
    .line 47
    move-result-wide v7

    .line 48
    invoke-static {v7, v8}, La/h7k0;->c(J)F

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    invoke-static {v7}, La/si30;->b(F)I

    .line 53
    .line 54
    .line 55
    move-result v7

    .line 56
    invoke-static {v6, v7}, La/n2x;->b(II)J

    .line 57
    .line 58
    .line 59
    move-result-wide v6

    .line 60
    invoke-interface {v1}, La/fhl;->d()J

    .line 61
    .line 62
    .line 63
    move-result-wide v8

    .line 64
    iget-object v10, p0, La/w910;->b:La/qge;

    .line 65
    .line 66
    invoke-interface {v10, v4, v5, v8, v9}, La/qge;->a(JJ)J

    .line 67
    .line 68
    .line 69
    move-result-wide v8

    .line 70
    invoke-static {v4, v5}, La/h7k0;->e(J)F

    .line 71
    .line 72
    .line 73
    move-result v10

    .line 74
    sget v11, La/l1h0;->a:I

    .line 75
    .line 76
    const/16 v11, 0x20

    .line 77
    .line 78
    shr-long v12, v8, v11

    .line 79
    .line 80
    long-to-int v12, v12

    .line 81
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 82
    .line 83
    .line 84
    move-result v13

    .line 85
    mul-float/2addr v13, v10

    .line 86
    float-to-int v10, v13

    .line 87
    invoke-static {v4, v5}, La/h7k0;->c(J)F

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    const-wide v13, 0xffffffffL

    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    and-long/2addr v8, v13

    .line 97
    long-to-int v5, v8

    .line 98
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 99
    .line 100
    .line 101
    move-result v8

    .line 102
    mul-float/2addr v8, v4

    .line 103
    float-to-int v4, v8

    .line 104
    invoke-static {v10, v4}, La/n2x;->b(II)J

    .line 105
    .line 106
    .line 107
    move-result-wide v8

    .line 108
    invoke-interface {v1}, La/fhl;->getLayoutDirection()La/k6z;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    move/from16 p1, v11

    .line 113
    .line 114
    move v4, v12

    .line 115
    shr-long v11, v6, p1

    .line 116
    .line 117
    long-to-int v10, v11

    .line 118
    shr-long v11, v8, p1

    .line 119
    .line 120
    long-to-int v11, v11

    .line 121
    sub-int/2addr v10, v11

    .line 122
    int-to-float v10, v10

    .line 123
    const/high16 v11, 0x40000000    # 2.0f

    .line 124
    .line 125
    div-float/2addr v10, v11

    .line 126
    and-long/2addr v6, v13

    .line 127
    long-to-int v6, v6

    .line 128
    and-long v7, v8, v13

    .line 129
    .line 130
    long-to-int v7, v7

    .line 131
    sub-int/2addr v6, v7

    .line 132
    int-to-float v6, v6

    .line 133
    div-float/2addr v6, v11

    .line 134
    sget-object v7, La/k6z;->a:La/k6z;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    if-ne v1, v7, :cond_0

    .line 138
    .line 139
    move v1, v8

    .line 140
    goto :goto_0

    .line 141
    :cond_0
    const/high16 v1, -0x40800000    # -1.0f

    .line 142
    .line 143
    mul-float/2addr v1, v8

    .line 144
    :goto_0
    const/high16 v7, 0x3f800000    # 1.0f

    .line 145
    .line 146
    add-float/2addr v1, v7

    .line 147
    mul-float/2addr v1, v10

    .line 148
    add-float/2addr v7, v8

    .line 149
    mul-float/2addr v7, v6

    .line 150
    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    .line 151
    .line 152
    .line 153
    move-result v1

    .line 154
    invoke-static {v7}, Ljava/lang/Math;->round(F)I

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    int-to-long v7, v1

    .line 159
    shl-long v7, v7, p1

    .line 160
    .line 161
    int-to-long v9, v6

    .line 162
    and-long/2addr v9, v13

    .line 163
    or-long v6, v7, v9

    .line 164
    .line 165
    iget-object v1, p0, La/w910;->c:Landroid/graphics/Matrix;

    .line 166
    .line 167
    invoke-virtual {v1}, Landroid/graphics/Matrix;->reset()V

    .line 168
    .line 169
    .line 170
    shr-long v8, v6, p1

    .line 171
    .line 172
    long-to-int v8, v8

    .line 173
    int-to-float v8, v8

    .line 174
    and-long/2addr v6, v13

    .line 175
    long-to-int v6, v6

    .line 176
    int-to-float v6, v6

    .line 177
    invoke-virtual {v1, v8, v6}, Landroid/graphics/Matrix;->preTranslate(FF)Z

    .line 178
    .line 179
    .line 180
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 181
    .line 182
    .line 183
    move-result v4

    .line 184
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 185
    .line 186
    .line 187
    move-result v5

    .line 188
    invoke-virtual {v1, v4, v5}, Landroid/graphics/Matrix;->preScale(FF)Z

    .line 189
    .line 190
    .line 191
    iget-object v4, p0, La/w910;->d:La/bb10;

    .line 192
    .line 193
    iget-object v5, v4, La/bb10;->l:La/bzu;

    .line 194
    .line 195
    iget-object v5, v5, La/bzu;->b:Ljava/lang/Object;

    .line 196
    .line 197
    check-cast v5, Ljava/util/HashSet;

    .line 198
    .line 199
    sget-object v6, La/fb10;->a:La/fb10;

    .line 200
    .line 201
    invoke-virtual {v5, v6}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v5

    .line 205
    iget-object v6, v4, La/bb10;->a:La/fa10;

    .line 206
    .line 207
    if-eqz v6, :cond_1

    .line 208
    .line 209
    if-eqz v5, :cond_1

    .line 210
    .line 211
    invoke-virtual {v4}, La/bb10;->c()V

    .line 212
    .line 213
    .line 214
    :cond_1
    const/4 v5, 0x0

    .line 215
    iput-boolean v5, v4, La/bb10;->e:Z

    .line 216
    .line 217
    sget-object v6, La/ijf0;->a:La/ijf0;

    .line 218
    .line 219
    iput-object v6, v4, La/bb10;->v:La/ijf0;

    .line 220
    .line 221
    invoke-virtual {v4}, La/bb10;->e()V

    .line 222
    .line 223
    .line 224
    sget-object v6, La/m04;->a:La/m04;

    .line 225
    .line 226
    iput-object v6, v4, La/bb10;->m1:La/m04;

    .line 227
    .line 228
    iget-object v7, p0, La/w910;->e:La/fa10;

    .line 229
    .line 230
    invoke-virtual {v4, v7}, La/bb10;->o(La/fa10;)Z

    .line 231
    .line 232
    .line 233
    iget-object v7, v4, La/bb10;->j:Ljava/util/Map;

    .line 234
    .line 235
    const/4 v8, 0x0

    .line 236
    if-nez v7, :cond_2

    .line 237
    .line 238
    goto :goto_1

    .line 239
    :cond_2
    iput-object v8, v4, La/bb10;->j:Ljava/util/Map;

    .line 240
    .line 241
    invoke-virtual {v4}, La/bb10;->invalidateSelf()V

    .line 242
    .line 243
    .line 244
    :goto_1
    iget-object v7, p0, La/w910;->h:La/pz40;

    .line 245
    .line 246
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    if-nez v7, :cond_14

    .line 251
    .line 252
    iget-boolean v7, v4, La/bb10;->r:Z

    .line 253
    .line 254
    if-nez v7, :cond_3

    .line 255
    .line 256
    goto :goto_2

    .line 257
    :cond_3
    iput-boolean v5, v4, La/bb10;->r:Z

    .line 258
    .line 259
    iget-object v7, v4, La/bb10;->o:La/uld;

    .line 260
    .line 261
    if-eqz v7, :cond_4

    .line 262
    .line 263
    invoke-virtual {v7, v5}, La/uld;->q(Z)V

    .line 264
    .line 265
    .line 266
    :cond_4
    :goto_2
    iput-boolean v5, v4, La/bb10;->s:Z

    .line 267
    .line 268
    const/4 v7, 0x1

    .line 269
    iput-boolean v7, v4, La/bb10;->t:Z

    .line 270
    .line 271
    iput-boolean v5, v4, La/bb10;->m:Z

    .line 272
    .line 273
    iget-boolean v9, v4, La/bb10;->n:Z

    .line 274
    .line 275
    if-eq v7, v9, :cond_6

    .line 276
    .line 277
    iput-boolean v7, v4, La/bb10;->n:Z

    .line 278
    .line 279
    iget-object v9, v4, La/bb10;->o:La/uld;

    .line 280
    .line 281
    if-eqz v9, :cond_5

    .line 282
    .line 283
    iput-boolean v7, v9, La/uld;->L:Z

    .line 284
    .line 285
    :cond_5
    invoke-virtual {v4}, La/bb10;->invalidateSelf()V

    .line 286
    .line 287
    .line 288
    :cond_6
    iget-boolean v9, v4, La/bb10;->u:Z

    .line 289
    .line 290
    if-eqz v9, :cond_7

    .line 291
    .line 292
    iput-boolean v5, v4, La/bb10;->u:Z

    .line 293
    .line 294
    invoke-virtual {v4}, La/bb10;->invalidateSelf()V

    .line 295
    .line 296
    .line 297
    :cond_7
    sget-object v9, La/bb10;->u1:Ljava/util/List;

    .line 298
    .line 299
    invoke-interface {v9}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 300
    .line 301
    .line 302
    move-result-object v9

    .line 303
    move-object v10, v8

    .line 304
    :cond_8
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 305
    .line 306
    .line 307
    move-result v11

    .line 308
    if-eqz v11, :cond_9

    .line 309
    .line 310
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object v10

    .line 314
    check-cast v10, Ljava/lang/String;

    .line 315
    .line 316
    iget-object v11, v4, La/bb10;->a:La/fa10;

    .line 317
    .line 318
    invoke-virtual {v11, v10}, La/fa10;->d(Ljava/lang/String;)La/gr20;

    .line 319
    .line 320
    .line 321
    move-result-object v10

    .line 322
    if-eqz v10, :cond_8

    .line 323
    .line 324
    :cond_9
    iget-object v9, p0, La/w910;->f:Landroid/content/Context;

    .line 325
    .line 326
    invoke-virtual {v4, v9}, La/bb10;->b(Landroid/content/Context;)Z

    .line 327
    .line 328
    .line 329
    move-result v9

    .line 330
    if-nez v9, :cond_a

    .line 331
    .line 332
    if-eqz v10, :cond_a

    .line 333
    .line 334
    iget v0, v10, La/gr20;->b:F

    .line 335
    .line 336
    invoke-virtual {v4, v0}, La/bb10;->v(F)V

    .line 337
    .line 338
    .line 339
    goto :goto_3

    .line 340
    :cond_a
    iget-object v0, p0, La/w910;->g:Lkotlin/jvm/functions/Function0;

    .line 341
    .line 342
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v0

    .line 346
    check-cast v0, Ljava/lang/Number;

    .line 347
    .line 348
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 349
    .line 350
    .line 351
    move-result v0

    .line 352
    invoke-virtual {v4, v0}, La/bb10;->v(F)V

    .line 353
    .line 354
    .line 355
    :goto_3
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 356
    .line 357
    .line 358
    move-result v0

    .line 359
    invoke-virtual {v3}, Landroid/graphics/Rect;->height()I

    .line 360
    .line 361
    .line 362
    move-result v3

    .line 363
    invoke-virtual {v4, v5, v5, v0, v3}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 364
    .line 365
    .line 366
    invoke-static {v2}, La/vw2;->b(La/x5a;)Landroid/graphics/Canvas;

    .line 367
    .line 368
    .line 369
    move-result-object v0

    .line 370
    iget-object v2, v4, La/bb10;->q1:La/ya10;

    .line 371
    .line 372
    sget-object v3, La/bb10;->v1:Ljava/util/concurrent/ThreadPoolExecutor;

    .line 373
    .line 374
    iget-object v9, v4, La/bb10;->b:La/ub10;

    .line 375
    .line 376
    iget-object v10, v4, La/bb10;->n1:Ljava/util/concurrent/Semaphore;

    .line 377
    .line 378
    iget-object v11, v4, La/bb10;->o:La/uld;

    .line 379
    .line 380
    iget-object v12, v4, La/bb10;->a:La/fa10;

    .line 381
    .line 382
    if-eqz v11, :cond_13

    .line 383
    .line 384
    if-nez v12, :cond_b

    .line 385
    .line 386
    goto/16 :goto_9

    .line 387
    .line 388
    :cond_b
    iget-object v12, v4, La/bb10;->m1:La/m04;

    .line 389
    .line 390
    if-eqz v12, :cond_c

    .line 391
    .line 392
    move-object v6, v12

    .line 393
    :cond_c
    sget-object v12, La/m04;->b:La/m04;

    .line 394
    .line 395
    if-ne v6, v12, :cond_d

    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_d
    move v7, v5

    .line 399
    :goto_4
    if-eqz v7, :cond_e

    .line 400
    .line 401
    :try_start_0
    invoke-virtual {v10}, Ljava/util/concurrent/Semaphore;->acquire()V

    .line 402
    .line 403
    .line 404
    invoke-virtual {v4}, La/bb10;->w()Z

    .line 405
    .line 406
    .line 407
    move-result v6

    .line 408
    if-eqz v6, :cond_e

    .line 409
    .line 410
    invoke-virtual {v9}, La/ub10;->a()F

    .line 411
    .line 412
    .line 413
    move-result v6

    .line 414
    invoke-virtual {v4, v6}, La/bb10;->v(F)V

    .line 415
    .line 416
    .line 417
    goto :goto_5

    .line 418
    :catchall_0
    move-exception v0

    .line 419
    goto :goto_8

    .line 420
    :cond_e
    :goto_5
    iget-boolean v6, v4, La/bb10;->e:Z
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 421
    .line 422
    iget v12, v4, La/bb10;->p:I

    .line 423
    .line 424
    iget-boolean v13, v4, La/bb10;->w:Z

    .line 425
    .line 426
    if-eqz v6, :cond_10

    .line 427
    .line 428
    if-eqz v13, :cond_f

    .line 429
    .line 430
    :try_start_1
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 431
    .line 432
    .line 433
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v4, v0, v11}, La/bb10;->m(Landroid/graphics/Canvas;La/uld;)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 440
    .line 441
    .line 442
    goto :goto_6

    .line 443
    :cond_f
    invoke-virtual {v11, v0, v1, v12, v8}, La/tz5;->h(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILa/kil;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 444
    .line 445
    .line 446
    goto :goto_6

    .line 447
    :catchall_1
    :try_start_2
    sget-object v0, La/xv00;->a:La/tv00;

    .line 448
    .line 449
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_10
    if-eqz v13, :cond_11

    .line 454
    .line 455
    invoke-virtual {v0}, Landroid/graphics/Canvas;->save()I

    .line 456
    .line 457
    .line 458
    invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->concat(Landroid/graphics/Matrix;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v4, v0, v11}, La/bb10;->m(Landroid/graphics/Canvas;La/uld;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0}, Landroid/graphics/Canvas;->restore()V

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_11
    invoke-virtual {v11, v0, v1, v12, v8}, La/tz5;->h(Landroid/graphics/Canvas;Landroid/graphics/Matrix;ILa/kil;)V

    .line 469
    .line 470
    .line 471
    :goto_6
    iput-boolean v5, v4, La/bb10;->l1:Z
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 472
    .line 473
    if-eqz v7, :cond_13

    .line 474
    .line 475
    invoke-virtual {v10}, Ljava/util/concurrent/Semaphore;->release()V

    .line 476
    .line 477
    .line 478
    iget v0, v11, La/uld;->K:F

    .line 479
    .line 480
    invoke-virtual {v9}, La/ub10;->a()F

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    cmpl-float v0, v0, v1

    .line 485
    .line 486
    if-eqz v0, :cond_13

    .line 487
    .line 488
    :goto_7
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 489
    .line 490
    .line 491
    goto :goto_9

    .line 492
    :goto_8
    if-eqz v7, :cond_12

    .line 493
    .line 494
    invoke-virtual {v10}, Ljava/util/concurrent/Semaphore;->release()V

    .line 495
    .line 496
    .line 497
    iget v1, v11, La/uld;->K:F

    .line 498
    .line 499
    invoke-virtual {v9}, La/ub10;->a()F

    .line 500
    .line 501
    .line 502
    move-result v4

    .line 503
    cmpl-float v1, v1, v4

    .line 504
    .line 505
    if-eqz v1, :cond_12

    .line 506
    .line 507
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 508
    .line 509
    .line 510
    :cond_12
    throw v0

    .line 511
    :catch_0
    if-eqz v7, :cond_13

    .line 512
    .line 513
    invoke-virtual {v10}, Ljava/util/concurrent/Semaphore;->release()V

    .line 514
    .line 515
    .line 516
    iget v0, v11, La/uld;->K:F

    .line 517
    .line 518
    invoke-virtual {v9}, La/ub10;->a()F

    .line 519
    .line 520
    .line 521
    move-result v1

    .line 522
    cmpl-float v0, v0, v1

    .line 523
    .line 524
    if-eqz v0, :cond_13

    .line 525
    .line 526
    goto :goto_7

    .line 527
    :cond_13
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 528
    .line 529
    return-object v0

    .line 530
    :cond_14
    invoke-static {}, La/hny;->b()V

    .line 531
    .line 532
    .line 533
    return-object v8
.end method
