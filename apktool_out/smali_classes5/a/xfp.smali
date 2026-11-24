.class public abstract La/xfp;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/zfn;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/dfp;

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    invoke-direct {v0, v1}, La/dfp;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/zfn;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    invoke-direct {v1, v0, v2}, La/zfn;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 11
    .line 12
    .line 13
    sput-object v1, La/xfp;->a:La/zfn;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/mm40;La/y4a0;Lkotlin/jvm/functions/Function2;La/fet;I)V
    .locals 22

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
    move-object/from16 v11, p3

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const v0, -0x6e7c06e9

    .line 13
    .line 14
    .line 15
    invoke-virtual {v11, v0}, La/fet;->g0(I)La/fet;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x2

    .line 27
    :goto_0
    or-int v0, p4, v0

    .line 28
    .line 29
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    const/16 v5, 0x20

    .line 34
    .line 35
    if-eqz v4, :cond_1

    .line 36
    .line 37
    move v4, v5

    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const/16 v4, 0x10

    .line 40
    .line 41
    :goto_1
    or-int/2addr v0, v4

    .line 42
    invoke-virtual {v11, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v4

    .line 46
    const/16 v6, 0x100

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    move v4, v6

    .line 51
    goto :goto_2

    .line 52
    :cond_2
    const/16 v4, 0x80

    .line 53
    .line 54
    :goto_2
    or-int/2addr v0, v4

    .line 55
    and-int/lit16 v4, v0, 0x93

    .line 56
    .line 57
    const/16 v7, 0x92

    .line 58
    .line 59
    const/4 v8, 0x0

    .line 60
    const/4 v14, 0x1

    .line 61
    if-eq v4, v7, :cond_3

    .line 62
    .line 63
    move v4, v14

    .line 64
    goto :goto_3

    .line 65
    :cond_3
    move v4, v8

    .line 66
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 67
    .line 68
    invoke-virtual {v11, v7, v4}, La/fet;->U(IZ)Z

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-eqz v4, :cond_c

    .line 73
    .line 74
    iget-boolean v4, v2, La/y4a0;->c:Z

    .line 75
    .line 76
    invoke-virtual {v11, v4}, La/fet;->h(Z)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    sget-object v10, La/ukd;->a:La/cl5;

    .line 85
    .line 86
    if-nez v7, :cond_4

    .line 87
    .line 88
    if-ne v9, v10, :cond_6

    .line 89
    .line 90
    :cond_4
    if-eqz v4, :cond_5

    .line 91
    .line 92
    new-instance v4, La/v9p;

    .line 93
    .line 94
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 95
    .line 96
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 97
    .line 98
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 99
    .line 100
    .line 101
    move-result-wide v12

    .line 102
    const v7, 0x7f08090a

    .line 103
    .line 104
    .line 105
    invoke-direct {v4, v7, v12, v13}, La/v9p;-><init>(IJ)V

    .line 106
    .line 107
    .line 108
    :goto_4
    move-object v9, v4

    .line 109
    goto :goto_5

    .line 110
    :cond_5
    new-instance v4, La/v9p;

    .line 111
    .line 112
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 113
    .line 114
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 115
    .line 116
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 117
    .line 118
    .line 119
    move-result-wide v12

    .line 120
    const v7, 0x7f08090b

    .line 121
    .line 122
    .line 123
    invoke-direct {v4, v7, v12, v13}, La/v9p;-><init>(IJ)V

    .line 124
    .line 125
    .line 126
    goto :goto_4

    .line 127
    :goto_5
    invoke-virtual {v11, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    :cond_6
    check-cast v9, La/v9p;

    .line 131
    .line 132
    sget-object v4, La/xfp;->a:La/zfn;

    .line 133
    .line 134
    invoke-virtual {v11, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    check-cast v4, La/ycl;

    .line 139
    .line 140
    iget v4, v4, La/ycl;->a:F

    .line 141
    .line 142
    invoke-static {v1, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 143
    .line 144
    .line 145
    move-result-object v15

    .line 146
    and-int/lit16 v4, v0, 0x380

    .line 147
    .line 148
    if-ne v4, v6, :cond_7

    .line 149
    .line 150
    move v4, v14

    .line 151
    goto :goto_6

    .line 152
    :cond_7
    move v4, v8

    .line 153
    :goto_6
    and-int/lit8 v0, v0, 0x70

    .line 154
    .line 155
    if-ne v0, v5, :cond_8

    .line 156
    .line 157
    move v0, v14

    .line 158
    goto :goto_7

    .line 159
    :cond_8
    move v0, v8

    .line 160
    :goto_7
    or-int/2addr v0, v4

    .line 161
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v4

    .line 165
    if-nez v0, :cond_9

    .line 166
    .line 167
    if-ne v4, v10, :cond_a

    .line 168
    .line 169
    :cond_9
    new-instance v4, La/gmo;

    .line 170
    .line 171
    const/4 v0, 0x7

    .line 172
    invoke-direct {v4, v3, v2, v0}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    :cond_a
    move-object/from16 v20, v4

    .line 179
    .line 180
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 181
    .line 182
    const/16 v21, 0x1c

    .line 183
    .line 184
    const/16 v16, 0x0

    .line 185
    .line 186
    const/16 v17, 0x0

    .line 187
    .line 188
    const/16 v18, 0x0

    .line 189
    .line 190
    const/16 v19, 0x0

    .line 191
    .line 192
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 193
    .line 194
    .line 195
    move-result-object v0

    .line 196
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 197
    .line 198
    invoke-static {v4, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    iget-wide v5, v11, La/fet;->T:J

    .line 203
    .line 204
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11}, La/fet;->i0()V

    .line 222
    .line 223
    .line 224
    iget-boolean v7, v11, La/fet;->S:Z

    .line 225
    .line 226
    if-eqz v7, :cond_b

    .line 227
    .line 228
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 229
    .line 230
    invoke-virtual {v11, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 231
    .line 232
    .line 233
    goto :goto_8

    .line 234
    :cond_b
    invoke-virtual {v11}, La/fet;->r0()V

    .line 235
    .line 236
    .line 237
    :goto_8
    sget-object v7, La/gqw0;->x:La/shd;

    .line 238
    .line 239
    invoke-static {v11, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 240
    .line 241
    .line 242
    sget-object v4, La/gqw0;->w:La/shd;

    .line 243
    .line 244
    invoke-static {v11, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    sget-object v5, La/gqw0;->y:La/shd;

    .line 252
    .line 253
    invoke-static {v11, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 257
    .line 258
    .line 259
    sget-object v4, La/gqw0;->v:La/shd;

    .line 260
    .line 261
    invoke-static {v11, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 262
    .line 263
    .line 264
    sget-object v0, La/qmk;->a:La/zcl;

    .line 265
    .line 266
    const/high16 v0, 0x41a00000    # 20.0f

    .line 267
    .line 268
    sget-object v4, La/jm40;->b:La/jm40;

    .line 269
    .line 270
    invoke-static {v4, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 271
    .line 272
    .line 273
    move-result-object v6

    .line 274
    iget v0, v9, La/v9p;->a:I

    .line 275
    .line 276
    const/4 v4, 0x6

    .line 277
    invoke-static {v0, v4, v11}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0, v11}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 282
    .line 283
    .line 284
    move-result-object v4

    .line 285
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 286
    .line 287
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 292
    .line 293
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 294
    .line 295
    .line 296
    move-result-wide v7

    .line 297
    new-instance v10, La/m78;

    .line 298
    .line 299
    const/4 v0, 0x5

    .line 300
    invoke-direct {v10, v7, v8, v0}, La/m78;-><init>(JI)V

    .line 301
    .line 302
    .line 303
    const/16 v12, 0x38

    .line 304
    .line 305
    const/16 v13, 0x38

    .line 306
    .line 307
    const/4 v5, 0x0

    .line 308
    const/4 v7, 0x0

    .line 309
    const/4 v8, 0x0

    .line 310
    const/4 v9, 0x0

    .line 311
    invoke-static/range {v4 .. v13}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 315
    .line 316
    .line 317
    goto :goto_9

    .line 318
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 319
    .line 320
    .line 321
    :goto_9
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 322
    .line 323
    .line 324
    move-result-object v6

    .line 325
    if-eqz v6, :cond_d

    .line 326
    .line 327
    new-instance v0, La/ann;

    .line 328
    .line 329
    const/16 v5, 0x11

    .line 330
    .line 331
    move/from16 v4, p4

    .line 332
    .line 333
    invoke-direct/range {v0 .. v5}, La/ann;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 334
    .line 335
    .line 336
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 337
    .line 338
    :cond_d
    return-void
.end method
