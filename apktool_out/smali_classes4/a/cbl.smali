.class public final La/cbl;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public i:La/szj0;

.field public j:I

.field public k:B

.field public synthetic l:La/ats;

.field public synthetic m:La/x9l;

.field public final synthetic n:La/ebl;


# direct methods
.method public constructor <init>(La/ebl;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/cbl;->n:La/ebl;

    .line 2
    .line 3
    const/4 p1, 0x3

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, La/ats;

    .line 2
    .line 3
    check-cast p2, La/x9l;

    .line 4
    .line 5
    check-cast p3, La/yje;

    .line 6
    .line 7
    new-instance v0, La/cbl;

    .line 8
    .line 9
    iget-object p0, p0, La/cbl;->n:La/ebl;

    .line 10
    .line 11
    invoke-direct {v0, p0, p3}, La/cbl;-><init>(La/ebl;La/yje;)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/cbl;->l:La/ats;

    .line 15
    .line 16
    iput-object p2, v0, La/cbl;->m:La/x9l;

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    invoke-virtual {v0, p0}, La/cbl;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 54

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/cbl;->n:La/ebl;

    .line 4
    .line 5
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 6
    .line 7
    iget-object v3, v0, La/cbl;->l:La/ats;

    .line 8
    .line 9
    iget-object v7, v0, La/cbl;->m:La/x9l;

    .line 10
    .line 11
    sget-object v4, La/wne;->a:La/wne;

    .line 12
    .line 13
    iget-byte v5, v0, La/cbl;->k:B

    .line 14
    .line 15
    const/4 v6, 0x4

    .line 16
    const/4 v8, 0x3

    .line 17
    const/4 v9, 0x2

    .line 18
    const/16 v23, 0x0

    .line 19
    .line 20
    const/4 v10, 0x1

    .line 21
    const/4 v11, 0x0

    .line 22
    if-eqz v5, :cond_5

    .line 23
    .line 24
    if-eq v5, v10, :cond_3

    .line 25
    .line 26
    if-eq v5, v9, :cond_2

    .line 27
    .line 28
    if-eq v5, v8, :cond_1

    .line 29
    .line 30
    if-ne v5, v6, :cond_0

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    move-object v9, v1

    .line 36
    goto/16 :goto_9

    .line 37
    .line 38
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 39
    .line 40
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v11

    .line 44
    :cond_1
    iget v2, v0, La/cbl;->j:I

    .line 45
    .line 46
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    move-object v5, v0

    .line 50
    move-object v9, v1

    .line 51
    move-object v14, v4

    .line 52
    move-object v6, v11

    .line 53
    goto/16 :goto_7

    .line 54
    .line 55
    :cond_2
    iget v2, v0, La/cbl;->j:I

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v5, v0

    .line 61
    move-object v9, v1

    .line 62
    move-object v14, v4

    .line 63
    move/from16 v31, v10

    .line 64
    .line 65
    move-object v6, v11

    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_3
    iget-object v5, v0, La/cbl;->i:La/szj0;

    .line 69
    .line 70
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v12, p1

    .line 74
    .line 75
    :cond_4
    move-object/from16 v21, v5

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_5
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    iget-object v5, v1, La/ebl;->o:La/vzg0;

    .line 82
    .line 83
    const-string v12, "game_request_state_key"

    .line 84
    .line 85
    iget-object v13, v3, La/ats;->b:La/gps;

    .line 86
    .line 87
    invoke-virtual {v5, v12, v13}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, v3, La/ats;->a:La/jlr;

    .line 91
    .line 92
    invoke-static {v5}, La/d5c;->C(La/jlr;)La/m9s;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    if-eqz v5, :cond_6

    .line 97
    .line 98
    iget-object v5, v5, La/m9s;->M:La/szj0;

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    move-object v5, v11

    .line 102
    :goto_0
    iput-object v3, v0, La/cbl;->l:La/ats;

    .line 103
    .line 104
    iput-object v7, v0, La/cbl;->m:La/x9l;

    .line 105
    .line 106
    iput-object v5, v0, La/cbl;->i:La/szj0;

    .line 107
    .line 108
    iput-byte v10, v0, La/cbl;->k:B

    .line 109
    .line 110
    invoke-virtual {v1, v3, v0}, La/ebl;->N(La/ats;La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v12

    .line 114
    if-ne v12, v4, :cond_4

    .line 115
    .line 116
    move-object v14, v4

    .line 117
    goto/16 :goto_8

    .line 118
    .line 119
    :goto_1
    check-cast v12, La/yws;

    .line 120
    .line 121
    iget-object v5, v1, La/ebl;->z:La/drm0;

    .line 122
    .line 123
    invoke-virtual {v5, v12}, La/drm0;->g(La/yws;)V

    .line 124
    .line 125
    .line 126
    iget-object v5, v2, La/ocj;->a:La/p7m0;

    .line 127
    .line 128
    :goto_2
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v13

    .line 132
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-object v14, v4

    .line 136
    move-object v4, v13

    .line 137
    check-cast v4, La/f9l;

    .line 138
    .line 139
    move-object v15, v5

    .line 140
    iget-object v5, v3, La/ats;->b:La/gps;

    .line 141
    .line 142
    move/from16 v16, v6

    .line 143
    .line 144
    iget-object v6, v3, La/ats;->a:La/jlr;

    .line 145
    .line 146
    const/16 v20, 0x0

    .line 147
    .line 148
    const v22, 0x2dffff1

    .line 149
    .line 150
    .line 151
    move/from16 v17, v8

    .line 152
    .line 153
    const/4 v8, 0x0

    .line 154
    move/from16 v18, v9

    .line 155
    .line 156
    const/4 v9, 0x0

    .line 157
    move/from16 v19, v10

    .line 158
    .line 159
    const/4 v10, 0x0

    .line 160
    move-object/from16 v24, v11

    .line 161
    .line 162
    const/4 v11, 0x0

    .line 163
    move/from16 v25, v18

    .line 164
    .line 165
    move-object/from16 v18, v12

    .line 166
    .line 167
    const/4 v12, 0x0

    .line 168
    move-object/from16 v26, v13

    .line 169
    .line 170
    const/4 v13, 0x0

    .line 171
    move-object/from16 v27, v14

    .line 172
    .line 173
    const/4 v14, 0x0

    .line 174
    move-object/from16 v28, v15

    .line 175
    .line 176
    const/4 v15, 0x0

    .line 177
    move/from16 v29, v16

    .line 178
    .line 179
    const/16 v16, 0x0

    .line 180
    .line 181
    move/from16 v30, v17

    .line 182
    .line 183
    const/16 v17, 0x0

    .line 184
    .line 185
    move/from16 v31, v19

    .line 186
    .line 187
    const/16 v19, 0x0

    .line 188
    .line 189
    move-object/from16 v24, v1

    .line 190
    .line 191
    move-object/from16 v0, v26

    .line 192
    .line 193
    move-object/from16 v32, v27

    .line 194
    .line 195
    move-object/from16 v1, v28

    .line 196
    .line 197
    invoke-static/range {v4 .. v22}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 198
    .line 199
    .line 200
    move-result-object v4

    .line 201
    invoke-virtual {v1, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v0

    .line 205
    if-eqz v0, :cond_14

    .line 206
    .line 207
    if-eqz v7, :cond_7

    .line 208
    .line 209
    iget-object v0, v7, La/x9l;->a:La/c5l;

    .line 210
    .line 211
    iget-object v0, v0, La/c5l;->e:Ljava/util/List;

    .line 212
    .line 213
    if-eqz v0, :cond_7

    .line 214
    .line 215
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    goto :goto_3

    .line 220
    :cond_7
    move/from16 v0, v23

    .line 221
    .line 222
    :goto_3
    invoke-virtual/range {v24 .. v24}, La/i3t0;->D()Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v1

    .line 226
    check-cast v1, La/f9l;

    .line 227
    .line 228
    iget v1, v1, La/f9l;->w:I

    .line 229
    .line 230
    if-ge v1, v0, :cond_a

    .line 231
    .line 232
    iget-object v1, v2, La/ocj;->a:La/p7m0;

    .line 233
    .line 234
    :goto_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-object/from16 v35, v2

    .line 242
    .line 243
    check-cast v35, La/f9l;

    .line 244
    .line 245
    const/16 v52, 0x0

    .line 246
    .line 247
    const v53, 0x3bfffff

    .line 248
    .line 249
    .line 250
    const/16 v36, 0x0

    .line 251
    .line 252
    const/16 v37, 0x0

    .line 253
    .line 254
    const/16 v38, 0x0

    .line 255
    .line 256
    const/16 v39, 0x0

    .line 257
    .line 258
    const/16 v40, 0x0

    .line 259
    .line 260
    const/16 v41, 0x0

    .line 261
    .line 262
    const/16 v42, 0x0

    .line 263
    .line 264
    const/16 v43, 0x0

    .line 265
    .line 266
    const/16 v44, 0x0

    .line 267
    .line 268
    const/16 v45, 0x0

    .line 269
    .line 270
    const/16 v46, 0x0

    .line 271
    .line 272
    const/16 v47, 0x0

    .line 273
    .line 274
    const/16 v48, 0x0

    .line 275
    .line 276
    const/16 v49, 0x0

    .line 277
    .line 278
    const/16 v51, 0x0

    .line 279
    .line 280
    move/from16 v50, v0

    .line 281
    .line 282
    invoke-static/range {v35 .. v53}, La/f9l;->a(La/f9l;La/gps;La/jlr;La/x9l;La/ypl0;La/bqr;La/xus;ZLa/z6l;Ljava/util/ArrayList;ZLjava/util/List;ZZLa/yws;IILa/szj0;I)La/f9l;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    move/from16 v4, v50

    .line 287
    .line 288
    invoke-virtual {v1, v2, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    if-eqz v0, :cond_9

    .line 293
    .line 294
    invoke-virtual/range {v24 .. v24}, La/i3t0;->D()Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v0

    .line 298
    check-cast v0, La/f9l;

    .line 299
    .line 300
    iget-object v0, v0, La/f9l;->c:La/jlr;

    .line 301
    .line 302
    invoke-static {v0}, La/d5c;->C(La/jlr;)La/m9s;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    if-nez v0, :cond_8

    .line 307
    .line 308
    invoke-static {}, La/uzb;->X()La/m9s;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :cond_8
    move-object/from16 v5, p0

    .line 313
    .line 314
    iput-object v3, v5, La/cbl;->l:La/ats;

    .line 315
    .line 316
    iput-object v7, v5, La/cbl;->m:La/x9l;

    .line 317
    .line 318
    const/4 v6, 0x0

    .line 319
    iput-object v6, v5, La/cbl;->i:La/szj0;

    .line 320
    .line 321
    iput v4, v5, La/cbl;->j:I

    .line 322
    .line 323
    const/4 v8, 0x2

    .line 324
    iput-byte v8, v5, La/cbl;->k:B

    .line 325
    .line 326
    move-object/from16 v9, v24

    .line 327
    .line 328
    invoke-virtual {v9, v0, v5}, La/ebl;->M(La/m9s;La/zje;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    move-object/from16 v14, v32

    .line 333
    .line 334
    if-ne v0, v14, :cond_b

    .line 335
    .line 336
    goto/16 :goto_8

    .line 337
    .line 338
    :cond_9
    move-object/from16 v5, p0

    .line 339
    .line 340
    move v0, v4

    .line 341
    goto :goto_4

    .line 342
    :cond_a
    move-object/from16 v5, p0

    .line 343
    .line 344
    move v4, v0

    .line 345
    move-object/from16 v9, v24

    .line 346
    .line 347
    move-object/from16 v14, v32

    .line 348
    .line 349
    const/4 v6, 0x0

    .line 350
    :cond_b
    move v2, v4

    .line 351
    :goto_5
    iget-object v0, v9, La/ebl;->y:La/sbu;

    .line 352
    .line 353
    iget-object v1, v3, La/ats;->a:La/jlr;

    .line 354
    .line 355
    if-eqz v7, :cond_c

    .line 356
    .line 357
    iget-boolean v4, v7, La/x9l;->e:Z

    .line 358
    .line 359
    if-nez v4, :cond_c

    .line 360
    .line 361
    move/from16 v23, v31

    .line 362
    .line 363
    :cond_c
    xor-int/lit8 v35, v23, 0x1

    .line 364
    .line 365
    sget-object v4, La/k5s;->a:La/k5s;

    .line 366
    .line 367
    instance-of v7, v1, La/xkr;

    .line 368
    .line 369
    if-eqz v7, :cond_d

    .line 370
    .line 371
    new-instance v33, La/t5s;

    .line 372
    .line 373
    check-cast v1, La/xkr;

    .line 374
    .line 375
    iget-object v4, v1, La/xkr;->d:La/m9s;

    .line 376
    .line 377
    invoke-virtual {v4}, La/m9s;->b()Z

    .line 378
    .line 379
    .line 380
    move-result v34

    .line 381
    iget-wide v7, v1, La/xkr;->b:J

    .line 382
    .line 383
    iget-boolean v1, v4, La/m9s;->x:Z

    .line 384
    .line 385
    iget-wide v10, v4, La/m9s;->A:J

    .line 386
    .line 387
    iget-object v12, v4, La/m9s;->f:Ljava/lang/String;

    .line 388
    .line 389
    iget-boolean v13, v4, La/m9s;->F:Z

    .line 390
    .line 391
    move/from16 v38, v1

    .line 392
    .line 393
    move-object/from16 v43, v4

    .line 394
    .line 395
    move-wide/from16 v36, v7

    .line 396
    .line 397
    move-wide/from16 v39, v10

    .line 398
    .line 399
    move-object/from16 v41, v12

    .line 400
    .line 401
    move/from16 v42, v13

    .line 402
    .line 403
    invoke-direct/range {v33 .. v43}, La/t5s;-><init>(ZZJZJLjava/lang/String;ZLa/m9s;)V

    .line 404
    .line 405
    .line 406
    move-object/from16 v4, v33

    .line 407
    .line 408
    goto :goto_6

    .line 409
    :cond_d
    instance-of v7, v1, La/dlr;

    .line 410
    .line 411
    if-eqz v7, :cond_e

    .line 412
    .line 413
    new-instance v4, La/o5s;

    .line 414
    .line 415
    check-cast v1, La/dlr;

    .line 416
    .line 417
    iget-wide v7, v1, La/dlr;->b:J

    .line 418
    .line 419
    invoke-direct {v4, v7, v8}, La/o5s;-><init>(J)V

    .line 420
    .line 421
    .line 422
    goto :goto_6

    .line 423
    :cond_e
    instance-of v7, v1, La/alr;

    .line 424
    .line 425
    if-eqz v7, :cond_f

    .line 426
    .line 427
    goto :goto_6

    .line 428
    :cond_f
    instance-of v7, v1, La/clr;

    .line 429
    .line 430
    if-eqz v7, :cond_10

    .line 431
    .line 432
    new-instance v4, La/m5s;

    .line 433
    .line 434
    check-cast v1, La/clr;

    .line 435
    .line 436
    iget-wide v7, v1, La/clr;->b:J

    .line 437
    .line 438
    const-wide/16 v10, 0x1

    .line 439
    .line 440
    invoke-direct {v4, v7, v8, v10, v11}, La/m5s;-><init>(JJ)V

    .line 441
    .line 442
    .line 443
    :cond_10
    :goto_6
    iput-object v3, v5, La/cbl;->l:La/ats;

    .line 444
    .line 445
    iput-object v6, v5, La/cbl;->m:La/x9l;

    .line 446
    .line 447
    iput-object v6, v5, La/cbl;->i:La/szj0;

    .line 448
    .line 449
    iput v2, v5, La/cbl;->j:I

    .line 450
    .line 451
    const/4 v10, 0x3

    .line 452
    iput-byte v10, v5, La/cbl;->k:B

    .line 453
    .line 454
    invoke-virtual {v0, v4}, La/sbu;->a(La/v5s;)Lkotlin/Unit;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    if-ne v0, v14, :cond_11

    .line 459
    .line 460
    goto :goto_8

    .line 461
    :cond_11
    :goto_7
    iput-object v3, v5, La/cbl;->l:La/ats;

    .line 462
    .line 463
    iput-object v6, v5, La/cbl;->m:La/x9l;

    .line 464
    .line 465
    iput-object v6, v5, La/cbl;->i:La/szj0;

    .line 466
    .line 467
    iput v2, v5, La/cbl;->j:I

    .line 468
    .line 469
    const/4 v0, 0x4

    .line 470
    iput-byte v0, v5, La/cbl;->k:B

    .line 471
    .line 472
    sget v0, La/ebl;->g0:I

    .line 473
    .line 474
    invoke-virtual {v9, v5}, La/ebl;->O(La/zje;)Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v0

    .line 478
    if-ne v0, v14, :cond_12

    .line 479
    .line 480
    :goto_8
    return-object v14

    .line 481
    :cond_12
    :goto_9
    iget-object v0, v3, La/ats;->a:La/jlr;

    .line 482
    .line 483
    sget v1, La/ebl;->g0:I

    .line 484
    .line 485
    instance-of v1, v0, La/clr;

    .line 486
    .line 487
    if-eqz v1, :cond_13

    .line 488
    .line 489
    iget-object v1, v9, La/ebl;->O:La/hzg;

    .line 490
    .line 491
    check-cast v0, La/clr;

    .line 492
    .line 493
    iget-wide v4, v0, La/clr;->b:J

    .line 494
    .line 495
    iget-object v0, v9, La/ebl;->r:Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;

    .line 496
    .line 497
    iget-wide v6, v0, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->d:J

    .line 498
    .line 499
    iget v3, v0, Lorg/xplatform/cyber/game/dota/api/presentation/CyberGameDotaScreenParams;->i:I

    .line 500
    .line 501
    move-object v2, v1

    .line 502
    check-cast v2, La/uzg;

    .line 503
    .line 504
    invoke-virtual/range {v2 .. v7}, La/uzg;->q(IJJ)V

    .line 505
    .line 506
    .line 507
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 508
    .line 509
    return-object v0

    .line 510
    :cond_14
    move-object/from16 v0, p0

    .line 511
    .line 512
    move-object v5, v1

    .line 513
    move-object/from16 v12, v18

    .line 514
    .line 515
    move-object/from16 v1, v24

    .line 516
    .line 517
    move/from16 v10, v31

    .line 518
    .line 519
    move-object/from16 v4, v32

    .line 520
    .line 521
    const/4 v6, 0x4

    .line 522
    const/4 v8, 0x3

    .line 523
    const/4 v9, 0x2

    .line 524
    const/4 v11, 0x0

    .line 525
    goto/16 :goto_2
.end method
