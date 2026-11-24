.class public abstract La/gco;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v0, -0x7398e0c7

    .line 11
    .line 12
    .line 13
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    and-int/lit8 v0, p4, 0x6

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    invoke-virtual {p3, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    const/4 v0, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v0, 0x2

    .line 29
    :goto_0
    or-int/2addr v0, p4

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v0, p4

    .line 32
    :goto_1
    and-int/lit8 v1, p4, 0x30

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    invoke-virtual {p3, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    const/16 v1, 0x20

    .line 43
    .line 44
    goto :goto_2

    .line 45
    :cond_2
    const/16 v1, 0x10

    .line 46
    .line 47
    :goto_2
    or-int/2addr v0, v1

    .line 48
    :cond_3
    and-int/lit16 v1, p4, 0x180

    .line 49
    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    const/16 v1, 0x100

    .line 59
    .line 60
    goto :goto_3

    .line 61
    :cond_4
    const/16 v1, 0x80

    .line 62
    .line 63
    :goto_3
    or-int/2addr v0, v1

    .line 64
    :cond_5
    and-int/lit16 v1, v0, 0x93

    .line 65
    .line 66
    const/16 v2, 0x92

    .line 67
    .line 68
    const/4 v3, 0x1

    .line 69
    const/4 v4, 0x0

    .line 70
    if-eq v1, v2, :cond_6

    .line 71
    .line 72
    move v1, v3

    .line 73
    goto :goto_4

    .line 74
    :cond_6
    move v1, v4

    .line 75
    :goto_4
    and-int/lit8 v2, v0, 0x1

    .line 76
    .line 77
    invoke-virtual {p3, v2, v1}, La/fet;->U(IZ)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_9

    .line 82
    .line 83
    invoke-interface {p1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    check-cast v1, La/gkw;

    .line 88
    .line 89
    if-eqz v1, :cond_7

    .line 90
    .line 91
    iget-object v1, v1, La/gkw;->b:La/a4x;

    .line 92
    .line 93
    if-eqz v1, :cond_7

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    goto :goto_5

    .line 100
    :cond_7
    move v1, v4

    .line 101
    :goto_5
    if-le v1, v3, :cond_8

    .line 102
    .line 103
    const v1, -0x2b9249d1

    .line 104
    .line 105
    .line 106
    invoke-virtual {p3, v1}, La/fet;->e0(I)V

    .line 107
    .line 108
    .line 109
    and-int/lit16 v0, v0, 0x3fe

    .line 110
    .line 111
    invoke-static {p0, p1, p2, p3, v0}, La/gco;->b(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 115
    .line 116
    .line 117
    goto :goto_6

    .line 118
    :cond_8
    const v1, -0x2b8fde4d

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, v1}, La/fet;->e0(I)V

    .line 122
    .line 123
    .line 124
    and-int/lit16 v0, v0, 0x3fe

    .line 125
    .line 126
    invoke-static {p0, p1, p2, p3, v0}, La/gco;->c(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 130
    .line 131
    .line 132
    goto :goto_6

    .line 133
    :cond_9
    invoke-virtual {p3}, La/fet;->X()V

    .line 134
    .line 135
    .line 136
    :goto_6
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 137
    .line 138
    .line 139
    move-result-object p3

    .line 140
    if-eqz p3, :cond_a

    .line 141
    .line 142
    new-instance v0, La/dyj;

    .line 143
    .line 144
    const/4 v5, 0x1

    .line 145
    move-object v1, p0

    .line 146
    move-object v2, p1

    .line 147
    move-object v3, p2

    .line 148
    move v4, p4

    .line 149
    invoke-direct/range {v0 .. v5}, La/dyj;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 150
    .line 151
    .line 152
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 153
    .line 154
    :cond_a
    return-void
.end method

.method public static final b(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 25

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
    move-object/from16 v12, p3

    .line 8
    .line 9
    move/from16 v6, p4

    .line 10
    .line 11
    const v0, 0x53c84fa1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v12, v0}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v0, v6, 0x6

    .line 18
    .line 19
    const/4 v5, 0x4

    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    move v0, v5

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v0, 0x2

    .line 31
    :goto_0
    or-int/2addr v0, v6

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v0, v6

    .line 34
    :goto_1
    and-int/lit8 v7, v6, 0x30

    .line 35
    .line 36
    const/16 v8, 0x20

    .line 37
    .line 38
    if-nez v7, :cond_3

    .line 39
    .line 40
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    move v7, v8

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v6, 0x180

    .line 52
    .line 53
    if-nez v7, :cond_5

    .line 54
    .line 55
    invoke-virtual {v12, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_4

    .line 60
    .line 61
    const/16 v7, 0x100

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_4
    const/16 v7, 0x80

    .line 65
    .line 66
    :goto_3
    or-int/2addr v0, v7

    .line 67
    :cond_5
    and-int/lit16 v7, v0, 0x93

    .line 68
    .line 69
    const/16 v10, 0x92

    .line 70
    .line 71
    const/4 v11, 0x0

    .line 72
    if-eq v7, v10, :cond_6

    .line 73
    .line 74
    const/4 v7, 0x1

    .line 75
    goto :goto_4

    .line 76
    :cond_6
    move v7, v11

    .line 77
    :goto_4
    and-int/lit8 v10, v0, 0x1

    .line 78
    .line 79
    invoke-virtual {v12, v10, v7}, La/fet;->U(IZ)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    if-eqz v7, :cond_10

    .line 84
    .line 85
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v7

    .line 89
    sget-object v10, La/ukd;->a:La/cl5;

    .line 90
    .line 91
    if-ne v7, v10, :cond_7

    .line 92
    .line 93
    sget-object v7, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 94
    .line 95
    invoke-static {v7, v12}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    invoke-virtual {v12, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    :cond_7
    check-cast v7, La/vne;

    .line 103
    .line 104
    sget-object v14, La/j7x;->a:La/zfn;

    .line 105
    .line 106
    invoke-virtual {v12, v14}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v15

    .line 110
    check-cast v15, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 111
    .line 112
    invoke-virtual {v15}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getSplashBackground-0d7_KjU()J

    .line 113
    .line 114
    .line 115
    move-result-wide v20

    .line 116
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v15

    .line 120
    if-ne v15, v10, :cond_8

    .line 121
    .line 122
    new-instance v16, La/imm;

    .line 123
    .line 124
    new-instance v15, La/ilm;

    .line 125
    .line 126
    sget-object v17, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 127
    .line 128
    move-object/from16 v24, v14

    .line 129
    .line 130
    invoke-virtual/range {v17 .. v17}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 131
    .line 132
    .line 133
    move-result-wide v13

    .line 134
    invoke-direct {v15, v13, v14}, La/ilm;-><init>(J)V

    .line 135
    .line 136
    .line 137
    const/16 v22, 0x0

    .line 138
    .line 139
    const/16 v23, 0x0

    .line 140
    .line 141
    sget-object v18, La/mlm;->a:La/mlm;

    .line 142
    .line 143
    sget-object v19, La/fmm;->a:La/fmm;

    .line 144
    .line 145
    move-object/from16 v17, v15

    .line 146
    .line 147
    invoke-direct/range {v16 .. v23}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 148
    .line 149
    .line 150
    move-object/from16 v15, v16

    .line 151
    .line 152
    invoke-virtual {v12, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    goto :goto_5

    .line 156
    :cond_8
    move-object/from16 v24, v14

    .line 157
    .line 158
    :goto_5
    check-cast v15, La/imm;

    .line 159
    .line 160
    invoke-virtual {v1}, La/xk80;->k()I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 165
    .line 166
    .line 167
    move-result-object v13

    .line 168
    invoke-static {v13, v12}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 169
    .line 170
    .line 171
    move-result-object v13

    .line 172
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    and-int/lit8 v4, v0, 0x70

    .line 175
    .line 176
    if-ne v4, v8, :cond_9

    .line 177
    .line 178
    const/4 v4, 0x1

    .line 179
    goto :goto_6

    .line 180
    :cond_9
    move v4, v11

    .line 181
    :goto_6
    and-int/lit8 v8, v0, 0xe

    .line 182
    .line 183
    if-ne v8, v5, :cond_a

    .line 184
    .line 185
    const/4 v5, 0x1

    .line 186
    goto :goto_7

    .line 187
    :cond_a
    move v5, v11

    .line 188
    :goto_7
    or-int/2addr v4, v5

    .line 189
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 190
    .line 191
    .line 192
    move-result-object v5

    .line 193
    const/4 v8, 0x0

    .line 194
    if-nez v4, :cond_b

    .line 195
    .line 196
    if-ne v5, v10, :cond_c

    .line 197
    .line 198
    :cond_b
    new-instance v5, La/fco;

    .line 199
    .line 200
    invoke-direct {v5, v11, v8, v1, v2}, La/fco;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v12, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 207
    .line 208
    invoke-static {v12, v14, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    sget-object v4, La/jm40;->b:La/jm40;

    .line 212
    .line 213
    const/high16 v5, 0x3f800000    # 1.0f

    .line 214
    .line 215
    invoke-static {v4, v5}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    move-object/from16 v5, v24

    .line 220
    .line 221
    invoke-virtual {v12, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v5

    .line 225
    check-cast v5, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 226
    .line 227
    move-object/from16 v17, v10

    .line 228
    .line 229
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getSplashBackground-0d7_KjU()J

    .line 230
    .line 231
    .line 232
    move-result-wide v9

    .line 233
    sget-object v5, La/jd8;->n:La/ljc;

    .line 234
    .line 235
    invoke-static {v4, v9, v10, v5}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    const/4 v5, 0x1

    .line 240
    invoke-static {v4, v8, v12, v5}, La/yyw;->X(La/mm40;Lkotlin/jvm/functions/Function1;La/fet;I)La/mm40;

    .line 241
    .line 242
    .line 243
    move-result-object v8

    .line 244
    and-int/lit16 v0, v0, 0x380

    .line 245
    .line 246
    const/16 v14, 0x100

    .line 247
    .line 248
    if-ne v0, v14, :cond_d

    .line 249
    .line 250
    move v11, v5

    .line 251
    :cond_d
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    if-nez v11, :cond_e

    .line 256
    .line 257
    move-object/from16 v4, v17

    .line 258
    .line 259
    if-ne v0, v4, :cond_f

    .line 260
    .line 261
    :cond_e
    new-instance v0, La/s8o;

    .line 262
    .line 263
    const/4 v4, 0x2

    .line 264
    invoke-direct {v0, v3, v4}, La/s8o;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 265
    .line 266
    .line 267
    invoke-virtual {v12, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 268
    .line 269
    .line 270
    :cond_f
    move-object v9, v0

    .line 271
    check-cast v9, Lkotlin/jvm/functions/Function0;

    .line 272
    .line 273
    new-instance v0, La/eco;

    .line 274
    .line 275
    move-object v4, v2

    .line 276
    move-object v5, v3

    .line 277
    move-object v3, v7

    .line 278
    move-object v2, v1

    .line 279
    move-object v1, v13

    .line 280
    invoke-direct/range {v0 .. v5}, La/eco;-><init>(La/pz40;La/xk80;La/vne;La/l7m0;Lkotlin/jvm/functions/Function1;)V

    .line 281
    .line 282
    .line 283
    const v1, -0x1aaf228d

    .line 284
    .line 285
    .line 286
    invoke-static {v1, v0, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 287
    .line 288
    .line 289
    move-result-object v10

    .line 290
    const/4 v14, 0x6

    .line 291
    move-object v1, v15

    .line 292
    const/16 v15, 0xbf4

    .line 293
    .line 294
    const/4 v2, 0x0

    .line 295
    const/4 v4, 0x0

    .line 296
    const/4 v5, 0x0

    .line 297
    const/4 v6, 0x0

    .line 298
    const/4 v7, 0x0

    .line 299
    move-object v0, v8

    .line 300
    const/4 v8, 0x0

    .line 301
    move-object v3, v9

    .line 302
    const/4 v9, 0x0

    .line 303
    const/4 v11, 0x0

    .line 304
    const/16 v13, 0x30

    .line 305
    .line 306
    invoke-static/range {v0 .. v15}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 307
    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_10
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 311
    .line 312
    .line 313
    :goto_8
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 314
    .line 315
    .line 316
    move-result-object v6

    .line 317
    if-eqz v6, :cond_11

    .line 318
    .line 319
    new-instance v0, La/dyj;

    .line 320
    .line 321
    const/4 v5, 0x2

    .line 322
    move-object/from16 v1, p0

    .line 323
    .line 324
    move-object/from16 v2, p1

    .line 325
    .line 326
    move-object/from16 v3, p2

    .line 327
    .line 328
    move/from16 v4, p4

    .line 329
    .line 330
    invoke-direct/range {v0 .. v5}, La/dyj;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 331
    .line 332
    .line 333
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 334
    .line 335
    :cond_11
    return-void
.end method

.method public static final c(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 23

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
    move-object/from16 v0, p3

    .line 8
    .line 9
    move/from16 v4, p4

    .line 10
    .line 11
    const v5, -0x4457e865

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v5}, La/fet;->g0(I)La/fet;

    .line 15
    .line 16
    .line 17
    and-int/lit8 v5, v4, 0x6

    .line 18
    .line 19
    const/4 v6, 0x4

    .line 20
    if-nez v5, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_0

    .line 27
    .line 28
    move v5, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 v5, 0x2

    .line 31
    :goto_0
    or-int/2addr v5, v4

    .line 32
    goto :goto_1

    .line 33
    :cond_1
    move v5, v4

    .line 34
    :goto_1
    and-int/lit8 v7, v4, 0x30

    .line 35
    .line 36
    const/16 v8, 0x20

    .line 37
    .line 38
    if-nez v7, :cond_3

    .line 39
    .line 40
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    if-eqz v7, :cond_2

    .line 45
    .line 46
    move v7, v8

    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v7, 0x10

    .line 49
    .line 50
    :goto_2
    or-int/2addr v5, v7

    .line 51
    :cond_3
    and-int/lit16 v7, v4, 0x180

    .line 52
    .line 53
    const/16 v9, 0x100

    .line 54
    .line 55
    if-nez v7, :cond_5

    .line 56
    .line 57
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-eqz v7, :cond_4

    .line 62
    .line 63
    move v7, v9

    .line 64
    goto :goto_3

    .line 65
    :cond_4
    const/16 v7, 0x80

    .line 66
    .line 67
    :goto_3
    or-int/2addr v5, v7

    .line 68
    :cond_5
    and-int/lit16 v7, v5, 0x93

    .line 69
    .line 70
    const/16 v10, 0x92

    .line 71
    .line 72
    const/4 v12, 0x1

    .line 73
    if-eq v7, v10, :cond_6

    .line 74
    .line 75
    move v7, v12

    .line 76
    goto :goto_4

    .line 77
    :cond_6
    const/4 v7, 0x0

    .line 78
    :goto_4
    and-int/lit8 v10, v5, 0x1

    .line 79
    .line 80
    invoke-virtual {v0, v10, v7}, La/fet;->U(IZ)Z

    .line 81
    .line 82
    .line 83
    move-result v7

    .line 84
    if-eqz v7, :cond_11

    .line 85
    .line 86
    sget-object v7, La/m8m0;->a:La/zfn;

    .line 87
    .line 88
    invoke-virtual {v0, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v7

    .line 92
    check-cast v7, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 93
    .line 94
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 95
    .line 96
    .line 97
    move-result-wide v13

    .line 98
    sget-object v7, La/j7x;->a:La/zfn;

    .line 99
    .line 100
    invoke-virtual {v0, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v10

    .line 104
    check-cast v10, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 105
    .line 106
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getSplashBackground-0d7_KjU()J

    .line 107
    .line 108
    .line 109
    move-result-wide v19

    .line 110
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 111
    .line 112
    and-int/lit8 v15, v5, 0x70

    .line 113
    .line 114
    if-ne v15, v8, :cond_7

    .line 115
    .line 116
    move v8, v12

    .line 117
    goto :goto_5

    .line 118
    :cond_7
    const/4 v8, 0x0

    .line 119
    :goto_5
    and-int/lit8 v15, v5, 0xe

    .line 120
    .line 121
    if-ne v15, v6, :cond_8

    .line 122
    .line 123
    move v6, v12

    .line 124
    goto :goto_6

    .line 125
    :cond_8
    const/4 v6, 0x0

    .line 126
    :goto_6
    or-int/2addr v6, v8

    .line 127
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    sget-object v15, La/ukd;->a:La/cl5;

    .line 132
    .line 133
    if-nez v6, :cond_9

    .line 134
    .line 135
    if-ne v8, v15, :cond_a

    .line 136
    .line 137
    :cond_9
    new-instance v8, La/fco;

    .line 138
    .line 139
    const/4 v6, 0x0

    .line 140
    invoke-direct {v8, v12, v6, v1, v2}, La/fco;-><init>(BLa/yje;La/xk80;La/l7m0;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 147
    .line 148
    invoke-static {v0, v10, v8}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 149
    .line 150
    .line 151
    sget-object v6, La/jm40;->b:La/jm40;

    .line 152
    .line 153
    const/high16 v8, 0x3f800000    # 1.0f

    .line 154
    .line 155
    invoke-static {v6, v8}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-virtual {v0, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v7

    .line 163
    check-cast v7, Lorg/xplatform/uikit/compose/color/IndividualColors;

    .line 164
    .line 165
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/IndividualColors;->getSplashBackground-0d7_KjU()J

    .line 166
    .line 167
    .line 168
    move-result-wide v7

    .line 169
    sget-object v10, La/jd8;->n:La/ljc;

    .line 170
    .line 171
    invoke-static {v6, v7, v8, v10}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 172
    .line 173
    .line 174
    move-result-object v6

    .line 175
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    if-ne v7, v15, :cond_d

    .line 180
    .line 181
    move-object v8, v15

    .line 182
    new-instance v15, La/imm;

    .line 183
    .line 184
    new-instance v7, La/ilm;

    .line 185
    .line 186
    sget-object v10, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 187
    .line 188
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 189
    .line 190
    .line 191
    move-result-wide v11

    .line 192
    invoke-direct {v7, v11, v12}, La/ilm;-><init>(J)V

    .line 193
    .line 194
    .line 195
    new-instance v10, La/plm;

    .line 196
    .line 197
    invoke-interface {v2}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v11

    .line 201
    check-cast v11, La/gkw;

    .line 202
    .line 203
    if-eqz v11, :cond_b

    .line 204
    .line 205
    iget-object v11, v11, La/gkw;->c:La/ekw;

    .line 206
    .line 207
    if-eqz v11, :cond_b

    .line 208
    .line 209
    iget-object v11, v11, La/ekw;->b:Ljava/lang/String;

    .line 210
    .line 211
    if-nez v11, :cond_c

    .line 212
    .line 213
    :cond_b
    const-string v11, ""

    .line 214
    .line 215
    :cond_c
    sget-object v12, La/fa50;->a:La/fa50;

    .line 216
    .line 217
    invoke-direct {v10, v11, v13, v14, v12}, La/plm;-><init>(Ljava/lang/String;JLa/ga50;)V

    .line 218
    .line 219
    .line 220
    const/16 v21, 0x0

    .line 221
    .line 222
    const/16 v22, 0x0

    .line 223
    .line 224
    sget-object v18, La/fmm;->a:La/fmm;

    .line 225
    .line 226
    move-object/from16 v16, v7

    .line 227
    .line 228
    move-object/from16 v17, v10

    .line 229
    .line 230
    invoke-direct/range {v15 .. v22}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v0, v15}, La/fet;->o0(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    move-object v7, v15

    .line 237
    goto :goto_7

    .line 238
    :cond_d
    move-object v8, v15

    .line 239
    :goto_7
    check-cast v7, La/imm;

    .line 240
    .line 241
    and-int/lit16 v5, v5, 0x380

    .line 242
    .line 243
    if-ne v5, v9, :cond_e

    .line 244
    .line 245
    const/4 v11, 0x1

    .line 246
    goto :goto_8

    .line 247
    :cond_e
    const/4 v11, 0x0

    .line 248
    :goto_8
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v5

    .line 252
    if-nez v11, :cond_f

    .line 253
    .line 254
    if-ne v5, v8, :cond_10

    .line 255
    .line 256
    :cond_f
    new-instance v5, La/s8o;

    .line 257
    .line 258
    const/4 v8, 0x3

    .line 259
    invoke-direct {v5, v3, v8}, La/s8o;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 266
    .line 267
    const/16 v18, 0x0

    .line 268
    .line 269
    const/16 v19, 0xff4

    .line 270
    .line 271
    move-object v4, v6

    .line 272
    const/4 v6, 0x0

    .line 273
    const/4 v8, 0x0

    .line 274
    const/4 v9, 0x0

    .line 275
    const/4 v10, 0x0

    .line 276
    const/4 v11, 0x0

    .line 277
    const/4 v12, 0x0

    .line 278
    const/4 v13, 0x0

    .line 279
    const/4 v14, 0x0

    .line 280
    const/4 v15, 0x0

    .line 281
    const/16 v17, 0x30

    .line 282
    .line 283
    move-object/from16 v16, v7

    .line 284
    .line 285
    move-object v7, v5

    .line 286
    move-object/from16 v5, v16

    .line 287
    .line 288
    move-object/from16 v16, v0

    .line 289
    .line 290
    invoke-static/range {v4 .. v19}, La/hlm;->c(La/mm40;La/imm;La/vkm;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;La/fet;III)V

    .line 291
    .line 292
    .line 293
    goto :goto_9

    .line 294
    :cond_11
    invoke-virtual/range {p3 .. p3}, La/fet;->X()V

    .line 295
    .line 296
    .line 297
    :goto_9
    invoke-virtual/range {p3 .. p3}, La/fet;->u()La/yfe0;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    if-eqz v6, :cond_12

    .line 302
    .line 303
    new-instance v0, La/dyj;

    .line 304
    .line 305
    const/4 v5, 0x3

    .line 306
    move/from16 v4, p4

    .line 307
    .line 308
    invoke-direct/range {v0 .. v5}, La/dyj;-><init>(La/xk80;La/l7m0;Lkotlin/jvm/functions/Function1;IB)V

    .line 309
    .line 310
    .line 311
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 312
    .line 313
    :cond_12
    return-void
.end method
