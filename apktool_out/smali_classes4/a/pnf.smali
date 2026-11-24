.class public final La/pnf;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements La/ydr;


# instance fields
.field public final synthetic i:B

.field public j:B

.field public k:Ljava/lang/Object;

.field public synthetic l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/rnf;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/pnf;->i:B

    .line 13
    iput-object p1, p0, La/pnf;->n:Ljava/lang/Object;

    const/4 p1, 0x4

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function1;La/xdr;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/pnf;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/pnf;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/pnf;->n:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 p1, 0x4

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pnf;->i:B

    .line 4
    .line 5
    iget-object v3, v0, La/pnf;->n:Ljava/lang/Object;

    .line 6
    .line 7
    const-string v4, "call to \'resume\' before \'invoke\' with coroutine"

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x2

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, La/pnf;->k:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v1, La/kmq;

    .line 18
    .line 19
    iget-object v8, v0, La/pnf;->l:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v8, Ljava/lang/Throwable;

    .line 22
    .line 23
    sget-object v9, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-byte v10, v0, La/pnf;->j:B

    .line 26
    .line 27
    if-eqz v10, :cond_2

    .line 28
    .line 29
    if-eq v10, v5, :cond_1

    .line 30
    .line 31
    if-ne v10, v6, :cond_0

    .line 32
    .line 33
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    goto :goto_2

    .line 37
    :cond_0
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    goto :goto_4

    .line 41
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object/from16 v4, p1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v0, La/pnf;->m:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 53
    .line 54
    iput-object v1, v0, La/pnf;->k:Ljava/lang/Object;

    .line 55
    .line 56
    iput-object v8, v0, La/pnf;->l:Ljava/lang/Object;

    .line 57
    .line 58
    iput-byte v5, v0, La/pnf;->j:B

    .line 59
    .line 60
    invoke-interface {v4, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v4

    .line 64
    if-ne v4, v9, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    check-cast v4, Ljava/lang/Boolean;

    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-nez v4, :cond_5

    .line 74
    .line 75
    check-cast v3, La/xdr;

    .line 76
    .line 77
    iput-object v7, v0, La/pnf;->k:Ljava/lang/Object;

    .line 78
    .line 79
    iput-object v7, v0, La/pnf;->l:Ljava/lang/Object;

    .line 80
    .line 81
    iput-byte v6, v0, La/pnf;->j:B

    .line 82
    .line 83
    invoke-interface {v3, v1, v8, v0}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    if-ne v0, v9, :cond_4

    .line 88
    .line 89
    :goto_1
    move-object v7, v9

    .line 90
    goto :goto_4

    .line 91
    :cond_4
    :goto_2
    move v2, v5

    .line 92
    goto :goto_3

    .line 93
    :cond_5
    const/4 v2, 0x0

    .line 94
    :goto_3
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 95
    .line 96
    .line 97
    move-result-object v7

    .line 98
    :goto_4
    return-object v7

    .line 99
    :pswitch_0
    check-cast v3, La/rnf;

    .line 100
    .line 101
    iget-object v1, v0, La/pnf;->l:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v1, La/ats;

    .line 104
    .line 105
    iget-object v8, v0, La/pnf;->m:Ljava/lang/Object;

    .line 106
    .line 107
    move-object v13, v8

    .line 108
    check-cast v13, La/mrf;

    .line 109
    .line 110
    sget-object v8, La/wne;->a:La/wne;

    .line 111
    .line 112
    iget-byte v9, v0, La/pnf;->j:B

    .line 113
    .line 114
    const/4 v10, 0x3

    .line 115
    if-eqz v9, :cond_a

    .line 116
    .line 117
    if-eq v9, v5, :cond_8

    .line 118
    .line 119
    if-eq v9, v6, :cond_7

    .line 120
    .line 121
    if-ne v9, v10, :cond_6

    .line 122
    .line 123
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    goto/16 :goto_f

    .line 127
    .line 128
    :cond_6
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    goto/16 :goto_10

    .line 132
    .line 133
    :cond_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    move-object v6, v7

    .line 137
    goto/16 :goto_d

    .line 138
    .line 139
    :cond_8
    iget-object v4, v0, La/pnf;->k:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v4, La/szj0;

    .line 142
    .line 143
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    move-object/from16 v9, p1

    .line 147
    .line 148
    :cond_9
    move-object/from16 v24, v4

    .line 149
    .line 150
    goto :goto_6

    .line 151
    :cond_a
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 152
    .line 153
    .line 154
    iget-object v4, v3, La/rnf;->o:La/vzg0;

    .line 155
    .line 156
    const-string v9, "game_request_state_key"

    .line 157
    .line 158
    iget-object v11, v1, La/ats;->b:La/gps;

    .line 159
    .line 160
    invoke-virtual {v4, v9, v11}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    iget-object v4, v1, La/ats;->a:La/jlr;

    .line 164
    .line 165
    invoke-static {v4}, La/d5c;->C(La/jlr;)La/m9s;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    if-eqz v4, :cond_b

    .line 170
    .line 171
    iget-object v4, v4, La/m9s;->M:La/szj0;

    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_b
    move-object v4, v7

    .line 175
    :goto_5
    iput-object v1, v0, La/pnf;->l:Ljava/lang/Object;

    .line 176
    .line 177
    iput-object v13, v0, La/pnf;->m:Ljava/lang/Object;

    .line 178
    .line 179
    iput-object v4, v0, La/pnf;->k:Ljava/lang/Object;

    .line 180
    .line 181
    iput-byte v5, v0, La/pnf;->j:B

    .line 182
    .line 183
    invoke-virtual {v3, v1, v0}, La/rnf;->M(La/ats;La/zje;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v9

    .line 187
    if-ne v9, v8, :cond_9

    .line 188
    .line 189
    goto/16 :goto_e

    .line 190
    .line 191
    :goto_6
    check-cast v9, La/yws;

    .line 192
    .line 193
    iget-object v4, v3, La/rnf;->G:La/drm0;

    .line 194
    .line 195
    invoke-virtual {v4, v9}, La/drm0;->g(La/yws;)V

    .line 196
    .line 197
    .line 198
    iget-object v4, v3, La/i3t0;->i:La/ocj;

    .line 199
    .line 200
    iget-object v4, v4, La/ocj;->a:La/p7m0;

    .line 201
    .line 202
    :goto_7
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v11

    .line 206
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 207
    .line 208
    .line 209
    move-object/from16 v23, v9

    .line 210
    .line 211
    move-object v9, v11

    .line 212
    check-cast v9, La/wmf;

    .line 213
    .line 214
    iget-object v12, v1, La/ats;->b:La/gps;

    .line 215
    .line 216
    move v14, v10

    .line 217
    iget-object v10, v1, La/ats;->a:La/jlr;

    .line 218
    .line 219
    const/16 v22, 0x0

    .line 220
    .line 221
    const v25, 0x9bffdd

    .line 222
    .line 223
    .line 224
    move-object v15, v11

    .line 225
    const/4 v11, 0x0

    .line 226
    move-object/from16 v21, v12

    .line 227
    .line 228
    const/4 v12, 0x0

    .line 229
    move/from16 v16, v14

    .line 230
    .line 231
    const/4 v14, 0x0

    .line 232
    move-object/from16 v17, v15

    .line 233
    .line 234
    const/4 v15, 0x0

    .line 235
    move/from16 v18, v16

    .line 236
    .line 237
    const/16 v16, 0x0

    .line 238
    .line 239
    move-object/from16 v19, v17

    .line 240
    .line 241
    const/16 v17, 0x0

    .line 242
    .line 243
    move/from16 v20, v18

    .line 244
    .line 245
    const/16 v18, 0x0

    .line 246
    .line 247
    move-object/from16 v26, v19

    .line 248
    .line 249
    const/16 v19, 0x0

    .line 250
    .line 251
    move/from16 v27, v20

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    move-object/from16 v2, v26

    .line 256
    .line 257
    invoke-static/range {v9 .. v25}, La/wmf;->a(La/wmf;La/jlr;La/bqr;ZLa/mrf;Ljava/util/List;La/ypl0;ZZLjava/util/ArrayList;ZLa/xus;La/gps;La/qmf;La/yws;La/szj0;I)La/wmf;

    .line 258
    .line 259
    .line 260
    move-result-object v9

    .line 261
    invoke-virtual {v4, v2, v9}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result v2

    .line 265
    if-eqz v2, :cond_19

    .line 266
    .line 267
    iget-object v2, v3, La/rnf;->F:La/sbu;

    .line 268
    .line 269
    iget-object v4, v1, La/ats;->a:La/jlr;

    .line 270
    .line 271
    instance-of v9, v4, La/xkr;

    .line 272
    .line 273
    if-eqz v9, :cond_c

    .line 274
    .line 275
    move-object v10, v4

    .line 276
    check-cast v10, La/xkr;

    .line 277
    .line 278
    goto :goto_8

    .line 279
    :cond_c
    move-object v10, v7

    .line 280
    :goto_8
    if-eqz v10, :cond_d

    .line 281
    .line 282
    iget-object v10, v10, La/xkr;->d:La/m9s;

    .line 283
    .line 284
    if-eqz v10, :cond_d

    .line 285
    .line 286
    iget-boolean v10, v10, La/m9s;->K:Z

    .line 287
    .line 288
    if-ne v10, v5, :cond_d

    .line 289
    .line 290
    move v10, v5

    .line 291
    goto :goto_9

    .line 292
    :cond_d
    const/4 v10, 0x0

    .line 293
    :goto_9
    if-eqz v13, :cond_e

    .line 294
    .line 295
    iget-object v11, v13, La/mrf;->e:Ljava/util/List;

    .line 296
    .line 297
    goto :goto_a

    .line 298
    :cond_e
    move-object v11, v7

    .line 299
    :goto_a
    if-nez v11, :cond_f

    .line 300
    .line 301
    sget-object v11, La/iun;->a:La/iun;

    .line 302
    .line 303
    :cond_f
    invoke-static {v11}, La/yyw;->Q(Ljava/util/List;)Z

    .line 304
    .line 305
    .line 306
    move-result v11

    .line 307
    xor-int/2addr v11, v5

    .line 308
    if-eqz v10, :cond_10

    .line 309
    .line 310
    move v13, v11

    .line 311
    goto :goto_b

    .line 312
    :cond_10
    if-eqz v13, :cond_11

    .line 313
    .line 314
    iget-boolean v10, v13, La/mrf;->f:Z

    .line 315
    .line 316
    if-nez v10, :cond_11

    .line 317
    .line 318
    const/4 v13, 0x0

    .line 319
    goto :goto_b

    .line 320
    :cond_11
    move v13, v5

    .line 321
    :goto_b
    sget-object v5, La/k5s;->a:La/k5s;

    .line 322
    .line 323
    if-eqz v9, :cond_12

    .line 324
    .line 325
    new-instance v11, La/t5s;

    .line 326
    .line 327
    check-cast v4, La/xkr;

    .line 328
    .line 329
    iget-object v5, v4, La/xkr;->d:La/m9s;

    .line 330
    .line 331
    invoke-virtual {v5}, La/m9s;->b()Z

    .line 332
    .line 333
    .line 334
    move-result v12

    .line 335
    iget-wide v14, v4, La/xkr;->b:J

    .line 336
    .line 337
    iget-boolean v4, v5, La/m9s;->x:Z

    .line 338
    .line 339
    iget-wide v9, v5, La/m9s;->A:J

    .line 340
    .line 341
    iget-object v6, v5, La/m9s;->f:Ljava/lang/String;

    .line 342
    .line 343
    iget-boolean v7, v5, La/m9s;->F:Z

    .line 344
    .line 345
    move/from16 v16, v4

    .line 346
    .line 347
    move-object/from16 v21, v5

    .line 348
    .line 349
    move-object/from16 v19, v6

    .line 350
    .line 351
    move/from16 v20, v7

    .line 352
    .line 353
    move-wide/from16 v17, v9

    .line 354
    .line 355
    invoke-direct/range {v11 .. v21}, La/t5s;-><init>(ZZJZJLjava/lang/String;ZLa/m9s;)V

    .line 356
    .line 357
    .line 358
    move-object v5, v11

    .line 359
    goto :goto_c

    .line 360
    :cond_12
    instance-of v6, v4, La/dlr;

    .line 361
    .line 362
    if-eqz v6, :cond_13

    .line 363
    .line 364
    new-instance v5, La/o5s;

    .line 365
    .line 366
    check-cast v4, La/dlr;

    .line 367
    .line 368
    iget-wide v6, v4, La/dlr;->b:J

    .line 369
    .line 370
    invoke-direct {v5, v6, v7}, La/o5s;-><init>(J)V

    .line 371
    .line 372
    .line 373
    goto :goto_c

    .line 374
    :cond_13
    instance-of v6, v4, La/alr;

    .line 375
    .line 376
    if-eqz v6, :cond_14

    .line 377
    .line 378
    goto :goto_c

    .line 379
    :cond_14
    instance-of v6, v4, La/clr;

    .line 380
    .line 381
    if-eqz v6, :cond_15

    .line 382
    .line 383
    new-instance v5, La/m5s;

    .line 384
    .line 385
    check-cast v4, La/clr;

    .line 386
    .line 387
    iget-wide v6, v4, La/clr;->b:J

    .line 388
    .line 389
    const-wide/16 v9, 0x2e

    .line 390
    .line 391
    invoke-direct {v5, v6, v7, v9, v10}, La/m5s;-><init>(JJ)V

    .line 392
    .line 393
    .line 394
    :cond_15
    :goto_c
    iput-object v1, v0, La/pnf;->l:Ljava/lang/Object;

    .line 395
    .line 396
    const/4 v6, 0x0

    .line 397
    iput-object v6, v0, La/pnf;->m:Ljava/lang/Object;

    .line 398
    .line 399
    iput-object v6, v0, La/pnf;->k:Ljava/lang/Object;

    .line 400
    .line 401
    const/4 v7, 0x2

    .line 402
    iput-byte v7, v0, La/pnf;->j:B

    .line 403
    .line 404
    invoke-virtual {v2, v5}, La/sbu;->a(La/v5s;)Lkotlin/Unit;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    if-ne v2, v8, :cond_16

    .line 409
    .line 410
    goto :goto_e

    .line 411
    :cond_16
    :goto_d
    iput-object v1, v0, La/pnf;->l:Ljava/lang/Object;

    .line 412
    .line 413
    iput-object v6, v0, La/pnf;->m:Ljava/lang/Object;

    .line 414
    .line 415
    iput-object v6, v0, La/pnf;->k:Ljava/lang/Object;

    .line 416
    .line 417
    const/4 v14, 0x3

    .line 418
    iput-byte v14, v0, La/pnf;->j:B

    .line 419
    .line 420
    sget v2, La/rnf;->e0:I

    .line 421
    .line 422
    invoke-virtual {v3, v0}, La/rnf;->N(La/zje;)Ljava/lang/Object;

    .line 423
    .line 424
    .line 425
    move-result-object v0

    .line 426
    if-ne v0, v8, :cond_17

    .line 427
    .line 428
    :goto_e
    move-object v7, v8

    .line 429
    goto :goto_10

    .line 430
    :cond_17
    :goto_f
    iget-object v0, v1, La/ats;->a:La/jlr;

    .line 431
    .line 432
    sget v1, La/rnf;->e0:I

    .line 433
    .line 434
    instance-of v1, v0, La/clr;

    .line 435
    .line 436
    if-eqz v1, :cond_18

    .line 437
    .line 438
    iget-object v1, v3, La/rnf;->I:La/hzg;

    .line 439
    .line 440
    check-cast v0, La/clr;

    .line 441
    .line 442
    iget-wide v6, v0, La/clr;->b:J

    .line 443
    .line 444
    iget-object v0, v3, La/rnf;->q:Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;

    .line 445
    .line 446
    iget-wide v8, v0, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;->d:J

    .line 447
    .line 448
    iget v5, v0, Lorg/xplatform/cyber/game/counterstrike/api/Cs2GameScreenParams;->i:I

    .line 449
    .line 450
    move-object v4, v1

    .line 451
    check-cast v4, La/uzg;

    .line 452
    .line 453
    invoke-virtual/range {v4 .. v9}, La/uzg;->q(IJJ)V

    .line 454
    .line 455
    .line 456
    :cond_18
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 457
    .line 458
    :goto_10
    return-object v7

    .line 459
    :cond_19
    move-object/from16 v28, v7

    .line 460
    .line 461
    move v7, v6

    .line 462
    move-object/from16 v6, v28

    .line 463
    .line 464
    move v9, v7

    .line 465
    move-object v7, v6

    .line 466
    move v6, v9

    .line 467
    move-object/from16 v9, v23

    .line 468
    .line 469
    const/4 v10, 0x3

    .line 470
    goto/16 :goto_7

    .line 471
    .line 472
    nop

    .line 473
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final j(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pnf;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pnf;->n:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/kmq;

    .line 9
    .line 10
    check-cast p2, Ljava/lang/Throwable;

    .line 11
    .line 12
    check-cast p3, Ljava/lang/Number;

    .line 13
    .line 14
    invoke-virtual {p3}, Ljava/lang/Number;->longValue()J

    .line 15
    .line 16
    .line 17
    check-cast p4, La/yje;

    .line 18
    .line 19
    new-instance p3, La/pnf;

    .line 20
    .line 21
    iget-object p0, p0, La/pnf;->m:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 24
    .line 25
    check-cast v1, La/xdr;

    .line 26
    .line 27
    invoke-direct {p3, p0, v1, p4}, La/pnf;-><init>(Lkotlin/jvm/functions/Function1;La/xdr;La/yje;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p3, La/pnf;->k:Ljava/lang/Object;

    .line 31
    .line 32
    iput-object p2, p3, La/pnf;->l:Ljava/lang/Object;

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    invoke-virtual {p3, p0}, La/pnf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/ats;

    .line 42
    .line 43
    check-cast p2, La/mrf;

    .line 44
    .line 45
    check-cast p3, La/kam0;

    .line 46
    .line 47
    check-cast p4, La/yje;

    .line 48
    .line 49
    new-instance p0, La/pnf;

    .line 50
    .line 51
    check-cast v1, La/rnf;

    .line 52
    .line 53
    invoke-direct {p0, v1, p4}, La/pnf;-><init>(La/rnf;La/yje;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, La/pnf;->l:Ljava/lang/Object;

    .line 57
    .line 58
    iput-object p2, p0, La/pnf;->m:Ljava/lang/Object;

    .line 59
    .line 60
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 61
    .line 62
    invoke-virtual {p0, p1}, La/pnf;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
