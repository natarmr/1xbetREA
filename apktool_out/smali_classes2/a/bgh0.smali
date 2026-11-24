.class public abstract La/bgh0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uts0;

.field public static final b:La/uts0;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, La/ihn;->a:La/zsf;

    .line 2
    .line 3
    const/16 v1, 0xfa

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    invoke-static {v1, v2, v0, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    sput-object v4, La/bgh0;->a:La/uts0;

    .line 12
    .line 13
    invoke-static {v1, v2, v0, v3}, La/ro4;->m0(IILa/ghn;I)La/uts0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/bgh0;->b:La/uts0;

    .line 18
    .line 19
    return-void
.end method

.method public static final a(La/mm40;La/a4x;La/xcz;La/sah0;La/ahh0;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 18

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v0, p3

    .line 6
    .line 7
    move-object/from16 v1, p4

    .line 8
    .line 9
    move-object/from16 v15, p5

    .line 10
    .line 11
    move-object/from16 v12, p6

    .line 12
    .line 13
    move/from16 v4, p7

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const v5, -0x597b7ec0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v12, v5}, La/fet;->g0(I)La/fet;

    .line 31
    .line 32
    .line 33
    and-int/lit8 v5, v4, 0x6

    .line 34
    .line 35
    if-nez v5, :cond_1

    .line 36
    .line 37
    move-object/from16 v5, p0

    .line 38
    .line 39
    invoke-virtual {v12, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    if-eqz v7, :cond_0

    .line 44
    .line 45
    const/4 v7, 0x4

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    const/4 v7, 0x2

    .line 48
    :goto_0
    or-int/2addr v7, v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-object/from16 v5, p0

    .line 51
    .line 52
    move v7, v4

    .line 53
    :goto_1
    and-int/lit8 v8, v4, 0x30

    .line 54
    .line 55
    if-nez v8, :cond_3

    .line 56
    .line 57
    invoke-virtual {v12, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_2

    .line 62
    .line 63
    const/16 v8, 0x20

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_2
    const/16 v8, 0x10

    .line 67
    .line 68
    :goto_2
    or-int/2addr v7, v8

    .line 69
    :cond_3
    and-int/lit16 v8, v4, 0x180

    .line 70
    .line 71
    const/16 v10, 0x100

    .line 72
    .line 73
    if-nez v8, :cond_5

    .line 74
    .line 75
    invoke-virtual {v12, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v8

    .line 79
    if-eqz v8, :cond_4

    .line 80
    .line 81
    move v8, v10

    .line 82
    goto :goto_3

    .line 83
    :cond_4
    const/16 v8, 0x80

    .line 84
    .line 85
    :goto_3
    or-int/2addr v7, v8

    .line 86
    :cond_5
    and-int/lit16 v8, v4, 0xc00

    .line 87
    .line 88
    const/16 v11, 0x800

    .line 89
    .line 90
    if-nez v8, :cond_7

    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 93
    .line 94
    .line 95
    move-result v8

    .line 96
    invoke-virtual {v12, v8}, La/fet;->e(I)Z

    .line 97
    .line 98
    .line 99
    move-result v8

    .line 100
    if-eqz v8, :cond_6

    .line 101
    .line 102
    move v8, v11

    .line 103
    goto :goto_4

    .line 104
    :cond_6
    const/16 v8, 0x400

    .line 105
    .line 106
    :goto_4
    or-int/2addr v7, v8

    .line 107
    :cond_7
    and-int/lit16 v8, v4, 0x6000

    .line 108
    .line 109
    if-nez v8, :cond_9

    .line 110
    .line 111
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 112
    .line 113
    .line 114
    move-result v8

    .line 115
    if-eqz v8, :cond_8

    .line 116
    .line 117
    const/16 v8, 0x4000

    .line 118
    .line 119
    goto :goto_5

    .line 120
    :cond_8
    const/16 v8, 0x2000

    .line 121
    .line 122
    :goto_5
    or-int/2addr v7, v8

    .line 123
    :cond_9
    const/high16 v8, 0x30000

    .line 124
    .line 125
    and-int/2addr v8, v4

    .line 126
    if-nez v8, :cond_b

    .line 127
    .line 128
    invoke-virtual {v12, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    move-result v8

    .line 132
    if-eqz v8, :cond_a

    .line 133
    .line 134
    const/high16 v8, 0x20000

    .line 135
    .line 136
    goto :goto_6

    .line 137
    :cond_a
    const/high16 v8, 0x10000

    .line 138
    .line 139
    :goto_6
    or-int/2addr v7, v8

    .line 140
    :cond_b
    const v8, 0x12493

    .line 141
    .line 142
    .line 143
    and-int/2addr v8, v7

    .line 144
    const v14, 0x12492

    .line 145
    .line 146
    .line 147
    const/16 v16, 0x0

    .line 148
    .line 149
    const/4 v13, 0x1

    .line 150
    if-eq v8, v14, :cond_c

    .line 151
    .line 152
    move v8, v13

    .line 153
    goto :goto_7

    .line 154
    :cond_c
    move/from16 v8, v16

    .line 155
    .line 156
    :goto_7
    and-int/lit8 v14, v7, 0x1

    .line 157
    .line 158
    invoke-virtual {v12, v14, v8}, La/fet;->U(IZ)Z

    .line 159
    .line 160
    .line 161
    move-result v8

    .line 162
    if-eqz v8, :cond_17

    .line 163
    .line 164
    sget-object v8, La/bmd;->q:La/zfn;

    .line 165
    .line 166
    invoke-virtual {v12, v8}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 167
    .line 168
    .line 169
    move-result-object v8

    .line 170
    check-cast v8, La/pkk0;

    .line 171
    .line 172
    iget-object v14, v3, La/xcz;->g:La/gy40;

    .line 173
    .line 174
    and-int/lit16 v9, v7, 0x1c00

    .line 175
    .line 176
    if-ne v9, v11, :cond_d

    .line 177
    .line 178
    move v9, v13

    .line 179
    goto :goto_8

    .line 180
    :cond_d
    move/from16 v9, v16

    .line 181
    .line 182
    :goto_8
    and-int/lit16 v11, v7, 0x380

    .line 183
    .line 184
    if-ne v11, v10, :cond_e

    .line 185
    .line 186
    move v10, v13

    .line 187
    goto :goto_9

    .line 188
    :cond_e
    move/from16 v10, v16

    .line 189
    .line 190
    :goto_9
    or-int/2addr v9, v10

    .line 191
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v10

    .line 195
    const/4 v11, 0x0

    .line 196
    sget-object v6, La/ukd;->a:La/cl5;

    .line 197
    .line 198
    if-nez v9, :cond_f

    .line 199
    .line 200
    if-ne v10, v6, :cond_10

    .line 201
    .line 202
    :cond_f
    new-instance v10, La/zye0;

    .line 203
    .line 204
    const/16 v9, 0x12

    .line 205
    .line 206
    invoke-direct {v10, v0, v3, v11, v9}, La/zye0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {v12, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    :cond_10
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 213
    .line 214
    invoke-static {v1, v0, v10, v12}, La/m0x0;->v(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;La/fet;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v12, v14}, La/fet;->g(Ljava/lang/Object;)Z

    .line 218
    .line 219
    .line 220
    move-result v9

    .line 221
    invoke-virtual {v12, v8}, La/fet;->g(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v10

    .line 225
    or-int/2addr v9, v10

    .line 226
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    if-nez v9, :cond_11

    .line 231
    .line 232
    if-ne v10, v6, :cond_12

    .line 233
    .line 234
    :cond_11
    new-instance v10, La/kbh0;

    .line 235
    .line 236
    invoke-direct {v10, v14, v8, v11, v13}, La/kbh0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v12, v10}, La/fet;->o0(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_12
    check-cast v10, Lkotlin/jvm/functions/Function2;

    .line 243
    .line 244
    invoke-static {v12, v14, v10}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 245
    .line 246
    .line 247
    invoke-static {v5}, La/lgb;->K(La/mm40;)La/mm40;

    .line 248
    .line 249
    .line 250
    move-result-object v8

    .line 251
    const-string v9, "LAZY_COLUMN"

    .line 252
    .line 253
    invoke-static {v8, v9}, La/o2e;->e0(La/mm40;Ljava/lang/String;)La/mm40;

    .line 254
    .line 255
    .line 256
    move-result-object v8

    .line 257
    new-instance v9, La/yzv0;

    .line 258
    .line 259
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 260
    .line 261
    .line 262
    move-result-object v10

    .line 263
    iget v10, v10, La/wfn;->c:F

    .line 264
    .line 265
    invoke-static {v12}, La/xfn;->a(La/fet;)La/wfn;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    iget v11, v11, La/wfn;->c:F

    .line 270
    .line 271
    sget-object v14, La/jr00;->b:La/zfn;

    .line 272
    .line 273
    invoke-virtual {v12, v14}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object v14

    .line 277
    check-cast v14, La/cwk;

    .line 278
    .line 279
    invoke-interface {v14}, La/cwk;->a()La/l7m0;

    .line 280
    .line 281
    .line 282
    move-result-object v14

    .line 283
    check-cast v14, La/hgk0;

    .line 284
    .line 285
    invoke-virtual {v14}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v14

    .line 289
    check-cast v14, La/ycl;

    .line 290
    .line 291
    iget v14, v14, La/ycl;->a:F

    .line 292
    .line 293
    sget-object v17, La/qmk;->a:La/zcl;

    .line 294
    .line 295
    const/high16 v17, 0x41c00000    # 24.0f

    .line 296
    .line 297
    add-float v14, v14, v17

    .line 298
    .line 299
    move/from16 v17, v13

    .line 300
    .line 301
    const/4 v13, 0x2

    .line 302
    invoke-direct {v9, v10, v11, v14, v13}, La/yzv0;-><init>(FFFI)V

    .line 303
    .line 304
    .line 305
    new-array v10, v13, [La/j0w0;

    .line 306
    .line 307
    aput-object v9, v10, v16

    .line 308
    .line 309
    sget-object v9, La/xzv0;->a:La/xzv0;

    .line 310
    .line 311
    aput-object v9, v10, v17

    .line 312
    .line 313
    invoke-static {v10, v12}, La/v2n0;->w([La/j0w0;La/fet;)La/bgx;

    .line 314
    .line 315
    .line 316
    move-result-object v9

    .line 317
    and-int/lit8 v10, v7, 0x70

    .line 318
    .line 319
    const/16 v11, 0x20

    .line 320
    .line 321
    if-ne v10, v11, :cond_13

    .line 322
    .line 323
    move/from16 v10, v17

    .line 324
    .line 325
    goto :goto_a

    .line 326
    :cond_13
    move/from16 v10, v16

    .line 327
    .line 328
    :goto_a
    const/high16 v11, 0x70000

    .line 329
    .line 330
    and-int/2addr v11, v7

    .line 331
    const/high16 v13, 0x20000

    .line 332
    .line 333
    if-ne v11, v13, :cond_14

    .line 334
    .line 335
    move/from16 v16, v17

    .line 336
    .line 337
    :cond_14
    or-int v10, v10, v16

    .line 338
    .line 339
    invoke-virtual {v12}, La/fet;->P()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    if-nez v10, :cond_15

    .line 344
    .line 345
    if-ne v11, v6, :cond_16

    .line 346
    .line 347
    :cond_15
    new-instance v11, La/or0;

    .line 348
    .line 349
    const/16 v6, 0x1a

    .line 350
    .line 351
    invoke-direct {v11, v2, v15, v6}, La/or0;-><init>(La/a4x;Lkotlin/jvm/functions/Function1;B)V

    .line 352
    .line 353
    .line 354
    invoke-virtual {v12, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 355
    .line 356
    .line 357
    :cond_16
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 358
    .line 359
    shr-int/lit8 v6, v7, 0x3

    .line 360
    .line 361
    and-int/lit8 v13, v6, 0x70

    .line 362
    .line 363
    const/16 v14, 0x1f8

    .line 364
    .line 365
    const/4 v6, 0x0

    .line 366
    const/4 v7, 0x0

    .line 367
    move-object v3, v8

    .line 368
    const/4 v8, 0x0

    .line 369
    move-object v5, v9

    .line 370
    const/4 v9, 0x0

    .line 371
    const/4 v10, 0x0

    .line 372
    move-object/from16 v4, p2

    .line 373
    .line 374
    invoke-static/range {v3 .. v14}, La/b8k0;->e(La/mm40;La/xcz;La/hh80;La/sw3;La/xx7;La/qkq;ZLa/vf80;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 375
    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_17
    invoke-virtual/range {p6 .. p6}, La/fet;->X()V

    .line 379
    .line 380
    .line 381
    :goto_b
    invoke-virtual/range {p6 .. p6}, La/fet;->u()La/yfe0;

    .line 382
    .line 383
    .line 384
    move-result-object v9

    .line 385
    if-eqz v9, :cond_18

    .line 386
    .line 387
    new-instance v0, La/cg0;

    .line 388
    .line 389
    const/16 v8, 0x1b

    .line 390
    .line 391
    move-object/from16 v3, p2

    .line 392
    .line 393
    move-object/from16 v4, p3

    .line 394
    .line 395
    move/from16 v7, p7

    .line 396
    .line 397
    move-object v5, v1

    .line 398
    move-object v6, v15

    .line 399
    move-object/from16 v1, p0

    .line 400
    .line 401
    invoke-direct/range {v0 .. v8}, La/cg0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 402
    .line 403
    .line 404
    iput-object v0, v9, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 405
    .line 406
    :cond_18
    return-void
.end method
