.class public final synthetic La/vef;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/vef;->a:B

    iput-object p1, p0, La/vef;->b:Ljava/lang/Object;

    iput-object p2, p0, La/vef;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 15

    .line 1
    iget-byte v0, p0, La/vef;->a:B

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v5, p0, La/vef;->c:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object p0, p0, La/vef;->b:Ljava/lang/Object;

    .line 11
    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    check-cast p0, La/xqk;

    .line 16
    .line 17
    iget-object v0, p0, La/xqk;->k:La/n0o0;

    .line 18
    .line 19
    iget-object v3, p0, La/xqk;->m:La/n0o0;

    .line 20
    .line 21
    iget-object v4, p0, La/xqk;->l:La/n0o0;

    .line 22
    .line 23
    iget-object v6, p0, La/xqk;->j:La/n0o0;

    .line 24
    .line 25
    iget-object v7, p0, La/xqk;->i:La/n0o0;

    .line 26
    .line 27
    iget-object v8, p0, La/xqk;->h:La/n0o0;

    .line 28
    .line 29
    check-cast v5, La/ksk;

    .line 30
    .line 31
    iget-object p0, p0, La/xqk;->g:La/n0o0;

    .line 32
    .line 33
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v9

    .line 37
    check-cast v9, La/fee;

    .line 38
    .line 39
    iget-object v5, v5, La/ksk;->d:La/j0g0;

    .line 40
    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    iget-object v10, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 44
    .line 45
    instance-of v11, v10, La/g0g0;

    .line 46
    .line 47
    if-eqz v11, :cond_0

    .line 48
    .line 49
    move-object v10, v2

    .line 50
    :cond_0
    check-cast v10, La/kuk;

    .line 51
    .line 52
    if-eqz v10, :cond_2

    .line 53
    .line 54
    iget-object v10, v10, La/kuk;->g:La/j0g0;

    .line 55
    .line 56
    if-eqz v10, :cond_2

    .line 57
    .line 58
    iget-object v10, v10, La/j0g0;->a:Ljava/lang/Object;

    .line 59
    .line 60
    instance-of v11, v10, La/g0g0;

    .line 61
    .line 62
    if-eqz v11, :cond_1

    .line 63
    .line 64
    move-object v10, v2

    .line 65
    :cond_1
    check-cast v10, Ljava/util/List;

    .line 66
    .line 67
    if-nez v10, :cond_3

    .line 68
    .line 69
    :cond_2
    sget-object v10, La/iun;->a:La/iun;

    .line 70
    .line 71
    :cond_3
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    check-cast v9, La/fee;

    .line 79
    .line 80
    if-eqz v5, :cond_6

    .line 81
    .line 82
    iget-object v10, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 83
    .line 84
    instance-of v11, v10, La/g0g0;

    .line 85
    .line 86
    if-eqz v11, :cond_4

    .line 87
    .line 88
    move-object v10, v2

    .line 89
    :cond_4
    check-cast v10, La/kuk;

    .line 90
    .line 91
    if-eqz v10, :cond_6

    .line 92
    .line 93
    iget-object v10, v10, La/kuk;->c:La/j0g0;

    .line 94
    .line 95
    if-eqz v10, :cond_6

    .line 96
    .line 97
    iget-object v10, v10, La/j0g0;->a:Ljava/lang/Object;

    .line 98
    .line 99
    instance-of v11, v10, La/g0g0;

    .line 100
    .line 101
    if-eqz v11, :cond_5

    .line 102
    .line 103
    move-object v10, v2

    .line 104
    :cond_5
    check-cast v10, La/btk;

    .line 105
    .line 106
    if-nez v10, :cond_7

    .line 107
    .line 108
    :cond_6
    new-instance v10, La/btk;

    .line 109
    .line 110
    sget-object v11, La/iun;->a:La/iun;

    .line 111
    .line 112
    invoke-direct {v10, v11, v1}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    :cond_7
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    check-cast v9, La/fee;

    .line 123
    .line 124
    if-eqz v5, :cond_a

    .line 125
    .line 126
    iget-object v10, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 127
    .line 128
    instance-of v11, v10, La/g0g0;

    .line 129
    .line 130
    if-eqz v11, :cond_8

    .line 131
    .line 132
    move-object v10, v2

    .line 133
    :cond_8
    check-cast v10, La/kuk;

    .line 134
    .line 135
    if-eqz v10, :cond_a

    .line 136
    .line 137
    iget-object v10, v10, La/kuk;->d:La/j0g0;

    .line 138
    .line 139
    if-eqz v10, :cond_a

    .line 140
    .line 141
    iget-object v10, v10, La/j0g0;->a:Ljava/lang/Object;

    .line 142
    .line 143
    instance-of v11, v10, La/g0g0;

    .line 144
    .line 145
    if-eqz v11, :cond_9

    .line 146
    .line 147
    move-object v10, v2

    .line 148
    :cond_9
    check-cast v10, La/btk;

    .line 149
    .line 150
    if-nez v10, :cond_b

    .line 151
    .line 152
    :cond_a
    new-instance v10, La/btk;

    .line 153
    .line 154
    sget-object v11, La/iun;->a:La/iun;

    .line 155
    .line 156
    invoke-direct {v10, v11, v1}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :cond_b
    invoke-virtual {v9, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    check-cast v1, La/fee;

    .line 167
    .line 168
    if-eqz v5, :cond_d

    .line 169
    .line 170
    iget-object v9, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 171
    .line 172
    instance-of v10, v9, La/g0g0;

    .line 173
    .line 174
    if-eqz v10, :cond_c

    .line 175
    .line 176
    move-object v9, v2

    .line 177
    :cond_c
    check-cast v9, La/kuk;

    .line 178
    .line 179
    if-eqz v9, :cond_d

    .line 180
    .line 181
    invoke-static {v9}, La/u1c;->S(La/kuk;)La/tqk;

    .line 182
    .line 183
    .line 184
    move-result-object v9

    .line 185
    goto :goto_0

    .line 186
    :cond_d
    new-instance v9, La/tqk;

    .line 187
    .line 188
    sget-object v10, La/iun;->a:La/iun;

    .line 189
    .line 190
    invoke-direct {v9, v10, v10}, La/tqk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 191
    .line 192
    .line 193
    :goto_0
    invoke-virtual {v1, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    check-cast v1, La/fee;

    .line 201
    .line 202
    if-eqz v5, :cond_10

    .line 203
    .line 204
    iget-object v9, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 205
    .line 206
    instance-of v10, v9, La/g0g0;

    .line 207
    .line 208
    if-eqz v10, :cond_e

    .line 209
    .line 210
    move-object v9, v2

    .line 211
    :cond_e
    check-cast v9, La/kuk;

    .line 212
    .line 213
    if-eqz v9, :cond_10

    .line 214
    .line 215
    iget-object v9, v9, La/kuk;->h:La/j0g0;

    .line 216
    .line 217
    if-eqz v9, :cond_10

    .line 218
    .line 219
    iget-object v9, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 220
    .line 221
    instance-of v10, v9, La/g0g0;

    .line 222
    .line 223
    if-eqz v10, :cond_f

    .line 224
    .line 225
    move-object v9, v2

    .line 226
    :cond_f
    check-cast v9, Ljava/util/List;

    .line 227
    .line 228
    if-nez v9, :cond_11

    .line 229
    .line 230
    :cond_10
    sget-object v9, La/iun;->a:La/iun;

    .line 231
    .line 232
    :cond_11
    invoke-virtual {v1, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    check-cast v1, La/fee;

    .line 240
    .line 241
    if-eqz v5, :cond_14

    .line 242
    .line 243
    iget-object v9, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 244
    .line 245
    instance-of v10, v9, La/g0g0;

    .line 246
    .line 247
    if-eqz v10, :cond_12

    .line 248
    .line 249
    move-object v9, v2

    .line 250
    :cond_12
    check-cast v9, La/kuk;

    .line 251
    .line 252
    if-eqz v9, :cond_14

    .line 253
    .line 254
    iget-object v9, v9, La/kuk;->i:La/j0g0;

    .line 255
    .line 256
    if-eqz v9, :cond_14

    .line 257
    .line 258
    iget-object v9, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 259
    .line 260
    instance-of v10, v9, La/g0g0;

    .line 261
    .line 262
    if-eqz v10, :cond_13

    .line 263
    .line 264
    move-object v9, v2

    .line 265
    :cond_13
    check-cast v9, Ljava/util/List;

    .line 266
    .line 267
    if-nez v9, :cond_15

    .line 268
    .line 269
    :cond_14
    sget-object v9, La/iun;->a:La/iun;

    .line 270
    .line 271
    :cond_15
    invoke-virtual {v1, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    check-cast v1, La/fee;

    .line 279
    .line 280
    if-eqz v5, :cond_18

    .line 281
    .line 282
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 283
    .line 284
    instance-of v9, v5, La/g0g0;

    .line 285
    .line 286
    if-eqz v9, :cond_16

    .line 287
    .line 288
    move-object v5, v2

    .line 289
    :cond_16
    check-cast v5, La/kuk;

    .line 290
    .line 291
    if-eqz v5, :cond_18

    .line 292
    .line 293
    iget-object v5, v5, La/kuk;->j:Ljava/lang/Object;

    .line 294
    .line 295
    instance-of v9, v5, La/g0g0;

    .line 296
    .line 297
    if-eqz v9, :cond_17

    .line 298
    .line 299
    goto :goto_1

    .line 300
    :cond_17
    move-object v2, v5

    .line 301
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 302
    .line 303
    if-nez v2, :cond_19

    .line 304
    .line 305
    :cond_18
    sget-object v2, La/iun;->a:La/iun;

    .line 306
    .line 307
    :cond_19
    invoke-static {v2}, La/qzb;->f1(Ljava/util/List;)La/tqk;

    .line 308
    .line 309
    .line 310
    move-result-object v2

    .line 311
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 312
    .line 313
    .line 314
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 315
    .line 316
    .line 317
    move-result-object v1

    .line 318
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object p0

    .line 322
    check-cast p0, La/fee;

    .line 323
    .line 324
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 325
    .line 326
    .line 327
    move-result-object p0

    .line 328
    check-cast p0, Ljava/util/Collection;

    .line 329
    .line 330
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 331
    .line 332
    .line 333
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object p0

    .line 337
    check-cast p0, La/fee;

    .line 338
    .line 339
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 340
    .line 341
    .line 342
    move-result-object p0

    .line 343
    check-cast p0, Ljava/util/Collection;

    .line 344
    .line 345
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 346
    .line 347
    .line 348
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 349
    .line 350
    .line 351
    move-result-object p0

    .line 352
    check-cast p0, La/fee;

    .line 353
    .line 354
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 355
    .line 356
    .line 357
    move-result-object p0

    .line 358
    check-cast p0, Ljava/util/Collection;

    .line 359
    .line 360
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 361
    .line 362
    .line 363
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    move-result-object p0

    .line 367
    check-cast p0, La/fee;

    .line 368
    .line 369
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object p0

    .line 373
    check-cast p0, Ljava/util/Collection;

    .line 374
    .line 375
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 376
    .line 377
    .line 378
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object p0

    .line 382
    check-cast p0, La/fee;

    .line 383
    .line 384
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 385
    .line 386
    .line 387
    move-result-object p0

    .line 388
    check-cast p0, Ljava/util/Collection;

    .line 389
    .line 390
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 391
    .line 392
    .line 393
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object p0

    .line 397
    check-cast p0, La/fee;

    .line 398
    .line 399
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    check-cast p0, Ljava/util/Collection;

    .line 404
    .line 405
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 406
    .line 407
    .line 408
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 409
    .line 410
    .line 411
    move-result-object p0

    .line 412
    check-cast p0, La/fee;

    .line 413
    .line 414
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 415
    .line 416
    .line 417
    move-result-object p0

    .line 418
    check-cast p0, Ljava/util/Collection;

    .line 419
    .line 420
    invoke-static {v1, p0, v1}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 421
    .line 422
    .line 423
    move-result-object p0

    .line 424
    return-object p0

    .line 425
    :pswitch_0
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 426
    .line 427
    check-cast v5, La/gqk;

    .line 428
    .line 429
    iget-object v0, v5, La/gqk;->a:Ljava/lang/String;

    .line 430
    .line 431
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 435
    .line 436
    return-object p0

    .line 437
    :pswitch_1
    check-cast p0, La/bqk;

    .line 438
    .line 439
    iget-object v0, p0, La/bqk;->k:La/n0o0;

    .line 440
    .line 441
    iget-object v3, p0, La/bqk;->j:La/n0o0;

    .line 442
    .line 443
    iget-object v4, p0, La/bqk;->i:La/n0o0;

    .line 444
    .line 445
    iget-object v6, p0, La/bqk;->h:La/n0o0;

    .line 446
    .line 447
    check-cast v5, La/ksk;

    .line 448
    .line 449
    iget-object p0, p0, La/bqk;->g:La/n0o0;

    .line 450
    .line 451
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v7

    .line 455
    check-cast v7, La/fee;

    .line 456
    .line 457
    iget-object v5, v5, La/ksk;->d:La/j0g0;

    .line 458
    .line 459
    if-eqz v5, :cond_1c

    .line 460
    .line 461
    iget-object v8, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 462
    .line 463
    instance-of v9, v8, La/g0g0;

    .line 464
    .line 465
    if-eqz v9, :cond_1a

    .line 466
    .line 467
    move-object v8, v2

    .line 468
    :cond_1a
    check-cast v8, La/kuk;

    .line 469
    .line 470
    if-eqz v8, :cond_1c

    .line 471
    .line 472
    iget-object v8, v8, La/kuk;->c:La/j0g0;

    .line 473
    .line 474
    if-eqz v8, :cond_1c

    .line 475
    .line 476
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 477
    .line 478
    instance-of v9, v8, La/g0g0;

    .line 479
    .line 480
    if-eqz v9, :cond_1b

    .line 481
    .line 482
    move-object v8, v2

    .line 483
    :cond_1b
    check-cast v8, La/btk;

    .line 484
    .line 485
    if-nez v8, :cond_1d

    .line 486
    .line 487
    :cond_1c
    new-instance v8, La/btk;

    .line 488
    .line 489
    sget-object v9, La/iun;->a:La/iun;

    .line 490
    .line 491
    invoke-direct {v8, v9, v1}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    :cond_1d
    invoke-virtual {v7, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 495
    .line 496
    .line 497
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 498
    .line 499
    .line 500
    move-result-object v7

    .line 501
    check-cast v7, La/fee;

    .line 502
    .line 503
    if-eqz v5, :cond_20

    .line 504
    .line 505
    iget-object v8, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 506
    .line 507
    instance-of v9, v8, La/g0g0;

    .line 508
    .line 509
    if-eqz v9, :cond_1e

    .line 510
    .line 511
    move-object v8, v2

    .line 512
    :cond_1e
    check-cast v8, La/kuk;

    .line 513
    .line 514
    if-eqz v8, :cond_20

    .line 515
    .line 516
    iget-object v8, v8, La/kuk;->d:La/j0g0;

    .line 517
    .line 518
    if-eqz v8, :cond_20

    .line 519
    .line 520
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 521
    .line 522
    instance-of v9, v8, La/g0g0;

    .line 523
    .line 524
    if-eqz v9, :cond_1f

    .line 525
    .line 526
    move-object v8, v2

    .line 527
    :cond_1f
    check-cast v8, La/btk;

    .line 528
    .line 529
    if-nez v8, :cond_21

    .line 530
    .line 531
    :cond_20
    new-instance v8, La/btk;

    .line 532
    .line 533
    sget-object v9, La/iun;->a:La/iun;

    .line 534
    .line 535
    invoke-direct {v8, v9, v1}, La/btk;-><init>(Ljava/util/List;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    :cond_21
    invoke-virtual {v7, v8}, La/fee;->d(Ljava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 542
    .line 543
    .line 544
    move-result-object v1

    .line 545
    check-cast v1, La/fee;

    .line 546
    .line 547
    if-eqz v5, :cond_24

    .line 548
    .line 549
    iget-object v7, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 550
    .line 551
    instance-of v8, v7, La/g0g0;

    .line 552
    .line 553
    if-eqz v8, :cond_22

    .line 554
    .line 555
    move-object v7, v2

    .line 556
    :cond_22
    check-cast v7, La/kuk;

    .line 557
    .line 558
    if-eqz v7, :cond_24

    .line 559
    .line 560
    iget-object v7, v7, La/kuk;->g:La/j0g0;

    .line 561
    .line 562
    if-eqz v7, :cond_24

    .line 563
    .line 564
    iget-object v7, v7, La/j0g0;->a:Ljava/lang/Object;

    .line 565
    .line 566
    instance-of v8, v7, La/g0g0;

    .line 567
    .line 568
    if-eqz v8, :cond_23

    .line 569
    .line 570
    move-object v7, v2

    .line 571
    :cond_23
    check-cast v7, Ljava/util/List;

    .line 572
    .line 573
    if-nez v7, :cond_25

    .line 574
    .line 575
    :cond_24
    sget-object v7, La/iun;->a:La/iun;

    .line 576
    .line 577
    :cond_25
    invoke-virtual {v1, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 578
    .line 579
    .line 580
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 581
    .line 582
    .line 583
    move-result-object v1

    .line 584
    check-cast v1, La/fee;

    .line 585
    .line 586
    new-instance v7, La/mpk;

    .line 587
    .line 588
    if-eqz v5, :cond_28

    .line 589
    .line 590
    iget-object v8, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 591
    .line 592
    instance-of v9, v8, La/g0g0;

    .line 593
    .line 594
    if-eqz v9, :cond_26

    .line 595
    .line 596
    move-object v8, v2

    .line 597
    :cond_26
    check-cast v8, La/kuk;

    .line 598
    .line 599
    if-eqz v8, :cond_28

    .line 600
    .line 601
    iget-object v8, v8, La/kuk;->a:La/j0g0;

    .line 602
    .line 603
    if-eqz v8, :cond_28

    .line 604
    .line 605
    iget-object v8, v8, La/j0g0;->a:Ljava/lang/Object;

    .line 606
    .line 607
    instance-of v9, v8, La/g0g0;

    .line 608
    .line 609
    if-eqz v9, :cond_27

    .line 610
    .line 611
    move-object v8, v2

    .line 612
    :cond_27
    check-cast v8, Ljava/util/List;

    .line 613
    .line 614
    if-nez v8, :cond_29

    .line 615
    .line 616
    :cond_28
    sget-object v8, La/iun;->a:La/iun;

    .line 617
    .line 618
    :cond_29
    if-eqz v5, :cond_2c

    .line 619
    .line 620
    iget-object v9, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 621
    .line 622
    instance-of v10, v9, La/g0g0;

    .line 623
    .line 624
    if-eqz v10, :cond_2a

    .line 625
    .line 626
    move-object v9, v2

    .line 627
    :cond_2a
    check-cast v9, La/kuk;

    .line 628
    .line 629
    if-eqz v9, :cond_2c

    .line 630
    .line 631
    iget-object v9, v9, La/kuk;->b:La/j0g0;

    .line 632
    .line 633
    if-eqz v9, :cond_2c

    .line 634
    .line 635
    iget-object v9, v9, La/j0g0;->a:Ljava/lang/Object;

    .line 636
    .line 637
    instance-of v10, v9, La/g0g0;

    .line 638
    .line 639
    if-eqz v10, :cond_2b

    .line 640
    .line 641
    move-object v9, v2

    .line 642
    :cond_2b
    check-cast v9, Ljava/util/List;

    .line 643
    .line 644
    if-nez v9, :cond_2d

    .line 645
    .line 646
    :cond_2c
    sget-object v9, La/iun;->a:La/iun;

    .line 647
    .line 648
    :cond_2d
    invoke-direct {v7, v8, v9}, La/mpk;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 649
    .line 650
    .line 651
    invoke-virtual {v1, v7}, La/fee;->d(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v1

    .line 658
    check-cast v1, La/fee;

    .line 659
    .line 660
    if-eqz v5, :cond_30

    .line 661
    .line 662
    iget-object v5, v5, La/j0g0;->a:Ljava/lang/Object;

    .line 663
    .line 664
    instance-of v7, v5, La/g0g0;

    .line 665
    .line 666
    if-eqz v7, :cond_2e

    .line 667
    .line 668
    move-object v5, v2

    .line 669
    :cond_2e
    check-cast v5, La/kuk;

    .line 670
    .line 671
    if-eqz v5, :cond_30

    .line 672
    .line 673
    iget-object v5, v5, La/kuk;->j:Ljava/lang/Object;

    .line 674
    .line 675
    instance-of v7, v5, La/g0g0;

    .line 676
    .line 677
    if-eqz v7, :cond_2f

    .line 678
    .line 679
    goto :goto_2

    .line 680
    :cond_2f
    move-object v2, v5

    .line 681
    :goto_2
    check-cast v2, Ljava/util/List;

    .line 682
    .line 683
    if-nez v2, :cond_31

    .line 684
    .line 685
    :cond_30
    sget-object v2, La/iun;->a:La/iun;

    .line 686
    .line 687
    :cond_31
    invoke-virtual {v1, v2}, La/fee;->d(Ljava/lang/Object;)V

    .line 688
    .line 689
    .line 690
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 691
    .line 692
    .line 693
    move-result-object v1

    .line 694
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 695
    .line 696
    .line 697
    move-result-object p0

    .line 698
    check-cast p0, La/fee;

    .line 699
    .line 700
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 701
    .line 702
    .line 703
    move-result-object p0

    .line 704
    check-cast p0, Ljava/util/Collection;

    .line 705
    .line 706
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 707
    .line 708
    .line 709
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 710
    .line 711
    .line 712
    move-result-object p0

    .line 713
    check-cast p0, La/fee;

    .line 714
    .line 715
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object p0

    .line 719
    check-cast p0, Ljava/util/Collection;

    .line 720
    .line 721
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 722
    .line 723
    .line 724
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 725
    .line 726
    .line 727
    move-result-object p0

    .line 728
    check-cast p0, La/fee;

    .line 729
    .line 730
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-result-object p0

    .line 734
    check-cast p0, Ljava/util/Collection;

    .line 735
    .line 736
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 737
    .line 738
    .line 739
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object p0

    .line 743
    check-cast p0, La/fee;

    .line 744
    .line 745
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 746
    .line 747
    .line 748
    move-result-object p0

    .line 749
    check-cast p0, Ljava/util/Collection;

    .line 750
    .line 751
    invoke-virtual {v1, p0}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 752
    .line 753
    .line 754
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object p0

    .line 758
    check-cast p0, La/fee;

    .line 759
    .line 760
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 761
    .line 762
    .line 763
    move-result-object p0

    .line 764
    check-cast p0, Ljava/util/Collection;

    .line 765
    .line 766
    invoke-static {v1, p0, v1}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 767
    .line 768
    .line 769
    move-result-object p0

    .line 770
    return-object p0

    .line 771
    :pswitch_2
    check-cast p0, La/b5q0;

    .line 772
    .line 773
    check-cast v5, La/g5q0;

    .line 774
    .line 775
    iget-object p0, p0, La/b5q0;->d:Lkotlin/jvm/functions/Function1;

    .line 776
    .line 777
    invoke-interface {p0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 778
    .line 779
    .line 780
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 781
    .line 782
    return-object p0

    .line 783
    :pswitch_3
    check-cast p0, La/v4q0;

    .line 784
    .line 785
    check-cast v5, Lkotlin/jvm/functions/Function0;

    .line 786
    .line 787
    invoke-interface {v5}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 788
    .line 789
    .line 790
    move-result-object v0

    .line 791
    check-cast v0, La/j6z;

    .line 792
    .line 793
    invoke-interface {p0, v0}, La/v4q0;->L0(La/j6z;)J

    .line 794
    .line 795
    .line 796
    move-result-wide v0

    .line 797
    invoke-static {v0, v1}, La/x1x;->J(J)J

    .line 798
    .line 799
    .line 800
    move-result-wide v0

    .line 801
    new-instance p0, La/ikx;

    .line 802
    .line 803
    invoke-direct {p0, v0, v1}, La/ikx;-><init>(J)V

    .line 804
    .line 805
    .line 806
    return-object p0

    .line 807
    :pswitch_4
    check-cast p0, La/zrj;

    .line 808
    .line 809
    check-cast v5, La/tcp;

    .line 810
    .line 811
    iget-object p0, p0, La/zrj;->b:La/ouu;

    .line 812
    .line 813
    new-instance v0, La/ya50;

    .line 814
    .line 815
    iget v1, v5, La/tcp;->a:I

    .line 816
    .line 817
    invoke-direct {v0, v1}, La/ya50;-><init>(I)V

    .line 818
    .line 819
    .line 820
    invoke-virtual {p0, v0, v4}, La/ouu;->q(La/cb50;Z)V

    .line 821
    .line 822
    .line 823
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object p0

    .line 826
    :pswitch_5
    check-cast p0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 827
    .line 828
    check-cast v5, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 829
    .line 830
    new-instance v0, La/wk9;

    .line 831
    .line 832
    invoke-direct {v0, p0, v5}, La/wk9;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 833
    .line 834
    .line 835
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 836
    .line 837
    .line 838
    move-result-object p0

    .line 839
    return-object p0

    .line 840
    :pswitch_6
    check-cast p0, Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 841
    .line 842
    check-cast v5, Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 843
    .line 844
    new-instance v0, La/xk9;

    .line 845
    .line 846
    invoke-direct {v0, p0, v5}, La/xk9;-><init>(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;)V

    .line 847
    .line 848
    .line 849
    invoke-static {v0}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 850
    .line 851
    .line 852
    move-result-object p0

    .line 853
    return-object p0

    .line 854
    :pswitch_7
    check-cast p0, La/jej;

    .line 855
    .line 856
    check-cast v5, La/dej;

    .line 857
    .line 858
    sget-object v0, La/dej;->l2:La/kwd;

    .line 859
    .line 860
    invoke-virtual {p0}, La/jej;->a()Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 861
    .line 862
    .line 863
    move-result-object p0

    .line 864
    iget-object v0, p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 865
    .line 866
    if-eqz v0, :cond_33

    .line 867
    .line 868
    iget-object v0, p0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 869
    .line 870
    if-nez v0, :cond_32

    .line 871
    .line 872
    goto :goto_3

    .line 873
    :cond_32
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 874
    .line 875
    .line 876
    move-result-object v0

    .line 877
    new-instance v1, Lkotlin/Pair;

    .line 878
    .line 879
    const-string v2, "RESULT_KEY_CALENDAR_DATE_RANGE"

    .line 880
    .line 881
    invoke-direct {v1, v2, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 882
    .line 883
    .line 884
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 885
    .line 886
    .line 887
    move-result-object p0

    .line 888
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 889
    .line 890
    .line 891
    move-result-object p0

    .line 892
    const-string v1, "RESULT_KEY_CALENDAR_RANGE_REQUEST"

    .line 893
    .line 894
    invoke-virtual {v0, p0, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 895
    .line 896
    .line 897
    invoke-virtual {v5}, La/yo8;->x0()V

    .line 898
    .line 899
    .line 900
    :cond_33
    :goto_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 901
    .line 902
    return-object p0

    .line 903
    :pswitch_8
    check-cast p0, La/hdj;

    .line 904
    .line 905
    check-cast v5, La/vcj;

    .line 906
    .line 907
    sget-object v0, La/vcj;->m2:La/kud;

    .line 908
    .line 909
    invoke-virtual {p0}, La/hdj;->a()Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 910
    .line 911
    .line 912
    move-result-object p0

    .line 913
    if-eqz p0, :cond_34

    .line 914
    .line 915
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 916
    .line 917
    .line 918
    move-result-object v0

    .line 919
    iget-object v1, v5, La/vcj;->l2:La/phf0;

    .line 920
    .line 921
    sget-object v2, La/vcj;->n2:[La/iiy;

    .line 922
    .line 923
    aget-object v2, v2, v4

    .line 924
    .line 925
    invoke-virtual {v1, v5, v2}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    .line 926
    .line 927
    .line 928
    move-result-object v1

    .line 929
    new-instance v2, Lkotlin/Pair;

    .line 930
    .line 931
    const-string v3, "RESULT_KEY_CALENDAR_SIMPLE_DATE"

    .line 932
    .line 933
    invoke-direct {v2, v3, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 934
    .line 935
    .line 936
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 937
    .line 938
    .line 939
    move-result-object p0

    .line 940
    invoke-static {p0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 941
    .line 942
    .line 943
    move-result-object p0

    .line 944
    invoke-virtual {v0, p0, v1}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 945
    .line 946
    .line 947
    invoke-virtual {v5}, La/yo8;->x0()V

    .line 948
    .line 949
    .line 950
    :cond_34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 951
    .line 952
    return-object p0

    .line 953
    :pswitch_9
    check-cast p0, La/g3j;

    .line 954
    .line 955
    check-cast v5, La/hm1;

    .line 956
    .line 957
    iget-object v0, p0, La/g3j;->j:Ljava/lang/Object;

    .line 958
    .line 959
    check-cast v0, La/rl1;

    .line 960
    .line 961
    new-instance v1, La/ngh;

    .line 962
    .line 963
    const/16 v2, 0x8

    .line 964
    .line 965
    invoke-direct {v1, p0, v5, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 969
    .line 970
    .line 971
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 972
    .line 973
    return-object p0

    .line 974
    :pswitch_a
    check-cast p0, La/f3j;

    .line 975
    .line 976
    check-cast v5, La/hm1;

    .line 977
    .line 978
    iget-object v0, p0, La/f3j;->e:La/i1w0;

    .line 979
    .line 980
    check-cast v0, La/rl1;

    .line 981
    .line 982
    new-instance v1, La/ngh;

    .line 983
    .line 984
    const/4 v2, 0x7

    .line 985
    invoke-direct {v1, p0, v5, v2}, La/ngh;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 986
    .line 987
    .line 988
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 989
    .line 990
    .line 991
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    return-object p0

    .line 994
    :pswitch_b
    check-cast p0, La/kwj;

    .line 995
    .line 996
    check-cast v5, La/pz40;

    .line 997
    .line 998
    sget v0, La/q1j;->n2:I

    .line 999
    .line 1000
    invoke-virtual {p0}, La/xk80;->k()I

    .line 1001
    .line 1002
    .line 1003
    move-result p0

    .line 1004
    invoke-interface {v5}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1005
    .line 1006
    .line 1007
    move-result-object v0

    .line 1008
    check-cast v0, La/e2j;

    .line 1009
    .line 1010
    iget-object v0, v0, La/e2j;->a:La/omm;

    .line 1011
    .line 1012
    iget-object v0, v0, La/omm;->a:La/a4x;

    .line 1013
    .line 1014
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 1015
    .line 1016
    .line 1017
    move-result v0

    .line 1018
    if-ne p0, v0, :cond_35

    .line 1019
    .line 1020
    move v3, v4

    .line 1021
    :cond_35
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1022
    .line 1023
    .line 1024
    move-result-object p0

    .line 1025
    return-object p0

    .line 1026
    :pswitch_c
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1027
    .line 1028
    check-cast v5, La/k9n;

    .line 1029
    .line 1030
    if-eqz p0, :cond_36

    .line 1031
    .line 1032
    invoke-interface {p0, v5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    :cond_36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1036
    .line 1037
    return-object p0

    .line 1038
    :pswitch_d
    check-cast p0, Landroid/content/Context;

    .line 1039
    .line 1040
    check-cast v5, Landroid/util/AttributeSet;

    .line 1041
    .line 1042
    sget v0, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->d:I

    .line 1043
    .line 1044
    new-instance v0, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;

    .line 1045
    .line 1046
    invoke-direct {v0, p0, v5, v3}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1047
    .line 1048
    .line 1049
    invoke-static {}, La/jmu0;->d()I

    .line 1050
    .line 1051
    .line 1052
    move-result p0

    .line 1053
    invoke-virtual {v0, p0}, Landroid/view/View;->setId(I)V

    .line 1054
    .line 1055
    .line 1056
    return-object v0

    .line 1057
    :pswitch_e
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1058
    .line 1059
    check-cast v5, La/i0i;

    .line 1060
    .line 1061
    iget-wide v0, v5, La/i0i;->a:J

    .line 1062
    .line 1063
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v0

    .line 1067
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1068
    .line 1069
    .line 1070
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1071
    .line 1072
    return-object p0

    .line 1073
    :pswitch_f
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 1074
    .line 1075
    check-cast v5, La/cql;

    .line 1076
    .line 1077
    if-eqz p0, :cond_37

    .line 1078
    .line 1079
    iget-wide v0, v5, La/cql;->a:J

    .line 1080
    .line 1081
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v0

    .line 1085
    iget-object v1, v5, La/cql;->c:Ljava/lang/String;

    .line 1086
    .line 1087
    invoke-interface {p0, v0, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1088
    .line 1089
    .line 1090
    :cond_37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1091
    .line 1092
    return-object p0

    .line 1093
    :pswitch_10
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1094
    .line 1095
    check-cast v5, La/qoh;

    .line 1096
    .line 1097
    iget-object v0, v5, La/qoh;->b:Ljava/lang/String;

    .line 1098
    .line 1099
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1100
    .line 1101
    .line 1102
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1103
    .line 1104
    return-object p0

    .line 1105
    :pswitch_11
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1106
    .line 1107
    check-cast v5, La/joh;

    .line 1108
    .line 1109
    iget-wide v0, v5, La/joh;->a:J

    .line 1110
    .line 1111
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1116
    .line 1117
    .line 1118
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1119
    .line 1120
    return-object p0

    .line 1121
    :pswitch_12
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1122
    .line 1123
    check-cast v5, La/ihh;

    .line 1124
    .line 1125
    iget-wide v0, v5, La/ihh;->a:J

    .line 1126
    .line 1127
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v0

    .line 1131
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1132
    .line 1133
    .line 1134
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1135
    .line 1136
    return-object p0

    .line 1137
    :pswitch_13
    check-cast p0, La/ujd;

    .line 1138
    .line 1139
    check-cast v5, Landroidx/fragment/app/Fragment;

    .line 1140
    .line 1141
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1142
    .line 1143
    .line 1144
    invoke-static {v5}, La/ujd;->a(Landroidx/fragment/app/Fragment;)V

    .line 1145
    .line 1146
    .line 1147
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1148
    .line 1149
    return-object p0

    .line 1150
    :pswitch_14
    check-cast p0, La/k7h;

    .line 1151
    .line 1152
    check-cast v5, La/pz40;

    .line 1153
    .line 1154
    iget-boolean v0, p0, La/k7h;->f:Z

    .line 1155
    .line 1156
    if-eqz v0, :cond_38

    .line 1157
    .line 1158
    invoke-interface {v5, p0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1159
    .line 1160
    .line 1161
    :cond_38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1162
    .line 1163
    return-object p0

    .line 1164
    :pswitch_15
    check-cast p0, La/upg;

    .line 1165
    .line 1166
    check-cast v5, La/zog;

    .line 1167
    .line 1168
    sget-object v0, La/upg;->X1:La/kwd;

    .line 1169
    .line 1170
    invoke-virtual {p0}, La/upg;->H0()La/vqg;

    .line 1171
    .line 1172
    .line 1173
    move-result-object p0

    .line 1174
    iget-wide v0, v5, La/zog;->c:J

    .line 1175
    .line 1176
    iget-object v2, v5, La/zog;->d:Ljava/lang/String;

    .line 1177
    .line 1178
    invoke-virtual {p0, v0, v1, v2}, La/vqg;->x(JLjava/lang/String;)V

    .line 1179
    .line 1180
    .line 1181
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1182
    .line 1183
    return-object p0

    .line 1184
    :pswitch_16
    check-cast p0, La/d9z;

    .line 1185
    .line 1186
    check-cast v5, La/yog;

    .line 1187
    .line 1188
    invoke-virtual {p0}, La/d9z;->h()I

    .line 1189
    .line 1190
    .line 1191
    move-result v0

    .line 1192
    if-nez v0, :cond_39

    .line 1193
    .line 1194
    invoke-virtual {p0}, La/d9z;->i()I

    .line 1195
    .line 1196
    .line 1197
    move-result p0

    .line 1198
    if-nez p0, :cond_39

    .line 1199
    .line 1200
    iget-object p0, v5, La/yog;->b:La/agk0;

    .line 1201
    .line 1202
    invoke-virtual {p0}, La/agk0;->l()F

    .line 1203
    .line 1204
    .line 1205
    move-result p0

    .line 1206
    const/4 v0, 0x0

    .line 1207
    cmpg-float p0, p0, v0

    .line 1208
    .line 1209
    if-gtz p0, :cond_39

    .line 1210
    .line 1211
    move v3, v4

    .line 1212
    :cond_39
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1213
    .line 1214
    .line 1215
    move-result-object p0

    .line 1216
    return-object p0

    .line 1217
    :pswitch_17
    check-cast p0, La/hjg;

    .line 1218
    .line 1219
    check-cast v5, La/sig;

    .line 1220
    .line 1221
    iget-object p0, p0, La/hjg;->d:La/n0o0;

    .line 1222
    .line 1223
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    check-cast v0, La/fee;

    .line 1228
    .line 1229
    new-instance v6, La/lig;

    .line 1230
    .line 1231
    iget-object v1, v5, La/sig;->h:La/mig;

    .line 1232
    .line 1233
    if-eqz v1, :cond_3b

    .line 1234
    .line 1235
    iget-object v7, v1, La/mig;->a:Ljava/lang/Object;

    .line 1236
    .line 1237
    sget-object v8, La/j0g0;->b:La/e0g0;

    .line 1238
    .line 1239
    instance-of v8, v7, La/g0g0;

    .line 1240
    .line 1241
    if-eqz v8, :cond_3a

    .line 1242
    .line 1243
    goto :goto_4

    .line 1244
    :cond_3a
    move-object v2, v7

    .line 1245
    :goto_4
    check-cast v2, Ljava/util/List;

    .line 1246
    .line 1247
    :cond_3b
    if-nez v2, :cond_3c

    .line 1248
    .line 1249
    sget-object v2, La/iun;->a:La/iun;

    .line 1250
    .line 1251
    :cond_3c
    move-object v7, v2

    .line 1252
    iget-object v8, v5, La/sig;->g:La/wcb;

    .line 1253
    .line 1254
    iget-object v9, v5, La/sig;->j:Ljava/util/List;

    .line 1255
    .line 1256
    iget-object v10, v5, La/sig;->i:Ljava/lang/String;

    .line 1257
    .line 1258
    iget-boolean v11, v5, La/sig;->k:Z

    .line 1259
    .line 1260
    iget-object v12, v5, La/sig;->l:Ljava/util/List;

    .line 1261
    .line 1262
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 1263
    .line 1264
    .line 1265
    move-result v2

    .line 1266
    const/16 v5, 0xa

    .line 1267
    .line 1268
    if-lt v2, v5, :cond_3d

    .line 1269
    .line 1270
    move v13, v4

    .line 1271
    goto :goto_5

    .line 1272
    :cond_3d
    move v13, v3

    .line 1273
    :goto_5
    if-eqz v1, :cond_3f

    .line 1274
    .line 1275
    iget-object v1, v1, La/mig;->e:Ljava/util/Map;

    .line 1276
    .line 1277
    if-nez v1, :cond_3e

    .line 1278
    .line 1279
    goto :goto_7

    .line 1280
    :cond_3e
    :goto_6
    move-object v14, v1

    .line 1281
    goto :goto_8

    .line 1282
    :cond_3f
    :goto_7
    sget-object v1, La/lun;->a:La/lun;

    .line 1283
    .line 1284
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    goto :goto_6

    .line 1288
    :goto_8
    invoke-direct/range {v6 .. v14}, La/lig;-><init>(Ljava/util/List;La/wcb;Ljava/util/List;Ljava/lang/String;ZLjava/util/List;ZLjava/util/Map;)V

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v0, v6}, La/fee;->d(Ljava/lang/Object;)V

    .line 1292
    .line 1293
    .line 1294
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1295
    .line 1296
    .line 1297
    move-result-object p0

    .line 1298
    check-cast p0, La/fee;

    .line 1299
    .line 1300
    invoke-virtual {p0}, La/fee;->b()Ljava/lang/Object;

    .line 1301
    .line 1302
    .line 1303
    move-result-object p0

    .line 1304
    check-cast p0, La/a4x;

    .line 1305
    .line 1306
    return-object p0

    .line 1307
    :pswitch_18
    check-cast p0, La/a4x;

    .line 1308
    .line 1309
    check-cast v5, Ljava/util/Map;

    .line 1310
    .line 1311
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1312
    .line 1313
    .line 1314
    move-result-object p0

    .line 1315
    :cond_40
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1316
    .line 1317
    .line 1318
    move-result v0

    .line 1319
    if-eqz v0, :cond_42

    .line 1320
    .line 1321
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1322
    .line 1323
    .line 1324
    move-result-object v0

    .line 1325
    check-cast v0, La/wbg;

    .line 1326
    .line 1327
    iget-object v1, v0, La/wbg;->a:La/h7h;

    .line 1328
    .line 1329
    iget-wide v1, v1, La/h7h;->a:J

    .line 1330
    .line 1331
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1332
    .line 1333
    .line 1334
    move-result-object v1

    .line 1335
    invoke-interface {v5, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1336
    .line 1337
    .line 1338
    move-result-object v1

    .line 1339
    check-cast v1, La/ngk0;

    .line 1340
    .line 1341
    if-eqz v1, :cond_40

    .line 1342
    .line 1343
    iget-object v1, v1, La/ngk0;->c:La/yfk0;

    .line 1344
    .line 1345
    invoke-virtual {v1}, La/yfk0;->iterator()Ljava/util/Iterator;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v1

    .line 1349
    :cond_41
    :goto_9
    move-object v2, v1

    .line 1350
    check-cast v2, La/a8m0;

    .line 1351
    .line 1352
    invoke-virtual {v2}, La/a8m0;->hasNext()Z

    .line 1353
    .line 1354
    .line 1355
    move-result v3

    .line 1356
    if-eqz v3, :cond_40

    .line 1357
    .line 1358
    move-object v3, v1

    .line 1359
    check-cast v3, La/a8m0;

    .line 1360
    .line 1361
    invoke-virtual {v3}, La/a8m0;->next()Ljava/lang/Object;

    .line 1362
    .line 1363
    .line 1364
    move-result-object v3

    .line 1365
    check-cast v3, Ljava/lang/Integer;

    .line 1366
    .line 1367
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1368
    .line 1369
    .line 1370
    move-result v3

    .line 1371
    iget-object v4, v0, La/wbg;->a:La/h7h;

    .line 1372
    .line 1373
    iget-object v4, v4, La/h7h;->g:La/a4x;

    .line 1374
    .line 1375
    invoke-interface {v4}, Ljava/util/List;->size()I

    .line 1376
    .line 1377
    .line 1378
    move-result v4

    .line 1379
    if-lt v3, v4, :cond_41

    .line 1380
    .line 1381
    invoke-virtual {v2}, La/a8m0;->remove()V

    .line 1382
    .line 1383
    .line 1384
    goto :goto_9

    .line 1385
    :cond_42
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1386
    .line 1387
    return-object p0

    .line 1388
    :pswitch_19
    check-cast p0, Lkotlin/jvm/functions/Function1;

    .line 1389
    .line 1390
    check-cast v5, La/wbg;

    .line 1391
    .line 1392
    new-instance v0, La/h6h;

    .line 1393
    .line 1394
    iget-object v1, v5, La/wbg;->a:La/h7h;

    .line 1395
    .line 1396
    iget-wide v1, v1, La/h7h;->a:J

    .line 1397
    .line 1398
    iget-boolean v3, v5, La/wbg;->b:Z

    .line 1399
    .line 1400
    xor-int/2addr v3, v4

    .line 1401
    invoke-direct {v0, v3, v1, v2}, La/h6h;-><init>(ZJ)V

    .line 1402
    .line 1403
    .line 1404
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1405
    .line 1406
    .line 1407
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1408
    .line 1409
    return-object p0

    .line 1410
    :pswitch_1a
    check-cast p0, La/yag;

    .line 1411
    .line 1412
    check-cast v5, La/s7g;

    .line 1413
    .line 1414
    sget-object v0, La/s7g;->U1:La/usd;

    .line 1415
    .line 1416
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 1417
    .line 1418
    .line 1419
    move-result v0

    .line 1420
    if-eqz v0, :cond_45

    .line 1421
    .line 1422
    const/4 v1, 0x2

    .line 1423
    if-eq v0, v4, :cond_44

    .line 1424
    .line 1425
    if-eq v0, v1, :cond_44

    .line 1426
    .line 1427
    const/4 v3, 0x3

    .line 1428
    if-ne v0, v3, :cond_43

    .line 1429
    .line 1430
    goto :goto_a

    .line 1431
    :cond_43
    invoke-static {}, La/t9f;->b()V

    .line 1432
    .line 1433
    .line 1434
    goto :goto_b

    .line 1435
    :cond_44
    :goto_a
    sget-object v0, La/b9g;->R1:La/qud;

    .line 1436
    .line 1437
    invoke-virtual {v5}, La/s7g;->G0()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 1438
    .line 1439
    .line 1440
    move-result-object v2

    .line 1441
    iget-boolean v2, v2, Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;->d:Z

    .line 1442
    .line 1443
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1444
    .line 1445
    .line 1446
    new-instance v0, La/b9g;

    .line 1447
    .line 1448
    invoke-direct {v0}, La/b9g;-><init>()V

    .line 1449
    .line 1450
    .line 1451
    sget-object v3, La/b9g;->S1:[La/iiy;

    .line 1452
    .line 1453
    aget-object v4, v3, v4

    .line 1454
    .line 1455
    iget-object v5, v0, La/b9g;->M1:La/yzn0;

    .line 1456
    .line 1457
    invoke-virtual {v5, v0, v4, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1458
    .line 1459
    .line 1460
    aget-object p0, v3, v1

    .line 1461
    .line 1462
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1463
    .line 1464
    .line 1465
    move-result-object v1

    .line 1466
    iget-object v2, v0, La/b9g;->N1:La/yzn0;

    .line 1467
    .line 1468
    invoke-virtual {v2, v0, p0, v1}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1469
    .line 1470
    .line 1471
    move-object v2, v0

    .line 1472
    goto :goto_b

    .line 1473
    :cond_45
    sget-object p0, La/n5g;->S1:La/qud;

    .line 1474
    .line 1475
    invoke-virtual {v5}, La/s7g;->G0()Lorg/xplatform/cyber/calendar/api/CyberCalendarParams;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v0

    .line 1479
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1480
    .line 1481
    .line 1482
    new-instance v2, La/n5g;

    .line 1483
    .line 1484
    invoke-direct {v2}, La/n5g;-><init>()V

    .line 1485
    .line 1486
    .line 1487
    sget-object p0, La/n5g;->U1:[La/iiy;

    .line 1488
    .line 1489
    aget-object p0, p0, v4

    .line 1490
    .line 1491
    iget-object v1, v2, La/n5g;->R1:La/khf0;

    .line 1492
    .line 1493
    invoke-virtual {v1, v2, p0, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1494
    .line 1495
    .line 1496
    :goto_b
    return-object v2

    .line 1497
    :pswitch_1b
    check-cast p0, La/l7m0;

    .line 1498
    .line 1499
    check-cast v5, La/d9z;

    .line 1500
    .line 1501
    invoke-interface {p0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 1502
    .line 1503
    .line 1504
    move-result-object p0

    .line 1505
    check-cast p0, Ljava/lang/Boolean;

    .line 1506
    .line 1507
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1508
    .line 1509
    .line 1510
    move-result p0

    .line 1511
    if-nez p0, :cond_46

    .line 1512
    .line 1513
    iget-object p0, v5, La/d9z;->h:La/ywj;

    .line 1514
    .line 1515
    invoke-virtual {p0}, La/ywj;->a()Z

    .line 1516
    .line 1517
    .line 1518
    move-result p0

    .line 1519
    if-eqz p0, :cond_46

    .line 1520
    .line 1521
    move v3, v4

    .line 1522
    :cond_46
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1523
    .line 1524
    .line 1525
    move-result-object p0

    .line 1526
    return-object p0

    .line 1527
    :pswitch_1c
    check-cast p0, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;

    .line 1528
    .line 1529
    check-cast v5, Ljava/util/LinkedHashMap;

    .line 1530
    .line 1531
    invoke-static {p0, v5}, Lorg/xplatform/crystal/presentation/views/CrystalFieldView;->d(Lorg/xplatform/crystal/presentation/views/CrystalFieldView;Ljava/util/LinkedHashMap;)Lkotlin/Unit;

    .line 1532
    .line 1533
    .line 1534
    move-result-object p0

    .line 1535
    return-object p0

    .line 1536
    nop

    .line 1537
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
