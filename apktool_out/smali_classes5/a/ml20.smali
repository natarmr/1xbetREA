.class public final La/ml20;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public i:La/wtb0;

.field public j:La/m97;

.field public k:La/pa20;

.field public l:J

.field public m:Z

.field public n:I

.field public o:B

.field public final synthetic p:La/nn20;


# direct methods
.method public constructor <init>(La/nn20;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ml20;->p:La/nn20;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 0

    .line 1
    new-instance p1, La/ml20;

    .line 2
    .line 3
    iget-object p0, p0, La/ml20;->p:La/nn20;

    .line 4
    .line 5
    invoke-direct {p1, p0, p2}, La/ml20;-><init>(La/nn20;La/yje;)V

    .line 6
    .line 7
    .line 8
    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La/vne;

    .line 2
    .line 3
    check-cast p2, La/yje;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, La/ml20;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/ml20;

    .line 10
    .line 11
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, La/ml20;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    .line 1
    move-object/from16 v5, p0

    .line 2
    .line 3
    iget-object v6, v5, La/ml20;->p:La/nn20;

    .line 4
    .line 5
    iget-object v0, v6, La/nn20;->z:La/pru;

    .line 6
    .line 7
    sget-object v10, La/wne;->a:La/wne;

    .line 8
    .line 9
    iget-byte v1, v5, La/ml20;->o:B

    .line 10
    .line 11
    sget-object v11, La/mb20;->a:La/mb20;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 19
    .line 20
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return-object v8

    .line 24
    :pswitch_0
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    move-object v0, v6

    .line 28
    goto/16 :goto_11

    .line 29
    .line 30
    :pswitch_1
    iget-object v0, v5, La/ml20;->k:La/pa20;

    .line 31
    .line 32
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_f

    .line 36
    .line 37
    :pswitch_2
    iget v0, v5, La/ml20;->n:I

    .line 38
    .line 39
    iget-boolean v1, v5, La/ml20;->m:Z

    .line 40
    .line 41
    iget-wide v2, v5, La/ml20;->l:J

    .line 42
    .line 43
    iget-object v4, v5, La/ml20;->j:La/m97;

    .line 44
    .line 45
    iget-object v7, v5, La/ml20;->i:La/wtb0;

    .line 46
    .line 47
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    move v9, v0

    .line 51
    move-object/from16 v0, p1

    .line 52
    .line 53
    goto/16 :goto_d

    .line 54
    .line 55
    :pswitch_3
    iget v1, v5, La/ml20;->n:I

    .line 56
    .line 57
    iget-boolean v4, v5, La/ml20;->m:Z

    .line 58
    .line 59
    iget-wide v12, v5, La/ml20;->l:J

    .line 60
    .line 61
    iget-object v7, v5, La/ml20;->i:La/wtb0;

    .line 62
    .line 63
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    move-object/from16 v8, p1

    .line 67
    .line 68
    move v9, v1

    .line 69
    move-wide v1, v12

    .line 70
    move v12, v4

    .line 71
    move-object v13, v7

    .line 72
    move v4, v3

    .line 73
    goto/16 :goto_8

    .line 74
    .line 75
    :pswitch_4
    iget-object v1, v5, La/ml20;->i:La/wtb0;

    .line 76
    .line 77
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    move-object/from16 v4, p1

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :pswitch_5
    iget-object v1, v5, La/ml20;->i:La/wtb0;

    .line 84
    .line 85
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    move-object/from16 v4, p1

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :pswitch_6
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    move-object/from16 v1, p1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :pswitch_7
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    iget-object v1, v6, La/nn20;->P:La/m1e;

    .line 101
    .line 102
    invoke-interface {v1}, La/m1e;->b()La/gmq;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    iput-byte v3, v5, La/ml20;->o:B

    .line 107
    .line 108
    invoke-static {v1, v5}, La/ntb;->K(La/gmq;La/yje;)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    if-ne v1, v10, :cond_0

    .line 113
    .line 114
    goto/16 :goto_10

    .line 115
    .line 116
    :cond_0
    :goto_0
    check-cast v1, Ljava/lang/Boolean;

    .line 117
    .line 118
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-nez v1, :cond_1

    .line 123
    .line 124
    sget v0, La/nn20;->c1:I

    .line 125
    .line 126
    invoke-virtual {v6}, La/nn20;->B0()V

    .line 127
    .line 128
    .line 129
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object v0

    .line 132
    :cond_1
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, La/b820;

    .line 137
    .line 138
    iget-object v1, v1, La/b820;->g:La/wtb0;

    .line 139
    .line 140
    if-eqz v1, :cond_16

    .line 141
    .line 142
    sget-object v4, La/fc20;->a:La/fc20;

    .line 143
    .line 144
    invoke-virtual {v6, v4}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object v4, v1, La/wtb0;->e:Ljava/lang/String;

    .line 148
    .line 149
    if-eqz v4, :cond_4

    .line 150
    .line 151
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v4

    .line 155
    if-nez v4, :cond_2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    iget-object v4, v6, La/nn20;->b0:La/nou;

    .line 159
    .line 160
    iput-object v1, v5, La/ml20;->i:La/wtb0;

    .line 161
    .line 162
    const/4 v7, 0x3

    .line 163
    iput-byte v7, v5, La/ml20;->o:B

    .line 164
    .line 165
    invoke-static {v4, v5}, La/nou;->b(La/nou;La/yje;)Ljava/io/Serializable;

    .line 166
    .line 167
    .line 168
    move-result-object v4

    .line 169
    if-ne v4, v10, :cond_3

    .line 170
    .line 171
    goto/16 :goto_10

    .line 172
    .line 173
    :cond_3
    :goto_1
    check-cast v4, La/ql5;

    .line 174
    .line 175
    goto :goto_4

    .line 176
    :cond_4
    :goto_2
    iget-object v4, v6, La/nn20;->s:La/khf0;

    .line 177
    .line 178
    sget-object v7, La/bm5;->b:La/bm5;

    .line 179
    .line 180
    iput-object v1, v5, La/ml20;->i:La/wtb0;

    .line 181
    .line 182
    const/4 v9, 0x2

    .line 183
    iput-byte v9, v5, La/ml20;->o:B

    .line 184
    .line 185
    invoke-static {v4, v7, v5}, La/khf0;->G(La/khf0;La/bm5;La/yje;)Ljava/io/Serializable;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    if-ne v4, v10, :cond_5

    .line 190
    .line 191
    goto/16 :goto_10

    .line 192
    .line 193
    :cond_5
    :goto_3
    check-cast v4, La/ql5;

    .line 194
    .line 195
    :goto_4
    iget-wide v12, v4, La/ql5;->a:J

    .line 196
    .line 197
    iget-wide v14, v1, La/wtb0;->a:D

    .line 198
    .line 199
    iget-wide v8, v4, La/ql5;->b:D

    .line 200
    .line 201
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    check-cast v4, La/b820;

    .line 206
    .line 207
    iget-object v4, v4, La/b820;->c:La/an5;

    .line 208
    .line 209
    iget-object v4, v4, La/an5;->d:La/g40;

    .line 210
    .line 211
    iget-wide v2, v4, La/g40;->a:D

    .line 212
    .line 213
    cmpl-double v4, v14, v8

    .line 214
    .line 215
    if-lez v4, :cond_6

    .line 216
    .line 217
    const-wide/16 v18, 0x0

    .line 218
    .line 219
    cmpl-double v4, v2, v18

    .line 220
    .line 221
    if-lez v4, :cond_6

    .line 222
    .line 223
    add-double/2addr v2, v8

    .line 224
    cmpl-double v2, v2, v14

    .line 225
    .line 226
    if-ltz v2, :cond_6

    .line 227
    .line 228
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    iget-object v2, v2, La/sff0;->a:La/gx7;

    .line 233
    .line 234
    iget-object v2, v2, La/gx7;->a:La/gm7;

    .line 235
    .line 236
    iget-boolean v2, v2, La/gm7;->b:Z

    .line 237
    .line 238
    if-eqz v2, :cond_6

    .line 239
    .line 240
    const/4 v2, 0x1

    .line 241
    goto :goto_5

    .line 242
    :cond_6
    const/4 v2, 0x0

    .line 243
    :goto_5
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    move-result-object v3

    .line 247
    check-cast v3, La/b820;

    .line 248
    .line 249
    iget-object v3, v3, La/b820;->g:La/wtb0;

    .line 250
    .line 251
    if-eqz v3, :cond_8

    .line 252
    .line 253
    iget-boolean v3, v3, La/wtb0;->d:Z

    .line 254
    .line 255
    const/4 v4, 0x1

    .line 256
    if-ne v3, v4, :cond_7

    .line 257
    .line 258
    move v3, v4

    .line 259
    goto :goto_7

    .line 260
    :cond_7
    :goto_6
    const/4 v3, 0x0

    .line 261
    goto :goto_7

    .line 262
    :cond_8
    const/4 v4, 0x1

    .line 263
    goto :goto_6

    .line 264
    :goto_7
    if-eqz v2, :cond_9

    .line 265
    .line 266
    if-nez v3, :cond_9

    .line 267
    .line 268
    invoke-virtual {v6, v11}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    sget-object v0, La/uc20;->a:La/uc20;

    .line 272
    .line 273
    invoke-virtual {v6, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object v0

    .line 279
    :cond_9
    iget-object v8, v6, La/nn20;->v:La/f3c;

    .line 280
    .line 281
    iput-object v1, v5, La/ml20;->i:La/wtb0;

    .line 282
    .line 283
    iput-wide v12, v5, La/ml20;->l:J

    .line 284
    .line 285
    iput-boolean v2, v5, La/ml20;->m:Z

    .line 286
    .line 287
    iput v3, v5, La/ml20;->n:I

    .line 288
    .line 289
    const/4 v9, 0x4

    .line 290
    iput-byte v9, v5, La/ml20;->o:B

    .line 291
    .line 292
    invoke-virtual {v8, v5}, La/f3c;->a(La/yje;)Ljava/lang/Object;

    .line 293
    .line 294
    .line 295
    move-result-object v8

    .line 296
    if-ne v8, v10, :cond_a

    .line 297
    .line 298
    goto/16 :goto_10

    .line 299
    .line 300
    :cond_a
    move v9, v3

    .line 301
    move-wide/from16 v30, v12

    .line 302
    .line 303
    move-object v13, v1

    .line 304
    move v12, v2

    .line 305
    move-wide/from16 v1, v30

    .line 306
    .line 307
    :goto_8
    check-cast v8, La/m97;

    .line 308
    .line 309
    iget-wide v14, v13, La/wtb0;->a:D

    .line 310
    .line 311
    if-eqz v9, :cond_b

    .line 312
    .line 313
    move/from16 v23, v4

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_b
    const/16 v23, 0x0

    .line 317
    .line 318
    :goto_9
    iget-boolean v3, v13, La/wtb0;->c:Z

    .line 319
    .line 320
    iget-object v4, v13, La/wtb0;->e:Ljava/lang/String;

    .line 321
    .line 322
    iget-object v7, v13, La/wtb0;->f:La/ex4;

    .line 323
    .line 324
    iput-object v13, v5, La/ml20;->i:La/wtb0;

    .line 325
    .line 326
    iput-object v8, v5, La/ml20;->j:La/m97;

    .line 327
    .line 328
    iput-wide v1, v5, La/ml20;->l:J

    .line 329
    .line 330
    iput-boolean v12, v5, La/ml20;->m:Z

    .line 331
    .line 332
    iput v9, v5, La/ml20;->n:I

    .line 333
    .line 334
    move-object/from16 v29, v0

    .line 335
    .line 336
    const/4 v0, 0x5

    .line 337
    iput-byte v0, v5, La/ml20;->o:B

    .line 338
    .line 339
    sget v0, La/nn20;->c1:I

    .line 340
    .line 341
    if-eqz v7, :cond_c

    .line 342
    .line 343
    const/16 p1, 0x1

    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_c
    const/16 p1, 0x0

    .line 347
    .line 348
    :goto_a
    iget-object v0, v6, La/nn20;->r:La/nhf0;

    .line 349
    .line 350
    if-eqz v4, :cond_d

    .line 351
    .line 352
    invoke-static {v4}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 353
    .line 354
    .line 355
    move-result-object v4

    .line 356
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 357
    .line 358
    .line 359
    move-result-object v4

    .line 360
    move-object/from16 v24, v4

    .line 361
    .line 362
    goto :goto_b

    .line 363
    :cond_d
    const/16 v24, 0x0

    .line 364
    .line 365
    :goto_b
    iget-object v4, v6, La/nn20;->p:La/ms2;

    .line 366
    .line 367
    invoke-static {v4}, La/phu0;->Y(La/ms2;)La/gwe;

    .line 368
    .line 369
    .line 370
    move-result-object v4

    .line 371
    iget-byte v4, v4, La/gwe;->a:B

    .line 372
    .line 373
    invoke-static {v8, v4}, La/xia0;->d0(La/m97;I)La/ru6;

    .line 374
    .line 375
    .line 376
    move-result-object v26

    .line 377
    invoke-virtual {v6}, La/i3t0;->D()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    check-cast v4, La/b820;

    .line 382
    .line 383
    iget-object v4, v4, La/b820;->d:La/rvj0;

    .line 384
    .line 385
    iget-object v4, v4, La/rvj0;->a:La/dx6;

    .line 386
    .line 387
    iget-object v4, v4, La/dx6;->b:La/vw6;

    .line 388
    .line 389
    move-object/from16 v17, v0

    .line 390
    .line 391
    move-wide/from16 v18, v1

    .line 392
    .line 393
    iget-wide v0, v4, La/vw6;->e:D

    .line 394
    .line 395
    move-wide/from16 v27, v0

    .line 396
    .line 397
    move/from16 v22, v3

    .line 398
    .line 399
    move-object/from16 v25, v7

    .line 400
    .line 401
    move-wide/from16 v20, v14

    .line 402
    .line 403
    invoke-virtual/range {v17 .. v28}, La/nhf0;->u(JDZZLjava/lang/String;La/ex4;La/ru6;D)La/ouj0;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    if-eqz p1, :cond_e

    .line 408
    .line 409
    iget-object v0, v6, La/nn20;->s0:La/g320;

    .line 410
    .line 411
    invoke-virtual {v0, v1, v5}, La/g320;->a(La/ouj0;La/zje;)Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v0

    .line 415
    goto :goto_c

    .line 416
    :cond_e
    iget-object v0, v6, La/nn20;->q:La/g320;

    .line 417
    .line 418
    invoke-virtual/range {v29 .. v29}, La/pru;->a()La/sff0;

    .line 419
    .line 420
    .line 421
    move-result-object v2

    .line 422
    iget-object v2, v2, La/sff0;->I1:La/oxk0;

    .line 423
    .line 424
    iget-byte v4, v2, La/oxk0;->a:B

    .line 425
    .line 426
    const-wide/16 v2, 0x0

    .line 427
    .line 428
    invoke-virtual/range {v0 .. v5}, La/g320;->b(La/ouj0;JILa/yje;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    :goto_c
    if-ne v0, v10, :cond_f

    .line 433
    .line 434
    goto/16 :goto_10

    .line 435
    .line 436
    :cond_f
    move-object v4, v8

    .line 437
    move v1, v12

    .line 438
    move-object v7, v13

    .line 439
    move-wide/from16 v2, v18

    .line 440
    .line 441
    :goto_d
    move-object v8, v0

    .line 442
    check-cast v8, La/pa20;

    .line 443
    .line 444
    if-eqz v8, :cond_15

    .line 445
    .line 446
    instance-of v0, v8, La/na20;

    .line 447
    .line 448
    if-eqz v0, :cond_12

    .line 449
    .line 450
    iget-boolean v7, v7, La/wtb0;->b:Z

    .line 451
    .line 452
    iget-wide v11, v4, La/m97;->i:J

    .line 453
    .line 454
    move-object v0, v8

    .line 455
    check-cast v0, La/na20;

    .line 456
    .line 457
    iget-object v0, v0, La/na20;->b:La/i2o;

    .line 458
    .line 459
    iget-wide v13, v4, La/m97;->f:J

    .line 460
    .line 461
    const/4 v4, 0x0

    .line 462
    iput-object v4, v5, La/ml20;->i:La/wtb0;

    .line 463
    .line 464
    iput-object v4, v5, La/ml20;->j:La/m97;

    .line 465
    .line 466
    iput-object v8, v5, La/ml20;->k:La/pa20;

    .line 467
    .line 468
    iput-wide v2, v5, La/ml20;->l:J

    .line 469
    .line 470
    iput-boolean v1, v5, La/ml20;->m:Z

    .line 471
    .line 472
    iput v9, v5, La/ml20;->n:I

    .line 473
    .line 474
    const/4 v1, 0x6

    .line 475
    iput-byte v1, v5, La/ml20;->o:B

    .line 476
    .line 477
    sget v1, La/nn20;->c1:I

    .line 478
    .line 479
    iget-object v1, v6, La/nn20;->M:La/x20;

    .line 480
    .line 481
    invoke-virtual {v0}, La/i2o;->getErrorCode()I

    .line 482
    .line 483
    .line 484
    move-result v2

    .line 485
    invoke-virtual {v1, v2}, La/x20;->p(I)V

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0}, La/i2o;->getErrorCode()I

    .line 489
    .line 490
    .line 491
    move-result v1

    .line 492
    move-object v0, v6

    .line 493
    move-wide v2, v11

    .line 494
    move-object v6, v5

    .line 495
    move-wide v4, v13

    .line 496
    invoke-virtual/range {v0 .. v7}, La/nn20;->u0(IJJLa/zje;Z)Ljava/lang/Object;

    .line 497
    .line 498
    .line 499
    move-result-object v0

    .line 500
    if-ne v0, v10, :cond_10

    .line 501
    .line 502
    goto :goto_e

    .line 503
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 504
    .line 505
    :goto_e
    if-ne v0, v10, :cond_11

    .line 506
    .line 507
    goto :goto_10

    .line 508
    :cond_11
    move-object v0, v8

    .line 509
    :goto_f
    new-instance v1, La/zhi0;

    .line 510
    .line 511
    check-cast v0, La/na20;

    .line 512
    .line 513
    iget-object v2, v0, La/na20;->c:Ljava/lang/String;

    .line 514
    .line 515
    iget-object v0, v0, La/na20;->b:La/i2o;

    .line 516
    .line 517
    const/16 v3, 0xc

    .line 518
    .line 519
    const/4 v5, 0x0

    .line 520
    invoke-direct {v1, v2, v0, v5, v3}, La/zhi0;-><init>(Ljava/lang/String;La/kuw;Ljava/lang/Integer;I)V

    .line 521
    .line 522
    .line 523
    throw v1

    .line 524
    :cond_12
    move-object v0, v6

    .line 525
    move-object v6, v5

    .line 526
    const/4 v5, 0x0

    .line 527
    instance-of v12, v8, La/oa20;

    .line 528
    .line 529
    if-eqz v12, :cond_15

    .line 530
    .line 531
    check-cast v8, La/oa20;

    .line 532
    .line 533
    iget-wide v12, v4, La/m97;->i:J

    .line 534
    .line 535
    iget-boolean v7, v7, La/wtb0;->b:Z

    .line 536
    .line 537
    iget-wide v14, v4, La/m97;->f:J

    .line 538
    .line 539
    iput-object v5, v6, La/ml20;->i:La/wtb0;

    .line 540
    .line 541
    iput-object v5, v6, La/ml20;->j:La/m97;

    .line 542
    .line 543
    iput-object v5, v6, La/ml20;->k:La/pa20;

    .line 544
    .line 545
    iput-wide v2, v6, La/ml20;->l:J

    .line 546
    .line 547
    iput-boolean v1, v6, La/ml20;->m:Z

    .line 548
    .line 549
    iput v9, v6, La/ml20;->n:I

    .line 550
    .line 551
    const/4 v1, 0x7

    .line 552
    iput-byte v1, v6, La/ml20;->o:B

    .line 553
    .line 554
    sget v1, La/nn20;->c1:I

    .line 555
    .line 556
    move-object v9, v6

    .line 557
    move v6, v7

    .line 558
    move-object v1, v8

    .line 559
    move-wide v4, v12

    .line 560
    move-wide v7, v14

    .line 561
    invoke-virtual/range {v0 .. v9}, La/nn20;->n0(La/oa20;JJZJLa/zje;)Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    if-ne v1, v10, :cond_13

    .line 566
    .line 567
    :goto_10
    return-object v10

    .line 568
    :cond_13
    :goto_11
    sget v1, La/nn20;->c1:I

    .line 569
    .line 570
    invoke-virtual {v0, v11}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 571
    .line 572
    .line 573
    iget-object v1, v0, La/i3t0;->i:La/ocj;

    .line 574
    .line 575
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 576
    .line 577
    :cond_14
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v2

    .line 581
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    iget-object v3, v0, La/i3t0;->f:La/oyg0;

    .line 585
    .line 586
    move-object v4, v2

    .line 587
    check-cast v4, La/b820;

    .line 588
    .line 589
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    const/16 v16, 0x0

    .line 593
    .line 594
    const/16 v17, 0x1fbf

    .line 595
    .line 596
    const/4 v5, 0x0

    .line 597
    const/4 v6, 0x0

    .line 598
    const/4 v7, 0x0

    .line 599
    const/4 v8, 0x0

    .line 600
    const/4 v9, 0x0

    .line 601
    const/4 v10, 0x0

    .line 602
    const/4 v11, 0x0

    .line 603
    const/4 v12, 0x0

    .line 604
    const/4 v13, 0x0

    .line 605
    const/4 v14, 0x0

    .line 606
    const/4 v15, 0x0

    .line 607
    invoke-static/range {v4 .. v17}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 608
    .line 609
    .line 610
    move-result-object v3

    .line 611
    invoke-virtual {v1, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 612
    .line 613
    .line 614
    move-result v2

    .line 615
    if-eqz v2, :cond_14

    .line 616
    .line 617
    goto :goto_12

    .line 618
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 619
    .line 620
    .line 621
    const/16 v16, 0x0

    .line 622
    .line 623
    return-object v16

    .line 624
    :cond_16
    :goto_12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 625
    .line 626
    return-object v0

    .line 627
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
