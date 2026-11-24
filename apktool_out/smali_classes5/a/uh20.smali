.class public final synthetic La/uh20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/nn20;


# direct methods
.method public synthetic constructor <init>(La/nn20;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uh20;->a:B

    iput-object p1, p0, La/uh20;->b:La/nn20;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uh20;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    const/4 v4, 0x1

    .line 8
    iget-object v0, v0, La/uh20;->b:La/nn20;

    .line 9
    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, Ljava/lang/Throwable;

    .line 16
    .line 17
    move-object/from16 v2, p2

    .line 18
    .line 19
    check-cast v2, Ljava/lang/String;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 28
    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 35
    .line 36
    .line 37
    new-instance v1, La/ei20;

    .line 38
    .line 39
    const/4 v2, 0x4

    .line 40
    invoke-direct {v1, v2}, La/ei20;-><init>(B)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    :goto_0
    return-object v0

    .line 49
    :pswitch_0
    move-object/from16 v1, p1

    .line 50
    .line 51
    check-cast v1, Ljava/lang/Throwable;

    .line 52
    .line 53
    move-object/from16 v2, p2

    .line 54
    .line 55
    check-cast v2, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    instance-of v2, v1, Ljava/util/concurrent/CancellationException;

    .line 64
    .line 65
    if-eqz v2, :cond_1

    .line 66
    .line 67
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 71
    .line 72
    .line 73
    new-instance v1, La/fd20;

    .line 74
    .line 75
    const/16 v2, 0xf

    .line 76
    .line 77
    invoke-direct {v1, v2}, La/fd20;-><init>(B)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 81
    .line 82
    .line 83
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    :goto_1
    return-object v0

    .line 86
    :pswitch_1
    move-object/from16 v1, p1

    .line 87
    .line 88
    check-cast v1, Ljava/lang/Throwable;

    .line 89
    .line 90
    move-object/from16 v4, p2

    .line 91
    .line 92
    check-cast v4, Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 101
    .line 102
    .line 103
    new-instance v1, La/qc20;

    .line 104
    .line 105
    new-instance v2, La/xdk0;

    .line 106
    .line 107
    sget-object v3, La/rek0;->b:La/rek0;

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    const/16 v9, 0x7c

    .line 111
    .line 112
    const/4 v5, 0x0

    .line 113
    const/4 v6, 0x0

    .line 114
    const/4 v7, 0x0

    .line 115
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 116
    .line 117
    .line 118
    invoke-direct {v1, v2}, La/qc20;-><init>(La/xdk0;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 125
    .line 126
    return-object v0

    .line 127
    :pswitch_2
    move-object/from16 v1, p1

    .line 128
    .line 129
    check-cast v1, La/oyg0;

    .line 130
    .line 131
    move-object/from16 v5, p2

    .line 132
    .line 133
    check-cast v5, La/b820;

    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    iget-object v6, v5, La/b820;->d:La/rvj0;

    .line 142
    .line 143
    iget-object v1, v6, La/rvj0;->b:La/mnb0;

    .line 144
    .line 145
    iget-object v7, v6, La/rvj0;->a:La/dx6;

    .line 146
    .line 147
    iget-object v7, v7, La/dx6;->b:La/vw6;

    .line 148
    .line 149
    iget-boolean v7, v7, La/vw6;->p:Z

    .line 150
    .line 151
    invoke-virtual {v0, v7}, La/nn20;->h0(Z)Ljava/lang/String;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    const-string v13, ""

    .line 156
    .line 157
    invoke-static {v1, v3, v7, v13, v4}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    const/4 v11, 0x0

    .line 162
    const/16 v12, 0x1d

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v9, 0x0

    .line 166
    const/4 v10, 0x0

    .line 167
    invoke-static/range {v6 .. v12}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 168
    .line 169
    .line 170
    move-result-object v9

    .line 171
    iget-object v14, v5, La/b820;->f:La/gx4;

    .line 172
    .line 173
    if-eqz v14, :cond_2

    .line 174
    .line 175
    iget-object v1, v14, La/gx4;->e:La/mnb0;

    .line 176
    .line 177
    invoke-virtual {v0, v3}, La/nn20;->h0(Z)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-static {v1, v3, v0, v13, v4}, La/mnb0;->a(La/mnb0;ZLjava/lang/String;Ljava/lang/String;I)La/mnb0;

    .line 182
    .line 183
    .line 184
    move-result-object v19

    .line 185
    const/16 v20, 0xf

    .line 186
    .line 187
    const/4 v15, 0x0

    .line 188
    const/16 v16, 0x0

    .line 189
    .line 190
    const/16 v17, 0x0

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    invoke-static/range {v14 .. v20}, La/gx4;->a(La/gx4;La/a8q0;La/xyc;La/dx6;La/kwo0;La/mnb0;I)La/gx4;

    .line 195
    .line 196
    .line 197
    move-result-object v2

    .line 198
    :cond_2
    move-object v11, v2

    .line 199
    const/16 v17, 0x0

    .line 200
    .line 201
    const/16 v18, 0x1fd7

    .line 202
    .line 203
    const/4 v6, 0x0

    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    const/4 v10, 0x0

    .line 207
    const/4 v12, 0x0

    .line 208
    const/4 v13, 0x0

    .line 209
    const/4 v14, 0x0

    .line 210
    const/4 v15, 0x0

    .line 211
    const/16 v16, 0x0

    .line 212
    .line 213
    invoke-static/range {v5 .. v18}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    return-object v0

    .line 218
    :pswitch_3
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, Ljava/lang/Throwable;

    .line 221
    .line 222
    move-object/from16 v7, p2

    .line 223
    .line 224
    check-cast v7, Ljava/lang/String;

    .line 225
    .line 226
    sget-object v6, La/rek0;->b:La/rek0;

    .line 227
    .line 228
    invoke-static {v7, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    instance-of v5, v1, La/zhi0;

    .line 232
    .line 233
    if-eqz v5, :cond_a

    .line 234
    .line 235
    check-cast v1, La/zhi0;

    .line 236
    .line 237
    iget-object v5, v0, La/nn20;->T:La/mne;

    .line 238
    .line 239
    iget-object v1, v1, La/zhi0;->c:La/kuw;

    .line 240
    .line 241
    sget-object v8, La/i2o;->q:La/i2o;

    .line 242
    .line 243
    if-ne v1, v8, :cond_3

    .line 244
    .line 245
    new-instance v1, La/cc20;

    .line 246
    .line 247
    invoke-direct {v1, v7}, La/cc20;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 251
    .line 252
    .line 253
    goto/16 :goto_4

    .line 254
    .line 255
    :cond_3
    sget-object v8, La/i2o;->n2:La/i2o;

    .line 256
    .line 257
    if-ne v1, v8, :cond_4

    .line 258
    .line 259
    new-instance v1, La/tb20;

    .line 260
    .line 261
    invoke-direct {v1, v7}, La/tb20;-><init>(Ljava/lang/String;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :cond_4
    sget-object v8, La/i2o;->v:La/i2o;

    .line 270
    .line 271
    if-eq v1, v8, :cond_9

    .line 272
    .line 273
    sget-object v8, La/i2o;->w:La/i2o;

    .line 274
    .line 275
    if-eq v1, v8, :cond_9

    .line 276
    .line 277
    sget-object v8, La/i2o;->x:La/i2o;

    .line 278
    .line 279
    if-ne v1, v8, :cond_5

    .line 280
    .line 281
    goto :goto_3

    .line 282
    :cond_5
    sget-object v8, La/i2o;->u:La/i2o;

    .line 283
    .line 284
    if-ne v1, v8, :cond_6

    .line 285
    .line 286
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 287
    .line 288
    .line 289
    move-result-object v9

    .line 290
    new-instance v10, La/r520;

    .line 291
    .line 292
    const/16 v1, 0x1d

    .line 293
    .line 294
    invoke-direct {v10, v1}, La/r520;-><init>(B)V

    .line 295
    .line 296
    .line 297
    iget-object v12, v5, La/mne;->b:La/dvj;

    .line 298
    .line 299
    new-instance v13, La/nk20;

    .line 300
    .line 301
    invoke-direct {v13, v0, v7, v2, v3}, La/nk20;-><init>(La/nn20;Ljava/lang/String;La/yje;B)V

    .line 302
    .line 303
    .line 304
    const/16 v14, 0xa

    .line 305
    .line 306
    const/4 v11, 0x0

    .line 307
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 308
    .line 309
    .line 310
    goto/16 :goto_4

    .line 311
    .line 312
    :cond_6
    sget-object v3, La/i2o;->A:La/i2o;

    .line 313
    .line 314
    if-eq v1, v3, :cond_8

    .line 315
    .line 316
    sget-object v3, La/i2o;->B:La/i2o;

    .line 317
    .line 318
    if-eq v1, v3, :cond_8

    .line 319
    .line 320
    sget-object v3, La/i2o;->K4:La/i2o;

    .line 321
    .line 322
    if-eq v1, v3, :cond_8

    .line 323
    .line 324
    sget-object v3, La/i2o;->t:La/i2o;

    .line 325
    .line 326
    if-ne v1, v3, :cond_7

    .line 327
    .line 328
    goto :goto_2

    .line 329
    :cond_7
    new-instance v1, La/qc20;

    .line 330
    .line 331
    new-instance v5, La/xdk0;

    .line 332
    .line 333
    const/4 v11, 0x0

    .line 334
    const/16 v12, 0x7c

    .line 335
    .line 336
    const/4 v8, 0x0

    .line 337
    const/4 v9, 0x0

    .line 338
    const/4 v10, 0x0

    .line 339
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 340
    .line 341
    .line 342
    invoke-direct {v1, v5}, La/qc20;-><init>(La/xdk0;)V

    .line 343
    .line 344
    .line 345
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 346
    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_8
    :goto_2
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 350
    .line 351
    .line 352
    move-result-object v8

    .line 353
    new-instance v9, La/r520;

    .line 354
    .line 355
    const/16 v1, 0xd

    .line 356
    .line 357
    invoke-direct {v9, v1}, La/r520;-><init>(B)V

    .line 358
    .line 359
    .line 360
    iget-object v11, v5, La/mne;->b:La/dvj;

    .line 361
    .line 362
    new-instance v12, La/nk20;

    .line 363
    .line 364
    invoke-direct {v12, v0, v7, v2, v4}, La/nk20;-><init>(La/nn20;Ljava/lang/String;La/yje;B)V

    .line 365
    .line 366
    .line 367
    const/16 v13, 0xa

    .line 368
    .line 369
    const/4 v10, 0x0

    .line 370
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 371
    .line 372
    .line 373
    goto :goto_4

    .line 374
    :cond_9
    :goto_3
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 375
    .line 376
    .line 377
    move-result-object v1

    .line 378
    move-object v3, v1

    .line 379
    sget-object v1, La/ik20;->a:La/ik20;

    .line 380
    .line 381
    iget-object v5, v5, La/mne;->b:La/dvj;

    .line 382
    .line 383
    new-instance v6, La/gk20;

    .line 384
    .line 385
    invoke-direct {v6, v0, v2, v4}, La/gk20;-><init>(La/nn20;La/yje;B)V

    .line 386
    .line 387
    .line 388
    move-object v0, v3

    .line 389
    move-object v3, v5

    .line 390
    const/16 v5, 0xa

    .line 391
    .line 392
    const/4 v2, 0x0

    .line 393
    move-object v4, v6

    .line 394
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 395
    .line 396
    .line 397
    goto :goto_4

    .line 398
    :cond_a
    invoke-static {v1}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 399
    .line 400
    .line 401
    move-result v1

    .line 402
    if-eqz v1, :cond_b

    .line 403
    .line 404
    invoke-virtual {v0}, La/nn20;->B0()V

    .line 405
    .line 406
    .line 407
    goto :goto_4

    .line 408
    :cond_b
    new-instance v1, La/qc20;

    .line 409
    .line 410
    new-instance v5, La/xdk0;

    .line 411
    .line 412
    const/4 v11, 0x0

    .line 413
    const/16 v12, 0x7c

    .line 414
    .line 415
    const/4 v8, 0x0

    .line 416
    const/4 v9, 0x0

    .line 417
    const/4 v10, 0x0

    .line 418
    invoke-direct/range {v5 .. v12}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 419
    .line 420
    .line 421
    invoke-direct {v1, v5}, La/qc20;-><init>(La/xdk0;)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 428
    .line 429
    return-object v0

    .line 430
    :pswitch_4
    move-object/from16 v1, p1

    .line 431
    .line 432
    check-cast v1, La/oyg0;

    .line 433
    .line 434
    move-object/from16 v2, p2

    .line 435
    .line 436
    check-cast v2, La/b820;

    .line 437
    .line 438
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    iget-object v3, v2, La/b820;->d:La/rvj0;

    .line 445
    .line 446
    iget-object v4, v3, La/rvj0;->c:La/kwo0;

    .line 447
    .line 448
    invoke-virtual {v0}, La/nn20;->U()Z

    .line 449
    .line 450
    .line 451
    move-result v5

    .line 452
    sget-object v9, La/iun;->a:La/iun;

    .line 453
    .line 454
    const-wide/16 v7, 0x0

    .line 455
    .line 456
    const/16 v10, 0x14

    .line 457
    .line 458
    const/4 v6, 0x0

    .line 459
    invoke-static/range {v4 .. v10}, La/kwo0;->a(La/kwo0;ZZDLjava/util/List;I)La/kwo0;

    .line 460
    .line 461
    .line 462
    move-result-object v6

    .line 463
    const/4 v8, 0x0

    .line 464
    const/16 v9, 0x1b

    .line 465
    .line 466
    const/4 v4, 0x0

    .line 467
    const/4 v5, 0x0

    .line 468
    const/4 v7, 0x0

    .line 469
    invoke-static/range {v3 .. v9}, La/rvj0;->a(La/rvj0;La/dx6;La/mnb0;La/kwo0;La/mnd0;Ljava/lang/String;I)La/rvj0;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    const/4 v14, 0x0

    .line 474
    const/16 v15, 0x1ff7

    .line 475
    .line 476
    const/4 v3, 0x0

    .line 477
    const/4 v9, 0x0

    .line 478
    const/4 v10, 0x0

    .line 479
    const/4 v11, 0x0

    .line 480
    const/4 v12, 0x0

    .line 481
    const/4 v13, 0x0

    .line 482
    invoke-static/range {v2 .. v15}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 483
    .line 484
    .line 485
    move-result-object v0

    .line 486
    return-object v0

    .line 487
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
