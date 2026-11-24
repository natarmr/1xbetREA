.class public final La/vit0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/g45;

.field public final c:La/xre;

.field public final d:La/chf0;

.field public final e:La/oif0;

.field public final f:La/etj;


# direct methods
.method public constructor <init>(La/g45;La/xre;La/chf0;La/oif0;La/etj;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/vit0;->a:B

    .line 2
    .line 3
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    packed-switch p6, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/vit0;->b:La/g45;

    .line 13
    .line 14
    iput-object p2, p0, La/vit0;->c:La/xre;

    .line 15
    .line 16
    iput-object p3, p0, La/vit0;->d:La/chf0;

    .line 17
    .line 18
    iput-object p4, p0, La/vit0;->e:La/oif0;

    .line 19
    .line 20
    iput-object p5, p0, La/vit0;->f:La/etj;

    .line 21
    .line 22
    return-void

    .line 23
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, La/vit0;->b:La/g45;

    .line 27
    .line 28
    iput-object p2, p0, La/vit0;->c:La/xre;

    .line 29
    .line 30
    iput-object p3, p0, La/vit0;->d:La/chf0;

    .line 31
    .line 32
    iput-object p4, p0, La/vit0;->e:La/oif0;

    .line 33
    .line 34
    iput-object p5, p0, La/vit0;->f:La/etj;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/q4f;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/rit0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/rit0;

    .line 11
    .line 12
    iget v3, v2, La/rit0;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/rit0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/rit0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/rit0;-><init>(La/vit0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/rit0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/rit0;->q:I

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    iget-object v8, v0, La/vit0;->e:La/oif0;

    .line 39
    .line 40
    const/4 v10, 0x1

    .line 41
    const/4 v11, 0x0

    .line 42
    if-eqz v4, :cond_5

    .line 43
    .line 44
    if-eq v4, v10, :cond_4

    .line 45
    .line 46
    if-eq v4, v7, :cond_3

    .line 47
    .line 48
    if-eq v4, v6, :cond_2

    .line 49
    .line 50
    if-ne v4, v5, :cond_1

    .line 51
    .line 52
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto/16 :goto_14

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v11

    .line 63
    :cond_2
    iget-boolean v0, v2, La/rit0;->n:Z

    .line 64
    .line 65
    iget-object v4, v2, La/rit0;->m:La/oif0;

    .line 66
    .line 67
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    goto/16 :goto_6

    .line 71
    .line 72
    :cond_3
    iget-boolean v4, v2, La/rit0;->n:Z

    .line 73
    .line 74
    iget-object v7, v2, La/rit0;->l:Ljava/util/List;

    .line 75
    .line 76
    iget-object v12, v2, La/rit0;->k:Ljava/util/ArrayList;

    .line 77
    .line 78
    iget-object v13, v2, La/rit0;->i:La/q4f;

    .line 79
    .line 80
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_4
    iget-boolean v4, v2, La/rit0;->n:Z

    .line 86
    .line 87
    iget-object v12, v2, La/rit0;->j:Ljava/util/List;

    .line 88
    .line 89
    iget-object v13, v2, La/rit0;->i:La/q4f;

    .line 90
    .line 91
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 92
    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_5
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    move-object/from16 v1, p1

    .line 99
    .line 100
    iput-object v1, v2, La/rit0;->i:La/q4f;

    .line 101
    .line 102
    move-object/from16 v4, p2

    .line 103
    .line 104
    iput-object v4, v2, La/rit0;->j:Ljava/util/List;

    .line 105
    .line 106
    move/from16 v12, p3

    .line 107
    .line 108
    iput-boolean v12, v2, La/rit0;->n:Z

    .line 109
    .line 110
    iput v10, v2, La/rit0;->q:I

    .line 111
    .line 112
    iget-object v13, v0, La/vit0;->d:La/chf0;

    .line 113
    .line 114
    invoke-virtual {v13, v2}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 115
    .line 116
    .line 117
    move-result-object v13

    .line 118
    if-ne v13, v3, :cond_6

    .line 119
    .line 120
    goto/16 :goto_13

    .line 121
    .line 122
    :cond_6
    move-object/from16 v24, v13

    .line 123
    .line 124
    move-object v13, v1

    .line 125
    move-object/from16 v1, v24

    .line 126
    .line 127
    move/from16 v24, v12

    .line 128
    .line 129
    move-object v12, v4

    .line 130
    move/from16 v4, v24

    .line 131
    .line 132
    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    .line 133
    .line 134
    new-instance v14, Ljava/util/ArrayList;

    .line 135
    .line 136
    const/16 v15, 0xa

    .line 137
    .line 138
    invoke-static {v1, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 139
    .line 140
    .line 141
    move-result v15

    .line 142
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v15

    .line 153
    if-eqz v15, :cond_7

    .line 154
    .line 155
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v15

    .line 159
    check-cast v15, La/qu6;

    .line 160
    .line 161
    iget-wide v9, v15, La/qu6;->a:J

    .line 162
    .line 163
    invoke-static {v9, v10, v14}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 164
    .line 165
    .line 166
    const/4 v10, 0x1

    .line 167
    goto :goto_2

    .line 168
    :cond_7
    sget-object v1, La/q4f;->g:La/q4f;

    .line 169
    .line 170
    sget-object v9, La/q4f;->h:La/q4f;

    .line 171
    .line 172
    sget-object v10, La/q4f;->m:La/q4f;

    .line 173
    .line 174
    filled-new-array {v1, v9, v10}, [La/q4f;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-interface {v1, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-eqz v1, :cond_9

    .line 187
    .line 188
    invoke-interface {v12}, Ljava/util/List;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result v1

    .line 192
    if-eqz v1, :cond_9

    .line 193
    .line 194
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    new-instance v9, Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-direct {v9, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 201
    .line 202
    .line 203
    const/4 v10, 0x0

    .line 204
    :goto_3
    if-ge v10, v1, :cond_8

    .line 205
    .line 206
    new-instance v12, Ljava/lang/Integer;

    .line 207
    .line 208
    invoke-direct {v12, v10}, Ljava/lang/Integer;-><init>(I)V

    .line 209
    .line 210
    .line 211
    invoke-static {v12}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object v12

    .line 215
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    add-int/lit8 v10, v10, 0x1

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_8
    move-object v12, v9

    .line 222
    :cond_9
    iput-object v13, v2, La/rit0;->i:La/q4f;

    .line 223
    .line 224
    iput-object v11, v2, La/rit0;->j:Ljava/util/List;

    .line 225
    .line 226
    iput-object v14, v2, La/rit0;->k:Ljava/util/ArrayList;

    .line 227
    .line 228
    iput-object v12, v2, La/rit0;->l:Ljava/util/List;

    .line 229
    .line 230
    iput-boolean v4, v2, La/rit0;->n:Z

    .line 231
    .line 232
    iput v7, v2, La/rit0;->q:I

    .line 233
    .line 234
    invoke-virtual {v8, v2}, La/oif0;->e(La/zje;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    if-ne v1, v3, :cond_a

    .line 239
    .line 240
    goto/16 :goto_13

    .line 241
    .line 242
    :cond_a
    move-object v7, v12

    .line 243
    move-object v12, v14

    .line 244
    :goto_4
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    const/4 v9, 0x5

    .line 249
    if-eq v1, v9, :cond_18

    .line 250
    .line 251
    const/4 v9, 0x6

    .line 252
    if-eq v1, v9, :cond_e

    .line 253
    .line 254
    const/16 v9, 0xb

    .line 255
    .line 256
    if-eq v1, v9, :cond_c

    .line 257
    .line 258
    sget-object v0, La/iun;->a:La/iun;

    .line 259
    .line 260
    :cond_b
    :goto_5
    move v1, v4

    .line 261
    move-object v4, v8

    .line 262
    goto/16 :goto_12

    .line 263
    .line 264
    :cond_c
    iput-object v11, v2, La/rit0;->i:La/q4f;

    .line 265
    .line 266
    iput-object v11, v2, La/rit0;->j:Ljava/util/List;

    .line 267
    .line 268
    iput-object v11, v2, La/rit0;->k:Ljava/util/ArrayList;

    .line 269
    .line 270
    iput-object v11, v2, La/rit0;->l:Ljava/util/List;

    .line 271
    .line 272
    iput-object v8, v2, La/rit0;->m:La/oif0;

    .line 273
    .line 274
    iput-boolean v4, v2, La/rit0;->n:Z

    .line 275
    .line 276
    iput v6, v2, La/rit0;->q:I

    .line 277
    .line 278
    invoke-virtual {v0, v12, v7, v2}, La/vit0;->d(Ljava/util/List;Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v1

    .line 282
    if-ne v1, v3, :cond_d

    .line 283
    .line 284
    goto/16 :goto_13

    .line 285
    .line 286
    :cond_d
    move v0, v4

    .line 287
    move-object v4, v8

    .line 288
    :goto_6
    check-cast v1, Ljava/util/List;

    .line 289
    .line 290
    move-object/from16 v24, v1

    .line 291
    .line 292
    move v1, v0

    .line 293
    move-object/from16 v0, v24

    .line 294
    .line 295
    goto/16 :goto_12

    .line 296
    .line 297
    :cond_e
    new-instance v1, Ljava/util/ArrayList;

    .line 298
    .line 299
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 300
    .line 301
    .line 302
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    const/16 v18, 0x0

    .line 307
    .line 308
    :goto_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 309
    .line 310
    .line 311
    move-result v7

    .line 312
    if-eqz v7, :cond_14

    .line 313
    .line 314
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object v7

    .line 318
    add-int/lit8 v19, v18, 0x1

    .line 319
    .line 320
    if-ltz v18, :cond_13

    .line 321
    .line 322
    check-cast v7, Ljava/util/List;

    .line 323
    .line 324
    new-instance v9, Ljava/util/ArrayList;

    .line 325
    .line 326
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 327
    .line 328
    .line 329
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 330
    .line 331
    .line 332
    move-result-object v10

    .line 333
    const/4 v13, 0x0

    .line 334
    :goto_8
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 335
    .line 336
    .line 337
    move-result v14

    .line 338
    if-eqz v14, :cond_11

    .line 339
    .line 340
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 341
    .line 342
    .line 343
    move-result-object v14

    .line 344
    add-int/lit8 v15, v13, 0x1

    .line 345
    .line 346
    if-ltz v13, :cond_10

    .line 347
    .line 348
    move-object/from16 v17, v14

    .line 349
    .line 350
    check-cast v17, Ljava/lang/Number;

    .line 351
    .line 352
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->longValue()J

    .line 353
    .line 354
    .line 355
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 356
    .line 357
    .line 358
    move-result-object v13

    .line 359
    invoke-interface {v7, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    move-result v13

    .line 363
    if-eqz v13, :cond_f

    .line 364
    .line 365
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 366
    .line 367
    .line 368
    :cond_f
    move v13, v15

    .line 369
    goto :goto_8

    .line 370
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 371
    .line 372
    .line 373
    throw v11

    .line 374
    :cond_11
    if-nez v18, :cond_12

    .line 375
    .line 376
    iget-object v7, v0, La/vit0;->b:La/g45;

    .line 377
    .line 378
    iget-object v7, v7, La/g45;->c:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v7, La/ave;

    .line 381
    .line 382
    iget-wide v13, v7, La/ave;->e:D

    .line 383
    .line 384
    :goto_9
    move-wide/from16 v21, v13

    .line 385
    .line 386
    goto :goto_a

    .line 387
    :cond_12
    const-wide/16 v13, 0x0

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :goto_a
    new-instance v17, La/hf6;

    .line 391
    .line 392
    const/16 v23, 0x0

    .line 393
    .line 394
    move-object/from16 v20, v9

    .line 395
    .line 396
    invoke-direct/range {v17 .. v23}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 397
    .line 398
    .line 399
    move-object/from16 v7, v17

    .line 400
    .line 401
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 402
    .line 403
    .line 404
    move/from16 v18, v19

    .line 405
    .line 406
    goto :goto_7

    .line 407
    :cond_13
    invoke-static {}, La/q3d;->p()V

    .line 408
    .line 409
    .line 410
    throw v11

    .line 411
    :cond_14
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 412
    .line 413
    .line 414
    move-result v0

    .line 415
    if-eqz v0, :cond_15

    .line 416
    .line 417
    goto :goto_b

    .line 418
    :cond_15
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    :cond_16
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v6

    .line 426
    if-eqz v6, :cond_17

    .line 427
    .line 428
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    check-cast v6, La/hf6;

    .line 433
    .line 434
    iget-object v6, v6, La/hf6;->c:Ljava/util/List;

    .line 435
    .line 436
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 437
    .line 438
    .line 439
    move-result v6

    .line 440
    const/4 v7, 0x1

    .line 441
    if-le v6, v7, :cond_16

    .line 442
    .line 443
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    check-cast v0, La/hf6;

    .line 448
    .line 449
    iget v6, v0, La/hf6;->a:I

    .line 450
    .line 451
    add-int/lit8 v13, v6, 0x1

    .line 452
    .line 453
    iget v0, v0, La/hf6;->b:I

    .line 454
    .line 455
    add-int/lit8 v14, v0, 0x1

    .line 456
    .line 457
    new-instance v12, La/hf6;

    .line 458
    .line 459
    sget-object v15, La/iun;->a:La/iun;

    .line 460
    .line 461
    const-wide/16 v16, 0x0

    .line 462
    .line 463
    const/16 v18, 0x0

    .line 464
    .line 465
    invoke-direct/range {v12 .. v18}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v1, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 469
    .line 470
    .line 471
    :cond_17
    :goto_b
    move-object v0, v1

    .line 472
    goto/16 :goto_5

    .line 473
    .line 474
    :cond_18
    new-instance v0, Ljava/util/ArrayList;

    .line 475
    .line 476
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 477
    .line 478
    .line 479
    if-eqz v4, :cond_1a

    .line 480
    .line 481
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v1

    .line 485
    check-cast v1, Ljava/util/List;

    .line 486
    .line 487
    if-eqz v1, :cond_19

    .line 488
    .line 489
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    :goto_c
    const/4 v6, 0x1

    .line 494
    goto :goto_d

    .line 495
    :cond_19
    const/4 v1, 0x0

    .line 496
    goto :goto_c

    .line 497
    :goto_d
    invoke-static {v7, v6}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    goto :goto_e

    .line 502
    :cond_1a
    const/4 v1, 0x0

    .line 503
    :goto_e
    new-instance v17, La/hf6;

    .line 504
    .line 505
    invoke-static {v12, v1}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 506
    .line 507
    .line 508
    move-result-object v20

    .line 509
    const-wide/16 v21, 0x0

    .line 510
    .line 511
    const/16 v23, 0x1

    .line 512
    .line 513
    const/16 v18, 0x0

    .line 514
    .line 515
    const/16 v19, 0x0

    .line 516
    .line 517
    invoke-direct/range {v17 .. v23}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 518
    .line 519
    .line 520
    move-object/from16 v6, v17

    .line 521
    .line 522
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    invoke-static {v12, v1}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 526
    .line 527
    .line 528
    move-result-object v6

    .line 529
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 530
    .line 531
    .line 532
    move-result-object v7

    .line 533
    const/4 v9, 0x0

    .line 534
    :goto_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 535
    .line 536
    .line 537
    move-result v10

    .line 538
    if-eqz v10, :cond_1f

    .line 539
    .line 540
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v10

    .line 544
    add-int/lit8 v18, v9, 0x1

    .line 545
    .line 546
    if-ltz v9, :cond_1e

    .line 547
    .line 548
    check-cast v10, Ljava/util/List;

    .line 549
    .line 550
    new-instance v9, Ljava/util/ArrayList;

    .line 551
    .line 552
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 553
    .line 554
    .line 555
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 556
    .line 557
    .line 558
    move-result-object v12

    .line 559
    const/4 v13, 0x0

    .line 560
    :goto_10
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 561
    .line 562
    .line 563
    move-result v14

    .line 564
    if-eqz v14, :cond_1d

    .line 565
    .line 566
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v14

    .line 570
    add-int/lit8 v15, v13, 0x1

    .line 571
    .line 572
    if-ltz v13, :cond_1c

    .line 573
    .line 574
    move-object/from16 v17, v14

    .line 575
    .line 576
    check-cast v17, Ljava/lang/Number;

    .line 577
    .line 578
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->longValue()J

    .line 579
    .line 580
    .line 581
    add-int/2addr v13, v1

    .line 582
    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 583
    .line 584
    .line 585
    move-result-object v13

    .line 586
    invoke-interface {v10, v13}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v13

    .line 590
    if-eqz v13, :cond_1b

    .line 591
    .line 592
    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    :cond_1b
    move v13, v15

    .line 596
    goto :goto_10

    .line 597
    :cond_1c
    invoke-static {}, La/q3d;->p()V

    .line 598
    .line 599
    .line 600
    throw v11

    .line 601
    :cond_1d
    new-instance v17, La/hf6;

    .line 602
    .line 603
    const-wide/16 v21, 0x0

    .line 604
    .line 605
    const/16 v23, 0x0

    .line 606
    .line 607
    move/from16 v19, v18

    .line 608
    .line 609
    move-object/from16 v20, v9

    .line 610
    .line 611
    invoke-direct/range {v17 .. v23}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 612
    .line 613
    .line 614
    move-object/from16 v9, v17

    .line 615
    .line 616
    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 617
    .line 618
    .line 619
    move/from16 v9, v18

    .line 620
    .line 621
    goto :goto_f

    .line 622
    :cond_1e
    invoke-static {}, La/q3d;->p()V

    .line 623
    .line 624
    .line 625
    throw v11

    .line 626
    :cond_1f
    if-gtz v1, :cond_22

    .line 627
    .line 628
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 629
    .line 630
    .line 631
    move-result v1

    .line 632
    if-eqz v1, :cond_20

    .line 633
    .line 634
    goto/16 :goto_5

    .line 635
    .line 636
    :cond_20
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 637
    .line 638
    .line 639
    move-result-object v1

    .line 640
    :cond_21
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 641
    .line 642
    .line 643
    move-result v6

    .line 644
    if-eqz v6, :cond_b

    .line 645
    .line 646
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v6

    .line 650
    check-cast v6, La/hf6;

    .line 651
    .line 652
    iget-object v6, v6, La/hf6;->c:Ljava/util/List;

    .line 653
    .line 654
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 655
    .line 656
    .line 657
    move-result v6

    .line 658
    const/4 v7, 0x1

    .line 659
    if-le v6, v7, :cond_21

    .line 660
    .line 661
    goto :goto_11

    .line 662
    :cond_22
    const/4 v7, 0x1

    .line 663
    :goto_11
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    check-cast v1, La/hf6;

    .line 668
    .line 669
    iget v6, v1, La/hf6;->a:I

    .line 670
    .line 671
    add-int/lit8 v13, v6, 0x1

    .line 672
    .line 673
    iget v1, v1, La/hf6;->b:I

    .line 674
    .line 675
    add-int/lit8 v14, v1, 0x1

    .line 676
    .line 677
    new-instance v12, La/hf6;

    .line 678
    .line 679
    sget-object v15, La/iun;->a:La/iun;

    .line 680
    .line 681
    const-wide/16 v16, 0x0

    .line 682
    .line 683
    const/16 v18, 0x0

    .line 684
    .line 685
    invoke-direct/range {v12 .. v18}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 686
    .line 687
    .line 688
    invoke-virtual {v0, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 689
    .line 690
    .line 691
    goto/16 :goto_5

    .line 692
    .line 693
    :goto_12
    invoke-virtual {v4, v0}, La/oif0;->I(Ljava/util/List;)V

    .line 694
    .line 695
    .line 696
    iput-object v11, v2, La/rit0;->i:La/q4f;

    .line 697
    .line 698
    iput-object v11, v2, La/rit0;->j:Ljava/util/List;

    .line 699
    .line 700
    iput-object v11, v2, La/rit0;->k:Ljava/util/ArrayList;

    .line 701
    .line 702
    iput-object v11, v2, La/rit0;->l:Ljava/util/List;

    .line 703
    .line 704
    iput-object v11, v2, La/rit0;->m:La/oif0;

    .line 705
    .line 706
    iput-boolean v1, v2, La/rit0;->n:Z

    .line 707
    .line 708
    iput v5, v2, La/rit0;->q:I

    .line 709
    .line 710
    invoke-virtual {v8, v2}, La/oif0;->G(La/zje;)Ljava/lang/Object;

    .line 711
    .line 712
    .line 713
    move-result-object v0

    .line 714
    if-ne v0, v3, :cond_23

    .line 715
    .line 716
    :goto_13
    return-object v3

    .line 717
    :cond_23
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 718
    .line 719
    return-object v0
.end method

.method public b(La/q4f;ZLa/zje;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/wit0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/wit0;

    .line 11
    .line 12
    iget v3, v2, La/wit0;->q:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/wit0;->q:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/wit0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/wit0;-><init>(La/vit0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/wit0;->o:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/wit0;->q:I

    .line 34
    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x3

    .line 37
    const/4 v7, 0x2

    .line 38
    const/16 v8, 0xa

    .line 39
    .line 40
    const/4 v9, 0x5

    .line 41
    const/4 v10, 0x1

    .line 42
    iget-object v11, v0, La/vit0;->e:La/oif0;

    .line 43
    .line 44
    const/4 v12, 0x0

    .line 45
    if-eqz v4, :cond_6

    .line 46
    .line 47
    if-eq v4, v10, :cond_5

    .line 48
    .line 49
    if-eq v4, v7, :cond_4

    .line 50
    .line 51
    if-eq v4, v6, :cond_3

    .line 52
    .line 53
    if-eq v4, v5, :cond_2

    .line 54
    .line 55
    if-ne v4, v9, :cond_1

    .line 56
    .line 57
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto/16 :goto_c

    .line 61
    .line 62
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 63
    .line 64
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    return-object v12

    .line 68
    :cond_2
    iget-boolean v0, v2, La/wit0;->n:Z

    .line 69
    .line 70
    iget-object v4, v2, La/wit0;->m:La/oif0;

    .line 71
    .line 72
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 73
    .line 74
    .line 75
    goto/16 :goto_6

    .line 76
    .line 77
    :cond_3
    iget-boolean v0, v2, La/wit0;->n:Z

    .line 78
    .line 79
    iget-object v4, v2, La/wit0;->m:La/oif0;

    .line 80
    .line 81
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    goto/16 :goto_8

    .line 85
    .line 86
    :cond_4
    iget-boolean v4, v2, La/wit0;->n:Z

    .line 87
    .line 88
    iget-object v7, v2, La/wit0;->l:Ljava/util/ArrayList;

    .line 89
    .line 90
    iget-object v10, v2, La/wit0;->k:Ljava/util/ArrayList;

    .line 91
    .line 92
    iget-object v13, v2, La/wit0;->i:La/q4f;

    .line 93
    .line 94
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object v14, v10

    .line 98
    goto/16 :goto_4

    .line 99
    .line 100
    :cond_5
    iget-boolean v4, v2, La/wit0;->n:Z

    .line 101
    .line 102
    iget-object v10, v2, La/wit0;->j:Ljava/util/List;

    .line 103
    .line 104
    iget-object v13, v2, La/wit0;->i:La/q4f;

    .line 105
    .line 106
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_6
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v11}, La/oif0;->n()Ljava/util/List;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    move-object/from16 v4, p1

    .line 118
    .line 119
    iput-object v4, v2, La/wit0;->i:La/q4f;

    .line 120
    .line 121
    iput-object v1, v2, La/wit0;->j:Ljava/util/List;

    .line 122
    .line 123
    move/from16 v13, p2

    .line 124
    .line 125
    iput-boolean v13, v2, La/wit0;->n:Z

    .line 126
    .line 127
    iput v10, v2, La/wit0;->q:I

    .line 128
    .line 129
    iget-object v10, v0, La/vit0;->d:La/chf0;

    .line 130
    .line 131
    invoke-virtual {v10, v2}, La/chf0;->p(La/yje;)Ljava/io/Serializable;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    if-ne v10, v3, :cond_7

    .line 136
    .line 137
    goto/16 :goto_b

    .line 138
    .line 139
    :cond_7
    move-object/from16 v23, v10

    .line 140
    .line 141
    move-object v10, v1

    .line 142
    move-object/from16 v1, v23

    .line 143
    .line 144
    move/from16 v23, v13

    .line 145
    .line 146
    move-object v13, v4

    .line 147
    move/from16 v4, v23

    .line 148
    .line 149
    :goto_1
    check-cast v1, Ljava/lang/Iterable;

    .line 150
    .line 151
    new-instance v14, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-static {v1, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 154
    .line 155
    .line 156
    move-result v15

    .line 157
    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v15

    .line 168
    if-eqz v15, :cond_8

    .line 169
    .line 170
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v15

    .line 174
    check-cast v15, La/qu6;

    .line 175
    .line 176
    iget-wide v5, v15, La/qu6;->a:J

    .line 177
    .line 178
    invoke-static {v5, v6, v14}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 179
    .line 180
    .line 181
    const/4 v5, 0x4

    .line 182
    const/4 v6, 0x3

    .line 183
    goto :goto_2

    .line 184
    :cond_8
    new-instance v1, Ljava/util/ArrayList;

    .line 185
    .line 186
    invoke-static {v10, v8}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 187
    .line 188
    .line 189
    move-result v5

    .line 190
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 191
    .line 192
    .line 193
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v5

    .line 197
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 198
    .line 199
    .line 200
    move-result v6

    .line 201
    if-eqz v6, :cond_9

    .line 202
    .line 203
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v6

    .line 207
    check-cast v6, La/hf6;

    .line 208
    .line 209
    iget-wide v8, v6, La/hf6;->d:D

    .line 210
    .line 211
    new-instance v6, Ljava/lang/Double;

    .line 212
    .line 213
    invoke-direct {v6, v8, v9}, Ljava/lang/Double;-><init>(D)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 217
    .line 218
    .line 219
    const/16 v8, 0xa

    .line 220
    .line 221
    const/4 v9, 0x5

    .line 222
    goto :goto_3

    .line 223
    :cond_9
    iput-object v13, v2, La/wit0;->i:La/q4f;

    .line 224
    .line 225
    iput-object v12, v2, La/wit0;->j:Ljava/util/List;

    .line 226
    .line 227
    iput-object v14, v2, La/wit0;->k:Ljava/util/ArrayList;

    .line 228
    .line 229
    iput-object v1, v2, La/wit0;->l:Ljava/util/ArrayList;

    .line 230
    .line 231
    iput-boolean v4, v2, La/wit0;->n:Z

    .line 232
    .line 233
    iput v7, v2, La/wit0;->q:I

    .line 234
    .line 235
    invoke-virtual {v11, v2}, La/oif0;->e(La/zje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    if-ne v5, v3, :cond_a

    .line 240
    .line 241
    goto/16 :goto_b

    .line 242
    .line 243
    :cond_a
    move-object v7, v1

    .line 244
    :goto_4
    invoke-virtual {v13}, Ljava/lang/Enum;->ordinal()I

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    const/4 v10, 0x5

    .line 249
    if-eq v1, v10, :cond_f

    .line 250
    .line 251
    const/4 v5, 0x6

    .line 252
    if-eq v1, v5, :cond_d

    .line 253
    .line 254
    const/16 v5, 0xb

    .line 255
    .line 256
    if-eq v1, v5, :cond_b

    .line 257
    .line 258
    sget-object v0, La/iun;->a:La/iun;

    .line 259
    .line 260
    :goto_5
    move v1, v4

    .line 261
    move-object v4, v11

    .line 262
    goto/16 :goto_a

    .line 263
    .line 264
    :cond_b
    iput-object v12, v2, La/wit0;->i:La/q4f;

    .line 265
    .line 266
    iput-object v12, v2, La/wit0;->j:Ljava/util/List;

    .line 267
    .line 268
    iput-object v12, v2, La/wit0;->k:Ljava/util/ArrayList;

    .line 269
    .line 270
    iput-object v12, v2, La/wit0;->l:Ljava/util/ArrayList;

    .line 271
    .line 272
    iput-object v11, v2, La/wit0;->m:La/oif0;

    .line 273
    .line 274
    iput-boolean v4, v2, La/wit0;->n:Z

    .line 275
    .line 276
    const/4 v1, 0x4

    .line 277
    iput v1, v2, La/wit0;->q:I

    .line 278
    .line 279
    invoke-virtual {v0, v14, v7, v4, v2}, La/vit0;->e(Ljava/util/List;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    if-ne v1, v3, :cond_c

    .line 284
    .line 285
    goto/16 :goto_b

    .line 286
    .line 287
    :cond_c
    move v0, v4

    .line 288
    move-object v4, v11

    .line 289
    :goto_6
    check-cast v1, Ljava/util/List;

    .line 290
    .line 291
    :goto_7
    move-object/from16 v23, v1

    .line 292
    .line 293
    move v1, v0

    .line 294
    move-object/from16 v0, v23

    .line 295
    .line 296
    goto/16 :goto_a

    .line 297
    .line 298
    :cond_d
    iput-object v12, v2, La/wit0;->i:La/q4f;

    .line 299
    .line 300
    iput-object v12, v2, La/wit0;->j:Ljava/util/List;

    .line 301
    .line 302
    iput-object v12, v2, La/wit0;->k:Ljava/util/ArrayList;

    .line 303
    .line 304
    iput-object v12, v2, La/wit0;->l:Ljava/util/ArrayList;

    .line 305
    .line 306
    iput-object v11, v2, La/wit0;->m:La/oif0;

    .line 307
    .line 308
    iput-boolean v4, v2, La/wit0;->n:Z

    .line 309
    .line 310
    const/4 v1, 0x3

    .line 311
    iput v1, v2, La/wit0;->q:I

    .line 312
    .line 313
    invoke-virtual {v0, v14, v7, v4, v2}, La/vit0;->c(Ljava/util/List;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    if-ne v1, v3, :cond_e

    .line 318
    .line 319
    goto/16 :goto_b

    .line 320
    .line 321
    :cond_e
    move v0, v4

    .line 322
    move-object v4, v11

    .line 323
    :goto_8
    check-cast v1, Ljava/util/List;

    .line 324
    .line 325
    goto :goto_7

    .line 326
    :cond_f
    new-instance v16, La/hf6;

    .line 327
    .line 328
    new-instance v19, Ljava/util/ArrayList;

    .line 329
    .line 330
    invoke-direct/range {v19 .. v19}, Ljava/util/ArrayList;-><init>()V

    .line 331
    .line 332
    .line 333
    const-wide/16 v20, 0x0

    .line 334
    .line 335
    const/16 v22, 0x1

    .line 336
    .line 337
    const/16 v17, 0x0

    .line 338
    .line 339
    const/16 v18, 0x0

    .line 340
    .line 341
    invoke-direct/range {v16 .. v22}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 342
    .line 343
    .line 344
    invoke-static/range {v16 .. v16}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 345
    .line 346
    .line 347
    move-result-object v0

    .line 348
    new-instance v1, Ljava/util/ArrayList;

    .line 349
    .line 350
    const/16 v15, 0xa

    .line 351
    .line 352
    invoke-static {v14, v15}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 353
    .line 354
    .line 355
    move-result v5

    .line 356
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 357
    .line 358
    .line 359
    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 360
    .line 361
    .line 362
    move-result-object v5

    .line 363
    const/4 v6, 0x0

    .line 364
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v7

    .line 368
    if-eqz v7, :cond_11

    .line 369
    .line 370
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v7

    .line 374
    add-int/lit8 v14, v6, 0x1

    .line 375
    .line 376
    if-ltz v6, :cond_10

    .line 377
    .line 378
    check-cast v7, Ljava/lang/Number;

    .line 379
    .line 380
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 381
    .line 382
    .line 383
    move-result-wide v6

    .line 384
    new-instance v13, La/hf6;

    .line 385
    .line 386
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 387
    .line 388
    .line 389
    move-result-object v6

    .line 390
    filled-new-array {v6}, [Ljava/lang/Long;

    .line 391
    .line 392
    .line 393
    move-result-object v6

    .line 394
    invoke-static {v6}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 395
    .line 396
    .line 397
    move-result-object v16

    .line 398
    const-wide/16 v17, 0x0

    .line 399
    .line 400
    const/16 v19, 0x0

    .line 401
    .line 402
    move v15, v14

    .line 403
    invoke-direct/range {v13 .. v19}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v1, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 407
    .line 408
    .line 409
    move v6, v14

    .line 410
    goto :goto_9

    .line 411
    :cond_10
    invoke-static {}, La/q3d;->p()V

    .line 412
    .line 413
    .line 414
    throw v12

    .line 415
    :cond_11
    invoke-static {v0, v1}, Lkotlin/collections/CollectionsKt;->q0(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    goto/16 :goto_5

    .line 420
    .line 421
    :goto_a
    invoke-virtual {v4, v0}, La/oif0;->I(Ljava/util/List;)V

    .line 422
    .line 423
    .line 424
    iput-object v12, v2, La/wit0;->i:La/q4f;

    .line 425
    .line 426
    iput-object v12, v2, La/wit0;->j:Ljava/util/List;

    .line 427
    .line 428
    iput-object v12, v2, La/wit0;->k:Ljava/util/ArrayList;

    .line 429
    .line 430
    iput-object v12, v2, La/wit0;->l:Ljava/util/ArrayList;

    .line 431
    .line 432
    iput-object v12, v2, La/wit0;->m:La/oif0;

    .line 433
    .line 434
    iput-boolean v1, v2, La/wit0;->n:Z

    .line 435
    .line 436
    const/4 v10, 0x5

    .line 437
    iput v10, v2, La/wit0;->q:I

    .line 438
    .line 439
    invoke-virtual {v11, v2}, La/oif0;->G(La/zje;)Ljava/lang/Object;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    if-ne v0, v3, :cond_12

    .line 444
    .line 445
    :goto_b
    return-object v3

    .line 446
    :cond_12
    :goto_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 447
    .line 448
    return-object v0
.end method

.method public c(Ljava/util/List;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/xit0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/xit0;

    .line 11
    .line 12
    iget v3, v2, La/xit0;->t:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/xit0;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/xit0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/xit0;-><init>(La/vit0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/xit0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/xit0;->t:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    iget v4, v2, La/xit0;->q:I

    .line 42
    .line 43
    iget v7, v2, La/xit0;->p:I

    .line 44
    .line 45
    iget v8, v2, La/xit0;->o:I

    .line 46
    .line 47
    iget-boolean v9, v2, La/xit0;->n:Z

    .line 48
    .line 49
    iget-object v10, v2, La/xit0;->m:Ljava/util/Collection;

    .line 50
    .line 51
    check-cast v10, Ljava/util/Collection;

    .line 52
    .line 53
    iget-object v11, v2, La/xit0;->l:Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object v12, v2, La/xit0;->k:Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object v13, v2, La/xit0;->j:Ljava/util/Collection;

    .line 58
    .line 59
    check-cast v13, Ljava/util/Collection;

    .line 60
    .line 61
    iget-object v14, v2, La/xit0;->i:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Ljava/util/ArrayList;

    .line 78
    .line 79
    const/16 v4, 0xa

    .line 80
    .line 81
    move-object/from16 v7, p1

    .line 82
    .line 83
    invoke-static {v7, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const/4 v7, 0x0

    .line 95
    move-object v10, v1

    .line 96
    move-object v12, v4

    .line 97
    move-object/from16 v1, p2

    .line 98
    .line 99
    move-object v4, v2

    .line 100
    move/from16 v2, p3

    .line 101
    .line 102
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_7

    .line 107
    .line 108
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    add-int/lit8 v9, v7, 0x1

    .line 113
    .line 114
    if-ltz v7, :cond_6

    .line 115
    .line 116
    check-cast v8, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v13

    .line 122
    new-instance v8, Ljava/lang/Long;

    .line 123
    .line 124
    invoke-direct {v8, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 125
    .line 126
    .line 127
    filled-new-array {v8}, [Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    if-nez v7, :cond_4

    .line 136
    .line 137
    if-eqz v2, :cond_4

    .line 138
    .line 139
    iput-object v1, v4, La/xit0;->i:Ljava/util/List;

    .line 140
    .line 141
    move-object v8, v10

    .line 142
    check-cast v8, Ljava/util/Collection;

    .line 143
    .line 144
    iput-object v8, v4, La/xit0;->j:Ljava/util/Collection;

    .line 145
    .line 146
    iput-object v12, v4, La/xit0;->k:Ljava/util/Iterator;

    .line 147
    .line 148
    iput-object v11, v4, La/xit0;->l:Ljava/util/ArrayList;

    .line 149
    .line 150
    iput-object v8, v4, La/xit0;->m:Ljava/util/Collection;

    .line 151
    .line 152
    iput-boolean v2, v4, La/xit0;->n:Z

    .line 153
    .line 154
    iput v9, v4, La/xit0;->o:I

    .line 155
    .line 156
    iput v9, v4, La/xit0;->p:I

    .line 157
    .line 158
    iput v7, v4, La/xit0;->q:I

    .line 159
    .line 160
    iput v6, v4, La/xit0;->t:I

    .line 161
    .line 162
    invoke-virtual {v0, v4}, La/vit0;->f(La/zje;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v8

    .line 166
    if-ne v8, v3, :cond_3

    .line 167
    .line 168
    return-object v3

    .line 169
    :cond_3
    move-object v14, v1

    .line 170
    move-object v1, v8

    .line 171
    move v8, v9

    .line 172
    move-object v13, v10

    .line 173
    move v9, v2

    .line 174
    move-object v2, v4

    .line 175
    move v4, v7

    .line 176
    move v7, v8

    .line 177
    :goto_2
    check-cast v1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 180
    .line 181
    .line 182
    move-result-wide v15

    .line 183
    move-object v1, v14

    .line 184
    move v14, v8

    .line 185
    move v8, v4

    .line 186
    move-object v4, v2

    .line 187
    move v2, v9

    .line 188
    move v9, v7

    .line 189
    move-wide/from16 v18, v15

    .line 190
    .line 191
    move-object v15, v10

    .line 192
    move-object/from16 v16, v13

    .line 193
    .line 194
    :goto_3
    move-object/from16 v17, v12

    .line 195
    .line 196
    move-object v10, v11

    .line 197
    move-wide/from16 v11, v18

    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_4
    if-ltz v7, :cond_5

    .line 201
    .line 202
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-ge v7, v8, :cond_5

    .line 207
    .line 208
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v8

    .line 212
    goto :goto_4

    .line 213
    :cond_5
    new-instance v8, Ljava/lang/Double;

    .line 214
    .line 215
    const-wide/16 v13, 0x0

    .line 216
    .line 217
    invoke-direct {v8, v13, v14}, Ljava/lang/Double;-><init>(D)V

    .line 218
    .line 219
    .line 220
    :goto_4
    check-cast v8, Ljava/lang/Number;

    .line 221
    .line 222
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    .line 223
    .line 224
    .line 225
    move-result-wide v15

    .line 226
    move v8, v7

    .line 227
    move v14, v9

    .line 228
    move-wide/from16 v18, v15

    .line 229
    .line 230
    move-object v15, v10

    .line 231
    move-object/from16 v16, v15

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :goto_5
    new-instance v7, La/hf6;

    .line 235
    .line 236
    const/4 v13, 0x0

    .line 237
    invoke-direct/range {v7 .. v13}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 238
    .line 239
    .line 240
    invoke-interface {v15, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move v7, v14

    .line 244
    move-object/from16 v10, v16

    .line 245
    .line 246
    move-object/from16 v12, v17

    .line 247
    .line 248
    goto/16 :goto_1

    .line 249
    .line 250
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 251
    .line 252
    .line 253
    throw v5

    .line 254
    :cond_7
    check-cast v10, Ljava/util/List;

    .line 255
    .line 256
    return-object v10
.end method

.method public d(Ljava/util/List;Ljava/util/List;La/zje;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/sit0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/sit0;

    .line 11
    .line 12
    iget v3, v2, La/sit0;->s:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/sit0;->s:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/sit0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/sit0;-><init>(La/vit0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/sit0;->q:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/sit0;->s:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x1

    .line 38
    if-eqz v4, :cond_2

    .line 39
    .line 40
    if-ne v4, v7, :cond_1

    .line 41
    .line 42
    iget v4, v2, La/sit0;->p:I

    .line 43
    .line 44
    iget v8, v2, La/sit0;->o:I

    .line 45
    .line 46
    iget v9, v2, La/sit0;->n:I

    .line 47
    .line 48
    iget-object v10, v2, La/sit0;->m:Ljava/util/ArrayList;

    .line 49
    .line 50
    iget-object v11, v2, La/sit0;->l:Ljava/util/List;

    .line 51
    .line 52
    iget-object v12, v2, La/sit0;->k:Ljava/util/Iterator;

    .line 53
    .line 54
    iget-object v13, v2, La/sit0;->j:Ljava/util/List;

    .line 55
    .line 56
    iget-object v14, v2, La/sit0;->i:Ljava/util/List;

    .line 57
    .line 58
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    move/from16 v16, v4

    .line 62
    .line 63
    move-object/from16 p3, v5

    .line 64
    .line 65
    move/from16 v17, v8

    .line 66
    .line 67
    move v4, v9

    .line 68
    :goto_1
    move-object/from16 v18, v10

    .line 69
    .line 70
    goto/16 :goto_4

    .line 71
    .line 72
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 73
    .line 74
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    :cond_2
    invoke-static {v1}, La/twn;->t(Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-interface/range {p2 .. p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    .line 84
    .line 85
    move-result-object v4

    .line 86
    move-object v11, v1

    .line 87
    move-object v12, v4

    .line 88
    move v4, v6

    .line 89
    move-object/from16 v1, p1

    .line 90
    .line 91
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_8

    .line 96
    .line 97
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v8

    .line 101
    add-int/lit8 v9, v4, 0x1

    .line 102
    .line 103
    if-ltz v4, :cond_7

    .line 104
    .line 105
    check-cast v8, Ljava/util/List;

    .line 106
    .line 107
    new-instance v10, Ljava/util/ArrayList;

    .line 108
    .line 109
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 110
    .line 111
    .line 112
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 113
    .line 114
    .line 115
    move-result-object v13

    .line 116
    move v14, v6

    .line 117
    :goto_3
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 118
    .line 119
    .line 120
    move-result v15

    .line 121
    if-eqz v15, :cond_5

    .line 122
    .line 123
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v15

    .line 127
    add-int/lit8 v16, v14, 0x1

    .line 128
    .line 129
    if-ltz v14, :cond_4

    .line 130
    .line 131
    move-object/from16 v17, v15

    .line 132
    .line 133
    check-cast v17, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Number;->longValue()J

    .line 136
    .line 137
    .line 138
    move-object/from16 p3, v5

    .line 139
    .line 140
    new-instance v5, Ljava/lang/Integer;

    .line 141
    .line 142
    invoke-direct {v5, v14}, Ljava/lang/Integer;-><init>(I)V

    .line 143
    .line 144
    .line 145
    invoke-interface {v8, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-eqz v5, :cond_3

    .line 150
    .line 151
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    :cond_3
    move-object/from16 v5, p3

    .line 155
    .line 156
    move/from16 v14, v16

    .line 157
    .line 158
    goto :goto_3

    .line 159
    :cond_4
    move-object/from16 p3, v5

    .line 160
    .line 161
    invoke-static {}, La/q3d;->p()V

    .line 162
    .line 163
    .line 164
    throw p3

    .line 165
    :cond_5
    move-object/from16 p3, v5

    .line 166
    .line 167
    iput-object v1, v2, La/sit0;->i:Ljava/util/List;

    .line 168
    .line 169
    iput-object v11, v2, La/sit0;->j:Ljava/util/List;

    .line 170
    .line 171
    iput-object v12, v2, La/sit0;->k:Ljava/util/Iterator;

    .line 172
    .line 173
    iput-object v11, v2, La/sit0;->l:Ljava/util/List;

    .line 174
    .line 175
    iput-object v10, v2, La/sit0;->m:Ljava/util/ArrayList;

    .line 176
    .line 177
    iput v9, v2, La/sit0;->n:I

    .line 178
    .line 179
    iput v9, v2, La/sit0;->o:I

    .line 180
    .line 181
    iput v4, v2, La/sit0;->p:I

    .line 182
    .line 183
    iput v7, v2, La/sit0;->s:I

    .line 184
    .line 185
    invoke-virtual {v0, v2}, La/vit0;->f(La/zje;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v5

    .line 189
    if-ne v5, v3, :cond_6

    .line 190
    .line 191
    return-object v3

    .line 192
    :cond_6
    move-object v14, v1

    .line 193
    move/from16 v16, v4

    .line 194
    .line 195
    move-object v1, v5

    .line 196
    move v4, v9

    .line 197
    move/from16 v17, v4

    .line 198
    .line 199
    move-object v13, v11

    .line 200
    goto/16 :goto_1

    .line 201
    .line 202
    :goto_4
    check-cast v1, Ljava/lang/Number;

    .line 203
    .line 204
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 205
    .line 206
    .line 207
    move-result-wide v19

    .line 208
    new-instance v15, La/hf6;

    .line 209
    .line 210
    const/16 v21, 0x0

    .line 211
    .line 212
    invoke-direct/range {v15 .. v21}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 213
    .line 214
    .line 215
    invoke-interface {v11, v15}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-object/from16 v5, p3

    .line 219
    .line 220
    move-object v11, v13

    .line 221
    move-object v1, v14

    .line 222
    goto/16 :goto_2

    .line 223
    .line 224
    :cond_7
    move-object/from16 p3, v5

    .line 225
    .line 226
    invoke-static {}, La/q3d;->p()V

    .line 227
    .line 228
    .line 229
    throw p3

    .line 230
    :cond_8
    return-object v11
.end method

.method public e(Ljava/util/List;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p4

    .line 4
    .line 5
    instance-of v2, v1, La/yit0;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/yit0;

    .line 11
    .line 12
    iget v3, v2, La/yit0;->t:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/yit0;->t:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/yit0;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/yit0;-><init>(La/vit0;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/yit0;->r:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/yit0;->t:I

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_2

    .line 38
    .line 39
    if-ne v4, v6, :cond_1

    .line 40
    .line 41
    iget v4, v2, La/yit0;->q:I

    .line 42
    .line 43
    iget v7, v2, La/yit0;->p:I

    .line 44
    .line 45
    iget v8, v2, La/yit0;->o:I

    .line 46
    .line 47
    iget-boolean v9, v2, La/yit0;->n:Z

    .line 48
    .line 49
    iget-object v10, v2, La/yit0;->m:Ljava/util/Collection;

    .line 50
    .line 51
    check-cast v10, Ljava/util/Collection;

    .line 52
    .line 53
    iget-object v11, v2, La/yit0;->l:Ljava/util/ArrayList;

    .line 54
    .line 55
    iget-object v12, v2, La/yit0;->k:Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object v13, v2, La/yit0;->j:Ljava/util/Collection;

    .line 58
    .line 59
    check-cast v13, Ljava/util/Collection;

    .line 60
    .line 61
    iget-object v14, v2, La/yit0;->i:Ljava/util/List;

    .line 62
    .line 63
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_2

    .line 67
    .line 68
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v5

    .line 74
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    new-instance v1, Ljava/util/ArrayList;

    .line 78
    .line 79
    const/16 v4, 0xa

    .line 80
    .line 81
    move-object/from16 v7, p1

    .line 82
    .line 83
    invoke-static {v7, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 88
    .line 89
    .line 90
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    const/4 v7, 0x0

    .line 95
    move-object v10, v1

    .line 96
    move-object v12, v4

    .line 97
    move-object/from16 v1, p2

    .line 98
    .line 99
    move-object v4, v2

    .line 100
    move/from16 v2, p3

    .line 101
    .line 102
    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v8

    .line 106
    if-eqz v8, :cond_7

    .line 107
    .line 108
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v8

    .line 112
    add-int/lit8 v9, v7, 0x1

    .line 113
    .line 114
    if-ltz v7, :cond_6

    .line 115
    .line 116
    check-cast v8, Ljava/lang/Number;

    .line 117
    .line 118
    invoke-virtual {v8}, Ljava/lang/Number;->longValue()J

    .line 119
    .line 120
    .line 121
    move-result-wide v13

    .line 122
    new-instance v8, Ljava/lang/Long;

    .line 123
    .line 124
    invoke-direct {v8, v13, v14}, Ljava/lang/Long;-><init>(J)V

    .line 125
    .line 126
    .line 127
    filled-new-array {v8}, [Ljava/lang/Long;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    invoke-static {v8}, La/q3d;->l([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 132
    .line 133
    .line 134
    move-result-object v11

    .line 135
    if-eqz v2, :cond_4

    .line 136
    .line 137
    iput-object v1, v4, La/yit0;->i:Ljava/util/List;

    .line 138
    .line 139
    move-object v8, v10

    .line 140
    check-cast v8, Ljava/util/Collection;

    .line 141
    .line 142
    iput-object v8, v4, La/yit0;->j:Ljava/util/Collection;

    .line 143
    .line 144
    iput-object v12, v4, La/yit0;->k:Ljava/util/Iterator;

    .line 145
    .line 146
    iput-object v11, v4, La/yit0;->l:Ljava/util/ArrayList;

    .line 147
    .line 148
    iput-object v8, v4, La/yit0;->m:Ljava/util/Collection;

    .line 149
    .line 150
    iput-boolean v2, v4, La/yit0;->n:Z

    .line 151
    .line 152
    iput v9, v4, La/yit0;->o:I

    .line 153
    .line 154
    iput v9, v4, La/yit0;->p:I

    .line 155
    .line 156
    iput v7, v4, La/yit0;->q:I

    .line 157
    .line 158
    iput v6, v4, La/yit0;->t:I

    .line 159
    .line 160
    invoke-virtual {v0, v4}, La/vit0;->f(La/zje;)Ljava/lang/Object;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    if-ne v8, v3, :cond_3

    .line 165
    .line 166
    return-object v3

    .line 167
    :cond_3
    move-object v14, v1

    .line 168
    move-object v1, v8

    .line 169
    move v8, v9

    .line 170
    move-object v13, v10

    .line 171
    move v9, v2

    .line 172
    move-object v2, v4

    .line 173
    move v4, v7

    .line 174
    move v7, v8

    .line 175
    :goto_2
    check-cast v1, Ljava/lang/Number;

    .line 176
    .line 177
    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    .line 178
    .line 179
    .line 180
    move-result-wide v15

    .line 181
    move-object v1, v14

    .line 182
    move v14, v8

    .line 183
    move v8, v4

    .line 184
    move-object v4, v2

    .line 185
    move v2, v9

    .line 186
    move v9, v7

    .line 187
    move-wide/from16 v18, v15

    .line 188
    .line 189
    move-object v15, v10

    .line 190
    move-object/from16 v16, v13

    .line 191
    .line 192
    :goto_3
    move-object/from16 v17, v12

    .line 193
    .line 194
    move-object v10, v11

    .line 195
    move-wide/from16 v11, v18

    .line 196
    .line 197
    goto :goto_5

    .line 198
    :cond_4
    if-ltz v7, :cond_5

    .line 199
    .line 200
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 201
    .line 202
    .line 203
    move-result v8

    .line 204
    if-ge v7, v8, :cond_5

    .line 205
    .line 206
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v8

    .line 210
    goto :goto_4

    .line 211
    :cond_5
    new-instance v8, Ljava/lang/Double;

    .line 212
    .line 213
    const-wide/16 v13, 0x0

    .line 214
    .line 215
    invoke-direct {v8, v13, v14}, Ljava/lang/Double;-><init>(D)V

    .line 216
    .line 217
    .line 218
    :goto_4
    check-cast v8, Ljava/lang/Number;

    .line 219
    .line 220
    invoke-virtual {v8}, Ljava/lang/Number;->doubleValue()D

    .line 221
    .line 222
    .line 223
    move-result-wide v15

    .line 224
    move v8, v7

    .line 225
    move v14, v9

    .line 226
    move-wide/from16 v18, v15

    .line 227
    .line 228
    move-object v15, v10

    .line 229
    move-object/from16 v16, v15

    .line 230
    .line 231
    goto :goto_3

    .line 232
    :goto_5
    new-instance v7, La/hf6;

    .line 233
    .line 234
    const/4 v13, 0x0

    .line 235
    invoke-direct/range {v7 .. v13}, La/hf6;-><init>(IILjava/util/List;DZ)V

    .line 236
    .line 237
    .line 238
    invoke-interface {v15, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 239
    .line 240
    .line 241
    move v7, v14

    .line 242
    move-object/from16 v10, v16

    .line 243
    .line 244
    move-object/from16 v12, v17

    .line 245
    .line 246
    goto/16 :goto_1

    .line 247
    .line 248
    :cond_6
    invoke-static {}, La/q3d;->p()V

    .line 249
    .line 250
    .line 251
    throw v5

    .line 252
    :cond_7
    check-cast v10, Ljava/util/List;

    .line 253
    .line 254
    return-object v10
.end method

.method public final f(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/vit0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/vit0;->c:La/xre;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/high16 v4, -0x80000000

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    iget-object v6, p0, La/vit0;->f:La/etj;

    .line 12
    .line 13
    iget-object v7, p0, La/vit0;->b:La/g45;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v7, La/g45;->c:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/ave;

    .line 21
    .line 22
    instance-of v7, p1, La/zit0;

    .line 23
    .line 24
    if-eqz v7, :cond_0

    .line 25
    .line 26
    move-object v7, p1

    .line 27
    check-cast v7, La/zit0;

    .line 28
    .line 29
    iget v8, v7, La/zit0;->k:I

    .line 30
    .line 31
    and-int v9, v8, v4

    .line 32
    .line 33
    if-eqz v9, :cond_0

    .line 34
    .line 35
    sub-int/2addr v8, v4

    .line 36
    iput v8, v7, La/zit0;->k:I

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v7, La/zit0;

    .line 40
    .line 41
    invoke-direct {v7, p0, p1}, La/zit0;-><init>(La/vit0;La/zje;)V

    .line 42
    .line 43
    .line 44
    :goto_0
    iget-object p0, v7, La/zit0;->i:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object p1, La/wne;->a:La/wne;

    .line 47
    .line 48
    iget v4, v7, La/zit0;->k:I

    .line 49
    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    if-ne v4, v5, :cond_1

    .line 53
    .line 54
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object p0, v6, La/etj;->a:La/ali;

    .line 66
    .line 67
    invoke-virtual {p0}, La/ali;->m()Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_5

    .line 72
    .line 73
    iget-object p0, v1, La/xre;->a:La/ave;

    .line 74
    .line 75
    iget-object p0, p0, La/ave;->c:La/ql5;

    .line 76
    .line 77
    if-eqz p0, :cond_4

    .line 78
    .line 79
    iput v5, v7, La/zit0;->k:I

    .line 80
    .line 81
    invoke-virtual {v6, p0, v7}, La/etj;->a(La/ql5;La/yje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p0

    .line 85
    if-ne p0, p1, :cond_3

    .line 86
    .line 87
    move-object v2, p1

    .line 88
    goto :goto_3

    .line 89
    :cond_3
    :goto_1
    check-cast p0, La/c3j0;

    .line 90
    .line 91
    iget-wide p0, p0, La/c3j0;->b:D

    .line 92
    .line 93
    goto :goto_2

    .line 94
    :cond_4
    iget-wide p0, v0, La/ave;->e:D

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_5
    iget-wide p0, v0, La/ave;->e:D

    .line 98
    .line 99
    :goto_2
    new-instance v2, Ljava/lang/Double;

    .line 100
    .line 101
    invoke-direct {v2, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 102
    .line 103
    .line 104
    :goto_3
    return-object v2

    .line 105
    :pswitch_0
    iget-object v0, v7, La/g45;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/ave;

    .line 108
    .line 109
    instance-of v7, p1, La/tit0;

    .line 110
    .line 111
    if-eqz v7, :cond_6

    .line 112
    .line 113
    move-object v7, p1

    .line 114
    check-cast v7, La/tit0;

    .line 115
    .line 116
    iget v8, v7, La/tit0;->k:I

    .line 117
    .line 118
    and-int v9, v8, v4

    .line 119
    .line 120
    if-eqz v9, :cond_6

    .line 121
    .line 122
    sub-int/2addr v8, v4

    .line 123
    iput v8, v7, La/tit0;->k:I

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_6
    new-instance v7, La/tit0;

    .line 127
    .line 128
    invoke-direct {v7, p0, p1}, La/tit0;-><init>(La/vit0;La/zje;)V

    .line 129
    .line 130
    .line 131
    :goto_4
    iget-object p0, v7, La/tit0;->i:Ljava/lang/Object;

    .line 132
    .line 133
    sget-object p1, La/wne;->a:La/wne;

    .line 134
    .line 135
    iget v4, v7, La/tit0;->k:I

    .line 136
    .line 137
    if-eqz v4, :cond_8

    .line 138
    .line 139
    if-ne v4, v5, :cond_7

    .line 140
    .line 141
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    goto :goto_5

    .line 145
    :cond_7
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto :goto_7

    .line 149
    :cond_8
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object p0, v6, La/etj;->a:La/ali;

    .line 153
    .line 154
    invoke-virtual {p0}, La/ali;->m()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    if-eqz p0, :cond_b

    .line 159
    .line 160
    iget-object p0, v1, La/xre;->a:La/ave;

    .line 161
    .line 162
    iget-object p0, p0, La/ave;->c:La/ql5;

    .line 163
    .line 164
    if-eqz p0, :cond_a

    .line 165
    .line 166
    iput v5, v7, La/tit0;->k:I

    .line 167
    .line 168
    invoke-virtual {v6, p0, v7}, La/etj;->a(La/ql5;La/yje;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    if-ne p0, p1, :cond_9

    .line 173
    .line 174
    move-object v2, p1

    .line 175
    goto :goto_7

    .line 176
    :cond_9
    :goto_5
    check-cast p0, La/c3j0;

    .line 177
    .line 178
    iget-wide p0, p0, La/c3j0;->b:D

    .line 179
    .line 180
    goto :goto_6

    .line 181
    :cond_a
    iget-wide p0, v0, La/ave;->e:D

    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_b
    iget-wide p0, v0, La/ave;->e:D

    .line 185
    .line 186
    :goto_6
    new-instance v2, Ljava/lang/Double;

    .line 187
    .line 188
    invoke-direct {v2, p0, p1}, Ljava/lang/Double;-><init>(D)V

    .line 189
    .line 190
    .line 191
    :goto_7
    return-object v2

    .line 192
    nop

    .line 193
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public g(La/q4f;La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-object v0, p0, La/vit0;->b:La/g45;

    .line 2
    .line 3
    iget-object v1, v0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ave;

    .line 6
    .line 7
    instance-of v2, p2, La/ajt0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p2

    .line 12
    check-cast v2, La/ajt0;

    .line 13
    .line 14
    iget v3, v2, La/ajt0;->m:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/ajt0;->m:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/ajt0;

    .line 27
    .line 28
    invoke-direct {v2, p0, p2}, La/ajt0;-><init>(La/vit0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p2, v2, La/ajt0;->k:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/ajt0;->m:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v7, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    iget p0, v2, La/ajt0;->j:I

    .line 57
    .line 58
    iget-object p1, v2, La/ajt0;->i:La/q4f;

    .line 59
    .line 60
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p2, v1, La/ave;->a:La/q4f;

    .line 68
    .line 69
    if-eq p2, p1, :cond_4

    .line 70
    .line 71
    move p2, v7

    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 p2, 0x0

    .line 74
    :goto_1
    invoke-virtual {v0, p1}, La/g45;->g0(La/q4f;)V

    .line 75
    .line 76
    .line 77
    iput-object p1, v2, La/ajt0;->i:La/q4f;

    .line 78
    .line 79
    iput p2, v2, La/ajt0;->j:I

    .line 80
    .line 81
    iput v7, v2, La/ajt0;->m:I

    .line 82
    .line 83
    invoke-virtual {p0, p1, p2, v2}, La/vit0;->b(La/q4f;ZLa/zje;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    if-ne p0, v3, :cond_5

    .line 88
    .line 89
    goto :goto_3

    .line 90
    :cond_5
    move p0, p2

    .line 91
    :goto_2
    sget-object p2, La/q4f;->d:La/q4f;

    .line 92
    .line 93
    if-eq p1, p2, :cond_6

    .line 94
    .line 95
    const-wide/16 v7, 0x0

    .line 96
    .line 97
    invoke-virtual {v0, v7, v8}, La/g45;->h0(J)V

    .line 98
    .line 99
    .line 100
    :cond_6
    if-eqz p0, :cond_8

    .line 101
    .line 102
    iget-object p2, v1, La/ave;->n:Ljava/util/ArrayList;

    .line 103
    .line 104
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 105
    .line 106
    .line 107
    iput-object v6, v2, La/ajt0;->i:La/q4f;

    .line 108
    .line 109
    iput p0, v2, La/ajt0;->j:I

    .line 110
    .line 111
    iput v5, v2, La/ajt0;->m:I

    .line 112
    .line 113
    invoke-virtual {v0, p1, v2}, La/g45;->W(La/q4f;La/zje;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-ne p0, v3, :cond_7

    .line 118
    .line 119
    :goto_3
    return-object v3

    .line 120
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 121
    .line 122
    return-object p0

    .line 123
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 124
    .line 125
    return-object p0
.end method

.method public h(La/q4f;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, La/vit0;->b:La/g45;

    .line 2
    .line 3
    iget-object v1, v0, La/g45;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/ave;

    .line 6
    .line 7
    instance-of v2, p4, La/uit0;

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    move-object v2, p4

    .line 12
    check-cast v2, La/uit0;

    .line 13
    .line 14
    iget v3, v2, La/uit0;->n:I

    .line 15
    .line 16
    const/high16 v4, -0x80000000

    .line 17
    .line 18
    and-int v5, v3, v4

    .line 19
    .line 20
    if-eqz v5, :cond_0

    .line 21
    .line 22
    sub-int/2addr v3, v4

    .line 23
    iput v3, v2, La/uit0;->n:I

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    new-instance v2, La/uit0;

    .line 27
    .line 28
    invoke-direct {v2, p0, p4}, La/uit0;-><init>(La/vit0;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object p4, v2, La/uit0;->l:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v2, La/uit0;->n:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x1

    .line 39
    const/4 v7, 0x0

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    if-eq v4, v6, :cond_2

    .line 43
    .line 44
    if-ne v4, v5, :cond_1

    .line 45
    .line 46
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    goto :goto_4

    .line 50
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v7

    .line 56
    :cond_2
    iget p0, v2, La/uit0;->k:I

    .line 57
    .line 58
    iget-boolean p3, v2, La/uit0;->j:Z

    .line 59
    .line 60
    iget-object p1, v2, La/uit0;->i:La/q4f;

    .line 61
    .line 62
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {p4}, La/z1x;->P(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    iget-object p4, v1, La/ave;->a:La/q4f;

    .line 70
    .line 71
    if-eq p4, p1, :cond_4

    .line 72
    .line 73
    move p4, v6

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    const/4 p4, 0x0

    .line 76
    :goto_1
    invoke-virtual {v0, p1}, La/g45;->g0(La/q4f;)V

    .line 77
    .line 78
    .line 79
    iput-object p1, v2, La/uit0;->i:La/q4f;

    .line 80
    .line 81
    iput-boolean p3, v2, La/uit0;->j:Z

    .line 82
    .line 83
    iput p4, v2, La/uit0;->k:I

    .line 84
    .line 85
    iput v6, v2, La/uit0;->n:I

    .line 86
    .line 87
    invoke-virtual {p0, p1, p2, p3, v2}, La/vit0;->a(La/q4f;Ljava/util/List;ZLa/zje;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    if-ne p0, v3, :cond_5

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_5
    move p0, p4

    .line 95
    :goto_2
    sget-object p2, La/q4f;->d:La/q4f;

    .line 96
    .line 97
    if-eq p1, p2, :cond_6

    .line 98
    .line 99
    const-wide/16 v8, 0x0

    .line 100
    .line 101
    invoke-virtual {v0, v8, v9}, La/g45;->h0(J)V

    .line 102
    .line 103
    .line 104
    :cond_6
    if-eqz p0, :cond_8

    .line 105
    .line 106
    iget-object p2, v1, La/ave;->n:Ljava/util/ArrayList;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/util/ArrayList;->clear()V

    .line 109
    .line 110
    .line 111
    iput-object v7, v2, La/uit0;->i:La/q4f;

    .line 112
    .line 113
    iput-boolean p3, v2, La/uit0;->j:Z

    .line 114
    .line 115
    iput p0, v2, La/uit0;->k:I

    .line 116
    .line 117
    iput v5, v2, La/uit0;->n:I

    .line 118
    .line 119
    invoke-virtual {v0, p1, v2}, La/g45;->W(La/q4f;La/zje;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    if-ne p0, v3, :cond_7

    .line 124
    .line 125
    :goto_3
    return-object v3

    .line 126
    :cond_7
    :goto_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 130
    .line 131
    return-object p0
.end method
