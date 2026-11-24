.class public final La/dt40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tj30;


# instance fields
.field public final synthetic a:La/l7m0;

.field public final synthetic b:La/ot40;

.field public final synthetic c:La/s3e;

.field public final synthetic d:La/s3e;

.field public final synthetic e:La/mms0;

.field public final synthetic f:La/agk0;

.field public final synthetic g:La/nie0;

.field public final synthetic h:La/lwf;


# direct methods
.method public constructor <init>(La/pz40;La/ot40;La/s3e;La/s3e;La/mms0;La/agk0;La/nie0;La/lwf;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/dt40;->a:La/l7m0;

    .line 5
    .line 6
    iput-object p2, p0, La/dt40;->b:La/ot40;

    .line 7
    .line 8
    iput-object p3, p0, La/dt40;->c:La/s3e;

    .line 9
    .line 10
    iput-object p4, p0, La/dt40;->d:La/s3e;

    .line 11
    .line 12
    iput-object p5, p0, La/dt40;->e:La/mms0;

    .line 13
    .line 14
    iput-object p6, p0, La/dt40;->f:La/agk0;

    .line 15
    .line 16
    iput-object p7, p0, La/dt40;->g:La/nie0;

    .line 17
    .line 18
    iput-object p8, p0, La/dt40;->h:La/lwf;

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-wide/from16 v2, p3

    .line 6
    .line 7
    new-instance v4, Ljava/util/LinkedHashMap;

    .line 8
    .line 9
    invoke-direct {v4}, Ljava/util/LinkedHashMap;-><init>()V

    .line 10
    .line 11
    .line 12
    iget-object v5, v0, La/dt40;->a:La/l7m0;

    .line 13
    .line 14
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    invoke-interface/range {p1 .. p1}, La/cnx;->getLayoutDirection()La/k6z;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    iget-object v6, v0, La/dt40;->f:La/agk0;

    .line 22
    .line 23
    invoke-virtual {v6}, La/agk0;->l()F

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    iget-object v7, v0, La/dt40;->g:La/nie0;

    .line 28
    .line 29
    iget-object v8, v7, La/nie0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v8, La/cmd;

    .line 32
    .line 33
    sget-object v9, La/cmd;->a:La/cmd;

    .line 34
    .line 35
    if-nez v8, :cond_0

    .line 36
    .line 37
    move-object v8, v9

    .line 38
    :cond_0
    iget-object v10, v0, La/dt40;->b:La/ot40;

    .line 39
    .line 40
    iget-object v11, v10, La/bk30;->d:Ljava/util/LinkedHashMap;

    .line 41
    .line 42
    iget-object v12, v10, La/bk30;->a:La/l4e;

    .line 43
    .line 44
    iput-object v4, v10, La/bk30;->b:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    iget-object v13, v10, La/bk30;->e:La/f7m0;

    .line 47
    .line 48
    iget-object v14, v10, La/ot40;->i:La/fms0;

    .line 49
    .line 50
    iget-object v15, v14, La/fms0;->b:Ljava/util/HashMap;

    .line 51
    .line 52
    invoke-virtual {v15}, Ljava/util/HashMap;->isEmpty()Z

    .line 53
    .line 54
    .line 55
    move-result v15

    .line 56
    move/from16 v16, v15

    .line 57
    .line 58
    const/16 v17, 0x1

    .line 59
    .line 60
    if-nez v16, :cond_1

    .line 61
    .line 62
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 63
    .line 64
    .line 65
    move-result v16

    .line 66
    if-eqz v16, :cond_2

    .line 67
    .line 68
    :cond_1
    move-object/from16 v18, v4

    .line 69
    .line 70
    move-object/from16 v19, v7

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    invoke-static {v2, v3}, La/p4e;->f(J)Z

    .line 74
    .line 75
    .line 76
    move-result v16

    .line 77
    if-eqz v16, :cond_3

    .line 78
    .line 79
    invoke-static {v2, v3}, La/p4e;->h(J)I

    .line 80
    .line 81
    .line 82
    move-result v15

    .line 83
    move-object/from16 v18, v4

    .line 84
    .line 85
    iget-object v4, v13, La/f7m0;->f:La/k3e;

    .line 86
    .line 87
    iget-object v4, v4, La/k3e;->e0:La/tmk;

    .line 88
    .line 89
    move-object/from16 v19, v7

    .line 90
    .line 91
    iget-object v7, v4, La/tmk;->g:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v7, Ljava/lang/String;

    .line 94
    .line 95
    if-nez v7, :cond_6

    .line 96
    .line 97
    iget v4, v4, La/tmk;->f:I

    .line 98
    .line 99
    if-ne v4, v15, :cond_6

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_3
    move-object/from16 v18, v4

    .line 103
    .line 104
    move-object/from16 v19, v7

    .line 105
    .line 106
    :goto_0
    invoke-static {v2, v3}, La/p4e;->g(J)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    iget-object v7, v13, La/f7m0;->f:La/k3e;

    .line 117
    .line 118
    iget-object v7, v7, La/k3e;->d0:La/tmk;

    .line 119
    .line 120
    iget-object v15, v7, La/tmk;->g:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v15, Ljava/lang/String;

    .line 123
    .line 124
    if-nez v15, :cond_6

    .line 125
    .line 126
    iget v7, v7, La/tmk;->f:I

    .line 127
    .line 128
    if-ne v7, v4, :cond_6

    .line 129
    .line 130
    :cond_4
    sget-object v4, La/cmd;->b:La/cmd;

    .line 131
    .line 132
    if-ne v8, v4, :cond_5

    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_5
    invoke-static {v13, v1}, La/jeb;->L(La/f7m0;Ljava/util/List;)V

    .line 136
    .line 137
    .line 138
    goto/16 :goto_5

    .line 139
    .line 140
    :cond_6
    :goto_1
    iget-object v4, v14, La/fms0;->b:Ljava/util/HashMap;

    .line 141
    .line 142
    invoke-virtual {v4}, Ljava/util/HashMap;->clear()V

    .line 143
    .line 144
    .line 145
    iget-object v4, v10, La/bk30;->b:Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 148
    .line 149
    .line 150
    iget-object v4, v10, La/bk30;->c:Ljava/util/LinkedHashMap;

    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 153
    .line 154
    .line 155
    iget-object v4, v10, La/bk30;->d:Ljava/util/LinkedHashMap;

    .line 156
    .line 157
    invoke-virtual {v4}, Ljava/util/LinkedHashMap;->clear()V

    .line 158
    .line 159
    .line 160
    invoke-static {v2, v3}, La/p4e;->g(J)Z

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    if-eqz v4, :cond_7

    .line 165
    .line 166
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 167
    .line 168
    .line 169
    move-result v4

    .line 170
    invoke-static {v4}, La/tmk;->e(I)La/tmk;

    .line 171
    .line 172
    .line 173
    move-result-object v4

    .line 174
    goto :goto_2

    .line 175
    :cond_7
    invoke-static {}, La/tmk;->h()La/tmk;

    .line 176
    .line 177
    .line 178
    move-result-object v4

    .line 179
    invoke-static {v2, v3}, La/p4e;->k(J)I

    .line 180
    .line 181
    .line 182
    move-result v7

    .line 183
    if-ltz v7, :cond_8

    .line 184
    .line 185
    iput v7, v4, La/tmk;->b:I

    .line 186
    .line 187
    :cond_8
    :goto_2
    iget-object v7, v13, La/f7m0;->f:La/k3e;

    .line 188
    .line 189
    iput-object v4, v7, La/k3e;->d0:La/tmk;

    .line 190
    .line 191
    invoke-static {v2, v3}, La/p4e;->f(J)Z

    .line 192
    .line 193
    .line 194
    move-result v4

    .line 195
    if-eqz v4, :cond_9

    .line 196
    .line 197
    invoke-static {v2, v3}, La/p4e;->h(J)I

    .line 198
    .line 199
    .line 200
    move-result v4

    .line 201
    invoke-static {v4}, La/tmk;->e(I)La/tmk;

    .line 202
    .line 203
    .line 204
    move-result-object v4

    .line 205
    goto :goto_3

    .line 206
    :cond_9
    invoke-static {}, La/tmk;->h()La/tmk;

    .line 207
    .line 208
    .line 209
    move-result-object v4

    .line 210
    invoke-static {v2, v3}, La/p4e;->j(J)I

    .line 211
    .line 212
    .line 213
    move-result v7

    .line 214
    if-ltz v7, :cond_a

    .line 215
    .line 216
    iput v7, v4, La/tmk;->b:I

    .line 217
    .line 218
    :cond_a
    :goto_3
    iget-object v7, v13, La/f7m0;->f:La/k3e;

    .line 219
    .line 220
    iput-object v4, v7, La/k3e;->e0:La/tmk;

    .line 221
    .line 222
    iput-wide v2, v13, La/f7m0;->l:J

    .line 223
    .line 224
    sget-object v4, La/k6z;->b:La/k6z;

    .line 225
    .line 226
    if-ne v5, v4, :cond_b

    .line 227
    .line 228
    move/from16 v4, v17

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_b
    const/4 v4, 0x0

    .line 232
    :goto_4
    xor-int/lit8 v4, v4, 0x1

    .line 233
    .line 234
    iput-boolean v4, v13, La/f7m0;->b:Z

    .line 235
    .line 236
    iget-object v4, v0, La/dt40;->c:La/s3e;

    .line 237
    .line 238
    invoke-virtual {v10, v4, v1, v2, v3}, La/ot40;->h(La/s3e;Ljava/util/List;J)V

    .line 239
    .line 240
    .line 241
    const/4 v4, 0x0

    .line 242
    invoke-virtual {v14, v12, v4}, La/fms0;->f(La/l4e;I)V

    .line 243
    .line 244
    .line 245
    iget-object v4, v0, La/dt40;->d:La/s3e;

    .line 246
    .line 247
    invoke-virtual {v10, v4, v1, v2, v3}, La/ot40;->h(La/s3e;Ljava/util/List;J)V

    .line 248
    .line 249
    .line 250
    move/from16 v4, v17

    .line 251
    .line 252
    invoke-virtual {v14, v12, v4}, La/fms0;->f(La/l4e;I)V

    .line 253
    .line 254
    .line 255
    iget-object v0, v0, La/dt40;->e:La/mms0;

    .line 256
    .line 257
    if-eqz v0, :cond_c

    .line 258
    .line 259
    :try_start_0
    iget-object v0, v0, La/mms0;->a:La/bh9;

    .line 260
    .line 261
    invoke-static {v0, v14}, La/xsm0;->r(La/bh9;La/fms0;)V
    :try_end_0
    .catch La/ch9; {:try_start_0 .. :try_end_0} :catch_0

    .line 262
    .line 263
    .line 264
    goto :goto_5

    .line 265
    :catch_0
    move-exception v0

    .line 266
    new-instance v4, Ljava/lang/StringBuilder;

    .line 267
    .line 268
    const-string v5, "Error parsing JSON "

    .line 269
    .line 270
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 277
    .line 278
    .line 279
    move-result-object v0

    .line 280
    const-string v4, "CML"

    .line 281
    .line 282
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 283
    .line 284
    .line 285
    :cond_c
    :goto_5
    invoke-virtual {v12}, La/k4e;->s()I

    .line 286
    .line 287
    .line 288
    move-result v0

    .line 289
    invoke-virtual {v12}, La/k4e;->m()I

    .line 290
    .line 291
    .line 292
    move-result v4

    .line 293
    invoke-virtual {v14, v0, v6, v4}, La/fms0;->b(IFI)V

    .line 294
    .line 295
    .line 296
    iget v0, v14, La/fms0;->l:I

    .line 297
    .line 298
    invoke-virtual {v12, v0}, La/k4e;->T(I)V

    .line 299
    .line 300
    .line 301
    iget v0, v14, La/fms0;->m:I

    .line 302
    .line 303
    invoke-virtual {v12, v0}, La/k4e;->O(I)V

    .line 304
    .line 305
    .line 306
    iget-object v0, v12, La/l4e;->u0:Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 309
    .line 310
    .line 311
    move-result v4

    .line 312
    const/4 v5, 0x0

    .line 313
    :goto_6
    if-ge v5, v4, :cond_13

    .line 314
    .line 315
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v6

    .line 319
    check-cast v6, La/k4e;

    .line 320
    .line 321
    iget-object v7, v6, La/k4e;->h0:Ljava/lang/Object;

    .line 322
    .line 323
    instance-of v8, v7, La/pj30;

    .line 324
    .line 325
    if-eqz v8, :cond_d

    .line 326
    .line 327
    check-cast v7, La/pj30;

    .line 328
    .line 329
    goto :goto_7

    .line 330
    :cond_d
    const/4 v7, 0x0

    .line 331
    :goto_7
    if-nez v7, :cond_e

    .line 332
    .line 333
    :goto_8
    move-object/from16 p0, v0

    .line 334
    .line 335
    move v0, v4

    .line 336
    move/from16 v16, v5

    .line 337
    .line 338
    goto :goto_b

    .line 339
    :cond_e
    iget-object v6, v6, La/k4e;->k:Ljava/lang/String;

    .line 340
    .line 341
    const/4 v8, 0x2

    .line 342
    invoke-virtual {v14, v8, v6}, La/fms0;->a(ILjava/lang/String;)La/ems0;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    iget-object v6, v6, La/ems0;->c:La/vdv0;

    .line 347
    .line 348
    if-nez v6, :cond_f

    .line 349
    .line 350
    goto :goto_8

    .line 351
    :cond_f
    iget-object v8, v10, La/bk30;->b:Ljava/util/LinkedHashMap;

    .line 352
    .line 353
    iget v13, v6, La/vdv0;->d:I

    .line 354
    .line 355
    iget v15, v6, La/vdv0;->b:I

    .line 356
    .line 357
    sub-int/2addr v13, v15

    .line 358
    const/4 v15, 0x0

    .line 359
    invoke-static {v15, v13}, Ljava/lang/Math;->max(II)I

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    iget v15, v6, La/vdv0;->e:I

    .line 364
    .line 365
    move-object/from16 p0, v0

    .line 366
    .line 367
    iget v0, v6, La/vdv0;->c:I

    .line 368
    .line 369
    sub-int/2addr v15, v0

    .line 370
    move v0, v4

    .line 371
    const/4 v4, 0x0

    .line 372
    invoke-static {v4, v15}, Ljava/lang/Math;->max(II)I

    .line 373
    .line 374
    .line 375
    move-result v15

    .line 376
    if-ltz v13, :cond_10

    .line 377
    .line 378
    const/16 v16, 0x1

    .line 379
    .line 380
    goto :goto_9

    .line 381
    :cond_10
    move/from16 v16, v4

    .line 382
    .line 383
    :goto_9
    if-ltz v15, :cond_11

    .line 384
    .line 385
    const/16 v20, 0x1

    .line 386
    .line 387
    goto :goto_a

    .line 388
    :cond_11
    move/from16 v20, v4

    .line 389
    .line 390
    :goto_a
    and-int v16, v16, v20

    .line 391
    .line 392
    if-nez v16, :cond_12

    .line 393
    .line 394
    const-string v16, "width and height must be >= 0"

    .line 395
    .line 396
    invoke-static/range {v16 .. v16}, La/zcx;->a(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    :cond_12
    move/from16 v16, v5

    .line 400
    .line 401
    invoke-static {v13, v13, v15, v15}, La/r4e;->h(IIII)J

    .line 402
    .line 403
    .line 404
    move-result-wide v4

    .line 405
    invoke-interface {v7, v4, v5}, La/pj30;->S(J)La/pu90;

    .line 406
    .line 407
    .line 408
    move-result-object v4

    .line 409
    invoke-interface {v8, v7, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    invoke-static {v7}, La/h8x;->I(La/pj30;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v4

    .line 416
    invoke-interface {v11, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    .line 418
    .line 419
    :goto_b
    add-int/lit8 v5, v16, 0x1

    .line 420
    .line 421
    move v4, v0

    .line 422
    move-object/from16 v0, p0

    .line 423
    .line 424
    goto :goto_6

    .line 425
    :cond_13
    new-instance v0, La/p4e;

    .line 426
    .line 427
    invoke-direct {v0, v2, v3}, La/p4e;-><init>(J)V

    .line 428
    .line 429
    .line 430
    iput-object v0, v10, La/ot40;->j:La/p4e;

    .line 431
    .line 432
    invoke-virtual {v12}, La/k4e;->s()I

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    invoke-virtual {v12}, La/k4e;->m()I

    .line 437
    .line 438
    .line 439
    move-result v2

    .line 440
    invoke-static {v0, v2}, La/n2x;->b(II)J

    .line 441
    .line 442
    .line 443
    move-result-wide v2

    .line 444
    move-object/from16 v4, v19

    .line 445
    .line 446
    iput-object v9, v4, La/nie0;->a:Ljava/lang/Object;

    .line 447
    .line 448
    const/16 v0, 0x20

    .line 449
    .line 450
    shr-long v4, v2, v0

    .line 451
    .line 452
    long-to-int v0, v4

    .line 453
    const-wide v4, 0xffffffffL

    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    and-long/2addr v2, v4

    .line 459
    long-to-int v2, v2

    .line 460
    new-instance v3, La/v43;

    .line 461
    .line 462
    move-object/from16 v4, v18

    .line 463
    .line 464
    const/4 v5, 0x1

    .line 465
    invoke-direct {v3, v10, v1, v4, v5}, La/v43;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 466
    .line 467
    .line 468
    move-object/from16 v1, p1

    .line 469
    .line 470
    invoke-static {v1, v0, v2, v3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 471
    .line 472
    .line 473
    move-result-object v0

    .line 474
    return-object v0
.end method
