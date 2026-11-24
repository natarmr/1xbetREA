.class public abstract La/jg80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/a1d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/a1d;

    .line 2
    .line 3
    const/16 v1, 0x15

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/a1d;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/jg80;->a:La/a1d;

    .line 9
    .line 10
    return-void
.end method

.method public static a(La/egk;)La/sq8;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/16 v16, 0x0

    .line 6
    .line 7
    goto/16 :goto_7

    .line 8
    .line 9
    :cond_0
    iget-boolean v2, v0, La/egk;->d:Z

    .line 10
    .line 11
    iget-object v3, v0, La/zri;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, La/sq8;

    .line 14
    .line 15
    iget-object v4, v3, La/sq8;->i:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v4, La/d3g0;

    .line 18
    .line 19
    iget-object v5, v3, La/sq8;->g:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v5, La/d3g0;

    .line 22
    .line 23
    iget-object v6, v3, La/sq8;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v6, La/d3g0;

    .line 26
    .line 27
    iget-object v7, v3, La/sq8;->f:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v7, La/d3g0;

    .line 30
    .line 31
    iget-object v8, v0, La/zri;->c:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v8, [La/ku5;

    .line 34
    .line 35
    invoke-virtual {v0}, La/egk;->q()La/ku5;

    .line 36
    .line 37
    .line 38
    move-result-object v9

    .line 39
    const/4 v10, -0x1

    .line 40
    const/4 v11, 0x0

    .line 41
    const/4 v12, 0x1

    .line 42
    if-nez v9, :cond_1

    .line 43
    .line 44
    const/4 v0, 0x0

    .line 45
    const/16 v16, 0x0

    .line 46
    .line 47
    goto :goto_6

    .line 48
    :cond_1
    iget v9, v9, La/ku5;->f:I

    .line 49
    .line 50
    if-eqz v2, :cond_2

    .line 51
    .line 52
    move-object v13, v7

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move-object v13, v6

    .line 55
    :goto_0
    if-eqz v2, :cond_3

    .line 56
    .line 57
    move-object v14, v5

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    move-object v14, v4

    .line 60
    :goto_1
    iget v13, v13, La/d3g0;->b:F

    .line 61
    .line 62
    float-to-int v13, v13

    .line 63
    invoke-virtual {v0, v13}, La/zri;->d(I)I

    .line 64
    .line 65
    .line 66
    move-result v13

    .line 67
    iget v14, v14, La/d3g0;->b:F

    .line 68
    .line 69
    float-to-int v14, v14

    .line 70
    invoke-virtual {v0, v14}, La/zri;->d(I)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    move v14, v10

    .line 75
    :goto_2
    if-ge v13, v0, :cond_8

    .line 76
    .line 77
    aget-object v15, v8, v13

    .line 78
    .line 79
    if-nez v15, :cond_4

    .line 80
    .line 81
    const/16 v16, 0x0

    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_4
    invoke-virtual {v15}, La/ku5;->c()V

    .line 85
    .line 86
    .line 87
    iget v15, v15, La/ku5;->f:I

    .line 88
    .line 89
    const/16 v16, 0x0

    .line 90
    .line 91
    sub-int v1, v15, v14

    .line 92
    .line 93
    if-nez v1, :cond_5

    .line 94
    .line 95
    goto :goto_3

    .line 96
    :cond_5
    if-ne v1, v12, :cond_7

    .line 97
    .line 98
    :cond_6
    move v14, v15

    .line 99
    goto :goto_3

    .line 100
    :cond_7
    if-lt v15, v9, :cond_6

    .line 101
    .line 102
    aput-object v16, v8, v13

    .line 103
    .line 104
    :goto_3
    add-int/lit8 v13, v13, 0x1

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_8
    const/16 v16, 0x0

    .line 108
    .line 109
    new-array v0, v9, [I

    .line 110
    .line 111
    array-length v1, v8

    .line 112
    move v13, v11

    .line 113
    :goto_4
    if-ge v13, v1, :cond_b

    .line 114
    .line 115
    aget-object v14, v8, v13

    .line 116
    .line 117
    if-eqz v14, :cond_a

    .line 118
    .line 119
    iget v14, v14, La/ku5;->f:I

    .line 120
    .line 121
    if-lt v14, v9, :cond_9

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_9
    aget v15, v0, v14

    .line 125
    .line 126
    add-int/2addr v15, v12

    .line 127
    aput v15, v0, v14

    .line 128
    .line 129
    :cond_a
    :goto_5
    add-int/lit8 v13, v13, 0x1

    .line 130
    .line 131
    goto :goto_4

    .line 132
    :cond_b
    :goto_6
    if-nez v0, :cond_c

    .line 133
    .line 134
    :goto_7
    return-object v16

    .line 135
    :cond_c
    array-length v1, v0

    .line 136
    move v9, v11

    .line 137
    :goto_8
    if-ge v9, v1, :cond_d

    .line 138
    .line 139
    aget v13, v0, v9

    .line 140
    .line 141
    invoke-static {v10, v13}, Ljava/lang/Math;->max(II)I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    add-int/lit8 v9, v9, 0x1

    .line 146
    .line 147
    goto :goto_8

    .line 148
    :cond_d
    array-length v1, v0

    .line 149
    move v9, v11

    .line 150
    move v13, v9

    .line 151
    :goto_9
    if-ge v9, v1, :cond_f

    .line 152
    .line 153
    aget v14, v0, v9

    .line 154
    .line 155
    sub-int v15, v10, v14

    .line 156
    .line 157
    add-int/2addr v13, v15

    .line 158
    if-lez v14, :cond_e

    .line 159
    .line 160
    goto :goto_a

    .line 161
    :cond_e
    add-int/lit8 v9, v9, 0x1

    .line 162
    .line 163
    goto :goto_9

    .line 164
    :cond_f
    :goto_a
    move v1, v11

    .line 165
    :goto_b
    if-lez v13, :cond_10

    .line 166
    .line 167
    aget-object v9, v8, v1

    .line 168
    .line 169
    if-nez v9, :cond_10

    .line 170
    .line 171
    add-int/lit8 v13, v13, -0x1

    .line 172
    .line 173
    add-int/lit8 v1, v1, 0x1

    .line 174
    .line 175
    goto :goto_b

    .line 176
    :cond_10
    array-length v1, v0

    .line 177
    sub-int/2addr v1, v12

    .line 178
    move v9, v11

    .line 179
    :goto_c
    if-ltz v1, :cond_12

    .line 180
    .line 181
    aget v14, v0, v1

    .line 182
    .line 183
    sub-int v15, v10, v14

    .line 184
    .line 185
    add-int/2addr v9, v15

    .line 186
    if-lez v14, :cond_11

    .line 187
    .line 188
    goto :goto_d

    .line 189
    :cond_11
    add-int/lit8 v1, v1, -0x1

    .line 190
    .line 191
    goto :goto_c

    .line 192
    :cond_12
    :goto_d
    array-length v0, v8

    .line 193
    sub-int/2addr v0, v12

    .line 194
    :goto_e
    if-lez v9, :cond_13

    .line 195
    .line 196
    aget-object v1, v8, v0

    .line 197
    .line 198
    if-nez v1, :cond_13

    .line 199
    .line 200
    add-int/lit8 v9, v9, -0x1

    .line 201
    .line 202
    add-int/lit8 v0, v0, -0x1

    .line 203
    .line 204
    goto :goto_e

    .line 205
    :cond_13
    if-lez v13, :cond_17

    .line 206
    .line 207
    if-eqz v2, :cond_14

    .line 208
    .line 209
    move-object v0, v7

    .line 210
    goto :goto_f

    .line 211
    :cond_14
    move-object v0, v6

    .line 212
    :goto_f
    iget v1, v0, La/d3g0;->b:F

    .line 213
    .line 214
    float-to-int v1, v1

    .line 215
    sub-int/2addr v1, v13

    .line 216
    if-gez v1, :cond_15

    .line 217
    .line 218
    goto :goto_10

    .line 219
    :cond_15
    move v11, v1

    .line 220
    :goto_10
    new-instance v1, La/d3g0;

    .line 221
    .line 222
    iget v0, v0, La/d3g0;->a:F

    .line 223
    .line 224
    int-to-float v8, v11

    .line 225
    invoke-direct {v1, v0, v8}, La/d3g0;-><init>(FF)V

    .line 226
    .line 227
    .line 228
    if-eqz v2, :cond_16

    .line 229
    .line 230
    move-object v15, v1

    .line 231
    move-object/from16 v17, v6

    .line 232
    .line 233
    goto :goto_12

    .line 234
    :cond_16
    move-object/from16 v17, v1

    .line 235
    .line 236
    :goto_11
    move-object v15, v7

    .line 237
    goto :goto_12

    .line 238
    :cond_17
    move-object/from16 v17, v6

    .line 239
    .line 240
    goto :goto_11

    .line 241
    :goto_12
    if-lez v9, :cond_1b

    .line 242
    .line 243
    if-eqz v2, :cond_18

    .line 244
    .line 245
    move-object v0, v5

    .line 246
    goto :goto_13

    .line 247
    :cond_18
    move-object v0, v4

    .line 248
    :goto_13
    iget v1, v0, La/d3g0;->b:F

    .line 249
    .line 250
    float-to-int v1, v1

    .line 251
    add-int/2addr v1, v9

    .line 252
    iget-object v6, v3, La/sq8;->e:Ljava/lang/Object;

    .line 253
    .line 254
    check-cast v6, La/r68;

    .line 255
    .line 256
    iget v6, v6, La/r68;->b:I

    .line 257
    .line 258
    if-lt v1, v6, :cond_19

    .line 259
    .line 260
    add-int/lit8 v1, v6, -0x1

    .line 261
    .line 262
    :cond_19
    new-instance v6, La/d3g0;

    .line 263
    .line 264
    iget v0, v0, La/d3g0;->a:F

    .line 265
    .line 266
    int-to-float v1, v1

    .line 267
    invoke-direct {v6, v0, v1}, La/d3g0;-><init>(FF)V

    .line 268
    .line 269
    .line 270
    if-eqz v2, :cond_1a

    .line 271
    .line 272
    move-object/from16 v18, v4

    .line 273
    .line 274
    move-object/from16 v16, v6

    .line 275
    .line 276
    goto :goto_14

    .line 277
    :cond_1a
    move-object/from16 v16, v5

    .line 278
    .line 279
    move-object/from16 v18, v6

    .line 280
    .line 281
    goto :goto_14

    .line 282
    :cond_1b
    move-object/from16 v18, v4

    .line 283
    .line 284
    move-object/from16 v16, v5

    .line 285
    .line 286
    :goto_14
    new-instance v13, La/sq8;

    .line 287
    .line 288
    iget-object v0, v3, La/sq8;->e:Ljava/lang/Object;

    .line 289
    .line 290
    move-object v14, v0

    .line 291
    check-cast v14, La/r68;

    .line 292
    .line 293
    invoke-direct/range {v13 .. v18}, La/sq8;-><init>(La/r68;La/d3g0;La/d3g0;La/d3g0;La/d3g0;)V

    .line 294
    .line 295
    .line 296
    return-object v13
.end method

.method public static b([II[I)La/ykj;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    array-length v2, v0

    .line 6
    if-eqz v2, :cond_49

    .line 7
    .line 8
    add-int/lit8 v2, p1, 0x1

    .line 9
    .line 10
    const/4 v3, 0x1

    .line 11
    shl-int v2, v3, v2

    .line 12
    .line 13
    array-length v4, v1

    .line 14
    div-int/lit8 v5, v2, 0x2

    .line 15
    .line 16
    add-int/lit8 v5, v5, 0x3

    .line 17
    .line 18
    if-gt v4, v5, :cond_48

    .line 19
    .line 20
    if-ltz v2, :cond_48

    .line 21
    .line 22
    const/16 v4, 0x200

    .line 23
    .line 24
    if-gt v2, v4, :cond_48

    .line 25
    .line 26
    sget-object v4, La/jg80;->a:La/a1d;

    .line 27
    .line 28
    iget-object v4, v4, La/a1d;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v4, La/on40;

    .line 31
    .line 32
    array-length v5, v0

    .line 33
    if-eqz v5, :cond_47

    .line 34
    .line 35
    array-length v5, v0

    .line 36
    const/4 v7, 0x0

    .line 37
    if-le v5, v3, :cond_2

    .line 38
    .line 39
    aget v8, v0, v7

    .line 40
    .line 41
    if-nez v8, :cond_2

    .line 42
    .line 43
    move v8, v3

    .line 44
    :goto_0
    if-ge v8, v5, :cond_0

    .line 45
    .line 46
    aget v9, v0, v8

    .line 47
    .line 48
    if-nez v9, :cond_0

    .line 49
    .line 50
    add-int/lit8 v8, v8, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    if-ne v8, v5, :cond_1

    .line 54
    .line 55
    filled-new-array {v7}, [I

    .line 56
    .line 57
    .line 58
    move-result-object v5

    .line 59
    goto :goto_1

    .line 60
    :cond_1
    sub-int/2addr v5, v8

    .line 61
    new-array v9, v5, [I

    .line 62
    .line 63
    invoke-static {v0, v8, v9, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 64
    .line 65
    .line 66
    move-object v5, v9

    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move-object v5, v0

    .line 69
    :goto_1
    new-array v8, v2, [I

    .line 70
    .line 71
    move v9, v2

    .line 72
    move v10, v7

    .line 73
    :goto_2
    if-lez v9, :cond_7

    .line 74
    .line 75
    iget-object v11, v4, La/on40;->a:[I

    .line 76
    .line 77
    aget v11, v11, v9

    .line 78
    .line 79
    if-nez v11, :cond_3

    .line 80
    .line 81
    array-length v11, v5

    .line 82
    sub-int/2addr v11, v3

    .line 83
    aget v11, v5, v11

    .line 84
    .line 85
    goto :goto_5

    .line 86
    :cond_3
    if-ne v11, v3, :cond_5

    .line 87
    .line 88
    array-length v11, v5

    .line 89
    move v12, v7

    .line 90
    move v13, v12

    .line 91
    :goto_3
    if-ge v13, v11, :cond_4

    .line 92
    .line 93
    aget v14, v5, v13

    .line 94
    .line 95
    invoke-virtual {v4, v12, v14}, La/on40;->a(II)I

    .line 96
    .line 97
    .line 98
    move-result v12

    .line 99
    add-int/lit8 v13, v13, 0x1

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_4
    move v11, v12

    .line 103
    goto :goto_5

    .line 104
    :cond_5
    aget v12, v5, v7

    .line 105
    .line 106
    array-length v13, v5

    .line 107
    move v14, v3

    .line 108
    :goto_4
    if-ge v14, v13, :cond_4

    .line 109
    .line 110
    invoke-virtual {v4, v11, v12}, La/on40;->c(II)I

    .line 111
    .line 112
    .line 113
    move-result v12

    .line 114
    aget v15, v5, v14

    .line 115
    .line 116
    invoke-virtual {v4, v12, v15}, La/on40;->a(II)I

    .line 117
    .line 118
    .line 119
    move-result v12

    .line 120
    add-int/lit8 v14, v14, 0x1

    .line 121
    .line 122
    goto :goto_4

    .line 123
    :goto_5
    sub-int v12, v2, v9

    .line 124
    .line 125
    aput v11, v8, v12

    .line 126
    .line 127
    if-eqz v11, :cond_6

    .line 128
    .line 129
    move v10, v3

    .line 130
    :cond_6
    add-int/lit8 v9, v9, -0x1

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_7
    if-nez v10, :cond_8

    .line 134
    .line 135
    move v3, v7

    .line 136
    const/16 v16, 0x0

    .line 137
    .line 138
    goto/16 :goto_18

    .line 139
    .line 140
    :cond_8
    iget-object v5, v4, La/on40;->d:La/j910;

    .line 141
    .line 142
    iget-object v9, v4, La/on40;->c:La/j910;

    .line 143
    .line 144
    array-length v10, v1

    .line 145
    move v11, v7

    .line 146
    :goto_6
    const/16 v12, 0x3a1

    .line 147
    .line 148
    if-ge v11, v10, :cond_9

    .line 149
    .line 150
    aget v13, v1, v11

    .line 151
    .line 152
    array-length v14, v0

    .line 153
    sub-int/2addr v14, v3

    .line 154
    sub-int/2addr v14, v13

    .line 155
    iget-object v13, v4, La/on40;->a:[I

    .line 156
    .line 157
    aget v13, v13, v14

    .line 158
    .line 159
    new-instance v14, La/j910;

    .line 160
    .line 161
    rsub-int v13, v13, 0x3a1

    .line 162
    .line 163
    rem-int/2addr v13, v12

    .line 164
    filled-new-array {v13, v3}, [I

    .line 165
    .line 166
    .line 167
    move-result-object v12

    .line 168
    invoke-direct {v14, v4, v12}, La/j910;-><init>(La/on40;[I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v5, v14}, La/j910;->y(La/j910;)La/j910;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    add-int/lit8 v11, v11, 0x1

    .line 176
    .line 177
    goto :goto_6

    .line 178
    :cond_9
    new-instance v5, La/j910;

    .line 179
    .line 180
    invoke-direct {v5, v4, v8}, La/j910;-><init>(La/on40;[I)V

    .line 181
    .line 182
    .line 183
    if-ltz v2, :cond_46

    .line 184
    .line 185
    add-int/lit8 v8, v2, 0x1

    .line 186
    .line 187
    new-array v8, v8, [I

    .line 188
    .line 189
    aput v3, v8, v7

    .line 190
    .line 191
    new-instance v10, La/j910;

    .line 192
    .line 193
    invoke-direct {v10, v4, v8}, La/j910;-><init>(La/on40;[I)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v10}, La/j910;->k()I

    .line 197
    .line 198
    .line 199
    move-result v8

    .line 200
    invoke-virtual {v5}, La/j910;->k()I

    .line 201
    .line 202
    .line 203
    move-result v11

    .line 204
    if-ge v8, v11, :cond_a

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :cond_a
    move-object/from16 v22, v10

    .line 208
    .line 209
    move-object v10, v5

    .line 210
    move-object/from16 v5, v22

    .line 211
    .line 212
    :goto_7
    iget-object v8, v4, La/on40;->d:La/j910;

    .line 213
    .line 214
    move-object v11, v8

    .line 215
    move-object v8, v5

    .line 216
    move-object v5, v10

    .line 217
    move-object v10, v11

    .line 218
    move-object v11, v9

    .line 219
    :goto_8
    invoke-virtual {v5}, La/j910;->k()I

    .line 220
    .line 221
    .line 222
    move-result v13

    .line 223
    div-int/lit8 v14, v2, 0x2

    .line 224
    .line 225
    if-lt v13, v14, :cond_13

    .line 226
    .line 227
    invoke-virtual {v5}, La/j910;->v()Z

    .line 228
    .line 229
    .line 230
    move-result v13

    .line 231
    if-nez v13, :cond_12

    .line 232
    .line 233
    invoke-virtual {v5}, La/j910;->k()I

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    invoke-virtual {v5, v13}, La/j910;->j(I)I

    .line 238
    .line 239
    .line 240
    move-result v13

    .line 241
    invoke-virtual {v4, v13}, La/on40;->b(I)I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    move-object v14, v9

    .line 246
    :goto_9
    invoke-virtual {v8}, La/j910;->k()I

    .line 247
    .line 248
    .line 249
    move-result v15

    .line 250
    const/16 v16, 0x0

    .line 251
    .line 252
    invoke-virtual {v5}, La/j910;->k()I

    .line 253
    .line 254
    .line 255
    move-result v6

    .line 256
    if-lt v15, v6, :cond_10

    .line 257
    .line 258
    invoke-virtual {v8}, La/j910;->v()Z

    .line 259
    .line 260
    .line 261
    move-result v6

    .line 262
    if-nez v6, :cond_10

    .line 263
    .line 264
    invoke-virtual {v8}, La/j910;->k()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    invoke-virtual {v5}, La/j910;->k()I

    .line 269
    .line 270
    .line 271
    move-result v15

    .line 272
    sub-int/2addr v6, v15

    .line 273
    invoke-virtual {v8}, La/j910;->k()I

    .line 274
    .line 275
    .line 276
    move-result v15

    .line 277
    invoke-virtual {v8, v15}, La/j910;->j(I)I

    .line 278
    .line 279
    .line 280
    move-result v15

    .line 281
    invoke-virtual {v4, v15, v13}, La/on40;->c(II)I

    .line 282
    .line 283
    .line 284
    move-result v15

    .line 285
    if-ltz v6, :cond_f

    .line 286
    .line 287
    if-nez v15, :cond_b

    .line 288
    .line 289
    move/from16 v17, v3

    .line 290
    .line 291
    move-object v7, v9

    .line 292
    goto :goto_a

    .line 293
    :cond_b
    move/from16 v17, v3

    .line 294
    .line 295
    add-int/lit8 v3, v6, 0x1

    .line 296
    .line 297
    new-array v3, v3, [I

    .line 298
    .line 299
    aput v15, v3, v7

    .line 300
    .line 301
    new-instance v7, La/j910;

    .line 302
    .line 303
    invoke-direct {v7, v4, v3}, La/j910;-><init>(La/on40;[I)V

    .line 304
    .line 305
    .line 306
    :goto_a
    invoke-virtual {v14, v7}, La/j910;->c(La/j910;)La/j910;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    iget-object v3, v5, La/j910;->c:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v3, [I

    .line 313
    .line 314
    iget-object v7, v5, La/j910;->b:Ljava/lang/Object;

    .line 315
    .line 316
    check-cast v7, La/on40;

    .line 317
    .line 318
    if-ltz v6, :cond_e

    .line 319
    .line 320
    if-nez v15, :cond_c

    .line 321
    .line 322
    iget-object v3, v7, La/on40;->c:La/j910;

    .line 323
    .line 324
    goto :goto_c

    .line 325
    :cond_c
    array-length v12, v3

    .line 326
    add-int/2addr v6, v12

    .line 327
    new-array v6, v6, [I

    .line 328
    .line 329
    move-object/from16 v20, v3

    .line 330
    .line 331
    const/4 v3, 0x0

    .line 332
    :goto_b
    if-ge v3, v12, :cond_d

    .line 333
    .line 334
    move/from16 v21, v3

    .line 335
    .line 336
    aget v3, v20, v21

    .line 337
    .line 338
    invoke-virtual {v7, v3, v15}, La/on40;->c(II)I

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    aput v3, v6, v21

    .line 343
    .line 344
    add-int/lit8 v3, v21, 0x1

    .line 345
    .line 346
    goto :goto_b

    .line 347
    :cond_d
    new-instance v3, La/j910;

    .line 348
    .line 349
    invoke-direct {v3, v7, v6}, La/j910;-><init>(La/on40;[I)V

    .line 350
    .line 351
    .line 352
    :goto_c
    invoke-virtual {v8, v3}, La/j910;->B(La/j910;)La/j910;

    .line 353
    .line 354
    .line 355
    move-result-object v8

    .line 356
    move/from16 v3, v17

    .line 357
    .line 358
    const/4 v7, 0x0

    .line 359
    const/16 v12, 0x3a1

    .line 360
    .line 361
    goto :goto_9

    .line 362
    :cond_e
    invoke-static {}, La/e9d0;->o()V

    .line 363
    .line 364
    .line 365
    return-object v16

    .line 366
    :cond_f
    invoke-static {}, La/e9d0;->o()V

    .line 367
    .line 368
    .line 369
    return-object v16

    .line 370
    :cond_10
    move/from16 v17, v3

    .line 371
    .line 372
    invoke-virtual {v14, v10}, La/j910;->y(La/j910;)La/j910;

    .line 373
    .line 374
    .line 375
    move-result-object v3

    .line 376
    invoke-virtual {v3, v11}, La/j910;->B(La/j910;)La/j910;

    .line 377
    .line 378
    .line 379
    move-result-object v3

    .line 380
    iget-object v6, v3, La/j910;->c:Ljava/lang/Object;

    .line 381
    .line 382
    check-cast v6, [I

    .line 383
    .line 384
    array-length v7, v6

    .line 385
    new-array v11, v7, [I

    .line 386
    .line 387
    const/4 v12, 0x0

    .line 388
    :goto_d
    iget-object v13, v3, La/j910;->b:Ljava/lang/Object;

    .line 389
    .line 390
    check-cast v13, La/on40;

    .line 391
    .line 392
    if-ge v12, v7, :cond_11

    .line 393
    .line 394
    aget v14, v6, v12

    .line 395
    .line 396
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    const/16 v13, 0x3a1

    .line 400
    .line 401
    rsub-int v14, v14, 0x3a1

    .line 402
    .line 403
    rem-int/2addr v14, v13

    .line 404
    aput v14, v11, v12

    .line 405
    .line 406
    add-int/lit8 v12, v12, 0x1

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :cond_11
    new-instance v3, La/j910;

    .line 410
    .line 411
    invoke-direct {v3, v13, v11}, La/j910;-><init>(La/on40;[I)V

    .line 412
    .line 413
    .line 414
    move-object v7, v8

    .line 415
    move-object v8, v5

    .line 416
    move-object v5, v7

    .line 417
    move-object v11, v10

    .line 418
    const/4 v7, 0x0

    .line 419
    const/16 v12, 0x3a1

    .line 420
    .line 421
    move-object v10, v3

    .line 422
    move/from16 v3, v17

    .line 423
    .line 424
    goto/16 :goto_8

    .line 425
    .line 426
    :cond_12
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 427
    .line 428
    .line 429
    move-result-object v0

    .line 430
    throw v0

    .line 431
    :cond_13
    move/from16 v17, v3

    .line 432
    .line 433
    move v3, v7

    .line 434
    const/16 v16, 0x0

    .line 435
    .line 436
    invoke-virtual {v10, v3}, La/j910;->j(I)I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    if-eqz v6, :cond_45

    .line 441
    .line 442
    invoke-virtual {v4, v6}, La/on40;->b(I)I

    .line 443
    .line 444
    .line 445
    move-result v6

    .line 446
    invoke-virtual {v10, v6}, La/j910;->x(I)La/j910;

    .line 447
    .line 448
    .line 449
    move-result-object v7

    .line 450
    invoke-virtual {v5, v6}, La/j910;->x(I)La/j910;

    .line 451
    .line 452
    .line 453
    move-result-object v5

    .line 454
    filled-new-array {v7, v5}, [La/j910;

    .line 455
    .line 456
    .line 457
    move-result-object v5

    .line 458
    aget-object v6, v5, v3

    .line 459
    .line 460
    aget-object v3, v5, v17

    .line 461
    .line 462
    invoke-virtual {v6}, La/j910;->k()I

    .line 463
    .line 464
    .line 465
    move-result v5

    .line 466
    new-array v7, v5, [I

    .line 467
    .line 468
    move/from16 v8, v17

    .line 469
    .line 470
    const/4 v9, 0x0

    .line 471
    :goto_e
    const/16 v13, 0x3a1

    .line 472
    .line 473
    if-ge v8, v13, :cond_15

    .line 474
    .line 475
    if-ge v9, v5, :cond_15

    .line 476
    .line 477
    invoke-virtual {v6, v8}, La/j910;->g(I)I

    .line 478
    .line 479
    .line 480
    move-result v10

    .line 481
    if-nez v10, :cond_14

    .line 482
    .line 483
    invoke-virtual {v4, v8}, La/on40;->b(I)I

    .line 484
    .line 485
    .line 486
    move-result v10

    .line 487
    aput v10, v7, v9

    .line 488
    .line 489
    add-int/lit8 v9, v9, 0x1

    .line 490
    .line 491
    :cond_14
    add-int/lit8 v8, v8, 0x1

    .line 492
    .line 493
    goto :goto_e

    .line 494
    :cond_15
    if-ne v9, v5, :cond_44

    .line 495
    .line 496
    invoke-virtual {v6}, La/j910;->k()I

    .line 497
    .line 498
    .line 499
    move-result v8

    .line 500
    move/from16 v9, v17

    .line 501
    .line 502
    if-ge v8, v9, :cond_16

    .line 503
    .line 504
    const/4 v9, 0x0

    .line 505
    new-array v3, v9, [I

    .line 506
    .line 507
    goto/16 :goto_16

    .line 508
    .line 509
    :cond_16
    new-array v9, v8, [I

    .line 510
    .line 511
    const/4 v10, 0x1

    .line 512
    :goto_f
    if-gt v10, v8, :cond_17

    .line 513
    .line 514
    sub-int v11, v8, v10

    .line 515
    .line 516
    invoke-virtual {v6, v10}, La/j910;->j(I)I

    .line 517
    .line 518
    .line 519
    move-result v12

    .line 520
    invoke-virtual {v4, v10, v12}, La/on40;->c(II)I

    .line 521
    .line 522
    .line 523
    move-result v12

    .line 524
    aput v12, v9, v11

    .line 525
    .line 526
    add-int/lit8 v10, v10, 0x1

    .line 527
    .line 528
    goto :goto_f

    .line 529
    :cond_17
    if-eqz v8, :cond_43

    .line 530
    .line 531
    const/4 v6, 0x1

    .line 532
    if-le v8, v6, :cond_1a

    .line 533
    .line 534
    const/16 v18, 0x0

    .line 535
    .line 536
    aget v6, v9, v18

    .line 537
    .line 538
    if-nez v6, :cond_1a

    .line 539
    .line 540
    const/4 v6, 0x1

    .line 541
    :goto_10
    if-ge v6, v8, :cond_18

    .line 542
    .line 543
    aget v10, v9, v6

    .line 544
    .line 545
    if-nez v10, :cond_18

    .line 546
    .line 547
    add-int/lit8 v6, v6, 0x1

    .line 548
    .line 549
    goto :goto_10

    .line 550
    :cond_18
    if-ne v6, v8, :cond_19

    .line 551
    .line 552
    const/4 v10, 0x0

    .line 553
    filled-new-array {v10}, [I

    .line 554
    .line 555
    .line 556
    move-result-object v9

    .line 557
    goto :goto_11

    .line 558
    :cond_19
    const/4 v10, 0x0

    .line 559
    sub-int/2addr v8, v6

    .line 560
    new-array v11, v8, [I

    .line 561
    .line 562
    invoke-static {v9, v6, v11, v10, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 563
    .line 564
    .line 565
    move-object v9, v11

    .line 566
    :cond_1a
    :goto_11
    new-array v6, v5, [I

    .line 567
    .line 568
    const/4 v8, 0x0

    .line 569
    :goto_12
    if-ge v8, v5, :cond_1f

    .line 570
    .line 571
    aget v10, v7, v8

    .line 572
    .line 573
    invoke-virtual {v4, v10}, La/on40;->b(I)I

    .line 574
    .line 575
    .line 576
    move-result v10

    .line 577
    invoke-virtual {v3, v10}, La/j910;->g(I)I

    .line 578
    .line 579
    .line 580
    move-result v11

    .line 581
    const/16 v13, 0x3a1

    .line 582
    .line 583
    rsub-int v12, v11, 0x3a1

    .line 584
    .line 585
    rem-int/2addr v12, v13

    .line 586
    if-nez v10, :cond_1b

    .line 587
    .line 588
    array-length v10, v9

    .line 589
    const/4 v11, 0x1

    .line 590
    sub-int/2addr v10, v11

    .line 591
    aget v10, v9, v10

    .line 592
    .line 593
    goto :goto_15

    .line 594
    :cond_1b
    const/4 v11, 0x1

    .line 595
    if-ne v10, v11, :cond_1d

    .line 596
    .line 597
    array-length v10, v9

    .line 598
    const/4 v11, 0x0

    .line 599
    const/4 v13, 0x0

    .line 600
    :goto_13
    if-ge v11, v10, :cond_1c

    .line 601
    .line 602
    aget v14, v9, v11

    .line 603
    .line 604
    invoke-virtual {v4, v13, v14}, La/on40;->a(II)I

    .line 605
    .line 606
    .line 607
    move-result v13

    .line 608
    add-int/lit8 v11, v11, 0x1

    .line 609
    .line 610
    goto :goto_13

    .line 611
    :cond_1c
    move v10, v13

    .line 612
    goto :goto_15

    .line 613
    :cond_1d
    const/16 v18, 0x0

    .line 614
    .line 615
    aget v11, v9, v18

    .line 616
    .line 617
    array-length v13, v9

    .line 618
    const/4 v14, 0x1

    .line 619
    :goto_14
    if-ge v14, v13, :cond_1e

    .line 620
    .line 621
    invoke-virtual {v4, v10, v11}, La/on40;->c(II)I

    .line 622
    .line 623
    .line 624
    move-result v11

    .line 625
    aget v15, v9, v14

    .line 626
    .line 627
    invoke-virtual {v4, v11, v15}, La/on40;->a(II)I

    .line 628
    .line 629
    .line 630
    move-result v11

    .line 631
    add-int/lit8 v14, v14, 0x1

    .line 632
    .line 633
    goto :goto_14

    .line 634
    :cond_1e
    move v10, v11

    .line 635
    :goto_15
    invoke-virtual {v4, v10}, La/on40;->b(I)I

    .line 636
    .line 637
    .line 638
    move-result v10

    .line 639
    invoke-virtual {v4, v12, v10}, La/on40;->c(II)I

    .line 640
    .line 641
    .line 642
    move-result v10

    .line 643
    aput v10, v6, v8

    .line 644
    .line 645
    add-int/lit8 v8, v8, 0x1

    .line 646
    .line 647
    goto :goto_12

    .line 648
    :cond_1f
    move-object v3, v6

    .line 649
    :goto_16
    const/4 v6, 0x0

    .line 650
    :goto_17
    if-ge v6, v5, :cond_22

    .line 651
    .line 652
    array-length v8, v0

    .line 653
    const/16 v17, 0x1

    .line 654
    .line 655
    add-int/lit8 v8, v8, -0x1

    .line 656
    .line 657
    aget v9, v7, v6

    .line 658
    .line 659
    if-eqz v9, :cond_21

    .line 660
    .line 661
    iget-object v10, v4, La/on40;->b:[I

    .line 662
    .line 663
    aget v9, v10, v9

    .line 664
    .line 665
    sub-int/2addr v8, v9

    .line 666
    if-ltz v8, :cond_20

    .line 667
    .line 668
    aget v9, v0, v8

    .line 669
    .line 670
    aget v10, v3, v6

    .line 671
    .line 672
    const/16 v13, 0x3a1

    .line 673
    .line 674
    add-int v12, v13, v9

    .line 675
    .line 676
    sub-int/2addr v12, v10

    .line 677
    rem-int/2addr v12, v13

    .line 678
    aput v12, v0, v8

    .line 679
    .line 680
    add-int/lit8 v6, v6, 0x1

    .line 681
    .line 682
    goto :goto_17

    .line 683
    :cond_20
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 684
    .line 685
    .line 686
    move-result-object v0

    .line 687
    throw v0

    .line 688
    :cond_21
    invoke-static {}, La/e9d0;->o()V

    .line 689
    .line 690
    .line 691
    return-object v16

    .line 692
    :cond_22
    move v3, v5

    .line 693
    :goto_18
    array-length v4, v0

    .line 694
    const/4 v5, 0x4

    .line 695
    if-lt v4, v5, :cond_42

    .line 696
    .line 697
    const/16 v18, 0x0

    .line 698
    .line 699
    aget v4, v0, v18

    .line 700
    .line 701
    array-length v5, v0

    .line 702
    if-gt v4, v5, :cond_41

    .line 703
    .line 704
    if-nez v4, :cond_24

    .line 705
    .line 706
    array-length v4, v0

    .line 707
    if-ge v2, v4, :cond_23

    .line 708
    .line 709
    array-length v4, v0

    .line 710
    sub-int/2addr v4, v2

    .line 711
    aput v4, v0, v18

    .line 712
    .line 713
    goto :goto_19

    .line 714
    :cond_23
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 715
    .line 716
    .line 717
    move-result-object v0

    .line 718
    throw v0

    .line 719
    :cond_24
    :goto_19
    invoke-static/range {p1 .. p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 720
    .line 721
    .line 722
    move-result-object v2

    .line 723
    sget-object v4, La/jkj;->a:[C

    .line 724
    .line 725
    new-instance v4, La/oif0;

    .line 726
    .line 727
    array-length v5, v0

    .line 728
    const/4 v6, 0x2

    .line 729
    mul-int/2addr v5, v6

    .line 730
    invoke-direct {v4, v5}, La/oif0;-><init>(I)V

    .line 731
    .line 732
    .line 733
    const/4 v9, 0x1

    .line 734
    invoke-static {v0, v9, v4}, La/jkj;->d([IILa/oif0;)I

    .line 735
    .line 736
    .line 737
    move-result v5

    .line 738
    new-instance v7, La/ig80;

    .line 739
    .line 740
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 741
    .line 742
    .line 743
    const/16 v18, 0x0

    .line 744
    .line 745
    :goto_1a
    aget v8, v0, v18

    .line 746
    .line 747
    if-ge v5, v8, :cond_3d

    .line 748
    .line 749
    add-int/lit8 v9, v5, 0x1

    .line 750
    .line 751
    aget v10, v0, v5

    .line 752
    .line 753
    const/16 v11, 0x391

    .line 754
    .line 755
    if-eq v10, v11, :cond_3c

    .line 756
    .line 757
    packed-switch v10, :pswitch_data_0

    .line 758
    .line 759
    .line 760
    packed-switch v10, :pswitch_data_1

    .line 761
    .line 762
    .line 763
    invoke-static {v0, v5, v4}, La/jkj;->d([IILa/oif0;)I

    .line 764
    .line 765
    .line 766
    move-result v5

    .line 767
    :goto_1b
    move-object/from16 v19, v7

    .line 768
    .line 769
    :goto_1c
    const/16 v17, 0x1

    .line 770
    .line 771
    const/16 v18, 0x0

    .line 772
    .line 773
    goto/16 :goto_2b

    .line 774
    .line 775
    :pswitch_0
    add-int/lit8 v5, v5, 0x3

    .line 776
    .line 777
    if-gt v5, v8, :cond_2f

    .line 778
    .line 779
    new-array v5, v6, [I

    .line 780
    .line 781
    const/4 v8, 0x0

    .line 782
    :goto_1d
    if-ge v8, v6, :cond_25

    .line 783
    .line 784
    aget v10, v0, v9

    .line 785
    .line 786
    aput v10, v5, v8

    .line 787
    .line 788
    add-int/lit8 v8, v8, 0x1

    .line 789
    .line 790
    add-int/lit8 v9, v9, 0x1

    .line 791
    .line 792
    goto :goto_1d

    .line 793
    :cond_25
    invoke-static {v5, v6}, La/jkj;->a([II)Ljava/lang/String;

    .line 794
    .line 795
    .line 796
    move-result-object v5

    .line 797
    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    .line 798
    .line 799
    .line 800
    move-result v8

    .line 801
    if-eqz v8, :cond_26

    .line 802
    .line 803
    goto :goto_1e

    .line 804
    :cond_26
    :try_start_0
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_4

    .line 805
    .line 806
    .line 807
    :goto_1e
    new-instance v5, Ljava/lang/StringBuilder;

    .line 808
    .line 809
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 810
    .line 811
    .line 812
    :goto_1f
    const/16 v18, 0x0

    .line 813
    .line 814
    aget v8, v0, v18

    .line 815
    .line 816
    const/16 v10, 0x39a

    .line 817
    .line 818
    const/16 v11, 0x39b

    .line 819
    .line 820
    if-ge v9, v8, :cond_27

    .line 821
    .line 822
    array-length v8, v0

    .line 823
    if-ge v9, v8, :cond_27

    .line 824
    .line 825
    aget v8, v0, v9

    .line 826
    .line 827
    if-eq v8, v10, :cond_27

    .line 828
    .line 829
    if-eq v8, v11, :cond_27

    .line 830
    .line 831
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 832
    .line 833
    .line 834
    move-result-object v8

    .line 835
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 836
    .line 837
    .line 838
    move-result-object v8

    .line 839
    const-string v10, "%03d"

    .line 840
    .line 841
    invoke-static {v10, v8}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 842
    .line 843
    .line 844
    move-result-object v8

    .line 845
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 846
    .line 847
    .line 848
    add-int/lit8 v9, v9, 0x1

    .line 849
    .line 850
    goto :goto_1f

    .line 851
    :cond_27
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->length()I

    .line 852
    .line 853
    .line 854
    move-result v8

    .line 855
    if-eqz v8, :cond_2e

    .line 856
    .line 857
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 858
    .line 859
    .line 860
    move-result-object v5

    .line 861
    iput-object v5, v7, La/ig80;->a:Ljava/lang/String;

    .line 862
    .line 863
    aget v5, v0, v9

    .line 864
    .line 865
    const/4 v8, -0x1

    .line 866
    if-ne v5, v11, :cond_28

    .line 867
    .line 868
    add-int/lit8 v5, v9, 0x1

    .line 869
    .line 870
    :goto_20
    const/16 v18, 0x0

    .line 871
    .line 872
    goto :goto_21

    .line 873
    :cond_28
    move v5, v8

    .line 874
    goto :goto_20

    .line 875
    :goto_21
    aget v12, v0, v18

    .line 876
    .line 877
    if-ge v9, v12, :cond_2b

    .line 878
    .line 879
    aget v12, v0, v9

    .line 880
    .line 881
    if-eq v12, v10, :cond_2a

    .line 882
    .line 883
    if-ne v12, v11, :cond_29

    .line 884
    .line 885
    add-int/lit8 v12, v9, 0x1

    .line 886
    .line 887
    aget v12, v0, v12

    .line 888
    .line 889
    const/16 v13, 0x11

    .line 890
    .line 891
    packed-switch v12, :pswitch_data_2

    .line 892
    .line 893
    .line 894
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 895
    .line 896
    .line 897
    move-result-object v0

    .line 898
    throw v0

    .line 899
    :pswitch_1
    new-instance v12, La/oif0;

    .line 900
    .line 901
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 902
    .line 903
    .line 904
    add-int/lit8 v9, v9, 0x2

    .line 905
    .line 906
    invoke-static {v0, v9, v12}, La/jkj;->c([IILa/oif0;)I

    .line 907
    .line 908
    .line 909
    move-result v9

    .line 910
    :try_start_1
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 911
    .line 912
    .line 913
    move-result-object v12

    .line 914
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0

    .line 915
    .line 916
    .line 917
    goto :goto_20

    .line 918
    :catch_0
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    throw v0

    .line 923
    :pswitch_2
    new-instance v12, La/oif0;

    .line 924
    .line 925
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 926
    .line 927
    .line 928
    add-int/lit8 v9, v9, 0x2

    .line 929
    .line 930
    invoke-static {v0, v9, v12}, La/jkj;->c([IILa/oif0;)I

    .line 931
    .line 932
    .line 933
    move-result v9

    .line 934
    :try_start_2
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v12

    .line 938
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_1

    .line 939
    .line 940
    .line 941
    goto :goto_20

    .line 942
    :catch_1
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    throw v0

    .line 947
    :pswitch_3
    new-instance v12, La/oif0;

    .line 948
    .line 949
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 950
    .line 951
    .line 952
    add-int/lit8 v9, v9, 0x2

    .line 953
    .line 954
    invoke-static {v0, v9, v12}, La/jkj;->d([IILa/oif0;)I

    .line 955
    .line 956
    .line 957
    move-result v9

    .line 958
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 959
    .line 960
    .line 961
    goto :goto_20

    .line 962
    :pswitch_4
    new-instance v12, La/oif0;

    .line 963
    .line 964
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 965
    .line 966
    .line 967
    add-int/lit8 v9, v9, 0x2

    .line 968
    .line 969
    invoke-static {v0, v9, v12}, La/jkj;->d([IILa/oif0;)I

    .line 970
    .line 971
    .line 972
    move-result v9

    .line 973
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 974
    .line 975
    .line 976
    goto :goto_20

    .line 977
    :pswitch_5
    new-instance v12, La/oif0;

    .line 978
    .line 979
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 980
    .line 981
    .line 982
    add-int/lit8 v9, v9, 0x2

    .line 983
    .line 984
    invoke-static {v0, v9, v12}, La/jkj;->c([IILa/oif0;)I

    .line 985
    .line 986
    .line 987
    move-result v9

    .line 988
    :try_start_3
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v12

    .line 992
    invoke-static {v12}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J
    :try_end_3
    .catch Ljava/lang/NumberFormatException; {:try_start_3 .. :try_end_3} :catch_2

    .line 993
    .line 994
    .line 995
    goto :goto_20

    .line 996
    :catch_2
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 997
    .line 998
    .line 999
    move-result-object v0

    .line 1000
    throw v0

    .line 1001
    :pswitch_6
    new-instance v12, La/oif0;

    .line 1002
    .line 1003
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 1004
    .line 1005
    .line 1006
    add-int/lit8 v9, v9, 0x2

    .line 1007
    .line 1008
    invoke-static {v0, v9, v12}, La/jkj;->c([IILa/oif0;)I

    .line 1009
    .line 1010
    .line 1011
    move-result v9

    .line 1012
    :try_start_4
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 1013
    .line 1014
    .line 1015
    move-result-object v12

    .line 1016
    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3

    .line 1017
    .line 1018
    .line 1019
    goto/16 :goto_20

    .line 1020
    .line 1021
    :catch_3
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v0

    .line 1025
    throw v0

    .line 1026
    :pswitch_7
    new-instance v12, La/oif0;

    .line 1027
    .line 1028
    invoke-direct {v12, v13}, La/oif0;-><init>(B)V

    .line 1029
    .line 1030
    .line 1031
    add-int/lit8 v9, v9, 0x2

    .line 1032
    .line 1033
    invoke-static {v0, v9, v12}, La/jkj;->d([IILa/oif0;)I

    .line 1034
    .line 1035
    .line 1036
    move-result v9

    .line 1037
    invoke-virtual {v12}, La/oif0;->toString()Ljava/lang/String;

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_20

    .line 1041
    .line 1042
    :cond_29
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1043
    .line 1044
    .line 1045
    move-result-object v0

    .line 1046
    throw v0

    .line 1047
    :cond_2a
    add-int/lit8 v9, v9, 0x1

    .line 1048
    .line 1049
    const/4 v12, 0x1

    .line 1050
    iput-boolean v12, v7, La/ig80;->b:Z

    .line 1051
    .line 1052
    goto/16 :goto_20

    .line 1053
    .line 1054
    :cond_2b
    if-eq v5, v8, :cond_2d

    .line 1055
    .line 1056
    sub-int v8, v9, v5

    .line 1057
    .line 1058
    iget-boolean v10, v7, La/ig80;->b:Z

    .line 1059
    .line 1060
    if-eqz v10, :cond_2c

    .line 1061
    .line 1062
    add-int/lit8 v8, v8, -0x1

    .line 1063
    .line 1064
    :cond_2c
    if-lez v8, :cond_2d

    .line 1065
    .line 1066
    add-int/2addr v8, v5

    .line 1067
    invoke-static {v0, v5, v8}, Ljava/util/Arrays;->copyOfRange([III)[I

    .line 1068
    .line 1069
    .line 1070
    :cond_2d
    move-object/from16 v19, v7

    .line 1071
    .line 1072
    move v5, v9

    .line 1073
    goto/16 :goto_1c

    .line 1074
    .line 1075
    :cond_2e
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1076
    .line 1077
    .line 1078
    move-result-object v0

    .line 1079
    throw v0

    .line 1080
    :catch_4
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v0

    .line 1084
    throw v0

    .line 1085
    :cond_2f
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v0

    .line 1089
    throw v0

    .line 1090
    :pswitch_8
    add-int/lit8 v5, v5, 0x2

    .line 1091
    .line 1092
    aget v8, v0, v9

    .line 1093
    .line 1094
    invoke-virtual {v4, v8}, La/oif0;->c(I)V

    .line 1095
    .line 1096
    .line 1097
    goto/16 :goto_1b

    .line 1098
    .line 1099
    :pswitch_9
    add-int/lit8 v5, v5, 0x3

    .line 1100
    .line 1101
    goto/16 :goto_1b

    .line 1102
    .line 1103
    :pswitch_a
    add-int/lit8 v5, v5, 0x2

    .line 1104
    .line 1105
    goto/16 :goto_1b

    .line 1106
    .line 1107
    :pswitch_b
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1108
    .line 1109
    .line 1110
    move-result-object v0

    .line 1111
    throw v0

    .line 1112
    :pswitch_c
    invoke-static {v0, v9, v4}, La/jkj;->c([IILa/oif0;)I

    .line 1113
    .line 1114
    .line 1115
    move-result v5

    .line 1116
    goto/16 :goto_1b

    .line 1117
    .line 1118
    :pswitch_d
    const/4 v5, 0x0

    .line 1119
    const/16 v18, 0x0

    .line 1120
    .line 1121
    :goto_22
    aget v8, v0, v18

    .line 1122
    .line 1123
    if-ge v9, v8, :cond_3b

    .line 1124
    .line 1125
    if-nez v5, :cond_3b

    .line 1126
    .line 1127
    :goto_23
    aget v8, v0, v18

    .line 1128
    .line 1129
    const/16 v11, 0x39f

    .line 1130
    .line 1131
    if-ge v9, v8, :cond_30

    .line 1132
    .line 1133
    aget v12, v0, v9

    .line 1134
    .line 1135
    if-ne v12, v11, :cond_30

    .line 1136
    .line 1137
    add-int/lit8 v8, v9, 0x1

    .line 1138
    .line 1139
    aget v8, v0, v8

    .line 1140
    .line 1141
    invoke-virtual {v4, v8}, La/oif0;->c(I)V

    .line 1142
    .line 1143
    .line 1144
    add-int/lit8 v9, v9, 0x2

    .line 1145
    .line 1146
    const/16 v18, 0x0

    .line 1147
    .line 1148
    goto :goto_23

    .line 1149
    :cond_30
    if-ge v9, v8, :cond_31

    .line 1150
    .line 1151
    aget v8, v0, v9

    .line 1152
    .line 1153
    const/16 v12, 0x384

    .line 1154
    .line 1155
    if-lt v8, v12, :cond_32

    .line 1156
    .line 1157
    :cond_31
    move-object/from16 v19, v7

    .line 1158
    .line 1159
    const/16 v17, 0x1

    .line 1160
    .line 1161
    const/16 v18, 0x0

    .line 1162
    .line 1163
    goto/16 :goto_2a

    .line 1164
    .line 1165
    :cond_32
    const-wide/16 v13, 0x0

    .line 1166
    .line 1167
    const/4 v8, 0x0

    .line 1168
    :goto_24
    const-wide/16 v19, 0x384

    .line 1169
    .line 1170
    mul-long v13, v13, v19

    .line 1171
    .line 1172
    add-int/lit8 v15, v9, 0x1

    .line 1173
    .line 1174
    aget v9, v0, v9

    .line 1175
    .line 1176
    move-object/from16 v19, v7

    .line 1177
    .line 1178
    int-to-long v6, v9

    .line 1179
    add-long/2addr v13, v6

    .line 1180
    const/16 v17, 0x1

    .line 1181
    .line 1182
    add-int/lit8 v8, v8, 0x1

    .line 1183
    .line 1184
    const/4 v6, 0x5

    .line 1185
    if-ge v8, v6, :cond_34

    .line 1186
    .line 1187
    const/16 v18, 0x0

    .line 1188
    .line 1189
    aget v7, v0, v18

    .line 1190
    .line 1191
    if-ge v15, v7, :cond_34

    .line 1192
    .line 1193
    aget v7, v0, v15

    .line 1194
    .line 1195
    if-lt v7, v12, :cond_33

    .line 1196
    .line 1197
    goto :goto_25

    .line 1198
    :cond_33
    move v9, v15

    .line 1199
    move-object/from16 v7, v19

    .line 1200
    .line 1201
    const/4 v6, 0x2

    .line 1202
    goto :goto_24

    .line 1203
    :cond_34
    :goto_25
    if-ne v8, v6, :cond_37

    .line 1204
    .line 1205
    const/16 v6, 0x39c

    .line 1206
    .line 1207
    if-eq v10, v6, :cond_35

    .line 1208
    .line 1209
    const/16 v18, 0x0

    .line 1210
    .line 1211
    aget v6, v0, v18

    .line 1212
    .line 1213
    if-ge v15, v6, :cond_37

    .line 1214
    .line 1215
    aget v6, v0, v15

    .line 1216
    .line 1217
    if-ge v6, v12, :cond_37

    .line 1218
    .line 1219
    :cond_35
    const/4 v6, 0x0

    .line 1220
    :goto_26
    const/4 v7, 0x6

    .line 1221
    if-ge v6, v7, :cond_36

    .line 1222
    .line 1223
    rsub-int/lit8 v7, v6, 0x5

    .line 1224
    .line 1225
    mul-int/lit8 v7, v7, 0x8

    .line 1226
    .line 1227
    shr-long v7, v13, v7

    .line 1228
    .line 1229
    long-to-int v7, v7

    .line 1230
    int-to-byte v7, v7

    .line 1231
    iget-object v8, v4, La/oif0;->b:Ljava/lang/Object;

    .line 1232
    .line 1233
    check-cast v8, Ljava/lang/StringBuilder;

    .line 1234
    .line 1235
    and-int/lit16 v7, v7, 0xff

    .line 1236
    .line 1237
    int-to-char v7, v7

    .line 1238
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1239
    .line 1240
    .line 1241
    add-int/lit8 v6, v6, 0x1

    .line 1242
    .line 1243
    goto :goto_26

    .line 1244
    :cond_36
    const/16 v18, 0x0

    .line 1245
    .line 1246
    :goto_27
    move v9, v15

    .line 1247
    goto :goto_29

    .line 1248
    :cond_37
    sub-int/2addr v15, v8

    .line 1249
    move v9, v5

    .line 1250
    const/16 v18, 0x0

    .line 1251
    .line 1252
    :goto_28
    aget v5, v0, v18

    .line 1253
    .line 1254
    if-ge v15, v5, :cond_3a

    .line 1255
    .line 1256
    if-nez v9, :cond_3a

    .line 1257
    .line 1258
    add-int/lit8 v5, v15, 0x1

    .line 1259
    .line 1260
    aget v6, v0, v15

    .line 1261
    .line 1262
    if-ge v6, v12, :cond_38

    .line 1263
    .line 1264
    int-to-byte v6, v6

    .line 1265
    iget-object v7, v4, La/oif0;->b:Ljava/lang/Object;

    .line 1266
    .line 1267
    check-cast v7, Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    and-int/lit16 v6, v6, 0xff

    .line 1270
    .line 1271
    int-to-char v6, v6

    .line 1272
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1273
    .line 1274
    .line 1275
    move v15, v5

    .line 1276
    goto :goto_28

    .line 1277
    :cond_38
    if-ne v6, v11, :cond_39

    .line 1278
    .line 1279
    add-int/lit8 v15, v15, 0x2

    .line 1280
    .line 1281
    aget v5, v0, v5

    .line 1282
    .line 1283
    invoke-virtual {v4, v5}, La/oif0;->c(I)V

    .line 1284
    .line 1285
    .line 1286
    goto :goto_28

    .line 1287
    :cond_39
    move/from16 v9, v17

    .line 1288
    .line 1289
    goto :goto_28

    .line 1290
    :cond_3a
    move v5, v9

    .line 1291
    goto :goto_27

    .line 1292
    :goto_29
    move-object/from16 v7, v19

    .line 1293
    .line 1294
    const/4 v6, 0x2

    .line 1295
    goto/16 :goto_22

    .line 1296
    .line 1297
    :goto_2a
    move/from16 v5, v17

    .line 1298
    .line 1299
    goto :goto_29

    .line 1300
    :cond_3b
    move-object/from16 v19, v7

    .line 1301
    .line 1302
    const/16 v17, 0x1

    .line 1303
    .line 1304
    move v5, v9

    .line 1305
    goto :goto_2b

    .line 1306
    :pswitch_e
    move-object/from16 v19, v7

    .line 1307
    .line 1308
    const/16 v17, 0x1

    .line 1309
    .line 1310
    const/16 v18, 0x0

    .line 1311
    .line 1312
    invoke-static {v0, v9, v4}, La/jkj;->d([IILa/oif0;)I

    .line 1313
    .line 1314
    .line 1315
    move-result v5

    .line 1316
    goto :goto_2b

    .line 1317
    :cond_3c
    move-object/from16 v19, v7

    .line 1318
    .line 1319
    const/16 v17, 0x1

    .line 1320
    .line 1321
    const/16 v18, 0x0

    .line 1322
    .line 1323
    add-int/lit8 v5, v5, 0x2

    .line 1324
    .line 1325
    aget v6, v0, v9

    .line 1326
    .line 1327
    int-to-char v6, v6

    .line 1328
    invoke-virtual {v4, v6}, La/oif0;->b(C)V

    .line 1329
    .line 1330
    .line 1331
    :goto_2b
    move-object/from16 v7, v19

    .line 1332
    .line 1333
    const/4 v6, 0x2

    .line 1334
    goto/16 :goto_1a

    .line 1335
    .line 1336
    :cond_3d
    move-object/from16 v19, v7

    .line 1337
    .line 1338
    iget-object v0, v4, La/oif0;->b:Ljava/lang/Object;

    .line 1339
    .line 1340
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1341
    .line 1342
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1343
    .line 1344
    .line 1345
    move-result v0

    .line 1346
    if-nez v0, :cond_3f

    .line 1347
    .line 1348
    iget-object v0, v4, La/oif0;->c:Ljava/lang/Object;

    .line 1349
    .line 1350
    check-cast v0, Ljava/lang/StringBuilder;

    .line 1351
    .line 1352
    if-eqz v0, :cond_3e

    .line 1353
    .line 1354
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 1355
    .line 1356
    .line 1357
    move-result v0

    .line 1358
    if-nez v0, :cond_3f

    .line 1359
    .line 1360
    :cond_3e
    move-object/from16 v0, v19

    .line 1361
    .line 1362
    goto :goto_2c

    .line 1363
    :cond_3f
    move-object/from16 v0, v19

    .line 1364
    .line 1365
    goto :goto_2d

    .line 1366
    :goto_2c
    iget-object v5, v0, La/ig80;->a:Ljava/lang/String;

    .line 1367
    .line 1368
    if-eqz v5, :cond_40

    .line 1369
    .line 1370
    goto :goto_2d

    .line 1371
    :cond_40
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    throw v0

    .line 1376
    :goto_2d
    new-instance v5, La/ykj;

    .line 1377
    .line 1378
    invoke-virtual {v4}, La/oif0;->toString()Ljava/lang/String;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v4

    .line 1382
    move-object/from16 v6, v16

    .line 1383
    .line 1384
    invoke-direct {v5, v4, v2, v6}, La/ykj;-><init>(Ljava/lang/String;Ljava/lang/String;[B)V

    .line 1385
    .line 1386
    .line 1387
    iput-object v0, v5, La/ykj;->g:Ljava/lang/Object;

    .line 1388
    .line 1389
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v0

    .line 1393
    iput-object v0, v5, La/ykj;->e:Ljava/lang/Integer;

    .line 1394
    .line 1395
    array-length v0, v1

    .line 1396
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1397
    .line 1398
    .line 1399
    move-result-object v0

    .line 1400
    iput-object v0, v5, La/ykj;->f:Ljava/lang/Integer;

    .line 1401
    .line 1402
    return-object v5

    .line 1403
    :cond_41
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v0

    .line 1407
    throw v0

    .line 1408
    :cond_42
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1409
    .line 1410
    .line 1411
    move-result-object v0

    .line 1412
    throw v0

    .line 1413
    :cond_43
    invoke-static {}, La/e9d0;->o()V

    .line 1414
    .line 1415
    .line 1416
    const/16 v16, 0x0

    .line 1417
    .line 1418
    return-object v16

    .line 1419
    :cond_44
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v0

    .line 1423
    throw v0

    .line 1424
    :cond_45
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 1425
    .line 1426
    .line 1427
    move-result-object v0

    .line 1428
    throw v0

    .line 1429
    :cond_46
    const/16 v16, 0x0

    .line 1430
    .line 1431
    invoke-static {}, La/e9d0;->o()V

    .line 1432
    .line 1433
    .line 1434
    return-object v16

    .line 1435
    :cond_47
    const/16 v16, 0x0

    .line 1436
    .line 1437
    invoke-static {}, La/e9d0;->o()V

    .line 1438
    .line 1439
    .line 1440
    return-object v16

    .line 1441
    :cond_48
    invoke-static {}, La/q9c;->a()La/q9c;

    .line 1442
    .line 1443
    .line 1444
    move-result-object v0

    .line 1445
    throw v0

    .line 1446
    :cond_49
    invoke-static {}, La/bwq;->a()La/bwq;

    .line 1447
    .line 1448
    .line 1449
    move-result-object v0

    .line 1450
    throw v0

    .line 1451
    :pswitch_data_0
    .packed-switch 0x384
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    :pswitch_data_1
    .packed-switch 0x39a
        :pswitch_b
        :pswitch_b
        :pswitch_d
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
    .end packed-switch

    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static c(La/r68;IIZIIII)La/ku5;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    move/from16 v3, p5

    .line 8
    .line 9
    sget-object v4, La/y0x0;->l:[I

    .line 10
    .line 11
    sget-object v5, La/y0x0;->k:[I

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    const/4 v7, 0x1

    .line 15
    if-eqz p3, :cond_0

    .line 16
    .line 17
    move v8, v6

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move v8, v7

    .line 20
    :goto_0
    move/from16 v12, p3

    .line 21
    .line 22
    move/from16 v11, p4

    .line 23
    .line 24
    const/4 v10, 0x0

    .line 25
    :goto_1
    const/4 v13, 0x2

    .line 26
    if-ge v10, v13, :cond_4

    .line 27
    .line 28
    :goto_2
    if-eqz v12, :cond_1

    .line 29
    .line 30
    if-lt v11, v1, :cond_3

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    if-ge v11, v2, :cond_3

    .line 34
    .line 35
    :goto_3
    invoke-virtual {v0, v11, v3}, La/r68;->b(II)Z

    .line 36
    .line 37
    .line 38
    move-result v14

    .line 39
    if-ne v12, v14, :cond_3

    .line 40
    .line 41
    sub-int v14, p4, v11

    .line 42
    .line 43
    invoke-static {v14}, Ljava/lang/Math;->abs(I)I

    .line 44
    .line 45
    .line 46
    move-result v14

    .line 47
    if-le v14, v13, :cond_2

    .line 48
    .line 49
    move/from16 v11, p4

    .line 50
    .line 51
    goto :goto_4

    .line 52
    :cond_2
    add-int/2addr v11, v8

    .line 53
    goto :goto_2

    .line 54
    :cond_3
    neg-int v8, v8

    .line 55
    xor-int/lit8 v12, v12, 0x1

    .line 56
    .line 57
    add-int/lit8 v10, v10, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    :goto_4
    const/16 v8, 0x8

    .line 61
    .line 62
    new-array v10, v8, [I

    .line 63
    .line 64
    if-eqz p3, :cond_5

    .line 65
    .line 66
    move v12, v7

    .line 67
    goto :goto_5

    .line 68
    :cond_5
    move v12, v6

    .line 69
    :goto_5
    move/from16 v9, p3

    .line 70
    .line 71
    move v14, v11

    .line 72
    const/4 v15, 0x0

    .line 73
    const/16 v16, 0x0

    .line 74
    .line 75
    :goto_6
    if-eqz p3, :cond_7

    .line 76
    .line 77
    if-ge v14, v2, :cond_6

    .line 78
    .line 79
    goto :goto_7

    .line 80
    :cond_6
    move/from16 v17, v13

    .line 81
    .line 82
    goto :goto_9

    .line 83
    :cond_7
    if-lt v14, v1, :cond_6

    .line 84
    .line 85
    :goto_7
    if-ge v15, v8, :cond_6

    .line 86
    .line 87
    move/from16 v17, v13

    .line 88
    .line 89
    invoke-virtual {v0, v14, v3}, La/r68;->b(II)Z

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    if-ne v13, v9, :cond_8

    .line 94
    .line 95
    aget v13, v10, v15

    .line 96
    .line 97
    add-int/2addr v13, v7

    .line 98
    aput v13, v10, v15

    .line 99
    .line 100
    add-int/2addr v14, v12

    .line 101
    :goto_8
    move/from16 v13, v17

    .line 102
    .line 103
    goto :goto_6

    .line 104
    :cond_8
    add-int/lit8 v15, v15, 0x1

    .line 105
    .line 106
    xor-int/lit8 v9, v9, 0x1

    .line 107
    .line 108
    goto :goto_8

    .line 109
    :goto_9
    const/4 v0, 0x7

    .line 110
    if-eq v15, v8, :cond_b

    .line 111
    .line 112
    if-eqz p3, :cond_9

    .line 113
    .line 114
    move v1, v2

    .line 115
    :cond_9
    if-ne v14, v1, :cond_a

    .line 116
    .line 117
    if-ne v15, v0, :cond_a

    .line 118
    .line 119
    goto :goto_a

    .line 120
    :cond_a
    const/4 v10, 0x0

    .line 121
    :cond_b
    :goto_a
    if-nez v10, :cond_d

    .line 122
    .line 123
    :cond_c
    const/16 p4, 0x0

    .line 124
    .line 125
    goto/16 :goto_19

    .line 126
    .line 127
    :cond_d
    invoke-static {v10}, La/q7x;->H([I)I

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz p3, :cond_e

    .line 132
    .line 133
    add-int v2, v11, v1

    .line 134
    .line 135
    goto :goto_c

    .line 136
    :cond_e
    move/from16 v2, v16

    .line 137
    .line 138
    :goto_b
    array-length v9, v10

    .line 139
    div-int/lit8 v9, v9, 0x2

    .line 140
    .line 141
    if-ge v2, v9, :cond_f

    .line 142
    .line 143
    aget v9, v10, v2

    .line 144
    .line 145
    array-length v12, v10

    .line 146
    sub-int/2addr v12, v7

    .line 147
    sub-int/2addr v12, v2

    .line 148
    aget v12, v10, v12

    .line 149
    .line 150
    aput v12, v10, v2

    .line 151
    .line 152
    array-length v12, v10

    .line 153
    sub-int/2addr v12, v7

    .line 154
    sub-int/2addr v12, v2

    .line 155
    aput v9, v10, v12

    .line 156
    .line 157
    add-int/lit8 v2, v2, 0x1

    .line 158
    .line 159
    goto :goto_b

    .line 160
    :cond_f
    sub-int v2, v11, v1

    .line 161
    .line 162
    move/from16 v19, v11

    .line 163
    .line 164
    move v11, v2

    .line 165
    move/from16 v2, v19

    .line 166
    .line 167
    :goto_c
    add-int/lit8 v9, p6, -0x2

    .line 168
    .line 169
    if-gt v9, v1, :cond_c

    .line 170
    .line 171
    add-int/lit8 v9, p7, 0x2

    .line 172
    .line 173
    if-gt v1, v9, :cond_c

    .line 174
    .line 175
    sget-object v1, La/gg80;->a:[[F

    .line 176
    .line 177
    invoke-static {v10}, La/q7x;->H([I)I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    int-to-float v1, v1

    .line 182
    new-array v9, v8, [I

    .line 183
    .line 184
    move/from16 v12, v16

    .line 185
    .line 186
    move v13, v12

    .line 187
    move v14, v13

    .line 188
    :goto_d
    const/16 v15, 0x11

    .line 189
    .line 190
    if-ge v12, v15, :cond_11

    .line 191
    .line 192
    const/high16 v15, 0x42080000    # 34.0f

    .line 193
    .line 194
    div-float v15, v1, v15

    .line 195
    .line 196
    int-to-float v0, v12

    .line 197
    mul-float/2addr v0, v1

    .line 198
    const/high16 v18, 0x41880000    # 17.0f

    .line 199
    .line 200
    div-float v0, v0, v18

    .line 201
    .line 202
    add-float/2addr v0, v15

    .line 203
    aget v15, v10, v14

    .line 204
    .line 205
    add-int/2addr v15, v13

    .line 206
    const/16 p4, 0x0

    .line 207
    .line 208
    int-to-float v3, v15

    .line 209
    cmpg-float v0, v3, v0

    .line 210
    .line 211
    if-gtz v0, :cond_10

    .line 212
    .line 213
    add-int/lit8 v14, v14, 0x1

    .line 214
    .line 215
    move v13, v15

    .line 216
    :cond_10
    aget v0, v9, v14

    .line 217
    .line 218
    add-int/2addr v0, v7

    .line 219
    aput v0, v9, v14

    .line 220
    .line 221
    add-int/lit8 v12, v12, 0x1

    .line 222
    .line 223
    const/4 v0, 0x7

    .line 224
    goto :goto_d

    .line 225
    :cond_11
    const/16 p4, 0x0

    .line 226
    .line 227
    const-wide/16 v0, 0x0

    .line 228
    .line 229
    move/from16 v3, v16

    .line 230
    .line 231
    :goto_e
    if-ge v3, v8, :cond_14

    .line 232
    .line 233
    move/from16 v12, v16

    .line 234
    .line 235
    :goto_f
    aget v13, v9, v3

    .line 236
    .line 237
    if-ge v12, v13, :cond_13

    .line 238
    .line 239
    shl-long/2addr v0, v7

    .line 240
    rem-int/lit8 v13, v3, 0x2

    .line 241
    .line 242
    if-nez v13, :cond_12

    .line 243
    .line 244
    move v13, v7

    .line 245
    goto :goto_10

    .line 246
    :cond_12
    move/from16 v13, v16

    .line 247
    .line 248
    :goto_10
    int-to-long v13, v13

    .line 249
    or-long/2addr v0, v13

    .line 250
    add-int/lit8 v12, v12, 0x1

    .line 251
    .line 252
    goto :goto_f

    .line 253
    :cond_13
    add-int/lit8 v3, v3, 0x1

    .line 254
    .line 255
    goto :goto_e

    .line 256
    :cond_14
    long-to-int v0, v0

    .line 257
    const v1, 0x3ffff

    .line 258
    .line 259
    .line 260
    and-int v3, v0, v1

    .line 261
    .line 262
    invoke-static {v5, v3}, Ljava/util/Arrays;->binarySearch([II)I

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-gez v3, :cond_15

    .line 267
    .line 268
    move v3, v6

    .line 269
    goto :goto_11

    .line 270
    :cond_15
    aget v3, v4, v3

    .line 271
    .line 272
    sub-int/2addr v3, v7

    .line 273
    rem-int/lit16 v3, v3, 0x3a1

    .line 274
    .line 275
    :goto_11
    if-ne v3, v6, :cond_16

    .line 276
    .line 277
    move v0, v6

    .line 278
    :cond_16
    if-eq v0, v6, :cond_17

    .line 279
    .line 280
    goto :goto_16

    .line 281
    :cond_17
    invoke-static {v10}, La/q7x;->H([I)I

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    new-array v3, v8, [F

    .line 286
    .line 287
    if-le v0, v7, :cond_18

    .line 288
    .line 289
    move/from16 v9, v16

    .line 290
    .line 291
    :goto_12
    if-ge v9, v8, :cond_18

    .line 292
    .line 293
    aget v12, v10, v9

    .line 294
    .line 295
    int-to-float v12, v12

    .line 296
    int-to-float v13, v0

    .line 297
    div-float/2addr v12, v13

    .line 298
    aput v12, v3, v9

    .line 299
    .line 300
    add-int/lit8 v9, v9, 0x1

    .line 301
    .line 302
    goto :goto_12

    .line 303
    :cond_18
    const v0, 0x7f7fffff    # Float.MAX_VALUE

    .line 304
    .line 305
    .line 306
    move v9, v0

    .line 307
    move v0, v6

    .line 308
    move/from16 v10, v16

    .line 309
    .line 310
    :goto_13
    sget-object v12, La/gg80;->a:[[F

    .line 311
    .line 312
    array-length v13, v12

    .line 313
    if-ge v10, v13, :cond_1c

    .line 314
    .line 315
    aget-object v12, v12, v10

    .line 316
    .line 317
    const/4 v13, 0x0

    .line 318
    move/from16 v14, v16

    .line 319
    .line 320
    :goto_14
    if-ge v14, v8, :cond_1a

    .line 321
    .line 322
    aget v15, v12, v14

    .line 323
    .line 324
    aget v18, v3, v14

    .line 325
    .line 326
    sub-float v15, v15, v18

    .line 327
    .line 328
    mul-float/2addr v15, v15

    .line 329
    add-float/2addr v13, v15

    .line 330
    cmpl-float v15, v13, v9

    .line 331
    .line 332
    if-ltz v15, :cond_19

    .line 333
    .line 334
    goto :goto_15

    .line 335
    :cond_19
    add-int/lit8 v14, v14, 0x1

    .line 336
    .line 337
    goto :goto_14

    .line 338
    :cond_1a
    :goto_15
    cmpg-float v12, v13, v9

    .line 339
    .line 340
    if-gez v12, :cond_1b

    .line 341
    .line 342
    aget v0, v5, v10

    .line 343
    .line 344
    move v9, v13

    .line 345
    :cond_1b
    add-int/lit8 v10, v10, 0x1

    .line 346
    .line 347
    goto :goto_13

    .line 348
    :cond_1c
    :goto_16
    and-int/2addr v1, v0

    .line 349
    invoke-static {v5, v1}, Ljava/util/Arrays;->binarySearch([II)I

    .line 350
    .line 351
    .line 352
    move-result v1

    .line 353
    if-gez v1, :cond_1d

    .line 354
    .line 355
    move v1, v6

    .line 356
    goto :goto_17

    .line 357
    :cond_1d
    aget v1, v4, v1

    .line 358
    .line 359
    sub-int/2addr v1, v7

    .line 360
    rem-int/lit16 v1, v1, 0x3a1

    .line 361
    .line 362
    :goto_17
    if-ne v1, v6, :cond_1e

    .line 363
    .line 364
    goto :goto_19

    .line 365
    :cond_1e
    new-instance v3, La/ku5;

    .line 366
    .line 367
    new-array v4, v8, [I

    .line 368
    .line 369
    move/from16 v6, v16

    .line 370
    .line 371
    const/4 v5, 0x7

    .line 372
    :goto_18
    and-int/lit8 v8, v0, 0x1

    .line 373
    .line 374
    if-eq v8, v6, :cond_20

    .line 375
    .line 376
    add-int/lit8 v5, v5, -0x1

    .line 377
    .line 378
    if-gez v5, :cond_1f

    .line 379
    .line 380
    aget v0, v4, v16

    .line 381
    .line 382
    aget v5, v4, v17

    .line 383
    .line 384
    sub-int/2addr v0, v5

    .line 385
    const/4 v5, 0x4

    .line 386
    aget v5, v4, v5

    .line 387
    .line 388
    add-int/2addr v0, v5

    .line 389
    const/4 v5, 0x6

    .line 390
    aget v4, v4, v5

    .line 391
    .line 392
    sub-int/2addr v0, v4

    .line 393
    add-int/lit8 v0, v0, 0x9

    .line 394
    .line 395
    rem-int/lit8 v0, v0, 0x9

    .line 396
    .line 397
    const/4 v4, 0x2

    .line 398
    move/from16 p3, v0

    .line 399
    .line 400
    move/from16 p4, v1

    .line 401
    .line 402
    move/from16 p2, v2

    .line 403
    .line 404
    move-object/from16 p0, v3

    .line 405
    .line 406
    move/from16 p5, v4

    .line 407
    .line 408
    move/from16 p1, v11

    .line 409
    .line 410
    invoke-direct/range {p0 .. p5}, La/ku5;-><init>(IIIIB)V

    .line 411
    .line 412
    .line 413
    move-object/from16 v1, p0

    .line 414
    .line 415
    return-object v1

    .line 416
    :cond_1f
    move v6, v8

    .line 417
    :cond_20
    move-object/from16 v19, v3

    .line 418
    .line 419
    move v3, v1

    .line 420
    move-object/from16 v1, v19

    .line 421
    .line 422
    aget v8, v4, v5

    .line 423
    .line 424
    add-int/2addr v8, v7

    .line 425
    aput v8, v4, v5

    .line 426
    .line 427
    shr-int/lit8 v0, v0, 0x1

    .line 428
    .line 429
    move/from16 v19, v3

    .line 430
    .line 431
    move-object v3, v1

    .line 432
    move/from16 v1, v19

    .line 433
    .line 434
    goto :goto_18

    .line 435
    :goto_19
    return-object p4
.end method

.method public static d(La/r68;La/sq8;La/d3g0;ZII)La/egk;
    .locals 11

    .line 1
    move v3, p3

    .line 2
    new-instance v8, La/egk;

    .line 3
    .line 4
    invoke-direct {v8, p1, p3}, La/egk;-><init>(La/sq8;Z)V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    move v9, v0

    .line 9
    :goto_0
    const/4 v0, 0x2

    .line 10
    if-ge v9, v0, :cond_4

    .line 11
    .line 12
    if-nez v9, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x1

    .line 15
    :goto_1
    move v10, v0

    .line 16
    goto :goto_2

    .line 17
    :cond_0
    const/4 v0, -0x1

    .line 18
    goto :goto_1

    .line 19
    :goto_2
    iget v0, p2, La/d3g0;->a:F

    .line 20
    .line 21
    float-to-int v0, v0

    .line 22
    iget v1, p2, La/d3g0;->b:F

    .line 23
    .line 24
    float-to-int v1, v1

    .line 25
    move v4, v0

    .line 26
    move v5, v1

    .line 27
    :goto_3
    iget v0, p1, La/sq8;->d:I

    .line 28
    .line 29
    if-gt v5, v0, :cond_3

    .line 30
    .line 31
    iget v0, p1, La/sq8;->c:I

    .line 32
    .line 33
    if-lt v5, v0, :cond_3

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    iget v2, p0, La/r68;->a:I

    .line 37
    .line 38
    move-object v0, p0

    .line 39
    move v6, p4

    .line 40
    move/from16 v7, p5

    .line 41
    .line 42
    invoke-static/range {v0 .. v7}, La/jg80;->c(La/r68;IIZIIII)La/ku5;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    iget-object v0, v8, La/zri;->c:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, [La/ku5;

    .line 51
    .line 52
    invoke-virtual {v8, v5}, La/zri;->d(I)I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    aput-object v1, v0, v2

    .line 57
    .line 58
    if-eqz p3, :cond_1

    .line 59
    .line 60
    iget v0, v1, La/ku5;->b:I

    .line 61
    .line 62
    :goto_4
    move v4, v0

    .line 63
    goto :goto_5

    .line 64
    :cond_1
    iget v0, v1, La/ku5;->c:I

    .line 65
    .line 66
    goto :goto_4

    .line 67
    :cond_2
    :goto_5
    add-int/2addr v5, v10

    .line 68
    move v3, p3

    .line 69
    goto :goto_3

    .line 70
    :cond_3
    add-int/lit8 v9, v9, 0x1

    .line 71
    .line 72
    move v3, p3

    .line 73
    goto :goto_0

    .line 74
    :cond_4
    return-object v8
.end method
