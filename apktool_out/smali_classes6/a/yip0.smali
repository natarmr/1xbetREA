.class public final synthetic La/yip0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/e9q0;La/i83;La/u23;)V
    .locals 0

    .line 1
    const/16 p1, 0xa

    iput-byte p1, p0, La/yip0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/yip0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/yip0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/xs10;Ljava/util/ArrayList;Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;)V
    .locals 0

    .line 2
    const/4 p3, 0x5

    iput-byte p3, p0, La/yip0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/yip0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/yip0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 3
    iput-byte p3, p0, La/yip0;->a:B

    iput-object p1, p0, La/yip0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/yip0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 41

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/yip0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const-string v3, ""

    .line 7
    .line 8
    const/4 v9, 0x0

    .line 9
    const/4 v10, 0x1

    .line 10
    iget-object v11, v0, La/yip0;->c:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v0, v0, La/yip0;->b:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v0, La/x1;

    .line 18
    .line 19
    check-cast v11, La/sgu0;

    .line 20
    .line 21
    invoke-virtual {v0, v11}, Landroid/view/View;->removeOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 22
    .line 23
    .line 24
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object v0

    .line 27
    :pswitch_0
    check-cast v0, La/ej1;

    .line 28
    .line 29
    iget-object v1, v0, La/ej1;->e:La/n0o0;

    .line 30
    .line 31
    iget-object v2, v0, La/ej1;->p:La/n0o0;

    .line 32
    .line 33
    iget-object v4, v0, La/ej1;->o:La/n0o0;

    .line 34
    .line 35
    iget-object v7, v0, La/ej1;->n:La/n0o0;

    .line 36
    .line 37
    iget-object v9, v0, La/ej1;->m:La/n0o0;

    .line 38
    .line 39
    iget-object v10, v0, La/ej1;->l:La/n0o0;

    .line 40
    .line 41
    iget-object v12, v0, La/ej1;->k:La/n0o0;

    .line 42
    .line 43
    iget-object v13, v0, La/ej1;->j:La/n0o0;

    .line 44
    .line 45
    iget-object v14, v0, La/ej1;->i:La/n0o0;

    .line 46
    .line 47
    iget-object v15, v0, La/ej1;->g:La/n0o0;

    .line 48
    .line 49
    iget-object v8, v0, La/ej1;->f:La/n0o0;

    .line 50
    .line 51
    const-wide/16 v17, 0x0

    .line 52
    .line 53
    iget-object v5, v0, La/ej1;->h:La/n0o0;

    .line 54
    .line 55
    check-cast v11, La/cdt0;

    .line 56
    .line 57
    iget-object v6, v0, La/ej1;->c:La/n0o0;

    .line 58
    .line 59
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    check-cast v6, La/fee;

    .line 64
    .line 65
    move-object/from16 p0, v1

    .line 66
    .line 67
    iget-object v1, v11, La/cdt0;->c:La/xbt0;

    .line 68
    .line 69
    invoke-virtual {v6, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, La/ej1;->d:La/n0o0;

    .line 73
    .line 74
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    check-cast v6, La/fee;

    .line 79
    .line 80
    move-object/from16 v19, v0

    .line 81
    .line 82
    if-eqz v1, :cond_1

    .line 83
    .line 84
    iget-object v0, v1, La/xbt0;->b:Ljava/lang/Object;

    .line 85
    .line 86
    move-object/from16 v20, v2

    .line 87
    .line 88
    new-instance v2, La/fcg;

    .line 89
    .line 90
    move-object/from16 v21, v4

    .line 91
    .line 92
    sget-object v4, La/iun;->a:La/iun;

    .line 93
    .line 94
    invoke-direct {v2, v4, v3}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    sget-object v4, La/j0g0;->b:La/e0g0;

    .line 98
    .line 99
    instance-of v4, v0, La/g0g0;

    .line 100
    .line 101
    if-eqz v4, :cond_0

    .line 102
    .line 103
    move-object v0, v2

    .line 104
    :cond_0
    check-cast v0, La/fcg;

    .line 105
    .line 106
    goto :goto_0

    .line 107
    :cond_1
    move-object/from16 v20, v2

    .line 108
    .line 109
    move-object/from16 v21, v4

    .line 110
    .line 111
    const/4 v0, 0x0

    .line 112
    :goto_0
    invoke-virtual {v6, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual/range {p0 .. p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    check-cast v0, La/fee;

    .line 120
    .line 121
    if-eqz v1, :cond_3

    .line 122
    .line 123
    iget-object v2, v1, La/xbt0;->c:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance v4, La/fcg;

    .line 126
    .line 127
    sget-object v6, La/iun;->a:La/iun;

    .line 128
    .line 129
    invoke-direct {v4, v6, v3}, La/fcg;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 133
    .line 134
    instance-of v3, v2, La/g0g0;

    .line 135
    .line 136
    if-eqz v3, :cond_2

    .line 137
    .line 138
    move-object v2, v4

    .line 139
    :cond_2
    check-cast v2, La/fcg;

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    const/4 v2, 0x0

    .line 143
    :goto_1
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v0

    .line 150
    check-cast v0, La/fee;

    .line 151
    .line 152
    invoke-virtual {v0, v11}, La/fee;->d(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v15}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    check-cast v0, La/fee;

    .line 160
    .line 161
    if-eqz v1, :cond_4

    .line 162
    .line 163
    iget-object v2, v1, La/xbt0;->d:Ljava/util/List;

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_4
    const/4 v2, 0x0

    .line 167
    :goto_2
    if-nez v2, :cond_5

    .line 168
    .line 169
    sget-object v2, La/iun;->a:La/iun;

    .line 170
    .line 171
    :cond_5
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    check-cast v0, La/fee;

    .line 179
    .line 180
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    check-cast v0, La/fee;

    .line 188
    .line 189
    if-eqz v1, :cond_6

    .line 190
    .line 191
    iget-object v2, v1, La/xbt0;->a:Ljava/lang/Object;

    .line 192
    .line 193
    new-instance v3, La/j0g0;

    .line 194
    .line 195
    invoke-direct {v3, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    goto :goto_3

    .line 199
    :cond_6
    const/4 v3, 0x0

    .line 200
    :goto_3
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    check-cast v0, La/fee;

    .line 208
    .line 209
    invoke-virtual {v0, v11}, La/fee;->d(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    check-cast v0, La/fee;

    .line 217
    .line 218
    if-eqz v1, :cond_7

    .line 219
    .line 220
    iget-object v2, v1, La/xbt0;->a:Ljava/lang/Object;

    .line 221
    .line 222
    new-instance v3, La/j0g0;

    .line 223
    .line 224
    invoke-direct {v3, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    goto :goto_4

    .line 228
    :cond_7
    const/4 v3, 0x0

    .line 229
    :goto_4
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 230
    .line 231
    .line 232
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    check-cast v0, La/fee;

    .line 237
    .line 238
    if-eqz v1, :cond_9

    .line 239
    .line 240
    iget-object v2, v1, La/xbt0;->g:Ljava/lang/Object;

    .line 241
    .line 242
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 243
    .line 244
    instance-of v3, v2, La/g0g0;

    .line 245
    .line 246
    if-eqz v3, :cond_8

    .line 247
    .line 248
    const/4 v2, 0x0

    .line 249
    :cond_8
    check-cast v2, La/d1s0;

    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_9
    const/4 v2, 0x0

    .line 253
    :goto_5
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    check-cast v0, La/fee;

    .line 261
    .line 262
    if-eqz v1, :cond_b

    .line 263
    .line 264
    iget-object v2, v1, La/xbt0;->g:Ljava/lang/Object;

    .line 265
    .line 266
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 267
    .line 268
    instance-of v3, v2, La/g0g0;

    .line 269
    .line 270
    if-eqz v3, :cond_a

    .line 271
    .line 272
    const/4 v2, 0x0

    .line 273
    :cond_a
    check-cast v2, La/d1s0;

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_b
    const/4 v2, 0x0

    .line 277
    :goto_6
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    check-cast v0, La/fee;

    .line 285
    .line 286
    if-eqz v1, :cond_c

    .line 287
    .line 288
    iget-object v2, v1, La/xbt0;->a:Ljava/lang/Object;

    .line 289
    .line 290
    new-instance v3, La/j0g0;

    .line 291
    .line 292
    invoke-direct {v3, v2}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    goto :goto_7

    .line 296
    :cond_c
    const/4 v3, 0x0

    .line 297
    :goto_7
    invoke-virtual {v0, v3}, La/fee;->d(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    invoke-virtual/range {v21 .. v21}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 301
    .line 302
    .line 303
    move-result-object v0

    .line 304
    check-cast v0, La/fee;

    .line 305
    .line 306
    if-eqz v1, :cond_e

    .line 307
    .line 308
    iget-object v2, v1, La/xbt0;->g:Ljava/lang/Object;

    .line 309
    .line 310
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 311
    .line 312
    instance-of v3, v2, La/g0g0;

    .line 313
    .line 314
    if-eqz v3, :cond_d

    .line 315
    .line 316
    const/4 v2, 0x0

    .line 317
    :cond_d
    check-cast v2, La/d1s0;

    .line 318
    .line 319
    goto :goto_8

    .line 320
    :cond_e
    const/4 v2, 0x0

    .line 321
    :goto_8
    invoke-virtual {v0, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    invoke-virtual/range {v20 .. v20}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object v0

    .line 328
    check-cast v0, La/fee;

    .line 329
    .line 330
    if-eqz v1, :cond_f

    .line 331
    .line 332
    iget-object v1, v1, La/xbt0;->h:Ljava/util/List;

    .line 333
    .line 334
    goto :goto_9

    .line 335
    :cond_f
    const/4 v1, 0x0

    .line 336
    :goto_9
    invoke-virtual {v0, v1}, La/fee;->d(Ljava/lang/Object;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object v0

    .line 343
    check-cast v0, La/fee;

    .line 344
    .line 345
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    check-cast v0, La/xbt0;

    .line 350
    .line 351
    if-eqz v0, :cond_11

    .line 352
    .line 353
    iget-object v0, v0, La/xbt0;->a:Ljava/lang/Object;

    .line 354
    .line 355
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 356
    .line 357
    instance-of v1, v0, La/g0g0;

    .line 358
    .line 359
    if-eqz v1, :cond_10

    .line 360
    .line 361
    const/16 v16, 0x0

    .line 362
    .line 363
    goto :goto_a

    .line 364
    :cond_10
    move-object/from16 v16, v0

    .line 365
    .line 366
    :goto_a
    move-object/from16 v0, v16

    .line 367
    .line 368
    check-cast v0, La/fn9;

    .line 369
    .line 370
    if-eqz v0, :cond_11

    .line 371
    .line 372
    iget-wide v0, v0, La/fn9;->q:J

    .line 373
    .line 374
    sget-object v2, La/wen;->b:La/uen;

    .line 375
    .line 376
    sget-object v2, La/bfn;->e:La/bfn;

    .line 377
    .line 378
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 379
    .line 380
    .line 381
    move-result-wide v0

    .line 382
    invoke-static {v0, v1}, La/wen;->e(J)J

    .line 383
    .line 384
    .line 385
    move-result-wide v0

    .line 386
    goto :goto_b

    .line 387
    :cond_11
    move-wide/from16 v0, v17

    .line 388
    .line 389
    :goto_b
    cmp-long v2, v0, v17

    .line 390
    .line 391
    if-lez v2, :cond_12

    .line 392
    .line 393
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 394
    .line 395
    .line 396
    move-result-wide v2

    .line 397
    cmp-long v0, v0, v2

    .line 398
    .line 399
    if-gez v0, :cond_12

    .line 400
    .line 401
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 402
    .line 403
    .line 404
    move-result-object v0

    .line 405
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    move-result-object v1

    .line 409
    check-cast v1, La/fee;

    .line 410
    .line 411
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 412
    .line 413
    .line 414
    move-result-object v1

    .line 415
    check-cast v1, Ljava/util/Collection;

    .line 416
    .line 417
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 418
    .line 419
    .line 420
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    check-cast v1, La/fee;

    .line 425
    .line 426
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v1

    .line 430
    check-cast v1, Ljava/util/Collection;

    .line 431
    .line 432
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 433
    .line 434
    .line 435
    invoke-virtual {v15}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 436
    .line 437
    .line 438
    move-result-object v1

    .line 439
    check-cast v1, La/fee;

    .line 440
    .line 441
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 442
    .line 443
    .line 444
    move-result-object v1

    .line 445
    check-cast v1, Ljava/util/Collection;

    .line 446
    .line 447
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 451
    .line 452
    .line 453
    move-result-object v1

    .line 454
    check-cast v1, La/fee;

    .line 455
    .line 456
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    check-cast v1, Ljava/util/Collection;

    .line 461
    .line 462
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 463
    .line 464
    .line 465
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, La/fee;

    .line 470
    .line 471
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    check-cast v1, Ljava/util/Collection;

    .line 476
    .line 477
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 478
    .line 479
    .line 480
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 481
    .line 482
    .line 483
    move-result-object v1

    .line 484
    check-cast v1, La/fee;

    .line 485
    .line 486
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 487
    .line 488
    .line 489
    move-result-object v1

    .line 490
    check-cast v1, Ljava/util/Collection;

    .line 491
    .line 492
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 493
    .line 494
    .line 495
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 496
    .line 497
    .line 498
    move-result-object v1

    .line 499
    check-cast v1, La/fee;

    .line 500
    .line 501
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    check-cast v1, Ljava/util/Collection;

    .line 506
    .line 507
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 508
    .line 509
    .line 510
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 511
    .line 512
    .line 513
    move-result-object v1

    .line 514
    check-cast v1, La/fee;

    .line 515
    .line 516
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    move-result-object v1

    .line 520
    check-cast v1, Ljava/util/Collection;

    .line 521
    .line 522
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 523
    .line 524
    .line 525
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    check-cast v1, La/fee;

    .line 530
    .line 531
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 532
    .line 533
    .line 534
    move-result-object v1

    .line 535
    check-cast v1, Ljava/util/Collection;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 538
    .line 539
    .line 540
    invoke-virtual/range {v21 .. v21}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 541
    .line 542
    .line 543
    move-result-object v1

    .line 544
    check-cast v1, La/fee;

    .line 545
    .line 546
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 547
    .line 548
    .line 549
    move-result-object v1

    .line 550
    check-cast v1, Ljava/util/Collection;

    .line 551
    .line 552
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 553
    .line 554
    .line 555
    invoke-virtual/range {v20 .. v20}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    move-result-object v1

    .line 559
    check-cast v1, La/fee;

    .line 560
    .line 561
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 562
    .line 563
    .line 564
    move-result-object v1

    .line 565
    check-cast v1, Ljava/util/Collection;

    .line 566
    .line 567
    :goto_c
    invoke-static {v0, v1, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 568
    .line 569
    .line 570
    move-result-object v0

    .line 571
    goto/16 :goto_d

    .line 572
    .line 573
    :cond_12
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    invoke-virtual/range {v19 .. v19}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 578
    .line 579
    .line 580
    move-result-object v1

    .line 581
    check-cast v1, La/fee;

    .line 582
    .line 583
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    check-cast v1, Ljava/util/Collection;

    .line 588
    .line 589
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 590
    .line 591
    .line 592
    invoke-virtual/range {p0 .. p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 593
    .line 594
    .line 595
    move-result-object v1

    .line 596
    check-cast v1, La/fee;

    .line 597
    .line 598
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 599
    .line 600
    .line 601
    move-result-object v1

    .line 602
    check-cast v1, Ljava/util/Collection;

    .line 603
    .line 604
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 605
    .line 606
    .line 607
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    move-result-object v1

    .line 611
    check-cast v1, La/fee;

    .line 612
    .line 613
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 614
    .line 615
    .line 616
    move-result-object v1

    .line 617
    check-cast v1, Ljava/util/Collection;

    .line 618
    .line 619
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 620
    .line 621
    .line 622
    invoke-virtual {v15}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 623
    .line 624
    .line 625
    move-result-object v1

    .line 626
    check-cast v1, La/fee;

    .line 627
    .line 628
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    check-cast v1, Ljava/util/Collection;

    .line 633
    .line 634
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 635
    .line 636
    .line 637
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 638
    .line 639
    .line 640
    move-result-object v1

    .line 641
    check-cast v1, La/fee;

    .line 642
    .line 643
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 644
    .line 645
    .line 646
    move-result-object v1

    .line 647
    check-cast v1, Ljava/util/Collection;

    .line 648
    .line 649
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 650
    .line 651
    .line 652
    invoke-virtual {v14}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 653
    .line 654
    .line 655
    move-result-object v1

    .line 656
    check-cast v1, La/fee;

    .line 657
    .line 658
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 659
    .line 660
    .line 661
    move-result-object v1

    .line 662
    check-cast v1, Ljava/util/Collection;

    .line 663
    .line 664
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 665
    .line 666
    .line 667
    invoke-virtual {v13}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    check-cast v1, La/fee;

    .line 672
    .line 673
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 674
    .line 675
    .line 676
    move-result-object v1

    .line 677
    check-cast v1, Ljava/util/Collection;

    .line 678
    .line 679
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 680
    .line 681
    .line 682
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 683
    .line 684
    .line 685
    move-result-object v1

    .line 686
    check-cast v1, La/fee;

    .line 687
    .line 688
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 689
    .line 690
    .line 691
    move-result-object v1

    .line 692
    check-cast v1, Ljava/util/Collection;

    .line 693
    .line 694
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 695
    .line 696
    .line 697
    invoke-virtual {v10}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 698
    .line 699
    .line 700
    move-result-object v1

    .line 701
    check-cast v1, La/fee;

    .line 702
    .line 703
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    move-result-object v1

    .line 707
    check-cast v1, Ljava/util/Collection;

    .line 708
    .line 709
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 710
    .line 711
    .line 712
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 713
    .line 714
    .line 715
    move-result-object v1

    .line 716
    check-cast v1, La/fee;

    .line 717
    .line 718
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    move-result-object v1

    .line 722
    check-cast v1, Ljava/util/Collection;

    .line 723
    .line 724
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 725
    .line 726
    .line 727
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v1

    .line 731
    check-cast v1, La/fee;

    .line 732
    .line 733
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 734
    .line 735
    .line 736
    move-result-object v1

    .line 737
    check-cast v1, Ljava/util/Collection;

    .line 738
    .line 739
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 740
    .line 741
    .line 742
    invoke-virtual/range {v21 .. v21}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v1

    .line 746
    check-cast v1, La/fee;

    .line 747
    .line 748
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 749
    .line 750
    .line 751
    move-result-object v1

    .line 752
    check-cast v1, Ljava/util/Collection;

    .line 753
    .line 754
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 755
    .line 756
    .line 757
    invoke-virtual/range {v20 .. v20}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    check-cast v1, La/fee;

    .line 762
    .line 763
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    check-cast v1, Ljava/util/Collection;

    .line 768
    .line 769
    goto/16 :goto_c

    .line 770
    .line 771
    :goto_d
    return-object v0

    .line 772
    :pswitch_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 773
    .line 774
    check-cast v11, La/l9t0;

    .line 775
    .line 776
    new-instance v1, La/o8t0;

    .line 777
    .line 778
    iget-object v2, v11, La/l9t0;->a:Ljava/lang/String;

    .line 779
    .line 780
    invoke-direct {v1, v2}, La/o8t0;-><init>(Ljava/lang/String;)V

    .line 781
    .line 782
    .line 783
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 784
    .line 785
    .line 786
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 787
    .line 788
    return-object v0

    .line 789
    :pswitch_2
    const-wide/16 v17, 0x0

    .line 790
    .line 791
    check-cast v0, La/r9u;

    .line 792
    .line 793
    move-object/from16 v20, v11

    .line 794
    .line 795
    check-cast v20, Lorg/xplatform/ufc/api/game/UfcPostGameParams;

    .line 796
    .line 797
    sget-object v21, La/n5t0;->a:La/n5t0;

    .line 798
    .line 799
    sget-object v25, La/iun;->a:La/iun;

    .line 800
    .line 801
    sget-object v1, La/vnb0;->c:La/c0o;

    .line 802
    .line 803
    new-instance v2, Ljava/util/ArrayList;

    .line 804
    .line 805
    const/16 v4, 0xa

    .line 806
    .line 807
    invoke-static {v1, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 808
    .line 809
    .line 810
    move-result v4

    .line 811
    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 812
    .line 813
    .line 814
    invoke-virtual {v1}, La/b3;->iterator()Ljava/util/Iterator;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    :goto_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 819
    .line 820
    .line 821
    move-result v4

    .line 822
    if-eqz v4, :cond_13

    .line 823
    .line 824
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 825
    .line 826
    .line 827
    move-result-object v4

    .line 828
    check-cast v4, La/vnb0;

    .line 829
    .line 830
    iget-object v4, v4, La/vnb0;->a:La/t9m0;

    .line 831
    .line 832
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    goto :goto_e

    .line 836
    :cond_13
    new-instance v1, La/ypl0;

    .line 837
    .line 838
    sget-object v4, La/lel0;->Companion:La/kel0;

    .line 839
    .line 840
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    invoke-static {}, La/kel0;->a()La/lel0;

    .line 844
    .line 845
    .line 846
    move-result-object v4

    .line 847
    move-wide/from16 v5, v17

    .line 848
    .line 849
    invoke-direct {v1, v5, v6, v3, v4}, La/ypl0;-><init>(JLjava/lang/String;La/lel0;)V

    .line 850
    .line 851
    .line 852
    new-instance v7, La/bqr;

    .line 853
    .line 854
    const-wide/16 v10, 0x0

    .line 855
    .line 856
    const-string v12, ""

    .line 857
    .line 858
    const-wide/16 v8, 0x0

    .line 859
    .line 860
    invoke-direct/range {v7 .. v12}, La/bqr;-><init>(JJLjava/lang/String;)V

    .line 861
    .line 862
    .line 863
    sget-object v3, La/pcs;->c:[La/pcs;

    .line 864
    .line 865
    sget-object v3, La/upv;->c:[La/upv;

    .line 866
    .line 867
    sget-object v3, La/ygp;->t:La/ygp;

    .line 868
    .line 869
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    iget-object v0, v0, La/r9u;->a:La/j1q0;

    .line 873
    .line 874
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 875
    .line 876
    .line 877
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 878
    .line 879
    invoke-virtual {v0, v3}, La/m1q0;->d(La/ygp;)Z

    .line 880
    .line 881
    .line 882
    move-result v34

    .line 883
    new-instance v19, La/s5t0;

    .line 884
    .line 885
    const-wide/16 v35, 0x0

    .line 886
    .line 887
    const-wide/16 v39, 0x0

    .line 888
    .line 889
    const/16 v22, 0x0

    .line 890
    .line 891
    const/16 v23, 0x0

    .line 892
    .line 893
    const/16 v24, 0x0

    .line 894
    .line 895
    const/16 v31, 0x0

    .line 896
    .line 897
    const-wide/16 v32, 0x1

    .line 898
    .line 899
    const-wide/16 v37, 0x1

    .line 900
    .line 901
    move-object/from16 v26, v25

    .line 902
    .line 903
    move-object/from16 v27, v25

    .line 904
    .line 905
    move-object/from16 v29, v1

    .line 906
    .line 907
    move-object/from16 v28, v2

    .line 908
    .line 909
    move-object/from16 v30, v7

    .line 910
    .line 911
    invoke-direct/range {v19 .. v40}, La/s5t0;-><init>(Lorg/xplatform/ufc/api/game/UfcPostGameParams;La/n5t0;La/i6t0;La/rsp;La/lov;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/ypl0;La/bqr;ZJZJJJ)V

    .line 912
    .line 913
    .line 914
    return-object v19

    .line 915
    :pswitch_3
    move-object v1, v0

    .line 916
    check-cast v1, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;

    .line 917
    .line 918
    check-cast v11, La/ctf0;

    .line 919
    .line 920
    move v5, v2

    .line 921
    iget-wide v2, v1, Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;->a:J

    .line 922
    .line 923
    new-array v0, v9, [Ljava/lang/Object;

    .line 924
    .line 925
    iget-object v6, v11, La/ctf0;->b:La/lsm0;

    .line 926
    .line 927
    invoke-static {v0, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    const v8, 0x7f1305f3

    .line 932
    .line 933
    .line 934
    invoke-virtual {v6, v8, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 935
    .line 936
    .line 937
    move-result-object v0

    .line 938
    new-array v6, v9, [Ljava/lang/Object;

    .line 939
    .line 940
    iget-object v8, v11, La/ctf0;->b:La/lsm0;

    .line 941
    .line 942
    invoke-static {v6, v9}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v6

    .line 946
    const v11, 0x7f1311bf

    .line 947
    .line 948
    .line 949
    invoke-virtual {v8, v11, v6}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 950
    .line 951
    .line 952
    move-result-object v6

    .line 953
    new-instance v8, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 954
    .line 955
    sget-object v11, La/xhs0;->a:La/xhs0;

    .line 956
    .line 957
    invoke-direct {v8, v11}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 958
    .line 959
    .line 960
    new-instance v12, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 961
    .line 962
    sget-object v13, La/xhs0;->b:La/xhs0;

    .line 963
    .line 964
    invoke-direct {v12, v13}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 965
    .line 966
    .line 967
    new-instance v13, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 968
    .line 969
    sget-object v14, La/xhs0;->c:La/xhs0;

    .line 970
    .line 971
    invoke-direct {v13, v14}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 972
    .line 973
    .line 974
    new-instance v14, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 975
    .line 976
    sget-object v15, La/xhs0;->d:La/xhs0;

    .line 977
    .line 978
    invoke-direct {v14, v15}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 979
    .line 980
    .line 981
    new-instance v15, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 982
    .line 983
    const/16 v19, 0x3

    .line 984
    .line 985
    sget-object v7, La/xhs0;->e:La/xhs0;

    .line 986
    .line 987
    invoke-direct {v15, v7}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 988
    .line 989
    .line 990
    new-instance v7, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;

    .line 991
    .line 992
    const/16 v20, 0x2

    .line 993
    .line 994
    sget-object v4, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;->a:Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue$Unselected;

    .line 995
    .line 996
    invoke-direct {v7, v4, v4}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$CustomTime;-><init>(Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferFilterTimeCustomDateValue;)V

    .line 997
    .line 998
    .line 999
    const/4 v4, 0x6

    .line 1000
    new-array v4, v4, [Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;

    .line 1001
    .line 1002
    aput-object v8, v4, v9

    .line 1003
    .line 1004
    aput-object v12, v4, v10

    .line 1005
    .line 1006
    aput-object v13, v4, v20

    .line 1007
    .line 1008
    aput-object v14, v4, v19

    .line 1009
    .line 1010
    const/4 v8, 0x4

    .line 1011
    aput-object v15, v4, v8

    .line 1012
    .line 1013
    aput-object v7, v4, v5

    .line 1014
    .line 1015
    invoke-static {v4}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v4

    .line 1019
    new-instance v12, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;

    .line 1020
    .line 1021
    invoke-direct {v12, v11}, Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel$SimpleTime;-><init>(La/xhs0;)V

    .line 1022
    .line 1023
    .line 1024
    sget-object v13, La/iun;->a:La/iun;

    .line 1025
    .line 1026
    move-object v11, v4

    .line 1027
    move-object v4, v0

    .line 1028
    new-instance v0, La/pks0;

    .line 1029
    .line 1030
    const/4 v9, 0x0

    .line 1031
    const-string v10, ""

    .line 1032
    .line 1033
    move-object v5, v6

    .line 1034
    const/4 v6, 0x0

    .line 1035
    const/4 v7, 0x0

    .line 1036
    const/4 v8, 0x0

    .line 1037
    invoke-direct/range {v0 .. v13}, La/pks0;-><init>(Lorg/xplatform/cyber/section/api/presentation/TransferScreenParams;JLjava/lang/String;Ljava/lang/String;La/j0g0;La/ypl0;ZZLjava/lang/String;Ljava/util/List;Lorg/xplatform/cyber/section/impl/transfers/presentation/common/timefilter/TransferTimeFilterUiModel;Ljava/util/List;)V

    .line 1038
    .line 1039
    .line 1040
    return-object v0

    .line 1041
    :pswitch_4
    check-cast v0, La/yhs0;

    .line 1042
    .line 1043
    check-cast v11, La/uks0;

    .line 1044
    .line 1045
    sget-object v1, La/uks0;->l2:La/s9m0;

    .line 1046
    .line 1047
    sget-object v1, La/xej;->l2:La/nwd;

    .line 1048
    .line 1049
    iget-object v0, v0, La/yhs0;->b:Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;

    .line 1050
    .line 1051
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1059
    .line 1060
    .line 1061
    invoke-static {v0, v2}, La/nwd;->f(Lorg/xplatform/ui_core/calendar/model/DateRangeWithTimeCalendarBottomSheetParams;Landroidx/fragment/app/e;)V

    .line 1062
    .line 1063
    .line 1064
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1065
    .line 1066
    return-object v0

    .line 1067
    :pswitch_5
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1068
    .line 1069
    check-cast v11, La/byr0;

    .line 1070
    .line 1071
    iget-object v1, v11, La/byr0;->a:Ljava/lang/String;

    .line 1072
    .line 1073
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1074
    .line 1075
    .line 1076
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1077
    .line 1078
    return-object v0

    .line 1079
    :pswitch_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1080
    .line 1081
    check-cast v11, La/upk0;

    .line 1082
    .line 1083
    new-instance v1, La/mkb0;

    .line 1084
    .line 1085
    iget v2, v11, La/upk0;->a:I

    .line 1086
    .line 1087
    iget-object v3, v11, La/upk0;->b:Ljava/lang/String;

    .line 1088
    .line 1089
    invoke-direct {v1, v2, v3}, La/mkb0;-><init>(ILjava/lang/String;)V

    .line 1090
    .line 1091
    .line 1092
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1093
    .line 1094
    .line 1095
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1096
    .line 1097
    return-object v0

    .line 1098
    :pswitch_7
    check-cast v0, La/vxi;

    .line 1099
    .line 1100
    check-cast v11, Landroidx/fragment/app/Fragment;

    .line 1101
    .line 1102
    iget-object v0, v0, La/vxi;->p:La/itr;

    .line 1103
    .line 1104
    invoke-interface {v0}, La/itr;->d()La/ujd;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    invoke-static {v0}, La/x1x;->x(Ljava/lang/Object;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {v11}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 1112
    .line 1113
    .line 1114
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1115
    .line 1116
    return-object v0

    .line 1117
    :pswitch_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1118
    .line 1119
    check-cast v11, La/lcb0;

    .line 1120
    .line 1121
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1122
    .line 1123
    .line 1124
    new-instance v1, La/kkb0;

    .line 1125
    .line 1126
    invoke-direct {v1, v11}, La/kkb0;-><init>(La/lcb0;)V

    .line 1127
    .line 1128
    .line 1129
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1130
    .line 1131
    .line 1132
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1133
    .line 1134
    return-object v0

    .line 1135
    :pswitch_9
    check-cast v0, La/l7m0;

    .line 1136
    .line 1137
    check-cast v11, La/e2d;

    .line 1138
    .line 1139
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1140
    .line 1141
    .line 1142
    move-result-object v0

    .line 1143
    check-cast v0, La/x6r0;

    .line 1144
    .line 1145
    iget-boolean v0, v0, La/x6r0;->d:Z

    .line 1146
    .line 1147
    if-eqz v0, :cond_14

    .line 1148
    .line 1149
    iget-object v0, v11, La/e2d;->f:La/a8z;

    .line 1150
    .line 1151
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    check-cast v0, La/l7m0;

    .line 1156
    .line 1157
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    check-cast v0, Ljava/lang/Boolean;

    .line 1162
    .line 1163
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1164
    .line 1165
    .line 1166
    move-result v10

    .line 1167
    :cond_14
    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v0

    .line 1171
    return-object v0

    .line 1172
    :pswitch_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1173
    .line 1174
    check-cast v11, La/h4r0;

    .line 1175
    .line 1176
    new-instance v1, La/q01;

    .line 1177
    .line 1178
    iget-wide v2, v11, La/h4r0;->a:J

    .line 1179
    .line 1180
    iget-wide v4, v11, La/h4r0;->b:J

    .line 1181
    .line 1182
    iget-object v6, v11, La/h4r0;->c:Ljava/lang/String;

    .line 1183
    .line 1184
    invoke-direct/range {v1 .. v6}, La/q01;-><init>(JJLjava/lang/String;)V

    .line 1185
    .line 1186
    .line 1187
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1188
    .line 1189
    .line 1190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1191
    .line 1192
    return-object v0

    .line 1193
    :pswitch_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1194
    .line 1195
    check-cast v11, La/hco;

    .line 1196
    .line 1197
    iget-object v1, v11, La/hco;->b:La/sip;

    .line 1198
    .line 1199
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1200
    .line 1201
    .line 1202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    return-object v0

    .line 1205
    :pswitch_c
    check-cast v0, La/usq0;

    .line 1206
    .line 1207
    check-cast v11, La/cp;

    .line 1208
    .line 1209
    invoke-virtual {v11}, La/cp;->u()Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v1

    .line 1213
    invoke-virtual {v0, v1}, La/usq0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1214
    .line 1215
    .line 1216
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1217
    .line 1218
    return-object v0

    .line 1219
    :pswitch_d
    check-cast v0, La/kie0;

    .line 1220
    .line 1221
    check-cast v11, La/h3q0;

    .line 1222
    .line 1223
    sget v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 1224
    .line 1225
    iget v1, v0, La/kie0;->a:I

    .line 1226
    .line 1227
    add-int/2addr v1, v10

    .line 1228
    iput v1, v0, La/kie0;->a:I

    .line 1229
    .line 1230
    const/16 v0, 0x19

    .line 1231
    .line 1232
    if-ne v1, v0, :cond_15

    .line 1233
    .line 1234
    invoke-virtual {v11}, La/h3q0;->invoke()Ljava/lang/Object;

    .line 1235
    .line 1236
    .line 1237
    :cond_15
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1238
    .line 1239
    return-object v0

    .line 1240
    :pswitch_e
    check-cast v0, La/zdq0;

    .line 1241
    .line 1242
    check-cast v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 1243
    .line 1244
    sget v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 1245
    .line 1246
    invoke-virtual {v0}, La/zdq0;->getType$tile_matching()La/lgq0;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v1

    .line 1250
    iget-boolean v2, v0, La/zdq0;->g:Z

    .line 1251
    .line 1252
    if-eqz v2, :cond_16

    .line 1253
    .line 1254
    goto :goto_f

    .line 1255
    :cond_16
    const/4 v1, 0x0

    .line 1256
    :goto_f
    if-eqz v1, :cond_23

    .line 1257
    .line 1258
    iget-object v1, v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 1259
    .line 1260
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v1

    .line 1264
    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1265
    .line 1266
    .line 1267
    move-result v2

    .line 1268
    if-eqz v2, :cond_17

    .line 1269
    .line 1270
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1271
    .line 1272
    .line 1273
    move-result-object v2

    .line 1274
    check-cast v2, La/zdq0;

    .line 1275
    .line 1276
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 1277
    .line 1278
    .line 1279
    goto :goto_10

    .line 1280
    :cond_17
    iget-object v1, v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->c:Ljava/util/List;

    .line 1281
    .line 1282
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1283
    .line 1284
    .line 1285
    move-result-object v1

    .line 1286
    :cond_18
    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1287
    .line 1288
    .line 1289
    move-result v2

    .line 1290
    if-eqz v2, :cond_1d

    .line 1291
    .line 1292
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1293
    .line 1294
    .line 1295
    move-result-object v2

    .line 1296
    move-object v3, v2

    .line 1297
    check-cast v3, Ljava/util/List;

    .line 1298
    .line 1299
    if-eqz v3, :cond_19

    .line 1300
    .line 1301
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1302
    .line 1303
    .line 1304
    move-result v4

    .line 1305
    if-eqz v4, :cond_19

    .line 1306
    .line 1307
    goto :goto_11

    .line 1308
    :cond_19
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v3

    .line 1312
    :cond_1a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1313
    .line 1314
    .line 1315
    move-result v4

    .line 1316
    if-eqz v4, :cond_18

    .line 1317
    .line 1318
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v4

    .line 1322
    check-cast v4, La/xdq0;

    .line 1323
    .line 1324
    iget v5, v4, La/xdq0;->b:I

    .line 1325
    .line 1326
    invoke-virtual {v0}, La/zdq0;->getRow$tile_matching()I

    .line 1327
    .line 1328
    .line 1329
    move-result v6

    .line 1330
    if-ne v5, v6, :cond_1b

    .line 1331
    .line 1332
    move v5, v10

    .line 1333
    goto :goto_12

    .line 1334
    :cond_1b
    move v5, v9

    .line 1335
    :goto_12
    iget v4, v4, La/xdq0;->c:I

    .line 1336
    .line 1337
    invoke-virtual {v0}, La/zdq0;->getColumn$tile_matching()I

    .line 1338
    .line 1339
    .line 1340
    move-result v6

    .line 1341
    if-ne v4, v6, :cond_1c

    .line 1342
    .line 1343
    move v4, v10

    .line 1344
    goto :goto_13

    .line 1345
    :cond_1c
    move v4, v9

    .line 1346
    :goto_13
    and-int/2addr v4, v5

    .line 1347
    if-eqz v4, :cond_1a

    .line 1348
    .line 1349
    goto :goto_14

    .line 1350
    :cond_1d
    const/4 v2, 0x0

    .line 1351
    :goto_14
    check-cast v2, Ljava/util/List;

    .line 1352
    .line 1353
    if-eqz v2, :cond_22

    .line 1354
    .line 1355
    iget-object v1, v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->d:Ljava/util/ArrayList;

    .line 1356
    .line 1357
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1358
    .line 1359
    .line 1360
    new-instance v3, Ljava/util/ArrayList;

    .line 1361
    .line 1362
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1363
    .line 1364
    .line 1365
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v2

    .line 1369
    :cond_1e
    :goto_15
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1370
    .line 1371
    .line 1372
    move-result v4

    .line 1373
    if-eqz v4, :cond_21

    .line 1374
    .line 1375
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1376
    .line 1377
    .line 1378
    move-result-object v4

    .line 1379
    check-cast v4, La/xdq0;

    .line 1380
    .line 1381
    iget-object v5, v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 1382
    .line 1383
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v5

    .line 1387
    :cond_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1388
    .line 1389
    .line 1390
    move-result v6

    .line 1391
    if-eqz v6, :cond_20

    .line 1392
    .line 1393
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v6

    .line 1397
    move-object v7, v6

    .line 1398
    check-cast v7, La/zdq0;

    .line 1399
    .line 1400
    invoke-virtual {v7}, La/zdq0;->getRow$tile_matching()I

    .line 1401
    .line 1402
    .line 1403
    move-result v8

    .line 1404
    iget v9, v4, La/xdq0;->b:I

    .line 1405
    .line 1406
    if-ne v8, v9, :cond_1f

    .line 1407
    .line 1408
    invoke-virtual {v7}, La/zdq0;->getColumn$tile_matching()I

    .line 1409
    .line 1410
    .line 1411
    move-result v7

    .line 1412
    iget v8, v4, La/xdq0;->c:I

    .line 1413
    .line 1414
    if-ne v7, v8, :cond_1f

    .line 1415
    .line 1416
    goto :goto_16

    .line 1417
    :cond_20
    const/4 v6, 0x0

    .line 1418
    :goto_16
    check-cast v6, La/zdq0;

    .line 1419
    .line 1420
    if-eqz v6, :cond_1e

    .line 1421
    .line 1422
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1423
    .line 1424
    .line 1425
    goto :goto_15

    .line 1426
    :cond_21
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1427
    .line 1428
    .line 1429
    :cond_22
    iget-object v1, v11, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->g:Lkotlin/jvm/functions/Function2;

    .line 1430
    .line 1431
    invoke-virtual {v0}, La/zdq0;->getRow$tile_matching()I

    .line 1432
    .line 1433
    .line 1434
    move-result v2

    .line 1435
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1436
    .line 1437
    .line 1438
    move-result-object v2

    .line 1439
    invoke-virtual {v0}, La/zdq0;->getColumn$tile_matching()I

    .line 1440
    .line 1441
    .line 1442
    move-result v0

    .line 1443
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1444
    .line 1445
    .line 1446
    move-result-object v0

    .line 1447
    invoke-interface {v1, v2, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1448
    .line 1449
    .line 1450
    :cond_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1451
    .line 1452
    return-object v0

    .line 1453
    :pswitch_f
    move v5, v2

    .line 1454
    check-cast v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;

    .line 1455
    .line 1456
    check-cast v11, Ljava/util/List;

    .line 1457
    .line 1458
    sget v1, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->h:I

    .line 1459
    .line 1460
    invoke-static {v9, v5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 1461
    .line 1462
    .line 1463
    move-result-object v1

    .line 1464
    invoke-virtual {v1}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v1

    .line 1468
    move v2, v9

    .line 1469
    :cond_24
    move-object v3, v1

    .line 1470
    check-cast v3, La/kkx;

    .line 1471
    .line 1472
    iget-boolean v3, v3, La/kkx;->c:Z

    .line 1473
    .line 1474
    if-eqz v3, :cond_25

    .line 1475
    .line 1476
    move-object v3, v1

    .line 1477
    check-cast v3, La/bkx;

    .line 1478
    .line 1479
    invoke-virtual {v3}, La/bkx;->nextInt()I

    .line 1480
    .line 1481
    .line 1482
    move-result v3

    .line 1483
    invoke-static {v9, v5}, La/l1e0;->o(II)Lkotlin/ranges/IntRange;

    .line 1484
    .line 1485
    .line 1486
    move-result-object v4

    .line 1487
    invoke-virtual {v4}, Lkotlin/ranges/a;->iterator()Ljava/util/Iterator;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v4

    .line 1491
    :goto_17
    move-object v6, v4

    .line 1492
    check-cast v6, La/kkx;

    .line 1493
    .line 1494
    iget-boolean v6, v6, La/kkx;->c:Z

    .line 1495
    .line 1496
    if-eqz v6, :cond_24

    .line 1497
    .line 1498
    move-object v6, v4

    .line 1499
    check-cast v6, La/bkx;

    .line 1500
    .line 1501
    invoke-virtual {v6}, La/bkx;->nextInt()I

    .line 1502
    .line 1503
    .line 1504
    move-result v6

    .line 1505
    iget-object v7, v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 1506
    .line 1507
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v7

    .line 1511
    check-cast v7, La/zdq0;

    .line 1512
    .line 1513
    invoke-virtual {v7, v3}, La/zdq0;->setRow$tile_matching(I)V

    .line 1514
    .line 1515
    .line 1516
    invoke-virtual {v7, v6}, La/zdq0;->setColumn$tile_matching(I)V

    .line 1517
    .line 1518
    .line 1519
    invoke-virtual {v7, v3}, La/zdq0;->setYByLine$tile_matching(I)V

    .line 1520
    .line 1521
    .line 1522
    add-int/lit8 v2, v2, 0x1

    .line 1523
    .line 1524
    goto :goto_17

    .line 1525
    :cond_25
    iget-object v1, v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->d:Ljava/util/ArrayList;

    .line 1526
    .line 1527
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 1528
    .line 1529
    .line 1530
    invoke-virtual {v0, v11}, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->d(Ljava/util/List;)V

    .line 1531
    .line 1532
    .line 1533
    new-instance v1, La/h3q0;

    .line 1534
    .line 1535
    const/16 v2, 0xc

    .line 1536
    .line 1537
    invoke-direct {v1, v0, v2}, La/h3q0;-><init>(Ljava/lang/Object;B)V

    .line 1538
    .line 1539
    .line 1540
    new-instance v2, La/kie0;

    .line 1541
    .line 1542
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1543
    .line 1544
    .line 1545
    iget-object v3, v0, Lorg/xplatform/tile_matching/presentation/views/TileMatchingGameFieldView;->b:Ljava/util/List;

    .line 1546
    .line 1547
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v3

    .line 1551
    :goto_18
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 1552
    .line 1553
    .line 1554
    move-result v4

    .line 1555
    if-eqz v4, :cond_26

    .line 1556
    .line 1557
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1558
    .line 1559
    .line 1560
    move-result-object v4

    .line 1561
    check-cast v4, La/zdq0;

    .line 1562
    .line 1563
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 1564
    .line 1565
    .line 1566
    move-result v5

    .line 1567
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 1568
    .line 1569
    .line 1570
    move-result v6

    .line 1571
    int-to-float v6, v6

    .line 1572
    sub-float/2addr v5, v6

    .line 1573
    invoke-virtual {v4, v5}, Landroid/view/View;->setY(F)V

    .line 1574
    .line 1575
    .line 1576
    invoke-virtual {v4, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1577
    .line 1578
    .line 1579
    invoke-virtual {v4}, Landroid/view/View;->getY()F

    .line 1580
    .line 1581
    .line 1582
    move-result v5

    .line 1583
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 1584
    .line 1585
    .line 1586
    move-result v6

    .line 1587
    int-to-float v6, v6

    .line 1588
    add-float/2addr v5, v6

    .line 1589
    new-instance v6, La/yip0;

    .line 1590
    .line 1591
    const/16 v7, 0xf

    .line 1592
    .line 1593
    invoke-direct {v6, v2, v1, v7}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1594
    .line 1595
    .line 1596
    invoke-virtual {v4, v5, v6}, La/zdq0;->h(FLkotlin/jvm/functions/Function0;)V

    .line 1597
    .line 1598
    .line 1599
    goto :goto_18

    .line 1600
    :cond_26
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1601
    .line 1602
    return-object v0

    .line 1603
    :pswitch_10
    check-cast v0, La/y78;

    .line 1604
    .line 1605
    check-cast v11, La/r1a;

    .line 1606
    .line 1607
    iget-object v0, v0, La/y78;->c:Ljava/lang/Object;

    .line 1608
    .line 1609
    check-cast v0, La/k1a;

    .line 1610
    .line 1611
    iget-object v0, v0, La/k1a;->a:Ljava/util/concurrent/Executor;

    .line 1612
    .line 1613
    if-nez v0, :cond_27

    .line 1614
    .line 1615
    sget-object v0, La/o23;->b:Ljava/util/concurrent/ThreadFactory;

    .line 1616
    .line 1617
    const-string v1, "CXCP-Camera-E"

    .line 1618
    .line 1619
    invoke-static {v1, v0}, La/o23;->b(Ljava/lang/String;Ljava/util/concurrent/ThreadFactory;)La/m23;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v0

    .line 1623
    new-instance v1, La/l23;

    .line 1624
    .line 1625
    const/4 v2, -0x3

    .line 1626
    invoke-direct {v1, v2, v0}, La/l23;-><init>(ILa/m23;)V

    .line 1627
    .line 1628
    .line 1629
    invoke-static {v10, v1}, Ljava/util/concurrent/Executors;->newFixedThreadPool(ILjava/util/concurrent/ThreadFactory;)Ljava/util/concurrent/ExecutorService;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v0

    .line 1633
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1634
    .line 1635
    .line 1636
    sget-object v1, La/p1a;->c:La/p1a;

    .line 1637
    .line 1638
    new-instance v2, La/apj0;

    .line 1639
    .line 1640
    const/16 v3, 0x11

    .line 1641
    .line 1642
    invoke-direct {v2, v0, v3}, La/apj0;-><init>(Ljava/lang/Object;B)V

    .line 1643
    .line 1644
    .line 1645
    invoke-virtual {v11, v1, v2}, La/r1a;->a(La/p1a;Ljava/lang/Runnable;)V

    .line 1646
    .line 1647
    .line 1648
    :cond_27
    return-object v0

    .line 1649
    :pswitch_11
    move-object v1, v0

    .line 1650
    check-cast v1, La/zbq0;

    .line 1651
    .line 1652
    move-object v3, v11

    .line 1653
    check-cast v3, La/uaq0;

    .line 1654
    .line 1655
    iget-object v0, v1, La/zbq0;->g:La/m8u;

    .line 1656
    .line 1657
    iget-object v0, v0, La/m8u;->a:La/v6j0;

    .line 1658
    .line 1659
    iget-object v2, v0, La/v6j0;->a:La/q7d0;

    .line 1660
    .line 1661
    const-string v4, "THEME"

    .line 1662
    .line 1663
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1664
    .line 1665
    .line 1666
    move-result v5

    .line 1667
    invoke-virtual {v2, v5, v4}, La/q7d0;->e(ILjava/lang/String;)V

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v0}, La/v6j0;->h()La/qz40;

    .line 1671
    .line 1672
    .line 1673
    move-result-object v0

    .line 1674
    check-cast v0, La/p7m0;

    .line 1675
    .line 1676
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1677
    .line 1678
    .line 1679
    const/4 v2, 0x0

    .line 1680
    invoke-virtual {v0, v2, v3}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1681
    .line 1682
    .line 1683
    iget-object v0, v1, La/zbq0;->c:La/y3v;

    .line 1684
    .line 1685
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v2

    .line 1689
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1690
    .line 1691
    .line 1692
    iget-object v0, v0, La/y3v;->d:Ljava/lang/Object;

    .line 1693
    .line 1694
    check-cast v0, Ljava/util/HashMap;

    .line 1695
    .line 1696
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 1697
    .line 1698
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1699
    .line 1700
    .line 1701
    move-result-object v2

    .line 1702
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1703
    .line 1704
    .line 1705
    const-string v5, "theme"

    .line 1706
    .line 1707
    invoke-virtual {v0, v5, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1708
    .line 1709
    .line 1710
    iget-object v0, v1, La/zbq0;->m:La/nvu;

    .line 1711
    .line 1712
    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v2

    .line 1716
    invoke-virtual {v2, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v2

    .line 1720
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1721
    .line 1722
    .line 1723
    iget-object v0, v0, La/nvu;->d:Ljava/lang/Object;

    .line 1724
    .line 1725
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 1726
    .line 1727
    const-string v4, "THEME_KEY"

    .line 1728
    .line 1729
    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1730
    .line 1731
    .line 1732
    iget-object v12, v1, La/zbq0;->n:La/p7m0;

    .line 1733
    .line 1734
    :cond_28
    invoke-virtual {v12}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1735
    .line 1736
    .line 1737
    move-result-object v0

    .line 1738
    move-object v2, v0

    .line 1739
    check-cast v2, La/obq0;

    .line 1740
    .line 1741
    iget-object v4, v1, La/zbq0;->h:La/uqx;

    .line 1742
    .line 1743
    iget-object v4, v4, La/uqx;->a:La/v6j0;

    .line 1744
    .line 1745
    invoke-virtual {v4}, La/v6j0;->f()Z

    .line 1746
    .line 1747
    .line 1748
    move-result v4

    .line 1749
    if-eqz v4, :cond_29

    .line 1750
    .line 1751
    sget-object v4, La/uaq0;->a:La/s9m0;

    .line 1752
    .line 1753
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    invoke-static {v3}, La/s9m0;->j(La/uaq0;)Z

    .line 1757
    .line 1758
    .line 1759
    move-result v4

    .line 1760
    if-nez v4, :cond_29

    .line 1761
    .line 1762
    move v4, v10

    .line 1763
    goto :goto_19

    .line 1764
    :cond_29
    move v4, v9

    .line 1765
    :goto_19
    sget-object v5, La/uaq0;->a:La/s9m0;

    .line 1766
    .line 1767
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1768
    .line 1769
    .line 1770
    invoke-static {v3}, La/s9m0;->j(La/uaq0;)Z

    .line 1771
    .line 1772
    .line 1773
    move-result v5

    .line 1774
    xor-int/2addr v5, v10

    .line 1775
    const/4 v7, 0x0

    .line 1776
    const/16 v8, 0x31

    .line 1777
    .line 1778
    const/4 v6, 0x0

    .line 1779
    invoke-static/range {v2 .. v8}, La/obq0;->a(La/obq0;La/uaq0;ZZLjava/lang/String;Ljava/lang/String;I)La/obq0;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v2

    .line 1783
    invoke-virtual {v12, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1784
    .line 1785
    .line 1786
    move-result v0

    .line 1787
    if-eqz v0, :cond_28

    .line 1788
    .line 1789
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1790
    .line 1791
    return-object v0

    .line 1792
    :pswitch_12
    check-cast v0, La/i83;

    .line 1793
    .line 1794
    check-cast v11, La/u23;

    .line 1795
    .line 1796
    iget-object v0, v0, La/i83;->a:Ljava/lang/Object;

    .line 1797
    .line 1798
    check-cast v0, La/kb00;

    .line 1799
    .line 1800
    instance-of v1, v0, La/jb00;

    .line 1801
    .line 1802
    if-eqz v1, :cond_2b

    .line 1803
    .line 1804
    move-object v1, v0

    .line 1805
    check-cast v1, La/jb00;

    .line 1806
    .line 1807
    iget-object v1, v1, La/jb00;->c:La/sa4;

    .line 1808
    .line 1809
    if-eqz v1, :cond_2a

    .line 1810
    .line 1811
    invoke-virtual {v1, v0}, La/sa4;->a(La/kb00;)V

    .line 1812
    .line 1813
    .line 1814
    goto :goto_1a

    .line 1815
    :cond_2a
    :try_start_0
    check-cast v0, La/jb00;

    .line 1816
    .line 1817
    iget-object v0, v0, La/jb00;->a:Ljava/lang/String;

    .line 1818
    .line 1819
    invoke-virtual {v11, v0}, La/u23;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1820
    .line 1821
    .line 1822
    goto :goto_1a

    .line 1823
    :cond_2b
    instance-of v1, v0, La/ib00;

    .line 1824
    .line 1825
    if-eqz v1, :cond_2c

    .line 1826
    .line 1827
    move-object v1, v0

    .line 1828
    check-cast v1, La/ib00;

    .line 1829
    .line 1830
    iget-object v1, v1, La/ib00;->c:La/sa4;

    .line 1831
    .line 1832
    if-eqz v1, :cond_2c

    .line 1833
    .line 1834
    invoke-virtual {v1, v0}, La/sa4;->a(La/kb00;)V

    .line 1835
    .line 1836
    .line 1837
    :catch_0
    :cond_2c
    :goto_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1838
    .line 1839
    return-object v0

    .line 1840
    :pswitch_13
    check-cast v0, Landroid/content/Context;

    .line 1841
    .line 1842
    check-cast v11, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;

    .line 1843
    .line 1844
    invoke-static {v0, v11}, Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;->A(Landroid/content/Context;Lorg/xplatform/ui_core/viewcomponents/layouts/linear/TextInputEditTextNew;)La/juc;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v0

    .line 1848
    return-object v0

    .line 1849
    :pswitch_14
    const/16 v19, 0x3

    .line 1850
    .line 1851
    const/16 v20, 0x2

    .line 1852
    .line 1853
    check-cast v0, La/k7q0;

    .line 1854
    .line 1855
    check-cast v11, La/pz40;

    .line 1856
    .line 1857
    invoke-interface {v11}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v1

    .line 1861
    check-cast v1, La/qkx;

    .line 1862
    .line 1863
    iget-wide v1, v1, La/qkx;->a:J

    .line 1864
    .line 1865
    invoke-virtual {v0}, La/k7q0;->g()La/ne60;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v3

    .line 1869
    const-wide v4, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    if-eqz v3, :cond_34

    .line 1875
    .line 1876
    iget-wide v6, v3, La/ne60;->a:J

    .line 1877
    .line 1878
    invoke-virtual {v0}, La/k7q0;->k()La/j83;

    .line 1879
    .line 1880
    .line 1881
    move-result-object v3

    .line 1882
    if-eqz v3, :cond_34

    .line 1883
    .line 1884
    iget-object v3, v3, La/j83;->b:Ljava/lang/String;

    .line 1885
    .line 1886
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1887
    .line 1888
    .line 1889
    move-result v3

    .line 1890
    if-nez v3, :cond_2d

    .line 1891
    .line 1892
    goto/16 :goto_1e

    .line 1893
    .line 1894
    :cond_2d
    iget-object v3, v0, La/k7q0;->r:La/pz40;

    .line 1895
    .line 1896
    check-cast v3, La/hgk0;

    .line 1897
    .line 1898
    invoke-virtual {v3}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v3

    .line 1902
    check-cast v3, La/blv;

    .line 1903
    .line 1904
    const/4 v8, -0x1

    .line 1905
    if-nez v3, :cond_2e

    .line 1906
    .line 1907
    move v3, v8

    .line 1908
    goto :goto_1b

    .line 1909
    :cond_2e
    sget-object v11, La/m7q0;->a:[I

    .line 1910
    .line 1911
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1912
    .line 1913
    .line 1914
    move-result v3

    .line 1915
    aget v3, v11, v3

    .line 1916
    .line 1917
    :goto_1b
    if-eq v3, v8, :cond_34

    .line 1918
    .line 1919
    const-wide v11, 0xffffffffL

    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    const/16 v8, 0x20

    .line 1925
    .line 1926
    if-eq v3, v10, :cond_30

    .line 1927
    .line 1928
    move/from16 v10, v20

    .line 1929
    .line 1930
    if-eq v3, v10, :cond_30

    .line 1931
    .line 1932
    move/from16 v10, v19

    .line 1933
    .line 1934
    if-ne v3, v10, :cond_2f

    .line 1935
    .line 1936
    invoke-virtual {v0}, La/k7q0;->l()La/a8q0;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v3

    .line 1940
    iget-wide v13, v3, La/a8q0;->b:J

    .line 1941
    .line 1942
    sget v3, La/o9q0;->c:I

    .line 1943
    .line 1944
    and-long/2addr v13, v11

    .line 1945
    :goto_1c
    long-to-int v3, v13

    .line 1946
    goto :goto_1d

    .line 1947
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1948
    .line 1949
    .line 1950
    const/4 v8, 0x0

    .line 1951
    goto/16 :goto_1f

    .line 1952
    .line 1953
    :cond_30
    invoke-virtual {v0}, La/k7q0;->l()La/a8q0;

    .line 1954
    .line 1955
    .line 1956
    move-result-object v3

    .line 1957
    iget-wide v13, v3, La/a8q0;->b:J

    .line 1958
    .line 1959
    sget v3, La/o9q0;->c:I

    .line 1960
    .line 1961
    shr-long/2addr v13, v8

    .line 1962
    goto :goto_1c

    .line 1963
    :goto_1d
    iget-object v10, v0, La/k7q0;->d:La/djz;

    .line 1964
    .line 1965
    if-eqz v10, :cond_34

    .line 1966
    .line 1967
    invoke-virtual {v10}, La/djz;->d()La/b9q0;

    .line 1968
    .line 1969
    .line 1970
    move-result-object v10

    .line 1971
    if-nez v10, :cond_31

    .line 1972
    .line 1973
    goto/16 :goto_1e

    .line 1974
    .line 1975
    :cond_31
    iget-object v13, v0, La/k7q0;->d:La/djz;

    .line 1976
    .line 1977
    if-eqz v13, :cond_34

    .line 1978
    .line 1979
    iget-object v13, v13, La/djz;->a:La/hhk;

    .line 1980
    .line 1981
    iget-object v13, v13, La/hhk;->b:Ljava/lang/Object;

    .line 1982
    .line 1983
    check-cast v13, La/j83;

    .line 1984
    .line 1985
    if-nez v13, :cond_32

    .line 1986
    .line 1987
    goto :goto_1e

    .line 1988
    :cond_32
    iget-object v0, v0, La/k7q0;->b:La/qe60;

    .line 1989
    .line 1990
    invoke-interface {v0, v3}, La/qe60;->s(I)I

    .line 1991
    .line 1992
    .line 1993
    move-result v0

    .line 1994
    iget-object v3, v13, La/j83;->b:Ljava/lang/String;

    .line 1995
    .line 1996
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 1997
    .line 1998
    .line 1999
    move-result v3

    .line 2000
    invoke-static {v0, v9, v3}, La/l1e0;->d(III)I

    .line 2001
    .line 2002
    .line 2003
    move-result v0

    .line 2004
    invoke-virtual {v10, v6, v7}, La/b9q0;->d(J)J

    .line 2005
    .line 2006
    .line 2007
    move-result-wide v6

    .line 2008
    shr-long/2addr v6, v8

    .line 2009
    long-to-int v3, v6

    .line 2010
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2011
    .line 2012
    .line 2013
    move-result v3

    .line 2014
    iget-object v6, v10, La/b9q0;->a:La/a9q0;

    .line 2015
    .line 2016
    iget-object v7, v6, La/a9q0;->b:La/bw40;

    .line 2017
    .line 2018
    invoke-virtual {v7, v0}, La/bw40;->d(I)I

    .line 2019
    .line 2020
    .line 2021
    move-result v0

    .line 2022
    invoke-virtual {v6, v0}, La/a9q0;->g(I)F

    .line 2023
    .line 2024
    .line 2025
    move-result v9

    .line 2026
    invoke-virtual {v6, v0}, La/a9q0;->h(I)F

    .line 2027
    .line 2028
    .line 2029
    move-result v6

    .line 2030
    invoke-static {v9, v6}, Ljava/lang/Math;->min(FF)F

    .line 2031
    .line 2032
    .line 2033
    move-result v10

    .line 2034
    invoke-static {v9, v6}, Ljava/lang/Math;->max(FF)F

    .line 2035
    .line 2036
    .line 2037
    move-result v6

    .line 2038
    invoke-static {v3, v10, v6}, La/l1e0;->c(FFF)F

    .line 2039
    .line 2040
    .line 2041
    move-result v6

    .line 2042
    const-wide/16 v9, 0x0

    .line 2043
    .line 2044
    invoke-static {v1, v2, v9, v10}, La/qkx;->a(JJ)Z

    .line 2045
    .line 2046
    .line 2047
    move-result v9

    .line 2048
    if-nez v9, :cond_33

    .line 2049
    .line 2050
    sub-float/2addr v3, v6

    .line 2051
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 2052
    .line 2053
    .line 2054
    move-result v3

    .line 2055
    shr-long/2addr v1, v8

    .line 2056
    long-to-int v1, v1

    .line 2057
    const/16 v20, 0x2

    .line 2058
    .line 2059
    div-int/lit8 v1, v1, 0x2

    .line 2060
    .line 2061
    int-to-float v1, v1

    .line 2062
    cmpl-float v1, v3, v1

    .line 2063
    .line 2064
    if-lez v1, :cond_33

    .line 2065
    .line 2066
    goto :goto_1e

    .line 2067
    :cond_33
    invoke-virtual {v7, v0}, La/bw40;->f(I)F

    .line 2068
    .line 2069
    .line 2070
    move-result v1

    .line 2071
    invoke-virtual {v7, v0}, La/bw40;->b(I)F

    .line 2072
    .line 2073
    .line 2074
    move-result v0

    .line 2075
    sub-float/2addr v0, v1

    .line 2076
    const/high16 v2, 0x40000000    # 2.0f

    .line 2077
    .line 2078
    div-float/2addr v0, v2

    .line 2079
    add-float/2addr v0, v1

    .line 2080
    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2081
    .line 2082
    .line 2083
    move-result v1

    .line 2084
    int-to-long v1, v1

    .line 2085
    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2086
    .line 2087
    .line 2088
    move-result v0

    .line 2089
    int-to-long v3, v0

    .line 2090
    shl-long v0, v1, v8

    .line 2091
    .line 2092
    and-long v2, v3, v11

    .line 2093
    .line 2094
    or-long v4, v0, v2

    .line 2095
    .line 2096
    :cond_34
    :goto_1e
    new-instance v8, La/ne60;

    .line 2097
    .line 2098
    invoke-direct {v8, v4, v5}, La/ne60;-><init>(J)V

    .line 2099
    .line 2100
    .line 2101
    :goto_1f
    return-object v8

    .line 2102
    :pswitch_15
    check-cast v0, La/vne;

    .line 2103
    .line 2104
    check-cast v11, Lkotlin/jvm/functions/Function1;

    .line 2105
    .line 2106
    sget-object v1, La/yne;->d:La/yne;

    .line 2107
    .line 2108
    new-instance v2, La/a2f;

    .line 2109
    .line 2110
    const/4 v3, 0x7

    .line 2111
    const/4 v4, 0x0

    .line 2112
    invoke-direct {v2, v11, v4, v3}, La/a2f;-><init>(Lkotlin/jvm/functions/Function1;La/yje;B)V

    .line 2113
    .line 2114
    .line 2115
    invoke-static {v0, v4, v1, v2, v10}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2116
    .line 2117
    .line 2118
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2119
    .line 2120
    return-object v0

    .line 2121
    :pswitch_16
    check-cast v0, Landroid/content/Context;

    .line 2122
    .line 2123
    check-cast v11, Landroid/view/textclassifier/TextClassification;

    .line 2124
    .line 2125
    invoke-static {v11}, La/jw90;->k(Landroid/view/textclassifier/TextClassification;)Ljava/lang/String;

    .line 2126
    .line 2127
    .line 2128
    move-result-object v1

    .line 2129
    if-eqz v1, :cond_35

    .line 2130
    .line 2131
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 2132
    .line 2133
    .line 2134
    move-result v9

    .line 2135
    :cond_35
    invoke-static {v11}, La/jw90;->d(Landroid/view/textclassifier/TextClassification;)Landroid/content/Intent;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v1

    .line 2139
    const/high16 v2, 0xc000000

    .line 2140
    .line 2141
    invoke-static {v0, v9, v1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v0

    .line 2145
    invoke-static {v0}, La/btm0;->u(Landroid/app/PendingIntent;)V

    .line 2146
    .line 2147
    .line 2148
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2149
    .line 2150
    return-object v0

    .line 2151
    :pswitch_17
    const/4 v4, 0x0

    .line 2152
    const-string v1, "Dispatchers.Main was accessed when the platform dispatcher was absent and the test dispatcher was unset. Please make sure that Dispatchers.setMain() is called before accessing Dispatchers.Main and that Dispatchers.Main is not accessed after Dispatchers.resetMain()."

    .line 2153
    .line 2154
    check-cast v0, La/xs10;

    .line 2155
    .line 2156
    check-cast v11, Ljava/util/ArrayList;

    .line 2157
    .line 2158
    :try_start_1
    invoke-interface {v0, v11}, La/xs10;->a(Ljava/util/List;)La/vs10;

    .line 2159
    .line 2160
    .line 2161
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 2162
    invoke-virtual {v0}, La/vs10;->x()La/vs10;

    .line 2163
    .line 2164
    .line 2165
    move-result-object v2

    .line 2166
    instance-of v2, v2, La/ch40;

    .line 2167
    .line 2168
    if-nez v2, :cond_36

    .line 2169
    .line 2170
    move-object v8, v0

    .line 2171
    goto :goto_22

    .line 2172
    :cond_36
    :try_start_2
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 2173
    .line 2174
    new-instance v2, La/d12;

    .line 2175
    .line 2176
    const/4 v10, 0x3

    .line 2177
    invoke-direct {v2, v10}, La/d12;-><init>(B)V

    .line 2178
    .line 2179
    .line 2180
    invoke-virtual {v0, v0, v2}, La/lne;->q(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V

    .line 2181
    .line 2182
    .line 2183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 2184
    .line 2185
    goto :goto_20

    .line 2186
    :catchall_0
    move-exception v0

    .line 2187
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 2188
    .line 2189
    new-instance v2, La/g0g0;

    .line 2190
    .line 2191
    invoke-direct {v2, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 2192
    .line 2193
    .line 2194
    move-object v0, v2

    .line 2195
    :goto_20
    invoke-static {v0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 2196
    .line 2197
    .line 2198
    move-result-object v0

    .line 2199
    invoke-static {v1, v0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2200
    .line 2201
    .line 2202
    :goto_21
    move-object v8, v4

    .line 2203
    goto :goto_22

    .line 2204
    :catchall_1
    move-exception v0

    .line 2205
    invoke-static {v1, v0}, La/hny;->q(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2206
    .line 2207
    .line 2208
    goto :goto_21

    .line 2209
    :goto_22
    return-object v8

    .line 2210
    :pswitch_18
    check-cast v0, Landroid/content/Context;

    .line 2211
    .line 2212
    check-cast v11, La/lxp0;

    .line 2213
    .line 2214
    new-instance v1, Landroid/widget/ImageView;

    .line 2215
    .line 2216
    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 2217
    .line 2218
    .line 2219
    const v2, 0x7f0807b0

    .line 2220
    .line 2221
    .line 2222
    invoke-virtual {v0, v2}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v2

    .line 2226
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2227
    .line 2228
    .line 2229
    const v2, 0x7f040b0b

    .line 2230
    .line 2231
    .line 2232
    invoke-static {v2, v0}, La/m5d;->b(ILandroid/content/Context;)I

    .line 2233
    .line 2234
    .line 2235
    move-result v0

    .line 2236
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 2237
    .line 2238
    .line 2239
    invoke-virtual {v11, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 2240
    .line 2241
    .line 2242
    return-object v1

    .line 2243
    :pswitch_19
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2244
    .line 2245
    check-cast v11, La/d9a0;

    .line 2246
    .line 2247
    invoke-interface {v0, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2248
    .line 2249
    .line 2250
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2251
    .line 2252
    return-object v0

    .line 2253
    :pswitch_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2254
    .line 2255
    check-cast v11, La/skp0;

    .line 2256
    .line 2257
    iget-object v1, v11, La/skp0;->a:Ljava/lang/String;

    .line 2258
    .line 2259
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2260
    .line 2261
    .line 2262
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2263
    .line 2264
    return-object v0

    .line 2265
    :pswitch_1b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 2266
    .line 2267
    check-cast v11, La/rkp0;

    .line 2268
    .line 2269
    iget-object v1, v11, La/rkp0;->a:Ljava/lang/String;

    .line 2270
    .line 2271
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2272
    .line 2273
    .line 2274
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2275
    .line 2276
    return-object v0

    .line 2277
    :pswitch_1c
    check-cast v0, La/ajp0;

    .line 2278
    .line 2279
    check-cast v11, La/ejp0;

    .line 2280
    .line 2281
    iget-object v1, v0, La/ajp0;->l2:La/phf0;

    .line 2282
    .line 2283
    sget-object v2, La/ajp0;->s2:[La/iiy;

    .line 2284
    .line 2285
    aget-object v3, v2, v9

    .line 2286
    .line 2287
    invoke-virtual {v1, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 2288
    .line 2289
    .line 2290
    move-result-object v1

    .line 2291
    new-instance v3, La/ojp0;

    .line 2292
    .line 2293
    iget-object v4, v0, La/ajp0;->n2:La/zz2;

    .line 2294
    .line 2295
    const/16 v20, 0x2

    .line 2296
    .line 2297
    aget-object v5, v2, v20

    .line 2298
    .line 2299
    invoke-virtual {v4, v0, v5}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 2300
    .line 2301
    .line 2302
    move-result-object v4

    .line 2303
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 2304
    .line 2305
    .line 2306
    move-result v4

    .line 2307
    iget-object v5, v0, La/ajp0;->o2:La/zz2;

    .line 2308
    .line 2309
    const/16 v19, 0x3

    .line 2310
    .line 2311
    aget-object v2, v2, v19

    .line 2312
    .line 2313
    invoke-virtual {v5, v0, v2}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 2314
    .line 2315
    .line 2316
    move-result-object v2

    .line 2317
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 2318
    .line 2319
    .line 2320
    move-result v2

    .line 2321
    iget-object v5, v11, La/ejp0;->a:La/bop0;

    .line 2322
    .line 2323
    iget-byte v5, v5, La/bop0;->a:B

    .line 2324
    .line 2325
    invoke-direct {v3, v4, v2, v5}, La/ojp0;-><init>(III)V

    .line 2326
    .line 2327
    .line 2328
    new-instance v2, Lkotlin/Pair;

    .line 2329
    .line 2330
    const-string v4, "RESULT_ON_ITEM_SELECTED_LISTENER_KEY"

    .line 2331
    .line 2332
    invoke-direct {v2, v4, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2333
    .line 2334
    .line 2335
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 2336
    .line 2337
    .line 2338
    move-result-object v2

    .line 2339
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 2340
    .line 2341
    .line 2342
    move-result-object v2

    .line 2343
    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 2344
    .line 2345
    .line 2346
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2347
    .line 2348
    return-object v0

    .line 2349
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
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
