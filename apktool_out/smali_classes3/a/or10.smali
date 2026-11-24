.class public final synthetic La/or10;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qr10;


# direct methods
.method public synthetic constructor <init>(La/qr10;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/or10;->a:B

    iput-object p1, p0, La/or10;->b:La/qr10;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/or10;->a:B

    .line 4
    .line 5
    iget-object v2, v0, La/or10;->b:La/qr10;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v0, p1

    .line 11
    .line 12
    check-cast v0, Ljava/lang/String;

    .line 13
    .line 14
    move-object/from16 v1, p2

    .line 15
    .line 16
    check-cast v1, Landroid/os/Bundle;

    .line 17
    .line 18
    sget-object v3, La/qr10;->V1:La/evz;

    .line 19
    .line 20
    const-string v3, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 21
    .line 22
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const-string v3, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 27
    .line 28
    invoke-virtual {v1, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    invoke-virtual {v2}, La/qr10;->I0()La/k3t0;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    new-instance v3, La/l780;

    .line 37
    .line 38
    invoke-direct {v3, v0, v1}, La/l780;-><init>(IZ)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 45
    .line 46
    return-object v0

    .line 47
    :pswitch_0
    move-object/from16 v0, p1

    .line 48
    .line 49
    check-cast v0, Ljava/lang/String;

    .line 50
    .line 51
    move-object/from16 v1, p2

    .line 52
    .line 53
    check-cast v1, Landroid/os/Bundle;

    .line 54
    .line 55
    sget-object v3, La/qr10;->V1:La/evz;

    .line 56
    .line 57
    const-string v3, "KEY_PICKER_MODEL_REQUEST"

    .line 58
    .line 59
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    const-string v3, "PICKER_PARAMS_KEY"

    .line 64
    .line 65
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lorg/xplatform/picker/api/presentation/PickerParams;

    .line 70
    .line 71
    if-eqz v1, :cond_0

    .line 72
    .line 73
    invoke-virtual {v2}, La/qr10;->I0()La/k3t0;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    new-instance v3, La/k780;

    .line 78
    .line 79
    invoke-direct {v3, v0, v1}, La/k780;-><init>(ILorg/xplatform/picker/api/presentation/PickerParams;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    :cond_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object v0

    .line 88
    :pswitch_1
    move-object/from16 v0, p1

    .line 89
    .line 90
    check-cast v0, Ljava/lang/String;

    .line 91
    .line 92
    move-object/from16 v1, p2

    .line 93
    .line 94
    check-cast v1, Landroid/os/Bundle;

    .line 95
    .line 96
    sget-object v3, La/qr10;->V1:La/evz;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, La/qr10;->G0()La/k3t0;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    sget-object v1, La/lq9;->a:La/lq9;

    .line 109
    .line 110
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    return-object v0

    .line 116
    :pswitch_2
    iget-object v3, v0, La/or10;->b:La/qr10;

    .line 117
    .line 118
    iget-object v0, v3, La/qr10;->N1:La/a8z;

    .line 119
    .line 120
    move-object/from16 v9, p1

    .line 121
    .line 122
    check-cast v9, La/fet;

    .line 123
    .line 124
    move-object/from16 v1, p2

    .line 125
    .line 126
    check-cast v1, Ljava/lang/Integer;

    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 129
    .line 130
    .line 131
    move-result v1

    .line 132
    sget-object v2, La/qr10;->V1:La/evz;

    .line 133
    .line 134
    and-int/lit8 v2, v1, 0x3

    .line 135
    .line 136
    const/4 v4, 0x2

    .line 137
    const/4 v10, 0x1

    .line 138
    if-eq v2, v4, :cond_1

    .line 139
    .line 140
    move v2, v10

    .line 141
    goto :goto_0

    .line 142
    :cond_1
    const/4 v2, 0x0

    .line 143
    :goto_0
    and-int/2addr v1, v10

    .line 144
    invoke-virtual {v9, v1, v2}, La/fet;->U(IZ)Z

    .line 145
    .line 146
    .line 147
    move-result v1

    .line 148
    if-eqz v1, :cond_d

    .line 149
    .line 150
    invoke-virtual {v3}, La/qr10;->G0()La/k3t0;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    sget-object v12, La/ukd;->a:La/cl5;

    .line 163
    .line 164
    if-nez v1, :cond_2

    .line 165
    .line 166
    if-ne v2, v12, :cond_3

    .line 167
    .line 168
    :cond_2
    new-instance v1, La/pf10;

    .line 169
    .line 170
    const/4 v7, 0x0

    .line 171
    const/16 v8, 0x12

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    const-class v4, La/qr10;

    .line 175
    .line 176
    const-string v5, "handleHistorySideEffect"

    .line 177
    .line 178
    const-string v6, "handleHistorySideEffect(Lorg/xplatform/callback/impl/presentation/history_compose/actions/CallbackHistorySideEffect;)V"

    .line 179
    .line 180
    invoke-direct/range {v1 .. v8}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 184
    .line 185
    .line 186
    move-object v2, v1

    .line 187
    :cond_3
    check-cast v2, La/jhy;

    .line 188
    .line 189
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 190
    .line 191
    sget-object v1, La/lkz;->a:La/lkz;

    .line 192
    .line 193
    invoke-static {v2, v9}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    invoke-virtual {v9, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    or-int/2addr v1, v2

    .line 206
    const/4 v13, 0x3

    .line 207
    invoke-virtual {v9, v13}, La/fet;->e(I)Z

    .line 208
    .line 209
    .line 210
    move-result v2

    .line 211
    or-int/2addr v1, v2

    .line 212
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    or-int/2addr v1, v2

    .line 217
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    const/4 v5, 0x0

    .line 222
    if-nez v1, :cond_5

    .line 223
    .line 224
    if-ne v2, v12, :cond_4

    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_4
    move-object v11, v5

    .line 228
    goto :goto_2

    .line 229
    :cond_5
    :goto_1
    new-instance v1, La/p000;

    .line 230
    .line 231
    const/4 v6, 0x5

    .line 232
    move-object v2, v11

    .line 233
    invoke-direct/range {v1 .. v6}, La/p000;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 234
    .line 235
    .line 236
    move-object v11, v5

    .line 237
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    move-object v2, v1

    .line 241
    :goto_2
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 242
    .line 243
    invoke-static {v9, v3, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 244
    .line 245
    .line 246
    invoke-virtual {v3}, La/qr10;->I0()La/k3t0;

    .line 247
    .line 248
    .line 249
    move-result-object v14

    .line 250
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    move-result-object v2

    .line 258
    if-nez v1, :cond_6

    .line 259
    .line 260
    if-ne v2, v12, :cond_7

    .line 261
    .line 262
    :cond_6
    new-instance v1, La/pf10;

    .line 263
    .line 264
    const/4 v7, 0x0

    .line 265
    const/16 v8, 0x13

    .line 266
    .line 267
    const/4 v2, 0x1

    .line 268
    const-class v4, La/qr10;

    .line 269
    .line 270
    const-string v5, "handleCallbackSideEffect"

    .line 271
    .line 272
    const-string v6, "handleCallbackSideEffect(Lorg/xplatform/callback/impl/presentation/call/compose/models/OrderCallBackSideEffect;)V"

    .line 273
    .line 274
    invoke-direct/range {v1 .. v8}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    move-object v2, v1

    .line 281
    :cond_7
    check-cast v2, La/jhy;

    .line 282
    .line 283
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 284
    .line 285
    invoke-static {v2, v9}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 286
    .line 287
    .line 288
    move-result-object v4

    .line 289
    invoke-virtual {v9, v14}, La/fet;->i(Ljava/lang/Object;)Z

    .line 290
    .line 291
    .line 292
    move-result v1

    .line 293
    invoke-virtual {v9, v3}, La/fet;->i(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    or-int/2addr v1, v2

    .line 298
    invoke-virtual {v9, v13}, La/fet;->e(I)Z

    .line 299
    .line 300
    .line 301
    move-result v2

    .line 302
    or-int/2addr v1, v2

    .line 303
    invoke-virtual {v9, v4}, La/fet;->g(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v2

    .line 307
    or-int/2addr v1, v2

    .line 308
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v2

    .line 312
    if-nez v1, :cond_8

    .line 313
    .line 314
    if-ne v2, v12, :cond_9

    .line 315
    .line 316
    :cond_8
    new-instance v1, La/p000;

    .line 317
    .line 318
    const/4 v6, 0x6

    .line 319
    move-object v5, v11

    .line 320
    move-object v2, v14

    .line 321
    invoke-direct/range {v1 .. v6}, La/p000;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 322
    .line 323
    .line 324
    invoke-virtual {v9, v1}, La/fet;->o0(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    move-object v2, v1

    .line 328
    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function2;

    .line 329
    .line 330
    invoke-static {v9, v3, v2}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 331
    .line 332
    .line 333
    iget-object v1, v3, La/qr10;->R1:La/cgx0;

    .line 334
    .line 335
    sget-object v2, La/qr10;->W1:[La/iiy;

    .line 336
    .line 337
    aget-object v2, v2, v10

    .line 338
    .line 339
    invoke-virtual {v1, v3, v2}, La/cgx0;->r(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Boolean;

    .line 340
    .line 341
    .line 342
    move-result-object v1

    .line 343
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 344
    .line 345
    .line 346
    move-result v1

    .line 347
    sget-object v2, La/jm40;->b:La/jm40;

    .line 348
    .line 349
    if-eqz v1, :cond_a

    .line 350
    .line 351
    invoke-static {v2}, La/knm0;->r(La/mm40;)La/mm40;

    .line 352
    .line 353
    .line 354
    move-result-object v2

    .line 355
    :cond_a
    move-object v4, v2

    .line 356
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v1

    .line 360
    check-cast v1, La/k3t0;

    .line 361
    .line 362
    check-cast v1, La/i3t0;

    .line 363
    .line 364
    invoke-virtual {v1, v9}, La/i3t0;->y(La/fet;)La/pz40;

    .line 365
    .line 366
    .line 367
    move-result-object v1

    .line 368
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    move-object v5, v1

    .line 373
    check-cast v5, La/tr10;

    .line 374
    .line 375
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 376
    .line 377
    .line 378
    move-result-object v0

    .line 379
    check-cast v0, La/k3t0;

    .line 380
    .line 381
    invoke-virtual {v9, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 382
    .line 383
    .line 384
    move-result v1

    .line 385
    invoke-virtual {v9}, La/fet;->P()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    if-nez v1, :cond_b

    .line 390
    .line 391
    if-ne v2, v12, :cond_c

    .line 392
    .line 393
    :cond_b
    new-instance v14, La/pf10;

    .line 394
    .line 395
    const/16 v20, 0x0

    .line 396
    .line 397
    const/16 v21, 0x14

    .line 398
    .line 399
    const/4 v15, 0x1

    .line 400
    const-class v17, La/k3t0;

    .line 401
    .line 402
    const-string v18, "onAction"

    .line 403
    .line 404
    const-string v19, "onAction(Ljava/lang/Object;)V"

    .line 405
    .line 406
    move-object/from16 v16, v0

    .line 407
    .line 408
    invoke-direct/range {v14 .. v21}, La/pf10;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 409
    .line 410
    .line 411
    invoke-virtual {v9, v14}, La/fet;->o0(Ljava/lang/Object;)V

    .line 412
    .line 413
    .line 414
    move-object v2, v14

    .line 415
    :cond_c
    check-cast v2, La/jhy;

    .line 416
    .line 417
    move-object v6, v2

    .line 418
    check-cast v6, Lkotlin/jvm/functions/Function1;

    .line 419
    .line 420
    new-instance v0, La/csw;

    .line 421
    .line 422
    invoke-direct {v0, v3, v13}, La/csw;-><init>(Ljava/lang/Object;B)V

    .line 423
    .line 424
    .line 425
    const v1, 0x1860e1dd

    .line 426
    .line 427
    .line 428
    invoke-static {v1, v0, v9}, La/u1c;->M(ILa/wdr;La/fet;)La/ugd;

    .line 429
    .line 430
    .line 431
    move-result-object v7

    .line 432
    move-object v8, v9

    .line 433
    const/16 v9, 0xc00

    .line 434
    .line 435
    invoke-static/range {v4 .. v9}, La/c3x;->d(La/mm40;La/tr10;Lkotlin/jvm/functions/Function1;La/ugd;La/fet;I)V

    .line 436
    .line 437
    .line 438
    goto :goto_3

    .line 439
    :cond_d
    move-object v8, v9

    .line 440
    invoke-virtual {v8}, La/fet;->X()V

    .line 441
    .line 442
    .line 443
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 444
    .line 445
    return-object v0

    .line 446
    :pswitch_3
    move-object/from16 v0, p1

    .line 447
    .line 448
    check-cast v0, Ljava/lang/String;

    .line 449
    .line 450
    move-object/from16 v1, p2

    .line 451
    .line 452
    check-cast v1, Landroid/os/Bundle;

    .line 453
    .line 454
    sget-object v3, La/qr10;->V1:La/evz;

    .line 455
    .line 456
    const-string v3, "REQUEST_SELECT_THEME_DIALOG_KEY"

    .line 457
    .line 458
    invoke-static {v1, v0, v3}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 459
    .line 460
    .line 461
    move-result v0

    .line 462
    invoke-virtual {v2}, La/qr10;->I0()La/k3t0;

    .line 463
    .line 464
    .line 465
    move-result-object v1

    .line 466
    new-instance v2, La/o780;

    .line 467
    .line 468
    invoke-direct {v2, v0}, La/o780;-><init>(I)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 472
    .line 473
    .line 474
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 475
    .line 476
    return-object v0

    .line 477
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
