.class public abstract La/jjj;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:J

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-wide/16 v0, 0x1f4

    .line 2
    .line 3
    sget-object v2, La/bfn;->d:La/bfn;

    .line 4
    .line 5
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    sput-wide v0, La/jjj;->a:J

    .line 10
    .line 11
    sget-object v0, La/qmk;->a:La/zcl;

    .line 12
    .line 13
    const/high16 v0, 0x43a00000    # 320.0f

    .line 14
    .line 15
    sput v0, La/jjj;->b:F

    .line 16
    .line 17
    const/high16 v0, 0x437a0000    # 250.0f

    .line 18
    .line 19
    sput v0, La/jjj;->c:F

    .line 20
    .line 21
    const/high16 v0, 0x43480000    # 200.0f

    .line 22
    .line 23
    sput v0, La/jjj;->d:F

    .line 24
    .line 25
    const/high16 v0, 0x43160000    # 150.0f

    .line 26
    .line 27
    sput v0, La/jjj;->e:F

    .line 28
    .line 29
    return-void
.end method

.method public static final a(La/mm40;La/kjj;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 11

    .line 1
    move-object/from16 v4, p5

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v0, -0x67bdd9ab

    .line 16
    .line 17
    .line 18
    invoke-virtual {v4, v0}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    or-int/lit8 v0, p6, 0x6

    .line 22
    .line 23
    invoke-virtual {v4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    const/16 v1, 0x20

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v1, 0x10

    .line 33
    .line 34
    :goto_0
    or-int/2addr v0, v1

    .line 35
    invoke-virtual {v4, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    const/16 v1, 0x100

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/16 v1, 0x80

    .line 45
    .line 46
    :goto_1
    or-int/2addr v0, v1

    .line 47
    invoke-virtual {v4, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_2

    .line 52
    .line 53
    const/16 v1, 0x800

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const/16 v1, 0x400

    .line 57
    .line 58
    :goto_2
    or-int/2addr v0, v1

    .line 59
    invoke-virtual {v4, p4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_3

    .line 64
    .line 65
    const/16 v1, 0x4000

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    const/16 v1, 0x2000

    .line 69
    .line 70
    :goto_3
    or-int/2addr v0, v1

    .line 71
    and-int/lit16 v1, v0, 0x2493

    .line 72
    .line 73
    const/16 v2, 0x2492

    .line 74
    .line 75
    const/4 v6, 0x1

    .line 76
    if-eq v1, v2, :cond_4

    .line 77
    .line 78
    move v1, v6

    .line 79
    goto :goto_4

    .line 80
    :cond_4
    const/4 v1, 0x0

    .line 81
    :goto_4
    and-int/2addr v0, v6

    .line 82
    invoke-virtual {v4, v0, v1}, La/fet;->U(IZ)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-eqz v0, :cond_5

    .line 87
    .line 88
    sget-object v0, La/o7k0;->c:La/n0q;

    .line 89
    .line 90
    new-instance v5, La/x2g;

    .line 91
    .line 92
    const/4 v10, 0x1

    .line 93
    move-object v6, p1

    .line 94
    move-object v7, p2

    .line 95
    move-object v8, p3

    .line 96
    move-object v9, p4

    .line 97
    invoke-direct/range {v5 .. v10}, La/x2g;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/wdr;B)V

    .line 98
    .line 99
    .line 100
    const v1, -0x311623d5

    .line 101
    .line 102
    .line 103
    invoke-static {v1, v5, v4}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    const/16 v5, 0xc00

    .line 108
    .line 109
    const/4 v6, 0x6

    .line 110
    const/4 v1, 0x0

    .line 111
    const/4 v2, 0x0

    .line 112
    invoke-static/range {v0 .. v6}, La/nnw0;->g(La/mm40;La/u12;ZLa/ugd;La/fet;II)V

    .line 113
    .line 114
    .line 115
    sget-object v0, La/jm40;->b:La/jm40;

    .line 116
    .line 117
    move-object v2, v0

    .line 118
    goto :goto_5

    .line 119
    :cond_5
    invoke-virtual/range {p5 .. p5}, La/fet;->X()V

    .line 120
    .line 121
    .line 122
    move-object v2, p0

    .line 123
    :goto_5
    invoke-virtual/range {p5 .. p5}, La/fet;->u()La/yfe0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    if-eqz v0, :cond_6

    .line 128
    .line 129
    new-instance v1, La/ba00;

    .line 130
    .line 131
    const/16 v8, 0x1c

    .line 132
    .line 133
    move-object v3, p1

    .line 134
    move-object v4, p2

    .line 135
    move-object v5, p3

    .line 136
    move-object v6, p4

    .line 137
    move/from16 v7, p6

    .line 138
    .line 139
    invoke-direct/range {v1 .. v8}, La/ba00;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 140
    .line 141
    .line 142
    iput-object v1, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 143
    .line 144
    :cond_6
    return-void
.end method

.method public static final b(IIJLa/fet;La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V
    .locals 23

    .line 1
    move/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v12, p4

    .line 6
    .line 7
    move-object/from16 v0, p7

    .line 8
    .line 9
    const v2, 0x66eb2bf9

    .line 10
    .line 11
    .line 12
    invoke-virtual {v12, v2}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    or-int/lit8 v2, p1, 0x6

    .line 16
    .line 17
    invoke-virtual {v12, v1}, La/fet;->e(I)Z

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-eqz v5, :cond_0

    .line 22
    .line 23
    const/16 v5, 0x20

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/16 v5, 0x10

    .line 27
    .line 28
    :goto_0
    or-int/2addr v2, v5

    .line 29
    invoke-virtual {v12, v3, v4}, La/fet;->f(J)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/16 v10, 0x800

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    .line 37
    move v5, v10

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v5, 0x400

    .line 40
    .line 41
    :goto_1
    or-int/2addr v2, v5

    .line 42
    invoke-virtual {v12, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    const/16 v6, 0x4000

    .line 47
    .line 48
    if-eqz v5, :cond_2

    .line 49
    .line 50
    move v5, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v5, 0x2000

    .line 53
    .line 54
    :goto_2
    or-int/2addr v2, v5

    .line 55
    and-int/lit16 v5, v2, 0x2493

    .line 56
    .line 57
    const/16 v7, 0x2492

    .line 58
    .line 59
    const/4 v15, 0x1

    .line 60
    if-eq v5, v7, :cond_3

    .line 61
    .line 62
    move v5, v15

    .line 63
    goto :goto_3

    .line 64
    :cond_3
    const/4 v5, 0x0

    .line 65
    :goto_3
    and-int/lit8 v7, v2, 0x1

    .line 66
    .line 67
    invoke-virtual {v12, v7, v5}, La/fet;->U(IZ)Z

    .line 68
    .line 69
    .line 70
    move-result v5

    .line 71
    if-eqz v5, :cond_b

    .line 72
    .line 73
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 74
    .line 75
    sget-object v7, La/uc9;->e:La/nw3;

    .line 76
    .line 77
    sget-object v8, La/qmk;->a:La/zcl;

    .line 78
    .line 79
    const/high16 v8, 0x41000000    # 8.0f

    .line 80
    .line 81
    const/high16 v9, 0x40800000    # 4.0f

    .line 82
    .line 83
    sget-object v13, La/jm40;->b:La/jm40;

    .line 84
    .line 85
    invoke-static {v13, v8, v9}, La/s5x0;->K(La/mm40;FF)La/mm40;

    .line 86
    .line 87
    .line 88
    move-result-object v16

    .line 89
    const v8, 0xe000

    .line 90
    .line 91
    .line 92
    and-int/2addr v8, v2

    .line 93
    if-ne v8, v6, :cond_4

    .line 94
    .line 95
    move v6, v15

    .line 96
    goto :goto_4

    .line 97
    :cond_4
    const/4 v6, 0x0

    .line 98
    :goto_4
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v8

    .line 102
    sget-object v14, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-nez v6, :cond_5

    .line 105
    .line 106
    if-ne v8, v14, :cond_6

    .line 107
    .line 108
    :cond_5
    new-instance v8, La/b1i;

    .line 109
    .line 110
    const/16 v6, 0x9

    .line 111
    .line 112
    invoke-direct {v8, v0, v6}, La/b1i;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v12, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    :cond_6
    move-object/from16 v20, v8

    .line 119
    .line 120
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 121
    .line 122
    const/16 v21, 0xf

    .line 123
    .line 124
    const/16 v17, 0x0

    .line 125
    .line 126
    const/16 v18, 0x0

    .line 127
    .line 128
    const/16 v19, 0x0

    .line 129
    .line 130
    invoke-static/range {v16 .. v21}, La/y860;->Y(La/mm40;ZLjava/lang/String;La/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    const/16 v8, 0x36

    .line 135
    .line 136
    invoke-static {v7, v5, v12, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    iget-wide v7, v12, La/fet;->T:J

    .line 141
    .line 142
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 143
    .line 144
    .line 145
    move-result v7

    .line 146
    invoke-virtual {v12}, La/fet;->m()La/bh90;

    .line 147
    .line 148
    .line 149
    move-result-object v8

    .line 150
    invoke-static {v12, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v6

    .line 154
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 155
    .line 156
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v12}, La/fet;->i0()V

    .line 160
    .line 161
    .line 162
    iget-boolean v9, v12, La/fet;->S:Z

    .line 163
    .line 164
    if-eqz v9, :cond_7

    .line 165
    .line 166
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 167
    .line 168
    invoke-virtual {v12, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 169
    .line 170
    .line 171
    goto :goto_5

    .line 172
    :cond_7
    invoke-virtual {v12}, La/fet;->r0()V

    .line 173
    .line 174
    .line 175
    :goto_5
    sget-object v9, La/gqw0;->x:La/shd;

    .line 176
    .line 177
    invoke-static {v12, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 178
    .line 179
    .line 180
    sget-object v5, La/gqw0;->w:La/shd;

    .line 181
    .line 182
    invoke-static {v12, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    sget-object v7, La/gqw0;->y:La/shd;

    .line 190
    .line 191
    invoke-static {v12, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 192
    .line 193
    .line 194
    invoke-static {v12}, La/jpm0;->n(La/fet;)V

    .line 195
    .line 196
    .line 197
    sget-object v5, La/gqw0;->v:La/shd;

    .line 198
    .line 199
    invoke-static {v12, v6, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    const/high16 v5, 0x41400000    # 12.0f

    .line 203
    .line 204
    invoke-static {v13, v5}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 205
    .line 206
    .line 207
    move-result-object v5

    .line 208
    and-int/lit8 v6, v2, 0x70

    .line 209
    .line 210
    const/4 v7, 0x6

    .line 211
    or-int/2addr v6, v7

    .line 212
    invoke-static {v1, v6, v12}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 213
    .line 214
    .line 215
    move-result-object v6

    .line 216
    and-int/lit16 v2, v2, 0x1c00

    .line 217
    .line 218
    or-int/lit8 v8, v2, 0x30

    .line 219
    .line 220
    const/4 v9, 0x0

    .line 221
    const/4 v3, 0x0

    .line 222
    move-object v4, v5

    .line 223
    move v11, v7

    .line 224
    move-object v7, v12

    .line 225
    move v12, v2

    .line 226
    move-object v2, v6

    .line 227
    move-wide/from16 v5, p2

    .line 228
    .line 229
    invoke-static/range {v2 .. v9}, La/dww;->b(La/r2x;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 230
    .line 231
    .line 232
    move-wide v2, v5

    .line 233
    const/16 v20, 0x0

    .line 234
    .line 235
    const/16 v21, 0xe

    .line 236
    .line 237
    const/high16 v17, 0x40800000    # 4.0f

    .line 238
    .line 239
    const/16 v18, 0x0

    .line 240
    .line 241
    const/16 v19, 0x0

    .line 242
    .line 243
    move-object/from16 v16, v13

    .line 244
    .line 245
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 246
    .line 247
    .line 248
    move-result-object v4

    .line 249
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 250
    .line 251
    invoke-virtual {v7, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v5

    .line 255
    check-cast v5, La/g1t0;

    .line 256
    .line 257
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    move-object v5, v4

    .line 261
    invoke-static {}, La/g1t0;->d()La/y9q0;

    .line 262
    .line 263
    .line 264
    move-result-object v4

    .line 265
    if-ne v12, v10, :cond_8

    .line 266
    .line 267
    move/from16 v22, v15

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_8
    const/16 v22, 0x0

    .line 271
    .line 272
    :goto_6
    invoke-virtual {v7}, La/fet;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    if-nez v22, :cond_9

    .line 277
    .line 278
    if-ne v6, v14, :cond_a

    .line 279
    .line 280
    :cond_9
    new-instance v6, La/f15;

    .line 281
    .line 282
    invoke-direct {v6, v11, v2, v3}, La/f15;-><init>(BJ)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v7, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_a
    move-object v10, v6

    .line 289
    check-cast v10, La/n4d;

    .line 290
    .line 291
    const/4 v13, 0x6

    .line 292
    const/16 v14, 0x2f8

    .line 293
    .line 294
    move-object v3, v5

    .line 295
    const/4 v5, 0x0

    .line 296
    const/4 v6, 0x0

    .line 297
    const/4 v7, 0x0

    .line 298
    const/4 v8, 0x0

    .line 299
    const/4 v9, 0x0

    .line 300
    const/4 v11, 0x0

    .line 301
    move-object/from16 v12, p4

    .line 302
    .line 303
    move-object/from16 v2, p6

    .line 304
    .line 305
    invoke-static/range {v2 .. v14}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 306
    .line 307
    .line 308
    invoke-virtual {v12, v15}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    move-object/from16 v5, v16

    .line 312
    .line 313
    goto :goto_7

    .line 314
    :cond_b
    invoke-virtual {v12}, La/fet;->X()V

    .line 315
    .line 316
    .line 317
    move-object/from16 v5, p5

    .line 318
    .line 319
    :goto_7
    invoke-virtual {v12}, La/fet;->u()La/yfe0;

    .line 320
    .line 321
    .line 322
    move-result-object v8

    .line 323
    if-eqz v8, :cond_c

    .line 324
    .line 325
    new-instance v0, La/cg;

    .line 326
    .line 327
    move/from16 v2, p1

    .line 328
    .line 329
    move-wide/from16 v3, p2

    .line 330
    .line 331
    move-object/from16 v6, p6

    .line 332
    .line 333
    move-object/from16 v7, p7

    .line 334
    .line 335
    invoke-direct/range {v0 .. v7}, La/cg;-><init>(IIJLa/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 336
    .line 337
    .line 338
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 339
    .line 340
    :cond_c
    return-void
.end method

.method public static final c(Ljava/lang/String;La/fet;I)V
    .locals 14

    .line 1
    move/from16 v13, p2

    .line 2
    .line 3
    const v1, -0x7b639f93

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v1}, La/fet;->g0(I)La/fet;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x2

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    const/4 v1, 0x4

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move v1, v2

    .line 19
    :goto_0
    or-int/2addr v1, v13

    .line 20
    and-int/lit8 v3, v1, 0x3

    .line 21
    .line 22
    const/4 v4, 0x1

    .line 23
    if-eq v3, v2, :cond_1

    .line 24
    .line 25
    move v2, v4

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    const/4 v2, 0x0

    .line 28
    :goto_1
    and-int/lit8 v3, v1, 0x1

    .line 29
    .line 30
    invoke-virtual {p1, v3, v2}, La/fet;->U(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 37
    .line 38
    invoke-virtual {p1, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 43
    .line 44
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 45
    .line 46
    .line 47
    move-result-wide v2

    .line 48
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 49
    .line 50
    invoke-virtual {p1, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    check-cast v5, La/g1t0;

    .line 55
    .line 56
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-static {}, La/g1t0;->l()La/y9q0;

    .line 60
    .line 61
    .line 62
    move-result-object v5

    .line 63
    invoke-virtual {p1, v2, v3}, La/fet;->f(J)Z

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-virtual {p1}, La/fet;->P()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    if-nez v6, :cond_2

    .line 72
    .line 73
    sget-object v6, La/ukd;->a:La/cl5;

    .line 74
    .line 75
    if-ne v7, v6, :cond_3

    .line 76
    .line 77
    :cond_2
    new-instance v7, La/f15;

    .line 78
    .line 79
    const/4 v6, 0x7

    .line 80
    invoke-direct {v7, v6, v2, v3}, La/f15;-><init>(BJ)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_3
    move-object v8, v7

    .line 87
    check-cast v8, La/n4d;

    .line 88
    .line 89
    sget-object v2, La/jm40;->b:La/jm40;

    .line 90
    .line 91
    const/high16 v3, 0x3f800000    # 1.0f

    .line 92
    .line 93
    invoke-static {v2, v3}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    sget-object v3, La/qmk;->a:La/zcl;

    .line 98
    .line 99
    const/high16 v3, 0x40000000    # 2.0f

    .line 100
    .line 101
    const/4 v6, 0x0

    .line 102
    invoke-static {v2, v6, v3, v4}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    and-int/lit8 v11, v1, 0xe

    .line 107
    .line 108
    const/16 v12, 0x2f8

    .line 109
    .line 110
    const/4 v3, 0x0

    .line 111
    const/4 v4, 0x0

    .line 112
    move-object v1, v2

    .line 113
    move-object v2, v5

    .line 114
    const/4 v5, 0x0

    .line 115
    const/4 v6, 0x0

    .line 116
    const/4 v7, 0x0

    .line 117
    const/4 v9, 0x0

    .line 118
    move-object v0, p0

    .line 119
    move-object v10, p1

    .line 120
    invoke-static/range {v0 .. v12}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_4
    invoke-virtual {p1}, La/fet;->X()V

    .line 125
    .line 126
    .line 127
    :goto_2
    invoke-virtual {p1}, La/fet;->u()La/yfe0;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    if-eqz v1, :cond_5

    .line 132
    .line 133
    new-instance v2, La/g0;

    .line 134
    .line 135
    const/16 v3, 0x1c

    .line 136
    .line 137
    invoke-direct {v2, v3, v13, p0}, La/g0;-><init>(BILjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iput-object v2, v1, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 141
    .line 142
    :cond_5
    return-void
.end method

.method public static final d(JJ)F
    .locals 4

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p2, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    shr-long v2, p0, v0

    .line 11
    .line 12
    long-to-int v0, v2

    .line 13
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    sub-float/2addr v1, v0

    .line 18
    const-wide v2, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long/2addr p2, v2

    .line 24
    long-to-int p2, p2

    .line 25
    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 26
    .line 27
    .line 28
    move-result p2

    .line 29
    and-long/2addr p0, v2

    .line 30
    long-to-int p0, p0

    .line 31
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    sub-float/2addr p2, p0

    .line 36
    mul-float/2addr v1, v1

    .line 37
    mul-float/2addr p2, p2

    .line 38
    add-float/2addr p2, v1

    .line 39
    float-to-double p0, p2

    .line 40
    invoke-static {p0, p1}, Ljava/lang/Math;->sqrt(D)D

    .line 41
    .line 42
    .line 43
    move-result-wide p0

    .line 44
    double-to-float p0, p0

    .line 45
    return p0
.end method

.method public static final e(JJ)J
    .locals 5

    .line 1
    const/16 v0, 0x20

    .line 2
    .line 3
    shr-long v1, p0, v0

    .line 4
    .line 5
    long-to-int v1, v1

    .line 6
    shr-long/2addr p2, v0

    .line 7
    long-to-int p2, p2

    .line 8
    sub-int/2addr v1, p2

    .line 9
    div-int/lit8 v1, v1, 0x2

    .line 10
    .line 11
    int-to-float p2, v1

    .line 12
    const-wide v1, 0xffffffffL

    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    and-long/2addr p0, v1

    .line 18
    long-to-int p0, p0

    .line 19
    int-to-float p0, p0

    .line 20
    const p1, 0x3ecccccd    # 0.4f

    .line 21
    .line 22
    .line 23
    mul-float/2addr p0, p1

    .line 24
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    int-to-long p1, p1

    .line 29
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    int-to-long v3, p0

    .line 34
    shl-long p0, p1, v0

    .line 35
    .line 36
    and-long p2, v3, v1

    .line 37
    .line 38
    or-long/2addr p0, p2

    .line 39
    return-wide p0
.end method
