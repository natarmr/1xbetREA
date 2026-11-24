.class public final La/y3u0;
.super La/hwt0;
.source "SourceFile"


# instance fields
.field public final b:La/wgv;

.field public c:Ljava/lang/String;

.field public d:Z

.field public final e:La/bhl;

.field public f:Lkotlin/jvm/functions/Function0;

.field public final g:La/pz40;

.field public h:La/m78;

.field public final i:La/pz40;

.field public j:J

.field public k:F

.field public l:F

.field public final m:La/x3u0;


# direct methods
.method public constructor <init>(La/wgv;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/y3u0;->b:La/wgv;

    .line 5
    .line 6
    new-instance v0, La/x3u0;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-direct {v0, p0, v1}, La/x3u0;-><init>(La/y3u0;B)V

    .line 10
    .line 11
    .line 12
    iput-object v0, p1, La/wgv;->i:Lkotlin/jvm/functions/Function1;

    .line 13
    .line 14
    const-string p1, ""

    .line 15
    .line 16
    iput-object p1, p0, La/y3u0;->c:Ljava/lang/String;

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    iput-boolean p1, p0, La/y3u0;->d:Z

    .line 20
    .line 21
    new-instance v0, La/bhl;

    .line 22
    .line 23
    invoke-direct {v0}, La/bhl;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, La/y3u0;->e:La/bhl;

    .line 27
    .line 28
    new-instance v0, La/o1u0;

    .line 29
    .line 30
    const/4 v1, 0x7

    .line 31
    invoke-direct {v0, v1}, La/o1u0;-><init>(B)V

    .line 32
    .line 33
    .line 34
    iput-object v0, p0, La/y3u0;->f:Lkotlin/jvm/functions/Function0;

    .line 35
    .line 36
    const/4 v0, 0x0

    .line 37
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iput-object v0, p0, La/y3u0;->g:La/pz40;

    .line 42
    .line 43
    new-instance v0, La/h7k0;

    .line 44
    .line 45
    const-wide/16 v1, 0x0

    .line 46
    .line 47
    invoke-direct {v0, v1, v2}, La/h7k0;-><init>(J)V

    .line 48
    .line 49
    .line 50
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iput-object v0, p0, La/y3u0;->i:La/pz40;

    .line 55
    .line 56
    const-wide v0, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    iput-wide v0, p0, La/y3u0;->j:J

    .line 62
    .line 63
    const/high16 v0, 0x3f800000    # 1.0f

    .line 64
    .line 65
    iput v0, p0, La/y3u0;->k:F

    .line 66
    .line 67
    iput v0, p0, La/y3u0;->l:F

    .line 68
    .line 69
    new-instance v0, La/x3u0;

    .line 70
    .line 71
    invoke-direct {v0, p0, p1}, La/x3u0;-><init>(La/y3u0;B)V

    .line 72
    .line 73
    .line 74
    iput-object v0, p0, La/y3u0;->m:La/x3u0;

    .line 75
    .line 76
    return-void
.end method


# virtual methods
.method public final a(La/fhl;)V
    .locals 2

    .line 1
    const/high16 v0, 0x3f800000    # 1.0f

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-virtual {p0, p1, v0, v1}, La/y3u0;->e(La/fhl;FLa/a4d;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final e(La/fhl;FLa/a4d;)V
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    iget-object v2, v0, La/y3u0;->b:La/wgv;

    .line 6
    .line 7
    iget-boolean v3, v2, La/wgv;->d:Z

    .line 8
    .line 9
    const/4 v4, 0x5

    .line 10
    iget-object v5, v0, La/y3u0;->g:La/pz40;

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    if-eqz v3, :cond_4

    .line 14
    .line 15
    iget-wide v8, v2, La/wgv;->e:J

    .line 16
    .line 17
    const-wide/16 v10, 0x10

    .line 18
    .line 19
    cmp-long v3, v8, v10

    .line 20
    .line 21
    if-eqz v3, :cond_4

    .line 22
    .line 23
    move-object v3, v5

    .line 24
    check-cast v3, La/hgk0;

    .line 25
    .line 26
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v3

    .line 30
    check-cast v3, La/a4d;

    .line 31
    .line 32
    sget-object v8, La/q4u0;->a:La/iun;

    .line 33
    .line 34
    instance-of v8, v3, La/m78;

    .line 35
    .line 36
    const/4 v9, 0x3

    .line 37
    if-eqz v8, :cond_1

    .line 38
    .line 39
    check-cast v3, La/m78;

    .line 40
    .line 41
    iget v3, v3, La/m78;->c:I

    .line 42
    .line 43
    if-ne v3, v4, :cond_0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    if-ne v3, v9, :cond_4

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    if-nez v3, :cond_4

    .line 50
    .line 51
    :goto_0
    instance-of v3, v1, La/m78;

    .line 52
    .line 53
    if-eqz v3, :cond_3

    .line 54
    .line 55
    move-object v3, v1

    .line 56
    check-cast v3, La/m78;

    .line 57
    .line 58
    iget v3, v3, La/m78;->c:I

    .line 59
    .line 60
    if-ne v3, v4, :cond_2

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_2
    if-ne v3, v9, :cond_4

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_3
    if-nez v1, :cond_4

    .line 67
    .line 68
    :goto_1
    move v3, v6

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    const/4 v3, 0x0

    .line 71
    :goto_2
    iget-boolean v8, v0, La/y3u0;->d:Z

    .line 72
    .line 73
    iget-object v9, v0, La/y3u0;->e:La/bhl;

    .line 74
    .line 75
    if-nez v8, :cond_6

    .line 76
    .line 77
    iget-wide v10, v0, La/y3u0;->j:J

    .line 78
    .line 79
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 80
    .line 81
    .line 82
    move-result-wide v12

    .line 83
    invoke-static {v10, v11, v12, v13}, La/h7k0;->b(JJ)Z

    .line 84
    .line 85
    .line 86
    move-result v8

    .line 87
    if-eqz v8, :cond_6

    .line 88
    .line 89
    iget-object v8, v9, La/bhl;->a:La/vz2;

    .line 90
    .line 91
    if-eqz v8, :cond_5

    .line 92
    .line 93
    invoke-virtual {v8}, La/vz2;->a()I

    .line 94
    .line 95
    .line 96
    move-result v8

    .line 97
    goto :goto_3

    .line 98
    :cond_5
    const/4 v8, 0x0

    .line 99
    :goto_3
    if-ne v3, v8, :cond_6

    .line 100
    .line 101
    goto/16 :goto_7

    .line 102
    .line 103
    :cond_6
    if-ne v3, v6, :cond_8

    .line 104
    .line 105
    iget-wide v10, v2, La/wgv;->e:J

    .line 106
    .line 107
    sget-object v2, La/q4u0;->a:La/iun;

    .line 108
    .line 109
    invoke-static {v10, v11}, La/y3d;->d(J)F

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    const/high16 v6, 0x3f800000    # 1.0f

    .line 114
    .line 115
    cmpg-float v2, v2, v6

    .line 116
    .line 117
    if-nez v2, :cond_7

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_7
    invoke-static {v6, v10, v11}, La/y3d;->c(FJ)J

    .line 121
    .line 122
    .line 123
    move-result-wide v10

    .line 124
    :goto_4
    new-instance v2, La/m78;

    .line 125
    .line 126
    invoke-direct {v2, v10, v11, v4}, La/m78;-><init>(JI)V

    .line 127
    .line 128
    .line 129
    goto :goto_5

    .line 130
    :cond_8
    const/4 v2, 0x0

    .line 131
    :goto_5
    iput-object v2, v0, La/y3u0;->h:La/m78;

    .line 132
    .line 133
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 134
    .line 135
    .line 136
    move-result-wide v10

    .line 137
    const/16 v2, 0x20

    .line 138
    .line 139
    shr-long/2addr v10, v2

    .line 140
    long-to-int v4, v10

    .line 141
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 142
    .line 143
    .line 144
    move-result v4

    .line 145
    iget-object v6, v0, La/y3u0;->i:La/pz40;

    .line 146
    .line 147
    move-object v8, v6

    .line 148
    check-cast v8, La/hgk0;

    .line 149
    .line 150
    invoke-virtual {v8}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v8

    .line 154
    check-cast v8, La/h7k0;

    .line 155
    .line 156
    iget-wide v10, v8, La/h7k0;->a:J

    .line 157
    .line 158
    shr-long/2addr v10, v2

    .line 159
    long-to-int v8, v10

    .line 160
    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 161
    .line 162
    .line 163
    move-result v8

    .line 164
    div-float/2addr v4, v8

    .line 165
    iput v4, v0, La/y3u0;->k:F

    .line 166
    .line 167
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 168
    .line 169
    .line 170
    move-result-wide v10

    .line 171
    const-wide v12, 0xffffffffL

    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    and-long/2addr v10, v12

    .line 177
    long-to-int v4, v10

    .line 178
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 179
    .line 180
    .line 181
    move-result v4

    .line 182
    check-cast v6, La/hgk0;

    .line 183
    .line 184
    invoke-virtual {v6}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 185
    .line 186
    .line 187
    move-result-object v6

    .line 188
    check-cast v6, La/h7k0;

    .line 189
    .line 190
    iget-wide v10, v6, La/h7k0;->a:J

    .line 191
    .line 192
    and-long/2addr v10, v12

    .line 193
    long-to-int v6, v10

    .line 194
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 195
    .line 196
    .line 197
    move-result v6

    .line 198
    div-float/2addr v4, v6

    .line 199
    iput v4, v0, La/y3u0;->l:F

    .line 200
    .line 201
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 202
    .line 203
    .line 204
    move-result-wide v10

    .line 205
    shr-long/2addr v10, v2

    .line 206
    long-to-int v4, v10

    .line 207
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 208
    .line 209
    .line 210
    move-result v4

    .line 211
    float-to-double v10, v4

    .line 212
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 213
    .line 214
    .line 215
    move-result-wide v10

    .line 216
    double-to-float v4, v10

    .line 217
    float-to-int v4, v4

    .line 218
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 219
    .line 220
    .line 221
    move-result-wide v10

    .line 222
    and-long/2addr v10, v12

    .line 223
    long-to-int v6, v10

    .line 224
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    float-to-double v10, v6

    .line 229
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 230
    .line 231
    .line 232
    move-result-wide v10

    .line 233
    double-to-float v6, v10

    .line 234
    float-to-int v6, v6

    .line 235
    int-to-long v10, v4

    .line 236
    shl-long/2addr v10, v2

    .line 237
    int-to-long v14, v6

    .line 238
    and-long/2addr v14, v12

    .line 239
    or-long/2addr v10, v14

    .line 240
    invoke-interface/range {p1 .. p1}, La/fhl;->getLayoutDirection()La/k6z;

    .line 241
    .line 242
    .line 243
    move-result-object v4

    .line 244
    iget-object v6, v9, La/bhl;->a:La/vz2;

    .line 245
    .line 246
    iget-object v8, v9, La/bhl;->b:La/uw2;

    .line 247
    .line 248
    if-eqz v6, :cond_9

    .line 249
    .line 250
    if-eqz v8, :cond_9

    .line 251
    .line 252
    shr-long v14, v10, v2

    .line 253
    .line 254
    long-to-int v14, v14

    .line 255
    iget-object v15, v6, La/vz2;->a:Landroid/graphics/Bitmap;

    .line 256
    .line 257
    move/from16 v16, v2

    .line 258
    .line 259
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getWidth()I

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    move-wide/from16 v17, v12

    .line 264
    .line 265
    if-gt v14, v2, :cond_a

    .line 266
    .line 267
    and-long v12, v10, v17

    .line 268
    .line 269
    long-to-int v2, v12

    .line 270
    invoke-virtual {v15}, Landroid/graphics/Bitmap;->getHeight()I

    .line 271
    .line 272
    .line 273
    move-result v12

    .line 274
    if-gt v2, v12, :cond_a

    .line 275
    .line 276
    iget v2, v9, La/bhl;->d:I

    .line 277
    .line 278
    if-ne v2, v3, :cond_a

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_9
    move/from16 v16, v2

    .line 282
    .line 283
    move-wide/from16 v17, v12

    .line 284
    .line 285
    :cond_a
    shr-long v12, v10, v16

    .line 286
    .line 287
    long-to-int v2, v12

    .line 288
    and-long v12, v10, v17

    .line 289
    .line 290
    long-to-int v6, v12

    .line 291
    invoke-static {v2, v6, v3}, La/azw;->c(III)La/vz2;

    .line 292
    .line 293
    .line 294
    move-result-object v6

    .line 295
    invoke-static {v6}, La/vw2;->a(La/vz2;)La/uw2;

    .line 296
    .line 297
    .line 298
    move-result-object v8

    .line 299
    iput-object v6, v9, La/bhl;->a:La/vz2;

    .line 300
    .line 301
    iput-object v8, v9, La/bhl;->b:La/uw2;

    .line 302
    .line 303
    iput v3, v9, La/bhl;->d:I

    .line 304
    .line 305
    :goto_6
    iput-wide v10, v9, La/bhl;->c:J

    .line 306
    .line 307
    iget-object v12, v9, La/bhl;->e:La/a6a;

    .line 308
    .line 309
    iget-object v2, v12, La/a6a;->a:La/z5a;

    .line 310
    .line 311
    invoke-static {v10, v11}, La/n2x;->Q(J)J

    .line 312
    .line 313
    .line 314
    move-result-wide v10

    .line 315
    iget-object v3, v2, La/z5a;->a:La/w6k;

    .line 316
    .line 317
    iget-object v13, v2, La/z5a;->b:La/k6z;

    .line 318
    .line 319
    iget-object v14, v2, La/z5a;->c:La/x5a;

    .line 320
    .line 321
    move-object/from16 v24, v8

    .line 322
    .line 323
    iget-wide v7, v2, La/z5a;->d:J

    .line 324
    .line 325
    move-object/from16 v15, p1

    .line 326
    .line 327
    iput-object v15, v2, La/z5a;->a:La/w6k;

    .line 328
    .line 329
    iput-object v4, v2, La/z5a;->b:La/k6z;

    .line 330
    .line 331
    move-object/from16 v4, v24

    .line 332
    .line 333
    iput-object v4, v2, La/z5a;->c:La/x5a;

    .line 334
    .line 335
    iput-wide v10, v2, La/z5a;->d:J

    .line 336
    .line 337
    invoke-virtual {v4}, La/uw2;->l()V

    .line 338
    .line 339
    .line 340
    move-object v10, v13

    .line 341
    move-object v11, v14

    .line 342
    sget-wide v13, La/y3d;->b:J

    .line 343
    .line 344
    const/16 v22, 0x0

    .line 345
    .line 346
    const/16 v23, 0x3e

    .line 347
    .line 348
    const-wide/16 v15, 0x0

    .line 349
    .line 350
    const-wide/16 v17, 0x0

    .line 351
    .line 352
    const/16 v19, 0x0

    .line 353
    .line 354
    const/16 v20, 0x0

    .line 355
    .line 356
    const/16 v21, 0x0

    .line 357
    .line 358
    invoke-static/range {v12 .. v23}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 359
    .line 360
    .line 361
    iget-object v13, v0, La/y3u0;->m:La/x3u0;

    .line 362
    .line 363
    invoke-virtual {v13, v12}, La/x3u0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v4}, La/uw2;->i()V

    .line 367
    .line 368
    .line 369
    iput-object v3, v2, La/z5a;->a:La/w6k;

    .line 370
    .line 371
    iput-object v10, v2, La/z5a;->b:La/k6z;

    .line 372
    .line 373
    iput-object v11, v2, La/z5a;->c:La/x5a;

    .line 374
    .line 375
    iput-wide v7, v2, La/z5a;->d:J

    .line 376
    .line 377
    iget-object v2, v6, La/vz2;->a:Landroid/graphics/Bitmap;

    .line 378
    .line 379
    invoke-virtual {v2}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 380
    .line 381
    .line 382
    const/4 v2, 0x0

    .line 383
    iput-boolean v2, v0, La/y3u0;->d:Z

    .line 384
    .line 385
    invoke-interface/range {p1 .. p1}, La/fhl;->d()J

    .line 386
    .line 387
    .line 388
    move-result-wide v2

    .line 389
    iput-wide v2, v0, La/y3u0;->j:J

    .line 390
    .line 391
    :goto_7
    if-eqz v1, :cond_b

    .line 392
    .line 393
    move-object/from16 v32, v1

    .line 394
    .line 395
    goto :goto_9

    .line 396
    :cond_b
    move-object v1, v5

    .line 397
    check-cast v1, La/hgk0;

    .line 398
    .line 399
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, La/a4d;

    .line 404
    .line 405
    if-eqz v1, :cond_c

    .line 406
    .line 407
    check-cast v5, La/hgk0;

    .line 408
    .line 409
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v0

    .line 413
    check-cast v0, La/a4d;

    .line 414
    .line 415
    :goto_8
    move-object/from16 v32, v0

    .line 416
    .line 417
    goto :goto_9

    .line 418
    :cond_c
    iget-object v0, v0, La/y3u0;->h:La/m78;

    .line 419
    .line 420
    goto :goto_8

    .line 421
    :goto_9
    iget-object v0, v9, La/bhl;->a:La/vz2;

    .line 422
    .line 423
    if-eqz v0, :cond_d

    .line 424
    .line 425
    goto :goto_a

    .line 426
    :cond_d
    const-string v1, "drawCachedImage must be invoked first before attempting to draw the result into another destination"

    .line 427
    .line 428
    invoke-static {v1}, La/xcx;->b(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    :goto_a
    iget-wide v1, v9, La/bhl;->c:J

    .line 432
    .line 433
    const/16 v33, 0x0

    .line 434
    .line 435
    const/16 v34, 0x35a

    .line 436
    .line 437
    const-wide/16 v29, 0x0

    .line 438
    .line 439
    move-object/from16 v25, p1

    .line 440
    .line 441
    move/from16 v31, p2

    .line 442
    .line 443
    move-object/from16 v26, v0

    .line 444
    .line 445
    move-wide/from16 v27, v1

    .line 446
    .line 447
    invoke-static/range {v25 .. v34}, La/fhl;->b0(La/fhl;La/vz2;JJFLa/a4d;II)V

    .line 448
    .line 449
    .line 450
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "Params: \tname: "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/y3u0;->c:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, "\n\tviewportWidth: "

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/y3u0;->i:La/pz40;

    .line 19
    .line 20
    move-object v1, p0

    .line 21
    check-cast v1, La/hgk0;

    .line 22
    .line 23
    invoke-virtual {v1}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    check-cast v1, La/h7k0;

    .line 28
    .line 29
    iget-wide v1, v1, La/h7k0;->a:J

    .line 30
    .line 31
    const/16 v3, 0x20

    .line 32
    .line 33
    shr-long/2addr v1, v3

    .line 34
    long-to-int v1, v1

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string v1, "\n\tviewportHeight: "

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    check-cast p0, La/hgk0;

    .line 48
    .line 49
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    check-cast p0, La/h7k0;

    .line 54
    .line 55
    iget-wide v1, p0, La/h7k0;->a:J

    .line 56
    .line 57
    const-wide v3, 0xffffffffL

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    and-long/2addr v1, v3

    .line 63
    long-to-int p0, v1

    .line 64
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, "\n"

    .line 72
    .line 73
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
