.class public final La/ey40;
.super La/gkx;
.source "SourceFile"


# instance fields
.field public f:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 38
    invoke-direct {p0, v0}, La/ey40;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u1h0;->a:[J

    .line 5
    .line 6
    iput-object v0, p0, La/gkx;->a:[J

    .line 7
    .line 8
    sget-object v0, La/pkx;->a:[I

    .line 9
    .line 10
    iput-object v0, p0, La/gkx;->b:[I

    .line 11
    .line 12
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 13
    .line 14
    iput-object v0, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 15
    .line 16
    if-ltz p1, :cond_0

    .line 17
    .line 18
    const/4 v0, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    :goto_0
    if-eqz v0, :cond_1

    .line 22
    .line 23
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    invoke-virtual {p0, p1}, La/ey40;->f(I)V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const-string p0, "Capacity must be a positive value."

    .line 32
    .line 33
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    throw p0
.end method


# virtual methods
.method public final c()V
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/gkx;->e:I

    .line 3
    .line 4
    iget-object v1, p0, La/gkx;->a:[J

    .line 5
    .line 6
    sget-object v2, La/u1h0;->a:[J

    .line 7
    .line 8
    if-eq v1, v2, :cond_0

    .line 9
    .line 10
    const-wide v2, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2, v3}, La/qx3;->p([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, La/gkx;->a:[J

    .line 19
    .line 20
    iget v2, p0, La/gkx;->d:I

    .line 21
    .line 22
    shr-int/lit8 v3, v2, 0x3

    .line 23
    .line 24
    and-int/lit8 v2, v2, 0x7

    .line 25
    .line 26
    shl-int/lit8 v2, v2, 0x3

    .line 27
    .line 28
    aget-wide v4, v1, v3

    .line 29
    .line 30
    const-wide/16 v6, 0xff

    .line 31
    .line 32
    shl-long/2addr v6, v2

    .line 33
    not-long v8, v6

    .line 34
    and-long/2addr v4, v8

    .line 35
    or-long/2addr v4, v6

    .line 36
    aput-wide v4, v1, v3

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget v3, p0, La/gkx;->d:I

    .line 42
    .line 43
    invoke-static {v0, v3, v2, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget v0, p0, La/gkx;->d:I

    .line 47
    .line 48
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, La/gkx;->e:I

    .line 53
    .line 54
    sub-int/2addr v0, v1

    .line 55
    iput v0, p0, La/ey40;->f:I

    .line 56
    .line 57
    return-void
.end method

.method public final d(I)I
    .locals 9

    .line 1
    iget v0, p0, La/gkx;->d:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/gkx;->a:[J

    .line 6
    .line 7
    shr-int/lit8 v3, p1, 0x3

    .line 8
    .line 9
    and-int/lit8 v4, p1, 0x7

    .line 10
    .line 11
    shl-int/lit8 v4, v4, 0x3

    .line 12
    .line 13
    aget-wide v5, v2, v3

    .line 14
    .line 15
    ushr-long/2addr v5, v4

    .line 16
    add-int/lit8 v3, v3, 0x1

    .line 17
    .line 18
    aget-wide v7, v2, v3

    .line 19
    .line 20
    rsub-int/lit8 v2, v4, 0x40

    .line 21
    .line 22
    shl-long v2, v7, v2

    .line 23
    .line 24
    int-to-long v7, v4

    .line 25
    neg-long v7, v7

    .line 26
    const/16 v4, 0x3f

    .line 27
    .line 28
    shr-long/2addr v7, v4

    .line 29
    and-long/2addr v2, v7

    .line 30
    or-long/2addr v2, v5

    .line 31
    not-long v4, v2

    .line 32
    const/4 v6, 0x7

    .line 33
    shl-long/2addr v4, v6

    .line 34
    and-long/2addr v2, v4

    .line 35
    const-wide v4, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    and-long/2addr v2, v4

    .line 41
    const-wide/16 v4, 0x0

    .line 42
    .line 43
    cmp-long v4, v2, v4

    .line 44
    .line 45
    if-eqz v4, :cond_0

    .line 46
    .line 47
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    shr-int/lit8 p0, p0, 0x3

    .line 52
    .line 53
    add-int/2addr p1, p0

    .line 54
    and-int p0, p1, v0

    .line 55
    .line 56
    return p0

    .line 57
    :cond_0
    add-int/lit8 v1, v1, 0x8

    .line 58
    .line 59
    add-int/2addr p1, v1

    .line 60
    and-int/2addr p1, v0

    .line 61
    goto :goto_0
.end method

.method public final e(I)I
    .locals 35

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-static/range {p1 .. p1}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    ushr-int/lit8 v2, v1, 0x10

    .line 8
    .line 9
    xor-int/2addr v1, v2

    .line 10
    const v2, -0x3361d2af    # -8.293031E7f

    .line 11
    .line 12
    .line 13
    mul-int/2addr v1, v2

    .line 14
    ushr-int/lit8 v3, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v3

    .line 17
    ushr-int/lit8 v3, v1, 0x7

    .line 18
    .line 19
    and-int/lit8 v1, v1, 0x7f

    .line 20
    .line 21
    iget v4, v0, La/gkx;->d:I

    .line 22
    .line 23
    and-int v5, v3, v4

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    :goto_0
    iget-object v8, v0, La/gkx;->a:[J

    .line 27
    .line 28
    shr-int/lit8 v9, v5, 0x3

    .line 29
    .line 30
    and-int/lit8 v10, v5, 0x7

    .line 31
    .line 32
    shl-int/lit8 v10, v10, 0x3

    .line 33
    .line 34
    aget-wide v11, v8, v9

    .line 35
    .line 36
    ushr-long/2addr v11, v10

    .line 37
    const/4 v13, 0x1

    .line 38
    add-int/2addr v9, v13

    .line 39
    aget-wide v14, v8, v9

    .line 40
    .line 41
    rsub-int/lit8 v8, v10, 0x40

    .line 42
    .line 43
    shl-long v8, v14, v8

    .line 44
    .line 45
    int-to-long v14, v10

    .line 46
    neg-long v14, v14

    .line 47
    const/16 v10, 0x3f

    .line 48
    .line 49
    shr-long/2addr v14, v10

    .line 50
    and-long/2addr v8, v14

    .line 51
    or-long/2addr v8, v11

    .line 52
    int-to-long v10, v1

    .line 53
    const-wide v14, 0x101010101010101L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-long v16, v10, v14

    .line 59
    .line 60
    move/from16 v18, v7

    .line 61
    .line 62
    const/4 v12, 0x0

    .line 63
    xor-long v6, v8, v16

    .line 64
    .line 65
    sub-long v14, v6, v14

    .line 66
    .line 67
    not-long v6, v6

    .line 68
    and-long/2addr v6, v14

    .line 69
    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    and-long/2addr v6, v14

    .line 75
    :goto_1
    const-wide/16 v16, 0x0

    .line 76
    .line 77
    cmp-long v19, v6, v16

    .line 78
    .line 79
    if-eqz v19, :cond_1

    .line 80
    .line 81
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 82
    .line 83
    .line 84
    move-result v16

    .line 85
    shr-int/lit8 v16, v16, 0x3

    .line 86
    .line 87
    add-int v16, v5, v16

    .line 88
    .line 89
    and-int v16, v16, v4

    .line 90
    .line 91
    move/from16 v19, v2

    .line 92
    .line 93
    iget-object v2, v0, La/gkx;->b:[I

    .line 94
    .line 95
    aget v2, v2, v16

    .line 96
    .line 97
    move/from16 v20, v12

    .line 98
    .line 99
    move/from16 v12, p1

    .line 100
    .line 101
    if-ne v2, v12, :cond_0

    .line 102
    .line 103
    return v16

    .line 104
    :cond_0
    const-wide/16 v16, 0x1

    .line 105
    .line 106
    sub-long v16, v6, v16

    .line 107
    .line 108
    and-long v6, v6, v16

    .line 109
    .line 110
    move/from16 v2, v19

    .line 111
    .line 112
    move/from16 v12, v20

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_1
    move/from16 v19, v2

    .line 116
    .line 117
    move/from16 v20, v12

    .line 118
    .line 119
    move/from16 v12, p1

    .line 120
    .line 121
    not-long v6, v8

    .line 122
    const/4 v2, 0x6

    .line 123
    shl-long/2addr v6, v2

    .line 124
    and-long/2addr v6, v8

    .line 125
    and-long/2addr v6, v14

    .line 126
    cmp-long v2, v6, v16

    .line 127
    .line 128
    const/16 v6, 0x8

    .line 129
    .line 130
    if-eqz v2, :cond_f

    .line 131
    .line 132
    invoke-virtual {v0, v3}, La/ey40;->d(I)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    iget v2, v0, La/ey40;->f:I

    .line 137
    .line 138
    const-wide/16 v7, 0xff

    .line 139
    .line 140
    if-nez v2, :cond_2

    .line 141
    .line 142
    iget-object v2, v0, La/gkx;->a:[J

    .line 143
    .line 144
    shr-int/lit8 v12, v1, 0x3

    .line 145
    .line 146
    aget-wide v16, v2, v12

    .line 147
    .line 148
    and-int/lit8 v2, v1, 0x7

    .line 149
    .line 150
    shl-int/lit8 v2, v2, 0x3

    .line 151
    .line 152
    shr-long v16, v16, v2

    .line 153
    .line 154
    and-long v16, v16, v7

    .line 155
    .line 156
    const-wide/16 v21, 0xfe

    .line 157
    .line 158
    cmp-long v2, v16, v21

    .line 159
    .line 160
    if-nez v2, :cond_3

    .line 161
    .line 162
    :cond_2
    move-wide/from16 v28, v7

    .line 163
    .line 164
    move-wide/from16 v26, v10

    .line 165
    .line 166
    move/from16 v32, v13

    .line 167
    .line 168
    const/16 p1, 0x7

    .line 169
    .line 170
    const-wide/16 v16, 0x80

    .line 171
    .line 172
    goto/16 :goto_b

    .line 173
    .line 174
    :cond_3
    iget v1, v0, La/gkx;->d:I

    .line 175
    .line 176
    if-le v1, v6, :cond_b

    .line 177
    .line 178
    iget v2, v0, La/gkx;->e:I

    .line 179
    .line 180
    const-wide/16 v16, 0x80

    .line 181
    .line 182
    int-to-long v4, v2

    .line 183
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 184
    .line 185
    const-wide/16 v23, 0x20

    .line 186
    .line 187
    mul-long v4, v4, v23

    .line 188
    .line 189
    int-to-long v1, v1

    .line 190
    const-wide/16 v23, 0x19

    .line 191
    .line 192
    mul-long v1, v1, v23

    .line 193
    .line 194
    const-wide/high16 v23, -0x8000000000000000L

    .line 195
    .line 196
    xor-long v4, v4, v23

    .line 197
    .line 198
    xor-long v1, v1, v23

    .line 199
    .line 200
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    if-gtz v1, :cond_a

    .line 205
    .line 206
    iget-object v1, v0, La/gkx;->a:[J

    .line 207
    .line 208
    iget v2, v0, La/gkx;->d:I

    .line 209
    .line 210
    iget-object v4, v0, La/gkx;->b:[I

    .line 211
    .line 212
    iget-object v5, v0, La/gkx;->c:[Ljava/lang/Object;

    .line 213
    .line 214
    add-int/lit8 v12, v2, 0x7

    .line 215
    .line 216
    shr-int/lit8 v12, v12, 0x3

    .line 217
    .line 218
    move/from16 v25, v6

    .line 219
    .line 220
    move/from16 v6, v20

    .line 221
    .line 222
    :goto_2
    if-ge v6, v12, :cond_4

    .line 223
    .line 224
    aget-wide v26, v1, v6

    .line 225
    .line 226
    move-wide/from16 v28, v7

    .line 227
    .line 228
    and-long v7, v26, v14

    .line 229
    .line 230
    move-wide/from16 v26, v10

    .line 231
    .line 232
    const/16 p1, 0x7

    .line 233
    .line 234
    not-long v9, v7

    .line 235
    ushr-long v7, v7, p1

    .line 236
    .line 237
    add-long/2addr v9, v7

    .line 238
    const-wide v7, -0x101010101010102L

    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    and-long/2addr v7, v9

    .line 244
    aput-wide v7, v1, v6

    .line 245
    .line 246
    add-int/lit8 v6, v6, 0x1

    .line 247
    .line 248
    move-wide/from16 v10, v26

    .line 249
    .line 250
    move-wide/from16 v7, v28

    .line 251
    .line 252
    goto :goto_2

    .line 253
    :cond_4
    move-wide/from16 v28, v7

    .line 254
    .line 255
    move-wide/from16 v26, v10

    .line 256
    .line 257
    const/16 p1, 0x7

    .line 258
    .line 259
    invoke-static {v1}, La/tx3;->D([J)I

    .line 260
    .line 261
    .line 262
    move-result v6

    .line 263
    add-int/lit8 v7, v6, -0x1

    .line 264
    .line 265
    aget-wide v8, v1, v7

    .line 266
    .line 267
    const-wide v10, 0xffffffffffffffL

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    and-long/2addr v8, v10

    .line 273
    const-wide/high16 v14, -0x100000000000000L

    .line 274
    .line 275
    or-long/2addr v8, v14

    .line 276
    aput-wide v8, v1, v7

    .line 277
    .line 278
    aget-wide v7, v1, v20

    .line 279
    .line 280
    aput-wide v7, v1, v6

    .line 281
    .line 282
    move/from16 v6, v20

    .line 283
    .line 284
    :goto_3
    if-eq v6, v2, :cond_9

    .line 285
    .line 286
    shr-int/lit8 v7, v6, 0x3

    .line 287
    .line 288
    aget-wide v8, v1, v7

    .line 289
    .line 290
    and-int/lit8 v12, v6, 0x7

    .line 291
    .line 292
    shl-int/lit8 v12, v12, 0x3

    .line 293
    .line 294
    shr-long/2addr v8, v12

    .line 295
    and-long v8, v8, v28

    .line 296
    .line 297
    cmp-long v14, v8, v16

    .line 298
    .line 299
    if-nez v14, :cond_5

    .line 300
    .line 301
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 302
    .line 303
    goto :goto_3

    .line 304
    :cond_5
    cmp-long v8, v8, v21

    .line 305
    .line 306
    if-eqz v8, :cond_6

    .line 307
    .line 308
    goto :goto_4

    .line 309
    :cond_6
    aget v8, v4, v6

    .line 310
    .line 311
    invoke-static {v8}, Ljava/lang/Integer;->hashCode(I)I

    .line 312
    .line 313
    .line 314
    move-result v8

    .line 315
    ushr-int/lit8 v9, v8, 0x10

    .line 316
    .line 317
    xor-int/2addr v8, v9

    .line 318
    mul-int v8, v8, v19

    .line 319
    .line 320
    ushr-int/lit8 v9, v8, 0x10

    .line 321
    .line 322
    xor-int/2addr v8, v9

    .line 323
    ushr-int/lit8 v9, v8, 0x7

    .line 324
    .line 325
    invoke-virtual {v0, v9}, La/ey40;->d(I)I

    .line 326
    .line 327
    .line 328
    move-result v14

    .line 329
    and-int/2addr v9, v2

    .line 330
    sub-int v15, v14, v9

    .line 331
    .line 332
    and-int/2addr v15, v2

    .line 333
    div-int/lit8 v15, v15, 0x8

    .line 334
    .line 335
    sub-int v9, v6, v9

    .line 336
    .line 337
    and-int/2addr v9, v2

    .line 338
    div-int/lit8 v9, v9, 0x8

    .line 339
    .line 340
    if-ne v15, v9, :cond_7

    .line 341
    .line 342
    and-int/lit8 v8, v8, 0x7f

    .line 343
    .line 344
    int-to-long v8, v8

    .line 345
    aget-wide v14, v1, v7

    .line 346
    .line 347
    move-wide/from16 v30, v10

    .line 348
    .line 349
    shl-long v10, v28, v12

    .line 350
    .line 351
    not-long v10, v10

    .line 352
    and-long/2addr v10, v14

    .line 353
    shl-long/2addr v8, v12

    .line 354
    or-long/2addr v8, v10

    .line 355
    aput-wide v8, v1, v7

    .line 356
    .line 357
    array-length v7, v1

    .line 358
    sub-int/2addr v7, v13

    .line 359
    aget-wide v8, v1, v20

    .line 360
    .line 361
    and-long v8, v8, v30

    .line 362
    .line 363
    or-long v8, v8, v23

    .line 364
    .line 365
    aput-wide v8, v1, v7

    .line 366
    .line 367
    add-int/lit8 v6, v6, 0x1

    .line 368
    .line 369
    move-wide/from16 v10, v30

    .line 370
    .line 371
    goto :goto_3

    .line 372
    :cond_7
    move-wide/from16 v30, v10

    .line 373
    .line 374
    shr-int/lit8 v9, v14, 0x3

    .line 375
    .line 376
    aget-wide v10, v1, v9

    .line 377
    .line 378
    and-int/lit8 v15, v14, 0x7

    .line 379
    .line 380
    shl-int/lit8 v15, v15, 0x3

    .line 381
    .line 382
    shr-long v32, v10, v15

    .line 383
    .line 384
    and-long v32, v32, v28

    .line 385
    .line 386
    cmp-long v18, v32, v16

    .line 387
    .line 388
    if-nez v18, :cond_8

    .line 389
    .line 390
    and-int/lit8 v8, v8, 0x7f

    .line 391
    .line 392
    move/from16 v32, v13

    .line 393
    .line 394
    move/from16 v18, v14

    .line 395
    .line 396
    int-to-long v13, v8

    .line 397
    move-object/from16 v33, v4

    .line 398
    .line 399
    move-object/from16 v34, v5

    .line 400
    .line 401
    shl-long v4, v28, v15

    .line 402
    .line 403
    not-long v4, v4

    .line 404
    and-long/2addr v4, v10

    .line 405
    shl-long v10, v13, v15

    .line 406
    .line 407
    or-long/2addr v4, v10

    .line 408
    aput-wide v4, v1, v9

    .line 409
    .line 410
    aget-wide v4, v1, v7

    .line 411
    .line 412
    shl-long v8, v28, v12

    .line 413
    .line 414
    not-long v8, v8

    .line 415
    and-long/2addr v4, v8

    .line 416
    shl-long v8, v16, v12

    .line 417
    .line 418
    or-long/2addr v4, v8

    .line 419
    aput-wide v4, v1, v7

    .line 420
    .line 421
    aget v4, v33, v6

    .line 422
    .line 423
    aput v4, v33, v18

    .line 424
    .line 425
    aput v20, v33, v6

    .line 426
    .line 427
    aget-object v4, v34, v6

    .line 428
    .line 429
    aput-object v4, v34, v18

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    aput-object v4, v34, v6

    .line 433
    .line 434
    goto :goto_5

    .line 435
    :cond_8
    move-object/from16 v33, v4

    .line 436
    .line 437
    move-object/from16 v34, v5

    .line 438
    .line 439
    move/from16 v32, v13

    .line 440
    .line 441
    move/from16 v18, v14

    .line 442
    .line 443
    and-int/lit8 v4, v8, 0x7f

    .line 444
    .line 445
    int-to-long v4, v4

    .line 446
    shl-long v7, v28, v15

    .line 447
    .line 448
    not-long v7, v7

    .line 449
    and-long/2addr v7, v10

    .line 450
    shl-long/2addr v4, v15

    .line 451
    or-long/2addr v4, v7

    .line 452
    aput-wide v4, v1, v9

    .line 453
    .line 454
    aget v4, v33, v18

    .line 455
    .line 456
    aget v5, v33, v6

    .line 457
    .line 458
    aput v5, v33, v18

    .line 459
    .line 460
    aput v4, v33, v6

    .line 461
    .line 462
    aget-object v4, v34, v18

    .line 463
    .line 464
    aget-object v5, v34, v6

    .line 465
    .line 466
    aput-object v5, v34, v18

    .line 467
    .line 468
    aput-object v4, v34, v6

    .line 469
    .line 470
    add-int/lit8 v6, v6, -0x1

    .line 471
    .line 472
    :goto_5
    array-length v4, v1

    .line 473
    add-int/lit8 v4, v4, -0x1

    .line 474
    .line 475
    aget-wide v7, v1, v20

    .line 476
    .line 477
    and-long v7, v7, v30

    .line 478
    .line 479
    or-long v7, v7, v23

    .line 480
    .line 481
    aput-wide v7, v1, v4

    .line 482
    .line 483
    add-int/lit8 v6, v6, 0x1

    .line 484
    .line 485
    move-wide/from16 v10, v30

    .line 486
    .line 487
    move/from16 v13, v32

    .line 488
    .line 489
    move-object/from16 v4, v33

    .line 490
    .line 491
    move-object/from16 v5, v34

    .line 492
    .line 493
    goto/16 :goto_3

    .line 494
    .line 495
    :cond_9
    move/from16 v32, v13

    .line 496
    .line 497
    iget v1, v0, La/gkx;->d:I

    .line 498
    .line 499
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 500
    .line 501
    .line 502
    move-result v1

    .line 503
    iget v2, v0, La/gkx;->e:I

    .line 504
    .line 505
    sub-int/2addr v1, v2

    .line 506
    iput v1, v0, La/ey40;->f:I

    .line 507
    .line 508
    goto/16 :goto_a

    .line 509
    .line 510
    :cond_a
    :goto_6
    move-wide/from16 v28, v7

    .line 511
    .line 512
    move-wide/from16 v26, v10

    .line 513
    .line 514
    move/from16 v32, v13

    .line 515
    .line 516
    const/16 p1, 0x7

    .line 517
    .line 518
    goto :goto_7

    .line 519
    :cond_b
    const-wide/16 v16, 0x80

    .line 520
    .line 521
    goto :goto_6

    .line 522
    :goto_7
    iget v1, v0, La/gkx;->d:I

    .line 523
    .line 524
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 525
    .line 526
    .line 527
    move-result v1

    .line 528
    iget-object v2, v0, La/gkx;->a:[J

    .line 529
    .line 530
    iget-object v4, v0, La/gkx;->b:[I

    .line 531
    .line 532
    iget-object v5, v0, La/gkx;->c:[Ljava/lang/Object;

    .line 533
    .line 534
    iget v6, v0, La/gkx;->d:I

    .line 535
    .line 536
    invoke-virtual {v0, v1}, La/ey40;->f(I)V

    .line 537
    .line 538
    .line 539
    iget-object v1, v0, La/gkx;->a:[J

    .line 540
    .line 541
    iget-object v7, v0, La/gkx;->b:[I

    .line 542
    .line 543
    iget-object v8, v0, La/gkx;->c:[Ljava/lang/Object;

    .line 544
    .line 545
    iget v9, v0, La/gkx;->d:I

    .line 546
    .line 547
    move/from16 v10, v20

    .line 548
    .line 549
    :goto_8
    if-ge v10, v6, :cond_d

    .line 550
    .line 551
    shr-int/lit8 v11, v10, 0x3

    .line 552
    .line 553
    aget-wide v11, v2, v11

    .line 554
    .line 555
    and-int/lit8 v13, v10, 0x7

    .line 556
    .line 557
    shl-int/lit8 v13, v13, 0x3

    .line 558
    .line 559
    shr-long/2addr v11, v13

    .line 560
    and-long v11, v11, v28

    .line 561
    .line 562
    cmp-long v11, v11, v16

    .line 563
    .line 564
    if-gez v11, :cond_c

    .line 565
    .line 566
    aget v11, v4, v10

    .line 567
    .line 568
    invoke-static {v11}, Ljava/lang/Integer;->hashCode(I)I

    .line 569
    .line 570
    .line 571
    move-result v12

    .line 572
    ushr-int/lit8 v13, v12, 0x10

    .line 573
    .line 574
    xor-int/2addr v12, v13

    .line 575
    mul-int v12, v12, v19

    .line 576
    .line 577
    ushr-int/lit8 v13, v12, 0x10

    .line 578
    .line 579
    xor-int/2addr v12, v13

    .line 580
    ushr-int/lit8 v13, v12, 0x7

    .line 581
    .line 582
    invoke-virtual {v0, v13}, La/ey40;->d(I)I

    .line 583
    .line 584
    .line 585
    move-result v13

    .line 586
    and-int/lit8 v12, v12, 0x7f

    .line 587
    .line 588
    int-to-long v14, v12

    .line 589
    shr-int/lit8 v12, v13, 0x3

    .line 590
    .line 591
    and-int/lit8 v18, v13, 0x7

    .line 592
    .line 593
    shl-int/lit8 v18, v18, 0x3

    .line 594
    .line 595
    aget-wide v21, v1, v12

    .line 596
    .line 597
    move-object/from16 v24, v1

    .line 598
    .line 599
    move-object/from16 v23, v2

    .line 600
    .line 601
    shl-long v1, v28, v18

    .line 602
    .line 603
    not-long v1, v1

    .line 604
    and-long v1, v21, v1

    .line 605
    .line 606
    shl-long v14, v14, v18

    .line 607
    .line 608
    or-long/2addr v1, v14

    .line 609
    aput-wide v1, v24, v12

    .line 610
    .line 611
    add-int/lit8 v12, v13, -0x7

    .line 612
    .line 613
    and-int/2addr v12, v9

    .line 614
    and-int/lit8 v14, v9, 0x7

    .line 615
    .line 616
    add-int/2addr v12, v14

    .line 617
    shr-int/lit8 v12, v12, 0x3

    .line 618
    .line 619
    aput-wide v1, v24, v12

    .line 620
    .line 621
    aput v11, v7, v13

    .line 622
    .line 623
    aget-object v1, v5, v10

    .line 624
    .line 625
    aput-object v1, v8, v13

    .line 626
    .line 627
    goto :goto_9

    .line 628
    :cond_c
    move-object/from16 v24, v1

    .line 629
    .line 630
    move-object/from16 v23, v2

    .line 631
    .line 632
    :goto_9
    add-int/lit8 v10, v10, 0x1

    .line 633
    .line 634
    move-object/from16 v2, v23

    .line 635
    .line 636
    move-object/from16 v1, v24

    .line 637
    .line 638
    goto :goto_8

    .line 639
    :cond_d
    :goto_a
    invoke-virtual {v0, v3}, La/ey40;->d(I)I

    .line 640
    .line 641
    .line 642
    move-result v1

    .line 643
    :goto_b
    iget v2, v0, La/gkx;->e:I

    .line 644
    .line 645
    add-int/lit8 v2, v2, 0x1

    .line 646
    .line 647
    iput v2, v0, La/gkx;->e:I

    .line 648
    .line 649
    iget v2, v0, La/ey40;->f:I

    .line 650
    .line 651
    iget-object v3, v0, La/gkx;->a:[J

    .line 652
    .line 653
    shr-int/lit8 v4, v1, 0x3

    .line 654
    .line 655
    aget-wide v5, v3, v4

    .line 656
    .line 657
    and-int/lit8 v7, v1, 0x7

    .line 658
    .line 659
    shl-int/lit8 v7, v7, 0x3

    .line 660
    .line 661
    shr-long v8, v5, v7

    .line 662
    .line 663
    and-long v8, v8, v28

    .line 664
    .line 665
    cmp-long v8, v8, v16

    .line 666
    .line 667
    if-nez v8, :cond_e

    .line 668
    .line 669
    goto :goto_c

    .line 670
    :cond_e
    move/from16 v32, v20

    .line 671
    .line 672
    :goto_c
    sub-int v2, v2, v32

    .line 673
    .line 674
    iput v2, v0, La/ey40;->f:I

    .line 675
    .line 676
    iget v0, v0, La/gkx;->d:I

    .line 677
    .line 678
    shl-long v8, v28, v7

    .line 679
    .line 680
    not-long v8, v8

    .line 681
    and-long/2addr v5, v8

    .line 682
    shl-long v7, v26, v7

    .line 683
    .line 684
    or-long/2addr v5, v7

    .line 685
    aput-wide v5, v3, v4

    .line 686
    .line 687
    add-int/lit8 v2, v1, -0x7

    .line 688
    .line 689
    and-int/2addr v2, v0

    .line 690
    and-int/lit8 v0, v0, 0x7

    .line 691
    .line 692
    add-int/2addr v2, v0

    .line 693
    shr-int/lit8 v0, v2, 0x3

    .line 694
    .line 695
    aput-wide v5, v3, v0

    .line 696
    .line 697
    not-int v0, v1

    .line 698
    return v0

    .line 699
    :cond_f
    move/from16 v25, v6

    .line 700
    .line 701
    add-int/lit8 v7, v18, 0x8

    .line 702
    .line 703
    add-int/2addr v5, v7

    .line 704
    and-int/2addr v5, v4

    .line 705
    move/from16 v2, v19

    .line 706
    .line 707
    goto/16 :goto_0
.end method

.method public final f(I)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-lez p1, :cond_0

    .line 3
    .line 4
    invoke-static {p1}, La/u1h0;->c(I)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    const/4 v1, 0x7

    .line 9
    invoke-static {v1, p1}, Ljava/lang/Math;->max(II)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move p1, v0

    .line 15
    :goto_0
    iput p1, p0, La/gkx;->d:I

    .line 16
    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    sget-object v0, La/u1h0;->a:[J

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    add-int/lit8 v1, p1, 0xf

    .line 23
    .line 24
    and-int/lit8 v1, v1, -0x8

    .line 25
    .line 26
    shr-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    new-array v2, v1, [J

    .line 29
    .line 30
    const-wide v3, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0, v1, v3, v4}, Ljava/util/Arrays;->fill([JIIJ)V

    .line 36
    .line 37
    .line 38
    move-object v0, v2

    .line 39
    :goto_1
    iput-object v0, p0, La/gkx;->a:[J

    .line 40
    .line 41
    shr-int/lit8 v1, p1, 0x3

    .line 42
    .line 43
    and-int/lit8 v2, p1, 0x7

    .line 44
    .line 45
    shl-int/lit8 v2, v2, 0x3

    .line 46
    .line 47
    aget-wide v3, v0, v1

    .line 48
    .line 49
    const-wide/16 v5, 0xff

    .line 50
    .line 51
    shl-long/2addr v5, v2

    .line 52
    not-long v7, v5

    .line 53
    and-long v2, v3, v7

    .line 54
    .line 55
    or-long/2addr v2, v5

    .line 56
    aput-wide v2, v0, v1

    .line 57
    .line 58
    iget v0, p0, La/gkx;->d:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/gkx;->e:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/ey40;->f:I

    .line 68
    .line 69
    new-array v0, p1, [I

    .line 70
    .line 71
    iput-object v0, p0, La/gkx;->b:[I

    .line 72
    .line 73
    new-array p1, p1, [Ljava/lang/Object;

    .line 74
    .line 75
    iput-object p1, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 76
    .line 77
    return-void
.end method

.method public final g(ILjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, La/ey40;->e(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    not-int v0, v0

    .line 8
    :cond_0
    iget-object v1, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 9
    .line 10
    aget-object v2, v1, v0

    .line 11
    .line 12
    iget-object p0, p0, La/gkx;->b:[I

    .line 13
    .line 14
    aput p1, p0, v0

    .line 15
    .line 16
    aput-object p2, v1, v0

    .line 17
    .line 18
    return-void
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 13

    .line 1
    invoke-static {p1}, Ljava/lang/Integer;->hashCode(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    ushr-int/lit8 v1, v0, 0x10

    .line 6
    .line 7
    xor-int/2addr v0, v1

    .line 8
    const v1, -0x3361d2af    # -8.293031E7f

    .line 9
    .line 10
    .line 11
    mul-int/2addr v0, v1

    .line 12
    ushr-int/lit8 v1, v0, 0x10

    .line 13
    .line 14
    xor-int/2addr v0, v1

    .line 15
    and-int/lit8 v1, v0, 0x7f

    .line 16
    .line 17
    iget v2, p0, La/gkx;->d:I

    .line 18
    .line 19
    ushr-int/lit8 v0, v0, 0x7

    .line 20
    .line 21
    and-int/2addr v0, v2

    .line 22
    const/4 v3, 0x0

    .line 23
    :goto_0
    iget-object v4, p0, La/gkx;->a:[J

    .line 24
    .line 25
    shr-int/lit8 v5, v0, 0x3

    .line 26
    .line 27
    and-int/lit8 v6, v0, 0x7

    .line 28
    .line 29
    shl-int/lit8 v6, v6, 0x3

    .line 30
    .line 31
    aget-wide v7, v4, v5

    .line 32
    .line 33
    ushr-long/2addr v7, v6

    .line 34
    add-int/lit8 v5, v5, 0x1

    .line 35
    .line 36
    aget-wide v9, v4, v5

    .line 37
    .line 38
    rsub-int/lit8 v4, v6, 0x40

    .line 39
    .line 40
    shl-long v4, v9, v4

    .line 41
    .line 42
    int-to-long v9, v6

    .line 43
    neg-long v9, v9

    .line 44
    const/16 v6, 0x3f

    .line 45
    .line 46
    shr-long/2addr v9, v6

    .line 47
    and-long/2addr v4, v9

    .line 48
    or-long/2addr v4, v7

    .line 49
    int-to-long v6, v1

    .line 50
    const-wide v8, 0x101010101010101L

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    mul-long/2addr v6, v8

    .line 56
    xor-long/2addr v6, v4

    .line 57
    sub-long v8, v6, v8

    .line 58
    .line 59
    not-long v6, v6

    .line 60
    and-long/2addr v6, v8

    .line 61
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    and-long/2addr v6, v8

    .line 67
    :goto_1
    const-wide/16 v10, 0x0

    .line 68
    .line 69
    cmp-long v12, v6, v10

    .line 70
    .line 71
    if-eqz v12, :cond_1

    .line 72
    .line 73
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 74
    .line 75
    .line 76
    move-result v10

    .line 77
    shr-int/lit8 v10, v10, 0x3

    .line 78
    .line 79
    add-int/2addr v10, v0

    .line 80
    and-int/2addr v10, v2

    .line 81
    iget-object v11, p0, La/gkx;->b:[I

    .line 82
    .line 83
    aget v11, v11, v10

    .line 84
    .line 85
    if-ne v11, p1, :cond_0

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_0
    const-wide/16 v10, 0x1

    .line 89
    .line 90
    sub-long v10, v6, v10

    .line 91
    .line 92
    and-long/2addr v6, v10

    .line 93
    goto :goto_1

    .line 94
    :cond_1
    not-long v6, v4

    .line 95
    const/4 v12, 0x6

    .line 96
    shl-long/2addr v6, v12

    .line 97
    and-long/2addr v4, v6

    .line 98
    and-long/2addr v4, v8

    .line 99
    cmp-long v4, v4, v10

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    const/4 v10, -0x1

    .line 104
    :goto_2
    if-ltz v10, :cond_2

    .line 105
    .line 106
    invoke-virtual {p0, v10}, La/ey40;->i(I)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0

    .line 111
    :cond_2
    const/4 p0, 0x0

    .line 112
    return-object p0

    .line 113
    :cond_3
    add-int/lit8 v3, v3, 0x8

    .line 114
    .line 115
    add-int/2addr v0, v3

    .line 116
    and-int/2addr v0, v2

    .line 117
    goto :goto_0
.end method

.method public final i(I)Ljava/lang/Object;
    .locals 8

    .line 1
    iget v0, p0, La/gkx;->e:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, La/gkx;->e:I

    .line 6
    .line 7
    iget-object v0, p0, La/gkx;->a:[J

    .line 8
    .line 9
    iget v1, p0, La/gkx;->d:I

    .line 10
    .line 11
    shr-int/lit8 v2, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v3, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v3, v3, 0x3

    .line 16
    .line 17
    aget-wide v4, v0, v2

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    .line 21
    shl-long/2addr v6, v3

    .line 22
    not-long v6, v6

    .line 23
    and-long/2addr v4, v6

    .line 24
    const-wide/16 v6, 0xfe

    .line 25
    .line 26
    shl-long/2addr v6, v3

    .line 27
    or-long v3, v4, v6

    .line 28
    .line 29
    aput-wide v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v2, p1, -0x7

    .line 32
    .line 33
    and-int/2addr v2, v1

    .line 34
    and-int/lit8 v1, v1, 0x7

    .line 35
    .line 36
    add-int/2addr v2, v1

    .line 37
    shr-int/lit8 v1, v2, 0x3

    .line 38
    .line 39
    aput-wide v3, v0, v1

    .line 40
    .line 41
    iget-object p0, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 42
    .line 43
    aget-object v0, p0, p1

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    aput-object v1, p0, p1

    .line 47
    .line 48
    return-object v0
.end method

.method public final j(ILjava/lang/Object;)V
    .locals 2

    .line 1
    invoke-virtual {p0, p1}, La/ey40;->e(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gez v0, :cond_0

    .line 6
    .line 7
    not-int v0, v0

    .line 8
    :cond_0
    iget-object v1, p0, La/gkx;->b:[I

    .line 9
    .line 10
    aput p1, v1, v0

    .line 11
    .line 12
    iget-object p0, p0, La/gkx;->c:[Ljava/lang/Object;

    .line 13
    .line 14
    aput-object p2, p0, v0

    .line 15
    .line 16
    return-void
.end method
