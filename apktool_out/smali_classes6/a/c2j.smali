.class public final synthetic La/c2j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d2j;


# direct methods
.method public synthetic constructor <init>(La/d2j;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c2j;->a:B

    iput-object p1, p0, La/c2j;->b:La/d2j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/c2j;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/c2j;->b:La/d2j;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/n85;

    .line 14
    .line 15
    new-instance v1, La/omm;

    .line 16
    .line 17
    iget-object v2, v0, La/d2j;->g:La/n0o0;

    .line 18
    .line 19
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, La/fee;

    .line 24
    .line 25
    invoke-virtual {v2}, La/fee;->b()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, La/a4x;

    .line 30
    .line 31
    iget-object v3, v0, La/d2j;->e:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, La/fee;

    .line 38
    .line 39
    invoke-virtual {v3}, La/fee;->b()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, La/wul;

    .line 44
    .line 45
    iget-object v0, v0, La/d2j;->f:La/n0o0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/fee;

    .line 52
    .line 53
    invoke-virtual {v0}, La/fee;->b()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    check-cast v0, La/wul;

    .line 58
    .line 59
    invoke-direct {v1, v2, v3, v0}, La/omm;-><init>(La/a4x;La/wul;La/wul;)V

    .line 60
    .line 61
    .line 62
    return-object v1

    .line 63
    :pswitch_0
    move-object/from16 v1, p1

    .line 64
    .line 65
    check-cast v1, La/n85;

    .line 66
    .line 67
    iget-object v0, v0, La/d2j;->b:La/ctf0;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    if-nez v1, :cond_0

    .line 73
    .line 74
    sget-object v0, La/lak0;->c:La/lak0;

    .line 75
    .line 76
    goto/16 :goto_2

    .line 77
    .line 78
    :cond_0
    iget-object v3, v1, La/n85;->l:La/suo0;

    .line 79
    .line 80
    iget-object v4, v1, La/n85;->k:La/huo0;

    .line 81
    .line 82
    iget-object v1, v1, La/n85;->h:La/sba0;

    .line 83
    .line 84
    const/4 v5, 0x0

    .line 85
    invoke-static {v5, v5, v5}, La/jeb;->Q(La/sba0;La/huo0;La/suo0;)La/n0x;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-static {v1, v4, v3}, La/jeb;->Q(La/sba0;La/huo0;La/suo0;)La/n0x;

    .line 90
    .line 91
    .line 92
    move-result-object v7

    .line 93
    const/4 v8, 0x2

    .line 94
    new-array v9, v8, [La/o0x;

    .line 95
    .line 96
    aput-object v6, v9, v2

    .line 97
    .line 98
    const/4 v6, 0x1

    .line 99
    aput-object v7, v9, v6

    .line 100
    .line 101
    invoke-static {v9}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 102
    .line 103
    .line 104
    move-result-object v6

    .line 105
    new-array v7, v2, [Ljava/lang/Object;

    .line 106
    .line 107
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 108
    .line 109
    invoke-static {v7, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    const v9, 0x7f13063e

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v9, v7}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v7

    .line 120
    new-array v9, v2, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v9

    .line 126
    const v10, 0x7f130640

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v9

    .line 133
    filled-new-array {v7, v9}, [Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    invoke-static {v7}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v7

    .line 141
    new-array v9, v2, [Ljava/lang/Object;

    .line 142
    .line 143
    invoke-static {v9, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    const v10, 0x7f13063d

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v10, v9}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v9

    .line 154
    sget-object v10, La/sba0;->d:La/sba0;

    .line 155
    .line 156
    const/4 v11, 0x6

    .line 157
    const-string v12, "\u200e"

    .line 158
    .line 159
    if-ne v1, v10, :cond_1

    .line 160
    .line 161
    instance-of v13, v4, La/wdt;

    .line 162
    .line 163
    if-eqz v13, :cond_1

    .line 164
    .line 165
    instance-of v13, v3, La/puo0;

    .line 166
    .line 167
    if-eqz v13, :cond_1

    .line 168
    .line 169
    check-cast v4, La/wdt;

    .line 170
    .line 171
    iget-object v1, v4, La/wdt;->a:La/wqd;

    .line 172
    .line 173
    iget-object v4, v4, La/wdt;->b:La/mzb0;

    .line 174
    .line 175
    iget-object v13, v4, La/mzb0;->b:Ljava/lang/String;

    .line 176
    .line 177
    sget-object v4, La/pn40;->a:La/pn40;

    .line 178
    .line 179
    iget-wide v14, v1, La/wqd;->e:D

    .line 180
    .line 181
    invoke-static {v14, v15, v8}, La/pn40;->i(DI)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    invoke-virtual {v12, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v14

    .line 189
    iget-object v15, v1, La/wqd;->b:Ljava/lang/String;

    .line 190
    .line 191
    check-cast v3, La/puo0;

    .line 192
    .line 193
    iget v1, v3, La/puo0;->a:I

    .line 194
    .line 195
    move-object/from16 p0, v5

    .line 196
    .line 197
    move-object/from16 p1, v6

    .line 198
    .line 199
    int-to-double v5, v1

    .line 200
    invoke-static {v5, v6, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v12, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v16

    .line 208
    iget-object v1, v3, La/puo0;->b:La/pms;

    .line 209
    .line 210
    iget-object v1, v1, La/pms;->b:Ljava/lang/String;

    .line 211
    .line 212
    iget-object v3, v3, La/puo0;->c:La/mzb0;

    .line 213
    .line 214
    iget-object v3, v3, La/mzb0;->b:Ljava/lang/String;

    .line 215
    .line 216
    move-object/from16 v17, v1

    .line 217
    .line 218
    move-object/from16 v18, v3

    .line 219
    .line 220
    filled-new-array/range {v13 .. v18}, [Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v1

    .line 224
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    const v3, 0x7f130646

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    goto/16 :goto_0

    .line 236
    .line 237
    :cond_1
    move-object/from16 p0, v5

    .line 238
    .line 239
    move-object/from16 p1, v6

    .line 240
    .line 241
    const/4 v5, 0x5

    .line 242
    if-ne v1, v10, :cond_2

    .line 243
    .line 244
    instance-of v6, v4, La/ydt;

    .line 245
    .line 246
    if-eqz v6, :cond_2

    .line 247
    .line 248
    instance-of v6, v3, La/puo0;

    .line 249
    .line 250
    if-eqz v6, :cond_2

    .line 251
    .line 252
    check-cast v4, La/ydt;

    .line 253
    .line 254
    sget-object v1, La/pn40;->a:La/pn40;

    .line 255
    .line 256
    iget-object v1, v4, La/ydt;->a:La/xqd;

    .line 257
    .line 258
    iget v1, v1, La/xqd;->e:I

    .line 259
    .line 260
    int-to-double v10, v1

    .line 261
    invoke-static {v10, v11, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 262
    .line 263
    .line 264
    move-result-object v1

    .line 265
    iget-object v4, v4, La/ydt;->b:La/mzb0;

    .line 266
    .line 267
    iget-object v4, v4, La/mzb0;->b:Ljava/lang/String;

    .line 268
    .line 269
    check-cast v3, La/puo0;

    .line 270
    .line 271
    iget v6, v3, La/puo0;->a:I

    .line 272
    .line 273
    int-to-double v10, v6

    .line 274
    invoke-static {v10, v11, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v6

    .line 278
    invoke-virtual {v12, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v6

    .line 282
    iget-object v8, v3, La/puo0;->b:La/pms;

    .line 283
    .line 284
    iget-object v8, v8, La/pms;->b:Ljava/lang/String;

    .line 285
    .line 286
    iget-object v3, v3, La/puo0;->c:La/mzb0;

    .line 287
    .line 288
    iget-object v3, v3, La/mzb0;->b:Ljava/lang/String;

    .line 289
    .line 290
    filled-new-array {v1, v4, v6, v8, v3}, [Ljava/lang/Object;

    .line 291
    .line 292
    .line 293
    move-result-object v1

    .line 294
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    const v3, 0x7f130645

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 302
    .line 303
    .line 304
    move-result-object v0

    .line 305
    goto/16 :goto_0

    .line 306
    .line 307
    :cond_2
    if-ne v1, v10, :cond_3

    .line 308
    .line 309
    instance-of v6, v4, La/xdt;

    .line 310
    .line 311
    if-eqz v6, :cond_3

    .line 312
    .line 313
    instance-of v6, v3, La/puo0;

    .line 314
    .line 315
    if-eqz v6, :cond_3

    .line 316
    .line 317
    check-cast v4, La/xdt;

    .line 318
    .line 319
    iget-object v1, v4, La/xdt;->a:La/wqd;

    .line 320
    .line 321
    iget-object v4, v4, La/xdt;->b:La/mzb0;

    .line 322
    .line 323
    iget-object v13, v4, La/mzb0;->b:Ljava/lang/String;

    .line 324
    .line 325
    sget-object v4, La/pn40;->a:La/pn40;

    .line 326
    .line 327
    iget-wide v4, v1, La/wqd;->e:D

    .line 328
    .line 329
    invoke-static {v4, v5, v8}, La/pn40;->i(DI)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object v4

    .line 333
    invoke-virtual {v12, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v14

    .line 337
    iget-object v15, v1, La/wqd;->b:Ljava/lang/String;

    .line 338
    .line 339
    check-cast v3, La/puo0;

    .line 340
    .line 341
    iget v1, v3, La/puo0;->a:I

    .line 342
    .line 343
    int-to-double v4, v1

    .line 344
    invoke-static {v4, v5, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 345
    .line 346
    .line 347
    move-result-object v1

    .line 348
    invoke-virtual {v12, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v16

    .line 352
    iget-object v1, v3, La/puo0;->b:La/pms;

    .line 353
    .line 354
    iget-object v1, v1, La/pms;->b:Ljava/lang/String;

    .line 355
    .line 356
    iget-object v3, v3, La/puo0;->c:La/mzb0;

    .line 357
    .line 358
    iget-object v3, v3, La/mzb0;->b:Ljava/lang/String;

    .line 359
    .line 360
    move-object/from16 v17, v1

    .line 361
    .line 362
    move-object/from16 v18, v3

    .line 363
    .line 364
    filled-new-array/range {v13 .. v18}, [Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-static {v1, v11}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    const v3, 0x7f130642

    .line 373
    .line 374
    .line 375
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    goto :goto_0

    .line 380
    :cond_3
    if-ne v1, v10, :cond_4

    .line 381
    .line 382
    instance-of v1, v4, La/zdt;

    .line 383
    .line 384
    if-eqz v1, :cond_4

    .line 385
    .line 386
    instance-of v1, v3, La/puo0;

    .line 387
    .line 388
    if-eqz v1, :cond_4

    .line 389
    .line 390
    check-cast v4, La/zdt;

    .line 391
    .line 392
    sget-object v1, La/pn40;->a:La/pn40;

    .line 393
    .line 394
    iget-object v1, v4, La/zdt;->a:La/xqd;

    .line 395
    .line 396
    iget v1, v1, La/xqd;->e:I

    .line 397
    .line 398
    int-to-double v10, v1

    .line 399
    invoke-static {v10, v11, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    iget-object v4, v4, La/zdt;->b:La/mzb0;

    .line 404
    .line 405
    iget-object v4, v4, La/mzb0;->b:Ljava/lang/String;

    .line 406
    .line 407
    check-cast v3, La/puo0;

    .line 408
    .line 409
    iget v6, v3, La/puo0;->a:I

    .line 410
    .line 411
    int-to-double v10, v6

    .line 412
    invoke-static {v10, v11, v2}, La/pn40;->i(DI)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v6

    .line 416
    invoke-virtual {v12, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 417
    .line 418
    .line 419
    move-result-object v6

    .line 420
    iget-object v8, v3, La/puo0;->b:La/pms;

    .line 421
    .line 422
    iget-object v8, v8, La/pms;->b:Ljava/lang/String;

    .line 423
    .line 424
    iget-object v3, v3, La/puo0;->c:La/mzb0;

    .line 425
    .line 426
    iget-object v3, v3, La/mzb0;->b:Ljava/lang/String;

    .line 427
    .line 428
    filled-new-array {v1, v4, v6, v8, v3}, [Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-static {v1, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 433
    .line 434
    .line 435
    move-result-object v1

    .line 436
    const v3, 0x7f130644

    .line 437
    .line 438
    .line 439
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v0

    .line 443
    goto :goto_0

    .line 444
    :cond_4
    new-array v1, v2, [Ljava/lang/Object;

    .line 445
    .line 446
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    const v3, 0x7f130792

    .line 451
    .line 452
    .line 453
    invoke-virtual {v0, v3, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    :goto_0
    filled-new-array {v9, v0}, [Ljava/lang/String;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    new-instance v1, Ljava/util/ArrayList;

    .line 466
    .line 467
    const/16 v3, 0xa

    .line 468
    .line 469
    move-object/from16 v4, p1

    .line 470
    .line 471
    invoke-static {v4, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 472
    .line 473
    .line 474
    move-result v3

    .line 475
    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 476
    .line 477
    .line 478
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 479
    .line 480
    .line 481
    move-result-object v3

    .line 482
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 483
    .line 484
    .line 485
    move-result v4

    .line 486
    if-eqz v4, :cond_6

    .line 487
    .line 488
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v4

    .line 492
    add-int/lit8 v5, v2, 0x1

    .line 493
    .line 494
    if-ltz v2, :cond_5

    .line 495
    .line 496
    check-cast v4, La/o0x;

    .line 497
    .line 498
    new-instance v6, La/uj60;

    .line 499
    .line 500
    const v8, 0x7f080e16

    .line 501
    .line 502
    .line 503
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 504
    .line 505
    .line 506
    move-result-object v8

    .line 507
    invoke-interface {v7, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    check-cast v9, Ljava/lang/String;

    .line 512
    .line 513
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    check-cast v2, Ljava/lang/String;

    .line 518
    .line 519
    invoke-direct {v6, v4, v8, v9, v2}, La/uj60;-><init>(La/o0x;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 523
    .line 524
    .line 525
    move v2, v5

    .line 526
    goto :goto_1

    .line 527
    :cond_5
    invoke-static {}, La/q3d;->p()V

    .line 528
    .line 529
    .line 530
    throw p0

    .line 531
    :cond_6
    invoke-static {v1}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 532
    .line 533
    .line 534
    move-result-object v0

    .line 535
    :goto_2
    return-object v0

    .line 536
    :pswitch_1
    move-object/from16 v1, p1

    .line 537
    .line 538
    check-cast v1, Ljava/lang/Boolean;

    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 541
    .line 542
    .line 543
    move-result v1

    .line 544
    sget-object v4, La/lul;->e:La/lul;

    .line 545
    .line 546
    sget-object v5, La/oe9;->a:La/oe9;

    .line 547
    .line 548
    new-instance v6, La/ue9;

    .line 549
    .line 550
    iget-object v0, v0, La/d2j;->b:La/ctf0;

    .line 551
    .line 552
    if-eqz v1, :cond_7

    .line 553
    .line 554
    new-array v1, v2, [Ljava/lang/Object;

    .line 555
    .line 556
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 557
    .line 558
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 559
    .line 560
    .line 561
    move-result-object v1

    .line 562
    const v2, 0x7f130dfb

    .line 563
    .line 564
    .line 565
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 566
    .line 567
    .line 568
    move-result-object v0

    .line 569
    goto :goto_3

    .line 570
    :cond_7
    new-array v1, v2, [Ljava/lang/Object;

    .line 571
    .line 572
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 573
    .line 574
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 575
    .line 576
    .line 577
    move-result-object v1

    .line 578
    const v2, 0x7f130649

    .line 579
    .line 580
    .line 581
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    :goto_3
    invoke-direct {v6, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 586
    .line 587
    .line 588
    new-instance v3, La/wul;

    .line 589
    .line 590
    const/4 v8, 0x0

    .line 591
    const/4 v9, 0x1

    .line 592
    const/4 v7, 0x1

    .line 593
    invoke-direct/range {v3 .. v9}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 594
    .line 595
    .line 596
    return-object v3

    .line 597
    :pswitch_2
    move-object/from16 v1, p1

    .line 598
    .line 599
    check-cast v1, Ljava/lang/Boolean;

    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 602
    .line 603
    .line 604
    move-result v1

    .line 605
    sget-object v4, La/qul;->e:La/qul;

    .line 606
    .line 607
    sget-object v5, La/oe9;->a:La/oe9;

    .line 608
    .line 609
    new-instance v6, La/ue9;

    .line 610
    .line 611
    iget-object v0, v0, La/d2j;->b:La/ctf0;

    .line 612
    .line 613
    if-eqz v1, :cond_8

    .line 614
    .line 615
    new-array v1, v2, [Ljava/lang/Object;

    .line 616
    .line 617
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 618
    .line 619
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 620
    .line 621
    .line 622
    move-result-object v1

    .line 623
    const v2, 0x7f1312e2

    .line 624
    .line 625
    .line 626
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    goto :goto_4

    .line 631
    :cond_8
    new-array v1, v2, [Ljava/lang/Object;

    .line 632
    .line 633
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 634
    .line 635
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 636
    .line 637
    .line 638
    move-result-object v1

    .line 639
    const v2, 0x7f130648

    .line 640
    .line 641
    .line 642
    invoke-virtual {v0, v2, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 643
    .line 644
    .line 645
    move-result-object v0

    .line 646
    :goto_4
    invoke-direct {v6, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 647
    .line 648
    .line 649
    new-instance v3, La/wul;

    .line 650
    .line 651
    const/4 v8, 0x0

    .line 652
    const/4 v9, 0x1

    .line 653
    const/4 v7, 0x1

    .line 654
    invoke-direct/range {v3 .. v9}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 655
    .line 656
    .line 657
    return-object v3

    .line 658
    nop

    .line 659
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
