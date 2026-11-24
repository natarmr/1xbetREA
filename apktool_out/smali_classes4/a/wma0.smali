.class public final synthetic La/wma0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/wma0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/wma0;->a:B

    .line 4
    .line 5
    const/16 v2, 0xb

    .line 6
    .line 7
    const-string v3, "snackbarManager"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    const-string v5, "PopularOneXGamesViewModel.updateGamesWorkStatus"

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    move-object/from16 v1, p1

    .line 18
    .line 19
    check-cast v1, Ljava/lang/Throwable;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/g9b0;

    .line 27
    .line 28
    invoke-virtual {v0, v1}, La/g9b0;->B(Ljava/lang/Throwable;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, Ljava/lang/Throwable;

    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, La/g9b0;

    .line 44
    .line 45
    invoke-virtual {v0, v1}, La/g9b0;->B(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 49
    .line 50
    return-object v0

    .line 51
    :pswitch_1
    move-object/from16 v1, p1

    .line 52
    .line 53
    check-cast v1, Ljava/lang/Throwable;

    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/g9b0;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/g9b0;->B(Ljava/lang/Throwable;)V

    .line 63
    .line 64
    .line 65
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    return-object v0

    .line 68
    :pswitch_2
    move-object/from16 v1, p1

    .line 69
    .line 70
    check-cast v1, Ljava/lang/Number;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, La/g9b0;

    .line 79
    .line 80
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    iget-object v2, v0, La/g9b0;->x:La/l570;

    .line 92
    .line 93
    new-instance v3, La/j8b0;

    .line 94
    .line 95
    invoke-direct {v3, v0, v6}, La/j8b0;-><init>(La/g9b0;B)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, La/eiu0;->s()La/diu0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    invoke-virtual {v2, v0, v1, v5, v3}, La/l570;->v(La/bvc;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 113
    .line 114
    .line 115
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 116
    .line 117
    return-object v0

    .line 118
    :pswitch_3
    move-object/from16 v1, p1

    .line 119
    .line 120
    check-cast v1, La/pwk0;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, La/sbb0;

    .line 128
    .line 129
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, La/sbb0;->J:La/y3v;

    .line 133
    .line 134
    iget v3, v1, La/pwk0;->a:I

    .line 135
    .line 136
    iget-object v1, v1, La/pwk0;->b:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v2, v3, v1}, La/y3v;->h(ILjava/lang/String;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-object v0, v0, La/sbb0;->h:La/i1w0;

    .line 143
    .line 144
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 149
    .line 150
    if-eqz v3, :cond_0

    .line 151
    .line 152
    new-instance v3, La/e1w0;

    .line 153
    .line 154
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 155
    .line 156
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 157
    .line 158
    .line 159
    new-instance v1, La/c8d;

    .line 160
    .line 161
    sget-object v5, La/y7d;->a:La/v7d;

    .line 162
    .line 163
    invoke-direct {v1, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_0
    new-instance v3, La/w0w0;

    .line 171
    .line 172
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 173
    .line 174
    .line 175
    new-instance v1, La/c8d;

    .line 176
    .line 177
    sget-object v5, La/y7d;->a:La/v7d;

    .line 178
    .line 179
    invoke-direct {v1, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    :goto_0
    invoke-static {v0, v2, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    :goto_1
    move-object v2, v1

    .line 190
    check-cast v2, La/paw;

    .line 191
    .line 192
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 193
    .line 194
    .line 195
    move-result v3

    .line 196
    if-eqz v3, :cond_1

    .line 197
    .line 198
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    check-cast v2, La/oe50;

    .line 203
    .line 204
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 205
    .line 206
    .line 207
    goto :goto_1

    .line 208
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 209
    .line 210
    return-object v0

    .line 211
    :pswitch_4
    move-object/from16 v1, p1

    .line 212
    .line 213
    check-cast v1, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 216
    .line 217
    .line 218
    move-result-wide v1

    .line 219
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 220
    .line 221
    check-cast v0, La/sbb0;

    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 224
    .line 225
    .line 226
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-static {v1}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v2, v0, La/sbb0;->j0:La/l570;

    .line 235
    .line 236
    new-instance v3, La/gab0;

    .line 237
    .line 238
    const/4 v4, 0x5

    .line 239
    invoke-direct {v3, v0, v4}, La/gab0;-><init>(La/sbb0;B)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 246
    .line 247
    .line 248
    invoke-virtual {v2}, La/eiu0;->s()La/diu0;

    .line 249
    .line 250
    .line 251
    move-result-object v0

    .line 252
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    invoke-virtual {v2, v0, v1, v5, v3}, La/l570;->v(La/bvc;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    .line 257
    .line 258
    .line 259
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    return-object v0

    .line 262
    :pswitch_5
    move-object/from16 v1, p1

    .line 263
    .line 264
    check-cast v1, La/w5b0;

    .line 265
    .line 266
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v0, La/k3t0;

    .line 272
    .line 273
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 274
    .line 275
    .line 276
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 277
    .line 278
    return-object v0

    .line 279
    :pswitch_6
    move-object/from16 v1, p1

    .line 280
    .line 281
    check-cast v1, Ljava/lang/Number;

    .line 282
    .line 283
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 284
    .line 285
    .line 286
    move-result-wide v1

    .line 287
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, La/j5b0;

    .line 290
    .line 291
    iget-object v0, v0, La/j5b0;->h:La/iij;

    .line 292
    .line 293
    iget-object v3, v0, La/iij;->h:Ljava/lang/Object;

    .line 294
    .line 295
    check-cast v3, Ljava/util/List;

    .line 296
    .line 297
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 302
    .line 303
    .line 304
    move-result v4

    .line 305
    if-eqz v4, :cond_3

    .line 306
    .line 307
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    move-object v5, v4

    .line 312
    check-cast v5, La/bhj;

    .line 313
    .line 314
    iget-wide v5, v5, La/bhj;->a:J

    .line 315
    .line 316
    cmp-long v5, v5, v1

    .line 317
    .line 318
    if-nez v5, :cond_2

    .line 319
    .line 320
    goto :goto_2

    .line 321
    :cond_3
    move-object v4, v7

    .line 322
    :goto_2
    check-cast v4, La/bhj;

    .line 323
    .line 324
    if-nez v4, :cond_4

    .line 325
    .line 326
    goto :goto_3

    .line 327
    :cond_4
    iget-object v0, v0, La/iij;->g:Ljava/lang/Object;

    .line 328
    .line 329
    check-cast v0, La/p7m0;

    .line 330
    .line 331
    new-instance v1, La/s9o;

    .line 332
    .line 333
    invoke-direct {v1, v4}, La/s9o;-><init>(La/bhj;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v0, v7, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 337
    .line 338
    .line 339
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 340
    .line 341
    return-object v0

    .line 342
    :pswitch_7
    move-object/from16 v1, p1

    .line 343
    .line 344
    check-cast v1, Ljava/lang/Number;

    .line 345
    .line 346
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 347
    .line 348
    .line 349
    move-result-wide v1

    .line 350
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, La/j5b0;

    .line 353
    .line 354
    iget-object v0, v0, La/j5b0;->h:La/iij;

    .line 355
    .line 356
    iget-object v3, v0, La/iij;->h:Ljava/lang/Object;

    .line 357
    .line 358
    check-cast v3, Ljava/util/List;

    .line 359
    .line 360
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 361
    .line 362
    .line 363
    move-result-object v3

    .line 364
    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 365
    .line 366
    .line 367
    move-result v4

    .line 368
    if-eqz v4, :cond_6

    .line 369
    .line 370
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 371
    .line 372
    .line 373
    move-result-object v4

    .line 374
    move-object v5, v4

    .line 375
    check-cast v5, La/bhj;

    .line 376
    .line 377
    iget-wide v5, v5, La/bhj;->a:J

    .line 378
    .line 379
    cmp-long v5, v5, v1

    .line 380
    .line 381
    if-nez v5, :cond_5

    .line 382
    .line 383
    goto :goto_4

    .line 384
    :cond_6
    move-object v4, v7

    .line 385
    :goto_4
    check-cast v4, La/bhj;

    .line 386
    .line 387
    if-nez v4, :cond_7

    .line 388
    .line 389
    goto :goto_5

    .line 390
    :cond_7
    invoke-virtual {v0}, La/eiu0;->s()La/diu0;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 395
    .line 396
    .line 397
    move-result-object v1

    .line 398
    iget-object v2, v0, La/iij;->e:Ljava/lang/Object;

    .line 399
    .line 400
    check-cast v2, La/mne;

    .line 401
    .line 402
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 403
    .line 404
    new-instance v3, La/b1f;

    .line 405
    .line 406
    const/16 v5, 0x16

    .line 407
    .line 408
    invoke-direct {v3, v0, v4, v7, v5}, La/b1f;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 409
    .line 410
    .line 411
    const/4 v0, 0x2

    .line 412
    invoke-static {v1, v2, v7, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 413
    .line 414
    .line 415
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 416
    .line 417
    return-object v0

    .line 418
    :pswitch_8
    move-object/from16 v1, p1

    .line 419
    .line 420
    check-cast v1, La/ghj;

    .line 421
    .line 422
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 423
    .line 424
    .line 425
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 426
    .line 427
    check-cast v0, La/j5b0;

    .line 428
    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    iget-object v2, v0, La/j5b0;->i:La/std;

    .line 433
    .line 434
    iget-boolean v1, v1, La/ghj;->b:Z

    .line 435
    .line 436
    xor-int/2addr v1, v6

    .line 437
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    new-instance v2, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;

    .line 441
    .line 442
    invoke-direct {v2, v1}, Lorg/xplatform/feature/dayexpress/impl/presentation/DayExpressScreen;-><init>(Z)V

    .line 443
    .line 444
    .line 445
    iget-object v0, v0, La/j5b0;->c:La/i1w0;

    .line 446
    .line 447
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    instance-of v3, v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 452
    .line 453
    if-eqz v3, :cond_8

    .line 454
    .line 455
    new-instance v3, La/e1w0;

    .line 456
    .line 457
    check-cast v2, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 458
    .line 459
    invoke-direct {v3, v2}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 460
    .line 461
    .line 462
    new-instance v2, La/c8d;

    .line 463
    .line 464
    sget-object v5, La/y7d;->a:La/v7d;

    .line 465
    .line 466
    invoke-direct {v2, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    goto :goto_6

    .line 473
    :cond_8
    new-instance v3, La/w0w0;

    .line 474
    .line 475
    invoke-direct {v3, v2}, La/w0w0;-><init>(La/m7h0;)V

    .line 476
    .line 477
    .line 478
    new-instance v2, La/c8d;

    .line 479
    .line 480
    sget-object v5, La/y7d;->a:La/v7d;

    .line 481
    .line 482
    invoke-direct {v2, v5, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 486
    .line 487
    .line 488
    :goto_6
    invoke-static {v0, v1, v4}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 489
    .line 490
    .line 491
    move-result-object v1

    .line 492
    :goto_7
    move-object v2, v1

    .line 493
    check-cast v2, La/paw;

    .line 494
    .line 495
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 496
    .line 497
    .line 498
    move-result v3

    .line 499
    if-eqz v3, :cond_9

    .line 500
    .line 501
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    check-cast v2, La/oe50;

    .line 506
    .line 507
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 508
    .line 509
    .line 510
    goto :goto_7

    .line 511
    :cond_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 512
    .line 513
    return-object v0

    .line 514
    :pswitch_9
    move-object/from16 v1, p1

    .line 515
    .line 516
    check-cast v1, La/b2b0;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 519
    .line 520
    .line 521
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 522
    .line 523
    check-cast v0, La/k3t0;

    .line 524
    .line 525
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 529
    .line 530
    return-object v0

    .line 531
    :pswitch_a
    move-object/from16 v1, p1

    .line 532
    .line 533
    check-cast v1, La/t2b0;

    .line 534
    .line 535
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 536
    .line 537
    .line 538
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 539
    .line 540
    move-object v10, v0

    .line 541
    check-cast v10, La/d2b0;

    .line 542
    .line 543
    sget-object v0, La/d2b0;->S1:La/rl70;

    .line 544
    .line 545
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 546
    .line 547
    .line 548
    instance-of v0, v1, La/r2b0;

    .line 549
    .line 550
    if-eqz v0, :cond_b

    .line 551
    .line 552
    check-cast v1, La/r2b0;

    .line 553
    .line 554
    iget-object v12, v1, La/r2b0;->a:Ljava/lang/String;

    .line 555
    .line 556
    iget-object v13, v1, La/r2b0;->b:Ljava/lang/String;

    .line 557
    .line 558
    iget-object v14, v1, La/r2b0;->c:Ljava/lang/String;

    .line 559
    .line 560
    iget-object v0, v10, La/d2b0;->N1:La/ii;

    .line 561
    .line 562
    if-eqz v0, :cond_a

    .line 563
    .line 564
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 565
    .line 566
    sget-object v20, La/n12;->b:La/n12;

    .line 567
    .line 568
    const/16 v21, 0x0

    .line 569
    .line 570
    const/16 v22, 0x5f8

    .line 571
    .line 572
    const/4 v15, 0x0

    .line 573
    const/16 v16, 0x0

    .line 574
    .line 575
    const/16 v17, 0x0

    .line 576
    .line 577
    const/16 v18, 0x0

    .line 578
    .line 579
    const/16 v19, 0x0

    .line 580
    .line 581
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    .line 590
    .line 591
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 592
    .line 593
    .line 594
    goto :goto_8

    .line 595
    :cond_a
    const-string v0, "actionDialogManager"

    .line 596
    .line 597
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    throw v7

    .line 601
    :cond_b
    instance-of v0, v1, La/q2b0;

    .line 602
    .line 603
    if-eqz v0, :cond_d

    .line 604
    .line 605
    check-cast v1, La/q2b0;

    .line 606
    .line 607
    iget-object v13, v1, La/q2b0;->a:Ljava/lang/String;

    .line 608
    .line 609
    iget-object v8, v10, La/d2b0;->O1:La/wdk0;

    .line 610
    .line 611
    if-eqz v8, :cond_c

    .line 612
    .line 613
    new-instance v9, La/xdk0;

    .line 614
    .line 615
    sget-object v12, La/rek0;->b:La/rek0;

    .line 616
    .line 617
    const/16 v17, 0x0

    .line 618
    .line 619
    const/16 v18, 0x7c

    .line 620
    .line 621
    const/4 v14, 0x0

    .line 622
    const/4 v15, 0x0

    .line 623
    const/16 v16, 0x0

    .line 624
    .line 625
    move-object v11, v9

    .line 626
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 627
    .line 628
    .line 629
    const/16 v15, 0x3fc

    .line 630
    .line 631
    const/4 v11, 0x0

    .line 632
    const/4 v12, 0x0

    .line 633
    const/4 v13, 0x0

    .line 634
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 635
    .line 636
    .line 637
    goto :goto_8

    .line 638
    :cond_c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 639
    .line 640
    .line 641
    throw v7

    .line 642
    :cond_d
    instance-of v0, v1, La/s2b0;

    .line 643
    .line 644
    if-eqz v0, :cond_10

    .line 645
    .line 646
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-static {v0}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 655
    .line 656
    .line 657
    move-result v0

    .line 658
    if-eqz v0, :cond_f

    .line 659
    .line 660
    iget-object v0, v10, La/d2b0;->P1:La/roq0;

    .line 661
    .line 662
    if-eqz v0, :cond_e

    .line 663
    .line 664
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 665
    .line 666
    .line 667
    move-result-object v1

    .line 668
    sget-object v2, La/fk60;->b:La/uuz;

    .line 669
    .line 670
    const-string v2, ""

    .line 671
    .line 672
    const/16 v3, 0x1f

    .line 673
    .line 674
    invoke-virtual {v0, v1, v3, v2}, La/roq0;->d(Landroidx/fragment/app/e;ILjava/lang/String;)V

    .line 675
    .line 676
    .line 677
    goto :goto_8

    .line 678
    :cond_e
    const-string v0, "tipsDialogScreenFactory"

    .line 679
    .line 680
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 681
    .line 682
    .line 683
    throw v7

    .line 684
    :cond_f
    :goto_8
    iget-object v0, v10, La/d2b0;->L1:La/a8z;

    .line 685
    .line 686
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    check-cast v0, La/k3t0;

    .line 691
    .line 692
    sget-object v1, La/n1b0;->a:La/n1b0;

    .line 693
    .line 694
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 698
    .line 699
    goto :goto_9

    .line 700
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 701
    .line 702
    .line 703
    :goto_9
    return-object v7

    .line 704
    :pswitch_b
    move-object/from16 v1, p1

    .line 705
    .line 706
    check-cast v1, Ljava/lang/Throwable;

    .line 707
    .line 708
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 709
    .line 710
    .line 711
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 712
    .line 713
    check-cast v0, La/f1b0;

    .line 714
    .line 715
    sget v2, La/f1b0;->w0:I

    .line 716
    .line 717
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 718
    .line 719
    .line 720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 721
    .line 722
    return-object v0

    .line 723
    :pswitch_c
    move-object/from16 v1, p1

    .line 724
    .line 725
    check-cast v1, Ljava/lang/Throwable;

    .line 726
    .line 727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 728
    .line 729
    .line 730
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 731
    .line 732
    check-cast v0, La/f1b0;

    .line 733
    .line 734
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 735
    .line 736
    .line 737
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 738
    .line 739
    return-object v0

    .line 740
    :pswitch_d
    move-object/from16 v1, p1

    .line 741
    .line 742
    check-cast v1, Ljava/lang/Throwable;

    .line 743
    .line 744
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 745
    .line 746
    .line 747
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 748
    .line 749
    check-cast v0, La/f1b0;

    .line 750
    .line 751
    sget v2, La/f1b0;->w0:I

    .line 752
    .line 753
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 754
    .line 755
    .line 756
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_e
    move-object/from16 v1, p1

    .line 760
    .line 761
    check-cast v1, Ljava/lang/Throwable;

    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 767
    .line 768
    check-cast v0, La/f1b0;

    .line 769
    .line 770
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 771
    .line 772
    .line 773
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 774
    .line 775
    return-object v0

    .line 776
    :pswitch_f
    move-object/from16 v1, p1

    .line 777
    .line 778
    check-cast v1, Ljava/lang/Throwable;

    .line 779
    .line 780
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 781
    .line 782
    .line 783
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 784
    .line 785
    check-cast v0, La/f1b0;

    .line 786
    .line 787
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 788
    .line 789
    .line 790
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 791
    .line 792
    return-object v0

    .line 793
    :pswitch_10
    move-object/from16 v1, p1

    .line 794
    .line 795
    check-cast v1, Ljava/lang/Throwable;

    .line 796
    .line 797
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 798
    .line 799
    .line 800
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 801
    .line 802
    check-cast v0, La/f1b0;

    .line 803
    .line 804
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 805
    .line 806
    .line 807
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 808
    .line 809
    return-object v0

    .line 810
    :pswitch_11
    move-object/from16 v1, p1

    .line 811
    .line 812
    check-cast v1, Ljava/lang/Throwable;

    .line 813
    .line 814
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 815
    .line 816
    .line 817
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 818
    .line 819
    check-cast v0, La/f1b0;

    .line 820
    .line 821
    iget-object v3, v0, La/f1b0;->p:La/duj;

    .line 822
    .line 823
    new-instance v4, La/r7a0;

    .line 824
    .line 825
    invoke-direct {v4, v1, v0, v2}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 826
    .line 827
    .line 828
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_12
    move-object/from16 v1, p1

    .line 835
    .line 836
    check-cast v1, Ljava/lang/Throwable;

    .line 837
    .line 838
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, La/f1b0;

    .line 844
    .line 845
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 846
    .line 847
    .line 848
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    return-object v0

    .line 851
    :pswitch_13
    move-object/from16 v1, p1

    .line 852
    .line 853
    check-cast v1, Ljava/lang/Throwable;

    .line 854
    .line 855
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, La/f1b0;

    .line 861
    .line 862
    iget-object v3, v0, La/f1b0;->p:La/duj;

    .line 863
    .line 864
    new-instance v4, La/r7a0;

    .line 865
    .line 866
    invoke-direct {v4, v1, v0, v2}, La/r7a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 870
    .line 871
    .line 872
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 873
    .line 874
    return-object v0

    .line 875
    :pswitch_14
    move-object/from16 v1, p1

    .line 876
    .line 877
    check-cast v1, Ljava/lang/Throwable;

    .line 878
    .line 879
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 883
    .line 884
    check-cast v0, La/f1b0;

    .line 885
    .line 886
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 887
    .line 888
    .line 889
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 890
    .line 891
    return-object v0

    .line 892
    :pswitch_15
    move-object/from16 v1, p1

    .line 893
    .line 894
    check-cast v1, Ljava/lang/Throwable;

    .line 895
    .line 896
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 900
    .line 901
    check-cast v0, La/f1b0;

    .line 902
    .line 903
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 904
    .line 905
    .line 906
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 907
    .line 908
    return-object v0

    .line 909
    :pswitch_16
    move-object/from16 v1, p1

    .line 910
    .line 911
    check-cast v1, Ljava/lang/Throwable;

    .line 912
    .line 913
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 914
    .line 915
    .line 916
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 917
    .line 918
    check-cast v0, La/f1b0;

    .line 919
    .line 920
    sget v2, La/f1b0;->w0:I

    .line 921
    .line 922
    invoke-virtual {v0, v1}, La/f1b0;->Q(Ljava/lang/Throwable;)V

    .line 923
    .line 924
    .line 925
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 926
    .line 927
    return-object v0

    .line 928
    :pswitch_17
    move-object/from16 v1, p1

    .line 929
    .line 930
    check-cast v1, La/rwa0;

    .line 931
    .line 932
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v0, La/iwa0;

    .line 938
    .line 939
    sget v2, La/iwa0;->m2:I

    .line 940
    .line 941
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    sget-object v2, La/rwa0;->a:La/rwa0;

    .line 945
    .line 946
    invoke-virtual {v1, v2}, La/rwa0;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-eqz v1, :cond_12

    .line 951
    .line 952
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 953
    .line 954
    .line 955
    move-result v1

    .line 956
    if-eqz v1, :cond_11

    .line 957
    .line 958
    goto :goto_a

    .line 959
    :cond_11
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 960
    .line 961
    .line 962
    :goto_a
    iget-object v0, v0, La/iwa0;->l2:La/a8z;

    .line 963
    .line 964
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 965
    .line 966
    .line 967
    move-result-object v0

    .line 968
    check-cast v0, La/k3t0;

    .line 969
    .line 970
    sget-object v1, La/cwa0;->a:La/cwa0;

    .line 971
    .line 972
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 973
    .line 974
    .line 975
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 976
    .line 977
    goto :goto_b

    .line 978
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 979
    .line 980
    .line 981
    :goto_b
    return-object v7

    .line 982
    :pswitch_18
    move-object/from16 v1, p1

    .line 983
    .line 984
    check-cast v1, Ljava/lang/Throwable;

    .line 985
    .line 986
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 990
    .line 991
    move-object v2, v0

    .line 992
    check-cast v2, La/rua0;

    .line 993
    .line 994
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 995
    .line 996
    .line 997
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 998
    .line 999
    .line 1000
    instance-of v0, v1, Ljava/net/SocketTimeoutException;

    .line 1001
    .line 1002
    if-nez v0, :cond_13

    .line 1003
    .line 1004
    instance-of v0, v1, Ljava/net/UnknownHostException;

    .line 1005
    .line 1006
    if-nez v0, :cond_13

    .line 1007
    .line 1008
    iget-object v0, v2, La/rua0;->x:La/duj;

    .line 1009
    .line 1010
    new-instance v3, La/jfa0;

    .line 1011
    .line 1012
    const/16 v4, 0xc

    .line 1013
    .line 1014
    invoke-direct {v3, v4}, La/jfa0;-><init>(B)V

    .line 1015
    .line 1016
    .line 1017
    invoke-virtual {v0, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1018
    .line 1019
    .line 1020
    :cond_13
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 1021
    .line 1022
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 1023
    .line 1024
    :cond_14
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1025
    .line 1026
    .line 1027
    move-result-object v0

    .line 1028
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1029
    .line 1030
    .line 1031
    iget-object v4, v2, La/i3t0;->f:La/oyg0;

    .line 1032
    .line 1033
    move-object v5, v0

    .line 1034
    check-cast v5, La/gua0;

    .line 1035
    .line 1036
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1037
    .line 1038
    .line 1039
    new-instance v6, La/cua0;

    .line 1040
    .line 1041
    invoke-direct {v6, v1}, La/cua0;-><init>(Ljava/lang/Throwable;)V

    .line 1042
    .line 1043
    .line 1044
    const/16 v16, 0x0

    .line 1045
    .line 1046
    const v17, 0x1ffbe

    .line 1047
    .line 1048
    .line 1049
    const/4 v7, 0x0

    .line 1050
    const/4 v8, 0x0

    .line 1051
    const/4 v9, 0x0

    .line 1052
    const/4 v10, 0x0

    .line 1053
    const/4 v11, 0x0

    .line 1054
    const/4 v12, 0x0

    .line 1055
    const/4 v13, 0x0

    .line 1056
    const/4 v14, 0x0

    .line 1057
    const/4 v15, 0x0

    .line 1058
    invoke-static/range {v5 .. v17}, La/gua0;->a(La/gua0;La/fua0;Ljava/lang/String;Ljava/util/LinkedHashSet;Ljava/util/List;La/zmb;ZZLa/ghq0;ZLorg/xplatform/feed/linelive/presentation/feeds/child/champs/models/FeedsChampsItemsSelectionState;ZI)La/gua0;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v4

    .line 1062
    invoke-virtual {v3, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1063
    .line 1064
    .line 1065
    move-result v0

    .line 1066
    if-eqz v0, :cond_14

    .line 1067
    .line 1068
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1069
    .line 1070
    return-object v0

    .line 1071
    :pswitch_19
    move-object/from16 v1, p1

    .line 1072
    .line 1073
    check-cast v1, La/zqa0;

    .line 1074
    .line 1075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v0, La/k3t0;

    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1089
    .line 1090
    check-cast v1, La/bua0;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1096
    .line 1097
    move-object v10, v0

    .line 1098
    check-cast v10, La/eta0;

    .line 1099
    .line 1100
    sget-object v0, La/eta0;->P1:La/xi70;

    .line 1101
    .line 1102
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1103
    .line 1104
    .line 1105
    instance-of v0, v1, La/yta0;

    .line 1106
    .line 1107
    if-eqz v0, :cond_15

    .line 1108
    .line 1109
    iget-object v0, v10, La/eta0;->M1:La/a8z;

    .line 1110
    .line 1111
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    check-cast v0, La/moi;

    .line 1116
    .line 1117
    iget-object v8, v0, La/moi;->B:La/wdk0;

    .line 1118
    .line 1119
    new-instance v9, La/xdk0;

    .line 1120
    .line 1121
    sget-object v12, La/rek0;->b:La/rek0;

    .line 1122
    .line 1123
    check-cast v1, La/yta0;

    .line 1124
    .line 1125
    iget v0, v1, La/yta0;->a:I

    .line 1126
    .line 1127
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v13

    .line 1131
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    const/16 v17, 0x0

    .line 1135
    .line 1136
    const/16 v18, 0x7c

    .line 1137
    .line 1138
    const/4 v14, 0x0

    .line 1139
    const/4 v15, 0x0

    .line 1140
    const/16 v16, 0x0

    .line 1141
    .line 1142
    move-object v11, v9

    .line 1143
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1144
    .line 1145
    .line 1146
    const/16 v15, 0x3fc

    .line 1147
    .line 1148
    const/4 v11, 0x0

    .line 1149
    const/4 v12, 0x0

    .line 1150
    const/4 v13, 0x0

    .line 1151
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1152
    .line 1153
    .line 1154
    goto :goto_c

    .line 1155
    :cond_15
    instance-of v0, v1, La/aua0;

    .line 1156
    .line 1157
    if-eqz v0, :cond_16

    .line 1158
    .line 1159
    check-cast v1, La/aua0;

    .line 1160
    .line 1161
    iget-object v0, v1, La/aua0;->a:La/ghq0;

    .line 1162
    .line 1163
    iget-object v12, v0, La/ghq0;->a:La/ygq0;

    .line 1164
    .line 1165
    iget-object v0, v0, La/ghq0;->b:La/wgq0;

    .line 1166
    .line 1167
    iget-wide v13, v0, La/wgq0;->a:J

    .line 1168
    .line 1169
    iget-wide v0, v0, La/wgq0;->b:J

    .line 1170
    .line 1171
    sget-object v2, La/d3i0;->n2:La/gle0;

    .line 1172
    .line 1173
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1174
    .line 1175
    .line 1176
    move-result-object v3

    .line 1177
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1178
    .line 1179
    .line 1180
    new-instance v19, Ljava/util/Date;

    .line 1181
    .line 1182
    invoke-direct/range {v19 .. v19}, Ljava/util/Date;-><init>()V

    .line 1183
    .line 1184
    .line 1185
    sget-object v21, La/jhq0;->a:La/jhq0;

    .line 1186
    .line 1187
    new-instance v11, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;

    .line 1188
    .line 1189
    const/16 v18, 0x0

    .line 1190
    .line 1191
    const/16 v20, 0x0

    .line 1192
    .line 1193
    const/16 v17, 0x1

    .line 1194
    .line 1195
    move-wide v15, v0

    .line 1196
    invoke-direct/range {v11 .. v21}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;-><init>(La/ygq0;JJZZLjava/util/Date;ZLa/jhq0;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1200
    .line 1201
    .line 1202
    invoke-static {v3, v11}, La/gle0;->i(Landroidx/fragment/app/e;Lorg/xplatform/feed/linelive/presentation/dialogs/select_time_filter/params/SelectTimeFilterScreenParams;)V

    .line 1203
    .line 1204
    .line 1205
    goto :goto_c

    .line 1206
    :cond_16
    instance-of v0, v1, La/zta0;

    .line 1207
    .line 1208
    if-eqz v0, :cond_17

    .line 1209
    .line 1210
    check-cast v1, La/zta0;

    .line 1211
    .line 1212
    iget-object v0, v1, La/zta0;->a:Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;

    .line 1213
    .line 1214
    sget-object v1, La/y3i0;->n2:La/lme0;

    .line 1215
    .line 1216
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v2

    .line 1220
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1221
    .line 1222
    .line 1223
    new-instance v3, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;

    .line 1224
    .line 1225
    const-string v4, "SELECT_DATE_TIME_REQUEST_KEY"

    .line 1226
    .line 1227
    invoke-direct {v3, v0, v4}, Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;-><init>(Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/ChoosenDate;Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1231
    .line 1232
    .line 1233
    invoke-static {v2, v3}, La/lme0;->c(Landroidx/fragment/app/e;Lorg/xplatform/feed/linelive/presentation/dialogs/select_date_time/params/SelectTimeRangeScreenParams;)V

    .line 1234
    .line 1235
    .line 1236
    :goto_c
    invoke-virtual {v10}, La/eta0;->G0()La/k3t0;

    .line 1237
    .line 1238
    .line 1239
    move-result-object v0

    .line 1240
    sget-object v1, La/ypa0;->a:La/ypa0;

    .line 1241
    .line 1242
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1243
    .line 1244
    .line 1245
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1246
    .line 1247
    goto :goto_d

    .line 1248
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 1249
    .line 1250
    .line 1251
    :goto_d
    return-object v7

    .line 1252
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1253
    .line 1254
    check-cast v1, La/msa0;

    .line 1255
    .line 1256
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1260
    .line 1261
    move-object v10, v0

    .line 1262
    check-cast v10, La/fsa0;

    .line 1263
    .line 1264
    sget-object v0, La/fsa0;->V1:La/nh70;

    .line 1265
    .line 1266
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1267
    .line 1268
    .line 1269
    sget-object v0, La/ksa0;->a:La/ksa0;

    .line 1270
    .line 1271
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1272
    .line 1273
    .line 1274
    move-result v0

    .line 1275
    if-eqz v0, :cond_19

    .line 1276
    .line 1277
    iget-object v0, v10, La/fsa0;->L1:La/xi70;

    .line 1278
    .line 1279
    if-eqz v0, :cond_18

    .line 1280
    .line 1281
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1282
    .line 1283
    .line 1284
    move-result-object v0

    .line 1285
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1286
    .line 1287
    .line 1288
    invoke-static {v0}, La/xi70;->h(Landroidx/fragment/app/e;)V

    .line 1289
    .line 1290
    .line 1291
    goto/16 :goto_e

    .line 1292
    .line 1293
    :cond_18
    const-string v0, "quickBetDialogNavigator"

    .line 1294
    .line 1295
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1296
    .line 1297
    .line 1298
    throw v7

    .line 1299
    :cond_19
    sget-object v0, La/lsa0;->a:La/lsa0;

    .line 1300
    .line 1301
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1302
    .line 1303
    .line 1304
    move-result v0

    .line 1305
    if-eqz v0, :cond_1b

    .line 1306
    .line 1307
    iget-object v8, v10, La/fsa0;->M1:La/wdk0;

    .line 1308
    .line 1309
    if-eqz v8, :cond_1a

    .line 1310
    .line 1311
    new-instance v9, La/xdk0;

    .line 1312
    .line 1313
    sget-object v12, La/qek0;->a:La/qek0;

    .line 1314
    .line 1315
    const v0, 0x7f130e86

    .line 1316
    .line 1317
    .line 1318
    invoke-virtual {v10, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1319
    .line 1320
    .line 1321
    move-result-object v13

    .line 1322
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1323
    .line 1324
    .line 1325
    const/16 v17, 0x0

    .line 1326
    .line 1327
    const/16 v18, 0x7c

    .line 1328
    .line 1329
    const/4 v14, 0x0

    .line 1330
    const/4 v15, 0x0

    .line 1331
    const/16 v16, 0x0

    .line 1332
    .line 1333
    move-object v11, v9

    .line 1334
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1335
    .line 1336
    .line 1337
    const/16 v15, 0x3fc

    .line 1338
    .line 1339
    const/4 v11, 0x0

    .line 1340
    const/4 v12, 0x0

    .line 1341
    const/4 v13, 0x0

    .line 1342
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1343
    .line 1344
    .line 1345
    goto :goto_e

    .line 1346
    :cond_1a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1347
    .line 1348
    .line 1349
    throw v7

    .line 1350
    :cond_1b
    instance-of v0, v1, La/jsa0;

    .line 1351
    .line 1352
    if-eqz v0, :cond_1d

    .line 1353
    .line 1354
    iget-object v8, v10, La/fsa0;->M1:La/wdk0;

    .line 1355
    .line 1356
    if-eqz v8, :cond_1c

    .line 1357
    .line 1358
    new-instance v9, La/xdk0;

    .line 1359
    .line 1360
    sget-object v12, La/pek0;->a:La/pek0;

    .line 1361
    .line 1362
    check-cast v1, La/jsa0;

    .line 1363
    .line 1364
    iget-object v13, v1, La/jsa0;->a:Ljava/lang/String;

    .line 1365
    .line 1366
    const/16 v17, 0x0

    .line 1367
    .line 1368
    const/16 v18, 0x7c

    .line 1369
    .line 1370
    const/4 v14, 0x0

    .line 1371
    const/4 v15, 0x0

    .line 1372
    const/16 v16, 0x0

    .line 1373
    .line 1374
    move-object v11, v9

    .line 1375
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1376
    .line 1377
    .line 1378
    const/16 v15, 0x3fc

    .line 1379
    .line 1380
    const/4 v11, 0x0

    .line 1381
    const/4 v12, 0x0

    .line 1382
    const/4 v13, 0x0

    .line 1383
    invoke-static/range {v8 .. v15}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1384
    .line 1385
    .line 1386
    goto :goto_e

    .line 1387
    :cond_1c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1388
    .line 1389
    .line 1390
    throw v7

    .line 1391
    :cond_1d
    instance-of v0, v1, La/isa0;

    .line 1392
    .line 1393
    if-eqz v0, :cond_1f

    .line 1394
    .line 1395
    iget-object v0, v10, La/fsa0;->O1:La/ujd;

    .line 1396
    .line 1397
    if-eqz v0, :cond_1e

    .line 1398
    .line 1399
    check-cast v1, La/isa0;

    .line 1400
    .line 1401
    iget-object v1, v1, La/isa0;->a:La/sjd;

    .line 1402
    .line 1403
    invoke-virtual {v0, v10, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 1404
    .line 1405
    .line 1406
    :goto_e
    invoke-virtual {v10}, La/fsa0;->G0()La/k3t0;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v0

    .line 1410
    sget-object v1, La/mra0;->a:La/mra0;

    .line 1411
    .line 1412
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1413
    .line 1414
    .line 1415
    sget-object v7, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1416
    .line 1417
    goto :goto_f

    .line 1418
    :cond_1e
    const-string v0, "composeGameCardFragmentDelegate"

    .line 1419
    .line 1420
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1421
    .line 1422
    .line 1423
    throw v7

    .line 1424
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1425
    .line 1426
    .line 1427
    :goto_f
    return-object v7

    .line 1428
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1429
    .line 1430
    check-cast v1, Ljava/lang/Throwable;

    .line 1431
    .line 1432
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1433
    .line 1434
    .line 1435
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1436
    .line 1437
    check-cast v0, La/dna0;

    .line 1438
    .line 1439
    iget-object v2, v0, La/dna0;->y:La/duj;

    .line 1440
    .line 1441
    new-instance v3, La/lma0;

    .line 1442
    .line 1443
    invoke-direct {v3, v0, v6}, La/lma0;-><init>(Ljava/lang/Object;B)V

    .line 1444
    .line 1445
    .line 1446
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1447
    .line 1448
    .line 1449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1450
    .line 1451
    return-object v0

    .line 1452
    nop

    .line 1453
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
