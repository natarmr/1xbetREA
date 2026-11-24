.class public abstract La/tfa0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/fet;I)V
    .locals 53

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
    const v5, 0x24cda551

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
    if-nez v5, :cond_1

    .line 20
    .line 21
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v5

    .line 25
    if-eqz v5, :cond_0

    .line 26
    .line 27
    const/4 v5, 0x4

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v5, 0x2

    .line 30
    :goto_0
    or-int/2addr v5, v4

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move v5, v4

    .line 33
    :goto_1
    and-int/lit8 v7, v4, 0x30

    .line 34
    .line 35
    if-nez v7, :cond_3

    .line 36
    .line 37
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v7

    .line 41
    if-eqz v7, :cond_2

    .line 42
    .line 43
    const/16 v7, 0x20

    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    const/16 v7, 0x10

    .line 47
    .line 48
    :goto_2
    or-int/2addr v5, v7

    .line 49
    :cond_3
    and-int/lit16 v7, v4, 0x180

    .line 50
    .line 51
    if-nez v7, :cond_6

    .line 52
    .line 53
    and-int/lit16 v7, v4, 0x200

    .line 54
    .line 55
    if-nez v7, :cond_4

    .line 56
    .line 57
    invoke-virtual {v0, v3}, La/fet;->g(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    goto :goto_3

    .line 62
    :cond_4
    invoke-virtual {v0, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v7

    .line 66
    :goto_3
    if-eqz v7, :cond_5

    .line 67
    .line 68
    const/16 v7, 0x100

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_5
    const/16 v7, 0x80

    .line 72
    .line 73
    :goto_4
    or-int/2addr v5, v7

    .line 74
    :cond_6
    and-int/lit16 v7, v5, 0x93

    .line 75
    .line 76
    const/16 v8, 0x92

    .line 77
    .line 78
    const/4 v10, 0x1

    .line 79
    if-eq v7, v8, :cond_7

    .line 80
    .line 81
    move v7, v10

    .line 82
    goto :goto_5

    .line 83
    :cond_7
    const/4 v7, 0x0

    .line 84
    :goto_5
    and-int/2addr v5, v10

    .line 85
    invoke-virtual {v0, v5, v7}, La/fet;->U(IZ)Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-eqz v5, :cond_2a

    .line 90
    .line 91
    invoke-virtual {v0, v2}, La/fet;->g(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    const-string v8, "Can\'t find feature provider!"

    .line 100
    .line 101
    sget-object v11, La/ukd;->a:La/cl5;

    .line 102
    .line 103
    if-nez v5, :cond_8

    .line 104
    .line 105
    if-ne v7, v11, :cond_9

    .line 106
    .line 107
    :cond_8
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    :goto_6
    if-eqz v5, :cond_29

    .line 112
    .line 113
    invoke-virtual {v5}, Landroidx/fragment/app/e;->P()I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    sub-int/2addr v7, v10

    .line 118
    :goto_7
    if-ltz v7, :cond_27

    .line 119
    .line 120
    invoke-virtual {v5, v7}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 121
    .line 122
    .line 123
    move-result-object v13

    .line 124
    iget-object v13, v13, La/zb5;->i:Ljava/lang/String;

    .line 125
    .line 126
    invoke-virtual {v5, v13}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 127
    .line 128
    .line 129
    move-result-object v13

    .line 130
    instance-of v14, v13, La/ka9;

    .line 131
    .line 132
    if-eqz v14, :cond_26

    .line 133
    .line 134
    check-cast v13, La/ka9;

    .line 135
    .line 136
    invoke-virtual {v13}, La/ka9;->G0()La/hoi;

    .line 137
    .line 138
    .line 139
    move-result-object v7

    .line 140
    invoke-virtual {v0, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    :cond_9
    check-cast v7, La/hoi;

    .line 144
    .line 145
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    if-ne v5, v11, :cond_14

    .line 150
    .line 151
    invoke-static {v2}, La/vqd;->i(Landroidx/fragment/app/Fragment;)Landroid/app/Application;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    instance-of v13, v5, La/af3;

    .line 156
    .line 157
    if-eqz v13, :cond_a

    .line 158
    .line 159
    check-cast v5, La/af3;

    .line 160
    .line 161
    goto :goto_8

    .line 162
    :cond_a
    const/4 v5, 0x0

    .line 163
    :goto_8
    const-class v13, La/xcn;

    .line 164
    .line 165
    if-eqz v5, :cond_13

    .line 166
    .line 167
    invoke-interface {v5}, La/af3;->d()La/wcf0;

    .line 168
    .line 169
    .line 170
    move-result-object v5

    .line 171
    invoke-virtual {v5, v13}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    check-cast v5, La/o5d0;

    .line 176
    .line 177
    if-eqz v5, :cond_b

    .line 178
    .line 179
    invoke-interface {v5}, La/o5d0;->get()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v5

    .line 183
    check-cast v5, La/ze3;

    .line 184
    .line 185
    goto :goto_9

    .line 186
    :cond_b
    const/4 v5, 0x0

    .line 187
    :goto_9
    instance-of v14, v5, La/xcn;

    .line 188
    .line 189
    if-nez v14, :cond_c

    .line 190
    .line 191
    const/4 v5, 0x0

    .line 192
    :cond_c
    check-cast v5, La/xcn;

    .line 193
    .line 194
    if-eqz v5, :cond_13

    .line 195
    .line 196
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 197
    .line 198
    .line 199
    move-result-object v13

    .line 200
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 201
    .line 202
    .line 203
    move-result-object v23

    .line 204
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    :goto_a
    if-eqz v14, :cond_12

    .line 209
    .line 210
    invoke-virtual {v14}, Landroidx/fragment/app/e;->P()I

    .line 211
    .line 212
    .line 213
    move-result v15

    .line 214
    sub-int/2addr v15, v10

    .line 215
    :goto_b
    if-ltz v15, :cond_10

    .line 216
    .line 217
    invoke-virtual {v14, v15}, Landroidx/fragment/app/e;->O(I)La/zb5;

    .line 218
    .line 219
    .line 220
    move-result-object v6

    .line 221
    iget-object v6, v6, La/zb5;->i:Ljava/lang/String;

    .line 222
    .line 223
    invoke-virtual {v14, v6}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 224
    .line 225
    .line 226
    move-result-object v6

    .line 227
    instance-of v9, v6, La/ocl0;

    .line 228
    .line 229
    if-eqz v9, :cond_f

    .line 230
    .line 231
    check-cast v6, La/ocl0;

    .line 232
    .line 233
    move-object v9, v2

    .line 234
    :goto_c
    if-eqz v9, :cond_e

    .line 235
    .line 236
    instance-of v10, v9, La/odf0;

    .line 237
    .line 238
    if-eqz v10, :cond_d

    .line 239
    .line 240
    check-cast v9, La/odf0;

    .line 241
    .line 242
    new-instance v8, La/ti6;

    .line 243
    .line 244
    const/4 v10, 0x7

    .line 245
    invoke-direct {v8, v2, v10}, La/ti6;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 249
    .line 250
    .line 251
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 258
    .line 259
    .line 260
    invoke-interface {v6, v8}, La/ocl0;->u(Lkotlin/jvm/functions/Function0;)La/pcl0;

    .line 261
    .line 262
    .line 263
    move-result-object v6

    .line 264
    iget-object v4, v5, La/xcn;->a:La/cad;

    .line 265
    .line 266
    iget-object v8, v5, La/xcn;->b:La/wdk0;

    .line 267
    .line 268
    iget-object v10, v5, La/xcn;->c:La/lgn0;

    .line 269
    .line 270
    invoke-interface {v9}, La/odf0;->b()La/pdf0;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    move-object v13, v6

    .line 275
    iget-object v6, v5, La/xcn;->d:La/sue;

    .line 276
    .line 277
    iget-object v14, v5, La/xcn;->e:La/m1e;

    .line 278
    .line 279
    iget-object v15, v5, La/xcn;->f:La/duj;

    .line 280
    .line 281
    iget-object v12, v5, La/xcn;->g:La/ctf0;

    .line 282
    .line 283
    move-object/from16 v19, v13

    .line 284
    .line 285
    iget-object v13, v5, La/xcn;->o:La/wsf0;

    .line 286
    .line 287
    iget-object v3, v5, La/xcn;->h:La/gst0;

    .line 288
    .line 289
    move-object/from16 v28, v3

    .line 290
    .line 291
    iget-object v3, v5, La/xcn;->i:La/btt0;

    .line 292
    .line 293
    move-object/from16 v20, v3

    .line 294
    .line 295
    iget-object v3, v5, La/xcn;->j:La/b3c0;

    .line 296
    .line 297
    move-object/from16 v21, v3

    .line 298
    .line 299
    iget-object v3, v5, La/xcn;->k:La/j1q0;

    .line 300
    .line 301
    move-object/from16 v29, v3

    .line 302
    .line 303
    iget-object v3, v5, La/xcn;->l:La/r9u;

    .line 304
    .line 305
    move-object/from16 v30, v3

    .line 306
    .line 307
    iget-object v3, v5, La/xcn;->m:La/rmd0;

    .line 308
    .line 309
    move-object/from16 v22, v3

    .line 310
    .line 311
    iget-object v3, v5, La/xcn;->n:La/ii;

    .line 312
    .line 313
    move-object/from16 v31, v3

    .line 314
    .line 315
    iget-object v3, v5, La/xcn;->p:La/knf0;

    .line 316
    .line 317
    move-object/from16 v24, v8

    .line 318
    .line 319
    iget-object v8, v5, La/xcn;->q:La/iip;

    .line 320
    .line 321
    move-object/from16 v17, v9

    .line 322
    .line 323
    const/16 v25, 0x0

    .line 324
    .line 325
    iget-object v9, v5, La/xcn;->r:La/iw20;

    .line 326
    .line 327
    move/from16 v26, v25

    .line 328
    .line 329
    move-object/from16 v25, v10

    .line 330
    .line 331
    iget-object v10, v5, La/xcn;->s:La/fvt0;

    .line 332
    .line 333
    move-object/from16 v27, v11

    .line 334
    .line 335
    iget-object v11, v5, La/xcn;->t:La/onv;

    .line 336
    .line 337
    move-object/from16 v32, v27

    .line 338
    .line 339
    move-object/from16 v27, v12

    .line 340
    .line 341
    iget-object v12, v5, La/xcn;->u:La/d1p;

    .line 342
    .line 343
    move-object/from16 v33, v3

    .line 344
    .line 345
    iget-object v3, v5, La/xcn;->v:La/drm0;

    .line 346
    .line 347
    move-object/from16 v34, v3

    .line 348
    .line 349
    iget-object v3, v5, La/xcn;->w:La/v88;

    .line 350
    .line 351
    move-object/from16 v35, v14

    .line 352
    .line 353
    iget-object v14, v5, La/xcn;->x:La/onv;

    .line 354
    .line 355
    move-object/from16 v36, v3

    .line 356
    .line 357
    iget-object v3, v5, La/xcn;->y:La/kt2;

    .line 358
    .line 359
    move-object/from16 v37, v3

    .line 360
    .line 361
    iget-object v3, v5, La/xcn;->z:La/peg0;

    .line 362
    .line 363
    move-object/from16 v38, v3

    .line 364
    .line 365
    iget-object v3, v5, La/xcn;->A:La/vwb0;

    .line 366
    .line 367
    move-object/from16 v39, v3

    .line 368
    .line 369
    iget-object v3, v5, La/xcn;->B:La/ouu;

    .line 370
    .line 371
    move/from16 v40, v26

    .line 372
    .line 373
    move-object/from16 v26, v15

    .line 374
    .line 375
    iget-object v15, v5, La/xcn;->C:La/jw20;

    .line 376
    .line 377
    move-object/from16 v41, v3

    .line 378
    .line 379
    iget-object v3, v5, La/xcn;->D:La/cs00;

    .line 380
    .line 381
    move-object/from16 v42, v3

    .line 382
    .line 383
    iget-object v3, v7, La/hoi;->f:La/n5d0;

    .line 384
    .line 385
    invoke-interface {v3}, La/o5d0;->get()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v3

    .line 389
    check-cast v3, La/adn;

    .line 390
    .line 391
    move-object/from16 v43, v3

    .line 392
    .line 393
    iget-object v3, v5, La/xcn;->E:La/edo;

    .line 394
    .line 395
    move-object/from16 v44, v3

    .line 396
    .line 397
    iget-object v3, v5, La/xcn;->F:La/zfo;

    .line 398
    .line 399
    move-object/from16 v45, v3

    .line 400
    .line 401
    iget-object v3, v5, La/xcn;->H:La/u8u;

    .line 402
    .line 403
    move-object/from16 v46, v3

    .line 404
    .line 405
    iget-object v3, v5, La/xcn;->I:La/edu;

    .line 406
    .line 407
    move-object/from16 v47, v3

    .line 408
    .line 409
    iget-object v3, v5, La/xcn;->G:La/pmi;

    .line 410
    .line 411
    move-object/from16 v48, v3

    .line 412
    .line 413
    iget-object v3, v5, La/xcn;->J:La/bzu;

    .line 414
    .line 415
    move-object/from16 v49, v3

    .line 416
    .line 417
    iget-object v3, v5, La/xcn;->K:La/o2j0;

    .line 418
    .line 419
    move-object/from16 v50, v3

    .line 420
    .line 421
    iget-object v3, v5, La/xcn;->L:La/vqc;

    .line 422
    .line 423
    move-object/from16 v51, v3

    .line 424
    .line 425
    iget-object v3, v5, La/xcn;->N:La/qoi;

    .line 426
    .line 427
    iget-object v5, v5, La/xcn;->M:La/ndf0;

    .line 428
    .line 429
    iget-object v7, v7, La/hoi;->d:La/h7u;

    .line 430
    .line 431
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 432
    .line 433
    .line 434
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 441
    .line 442
    .line 443
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 444
    .line 445
    .line 446
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 447
    .line 448
    .line 449
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    .line 451
    .line 452
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 453
    .line 454
    .line 455
    invoke-virtual/range {v35 .. v35}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 456
    .line 457
    .line 458
    invoke-virtual/range {v27 .. v27}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 459
    .line 460
    .line 461
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 462
    .line 463
    .line 464
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 465
    .line 466
    .line 467
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 471
    .line 472
    .line 473
    invoke-virtual/range {v30 .. v30}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 474
    .line 475
    .line 476
    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    invoke-virtual/range {v33 .. v33}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 480
    .line 481
    .line 482
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 483
    .line 484
    .line 485
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 489
    .line 490
    .line 491
    invoke-virtual/range {v44 .. v44}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 492
    .line 493
    .line 494
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 495
    .line 496
    .line 497
    invoke-virtual/range {v50 .. v50}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    move-object/from16 v21, v3

    .line 501
    .line 502
    new-instance v3, La/wfi;

    .line 503
    .line 504
    move-object/from16 v52, v32

    .line 505
    .line 506
    move-object/from16 v32, v33

    .line 507
    .line 508
    move-object/from16 v16, v34

    .line 509
    .line 510
    move-object/from16 v33, v36

    .line 511
    .line 512
    move-object/from16 v34, v37

    .line 513
    .line 514
    move-object/from16 v35, v38

    .line 515
    .line 516
    move-object/from16 v36, v41

    .line 517
    .line 518
    move-object/from16 v37, v43

    .line 519
    .line 520
    move-object/from16 v38, v44

    .line 521
    .line 522
    move-object/from16 v41, v45

    .line 523
    .line 524
    move-object/from16 v39, v46

    .line 525
    .line 526
    move-object/from16 v40, v47

    .line 527
    .line 528
    move-object/from16 v42, v48

    .line 529
    .line 530
    move-object/from16 v18, v49

    .line 531
    .line 532
    move-object/from16 v20, v51

    .line 533
    .line 534
    const/4 v1, 0x0

    .line 535
    move-object/from16 v43, v5

    .line 536
    .line 537
    move-object/from16 v44, v7

    .line 538
    .line 539
    move-object/from16 v5, v19

    .line 540
    .line 541
    move-object/from16 v7, v22

    .line 542
    .line 543
    move-object/from16 v19, v50

    .line 544
    .line 545
    move-object/from16 v22, p2

    .line 546
    .line 547
    invoke-direct/range {v3 .. v44}, La/wfi;-><init>(La/cad;La/pcl0;La/sue;La/rmd0;La/iip;La/iw20;La/fvt0;La/onv;La/d1p;La/wsf0;La/onv;La/jw20;La/drm0;La/pdf0;La/bzu;La/o2j0;La/vqc;La/qoi;Lorg/xplatform/sportgame/markets/base/api/navigation/MarketsParams$DuelSubGame;La/i1w0;La/wdk0;La/lgn0;La/duj;La/ctf0;La/gst0;La/j1q0;La/r9u;La/ii;La/knf0;La/v88;La/kt2;La/peg0;La/ouu;La/adn;La/edo;La/u8u;La/edu;La/zfo;La/pmi;La/ndf0;La/h7u;)V

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 551
    .line 552
    .line 553
    move-object v5, v3

    .line 554
    goto :goto_e

    .line 555
    :cond_d
    move-object/from16 v52, v11

    .line 556
    .line 557
    const/4 v1, 0x0

    .line 558
    iget-object v9, v9, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 559
    .line 560
    move-object/from16 v1, p0

    .line 561
    .line 562
    move-object/from16 v3, p2

    .line 563
    .line 564
    move/from16 v4, p4

    .line 565
    .line 566
    goto/16 :goto_c

    .line 567
    .line 568
    :cond_e
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 569
    .line 570
    .line 571
    return-void

    .line 572
    :cond_f
    move-object/from16 v52, v11

    .line 573
    .line 574
    const/4 v1, 0x0

    .line 575
    add-int/lit8 v15, v15, -0x1

    .line 576
    .line 577
    move-object/from16 v1, p0

    .line 578
    .line 579
    move-object/from16 v3, p2

    .line 580
    .line 581
    move/from16 v4, p4

    .line 582
    .line 583
    goto/16 :goto_b

    .line 584
    .line 585
    :cond_10
    move-object/from16 v52, v11

    .line 586
    .line 587
    const/4 v1, 0x0

    .line 588
    iget-object v3, v2, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 589
    .line 590
    if-eqz v3, :cond_11

    .line 591
    .line 592
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 593
    .line 594
    .line 595
    move-result-object v12

    .line 596
    move-object v14, v12

    .line 597
    goto :goto_d

    .line 598
    :cond_11
    move-object v14, v1

    .line 599
    :goto_d
    move-object/from16 v1, p0

    .line 600
    .line 601
    move-object/from16 v3, p2

    .line 602
    .line 603
    move/from16 v4, p4

    .line 604
    .line 605
    move-object/from16 v11, v52

    .line 606
    .line 607
    goto/16 :goto_a

    .line 608
    .line 609
    :cond_12
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 610
    .line 611
    .line 612
    return-void

    .line 613
    :cond_13
    const-string v0, "Cannot create dependency "

    .line 614
    .line 615
    invoke-static {v13, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 616
    .line 617
    .line 618
    move-result-object v0

    .line 619
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 620
    .line 621
    .line 622
    return-void

    .line 623
    :cond_14
    move-object/from16 v52, v11

    .line 624
    .line 625
    const/4 v1, 0x0

    .line 626
    :goto_e
    check-cast v5, La/wcn;

    .line 627
    .line 628
    new-instance v3, La/q0h0;

    .line 629
    .line 630
    move-object v4, v5

    .line 631
    check-cast v4, La/wfi;

    .line 632
    .line 633
    iget-object v4, v4, La/wfi;->P:La/n5d0;

    .line 634
    .line 635
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v4

    .line 639
    check-cast v4, La/vcn;

    .line 640
    .line 641
    invoke-direct {v3, v4}, La/q0h0;-><init>(La/p0h0;)V

    .line 642
    .line 643
    .line 644
    const-class v4, La/sdn;

    .line 645
    .line 646
    sget-object v6, La/sre0;->a:La/tre0;

    .line 647
    .line 648
    invoke-virtual {v6, v4}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 649
    .line 650
    .line 651
    move-result-object v4

    .line 652
    sget v6, La/sdn;->B:I

    .line 653
    .line 654
    const/16 v6, 0xe

    .line 655
    .line 656
    invoke-static {v4, v1, v3, v0, v6}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 657
    .line 658
    .line 659
    move-result-object v10

    .line 660
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 661
    .line 662
    .line 663
    move-result-object v3

    .line 664
    move-object/from16 v11, v52

    .line 665
    .line 666
    if-ne v3, v11, :cond_15

    .line 667
    .line 668
    move-object v3, v5

    .line 669
    check-cast v3, La/wfi;

    .line 670
    .line 671
    iget-object v3, v3, La/wfi;->K:La/ii;

    .line 672
    .line 673
    invoke-virtual {v0, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 674
    .line 675
    .line 676
    :cond_15
    check-cast v3, La/ii;

    .line 677
    .line 678
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v4

    .line 682
    if-ne v4, v11, :cond_16

    .line 683
    .line 684
    move-object v4, v5

    .line 685
    check-cast v4, La/wfi;

    .line 686
    .line 687
    iget-object v4, v4, La/wfi;->L:La/wdk0;

    .line 688
    .line 689
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 690
    .line 691
    .line 692
    :cond_16
    move-object v8, v4

    .line 693
    check-cast v8, La/wdk0;

    .line 694
    .line 695
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 696
    .line 697
    .line 698
    move-result-object v4

    .line 699
    if-ne v4, v11, :cond_17

    .line 700
    .line 701
    move-object v4, v5

    .line 702
    check-cast v4, La/wfi;

    .line 703
    .line 704
    iget-object v4, v4, La/wfi;->M:La/lgn0;

    .line 705
    .line 706
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 707
    .line 708
    .line 709
    :cond_17
    move-object v7, v4

    .line 710
    check-cast v7, La/lgn0;

    .line 711
    .line 712
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v4

    .line 716
    if-ne v4, v11, :cond_18

    .line 717
    .line 718
    move-object v4, v5

    .line 719
    check-cast v4, La/wfi;

    .line 720
    .line 721
    iget-object v4, v4, La/wfi;->N:La/onv;

    .line 722
    .line 723
    iget-object v4, v4, La/onv;->a:Ljava/lang/Object;

    .line 724
    .line 725
    check-cast v4, La/ali;

    .line 726
    .line 727
    invoke-virtual {v4}, La/ali;->z()La/e720;

    .line 728
    .line 729
    .line 730
    move-result-object v4

    .line 731
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 732
    .line 733
    .line 734
    :cond_18
    move-object v6, v4

    .line 735
    check-cast v6, La/e720;

    .line 736
    .line 737
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 738
    .line 739
    .line 740
    move-result-object v4

    .line 741
    if-ne v4, v11, :cond_19

    .line 742
    .line 743
    move-object v4, v5

    .line 744
    check-cast v4, La/wfi;

    .line 745
    .line 746
    iget-object v4, v4, La/wfi;->C:La/qoi;

    .line 747
    .line 748
    invoke-virtual {v4}, La/qoi;->a()La/qta0;

    .line 749
    .line 750
    .line 751
    move-result-object v4

    .line 752
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 753
    .line 754
    .line 755
    :cond_19
    move-object v9, v4

    .line 756
    check-cast v9, La/qta0;

    .line 757
    .line 758
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 759
    .line 760
    .line 761
    move-result-object v4

    .line 762
    if-ne v4, v11, :cond_1a

    .line 763
    .line 764
    move-object v4, v5

    .line 765
    check-cast v4, La/wfi;

    .line 766
    .line 767
    iget-object v4, v4, La/wfi;->y:La/sue;

    .line 768
    .line 769
    invoke-interface {v4}, La/sue;->w()La/vq;

    .line 770
    .line 771
    .line 772
    move-result-object v4

    .line 773
    invoke-static {v4}, La/x1x;->x(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 777
    .line 778
    .line 779
    :cond_1a
    check-cast v4, La/vq;

    .line 780
    .line 781
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v12

    .line 785
    if-ne v12, v11, :cond_1b

    .line 786
    .line 787
    check-cast v5, La/wfi;

    .line 788
    .line 789
    iget-object v12, v5, La/wfi;->O:La/ndf0;

    .line 790
    .line 791
    invoke-virtual {v0, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 792
    .line 793
    .line 794
    :cond_1b
    check-cast v12, La/ndf0;

    .line 795
    .line 796
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 797
    .line 798
    .line 799
    move-result-object v5

    .line 800
    if-ne v5, v11, :cond_1c

    .line 801
    .line 802
    new-instance v2, La/z430;

    .line 803
    .line 804
    move-object v5, v3

    .line 805
    move-object/from16 v3, p1

    .line 806
    .line 807
    invoke-direct/range {v2 .. v9}, La/z430;-><init>(Landroidx/fragment/app/Fragment;La/vq;La/ii;La/e720;La/lgn0;La/wdk0;La/qta0;)V

    .line 808
    .line 809
    .line 810
    new-instance v3, La/zq2;

    .line 811
    .line 812
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 813
    .line 814
    .line 815
    new-instance v4, La/ebh;

    .line 816
    .line 817
    const/4 v5, 0x5

    .line 818
    invoke-direct {v4, v10, v5}, La/ebh;-><init>(La/k3t0;B)V

    .line 819
    .line 820
    .line 821
    invoke-virtual {v2, v3, v4}, La/z430;->b(La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 825
    .line 826
    .line 827
    move-object v5, v2

    .line 828
    :cond_1c
    check-cast v5, La/z430;

    .line 829
    .line 830
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 831
    .line 832
    .line 833
    move-result-object v2

    .line 834
    if-ne v2, v11, :cond_1d

    .line 835
    .line 836
    sget-object v2, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 837
    .line 838
    invoke-static {v2, v0}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 839
    .line 840
    .line 841
    move-result-object v2

    .line 842
    invoke-virtual {v0, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    :cond_1d
    check-cast v2, La/vne;

    .line 846
    .line 847
    invoke-virtual {v0, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 848
    .line 849
    .line 850
    move-result v3

    .line 851
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v4

    .line 855
    or-int/2addr v3, v4

    .line 856
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 857
    .line 858
    .line 859
    move-result-object v4

    .line 860
    const/16 v6, 0x1d

    .line 861
    .line 862
    if-nez v3, :cond_1e

    .line 863
    .line 864
    if-ne v4, v11, :cond_1f

    .line 865
    .line 866
    :cond_1e
    new-instance v4, La/ka70;

    .line 867
    .line 868
    invoke-direct {v4, v5, v10, v6}, La/ka70;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 869
    .line 870
    .line 871
    invoke-virtual {v0, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 872
    .line 873
    .line 874
    :cond_1f
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 875
    .line 876
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 877
    .line 878
    invoke-virtual {v0, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 879
    .line 880
    .line 881
    move-result v5

    .line 882
    invoke-virtual {v0, v10}, La/fet;->i(Ljava/lang/Object;)Z

    .line 883
    .line 884
    .line 885
    move-result v7

    .line 886
    or-int/2addr v5, v7

    .line 887
    invoke-virtual {v0, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 888
    .line 889
    .line 890
    move-result v7

    .line 891
    or-int/2addr v5, v7

    .line 892
    invoke-virtual {v0, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    or-int/2addr v1, v5

    .line 897
    invoke-virtual {v0}, La/fet;->P()Ljava/lang/Object;

    .line 898
    .line 899
    .line 900
    move-result-object v5

    .line 901
    if-nez v1, :cond_20

    .line 902
    .line 903
    if-ne v5, v11, :cond_21

    .line 904
    .line 905
    :cond_20
    new-instance v5, La/et;

    .line 906
    .line 907
    invoke-direct {v5, v2, v10, v4, v6}, La/et;-><init>(La/vne;La/k3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 908
    .line 909
    .line 910
    invoke-virtual {v0, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 911
    .line 912
    .line 913
    :cond_21
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 914
    .line 915
    invoke-static {v3, v5, v0}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 916
    .line 917
    .line 918
    move-object v4, v10

    .line 919
    check-cast v4, La/i3t0;

    .line 920
    .line 921
    invoke-virtual {v4, v0}, La/i3t0;->y(La/fet;)La/pz40;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    move-object v3, v1

    .line 930
    check-cast v3, La/gdn;

    .line 931
    .line 932
    if-eqz v3, :cond_24

    .line 933
    .line 934
    instance-of v1, v3, La/edn;

    .line 935
    .line 936
    if-eqz v1, :cond_22

    .line 937
    .line 938
    const v1, -0x28977218

    .line 939
    .line 940
    .line 941
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 942
    .line 943
    .line 944
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 945
    .line 946
    move-object/from16 v8, p0

    .line 947
    .line 948
    invoke-interface {v8, v1}, La/mm40;->e(La/mm40;)La/mm40;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    check-cast v3, La/edn;

    .line 953
    .line 954
    iget-object v1, v3, La/edn;->a:La/udl0;

    .line 955
    .line 956
    iget-boolean v4, v3, La/edn;->b:Z

    .line 957
    .line 958
    const/4 v6, 0x0

    .line 959
    const/4 v7, 0x0

    .line 960
    move-object v5, v0

    .line 961
    move-object v3, v1

    .line 962
    invoke-static/range {v2 .. v7}, La/tfx;->e(La/mm40;La/udl0;ZLa/fet;II)V

    .line 963
    .line 964
    .line 965
    const/4 v9, 0x0

    .line 966
    invoke-virtual {v0, v9}, La/fet;->r(Z)V

    .line 967
    .line 968
    .line 969
    move-object/from16 v6, p1

    .line 970
    .line 971
    move-object v12, v0

    .line 972
    goto/16 :goto_10

    .line 973
    .line 974
    :cond_22
    move-object/from16 v8, p0

    .line 975
    .line 976
    const/4 v9, 0x0

    .line 977
    instance-of v1, v3, La/fdn;

    .line 978
    .line 979
    if-eqz v1, :cond_23

    .line 980
    .line 981
    const v1, -0x2893178c

    .line 982
    .line 983
    .line 984
    invoke-virtual {v0, v1}, La/fet;->e0(I)V

    .line 985
    .line 986
    .line 987
    sget-object v1, La/qmk;->a:La/zcl;

    .line 988
    .line 989
    invoke-static {v0}, La/qmk;->a(La/fet;)La/wfn;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    iget v1, v1, La/wfn;->c:F

    .line 994
    .line 995
    sget-object v2, La/zaq0;->b:La/zfn;

    .line 996
    .line 997
    invoke-virtual {v0, v2}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 998
    .line 999
    .line 1000
    move-result-object v2

    .line 1001
    check-cast v2, Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 1002
    .line 1003
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackground-0d7_KjU()J

    .line 1004
    .line 1005
    .line 1006
    move-result-wide v4

    .line 1007
    sget-object v2, La/jd8;->n:La/ljc;

    .line 1008
    .line 1009
    invoke-static {v8, v4, v5, v2}, La/i120;->Q(La/mm40;JLa/yjj0;)La/mm40;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v2

    .line 1013
    check-cast v3, La/fdn;

    .line 1014
    .line 1015
    iget-object v6, v3, La/fdn;->b:Lorg/xplatform/related/api/presentation/RelatedParams;

    .line 1016
    .line 1017
    sget-object v3, La/o7k0;->c:La/n0q;

    .line 1018
    .line 1019
    const/4 v4, 0x0

    .line 1020
    const/4 v13, 0x2

    .line 1021
    invoke-static {v3, v1, v4, v13}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 1022
    .line 1023
    .line 1024
    move-result-object v4

    .line 1025
    move-object/from16 v5, p1

    .line 1026
    .line 1027
    move-object v7, v0

    .line 1028
    move-object v3, v2

    .line 1029
    move-object v2, v12

    .line 1030
    invoke-virtual/range {v2 .. v7}, La/ndf0;->a(La/mm40;La/mm40;Landroidx/fragment/app/Fragment;Lorg/xplatform/related/api/presentation/RelatedParams;La/fet;)V

    .line 1031
    .line 1032
    .line 1033
    move-object v6, v5

    .line 1034
    move-object v12, v7

    .line 1035
    invoke-virtual {v12, v9}, La/fet;->r(Z)V

    .line 1036
    .line 1037
    .line 1038
    goto/16 :goto_10

    .line 1039
    .line 1040
    :cond_23
    move-object/from16 v6, p1

    .line 1041
    .line 1042
    move-object v12, v0

    .line 1043
    instance-of v0, v3, La/ddn;

    .line 1044
    .line 1045
    if-eqz v0, :cond_25

    .line 1046
    .line 1047
    const v0, -0x288a3e7d

    .line 1048
    .line 1049
    .line 1050
    invoke-virtual {v12, v0}, La/fet;->e0(I)V

    .line 1051
    .line 1052
    .line 1053
    move-object v0, v3

    .line 1054
    check-cast v0, La/ddn;

    .line 1055
    .line 1056
    iget-object v1, v0, La/ddn;->c:La/a4x;

    .line 1057
    .line 1058
    invoke-static {v1, v12}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    sget-object v1, La/kr00;->a:La/zfn;

    .line 1063
    .line 1064
    iget-boolean v0, v0, La/ddn;->d:Z

    .line 1065
    .line 1066
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v0

    .line 1070
    invoke-virtual {v1, v0}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v7

    .line 1074
    new-instance v0, La/iop;

    .line 1075
    .line 1076
    const/4 v5, 0x1

    .line 1077
    move-object v1, v8

    .line 1078
    invoke-direct/range {v0 .. v5}, La/iop;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1079
    .line 1080
    .line 1081
    const v1, -0x164af02f

    .line 1082
    .line 1083
    .line 1084
    invoke-static {v1, v0, v12}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v0

    .line 1088
    const/16 v1, 0x38

    .line 1089
    .line 1090
    invoke-static {v7, v0, v12, v1}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v12, v9}, La/fet;->r(Z)V

    .line 1094
    .line 1095
    .line 1096
    goto :goto_10

    .line 1097
    :cond_24
    move-object v12, v0

    .line 1098
    const/4 v9, 0x0

    .line 1099
    :cond_25
    const v0, 0x27fb1f97

    .line 1100
    .line 1101
    .line 1102
    invoke-static {v0, v12, v9}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1103
    .line 1104
    .line 1105
    move-result-object v0

    .line 1106
    throw v0

    .line 1107
    :cond_26
    move-object v12, v0

    .line 1108
    move-object v6, v2

    .line 1109
    const/4 v1, 0x0

    .line 1110
    const/4 v9, 0x0

    .line 1111
    const/4 v13, 0x2

    .line 1112
    add-int/lit8 v7, v7, -0x1

    .line 1113
    .line 1114
    move-object/from16 v1, p0

    .line 1115
    .line 1116
    move-object/from16 v3, p2

    .line 1117
    .line 1118
    move/from16 v4, p4

    .line 1119
    .line 1120
    goto/16 :goto_7

    .line 1121
    .line 1122
    :cond_27
    move-object v12, v0

    .line 1123
    move-object v6, v2

    .line 1124
    const/4 v1, 0x0

    .line 1125
    const/4 v9, 0x0

    .line 1126
    const/4 v13, 0x2

    .line 1127
    iget-object v0, v6, Landroidx/fragment/app/Fragment;->y:Landroidx/fragment/app/Fragment;

    .line 1128
    .line 1129
    if-eqz v0, :cond_28

    .line 1130
    .line 1131
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v0

    .line 1135
    move-object v5, v0

    .line 1136
    goto :goto_f

    .line 1137
    :cond_28
    move-object v5, v1

    .line 1138
    :goto_f
    move-object/from16 v1, p0

    .line 1139
    .line 1140
    move-object/from16 v3, p2

    .line 1141
    .line 1142
    move/from16 v4, p4

    .line 1143
    .line 1144
    move-object v2, v6

    .line 1145
    move-object v0, v12

    .line 1146
    goto/16 :goto_6

    .line 1147
    .line 1148
    :cond_29
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 1149
    .line 1150
    .line 1151
    return-void

    .line 1152
    :cond_2a
    move-object v12, v0

    .line 1153
    move-object v6, v2

    .line 1154
    invoke-virtual {v12}, La/fet;->X()V

    .line 1155
    .line 1156
    .line 1157
    :goto_10
    invoke-virtual {v12}, La/fet;->u()La/yfe0;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v7

    .line 1161
    if-eqz v7, :cond_2b

    .line 1162
    .line 1163
    new-instance v0, La/la70;

    .line 1164
    .line 1165
    const/16 v5, 0xc

    .line 1166
    .line 1167
    move-object/from16 v1, p0

    .line 1168
    .line 1169
    move-object/from16 v3, p2

    .line 1170
    .line 1171
    move/from16 v4, p4

    .line 1172
    .line 1173
    move-object v2, v6

    .line 1174
    invoke-direct/range {v0 .. v5}, La/la70;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 1175
    .line 1176
    .line 1177
    iput-object v0, v7, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1178
    .line 1179
    :cond_2b
    return-void
.end method
