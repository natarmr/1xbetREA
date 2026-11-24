.class public abstract La/k9m;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, La/qmk;->a:La/zcl;

    .line 2
    .line 3
    const/high16 v0, 0x42200000    # 40.0f

    .line 4
    .line 5
    sput v0, La/k9m;->a:F

    .line 6
    .line 7
    return-void
.end method

.method public static final a(La/mm40;La/l9m;La/fet;II)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const v0, -0x4d1509ad

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 8
    .line 9
    .line 10
    and-int/lit8 v0, p4, 0x1

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    or-int/lit8 v1, p3, 0x6

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    and-int/lit8 v1, p3, 0x6

    .line 18
    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p2, p0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const/4 v1, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 v1, 0x2

    .line 30
    :goto_0
    or-int/2addr v1, p3

    .line 31
    goto :goto_1

    .line 32
    :cond_2
    move v1, p3

    .line 33
    :goto_1
    and-int/lit8 v2, p3, 0x30

    .line 34
    .line 35
    if-nez v2, :cond_4

    .line 36
    .line 37
    invoke-virtual {p2, p1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_3

    .line 42
    .line 43
    const/16 v2, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_3
    const/16 v2, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v1, v2

    .line 49
    :cond_4
    and-int/lit8 v2, v1, 0x13

    .line 50
    .line 51
    const/16 v3, 0x12

    .line 52
    .line 53
    const/4 v4, 0x0

    .line 54
    if-eq v2, v3, :cond_5

    .line 55
    .line 56
    const/4 v2, 0x1

    .line 57
    goto :goto_3

    .line 58
    :cond_5
    move v2, v4

    .line 59
    :goto_3
    and-int/lit8 v3, v1, 0x1

    .line 60
    .line 61
    invoke-virtual {p2, v3, v2}, La/fet;->U(IZ)Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-eqz v2, :cond_8

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    sget-object p0, La/jm40;->b:La/jm40;

    .line 70
    .line 71
    :cond_6
    instance-of v0, p1, La/l9m;

    .line 72
    .line 73
    if-eqz v0, :cond_7

    .line 74
    .line 75
    const v0, -0x5bf8ed1f

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2, v0}, La/fet;->e0(I)V

    .line 79
    .line 80
    .line 81
    iget-object v0, p1, La/l9m;->a:La/n0x;

    .line 82
    .line 83
    iget-object v2, p1, La/l9m;->b:La/y3d;

    .line 84
    .line 85
    and-int/lit8 v1, v1, 0xe

    .line 86
    .line 87
    invoke-static {p0, v0, v2, p2, v1}, La/k9m;->b(La/mm40;La/n0x;La/y3d;La/fet;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v4}, La/fet;->r(Z)V

    .line 91
    .line 92
    .line 93
    :goto_4
    move-object v1, p0

    .line 94
    goto :goto_5

    .line 95
    :cond_7
    const p0, -0x5bf939fe

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p2, v4}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    throw p0

    .line 103
    :cond_8
    invoke-virtual {p2}, La/fet;->X()V

    .line 104
    .line 105
    .line 106
    goto :goto_4

    .line 107
    :goto_5
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    if-eqz p0, :cond_9

    .line 112
    .line 113
    new-instance v0, La/q02;

    .line 114
    .line 115
    const/16 v5, 0xb

    .line 116
    .line 117
    move-object v2, p1

    .line 118
    move v3, p3

    .line 119
    move v4, p4

    .line 120
    invoke-direct/range {v0 .. v5}, La/q02;-><init>(La/mm40;Ljava/lang/Object;IIB)V

    .line 121
    .line 122
    .line 123
    iput-object v0, p0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 124
    .line 125
    :cond_9
    return-void
.end method

