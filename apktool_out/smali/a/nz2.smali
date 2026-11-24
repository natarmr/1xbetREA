.class public abstract La/nz2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/Class;La/mm40;La/d5r;Landroid/os/Bundle;La/lkz;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v3, p2

    .line 4
    .line 5
    move-object/from16 v4, p3

    .line 6
    .line 7
    move-object/from16 v8, p6

    .line 8
    .line 9
    const v0, 0x4470edc7

    .line 10
    .line 11
    .line 12
    invoke-virtual {v8, v0}, La/fet;->g0(I)La/fet;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 v0, 0x4

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x2

    .line 24
    :goto_0
    or-int v0, p7, v0

    .line 25
    .line 26
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/16 v11, 0x100

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    move v2, v11

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 v2, 0x80

    .line 37
    .line 38
    :goto_1
    or-int/2addr v0, v2

    .line 39
    invoke-virtual {v8, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    if-eqz v2, :cond_2

    .line 44
    .line 45
    const/16 v2, 0x800

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_2
    const/16 v2, 0x400

    .line 49
    .line 50
    :goto_2
    or-int/2addr v0, v2

    .line 51
    if-nez p4, :cond_3

    .line 52
    .line 53
    const/4 v2, -0x1

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    :goto_3
    invoke-virtual {v8, v2}, La/fet;->e(I)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    const/16 v12, 0x4000

    .line 64
    .line 65
    if-eqz v2, :cond_4

    .line 66
    .line 67
    move v2, v12

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    const/16 v2, 0x2000

    .line 70
    .line 71
    :goto_4
    or-int v13, v0, v2

    .line 72
    .line 73
    const v0, 0x12493

    .line 74
    .line 75
    .line 76
    and-int/2addr v0, v13

    .line 77
    const v2, 0x12492

    .line 78
    .line 79
    .line 80
    if-eq v0, v2, :cond_5

    .line 81
    .line 82
    const/4 v0, 0x1

    .line 83
    goto :goto_5

    .line 84
    :cond_5
    const/4 v0, 0x0

    .line 85
    :goto_5
    and-int/lit8 v2, v13, 0x1

    .line 86
    .line 87
    invoke-virtual {v8, v2, v0}, La/fet;->U(IZ)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_18

    .line 92
    .line 93
    invoke-virtual {v8}, La/fet;->Z()V

    .line 94
    .line 95
    .line 96
    and-int/lit8 v0, p7, 0x1

    .line 97
    .line 98
    if-eqz v0, :cond_7

    .line 99
    .line 100
    invoke-virtual {v8}, La/fet;->B()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_6

    .line 105
    .line 106
    goto :goto_6

    .line 107
    :cond_6
    invoke-virtual {v8}, La/fet;->X()V

    .line 108
    .line 109
    .line 110
    :cond_7
    :goto_6
    invoke-virtual {v8}, La/fet;->s()V

    .line 111
    .line 112
    .line 113
    invoke-static/range {p5 .. p6}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 114
    .line 115
    .line 116
    move-result-object v0

    .line 117
    invoke-static {v8}, La/e3c;->x(La/fet;)I

    .line 118
    .line 119
    .line 120
    move-result v2

    .line 121
    sget-object v5, La/dy2;->f:La/zfn;

    .line 122
    .line 123
    invoke-virtual {v8, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    check-cast v5, Landroid/view/View;

    .line 128
    .line 129
    invoke-virtual {v8, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v6

    .line 133
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    sget-object v9, La/ukd;->a:La/cl5;

    .line 138
    .line 139
    if-nez v6, :cond_8

    .line 140
    .line 141
    if-ne v7, v9, :cond_9

    .line 142
    .line 143
    :cond_8
    invoke-static {v5}, Landroidx/fragment/app/e;->K(Landroid/view/View;)Landroidx/fragment/app/e;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v8, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_9
    check-cast v7, Landroidx/fragment/app/e;

    .line 151
    .line 152
    sget-object v5, La/dy2;->b:La/zfn;

    .line 153
    .line 154
    invoke-virtual {v8, v5}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    check-cast v5, Landroid/content/Context;

    .line 159
    .line 160
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-ne v6, v9, :cond_a

    .line 165
    .line 166
    new-instance v6, La/nzq;

    .line 167
    .line 168
    invoke-direct {v6, v2}, La/nzq;-><init>(I)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    :cond_a
    check-cast v6, La/nzq;

    .line 175
    .line 176
    move-object v10, v9

    .line 177
    const/16 v9, 0x30

    .line 178
    .line 179
    move-object/from16 v16, v10

    .line 180
    .line 181
    const/4 v10, 0x4

    .line 182
    move-object/from16 v17, v7

    .line 183
    .line 184
    const/4 v7, 0x0

    .line 185
    move-object v15, v5

    .line 186
    move-object v5, v6

    .line 187
    move-object/from16 v18, v16

    .line 188
    .line 189
    move-object/from16 v14, v17

    .line 190
    .line 191
    move-object/from16 v6, p1

    .line 192
    .line 193
    invoke-static/range {v5 .. v10}, La/dwi0;->b(Lkotlin/jvm/functions/Function1;La/mm40;Lkotlin/jvm/functions/Function1;La/fet;II)V

    .line 194
    .line 195
    .line 196
    move-object v10, v8

    .line 197
    filled-new-array {v14, v5, v1, v3}, [Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v6

    .line 201
    invoke-virtual {v10, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v7

    .line 205
    invoke-virtual {v10, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    or-int/2addr v7, v8

    .line 210
    invoke-virtual {v10, v15}, La/fet;->i(Ljava/lang/Object;)Z

    .line 211
    .line 212
    .line 213
    move-result v8

    .line 214
    or-int/2addr v7, v8

    .line 215
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    or-int/2addr v7, v8

    .line 220
    and-int/lit16 v8, v13, 0x380

    .line 221
    .line 222
    xor-int/lit16 v8, v8, 0x180

    .line 223
    .line 224
    if-le v8, v11, :cond_b

    .line 225
    .line 226
    invoke-virtual {v10, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 227
    .line 228
    .line 229
    move-result v8

    .line 230
    if-nez v8, :cond_c

    .line 231
    .line 232
    :cond_b
    and-int/lit16 v8, v13, 0x180

    .line 233
    .line 234
    if-ne v8, v11, :cond_d

    .line 235
    .line 236
    :cond_c
    const/4 v8, 0x1

    .line 237
    goto :goto_7

    .line 238
    :cond_d
    const/4 v8, 0x0

    .line 239
    :goto_7
    or-int/2addr v7, v8

    .line 240
    invoke-virtual {v10, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v8

    .line 244
    or-int/2addr v7, v8

    .line 245
    invoke-virtual {v10, v2}, La/fet;->e(I)Z

    .line 246
    .line 247
    .line 248
    move-result v8

    .line 249
    or-int/2addr v7, v8

    .line 250
    const v8, 0xe000

    .line 251
    .line 252
    .line 253
    and-int/2addr v8, v13

    .line 254
    xor-int/lit16 v11, v8, 0x6000

    .line 255
    .line 256
    if-le v11, v12, :cond_e

    .line 257
    .line 258
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Enum;->ordinal()I

    .line 259
    .line 260
    .line 261
    move-result v8

    .line 262
    invoke-virtual {v10, v8}, La/fet;->e(I)Z

    .line 263
    .line 264
    .line 265
    move-result v8

    .line 266
    if-nez v8, :cond_f

    .line 267
    .line 268
    :cond_e
    and-int/lit16 v8, v13, 0x6000

    .line 269
    .line 270
    if-ne v8, v12, :cond_10

    .line 271
    .line 272
    :cond_f
    const/4 v8, 0x1

    .line 273
    goto :goto_8

    .line 274
    :cond_10
    const/4 v8, 0x0

    .line 275
    :goto_8
    or-int/2addr v7, v8

    .line 276
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    or-int/2addr v7, v8

    .line 281
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    if-nez v7, :cond_12

    .line 286
    .line 287
    move-object/from16 v7, v18

    .line 288
    .line 289
    if-ne v8, v7, :cond_11

    .line 290
    .line 291
    :goto_9
    move v8, v2

    .line 292
    move-object v2, v5

    .line 293
    move-object v5, v0

    .line 294
    goto :goto_a

    .line 295
    :cond_11
    move-object/from16 v9, p4

    .line 296
    .line 297
    move-object v2, v5

    .line 298
    move-object v15, v7

    .line 299
    move-object v1, v14

    .line 300
    move-object v14, v6

    .line 301
    goto :goto_b

    .line 302
    :cond_12
    move-object/from16 v7, v18

    .line 303
    .line 304
    goto :goto_9

    .line 305
    :goto_a
    new-instance v0, La/jz2;

    .line 306
    .line 307
    move-object v9, v4

    .line 308
    move-object v4, v1

    .line 309
    move-object v1, v14

    .line 310
    move-object v14, v6

    .line 311
    move-object v6, v3

    .line 312
    move-object v3, v15

    .line 313
    move-object v15, v7

    .line 314
    move-object v7, v9

    .line 315
    move-object/from16 v9, p4

    .line 316
    .line 317
    invoke-direct/range {v0 .. v9}, La/jz2;-><init>(Landroidx/fragment/app/e;La/nzq;Landroid/content/Context;Ljava/lang/Class;La/pz40;La/d5r;Landroid/os/Bundle;ILa/lkz;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {v10, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 321
    .line 322
    .line 323
    move-object v8, v0

    .line 324
    :goto_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    .line 325
    .line 326
    invoke-static {v14, v8, v10}, La/m0x0;->p([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    invoke-virtual {v10, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 334
    .line 335
    .line 336
    move-result v3

    .line 337
    or-int/2addr v0, v3

    .line 338
    if-le v11, v12, :cond_13

    .line 339
    .line 340
    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    .line 341
    .line 342
    .line 343
    move-result v3

    .line 344
    invoke-virtual {v10, v3}, La/fet;->e(I)Z

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    if-nez v3, :cond_14

    .line 349
    .line 350
    :cond_13
    and-int/lit16 v3, v13, 0x6000

    .line 351
    .line 352
    if-ne v3, v12, :cond_15

    .line 353
    .line 354
    :cond_14
    const/4 v14, 0x1

    .line 355
    goto :goto_c

    .line 356
    :cond_15
    const/4 v14, 0x0

    .line 357
    :goto_c
    or-int/2addr v0, v14

    .line 358
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v3

    .line 362
    if-nez v0, :cond_16

    .line 363
    .line 364
    if-ne v3, v15, :cond_17

    .line 365
    .line 366
    :cond_16
    new-instance v3, La/on;

    .line 367
    .line 368
    const/16 v0, 0xc

    .line 369
    .line 370
    invoke-direct {v3, v1, v2, v9, v0}, La/on;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v10, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 374
    .line 375
    .line 376
    :cond_17
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 377
    .line 378
    invoke-static {v9, v3, v10}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 379
    .line 380
    .line 381
    goto :goto_d

    .line 382
    :cond_18
    move-object/from16 v9, p4

    .line 383
    .line 384
    move-object v10, v8

    .line 385
    invoke-virtual {v10}, La/fet;->X()V

    .line 386
    .line 387
    .line 388
    :goto_d
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 389
    .line 390
    .line 391
    move-result-object v10

    .line 392
    if-eqz v10, :cond_19

    .line 393
    .line 394
    new-instance v0, La/acb0;

    .line 395
    .line 396
    const/4 v8, 0x1

    .line 397
    move-object/from16 v1, p0

    .line 398
    .line 399
    move-object/from16 v2, p1

    .line 400
    .line 401
    move-object/from16 v3, p2

    .line 402
    .line 403
    move-object/from16 v4, p3

    .line 404
    .line 405
    move-object/from16 v6, p5

    .line 406
    .line 407
    move/from16 v7, p7

    .line 408
    .line 409
    move-object v5, v9

    .line 410
    invoke-direct/range {v0 .. v8}, La/acb0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 411
    .line 412
    .line 413
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 414
    .line 415
    :cond_19
    return-void
.end method
