.class public final synthetic La/axe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dxe0;


# direct methods
.method public synthetic constructor <init>(La/dxe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/axe0;->a:B

    iput-object p1, p0, La/axe0;->b:La/dxe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/axe0;->a:B

    .line 4
    .line 5
    const/16 v2, 0x21

    .line 6
    .line 7
    const-string v3, "RESULT_KEY_CALENDAR_SIMPLE_DATE"

    .line 8
    .line 9
    iget-object v4, v0, La/axe0;->b:La/dxe0;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v0, p1

    .line 15
    .line 16
    check-cast v0, Ljava/lang/String;

    .line 17
    .line 18
    move-object/from16 v1, p2

    .line 19
    .line 20
    check-cast v1, Landroid/os/Bundle;

    .line 21
    .line 22
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 23
    .line 24
    const-string v2, "KEY_ID_BONUS"

    .line 25
    .line 26
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const-string v2, "KEY_NAME_BONUS"

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-nez v1, :cond_0

    .line 37
    .line 38
    const-string v1, ""

    .line 39
    .line 40
    :cond_0
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    new-instance v3, La/lve0;

    .line 45
    .line 46
    invoke-direct {v3, v0, v1}, La/lve0;-><init>(ILjava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 53
    .line 54
    return-object v0

    .line 55
    :pswitch_0
    move-object/from16 v0, p1

    .line 56
    .line 57
    check-cast v0, Ljava/lang/String;

    .line 58
    .line 59
    move-object/from16 v1, p2

    .line 60
    .line 61
    check-cast v1, Landroid/os/Bundle;

    .line 62
    .line 63
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 64
    .line 65
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    sget-object v1, La/cve0;->a:La/cve0;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object v0

    .line 83
    :pswitch_1
    move-object/from16 v0, p1

    .line 84
    .line 85
    check-cast v0, Ljava/lang/String;

    .line 86
    .line 87
    move-object/from16 v1, p2

    .line 88
    .line 89
    check-cast v1, Landroid/os/Bundle;

    .line 90
    .line 91
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 92
    .line 93
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    iget-object v0, v4, La/dxe0;->N1:La/rl70;

    .line 100
    .line 101
    if-eqz v0, :cond_1

    .line 102
    .line 103
    const-string v0, "PICKER_DIALOG_TAG"

    .line 104
    .line 105
    invoke-virtual {v1, v0}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    sget-object v1, La/eve0;->a:La/eve0;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object v0

    .line 120
    :cond_1
    const-string v0, "pickerDialogFactory"

    .line 121
    .line 122
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const/4 v0, 0x0

    .line 126
    throw v0

    .line 127
    :pswitch_2
    move-object/from16 v0, p1

    .line 128
    .line 129
    check-cast v0, Ljava/lang/String;

    .line 130
    .line 131
    move-object/from16 v1, p2

    .line 132
    .line 133
    check-cast v1, Landroid/os/Bundle;

    .line 134
    .line 135
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 136
    .line 137
    const-string v2, "KEY_PICKER_COUNTRY_ID_REQUEST"

    .line 138
    .line 139
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    const-string v2, "KEY_PICKER_COUNTRY_ALLOWED_REQUEST"

    .line 144
    .line 145
    invoke-virtual {v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;)Z

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-instance v3, La/dve0;

    .line 154
    .line 155
    invoke-direct {v3, v0, v1}, La/dve0;-><init>(IZ)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 162
    .line 163
    return-object v0

    .line 164
    :pswitch_3
    move-object/from16 v0, p1

    .line 165
    .line 166
    check-cast v0, Ljava/lang/String;

    .line 167
    .line 168
    move-object/from16 v1, p2

    .line 169
    .line 170
    check-cast v1, Landroid/os/Bundle;

    .line 171
    .line 172
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 173
    .line 174
    const-string v2, "KEY_PICKER_MODEL_REQUEST"

    .line 175
    .line 176
    invoke-static {v1, v0, v2}, La/f140;->h(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)I

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    new-instance v2, La/bve0;

    .line 185
    .line 186
    invoke-direct {v2, v0}, La/bve0;-><init>(I)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 193
    .line 194
    return-object v0

    .line 195
    :pswitch_4
    move-object/from16 v0, p1

    .line 196
    .line 197
    check-cast v0, Ljava/lang/String;

    .line 198
    .line 199
    move-object/from16 v1, p2

    .line 200
    .line 201
    check-cast v1, Landroid/os/Bundle;

    .line 202
    .line 203
    sget-object v5, La/dxe0;->Y1:La/lme0;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 209
    .line 210
    .line 211
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 212
    .line 213
    if-gt v0, v2, :cond_2

    .line 214
    .line 215
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    goto :goto_0

    .line 220
    :cond_2
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    check-cast v0, Landroid/os/Parcelable;

    .line 225
    .line 226
    :goto_0
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 227
    .line 228
    if-eqz v0, :cond_3

    .line 229
    .line 230
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    new-instance v2, La/tve0;

    .line 235
    .line 236
    invoke-direct {v2, v0}, La/tve0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 240
    .line 241
    .line 242
    :cond_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    return-object v0

    .line 245
    :pswitch_5
    move-object/from16 v0, p1

    .line 246
    .line 247
    check-cast v0, Ljava/lang/String;

    .line 248
    .line 249
    move-object/from16 v1, p2

    .line 250
    .line 251
    check-cast v1, Landroid/os/Bundle;

    .line 252
    .line 253
    sget-object v5, La/dxe0;->Y1:La/lme0;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    .line 260
    .line 261
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 262
    .line 263
    if-gt v0, v2, :cond_4

    .line 264
    .line 265
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 266
    .line 267
    .line 268
    move-result-object v0

    .line 269
    goto :goto_1

    .line 270
    :cond_4
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 271
    .line 272
    .line 273
    move-result-object v0

    .line 274
    check-cast v0, Landroid/os/Parcelable;

    .line 275
    .line 276
    :goto_1
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 277
    .line 278
    if-eqz v0, :cond_5

    .line 279
    .line 280
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 281
    .line 282
    .line 283
    move-result-object v1

    .line 284
    new-instance v2, La/uve0;

    .line 285
    .line 286
    invoke-direct {v2, v0}, La/uve0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 290
    .line 291
    .line 292
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    return-object v0

    .line 295
    :pswitch_6
    move-object/from16 v0, p1

    .line 296
    .line 297
    check-cast v0, Ljava/lang/String;

    .line 298
    .line 299
    move-object/from16 v1, p2

    .line 300
    .line 301
    check-cast v1, Landroid/os/Bundle;

    .line 302
    .line 303
    sget-object v5, La/dxe0;->Y1:La/lme0;

    .line 304
    .line 305
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 309
    .line 310
    .line 311
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 312
    .line 313
    if-gt v0, v2, :cond_6

    .line 314
    .line 315
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 316
    .line 317
    .line 318
    move-result-object v0

    .line 319
    goto :goto_2

    .line 320
    :cond_6
    invoke-static {v1}, La/uq6;->y(Landroid/os/Bundle;)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    check-cast v0, Landroid/os/Parcelable;

    .line 325
    .line 326
    :goto_2
    check-cast v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 327
    .line 328
    if-eqz v0, :cond_7

    .line 329
    .line 330
    invoke-virtual {v4}, La/dxe0;->G0()La/k3t0;

    .line 331
    .line 332
    .line 333
    move-result-object v1

    .line 334
    new-instance v2, La/gve0;

    .line 335
    .line 336
    invoke-direct {v2, v0}, La/gve0;-><init>(Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 340
    .line 341
    .line 342
    :cond_7
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 343
    .line 344
    return-object v0

    .line 345
    :pswitch_7
    move-object/from16 v5, p1

    .line 346
    .line 347
    check-cast v5, La/fet;

    .line 348
    .line 349
    move-object/from16 v1, p2

    .line 350
    .line 351
    check-cast v1, Ljava/lang/Integer;

    .line 352
    .line 353
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 354
    .line 355
    .line 356
    move-result v1

    .line 357
    sget-object v2, La/dxe0;->Y1:La/lme0;

    .line 358
    .line 359
    and-int/lit8 v2, v1, 0x3

    .line 360
    .line 361
    const/4 v3, 0x2

    .line 362
    const/4 v4, 0x1

    .line 363
    if-eq v2, v3, :cond_8

    .line 364
    .line 365
    move v2, v4

    .line 366
    goto :goto_3

    .line 367
    :cond_8
    const/4 v2, 0x0

    .line 368
    :goto_3
    and-int/2addr v1, v4

    .line 369
    invoke-virtual {v5, v1, v2}, La/fet;->U(IZ)Z

    .line 370
    .line 371
    .line 372
    move-result v1

    .line 373
    if-eqz v1, :cond_f

    .line 374
    .line 375
    sget-object v1, La/o7k0;->c:La/n0q;

    .line 376
    .line 377
    iget-object v8, v0, La/axe0;->b:La/dxe0;

    .line 378
    .line 379
    invoke-virtual {v8}, La/dxe0;->G0()La/k3t0;

    .line 380
    .line 381
    .line 382
    move-result-object v0

    .line 383
    check-cast v0, La/i3t0;

    .line 384
    .line 385
    invoke-virtual {v0, v5}, La/i3t0;->y(La/fet;)La/pz40;

    .line 386
    .line 387
    .line 388
    move-result-object v2

    .line 389
    invoke-static {v8}, La/zdx;->B(Landroidx/fragment/app/Fragment;)Z

    .line 390
    .line 391
    .line 392
    move-result v0

    .line 393
    xor-int/lit8 v3, v0, 0x1

    .line 394
    .line 395
    invoke-virtual {v8}, La/dxe0;->G0()La/k3t0;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    invoke-virtual {v5, v11}, La/fet;->i(Ljava/lang/Object;)Z

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 404
    .line 405
    .line 406
    move-result-object v4

    .line 407
    sget-object v7, La/ukd;->a:La/cl5;

    .line 408
    .line 409
    if-nez v0, :cond_9

    .line 410
    .line 411
    if-ne v4, v7, :cond_a

    .line 412
    .line 413
    :cond_9
    new-instance v9, La/d8e0;

    .line 414
    .line 415
    const/4 v15, 0x0

    .line 416
    const/16 v16, 0x16

    .line 417
    .line 418
    const/4 v10, 0x1

    .line 419
    const-class v12, La/k3t0;

    .line 420
    .line 421
    const-string v13, "onAction"

    .line 422
    .line 423
    const-string v14, "onAction(Ljava/lang/Object;)V"

    .line 424
    .line 425
    invoke-direct/range {v9 .. v16}, La/d8e0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 426
    .line 427
    .line 428
    invoke-virtual {v5, v9}, La/fet;->o0(Ljava/lang/Object;)V

    .line 429
    .line 430
    .line 431
    move-object v4, v9

    .line 432
    :cond_a
    check-cast v4, La/jhy;

    .line 433
    .line 434
    check-cast v4, Lkotlin/jvm/functions/Function1;

    .line 435
    .line 436
    const/4 v6, 0x6

    .line 437
    invoke-static/range {v1 .. v6}, La/q8a;->A(La/mm40;La/l7m0;ZLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v8}, La/dxe0;->G0()La/k3t0;

    .line 441
    .line 442
    .line 443
    move-result-object v0

    .line 444
    invoke-virtual {v5, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 445
    .line 446
    .line 447
    move-result v1

    .line 448
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 449
    .line 450
    .line 451
    move-result-object v2

    .line 452
    if-nez v1, :cond_c

    .line 453
    .line 454
    if-ne v2, v7, :cond_b

    .line 455
    .line 456
    goto :goto_4

    .line 457
    :cond_b
    move-object v1, v7

    .line 458
    goto :goto_5

    .line 459
    :cond_c
    :goto_4
    new-instance v6, La/d8e0;

    .line 460
    .line 461
    const/4 v12, 0x0

    .line 462
    const/16 v13, 0x17

    .line 463
    .line 464
    move-object v1, v7

    .line 465
    const/4 v7, 0x1

    .line 466
    const-class v9, La/dxe0;

    .line 467
    .line 468
    const-string v10, "handleSideEffect"

    .line 469
    .line 470
    const-string v11, "handleSideEffect(Lorg/xplatform/registration_default/impl/presentation/udf/models/RegistrationDefaultSideEffect;)V"

    .line 471
    .line 472
    invoke-direct/range {v6 .. v13}, La/d8e0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 476
    .line 477
    .line 478
    move-object v2, v6

    .line 479
    :goto_5
    check-cast v2, La/jhy;

    .line 480
    .line 481
    check-cast v2, Lkotlin/jvm/functions/Function1;

    .line 482
    .line 483
    sget-object v3, La/lkz;->a:La/lkz;

    .line 484
    .line 485
    invoke-static {v2, v5}, Landroidx/compose/runtime/e;->f(Ljava/lang/Object;La/fet;)La/pz40;

    .line 486
    .line 487
    .line 488
    move-result-object v9

    .line 489
    invoke-virtual {v5, v0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 490
    .line 491
    .line 492
    move-result v2

    .line 493
    invoke-virtual {v5, v8}, La/fet;->i(Ljava/lang/Object;)Z

    .line 494
    .line 495
    .line 496
    move-result v3

    .line 497
    or-int/2addr v2, v3

    .line 498
    const/4 v3, 0x3

    .line 499
    invoke-virtual {v5, v3}, La/fet;->e(I)Z

    .line 500
    .line 501
    .line 502
    move-result v3

    .line 503
    or-int/2addr v2, v3

    .line 504
    invoke-virtual {v5, v9}, La/fet;->g(Ljava/lang/Object;)Z

    .line 505
    .line 506
    .line 507
    move-result v3

    .line 508
    or-int/2addr v2, v3

    .line 509
    invoke-virtual {v5}, La/fet;->P()Ljava/lang/Object;

    .line 510
    .line 511
    .line 512
    move-result-object v3

    .line 513
    if-nez v2, :cond_d

    .line 514
    .line 515
    if-ne v3, v1, :cond_e

    .line 516
    .line 517
    :cond_d
    new-instance v6, La/nu80;

    .line 518
    .line 519
    const/4 v10, 0x0

    .line 520
    const/16 v11, 0xf

    .line 521
    .line 522
    move-object v7, v0

    .line 523
    invoke-direct/range {v6 .. v11}, La/nu80;-><init>(La/k3t0;Landroidx/fragment/app/Fragment;La/pz40;La/yje;B)V

    .line 524
    .line 525
    .line 526
    invoke-virtual {v5, v6}, La/fet;->o0(Ljava/lang/Object;)V

    .line 527
    .line 528
    .line 529
    move-object v3, v6

    .line 530
    :cond_e
    check-cast v3, Lkotlin/jvm/functions/Function2;

    .line 531
    .line 532
    invoke-static {v5, v8, v3}, La/m0x0;->t(La/fet;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V

    .line 533
    .line 534
    .line 535
    goto :goto_6

    .line 536
    :cond_f
    invoke-virtual {v5}, La/fet;->X()V

    .line 537
    .line 538
    .line 539
    :goto_6
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 540
    .line 541
    return-object v0

    .line 542
    nop

    .line 543
    :pswitch_data_0
    .packed-switch 0x0
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
