.class public final La/uuz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/on00;
.implements La/lzp;
.implements La/huo;
.implements La/qe60;


# direct methods
.method public static c(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;Lkotlin/jvm/functions/Function1;La/fet;I)V
    .locals 30

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    move-object/from16 v8, p5

    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v0, 0x5176845f

    .line 12
    .line 13
    .line 14
    invoke-virtual {v8, v0}, La/fet;->e0(I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    sget-object v6, La/ukd;->a:La/cl5;

    .line 22
    .line 23
    if-ne v0, v6, :cond_6

    .line 24
    .line 25
    invoke-static {v2}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v1, v0, La/af3;

    .line 30
    .line 31
    if-eqz v1, :cond_0

    .line 32
    .line 33
    check-cast v0, La/af3;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    const/4 v0, 0x0

    .line 37
    :goto_0
    const-class v1, La/g430;

    .line 38
    .line 39
    if-eqz v0, :cond_5

    .line 40
    .line 41
    invoke-interface {v0}, La/af3;->d()La/wcf0;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {v0, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    check-cast v0, La/o5d0;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    invoke-interface {v0}, La/o5d0;->get()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/ze3;

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    const/4 v0, 0x0

    .line 61
    :goto_1
    instance-of v3, v0, La/g430;

    .line 62
    .line 63
    if-nez v3, :cond_2

    .line 64
    .line 65
    const/4 v0, 0x0

    .line 66
    :cond_2
    check-cast v0, La/g430;

    .line 67
    .line 68
    if-eqz v0, :cond_5

    .line 69
    .line 70
    move-object v1, v2

    .line 71
    :goto_2
    if-eqz v1, :cond_4

    .line 72
    .line 73
    instance-of v3, v1, La/ocl0;

    .line 74
    .line 75
    if-eqz v3, :cond_3

    .line 76
    .line 77
    check-cast v1, La/ocl0;

    .line 78
    .line 79
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 80
    .line 81
    .line 82
    move-result-object v25

    .line 83
    new-instance v3, La/ti6;

    .line 84
    .line 85
    const/4 v5, 0x4

    .line 86
    invoke-direct {v3, v2, v5}, La/ti6;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 87
    .line 88
    .line 89
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v10, v0, La/g430;->a:La/cad;

    .line 93
    .line 94
    invoke-interface {v1, v3}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    iget-object v14, v0, La/g430;->b:La/ctf0;

    .line 99
    .line 100
    iget-object v15, v0, La/g430;->c:La/j6m0;

    .line 101
    .line 102
    iget-object v1, v0, La/g430;->d:La/kl5;

    .line 103
    .line 104
    iget-object v3, v0, La/g430;->e:La/gl5;

    .line 105
    .line 106
    iget-object v5, v0, La/g430;->f:La/je;

    .line 107
    .line 108
    iget-object v7, v0, La/g430;->g:La/kt2;

    .line 109
    .line 110
    iget-object v9, v0, La/g430;->h:La/gst0;

    .line 111
    .line 112
    iget-object v12, v0, La/g430;->i:La/knf0;

    .line 113
    .line 114
    iget-object v13, v0, La/g430;->j:La/peg0;

    .line 115
    .line 116
    iget-object v4, v0, La/g430;->k:La/mj8;

    .line 117
    .line 118
    move-object/from16 v16, v1

    .line 119
    .line 120
    iget-object v1, v0, La/g430;->l:La/r9u;

    .line 121
    .line 122
    move-object/from16 v17, v1

    .line 123
    .line 124
    iget-object v1, v0, La/g430;->m:La/pru;

    .line 125
    .line 126
    move-object/from16 v24, v1

    .line 127
    .line 128
    iget-object v1, v0, La/g430;->o:La/evz;

    .line 129
    .line 130
    move-object/from16 v21, v12

    .line 131
    .line 132
    iget-object v12, v0, La/g430;->n:La/sue;

    .line 133
    .line 134
    move-object/from16 v26, v1

    .line 135
    .line 136
    iget-object v1, v0, La/g430;->p:La/cl5;

    .line 137
    .line 138
    move-object/from16 v27, v1

    .line 139
    .line 140
    iget-object v1, v0, La/g430;->q:La/q7d0;

    .line 141
    .line 142
    iget-object v0, v0, La/g430;->r:La/roq0;

    .line 143
    .line 144
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-object/from16 v20, v9

    .line 169
    .line 170
    new-instance v9, La/fli;

    .line 171
    .line 172
    move-object/from16 v29, v0

    .line 173
    .line 174
    move-object/from16 v28, v1

    .line 175
    .line 176
    move-object/from16 v17, v3

    .line 177
    .line 178
    move-object/from16 v23, v4

    .line 179
    .line 180
    move-object/from16 v18, v5

    .line 181
    .line 182
    move-object/from16 v19, v7

    .line 183
    .line 184
    move-object/from16 v22, v13

    .line 185
    .line 186
    move-object/from16 v13, p3

    .line 187
    .line 188
    invoke-direct/range {v9 .. v29}, La/fli;-><init>(La/cad;La/pcl0;La/sue;Lorg/xplatform/sportgame/categories_subgames/api/MarketsCategoriesParams;La/ctf0;La/j6m0;La/kl5;La/gl5;La/je;La/kt2;La/gst0;La/knf0;La/peg0;La/mj8;La/pru;La/i1w0;La/evz;La/cl5;La/q7d0;La/roq0;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v8, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    move-object v0, v9

    .line 195
    goto :goto_3

    .line 196
    :cond_3
    iget-object v1, v1, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_4
    const-string v0, "Can\'t find feature provider!"

    .line 200
    .line 201
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-void

    .line 205
    :cond_5
    const-string v0, "Cannot create dependency "

    .line 206
    .line 207
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    return-void

    .line 215
    :cond_6
    :goto_3
    move-object v7, v0

    .line 216
    check-cast v7, La/fli;

    .line 217
    .line 218
    new-instance v0, La/q0h0;

    .line 219
    .line 220
    iget-object v1, v7, La/fli;->t:La/n5d0;

    .line 221
    .line 222
    invoke-interface {v1}, La/o5d0;->get()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, La/eli;

    .line 227
    .line 228
    invoke-direct {v0, v1}, La/q0h0;-><init>(La/p0h0;)V

    .line 229
    .line 230
    .line 231
    const-class v1, La/uz20;

    .line 232
    .line 233
    sget-object v3, La/sre0;->a:La/tre0;

    .line 234
    .line 235
    invoke-virtual {v3, v1}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    sget v3, La/uz20;->R:I

    .line 240
    .line 241
    const/16 v9, 0xe

    .line 242
    .line 243
    const/4 v4, 0x0

    .line 244
    invoke-static {v1, v4, v0, v8, v9}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 245
    .line 246
    .line 247
    move-result-object v1

    .line 248
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object v3

    .line 256
    const/4 v5, 0x3

    .line 257
    if-nez v0, :cond_7

    .line 258
    .line 259
    if-ne v3, v6, :cond_8

    .line 260
    .line 261
    :cond_7
    new-instance v3, La/ebh;

    .line 262
    .line 263
    invoke-direct {v3, v1, v5}, La/ebh;-><init>(La/k3t0;B)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 270
    .line 271
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    new-instance v10, La/sa4;

    .line 276
    .line 277
    invoke-direct {v10, v3, v5}, La/sa4;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 278
    .line 279
    .line 280
    const-string v3, "KEY_SUB_GAME_FILTER_MODEL_REQUEST"

    .line 281
    .line 282
    invoke-virtual {v0, v3, v2, v10}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-virtual {v8, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v3

    .line 293
    or-int/2addr v0, v3

    .line 294
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 295
    .line 296
    .line 297
    move-result v3

    .line 298
    or-int/2addr v0, v3

    .line 299
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 300
    .line 301
    .line 302
    move-result-object v3

    .line 303
    if-nez v0, :cond_9

    .line 304
    .line 305
    if-ne v3, v6, :cond_a

    .line 306
    .line 307
    :cond_9
    new-instance v3, La/k9v;

    .line 308
    .line 309
    const/16 v0, 0x18

    .line 310
    .line 311
    invoke-direct {v3, v2, v7, v1, v0}, La/k9v;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 312
    .line 313
    .line 314
    invoke-virtual {v8, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 318
    .line 319
    sget-object v0, La/lkz;->a:La/lkz;

    .line 320
    .line 321
    invoke-static {v3, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 322
    .line 323
    .line 324
    move-result-object v3

    .line 325
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 326
    .line 327
    .line 328
    move-result v0

    .line 329
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    or-int/2addr v0, v10

    .line 334
    invoke-virtual {v8, v5}, La/fet;->e(I)Z

    .line 335
    .line 336
    .line 337
    move-result v5

    .line 338
    or-int/2addr v0, v5

    .line 339
    invoke-virtual {v8, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v5

    .line 343
    or-int/2addr v0, v5

    .line 344
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v5

    .line 348
    if-nez v0, :cond_b

    .line 349
    .line 350
    if-ne v5, v6, :cond_c

    .line 351
    .line 352
    :cond_b
    new-instance v0, La/p000;

    .line 353
    .line 354
    const/16 v5, 0x8

    .line 355
    .line 356
    invoke-direct/range {v0 .. v5}, La/p000;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v8, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    move-object v5, v0

    .line 363
    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function2;

    .line 364
    .line 365
    invoke-static {v8, v2, v5}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 366
    .line 367
    .line 368
    check-cast v1, La/i3t0;

    .line 369
    .line 370
    invoke-virtual {v1, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 371
    .line 372
    .line 373
    move-result-object v0

    .line 374
    invoke-virtual {v8, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    move-result v3

    .line 378
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v4

    .line 382
    if-nez v3, :cond_d

    .line 383
    .line 384
    if-ne v4, v6, :cond_e

    .line 385
    .line 386
    :cond_d
    new-instance v4, La/vi6;

    .line 387
    .line 388
    const/16 v3, 0x9

    .line 389
    .line 390
    invoke-direct {v4, v1, v3}, La/vi6;-><init>(La/i3t0;B)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 394
    .line 395
    .line 396
    :cond_e
    move-object v10, v4

    .line 397
    check-cast v10, Lkotlin/jvm/functions/Function1;

    .line 398
    .line 399
    move-object v1, v0

    .line 400
    new-instance v0, La/s49;

    .line 401
    .line 402
    move-object v2, v7

    .line 403
    const/4 v7, 0x7

    .line 404
    move-object/from16 v3, p1

    .line 405
    .line 406
    move-object/from16 v4, p2

    .line 407
    .line 408
    move-object/from16 v5, p3

    .line 409
    .line 410
    move-object/from16 v6, p4

    .line 411
    .line 412
    invoke-direct/range {v0 .. v7}, La/s49;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 413
    .line 414
    .line 415
    const v3, -0x1224688e

    .line 416
    .line 417
    .line 418
    invoke-static {v3, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 419
    .line 420
    .line 421
    move-result-object v3

    .line 422
    new-instance v0, La/p0z;

    .line 423
    .line 424
    const/16 v4, 0xc

    .line 425
    .line 426
    invoke-direct {v0, v2, v4}, La/p0z;-><init>(Ljava/lang/Object;B)V

    .line 427
    .line 428
    .line 429
    const v2, 0x4a23fde5    # 2686841.2f

    .line 430
    .line 431
    .line 432
    invoke-static {v2, v0, v8}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    and-int/lit8 v0, p6, 0xe

    .line 437
    .line 438
    or-int/lit16 v6, v0, 0x6c00

    .line 439
    .line 440
    move-object/from16 v0, p0

    .line 441
    .line 442
    move-object v5, v8

    .line 443
    move-object v2, v10

    .line 444
    invoke-static/range {v0 .. v6}, La/d9x;->h(La/mm40;La/l7m0;Lkotlin/jvm/functions/Function1;La/ugd;La/ugd;La/fet;I)V

    .line 445
    .line 446
    .line 447
    const/4 v0, 0x0

    .line 448
    invoke-virtual {v5, v0}, La/fet;->r(Z)V

    .line 449
    .line 450
    .line 451
    return-void
.end method

.method public static d(II)La/zq20;
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_7

    .line 3
    .line 4
    const/4 v1, 0x2

    .line 5
    if-eq p0, v1, :cond_5

    .line 6
    .line 7
    const/4 v1, 0x3

    .line 8
    if-eq p0, v1, :cond_2

    .line 9
    .line 10
    rem-int/2addr p1, p0

    .line 11
    if-nez p1, :cond_0

    .line 12
    .line 13
    sget-object p0, La/zq20;->b:La/zq20;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sub-int/2addr p0, v0

    .line 17
    if-ne p1, p0, :cond_1

    .line 18
    .line 19
    sget-object p0, La/zq20;->d:La/zq20;

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_1
    sget-object p0, La/zq20;->c:La/zq20;

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    rem-int/2addr p1, p0

    .line 26
    if-nez p1, :cond_3

    .line 27
    .line 28
    sget-object p0, La/zq20;->b:La/zq20;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_3
    sub-int/2addr p0, v0

    .line 32
    if-ne p1, p0, :cond_4

    .line 33
    .line 34
    sget-object p0, La/zq20;->d:La/zq20;

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_4
    sget-object p0, La/zq20;->c:La/zq20;

    .line 38
    .line 39
    return-object p0

    .line 40
    :cond_5
    rem-int/2addr p1, v1

    .line 41
    if-nez p1, :cond_6

    .line 42
    .line 43
    sget-object p0, La/zq20;->b:La/zq20;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_6
    sget-object p0, La/zq20;->d:La/zq20;

    .line 47
    .line 48
    return-object p0

    .line 49
    :cond_7
    sget-object p0, La/zq20;->e:La/zq20;

    .line 50
    .line 51
    return-object p0
.end method

.method public static e(I)La/fk60;
    .locals 3

    .line 1
    sget-object v0, La/fk60;->g1:La/c0o;

    .line 2
    .line 3
    invoke-static {v0, v0}, La/ohs0;->h(La/c0o;La/c0o;)La/y2;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    invoke-virtual {v0}, La/y2;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {v0}, La/y2;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object v2, v1

    .line 18
    check-cast v2, La/fk60;

    .line 19
    .line 20
    iget-byte v2, v2, La/fk60;->a:B

    .line 21
    .line 22
    if-ne v2, p0, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    const/4 v1, 0x0

    .line 26
    :goto_0
    check-cast v1, La/fk60;

    .line 27
    .line 28
    return-object v1
.end method

.method public static g(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p0, v0, :cond_4

    .line 3
    .line 4
    const/4 v0, 0x3

    .line 5
    if-eq p0, v0, :cond_3

    .line 6
    .line 7
    const/4 v0, 0x5

    .line 8
    if-eq p0, v0, :cond_2

    .line 9
    .line 10
    const/4 v0, 0x7

    .line 11
    if-eq p0, v0, :cond_1

    .line 12
    .line 13
    const/16 v0, 0x8

    .line 14
    .line 15
    if-eq p0, v0, :cond_0

    .line 16
    .line 17
    packed-switch p0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    const-string p0, ""

    .line 21
    .line 22
    return-object p0

    .line 23
    :pswitch_0
    const-string p0, "tournaments"

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_1
    const-string p0, "bonus"

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_2
    const-string p0, "live"

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_3
    const-string p0, "slots"

    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_4
    const-string p0, "casino"

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_5
    const-string p0, "swipex"

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_6
    const-string p0, "insight"

    .line 42
    .line 43
    return-object p0

    .line 44
    :cond_0
    const-string p0, "event_screen"

    .line 45
    .line 46
    return-object p0

    .line 47
    :cond_1
    const-string p0, "cybersport"

    .line 48
    .line 49
    return-object p0

    .line 50
    :cond_2
    const-string p0, "coupon"

    .line 51
    .line 52
    return-object p0

    .line 53
    :cond_3
    const-string p0, "bet_constructor"

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    const-string p0, "settings"

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_data_0
    .packed-switch 0xc
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static i(Ljava/lang/String;Z)La/lc70;
    .locals 3

    .line 1
    new-instance v0, La/lc70;

    .line 2
    .line 3
    invoke-direct {v0}, La/lc70;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, La/lc70;->o2:[La/iiy;

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    aget-object v1, v1, v2

    .line 10
    .line 11
    iget-object v2, v0, La/lc70;->k2:La/phf0;

    .line 12
    .line 13
    invoke-virtual {v2, v0, v1, p0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object p0, v0, Landroidx/fragment/app/Fragment;->g:Landroid/os/Bundle;

    .line 17
    .line 18
    if-nez p0, :cond_0

    .line 19
    .line 20
    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_0
    const-string v1, "OneXGamesWebGame.UNAUTHORIZED_DEMO_DIALOG_BUNDLE_DEMO_AVAILABLE"

    .line 25
    .line 26
    invoke-virtual {p0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p0}, Landroidx/fragment/app/Fragment;->s0(Landroid/os/Bundle;)V

    .line 30
    .line 31
    .line 32
    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public b(JLjava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public closeLogFile()V
    .locals 0

    .line 1
    return-void
.end method

.method public f(La/fvh0;)V
    .locals 0

    .line 1
    return-void
.end method

.method public h(Ljava/io/FileOutputStream;La/zje;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, La/hw40;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/hw40;

    .line 7
    .line 8
    iget v1, v0, La/hw40;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/hw40;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/hw40;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/hw40;-><init>(La/uuz;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/hw40;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p2, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/hw40;->m:I

    .line 30
    .line 31
    const/4 v2, 0x1

    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    if-ne v1, v2, :cond_1

    .line 35
    .line 36
    iget-wide v3, v0, La/hw40;->j:J

    .line 37
    .line 38
    iget-object p1, v0, La/hw40;->i:Ljava/io/FileOutputStream;

    .line 39
    .line 40
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    move-object p0, v0

    .line 44
    goto :goto_2

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    return-object p0

    .line 52
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    const-wide/16 v3, 0xa

    .line 56
    .line 57
    move-object p0, v0

    .line 58
    :goto_1
    const-wide/32 v0, 0xea60

    .line 59
    .line 60
    .line 61
    cmp-long v0, v3, v0

    .line 62
    .line 63
    if-gtz v0, :cond_5

    .line 64
    .line 65
    :try_start_0
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 66
    .line 67
    .line 68
    move-result-object v5

    .line 69
    const-wide v8, 0x7fffffffffffffffL

    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    const-wide/16 v6, 0x0

    .line 76
    .line 77
    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->lock(JJZ)Ljava/nio/channels/FileLock;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :catch_0
    move-exception v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    const-string v5, "Resource deadlock would occur"

    .line 93
    .line 94
    const/4 v6, 0x0

    .line 95
    invoke-static {v1, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-ne v1, v2, :cond_4

    .line 100
    .line 101
    iput-object p1, p0, La/hw40;->i:Ljava/io/FileOutputStream;

    .line 102
    .line 103
    iput-wide v3, p0, La/hw40;->j:J

    .line 104
    .line 105
    iput v2, p0, La/hw40;->m:I

    .line 106
    .line 107
    invoke-static {v3, v4, p0}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    if-ne v0, p2, :cond_3

    .line 112
    .line 113
    return-object p2

    .line 114
    :cond_3
    :goto_2
    const-wide/16 v0, 0x2

    .line 115
    .line 116
    mul-long/2addr v3, v0

    .line 117
    goto :goto_1

    .line 118
    :cond_4
    throw v0

    .line 119
    :cond_5
    invoke-virtual {p1}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    const-wide v8, 0x7fffffffffffffffL

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    const/4 v10, 0x0

    .line 129
    const-wide/16 v6, 0x0

    .line 130
    .line 131
    invoke-virtual/range {v5 .. v10}, Ljava/nio/channels/FileChannel;->lock(JJZ)Ljava/nio/channels/FileLock;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    return-object p0
.end method

.method public n(I)I
    .locals 0

    .line 1
    return p1
.end method

.method public o()V
    .locals 0

    .line 1
    return-void
.end method

.method public q(II)La/ncs0;
    .locals 0

    .line 1
    new-instance p0, La/pnk;

    .line 2
    .line 3
    invoke-direct {p0}, La/pnk;-><init>()V

    .line 4
    .line 5
    .line 6
    return-object p0
.end method

.method public s(I)I
    .locals 0

    .line 1
    return p1
.end method
