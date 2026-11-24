.class public final synthetic La/mur0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nyq0;

.field public final synthetic c:La/vhv0;

.field public final synthetic d:J

.field public final synthetic e:Lkotlin/jvm/functions/Function0;

.field public final synthetic f:La/ugd;

.field public final synthetic g:La/ugd;

.field public final synthetic h:La/ugd;

.field public final synthetic i:La/ugd;

.field public final synthetic j:La/ugd;


# direct methods
.method public synthetic constructor <init>(La/nyq0;La/vhv0;JLkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/ugd;La/ugd;La/ugd;I)V
    .locals 0

    .line 2
    const/4 p11, 0x1

    iput-byte p11, p0, La/mur0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mur0;->b:La/nyq0;

    iput-object p2, p0, La/mur0;->c:La/vhv0;

    iput-wide p3, p0, La/mur0;->d:J

    iput-object p5, p0, La/mur0;->e:Lkotlin/jvm/functions/Function0;

    iput-object p6, p0, La/mur0;->f:La/ugd;

    iput-object p7, p0, La/mur0;->g:La/ugd;

    iput-object p8, p0, La/mur0;->h:La/ugd;

    iput-object p9, p0, La/mur0;->i:La/ugd;

    iput-object p10, p0, La/mur0;->j:La/ugd;

    return-void
.end method