.method public static final b(La/mm40;La/n0x;La/y3d;La/fet;I)V
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v11, p3

    .line 4
    .line 5
    move/from16 v0, p4

    .line 6
    .line 7
    const v2, 0x7c8adad5

    .line 8
    .line 9
    .line 10
    invoke-virtual {v11, v2}, La/fet;->g0(I)La/fet;

    .line 11
    .line 12
    .line 13
    and-int/lit8 v2, v0, 0x6

    .line 14
    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    const/4 v2, 0x4

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v2, 0x2

    .line 26
    :goto_0
    or-int/2addr v2, v0

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    move v2, v0

    .line 29
    :goto_1
    and-int/lit8 v3, v0, 0x30

    .line 30
    .line 31
    move-object/from16 v4, p1

    .line 32
    .line 33
    if-nez v3, :cond_3

    .line 34
    .line 35
    invoke-virtual {v11, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    const/16 v3, 0x20

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_2
    const/16 v3, 0x10

    .line 45
    .line 46
    :goto_2
    or-int/2addr v2, v3

    .line 47
    :cond_3
    and-int/lit16 v3, v0, 0x180

    .line 48
    .line 49
    const v5, 0x7f080991

    .line 50
    .line 51
    .line 52
    if-nez v3, :cond_5

    .line 53
    .line 54
    invoke-virtual {v11, v5}, La/fet;->e(I)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    const/16 v3, 0x100

    .line 61
    .line 62
    goto :goto_3

    .line 63
    :cond_4
    const/16 v3, 0x80

    .line 64
    .line 65
    :goto_3
    or-int/2addr v2, v3

    .line 66
    :cond_5
    and-int/lit16 v3, v0, 0xc00

    .line 67
    .line 68
    const/4 v7, 0x0

    .line 69
    if-nez v3, :cond_7

    .line 70
    .line 71
    invoke-virtual {v11, v7}, La/fet;->g(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_6

    .line 76
    .line 77
    const/16 v3, 0x800

    .line 78
    .line 79
    goto :goto_4

    .line 80
    :cond_6
    const/16 v3, 0x400

    .line 81
    .line 82
    :goto_4
    or-int/2addr v2, v3

    .line 83
    :cond_7
    and-int/lit16 v3, v0, 0x6000

    .line 84
    .line 85
    if-nez v3, :cond_9

    .line 86
    .line 87
    move-object/from16 v3, p2

    .line 88
    .line 89
    invoke-virtual {v11, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_8

    .line 94
    .line 95
    const/16 v6, 0x4000

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    const/16 v6, 0x2000

    .line 99
    .line 100
    :goto_5
    or-int/2addr v2, v6

    .line 101
    goto :goto_6

    .line 102
    :cond_9
    move-object/from16 v3, p2

    .line 103
    .line 104
    :goto_6
    and-int/lit16 v6, v2, 0x2493

    .line 105
    .line 106
    const/16 v8, 0x2492

    .line 107
    .line 108
    const/4 v9, 0x0

    .line 109
    const/4 v14, 0x1

    .line 110
    if-eq v6, v8, :cond_a

    .line 111
    .line 112
    move v6, v14

    .line 113
    goto :goto_7

    .line 114
    :cond_a
    move v6, v9

    .line 115
    :goto_7
    and-int/lit8 v8, v2, 0x1

    .line 116
    .line 117
    invoke-virtual {v11, v8, v6}, La/fet;->U(IZ)Z

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-eqz v6, :cond_c

    .line 122
    .line 123
    sget-object v6, La/qmk;->a:La/zcl;

    .line 124
    .line 125
    const/high16 v6, 0x42200000    # 40.0f

    .line 126
    .line 127
    sget v8, La/k9m;->a:F

    .line 128
    .line 129
    invoke-static {v1, v8, v6}, La/o7k0;->p(La/mm40;FF)La/mm40;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    sget-object v8, La/qmk;->g:La/zcl;

    .line 134
    .line 135
    sget-object v10, La/vgg0;->a:La/ugg0;

    .line 136
    .line 137
    new-instance v10, La/ugg0;

    .line 138
    .line 139
    invoke-direct {v10, v8, v8, v8, v8}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 140
    .line 141
    .line 142
    invoke-static {v6, v10}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    sget-object v8, La/s6t0;->a:La/pz40;

    .line 147
    .line 148
    sget-object v8, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 149
    .line 150
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 151
    .line 152
    .line 153
    move-result-wide v12

    .line 154
    const/high16 v8, 0x3f800000    # 1.0f

    .line 155
    .line 156
    invoke-static {v6, v8, v12, v13, v10}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    sget-object v8, La/gqw0;->e:La/zx7;

    .line 161
    .line 162
    invoke-static {v8, v9}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    iget-wide v9, v11, La/fet;->T:J

    .line 167
    .line 168
    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    .line 169
    .line 170
    .line 171
    move-result v9

    .line 172
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 173
    .line 174
    .line 175
    move-result-object v10

    .line 176
    invoke-static {v11, v6}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 177
    .line 178
    .line 179
    move-result-object v6

    .line 180
    sget-object v12, La/mkd;->c0:La/gqw0;

    .line 181
    .line 182
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v11}, La/fet;->i0()V

    .line 186
    .line 187
    .line 188
    iget-boolean v12, v11, La/fet;->S:Z

    .line 189
    .line 190
    if-eqz v12, :cond_b

    .line 191
    .line 192
    sget-object v12, La/e7z;->u1:La/pcy;

    .line 193
    .line 194
    invoke-virtual {v11, v12}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 195
    .line 196
    .line 197
    goto :goto_8

    .line 198
    :cond_b
    invoke-virtual {v11}, La/fet;->r0()V

    .line 199
    .line 200
    .line 201
    :goto_8
    sget-object v12, La/gqw0;->x:La/shd;

    .line 202
    .line 203
    invoke-static {v11, v8, v12}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 204
    .line 205
    .line 206
    sget-object v8, La/gqw0;->w:La/shd;

    .line 207
    .line 208
    invoke-static {v11, v10, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 212
    .line 213
    .line 214
    move-result-object v8

    .line 215
    sget-object v9, La/gqw0;->y:La/shd;

    .line 216
    .line 217
    invoke-static {v11, v8, v9}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 218
    .line 219
    .line 220
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 221
    .line 222
    .line 223
    sget-object v8, La/gqw0;->v:La/shd;

    .line 224
    .line 225
    invoke-static {v11, v6, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 226
    .line 227
    .line 228
    sget-object v6, La/jm40;->b:La/jm40;

    .line 229
    .line 230
    const/high16 v8, 0x42000000    # 32.0f

    .line 231
    .line 232
    invoke-static {v6, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 233
    .line 234
    .line 235
    move-result-object v9

    .line 236
    const/high16 v10, 0x41000000    # 8.0f

    .line 237
    .line 238
    invoke-static {v10}, La/vgg0;->a(F)La/ugg0;

    .line 239
    .line 240
    .line 241
    move-result-object v12

    .line 242
    invoke-static {v9, v12}, La/lgb;->J(La/mm40;La/yjj0;)La/mm40;

    .line 243
    .line 244
    .line 245
    move-result-object v9

    .line 246
    invoke-static {v6, v8}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    sget-object v8, La/m8m0;->a:La/zfn;

    .line 251
    .line 252
    invoke-virtual {v11, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v8

    .line 256
    check-cast v8, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 257
    .line 258
    invoke-virtual {v8}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 259
    .line 260
    .line 261
    move-result-wide v12

    .line 262
    invoke-static {v10}, La/vgg0;->a(F)La/ugg0;

    .line 263
    .line 264
    .line 265
    move-result-object v8

    .line 266
    invoke-static {v6, v12, v13, v8}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    const/high16 v8, 0x40800000    # 4.0f

    .line 271
    .line 272
    invoke-static {v6, v8}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 273
    .line 274
    .line 275
    move-result-object v6

    .line 276
    move v8, v2

    .line 277
    move-object v2, v9

    .line 278
    sget-object v9, La/gqw0;->A:La/pge;

    .line 279
    .line 280
    shl-int/lit8 v10, v8, 0x3

    .line 281
    .line 282
    and-int/lit16 v12, v10, 0x380

    .line 283
    .line 284
    const/high16 v13, 0xc00000

    .line 285
    .line 286
    or-int/2addr v12, v13

    .line 287
    and-int/lit16 v10, v10, 0x1c00

    .line 288
    .line 289
    or-int/2addr v10, v12

    .line 290
    const v12, 0xe000

    .line 291
    .line 292
    .line 293
    and-int/2addr v12, v8

    .line 294
    or-int/2addr v10, v12

    .line 295
    const/high16 v12, 0x70000

    .line 296
    .line 297
    shl-int/lit8 v8, v8, 0x6

    .line 298
    .line 299
    and-int/2addr v8, v12

    .line 300
    or-int v12, v10, v8

    .line 301
    .line 302
    const/16 v13, 0x140

    .line 303
    .line 304
    const/4 v8, 0x0

    .line 305
    const/4 v10, 0x0

    .line 306
    move-object v15, v6

    .line 307
    move-object v6, v3

    .line 308
    move-object v3, v15

    .line 309
    invoke-static/range {v2 .. v13}, La/rq8;->b(La/mm40;La/mm40;La/o0x;ILa/y3d;La/y3d;La/u12;La/qge;La/a4x;La/fet;II)V

    .line 310
    .line 311
    .line 312
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 313
    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 317
    .line 318
    .line 319
    :goto_9
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 320
    .line 321
    .line 322
    move-result-object v6

    .line 323
    if-eqz v6, :cond_d

    .line 324
    .line 325
    new-instance v0, La/ikl;

    .line 326
    .line 327
    const/16 v5, 0xe

    .line 328
    .line 329
    move-object/from16 v2, p1

    .line 330
    .line 331
    move-object/from16 v3, p2

    .line 332
    .line 333
    move/from16 v4, p4

    .line 334
    .line 335
    invoke-direct/range {v0 .. v5}, La/ikl;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 336
    .line 337
    .line 338
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 339
    .line 340
    :cond_d
    return-void
.end method
