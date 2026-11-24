.class public final synthetic La/n790;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r790;


# direct methods
.method public synthetic constructor <init>(La/r790;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n790;->a:B

    iput-object p1, p0, La/n790;->b:La/r790;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n790;->a:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, v0, La/n790;->b:La/r790;

    .line 8
    .line 9
    const/4 v5, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/fet;

    .line 17
    .line 18
    move-object/from16 v2, p2

    .line 19
    .line 20
    check-cast v2, Ljava/lang/Integer;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sget-object v3, La/r790;->Z1:La/xi70;

    .line 27
    .line 28
    and-int/lit8 v3, v2, 0x3

    .line 29
    .line 30
    const/4 v4, 0x2

    .line 31
    if-eq v3, v4, :cond_0

    .line 32
    .line 33
    move v6, v5

    .line 34
    :cond_0
    and-int/2addr v2, v5

    .line 35
    invoke-virtual {v1, v2, v6}, La/fet;->U(IZ)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_11

    .line 40
    .line 41
    iget-object v5, v0, La/n790;->b:La/r790;

    .line 42
    .line 43
    invoke-virtual {v5}, La/r790;->I0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v11, La/ukd;->a:La/cl5;

    .line 56
    .line 57
    if-nez v2, :cond_1

    .line 58
    .line 59
    if-ne v3, v11, :cond_2

    .line 60
    .line 61
    :cond_1
    new-instance v3, La/xj80;

    .line 62
    .line 63
    const/4 v9, 0x0

    .line 64
    const/16 v10, 0xe

    .line 65
    .line 66
    const/4 v4, 0x1

    .line 67
    const-class v6, La/r790;

    .line 68
    .line 69
    const-string v7, "handleSideEffect"

    .line 70
    .line 71
    const-string v8, "handleSideEffect(Lorg/xplatform/feature/office/payment/impl/presentation/model/PaymentSideEffect;)V"

    .line 72
    .line 73
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    :cond_2
    check-cast v3, La/jhy;

    .line 80
    .line 81
    check-cast v3, Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    sget-object v2, La/lkz;->a:La/lkz;

    .line 84
    .line 85
    invoke-static {v3, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 86
    .line 87
    .line 88
    move-result-object v6

    .line 89
    invoke-virtual {v1, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v2

    .line 93
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v3

    .line 97
    or-int/2addr v2, v3

    .line 98
    const/4 v3, 0x3

    .line 99
    invoke-virtual {v1, v3}, La/fet;->e(I)Z

    .line 100
    .line 101
    .line 102
    move-result v3

    .line 103
    or-int/2addr v2, v3

    .line 104
    invoke-virtual {v1, v6}, La/fet;->g(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v3

    .line 108
    or-int/2addr v2, v3

    .line 109
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v3

    .line 113
    if-nez v2, :cond_3

    .line 114
    .line 115
    if-ne v3, v11, :cond_4

    .line 116
    .line 117
    :cond_3
    new-instance v3, La/nu80;

    .line 118
    .line 119
    const/4 v7, 0x0

    .line 120
    const/4 v8, 0x2

    .line 121
    move-object v4, v0

    .line 122
    invoke-direct/range {v3 .. v8}, La/nu80;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 129
    .line 130
    invoke-static {v1, v5, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5}, La/r790;->I0()La/k3t0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    check-cast v0, La/i3t0;

    .line 138
    .line 139
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    check-cast v0, La/ta90;

    .line 148
    .line 149
    invoke-virtual {v5}, La/r790;->G0()La/mni;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    iget-object v2, v2, La/mni;->o:La/ctf0;

    .line 154
    .line 155
    invoke-virtual {v5}, La/r790;->I0()La/k3t0;

    .line 156
    .line 157
    .line 158
    move-result-object v14

    .line 159
    invoke-virtual {v1, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    move-result v3

    .line 163
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object v4

    .line 167
    if-nez v3, :cond_5

    .line 168
    .line 169
    if-ne v4, v11, :cond_6

    .line 170
    .line 171
    :cond_5
    new-instance v12, La/xj80;

    .line 172
    .line 173
    const/16 v18, 0x0

    .line 174
    .line 175
    const/16 v19, 0xf

    .line 176
    .line 177
    const/4 v13, 0x1

    .line 178
    const-class v15, La/k3t0;

    .line 179
    .line 180
    const-string v16, "onAction"

    .line 181
    .line 182
    const-string v17, "onAction(Ljava/lang/Object;)V"

    .line 183
    .line 184
    invoke-direct/range {v12 .. v19}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v12}, La/fet;->o0(Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    move-object v4, v12

    .line 191
    :cond_6
    check-cast v4, La/jhy;

    .line 192
    .line 193
    move-object v12, v4

    .line 194
    check-cast v12, Lkotlin/jvm/functions/Function1;

    .line 195
    .line 196
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 197
    .line 198
    .line 199
    move-result v3

    .line 200
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v4

    .line 204
    if-nez v3, :cond_7

    .line 205
    .line 206
    if-ne v4, v11, :cond_8

    .line 207
    .line 208
    :cond_7
    new-instance v3, La/xj80;

    .line 209
    .line 210
    const/4 v9, 0x0

    .line 211
    const/16 v10, 0x10

    .line 212
    .line 213
    const/4 v4, 0x1

    .line 214
    const-class v6, La/r790;

    .line 215
    .line 216
    const-string v7, "onShowFileChooser"

    .line 217
    .line 218
    const-string v8, "onShowFileChooser(Landroid/webkit/ValueCallback;)V"

    .line 219
    .line 220
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    move-object v4, v3

    .line 227
    :cond_8
    check-cast v4, La/jhy;

    .line 228
    .line 229
    move-object v13, v4

    .line 230
    check-cast v13, Lkotlin/jvm/functions/Function1;

    .line 231
    .line 232
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 233
    .line 234
    .line 235
    move-result v3

    .line 236
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v4

    .line 240
    if-nez v3, :cond_9

    .line 241
    .line 242
    if-ne v4, v11, :cond_a

    .line 243
    .line 244
    :cond_9
    new-instance v3, La/xj80;

    .line 245
    .line 246
    const/4 v9, 0x0

    .line 247
    const/16 v10, 0x11

    .line 248
    .line 249
    const/4 v4, 0x1

    .line 250
    const-class v6, La/r790;

    .line 251
    .line 252
    const-string v7, "onPermissionRequest"

    .line 253
    .line 254
    const-string v8, "onPermissionRequest(Landroid/webkit/PermissionRequest;)V"

    .line 255
    .line 256
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    move-object v4, v3

    .line 263
    :cond_a
    check-cast v4, La/jhy;

    .line 264
    .line 265
    move-object v14, v4

    .line 266
    check-cast v14, Lkotlin/jvm/functions/Function1;

    .line 267
    .line 268
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v3

    .line 272
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-nez v3, :cond_b

    .line 277
    .line 278
    if-ne v4, v11, :cond_c

    .line 279
    .line 280
    :cond_b
    new-instance v3, La/xj80;

    .line 281
    .line 282
    const/4 v9, 0x0

    .line 283
    const/16 v10, 0x12

    .line 284
    .line 285
    const/4 v4, 0x1

    .line 286
    const-class v6, La/r790;

    .line 287
    .line 288
    const-string v7, "startIntentAction"

    .line 289
    .line 290
    const-string v8, "startIntentAction(Landroid/content/Intent;)V"

    .line 291
    .line 292
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 296
    .line 297
    .line 298
    move-object v4, v3

    .line 299
    :cond_c
    check-cast v4, La/jhy;

    .line 300
    .line 301
    move-object v15, v4

    .line 302
    check-cast v15, Lkotlin/jvm/functions/Function1;

    .line 303
    .line 304
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 305
    .line 306
    .line 307
    move-result v3

    .line 308
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v4

    .line 312
    if-nez v3, :cond_d

    .line 313
    .line 314
    if-ne v4, v11, :cond_e

    .line 315
    .line 316
    :cond_d
    new-instance v3, La/xj80;

    .line 317
    .line 318
    const/4 v9, 0x0

    .line 319
    const/16 v10, 0x13

    .line 320
    .line 321
    const/4 v4, 0x1

    .line 322
    const-class v6, La/r790;

    .line 323
    .line 324
    const-string v7, "startIntentActionAndFinish"

    .line 325
    .line 326
    const-string v8, "startIntentActionAndFinish(Landroid/content/Intent;)V"

    .line 327
    .line 328
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    move-object v4, v3

    .line 335
    :cond_e
    check-cast v4, La/jhy;

    .line 336
    .line 337
    move-object/from16 v16, v4

    .line 338
    .line 339
    check-cast v16, Lkotlin/jvm/functions/Function1;

    .line 340
    .line 341
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 342
    .line 343
    .line 344
    move-result v3

    .line 345
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 346
    .line 347
    .line 348
    move-result-object v4

    .line 349
    if-nez v3, :cond_f

    .line 350
    .line 351
    if-ne v4, v11, :cond_10

    .line 352
    .line 353
    :cond_f
    new-instance v3, La/xj80;

    .line 354
    .line 355
    const/4 v9, 0x0

    .line 356
    const/16 v10, 0x14

    .line 357
    .line 358
    const/4 v4, 0x1

    .line 359
    const-class v6, La/r790;

    .line 360
    .line 361
    const-string v7, "initWebView"

    .line 362
    .line 363
    const-string v8, "initWebView(Lorg/xplatform/feature/office/payment/impl/presentation/view/PaymentWebView;)V"

    .line 364
    .line 365
    invoke-direct/range {v3 .. v10}, La/xj80;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 366
    .line 367
    .line 368
    invoke-virtual {v1, v3}, La/fet;->o0(Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    move-object v4, v3

    .line 372
    :cond_10
    check-cast v4, La/jhy;

    .line 373
    .line 374
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 375
    .line 376
    const/16 v17, 0x0

    .line 377
    .line 378
    const/4 v7, 0x0

    .line 379
    move-object v8, v0

    .line 380
    move-object v9, v2

    .line 381
    move-object v10, v12

    .line 382
    move-object v11, v13

    .line 383
    move-object v12, v14

    .line 384
    move-object v13, v15

    .line 385
    move-object/from16 v14, v16

    .line 386
    .line 387
    move-object/from16 v16, v1

    .line 388
    .line 389
    move-object v15, v4

    .line 390
    invoke-static/range {v7 .. v17}, La/hp4;->p(La/mm40;La/ta90;La/ctf0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 391
    .line 392
    .line 393
    goto :goto_0

    .line 394
    :cond_11
    move-object/from16 v16, v1

    .line 395
    .line 396
    invoke-virtual/range {v16 .. v16}, La/fet;->X()V

    .line 397
    .line 398
    .line 399
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 400
    .line 401
    return-object v0

    .line 402
    :pswitch_0
    move-object/from16 v0, p1

    .line 403
    .line 404
    check-cast v0, Ljava/lang/Integer;

    .line 405
    .line 406
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 407
    .line 408
    .line 409
    move-result v0

    .line 410
    move-object/from16 v1, p2

    .line 411
    .line 412
    check-cast v1, Landroid/content/Intent;

    .line 413
    .line 414
    sget-object v5, La/r790;->Z1:La/xi70;

    .line 415
    .line 416
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 417
    .line 418
    .line 419
    if-ne v0, v2, :cond_15

    .line 420
    .line 421
    invoke-virtual {v4}, La/r790;->H0()La/qm90;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 426
    .line 427
    .line 428
    move-result-object v2

    .line 429
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 430
    .line 431
    .line 432
    invoke-static {v2, v1}, La/qm90;->b(Landroid/content/Context;Landroid/content/Intent;)Z

    .line 433
    .line 434
    .line 435
    move-result v0

    .line 436
    iget-object v2, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 437
    .line 438
    if-nez v0, :cond_13

    .line 439
    .line 440
    if-eqz v2, :cond_12

    .line 441
    .line 442
    new-array v0, v6, [Landroid/net/Uri;

    .line 443
    .line 444
    invoke-interface {v2, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_12
    iput-object v3, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 448
    .line 449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 450
    .line 451
    goto :goto_2

    .line 452
    :cond_13
    if-eqz v2, :cond_15

    .line 453
    .line 454
    invoke-virtual {v1}, Landroid/content/Intent;->getDataString()Ljava/lang/String;

    .line 455
    .line 456
    .line 457
    move-result-object v0

    .line 458
    if-nez v0, :cond_14

    .line 459
    .line 460
    const-string v0, ""

    .line 461
    .line 462
    :cond_14
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 463
    .line 464
    .line 465
    move-result-object v0

    .line 466
    filled-new-array {v0}, [Landroid/net/Uri;

    .line 467
    .line 468
    .line 469
    move-result-object v0

    .line 470
    goto :goto_1

    .line 471
    :cond_15
    move-object v0, v3

    .line 472
    :goto_1
    iget-object v1, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 473
    .line 474
    if-eqz v1, :cond_16

    .line 475
    .line 476
    invoke-interface {v1, v0}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 477
    .line 478
    .line 479
    :cond_16
    iput-object v3, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 480
    .line 481
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 482
    .line 483
    :goto_2
    return-object v0

    .line 484
    :pswitch_1
    move-object/from16 v0, p1

    .line 485
    .line 486
    check-cast v0, Ljava/lang/Integer;

    .line 487
    .line 488
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 489
    .line 490
    .line 491
    move-result v0

    .line 492
    move-object/from16 v1, p2

    .line 493
    .line 494
    check-cast v1, Ljava/io/File;

    .line 495
    .line 496
    sget-object v7, La/r790;->Z1:La/xi70;

    .line 497
    .line 498
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 499
    .line 500
    .line 501
    if-ne v0, v2, :cond_17

    .line 502
    .line 503
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 508
    .line 509
    .line 510
    move-result-object v2

    .line 511
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 512
    .line 513
    .line 514
    move-result-object v2

    .line 515
    new-instance v7, Ljava/lang/StringBuilder;

    .line 516
    .line 517
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 518
    .line 519
    .line 520
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 521
    .line 522
    .line 523
    const-string v2, ".provider"

    .line 524
    .line 525
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v2

    .line 532
    invoke-static {v0, v1, v2}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 533
    .line 534
    .line 535
    move-result-object v0

    .line 536
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    new-array v1, v5, [Landroid/net/Uri;

    .line 540
    .line 541
    aput-object v0, v1, v6

    .line 542
    .line 543
    goto :goto_3

    .line 544
    :cond_17
    move-object v1, v3

    .line 545
    :goto_3
    iget-object v0, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 546
    .line 547
    if-eqz v0, :cond_18

    .line 548
    .line 549
    invoke-interface {v0, v1}, Landroid/webkit/ValueCallback;->onReceiveValue(Ljava/lang/Object;)V

    .line 550
    .line 551
    .line 552
    :cond_18
    iput-object v3, v4, La/r790;->S1:Landroid/webkit/ValueCallback;

    .line 553
    .line 554
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 555
    .line 556
    return-object v0

    .line 557
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
