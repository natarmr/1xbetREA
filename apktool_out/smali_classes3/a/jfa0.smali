.class public final synthetic La/jfa0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/jfa0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(IB)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/jfa0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v0, v0, La/jfa0;->a:B

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    sget-object v2, La/eyx;->a:La/eyx;

    .line 7
    .line 8
    sget-object v3, La/ayx;->a:La/ayx;

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const/16 v5, 0xa

    .line 12
    .line 13
    const/4 v6, 0x1

    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v0, p1

    .line 18
    .line 19
    check-cast v0, La/oyg0;

    .line 20
    .line 21
    move-object/from16 v6, p2

    .line 22
    .line 23
    check-cast v6, La/u2b0;

    .line 24
    .line 25
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 26
    .line 27
    new-instance v13, Ljava/util/ArrayList;

    .line 28
    .line 29
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 34
    .line 35
    .line 36
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    check-cast v1, La/df40;

    .line 51
    .line 52
    instance-of v3, v1, La/ne40;

    .line 53
    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    new-instance v1, La/ne40;

    .line 57
    .line 58
    invoke-direct {v1, v2}, La/ne40;-><init>(La/fyx;)V

    .line 59
    .line 60
    .line 61
    :cond_0
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/16 v14, 0x7ff

    .line 66
    .line 67
    const/4 v7, 0x0

    .line 68
    const/4 v8, 0x0

    .line 69
    const/4 v9, 0x0

    .line 70
    const/4 v10, 0x0

    .line 71
    const/4 v11, 0x0

    .line 72
    const/4 v12, 0x0

    .line 73
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    return-object v0

    .line 78
    :pswitch_0
    move-object/from16 v0, p1

    .line 79
    .line 80
    check-cast v0, La/oyg0;

    .line 81
    .line 82
    move-object/from16 v6, p2

    .line 83
    .line 84
    check-cast v6, La/u2b0;

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 93
    .line 94
    new-instance v13, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_3

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, La/df40;

    .line 118
    .line 119
    instance-of v2, v1, La/ue40;

    .line 120
    .line 121
    if-eqz v2, :cond_2

    .line 122
    .line 123
    new-instance v1, La/ue40;

    .line 124
    .line 125
    sget-object v2, La/dyx;->a:La/dyx;

    .line 126
    .line 127
    invoke-direct {v1, v2}, La/ue40;-><init>(La/fyx;)V

    .line 128
    .line 129
    .line 130
    :cond_2
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_3
    const/16 v14, 0x7ff

    .line 135
    .line 136
    const/4 v7, 0x0

    .line 137
    const/4 v8, 0x0

    .line 138
    const/4 v9, 0x0

    .line 139
    const/4 v10, 0x0

    .line 140
    const/4 v11, 0x0

    .line 141
    const/4 v12, 0x0

    .line 142
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    return-object v0

    .line 147
    :pswitch_1
    move-object/from16 v0, p1

    .line 148
    .line 149
    check-cast v0, La/oyg0;

    .line 150
    .line 151
    move-object/from16 v6, p2

    .line 152
    .line 153
    check-cast v6, La/u2b0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 162
    .line 163
    new-instance v13, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 170
    .line 171
    .line 172
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-eqz v1, :cond_5

    .line 181
    .line 182
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    move-result-object v1

    .line 186
    check-cast v1, La/df40;

    .line 187
    .line 188
    instance-of v2, v1, La/pe40;

    .line 189
    .line 190
    if-eqz v2, :cond_4

    .line 191
    .line 192
    move-object v2, v1

    .line 193
    check-cast v2, La/pe40;

    .line 194
    .line 195
    iget-object v2, v2, La/pe40;->a:La/w4t;

    .line 196
    .line 197
    instance-of v4, v2, La/t4t;

    .line 198
    .line 199
    if-eqz v4, :cond_4

    .line 200
    .line 201
    new-instance v1, La/pe40;

    .line 202
    .line 203
    invoke-direct {v1, v2, v3}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 204
    .line 205
    .line 206
    :cond_4
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 207
    .line 208
    .line 209
    goto :goto_2

    .line 210
    :cond_5
    const/16 v14, 0x7ff

    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    const/4 v8, 0x0

    .line 214
    const/4 v9, 0x0

    .line 215
    const/4 v10, 0x0

    .line 216
    const/4 v11, 0x0

    .line 217
    const/4 v12, 0x0

    .line 218
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    return-object v0

    .line 223
    :pswitch_2
    move-object/from16 v0, p1

    .line 224
    .line 225
    check-cast v0, La/oyg0;

    .line 226
    .line 227
    move-object/from16 v6, p2

    .line 228
    .line 229
    check-cast v6, La/u2b0;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 235
    .line 236
    .line 237
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 238
    .line 239
    new-instance v13, Ljava/util/ArrayList;

    .line 240
    .line 241
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 242
    .line 243
    .line 244
    move-result v1

    .line 245
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 246
    .line 247
    .line 248
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    if-eqz v1, :cond_7

    .line 257
    .line 258
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v1

    .line 262
    check-cast v1, La/df40;

    .line 263
    .line 264
    instance-of v2, v1, La/ne40;

    .line 265
    .line 266
    if-eqz v2, :cond_6

    .line 267
    .line 268
    new-instance v1, La/ne40;

    .line 269
    .line 270
    invoke-direct {v1, v3}, La/ne40;-><init>(La/fyx;)V

    .line 271
    .line 272
    .line 273
    :cond_6
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 274
    .line 275
    .line 276
    goto :goto_3

    .line 277
    :cond_7
    const/16 v14, 0x7ff

    .line 278
    .line 279
    const/4 v7, 0x0

    .line 280
    const/4 v8, 0x0

    .line 281
    const/4 v9, 0x0

    .line 282
    const/4 v10, 0x0

    .line 283
    const/4 v11, 0x0

    .line 284
    const/4 v12, 0x0

    .line 285
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    return-object v0

    .line 290
    :pswitch_3
    move-object/from16 v0, p1

    .line 291
    .line 292
    check-cast v0, La/oyg0;

    .line 293
    .line 294
    move-object/from16 v6, p2

    .line 295
    .line 296
    check-cast v6, La/u2b0;

    .line 297
    .line 298
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 305
    .line 306
    new-instance v13, Ljava/util/ArrayList;

    .line 307
    .line 308
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    invoke-direct {v13, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 313
    .line 314
    .line 315
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 320
    .line 321
    .line 322
    move-result v1

    .line 323
    if-eqz v1, :cond_9

    .line 324
    .line 325
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, La/df40;

    .line 330
    .line 331
    instance-of v2, v1, La/ve40;

    .line 332
    .line 333
    if-eqz v2, :cond_8

    .line 334
    .line 335
    new-instance v1, La/ve40;

    .line 336
    .line 337
    invoke-direct {v1, v3}, La/ve40;-><init>(La/fyx;)V

    .line 338
    .line 339
    .line 340
    :cond_8
    invoke-virtual {v13, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    goto :goto_4

    .line 344
    :cond_9
    const/16 v14, 0x7ff

    .line 345
    .line 346
    const/4 v7, 0x0

    .line 347
    const/4 v8, 0x0

    .line 348
    const/4 v9, 0x0

    .line 349
    const/4 v10, 0x0

    .line 350
    const/4 v11, 0x0

    .line 351
    const/4 v12, 0x0

    .line 352
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 353
    .line 354
    .line 355
    move-result-object v0

    .line 356
    return-object v0

    .line 357
    :pswitch_4
    move-object/from16 v0, p1

    .line 358
    .line 359
    check-cast v0, Ljava/lang/Throwable;

    .line 360
    .line 361
    move-object/from16 v1, p2

    .line 362
    .line 363
    check-cast v1, Ljava/lang/String;

    .line 364
    .line 365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 372
    .line 373
    return-object v0

    .line 374
    :pswitch_5
    move-object/from16 v0, p1

    .line 375
    .line 376
    check-cast v0, Ljava/lang/Throwable;

    .line 377
    .line 378
    move-object/from16 v1, p2

    .line 379
    .line 380
    check-cast v1, Ljava/lang/String;

    .line 381
    .line 382
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 383
    .line 384
    .line 385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 386
    .line 387
    .line 388
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 389
    .line 390
    return-object v0

    .line 391
    :pswitch_6
    move-object/from16 v0, p1

    .line 392
    .line 393
    check-cast v0, La/oyg0;

    .line 394
    .line 395
    move-object/from16 v6, p2

    .line 396
    .line 397
    check-cast v6, La/u2b0;

    .line 398
    .line 399
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 400
    .line 401
    .line 402
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    iget-object v0, v6, La/u2b0;->l:Ljava/util/List;

    .line 406
    .line 407
    new-instance v13, Ljava/util/ArrayList;

    .line 408
    .line 409
    invoke-static {v0, v5}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 410
    .line 411
    .line 412
    move-result v3

    .line 413
    invoke-direct {v13, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 414
    .line 415
    .line 416
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v0

    .line 420
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v3

    .line 424
    if-eqz v3, :cond_f

    .line 425
    .line 426
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v3

    .line 430
    check-cast v3, La/df40;

    .line 431
    .line 432
    invoke-interface {v3}, La/df40;->getState()La/fyx;

    .line 433
    .line 434
    .line 435
    move-result-object v4

    .line 436
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    instance-of v4, v4, La/ayx;

    .line 440
    .line 441
    if-eqz v4, :cond_e

    .line 442
    .line 443
    instance-of v4, v3, La/ue40;

    .line 444
    .line 445
    if-eqz v4, :cond_a

    .line 446
    .line 447
    new-instance v3, La/ue40;

    .line 448
    .line 449
    sget-object v4, La/byx;->a:La/byx;

    .line 450
    .line 451
    invoke-direct {v3, v4}, La/ue40;-><init>(La/fyx;)V

    .line 452
    .line 453
    .line 454
    goto :goto_6

    .line 455
    :cond_a
    instance-of v4, v3, La/pe40;

    .line 456
    .line 457
    if-eqz v4, :cond_b

    .line 458
    .line 459
    check-cast v3, La/pe40;

    .line 460
    .line 461
    iget-object v3, v3, La/pe40;->a:La/w4t;

    .line 462
    .line 463
    new-instance v4, La/pe40;

    .line 464
    .line 465
    invoke-direct {v4, v3, v2}, La/pe40;-><init>(La/w4t;La/fyx;)V

    .line 466
    .line 467
    .line 468
    move-object v3, v4

    .line 469
    goto :goto_6

    .line 470
    :cond_b
    instance-of v4, v3, La/ne40;

    .line 471
    .line 472
    if-eqz v4, :cond_c

    .line 473
    .line 474
    new-instance v3, La/ne40;

    .line 475
    .line 476
    invoke-direct {v3, v2}, La/ne40;-><init>(La/fyx;)V

    .line 477
    .line 478
    .line 479
    goto :goto_6

    .line 480
    :cond_c
    instance-of v3, v3, La/ve40;

    .line 481
    .line 482
    if-eqz v3, :cond_d

    .line 483
    .line 484
    new-instance v3, La/ve40;

    .line 485
    .line 486
    invoke-direct {v3, v2}, La/ve40;-><init>(La/fyx;)V

    .line 487
    .line 488
    .line 489
    goto :goto_6

    .line 490
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 491
    .line 492
    .line 493
    goto :goto_7

    .line 494
    :cond_e
    :goto_6
    invoke-virtual {v13, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    goto :goto_5

    .line 498
    :cond_f
    const/16 v14, 0x7ff

    .line 499
    .line 500
    const/4 v7, 0x0

    .line 501
    const/4 v8, 0x0

    .line 502
    const/4 v9, 0x0

    .line 503
    const/4 v10, 0x0

    .line 504
    const/4 v11, 0x0

    .line 505
    const/4 v12, 0x0

    .line 506
    invoke-static/range {v6 .. v14}, La/u2b0;->a(La/u2b0;ZZZZLjava/util/Set;La/hus;Ljava/util/AbstractList;I)La/u2b0;

    .line 507
    .line 508
    .line 509
    move-result-object v1

    .line 510
    :goto_7
    return-object v1

    .line 511
    :pswitch_7
    move-object/from16 v0, p1

    .line 512
    .line 513
    check-cast v0, Ljava/lang/Integer;

    .line 514
    .line 515
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 516
    .line 517
    .line 518
    move-result v0

    .line 519
    move-object/from16 v1, p2

    .line 520
    .line 521
    check-cast v1, La/j2b0;

    .line 522
    .line 523
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 524
    .line 525
    .line 526
    invoke-interface {v1}, La/j2b0;->getKey()Ljava/lang/String;

    .line 527
    .line 528
    .line 529
    move-result-object v1

    .line 530
    invoke-static {v0, v1}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 531
    .line 532
    .line 533
    move-result-object v0

    .line 534
    return-object v0

    .line 535
    :pswitch_8
    move-object/from16 v0, p1

    .line 536
    .line 537
    check-cast v0, La/oyg0;

    .line 538
    .line 539
    move-object/from16 v0, p2

    .line 540
    .line 541
    check-cast v0, La/d0b0;

    .line 542
    .line 543
    invoke-static {v0, v4, v6}, La/h8x;->z(La/d0b0;ZZ)La/d0b0;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    return-object v0

    .line 548
    :pswitch_9
    move-object/from16 v0, p1

    .line 549
    .line 550
    check-cast v0, La/oyg0;

    .line 551
    .line 552
    move-object/from16 v0, p2

    .line 553
    .line 554
    check-cast v0, La/d0b0;

    .line 555
    .line 556
    invoke-static {v0, v6, v4}, La/h8x;->z(La/d0b0;ZZ)La/d0b0;

    .line 557
    .line 558
    .line 559
    move-result-object v0

    .line 560
    return-object v0

    .line 561
    :pswitch_a
    move-object/from16 v0, p1

    .line 562
    .line 563
    check-cast v0, La/oyg0;

    .line 564
    .line 565
    move-object/from16 v1, p2

    .line 566
    .line 567
    check-cast v1, La/d0b0;

    .line 568
    .line 569
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 570
    .line 571
    .line 572
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 573
    .line 574
    .line 575
    iget-object v0, v1, La/d0b0;->d:La/b0b0;

    .line 576
    .line 577
    iget-object v0, v0, La/b0b0;->c:La/uhc0;

    .line 578
    .line 579
    invoke-static {v1, v4, v6, v0}, La/h8x;->D(La/d0b0;ZZLa/uhc0;)La/d0b0;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    return-object v0

    .line 584
    :pswitch_b
    move-object/from16 v0, p1

    .line 585
    .line 586
    check-cast v0, La/oyg0;

    .line 587
    .line 588
    move-object/from16 v1, p2

    .line 589
    .line 590
    check-cast v1, La/d0b0;

    .line 591
    .line 592
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 596
    .line 597
    .line 598
    iget-object v0, v1, La/d0b0;->b:La/zza0;

    .line 599
    .line 600
    iget-object v0, v0, La/zza0;->c:Ljava/util/List;

    .line 601
    .line 602
    invoke-static {v1, v4, v6, v0}, La/h8x;->B(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 603
    .line 604
    .line 605
    move-result-object v0

    .line 606
    return-object v0

    .line 607
    :pswitch_c
    move-object/from16 v0, p1

    .line 608
    .line 609
    check-cast v0, La/oyg0;

    .line 610
    .line 611
    move-object/from16 v7, p2

    .line 612
    .line 613
    check-cast v7, La/d0b0;

    .line 614
    .line 615
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    .line 617
    .line 618
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    iget-object v0, v7, La/d0b0;->c:La/yza0;

    .line 622
    .line 623
    iget-object v0, v0, La/yza0;->c:Ljava/util/List;

    .line 624
    .line 625
    new-instance v10, La/yza0;

    .line 626
    .line 627
    invoke-direct {v10, v0, v4, v6}, La/yza0;-><init>(Ljava/util/List;ZZ)V

    .line 628
    .line 629
    .line 630
    iget-object v0, v7, La/d0b0;->b:La/zza0;

    .line 631
    .line 632
    iget-object v0, v0, La/zza0;->c:Ljava/util/List;

    .line 633
    .line 634
    new-instance v9, La/zza0;

    .line 635
    .line 636
    invoke-direct {v9, v0, v4, v6}, La/zza0;-><init>(Ljava/util/List;ZZ)V

    .line 637
    .line 638
    .line 639
    const/16 v18, 0x0

    .line 640
    .line 641
    const/16 v19, 0xff9

    .line 642
    .line 643
    const/4 v8, 0x0

    .line 644
    const/4 v11, 0x0

    .line 645
    const/4 v12, 0x0

    .line 646
    const/4 v13, 0x0

    .line 647
    const/4 v14, 0x0

    .line 648
    const/4 v15, 0x0

    .line 649
    const/16 v16, 0x0

    .line 650
    .line 651
    const/16 v17, 0x0

    .line 652
    .line 653
    invoke-static/range {v7 .. v19}, La/d0b0;->a(La/d0b0;La/xza0;La/zza0;La/yza0;La/b0b0;Ljava/util/Set;ZZZZLa/a0b0;ZI)La/d0b0;

    .line 654
    .line 655
    .line 656
    move-result-object v0

    .line 657
    return-object v0

    .line 658
    :pswitch_d
    move-object/from16 v0, p1

    .line 659
    .line 660
    check-cast v0, La/oyg0;

    .line 661
    .line 662
    move-object/from16 v1, p2

    .line 663
    .line 664
    check-cast v1, La/d0b0;

    .line 665
    .line 666
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 667
    .line 668
    .line 669
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 670
    .line 671
    .line 672
    iget-object v0, v1, La/d0b0;->c:La/yza0;

    .line 673
    .line 674
    iget-object v0, v0, La/yza0;->c:Ljava/util/List;

    .line 675
    .line 676
    invoke-static {v1, v4, v6, v0}, La/h8x;->A(La/d0b0;ZZLjava/util/List;)La/d0b0;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    return-object v0

    .line 681
    :pswitch_e
    move-object/from16 v0, p1

    .line 682
    .line 683
    check-cast v0, Ljava/lang/Throwable;

    .line 684
    .line 685
    move-object/from16 v1, p2

    .line 686
    .line 687
    check-cast v1, Ljava/lang/String;

    .line 688
    .line 689
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 696
    .line 697
    return-object v0

    .line 698
    :pswitch_f
    move-object/from16 v0, p1

    .line 699
    .line 700
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 701
    .line 702
    move-object/from16 v1, p2

    .line 703
    .line 704
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 705
    .line 706
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 710
    .line 711
    .line 712
    new-instance v2, La/kma0;

    .line 713
    .line 714
    const/4 v3, 0x6

    .line 715
    invoke-direct {v2, v3}, La/kma0;-><init>(B)V

    .line 716
    .line 717
    .line 718
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 719
    .line 720
    .line 721
    new-instance v0, La/npa0;

    .line 722
    .line 723
    const/16 v2, 0x8

    .line 724
    .line 725
    invoke-direct {v0, v2}, La/npa0;-><init>(B)V

    .line 726
    .line 727
    .line 728
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 729
    .line 730
    .line 731
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_10
    move-object/from16 v0, p1

    .line 735
    .line 736
    check-cast v0, Ljava/lang/Throwable;

    .line 737
    .line 738
    move-object/from16 v1, p2

    .line 739
    .line 740
    check-cast v1, Ljava/lang/String;

    .line 741
    .line 742
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 746
    .line 747
    .line 748
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 749
    .line 750
    return-object v0

    .line 751
    :pswitch_11
    move-object/from16 v0, p1

    .line 752
    .line 753
    check-cast v0, Ljava/lang/Integer;

    .line 754
    .line 755
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 756
    .line 757
    .line 758
    move-object/from16 v0, p2

    .line 759
    .line 760
    check-cast v0, La/era0;

    .line 761
    .line 762
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 763
    .line 764
    .line 765
    instance-of v1, v0, La/bra0;

    .line 766
    .line 767
    if-eqz v1, :cond_10

    .line 768
    .line 769
    check-cast v0, La/bra0;

    .line 770
    .line 771
    iget-object v0, v0, La/bra0;->b:Ljava/lang/String;

    .line 772
    .line 773
    const-string v1, "-1 "

    .line 774
    .line 775
    invoke-static {v1, v0}, La/kng0;->k(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 776
    .line 777
    .line 778
    move-result-object v0

    .line 779
    goto :goto_8

    .line 780
    :cond_10
    invoke-interface {v0}, La/era0;->getId()J

    .line 781
    .line 782
    .line 783
    move-result-wide v1

    .line 784
    invoke-interface {v0}, La/era0;->getTitle()Ljava/lang/String;

    .line 785
    .line 786
    .line 787
    move-result-object v3

    .line 788
    invoke-interface {v0}, La/era0;->c()J

    .line 789
    .line 790
    .line 791
    move-result-wide v4

    .line 792
    invoke-interface {v0}, La/era0;->b()Ljava/lang/String;

    .line 793
    .line 794
    .line 795
    move-result-object v0

    .line 796
    new-instance v6, Ljava/lang/StringBuilder;

    .line 797
    .line 798
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 799
    .line 800
    .line 801
    invoke-virtual {v6, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 802
    .line 803
    .line 804
    const-string v1, " "

    .line 805
    .line 806
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 807
    .line 808
    .line 809
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 810
    .line 811
    .line 812
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 813
    .line 814
    .line 815
    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 816
    .line 817
    .line 818
    invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 819
    .line 820
    .line 821
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 822
    .line 823
    .line 824
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 825
    .line 826
    .line 827
    move-result-object v0

    .line 828
    :goto_8
    return-object v0

    .line 829
    :pswitch_12
    move-object/from16 v0, p1

    .line 830
    .line 831
    check-cast v0, Landroid/view/LayoutInflater;

    .line 832
    .line 833
    move-object/from16 v1, p2

    .line 834
    .line 835
    check-cast v1, Landroid/view/ViewGroup;

    .line 836
    .line 837
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    invoke-static {v0, v1}, La/dux;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/dux;

    .line 844
    .line 845
    .line 846
    move-result-object v0

    .line 847
    return-object v0

    .line 848
    :pswitch_13
    move-object/from16 v0, p1

    .line 849
    .line 850
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 851
    .line 852
    move-object/from16 v1, p2

    .line 853
    .line 854
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 855
    .line 856
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 860
    .line 861
    .line 862
    new-instance v2, La/kma0;

    .line 863
    .line 864
    invoke-direct {v2, v6}, La/kma0;-><init>(B)V

    .line 865
    .line 866
    .line 867
    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    new-instance v0, La/npa0;

    .line 871
    .line 872
    const/4 v2, 0x5

    .line 873
    invoke-direct {v0, v2}, La/npa0;-><init>(B)V

    .line 874
    .line 875
    .line 876
    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 877
    .line 878
    .line 879
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 880
    .line 881
    return-object v0

    .line 882
    :pswitch_14
    move-object/from16 v0, p1

    .line 883
    .line 884
    check-cast v0, Ljava/lang/Integer;

    .line 885
    .line 886
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 887
    .line 888
    .line 889
    move-object/from16 v0, p2

    .line 890
    .line 891
    check-cast v0, La/a2n;

    .line 892
    .line 893
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-interface {v0}, La/a2n;->getKey()Ljava/lang/String;

    .line 897
    .line 898
    .line 899
    move-result-object v0

    .line 900
    return-object v0

    .line 901
    :pswitch_15
    move-object/from16 v0, p1

    .line 902
    .line 903
    check-cast v0, Landroid/view/LayoutInflater;

    .line 904
    .line 905
    move-object/from16 v1, p2

    .line 906
    .line 907
    check-cast v1, Landroid/view/ViewGroup;

    .line 908
    .line 909
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 913
    .line 914
    .line 915
    invoke-static {v0, v1}, La/zvx;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/zvx;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    return-object v0

    .line 920
    :pswitch_16
    move-object/from16 v0, p1

    .line 921
    .line 922
    check-cast v0, La/fet;

    .line 923
    .line 924
    move-object/from16 v1, p2

    .line 925
    .line 926
    check-cast v1, Ljava/lang/Integer;

    .line 927
    .line 928
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-static {v6}, La/x8x;->L(I)I

    .line 932
    .line 933
    .line 934
    move-result v1

    .line 935
    invoke-static {v1, v0}, La/ahy;->z(ILa/fet;)V

    .line 936
    .line 937
    .line 938
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 939
    .line 940
    return-object v0

    .line 941
    :pswitch_17
    move-object/from16 v0, p1

    .line 942
    .line 943
    check-cast v0, La/fet;

    .line 944
    .line 945
    move-object/from16 v1, p2

    .line 946
    .line 947
    check-cast v1, Ljava/lang/Integer;

    .line 948
    .line 949
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 950
    .line 951
    .line 952
    invoke-static {v6}, La/x8x;->L(I)I

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    invoke-static {v1, v0}, La/knx;->s(ILa/fet;)V

    .line 957
    .line 958
    .line 959
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 960
    .line 961
    return-object v0

    .line 962
    :pswitch_18
    move-object/from16 v0, p1

    .line 963
    .line 964
    check-cast v0, La/fet;

    .line 965
    .line 966
    move-object/from16 v1, p2

    .line 967
    .line 968
    check-cast v1, Ljava/lang/Integer;

    .line 969
    .line 970
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 971
    .line 972
    .line 973
    invoke-static {v6}, La/x8x;->L(I)I

    .line 974
    .line 975
    .line 976
    move-result v1

    .line 977
    invoke-static {v1, v0}, La/mrv;->M(ILa/fet;)V

    .line 978
    .line 979
    .line 980
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 981
    .line 982
    return-object v0

    .line 983
    :pswitch_19
    move-object/from16 v0, p1

    .line 984
    .line 985
    check-cast v0, La/fet;

    .line 986
    .line 987
    move-object/from16 v1, p2

    .line 988
    .line 989
    check-cast v1, Ljava/lang/Integer;

    .line 990
    .line 991
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 992
    .line 993
    .line 994
    invoke-static {v6}, La/x8x;->L(I)I

    .line 995
    .line 996
    .line 997
    move-result v1

    .line 998
    invoke-static {v1, v0}, La/mrv;->W(ILa/fet;)V

    .line 999
    .line 1000
    .line 1001
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1002
    .line 1003
    return-object v0

    .line 1004
    :pswitch_1a
    move-object/from16 v0, p1

    .line 1005
    .line 1006
    check-cast v0, La/fet;

    .line 1007
    .line 1008
    move-object/from16 v1, p2

    .line 1009
    .line 1010
    check-cast v1, Ljava/lang/Integer;

    .line 1011
    .line 1012
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1013
    .line 1014
    .line 1015
    invoke-static {v6}, La/x8x;->L(I)I

    .line 1016
    .line 1017
    .line 1018
    move-result v1

    .line 1019
    invoke-static {v1, v0}, La/ntr;->H(ILa/fet;)V

    .line 1020
    .line 1021
    .line 1022
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1023
    .line 1024
    return-object v0

    .line 1025
    :pswitch_1b
    move-object/from16 v0, p1

    .line 1026
    .line 1027
    check-cast v0, Ljava/lang/Integer;

    .line 1028
    .line 1029
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 1030
    .line 1031
    .line 1032
    move-result v0

    .line 1033
    move-object/from16 v2, p2

    .line 1034
    .line 1035
    check-cast v2, La/ka00;

    .line 1036
    .line 1037
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    instance-of v3, v2, La/ia00;

    .line 1041
    .line 1042
    const-string v4, "_"

    .line 1043
    .line 1044
    if-eqz v3, :cond_11

    .line 1045
    .line 1046
    check-cast v2, La/ia00;

    .line 1047
    .line 1048
    iget-object v1, v2, La/ia00;->a:Ljava/lang/String;

    .line 1049
    .line 1050
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1051
    .line 1052
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1053
    .line 1054
    .line 1055
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1059
    .line 1060
    .line 1061
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1062
    .line 1063
    .line 1064
    move-result-object v1

    .line 1065
    goto :goto_9

    .line 1066
    :cond_11
    instance-of v3, v2, La/ja00;

    .line 1067
    .line 1068
    if-eqz v3, :cond_12

    .line 1069
    .line 1070
    check-cast v2, La/ja00;

    .line 1071
    .line 1072
    iget-object v1, v2, La/ja00;->a:Ljava/lang/String;

    .line 1073
    .line 1074
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1075
    .line 1076
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1077
    .line 1078
    .line 1079
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1080
    .line 1081
    .line 1082
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1083
    .line 1084
    .line 1085
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1086
    .line 1087
    .line 1088
    move-result-object v1

    .line 1089
    goto :goto_9

    .line 1090
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 1091
    .line 1092
    .line 1093
    :goto_9
    return-object v1

    .line 1094
    :pswitch_1c
    move-object/from16 v0, p1

    .line 1095
    .line 1096
    check-cast v0, Landroid/view/LayoutInflater;

    .line 1097
    .line 1098
    move-object/from16 v1, p2

    .line 1099
    .line 1100
    check-cast v1, Landroid/view/ViewGroup;

    .line 1101
    .line 1102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1106
    .line 1107
    .line 1108
    invoke-static {v0, v1}, La/vjd;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/vjd;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    return-object v0

    .line 1113
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
