.class public final synthetic La/cym0;
.super La/rer;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/cym0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/cym0;->a:B

    .line 4
    .line 5
    sget-object v2, Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$PositionHandled;->a:Lorg/xplatform/sportgame/subgames/impl/presentation/models/SelectedTabState$PositionHandled;

    .line 6
    .line 7
    const-string v3, "SELECTED_IDS"

    .line 8
    .line 9
    const/4 v4, 0x6

    .line 10
    const/16 v5, 0x15

    .line 11
    .line 12
    const/4 v6, 0x1

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, La/cqs0;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    new-instance v10, La/tps0;

    .line 30
    .line 31
    invoke-direct {v10, v0, v7}, La/tps0;-><init>(La/cqs0;B)V

    .line 32
    .line 33
    .line 34
    new-instance v13, La/meq0;

    .line 35
    .line 36
    invoke-direct {v13, v0, v8, v5}, La/meq0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    const/16 v14, 0xe

    .line 40
    .line 41
    const/4 v11, 0x0

    .line 42
    const/4 v12, 0x0

    .line 43
    invoke-static/range {v9 .. v14}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_0
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 52
    .line 53
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 57
    .line 58
    return-object v0

    .line 59
    :pswitch_1
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/njr0;

    .line 62
    .line 63
    iget-object v0, v0, La/njr0;->I:La/ol60;

    .line 64
    .line 65
    sget-object v1, La/vir0;->a:La/vir0;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_2
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v0, La/njr0;

    .line 76
    .line 77
    iget-object v1, v0, La/njr0;->i:La/ctu;

    .line 78
    .line 79
    iget-object v1, v1, La/ctu;->a:La/rkr0;

    .line 80
    .line 81
    invoke-interface {v1}, La/rkr0;->r()La/lmr0;

    .line 82
    .line 83
    .line 84
    move-result-object v1

    .line 85
    iget-object v1, v1, La/lmr0;->c:La/ulr0;

    .line 86
    .line 87
    sget-object v2, La/ulr0;->c:La/ulr0;

    .line 88
    .line 89
    if-ne v1, v2, :cond_0

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_0
    iget-object v1, v0, La/njr0;->c:La/i1w0;

    .line 93
    .line 94
    new-instance v2, La/rir0;

    .line 95
    .line 96
    invoke-direct {v2, v0, v6}, La/rir0;-><init>(La/njr0;B)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 100
    .line 101
    .line 102
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 103
    .line 104
    return-object v0

    .line 105
    :pswitch_3
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/njr0;

    .line 108
    .line 109
    iget-object v1, v0, La/njr0;->G:La/p7m0;

    .line 110
    .line 111
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, La/cjr0;

    .line 116
    .line 117
    iget-object v1, v1, La/cjr0;->b:La/ijr0;

    .line 118
    .line 119
    instance-of v1, v1, La/hjr0;

    .line 120
    .line 121
    if-nez v1, :cond_1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_1
    iget-object v1, v0, La/njr0;->k:La/g2v;

    .line 125
    .line 126
    iget-object v1, v1, La/g2v;->a:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v1, La/rkr0;

    .line 129
    .line 130
    invoke-interface {v1}, La/rkr0;->s()Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-interface {v1}, Ljava/util/Map;->size()I

    .line 135
    .line 136
    .line 137
    move-result v1

    .line 138
    if-nez v1, :cond_2

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_2
    iget-object v0, v0, La/njr0;->I:La/ol60;

    .line 142
    .line 143
    sget-object v1, La/wir0;->a:La/wir0;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, La/ol60;->f(Ljava/lang/Object;)V

    .line 146
    .line 147
    .line 148
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 149
    .line 150
    return-object v0

    .line 151
    :pswitch_4
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 152
    .line 153
    check-cast v0, La/njr0;

    .line 154
    .line 155
    invoke-virtual {v0}, La/njr0;->x()V

    .line 156
    .line 157
    .line 158
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 159
    .line 160
    return-object v0

    .line 161
    :pswitch_5
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 162
    .line 163
    move-object v11, v0

    .line 164
    check-cast v11, La/njr0;

    .line 165
    .line 166
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object v1, v11, La/njr0;->b:La/mne;

    .line 174
    .line 175
    iget-object v3, v1, La/mne;->b:La/dvj;

    .line 176
    .line 177
    new-instance v1, La/ddr0;

    .line 178
    .line 179
    const/4 v15, 0x0

    .line 180
    const/16 v16, 0x1c

    .line 181
    .line 182
    const/4 v10, 0x1

    .line 183
    const-class v12, La/njr0;

    .line 184
    .line 185
    const-string v13, "handleMakeBetError"

    .line 186
    .line 187
    const-string v14, "handleMakeBetError(Ljava/lang/Throwable;)V"

    .line 188
    .line 189
    move-object v9, v1

    .line 190
    invoke-direct/range {v9 .. v16}, La/ddr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 191
    .line 192
    .line 193
    new-instance v4, La/kjr0;

    .line 194
    .line 195
    const/4 v2, 0x4

    .line 196
    invoke-direct {v4, v11, v8, v2}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 197
    .line 198
    .line 199
    const/16 v5, 0xa

    .line 200
    .line 201
    const/4 v2, 0x0

    .line 202
    invoke-static/range {v0 .. v5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 203
    .line 204
    .line 205
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 206
    .line 207
    return-object v0

    .line 208
    :pswitch_6
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 209
    .line 210
    move-object v11, v0

    .line 211
    check-cast v11, La/njr0;

    .line 212
    .line 213
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    invoke-static {v11}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    iget-object v1, v11, La/njr0;->b:La/mne;

    .line 221
    .line 222
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 223
    .line 224
    new-instance v9, La/mjr0;

    .line 225
    .line 226
    const/4 v15, 0x0

    .line 227
    const/16 v16, 0x0

    .line 228
    .line 229
    const/4 v10, 0x1

    .line 230
    const-class v12, La/njr0;

    .line 231
    .line 232
    const-string v13, "handleDataLoadError"

    .line 233
    .line 234
    const-string v14, "handleDataLoadError(Ljava/lang/Throwable;)V"

    .line 235
    .line 236
    invoke-direct/range {v9 .. v16}, La/mjr0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 237
    .line 238
    .line 239
    new-instance v2, La/kjr0;

    .line 240
    .line 241
    invoke-direct {v2, v11, v8, v4}, La/kjr0;-><init>(La/njr0;La/yje;B)V

    .line 242
    .line 243
    .line 244
    const/16 v17, 0xa

    .line 245
    .line 246
    const/4 v14, 0x0

    .line 247
    move-object v12, v0

    .line 248
    move-object v15, v1

    .line 249
    move-object/from16 v16, v2

    .line 250
    .line 251
    move-object v13, v9

    .line 252
    invoke-static/range {v12 .. v17}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 253
    .line 254
    .line 255
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 256
    .line 257
    return-object v0

    .line 258
    :pswitch_7
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 259
    .line 260
    check-cast v0, La/njr0;

    .line 261
    .line 262
    iget-object v1, v0, La/njr0;->G:La/p7m0;

    .line 263
    .line 264
    :cond_3
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 265
    .line 266
    .line 267
    move-result-object v0

    .line 268
    move-object v2, v0

    .line 269
    check-cast v2, La/cjr0;

    .line 270
    .line 271
    iget-object v3, v2, La/cjr0;->a:La/jjr0;

    .line 272
    .line 273
    invoke-static {v3, v8, v4}, La/jjr0;->a(La/jjr0;La/mtr0;I)La/jjr0;

    .line 274
    .line 275
    .line 276
    move-result-object v3

    .line 277
    invoke-static {v2, v3, v8, v7, v4}, La/cjr0;->a(La/cjr0;La/jjr0;La/ijr0;ZI)La/cjr0;

    .line 278
    .line 279
    .line 280
    move-result-object v2

    .line 281
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-eqz v0, :cond_3

    .line 286
    .line 287
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 288
    .line 289
    return-object v0

    .line 290
    :pswitch_8
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 291
    .line 292
    check-cast v0, La/njr0;

    .line 293
    .line 294
    iget-object v1, v0, La/njr0;->G:La/p7m0;

    .line 295
    .line 296
    :cond_4
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    move-object v2, v0

    .line 301
    check-cast v2, La/cjr0;

    .line 302
    .line 303
    const/4 v3, 0x3

    .line 304
    invoke-static {v2, v8, v8, v7, v3}, La/cjr0;->a(La/cjr0;La/jjr0;La/ijr0;ZI)La/cjr0;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 309
    .line 310
    .line 311
    move-result v0

    .line 312
    if-eqz v0, :cond_4

    .line 313
    .line 314
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 315
    .line 316
    return-object v0

    .line 317
    :pswitch_9
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 318
    .line 319
    check-cast v0, La/njr0;

    .line 320
    .line 321
    iget-object v1, v0, La/njr0;->H:La/p7m0;

    .line 322
    .line 323
    const-wide/16 v2, 0x2710

    .line 324
    .line 325
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    invoke-virtual {v0, v6}, La/njr0;->A(Z)V

    .line 336
    .line 337
    .line 338
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 339
    .line 340
    return-object v0

    .line 341
    :pswitch_a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 342
    .line 343
    check-cast v0, La/udr0;

    .line 344
    .line 345
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    return-object v0

    .line 350
    :pswitch_b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 351
    .line 352
    check-cast v0, La/q7r0;

    .line 353
    .line 354
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 355
    .line 356
    .line 357
    move-result-object v0

    .line 358
    return-object v0

    .line 359
    :pswitch_c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 360
    .line 361
    check-cast v0, La/xtq0;

    .line 362
    .line 363
    iget-object v1, v0, La/xtq0;->C0:La/ol60;

    .line 364
    .line 365
    new-instance v2, La/gtq0;

    .line 366
    .line 367
    iget-object v3, v0, La/xtq0;->Z:La/z7z;

    .line 368
    .line 369
    invoke-interface {v3}, La/z7z;->get()Ljava/lang/Object;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    check-cast v3, La/smu;

    .line 374
    .line 375
    invoke-virtual {v3}, La/smu;->a()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v3

    .line 379
    iget-object v0, v0, La/xtq0;->a0:La/z7z;

    .line 380
    .line 381
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    check-cast v0, La/rmu;

    .line 386
    .line 387
    invoke-virtual {v0}, La/rmu;->a()Ljava/lang/String;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    invoke-direct {v2, v3, v0}, La/gtq0;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v1, v2}, La/ol60;->f(Ljava/lang/Object;)V

    .line 395
    .line 396
    .line 397
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 398
    .line 399
    return-object v0

    .line 400
    :pswitch_d
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 401
    .line 402
    check-cast v0, La/fhq0;

    .line 403
    .line 404
    sget-object v1, La/fhq0;->q2:La/m6m0;

    .line 405
    .line 406
    iget-object v1, v0, La/fhq0;->o2:Lkotlin/Pair;

    .line 407
    .line 408
    iget-object v2, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v2, La/ynq0;

    .line 411
    .line 412
    iget-wide v2, v2, La/ynq0;->a:J

    .line 413
    .line 414
    const-wide/16 v4, -0x1

    .line 415
    .line 416
    cmp-long v2, v2, v4

    .line 417
    .line 418
    if-eqz v2, :cond_5

    .line 419
    .line 420
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 421
    .line 422
    check-cast v1, La/ynq0;

    .line 423
    .line 424
    iget-wide v1, v1, La/ynq0;->a:J

    .line 425
    .line 426
    cmp-long v1, v1, v4

    .line 427
    .line 428
    if-eqz v1, :cond_5

    .line 429
    .line 430
    sget-object v1, La/ygq0;->p:La/ygq0;

    .line 431
    .line 432
    invoke-virtual {v0, v1}, La/fhq0;->T0(La/ygq0;)V

    .line 433
    .line 434
    .line 435
    goto :goto_2

    .line 436
    :cond_5
    invoke-virtual {v0}, La/fhq0;->U0()V

    .line 437
    .line 438
    .line 439
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 440
    .line 441
    return-object v0

    .line 442
    :pswitch_e
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 443
    .line 444
    check-cast v0, La/fhq0;

    .line 445
    .line 446
    sget-object v1, La/fhq0;->q2:La/m6m0;

    .line 447
    .line 448
    invoke-virtual {v0}, La/fhq0;->U0()V

    .line 449
    .line 450
    .line 451
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 452
    .line 453
    return-object v0

    .line 454
    :pswitch_f
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 455
    .line 456
    check-cast v0, La/fhq0;

    .line 457
    .line 458
    sget-object v1, La/fhq0;->q2:La/m6m0;

    .line 459
    .line 460
    invoke-virtual {v0}, La/fhq0;->U0()V

    .line 461
    .line 462
    .line 463
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 464
    .line 465
    return-object v0

    .line 466
    :pswitch_10
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v0, La/urp0;

    .line 469
    .line 470
    iget-object v1, v0, La/urp0;->s:La/xae0;

    .line 471
    .line 472
    iget-object v1, v1, La/xae0;->a:La/n7m0;

    .line 473
    .line 474
    invoke-interface {v1}, La/n7m0;->getValue()Ljava/lang/Object;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    check-cast v1, La/erp0;

    .line 479
    .line 480
    instance-of v1, v1, La/drp0;

    .line 481
    .line 482
    if-eqz v1, :cond_6

    .line 483
    .line 484
    invoke-virtual {v0}, La/urp0;->y()V

    .line 485
    .line 486
    .line 487
    :cond_6
    iget-object v1, v0, La/urp0;->p:La/p7m0;

    .line 488
    .line 489
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 490
    .line 491
    .line 492
    sget-object v2, La/orp0;->a:La/orp0;

    .line 493
    .line 494
    invoke-virtual {v1, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    invoke-virtual {v0}, La/urp0;->z()V

    .line 498
    .line 499
    .line 500
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 501
    .line 502
    return-object v0

    .line 503
    :pswitch_11
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 504
    .line 505
    check-cast v0, La/urp0;

    .line 506
    .line 507
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    sget-object v1, La/j1i0;->b:La/j1i0;

    .line 511
    .line 512
    sget-object v2, La/iun;->a:La/iun;

    .line 513
    .line 514
    invoke-virtual {v0, v1, v2}, La/urp0;->A(La/j1i0;Ljava/util/List;)V

    .line 515
    .line 516
    .line 517
    new-instance v1, La/crp0;

    .line 518
    .line 519
    iget-object v2, v0, La/urp0;->r:Ljava/util/List;

    .line 520
    .line 521
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->P0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 522
    .line 523
    .line 524
    move-result-object v2

    .line 525
    invoke-direct {v1, v2}, La/crp0;-><init>(Ljava/util/Set;)V

    .line 526
    .line 527
    .line 528
    iget-object v0, v0, La/urp0;->b:La/vzg0;

    .line 529
    .line 530
    invoke-virtual {v0, v3, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 534
    .line 535
    return-object v0

    .line 536
    :pswitch_12
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 537
    .line 538
    check-cast v0, La/urp0;

    .line 539
    .line 540
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    sget-object v1, La/j1i0;->c:La/j1i0;

    .line 544
    .line 545
    sget-object v2, La/iun;->a:La/iun;

    .line 546
    .line 547
    invoke-virtual {v0, v1, v2}, La/urp0;->A(La/j1i0;Ljava/util/List;)V

    .line 548
    .line 549
    .line 550
    new-instance v1, La/crp0;

    .line 551
    .line 552
    sget-object v2, La/xun;->a:La/xun;

    .line 553
    .line 554
    invoke-direct {v1, v2}, La/crp0;-><init>(Ljava/util/Set;)V

    .line 555
    .line 556
    .line 557
    iget-object v0, v0, La/urp0;->b:La/vzg0;

    .line 558
    .line 559
    invoke-virtual {v0, v3, v1}, La/vzg0;->e(Ljava/lang/String;Ljava/lang/Object;)V

    .line 560
    .line 561
    .line 562
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 563
    .line 564
    return-object v0

    .line 565
    :pswitch_13
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 566
    .line 567
    check-cast v0, Lkotlin/jvm/functions/Function0;

    .line 568
    .line 569
    invoke-interface {v0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 570
    .line 571
    .line 572
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 573
    .line 574
    return-object v0

    .line 575
    :pswitch_14
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 576
    .line 577
    check-cast v0, La/dk5;

    .line 578
    .line 579
    invoke-virtual {v0}, La/dk5;->N()V

    .line 580
    .line 581
    .line 582
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 583
    .line 584
    return-object v0

    .line 585
    :pswitch_15
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 586
    .line 587
    check-cast v0, La/dk5;

    .line 588
    .line 589
    invoke-virtual {v0}, La/dk5;->O()V

    .line 590
    .line 591
    .line 592
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 593
    .line 594
    return-object v0

    .line 595
    :pswitch_16
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 596
    .line 597
    check-cast v0, La/dk5;

    .line 598
    .line 599
    invoke-virtual {v0}, La/dk5;->N()V

    .line 600
    .line 601
    .line 602
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 603
    .line 604
    return-object v0

    .line 605
    :pswitch_17
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 606
    .line 607
    check-cast v0, La/dk5;

    .line 608
    .line 609
    invoke-virtual {v0}, La/dk5;->O()V

    .line 610
    .line 611
    .line 612
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 613
    .line 614
    return-object v0

    .line 615
    :pswitch_18
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v0, La/dk5;

    .line 618
    .line 619
    invoke-virtual {v0}, La/dk5;->a()V

    .line 620
    .line 621
    .line 622
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 623
    .line 624
    return-object v0

    .line 625
    :pswitch_19
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 626
    .line 627
    check-cast v0, La/nfo0;

    .line 628
    .line 629
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->p0()Landroidx/fragment/app/Fragment;

    .line 630
    .line 631
    .line 632
    move-result-object v0

    .line 633
    return-object v0

    .line 634
    :pswitch_1a
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 635
    .line 636
    check-cast v0, La/zyn0;

    .line 637
    .line 638
    new-instance v1, La/acm0;

    .line 639
    .line 640
    invoke-direct {v1, v5}, La/acm0;-><init>(B)V

    .line 641
    .line 642
    .line 643
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 644
    .line 645
    .line 646
    invoke-virtual {v0}, La/zyn0;->T()V

    .line 647
    .line 648
    .line 649
    new-instance v1, La/acm0;

    .line 650
    .line 651
    const/16 v2, 0x16

    .line 652
    .line 653
    invoke-direct {v1, v2}, La/acm0;-><init>(B)V

    .line 654
    .line 655
    .line 656
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 657
    .line 658
    .line 659
    invoke-virtual {v0}, La/zyn0;->Q()V

    .line 660
    .line 661
    .line 662
    invoke-virtual {v0, v6}, La/zyn0;->P(Z)V

    .line 663
    .line 664
    .line 665
    invoke-virtual {v0}, La/zyn0;->V()V

    .line 666
    .line 667
    .line 668
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 669
    .line 670
    return-object v0

    .line 671
    :pswitch_1b
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 672
    .line 673
    check-cast v0, La/dzm0;

    .line 674
    .line 675
    iget-object v0, v0, La/dzm0;->m:La/p7m0;

    .line 676
    .line 677
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    invoke-virtual {v0, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 681
    .line 682
    .line 683
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 684
    .line 685
    return-object v0

    .line 686
    :pswitch_1c
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 687
    .line 688
    check-cast v0, La/dzm0;

    .line 689
    .line 690
    iget-object v0, v0, La/dzm0;->m:La/p7m0;

    .line 691
    .line 692
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    invoke-virtual {v0, v8, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 696
    .line 697
    .line 698
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 699
    .line 700
    return-object v0

    .line 701
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
