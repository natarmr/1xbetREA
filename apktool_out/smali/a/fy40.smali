.class public final La/fy40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[I

.field public c:I

.field public d:I

.field public e:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 34
    invoke-direct {p0, v0}, La/fy40;-><init>(I)V

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
    iput-object v0, p0, La/fy40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/pkx;->a:[I

    .line 9
    .line 10
    iput-object v0, p0, La/fy40;->b:[I

    .line 11
    .line 12
    if-ltz p1, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-static {p1}, La/u1h0;->d(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-virtual {p0, p1}, La/fy40;->f(I)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string p0, "Capacity must be a positive value."

    .line 28
    .line 29
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0
.end method


# virtual methods
.method public final a(I)Z
    .locals 3

    .line 1
    iget v0, p0, La/fy40;->d:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/fy40;->d(I)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, La/fy40;->b:[I

    .line 8
    .line 9
    aput p1, v2, v1

    .line 10
    .line 11
    iget p0, p0, La/fy40;->d:I

    .line 12
    .line 13
    if-eq p0, v0, :cond_0

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
.end method

.method public final b()V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/fy40;->d:I

    .line 3
    .line 4
    iget-object v0, p0, La/fy40;->a:[J

    .line 5
    .line 6
    sget-object v1, La/u1h0;->a:[J

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    .line 10
    const-wide v1, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1, v2}, La/qx3;->p([JJ)V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, La/fy40;->a:[J

    .line 19
    .line 20
    iget v1, p0, La/fy40;->c:I

    .line 21
    .line 22
    shr-int/lit8 v2, v1, 0x3

    .line 23
    .line 24
    and-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    shl-int/lit8 v1, v1, 0x3

    .line 27
    .line 28
    aget-wide v3, v0, v2

    .line 29
    .line 30
    const-wide/16 v5, 0xff

    .line 31
    .line 32
    shl-long/2addr v5, v1

    .line 33
    not-long v7, v5

    .line 34
    and-long/2addr v3, v7

    .line 35
    or-long/2addr v3, v5

    .line 36
    aput-wide v3, v0, v2

    .line 37
    .line 38
    :cond_0
    iget v0, p0, La/fy40;->c:I

    .line 39
    .line 40
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget v1, p0, La/fy40;->d:I

    .line 45
    .line 46
    sub-int/2addr v0, v1

    .line 47
    iput v0, p0, La/fy40;->e:I

    .line 48
    .line 49
    return-void
.end method

.method public final c(I)Z
    .locals 18

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
    ushr-int/lit8 v2, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v2

    .line 17
    and-int/lit8 v2, v1, 0x7f

    .line 18
    .line 19
    iget v3, v0, La/fy40;->c:I

    .line 20
    .line 21
    ushr-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    and-int/2addr v1, v3

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_0
    iget-object v6, v0, La/fy40;->a:[J

    .line 27
    .line 28
    shr-int/lit8 v7, v1, 0x3

    .line 29
    .line 30
    and-int/lit8 v8, v1, 0x7

    .line 31
    .line 32
    shl-int/lit8 v8, v8, 0x3

    .line 33
    .line 34
    aget-wide v9, v6, v7

    .line 35
    .line 36
    ushr-long/2addr v9, v8

    .line 37
    const/4 v11, 0x1

    .line 38
    add-int/2addr v7, v11

    .line 39
    aget-wide v12, v6, v7

    .line 40
    .line 41
    rsub-int/lit8 v6, v8, 0x40

    .line 42
    .line 43
    shl-long v6, v12, v6

    .line 44
    .line 45
    int-to-long v12, v8

    .line 46
    neg-long v12, v12

    .line 47
    const/16 v8, 0x3f

    .line 48
    .line 49
    shr-long/2addr v12, v8

    .line 50
    and-long/2addr v6, v12

    .line 51
    or-long/2addr v6, v9

    .line 52
    int-to-long v8, v2

    .line 53
    const-wide v12, 0x101010101010101L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-long/2addr v8, v12

    .line 59
    xor-long/2addr v8, v6

    .line 60
    sub-long v12, v8, v12

    .line 61
    .line 62
    not-long v8, v8

    .line 63
    and-long/2addr v8, v12

    .line 64
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v8, v12

    .line 70
    :goto_1
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    cmp-long v10, v8, v14

    .line 73
    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    shr-int/lit8 v10, v10, 0x3

    .line 81
    .line 82
    add-int/2addr v10, v1

    .line 83
    and-int/2addr v10, v3

    .line 84
    iget-object v14, v0, La/fy40;->b:[I

    .line 85
    .line 86
    aget v14, v14, v10

    .line 87
    .line 88
    move/from16 v15, p1

    .line 89
    .line 90
    if-ne v14, v15, :cond_0

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_0
    const-wide/16 v16, 0x1

    .line 94
    .line 95
    sub-long v16, v8, v16

    .line 96
    .line 97
    and-long v8, v8, v16

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    not-long v8, v6

    .line 101
    const/4 v10, 0x6

    .line 102
    shl-long/2addr v8, v10

    .line 103
    and-long/2addr v6, v8

    .line 104
    and-long/2addr v6, v12

    .line 105
    cmp-long v6, v6, v14

    .line 106
    .line 107
    if-eqz v6, :cond_3

    .line 108
    .line 109
    const/4 v10, -0x1

    .line 110
    :goto_2
    if-ltz v10, :cond_2

    .line 111
    .line 112
    return v11

    .line 113
    :cond_2
    return v4

    .line 114
    :cond_3
    add-int/lit8 v5, v5, 0x8

    .line 115
    .line 116
    add-int/2addr v1, v5

    .line 117
    and-int/2addr v1, v3

    .line 118
    goto :goto_0
.end method

.method public final d(I)I
    .locals 34

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
    iget v4, v0, La/fy40;->c:I

    .line 22
    .line 23
    and-int v5, v3, v4

    .line 24
    .line 25
    const/4 v7, 0x0

    .line 26
    :goto_0
    iget-object v8, v0, La/fy40;->a:[J

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
    iget-object v2, v0, La/fy40;->b:[I

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
    invoke-virtual {v0, v3}, La/fy40;->e(I)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    iget v2, v0, La/fy40;->e:I

    .line 137
    .line 138
    const-wide/16 v7, 0xff

    .line 139
    .line 140
    if-nez v2, :cond_2

    .line 141
    .line 142
    iget-object v2, v0, La/fy40;->a:[J

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
    move-wide/from16 v25, v10

    .line 165
    .line 166
    move v15, v13

    .line 167
    const/16 p1, 0x7

    .line 168
    .line 169
    const-wide/16 v16, 0x80

    .line 170
    .line 171
    goto/16 :goto_b

    .line 172
    .line 173
    :cond_3
    iget v1, v0, La/fy40;->c:I

    .line 174
    .line 175
    if-le v1, v6, :cond_b

    .line 176
    .line 177
    iget v2, v0, La/fy40;->d:I

    .line 178
    .line 179
    const-wide/16 v16, 0x80

    .line 180
    .line 181
    int-to-long v4, v2

    .line 182
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 183
    .line 184
    const-wide/16 v23, 0x20

    .line 185
    .line 186
    mul-long v4, v4, v23

    .line 187
    .line 188
    int-to-long v1, v1

    .line 189
    const-wide/16 v23, 0x19

    .line 190
    .line 191
    mul-long v1, v1, v23

    .line 192
    .line 193
    const-wide/high16 v23, -0x8000000000000000L

    .line 194
    .line 195
    xor-long v4, v4, v23

    .line 196
    .line 197
    xor-long v1, v1, v23

    .line 198
    .line 199
    invoke-static {v4, v5, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 200
    .line 201
    .line 202
    move-result v1

    .line 203
    if-gtz v1, :cond_a

    .line 204
    .line 205
    iget-object v1, v0, La/fy40;->a:[J

    .line 206
    .line 207
    iget v2, v0, La/fy40;->c:I

    .line 208
    .line 209
    iget-object v4, v0, La/fy40;->b:[I

    .line 210
    .line 211
    add-int/lit8 v5, v2, 0x7

    .line 212
    .line 213
    shr-int/lit8 v5, v5, 0x3

    .line 214
    .line 215
    move/from16 v12, v20

    .line 216
    .line 217
    :goto_2
    if-ge v12, v5, :cond_4

    .line 218
    .line 219
    aget-wide v25, v1, v12

    .line 220
    .line 221
    move/from16 v27, v6

    .line 222
    .line 223
    move-wide/from16 v28, v7

    .line 224
    .line 225
    and-long v6, v25, v14

    .line 226
    .line 227
    move-wide/from16 v25, v10

    .line 228
    .line 229
    const/16 p1, 0x7

    .line 230
    .line 231
    not-long v9, v6

    .line 232
    ushr-long v6, v6, p1

    .line 233
    .line 234
    add-long/2addr v9, v6

    .line 235
    const-wide v6, -0x101010101010102L

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    and-long/2addr v6, v9

    .line 241
    aput-wide v6, v1, v12

    .line 242
    .line 243
    add-int/lit8 v12, v12, 0x1

    .line 244
    .line 245
    move-wide/from16 v10, v25

    .line 246
    .line 247
    move/from16 v6, v27

    .line 248
    .line 249
    move-wide/from16 v7, v28

    .line 250
    .line 251
    goto :goto_2

    .line 252
    :cond_4
    move/from16 v27, v6

    .line 253
    .line 254
    move-wide/from16 v28, v7

    .line 255
    .line 256
    move-wide/from16 v25, v10

    .line 257
    .line 258
    const/16 p1, 0x7

    .line 259
    .line 260
    invoke-static {v1}, La/tx3;->D([J)I

    .line 261
    .line 262
    .line 263
    move-result v5

    .line 264
    add-int/lit8 v6, v5, -0x1

    .line 265
    .line 266
    aget-wide v7, v1, v6

    .line 267
    .line 268
    const-wide v9, 0xffffffffffffffL

    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    and-long/2addr v7, v9

    .line 274
    const-wide/high16 v11, -0x100000000000000L

    .line 275
    .line 276
    or-long/2addr v7, v11

    .line 277
    aput-wide v7, v1, v6

    .line 278
    .line 279
    aget-wide v6, v1, v20

    .line 280
    .line 281
    aput-wide v6, v1, v5

    .line 282
    .line 283
    move/from16 v5, v20

    .line 284
    .line 285
    :goto_3
    if-eq v5, v2, :cond_9

    .line 286
    .line 287
    shr-int/lit8 v6, v5, 0x3

    .line 288
    .line 289
    aget-wide v7, v1, v6

    .line 290
    .line 291
    and-int/lit8 v11, v5, 0x7

    .line 292
    .line 293
    shl-int/lit8 v11, v11, 0x3

    .line 294
    .line 295
    shr-long/2addr v7, v11

    .line 296
    and-long v7, v7, v28

    .line 297
    .line 298
    cmp-long v12, v7, v16

    .line 299
    .line 300
    if-nez v12, :cond_5

    .line 301
    .line 302
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 303
    .line 304
    goto :goto_3

    .line 305
    :cond_5
    cmp-long v7, v7, v21

    .line 306
    .line 307
    if-eqz v7, :cond_6

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_6
    aget v7, v4, v5

    .line 311
    .line 312
    invoke-static {v7}, Ljava/lang/Integer;->hashCode(I)I

    .line 313
    .line 314
    .line 315
    move-result v7

    .line 316
    ushr-int/lit8 v8, v7, 0x10

    .line 317
    .line 318
    xor-int/2addr v7, v8

    .line 319
    mul-int v7, v7, v19

    .line 320
    .line 321
    ushr-int/lit8 v8, v7, 0x10

    .line 322
    .line 323
    xor-int/2addr v7, v8

    .line 324
    ushr-int/lit8 v8, v7, 0x7

    .line 325
    .line 326
    invoke-virtual {v0, v8}, La/fy40;->e(I)I

    .line 327
    .line 328
    .line 329
    move-result v12

    .line 330
    and-int/2addr v8, v2

    .line 331
    sub-int v14, v12, v8

    .line 332
    .line 333
    and-int/2addr v14, v2

    .line 334
    div-int/lit8 v14, v14, 0x8

    .line 335
    .line 336
    sub-int v8, v5, v8

    .line 337
    .line 338
    and-int/2addr v8, v2

    .line 339
    div-int/lit8 v8, v8, 0x8

    .line 340
    .line 341
    if-ne v14, v8, :cond_7

    .line 342
    .line 343
    and-int/lit8 v7, v7, 0x7f

    .line 344
    .line 345
    int-to-long v7, v7

    .line 346
    aget-wide v14, v1, v6

    .line 347
    .line 348
    move-wide/from16 v30, v9

    .line 349
    .line 350
    shl-long v9, v28, v11

    .line 351
    .line 352
    not-long v9, v9

    .line 353
    and-long/2addr v9, v14

    .line 354
    shl-long/2addr v7, v11

    .line 355
    or-long/2addr v7, v9

    .line 356
    aput-wide v7, v1, v6

    .line 357
    .line 358
    array-length v6, v1

    .line 359
    sub-int/2addr v6, v13

    .line 360
    aget-wide v7, v1, v20

    .line 361
    .line 362
    and-long v7, v7, v30

    .line 363
    .line 364
    or-long v7, v7, v23

    .line 365
    .line 366
    aput-wide v7, v1, v6

    .line 367
    .line 368
    add-int/lit8 v5, v5, 0x1

    .line 369
    .line 370
    move-wide/from16 v9, v30

    .line 371
    .line 372
    goto :goto_3

    .line 373
    :cond_7
    move-wide/from16 v30, v9

    .line 374
    .line 375
    shr-int/lit8 v8, v12, 0x3

    .line 376
    .line 377
    aget-wide v9, v1, v8

    .line 378
    .line 379
    and-int/lit8 v14, v12, 0x7

    .line 380
    .line 381
    shl-int/lit8 v14, v14, 0x3

    .line 382
    .line 383
    shr-long v32, v9, v14

    .line 384
    .line 385
    and-long v32, v32, v28

    .line 386
    .line 387
    cmp-long v15, v32, v16

    .line 388
    .line 389
    if-nez v15, :cond_8

    .line 390
    .line 391
    and-int/lit8 v7, v7, 0x7f

    .line 392
    .line 393
    move v15, v13

    .line 394
    move/from16 v18, v14

    .line 395
    .line 396
    int-to-long v13, v7

    .line 397
    move-object/from16 v32, v4

    .line 398
    .line 399
    move/from16 v33, v5

    .line 400
    .line 401
    shl-long v4, v28, v18

    .line 402
    .line 403
    not-long v4, v4

    .line 404
    and-long/2addr v4, v9

    .line 405
    shl-long v9, v13, v18

    .line 406
    .line 407
    or-long/2addr v4, v9

    .line 408
    aput-wide v4, v1, v8

    .line 409
    .line 410
    aget-wide v4, v1, v6

    .line 411
    .line 412
    shl-long v7, v28, v11

    .line 413
    .line 414
    not-long v7, v7

    .line 415
    and-long/2addr v4, v7

    .line 416
    shl-long v7, v16, v11

    .line 417
    .line 418
    or-long/2addr v4, v7

    .line 419
    aput-wide v4, v1, v6

    .line 420
    .line 421
    aget v4, v32, v33

    .line 422
    .line 423
    aput v4, v32, v12

    .line 424
    .line 425
    aput v20, v32, v33

    .line 426
    .line 427
    move/from16 v5, v33

    .line 428
    .line 429
    goto :goto_5

    .line 430
    :cond_8
    move-object/from16 v32, v4

    .line 431
    .line 432
    move/from16 v33, v5

    .line 433
    .line 434
    move v15, v13

    .line 435
    move/from16 v18, v14

    .line 436
    .line 437
    and-int/lit8 v4, v7, 0x7f

    .line 438
    .line 439
    int-to-long v4, v4

    .line 440
    shl-long v6, v28, v18

    .line 441
    .line 442
    not-long v6, v6

    .line 443
    and-long/2addr v6, v9

    .line 444
    shl-long v4, v4, v18

    .line 445
    .line 446
    or-long/2addr v4, v6

    .line 447
    aput-wide v4, v1, v8

    .line 448
    .line 449
    aget v4, v32, v12

    .line 450
    .line 451
    aget v5, v32, v33

    .line 452
    .line 453
    aput v5, v32, v12

    .line 454
    .line 455
    aput v4, v32, v33

    .line 456
    .line 457
    add-int/lit8 v5, v33, -0x1

    .line 458
    .line 459
    :goto_5
    array-length v4, v1

    .line 460
    sub-int/2addr v4, v15

    .line 461
    aget-wide v6, v1, v20

    .line 462
    .line 463
    and-long v6, v6, v30

    .line 464
    .line 465
    or-long v6, v6, v23

    .line 466
    .line 467
    aput-wide v6, v1, v4

    .line 468
    .line 469
    add-int/2addr v5, v15

    .line 470
    move v13, v15

    .line 471
    move-wide/from16 v9, v30

    .line 472
    .line 473
    move-object/from16 v4, v32

    .line 474
    .line 475
    goto/16 :goto_3

    .line 476
    .line 477
    :cond_9
    move v15, v13

    .line 478
    iget v1, v0, La/fy40;->c:I

    .line 479
    .line 480
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 481
    .line 482
    .line 483
    move-result v1

    .line 484
    iget v2, v0, La/fy40;->d:I

    .line 485
    .line 486
    sub-int/2addr v1, v2

    .line 487
    iput v1, v0, La/fy40;->e:I

    .line 488
    .line 489
    goto/16 :goto_a

    .line 490
    .line 491
    :cond_a
    :goto_6
    move-wide/from16 v28, v7

    .line 492
    .line 493
    move-wide/from16 v25, v10

    .line 494
    .line 495
    move v15, v13

    .line 496
    const/16 p1, 0x7

    .line 497
    .line 498
    goto :goto_7

    .line 499
    :cond_b
    const-wide/16 v16, 0x80

    .line 500
    .line 501
    goto :goto_6

    .line 502
    :goto_7
    iget v1, v0, La/fy40;->c:I

    .line 503
    .line 504
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    iget-object v2, v0, La/fy40;->a:[J

    .line 509
    .line 510
    iget-object v4, v0, La/fy40;->b:[I

    .line 511
    .line 512
    iget v5, v0, La/fy40;->c:I

    .line 513
    .line 514
    invoke-virtual {v0, v1}, La/fy40;->f(I)V

    .line 515
    .line 516
    .line 517
    iget-object v1, v0, La/fy40;->a:[J

    .line 518
    .line 519
    iget-object v6, v0, La/fy40;->b:[I

    .line 520
    .line 521
    iget v7, v0, La/fy40;->c:I

    .line 522
    .line 523
    move/from16 v8, v20

    .line 524
    .line 525
    :goto_8
    if-ge v8, v5, :cond_d

    .line 526
    .line 527
    shr-int/lit8 v9, v8, 0x3

    .line 528
    .line 529
    aget-wide v9, v2, v9

    .line 530
    .line 531
    and-int/lit8 v11, v8, 0x7

    .line 532
    .line 533
    shl-int/lit8 v11, v11, 0x3

    .line 534
    .line 535
    shr-long/2addr v9, v11

    .line 536
    and-long v9, v9, v28

    .line 537
    .line 538
    cmp-long v9, v9, v16

    .line 539
    .line 540
    if-gez v9, :cond_c

    .line 541
    .line 542
    aget v9, v4, v8

    .line 543
    .line 544
    invoke-static {v9}, Ljava/lang/Integer;->hashCode(I)I

    .line 545
    .line 546
    .line 547
    move-result v10

    .line 548
    ushr-int/lit8 v11, v10, 0x10

    .line 549
    .line 550
    xor-int/2addr v10, v11

    .line 551
    mul-int v10, v10, v19

    .line 552
    .line 553
    ushr-int/lit8 v11, v10, 0x10

    .line 554
    .line 555
    xor-int/2addr v10, v11

    .line 556
    ushr-int/lit8 v11, v10, 0x7

    .line 557
    .line 558
    invoke-virtual {v0, v11}, La/fy40;->e(I)I

    .line 559
    .line 560
    .line 561
    move-result v11

    .line 562
    and-int/lit8 v10, v10, 0x7f

    .line 563
    .line 564
    int-to-long v12, v10

    .line 565
    shr-int/lit8 v10, v11, 0x3

    .line 566
    .line 567
    and-int/lit8 v14, v11, 0x7

    .line 568
    .line 569
    shl-int/lit8 v14, v14, 0x3

    .line 570
    .line 571
    aget-wide v21, v1, v10

    .line 572
    .line 573
    move-object/from16 v23, v1

    .line 574
    .line 575
    move-object/from16 v18, v2

    .line 576
    .line 577
    shl-long v1, v28, v14

    .line 578
    .line 579
    not-long v1, v1

    .line 580
    and-long v1, v21, v1

    .line 581
    .line 582
    shl-long/2addr v12, v14

    .line 583
    or-long/2addr v1, v12

    .line 584
    aput-wide v1, v23, v10

    .line 585
    .line 586
    add-int/lit8 v10, v11, -0x7

    .line 587
    .line 588
    and-int/2addr v10, v7

    .line 589
    and-int/lit8 v12, v7, 0x7

    .line 590
    .line 591
    add-int/2addr v10, v12

    .line 592
    shr-int/lit8 v10, v10, 0x3

    .line 593
    .line 594
    aput-wide v1, v23, v10

    .line 595
    .line 596
    aput v9, v6, v11

    .line 597
    .line 598
    goto :goto_9

    .line 599
    :cond_c
    move-object/from16 v23, v1

    .line 600
    .line 601
    move-object/from16 v18, v2

    .line 602
    .line 603
    :goto_9
    add-int/lit8 v8, v8, 0x1

    .line 604
    .line 605
    move-object/from16 v2, v18

    .line 606
    .line 607
    move-object/from16 v1, v23

    .line 608
    .line 609
    goto :goto_8

    .line 610
    :cond_d
    :goto_a
    invoke-virtual {v0, v3}, La/fy40;->e(I)I

    .line 611
    .line 612
    .line 613
    move-result v1

    .line 614
    :goto_b
    iget v2, v0, La/fy40;->d:I

    .line 615
    .line 616
    add-int/2addr v2, v15

    .line 617
    iput v2, v0, La/fy40;->d:I

    .line 618
    .line 619
    iget v2, v0, La/fy40;->e:I

    .line 620
    .line 621
    iget-object v3, v0, La/fy40;->a:[J

    .line 622
    .line 623
    shr-int/lit8 v4, v1, 0x3

    .line 624
    .line 625
    aget-wide v5, v3, v4

    .line 626
    .line 627
    and-int/lit8 v7, v1, 0x7

    .line 628
    .line 629
    shl-int/lit8 v7, v7, 0x3

    .line 630
    .line 631
    shr-long v8, v5, v7

    .line 632
    .line 633
    and-long v8, v8, v28

    .line 634
    .line 635
    cmp-long v8, v8, v16

    .line 636
    .line 637
    if-nez v8, :cond_e

    .line 638
    .line 639
    goto :goto_c

    .line 640
    :cond_e
    move/from16 v15, v20

    .line 641
    .line 642
    :goto_c
    sub-int/2addr v2, v15

    .line 643
    iput v2, v0, La/fy40;->e:I

    .line 644
    .line 645
    iget v0, v0, La/fy40;->c:I

    .line 646
    .line 647
    shl-long v8, v28, v7

    .line 648
    .line 649
    not-long v8, v8

    .line 650
    and-long/2addr v5, v8

    .line 651
    shl-long v7, v25, v7

    .line 652
    .line 653
    or-long/2addr v5, v7

    .line 654
    aput-wide v5, v3, v4

    .line 655
    .line 656
    add-int/lit8 v2, v1, -0x7

    .line 657
    .line 658
    and-int/2addr v2, v0

    .line 659
    and-int/lit8 v0, v0, 0x7

    .line 660
    .line 661
    add-int/2addr v2, v0

    .line 662
    shr-int/lit8 v0, v2, 0x3

    .line 663
    .line 664
    aput-wide v5, v3, v0

    .line 665
    .line 666
    return v1

    .line 667
    :cond_f
    move/from16 v27, v6

    .line 668
    .line 669
    add-int/lit8 v7, v18, 0x8

    .line 670
    .line 671
    add-int/2addr v5, v7

    .line 672
    and-int/2addr v5, v4

    .line 673
    move/from16 v2, v19

    .line 674
    .line 675
    goto/16 :goto_0
.end method

.method public final e(I)I
    .locals 9

    .line 1
    iget v0, p0, La/fy40;->c:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/fy40;->a:[J

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

.method public final equals(Ljava/lang/Object;)Z
    .locals 14

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/fy40;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/fy40;

    .line 12
    .line 13
    iget v1, p1, La/fy40;->d:I

    .line 14
    .line 15
    iget v3, p0, La/fy40;->d:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/fy40;->b:[I

    .line 21
    .line 22
    iget-object p0, p0, La/fy40;->a:[J

    .line 23
    .line 24
    array-length v3, p0

    .line 25
    add-int/lit8 v3, v3, -0x2

    .line 26
    .line 27
    if-ltz v3, :cond_6

    .line 28
    .line 29
    move v4, v2

    .line 30
    :goto_0
    aget-wide v5, p0, v4

    .line 31
    .line 32
    not-long v7, v5

    .line 33
    const/4 v9, 0x7

    .line 34
    shl-long/2addr v7, v9

    .line 35
    and-long/2addr v7, v5

    .line 36
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    and-long/2addr v7, v9

    .line 42
    cmp-long v7, v7, v9

    .line 43
    .line 44
    if-eqz v7, :cond_5

    .line 45
    .line 46
    sub-int v7, v4, v3

    .line 47
    .line 48
    not-int v7, v7

    .line 49
    ushr-int/lit8 v7, v7, 0x1f

    .line 50
    .line 51
    const/16 v8, 0x8

    .line 52
    .line 53
    rsub-int/lit8 v7, v7, 0x8

    .line 54
    .line 55
    move v9, v2

    .line 56
    :goto_1
    if-ge v9, v7, :cond_4

    .line 57
    .line 58
    const-wide/16 v10, 0xff

    .line 59
    .line 60
    and-long/2addr v10, v5

    .line 61
    const-wide/16 v12, 0x80

    .line 62
    .line 63
    cmp-long v10, v10, v12

    .line 64
    .line 65
    if-gez v10, :cond_3

    .line 66
    .line 67
    shl-int/lit8 v10, v4, 0x3

    .line 68
    .line 69
    add-int/2addr v10, v9

    .line 70
    aget v10, v1, v10

    .line 71
    .line 72
    invoke-virtual {p1, v10}, La/fy40;->c(I)Z

    .line 73
    .line 74
    .line 75
    move-result v10

    .line 76
    if-nez v10, :cond_3

    .line 77
    .line 78
    return v2

    .line 79
    :cond_3
    shr-long/2addr v5, v8

    .line 80
    add-int/lit8 v9, v9, 0x1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_4
    if-ne v7, v8, :cond_6

    .line 84
    .line 85
    :cond_5
    if-eq v4, v3, :cond_6

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_6
    return v0
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
    iput p1, p0, La/fy40;->c:I

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
    iput-object v0, p0, La/fy40;->a:[J

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
    iget v0, p0, La/fy40;->c:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/fy40;->d:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/fy40;->e:I

    .line 68
    .line 69
    new-array p1, p1, [I

    .line 70
    .line 71
    iput-object p1, p0, La/fy40;->b:[I

    .line 72
    .line 73
    return-void
.end method

.method public final g(I)Z
    .locals 18

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
    ushr-int/lit8 v2, v1, 0x10

    .line 15
    .line 16
    xor-int/2addr v1, v2

    .line 17
    and-int/lit8 v2, v1, 0x7f

    .line 18
    .line 19
    iget v3, v0, La/fy40;->c:I

    .line 20
    .line 21
    ushr-int/lit8 v1, v1, 0x7

    .line 22
    .line 23
    and-int/2addr v1, v3

    .line 24
    const/4 v4, 0x0

    .line 25
    move v5, v4

    .line 26
    :goto_0
    iget-object v6, v0, La/fy40;->a:[J

    .line 27
    .line 28
    shr-int/lit8 v7, v1, 0x3

    .line 29
    .line 30
    and-int/lit8 v8, v1, 0x7

    .line 31
    .line 32
    shl-int/lit8 v8, v8, 0x3

    .line 33
    .line 34
    aget-wide v9, v6, v7

    .line 35
    .line 36
    ushr-long/2addr v9, v8

    .line 37
    const/4 v11, 0x1

    .line 38
    add-int/2addr v7, v11

    .line 39
    aget-wide v12, v6, v7

    .line 40
    .line 41
    rsub-int/lit8 v6, v8, 0x40

    .line 42
    .line 43
    shl-long v6, v12, v6

    .line 44
    .line 45
    int-to-long v12, v8

    .line 46
    neg-long v12, v12

    .line 47
    const/16 v8, 0x3f

    .line 48
    .line 49
    shr-long/2addr v12, v8

    .line 50
    and-long/2addr v6, v12

    .line 51
    or-long/2addr v6, v9

    .line 52
    int-to-long v8, v2

    .line 53
    const-wide v12, 0x101010101010101L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    mul-long/2addr v8, v12

    .line 59
    xor-long/2addr v8, v6

    .line 60
    sub-long v12, v8, v12

    .line 61
    .line 62
    not-long v8, v8

    .line 63
    and-long/2addr v8, v12

    .line 64
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    and-long/2addr v8, v12

    .line 70
    :goto_1
    const-wide/16 v14, 0x0

    .line 71
    .line 72
    cmp-long v10, v8, v14

    .line 73
    .line 74
    if-eqz v10, :cond_1

    .line 75
    .line 76
    invoke-static {v8, v9}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 77
    .line 78
    .line 79
    move-result v10

    .line 80
    shr-int/lit8 v10, v10, 0x3

    .line 81
    .line 82
    add-int/2addr v10, v1

    .line 83
    and-int/2addr v10, v3

    .line 84
    iget-object v14, v0, La/fy40;->b:[I

    .line 85
    .line 86
    aget v14, v14, v10

    .line 87
    .line 88
    move/from16 v15, p1

    .line 89
    .line 90
    if-ne v14, v15, :cond_0

    .line 91
    .line 92
    goto :goto_2

    .line 93
    :cond_0
    const-wide/16 v16, 0x1

    .line 94
    .line 95
    sub-long v16, v8, v16

    .line 96
    .line 97
    and-long v8, v8, v16

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_1
    not-long v8, v6

    .line 101
    const/4 v10, 0x6

    .line 102
    shl-long/2addr v8, v10

    .line 103
    and-long/2addr v6, v8

    .line 104
    and-long/2addr v6, v12

    .line 105
    cmp-long v6, v6, v14

    .line 106
    .line 107
    if-eqz v6, :cond_4

    .line 108
    .line 109
    const/4 v10, -0x1

    .line 110
    :goto_2
    if-ltz v10, :cond_2

    .line 111
    .line 112
    move v4, v11

    .line 113
    :cond_2
    if-eqz v4, :cond_3

    .line 114
    .line 115
    invoke-virtual {v0, v10}, La/fy40;->h(I)V

    .line 116
    .line 117
    .line 118
    :cond_3
    return v4

    .line 119
    :cond_4
    add-int/lit8 v5, v5, 0x8

    .line 120
    .line 121
    add-int/2addr v1, v5

    .line 122
    and-int/2addr v1, v3

    .line 123
    goto :goto_0
.end method

.method public final h(I)V
    .locals 7

    .line 1
    iget v0, p0, La/fy40;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, La/fy40;->d:I

    .line 6
    .line 7
    iget-object v0, p0, La/fy40;->a:[J

    .line 8
    .line 9
    iget p0, p0, La/fy40;->c:I

    .line 10
    .line 11
    shr-int/lit8 v1, p1, 0x3

    .line 12
    .line 13
    and-int/lit8 v2, p1, 0x7

    .line 14
    .line 15
    shl-int/lit8 v2, v2, 0x3

    .line 16
    .line 17
    aget-wide v3, v0, v1

    .line 18
    .line 19
    const-wide/16 v5, 0xff

    .line 20
    .line 21
    shl-long/2addr v5, v2

    .line 22
    not-long v5, v5

    .line 23
    and-long/2addr v3, v5

    .line 24
    const-wide/16 v5, 0xfe

    .line 25
    .line 26
    shl-long/2addr v5, v2

    .line 27
    or-long v2, v3, v5

    .line 28
    .line 29
    aput-wide v2, v0, v1

    .line 30
    .line 31
    add-int/lit8 p1, p1, -0x7

    .line 32
    .line 33
    and-int/2addr p1, p0

    .line 34
    and-int/lit8 p0, p0, 0x7

    .line 35
    .line 36
    add-int/2addr p1, p0

    .line 37
    shr-int/lit8 p0, p1, 0x3

    .line 38
    .line 39
    aput-wide v2, v0, p0

    .line 40
    .line 41
    return-void
.end method

.method public final hashCode()I
    .locals 14

    .line 1
    iget-object v0, p0, La/fy40;->b:[I

    .line 2
    .line 3
    iget-object p0, p0, La/fy40;->a:[J

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ltz v1, :cond_5

    .line 10
    .line 11
    move v3, v2

    .line 12
    move v4, v3

    .line 13
    :goto_0
    aget-wide v5, p0, v3

    .line 14
    .line 15
    not-long v7, v5

    .line 16
    const/4 v9, 0x7

    .line 17
    shl-long/2addr v7, v9

    .line 18
    and-long/2addr v7, v5

    .line 19
    const-wide v9, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    and-long/2addr v7, v9

    .line 25
    cmp-long v7, v7, v9

    .line 26
    .line 27
    if-eqz v7, :cond_3

    .line 28
    .line 29
    sub-int v7, v3, v1

    .line 30
    .line 31
    not-int v7, v7

    .line 32
    ushr-int/lit8 v7, v7, 0x1f

    .line 33
    .line 34
    const/16 v8, 0x8

    .line 35
    .line 36
    rsub-int/lit8 v7, v7, 0x8

    .line 37
    .line 38
    move v9, v2

    .line 39
    :goto_1
    if-ge v9, v7, :cond_1

    .line 40
    .line 41
    const-wide/16 v10, 0xff

    .line 42
    .line 43
    and-long/2addr v10, v5

    .line 44
    const-wide/16 v12, 0x80

    .line 45
    .line 46
    cmp-long v10, v10, v12

    .line 47
    .line 48
    if-gez v10, :cond_0

    .line 49
    .line 50
    shl-int/lit8 v10, v3, 0x3

    .line 51
    .line 52
    add-int/2addr v10, v9

    .line 53
    aget v10, v0, v10

    .line 54
    .line 55
    invoke-static {v10}, Ljava/lang/Integer;->hashCode(I)I

    .line 56
    .line 57
    .line 58
    move-result v10

    .line 59
    add-int/2addr v10, v4

    .line 60
    move v4, v10

    .line 61
    :cond_0
    shr-long/2addr v5, v8

    .line 62
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    if-ne v7, v8, :cond_2

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    return v4

    .line 69
    :cond_3
    :goto_2
    if-eq v3, v1, :cond_4

    .line 70
    .line 71
    add-int/lit8 v3, v3, 0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    return v4

    .line 75
    :cond_5
    return v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 15

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "["

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/fy40;->b:[I

    .line 9
    .line 10
    iget-object p0, p0, La/fy40;->a:[J

    .line 11
    .line 12
    array-length v2, p0

    .line 13
    add-int/lit8 v2, v2, -0x2

    .line 14
    .line 15
    if-ltz v2, :cond_5

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    move v4, v3

    .line 19
    move v5, v4

    .line 20
    :goto_0
    aget-wide v6, p0, v4

    .line 21
    .line 22
    not-long v8, v6

    .line 23
    const/4 v10, 0x7

    .line 24
    shl-long/2addr v8, v10

    .line 25
    and-long/2addr v8, v6

    .line 26
    const-wide v10, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    and-long/2addr v8, v10

    .line 32
    cmp-long v8, v8, v10

    .line 33
    .line 34
    if-eqz v8, :cond_4

    .line 35
    .line 36
    sub-int v8, v4, v2

    .line 37
    .line 38
    not-int v8, v8

    .line 39
    ushr-int/lit8 v8, v8, 0x1f

    .line 40
    .line 41
    const/16 v9, 0x8

    .line 42
    .line 43
    rsub-int/lit8 v8, v8, 0x8

    .line 44
    .line 45
    move v10, v3

    .line 46
    :goto_1
    if-ge v10, v8, :cond_3

    .line 47
    .line 48
    const-wide/16 v11, 0xff

    .line 49
    .line 50
    and-long/2addr v11, v6

    .line 51
    const-wide/16 v13, 0x80

    .line 52
    .line 53
    cmp-long v11, v11, v13

    .line 54
    .line 55
    if-gez v11, :cond_2

    .line 56
    .line 57
    shl-int/lit8 v11, v4, 0x3

    .line 58
    .line 59
    add-int/2addr v11, v10

    .line 60
    aget v11, v1, v11

    .line 61
    .line 62
    if-eqz v5, :cond_0

    .line 63
    .line 64
    const-string v12, ", "

    .line 65
    .line 66
    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    :cond_0
    const/4 v12, -0x1

    .line 70
    if-ne v5, v12, :cond_1

    .line 71
    .line 72
    const-string p0, "..."

    .line 73
    .line 74
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_1
    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    add-int/lit8 v5, v5, 0x1

    .line 82
    .line 83
    :cond_2
    shr-long/2addr v6, v9

    .line 84
    add-int/lit8 v10, v10, 0x1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_3
    if-ne v8, v9, :cond_5

    .line 88
    .line 89
    :cond_4
    if-eq v4, v2, :cond_5

    .line 90
    .line 91
    add-int/lit8 v4, v4, 0x1

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    :goto_2
    const-string p0, "]"

    .line 95
    .line 96
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
