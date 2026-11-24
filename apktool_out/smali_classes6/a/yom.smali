.class public abstract La/yom;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42200000    # 40.0f

    .line 4
    .line 5
    sput v0, La/yom;->a:F

    .line 6
    .line 7
    const/high16 v0, 0x41200000    # 10.0f

    .line 8
    .line 9
    sput v0, La/yom;->b:F

    .line 10
    .line 11
    const/high16 v0, 0x41a00000    # 20.0f

    .line 12
    .line 13
    sput v0, La/yom;->c:F

    .line 14
    .line 15
    const/high16 v0, 0x40000000    # 2.0f

    .line 16
    .line 17
    sput v0, La/yom;->d:F

    .line 18
    .line 19
    const-wide/high16 v1, 0x4089000000000000L    # 800.0

    .line 20
    .line 21
    invoke-static {v1, v2}, Ljava/lang/Math;->sqrt(D)D

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    double-to-float v1, v1

    .line 26
    mul-float/2addr v1, v0

    .line 27
    const/high16 v0, 0x41f00000    # 30.0f

    .line 28
    .line 29
    div-float/2addr v0, v1

    .line 30
    sput v0, La/yom;->e:F

    .line 31
    .line 32
    return-void
.end method

.method public static final a(La/mm40;ZZLa/utd0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p1

    .line 4
    .line 5
    move/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v9, p5

    .line 12
    .line 13
    const v0, 0x610d4a7e

    .line 14
    .line 15
    .line 16
    invoke-virtual {v9, v0}, La/fet;->g0(I)La/fet;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v12, 0x2

    .line 24
    const/4 v13, 0x4

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    move v0, v13

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v0, v12

    .line 30
    :goto_0
    or-int v0, p6, v0

    .line 31
    .line 32
    invoke-virtual {v9, v2}, La/fet;->h(Z)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-eqz v6, :cond_1

    .line 37
    .line 38
    const/16 v6, 0x20

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const/16 v6, 0x10

    .line 42
    .line 43
    :goto_1
    or-int/2addr v0, v6

    .line 44
    invoke-virtual {v9, v3}, La/fet;->h(Z)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_2

    .line 49
    .line 50
    const/16 v6, 0x100

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    const/16 v6, 0x80

    .line 54
    .line 55
    :goto_2
    or-int/2addr v0, v6

    .line 56
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-eqz v6, :cond_3

    .line 61
    .line 62
    const/16 v6, 0x800

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_3
    const/16 v6, 0x400

    .line 66
    .line 67
    :goto_3
    or-int/2addr v0, v6

    .line 68
    const/4 v6, 0x0

    .line 69
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    const/16 v7, 0x4000

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_4
    const/16 v7, 0x2000

    .line 79
    .line 80
    :goto_4
    or-int/2addr v0, v7

    .line 81
    invoke-virtual {v9, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    if-eqz v7, :cond_5

    .line 86
    .line 87
    const/high16 v7, 0x20000

    .line 88
    .line 89
    goto :goto_5

    .line 90
    :cond_5
    const/high16 v7, 0x10000

    .line 91
    .line 92
    :goto_5
    or-int/2addr v0, v7

    .line 93
    const v7, 0x12493

    .line 94
    .line 95
    .line 96
    and-int/2addr v7, v0

    .line 97
    const v8, 0x12492

    .line 98
    .line 99
    .line 100
    const/4 v14, 0x0

    .line 101
    const/4 v10, 0x1

    .line 102
    if-eq v7, v8, :cond_6

    .line 103
    .line 104
    move v7, v10

    .line 105
    goto :goto_6

    .line 106
    :cond_6
    move v7, v14

    .line 107
    :goto_6
    and-int/2addr v0, v10

    .line 108
    invoke-virtual {v9, v0, v7}, La/fet;->U(IZ)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_11

    .line 113
    .line 114
    invoke-virtual {v9}, La/fet;->Z()V

    .line 115
    .line 116
    .line 117
    and-int/lit8 v0, p6, 0x1

    .line 118
    .line 119
    if-eqz v0, :cond_8

    .line 120
    .line 121
    invoke-virtual {v9}, La/fet;->B()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    goto :goto_7

    .line 128
    :cond_7
    invoke-virtual {v9}, La/fet;->X()V

    .line 129
    .line 130
    .line 131
    :cond_8
    :goto_7
    invoke-virtual {v9}, La/fet;->s()V

    .line 132
    .line 133
    .line 134
    const/high16 v0, 0x40000000    # 2.0f

    .line 135
    .line 136
    if-eqz v2, :cond_9

    .line 137
    .line 138
    sget v7, La/yom;->b:F

    .line 139
    .line 140
    div-float/2addr v7, v0

    .line 141
    goto :goto_8

    .line 142
    :cond_9
    sget-object v7, La/qmk;->a:La/zcl;

    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    :goto_8
    sget v8, La/yom;->e:F

    .line 146
    .line 147
    const/high16 v10, 0x44480000    # 800.0f

    .line 148
    .line 149
    invoke-static {v8, v10, v6, v13}, La/ro4;->g0(FFLjava/lang/Object;I)La/nul0;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    const/16 v10, 0x30

    .line 154
    .line 155
    const/16 v11, 0xc

    .line 156
    .line 157
    const/4 v8, 0x0

    .line 158
    move/from16 v16, v7

    .line 159
    .line 160
    move-object v7, v6

    .line 161
    move/from16 v6, v16

    .line 162
    .line 163
    invoke-static/range {v6 .. v11}, La/d43;->a(FLa/cfq;Ljava/lang/String;La/fet;II)La/l7m0;

    .line 164
    .line 165
    .line 166
    move-result-object v15

    .line 167
    if-eqz v3, :cond_a

    .line 168
    .line 169
    if-eqz v2, :cond_a

    .line 170
    .line 171
    iget-wide v6, v4, La/utd0;->a:J

    .line 172
    .line 173
    goto :goto_9

    .line 174
    :cond_a
    if-eqz v3, :cond_b

    .line 175
    .line 176
    if-nez v2, :cond_b

    .line 177
    .line 178
    iget-wide v6, v4, La/utd0;->b:J

    .line 179
    .line 180
    goto :goto_9

    .line 181
    :cond_b
    if-nez v3, :cond_c

    .line 182
    .line 183
    if-eqz v2, :cond_c

    .line 184
    .line 185
    iget-wide v6, v4, La/utd0;->c:J

    .line 186
    .line 187
    goto :goto_9

    .line 188
    :cond_c
    iget-wide v6, v4, La/utd0;->d:J

    .line 189
    .line 190
    :goto_9
    if-eqz v3, :cond_d

    .line 191
    .line 192
    const v8, -0x783f9558

    .line 193
    .line 194
    .line 195
    invoke-virtual {v9, v8}, La/fet;->e0(I)V

    .line 196
    .line 197
    .line 198
    const/4 v10, 0x0

    .line 199
    const/16 v11, 0xe

    .line 200
    .line 201
    const/4 v8, 0x0

    .line 202
    invoke-static/range {v6 .. v11}, La/m5k0;->b(JLa/j73;La/fet;II)La/l7m0;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    invoke-virtual {v9, v14}, La/fet;->r(Z)V

    .line 207
    .line 208
    .line 209
    goto :goto_a

    .line 210
    :cond_d
    const v8, -0x783ed759

    .line 211
    .line 212
    .line 213
    invoke-virtual {v9, v8}, La/fet;->e0(I)V

    .line 214
    .line 215
    .line 216
    new-instance v8, La/y3d;

    .line 217
    .line 218
    invoke-direct {v8, v6, v7}, La/y3d;-><init>(J)V

    .line 219
    .line 220
    .line 221
    invoke-static {v8, v9}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 222
    .line 223
    .line 224
    move-result-object v6

    .line 225
    invoke-virtual {v9, v14}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    :goto_a
    if-eqz v5, :cond_e

    .line 229
    .line 230
    sget v7, La/yom;->a:F

    .line 231
    .line 232
    div-float/2addr v7, v0

    .line 233
    invoke-static {v7, v13}, La/lcg0;->a(FI)La/ncg0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    new-instance v7, La/ucg0;

    .line 238
    .line 239
    const/4 v8, 0x3

    .line 240
    invoke-direct {v7, v8}, La/ucg0;-><init>(I)V

    .line 241
    .line 242
    .line 243
    invoke-static {v2, v0, v3, v7, v5}, La/rsr0;->g0(ZLa/ncg0;ZLa/ucg0;Lkotlin/jvm/functions/Function0;)La/mm40;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    goto :goto_b

    .line 248
    :cond_e
    sget-object v0, La/jm40;->b:La/jm40;

    .line 249
    .line 250
    :goto_b
    invoke-interface {v1, v0}, La/mm40;->e(La/mm40;)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v7, La/gqw0;->e:La/zx7;

    .line 255
    .line 256
    invoke-static {v0, v7, v12}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget v7, La/yom;->c:F

    .line 261
    .line 262
    invoke-static {v0, v7}, La/o7k0;->i(La/mm40;F)La/mm40;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    invoke-virtual {v9, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v7

    .line 270
    invoke-virtual {v9, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v8

    .line 274
    or-int/2addr v7, v8

    .line 275
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 276
    .line 277
    .line 278
    move-result-object v8

    .line 279
    if-nez v7, :cond_f

    .line 280
    .line 281
    sget-object v7, La/ukd;->a:La/cl5;

    .line 282
    .line 283
    if-ne v8, v7, :cond_10

    .line 284
    .line 285
    :cond_f
    new-instance v8, La/sz7;

    .line 286
    .line 287
    invoke-direct {v8, v6, v15, v12}, La/sz7;-><init>(La/l7m0;La/l7m0;B)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v9, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 291
    .line 292
    .line 293
    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 294
    .line 295
    invoke-static {v0, v8, v9, v14}, La/p8a;->k(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 296
    .line 297
    .line 298
    goto :goto_c

    .line 299
    :cond_11
    invoke-virtual {v9}, La/fet;->X()V

    .line 300
    .line 301
    .line 302
    :goto_c
    invoke-virtual {v9}, La/fet;->u()La/yfe0;

    .line 303
    .line 304
    .line 305
    move-result-object v8

    .line 306
    if-eqz v8, :cond_12

    .line 307
    .line 308
    new-instance v0, La/qg5;

    .line 309
    .line 310
    const/4 v7, 0x2

    .line 311
    move/from16 v6, p6

    .line 312
    .line 313
    invoke-direct/range {v0 .. v7}, La/qg5;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;La/wdr;IB)V

    .line 314
    .line 315
    .line 316
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 317
    .line 318
    :cond_12
    return-void
.end method

.method public static final b(La/mm40;ZZLkotlin/jvm/functions/Function0;La/fet;II)V
    .locals 10

    .line 1
    const v1, 0x52232059

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v1}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v1, p6, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    or-int/lit8 v2, p5, 0x6

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    and-int/lit8 v2, p5, 0x6

    .line 15
    .line 16
    if-nez v2, :cond_2

    .line 17
    .line 18
    invoke-virtual {p4, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    const/4 v2, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v2, 0x2

    .line 27
    :goto_0
    or-int/2addr v2, p5

    .line 28
    goto :goto_1

    .line 29
    :cond_2
    move v2, p5

    .line 30
    :goto_1
    and-int/lit8 v3, p5, 0x30

    .line 31
    .line 32
    if-nez v3, :cond_4

    .line 33
    .line 34
    invoke-virtual {p4, p1}, La/fet;->h(Z)Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_3

    .line 39
    .line 40
    const/16 v3, 0x20

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_3
    const/16 v3, 0x10

    .line 44
    .line 45
    :goto_2
    or-int/2addr v2, v3

    .line 46
    :cond_4
    and-int/lit8 v3, p6, 0x4

    .line 47
    .line 48
    if-eqz v3, :cond_5

    .line 49
    .line 50
    or-int/lit16 v2, v2, 0x180

    .line 51
    .line 52
    goto :goto_4

    .line 53
    :cond_5
    and-int/lit16 v4, p5, 0x180

    .line 54
    .line 55
    if-nez v4, :cond_7

    .line 56
    .line 57
    invoke-virtual {p4, p2}, La/fet;->h(Z)Z

    .line 58
    .line 59
    .line 60
    move-result v4

    .line 61
    if-eqz v4, :cond_6

    .line 62
    .line 63
    const/16 v4, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_6
    const/16 v4, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v2, v4

    .line 69
    :cond_7
    :goto_4
    or-int/lit16 v4, v2, 0xc00

    .line 70
    .line 71
    and-int/lit8 v6, p6, 0x10

    .line 72
    .line 73
    if-eqz v6, :cond_8

    .line 74
    .line 75
    or-int/lit16 v4, v2, 0x6c00

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_8
    and-int/lit16 v2, p5, 0x6000

    .line 79
    .line 80
    if-nez v2, :cond_a

    .line 81
    .line 82
    invoke-virtual {p4, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v7

    .line 86
    if-eqz v7, :cond_9

    .line 87
    .line 88
    const/16 v7, 0x4000

    .line 89
    .line 90
    goto :goto_5

    .line 91
    :cond_9
    const/16 v7, 0x2000

    .line 92
    .line 93
    :goto_5
    or-int/2addr v4, v7

    .line 94
    :cond_a
    :goto_6
    and-int/lit16 v7, v4, 0x2493

    .line 95
    .line 96
    const/16 v8, 0x2492

    .line 97
    .line 98
    const/4 v9, 0x1

    .line 99
    if-eq v7, v8, :cond_b

    .line 100
    .line 101
    move v7, v9

    .line 102
    goto :goto_7

    .line 103
    :cond_b
    const/4 v7, 0x0

    .line 104
    :goto_7
    and-int/2addr v4, v9

    .line 105
    invoke-virtual {p4, v4, v7}, La/fet;->U(IZ)Z

    .line 106
    .line 107
    .line 108
    move-result v4

    .line 109
    if-eqz v4, :cond_f

    .line 110
    .line 111
    if-eqz v1, :cond_c

    .line 112
    .line 113
    sget-object p0, La/jm40;->b:La/jm40;

    .line 114
    .line 115
    :cond_c
    if-eqz v3, :cond_d

    .line 116
    .line 117
    move p2, v9

    .line 118
    :cond_d
    if-eqz v6, :cond_e

    .line 119
    .line 120
    const/4 v1, 0x0

    .line 121
    goto :goto_8

    .line 122
    :cond_e
    move-object v1, p3

    .line 123
    :goto_8
    sget-object v2, La/rlx;->c:La/zfn;

    .line 124
    .line 125
    new-instance v3, La/ycl;

    .line 126
    .line 127
    sget v4, La/yom;->a:F

    .line 128
    .line 129
    invoke-direct {v3, v4}, La/ycl;-><init>(F)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v2, v3}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    new-instance v3, La/yw;

    .line 137
    .line 138
    invoke-direct {v3, p0, p1, p2, v1}, La/yw;-><init>(La/mm40;ZZLkotlin/jvm/functions/Function0;)V

    .line 139
    .line 140
    .line 141
    const v4, -0x6103ac67

    .line 142
    .line 143
    .line 144
    invoke-static {v4, v3, p4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 145
    .line 146
    .line 147
    move-result-object v3

    .line 148
    const/16 v4, 0x38

    .line 149
    .line 150
    invoke-static {v2, v3, p4, v4}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 151
    .line 152
    .line 153
    move-object v4, v1

    .line 154
    move v3, p2

    .line 155
    move-object v1, p0

    .line 156
    goto :goto_9

    .line 157
    :cond_f
    invoke-virtual {p4}, La/fet;->X()V

    .line 158
    .line 159
    .line 160
    move-object v4, p3

    .line 161
    move-object v1, p0

    .line 162
    move v3, p2

    .line 163
    :goto_9
    invoke-virtual {p4}, La/fet;->u()La/yfe0;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    if-eqz p0, :cond_10

    .line 168
    .line 169
    new-instance v0, La/xom;

    .line 170
    .line 171
    move v2, p1

    .line 172
    move v5, p5

    .line 173
    move/from16 v6, p6

    .line 174
    .line 175
    invoke-direct/range {v0 .. v6}, La/xom;-><init>(La/mm40;ZZLkotlin/jvm/functions/Function0;II)V

    .line 176
    .line 177
    .line 178
    iput-object v0, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 179
    .line 180
    :cond_10
    return-void
.end method
