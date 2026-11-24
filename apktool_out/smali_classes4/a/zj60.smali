.class public final La/zj60;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:La/jge0;

.field public final synthetic e:Z

.field public final synthetic f:La/ak60;

.field public final synthetic g:La/g9q0;

.field public final synthetic h:La/y9q0;

.field public final synthetic i:La/k6z;


# direct methods
.method public constructor <init>(FFFLa/jge0;ZLa/ak60;La/g9q0;La/y9q0;La/k6z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/zj60;->a:F

    .line 5
    .line 6
    iput p2, p0, La/zj60;->b:F

    .line 7
    .line 8
    iput p3, p0, La/zj60;->c:F

    .line 9
    .line 10
    iput-object p4, p0, La/zj60;->d:La/jge0;

    .line 11
    .line 12
    iput-boolean p5, p0, La/zj60;->e:Z

    .line 13
    .line 14
    iput-object p6, p0, La/zj60;->f:La/ak60;

    .line 15
    .line 16
    iput-object p7, p0, La/zj60;->g:La/g9q0;

    .line 17
    .line 18
    iput-object p8, p0, La/zj60;->h:La/y9q0;

    .line 19
    .line 20
    iput-object p9, p0, La/zj60;->i:La/k6z;

    .line 21
    .line 22
    return-void
.end method

.method public static final f(La/pu90;ILa/ak60;ILa/g9q0;La/y9q0;La/k6z;I)Z
    .locals 9

    .line 1
    iget p0, p0, La/pu90;->b:I

    .line 2
    .line 3
    sub-int p0, p7, p0

    .line 4
    .line 5
    sub-int/2addr p0, p1

    .line 6
    const/4 p1, 0x0

    .line 7
    if-gez p0, :cond_0

    .line 8
    .line 9
    move p0, p1

    .line 10
    :cond_0
    iget-object v1, p2, La/ak60;->b:Ljava/lang/String;

    .line 11
    .line 12
    const/4 p2, 0x5

    .line 13
    invoke-static {p1, p3, p1, p0, p2}, La/r4e;->b(IIIII)J

    .line 14
    .line 15
    .line 16
    move-result-wide v5

    .line 17
    const/4 v4, 0x6

    .line 18
    const/16 v8, 0x38c

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    move-object v0, p4

    .line 22
    move-object v2, p5

    .line 23
    move-object v7, p6

    .line 24
    invoke-static/range {v0 .. v8}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-wide p2, p2, La/a9q0;->c:J

    .line 29
    .line 30
    const-wide v0, 0xffffffffL

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    and-long/2addr p2, v0

    .line 36
    long-to-int p2, p2

    .line 37
    if-ge p2, p0, :cond_1

    .line 38
    .line 39
    const/4 p0, 0x1

    .line 40
    return p0

    .line 41
    :cond_1
    return p1
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    check-cast v4, La/pj30;

    .line 16
    .line 17
    const/4 v5, 0x1

    .line 18
    invoke-interface {v2, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, La/pj30;

    .line 23
    .line 24
    sget-object v6, La/qmk;->a:La/zcl;

    .line 25
    .line 26
    const/high16 v6, 0x41000000    # 8.0f

    .line 27
    .line 28
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    iget v6, v0, La/zj60;->a:F

    .line 37
    .line 38
    invoke-interface {v1, v6}, La/w6k;->T(F)I

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    const/high16 v8, 0x43e40000    # 456.0f

    .line 43
    .line 44
    invoke-interface {v1, v8}, La/w6k;->T(F)I

    .line 45
    .line 46
    .line 47
    move-result v8

    .line 48
    iget v10, v0, La/zj60;->b:F

    .line 49
    .line 50
    invoke-interface {v1, v10}, La/w6k;->T(F)I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 55
    .line 56
    .line 57
    move-result v11

    .line 58
    iget v12, v0, La/zj60;->c:F

    .line 59
    .line 60
    invoke-interface {v1, v12}, La/w6k;->T(F)I

    .line 61
    .line 62
    .line 63
    move-result v12

    .line 64
    sub-int/2addr v11, v12

    .line 65
    const/16 v17, 0x0

    .line 66
    .line 67
    const/16 v18, 0xa

    .line 68
    .line 69
    const/4 v14, 0x0

    .line 70
    const/4 v15, 0x0

    .line 71
    const/16 v16, 0x0

    .line 72
    .line 73
    move-wide/from16 v12, p3

    .line 74
    .line 75
    invoke-static/range {v12 .. v18}, La/p4e;->b(JIIIII)J

    .line 76
    .line 77
    .line 78
    move-result-wide v14

    .line 79
    invoke-interface {v2, v14, v15}, La/pj30;->S(J)La/pu90;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    iget-object v12, v0, La/zj60;->d:La/jge0;

    .line 84
    .line 85
    if-eqz v12, :cond_1

    .line 86
    .line 87
    iget v13, v12, La/jge0;->b:F

    .line 88
    .line 89
    int-to-float v14, v10

    .line 90
    sub-float/2addr v13, v14

    .line 91
    int-to-float v14, v7

    .line 92
    sub-float/2addr v13, v14

    .line 93
    float-to-int v13, v13

    .line 94
    if-gez v13, :cond_0

    .line 95
    .line 96
    :goto_0
    move v13, v3

    .line 97
    :cond_0
    move v15, v13

    .line 98
    goto :goto_1

    .line 99
    :cond_1
    sub-int v13, v11, v10

    .line 100
    .line 101
    if-gez v13, :cond_0

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :goto_1
    if-eqz v12, :cond_3

    .line 105
    .line 106
    int-to-float v13, v11

    .line 107
    iget v14, v12, La/jge0;->d:F

    .line 108
    .line 109
    sub-float/2addr v13, v14

    .line 110
    int-to-float v14, v7

    .line 111
    sub-float/2addr v13, v14

    .line 112
    float-to-int v13, v13

    .line 113
    if-gez v13, :cond_2

    .line 114
    .line 115
    :goto_2
    move v13, v3

    .line 116
    :cond_2
    move/from16 v16, v13

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_3
    sub-int v13, v11, v10

    .line 120
    .line 121
    if-gez v13, :cond_2

    .line 122
    .line 123
    goto :goto_2

    .line 124
    :goto_3
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 125
    .line 126
    .line 127
    move-result v13

    .line 128
    mul-int/lit8 v14, v6, 0x2

    .line 129
    .line 130
    sub-int/2addr v13, v14

    .line 131
    if-gez v13, :cond_4

    .line 132
    .line 133
    move v13, v3

    .line 134
    :cond_4
    if-le v13, v8, :cond_5

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_5
    move v8, v13

    .line 138
    :goto_4
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 139
    .line 140
    .line 141
    move-result v13

    .line 142
    sub-int/2addr v13, v6

    .line 143
    iget v14, v2, La/pu90;->a:I

    .line 144
    .line 145
    sub-int/2addr v13, v14

    .line 146
    if-ge v13, v6, :cond_6

    .line 147
    .line 148
    move v13, v6

    .line 149
    :cond_6
    iget-boolean v5, v0, La/zj60;->e:Z

    .line 150
    .line 151
    if-eqz v12, :cond_8

    .line 152
    .line 153
    if-eqz v5, :cond_7

    .line 154
    .line 155
    iget v3, v12, La/jge0;->c:F

    .line 156
    .line 157
    int-to-float v14, v14

    .line 158
    sub-float/2addr v3, v14

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    iget v3, v12, La/jge0;->a:F

    .line 161
    .line 162
    :goto_5
    float-to-int v3, v3

    .line 163
    invoke-static {v3, v6, v13}, La/l1e0;->d(III)I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    goto :goto_6

    .line 168
    :cond_8
    move v3, v6

    .line 169
    :goto_6
    if-eqz v5, :cond_9

    .line 170
    .line 171
    iget v13, v2, La/pu90;->a:I

    .line 172
    .line 173
    add-int/2addr v13, v3

    .line 174
    sub-int/2addr v13, v6

    .line 175
    const/4 v14, 0x0

    .line 176
    invoke-static {v13, v14, v8}, La/l1e0;->d(III)I

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    :goto_7
    move-object v14, v12

    .line 181
    goto :goto_8

    .line 182
    :cond_9
    const/4 v14, 0x0

    .line 183
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    sub-int/2addr v13, v6

    .line 188
    sub-int/2addr v13, v3

    .line 189
    invoke-static {v13, v14, v8}, La/l1e0;->d(III)I

    .line 190
    .line 191
    .line 192
    move-result v13

    .line 193
    goto :goto_7

    .line 194
    :goto_8
    iget-object v12, v0, La/zj60;->g:La/g9q0;

    .line 195
    .line 196
    move-object/from16 v19, v14

    .line 197
    .line 198
    iget-object v14, v0, La/zj60;->i:La/k6z;

    .line 199
    .line 200
    move/from16 v20, v10

    .line 201
    .line 202
    iget-object v10, v0, La/zj60;->f:La/ak60;

    .line 203
    .line 204
    move/from16 v21, v11

    .line 205
    .line 206
    move v11, v13

    .line 207
    iget-object v13, v0, La/zj60;->h:La/y9q0;

    .line 208
    .line 209
    move/from16 p2, v8

    .line 210
    .line 211
    move-object v8, v2

    .line 212
    move/from16 v2, p2

    .line 213
    .line 214
    move-object/from16 p2, v19

    .line 215
    .line 216
    move/from16 v19, v5

    .line 217
    .line 218
    move-object/from16 v5, p2

    .line 219
    .line 220
    move/from16 p2, v21

    .line 221
    .line 222
    invoke-static/range {v8 .. v15}, La/zj60;->f(La/pu90;ILa/ak60;ILa/g9q0;La/y9q0;La/k6z;I)Z

    .line 223
    .line 224
    .line 225
    move-result v30

    .line 226
    if-nez v30, :cond_a

    .line 227
    .line 228
    iget-object v12, v0, La/zj60;->g:La/g9q0;

    .line 229
    .line 230
    iget-object v14, v0, La/zj60;->i:La/k6z;

    .line 231
    .line 232
    iget-object v10, v0, La/zj60;->f:La/ak60;

    .line 233
    .line 234
    move v1, v15

    .line 235
    move/from16 v15, v16

    .line 236
    .line 237
    invoke-static/range {v8 .. v15}, La/zj60;->f(La/pu90;ILa/ak60;ILa/g9q0;La/y9q0;La/k6z;I)Z

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    if-eqz v10, :cond_b

    .line 242
    .line 243
    const/4 v10, 0x1

    .line 244
    goto :goto_9

    .line 245
    :cond_a
    move v1, v15

    .line 246
    move/from16 v15, v16

    .line 247
    .line 248
    :cond_b
    const/4 v10, 0x0

    .line 249
    :goto_9
    if-nez v30, :cond_d

    .line 250
    .line 251
    if-nez v10, :cond_d

    .line 252
    .line 253
    iget-object v12, v0, La/zj60;->f:La/ak60;

    .line 254
    .line 255
    iget-object v12, v12, La/ak60;->b:Ljava/lang/String;

    .line 256
    .line 257
    if-gez v1, :cond_c

    .line 258
    .line 259
    const/4 v14, 0x0

    .line 260
    :goto_a
    move/from16 v16, v9

    .line 261
    .line 262
    goto :goto_b

    .line 263
    :cond_c
    move v14, v1

    .line 264
    goto :goto_a

    .line 265
    :goto_b
    const/4 v9, 0x5

    .line 266
    move/from16 v31, v10

    .line 267
    .line 268
    const/4 v10, 0x0

    .line 269
    invoke-static {v10, v2, v10, v14, v9}, La/r4e;->b(IIIII)J

    .line 270
    .line 271
    .line 272
    move-result-wide v26

    .line 273
    const/16 v25, 0x6

    .line 274
    .line 275
    const/16 v29, 0x38c

    .line 276
    .line 277
    iget-object v9, v0, La/zj60;->g:La/g9q0;

    .line 278
    .line 279
    const/16 v24, 0x0

    .line 280
    .line 281
    iget-object v10, v0, La/zj60;->i:La/k6z;

    .line 282
    .line 283
    move-object/from16 v21, v9

    .line 284
    .line 285
    move-object/from16 v28, v10

    .line 286
    .line 287
    move-object/from16 v22, v12

    .line 288
    .line 289
    move-object/from16 v23, v13

    .line 290
    .line 291
    invoke-static/range {v21 .. v29}, La/g9q0;->a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    iget-wide v9, v9, La/a9q0;->c:J

    .line 296
    .line 297
    const-wide v12, 0xffffffffL

    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    and-long/2addr v9, v12

    .line 303
    long-to-int v9, v9

    .line 304
    if-ge v9, v1, :cond_e

    .line 305
    .line 306
    const/4 v9, 0x1

    .line 307
    goto :goto_c

    .line 308
    :cond_d
    move/from16 v16, v9

    .line 309
    .line 310
    move/from16 v31, v10

    .line 311
    .line 312
    :cond_e
    const/4 v9, 0x0

    .line 313
    :goto_c
    if-nez v30, :cond_10

    .line 314
    .line 315
    if-eqz v9, :cond_f

    .line 316
    .line 317
    goto :goto_d

    .line 318
    :cond_f
    const/16 v26, 0x1

    .line 319
    .line 320
    goto :goto_e

    .line 321
    :cond_10
    :goto_d
    const/16 v26, 0x0

    .line 322
    .line 323
    :goto_e
    if-nez v30, :cond_12

    .line 324
    .line 325
    if-eqz v31, :cond_11

    .line 326
    .line 327
    goto :goto_f

    .line 328
    :cond_11
    const/16 v17, 0x0

    .line 329
    .line 330
    goto :goto_10

    .line 331
    :cond_12
    :goto_f
    const/16 v17, 0x1

    .line 332
    .line 333
    :goto_10
    if-eqz v26, :cond_13

    .line 334
    .line 335
    goto :goto_11

    .line 336
    :cond_13
    move v15, v1

    .line 337
    :goto_11
    iget v1, v8, La/pu90;->b:I

    .line 338
    .line 339
    sub-int v1, v15, v1

    .line 340
    .line 341
    sub-int v1, v1, v16

    .line 342
    .line 343
    if-gez v1, :cond_14

    .line 344
    .line 345
    const/4 v1, 0x0

    .line 346
    :cond_14
    if-eqz v17, :cond_15

    .line 347
    .line 348
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 353
    .line 354
    .line 355
    move-result-object v1

    .line 356
    new-instance v9, Lkotlin/Pair;

    .line 357
    .line 358
    invoke-direct {v9, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    goto :goto_12

    .line 362
    :cond_15
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    if-gez v15, :cond_16

    .line 367
    .line 368
    const/4 v15, 0x0

    .line 369
    :cond_16
    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 370
    .line 371
    .line 372
    move-result-object v2

    .line 373
    new-instance v9, Lkotlin/Pair;

    .line 374
    .line 375
    invoke-direct {v9, v1, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 376
    .line 377
    .line 378
    :goto_12
    iget-object v1, v9, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v1, Ljava/lang/Number;

    .line 381
    .line 382
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 383
    .line 384
    .line 385
    move-result v1

    .line 386
    iget-object v2, v9, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 387
    .line 388
    check-cast v2, Ljava/lang/Number;

    .line 389
    .line 390
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 391
    .line 392
    .line 393
    move-result v2

    .line 394
    const/4 v14, 0x0

    .line 395
    invoke-static {v1, v1, v14, v2}, La/p4e;->a(IIII)J

    .line 396
    .line 397
    .line 398
    move-result-wide v1

    .line 399
    invoke-interface {v4, v1, v2}, La/pj30;->S(J)La/pu90;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iget v2, v1, La/pu90;->b:I

    .line 404
    .line 405
    if-eqz v17, :cond_17

    .line 406
    .line 407
    iget v4, v8, La/pu90;->b:I

    .line 408
    .line 409
    add-int/2addr v2, v4

    .line 410
    add-int v2, v2, v16

    .line 411
    .line 412
    :cond_17
    if-eqz v5, :cond_19

    .line 413
    .line 414
    if-eqz v26, :cond_18

    .line 415
    .line 416
    iget v2, v5, La/jge0;->d:F

    .line 417
    .line 418
    int-to-float v4, v7

    .line 419
    add-float/2addr v2, v4

    .line 420
    float-to-int v2, v2

    .line 421
    goto :goto_13

    .line 422
    :cond_18
    iget v4, v5, La/jge0;->b:F

    .line 423
    .line 424
    int-to-float v2, v2

    .line 425
    sub-float/2addr v4, v2

    .line 426
    int-to-float v2, v7

    .line 427
    sub-float/2addr v4, v2

    .line 428
    float-to-int v2, v4

    .line 429
    goto :goto_13

    .line 430
    :cond_19
    sub-int v11, p2, v20

    .line 431
    .line 432
    sub-int/2addr v11, v2

    .line 433
    div-int/lit8 v11, v11, 0x2

    .line 434
    .line 435
    add-int v2, v11, v20

    .line 436
    .line 437
    :goto_13
    if-eqz v17, :cond_1f

    .line 438
    .line 439
    if-eqz v19, :cond_1b

    .line 440
    .line 441
    iget v4, v8, La/pu90;->a:I

    .line 442
    .line 443
    add-int/2addr v4, v3

    .line 444
    iget v5, v1, La/pu90;->a:I

    .line 445
    .line 446
    sub-int/2addr v4, v5

    .line 447
    if-ge v4, v6, :cond_1a

    .line 448
    .line 449
    goto :goto_15

    .line 450
    :cond_1a
    :goto_14
    move v6, v4

    .line 451
    goto :goto_15

    .line 452
    :cond_1b
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 453
    .line 454
    .line 455
    move-result v4

    .line 456
    sub-int/2addr v4, v6

    .line 457
    iget v5, v1, La/pu90;->a:I

    .line 458
    .line 459
    sub-int/2addr v4, v5

    .line 460
    if-le v3, v4, :cond_1c

    .line 461
    .line 462
    goto :goto_14

    .line 463
    :cond_1c
    move v6, v3

    .line 464
    :goto_15
    if-eqz v26, :cond_1d

    .line 465
    .line 466
    iget v4, v8, La/pu90;->b:I

    .line 467
    .line 468
    add-int/2addr v4, v2

    .line 469
    add-int v4, v4, v16

    .line 470
    .line 471
    goto :goto_16

    .line 472
    :cond_1d
    move v4, v2

    .line 473
    :goto_16
    if-eqz v26, :cond_1e

    .line 474
    .line 475
    goto :goto_17

    .line 476
    :cond_1e
    iget v5, v1, La/pu90;->b:I

    .line 477
    .line 478
    add-int/2addr v2, v5

    .line 479
    add-int v2, v2, v16

    .line 480
    .line 481
    :goto_17
    new-instance v5, La/prs0;

    .line 482
    .line 483
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 484
    .line 485
    .line 486
    move-result-object v6

    .line 487
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    invoke-direct {v5, v6, v4, v2}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 496
    .line 497
    .line 498
    goto :goto_1a

    .line 499
    :cond_1f
    if-eqz v5, :cond_22

    .line 500
    .line 501
    if-eqz v19, :cond_20

    .line 502
    .line 503
    iget v4, v5, La/jge0;->c:F

    .line 504
    .line 505
    iget v5, v1, La/pu90;->a:I

    .line 506
    .line 507
    int-to-float v5, v5

    .line 508
    sub-float/2addr v4, v5

    .line 509
    goto :goto_18

    .line 510
    :cond_20
    iget v4, v5, La/jge0;->a:F

    .line 511
    .line 512
    :goto_18
    float-to-int v4, v4

    .line 513
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 514
    .line 515
    .line 516
    move-result v5

    .line 517
    sub-int/2addr v5, v6

    .line 518
    iget v7, v1, La/pu90;->a:I

    .line 519
    .line 520
    sub-int/2addr v5, v7

    .line 521
    if-ge v5, v6, :cond_21

    .line 522
    .line 523
    move v5, v6

    .line 524
    :cond_21
    invoke-static {v4, v6, v5}, La/l1e0;->d(III)I

    .line 525
    .line 526
    .line 527
    move-result v6

    .line 528
    goto :goto_19

    .line 529
    :cond_22
    if-eqz v19, :cond_24

    .line 530
    .line 531
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 532
    .line 533
    .line 534
    move-result v4

    .line 535
    sub-int/2addr v4, v6

    .line 536
    iget v5, v1, La/pu90;->a:I

    .line 537
    .line 538
    sub-int/2addr v4, v5

    .line 539
    if-ge v4, v6, :cond_23

    .line 540
    .line 541
    goto :goto_19

    .line 542
    :cond_23
    move v6, v4

    .line 543
    :cond_24
    :goto_19
    new-instance v5, La/prs0;

    .line 544
    .line 545
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 546
    .line 547
    .line 548
    move-result-object v4

    .line 549
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 550
    .line 551
    .line 552
    move-result-object v2

    .line 553
    const/16 v18, 0x0

    .line 554
    .line 555
    invoke-static/range {v18 .. v18}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 556
    .line 557
    .line 558
    move-result-object v6

    .line 559
    invoke-direct {v5, v4, v2, v6}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    :goto_1a
    iget-object v2, v5, La/prs0;->a:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v2, Ljava/lang/Number;

    .line 565
    .line 566
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 567
    .line 568
    .line 569
    move-result v18

    .line 570
    iget-object v2, v5, La/prs0;->b:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v2, Ljava/lang/Number;

    .line 573
    .line 574
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 575
    .line 576
    .line 577
    move-result v19

    .line 578
    iget-object v2, v5, La/prs0;->c:Ljava/lang/Object;

    .line 579
    .line 580
    check-cast v2, Ljava/lang/Number;

    .line 581
    .line 582
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 583
    .line 584
    .line 585
    move-result v23

    .line 586
    invoke-static/range {p3 .. p4}, La/p4e;->i(J)I

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    invoke-static/range {p3 .. p4}, La/p4e;->h(J)I

    .line 591
    .line 592
    .line 593
    move-result v4

    .line 594
    new-instance v16, La/yj60;

    .line 595
    .line 596
    iget-object v5, v0, La/zj60;->i:La/k6z;

    .line 597
    .line 598
    iget-boolean v0, v0, La/zj60;->e:Z

    .line 599
    .line 600
    move/from16 v25, v0

    .line 601
    .line 602
    move/from16 v22, v3

    .line 603
    .line 604
    move-object/from16 v24, v5

    .line 605
    .line 606
    move-object/from16 v21, v8

    .line 607
    .line 608
    move/from16 v20, v17

    .line 609
    .line 610
    move-object/from16 v17, v1

    .line 611
    .line 612
    invoke-direct/range {v16 .. v26}, La/yj60;-><init>(La/pu90;IIZLa/pu90;IILa/k6z;ZZ)V

    .line 613
    .line 614
    .line 615
    move-object/from16 v1, p1

    .line 616
    .line 617
    move-object/from16 v0, v16

    .line 618
    .line 619
    invoke-static {v1, v2, v4, v0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    return-object v0
.end method
