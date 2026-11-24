.class public final La/iz40;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[J

.field public b:[Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:La/lz40;

.field public f:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x6

    .line 34
    invoke-direct {p0, v0}, La/iz40;-><init>(I)V

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
    iput-object v0, p0, La/iz40;->a:[J

    .line 7
    .line 8
    sget-object v0, La/jd8;->j:[Ljava/lang/Object;

    .line 9
    .line 10
    iput-object v0, p0, La/iz40;->b:[Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, La/iz40;->f(I)V

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
.method public final a(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    iget v0, p0, La/iz40;->d:I

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/iz40;->d(Ljava/lang/Object;)I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    iget-object v2, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 8
    .line 9
    aput-object p1, v2, v1

    .line 10
    .line 11
    iget p0, p0, La/iz40;->d:I

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
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, La/iz40;->d:I

    .line 3
    .line 4
    iget-object v1, p0, La/iz40;->a:[J

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
    iget-object v1, p0, La/iz40;->a:[J

    .line 19
    .line 20
    iget v2, p0, La/iz40;->c:I

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
    iget-object v1, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iget v3, p0, La/iz40;->c:I

    .line 42
    .line 43
    invoke-static {v0, v3, v2, v1}, La/qx3;->l(IILjava/lang/Object;[Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    iget v0, p0, La/iz40;->c:I

    .line 47
    .line 48
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v1, p0, La/iz40;->d:I

    .line 53
    .line 54
    sub-int/2addr v0, v1

    .line 55
    iput v0, p0, La/iz40;->f:I

    .line 56
    .line 57
    return-void
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/iz40;->c:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/iz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_4

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    return v12

    .line 120
    :cond_3
    return v2

    .line 121
    :cond_4
    add-int/lit8 v6, v6, 0x8

    .line 122
    .line 123
    add-int/2addr v3, v6

    .line 124
    and-int/2addr v3, v5

    .line 125
    goto :goto_1
.end method

.method public final d(Ljava/lang/Object;)I
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v3, 0x0

    .line 13
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 14
    .line 15
    xor-int/2addr v3, v4

    .line 16
    const v4, -0x3361d2af    # -8.293031E7f

    .line 17
    .line 18
    .line 19
    mul-int/2addr v3, v4

    .line 20
    ushr-int/lit8 v5, v3, 0x10

    .line 21
    .line 22
    xor-int/2addr v3, v5

    .line 23
    ushr-int/lit8 v5, v3, 0x7

    .line 24
    .line 25
    and-int/lit8 v3, v3, 0x7f

    .line 26
    .line 27
    iget v6, v0, La/iz40;->c:I

    .line 28
    .line 29
    and-int v7, v5, v6

    .line 30
    .line 31
    const/4 v8, 0x0

    .line 32
    :goto_1
    iget-object v9, v0, La/iz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v10, v7, 0x3

    .line 35
    .line 36
    and-int/lit8 v11, v7, 0x7

    .line 37
    .line 38
    shl-int/lit8 v11, v11, 0x3

    .line 39
    .line 40
    aget-wide v12, v9, v10

    .line 41
    .line 42
    ushr-long/2addr v12, v11

    .line 43
    const/4 v14, 0x1

    .line 44
    add-int/2addr v10, v14

    .line 45
    aget-wide v15, v9, v10

    .line 46
    .line 47
    rsub-int/lit8 v9, v11, 0x40

    .line 48
    .line 49
    shl-long v9, v15, v9

    .line 50
    .line 51
    move/from16 v16, v14

    .line 52
    .line 53
    int-to-long v14, v11

    .line 54
    neg-long v14, v14

    .line 55
    const/16 v11, 0x3f

    .line 56
    .line 57
    shr-long/2addr v14, v11

    .line 58
    and-long/2addr v9, v14

    .line 59
    or-long/2addr v9, v12

    .line 60
    int-to-long v11, v3

    .line 61
    const-wide v13, 0x101010101010101L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    mul-long v17, v11, v13

    .line 67
    .line 68
    move/from16 v19, v3

    .line 69
    .line 70
    const/4 v15, 0x0

    .line 71
    xor-long v2, v9, v17

    .line 72
    .line 73
    sub-long v13, v2, v13

    .line 74
    .line 75
    not-long v2, v2

    .line 76
    and-long/2addr v2, v13

    .line 77
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    and-long/2addr v2, v13

    .line 83
    :goto_2
    const-wide/16 v17, 0x0

    .line 84
    .line 85
    cmp-long v20, v2, v17

    .line 86
    .line 87
    if-eqz v20, :cond_2

    .line 88
    .line 89
    invoke-static {v2, v3}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 90
    .line 91
    .line 92
    move-result v17

    .line 93
    shr-int/lit8 v17, v17, 0x3

    .line 94
    .line 95
    add-int v17, v7, v17

    .line 96
    .line 97
    and-int v17, v17, v6

    .line 98
    .line 99
    move/from16 v20, v4

    .line 100
    .line 101
    iget-object v4, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 102
    .line 103
    aget-object v4, v4, v17

    .line 104
    .line 105
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_1

    .line 110
    .line 111
    return v17

    .line 112
    :cond_1
    const-wide/16 v17, 0x1

    .line 113
    .line 114
    sub-long v17, v2, v17

    .line 115
    .line 116
    and-long v2, v2, v17

    .line 117
    .line 118
    move/from16 v4, v20

    .line 119
    .line 120
    goto :goto_2

    .line 121
    :cond_2
    move/from16 v20, v4

    .line 122
    .line 123
    not-long v2, v9

    .line 124
    const/4 v4, 0x6

    .line 125
    shl-long/2addr v2, v4

    .line 126
    and-long/2addr v2, v9

    .line 127
    and-long/2addr v2, v13

    .line 128
    cmp-long v2, v2, v17

    .line 129
    .line 130
    const/16 v3, 0x8

    .line 131
    .line 132
    if-eqz v2, :cond_12

    .line 133
    .line 134
    invoke-virtual {v0, v5}, La/iz40;->e(I)I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    iget v2, v0, La/iz40;->f:I

    .line 139
    .line 140
    const-wide/16 v8, 0xff

    .line 141
    .line 142
    if-nez v2, :cond_3

    .line 143
    .line 144
    iget-object v2, v0, La/iz40;->a:[J

    .line 145
    .line 146
    shr-int/lit8 v10, v1, 0x3

    .line 147
    .line 148
    aget-wide v17, v2, v10

    .line 149
    .line 150
    and-int/lit8 v2, v1, 0x7

    .line 151
    .line 152
    shl-int/lit8 v2, v2, 0x3

    .line 153
    .line 154
    shr-long v17, v17, v2

    .line 155
    .line 156
    and-long v17, v17, v8

    .line 157
    .line 158
    const-wide/16 v21, 0xfe

    .line 159
    .line 160
    cmp-long v2, v17, v21

    .line 161
    .line 162
    if-nez v2, :cond_4

    .line 163
    .line 164
    :cond_3
    move-wide/from16 v27, v8

    .line 165
    .line 166
    move-wide/from16 v25, v11

    .line 167
    .line 168
    const/16 p1, 0x7

    .line 169
    .line 170
    const-wide/16 v23, 0x80

    .line 171
    .line 172
    goto/16 :goto_e

    .line 173
    .line 174
    :cond_4
    iget v1, v0, La/iz40;->c:I

    .line 175
    .line 176
    if-le v1, v3, :cond_d

    .line 177
    .line 178
    iget v2, v0, La/iz40;->d:I

    .line 179
    .line 180
    move v10, v3

    .line 181
    const/16 p1, 0x7

    .line 182
    .line 183
    int-to-long v3, v2

    .line 184
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 185
    .line 186
    const-wide/16 v17, 0x20

    .line 187
    .line 188
    mul-long v3, v3, v17

    .line 189
    .line 190
    int-to-long v1, v1

    .line 191
    const-wide/16 v17, 0x19

    .line 192
    .line 193
    mul-long v1, v1, v17

    .line 194
    .line 195
    const-wide/high16 v17, -0x8000000000000000L

    .line 196
    .line 197
    xor-long v3, v3, v17

    .line 198
    .line 199
    xor-long v1, v1, v17

    .line 200
    .line 201
    invoke-static {v3, v4, v1, v2}, Ljava/lang/Long;->compare(JJ)I

    .line 202
    .line 203
    .line 204
    move-result v1

    .line 205
    if-gtz v1, :cond_c

    .line 206
    .line 207
    iget-object v1, v0, La/iz40;->a:[J

    .line 208
    .line 209
    iget v2, v0, La/iz40;->c:I

    .line 210
    .line 211
    iget-object v3, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 212
    .line 213
    add-int/lit8 v4, v2, 0x7

    .line 214
    .line 215
    shr-int/lit8 v4, v4, 0x3

    .line 216
    .line 217
    move v6, v15

    .line 218
    const-wide/16 v23, 0x80

    .line 219
    .line 220
    :goto_3
    if-ge v6, v4, :cond_5

    .line 221
    .line 222
    aget-wide v25, v1, v6

    .line 223
    .line 224
    move-wide/from16 v27, v8

    .line 225
    .line 226
    and-long v8, v25, v13

    .line 227
    .line 228
    move-wide/from16 v25, v11

    .line 229
    .line 230
    move v12, v10

    .line 231
    not-long v10, v8

    .line 232
    ushr-long v7, v8, p1

    .line 233
    .line 234
    add-long/2addr v10, v7

    .line 235
    const-wide v7, -0x101010101010102L

    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    and-long/2addr v7, v10

    .line 241
    aput-wide v7, v1, v6

    .line 242
    .line 243
    add-int/lit8 v6, v6, 0x1

    .line 244
    .line 245
    move v10, v12

    .line 246
    move-wide/from16 v11, v25

    .line 247
    .line 248
    move-wide/from16 v8, v27

    .line 249
    .line 250
    goto :goto_3

    .line 251
    :cond_5
    move-wide/from16 v27, v8

    .line 252
    .line 253
    move-wide/from16 v25, v11

    .line 254
    .line 255
    move v12, v10

    .line 256
    invoke-static {v1}, La/tx3;->D([J)I

    .line 257
    .line 258
    .line 259
    move-result v4

    .line 260
    add-int/lit8 v6, v4, -0x1

    .line 261
    .line 262
    aget-wide v7, v1, v6

    .line 263
    .line 264
    const-wide v9, 0xffffffffffffffL

    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    and-long/2addr v7, v9

    .line 270
    const-wide/high16 v13, -0x100000000000000L

    .line 271
    .line 272
    or-long/2addr v7, v13

    .line 273
    aput-wide v7, v1, v6

    .line 274
    .line 275
    aget-wide v6, v1, v15

    .line 276
    .line 277
    aput-wide v6, v1, v4

    .line 278
    .line 279
    move v4, v15

    .line 280
    :goto_4
    if-eq v4, v2, :cond_b

    .line 281
    .line 282
    shr-int/lit8 v6, v4, 0x3

    .line 283
    .line 284
    aget-wide v7, v1, v6

    .line 285
    .line 286
    and-int/lit8 v11, v4, 0x7

    .line 287
    .line 288
    shl-int/lit8 v11, v11, 0x3

    .line 289
    .line 290
    shr-long/2addr v7, v11

    .line 291
    and-long v7, v7, v27

    .line 292
    .line 293
    cmp-long v13, v7, v23

    .line 294
    .line 295
    if-nez v13, :cond_6

    .line 296
    .line 297
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 298
    .line 299
    goto :goto_4

    .line 300
    :cond_6
    cmp-long v7, v7, v21

    .line 301
    .line 302
    if-eqz v7, :cond_7

    .line 303
    .line 304
    goto :goto_5

    .line 305
    :cond_7
    aget-object v7, v3, v4

    .line 306
    .line 307
    if-eqz v7, :cond_8

    .line 308
    .line 309
    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    .line 310
    .line 311
    .line 312
    move-result v7

    .line 313
    goto :goto_6

    .line 314
    :cond_8
    move v7, v15

    .line 315
    :goto_6
    ushr-int/lit8 v8, v7, 0x10

    .line 316
    .line 317
    xor-int/2addr v7, v8

    .line 318
    mul-int v7, v7, v20

    .line 319
    .line 320
    ushr-int/lit8 v8, v7, 0x10

    .line 321
    .line 322
    xor-int/2addr v7, v8

    .line 323
    ushr-int/lit8 v8, v7, 0x7

    .line 324
    .line 325
    invoke-virtual {v0, v8}, La/iz40;->e(I)I

    .line 326
    .line 327
    .line 328
    move-result v13

    .line 329
    and-int/2addr v8, v2

    .line 330
    sub-int v14, v13, v8

    .line 331
    .line 332
    and-int/2addr v14, v2

    .line 333
    div-int/2addr v14, v12

    .line 334
    sub-int v8, v4, v8

    .line 335
    .line 336
    and-int/2addr v8, v2

    .line 337
    div-int/2addr v8, v12

    .line 338
    if-ne v14, v8, :cond_9

    .line 339
    .line 340
    and-int/lit8 v7, v7, 0x7f

    .line 341
    .line 342
    int-to-long v7, v7

    .line 343
    aget-wide v13, v1, v6

    .line 344
    .line 345
    move-wide/from16 v29, v9

    .line 346
    .line 347
    shl-long v9, v27, v11

    .line 348
    .line 349
    not-long v9, v9

    .line 350
    and-long/2addr v9, v13

    .line 351
    shl-long/2addr v7, v11

    .line 352
    or-long/2addr v7, v9

    .line 353
    aput-wide v7, v1, v6

    .line 354
    .line 355
    array-length v6, v1

    .line 356
    add-int/lit8 v6, v6, -0x1

    .line 357
    .line 358
    aget-wide v7, v1, v15

    .line 359
    .line 360
    and-long v7, v7, v29

    .line 361
    .line 362
    or-long v7, v7, v17

    .line 363
    .line 364
    aput-wide v7, v1, v6

    .line 365
    .line 366
    add-int/lit8 v4, v4, 0x1

    .line 367
    .line 368
    move-wide/from16 v9, v29

    .line 369
    .line 370
    goto :goto_4

    .line 371
    :cond_9
    move-wide/from16 v29, v9

    .line 372
    .line 373
    shr-int/lit8 v8, v13, 0x3

    .line 374
    .line 375
    aget-wide v9, v1, v8

    .line 376
    .line 377
    and-int/lit8 v14, v13, 0x7

    .line 378
    .line 379
    shl-int/lit8 v14, v14, 0x3

    .line 380
    .line 381
    shr-long v31, v9, v14

    .line 382
    .line 383
    and-long v31, v31, v27

    .line 384
    .line 385
    cmp-long v19, v31, v23

    .line 386
    .line 387
    if-nez v19, :cond_a

    .line 388
    .line 389
    and-int/lit8 v7, v7, 0x7f

    .line 390
    .line 391
    move/from16 v31, v12

    .line 392
    .line 393
    move/from16 v19, v13

    .line 394
    .line 395
    int-to-long v12, v7

    .line 396
    move/from16 v32, v2

    .line 397
    .line 398
    move-object/from16 v33, v3

    .line 399
    .line 400
    shl-long v2, v27, v14

    .line 401
    .line 402
    not-long v2, v2

    .line 403
    and-long/2addr v2, v9

    .line 404
    shl-long v9, v12, v14

    .line 405
    .line 406
    or-long/2addr v2, v9

    .line 407
    aput-wide v2, v1, v8

    .line 408
    .line 409
    aget-wide v2, v1, v6

    .line 410
    .line 411
    shl-long v7, v27, v11

    .line 412
    .line 413
    not-long v7, v7

    .line 414
    and-long/2addr v2, v7

    .line 415
    shl-long v7, v23, v11

    .line 416
    .line 417
    or-long/2addr v2, v7

    .line 418
    aput-wide v2, v1, v6

    .line 419
    .line 420
    aget-object v2, v33, v4

    .line 421
    .line 422
    aput-object v2, v33, v19

    .line 423
    .line 424
    const/4 v2, 0x0

    .line 425
    aput-object v2, v33, v4

    .line 426
    .line 427
    goto :goto_7

    .line 428
    :cond_a
    move/from16 v32, v2

    .line 429
    .line 430
    move-object/from16 v33, v3

    .line 431
    .line 432
    move/from16 v31, v12

    .line 433
    .line 434
    move/from16 v19, v13

    .line 435
    .line 436
    and-int/lit8 v2, v7, 0x7f

    .line 437
    .line 438
    int-to-long v2, v2

    .line 439
    shl-long v6, v27, v14

    .line 440
    .line 441
    not-long v6, v6

    .line 442
    and-long/2addr v6, v9

    .line 443
    shl-long/2addr v2, v14

    .line 444
    or-long/2addr v2, v6

    .line 445
    aput-wide v2, v1, v8

    .line 446
    .line 447
    aget-object v2, v33, v19

    .line 448
    .line 449
    aget-object v3, v33, v4

    .line 450
    .line 451
    aput-object v3, v33, v19

    .line 452
    .line 453
    aput-object v2, v33, v4

    .line 454
    .line 455
    add-int/lit8 v4, v4, -0x1

    .line 456
    .line 457
    :goto_7
    array-length v2, v1

    .line 458
    add-int/lit8 v2, v2, -0x1

    .line 459
    .line 460
    aget-wide v6, v1, v15

    .line 461
    .line 462
    and-long v6, v6, v29

    .line 463
    .line 464
    or-long v6, v6, v17

    .line 465
    .line 466
    aput-wide v6, v1, v2

    .line 467
    .line 468
    add-int/lit8 v4, v4, 0x1

    .line 469
    .line 470
    move-wide/from16 v9, v29

    .line 471
    .line 472
    move/from16 v12, v31

    .line 473
    .line 474
    move/from16 v2, v32

    .line 475
    .line 476
    move-object/from16 v3, v33

    .line 477
    .line 478
    goto/16 :goto_4

    .line 479
    .line 480
    :cond_b
    iget v1, v0, La/iz40;->c:I

    .line 481
    .line 482
    invoke-static {v1}, La/u1h0;->a(I)I

    .line 483
    .line 484
    .line 485
    move-result v1

    .line 486
    iget v2, v0, La/iz40;->d:I

    .line 487
    .line 488
    sub-int/2addr v1, v2

    .line 489
    iput v1, v0, La/iz40;->f:I

    .line 490
    .line 491
    goto/16 :goto_d

    .line 492
    .line 493
    :cond_c
    :goto_8
    move-wide/from16 v27, v8

    .line 494
    .line 495
    move-wide/from16 v25, v11

    .line 496
    .line 497
    const-wide/16 v23, 0x80

    .line 498
    .line 499
    goto :goto_9

    .line 500
    :cond_d
    const/16 p1, 0x7

    .line 501
    .line 502
    goto :goto_8

    .line 503
    :goto_9
    iget v1, v0, La/iz40;->c:I

    .line 504
    .line 505
    invoke-static {v1}, La/u1h0;->b(I)I

    .line 506
    .line 507
    .line 508
    move-result v1

    .line 509
    iget-object v2, v0, La/iz40;->a:[J

    .line 510
    .line 511
    iget-object v3, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 512
    .line 513
    iget v4, v0, La/iz40;->c:I

    .line 514
    .line 515
    invoke-virtual {v0, v1}, La/iz40;->f(I)V

    .line 516
    .line 517
    .line 518
    iget-object v1, v0, La/iz40;->a:[J

    .line 519
    .line 520
    iget-object v6, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 521
    .line 522
    iget v7, v0, La/iz40;->c:I

    .line 523
    .line 524
    move v8, v15

    .line 525
    :goto_a
    if-ge v8, v4, :cond_10

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
    and-long v9, v9, v27

    .line 537
    .line 538
    cmp-long v9, v9, v23

    .line 539
    .line 540
    if-gez v9, :cond_f

    .line 541
    .line 542
    aget-object v9, v3, v8

    .line 543
    .line 544
    if-eqz v9, :cond_e

    .line 545
    .line 546
    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    .line 547
    .line 548
    .line 549
    move-result v10

    .line 550
    goto :goto_b

    .line 551
    :cond_e
    move v10, v15

    .line 552
    :goto_b
    ushr-int/lit8 v11, v10, 0x10

    .line 553
    .line 554
    xor-int/2addr v10, v11

    .line 555
    mul-int v10, v10, v20

    .line 556
    .line 557
    ushr-int/lit8 v11, v10, 0x10

    .line 558
    .line 559
    xor-int/2addr v10, v11

    .line 560
    ushr-int/lit8 v11, v10, 0x7

    .line 561
    .line 562
    invoke-virtual {v0, v11}, La/iz40;->e(I)I

    .line 563
    .line 564
    .line 565
    move-result v11

    .line 566
    and-int/lit8 v10, v10, 0x7f

    .line 567
    .line 568
    int-to-long v12, v10

    .line 569
    shr-int/lit8 v10, v11, 0x3

    .line 570
    .line 571
    and-int/lit8 v14, v11, 0x7

    .line 572
    .line 573
    shl-int/lit8 v14, v14, 0x3

    .line 574
    .line 575
    aget-wide v17, v1, v10

    .line 576
    .line 577
    move-object/from16 v21, v1

    .line 578
    .line 579
    move-object/from16 v19, v2

    .line 580
    .line 581
    shl-long v1, v27, v14

    .line 582
    .line 583
    not-long v1, v1

    .line 584
    and-long v1, v17, v1

    .line 585
    .line 586
    shl-long/2addr v12, v14

    .line 587
    or-long/2addr v1, v12

    .line 588
    aput-wide v1, v21, v10

    .line 589
    .line 590
    add-int/lit8 v10, v11, -0x7

    .line 591
    .line 592
    and-int/2addr v10, v7

    .line 593
    and-int/lit8 v12, v7, 0x7

    .line 594
    .line 595
    add-int/2addr v10, v12

    .line 596
    shr-int/lit8 v10, v10, 0x3

    .line 597
    .line 598
    aput-wide v1, v21, v10

    .line 599
    .line 600
    aput-object v9, v6, v11

    .line 601
    .line 602
    goto :goto_c

    .line 603
    :cond_f
    move-object/from16 v21, v1

    .line 604
    .line 605
    move-object/from16 v19, v2

    .line 606
    .line 607
    :goto_c
    add-int/lit8 v8, v8, 0x1

    .line 608
    .line 609
    move-object/from16 v2, v19

    .line 610
    .line 611
    move-object/from16 v1, v21

    .line 612
    .line 613
    goto :goto_a

    .line 614
    :cond_10
    :goto_d
    invoke-virtual {v0, v5}, La/iz40;->e(I)I

    .line 615
    .line 616
    .line 617
    move-result v1

    .line 618
    :goto_e
    iget v2, v0, La/iz40;->d:I

    .line 619
    .line 620
    add-int/lit8 v2, v2, 0x1

    .line 621
    .line 622
    iput v2, v0, La/iz40;->d:I

    .line 623
    .line 624
    iget v2, v0, La/iz40;->f:I

    .line 625
    .line 626
    iget-object v3, v0, La/iz40;->a:[J

    .line 627
    .line 628
    shr-int/lit8 v4, v1, 0x3

    .line 629
    .line 630
    aget-wide v5, v3, v4

    .line 631
    .line 632
    and-int/lit8 v7, v1, 0x7

    .line 633
    .line 634
    shl-int/lit8 v7, v7, 0x3

    .line 635
    .line 636
    shr-long v8, v5, v7

    .line 637
    .line 638
    and-long v8, v8, v27

    .line 639
    .line 640
    cmp-long v8, v8, v23

    .line 641
    .line 642
    if-nez v8, :cond_11

    .line 643
    .line 644
    move/from16 v15, v16

    .line 645
    .line 646
    :cond_11
    sub-int/2addr v2, v15

    .line 647
    iput v2, v0, La/iz40;->f:I

    .line 648
    .line 649
    iget v0, v0, La/iz40;->c:I

    .line 650
    .line 651
    shl-long v8, v27, v7

    .line 652
    .line 653
    not-long v8, v8

    .line 654
    and-long/2addr v5, v8

    .line 655
    shl-long v7, v25, v7

    .line 656
    .line 657
    or-long/2addr v5, v7

    .line 658
    aput-wide v5, v3, v4

    .line 659
    .line 660
    add-int/lit8 v2, v1, -0x7

    .line 661
    .line 662
    and-int/2addr v2, v0

    .line 663
    and-int/lit8 v0, v0, 0x7

    .line 664
    .line 665
    add-int/2addr v2, v0

    .line 666
    shr-int/lit8 v0, v2, 0x3

    .line 667
    .line 668
    aput-wide v5, v3, v0

    .line 669
    .line 670
    return v1

    .line 671
    :cond_12
    move/from16 v31, v3

    .line 672
    .line 673
    add-int/lit8 v8, v8, 0x8

    .line 674
    .line 675
    add-int/2addr v7, v8

    .line 676
    and-int/2addr v7, v6

    .line 677
    move/from16 v3, v19

    .line 678
    .line 679
    move/from16 v4, v20

    .line 680
    .line 681
    goto/16 :goto_1
.end method

.method public final e(I)I
    .locals 9

    .line 1
    iget v0, p0, La/iz40;->c:I

    .line 2
    .line 3
    and-int/2addr p1, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    iget-object v2, p0, La/iz40;->a:[J

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
    instance-of v1, p1, La/iz40;

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
    check-cast p1, La/iz40;

    .line 12
    .line 13
    iget v1, p1, La/iz40;->d:I

    .line 14
    .line 15
    iget v3, p0, La/iz40;->d:I

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-object v1, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 21
    .line 22
    iget-object p0, p0, La/iz40;->a:[J

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
    aget-object v10, v1, v10

    .line 71
    .line 72
    invoke-virtual {p1, v10}, La/iz40;->c(Ljava/lang/Object;)Z

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
    iput p1, p0, La/iz40;->c:I

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
    iput-object v0, p0, La/iz40;->a:[J

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
    iget v0, p0, La/iz40;->c:I

    .line 59
    .line 60
    invoke-static {v0}, La/u1h0;->a(I)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v1, p0, La/iz40;->d:I

    .line 65
    .line 66
    sub-int/2addr v0, v1

    .line 67
    iput v0, p0, La/iz40;->f:I

    .line 68
    .line 69
    if-nez p1, :cond_2

    .line 70
    .line 71
    sget-object p1, La/jd8;->j:[Ljava/lang/Object;

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_2
    new-array p1, p1, [Ljava/lang/Object;

    .line 75
    .line 76
    :goto_2
    iput-object p1, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 77
    .line 78
    return-void
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget p0, p0, La/iz40;->d:I

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final h()Z
    .locals 0

    .line 1
    iget p0, p0, La/iz40;->d:I

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public final hashCode()I
    .locals 14

    .line 1
    iget-object v0, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 2
    .line 3
    iget-object p0, p0, La/iz40;->a:[J

    .line 4
    .line 5
    array-length v1, p0

    .line 6
    add-int/lit8 v1, v1, -0x2

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ltz v1, :cond_6

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
    if-eqz v7, :cond_4

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
    if-ge v9, v7, :cond_2

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
    if-gez v10, :cond_1

    .line 49
    .line 50
    shl-int/lit8 v10, v3, 0x3

    .line 51
    .line 52
    add-int/2addr v10, v9

    .line 53
    aget-object v10, v0, v10

    .line 54
    .line 55
    if-eqz v10, :cond_0

    .line 56
    .line 57
    invoke-virtual {v10}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    goto :goto_2

    .line 62
    :cond_0
    move v10, v2

    .line 63
    :goto_2
    add-int/2addr v4, v10

    .line 64
    :cond_1
    shr-long/2addr v5, v8

    .line 65
    add-int/lit8 v9, v9, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    if-ne v7, v8, :cond_3

    .line 69
    .line 70
    goto :goto_3

    .line 71
    :cond_3
    return v4

    .line 72
    :cond_4
    :goto_3
    if-eq v3, v1, :cond_5

    .line 73
    .line 74
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_5
    return v4

    .line 78
    :cond_6
    return v2
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v1, v0

    .line 10
    :goto_0
    ushr-int/lit8 v2, v1, 0x10

    .line 11
    .line 12
    xor-int/2addr v1, v2

    .line 13
    const v2, -0x3361d2af    # -8.293031E7f

    .line 14
    .line 15
    .line 16
    mul-int/2addr v1, v2

    .line 17
    ushr-int/lit8 v2, v1, 0x10

    .line 18
    .line 19
    xor-int/2addr v1, v2

    .line 20
    and-int/lit8 v2, v1, 0x7f

    .line 21
    .line 22
    iget v3, p0, La/iz40;->c:I

    .line 23
    .line 24
    ushr-int/lit8 v1, v1, 0x7

    .line 25
    .line 26
    :goto_1
    and-int/2addr v1, v3

    .line 27
    iget-object v4, p0, La/iz40;->a:[J

    .line 28
    .line 29
    shr-int/lit8 v5, v1, 0x3

    .line 30
    .line 31
    and-int/lit8 v6, v1, 0x7

    .line 32
    .line 33
    shl-int/lit8 v6, v6, 0x3

    .line 34
    .line 35
    aget-wide v7, v4, v5

    .line 36
    .line 37
    ushr-long/2addr v7, v6

    .line 38
    add-int/lit8 v5, v5, 0x1

    .line 39
    .line 40
    aget-wide v9, v4, v5

    .line 41
    .line 42
    rsub-int/lit8 v4, v6, 0x40

    .line 43
    .line 44
    shl-long v4, v9, v4

    .line 45
    .line 46
    int-to-long v9, v6

    .line 47
    neg-long v9, v9

    .line 48
    const/16 v6, 0x3f

    .line 49
    .line 50
    shr-long/2addr v9, v6

    .line 51
    and-long/2addr v4, v9

    .line 52
    or-long/2addr v4, v7

    .line 53
    int-to-long v6, v2

    .line 54
    const-wide v8, 0x101010101010101L

    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    mul-long/2addr v6, v8

    .line 60
    xor-long/2addr v6, v4

    .line 61
    sub-long v8, v6, v8

    .line 62
    .line 63
    not-long v6, v6

    .line 64
    and-long/2addr v6, v8

    .line 65
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    and-long/2addr v6, v8

    .line 71
    :goto_2
    const-wide/16 v10, 0x0

    .line 72
    .line 73
    cmp-long v12, v6, v10

    .line 74
    .line 75
    if-eqz v12, :cond_2

    .line 76
    .line 77
    invoke-static {v6, v7}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 78
    .line 79
    .line 80
    move-result v10

    .line 81
    shr-int/lit8 v10, v10, 0x3

    .line 82
    .line 83
    add-int/2addr v10, v1

    .line 84
    and-int/2addr v10, v3

    .line 85
    iget-object v11, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 86
    .line 87
    aget-object v11, v11, v10

    .line 88
    .line 89
    invoke-static {v11, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v11

    .line 93
    if-eqz v11, :cond_1

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_1
    const-wide/16 v10, 0x1

    .line 97
    .line 98
    sub-long v10, v6, v10

    .line 99
    .line 100
    and-long/2addr v6, v10

    .line 101
    goto :goto_2

    .line 102
    :cond_2
    not-long v6, v4

    .line 103
    const/4 v12, 0x6

    .line 104
    shl-long/2addr v6, v12

    .line 105
    and-long/2addr v4, v6

    .line 106
    and-long/2addr v4, v8

    .line 107
    cmp-long v4, v4, v10

    .line 108
    .line 109
    if-eqz v4, :cond_4

    .line 110
    .line 111
    const/4 v10, -0x1

    .line 112
    :goto_3
    if-ltz v10, :cond_3

    .line 113
    .line 114
    invoke-virtual {p0, v10}, La/iz40;->m(I)V

    .line 115
    .line 116
    .line 117
    :cond_3
    return-void

    .line 118
    :cond_4
    add-int/lit8 v0, v0, 0x8

    .line 119
    .line 120
    add-int/2addr v1, v0

    .line 121
    goto :goto_1
.end method

.method public final j(La/iz40;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, La/iz40;->b:[Ljava/lang/Object;

    .line 5
    .line 6
    iget-object p1, p1, La/iz40;->a:[J

    .line 7
    .line 8
    array-length v1, p1

    .line 9
    add-int/lit8 v1, v1, -0x2

    .line 10
    .line 11
    if-ltz v1, :cond_3

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    move v3, v2

    .line 15
    :goto_0
    aget-wide v4, p1, v3

    .line 16
    .line 17
    not-long v6, v4

    .line 18
    const/4 v8, 0x7

    .line 19
    shl-long/2addr v6, v8

    .line 20
    and-long/2addr v6, v4

    .line 21
    const-wide v8, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    and-long/2addr v6, v8

    .line 27
    cmp-long v6, v6, v8

    .line 28
    .line 29
    if-eqz v6, :cond_2

    .line 30
    .line 31
    sub-int v6, v3, v1

    .line 32
    .line 33
    not-int v6, v6

    .line 34
    ushr-int/lit8 v6, v6, 0x1f

    .line 35
    .line 36
    const/16 v7, 0x8

    .line 37
    .line 38
    rsub-int/lit8 v6, v6, 0x8

    .line 39
    .line 40
    move v8, v2

    .line 41
    :goto_1
    if-ge v8, v6, :cond_1

    .line 42
    .line 43
    const-wide/16 v9, 0xff

    .line 44
    .line 45
    and-long/2addr v9, v4

    .line 46
    const-wide/16 v11, 0x80

    .line 47
    .line 48
    cmp-long v9, v9, v11

    .line 49
    .line 50
    if-gez v9, :cond_0

    .line 51
    .line 52
    shl-int/lit8 v9, v3, 0x3

    .line 53
    .line 54
    add-int/2addr v9, v8

    .line 55
    aget-object v9, v0, v9

    .line 56
    .line 57
    invoke-virtual {p0, v9}, La/iz40;->k(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    :cond_0
    shr-long/2addr v4, v7

    .line 61
    add-int/lit8 v8, v8, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    if-ne v6, v7, :cond_3

    .line 65
    .line 66
    :cond_2
    if-eq v3, v1, :cond_3

    .line 67
    .line 68
    add-int/lit8 v3, v3, 0x1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_3
    return-void
.end method

.method public final k(Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/iz40;->d(Ljava/lang/Object;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object p0, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 6
    .line 7
    aput-object p1, p0, v0

    .line 8
    .line 9
    return-void
.end method

.method public final l(Ljava/lang/Object;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v3

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move v3, v2

    .line 14
    :goto_0
    ushr-int/lit8 v4, v3, 0x10

    .line 15
    .line 16
    xor-int/2addr v3, v4

    .line 17
    const v4, -0x3361d2af    # -8.293031E7f

    .line 18
    .line 19
    .line 20
    mul-int/2addr v3, v4

    .line 21
    ushr-int/lit8 v4, v3, 0x10

    .line 22
    .line 23
    xor-int/2addr v3, v4

    .line 24
    and-int/lit8 v4, v3, 0x7f

    .line 25
    .line 26
    iget v5, v0, La/iz40;->c:I

    .line 27
    .line 28
    ushr-int/lit8 v3, v3, 0x7

    .line 29
    .line 30
    and-int/2addr v3, v5

    .line 31
    move v6, v2

    .line 32
    :goto_1
    iget-object v7, v0, La/iz40;->a:[J

    .line 33
    .line 34
    shr-int/lit8 v8, v3, 0x3

    .line 35
    .line 36
    and-int/lit8 v9, v3, 0x7

    .line 37
    .line 38
    shl-int/lit8 v9, v9, 0x3

    .line 39
    .line 40
    aget-wide v10, v7, v8

    .line 41
    .line 42
    ushr-long/2addr v10, v9

    .line 43
    const/4 v12, 0x1

    .line 44
    add-int/2addr v8, v12

    .line 45
    aget-wide v13, v7, v8

    .line 46
    .line 47
    rsub-int/lit8 v7, v9, 0x40

    .line 48
    .line 49
    shl-long v7, v13, v7

    .line 50
    .line 51
    int-to-long v13, v9

    .line 52
    neg-long v13, v13

    .line 53
    const/16 v9, 0x3f

    .line 54
    .line 55
    shr-long/2addr v13, v9

    .line 56
    and-long/2addr v7, v13

    .line 57
    or-long/2addr v7, v10

    .line 58
    int-to-long v9, v4

    .line 59
    const-wide v13, 0x101010101010101L

    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    mul-long/2addr v9, v13

    .line 65
    xor-long/2addr v9, v7

    .line 66
    sub-long v13, v9, v13

    .line 67
    .line 68
    not-long v9, v9

    .line 69
    and-long/2addr v9, v13

    .line 70
    const-wide v13, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    and-long/2addr v9, v13

    .line 76
    :goto_2
    const-wide/16 v15, 0x0

    .line 77
    .line 78
    cmp-long v11, v9, v15

    .line 79
    .line 80
    if-eqz v11, :cond_2

    .line 81
    .line 82
    invoke-static {v9, v10}, Ljava/lang/Long;->numberOfTrailingZeros(J)I

    .line 83
    .line 84
    .line 85
    move-result v11

    .line 86
    shr-int/lit8 v11, v11, 0x3

    .line 87
    .line 88
    add-int/2addr v11, v3

    .line 89
    and-int/2addr v11, v5

    .line 90
    iget-object v15, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 91
    .line 92
    aget-object v15, v15, v11

    .line 93
    .line 94
    invoke-static {v15, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v15

    .line 98
    if-eqz v15, :cond_1

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_1
    const-wide/16 v15, 0x1

    .line 102
    .line 103
    sub-long v15, v9, v15

    .line 104
    .line 105
    and-long/2addr v9, v15

    .line 106
    goto :goto_2

    .line 107
    :cond_2
    not-long v9, v7

    .line 108
    const/4 v11, 0x6

    .line 109
    shl-long/2addr v9, v11

    .line 110
    and-long/2addr v7, v9

    .line 111
    and-long/2addr v7, v13

    .line 112
    cmp-long v7, v7, v15

    .line 113
    .line 114
    if-eqz v7, :cond_5

    .line 115
    .line 116
    const/4 v11, -0x1

    .line 117
    :goto_3
    if-ltz v11, :cond_3

    .line 118
    .line 119
    move v2, v12

    .line 120
    :cond_3
    if-eqz v2, :cond_4

    .line 121
    .line 122
    invoke-virtual {v0, v11}, La/iz40;->m(I)V

    .line 123
    .line 124
    .line 125
    :cond_4
    return v2

    .line 126
    :cond_5
    add-int/lit8 v6, v6, 0x8

    .line 127
    .line 128
    add-int/2addr v3, v6

    .line 129
    and-int/2addr v3, v5

    .line 130
    goto :goto_1
.end method

.method public final m(I)V
    .locals 8

    .line 1
    iget v0, p0, La/iz40;->d:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    iput v0, p0, La/iz40;->d:I

    .line 6
    .line 7
    iget-object v0, p0, La/iz40;->a:[J

    .line 8
    .line 9
    iget v1, p0, La/iz40;->c:I

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
    iget-object p0, p0, La/iz40;->b:[Ljava/lang/Object;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    aput-object v0, p0, p1

    .line 45
    .line 46
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "["

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, v0, La/iz40;->b:[Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v3, v0, La/iz40;->a:[J

    .line 13
    .line 14
    array-length v4, v3

    .line 15
    add-int/lit8 v4, v4, -0x2

    .line 16
    .line 17
    if-ltz v4, :cond_6

    .line 18
    .line 19
    const/4 v5, 0x0

    .line 20
    move v6, v5

    .line 21
    move v7, v6

    .line 22
    :goto_0
    aget-wide v8, v3, v6

    .line 23
    .line 24
    not-long v10, v8

    .line 25
    const/4 v12, 0x7

    .line 26
    shl-long/2addr v10, v12

    .line 27
    and-long/2addr v10, v8

    .line 28
    const-wide v12, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v10, v12

    .line 34
    cmp-long v10, v10, v12

    .line 35
    .line 36
    if-eqz v10, :cond_5

    .line 37
    .line 38
    sub-int v10, v6, v4

    .line 39
    .line 40
    not-int v10, v10

    .line 41
    ushr-int/lit8 v10, v10, 0x1f

    .line 42
    .line 43
    const/16 v11, 0x8

    .line 44
    .line 45
    rsub-int/lit8 v10, v10, 0x8

    .line 46
    .line 47
    move v12, v5

    .line 48
    :goto_1
    if-ge v12, v10, :cond_4

    .line 49
    .line 50
    const-wide/16 v13, 0xff

    .line 51
    .line 52
    and-long/2addr v13, v8

    .line 53
    const-wide/16 v15, 0x80

    .line 54
    .line 55
    cmp-long v13, v13, v15

    .line 56
    .line 57
    if-gez v13, :cond_3

    .line 58
    .line 59
    shl-int/lit8 v13, v6, 0x3

    .line 60
    .line 61
    add-int/2addr v13, v12

    .line 62
    aget-object v13, v2, v13

    .line 63
    .line 64
    if-eqz v7, :cond_0

    .line 65
    .line 66
    const-string v14, ", "

    .line 67
    .line 68
    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_0
    const/4 v14, -0x1

    .line 72
    if-ne v7, v14, :cond_1

    .line 73
    .line 74
    const-string v0, "..."

    .line 75
    .line 76
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_1
    if-ne v13, v0, :cond_2

    .line 81
    .line 82
    const-string v13, "(this)"

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    invoke-static {v13}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v13

    .line 89
    :goto_2
    invoke-virtual {v1, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    add-int/lit8 v7, v7, 0x1

    .line 93
    .line 94
    :cond_3
    shr-long/2addr v8, v11

    .line 95
    add-int/lit8 v12, v12, 0x1

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_4
    if-ne v10, v11, :cond_6

    .line 99
    .line 100
    :cond_5
    if-eq v6, v4, :cond_6

    .line 101
    .line 102
    add-int/lit8 v6, v6, 0x1

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_6
    :goto_3
    const-string v0, "]"

    .line 106
    .line 107
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0
.end method
