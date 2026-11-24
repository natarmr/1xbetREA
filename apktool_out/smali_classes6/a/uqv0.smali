.class public final synthetic La/uqv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ywv0;I)V
    .locals 0

    .line 1
    const/4 p2, 0x2

    iput-byte p2, p0, La/uqv0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/uqv0;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 2
    iput-byte p2, p0, La/uqv0;->a:B

    iput-object p1, p0, La/uqv0;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/uqv0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v0, v0, La/uqv0;->b:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast v0, La/wzv0;

    .line 13
    .line 14
    move-object/from16 v7, p1

    .line 15
    .line 16
    check-cast v7, La/u4s;

    .line 17
    .line 18
    move-object/from16 v6, p2

    .line 19
    .line 20
    check-cast v6, Ljava/lang/String;

    .line 21
    .line 22
    sget-object v1, La/wzv0;->O1:La/wxs0;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    iget-object v0, v0, La/wzv0;->M1:La/kiu0;

    .line 28
    .line 29
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    move-object v5, v0

    .line 34
    check-cast v5, La/rio0;

    .line 35
    .line 36
    iget-object v0, v5, La/rio0;->P0:La/bby;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-ne v0, v3, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    new-instance v8, La/tfo0;

    .line 52
    .line 53
    const/4 v14, 0x0

    .line 54
    const/16 v15, 0xb

    .line 55
    .line 56
    const/4 v9, 0x1

    .line 57
    const-class v11, La/rio0;

    .line 58
    .line 59
    const-string v12, "handleError"

    .line 60
    .line 61
    const-string v13, "handleError(Ljava/lang/Throwable;)V"

    .line 62
    .line 63
    move-object v10, v5

    .line 64
    invoke-direct/range {v8 .. v15}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 65
    .line 66
    .line 67
    move-object v1, v8

    .line 68
    iget-object v2, v5, La/rio0;->y:La/mne;

    .line 69
    .line 70
    iget-object v11, v2, La/mne;->a:La/rwj;

    .line 71
    .line 72
    new-instance v4, La/ze1;

    .line 73
    .line 74
    const/4 v8, 0x0

    .line 75
    const/16 v9, 0xe

    .line 76
    .line 77
    invoke-direct/range {v4 .. v9}, La/ze1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 78
    .line 79
    .line 80
    const/16 v13, 0xa

    .line 81
    .line 82
    const/4 v10, 0x0

    .line 83
    move-object v8, v0

    .line 84
    move-object v9, v1

    .line 85
    move-object v12, v4

    .line 86
    invoke-static/range {v8 .. v13}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    iput-object v0, v5, La/rio0;->P0:La/bby;

    .line 91
    .line 92
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object v0

    .line 95
    :pswitch_0
    check-cast v0, La/tyv0;

    .line 96
    .line 97
    move-object/from16 v8, p1

    .line 98
    .line 99
    check-cast v8, La/fet;

    .line 100
    .line 101
    move-object/from16 v1, p2

    .line 102
    .line 103
    check-cast v1, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v1

    .line 109
    sget-object v4, La/tyv0;->O1:La/uxs0;

    .line 110
    .line 111
    and-int/lit8 v4, v1, 0x3

    .line 112
    .line 113
    const/4 v7, 0x2

    .line 114
    if-eq v4, v7, :cond_1

    .line 115
    .line 116
    move v2, v3

    .line 117
    :cond_1
    and-int/2addr v1, v3

    .line 118
    invoke-virtual {v8, v1, v2}, La/fet;->U(IZ)Z

    .line 119
    .line 120
    .line 121
    move-result v1

    .line 122
    if-eqz v1, :cond_a

    .line 123
    .line 124
    invoke-virtual {v0}, La/tyv0;->H0()La/k3t0;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    check-cast v1, La/i3t0;

    .line 129
    .line 130
    invoke-virtual {v1, v8}, La/i3t0;->y(La/fet;)La/pz40;

    .line 131
    .line 132
    .line 133
    move-result-object v1

    .line 134
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    move-object v9, v1

    .line 139
    check-cast v9, La/hzv0;

    .line 140
    .line 141
    invoke-virtual {v0}, La/tyv0;->H0()La/k3t0;

    .line 142
    .line 143
    .line 144
    move-result-object v2

    .line 145
    invoke-virtual {v8, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    sget-object v10, La/ukd;->a:La/cl5;

    .line 154
    .line 155
    if-nez v1, :cond_2

    .line 156
    .line 157
    if-ne v4, v10, :cond_3

    .line 158
    .line 159
    :cond_2
    new-instance v4, La/ryv0;

    .line 160
    .line 161
    invoke-direct {v4, v0, v3}, La/ryv0;-><init>(La/tyv0;B)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v8, v4}, La/fet;->o0(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 168
    .line 169
    sget-object v1, La/lkz;->a:La/lkz;

    .line 170
    .line 171
    invoke-static {v4, v8}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    invoke-virtual {v8, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    invoke-virtual {v8, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v3

    .line 183
    or-int/2addr v1, v3

    .line 184
    const/4 v3, 0x3

    .line 185
    invoke-virtual {v8, v3}, La/fet;->e(I)Z

    .line 186
    .line 187
    .line 188
    move-result v3

    .line 189
    or-int/2addr v1, v3

    .line 190
    invoke-virtual {v8, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 191
    .line 192
    .line 193
    move-result v3

    .line 194
    or-int/2addr v1, v3

    .line 195
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-nez v1, :cond_5

    .line 200
    .line 201
    if-ne v3, v10, :cond_4

    .line 202
    .line 203
    goto :goto_1

    .line 204
    :cond_4
    move-object v1, v3

    .line 205
    move-object v3, v0

    .line 206
    goto :goto_2

    .line 207
    :cond_5
    :goto_1
    new-instance v1, La/tmj0;

    .line 208
    .line 209
    const/4 v5, 0x0

    .line 210
    const/16 v6, 0x1c

    .line 211
    .line 212
    move-object v3, v0

    .line 213
    invoke-direct/range {v1 .. v6}, La/tmj0;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 217
    .line 218
    .line 219
    :goto_2
    check-cast v1, Lkotlin/jvm/functions/Function2;

    .line 220
    .line 221
    invoke-static {v8, v3, v1}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {v3}, La/tyv0;->H0()La/k3t0;

    .line 225
    .line 226
    .line 227
    move-result-object v13

    .line 228
    invoke-virtual {v8, v13}, La/fet;->i(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v1

    .line 236
    if-nez v0, :cond_6

    .line 237
    .line 238
    if-ne v1, v10, :cond_7

    .line 239
    .line 240
    :cond_6
    new-instance v11, La/wzu0;

    .line 241
    .line 242
    const/16 v17, 0x0

    .line 243
    .line 244
    const/16 v18, 0x12

    .line 245
    .line 246
    const/4 v12, 0x1

    .line 247
    const-class v14, La/k3t0;

    .line 248
    .line 249
    const-string v15, "onAction"

    .line 250
    .line 251
    const-string v16, "onAction(Ljava/lang/Object;)V"

    .line 252
    .line 253
    invoke-direct/range {v11 .. v18}, La/wzu0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8, v11}, La/fet;->o0(Ljava/lang/Object;)V

    .line 257
    .line 258
    .line 259
    move-object v1, v11

    .line 260
    :cond_7
    check-cast v1, La/jhy;

    .line 261
    .line 262
    move-object v6, v1

    .line 263
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 264
    .line 265
    invoke-virtual {v8, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v0

    .line 269
    invoke-virtual {v8}, La/fet;->P()Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    move-result-object v1

    .line 273
    if-nez v0, :cond_8

    .line 274
    .line 275
    if-ne v1, v10, :cond_9

    .line 276
    .line 277
    :cond_8
    new-instance v1, La/ryv0;

    .line 278
    .line 279
    invoke-direct {v1, v3, v7}, La/ryv0;-><init>(La/tyv0;B)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v8, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    :cond_9
    move-object v7, v1

    .line 286
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 287
    .line 288
    move-object v5, v9

    .line 289
    const/4 v9, 0x0

    .line 290
    const/4 v4, 0x0

    .line 291
    invoke-static/range {v4 .. v9}, La/xia0;->Z(La/mm40;La/hzv0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 292
    .line 293
    .line 294
    goto :goto_3

    .line 295
    :cond_a
    invoke-virtual {v8}, La/fet;->X()V

    .line 296
    .line 297
    .line 298
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 299
    .line 300
    return-object v0

    .line 301
    :pswitch_1
    check-cast v0, La/cyv0;

    .line 302
    .line 303
    move-object/from16 v2, p1

    .line 304
    .line 305
    check-cast v2, La/u4s;

    .line 306
    .line 307
    move-object/from16 v4, p2

    .line 308
    .line 309
    check-cast v4, Ljava/lang/String;

    .line 310
    .line 311
    sget-object v1, La/cyv0;->O1:La/sxs0;

    .line 312
    .line 313
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 314
    .line 315
    .line 316
    iget-object v0, v0, La/cyv0;->M1:La/kiu0;

    .line 317
    .line 318
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    move-object v3, v0

    .line 323
    check-cast v3, La/fho0;

    .line 324
    .line 325
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    new-instance v5, La/tfo0;

    .line 330
    .line 331
    const/4 v11, 0x0

    .line 332
    const/4 v12, 0x5

    .line 333
    const/4 v6, 0x1

    .line 334
    const-class v8, La/fho0;

    .line 335
    .line 336
    const-string v9, "handleError"

    .line 337
    .line 338
    const-string v10, "handleError(Ljava/lang/Throwable;)V"

    .line 339
    .line 340
    move-object v7, v3

    .line 341
    invoke-direct/range {v5 .. v12}, La/tfo0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 342
    .line 343
    .line 344
    move-object v7, v5

    .line 345
    iget-object v1, v3, La/fho0;->x:La/mne;

    .line 346
    .line 347
    iget-object v8, v1, La/mne;->a:La/rwj;

    .line 348
    .line 349
    new-instance v1, La/ze1;

    .line 350
    .line 351
    const/4 v5, 0x0

    .line 352
    const/16 v6, 0xd

    .line 353
    .line 354
    invoke-direct/range {v1 .. v6}, La/ze1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 355
    .line 356
    .line 357
    const/16 v10, 0xa

    .line 358
    .line 359
    move-object v5, v7

    .line 360
    const/4 v7, 0x0

    .line 361
    move-object v9, v1

    .line 362
    move-object v6, v5

    .line 363
    move-object v5, v0

    .line 364
    invoke-static/range {v5 .. v10}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 365
    .line 366
    .line 367
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 368
    .line 369
    return-object v0

    .line 370
    :pswitch_2
    check-cast v0, La/ywv0;

    .line 371
    .line 372
    move-object/from16 v1, p1

    .line 373
    .line 374
    check-cast v1, La/fet;

    .line 375
    .line 376
    move-object/from16 v2, p2

    .line 377
    .line 378
    check-cast v2, Ljava/lang/Integer;

    .line 379
    .line 380
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 381
    .line 382
    .line 383
    invoke-static {v3}, La/x8x;->L(I)I

    .line 384
    .line 385
    .line 386
    move-result v2

    .line 387
    sget-object v3, La/jm40;->b:La/jm40;

    .line 388
    .line 389
    invoke-static {v3, v0, v1, v2}, La/luv0;->a(La/mm40;La/ywv0;La/fet;I)V

    .line 390
    .line 391
    .line 392
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 393
    .line 394
    return-object v0

    .line 395
    :pswitch_3
    move-object v1, v0

    .line 396
    check-cast v1, La/u12;

    .line 397
    .line 398
    move-object/from16 v0, p1

    .line 399
    .line 400
    check-cast v0, La/qkx;

    .line 401
    .line 402
    move-object/from16 v6, p2

    .line 403
    .line 404
    check-cast v6, La/k6z;

    .line 405
    .line 406
    const-wide/16 v2, 0x0

    .line 407
    .line 408
    iget-wide v4, v0, La/qkx;->a:J

    .line 409
    .line 410
    invoke-interface/range {v1 .. v6}, La/u12;->a(JJLa/k6z;)J

    .line 411
    .line 412
    .line 413
    move-result-wide v0

    .line 414
    new-instance v2, La/ikx;

    .line 415
    .line 416
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 417
    .line 418
    .line 419
    return-object v2

    .line 420
    :pswitch_4
    check-cast v0, La/yx7;

    .line 421
    .line 422
    move-object/from16 v1, p1

    .line 423
    .line 424
    check-cast v1, La/qkx;

    .line 425
    .line 426
    move-object/from16 v3, p2

    .line 427
    .line 428
    check-cast v3, La/k6z;

    .line 429
    .line 430
    iget-wide v3, v1, La/qkx;->a:J

    .line 431
    .line 432
    const-wide v5, 0xffffffffL

    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    and-long/2addr v3, v5

    .line 438
    long-to-int v1, v3

    .line 439
    invoke-virtual {v0, v2, v1}, La/yx7;->a(II)I

    .line 440
    .line 441
    .line 442
    move-result v0

    .line 443
    int-to-long v0, v0

    .line 444
    and-long/2addr v0, v5

    .line 445
    new-instance v2, La/ikx;

    .line 446
    .line 447
    invoke-direct {v2, v0, v1}, La/ikx;-><init>(J)V

    .line 448
    .line 449
    .line 450
    return-object v2

    .line 451
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
