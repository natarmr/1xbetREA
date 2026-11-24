.class public final synthetic La/kv80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(ILjava/util/List;)V
    .locals 0

    .line 1
    const/16 p1, 0xf

    iput-byte p1, p0, La/kv80;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/kv80;->b:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/kv80;->a:B

    iput-object p1, p0, La/kv80;->b:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 44

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kv80;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x1

    .line 7
    const/4 v4, 0x0

    .line 8
    const/16 v5, 0xd

    .line 9
    .line 10
    const-string v6, "shimmer_"

    .line 11
    .line 12
    const/high16 v7, 0x42700000    # 60.0f

    .line 13
    .line 14
    const/high16 v8, 0x42100000    # 36.0f

    .line 15
    .line 16
    const/high16 v9, 0x43280000    # 168.0f

    .line 17
    .line 18
    const/high16 v10, 0x438f0000    # 286.0f

    .line 19
    .line 20
    const/high16 v11, 0x41400000    # 12.0f

    .line 21
    .line 22
    const/4 v12, 0x0

    .line 23
    const/16 v13, 0xa

    .line 24
    .line 25
    iget-object v14, v0, La/kv80;->b:Ljava/util/List;

    .line 26
    .line 27
    packed-switch v1, :pswitch_data_0

    .line 28
    .line 29
    .line 30
    move-object/from16 v0, p1

    .line 31
    .line 32
    check-cast v0, La/oyg0;

    .line 33
    .line 34
    move-object/from16 v15, p2

    .line 35
    .line 36
    check-cast v15, La/ser0;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v0, v15, La/ser0;->w:La/xdr0;

    .line 45
    .line 46
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    new-instance v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-static {v14, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 56
    .line 57
    .line 58
    move-result v3

    .line 59
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_1e

    .line 71
    .line 72
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    check-cast v4, La/lhb0;

    .line 77
    .line 78
    sget-object v5, La/lhb0;->a:La/lhb0;

    .line 79
    .line 80
    if-ne v4, v5, :cond_0

    .line 81
    .line 82
    iget-boolean v5, v0, La/xdr0;->b:Z

    .line 83
    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    sget-object v4, La/c2r0;->a:La/c2r0;

    .line 87
    .line 88
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    goto/16 :goto_b

    .line 92
    .line 93
    :cond_0
    sget-object v5, La/lhb0;->b:La/lhb0;

    .line 94
    .line 95
    if-ne v4, v5, :cond_2

    .line 96
    .line 97
    iget-boolean v5, v0, La/xdr0;->g:Z

    .line 98
    .line 99
    if-nez v5, :cond_2

    .line 100
    .line 101
    iget-boolean v5, v0, La/xdr0;->i:Z

    .line 102
    .line 103
    if-nez v5, :cond_2

    .line 104
    .line 105
    iget-boolean v5, v0, La/xdr0;->l:Z

    .line 106
    .line 107
    if-eqz v5, :cond_2

    .line 108
    .line 109
    iget-boolean v5, v0, La/xdr0;->c:Z

    .line 110
    .line 111
    if-nez v5, :cond_1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_1
    sget-object v4, La/p1r0;->a:La/p1r0;

    .line 115
    .line 116
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    goto/16 :goto_b

    .line 120
    .line 121
    :cond_2
    :goto_1
    sget-object v5, La/lhb0;->c:La/lhb0;

    .line 122
    .line 123
    if-ne v4, v5, :cond_4

    .line 124
    .line 125
    iget-boolean v5, v0, La/xdr0;->m:Z

    .line 126
    .line 127
    if-eqz v5, :cond_4

    .line 128
    .line 129
    iget-boolean v5, v0, La/xdr0;->o:Z

    .line 130
    .line 131
    if-eqz v5, :cond_4

    .line 132
    .line 133
    iget-boolean v5, v0, La/xdr0;->d:Z

    .line 134
    .line 135
    if-eqz v5, :cond_4

    .line 136
    .line 137
    iget-boolean v5, v0, La/xdr0;->i:Z

    .line 138
    .line 139
    if-eqz v5, :cond_3

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_3
    sget-object v4, La/y1r0;->a:La/y1r0;

    .line 143
    .line 144
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto/16 :goto_b

    .line 148
    .line 149
    :cond_4
    :goto_2
    sget-object v5, La/lhb0;->d:La/lhb0;

    .line 150
    .line 151
    if-ne v4, v5, :cond_5

    .line 152
    .line 153
    sget-object v4, La/d2r0;->a:La/d2r0;

    .line 154
    .line 155
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto/16 :goto_b

    .line 159
    .line 160
    :cond_5
    sget-object v5, La/lhb0;->e:La/lhb0;

    .line 161
    .line 162
    if-ne v4, v5, :cond_6

    .line 163
    .line 164
    sget-object v4, La/b2r0;->a:La/b2r0;

    .line 165
    .line 166
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto/16 :goto_b

    .line 170
    .line 171
    :cond_6
    sget-object v5, La/lhb0;->f:La/lhb0;

    .line 172
    .line 173
    if-ne v4, v5, :cond_7

    .line 174
    .line 175
    sget-object v4, La/a2r0;->a:La/a2r0;

    .line 176
    .line 177
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 178
    .line 179
    .line 180
    goto/16 :goto_b

    .line 181
    .line 182
    :cond_7
    sget-object v5, La/lhb0;->g:La/lhb0;

    .line 183
    .line 184
    if-ne v4, v5, :cond_8

    .line 185
    .line 186
    sget-object v4, La/z1r0;->a:La/z1r0;

    .line 187
    .line 188
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto/16 :goto_b

    .line 192
    .line 193
    :cond_8
    sget-object v5, La/lhb0;->h:La/lhb0;

    .line 194
    .line 195
    if-ne v4, v5, :cond_a

    .line 196
    .line 197
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 198
    .line 199
    if-eqz v5, :cond_a

    .line 200
    .line 201
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 202
    .line 203
    if-eqz v5, :cond_9

    .line 204
    .line 205
    goto :goto_3

    .line 206
    :cond_9
    sget-object v4, La/n1r0;->a:La/n1r0;

    .line 207
    .line 208
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    goto/16 :goto_b

    .line 212
    .line 213
    :cond_a
    :goto_3
    sget-object v5, La/lhb0;->j:La/lhb0;

    .line 214
    .line 215
    if-ne v4, v5, :cond_c

    .line 216
    .line 217
    iget-boolean v5, v0, La/xdr0;->m:Z

    .line 218
    .line 219
    if-eqz v5, :cond_c

    .line 220
    .line 221
    iget-boolean v5, v0, La/xdr0;->i:Z

    .line 222
    .line 223
    if-eqz v5, :cond_b

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_b
    sget-object v4, La/w1r0;->a:La/w1r0;

    .line 227
    .line 228
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto/16 :goto_b

    .line 232
    .line 233
    :cond_c
    :goto_4
    sget-object v5, La/lhb0;->k:La/lhb0;

    .line 234
    .line 235
    if-ne v4, v5, :cond_e

    .line 236
    .line 237
    iget-boolean v5, v0, La/xdr0;->m:Z

    .line 238
    .line 239
    if-eqz v5, :cond_e

    .line 240
    .line 241
    iget-boolean v5, v0, La/xdr0;->i:Z

    .line 242
    .line 243
    if-eqz v5, :cond_d

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_d
    sget-object v4, La/x1r0;->a:La/x1r0;

    .line 247
    .line 248
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    goto/16 :goto_b

    .line 252
    .line 253
    :cond_e
    :goto_5
    sget-object v5, La/lhb0;->l:La/lhb0;

    .line 254
    .line 255
    if-ne v4, v5, :cond_10

    .line 256
    .line 257
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 258
    .line 259
    if-eqz v5, :cond_10

    .line 260
    .line 261
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 262
    .line 263
    if-eqz v5, :cond_f

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_f
    sget-object v4, La/o1r0;->a:La/o1r0;

    .line 267
    .line 268
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    goto/16 :goto_b

    .line 272
    .line 273
    :cond_10
    :goto_6
    sget-object v5, La/lhb0;->m:La/lhb0;

    .line 274
    .line 275
    if-ne v4, v5, :cond_12

    .line 276
    .line 277
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 278
    .line 279
    if-eqz v5, :cond_12

    .line 280
    .line 281
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 282
    .line 283
    if-eqz v5, :cond_11

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_11
    sget-object v4, La/k1r0;->a:La/k1r0;

    .line 287
    .line 288
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 289
    .line 290
    .line 291
    goto/16 :goto_b

    .line 292
    .line 293
    :cond_12
    :goto_7
    sget-object v5, La/lhb0;->i:La/lhb0;

    .line 294
    .line 295
    if-ne v4, v5, :cond_14

    .line 296
    .line 297
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 298
    .line 299
    if-eqz v5, :cond_14

    .line 300
    .line 301
    iget-boolean v5, v0, La/xdr0;->i:Z

    .line 302
    .line 303
    if-nez v5, :cond_14

    .line 304
    .line 305
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 306
    .line 307
    if-eqz v5, :cond_13

    .line 308
    .line 309
    goto :goto_8

    .line 310
    :cond_13
    sget-object v4, La/l1r0;->a:La/l1r0;

    .line 311
    .line 312
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    goto/16 :goto_b

    .line 316
    .line 317
    :cond_14
    :goto_8
    sget-object v5, La/lhb0;->n:La/lhb0;

    .line 318
    .line 319
    if-ne v4, v5, :cond_16

    .line 320
    .line 321
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 322
    .line 323
    if-eqz v5, :cond_16

    .line 324
    .line 325
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 326
    .line 327
    if-eqz v5, :cond_15

    .line 328
    .line 329
    goto :goto_9

    .line 330
    :cond_15
    sget-object v4, La/m1r0;->a:La/m1r0;

    .line 331
    .line 332
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_16
    :goto_9
    sget-object v5, La/lhb0;->o:La/lhb0;

    .line 337
    .line 338
    if-ne v4, v5, :cond_18

    .line 339
    .line 340
    iget-boolean v5, v0, La/xdr0;->p:Z

    .line 341
    .line 342
    if-eqz v5, :cond_18

    .line 343
    .line 344
    iget-boolean v5, v0, La/xdr0;->q:Z

    .line 345
    .line 346
    if-nez v5, :cond_18

    .line 347
    .line 348
    iget-boolean v5, v0, La/xdr0;->s:Z

    .line 349
    .line 350
    if-eqz v5, :cond_17

    .line 351
    .line 352
    goto :goto_a

    .line 353
    :cond_17
    sget-object v4, La/e2r0;->a:La/e2r0;

    .line 354
    .line 355
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 356
    .line 357
    .line 358
    goto :goto_b

    .line 359
    :cond_18
    :goto_a
    sget-object v5, La/lhb0;->p:La/lhb0;

    .line 360
    .line 361
    if-ne v4, v5, :cond_19

    .line 362
    .line 363
    iget-boolean v5, v0, La/xdr0;->r:Z

    .line 364
    .line 365
    if-eqz v5, :cond_19

    .line 366
    .line 367
    sget-object v4, La/t1r0;->a:La/t1r0;

    .line 368
    .line 369
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 370
    .line 371
    .line 372
    goto :goto_b

    .line 373
    :cond_19
    sget-object v5, La/lhb0;->q:La/lhb0;

    .line 374
    .line 375
    if-ne v4, v5, :cond_1a

    .line 376
    .line 377
    iget-boolean v5, v0, La/xdr0;->r:Z

    .line 378
    .line 379
    if-eqz v5, :cond_1a

    .line 380
    .line 381
    sget-object v4, La/v1r0;->a:La/v1r0;

    .line 382
    .line 383
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 384
    .line 385
    .line 386
    goto :goto_b

    .line 387
    :cond_1a
    sget-object v5, La/lhb0;->r:La/lhb0;

    .line 388
    .line 389
    if-ne v4, v5, :cond_1b

    .line 390
    .line 391
    iget-boolean v5, v0, La/xdr0;->r:Z

    .line 392
    .line 393
    if-eqz v5, :cond_1b

    .line 394
    .line 395
    sget-object v4, La/u1r0;->a:La/u1r0;

    .line 396
    .line 397
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    goto :goto_b

    .line 401
    :cond_1b
    sget-object v5, La/lhb0;->s:La/lhb0;

    .line 402
    .line 403
    if-ne v4, v5, :cond_1c

    .line 404
    .line 405
    iget-boolean v5, v0, La/xdr0;->r:Z

    .line 406
    .line 407
    if-eqz v5, :cond_1c

    .line 408
    .line 409
    sget-object v4, La/r1r0;->a:La/r1r0;

    .line 410
    .line 411
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    goto :goto_b

    .line 415
    :cond_1c
    sget-object v5, La/lhb0;->t:La/lhb0;

    .line 416
    .line 417
    if-ne v4, v5, :cond_1d

    .line 418
    .line 419
    iget-boolean v4, v0, La/xdr0;->r:Z

    .line 420
    .line 421
    if-eqz v4, :cond_1d

    .line 422
    .line 423
    sget-object v4, La/q1r0;->a:La/q1r0;

    .line 424
    .line 425
    invoke-virtual {v1, v4}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 426
    .line 427
    .line 428
    :cond_1d
    :goto_b
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 429
    .line 430
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 431
    .line 432
    .line 433
    goto/16 :goto_0

    .line 434
    .line 435
    :cond_1e
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 436
    .line 437
    .line 438
    move-result-object v16

    .line 439
    const/16 v39, 0x0

    .line 440
    .line 441
    const v40, 0xfffffe

    .line 442
    .line 443
    .line 444
    const/16 v17, 0x0

    .line 445
    .line 446
    const/16 v18, 0x0

    .line 447
    .line 448
    const/16 v19, 0x0

    .line 449
    .line 450
    const/16 v20, 0x0

    .line 451
    .line 452
    const/16 v21, 0x0

    .line 453
    .line 454
    const/16 v22, 0x0

    .line 455
    .line 456
    const/16 v23, 0x0

    .line 457
    .line 458
    const/16 v24, 0x0

    .line 459
    .line 460
    const/16 v25, 0x0

    .line 461
    .line 462
    const/16 v26, 0x0

    .line 463
    .line 464
    const/16 v27, 0x0

    .line 465
    .line 466
    const/16 v28, 0x0

    .line 467
    .line 468
    const/16 v29, 0x0

    .line 469
    .line 470
    const/16 v30, 0x0

    .line 471
    .line 472
    const/16 v31, 0x0

    .line 473
    .line 474
    const/16 v32, 0x0

    .line 475
    .line 476
    const/16 v33, 0x0

    .line 477
    .line 478
    const/16 v34, 0x0

    .line 479
    .line 480
    const/16 v35, 0x0

    .line 481
    .line 482
    const/16 v36, 0x0

    .line 483
    .line 484
    const/16 v37, 0x0

    .line 485
    .line 486
    const/16 v38, 0x0

    .line 487
    .line 488
    invoke-static/range {v15 .. v40}, La/ser0;->a(La/ser0;La/lc00;La/ler0;La/zyq0;La/u8r0;La/c4r0;La/qer0;La/per0;La/her0;La/hyq0;La/zxq0;La/s8r0;La/t8r0;La/xxq0;La/iyq0;La/eyq0;La/pfr0;La/n2r0;La/b3r0;La/a3r0;La/j2r0;La/h2r0;La/o8r0;La/xdr0;ZI)La/ser0;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    return-object v0

    .line 493
    :pswitch_0
    move-object/from16 v0, p1

    .line 494
    .line 495
    check-cast v0, La/fet;

    .line 496
    .line 497
    move-object/from16 v1, p2

    .line 498
    .line 499
    check-cast v1, Ljava/lang/Integer;

    .line 500
    .line 501
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 502
    .line 503
    .line 504
    invoke-static {v3}, La/x8x;->L(I)I

    .line 505
    .line 506
    .line 507
    move-result v1

    .line 508
    invoke-static {v14, v0, v1}, La/tke;->A(Ljava/util/List;La/fet;I)V

    .line 509
    .line 510
    .line 511
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_1
    move-object/from16 v0, p1

    .line 515
    .line 516
    check-cast v0, La/oyg0;

    .line 517
    .line 518
    move-object/from16 v15, p2

    .line 519
    .line 520
    check-cast v15, La/gvn0;

    .line 521
    .line 522
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 526
    .line 527
    .line 528
    new-instance v0, Ljava/util/ArrayList;

    .line 529
    .line 530
    invoke-static {v14, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 531
    .line 532
    .line 533
    move-result v1

    .line 534
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 535
    .line 536
    .line 537
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v1

    .line 541
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v2

    .line 545
    if-eqz v2, :cond_22

    .line 546
    .line 547
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    check-cast v2, La/hpn0;

    .line 552
    .line 553
    iget-object v3, v15, La/gvn0;->f:Ljava/util/List;

    .line 554
    .line 555
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    :cond_1f
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 560
    .line 561
    .line 562
    move-result v5

    .line 563
    if-eqz v5, :cond_20

    .line 564
    .line 565
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 566
    .line 567
    .line 568
    move-result-object v5

    .line 569
    move-object v6, v5

    .line 570
    check-cast v6, La/hpn0;

    .line 571
    .line 572
    iget-wide v7, v6, La/hpn0;->a:J

    .line 573
    .line 574
    iget-wide v9, v2, La/hpn0;->a:J

    .line 575
    .line 576
    cmp-long v7, v7, v9

    .line 577
    .line 578
    if-nez v7, :cond_1f

    .line 579
    .line 580
    iget-wide v6, v6, La/hpn0;->c:J

    .line 581
    .line 582
    iget-wide v8, v2, La/hpn0;->c:J

    .line 583
    .line 584
    cmp-long v6, v6, v8

    .line 585
    .line 586
    if-nez v6, :cond_1f

    .line 587
    .line 588
    goto :goto_d

    .line 589
    :cond_20
    move-object v5, v4

    .line 590
    :goto_d
    check-cast v5, La/hpn0;

    .line 591
    .line 592
    if-eqz v5, :cond_21

    .line 593
    .line 594
    iget-boolean v3, v5, La/hpn0;->f:Z

    .line 595
    .line 596
    invoke-static {v2, v3}, La/hpn0;->a(La/hpn0;Z)La/hpn0;

    .line 597
    .line 598
    .line 599
    move-result-object v2

    .line 600
    :cond_21
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    goto :goto_c

    .line 604
    :cond_22
    const/16 v22, 0x0

    .line 605
    .line 606
    const/16 v23, 0xdf

    .line 607
    .line 608
    const/16 v16, 0x0

    .line 609
    .line 610
    const/16 v17, 0x0

    .line 611
    .line 612
    const/16 v18, 0x0

    .line 613
    .line 614
    const/16 v19, 0x0

    .line 615
    .line 616
    const/16 v20, 0x0

    .line 617
    .line 618
    move-object/from16 v21, v0

    .line 619
    .line 620
    invoke-static/range {v15 .. v23}, La/gvn0;->a(La/gvn0;ZZZZLjava/util/List;Ljava/util/List;Ljava/util/Set;I)La/gvn0;

    .line 621
    .line 622
    .line 623
    move-result-object v0

    .line 624
    return-object v0

    .line 625
    :pswitch_2
    move-object/from16 v0, p1

    .line 626
    .line 627
    check-cast v0, La/oyg0;

    .line 628
    .line 629
    move-object/from16 v15, p2

    .line 630
    .line 631
    check-cast v15, La/gvn0;

    .line 632
    .line 633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 634
    .line 635
    .line 636
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 637
    .line 638
    .line 639
    iget-object v0, v15, La/gvn0;->e:Ljava/util/List;

    .line 640
    .line 641
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 642
    .line 643
    .line 644
    move-result v1

    .line 645
    if-nez v1, :cond_27

    .line 646
    .line 647
    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    .line 648
    .line 649
    .line 650
    move-result v1

    .line 651
    if-nez v1, :cond_27

    .line 652
    .line 653
    new-instance v1, Ljava/util/ArrayList;

    .line 654
    .line 655
    invoke-static {v14, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 656
    .line 657
    .line 658
    move-result v2

    .line 659
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 660
    .line 661
    .line 662
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 663
    .line 664
    .line 665
    move-result-object v2

    .line 666
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 667
    .line 668
    .line 669
    move-result v3

    .line 670
    if-eqz v3, :cond_26

    .line 671
    .line 672
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v3

    .line 676
    check-cast v3, La/epn0;

    .line 677
    .line 678
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 679
    .line 680
    .line 681
    move-result-object v5

    .line 682
    :cond_23
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 683
    .line 684
    .line 685
    move-result v6

    .line 686
    if-eqz v6, :cond_24

    .line 687
    .line 688
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v6

    .line 692
    move-object v7, v6

    .line 693
    check-cast v7, La/epn0;

    .line 694
    .line 695
    iget v8, v7, La/epn0;->a:I

    .line 696
    .line 697
    iget v9, v3, La/epn0;->a:I

    .line 698
    .line 699
    if-ne v8, v9, :cond_23

    .line 700
    .line 701
    iget-wide v7, v7, La/epn0;->e:J

    .line 702
    .line 703
    iget-wide v9, v3, La/epn0;->e:J

    .line 704
    .line 705
    cmp-long v7, v7, v9

    .line 706
    .line 707
    if-nez v7, :cond_23

    .line 708
    .line 709
    goto :goto_f

    .line 710
    :cond_24
    move-object v6, v4

    .line 711
    :goto_f
    check-cast v6, La/epn0;

    .line 712
    .line 713
    if-eqz v6, :cond_25

    .line 714
    .line 715
    iget-boolean v5, v6, La/epn0;->f:Z

    .line 716
    .line 717
    invoke-static {v3, v5}, La/epn0;->a(La/epn0;Z)La/epn0;

    .line 718
    .line 719
    .line 720
    move-result-object v3

    .line 721
    :cond_25
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    goto :goto_e

    .line 725
    :cond_26
    move-object/from16 v20, v1

    .line 726
    .line 727
    goto :goto_10

    .line 728
    :cond_27
    move-object/from16 v20, v14

    .line 729
    .line 730
    :goto_10
    const/16 v22, 0x0

    .line 731
    .line 732
    const/16 v23, 0xef

    .line 733
    .line 734
    const/16 v16, 0x0

    .line 735
    .line 736
    const/16 v17, 0x0

    .line 737
    .line 738
    const/16 v18, 0x0

    .line 739
    .line 740
    const/16 v19, 0x0

    .line 741
    .line 742
    const/16 v21, 0x0

    .line 743
    .line 744
    invoke-static/range {v15 .. v23}, La/gvn0;->a(La/gvn0;ZZZZLjava/util/List;Ljava/util/List;Ljava/util/Set;I)La/gvn0;

    .line 745
    .line 746
    .line 747
    move-result-object v0

    .line 748
    return-object v0

    .line 749
    :pswitch_3
    move-object/from16 v0, p1

    .line 750
    .line 751
    check-cast v0, La/oyg0;

    .line 752
    .line 753
    move-object/from16 v15, p2

    .line 754
    .line 755
    check-cast v15, La/dvk0;

    .line 756
    .line 757
    iget-object v0, v15, La/dvk0;->n:La/bvk0;

    .line 758
    .line 759
    invoke-static {v0, v4, v4, v14, v2}, La/bvk0;->a(La/bvk0;La/btk0;Ljava/util/List;Ljava/util/List;I)La/bvk0;

    .line 760
    .line 761
    .line 762
    move-result-object v28

    .line 763
    iget-object v0, v15, La/dvk0;->k:La/pvk0;

    .line 764
    .line 765
    invoke-static {v0, v4, v4, v14, v2}, La/pvk0;->a(La/pvk0;La/btk0;Ljava/util/List;Ljava/util/List;I)La/pvk0;

    .line 766
    .line 767
    .line 768
    move-result-object v25

    .line 769
    const/16 v42, 0x0

    .line 770
    .line 771
    const v43, 0x3fffdbff

    .line 772
    .line 773
    .line 774
    const/16 v16, 0x0

    .line 775
    .line 776
    const/16 v17, 0x0

    .line 777
    .line 778
    const/16 v18, 0x0

    .line 779
    .line 780
    const/16 v19, 0x0

    .line 781
    .line 782
    const/16 v20, 0x0

    .line 783
    .line 784
    const/16 v21, 0x0

    .line 785
    .line 786
    const/16 v22, 0x0

    .line 787
    .line 788
    const/16 v23, 0x0

    .line 789
    .line 790
    const/16 v24, 0x0

    .line 791
    .line 792
    const/16 v26, 0x0

    .line 793
    .line 794
    const/16 v27, 0x0

    .line 795
    .line 796
    const/16 v29, 0x0

    .line 797
    .line 798
    const/16 v30, 0x0

    .line 799
    .line 800
    const/16 v31, 0x0

    .line 801
    .line 802
    const/16 v32, 0x0

    .line 803
    .line 804
    const/16 v33, 0x0

    .line 805
    .line 806
    const/16 v34, 0x0

    .line 807
    .line 808
    const/16 v35, 0x0

    .line 809
    .line 810
    const/16 v36, 0x0

    .line 811
    .line 812
    const/16 v37, 0x0

    .line 813
    .line 814
    const/16 v38, 0x0

    .line 815
    .line 816
    const/16 v39, 0x0

    .line 817
    .line 818
    const/16 v40, 0x0

    .line 819
    .line 820
    const/16 v41, 0x0

    .line 821
    .line 822
    invoke-static/range {v15 .. v43}, La/dvk0;->a(La/dvk0;ZLa/xl9;La/a9l0;La/sdt;La/ptk0;La/cvk0;La/gvk0;La/evk0;La/lpp0;La/pvk0;La/rtk0;La/fvk0;La/bvk0;La/otk0;La/jwk0;La/gqk0;La/gtk0;La/ltk0;La/etk0;La/qtk0;La/ntk0;La/dtk0;La/avk0;La/ctk0;La/stk0;La/wcb;La/mtk0;I)La/dvk0;

    .line 823
    .line 824
    .line 825
    move-result-object v0

    .line 826
    return-object v0

    .line 827
    :pswitch_4
    move-object/from16 v1, p1

    .line 828
    .line 829
    check-cast v1, La/oyg0;

    .line 830
    .line 831
    move-object/from16 v2, p2

    .line 832
    .line 833
    check-cast v2, La/svg0;

    .line 834
    .line 835
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 836
    .line 837
    .line 838
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    const/16 v26, 0x0

    .line 842
    .line 843
    const v28, 0x5fffff

    .line 844
    .line 845
    .line 846
    const/4 v3, 0x0

    .line 847
    const/4 v4, 0x0

    .line 848
    const/4 v5, 0x0

    .line 849
    const-wide/16 v6, 0x0

    .line 850
    .line 851
    const-wide/16 v8, 0x0

    .line 852
    .line 853
    const-wide/16 v10, 0x0

    .line 854
    .line 855
    const-wide/16 v12, 0x0

    .line 856
    .line 857
    const-wide/16 v14, 0x0

    .line 858
    .line 859
    const-wide/16 v16, 0x0

    .line 860
    .line 861
    const-wide/16 v18, 0x0

    .line 862
    .line 863
    const/16 v20, 0x0

    .line 864
    .line 865
    const/16 v21, 0x0

    .line 866
    .line 867
    const/16 v22, 0x0

    .line 868
    .line 869
    const/16 v23, 0x0

    .line 870
    .line 871
    const/16 v24, 0x0

    .line 872
    .line 873
    const/16 v25, 0x0

    .line 874
    .line 875
    iget-object v0, v0, La/kv80;->b:Ljava/util/List;

    .line 876
    .line 877
    move-object/from16 v27, v0

    .line 878
    .line 879
    invoke-static/range {v2 .. v28}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 880
    .line 881
    .line 882
    move-result-object v0

    .line 883
    return-object v0

    .line 884
    :pswitch_5
    move-object/from16 v1, p1

    .line 885
    .line 886
    check-cast v1, La/oyg0;

    .line 887
    .line 888
    move-object/from16 v2, p2

    .line 889
    .line 890
    check-cast v2, La/svg0;

    .line 891
    .line 892
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 893
    .line 894
    .line 895
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 896
    .line 897
    .line 898
    const/16 v27, 0x0

    .line 899
    .line 900
    const v28, 0x6fffff

    .line 901
    .line 902
    .line 903
    const/4 v3, 0x0

    .line 904
    const/4 v4, 0x0

    .line 905
    const/4 v5, 0x0

    .line 906
    const-wide/16 v6, 0x0

    .line 907
    .line 908
    const-wide/16 v8, 0x0

    .line 909
    .line 910
    const-wide/16 v10, 0x0

    .line 911
    .line 912
    const-wide/16 v12, 0x0

    .line 913
    .line 914
    const-wide/16 v14, 0x0

    .line 915
    .line 916
    const-wide/16 v16, 0x0

    .line 917
    .line 918
    const-wide/16 v18, 0x0

    .line 919
    .line 920
    const/16 v20, 0x0

    .line 921
    .line 922
    const/16 v21, 0x0

    .line 923
    .line 924
    const/16 v22, 0x0

    .line 925
    .line 926
    const/16 v23, 0x0

    .line 927
    .line 928
    const/16 v24, 0x0

    .line 929
    .line 930
    const/16 v25, 0x0

    .line 931
    .line 932
    iget-object v0, v0, La/kv80;->b:Ljava/util/List;

    .line 933
    .line 934
    move-object/from16 v26, v0

    .line 935
    .line 936
    invoke-static/range {v2 .. v28}, La/svg0;->a(La/svg0;FFFDDDDDDDZZLa/xtg0;La/wvg0;La/ytg0;La/ql5;Ljava/util/List;Ljava/util/List;I)La/svg0;

    .line 937
    .line 938
    .line 939
    move-result-object v0

    .line 940
    return-object v0

    .line 941
    :pswitch_6
    move-object/from16 v0, p1

    .line 942
    .line 943
    check-cast v0, Ljava/lang/Integer;

    .line 944
    .line 945
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 946
    .line 947
    .line 948
    move-result v0

    .line 949
    move-object/from16 v1, p2

    .line 950
    .line 951
    check-cast v1, Ljava/lang/Boolean;

    .line 952
    .line 953
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 954
    .line 955
    .line 956
    move-result v1

    .line 957
    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 958
    .line 959
    .line 960
    move-result-object v0

    .line 961
    check-cast v0, La/t9v0;

    .line 962
    .line 963
    iput-boolean v1, v0, La/t9v0;->e:Z

    .line 964
    .line 965
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 966
    .line 967
    return-object v0

    .line 968
    :pswitch_7
    move-object/from16 v0, p1

    .line 969
    .line 970
    check-cast v0, Ljava/lang/Integer;

    .line 971
    .line 972
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 973
    .line 974
    .line 975
    move-result v0

    .line 976
    move-object/from16 v1, p2

    .line 977
    .line 978
    check-cast v1, Ljava/lang/Boolean;

    .line 979
    .line 980
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 981
    .line 982
    .line 983
    move-result v1

    .line 984
    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 985
    .line 986
    .line 987
    move-result-object v0

    .line 988
    check-cast v0, La/t9v0;

    .line 989
    .line 990
    iput-boolean v1, v0, La/t9v0;->e:Z

    .line 991
    .line 992
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 993
    .line 994
    return-object v0

    .line 995
    :pswitch_8
    move-object/from16 v0, p1

    .line 996
    .line 997
    check-cast v0, Ljava/lang/Integer;

    .line 998
    .line 999
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1000
    .line 1001
    .line 1002
    move-result v0

    .line 1003
    move-object/from16 v1, p2

    .line 1004
    .line 1005
    check-cast v1, Ljava/lang/Boolean;

    .line 1006
    .line 1007
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v1

    .line 1011
    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1012
    .line 1013
    .line 1014
    move-result-object v0

    .line 1015
    check-cast v0, La/t9v0;

    .line 1016
    .line 1017
    iput-boolean v1, v0, La/t9v0;->e:Z

    .line 1018
    .line 1019
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1020
    .line 1021
    return-object v0

    .line 1022
    :pswitch_9
    move-object/from16 v0, p1

    .line 1023
    .line 1024
    check-cast v0, La/oyg0;

    .line 1025
    .line 1026
    move-object/from16 v1, p2

    .line 1027
    .line 1028
    check-cast v1, La/u2b0;

    .line 1029
    .line 1030
    iget-object v0, v1, La/u2b0;->l:Ljava/util/List;

    .line 1031
    .line 1032
    new-instance v8, Ljava/util/ArrayList;

    .line 1033
    .line 1034
    invoke-static {v0, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1035
    .line 1036
    .line 1037
    move-result v2

    .line 1038
    invoke-direct {v8, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1039
    .line 1040
    .line 1041
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1046
    .line 1047
    .line 1048
    move-result v2

    .line 1049
    if-eqz v2, :cond_2a

    .line 1050
    .line 1051
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    check-cast v2, La/df40;

    .line 1056
    .line 1057
    instance-of v3, v2, La/ne40;

    .line 1058
    .line 1059
    if-eqz v3, :cond_29

    .line 1060
    .line 1061
    invoke-interface {v14}, Ljava/util/List;->isEmpty()Z

    .line 1062
    .line 1063
    .line 1064
    move-result v2

    .line 1065
    if-eqz v2, :cond_28

    .line 1066
    .line 1067
    sget-object v2, La/zxx;->a:La/zxx;

    .line 1068
    .line 1069
    goto :goto_12

    .line 1070
    :cond_28
    new-instance v2, La/cyx;

    .line 1071
    .line 1072
    invoke-direct {v2, v14}, La/cyx;-><init>(Ljava/lang/Object;)V

    .line 1073
    .line 1074
    .line 1075
    :goto_12
    new-instance v3, La/ne40;

    .line 1076
    .line 1077
    invoke-direct {v3, v2}, La/ne40;-><init>(La/fyx;)V

    .line 1078
    .line 1079
    .line 1080
    move-object v2, v3

    .line 1081
    :cond_29
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1082
    .line 1083
    .line 1084
    goto :goto_11

    .line 1085
    :cond_2a
    const/16 v9, 0x7ff

    .line 1086
    .line 1087
    const/4 v2, 0x0

    .line 1088
    const/4 v3, 0x0

    .line 1089
    const/4 v4, 0x0

    .line 1090
    const/4 v5, 0x0

    .line 1091
    const/4 v6, 0x0

    .line 1092
    const/4 v7, 0x0

    .line 1093
    invoke-static/range {v1 .. v9}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 1094
    .line 1095
    .line 1096
    move-result-object v0

    .line 1097
    return-object v0

    .line 1098
    :pswitch_a
    move-object/from16 v0, p1

    .line 1099
    .line 1100
    check-cast v0, La/c5n0;

    .line 1101
    .line 1102
    move-object/from16 v1, p2

    .line 1103
    .line 1104
    check-cast v1, La/p4e;

    .line 1105
    .line 1106
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1107
    .line 1108
    .line 1109
    iget-wide v3, v1, La/p4e;->a:J

    .line 1110
    .line 1111
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 1112
    .line 1113
    .line 1114
    move-result v1

    .line 1115
    sget-object v13, La/qmk;->a:La/zcl;

    .line 1116
    .line 1117
    invoke-interface {v0, v11}, La/w6k;->w0(F)F

    .line 1118
    .line 1119
    .line 1120
    move-result v11

    .line 1121
    float-to-int v11, v11

    .line 1122
    invoke-interface {v0, v10}, La/w6k;->w0(F)F

    .line 1123
    .line 1124
    .line 1125
    move-result v10

    .line 1126
    float-to-int v10, v10

    .line 1127
    add-int/2addr v10, v11

    .line 1128
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 1129
    .line 1130
    .line 1131
    move-result v9

    .line 1132
    float-to-int v9, v9

    .line 1133
    add-int/2addr v9, v11

    .line 1134
    invoke-interface {v0, v8}, La/w6k;->w0(F)F

    .line 1135
    .line 1136
    .line 1137
    move-result v8

    .line 1138
    float-to-int v8, v8

    .line 1139
    invoke-interface {v0, v7}, La/w6k;->w0(F)F

    .line 1140
    .line 1141
    .line 1142
    move-result v7

    .line 1143
    float-to-int v7, v7

    .line 1144
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v10

    .line 1148
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v9

    .line 1152
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v8

    .line 1156
    filled-new-array {v10, v9, v8}, [Ljava/lang/Integer;

    .line 1157
    .line 1158
    .line 1159
    move-result-object v8

    .line 1160
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1161
    .line 1162
    .line 1163
    move-result-object v8

    .line 1164
    sub-int/2addr v1, v11

    .line 1165
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v8

    .line 1169
    move v9, v12

    .line 1170
    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v10

    .line 1174
    if-eqz v10, :cond_2c

    .line 1175
    .line 1176
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1177
    .line 1178
    .line 1179
    move-result-object v10

    .line 1180
    check-cast v10, Ljava/lang/Number;

    .line 1181
    .line 1182
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1183
    .line 1184
    .line 1185
    move-result v10

    .line 1186
    if-gez v1, :cond_2b

    .line 1187
    .line 1188
    goto :goto_15

    .line 1189
    :cond_2b
    add-int/lit8 v9, v9, 0x1

    .line 1190
    .line 1191
    sub-int/2addr v1, v10

    .line 1192
    goto :goto_13

    .line 1193
    :cond_2c
    :goto_14
    if-lez v1, :cond_2d

    .line 1194
    .line 1195
    add-int/lit8 v9, v9, 0x1

    .line 1196
    .line 1197
    sub-int/2addr v1, v7

    .line 1198
    goto :goto_14

    .line 1199
    :cond_2d
    :goto_15
    new-instance v1, Ljava/util/ArrayList;

    .line 1200
    .line 1201
    invoke-direct {v1, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1202
    .line 1203
    .line 1204
    move v7, v12

    .line 1205
    :goto_16
    if-ge v7, v9, :cond_2f

    .line 1206
    .line 1207
    invoke-static {v14}, La/q3d;->i(Ljava/util/List;)I

    .line 1208
    .line 1209
    .line 1210
    move-result v8

    .line 1211
    const/4 v10, 0x1

    .line 1212
    if-gt v7, v8, :cond_2e

    .line 1213
    .line 1214
    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1215
    .line 1216
    .line 1217
    move-result-object v8

    .line 1218
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1219
    .line 1220
    goto :goto_17

    .line 1221
    :cond_2e
    new-instance v8, La/dv90;

    .line 1222
    .line 1223
    invoke-direct {v8, v9, v7, v2}, La/dv90;-><init>(IIB)V

    .line 1224
    .line 1225
    .line 1226
    new-instance v11, La/ugd;

    .line 1227
    .line 1228
    const v13, 0x3fdfde8d

    .line 1229
    .line 1230
    .line 1231
    invoke-direct {v11, v13, v10, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1232
    .line 1233
    .line 1234
    move-object v8, v11

    .line 1235
    :goto_17
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1236
    .line 1237
    invoke-direct {v11, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v11

    .line 1247
    invoke-interface {v0, v11, v8}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 1248
    .line 1249
    .line 1250
    move-result-object v8

    .line 1251
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v8

    .line 1255
    move-object v15, v8

    .line 1256
    check-cast v15, La/pj30;

    .line 1257
    .line 1258
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1259
    .line 1260
    .line 1261
    move-result v8

    .line 1262
    invoke-static {v12, v8, v12, v12, v5}, La/r4e;->b(IIIII)J

    .line 1263
    .line 1264
    .line 1265
    move-result-wide v16

    .line 1266
    move-object/from16 v18, v1

    .line 1267
    .line 1268
    move/from16 v19, v7

    .line 1269
    .line 1270
    move/from16 v20, v10

    .line 1271
    .line 1272
    invoke-static/range {v15 .. v20}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 1273
    .line 1274
    .line 1275
    move-result v7

    .line 1276
    goto :goto_16

    .line 1277
    :cond_2f
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 1278
    .line 1279
    .line 1280
    move-result v2

    .line 1281
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 1282
    .line 1283
    .line 1284
    move-result v3

    .line 1285
    new-instance v4, La/uy2;

    .line 1286
    .line 1287
    const/16 v5, 0x8

    .line 1288
    .line 1289
    invoke-direct {v4, v1, v5}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 1290
    .line 1291
    .line 1292
    invoke-static {v0, v2, v3, v4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v0

    .line 1296
    return-object v0

    .line 1297
    :pswitch_b
    move-object/from16 v0, p1

    .line 1298
    .line 1299
    check-cast v0, La/c5n0;

    .line 1300
    .line 1301
    move-object/from16 v1, p2

    .line 1302
    .line 1303
    check-cast v1, La/p4e;

    .line 1304
    .line 1305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1306
    .line 1307
    .line 1308
    iget-wide v1, v1, La/p4e;->a:J

    .line 1309
    .line 1310
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1311
    .line 1312
    .line 1313
    move-result v3

    .line 1314
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1315
    .line 1316
    invoke-interface {v0, v11}, La/w6k;->w0(F)F

    .line 1317
    .line 1318
    .line 1319
    move-result v4

    .line 1320
    float-to-int v4, v4

    .line 1321
    invoke-interface {v0, v10}, La/w6k;->w0(F)F

    .line 1322
    .line 1323
    .line 1324
    move-result v10

    .line 1325
    float-to-int v10, v10

    .line 1326
    add-int/2addr v10, v4

    .line 1327
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 1328
    .line 1329
    .line 1330
    move-result v9

    .line 1331
    float-to-int v9, v9

    .line 1332
    add-int/2addr v9, v4

    .line 1333
    invoke-interface {v0, v8}, La/w6k;->w0(F)F

    .line 1334
    .line 1335
    .line 1336
    move-result v8

    .line 1337
    float-to-int v8, v8

    .line 1338
    invoke-interface {v0, v7}, La/w6k;->w0(F)F

    .line 1339
    .line 1340
    .line 1341
    move-result v7

    .line 1342
    float-to-int v7, v7

    .line 1343
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v10

    .line 1347
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v9

    .line 1351
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1352
    .line 1353
    .line 1354
    move-result-object v8

    .line 1355
    filled-new-array {v10, v9, v8}, [Ljava/lang/Integer;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v8

    .line 1359
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v8

    .line 1363
    sub-int/2addr v3, v4

    .line 1364
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1365
    .line 1366
    .line 1367
    move-result-object v4

    .line 1368
    move v8, v12

    .line 1369
    :goto_18
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v9

    .line 1373
    if-eqz v9, :cond_31

    .line 1374
    .line 1375
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v9

    .line 1379
    check-cast v9, Ljava/lang/Number;

    .line 1380
    .line 1381
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1382
    .line 1383
    .line 1384
    move-result v9

    .line 1385
    if-gez v3, :cond_30

    .line 1386
    .line 1387
    goto :goto_1a

    .line 1388
    :cond_30
    add-int/lit8 v8, v8, 0x1

    .line 1389
    .line 1390
    sub-int/2addr v3, v9

    .line 1391
    goto :goto_18

    .line 1392
    :cond_31
    :goto_19
    if-lez v3, :cond_32

    .line 1393
    .line 1394
    add-int/lit8 v8, v8, 0x1

    .line 1395
    .line 1396
    sub-int/2addr v3, v7

    .line 1397
    goto :goto_19

    .line 1398
    :cond_32
    :goto_1a
    new-instance v3, Ljava/util/ArrayList;

    .line 1399
    .line 1400
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1401
    .line 1402
    .line 1403
    move v4, v12

    .line 1404
    :goto_1b
    if-ge v4, v8, :cond_34

    .line 1405
    .line 1406
    invoke-static {v14}, La/q3d;->i(Ljava/util/List;)I

    .line 1407
    .line 1408
    .line 1409
    move-result v7

    .line 1410
    const/4 v9, 0x1

    .line 1411
    if-gt v4, v7, :cond_33

    .line 1412
    .line 1413
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1414
    .line 1415
    .line 1416
    move-result-object v7

    .line 1417
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 1418
    .line 1419
    goto :goto_1c

    .line 1420
    :cond_33
    new-instance v7, La/dv90;

    .line 1421
    .line 1422
    const/4 v10, 0x2

    .line 1423
    invoke-direct {v7, v8, v4, v10}, La/dv90;-><init>(IIB)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v10, La/ugd;

    .line 1427
    .line 1428
    const v11, -0x174a0a8c

    .line 1429
    .line 1430
    .line 1431
    invoke-direct {v10, v11, v9, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1432
    .line 1433
    .line 1434
    move-object v7, v10

    .line 1435
    :goto_1c
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1436
    .line 1437
    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1438
    .line 1439
    .line 1440
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v10

    .line 1447
    invoke-interface {v0, v10, v7}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v7

    .line 1451
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v7

    .line 1455
    move-object v15, v7

    .line 1456
    check-cast v15, La/pj30;

    .line 1457
    .line 1458
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1459
    .line 1460
    .line 1461
    move-result v7

    .line 1462
    invoke-static {v12, v7, v12, v12, v5}, La/r4e;->b(IIIII)J

    .line 1463
    .line 1464
    .line 1465
    move-result-wide v16

    .line 1466
    move-object/from16 v18, v3

    .line 1467
    .line 1468
    move/from16 v19, v4

    .line 1469
    .line 1470
    move/from16 v20, v9

    .line 1471
    .line 1472
    invoke-static/range {v15 .. v20}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 1473
    .line 1474
    .line 1475
    move-result v4

    .line 1476
    goto :goto_1b

    .line 1477
    :cond_34
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1478
    .line 1479
    .line 1480
    move-result v4

    .line 1481
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1482
    .line 1483
    .line 1484
    move-result v1

    .line 1485
    new-instance v2, La/uy2;

    .line 1486
    .line 1487
    const/4 v5, 0x7

    .line 1488
    invoke-direct {v2, v3, v5}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 1489
    .line 1490
    .line 1491
    invoke-static {v0, v4, v1, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v0

    .line 1495
    return-object v0

    .line 1496
    :pswitch_c
    move-object/from16 v0, p1

    .line 1497
    .line 1498
    check-cast v0, La/c5n0;

    .line 1499
    .line 1500
    move-object/from16 v1, p2

    .line 1501
    .line 1502
    check-cast v1, La/p4e;

    .line 1503
    .line 1504
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1505
    .line 1506
    .line 1507
    iget-wide v1, v1, La/p4e;->a:J

    .line 1508
    .line 1509
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1510
    .line 1511
    .line 1512
    move-result v4

    .line 1513
    sget-object v13, La/qmk;->a:La/zcl;

    .line 1514
    .line 1515
    invoke-interface {v0, v11}, La/w6k;->w0(F)F

    .line 1516
    .line 1517
    .line 1518
    move-result v11

    .line 1519
    float-to-int v11, v11

    .line 1520
    invoke-interface {v0, v10}, La/w6k;->w0(F)F

    .line 1521
    .line 1522
    .line 1523
    move-result v10

    .line 1524
    float-to-int v10, v10

    .line 1525
    add-int/2addr v10, v11

    .line 1526
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 1527
    .line 1528
    .line 1529
    move-result v9

    .line 1530
    float-to-int v9, v9

    .line 1531
    add-int/2addr v9, v11

    .line 1532
    invoke-interface {v0, v8}, La/w6k;->w0(F)F

    .line 1533
    .line 1534
    .line 1535
    move-result v8

    .line 1536
    float-to-int v8, v8

    .line 1537
    invoke-interface {v0, v7}, La/w6k;->w0(F)F

    .line 1538
    .line 1539
    .line 1540
    move-result v7

    .line 1541
    float-to-int v7, v7

    .line 1542
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1543
    .line 1544
    .line 1545
    move-result-object v10

    .line 1546
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1547
    .line 1548
    .line 1549
    move-result-object v9

    .line 1550
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1551
    .line 1552
    .line 1553
    move-result-object v8

    .line 1554
    filled-new-array {v10, v9, v8}, [Ljava/lang/Integer;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v8

    .line 1558
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1559
    .line 1560
    .line 1561
    move-result-object v8

    .line 1562
    sub-int/2addr v4, v11

    .line 1563
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v8

    .line 1567
    move v9, v12

    .line 1568
    :goto_1d
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1569
    .line 1570
    .line 1571
    move-result v10

    .line 1572
    if-eqz v10, :cond_36

    .line 1573
    .line 1574
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v10

    .line 1578
    check-cast v10, Ljava/lang/Number;

    .line 1579
    .line 1580
    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    .line 1581
    .line 1582
    .line 1583
    move-result v10

    .line 1584
    if-gez v4, :cond_35

    .line 1585
    .line 1586
    goto :goto_1f

    .line 1587
    :cond_35
    add-int/lit8 v9, v9, 0x1

    .line 1588
    .line 1589
    sub-int/2addr v4, v10

    .line 1590
    goto :goto_1d

    .line 1591
    :cond_36
    :goto_1e
    if-lez v4, :cond_37

    .line 1592
    .line 1593
    add-int/lit8 v9, v9, 0x1

    .line 1594
    .line 1595
    sub-int/2addr v4, v7

    .line 1596
    goto :goto_1e

    .line 1597
    :cond_37
    :goto_1f
    new-instance v4, Ljava/util/ArrayList;

    .line 1598
    .line 1599
    invoke-direct {v4, v9}, Ljava/util/ArrayList;-><init>(I)V

    .line 1600
    .line 1601
    .line 1602
    move v7, v12

    .line 1603
    :goto_20
    if-ge v7, v9, :cond_39

    .line 1604
    .line 1605
    invoke-static {v14}, La/q3d;->i(Ljava/util/List;)I

    .line 1606
    .line 1607
    .line 1608
    move-result v8

    .line 1609
    const/4 v10, 0x1

    .line 1610
    if-gt v7, v8, :cond_38

    .line 1611
    .line 1612
    invoke-interface {v14, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1613
    .line 1614
    .line 1615
    move-result-object v8

    .line 1616
    check-cast v8, Lkotlin/jvm/functions/Function2;

    .line 1617
    .line 1618
    goto :goto_21

    .line 1619
    :cond_38
    new-instance v8, La/dv90;

    .line 1620
    .line 1621
    invoke-direct {v8, v9, v7, v3}, La/dv90;-><init>(IIB)V

    .line 1622
    .line 1623
    .line 1624
    new-instance v11, La/ugd;

    .line 1625
    .line 1626
    const v13, 0x5bec4058

    .line 1627
    .line 1628
    .line 1629
    invoke-direct {v11, v13, v10, v8}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1630
    .line 1631
    .line 1632
    move-object v8, v11

    .line 1633
    :goto_21
    new-instance v11, Ljava/lang/StringBuilder;

    .line 1634
    .line 1635
    invoke-direct {v11, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1636
    .line 1637
    .line 1638
    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1639
    .line 1640
    .line 1641
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v11

    .line 1645
    invoke-interface {v0, v11, v8}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 1646
    .line 1647
    .line 1648
    move-result-object v8

    .line 1649
    invoke-static {v8}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v8

    .line 1653
    move-object v15, v8

    .line 1654
    check-cast v15, La/pj30;

    .line 1655
    .line 1656
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1657
    .line 1658
    .line 1659
    move-result v8

    .line 1660
    invoke-static {v12, v8, v12, v12, v5}, La/r4e;->b(IIIII)J

    .line 1661
    .line 1662
    .line 1663
    move-result-wide v16

    .line 1664
    move-object/from16 v18, v4

    .line 1665
    .line 1666
    move/from16 v19, v7

    .line 1667
    .line 1668
    move/from16 v20, v10

    .line 1669
    .line 1670
    invoke-static/range {v15 .. v20}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 1671
    .line 1672
    .line 1673
    move-result v7

    .line 1674
    goto :goto_20

    .line 1675
    :cond_39
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1676
    .line 1677
    .line 1678
    move-result v3

    .line 1679
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1680
    .line 1681
    .line 1682
    move-result v1

    .line 1683
    new-instance v2, La/uy2;

    .line 1684
    .line 1685
    const/4 v5, 0x6

    .line 1686
    invoke-direct {v2, v4, v5}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 1687
    .line 1688
    .line 1689
    invoke-static {v0, v3, v1, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1690
    .line 1691
    .line 1692
    move-result-object v0

    .line 1693
    return-object v0

    .line 1694
    :pswitch_d
    move-object/from16 v0, p1

    .line 1695
    .line 1696
    check-cast v0, La/c5n0;

    .line 1697
    .line 1698
    move-object/from16 v1, p2

    .line 1699
    .line 1700
    check-cast v1, La/p4e;

    .line 1701
    .line 1702
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    iget-wide v1, v1, La/p4e;->a:J

    .line 1706
    .line 1707
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1708
    .line 1709
    .line 1710
    move-result v3

    .line 1711
    sget-object v4, La/qmk;->a:La/zcl;

    .line 1712
    .line 1713
    invoke-interface {v0, v11}, La/w6k;->w0(F)F

    .line 1714
    .line 1715
    .line 1716
    move-result v4

    .line 1717
    float-to-int v4, v4

    .line 1718
    invoke-interface {v0, v10}, La/w6k;->w0(F)F

    .line 1719
    .line 1720
    .line 1721
    move-result v10

    .line 1722
    float-to-int v10, v10

    .line 1723
    add-int/2addr v10, v4

    .line 1724
    invoke-interface {v0, v9}, La/w6k;->w0(F)F

    .line 1725
    .line 1726
    .line 1727
    move-result v9

    .line 1728
    float-to-int v9, v9

    .line 1729
    add-int/2addr v9, v4

    .line 1730
    invoke-interface {v0, v8}, La/w6k;->w0(F)F

    .line 1731
    .line 1732
    .line 1733
    move-result v8

    .line 1734
    float-to-int v8, v8

    .line 1735
    invoke-interface {v0, v7}, La/w6k;->w0(F)F

    .line 1736
    .line 1737
    .line 1738
    move-result v7

    .line 1739
    float-to-int v7, v7

    .line 1740
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v10

    .line 1744
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1745
    .line 1746
    .line 1747
    move-result-object v9

    .line 1748
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1749
    .line 1750
    .line 1751
    move-result-object v8

    .line 1752
    filled-new-array {v10, v9, v8}, [Ljava/lang/Integer;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v8

    .line 1756
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1757
    .line 1758
    .line 1759
    move-result-object v8

    .line 1760
    sub-int/2addr v3, v4

    .line 1761
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v4

    .line 1765
    move v8, v12

    .line 1766
    :goto_22
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 1767
    .line 1768
    .line 1769
    move-result v9

    .line 1770
    if-eqz v9, :cond_3b

    .line 1771
    .line 1772
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v9

    .line 1776
    check-cast v9, Ljava/lang/Number;

    .line 1777
    .line 1778
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 1779
    .line 1780
    .line 1781
    move-result v9

    .line 1782
    if-gez v3, :cond_3a

    .line 1783
    .line 1784
    goto :goto_24

    .line 1785
    :cond_3a
    add-int/lit8 v8, v8, 0x1

    .line 1786
    .line 1787
    sub-int/2addr v3, v9

    .line 1788
    goto :goto_22

    .line 1789
    :cond_3b
    :goto_23
    if-lez v3, :cond_3c

    .line 1790
    .line 1791
    add-int/lit8 v8, v8, 0x1

    .line 1792
    .line 1793
    sub-int/2addr v3, v7

    .line 1794
    goto :goto_23

    .line 1795
    :cond_3c
    :goto_24
    new-instance v3, Ljava/util/ArrayList;

    .line 1796
    .line 1797
    invoke-direct {v3, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 1798
    .line 1799
    .line 1800
    move v4, v12

    .line 1801
    :goto_25
    if-ge v4, v8, :cond_3e

    .line 1802
    .line 1803
    invoke-static {v14}, La/q3d;->i(Ljava/util/List;)I

    .line 1804
    .line 1805
    .line 1806
    move-result v7

    .line 1807
    const/4 v9, 0x1

    .line 1808
    if-gt v4, v7, :cond_3d

    .line 1809
    .line 1810
    invoke-interface {v14, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v7

    .line 1814
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 1815
    .line 1816
    goto :goto_26

    .line 1817
    :cond_3d
    new-instance v7, La/dv90;

    .line 1818
    .line 1819
    invoke-direct {v7, v8, v4, v12}, La/dv90;-><init>(IIB)V

    .line 1820
    .line 1821
    .line 1822
    new-instance v10, La/ugd;

    .line 1823
    .line 1824
    const v11, -0x7559b1d4

    .line 1825
    .line 1826
    .line 1827
    invoke-direct {v10, v11, v9, v7}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1828
    .line 1829
    .line 1830
    move-object v7, v10

    .line 1831
    :goto_26
    new-instance v10, Ljava/lang/StringBuilder;

    .line 1832
    .line 1833
    invoke-direct {v10, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v10, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1837
    .line 1838
    .line 1839
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1840
    .line 1841
    .line 1842
    move-result-object v10

    .line 1843
    invoke-interface {v0, v10, v7}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 1844
    .line 1845
    .line 1846
    move-result-object v7

    .line 1847
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 1848
    .line 1849
    .line 1850
    move-result-object v7

    .line 1851
    move-object v15, v7

    .line 1852
    check-cast v15, La/pj30;

    .line 1853
    .line 1854
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1855
    .line 1856
    .line 1857
    move-result v7

    .line 1858
    invoke-static {v12, v7, v12, v12, v5}, La/r4e;->b(IIIII)J

    .line 1859
    .line 1860
    .line 1861
    move-result-wide v16

    .line 1862
    move-object/from16 v18, v3

    .line 1863
    .line 1864
    move/from16 v19, v4

    .line 1865
    .line 1866
    move/from16 v20, v9

    .line 1867
    .line 1868
    invoke-static/range {v15 .. v20}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 1869
    .line 1870
    .line 1871
    move-result v4

    .line 1872
    goto :goto_25

    .line 1873
    :cond_3e
    invoke-static {v1, v2}, La/p4e;->i(J)I

    .line 1874
    .line 1875
    .line 1876
    move-result v4

    .line 1877
    invoke-static {v1, v2}, La/p4e;->h(J)I

    .line 1878
    .line 1879
    .line 1880
    move-result v1

    .line 1881
    new-instance v2, La/uy2;

    .line 1882
    .line 1883
    const/4 v5, 0x5

    .line 1884
    invoke-direct {v2, v3, v5}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 1885
    .line 1886
    .line 1887
    invoke-static {v0, v4, v1, v2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 1888
    .line 1889
    .line 1890
    move-result-object v0

    .line 1891
    return-object v0

    .line 1892
    :pswitch_e
    move-object/from16 v0, p1

    .line 1893
    .line 1894
    check-cast v0, Ljava/lang/Integer;

    .line 1895
    .line 1896
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1897
    .line 1898
    .line 1899
    move-result v0

    .line 1900
    move-object/from16 v1, p2

    .line 1901
    .line 1902
    check-cast v1, Ljava/lang/Boolean;

    .line 1903
    .line 1904
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1905
    .line 1906
    .line 1907
    move-result v1

    .line 1908
    invoke-interface {v14, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1909
    .line 1910
    .line 1911
    move-result-object v0

    .line 1912
    check-cast v0, La/t9v0;

    .line 1913
    .line 1914
    iput-boolean v1, v0, La/t9v0;->e:Z

    .line 1915
    .line 1916
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1917
    .line 1918
    return-object v0

    .line 1919
    :pswitch_f
    move-object/from16 v0, p1

    .line 1920
    .line 1921
    check-cast v0, La/oyg0;

    .line 1922
    .line 1923
    move-object/from16 v1, p2

    .line 1924
    .line 1925
    check-cast v1, La/yu80;

    .line 1926
    .line 1927
    new-instance v0, Ljava/util/ArrayList;

    .line 1928
    .line 1929
    invoke-static {v14, v13}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 1930
    .line 1931
    .line 1932
    move-result v2

    .line 1933
    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 1934
    .line 1935
    .line 1936
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v2

    .line 1940
    :goto_27
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1941
    .line 1942
    .line 1943
    move-result v3

    .line 1944
    if-eqz v3, :cond_3f

    .line 1945
    .line 1946
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1947
    .line 1948
    .line 1949
    move-result-object v3

    .line 1950
    check-cast v3, La/mlr;

    .line 1951
    .line 1952
    iget-wide v3, v3, La/mlr;->a:J

    .line 1953
    .line 1954
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v3

    .line 1958
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1959
    .line 1960
    .line 1961
    goto :goto_27

    .line 1962
    :cond_3f
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 1963
    .line 1964
    .line 1965
    move-result-object v8

    .line 1966
    const/4 v10, 0x0

    .line 1967
    const v11, 0x1dfff

    .line 1968
    .line 1969
    .line 1970
    const/4 v2, 0x0

    .line 1971
    const/4 v3, 0x0

    .line 1972
    const/4 v4, 0x0

    .line 1973
    const/4 v5, 0x0

    .line 1974
    const/4 v6, 0x0

    .line 1975
    const/4 v7, 0x0

    .line 1976
    const/4 v9, 0x0

    .line 1977
    invoke-static/range {v1 .. v11}, La/yu80;->a(La/yu80;ZZZZZLjava/util/List;Ljava/util/Set;La/gu80;La/ql5;I)La/yu80;

    .line 1978
    .line 1979
    .line 1980
    move-result-object v0

    .line 1981
    return-object v0

    .line 1982
    nop

    .line 1983
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
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
