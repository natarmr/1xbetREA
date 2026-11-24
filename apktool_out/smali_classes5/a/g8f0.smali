.class public final La/g8f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/e1f0;

.field public final b:La/iw20;

.field public final c:La/knf0;

.field public final d:La/mne;


# direct methods
.method public constructor <init>(La/e1f0;La/iw20;La/knf0;La/mne;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/g8f0;->a:La/e1f0;

    .line 11
    .line 12
    iput-object p2, p0, La/g8f0;->b:La/iw20;

    .line 13
    .line 14
    iput-object p3, p0, La/g8f0;->c:La/knf0;

    .line 15
    .line 16
    iput-object p4, p0, La/g8f0;->d:La/mne;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/io/Serializable;
    .locals 10

    .line 1
    instance-of v0, p1, La/e8f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/e8f0;

    .line 7
    .line 8
    iget v1, v0, La/e8f0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/e8f0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/e8f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/e8f0;-><init>(La/g8f0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/e8f0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/e8f0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iput v4, v0, La/e8f0;->k:I

    .line 51
    .line 52
    iget-object p0, p0, La/g8f0;->a:La/e1f0;

    .line 53
    .line 54
    iget-object p0, p0, La/e1f0;->a:La/n0o0;

    .line 55
    .line 56
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    check-cast p0, La/xue0;

    .line 61
    .line 62
    iget-object p0, p0, La/xue0;->a:La/zdg0;

    .line 63
    .line 64
    new-instance p1, La/st20;

    .line 65
    .line 66
    const/4 v2, 0x2

    .line 67
    const/16 v5, 0x19

    .line 68
    .line 69
    invoke-direct {p1, v2, v3, v5}, La/st20;-><init>(ILa/yje;B)V

    .line 70
    .line 71
    .line 72
    const/4 v2, 0x0

    .line 73
    invoke-static {v0, p0, p1, v4, v2}, La/sj3;->w0(La/yje;La/zdg0;Lkotlin/jvm/functions/Function2;ZZ)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    if-ne p1, v1, :cond_3

    .line 78
    .line 79
    return-object v1

    .line 80
    :cond_3
    :goto_1
    check-cast p1, Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    new-instance p0, Ljava/util/HashSet;

    .line 86
    .line 87
    invoke-direct {p0}, Ljava/util/HashSet;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v0, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 100
    .line 101
    .line 102
    move-result v2

    .line 103
    if-eqz v2, :cond_5

    .line 104
    .line 105
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    move-object v4, v2

    .line 110
    check-cast v4, La/fze0;

    .line 111
    .line 112
    iget v4, v4, La/fze0;->b:I

    .line 113
    .line 114
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {p0, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v4

    .line 122
    if-eqz v4, :cond_4

    .line 123
    .line 124
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    .line 129
    .line 130
    const/16 v1, 0xa

    .line 131
    .line 132
    invoke-static {v0, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 133
    .line 134
    .line 135
    move-result v1

    .line 136
    invoke-direct {p0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    check-cast v1, La/fze0;

    .line 154
    .line 155
    iget v1, v1, La/fze0;->b:I

    .line 156
    .line 157
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 158
    .line 159
    .line 160
    move-result-object v1

    .line 161
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_6
    new-instance v0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 171
    .line 172
    .line 173
    move-result-object p0

    .line 174
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_2f

    .line 179
    .line 180
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    check-cast v1, Ljava/lang/Number;

    .line 185
    .line 186
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    new-instance v2, Ljava/util/ArrayList;

    .line 191
    .line 192
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 193
    .line 194
    .line 195
    new-instance v4, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v5

    .line 204
    :cond_7
    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v6

    .line 208
    if-eqz v6, :cond_8

    .line 209
    .line 210
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v6

    .line 214
    move-object v7, v6

    .line 215
    check-cast v7, La/fze0;

    .line 216
    .line 217
    iget v7, v7, La/fze0;->b:I

    .line 218
    .line 219
    if-ne v7, v1, :cond_7

    .line 220
    .line 221
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    goto :goto_5

    .line 225
    :cond_8
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    :cond_9
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v5

    .line 233
    if-eqz v5, :cond_2e

    .line 234
    .line 235
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v5

    .line 239
    check-cast v5, La/fze0;

    .line 240
    .line 241
    iget-object v6, v5, La/fze0;->c:Ljava/lang/String;

    .line 242
    .line 243
    iget-boolean v7, v5, La/fze0;->e:Z

    .line 244
    .line 245
    iget-boolean v8, v5, La/fze0;->d:Z

    .line 246
    .line 247
    invoke-virtual {v6}, Ljava/lang/String;->hashCode()I

    .line 248
    .line 249
    .line 250
    move-result v9

    .line 251
    sparse-switch v9, :sswitch_data_0

    .line 252
    .line 253
    .line 254
    goto/16 :goto_7

    .line 255
    .line 256
    :sswitch_0
    const-string v5, "FirstBonusChoice"

    .line 257
    .line 258
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-nez v5, :cond_a

    .line 263
    .line 264
    goto/16 :goto_7

    .line 265
    .line 266
    :cond_a
    new-instance v5, La/jze0;

    .line 267
    .line 268
    invoke-direct {v5, v8, v7}, La/jze0;-><init>(ZZ)V

    .line 269
    .line 270
    .line 271
    goto/16 :goto_8

    .line 272
    .line 273
    :sswitch_1
    const-string v5, "CityId"

    .line 274
    .line 275
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 276
    .line 277
    .line 278
    move-result v5

    .line 279
    if-nez v5, :cond_b

    .line 280
    .line 281
    goto/16 :goto_7

    .line 282
    .line 283
    :cond_b
    new-instance v5, La/lze0;

    .line 284
    .line 285
    invoke-direct {v5, v8, v7}, La/lze0;-><init>(ZZ)V

    .line 286
    .line 287
    .line 288
    goto/16 :goto_8

    .line 289
    .line 290
    :sswitch_2
    const-string v5, "SendEmailEvents"

    .line 291
    .line 292
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-nez v5, :cond_c

    .line 297
    .line 298
    goto/16 :goto_7

    .line 299
    .line 300
    :cond_c
    new-instance v5, La/m0f0;

    .line 301
    .line 302
    invoke-direct {v5, v8, v7}, La/m0f0;-><init>(ZZ)V

    .line 303
    .line 304
    .line 305
    goto/16 :goto_8

    .line 306
    .line 307
    :sswitch_3
    const-string v5, "Nationality"

    .line 308
    .line 309
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 310
    .line 311
    .line 312
    move-result v5

    .line 313
    if-nez v5, :cond_d

    .line 314
    .line 315
    goto/16 :goto_7

    .line 316
    .line 317
    :cond_d
    new-instance v5, La/kze0;

    .line 318
    .line 319
    invoke-direct {v5, v8, v7}, La/kze0;-><init>(ZZ)V

    .line 320
    .line 321
    .line 322
    goto/16 :goto_8

    .line 323
    .line 324
    :sswitch_4
    const-string v5, "SendSmsEvents"

    .line 325
    .line 326
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v5

    .line 330
    if-nez v5, :cond_e

    .line 331
    .line 332
    goto/16 :goto_7

    .line 333
    .line 334
    :cond_e
    new-instance v5, La/n0f0;

    .line 335
    .line 336
    invoke-direct {v5, v8, v7}, La/n0f0;-><init>(ZZ)V

    .line 337
    .line 338
    .line 339
    goto/16 :goto_8

    .line 340
    .line 341
    :sswitch_5
    const-string v5, "SendEmailBet"

    .line 342
    .line 343
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 344
    .line 345
    .line 346
    move-result v5

    .line 347
    if-nez v5, :cond_f

    .line 348
    .line 349
    goto/16 :goto_7

    .line 350
    .line 351
    :cond_f
    new-instance v5, La/l0f0;

    .line 352
    .line 353
    invoke-direct {v5, v8, v7}, La/l0f0;-><init>(ZZ)V

    .line 354
    .line 355
    .line 356
    goto/16 :goto_8

    .line 357
    .line 358
    :sswitch_6
    const-string v5, "RulesConfirmationAll"

    .line 359
    .line 360
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 361
    .line 362
    .line 363
    move-result v5

    .line 364
    if-nez v5, :cond_10

    .line 365
    .line 366
    goto/16 :goto_7

    .line 367
    .line 368
    :cond_10
    new-instance v5, La/j0f0;

    .line 369
    .line 370
    invoke-direct {v5, v8, v7}, La/j0f0;-><init>(ZZ)V

    .line 371
    .line 372
    .line 373
    goto/16 :goto_8

    .line 374
    .line 375
    :sswitch_7
    const-string v5, "PassportDateExpire"

    .line 376
    .line 377
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 378
    .line 379
    .line 380
    move-result v5

    .line 381
    if-nez v5, :cond_11

    .line 382
    .line 383
    goto/16 :goto_7

    .line 384
    .line 385
    :cond_11
    new-instance v5, La/yze0;

    .line 386
    .line 387
    invoke-direct {v5, v8, v7}, La/yze0;-><init>(ZZ)V

    .line 388
    .line 389
    .line 390
    goto/16 :goto_8

    .line 391
    .line 392
    :sswitch_8
    const-string v5, "Password"

    .line 393
    .line 394
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 395
    .line 396
    .line 397
    move-result v5

    .line 398
    if-nez v5, :cond_12

    .line 399
    .line 400
    goto/16 :goto_7

    .line 401
    .line 402
    :cond_12
    new-instance v5, La/b0f0;

    .line 403
    .line 404
    invoke-direct {v5, v8, v7}, La/b0f0;-><init>(ZZ)V

    .line 405
    .line 406
    .line 407
    goto/16 :goto_8

    .line 408
    .line 409
    :sswitch_9
    const-string v5, "Promocode"

    .line 410
    .line 411
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 412
    .line 413
    .line 414
    move-result v5

    .line 415
    if-nez v5, :cond_13

    .line 416
    .line 417
    goto/16 :goto_7

    .line 418
    .line 419
    :cond_13
    new-instance v5, La/f0f0;

    .line 420
    .line 421
    invoke-direct {v5, v8, v7}, La/f0f0;-><init>(ZZ)V

    .line 422
    .line 423
    .line 424
    goto/16 :goto_8

    .line 425
    .line 426
    :sswitch_a
    const-string v5, "MiddleName"

    .line 427
    .line 428
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 429
    .line 430
    .line 431
    move-result v5

    .line 432
    if-nez v5, :cond_14

    .line 433
    .line 434
    goto/16 :goto_7

    .line 435
    .line 436
    :cond_14
    new-instance v5, La/wze0;

    .line 437
    .line 438
    invoke-direct {v5, v8, v7}, La/wze0;-><init>(ZZ)V

    .line 439
    .line 440
    .line 441
    goto/16 :goto_8

    .line 442
    .line 443
    :sswitch_b
    const-string v9, "Birthday"

    .line 444
    .line 445
    invoke-virtual {v6, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-nez v6, :cond_15

    .line 450
    .line 451
    goto/16 :goto_7

    .line 452
    .line 453
    :cond_15
    new-instance v6, La/pze0;

    .line 454
    .line 455
    iget-object v5, v5, La/fze0;->f:Ljava/lang/String;

    .line 456
    .line 457
    if-nez v5, :cond_16

    .line 458
    .line 459
    const-string v5, ""

    .line 460
    .line 461
    :cond_16
    invoke-direct {v6, v5, v8, v7}, La/pze0;-><init>(Ljava/lang/String;ZZ)V

    .line 462
    .line 463
    .line 464
    move-object v5, v6

    .line 465
    goto/16 :goto_8

    .line 466
    .line 467
    :sswitch_c
    const-string v5, "PassportNumber"

    .line 468
    .line 469
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v5

    .line 473
    if-nez v5, :cond_17

    .line 474
    .line 475
    goto/16 :goto_7

    .line 476
    .line 477
    :cond_17
    new-instance v5, La/a0f0;

    .line 478
    .line 479
    invoke-direct {v5, v8, v7}, La/a0f0;-><init>(ZZ)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_8

    .line 483
    .line 484
    :sswitch_d
    const-string v5, "IsPoliticallyExposedPerson"

    .line 485
    .line 486
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 487
    .line 488
    .line 489
    move-result v5

    .line 490
    if-nez v5, :cond_18

    .line 491
    .line 492
    goto/16 :goto_7

    .line 493
    .line 494
    :cond_18
    new-instance v5, La/d0f0;

    .line 495
    .line 496
    invoke-direct {v5, v8, v7}, La/d0f0;-><init>(ZZ)V

    .line 497
    .line 498
    .line 499
    goto/16 :goto_8

    .line 500
    .line 501
    :sswitch_e
    const-string v5, "CurrencyId"

    .line 502
    .line 503
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v5

    .line 507
    if-nez v5, :cond_19

    .line 508
    .line 509
    goto/16 :goto_7

    .line 510
    .line 511
    :cond_19
    new-instance v5, La/oze0;

    .line 512
    .line 513
    invoke-direct {v5, v8, v7}, La/oze0;-><init>(ZZ)V

    .line 514
    .line 515
    .line 516
    goto/16 :goto_8

    .line 517
    .line 518
    :sswitch_f
    const-string v5, "Postcode"

    .line 519
    .line 520
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 521
    .line 522
    .line 523
    move-result v5

    .line 524
    if-nez v5, :cond_1a

    .line 525
    .line 526
    goto/16 :goto_7

    .line 527
    .line 528
    :cond_1a
    new-instance v5, La/e0f0;

    .line 529
    .line 530
    invoke-direct {v5, v8, v7}, La/e0f0;-><init>(ZZ)V

    .line 531
    .line 532
    .line 533
    goto/16 :goto_8

    .line 534
    .line 535
    :sswitch_10
    const-string v5, "Address"

    .line 536
    .line 537
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 538
    .line 539
    .line 540
    move-result v5

    .line 541
    if-nez v5, :cond_1b

    .line 542
    .line 543
    goto/16 :goto_7

    .line 544
    .line 545
    :cond_1b
    new-instance v5, La/gze0;

    .line 546
    .line 547
    invoke-direct {v5, v8, v7}, La/gze0;-><init>(ZZ)V

    .line 548
    .line 549
    .line 550
    goto/16 :goto_8

    .line 551
    .line 552
    :sswitch_11
    const-string v5, "AppsflyerId"

    .line 553
    .line 554
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 555
    .line 556
    .line 557
    move-result v5

    .line 558
    if-nez v5, :cond_1c

    .line 559
    .line 560
    goto/16 :goto_7

    .line 561
    .line 562
    :cond_1c
    sget-object v5, La/ize0;->c:La/ize0;

    .line 563
    .line 564
    goto/16 :goto_8

    .line 565
    .line 566
    :sswitch_12
    const-string v5, "SharePersonalDataConfirmation"

    .line 567
    .line 568
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 569
    .line 570
    .line 571
    move-result v5

    .line 572
    if-nez v5, :cond_1d

    .line 573
    .line 574
    goto/16 :goto_7

    .line 575
    .line 576
    :cond_1d
    new-instance v5, La/o0f0;

    .line 577
    .line 578
    invoke-direct {v5, v8, v7}, La/o0f0;-><init>(ZZ)V

    .line 579
    .line 580
    .line 581
    goto/16 :goto_8

    .line 582
    .line 583
    :sswitch_13
    const-string v5, "Phone"

    .line 584
    .line 585
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 586
    .line 587
    .line 588
    move-result v5

    .line 589
    if-nez v5, :cond_1e

    .line 590
    .line 591
    goto/16 :goto_7

    .line 592
    .line 593
    :cond_1e
    new-instance v5, La/c0f0;

    .line 594
    .line 595
    invoke-direct {v5, v8, v7}, La/c0f0;-><init>(ZZ)V

    .line 596
    .line 597
    .line 598
    goto/16 :goto_8

    .line 599
    .line 600
    :sswitch_14
    const-string v5, "Email"

    .line 601
    .line 602
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 603
    .line 604
    .line 605
    move-result v5

    .line 606
    if-nez v5, :cond_1f

    .line 607
    .line 608
    goto/16 :goto_7

    .line 609
    .line 610
    :cond_1f
    new-instance v5, La/rze0;

    .line 611
    .line 612
    invoke-direct {v5, v8, v7}, La/rze0;-><init>(ZZ)V

    .line 613
    .line 614
    .line 615
    goto/16 :goto_8

    .line 616
    .line 617
    :sswitch_15
    const-string v5, "Name"

    .line 618
    .line 619
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 620
    .line 621
    .line 622
    move-result v5

    .line 623
    if-nez v5, :cond_20

    .line 624
    .line 625
    goto/16 :goto_7

    .line 626
    .line 627
    :cond_20
    new-instance v5, La/sze0;

    .line 628
    .line 629
    invoke-direct {v5, v8, v7}, La/sze0;-><init>(ZZ)V

    .line 630
    .line 631
    .line 632
    goto/16 :goto_8

    .line 633
    .line 634
    :sswitch_16
    const-string v5, "Sex"

    .line 635
    .line 636
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 637
    .line 638
    .line 639
    move-result v5

    .line 640
    if-nez v5, :cond_21

    .line 641
    .line 642
    goto/16 :goto_7

    .line 643
    .line 644
    :cond_21
    new-instance v5, La/tze0;

    .line 645
    .line 646
    invoke-direct {v5, v8, v7}, La/tze0;-><init>(ZZ)V

    .line 647
    .line 648
    .line 649
    goto/16 :goto_8

    .line 650
    .line 651
    :sswitch_17
    const-string v5, "Surname"

    .line 652
    .line 653
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    move-result v5

    .line 657
    if-nez v5, :cond_22

    .line 658
    .line 659
    goto/16 :goto_7

    .line 660
    .line 661
    :cond_22
    new-instance v5, La/uze0;

    .line 662
    .line 663
    invoke-direct {v5, v8, v7}, La/uze0;-><init>(ZZ)V

    .line 664
    .line 665
    .line 666
    goto/16 :goto_8

    .line 667
    .line 668
    :sswitch_18
    const-string v5, "SocialNetId"

    .line 669
    .line 670
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 671
    .line 672
    .line 673
    move-result v5

    .line 674
    if-nez v5, :cond_23

    .line 675
    .line 676
    goto/16 :goto_7

    .line 677
    .line 678
    :cond_23
    new-instance v5, La/p0f0;

    .line 679
    .line 680
    invoke-direct {v5, v8, v7}, La/p0f0;-><init>(ZZ)V

    .line 681
    .line 682
    .line 683
    goto/16 :goto_8

    .line 684
    .line 685
    :sswitch_19
    const-string v5, "RegionId"

    .line 686
    .line 687
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 688
    .line 689
    .line 690
    move-result v5

    .line 691
    if-nez v5, :cond_24

    .line 692
    .line 693
    goto/16 :goto_7

    .line 694
    .line 695
    :cond_24
    new-instance v5, La/g0f0;

    .line 696
    .line 697
    invoke-direct {v5, v8, v7}, La/g0f0;-><init>(ZZ)V

    .line 698
    .line 699
    .line 700
    goto/16 :goto_8

    .line 701
    .line 702
    :sswitch_1a
    const-string v5, "CountryId"

    .line 703
    .line 704
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v5

    .line 708
    if-nez v5, :cond_25

    .line 709
    .line 710
    goto/16 :goto_7

    .line 711
    .line 712
    :cond_25
    new-instance v5, La/nze0;

    .line 713
    .line 714
    invoke-direct {v5, v8, v7}, La/nze0;-><init>(ZZ)V

    .line 715
    .line 716
    .line 717
    goto/16 :goto_8

    .line 718
    .line 719
    :sswitch_1b
    const-string v5, "MediaSourceId"

    .line 720
    .line 721
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 722
    .line 723
    .line 724
    move-result v5

    .line 725
    if-nez v5, :cond_26

    .line 726
    .line 727
    goto/16 :goto_7

    .line 728
    .line 729
    :cond_26
    sget-object v5, La/vze0;->c:La/vze0;

    .line 730
    .line 731
    goto/16 :goto_8

    .line 732
    .line 733
    :sswitch_1c
    const-string v5, "SurnameTwo"

    .line 734
    .line 735
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 736
    .line 737
    .line 738
    move-result v5

    .line 739
    if-nez v5, :cond_27

    .line 740
    .line 741
    goto :goto_7

    .line 742
    :cond_27
    new-instance v5, La/k0f0;

    .line 743
    .line 744
    invoke-direct {v5, v8, v7}, La/k0f0;-><init>(ZZ)V

    .line 745
    .line 746
    .line 747
    goto :goto_8

    .line 748
    :sswitch_1d
    const-string v5, "RulesConfirmation"

    .line 749
    .line 750
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result v5

    .line 754
    if-nez v5, :cond_28

    .line 755
    .line 756
    goto :goto_7

    .line 757
    :cond_28
    new-instance v5, La/i0f0;

    .line 758
    .line 759
    invoke-direct {v5, v8, v7}, La/i0f0;-><init>(ZZ)V

    .line 760
    .line 761
    .line 762
    goto :goto_8

    .line 763
    :sswitch_1e
    const-string v5, "RepeatPassword"

    .line 764
    .line 765
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v5

    .line 769
    if-nez v5, :cond_29

    .line 770
    .line 771
    goto :goto_7

    .line 772
    :cond_29
    new-instance v5, La/h0f0;

    .line 773
    .line 774
    invoke-direct {v5, v8, v7}, La/h0f0;-><init>(ZZ)V

    .line 775
    .line 776
    .line 777
    goto :goto_8

    .line 778
    :sswitch_1f
    const-string v5, "VidDoc"

    .line 779
    .line 780
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 781
    .line 782
    .line 783
    move-result v5

    .line 784
    if-nez v5, :cond_2a

    .line 785
    .line 786
    goto :goto_7

    .line 787
    :cond_2a
    new-instance v5, La/qze0;

    .line 788
    .line 789
    invoke-direct {v5, v8, v7}, La/qze0;-><init>(ZZ)V

    .line 790
    .line 791
    .line 792
    goto :goto_8

    .line 793
    :sswitch_20
    const-string v5, "PassportDateIssue"

    .line 794
    .line 795
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v5

    .line 799
    if-nez v5, :cond_2b

    .line 800
    .line 801
    goto :goto_7

    .line 802
    :cond_2b
    new-instance v5, La/zze0;

    .line 803
    .line 804
    invoke-direct {v5, v8, v7}, La/zze0;-><init>(ZZ)V

    .line 805
    .line 806
    .line 807
    goto :goto_8

    .line 808
    :sswitch_21
    const-string v5, "CommercialCommunicationSettings"

    .line 809
    .line 810
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 811
    .line 812
    .line 813
    move-result v5

    .line 814
    if-nez v5, :cond_2c

    .line 815
    .line 816
    goto :goto_7

    .line 817
    :cond_2c
    new-instance v5, La/mze0;

    .line 818
    .line 819
    invoke-direct {v5, v8, v7}, La/mze0;-><init>(ZZ)V

    .line 820
    .line 821
    .line 822
    goto :goto_8

    .line 823
    :sswitch_22
    const-string v5, "NotifyNewsCall"

    .line 824
    .line 825
    invoke-virtual {v6, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 826
    .line 827
    .line 828
    move-result v5

    .line 829
    if-nez v5, :cond_2d

    .line 830
    .line 831
    :goto_7
    move-object v5, v3

    .line 832
    goto :goto_8

    .line 833
    :cond_2d
    new-instance v5, La/xze0;

    .line 834
    .line 835
    invoke-direct {v5, v8, v7}, La/xze0;-><init>(ZZ)V

    .line 836
    .line 837
    .line 838
    :goto_8
    if-eqz v5, :cond_9

    .line 839
    .line 840
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 841
    .line 842
    .line 843
    goto/16 :goto_6

    .line 844
    .line 845
    :cond_2e
    new-instance v4, La/b1f0;

    .line 846
    .line 847
    sget-object v5, La/q7f0;->b:La/gne0;

    .line 848
    .line 849
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    invoke-static {v1}, La/gne0;->c(I)La/q7f0;

    .line 853
    .line 854
    .line 855
    move-result-object v1

    .line 856
    invoke-direct {v4, v1, v2}, La/b1f0;-><init>(La/q7f0;Ljava/util/ArrayList;)V

    .line 857
    .line 858
    .line 859
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 860
    .line 861
    .line 862
    goto/16 :goto_4

    .line 863
    .line 864
    :cond_2f
    return-object v0

    .line 865
    :sswitch_data_0
    .sparse-switch
        -0x74beb9a6 -> :sswitch_22
        -0x6e67e731 -> :sswitch_21
        -0x68945247 -> :sswitch_20
        -0x67491479 -> :sswitch_1f
        -0x6616b28a -> :sswitch_1e
        -0x61155154 -> :sswitch_1d
        -0x6000dc6f -> :sswitch_1c
        -0x442c4986 -> :sswitch_1b
        -0x37ee0ccf -> :sswitch_1a
        -0x254b58b1 -> :sswitch_19
        -0x142d03f5 -> :sswitch_18
        -0xb39d745 -> :sswitch_17
        0x14446 -> :sswitch_16
        0x24eeab -> :sswitch_15
        0x3ff5b7c -> :sswitch_14
        0x4984d4e -> :sswitch_13
        0x8f3823e -> :sswitch_12
        0x92a52c9 -> :sswitch_11
        0x1ed033d4 -> :sswitch_10
        0x31005aad -> :sswitch_f
        0x35e2152c -> :sswitch_e
        0x3c071ad5 -> :sswitch_d
        0x3ca24a1b -> :sswitch_c
        0x4397c69d -> :sswitch_b
        0x460cd1e0 -> :sswitch_a
        0x47c7775c -> :sswitch_9
        0x4c641ebb -> :sswitch_8
        0x4f7b943f -> :sswitch_7
        0x503dc355 -> :sswitch_6
        0x5055431d -> :sswitch_5
        0x516fdd0a -> :sswitch_4
        0x68f2659c -> :sswitch_3
        0x7815ff0d -> :sswitch_2
        0x7852e006 -> :sswitch_1
        0x78ce21f0 -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, La/f8f0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/f8f0;

    .line 7
    .line 8
    iget v1, v0, La/f8f0;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/f8f0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/f8f0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/f8f0;-><init>(La/g8f0;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/f8f0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/f8f0;->k:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v3

    .line 47
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, La/g8f0;->c:La/knf0;

    .line 51
    .line 52
    invoke-virtual {p1}, La/knf0;->b()I

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    iput v4, v0, La/f8f0;->k:I

    .line 57
    .line 58
    iget-object v2, p0, La/g8f0;->d:La/mne;

    .line 59
    .line 60
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 61
    .line 62
    new-instance v4, La/gc1;

    .line 63
    .line 64
    const/16 v5, 0x10

    .line 65
    .line 66
    invoke-direct {v4, p0, p1, v3, v5}, La/gc1;-><init>(Ljava/lang/Object;ILa/yje;B)V

    .line 67
    .line 68
    .line 69
    invoke-static {v2, v4, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v1, :cond_3

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0
.end method
