.class public final La/ivu0;
.super La/orm0;
.source "SourceFile"


# instance fields
.field public n:La/fht0;

.field public o:I

.field public p:Z

.field public q:La/jvu0;

.field public r:La/ikt0;


# virtual methods
.method public final a(J)V
    .locals 2

    .line 1
    iput-wide p1, p0, La/orm0;->g:J

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long p1, p1, v0

    .line 6
    .line 7
    const/4 p2, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move p1, p2

    .line 13
    :goto_0
    iput-boolean p1, p0, La/ivu0;->p:Z

    .line 14
    .line 15
    iget-object p1, p0, La/ivu0;->q:La/jvu0;

    .line 16
    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    iget p2, p1, La/jvu0;->e:I

    .line 20
    .line 21
    :cond_1
    iput p2, p0, La/ivu0;->o:I

    .line 22
    .line 23
    return-void
.end method

.method public final b(La/fq80;)J
    .locals 12

    .line 1
    iget-object v0, p1, La/fq80;->a:[B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    aget-byte v0, v0, v1

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    and-int/2addr v0, v2

    .line 8
    if-ne v0, v2, :cond_0

    .line 9
    .line 10
    const-wide/16 p0, -0x1

    .line 11
    .line 12
    return-wide p0

    .line 13
    :cond_0
    iget-object v0, p0, La/ivu0;->n:La/fht0;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v3, p1, La/fq80;->a:[B

    .line 19
    .line 20
    aget-byte v3, v3, v1

    .line 21
    .line 22
    iget-object v4, v0, La/fht0;->a:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v4, La/jvu0;

    .line 25
    .line 26
    iget-object v0, v0, La/fht0;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, [La/nqd;

    .line 29
    .line 30
    array-length v5, v0

    .line 31
    sub-int/2addr v5, v2

    .line 32
    invoke-static {v5}, La/dnm0;->o(I)I

    .line 33
    .line 34
    .line 35
    move-result v5

    .line 36
    shr-int/2addr v3, v2

    .line 37
    const/16 v6, 0xff

    .line 38
    .line 39
    const/16 v7, 0x8

    .line 40
    .line 41
    rsub-int/lit8 v5, v5, 0x8

    .line 42
    .line 43
    ushr-int v5, v6, v5

    .line 44
    .line 45
    and-int/2addr v3, v5

    .line 46
    aget-object v0, v0, v3

    .line 47
    .line 48
    iget-boolean v0, v0, La/nqd;->b:Z

    .line 49
    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget v0, v4, La/jvu0;->f:I

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget v0, v4, La/jvu0;->e:I

    .line 56
    .line 57
    :goto_0
    iget v3, p0, La/ivu0;->o:I

    .line 58
    .line 59
    iget-boolean v4, p0, La/ivu0;->p:Z

    .line 60
    .line 61
    if-eqz v4, :cond_2

    .line 62
    .line 63
    add-int/2addr v3, v0

    .line 64
    div-int/lit8 v1, v3, 0x4

    .line 65
    .line 66
    :cond_2
    int-to-long v3, v1

    .line 67
    iget-object v1, p1, La/fq80;->a:[B

    .line 68
    .line 69
    array-length v5, v1

    .line 70
    iget v6, p1, La/fq80;->c:I

    .line 71
    .line 72
    add-int/lit8 v6, v6, 0x4

    .line 73
    .line 74
    if-ge v5, v6, :cond_3

    .line 75
    .line 76
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    array-length v5, v1

    .line 81
    invoke-virtual {p1, v1, v5}, La/fq80;->K([BI)V

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_3
    invoke-virtual {p1, v6}, La/fq80;->L(I)V

    .line 86
    .line 87
    .line 88
    :goto_1
    iget-object v1, p1, La/fq80;->a:[B

    .line 89
    .line 90
    iget p1, p1, La/fq80;->c:I

    .line 91
    .line 92
    add-int/lit8 v5, p1, -0x4

    .line 93
    .line 94
    const-wide/16 v8, 0xff

    .line 95
    .line 96
    and-long v10, v3, v8

    .line 97
    .line 98
    long-to-int v6, v10

    .line 99
    int-to-byte v6, v6

    .line 100
    aput-byte v6, v1, v5

    .line 101
    .line 102
    add-int/lit8 v5, p1, -0x3

    .line 103
    .line 104
    ushr-long v6, v3, v7

    .line 105
    .line 106
    and-long/2addr v6, v8

    .line 107
    long-to-int v6, v6

    .line 108
    int-to-byte v6, v6

    .line 109
    aput-byte v6, v1, v5

    .line 110
    .line 111
    add-int/lit8 v5, p1, -0x2

    .line 112
    .line 113
    const/16 v6, 0x10

    .line 114
    .line 115
    ushr-long v6, v3, v6

    .line 116
    .line 117
    and-long/2addr v6, v8

    .line 118
    long-to-int v6, v6

    .line 119
    int-to-byte v6, v6

    .line 120
    aput-byte v6, v1, v5

    .line 121
    .line 122
    sub-int/2addr p1, v2

    .line 123
    const/16 v5, 0x18

    .line 124
    .line 125
    ushr-long v5, v3, v5

    .line 126
    .line 127
    and-long/2addr v5, v8

    .line 128
    long-to-int v5, v5

    .line 129
    int-to-byte v5, v5

    .line 130
    aput-byte v5, v1, p1

    .line 131
    .line 132
    iput-boolean v2, p0, La/ivu0;->p:Z

    .line 133
    .line 134
    iput v0, p0, La/ivu0;->o:I

    .line 135
    .line 136
    return-wide v3
.end method

.method public final c(La/fq80;JLa/fck0;)Z
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, La/ivu0;->n:La/fht0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    iget-object v0, v2, La/fck0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Landroidx/media3/common/b;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return v4

    .line 20
    :cond_0
    iget-object v3, v0, La/ivu0;->q:La/jvu0;

    .line 21
    .line 22
    const/4 v5, 0x1

    .line 23
    const/4 v6, 0x4

    .line 24
    if-nez v3, :cond_3

    .line 25
    .line 26
    invoke-static {v5, v1, v4}, La/dnm0;->s(ILa/fq80;Z)Z

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, La/fq80;->r()I

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, La/fq80;->z()I

    .line 33
    .line 34
    .line 35
    move-result v10

    .line 36
    invoke-virtual {v1}, La/fq80;->r()I

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    invoke-virtual {v1}, La/fq80;->o()I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-gtz v3, :cond_1

    .line 45
    .line 46
    const/4 v12, -0x1

    .line 47
    goto :goto_0

    .line 48
    :cond_1
    move v12, v3

    .line 49
    :goto_0
    invoke-virtual {v1}, La/fq80;->o()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-gtz v3, :cond_2

    .line 54
    .line 55
    const/4 v13, -0x1

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    move v13, v3

    .line 58
    :goto_1
    invoke-virtual {v1}, La/fq80;->o()I

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1}, La/fq80;->z()I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    and-int/lit8 v4, v3, 0xf

    .line 66
    .line 67
    int-to-double v14, v4

    .line 68
    const-wide/high16 v8, 0x4000000000000000L    # 2.0

    .line 69
    .line 70
    invoke-static {v8, v9, v14, v15}, Ljava/lang/Math;->pow(DD)D

    .line 71
    .line 72
    .line 73
    move-result-wide v14

    .line 74
    double-to-int v14, v14

    .line 75
    and-int/lit16 v3, v3, 0xf0

    .line 76
    .line 77
    shr-int/2addr v3, v6

    .line 78
    int-to-double v3, v3

    .line 79
    invoke-static {v8, v9, v3, v4}, Ljava/lang/Math;->pow(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v3

    .line 83
    double-to-int v15, v3

    .line 84
    invoke-virtual {v1}, La/fq80;->z()I

    .line 85
    .line 86
    .line 87
    iget-object v3, v1, La/fq80;->a:[B

    .line 88
    .line 89
    iget v1, v1, La/fq80;->c:I

    .line 90
    .line 91
    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 92
    .line 93
    .line 94
    move-result-object v16

    .line 95
    new-instance v9, La/jvu0;

    .line 96
    .line 97
    invoke-direct/range {v9 .. v16}, La/jvu0;-><init>(IIIIII[B)V

    .line 98
    .line 99
    .line 100
    iput-object v9, v0, La/ivu0;->q:La/jvu0;

    .line 101
    .line 102
    :goto_2
    const/4 v8, 0x0

    .line 103
    goto/16 :goto_1c

    .line 104
    .line 105
    :cond_3
    iget-object v8, v0, La/ivu0;->r:La/ikt0;

    .line 106
    .line 107
    if-nez v8, :cond_4

    .line 108
    .line 109
    invoke-static {v1, v5, v5}, La/dnm0;->p(La/fq80;ZZ)La/ikt0;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    iput-object v1, v0, La/ivu0;->r:La/ikt0;

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_4
    iget v9, v1, La/fq80;->c:I

    .line 117
    .line 118
    new-array v10, v9, [B

    .line 119
    .line 120
    iget-object v11, v1, La/fq80;->a:[B

    .line 121
    .line 122
    invoke-static {v11, v4, v10, v4, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 123
    .line 124
    .line 125
    iget-short v9, v3, La/jvu0;->a:S

    .line 126
    .line 127
    const/4 v11, 0x5

    .line 128
    invoke-static {v11, v1, v4}, La/dnm0;->s(ILa/fq80;Z)Z

    .line 129
    .line 130
    .line 131
    invoke-virtual {v1}, La/fq80;->z()I

    .line 132
    .line 133
    .line 134
    move-result v12

    .line 135
    add-int/2addr v12, v5

    .line 136
    new-instance v13, La/q8b;

    .line 137
    .line 138
    iget-object v14, v1, La/fq80;->a:[B

    .line 139
    .line 140
    invoke-direct {v13, v14}, La/q8b;-><init>([B)V

    .line 141
    .line 142
    .line 143
    iget v1, v1, La/fq80;->b:I

    .line 144
    .line 145
    const/16 v14, 0x8

    .line 146
    .line 147
    mul-int/2addr v1, v14

    .line 148
    invoke-virtual {v13, v1}, La/q8b;->o(I)V

    .line 149
    .line 150
    .line 151
    move v1, v4

    .line 152
    :goto_3
    const/16 v15, 0x18

    .line 153
    .line 154
    const/4 v4, 0x2

    .line 155
    const/16 v7, 0x10

    .line 156
    .line 157
    if-ge v1, v12, :cond_f

    .line 158
    .line 159
    move/from16 p1, v14

    .line 160
    .line 161
    invoke-virtual {v13, v15}, La/q8b;->g(I)I

    .line 162
    .line 163
    .line 164
    move-result v14

    .line 165
    const v5, 0x564342

    .line 166
    .line 167
    .line 168
    if-ne v14, v5, :cond_e

    .line 169
    .line 170
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 171
    .line 172
    .line 173
    move-result v5

    .line 174
    invoke-virtual {v13, v15}, La/q8b;->g(I)I

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 179
    .line 180
    .line 181
    move-result v14

    .line 182
    if-nez v14, :cond_7

    .line 183
    .line 184
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 185
    .line 186
    .line 187
    move-result v14

    .line 188
    const/4 v15, 0x0

    .line 189
    :goto_4
    if-ge v15, v7, :cond_8

    .line 190
    .line 191
    if-eqz v14, :cond_5

    .line 192
    .line 193
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 194
    .line 195
    .line 196
    move-result v18

    .line 197
    if-eqz v18, :cond_6

    .line 198
    .line 199
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 200
    .line 201
    .line 202
    goto :goto_5

    .line 203
    :cond_5
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 204
    .line 205
    .line 206
    :cond_6
    :goto_5
    add-int/lit8 v15, v15, 0x1

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_7
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 210
    .line 211
    .line 212
    const/4 v14, 0x0

    .line 213
    :goto_6
    if-ge v14, v7, :cond_8

    .line 214
    .line 215
    sub-int v15, v7, v14

    .line 216
    .line 217
    invoke-static {v15}, La/dnm0;->o(I)I

    .line 218
    .line 219
    .line 220
    move-result v15

    .line 221
    invoke-virtual {v13, v15}, La/q8b;->g(I)I

    .line 222
    .line 223
    .line 224
    move-result v15

    .line 225
    add-int/2addr v14, v15

    .line 226
    goto :goto_6

    .line 227
    :cond_8
    invoke-virtual {v13, v6}, La/q8b;->g(I)I

    .line 228
    .line 229
    .line 230
    move-result v14

    .line 231
    if-gt v14, v4, :cond_d

    .line 232
    .line 233
    const/4 v15, 0x1

    .line 234
    if-eq v14, v15, :cond_9

    .line 235
    .line 236
    if-ne v14, v4, :cond_c

    .line 237
    .line 238
    :cond_9
    const/16 v4, 0x20

    .line 239
    .line 240
    invoke-virtual {v13, v4}, La/q8b;->o(I)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v13, v4}, La/q8b;->o(I)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v13, v6}, La/q8b;->g(I)I

    .line 247
    .line 248
    .line 249
    move-result v4

    .line 250
    add-int/2addr v4, v15

    .line 251
    invoke-virtual {v13, v15}, La/q8b;->o(I)V

    .line 252
    .line 253
    .line 254
    if-ne v14, v15, :cond_b

    .line 255
    .line 256
    if-eqz v5, :cond_a

    .line 257
    .line 258
    int-to-long v14, v7

    .line 259
    int-to-long v6, v5

    .line 260
    long-to-double v14, v14

    .line 261
    const-wide/high16 v19, 0x3ff0000000000000L    # 1.0

    .line 262
    .line 263
    long-to-double v5, v6

    .line 264
    div-double v5, v19, v5

    .line 265
    .line 266
    invoke-static {v14, v15, v5, v6}, Ljava/lang/Math;->pow(DD)D

    .line 267
    .line 268
    .line 269
    move-result-wide v5

    .line 270
    invoke-static {v5, v6}, Ljava/lang/Math;->floor(D)D

    .line 271
    .line 272
    .line 273
    move-result-wide v5

    .line 274
    double-to-long v5, v5

    .line 275
    goto :goto_7

    .line 276
    :cond_a
    const-wide/16 v5, 0x0

    .line 277
    .line 278
    goto :goto_7

    .line 279
    :cond_b
    int-to-long v6, v7

    .line 280
    int-to-long v14, v5

    .line 281
    mul-long v5, v6, v14

    .line 282
    .line 283
    :goto_7
    int-to-long v14, v4

    .line 284
    mul-long/2addr v5, v14

    .line 285
    long-to-int v4, v5

    .line 286
    invoke-virtual {v13, v4}, La/q8b;->o(I)V

    .line 287
    .line 288
    .line 289
    :cond_c
    add-int/lit8 v1, v1, 0x1

    .line 290
    .line 291
    move/from16 v14, p1

    .line 292
    .line 293
    const/4 v4, 0x0

    .line 294
    const/4 v5, 0x1

    .line 295
    const/4 v6, 0x4

    .line 296
    goto/16 :goto_3

    .line 297
    .line 298
    :cond_d
    new-instance v0, Ljava/lang/StringBuilder;

    .line 299
    .line 300
    const-string v1, "lookup type greater than 2 not decodable: "

    .line 301
    .line 302
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    const/4 v1, 0x0

    .line 313
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 314
    .line 315
    .line 316
    move-result-object v0

    .line 317
    throw v0

    .line 318
    :cond_e
    const/4 v1, 0x0

    .line 319
    new-instance v0, Ljava/lang/StringBuilder;

    .line 320
    .line 321
    const-string v2, "expected code book to start with [0x56, 0x43, 0x42] at "

    .line 322
    .line 323
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 324
    .line 325
    .line 326
    iget v2, v13, La/q8b;->d:I

    .line 327
    .line 328
    mul-int/lit8 v2, v2, 0x8

    .line 329
    .line 330
    iget v3, v13, La/q8b;->e:I

    .line 331
    .line 332
    add-int/2addr v2, v3

    .line 333
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v0

    .line 340
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 341
    .line 342
    .line 343
    move-result-object v0

    .line 344
    throw v0

    .line 345
    :cond_f
    move/from16 p1, v14

    .line 346
    .line 347
    const/4 v1, 0x6

    .line 348
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 349
    .line 350
    .line 351
    move-result v5

    .line 352
    const/16 v17, 0x1

    .line 353
    .line 354
    add-int/lit8 v5, v5, 0x1

    .line 355
    .line 356
    const/4 v6, 0x0

    .line 357
    :goto_8
    if-ge v6, v5, :cond_11

    .line 358
    .line 359
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 360
    .line 361
    .line 362
    move-result v12

    .line 363
    if-nez v12, :cond_10

    .line 364
    .line 365
    add-int/lit8 v6, v6, 0x1

    .line 366
    .line 367
    goto :goto_8

    .line 368
    :cond_10
    const-string v0, "placeholder of time domain transforms not zeroed out"

    .line 369
    .line 370
    const/4 v1, 0x0

    .line 371
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    throw v0

    .line 376
    :cond_11
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 377
    .line 378
    .line 379
    move-result v5

    .line 380
    const/4 v6, 0x1

    .line 381
    add-int/2addr v5, v6

    .line 382
    const/4 v12, 0x0

    .line 383
    :goto_9
    const/4 v14, 0x3

    .line 384
    if-ge v12, v5, :cond_1b

    .line 385
    .line 386
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 387
    .line 388
    .line 389
    move-result v15

    .line 390
    if-eqz v15, :cond_19

    .line 391
    .line 392
    if-ne v15, v6, :cond_18

    .line 393
    .line 394
    invoke-virtual {v13, v11}, La/q8b;->g(I)I

    .line 395
    .line 396
    .line 397
    move-result v6

    .line 398
    new-array v15, v6, [I

    .line 399
    .line 400
    const/4 v1, -0x1

    .line 401
    const/4 v11, 0x0

    .line 402
    :goto_a
    if-ge v11, v6, :cond_13

    .line 403
    .line 404
    const/4 v7, 0x4

    .line 405
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 406
    .line 407
    .line 408
    move-result v4

    .line 409
    aput v4, v15, v11

    .line 410
    .line 411
    if-le v4, v1, :cond_12

    .line 412
    .line 413
    move v1, v4

    .line 414
    :cond_12
    add-int/lit8 v11, v11, 0x1

    .line 415
    .line 416
    const/4 v4, 0x2

    .line 417
    const/16 v7, 0x10

    .line 418
    .line 419
    goto :goto_a

    .line 420
    :cond_13
    add-int/lit8 v1, v1, 0x1

    .line 421
    .line 422
    new-array v4, v1, [I

    .line 423
    .line 424
    const/4 v7, 0x0

    .line 425
    :goto_b
    if-ge v7, v1, :cond_16

    .line 426
    .line 427
    invoke-virtual {v13, v14}, La/q8b;->g(I)I

    .line 428
    .line 429
    .line 430
    move-result v11

    .line 431
    const/16 v17, 0x1

    .line 432
    .line 433
    add-int/lit8 v11, v11, 0x1

    .line 434
    .line 435
    aput v11, v4, v7

    .line 436
    .line 437
    const/4 v11, 0x2

    .line 438
    invoke-virtual {v13, v11}, La/q8b;->g(I)I

    .line 439
    .line 440
    .line 441
    move-result v21

    .line 442
    move/from16 v11, p1

    .line 443
    .line 444
    if-lez v21, :cond_14

    .line 445
    .line 446
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 447
    .line 448
    .line 449
    :cond_14
    move/from16 v22, v1

    .line 450
    .line 451
    const/4 v14, 0x0

    .line 452
    :goto_c
    shl-int v1, v17, v21

    .line 453
    .line 454
    if-ge v14, v1, :cond_15

    .line 455
    .line 456
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 457
    .line 458
    .line 459
    add-int/lit8 v14, v14, 0x1

    .line 460
    .line 461
    const/16 v11, 0x8

    .line 462
    .line 463
    const/16 v17, 0x1

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_15
    add-int/lit8 v7, v7, 0x1

    .line 467
    .line 468
    move/from16 v1, v22

    .line 469
    .line 470
    const/16 p1, 0x8

    .line 471
    .line 472
    const/4 v14, 0x3

    .line 473
    goto :goto_b

    .line 474
    :cond_16
    const/4 v11, 0x2

    .line 475
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 476
    .line 477
    .line 478
    const/4 v7, 0x4

    .line 479
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 480
    .line 481
    .line 482
    move-result v1

    .line 483
    const/4 v7, 0x0

    .line 484
    const/4 v11, 0x0

    .line 485
    const/4 v14, 0x0

    .line 486
    :goto_d
    if-ge v7, v6, :cond_1a

    .line 487
    .line 488
    aget v21, v15, v7

    .line 489
    .line 490
    aget v21, v4, v21

    .line 491
    .line 492
    add-int v11, v11, v21

    .line 493
    .line 494
    :goto_e
    if-ge v14, v11, :cond_17

    .line 495
    .line 496
    invoke-virtual {v13, v1}, La/q8b;->o(I)V

    .line 497
    .line 498
    .line 499
    add-int/lit8 v14, v14, 0x1

    .line 500
    .line 501
    goto :goto_e

    .line 502
    :cond_17
    add-int/lit8 v7, v7, 0x1

    .line 503
    .line 504
    goto :goto_d

    .line 505
    :cond_18
    new-instance v0, Ljava/lang/StringBuilder;

    .line 506
    .line 507
    const-string v1, "floor type greater than 1 not decodable: "

    .line 508
    .line 509
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 510
    .line 511
    .line 512
    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 513
    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const/4 v1, 0x0

    .line 520
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    throw v0

    .line 525
    :cond_19
    move/from16 v11, p1

    .line 526
    .line 527
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 528
    .line 529
    .line 530
    const/16 v1, 0x10

    .line 531
    .line 532
    invoke-virtual {v13, v1}, La/q8b;->o(I)V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v13, v1}, La/q8b;->o(I)V

    .line 536
    .line 537
    .line 538
    const/4 v1, 0x6

    .line 539
    invoke-virtual {v13, v1}, La/q8b;->o(I)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 543
    .line 544
    .line 545
    const/4 v7, 0x4

    .line 546
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 547
    .line 548
    .line 549
    move-result v1

    .line 550
    const/16 v17, 0x1

    .line 551
    .line 552
    add-int/lit8 v1, v1, 0x1

    .line 553
    .line 554
    const/4 v4, 0x0

    .line 555
    :goto_f
    if-ge v4, v1, :cond_1a

    .line 556
    .line 557
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 558
    .line 559
    .line 560
    add-int/lit8 v4, v4, 0x1

    .line 561
    .line 562
    const/16 v11, 0x8

    .line 563
    .line 564
    goto :goto_f

    .line 565
    :cond_1a
    add-int/lit8 v12, v12, 0x1

    .line 566
    .line 567
    const/16 p1, 0x8

    .line 568
    .line 569
    const/4 v1, 0x6

    .line 570
    const/4 v4, 0x2

    .line 571
    const/4 v6, 0x1

    .line 572
    const/16 v7, 0x10

    .line 573
    .line 574
    const/4 v11, 0x5

    .line 575
    const/16 v15, 0x18

    .line 576
    .line 577
    goto/16 :goto_9

    .line 578
    .line 579
    :cond_1b
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 580
    .line 581
    .line 582
    move-result v4

    .line 583
    const/16 v17, 0x1

    .line 584
    .line 585
    add-int/lit8 v4, v4, 0x1

    .line 586
    .line 587
    const/4 v5, 0x0

    .line 588
    :goto_10
    if-ge v5, v4, :cond_22

    .line 589
    .line 590
    const/16 v6, 0x10

    .line 591
    .line 592
    invoke-virtual {v13, v6}, La/q8b;->g(I)I

    .line 593
    .line 594
    .line 595
    move-result v7

    .line 596
    const/4 v11, 0x2

    .line 597
    if-gt v7, v11, :cond_21

    .line 598
    .line 599
    const/16 v6, 0x18

    .line 600
    .line 601
    invoke-virtual {v13, v6}, La/q8b;->o(I)V

    .line 602
    .line 603
    .line 604
    invoke-virtual {v13, v6}, La/q8b;->o(I)V

    .line 605
    .line 606
    .line 607
    invoke-virtual {v13, v6}, La/q8b;->o(I)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 611
    .line 612
    .line 613
    move-result v7

    .line 614
    add-int/lit8 v7, v7, 0x1

    .line 615
    .line 616
    const/16 v11, 0x8

    .line 617
    .line 618
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 619
    .line 620
    .line 621
    new-array v1, v7, [I

    .line 622
    .line 623
    const/4 v12, 0x0

    .line 624
    :goto_11
    if-ge v12, v7, :cond_1d

    .line 625
    .line 626
    const/4 v14, 0x3

    .line 627
    invoke-virtual {v13, v14}, La/q8b;->g(I)I

    .line 628
    .line 629
    .line 630
    move-result v15

    .line 631
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 632
    .line 633
    .line 634
    move-result v16

    .line 635
    const/4 v6, 0x5

    .line 636
    if-eqz v16, :cond_1c

    .line 637
    .line 638
    invoke-virtual {v13, v6}, La/q8b;->g(I)I

    .line 639
    .line 640
    .line 641
    move-result v16

    .line 642
    goto :goto_12

    .line 643
    :cond_1c
    const/16 v16, 0x0

    .line 644
    .line 645
    :goto_12
    mul-int/lit8 v16, v16, 0x8

    .line 646
    .line 647
    add-int v16, v16, v15

    .line 648
    .line 649
    aput v16, v1, v12

    .line 650
    .line 651
    add-int/lit8 v12, v12, 0x1

    .line 652
    .line 653
    const/16 v6, 0x18

    .line 654
    .line 655
    goto :goto_11

    .line 656
    :cond_1d
    const/4 v6, 0x5

    .line 657
    const/4 v14, 0x3

    .line 658
    const/4 v12, 0x0

    .line 659
    :goto_13
    if-ge v12, v7, :cond_20

    .line 660
    .line 661
    const/4 v15, 0x0

    .line 662
    :goto_14
    if-ge v15, v11, :cond_1f

    .line 663
    .line 664
    aget v16, v1, v12

    .line 665
    .line 666
    const/16 v17, 0x1

    .line 667
    .line 668
    shl-int v20, v17, v15

    .line 669
    .line 670
    and-int v16, v16, v20

    .line 671
    .line 672
    if-eqz v16, :cond_1e

    .line 673
    .line 674
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 675
    .line 676
    .line 677
    :cond_1e
    add-int/lit8 v15, v15, 0x1

    .line 678
    .line 679
    const/16 v11, 0x8

    .line 680
    .line 681
    goto :goto_14

    .line 682
    :cond_1f
    add-int/lit8 v12, v12, 0x1

    .line 683
    .line 684
    const/16 v11, 0x8

    .line 685
    .line 686
    goto :goto_13

    .line 687
    :cond_20
    add-int/lit8 v5, v5, 0x1

    .line 688
    .line 689
    const/4 v1, 0x6

    .line 690
    const/16 v17, 0x1

    .line 691
    .line 692
    goto :goto_10

    .line 693
    :cond_21
    const-string v0, "residueType greater than 2 is not decodable"

    .line 694
    .line 695
    const/4 v1, 0x0

    .line 696
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    throw v0

    .line 701
    :cond_22
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 702
    .line 703
    .line 704
    move-result v4

    .line 705
    const/16 v17, 0x1

    .line 706
    .line 707
    add-int/lit8 v4, v4, 0x1

    .line 708
    .line 709
    const/4 v1, 0x0

    .line 710
    :goto_15
    if-ge v1, v4, :cond_29

    .line 711
    .line 712
    const/16 v6, 0x10

    .line 713
    .line 714
    invoke-virtual {v13, v6}, La/q8b;->g(I)I

    .line 715
    .line 716
    .line 717
    move-result v5

    .line 718
    if-eqz v5, :cond_23

    .line 719
    .line 720
    new-instance v6, Ljava/lang/StringBuilder;

    .line 721
    .line 722
    const-string v7, "mapping type other than 0 not supported: "

    .line 723
    .line 724
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 728
    .line 729
    .line 730
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 731
    .line 732
    .line 733
    move-result-object v5

    .line 734
    const-string v6, "VorbisUtil"

    .line 735
    .line 736
    invoke-static {v6, v5}, La/f1t0;->Q(Ljava/lang/String;Ljava/lang/String;)V

    .line 737
    .line 738
    .line 739
    const/4 v7, 0x4

    .line 740
    const/4 v11, 0x2

    .line 741
    goto :goto_1a

    .line 742
    :cond_23
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 743
    .line 744
    .line 745
    move-result v5

    .line 746
    if-eqz v5, :cond_24

    .line 747
    .line 748
    const/4 v7, 0x4

    .line 749
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 750
    .line 751
    .line 752
    move-result v5

    .line 753
    const/16 v17, 0x1

    .line 754
    .line 755
    add-int/lit8 v5, v5, 0x1

    .line 756
    .line 757
    goto :goto_16

    .line 758
    :cond_24
    const/16 v17, 0x1

    .line 759
    .line 760
    move/from16 v5, v17

    .line 761
    .line 762
    :goto_16
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 763
    .line 764
    .line 765
    move-result v6

    .line 766
    if-eqz v6, :cond_25

    .line 767
    .line 768
    const/16 v11, 0x8

    .line 769
    .line 770
    invoke-virtual {v13, v11}, La/q8b;->g(I)I

    .line 771
    .line 772
    .line 773
    move-result v6

    .line 774
    add-int/lit8 v6, v6, 0x1

    .line 775
    .line 776
    const/4 v7, 0x0

    .line 777
    :goto_17
    if-ge v7, v6, :cond_25

    .line 778
    .line 779
    add-int/lit8 v11, v9, -0x1

    .line 780
    .line 781
    invoke-static {v11}, La/dnm0;->o(I)I

    .line 782
    .line 783
    .line 784
    move-result v12

    .line 785
    invoke-virtual {v13, v12}, La/q8b;->o(I)V

    .line 786
    .line 787
    .line 788
    invoke-static {v11}, La/dnm0;->o(I)I

    .line 789
    .line 790
    .line 791
    move-result v11

    .line 792
    invoke-virtual {v13, v11}, La/q8b;->o(I)V

    .line 793
    .line 794
    .line 795
    add-int/lit8 v7, v7, 0x1

    .line 796
    .line 797
    goto :goto_17

    .line 798
    :cond_25
    const/4 v11, 0x2

    .line 799
    invoke-virtual {v13, v11}, La/q8b;->g(I)I

    .line 800
    .line 801
    .line 802
    move-result v6

    .line 803
    if-nez v6, :cond_28

    .line 804
    .line 805
    const/4 v15, 0x1

    .line 806
    if-le v5, v15, :cond_26

    .line 807
    .line 808
    const/4 v6, 0x0

    .line 809
    :goto_18
    if-ge v6, v9, :cond_26

    .line 810
    .line 811
    const/4 v7, 0x4

    .line 812
    invoke-virtual {v13, v7}, La/q8b;->o(I)V

    .line 813
    .line 814
    .line 815
    add-int/lit8 v6, v6, 0x1

    .line 816
    .line 817
    goto :goto_18

    .line 818
    :cond_26
    const/4 v7, 0x4

    .line 819
    const/4 v6, 0x0

    .line 820
    :goto_19
    if-ge v6, v5, :cond_27

    .line 821
    .line 822
    const/16 v12, 0x8

    .line 823
    .line 824
    invoke-virtual {v13, v12}, La/q8b;->o(I)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v13, v12}, La/q8b;->o(I)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v13, v12}, La/q8b;->o(I)V

    .line 831
    .line 832
    .line 833
    add-int/lit8 v6, v6, 0x1

    .line 834
    .line 835
    goto :goto_19

    .line 836
    :cond_27
    :goto_1a
    add-int/lit8 v1, v1, 0x1

    .line 837
    .line 838
    goto/16 :goto_15

    .line 839
    .line 840
    :cond_28
    const-string v0, "to reserved bits must be zero after mapping coupling steps"

    .line 841
    .line 842
    const/4 v1, 0x0

    .line 843
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    throw v0

    .line 848
    :cond_29
    const/4 v1, 0x6

    .line 849
    invoke-virtual {v13, v1}, La/q8b;->g(I)I

    .line 850
    .line 851
    .line 852
    move-result v1

    .line 853
    const/16 v17, 0x1

    .line 854
    .line 855
    add-int/lit8 v1, v1, 0x1

    .line 856
    .line 857
    new-array v4, v1, [La/nqd;

    .line 858
    .line 859
    const/4 v5, 0x0

    .line 860
    :goto_1b
    if-ge v5, v1, :cond_2a

    .line 861
    .line 862
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 863
    .line 864
    .line 865
    move-result v6

    .line 866
    const/16 v7, 0x10

    .line 867
    .line 868
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 869
    .line 870
    .line 871
    invoke-virtual {v13, v7}, La/q8b;->g(I)I

    .line 872
    .line 873
    .line 874
    const/16 v11, 0x8

    .line 875
    .line 876
    invoke-virtual {v13, v11}, La/q8b;->g(I)I

    .line 877
    .line 878
    .line 879
    new-instance v9, La/nqd;

    .line 880
    .line 881
    invoke-direct {v9, v11, v6}, La/nqd;-><init>(BZ)V

    .line 882
    .line 883
    .line 884
    aput-object v9, v4, v5

    .line 885
    .line 886
    add-int/lit8 v5, v5, 0x1

    .line 887
    .line 888
    goto :goto_1b

    .line 889
    :cond_2a
    invoke-virtual {v13}, La/q8b;->f()Z

    .line 890
    .line 891
    .line 892
    move-result v1

    .line 893
    if-eqz v1, :cond_2c

    .line 894
    .line 895
    new-instance v1, La/fht0;

    .line 896
    .line 897
    invoke-direct {v1, v3, v8, v10, v4}, La/fht0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    move-object v8, v1

    .line 901
    :goto_1c
    iput-object v8, v0, La/ivu0;->n:La/fht0;

    .line 902
    .line 903
    if-nez v8, :cond_2b

    .line 904
    .line 905
    const/16 v17, 0x1

    .line 906
    .line 907
    return v17

    .line 908
    :cond_2b
    iget-object v0, v8, La/fht0;->a:Ljava/lang/Object;

    .line 909
    .line 910
    check-cast v0, La/jvu0;

    .line 911
    .line 912
    new-instance v1, Ljava/util/ArrayList;

    .line 913
    .line 914
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 915
    .line 916
    .line 917
    iget-object v3, v0, La/jvu0;->g:[B

    .line 918
    .line 919
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 920
    .line 921
    .line 922
    iget-object v3, v8, La/fht0;->c:Ljava/lang/Object;

    .line 923
    .line 924
    check-cast v3, [B

    .line 925
    .line 926
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 927
    .line 928
    .line 929
    iget-object v3, v8, La/fht0;->b:Ljava/lang/Object;

    .line 930
    .line 931
    check-cast v3, La/ikt0;

    .line 932
    .line 933
    iget-object v3, v3, La/ikt0;->a:Ljava/lang/Object;

    .line 934
    .line 935
    check-cast v3, [Ljava/lang/String;

    .line 936
    .line 937
    invoke-static {v3}, La/b4x;->q([Ljava/lang/Object;)La/rcf0;

    .line 938
    .line 939
    .line 940
    move-result-object v3

    .line 941
    invoke-static {v3}, La/kvu0;->a(Ljava/util/List;)La/ed40;

    .line 942
    .line 943
    .line 944
    move-result-object v3

    .line 945
    new-instance v4, La/awq;

    .line 946
    .line 947
    invoke-direct {v4}, La/awq;-><init>()V

    .line 948
    .line 949
    .line 950
    const-string v5, "audio/ogg"

    .line 951
    .line 952
    invoke-static {v5}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 953
    .line 954
    .line 955
    move-result-object v5

    .line 956
    iput-object v5, v4, La/awq;->n:Ljava/lang/String;

    .line 957
    .line 958
    const-string v5, "audio/vorbis"

    .line 959
    .line 960
    invoke-static {v5}, La/mg40;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 961
    .line 962
    .line 963
    move-result-object v5

    .line 964
    iput-object v5, v4, La/awq;->o:Ljava/lang/String;

    .line 965
    .line 966
    iget v5, v0, La/jvu0;->d:I

    .line 967
    .line 968
    iput v5, v4, La/awq;->i:I

    .line 969
    .line 970
    iget v5, v0, La/jvu0;->c:I

    .line 971
    .line 972
    iput v5, v4, La/awq;->j:I

    .line 973
    .line 974
    iget-short v5, v0, La/jvu0;->a:S

    .line 975
    .line 976
    iput v5, v4, La/awq;->I:I

    .line 977
    .line 978
    iget v0, v0, La/jvu0;->b:I

    .line 979
    .line 980
    iput v0, v4, La/awq;->K:I

    .line 981
    .line 982
    iput-object v1, v4, La/awq;->r:Ljava/util/List;

    .line 983
    .line 984
    iput-object v3, v4, La/awq;->l:La/ed40;

    .line 985
    .line 986
    new-instance v0, Landroidx/media3/common/b;

    .line 987
    .line 988
    invoke-direct {v0, v4}, Landroidx/media3/common/b;-><init>(La/awq;)V

    .line 989
    .line 990
    .line 991
    iput-object v0, v2, La/fck0;->b:Ljava/lang/Object;

    .line 992
    .line 993
    const/16 v17, 0x1

    .line 994
    .line 995
    return v17

    .line 996
    :cond_2c
    const-string v0, "framing bit after modes not set as expected"

    .line 997
    .line 998
    const/4 v1, 0x0

    .line 999
    invoke-static {v0, v1}, La/kq80;->a(Ljava/lang/String;Ljava/lang/Exception;)La/kq80;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v0

    .line 1003
    throw v0
.end method

.method public final d(Z)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, La/orm0;->d(Z)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, La/ivu0;->n:La/fht0;

    .line 8
    .line 9
    iput-object p1, p0, La/ivu0;->q:La/jvu0;

    .line 10
    .line 11
    iput-object p1, p0, La/ivu0;->r:La/ikt0;

    .line 12
    .line 13
    :cond_0
    const/4 p1, 0x0

    .line 14
    iput p1, p0, La/ivu0;->o:I

    .line 15
    .line 16
    iput-boolean p1, p0, La/ivu0;->p:Z

    .line 17
    .line 18
    return-void
.end method
