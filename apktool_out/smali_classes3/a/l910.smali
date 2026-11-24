.class public final synthetic La/l910;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/l910;->a:B

    iput-object p1, p0, La/l910;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/l910;->a:B

    .line 6
    .line 7
    const-string v3, "input_method"

    .line 8
    .line 9
    sget-object v4, La/jle;->a:La/jle;

    .line 10
    .line 11
    const/16 v5, 0x1d

    .line 12
    .line 13
    const/4 v6, 0x3

    .line 14
    sget-object v7, La/p0w0;->a:La/p0w0;

    .line 15
    .line 16
    const/4 v8, 0x2

    .line 17
    const/4 v9, 0x0

    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x1

    .line 20
    iget-object v0, v0, La/l910;->b:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v2, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/doe0;

    .line 26
    .line 27
    iget-object v0, v0, La/doe0;->N1:La/hoe0;

    .line 28
    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    iget-object v0, v0, La/hoe0;->c:La/pzu;

    .line 32
    .line 33
    invoke-virtual {v0}, La/pzu;->B()V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    const-string v0, "viewModel"

    .line 38
    .line 39
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw v9

    .line 43
    :pswitch_0
    check-cast v0, La/jne0;

    .line 44
    .line 45
    sget-object v1, La/jne0;->S1:La/gne0;

    .line 46
    .line 47
    invoke-virtual {v0}, La/jne0;->H0()La/xne0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/xne0;->g:La/pzu;

    .line 52
    .line 53
    iget-object v1, v0, La/pzu;->a:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v1, La/oeg0;

    .line 56
    .line 57
    invoke-virtual {v1}, La/oeg0;->c()La/i1w0;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v1, v1}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    iget-object v3, v0, La/pzu;->e:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v3, La/jh70;

    .line 68
    .line 69
    iget-object v0, v0, La/pzu;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, La/pru;

    .line 72
    .line 73
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    iget-object v0, v0, La/sff0;->V0:La/zuc0;

    .line 78
    .line 79
    invoke-static {v3, v0}, La/jh70;->i(La/jh70;La/zuc0;)Lorg/xplatform/promo/impl/core/di/navigation/PromoScreenFactoryImpl$getPromoSettingsScreen$1;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v2, v0}, La/k0w0;->c(La/m7h0;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, v2, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 87
    .line 88
    invoke-static {v1, v0, v10}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    :goto_0
    move-object v2, v0

    .line 93
    check-cast v2, La/paw;

    .line 94
    .line 95
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    if-eqz v3, :cond_1

    .line 100
    .line 101
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    check-cast v2, La/oe50;

    .line 106
    .line 107
    invoke-virtual {v1, v2}, La/i1w0;->a(La/oe50;)V

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_1
    return-void

    .line 112
    :pswitch_1
    check-cast v0, La/xbe0;

    .line 113
    .line 114
    sget-object v1, La/xbe0;->Q1:[La/iiy;

    .line 115
    .line 116
    invoke-virtual {v0}, La/xbe0;->H0()La/nde0;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iget-object v0, v0, La/nde0;->c:La/i1w0;

    .line 121
    .line 122
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    new-instance v2, La/c8d;

    .line 127
    .line 128
    sget-object v3, La/y7d;->a:La/v7d;

    .line 129
    .line 130
    invoke-direct {v2, v3, v7}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    :goto_1
    move-object v2, v1

    .line 138
    check-cast v2, La/paw;

    .line 139
    .line 140
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v3

    .line 144
    if-eqz v3, :cond_2

    .line 145
    .line 146
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v2

    .line 150
    check-cast v2, La/oe50;

    .line 151
    .line 152
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 153
    .line 154
    .line 155
    goto :goto_1

    .line 156
    :cond_2
    return-void

    .line 157
    :pswitch_2
    check-cast v0, La/snd0;

    .line 158
    .line 159
    sget-object v1, La/snd0;->n2:La/rl70;

    .line 160
    .line 161
    iget-object v0, v0, La/snd0;->m2:La/kiu0;

    .line 162
    .line 163
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    check-cast v0, La/qnd0;

    .line 168
    .line 169
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    new-instance v13, La/ond0;

    .line 174
    .line 175
    invoke-direct {v13, v0, v11}, La/ond0;-><init>(La/qnd0;B)V

    .line 176
    .line 177
    .line 178
    iget-object v1, v0, La/qnd0;->i:La/mne;

    .line 179
    .line 180
    iget-object v15, v1, La/mne;->a:La/rwj;

    .line 181
    .line 182
    new-instance v1, La/ts6;

    .line 183
    .line 184
    invoke-direct {v1, v0, v9, v6}, La/ts6;-><init>(La/diu0;La/yje;B)V

    .line 185
    .line 186
    .line 187
    const/16 v17, 0xa

    .line 188
    .line 189
    const/4 v14, 0x0

    .line 190
    move-object/from16 v16, v1

    .line 191
    .line 192
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 193
    .line 194
    .line 195
    return-void

    .line 196
    :pswitch_3
    check-cast v0, La/a6d0;

    .line 197
    .line 198
    sget-object v1, La/a6d0;->f2:La/jh70;

    .line 199
    .line 200
    invoke-virtual {v0}, La/sik;->y0()V

    .line 201
    .line 202
    .line 203
    return-void

    .line 204
    :pswitch_4
    check-cast v0, La/b0c0;

    .line 205
    .line 206
    invoke-virtual {v0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :pswitch_5
    check-cast v0, La/b0c0;

    .line 211
    .line 212
    invoke-virtual {v0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :pswitch_6
    check-cast v0, La/b0c0;

    .line 217
    .line 218
    invoke-virtual {v0}, La/b0c0;->invoke()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    return-void

    .line 222
    :pswitch_7
    check-cast v0, La/crb0;

    .line 223
    .line 224
    sget-object v1, La/crb0;->S1:La/jh70;

    .line 225
    .line 226
    invoke-virtual {v0}, La/crb0;->H0()La/orb0;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    iget-object v2, v0, La/orb0;->e:La/mne;

    .line 235
    .line 236
    iget-object v4, v2, La/mne;->b:La/dvj;

    .line 237
    .line 238
    new-instance v2, La/irb0;

    .line 239
    .line 240
    invoke-direct {v2, v0, v10}, La/irb0;-><init>(La/orb0;B)V

    .line 241
    .line 242
    .line 243
    new-instance v5, La/kpb0;

    .line 244
    .line 245
    invoke-direct {v5, v0, v9, v11}, La/kpb0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 246
    .line 247
    .line 248
    const/16 v6, 0xa

    .line 249
    .line 250
    const/4 v3, 0x0

    .line 251
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 252
    .line 253
    .line 254
    return-void

    .line 255
    :pswitch_8
    check-cast v0, La/u6b0;

    .line 256
    .line 257
    sget-object v1, La/u6b0;->e2:La/xi70;

    .line 258
    .line 259
    invoke-virtual {v0}, La/u6b0;->J0()La/sbb0;

    .line 260
    .line 261
    .line 262
    move-result-object v0

    .line 263
    iget-object v1, v0, La/sbb0;->B0:La/p7m0;

    .line 264
    .line 265
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v1

    .line 269
    check-cast v1, La/r9b0;

    .line 270
    .line 271
    iget-object v1, v1, La/r9b0;->b:Ljava/util/List;

    .line 272
    .line 273
    sget-object v2, La/s9b0;->e:La/s9b0;

    .line 274
    .line 275
    invoke-interface {v1, v2}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    .line 276
    .line 277
    .line 278
    move-result v1

    .line 279
    const/4 v2, -0x1

    .line 280
    if-eq v1, v2, :cond_3

    .line 281
    .line 282
    const-string v2, ""

    .line 283
    .line 284
    invoke-virtual {v0, v1, v2}, La/sbb0;->G(ILjava/lang/String;)V

    .line 285
    .line 286
    .line 287
    :cond_3
    return-void

    .line 288
    :pswitch_9
    check-cast v0, La/n1a0;

    .line 289
    .line 290
    invoke-virtual {v0}, La/n1a0;->g()V

    .line 291
    .line 292
    .line 293
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    const v3, 0x7f0a0504

    .line 298
    .line 299
    .line 300
    if-ne v2, v3, :cond_4

    .line 301
    .line 302
    iget-object v0, v0, La/n1a0;->r:Landroid/animation/ValueAnimator;

    .line 303
    .line 304
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 305
    .line 306
    .line 307
    goto :goto_2

    .line 308
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    .line 309
    .line 310
    .line 311
    move-result v1

    .line 312
    const v2, 0x7f0a0503

    .line 313
    .line 314
    .line 315
    if-ne v1, v2, :cond_5

    .line 316
    .line 317
    iget-object v0, v0, La/n1a0;->s:Landroid/animation/ValueAnimator;

    .line 318
    .line 319
    invoke-virtual {v0}, Landroid/animation/ValueAnimator;->start()V

    .line 320
    .line 321
    .line 322
    :cond_5
    :goto_2
    return-void

    .line 323
    :pswitch_a
    check-cast v0, La/y0a0;

    .line 324
    .line 325
    iget-object v0, v0, La/y0a0;->h:Landroidx/media3/ui/PlayerControlView;

    .line 326
    .line 327
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 328
    .line 329
    if-eqz v1, :cond_6

    .line 330
    .line 331
    check-cast v1, La/ulo;

    .line 332
    .line 333
    invoke-virtual {v1, v5}, La/ulo;->w(I)Z

    .line 334
    .line 335
    .line 336
    move-result v1

    .line 337
    if-eqz v1, :cond_6

    .line 338
    .line 339
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 340
    .line 341
    check-cast v1, La/ulo;

    .line 342
    .line 343
    invoke-virtual {v1}, La/ulo;->v()La/scs0;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 348
    .line 349
    check-cast v1, La/nyj;

    .line 350
    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    new-instance v3, La/myj;

    .line 355
    .line 356
    invoke-direct {v3, v1}, La/myj;-><init>(La/nyj;)V

    .line 357
    .line 358
    .line 359
    invoke-virtual {v3, v6}, La/myj;->b(I)La/rcs0;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v3}, La/rcs0;->d()La/rcs0;

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3}, La/rcs0;->f()La/rcs0;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v3}, La/rcs0;->h()La/rcs0;

    .line 369
    .line 370
    .line 371
    invoke-virtual {v3}, La/rcs0;->a()La/scs0;

    .line 372
    .line 373
    .line 374
    move-result-object v1

    .line 375
    check-cast v2, La/ulo;

    .line 376
    .line 377
    invoke-virtual {v2, v1}, La/ulo;->R(La/scs0;)V

    .line 378
    .line 379
    .line 380
    iget-object v0, v0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 381
    .line 382
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 383
    .line 384
    .line 385
    :cond_6
    return-void

    .line 386
    :pswitch_b
    check-cast v0, La/d1a0;

    .line 387
    .line 388
    iget-object v1, v0, La/d1a0;->x:Landroidx/media3/ui/PlayerControlView;

    .line 389
    .line 390
    invoke-virtual {v0}, La/xhe0;->d()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    sget-object v2, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 395
    .line 396
    iget-object v2, v1, Landroidx/media3/ui/PlayerControlView;->j1:Landroid/view/View;

    .line 397
    .line 398
    if-nez v0, :cond_7

    .line 399
    .line 400
    iget-object v0, v1, Landroidx/media3/ui/PlayerControlView;->n:La/b1a0;

    .line 401
    .line 402
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1, v0, v2}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 406
    .line 407
    .line 408
    goto :goto_3

    .line 409
    :cond_7
    if-ne v0, v11, :cond_8

    .line 410
    .line 411
    iget-object v0, v1, Landroidx/media3/ui/PlayerControlView;->p:La/y0a0;

    .line 412
    .line 413
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    invoke-virtual {v1, v0, v2}, Landroidx/media3/ui/PlayerControlView;->d(La/yge0;Landroid/view/View;)V

    .line 417
    .line 418
    .line 419
    goto :goto_3

    .line 420
    :cond_8
    iget-object v0, v1, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 421
    .line 422
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 423
    .line 424
    .line 425
    :goto_3
    return-void

    .line 426
    :pswitch_c
    check-cast v0, La/y0a0;

    .line 427
    .line 428
    iget-object v0, v0, La/y0a0;->h:Landroidx/media3/ui/PlayerControlView;

    .line 429
    .line 430
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 431
    .line 432
    if-eqz v1, :cond_a

    .line 433
    .line 434
    check-cast v1, La/ulo;

    .line 435
    .line 436
    invoke-virtual {v1, v5}, La/ulo;->w(I)Z

    .line 437
    .line 438
    .line 439
    move-result v1

    .line 440
    if-nez v1, :cond_9

    .line 441
    .line 442
    goto :goto_4

    .line 443
    :cond_9
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 444
    .line 445
    check-cast v1, La/ulo;

    .line 446
    .line 447
    invoke-virtual {v1}, La/ulo;->v()La/scs0;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    iget-object v2, v0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 452
    .line 453
    sget-object v3, La/vtt0;->a:Ljava/lang/String;

    .line 454
    .line 455
    check-cast v1, La/nyj;

    .line 456
    .line 457
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 458
    .line 459
    .line 460
    new-instance v3, La/myj;

    .line 461
    .line 462
    invoke-direct {v3, v1}, La/myj;-><init>(La/nyj;)V

    .line 463
    .line 464
    .line 465
    invoke-virtual {v3, v11}, La/myj;->b(I)La/rcs0;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v3, v11, v10}, La/rcs0;->i(IZ)La/rcs0;

    .line 469
    .line 470
    .line 471
    invoke-virtual {v3}, La/rcs0;->a()La/scs0;

    .line 472
    .line 473
    .line 474
    move-result-object v1

    .line 475
    check-cast v2, La/ulo;

    .line 476
    .line 477
    invoke-virtual {v2, v1}, La/ulo;->R(La/scs0;)V

    .line 478
    .line 479
    .line 480
    iget-object v1, v0, Landroidx/media3/ui/PlayerControlView;->m:La/e1a0;

    .line 481
    .line 482
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 483
    .line 484
    .line 485
    move-result-object v2

    .line 486
    const v3, 0x7f130827

    .line 487
    .line 488
    .line 489
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iget-object v1, v1, La/e1a0;->f:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v1, [Ljava/lang/String;

    .line 496
    .line 497
    aput-object v2, v1, v11

    .line 498
    .line 499
    iget-object v0, v0, Landroidx/media3/ui/PlayerControlView;->r:Landroid/widget/PopupWindow;

    .line 500
    .line 501
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 502
    .line 503
    .line 504
    :cond_a
    :goto_4
    return-void

    .line 505
    :pswitch_d
    check-cast v0, Landroidx/media3/ui/PlayerControlView;

    .line 506
    .line 507
    sget-object v1, Landroidx/media3/ui/PlayerControlView;->i2:[F

    .line 508
    .line 509
    iget-boolean v1, v0, Landroidx/media3/ui/PlayerControlView;->R1:Z

    .line 510
    .line 511
    xor-int/2addr v1, v11

    .line 512
    invoke-virtual {v0, v1}, Landroidx/media3/ui/PlayerControlView;->o(Z)V

    .line 513
    .line 514
    .line 515
    return-void

    .line 516
    :pswitch_e
    check-cast v0, La/gz;

    .line 517
    .line 518
    invoke-virtual {v0}, La/gz;->invoke()Ljava/lang/Object;

    .line 519
    .line 520
    .line 521
    return-void

    .line 522
    :pswitch_f
    check-cast v0, La/u190;

    .line 523
    .line 524
    iget-object v1, v0, La/u190;->f:Landroid/widget/EditText;

    .line 525
    .line 526
    if-nez v1, :cond_b

    .line 527
    .line 528
    goto :goto_6

    .line 529
    :cond_b
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 530
    .line 531
    .line 532
    move-result v1

    .line 533
    iget-object v2, v0, La/u190;->f:Landroid/widget/EditText;

    .line 534
    .line 535
    if-eqz v2, :cond_c

    .line 536
    .line 537
    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 538
    .line 539
    .line 540
    move-result-object v2

    .line 541
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 542
    .line 543
    if-eqz v2, :cond_c

    .line 544
    .line 545
    move v10, v11

    .line 546
    :cond_c
    iget-object v2, v0, La/u190;->f:Landroid/widget/EditText;

    .line 547
    .line 548
    if-eqz v10, :cond_d

    .line 549
    .line 550
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 551
    .line 552
    .line 553
    goto :goto_5

    .line 554
    :cond_d
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 555
    .line 556
    .line 557
    move-result-object v3

    .line 558
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 559
    .line 560
    .line 561
    :goto_5
    if-ltz v1, :cond_e

    .line 562
    .line 563
    iget-object v2, v0, La/u190;->f:Landroid/widget/EditText;

    .line 564
    .line 565
    invoke-virtual {v2, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 566
    .line 567
    .line 568
    :cond_e
    invoke-virtual {v0}, La/dxn;->p()V

    .line 569
    .line 570
    .line 571
    :goto_6
    return-void

    .line 572
    :pswitch_10
    check-cast v0, La/z880;

    .line 573
    .line 574
    sget-object v1, La/z880;->U1:La/xi70;

    .line 575
    .line 576
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v0}, La/z880;->H0()La/aa80;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 584
    .line 585
    .line 586
    move-result-object v1

    .line 587
    iget-object v2, v0, La/aa80;->g:La/mne;

    .line 588
    .line 589
    iget-object v4, v2, La/mne;->a:La/rwj;

    .line 590
    .line 591
    sget-object v2, La/u980;->a:La/u980;

    .line 592
    .line 593
    new-instance v5, La/v980;

    .line 594
    .line 595
    invoke-direct {v5, v0, v9}, La/v980;-><init>(La/aa80;La/yje;)V

    .line 596
    .line 597
    .line 598
    const/16 v6, 0xa

    .line 599
    .line 600
    const/4 v3, 0x0

    .line 601
    invoke-static/range {v1 .. v6}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 602
    .line 603
    .line 604
    return-void

    .line 605
    :pswitch_11
    check-cast v0, La/ul70;

    .line 606
    .line 607
    sget-object v1, La/ul70;->Q1:La/rl70;

    .line 608
    .line 609
    invoke-virtual {v0}, La/ul70;->H0()La/nm70;

    .line 610
    .line 611
    .line 612
    move-result-object v0

    .line 613
    iget-object v1, v0, La/nm70;->i:La/oqt;

    .line 614
    .line 615
    invoke-virtual {v1}, La/oqt;->a()Z

    .line 616
    .line 617
    .line 618
    move-result v1

    .line 619
    if-nez v1, :cond_f

    .line 620
    .line 621
    iget-object v1, v0, La/nm70;->g:La/spx;

    .line 622
    .line 623
    invoke-virtual {v1}, La/spx;->a()Z

    .line 624
    .line 625
    .line 626
    move-result v1

    .line 627
    if-eqz v1, :cond_f

    .line 628
    .line 629
    goto :goto_7

    .line 630
    :cond_f
    invoke-virtual {v0, v4}, La/nm70;->w(La/zy5;)V

    .line 631
    .line 632
    .line 633
    :goto_7
    return-void

    .line 634
    :pswitch_12
    check-cast v0, La/aj70;

    .line 635
    .line 636
    sget-object v1, La/aj70;->P1:La/xi70;

    .line 637
    .line 638
    invoke-virtual {v0}, La/aj70;->H0()La/tj70;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    iget-object v1, v0, La/tj70;->h:La/oqt;

    .line 643
    .line 644
    invoke-virtual {v1}, La/oqt;->a()Z

    .line 645
    .line 646
    .line 647
    move-result v1

    .line 648
    if-nez v1, :cond_10

    .line 649
    .line 650
    iget-object v1, v0, La/tj70;->g:La/spx;

    .line 651
    .line 652
    invoke-virtual {v1}, La/spx;->a()Z

    .line 653
    .line 654
    .line 655
    move-result v1

    .line 656
    if-eqz v1, :cond_10

    .line 657
    .line 658
    goto :goto_8

    .line 659
    :cond_10
    invoke-virtual {v0, v4}, La/tj70;->w(La/zy5;)V

    .line 660
    .line 661
    .line 662
    :goto_8
    return-void

    .line 663
    :pswitch_13
    check-cast v0, La/mh70;

    .line 664
    .line 665
    sget-object v1, La/mh70;->Q1:La/jh70;

    .line 666
    .line 667
    invoke-virtual {v0}, La/mh70;->H0()La/h0r;

    .line 668
    .line 669
    .line 670
    move-result-object v1

    .line 671
    iget-object v1, v1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 672
    .line 673
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, La/mh70;->H0()La/h0r;

    .line 677
    .line 678
    .line 679
    move-result-object v1

    .line 680
    iget-object v1, v1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 681
    .line 682
    invoke-virtual {v0}, La/mh70;->H0()La/h0r;

    .line 683
    .line 684
    .line 685
    move-result-object v2

    .line 686
    iget-object v2, v2, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 687
    .line 688
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 689
    .line 690
    .line 691
    move-result-object v2

    .line 692
    if-eqz v2, :cond_11

    .line 693
    .line 694
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 695
    .line 696
    .line 697
    move-result v10

    .line 698
    :cond_11
    invoke-virtual {v1, v10}, Landroid/widget/EditText;->setSelection(I)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 706
    .line 707
    .line 708
    move-result-object v1

    .line 709
    instance-of v2, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 710
    .line 711
    if-eqz v2, :cond_12

    .line 712
    .line 713
    move-object v9, v1

    .line 714
    check-cast v9, Landroid/view/inputmethod/InputMethodManager;

    .line 715
    .line 716
    :cond_12
    if-eqz v9, :cond_13

    .line 717
    .line 718
    invoke-virtual {v0}, La/mh70;->H0()La/h0r;

    .line 719
    .line 720
    .line 721
    move-result-object v0

    .line 722
    iget-object v0, v0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 723
    .line 724
    invoke-virtual {v9, v0, v11}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 725
    .line 726
    .line 727
    :cond_13
    return-void

    .line 728
    :pswitch_14
    check-cast v0, La/dg70;

    .line 729
    .line 730
    sget-object v1, La/dg70;->Q1:La/xuz;

    .line 731
    .line 732
    invoke-virtual {v0}, La/dg70;->I0()La/h0r;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    iget-object v1, v1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 737
    .line 738
    invoke-virtual {v1}, Landroid/view/View;->requestFocus()Z

    .line 739
    .line 740
    .line 741
    invoke-virtual {v0}, La/dg70;->I0()La/h0r;

    .line 742
    .line 743
    .line 744
    move-result-object v1

    .line 745
    iget-object v1, v1, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 746
    .line 747
    invoke-virtual {v0}, La/dg70;->I0()La/h0r;

    .line 748
    .line 749
    .line 750
    move-result-object v2

    .line 751
    iget-object v2, v2, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 752
    .line 753
    invoke-virtual {v2}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    .line 754
    .line 755
    .line 756
    move-result-object v2

    .line 757
    if-eqz v2, :cond_14

    .line 758
    .line 759
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 760
    .line 761
    .line 762
    move-result v10

    .line 763
    :cond_14
    invoke-virtual {v1, v10}, Landroid/widget/EditText;->setSelection(I)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 767
    .line 768
    .line 769
    move-result-object v1

    .line 770
    invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    move-result-object v1

    .line 774
    instance-of v2, v1, Landroid/view/inputmethod/InputMethodManager;

    .line 775
    .line 776
    if-eqz v2, :cond_15

    .line 777
    .line 778
    move-object v9, v1

    .line 779
    check-cast v9, Landroid/view/inputmethod/InputMethodManager;

    .line 780
    .line 781
    :cond_15
    if-eqz v9, :cond_16

    .line 782
    .line 783
    invoke-virtual {v0}, La/dg70;->I0()La/h0r;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    iget-object v0, v0, La/h0r;->f:Lorg/xplatform/core/presentation/views/OneXGamesInputEditText;

    .line 788
    .line 789
    invoke-virtual {v9, v0, v8}, Landroid/view/inputmethod/InputMethodManager;->showSoftInput(Landroid/view/View;I)Z

    .line 790
    .line 791
    .line 792
    :cond_16
    return-void

    .line 793
    :pswitch_15
    check-cast v0, La/cu60;

    .line 794
    .line 795
    sget-object v1, La/cu60;->U1:La/evz;

    .line 796
    .line 797
    invoke-virtual {v0}, La/cu60;->H0()La/h2b;

    .line 798
    .line 799
    .line 800
    move-result-object v0

    .line 801
    iget-object v0, v0, La/h2b;->b:La/i1w0;

    .line 802
    .line 803
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    new-instance v2, La/c8d;

    .line 808
    .line 809
    sget-object v3, La/y7d;->a:La/v7d;

    .line 810
    .line 811
    invoke-direct {v2, v3, v7}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 812
    .line 813
    .line 814
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 815
    .line 816
    .line 817
    move-result-object v1

    .line 818
    :goto_9
    move-object v2, v1

    .line 819
    check-cast v2, La/paw;

    .line 820
    .line 821
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 822
    .line 823
    .line 824
    move-result v3

    .line 825
    if-eqz v3, :cond_17

    .line 826
    .line 827
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 828
    .line 829
    .line 830
    move-result-object v2

    .line 831
    check-cast v2, La/oe50;

    .line 832
    .line 833
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 834
    .line 835
    .line 836
    goto :goto_9

    .line 837
    :cond_17
    return-void

    .line 838
    :pswitch_16
    check-cast v0, La/lo60;

    .line 839
    .line 840
    sget-object v1, La/lo60;->U1:La/htz;

    .line 841
    .line 842
    sget-object v1, La/ymx;->e:La/ymx;

    .line 843
    .line 844
    new-instance v2, La/fo60;

    .line 845
    .line 846
    invoke-direct {v2, v0, v11}, La/fo60;-><init>(La/lo60;B)V

    .line 847
    .line 848
    .line 849
    invoke-static {v1, v2}, La/dyb;->P(La/ymx;Lkotlin/jvm/functions/Function0;)Z

    .line 850
    .line 851
    .line 852
    return-void

    .line 853
    :pswitch_17
    check-cast v0, Lcom/google/android/material/datepicker/f;

    .line 854
    .line 855
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/f;->I0()V

    .line 856
    .line 857
    .line 858
    throw v9

    .line 859
    :pswitch_18
    check-cast v0, La/s730;

    .line 860
    .line 861
    sget-object v1, La/s730;->Q1:La/atz;

    .line 862
    .line 863
    iget-object v0, v0, La/s730;->M1:La/kiu0;

    .line 864
    .line 865
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 866
    .line 867
    .line 868
    move-result-object v0

    .line 869
    check-cast v0, La/dy20;

    .line 870
    .line 871
    iget-object v1, v0, La/dy20;->w:La/c4m0;

    .line 872
    .line 873
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 874
    .line 875
    .line 876
    iget-object v1, v0, La/dy20;->x:La/c4m0;

    .line 877
    .line 878
    invoke-static {v1}, La/v3c;->N(La/bby;)V

    .line 879
    .line 880
    .line 881
    iget-object v0, v0, La/dy20;->f:La/i1w0;

    .line 882
    .line 883
    invoke-static {v0}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 884
    .line 885
    .line 886
    move-result-object v1

    .line 887
    new-instance v2, La/c8d;

    .line 888
    .line 889
    sget-object v3, La/y7d;->a:La/v7d;

    .line 890
    .line 891
    invoke-direct {v2, v3, v7}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 892
    .line 893
    .line 894
    invoke-static {v1, v2, v0, v1, v10}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 895
    .line 896
    .line 897
    move-result-object v1

    .line 898
    :goto_a
    move-object v2, v1

    .line 899
    check-cast v2, La/paw;

    .line 900
    .line 901
    invoke-virtual {v2}, La/paw;->hasNext()Z

    .line 902
    .line 903
    .line 904
    move-result v3

    .line 905
    if-eqz v3, :cond_18

    .line 906
    .line 907
    invoke-virtual {v2}, La/paw;->next()Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v2

    .line 911
    check-cast v2, La/oe50;

    .line 912
    .line 913
    invoke-virtual {v0, v2}, La/i1w0;->a(La/oe50;)V

    .line 914
    .line 915
    .line 916
    goto :goto_a

    .line 917
    :cond_18
    return-void

    .line 918
    :pswitch_19
    check-cast v0, La/f730;

    .line 919
    .line 920
    invoke-virtual {v0}, La/f730;->w()V

    .line 921
    .line 922
    .line 923
    return-void

    .line 924
    :pswitch_1a
    check-cast v0, La/e730;

    .line 925
    .line 926
    invoke-virtual {v0}, La/e730;->w()V

    .line 927
    .line 928
    .line 929
    return-void

    .line 930
    :pswitch_1b
    check-cast v0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;

    .line 931
    .line 932
    iget-object v0, v0, Lorg/xplatform/lucky_card/presentation/views/LuckyCardChoiceView;->c:La/fj10;

    .line 933
    .line 934
    if-eqz v0, :cond_1b

    .line 935
    .line 936
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 937
    .line 938
    .line 939
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 940
    .line 941
    .line 942
    move-result-object v1

    .line 943
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    check-cast v1, La/ej10;

    .line 947
    .line 948
    check-cast v0, La/yox;

    .line 949
    .line 950
    iget-object v0, v0, La/yox;->a:Ljava/lang/Object;

    .line 951
    .line 952
    check-cast v0, La/lj10;

    .line 953
    .line 954
    sget-object v2, La/lj10;->O1:[La/iiy;

    .line 955
    .line 956
    iget-object v0, v0, La/lj10;->M1:La/kiu0;

    .line 957
    .line 958
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    move-object v14, v0

    .line 963
    check-cast v14, La/uj10;

    .line 964
    .line 965
    iget-object v0, v14, La/uj10;->c:La/mne;

    .line 966
    .line 967
    iget-object v2, v14, La/uj10;->d:La/lzt;

    .line 968
    .line 969
    invoke-virtual {v2}, La/lzt;->a()Z

    .line 970
    .line 971
    .line 972
    move-result v2

    .line 973
    if-nez v2, :cond_19

    .line 974
    .line 975
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 976
    .line 977
    .line 978
    move-result-object v3

    .line 979
    iget-object v6, v0, La/mne;->a:La/rwj;

    .line 980
    .line 981
    sget-object v4, La/rj10;->a:La/rj10;

    .line 982
    .line 983
    new-instance v7, La/slx;

    .line 984
    .line 985
    const/16 v0, 0x1a

    .line 986
    .line 987
    invoke-direct {v7, v14, v9, v0}, La/slx;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 988
    .line 989
    .line 990
    const/16 v8, 0xa

    .line 991
    .line 992
    const/4 v5, 0x0

    .line 993
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 994
    .line 995
    .line 996
    goto :goto_b

    .line 997
    :cond_19
    iget-object v2, v14, La/uj10;->m:La/bby;

    .line 998
    .line 999
    if-eqz v2, :cond_1a

    .line 1000
    .line 1001
    invoke-interface {v2}, La/bby;->isActive()Z

    .line 1002
    .line 1003
    .line 1004
    move-result v2

    .line 1005
    if-ne v2, v11, :cond_1a

    .line 1006
    .line 1007
    goto :goto_b

    .line 1008
    :cond_1a
    invoke-static {v14}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v3

    .line 1012
    iget-object v6, v0, La/mne;->b:La/dvj;

    .line 1013
    .line 1014
    new-instance v4, La/pf10;

    .line 1015
    .line 1016
    const/16 v18, 0x0

    .line 1017
    .line 1018
    const/16 v19, 0x5

    .line 1019
    .line 1020
    const/4 v13, 0x1

    .line 1021
    const-class v15, La/uj10;

    .line 1022
    .line 1023
    const-string v16, "handleGameError"

    .line 1024
    .line 1025
    const-string v17, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1026
    .line 1027
    move-object v12, v4

    .line 1028
    invoke-direct/range {v12 .. v19}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1029
    .line 1030
    .line 1031
    new-instance v7, La/fhq;

    .line 1032
    .line 1033
    const/16 v0, 0x14

    .line 1034
    .line 1035
    invoke-direct {v7, v1, v14, v9, v0}, La/fhq;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1036
    .line 1037
    .line 1038
    const/16 v8, 0xa

    .line 1039
    .line 1040
    const/4 v5, 0x0

    .line 1041
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1042
    .line 1043
    .line 1044
    move-result-object v0

    .line 1045
    iput-object v0, v14, La/uj10;->m:La/bby;

    .line 1046
    .line 1047
    :cond_1b
    :goto_b
    return-void

    .line 1048
    :pswitch_1c
    check-cast v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;

    .line 1049
    .line 1050
    iget-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->f:La/n910;

    .line 1051
    .line 1052
    sget-object v3, La/n910;->b:La/n910;

    .line 1053
    .line 1054
    if-ne v2, v3, :cond_20

    .line 1055
    .line 1056
    iget-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 1057
    .line 1058
    if-nez v2, :cond_20

    .line 1059
    .line 1060
    sget-object v2, La/n910;->c:La/n910;

    .line 1061
    .line 1062
    iput-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->f:La/n910;

    .line 1063
    .line 1064
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1065
    .line 1066
    .line 1067
    move-object v2, v1

    .line 1068
    check-cast v2, La/sdq0;

    .line 1069
    .line 1070
    iput-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 1071
    .line 1072
    invoke-interface {v2, v11}, La/sdq0;->setErasable(Z)V

    .line 1073
    .line 1074
    .line 1075
    iget-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->a:[La/sdq0;

    .line 1076
    .line 1077
    new-instance v3, Ljava/util/ArrayList;

    .line 1078
    .line 1079
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1080
    .line 1081
    .line 1082
    array-length v4, v2

    .line 1083
    move v5, v10

    .line 1084
    :goto_c
    if-ge v5, v4, :cond_1d

    .line 1085
    .line 1086
    aget-object v6, v2, v5

    .line 1087
    .line 1088
    iget-object v7, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->b:La/sdq0;

    .line 1089
    .line 1090
    if-eq v6, v7, :cond_1c

    .line 1091
    .line 1092
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1093
    .line 1094
    .line 1095
    :cond_1c
    add-int/lit8 v5, v5, 0x1

    .line 1096
    .line 1097
    goto :goto_c

    .line 1098
    :cond_1d
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1099
    .line 1100
    .line 1101
    move-result-object v2

    .line 1102
    :cond_1e
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 1103
    .line 1104
    .line 1105
    move-result v3

    .line 1106
    if-eqz v3, :cond_1f

    .line 1107
    .line 1108
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    check-cast v3, La/sdq0;

    .line 1113
    .line 1114
    if-eqz v3, :cond_1e

    .line 1115
    .line 1116
    invoke-interface {v3}, La/sdq0;->a()V

    .line 1117
    .line 1118
    .line 1119
    goto :goto_d

    .line 1120
    :cond_1f
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1121
    .line 1122
    .line 1123
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v2, Landroid/animation/AnimatorSet;

    .line 1127
    .line 1128
    invoke-direct {v2}, Landroid/animation/AnimatorSet;-><init>()V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v1}, Landroid/view/View;->getRotation()F

    .line 1132
    .line 1133
    .line 1134
    move-result v3

    .line 1135
    new-array v4, v8, [F

    .line 1136
    .line 1137
    aput v3, v4, v10

    .line 1138
    .line 1139
    const/4 v3, 0x0

    .line 1140
    aput v3, v4, v11

    .line 1141
    .line 1142
    const-string v5, "rotation"

    .line 1143
    .line 1144
    invoke-static {v1, v5, v4}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v4

    .line 1148
    invoke-virtual {v2, v4}, Landroid/animation/AnimatorSet;->play(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v4

    .line 1152
    invoke-virtual {v1}, Landroid/view/View;->getTranslationX()F

    .line 1153
    .line 1154
    .line 1155
    move-result v5

    .line 1156
    new-array v6, v8, [F

    .line 1157
    .line 1158
    aput v5, v6, v10

    .line 1159
    .line 1160
    aput v3, v6, v11

    .line 1161
    .line 1162
    const-string v5, "translationX"

    .line 1163
    .line 1164
    invoke-static {v1, v5, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 1165
    .line 1166
    .line 1167
    move-result-object v5

    .line 1168
    invoke-virtual {v4, v5}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 1169
    .line 1170
    .line 1171
    move-result-object v4

    .line 1172
    invoke-virtual {v1}, Landroid/view/View;->getTranslationY()F

    .line 1173
    .line 1174
    .line 1175
    move-result v5

    .line 1176
    new-array v6, v8, [F

    .line 1177
    .line 1178
    aput v5, v6, v10

    .line 1179
    .line 1180
    aput v3, v6, v11

    .line 1181
    .line 1182
    const-string v3, "translationY"

    .line 1183
    .line 1184
    invoke-static {v1, v3, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 1185
    .line 1186
    .line 1187
    move-result-object v3

    .line 1188
    invoke-virtual {v4, v3}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 1189
    .line 1190
    .line 1191
    move-result-object v3

    .line 1192
    invoke-virtual {v1}, Landroid/view/View;->getScaleX()F

    .line 1193
    .line 1194
    .line 1195
    move-result v4

    .line 1196
    new-array v5, v8, [F

    .line 1197
    .line 1198
    aput v4, v5, v10

    .line 1199
    .line 1200
    const/high16 v4, 0x3f800000    # 1.0f

    .line 1201
    .line 1202
    aput v4, v5, v11

    .line 1203
    .line 1204
    const-string v6, "scaleX"

    .line 1205
    .line 1206
    invoke-static {v1, v6, v5}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v5

    .line 1210
    invoke-virtual {v3, v5}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v3

    .line 1214
    invoke-virtual {v1}, Landroid/view/View;->getScaleY()F

    .line 1215
    .line 1216
    .line 1217
    move-result v5

    .line 1218
    new-array v6, v8, [F

    .line 1219
    .line 1220
    aput v5, v6, v10

    .line 1221
    .line 1222
    aput v4, v6, v11

    .line 1223
    .line 1224
    const-string v4, "scaleY"

    .line 1225
    .line 1226
    invoke-static {v1, v4, v6}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    .line 1227
    .line 1228
    .line 1229
    move-result-object v1

    .line 1230
    invoke-virtual {v3, v1}, Landroid/animation/AnimatorSet$Builder;->with(Landroid/animation/Animator;)Landroid/animation/AnimatorSet$Builder;

    .line 1231
    .line 1232
    .line 1233
    const-wide/16 v3, 0x258

    .line 1234
    .line 1235
    invoke-virtual {v2, v3, v4}, Landroid/animation/AnimatorSet;->setDuration(J)Landroid/animation/AnimatorSet;

    .line 1236
    .line 1237
    .line 1238
    new-instance v1, La/f0p;

    .line 1239
    .line 1240
    invoke-direct {v1, v11}, La/f0p;-><init>(B)V

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v2, v1}, Landroid/animation/AnimatorSet;->setInterpolator(Landroid/animation/TimeInterpolator;)V

    .line 1244
    .line 1245
    .line 1246
    new-instance v1, La/x73;

    .line 1247
    .line 1248
    new-instance v3, La/m910;

    .line 1249
    .line 1250
    invoke-direct {v3, v0, v10}, La/m910;-><init>(Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;B)V

    .line 1251
    .line 1252
    .line 1253
    new-instance v4, La/m910;

    .line 1254
    .line 1255
    invoke-direct {v4, v0, v11}, La/m910;-><init>(Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;B)V

    .line 1256
    .line 1257
    .line 1258
    const/16 v5, 0xa

    .line 1259
    .line 1260
    invoke-direct {v1, v3, v4, v5}, La/x73;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;I)V

    .line 1261
    .line 1262
    .line 1263
    invoke-virtual {v2, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 1264
    .line 1265
    .line 1266
    iput-object v2, v0, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/LotteryView;->d:Landroid/animation/AnimatorSet;

    .line 1267
    .line 1268
    invoke-virtual {v2}, Landroid/animation/Animator;->start()V

    .line 1269
    .line 1270
    .line 1271
    :cond_20
    return-void

    .line 1272
    nop

    .line 1273
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
