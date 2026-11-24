.class public abstract La/bbo0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/mm40;La/yx5;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/ebo0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;La/xdr;La/fet;I)V
    .locals 63

    .line 1
    move-object/from16 v2, p1

    .line 2
    .line 3
    move-object/from16 v9, p2

    .line 4
    .line 5
    move-object/from16 v10, p7

    .line 6
    .line 7
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual/range {p6 .. p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const v0, -0x24b78cb    # -2.9995384E37f

    .line 20
    .line 21
    .line 22
    invoke-virtual {v10, v0}, La/fet;->g0(I)La/fet;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v10, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    const/16 v0, 0x20

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const/16 v0, 0x10

    .line 35
    .line 36
    :goto_0
    or-int v0, p8, v0

    .line 37
    .line 38
    invoke-virtual {v10, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/16 v3, 0x100

    .line 43
    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    move v1, v3

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const/16 v1, 0x80

    .line 49
    .line 50
    :goto_1
    or-int/2addr v0, v1

    .line 51
    move-object/from16 v15, p3

    .line 52
    .line 53
    invoke-virtual {v10, v15}, La/fet;->g(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    const/16 v1, 0x800

    .line 60
    .line 61
    goto :goto_2

    .line 62
    :cond_2
    const/16 v1, 0x400

    .line 63
    .line 64
    :goto_2
    or-int/2addr v0, v1

    .line 65
    move-object/from16 v7, p4

    .line 66
    .line 67
    invoke-virtual {v10, v7}, La/fet;->i(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    const/16 v1, 0x4000

    .line 74
    .line 75
    goto :goto_3

    .line 76
    :cond_3
    const/16 v1, 0x2000

    .line 77
    .line 78
    :goto_3
    or-int/2addr v0, v1

    .line 79
    move-object/from16 v5, p5

    .line 80
    .line 81
    invoke-virtual {v10, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    const/high16 v1, 0x20000

    .line 88
    .line 89
    goto :goto_4

    .line 90
    :cond_4
    const/high16 v1, 0x10000

    .line 91
    .line 92
    :goto_4
    or-int/2addr v0, v1

    .line 93
    move-object/from16 v1, p6

    .line 94
    .line 95
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    if-eqz v8, :cond_5

    .line 100
    .line 101
    const/high16 v8, 0x100000

    .line 102
    .line 103
    goto :goto_5

    .line 104
    :cond_5
    const/high16 v8, 0x80000

    .line 105
    .line 106
    :goto_5
    or-int/2addr v0, v8

    .line 107
    const v8, 0x92493

    .line 108
    .line 109
    .line 110
    and-int/2addr v8, v0

    .line 111
    const v13, 0x92492

    .line 112
    .line 113
    .line 114
    const/4 v14, 0x0

    .line 115
    if-eq v8, v13, :cond_6

    .line 116
    .line 117
    const/4 v8, 0x1

    .line 118
    goto :goto_6

    .line 119
    :cond_6
    move v8, v14

    .line 120
    :goto_6
    and-int/lit8 v13, v0, 0x1

    .line 121
    .line 122
    invoke-virtual {v10, v13, v8}, La/fet;->U(IZ)Z

    .line 123
    .line 124
    .line 125
    move-result v8

    .line 126
    if-eqz v8, :cond_37

    .line 127
    .line 128
    new-array v8, v14, [Ljava/lang/Object;

    .line 129
    .line 130
    and-int/lit16 v13, v0, 0x380

    .line 131
    .line 132
    if-ne v13, v3, :cond_7

    .line 133
    .line 134
    const/4 v3, 0x1

    .line 135
    goto :goto_7

    .line 136
    :cond_7
    move v3, v14

    .line 137
    :goto_7
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v13

    .line 141
    sget-object v12, La/ukd;->a:La/cl5;

    .line 142
    .line 143
    if-nez v3, :cond_8

    .line 144
    .line 145
    if-ne v13, v12, :cond_9

    .line 146
    .line 147
    :cond_8
    new-instance v13, La/jfm0;

    .line 148
    .line 149
    const/16 v3, 0x17

    .line 150
    .line 151
    invoke-direct {v13, v9, v3}, La/jfm0;-><init>(Ljava/lang/Object;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v10, v13}, La/fet;->o0(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    :cond_9
    check-cast v13, Lkotlin/jvm/functions/Function0;

    .line 158
    .line 159
    invoke-static {v8, v13, v10, v14}, La/e9x;->Q([Ljava/lang/Object;Lkotlin/jvm/functions/Function0;La/fet;I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;

    .line 164
    .line 165
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v8

    .line 169
    if-ne v8, v12, :cond_12

    .line 170
    .line 171
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 172
    .line 173
    .line 174
    move-result-object v8

    .line 175
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 176
    .line 177
    .line 178
    move-result-object v18

    .line 179
    invoke-virtual/range {v18 .. v18}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 180
    .line 181
    .line 182
    move-result-object v4

    .line 183
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    instance-of v14, v4, La/af3;

    .line 187
    .line 188
    if-eqz v14, :cond_a

    .line 189
    .line 190
    check-cast v4, La/af3;

    .line 191
    .line 192
    goto :goto_8

    .line 193
    :cond_a
    const/4 v4, 0x0

    .line 194
    :goto_8
    const-class v14, La/urk0;

    .line 195
    .line 196
    if-eqz v4, :cond_11

    .line 197
    .line 198
    invoke-interface {v4}, La/af3;->d()La/wcf0;

    .line 199
    .line 200
    .line 201
    move-result-object v4

    .line 202
    invoke-virtual {v4, v14}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v4

    .line 206
    check-cast v4, La/o5d0;

    .line 207
    .line 208
    if-eqz v4, :cond_b

    .line 209
    .line 210
    invoke-interface {v4}, La/o5d0;->get()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v4

    .line 214
    check-cast v4, La/ze3;

    .line 215
    .line 216
    goto :goto_9

    .line 217
    :cond_b
    const/4 v4, 0x0

    .line 218
    :goto_9
    instance-of v13, v4, La/urk0;

    .line 219
    .line 220
    if-nez v13, :cond_c

    .line 221
    .line 222
    const/4 v4, 0x0

    .line 223
    :cond_c
    check-cast v4, La/urk0;

    .line 224
    .line 225
    if-eqz v4, :cond_11

    .line 226
    .line 227
    invoke-static {v2}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 228
    .line 229
    .line 230
    move-result-object v42

    .line 231
    sget-object v13, La/xnk0;->a:Ljava/util/LinkedHashMap;

    .line 232
    .line 233
    iget v13, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->a:I

    .line 234
    .line 235
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 236
    .line 237
    .line 238
    move-result-object v14

    .line 239
    iget-object v14, v14, La/cb50;->a:Ljava/lang/String;

    .line 240
    .line 241
    invoke-static {v13, v14}, La/xnk0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    invoke-virtual {v8}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {v6, v14}, La/xnk0;->c(Landroid/app/Application;Ljava/lang/String;)La/cui;

    .line 253
    .line 254
    .line 255
    move-result-object v27

    .line 256
    sget-object v6, La/xbv0;->a:Ljava/util/LinkedHashMap;

    .line 257
    .line 258
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    iget-object v6, v6, La/cb50;->a:Ljava/lang/String;

    .line 263
    .line 264
    invoke-static {v13, v6}, La/xbv0;->b(ILjava/lang/String;)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v8}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 269
    .line 270
    .line 271
    move-result-object v14

    .line 272
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 273
    .line 274
    .line 275
    invoke-static {v14, v6}, La/xbv0;->c(Landroid/app/Application;Ljava/lang/String;)La/ozi;

    .line 276
    .line 277
    .line 278
    move-result-object v29

    .line 279
    sget-object v6, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 280
    .line 281
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 282
    .line 283
    .line 284
    move-result-object v6

    .line 285
    iget-object v6, v6, La/cb50;->a:Ljava/lang/String;

    .line 286
    .line 287
    sget-object v14, La/h3l;->a:Ljava/util/LinkedHashMap;

    .line 288
    .line 289
    invoke-static {v13, v6}, La/h3l;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 290
    .line 291
    .line 292
    move-result-object v6

    .line 293
    invoke-virtual {v14, v6}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    .line 295
    .line 296
    move-result-object v6

    .line 297
    move-object/from16 v30, v6

    .line 298
    .line 299
    check-cast v30, La/f3l;

    .line 300
    .line 301
    const-string v6, "Can\'t find feature provider!"

    .line 302
    .line 303
    if-eqz v30, :cond_10

    .line 304
    .line 305
    sget-object v14, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 306
    .line 307
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 308
    .line 309
    .line 310
    move-result-object v14

    .line 311
    iget-object v14, v14, La/cb50;->a:Ljava/lang/String;

    .line 312
    .line 313
    sget-object v11, La/tz00;->a:Ljava/util/LinkedHashMap;

    .line 314
    .line 315
    invoke-static {v13, v14}, La/tz00;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v14

    .line 319
    invoke-virtual {v11, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v11

    .line 323
    move-object/from16 v31, v11

    .line 324
    .line 325
    check-cast v31, La/rz00;

    .line 326
    .line 327
    if-eqz v31, :cond_f

    .line 328
    .line 329
    sget-object v11, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 330
    .line 331
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 332
    .line 333
    .line 334
    move-result-object v11

    .line 335
    iget-object v11, v11, La/cb50;->a:Ljava/lang/String;

    .line 336
    .line 337
    sget-object v14, La/ih9;->a:Ljava/util/LinkedHashMap;

    .line 338
    .line 339
    invoke-static {v13, v11}, La/ih9;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v11

    .line 343
    invoke-virtual {v14, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v11

    .line 347
    move-object/from16 v32, v11

    .line 348
    .line 349
    check-cast v32, La/gh9;

    .line 350
    .line 351
    if-eqz v32, :cond_e

    .line 352
    .line 353
    sget-object v11, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 354
    .line 355
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 356
    .line 357
    .line 358
    move-result-object v11

    .line 359
    iget-object v11, v11, La/cb50;->a:Ljava/lang/String;

    .line 360
    .line 361
    sget-object v14, La/xpk0;->a:Ljava/util/LinkedHashMap;

    .line 362
    .line 363
    invoke-static {v13, v11}, La/xpk0;->a(ILjava/lang/String;)Ljava/lang/String;

    .line 364
    .line 365
    .line 366
    move-result-object v11

    .line 367
    invoke-virtual {v14, v11}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    move-object/from16 v35, v11

    .line 372
    .line 373
    check-cast v35, La/vpk0;

    .line 374
    .line 375
    if-eqz v35, :cond_d

    .line 376
    .line 377
    sget-object v6, La/n8l0;->a:Ljava/util/LinkedHashMap;

    .line 378
    .line 379
    invoke-virtual {v8}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-static {v2}, La/efx;->v(Landroidx/fragment/app/Fragment;)La/cb50;

    .line 387
    .line 388
    .line 389
    move-result-object v8

    .line 390
    iget-object v8, v8, La/cb50;->a:Ljava/lang/String;

    .line 391
    .line 392
    iget-object v11, v3, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 393
    .line 394
    iget-object v11, v11, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a:Ljava/lang/String;

    .line 395
    .line 396
    invoke-static {v13, v8, v11}, La/n8l0;->b(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 397
    .line 398
    .line 399
    move-result-object v8

    .line 400
    const-string v11, "SPORT_FILTER_IDS_KEY_V2"

    .line 401
    .line 402
    invoke-static {v6, v8, v11, v13}, La/n8l0;->c(Landroid/app/Application;Ljava/lang/String;Ljava/lang/String;I)La/lui;

    .line 403
    .line 404
    .line 405
    move-result-object v36

    .line 406
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    iget-object v6, v4, La/urk0;->N:La/oar0;

    .line 410
    .line 411
    iget-object v8, v4, La/urk0;->M:La/m6m0;

    .line 412
    .line 413
    iget-object v11, v4, La/urk0;->a:La/cad;

    .line 414
    .line 415
    iget-object v13, v4, La/urk0;->g:La/iw20;

    .line 416
    .line 417
    iget-object v14, v4, La/urk0;->b:La/ctf0;

    .line 418
    .line 419
    move/from16 v62, v0

    .line 420
    .line 421
    iget-object v0, v4, La/urk0;->c:La/m1e;

    .line 422
    .line 423
    move-object/from16 v43, v0

    .line 424
    .line 425
    iget-object v0, v4, La/urk0;->d:La/duj;

    .line 426
    .line 427
    move-object/from16 v44, v0

    .line 428
    .line 429
    iget-object v0, v4, La/urk0;->e:La/iip;

    .line 430
    .line 431
    move-object/from16 v21, v0

    .line 432
    .line 433
    iget-object v0, v4, La/urk0;->f:La/itr;

    .line 434
    .line 435
    move-object/from16 v20, v0

    .line 436
    .line 437
    iget-object v0, v4, La/urk0;->h:La/gii0;

    .line 438
    .line 439
    move-object/from16 v45, v0

    .line 440
    .line 441
    iget-object v0, v4, La/urk0;->i:La/knf0;

    .line 442
    .line 443
    move-object/from16 v46, v0

    .line 444
    .line 445
    iget-object v0, v4, La/urk0;->j:La/j1q0;

    .line 446
    .line 447
    move-object/from16 v18, v0

    .line 448
    .line 449
    iget-object v0, v4, La/urk0;->m:La/xr;

    .line 450
    .line 451
    move-object/from16 v40, v0

    .line 452
    .line 453
    iget-object v0, v4, La/urk0;->k:La/gst0;

    .line 454
    .line 455
    move-object/from16 v19, v0

    .line 456
    .line 457
    iget-object v0, v4, La/urk0;->l:La/aqp0;

    .line 458
    .line 459
    move-object/from16 v47, v0

    .line 460
    .line 461
    iget-object v0, v4, La/urk0;->n:La/nv20;

    .line 462
    .line 463
    move-object/from16 v23, v0

    .line 464
    .line 465
    iget-object v0, v4, La/urk0;->o:La/uzc0;

    .line 466
    .line 467
    move-object/from16 v48, v0

    .line 468
    .line 469
    iget-object v0, v4, La/urk0;->p:La/y78;

    .line 470
    .line 471
    move-object/from16 v49, v0

    .line 472
    .line 473
    iget-object v0, v4, La/urk0;->q:La/zfo;

    .line 474
    .line 475
    move-object/from16 v22, v0

    .line 476
    .line 477
    iget-object v0, v4, La/urk0;->r:La/zx10;

    .line 478
    .line 479
    move-object/from16 v24, v0

    .line 480
    .line 481
    iget-object v0, v4, La/urk0;->s:La/edo;

    .line 482
    .line 483
    move-object/from16 v25, v0

    .line 484
    .line 485
    iget-object v0, v4, La/urk0;->t:La/yo4;

    .line 486
    .line 487
    move-object/from16 v50, v0

    .line 488
    .line 489
    iget-object v0, v4, La/urk0;->u:La/d1p;

    .line 490
    .line 491
    move-object/from16 v26, v0

    .line 492
    .line 493
    iget-object v0, v4, La/urk0;->v:La/sjl0;

    .line 494
    .line 495
    move-object/from16 v28, v0

    .line 496
    .line 497
    iget-object v0, v4, La/urk0;->w:La/roi0;

    .line 498
    .line 499
    move-object/from16 v33, v0

    .line 500
    .line 501
    iget-object v0, v4, La/urk0;->x:La/igm0;

    .line 502
    .line 503
    move-object/from16 v51, v0

    .line 504
    .line 505
    iget-object v0, v4, La/urk0;->y:La/ugf0;

    .line 506
    .line 507
    move-object/from16 v34, v0

    .line 508
    .line 509
    iget-object v0, v4, La/urk0;->z:La/ygm0;

    .line 510
    .line 511
    move-object/from16 v52, v0

    .line 512
    .line 513
    iget-object v0, v4, La/urk0;->A:La/wdk0;

    .line 514
    .line 515
    move-object/from16 v37, v0

    .line 516
    .line 517
    iget-object v0, v4, La/urk0;->B:La/xri;

    .line 518
    .line 519
    move-object/from16 v38, v0

    .line 520
    .line 521
    iget-object v0, v4, La/urk0;->C:La/pyg;

    .line 522
    .line 523
    move-object/from16 v39, v0

    .line 524
    .line 525
    iget-object v0, v4, La/urk0;->D:La/iuu;

    .line 526
    .line 527
    move-object/from16 v53, v0

    .line 528
    .line 529
    iget-object v0, v4, La/urk0;->E:La/grj;

    .line 530
    .line 531
    move-object/from16 v54, v0

    .line 532
    .line 533
    iget-object v0, v4, La/urk0;->F:La/jlx;

    .line 534
    .line 535
    move-object/from16 v55, v0

    .line 536
    .line 537
    iget-object v0, v4, La/urk0;->G:La/pyg0;

    .line 538
    .line 539
    move-object/from16 v56, v0

    .line 540
    .line 541
    iget-object v0, v4, La/urk0;->H:La/qyg0;

    .line 542
    .line 543
    move-object/from16 v57, v0

    .line 544
    .line 545
    iget-object v0, v4, La/urk0;->I:La/g9m0;

    .line 546
    .line 547
    move-object/from16 v58, v0

    .line 548
    .line 549
    iget-object v0, v4, La/urk0;->J:La/wiu;

    .line 550
    .line 551
    move-object/from16 v59, v0

    .line 552
    .line 553
    iget-object v0, v4, La/urk0;->K:La/bzt;

    .line 554
    .line 555
    iget-object v4, v4, La/urk0;->L:La/r9u;

    .line 556
    .line 557
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    .line 559
    .line 560
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 561
    .line 562
    .line 563
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 564
    .line 565
    .line 566
    invoke-virtual/range {v38 .. v38}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 567
    .line 568
    .line 569
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    invoke-virtual/range {v43 .. v43}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 579
    .line 580
    .line 581
    invoke-virtual/range {v45 .. v45}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    invoke-virtual/range {v46 .. v46}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    invoke-virtual/range {v47 .. v47}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 597
    .line 598
    .line 599
    invoke-virtual/range {v25 .. v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    .line 601
    .line 602
    invoke-virtual/range {v28 .. v28}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    .line 604
    .line 605
    invoke-virtual/range {v51 .. v51}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 606
    .line 607
    .line 608
    invoke-virtual/range {v52 .. v52}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 609
    .line 610
    .line 611
    invoke-virtual/range {v37 .. v37}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 612
    .line 613
    .line 614
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 615
    .line 616
    .line 617
    new-instance v18, La/iui;

    .line 618
    .line 619
    move-object/from16 v60, v0

    .line 620
    .line 621
    move-object/from16 v61, v4

    .line 622
    .line 623
    move-object/from16 v37, v6

    .line 624
    .line 625
    move-object/from16 v19, v11

    .line 626
    .line 627
    move-object/from16 v22, v13

    .line 628
    .line 629
    move-object/from16 v41, v14

    .line 630
    .line 631
    move-object/from16 v25, v26

    .line 632
    .line 633
    move-object/from16 v26, v33

    .line 634
    .line 635
    move-object/from16 v28, v34

    .line 636
    .line 637
    move-object/from16 v33, v38

    .line 638
    .line 639
    move-object/from16 v34, v39

    .line 640
    .line 641
    move-object/from16 v39, v3

    .line 642
    .line 643
    move-object/from16 v38, v8

    .line 644
    .line 645
    invoke-direct/range {v18 .. v61}, La/iui;-><init>(La/cad;La/itr;La/iip;La/iw20;La/nv20;La/zx10;La/d1p;La/roi0;La/cui;La/ugf0;La/ozi;La/f3l;La/rz00;La/gh9;La/xri;La/pyg;La/vpk0;La/lui;La/oar0;La/m6m0;Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;La/xr;La/ctf0;La/i1w0;La/m1e;La/duj;La/gii0;La/knf0;La/aqp0;La/uzc0;La/y78;La/yo4;La/igm0;La/ygm0;La/iuu;La/grj;La/jlx;La/pyg0;La/qyg0;La/g9m0;La/wiu;La/bzt;La/r9u;)V

    .line 646
    .line 647
    .line 648
    move-object/from16 v8, v18

    .line 649
    .line 650
    move-object/from16 v11, v39

    .line 651
    .line 652
    invoke-virtual {v10, v8}, La/fet;->o0(Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    goto :goto_a

    .line 656
    :cond_d
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 657
    .line 658
    .line 659
    return-void

    .line 660
    :cond_e
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 661
    .line 662
    .line 663
    return-void

    .line 664
    :cond_f
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 665
    .line 666
    .line 667
    return-void

    .line 668
    :cond_10
    invoke-static {v6}, La/jf4;->n(Ljava/lang/String;)V

    .line 669
    .line 670
    .line 671
    return-void

    .line 672
    :cond_11
    const-string v0, "Cannot create dependency "

    .line 673
    .line 674
    invoke-static {v14, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v0

    .line 678
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 679
    .line 680
    .line 681
    return-void

    .line 682
    :cond_12
    move/from16 v62, v0

    .line 683
    .line 684
    move-object v11, v3

    .line 685
    :goto_a
    check-cast v8, La/iui;

    .line 686
    .line 687
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 688
    .line 689
    .line 690
    move-result-object v0

    .line 691
    if-ne v0, v12, :cond_13

    .line 692
    .line 693
    iget-object v0, v8, La/iui;->K:La/itr;

    .line 694
    .line 695
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 696
    .line 697
    .line 698
    move-result-object v0

    .line 699
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v10, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 703
    .line 704
    .line 705
    :cond_13
    move-object v3, v0

    .line 706
    check-cast v3, La/ujd;

    .line 707
    .line 708
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v0

    .line 712
    if-ne v0, v12, :cond_14

    .line 713
    .line 714
    iget-object v0, v8, La/iui;->y:La/ozi;

    .line 715
    .line 716
    new-instance v4, La/dcv0;

    .line 717
    .line 718
    iget-object v6, v0, La/ozi;->p:La/onv;

    .line 719
    .line 720
    iget-object v6, v6, La/onv;->a:Ljava/lang/Object;

    .line 721
    .line 722
    check-cast v6, La/ali;

    .line 723
    .line 724
    invoke-virtual {v6}, La/ali;->z()La/e720;

    .line 725
    .line 726
    .line 727
    move-result-object v6

    .line 728
    iget-object v13, v0, La/ozi;->i:La/sue;

    .line 729
    .line 730
    invoke-interface {v13}, La/sue;->w()La/vq;

    .line 731
    .line 732
    .line 733
    move-result-object v13

    .line 734
    invoke-static {v13}, La/x1x;->x(Ljava/lang/Object;)V

    .line 735
    .line 736
    .line 737
    iget-object v0, v0, La/ozi;->q:La/ii;

    .line 738
    .line 739
    invoke-direct {v4, v6, v13, v0}, La/dcv0;-><init>(La/e720;La/vq;La/ii;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v10, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 743
    .line 744
    .line 745
    move-object v0, v4

    .line 746
    :cond_14
    move-object v4, v0

    .line 747
    check-cast v4, La/dcv0;

    .line 748
    .line 749
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 750
    .line 751
    .line 752
    move-result-object v0

    .line 753
    if-ne v0, v12, :cond_15

    .line 754
    .line 755
    iget-object v0, v8, La/iui;->L:La/zx10;

    .line 756
    .line 757
    iget-object v0, v0, La/zx10;->a:Ljava/lang/Object;

    .line 758
    .line 759
    check-cast v0, La/g45;

    .line 760
    .line 761
    invoke-virtual {v0}, La/g45;->K()La/oll0;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    invoke-virtual {v10, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 766
    .line 767
    .line 768
    :cond_15
    check-cast v0, La/oll0;

    .line 769
    .line 770
    const-class v6, La/iwk0;

    .line 771
    .line 772
    sget-object v13, La/sre0;->a:La/tre0;

    .line 773
    .line 774
    invoke-virtual {v13, v6}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 775
    .line 776
    .line 777
    move-result-object v6

    .line 778
    iget-object v13, v11, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 779
    .line 780
    iget-object v13, v13, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;->a:Ljava/lang/String;

    .line 781
    .line 782
    new-instance v14, La/q0h0;

    .line 783
    .line 784
    iget-object v8, v8, La/iui;->d0:La/n5d0;

    .line 785
    .line 786
    invoke-interface {v8}, La/o5d0;->get()Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v8

    .line 790
    check-cast v8, La/hui;

    .line 791
    .line 792
    invoke-direct {v14, v8}, La/q0h0;-><init>(La/p0h0;)V

    .line 793
    .line 794
    .line 795
    sget v8, La/iwk0;->X0:I

    .line 796
    .line 797
    const/16 v8, 0xc

    .line 798
    .line 799
    invoke-static {v6, v13, v14, v10, v8}, La/n4c;->X(La/sgy;Ljava/lang/String;La/q0h0;La/fet;I)La/k3t0;

    .line 800
    .line 801
    .line 802
    move-result-object v6

    .line 803
    move-object v8, v6

    .line 804
    check-cast v8, La/i3t0;

    .line 805
    .line 806
    invoke-virtual {v8, v10}, La/i3t0;->y(La/fet;)La/pz40;

    .line 807
    .line 808
    .line 809
    move-result-object v13

    .line 810
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 811
    .line 812
    .line 813
    move-result-object v6

    .line 814
    if-ne v6, v12, :cond_16

    .line 815
    .line 816
    sget-object v6, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 817
    .line 818
    invoke-static {v6, v10}, La/m0x0;->I(Lkotlin/coroutines/g;La/fet;)La/vne;

    .line 819
    .line 820
    .line 821
    move-result-object v6

    .line 822
    invoke-virtual {v10, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 823
    .line 824
    .line 825
    :cond_16
    move-object v14, v6

    .line 826
    check-cast v14, La/vne;

    .line 827
    .line 828
    invoke-virtual {v10, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v6

    .line 832
    move-object/from16 v18, v13

    .line 833
    .line 834
    and-int/lit8 v13, v62, 0x70

    .line 835
    .line 836
    const/16 v1, 0x20

    .line 837
    .line 838
    if-eq v13, v1, :cond_18

    .line 839
    .line 840
    invoke-virtual {v10, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    move-result v1

    .line 844
    if-eqz v1, :cond_17

    .line 845
    .line 846
    goto :goto_b

    .line 847
    :cond_17
    const/4 v1, 0x0

    .line 848
    goto :goto_c

    .line 849
    :cond_18
    :goto_b
    const/4 v1, 0x1

    .line 850
    :goto_c
    or-int/2addr v1, v6

    .line 851
    invoke-virtual {v10, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    move-result v6

    .line 855
    or-int/2addr v1, v6

    .line 856
    invoke-virtual {v10, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v6

    .line 860
    or-int/2addr v1, v6

    .line 861
    const/high16 v6, 0x70000

    .line 862
    .line 863
    and-int v6, v62, v6

    .line 864
    .line 865
    move-object/from16 v19, v0

    .line 866
    .line 867
    const/high16 v0, 0x20000

    .line 868
    .line 869
    if-ne v6, v0, :cond_19

    .line 870
    .line 871
    const/4 v0, 0x1

    .line 872
    goto :goto_d

    .line 873
    :cond_19
    const/4 v0, 0x0

    .line 874
    :goto_d
    or-int/2addr v0, v1

    .line 875
    const/high16 v1, 0x380000

    .line 876
    .line 877
    and-int v1, v62, v1

    .line 878
    .line 879
    const/high16 v6, 0x100000

    .line 880
    .line 881
    if-ne v1, v6, :cond_1a

    .line 882
    .line 883
    const/4 v1, 0x1

    .line 884
    goto :goto_e

    .line 885
    :cond_1a
    const/4 v1, 0x0

    .line 886
    :goto_e
    or-int/2addr v0, v1

    .line 887
    const v1, 0xe000

    .line 888
    .line 889
    .line 890
    and-int v1, v62, v1

    .line 891
    .line 892
    const/16 v6, 0x4000

    .line 893
    .line 894
    if-ne v1, v6, :cond_1b

    .line 895
    .line 896
    const/4 v1, 0x1

    .line 897
    goto :goto_f

    .line 898
    :cond_1b
    const/4 v1, 0x0

    .line 899
    :goto_f
    or-int/2addr v0, v1

    .line 900
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 901
    .line 902
    .line 903
    move-result v1

    .line 904
    or-int/2addr v0, v1

    .line 905
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 906
    .line 907
    .line 908
    move-result-object v1

    .line 909
    if-nez v0, :cond_1d

    .line 910
    .line 911
    if-ne v1, v12, :cond_1c

    .line 912
    .line 913
    goto :goto_10

    .line 914
    :cond_1c
    move-object v0, v1

    .line 915
    move-object v1, v3

    .line 916
    goto :goto_11

    .line 917
    :cond_1d
    :goto_10
    new-instance v0, La/xao0;

    .line 918
    .line 919
    move-object/from16 v6, p6

    .line 920
    .line 921
    move-object v1, v3

    .line 922
    move-object/from16 v3, v19

    .line 923
    .line 924
    invoke-direct/range {v0 .. v8}, La/xao0;-><init>(La/ujd;La/yx5;La/oll0;La/dcv0;Lkotlin/jvm/functions/Function0;La/xdr;Lkotlin/jvm/functions/Function1;La/i3t0;)V

    .line 925
    .line 926
    .line 927
    invoke-virtual {v10, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 928
    .line 929
    .line 930
    :goto_11
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 931
    .line 932
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 933
    .line 934
    invoke-virtual {v10, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 939
    .line 940
    .line 941
    move-result v5

    .line 942
    or-int/2addr v3, v5

    .line 943
    invoke-virtual {v10, v0}, La/fet;->g(Ljava/lang/Object;)Z

    .line 944
    .line 945
    .line 946
    move-result v5

    .line 947
    or-int/2addr v3, v5

    .line 948
    const/4 v5, 0x0

    .line 949
    invoke-virtual {v10, v5}, La/fet;->g(Ljava/lang/Object;)Z

    .line 950
    .line 951
    .line 952
    move-result v6

    .line 953
    or-int/2addr v3, v6

    .line 954
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 955
    .line 956
    .line 957
    move-result-object v5

    .line 958
    if-nez v3, :cond_1e

    .line 959
    .line 960
    if-ne v5, v12, :cond_1f

    .line 961
    .line 962
    :cond_1e
    new-instance v5, La/abo0;

    .line 963
    .line 964
    const/4 v3, 0x0

    .line 965
    invoke-direct {v5, v14, v8, v0, v3}, La/abo0;-><init>(La/vne;La/i3t0;Lkotlin/jvm/functions/Function1;B)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v10, v5}, La/fet;->o0(Ljava/lang/Object;)V

    .line 969
    .line 970
    .line 971
    :cond_1f
    check-cast v5, Lkotlin/jvm/functions/Function1;

    .line 972
    .line 973
    invoke-static {v7, v5, v10}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 974
    .line 975
    .line 976
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 977
    .line 978
    .line 979
    move-result v0

    .line 980
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 981
    .line 982
    .line 983
    move-result-object v3

    .line 984
    if-nez v0, :cond_20

    .line 985
    .line 986
    if-ne v3, v12, :cond_21

    .line 987
    .line 988
    :cond_20
    new-instance v3, La/tmg0;

    .line 989
    .line 990
    const/16 v0, 0x1b

    .line 991
    .line 992
    const/4 v5, 0x0

    .line 993
    invoke-direct {v3, v8, v5, v0}, La/tmg0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v10, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 997
    .line 998
    .line 999
    :cond_21
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 1000
    .line 1001
    invoke-static {v10, v7, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1002
    .line 1003
    .line 1004
    const/16 v0, 0x20

    .line 1005
    .line 1006
    if-eq v13, v0, :cond_23

    .line 1007
    .line 1008
    invoke-virtual {v10, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1009
    .line 1010
    .line 1011
    move-result v0

    .line 1012
    if-eqz v0, :cond_22

    .line 1013
    .line 1014
    goto :goto_12

    .line 1015
    :cond_22
    const/4 v0, 0x0

    .line 1016
    goto :goto_13

    .line 1017
    :cond_23
    :goto_12
    const/4 v0, 0x1

    .line 1018
    :goto_13
    invoke-virtual {v10, v11}, La/fet;->g(Ljava/lang/Object;)Z

    .line 1019
    .line 1020
    .line 1021
    move-result v3

    .line 1022
    or-int/2addr v0, v3

    .line 1023
    invoke-virtual {v10, v1}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1024
    .line 1025
    .line 1026
    move-result v3

    .line 1027
    or-int/2addr v0, v3

    .line 1028
    invoke-virtual {v10, v4}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1029
    .line 1030
    .line 1031
    move-result v3

    .line 1032
    or-int/2addr v0, v3

    .line 1033
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1034
    .line 1035
    .line 1036
    move-result v3

    .line 1037
    or-int/2addr v0, v3

    .line 1038
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v3

    .line 1042
    if-nez v0, :cond_24

    .line 1043
    .line 1044
    if-ne v3, v12, :cond_25

    .line 1045
    .line 1046
    :cond_24
    new-instance v0, La/dg;

    .line 1047
    .line 1048
    const/16 v6, 0x1c

    .line 1049
    .line 1050
    move-object v3, v1

    .line 1051
    move-object v1, v2

    .line 1052
    move-object v5, v8

    .line 1053
    move-object v2, v11

    .line 1054
    invoke-direct/range {v0 .. v6}, La/dg;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1055
    .line 1056
    .line 1057
    invoke-virtual {v10, v0}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1058
    .line 1059
    .line 1060
    move-object v3, v0

    .line 1061
    :cond_25
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 1062
    .line 1063
    invoke-static {v7, v3, v10}, La/m0x0;->o(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/fet;)V

    .line 1064
    .line 1065
    .line 1066
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1067
    .line 1068
    .line 1069
    move-result v0

    .line 1070
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v1

    .line 1074
    if-nez v0, :cond_26

    .line 1075
    .line 1076
    if-ne v1, v12, :cond_27

    .line 1077
    .line 1078
    :cond_26
    new-instance v1, La/ui6;

    .line 1079
    .line 1080
    const/16 v0, 0xd

    .line 1081
    .line 1082
    invoke-direct {v1, v8, v0}, La/ui6;-><init>(La/i3t0;B)V

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v10, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1086
    .line 1087
    .line 1088
    :cond_27
    move-object v0, v1

    .line 1089
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 1090
    .line 1091
    invoke-virtual {v10, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1092
    .line 1093
    .line 1094
    move-result v1

    .line 1095
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    if-nez v1, :cond_28

    .line 1100
    .line 1101
    if-ne v2, v12, :cond_29

    .line 1102
    .line 1103
    :cond_28
    new-instance v2, La/ui6;

    .line 1104
    .line 1105
    const/16 v1, 0xe

    .line 1106
    .line 1107
    invoke-direct {v2, v8, v1}, La/ui6;-><init>(La/i3t0;B)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v10, v2}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1111
    .line 1112
    .line 1113
    :cond_29
    move-object v1, v2

    .line 1114
    check-cast v1, Lkotlin/jvm/functions/Function0;

    .line 1115
    .line 1116
    const/4 v4, 0x0

    .line 1117
    const/4 v5, 0x4

    .line 1118
    const/4 v2, 0x0

    .line 1119
    move-object v3, v10

    .line 1120
    invoke-static/range {v0 .. v5}, La/v3c;->z(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;La/clz;La/fet;II)V

    .line 1121
    .line 1122
    .line 1123
    sget-object v0, La/gqw0;->a:La/zx7;

    .line 1124
    .line 1125
    const/4 v3, 0x0

    .line 1126
    invoke-static {v0, v3}, La/zq8;->c(La/u12;Z)La/tj30;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    iget-wide v1, v10, La/fet;->T:J

    .line 1131
    .line 1132
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 1133
    .line 1134
    .line 1135
    move-result v1

    .line 1136
    invoke-virtual {v10}, La/fet;->m()La/bh90;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    move-object/from16 v7, p0

    .line 1141
    .line 1142
    invoke-static {v10, v7}, La/kbc;->c0(La/fet;La/mm40;)La/mm40;

    .line 1143
    .line 1144
    .line 1145
    move-result-object v3

    .line 1146
    sget-object v4, La/mkd;->c0:La/gqw0;

    .line 1147
    .line 1148
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1149
    .line 1150
    .line 1151
    invoke-virtual {v10}, La/fet;->i0()V

    .line 1152
    .line 1153
    .line 1154
    iget-boolean v4, v10, La/fet;->S:Z

    .line 1155
    .line 1156
    if-eqz v4, :cond_2a

    .line 1157
    .line 1158
    sget-object v4, La/e7z;->u1:La/pcy;

    .line 1159
    .line 1160
    invoke-virtual {v10, v4}, La/fet;->l(Lkotlin/jvm/functions/Function0;)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_14

    .line 1164
    :cond_2a
    invoke-virtual {v10}, La/fet;->r0()V

    .line 1165
    .line 1166
    .line 1167
    :goto_14
    sget-object v4, La/gqw0;->x:La/shd;

    .line 1168
    .line 1169
    invoke-static {v10, v0, v4}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1170
    .line 1171
    .line 1172
    sget-object v0, La/gqw0;->w:La/shd;

    .line 1173
    .line 1174
    invoke-static {v10, v2, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1175
    .line 1176
    .line 1177
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1178
    .line 1179
    .line 1180
    move-result-object v0

    .line 1181
    sget-object v1, La/gqw0;->y:La/shd;

    .line 1182
    .line 1183
    invoke-static {v10, v0, v1}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1184
    .line 1185
    .line 1186
    invoke-static {v10}, La/jpm0;->n(La/fet;)V

    .line 1187
    .line 1188
    .line 1189
    sget-object v0, La/gqw0;->v:La/shd;

    .line 1190
    .line 1191
    invoke-static {v10, v3, v0}, La/jpm0;->o(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 1192
    .line 1193
    .line 1194
    sget-object v0, La/jr8;->a:La/jr8;

    .line 1195
    .line 1196
    sget-object v1, La/jm40;->b:La/jm40;

    .line 1197
    .line 1198
    invoke-virtual {v0, v1}, La/jr8;->a(La/mm40;)La/mm40;

    .line 1199
    .line 1200
    .line 1201
    move-result-object v2

    .line 1202
    sget-object v3, La/gqw0;->e:La/zx7;

    .line 1203
    .line 1204
    invoke-virtual {v0, v2, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v14

    .line 1208
    invoke-interface/range {v18 .. v18}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1209
    .line 1210
    .line 1211
    move-result-object v2

    .line 1212
    move-object v13, v2

    .line 1213
    check-cast v13, La/lvk0;

    .line 1214
    .line 1215
    if-eqz v13, :cond_35

    .line 1216
    .line 1217
    instance-of v2, v13, La/kvk0;

    .line 1218
    .line 1219
    if-eqz v2, :cond_2f

    .line 1220
    .line 1221
    const v0, -0xfbe5323

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, v9, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTabScreenParams;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab;

    .line 1228
    .line 1229
    sget-object v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Schedule;

    .line 1230
    .line 1231
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1232
    .line 1233
    .line 1234
    move-result v1

    .line 1235
    if-eqz v1, :cond_2c

    .line 1236
    .line 1237
    const v0, -0x19482cc8

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 1241
    .line 1242
    .line 1243
    check-cast v13, La/kvk0;

    .line 1244
    .line 1245
    iget-object v0, v13, La/kvk0;->a:La/i9h0;

    .line 1246
    .line 1247
    sget-object v1, La/i9h0;->a:La/i9h0;

    .line 1248
    .line 1249
    if-ne v0, v1, :cond_2b

    .line 1250
    .line 1251
    const/4 v4, 0x1

    .line 1252
    :goto_15
    const/4 v3, 0x0

    .line 1253
    goto :goto_16

    .line 1254
    :cond_2b
    const/4 v4, 0x0

    .line 1255
    goto :goto_15

    .line 1256
    :goto_16
    invoke-static {v14, v4, v10, v3, v3}, La/d7x;->p(La/mm40;ZLa/fet;II)V

    .line 1257
    .line 1258
    .line 1259
    invoke-virtual {v10, v3}, La/fet;->r(Z)V

    .line 1260
    .line 1261
    .line 1262
    move v2, v3

    .line 1263
    goto :goto_18

    .line 1264
    :cond_2c
    sget-object v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$MyGames;

    .line 1265
    .line 1266
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1267
    .line 1268
    .line 1269
    move-result v1

    .line 1270
    if-nez v1, :cond_2d

    .line 1271
    .line 1272
    sget-object v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Statistic;

    .line 1273
    .line 1274
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1275
    .line 1276
    .line 1277
    move-result v1

    .line 1278
    if-nez v1, :cond_2d

    .line 1279
    .line 1280
    sget-object v1, Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;->c:Lorg/xplatform/special_event/impl/special_event_tab/presentation/model/SpecialEventTab$Tournament;

    .line 1281
    .line 1282
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1283
    .line 1284
    .line 1285
    move-result v0

    .line 1286
    if-eqz v0, :cond_2e

    .line 1287
    .line 1288
    :cond_2d
    const/4 v2, 0x0

    .line 1289
    goto :goto_17

    .line 1290
    :cond_2e
    const v0, -0x1948343b

    .line 1291
    .line 1292
    .line 1293
    const/4 v2, 0x0

    .line 1294
    invoke-static {v0, v10, v2}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1295
    .line 1296
    .line 1297
    move-result-object v0

    .line 1298
    throw v0

    .line 1299
    :goto_17
    const v0, -0x194803dd

    .line 1300
    .line 1301
    .line 1302
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 1303
    .line 1304
    .line 1305
    invoke-static {v2, v10, v14}, La/n2x;->m(ILa/fet;La/mm40;)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v10, v2}, La/fet;->r(Z)V

    .line 1309
    .line 1310
    .line 1311
    :goto_18
    invoke-virtual {v10, v2}, La/fet;->r(Z)V

    .line 1312
    .line 1313
    .line 1314
    :goto_19
    const/4 v11, 0x1

    .line 1315
    goto/16 :goto_1b

    .line 1316
    .line 1317
    :cond_2f
    const/4 v2, 0x0

    .line 1318
    instance-of v4, v13, La/ivk0;

    .line 1319
    .line 1320
    if-eqz v4, :cond_30

    .line 1321
    .line 1322
    const v0, -0xfb61f7e

    .line 1323
    .line 1324
    .line 1325
    invoke-virtual {v10, v0}, La/fet;->e0(I)V

    .line 1326
    .line 1327
    .line 1328
    sget-object v0, La/kr00;->a:La/zfn;

    .line 1329
    .line 1330
    move-object v1, v13

    .line 1331
    check-cast v1, La/ivk0;

    .line 1332
    .line 1333
    iget-boolean v1, v1, La/ivk0;->f:Z

    .line 1334
    .line 1335
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    invoke-virtual {v0, v1}, La/zfn;->a(Ljava/lang/Object;)La/l5d0;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v0

    .line 1343
    new-instance v12, La/stl0;

    .line 1344
    .line 1345
    const/16 v17, 0xa

    .line 1346
    .line 1347
    move-object/from16 v16, v8

    .line 1348
    .line 1349
    move v8, v2

    .line 1350
    invoke-direct/range {v12 .. v17}, La/stl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1351
    .line 1352
    .line 1353
    const v1, 0x7e6ab2dc

    .line 1354
    .line 1355
    .line 1356
    invoke-static {v1, v12, v10}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v1

    .line 1360
    const/16 v2, 0x38

    .line 1361
    .line 1362
    invoke-static {v0, v1, v10, v2}, La/obc;->d(La/l5d0;Lkotlin/jvm/functions/Function2;La/fet;I)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 1366
    .line 1367
    .line 1368
    goto :goto_19

    .line 1369
    :cond_30
    move-object v5, v8

    .line 1370
    move v8, v2

    .line 1371
    instance-of v2, v13, La/jvk0;

    .line 1372
    .line 1373
    if-eqz v2, :cond_36

    .line 1374
    .line 1375
    const v2, -0xfa50d95

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v10, v2}, La/fet;->e0(I)V

    .line 1379
    .line 1380
    .line 1381
    check-cast v13, La/jvk0;

    .line 1382
    .line 1383
    iget-object v2, v13, La/jvk0;->b:La/i9h0;

    .line 1384
    .line 1385
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1386
    .line 1387
    .line 1388
    move-result v2

    .line 1389
    if-eqz v2, :cond_32

    .line 1390
    .line 1391
    const/4 v11, 0x1

    .line 1392
    if-ne v2, v11, :cond_31

    .line 1393
    .line 1394
    invoke-virtual {v0, v1, v3}, La/jr8;->b(La/mm40;La/u12;)La/mm40;

    .line 1395
    .line 1396
    .line 1397
    move-result-object v0

    .line 1398
    goto :goto_1a

    .line 1399
    :cond_31
    invoke-static {}, La/t9f;->b()V

    .line 1400
    .line 1401
    .line 1402
    return-void

    .line 1403
    :cond_32
    const/4 v11, 0x1

    .line 1404
    invoke-virtual {v0, v1}, La/jr8;->a(La/mm40;)La/mm40;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    const/4 v1, 0x2

    .line 1409
    invoke-static {v0, v3, v1}, La/o7k0;->y(La/mm40;La/zx7;I)La/mm40;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v0

    .line 1413
    :goto_1a
    iget-object v1, v13, La/jvk0;->a:La/mdm;

    .line 1414
    .line 1415
    invoke-virtual {v10, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 1416
    .line 1417
    .line 1418
    move-result v2

    .line 1419
    invoke-virtual {v10}, La/fet;->P()Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v3

    .line 1423
    if-nez v2, :cond_33

    .line 1424
    .line 1425
    if-ne v3, v12, :cond_34

    .line 1426
    .line 1427
    :cond_33
    new-instance v3, La/ui6;

    .line 1428
    .line 1429
    const/16 v2, 0xf

    .line 1430
    .line 1431
    invoke-direct {v3, v5, v2}, La/ui6;-><init>(La/i3t0;B)V

    .line 1432
    .line 1433
    .line 1434
    invoke-virtual {v10, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 1435
    .line 1436
    .line 1437
    :cond_34
    check-cast v3, Lkotlin/jvm/functions/Function0;

    .line 1438
    .line 1439
    const/4 v5, 0x0

    .line 1440
    const/4 v6, 0x4

    .line 1441
    const/4 v2, 0x0

    .line 1442
    move-object v4, v10

    .line 1443
    invoke-static/range {v0 .. v6}, La/jcb;->l(La/mm40;La/mdm;ZLkotlin/jvm/functions/Function0;La/fet;II)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v10, v8}, La/fet;->r(Z)V

    .line 1447
    .line 1448
    .line 1449
    :goto_1b
    invoke-virtual {v10, v11}, La/fet;->r(Z)V

    .line 1450
    .line 1451
    .line 1452
    goto :goto_1c

    .line 1453
    :cond_35
    const/4 v8, 0x0

    .line 1454
    :cond_36
    const v0, -0x19483cfb

    .line 1455
    .line 1456
    .line 1457
    invoke-static {v0, v10, v8}, La/b1j;->f(ILa/fet;Z)La/m460;

    .line 1458
    .line 1459
    .line 1460
    move-result-object v0

    .line 1461
    throw v0

    .line 1462
    :cond_37
    move-object/from16 v7, p0

    .line 1463
    .line 1464
    invoke-virtual {v10}, La/fet;->X()V

    .line 1465
    .line 1466
    .line 1467
    :goto_1c
    invoke-virtual {v10}, La/fet;->u()La/yfe0;

    .line 1468
    .line 1469
    .line 1470
    move-result-object v10

    .line 1471
    if-eqz v10, :cond_38

    .line 1472
    .line 1473
    new-instance v0, La/fn0;

    .line 1474
    .line 1475
    const/16 v9, 0x11

    .line 1476
    .line 1477
    move-object/from16 v2, p1

    .line 1478
    .line 1479
    move-object/from16 v3, p2

    .line 1480
    .line 1481
    move-object/from16 v4, p3

    .line 1482
    .line 1483
    move-object/from16 v5, p4

    .line 1484
    .line 1485
    move-object/from16 v6, p5

    .line 1486
    .line 1487
    move/from16 v8, p8

    .line 1488
    .line 1489
    move-object v1, v7

    .line 1490
    move-object/from16 v7, p6

    .line 1491
    .line 1492
    invoke-direct/range {v0 .. v9}, La/fn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;La/wdr;La/wdr;IB)V

    .line 1493
    .line 1494
    .line 1495
    iput-object v0, v10, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 1496
    .line 1497
    :cond_38
    return-void
.end method
