.class public abstract La/kbm;
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
    sput v0, La/kbm;->a:F

    .line 6
    .line 7
    return-void
.end method

.method public static final a(La/mm40;La/lbm;La/fet;I)V
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const v3, 0x5b97f19d

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2, v3}, La/fet;->g0(I)La/fet;

    .line 14
    .line 15
    .line 16
    and-int/lit8 v3, p3, 0x6

    .line 17
    .line 18
    if-nez v3, :cond_1

    .line 19
    .line 20
    invoke-virtual {v2, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-eqz v3, :cond_0

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/4 v3, 0x2

    .line 29
    :goto_0
    or-int v3, p3, v3

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move/from16 v3, p3

    .line 33
    .line 34
    :goto_1
    and-int/lit8 v4, p3, 0x30

    .line 35
    .line 36
    if-nez v4, :cond_3

    .line 37
    .line 38
    invoke-virtual {v2, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_2

    .line 43
    .line 44
    const/16 v4, 0x20

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_2
    const/16 v4, 0x10

    .line 48
    .line 49
    :goto_2
    or-int/2addr v3, v4

    .line 50
    :cond_3
    and-int/lit8 v4, v3, 0x13

    .line 51
    .line 52
    const/16 v5, 0x12

    .line 53
    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x1

    .line 56
    if-eq v4, v5, :cond_4

    .line 57
    .line 58
    move v4, v7

    .line 59
    goto :goto_3

    .line 60
    :cond_4
    move v4, v6

    .line 61
    :goto_3
    and-int/2addr v3, v7

    .line 62
    invoke-virtual {v2, v3, v4}, La/fet;->U(IZ)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-eqz v3, :cond_7

    .line 67
    .line 68
    sget v3, La/kbm;->a:F

    .line 69
    .line 70
    invoke-static {v0, v3}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 71
    .line 72
    .line 73
    move-result-object v3

    .line 74
    sget-object v4, La/qmk;->a:La/zcl;

    .line 75
    .line 76
    sget-object v4, La/m8m0;->a:La/zfn;

    .line 77
    .line 78
    invoke-virtual {v2, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    check-cast v5, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 83
    .line 84
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 85
    .line 86
    .line 87
    move-result-wide v8

    .line 88
    sget-object v5, La/qmk;->g:La/zcl;

    .line 89
    .line 90
    sget-object v10, La/vgg0;->a:La/ugg0;

    .line 91
    .line 92
    new-instance v10, La/ugg0;

    .line 93
    .line 94
    invoke-direct {v10, v5, v5, v5, v5}, La/cne;-><init>(La/ene;La/ene;La/ene;La/ene;)V

    .line 95
    .line 96
    .line 97
    const/high16 v5, 0x3f800000    # 1.0f

    .line 98
    .line 99
    invoke-static {v3, v5, v8, v9, v10}, La/i120;->S(La/mm40;FJLa/yjj0;)La/mm40;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    const/high16 v5, 0x40800000    # 4.0f

    .line 104
    .line 105
    invoke-static {v3, v5}, La/s5x0;->J(La/mm40;F)La/mm40;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    sget-object v5, La/gqw0;->e:La/zx7;

    .line 110
    .line 111
    invoke-static {v5, v6}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 112
    .line 113
    .line 114
    move-result-object v5

    .line 115
    iget-wide v8, v2, La/fet;->T:J

    .line 116
    .line 117
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    invoke-virtual {v2}, La/fet;->m()La/bh90;

    .line 122
    .line 123
    .line 124
    move-result-object v9

    .line 125
    invoke-static {v2, v3}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    sget-object v10, La/mkd;->c0:La/gqw0;

    .line 130
    .line 131
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, La/fet;->i0()V

    .line 135
    .line 136
    .line 137
    iget-boolean v10, v2, La/fet;->S:Z

    .line 138
    .line 139
    if-eqz v10, :cond_5

    .line 140
    .line 141
    sget-object v10, La/e7z;->u1:La/pcy;

    .line 142
    .line 143
    invoke-virtual {v2, v10}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 144
    .line 145
    .line 146
    goto :goto_4

    .line 147
    :cond_5
    invoke-virtual {v2}, La/fet;->r0()V

    .line 148
    .line 149
    .line 150
    :goto_4
    sget-object v10, La/gqw0;->x:La/shd;

    .line 151
    .line 152
    invoke-static {v2, v5, v10}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 153
    .line 154
    .line 155
    sget-object v5, La/gqw0;->w:La/shd;

    .line 156
    .line 157
    invoke-static {v2, v9, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 158
    .line 159
    .line 160
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 161
    .line 162
    .line 163
    move-result-object v5

    .line 164
    sget-object v8, La/gqw0;->y:La/shd;

    .line 165
    .line 166
    invoke-static {v2, v5, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 167
    .line 168
    .line 169
    invoke-static {v2}, La/jpm0;->n(La/fet;)V

    .line 170
    .line 171
    .line 172
    sget-object v5, La/gqw0;->v:La/shd;

    .line 173
    .line 174
    invoke-static {v2, v3, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 175
    .line 176
    .line 177
    iget-object v3, v1, La/lbm;->a:Ljava/lang/String;

    .line 178
    .line 179
    sget-object v5, La/j1t0;->e:La/zfn;

    .line 180
    .line 181
    invoke-virtual {v2, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    check-cast v5, La/g1t0;

    .line 186
    .line 187
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-static {}, La/g1t0;->m()La/y9q0;

    .line 191
    .line 192
    .line 193
    move-result-object v22

    .line 194
    sget-wide v9, La/qmk;->p:J

    .line 195
    .line 196
    sget-wide v11, La/qmk;->r:J

    .line 197
    .line 198
    sget-wide v13, La/qmk;->n:J

    .line 199
    .line 200
    new-instance v8, La/n05;

    .line 201
    .line 202
    invoke-direct/range {v8 .. v14}, La/n05;-><init>(JJJ)V

    .line 203
    .line 204
    .line 205
    iget-boolean v5, v1, La/lbm;->b:Z

    .line 206
    .line 207
    if-eqz v5, :cond_6

    .line 208
    .line 209
    const v5, 0x1f9dde8a

    .line 210
    .line 211
    .line 212
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v4

    .line 219
    check-cast v4, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 220
    .line 221
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite60-0d7_KjU()J

    .line 222
    .line 223
    .line 224
    move-result-wide v4

    .line 225
    :goto_5
    invoke-virtual {v2, v6}, La/fet;->r(Z)V

    .line 226
    .line 227
    .line 228
    goto :goto_6

    .line 229
    :cond_6
    const v5, 0x1f9de32a

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2, v5}, La/fet;->e0(I)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    check-cast v4, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 240
    .line 241
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite10-0d7_KjU()J

    .line 242
    .line 243
    .line 244
    move-result-wide v4

    .line 245
    goto :goto_5

    .line 246
    :goto_6
    new-instance v14, La/f2q0;

    .line 247
    .line 248
    const/4 v6, 0x3

    .line 249
    invoke-direct {v14, v6}, La/f2q0;-><init>(I)V

    .line 250
    .line 251
    .line 252
    const/16 v25, 0x6180

    .line 253
    .line 254
    const v26, 0x1abf2

    .line 255
    .line 256
    .line 257
    move-object v2, v3

    .line 258
    const/4 v3, 0x0

    .line 259
    move v9, v7

    .line 260
    move-object v6, v8

    .line 261
    const-wide/16 v7, 0x0

    .line 262
    .line 263
    move v10, v9

    .line 264
    const/4 v9, 0x0

    .line 265
    move v11, v10

    .line 266
    const/4 v10, 0x0

    .line 267
    move v12, v11

    .line 268
    const/4 v11, 0x0

    .line 269
    move v15, v12

    .line 270
    const-wide/16 v12, 0x0

    .line 271
    .line 272
    move/from16 v17, v15

    .line 273
    .line 274
    const-wide/16 v15, 0x0

    .line 275
    .line 276
    move/from16 v18, v17

    .line 277
    .line 278
    const/16 v17, 0x2

    .line 279
    .line 280
    move/from16 v19, v18

    .line 281
    .line 282
    const/16 v18, 0x0

    .line 283
    .line 284
    move/from16 v20, v19

    .line 285
    .line 286
    const/16 v19, 0x1

    .line 287
    .line 288
    move/from16 v21, v20

    .line 289
    .line 290
    const/16 v20, 0x0

    .line 291
    .line 292
    move/from16 v23, v21

    .line 293
    .line 294
    const/16 v21, 0x0

    .line 295
    .line 296
    const/16 v24, 0x0

    .line 297
    .line 298
    move/from16 v0, v23

    .line 299
    .line 300
    move-object/from16 v23, p2

    .line 301
    .line 302
    invoke-static/range {v2 .. v26}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 303
    .line 304
    .line 305
    move-object/from16 v2, v23

    .line 306
    .line 307
    invoke-virtual {v2, v0}, La/fet;->r(Z)V

    .line 308
    .line 309
    .line 310
    goto :goto_7

    .line 311
    :cond_7
    invoke-virtual {v2}, La/fet;->X()V

    .line 312
    .line 313
    .line 314
    :goto_7
    invoke-virtual {v2}, La/fet;->u()La/yfe0;

    .line 315
    .line 316
    .line 317
    move-result-object v0

    .line 318
    if-eqz v0, :cond_8

    .line 319
    .line 320
    new-instance v2, La/kkl;

    .line 321
    .line 322
    const/16 v3, 0x16

    .line 323
    .line 324
    move-object/from16 v4, p0

    .line 325
    .line 326
    move/from16 v5, p3

    .line 327
    .line 328
    invoke-direct {v2, v4, v1, v5, v3}, La/kkl;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 329
    .line 330
    .line 331
    iput-object v2, v0, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 332
    .line 333
    :cond_8
    return-void
.end method
