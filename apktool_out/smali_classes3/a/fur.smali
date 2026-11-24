.class public abstract La/fur;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zai0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/zai0;

    .line 2
    .line 3
    const-string v1, "TrackStateKey"

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/zai0;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/fur;->a:La/zai0;

    .line 9
    .line 10
    return-void
.end method

.method public static final a(La/mm40;La/c0s;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v3, p0

    .line 2
    .line 3
    move-object/from16 v4, p1

    .line 4
    .line 5
    move-object/from16 v10, p4

    .line 6
    .line 7
    move/from16 v2, p5

    .line 8
    .line 9
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v0, -0xf1f096e

    .line 16
    .line 17
    .line 18
    invoke-virtual {v10, v0}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v0, v2, 0x6

    .line 22
    .line 23
    const/4 v1, 0x2

    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {v10, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    const/4 v0, 0x4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v0, v1

    .line 35
    :goto_0
    or-int/2addr v0, v2

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move v0, v2

    .line 38
    :goto_1
    and-int/lit8 v5, v2, 0x30

    .line 39
    .line 40
    if-nez v5, :cond_3

    .line 41
    .line 42
    invoke-virtual {v10, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-eqz v5, :cond_2

    .line 47
    .line 48
    const/16 v5, 0x20

    .line 49
    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v0, v5

    .line 54
    :cond_3
    and-int/lit16 v5, v2, 0x180

    .line 55
    .line 56
    move-object/from16 v12, p2

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-virtual {v10, v12}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    const/16 v5, 0x100

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_4
    const/16 v5, 0x80

    .line 70
    .line 71
    :goto_3
    or-int/2addr v0, v5

    .line 72
    :cond_5
    and-int/lit16 v5, v2, 0xc00

    .line 73
    .line 74
    move-object/from16 v6, p3

    .line 75
    .line 76
    if-nez v5, :cond_7

    .line 77
    .line 78
    invoke-virtual {v10, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_6

    .line 83
    .line 84
    const/16 v5, 0x800

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :cond_6
    const/16 v5, 0x400

    .line 88
    .line 89
    :goto_4
    or-int/2addr v0, v5

    .line 90
    :cond_7
    and-int/lit16 v5, v0, 0x493

    .line 91
    .line 92
    const/16 v7, 0x492

    .line 93
    .line 94
    const/4 v8, 0x0

    .line 95
    const/4 v13, 0x1

    .line 96
    if-eq v5, v7, :cond_8

    .line 97
    .line 98
    move v5, v13

    .line 99
    goto :goto_5

    .line 100
    :cond_8
    move v5, v8

    .line 101
    :goto_5
    and-int/lit8 v7, v0, 0x1

    .line 102
    .line 103
    invoke-virtual {v10, v7, v5}, La/fet;->U(IZ)Z

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    if-eqz v5, :cond_10

    .line 108
    .line 109
    iget-object v5, v4, La/c0s;->d:La/wbs0;

    .line 110
    .line 111
    sget-object v7, La/wbs0;->d:La/wbs0;

    .line 112
    .line 113
    if-eq v5, v7, :cond_9

    .line 114
    .line 115
    move v8, v13

    .line 116
    :cond_9
    sget-object v5, La/qmk;->a:La/zcl;

    .line 117
    .line 118
    const/high16 v5, 0x42300000    # 44.0f

    .line 119
    .line 120
    const/4 v7, 0x0

    .line 121
    invoke-static {v3, v5, v7, v1}, La/o7k0;->g(La/mm40;FFI)La/mm40;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 126
    .line 127
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 128
    .line 129
    .line 130
    move-result-wide v14

    .line 131
    sget-object v5, La/qmk;->g:La/zcl;

    .line 132
    .line 133
    sget-object v7, La/vgg0;->a:La/ugg0;

    .line 134
    .line 135
    new-instance v7, La/ugg0;

    .line 136
    .line 137
    invoke-direct {v7, v5, v5, v5, v5}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 138
    .line 139
    .line 140
    invoke-static {v1, v14, v15, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    if-eqz v8, :cond_a

    .line 145
    .line 146
    const/high16 v5, 0x40800000    # 4.0f

    .line 147
    .line 148
    goto :goto_6

    .line 149
    :cond_a
    const/high16 v5, 0x41200000    # 10.0f

    .line 150
    .line 151
    :goto_6
    const/high16 v7, 0x41000000    # 8.0f

    .line 152
    .line 153
    const/high16 v8, 0x40c00000    # 6.0f

    .line 154
    .line 155
    invoke-static {v1, v7, v8, v5, v8}, La/s5x0;->M(La/mm40;FFFF)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    sget-object v5, La/gqw0;->k:La/yx7;

    .line 160
    .line 161
    sget-object v7, La/uc9;->a:La/lw3;

    .line 162
    .line 163
    const/16 v8, 0x30

    .line 164
    .line 165
    invoke-static {v7, v5, v10, v8}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 166
    .line 167
    .line 168
    move-result-object v5

    .line 169
    iget-wide v7, v10, La/fet;->T:J

    .line 170
    .line 171
    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 176
    .line 177
    .line 178
    move-result-object v8

    .line 179
    invoke-static {v10, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    sget-object v9, La/mkd;->c0:La/gqw0;

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v10}, La/fet;->i0()V

    .line 189
    .line 190
    .line 191
    iget-boolean v9, v10, La/fet;->S:Z

    .line 192
    .line 193
    if-eqz v9, :cond_b

    .line 194
    .line 195
    sget-object v9, La/e7z;->u1:La/pcy;

    .line 196
    .line 197
    invoke-virtual {v10, v9}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 198
    .line 199
    .line 200
    goto :goto_7

    .line 201
    :cond_b
    invoke-virtual {v10}, La/fet;->r0()V

    .line 202
    .line 203
    .line 204
    :goto_7
    sget-object v9, La/gqw0;->x:La/shd;

    .line 205
    .line 206
    invoke-static {v10, v5, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 207
    .line 208
    .line 209
    sget-object v5, La/gqw0;->w:La/shd;

    .line 210
    .line 211
    invoke-static {v10, v8, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 212
    .line 213
    .line 214
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 215
    .line 216
    .line 217
    move-result-object v5

    .line 218
    sget-object v7, La/gqw0;->y:La/shd;

    .line 219
    .line 220
    invoke-static {v10, v5, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 221
    .line 222
    .line 223
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 224
    .line 225
    .line 226
    sget-object v5, La/gqw0;->v:La/shd;

    .line 227
    .line 228
    invoke-static {v10, v1, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 229
    .line 230
    .line 231
    const/high16 v1, 0x3f000000    # 0.5f

    .line 232
    .line 233
    float-to-double v7, v1

    .line 234
    const-wide/16 v14, 0x0

    .line 235
    .line 236
    cmpl-double v5, v7, v14

    .line 237
    .line 238
    const-string v16, "invalid weight; must be greater than zero"

    .line 239
    .line 240
    if-lez v5, :cond_c

    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_c
    invoke-static/range {v16 .. v16}, La/vcx;->a(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    :goto_8
    new-instance v5, La/x7z;

    .line 247
    .line 248
    const v17, 0x7f7fffff    # Float.MAX_VALUE

    .line 249
    .line 250
    .line 251
    cmpl-float v7, v1, v17

    .line 252
    .line 253
    if-lez v7, :cond_d

    .line 254
    .line 255
    move/from16 v7, v17

    .line 256
    .line 257
    goto :goto_9

    .line 258
    :cond_d
    move v7, v1

    .line 259
    :goto_9
    invoke-direct {v5, v7, v13}, La/x7z;-><init>(FZ)V

    .line 260
    .line 261
    .line 262
    iget-object v6, v4, La/c0s;->a:La/hy20;

    .line 263
    .line 264
    iget-object v7, v4, La/c0s;->b:La/s5n0;

    .line 265
    .line 266
    iget-object v8, v4, La/c0s;->e:La/kho;

    .line 267
    .line 268
    shl-int/lit8 v0, v0, 0x3

    .line 269
    .line 270
    const v9, 0xe000

    .line 271
    .line 272
    .line 273
    and-int v11, v0, v9

    .line 274
    .line 275
    move-object/from16 v9, p3

    .line 276
    .line 277
    invoke-static/range {v5 .. v11}, La/fur;->b(La/mm40;La/hy20;La/s5n0;La/kho;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 278
    .line 279
    .line 280
    float-to-double v5, v1

    .line 281
    cmpl-double v5, v5, v14

    .line 282
    .line 283
    if-lez v5, :cond_e

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_e
    invoke-static/range {v16 .. v16}, La/vcx;->a(Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    :goto_a
    new-instance v5, La/x7z;

    .line 290
    .line 291
    cmpl-float v6, v1, v17

    .line 292
    .line 293
    if-lez v6, :cond_f

    .line 294
    .line 295
    move/from16 v1, v17

    .line 296
    .line 297
    :cond_f
    invoke-direct {v5, v1, v13}, La/x7z;-><init>(FZ)V

    .line 298
    .line 299
    .line 300
    iget-object v6, v4, La/c0s;->c:La/j43;

    .line 301
    .line 302
    iget-object v7, v4, La/c0s;->d:La/wbs0;

    .line 303
    .line 304
    and-int/lit16 v10, v0, 0x1c00

    .line 305
    .line 306
    move-object/from16 v9, p4

    .line 307
    .line 308
    move-object v8, v12

    .line 309
    invoke-static/range {v5 .. v10}, La/fur;->c(La/mm40;La/j43;La/wbs0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 310
    .line 311
    .line 312
    move-object v10, v9

    .line 313
    invoke-virtual {v10, v13}, La/fet;->r(Z)V

    .line 314
    .line 315
    .line 316
    goto :goto_b

    .line 317
    :cond_10
    invoke-virtual {v10}, La/fet;->X()V

    .line 318
    .line 319
    .line 320
    :goto_b
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 321
    .line 322
    .line 323
    move-result-object v7

    .line 324
    if-eqz v7, :cond_11

    .line 325
    .line 326
    new-instance v0, La/vho;

    .line 327
    .line 328
    const/4 v1, 0x5

    .line 329
    move-object/from16 v5, p2

    .line 330
    .line 331
    move-object/from16 v6, p3

    .line 332
    .line 333
    invoke-direct/range {v0 .. v6}, La/vho;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 337
    .line 338
    :cond_11
    return-void
.end method

.method public static final b(La/mm40;La/hy20;La/s5n0;La/kho;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v4, p3

    .line 8
    .line 9
    move-object/from16 v5, p4

    .line 10
    .line 11
    move-object/from16 v0, p5

    .line 12
    .line 13
    move/from16 v6, p6

    .line 14
    .line 15
    const v7, -0x29acbf44

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v7}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    and-int/lit8 v7, v6, 0x6

    .line 22
    .line 23
    if-nez v7, :cond_1

    .line 24
    .line 25
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v7

    .line 29
    if-eqz v7, :cond_0

    .line 30
    .line 31
    const/4 v7, 0x4

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    const/4 v7, 0x2

    .line 34
    :goto_0
    or-int/2addr v7, v6

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move v7, v6

    .line 37
    :goto_1
    and-int/lit8 v8, v6, 0x30

    .line 38
    .line 39
    if-nez v8, :cond_3

    .line 40
    .line 41
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v8

    .line 45
    if-eqz v8, :cond_2

    .line 46
    .line 47
    const/16 v8, 0x20

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    const/16 v8, 0x10

    .line 51
    .line 52
    :goto_2
    or-int/2addr v7, v8

    .line 53
    :cond_3
    and-int/lit16 v8, v6, 0x180

    .line 54
    .line 55
    if-nez v8, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_4

    .line 62
    .line 63
    const/16 v8, 0x100

    .line 64
    .line 65
    goto :goto_3

    .line 66
    :cond_4
    const/16 v8, 0x80

    .line 67
    .line 68
    :goto_3
    or-int/2addr v7, v8

    .line 69
    :cond_5
    and-int/lit16 v8, v6, 0xc00

    .line 70
    .line 71
    if-nez v8, :cond_7

    .line 72
    .line 73
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v8

    .line 77
    if-eqz v8, :cond_6

    .line 78
    .line 79
    const/16 v8, 0x800

    .line 80
    .line 81
    goto :goto_4

    .line 82
    :cond_6
    const/16 v8, 0x400

    .line 83
    .line 84
    :goto_4
    or-int/2addr v7, v8

    .line 85
    :cond_7
    and-int/lit16 v8, v6, 0x6000

    .line 86
    .line 87
    if-nez v8, :cond_9

    .line 88
    .line 89
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    if-eqz v8, :cond_8

    .line 94
    .line 95
    const/16 v8, 0x4000

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    const/16 v8, 0x2000

    .line 99
    .line 100
    :goto_5
    or-int/2addr v7, v8

    .line 101
    :cond_9
    and-int/lit16 v8, v7, 0x2493

    .line 102
    .line 103
    const/16 v9, 0x2492

    .line 104
    .line 105
    const/4 v10, 0x0

    .line 106
    const/4 v11, 0x1

    .line 107
    if-eq v8, v9, :cond_a

    .line 108
    .line 109
    move v8, v11

    .line 110
    goto :goto_6

    .line 111
    :cond_a
    move v8, v10

    .line 112
    :goto_6
    and-int/lit8 v9, v7, 0x1

    .line 113
    .line 114
    invoke-virtual {v0, v9, v8}, La/fet;->U(IZ)Z

    .line 115
    .line 116
    .line 117
    move-result v8

    .line 118
    if-eqz v8, :cond_e

    .line 119
    .line 120
    sget-object v8, La/uc9;->c:La/mw3;

    .line 121
    .line 122
    sget-object v9, La/gqw0;->m:La/xx7;

    .line 123
    .line 124
    invoke-static {v8, v9, v0, v10}, La/w5d;->a(La/sw3;La/xx7;La/fet;I)La/x5d;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    iget-wide v12, v0, La/fet;->T:J

    .line 129
    .line 130
    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    .line 131
    .line 132
    .line 133
    move-result v9

    .line 134
    invoke-virtual {v0}, La/fet;->m()La/bh90;

    .line 135
    .line 136
    .line 137
    move-result-object v12

    .line 138
    invoke-static {v0, v1}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 139
    .line 140
    .line 141
    move-result-object v13

    .line 142
    sget-object v14, La/mkd;->c0:La/gqw0;

    .line 143
    .line 144
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, La/fet;->i0()V

    .line 148
    .line 149
    .line 150
    iget-boolean v14, v0, La/fet;->S:Z

    .line 151
    .line 152
    if-eqz v14, :cond_b

    .line 153
    .line 154
    sget-object v14, La/e7z;->u1:La/pcy;

    .line 155
    .line 156
    invoke-virtual {v0, v14}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 157
    .line 158
    .line 159
    goto :goto_7

    .line 160
    :cond_b
    invoke-virtual {v0}, La/fet;->r0()V

    .line 161
    .line 162
    .line 163
    :goto_7
    sget-object v14, La/gqw0;->x:La/shd;

    .line 164
    .line 165
    invoke-static {v0, v8, v14}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 166
    .line 167
    .line 168
    sget-object v8, La/gqw0;->w:La/shd;

    .line 169
    .line 170
    invoke-static {v0, v12, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 171
    .line 172
    .line 173
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    sget-object v9, La/gqw0;->y:La/shd;

    .line 178
    .line 179
    invoke-static {v0, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, La/jpm0;->n(La/fet;)V

    .line 183
    .line 184
    .line 185
    sget-object v8, La/gqw0;->v:La/shd;

    .line 186
    .line 187
    invoke-static {v0, v13, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 188
    .line 189
    .line 190
    instance-of v8, v4, La/jho;

    .line 191
    .line 192
    if-eqz v8, :cond_c

    .line 193
    .line 194
    const v8, -0x3111ce36

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0, v8}, La/fet;->e0(I)V

    .line 198
    .line 199
    .line 200
    move-object v8, v4

    .line 201
    check-cast v8, La/jho;

    .line 202
    .line 203
    iget-object v8, v8, La/jho;->a:Ljava/lang/String;

    .line 204
    .line 205
    shr-int/lit8 v9, v7, 0x6

    .line 206
    .line 207
    and-int/lit16 v9, v9, 0x380

    .line 208
    .line 209
    const/4 v12, 0x0

    .line 210
    invoke-static {v12, v8, v5, v0, v9}, La/zdx;->h(La/mm40;Ljava/lang/String;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 214
    .line 215
    .line 216
    goto :goto_8

    .line 217
    :cond_c
    const v8, -0x310f3204

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v8}, La/fet;->e0(I)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 224
    .line 225
    .line 226
    :goto_8
    const/high16 v8, 0x3f800000    # 1.0f

    .line 227
    .line 228
    sget-object v12, La/jm40;->b:La/jm40;

    .line 229
    .line 230
    invoke-static {v12, v8}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object v8

    .line 234
    iget-object v9, v2, La/hy20;->a:Ljava/lang/String;

    .line 235
    .line 236
    const/4 v13, 0x6

    .line 237
    invoke-static {v13, v0, v8, v9}, La/u7x;->e(ILa/fet;La/mm40;Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    sget-object v8, La/qmk;->a:La/zcl;

    .line 241
    .line 242
    const/16 v16, 0x0

    .line 243
    .line 244
    const/16 v17, 0xd

    .line 245
    .line 246
    const/4 v13, 0x0

    .line 247
    const/high16 v14, 0x40000000    # 2.0f

    .line 248
    .line 249
    const/4 v15, 0x0

    .line 250
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v8

    .line 254
    shr-int/lit8 v7, v7, 0x3

    .line 255
    .line 256
    and-int/lit8 v7, v7, 0x70

    .line 257
    .line 258
    invoke-static {v8, v3, v0, v7}, La/fur;->d(La/mm40;La/s5n0;La/fet;I)V

    .line 259
    .line 260
    .line 261
    instance-of v7, v4, La/hho;

    .line 262
    .line 263
    if-eqz v7, :cond_d

    .line 264
    .line 265
    const v7, -0x310956a2

    .line 266
    .line 267
    .line 268
    invoke-virtual {v0, v7}, La/fet;->e0(I)V

    .line 269
    .line 270
    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    const/16 v17, 0xd

    .line 274
    .line 275
    const/4 v13, 0x0

    .line 276
    const/high16 v14, 0x40000000    # 2.0f

    .line 277
    .line 278
    const/4 v15, 0x0

    .line 279
    invoke-static/range {v12 .. v17}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 280
    .line 281
    .line 282
    move-result-object v7

    .line 283
    move-object v8, v4

    .line 284
    check-cast v8, La/hho;

    .line 285
    .line 286
    iget-object v8, v8, La/hho;->a:Ljava/lang/String;

    .line 287
    .line 288
    sget-object v9, La/b15;->a:La/b15;

    .line 289
    .line 290
    const/16 v12, 0x180

    .line 291
    .line 292
    invoke-static {v7, v8, v9, v0, v12}, La/jd8;->g(La/mm40;Ljava/lang/String;La/b15;La/fet;I)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 296
    .line 297
    .line 298
    goto :goto_9

    .line 299
    :cond_d
    const v7, -0x31059d24

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v7}, La/fet;->e0(I)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v10}, La/fet;->r(Z)V

    .line 306
    .line 307
    .line 308
    :goto_9
    invoke-virtual {v0, v11}, La/fet;->r(Z)V

    .line 309
    .line 310
    .line 311
    goto :goto_a

    .line 312
    :cond_e
    invoke-virtual {v0}, La/fet;->X()V

    .line 313
    .line 314
    .line 315
    :goto_a
    invoke-virtual {v0}, La/fet;->u()La/yfe0;

    .line 316
    .line 317
    .line 318
    move-result-object v8

    .line 319
    if-eqz v8, :cond_f

    .line 320
    .line 321
    new-instance v0, La/wjp;

    .line 322
    .line 323
    const/4 v7, 0x2

    .line 324
    invoke-direct/range {v0 .. v7}, La/wjp;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/wdr;IB)V

    .line 325
    .line 326
    .line 327
    iput-object v0, v8, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 328
    .line 329
    :cond_f
    return-void
.end method

.method public static final c(La/mm40;La/j43;La/wbs0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 8

    .line 1
    const v0, -0x393365b9

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p5, 0x6

    .line 8
    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p4, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x2

    .line 20
    :goto_0
    or-int/2addr v0, p5

    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move v0, p5

    .line 23
    :goto_1
    and-int/lit8 v1, p5, 0x30

    .line 24
    .line 25
    if-nez v1, :cond_3

    .line 26
    .line 27
    invoke-virtual {p4, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_2
    const/16 v1, 0x10

    .line 37
    .line 38
    :goto_2
    or-int/2addr v0, v1

    .line 39
    :cond_3
    and-int/lit16 v1, p5, 0x180

    .line 40
    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    invoke-virtual {p4, v1}, La/fet;->e(I)Z

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    const/16 v1, 0x100

    .line 54
    .line 55
    goto :goto_3

    .line 56
    :cond_4
    const/16 v1, 0x80

    .line 57
    .line 58
    :goto_3
    or-int/2addr v0, v1

    .line 59
    :cond_5
    and-int/lit16 v1, p5, 0xc00

    .line 60
    .line 61
    if-nez v1, :cond_7

    .line 62
    .line 63
    invoke-virtual {p4, p3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    if-eqz v1, :cond_6

    .line 68
    .line 69
    const/16 v1, 0x800

    .line 70
    .line 71
    goto :goto_4

    .line 72
    :cond_6
    const/16 v1, 0x400

    .line 73
    .line 74
    :goto_4
    or-int/2addr v0, v1

    .line 75
    :cond_7
    and-int/lit16 v1, v0, 0x493

    .line 76
    .line 77
    const/16 v2, 0x492

    .line 78
    .line 79
    const/4 v3, 0x0

    .line 80
    const/4 v4, 0x1

    .line 81
    if-eq v1, v2, :cond_8

    .line 82
    .line 83
    move v1, v4

    .line 84
    goto :goto_5

    .line 85
    :cond_8
    move v1, v3

    .line 86
    :goto_5
    and-int/lit8 v2, v0, 0x1

    .line 87
    .line 88
    invoke-virtual {p4, v2, v1}, La/fet;->U(IZ)Z

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-eqz v1, :cond_b

    .line 93
    .line 94
    sget-object v1, La/gqw0;->k:La/yx7;

    .line 95
    .line 96
    sget-object v2, La/uc9;->a:La/lw3;

    .line 97
    .line 98
    const/16 v5, 0x30

    .line 99
    .line 100
    invoke-static {v2, v1, p4, v5}, La/shg0;->a(La/ow3;La/yx7;La/fet;I)La/thg0;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    iget-wide v5, p4, La/fet;->T:J

    .line 105
    .line 106
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    invoke-virtual {p4}, La/fet;->m()La/bh90;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    invoke-static {p4, p0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 119
    .line 120
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    invoke-virtual {p4}, La/fet;->i0()V

    .line 124
    .line 125
    .line 126
    iget-boolean v7, p4, La/fet;->S:Z

    .line 127
    .line 128
    if-eqz v7, :cond_9

    .line 129
    .line 130
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 131
    .line 132
    invoke-virtual {p4, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 133
    .line 134
    .line 135
    goto :goto_6

    .line 136
    :cond_9
    invoke-virtual {p4}, La/fet;->r0()V

    .line 137
    .line 138
    .line 139
    :goto_6
    sget-object v7, La/gqw0;->x:La/shd;

    .line 140
    .line 141
    invoke-static {p4, v1, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 142
    .line 143
    .line 144
    sget-object v1, La/gqw0;->w:La/shd;

    .line 145
    .line 146
    invoke-static {p4, v5, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 147
    .line 148
    .line 149
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    sget-object v2, La/gqw0;->y:La/shd;

    .line 154
    .line 155
    invoke-static {p4, v1, v2}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p4}, La/jpm0;->n(La/fet;)V

    .line 159
    .line 160
    .line 161
    sget-object v1, La/gqw0;->v:La/shd;

    .line 162
    .line 163
    invoke-static {p4, v6, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 164
    .line 165
    .line 166
    new-instance v1, La/x7z;

    .line 167
    .line 168
    const/high16 v2, 0x3f800000    # 1.0f

    .line 169
    .line 170
    invoke-direct {v1, v2, v4}, La/x7z;-><init>(FZ)V

    .line 171
    .line 172
    .line 173
    new-instance v2, La/cy6;

    .line 174
    .line 175
    const/16 v5, 0x3ff

    .line 176
    .line 177
    const/4 v6, 0x0

    .line 178
    invoke-direct {v2, v6, v5}, La/cy6;-><init>(La/y9q0;I)V

    .line 179
    .line 180
    .line 181
    and-int/lit8 v5, v0, 0x70

    .line 182
    .line 183
    invoke-static {v1, p1, v2, p4, v5}, La/i4w0;->g(La/mm40;La/j43;La/dy6;La/fet;I)V

    .line 184
    .line 185
    .line 186
    sget-object v1, La/wbs0;->d:La/wbs0;

    .line 187
    .line 188
    if-eq p2, v1, :cond_a

    .line 189
    .line 190
    const v1, -0xa0b6d1e

    .line 191
    .line 192
    .line 193
    invoke-virtual {p4, v1}, La/fet;->e0(I)V

    .line 194
    .line 195
    .line 196
    sget-object v1, La/jm40;->b:La/jm40;

    .line 197
    .line 198
    const/4 v2, 0x3

    .line 199
    invoke-static {v1, v6, v2}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    shr-int/2addr v0, v2

    .line 204
    and-int/lit8 v2, v0, 0x70

    .line 205
    .line 206
    or-int/lit8 v2, v2, 0x6

    .line 207
    .line 208
    and-int/lit16 v0, v0, 0x380

    .line 209
    .line 210
    or-int/2addr v0, v2

    .line 211
    invoke-static {v1, p2, p3, p4, v0}, La/fur;->e(La/mm40;La/wbs0;Lkotlin/jvm/functions/Function0;La/fet;I)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {p4, v3}, La/fet;->r(Z)V

    .line 215
    .line 216
    .line 217
    goto :goto_7

    .line 218
    :cond_a
    const v0, -0xa084d89

    .line 219
    .line 220
    .line 221
    invoke-virtual {p4, v0}, La/fet;->e0(I)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p4, v3}, La/fet;->r(Z)V

    .line 225
    .line 226
    .line 227
    :goto_7
    invoke-virtual {p4, v4}, La/fet;->r(Z)V

    .line 228
    .line 229
    .line 230
    goto :goto_8

    .line 231
    :cond_b
    invoke-virtual {p4}, La/fet;->X()V

    .line 232
    .line 233
    .line 234
    :goto_8
    invoke-virtual {p4}, La/fet;->u()La/yfe0;

    .line 235
    .line 236
    .line 237
    move-result-object p4

    .line 238
    if-eqz p4, :cond_c

    .line 239
    .line 240
    new-instance v0, La/vho;

    .line 241
    .line 242
    const/4 v1, 0x6

    .line 243
    move-object v3, p0

    .line 244
    move-object v4, p1

    .line 245
    move-object v5, p2

    .line 246
    move-object v6, p3

    .line 247
    move v2, p5

    .line 248
    invoke-direct/range {v0 .. v6}, La/vho;-><init>(BILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    .line 250
    .line 251
    iput-object v0, p4, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 252
    .line 253
    :cond_c
    return-void
.end method

.method public static final d(La/mm40;La/s5n0;La/fet;I)V
    .locals 49

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v13, p1

    .line 4
    .line 5
    move-object/from16 v10, p2

    .line 6
    .line 7
    move/from16 v14, p3

    .line 8
    .line 9
    const v0, -0x7493a614

    .line 10
    .line 11
    .line 12
    invoke-virtual {v10, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    and-int/lit8 v0, v14, 0x6

    .line 16
    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v10, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 v0, 0x4

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x2

    .line 28
    :goto_0
    or-int/2addr v0, v14

    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move v0, v14

    .line 31
    :goto_1
    and-int/lit8 v2, v14, 0x30

    .line 32
    .line 33
    if-nez v2, :cond_3

    .line 34
    .line 35
    invoke-virtual {v10, v13}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    const/16 v2, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v2, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v0, v2

    .line 47
    :cond_3
    and-int/lit8 v2, v0, 0x13

    .line 48
    .line 49
    const/16 v3, 0x12

    .line 50
    .line 51
    const/4 v15, 0x0

    .line 52
    const/4 v4, 0x1

    .line 53
    if-eq v2, v3, :cond_4

    .line 54
    .line 55
    move v2, v4

    .line 56
    goto :goto_3

    .line 57
    :cond_4
    move v2, v15

    .line 58
    :goto_3
    and-int/lit8 v3, v0, 0x1

    .line 59
    .line 60
    invoke-virtual {v10, v3, v2}, La/fet;->U(IZ)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_8

    .line 65
    .line 66
    instance-of v2, v13, La/r5n0;

    .line 67
    .line 68
    if-eqz v2, :cond_5

    .line 69
    .line 70
    const v2, -0x2a090e70

    .line 71
    .line 72
    .line 73
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 74
    .line 75
    .line 76
    invoke-static/range {p1 .. p2}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    and-int/lit8 v0, v0, 0xe

    .line 81
    .line 82
    invoke-static {v1, v2, v10, v0}, La/j5n0;->h(La/mm40;La/pz40;La/fet;I)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 86
    .line 87
    .line 88
    goto/16 :goto_4

    .line 89
    .line 90
    :cond_5
    instance-of v2, v13, La/q5n0;

    .line 91
    .line 92
    if-eqz v2, :cond_6

    .line 93
    .line 94
    const v2, -0x2a04370b

    .line 95
    .line 96
    .line 97
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 98
    .line 99
    .line 100
    move-object v2, v13

    .line 101
    check-cast v2, La/q5n0;

    .line 102
    .line 103
    iget-object v2, v2, La/q5n0;->a:Ljava/lang/String;

    .line 104
    .line 105
    sget-object v22, La/j1t0;->c:La/qrq;

    .line 106
    .line 107
    sget-wide v19, La/qmk;->q:J

    .line 108
    .line 109
    sget-wide v28, La/qmk;->D:J

    .line 110
    .line 111
    new-instance v30, La/y9q0;

    .line 112
    .line 113
    const/16 v27, 0x0

    .line 114
    .line 115
    move-object/from16 v16, v30

    .line 116
    .line 117
    const v30, 0xfdffdd

    .line 118
    .line 119
    .line 120
    const-wide/16 v17, 0x0

    .line 121
    .line 122
    const/16 v21, 0x0

    .line 123
    .line 124
    const-wide/16 v23, 0x0

    .line 125
    .line 126
    const/16 v25, 0x0

    .line 127
    .line 128
    const/16 v26, 0x0

    .line 129
    .line 130
    invoke-direct/range {v16 .. v30}, La/y9q0;-><init>(JJLa/psq;La/nrq;JLa/ljj0;IIJI)V

    .line 131
    .line 132
    .line 133
    sget-object v3, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 134
    .line 135
    invoke-virtual {v3}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite80-0d7_KjU()J

    .line 136
    .line 137
    .line 138
    move-result-wide v31

    .line 139
    const/16 v47, 0x0

    .line 140
    .line 141
    const v48, 0xfffffe

    .line 142
    .line 143
    .line 144
    const-wide/16 v33, 0x0

    .line 145
    .line 146
    const/16 v35, 0x0

    .line 147
    .line 148
    const/16 v36, 0x0

    .line 149
    .line 150
    const/16 v37, 0x0

    .line 151
    .line 152
    const-wide/16 v38, 0x0

    .line 153
    .line 154
    const/16 v40, 0x0

    .line 155
    .line 156
    const/16 v41, 0x0

    .line 157
    .line 158
    const/16 v42, 0x0

    .line 159
    .line 160
    const/16 v43, 0x0

    .line 161
    .line 162
    const-wide/16 v44, 0x0

    .line 163
    .line 164
    const/16 v46, 0x0

    .line 165
    .line 166
    move-object/from16 v30, v16

    .line 167
    .line 168
    invoke-static/range {v30 .. v48}, La/y9q0;->a(La/y9q0;JJLa/psq;La/lsq;La/nrq;JLa/j56;La/k5q0;IIJLa/rw90;La/m600;I)La/y9q0;

    .line 169
    .line 170
    .line 171
    move-result-object v3

    .line 172
    const/16 v5, 0xa

    .line 173
    .line 174
    invoke-static {v5}, La/idm0;->t(I)J

    .line 175
    .line 176
    .line 177
    move-result-wide v17

    .line 178
    const/16 v5, 0xc

    .line 179
    .line 180
    invoke-static {v5}, La/idm0;->t(I)J

    .line 181
    .line 182
    .line 183
    move-result-wide v19

    .line 184
    invoke-static {v4}, La/idm0;->t(I)J

    .line 185
    .line 186
    .line 187
    move-result-wide v21

    .line 188
    new-instance v16, La/n05;

    .line 189
    .line 190
    invoke-direct/range {v16 .. v22}, La/n05;-><init>(JJJ)V

    .line 191
    .line 192
    .line 193
    shl-int/lit8 v0, v0, 0x3

    .line 194
    .line 195
    and-int/lit8 v0, v0, 0x70

    .line 196
    .line 197
    const v4, 0x186000

    .line 198
    .line 199
    .line 200
    or-int v11, v0, v4

    .line 201
    .line 202
    const/16 v12, 0x1a8

    .line 203
    .line 204
    move-object v0, v2

    .line 205
    move-object v2, v3

    .line 206
    const/4 v3, 0x0

    .line 207
    const/4 v4, 0x2

    .line 208
    const/4 v5, 0x0

    .line 209
    const/4 v6, 0x5

    .line 210
    const/4 v7, 0x0

    .line 211
    const/4 v8, 0x0

    .line 212
    move-object/from16 v9, v16

    .line 213
    .line 214
    invoke-static/range {v0 .. v12}, La/aad;->e(Ljava/lang/String;La/mm40;La/y9q0;Lkotlin/jvm/functions/Function1;IZIILa/n4d;La/n05;La/fet;II)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 218
    .line 219
    .line 220
    goto :goto_4

    .line 221
    :cond_6
    sget-object v0, La/p5n0;->a:La/p5n0;

    .line 222
    .line 223
    invoke-virtual {v13, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    if-eqz v0, :cond_7

    .line 228
    .line 229
    const v0, 0x61be0ed0

    .line 230
    .line 231
    .line 232
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v10, v15}, La/fet;->r(Z)V

    .line 236
    .line 237
    .line 238
    goto :goto_4

    .line 239
    :cond_7
    const v0, 0x61bd9dfa

    .line 240
    .line 241
    .line 242
    invoke-static {v0, v10, v15}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    throw v0

    .line 247
    :cond_8
    invoke-virtual {v10}, La/fet;->X()V

    .line 248
    .line 249
    .line 250
    :goto_4
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    new-instance v2, La/n0n;

    .line 257
    .line 258
    const/16 v3, 0x13

    .line 259
    .line 260
    invoke-direct {v2, v1, v13, v14, v3}, La/n0n;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 261
    .line 262
    .line 263
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 264
    .line 265
    :cond_9
    return-void
.end method

.method public static final e(La/mm40;La/wbs0;Lkotlin/jvm/functions/Function0;La/fet;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move-object/from16 v3, p2

    .line 6
    .line 7
    move-object/from16 v9, p3

    .line 8
    .line 9
    move/from16 v0, p4

    .line 10
    .line 11
    const v4, -0x1a6b3f12

    .line 12
    .line 13
    .line 14
    invoke-virtual {v9, v4}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v4, v0, 0x6

    .line 18
    .line 19
    if-nez v4, :cond_1

    .line 20
    .line 21
    invoke-virtual {v9, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-eqz v4, :cond_0

    .line 26
    .line 27
    const/4 v4, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v4, 0x2

    .line 30
    :goto_0
    or-int/2addr v4, v0

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v4, v0

    .line 33
    :goto_1
    and-int/lit8 v5, v0, 0x30

    .line 34
    .line 35
    const/16 v6, 0x20

    .line 36
    .line 37
    if-nez v5, :cond_3

    .line 38
    .line 39
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-virtual {v9, v5}, La/fet;->e(I)Z

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    if-eqz v5, :cond_2

    .line 48
    .line 49
    move v5, v6

    .line 50
    goto :goto_2

    .line 51
    :cond_2
    const/16 v5, 0x10

    .line 52
    .line 53
    :goto_2
    or-int/2addr v4, v5

    .line 54
    :cond_3
    and-int/lit16 v5, v0, 0x180

    .line 55
    .line 56
    const/16 v7, 0x100

    .line 57
    .line 58
    if-nez v5, :cond_5

    .line 59
    .line 60
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    if-eqz v5, :cond_4

    .line 65
    .line 66
    move v5, v7

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/16 v5, 0x80

    .line 69
    .line 70
    :goto_3
    or-int/2addr v4, v5

    .line 71
    :cond_5
    and-int/lit16 v5, v4, 0x93

    .line 72
    .line 73
    const/16 v8, 0x92

    .line 74
    .line 75
    const/4 v10, 0x0

    .line 76
    const/4 v11, 0x1

    .line 77
    if-eq v5, v8, :cond_6

    .line 78
    .line 79
    move v5, v11

    .line 80
    goto :goto_4

    .line 81
    :cond_6
    move v5, v10

    .line 82
    :goto_4
    and-int/lit8 v8, v4, 0x1

    .line 83
    .line 84
    invoke-virtual {v9, v8, v5}, La/fet;->U(IZ)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_e

    .line 89
    .line 90
    sget-object v5, La/qmk;->a:La/zcl;

    .line 91
    .line 92
    const/high16 v5, 0x42000000    # 32.0f

    .line 93
    .line 94
    invoke-static {v1, v5}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 95
    .line 96
    .line 97
    move-result-object v12

    .line 98
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    sget-object v8, La/ukd;->a:La/cl5;

    .line 103
    .line 104
    if-ne v5, v8, :cond_7

    .line 105
    .line 106
    invoke-static {v9}, La/dw9;->j(La/fet;)La/gy40;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    :cond_7
    move-object v13, v5

    .line 111
    check-cast v13, La/gy40;

    .line 112
    .line 113
    and-int/lit16 v5, v4, 0x380

    .line 114
    .line 115
    if-ne v5, v7, :cond_8

    .line 116
    .line 117
    move v5, v11

    .line 118
    goto :goto_5

    .line 119
    :cond_8
    move v5, v10

    .line 120
    :goto_5
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v7

    .line 124
    if-nez v5, :cond_9

    .line 125
    .line 126
    if-ne v7, v8, :cond_a

    .line 127
    .line 128
    :cond_9
    new-instance v7, La/dbn;

    .line 129
    .line 130
    const/16 v5, 0xc

    .line 131
    .line 132
    invoke-direct {v7, v3, v5}, La/dbn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v9, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_a
    move-object/from16 v17, v7

    .line 139
    .line 140
    check-cast v17, Lkotlin/jvm/functions/Function0;

    .line 141
    .line 142
    const/16 v18, 0x1c

    .line 143
    .line 144
    const/4 v14, 0x0

    .line 145
    const/4 v15, 0x0

    .line 146
    const/16 v16, 0x0

    .line 147
    .line 148
    invoke-static/range {v12 .. v18}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 149
    .line 150
    .line 151
    move-result-object v5

    .line 152
    const/high16 v7, 0x40c00000    # 6.0f

    .line 153
    .line 154
    invoke-static {v5, v7}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    const-string v7, "TRACK_EYE_ICON_TAG"

    .line 159
    .line 160
    invoke-static {v5, v7}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    and-int/lit8 v4, v4, 0x70

    .line 165
    .line 166
    if-ne v4, v6, :cond_b

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_b
    move v11, v10

    .line 170
    :goto_6
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    if-nez v11, :cond_c

    .line 175
    .line 176
    if-ne v4, v8, :cond_d

    .line 177
    .line 178
    :cond_c
    new-instance v4, La/g7p;

    .line 179
    .line 180
    const/16 v6, 0x13

    .line 181
    .line 182
    invoke-direct {v4, v2, v6}, La/g7p;-><init>(Ljava/lang/Object;B)V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    :cond_d
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 189
    .line 190
    invoke-static {v5, v10, v4}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 191
    .line 192
    .line 193
    move-result-object v6

    .line 194
    iget v4, v2, La/wbs0;->a:I

    .line 195
    .line 196
    const/4 v5, 0x6

    .line 197
    invoke-static {v4, v5, v9}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-static {v4, v9}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    sget-object v5, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 206
    .line 207
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 208
    .line 209
    .line 210
    move-result-wide v7

    .line 211
    const/16 v10, 0x38

    .line 212
    .line 213
    const/4 v11, 0x0

    .line 214
    const/4 v5, 0x0

    .line 215
    invoke-static/range {v4 .. v11}, La/dww;->c(La/pm80;Ljava/lang/String;La/mm40;JLa/fet;II)V

    .line 216
    .line 217
    .line 218
    goto :goto_7

    .line 219
    :cond_e
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 220
    .line 221
    .line 222
    :goto_7
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    if-eqz v6, :cond_f

    .line 227
    .line 228
    new-instance v0, La/eur;

    .line 229
    .line 230
    const/4 v5, 0x0

    .line 231
    move/from16 v4, p4

    .line 232
    .line 233
    invoke-direct/range {v0 .. v5}, La/eur;-><init>(La/mm40;La/wbs0;Lkotlin/jvm/functions/Function0;IB)V

    .line 234
    .line 235
    .line 236
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 237
    .line 238
    :cond_f
    return-void
.end method
