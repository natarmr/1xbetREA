.class public final synthetic La/kk0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/vgg;Ljava/lang/String;La/hhq0;)V
    .locals 1

    .line 1
    const/16 v0, 0x18

    iput-byte v0, p0, La/kk0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/kk0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/kk0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/kk0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p4, p0, La/kk0;->a:B

    iput-object p1, p0, La/kk0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/kk0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/kk0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kk0;->a:B

    .line 4
    .line 5
    const-wide/16 v2, -0x1

    .line 6
    .line 7
    const-wide/16 v4, 0x0

    .line 8
    .line 9
    const/4 v6, 0x3

    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x2

    .line 12
    const/4 v9, 0x0

    .line 13
    const/4 v10, 0x1

    .line 14
    iget-object v12, v0, La/kk0;->d:Ljava/lang/Object;

    .line 15
    .line 16
    iget-object v13, v0, La/kk0;->c:Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, v0, La/kk0;->b:Ljava/lang/Object;

    .line 19
    .line 20
    packed-switch v1, :pswitch_data_0

    .line 21
    .line 22
    .line 23
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 24
    .line 25
    check-cast v13, La/ctk;

    .line 26
    .line 27
    check-cast v12, La/sip;

    .line 28
    .line 29
    iget-wide v1, v13, La/ctk;->a:J

    .line 30
    .line 31
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-interface {v0, v1, v12}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    check-cast v0, La/wyj;

    .line 42
    .line 43
    iget-object v1, v0, La/wyj;->s:La/n0o0;

    .line 44
    .line 45
    iget-object v2, v0, La/wyj;->q:La/n0o0;

    .line 46
    .line 47
    iget-object v3, v0, La/wyj;->p:La/n0o0;

    .line 48
    .line 49
    iget-object v4, v0, La/wyj;->m:La/n0o0;

    .line 50
    .line 51
    iget-object v5, v0, La/wyj;->r:La/n0o0;

    .line 52
    .line 53
    iget-object v6, v0, La/wyj;->l:La/n0o0;

    .line 54
    .line 55
    iget-object v7, v0, La/wyj;->o:La/n0o0;

    .line 56
    .line 57
    iget-object v8, v0, La/wyj;->n:La/n0o0;

    .line 58
    .line 59
    check-cast v13, La/jih;

    .line 60
    .line 61
    check-cast v12, La/zjw;

    .line 62
    .line 63
    iget-object v10, v12, La/zjw;->c:Ljava/util/List;

    .line 64
    .line 65
    iget-object v12, v0, La/wyj;->k:La/n0o0;

    .line 66
    .line 67
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v14

    .line 71
    check-cast v14, La/fee;

    .line 72
    .line 73
    iget-object v15, v13, La/jih;->a:Ljava/lang/Object;

    .line 74
    .line 75
    sget-object v16, La/j0g0;->b:La/e0g0;

    .line 76
    .line 77
    instance-of v11, v15, La/g0g0;

    .line 78
    .line 79
    if-eqz v11, :cond_0

    .line 80
    .line 81
    const/4 v15, 0x0

    .line 82
    :cond_0
    check-cast v15, Ljava/util/List;

    .line 83
    .line 84
    if-nez v15, :cond_1

    .line 85
    .line 86
    sget-object v15, La/iun;->a:La/iun;

    .line 87
    .line 88
    :cond_1
    invoke-virtual {v14, v15}, La/fee;->d(Ljava/lang/Object;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v11

    .line 95
    check-cast v11, La/fee;

    .line 96
    .line 97
    iget-object v14, v13, La/jih;->b:Ljava/lang/Object;

    .line 98
    .line 99
    instance-of v15, v14, La/g0g0;

    .line 100
    .line 101
    if-eqz v15, :cond_2

    .line 102
    .line 103
    const/4 v14, 0x0

    .line 104
    :cond_2
    check-cast v14, Ljava/util/List;

    .line 105
    .line 106
    if-nez v14, :cond_3

    .line 107
    .line 108
    sget-object v14, La/iun;->a:La/iun;

    .line 109
    .line 110
    :cond_3
    invoke-virtual {v11, v14}, La/fee;->d(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v11

    .line 117
    check-cast v11, La/fee;

    .line 118
    .line 119
    iget-object v14, v13, La/jih;->e:Ljava/lang/Object;

    .line 120
    .line 121
    instance-of v15, v14, La/g0g0;

    .line 122
    .line 123
    if-eqz v15, :cond_4

    .line 124
    .line 125
    const/4 v14, 0x0

    .line 126
    :cond_4
    check-cast v14, Ljava/util/List;

    .line 127
    .line 128
    if-nez v14, :cond_5

    .line 129
    .line 130
    sget-object v14, La/iun;->a:La/iun;

    .line 131
    .line 132
    :cond_5
    invoke-virtual {v11, v14}, La/fee;->d(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v11

    .line 139
    check-cast v11, La/fee;

    .line 140
    .line 141
    iget-object v14, v13, La/jih;->c:Ljava/lang/Object;

    .line 142
    .line 143
    instance-of v15, v14, La/g0g0;

    .line 144
    .line 145
    if-eqz v15, :cond_6

    .line 146
    .line 147
    const/4 v14, 0x0

    .line 148
    :cond_6
    check-cast v14, Ljava/util/List;

    .line 149
    .line 150
    if-nez v14, :cond_7

    .line 151
    .line 152
    sget-object v14, La/iun;->a:La/iun;

    .line 153
    .line 154
    :cond_7
    invoke-virtual {v11, v14}, La/fee;->d(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v11

    .line 161
    check-cast v11, La/fee;

    .line 162
    .line 163
    invoke-virtual {v0}, La/wyj;->b()La/fee;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    invoke-virtual {v0}, La/fee;->c()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    check-cast v0, La/ekw;

    .line 172
    .line 173
    iget-object v0, v0, La/ekw;->a:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 174
    .line 175
    invoke-static {v13, v0, v9}, La/kih;->a(La/jih;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;Z)Z

    .line 176
    .line 177
    .line 178
    move-result v0

    .line 179
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    invoke-virtual {v11, v0}, La/fee;->d(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    check-cast v0, La/fee;

    .line 191
    .line 192
    iget-object v9, v13, La/jih;->d:Ljava/lang/Object;

    .line 193
    .line 194
    instance-of v11, v9, La/g0g0;

    .line 195
    .line 196
    if-eqz v11, :cond_8

    .line 197
    .line 198
    const/4 v9, 0x0

    .line 199
    :cond_8
    check-cast v9, Ljava/util/List;

    .line 200
    .line 201
    if-nez v9, :cond_9

    .line 202
    .line 203
    sget-object v9, La/iun;->a:La/iun;

    .line 204
    .line 205
    :cond_9
    invoke-virtual {v0, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    check-cast v0, La/fee;

    .line 213
    .line 214
    new-instance v9, La/fiw;

    .line 215
    .line 216
    iget-object v11, v13, La/jih;->f:Ljava/lang/Object;

    .line 217
    .line 218
    instance-of v14, v11, La/g0g0;

    .line 219
    .line 220
    if-eqz v14, :cond_a

    .line 221
    .line 222
    const/4 v11, 0x0

    .line 223
    :cond_a
    check-cast v11, Ljava/util/List;

    .line 224
    .line 225
    if-nez v11, :cond_b

    .line 226
    .line 227
    sget-object v11, La/iun;->a:La/iun;

    .line 228
    .line 229
    :cond_b
    iget-object v14, v13, La/jih;->g:Ljava/lang/Object;

    .line 230
    .line 231
    instance-of v15, v14, La/g0g0;

    .line 232
    .line 233
    if-eqz v15, :cond_c

    .line 234
    .line 235
    const/4 v14, 0x0

    .line 236
    :cond_c
    check-cast v14, Ljava/util/List;

    .line 237
    .line 238
    if-nez v14, :cond_d

    .line 239
    .line 240
    sget-object v14, La/iun;->a:La/iun;

    .line 241
    .line 242
    :cond_d
    invoke-direct {v9, v11, v14}, La/fiw;-><init>(Ljava/util/List;Ljava/util/List;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0, v9}, La/fee;->d(Ljava/lang/Object;)V

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    check-cast v0, La/fee;

    .line 253
    .line 254
    iget-object v9, v13, La/jih;->i:Ljava/lang/Object;

    .line 255
    .line 256
    instance-of v11, v9, La/g0g0;

    .line 257
    .line 258
    if-eqz v11, :cond_e

    .line 259
    .line 260
    const/4 v11, 0x0

    .line 261
    goto :goto_0

    .line 262
    :cond_e
    move-object v11, v9

    .line 263
    :goto_0
    check-cast v11, Ljava/util/List;

    .line 264
    .line 265
    if-nez v11, :cond_f

    .line 266
    .line 267
    sget-object v11, La/iun;->a:La/iun;

    .line 268
    .line 269
    :cond_f
    invoke-virtual {v0, v11}, La/fee;->d(Ljava/lang/Object;)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    check-cast v0, La/fee;

    .line 277
    .line 278
    invoke-virtual {v0, v10}, La/fee;->d(Ljava/lang/Object;)V

    .line 279
    .line 280
    .line 281
    invoke-static {}, Lkotlin/collections/a;->b()La/lc00;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v12}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 286
    .line 287
    .line 288
    move-result-object v9

    .line 289
    check-cast v9, La/fee;

    .line 290
    .line 291
    invoke-virtual {v9}, La/fee;->b()Ljava/lang/Object;

    .line 292
    .line 293
    .line 294
    move-result-object v9

    .line 295
    invoke-virtual {v0, v9}, La/lc00;->add(Ljava/lang/Object;)Z

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    check-cast v1, La/fee;

    .line 303
    .line 304
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    check-cast v1, Ljava/util/Collection;

    .line 309
    .line 310
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 311
    .line 312
    .line 313
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 314
    .line 315
    .line 316
    move-result-object v1

    .line 317
    check-cast v1, La/fee;

    .line 318
    .line 319
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 320
    .line 321
    .line 322
    move-result-object v1

    .line 323
    check-cast v1, Ljava/util/Collection;

    .line 324
    .line 325
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 326
    .line 327
    .line 328
    invoke-virtual {v6}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object v1

    .line 332
    check-cast v1, La/fee;

    .line 333
    .line 334
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    check-cast v1, Ljava/util/Collection;

    .line 339
    .line 340
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 341
    .line 342
    .line 343
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    check-cast v1, La/fee;

    .line 348
    .line 349
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    check-cast v1, Ljava/util/Collection;

    .line 354
    .line 355
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 356
    .line 357
    .line 358
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 359
    .line 360
    .line 361
    move-result-object v1

    .line 362
    check-cast v1, La/fee;

    .line 363
    .line 364
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    check-cast v1, Ljava/util/Collection;

    .line 369
    .line 370
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 371
    .line 372
    .line 373
    invoke-virtual {v7}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v1

    .line 377
    check-cast v1, La/fee;

    .line 378
    .line 379
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v1

    .line 383
    check-cast v1, Ljava/util/Collection;

    .line 384
    .line 385
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 386
    .line 387
    .line 388
    invoke-virtual {v3}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v1

    .line 392
    check-cast v1, La/fee;

    .line 393
    .line 394
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    check-cast v1, Ljava/util/Collection;

    .line 399
    .line 400
    invoke-virtual {v0, v1}, La/lc00;->addAll(Ljava/util/Collection;)Z

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    check-cast v1, La/fee;

    .line 408
    .line 409
    invoke-virtual {v1}, La/fee;->b()Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Ljava/util/Collection;

    .line 414
    .line 415
    invoke-static {v0, v1, v0}, La/twn;->k(La/lc00;Ljava/util/Collection;La/lc00;)La/a4x;

    .line 416
    .line 417
    .line 418
    move-result-object v0

    .line 419
    return-object v0

    .line 420
    :pswitch_1
    check-cast v0, La/xej;

    .line 421
    .line 422
    check-cast v13, La/c2;

    .line 423
    .line 424
    check-cast v12, Ljava/util/Calendar;

    .line 425
    .line 426
    sget-object v1, La/xej;->l2:La/nwd;

    .line 427
    .line 428
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 429
    .line 430
    .line 431
    if-eqz v13, :cond_19

    .line 432
    .line 433
    instance-of v1, v13, La/gfj;

    .line 434
    .line 435
    const-string v2, "RESULT_KEY_CALENDAR_END_SIMPLE_DATE"

    .line 436
    .line 437
    const-string v3, "RESULT_KEY_CALENDAR_START_SIMPLE_DATE"

    .line 438
    .line 439
    const-string v4, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 440
    .line 441
    if-eqz v1, :cond_14

    .line 442
    .line 443
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 444
    .line 445
    .line 446
    move-result-object v1

    .line 447
    check-cast v13, La/gfj;

    .line 448
    .line 449
    invoke-virtual {v13}, La/gfj;->Q()La/xk9;

    .line 450
    .line 451
    .line 452
    move-result-object v5

    .line 453
    if-eqz v5, :cond_10

    .line 454
    .line 455
    iget-object v5, v5, La/xk9;->a:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 456
    .line 457
    goto :goto_1

    .line 458
    :cond_10
    const/4 v5, 0x0

    .line 459
    :goto_1
    if-eqz v5, :cond_11

    .line 460
    .line 461
    invoke-static {v5, v12}, La/wdx;->I(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 465
    .line 466
    .line 467
    move-result-wide v5

    .line 468
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 469
    .line 470
    .line 471
    move-result-object v5

    .line 472
    goto :goto_2

    .line 473
    :cond_11
    const/4 v5, 0x0

    .line 474
    :goto_2
    new-instance v6, Lkotlin/Pair;

    .line 475
    .line 476
    invoke-direct {v6, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v13}, La/gfj;->Q()La/xk9;

    .line 480
    .line 481
    .line 482
    move-result-object v3

    .line 483
    if-eqz v3, :cond_12

    .line 484
    .line 485
    iget-object v3, v3, La/xk9;->b:Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;

    .line 486
    .line 487
    goto :goto_3

    .line 488
    :cond_12
    const/4 v3, 0x0

    .line 489
    :goto_3
    if-eqz v3, :cond_13

    .line 490
    .line 491
    invoke-static {v3, v12}, La/wdx;->I(Lorg/xplatform/uikit/compose/components/calendar/model/SimpleDateTime;Ljava/util/Calendar;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 495
    .line 496
    .line 497
    move-result-wide v7

    .line 498
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 499
    .line 500
    .line 501
    move-result-object v11

    .line 502
    goto :goto_4

    .line 503
    :cond_13
    const/4 v11, 0x0

    .line 504
    :goto_4
    new-instance v3, Lkotlin/Pair;

    .line 505
    .line 506
    invoke-direct {v3, v2, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 507
    .line 508
    .line 509
    filled-new-array {v6, v3}, [Lkotlin/Pair;

    .line 510
    .line 511
    .line 512
    move-result-object v2

    .line 513
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 514
    .line 515
    .line 516
    move-result-object v2

    .line 517
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 518
    .line 519
    .line 520
    goto :goto_9

    .line 521
    :cond_14
    instance-of v1, v13, La/ffj;

    .line 522
    .line 523
    if-eqz v1, :cond_19

    .line 524
    .line 525
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 526
    .line 527
    .line 528
    move-result-object v1

    .line 529
    check-cast v13, La/ffj;

    .line 530
    .line 531
    invoke-virtual {v13}, La/ffj;->Q()La/wk9;

    .line 532
    .line 533
    .line 534
    move-result-object v5

    .line 535
    if-eqz v5, :cond_15

    .line 536
    .line 537
    iget-object v5, v5, La/wk9;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 538
    .line 539
    goto :goto_5

    .line 540
    :cond_15
    const/4 v5, 0x0

    .line 541
    :goto_5
    if-eqz v5, :cond_16

    .line 542
    .line 543
    invoke-static {v5, v12}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 544
    .line 545
    .line 546
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 547
    .line 548
    .line 549
    move-result-wide v5

    .line 550
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 551
    .line 552
    .line 553
    move-result-object v5

    .line 554
    goto :goto_6

    .line 555
    :cond_16
    const/4 v5, 0x0

    .line 556
    :goto_6
    new-instance v6, Lkotlin/Pair;

    .line 557
    .line 558
    invoke-direct {v6, v3, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 559
    .line 560
    .line 561
    invoke-virtual {v13}, La/ffj;->Q()La/wk9;

    .line 562
    .line 563
    .line 564
    move-result-object v3

    .line 565
    if-eqz v3, :cond_17

    .line 566
    .line 567
    iget-object v3, v3, La/wk9;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 568
    .line 569
    goto :goto_7

    .line 570
    :cond_17
    const/4 v3, 0x0

    .line 571
    :goto_7
    if-eqz v3, :cond_18

    .line 572
    .line 573
    invoke-static {v3, v12}, La/wdx;->J(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;Ljava/util/Calendar;)V

    .line 574
    .line 575
    .line 576
    invoke-virtual {v12}, Ljava/util/Calendar;->getTimeInMillis()J

    .line 577
    .line 578
    .line 579
    move-result-wide v7

    .line 580
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 581
    .line 582
    .line 583
    move-result-object v11

    .line 584
    goto :goto_8

    .line 585
    :cond_18
    const/4 v11, 0x0

    .line 586
    :goto_8
    new-instance v3, Lkotlin/Pair;

    .line 587
    .line 588
    invoke-direct {v3, v2, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 589
    .line 590
    .line 591
    filled-new-array {v6, v3}, [Lkotlin/Pair;

    .line 592
    .line 593
    .line 594
    move-result-object v2

    .line 595
    invoke-static {v2}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    invoke-virtual {v1, v2, v4}, Landroidx/fragment/app/e;->t0(Landroid/os/Bundle;Ljava/lang/String;)V

    .line 600
    .line 601
    .line 602
    :goto_9
    invoke-virtual {v0}, La/yo8;->x0()V

    .line 603
    .line 604
    .line 605
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 606
    .line 607
    goto :goto_a

    .line 608
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 609
    .line 610
    .line 611
    const/4 v11, 0x0

    .line 612
    :goto_a
    return-object v11

    .line 613
    :pswitch_2
    check-cast v0, Lkotlin/jvm/functions/Function2;

    .line 614
    .line 615
    check-cast v13, La/l9n;

    .line 616
    .line 617
    check-cast v12, La/pz40;

    .line 618
    .line 619
    if-eqz v0, :cond_1a

    .line 620
    .line 621
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 622
    .line 623
    .line 624
    move-result-object v1

    .line 625
    check-cast v1, Ljava/lang/String;

    .line 626
    .line 627
    invoke-interface {v0, v13, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 628
    .line 629
    .line 630
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 631
    .line 632
    return-object v0

    .line 633
    :pswitch_3
    check-cast v0, La/ujd;

    .line 634
    .line 635
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 636
    .line 637
    check-cast v12, La/k3t0;

    .line 638
    .line 639
    new-instance v1, La/jr2;

    .line 640
    .line 641
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 642
    .line 643
    .line 644
    new-instance v2, La/ebh;

    .line 645
    .line 646
    invoke-direct {v2, v12, v10}, La/ebh;-><init>(La/k3t0;B)V

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0, v13, v1, v2}, La/ujd;->c(Landroidx/fragment/app/Fragment;La/ms2;Lkotlin/jvm/functions/Function1;)V

    .line 650
    .line 651
    .line 652
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 653
    .line 654
    return-object v0

    .line 655
    :pswitch_4
    check-cast v0, La/vgg;

    .line 656
    .line 657
    check-cast v12, Ljava/lang/String;

    .line 658
    .line 659
    check-cast v13, La/hhq0;

    .line 660
    .line 661
    sget-object v1, La/vgg;->Q1:La/qud;

    .line 662
    .line 663
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 664
    .line 665
    .line 666
    move-result-object v1

    .line 667
    invoke-virtual {v1, v12}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    if-eqz v1, :cond_1b

    .line 672
    .line 673
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 674
    .line 675
    goto :goto_b

    .line 676
    :cond_1b
    sget-object v1, La/djg;->n2:La/kwd;

    .line 677
    .line 678
    iget-object v2, v13, La/hhq0;->a:La/ygq0;

    .line 679
    .line 680
    iget-wide v3, v13, La/hhq0;->b:J

    .line 681
    .line 682
    iget-wide v5, v13, La/hhq0;->c:J

    .line 683
    .line 684
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 688
    .line 689
    .line 690
    new-instance v1, La/djg;

    .line 691
    .line 692
    invoke-direct {v1}, La/djg;-><init>()V

    .line 693
    .line 694
    .line 695
    iget-byte v2, v2, La/ygq0;->a:B

    .line 696
    .line 697
    sget-object v7, La/djg;->o2:[La/iiy;

    .line 698
    .line 699
    aget-object v9, v7, v9

    .line 700
    .line 701
    iget-object v11, v1, La/djg;->k2:La/zz2;

    .line 702
    .line 703
    invoke-virtual {v11, v1, v9, v2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 704
    .line 705
    .line 706
    iget-object v2, v1, La/djg;->l2:La/r34;

    .line 707
    .line 708
    aget-object v9, v7, v10

    .line 709
    .line 710
    invoke-virtual {v2, v1, v9, v3, v4}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 711
    .line 712
    .line 713
    iget-object v2, v1, La/djg;->m2:La/r34;

    .line 714
    .line 715
    aget-object v3, v7, v8

    .line 716
    .line 717
    invoke-virtual {v2, v1, v3, v5, v6}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    invoke-virtual {v1, v0, v12}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 725
    .line 726
    .line 727
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 728
    .line 729
    :goto_b
    return-object v0

    .line 730
    :pswitch_5
    check-cast v0, La/pz40;

    .line 731
    .line 732
    check-cast v13, La/pz40;

    .line 733
    .line 734
    check-cast v12, La/pz40;

    .line 735
    .line 736
    new-instance v1, La/prs0;

    .line 737
    .line 738
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 739
    .line 740
    .line 741
    move-result-object v0

    .line 742
    invoke-interface {v13}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 743
    .line 744
    .line 745
    move-result-object v2

    .line 746
    invoke-interface {v12}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 747
    .line 748
    .line 749
    move-result-object v3

    .line 750
    invoke-direct {v1, v0, v2, v3}, La/prs0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 751
    .line 752
    .line 753
    return-object v1

    .line 754
    :pswitch_6
    check-cast v0, Ljava/lang/Exception;

    .line 755
    .line 756
    check-cast v13, Ljava/util/concurrent/Executor;

    .line 757
    .line 758
    check-cast v12, La/ybf;

    .line 759
    .line 760
    invoke-static {v0, v13, v12}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$I96JcpYfaG8OJdM-2J7UmFIJHiE(Ljava/lang/Exception;Ljava/util/concurrent/Executor;La/ybf;)Lkotlin/Unit;

    .line 761
    .line 762
    .line 763
    move-result-object v0

    .line 764
    return-object v0

    .line 765
    :pswitch_7
    check-cast v0, Ljava/util/concurrent/Executor;

    .line 766
    .line 767
    check-cast v13, La/ybf;

    .line 768
    .line 769
    check-cast v12, La/mie0;

    .line 770
    .line 771
    invoke-static {v0, v13, v12}, Landroidx/credentials/playservices/CredentialProviderPlayServicesImpl;->$r8$lambda$_y5WH3MEXM44F4UiflADvlnUoCA(Ljava/util/concurrent/Executor;La/ybf;La/mie0;)Lkotlin/Unit;

    .line 772
    .line 773
    .line 774
    move-result-object v0

    .line 775
    return-object v0

    .line 776
    :pswitch_8
    move-object v11, v0

    .line 777
    check-cast v11, La/nee;

    .line 778
    .line 779
    move-object v0, v13

    .line 780
    check-cast v0, La/aht0;

    .line 781
    .line 782
    move-object v1, v12

    .line 783
    check-cast v1, La/j39;

    .line 784
    .line 785
    iget-object v2, v11, La/nee;->t:La/h03;

    .line 786
    .line 787
    :goto_c
    iget-object v3, v2, La/h03;->b:Ljava/lang/Object;

    .line 788
    .line 789
    check-cast v3, La/xz40;

    .line 790
    .line 791
    iget v6, v3, La/xz40;->c:I

    .line 792
    .line 793
    if-eqz v6, :cond_1e

    .line 794
    .line 795
    if-eqz v6, :cond_1d

    .line 796
    .line 797
    add-int/lit8 v6, v6, -0x1

    .line 798
    .line 799
    iget-object v3, v3, La/xz40;->a:[Ljava/lang/Object;

    .line 800
    .line 801
    aget-object v3, v3, v6

    .line 802
    .line 803
    check-cast v3, La/lee;

    .line 804
    .line 805
    iget-object v3, v3, La/lee;->a:La/f39;

    .line 806
    .line 807
    invoke-virtual {v3}, La/f39;->invoke()Ljava/lang/Object;

    .line 808
    .line 809
    .line 810
    move-result-object v3

    .line 811
    move-object/from16 v18, v3

    .line 812
    .line 813
    check-cast v18, La/jge0;

    .line 814
    .line 815
    if-nez v18, :cond_1c

    .line 816
    .line 817
    move v3, v10

    .line 818
    goto :goto_d

    .line 819
    :cond_1c
    const-wide/16 v21, 0x0

    .line 820
    .line 821
    const/16 v23, 0x3

    .line 822
    .line 823
    const-wide/16 v19, 0x0

    .line 824
    .line 825
    move-object/from16 v17, v11

    .line 826
    .line 827
    invoke-static/range {v17 .. v23}, La/nee;->b1(La/nee;La/jge0;JJI)Z

    .line 828
    .line 829
    .line 830
    move-result v3

    .line 831
    :goto_d
    if-eqz v3, :cond_1e

    .line 832
    .line 833
    iget-object v3, v2, La/h03;->b:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v3, La/xz40;

    .line 836
    .line 837
    iget v6, v3, La/xz40;->c:I

    .line 838
    .line 839
    sub-int/2addr v6, v10

    .line 840
    invoke-virtual {v3, v6}, La/xz40;->k(I)Ljava/lang/Object;

    .line 841
    .line 842
    .line 843
    move-result-object v3

    .line 844
    check-cast v3, La/lee;

    .line 845
    .line 846
    iget-object v3, v3, La/lee;->b:La/n5a;

    .line 847
    .line 848
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    sget-object v7, La/j0g0;->b:La/e0g0;

    .line 851
    .line 852
    invoke-virtual {v3, v6}, La/n5a;->resumeWith(Ljava/lang/Object;)V

    .line 853
    .line 854
    .line 855
    goto :goto_c

    .line 856
    :cond_1d
    const-string v0, "MutableVector is empty."

    .line 857
    .line 858
    invoke-static {v0}, La/v4i0;->o(Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    const/4 v11, 0x0

    .line 862
    goto :goto_e

    .line 863
    :cond_1e
    iget-boolean v2, v11, La/nee;->u:Z

    .line 864
    .line 865
    if-eqz v2, :cond_1f

    .line 866
    .line 867
    iget-object v2, v11, La/nee;->s:La/ibh0;

    .line 868
    .line 869
    invoke-virtual {v2}, La/ibh0;->invoke()Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    move-result-object v2

    .line 873
    move-object v12, v2

    .line 874
    check-cast v12, La/jge0;

    .line 875
    .line 876
    if-eqz v12, :cond_1f

    .line 877
    .line 878
    const-wide/16 v15, 0x0

    .line 879
    .line 880
    const/16 v17, 0x3

    .line 881
    .line 882
    const-wide/16 v13, 0x0

    .line 883
    .line 884
    invoke-static/range {v11 .. v17}, La/nee;->b1(La/nee;La/jge0;JJI)Z

    .line 885
    .line 886
    .line 887
    move-result v2

    .line 888
    if-ne v2, v10, :cond_1f

    .line 889
    .line 890
    iput-boolean v9, v11, La/nee;->u:Z

    .line 891
    .line 892
    :cond_1f
    invoke-virtual {v11, v1, v4, v5}, La/nee;->Z0(La/j39;J)F

    .line 893
    .line 894
    .line 895
    move-result v1

    .line 896
    iput v1, v0, La/aht0;->e:F

    .line 897
    .line 898
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 899
    .line 900
    :goto_e
    return-object v11

    .line 901
    :pswitch_9
    check-cast v0, Lokhttp3/CertificatePinner;

    .line 902
    .line 903
    check-cast v13, Lokhttp3/Handshake;

    .line 904
    .line 905
    check-cast v12, Lokhttp3/Address;

    .line 906
    .line 907
    iget-object v0, v0, Lokhttp3/CertificatePinner;->b:Lokhttp3/internal/tls/CertificateChainCleaner;

    .line 908
    .line 909
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v13}, Lokhttp3/Handshake;->a()Ljava/util/List;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    iget-object v2, v12, Lokhttp3/Address;->i:Lokhttp3/HttpUrl;

    .line 917
    .line 918
    iget-object v2, v2, Lokhttp3/HttpUrl;->d:Ljava/lang/String;

    .line 919
    .line 920
    invoke-virtual {v0, v2, v1}, Lokhttp3/internal/tls/CertificateChainCleaner;->a(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    .line 921
    .line 922
    .line 923
    move-result-object v0

    .line 924
    return-object v0

    .line 925
    :pswitch_a
    check-cast v0, La/ujd;

    .line 926
    .line 927
    check-cast v13, Landroidx/fragment/app/Fragment;

    .line 928
    .line 929
    check-cast v12, La/pjd;

    .line 930
    .line 931
    iget-object v0, v0, La/ujd;->c:La/e720;

    .line 932
    .line 933
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 934
    .line 935
    .line 936
    move-result-object v1

    .line 937
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 938
    .line 939
    .line 940
    iget-object v2, v12, La/pjd;->b:La/m97;

    .line 941
    .line 942
    iget-object v3, v12, La/pjd;->a:La/m0k0;

    .line 943
    .line 944
    iget-object v4, v12, La/pjd;->c:La/ms2;

    .line 945
    .line 946
    invoke-virtual {v0, v1, v2, v3, v4}, La/e720;->b(Landroidx/fragment/app/e;La/m97;La/m0k0;La/ms2;)V

    .line 947
    .line 948
    .line 949
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 950
    .line 951
    return-object v0

    .line 952
    :pswitch_b
    check-cast v0, La/xcz;

    .line 953
    .line 954
    check-cast v13, La/w6k;

    .line 955
    .line 956
    check-cast v12, La/k6z;

    .line 957
    .line 958
    invoke-virtual {v0}, La/xcz;->j()La/mcz;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    const/high16 v1, 0x42100000    # 36.0f

    .line 963
    .line 964
    invoke-interface {v13, v1}, La/w6k;->w0(F)F

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    iget-object v2, v0, La/mcz;->l:Ljava/util/List;

    .line 969
    .line 970
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 971
    .line 972
    .line 973
    move-result-object v2

    .line 974
    check-cast v2, La/ncz;

    .line 975
    .line 976
    if-eqz v2, :cond_20

    .line 977
    .line 978
    iget v3, v2, La/ncz;->a:I

    .line 979
    .line 980
    if-nez v3, :cond_20

    .line 981
    .line 982
    goto :goto_f

    .line 983
    :cond_20
    const/4 v2, 0x0

    .line 984
    :goto_f
    iget-object v3, v0, La/mcz;->l:Ljava/util/List;

    .line 985
    .line 986
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->f0(Ljava/util/List;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    move-result-object v3

    .line 990
    check-cast v3, La/ncz;

    .line 991
    .line 992
    if-eqz v3, :cond_21

    .line 993
    .line 994
    iget v4, v3, La/ncz;->a:I

    .line 995
    .line 996
    iget v5, v0, La/mcz;->o:I

    .line 997
    .line 998
    sub-int/2addr v5, v10

    .line 999
    if-ne v4, v5, :cond_21

    .line 1000
    .line 1001
    move-object v11, v3

    .line 1002
    goto :goto_10

    .line 1003
    :cond_21
    const/4 v11, 0x0

    .line 1004
    :goto_10
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1005
    .line 1006
    if-eqz v2, :cond_22

    .line 1007
    .line 1008
    iget v4, v0, La/mcz;->m:I

    .line 1009
    .line 1010
    iget v2, v2, La/ncz;->p:I

    .line 1011
    .line 1012
    sub-int/2addr v4, v2

    .line 1013
    int-to-float v2, v4

    .line 1014
    div-float/2addr v2, v1

    .line 1015
    invoke-static {v2, v7, v3}, La/l1e0;->c(FFF)F

    .line 1016
    .line 1017
    .line 1018
    move-result v2

    .line 1019
    goto :goto_11

    .line 1020
    :cond_22
    move v2, v3

    .line 1021
    :goto_11
    if-eqz v11, :cond_23

    .line 1022
    .line 1023
    iget v4, v11, La/ncz;->p:I

    .line 1024
    .line 1025
    iget v5, v11, La/ncz;->q:I

    .line 1026
    .line 1027
    add-int/2addr v4, v5

    .line 1028
    iget v0, v0, La/mcz;->n:I

    .line 1029
    .line 1030
    sub-int/2addr v4, v0

    .line 1031
    int-to-float v0, v4

    .line 1032
    div-float/2addr v0, v1

    .line 1033
    invoke-static {v0, v7, v3}, La/l1e0;->c(FFF)F

    .line 1034
    .line 1035
    .line 1036
    move-result v3

    .line 1037
    :cond_23
    sget-object v0, La/k6z;->b:La/k6z;

    .line 1038
    .line 1039
    if-ne v12, v0, :cond_24

    .line 1040
    .line 1041
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    new-instance v2, Lkotlin/Pair;

    .line 1050
    .line 1051
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1052
    .line 1053
    .line 1054
    goto :goto_12

    .line 1055
    :cond_24
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1056
    .line 1057
    .line 1058
    move-result-object v0

    .line 1059
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v1

    .line 1063
    new-instance v2, Lkotlin/Pair;

    .line 1064
    .line 1065
    invoke-direct {v2, v0, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1066
    .line 1067
    .line 1068
    :goto_12
    return-object v2

    .line 1069
    :pswitch_c
    check-cast v0, La/vne;

    .line 1070
    .line 1071
    check-cast v13, La/dk5;

    .line 1072
    .line 1073
    check-cast v12, La/pz40;

    .line 1074
    .line 1075
    new-instance v1, La/nbd;

    .line 1076
    .line 1077
    const/4 v2, 0x0

    .line 1078
    invoke-direct {v1, v12, v2, v9}, La/nbd;-><init>(La/pz40;La/yje;B)V

    .line 1079
    .line 1080
    .line 1081
    invoke-static {v0, v2, v2, v1, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v13}, La/dk5;->O()V

    .line 1085
    .line 1086
    .line 1087
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1088
    .line 1089
    return-object v0

    .line 1090
    :pswitch_d
    check-cast v0, La/zfb;

    .line 1091
    .line 1092
    check-cast v13, La/kie0;

    .line 1093
    .line 1094
    check-cast v12, La/lk50;

    .line 1095
    .line 1096
    iget v1, v13, La/kie0;->a:I

    .line 1097
    .line 1098
    invoke-virtual {v0, v1, v12}, La/zfb;->z(ILa/lk50;)V

    .line 1099
    .line 1100
    .line 1101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1102
    .line 1103
    return-object v0

    .line 1104
    :pswitch_e
    check-cast v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;

    .line 1105
    .line 1106
    check-cast v13, La/bdu;

    .line 1107
    .line 1108
    check-cast v12, La/wgu;

    .line 1109
    .line 1110
    new-instance v14, La/o79;

    .line 1111
    .line 1112
    iget-wide v1, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->a:J

    .line 1113
    .line 1114
    iget-wide v3, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->b:J

    .line 1115
    .line 1116
    iget v5, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->c:I

    .line 1117
    .line 1118
    iget-wide v6, v0, Lorg/xplatform/game_broadcasting/api/presentation/models/BroadcastingZoneLandscapeParams;->d:J

    .line 1119
    .line 1120
    invoke-virtual {v13}, La/bdu;->a()Ljava/lang/String;

    .line 1121
    .line 1122
    .line 1123
    move-result-object v22

    .line 1124
    invoke-virtual {v12}, La/wgu;->a()Ljava/lang/String;

    .line 1125
    .line 1126
    .line 1127
    move-result-object v23

    .line 1128
    sget-object v28, La/w3w0;->b:La/w3w0;

    .line 1129
    .line 1130
    const/16 v31, 0x1

    .line 1131
    .line 1132
    const-string v32, ""

    .line 1133
    .line 1134
    const/16 v24, 0x0

    .line 1135
    .line 1136
    const/16 v25, 0x0

    .line 1137
    .line 1138
    const/16 v26, 0x0

    .line 1139
    .line 1140
    const/16 v27, 0x0

    .line 1141
    .line 1142
    const/16 v30, 0x0

    .line 1143
    .line 1144
    move-object/from16 v29, v28

    .line 1145
    .line 1146
    move-wide v15, v1

    .line 1147
    move-wide/from16 v17, v3

    .line 1148
    .line 1149
    move/from16 v19, v5

    .line 1150
    .line 1151
    move-wide/from16 v20, v6

    .line 1152
    .line 1153
    invoke-direct/range {v14 .. v32}, La/o79;-><init>(JJIJLjava/lang/String;Ljava/lang/String;ZZZZLa/w3w0;La/w3w0;ZZLjava/lang/String;)V

    .line 1154
    .line 1155
    .line 1156
    return-object v14

    .line 1157
    :pswitch_f
    check-cast v0, La/g39;

    .line 1158
    .line 1159
    check-cast v13, La/s460;

    .line 1160
    .line 1161
    check-cast v12, La/gj4;

    .line 1162
    .line 1163
    invoke-static {v0, v13, v12}, La/g39;->Z0(La/g39;La/s460;La/gj4;)La/jge0;

    .line 1164
    .line 1165
    .line 1166
    move-result-object v5

    .line 1167
    if-eqz v5, :cond_26

    .line 1168
    .line 1169
    iget-object v4, v0, La/g39;->o:La/nee;

    .line 1170
    .line 1171
    iget-wide v0, v4, La/nee;->v:J

    .line 1172
    .line 1173
    invoke-static {v0, v1, v2, v3}, La/qkx;->a(JJ)Z

    .line 1174
    .line 1175
    .line 1176
    move-result v0

    .line 1177
    if-eqz v0, :cond_25

    .line 1178
    .line 1179
    const-string v0, "Expected BringIntoViewRequester to not be used before parents are placed."

    .line 1180
    .line 1181
    invoke-static {v0}, La/adx;->c(Ljava/lang/String;)V

    .line 1182
    .line 1183
    .line 1184
    :cond_25
    invoke-virtual {v4}, La/nee;->a1()J

    .line 1185
    .line 1186
    .line 1187
    move-result-wide v6

    .line 1188
    const-wide/16 v8, 0x0

    .line 1189
    .line 1190
    invoke-virtual/range {v4 .. v9}, La/nee;->d1(La/jge0;JJ)J

    .line 1191
    .line 1192
    .line 1193
    move-result-wide v0

    .line 1194
    const-wide v2, -0x7fffffff80000000L    # -1.0609978955E-314

    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    xor-long/2addr v0, v2

    .line 1200
    invoke-virtual {v5, v0, v1}, La/jge0;->m(J)La/jge0;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v11

    .line 1204
    goto :goto_13

    .line 1205
    :cond_26
    const/4 v11, 0x0

    .line 1206
    :goto_13
    return-object v11

    .line 1207
    :pswitch_10
    check-cast v0, La/k9c;

    .line 1208
    .line 1209
    check-cast v13, La/m1e;

    .line 1210
    .line 1211
    check-cast v12, La/pru;

    .line 1212
    .line 1213
    invoke-virtual {v0}, La/k9c;->a()Z

    .line 1214
    .line 1215
    .line 1216
    move-result v15

    .line 1217
    invoke-interface {v13}, La/m1e;->c()Z

    .line 1218
    .line 1219
    .line 1220
    move-result v16

    .line 1221
    invoke-virtual {v12}, La/pru;->a()La/sff0;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    iget-object v0, v0, La/sff0;->d:La/q1w0;

    .line 1226
    .line 1227
    iget-object v0, v0, La/q1w0;->a:La/dyv0;

    .line 1228
    .line 1229
    iget-boolean v0, v0, La/dyv0;->g:Z

    .line 1230
    .line 1231
    new-instance v14, La/kl8;

    .line 1232
    .line 1233
    sget-object v18, La/je8;->c:La/je8;

    .line 1234
    .line 1235
    sget-object v19, La/csr;->e:La/csr;

    .line 1236
    .line 1237
    sget-object v22, La/iun;->a:La/iun;

    .line 1238
    .line 1239
    new-instance v23, La/ql5;

    .line 1240
    .line 1241
    sget-object v35, La/txs0;->d:La/txs0;

    .line 1242
    .line 1243
    const/16 v38, 0x0

    .line 1244
    .line 1245
    const-string v39, ""

    .line 1246
    .line 1247
    const-wide/16 v24, -0x1

    .line 1248
    .line 1249
    const-wide/16 v26, 0x0

    .line 1250
    .line 1251
    const/16 v28, 0x0

    .line 1252
    .line 1253
    const/16 v29, 0x0

    .line 1254
    .line 1255
    const-wide/16 v30, 0x0

    .line 1256
    .line 1257
    const-string v32, ""

    .line 1258
    .line 1259
    const-string v33, ""

    .line 1260
    .line 1261
    const/16 v34, 0x0

    .line 1262
    .line 1263
    const-string v36, ""

    .line 1264
    .line 1265
    const-string v37, ""

    .line 1266
    .line 1267
    invoke-direct/range {v23 .. v39}, La/ql5;-><init>(JDZZJLjava/lang/String;Ljava/lang/String;ILa/txs0;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    .line 1268
    .line 1269
    .line 1270
    sget-object v28, La/kg;->b:La/kg;

    .line 1271
    .line 1272
    sget-object v17, La/u3t;->a:La/u3t;

    .line 1273
    .line 1274
    const/16 v20, 0x1

    .line 1275
    .line 1276
    const/16 v21, 0x0

    .line 1277
    .line 1278
    const/16 v24, 0x0

    .line 1279
    .line 1280
    const/16 v27, 0x0

    .line 1281
    .line 1282
    move-object/from16 v26, v23

    .line 1283
    .line 1284
    move-object/from16 v23, v22

    .line 1285
    .line 1286
    move-object/from16 v25, v22

    .line 1287
    .line 1288
    move/from16 v30, v0

    .line 1289
    .line 1290
    invoke-direct/range {v14 .. v30}, La/kl8;-><init>(ZZLa/w3t;La/je8;La/csr;ZZLjava/util/List;Ljava/util/List;ZLjava/util/List;La/ql5;ZLa/kg;ZZ)V

    .line 1291
    .line 1292
    .line 1293
    return-object v14

    .line 1294
    :pswitch_11
    check-cast v0, Lkotlin/jvm/functions/Function1;

    .line 1295
    .line 1296
    check-cast v13, La/jh8;

    .line 1297
    .line 1298
    check-cast v12, Ljava/lang/String;

    .line 1299
    .line 1300
    new-instance v1, La/uh8;

    .line 1301
    .line 1302
    check-cast v13, La/fh8;

    .line 1303
    .line 1304
    iget-object v2, v13, La/fh8;->b:La/csr;

    .line 1305
    .line 1306
    invoke-direct {v1, v2, v12}, La/uh8;-><init>(La/csr;Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1310
    .line 1311
    .line 1312
    invoke-static {}, La/dyb;->u0()V

    .line 1313
    .line 1314
    .line 1315
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 1316
    .line 1317
    return-object v0

    .line 1318
    :pswitch_12
    check-cast v0, La/sbx0;

    .line 1319
    .line 1320
    check-cast v13, La/pru;

    .line 1321
    .line 1322
    check-cast v12, La/r9u;

    .line 1323
    .line 1324
    new-instance v1, La/zp7;

    .line 1325
    .line 1326
    sget-object v2, La/iun;->a:La/iun;

    .line 1327
    .line 1328
    iget-object v3, v0, La/sbx0;->d:Ljava/lang/Object;

    .line 1329
    .line 1330
    move-object v6, v3

    .line 1331
    check-cast v6, Ljava/lang/String;

    .line 1332
    .line 1333
    iget-object v3, v0, La/sbx0;->e:Ljava/lang/Object;

    .line 1334
    .line 1335
    move-object v7, v3

    .line 1336
    check-cast v7, Ljava/lang/String;

    .line 1337
    .line 1338
    iget v8, v0, La/sbx0;->b:I

    .line 1339
    .line 1340
    iget-object v0, v0, La/sbx0;->c:Ljava/lang/Object;

    .line 1341
    .line 1342
    move-object v9, v0

    .line 1343
    check-cast v9, Ljava/lang/String;

    .line 1344
    .line 1345
    invoke-virtual {v13}, La/pru;->a()La/sff0;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v0

    .line 1349
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 1350
    .line 1351
    iget-object v10, v0, La/mum0;->y:La/v5l0;

    .line 1352
    .line 1353
    sget-object v0, La/ygp;->t:La/ygp;

    .line 1354
    .line 1355
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1356
    .line 1357
    .line 1358
    iget-object v3, v12, La/r9u;->a:La/j1q0;

    .line 1359
    .line 1360
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1361
    .line 1362
    .line 1363
    iget-object v3, v3, La/j1q0;->a:La/m1q0;

    .line 1364
    .line 1365
    invoke-virtual {v3, v0}, La/m1q0;->d(La/ygp;)Z

    .line 1366
    .line 1367
    .line 1368
    move-result v11

    .line 1369
    const/4 v3, 0x1

    .line 1370
    const/4 v4, 0x0

    .line 1371
    const/4 v5, 0x1

    .line 1372
    invoke-direct/range {v1 .. v11}, La/zp7;-><init>(Ljava/util/List;ZZZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;La/v5l0;Z)V

    .line 1373
    .line 1374
    .line 1375
    return-object v1

    .line 1376
    :pswitch_13
    check-cast v0, La/bxq0;

    .line 1377
    .line 1378
    check-cast v13, La/vne;

    .line 1379
    .line 1380
    check-cast v12, La/pz40;

    .line 1381
    .line 1382
    invoke-virtual {v0}, La/bxq0;->b()Z

    .line 1383
    .line 1384
    .line 1385
    move-result v1

    .line 1386
    if-eqz v1, :cond_27

    .line 1387
    .line 1388
    new-instance v1, La/wa;

    .line 1389
    .line 1390
    const/16 v2, 0x13

    .line 1391
    .line 1392
    const/4 v3, 0x0

    .line 1393
    invoke-direct {v1, v0, v3, v2}, La/wa;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1394
    .line 1395
    .line 1396
    invoke-static {v13, v3, v3, v1, v6}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 1397
    .line 1398
    .line 1399
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 1400
    .line 1401
    invoke-interface {v12, v0}, La/pz40;->setValue(Ljava/lang/Object;)V

    .line 1402
    .line 1403
    .line 1404
    :cond_27
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1405
    .line 1406
    return-object v0

    .line 1407
    :pswitch_14
    check-cast v0, Landroid/content/Intent;

    .line 1408
    .line 1409
    move-object v14, v13

    .line 1410
    check-cast v14, La/dz5;

    .line 1411
    .line 1412
    check-cast v12, Landroid/content/Context;

    .line 1413
    .line 1414
    const-string v1, "selected_game_id"

    .line 1415
    .line 1416
    invoke-virtual {v0, v1, v2, v3}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1417
    .line 1418
    .line 1419
    move-result-wide v6

    .line 1420
    cmp-long v8, v6, v2

    .line 1421
    .line 1422
    if-nez v8, :cond_28

    .line 1423
    .line 1424
    const-string v6, "widget_shared_prefs"

    .line 1425
    .line 1426
    invoke-virtual {v12, v6, v9}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v6

    .line 1430
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1431
    .line 1432
    .line 1433
    const-string v7, "widget_selected_game_id"

    .line 1434
    .line 1435
    invoke-interface {v6, v7, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v6

    .line 1439
    :cond_28
    const-string v8, "selected_sub_game_id"

    .line 1440
    .line 1441
    move-wide v15, v2

    .line 1442
    invoke-virtual {v0, v8, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v2

    .line 1446
    const-string v11, "is_live"

    .line 1447
    .line 1448
    invoke-virtual {v0, v11, v10}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1449
    .line 1450
    .line 1451
    move-result v21

    .line 1452
    const-string v10, "sportId"

    .line 1453
    .line 1454
    move-wide/from16 v17, v15

    .line 1455
    .line 1456
    invoke-virtual {v0, v10, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1457
    .line 1458
    .line 1459
    move-result-wide v15

    .line 1460
    const-string v13, "subSportId"

    .line 1461
    .line 1462
    move-wide/from16 v19, v17

    .line 1463
    .line 1464
    invoke-virtual {v0, v13, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1465
    .line 1466
    .line 1467
    move-result-wide v17

    .line 1468
    const-string v9, "champ_id"

    .line 1469
    .line 1470
    invoke-virtual {v0, v9, v4, v5}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    .line 1471
    .line 1472
    .line 1473
    move-result-wide v4

    .line 1474
    const-string v9, "favorite"

    .line 1475
    .line 1476
    move-wide/from16 v23, v4

    .line 1477
    .line 1478
    const/4 v4, 0x0

    .line 1479
    invoke-virtual {v0, v9, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 1480
    .line 1481
    .line 1482
    move-result v22

    .line 1483
    cmp-long v0, v6, v19

    .line 1484
    .line 1485
    if-nez v0, :cond_29

    .line 1486
    .line 1487
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1488
    .line 1489
    goto :goto_15

    .line 1490
    :cond_29
    move-wide/from16 v19, v23

    .line 1491
    .line 1492
    invoke-virtual/range {v14 .. v22}, La/dz5;->o(JJJZZ)V

    .line 1493
    .line 1494
    .line 1495
    move-wide v4, v15

    .line 1496
    move-wide/from16 v14, v17

    .line 1497
    .line 1498
    move/from16 v0, v21

    .line 1499
    .line 1500
    invoke-static {v12}, La/j120;->Q(Landroid/content/Context;)Landroid/content/Intent;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v9

    .line 1504
    if-nez v9, :cond_2a

    .line 1505
    .line 1506
    goto :goto_14

    .line 1507
    :cond_2a
    invoke-virtual {v9, v10, v4, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v4

    .line 1511
    invoke-virtual {v4, v13, v14, v15}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v4

    .line 1515
    invoke-virtual {v4, v11, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 1516
    .line 1517
    .line 1518
    move-result-object v0

    .line 1519
    invoke-virtual {v0, v1, v6, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1520
    .line 1521
    .line 1522
    move-result-object v0

    .line 1523
    invoke-virtual {v0, v8, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 1524
    .line 1525
    .line 1526
    move-result-object v0

    .line 1527
    const-string v1, "CUSTOM_INTENT"

    .line 1528
    .line 1529
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 1530
    .line 1531
    .line 1532
    move-result-object v0

    .line 1533
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    invoke-virtual {v12, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1537
    .line 1538
    .line 1539
    :goto_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1540
    .line 1541
    :goto_15
    return-object v0

    .line 1542
    :pswitch_15
    check-cast v0, La/oyq0;

    .line 1543
    .line 1544
    check-cast v13, La/imm;

    .line 1545
    .line 1546
    check-cast v12, La/imm;

    .line 1547
    .line 1548
    iget-object v1, v0, La/oyq0;->c:La/agk0;

    .line 1549
    .line 1550
    invoke-virtual {v1}, La/agk0;->l()F

    .line 1551
    .line 1552
    .line 1553
    move-result v1

    .line 1554
    iget v0, v0, La/oyq0;->a:F

    .line 1555
    .line 1556
    cmpg-float v1, v1, v0

    .line 1557
    .line 1558
    if-nez v1, :cond_2b

    .line 1559
    .line 1560
    cmpg-float v0, v0, v7

    .line 1561
    .line 1562
    if-nez v0, :cond_2c

    .line 1563
    .line 1564
    :cond_2b
    move-object v13, v12

    .line 1565
    :cond_2c
    return-object v13

    .line 1566
    :pswitch_16
    check-cast v0, La/pa5;

    .line 1567
    .line 1568
    check-cast v13, La/gr00;

    .line 1569
    .line 1570
    check-cast v12, La/kie0;

    .line 1571
    .line 1572
    invoke-virtual {v0}, La/pa5;->a()V

    .line 1573
    .line 1574
    .line 1575
    iget-object v0, v13, La/gr00;->c:Ljava/lang/Object;

    .line 1576
    .line 1577
    move-object v1, v0

    .line 1578
    check-cast v1, La/a14;

    .line 1579
    .line 1580
    iget v2, v12, La/kie0;->a:I

    .line 1581
    .line 1582
    :cond_2d
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 1583
    .line 1584
    .line 1585
    move-result v0

    .line 1586
    ushr-int/lit8 v3, v0, 0x1b

    .line 1587
    .line 1588
    and-int/lit8 v3, v3, 0xf

    .line 1589
    .line 1590
    if-ne v3, v2, :cond_2e

    .line 1591
    .line 1592
    add-int/lit8 v3, v0, -0x1

    .line 1593
    .line 1594
    goto :goto_16

    .line 1595
    :cond_2e
    move v3, v0

    .line 1596
    :goto_16
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/atomic/AtomicInteger;->compareAndSet(II)Z

    .line 1597
    .line 1598
    .line 1599
    move-result v0

    .line 1600
    if-eqz v0, :cond_2d

    .line 1601
    .line 1602
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1603
    .line 1604
    return-object v0

    .line 1605
    :pswitch_17
    check-cast v0, Landroid/view/View;

    .line 1606
    .line 1607
    check-cast v13, La/clz;

    .line 1608
    .line 1609
    check-cast v12, Lkotlin/jvm/functions/Function0;

    .line 1610
    .line 1611
    invoke-virtual {v0, v7}, Landroid/view/View;->setTranslationY(F)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v0, v7}, Landroid/view/View;->setAlpha(F)V

    .line 1615
    .line 1616
    .line 1617
    const/4 v4, 0x0

    .line 1618
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1619
    .line 1620
    .line 1621
    new-instance v1, Landroid/animation/AnimatorSet;

    .line 1622
    .line 1623
    invoke-direct {v1}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1624
    .line 1625
    .line 1626
    sget-object v2, Landroid/view/View;->SCALE_X:Landroid/util/Property;

    .line 1627
    .line 1628
    new-array v3, v8, [F

    .line 1629
    .line 1630
    fill-array-data v3, :array_0

    .line 1631
    .line 1632
    .line 1633
    invoke-static {v0, v2, v3}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1634
    .line 1635
    .line 1636
    move-result-object v2

    .line 1637
    sget-object v3, Landroid/view/View;->SCALE_Y:Landroid/util/Property;

    .line 1638
    .line 1639
    new-array v4, v8, [F

    .line 1640
    .line 1641
    fill-array-data v4, :array_1

    .line 1642
    .line 1643
    .line 1644
    invoke-static {v0, v3, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1645
    .line 1646
    .line 1647
    move-result-object v3

    .line 1648
    sget-object v4, Landroid/view/View;->ALPHA:Landroid/util/Property;

    .line 1649
    .line 1650
    new-array v5, v8, [F

    .line 1651
    .line 1652
    fill-array-data v5, :array_2

    .line 1653
    .line 1654
    .line 1655
    invoke-static {v0, v4, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Landroid/util/Property;[F)Landroid/animation/ObjectAnimator;

    .line 1656
    .line 1657
    .line 1658
    move-result-object v0

    .line 1659
    new-array v4, v6, [Landroid/animation/Animator;

    .line 1660
    .line 1661
    const/16 v22, 0x0

    .line 1662
    .line 1663
    aput-object v2, v4, v22

    .line 1664
    .line 1665
    aput-object v3, v4, v10

    .line 1666
    .line 1667
    aput-object v0, v4, v8

    .line 1668
    .line 1669
    invoke-virtual {v1, v4}, Landroid/animation/AnimatorSet;->playTogether([Landroid/animation/Animator;)V

    .line 1670
    .line 1671
    .line 1672
    new-instance v0, La/tq;

    .line 1673
    .line 1674
    const/4 v2, 0x5

    .line 1675
    invoke-direct {v0, v12, v2}, La/tq;-><init>(Lkotlin/jvm/functions/Function0;B)V

    .line 1676
    .line 1677
    .line 1678
    const/16 v2, 0xb

    .line 1679
    .line 1680
    const/4 v3, 0x0

    .line 1681
    invoke-static {v13, v3, v0, v2}, La/unh0;->h0(La/clz;La/rrf0;Lkotlin/jvm/functions/Function0;I)La/y73;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    invoke-virtual {v1, v0}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1686
    .line 1687
    .line 1688
    const-wide/16 v2, 0x190

    .line 1689
    .line 1690
    invoke-virtual {v1, v2, v3}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 1691
    .line 1692
    .line 1693
    new-instance v0, La/f0p;

    .line 1694
    .line 1695
    invoke-direct {v0, v10}, La/f0p;-><init>(B)V

    .line 1696
    .line 1697
    .line 1698
    invoke-virtual {v1, v0}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v1}, Landroid/animation/AnimatorSet;->start()V

    .line 1702
    .line 1703
    .line 1704
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1705
    .line 1706
    return-object v0

    .line 1707
    :pswitch_18
    check-cast v0, La/pru;

    .line 1708
    .line 1709
    check-cast v13, La/r9u;

    .line 1710
    .line 1711
    move-object/from16 v24, v12

    .line 1712
    .line 1713
    check-cast v24, La/y78;

    .line 1714
    .line 1715
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 1716
    .line 1717
    .line 1718
    move-result-object v0

    .line 1719
    iget-object v0, v0, La/sff0;->g:La/mum0;

    .line 1720
    .line 1721
    iget-object v1, v0, La/mum0;->y:La/v5l0;

    .line 1722
    .line 1723
    iget-object v2, v0, La/mum0;->v:La/h8l0;

    .line 1724
    .line 1725
    iget-object v0, v0, La/mum0;->x:La/zvh0;

    .line 1726
    .line 1727
    sget-object v23, La/iun;->a:La/iun;

    .line 1728
    .line 1729
    sget-object v3, La/ygp;->t:La/ygp;

    .line 1730
    .line 1731
    iget-object v4, v13, La/r9u;->a:La/j1q0;

    .line 1732
    .line 1733
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1734
    .line 1735
    .line 1736
    iget-object v4, v4, La/j1q0;->a:La/m1q0;

    .line 1737
    .line 1738
    invoke-virtual {v4, v3}, La/m1q0;->d(La/ygp;)Z

    .line 1739
    .line 1740
    .line 1741
    move-result v28

    .line 1742
    new-instance v14, La/ce2;

    .line 1743
    .line 1744
    const/16 v26, 0x0

    .line 1745
    .line 1746
    const/16 v27, 0x0

    .line 1747
    .line 1748
    const-string v15, ""

    .line 1749
    .line 1750
    const/16 v16, 0x0

    .line 1751
    .line 1752
    sget-object v17, La/qhe;->a:La/qhe;

    .line 1753
    .line 1754
    const/16 v21, 0x0

    .line 1755
    .line 1756
    const/16 v22, 0x0

    .line 1757
    .line 1758
    const/16 v25, 0x0

    .line 1759
    .line 1760
    move-object/from16 v20, v0

    .line 1761
    .line 1762
    move-object/from16 v18, v1

    .line 1763
    .line 1764
    move-object/from16 v19, v2

    .line 1765
    .line 1766
    invoke-direct/range {v14 .. v28}, La/ce2;-><init>(Ljava/lang/String;ZLa/hie;La/v5l0;La/h8l0;La/zvh0;IZLjava/util/List;La/y78;La/wcb;ZZZ)V

    .line 1767
    .line 1768
    .line 1769
    return-object v14

    .line 1770
    :pswitch_19
    check-cast v0, La/vw0;

    .line 1771
    .line 1772
    check-cast v13, Landroid/webkit/WebView;

    .line 1773
    .line 1774
    check-cast v12, Landroid/webkit/WebResourceRequest;

    .line 1775
    .line 1776
    invoke-static {v0, v13, v12}, La/vw0;->e(La/vw0;Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z

    .line 1777
    .line 1778
    .line 1779
    move-result v0

    .line 1780
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    return-object v0

    .line 1785
    :pswitch_1a
    check-cast v0, La/vw0;

    .line 1786
    .line 1787
    check-cast v13, Landroid/webkit/WebView;

    .line 1788
    .line 1789
    check-cast v12, Ljava/lang/String;

    .line 1790
    .line 1791
    invoke-static {v0, v13, v12}, La/vw0;->d(La/vw0;Landroid/webkit/WebView;Ljava/lang/String;)Z

    .line 1792
    .line 1793
    .line 1794
    move-result v0

    .line 1795
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    return-object v0

    .line 1800
    :pswitch_1b
    check-cast v0, La/bv0;

    .line 1801
    .line 1802
    check-cast v13, La/j1q0;

    .line 1803
    .line 1804
    check-cast v12, La/bzt;

    .line 1805
    .line 1806
    new-instance v17, La/jw0;

    .line 1807
    .line 1808
    iget-object v1, v0, La/bv0;->a:Ljava/lang/String;

    .line 1809
    .line 1810
    iget-object v2, v0, La/bv0;->b:Ljava/lang/String;

    .line 1811
    .line 1812
    iget-object v3, v0, La/bv0;->c:Ljava/lang/String;

    .line 1813
    .line 1814
    iget-boolean v4, v0, La/bv0;->d:Z

    .line 1815
    .line 1816
    iget-wide v5, v0, La/bv0;->e:J

    .line 1817
    .line 1818
    iget-wide v7, v0, La/bv0;->f:J

    .line 1819
    .line 1820
    iget-object v0, v13, La/j1q0;->a:La/m1q0;

    .line 1821
    .line 1822
    invoke-virtual {v0}, La/m1q0;->b()Z

    .line 1823
    .line 1824
    .line 1825
    move-result v26

    .line 1826
    iget-object v0, v12, La/bzt;->a:La/fsd;

    .line 1827
    .line 1828
    invoke-virtual {v0}, La/fsd;->a()La/v8d;

    .line 1829
    .line 1830
    .line 1831
    move-result-object v0

    .line 1832
    iget-boolean v0, v0, La/v8d;->X:Z

    .line 1833
    .line 1834
    new-instance v9, La/ax0;

    .line 1835
    .line 1836
    const/4 v10, 0x0

    .line 1837
    invoke-direct {v9, v10, v10}, La/ax0;-><init>(Landroid/webkit/WebView;Landroid/view/View;)V

    .line 1838
    .line 1839
    .line 1840
    const/16 v27, 0x0

    .line 1841
    .line 1842
    const/16 v28, 0x0

    .line 1843
    .line 1844
    const/16 v29, 0x0

    .line 1845
    .line 1846
    move/from16 v30, v0

    .line 1847
    .line 1848
    move-object/from16 v18, v1

    .line 1849
    .line 1850
    move-object/from16 v19, v2

    .line 1851
    .line 1852
    move-object/from16 v20, v3

    .line 1853
    .line 1854
    move/from16 v21, v4

    .line 1855
    .line 1856
    move-wide/from16 v22, v5

    .line 1857
    .line 1858
    move-wide/from16 v24, v7

    .line 1859
    .line 1860
    move-object/from16 v31, v9

    .line 1861
    .line 1862
    invoke-direct/range {v17 .. v31}, La/jw0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJJZZZZZLa/ax0;)V

    .line 1863
    .line 1864
    .line 1865
    return-object v17

    .line 1866
    :pswitch_1c
    check-cast v0, La/kb0;

    .line 1867
    .line 1868
    check-cast v13, La/myr0;

    .line 1869
    .line 1870
    check-cast v12, Ljava/lang/String;

    .line 1871
    .line 1872
    iget-wide v1, v13, La/myr0;->a:J

    .line 1873
    .line 1874
    invoke-virtual {v0, v1, v2, v12}, La/kb0;->v(JLjava/lang/String;)V

    .line 1875
    .line 1876
    .line 1877
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1878
    .line 1879
    return-object v0

    .line 1880
    nop

    .line 1881
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

    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    :array_0
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    :array_1
    .array-data 4
        0x3f4ccccd    # 0.8f
        0x3f800000    # 1.0f
    .end array-data

    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    :array_2
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method
