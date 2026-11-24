.class public final synthetic La/g0p0;
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
    iput-byte p7, p0, La/g0p0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/g0p0;->a:B

    .line 4
    .line 5
    const-string v2, "snackbarManager"

    .line 6
    .line 7
    const v3, 0x7f1304d8

    .line 8
    .line 9
    .line 10
    const v4, 0x7f13046c

    .line 11
    .line 12
    .line 13
    const/4 v5, 0x2

    .line 14
    const/16 v6, 0x1a

    .line 15
    .line 16
    const v7, 0x7f13032f

    .line 17
    .line 18
    .line 19
    const/4 v8, 0x1

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    move-object/from16 v1, p1

    .line 26
    .line 27
    check-cast v1, Lkotlin/jvm/functions/Function1;

    .line 28
    .line 29
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast v0, La/s4q0;

    .line 32
    .line 33
    iget-object v0, v0, La/s4q0;->b:La/vy40;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/vy40;->a(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object v0

    .line 41
    :pswitch_0
    move-object/from16 v1, p1

    .line 42
    .line 43
    check-cast v1, La/ne60;

    .line 44
    .line 45
    iget-wide v4, v1, La/ne60;->a:J

    .line 46
    .line 47
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 48
    .line 49
    move-object v3, v0

    .line 50
    check-cast v3, La/z4q0;

    .line 51
    .line 52
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object v0, La/e5q0;->a:La/zfn;

    .line 56
    .line 57
    invoke-static {v3, v0}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    move-object v6, v0

    .line 62
    check-cast v6, La/d5q0;

    .line 63
    .line 64
    if-nez v6, :cond_0

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_0
    new-instance v7, La/y4q0;

    .line 68
    .line 69
    invoke-direct {v7, v3, v4, v5}, La/y4q0;-><init>(La/z4q0;J)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v3}, La/lm40;->N0()La/vne;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    new-instance v2, La/n1;

    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    invoke-direct/range {v2 .. v8}, La/n1;-><init>(La/z4q0;JLa/d5q0;La/y4q0;La/yje;)V

    .line 80
    .line 81
    .line 82
    const/4 v1, 0x3

    .line 83
    invoke-static {v0, v10, v10, v2, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 84
    .line 85
    .line 86
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 87
    .line 88
    return-object v0

    .line 89
    :pswitch_1
    move-object/from16 v1, p1

    .line 90
    .line 91
    check-cast v1, Ljava/lang/Throwable;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, La/d4q0;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 104
    .line 105
    .line 106
    new-instance v1, La/zgp0;

    .line 107
    .line 108
    const/16 v2, 0x14

    .line 109
    .line 110
    invoke-direct {v1, v2}, La/zgp0;-><init>(B)V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_2
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, La/g3q0;

    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v0, La/k3t0;

    .line 129
    .line 130
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 131
    .line 132
    .line 133
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 134
    .line 135
    return-object v0

    .line 136
    :pswitch_3
    move-object/from16 v1, p1

    .line 137
    .line 138
    check-cast v1, Ljava/lang/Throwable;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, La/rjo;

    .line 146
    .line 147
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 148
    .line 149
    .line 150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_4
    move-object/from16 v1, p1

    .line 154
    .line 155
    check-cast v1, La/s1q0;

    .line 156
    .line 157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v0, La/x1q0;

    .line 163
    .line 164
    iget-object v2, v0, La/x1q0;->l:La/i1w0;

    .line 165
    .line 166
    instance-of v3, v1, La/bvq0;

    .line 167
    .line 168
    if-eqz v3, :cond_1

    .line 169
    .line 170
    check-cast v1, La/bvq0;

    .line 171
    .line 172
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    new-instance v3, La/meo0;

    .line 177
    .line 178
    const/16 v4, 0x18

    .line 179
    .line 180
    invoke-direct {v3, v4}, La/meo0;-><init>(B)V

    .line 181
    .line 182
    .line 183
    new-instance v6, La/ssl0;

    .line 184
    .line 185
    const/16 v4, 0x15

    .line 186
    .line 187
    invoke-direct {v6, v0, v1, v10, v4}, La/ssl0;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 188
    .line 189
    .line 190
    const/16 v7, 0xe

    .line 191
    .line 192
    const/4 v4, 0x0

    .line 193
    const/4 v5, 0x0

    .line 194
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 195
    .line 196
    .line 197
    goto/16 :goto_1e

    .line 198
    .line 199
    :cond_1
    instance-of v3, v1, La/ff9;

    .line 200
    .line 201
    if-eqz v3, :cond_9

    .line 202
    .line 203
    check-cast v1, La/ff9;

    .line 204
    .line 205
    instance-of v3, v1, La/ze9;

    .line 206
    .line 207
    if-eqz v3, :cond_2

    .line 208
    .line 209
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 210
    .line 211
    .line 212
    move-result-object v11

    .line 213
    new-instance v12, La/meo0;

    .line 214
    .line 215
    invoke-direct {v12, v6}, La/meo0;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance v15, La/t1q0;

    .line 219
    .line 220
    invoke-direct {v15, v0, v10, v9}, La/t1q0;-><init>(La/x1q0;La/yje;B)V

    .line 221
    .line 222
    .line 223
    const/16 v16, 0xe

    .line 224
    .line 225
    const/4 v13, 0x0

    .line 226
    const/4 v14, 0x0

    .line 227
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 228
    .line 229
    .line 230
    goto/16 :goto_1e

    .line 231
    .line 232
    :cond_2
    instance-of v3, v1, La/af9;

    .line 233
    .line 234
    if-eqz v3, :cond_3

    .line 235
    .line 236
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 237
    .line 238
    .line 239
    move-result-object v11

    .line 240
    new-instance v12, La/meo0;

    .line 241
    .line 242
    const/16 v1, 0x1b

    .line 243
    .line 244
    invoke-direct {v12, v1}, La/meo0;-><init>(B)V

    .line 245
    .line 246
    .line 247
    new-instance v15, La/w1q0;

    .line 248
    .line 249
    invoke-direct {v15, v0, v10, v8}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 250
    .line 251
    .line 252
    const/16 v16, 0xe

    .line 253
    .line 254
    const/4 v13, 0x0

    .line 255
    const/4 v14, 0x0

    .line 256
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 257
    .line 258
    .line 259
    goto/16 :goto_1e

    .line 260
    .line 261
    :cond_3
    instance-of v3, v1, La/bf9;

    .line 262
    .line 263
    if-eqz v3, :cond_4

    .line 264
    .line 265
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 266
    .line 267
    .line 268
    move-result-object v11

    .line 269
    new-instance v12, La/meo0;

    .line 270
    .line 271
    const/16 v1, 0x1c

    .line 272
    .line 273
    invoke-direct {v12, v1}, La/meo0;-><init>(B)V

    .line 274
    .line 275
    .line 276
    new-instance v15, La/t1q0;

    .line 277
    .line 278
    invoke-direct {v15, v0, v10, v8}, La/t1q0;-><init>(La/x1q0;La/yje;B)V

    .line 279
    .line 280
    .line 281
    const/16 v16, 0xe

    .line 282
    .line 283
    const/4 v13, 0x0

    .line 284
    const/4 v14, 0x0

    .line 285
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 286
    .line 287
    .line 288
    goto/16 :goto_1e

    .line 289
    .line 290
    :cond_4
    instance-of v3, v1, La/cf9;

    .line 291
    .line 292
    if-eqz v3, :cond_5

    .line 293
    .line 294
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 295
    .line 296
    .line 297
    move-result-object v11

    .line 298
    new-instance v12, La/meo0;

    .line 299
    .line 300
    const/16 v1, 0x19

    .line 301
    .line 302
    invoke-direct {v12, v1}, La/meo0;-><init>(B)V

    .line 303
    .line 304
    .line 305
    new-instance v15, La/w1q0;

    .line 306
    .line 307
    invoke-direct {v15, v0, v10, v9}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 308
    .line 309
    .line 310
    const/16 v16, 0xe

    .line 311
    .line 312
    const/4 v13, 0x0

    .line 313
    const/4 v14, 0x0

    .line 314
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 315
    .line 316
    .line 317
    goto/16 :goto_1e

    .line 318
    .line 319
    :cond_5
    instance-of v3, v1, La/df9;

    .line 320
    .line 321
    if-eqz v3, :cond_6

    .line 322
    .line 323
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 324
    .line 325
    .line 326
    move-result-object v11

    .line 327
    new-instance v12, La/g0p0;

    .line 328
    .line 329
    iget-object v14, v0, La/x1q0;->c:La/rjo;

    .line 330
    .line 331
    const/16 v18, 0x0

    .line 332
    .line 333
    const/16 v19, 0x19

    .line 334
    .line 335
    const/4 v13, 0x1

    .line 336
    const-class v15, La/rjo;

    .line 337
    .line 338
    const-string v16, "log"

    .line 339
    .line 340
    const-string v17, "log(Ljava/lang/Throwable;)V"

    .line 341
    .line 342
    invoke-direct/range {v12 .. v19}, La/g0p0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 343
    .line 344
    .line 345
    new-instance v15, La/w1q0;

    .line 346
    .line 347
    invoke-direct {v15, v0, v10, v5}, La/w1q0;-><init>(La/x1q0;La/yje;B)V

    .line 348
    .line 349
    .line 350
    const/16 v16, 0xe

    .line 351
    .line 352
    const/4 v13, 0x0

    .line 353
    const/4 v14, 0x0

    .line 354
    invoke-static/range {v11 .. v16}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 355
    .line 356
    .line 357
    goto/16 :goto_1e

    .line 358
    .line 359
    :cond_6
    instance-of v3, v1, La/ef9;

    .line 360
    .line 361
    if-eqz v3, :cond_7

    .line 362
    .line 363
    invoke-static {v2, v2}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 364
    .line 365
    .line 366
    move-result-object v1

    .line 367
    iget-object v0, v0, La/x1q0;->f:La/ilp0;

    .line 368
    .line 369
    iget-object v0, v0, La/ilp0;->a:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v0, La/es;

    .line 372
    .line 373
    invoke-virtual {v0}, La/es;->k()La/drm0;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-static {v0}, La/drm0;->e(La/drm0;)Lorg/xplatform/verification/status/impl/navigation/VerificationStatusScreens$VerificationStatusFragmentScreen;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v1, v0}, La/k0w0;->m(Lcom/github/terrakok/cicerone/androidx/FragmentScreen;)La/ikt0;

    .line 382
    .line 383
    .line 384
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 385
    .line 386
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    :goto_1
    move-object v1, v0

    .line 391
    check-cast v1, La/paw;

    .line 392
    .line 393
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 394
    .line 395
    .line 396
    move-result v3

    .line 397
    if-eqz v3, :cond_24

    .line 398
    .line 399
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object v1

    .line 403
    check-cast v1, La/oe50;

    .line 404
    .line 405
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 406
    .line 407
    .line 408
    goto :goto_1

    .line 409
    :cond_7
    instance-of v1, v1, La/ye9;

    .line 410
    .line 411
    if-eqz v1, :cond_8

    .line 412
    .line 413
    invoke-static {v2, v2}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    iget-object v0, v0, La/x1q0;->p:La/kj5;

    .line 418
    .line 419
    sget-object v3, La/kkd0;->b:La/kkd0;

    .line 420
    .line 421
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    .line 423
    .line 424
    new-instance v0, Lorg/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen;

    .line 425
    .line 426
    invoke-direct {v0}, Lorg/xplatform/camera/impl/navigation/CameraScreens$CameraFragmentScreen;-><init>()V

    .line 427
    .line 428
    .line 429
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 430
    .line 431
    .line 432
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 433
    .line 434
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 435
    .line 436
    .line 437
    move-result-object v0

    .line 438
    :goto_2
    move-object v1, v0

    .line 439
    check-cast v1, La/paw;

    .line 440
    .line 441
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 442
    .line 443
    .line 444
    move-result v3

    .line 445
    if-eqz v3, :cond_24

    .line 446
    .line 447
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 448
    .line 449
    .line 450
    move-result-object v1

    .line 451
    check-cast v1, La/oe50;

    .line 452
    .line 453
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 454
    .line 455
    .line 456
    goto :goto_2

    .line 457
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 458
    .line 459
    .line 460
    goto/16 :goto_1f

    .line 461
    .line 462
    :cond_9
    instance-of v3, v1, La/bsq0;

    .line 463
    .line 464
    if-eqz v3, :cond_a

    .line 465
    .line 466
    invoke-static {v2, v2}, La/cs0;->i(La/i1w0;La/i1w0;)La/k0w0;

    .line 467
    .line 468
    .line 469
    move-result-object v1

    .line 470
    iget-object v0, v0, La/x1q0;->n:La/s9m0;

    .line 471
    .line 472
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    new-instance v0, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$ClientConfigScreen;

    .line 476
    .line 477
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 478
    .line 479
    .line 480
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 481
    .line 482
    .line 483
    iget-object v0, v1, La/k0w0;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 484
    .line 485
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    :goto_3
    move-object v1, v0

    .line 490
    check-cast v1, La/paw;

    .line 491
    .line 492
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 493
    .line 494
    .line 495
    move-result v3

    .line 496
    if-eqz v3, :cond_24

    .line 497
    .line 498
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 499
    .line 500
    .line 501
    move-result-object v1

    .line 502
    check-cast v1, La/oe50;

    .line 503
    .line 504
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 505
    .line 506
    .line 507
    goto :goto_3

    .line 508
    :cond_a
    instance-of v0, v1, La/hsq0;

    .line 509
    .line 510
    if-eqz v0, :cond_c

    .line 511
    .line 512
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 513
    .line 514
    .line 515
    move-result-object v0

    .line 516
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$ModuleInfoScreen;

    .line 517
    .line 518
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 519
    .line 520
    .line 521
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 522
    .line 523
    if-eqz v3, :cond_b

    .line 524
    .line 525
    new-instance v3, La/e1w0;

    .line 526
    .line 527
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 528
    .line 529
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 530
    .line 531
    .line 532
    new-instance v1, La/c8d;

    .line 533
    .line 534
    sget-object v4, La/y7d;->a:La/v7d;

    .line 535
    .line 536
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 537
    .line 538
    .line 539
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    goto :goto_4

    .line 543
    :cond_b
    new-instance v3, La/w0w0;

    .line 544
    .line 545
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 546
    .line 547
    .line 548
    new-instance v1, La/c8d;

    .line 549
    .line 550
    sget-object v4, La/y7d;->a:La/v7d;

    .line 551
    .line 552
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 556
    .line 557
    .line 558
    :goto_4
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 559
    .line 560
    .line 561
    move-result-object v0

    .line 562
    :goto_5
    move-object v1, v0

    .line 563
    check-cast v1, La/paw;

    .line 564
    .line 565
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 566
    .line 567
    .line 568
    move-result v3

    .line 569
    if-eqz v3, :cond_24

    .line 570
    .line 571
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 572
    .line 573
    .line 574
    move-result-object v1

    .line 575
    check-cast v1, La/oe50;

    .line 576
    .line 577
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 578
    .line 579
    .line 580
    goto :goto_5

    .line 581
    :cond_c
    instance-of v0, v1, La/ksq0;

    .line 582
    .line 583
    if-eqz v0, :cond_e

    .line 584
    .line 585
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 586
    .line 587
    .line 588
    move-result-object v0

    .line 589
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$RemoteConfigTestScreen;

    .line 590
    .line 591
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 592
    .line 593
    .line 594
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 595
    .line 596
    if-eqz v3, :cond_d

    .line 597
    .line 598
    new-instance v3, La/e1w0;

    .line 599
    .line 600
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 601
    .line 602
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 603
    .line 604
    .line 605
    new-instance v1, La/c8d;

    .line 606
    .line 607
    sget-object v4, La/y7d;->a:La/v7d;

    .line 608
    .line 609
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 613
    .line 614
    .line 615
    goto :goto_6

    .line 616
    :cond_d
    new-instance v3, La/w0w0;

    .line 617
    .line 618
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 619
    .line 620
    .line 621
    new-instance v1, La/c8d;

    .line 622
    .line 623
    sget-object v4, La/y7d;->a:La/v7d;

    .line 624
    .line 625
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 626
    .line 627
    .line 628
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 629
    .line 630
    .line 631
    :goto_6
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 632
    .line 633
    .line 634
    move-result-object v0

    .line 635
    :goto_7
    move-object v1, v0

    .line 636
    check-cast v1, La/paw;

    .line 637
    .line 638
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 639
    .line 640
    .line 641
    move-result v3

    .line 642
    if-eqz v3, :cond_24

    .line 643
    .line 644
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 645
    .line 646
    .line 647
    move-result-object v1

    .line 648
    check-cast v1, La/oe50;

    .line 649
    .line 650
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 651
    .line 652
    .line 653
    goto :goto_7

    .line 654
    :cond_e
    instance-of v0, v1, La/yrq0;

    .line 655
    .line 656
    if-eqz v0, :cond_10

    .line 657
    .line 658
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$AuthorizationCredsScreen;

    .line 663
    .line 664
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 665
    .line 666
    .line 667
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 668
    .line 669
    if-eqz v3, :cond_f

    .line 670
    .line 671
    new-instance v3, La/e1w0;

    .line 672
    .line 673
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 674
    .line 675
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 676
    .line 677
    .line 678
    new-instance v1, La/c8d;

    .line 679
    .line 680
    sget-object v4, La/y7d;->a:La/v7d;

    .line 681
    .line 682
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 686
    .line 687
    .line 688
    goto :goto_8

    .line 689
    :cond_f
    new-instance v3, La/w0w0;

    .line 690
    .line 691
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 692
    .line 693
    .line 694
    new-instance v1, La/c8d;

    .line 695
    .line 696
    sget-object v4, La/y7d;->a:La/v7d;

    .line 697
    .line 698
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    :goto_8
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 705
    .line 706
    .line 707
    move-result-object v0

    .line 708
    :goto_9
    move-object v1, v0

    .line 709
    check-cast v1, La/paw;

    .line 710
    .line 711
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 712
    .line 713
    .line 714
    move-result v3

    .line 715
    if-eqz v3, :cond_24

    .line 716
    .line 717
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    move-result-object v1

    .line 721
    check-cast v1, La/oe50;

    .line 722
    .line 723
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 724
    .line 725
    .line 726
    goto :goto_9

    .line 727
    :cond_10
    instance-of v0, v1, La/dsq0;

    .line 728
    .line 729
    if-eqz v0, :cond_12

    .line 730
    .line 731
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 732
    .line 733
    .line 734
    move-result-object v0

    .line 735
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 736
    .line 737
    sget-object v3, La/i2n0;->a:La/i2n0;

    .line 738
    .line 739
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 740
    .line 741
    .line 742
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 743
    .line 744
    if-eqz v3, :cond_11

    .line 745
    .line 746
    new-instance v3, La/e1w0;

    .line 747
    .line 748
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 749
    .line 750
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 751
    .line 752
    .line 753
    new-instance v1, La/c8d;

    .line 754
    .line 755
    sget-object v4, La/y7d;->a:La/v7d;

    .line 756
    .line 757
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 758
    .line 759
    .line 760
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 761
    .line 762
    .line 763
    goto :goto_a

    .line 764
    :cond_11
    new-instance v3, La/w0w0;

    .line 765
    .line 766
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 767
    .line 768
    .line 769
    new-instance v1, La/c8d;

    .line 770
    .line 771
    sget-object v4, La/y7d;->a:La/v7d;

    .line 772
    .line 773
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 774
    .line 775
    .line 776
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 777
    .line 778
    .line 779
    :goto_a
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 780
    .line 781
    .line 782
    move-result-object v0

    .line 783
    :goto_b
    move-object v1, v0

    .line 784
    check-cast v1, La/paw;

    .line 785
    .line 786
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 787
    .line 788
    .line 789
    move-result v3

    .line 790
    if-eqz v3, :cond_24

    .line 791
    .line 792
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 793
    .line 794
    .line 795
    move-result-object v1

    .line 796
    check-cast v1, La/oe50;

    .line 797
    .line 798
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 799
    .line 800
    .line 801
    goto :goto_b

    .line 802
    :cond_12
    instance-of v0, v1, La/msq0;

    .line 803
    .line 804
    if-eqz v0, :cond_14

    .line 805
    .line 806
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 807
    .line 808
    .line 809
    move-result-object v0

    .line 810
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 811
    .line 812
    sget-object v3, La/m2n0;->a:La/m2n0;

    .line 813
    .line 814
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 815
    .line 816
    .line 817
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 818
    .line 819
    if-eqz v3, :cond_13

    .line 820
    .line 821
    new-instance v3, La/e1w0;

    .line 822
    .line 823
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 824
    .line 825
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 826
    .line 827
    .line 828
    new-instance v1, La/c8d;

    .line 829
    .line 830
    sget-object v4, La/y7d;->a:La/v7d;

    .line 831
    .line 832
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 833
    .line 834
    .line 835
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    goto :goto_c

    .line 839
    :cond_13
    new-instance v3, La/w0w0;

    .line 840
    .line 841
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 842
    .line 843
    .line 844
    new-instance v1, La/c8d;

    .line 845
    .line 846
    sget-object v4, La/y7d;->a:La/v7d;

    .line 847
    .line 848
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 852
    .line 853
    .line 854
    :goto_c
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    :goto_d
    move-object v1, v0

    .line 859
    check-cast v1, La/paw;

    .line 860
    .line 861
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 862
    .line 863
    .line 864
    move-result v3

    .line 865
    if-eqz v3, :cond_24

    .line 866
    .line 867
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 868
    .line 869
    .line 870
    move-result-object v1

    .line 871
    check-cast v1, La/oe50;

    .line 872
    .line 873
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 874
    .line 875
    .line 876
    goto :goto_d

    .line 877
    :cond_14
    instance-of v0, v1, La/esq0;

    .line 878
    .line 879
    if-eqz v0, :cond_16

    .line 880
    .line 881
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 882
    .line 883
    .line 884
    move-result-object v0

    .line 885
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$FeatureTogglesScreen;

    .line 886
    .line 887
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 888
    .line 889
    .line 890
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 891
    .line 892
    if-eqz v3, :cond_15

    .line 893
    .line 894
    new-instance v3, La/e1w0;

    .line 895
    .line 896
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 897
    .line 898
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 899
    .line 900
    .line 901
    new-instance v1, La/c8d;

    .line 902
    .line 903
    sget-object v4, La/y7d;->a:La/v7d;

    .line 904
    .line 905
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 906
    .line 907
    .line 908
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 909
    .line 910
    .line 911
    goto :goto_e

    .line 912
    :cond_15
    new-instance v3, La/w0w0;

    .line 913
    .line 914
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 915
    .line 916
    .line 917
    new-instance v1, La/c8d;

    .line 918
    .line 919
    sget-object v4, La/y7d;->a:La/v7d;

    .line 920
    .line 921
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 925
    .line 926
    .line 927
    :goto_e
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 928
    .line 929
    .line 930
    move-result-object v0

    .line 931
    :goto_f
    move-object v1, v0

    .line 932
    check-cast v1, La/paw;

    .line 933
    .line 934
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 935
    .line 936
    .line 937
    move-result v3

    .line 938
    if-eqz v3, :cond_24

    .line 939
    .line 940
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 941
    .line 942
    .line 943
    move-result-object v1

    .line 944
    check-cast v1, La/oe50;

    .line 945
    .line 946
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 947
    .line 948
    .line 949
    goto :goto_f

    .line 950
    :cond_16
    instance-of v0, v1, La/wrq0;

    .line 951
    .line 952
    if-eqz v0, :cond_18

    .line 953
    .line 954
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 955
    .line 956
    .line 957
    move-result-object v0

    .line 958
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 959
    .line 960
    sget-object v3, La/f2n0;->a:La/f2n0;

    .line 961
    .line 962
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 963
    .line 964
    .line 965
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 966
    .line 967
    if-eqz v3, :cond_17

    .line 968
    .line 969
    new-instance v3, La/e1w0;

    .line 970
    .line 971
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 972
    .line 973
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 974
    .line 975
    .line 976
    new-instance v1, La/c8d;

    .line 977
    .line 978
    sget-object v4, La/y7d;->a:La/v7d;

    .line 979
    .line 980
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 981
    .line 982
    .line 983
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 984
    .line 985
    .line 986
    goto :goto_10

    .line 987
    :cond_17
    new-instance v3, La/w0w0;

    .line 988
    .line 989
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 990
    .line 991
    .line 992
    new-instance v1, La/c8d;

    .line 993
    .line 994
    sget-object v4, La/y7d;->a:La/v7d;

    .line 995
    .line 996
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 997
    .line 998
    .line 999
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1000
    .line 1001
    .line 1002
    :goto_10
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    :goto_11
    move-object v1, v0

    .line 1007
    check-cast v1, La/paw;

    .line 1008
    .line 1009
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1010
    .line 1011
    .line 1012
    move-result v3

    .line 1013
    if-eqz v3, :cond_24

    .line 1014
    .line 1015
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v1

    .line 1019
    check-cast v1, La/oe50;

    .line 1020
    .line 1021
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1022
    .line 1023
    .line 1024
    goto :goto_11

    .line 1025
    :cond_18
    instance-of v0, v1, La/gsq0;

    .line 1026
    .line 1027
    if-eqz v0, :cond_1a

    .line 1028
    .line 1029
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v0

    .line 1033
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1034
    .line 1035
    sget-object v3, La/k2n0;->a:La/k2n0;

    .line 1036
    .line 1037
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1038
    .line 1039
    .line 1040
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1041
    .line 1042
    if-eqz v3, :cond_19

    .line 1043
    .line 1044
    new-instance v3, La/e1w0;

    .line 1045
    .line 1046
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1047
    .line 1048
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1049
    .line 1050
    .line 1051
    new-instance v1, La/c8d;

    .line 1052
    .line 1053
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1054
    .line 1055
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1056
    .line 1057
    .line 1058
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1059
    .line 1060
    .line 1061
    goto :goto_12

    .line 1062
    :cond_19
    new-instance v3, La/w0w0;

    .line 1063
    .line 1064
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1065
    .line 1066
    .line 1067
    new-instance v1, La/c8d;

    .line 1068
    .line 1069
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1070
    .line 1071
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1072
    .line 1073
    .line 1074
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1075
    .line 1076
    .line 1077
    :goto_12
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v0

    .line 1081
    :goto_13
    move-object v1, v0

    .line 1082
    check-cast v1, La/paw;

    .line 1083
    .line 1084
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1085
    .line 1086
    .line 1087
    move-result v3

    .line 1088
    if-eqz v3, :cond_24

    .line 1089
    .line 1090
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    check-cast v1, La/oe50;

    .line 1095
    .line 1096
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1097
    .line 1098
    .line 1099
    goto :goto_13

    .line 1100
    :cond_1a
    instance-of v0, v1, La/isq0;

    .line 1101
    .line 1102
    if-eqz v0, :cond_1c

    .line 1103
    .line 1104
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v0

    .line 1108
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1109
    .line 1110
    sget-object v3, La/l2n0;->a:La/l2n0;

    .line 1111
    .line 1112
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1113
    .line 1114
    .line 1115
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1116
    .line 1117
    if-eqz v3, :cond_1b

    .line 1118
    .line 1119
    new-instance v3, La/e1w0;

    .line 1120
    .line 1121
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1122
    .line 1123
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1124
    .line 1125
    .line 1126
    new-instance v1, La/c8d;

    .line 1127
    .line 1128
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1129
    .line 1130
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1131
    .line 1132
    .line 1133
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1134
    .line 1135
    .line 1136
    goto :goto_14

    .line 1137
    :cond_1b
    new-instance v3, La/w0w0;

    .line 1138
    .line 1139
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1140
    .line 1141
    .line 1142
    new-instance v1, La/c8d;

    .line 1143
    .line 1144
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1145
    .line 1146
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1147
    .line 1148
    .line 1149
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    :goto_14
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1153
    .line 1154
    .line 1155
    move-result-object v0

    .line 1156
    :goto_15
    move-object v1, v0

    .line 1157
    check-cast v1, La/paw;

    .line 1158
    .line 1159
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1160
    .line 1161
    .line 1162
    move-result v3

    .line 1163
    if-eqz v3, :cond_24

    .line 1164
    .line 1165
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v1

    .line 1169
    check-cast v1, La/oe50;

    .line 1170
    .line 1171
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1172
    .line 1173
    .line 1174
    goto :goto_15

    .line 1175
    :cond_1c
    instance-of v0, v1, La/asq0;

    .line 1176
    .line 1177
    if-eqz v0, :cond_1e

    .line 1178
    .line 1179
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1180
    .line 1181
    .line 1182
    move-result-object v0

    .line 1183
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1184
    .line 1185
    sget-object v3, La/g2n0;->a:La/g2n0;

    .line 1186
    .line 1187
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1188
    .line 1189
    .line 1190
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1191
    .line 1192
    if-eqz v3, :cond_1d

    .line 1193
    .line 1194
    new-instance v3, La/e1w0;

    .line 1195
    .line 1196
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1197
    .line 1198
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1199
    .line 1200
    .line 1201
    new-instance v1, La/c8d;

    .line 1202
    .line 1203
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1204
    .line 1205
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1206
    .line 1207
    .line 1208
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1209
    .line 1210
    .line 1211
    goto :goto_16

    .line 1212
    :cond_1d
    new-instance v3, La/w0w0;

    .line 1213
    .line 1214
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1215
    .line 1216
    .line 1217
    new-instance v1, La/c8d;

    .line 1218
    .line 1219
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1220
    .line 1221
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1222
    .line 1223
    .line 1224
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1225
    .line 1226
    .line 1227
    :goto_16
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1228
    .line 1229
    .line 1230
    move-result-object v0

    .line 1231
    :goto_17
    move-object v1, v0

    .line 1232
    check-cast v1, La/paw;

    .line 1233
    .line 1234
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1235
    .line 1236
    .line 1237
    move-result v3

    .line 1238
    if-eqz v3, :cond_24

    .line 1239
    .line 1240
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v1

    .line 1244
    check-cast v1, La/oe50;

    .line 1245
    .line 1246
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_17

    .line 1250
    :cond_1e
    instance-of v0, v1, La/nsq0;

    .line 1251
    .line 1252
    if-eqz v0, :cond_20

    .line 1253
    .line 1254
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v0

    .line 1258
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1259
    .line 1260
    sget-object v3, La/n2n0;->a:La/n2n0;

    .line 1261
    .line 1262
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1263
    .line 1264
    .line 1265
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1266
    .line 1267
    if-eqz v3, :cond_1f

    .line 1268
    .line 1269
    new-instance v3, La/e1w0;

    .line 1270
    .line 1271
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1272
    .line 1273
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1274
    .line 1275
    .line 1276
    new-instance v1, La/c8d;

    .line 1277
    .line 1278
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1279
    .line 1280
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1281
    .line 1282
    .line 1283
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1284
    .line 1285
    .line 1286
    goto :goto_18

    .line 1287
    :cond_1f
    new-instance v3, La/w0w0;

    .line 1288
    .line 1289
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1290
    .line 1291
    .line 1292
    new-instance v1, La/c8d;

    .line 1293
    .line 1294
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1295
    .line 1296
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1297
    .line 1298
    .line 1299
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1300
    .line 1301
    .line 1302
    :goto_18
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1303
    .line 1304
    .line 1305
    move-result-object v0

    .line 1306
    :goto_19
    move-object v1, v0

    .line 1307
    check-cast v1, La/paw;

    .line 1308
    .line 1309
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1310
    .line 1311
    .line 1312
    move-result v3

    .line 1313
    if-eqz v3, :cond_24

    .line 1314
    .line 1315
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1316
    .line 1317
    .line 1318
    move-result-object v1

    .line 1319
    check-cast v1, La/oe50;

    .line 1320
    .line 1321
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1322
    .line 1323
    .line 1324
    goto :goto_19

    .line 1325
    :cond_20
    instance-of v0, v1, La/fsq0;

    .line 1326
    .line 1327
    if-eqz v0, :cond_22

    .line 1328
    .line 1329
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1330
    .line 1331
    .line 1332
    move-result-object v0

    .line 1333
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1334
    .line 1335
    sget-object v3, La/j2n0;->a:La/j2n0;

    .line 1336
    .line 1337
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1338
    .line 1339
    .line 1340
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1341
    .line 1342
    if-eqz v3, :cond_21

    .line 1343
    .line 1344
    new-instance v3, La/e1w0;

    .line 1345
    .line 1346
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1347
    .line 1348
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1349
    .line 1350
    .line 1351
    new-instance v1, La/c8d;

    .line 1352
    .line 1353
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1354
    .line 1355
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1356
    .line 1357
    .line 1358
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1359
    .line 1360
    .line 1361
    goto :goto_1a

    .line 1362
    :cond_21
    new-instance v3, La/w0w0;

    .line 1363
    .line 1364
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1365
    .line 1366
    .line 1367
    new-instance v1, La/c8d;

    .line 1368
    .line 1369
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1370
    .line 1371
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1372
    .line 1373
    .line 1374
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1375
    .line 1376
    .line 1377
    :goto_1a
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    :goto_1b
    move-object v1, v0

    .line 1382
    check-cast v1, La/paw;

    .line 1383
    .line 1384
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1385
    .line 1386
    .line 1387
    move-result v3

    .line 1388
    if-eqz v3, :cond_24

    .line 1389
    .line 1390
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v1

    .line 1394
    check-cast v1, La/oe50;

    .line 1395
    .line 1396
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1397
    .line 1398
    .line 1399
    goto :goto_1b

    .line 1400
    :cond_22
    instance-of v0, v1, La/csq0;

    .line 1401
    .line 1402
    if-eqz v0, :cond_24

    .line 1403
    .line 1404
    invoke-static {v2}, La/b1j;->q(La/i1w0;)Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    new-instance v1, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;

    .line 1409
    .line 1410
    sget-object v3, La/h2n0;->a:La/h2n0;

    .line 1411
    .line 1412
    invoke-direct {v1, v3}, Lorg/xplatform/feature/office/test_section/impl/navigation/TestSectionScreen$SubSectionScreen;-><init>(La/o2n0;)V

    .line 1413
    .line 1414
    .line 1415
    instance-of v3, v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1416
    .line 1417
    if-eqz v3, :cond_23

    .line 1418
    .line 1419
    new-instance v3, La/e1w0;

    .line 1420
    .line 1421
    check-cast v1, Lorg/xplatform/core/navigation/dialog/DialogScreen;

    .line 1422
    .line 1423
    invoke-direct {v3, v1}, La/e1w0;-><init>(Lorg/xplatform/core/navigation/dialog/DialogScreen;)V

    .line 1424
    .line 1425
    .line 1426
    new-instance v1, La/c8d;

    .line 1427
    .line 1428
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1429
    .line 1430
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1434
    .line 1435
    .line 1436
    goto :goto_1c

    .line 1437
    :cond_23
    new-instance v3, La/w0w0;

    .line 1438
    .line 1439
    invoke-direct {v3, v1}, La/w0w0;-><init>(La/m7h0;)V

    .line 1440
    .line 1441
    .line 1442
    new-instance v1, La/c8d;

    .line 1443
    .line 1444
    sget-object v4, La/y7d;->a:La/v7d;

    .line 1445
    .line 1446
    invoke-direct {v1, v4, v3}, La/c8d;-><init>(La/w7d;La/g1w0;)V

    .line 1447
    .line 1448
    .line 1449
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 1450
    .line 1451
    .line 1452
    :goto_1c
    invoke-static {v2, v0, v9}, La/b1j;->o(La/i1w0;Ljava/util/concurrent/CopyOnWriteArrayList;I)Ljava/util/ListIterator;

    .line 1453
    .line 1454
    .line 1455
    move-result-object v0

    .line 1456
    :goto_1d
    move-object v1, v0

    .line 1457
    check-cast v1, La/paw;

    .line 1458
    .line 1459
    invoke-virtual {v1}, La/paw;->hasNext()Z

    .line 1460
    .line 1461
    .line 1462
    move-result v3

    .line 1463
    if-eqz v3, :cond_24

    .line 1464
    .line 1465
    invoke-virtual {v1}, La/paw;->next()Ljava/lang/Object;

    .line 1466
    .line 1467
    .line 1468
    move-result-object v1

    .line 1469
    check-cast v1, La/oe50;

    .line 1470
    .line 1471
    invoke-virtual {v2, v1}, La/i1w0;->a(La/oe50;)V

    .line 1472
    .line 1473
    .line 1474
    goto :goto_1d

    .line 1475
    :cond_24
    :goto_1e
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1476
    .line 1477
    :goto_1f
    return-object v10

    .line 1478
    :pswitch_5
    move-object/from16 v1, p1

    .line 1479
    .line 1480
    check-cast v1, La/wzp0;

    .line 1481
    .line 1482
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1483
    .line 1484
    .line 1485
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1486
    .line 1487
    check-cast v0, La/k3t0;

    .line 1488
    .line 1489
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1490
    .line 1491
    .line 1492
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1493
    .line 1494
    return-object v0

    .line 1495
    :pswitch_6
    move-object/from16 v1, p1

    .line 1496
    .line 1497
    check-cast v1, La/txp0;

    .line 1498
    .line 1499
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1503
    .line 1504
    check-cast v0, La/k3t0;

    .line 1505
    .line 1506
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1507
    .line 1508
    .line 1509
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1510
    .line 1511
    return-object v0

    .line 1512
    :pswitch_7
    move-object/from16 v1, p1

    .line 1513
    .line 1514
    check-cast v1, La/gyp0;

    .line 1515
    .line 1516
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1517
    .line 1518
    .line 1519
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1520
    .line 1521
    check-cast v0, La/k3t0;

    .line 1522
    .line 1523
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1524
    .line 1525
    .line 1526
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1527
    .line 1528
    return-object v0

    .line 1529
    :pswitch_8
    move-object/from16 v1, p1

    .line 1530
    .line 1531
    check-cast v1, La/ezp0;

    .line 1532
    .line 1533
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1537
    .line 1538
    check-cast v0, La/kyp0;

    .line 1539
    .line 1540
    sget-object v2, La/kyp0;->Q1:La/y2m0;

    .line 1541
    .line 1542
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1543
    .line 1544
    .line 1545
    instance-of v2, v1, La/czp0;

    .line 1546
    .line 1547
    if-eqz v2, :cond_28

    .line 1548
    .line 1549
    new-instance v2, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;

    .line 1550
    .line 1551
    check-cast v1, La/czp0;

    .line 1552
    .line 1553
    iget-object v3, v1, La/czp0;->a:La/pic;

    .line 1554
    .line 1555
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 1556
    .line 1557
    .line 1558
    move-result v3

    .line 1559
    if-eqz v3, :cond_26

    .line 1560
    .line 1561
    if-ne v3, v8, :cond_25

    .line 1562
    .line 1563
    const-string v3, "REQUEST_SURFACE_TYPES_DIALOG_KEY"

    .line 1564
    .line 1565
    goto :goto_20

    .line 1566
    :cond_25
    invoke-static {}, La/t9f;->b()V

    .line 1567
    .line 1568
    .line 1569
    goto/16 :goto_22

    .line 1570
    .line 1571
    :cond_26
    const-string v3, "REQUEST_SEASONS_DIALOG_KEY"

    .line 1572
    .line 1573
    :goto_20
    iget-object v4, v1, La/czp0;->b:Ljava/lang/String;

    .line 1574
    .line 1575
    iget-object v1, v1, La/czp0;->c:Ljava/util/ArrayList;

    .line 1576
    .line 1577
    invoke-direct {v2, v3, v4, v1}, Lorg/xplatform/statistic/tennis/impl/summary/presentation/chose_filter/ChoseFilterScreenParams;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 1578
    .line 1579
    .line 1580
    sget-object v1, La/oic;->l2:La/yk5;

    .line 1581
    .line 1582
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v3

    .line 1586
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1590
    .line 1591
    .line 1592
    sget-object v1, La/oic;->n2:Ljava/lang/String;

    .line 1593
    .line 1594
    invoke-virtual {v3, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1595
    .line 1596
    .line 1597
    move-result-object v4

    .line 1598
    if-eqz v4, :cond_27

    .line 1599
    .line 1600
    goto :goto_21

    .line 1601
    :cond_27
    new-instance v4, La/oic;

    .line 1602
    .line 1603
    invoke-direct {v4}, La/oic;-><init>()V

    .line 1604
    .line 1605
    .line 1606
    sget-object v5, La/oic;->m2:[La/iiy;

    .line 1607
    .line 1608
    aget-object v5, v5, v9

    .line 1609
    .line 1610
    iget-object v6, v4, La/oic;->k2:La/khf0;

    .line 1611
    .line 1612
    invoke-virtual {v6, v4, v5, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1613
    .line 1614
    .line 1615
    invoke-virtual {v4, v3, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1616
    .line 1617
    .line 1618
    goto :goto_21

    .line 1619
    :cond_28
    instance-of v1, v1, La/dzp0;

    .line 1620
    .line 1621
    if-eqz v1, :cond_2a

    .line 1622
    .line 1623
    iget-object v1, v0, La/kyp0;->L1:La/ii;

    .line 1624
    .line 1625
    if-eqz v1, :cond_29

    .line 1626
    .line 1627
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1628
    .line 1629
    const v2, 0x7f1303fb

    .line 1630
    .line 1631
    .line 1632
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1633
    .line 1634
    .line 1635
    move-result-object v12

    .line 1636
    const v2, 0x7f131169

    .line 1637
    .line 1638
    .line 1639
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v13

    .line 1643
    const v2, 0x7f130e5d

    .line 1644
    .line 1645
    .line 1646
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1647
    .line 1648
    .line 1649
    move-result-object v14

    .line 1650
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1651
    .line 1652
    .line 1653
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1654
    .line 1655
    .line 1656
    move-result-object v15

    .line 1657
    sget-object v20, La/n12;->a:La/n12;

    .line 1658
    .line 1659
    const/16 v21, 0x0

    .line 1660
    .line 1661
    const/16 v22, 0x5d0

    .line 1662
    .line 1663
    const/16 v16, 0x0

    .line 1664
    .line 1665
    const-string v17, "REQUEST_RESET_FILTERS_DIALOG_KEY"

    .line 1666
    .line 1667
    const/16 v18, 0x0

    .line 1668
    .line 1669
    const/16 v19, 0x0

    .line 1670
    .line 1671
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1675
    .line 1676
    .line 1677
    move-result-object v2

    .line 1678
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1679
    .line 1680
    .line 1681
    invoke-virtual {v1, v11, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1682
    .line 1683
    .line 1684
    :goto_21
    invoke-virtual {v0}, La/kyp0;->G0()La/k3t0;

    .line 1685
    .line 1686
    .line 1687
    move-result-object v0

    .line 1688
    sget-object v1, La/xxp0;->a:La/xxp0;

    .line 1689
    .line 1690
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1691
    .line 1692
    .line 1693
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1694
    .line 1695
    goto :goto_22

    .line 1696
    :cond_29
    const-string v0, "actionDialogManager"

    .line 1697
    .line 1698
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1699
    .line 1700
    .line 1701
    throw v10

    .line 1702
    :cond_2a
    invoke-static {}, La/t9f;->b()V

    .line 1703
    .line 1704
    .line 1705
    :goto_22
    return-object v10

    .line 1706
    :pswitch_9
    move-object/from16 v1, p1

    .line 1707
    .line 1708
    check-cast v1, La/yrp0;

    .line 1709
    .line 1710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1714
    .line 1715
    check-cast v0, La/k3t0;

    .line 1716
    .line 1717
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1718
    .line 1719
    .line 1720
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1721
    .line 1722
    return-object v0

    .line 1723
    :pswitch_a
    move-object/from16 v1, p1

    .line 1724
    .line 1725
    check-cast v1, Ljava/lang/Throwable;

    .line 1726
    .line 1727
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1728
    .line 1729
    .line 1730
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1731
    .line 1732
    check-cast v0, La/urp0;

    .line 1733
    .line 1734
    iget-object v0, v0, La/urp0;->g:La/duj;

    .line 1735
    .line 1736
    new-instance v2, La/zgp0;

    .line 1737
    .line 1738
    const/16 v3, 0xd

    .line 1739
    .line 1740
    invoke-direct {v2, v3}, La/zgp0;-><init>(B)V

    .line 1741
    .line 1742
    .line 1743
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1744
    .line 1745
    .line 1746
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1747
    .line 1748
    return-object v0

    .line 1749
    :pswitch_b
    move-object/from16 v1, p1

    .line 1750
    .line 1751
    check-cast v1, La/vh2;

    .line 1752
    .line 1753
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1754
    .line 1755
    .line 1756
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1757
    .line 1758
    check-cast v0, La/k3t0;

    .line 1759
    .line 1760
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1761
    .line 1762
    .line 1763
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1764
    .line 1765
    return-object v0

    .line 1766
    :pswitch_c
    move-object/from16 v1, p1

    .line 1767
    .line 1768
    check-cast v1, La/di2;

    .line 1769
    .line 1770
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1771
    .line 1772
    .line 1773
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1774
    .line 1775
    check-cast v0, La/jpp0;

    .line 1776
    .line 1777
    sget-object v2, La/jpp0;->O1:La/s2m0;

    .line 1778
    .line 1779
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1780
    .line 1781
    .line 1782
    sget-object v2, La/di2;->a:La/di2;

    .line 1783
    .line 1784
    invoke-virtual {v1, v2}, La/di2;->equals(Ljava/lang/Object;)Z

    .line 1785
    .line 1786
    .line 1787
    move-result v1

    .line 1788
    if-eqz v1, :cond_2b

    .line 1789
    .line 1790
    iget-object v1, v0, La/jpp0;->L1:La/n0o0;

    .line 1791
    .line 1792
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v1

    .line 1796
    check-cast v1, La/aci;

    .line 1797
    .line 1798
    iget-object v1, v1, La/aci;->d:La/ii;

    .line 1799
    .line 1800
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1801
    .line 1802
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v9

    .line 1806
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v10

    .line 1810
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1811
    .line 1812
    .line 1813
    move-result-object v11

    .line 1814
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1815
    .line 1816
    .line 1817
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1818
    .line 1819
    .line 1820
    move-result-object v12

    .line 1821
    sget-object v17, La/n12;->a:La/n12;

    .line 1822
    .line 1823
    const/16 v18, 0x0

    .line 1824
    .line 1825
    const/16 v19, 0x5d0

    .line 1826
    .line 1827
    const/4 v13, 0x0

    .line 1828
    const-string v14, "REMOVE_ALL_TEAM_RESULT"

    .line 1829
    .line 1830
    const/4 v15, 0x0

    .line 1831
    const/16 v16, 0x0

    .line 1832
    .line 1833
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1834
    .line 1835
    .line 1836
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v2

    .line 1840
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1841
    .line 1842
    .line 1843
    invoke-virtual {v1, v8, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1844
    .line 1845
    .line 1846
    invoke-virtual {v0}, La/jpp0;->G0()La/k3t0;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v0

    .line 1850
    sget-object v1, La/kh2;->a:La/kh2;

    .line 1851
    .line 1852
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1853
    .line 1854
    .line 1855
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1856
    .line 1857
    goto :goto_23

    .line 1858
    :cond_2b
    invoke-static {}, La/t9f;->b()V

    .line 1859
    .line 1860
    .line 1861
    :goto_23
    return-object v10

    .line 1862
    :pswitch_d
    move-object/from16 v1, p1

    .line 1863
    .line 1864
    check-cast v1, La/iop0;

    .line 1865
    .line 1866
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1867
    .line 1868
    .line 1869
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1870
    .line 1871
    check-cast v0, La/k3t0;

    .line 1872
    .line 1873
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1874
    .line 1875
    .line 1876
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1877
    .line 1878
    return-object v0

    .line 1879
    :pswitch_e
    move-object/from16 v1, p1

    .line 1880
    .line 1881
    check-cast v1, La/fnp0;

    .line 1882
    .line 1883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1884
    .line 1885
    .line 1886
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1887
    .line 1888
    check-cast v0, La/k3t0;

    .line 1889
    .line 1890
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1891
    .line 1892
    .line 1893
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1894
    .line 1895
    return-object v0

    .line 1896
    :pswitch_f
    move-object/from16 v1, p1

    .line 1897
    .line 1898
    check-cast v1, La/gkp0;

    .line 1899
    .line 1900
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1901
    .line 1902
    .line 1903
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1904
    .line 1905
    check-cast v0, La/k3t0;

    .line 1906
    .line 1907
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1908
    .line 1909
    .line 1910
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1911
    .line 1912
    return-object v0

    .line 1913
    :pswitch_10
    move-object/from16 v1, p1

    .line 1914
    .line 1915
    check-cast v1, La/ejp0;

    .line 1916
    .line 1917
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1918
    .line 1919
    .line 1920
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1921
    .line 1922
    check-cast v0, La/ajp0;

    .line 1923
    .line 1924
    sget-object v2, La/ajp0;->r2:La/s9m0;

    .line 1925
    .line 1926
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1927
    .line 1928
    .line 1929
    new-instance v2, La/yip0;

    .line 1930
    .line 1931
    invoke-direct {v2, v0, v1, v9}, La/yip0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1932
    .line 1933
    .line 1934
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 1935
    .line 1936
    .line 1937
    move-result v1

    .line 1938
    if-eqz v1, :cond_2c

    .line 1939
    .line 1940
    goto :goto_24

    .line 1941
    :cond_2c
    invoke-interface {v2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 1942
    .line 1943
    .line 1944
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1945
    .line 1946
    .line 1947
    :goto_24
    iget-object v0, v0, La/ajp0;->q2:La/a8z;

    .line 1948
    .line 1949
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1950
    .line 1951
    .line 1952
    move-result-object v0

    .line 1953
    check-cast v0, La/k3t0;

    .line 1954
    .line 1955
    sget-object v1, La/bjp0;->a:La/bjp0;

    .line 1956
    .line 1957
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1958
    .line 1959
    .line 1960
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1961
    .line 1962
    return-object v0

    .line 1963
    :pswitch_11
    move-object/from16 v1, p1

    .line 1964
    .line 1965
    check-cast v1, Ljava/lang/Throwable;

    .line 1966
    .line 1967
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1968
    .line 1969
    .line 1970
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1971
    .line 1972
    check-cast v0, La/rhp0;

    .line 1973
    .line 1974
    iget-object v2, v0, La/rhp0;->p:La/duj;

    .line 1975
    .line 1976
    new-instance v3, La/qhp0;

    .line 1977
    .line 1978
    invoke-direct {v3, v0, v9}, La/qhp0;-><init>(La/rhp0;B)V

    .line 1979
    .line 1980
    .line 1981
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1982
    .line 1983
    .line 1984
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1985
    .line 1986
    return-object v0

    .line 1987
    :pswitch_12
    move-object/from16 v1, p1

    .line 1988
    .line 1989
    check-cast v1, La/rgp0;

    .line 1990
    .line 1991
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1992
    .line 1993
    .line 1994
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1995
    .line 1996
    check-cast v0, La/k3t0;

    .line 1997
    .line 1998
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1999
    .line 2000
    .line 2001
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2002
    .line 2003
    return-object v0

    .line 2004
    :pswitch_13
    move-object/from16 v1, p1

    .line 2005
    .line 2006
    check-cast v1, La/vap0;

    .line 2007
    .line 2008
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2009
    .line 2010
    .line 2011
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2012
    .line 2013
    move-object v13, v0

    .line 2014
    check-cast v13, La/sap0;

    .line 2015
    .line 2016
    sget-object v0, La/sap0;->R1:La/j6m0;

    .line 2017
    .line 2018
    iget-object v11, v13, La/sap0;->M1:La/wdk0;

    .line 2019
    .line 2020
    if-eqz v11, :cond_2d

    .line 2021
    .line 2022
    new-instance v14, La/xdk0;

    .line 2023
    .line 2024
    sget-object v15, La/rek0;->b:La/rek0;

    .line 2025
    .line 2026
    iget-object v0, v1, La/vap0;->a:Ljava/lang/String;

    .line 2027
    .line 2028
    const/16 v20, 0x0

    .line 2029
    .line 2030
    const/16 v21, 0x7c

    .line 2031
    .line 2032
    const/16 v17, 0x0

    .line 2033
    .line 2034
    const/16 v18, 0x0

    .line 2035
    .line 2036
    const/16 v19, 0x0

    .line 2037
    .line 2038
    move-object/from16 v16, v0

    .line 2039
    .line 2040
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2041
    .line 2042
    .line 2043
    const/16 v18, 0x3fc

    .line 2044
    .line 2045
    move-object v12, v14

    .line 2046
    const/4 v14, 0x0

    .line 2047
    const/4 v15, 0x0

    .line 2048
    const/16 v16, 0x0

    .line 2049
    .line 2050
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2051
    .line 2052
    .line 2053
    invoke-virtual {v13}, La/sap0;->G0()La/k3t0;

    .line 2054
    .line 2055
    .line 2056
    move-result-object v0

    .line 2057
    sget-object v1, La/eap0;->a:La/eap0;

    .line 2058
    .line 2059
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2060
    .line 2061
    .line 2062
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2063
    .line 2064
    return-object v0

    .line 2065
    :cond_2d
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2066
    .line 2067
    .line 2068
    throw v10

    .line 2069
    :pswitch_14
    move-object/from16 v1, p1

    .line 2070
    .line 2071
    check-cast v1, La/lbp0;

    .line 2072
    .line 2073
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2074
    .line 2075
    .line 2076
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2077
    .line 2078
    move-object v13, v0

    .line 2079
    check-cast v13, La/h9p0;

    .line 2080
    .line 2081
    sget-object v0, La/h9p0;->V1:La/y2m0;

    .line 2082
    .line 2083
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2084
    .line 2085
    .line 2086
    instance-of v0, v1, La/hbp0;

    .line 2087
    .line 2088
    if-eqz v0, :cond_2f

    .line 2089
    .line 2090
    check-cast v1, La/hbp0;

    .line 2091
    .line 2092
    iget-object v0, v13, La/h9p0;->N1:La/ujd;

    .line 2093
    .line 2094
    if-eqz v0, :cond_2e

    .line 2095
    .line 2096
    iget-object v1, v1, La/hbp0;->a:La/sjd;

    .line 2097
    .line 2098
    invoke-virtual {v0, v13, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 2099
    .line 2100
    .line 2101
    goto/16 :goto_25

    .line 2102
    .line 2103
    :cond_2e
    const-string v0, "composeGameCardFragmentDelegate"

    .line 2104
    .line 2105
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2106
    .line 2107
    .line 2108
    throw v10

    .line 2109
    :cond_2f
    instance-of v0, v1, La/jbp0;

    .line 2110
    .line 2111
    if-eqz v0, :cond_31

    .line 2112
    .line 2113
    check-cast v1, La/jbp0;

    .line 2114
    .line 2115
    iget-object v11, v13, La/h9p0;->O1:La/wdk0;

    .line 2116
    .line 2117
    if-eqz v11, :cond_30

    .line 2118
    .line 2119
    new-instance v14, La/xdk0;

    .line 2120
    .line 2121
    sget-object v15, La/rek0;->b:La/rek0;

    .line 2122
    .line 2123
    iget-object v0, v1, La/jbp0;->a:Ljava/lang/String;

    .line 2124
    .line 2125
    const/16 v20, 0x0

    .line 2126
    .line 2127
    const/16 v21, 0x7c

    .line 2128
    .line 2129
    const/16 v17, 0x0

    .line 2130
    .line 2131
    const/16 v18, 0x0

    .line 2132
    .line 2133
    const/16 v19, 0x0

    .line 2134
    .line 2135
    move-object/from16 v16, v0

    .line 2136
    .line 2137
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2138
    .line 2139
    .line 2140
    const/16 v18, 0x3fc

    .line 2141
    .line 2142
    move-object v12, v14

    .line 2143
    const/4 v14, 0x0

    .line 2144
    const/4 v15, 0x0

    .line 2145
    const/16 v16, 0x0

    .line 2146
    .line 2147
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2148
    .line 2149
    .line 2150
    goto/16 :goto_25

    .line 2151
    .line 2152
    :cond_30
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2153
    .line 2154
    .line 2155
    throw v10

    .line 2156
    :cond_31
    instance-of v0, v1, La/kbp0;

    .line 2157
    .line 2158
    if-eqz v0, :cond_33

    .line 2159
    .line 2160
    iget-object v0, v13, La/h9p0;->P1:La/poq0;

    .line 2161
    .line 2162
    if-eqz v0, :cond_32

    .line 2163
    .line 2164
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2165
    .line 2166
    .line 2167
    move-result-object v0

    .line 2168
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2169
    .line 2170
    .line 2171
    sget-object v1, La/fk60;->b:La/uuz;

    .line 2172
    .line 2173
    sget-object v1, La/ki60;->q2:La/htz;

    .line 2174
    .line 2175
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2176
    .line 2177
    .line 2178
    const-string v1, "OnboardingBottomSheetContainerFragment"

    .line 2179
    .line 2180
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2181
    .line 2182
    .line 2183
    move-result-object v2

    .line 2184
    if-nez v2, :cond_35

    .line 2185
    .line 2186
    new-instance v2, La/ki60;

    .line 2187
    .line 2188
    invoke-direct {v2}, La/ki60;-><init>()V

    .line 2189
    .line 2190
    .line 2191
    sget-object v3, La/ki60;->r2:[La/iiy;

    .line 2192
    .line 2193
    aget-object v4, v3, v8

    .line 2194
    .line 2195
    iget-object v6, v2, La/ki60;->n2:La/zz2;

    .line 2196
    .line 2197
    const/16 v7, 0x17

    .line 2198
    .line 2199
    invoke-virtual {v6, v2, v4, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 2200
    .line 2201
    .line 2202
    iget-object v4, v2, La/ki60;->o2:La/phf0;

    .line 2203
    .line 2204
    aget-object v3, v3, v5

    .line 2205
    .line 2206
    const-string v5, ""

    .line 2207
    .line 2208
    invoke-virtual {v4, v2, v3, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 2209
    .line 2210
    .line 2211
    invoke-static {v2, v0, v1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2212
    .line 2213
    .line 2214
    goto :goto_25

    .line 2215
    :cond_32
    const-string v0, "tipsDialogFeature"

    .line 2216
    .line 2217
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2218
    .line 2219
    .line 2220
    throw v10

    .line 2221
    :cond_33
    instance-of v0, v1, La/ibp0;

    .line 2222
    .line 2223
    if-eqz v0, :cond_36

    .line 2224
    .line 2225
    check-cast v1, La/ibp0;

    .line 2226
    .line 2227
    const-class v0, La/x8p0;

    .line 2228
    .line 2229
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v0

    .line 2233
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2234
    .line 2235
    .line 2236
    move-result-object v2

    .line 2237
    invoke-virtual {v2, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2238
    .line 2239
    .line 2240
    move-result-object v2

    .line 2241
    if-eqz v2, :cond_34

    .line 2242
    .line 2243
    goto :goto_25

    .line 2244
    :cond_34
    sget-object v2, La/x8p0;->l2:La/s2m0;

    .line 2245
    .line 2246
    iget-object v1, v1, La/ibp0;->a:Lorg/xplatform/cyber/section/impl/team_details/presentation/main/dialog/model/TeamDetailsDisciplineDialogParams;

    .line 2247
    .line 2248
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2249
    .line 2250
    .line 2251
    new-instance v2, La/x8p0;

    .line 2252
    .line 2253
    invoke-direct {v2}, La/x8p0;-><init>()V

    .line 2254
    .line 2255
    .line 2256
    sget-object v3, La/x8p0;->m2:[La/iiy;

    .line 2257
    .line 2258
    aget-object v3, v3, v9

    .line 2259
    .line 2260
    iget-object v4, v2, La/x8p0;->k2:La/khf0;

    .line 2261
    .line 2262
    invoke-virtual {v4, v2, v3, v1}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 2263
    .line 2264
    .line 2265
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2266
    .line 2267
    .line 2268
    move-result-object v1

    .line 2269
    invoke-virtual {v2, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2270
    .line 2271
    .line 2272
    :cond_35
    :goto_25
    invoke-virtual {v13}, La/h9p0;->G0()La/k3t0;

    .line 2273
    .line 2274
    .line 2275
    move-result-object v0

    .line 2276
    sget-object v1, La/u7p0;->a:La/u7p0;

    .line 2277
    .line 2278
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2279
    .line 2280
    .line 2281
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2282
    .line 2283
    goto :goto_26

    .line 2284
    :cond_36
    invoke-static {}, La/t9f;->b()V

    .line 2285
    .line 2286
    .line 2287
    :goto_26
    return-object v10

    .line 2288
    :pswitch_15
    move-object/from16 v1, p1

    .line 2289
    .line 2290
    check-cast v1, La/p5p0;

    .line 2291
    .line 2292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2293
    .line 2294
    .line 2295
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2296
    .line 2297
    check-cast v0, La/o6p0;

    .line 2298
    .line 2299
    invoke-virtual {v0, v1}, La/o6p0;->O(La/p5p0;)V

    .line 2300
    .line 2301
    .line 2302
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2303
    .line 2304
    return-object v0

    .line 2305
    :pswitch_16
    move-object/from16 v1, p1

    .line 2306
    .line 2307
    check-cast v1, Ljava/lang/Throwable;

    .line 2308
    .line 2309
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2310
    .line 2311
    .line 2312
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2313
    .line 2314
    check-cast v0, La/q4p0;

    .line 2315
    .line 2316
    iget-object v2, v0, La/q4p0;->t:La/ivn;

    .line 2317
    .line 2318
    new-instance v3, La/m4p0;

    .line 2319
    .line 2320
    invoke-direct {v3, v0, v9}, La/m4p0;-><init>(La/q4p0;B)V

    .line 2321
    .line 2322
    .line 2323
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 2324
    .line 2325
    .line 2326
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2327
    .line 2328
    return-object v0

    .line 2329
    :pswitch_17
    move-object/from16 v1, p1

    .line 2330
    .line 2331
    check-cast v1, Ljava/lang/Throwable;

    .line 2332
    .line 2333
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2334
    .line 2335
    .line 2336
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2337
    .line 2338
    check-cast v0, La/q4p0;

    .line 2339
    .line 2340
    iget-object v2, v0, La/q4p0;->t:La/ivn;

    .line 2341
    .line 2342
    new-instance v3, La/m4p0;

    .line 2343
    .line 2344
    invoke-direct {v3, v0, v9}, La/m4p0;-><init>(La/q4p0;B)V

    .line 2345
    .line 2346
    .line 2347
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 2348
    .line 2349
    .line 2350
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2351
    .line 2352
    return-object v0

    .line 2353
    :pswitch_18
    move-object/from16 v1, p1

    .line 2354
    .line 2355
    check-cast v1, La/b4p0;

    .line 2356
    .line 2357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2358
    .line 2359
    .line 2360
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2361
    .line 2362
    check-cast v0, La/k3t0;

    .line 2363
    .line 2364
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2365
    .line 2366
    .line 2367
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2368
    .line 2369
    return-object v0

    .line 2370
    :pswitch_19
    move-object/from16 v1, p1

    .line 2371
    .line 2372
    check-cast v1, La/k4p0;

    .line 2373
    .line 2374
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2375
    .line 2376
    .line 2377
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2378
    .line 2379
    move-object v13, v0

    .line 2380
    check-cast v13, La/e4p0;

    .line 2381
    .line 2382
    sget-object v0, La/e4p0;->O1:La/m6m0;

    .line 2383
    .line 2384
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2385
    .line 2386
    .line 2387
    iget-object v0, v13, La/e4p0;->M1:La/n0o0;

    .line 2388
    .line 2389
    sget-object v2, La/j4p0;->a:La/j4p0;

    .line 2390
    .line 2391
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2392
    .line 2393
    .line 2394
    move-result v2

    .line 2395
    if-eqz v2, :cond_37

    .line 2396
    .line 2397
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2398
    .line 2399
    .line 2400
    move-result-object v0

    .line 2401
    check-cast v0, La/iwi;

    .line 2402
    .line 2403
    iget-object v0, v0, La/iwi;->a:La/daf;

    .line 2404
    .line 2405
    iget-object v0, v0, La/daf;->f:Ljava/lang/Object;

    .line 2406
    .line 2407
    check-cast v0, La/ii;

    .line 2408
    .line 2409
    invoke-static {v0}, La/x1x;->y(Ljava/lang/Object;)V

    .line 2410
    .line 2411
    .line 2412
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2413
    .line 2414
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v15

    .line 2418
    invoke-virtual {v13, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v16

    .line 2422
    invoke-virtual {v13, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v17

    .line 2426
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2427
    .line 2428
    .line 2429
    invoke-virtual {v13, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2430
    .line 2431
    .line 2432
    move-result-object v18

    .line 2433
    sget-object v23, La/n12;->a:La/n12;

    .line 2434
    .line 2435
    const/16 v24, 0x0

    .line 2436
    .line 2437
    const/16 v25, 0x5d0

    .line 2438
    .line 2439
    const/16 v19, 0x0

    .line 2440
    .line 2441
    const-string v20, "REMOVE_ALL_TEAM_BET_TEAMS"

    .line 2442
    .line 2443
    const/16 v21, 0x0

    .line 2444
    .line 2445
    const/16 v22, 0x0

    .line 2446
    .line 2447
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2448
    .line 2449
    .line 2450
    invoke-virtual {v13}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2451
    .line 2452
    .line 2453
    move-result-object v1

    .line 2454
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2455
    .line 2456
    .line 2457
    invoke-virtual {v0, v14, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2458
    .line 2459
    .line 2460
    goto :goto_27

    .line 2461
    :cond_37
    instance-of v2, v1, La/i4p0;

    .line 2462
    .line 2463
    if-eqz v2, :cond_38

    .line 2464
    .line 2465
    check-cast v1, La/i4p0;

    .line 2466
    .line 2467
    iget-object v4, v1, La/i4p0;->a:Ljava/lang/String;

    .line 2468
    .line 2469
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v0

    .line 2473
    check-cast v0, La/iwi;

    .line 2474
    .line 2475
    iget-object v0, v0, La/iwi;->a:La/daf;

    .line 2476
    .line 2477
    iget-object v0, v0, La/daf;->g:Ljava/lang/Object;

    .line 2478
    .line 2479
    move-object v11, v0

    .line 2480
    check-cast v11, La/wdk0;

    .line 2481
    .line 2482
    invoke-static {v11}, La/x1x;->y(Ljava/lang/Object;)V

    .line 2483
    .line 2484
    .line 2485
    new-instance v2, La/xdk0;

    .line 2486
    .line 2487
    sget-object v3, La/rek0;->b:La/rek0;

    .line 2488
    .line 2489
    const/4 v8, 0x0

    .line 2490
    const/16 v9, 0x7c

    .line 2491
    .line 2492
    const/4 v5, 0x0

    .line 2493
    const/4 v6, 0x0

    .line 2494
    const/4 v7, 0x0

    .line 2495
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2496
    .line 2497
    .line 2498
    const/16 v17, 0x0

    .line 2499
    .line 2500
    const/16 v18, 0x3fc

    .line 2501
    .line 2502
    const/4 v14, 0x0

    .line 2503
    const/4 v15, 0x0

    .line 2504
    const/16 v16, 0x0

    .line 2505
    .line 2506
    move-object v12, v2

    .line 2507
    invoke-static/range {v11 .. v18}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2508
    .line 2509
    .line 2510
    :goto_27
    invoke-virtual {v13}, La/e4p0;->G0()La/k3t0;

    .line 2511
    .line 2512
    .line 2513
    move-result-object v0

    .line 2514
    sget-object v1, La/o3p0;->a:La/o3p0;

    .line 2515
    .line 2516
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2517
    .line 2518
    .line 2519
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2520
    .line 2521
    goto :goto_28

    .line 2522
    :cond_38
    invoke-static {}, La/t9f;->b()V

    .line 2523
    .line 2524
    .line 2525
    :goto_28
    return-object v10

    .line 2526
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2527
    .line 2528
    check-cast v1, Ljava/lang/Throwable;

    .line 2529
    .line 2530
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2531
    .line 2532
    .line 2533
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2534
    .line 2535
    check-cast v0, La/i3p0;

    .line 2536
    .line 2537
    iget-object v2, v0, La/i3p0;->v:La/duj;

    .line 2538
    .line 2539
    new-instance v3, La/abn0;

    .line 2540
    .line 2541
    invoke-direct {v3, v0, v6}, La/abn0;-><init>(Ljava/lang/Object;B)V

    .line 2542
    .line 2543
    .line 2544
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2545
    .line 2546
    .line 2547
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2548
    .line 2549
    return-object v0

    .line 2550
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2551
    .line 2552
    check-cast v1, La/iyo0;

    .line 2553
    .line 2554
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2555
    .line 2556
    .line 2557
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2558
    .line 2559
    check-cast v0, La/k3t0;

    .line 2560
    .line 2561
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2562
    .line 2563
    .line 2564
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2565
    .line 2566
    return-object v0

    .line 2567
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2568
    .line 2569
    check-cast v1, La/n2p0;

    .line 2570
    .line 2571
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2572
    .line 2573
    .line 2574
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2575
    .line 2576
    check-cast v0, La/k3t0;

    .line 2577
    .line 2578
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2579
    .line 2580
    .line 2581
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2582
    .line 2583
    return-object v0

    .line 2584
    nop

    .line 2585
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
