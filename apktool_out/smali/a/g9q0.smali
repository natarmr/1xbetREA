.class public final La/g9q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/mrq;

.field public final b:La/w6k;

.field public final c:La/k6z;

.field public final d:La/yuu;


# direct methods
.method public constructor <init>(La/mrq;La/w6k;La/k6z;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/g9q0;->a:La/mrq;

    .line 5
    .line 6
    iput-object p2, p0, La/g9q0;->b:La/w6k;

    .line 7
    .line 8
    iput-object p3, p0, La/g9q0;->c:La/k6z;

    .line 9
    .line 10
    new-instance p1, La/yuu;

    .line 11
    .line 12
    invoke-direct {p1}, La/yuu;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/g9q0;->d:La/yuu;

    .line 16
    .line 17
    return-void
.end method

.method public static a(La/g9q0;Ljava/lang/String;La/y9q0;IIJLa/k6z;I)La/a9q0;
    .locals 12

    .line 1
    and-int/lit8 v1, p8, 0x4

    .line 2
    .line 3
    const/4 v2, 0x1

    .line 4
    if-eqz v1, :cond_0

    .line 5
    .line 6
    move v3, v2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    move v3, p3

    .line 9
    :goto_0
    and-int/lit8 v1, p8, 0x8

    .line 10
    .line 11
    const/4 v4, 0x0

    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    move v2, v4

    .line 16
    :goto_1
    and-int/lit8 v1, p8, 0x10

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    const v1, 0x7fffffff

    .line 21
    .line 22
    .line 23
    move v5, v1

    .line 24
    goto :goto_2

    .line 25
    :cond_2
    move/from16 v5, p4

    .line 26
    .line 27
    :goto_2
    and-int/lit8 v1, p8, 0x20

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    const/16 v1, 0xf

    .line 32
    .line 33
    invoke-static {v4, v4, v4, v4, v1}, La/r4e;->b(IIIII)J

    .line 34
    .line 35
    .line 36
    move-result-wide v6

    .line 37
    goto :goto_3

    .line 38
    :cond_3
    move-wide/from16 v6, p5

    .line 39
    .line 40
    :goto_3
    and-int/lit8 v1, p8, 0x40

    .line 41
    .line 42
    if-eqz v1, :cond_4

    .line 43
    .line 44
    iget-object v1, p0, La/g9q0;->c:La/k6z;

    .line 45
    .line 46
    move-object v8, v1

    .line 47
    goto :goto_4

    .line 48
    :cond_4
    move-object/from16 v8, p7

    .line 49
    .line 50
    :goto_4
    iget-object v9, p0, La/g9q0;->b:La/w6k;

    .line 51
    .line 52
    iget-object v10, p0, La/g9q0;->a:La/mrq;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    new-instance v1, La/j83;

    .line 58
    .line 59
    invoke-direct {v1, p1}, La/j83;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const/16 v11, 0x20

    .line 63
    .line 64
    move-object v0, p0

    .line 65
    move v4, v2

    .line 66
    move-object v2, p2

    .line 67
    invoke-static/range {v0 .. v11}, La/g9q0;->b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    return-object v0
.end method

.method public static b(La/g9q0;La/j83;La/y9q0;IZIJLa/k6z;La/w6k;La/mrq;I)La/a9q0;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p11

    .line 4
    .line 5
    and-int/lit8 v2, v1, 0x4

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    move v10, v3

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    move/from16 v10, p3

    .line 13
    .line 14
    :goto_0
    and-int/lit8 v2, v1, 0x8

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    move v9, v3

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    move/from16 v9, p4

    .line 21
    .line 22
    :goto_1
    and-int/lit8 v2, v1, 0x10

    .line 23
    .line 24
    const v16, 0x7fffffff

    .line 25
    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    move/from16 v8, v16

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move/from16 v8, p5

    .line 33
    .line 34
    :goto_2
    sget-object v7, La/iun;->a:La/iun;

    .line 35
    .line 36
    and-int/lit8 v2, v1, 0x40

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    const/16 v2, 0xf

    .line 42
    .line 43
    invoke-static {v4, v4, v4, v4, v2}, La/r4e;->b(IIIII)J

    .line 44
    .line 45
    .line 46
    move-result-wide v5

    .line 47
    move-wide v14, v5

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move-wide/from16 v14, p6

    .line 50
    .line 51
    :goto_3
    and-int/lit16 v2, v1, 0x80

    .line 52
    .line 53
    if-eqz v2, :cond_4

    .line 54
    .line 55
    iget-object v2, v0, La/g9q0;->c:La/k6z;

    .line 56
    .line 57
    move-object v12, v2

    .line 58
    goto :goto_4

    .line 59
    :cond_4
    move-object/from16 v12, p8

    .line 60
    .line 61
    :goto_4
    and-int/lit16 v2, v1, 0x100

    .line 62
    .line 63
    if-eqz v2, :cond_5

    .line 64
    .line 65
    iget-object v2, v0, La/g9q0;->b:La/w6k;

    .line 66
    .line 67
    move-object v11, v2

    .line 68
    goto :goto_5

    .line 69
    :cond_5
    move-object/from16 v11, p9

    .line 70
    .line 71
    :goto_5
    and-int/lit16 v1, v1, 0x200

    .line 72
    .line 73
    if-eqz v1, :cond_6

    .line 74
    .line 75
    iget-object v1, v0, La/g9q0;->a:La/mrq;

    .line 76
    .line 77
    move-object v13, v1

    .line 78
    goto :goto_6

    .line 79
    :cond_6
    move-object/from16 v13, p10

    .line 80
    .line 81
    :goto_6
    iget-object v0, v0, La/g9q0;->d:La/yuu;

    .line 82
    .line 83
    move v1, v4

    .line 84
    new-instance v4, La/z8q0;

    .line 85
    .line 86
    move-object/from16 v5, p1

    .line 87
    .line 88
    move-object/from16 v6, p2

    .line 89
    .line 90
    invoke-direct/range {v4 .. v15}, La/z8q0;-><init>(La/j83;La/y9q0;Ljava/util/List;IZILa/w6k;La/k6z;La/mrq;J)V

    .line 91
    .line 92
    .line 93
    const/4 v2, 0x0

    .line 94
    if-eqz v0, :cond_a

    .line 95
    .line 96
    new-instance v5, La/ej9;

    .line 97
    .line 98
    invoke-direct {v5, v4}, La/ej9;-><init>(La/z8q0;)V

    .line 99
    .line 100
    .line 101
    iget-object v6, v0, La/yuu;->b:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v6, La/dj10;

    .line 104
    .line 105
    if-eqz v6, :cond_7

    .line 106
    .line 107
    invoke-virtual {v6, v5}, La/dj10;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, La/a9q0;

    .line 112
    .line 113
    goto :goto_7

    .line 114
    :cond_7
    iget-object v6, v0, La/yuu;->c:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v6, La/ej9;

    .line 117
    .line 118
    invoke-static {v6, v5}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v5

    .line 122
    if-eqz v5, :cond_a

    .line 123
    .line 124
    iget-object v5, v0, La/yuu;->d:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v5, La/a9q0;

    .line 127
    .line 128
    :goto_7
    if-nez v5, :cond_8

    .line 129
    .line 130
    goto :goto_8

    .line 131
    :cond_8
    iget-object v6, v5, La/a9q0;->b:La/bw40;

    .line 132
    .line 133
    iget-object v6, v6, La/bw40;->a:La/w5z;

    .line 134
    .line 135
    invoke-virtual {v6}, La/w5z;->b()Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_9

    .line 140
    .line 141
    goto :goto_8

    .line 142
    :cond_9
    move-object v2, v5

    .line 143
    :cond_a
    :goto_8
    const/16 v5, 0x20

    .line 144
    .line 145
    const-wide v17, 0xffffffffL

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    if-eqz v2, :cond_b

    .line 151
    .line 152
    iget-object v0, v2, La/a9q0;->b:La/bw40;

    .line 153
    .line 154
    iget v1, v0, La/bw40;->d:F

    .line 155
    .line 156
    float-to-double v1, v1

    .line 157
    invoke-static {v1, v2}, Ljava/lang/Math;->ceil(D)D

    .line 158
    .line 159
    .line 160
    move-result-wide v1

    .line 161
    double-to-float v1, v1

    .line 162
    float-to-int v1, v1

    .line 163
    iget v2, v0, La/bw40;->e:F

    .line 164
    .line 165
    float-to-double v2, v2

    .line 166
    invoke-static {v2, v3}, Ljava/lang/Math;->ceil(D)D

    .line 167
    .line 168
    .line 169
    move-result-wide v2

    .line 170
    double-to-float v2, v2

    .line 171
    float-to-int v2, v2

    .line 172
    int-to-long v6, v1

    .line 173
    shl-long v5, v6, v5

    .line 174
    .line 175
    int-to-long v1, v2

    .line 176
    and-long v1, v1, v17

    .line 177
    .line 178
    or-long/2addr v1, v5

    .line 179
    invoke-static {v14, v15, v1, v2}, La/r4e;->d(JJ)J

    .line 180
    .line 181
    .line 182
    move-result-wide v1

    .line 183
    new-instance v3, La/a9q0;

    .line 184
    .line 185
    invoke-direct {v3, v4, v0, v1, v2}, La/a9q0;-><init>(La/z8q0;La/bw40;J)V

    .line 186
    .line 187
    .line 188
    return-object v3

    .line 189
    :cond_b
    move-object/from16 v6, p2

    .line 190
    .line 191
    invoke-static {v6, v12}, La/afn0;->A(La/y9q0;La/k6z;)La/y9q0;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    new-instance v6, La/w5z;

    .line 196
    .line 197
    move-object/from16 p3, p1

    .line 198
    .line 199
    move-object/from16 p6, v2

    .line 200
    .line 201
    move-object/from16 p2, v6

    .line 202
    .line 203
    move-object/from16 p7, v7

    .line 204
    .line 205
    move/from16 p8, v9

    .line 206
    .line 207
    move-object/from16 p4, v11

    .line 208
    .line 209
    move-object/from16 p5, v13

    .line 210
    .line 211
    invoke-direct/range {p2 .. p8}, La/w5z;-><init>(La/j83;La/w6k;La/mrq;La/y9q0;Ljava/util/List;Z)V

    .line 212
    .line 213
    .line 214
    move-object/from16 v2, p2

    .line 215
    .line 216
    invoke-static {v14, v15}, La/p4e;->k(J)I

    .line 217
    .line 218
    .line 219
    move-result v6

    .line 220
    const/4 v7, 0x5

    .line 221
    const/4 v11, 0x2

    .line 222
    const/4 v12, 0x4

    .line 223
    if-nez v9, :cond_e

    .line 224
    .line 225
    if-ne v10, v11, :cond_c

    .line 226
    .line 227
    goto :goto_9

    .line 228
    :cond_c
    if-ne v10, v12, :cond_d

    .line 229
    .line 230
    goto :goto_9

    .line 231
    :cond_d
    if-ne v10, v7, :cond_f

    .line 232
    .line 233
    :cond_e
    :goto_9
    invoke-static {v14, v15}, La/p4e;->e(J)Z

    .line 234
    .line 235
    .line 236
    move-result v13

    .line 237
    if-eqz v13, :cond_f

    .line 238
    .line 239
    invoke-static {v14, v15}, La/p4e;->i(J)I

    .line 240
    .line 241
    .line 242
    move-result v16

    .line 243
    :cond_f
    move/from16 v13, v16

    .line 244
    .line 245
    if-nez v9, :cond_12

    .line 246
    .line 247
    if-ne v10, v11, :cond_10

    .line 248
    .line 249
    goto :goto_a

    .line 250
    :cond_10
    if-ne v10, v12, :cond_11

    .line 251
    .line 252
    goto :goto_a

    .line 253
    :cond_11
    if-ne v10, v7, :cond_12

    .line 254
    .line 255
    goto :goto_a

    .line 256
    :cond_12
    move v3, v8

    .line 257
    :goto_a
    if-ne v6, v13, :cond_13

    .line 258
    .line 259
    goto :goto_b

    .line 260
    :cond_13
    invoke-virtual {v2}, La/w5z;->e()F

    .line 261
    .line 262
    .line 263
    move-result v7

    .line 264
    float-to-double v7, v7

    .line 265
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 266
    .line 267
    .line 268
    move-result-wide v7

    .line 269
    double-to-float v7, v7

    .line 270
    float-to-int v7, v7

    .line 271
    invoke-static {v7, v6, v13}, La/l1e0;->d(III)I

    .line 272
    .line 273
    .line 274
    move-result v13

    .line 275
    :goto_b
    new-instance v6, La/bw40;

    .line 276
    .line 277
    invoke-static {v14, v15}, La/p4e;->h(J)I

    .line 278
    .line 279
    .line 280
    move-result v7

    .line 281
    invoke-static {v1, v13, v1, v7}, La/lgb;->O(IIII)J

    .line 282
    .line 283
    .line 284
    move-result-wide v7

    .line 285
    move-object/from16 p1, v2

    .line 286
    .line 287
    move/from16 p4, v3

    .line 288
    .line 289
    move-object/from16 p0, v6

    .line 290
    .line 291
    move-wide/from16 p2, v7

    .line 292
    .line 293
    move/from16 p5, v10

    .line 294
    .line 295
    invoke-direct/range {p0 .. p5}, La/bw40;-><init>(La/w5z;JII)V

    .line 296
    .line 297
    .line 298
    move-object/from16 v1, p0

    .line 299
    .line 300
    new-instance v2, La/a9q0;

    .line 301
    .line 302
    iget v3, v1, La/bw40;->d:F

    .line 303
    .line 304
    float-to-double v6, v3

    .line 305
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 306
    .line 307
    .line 308
    move-result-wide v6

    .line 309
    double-to-float v3, v6

    .line 310
    float-to-int v3, v3

    .line 311
    iget v6, v1, La/bw40;->e:F

    .line 312
    .line 313
    float-to-double v6, v6

    .line 314
    invoke-static {v6, v7}, Ljava/lang/Math;->ceil(D)D

    .line 315
    .line 316
    .line 317
    move-result-wide v6

    .line 318
    double-to-float v6, v6

    .line 319
    float-to-int v6, v6

    .line 320
    int-to-long v7, v3

    .line 321
    shl-long/2addr v7, v5

    .line 322
    int-to-long v5, v6

    .line 323
    and-long v5, v5, v17

    .line 324
    .line 325
    or-long/2addr v5, v7

    .line 326
    invoke-static {v14, v15, v5, v6}, La/r4e;->d(JJ)J

    .line 327
    .line 328
    .line 329
    move-result-wide v5

    .line 330
    invoke-direct {v2, v4, v1, v5, v6}, La/a9q0;-><init>(La/z8q0;La/bw40;J)V

    .line 331
    .line 332
    .line 333
    if-eqz v0, :cond_15

    .line 334
    .line 335
    iget-object v1, v0, La/yuu;->b:Ljava/lang/Object;

    .line 336
    .line 337
    check-cast v1, La/dj10;

    .line 338
    .line 339
    if-eqz v1, :cond_14

    .line 340
    .line 341
    new-instance v0, La/ej9;

    .line 342
    .line 343
    invoke-direct {v0, v4}, La/ej9;-><init>(La/z8q0;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v0, v2}, La/dj10;->d(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    return-object v2

    .line 350
    :cond_14
    new-instance v1, La/ej9;

    .line 351
    .line 352
    invoke-direct {v1, v4}, La/ej9;-><init>(La/z8q0;)V

    .line 353
    .line 354
    .line 355
    iput-object v1, v0, La/yuu;->c:Ljava/lang/Object;

    .line 356
    .line 357
    iput-object v2, v0, La/yuu;->d:Ljava/lang/Object;

    .line 358
    .line 359
    :cond_15
    return-object v2
.end method
