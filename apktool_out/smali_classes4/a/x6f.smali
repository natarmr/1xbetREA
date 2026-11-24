.class public final synthetic La/x6f;
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
    iput-byte p7, p0, La/x6f;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/x6f;->a:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/4 v3, 0x2

    .line 7
    const/4 v4, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, La/n6h;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/k3t0;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object v0

    .line 28
    :pswitch_0
    move-object/from16 v1, p1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Throwable;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v0, La/duj;

    .line 38
    .line 39
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 40
    .line 41
    .line 42
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    return-object v0

    .line 45
    :pswitch_1
    move-object/from16 v1, p1

    .line 46
    .line 47
    check-cast v1, Ljava/lang/Throwable;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, La/duj;

    .line 55
    .line 56
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_2
    move-object/from16 v1, p1

    .line 63
    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/luk;

    .line 72
    .line 73
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object v0, v0, La/luk;->b:La/p7m0;

    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v4, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    return-object v0

    .line 87
    :pswitch_3
    move-object/from16 v1, p1

    .line 88
    .line 89
    check-cast v1, Ljava/lang/Number;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v0, La/vqg;

    .line 98
    .line 99
    iget-object v2, v0, La/vqg;->H:La/p7m0;

    .line 100
    .line 101
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v3

    .line 105
    check-cast v3, Ljava/lang/Number;

    .line 106
    .line 107
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 108
    .line 109
    .line 110
    move-result v3

    .line 111
    if-ne v3, v1, :cond_0

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_0
    iget-object v0, v0, La/vqg;->D:La/ol60;

    .line 115
    .line 116
    sget-object v3, La/oqg;->a:La/oqg;

    .line 117
    .line 118
    invoke-virtual {v0, v3}, La/ol60;->f(Ljava/lang/Object;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 122
    .line 123
    .line 124
    move-result-object v0

    .line 125
    invoke-virtual {v2, v4, v0}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 129
    .line 130
    return-object v0

    .line 131
    :pswitch_4
    move-object/from16 v1, p1

    .line 132
    .line 133
    check-cast v1, Ljava/lang/Number;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 136
    .line 137
    .line 138
    move-result-wide v4

    .line 139
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 140
    .line 141
    move-object v3, v0

    .line 142
    check-cast v3, La/vqg;

    .line 143
    .line 144
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 145
    .line 146
    .line 147
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    iget-object v1, v3, La/vqg;->g:La/mne;

    .line 152
    .line 153
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 154
    .line 155
    new-instance v2, La/ey;

    .line 156
    .line 157
    const/4 v6, 0x0

    .line 158
    const/16 v7, 0xf

    .line 159
    .line 160
    invoke-direct/range {v2 .. v7}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 161
    .line 162
    .line 163
    const/16 v11, 0xb

    .line 164
    .line 165
    const/4 v7, 0x0

    .line 166
    const/4 v8, 0x0

    .line 167
    move-object v6, v0

    .line 168
    move-object v10, v2

    .line 169
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_5
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Number;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 180
    .line 181
    .line 182
    move-result-wide v1

    .line 183
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast v0, La/vqg;

    .line 186
    .line 187
    invoke-virtual {v0, v1, v2}, La/vqg;->y(J)V

    .line 188
    .line 189
    .line 190
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 191
    .line 192
    return-object v0

    .line 193
    :pswitch_6
    move-object/from16 v1, p1

    .line 194
    .line 195
    check-cast v1, Ljava/lang/Number;

    .line 196
    .line 197
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 198
    .line 199
    .line 200
    move-result-wide v1

    .line 201
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 202
    .line 203
    check-cast v0, La/vqg;

    .line 204
    .line 205
    iget-object v5, v0, La/vqg;->K:La/p7m0;

    .line 206
    .line 207
    :cond_1
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v0

    .line 211
    move-object v6, v0

    .line 212
    check-cast v6, La/wmm0;

    .line 213
    .line 214
    iget-object v7, v6, La/wmm0;->h:La/hyx;

    .line 215
    .line 216
    invoke-static {v7, v1, v2, v4, v3}, La/hyx;->a(La/hyx;JLjava/util/ArrayList;I)La/hyx;

    .line 217
    .line 218
    .line 219
    move-result-object v20

    .line 220
    const/16 v23, 0x0

    .line 221
    .line 222
    const/16 v24, 0x37f

    .line 223
    .line 224
    const-wide/16 v7, 0x0

    .line 225
    .line 226
    const-wide/16 v9, 0x0

    .line 227
    .line 228
    const-wide/16 v11, 0x0

    .line 229
    .line 230
    const-wide/16 v13, 0x0

    .line 231
    .line 232
    const-wide/16 v15, 0x0

    .line 233
    .line 234
    const-wide/16 v17, 0x0

    .line 235
    .line 236
    const/16 v19, 0x0

    .line 237
    .line 238
    const-wide/16 v21, 0x0

    .line 239
    .line 240
    invoke-static/range {v6 .. v24}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    invoke-virtual {v5, v0, v6}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 245
    .line 246
    .line 247
    move-result v0

    .line 248
    if-eqz v0, :cond_1

    .line 249
    .line 250
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 251
    .line 252
    return-object v0

    .line 253
    :pswitch_7
    move-object/from16 v1, p1

    .line 254
    .line 255
    check-cast v1, Ljava/lang/Number;

    .line 256
    .line 257
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 258
    .line 259
    .line 260
    move-result-wide v4

    .line 261
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 262
    .line 263
    move-object v3, v0

    .line 264
    check-cast v3, La/vqg;

    .line 265
    .line 266
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 270
    .line 271
    .line 272
    move-result-object v0

    .line 273
    iget-object v1, v3, La/vqg;->g:La/mne;

    .line 274
    .line 275
    iget-object v9, v1, La/mne;->a:La/rwj;

    .line 276
    .line 277
    new-instance v2, La/ey;

    .line 278
    .line 279
    const/4 v6, 0x0

    .line 280
    const/16 v7, 0xf

    .line 281
    .line 282
    invoke-direct/range {v2 .. v7}, La/ey;-><init>(Ljava/lang/Object;JLa/yje;B)V

    .line 283
    .line 284
    .line 285
    const/16 v11, 0xb

    .line 286
    .line 287
    const/4 v7, 0x0

    .line 288
    const/4 v8, 0x0

    .line 289
    move-object v6, v0

    .line 290
    move-object v10, v2

    .line 291
    invoke-static/range {v6 .. v11}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 292
    .line 293
    .line 294
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 295
    .line 296
    return-object v0

    .line 297
    :pswitch_8
    move-object/from16 v1, p1

    .line 298
    .line 299
    check-cast v1, Ljava/lang/Number;

    .line 300
    .line 301
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 302
    .line 303
    .line 304
    move-result-wide v1

    .line 305
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 306
    .line 307
    check-cast v0, La/vqg;

    .line 308
    .line 309
    invoke-virtual {v0, v1, v2}, La/vqg;->y(J)V

    .line 310
    .line 311
    .line 312
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 313
    .line 314
    return-object v0

    .line 315
    :pswitch_9
    move-object/from16 v1, p1

    .line 316
    .line 317
    check-cast v1, Ljava/lang/String;

    .line 318
    .line 319
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    .line 321
    .line 322
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 323
    .line 324
    check-cast v0, La/vqg;

    .line 325
    .line 326
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 327
    .line 328
    .line 329
    iget-object v2, v0, La/vqg;->K:La/p7m0;

    .line 330
    .line 331
    :cond_2
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    move-object v3, v0

    .line 336
    check-cast v3, La/wmm0;

    .line 337
    .line 338
    iget-object v4, v3, La/wmm0;->j:Ljava/util/List;

    .line 339
    .line 340
    invoke-interface {v4, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 341
    .line 342
    .line 343
    move-result v5

    .line 344
    if-eqz v5, :cond_5

    .line 345
    .line 346
    new-instance v5, Ljava/util/ArrayList;

    .line 347
    .line 348
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 349
    .line 350
    .line 351
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 352
    .line 353
    .line 354
    move-result-object v4

    .line 355
    :cond_3
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 356
    .line 357
    .line 358
    move-result v6

    .line 359
    if-eqz v6, :cond_4

    .line 360
    .line 361
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 362
    .line 363
    .line 364
    move-result-object v6

    .line 365
    move-object v7, v6

    .line 366
    check-cast v7, Ljava/lang/String;

    .line 367
    .line 368
    invoke-static {v7, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 369
    .line 370
    .line 371
    move-result v7

    .line 372
    if-nez v7, :cond_3

    .line 373
    .line 374
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 375
    .line 376
    .line 377
    goto :goto_1

    .line 378
    :cond_4
    :goto_2
    move-object/from16 v20, v5

    .line 379
    .line 380
    goto :goto_3

    .line 381
    :cond_5
    invoke-static {v4, v1}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    goto :goto_2

    .line 386
    :goto_3
    const/16 v21, 0x1ff

    .line 387
    .line 388
    const-wide/16 v4, 0x0

    .line 389
    .line 390
    const-wide/16 v6, 0x0

    .line 391
    .line 392
    const-wide/16 v8, 0x0

    .line 393
    .line 394
    const-wide/16 v10, 0x0

    .line 395
    .line 396
    const-wide/16 v12, 0x0

    .line 397
    .line 398
    const-wide/16 v14, 0x0

    .line 399
    .line 400
    const/16 v16, 0x0

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const-wide/16 v18, 0x0

    .line 405
    .line 406
    invoke-static/range {v3 .. v21}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 411
    .line 412
    .line 413
    move-result v0

    .line 414
    if-eqz v0, :cond_2

    .line 415
    .line 416
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 417
    .line 418
    return-object v0

    .line 419
    :pswitch_a
    move-object/from16 v1, p1

    .line 420
    .line 421
    check-cast v1, Ljava/lang/Number;

    .line 422
    .line 423
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 424
    .line 425
    .line 426
    move-result-wide v17

    .line 427
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 428
    .line 429
    check-cast v0, La/vqg;

    .line 430
    .line 431
    iget-object v1, v0, La/vqg;->K:La/p7m0;

    .line 432
    .line 433
    :cond_6
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 434
    .line 435
    .line 436
    move-result-object v0

    .line 437
    move-object v2, v0

    .line 438
    check-cast v2, La/wmm0;

    .line 439
    .line 440
    iget-object v3, v2, La/wmm0;->h:La/hyx;

    .line 441
    .line 442
    const/16 v19, 0x0

    .line 443
    .line 444
    const/16 v20, 0x2ff

    .line 445
    .line 446
    const-wide/16 v3, 0x0

    .line 447
    .line 448
    const-wide/16 v5, 0x0

    .line 449
    .line 450
    const-wide/16 v7, 0x0

    .line 451
    .line 452
    const-wide/16 v9, 0x0

    .line 453
    .line 454
    const-wide/16 v11, 0x0

    .line 455
    .line 456
    const-wide/16 v13, 0x0

    .line 457
    .line 458
    const/4 v15, 0x0

    .line 459
    const/16 v16, 0x0

    .line 460
    .line 461
    invoke-static/range {v2 .. v20}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 466
    .line 467
    .line 468
    move-result v0

    .line 469
    if-eqz v0, :cond_6

    .line 470
    .line 471
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 472
    .line 473
    return-object v0

    .line 474
    :pswitch_b
    move-object/from16 v1, p1

    .line 475
    .line 476
    check-cast v1, Ljava/lang/Number;

    .line 477
    .line 478
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 479
    .line 480
    .line 481
    move-result-wide v4

    .line 482
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 483
    .line 484
    check-cast v0, La/vqg;

    .line 485
    .line 486
    iget-object v1, v0, La/vqg;->K:La/p7m0;

    .line 487
    .line 488
    :cond_7
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 489
    .line 490
    .line 491
    move-result-object v0

    .line 492
    move-object v6, v0

    .line 493
    check-cast v6, La/wmm0;

    .line 494
    .line 495
    iget-object v3, v6, La/wmm0;->h:La/hyx;

    .line 496
    .line 497
    iget-object v7, v3, La/hyx;->b:Ljava/util/List;

    .line 498
    .line 499
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 500
    .line 501
    .line 502
    move-result-object v8

    .line 503
    invoke-interface {v7, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 504
    .line 505
    .line 506
    move-result v8

    .line 507
    if-eqz v8, :cond_9

    .line 508
    .line 509
    new-instance v8, Ljava/util/ArrayList;

    .line 510
    .line 511
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 512
    .line 513
    .line 514
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 515
    .line 516
    .line 517
    move-result-object v7

    .line 518
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 519
    .line 520
    .line 521
    move-result v9

    .line 522
    if-eqz v9, :cond_a

    .line 523
    .line 524
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 525
    .line 526
    .line 527
    move-result-object v9

    .line 528
    move-object v10, v9

    .line 529
    check-cast v10, Ljava/lang/Number;

    .line 530
    .line 531
    invoke-virtual {v10}, Ljava/lang/Number;->longValue()J

    .line 532
    .line 533
    .line 534
    move-result-wide v10

    .line 535
    cmp-long v10, v10, v4

    .line 536
    .line 537
    if-nez v10, :cond_8

    .line 538
    .line 539
    goto :goto_4

    .line 540
    :cond_8
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 541
    .line 542
    .line 543
    goto :goto_4

    .line 544
    :cond_9
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 545
    .line 546
    .line 547
    move-result-object v8

    .line 548
    invoke-static {v7, v8}, Lkotlin/collections/CollectionsKt;->r0(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 549
    .line 550
    .line 551
    move-result-object v8

    .line 552
    :cond_a
    const-wide/16 v9, 0x0

    .line 553
    .line 554
    invoke-static {v3, v9, v10, v8, v2}, La/hyx;->a(La/hyx;JLjava/util/ArrayList;I)La/hyx;

    .line 555
    .line 556
    .line 557
    move-result-object v20

    .line 558
    const/16 v23, 0x0

    .line 559
    .line 560
    const/16 v24, 0x37f

    .line 561
    .line 562
    const-wide/16 v7, 0x0

    .line 563
    .line 564
    const-wide/16 v11, 0x0

    .line 565
    .line 566
    const-wide/16 v13, 0x0

    .line 567
    .line 568
    const-wide/16 v15, 0x0

    .line 569
    .line 570
    const-wide/16 v17, 0x0

    .line 571
    .line 572
    const/16 v19, 0x0

    .line 573
    .line 574
    const-wide/16 v21, 0x0

    .line 575
    .line 576
    invoke-static/range {v6 .. v24}, La/wmm0;->a(La/wmm0;JJJJJJLa/o4i0;La/hyx;JLjava/util/ArrayList;I)La/wmm0;

    .line 577
    .line 578
    .line 579
    move-result-object v3

    .line 580
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 581
    .line 582
    .line 583
    move-result v0

    .line 584
    if-eqz v0, :cond_7

    .line 585
    .line 586
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 587
    .line 588
    return-object v0

    .line 589
    :pswitch_c
    move-object/from16 v1, p1

    .line 590
    .line 591
    check-cast v1, La/ygq0;

    .line 592
    .line 593
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 597
    .line 598
    check-cast v0, La/djg;

    .line 599
    .line 600
    sget-object v4, La/djg;->n2:La/kwd;

    .line 601
    .line 602
    move v5, v2

    .line 603
    move-object v2, v1

    .line 604
    new-instance v1, La/hhq0;

    .line 605
    .line 606
    iget-object v4, v0, La/djg;->l2:La/r34;

    .line 607
    .line 608
    sget-object v6, La/djg;->o2:[La/iiy;

    .line 609
    .line 610
    aget-object v5, v6, v5

    .line 611
    .line 612
    invoke-virtual {v4, v0, v5}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 613
    .line 614
    .line 615
    move-result-object v4

    .line 616
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 617
    .line 618
    .line 619
    move-result-wide v4

    .line 620
    iget-object v7, v0, La/djg;->m2:La/r34;

    .line 621
    .line 622
    aget-object v3, v6, v3

    .line 623
    .line 624
    invoke-virtual {v7, v0, v3}, La/r34;->e(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Long;

    .line 625
    .line 626
    .line 627
    move-result-object v3

    .line 628
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 629
    .line 630
    .line 631
    move-result-wide v6

    .line 632
    move-wide v3, v4

    .line 633
    move-wide v5, v6

    .line 634
    invoke-direct/range {v1 .. v6}, La/hhq0;-><init>(La/ygq0;JJ)V

    .line 635
    .line 636
    .line 637
    new-instance v2, Lkotlin/Pair;

    .line 638
    .line 639
    const-string v3, "REQUEST_CHAMPS_TIME_FILTER_RESULT_KEY"

    .line 640
    .line 641
    invoke-direct {v2, v3, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 642
    .line 643
    .line 644
    filled-new-array {v2}, [Lkotlin/Pair;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-static {v1, v0, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 656
    .line 657
    .line 658
    move-result v1

    .line 659
    if-eqz v1, :cond_b

    .line 660
    .line 661
    goto :goto_5

    .line 662
    :cond_b
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 663
    .line 664
    .line 665
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 666
    .line 667
    return-object v0

    .line 668
    :pswitch_d
    move-object/from16 v1, p1

    .line 669
    .line 670
    check-cast v1, La/jig;

    .line 671
    .line 672
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 673
    .line 674
    .line 675
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 676
    .line 677
    check-cast v0, La/k3t0;

    .line 678
    .line 679
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 680
    .line 681
    .line 682
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 683
    .line 684
    return-object v0

    .line 685
    :pswitch_e
    move-object/from16 v1, p1

    .line 686
    .line 687
    check-cast v1, La/dgg;

    .line 688
    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 693
    .line 694
    move-object v7, v0

    .line 695
    check-cast v7, La/zfg;

    .line 696
    .line 697
    sget-object v0, La/zfg;->S1:La/kud;

    .line 698
    .line 699
    iget-object v5, v7, La/zfg;->M1:La/wdk0;

    .line 700
    .line 701
    if-eqz v5, :cond_c

    .line 702
    .line 703
    new-instance v6, La/xdk0;

    .line 704
    .line 705
    sget-object v9, La/rek0;->b:La/rek0;

    .line 706
    .line 707
    iget-object v10, v1, La/dgg;->a:Ljava/lang/String;

    .line 708
    .line 709
    const/4 v14, 0x0

    .line 710
    const/16 v15, 0x7c

    .line 711
    .line 712
    const/4 v11, 0x0

    .line 713
    const/4 v12, 0x0

    .line 714
    const/4 v13, 0x0

    .line 715
    move-object v8, v6

    .line 716
    invoke-direct/range {v8 .. v15}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 717
    .line 718
    .line 719
    const/16 v12, 0x3fc

    .line 720
    .line 721
    const/4 v8, 0x0

    .line 722
    const/4 v9, 0x0

    .line 723
    const/4 v10, 0x0

    .line 724
    invoke-static/range {v5 .. v12}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 725
    .line 726
    .line 727
    invoke-virtual {v7}, La/zfg;->G0()La/k3t0;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    sget-object v1, La/kfg;->a:La/kfg;

    .line 732
    .line 733
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 734
    .line 735
    .line 736
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 737
    .line 738
    return-object v0

    .line 739
    :cond_c
    const-string v0, "snackbarManager"

    .line 740
    .line 741
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 742
    .line 743
    .line 744
    throw v4

    .line 745
    :pswitch_f
    move-object/from16 v1, p1

    .line 746
    .line 747
    check-cast v1, La/cfg;

    .line 748
    .line 749
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 750
    .line 751
    .line 752
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v0, La/afg;

    .line 755
    .line 756
    sget-object v2, La/afg;->S1:La/std;

    .line 757
    .line 758
    iget-object v2, v0, La/afg;->M1:La/ujd;

    .line 759
    .line 760
    if-eqz v2, :cond_d

    .line 761
    .line 762
    iget-object v1, v1, La/cfg;->a:La/sjd;

    .line 763
    .line 764
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 765
    .line 766
    .line 767
    invoke-virtual {v0}, La/afg;->G0()La/k3t0;

    .line 768
    .line 769
    .line 770
    move-result-object v0

    .line 771
    sget-object v1, La/leg;->a:La/leg;

    .line 772
    .line 773
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 774
    .line 775
    .line 776
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 777
    .line 778
    return-object v0

    .line 779
    :cond_d
    const-string v0, "composeGameCardFragmentDelegate"

    .line 780
    .line 781
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 782
    .line 783
    .line 784
    throw v4

    .line 785
    :pswitch_10
    move-object/from16 v1, p1

    .line 786
    .line 787
    check-cast v1, Ljava/lang/Throwable;

    .line 788
    .line 789
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 790
    .line 791
    .line 792
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 793
    .line 794
    check-cast v0, La/gdg;

    .line 795
    .line 796
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 797
    .line 798
    .line 799
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 800
    .line 801
    .line 802
    move-result-object v5

    .line 803
    new-instance v6, La/v4f;

    .line 804
    .line 805
    const/16 v2, 0x11

    .line 806
    .line 807
    invoke-direct {v6, v0, v1, v2}, La/v4f;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 808
    .line 809
    .line 810
    new-instance v9, La/edg;

    .line 811
    .line 812
    invoke-direct {v9, v0, v4}, La/edg;-><init>(La/gdg;La/yje;)V

    .line 813
    .line 814
    .line 815
    const/16 v10, 0xe

    .line 816
    .line 817
    const/4 v7, 0x0

    .line 818
    const/4 v8, 0x0

    .line 819
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 820
    .line 821
    .line 822
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 823
    .line 824
    return-object v0

    .line 825
    :pswitch_11
    move v5, v2

    .line 826
    move-object/from16 v1, p1

    .line 827
    .line 828
    check-cast v1, Ljava/lang/Number;

    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 831
    .line 832
    .line 833
    move-result v1

    .line 834
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 835
    .line 836
    move-object v2, v0

    .line 837
    check-cast v2, La/gdg;

    .line 838
    .line 839
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 840
    .line 841
    .line 842
    sget-object v6, La/ceg;->a:La/ceg;

    .line 843
    .line 844
    sget-object v7, La/beg;->a:La/beg;

    .line 845
    .line 846
    if-eqz v1, :cond_e

    .line 847
    .line 848
    if-eq v1, v5, :cond_10

    .line 849
    .line 850
    if-eq v1, v3, :cond_f

    .line 851
    .line 852
    :cond_e
    move-object v3, v7

    .line 853
    goto :goto_6

    .line 854
    :cond_f
    new-instance v0, La/aeg;

    .line 855
    .line 856
    iget-object v3, v2, La/gdg;->q:Ljava/util/List;

    .line 857
    .line 858
    iget-object v5, v2, La/gdg;->d:Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 859
    .line 860
    iget-wide v8, v5, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->a:J

    .line 861
    .line 862
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 863
    .line 864
    .line 865
    move-result-object v5

    .line 866
    invoke-interface {v3, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v3

    .line 870
    invoke-direct {v0, v3}, La/aeg;-><init>(Z)V

    .line 871
    .line 872
    .line 873
    move-object v3, v0

    .line 874
    goto :goto_6

    .line 875
    :cond_10
    move-object v3, v6

    .line 876
    :goto_6
    iget-object v5, v2, La/gdg;->u:La/p7m0;

    .line 877
    .line 878
    :cond_11
    invoke-virtual {v5}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 879
    .line 880
    .line 881
    move-result-object v0

    .line 882
    move-object v8, v0

    .line 883
    check-cast v8, La/cfb;

    .line 884
    .line 885
    const/4 v9, 0x3

    .line 886
    invoke-static {v8, v4, v1, v9}, La/cfb;->a(La/cfb;Ljava/util/ArrayList;II)La/cfb;

    .line 887
    .line 888
    .line 889
    move-result-object v8

    .line 890
    invoke-virtual {v5, v0, v8}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 891
    .line 892
    .line 893
    move-result v0

    .line 894
    if-eqz v0, :cond_11

    .line 895
    .line 896
    invoke-virtual {v3, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 897
    .line 898
    .line 899
    move-result v0

    .line 900
    if-eqz v0, :cond_12

    .line 901
    .line 902
    const-string v0, "events"

    .line 903
    .line 904
    goto :goto_7

    .line 905
    :cond_12
    invoke-virtual {v3, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 906
    .line 907
    .line 908
    move-result v0

    .line 909
    if-eqz v0, :cond_13

    .line 910
    .line 911
    const-string v0, "results"

    .line 912
    .line 913
    goto :goto_7

    .line 914
    :cond_13
    instance-of v0, v3, La/aeg;

    .line 915
    .line 916
    if-eqz v0, :cond_14

    .line 917
    .line 918
    const-string v0, "description"

    .line 919
    .line 920
    :goto_7
    iget-object v1, v2, La/gdg;->p:La/zr1;

    .line 921
    .line 922
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    iget-object v1, v1, La/zr1;->a:La/s1p;

    .line 926
    .line 927
    const-wide/16 v4, 0xd3e

    .line 928
    .line 929
    invoke-static {v0, v1, v4, v5}, La/b1j;->v(Ljava/lang/String;La/s1p;J)V

    .line 930
    .line 931
    .line 932
    iget-object v1, v2, La/gdg;->o:La/u58;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    iget-object v1, v1, La/u58;->a:La/kt2;

    .line 938
    .line 939
    const-string v4, "cyber_champ_option"

    .line 940
    .line 941
    const-string v5, "option"

    .line 942
    .line 943
    invoke-static {v5, v0, v1, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 944
    .line 945
    .line 946
    iget-object v0, v2, La/gdg;->c:La/vzg0;

    .line 947
    .line 948
    const-string v1, "SELECTED_SEGMENT_KEY"

    .line 949
    .line 950
    invoke-virtual {v0, v1, v3}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 951
    .line 952
    .line 953
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 954
    .line 955
    goto :goto_8

    .line 956
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 957
    .line 958
    .line 959
    :goto_8
    return-object v4

    .line 960
    :pswitch_12
    move-object/from16 v1, p1

    .line 961
    .line 962
    check-cast v1, Ljava/lang/Number;

    .line 963
    .line 964
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 965
    .line 966
    .line 967
    move-result v1

    .line 968
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 969
    .line 970
    check-cast v0, La/hbg;

    .line 971
    .line 972
    invoke-virtual {v0, v1}, La/hbg;->C(I)V

    .line 973
    .line 974
    .line 975
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 976
    .line 977
    return-object v0

    .line 978
    :pswitch_13
    move-object/from16 v1, p1

    .line 979
    .line 980
    check-cast v1, Ljava/lang/Throwable;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v0, La/duj;

    .line 988
    .line 989
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 990
    .line 991
    .line 992
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 993
    .line 994
    return-object v0

    .line 995
    :pswitch_14
    move-object/from16 v1, p1

    .line 996
    .line 997
    check-cast v1, La/nkf;

    .line 998
    .line 999
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1000
    .line 1001
    .line 1002
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1003
    .line 1004
    check-cast v0, La/k3t0;

    .line 1005
    .line 1006
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1007
    .line 1008
    .line 1009
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1010
    .line 1011
    return-object v0

    .line 1012
    :pswitch_15
    move-object/from16 v1, p1

    .line 1013
    .line 1014
    check-cast v1, Ljava/lang/Throwable;

    .line 1015
    .line 1016
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1017
    .line 1018
    .line 1019
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1020
    .line 1021
    check-cast v0, La/wff;

    .line 1022
    .line 1023
    invoke-virtual {v0, v1}, La/wff;->w(Ljava/lang/Throwable;)V

    .line 1024
    .line 1025
    .line 1026
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1027
    .line 1028
    return-object v0

    .line 1029
    :pswitch_16
    move-object/from16 v1, p1

    .line 1030
    .line 1031
    check-cast v1, Ljava/lang/Throwable;

    .line 1032
    .line 1033
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1034
    .line 1035
    .line 1036
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1037
    .line 1038
    check-cast v0, La/wff;

    .line 1039
    .line 1040
    invoke-virtual {v0, v1}, La/wff;->w(Ljava/lang/Throwable;)V

    .line 1041
    .line 1042
    .line 1043
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1044
    .line 1045
    return-object v0

    .line 1046
    :pswitch_17
    move-object/from16 v1, p1

    .line 1047
    .line 1048
    check-cast v1, Ljava/lang/Throwable;

    .line 1049
    .line 1050
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1054
    .line 1055
    check-cast v0, La/wff;

    .line 1056
    .line 1057
    invoke-virtual {v0, v1}, La/wff;->w(Ljava/lang/Throwable;)V

    .line 1058
    .line 1059
    .line 1060
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1061
    .line 1062
    return-object v0

    .line 1063
    :pswitch_18
    move-object/from16 v1, p1

    .line 1064
    .line 1065
    check-cast v1, Ljava/lang/Throwable;

    .line 1066
    .line 1067
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1068
    .line 1069
    .line 1070
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, La/r7f;

    .line 1073
    .line 1074
    invoke-virtual {v0, v1}, La/r7f;->d0(Ljava/lang/Throwable;)V

    .line 1075
    .line 1076
    .line 1077
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1078
    .line 1079
    return-object v0

    .line 1080
    :pswitch_19
    move-object/from16 v1, p1

    .line 1081
    .line 1082
    check-cast v1, Ljava/lang/Throwable;

    .line 1083
    .line 1084
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1085
    .line 1086
    .line 1087
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v0, La/r7f;

    .line 1090
    .line 1091
    invoke-virtual {v0, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 1092
    .line 1093
    .line 1094
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1095
    .line 1096
    return-object v0

    .line 1097
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1098
    .line 1099
    check-cast v1, Ljava/lang/Throwable;

    .line 1100
    .line 1101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1105
    .line 1106
    check-cast v0, La/r7f;

    .line 1107
    .line 1108
    invoke-virtual {v0, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 1109
    .line 1110
    .line 1111
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1112
    .line 1113
    return-object v0

    .line 1114
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1115
    .line 1116
    check-cast v1, Ljava/lang/Throwable;

    .line 1117
    .line 1118
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1119
    .line 1120
    .line 1121
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1122
    .line 1123
    check-cast v0, La/r7f;

    .line 1124
    .line 1125
    invoke-virtual {v0, v1}, La/r7f;->f0(Ljava/lang/Throwable;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    return-object v0

    .line 1131
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1132
    .line 1133
    check-cast v1, Ljava/lang/Throwable;

    .line 1134
    .line 1135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1136
    .line 1137
    .line 1138
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1139
    .line 1140
    check-cast v0, La/r7f;

    .line 1141
    .line 1142
    iget-object v2, v0, La/r7f;->T0:La/ctf0;

    .line 1143
    .line 1144
    instance-of v3, v1, La/zhi0;

    .line 1145
    .line 1146
    const v4, 0x7f13053d

    .line 1147
    .line 1148
    .line 1149
    const/4 v5, 0x0

    .line 1150
    if-eqz v3, :cond_17

    .line 1151
    .line 1152
    check-cast v1, La/zhi0;

    .line 1153
    .line 1154
    iget-object v3, v1, La/zhi0;->c:La/kuw;

    .line 1155
    .line 1156
    sget-object v6, La/i2o;->l4:La/i2o;

    .line 1157
    .line 1158
    if-ne v3, v6, :cond_16

    .line 1159
    .line 1160
    new-instance v3, La/a4f;

    .line 1161
    .line 1162
    new-array v4, v5, [Ljava/lang/Object;

    .line 1163
    .line 1164
    const v5, 0x7f1303fb

    .line 1165
    .line 1166
    .line 1167
    invoke-virtual {v2, v5, v4}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1168
    .line 1169
    .line 1170
    move-result-object v2

    .line 1171
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1172
    .line 1173
    .line 1174
    move-result-object v1

    .line 1175
    if-nez v1, :cond_15

    .line 1176
    .line 1177
    const-string v1, ""

    .line 1178
    .line 1179
    :cond_15
    sget-object v4, La/rek0;->b:La/rek0;

    .line 1180
    .line 1181
    invoke-direct {v3, v2, v1, v4}, La/a4f;-><init>(Ljava/lang/String;Ljava/lang/String;La/sek0;)V

    .line 1182
    .line 1183
    .line 1184
    invoke-virtual {v0, v3}, La/r7f;->R(La/c4f;)V

    .line 1185
    .line 1186
    .line 1187
    goto :goto_9

    .line 1188
    :cond_16
    new-instance v1, La/p3f;

    .line 1189
    .line 1190
    new-array v3, v5, [Ljava/lang/Object;

    .line 1191
    .line 1192
    invoke-virtual {v2, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1193
    .line 1194
    .line 1195
    move-result-object v2

    .line 1196
    invoke-direct {v1, v2}, La/p3f;-><init>(Ljava/lang/String;)V

    .line 1197
    .line 1198
    .line 1199
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 1200
    .line 1201
    .line 1202
    goto :goto_9

    .line 1203
    :cond_17
    new-instance v1, La/p3f;

    .line 1204
    .line 1205
    new-array v3, v5, [Ljava/lang/Object;

    .line 1206
    .line 1207
    invoke-virtual {v2, v4, v3}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v2

    .line 1211
    invoke-direct {v1, v2}, La/p3f;-><init>(Ljava/lang/String;)V

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v0, v1}, La/r7f;->R(La/c4f;)V

    .line 1215
    .line 1216
    .line 1217
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1218
    .line 1219
    return-object v0

    .line 1220
    nop

    .line 1221
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
