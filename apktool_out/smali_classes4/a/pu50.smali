.class public final synthetic La/pu50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pu50;->a:B

    iput-object p1, p0, La/pu50;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/pu50;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const-string v3, "viewModelFactory"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/pu50;->b:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v0, La/al70;

    .line 15
    .line 16
    sget v1, La/al70;->Q1:I

    .line 17
    .line 18
    new-instance v1, La/ko60;

    .line 19
    .line 20
    const/4 v2, 0x4

    .line 21
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 22
    .line 23
    .line 24
    return-object v1

    .line 25
    :pswitch_0
    check-cast v0, La/aj70;

    .line 26
    .line 27
    sget-object v1, La/aj70;->P1:La/xi70;

    .line 28
    .line 29
    new-instance v1, La/ry3;

    .line 30
    .line 31
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-object v0, v0, La/aj70;->M1:La/q6i;

    .line 36
    .line 37
    if-eqz v0, :cond_0

    .line 38
    .line 39
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 40
    .line 41
    .line 42
    return-object v1

    .line 43
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v4

    .line 47
    :pswitch_1
    check-cast v0, La/qh70;

    .line 48
    .line 49
    sget-object v1, La/qh70;->O1:La/nh70;

    .line 50
    .line 51
    new-instance v1, La/ry3;

    .line 52
    .line 53
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget-object v0, v0, La/qh70;->L1:La/n6i;

    .line 58
    .line 59
    if-eqz v0, :cond_1

    .line 60
    .line 61
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 62
    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v4

    .line 69
    :pswitch_2
    check-cast v0, La/hg70;

    .line 70
    .line 71
    sget-object v1, La/hg70;->P1:La/evz;

    .line 72
    .line 73
    new-instance v1, La/ko60;

    .line 74
    .line 75
    const/4 v2, 0x3

    .line 76
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 77
    .line 78
    .line 79
    return-object v1

    .line 80
    :pswitch_3
    check-cast v0, La/vf70;

    .line 81
    .line 82
    sget v1, La/vf70;->Q1:I

    .line 83
    .line 84
    new-instance v1, La/ko60;

    .line 85
    .line 86
    const/4 v2, 0x1

    .line 87
    invoke-direct {v1, v0, v2}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 88
    .line 89
    .line 90
    return-object v1

    .line 91
    :pswitch_4
    check-cast v0, La/xd70;

    .line 92
    .line 93
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-static {v1}, La/d5c;->R(La/vne;)Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_2

    .line 102
    .line 103
    invoke-virtual {v0}, La/xd70;->l0()V

    .line 104
    .line 105
    .line 106
    iget-object v0, v0, La/xd70;->q:La/i1w0;

    .line 107
    .line 108
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 109
    .line 110
    .line 111
    move-result-object v1

    .line 112
    new-instance v3, La/c8d;

    .line 113
    .line 114
    sget-object v4, La/y7d;->a:La/v7d;

    .line 115
    .line 116
    sget-object v5, La/p0w0;->a:La/p0w0;

    .line 117
    .line 118
    invoke-direct {v3, v4, v5}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v1, v3, v0, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    :goto_0
    move-object v2, v1

    .line 126
    check-cast v2, La/paw;

    .line 127
    .line 128
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_2

    .line 133
    .line 134
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    check-cast v2, La/oe50;

    .line 139
    .line 140
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 141
    .line 142
    .line 143
    goto :goto_0

    .line 144
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 145
    .line 146
    return-object v0

    .line 147
    :pswitch_5
    check-cast v0, La/lc70;

    .line 148
    .line 149
    new-instance v1, La/q0h0;

    .line 150
    .line 151
    iget-object v0, v0, La/lc70;->l2:La/vmi;

    .line 152
    .line 153
    if-eqz v0, :cond_3

    .line 154
    .line 155
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 156
    .line 157
    .line 158
    return-object v1

    .line 159
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    throw v4

    .line 163
    :pswitch_6
    check-cast v0, Landroid/app/Activity;

    .line 164
    .line 165
    instance-of v1, v0, La/agd;

    .line 166
    .line 167
    if-eqz v1, :cond_4

    .line 168
    .line 169
    move-object v4, v0

    .line 170
    check-cast v4, La/agd;

    .line 171
    .line 172
    :cond_4
    if-eqz v4, :cond_5

    .line 173
    .line 174
    new-instance v0, La/rgn0;

    .line 175
    .line 176
    const/16 v1, 0x14

    .line 177
    .line 178
    invoke-direct {v0, v1}, La/rgn0;-><init>(B)V

    .line 179
    .line 180
    .line 181
    new-instance v3, La/c9o0;

    .line 182
    .line 183
    invoke-direct {v3, v2, v2, v0}, La/c9o0;-><init>(IILkotlin/jvm/functions/Function1;)V

    .line 184
    .line 185
    .line 186
    sget v0, La/mjn;->a:I

    .line 187
    .line 188
    sget v2, La/mjn;->b:I

    .line 189
    .line 190
    new-instance v5, La/rgn0;

    .line 191
    .line 192
    invoke-direct {v5, v1}, La/rgn0;-><init>(B)V

    .line 193
    .line 194
    .line 195
    new-instance v1, La/c9o0;

    .line 196
    .line 197
    invoke-direct {v1, v0, v2, v5}, La/c9o0;-><init>(IILkotlin/jvm/functions/Function1;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v4, v3, v1}, La/mjn;->a(La/agd;La/c9o0;La/c9o0;)V

    .line 201
    .line 202
    .line 203
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 204
    .line 205
    return-object v0

    .line 206
    :pswitch_7
    check-cast v0, La/h970;

    .line 207
    .line 208
    new-instance v1, La/q0h0;

    .line 209
    .line 210
    iget-object v0, v0, La/h970;->m2:La/umi;

    .line 211
    .line 212
    if-eqz v0, :cond_6

    .line 213
    .line 214
    invoke-direct {v1, v0}, La/q0h0;-><init>(La/p0h0;)V

    .line 215
    .line 216
    .line 217
    return-object v1

    .line 218
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v4

    .line 222
    :pswitch_8
    check-cast v0, La/k570;

    .line 223
    .line 224
    check-cast v0, La/h570;

    .line 225
    .line 226
    iget-object v0, v0, La/h570;->e:La/vdt;

    .line 227
    .line 228
    return-object v0

    .line 229
    :pswitch_9
    check-cast v0, La/hv60;

    .line 230
    .line 231
    new-instance v1, La/cr60;

    .line 232
    .line 233
    const/4 v2, 0x6

    .line 234
    invoke-direct {v1, v2}, La/cr60;-><init>(B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 238
    .line 239
    .line 240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_a
    check-cast v0, La/b430;

    .line 244
    .line 245
    new-instance v1, La/ed50;

    .line 246
    .line 247
    new-instance v3, La/imm;

    .line 248
    .line 249
    new-instance v4, La/ilm;

    .line 250
    .line 251
    sget-object v5, La/s6t0;->a:La/pz40;

    .line 252
    .line 253
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 254
    .line 255
    .line 256
    move-result-object v5

    .line 257
    iget-object v5, v5, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 258
    .line 259
    invoke-virtual {v5}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 260
    .line 261
    .line 262
    move-result-wide v5

    .line 263
    invoke-direct {v4, v5, v6}, La/ilm;-><init>(J)V

    .line 264
    .line 265
    .line 266
    iget-object v0, v0, La/b430;->b:Ljava/lang/Object;

    .line 267
    .line 268
    check-cast v0, La/ctf0;

    .line 269
    .line 270
    new-array v5, v2, [Ljava/lang/Object;

    .line 271
    .line 272
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 273
    .line 274
    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const v5, 0x7f130373

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v5, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v7

    .line 285
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 286
    .line 287
    .line 288
    move-result-object v0

    .line 289
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 290
    .line 291
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 292
    .line 293
    .line 294
    move-result-wide v9

    .line 295
    sget-object v8, La/ha50;->b:La/ha50;

    .line 296
    .line 297
    new-instance v5, La/plm;

    .line 298
    .line 299
    sget-object v11, La/fa50;->a:La/fa50;

    .line 300
    .line 301
    move-object v6, v5

    .line 302
    invoke-direct/range {v6 .. v11}, La/plm;-><init>(Ljava/lang/String;La/ha50;JLa/ga50;)V

    .line 303
    .line 304
    .line 305
    new-instance v6, La/dmm;

    .line 306
    .line 307
    new-instance v0, La/ta50;

    .line 308
    .line 309
    new-instance v7, La/wkm;

    .line 310
    .line 311
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    iget-object v2, v2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 316
    .line 317
    invoke-virtual {v2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getSecondary-0d7_KjU()J

    .line 318
    .line 319
    .line 320
    move-result-wide v12

    .line 321
    const/4 v8, 0x0

    .line 322
    const v9, 0x7f080965

    .line 323
    .line 324
    .line 325
    const/4 v10, 0x1

    .line 326
    sget-object v11, La/ra50;->a:La/ra50;

    .line 327
    .line 328
    invoke-direct/range {v7 .. v13}, La/wkm;-><init>(IIZLa/sa50;J)V

    .line 329
    .line 330
    .line 331
    invoke-direct {v0, v7}, La/ta50;-><init>(La/wkm;)V

    .line 332
    .line 333
    .line 334
    invoke-direct {v6, v0}, La/dmm;-><init>(La/wa50;)V

    .line 335
    .line 336
    .line 337
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    iget-object v0, v0, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 342
    .line 343
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getBackgroundContent-0d7_KjU()J

    .line 344
    .line 345
    .line 346
    move-result-wide v7

    .line 347
    const/4 v9, 0x0

    .line 348
    const/4 v10, 0x0

    .line 349
    invoke-direct/range {v3 .. v10}, La/imm;-><init>(La/llm;La/tlm;La/gmm;JZLa/y3d;)V

    .line 350
    .line 351
    .line 352
    invoke-direct {v1, v3}, La/ed50;-><init>(La/imm;)V

    .line 353
    .line 354
    .line 355
    return-object v1

    .line 356
    :pswitch_b
    check-cast v0, La/eo60;

    .line 357
    .line 358
    sget-object v1, La/eo60;->O1:La/atz;

    .line 359
    .line 360
    new-instance v1, La/ry3;

    .line 361
    .line 362
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 363
    .line 364
    .line 365
    move-result-object v2

    .line 366
    iget-object v0, v0, La/eo60;->L1:La/l6i;

    .line 367
    .line 368
    if-eqz v0, :cond_7

    .line 369
    .line 370
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 371
    .line 372
    .line 373
    return-object v1

    .line 374
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    throw v4

    .line 378
    :pswitch_c
    check-cast v0, La/wn60;

    .line 379
    .line 380
    sget-object v1, La/wn60;->O1:[La/iiy;

    .line 381
    .line 382
    new-instance v1, La/ry3;

    .line 383
    .line 384
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 385
    .line 386
    .line 387
    move-result-object v2

    .line 388
    iget-object v0, v0, La/wn60;->L1:La/a7i;

    .line 389
    .line 390
    if-eqz v0, :cond_8

    .line 391
    .line 392
    invoke-direct {v1, v2, v0}, La/ry3;-><init>(La/i1w0;La/giu0;)V

    .line 393
    .line 394
    .line 395
    return-object v1

    .line 396
    :cond_8
    const-string v0, "oneXGameFreeBonusViewModelFactory"

    .line 397
    .line 398
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 399
    .line 400
    .line 401
    throw v4

    .line 402
    :pswitch_d
    check-cast v0, La/ef8;

    .line 403
    .line 404
    return-object v0

    .line 405
    :pswitch_e
    check-cast v0, La/pk60;

    .line 406
    .line 407
    iget-object v0, v0, La/pk60;->i:La/ouu;

    .line 408
    .line 409
    new-instance v1, La/xa50;

    .line 410
    .line 411
    invoke-direct {v1}, La/xa50;-><init>()V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 415
    .line 416
    .line 417
    invoke-virtual {v0, v1}, La/ouu;->M(La/cb50;)La/i1w0;

    .line 418
    .line 419
    .line 420
    move-result-object v3

    .line 421
    new-instance v5, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 422
    .line 423
    invoke-direct {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 424
    .line 425
    .line 426
    new-instance v6, La/q0w0;

    .line 427
    .line 428
    invoke-direct {v6, v4}, La/q0w0;-><init>(La/m7h0;)V

    .line 429
    .line 430
    .line 431
    new-instance v4, La/c8d;

    .line 432
    .line 433
    sget-object v7, La/y7d;->a:La/v7d;

    .line 434
    .line 435
    invoke-direct {v4, v7, v6}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 436
    .line 437
    .line 438
    invoke-static {v5, v4, v3, v5, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 439
    .line 440
    .line 441
    move-result-object v4

    .line 442
    :goto_1
    move-object v5, v4

    .line 443
    check-cast v5, La/paw;

    .line 444
    .line 445
    invoke-virtual {v5}, La/paw;->hasNext()Z

    .line 446
    .line 447
    .line 448
    move-result v6

    .line 449
    if-eqz v6, :cond_9

    .line 450
    .line 451
    invoke-virtual {v5}, La/paw;->next()Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v5

    .line 455
    check-cast v5, La/oe50;

    .line 456
    .line 457
    invoke-virtual {v3, v5}, La/i1w0;->a(La/oe50;)V

    .line 458
    .line 459
    .line 460
    goto :goto_1

    .line 461
    :cond_9
    iget-object v0, v0, La/ouu;->b:Ljava/lang/Object;

    .line 462
    .line 463
    check-cast v0, La/qe50;

    .line 464
    .line 465
    invoke-virtual {v0, v1, v2}, La/qe50;->a(La/cb50;Z)V

    .line 466
    .line 467
    .line 468
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 469
    .line 470
    return-object v0

    .line 471
    :pswitch_f
    check-cast v0, La/bj60;

    .line 472
    .line 473
    sget-object v1, La/bj60;->O1:[La/iiy;

    .line 474
    .line 475
    iget-object v0, v0, La/bj60;->K1:La/fiu0;

    .line 476
    .line 477
    if-eqz v0, :cond_a

    .line 478
    .line 479
    return-object v0

    .line 480
    :cond_a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 481
    .line 482
    .line 483
    throw v4

    .line 484
    :pswitch_10
    check-cast v0, La/jg60;

    .line 485
    .line 486
    new-instance v1, La/hg60;

    .line 487
    .line 488
    invoke-direct {v1, v0}, La/hg60;-><init>(La/jg60;)V

    .line 489
    .line 490
    .line 491
    return-object v1

    .line 492
    :pswitch_11
    check-cast v0, La/ds3;

    .line 493
    .line 494
    invoke-virtual {v0}, La/ds3;->invoke()Ljava/lang/Object;

    .line 495
    .line 496
    .line 497
    move-result-object v0

    .line 498
    check-cast v0, Lokhttp3/Call$Factory;

    .line 499
    .line 500
    new-instance v1, La/zo9;

    .line 501
    .line 502
    invoke-direct {v1, v0}, La/zo9;-><init>(Lokhttp3/Call$Factory;)V

    .line 503
    .line 504
    .line 505
    return-object v1

    .line 506
    :pswitch_12
    check-cast v0, La/rrd;

    .line 507
    .line 508
    iget-object v0, v0, La/rrd;->g:Ljava/lang/Object;

    .line 509
    .line 510
    check-cast v0, La/pru;

    .line 511
    .line 512
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    return-object v0

    .line 517
    :pswitch_13
    check-cast v0, La/wdu;

    .line 518
    .line 519
    iget-object v0, v0, La/wdu;->j:Ljava/lang/Object;

    .line 520
    .line 521
    check-cast v0, La/pru;

    .line 522
    .line 523
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    return-object v0

    .line 528
    :pswitch_14
    check-cast v0, La/tzi;

    .line 529
    .line 530
    iget-object v0, v0, La/tzi;->h:Ljava/lang/Object;

    .line 531
    .line 532
    check-cast v0, La/wsc;

    .line 533
    .line 534
    iget-object v0, v0, La/wsc;->a:La/gst0;

    .line 535
    .line 536
    invoke-virtual {v0}, La/gst0;->j()V

    .line 537
    .line 538
    .line 539
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    :pswitch_15
    check-cast v0, La/pwi;

    .line 543
    .line 544
    iget-object v0, v0, La/pwi;->d:Ljava/lang/Object;

    .line 545
    .line 546
    check-cast v0, La/s4v;

    .line 547
    .line 548
    iget-object v0, v0, La/s4v;->a:La/gst0;

    .line 549
    .line 550
    invoke-virtual {v0}, La/gst0;->i()V

    .line 551
    .line 552
    .line 553
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 554
    .line 555
    return-object v0

    .line 556
    :pswitch_16
    check-cast v0, La/w5z;

    .line 557
    .line 558
    iget-object v0, v0, La/w5z;->d:Ljava/lang/Object;

    .line 559
    .line 560
    check-cast v0, La/pru;

    .line 561
    .line 562
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 563
    .line 564
    .line 565
    move-result-object v0

    .line 566
    return-object v0

    .line 567
    :pswitch_17
    check-cast v0, La/rrd;

    .line 568
    .line 569
    iget-object v0, v0, La/rrd;->h:Ljava/lang/Object;

    .line 570
    .line 571
    check-cast v0, La/pru;

    .line 572
    .line 573
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 574
    .line 575
    .line 576
    move-result-object v0

    .line 577
    return-object v0

    .line 578
    :pswitch_18
    check-cast v0, La/u760;

    .line 579
    .line 580
    iget-object v0, v0, La/u760;->c:La/e1u;

    .line 581
    .line 582
    invoke-virtual {v0}, La/e1u;->g()La/p760;

    .line 583
    .line 584
    .line 585
    move-result-object v0

    .line 586
    return-object v0

    .line 587
    :pswitch_19
    check-cast v0, La/xw50;

    .line 588
    .line 589
    iget-object v0, v0, La/xw50;->d:La/a4x;

    .line 590
    .line 591
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 592
    .line 593
    .line 594
    move-result v0

    .line 595
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 596
    .line 597
    .line 598
    move-result-object v0

    .line 599
    return-object v0

    .line 600
    :pswitch_1a
    check-cast v0, La/o24;

    .line 601
    .line 602
    sget-object v6, La/kr5;->B:La/kr5;

    .line 603
    .line 604
    new-instance v7, La/ykg0;

    .line 605
    .line 606
    new-instance v10, La/ysw;

    .line 607
    .line 608
    const/16 v1, 0xf

    .line 609
    .line 610
    invoke-direct {v10, v4, v1}, La/ysw;-><init>(Ljava/lang/String;I)V

    .line 611
    .line 612
    .line 613
    sget-object v12, La/clg0;->c:La/clg0;

    .line 614
    .line 615
    const/4 v8, 0x0

    .line 616
    const-string v9, ""

    .line 617
    .line 618
    move-object v11, v10

    .line 619
    invoke-direct/range {v7 .. v12}, La/ykg0;-><init>(ZLjava/lang/String;La/ysw;La/ysw;La/clg0;)V

    .line 620
    .line 621
    .line 622
    iget-object v1, v0, La/o24;->c:Ljava/lang/Object;

    .line 623
    .line 624
    move-object v10, v1

    .line 625
    check-cast v10, Ljava/lang/String;

    .line 626
    .line 627
    iget-object v1, v0, La/o24;->d:Ljava/lang/Object;

    .line 628
    .line 629
    move-object v11, v1

    .line 630
    check-cast v11, La/oo5;

    .line 631
    .line 632
    iget-boolean v12, v0, La/o24;->a:Z

    .line 633
    .line 634
    sget-object v15, La/iun;->a:La/iun;

    .line 635
    .line 636
    new-instance v9, La/nk80;

    .line 637
    .line 638
    sget-object v0, La/mk80;->a:La/mk80;

    .line 639
    .line 640
    invoke-direct {v9, v0, v4}, La/nk80;-><init>(La/mk80;La/mdm;)V

    .line 641
    .line 642
    .line 643
    new-instance v5, La/zv50;

    .line 644
    .line 645
    const/16 v20, 0x0

    .line 646
    .line 647
    const/16 v21, 0x0

    .line 648
    .line 649
    const/4 v8, 0x1

    .line 650
    const/4 v13, 0x0

    .line 651
    const/4 v14, 0x0

    .line 652
    const/16 v16, 0x0

    .line 653
    .line 654
    const/16 v17, 0x0

    .line 655
    .line 656
    const/16 v18, 0x0

    .line 657
    .line 658
    const/16 v19, 0x0

    .line 659
    .line 660
    invoke-direct/range {v5 .. v21}, La/zv50;-><init>(La/kr5;La/ykg0;ZLa/nk80;Ljava/lang/String;La/oo5;ZZZLjava/util/List;IZZZZZ)V

    .line 661
    .line 662
    .line 663
    return-object v5

    .line 664
    :pswitch_1b
    check-cast v0, La/aw50;

    .line 665
    .line 666
    iget-object v0, v0, La/aw50;->e:Ljava/util/List;

    .line 667
    .line 668
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 669
    .line 670
    .line 671
    move-result v0

    .line 672
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 673
    .line 674
    .line 675
    move-result-object v0

    .line 676
    return-object v0

    .line 677
    :pswitch_1c
    check-cast v0, La/ru50;

    .line 678
    .line 679
    iget-object v0, v0, La/ru50;->a:Ljava/util/List;

    .line 680
    .line 681
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 682
    .line 683
    .line 684
    move-result v0

    .line 685
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 686
    .line 687
    .line 688
    move-result-object v0

    .line 689
    return-object v0

    .line 690
    nop

    .line 691
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
