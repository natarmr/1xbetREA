.class public final La/l7h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/v6t0;


# instance fields
.field public final synthetic a:B

.field public final b:La/ctf0;

.field public final c:Z

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ctf0;La/y78;Z)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/l7h;->a:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    iput-object p1, p0, La/l7h;->b:La/ctf0;

    .line 22
    iput-object p2, p0, La/l7h;->d:Ljava/lang/Object;

    .line 23
    iput-boolean p3, p0, La/l7h;->c:Z

    return-void
.end method

.method public constructor <init>(La/ctf0;Ljava/lang/String;Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/l7h;->a:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, La/l7h;->d:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p1, p0, La/l7h;->b:La/ctf0;

    .line 16
    .line 17
    iput-boolean p3, p0, La/l7h;->c:Z

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 57

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/l7h;->a:B

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    const/4 v3, 0x3

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, v0, La/l7h;->d:Ljava/lang/Object;

    .line 9
    .line 10
    const/16 v6, 0xa

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    iget-object v8, v0, La/l7h;->b:La/ctf0;

    .line 14
    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    move-object/from16 v1, p1

    .line 19
    .line 20
    check-cast v1, La/ubh;

    .line 21
    .line 22
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    iget-object v10, v1, La/ubh;->a:Lorg/xplatform/cyber/game/core/betting/domain/model/RelatedParams;

    .line 26
    .line 27
    iget-object v11, v1, La/ubh;->c:La/tbh;

    .line 28
    .line 29
    sget-object v12, La/tbh;->a:La/tbh;

    .line 30
    .line 31
    if-eq v11, v12, :cond_15

    .line 32
    .line 33
    if-eqz v10, :cond_15

    .line 34
    .line 35
    new-instance v10, La/vbh;

    .line 36
    .line 37
    new-array v12, v7, [Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v13, v8, La/ctf0;->b:La/lsm0;

    .line 40
    .line 41
    invoke-static {v12, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v12

    .line 45
    const v14, 0x7f130e0a

    .line 46
    .line 47
    .line 48
    invoke-virtual {v13, v14, v12}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v12

    .line 52
    sget-object v13, La/tbh;->b:La/tbh;

    .line 53
    .line 54
    if-eq v11, v13, :cond_0

    .line 55
    .line 56
    iget-object v13, v1, La/ubh;->i:La/wcb;

    .line 57
    .line 58
    if-nez v13, :cond_1

    .line 59
    .line 60
    :cond_0
    move-object/from16 v31, v10

    .line 61
    .line 62
    const/16 v29, 0x0

    .line 63
    .line 64
    goto/16 :goto_b

    .line 65
    .line 66
    :cond_1
    iget-object v2, v1, La/ubh;->d:Ljava/util/List;

    .line 67
    .line 68
    iget-object v3, v1, La/ubh;->h:Ljava/util/List;

    .line 69
    .line 70
    iget-object v4, v1, La/ubh;->g:La/v5l0;

    .line 71
    .line 72
    iget-boolean v8, v1, La/ubh;->f:Z

    .line 73
    .line 74
    iget-boolean v1, v1, La/ubh;->e:Z

    .line 75
    .line 76
    new-instance v14, Ljava/util/ArrayList;

    .line 77
    .line 78
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 79
    .line 80
    .line 81
    move-result v15

    .line 82
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 90
    .line 91
    .line 92
    move-result v15

    .line 93
    if-eqz v15, :cond_d

    .line 94
    .line 95
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v15

    .line 99
    check-cast v15, La/d0t;

    .line 100
    .line 101
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 102
    .line 103
    .line 104
    move-result-object v16

    .line 105
    :goto_1
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->hasNext()Z

    .line 106
    .line 107
    .line 108
    move-result v17

    .line 109
    if-eqz v17, :cond_3

    .line 110
    .line 111
    invoke-interface/range {v16 .. v16}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v17

    .line 115
    const/16 v29, 0x0

    .line 116
    .line 117
    move-object/from16 v9, v17

    .line 118
    .line 119
    check-cast v9, La/lok0;

    .line 120
    .line 121
    iget v9, v9, La/lok0;->a:I

    .line 122
    .line 123
    iget v7, v15, La/d0t;->O:I

    .line 124
    .line 125
    if-ne v9, v7, :cond_2

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_2
    const/4 v7, 0x0

    .line 129
    goto :goto_1

    .line 130
    :cond_3
    const/16 v29, 0x0

    .line 131
    .line 132
    move-object/from16 v17, v29

    .line 133
    .line 134
    :goto_2
    move-object/from16 v7, v17

    .line 135
    .line 136
    check-cast v7, La/lok0;

    .line 137
    .line 138
    move-object/from16 v16, v5

    .line 139
    .line 140
    check-cast v16, La/y78;

    .line 141
    .line 142
    move-object/from16 p1, v7

    .line 143
    .line 144
    iget-wide v6, v15, La/d0t;->v:J

    .line 145
    .line 146
    move-object/from16 v31, v10

    .line 147
    .line 148
    iget-wide v9, v15, La/d0t;->u:J

    .line 149
    .line 150
    invoke-virtual {v13, v6, v7, v9, v10}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v19

    .line 154
    new-instance v6, Ljava/util/ArrayList;

    .line 155
    .line 156
    const/16 v9, 0xa

    .line 157
    .line 158
    invoke-static {v3, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 159
    .line 160
    .line 161
    move-result v7

    .line 162
    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 163
    .line 164
    .line 165
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result v10

    .line 173
    if-eqz v10, :cond_4

    .line 174
    .line 175
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v10

    .line 179
    check-cast v10, La/lok0;

    .line 180
    .line 181
    iget v10, v10, La/lok0;->a:I

    .line 182
    .line 183
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v10

    .line 187
    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_4
    move-object/from16 v7, p1

    .line 192
    .line 193
    if-eqz p1, :cond_5

    .line 194
    .line 195
    iget-boolean v10, v7, La/lok0;->n:Z

    .line 196
    .line 197
    move/from16 v22, v10

    .line 198
    .line 199
    goto :goto_4

    .line 200
    :cond_5
    const/16 v22, 0x0

    .line 201
    .line 202
    :goto_4
    if-eqz v7, :cond_6

    .line 203
    .line 204
    iget-boolean v10, v7, La/lok0;->p:Z

    .line 205
    .line 206
    move/from16 v23, v10

    .line 207
    .line 208
    goto :goto_5

    .line 209
    :cond_6
    const/16 v23, 0x0

    .line 210
    .line 211
    :goto_5
    iget-object v10, v15, La/d0t;->K:Ljava/util/List;

    .line 212
    .line 213
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 214
    .line 215
    .line 216
    move-result v10

    .line 217
    if-eqz v10, :cond_a

    .line 218
    .line 219
    iget-object v10, v15, La/d0t;->k:Ljava/util/List;

    .line 220
    .line 221
    if-eqz v10, :cond_7

    .line 222
    .line 223
    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    .line 224
    .line 225
    .line 226
    move-result v17

    .line 227
    if-eqz v17, :cond_7

    .line 228
    .line 229
    goto :goto_6

    .line 230
    :cond_7
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 231
    .line 232
    .line 233
    move-result-object v10

    .line 234
    :cond_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 235
    .line 236
    .line 237
    move-result v17

    .line 238
    if-eqz v17, :cond_9

    .line 239
    .line 240
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 241
    .line 242
    .line 243
    move-result-object v17

    .line 244
    move-object/from16 v9, v17

    .line 245
    .line 246
    check-cast v9, La/d0t;

    .line 247
    .line 248
    iget-object v9, v9, La/d0t;->K:Ljava/util/List;

    .line 249
    .line 250
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 251
    .line 252
    .line 253
    move-result v9

    .line 254
    if-nez v9, :cond_8

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :cond_9
    :goto_6
    sget-object v9, La/i5l0;->a:La/i5l0;

    .line 258
    .line 259
    :goto_7
    move-object/from16 v26, v9

    .line 260
    .line 261
    goto :goto_9

    .line 262
    :cond_a
    :goto_8
    sget-object v9, La/l5l0;->a:La/l5l0;

    .line 263
    .line 264
    goto :goto_7

    .line 265
    :goto_9
    if-eqz v7, :cond_b

    .line 266
    .line 267
    iget-object v7, v7, La/lok0;->u:Ljava/lang/String;

    .line 268
    .line 269
    goto :goto_a

    .line 270
    :cond_b
    move-object/from16 v7, v29

    .line 271
    .line 272
    :goto_a
    if-nez v7, :cond_c

    .line 273
    .line 274
    const-string v7, ""

    .line 275
    .line 276
    :cond_c
    move-object/from16 v27, v7

    .line 277
    .line 278
    iget-boolean v7, v0, La/l7h;->c:Z

    .line 279
    .line 280
    move-object v9, v14

    .line 281
    move-object v14, v15

    .line 282
    iget-object v15, v0, La/l7h;->b:La/ctf0;

    .line 283
    .line 284
    const/16 v20, 0x0

    .line 285
    .line 286
    const/16 v24, 0x0

    .line 287
    .line 288
    move/from16 v17, v1

    .line 289
    .line 290
    move-object/from16 v25, v4

    .line 291
    .line 292
    move-object/from16 v21, v6

    .line 293
    .line 294
    move/from16 v28, v7

    .line 295
    .line 296
    move/from16 v18, v8

    .line 297
    .line 298
    invoke-static/range {v14 .. v28}, La/wwb;->V(La/d0t;La/ctf0;La/y78;ZZLjava/lang/String;ZLjava/util/List;ZZZLa/v5l0;La/m5l0;Ljava/lang/String;Z)La/a2n;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v9, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 303
    .line 304
    .line 305
    move-object v14, v9

    .line 306
    move/from16 v1, v17

    .line 307
    .line 308
    move-object/from16 v10, v31

    .line 309
    .line 310
    const/16 v6, 0xa

    .line 311
    .line 312
    const/4 v7, 0x0

    .line 313
    goto/16 :goto_0

    .line 314
    .line 315
    :cond_d
    move-object/from16 v31, v10

    .line 316
    .line 317
    move-object v9, v14

    .line 318
    invoke-static {v9}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    goto :goto_f

    .line 323
    :goto_b
    invoke-virtual {v8}, La/ctf0;->j()Z

    .line 324
    .line 325
    .line 326
    move-result v5

    .line 327
    if-eqz v5, :cond_e

    .line 328
    .line 329
    const/16 v5, 0xc

    .line 330
    .line 331
    goto :goto_c

    .line 332
    :cond_e
    const/4 v5, 0x6

    .line 333
    :goto_c
    iget-object v1, v1, La/ubh;->g:La/v5l0;

    .line 334
    .line 335
    new-instance v6, Ljava/util/ArrayList;

    .line 336
    .line 337
    invoke-direct {v6, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 338
    .line 339
    .line 340
    const/4 v7, 0x0

    .line 341
    :goto_d
    if-ge v7, v5, :cond_14

    .line 342
    .line 343
    new-instance v8, La/x56;

    .line 344
    .line 345
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 346
    .line 347
    .line 348
    move-result v9

    .line 349
    if-eqz v9, :cond_13

    .line 350
    .line 351
    if-eq v9, v4, :cond_12

    .line 352
    .line 353
    const/4 v10, 0x2

    .line 354
    if-eq v9, v10, :cond_11

    .line 355
    .line 356
    if-eq v9, v3, :cond_10

    .line 357
    .line 358
    if-ne v9, v2, :cond_f

    .line 359
    .line 360
    sget-object v9, La/h0l0;->a:La/h0l0;

    .line 361
    .line 362
    goto :goto_e

    .line 363
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 364
    .line 365
    .line 366
    move-object/from16 v9, v29

    .line 367
    .line 368
    goto :goto_10

    .line 369
    :cond_10
    sget-object v9, La/i0l0;->a:La/i0l0;

    .line 370
    .line 371
    goto :goto_e

    .line 372
    :cond_11
    sget-object v9, La/j0l0;->a:La/j0l0;

    .line 373
    .line 374
    goto :goto_e

    .line 375
    :cond_12
    sget-object v9, La/k0l0;->a:La/k0l0;

    .line 376
    .line 377
    goto :goto_e

    .line 378
    :cond_13
    sget-object v9, La/g0l0;->a:La/g0l0;

    .line 379
    .line 380
    :goto_e
    invoke-direct {v8, v9}, La/x56;-><init>(La/l0l0;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    add-int/lit8 v7, v7, 0x1

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_14
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 390
    .line 391
    .line 392
    move-result-object v1

    .line 393
    :goto_f
    iget-boolean v0, v0, La/l7h;->c:Z

    .line 394
    .line 395
    move-object/from16 v2, v31

    .line 396
    .line 397
    invoke-direct {v2, v12, v11, v1, v0}, La/vbh;-><init>(Ljava/lang/String;La/tbh;La/a4x;Z)V

    .line 398
    .line 399
    .line 400
    move-object v9, v2

    .line 401
    goto :goto_10

    .line 402
    :cond_15
    sget-object v9, La/wbh;->a:La/wbh;

    .line 403
    .line 404
    :goto_10
    return-object v9

    .line 405
    :pswitch_0
    const/16 v29, 0x0

    .line 406
    .line 407
    move-object/from16 v1, p1

    .line 408
    .line 409
    check-cast v1, La/g7h;

    .line 410
    .line 411
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    .line 413
    .line 414
    iget-object v6, v1, La/g7h;->c:Ljava/util/List;

    .line 415
    .line 416
    invoke-virtual {v1}, La/g7h;->b()La/th90;

    .line 417
    .line 418
    .line 419
    move-result-object v7

    .line 420
    iget-object v9, v1, La/g7h;->f:La/th90;

    .line 421
    .line 422
    iget-wide v10, v1, La/g7h;->i:J

    .line 423
    .line 424
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 425
    .line 426
    .line 427
    move-result-object v12

    .line 428
    invoke-interface {v9, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v9

    .line 432
    check-cast v9, La/bi90;

    .line 433
    .line 434
    if-nez v9, :cond_16

    .line 435
    .line 436
    sget-object v9, La/bi90;->e:La/bi90;

    .line 437
    .line 438
    :cond_16
    move-object v12, v9

    .line 439
    check-cast v5, Ljava/lang/String;

    .line 440
    .line 441
    iget-object v13, v1, La/g7h;->h:Ljava/util/List;

    .line 442
    .line 443
    iget-wide v14, v1, La/g7h;->i:J

    .line 444
    .line 445
    invoke-virtual {v1}, La/g7h;->c()J

    .line 446
    .line 447
    .line 448
    move-result-wide v17

    .line 449
    iget-object v1, v1, La/g7h;->g:La/th90;

    .line 450
    .line 451
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 452
    .line 453
    .line 454
    move-result-object v9

    .line 455
    invoke-interface {v1, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 456
    .line 457
    .line 458
    move-result-object v1

    .line 459
    check-cast v1, La/th90;

    .line 460
    .line 461
    if-nez v1, :cond_17

    .line 462
    .line 463
    sget-object v1, La/uh90;->g:La/uh90;

    .line 464
    .line 465
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 466
    .line 467
    .line 468
    :cond_17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 472
    .line 473
    .line 474
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 475
    .line 476
    .line 477
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    .line 479
    .line 480
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 481
    .line 482
    .line 483
    new-instance v10, Ljava/util/ArrayList;

    .line 484
    .line 485
    const/16 v9, 0xa

    .line 486
    .line 487
    invoke-static {v6, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 488
    .line 489
    .line 490
    move-result v11

    .line 491
    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    .line 492
    .line 493
    .line 494
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v6

    .line 498
    :goto_11
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_42

    .line 503
    .line 504
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v11

    .line 508
    check-cast v11, La/xum0;

    .line 509
    .line 510
    move-object/from16 p1, v10

    .line 511
    .line 512
    iget-wide v9, v11, La/xum0;->b:J

    .line 513
    .line 514
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 515
    .line 516
    .line 517
    move-result-object v9

    .line 518
    invoke-interface {v7, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    move-result-object v9

    .line 522
    move-object v10, v9

    .line 523
    check-cast v10, La/dx7;

    .line 524
    .line 525
    move-object/from16 v19, v5

    .line 526
    .line 527
    iget-wide v4, v11, La/xum0;->b:J

    .line 528
    .line 529
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 530
    .line 531
    .line 532
    move-result-object v4

    .line 533
    iget-object v5, v12, La/bi90;->d:La/dh90;

    .line 534
    .line 535
    invoke-virtual {v5, v4}, La/dh90;->containsKey(Ljava/lang/Object;)Z

    .line 536
    .line 537
    .line 538
    move-result v4

    .line 539
    instance-of v5, v10, La/xw7;

    .line 540
    .line 541
    if-eqz v5, :cond_18

    .line 542
    .line 543
    move-object v5, v10

    .line 544
    check-cast v5, La/xw7;

    .line 545
    .line 546
    goto :goto_12

    .line 547
    :cond_18
    move-object/from16 v5, v29

    .line 548
    .line 549
    :goto_12
    if-eqz v5, :cond_19

    .line 550
    .line 551
    iget-object v5, v5, La/xw7;->a:Ljava/util/ArrayList;

    .line 552
    .line 553
    goto :goto_13

    .line 554
    :cond_19
    move-object/from16 v5, v29

    .line 555
    .line 556
    :goto_13
    if-nez v5, :cond_1a

    .line 557
    .line 558
    sget-object v5, La/iun;->a:La/iun;

    .line 559
    .line 560
    :cond_1a
    if-nez v4, :cond_1e

    .line 561
    .line 562
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 563
    .line 564
    .line 565
    move-result v4

    .line 566
    if-nez v4, :cond_1e

    .line 567
    .line 568
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 569
    .line 570
    .line 571
    move-result v4

    .line 572
    if-eqz v4, :cond_1b

    .line 573
    .line 574
    goto :goto_14

    .line 575
    :cond_1b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 576
    .line 577
    .line 578
    move-result-object v4

    .line 579
    :cond_1c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 580
    .line 581
    .line 582
    move-result v9

    .line 583
    if-eqz v9, :cond_1d

    .line 584
    .line 585
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 586
    .line 587
    .line 588
    move-result-object v9

    .line 589
    check-cast v9, La/xt20;

    .line 590
    .line 591
    iget-boolean v9, v9, La/xt20;->d:Z

    .line 592
    .line 593
    if-eqz v9, :cond_1c

    .line 594
    .line 595
    goto :goto_15

    .line 596
    :cond_1d
    :goto_14
    const/4 v4, 0x1

    .line 597
    goto :goto_16

    .line 598
    :cond_1e
    :goto_15
    const/4 v4, 0x0

    .line 599
    :goto_16
    new-instance v9, Ljava/util/ArrayList;

    .line 600
    .line 601
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 602
    .line 603
    .line 604
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 605
    .line 606
    .line 607
    move-result-object v5

    .line 608
    const/4 v2, 0x0

    .line 609
    :goto_17
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 610
    .line 611
    .line 612
    move-result v21

    .line 613
    if-eqz v21, :cond_36

    .line 614
    .line 615
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 616
    .line 617
    .line 618
    move-result-object v21

    .line 619
    add-int/lit8 v22, v2, 0x1

    .line 620
    .line 621
    if-ltz v2, :cond_35

    .line 622
    .line 623
    move-object/from16 v33, v21

    .line 624
    .line 625
    check-cast v33, La/xt20;

    .line 626
    .line 627
    if-eqz v4, :cond_1f

    .line 628
    .line 629
    if-ge v2, v3, :cond_1f

    .line 630
    .line 631
    const-wide/16 v38, 0x0

    .line 632
    .line 633
    const/16 v40, 0xf7

    .line 634
    .line 635
    const/16 v34, 0x0

    .line 636
    .line 637
    const/16 v35, 0x1

    .line 638
    .line 639
    const-wide/16 v36, 0x0

    .line 640
    .line 641
    invoke-static/range {v33 .. v40}, La/xt20;->a(La/xt20;Ljava/util/ArrayList;ZJDI)La/xt20;

    .line 642
    .line 643
    .line 644
    move-result-object v33

    .line 645
    :cond_1f
    move-object/from16 v2, v33

    .line 646
    .line 647
    iget-object v3, v2, La/xt20;->a:Ljava/util/List;

    .line 648
    .line 649
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 650
    .line 651
    .line 652
    move-result v23

    .line 653
    if-eqz v23, :cond_20

    .line 654
    .line 655
    sget-object v3, La/iun;->a:La/iun;

    .line 656
    .line 657
    invoke-static {v3}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 658
    .line 659
    .line 660
    move-result-object v3

    .line 661
    move/from16 v25, v4

    .line 662
    .line 663
    move-object/from16 v26, v5

    .line 664
    .line 665
    move-object/from16 v23, v6

    .line 666
    .line 667
    move-object/from16 v24, v7

    .line 668
    .line 669
    move-object v6, v9

    .line 670
    move-wide/from16 v54, v14

    .line 671
    .line 672
    goto/16 :goto_20

    .line 673
    .line 674
    :cond_20
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 675
    .line 676
    .line 677
    move-result-object v23

    .line 678
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 679
    .line 680
    .line 681
    move-result v24

    .line 682
    if-eqz v24, :cond_34

    .line 683
    .line 684
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 685
    .line 686
    .line 687
    move-result-object v24

    .line 688
    check-cast v24, Ljava/util/List;

    .line 689
    .line 690
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    .line 691
    .line 692
    .line 693
    move-result v24

    .line 694
    move/from16 v25, v4

    .line 695
    .line 696
    move/from16 v4, v24

    .line 697
    .line 698
    :goto_18
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->hasNext()Z

    .line 699
    .line 700
    .line 701
    move-result v24

    .line 702
    if-eqz v24, :cond_22

    .line 703
    .line 704
    invoke-interface/range {v23 .. v23}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    move-result-object v24

    .line 708
    check-cast v24, Ljava/util/List;

    .line 709
    .line 710
    move-object/from16 v26, v5

    .line 711
    .line 712
    invoke-interface/range {v24 .. v24}, Ljava/util/List;->size()I

    .line 713
    .line 714
    .line 715
    move-result v5

    .line 716
    if-ge v4, v5, :cond_21

    .line 717
    .line 718
    move v4, v5

    .line 719
    :cond_21
    move-object/from16 v5, v26

    .line 720
    .line 721
    goto :goto_18

    .line 722
    :cond_22
    move-object/from16 v26, v5

    .line 723
    .line 724
    const/4 v5, 0x0

    .line 725
    invoke-static {v5, v4}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 726
    .line 727
    .line 728
    move-result-object v4

    .line 729
    new-instance v5, Ljava/util/ArrayList;

    .line 730
    .line 731
    move-object/from16 v23, v6

    .line 732
    .line 733
    move-object/from16 v24, v7

    .line 734
    .line 735
    const/16 v6, 0xa

    .line 736
    .line 737
    invoke-static {v4, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 738
    .line 739
    .line 740
    move-result v7

    .line 741
    invoke-direct {v5, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 742
    .line 743
    .line 744
    invoke-virtual {v4}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v4

    .line 748
    :goto_19
    move-object v7, v4

    .line 749
    check-cast v7, La/kkx;

    .line 750
    .line 751
    iget-boolean v7, v7, La/kkx;->c:Z

    .line 752
    .line 753
    if-eqz v7, :cond_29

    .line 754
    .line 755
    move-object v7, v4

    .line 756
    check-cast v7, La/bkx;

    .line 757
    .line 758
    invoke-virtual {v7}, La/bkx;->nextInt()I

    .line 759
    .line 760
    .line 761
    move-result v7

    .line 762
    move-object/from16 v27, v4

    .line 763
    .line 764
    new-instance v4, Ljava/util/ArrayList;

    .line 765
    .line 766
    move-object/from16 v28, v9

    .line 767
    .line 768
    invoke-static {v3, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 769
    .line 770
    .line 771
    move-result v9

    .line 772
    move-object/from16 v6, v28

    .line 773
    .line 774
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 775
    .line 776
    .line 777
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 778
    .line 779
    .line 780
    move-result-object v9

    .line 781
    :goto_1a
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 782
    .line 783
    .line 784
    move-result v28

    .line 785
    if-eqz v28, :cond_28

    .line 786
    .line 787
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v28

    .line 791
    move-object/from16 v31, v3

    .line 792
    .line 793
    move-object/from16 v3, v28

    .line 794
    .line 795
    check-cast v3, Ljava/util/List;

    .line 796
    .line 797
    invoke-static {v7, v3}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v3

    .line 801
    check-cast v3, La/dao;

    .line 802
    .line 803
    move/from16 v28, v7

    .line 804
    .line 805
    if-eqz v3, :cond_27

    .line 806
    .line 807
    iget-boolean v7, v3, La/dao;->r:Z

    .line 808
    .line 809
    if-nez v7, :cond_23

    .line 810
    .line 811
    goto :goto_1b

    .line 812
    :cond_23
    move-object/from16 v3, v29

    .line 813
    .line 814
    :goto_1b
    if-eqz v3, :cond_27

    .line 815
    .line 816
    new-instance v33, La/chl0;

    .line 817
    .line 818
    iget-object v7, v3, La/dao;->l:Ljava/lang/String;

    .line 819
    .line 820
    move-object/from16 v41, v7

    .line 821
    .line 822
    iget-object v7, v3, La/dao;->j:Ljava/lang/String;

    .line 823
    .line 824
    move-object/from16 v49, v7

    .line 825
    .line 826
    iget-boolean v7, v3, La/dao;->h:Z

    .line 827
    .line 828
    if-eqz v7, :cond_24

    .line 829
    .line 830
    sget-object v7, La/k0d;->b:La/k0d;

    .line 831
    .line 832
    move-object/from16 v50, v9

    .line 833
    .line 834
    goto :goto_1c

    .line 835
    :cond_24
    iget-object v7, v3, La/dao;->n:La/cao;

    .line 836
    .line 837
    move-object/from16 v50, v9

    .line 838
    .line 839
    sget-object v9, La/cao;->b:La/cao;

    .line 840
    .line 841
    if-ne v7, v9, :cond_25

    .line 842
    .line 843
    sget-object v7, La/k0d;->c:La/k0d;

    .line 844
    .line 845
    goto :goto_1c

    .line 846
    :cond_25
    sget-object v9, La/cao;->c:La/cao;

    .line 847
    .line 848
    if-ne v7, v9, :cond_26

    .line 849
    .line 850
    sget-object v7, La/k0d;->d:La/k0d;

    .line 851
    .line 852
    goto :goto_1c

    .line 853
    :cond_26
    sget-object v7, La/k0d;->a:La/k0d;

    .line 854
    .line 855
    :goto_1c
    sget-object v9, La/a65;->a:La/a65;

    .line 856
    .line 857
    move-object/from16 v51, v7

    .line 858
    .line 859
    iget-boolean v7, v3, La/dao;->o:Z

    .line 860
    .line 861
    move/from16 v52, v7

    .line 862
    .line 863
    iget-boolean v7, v3, La/dao;->p:Z

    .line 864
    .line 865
    move/from16 v53, v7

    .line 866
    .line 867
    iget-boolean v7, v3, La/dao;->s:Z

    .line 868
    .line 869
    new-instance v34, La/xgl0;

    .line 870
    .line 871
    move-wide/from16 v54, v14

    .line 872
    .line 873
    iget-wide v14, v3, La/dao;->b:J

    .line 874
    .line 875
    move-wide/from16 v35, v14

    .line 876
    .line 877
    iget-wide v14, v3, La/dao;->f:D

    .line 878
    .line 879
    move-wide/from16 v37, v14

    .line 880
    .line 881
    iget-wide v14, v3, La/dao;->d:D

    .line 882
    .line 883
    move/from16 v56, v7

    .line 884
    .line 885
    iget v7, v3, La/dao;->a:I

    .line 886
    .line 887
    move-wide/from16 v39, v14

    .line 888
    .line 889
    iget-wide v14, v3, La/dao;->e:J

    .line 890
    .line 891
    move/from16 v42, v7

    .line 892
    .line 893
    iget-object v7, v3, La/dao;->q:La/uoy;

    .line 894
    .line 895
    iget-byte v7, v7, La/uoy;->a:B

    .line 896
    .line 897
    move-wide/from16 v43, v14

    .line 898
    .line 899
    iget-wide v14, v3, La/dao;->c:J

    .line 900
    .line 901
    const/16 v48, 0x0

    .line 902
    .line 903
    move/from16 v45, v7

    .line 904
    .line 905
    move-wide/from16 v46, v14

    .line 906
    .line 907
    invoke-direct/range {v34 .. v48}, La/xgl0;-><init>(JDDLjava/lang/String;IJIJZ)V

    .line 908
    .line 909
    .line 910
    const/4 v3, 0x0

    .line 911
    move-object/from16 v37, v9

    .line 912
    .line 913
    move-object/from16 v42, v34

    .line 914
    .line 915
    move-object/from16 v34, v41

    .line 916
    .line 917
    move-object/from16 v35, v49

    .line 918
    .line 919
    move-object/from16 v36, v51

    .line 920
    .line 921
    move/from16 v38, v52

    .line 922
    .line 923
    move/from16 v39, v53

    .line 924
    .line 925
    move/from16 v40, v56

    .line 926
    .line 927
    move/from16 v41, v3

    .line 928
    .line 929
    invoke-direct/range {v33 .. v42}, La/chl0;-><init>(Ljava/lang/String;Ljava/lang/String;La/k0d;La/a65;ZZZZLa/xgl0;)V

    .line 930
    .line 931
    .line 932
    move-object/from16 v3, v33

    .line 933
    .line 934
    goto :goto_1d

    .line 935
    :cond_27
    move-object/from16 v50, v9

    .line 936
    .line 937
    move-wide/from16 v54, v14

    .line 938
    .line 939
    move-object/from16 v3, v29

    .line 940
    .line 941
    :goto_1d
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 942
    .line 943
    .line 944
    move/from16 v7, v28

    .line 945
    .line 946
    move-object/from16 v3, v31

    .line 947
    .line 948
    move-object/from16 v9, v50

    .line 949
    .line 950
    move-wide/from16 v14, v54

    .line 951
    .line 952
    goto/16 :goto_1a

    .line 953
    .line 954
    :cond_28
    move-object/from16 v31, v3

    .line 955
    .line 956
    move-wide/from16 v54, v14

    .line 957
    .line 958
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 959
    .line 960
    .line 961
    move-object v9, v6

    .line 962
    move-object/from16 v4, v27

    .line 963
    .line 964
    const/16 v6, 0xa

    .line 965
    .line 966
    goto/16 :goto_19

    .line 967
    .line 968
    :cond_29
    move-object v6, v9

    .line 969
    move-wide/from16 v54, v14

    .line 970
    .line 971
    new-instance v3, Ljava/util/ArrayList;

    .line 972
    .line 973
    const/16 v9, 0xa

    .line 974
    .line 975
    invoke-static {v5, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 976
    .line 977
    .line 978
    move-result v4

    .line 979
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 980
    .line 981
    .line 982
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 983
    .line 984
    .line 985
    move-result-object v4

    .line 986
    :goto_1e
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 987
    .line 988
    .line 989
    move-result v5

    .line 990
    if-eqz v5, :cond_2a

    .line 991
    .line 992
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 993
    .line 994
    .line 995
    move-result-object v5

    .line 996
    check-cast v5, Ljava/util/List;

    .line 997
    .line 998
    new-instance v7, La/a4n;

    .line 999
    .line 1000
    invoke-static {v5}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1001
    .line 1002
    .line 1003
    move-result-object v5

    .line 1004
    new-instance v14, La/zgl0;

    .line 1005
    .line 1006
    invoke-direct {v14}, La/zgl0;-><init>()V

    .line 1007
    .line 1008
    .line 1009
    const/16 v15, 0xe

    .line 1010
    .line 1011
    invoke-direct {v7, v5, v14, v15}, La/a4n;-><init>(La/a4x;La/ahl0;I)V

    .line 1012
    .line 1013
    .line 1014
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1015
    .line 1016
    .line 1017
    goto :goto_1e

    .line 1018
    :cond_2a
    new-instance v4, Ljava/util/ArrayList;

    .line 1019
    .line 1020
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1021
    .line 1022
    .line 1023
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1024
    .line 1025
    .line 1026
    move-result-object v3

    .line 1027
    :cond_2b
    :goto_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1028
    .line 1029
    .line 1030
    move-result v5

    .line 1031
    if-eqz v5, :cond_2e

    .line 1032
    .line 1033
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1034
    .line 1035
    .line 1036
    move-result-object v5

    .line 1037
    move-object v7, v5

    .line 1038
    check-cast v7, La/a4n;

    .line 1039
    .line 1040
    iget-object v7, v7, La/a4n;->a:La/a4x;

    .line 1041
    .line 1042
    if-eqz v7, :cond_2c

    .line 1043
    .line 1044
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1045
    .line 1046
    .line 1047
    move-result v14

    .line 1048
    if-eqz v14, :cond_2c

    .line 1049
    .line 1050
    goto :goto_1f

    .line 1051
    :cond_2c
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v7

    .line 1055
    :cond_2d
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v14

    .line 1059
    if-eqz v14, :cond_2b

    .line 1060
    .line 1061
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v14

    .line 1065
    check-cast v14, La/ehl0;

    .line 1066
    .line 1067
    if-eqz v14, :cond_2d

    .line 1068
    .line 1069
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1070
    .line 1071
    .line 1072
    goto :goto_1f

    .line 1073
    :cond_2e
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v3

    .line 1077
    :goto_20
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 1078
    .line 1079
    .line 1080
    move-result v4

    .line 1081
    if-eqz v4, :cond_2f

    .line 1082
    .line 1083
    move-object/from16 v2, v29

    .line 1084
    .line 1085
    goto :goto_25

    .line 1086
    :cond_2f
    iget-wide v4, v2, La/xt20;->b:J

    .line 1087
    .line 1088
    const-wide/16 v14, 0x523

    .line 1089
    .line 1090
    cmp-long v7, v4, v14

    .line 1091
    .line 1092
    if-eqz v7, :cond_31

    .line 1093
    .line 1094
    const-wide/16 v14, 0x524

    .line 1095
    .line 1096
    cmp-long v7, v4, v14

    .line 1097
    .line 1098
    if-nez v7, :cond_30

    .line 1099
    .line 1100
    goto :goto_22

    .line 1101
    :cond_30
    new-instance v7, La/a7h;

    .line 1102
    .line 1103
    invoke-direct {v7, v3}, La/a7h;-><init>(La/a4x;)V

    .line 1104
    .line 1105
    .line 1106
    :goto_21
    move-object/from16 v39, v7

    .line 1107
    .line 1108
    goto :goto_23

    .line 1109
    :cond_31
    :goto_22
    new-instance v7, La/a7h;

    .line 1110
    .line 1111
    invoke-direct {v7, v3}, La/a7h;-><init>(La/a4x;)V

    .line 1112
    .line 1113
    .line 1114
    goto :goto_21

    .line 1115
    :goto_23
    iget-object v3, v2, La/xt20;->c:Ljava/lang/String;

    .line 1116
    .line 1117
    iget-boolean v7, v2, La/xt20;->d:Z

    .line 1118
    .line 1119
    iget-boolean v14, v2, La/xt20;->g:Z

    .line 1120
    .line 1121
    iget-boolean v15, v2, La/xt20;->h:Z

    .line 1122
    .line 1123
    iget-object v2, v2, La/xt20;->a:Ljava/util/List;

    .line 1124
    .line 1125
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v2

    .line 1129
    const/16 v38, 0x0

    .line 1130
    .line 1131
    :goto_24
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1132
    .line 1133
    .line 1134
    move-result v27

    .line 1135
    if-eqz v27, :cond_32

    .line 1136
    .line 1137
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v27

    .line 1141
    check-cast v27, Ljava/util/List;

    .line 1142
    .line 1143
    invoke-interface/range {v27 .. v27}, Ljava/util/List;->size()I

    .line 1144
    .line 1145
    .line 1146
    move-result v27

    .line 1147
    add-int v38, v27, v38

    .line 1148
    .line 1149
    goto :goto_24

    .line 1150
    :cond_32
    new-instance v31, La/b7h;

    .line 1151
    .line 1152
    iget-boolean v2, v0, La/l7h;->c:Z

    .line 1153
    .line 1154
    move/from16 v40, v2

    .line 1155
    .line 1156
    move-object/from16 v34, v3

    .line 1157
    .line 1158
    move-wide/from16 v32, v4

    .line 1159
    .line 1160
    move/from16 v35, v7

    .line 1161
    .line 1162
    move/from16 v36, v14

    .line 1163
    .line 1164
    move/from16 v37, v15

    .line 1165
    .line 1166
    invoke-direct/range {v31 .. v40}, La/b7h;-><init>(JLjava/lang/String;ZZZILa/a7h;Z)V

    .line 1167
    .line 1168
    .line 1169
    move-object/from16 v2, v31

    .line 1170
    .line 1171
    :goto_25
    if-eqz v2, :cond_33

    .line 1172
    .line 1173
    invoke-virtual {v6, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1174
    .line 1175
    .line 1176
    :cond_33
    move-object v9, v6

    .line 1177
    move/from16 v2, v22

    .line 1178
    .line 1179
    move-object/from16 v6, v23

    .line 1180
    .line 1181
    move-object/from16 v7, v24

    .line 1182
    .line 1183
    move/from16 v4, v25

    .line 1184
    .line 1185
    move-object/from16 v5, v26

    .line 1186
    .line 1187
    move-wide/from16 v14, v54

    .line 1188
    .line 1189
    const/4 v3, 0x3

    .line 1190
    goto/16 :goto_17

    .line 1191
    .line 1192
    :cond_34
    invoke-static {}, La/itt0;->a()V

    .line 1193
    .line 1194
    .line 1195
    :goto_26
    move-object/from16 v9, v29

    .line 1196
    .line 1197
    goto/16 :goto_43

    .line 1198
    .line 1199
    :cond_35
    invoke-static {}, La/q3d;->p()V

    .line 1200
    .line 1201
    .line 1202
    throw v29

    .line 1203
    :cond_36
    move-object/from16 v23, v6

    .line 1204
    .line 1205
    move-object/from16 v24, v7

    .line 1206
    .line 1207
    move-object v6, v9

    .line 1208
    move-wide/from16 v54, v14

    .line 1209
    .line 1210
    invoke-static {v6}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v40

    .line 1214
    const-wide/16 v2, 0x0

    .line 1215
    .line 1216
    if-nez v10, :cond_37

    .line 1217
    .line 1218
    goto :goto_28

    .line 1219
    :cond_37
    instance-of v4, v10, La/xw7;

    .line 1220
    .line 1221
    if-eqz v4, :cond_38

    .line 1222
    .line 1223
    move-object v4, v10

    .line 1224
    check-cast v4, La/xw7;

    .line 1225
    .line 1226
    iget-wide v4, v4, La/xw7;->b:J

    .line 1227
    .line 1228
    :goto_27
    move-wide/from16 v36, v4

    .line 1229
    .line 1230
    goto :goto_29

    .line 1231
    :cond_38
    instance-of v4, v10, La/vw7;

    .line 1232
    .line 1233
    if-eqz v4, :cond_39

    .line 1234
    .line 1235
    move-object v4, v10

    .line 1236
    check-cast v4, La/vw7;

    .line 1237
    .line 1238
    iget-wide v4, v4, La/vw7;->a:J

    .line 1239
    .line 1240
    goto :goto_27

    .line 1241
    :cond_39
    :goto_28
    move-wide/from16 v36, v2

    .line 1242
    .line 1243
    :goto_29
    iget-wide v4, v11, La/xum0;->b:J

    .line 1244
    .line 1245
    iget-object v6, v11, La/xum0;->a:Ljava/lang/String;

    .line 1246
    .line 1247
    if-eqz v6, :cond_3c

    .line 1248
    .line 1249
    invoke-static {v6}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 1250
    .line 1251
    .line 1252
    move-result v7

    .line 1253
    if-nez v7, :cond_3a

    .line 1254
    .line 1255
    goto :goto_2a

    .line 1256
    :cond_3a
    move-object/from16 v6, v29

    .line 1257
    .line 1258
    :goto_2a
    if-nez v6, :cond_3b

    .line 1259
    .line 1260
    goto :goto_2b

    .line 1261
    :cond_3b
    move-object/from16 v34, v6

    .line 1262
    .line 1263
    goto :goto_2c

    .line 1264
    :cond_3c
    :goto_2b
    move-object/from16 v34, v19

    .line 1265
    .line 1266
    :goto_2c
    if-eqz v10, :cond_3e

    .line 1267
    .line 1268
    instance-of v6, v10, La/bx7;

    .line 1269
    .line 1270
    if-eqz v6, :cond_3d

    .line 1271
    .line 1272
    goto :goto_2d

    .line 1273
    :cond_3d
    const/16 v35, 0x0

    .line 1274
    .line 1275
    goto :goto_2e

    .line 1276
    :cond_3e
    :goto_2d
    const/16 v35, 0x1

    .line 1277
    .line 1278
    :goto_2e
    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v6

    .line 1282
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v6

    .line 1286
    iget-object v7, v8, La/ctf0;->b:La/lsm0;

    .line 1287
    .line 1288
    const/4 v11, 0x1

    .line 1289
    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v6

    .line 1293
    const v14, 0x7f1309ba

    .line 1294
    .line 1295
    .line 1296
    invoke-virtual {v7, v14, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1297
    .line 1298
    .line 1299
    move-result-object v38

    .line 1300
    invoke-static/range {v36 .. v37}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v6

    .line 1304
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1305
    .line 1306
    .line 1307
    move-result-object v6

    .line 1308
    invoke-static {v6, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v6

    .line 1312
    const v11, 0x7f130e0b

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v7, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v39

    .line 1319
    if-nez v10, :cond_3f

    .line 1320
    .line 1321
    goto :goto_30

    .line 1322
    :cond_3f
    instance-of v6, v10, La/zw7;

    .line 1323
    .line 1324
    if-eqz v6, :cond_40

    .line 1325
    .line 1326
    :goto_2f
    const/16 v41, 0x1

    .line 1327
    .line 1328
    goto :goto_31

    .line 1329
    :cond_40
    instance-of v6, v10, La/xw7;

    .line 1330
    .line 1331
    if-eqz v6, :cond_41

    .line 1332
    .line 1333
    invoke-interface/range {v40 .. v40}, Ljava/util/List;->isEmpty()Z

    .line 1334
    .line 1335
    .line 1336
    move-result v6

    .line 1337
    if-eqz v6, :cond_41

    .line 1338
    .line 1339
    cmp-long v2, v36, v2

    .line 1340
    .line 1341
    if-nez v2, :cond_41

    .line 1342
    .line 1343
    goto :goto_2f

    .line 1344
    :cond_41
    :goto_30
    const/16 v41, 0x0

    .line 1345
    .line 1346
    :goto_31
    new-instance v31, La/h7h;

    .line 1347
    .line 1348
    move-wide/from16 v32, v4

    .line 1349
    .line 1350
    invoke-direct/range {v31 .. v41}, La/h7h;-><init>(JLjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;La/a4x;Z)V

    .line 1351
    .line 1352
    .line 1353
    move-object/from16 v2, p1

    .line 1354
    .line 1355
    move-object/from16 v3, v31

    .line 1356
    .line 1357
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1358
    .line 1359
    .line 1360
    move-object v10, v2

    .line 1361
    move-object/from16 v5, v19

    .line 1362
    .line 1363
    move-object/from16 v6, v23

    .line 1364
    .line 1365
    move-object/from16 v7, v24

    .line 1366
    .line 1367
    move-wide/from16 v14, v54

    .line 1368
    .line 1369
    const/4 v2, 0x4

    .line 1370
    const/4 v3, 0x3

    .line 1371
    const/4 v4, 0x1

    .line 1372
    goto/16 :goto_11

    .line 1373
    .line 1374
    :cond_42
    move-object v2, v10

    .line 1375
    move-wide/from16 v54, v14

    .line 1376
    .line 1377
    new-instance v0, Ljava/util/ArrayList;

    .line 1378
    .line 1379
    const/16 v9, 0xa

    .line 1380
    .line 1381
    invoke-static {v13, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1382
    .line 1383
    .line 1384
    move-result v3

    .line 1385
    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 1386
    .line 1387
    .line 1388
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1389
    .line 1390
    .line 1391
    move-result-object v3

    .line 1392
    :goto_32
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1393
    .line 1394
    .line 1395
    move-result v4

    .line 1396
    if-eqz v4, :cond_47

    .line 1397
    .line 1398
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v4

    .line 1402
    check-cast v4, La/fs20;

    .line 1403
    .line 1404
    new-instance v10, La/q5h;

    .line 1405
    .line 1406
    invoke-interface {v4}, La/fs20;->a()J

    .line 1407
    .line 1408
    .line 1409
    move-result-wide v11

    .line 1410
    instance-of v5, v4, La/ds20;

    .line 1411
    .line 1412
    if-eqz v5, :cond_43

    .line 1413
    .line 1414
    const/4 v5, 0x0

    .line 1415
    new-array v6, v5, [Ljava/lang/Object;

    .line 1416
    .line 1417
    iget-object v7, v8, La/ctf0;->b:La/lsm0;

    .line 1418
    .line 1419
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1420
    .line 1421
    .line 1422
    move-result-object v6

    .line 1423
    const v13, 0x7f1300eb

    .line 1424
    .line 1425
    .line 1426
    invoke-virtual {v7, v13, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v6

    .line 1430
    :goto_33
    move-object v13, v6

    .line 1431
    goto :goto_34

    .line 1432
    :cond_43
    const/4 v5, 0x0

    .line 1433
    instance-of v6, v4, La/es20;

    .line 1434
    .line 1435
    if-eqz v6, :cond_46

    .line 1436
    .line 1437
    move-object v6, v4

    .line 1438
    check-cast v6, La/es20;

    .line 1439
    .line 1440
    iget-object v6, v6, La/es20;->b:Ljava/lang/String;

    .line 1441
    .line 1442
    goto :goto_33

    .line 1443
    :goto_34
    invoke-interface {v4}, La/fs20;->a()J

    .line 1444
    .line 1445
    .line 1446
    move-result-wide v6

    .line 1447
    cmp-long v6, v6, v54

    .line 1448
    .line 1449
    if-nez v6, :cond_44

    .line 1450
    .line 1451
    const/4 v14, 0x1

    .line 1452
    goto :goto_35

    .line 1453
    :cond_44
    move v14, v5

    .line 1454
    :goto_35
    invoke-interface {v4}, La/fs20;->a()J

    .line 1455
    .line 1456
    .line 1457
    move-result-wide v6

    .line 1458
    const-wide/16 v22, 0x2

    .line 1459
    .line 1460
    cmp-long v4, v6, v22

    .line 1461
    .line 1462
    if-nez v4, :cond_45

    .line 1463
    .line 1464
    const/4 v15, 0x1

    .line 1465
    goto :goto_36

    .line 1466
    :cond_45
    move v15, v5

    .line 1467
    :goto_36
    invoke-direct/range {v10 .. v15}, La/q5h;-><init>(JLjava/lang/String;ZZ)V

    .line 1468
    .line 1469
    .line 1470
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1471
    .line 1472
    .line 1473
    goto :goto_32

    .line 1474
    :cond_46
    invoke-static {}, La/t9f;->b()V

    .line 1475
    .line 1476
    .line 1477
    goto/16 :goto_26

    .line 1478
    .line 1479
    :cond_47
    const/4 v5, 0x0

    .line 1480
    invoke-static {v2}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1481
    .line 1482
    .line 1483
    move-result-object v15

    .line 1484
    const/4 v11, 0x1

    .line 1485
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1486
    .line 1487
    .line 1488
    move-result-object v16

    .line 1489
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1490
    .line 1491
    .line 1492
    move-result v24

    .line 1493
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 1494
    .line 1495
    .line 1496
    move-result v0

    .line 1497
    if-le v0, v11, :cond_48

    .line 1498
    .line 1499
    move/from16 v21, v11

    .line 1500
    .line 1501
    :goto_37
    const/4 v0, 0x3

    .line 1502
    goto :goto_38

    .line 1503
    :cond_48
    move/from16 v21, v5

    .line 1504
    .line 1505
    goto :goto_37

    .line 1506
    :goto_38
    const-wide/16 v3, -0x1a

    .line 1507
    .line 1508
    cmp-long v3, v54, v3

    .line 1509
    .line 1510
    if-nez v3, :cond_49

    .line 1511
    .line 1512
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1513
    .line 1514
    .line 1515
    move-result v4

    .line 1516
    if-nez v4, :cond_49

    .line 1517
    .line 1518
    move/from16 v22, v11

    .line 1519
    .line 1520
    goto :goto_39

    .line 1521
    :cond_49
    move/from16 v22, v5

    .line 1522
    .line 1523
    :goto_39
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 1524
    .line 1525
    .line 1526
    move-result v4

    .line 1527
    const/4 v6, 0x4

    .line 1528
    if-lt v4, v6, :cond_4a

    .line 1529
    .line 1530
    move/from16 v23, v11

    .line 1531
    .line 1532
    goto :goto_3a

    .line 1533
    :cond_4a
    move/from16 v23, v5

    .line 1534
    .line 1535
    :goto_3a
    if-nez v3, :cond_4b

    .line 1536
    .line 1537
    move-object/from16 v25, v29

    .line 1538
    .line 1539
    goto/16 :goto_42

    .line 1540
    .line 1541
    :cond_4b
    new-instance v3, Ljava/util/ArrayList;

    .line 1542
    .line 1543
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1544
    .line 1545
    .line 1546
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v4

    .line 1550
    :cond_4c
    :goto_3b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1551
    .line 1552
    .line 1553
    move-result v6

    .line 1554
    if-eqz v6, :cond_4d

    .line 1555
    .line 1556
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1557
    .line 1558
    .line 1559
    move-result-object v6

    .line 1560
    move-object v7, v6

    .line 1561
    check-cast v7, La/h7h;

    .line 1562
    .line 1563
    iget-object v7, v7, La/h7h;->g:La/a4x;

    .line 1564
    .line 1565
    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    .line 1566
    .line 1567
    .line 1568
    move-result v7

    .line 1569
    if-nez v7, :cond_4c

    .line 1570
    .line 1571
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1572
    .line 1573
    .line 1574
    goto :goto_3b

    .line 1575
    :cond_4d
    new-instance v4, Ljava/util/ArrayList;

    .line 1576
    .line 1577
    const/16 v9, 0xa

    .line 1578
    .line 1579
    invoke-static {v3, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1580
    .line 1581
    .line 1582
    move-result v6

    .line 1583
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v3

    .line 1590
    move v6, v5

    .line 1591
    :goto_3c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v7

    .line 1595
    if-eqz v7, :cond_52

    .line 1596
    .line 1597
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v7

    .line 1601
    add-int/lit8 v8, v6, 0x1

    .line 1602
    .line 1603
    if-ltz v6, :cond_51

    .line 1604
    .line 1605
    check-cast v7, La/h7h;

    .line 1606
    .line 1607
    iget-object v10, v7, La/h7h;->g:La/a4x;

    .line 1608
    .line 1609
    new-instance v12, Ljava/util/ArrayList;

    .line 1610
    .line 1611
    const/16 v9, 0xa

    .line 1612
    .line 1613
    invoke-static {v10, v9}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1614
    .line 1615
    .line 1616
    move-result v13

    .line 1617
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    .line 1618
    .line 1619
    .line 1620
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1621
    .line 1622
    .line 1623
    move-result-object v10

    .line 1624
    :goto_3d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 1625
    .line 1626
    .line 1627
    move-result v13

    .line 1628
    if-eqz v13, :cond_4e

    .line 1629
    .line 1630
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v13

    .line 1634
    check-cast v13, La/b7h;

    .line 1635
    .line 1636
    invoke-static {v13}, La/b7h;->a(La/b7h;)La/b7h;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v13

    .line 1640
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1641
    .line 1642
    .line 1643
    goto :goto_3d

    .line 1644
    :cond_4e
    invoke-static {v12}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v39

    .line 1648
    iget-wide v12, v7, La/h7h;->a:J

    .line 1649
    .line 1650
    iget-object v10, v7, La/h7h;->b:Ljava/lang/String;

    .line 1651
    .line 1652
    iget-boolean v14, v7, La/h7h;->c:Z

    .line 1653
    .line 1654
    move-object/from16 v33, v10

    .line 1655
    .line 1656
    iget-wide v9, v7, La/h7h;->d:J

    .line 1657
    .line 1658
    iget-object v0, v7, La/h7h;->e:Ljava/lang/String;

    .line 1659
    .line 1660
    iget-object v5, v7, La/h7h;->f:Ljava/lang/String;

    .line 1661
    .line 1662
    iget-boolean v11, v7, La/h7h;->h:Z

    .line 1663
    .line 1664
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1665
    .line 1666
    .line 1667
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual/range {v39 .. v39}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1671
    .line 1672
    .line 1673
    new-instance v30, La/h7h;

    .line 1674
    .line 1675
    move-object/from16 v37, v0

    .line 1676
    .line 1677
    move-object/from16 v38, v5

    .line 1678
    .line 1679
    move-wide/from16 v35, v9

    .line 1680
    .line 1681
    move/from16 v40, v11

    .line 1682
    .line 1683
    move-wide/from16 v31, v12

    .line 1684
    .line 1685
    move/from16 v34, v14

    .line 1686
    .line 1687
    invoke-direct/range {v30 .. v40}, La/h7h;-><init>(JLjava/lang/String;ZJLjava/lang/String;Ljava/lang/String;La/a4x;Z)V

    .line 1688
    .line 1689
    .line 1690
    move-object/from16 v0, v30

    .line 1691
    .line 1692
    iget-wide v9, v7, La/h7h;->a:J

    .line 1693
    .line 1694
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v5

    .line 1698
    invoke-interface {v1, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v5

    .line 1702
    check-cast v5, Ljava/lang/Boolean;

    .line 1703
    .line 1704
    if-eqz v5, :cond_4f

    .line 1705
    .line 1706
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1707
    .line 1708
    .line 1709
    move-result v5

    .line 1710
    move v6, v5

    .line 1711
    const/4 v5, 0x3

    .line 1712
    goto :goto_3e

    .line 1713
    :cond_4f
    const/4 v5, 0x3

    .line 1714
    if-ge v6, v5, :cond_50

    .line 1715
    .line 1716
    const/4 v6, 0x1

    .line 1717
    goto :goto_3e

    .line 1718
    :cond_50
    const/4 v6, 0x0

    .line 1719
    :goto_3e
    new-instance v7, La/wbg;

    .line 1720
    .line 1721
    invoke-direct {v7, v0, v6}, La/wbg;-><init>(La/h7h;Z)V

    .line 1722
    .line 1723
    .line 1724
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1725
    .line 1726
    .line 1727
    move v0, v5

    .line 1728
    move v6, v8

    .line 1729
    const/4 v5, 0x0

    .line 1730
    const/4 v11, 0x1

    .line 1731
    goto/16 :goto_3c

    .line 1732
    .line 1733
    :cond_51
    invoke-static {}, La/q3d;->p()V

    .line 1734
    .line 1735
    .line 1736
    throw v29

    .line 1737
    :cond_52
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1738
    .line 1739
    .line 1740
    move-result v0

    .line 1741
    if-nez v0, :cond_53

    .line 1742
    .line 1743
    new-instance v0, La/sbg;

    .line 1744
    .line 1745
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v1

    .line 1749
    invoke-direct {v0, v1}, La/sbg;-><init>(La/a4x;)V

    .line 1750
    .line 1751
    .line 1752
    :goto_3f
    move-object v9, v0

    .line 1753
    goto :goto_41

    .line 1754
    :cond_53
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1755
    .line 1756
    .line 1757
    move-result v0

    .line 1758
    if-eqz v0, :cond_54

    .line 1759
    .line 1760
    goto :goto_40

    .line 1761
    :cond_54
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    :cond_55
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1766
    .line 1767
    .line 1768
    move-result v1

    .line 1769
    if-eqz v1, :cond_56

    .line 1770
    .line 1771
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1772
    .line 1773
    .line 1774
    move-result-object v1

    .line 1775
    check-cast v1, La/h7h;

    .line 1776
    .line 1777
    iget-boolean v1, v1, La/h7h;->c:Z

    .line 1778
    .line 1779
    if-eqz v1, :cond_55

    .line 1780
    .line 1781
    sget-object v0, La/tbg;->a:La/tbg;

    .line 1782
    .line 1783
    goto :goto_3f

    .line 1784
    :cond_56
    :goto_40
    sget-object v0, La/ubg;->a:La/ubg;

    .line 1785
    .line 1786
    goto :goto_3f

    .line 1787
    :goto_41
    move-object/from16 v25, v9

    .line 1788
    .line 1789
    :goto_42
    new-instance v14, La/k7h;

    .line 1790
    .line 1791
    move-wide/from16 v19, v54

    .line 1792
    .line 1793
    invoke-direct/range {v14 .. v25}, La/k7h;-><init>(La/a4x;La/a4x;JJZZZZLa/vbg;)V

    .line 1794
    .line 1795
    .line 1796
    move-object v9, v14

    .line 1797
    :goto_43
    return-object v9

    .line 1798
    nop

    .line 1799
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
