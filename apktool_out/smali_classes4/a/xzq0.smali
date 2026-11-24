.class public final La/xzq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/kmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kmq;

.field public final synthetic c:La/cyu;

.field public final synthetic d:La/hie0;

.field public final synthetic e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

.field public final synthetic f:Ljava/util/List;


# direct methods
.method public synthetic constructor <init>(La/kmq;La/cyu;La/hie0;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;B)V
    .locals 0

    .line 1
    iput-byte p6, p0, La/xzq0;->a:B

    iput-object p1, p0, La/xzq0;->b:La/kmq;

    iput-object p2, p0, La/xzq0;->c:La/cyu;

    iput-object p3, p0, La/xzq0;->d:La/hie0;

    iput-object p4, p0, La/xzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    iput-object p5, p0, La/xzq0;->f:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    iget-byte v2, v0, La/xzq0;->a:B

    .line 6
    .line 7
    iget-object v3, v0, La/xzq0;->f:Ljava/util/List;

    .line 8
    .line 9
    iget-object v4, v0, La/xzq0;->e:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 10
    .line 11
    const/4 v5, 0x0

    .line 12
    const/16 v6, 0xa

    .line 13
    .line 14
    iget-object v7, v0, La/xzq0;->b:La/kmq;

    .line 15
    .line 16
    const-string v8, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    iget-object v9, v0, La/xzq0;->c:La/cyu;

    .line 19
    .line 20
    const/high16 v10, -0x80000000

    .line 21
    .line 22
    const/4 v11, 0x1

    .line 23
    const/4 v12, 0x2

    .line 24
    iget-object v13, v0, La/xzq0;->d:La/hie0;

    .line 25
    .line 26
    packed-switch v2, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    instance-of v2, v1, La/d0r0;

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    move-object v2, v1

    .line 34
    check-cast v2, La/d0r0;

    .line 35
    .line 36
    iget v15, v2, La/d0r0;->j:I

    .line 37
    .line 38
    and-int v16, v15, v10

    .line 39
    .line 40
    if-eqz v16, :cond_0

    .line 41
    .line 42
    sub-int/2addr v15, v10

    .line 43
    iput v15, v2, La/d0r0;->j:I

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    new-instance v2, La/d0r0;

    .line 47
    .line 48
    invoke-direct {v2, v0, v1}, La/d0r0;-><init>(La/xzq0;La/yje;)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object v0, v2, La/d0r0;->i:Ljava/lang/Object;

    .line 52
    .line 53
    sget-object v1, La/wne;->a:La/wne;

    .line 54
    .line 55
    iget v10, v2, La/d0r0;->j:I

    .line 56
    .line 57
    if-eqz v10, :cond_3

    .line 58
    .line 59
    if-eq v10, v11, :cond_2

    .line 60
    .line 61
    if-ne v10, v12, :cond_1

    .line 62
    .line 63
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    goto/16 :goto_5

    .line 67
    .line 68
    :cond_1
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    const/4 v14, 0x0

    .line 72
    goto/16 :goto_6

    .line 73
    .line 74
    :cond_2
    iget-object v6, v2, La/d0r0;->n:Ljava/util/ArrayList;

    .line 75
    .line 76
    iget-object v7, v2, La/d0r0;->m:Ljava/util/List;

    .line 77
    .line 78
    iget-object v8, v2, La/d0r0;->l:La/kmq;

    .line 79
    .line 80
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    check-cast v0, La/j0g0;

    .line 84
    .line 85
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_3
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    move-object/from16 v0, p1

    .line 92
    .line 93
    check-cast v0, Ljava/util/List;

    .line 94
    .line 95
    new-instance v8, Ljava/util/ArrayList;

    .line 96
    .line 97
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v10

    .line 112
    if-eqz v10, :cond_4

    .line 113
    .line 114
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v10

    .line 118
    check-cast v10, La/nyg;

    .line 119
    .line 120
    iget-wide v14, v10, La/nyg;->g:J

    .line 121
    .line 122
    invoke-static {v14, v15, v8}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 123
    .line 124
    .line 125
    goto :goto_1

    .line 126
    :cond_4
    iget-boolean v6, v13, La/hie0;->a:Z

    .line 127
    .line 128
    iput-object v7, v2, La/d0r0;->l:La/kmq;

    .line 129
    .line 130
    iput-object v0, v2, La/d0r0;->m:Ljava/util/List;

    .line 131
    .line 132
    iput-object v8, v2, La/d0r0;->n:Ljava/util/ArrayList;

    .line 133
    .line 134
    iput v11, v2, La/d0r0;->j:I

    .line 135
    .line 136
    invoke-virtual {v9, v6, v8, v2}, La/cyu;->j(ZLjava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 137
    .line 138
    .line 139
    move-result-object v6

    .line 140
    if-ne v6, v1, :cond_5

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_5
    move-object/from16 v17, v7

    .line 144
    .line 145
    move-object v7, v0

    .line 146
    move-object v0, v6

    .line 147
    move-object v6, v8

    .line 148
    move-object/from16 v8, v17

    .line 149
    .line 150
    :goto_2
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    if-nez v10, :cond_6

    .line 155
    .line 156
    goto :goto_3

    .line 157
    :cond_6
    iput-boolean v5, v13, La/hie0;->a:Z

    .line 158
    .line 159
    iget-object v0, v9, La/cyu;->c:Ljava/lang/Object;

    .line 160
    .line 161
    check-cast v0, La/n660;

    .line 162
    .line 163
    invoke-virtual {v0, v6}, La/n660;->o(Ljava/util/List;)Ljava/util/ArrayList;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :goto_3
    check-cast v0, Ljava/util/List;

    .line 168
    .line 169
    invoke-static {v7, v0, v4, v3}, La/cyu;->Q(Ljava/util/List;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;)Ljava/util/List;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    const/4 v3, 0x0

    .line 174
    iput-object v3, v2, La/d0r0;->l:La/kmq;

    .line 175
    .line 176
    iput-object v3, v2, La/d0r0;->m:Ljava/util/List;

    .line 177
    .line 178
    iput-object v3, v2, La/d0r0;->n:Ljava/util/ArrayList;

    .line 179
    .line 180
    iput v12, v2, La/d0r0;->j:I

    .line 181
    .line 182
    invoke-interface {v8, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    if-ne v0, v1, :cond_7

    .line 187
    .line 188
    :goto_4
    move-object v14, v1

    .line 189
    goto :goto_6

    .line 190
    :cond_7
    :goto_5
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    :goto_6
    return-object v14

    .line 193
    :pswitch_0
    instance-of v2, v1, La/b0r0;

    .line 194
    .line 195
    if-eqz v2, :cond_8

    .line 196
    .line 197
    move-object v2, v1

    .line 198
    check-cast v2, La/b0r0;

    .line 199
    .line 200
    iget v14, v2, La/b0r0;->j:I

    .line 201
    .line 202
    and-int v15, v14, v10

    .line 203
    .line 204
    if-eqz v15, :cond_8

    .line 205
    .line 206
    sub-int/2addr v14, v10

    .line 207
    iput v14, v2, La/b0r0;->j:I

    .line 208
    .line 209
    goto :goto_7

    .line 210
    :cond_8
    new-instance v2, La/b0r0;

    .line 211
    .line 212
    invoke-direct {v2, v0, v1}, La/b0r0;-><init>(La/xzq0;La/yje;)V

    .line 213
    .line 214
    .line 215
    :goto_7
    iget-object v0, v2, La/b0r0;->i:Ljava/lang/Object;

    .line 216
    .line 217
    sget-object v1, La/wne;->a:La/wne;

    .line 218
    .line 219
    iget v10, v2, La/b0r0;->j:I

    .line 220
    .line 221
    if-eqz v10, :cond_b

    .line 222
    .line 223
    if-eq v10, v11, :cond_a

    .line 224
    .line 225
    if-ne v10, v12, :cond_9

    .line 226
    .line 227
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 228
    .line 229
    .line 230
    goto/16 :goto_c

    .line 231
    .line 232
    :cond_9
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    goto/16 :goto_d

    .line 237
    .line 238
    :cond_a
    iget-object v6, v2, La/b0r0;->n:Ljava/util/ArrayList;

    .line 239
    .line 240
    iget-object v7, v2, La/b0r0;->m:Ljava/util/List;

    .line 241
    .line 242
    iget-object v8, v2, La/b0r0;->l:La/kmq;

    .line 243
    .line 244
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    check-cast v0, La/j0g0;

    .line 248
    .line 249
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 250
    .line 251
    goto :goto_9

    .line 252
    :cond_b
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    move-object/from16 v0, p1

    .line 256
    .line 257
    check-cast v0, Ljava/util/List;

    .line 258
    .line 259
    new-instance v8, Ljava/util/ArrayList;

    .line 260
    .line 261
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 262
    .line 263
    .line 264
    move-result v6

    .line 265
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 266
    .line 267
    .line 268
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 269
    .line 270
    .line 271
    move-result-object v6

    .line 272
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 273
    .line 274
    .line 275
    move-result v10

    .line 276
    if-eqz v10, :cond_c

    .line 277
    .line 278
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    move-result-object v10

    .line 282
    check-cast v10, La/nyg;

    .line 283
    .line 284
    iget-wide v14, v10, La/nyg;->g:J

    .line 285
    .line 286
    invoke-static {v14, v15, v8}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 287
    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_c
    iget-boolean v6, v13, La/hie0;->a:Z

    .line 291
    .line 292
    iput-object v7, v2, La/b0r0;->l:La/kmq;

    .line 293
    .line 294
    iput-object v0, v2, La/b0r0;->m:Ljava/util/List;

    .line 295
    .line 296
    iput-object v8, v2, La/b0r0;->n:Ljava/util/ArrayList;

    .line 297
    .line 298
    iput v11, v2, La/b0r0;->j:I

    .line 299
    .line 300
    invoke-virtual {v9, v6, v8, v2}, La/cyu;->j(ZLjava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v6

    .line 304
    if-ne v6, v1, :cond_d

    .line 305
    .line 306
    goto :goto_b

    .line 307
    :cond_d
    move-object/from16 v17, v7

    .line 308
    .line 309
    move-object v7, v0

    .line 310
    move-object v0, v6

    .line 311
    move-object v6, v8

    .line 312
    move-object/from16 v8, v17

    .line 313
    .line 314
    :goto_9
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 315
    .line 316
    .line 317
    move-result-object v10

    .line 318
    if-nez v10, :cond_e

    .line 319
    .line 320
    goto :goto_a

    .line 321
    :cond_e
    iput-boolean v5, v13, La/hie0;->a:Z

    .line 322
    .line 323
    iget-object v0, v9, La/cyu;->c:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v0, La/n660;

    .line 326
    .line 327
    invoke-virtual {v0, v6}, La/n660;->o(Ljava/util/List;)Ljava/util/ArrayList;

    .line 328
    .line 329
    .line 330
    move-result-object v0

    .line 331
    :goto_a
    check-cast v0, Ljava/util/List;

    .line 332
    .line 333
    invoke-static {v7, v0, v4, v3}, La/cyu;->Q(Ljava/util/List;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;)Ljava/util/List;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    const/4 v3, 0x0

    .line 338
    iput-object v3, v2, La/b0r0;->l:La/kmq;

    .line 339
    .line 340
    iput-object v3, v2, La/b0r0;->m:Ljava/util/List;

    .line 341
    .line 342
    iput-object v3, v2, La/b0r0;->n:Ljava/util/ArrayList;

    .line 343
    .line 344
    iput v12, v2, La/b0r0;->j:I

    .line 345
    .line 346
    invoke-interface {v8, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    if-ne v0, v1, :cond_f

    .line 351
    .line 352
    :goto_b
    move-object v14, v1

    .line 353
    goto :goto_d

    .line 354
    :cond_f
    :goto_c
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 355
    .line 356
    :goto_d
    return-object v14

    .line 357
    :pswitch_1
    instance-of v2, v1, La/wzq0;

    .line 358
    .line 359
    if-eqz v2, :cond_10

    .line 360
    .line 361
    move-object v2, v1

    .line 362
    check-cast v2, La/wzq0;

    .line 363
    .line 364
    iget v14, v2, La/wzq0;->j:I

    .line 365
    .line 366
    and-int v15, v14, v10

    .line 367
    .line 368
    if-eqz v15, :cond_10

    .line 369
    .line 370
    sub-int/2addr v14, v10

    .line 371
    iput v14, v2, La/wzq0;->j:I

    .line 372
    .line 373
    goto :goto_e

    .line 374
    :cond_10
    new-instance v2, La/wzq0;

    .line 375
    .line 376
    invoke-direct {v2, v0, v1}, La/wzq0;-><init>(La/xzq0;La/yje;)V

    .line 377
    .line 378
    .line 379
    :goto_e
    iget-object v0, v2, La/wzq0;->i:Ljava/lang/Object;

    .line 380
    .line 381
    sget-object v1, La/wne;->a:La/wne;

    .line 382
    .line 383
    iget v10, v2, La/wzq0;->j:I

    .line 384
    .line 385
    if-eqz v10, :cond_13

    .line 386
    .line 387
    if-eq v10, v11, :cond_12

    .line 388
    .line 389
    if-ne v10, v12, :cond_11

    .line 390
    .line 391
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 392
    .line 393
    .line 394
    goto/16 :goto_13

    .line 395
    .line 396
    :cond_11
    invoke-static {v8}, La/jf4;->n(Ljava/lang/String;)V

    .line 397
    .line 398
    .line 399
    const/4 v14, 0x0

    .line 400
    goto/16 :goto_14

    .line 401
    .line 402
    :cond_12
    iget-object v6, v2, La/wzq0;->n:Ljava/util/ArrayList;

    .line 403
    .line 404
    iget-object v7, v2, La/wzq0;->m:Ljava/util/List;

    .line 405
    .line 406
    iget-object v8, v2, La/wzq0;->l:La/kmq;

    .line 407
    .line 408
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    check-cast v0, La/j0g0;

    .line 412
    .line 413
    iget-object v0, v0, La/j0g0;->a:Ljava/lang/Object;

    .line 414
    .line 415
    goto :goto_10

    .line 416
    :cond_13
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 417
    .line 418
    .line 419
    move-object/from16 v0, p1

    .line 420
    .line 421
    check-cast v0, Ljava/util/List;

    .line 422
    .line 423
    new-instance v8, Ljava/util/ArrayList;

    .line 424
    .line 425
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    invoke-direct {v8, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 430
    .line 431
    .line 432
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v6

    .line 436
    :goto_f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v10

    .line 440
    if-eqz v10, :cond_14

    .line 441
    .line 442
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v10

    .line 446
    check-cast v10, La/nyg;

    .line 447
    .line 448
    iget-wide v14, v10, La/nyg;->g:J

    .line 449
    .line 450
    invoke-static {v14, v15, v8}, La/axq;->t(JLjava/util/ArrayList;)V

    .line 451
    .line 452
    .line 453
    goto :goto_f

    .line 454
    :cond_14
    iget-boolean v6, v13, La/hie0;->a:Z

    .line 455
    .line 456
    iput-object v7, v2, La/wzq0;->l:La/kmq;

    .line 457
    .line 458
    iput-object v0, v2, La/wzq0;->m:Ljava/util/List;

    .line 459
    .line 460
    iput-object v8, v2, La/wzq0;->n:Ljava/util/ArrayList;

    .line 461
    .line 462
    iput v11, v2, La/wzq0;->j:I

    .line 463
    .line 464
    invoke-virtual {v9, v6, v8, v2}, La/cyu;->j(ZLjava/util/ArrayList;La/zje;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v6

    .line 468
    if-ne v6, v1, :cond_15

    .line 469
    .line 470
    goto :goto_12

    .line 471
    :cond_15
    move-object/from16 v17, v7

    .line 472
    .line 473
    move-object v7, v0

    .line 474
    move-object v0, v6

    .line 475
    move-object v6, v8

    .line 476
    move-object/from16 v8, v17

    .line 477
    .line 478
    :goto_10
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 479
    .line 480
    .line 481
    move-result-object v10

    .line 482
    if-nez v10, :cond_16

    .line 483
    .line 484
    goto :goto_11

    .line 485
    :cond_16
    iput-boolean v5, v13, La/hie0;->a:Z

    .line 486
    .line 487
    iget-object v0, v9, La/cyu;->c:Ljava/lang/Object;

    .line 488
    .line 489
    check-cast v0, La/n660;

    .line 490
    .line 491
    invoke-virtual {v0, v6}, La/n660;->o(Ljava/util/List;)Ljava/util/ArrayList;

    .line 492
    .line 493
    .line 494
    move-result-object v0

    .line 495
    :goto_11
    check-cast v0, Ljava/util/List;

    .line 496
    .line 497
    invoke-static {v7, v0, v4, v3}, La/cyu;->Q(Ljava/util/List;Ljava/util/List;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Ljava/util/List;)Ljava/util/List;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    const/4 v3, 0x0

    .line 502
    iput-object v3, v2, La/wzq0;->l:La/kmq;

    .line 503
    .line 504
    iput-object v3, v2, La/wzq0;->m:Ljava/util/List;

    .line 505
    .line 506
    iput-object v3, v2, La/wzq0;->n:Ljava/util/ArrayList;

    .line 507
    .line 508
    iput v12, v2, La/wzq0;->j:I

    .line 509
    .line 510
    invoke-interface {v8, v0, v2}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v0

    .line 514
    if-ne v0, v1, :cond_17

    .line 515
    .line 516
    :goto_12
    move-object v14, v1

    .line 517
    goto :goto_14

    .line 518
    :cond_17
    :goto_13
    sget-object v14, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 519
    .line 520
    :goto_14
    return-object v14

    .line 521
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
