.class public final synthetic La/re4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ze4;


# direct methods
.method public synthetic constructor <init>(La/ze4;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/re4;->a:B

    iput-object p1, p0, La/re4;->b:La/ze4;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/re4;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/re4;->b:La/ze4;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, La/ghk0;

    .line 13
    .line 14
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 15
    .line 16
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    new-instance v2, La/fe4;

    .line 21
    .line 22
    invoke-direct {v2, v0}, La/fe4;-><init>(La/ghk0;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object v0

    .line 31
    :pswitch_0
    move-object/from16 v0, p1

    .line 32
    .line 33
    check-cast v0, Ljava/lang/String;

    .line 34
    .line 35
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    new-instance v2, La/ie4;

    .line 45
    .line 46
    invoke-direct {v2, v0}, La/ie4;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_1
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, La/x5q0;

    .line 58
    .line 59
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    instance-of v1, v0, La/w5q0;

    .line 65
    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    check-cast v0, La/w5q0;

    .line 73
    .line 74
    iget-object v0, v0, La/w5q0;->a:Ljava/lang/String;

    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    new-instance v2, La/ge4;

    .line 80
    .line 81
    invoke-direct {v2, v0}, La/ge4;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_2
    move-object/from16 v0, p1

    .line 91
    .line 92
    check-cast v0, La/x5q0;

    .line 93
    .line 94
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    instance-of v1, v0, La/w5q0;

    .line 100
    .line 101
    if-eqz v1, :cond_1

    .line 102
    .line 103
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v0, La/w5q0;

    .line 108
    .line 109
    iget-object v0, v0, La/w5q0;->a:Ljava/lang/String;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    new-instance v2, La/he4;

    .line 115
    .line 116
    invoke-direct {v2, v0}, La/he4;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 120
    .line 121
    .line 122
    :cond_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    return-object v0

    .line 125
    :pswitch_3
    move-object/from16 v0, p1

    .line 126
    .line 127
    check-cast v0, Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;

    .line 128
    .line 129
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    new-instance v2, La/yd4;

    .line 139
    .line 140
    invoke-direct {v2, v0}, La/yd4;-><init>(Lorg/xplatform/security/api/presentation/models/ConfirmationNewPlaceResultType;)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 147
    .line 148
    return-object v0

    .line 149
    :pswitch_4
    move-object/from16 v0, p1

    .line 150
    .line 151
    check-cast v0, La/iqt0;

    .line 152
    .line 153
    sget-object v1, La/ze4;->g2:La/qek0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2}, La/ze4;->K0()La/k3t0;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    new-instance v2, La/wd4;

    .line 163
    .line 164
    invoke-direct {v2, v0}, La/wd4;-><init>(La/iqt0;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 171
    .line 172
    return-object v0

    .line 173
    :pswitch_5
    move-object/from16 v1, p1

    .line 174
    .line 175
    check-cast v1, La/yf4;

    .line 176
    .line 177
    sget-object v2, La/ze4;->g2:La/qek0;

    .line 178
    .line 179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 180
    .line 181
    .line 182
    instance-of v2, v1, La/xf4;

    .line 183
    .line 184
    iget-object v4, v0, La/re4;->b:La/ze4;

    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    const/4 v7, 0x0

    .line 188
    if-eqz v2, :cond_2

    .line 189
    .line 190
    check-cast v1, La/xf4;

    .line 191
    .line 192
    iget v5, v1, La/xf4;->a:I

    .line 193
    .line 194
    iget-object v1, v4, La/ze4;->f2:La/s0r;

    .line 195
    .line 196
    sget-object v2, La/ze4;->h2:[La/iiy;

    .line 197
    .line 198
    aget-object v0, v2, v0

    .line 199
    .line 200
    invoke-virtual {v1, v0, v4}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    check-cast v0, La/tik;

    .line 208
    .line 209
    iget-object v6, v0, La/tik;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 210
    .line 211
    iget-object v0, v4, Landroidx/fragment/app/Fragment;->u1:La/glz;

    .line 212
    .line 213
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    sget-object v1, La/tvk;->a:La/rwj;

    .line 218
    .line 219
    sget-object v1, La/ys10;->a:La/vs10;

    .line 220
    .line 221
    new-instance v3, La/d21;

    .line 222
    .line 223
    const/4 v8, 0x1

    .line 224
    invoke-direct/range {v3 .. v8}, La/d21;-><init>(Ljava/lang/Object;ILjava/lang/Object;La/yje;B)V

    .line 225
    .line 226
    .line 227
    const/4 v2, 0x2

    .line 228
    invoke-static {v0, v1, v7, v3, v2}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 229
    .line 230
    .line 231
    goto/16 :goto_0

    .line 232
    .line 233
    :cond_2
    sget-object v2, La/sf4;->a:La/sf4;

    .line 234
    .line 235
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    move-result v2

    .line 239
    if-eqz v2, :cond_4

    .line 240
    .line 241
    iget-object v1, v4, La/ze4;->Z1:La/pek0;

    .line 242
    .line 243
    if-eqz v1, :cond_3

    .line 244
    .line 245
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-static {v1, v0}, La/pek0;->n(Landroidx/fragment/app/e;Z)V

    .line 253
    .line 254
    .line 255
    goto/16 :goto_0

    .line 256
    .line 257
    :cond_3
    const-string v0, "authEntryPointsDialogFactory"

    .line 258
    .line 259
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    throw v7

    .line 263
    :cond_4
    instance-of v0, v1, La/tf4;

    .line 264
    .line 265
    const-string v2, "actionDialogManager"

    .line 266
    .line 267
    if-eqz v0, :cond_7

    .line 268
    .line 269
    check-cast v1, La/tf4;

    .line 270
    .line 271
    iget-object v9, v1, La/tf4;->a:Ljava/lang/String;

    .line 272
    .line 273
    iget-object v10, v1, La/tf4;->b:Ljava/lang/String;

    .line 274
    .line 275
    iget-boolean v0, v1, La/tf4;->c:Z

    .line 276
    .line 277
    iget-object v1, v4, La/ze4;->c2:La/ii;

    .line 278
    .line 279
    if-eqz v1, :cond_6

    .line 280
    .line 281
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 282
    .line 283
    const v2, 0x7f130479

    .line 284
    .line 285
    .line 286
    invoke-virtual {v4, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v11

    .line 290
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    if-eqz v0, :cond_5

    .line 294
    .line 295
    const v0, 0x7f13097b

    .line 296
    .line 297
    .line 298
    invoke-virtual {v4, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 299
    .line 300
    .line 301
    move-result-object v7

    .line 302
    :cond_5
    move-object v12, v7

    .line 303
    sget-object v17, La/n12;->b:La/n12;

    .line 304
    .line 305
    const/16 v18, 0x0

    .line 306
    .line 307
    const/16 v19, 0x5d0

    .line 308
    .line 309
    const/4 v13, 0x0

    .line 310
    const-string v14, "KEY_REQUEST_SUPPORT"

    .line 311
    .line 312
    const/4 v15, 0x0

    .line 313
    const/16 v16, 0x0

    .line 314
    .line 315
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    invoke-virtual {v1, v8, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 326
    .line 327
    .line 328
    goto/16 :goto_0

    .line 329
    .line 330
    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    throw v7

    .line 334
    :cond_7
    instance-of v0, v1, La/uf4;

    .line 335
    .line 336
    if-eqz v0, :cond_9

    .line 337
    .line 338
    check-cast v1, La/uf4;

    .line 339
    .line 340
    iget-object v0, v1, La/uf4;->a:La/d7a;

    .line 341
    .line 342
    iget-object v1, v4, La/ze4;->b2:La/gl5;

    .line 343
    .line 344
    if-eqz v1, :cond_8

    .line 345
    .line 346
    const v1, 0x7f13019e

    .line 347
    .line 348
    .line 349
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 354
    .line 355
    .line 356
    const-string v2, "KEY_REQUEST_CAPTCHA_CODE_DIALOG"

    .line 357
    .line 358
    invoke-static {v4, v2, v0, v1}, La/gl5;->q(Landroidx/fragment/app/Fragment;Ljava/lang/String;La/d7a;Ljava/lang/String;)V

    .line 359
    .line 360
    .line 361
    goto/16 :goto_0

    .line 362
    .line 363
    :cond_8
    const-string v0, "captchaDialogDelegate"

    .line 364
    .line 365
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 366
    .line 367
    .line 368
    throw v7

    .line 369
    :cond_9
    instance-of v0, v1, La/rf4;

    .line 370
    .line 371
    if-eqz v0, :cond_a

    .line 372
    .line 373
    const-string v0, "open/paysystems"

    .line 374
    .line 375
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 376
    .line 377
    .line 378
    move-result-object v1

    .line 379
    invoke-static {v1, v0}, La/j120;->d0(Landroid/content/Context;Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    goto/16 :goto_0

    .line 383
    .line 384
    :cond_a
    sget-object v0, La/vf4;->a:La/vf4;

    .line 385
    .line 386
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v0

    .line 390
    if-eqz v0, :cond_c

    .line 391
    .line 392
    iget-object v0, v4, La/ze4;->c2:La/ii;

    .line 393
    .line 394
    if-eqz v0, :cond_b

    .line 395
    .line 396
    new-instance v8, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 397
    .line 398
    const v1, 0x7f1307bb

    .line 399
    .line 400
    .line 401
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 402
    .line 403
    .line 404
    move-result-object v9

    .line 405
    const v1, 0x7f13131f

    .line 406
    .line 407
    .line 408
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v10

    .line 412
    const v1, 0x7f130e5d

    .line 413
    .line 414
    .line 415
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v11

    .line 419
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 420
    .line 421
    .line 422
    sget-object v17, La/n12;->b:La/n12;

    .line 423
    .line 424
    const/16 v18, 0x0

    .line 425
    .line 426
    const/16 v19, 0x5f8

    .line 427
    .line 428
    const/4 v12, 0x0

    .line 429
    const/4 v13, 0x0

    .line 430
    const/4 v14, 0x0

    .line 431
    const/4 v15, 0x0

    .line 432
    const/16 v16, 0x0

    .line 433
    .line 434
    invoke-direct/range {v8 .. v19}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 435
    .line 436
    .line 437
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 438
    .line 439
    .line 440
    move-result-object v1

    .line 441
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 442
    .line 443
    .line 444
    invoke-virtual {v0, v8, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 445
    .line 446
    .line 447
    goto :goto_0

    .line 448
    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 449
    .line 450
    .line 451
    throw v7

    .line 452
    :cond_c
    sget-object v0, La/wf4;->a:La/wf4;

    .line 453
    .line 454
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 455
    .line 456
    .line 457
    move-result v0

    .line 458
    if-eqz v0, :cond_e

    .line 459
    .line 460
    new-instance v0, La/nvu;

    .line 461
    .line 462
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    invoke-direct {v0, v1}, La/nvu;-><init>(Landroid/content/Context;)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v0}, La/nvu;->Z()V

    .line 470
    .line 471
    .line 472
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 473
    .line 474
    .line 475
    move-result-object v0

    .line 476
    const/4 v1, 0x1

    .line 477
    if-eqz v0, :cond_d

    .line 478
    .line 479
    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 480
    .line 481
    .line 482
    move-result v0

    .line 483
    if-ne v0, v1, :cond_d

    .line 484
    .line 485
    goto :goto_0

    .line 486
    :cond_d
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 487
    .line 488
    .line 489
    move-result-object v0

    .line 490
    const v2, 0x7f13072f

    .line 491
    .line 492
    .line 493
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-static {v0, v2, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 502
    .line 503
    .line 504
    goto :goto_0

    .line 505
    :cond_e
    sget-object v0, La/qf4;->a:La/qf4;

    .line 506
    .line 507
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 508
    .line 509
    .line 510
    move-result v0

    .line 511
    if-eqz v0, :cond_10

    .line 512
    .line 513
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 514
    .line 515
    .line 516
    move-result-object v0

    .line 517
    if-eqz v0, :cond_f

    .line 518
    .line 519
    invoke-virtual {v0}, Landroid/app/Activity;->finishAffinity()V

    .line 520
    .line 521
    .line 522
    :cond_f
    :goto_0
    invoke-virtual {v4}, La/ze4;->K0()La/k3t0;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    sget-object v1, La/md4;->a:La/md4;

    .line 527
    .line 528
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 529
    .line 530
    .line 531
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 532
    .line 533
    goto :goto_1

    .line 534
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 535
    .line 536
    .line 537
    const/4 v0, 0x0

    .line 538
    :goto_1
    return-object v0

    .line 539
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
