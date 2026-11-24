.class public final synthetic La/n47;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/q47;


# direct methods
.method public synthetic constructor <init>(La/q47;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/n47;->a:B

    iput-object p1, p0, La/n47;->b:La/q47;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/n47;->a:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const-string v3, "BUNDLE_BET_ID"

    .line 8
    .line 9
    const/16 v4, 0x21

    .line 10
    .line 11
    iget-object v5, v0, La/n47;->b:La/q47;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v0, p1

    .line 17
    .line 18
    check-cast v0, Ljava/lang/String;

    .line 19
    .line 20
    move-object/from16 v1, p2

    .line 21
    .line 22
    check-cast v1, Landroid/os/Bundle;

    .line 23
    .line 24
    sget-object v2, La/q47;->U1:La/gl5;

    .line 25
    .line 26
    const-string v2, "REQUEST_EDIT_COUPON_DIALOG"

    .line 27
    .line 28
    invoke-static {v1, v0, v2}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sget-object v1, La/j37;->a:La/j37;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

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
    move-object/from16 v0, p1

    .line 50
    .line 51
    check-cast v0, Ljava/lang/String;

    .line 52
    .line 53
    move-object/from16 v1, p2

    .line 54
    .line 55
    check-cast v1, Landroid/os/Bundle;

    .line 56
    .line 57
    sget-object v2, La/q47;->U1:La/gl5;

    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 66
    .line 67
    if-gt v0, v4, :cond_1

    .line 68
    .line 69
    const-string v0, "RESULT_KEY_CALENDAR_DATE_RANGE"

    .line 70
    .line 71
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {v1}, La/uq6;->B(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Landroid/os/Parcelable;

    .line 81
    .line 82
    :goto_1
    check-cast v0, Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    new-instance v2, La/q17;

    .line 91
    .line 92
    invoke-direct {v2, v0}, La/q17;-><init>(Lorg/xplatform/uikit/compose/components/calendar/model/DateRangeModel;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object v0

    .line 101
    :pswitch_1
    move-object/from16 v0, p1

    .line 102
    .line 103
    check-cast v0, Ljava/lang/String;

    .line 104
    .line 105
    move-object/from16 v1, p2

    .line 106
    .line 107
    check-cast v1, Landroid/os/Bundle;

    .line 108
    .line 109
    sget-object v2, La/q47;->U1:La/gl5;

    .line 110
    .line 111
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 118
    .line 119
    if-gt v0, v4, :cond_3

    .line 120
    .line 121
    const-string v0, "RESULT_KEY_CALENDAR_SIMPLE_DATE"

    .line 122
    .line 123
    invoke-virtual {v1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    goto :goto_2

    .line 128
    :cond_3
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, Landroid/os/Parcelable;

    .line 133
    .line 134
    :goto_2
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 135
    .line 136
    if-eqz v0, :cond_4

    .line 137
    .line 138
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    new-instance v2, La/r17;

    .line 143
    .line 144
    invoke-direct {v2, v0}, La/r17;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    :cond_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    return-object v0

    .line 153
    :pswitch_2
    move-object/from16 v0, p1

    .line 154
    .line 155
    check-cast v0, Ljava/lang/String;

    .line 156
    .line 157
    move-object/from16 v1, p2

    .line 158
    .line 159
    check-cast v1, Landroid/os/Bundle;

    .line 160
    .line 161
    sget-object v2, La/q47;->U1:La/gl5;

    .line 162
    .line 163
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    const-string v0, "RESULT_KEY_CALENDAR_START_SIMPLE_DATE"

    .line 170
    .line 171
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 172
    .line 173
    .line 174
    move-result-wide v2

    .line 175
    const-string v0, "RESULT_KEY_CALENDAR_END_SIMPLE_DATE"

    .line 176
    .line 177
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 178
    .line 179
    .line 180
    move-result-wide v0

    .line 181
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 182
    .line 183
    .line 184
    move-result-object v4

    .line 185
    new-instance v5, La/s17;

    .line 186
    .line 187
    invoke-direct {v5, v2, v3, v0, v1}, La/s17;-><init>(JJ)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v5}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 191
    .line 192
    .line 193
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 194
    .line 195
    return-object v0

    .line 196
    :pswitch_3
    move-object/from16 v0, p1

    .line 197
    .line 198
    check-cast v0, Ljava/lang/String;

    .line 199
    .line 200
    move-object/from16 v1, p2

    .line 201
    .line 202
    check-cast v1, Landroid/os/Bundle;

    .line 203
    .line 204
    sget-object v4, La/q47;->U1:La/gl5;

    .line 205
    .line 206
    const-string v4, "REQUEST_KEY_SUCCESS_SALE"

    .line 207
    .line 208
    invoke-static {v1, v0, v4}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 209
    .line 210
    .line 211
    move-result v0

    .line 212
    if-nez v0, :cond_5

    .line 213
    .line 214
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_5
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 218
    .line 219
    .line 220
    move-result-object v0

    .line 221
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    new-instance v2, La/g37;

    .line 226
    .line 227
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-direct {v2, v0}, La/g37;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 237
    .line 238
    :goto_3
    return-object v0

    .line 239
    :pswitch_4
    move-object/from16 v0, p1

    .line 240
    .line 241
    check-cast v0, Ljava/lang/String;

    .line 242
    .line 243
    move-object/from16 v1, p2

    .line 244
    .line 245
    check-cast v1, Landroid/os/Bundle;

    .line 246
    .line 247
    sget-object v4, La/q47;->U1:La/gl5;

    .line 248
    .line 249
    const-string v4, "REQUEST_BET_UPDATE_BY_ID"

    .line 250
    .line 251
    invoke-static {v1, v0, v4}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 252
    .line 253
    .line 254
    move-result v0

    .line 255
    if-nez v0, :cond_6

    .line 256
    .line 257
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 258
    .line 259
    goto :goto_4

    .line 260
    :cond_6
    invoke-virtual {v1, v3, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-virtual {v5}, La/q47;->I0()La/k3t0;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    new-instance v2, La/g37;

    .line 269
    .line 270
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-direct {v2, v0}, La/g37;-><init>(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 277
    .line 278
    .line 279
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    :goto_4
    return-object v0

    .line 282
    :pswitch_5
    move-object/from16 v1, p1

    .line 283
    .line 284
    check-cast v1, La/fet;

    .line 285
    .line 286
    move-object/from16 v2, p2

    .line 287
    .line 288
    check-cast v2, Ljava/lang/Integer;

    .line 289
    .line 290
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    sget-object v3, La/q47;->U1:La/gl5;

    .line 295
    .line 296
    and-int/lit8 v3, v2, 0x3

    .line 297
    .line 298
    const/4 v4, 0x0

    .line 299
    const/4 v5, 0x1

    .line 300
    const/4 v6, 0x2

    .line 301
    if-eq v3, v6, :cond_7

    .line 302
    .line 303
    move v3, v5

    .line 304
    goto :goto_5

    .line 305
    :cond_7
    move v3, v4

    .line 306
    :goto_5
    and-int/2addr v2, v5

    .line 307
    invoke-virtual {v1, v2, v3}, La/fet;->U(IZ)Z

    .line 308
    .line 309
    .line 310
    move-result v2

    .line 311
    if-eqz v2, :cond_1d

    .line 312
    .line 313
    iget-object v9, v0, La/n47;->b:La/q47;

    .line 314
    .line 315
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    check-cast v0, La/i3t0;

    .line 320
    .line 321
    invoke-virtual {v0, v1}, La/i3t0;->y(La/fet;)La/pz40;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 330
    .line 331
    .line 332
    move-result v3

    .line 333
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 334
    .line 335
    .line 336
    move-result-object v7

    .line 337
    sget-object v15, La/ukd;->a:La/cl5;

    .line 338
    .line 339
    if-nez v3, :cond_8

    .line 340
    .line 341
    if-ne v7, v15, :cond_9

    .line 342
    .line 343
    :cond_8
    new-instance v7, La/ur6;

    .line 344
    .line 345
    const/4 v13, 0x0

    .line 346
    const/16 v14, 0xf

    .line 347
    .line 348
    const/4 v8, 0x1

    .line 349
    const-class v10, La/q47;

    .line 350
    .line 351
    const-string v11, "collectSideEffect"

    .line 352
    .line 353
    const-string v12, "collectSideEffect(Lorg/xplatform/bet_history/history/presentation/model/viewmodel/BetHistorySideEffect;)V"

    .line 354
    .line 355
    invoke-direct/range {v7 .. v14}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 356
    .line 357
    .line 358
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 359
    .line 360
    .line 361
    :cond_9
    check-cast v7, La/jhy;

    .line 362
    .line 363
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 364
    .line 365
    sget-object v3, La/lkz;->a:La/lkz;

    .line 366
    .line 367
    invoke-static {v7, v1}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 368
    .line 369
    .line 370
    move-result-object v10

    .line 371
    invoke-virtual {v1, v2}, La/fet;->i(Ljava/lang/Object;)Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    invoke-virtual {v1, v9}, La/fet;->i(Ljava/lang/Object;)Z

    .line 376
    .line 377
    .line 378
    move-result v7

    .line 379
    or-int/2addr v3, v7

    .line 380
    const/4 v13, 0x3

    .line 381
    invoke-virtual {v1, v13}, La/fet;->e(I)Z

    .line 382
    .line 383
    .line 384
    move-result v7

    .line 385
    or-int/2addr v3, v7

    .line 386
    invoke-virtual {v1, v10}, La/fet;->g(Ljava/lang/Object;)Z

    .line 387
    .line 388
    .line 389
    move-result v7

    .line 390
    or-int/2addr v3, v7

    .line 391
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 392
    .line 393
    .line 394
    move-result-object v7

    .line 395
    if-nez v3, :cond_a

    .line 396
    .line 397
    if-ne v7, v15, :cond_b

    .line 398
    .line 399
    :cond_a
    new-instance v7, La/l10;

    .line 400
    .line 401
    const/4 v11, 0x0

    .line 402
    const/16 v12, 0x1d

    .line 403
    .line 404
    move-object v8, v2

    .line 405
    invoke-direct/range {v7 .. v12}, La/l10;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 406
    .line 407
    .line 408
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 409
    .line 410
    .line 411
    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function2;

    .line 412
    .line 413
    invoke-static {v1, v9, v7}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 414
    .line 415
    .line 416
    iget-object v2, v9, La/q47;->Q1:La/khf0;

    .line 417
    .line 418
    sget-object v3, La/q47;->V1:[La/iiy;

    .line 419
    .line 420
    aget-object v3, v3, v5

    .line 421
    .line 422
    invoke-virtual {v2, v9, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    check-cast v2, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;

    .line 427
    .line 428
    invoke-interface {v2}, Lorg/xplatform/bet_history/core/presentation/BetHistoryScreenModel;->p0()La/k77;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 433
    .line 434
    .line 435
    move-result v2

    .line 436
    const/4 v3, 0x6

    .line 437
    if-eqz v2, :cond_1a

    .line 438
    .line 439
    if-eq v2, v5, :cond_17

    .line 440
    .line 441
    if-eq v2, v6, :cond_14

    .line 442
    .line 443
    if-eq v2, v13, :cond_11

    .line 444
    .line 445
    const/4 v5, 0x4

    .line 446
    if-eq v2, v5, :cond_e

    .line 447
    .line 448
    const v2, 0xa20aee2

    .line 449
    .line 450
    .line 451
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 452
    .line 453
    .line 454
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 455
    .line 456
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    check-cast v0, La/z77;

    .line 461
    .line 462
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 467
    .line 468
    .line 469
    move-result v6

    .line 470
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 471
    .line 472
    .line 473
    move-result-object v7

    .line 474
    if-nez v6, :cond_c

    .line 475
    .line 476
    if-ne v7, v15, :cond_d

    .line 477
    .line 478
    :cond_c
    new-instance v16, La/ur6;

    .line 479
    .line 480
    const/16 v22, 0x0

    .line 481
    .line 482
    const/16 v23, 0x15

    .line 483
    .line 484
    const/16 v17, 0x1

    .line 485
    .line 486
    const-class v19, La/k3t0;

    .line 487
    .line 488
    const-string v20, "onAction"

    .line 489
    .line 490
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 491
    .line 492
    move-object/from16 v18, v5

    .line 493
    .line 494
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 495
    .line 496
    .line 497
    move-object/from16 v7, v16

    .line 498
    .line 499
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    :cond_d
    check-cast v7, La/jhy;

    .line 503
    .line 504
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 505
    .line 506
    invoke-static {v2, v0, v7, v1, v3}, La/dwi0;->f(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 510
    .line 511
    .line 512
    goto/16 :goto_6

    .line 513
    .line 514
    :cond_e
    const v2, 0xa1c763e

    .line 515
    .line 516
    .line 517
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 518
    .line 519
    .line 520
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 521
    .line 522
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    check-cast v0, La/z77;

    .line 527
    .line 528
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 529
    .line 530
    .line 531
    move-result-object v5

    .line 532
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 533
    .line 534
    .line 535
    move-result v6

    .line 536
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v7

    .line 540
    if-nez v6, :cond_f

    .line 541
    .line 542
    if-ne v7, v15, :cond_10

    .line 543
    .line 544
    :cond_f
    new-instance v16, La/ur6;

    .line 545
    .line 546
    const/16 v22, 0x0

    .line 547
    .line 548
    const/16 v23, 0x14

    .line 549
    .line 550
    const/16 v17, 0x1

    .line 551
    .line 552
    const-class v19, La/k3t0;

    .line 553
    .line 554
    const-string v20, "onAction"

    .line 555
    .line 556
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 557
    .line 558
    move-object/from16 v18, v5

    .line 559
    .line 560
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 561
    .line 562
    .line 563
    move-object/from16 v7, v16

    .line 564
    .line 565
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 566
    .line 567
    .line 568
    :cond_10
    check-cast v7, La/jhy;

    .line 569
    .line 570
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 571
    .line 572
    invoke-static {v2, v0, v7, v1, v3}, La/nnw0;->y(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 573
    .line 574
    .line 575
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 576
    .line 577
    .line 578
    goto/16 :goto_6

    .line 579
    .line 580
    :cond_11
    const v2, 0xa17ae97

    .line 581
    .line 582
    .line 583
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 584
    .line 585
    .line 586
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 587
    .line 588
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 589
    .line 590
    .line 591
    move-result-object v0

    .line 592
    check-cast v0, La/z77;

    .line 593
    .line 594
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 595
    .line 596
    .line 597
    move-result-object v5

    .line 598
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 599
    .line 600
    .line 601
    move-result v6

    .line 602
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 603
    .line 604
    .line 605
    move-result-object v7

    .line 606
    if-nez v6, :cond_12

    .line 607
    .line 608
    if-ne v7, v15, :cond_13

    .line 609
    .line 610
    :cond_12
    new-instance v16, La/ur6;

    .line 611
    .line 612
    const/16 v22, 0x0

    .line 613
    .line 614
    const/16 v23, 0x13

    .line 615
    .line 616
    const/16 v17, 0x1

    .line 617
    .line 618
    const-class v19, La/k3t0;

    .line 619
    .line 620
    const-string v20, "onAction"

    .line 621
    .line 622
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 623
    .line 624
    move-object/from16 v18, v5

    .line 625
    .line 626
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 627
    .line 628
    .line 629
    move-object/from16 v7, v16

    .line 630
    .line 631
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 632
    .line 633
    .line 634
    :cond_13
    check-cast v7, La/jhy;

    .line 635
    .line 636
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 637
    .line 638
    invoke-static {v2, v0, v7, v1, v3}, La/hkb;->b(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 642
    .line 643
    .line 644
    goto/16 :goto_6

    .line 645
    .line 646
    :cond_14
    const v2, 0xa12e9f7

    .line 647
    .line 648
    .line 649
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 650
    .line 651
    .line 652
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 653
    .line 654
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    check-cast v0, La/z77;

    .line 659
    .line 660
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 661
    .line 662
    .line 663
    move-result-object v5

    .line 664
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 665
    .line 666
    .line 667
    move-result v6

    .line 668
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object v7

    .line 672
    if-nez v6, :cond_15

    .line 673
    .line 674
    if-ne v7, v15, :cond_16

    .line 675
    .line 676
    :cond_15
    new-instance v16, La/ur6;

    .line 677
    .line 678
    const/16 v22, 0x0

    .line 679
    .line 680
    const/16 v23, 0x12

    .line 681
    .line 682
    const/16 v17, 0x1

    .line 683
    .line 684
    const-class v19, La/k3t0;

    .line 685
    .line 686
    const-string v20, "onAction"

    .line 687
    .line 688
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 689
    .line 690
    move-object/from16 v18, v5

    .line 691
    .line 692
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 693
    .line 694
    .line 695
    move-object/from16 v7, v16

    .line 696
    .line 697
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 698
    .line 699
    .line 700
    :cond_16
    check-cast v7, La/jhy;

    .line 701
    .line 702
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 703
    .line 704
    invoke-static {v2, v0, v7, v1, v3}, La/q7x;->g(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 705
    .line 706
    .line 707
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 708
    .line 709
    .line 710
    goto/16 :goto_6

    .line 711
    .line 712
    :cond_17
    const v2, 0xa0e0df8

    .line 713
    .line 714
    .line 715
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 716
    .line 717
    .line 718
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 719
    .line 720
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v0

    .line 724
    check-cast v0, La/z77;

    .line 725
    .line 726
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 727
    .line 728
    .line 729
    move-result-object v5

    .line 730
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 731
    .line 732
    .line 733
    move-result v6

    .line 734
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 735
    .line 736
    .line 737
    move-result-object v7

    .line 738
    if-nez v6, :cond_18

    .line 739
    .line 740
    if-ne v7, v15, :cond_19

    .line 741
    .line 742
    :cond_18
    new-instance v16, La/ur6;

    .line 743
    .line 744
    const/16 v22, 0x0

    .line 745
    .line 746
    const/16 v23, 0x11

    .line 747
    .line 748
    const/16 v17, 0x1

    .line 749
    .line 750
    const-class v19, La/k3t0;

    .line 751
    .line 752
    const-string v20, "onAction"

    .line 753
    .line 754
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 755
    .line 756
    move-object/from16 v18, v5

    .line 757
    .line 758
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 759
    .line 760
    .line 761
    move-object/from16 v7, v16

    .line 762
    .line 763
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 764
    .line 765
    .line 766
    :cond_19
    check-cast v7, La/jhy;

    .line 767
    .line 768
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 769
    .line 770
    invoke-static {v2, v0, v7, v1, v3}, La/idm0;->c(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 771
    .line 772
    .line 773
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 774
    .line 775
    .line 776
    goto :goto_6

    .line 777
    :cond_1a
    const v2, 0xa095f81

    .line 778
    .line 779
    .line 780
    invoke-virtual {v1, v2}, La/fet;->e0(I)V

    .line 781
    .line 782
    .line 783
    sget-object v2, La/o7k0;->c:La/n0q;

    .line 784
    .line 785
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 786
    .line 787
    .line 788
    move-result-object v0

    .line 789
    check-cast v0, La/z77;

    .line 790
    .line 791
    invoke-virtual {v9}, La/q47;->I0()La/k3t0;

    .line 792
    .line 793
    .line 794
    move-result-object v5

    .line 795
    invoke-virtual {v1, v5}, La/fet;->i(Ljava/lang/Object;)Z

    .line 796
    .line 797
    .line 798
    move-result v6

    .line 799
    invoke-virtual {v1}, La/fet;->P()Ljava/lang/Object;

    .line 800
    .line 801
    .line 802
    move-result-object v7

    .line 803
    if-nez v6, :cond_1b

    .line 804
    .line 805
    if-ne v7, v15, :cond_1c

    .line 806
    .line 807
    :cond_1b
    new-instance v16, La/ur6;

    .line 808
    .line 809
    const/16 v22, 0x0

    .line 810
    .line 811
    const/16 v23, 0x10

    .line 812
    .line 813
    const/16 v17, 0x1

    .line 814
    .line 815
    const-class v19, La/k3t0;

    .line 816
    .line 817
    const-string v20, "onAction"

    .line 818
    .line 819
    const-string v21, "onAction(Ljava/lang/Object;)V"

    .line 820
    .line 821
    move-object/from16 v18, v5

    .line 822
    .line 823
    invoke-direct/range {v16 .. v23}, La/ur6;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 824
    .line 825
    .line 826
    move-object/from16 v7, v16

    .line 827
    .line 828
    invoke-virtual {v1, v7}, La/fet;->o0(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    :cond_1c
    check-cast v7, La/jhy;

    .line 832
    .line 833
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 834
    .line 835
    invoke-static {v2, v0, v7, v1, v3}, La/dwi0;->f(La/mm40;La/z77;Lkotlin/jvm/functions/Function1;La/fet;I)V

    .line 836
    .line 837
    .line 838
    invoke-virtual {v1, v4}, La/fet;->r(Z)V

    .line 839
    .line 840
    .line 841
    goto :goto_6

    .line 842
    :cond_1d
    invoke-virtual {v1}, La/fet;->X()V

    .line 843
    .line 844
    .line 845
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 846
    .line 847
    return-object v0

    .line 848
    nop

    .line 849
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
