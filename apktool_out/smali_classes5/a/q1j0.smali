.class public final synthetic La/q1j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t1j0;


# direct methods
.method public synthetic constructor <init>(La/t1j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q1j0;->a:B

    iput-object p1, p0, La/q1j0;->b:La/t1j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q1j0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/q1j0;->b:La/t1j0;

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object/from16 v1, p1

    .line 14
    .line 15
    check-cast v1, La/gej0;

    .line 16
    .line 17
    sget-object v2, La/t1j0;->Y1:La/zie0;

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v2, v0, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 27
    .line 28
    iget-object v5, v0, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 29
    .line 30
    instance-of v6, v1, La/fej0;

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    invoke-virtual {v5}, La/s31;->B()V

    .line 35
    .line 36
    .line 37
    const-string v1, "QR_auth"

    .line 38
    .line 39
    invoke-virtual {v2, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->b0:La/ubu;

    .line 43
    .line 44
    invoke-virtual {v1}, La/ubu;->a()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    xor-int/2addr v1, v3

    .line 49
    invoke-virtual {v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->H(Z)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    new-instance v6, La/kej0;

    .line 57
    .line 58
    const/4 v2, 0x4

    .line 59
    invoke-direct {v6, v0, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 60
    .line 61
    .line 62
    new-instance v9, La/qej0;

    .line 63
    .line 64
    invoke-direct {v9, v0, v1, v4}, La/qej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;ZLa/yje;)V

    .line 65
    .line 66
    .line 67
    const/16 v10, 0xe

    .line 68
    .line 69
    const/4 v7, 0x0

    .line 70
    const/4 v8, 0x0

    .line 71
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_0
    instance-of v3, v1, La/bej0;

    .line 76
    .line 77
    if-eqz v3, :cond_2

    .line 78
    .line 79
    check-cast v1, La/bej0;

    .line 80
    .line 81
    iget-boolean v1, v1, La/bej0;->c:Z

    .line 82
    .line 83
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 84
    .line 85
    :goto_0
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v4

    .line 89
    move-object v6, v4

    .line 90
    check-cast v6, La/caj0;

    .line 91
    .line 92
    invoke-virtual {v5, v1}, La/s31;->k(Z)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2, v1}, La/s64;->g(Z)V

    .line 96
    .line 97
    .line 98
    iget-object v7, v0, Lorg/xplatform/settings/impl/presentation/a;->w0:La/tqx;

    .line 99
    .line 100
    invoke-virtual {v7, v1}, La/tqx;->a(Z)V

    .line 101
    .line 102
    .line 103
    const/16 v28, 0x0

    .line 104
    .line 105
    const v29, 0x1feffff

    .line 106
    .line 107
    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    const/4 v11, 0x0

    .line 113
    const/4 v12, 0x0

    .line 114
    const/4 v13, 0x0

    .line 115
    const/4 v14, 0x0

    .line 116
    const/4 v15, 0x0

    .line 117
    const/16 v16, 0x0

    .line 118
    .line 119
    const/16 v17, 0x0

    .line 120
    .line 121
    const/16 v18, 0x0

    .line 122
    .line 123
    const/16 v19, 0x0

    .line 124
    .line 125
    const/16 v21, 0x0

    .line 126
    .line 127
    const/16 v22, 0x0

    .line 128
    .line 129
    const/16 v23, 0x0

    .line 130
    .line 131
    const/16 v24, 0x0

    .line 132
    .line 133
    const/16 v25, 0x0

    .line 134
    .line 135
    const/16 v26, 0x0

    .line 136
    .line 137
    const/16 v27, 0x0

    .line 138
    .line 139
    move/from16 v20, v1

    .line 140
    .line 141
    invoke-static/range {v6 .. v29}, La/caj0;->a(La/caj0;ZZZLa/j6d0;ZZLa/mrh0;La/baj0;ZZZZZZZZLjava/lang/String;ZZZZZI)La/caj0;

    .line 142
    .line 143
    .line 144
    move-result-object v1

    .line 145
    invoke-virtual {v3, v4, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-eqz v1, :cond_1

    .line 150
    .line 151
    :goto_1
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 152
    .line 153
    goto :goto_2

    .line 154
    :cond_1
    move/from16 v1, v20

    .line 155
    .line 156
    goto :goto_0

    .line 157
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 158
    .line 159
    .line 160
    :goto_2
    return-object v4

    .line 161
    :pswitch_0
    move-object/from16 v1, p1

    .line 162
    .line 163
    check-cast v1, La/hej0;

    .line 164
    .line 165
    sget-object v5, La/t1j0;->Y1:La/zie0;

    .line 166
    .line 167
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v5, v0, Lorg/xplatform/settings/impl/presentation/a;->J0:La/sff0;

    .line 175
    .line 176
    iget-boolean v6, v0, Lorg/xplatform/settings/impl/presentation/a;->K0:Z

    .line 177
    .line 178
    iget-object v7, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 179
    .line 180
    iget-object v8, v0, Lorg/xplatform/settings/impl/presentation/a;->e:La/qgd;

    .line 181
    .line 182
    iget-object v9, v0, Lorg/xplatform/settings/impl/presentation/a;->X0:La/p7m0;

    .line 183
    .line 184
    iget-object v10, v0, Lorg/xplatform/settings/impl/presentation/a;->A:La/s64;

    .line 185
    .line 186
    iget-object v11, v0, Lorg/xplatform/settings/impl/presentation/a;->d:La/s31;

    .line 187
    .line 188
    iget-object v12, v0, Lorg/xplatform/settings/impl/presentation/a;->k:La/i1w0;

    .line 189
    .line 190
    instance-of v13, v1, La/eij0;

    .line 191
    .line 192
    if-eqz v13, :cond_3

    .line 193
    .line 194
    invoke-virtual {v0, v3}, Lorg/xplatform/settings/impl/presentation/a;->E(Z)V

    .line 195
    .line 196
    .line 197
    goto/16 :goto_19

    .line 198
    .line 199
    :cond_3
    instance-of v13, v1, La/zhj0;

    .line 200
    .line 201
    if-eqz v13, :cond_4

    .line 202
    .line 203
    invoke-virtual {v0, v2}, Lorg/xplatform/settings/impl/presentation/a;->E(Z)V

    .line 204
    .line 205
    .line 206
    goto/16 :goto_19

    .line 207
    .line 208
    :cond_4
    instance-of v13, v1, La/hhj0;

    .line 209
    .line 210
    if-eqz v13, :cond_5

    .line 211
    .line 212
    iget-object v0, v11, La/s31;->a:La/kt2;

    .line 213
    .line 214
    const-string v1, "point"

    .line 215
    .line 216
    const-string v3, "verification"

    .line 217
    .line 218
    const-string v4, "acc_settings_menu"

    .line 219
    .line 220
    invoke-static {v1, v3, v0, v4}, La/i8i;->D(Ljava/lang/String;Ljava/lang/String;La/kt2;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v10, v3}, La/s64;->e(Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 230
    .line 231
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8}, La/qgd;->g0()Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

    .line 235
    .line 236
    .line 237
    move-result-object v1

    .line 238
    new-instance v3, La/f1w0;

    .line 239
    .line 240
    invoke-direct {v3, v1}, La/f1w0;-><init>(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)V

    .line 241
    .line 242
    .line 243
    new-instance v1, La/c8d;

    .line 244
    .line 245
    sget-object v4, La/y7d;->a:La/v7d;

    .line 246
    .line 247
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 248
    .line 249
    .line 250
    invoke-static {v0, v1, v12, v0, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    :goto_3
    move-object v1, v0

    .line 255
    check-cast v1, La/paw;

    .line 256
    .line 257
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 258
    .line 259
    .line 260
    move-result v2

    .line 261
    if-eqz v2, :cond_32

    .line 262
    .line 263
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 264
    .line 265
    .line 266
    move-result-object v1

    .line 267
    check-cast v1, La/oe50;

    .line 268
    .line 269
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 270
    .line 271
    .line 272
    goto :goto_3

    .line 273
    :cond_5
    instance-of v13, v1, La/m9j0;

    .line 274
    .line 275
    if-eqz v13, :cond_6

    .line 276
    .line 277
    invoke-virtual {v11}, La/s31;->x()V

    .line 278
    .line 279
    .line 280
    const-string v1, "pin"

    .line 281
    .line 282
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 286
    .line 287
    .line 288
    new-instance v1, La/k0w0;

    .line 289
    .line 290
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 291
    .line 292
    .line 293
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->l0:La/bu90;

    .line 294
    .line 295
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 296
    .line 297
    .line 298
    new-instance v0, Lorg/xplatform/pin_code/impl/navigation/PinCodeScreensFactoryImpl$pinCodeSettingsScreen$1;

    .line 299
    .line 300
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 301
    .line 302
    .line 303
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 304
    .line 305
    .line 306
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 307
    .line 308
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    :goto_4
    move-object v1, v0

    .line 313
    check-cast v1, La/paw;

    .line 314
    .line 315
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 316
    .line 317
    .line 318
    move-result v2

    .line 319
    if-eqz v2, :cond_32

    .line 320
    .line 321
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v1

    .line 325
    check-cast v1, La/oe50;

    .line 326
    .line 327
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 328
    .line 329
    .line 330
    goto :goto_4

    .line 331
    :cond_6
    instance-of v13, v1, La/ghj0;

    .line 332
    .line 333
    if-eqz v13, :cond_7

    .line 334
    .line 335
    new-instance v1, La/dxi0;

    .line 336
    .line 337
    invoke-direct {v1, v0, v3}, La/dxi0;-><init>(La/diu0;B)V

    .line 338
    .line 339
    .line 340
    const-string v2, "authenticatorChangedResultKey"

    .line 341
    .line 342
    invoke-virtual {v12, v2, v1}, La/i1w0;->f(Ljava/lang/String;La/t2g0;)La/uq;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v11}, La/s31;->l()V

    .line 346
    .line 347
    .line 348
    const-string v1, "1xauth"

    .line 349
    .line 350
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 354
    .line 355
    .line 356
    move-result-object v11

    .line 357
    iget-object v14, v7, La/mne;->c:La/vs10;

    .line 358
    .line 359
    new-instance v12, La/kej0;

    .line 360
    .line 361
    const/16 v1, 0x9

    .line 362
    .line 363
    invoke-direct {v12, v0, v1}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 364
    .line 365
    .line 366
    new-instance v15, La/oej0;

    .line 367
    .line 368
    const/4 v1, 0x6

    .line 369
    invoke-direct {v15, v0, v4, v1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 370
    .line 371
    .line 372
    const/16 v16, 0xa

    .line 373
    .line 374
    const/4 v13, 0x0

    .line 375
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 376
    .line 377
    .line 378
    goto/16 :goto_19

    .line 379
    .line 380
    :cond_7
    instance-of v13, v1, La/qhj0;

    .line 381
    .line 382
    if-eqz v13, :cond_8

    .line 383
    .line 384
    invoke-virtual {v0}, Lorg/xplatform/settings/impl/presentation/a;->F()V

    .line 385
    .line 386
    .line 387
    goto/16 :goto_19

    .line 388
    .line 389
    :cond_8
    instance-of v13, v1, La/fhj0;

    .line 390
    .line 391
    if-eqz v13, :cond_b

    .line 392
    .line 393
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v1

    .line 397
    check-cast v1, La/caj0;

    .line 398
    .line 399
    iget-boolean v1, v1, La/caj0;->d:Z

    .line 400
    .line 401
    if-nez v1, :cond_9

    .line 402
    .line 403
    new-instance v1, La/f1j0;

    .line 404
    .line 405
    sget-object v2, La/vvi0;->e:La/vvi0;

    .line 406
    .line 407
    invoke-direct {v1, v2}, La/f1j0;-><init>(La/vvi0;)V

    .line 408
    .line 409
    .line 410
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 411
    .line 412
    .line 413
    goto/16 :goto_19

    .line 414
    .line 415
    :cond_9
    iget-object v1, v5, La/sff0;->g:La/mum0;

    .line 416
    .line 417
    iget-object v1, v1, La/mum0;->r:La/tsh0;

    .line 418
    .line 419
    sget-object v2, La/tsh0;->c:La/tsh0;

    .line 420
    .line 421
    if-ne v1, v2, :cond_a

    .line 422
    .line 423
    sget-object v1, La/nqh0;->b:La/nqh0;

    .line 424
    .line 425
    invoke-virtual {v0, v1}, Lorg/xplatform/settings/impl/presentation/a;->C(La/nqh0;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_19

    .line 429
    .line 430
    :cond_a
    invoke-virtual {v11}, La/s31;->r()V

    .line 431
    .line 432
    .line 433
    const-string v1, "history"

    .line 434
    .line 435
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 436
    .line 437
    .line 438
    new-instance v1, La/kej0;

    .line 439
    .line 440
    const/16 v2, 0x11

    .line 441
    .line 442
    invoke-direct {v1, v0, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v12, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 446
    .line 447
    .line 448
    goto/16 :goto_19

    .line 449
    .line 450
    :cond_b
    instance-of v13, v1, La/n9j0;

    .line 451
    .line 452
    if-eqz v13, :cond_d

    .line 453
    .line 454
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    check-cast v1, La/caj0;

    .line 459
    .line 460
    iget-boolean v1, v1, La/caj0;->d:Z

    .line 461
    .line 462
    if-eqz v1, :cond_c

    .line 463
    .line 464
    invoke-virtual {v11}, La/s31;->D()V

    .line 465
    .line 466
    .line 467
    const-string v1, "transactions"

    .line 468
    .line 469
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 470
    .line 471
    .line 472
    new-instance v1, La/kej0;

    .line 473
    .line 474
    const/16 v2, 0x10

    .line 475
    .line 476
    invoke-direct {v1, v0, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 477
    .line 478
    .line 479
    invoke-virtual {v12, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_19

    .line 483
    .line 484
    :cond_c
    new-instance v1, La/f1j0;

    .line 485
    .line 486
    sget-object v2, La/vvi0;->b:La/vvi0;

    .line 487
    .line 488
    invoke-direct {v1, v2}, La/f1j0;-><init>(La/vvi0;)V

    .line 489
    .line 490
    .line 491
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 492
    .line 493
    .line 494
    goto/16 :goto_19

    .line 495
    .line 496
    :cond_d
    instance-of v13, v1, La/jhj0;

    .line 497
    .line 498
    if-eqz v13, :cond_e

    .line 499
    .line 500
    invoke-static {v0}, Lorg/xplatform/settings/impl/presentation/a;->D(Lorg/xplatform/settings/impl/presentation/a;)V

    .line 501
    .line 502
    .line 503
    goto/16 :goto_19

    .line 504
    .line 505
    :cond_e
    instance-of v13, v1, La/yhj0;

    .line 506
    .line 507
    if-eqz v13, :cond_f

    .line 508
    .line 509
    invoke-virtual {v11}, La/s31;->n()V

    .line 510
    .line 511
    .line 512
    const-string v1, "coeff_type"

    .line 513
    .line 514
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    new-instance v1, La/k0w0;

    .line 521
    .line 522
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 523
    .line 524
    .line 525
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->H:La/cl5;

    .line 526
    .line 527
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    .line 529
    .line 530
    new-instance v0, Lorg/xplatform/coef_type/impl/navigation/CoefTypeScreenFactoryImpl$getSettingsCoefTypeScreen$1;

    .line 531
    .line 532
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 533
    .line 534
    .line 535
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 536
    .line 537
    .line 538
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 539
    .line 540
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 541
    .line 542
    .line 543
    move-result-object v0

    .line 544
    :goto_5
    move-object v1, v0

    .line 545
    check-cast v1, La/paw;

    .line 546
    .line 547
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 548
    .line 549
    .line 550
    move-result v2

    .line 551
    if-eqz v2, :cond_32

    .line 552
    .line 553
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 554
    .line 555
    .line 556
    move-result-object v1

    .line 557
    check-cast v1, La/oe50;

    .line 558
    .line 559
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 560
    .line 561
    .line 562
    goto :goto_5

    .line 563
    :cond_f
    instance-of v13, v1, La/p9j0;

    .line 564
    .line 565
    if-eqz v13, :cond_10

    .line 566
    .line 567
    invoke-virtual {v11}, La/s31;->A()V

    .line 568
    .line 569
    .line 570
    const-string v1, "push"

    .line 571
    .line 572
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 576
    .line 577
    .line 578
    new-instance v1, La/k0w0;

    .line 579
    .line 580
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 581
    .line 582
    .line 583
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->O:La/rl70;

    .line 584
    .line 585
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 586
    .line 587
    .line 588
    new-instance v0, Lorg/xplatform/features/notification_settings/impl/navigation/PushNotificationSettingsScreens$PushNotificationSettingsFragmentScreen;

    .line 589
    .line 590
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 591
    .line 592
    .line 593
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 594
    .line 595
    .line 596
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 597
    .line 598
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 599
    .line 600
    .line 601
    move-result-object v0

    .line 602
    :goto_6
    move-object v1, v0

    .line 603
    check-cast v1, La/paw;

    .line 604
    .line 605
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v2

    .line 609
    if-eqz v2, :cond_32

    .line 610
    .line 611
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v1

    .line 615
    check-cast v1, La/oe50;

    .line 616
    .line 617
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 618
    .line 619
    .line 620
    goto :goto_6

    .line 621
    :cond_10
    instance-of v13, v1, La/f9j0;

    .line 622
    .line 623
    if-eqz v13, :cond_11

    .line 624
    .line 625
    goto :goto_7

    .line 626
    :cond_11
    instance-of v13, v1, La/ihj0;

    .line 627
    .line 628
    if-eqz v13, :cond_13

    .line 629
    .line 630
    :goto_7
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 631
    .line 632
    .line 633
    move-result-object v1

    .line 634
    check-cast v1, La/caj0;

    .line 635
    .line 636
    iget-boolean v1, v1, La/caj0;->d:Z

    .line 637
    .line 638
    if-eqz v1, :cond_12

    .line 639
    .line 640
    invoke-virtual {v11}, La/s31;->t()V

    .line 641
    .line 642
    .line 643
    const-string v1, "mailing"

    .line 644
    .line 645
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 646
    .line 647
    .line 648
    new-instance v1, La/kej0;

    .line 649
    .line 650
    const/16 v2, 0xa

    .line 651
    .line 652
    invoke-direct {v1, v0, v2}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 653
    .line 654
    .line 655
    invoke-virtual {v12, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 656
    .line 657
    .line 658
    goto/16 :goto_19

    .line 659
    .line 660
    :cond_12
    new-instance v1, La/f1j0;

    .line 661
    .line 662
    sget-object v2, La/vvi0;->d:La/vvi0;

    .line 663
    .line 664
    invoke-direct {v1, v2}, La/f1j0;-><init>(La/vvi0;)V

    .line 665
    .line 666
    .line 667
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 668
    .line 669
    .line 670
    goto/16 :goto_19

    .line 671
    .line 672
    :cond_13
    instance-of v13, v1, La/h9j0;

    .line 673
    .line 674
    if-eqz v13, :cond_14

    .line 675
    .line 676
    invoke-virtual {v11}, La/s31;->o()V

    .line 677
    .line 678
    .line 679
    const-string v1, "dark_theme"

    .line 680
    .line 681
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 682
    .line 683
    .line 684
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 685
    .line 686
    .line 687
    new-instance v1, La/k0w0;

    .line 688
    .line 689
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 690
    .line 691
    .line 692
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->L:La/j6m0;

    .line 693
    .line 694
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 695
    .line 696
    .line 697
    new-instance v0, Lorg/xplatform/themesettings/impl/navigation/ThemeSettingsScreen$ThemeUiKitScreen;

    .line 698
    .line 699
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 700
    .line 701
    .line 702
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 703
    .line 704
    .line 705
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 706
    .line 707
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 708
    .line 709
    .line 710
    move-result-object v0

    .line 711
    :goto_8
    move-object v1, v0

    .line 712
    check-cast v1, La/paw;

    .line 713
    .line 714
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 715
    .line 716
    .line 717
    move-result v2

    .line 718
    if-eqz v2, :cond_32

    .line 719
    .line 720
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v1

    .line 724
    check-cast v1, La/oe50;

    .line 725
    .line 726
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 727
    .line 728
    .line 729
    goto :goto_8

    .line 730
    :cond_14
    instance-of v13, v1, La/o9j0;

    .line 731
    .line 732
    if-eqz v13, :cond_16

    .line 733
    .line 734
    invoke-virtual {v11}, La/s31;->y()V

    .line 735
    .line 736
    .line 737
    const-string v0, "popular"

    .line 738
    .line 739
    invoke-virtual {v10, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 740
    .line 741
    .line 742
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 743
    .line 744
    .line 745
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 746
    .line 747
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 748
    .line 749
    .line 750
    invoke-virtual {v8}, La/qgd;->S()Lorg/xplatform/popular/settings/impl/navigation/PopularSettingsScreenFactoryImpl$getScreen$1;

    .line 751
    .line 752
    .line 753
    move-result-object v1

    .line 754
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 755
    .line 756
    if-eqz v3, :cond_15

    .line 757
    .line 758
    new-instance v3, La/e1w0;

    .line 759
    .line 760
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 761
    .line 762
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 763
    .line 764
    .line 765
    new-instance v1, La/c8d;

    .line 766
    .line 767
    sget-object v4, La/y7d;->a:La/v7d;

    .line 768
    .line 769
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 770
    .line 771
    .line 772
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 773
    .line 774
    .line 775
    goto :goto_9

    .line 776
    :cond_15
    new-instance v3, La/w0w0;

    .line 777
    .line 778
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 779
    .line 780
    .line 781
    new-instance v1, La/c8d;

    .line 782
    .line 783
    sget-object v4, La/y7d;->a:La/v7d;

    .line 784
    .line 785
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 789
    .line 790
    .line 791
    :goto_9
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 792
    .line 793
    .line 794
    move-result-object v0

    .line 795
    :goto_a
    move-object v1, v0

    .line 796
    check-cast v1, La/paw;

    .line 797
    .line 798
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 799
    .line 800
    .line 801
    move-result v2

    .line 802
    if-eqz v2, :cond_32

    .line 803
    .line 804
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 805
    .line 806
    .line 807
    move-result-object v1

    .line 808
    check-cast v1, La/oe50;

    .line 809
    .line 810
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 811
    .line 812
    .line 813
    goto :goto_a

    .line 814
    :cond_16
    instance-of v13, v1, La/s9j0;

    .line 815
    .line 816
    if-eqz v13, :cond_18

    .line 817
    .line 818
    invoke-virtual {v11}, La/s31;->q()V

    .line 819
    .line 820
    .line 821
    const-string v1, "gesture"

    .line 822
    .line 823
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 824
    .line 825
    .line 826
    if-eqz v6, :cond_17

    .line 827
    .line 828
    goto/16 :goto_19

    .line 829
    .line 830
    :cond_17
    invoke-static {v12, v12}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 831
    .line 832
    .line 833
    move-result-object v1

    .line 834
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->M:La/zie0;

    .line 835
    .line 836
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 837
    .line 838
    .line 839
    new-instance v0, Lorg/xplatform/shake/impl/navigation/HandShakeSettingsFragmentScreen;

    .line 840
    .line 841
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 842
    .line 843
    .line 844
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 845
    .line 846
    .line 847
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 848
    .line 849
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 850
    .line 851
    .line 852
    move-result-object v0

    .line 853
    :goto_b
    move-object v1, v0

    .line 854
    check-cast v1, La/paw;

    .line 855
    .line 856
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 857
    .line 858
    .line 859
    move-result v2

    .line 860
    if-eqz v2, :cond_32

    .line 861
    .line 862
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 863
    .line 864
    .line 865
    move-result-object v1

    .line 866
    check-cast v1, La/oe50;

    .line 867
    .line 868
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 869
    .line 870
    .line 871
    goto :goto_b

    .line 872
    :cond_18
    instance-of v13, v1, La/y9j0;

    .line 873
    .line 874
    if-eqz v13, :cond_1a

    .line 875
    .line 876
    iget-object v1, v11, La/s31;->a:La/kt2;

    .line 877
    .line 878
    const-string v3, "widget_fastaccess_setup"

    .line 879
    .line 880
    invoke-interface {v1, v3}, La/kt2;->c(Ljava/lang/String;)V

    .line 881
    .line 882
    .line 883
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->R:La/au0;

    .line 884
    .line 885
    iget-object v1, v1, La/au0;->a:La/s1p;

    .line 886
    .line 887
    const-wide/16 v3, 0xc53

    .line 888
    .line 889
    sget-object v5, La/xun;->a:La/xun;

    .line 890
    .line 891
    invoke-virtual {v1, v5, v3, v4}, La/s1p;->a(Ljava/util/Set;J)V

    .line 892
    .line 893
    .line 894
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 895
    .line 896
    .line 897
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 898
    .line 899
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 900
    .line 901
    .line 902
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->l:La/jw20;

    .line 903
    .line 904
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 905
    .line 906
    .line 907
    invoke-static {}, La/ydx;->S()Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 908
    .line 909
    .line 910
    move-result-object v0

    .line 911
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 912
    .line 913
    if-eqz v3, :cond_19

    .line 914
    .line 915
    new-instance v3, La/e1w0;

    .line 916
    .line 917
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 918
    .line 919
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 920
    .line 921
    .line 922
    new-instance v0, La/c8d;

    .line 923
    .line 924
    sget-object v4, La/y7d;->a:La/v7d;

    .line 925
    .line 926
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 930
    .line 931
    .line 932
    goto :goto_c

    .line 933
    :cond_19
    new-instance v3, La/w0w0;

    .line 934
    .line 935
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 936
    .line 937
    .line 938
    new-instance v0, La/c8d;

    .line 939
    .line 940
    sget-object v4, La/y7d;->a:La/v7d;

    .line 941
    .line 942
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 943
    .line 944
    .line 945
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 946
    .line 947
    .line 948
    :goto_c
    invoke-static {v12, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 949
    .line 950
    .line 951
    move-result-object v0

    .line 952
    :goto_d
    move-object v1, v0

    .line 953
    check-cast v1, La/paw;

    .line 954
    .line 955
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 956
    .line 957
    .line 958
    move-result v2

    .line 959
    if-eqz v2, :cond_32

    .line 960
    .line 961
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 962
    .line 963
    .line 964
    move-result-object v1

    .line 965
    check-cast v1, La/oe50;

    .line 966
    .line 967
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 968
    .line 969
    .line 970
    goto :goto_d

    .line 971
    :cond_1a
    instance-of v13, v1, La/e9j0;

    .line 972
    .line 973
    const/16 v14, 0xb

    .line 974
    .line 975
    if-eqz v13, :cond_1b

    .line 976
    .line 977
    invoke-virtual {v11}, La/s31;->s()V

    .line 978
    .line 979
    .line 980
    const-string v1, "language"

    .line 981
    .line 982
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 983
    .line 984
    .line 985
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 986
    .line 987
    .line 988
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 989
    .line 990
    invoke-direct {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 991
    .line 992
    .line 993
    sget-object v3, La/jgc;->INSTANCE:La/jgc;

    .line 994
    .line 995
    new-instance v4, La/kej0;

    .line 996
    .line 997
    const/16 v5, 0x8

    .line 998
    .line 999
    invoke-direct {v4, v0, v5}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 1000
    .line 1001
    .line 1002
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    new-instance v0, La/onu0;

    .line 1006
    .line 1007
    invoke-direct {v0, v3, v4, v14}, La/onu0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1008
    .line 1009
    .line 1010
    new-instance v4, La/c1w0;

    .line 1011
    .line 1012
    invoke-direct {v4, v3, v0}, La/c1w0;-><init>(La/lwv0;La/onu0;)V

    .line 1013
    .line 1014
    .line 1015
    new-instance v0, La/c8d;

    .line 1016
    .line 1017
    sget-object v3, La/y7d;->a:La/v7d;

    .line 1018
    .line 1019
    invoke-direct {v0, v3, v4}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1020
    .line 1021
    .line 1022
    invoke-static {v1, v0, v12, v1, v2}, La/b1j;->p(Ljava/util/concurrent/CopyOnWriteArrayList;La/c8d;La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v0

    .line 1026
    :goto_e
    move-object v1, v0

    .line 1027
    check-cast v1, La/paw;

    .line 1028
    .line 1029
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1030
    .line 1031
    .line 1032
    move-result v2

    .line 1033
    if-eqz v2, :cond_32

    .line 1034
    .line 1035
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v1

    .line 1039
    check-cast v1, La/oe50;

    .line 1040
    .line 1041
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1042
    .line 1043
    .line 1044
    goto :goto_e

    .line 1045
    :cond_1b
    instance-of v13, v1, La/a9j0;

    .line 1046
    .line 1047
    if-eqz v13, :cond_1d

    .line 1048
    .line 1049
    invoke-virtual {v11}, La/s31;->u()V

    .line 1050
    .line 1051
    .line 1052
    const-string v1, "mirror"

    .line 1053
    .line 1054
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 1055
    .line 1056
    .line 1057
    new-instance v1, La/m1j0;

    .line 1058
    .line 1059
    iget-object v5, v5, La/sff0;->O:Ljava/lang/String;

    .line 1060
    .line 1061
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 1062
    .line 1063
    .line 1064
    move-result v5

    .line 1065
    if-lez v5, :cond_1c

    .line 1066
    .line 1067
    move v2, v3

    .line 1068
    :cond_1c
    invoke-direct {v1, v2}, La/m1j0;-><init>(Z)V

    .line 1069
    .line 1070
    .line 1071
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1072
    .line 1073
    .line 1074
    goto/16 :goto_19

    .line 1075
    .line 1076
    :cond_1d
    instance-of v5, v1, La/phj0;

    .line 1077
    .line 1078
    if-eqz v5, :cond_1f

    .line 1079
    .line 1080
    invoke-virtual {v11}, La/s31;->z()V

    .line 1081
    .line 1082
    .line 1083
    const-string v0, "proxy"

    .line 1084
    .line 1085
    invoke-virtual {v10, v0}, La/s64;->e(Ljava/lang/String;)V

    .line 1086
    .line 1087
    .line 1088
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1092
    .line 1093
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 1094
    .line 1095
    .line 1096
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1097
    .line 1098
    .line 1099
    new-instance v1, Lorg/xplatform/proxy/navigation/ProxySettingsScreen;

    .line 1100
    .line 1101
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 1102
    .line 1103
    .line 1104
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1105
    .line 1106
    if-eqz v3, :cond_1e

    .line 1107
    .line 1108
    new-instance v3, La/e1w0;

    .line 1109
    .line 1110
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1111
    .line 1112
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1113
    .line 1114
    .line 1115
    new-instance v1, La/c8d;

    .line 1116
    .line 1117
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1118
    .line 1119
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1123
    .line 1124
    .line 1125
    goto :goto_f

    .line 1126
    :cond_1e
    new-instance v3, La/w0w0;

    .line 1127
    .line 1128
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1129
    .line 1130
    .line 1131
    new-instance v1, La/c8d;

    .line 1132
    .line 1133
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1134
    .line 1135
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1136
    .line 1137
    .line 1138
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1139
    .line 1140
    .line 1141
    :goto_f
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1142
    .line 1143
    .line 1144
    move-result-object v0

    .line 1145
    :goto_10
    move-object v1, v0

    .line 1146
    check-cast v1, La/paw;

    .line 1147
    .line 1148
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1149
    .line 1150
    .line 1151
    move-result v2

    .line 1152
    if-eqz v2, :cond_32

    .line 1153
    .line 1154
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v1

    .line 1158
    check-cast v1, La/oe50;

    .line 1159
    .line 1160
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1161
    .line 1162
    .line 1163
    goto :goto_10

    .line 1164
    :cond_1f
    instance-of v5, v1, La/v9j0;

    .line 1165
    .line 1166
    if-eqz v5, :cond_20

    .line 1167
    .line 1168
    invoke-virtual {v11}, La/s31;->C()V

    .line 1169
    .line 1170
    .line 1171
    const-string v1, "social_media"

    .line 1172
    .line 1173
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 1174
    .line 1175
    .line 1176
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1177
    .line 1178
    .line 1179
    new-instance v1, La/k0w0;

    .line 1180
    .line 1181
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 1182
    .line 1183
    .line 1184
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->n0:La/gne0;

    .line 1185
    .line 1186
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1187
    .line 1188
    .line 1189
    new-instance v0, Lorg/xplatform/feature/office/social/impl/navigation/SocialScreenFactoryImpl$getSocialNetworksScreen$1;

    .line 1190
    .line 1191
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1195
    .line 1196
    .line 1197
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1198
    .line 1199
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1200
    .line 1201
    .line 1202
    move-result-object v0

    .line 1203
    :goto_11
    move-object v1, v0

    .line 1204
    check-cast v1, La/paw;

    .line 1205
    .line 1206
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1207
    .line 1208
    .line 1209
    move-result v2

    .line 1210
    if-eqz v2, :cond_32

    .line 1211
    .line 1212
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v1

    .line 1216
    check-cast v1, La/oe50;

    .line 1217
    .line 1218
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1219
    .line 1220
    .line 1221
    goto :goto_11

    .line 1222
    :cond_20
    instance-of v5, v1, La/q9j0;

    .line 1223
    .line 1224
    if-eqz v5, :cond_21

    .line 1225
    .line 1226
    sget-object v1, La/v0j0;->a:La/v0j0;

    .line 1227
    .line 1228
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1229
    .line 1230
    .line 1231
    goto/16 :goto_19

    .line 1232
    .line 1233
    :cond_21
    instance-of v5, v1, La/u9j0;

    .line 1234
    .line 1235
    if-eqz v5, :cond_23

    .line 1236
    .line 1237
    invoke-virtual {v9}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1238
    .line 1239
    .line 1240
    move-result-object v1

    .line 1241
    check-cast v1, La/caj0;

    .line 1242
    .line 1243
    iget-boolean v1, v1, La/caj0;->r:Z

    .line 1244
    .line 1245
    if-nez v1, :cond_22

    .line 1246
    .line 1247
    goto/16 :goto_19

    .line 1248
    .line 1249
    :cond_22
    invoke-virtual {v0, v2}, Lorg/xplatform/settings/impl/presentation/a;->y(Z)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v11}, La/s31;->E()V

    .line 1253
    .line 1254
    .line 1255
    const-string v1, "share"

    .line 1256
    .line 1257
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v15

    .line 1264
    iget-object v1, v7, La/mne;->c:La/vs10;

    .line 1265
    .line 1266
    new-instance v2, La/kej0;

    .line 1267
    .line 1268
    const/4 v5, 0x7

    .line 1269
    invoke-direct {v2, v0, v5}, La/kej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 1270
    .line 1271
    .line 1272
    new-instance v5, La/lej0;

    .line 1273
    .line 1274
    invoke-direct {v5, v0, v3}, La/lej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;B)V

    .line 1275
    .line 1276
    .line 1277
    new-instance v3, La/oej0;

    .line 1278
    .line 1279
    invoke-direct {v3, v0, v4, v14}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 1280
    .line 1281
    .line 1282
    const/16 v20, 0x8

    .line 1283
    .line 1284
    move-object/from16 v18, v1

    .line 1285
    .line 1286
    move-object/from16 v16, v2

    .line 1287
    .line 1288
    move-object/from16 v19, v3

    .line 1289
    .line 1290
    move-object/from16 v17, v5

    .line 1291
    .line 1292
    invoke-static/range {v15 .. v20}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1293
    .line 1294
    .line 1295
    goto/16 :goto_19

    .line 1296
    .line 1297
    :cond_23
    instance-of v5, v1, La/t9j0;

    .line 1298
    .line 1299
    if-eqz v5, :cond_24

    .line 1300
    .line 1301
    invoke-virtual {v11}, La/s31;->F()V

    .line 1302
    .line 1303
    .line 1304
    const-string v1, "qr_share"

    .line 1305
    .line 1306
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 1307
    .line 1308
    .line 1309
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1310
    .line 1311
    .line 1312
    new-instance v1, La/k0w0;

    .line 1313
    .line 1314
    invoke-direct {v1, v12}, La/k0w0;-><init>(La/i1w0;)V

    .line 1315
    .line 1316
    .line 1317
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->J:La/gle0;

    .line 1318
    .line 1319
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1320
    .line 1321
    .line 1322
    new-instance v0, Lorg/xplatform/share_app/impl/navigation/ShareAppScreens$ShareAppQrFragmentScreen;

    .line 1323
    .line 1324
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1325
    .line 1326
    .line 1327
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1328
    .line 1329
    .line 1330
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1331
    .line 1332
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v0

    .line 1336
    :goto_12
    move-object v1, v0

    .line 1337
    check-cast v1, La/paw;

    .line 1338
    .line 1339
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1340
    .line 1341
    .line 1342
    move-result v2

    .line 1343
    if-eqz v2, :cond_32

    .line 1344
    .line 1345
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1346
    .line 1347
    .line 1348
    move-result-object v1

    .line 1349
    check-cast v1, La/oe50;

    .line 1350
    .line 1351
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1352
    .line 1353
    .line 1354
    goto :goto_12

    .line 1355
    :cond_24
    instance-of v5, v1, La/r9j0;

    .line 1356
    .line 1357
    if-eqz v5, :cond_25

    .line 1358
    .line 1359
    invoke-static {v12, v12}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1360
    .line 1361
    .line 1362
    move-result-object v1

    .line 1363
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->H0:La/nh70;

    .line 1364
    .line 1365
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1366
    .line 1367
    .line 1368
    new-instance v0, Lorg/xplatform/rate_app/impl/navigation/RateAppDialogFactoryImpl$getRateAppDialog$1;

    .line 1369
    .line 1370
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1374
    .line 1375
    .line 1376
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1377
    .line 1378
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1379
    .line 1380
    .line 1381
    move-result-object v0

    .line 1382
    :goto_13
    move-object v1, v0

    .line 1383
    check-cast v1, La/paw;

    .line 1384
    .line 1385
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1386
    .line 1387
    .line 1388
    move-result v2

    .line 1389
    if-eqz v2, :cond_32

    .line 1390
    .line 1391
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v1

    .line 1395
    check-cast v1, La/oe50;

    .line 1396
    .line 1397
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1398
    .line 1399
    .line 1400
    goto :goto_13

    .line 1401
    :cond_25
    instance-of v5, v1, La/i9j0;

    .line 1402
    .line 1403
    if-eqz v5, :cond_27

    .line 1404
    .line 1405
    invoke-virtual {v11}, La/s31;->v()V

    .line 1406
    .line 1407
    .line 1408
    const-string v1, "getting_started"

    .line 1409
    .line 1410
    invoke-virtual {v10, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 1411
    .line 1412
    .line 1413
    if-eqz v6, :cond_26

    .line 1414
    .line 1415
    goto/16 :goto_19

    .line 1416
    .line 1417
    :cond_26
    invoke-static {v12, v12}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1418
    .line 1419
    .line 1420
    move-result-object v1

    .line 1421
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->N:La/xuz;

    .line 1422
    .line 1423
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1424
    .line 1425
    .line 1426
    new-instance v0, Lorg/xplatform/onboarding_section/impl/navigation/OnboardingScreens$OnboardingSectionsFragmentScreen;

    .line 1427
    .line 1428
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1432
    .line 1433
    .line 1434
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1435
    .line 1436
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1437
    .line 1438
    .line 1439
    move-result-object v0

    .line 1440
    :goto_14
    move-object v1, v0

    .line 1441
    check-cast v1, La/paw;

    .line 1442
    .line 1443
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1444
    .line 1445
    .line 1446
    move-result v2

    .line 1447
    if-eqz v2, :cond_32

    .line 1448
    .line 1449
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v1

    .line 1453
    check-cast v1, La/oe50;

    .line 1454
    .line 1455
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1456
    .line 1457
    .line 1458
    goto :goto_14

    .line 1459
    :cond_27
    instance-of v5, v1, La/w9j0;

    .line 1460
    .line 1461
    if-eqz v5, :cond_29

    .line 1462
    .line 1463
    invoke-static {v12}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v1

    .line 1467
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->S:La/s9m0;

    .line 1468
    .line 1469
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1470
    .line 1471
    .line 1472
    new-instance v0, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$TestSectionScreen;

    .line 1473
    .line 1474
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1475
    .line 1476
    .line 1477
    instance-of v3, v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1478
    .line 1479
    if-eqz v3, :cond_28

    .line 1480
    .line 1481
    new-instance v3, La/e1w0;

    .line 1482
    .line 1483
    check-cast v0, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1484
    .line 1485
    invoke-direct {v3, v0}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1486
    .line 1487
    .line 1488
    new-instance v0, La/c8d;

    .line 1489
    .line 1490
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1491
    .line 1492
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1493
    .line 1494
    .line 1495
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1496
    .line 1497
    .line 1498
    goto :goto_15

    .line 1499
    :cond_28
    new-instance v3, La/w0w0;

    .line 1500
    .line 1501
    invoke-direct {v3, v0}, La/w0w0;-><init>(La/m7h0;)V

    .line 1502
    .line 1503
    .line 1504
    new-instance v0, La/c8d;

    .line 1505
    .line 1506
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1507
    .line 1508
    invoke-direct {v0, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v1, v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1512
    .line 1513
    .line 1514
    :goto_15
    invoke-static {v12, v1, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v0

    .line 1518
    :goto_16
    move-object v1, v0

    .line 1519
    check-cast v1, La/paw;

    .line 1520
    .line 1521
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1522
    .line 1523
    .line 1524
    move-result v2

    .line 1525
    if-eqz v2, :cond_32

    .line 1526
    .line 1527
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v1

    .line 1531
    check-cast v1, La/oe50;

    .line 1532
    .line 1533
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1534
    .line 1535
    .line 1536
    goto :goto_16

    .line 1537
    :cond_29
    instance-of v5, v1, La/tzi0;

    .line 1538
    .line 1539
    if-eqz v5, :cond_2a

    .line 1540
    .line 1541
    invoke-virtual {v0, v3}, Lorg/xplatform/settings/impl/presentation/a;->x(Z)V

    .line 1542
    .line 1543
    .line 1544
    goto/16 :goto_19

    .line 1545
    .line 1546
    :cond_2a
    instance-of v5, v1, La/b9j0;

    .line 1547
    .line 1548
    if-eqz v5, :cond_2b

    .line 1549
    .line 1550
    new-instance v1, La/o0j0;

    .line 1551
    .line 1552
    invoke-direct {v1, v3}, La/o0j0;-><init>(Z)V

    .line 1553
    .line 1554
    .line 1555
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1556
    .line 1557
    .line 1558
    goto/16 :goto_19

    .line 1559
    .line 1560
    :cond_2b
    instance-of v3, v1, La/mv00;

    .line 1561
    .line 1562
    if-eqz v3, :cond_2c

    .line 1563
    .line 1564
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->z0:La/nr;

    .line 1565
    .line 1566
    iget-object v1, v1, La/nr;->b:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v1, La/kt2;

    .line 1569
    .line 1570
    const-string v2, "acc_logout_call"

    .line 1571
    .line 1572
    invoke-interface {v1, v2}, La/kt2;->c(Ljava/lang/String;)V

    .line 1573
    .line 1574
    .line 1575
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->B:La/cmt;

    .line 1576
    .line 1577
    invoke-virtual {v1}, La/cmt;->g()Ljava/lang/String;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v1

    .line 1581
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1582
    .line 1583
    .line 1584
    iget-object v2, v10, La/s64;->a:La/s1p;

    .line 1585
    .line 1586
    new-instance v3, La/j1p;

    .line 1587
    .line 1588
    const/4 v5, 0x2

    .line 1589
    invoke-direct {v3, v1, v5}, La/j1p;-><init>(Ljava/lang/String;B)V

    .line 1590
    .line 1591
    .line 1592
    invoke-static {v3}, La/cui0;->b(Ljava/lang/Object;)Ljava/util/Set;

    .line 1593
    .line 1594
    .line 1595
    move-result-object v1

    .line 1596
    const-wide/16 v5, 0xcb7

    .line 1597
    .line 1598
    invoke-virtual {v2, v1, v5, v6}, La/s1p;->a(Ljava/util/Set;J)V

    .line 1599
    .line 1600
    .line 1601
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v8

    .line 1605
    iget-object v11, v7, La/mne;->a:La/rwj;

    .line 1606
    .line 1607
    sget-object v9, La/dfj0;->a:La/dfj0;

    .line 1608
    .line 1609
    new-instance v12, La/bai0;

    .line 1610
    .line 1611
    const/16 v1, 0xf

    .line 1612
    .line 1613
    sget-object v2, La/e1j0;->a:La/e1j0;

    .line 1614
    .line 1615
    invoke-direct {v12, v0, v2, v4, v1}, La/bai0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 1616
    .line 1617
    .line 1618
    const/16 v13, 0xa

    .line 1619
    .line 1620
    const/4 v10, 0x0

    .line 1621
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1622
    .line 1623
    .line 1624
    goto/16 :goto_19

    .line 1625
    .line 1626
    :cond_2c
    instance-of v3, v1, La/hzi0;

    .line 1627
    .line 1628
    if-eqz v3, :cond_2d

    .line 1629
    .line 1630
    sget-object v1, La/r0j0;->a:La/r0j0;

    .line 1631
    .line 1632
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1633
    .line 1634
    .line 1635
    goto/16 :goto_19

    .line 1636
    .line 1637
    :cond_2d
    instance-of v3, v1, La/c9j0;

    .line 1638
    .line 1639
    if-eqz v3, :cond_2e

    .line 1640
    .line 1641
    invoke-static {v12, v12}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1642
    .line 1643
    .line 1644
    move-result-object v1

    .line 1645
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->p0:La/usd;

    .line 1646
    .line 1647
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1648
    .line 1649
    .line 1650
    new-instance v0, Lorg/xplatform/democonfig/impl/navigation/DemoConfigScreenFactoryImpl$getScannerDemoConfigScreen$1;

    .line 1651
    .line 1652
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1653
    .line 1654
    .line 1655
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1656
    .line 1657
    .line 1658
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1659
    .line 1660
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1661
    .line 1662
    .line 1663
    move-result-object v0

    .line 1664
    :goto_17
    move-object v1, v0

    .line 1665
    check-cast v1, La/paw;

    .line 1666
    .line 1667
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1668
    .line 1669
    .line 1670
    move-result v2

    .line 1671
    if-eqz v2, :cond_32

    .line 1672
    .line 1673
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1674
    .line 1675
    .line 1676
    move-result-object v1

    .line 1677
    check-cast v1, La/oe50;

    .line 1678
    .line 1679
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1680
    .line 1681
    .line 1682
    goto :goto_17

    .line 1683
    :cond_2e
    instance-of v3, v1, La/d9j0;

    .line 1684
    .line 1685
    if-eqz v3, :cond_2f

    .line 1686
    .line 1687
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1688
    .line 1689
    .line 1690
    move-result-object v5

    .line 1691
    new-instance v6, La/uki0;

    .line 1692
    .line 1693
    iget-object v8, v0, Lorg/xplatform/settings/impl/presentation/a;->b:La/rjo;

    .line 1694
    .line 1695
    const/4 v12, 0x0

    .line 1696
    const/16 v13, 0xd

    .line 1697
    .line 1698
    const/4 v7, 0x1

    .line 1699
    const-class v9, La/rjo;

    .line 1700
    .line 1701
    const-string v10, "log"

    .line 1702
    .line 1703
    const-string v11, "log(Ljava/lang/Throwable;)V"

    .line 1704
    .line 1705
    invoke-direct/range {v6 .. v13}, La/uki0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1706
    .line 1707
    .line 1708
    new-instance v9, La/oej0;

    .line 1709
    .line 1710
    const/4 v1, 0x5

    .line 1711
    invoke-direct {v9, v0, v4, v1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 1712
    .line 1713
    .line 1714
    const/16 v10, 0xe

    .line 1715
    .line 1716
    const/4 v7, 0x0

    .line 1717
    const/4 v8, 0x0

    .line 1718
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1719
    .line 1720
    .line 1721
    goto :goto_19

    .line 1722
    :cond_2f
    instance-of v3, v1, La/g4k;

    .line 1723
    .line 1724
    if-eqz v3, :cond_30

    .line 1725
    .line 1726
    sget-object v1, La/y0j0;->a:La/y0j0;

    .line 1727
    .line 1728
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1729
    .line 1730
    .line 1731
    goto :goto_19

    .line 1732
    :cond_30
    instance-of v3, v1, La/x9j0;

    .line 1733
    .line 1734
    if-eqz v3, :cond_31

    .line 1735
    .line 1736
    sget-object v1, La/t0j0;->a:La/t0j0;

    .line 1737
    .line 1738
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1739
    .line 1740
    .line 1741
    goto :goto_19

    .line 1742
    :cond_31
    instance-of v1, v1, La/g9j0;

    .line 1743
    .line 1744
    if-eqz v1, :cond_32

    .line 1745
    .line 1746
    invoke-static {v12, v12}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 1747
    .line 1748
    .line 1749
    move-result-object v1

    .line 1750
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->F0:La/evz;

    .line 1751
    .line 1752
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1753
    .line 1754
    .line 1755
    new-instance v0, Lorg/xplatform/sportgame/markets/display_settings/impl/navigation/MarketsDisplaySettingsScreenFactoryImpl$getScreen$1;

    .line 1756
    .line 1757
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1761
    .line 1762
    .line 1763
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1764
    .line 1765
    invoke-static {v12, v0, v2}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1766
    .line 1767
    .line 1768
    move-result-object v0

    .line 1769
    :goto_18
    move-object v1, v0

    .line 1770
    check-cast v1, La/paw;

    .line 1771
    .line 1772
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1773
    .line 1774
    .line 1775
    move-result v2

    .line 1776
    if-eqz v2, :cond_32

    .line 1777
    .line 1778
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v1

    .line 1782
    check-cast v1, La/oe50;

    .line 1783
    .line 1784
    invoke-virtual {v12, v1}, La/i1w0;->a(La/oe50;)V

    .line 1785
    .line 1786
    .line 1787
    goto :goto_18

    .line 1788
    :cond_32
    :goto_19
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1789
    .line 1790
    return-object v0

    .line 1791
    :pswitch_1
    move-object/from16 v1, p1

    .line 1792
    .line 1793
    check-cast v1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 1794
    .line 1795
    sget-object v3, La/t1j0;->Y1:La/zie0;

    .line 1796
    .line 1797
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 1801
    .line 1802
    .line 1803
    move-result-object v0

    .line 1804
    instance-of v3, v1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Success;

    .line 1805
    .line 1806
    if-eqz v3, :cond_33

    .line 1807
    .line 1808
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v5

    .line 1812
    iget-object v1, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 1813
    .line 1814
    iget-object v8, v1, La/mne;->b:La/dvj;

    .line 1815
    .line 1816
    sget-object v6, La/hfj0;->a:La/hfj0;

    .line 1817
    .line 1818
    new-instance v9, La/oej0;

    .line 1819
    .line 1820
    const/16 v1, 0xd

    .line 1821
    .line 1822
    invoke-direct {v9, v0, v4, v1}, La/oej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;La/yje;B)V

    .line 1823
    .line 1824
    .line 1825
    const/16 v10, 0xa

    .line 1826
    .line 1827
    const/4 v7, 0x0

    .line 1828
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1829
    .line 1830
    .line 1831
    goto :goto_1a

    .line 1832
    :cond_33
    instance-of v3, v1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Error;

    .line 1833
    .line 1834
    if-eqz v3, :cond_34

    .line 1835
    .line 1836
    new-instance v1, La/i1j0;

    .line 1837
    .line 1838
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->q:La/ctf0;

    .line 1839
    .line 1840
    new-array v2, v2, [Ljava/lang/Object;

    .line 1841
    .line 1842
    const v5, 0x7f1301a0

    .line 1843
    .line 1844
    .line 1845
    invoke-virtual {v3, v5, v2}, La/ctf0;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v2

    .line 1849
    invoke-direct {v1, v2}, La/i1j0;-><init>(Ljava/lang/String;)V

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/settings/impl/presentation/a;->G(La/o1j0;La/jej0;)V

    .line 1853
    .line 1854
    .line 1855
    goto :goto_1a

    .line 1856
    :cond_34
    instance-of v0, v1, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType$Canceled;

    .line 1857
    .line 1858
    if-eqz v0, :cond_35

    .line 1859
    .line 1860
    :goto_1a
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1861
    .line 1862
    goto :goto_1b

    .line 1863
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 1864
    .line 1865
    .line 1866
    :goto_1b
    return-object v4

    .line 1867
    :pswitch_2
    move-object/from16 v1, p1

    .line 1868
    .line 1869
    check-cast v1, La/iqt0;

    .line 1870
    .line 1871
    sget-object v2, La/t1j0;->Y1:La/zie0;

    .line 1872
    .line 1873
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1874
    .line 1875
    .line 1876
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    iget-object v0, v0, Lorg/xplatform/settings/impl/presentation/a;->o:La/z4w0;

    .line 1881
    .line 1882
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 1883
    .line 1884
    .line 1885
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1886
    .line 1887
    return-object v0

    .line 1888
    :pswitch_3
    move-object/from16 v1, p1

    .line 1889
    .line 1890
    check-cast v1, Ljava/lang/String;

    .line 1891
    .line 1892
    sget-object v3, La/t1j0;->Y1:La/zie0;

    .line 1893
    .line 1894
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1895
    .line 1896
    .line 1897
    invoke-virtual {v0}, La/t1j0;->I0()Lorg/xplatform/settings/impl/presentation/a;

    .line 1898
    .line 1899
    .line 1900
    move-result-object v0

    .line 1901
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1902
    .line 1903
    .line 1904
    move-result-object v5

    .line 1905
    iget-object v3, v0, Lorg/xplatform/settings/impl/presentation/a;->s:La/mne;

    .line 1906
    .line 1907
    iget-object v8, v3, La/mne;->c:La/vs10;

    .line 1908
    .line 1909
    new-instance v6, La/wvi0;

    .line 1910
    .line 1911
    const/16 v3, 0x19

    .line 1912
    .line 1913
    invoke-direct {v6, v3}, La/wvi0;-><init>(B)V

    .line 1914
    .line 1915
    .line 1916
    new-instance v9, La/sej0;

    .line 1917
    .line 1918
    invoke-direct {v9, v0, v1, v4, v2}, La/sej0;-><init>(Lorg/xplatform/settings/impl/presentation/a;Ljava/lang/String;La/yje;B)V

    .line 1919
    .line 1920
    .line 1921
    const/16 v10, 0xa

    .line 1922
    .line 1923
    const/4 v7, 0x0

    .line 1924
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1925
    .line 1926
    .line 1927
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1928
    .line 1929
    return-object v0

    .line 1930
    nop

    .line 1931
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
