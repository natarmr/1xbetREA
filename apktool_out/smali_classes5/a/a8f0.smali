.class public final synthetic La/a8f0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/bzt;

.field public final synthetic c:La/ctf0;


# direct methods
.method public synthetic constructor <init>(La/bzt;La/ctf0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/a8f0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a8f0;->b:La/bzt;

    iput-object p2, p0, La/a8f0;->c:La/ctf0;

    return-void
.end method

.method public synthetic constructor <init>(La/ctf0;La/bzt;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput-byte v0, p0, La/a8f0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/a8f0;->c:La/ctf0;

    iput-object p2, p0, La/a8f0;->b:La/bzt;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/a8f0;->a:B

    .line 4
    .line 5
    iget-object v3, v0, La/a8f0;->c:La/ctf0;

    .line 6
    .line 7
    iget-object v0, v0, La/a8f0;->b:La/bzt;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    const/4 v5, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/s0i0;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-boolean v7, v1, La/s0i0;->e:Z

    .line 25
    .line 26
    iget-object v8, v1, La/s0i0;->b:Ljava/lang/Long;

    .line 27
    .line 28
    if-eqz v7, :cond_0

    .line 29
    .line 30
    new-instance v0, La/v0i0;

    .line 31
    .line 32
    invoke-direct {v0, v4}, La/v0i0;-><init>(Z)V

    .line 33
    .line 34
    .line 35
    goto/16 :goto_d

    .line 36
    .line 37
    :cond_0
    if-eqz v8, :cond_11

    .line 38
    .line 39
    iget-object v7, v1, La/s0i0;->c:La/y0b;

    .line 40
    .line 41
    sget-object v9, La/y0b;->b:La/y0b;

    .line 42
    .line 43
    if-eq v7, v9, :cond_11

    .line 44
    .line 45
    iget-object v0, v1, La/s0i0;->a:La/toc0;

    .line 46
    .line 47
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    iget-boolean v9, v0, La/toc0;->p:Z

    .line 52
    .line 53
    const-string v10, "/"

    .line 54
    .line 55
    const-string v11, "https://"

    .line 56
    .line 57
    const/16 v12, 0x2f

    .line 58
    .line 59
    if-eqz v9, :cond_5

    .line 60
    .line 61
    new-instance v13, La/axa;

    .line 62
    .line 63
    sget-object v14, La/y0b;->c:La/y0b;

    .line 64
    .line 65
    new-array v9, v5, [Ljava/lang/Object;

    .line 66
    .line 67
    iget-object v15, v3, La/ctf0;->b:La/lsm0;

    .line 68
    .line 69
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    const v6, 0x7f130385

    .line 74
    .line 75
    .line 76
    invoke-virtual {v15, v6, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v15

    .line 80
    new-instance v6, La/n0x;

    .line 81
    .line 82
    new-instance v9, Ljava/lang/StringBuilder;

    .line 83
    .line 84
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-direct {v9, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 87
    .line 88
    .line 89
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 90
    .line 91
    const-string v4, "/static/img/android/actions/cashback_percent/promo_banner.webp"

    .line 92
    .line 93
    invoke-static {v4, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_1

    .line 98
    .line 99
    invoke-static {v4, v11, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_2

    .line 104
    .line 105
    :cond_1
    move/from16 p1, v12

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_2
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->length()I

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-lez v2, :cond_3

    .line 113
    .line 114
    invoke-static {v9, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 115
    .line 116
    .line 117
    move-result v2

    .line 118
    if-nez v2, :cond_3

    .line 119
    .line 120
    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    :cond_3
    move/from16 p1, v12

    .line 124
    .line 125
    const/4 v2, 0x1

    .line 126
    new-array v12, v2, [C

    .line 127
    .line 128
    aput-char p1, v12, v5

    .line 129
    .line 130
    invoke-static {v4, v12}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :goto_0
    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    :goto_1
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    invoke-direct {v6, v2}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    if-ne v7, v14, :cond_4

    .line 152
    .line 153
    const/16 v17, 0x1

    .line 154
    .line 155
    goto :goto_2

    .line 156
    :cond_4
    move/from16 v17, v5

    .line 157
    .line 158
    :goto_2
    const/16 v18, 0x0

    .line 159
    .line 160
    move-object/from16 v16, v6

    .line 161
    .line 162
    invoke-direct/range {v13 .. v18}, La/axa;-><init>(La/y0b;Ljava/lang/String;La/o0x;ZZ)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v1, v13}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    move/from16 p1, v12

    .line 170
    .line 171
    :goto_3
    iget-boolean v0, v0, La/toc0;->o:Z

    .line 172
    .line 173
    if-eqz v0, :cond_a

    .line 174
    .line 175
    new-instance v12, La/axa;

    .line 176
    .line 177
    sget-object v13, La/y0b;->d:La/y0b;

    .line 178
    .line 179
    new-array v0, v5, [Ljava/lang/Object;

    .line 180
    .line 181
    iget-object v2, v3, La/ctf0;->b:La/lsm0;

    .line 182
    .line 183
    invoke-static {v0, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    const v3, 0x7f130384

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3, v0}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v14

    .line 194
    new-instance v15, La/n0x;

    .line 195
    .line 196
    new-instance v0, Ljava/lang/StringBuilder;

    .line 197
    .line 198
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 199
    .line 200
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 201
    .line 202
    .line 203
    sget-object v2, La/ujn;->h:Ljava/lang/String;

    .line 204
    .line 205
    const-string v3, "/static/img/android/actions/cashback_percent/percent_banner_android.webp"

    .line 206
    .line 207
    invoke-static {v3, v2, v5}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    if-nez v2, :cond_8

    .line 212
    .line 213
    invoke-static {v3, v11, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v2

    .line 217
    if-eqz v2, :cond_6

    .line 218
    .line 219
    goto :goto_6

    .line 220
    :cond_6
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 221
    .line 222
    .line 223
    move-result v2

    .line 224
    if-lez v2, :cond_7

    .line 225
    .line 226
    invoke-static {v0, v10}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 227
    .line 228
    .line 229
    move-result v2

    .line 230
    if-nez v2, :cond_7

    .line 231
    .line 232
    move/from16 v2, p1

    .line 233
    .line 234
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 235
    .line 236
    .line 237
    :goto_4
    const/4 v4, 0x1

    .line 238
    goto :goto_5

    .line 239
    :cond_7
    move/from16 v2, p1

    .line 240
    .line 241
    goto :goto_4

    .line 242
    :goto_5
    new-array v6, v4, [C

    .line 243
    .line 244
    aput-char v2, v6, v5

    .line 245
    .line 246
    invoke-static {v3, v6}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v2

    .line 250
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    goto :goto_7

    .line 254
    :cond_8
    :goto_6
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 255
    .line 256
    .line 257
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 258
    .line 259
    .line 260
    :goto_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-direct {v15, v0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    if-ne v7, v13, :cond_9

    .line 268
    .line 269
    const/16 v16, 0x1

    .line 270
    .line 271
    goto :goto_8

    .line 272
    :cond_9
    move/from16 v16, v5

    .line 273
    .line 274
    :goto_8
    const/16 v17, 0x0

    .line 275
    .line 276
    invoke-direct/range {v12 .. v17}, La/axa;-><init>(La/y0b;Ljava/lang/String;La/o0x;ZZ)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v1, v12}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    :cond_a
    invoke-static {v1}, Lkotlin/collections/a;->a(Ljava/util/List;)La/lc00;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-virtual {v0}, La/e4;->b()I

    .line 287
    .line 288
    .line 289
    move-result v1

    .line 290
    const/4 v2, 0x1

    .line 291
    if-le v1, v2, :cond_b

    .line 292
    .line 293
    const/4 v14, 0x1

    .line 294
    goto :goto_9

    .line 295
    :cond_b
    move v14, v5

    .line 296
    :goto_9
    new-instance v1, Ljava/util/ArrayList;

    .line 297
    .line 298
    const/16 v2, 0xa

    .line 299
    .line 300
    invoke-static {v0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    :goto_a
    move-object v3, v2

    .line 312
    check-cast v3, La/paw;

    .line 313
    .line 314
    invoke-virtual {v3}, La/paw;->hasNext()Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-eqz v4, :cond_c

    .line 319
    .line 320
    invoke-virtual {v3}, La/paw;->next()Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    check-cast v3, La/axa;

    .line 325
    .line 326
    iget-object v10, v3, La/axa;->a:La/y0b;

    .line 327
    .line 328
    iget-object v11, v3, La/axa;->b:Ljava/lang/String;

    .line 329
    .line 330
    iget-object v12, v3, La/axa;->c:La/o0x;

    .line 331
    .line 332
    iget-boolean v13, v3, La/axa;->d:Z

    .line 333
    .line 334
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    new-instance v9, La/axa;

    .line 338
    .line 339
    invoke-direct/range {v9 .. v14}, La/axa;-><init>(La/y0b;Ljava/lang/String;La/o0x;ZZ)V

    .line 340
    .line 341
    .line 342
    invoke-virtual {v1, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    goto :goto_a

    .line 346
    :cond_c
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 347
    .line 348
    .line 349
    move-result-object v1

    .line 350
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 351
    .line 352
    .line 353
    move-result-wide v2

    .line 354
    invoke-virtual {v0}, La/e4;->b()I

    .line 355
    .line 356
    .line 357
    move-result v4

    .line 358
    const/4 v6, 0x1

    .line 359
    if-le v4, v6, :cond_d

    .line 360
    .line 361
    sget-object v0, La/o0i0;->a:La/o0i0;

    .line 362
    .line 363
    goto :goto_c

    .line 364
    :cond_d
    invoke-virtual {v0, v5}, La/lc00;->listIterator(I)Ljava/util/ListIterator;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    :cond_e
    move-object v4, v0

    .line 369
    check-cast v4, La/paw;

    .line 370
    .line 371
    invoke-virtual {v4}, La/paw;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v5

    .line 375
    if-eqz v5, :cond_f

    .line 376
    .line 377
    invoke-virtual {v4}, La/paw;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v4

    .line 381
    move-object v5, v4

    .line 382
    check-cast v5, La/axa;

    .line 383
    .line 384
    iget-boolean v5, v5, La/axa;->d:Z

    .line 385
    .line 386
    if-nez v5, :cond_e

    .line 387
    .line 388
    move-object v6, v4

    .line 389
    goto :goto_b

    .line 390
    :cond_f
    const/4 v6, 0x0

    .line 391
    :goto_b
    check-cast v6, La/axa;

    .line 392
    .line 393
    if-eqz v6, :cond_10

    .line 394
    .line 395
    new-instance v0, La/q0i0;

    .line 396
    .line 397
    iget-object v4, v6, La/axa;->a:La/y0b;

    .line 398
    .line 399
    iget-byte v4, v4, La/y0b;->a:B

    .line 400
    .line 401
    invoke-direct {v0, v4}, La/q0i0;-><init>(I)V

    .line 402
    .line 403
    .line 404
    goto :goto_c

    .line 405
    :cond_10
    sget-object v0, La/p0i0;->a:La/p0i0;

    .line 406
    .line 407
    :goto_c
    new-instance v4, La/t0i0;

    .line 408
    .line 409
    invoke-direct {v4, v1, v2, v3, v0}, La/t0i0;-><init>(La/a4x;JLa/r0i0;)V

    .line 410
    .line 411
    .line 412
    move-object v0, v4

    .line 413
    goto :goto_d

    .line 414
    :cond_11
    iget-boolean v1, v1, La/s0i0;->f:Z

    .line 415
    .line 416
    if-eqz v1, :cond_12

    .line 417
    .line 418
    new-instance v1, La/u0i0;

    .line 419
    .line 420
    new-instance v2, La/mdm;

    .line 421
    .line 422
    sget-object v3, La/pb10;->c:La/xuz;

    .line 423
    .line 424
    sget-object v4, La/pb10;->g:La/pb10;

    .line 425
    .line 426
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 427
    .line 428
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 429
    .line 430
    .line 431
    move-result-object v0

    .line 432
    iget v0, v0, La/v8d;->r:I

    .line 433
    .line 434
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 435
    .line 436
    .line 437
    invoke-static {v4, v0}, La/xuz;->a(La/pb10;I)I

    .line 438
    .line 439
    .line 440
    move-result v3

    .line 441
    const-wide/16 v13, 0x0

    .line 442
    .line 443
    const/16 v15, 0x25e

    .line 444
    .line 445
    const/4 v4, 0x0

    .line 446
    const/4 v5, 0x0

    .line 447
    const/4 v6, 0x0

    .line 448
    const/4 v7, 0x0

    .line 449
    const v8, 0x7f130677

    .line 450
    .line 451
    .line 452
    const/4 v9, 0x0

    .line 453
    const v10, 0x7f131690

    .line 454
    .line 455
    .line 456
    const-wide/16 v11, 0x2710

    .line 457
    .line 458
    invoke-direct/range {v2 .. v15}, La/mdm;-><init>(ILa/pdm;La/ldm;IIIIIJJI)V

    .line 459
    .line 460
    .line 461
    invoke-direct {v1, v2}, La/u0i0;-><init>(La/mdm;)V

    .line 462
    .line 463
    .line 464
    move-object v0, v1

    .line 465
    goto :goto_d

    .line 466
    :cond_12
    new-instance v0, La/v0i0;

    .line 467
    .line 468
    invoke-direct {v0, v5}, La/v0i0;-><init>(Z)V

    .line 469
    .line 470
    .line 471
    :goto_d
    return-object v0

    .line 472
    :pswitch_0
    move-object/from16 v1, p1

    .line 473
    .line 474
    check-cast v1, La/y7f0;

    .line 475
    .line 476
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 477
    .line 478
    .line 479
    iget-object v0, v0, La/bzt;->a:La/fsd;

    .line 480
    .line 481
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 482
    .line 483
    .line 484
    move-result-object v0

    .line 485
    iget-boolean v0, v0, La/v8d;->C:Z

    .line 486
    .line 487
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 488
    .line 489
    .line 490
    iget-object v2, v1, La/y7f0;->a:Ljava/util/List;

    .line 491
    .line 492
    new-instance v4, Ljava/util/ArrayList;

    .line 493
    .line 494
    const/16 v6, 0xa

    .line 495
    .line 496
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 497
    .line 498
    .line 499
    move-result v6

    .line 500
    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 501
    .line 502
    .line 503
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 504
    .line 505
    .line 506
    move-result-object v2

    .line 507
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 508
    .line 509
    .line 510
    move-result v6

    .line 511
    if-eqz v6, :cond_2d

    .line 512
    .line 513
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v6

    .line 517
    check-cast v6, La/q7f0;

    .line 518
    .line 519
    sget-object v7, La/q7f0;->h:La/q7f0;

    .line 520
    .line 521
    const v8, 0x7f080b6d

    .line 522
    .line 523
    .line 524
    const v9, 0x7f13111f

    .line 525
    .line 526
    .line 527
    if-ne v6, v7, :cond_15

    .line 528
    .line 529
    new-instance v7, La/d8f0;

    .line 530
    .line 531
    new-array v10, v5, [Ljava/lang/Object;

    .line 532
    .line 533
    iget-object v11, v3, La/ctf0;->b:La/lsm0;

    .line 534
    .line 535
    invoke-static {v10, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 536
    .line 537
    .line 538
    move-result-object v10

    .line 539
    invoke-virtual {v11, v9, v10}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v9

    .line 543
    sget-object v10, La/s6t0;->a:La/pz40;

    .line 544
    .line 545
    if-eqz v0, :cond_13

    .line 546
    .line 547
    sget-object v10, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 548
    .line 549
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 550
    .line 551
    .line 552
    move-result-wide v10

    .line 553
    goto :goto_f

    .line 554
    :cond_13
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 555
    .line 556
    .line 557
    move-result-object v10

    .line 558
    iget-object v10, v10, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 559
    .line 560
    invoke-virtual {v10}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 561
    .line 562
    .line 563
    move-result-wide v10

    .line 564
    :goto_f
    if-eqz v0, :cond_14

    .line 565
    .line 566
    sget-object v12, Lorg/xplatform/uikit/compose/color/CustomColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/CustomColors;

    .line 567
    .line 568
    invoke-virtual {v12}, Lorg/xplatform/uikit/compose/color/CustomColors;->getItsme-0d7_KjU()J

    .line 569
    .line 570
    .line 571
    move-result-wide v12

    .line 572
    new-instance v14, La/y3d;

    .line 573
    .line 574
    invoke-direct {v14, v12, v13}, La/y3d;-><init>(J)V

    .line 575
    .line 576
    .line 577
    goto :goto_10

    .line 578
    :cond_14
    const/4 v14, 0x0

    .line 579
    :goto_10
    invoke-static {v9, v8, v10, v11, v14}, La/p7x;->p(Ljava/lang/String;IJLa/y3d;)La/gy30;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    invoke-direct {v7, v6, v8}, La/d8f0;-><init>(La/q7f0;La/gy30;)V

    .line 584
    .line 585
    .line 586
    move-object v10, v7

    .line 587
    const/4 v7, 0x0

    .line 588
    const/4 v15, 0x1

    .line 589
    goto/16 :goto_17

    .line 590
    .line 591
    :cond_15
    iget-object v7, v1, La/y7f0;->b:Ljava/lang/Integer;

    .line 592
    .line 593
    new-instance v10, La/d8f0;

    .line 594
    .line 595
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 596
    .line 597
    .line 598
    move-result v11

    .line 599
    const/4 v12, 0x4

    .line 600
    const/4 v13, 0x3

    .line 601
    const/4 v14, 0x2

    .line 602
    if-eqz v11, :cond_25

    .line 603
    .line 604
    const/4 v15, 0x1

    .line 605
    if-eq v11, v15, :cond_24

    .line 606
    .line 607
    if-eq v11, v14, :cond_23

    .line 608
    .line 609
    if-eq v11, v13, :cond_17

    .line 610
    .line 611
    if-ne v11, v12, :cond_16

    .line 612
    .line 613
    new-array v11, v5, [Ljava/lang/Object;

    .line 614
    .line 615
    iget-object v15, v3, La/ctf0;->b:La/lsm0;

    .line 616
    .line 617
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v11

    .line 621
    invoke-virtual {v15, v9, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 622
    .line 623
    .line 624
    move-result-object v9

    .line 625
    goto/16 :goto_13

    .line 626
    .line 627
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 628
    .line 629
    .line 630
    :goto_11
    const/4 v6, 0x0

    .line 631
    goto/16 :goto_18

    .line 632
    .line 633
    :cond_17
    if-eqz v7, :cond_22

    .line 634
    .line 635
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 636
    .line 637
    .line 638
    move-result v9

    .line 639
    const/4 v15, 0x1

    .line 640
    if-eq v9, v15, :cond_21

    .line 641
    .line 642
    const/4 v11, 0x5

    .line 643
    if-eq v9, v11, :cond_20

    .line 644
    .line 645
    const/4 v11, 0x7

    .line 646
    if-eq v9, v11, :cond_1f

    .line 647
    .line 648
    const/16 v11, 0x9

    .line 649
    .line 650
    if-eq v9, v11, :cond_1e

    .line 651
    .line 652
    const/16 v11, 0xb

    .line 653
    .line 654
    if-eq v9, v11, :cond_1d

    .line 655
    .line 656
    const/16 v11, 0xd

    .line 657
    .line 658
    if-eq v9, v11, :cond_1c

    .line 659
    .line 660
    const/16 v11, 0x11

    .line 661
    .line 662
    if-eq v9, v11, :cond_1b

    .line 663
    .line 664
    const/16 v11, 0x13

    .line 665
    .line 666
    if-eq v9, v11, :cond_1a

    .line 667
    .line 668
    const/16 v11, 0x1a

    .line 669
    .line 670
    if-eq v9, v11, :cond_19

    .line 671
    .line 672
    const/16 v11, 0x1f

    .line 673
    .line 674
    if-eq v9, v11, :cond_18

    .line 675
    .line 676
    const/4 v9, -0x1

    .line 677
    goto :goto_12

    .line 678
    :cond_18
    const v9, 0x7f13130a

    .line 679
    .line 680
    .line 681
    goto :goto_12

    .line 682
    :cond_19
    const v9, 0x7f13130e

    .line 683
    .line 684
    .line 685
    goto :goto_12

    .line 686
    :cond_1a
    const v9, 0x7f131309

    .line 687
    .line 688
    .line 689
    goto :goto_12

    .line 690
    :cond_1b
    const v9, 0x7f131316

    .line 691
    .line 692
    .line 693
    goto :goto_12

    .line 694
    :cond_1c
    const v9, 0x7f13131c

    .line 695
    .line 696
    .line 697
    goto :goto_12

    .line 698
    :cond_1d
    const v9, 0x7f13130c

    .line 699
    .line 700
    .line 701
    goto :goto_12

    .line 702
    :cond_1e
    const v9, 0x7f13130f

    .line 703
    .line 704
    .line 705
    goto :goto_12

    .line 706
    :cond_1f
    const v9, 0x7f13131e

    .line 707
    .line 708
    .line 709
    goto :goto_12

    .line 710
    :cond_20
    const v9, 0x7f131315

    .line 711
    .line 712
    .line 713
    goto :goto_12

    .line 714
    :cond_21
    const v9, 0x7f13131a

    .line 715
    .line 716
    .line 717
    :goto_12
    new-array v11, v5, [Ljava/lang/Object;

    .line 718
    .line 719
    iget-object v15, v3, La/ctf0;->b:La/lsm0;

    .line 720
    .line 721
    invoke-static {v11, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 722
    .line 723
    .line 724
    move-result-object v11

    .line 725
    invoke-virtual {v15, v9, v11}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 726
    .line 727
    .line 728
    move-result-object v9

    .line 729
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 730
    .line 731
    .line 732
    move-result-object v9

    .line 733
    const/4 v11, 0x1

    .line 734
    invoke-static {v9, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v9

    .line 738
    const v11, 0x7f13113d

    .line 739
    .line 740
    .line 741
    invoke-virtual {v15, v11, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 742
    .line 743
    .line 744
    move-result-object v9

    .line 745
    goto :goto_13

    .line 746
    :cond_22
    new-array v9, v5, [Ljava/lang/Object;

    .line 747
    .line 748
    iget-object v11, v3, La/ctf0;->b:La/lsm0;

    .line 749
    .line 750
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 751
    .line 752
    .line 753
    move-result-object v9

    .line 754
    const v15, 0x7f131313

    .line 755
    .line 756
    .line 757
    invoke-virtual {v11, v15, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v9

    .line 761
    goto :goto_13

    .line 762
    :cond_23
    new-array v9, v5, [Ljava/lang/Object;

    .line 763
    .line 764
    iget-object v11, v3, La/ctf0;->b:La/lsm0;

    .line 765
    .line 766
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 767
    .line 768
    .line 769
    move-result-object v9

    .line 770
    const v15, 0x7f130e8e

    .line 771
    .line 772
    .line 773
    invoke-virtual {v11, v15, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 774
    .line 775
    .line 776
    move-result-object v9

    .line 777
    goto :goto_13

    .line 778
    :cond_24
    new-array v9, v5, [Ljava/lang/Object;

    .line 779
    .line 780
    iget-object v11, v3, La/ctf0;->b:La/lsm0;

    .line 781
    .line 782
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v9

    .line 786
    const v15, 0x7f131136

    .line 787
    .line 788
    .line 789
    invoke-virtual {v11, v15, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 790
    .line 791
    .line 792
    move-result-object v9

    .line 793
    goto :goto_13

    .line 794
    :cond_25
    new-array v9, v5, [Ljava/lang/Object;

    .line 795
    .line 796
    iget-object v11, v3, La/ctf0;->b:La/lsm0;

    .line 797
    .line 798
    invoke-static {v9, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v9

    .line 802
    const v15, 0x7f131135

    .line 803
    .line 804
    .line 805
    invoke-virtual {v11, v15, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 806
    .line 807
    .line 808
    move-result-object v9

    .line 809
    :goto_13
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    .line 810
    .line 811
    .line 812
    move-result v11

    .line 813
    if-eqz v11, :cond_2b

    .line 814
    .line 815
    const/4 v15, 0x1

    .line 816
    if-eq v11, v15, :cond_2a

    .line 817
    .line 818
    if-eq v11, v14, :cond_29

    .line 819
    .line 820
    if-eq v11, v13, :cond_27

    .line 821
    .line 822
    if-ne v11, v12, :cond_26

    .line 823
    .line 824
    goto :goto_14

    .line 825
    :cond_26
    invoke-static {}, La/t9f;->b()V

    .line 826
    .line 827
    .line 828
    goto/16 :goto_11

    .line 829
    .line 830
    :cond_27
    if-eqz v7, :cond_28

    .line 831
    .line 832
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 833
    .line 834
    .line 835
    move-result v8

    .line 836
    invoke-static {v8}, La/xvw;->K(I)I

    .line 837
    .line 838
    .line 839
    move-result v8

    .line 840
    goto :goto_14

    .line 841
    :cond_28
    const v8, 0x7f080b70

    .line 842
    .line 843
    .line 844
    goto :goto_14

    .line 845
    :cond_29
    const v8, 0x7f080b6e

    .line 846
    .line 847
    .line 848
    goto :goto_14

    .line 849
    :cond_2a
    const v8, 0x7f080b6f

    .line 850
    .line 851
    .line 852
    goto :goto_14

    .line 853
    :cond_2b
    const/4 v15, 0x1

    .line 854
    const v8, 0x7f080b6b

    .line 855
    .line 856
    .line 857
    :goto_14
    sget-object v11, La/q7f0;->g:La/q7f0;

    .line 858
    .line 859
    if-ne v6, v11, :cond_2c

    .line 860
    .line 861
    if-eqz v7, :cond_2c

    .line 862
    .line 863
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 864
    .line 865
    sget-object v7, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 866
    .line 867
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 868
    .line 869
    .line 870
    move-result-wide v11

    .line 871
    :goto_15
    const/4 v7, 0x0

    .line 872
    goto :goto_16

    .line 873
    :cond_2c
    sget-object v7, La/s6t0;->a:La/pz40;

    .line 874
    .line 875
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 876
    .line 877
    .line 878
    move-result-object v7

    .line 879
    iget-object v7, v7, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 880
    .line 881
    invoke-virtual {v7}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 882
    .line 883
    .line 884
    move-result-wide v11

    .line 885
    goto :goto_15

    .line 886
    :goto_16
    invoke-static {v9, v8, v11, v12, v7}, La/p7x;->p(Ljava/lang/String;IJLa/y3d;)La/gy30;

    .line 887
    .line 888
    .line 889
    move-result-object v8

    .line 890
    invoke-direct {v10, v6, v8}, La/d8f0;-><init>(La/q7f0;La/gy30;)V

    .line 891
    .line 892
    .line 893
    :goto_17
    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 894
    .line 895
    .line 896
    goto/16 :goto_e

    .line 897
    .line 898
    :cond_2d
    new-instance v6, La/z7f0;

    .line 899
    .line 900
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 901
    .line 902
    .line 903
    move-result v0

    .line 904
    new-array v1, v5, [Ljava/lang/Object;

    .line 905
    .line 906
    iget-object v2, v3, La/ctf0;->b:La/lsm0;

    .line 907
    .line 908
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v1

    .line 912
    const v3, 0x7f13112e

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 916
    .line 917
    .line 918
    move-result-object v1

    .line 919
    new-instance v3, La/v7f0;

    .line 920
    .line 921
    invoke-static {v4}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 922
    .line 923
    .line 924
    move-result-object v4

    .line 925
    new-instance v7, La/ww00;

    .line 926
    .line 927
    new-array v8, v5, [Ljava/lang/Object;

    .line 928
    .line 929
    invoke-static {v8, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 930
    .line 931
    .line 932
    move-result-object v8

    .line 933
    const v9, 0x7f1300f2

    .line 934
    .line 935
    .line 936
    invoke-virtual {v2, v9, v8}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    new-instance v9, La/wul;

    .line 941
    .line 942
    sget-object v10, La/qul;->e:La/qul;

    .line 943
    .line 944
    sget-object v11, La/oe9;->c:La/oe9;

    .line 945
    .line 946
    new-instance v12, La/ue9;

    .line 947
    .line 948
    new-array v13, v5, [Ljava/lang/Object;

    .line 949
    .line 950
    invoke-static {v13, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v5

    .line 954
    const v13, 0x7f130e55

    .line 955
    .line 956
    .line 957
    invoke-virtual {v2, v13, v5}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 958
    .line 959
    .line 960
    move-result-object v2

    .line 961
    invoke-direct {v12, v2}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    const/4 v14, 0x0

    .line 965
    const/4 v15, 0x0

    .line 966
    const/4 v13, 0x1

    .line 967
    invoke-direct/range {v9 .. v15}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 968
    .line 969
    .line 970
    invoke-direct {v7, v8, v9}, La/ww00;-><init>(Ljava/lang/String;La/wul;)V

    .line 971
    .line 972
    .line 973
    invoke-direct {v3, v4, v7}, La/v7f0;-><init>(La/a4x;La/ww00;)V

    .line 974
    .line 975
    .line 976
    invoke-direct {v6, v0, v1, v3}, La/z7f0;-><init>(ZLjava/lang/String;La/v7f0;)V

    .line 977
    .line 978
    .line 979
    :goto_18
    return-object v6

    .line 980
    nop

    .line 981
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
