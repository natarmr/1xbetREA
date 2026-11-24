.class public final synthetic La/h9g0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i9g0;


# direct methods
.method public synthetic constructor <init>(La/i9g0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/h9g0;->a:B

    iput-object p1, p0, La/h9g0;->b:La/i9g0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/h9g0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xa

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v0, v0, La/h9g0;->b:La/i9g0;

    .line 11
    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v1, v0, La/i9g0;->p:La/n0o0;

    .line 16
    .line 17
    move-object/from16 v3, p1

    .line 18
    .line 19
    check-cast v3, Ljava/util/List;

    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    new-instance v5, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-static {v3, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_0

    .line 42
    .line 43
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    check-cast v6, La/dok0;

    .line 48
    .line 49
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    check-cast v7, La/fee;

    .line 54
    .line 55
    invoke-virtual {v7}, La/fee;->c()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 62
    .line 63
    .line 64
    move-result-wide v7

    .line 65
    iget-object v9, v0, La/i9g0;->a:La/ctf0;

    .line 66
    .line 67
    invoke-static {v6, v7, v8, v9}, La/tfx;->N(La/dok0;JLa/ctf0;)La/s8l0;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_0
    invoke-static {v5}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_2

    .line 88
    .line 89
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v3

    .line 93
    check-cast v3, La/dok0;

    .line 94
    .line 95
    invoke-interface {v3}, La/dok0;->a()J

    .line 96
    .line 97
    .line 98
    move-result-wide v5

    .line 99
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    check-cast v3, La/fee;

    .line 104
    .line 105
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    check-cast v3, Ljava/lang/Number;

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 112
    .line 113
    .line 114
    move-result-wide v7

    .line 115
    cmp-long v3, v5, v7

    .line 116
    .line 117
    if-nez v3, :cond_1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    add-int/lit8 v4, v4, 0x1

    .line 121
    .line 122
    goto :goto_1

    .line 123
    :cond_2
    const/4 v4, -0x1

    .line 124
    :goto_2
    new-instance v1, La/t3r0;

    .line 125
    .line 126
    invoke-direct {v1, v0, v4}, La/t3r0;-><init>(La/i4;I)V

    .line 127
    .line 128
    .line 129
    return-object v1

    .line 130
    :pswitch_0
    move-object/from16 v1, p1

    .line 131
    .line 132
    check-cast v1, Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    new-instance v2, La/ad50;

    .line 138
    .line 139
    iget-object v0, v0, La/i9g0;->a:La/ctf0;

    .line 140
    .line 141
    new-array v3, v4, [Ljava/lang/Object;

    .line 142
    .line 143
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 144
    .line 145
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    const v4, 0x7f1303ff

    .line 150
    .line 151
    .line 152
    invoke-virtual {v0, v4, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-direct {v2, v0, v1}, La/ad50;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    return-object v2

    .line 160
    :pswitch_1
    iget v0, v0, La/i9g0;->c:I

    .line 161
    .line 162
    move-object/from16 v1, p1

    .line 163
    .line 164
    check-cast v1, La/q5g0;

    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 170
    .line 171
    .line 172
    move-result v1

    .line 173
    if-eqz v1, :cond_6

    .line 174
    .line 175
    if-eq v1, v3, :cond_5

    .line 176
    .line 177
    const/4 v2, 0x2

    .line 178
    if-eq v1, v2, :cond_4

    .line 179
    .line 180
    const/4 v2, 0x3

    .line 181
    if-ne v1, v2, :cond_3

    .line 182
    .line 183
    new-instance v6, La/mdm;

    .line 184
    .line 185
    sget-object v1, La/pb10;->c:La/xuz;

    .line 186
    .line 187
    sget-object v2, La/pb10;->e:La/pb10;

    .line 188
    .line 189
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 193
    .line 194
    .line 195
    move-result v7

    .line 196
    const-wide/16 v17, 0x0

    .line 197
    .line 198
    const/16 v19, 0x3de

    .line 199
    .line 200
    const/4 v8, 0x0

    .line 201
    const/4 v9, 0x0

    .line 202
    const/4 v10, 0x0

    .line 203
    const/4 v11, 0x0

    .line 204
    const v12, 0x7f130e37

    .line 205
    .line 206
    .line 207
    const/4 v13, 0x0

    .line 208
    const/4 v14, 0x0

    .line 209
    const-wide/16 v15, 0x0

    .line 210
    .line 211
    invoke-direct/range {v6 .. v19}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 212
    .line 213
    .line 214
    move-object v5, v6

    .line 215
    goto :goto_3

    .line 216
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 217
    .line 218
    .line 219
    goto :goto_3

    .line 220
    :cond_4
    new-instance v7, La/mdm;

    .line 221
    .line 222
    sget-object v1, La/pb10;->c:La/xuz;

    .line 223
    .line 224
    sget-object v2, La/pb10;->g:La/pb10;

    .line 225
    .line 226
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    const-wide/16 v18, 0x0

    .line 234
    .line 235
    const/16 v20, 0x25e

    .line 236
    .line 237
    const/4 v9, 0x0

    .line 238
    const/4 v10, 0x0

    .line 239
    const/4 v11, 0x0

    .line 240
    const/4 v12, 0x0

    .line 241
    const v13, 0x7f1305c0

    .line 242
    .line 243
    .line 244
    const/4 v14, 0x0

    .line 245
    const v15, 0x7f131111

    .line 246
    .line 247
    .line 248
    const-wide/16 v16, 0x2710

    .line 249
    .line 250
    invoke-direct/range {v7 .. v20}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 251
    .line 252
    .line 253
    move-object v5, v7

    .line 254
    goto :goto_3

    .line 255
    :cond_5
    new-instance v8, La/mdm;

    .line 256
    .line 257
    sget-object v1, La/pb10;->c:La/xuz;

    .line 258
    .line 259
    sget-object v2, La/pb10;->g:La/pb10;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    invoke-static {v2, v0}, La/xuz;->a(La/pb10;I)I

    .line 265
    .line 266
    .line 267
    move-result v9

    .line 268
    const-wide/16 v19, 0x0

    .line 269
    .line 270
    const/16 v21, 0x25e

    .line 271
    .line 272
    const/4 v10, 0x0

    .line 273
    const/4 v11, 0x0

    .line 274
    const/4 v12, 0x0

    .line 275
    const/4 v13, 0x0

    .line 276
    const v14, 0x7f1307c4

    .line 277
    .line 278
    .line 279
    const/4 v15, 0x0

    .line 280
    const v16, 0x7f131690

    .line 281
    .line 282
    .line 283
    const-wide/16 v17, 0x2710

    .line 284
    .line 285
    invoke-direct/range {v8 .. v21}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 286
    .line 287
    .line 288
    move-object v5, v8

    .line 289
    :cond_6
    :goto_3
    return-object v5

    .line 290
    :pswitch_2
    move-object/from16 v1, p1

    .line 291
    .line 292
    check-cast v1, La/yl9;

    .line 293
    .line 294
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 295
    .line 296
    .line 297
    iget-object v0, v0, La/i9g0;->b:Ljava/util/Locale;

    .line 298
    .line 299
    iget-object v6, v1, La/yl9;->a:Ljava/util/Set;

    .line 300
    .line 301
    check-cast v6, Ljava/lang/Iterable;

    .line 302
    .line 303
    iget-object v1, v1, La/yl9;->b:Ljava/util/Date;

    .line 304
    .line 305
    invoke-static {v6, v1}, Lkotlin/collections/CollectionsKt;->X(Ljava/lang/Iterable;Ljava/lang/Object;)I

    .line 306
    .line 307
    .line 308
    move-result v1

    .line 309
    new-instance v7, Ljava/util/ArrayList;

    .line 310
    .line 311
    invoke-static {v6, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 312
    .line 313
    .line 314
    move-result v2

    .line 315
    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 316
    .line 317
    .line 318
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    move v6, v4

    .line 323
    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 324
    .line 325
    .line 326
    move-result v8

    .line 327
    if-eqz v8, :cond_a

    .line 328
    .line 329
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 330
    .line 331
    .line 332
    move-result-object v8

    .line 333
    add-int/lit8 v9, v6, 0x1

    .line 334
    .line 335
    if-ltz v6, :cond_9

    .line 336
    .line 337
    check-cast v8, Ljava/util/Date;

    .line 338
    .line 339
    new-instance v10, Ljava/text/SimpleDateFormat;

    .line 340
    .line 341
    const-string v11, "dd"

    .line 342
    .line 343
    invoke-direct {v10, v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 344
    .line 345
    .line 346
    invoke-virtual {v10, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v13

    .line 350
    new-instance v10, Ljava/text/SimpleDateFormat;

    .line 351
    .line 352
    const-string v11, "MMMM"

    .line 353
    .line 354
    invoke-direct {v10, v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v10, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 358
    .line 359
    .line 360
    move-result-object v14

    .line 361
    invoke-static {v8}, La/ntb;->U(Ljava/util/Date;)Z

    .line 362
    .line 363
    .line 364
    move-result v10

    .line 365
    if-nez v10, :cond_7

    .line 366
    .line 367
    new-instance v10, Ljava/text/SimpleDateFormat;

    .line 368
    .line 369
    const-string v11, "yyyy"

    .line 370
    .line 371
    invoke-direct {v10, v11, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 372
    .line 373
    .line 374
    invoke-virtual {v10, v8}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v10

    .line 378
    move-object v15, v10

    .line 379
    goto :goto_5

    .line 380
    :cond_7
    move-object v15, v5

    .line 381
    :goto_5
    new-instance v12, La/cdg0;

    .line 382
    .line 383
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    invoke-static {v8}, La/ntb;->W(Ljava/util/Date;)Z

    .line 390
    .line 391
    .line 392
    move-result v16

    .line 393
    if-ne v1, v6, :cond_8

    .line 394
    .line 395
    move/from16 v17, v3

    .line 396
    .line 397
    goto :goto_6

    .line 398
    :cond_8
    move/from16 v17, v4

    .line 399
    .line 400
    :goto_6
    invoke-direct/range {v12 .. v17}, La/cdg0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move v6, v9

    .line 407
    goto :goto_4

    .line 408
    :cond_9
    invoke-static {}, La/q3d;->p()V

    .line 409
    .line 410
    .line 411
    throw v5

    .line 412
    :cond_a
    invoke-static {v7}, La/dyb;->r0(Ljava/lang/Iterable;)La/i4;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    sget-object v2, La/vcg0;->a:La/vcg0;

    .line 417
    .line 418
    new-instance v3, La/apm;

    .line 419
    .line 420
    invoke-direct {v3, v0, v2, v1, v4}, La/apm;-><init>(La/a4x;La/vcg0;IZ)V

    .line 421
    .line 422
    .line 423
    return-object v3

    .line 424
    :pswitch_3
    move-object/from16 v1, p1

    .line 425
    .line 426
    check-cast v1, Ljava/util/List;

    .line 427
    .line 428
    invoke-static {v1}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v3

    .line 440
    if-eqz v3, :cond_e

    .line 441
    .line 442
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v3

    .line 446
    move-object v6, v3

    .line 447
    check-cast v6, La/d2w;

    .line 448
    .line 449
    iget-object v3, v0, La/i9g0;->d:La/n0o0;

    .line 450
    .line 451
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v3

    .line 455
    check-cast v3, La/fee;

    .line 456
    .line 457
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v3

    .line 461
    check-cast v3, Ljava/lang/Number;

    .line 462
    .line 463
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 464
    .line 465
    .line 466
    move-result v7

    .line 467
    iget-object v8, v0, La/i9g0;->a:La/ctf0;

    .line 468
    .line 469
    iget-object v3, v0, La/i9g0;->f:La/n0o0;

    .line 470
    .line 471
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v3

    .line 475
    check-cast v3, La/fee;

    .line 476
    .line 477
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    move-result-object v3

    .line 481
    check-cast v3, Ljava/util/Set;

    .line 482
    .line 483
    invoke-virtual {v6}, La/d2w;->b()J

    .line 484
    .line 485
    .line 486
    move-result-wide v9

    .line 487
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 488
    .line 489
    .line 490
    move-result-object v4

    .line 491
    invoke-interface {v3, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 492
    .line 493
    .line 494
    move-result v9

    .line 495
    iget-object v3, v0, La/i9g0;->j:La/n0o0;

    .line 496
    .line 497
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v3

    .line 501
    check-cast v3, La/fee;

    .line 502
    .line 503
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    move-result-object v3

    .line 507
    check-cast v3, Ljava/lang/Boolean;

    .line 508
    .line 509
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 510
    .line 511
    .line 512
    move-result v10

    .line 513
    iget-object v3, v0, La/i9g0;->k:La/n0o0;

    .line 514
    .line 515
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 516
    .line 517
    .line 518
    move-result-object v3

    .line 519
    check-cast v3, La/fee;

    .line 520
    .line 521
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    check-cast v3, Ljava/lang/Boolean;

    .line 526
    .line 527
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 528
    .line 529
    .line 530
    move-result v11

    .line 531
    iget-object v3, v0, La/i9g0;->g:La/n0o0;

    .line 532
    .line 533
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 534
    .line 535
    .line 536
    move-result-object v3

    .line 537
    check-cast v3, La/fee;

    .line 538
    .line 539
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 540
    .line 541
    .line 542
    move-result-object v3

    .line 543
    move-object v12, v3

    .line 544
    check-cast v12, La/v5l0;

    .line 545
    .line 546
    iget-object v3, v0, La/i9g0;->e:La/n0o0;

    .line 547
    .line 548
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 549
    .line 550
    .line 551
    move-result-object v3

    .line 552
    check-cast v3, La/fee;

    .line 553
    .line 554
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    check-cast v3, La/wcb;

    .line 559
    .line 560
    if-eqz v3, :cond_b

    .line 561
    .line 562
    invoke-virtual {v6}, La/d2w;->d()J

    .line 563
    .line 564
    .line 565
    move-result-wide v13

    .line 566
    move-object/from16 p0, v6

    .line 567
    .line 568
    invoke-virtual/range {p0 .. p0}, La/d2w;->g()J

    .line 569
    .line 570
    .line 571
    move-result-wide v5

    .line 572
    invoke-virtual {v3, v13, v14, v5, v6}, La/wcb;->a(JJ)Ljava/lang/String;

    .line 573
    .line 574
    .line 575
    move-result-object v3

    .line 576
    goto :goto_8

    .line 577
    :cond_b
    move-object/from16 p0, v6

    .line 578
    .line 579
    const/4 v3, 0x0

    .line 580
    :goto_8
    if-nez v3, :cond_c

    .line 581
    .line 582
    const-string v3, ""

    .line 583
    .line 584
    :cond_c
    move-object v13, v3

    .line 585
    iget-object v3, v0, La/i9g0;->l:La/n0o0;

    .line 586
    .line 587
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    check-cast v3, La/fee;

    .line 592
    .line 593
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 594
    .line 595
    .line 596
    move-result-object v3

    .line 597
    move-object v14, v3

    .line 598
    check-cast v14, Ljava/lang/String;

    .line 599
    .line 600
    iget-object v3, v0, La/i9g0;->h:La/n0o0;

    .line 601
    .line 602
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v3

    .line 606
    check-cast v3, La/fee;

    .line 607
    .line 608
    invoke-virtual {v3}, La/fee;->c()Ljava/lang/Object;

    .line 609
    .line 610
    .line 611
    move-result-object v3

    .line 612
    check-cast v3, Ljava/lang/Boolean;

    .line 613
    .line 614
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 615
    .line 616
    .line 617
    move-result v15

    .line 618
    move-object/from16 v6, p0

    .line 619
    .line 620
    invoke-static/range {v6 .. v15}, La/s0x;->g0(La/d2w;ILa/ctf0;ZZZLa/v5l0;Ljava/lang/String;Ljava/lang/String;Z)La/lla;

    .line 621
    .line 622
    .line 623
    move-result-object v3

    .line 624
    if-eqz v3, :cond_d

    .line 625
    .line 626
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 627
    .line 628
    .line 629
    :cond_d
    const/4 v5, 0x0

    .line 630
    goto/16 :goto_7

    .line 631
    .line 632
    :cond_e
    return-object v2

    .line 633
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
