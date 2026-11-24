.class public final La/ql2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public j:Ljava/util/HashMap;

.field public k:Ljava/util/Collection;

.field public l:Ljava/util/Iterator;

.field public m:La/pbs0;

.field public n:Ljava/util/Collection;

.field public o:Z

.field public synthetic p:Ljava/util/List;

.field public synthetic q:Ljava/util/List;

.field public synthetic r:I

.field public s:La/i3t0;

.field public final synthetic t:La/i3t0;


# direct methods
.method public synthetic constructor <init>(La/i3t0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ql2;->i:B

    iput-object p1, p0, La/ql2;->t:La/i3t0;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 31

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-byte v0, v5, La/ql2;->i:B

    .line 4
    .line 5
    const-string v6, "SELECTED_TRACK_COEF_KEY"

    .line 6
    .line 7
    const/16 v1, 0xa

    .line 8
    .line 9
    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 10
    .line 11
    const/4 v7, 0x1

    .line 12
    iget-object v3, v5, La/ql2;->t:La/i3t0;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object v9, v3

    .line 18
    check-cast v9, La/v360;

    .line 19
    .line 20
    iget-object v10, v5, La/ql2;->p:Ljava/util/List;

    .line 21
    .line 22
    iget-object v0, v5, La/ql2;->q:Ljava/util/List;

    .line 23
    .line 24
    iget v11, v5, La/ql2;->r:I

    .line 25
    .line 26
    sget-object v12, La/wne;->a:La/wne;

    .line 27
    .line 28
    iget-boolean v3, v5, La/ql2;->o:Z

    .line 29
    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    if-ne v3, v7, :cond_0

    .line 33
    .line 34
    iget-object v0, v5, La/ql2;->n:Ljava/util/Collection;

    .line 35
    .line 36
    check-cast v0, Ljava/util/Collection;

    .line 37
    .line 38
    iget-object v1, v5, La/ql2;->m:La/pbs0;

    .line 39
    .line 40
    iget-object v2, v5, La/ql2;->l:Ljava/util/Iterator;

    .line 41
    .line 42
    iget-object v3, v5, La/ql2;->k:Ljava/util/Collection;

    .line 43
    .line 44
    check-cast v3, Ljava/util/Collection;

    .line 45
    .line 46
    iget-object v4, v5, La/ql2;->s:La/i3t0;

    .line 47
    .line 48
    check-cast v4, La/v360;

    .line 49
    .line 50
    iget-object v13, v5, La/ql2;->j:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    move-object v7, v13

    .line 56
    move-object v13, v0

    .line 57
    move-object/from16 v0, p1

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_0
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 v8, 0x0

    .line 65
    goto/16 :goto_9

    .line 66
    .line 67
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    new-instance v2, Ljava/util/HashMap;

    .line 71
    .line 72
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 73
    .line 74
    .line 75
    invoke-static {v11, v0}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    new-instance v3, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 82
    .line 83
    .line 84
    move-result v1

    .line 85
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 86
    .line 87
    .line 88
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    move-object v14, v0

    .line 93
    move-object v0, v2

    .line 94
    move-object v13, v3

    .line 95
    move-object v15, v9

    .line 96
    :goto_0
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    if-eqz v1, :cond_8

    .line 101
    .line 102
    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    check-cast v1, La/pbs0;

    .line 107
    .line 108
    new-instance v2, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v4

    .line 121
    if-eqz v4, :cond_2

    .line 122
    .line 123
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    check-cast v4, La/cit0;

    .line 128
    .line 129
    iget-object v4, v4, La/cit0;->e:Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v2, v4}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object v2

    .line 139
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-eqz v3, :cond_4

    .line 144
    .line 145
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    move-object v4, v3

    .line 150
    check-cast v4, La/m97;

    .line 151
    .line 152
    iget-wide v7, v4, La/m97;->h:J

    .line 153
    .line 154
    iget-object v4, v1, La/pbs0;->b:La/m97;

    .line 155
    .line 156
    move-object/from16 p1, v2

    .line 157
    .line 158
    move-object/from16 v17, v3

    .line 159
    .line 160
    iget-wide v2, v4, La/m97;->h:J

    .line 161
    .line 162
    cmp-long v2, v7, v2

    .line 163
    .line 164
    if-nez v2, :cond_3

    .line 165
    .line 166
    move-object/from16 v3, v17

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_3
    move-object/from16 v2, p1

    .line 170
    .line 171
    const/4 v7, 0x1

    .line 172
    goto :goto_2

    .line 173
    :cond_4
    const/4 v3, 0x0

    .line 174
    :goto_3
    check-cast v3, La/m97;

    .line 175
    .line 176
    if-eqz v3, :cond_7

    .line 177
    .line 178
    iget-object v2, v15, La/v360;->t0:La/hsj;

    .line 179
    .line 180
    iget-wide v3, v3, La/m97;->h:J

    .line 181
    .line 182
    iget-object v7, v1, La/pbs0;->b:La/m97;

    .line 183
    .line 184
    iget-wide v7, v7, La/m97;->i:J

    .line 185
    .line 186
    iput-object v10, v5, La/ql2;->p:Ljava/util/List;

    .line 187
    .line 188
    move-object/from16 v17, v2

    .line 189
    .line 190
    const/4 v2, 0x0

    .line 191
    iput-object v2, v5, La/ql2;->q:Ljava/util/List;

    .line 192
    .line 193
    iput-object v0, v5, La/ql2;->j:Ljava/util/HashMap;

    .line 194
    .line 195
    iput-object v15, v5, La/ql2;->s:La/i3t0;

    .line 196
    .line 197
    move-object v2, v13

    .line 198
    check-cast v2, Ljava/util/Collection;

    .line 199
    .line 200
    iput-object v2, v5, La/ql2;->k:Ljava/util/Collection;

    .line 201
    .line 202
    iput-object v14, v5, La/ql2;->l:Ljava/util/Iterator;

    .line 203
    .line 204
    iput-object v1, v5, La/ql2;->m:La/pbs0;

    .line 205
    .line 206
    iput-object v2, v5, La/ql2;->n:Ljava/util/Collection;

    .line 207
    .line 208
    iput v11, v5, La/ql2;->r:I

    .line 209
    .line 210
    const/4 v2, 0x1

    .line 211
    iput-boolean v2, v5, La/ql2;->o:Z

    .line 212
    .line 213
    move-wide/from16 v29, v7

    .line 214
    .line 215
    move-object v8, v1

    .line 216
    move-wide v1, v3

    .line 217
    move-wide/from16 v3, v29

    .line 218
    .line 219
    move-object v7, v0

    .line 220
    move-object/from16 v0, v17

    .line 221
    .line 222
    invoke-virtual/range {v0 .. v5}, La/hsj;->m(JJLa/zje;)Ljava/lang/Enum;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    if-ne v0, v12, :cond_5

    .line 227
    .line 228
    move-object v8, v12

    .line 229
    goto/16 :goto_9

    .line 230
    .line 231
    :cond_5
    move-object v1, v8

    .line 232
    move-object v3, v13

    .line 233
    move-object v2, v14

    .line 234
    move-object v4, v15

    .line 235
    :goto_4
    check-cast v0, La/fho;

    .line 236
    .line 237
    move-object v14, v2

    .line 238
    move-object v15, v4

    .line 239
    if-eqz v0, :cond_6

    .line 240
    .line 241
    goto :goto_6

    .line 242
    :cond_6
    move-object v0, v7

    .line 243
    goto :goto_5

    .line 244
    :cond_7
    move-object v7, v0

    .line 245
    move-object v8, v1

    .line 246
    move-object v3, v13

    .line 247
    :goto_5
    sget-object v2, La/fho;->a:La/fho;

    .line 248
    .line 249
    move-object v7, v0

    .line 250
    move-object v0, v2

    .line 251
    :goto_6
    iget-object v2, v1, La/pbs0;->b:La/m97;

    .line 252
    .line 253
    move-object/from16 p1, v3

    .line 254
    .line 255
    iget-wide v2, v2, La/m97;->h:J

    .line 256
    .line 257
    new-instance v4, Ljava/lang/Long;

    .line 258
    .line 259
    invoke-direct {v4, v2, v3}, Ljava/lang/Long;-><init>(J)V

    .line 260
    .line 261
    .line 262
    invoke-interface {v7, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    new-instance v0, La/qbs0;

    .line 266
    .line 267
    iget-object v2, v1, La/pbs0;->a:La/acs0;

    .line 268
    .line 269
    invoke-static {v2}, La/zcm0;->p(La/acs0;)La/bcs0;

    .line 270
    .line 271
    .line 272
    move-result-object v2

    .line 273
    iget-object v1, v1, La/pbs0;->b:La/m97;

    .line 274
    .line 275
    invoke-static {v1}, La/ibm0;->C(La/m97;)La/mbs0;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-direct {v0, v2, v1}, La/qbs0;-><init>(La/bcs0;La/mbs0;)V

    .line 280
    .line 281
    .line 282
    invoke-interface {v13, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 283
    .line 284
    .line 285
    move-object/from16 v13, p1

    .line 286
    .line 287
    move-object v0, v7

    .line 288
    const/4 v7, 0x1

    .line 289
    goto/16 :goto_0

    .line 290
    .line 291
    :cond_8
    move-object v7, v0

    .line 292
    check-cast v13, Ljava/util/List;

    .line 293
    .line 294
    invoke-static {v13}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    sget v1, La/v360;->x0:I

    .line 299
    .line 300
    invoke-virtual {v9}, La/i3t0;->D()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    check-cast v1, La/c260;

    .line 305
    .line 306
    iget-object v1, v1, La/c260;->o:La/s4i0;

    .line 307
    .line 308
    if-nez v1, :cond_9

    .line 309
    .line 310
    goto :goto_8

    .line 311
    :cond_9
    if-eqz v0, :cond_a

    .line 312
    .line 313
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 314
    .line 315
    .line 316
    move-result v2

    .line 317
    if-eqz v2, :cond_a

    .line 318
    .line 319
    goto :goto_7

    .line 320
    :cond_a
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 321
    .line 322
    .line 323
    move-result-object v2

    .line 324
    :cond_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 325
    .line 326
    .line 327
    move-result v3

    .line 328
    if-eqz v3, :cond_c

    .line 329
    .line 330
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 331
    .line 332
    .line 333
    move-result-object v3

    .line 334
    check-cast v3, La/qbs0;

    .line 335
    .line 336
    iget-object v4, v3, La/qbs0;->a:La/bcs0;

    .line 337
    .line 338
    iget-wide v4, v4, La/bcs0;->a:J

    .line 339
    .line 340
    iget-wide v10, v1, La/s4i0;->a:J

    .line 341
    .line 342
    cmp-long v4, v4, v10

    .line 343
    .line 344
    if-nez v4, :cond_b

    .line 345
    .line 346
    iget-object v3, v3, La/qbs0;->b:La/mbs0;

    .line 347
    .line 348
    iget-wide v3, v3, La/mbs0;->h:J

    .line 349
    .line 350
    iget-wide v10, v1, La/s4i0;->b:J

    .line 351
    .line 352
    cmp-long v3, v3, v10

    .line 353
    .line 354
    if-nez v3, :cond_b

    .line 355
    .line 356
    goto :goto_8

    .line 357
    :cond_c
    :goto_7
    sget-object v1, La/r160;->a:La/r160;

    .line 358
    .line 359
    invoke-virtual {v9, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    iget-object v1, v9, La/i3t0;->i:La/ocj;

    .line 363
    .line 364
    iget-object v4, v1, La/ocj;->a:La/p7m0;

    .line 365
    .line 366
    :cond_d
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 367
    .line 368
    .line 369
    move-result-object v1

    .line 370
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 371
    .line 372
    .line 373
    iget-object v2, v9, La/i3t0;->f:La/oyg0;

    .line 374
    .line 375
    move-object/from16 v17, v1

    .line 376
    .line 377
    check-cast v17, La/c260;

    .line 378
    .line 379
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 380
    .line 381
    .line 382
    const/16 v27, 0x0

    .line 383
    .line 384
    const v28, 0x2ffff

    .line 385
    .line 386
    .line 387
    const/16 v18, 0x0

    .line 388
    .line 389
    const/16 v19, 0x0

    .line 390
    .line 391
    const/16 v20, 0x0

    .line 392
    .line 393
    const/16 v21, 0x0

    .line 394
    .line 395
    const/16 v22, 0x0

    .line 396
    .line 397
    const/16 v23, 0x0

    .line 398
    .line 399
    const/16 v24, 0x0

    .line 400
    .line 401
    const/16 v25, 0x0

    .line 402
    .line 403
    const/16 v26, 0x0

    .line 404
    .line 405
    invoke-static/range {v17 .. v28}, La/c260;->a(La/c260;La/oz50;ZZZLa/om5;ZLjava/util/List;La/tz50;La/s4i0;La/s4i0;I)La/c260;

    .line 406
    .line 407
    .line 408
    move-result-object v2

    .line 409
    invoke-virtual {v4, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 410
    .line 411
    .line 412
    move-result v1

    .line 413
    if-eqz v1, :cond_d

    .line 414
    .line 415
    iget-object v1, v9, La/v360;->o:La/vzg0;

    .line 416
    .line 417
    const/4 v2, 0x0

    .line 418
    invoke-virtual {v1, v6, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :goto_8
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 422
    .line 423
    new-instance v1, La/wcs0;

    .line 424
    .line 425
    invoke-direct {v1, v0, v7}, La/wcs0;-><init>(Ljava/util/List;Ljava/util/Map;)V

    .line 426
    .line 427
    .line 428
    new-instance v8, La/j0g0;

    .line 429
    .line 430
    invoke-direct {v8, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 431
    .line 432
    .line 433
    :goto_9
    return-object v8

    .line 434
    :pswitch_0
    move-object v7, v3

    .line 435
    check-cast v7, La/ul2;

    .line 436
    .line 437
    iget-object v8, v5, La/ql2;->p:Ljava/util/List;

    .line 438
    .line 439
    iget-object v0, v5, La/ql2;->q:Ljava/util/List;

    .line 440
    .line 441
    iget v9, v5, La/ql2;->r:I

    .line 442
    .line 443
    sget-object v10, La/wne;->a:La/wne;

    .line 444
    .line 445
    iget-boolean v3, v5, La/ql2;->o:Z

    .line 446
    .line 447
    if-eqz v3, :cond_f

    .line 448
    .line 449
    const/4 v4, 0x1

    .line 450
    if-ne v3, v4, :cond_e

    .line 451
    .line 452
    iget-object v0, v5, La/ql2;->n:Ljava/util/Collection;

    .line 453
    .line 454
    check-cast v0, Ljava/util/Collection;

    .line 455
    .line 456
    iget-object v1, v5, La/ql2;->m:La/pbs0;

    .line 457
    .line 458
    iget-object v2, v5, La/ql2;->l:Ljava/util/Iterator;

    .line 459
    .line 460
    iget-object v3, v5, La/ql2;->k:Ljava/util/Collection;

    .line 461
    .line 462
    check-cast v3, Ljava/util/Collection;

    .line 463
    .line 464
    iget-object v4, v5, La/ql2;->s:La/i3t0;

    .line 465
    .line 466
    check-cast v4, La/ul2;

    .line 467
    .line 468
    iget-object v11, v5, La/ql2;->j:Ljava/util/HashMap;

    .line 469
    .line 470
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 471
    .line 472
    .line 473
    move-object v14, v11

    .line 474
    const/16 v16, 0x1

    .line 475
    .line 476
    move-object v11, v0

    .line 477
    move-object/from16 v0, p1

    .line 478
    .line 479
    goto/16 :goto_e

    .line 480
    .line 481
    :cond_e
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 482
    .line 483
    .line 484
    const/4 v8, 0x0

    .line 485
    goto/16 :goto_13

    .line 486
    .line 487
    :cond_f
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    new-instance v2, Ljava/util/HashMap;

    .line 491
    .line 492
    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    .line 493
    .line 494
    .line 495
    invoke-static {v9, v0}, Lkotlin/collections/CollectionsKt;->E0(ILjava/util/List;)Ljava/util/List;

    .line 496
    .line 497
    .line 498
    move-result-object v0

    .line 499
    new-instance v3, Ljava/util/ArrayList;

    .line 500
    .line 501
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 502
    .line 503
    .line 504
    move-result v1

    .line 505
    invoke-direct {v3, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 506
    .line 507
    .line 508
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 509
    .line 510
    .line 511
    move-result-object v0

    .line 512
    move-object v12, v0

    .line 513
    move-object v14, v2

    .line 514
    move-object v13, v7

    .line 515
    :goto_a
    move-object v11, v3

    .line 516
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 517
    .line 518
    .line 519
    move-result v0

    .line 520
    if-eqz v0, :cond_16

    .line 521
    .line 522
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    move-object v15, v0

    .line 527
    check-cast v15, La/pbs0;

    .line 528
    .line 529
    new-instance v0, Ljava/util/ArrayList;

    .line 530
    .line 531
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 532
    .line 533
    .line 534
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 535
    .line 536
    .line 537
    move-result-object v1

    .line 538
    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 539
    .line 540
    .line 541
    move-result v2

    .line 542
    if-eqz v2, :cond_10

    .line 543
    .line 544
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 545
    .line 546
    .line 547
    move-result-object v2

    .line 548
    check-cast v2, La/cit0;

    .line 549
    .line 550
    iget-object v2, v2, La/cit0;->e:Ljava/util/List;

    .line 551
    .line 552
    invoke-static {v0, v2}, La/w3d;->u(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 553
    .line 554
    .line 555
    goto :goto_b

    .line 556
    :cond_10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    if-eqz v1, :cond_12

    .line 565
    .line 566
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    move-object v2, v1

    .line 571
    check-cast v2, La/m97;

    .line 572
    .line 573
    iget-wide v2, v2, La/m97;->h:J

    .line 574
    .line 575
    iget-object v4, v15, La/pbs0;->b:La/m97;

    .line 576
    .line 577
    move-object/from16 p1, v0

    .line 578
    .line 579
    move-object/from16 v17, v1

    .line 580
    .line 581
    iget-wide v0, v4, La/m97;->h:J

    .line 582
    .line 583
    cmp-long v0, v2, v0

    .line 584
    .line 585
    if-nez v0, :cond_11

    .line 586
    .line 587
    goto :goto_d

    .line 588
    :cond_11
    move-object/from16 v0, p1

    .line 589
    .line 590
    goto :goto_c

    .line 591
    :cond_12
    const/16 v17, 0x0

    .line 592
    .line 593
    :goto_d
    move-object/from16 v0, v17

    .line 594
    .line 595
    check-cast v0, La/m97;

    .line 596
    .line 597
    if-eqz v0, :cond_15

    .line 598
    .line 599
    iget-object v1, v13, La/ul2;->O:La/hsj;

    .line 600
    .line 601
    iget-wide v2, v0, La/m97;->h:J

    .line 602
    .line 603
    iget-object v0, v15, La/pbs0;->b:La/m97;

    .line 604
    .line 605
    move-object v4, v1

    .line 606
    iget-wide v0, v0, La/m97;->i:J

    .line 607
    .line 608
    iput-object v8, v5, La/ql2;->p:Ljava/util/List;

    .line 609
    .line 610
    move-wide/from16 v17, v0

    .line 611
    .line 612
    const/4 v0, 0x0

    .line 613
    iput-object v0, v5, La/ql2;->q:Ljava/util/List;

    .line 614
    .line 615
    iput-object v14, v5, La/ql2;->j:Ljava/util/HashMap;

    .line 616
    .line 617
    iput-object v13, v5, La/ql2;->s:La/i3t0;

    .line 618
    .line 619
    move-object v0, v11

    .line 620
    check-cast v0, Ljava/util/Collection;

    .line 621
    .line 622
    iput-object v0, v5, La/ql2;->k:Ljava/util/Collection;

    .line 623
    .line 624
    iput-object v12, v5, La/ql2;->l:Ljava/util/Iterator;

    .line 625
    .line 626
    iput-object v15, v5, La/ql2;->m:La/pbs0;

    .line 627
    .line 628
    iput-object v0, v5, La/ql2;->n:Ljava/util/Collection;

    .line 629
    .line 630
    iput v9, v5, La/ql2;->r:I

    .line 631
    .line 632
    const/4 v0, 0x1

    .line 633
    iput-boolean v0, v5, La/ql2;->o:Z

    .line 634
    .line 635
    move/from16 v16, v0

    .line 636
    .line 637
    move-wide v1, v2

    .line 638
    move-object v0, v4

    .line 639
    move-wide/from16 v3, v17

    .line 640
    .line 641
    invoke-virtual/range {v0 .. v5}, La/hsj;->m(JJLa/zje;)Ljava/lang/Enum;

    .line 642
    .line 643
    .line 644
    move-result-object v0

    .line 645
    if-ne v0, v10, :cond_13

    .line 646
    .line 647
    move-object v8, v10

    .line 648
    goto/16 :goto_13

    .line 649
    .line 650
    :cond_13
    move-object v3, v11

    .line 651
    move-object v2, v12

    .line 652
    move-object v4, v13

    .line 653
    move-object v1, v15

    .line 654
    :goto_e
    check-cast v0, La/fho;

    .line 655
    .line 656
    if-eqz v0, :cond_14

    .line 657
    .line 658
    move-object v12, v2

    .line 659
    move-object v13, v4

    .line 660
    goto :goto_10

    .line 661
    :cond_14
    move-object v15, v1

    .line 662
    move-object v12, v2

    .line 663
    move-object v13, v4

    .line 664
    goto :goto_f

    .line 665
    :cond_15
    const/16 v16, 0x1

    .line 666
    .line 667
    move-object v3, v11

    .line 668
    :goto_f
    sget-object v0, La/fho;->a:La/fho;

    .line 669
    .line 670
    move-object v1, v15

    .line 671
    :goto_10
    iget-object v2, v1, La/pbs0;->b:La/m97;

    .line 672
    .line 673
    iget-wide v4, v2, La/m97;->h:J

    .line 674
    .line 675
    new-instance v2, Ljava/lang/Long;

    .line 676
    .line 677
    invoke-direct {v2, v4, v5}, Ljava/lang/Long;-><init>(J)V

    .line 678
    .line 679
    .line 680
    invoke-interface {v14, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    new-instance v0, La/qbs0;

    .line 684
    .line 685
    iget-object v2, v1, La/pbs0;->a:La/acs0;

    .line 686
    .line 687
    invoke-static {v2}, La/zcm0;->p(La/acs0;)La/bcs0;

    .line 688
    .line 689
    .line 690
    move-result-object v2

    .line 691
    iget-object v1, v1, La/pbs0;->b:La/m97;

    .line 692
    .line 693
    invoke-static {v1}, La/ibm0;->C(La/m97;)La/mbs0;

    .line 694
    .line 695
    .line 696
    move-result-object v1

    .line 697
    invoke-direct {v0, v2, v1}, La/qbs0;-><init>(La/bcs0;La/mbs0;)V

    .line 698
    .line 699
    .line 700
    invoke-interface {v11, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    move-object/from16 v5, p0

    .line 704
    .line 705
    goto/16 :goto_a

    .line 706
    .line 707
    :cond_16
    check-cast v11, Ljava/util/List;

    .line 708
    .line 709
    invoke-static {v11}, Lkotlin/collections/CollectionsKt;->t0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 710
    .line 711
    .line 712
    move-result-object v0

    .line 713
    sget v1, La/ul2;->S:I

    .line 714
    .line 715
    invoke-virtual {v7}, La/i3t0;->D()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v1

    .line 719
    check-cast v1, La/nl2;

    .line 720
    .line 721
    iget-object v1, v1, La/nl2;->h:La/s4i0;

    .line 722
    .line 723
    if-nez v1, :cond_17

    .line 724
    .line 725
    goto :goto_12

    .line 726
    :cond_17
    if-eqz v0, :cond_18

    .line 727
    .line 728
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 729
    .line 730
    .line 731
    move-result v2

    .line 732
    if-eqz v2, :cond_18

    .line 733
    .line 734
    goto :goto_11

    .line 735
    :cond_18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 736
    .line 737
    .line 738
    move-result-object v2

    .line 739
    :cond_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 740
    .line 741
    .line 742
    move-result v3

    .line 743
    if-eqz v3, :cond_1a

    .line 744
    .line 745
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object v3

    .line 749
    check-cast v3, La/qbs0;

    .line 750
    .line 751
    iget-object v4, v3, La/qbs0;->a:La/bcs0;

    .line 752
    .line 753
    iget-wide v4, v4, La/bcs0;->a:J

    .line 754
    .line 755
    iget-wide v8, v1, La/s4i0;->a:J

    .line 756
    .line 757
    cmp-long v4, v4, v8

    .line 758
    .line 759
    if-nez v4, :cond_19

    .line 760
    .line 761
    iget-object v3, v3, La/qbs0;->b:La/mbs0;

    .line 762
    .line 763
    iget-wide v3, v3, La/mbs0;->h:J

    .line 764
    .line 765
    iget-wide v8, v1, La/s4i0;->b:J

    .line 766
    .line 767
    cmp-long v3, v3, v8

    .line 768
    .line 769
    if-nez v3, :cond_19

    .line 770
    .line 771
    goto :goto_12

    .line 772
    :cond_1a
    :goto_11
    sget-object v1, La/el2;->a:La/el2;

    .line 773
    .line 774
    invoke-virtual {v7, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 775
    .line 776
    .line 777
    iget-object v1, v7, La/i3t0;->i:La/ocj;

    .line 778
    .line 779
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 780
    .line 781
    :cond_1b
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 782
    .line 783
    .line 784
    move-result-object v2

    .line 785
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 786
    .line 787
    .line 788
    iget-object v3, v7, La/i3t0;->f:La/oyg0;

    .line 789
    .line 790
    move-object/from16 v17, v2

    .line 791
    .line 792
    check-cast v17, La/nl2;

    .line 793
    .line 794
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 795
    .line 796
    .line 797
    const/16 v26, 0x0

    .line 798
    .line 799
    const/16 v27, 0x17f

    .line 800
    .line 801
    const/16 v18, 0x0

    .line 802
    .line 803
    const/16 v19, 0x0

    .line 804
    .line 805
    const/16 v20, 0x0

    .line 806
    .line 807
    const/16 v21, 0x0

    .line 808
    .line 809
    const/16 v22, 0x0

    .line 810
    .line 811
    const/16 v23, 0x0

    .line 812
    .line 813
    const/16 v24, 0x0

    .line 814
    .line 815
    const/16 v25, 0x0

    .line 816
    .line 817
    invoke-static/range {v17 .. v27}, La/nl2;->a(La/nl2;La/yk2;ZZLa/gds0;ZZZLa/s4i0;La/s4i0;I)La/nl2;

    .line 818
    .line 819
    .line 820
    move-result-object v3

    .line 821
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 822
    .line 823
    .line 824
    move-result v2

    .line 825
    if-eqz v2, :cond_1b

    .line 826
    .line 827
    iget-object v1, v7, La/ul2;->o:La/vzg0;

    .line 828
    .line 829
    const/4 v2, 0x0

    .line 830
    invoke-virtual {v1, v6, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 831
    .line 832
    .line 833
    :goto_12
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 834
    .line 835
    new-instance v1, La/fds0;

    .line 836
    .line 837
    invoke-direct {v1, v0, v14}, La/fds0;-><init>(Ljava/util/List;Ljava/util/HashMap;)V

    .line 838
    .line 839
    .line 840
    new-instance v8, La/j0g0;

    .line 841
    .line 842
    invoke-direct {v8, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 843
    .line 844
    .line 845
    :goto_13
    return-object v8

    .line 846
    nop

    .line 847
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ql2;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ql2;->t:La/i3t0;

    .line 4
    .line 5
    check-cast p1, Ljava/util/List;

    .line 6
    .line 7
    check-cast p2, Ljava/util/List;

    .line 8
    .line 9
    check-cast p3, Ljava/lang/Number;

    .line 10
    .line 11
    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    .line 12
    .line 13
    .line 14
    move-result p3

    .line 15
    check-cast p4, La/yje;

    .line 16
    .line 17
    packed-switch v0, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    new-instance v0, La/ql2;

    .line 21
    .line 22
    check-cast p0, La/v360;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, p0, p4, v1}, La/ql2;-><init>(La/i3t0;La/yje;B)V

    .line 26
    .line 27
    .line 28
    iput-object p1, v0, La/ql2;->p:Ljava/util/List;

    .line 29
    .line 30
    iput-object p2, v0, La/ql2;->q:Ljava/util/List;

    .line 31
    .line 32
    iput p3, v0, La/ql2;->r:I

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {v0, p0}, La/ql2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    new-instance v0, La/ql2;

    .line 42
    .line 43
    check-cast p0, La/ul2;

    .line 44
    .line 45
    const/4 v1, 0x0

    .line 46
    invoke-direct {v0, p0, p4, v1}, La/ql2;-><init>(La/i3t0;La/yje;B)V

    .line 47
    .line 48
    .line 49
    iput-object p1, v0, La/ql2;->p:Ljava/util/List;

    .line 50
    .line 51
    iput-object p2, v0, La/ql2;->q:Ljava/util/List;

    .line 52
    .line 53
    iput p3, v0, La/ql2;->r:I

    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    invoke-virtual {v0, p0}, La/ql2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
