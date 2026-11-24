.class public abstract La/wfp;
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
    const/4 v1, 0x2

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
    sput-object v1, La/wfp;->a:La/zfn;

    .line 14
    .line 15
    return-void
.end method

.method public static final a(La/mm40;La/zfp;Lkotlin/jvm/functions/Function2;La/fet;I)V
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
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    const v0, 0x45112163

    .line 16
    .line 17
    .line 18
    invoke-virtual {v11, v0}, La/fet;->g0(I)La/fet;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v11, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    const/4 v0, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x2

    .line 30
    :goto_0
    or-int v0, p4, v0

    .line 31
    .line 32
    invoke-virtual {v11, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    const/16 v5, 0x20

    .line 37
    .line 38
    if-eqz v4, :cond_1

    .line 39
    .line 40
    move v4, v5

    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const/16 v4, 0x10

    .line 43
    .line 44
    :goto_1
    or-int/2addr v0, v4

    .line 45
    invoke-virtual {v11, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/16 v6, 0x100

    .line 50
    .line 51
    if-eqz v4, :cond_2

    .line 52
    .line 53
    move v4, v6

    .line 54
    goto :goto_2

    .line 55
    :cond_2
    const/16 v4, 0x80

    .line 56
    .line 57
    :goto_2
    or-int/2addr v0, v4

    .line 58
    and-int/lit16 v4, v0, 0x93

    .line 59
    .line 60
    const/16 v7, 0x92

    .line 61
    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v14, 0x1

    .line 64
    if-eq v4, v7, :cond_3

    .line 65
    .line 66
    move v4, v14

    .line 67
    goto :goto_3

    .line 68
    :cond_3
    move v4, v8

    .line 69
    :goto_3
    and-int/lit8 v7, v0, 0x1

    .line 70
    .line 71
    invoke-virtual {v11, v7, v4}, La/fet;->U(IZ)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_c

    .line 76
    .line 77
    iget-boolean v4, v2, La/zfp;->b:Z

    .line 78
    .line 79
    invoke-virtual {v11, v4}, La/fet;->h(Z)Z

    .line 80
    .line 81
    .line 82
    move-result v7

    .line 83
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    sget-object v10, La/ukd;->a:La/cl5;

    .line 88
    .line 89
    if-nez v7, :cond_4

    .line 90
    .line 91
    if-ne v9, v10, :cond_6

    .line 92
    .line 93
    :cond_4
    if-eqz v4, :cond_5

    .line 94
    .line 95
    new-instance v4, La/u9p;

    .line 96
    .line 97
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 98
    .line 99
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 100
    .line 101
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 102
    .line 103
    .line 104
    move-result-wide v12

    .line 105
    const/high16 v7, 0x3f800000    # 1.0f

    .line 106
    .line 107
    const v9, 0x7f08090a

    .line 108
    .line 109
    .line 110
    invoke-direct {v4, v7, v9, v12, v13}, La/u9p;-><init>(FIJ)V

    .line 111
    .line 112
    .line 113
    :goto_4
    move-object v9, v4

    .line 114
    goto :goto_5

    .line 115
    :cond_5
    new-instance v4, La/u9p;

    .line 116
    .line 117
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 118
    .line 119
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 120
    .line 121
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 122
    .line 123
    .line 124
    move-result-wide v12

    .line 125
    const v7, 0x3f19999a    # 0.6f

    .line 126
    .line 127
    .line 128
    const v9, 0x7f08090b

    .line 129
    .line 130
    .line 131
    invoke-direct {v4, v7, v9, v12, v13}, La/u9p;-><init>(FIJ)V

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
    check-cast v9, La/u9p;

    .line 139
    .line 140
    sget-object v4, La/wfp;->a:La/zfn;

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
    move-result-object v4

    .line 154
    iget v7, v9, La/u9p;->c:F

    .line 155
    .line 156
    invoke-static {v4, v7}, La/epv0;->N(La/mm40;F)La/mm40;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    sget-object v7, La/zaq0;->b:La/zfn;

    .line 161
    .line 162
    invoke-virtual {v11, v7}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v7

    .line 166
    check-cast v7, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 167
    .line 168
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 169
    .line 170
    .line 171
    move-result-wide v12

    .line 172
    sget-object v7, La/qmk;->a:La/zcl;

    .line 173
    .line 174
    const/high16 v7, 0x43b40000    # 360.0f

    .line 175
    .line 176
    invoke-static {v7}, La/vgg0;->a(F)La/ugg0;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    invoke-static {v4, v12, v13, v7}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 181
    .line 182
    .line 183
    move-result-object v15

    .line 184
    and-int/lit16 v4, v0, 0x380

    .line 185
    .line 186
    if-ne v4, v6, :cond_7

    .line 187
    .line 188
    move v4, v14

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    move v4, v8

    .line 191
    :goto_6
    and-int/lit8 v0, v0, 0x70

    .line 192
    .line 193
    if-eq v0, v5, :cond_8

    .line 194
    .line 195
    move v0, v8

    .line 196
    goto :goto_7

    .line 197
    :cond_8
    move v0, v14

    .line 198
    :goto_7
    or-int/2addr v0, v4

    .line 199
    invoke-virtual {v11}, La/fet;->P()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v4

    .line 203
    const/4 v5, 0x6

    .line 204
    if-nez v0, :cond_9

    .line 205
    .line 206
    if-ne v4, v10, :cond_a

    .line 207
    .line 208
    :cond_9
    new-instance v4, La/gmo;

    .line 209
    .line 210
    invoke-direct {v4, v3, v2, v5}, La/gmo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v11, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    :cond_a
    move-object/from16 v20, v4

    .line 217
    .line 218
    check-cast v20, Lkotlin/jvm/functions/Function0;

    .line 219
    .line 220
    const/16 v21, 0x1c

    .line 221
    .line 222
    const/16 v16, 0x0

    .line 223
    .line 224
    const/16 v17, 0x0

    .line 225
    .line 226
    const/16 v18, 0x0

    .line 227
    .line 228
    const/16 v19, 0x0

    .line 229
    .line 230
    invoke-static/range {v15 .. v21}, La/y860;->W(La/mm40;La/gy40;La/d6x;ZLa/ucg0;Lkotlin/jvm/functions/Function0;I)La/mm40;

    .line 231
    .line 232
    .line 233
    move-result-object v0

    .line 234
    sget-object v4, La/gqw0;->e:La/zx7;

    .line 235
    .line 236
    invoke-static {v4, v8}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    iget-wide v6, v11, La/fet;->T:J

    .line 241
    .line 242
    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    .line 243
    .line 244
    .line 245
    move-result v6

    .line 246
    invoke-virtual {v11}, La/fet;->m()La/bh90;

    .line 247
    .line 248
    .line 249
    move-result-object v7

    .line 250
    invoke-static {v11, v0}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    sget-object v8, La/mkd;->c0:La/gqw0;

    .line 255
    .line 256
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v11}, La/fet;->i0()V

    .line 260
    .line 261
    .line 262
    iget-boolean v8, v11, La/fet;->S:Z

    .line 263
    .line 264
    if-eqz v8, :cond_b

    .line 265
    .line 266
    sget-object v8, La/e7z;->u1:La/pcy;

    .line 267
    .line 268
    invoke-virtual {v11, v8}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 269
    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_b
    invoke-virtual {v11}, La/fet;->r0()V

    .line 273
    .line 274
    .line 275
    :goto_8
    sget-object v8, La/gqw0;->x:La/shd;

    .line 276
    .line 277
    invoke-static {v11, v4, v8}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 278
    .line 279
    .line 280
    sget-object v4, La/gqw0;->w:La/shd;

    .line 281
    .line 282
    invoke-static {v11, v7, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 283
    .line 284
    .line 285
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    sget-object v6, La/gqw0;->y:La/shd;

    .line 290
    .line 291
    invoke-static {v11, v4, v6}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 292
    .line 293
    .line 294
    invoke-static {v11}, La/jpm0;->n(La/fet;)V

    .line 295
    .line 296
    .line 297
    sget-object v4, La/gqw0;->v:La/shd;

    .line 298
    .line 299
    invoke-static {v11, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 300
    .line 301
    .line 302
    sget-object v0, La/jm40;->b:La/jm40;

    .line 303
    .line 304
    const/high16 v4, 0x41800000    # 16.0f

    .line 305
    .line 306
    invoke-static {v0, v4}, La/o7k0;->n(La/mm40;F)La/mm40;

    .line 307
    .line 308
    .line 309
    move-result-object v6

    .line 310
    iget v0, v9, La/u9p;->a:I

    .line 311
    .line 312
    invoke-static {v0, v5, v11}, La/jpm0;->t(IILa/fet;)La/r2x;

    .line 313
    .line 314
    .line 315
    move-result-object v0

    .line 316
    invoke-static {v0, v11}, La/iom0;->r(La/r2x;La/fet;)La/s4u0;

    .line 317
    .line 318
    .line 319
    move-result-object v4

    .line 320
    sget-object v0, La/m8m0;->a:La/zfn;

    .line 321
    .line 322
    invoke-virtual {v11, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    check-cast v0, Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 327
    .line 328
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getWhite-0d7_KjU()J

    .line 329
    .line 330
    .line 331
    move-result-wide v7

    .line 332
    new-instance v10, La/m78;

    .line 333
    .line 334
    const/4 v0, 0x5

    .line 335
    invoke-direct {v10, v7, v8, v0}, La/m78;-><init>(JI)V

    .line 336
    .line 337
    .line 338
    const/16 v12, 0x38

    .line 339
    .line 340
    const/16 v13, 0x38

    .line 341
    .line 342
    const/4 v5, 0x0

    .line 343
    const/4 v7, 0x0

    .line 344
    const/4 v8, 0x0

    .line 345
    const/4 v9, 0x0

    .line 346
    invoke-static/range {v4 .. v13}, La/j0x;->b(La/pm80;Ljava/lang/String;La/mm40;La/u12;La/qge;FLa/a4d;La/fet;II)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v11, v14}, La/fet;->r(Z)V

    .line 350
    .line 351
    .line 352
    goto :goto_9

    .line 353
    :cond_c
    invoke-virtual {v11}, La/fet;->X()V

    .line 354
    .line 355
    .line 356
    :goto_9
    invoke-virtual {v11}, La/fet;->u()La/yfe0;

    .line 357
    .line 358
    .line 359
    move-result-object v6

    .line 360
    if-eqz v6, :cond_d

    .line 361
    .line 362
    new-instance v0, La/ann;

    .line 363
    .line 364
    const/16 v5, 0x10

    .line 365
    .line 366
    move/from16 v4, p4

    .line 367
    .line 368
    invoke-direct/range {v0 .. v5}, La/ann;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 369
    .line 370
    .line 371
    iput-object v0, v6, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 372
    .line 373
    :cond_d
    return-void
.end method
