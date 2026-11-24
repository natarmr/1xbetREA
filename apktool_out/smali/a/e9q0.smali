.class public final La/e9q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pz40;

.field public b:La/j83;

.field public final c:Landroidx/compose/runtime/snapshots/SnapshotStateList;


# direct methods
.method public constructor <init>(La/j83;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-static {v1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    iput-object v1, v0, La/e9q0;->a:La/pz40;

    .line 12
    .line 13
    new-instance v1, La/t6q0;

    .line 14
    .line 15
    const/16 v2, 0xe

    .line 16
    .line 17
    invoke-direct {v1, v2}, La/t6q0;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v2, La/h83;

    .line 24
    .line 25
    move-object/from16 v3, p1

    .line 26
    .line 27
    invoke-direct {v2, v3}, La/h83;-><init>(La/j83;)V

    .line 28
    .line 29
    .line 30
    new-instance v3, Ljava/util/ArrayList;

    .line 31
    .line 32
    iget-object v4, v2, La/h83;->c:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 39
    .line 40
    .line 41
    invoke-interface {v4}, Ljava/util/Collection;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v7, 0x0

    .line 46
    :goto_0
    if-ge v7, v5, :cond_1

    .line 47
    .line 48
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v8

    .line 52
    check-cast v8, La/g83;

    .line 53
    .line 54
    const/high16 v9, -0x80000000

    .line 55
    .line 56
    invoke-virtual {v8, v9}, La/g83;->a(I)La/i83;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v1, v8}, La/t6q0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    check-cast v8, Ljava/util/List;

    .line 65
    .line 66
    new-instance v9, Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-interface {v8}, Ljava/util/List;->size()I

    .line 69
    .line 70
    .line 71
    move-result v10

    .line 72
    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v8}, Ljava/util/Collection;->size()I

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    const/4 v11, 0x0

    .line 80
    :goto_1
    if-ge v11, v10, :cond_0

    .line 81
    .line 82
    invoke-interface {v8, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v12

    .line 86
    check-cast v12, La/i83;

    .line 87
    .line 88
    new-instance v13, La/g83;

    .line 89
    .line 90
    iget-object v14, v12, La/i83;->a:Ljava/lang/Object;

    .line 91
    .line 92
    iget v15, v12, La/i83;->b:I

    .line 93
    .line 94
    iget v6, v12, La/i83;->c:I

    .line 95
    .line 96
    iget-object v12, v12, La/i83;->d:Ljava/lang/String;

    .line 97
    .line 98
    invoke-direct {v13, v15, v6, v14, v12}, La/g83;-><init>(IILjava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v9, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    add-int/lit8 v11, v11, 0x1

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_0
    invoke-static {v3, v9}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 108
    .line 109
    .line 110
    add-int/lit8 v7, v7, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_1
    invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 117
    .line 118
    .line 119
    invoke-virtual {v2}, La/h83;->h()La/j83;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    iput-object v1, v0, La/e9q0;->b:La/j83;

    .line 124
    .line 125
    new-instance v1, Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 126
    .line 127
    invoke-direct {v1}, Landroidx/compose/runtime/snapshots/SnapshotStateList;-><init>()V

    .line 128
    .line 129
    .line 130
    iput-object v1, v0, La/e9q0;->c:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 131
    .line 132
    return-void
.end method

.method public static c(La/i83;La/a9q0;)La/i83;
    .locals 2

    .line 1
    iget-object p1, p1, La/a9q0;->b:La/bw40;

    .line 2
    .line 3
    iget v0, p1, La/bw40;->f:I

    .line 4
    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {p1, v0, v1}, La/bw40;->c(IZ)I

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    iget v0, p0, La/i83;->b:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    if-ge v0, p1, :cond_0

    .line 16
    .line 17
    iget v0, p0, La/i83;->c:I

    .line 18
    .line 19
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    const/16 v0, 0xb

    .line 24
    .line 25
    invoke-static {p0, v1, p1, v0}, La/i83;->a(La/i83;La/f83;II)La/i83;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    return-object v1
.end method


# virtual methods
.method public final a(ILa/fet;)V
    .locals 32

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    const v3, 0x44d294da

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v3}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v5, 0x2

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    const/4 v3, 0x4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v3, v5

    .line 23
    :goto_0
    or-int/2addr v3, v1

    .line 24
    and-int/lit8 v6, v3, 0x3

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    if-eq v6, v5, :cond_1

    .line 28
    .line 29
    const/4 v6, 0x1

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    move v6, v8

    .line 32
    :goto_1
    and-int/lit8 v9, v3, 0x1

    .line 33
    .line 34
    invoke-virtual {v2, v9, v6}, La/fet;->U(IZ)Z

    .line 35
    .line 36
    .line 37
    move-result v6

    .line 38
    if-eqz v6, :cond_14

    .line 39
    .line 40
    sget-object v6, La/bmd;->s:La/zfn;

    .line 41
    .line 42
    invoke-virtual {v2, v6}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    check-cast v6, La/u23;

    .line 47
    .line 48
    iget-object v9, v0, La/e9q0;->b:La/j83;

    .line 49
    .line 50
    iget-object v10, v9, La/j83;->b:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v10

    .line 56
    invoke-virtual {v9, v10}, La/j83;->a(I)Ljava/util/List;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    move v11, v8

    .line 65
    :goto_2
    if-ge v11, v10, :cond_15

    .line 66
    .line 67
    invoke-interface {v9, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v12

    .line 71
    check-cast v12, La/i83;

    .line 72
    .line 73
    iget v13, v12, La/i83;->b:I

    .line 74
    .line 75
    iget-object v14, v12, La/i83;->a:Ljava/lang/Object;

    .line 76
    .line 77
    iget v15, v12, La/i83;->c:I

    .line 78
    .line 79
    if-eq v13, v15, :cond_13

    .line 80
    .line 81
    const v13, 0x2b3dee17

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2, v13}, La/fet;->e0(I)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v13

    .line 91
    sget-object v15, La/ukd;->a:La/cl5;

    .line 92
    .line 93
    if-ne v13, v15, :cond_2

    .line 94
    .line 95
    invoke-static {v2}, La/dw9;->j(La/fet;)La/gy40;

    .line 96
    .line 97
    .line 98
    move-result-object v13

    .line 99
    :cond_2
    check-cast v13, La/gy40;

    .line 100
    .line 101
    const/16 v22, 0x4

    .line 102
    .line 103
    new-instance v4, La/b8q0;

    .line 104
    .line 105
    invoke-direct {v4, v0, v12, v5}, La/b8q0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 106
    .line 107
    .line 108
    move/from16 v23, v5

    .line 109
    .line 110
    sget-object v5, La/jm40;->b:La/jm40;

    .line 111
    .line 112
    invoke-static {v5, v4}, La/i4w0;->T(La/mm40;Lkotlin/jvm/functions/Function1;)La/mm40;

    .line 113
    .line 114
    .line 115
    move-result-object v4

    .line 116
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v5

    .line 120
    if-ne v5, v15, :cond_3

    .line 121
    .line 122
    new-instance v5, La/t6q0;

    .line 123
    .line 124
    const/16 v7, 0xf

    .line 125
    .line 126
    invoke-direct {v5, v7}, La/t6q0;-><init>(B)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 130
    .line 131
    .line 132
    :cond_3
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 133
    .line 134
    invoke-static {v4, v8, v5}, La/pai0;->a(La/mm40;ZLkotlin/jvm/functions/Function1;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    new-instance v5, La/p9q0;

    .line 139
    .line 140
    new-instance v7, La/lmn0;

    .line 141
    .line 142
    const/4 v8, 0x1

    .line 143
    invoke-direct {v7, v0, v12, v8}, La/lmn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 144
    .line 145
    .line 146
    invoke-direct {v5, v7}, La/p9q0;-><init>(La/lmn0;)V

    .line 147
    .line 148
    .line 149
    invoke-interface {v4, v5}, La/mm40;->e(La/mm40;)La/mm40;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    invoke-static {v4, v13, v8}, La/hp4;->I(La/mm40;La/gy40;Z)La/mm40;

    .line 154
    .line 155
    .line 156
    move-result-object v4

    .line 157
    sget-object v5, La/bpa0;->a:La/jtv;

    .line 158
    .line 159
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    sget-object v5, La/i120;->j:La/d13;

    .line 163
    .line 164
    invoke-static {v4, v5}, La/c3x;->C(La/mm40;La/d13;)La/mm40;

    .line 165
    .line 166
    .line 167
    move-result-object v16

    .line 168
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    invoke-virtual {v2, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v5

    .line 176
    or-int/2addr v4, v5

    .line 177
    invoke-virtual {v2, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    or-int/2addr v4, v5

    .line 182
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    if-nez v4, :cond_4

    .line 187
    .line 188
    if-ne v5, v15, :cond_5

    .line 189
    .line 190
    :cond_4
    new-instance v5, La/yip0;

    .line 191
    .line 192
    invoke-direct {v5, v0, v12, v6}, La/yip0;-><init>(La/e9q0;La/i83;La/u23;)V

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    :cond_5
    move-object/from16 v20, v5

    .line 199
    .line 200
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 201
    .line 202
    const/16 v21, 0x1fc

    .line 203
    .line 204
    const/16 v18, 0x0

    .line 205
    .line 206
    const/16 v19, 0x0

    .line 207
    .line 208
    move-object/from16 v17, v13

    .line 209
    .line 210
    invoke-static/range {v16 .. v21}, La/y860;->Z(La/mm40;La/gy40;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    const/4 v5, 0x0

    .line 215
    invoke-static {v5, v2, v4}, La/zq8;->a(ILa/fet;La/mm40;)V

    .line 216
    .line 217
    .line 218
    check-cast v14, La/kb00;

    .line 219
    .line 220
    invoke-virtual {v14}, La/kb00;->b()La/f9q0;

    .line 221
    .line 222
    .line 223
    move-result-object v4

    .line 224
    if-eqz v4, :cond_6

    .line 225
    .line 226
    iget-object v5, v4, La/f9q0;->a:La/smk0;

    .line 227
    .line 228
    if-nez v5, :cond_7

    .line 229
    .line 230
    iget-object v5, v4, La/f9q0;->b:La/smk0;

    .line 231
    .line 232
    if-nez v5, :cond_7

    .line 233
    .line 234
    iget-object v5, v4, La/f9q0;->c:La/smk0;

    .line 235
    .line 236
    if-nez v5, :cond_7

    .line 237
    .line 238
    iget-object v4, v4, La/f9q0;->d:La/smk0;

    .line 239
    .line 240
    if-nez v4, :cond_7

    .line 241
    .line 242
    :cond_6
    const/4 v5, 0x0

    .line 243
    const/16 v24, 0x1

    .line 244
    .line 245
    goto/16 :goto_9

    .line 246
    .line 247
    :cond_7
    const v4, 0x2b4a813f

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v4

    .line 257
    if-ne v4, v15, :cond_8

    .line 258
    .line 259
    new-instance v4, La/vb00;

    .line 260
    .line 261
    invoke-direct {v4, v13}, La/vb00;-><init>(La/gy40;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    :cond_8
    check-cast v4, La/vb00;

    .line 268
    .line 269
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 270
    .line 271
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v7

    .line 275
    const/4 v8, 0x0

    .line 276
    if-ne v7, v15, :cond_9

    .line 277
    .line 278
    new-instance v7, La/z2n0;

    .line 279
    .line 280
    const/16 v13, 0xd

    .line 281
    .line 282
    invoke-direct {v7, v4, v8, v13}, La/z2n0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 286
    .line 287
    .line 288
    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 289
    .line 290
    invoke-static {v2, v5, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 291
    .line 292
    .line 293
    iget-object v5, v4, La/vb00;->b:La/cgk0;

    .line 294
    .line 295
    iget-object v7, v4, La/vb00;->b:La/cgk0;

    .line 296
    .line 297
    invoke-virtual {v5}, La/cgk0;->l()I

    .line 298
    .line 299
    .line 300
    move-result v5

    .line 301
    and-int/lit8 v5, v5, 0x2

    .line 302
    .line 303
    if-eqz v5, :cond_a

    .line 304
    .line 305
    const/4 v5, 0x1

    .line 306
    goto :goto_3

    .line 307
    :cond_a
    const/4 v5, 0x0

    .line 308
    :goto_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 309
    .line 310
    .line 311
    move-result-object v25

    .line 312
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 313
    .line 314
    .line 315
    move-result v5

    .line 316
    const/16 v24, 0x1

    .line 317
    .line 318
    and-int/lit8 v5, v5, 0x1

    .line 319
    .line 320
    if-eqz v5, :cond_b

    .line 321
    .line 322
    move/from16 v5, v24

    .line 323
    .line 324
    goto :goto_4

    .line 325
    :cond_b
    const/4 v5, 0x0

    .line 326
    :goto_4
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 327
    .line 328
    .line 329
    move-result-object v26

    .line 330
    invoke-virtual {v7}, La/cgk0;->l()I

    .line 331
    .line 332
    .line 333
    move-result v5

    .line 334
    and-int/lit8 v5, v5, 0x4

    .line 335
    .line 336
    if-eqz v5, :cond_c

    .line 337
    .line 338
    move/from16 v5, v24

    .line 339
    .line 340
    goto :goto_5

    .line 341
    :cond_c
    const/4 v5, 0x0

    .line 342
    :goto_5
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 343
    .line 344
    .line 345
    move-result-object v27

    .line 346
    invoke-virtual {v14}, La/kb00;->b()La/f9q0;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    if-eqz v5, :cond_d

    .line 351
    .line 352
    iget-object v5, v5, La/f9q0;->a:La/smk0;

    .line 353
    .line 354
    move-object/from16 v28, v5

    .line 355
    .line 356
    goto :goto_6

    .line 357
    :cond_d
    move-object/from16 v28, v8

    .line 358
    .line 359
    :goto_6
    invoke-virtual {v14}, La/kb00;->b()La/f9q0;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    if-eqz v5, :cond_e

    .line 364
    .line 365
    iget-object v5, v5, La/f9q0;->b:La/smk0;

    .line 366
    .line 367
    move-object/from16 v29, v5

    .line 368
    .line 369
    goto :goto_7

    .line 370
    :cond_e
    move-object/from16 v29, v8

    .line 371
    .line 372
    :goto_7
    invoke-virtual {v14}, La/kb00;->b()La/f9q0;

    .line 373
    .line 374
    .line 375
    move-result-object v5

    .line 376
    if-eqz v5, :cond_f

    .line 377
    .line 378
    iget-object v5, v5, La/f9q0;->c:La/smk0;

    .line 379
    .line 380
    move-object/from16 v30, v5

    .line 381
    .line 382
    goto :goto_8

    .line 383
    :cond_f
    move-object/from16 v30, v8

    .line 384
    .line 385
    :goto_8
    invoke-virtual {v14}, La/kb00;->b()La/f9q0;

    .line 386
    .line 387
    .line 388
    move-result-object v5

    .line 389
    if-eqz v5, :cond_10

    .line 390
    .line 391
    iget-object v8, v5, La/f9q0;->d:La/smk0;

    .line 392
    .line 393
    :cond_10
    move-object/from16 v31, v8

    .line 394
    .line 395
    filled-new-array/range {v25 .. v31}, [Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v5

    .line 399
    invoke-virtual {v2, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v7

    .line 403
    invoke-virtual {v2, v12}, La/fet;->g(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v8

    .line 407
    or-int/2addr v7, v8

    .line 408
    invoke-virtual {v2}, La/fet;->P()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object v8

    .line 412
    if-nez v7, :cond_11

    .line 413
    .line 414
    if-ne v8, v15, :cond_12

    .line 415
    .line 416
    :cond_11
    new-instance v8, La/b8q0;

    .line 417
    .line 418
    invoke-direct {v8, v0, v12, v4}, La/b8q0;-><init>(La/e9q0;La/i83;La/vb00;)V

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 422
    .line 423
    .line 424
    :cond_12
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 425
    .line 426
    shl-int/lit8 v4, v3, 0x6

    .line 427
    .line 428
    and-int/lit16 v4, v4, 0x380

    .line 429
    .line 430
    invoke-virtual {v0, v5, v8, v2, v4}, La/e9q0;->b([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 431
    .line 432
    .line 433
    const/4 v5, 0x0

    .line 434
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 435
    .line 436
    .line 437
    goto :goto_a

    .line 438
    :goto_9
    const v4, 0x2b6975be

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 442
    .line 443
    .line 444
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 445
    .line 446
    .line 447
    :goto_a
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 448
    .line 449
    .line 450
    goto :goto_b

    .line 451
    :cond_13
    move/from16 v23, v5

    .line 452
    .line 453
    move v5, v8

    .line 454
    const/16 v22, 0x4

    .line 455
    .line 456
    const/16 v24, 0x1

    .line 457
    .line 458
    const v4, 0x2b69abfe

    .line 459
    .line 460
    .line 461
    invoke-virtual {v2, v4}, La/fet;->e0(I)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v2, v5}, La/fet;->r(Z)V

    .line 465
    .line 466
    .line 467
    :goto_b
    add-int/lit8 v11, v11, 0x1

    .line 468
    .line 469
    move v8, v5

    .line 470
    move/from16 v5, v23

    .line 471
    .line 472
    goto/16 :goto_2

    .line 473
    .line 474
    :cond_14
    invoke-virtual {v2}, La/fet;->X()V

    .line 475
    .line 476
    .line 477
    :cond_15
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 478
    .line 479
    .line 480
    move-result-object v2

    .line 481
    if-eqz v2, :cond_16

    .line 482
    .line 483
    new-instance v3, La/l7p0;

    .line 484
    .line 485
    const/16 v4, 0x14

    .line 486
    .line 487
    invoke-direct {v3, v0, v1, v4}, La/l7p0;-><init>(Ljava/lang/Object;IB)V

    .line 488
    .line 489
    .line 490
    iput-object v3, v2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 491
    .line 492
    :cond_16
    return-void
.end method

.method public final b([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 7

    .line 1
    const v0, -0x7c28da43

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    and-int/lit8 v0, p4, 0x30

    .line 8
    .line 9
    const/16 v1, 0x20

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p3, p2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move v0, v1

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/16 v0, 0x10

    .line 22
    .line 23
    :goto_0
    or-int/2addr v0, p4

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move v0, p4

    .line 26
    :goto_1
    and-int/lit16 v2, p4, 0x180

    .line 27
    .line 28
    if-nez v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    const/16 v2, 0x100

    .line 37
    .line 38
    goto :goto_2

    .line 39
    :cond_2
    const/16 v2, 0x80

    .line 40
    .line 41
    :goto_2
    or-int/2addr v0, v2

    .line 42
    :cond_3
    array-length v2, p1

    .line 43
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    const v3, -0x155b52f2

    .line 48
    .line 49
    .line 50
    invoke-virtual {p3, v3, v2}, La/fet;->b0(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    array-length v2, p1

    .line 54
    invoke-virtual {p3, v2}, La/fet;->e(I)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    const/4 v3, 0x4

    .line 59
    const/4 v4, 0x0

    .line 60
    if-eqz v2, :cond_4

    .line 61
    .line 62
    move v2, v3

    .line 63
    goto :goto_3

    .line 64
    :cond_4
    move v2, v4

    .line 65
    :goto_3
    or-int/2addr v0, v2

    .line 66
    array-length v2, p1

    .line 67
    move v5, v4

    .line 68
    :goto_4
    if-ge v5, v2, :cond_6

    .line 69
    .line 70
    aget-object v6, p1, v5

    .line 71
    .line 72
    invoke-virtual {p3, v6}, La/fet;->i(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_5

    .line 77
    .line 78
    move v6, v3

    .line 79
    goto :goto_5

    .line 80
    :cond_5
    move v6, v4

    .line 81
    :goto_5
    or-int/2addr v0, v6

    .line 82
    add-int/lit8 v5, v5, 0x1

    .line 83
    .line 84
    goto :goto_4

    .line 85
    :cond_6
    invoke-virtual {p3, v4}, La/fet;->r(Z)V

    .line 86
    .line 87
    .line 88
    and-int/lit8 v2, v0, 0xe

    .line 89
    .line 90
    if-nez v2, :cond_7

    .line 91
    .line 92
    or-int/lit8 v0, v0, 0x2

    .line 93
    .line 94
    :cond_7
    and-int/lit16 v2, v0, 0x93

    .line 95
    .line 96
    const/16 v3, 0x92

    .line 97
    .line 98
    const/4 v5, 0x1

    .line 99
    if-eq v2, v3, :cond_8

    .line 100
    .line 101
    move v2, v5

    .line 102
    goto :goto_6

    .line 103
    :cond_8
    move v2, v4

    .line 104
    :goto_6
    and-int/lit8 v3, v0, 0x1

    .line 105
    .line 106
    invoke-virtual {p3, v3, v2}, La/fet;->U(IZ)Z

    .line 107
    .line 108
    .line 109
    move-result v2

    .line 110
    if-eqz v2, :cond_c

    .line 111
    .line 112
    new-instance v2, La/jdg0;

    .line 113
    .line 114
    const/4 v3, 0x2

    .line 115
    invoke-direct {v2, v3}, La/jdg0;-><init>(I)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v2, p2}, La/jdg0;->a(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, p1}, La/jdg0;->b(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    iget-object v2, v2, La/jdg0;->b:Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    new-array v3, v3, [Ljava/lang/Object;

    .line 131
    .line 132
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    invoke-virtual {p3, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    and-int/lit8 v0, v0, 0x70

    .line 141
    .line 142
    if-ne v0, v1, :cond_9

    .line 143
    .line 144
    move v4, v5

    .line 145
    :cond_9
    or-int v0, v3, v4

    .line 146
    .line 147
    invoke-virtual {p3}, La/fet;->P()Ljava/lang/Object;

    .line 148
    .line 149
    .line 150
    move-result-object v1

    .line 151
    if-nez v0, :cond_a

    .line 152
    .line 153
    sget-object v0, La/ukd;->a:La/cl5;

    .line 154
    .line 155
    if-ne v1, v0, :cond_b

    .line 156
    .line 157
    :cond_a
    new-instance v1, La/da6;

    .line 158
    .line 159
    invoke-direct {v1, p0, p2, v5}, La/da6;-><init>(La/e9q0;Lkotlin/jvm/functions/Function1;B)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {p3, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    :cond_b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 166
    .line 167
    invoke-static {v2, v1, p3}, La/m0x0;->p([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 168
    .line 169
    .line 170
    goto :goto_7

    .line 171
    :cond_c
    invoke-virtual {p3}, La/fet;->X()V

    .line 172
    .line 173
    .line 174
    :goto_7
    invoke-virtual {p3}, La/fet;->u()La/yfe0;

    .line 175
    .line 176
    .line 177
    move-result-object p3

    .line 178
    if-eqz p3, :cond_d

    .line 179
    .line 180
    new-instance v0, La/s0n0;

    .line 181
    .line 182
    const/4 v5, 0x7

    .line 183
    move-object v1, p0

    .line 184
    move-object v2, p1

    .line 185
    move-object v3, p2

    .line 186
    move v4, p4

    .line 187
    invoke-direct/range {v0 .. v5}, La/s0n0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 188
    .line 189
    .line 190
    iput-object v0, p3, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 191
    .line 192
    :cond_d
    return-void
.end method
