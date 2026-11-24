.class public abstract La/yfp;
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
    const/4 v1, 0x4

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
    sput-object v1, La/yfp;->a:La/zfn;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/mm40;La/z4a0;Lkotlin/jvm/functions/Function2;La/fet;I)V
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
    const v0, 0x2178211b

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
    iget-boolean v4, v2, La/z4a0;->c:Z

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
    new-instance v4, La/w9p;

    .line 93
    .line 94
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 95
    .line 96
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 97
    .line 98
    .line 99
    move-result-object v7

    .line 100
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 101
    .line 102
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 103
    .line 104
    .line 105
    move-result-wide v12

    .line 106
    const v7, 0x7f08090a

    .line 107
    .line 108
    .line 109
    invoke-direct {v4, v7, v12, v13}, La/w9p;-><init>(IJ)V

    .line 110
    .line 111
    .line 112
    :goto_4
    move-object v9, v4

    .line 113
    goto :goto_5

    .line 114
    :cond_5
    new-instance v4, La/w9p;

    .line 115
    .line 116
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 117
    .line 118
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 123
    .line 124
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 125
    .line 126
    .line 127
    move-result-wide v12

    .line 128
    const v7, 0x7f08090b

    .line 129
    .line 130
    .line 131
    invoke-direct {v4, v7, v12, v13}, La/w9p;-><init>(IJ)V

    .line 132
    .line 133
    .line 134
    goto :goto_4

    .line 135
    :goto_5
    invoke-virtual {v11, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    :cond_6
    check-cast v9, La/w9p;

    .line 139
    .line 140
    sget-object v4, La/yfp;->a:La/zfn;

    .line 141
    .line 142
    invoke-virtual {v11, v4}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v4

    .line 146
    check-cast v4, La/ycl;

    .line 147
    .line 148
    iget v4, v4, La/ycl;->a:F

    .line 149
    .line 150
    invoke-static {v1, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v15

    .line 154
    and-int/lit16 v4, v0, 0x380

    .line 155
    .line 156
    if-ne v4, v6, :cond_7

    .line 157
    .line 158
    move v4, v14

    .line 159
    goto :goto_6

    .line 160
    :cond_7
    move v4, v8

    .line 161
    :goto_6
    and-int/lit8 v0, v0, 0x70

    .line 162
    .line 163
    if-ne v0, v5, :cond_8

    .line 164
    .line 165
    move v0, v14

    .line 166
    goto :goto_7

    .line 167
    :cond_8
    move v0, v8

    .line 168
    :goto_7
    or-int/2addr v0, v4

    .line 169
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v4

    .line 173
    if-nez v0, :cond_9

    .line 174
    .line 175
    if-ne v4, v10, :cond_a

    .line 176
    .line 177
    :cond_9
    new-instance v4, La/gmo;

    .line 178
    .line 179
    const/16 v0, 0x8

    .line 180
    .line 181
    invoke-direct {v4, v3, v2, v0}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :cond_a
    move-object/from16 v20, v4

    .line 188
    .line 189
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 190
    .line 191
    const/16 v21, 0x1c

    .line 192
    .line 193
    const/16 v16, 0x0

    .line 194
    .line 195
    const/16 v17, 0x0

    .line 196
    .line 197
    const/16 v18, 0x0

    .line 198
    .line 199
    const/16 v19, 0x0

    .line 200
    .line 201
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 206
    .line 207
    invoke-static {v4, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 208
    .line 209
    .line 210
    move-result-object v4

    .line 211
    iget-wide v5, v11, La/fet;->T:J

    .line 212
    .line 213
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 222
    .line 223
    .line 224
    move-result-object v0

    .line 225
    sget-object v7, La/mkd;->c0:La/gqw0;

    .line 226
    .line 227
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v11}, La/fet;->i0()V

    .line 231
    .line 232
    .line 233
    iget-boolean v7, v11, La/fet;->S:Z

    .line 234
    .line 235
    if-eqz v7, :cond_b

    .line 236
    .line 237
    sget-object v7, La/e7z;->u1:La/pcy;

    .line 238
    .line 239
    invoke-virtual {v11, v7}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 240
    .line 241
    .line 242
    goto :goto_8

    .line 243
    :cond_b
    invoke-virtual {v11}, La/fet;->r0()V

    .line 244
    .line 245
    .line 246
    :goto_8
    sget-object v7, La/gqw0;->x:La/shd;

    .line 247
    .line 248
    invoke-static {v11, v4, v7}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 249
    .line 250
    .line 251
    sget-object v4, La/gqw0;->w:La/shd;

    .line 252
    .line 253
    invoke-static {v11, v6, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 254
    .line 255
    .line 256
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 257
    .line 258
    .line 259
    move-result-object v4

    .line 260
    sget-object v5, La/gqw0;->y:La/shd;

    .line 261
    .line 262
    invoke-static {v11, v4, v5}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 263
    .line 264
    .line 265
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 266
    .line 267
    .line 268
    sget-object v4, La/gqw0;->v:La/shd;

    .line 269
    .line 270
    invoke-static {v11, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 271
    .line 272
    .line 273
    sget-object v0, La/qmk;->a:La/zcl;

    .line 274
    .line 275
    const/high16 v0, 0x41a00000    # 20.0f

    .line 276
    .line 277
    sget-object v4, La/jm40;->b:La/jm40;

    .line 278
    .line 279
    invoke-static {v4, v0}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 280
    .line 281
    .line 282
    move-result-object v6

    .line 283
    iget v0, v9, La/w9p;->a:I

    .line 284
    .line 285
    const/4 v4, 0x6

    .line 286
    invoke-static {v0, v4, v11}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {v0, v11}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 291
    .line 292
    .line 293
    move-result-object v4

    .line 294
    sget-object v0, La/zaq0;->b:La/zfn;

    .line 295
    .line 296
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    check-cast v0, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 301
    .line 302
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 303
    .line 304
    .line 305
    move-result-wide v7

    .line 306
    new-instance v10, La/m78;

    .line 307
    .line 308
    const/4 v0, 0x5

    .line 309
    invoke-direct {v10, v7, v8, v0}, La/m78;-><init>(JI)V

    .line 310
    .line 311
    .line 312
    const/16 v12, 0x38

    .line 313
    .line 314
    const/16 v13, 0x38

    .line 315
    .line 316
    const/4 v5, 0x0

    .line 317
    const/4 v7, 0x0

    .line 318
    const/4 v8, 0x0

    .line 319
    const/4 v9, 0x0

    .line 320
    invoke-static/range {v4 .. v13}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 321
    .line 322
    .line 323
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 324
    .line 325
    .line 326
    goto :goto_9

    .line 327
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 328
    .line 329
    .line 330
    :goto_9
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 331
    .line 332
    .line 333
    move-result-object v6

    .line 334
    if-eqz v6, :cond_d

    .line 335
    .line 336
    new-instance v0, La/ann;

    .line 337
    .line 338
    const/16 v5, 0x12

    .line 339
    .line 340
    move/from16 v4, p4

    .line 341
    .line 342
    invoke-direct/range {v0 .. v5}, La/ann;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 343
    .line 344
    .line 345
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 346
    .line 347
    :cond_d
    return-void
.end method