.method public synthetic constructor <init>(La/ugd;La/ugd;La/ugd;Lkotlin/jvm/functions/Function0;JLa/nyq0;La/ugd;La/vhv0;La/ugd;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/mur0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mur0;->f:La/ugd;

    iput-object p2, p0, La/mur0;->g:La/ugd;

    iput-object p3, p0, La/mur0;->h:La/ugd;

    iput-object p4, p0, La/mur0;->e:Lkotlin/jvm/functions/Function0;

    iput-wide p5, p0, La/mur0;->d:J

    iput-object p7, p0, La/mur0;->b:La/nyq0;

    iput-object p8, p0, La/mur0;->i:La/ugd;

    iput-object p9, p0, La/mur0;->c:La/vhv0;

    iput-object p10, p0, La/mur0;->j:La/ugd;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/mur0;->a:B

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    move-object/from16 v12, p1

    .line 9
    .line 10
    check-cast v12, La/fet;

    .line 11
    .line 12
    move-object/from16 v1, p2

    .line 13
    .line 14
    check-cast v1, Ljava/lang/Integer;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-static {v1}, La/x8x;->L(I)I

    .line 21
    .line 22
    .line 23
    move-result v13

    .line 24
    iget-object v2, v0, La/mur0;->b:La/nyq0;

    .line 25
    .line 26
    iget-object v3, v0, La/mur0;->c:La/vhv0;

    .line 27
    .line 28
    iget-wide v4, v0, La/mur0;->d:J

    .line 29
    .line 30
    iget-object v6, v0, La/mur0;->e:Lkotlin/jvm/functions/Function0;

    .line 31
    .line 32
    iget-object v7, v0, La/mur0;->f:La/ugd;

    .line 33
    .line 34
    iget-object v8, v0, La/mur0;->g:La/ugd;

    .line 35
    .line 36
    iget-object v9, v0, La/mur0;->h:La/ugd;

    .line 37
    .line 38
    iget-object v10, v0, La/mur0;->i:La/ugd;

    .line 39
    .line 40
    iget-object v11, v0, La/mur0;->j:La/ugd;

    .line 41
    .line 42
    invoke-static/range {v2 .. v13}, La/zcm0;->e(La/nyq0;La/vhv0;JLkotlin/jvm/functions/Function0;La/ugd;La/ugd;La/ugd;La/ugd;La/ugd;La/fet;I)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v2, p1

    .line 49
    .line 50
    check-cast v2, La/c5n0;

    .line 51
    .line 52
    move-object/from16 v1, p2

    .line 53
    .line 54
    check-cast v1, La/p4e;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    iget-wide v3, v1, La/p4e;->a:J

    .line 60
    .line 61
    invoke-static {v3, v4}, La/p4e;->i(J)I

    .line 62
    .line 63
    .line 64
    move-result v8

    .line 65
    iget-wide v3, v1, La/p4e;->a:J

    .line 66
    .line 67
    invoke-static {v3, v4}, La/p4e;->h(J)I

    .line 68
    .line 69
    .line 70
    move-result v18

    .line 71
    iget-wide v9, v1, La/p4e;->a:J

    .line 72
    .line 73
    const/4 v14, 0x0

    .line 74
    const/16 v15, 0xa

    .line 75
    .line 76
    const/4 v11, 0x0

    .line 77
    const/4 v12, 0x0

    .line 78
    const/4 v13, 0x0

    .line 79
    invoke-static/range {v9 .. v15}, La/p4e;->b(JIIIII)J

    .line 80
    .line 81
    .line 82
    move-result-wide v20

    .line 83
    sget-object v1, La/h1h0;->a:La/h1h0;

    .line 84
    .line 85
    iget-object v3, v0, La/mur0;->f:La/ugd;

    .line 86
    .line 87
    invoke-interface {v2, v1, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    new-instance v15, Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    invoke-direct {v15, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 101
    .line 102
    .line 103
    move-result v3

    .line 104
    move v4, v12

    .line 105
    :goto_0
    const/16 v24, 0x1

    .line 106
    .line 107
    if-ge v4, v3, :cond_0

    .line 108
    .line 109
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    move-object/from16 v19, v5

    .line 114
    .line 115
    check-cast v19, La/pj30;

    .line 116
    .line 117
    move/from16 v23, v4

    .line 118
    .line 119
    move-object/from16 v22, v15

    .line 120
    .line 121
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    goto :goto_0

    .line 126
    :cond_0
    move/from16 v4, v24

    .line 127
    .line 128
    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    if-eqz v1, :cond_1

    .line 133
    .line 134
    const/4 v1, 0x0

    .line 135
    goto :goto_2

    .line 136
    :cond_1
    invoke-virtual {v15, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    move-object v3, v1

    .line 141
    check-cast v3, La/pu90;

    .line 142
    .line 143
    iget v3, v3, La/pu90;->b:I

    .line 144
    .line 145
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    sub-int/2addr v5, v4

    .line 150
    if-gt v4, v5, :cond_3

    .line 151
    .line 152
    move v6, v4

    .line 153
    :goto_1
    invoke-virtual {v15, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v7

    .line 157
    move-object v9, v7

    .line 158
    check-cast v9, La/pu90;

    .line 159
    .line 160
    iget v9, v9, La/pu90;->b:I

    .line 161
    .line 162
    if-ge v3, v9, :cond_2

    .line 163
    .line 164
    move-object v1, v7

    .line 165
    move v3, v9

    .line 166
    :cond_2
    if-eq v6, v5, :cond_3

    .line 167
    .line 168
    add-int/lit8 v6, v6, 0x1

    .line 169
    .line 170
    goto :goto_1

    .line 171
    :cond_3
    :goto_2
    check-cast v1, La/pu90;

    .line 172
    .line 173
    if-eqz v1, :cond_4

    .line 174
    .line 175
    iget v1, v1, La/pu90;->b:I

    .line 176
    .line 177
    move/from16 v17, v1

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_4
    move/from16 v17, v12

    .line 181
    .line 182
    :goto_3
    sget-object v1, La/h1h0;->c:La/h1h0;

    .line 183
    .line 184
    iget-object v3, v0, La/mur0;->g:La/ugd;

    .line 185
    .line 186
    invoke-interface {v2, v1, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 187
    .line 188
    .line 189
    move-result-object v1

    .line 190
    new-instance v11, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    invoke-direct {v11, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 197
    .line 198
    .line 199
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 200
    .line 201
    .line 202
    move-result v3

    .line 203
    move v5, v12

    .line 204
    :goto_4
    if-ge v5, v3, :cond_5

    .line 205
    .line 206
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v6

    .line 210
    move-object/from16 v19, v6

    .line 211
    .line 212
    check-cast v19, La/pj30;

    .line 213
    .line 214
    move/from16 v24, v4

    .line 215
    .line 216
    move/from16 v23, v5

    .line 217
    .line 218
    move-object/from16 v22, v11

    .line 219
    .line 220
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 221
    .line 222
    .line 223
    move-result v5

    .line 224
    goto :goto_4

    .line 225
    :cond_5
    move-object v14, v11

    .line 226
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 227
    .line 228
    .line 229
    move-result v1

    .line 230
    if-eqz v1, :cond_6

    .line 231
    .line 232
    const/4 v1, 0x0

    .line 233
    goto :goto_6

    .line 234
    :cond_6
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    move-object v3, v1

    .line 239
    check-cast v3, La/pu90;

    .line 240
    .line 241
    iget v3, v3, La/pu90;->b:I

    .line 242
    .line 243
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 244
    .line 245
    .line 246
    move-result v5

    .line 247
    sub-int/2addr v5, v4

    .line 248
    if-gt v4, v5, :cond_8

    .line 249
    .line 250
    move v6, v4

    .line 251
    :goto_5
    invoke-virtual {v14, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v7

    .line 255
    move-object v9, v7

    .line 256
    check-cast v9, La/pu90;

    .line 257
    .line 258
    iget v9, v9, La/pu90;->b:I

    .line 259
    .line 260
    if-ge v3, v9, :cond_7

    .line 261
    .line 262
    move-object v1, v7

    .line 263
    move v3, v9

    .line 264
    :cond_7
    if-eq v6, v5, :cond_8

    .line 265
    .line 266
    add-int/lit8 v6, v6, 0x1

    .line 267
    .line 268
    goto :goto_5

    .line 269
    :cond_8
    :goto_6
    check-cast v1, La/pu90;

    .line 270
    .line 271
    if-eqz v1, :cond_9

    .line 272
    .line 273
    iget v1, v1, La/pu90;->b:I

    .line 274
    .line 275
    goto :goto_7

    .line 276
    :cond_9
    move v1, v12

    .line 277
    :goto_7
    sget-object v3, La/h1h0;->b:La/h1h0;

    .line 278
    .line 279
    iget-object v5, v0, La/mur0;->h:La/ugd;

    .line 280
    .line 281
    invoke-interface {v2, v3, v5}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 282
    .line 283
    .line 284
    move-result-object v3

    .line 285
    new-instance v5, Ljava/util/ArrayList;

    .line 286
    .line 287
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 288
    .line 289
    .line 290
    move-result v6

    .line 291
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 292
    .line 293
    .line 294
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 295
    .line 296
    .line 297
    move-result v6

    .line 298
    move v7, v12

    .line 299
    :goto_8
    if-ge v7, v6, :cond_b

    .line 300
    .line 301
    invoke-interface {v3, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 302
    .line 303
    .line 304
    move-result-object v9

    .line 305
    move-object/from16 v22, v9

    .line 306
    .line 307
    check-cast v22, La/pj30;

    .line 308
    .line 309
    add-int v9, v1, v17

    .line 310
    .line 311
    sget-object v10, La/qmk;->a:La/zcl;

    .line 312
    .line 313
    const/high16 v10, 0x41f00000    # 30.0f

    .line 314
    .line 315
    invoke-interface {v2, v10}, La/w6k;->w0(F)F

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    float-to-int v10, v10

    .line 320
    add-int/2addr v9, v10

    .line 321
    if-ltz v9, :cond_a

    .line 322
    .line 323
    goto :goto_9

    .line 324
    :cond_a
    const-string v10, "height must be >= 0"

    .line 325
    .line 326
    invoke-static {v10}, La/zcx;->a(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    :goto_9
    const v10, 0x7fffffff

    .line 330
    .line 331
    .line 332
    invoke-static {v12, v10, v9, v9}, La/r4e;->h(IIII)J

    .line 333
    .line 334
    .line 335
    move-result-wide v9

    .line 336
    move-object/from16 v25, v5

    .line 337
    .line 338
    move-wide/from16 v28, v9

    .line 339
    .line 340
    move v9, v6

    .line 341
    move-wide/from16 v5, v28

    .line 342
    .line 343
    const/4 v10, 0x0

    .line 344
    const/16 v11, 0xd

    .line 345
    .line 346
    move/from16 v26, v7

    .line 347
    .line 348
    const/4 v7, 0x0

    .line 349
    move/from16 v16, v9

    .line 350
    .line 351
    const/4 v9, 0x0

    .line 352
    invoke-static/range {v5 .. v11}, La/p4e;->b(JIIIII)J

    .line 353
    .line 354
    .line 355
    move-result-wide v23

    .line 356
    move/from16 v27, v4

    .line 357
    .line 358
    invoke-static/range {v22 .. v27}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 359
    .line 360
    .line 361
    move-result v7

    .line 362
    move/from16 v6, v16

    .line 363
    .line 364
    move-object/from16 v5, v25

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_b
    move v9, v4

    .line 368
    move-object v10, v5

    .line 369
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 370
    .line 371
    .line 372
    move-result v3

    .line 373
    if-eqz v3, :cond_c

    .line 374
    .line 375
    const/4 v3, 0x0

    .line 376
    goto :goto_b

    .line 377
    :cond_c
    invoke-virtual {v10, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    move-object v4, v3

    .line 382
    check-cast v4, La/pu90;

    .line 383
    .line 384
    iget v4, v4, La/pu90;->b:I

    .line 385
    .line 386
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 387
    .line 388
    .line 389
    move-result v5

    .line 390
    sub-int/2addr v5, v9

    .line 391
    if-gt v9, v5, :cond_e

    .line 392
    .line 393
    move v6, v9

    .line 394
    :goto_a
    invoke-virtual {v10, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v7

    .line 398
    move-object v11, v7

    .line 399
    check-cast v11, La/pu90;

    .line 400
    .line 401
    iget v11, v11, La/pu90;->b:I

    .line 402
    .line 403
    if-ge v4, v11, :cond_d

    .line 404
    .line 405
    move-object v3, v7

    .line 406
    move v4, v11

    .line 407
    :cond_d
    if-eq v6, v5, :cond_e

    .line 408
    .line 409
    add-int/lit8 v6, v6, 0x1

    .line 410
    .line 411
    goto :goto_a

    .line 412
    :cond_e
    :goto_b
    check-cast v3, La/pu90;

    .line 413
    .line 414
    if-eqz v3, :cond_f

    .line 415
    .line 416
    iget v3, v3, La/pu90;->b:I

    .line 417
    .line 418
    goto :goto_c

    .line 419
    :cond_f
    move v3, v12

    .line 420
    :goto_c
    sget-object v7, La/h1h0;->e:La/h1h0;

    .line 421
    .line 422
    move v4, v1

    .line 423
    new-instance v1, La/xhh;

    .line 424
    .line 425
    move v5, v4

    .line 426
    iget-object v4, v0, La/mur0;->e:Lkotlin/jvm/functions/Function0;

    .line 427
    .line 428
    move v11, v5

    .line 429
    iget-wide v5, v0, La/mur0;->d:J

    .line 430
    .line 431
    invoke-direct/range {v1 .. v6}, La/xhh;-><init>(La/c5n0;ILkotlin/jvm/functions/Function0;J)V

    .line 432
    .line 433
    .line 434
    new-instance v3, La/ugd;

    .line 435
    .line 436
    const v4, 0x72330ef6

    .line 437
    .line 438
    .line 439
    invoke-direct {v3, v4, v9, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 440
    .line 441
    .line 442
    invoke-interface {v2, v7, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    new-instance v3, Ljava/util/ArrayList;

    .line 447
    .line 448
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 449
    .line 450
    .line 451
    move-result v4

    .line 452
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 453
    .line 454
    .line 455
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 456
    .line 457
    .line 458
    move-result v4

    .line 459
    move v5, v12

    .line 460
    :goto_d
    if-ge v5, v4, :cond_10

    .line 461
    .line 462
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v6

    .line 466
    move-object/from16 v19, v6

    .line 467
    .line 468
    check-cast v19, La/pj30;

    .line 469
    .line 470
    move-object/from16 v22, v3

    .line 471
    .line 472
    move/from16 v23, v5

    .line 473
    .line 474
    move/from16 v24, v9

    .line 475
    .line 476
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 477
    .line 478
    .line 479
    move-result v5

    .line 480
    goto :goto_d

    .line 481
    :cond_10
    move-object v7, v3

    .line 482
    sget-object v1, La/h1h0;->d:La/h1h0;

    .line 483
    .line 484
    new-instance v3, La/nur0;

    .line 485
    .line 486
    iget-object v4, v0, La/mur0;->b:La/nyq0;

    .line 487
    .line 488
    invoke-direct {v3, v4, v2, v11, v12}, La/nur0;-><init>(Ljava/lang/Object;Ljava/lang/Object;IB)V

    .line 489
    .line 490
    .line 491
    new-instance v4, La/ugd;

    .line 492
    .line 493
    const v5, -0x68e43f74

    .line 494
    .line 495
    .line 496
    invoke-direct {v4, v5, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    invoke-interface {v2, v1, v4}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 500
    .line 501
    .line 502
    move-result-object v1

    .line 503
    new-instance v3, Ljava/util/ArrayList;

    .line 504
    .line 505
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 506
    .line 507
    .line 508
    move-result v4

    .line 509
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 510
    .line 511
    .line 512
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 513
    .line 514
    .line 515
    move-result v4

    .line 516
    move v5, v12

    .line 517
    :goto_e
    if-ge v5, v4, :cond_11

    .line 518
    .line 519
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 520
    .line 521
    .line 522
    move-result-object v6

    .line 523
    move-object/from16 v19, v6

    .line 524
    .line 525
    check-cast v19, La/pj30;

    .line 526
    .line 527
    move-object/from16 v22, v3

    .line 528
    .line 529
    move/from16 v23, v5

    .line 530
    .line 531
    move/from16 v24, v9

    .line 532
    .line 533
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 534
    .line 535
    .line 536
    move-result v5

    .line 537
    move-object v11, v14

    .line 538
    goto :goto_e

    .line 539
    :cond_11
    move-object v11, v14

    .line 540
    move-object v14, v3

    .line 541
    invoke-virtual {v14}, Ljava/util/ArrayList;->isEmpty()Z

    .line 542
    .line 543
    .line 544
    move-result v1

    .line 545
    if-eqz v1, :cond_12

    .line 546
    .line 547
    const/4 v1, 0x0

    .line 548
    goto :goto_10

    .line 549
    :cond_12
    invoke-virtual {v14, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 550
    .line 551
    .line 552
    move-result-object v1

    .line 553
    move-object v3, v1

    .line 554
    check-cast v3, La/pu90;

    .line 555
    .line 556
    iget v3, v3, La/pu90;->b:I

    .line 557
    .line 558
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    .line 559
    .line 560
    .line 561
    move-result v4

    .line 562
    sub-int/2addr v4, v9

    .line 563
    if-gt v9, v4, :cond_14

    .line 564
    .line 565
    move v5, v9

    .line 566
    :goto_f
    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 567
    .line 568
    .line 569
    move-result-object v6

    .line 570
    move-object v13, v6

    .line 571
    check-cast v13, La/pu90;

    .line 572
    .line 573
    iget v13, v13, La/pu90;->b:I

    .line 574
    .line 575
    if-ge v3, v13, :cond_13

    .line 576
    .line 577
    move-object v1, v6

    .line 578
    move v3, v13

    .line 579
    :cond_13
    if-eq v5, v4, :cond_14

    .line 580
    .line 581
    add-int/lit8 v5, v5, 0x1

    .line 582
    .line 583
    goto :goto_f

    .line 584
    :cond_14
    :goto_10
    check-cast v1, La/pu90;

    .line 585
    .line 586
    if-eqz v1, :cond_15

    .line 587
    .line 588
    iget v1, v1, La/pu90;->b:I

    .line 589
    .line 590
    move v5, v1

    .line 591
    goto :goto_11

    .line 592
    :cond_15
    move v5, v12

    .line 593
    :goto_11
    sget-object v1, La/h1h0;->g:La/h1h0;

    .line 594
    .line 595
    new-instance v3, La/kqj0;

    .line 596
    .line 597
    const/4 v4, 0x4

    .line 598
    iget-object v6, v0, La/mur0;->i:La/ugd;

    .line 599
    .line 600
    invoke-direct {v3, v6, v4}, La/kqj0;-><init>(La/ugd;B)V

    .line 601
    .line 602
    .line 603
    new-instance v4, La/ugd;

    .line 604
    .line 605
    const v6, 0x1fe8e79a

    .line 606
    .line 607
    .line 608
    invoke-direct {v4, v6, v9, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 609
    .line 610
    .line 611
    invoke-interface {v2, v1, v4}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    new-instance v3, Ljava/util/ArrayList;

    .line 616
    .line 617
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 618
    .line 619
    .line 620
    move-result v4

    .line 621
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 622
    .line 623
    .line 624
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 625
    .line 626
    .line 627
    move-result v4

    .line 628
    move v6, v12

    .line 629
    :goto_12
    if-ge v6, v4, :cond_16

    .line 630
    .line 631
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v13

    .line 635
    move-object/from16 v19, v13

    .line 636
    .line 637
    check-cast v19, La/pj30;

    .line 638
    .line 639
    move-object/from16 v22, v3

    .line 640
    .line 641
    move/from16 v23, v6

    .line 642
    .line 643
    move/from16 v24, v9

    .line 644
    .line 645
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 646
    .line 647
    .line 648
    move-result v6

    .line 649
    goto :goto_12

    .line 650
    :cond_16
    move-object v13, v3

    .line 651
    invoke-virtual {v13}, Ljava/util/ArrayList;->isEmpty()Z

    .line 652
    .line 653
    .line 654
    move-result v1

    .line 655
    if-eqz v1, :cond_17

    .line 656
    .line 657
    const/4 v1, 0x0

    .line 658
    goto :goto_14

    .line 659
    :cond_17
    invoke-virtual {v13, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 660
    .line 661
    .line 662
    move-result-object v1

    .line 663
    move-object v3, v1

    .line 664
    check-cast v3, La/pu90;

    .line 665
    .line 666
    iget v3, v3, La/pu90;->b:I

    .line 667
    .line 668
    invoke-virtual {v13}, Ljava/util/ArrayList;->size()I

    .line 669
    .line 670
    .line 671
    move-result v4

    .line 672
    sub-int/2addr v4, v9

    .line 673
    if-gt v9, v4, :cond_19

    .line 674
    .line 675
    move v6, v9

    .line 676
    :goto_13
    invoke-virtual {v13, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 677
    .line 678
    .line 679
    move-result-object v16

    .line 680
    move-object/from16 v12, v16

    .line 681
    .line 682
    check-cast v12, La/pu90;

    .line 683
    .line 684
    iget v12, v12, La/pu90;->b:I

    .line 685
    .line 686
    if-ge v3, v12, :cond_18

    .line 687
    .line 688
    move v3, v12

    .line 689
    move-object/from16 v1, v16

    .line 690
    .line 691
    :cond_18
    if-eq v6, v4, :cond_19

    .line 692
    .line 693
    add-int/lit8 v6, v6, 0x1

    .line 694
    .line 695
    const/4 v12, 0x0

    .line 696
    goto :goto_13

    .line 697
    :cond_19
    :goto_14
    check-cast v1, La/pu90;

    .line 698
    .line 699
    if-eqz v1, :cond_1a

    .line 700
    .line 701
    iget v1, v1, La/pu90;->b:I

    .line 702
    .line 703
    move v12, v1

    .line 704
    goto :goto_15

    .line 705
    :cond_1a
    const/4 v12, 0x0

    .line 706
    :goto_15
    sget-object v1, La/h1h0;->f:La/h1h0;

    .line 707
    .line 708
    move-object v3, v1

    .line 709
    new-instance v1, La/vo6;

    .line 710
    .line 711
    move-object v4, v3

    .line 712
    move-object v3, v2

    .line 713
    iget-object v2, v0, La/mur0;->c:La/vhv0;

    .line 714
    .line 715
    iget-object v6, v0, La/mur0;->j:La/ugd;

    .line 716
    .line 717
    move-object v0, v4

    .line 718
    move/from16 v4, v17

    .line 719
    .line 720
    invoke-direct/range {v1 .. v6}, La/vo6;-><init>(La/vhv0;La/c5n0;IILa/ugd;)V

    .line 721
    .line 722
    .line 723
    move-object v2, v3

    .line 724
    new-instance v3, La/ugd;

    .line 725
    .line 726
    const v4, -0x826f0d5

    .line 727
    .line 728
    .line 729
    invoke-direct {v3, v4, v9, v1}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 730
    .line 731
    .line 732
    invoke-interface {v2, v0, v3}, La/c5n0;->k(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;

    .line 733
    .line 734
    .line 735
    move-result-object v0

    .line 736
    new-instance v1, Ljava/util/ArrayList;

    .line 737
    .line 738
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 739
    .line 740
    .line 741
    move-result v3

    .line 742
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 743
    .line 744
    .line 745
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 746
    .line 747
    .line 748
    move-result v3

    .line 749
    const/4 v4, 0x0

    .line 750
    :goto_16
    if-ge v4, v3, :cond_1b

    .line 751
    .line 752
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 753
    .line 754
    .line 755
    move-result-object v5

    .line 756
    move-object/from16 v19, v5

    .line 757
    .line 758
    check-cast v19, La/pj30;

    .line 759
    .line 760
    move-object/from16 v22, v1

    .line 761
    .line 762
    move/from16 v23, v4

    .line 763
    .line 764
    move/from16 v24, v9

    .line 765
    .line 766
    invoke-static/range {v19 .. v24}, La/w6x;->e(La/pj30;JLjava/util/ArrayList;II)I

    .line 767
    .line 768
    .line 769
    move-result v4

    .line 770
    goto :goto_16

    .line 771
    :cond_1b
    move-object/from16 v22, v1

    .line 772
    .line 773
    new-instance v9, La/our0;

    .line 774
    .line 775
    move/from16 v19, v12

    .line 776
    .line 777
    move-object/from16 v16, v13

    .line 778
    .line 779
    move-object/from16 v13, v22

    .line 780
    .line 781
    move-object v12, v7

    .line 782
    invoke-direct/range {v9 .. v19}, La/our0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;III)V

    .line 783
    .line 784
    .line 785
    move/from16 v0, v18

    .line 786
    .line 787
    invoke-static {v2, v8, v0, v9}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    return-object v0

    .line 792
    nop

    .line 793
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
