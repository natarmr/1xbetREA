.class public final synthetic La/s32;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;


# direct methods
.method public synthetic constructor <init>(Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/s32;->a:B

    iput-object p1, p0, La/s32;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/s32;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/s32;->b:Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/util/List;

    .line 9
    .line 10
    sget v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance p1, La/w32;

    .line 27
    .line 28
    sget-object v0, La/m32;->c:La/m32;

    .line 29
    .line 30
    sget-object v1, La/iun;->a:La/iun;

    .line 31
    .line 32
    invoke-direct {p1, v0, v1}, La/w32;-><init>(La/m32;Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    new-instance v0, La/w32;

    .line 40
    .line 41
    sget-object v1, La/m32;->d:La/m32;

    .line 42
    .line 43
    invoke-direct {v0, v1, p1}, La/w32;-><init>(La/m32;Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 53
    .line 54
    sget v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->M(Ljava/util/List;)Ljava/util/ArrayList;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_1

    .line 65
    .line 66
    new-instance p1, La/v32;

    .line 67
    .line 68
    sget-object v0, La/m32;->c:La/m32;

    .line 69
    .line 70
    sget-object v1, La/iun;->a:La/iun;

    .line 71
    .line 72
    invoke-direct {p1, v0, v1}, La/v32;-><init>(La/m32;Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_1
    new-instance v0, La/v32;

    .line 80
    .line 81
    sget-object v1, La/m32;->d:La/m32;

    .line 82
    .line 83
    invoke-direct {v0, v1, p1}, La/v32;-><init>(La/m32;Ljava/util/List;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 87
    .line 88
    .line 89
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object p0

    .line 92
    :pswitch_1
    check-cast p1, La/rzv;

    .line 93
    .line 94
    iget-object p1, p1, La/rzv;->a:Ljava/util/ArrayList;

    .line 95
    .line 96
    sget v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->Q:I

    .line 97
    .line 98
    iget-object v0, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->q:Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams;

    .line 99
    .line 100
    const/4 v1, 0x0

    .line 101
    if-eqz v0, :cond_34

    .line 102
    .line 103
    instance-of v2, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 104
    .line 105
    if-eqz v2, :cond_17

    .line 106
    .line 107
    check-cast v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;

    .line 108
    .line 109
    iget-object v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$AllGames;->b:Ljava/util/ArrayList;

    .line 110
    .line 111
    new-instance v2, Ljava/util/ArrayList;

    .line 112
    .line 113
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    :cond_2
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 121
    .line 122
    .line 123
    move-result v3

    .line 124
    if-eqz v3, :cond_3

    .line 125
    .line 126
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    instance-of v4, v3, La/b2w;

    .line 131
    .line 132
    if-eqz v4, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    .line 139
    .line 140
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-eqz v3, :cond_32

    .line 152
    .line 153
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v3

    .line 157
    move-object v4, v3

    .line 158
    check-cast v4, La/b2w;

    .line 159
    .line 160
    if-eqz v4, :cond_16

    .line 161
    .line 162
    instance-of v5, v4, La/u1w;

    .line 163
    .line 164
    if-eqz v5, :cond_a

    .line 165
    .line 166
    check-cast v4, La/u1w;

    .line 167
    .line 168
    iget-object v5, v4, La/u1w;->o:La/a2w;

    .line 169
    .line 170
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 171
    .line 172
    if-eqz v5, :cond_5

    .line 173
    .line 174
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-eqz v6, :cond_5

    .line 179
    .line 180
    goto :goto_4

    .line 181
    :cond_5
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 182
    .line 183
    .line 184
    move-result-object v5

    .line 185
    :cond_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 186
    .line 187
    .line 188
    move-result v6

    .line 189
    if-eqz v6, :cond_7

    .line 190
    .line 191
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    check-cast v6, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v6

    .line 201
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    if-eqz v6, :cond_6

    .line 210
    .line 211
    goto/16 :goto_7

    .line 212
    .line 213
    :cond_7
    :goto_4
    iget-object v4, v4, La/u1w;->p:La/a2w;

    .line 214
    .line 215
    iget-object v4, v4, La/a2w;->c:Ljava/util/List;

    .line 216
    .line 217
    if-eqz v4, :cond_8

    .line 218
    .line 219
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    if-eqz v5, :cond_8

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_8
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v4

    .line 230
    :cond_9
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v5

    .line 234
    if-eqz v5, :cond_4

    .line 235
    .line 236
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v5

    .line 240
    check-cast v5, Ljava/lang/Number;

    .line 241
    .line 242
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 243
    .line 244
    .line 245
    move-result-wide v5

    .line 246
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v5

    .line 254
    if-eqz v5, :cond_9

    .line 255
    .line 256
    goto/16 :goto_7

    .line 257
    .line 258
    :cond_a
    instance-of v5, v4, La/x1w;

    .line 259
    .line 260
    if-eqz v5, :cond_10

    .line 261
    .line 262
    check-cast v4, La/x1w;

    .line 263
    .line 264
    iget-object v5, v4, La/x1w;->n:La/a2w;

    .line 265
    .line 266
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 267
    .line 268
    if-eqz v5, :cond_b

    .line 269
    .line 270
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 271
    .line 272
    .line 273
    move-result v6

    .line 274
    if-eqz v6, :cond_b

    .line 275
    .line 276
    goto :goto_5

    .line 277
    :cond_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 278
    .line 279
    .line 280
    move-result-object v5

    .line 281
    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 282
    .line 283
    .line 284
    move-result v6

    .line 285
    if-eqz v6, :cond_d

    .line 286
    .line 287
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v6

    .line 291
    check-cast v6, Ljava/lang/Number;

    .line 292
    .line 293
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 294
    .line 295
    .line 296
    move-result-wide v6

    .line 297
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 298
    .line 299
    .line 300
    move-result-object v6

    .line 301
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 302
    .line 303
    .line 304
    move-result v6

    .line 305
    if-eqz v6, :cond_c

    .line 306
    .line 307
    goto/16 :goto_7

    .line 308
    .line 309
    :cond_d
    :goto_5
    iget-object v4, v4, La/x1w;->o:La/a2w;

    .line 310
    .line 311
    iget-object v4, v4, La/a2w;->c:Ljava/util/List;

    .line 312
    .line 313
    if-eqz v4, :cond_e

    .line 314
    .line 315
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 316
    .line 317
    .line 318
    move-result v5

    .line 319
    if-eqz v5, :cond_e

    .line 320
    .line 321
    goto/16 :goto_3

    .line 322
    .line 323
    :cond_e
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 324
    .line 325
    .line 326
    move-result-object v4

    .line 327
    :cond_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 328
    .line 329
    .line 330
    move-result v5

    .line 331
    if-eqz v5, :cond_4

    .line 332
    .line 333
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v5

    .line 337
    check-cast v5, Ljava/lang/Number;

    .line 338
    .line 339
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 340
    .line 341
    .line 342
    move-result-wide v5

    .line 343
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 344
    .line 345
    .line 346
    move-result-object v5

    .line 347
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 348
    .line 349
    .line 350
    move-result v5

    .line 351
    if-eqz v5, :cond_f

    .line 352
    .line 353
    goto :goto_7

    .line 354
    :cond_10
    instance-of v5, v4, La/c2w;

    .line 355
    .line 356
    if-eqz v5, :cond_16

    .line 357
    .line 358
    check-cast v4, La/c2w;

    .line 359
    .line 360
    iget-object v5, v4, La/c2w;->o:La/a2w;

    .line 361
    .line 362
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 363
    .line 364
    if-eqz v5, :cond_11

    .line 365
    .line 366
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 367
    .line 368
    .line 369
    move-result v6

    .line 370
    if-eqz v6, :cond_11

    .line 371
    .line 372
    goto :goto_6

    .line 373
    :cond_11
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    :cond_12
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 378
    .line 379
    .line 380
    move-result v6

    .line 381
    if-eqz v6, :cond_13

    .line 382
    .line 383
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 384
    .line 385
    .line 386
    move-result-object v6

    .line 387
    check-cast v6, Ljava/lang/Number;

    .line 388
    .line 389
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 390
    .line 391
    .line 392
    move-result-wide v6

    .line 393
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v6

    .line 401
    if-eqz v6, :cond_12

    .line 402
    .line 403
    goto :goto_7

    .line 404
    :cond_13
    :goto_6
    iget-object v4, v4, La/c2w;->p:La/a2w;

    .line 405
    .line 406
    iget-object v4, v4, La/a2w;->c:Ljava/util/List;

    .line 407
    .line 408
    if-eqz v4, :cond_14

    .line 409
    .line 410
    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    .line 411
    .line 412
    .line 413
    move-result v5

    .line 414
    if-eqz v5, :cond_14

    .line 415
    .line 416
    goto/16 :goto_3

    .line 417
    .line 418
    :cond_14
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 419
    .line 420
    .line 421
    move-result-object v4

    .line 422
    :cond_15
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 423
    .line 424
    .line 425
    move-result v5

    .line 426
    if-eqz v5, :cond_4

    .line 427
    .line 428
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 429
    .line 430
    .line 431
    move-result-object v5

    .line 432
    check-cast v5, Ljava/lang/Number;

    .line 433
    .line 434
    invoke-virtual {v5}, Ljava/lang/Number;->longValue()J

    .line 435
    .line 436
    .line 437
    move-result-wide v5

    .line 438
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 439
    .line 440
    .line 441
    move-result-object v5

    .line 442
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 443
    .line 444
    .line 445
    move-result v5

    .line 446
    if-eqz v5, :cond_15

    .line 447
    .line 448
    :goto_7
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 449
    .line 450
    .line 451
    goto/16 :goto_3

    .line 452
    .line 453
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 454
    .line 455
    .line 456
    goto/16 :goto_10

    .line 457
    .line 458
    :cond_17
    instance-of v2, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 459
    .line 460
    if-eqz v2, :cond_2d

    .line 461
    .line 462
    check-cast v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;

    .line 463
    .line 464
    iget v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$ParticipantGames;->b:I

    .line 465
    .line 466
    int-to-long v2, v0

    .line 467
    new-instance v0, Ljava/util/ArrayList;

    .line 468
    .line 469
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 473
    .line 474
    .line 475
    move-result-object p1

    .line 476
    :cond_18
    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 477
    .line 478
    .line 479
    move-result v4

    .line 480
    if-eqz v4, :cond_19

    .line 481
    .line 482
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 483
    .line 484
    .line 485
    move-result-object v4

    .line 486
    instance-of v5, v4, La/b2w;

    .line 487
    .line 488
    if-eqz v5, :cond_18

    .line 489
    .line 490
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 491
    .line 492
    .line 493
    goto :goto_8

    .line 494
    :cond_19
    new-instance p1, Ljava/util/ArrayList;

    .line 495
    .line 496
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 500
    .line 501
    .line 502
    move-result-object v0

    .line 503
    :cond_1a
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 504
    .line 505
    .line 506
    move-result v4

    .line 507
    if-eqz v4, :cond_32

    .line 508
    .line 509
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v4

    .line 513
    move-object v5, v4

    .line 514
    check-cast v5, La/b2w;

    .line 515
    .line 516
    if-eqz v5, :cond_2c

    .line 517
    .line 518
    instance-of v6, v5, La/u1w;

    .line 519
    .line 520
    if-eqz v6, :cond_20

    .line 521
    .line 522
    check-cast v5, La/u1w;

    .line 523
    .line 524
    iget-object v6, v5, La/u1w;->o:La/a2w;

    .line 525
    .line 526
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 527
    .line 528
    if-eqz v6, :cond_1b

    .line 529
    .line 530
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 531
    .line 532
    .line 533
    move-result v7

    .line 534
    if-eqz v7, :cond_1b

    .line 535
    .line 536
    goto :goto_a

    .line 537
    :cond_1b
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 538
    .line 539
    .line 540
    move-result-object v6

    .line 541
    :cond_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 542
    .line 543
    .line 544
    move-result v7

    .line 545
    if-eqz v7, :cond_1d

    .line 546
    .line 547
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 548
    .line 549
    .line 550
    move-result-object v7

    .line 551
    check-cast v7, Ljava/lang/Number;

    .line 552
    .line 553
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 554
    .line 555
    .line 556
    move-result-wide v7

    .line 557
    cmp-long v7, v7, v2

    .line 558
    .line 559
    if-nez v7, :cond_1c

    .line 560
    .line 561
    goto/16 :goto_d

    .line 562
    .line 563
    :cond_1d
    :goto_a
    iget-object v5, v5, La/u1w;->p:La/a2w;

    .line 564
    .line 565
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 566
    .line 567
    if-eqz v5, :cond_1e

    .line 568
    .line 569
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 570
    .line 571
    .line 572
    move-result v6

    .line 573
    if-eqz v6, :cond_1e

    .line 574
    .line 575
    goto :goto_9

    .line 576
    :cond_1e
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 577
    .line 578
    .line 579
    move-result-object v5

    .line 580
    :cond_1f
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 581
    .line 582
    .line 583
    move-result v6

    .line 584
    if-eqz v6, :cond_1a

    .line 585
    .line 586
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 587
    .line 588
    .line 589
    move-result-object v6

    .line 590
    check-cast v6, Ljava/lang/Number;

    .line 591
    .line 592
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 593
    .line 594
    .line 595
    move-result-wide v6

    .line 596
    cmp-long v6, v6, v2

    .line 597
    .line 598
    if-nez v6, :cond_1f

    .line 599
    .line 600
    goto/16 :goto_d

    .line 601
    .line 602
    :cond_20
    instance-of v6, v5, La/x1w;

    .line 603
    .line 604
    if-eqz v6, :cond_26

    .line 605
    .line 606
    check-cast v5, La/x1w;

    .line 607
    .line 608
    iget-object v6, v5, La/x1w;->n:La/a2w;

    .line 609
    .line 610
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 611
    .line 612
    if-eqz v6, :cond_21

    .line 613
    .line 614
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 615
    .line 616
    .line 617
    move-result v7

    .line 618
    if-eqz v7, :cond_21

    .line 619
    .line 620
    goto :goto_b

    .line 621
    :cond_21
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 622
    .line 623
    .line 624
    move-result-object v6

    .line 625
    :cond_22
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 626
    .line 627
    .line 628
    move-result v7

    .line 629
    if-eqz v7, :cond_23

    .line 630
    .line 631
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 632
    .line 633
    .line 634
    move-result-object v7

    .line 635
    check-cast v7, Ljava/lang/Number;

    .line 636
    .line 637
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 638
    .line 639
    .line 640
    move-result-wide v7

    .line 641
    cmp-long v7, v7, v2

    .line 642
    .line 643
    if-nez v7, :cond_22

    .line 644
    .line 645
    goto/16 :goto_d

    .line 646
    .line 647
    :cond_23
    :goto_b
    iget-object v5, v5, La/x1w;->o:La/a2w;

    .line 648
    .line 649
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 650
    .line 651
    if-eqz v5, :cond_24

    .line 652
    .line 653
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 654
    .line 655
    .line 656
    move-result v6

    .line 657
    if-eqz v6, :cond_24

    .line 658
    .line 659
    goto/16 :goto_9

    .line 660
    .line 661
    :cond_24
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 662
    .line 663
    .line 664
    move-result-object v5

    .line 665
    :cond_25
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 666
    .line 667
    .line 668
    move-result v6

    .line 669
    if-eqz v6, :cond_1a

    .line 670
    .line 671
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 672
    .line 673
    .line 674
    move-result-object v6

    .line 675
    check-cast v6, Ljava/lang/Number;

    .line 676
    .line 677
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 678
    .line 679
    .line 680
    move-result-wide v6

    .line 681
    cmp-long v6, v6, v2

    .line 682
    .line 683
    if-nez v6, :cond_25

    .line 684
    .line 685
    goto :goto_d

    .line 686
    :cond_26
    instance-of v6, v5, La/c2w;

    .line 687
    .line 688
    if-eqz v6, :cond_2c

    .line 689
    .line 690
    check-cast v5, La/c2w;

    .line 691
    .line 692
    iget-object v6, v5, La/c2w;->o:La/a2w;

    .line 693
    .line 694
    iget-object v6, v6, La/a2w;->c:Ljava/util/List;

    .line 695
    .line 696
    if-eqz v6, :cond_27

    .line 697
    .line 698
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 699
    .line 700
    .line 701
    move-result v7

    .line 702
    if-eqz v7, :cond_27

    .line 703
    .line 704
    goto :goto_c

    .line 705
    :cond_27
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 706
    .line 707
    .line 708
    move-result-object v6

    .line 709
    :cond_28
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 710
    .line 711
    .line 712
    move-result v7

    .line 713
    if-eqz v7, :cond_29

    .line 714
    .line 715
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 716
    .line 717
    .line 718
    move-result-object v7

    .line 719
    check-cast v7, Ljava/lang/Number;

    .line 720
    .line 721
    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    .line 722
    .line 723
    .line 724
    move-result-wide v7

    .line 725
    cmp-long v7, v7, v2

    .line 726
    .line 727
    if-nez v7, :cond_28

    .line 728
    .line 729
    goto :goto_d

    .line 730
    :cond_29
    :goto_c
    iget-object v5, v5, La/c2w;->p:La/a2w;

    .line 731
    .line 732
    iget-object v5, v5, La/a2w;->c:Ljava/util/List;

    .line 733
    .line 734
    if-eqz v5, :cond_2a

    .line 735
    .line 736
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 737
    .line 738
    .line 739
    move-result v6

    .line 740
    if-eqz v6, :cond_2a

    .line 741
    .line 742
    goto/16 :goto_9

    .line 743
    .line 744
    :cond_2a
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 745
    .line 746
    .line 747
    move-result-object v5

    .line 748
    :cond_2b
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 749
    .line 750
    .line 751
    move-result v6

    .line 752
    if-eqz v6, :cond_1a

    .line 753
    .line 754
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 755
    .line 756
    .line 757
    move-result-object v6

    .line 758
    check-cast v6, Ljava/lang/Number;

    .line 759
    .line 760
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 761
    .line 762
    .line 763
    move-result-wide v6

    .line 764
    cmp-long v6, v6, v2

    .line 765
    .line 766
    if-nez v6, :cond_2b

    .line 767
    .line 768
    :goto_d
    invoke-virtual {p1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 769
    .line 770
    .line 771
    goto/16 :goto_9

    .line 772
    .line 773
    :cond_2c
    invoke-static {}, La/t9f;->b()V

    .line 774
    .line 775
    .line 776
    goto :goto_10

    .line 777
    :cond_2d
    instance-of v2, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;

    .line 778
    .line 779
    if-eqz v2, :cond_34

    .line 780
    .line 781
    check-cast v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;

    .line 782
    .line 783
    iget-wide v0, v0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/AllEventGamesScreenParams$StadiumGames;->b:J

    .line 784
    .line 785
    new-instance v2, Ljava/util/ArrayList;

    .line 786
    .line 787
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 788
    .line 789
    .line 790
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 791
    .line 792
    .line 793
    move-result-object p1

    .line 794
    :cond_2e
    :goto_e
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 795
    .line 796
    .line 797
    move-result v3

    .line 798
    if-eqz v3, :cond_31

    .line 799
    .line 800
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 801
    .line 802
    .line 803
    move-result-object v3

    .line 804
    move-object v4, v3

    .line 805
    check-cast v4, La/d2w;

    .line 806
    .line 807
    instance-of v5, v4, La/c2w;

    .line 808
    .line 809
    if-eqz v5, :cond_2f

    .line 810
    .line 811
    move-object v5, v4

    .line 812
    check-cast v5, La/c2w;

    .line 813
    .line 814
    iget-wide v5, v5, La/c2w;->h:J

    .line 815
    .line 816
    cmp-long v5, v5, v0

    .line 817
    .line 818
    if-eqz v5, :cond_30

    .line 819
    .line 820
    :cond_2f
    instance-of v5, v4, La/u1w;

    .line 821
    .line 822
    if-eqz v5, :cond_2e

    .line 823
    .line 824
    check-cast v4, La/u1w;

    .line 825
    .line 826
    iget-wide v4, v4, La/u1w;->h:J

    .line 827
    .line 828
    cmp-long v4, v4, v0

    .line 829
    .line 830
    if-nez v4, :cond_2e

    .line 831
    .line 832
    :cond_30
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 833
    .line 834
    .line 835
    goto :goto_e

    .line 836
    :cond_31
    move-object p1, v2

    .line 837
    :cond_32
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 838
    .line 839
    .line 840
    move-result v0

    .line 841
    if-eqz v0, :cond_33

    .line 842
    .line 843
    new-instance p1, La/u32;

    .line 844
    .line 845
    sget-object v0, La/m32;->c:La/m32;

    .line 846
    .line 847
    sget-object v1, La/iun;->a:La/iun;

    .line 848
    .line 849
    sget-object v2, La/xun;->a:La/xun;

    .line 850
    .line 851
    invoke-direct {p1, v0, v1, v2}, La/u32;-><init>(La/m32;Ljava/util/List;Ljava/util/Set;)V

    .line 852
    .line 853
    .line 854
    invoke-virtual {p0, p1}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 855
    .line 856
    .line 857
    goto :goto_f

    .line 858
    :cond_33
    new-instance v0, La/u32;

    .line 859
    .line 860
    sget-object v1, La/m32;->d:La/m32;

    .line 861
    .line 862
    invoke-virtual {p0}, La/i3t0;->D()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    check-cast v2, La/n32;

    .line 867
    .line 868
    iget-object v2, v2, La/n32;->d:La/b32;

    .line 869
    .line 870
    iget-object v2, v2, La/b32;->d:Ljava/util/Set;

    .line 871
    .line 872
    invoke-direct {v0, v1, p1, v2}, La/u32;-><init>(La/m32;Ljava/util/List;Ljava/util/Set;)V

    .line 873
    .line 874
    .line 875
    invoke-virtual {p0, v0}, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->R(La/x32;)V

    .line 876
    .line 877
    .line 878
    :goto_f
    sget-object v1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 879
    .line 880
    goto :goto_10

    .line 881
    :cond_34
    invoke-static {}, La/t9f;->b()V

    .line 882
    .line 883
    .line 884
    :goto_10
    return-object v1

    .line 885
    :pswitch_2
    check-cast p1, Ljava/lang/Throwable;

    .line 886
    .line 887
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 891
    .line 892
    .line 893
    iget-object p1, p0, Lorg/xplatform/special_event/impl/alleventsgames/presentation/f;->o:La/vzg0;

    .line 894
    .line 895
    const-string v0, "TEAM_HAS_STATISTIC_KEY"

    .line 896
    .line 897
    sget-object v2, La/eep0;->a:La/eep0;

    .line 898
    .line 899
    invoke-virtual {p1, v0, v2}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 900
    .line 901
    .line 902
    iget-object p1, p0, La/i3t0;->i:La/ocj;

    .line 903
    .line 904
    iget-object p1, p1, La/ocj;->a:La/p7m0;

    .line 905
    .line 906
    :cond_35
    invoke-virtual {p1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 911
    .line 912
    .line 913
    iget-object v1, p0, La/i3t0;->f:La/oyg0;

    .line 914
    .line 915
    move-object v3, v1

    .line 916
    move-object v1, v0

    .line 917
    check-cast v1, La/n32;

    .line 918
    .line 919
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 920
    .line 921
    .line 922
    const/4 v7, 0x0

    .line 923
    const/16 v8, 0xfe

    .line 924
    .line 925
    const/4 v3, 0x0

    .line 926
    const/4 v4, 0x0

    .line 927
    const/4 v5, 0x0

    .line 928
    const/4 v6, 0x0

    .line 929
    invoke-static/range {v1 .. v8}, La/n32;->a(La/n32;La/hep0;La/d32;La/c32;La/b32;La/wcb;La/f32;I)La/n32;

    .line 930
    .line 931
    .line 932
    move-result-object v1

    .line 933
    invoke-virtual {p1, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 934
    .line 935
    .line 936
    move-result v0

    .line 937
    if-eqz v0, :cond_35

    .line 938
    .line 939
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 940
    .line 941
    return-object p0

    .line 942
    nop

    .line 943
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
