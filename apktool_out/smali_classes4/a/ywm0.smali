.class public final La/ywm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ywm0;->a:B

    iput-object p1, p0, La/ywm0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/ywm0;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 43

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ywm0;->a:B

    .line 4
    .line 5
    const v8, 0x7f0a0fcc

    .line 6
    .line 7
    .line 8
    const v9, 0x7f0a0ab8

    .line 9
    .line 10
    .line 11
    const v10, 0x7f0a06b8

    .line 12
    .line 13
    .line 14
    const v11, 0x7f0a06b7

    .line 15
    .line 16
    .line 17
    const v12, 0x7f0a06b6

    .line 18
    .line 19
    .line 20
    const v13, 0x7f0a06b5

    .line 21
    .line 22
    .line 23
    const v14, 0x7f0a044e

    .line 24
    .line 25
    .line 26
    const v15, 0x7f0a0ecb

    .line 27
    .line 28
    .line 29
    const v2, 0x7f0a1292

    .line 30
    .line 31
    .line 32
    const v3, 0x7f0a1208

    .line 33
    .line 34
    .line 35
    const v4, 0x7f0a111c

    .line 36
    .line 37
    .line 38
    const/4 v5, 0x0

    .line 39
    const-string v6, "Missing required view with ID: "

    .line 40
    .line 41
    const/16 v17, 0x0

    .line 42
    .line 43
    iget-object v7, v0, La/ywm0;->b:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object v0, v0, La/ywm0;->c:Ljava/lang/Object;

    .line 46
    .line 47
    packed-switch v1, :pswitch_data_0

    .line 48
    .line 49
    .line 50
    check-cast v0, La/a8z;

    .line 51
    .line 52
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    check-cast v0, La/riu0;

    .line 57
    .line 58
    instance-of v1, v0, La/wmv;

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    move-object/from16 v17, v0

    .line 63
    .line 64
    check-cast v17, La/wmv;

    .line 65
    .line 66
    :cond_0
    if-eqz v17, :cond_1

    .line 67
    .line 68
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    if-nez v0, :cond_2

    .line 73
    .line 74
    :cond_1
    check-cast v7, La/cyv0;

    .line 75
    .line 76
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    :cond_2
    return-object v0

    .line 81
    :pswitch_0
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 82
    .line 83
    check-cast v0, La/rdv0;

    .line 84
    .line 85
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_1
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 92
    .line 93
    new-instance v1, La/gzu0;

    .line 94
    .line 95
    check-cast v0, La/yzu0;

    .line 96
    .line 97
    invoke-direct {v1, v0}, La/gzu0;-><init>(La/yzu0;)V

    .line 98
    .line 99
    .line 100
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object v0

    .line 106
    :pswitch_2
    check-cast v0, La/a8z;

    .line 107
    .line 108
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    check-cast v0, La/riu0;

    .line 113
    .line 114
    instance-of v1, v0, La/wmv;

    .line 115
    .line 116
    if-eqz v1, :cond_3

    .line 117
    .line 118
    move-object/from16 v17, v0

    .line 119
    .line 120
    check-cast v17, La/wmv;

    .line 121
    .line 122
    :cond_3
    if-eqz v17, :cond_4

    .line 123
    .line 124
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-nez v0, :cond_5

    .line 129
    .line 130
    :cond_4
    check-cast v7, La/hsu0;

    .line 131
    .line 132
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    :cond_5
    return-object v0

    .line 137
    :pswitch_3
    check-cast v0, La/a8z;

    .line 138
    .line 139
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, La/riu0;

    .line 144
    .line 145
    instance-of v1, v0, La/wmv;

    .line 146
    .line 147
    if-eqz v1, :cond_6

    .line 148
    .line 149
    move-object/from16 v17, v0

    .line 150
    .line 151
    check-cast v17, La/wmv;

    .line 152
    .line 153
    :cond_6
    if-eqz v17, :cond_7

    .line 154
    .line 155
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    if-nez v0, :cond_8

    .line 160
    .line 161
    :cond_7
    check-cast v7, La/xru0;

    .line 162
    .line 163
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 164
    .line 165
    .line 166
    move-result-object v0

    .line 167
    :cond_8
    return-object v0

    .line 168
    :pswitch_4
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;

    .line 169
    .line 170
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 171
    .line 172
    .line 173
    move-result-object v1

    .line 174
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 175
    .line 176
    .line 177
    move-result-object v1

    .line 178
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 179
    .line 180
    .line 181
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;

    .line 182
    .line 183
    const v5, 0x7f0d05f2

    .line 184
    .line 185
    .line 186
    invoke-virtual {v1, v5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 187
    .line 188
    .line 189
    const v1, 0x7f0a057c

    .line 190
    .line 191
    .line 192
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 193
    .line 194
    .line 195
    move-result-object v20

    .line 196
    if-eqz v20, :cond_d

    .line 197
    .line 198
    const v1, 0x7f0a0587

    .line 199
    .line 200
    .line 201
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v21

    .line 205
    if-eqz v21, :cond_d

    .line 206
    .line 207
    const v1, 0x7f0a0588

    .line 208
    .line 209
    .line 210
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 211
    .line 212
    .line 213
    move-result-object v22

    .line 214
    if-eqz v22, :cond_d

    .line 215
    .line 216
    const v1, 0x7f0a058a

    .line 217
    .line 218
    .line 219
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 220
    .line 221
    .line 222
    move-result-object v23

    .line 223
    if-eqz v23, :cond_d

    .line 224
    .line 225
    const v1, 0x7f0a058d

    .line 226
    .line 227
    .line 228
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 229
    .line 230
    .line 231
    move-result-object v24

    .line 232
    if-eqz v24, :cond_d

    .line 233
    .line 234
    const v1, 0x7f0a06b9

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 238
    .line 239
    .line 240
    move-result-object v25

    .line 241
    if-eqz v25, :cond_d

    .line 242
    .line 243
    const v1, 0x7f0a07fe

    .line 244
    .line 245
    .line 246
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    check-cast v5, Landroid/widget/ImageView;

    .line 251
    .line 252
    if-eqz v5, :cond_d

    .line 253
    .line 254
    const v1, 0x7f0a0d12

    .line 255
    .line 256
    .line 257
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 258
    .line 259
    .line 260
    move-result-object v26

    .line 261
    if-eqz v26, :cond_d

    .line 262
    .line 263
    const v1, 0x7f0a0d1d

    .line 264
    .line 265
    .line 266
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 267
    .line 268
    .line 269
    move-result-object v27

    .line 270
    if-eqz v27, :cond_d

    .line 271
    .line 272
    const v1, 0x7f0a0d1e

    .line 273
    .line 274
    .line 275
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 276
    .line 277
    .line 278
    move-result-object v28

    .line 279
    if-eqz v28, :cond_d

    .line 280
    .line 281
    const v1, 0x7f0a0d20

    .line 282
    .line 283
    .line 284
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v29

    .line 288
    if-eqz v29, :cond_d

    .line 289
    .line 290
    const v1, 0x7f0a0d23

    .line 291
    .line 292
    .line 293
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 294
    .line 295
    .line 296
    move-result-object v30

    .line 297
    if-eqz v30, :cond_d

    .line 298
    .line 299
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 300
    .line 301
    .line 302
    move-result-object v1

    .line 303
    move-object/from16 v31, v1

    .line 304
    .line 305
    check-cast v31, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 306
    .line 307
    if-eqz v31, :cond_a

    .line 308
    .line 309
    const v15, 0x7f0a1106

    .line 310
    .line 311
    .line 312
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 313
    .line 314
    .line 315
    move-result-object v1

    .line 316
    move-object/from16 v32, v1

    .line 317
    .line 318
    check-cast v32, Landroid/widget/TextView;

    .line 319
    .line 320
    if-eqz v32, :cond_a

    .line 321
    .line 322
    const v15, 0x7f0a1107

    .line 323
    .line 324
    .line 325
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v1

    .line 329
    check-cast v1, Landroid/widget/TextView;

    .line 330
    .line 331
    if-eqz v1, :cond_a

    .line 332
    .line 333
    const v15, 0x7f0a1113

    .line 334
    .line 335
    .line 336
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 337
    .line 338
    .line 339
    move-result-object v1

    .line 340
    move-object/from16 v33, v1

    .line 341
    .line 342
    check-cast v33, Landroid/widget/TextView;

    .line 343
    .line 344
    if-eqz v33, :cond_a

    .line 345
    .line 346
    const v15, 0x7f0a111a

    .line 347
    .line 348
    .line 349
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    move-object/from16 v34, v1

    .line 354
    .line 355
    check-cast v34, Landroid/widget/TextView;

    .line 356
    .line 357
    if-eqz v34, :cond_a

    .line 358
    .line 359
    const v15, 0x7f0a111b

    .line 360
    .line 361
    .line 362
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 363
    .line 364
    .line 365
    move-result-object v1

    .line 366
    move-object/from16 v35, v1

    .line 367
    .line 368
    check-cast v35, Landroid/widget/TextView;

    .line 369
    .line 370
    if-eqz v35, :cond_a

    .line 371
    .line 372
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 373
    .line 374
    .line 375
    move-result-object v1

    .line 376
    check-cast v1, Landroid/widget/TextView;

    .line 377
    .line 378
    if-eqz v1, :cond_c

    .line 379
    .line 380
    const v15, 0x7f0a111d

    .line 381
    .line 382
    .line 383
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 384
    .line 385
    .line 386
    move-result-object v1

    .line 387
    move-object/from16 v36, v1

    .line 388
    .line 389
    check-cast v36, Landroid/widget/TextView;

    .line 390
    .line 391
    if-eqz v36, :cond_a

    .line 392
    .line 393
    const v15, 0x7f0a11f2

    .line 394
    .line 395
    .line 396
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 397
    .line 398
    .line 399
    move-result-object v1

    .line 400
    move-object/from16 v37, v1

    .line 401
    .line 402
    check-cast v37, Landroid/widget/TextView;

    .line 403
    .line 404
    if-eqz v37, :cond_a

    .line 405
    .line 406
    const v15, 0x7f0a11f3

    .line 407
    .line 408
    .line 409
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    check-cast v1, Landroid/widget/TextView;

    .line 414
    .line 415
    if-eqz v1, :cond_a

    .line 416
    .line 417
    const v15, 0x7f0a11ff

    .line 418
    .line 419
    .line 420
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 421
    .line 422
    .line 423
    move-result-object v1

    .line 424
    move-object/from16 v38, v1

    .line 425
    .line 426
    check-cast v38, Landroid/widget/TextView;

    .line 427
    .line 428
    if-eqz v38, :cond_a

    .line 429
    .line 430
    const v15, 0x7f0a1206

    .line 431
    .line 432
    .line 433
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 434
    .line 435
    .line 436
    move-result-object v1

    .line 437
    move-object/from16 v39, v1

    .line 438
    .line 439
    check-cast v39, Landroid/widget/TextView;

    .line 440
    .line 441
    if-eqz v39, :cond_a

    .line 442
    .line 443
    const v15, 0x7f0a1207

    .line 444
    .line 445
    .line 446
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 447
    .line 448
    .line 449
    move-result-object v1

    .line 450
    move-object/from16 v40, v1

    .line 451
    .line 452
    check-cast v40, Landroid/widget/TextView;

    .line 453
    .line 454
    if-eqz v40, :cond_a

    .line 455
    .line 456
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 457
    .line 458
    .line 459
    move-result-object v1

    .line 460
    check-cast v1, Landroid/widget/TextView;

    .line 461
    .line 462
    if-eqz v1, :cond_b

    .line 463
    .line 464
    const v15, 0x7f0a1209

    .line 465
    .line 466
    .line 467
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 468
    .line 469
    .line 470
    move-result-object v1

    .line 471
    move-object/from16 v41, v1

    .line 472
    .line 473
    check-cast v41, Landroid/widget/TextView;

    .line 474
    .line 475
    if-eqz v41, :cond_a

    .line 476
    .line 477
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 478
    .line 479
    .line 480
    move-result-object v1

    .line 481
    move-object/from16 v42, v1

    .line 482
    .line 483
    check-cast v42, Landroid/widget/TextView;

    .line 484
    .line 485
    if-eqz v42, :cond_9

    .line 486
    .line 487
    new-instance v18, La/u8o0;

    .line 488
    .line 489
    move-object/from16 v19, v0

    .line 490
    .line 491
    invoke-direct/range {v18 .. v42}, La/u8o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/victoryformula/VictoryFormulaView;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 492
    .line 493
    .line 494
    move-object/from16 v17, v18

    .line 495
    .line 496
    goto :goto_1

    .line 497
    :cond_9
    move-object/from16 v19, v0

    .line 498
    .line 499
    move v15, v2

    .line 500
    goto :goto_0

    .line 501
    :cond_a
    move-object/from16 v19, v0

    .line 502
    .line 503
    goto :goto_0

    .line 504
    :cond_b
    move-object/from16 v19, v0

    .line 505
    .line 506
    move v15, v3

    .line 507
    goto :goto_0

    .line 508
    :cond_c
    move-object/from16 v19, v0

    .line 509
    .line 510
    move v15, v4

    .line 511
    goto :goto_0

    .line 512
    :cond_d
    move-object/from16 v19, v0

    .line 513
    .line 514
    move v15, v1

    .line 515
    :goto_0
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    invoke-virtual {v0, v15}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 520
    .line 521
    .line 522
    move-result-object v0

    .line 523
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 528
    .line 529
    .line 530
    :goto_1
    return-object v17

    .line 531
    :pswitch_5
    check-cast v7, La/qgd;

    .line 532
    .line 533
    check-cast v0, La/a4d0;

    .line 534
    .line 535
    iget-object v1, v7, La/qgd;->b:Ljava/lang/Object;

    .line 536
    .line 537
    check-cast v1, La/g45;

    .line 538
    .line 539
    iget-object v2, v1, La/g45;->a:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v2, La/f6i;

    .line 542
    .line 543
    iget-object v2, v2, La/f6i;->g:Ljava/lang/Object;

    .line 544
    .line 545
    check-cast v2, La/m83;

    .line 546
    .line 547
    iget-object v1, v1, La/g45;->b:Ljava/lang/Object;

    .line 548
    .line 549
    check-cast v1, La/h950;

    .line 550
    .line 551
    invoke-interface {v2, v0, v1}, La/w83;->g(La/a4d0;La/h950;)Ljava/util/ArrayList;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    return-object v0

    .line 556
    :pswitch_6
    move-object v5, v7

    .line 557
    check-cast v5, La/vxs0;

    .line 558
    .line 559
    move-object v4, v0

    .line 560
    check-cast v4, La/flc;

    .line 561
    .line 562
    new-instance v1, La/vxs0;

    .line 563
    .line 564
    iget-object v2, v5, La/vxs0;->f1:La/eu00;

    .line 565
    .line 566
    iget-object v3, v5, La/vxs0;->g1:La/tfk;

    .line 567
    .line 568
    invoke-virtual {v4}, La/p4;->getAnnotations()La/g93;

    .line 569
    .line 570
    .line 571
    move-result-object v6

    .line 572
    invoke-virtual {v4}, La/oer;->l()I

    .line 573
    .line 574
    .line 575
    move-result v7

    .line 576
    if-eqz v7, :cond_12

    .line 577
    .line 578
    iget-object v0, v5, La/vxs0;->g1:La/tfk;

    .line 579
    .line 580
    invoke-virtual {v0}, La/yjj;->b()La/gmk0;

    .line 581
    .line 582
    .line 583
    move-result-object v8

    .line 584
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    invoke-direct/range {v1 .. v8}, La/vxs0;-><init>(La/eu00;La/tfk;La/flc;La/vxs0;La/g93;ILa/gmk0;)V

    .line 588
    .line 589
    .line 590
    sget-object v2, La/vxs0;->i1:La/uxs0;

    .line 591
    .line 592
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 593
    .line 594
    .line 595
    invoke-virtual {v0}, La/tfk;->p1()La/wm40;

    .line 596
    .line 597
    .line 598
    move-result-object v2

    .line 599
    if-nez v2, :cond_e

    .line 600
    .line 601
    move-object/from16 v2, v17

    .line 602
    .line 603
    goto :goto_2

    .line 604
    :cond_e
    invoke-virtual {v0}, La/tfk;->q1()La/kzj0;

    .line 605
    .line 606
    .line 607
    move-result-object v2

    .line 608
    invoke-static {v2}, La/xzs0;->d(La/wsy;)La/xzs0;

    .line 609
    .line 610
    .line 611
    move-result-object v2

    .line 612
    :goto_2
    if-nez v2, :cond_f

    .line 613
    .line 614
    goto :goto_4

    .line 615
    :cond_f
    iget-object v3, v4, La/oer;->k:La/c8z;

    .line 616
    .line 617
    if-eqz v3, :cond_10

    .line 618
    .line 619
    invoke-virtual {v3, v2}, La/c8z;->q1(La/xzs0;)La/c8z;

    .line 620
    .line 621
    .line 622
    move-result-object v17

    .line 623
    :cond_10
    move-object/from16 v8, v17

    .line 624
    .line 625
    invoke-virtual {v4}, La/oer;->W()Ljava/util/List;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    .line 631
    .line 632
    new-instance v9, Ljava/util/ArrayList;

    .line 633
    .line 634
    const/16 v4, 0xa

    .line 635
    .line 636
    invoke-static {v3, v4}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 637
    .line 638
    .line 639
    move-result v4

    .line 640
    invoke-direct {v9, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 641
    .line 642
    .line 643
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 644
    .line 645
    .line 646
    move-result-object v3

    .line 647
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 648
    .line 649
    .line 650
    move-result v4

    .line 651
    if-eqz v4, :cond_11

    .line 652
    .line 653
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 654
    .line 655
    .line 656
    move-result-object v4

    .line 657
    check-cast v4, La/c8z;

    .line 658
    .line 659
    invoke-virtual {v4, v2}, La/c8z;->q1(La/xzs0;)La/c8z;

    .line 660
    .line 661
    .line 662
    move-result-object v4

    .line 663
    invoke-virtual {v9, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 664
    .line 665
    .line 666
    goto :goto_3

    .line 667
    :cond_11
    invoke-virtual {v0}, La/tfk;->M()Ljava/util/List;

    .line 668
    .line 669
    .line 670
    move-result-object v10

    .line 671
    invoke-virtual {v5}, La/oer;->z()Ljava/util/List;

    .line 672
    .line 673
    .line 674
    move-result-object v11

    .line 675
    iget-object v12, v5, La/oer;->h:La/wsy;

    .line 676
    .line 677
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 678
    .line 679
    .line 680
    sget-object v13, La/gm40;->b:La/gm40;

    .line 681
    .line 682
    iget-object v14, v0, La/tfk;->g:La/tek;

    .line 683
    .line 684
    const/4 v7, 0x0

    .line 685
    move-object v6, v1

    .line 686
    invoke-virtual/range {v6 .. v14}, La/oer;->t1(La/c8z;La/c8z;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/wsy;La/gm40;La/tek;)V

    .line 687
    .line 688
    .line 689
    move-object/from16 v17, v1

    .line 690
    .line 691
    :goto_4
    return-object v17

    .line 692
    :cond_12
    throw v17

    .line 693
    :pswitch_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 694
    .line 695
    check-cast v0, La/qwr0;

    .line 696
    .line 697
    iget v0, v0, La/qwr0;->a:I

    .line 698
    .line 699
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 700
    .line 701
    .line 702
    move-result-object v0

    .line 703
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 704
    .line 705
    .line 706
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 707
    .line 708
    return-object v0

    .line 709
    :pswitch_8
    check-cast v0, La/a8z;

    .line 710
    .line 711
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    check-cast v0, La/riu0;

    .line 716
    .line 717
    instance-of v1, v0, La/wmv;

    .line 718
    .line 719
    if-eqz v1, :cond_13

    .line 720
    .line 721
    move-object/from16 v17, v0

    .line 722
    .line 723
    check-cast v17, La/wmv;

    .line 724
    .line 725
    :cond_13
    if-eqz v17, :cond_14

    .line 726
    .line 727
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    if-nez v0, :cond_15

    .line 732
    .line 733
    :cond_14
    check-cast v7, La/udr0;

    .line 734
    .line 735
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 736
    .line 737
    .line 738
    move-result-object v0

    .line 739
    :cond_15
    return-object v0

    .line 740
    :pswitch_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 741
    .line 742
    new-instance v1, La/mkb0;

    .line 743
    .line 744
    check-cast v0, La/upk0;

    .line 745
    .line 746
    iget v2, v0, La/upk0;->a:I

    .line 747
    .line 748
    iget-object v0, v0, La/upk0;->b:Ljava/lang/String;

    .line 749
    .line 750
    invoke-direct {v1, v2, v0}, La/mkb0;-><init>(ILjava/lang/String;)V

    .line 751
    .line 752
    .line 753
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 754
    .line 755
    .line 756
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 757
    .line 758
    return-object v0

    .line 759
    :pswitch_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 760
    .line 761
    check-cast v0, La/h1b0;

    .line 762
    .line 763
    iget-wide v0, v0, La/h1b0;->a:J

    .line 764
    .line 765
    new-instance v2, La/ikb0;

    .line 766
    .line 767
    invoke-direct {v2, v0, v1}, La/ikb0;-><init>(J)V

    .line 768
    .line 769
    .line 770
    invoke-interface {v7, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 771
    .line 772
    .line 773
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 774
    .line 775
    return-object v0

    .line 776
    :pswitch_b
    check-cast v0, La/v9r0;

    .line 777
    .line 778
    check-cast v7, Landroid/app/Application;

    .line 779
    .line 780
    instance-of v1, v7, La/af3;

    .line 781
    .line 782
    if-eqz v1, :cond_16

    .line 783
    .line 784
    check-cast v7, La/af3;

    .line 785
    .line 786
    goto :goto_5

    .line 787
    :cond_16
    move-object/from16 v7, v17

    .line 788
    .line 789
    :goto_5
    const-class v1, La/q9r0;

    .line 790
    .line 791
    if-eqz v7, :cond_19

    .line 792
    .line 793
    invoke-interface {v7}, La/af3;->d()La/wcf0;

    .line 794
    .line 795
    .line 796
    move-result-object v2

    .line 797
    invoke-virtual {v2, v1}, La/wcf0;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 798
    .line 799
    .line 800
    move-result-object v2

    .line 801
    check-cast v2, La/o5d0;

    .line 802
    .line 803
    if-eqz v2, :cond_17

    .line 804
    .line 805
    invoke-interface {v2}, La/o5d0;->get()Ljava/lang/Object;

    .line 806
    .line 807
    .line 808
    move-result-object v2

    .line 809
    check-cast v2, La/ze3;

    .line 810
    .line 811
    goto :goto_6

    .line 812
    :cond_17
    move-object/from16 v2, v17

    .line 813
    .line 814
    :goto_6
    instance-of v3, v2, La/q9r0;

    .line 815
    .line 816
    if-nez v3, :cond_18

    .line 817
    .line 818
    move-object/from16 v2, v17

    .line 819
    .line 820
    :cond_18
    check-cast v2, La/q9r0;

    .line 821
    .line 822
    if-eqz v2, :cond_19

    .line 823
    .line 824
    invoke-static {v0}, La/a4n0;->f(Landroidx/fragment/app/Fragment;)La/i1w0;

    .line 825
    .line 826
    .line 827
    move-result-object v26

    .line 828
    sget-object v1, La/v9r0;->O1:La/j6m0;

    .line 829
    .line 830
    iget-object v1, v0, La/v9r0;->L1:La/zz2;

    .line 831
    .line 832
    sget-object v3, La/v9r0;->P1:[La/iiy;

    .line 833
    .line 834
    aget-object v3, v3, v5

    .line 835
    .line 836
    invoke-virtual {v1, v0, v3}, La/zz2;->w(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/Integer;

    .line 837
    .line 838
    .line 839
    move-result-object v28

    .line 840
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 841
    .line 842
    .line 843
    iget-object v0, v2, La/q9r0;->m:La/oar0;

    .line 844
    .line 845
    iget-object v1, v2, La/q9r0;->k:La/fsd;

    .line 846
    .line 847
    iget-object v3, v2, La/q9r0;->l:La/r9u;

    .line 848
    .line 849
    iget-object v4, v2, La/q9r0;->j:La/ctf0;

    .line 850
    .line 851
    iget-object v5, v2, La/q9r0;->a:La/cad;

    .line 852
    .line 853
    iget-object v6, v2, La/q9r0;->b:La/roi0;

    .line 854
    .line 855
    iget-object v7, v2, La/q9r0;->c:La/gii0;

    .line 856
    .line 857
    iget-object v8, v2, La/q9r0;->d:La/m1e;

    .line 858
    .line 859
    iget-object v9, v2, La/q9r0;->e:La/knf0;

    .line 860
    .line 861
    iget-object v10, v2, La/q9r0;->f:La/yo4;

    .line 862
    .line 863
    iget-object v11, v2, La/q9r0;->g:La/d1p;

    .line 864
    .line 865
    iget-object v12, v2, La/q9r0;->h:La/ugf0;

    .line 866
    .line 867
    iget-object v2, v2, La/q9r0;->i:La/k3r0;

    .line 868
    .line 869
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 885
    .line 886
    .line 887
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    new-instance v18, La/txi;

    .line 897
    .line 898
    move-object/from16 v32, v0

    .line 899
    .line 900
    move-object/from16 v24, v1

    .line 901
    .line 902
    move-object/from16 v33, v2

    .line 903
    .line 904
    move-object/from16 v25, v3

    .line 905
    .line 906
    move-object/from16 v23, v4

    .line 907
    .line 908
    move-object/from16 v19, v5

    .line 909
    .line 910
    move-object/from16 v20, v6

    .line 911
    .line 912
    move-object/from16 v27, v7

    .line 913
    .line 914
    move-object/from16 v29, v8

    .line 915
    .line 916
    move-object/from16 v30, v9

    .line 917
    .line 918
    move-object/from16 v31, v10

    .line 919
    .line 920
    move-object/from16 v21, v11

    .line 921
    .line 922
    move-object/from16 v22, v12

    .line 923
    .line 924
    invoke-direct/range {v18 .. v33}, La/txi;-><init>(La/cad;La/roi0;La/d1p;La/ugf0;La/ctf0;La/fsd;La/r9u;La/i1w0;La/gii0;Ljava/lang/Integer;La/m1e;La/knf0;La/yo4;La/oar0;La/k3r0;)V

    .line 925
    .line 926
    .line 927
    move-object/from16 v17, v18

    .line 928
    .line 929
    goto :goto_7

    .line 930
    :cond_19
    const-string v0, "Cannot create dependency "

    .line 931
    .line 932
    invoke-static {v1, v0}, La/b1j;->i(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object v0

    .line 936
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    :goto_7
    return-object v17

    .line 940
    :pswitch_c
    check-cast v0, La/a8z;

    .line 941
    .line 942
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 943
    .line 944
    .line 945
    move-result-object v0

    .line 946
    check-cast v0, La/riu0;

    .line 947
    .line 948
    instance-of v1, v0, La/wmv;

    .line 949
    .line 950
    if-eqz v1, :cond_1a

    .line 951
    .line 952
    move-object/from16 v17, v0

    .line 953
    .line 954
    check-cast v17, La/wmv;

    .line 955
    .line 956
    :cond_1a
    if-eqz v17, :cond_1b

    .line 957
    .line 958
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 959
    .line 960
    .line 961
    move-result-object v0

    .line 962
    if-nez v0, :cond_1c

    .line 963
    .line 964
    :cond_1b
    check-cast v7, La/q7r0;

    .line 965
    .line 966
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 967
    .line 968
    .line 969
    move-result-object v0

    .line 970
    :cond_1c
    return-object v0

    .line 971
    :pswitch_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 972
    .line 973
    check-cast v0, La/s8l0;

    .line 974
    .line 975
    iget-wide v0, v0, La/s8l0;->a:J

    .line 976
    .line 977
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 978
    .line 979
    .line 980
    move-result-object v0

    .line 981
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 982
    .line 983
    .line 984
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 985
    .line 986
    return-object v0

    .line 987
    :pswitch_e
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 988
    .line 989
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 990
    .line 991
    .line 992
    move-result-object v1

    .line 993
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 994
    .line 995
    .line 996
    move-result-object v1

    .line 997
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 998
    .line 999
    .line 1000
    check-cast v0, Lorg/xplatform/ui_core/viewcomponents/views/TimerView;

    .line 1001
    .line 1002
    const v2, 0x7f0d06da

    .line 1003
    .line 1004
    .line 1005
    invoke-virtual {v1, v2, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1006
    .line 1007
    .line 1008
    move-result-object v1

    .line 1009
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1010
    .line 1011
    .line 1012
    move-object/from16 v19, v1

    .line 1013
    .line 1014
    check-cast v19, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1015
    .line 1016
    const v0, 0x7f0a040f

    .line 1017
    .line 1018
    .line 1019
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1020
    .line 1021
    .line 1022
    move-result-object v2

    .line 1023
    move-object/from16 v21, v2

    .line 1024
    .line 1025
    check-cast v21, Landroid/widget/TextView;

    .line 1026
    .line 1027
    if-eqz v21, :cond_1d

    .line 1028
    .line 1029
    const v0, 0x7f0a0410

    .line 1030
    .line 1031
    .line 1032
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v2

    .line 1036
    move-object/from16 v22, v2

    .line 1037
    .line 1038
    check-cast v22, Landroid/widget/TextView;

    .line 1039
    .line 1040
    if-eqz v22, :cond_1d

    .line 1041
    .line 1042
    const v0, 0x7f0a0413

    .line 1043
    .line 1044
    .line 1045
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v2

    .line 1049
    move-object/from16 v23, v2

    .line 1050
    .line 1051
    check-cast v23, Landroid/widget/TextView;

    .line 1052
    .line 1053
    if-eqz v23, :cond_1d

    .line 1054
    .line 1055
    const v0, 0x7f0a071a

    .line 1056
    .line 1057
    .line 1058
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v2

    .line 1062
    move-object/from16 v24, v2

    .line 1063
    .line 1064
    check-cast v24, Landroid/widget/TextView;

    .line 1065
    .line 1066
    if-eqz v24, :cond_1d

    .line 1067
    .line 1068
    const v0, 0x7f0a071b

    .line 1069
    .line 1070
    .line 1071
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v2

    .line 1075
    move-object/from16 v25, v2

    .line 1076
    .line 1077
    check-cast v25, Landroid/widget/TextView;

    .line 1078
    .line 1079
    if-eqz v25, :cond_1d

    .line 1080
    .line 1081
    const v0, 0x7f0a071d

    .line 1082
    .line 1083
    .line 1084
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v2

    .line 1088
    move-object/from16 v26, v2

    .line 1089
    .line 1090
    check-cast v26, Landroid/widget/TextView;

    .line 1091
    .line 1092
    if-eqz v26, :cond_1d

    .line 1093
    .line 1094
    const v0, 0x7f0a0a42

    .line 1095
    .line 1096
    .line 1097
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1098
    .line 1099
    .line 1100
    move-result-object v2

    .line 1101
    move-object/from16 v27, v2

    .line 1102
    .line 1103
    check-cast v27, Landroid/widget/TextView;

    .line 1104
    .line 1105
    if-eqz v27, :cond_1d

    .line 1106
    .line 1107
    const v0, 0x7f0a0a43

    .line 1108
    .line 1109
    .line 1110
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v2

    .line 1114
    move-object/from16 v28, v2

    .line 1115
    .line 1116
    check-cast v28, Landroid/widget/TextView;

    .line 1117
    .line 1118
    if-eqz v28, :cond_1d

    .line 1119
    .line 1120
    const v0, 0x7f0a0a45

    .line 1121
    .line 1122
    .line 1123
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v2

    .line 1127
    move-object/from16 v29, v2

    .line 1128
    .line 1129
    check-cast v29, Landroid/widget/TextView;

    .line 1130
    .line 1131
    if-eqz v29, :cond_1d

    .line 1132
    .line 1133
    const v0, 0x7f0a0b42

    .line 1134
    .line 1135
    .line 1136
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v2

    .line 1140
    move-object/from16 v30, v2

    .line 1141
    .line 1142
    check-cast v30, Landroid/widget/TextView;

    .line 1143
    .line 1144
    if-eqz v30, :cond_1d

    .line 1145
    .line 1146
    const v0, 0x7f0a0d50

    .line 1147
    .line 1148
    .line 1149
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v2

    .line 1153
    move-object/from16 v31, v2

    .line 1154
    .line 1155
    check-cast v31, Landroid/widget/TextView;

    .line 1156
    .line 1157
    if-eqz v31, :cond_1d

    .line 1158
    .line 1159
    const v0, 0x7f0a0d51

    .line 1160
    .line 1161
    .line 1162
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1163
    .line 1164
    .line 1165
    move-result-object v2

    .line 1166
    move-object/from16 v32, v2

    .line 1167
    .line 1168
    check-cast v32, Landroid/widget/TextView;

    .line 1169
    .line 1170
    if-eqz v32, :cond_1d

    .line 1171
    .line 1172
    new-instance v18, La/slu0;

    .line 1173
    .line 1174
    move-object/from16 v20, v19

    .line 1175
    .line 1176
    invoke-direct/range {v18 .. v32}, La/slu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1177
    .line 1178
    .line 1179
    move-object/from16 v17, v18

    .line 1180
    .line 1181
    goto :goto_8

    .line 1182
    :cond_1d
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v1

    .line 1186
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1187
    .line 1188
    .line 1189
    move-result-object v0

    .line 1190
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v0

    .line 1194
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1195
    .line 1196
    .line 1197
    :goto_8
    return-object v17

    .line 1198
    :pswitch_f
    check-cast v7, La/rdq0;

    .line 1199
    .line 1200
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v1

    .line 1208
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1209
    .line 1210
    .line 1211
    check-cast v0, La/rdq0;

    .line 1212
    .line 1213
    const v2, 0x7f0d06ad

    .line 1214
    .line 1215
    .line 1216
    invoke-virtual {v1, v2, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1217
    .line 1218
    .line 1219
    move-result-object v1

    .line 1220
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1221
    .line 1222
    .line 1223
    invoke-static {v1, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    if-eqz v0, :cond_23

    .line 1228
    .line 1229
    const v2, 0x7f0a04ce

    .line 1230
    .line 1231
    .line 1232
    invoke-static {v1, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v3

    .line 1236
    check-cast v3, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1237
    .line 1238
    if-eqz v3, :cond_22

    .line 1239
    .line 1240
    invoke-static {v1, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1241
    .line 1242
    .line 1243
    move-result-object v2

    .line 1244
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1245
    .line 1246
    if-eqz v2, :cond_21

    .line 1247
    .line 1248
    invoke-static {v1, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1249
    .line 1250
    .line 1251
    move-result-object v2

    .line 1252
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1253
    .line 1254
    if-eqz v2, :cond_20

    .line 1255
    .line 1256
    invoke-static {v1, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1261
    .line 1262
    if-eqz v2, :cond_1f

    .line 1263
    .line 1264
    invoke-static {v1, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1265
    .line 1266
    .line 1267
    move-result-object v2

    .line 1268
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 1269
    .line 1270
    if-eqz v2, :cond_1e

    .line 1271
    .line 1272
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    check-cast v2, Landroid/widget/TextView;

    .line 1277
    .line 1278
    if-eqz v2, :cond_24

    .line 1279
    .line 1280
    const v9, 0x7f0a0fba

    .line 1281
    .line 1282
    .line 1283
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1284
    .line 1285
    .line 1286
    move-result-object v4

    .line 1287
    check-cast v4, Landroid/widget/ImageView;

    .line 1288
    .line 1289
    if-eqz v4, :cond_24

    .line 1290
    .line 1291
    new-instance v4, La/xhu0;

    .line 1292
    .line 1293
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1294
    .line 1295
    invoke-direct {v4, v1, v0, v3, v2}, La/xhu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Landroid/widget/TextView;)V

    .line 1296
    .line 1297
    .line 1298
    move-object/from16 v17, v4

    .line 1299
    .line 1300
    goto :goto_a

    .line 1301
    :cond_1e
    move v9, v10

    .line 1302
    goto :goto_9

    .line 1303
    :cond_1f
    move v9, v11

    .line 1304
    goto :goto_9

    .line 1305
    :cond_20
    move v9, v12

    .line 1306
    goto :goto_9

    .line 1307
    :cond_21
    move v9, v13

    .line 1308
    goto :goto_9

    .line 1309
    :cond_22
    move v9, v2

    .line 1310
    goto :goto_9

    .line 1311
    :cond_23
    move v9, v14

    .line 1312
    :cond_24
    :goto_9
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v0

    .line 1320
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v0

    .line 1324
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1325
    .line 1326
    .line 1327
    :goto_a
    return-object v17

    .line 1328
    :pswitch_10
    check-cast v7, La/qdq0;

    .line 1329
    .line 1330
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v1

    .line 1334
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1335
    .line 1336
    .line 1337
    move-result-object v1

    .line 1338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1339
    .line 1340
    .line 1341
    check-cast v0, La/qdq0;

    .line 1342
    .line 1343
    const v2, 0x7f0d06ac

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v1, v2, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v1

    .line 1350
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1351
    .line 1352
    .line 1353
    invoke-static {v1, v14}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1354
    .line 1355
    .line 1356
    move-result-object v20

    .line 1357
    if-eqz v20, :cond_2a

    .line 1358
    .line 1359
    const v0, 0x7f0a04cd

    .line 1360
    .line 1361
    .line 1362
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1363
    .line 1364
    .line 1365
    move-result-object v2

    .line 1366
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1367
    .line 1368
    if-eqz v2, :cond_25

    .line 1369
    .line 1370
    const v0, 0x7f0a04cf

    .line 1371
    .line 1372
    .line 1373
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v2

    .line 1377
    move-object/from16 v21, v2

    .line 1378
    .line 1379
    check-cast v21, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1380
    .line 1381
    if-eqz v21, :cond_25

    .line 1382
    .line 1383
    const v0, 0x7f0a04d0

    .line 1384
    .line 1385
    .line 1386
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    move-object/from16 v22, v2

    .line 1391
    .line 1392
    check-cast v22, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1393
    .line 1394
    if-eqz v22, :cond_25

    .line 1395
    .line 1396
    const v0, 0x7f0a04d1

    .line 1397
    .line 1398
    .line 1399
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v2

    .line 1403
    move-object/from16 v23, v2

    .line 1404
    .line 1405
    check-cast v23, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1406
    .line 1407
    if-eqz v23, :cond_25

    .line 1408
    .line 1409
    const v0, 0x7f0a04d2

    .line 1410
    .line 1411
    .line 1412
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1413
    .line 1414
    .line 1415
    move-result-object v2

    .line 1416
    move-object/from16 v24, v2

    .line 1417
    .line 1418
    check-cast v24, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1419
    .line 1420
    if-eqz v24, :cond_25

    .line 1421
    .line 1422
    const v0, 0x7f0a04d3

    .line 1423
    .line 1424
    .line 1425
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1426
    .line 1427
    .line 1428
    move-result-object v2

    .line 1429
    move-object/from16 v25, v2

    .line 1430
    .line 1431
    check-cast v25, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1432
    .line 1433
    if-eqz v25, :cond_25

    .line 1434
    .line 1435
    const v0, 0x7f0a04d4

    .line 1436
    .line 1437
    .line 1438
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v2

    .line 1442
    move-object/from16 v26, v2

    .line 1443
    .line 1444
    check-cast v26, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1445
    .line 1446
    if-eqz v26, :cond_25

    .line 1447
    .line 1448
    const v0, 0x7f0a04d5

    .line 1449
    .line 1450
    .line 1451
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v2

    .line 1455
    move-object/from16 v27, v2

    .line 1456
    .line 1457
    check-cast v27, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1458
    .line 1459
    if-eqz v27, :cond_25

    .line 1460
    .line 1461
    const v0, 0x7f0a04d6

    .line 1462
    .line 1463
    .line 1464
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v2

    .line 1468
    move-object/from16 v28, v2

    .line 1469
    .line 1470
    check-cast v28, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1471
    .line 1472
    if-eqz v28, :cond_25

    .line 1473
    .line 1474
    const v0, 0x7f0a04d7

    .line 1475
    .line 1476
    .line 1477
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1478
    .line 1479
    .line 1480
    move-result-object v2

    .line 1481
    move-object/from16 v29, v2

    .line 1482
    .line 1483
    check-cast v29, Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;

    .line 1484
    .line 1485
    if-eqz v29, :cond_25

    .line 1486
    .line 1487
    invoke-static {v1, v13}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1488
    .line 1489
    .line 1490
    move-result-object v0

    .line 1491
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 1492
    .line 1493
    if-eqz v0, :cond_29

    .line 1494
    .line 1495
    invoke-static {v1, v12}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v0

    .line 1499
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 1500
    .line 1501
    if-eqz v0, :cond_28

    .line 1502
    .line 1503
    invoke-static {v1, v11}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1504
    .line 1505
    .line 1506
    move-result-object v0

    .line 1507
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 1508
    .line 1509
    if-eqz v0, :cond_27

    .line 1510
    .line 1511
    invoke-static {v1, v10}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 1516
    .line 1517
    if-eqz v0, :cond_26

    .line 1518
    .line 1519
    const v0, 0x7f0a09d0

    .line 1520
    .line 1521
    .line 1522
    invoke-static {v1, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1523
    .line 1524
    .line 1525
    move-result-object v2

    .line 1526
    check-cast v2, Landroid/widget/ImageView;

    .line 1527
    .line 1528
    if-eqz v2, :cond_25

    .line 1529
    .line 1530
    invoke-static {v1, v9}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1531
    .line 1532
    .line 1533
    move-result-object v0

    .line 1534
    move-object/from16 v30, v0

    .line 1535
    .line 1536
    check-cast v30, Landroid/widget/TextView;

    .line 1537
    .line 1538
    if-eqz v30, :cond_2b

    .line 1539
    .line 1540
    new-instance v18, La/whu0;

    .line 1541
    .line 1542
    move-object/from16 v19, v1

    .line 1543
    .line 1544
    check-cast v19, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1545
    .line 1546
    invoke-direct/range {v18 .. v30}, La/whu0;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Lorg/xplatform/bonus_games/impl/lottery/presentation/views/ErasableView;Landroid/widget/TextView;)V

    .line 1547
    .line 1548
    .line 1549
    move-object/from16 v17, v18

    .line 1550
    .line 1551
    goto :goto_c

    .line 1552
    :cond_25
    move v9, v0

    .line 1553
    goto :goto_b

    .line 1554
    :cond_26
    move v9, v10

    .line 1555
    goto :goto_b

    .line 1556
    :cond_27
    move v9, v11

    .line 1557
    goto :goto_b

    .line 1558
    :cond_28
    move v9, v12

    .line 1559
    goto :goto_b

    .line 1560
    :cond_29
    move v9, v13

    .line 1561
    goto :goto_b

    .line 1562
    :cond_2a
    move v9, v14

    .line 1563
    :cond_2b
    :goto_b
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v0

    .line 1567
    invoke-virtual {v0, v9}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v0

    .line 1571
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1572
    .line 1573
    .line 1574
    move-result-object v0

    .line 1575
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1576
    .line 1577
    .line 1578
    :goto_c
    return-object v17

    .line 1579
    :pswitch_11
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1580
    .line 1581
    check-cast v0, La/etp0;

    .line 1582
    .line 1583
    iget-object v0, v0, La/etp0;->b:La/ctp0;

    .line 1584
    .line 1585
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1586
    .line 1587
    .line 1588
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1589
    .line 1590
    return-object v0

    .line 1591
    :pswitch_12
    check-cast v7, La/ajp0;

    .line 1592
    .line 1593
    sget-object v1, La/ajp0;->r2:La/s9m0;

    .line 1594
    .line 1595
    iget-object v1, v7, La/ajp0;->q2:La/a8z;

    .line 1596
    .line 1597
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v1

    .line 1601
    check-cast v1, La/k3t0;

    .line 1602
    .line 1603
    new-instance v2, La/cjp0;

    .line 1604
    .line 1605
    check-cast v0, La/kjp0;

    .line 1606
    .line 1607
    iget-object v0, v0, La/kjp0;->a:La/bop0;

    .line 1608
    .line 1609
    invoke-direct {v2, v0}, La/cjp0;-><init>(La/bop0;)V

    .line 1610
    .line 1611
    .line 1612
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1613
    .line 1614
    .line 1615
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1616
    .line 1617
    return-object v0

    .line 1618
    :pswitch_13
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1619
    .line 1620
    check-cast v0, La/s6p0;

    .line 1621
    .line 1622
    check-cast v0, La/r6p0;

    .line 1623
    .line 1624
    iget v0, v0, La/r6p0;->a:I

    .line 1625
    .line 1626
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v0

    .line 1630
    invoke-interface {v7, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1631
    .line 1632
    .line 1633
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1634
    .line 1635
    return-object v0

    .line 1636
    :pswitch_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 1637
    .line 1638
    new-instance v1, La/z3p0;

    .line 1639
    .line 1640
    check-cast v0, La/n3p0;

    .line 1641
    .line 1642
    check-cast v0, La/m3p0;

    .line 1643
    .line 1644
    iget-object v0, v0, La/m3p0;->b:La/xcp;

    .line 1645
    .line 1646
    invoke-direct {v1, v0}, La/z3p0;-><init>(La/xcp;)V

    .line 1647
    .line 1648
    .line 1649
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1653
    .line 1654
    return-object v0

    .line 1655
    :pswitch_15
    check-cast v7, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 1656
    .line 1657
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1658
    .line 1659
    .line 1660
    move-result-object v1

    .line 1661
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1662
    .line 1663
    .line 1664
    move-result-object v1

    .line 1665
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1666
    .line 1667
    .line 1668
    move-object v8, v0

    .line 1669
    check-cast v8, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 1670
    .line 1671
    const v0, 0x7f0d05f8

    .line 1672
    .line 1673
    .line 1674
    invoke-virtual {v1, v0, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1675
    .line 1676
    .line 1677
    const v0, 0x7f0a003c

    .line 1678
    .line 1679
    .line 1680
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1681
    .line 1682
    .line 1683
    move-result-object v1

    .line 1684
    move-object v9, v1

    .line 1685
    check-cast v9, Lorg/xplatform/uikit/components/accordion/DsAccordion;

    .line 1686
    .line 1687
    if-eqz v9, :cond_2c

    .line 1688
    .line 1689
    const v0, 0x7f0a085e

    .line 1690
    .line 1691
    .line 1692
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v1

    .line 1696
    move-object v10, v1

    .line 1697
    check-cast v10, Landroid/widget/ImageView;

    .line 1698
    .line 1699
    if-eqz v10, :cond_2c

    .line 1700
    .line 1701
    const v0, 0x7f0a0989

    .line 1702
    .line 1703
    .line 1704
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1705
    .line 1706
    .line 1707
    move-result-object v1

    .line 1708
    move-object v11, v1

    .line 1709
    check-cast v11, Landroid/widget/LinearLayout;

    .line 1710
    .line 1711
    if-eqz v11, :cond_2c

    .line 1712
    .line 1713
    const v0, 0x7f0a098d

    .line 1714
    .line 1715
    .line 1716
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1717
    .line 1718
    .line 1719
    move-result-object v1

    .line 1720
    move-object v12, v1

    .line 1721
    check-cast v12, Landroid/widget/LinearLayout;

    .line 1722
    .line 1723
    if-eqz v12, :cond_2c

    .line 1724
    .line 1725
    const v0, 0x7f0a0992

    .line 1726
    .line 1727
    .line 1728
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v1

    .line 1732
    move-object v13, v1

    .line 1733
    check-cast v13, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1734
    .line 1735
    if-eqz v13, :cond_2c

    .line 1736
    .line 1737
    const v0, 0x7f0a0dfa

    .line 1738
    .line 1739
    .line 1740
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1741
    .line 1742
    .line 1743
    move-result-object v1

    .line 1744
    move-object v14, v1

    .line 1745
    check-cast v14, Lorg/xplatform/uikit/components/shimmer/DsShimmerView;

    .line 1746
    .line 1747
    if-eqz v14, :cond_2c

    .line 1748
    .line 1749
    const v0, 0x7f0a10e3

    .line 1750
    .line 1751
    .line 1752
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1753
    .line 1754
    .line 1755
    move-result-object v1

    .line 1756
    check-cast v1, Landroid/widget/TextView;

    .line 1757
    .line 1758
    if-eqz v1, :cond_2c

    .line 1759
    .line 1760
    const v0, 0x7f0a1151

    .line 1761
    .line 1762
    .line 1763
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1764
    .line 1765
    .line 1766
    move-result-object v1

    .line 1767
    move-object v15, v1

    .line 1768
    check-cast v15, Landroid/widget/TextView;

    .line 1769
    .line 1770
    if-eqz v15, :cond_2c

    .line 1771
    .line 1772
    const v0, 0x7f0a1153

    .line 1773
    .line 1774
    .line 1775
    invoke-static {v8, v0}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1776
    .line 1777
    .line 1778
    move-result-object v1

    .line 1779
    move-object/from16 v16, v1

    .line 1780
    .line 1781
    check-cast v16, Landroid/widget/TextView;

    .line 1782
    .line 1783
    if-eqz v16, :cond_2c

    .line 1784
    .line 1785
    new-instance v7, La/fvo0;

    .line 1786
    .line 1787
    invoke-direct/range {v7 .. v16}, La/fvo0;-><init>(Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;Lorg/xplatform/uikit/components/accordion/DsAccordion;Landroid/widget/ImageView;Landroid/widget/LinearLayout;Landroid/widget/LinearLayout;Landroidx/constraintlayout/widget/ConstraintLayout;Lorg/xplatform/uikit/components/shimmer/DsShimmerView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 1788
    .line 1789
    .line 1790
    move-object/from16 v17, v7

    .line 1791
    .line 1792
    goto :goto_d

    .line 1793
    :cond_2c
    invoke-virtual {v8}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v1

    .line 1797
    invoke-virtual {v1, v0}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1798
    .line 1799
    .line 1800
    move-result-object v0

    .line 1801
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v0

    .line 1805
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1806
    .line 1807
    .line 1808
    :goto_d
    return-object v17

    .line 1809
    :pswitch_16
    check-cast v0, La/a8z;

    .line 1810
    .line 1811
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v0

    .line 1815
    check-cast v0, La/riu0;

    .line 1816
    .line 1817
    instance-of v1, v0, La/wmv;

    .line 1818
    .line 1819
    if-eqz v1, :cond_2d

    .line 1820
    .line 1821
    move-object/from16 v17, v0

    .line 1822
    .line 1823
    check-cast v17, La/wmv;

    .line 1824
    .line 1825
    :cond_2d
    if-eqz v17, :cond_2e

    .line 1826
    .line 1827
    invoke-interface/range {v17 .. v17}, La/wmv;->n()La/miu0;

    .line 1828
    .line 1829
    .line 1830
    move-result-object v0

    .line 1831
    if-nez v0, :cond_2f

    .line 1832
    .line 1833
    :cond_2e
    check-cast v7, La/nfo0;

    .line 1834
    .line 1835
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->n()La/miu0;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v0

    .line 1839
    :cond_2f
    return-object v0

    .line 1840
    :pswitch_17
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 1841
    .line 1842
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1843
    .line 1844
    .line 1845
    move-result-object v1

    .line 1846
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1847
    .line 1848
    .line 1849
    move-result-object v1

    .line 1850
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1851
    .line 1852
    .line 1853
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 1854
    .line 1855
    const v2, 0x7f0d05ca

    .line 1856
    .line 1857
    .line 1858
    invoke-virtual {v1, v2, v0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 1859
    .line 1860
    .line 1861
    move-result-object v1

    .line 1862
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 1863
    .line 1864
    .line 1865
    invoke-static {v1, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v0

    .line 1869
    check-cast v0, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 1870
    .line 1871
    if-eqz v0, :cond_30

    .line 1872
    .line 1873
    const v8, 0x7f0a1260

    .line 1874
    .line 1875
    .line 1876
    invoke-static {v1, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v2

    .line 1880
    check-cast v2, Landroid/widget/TextView;

    .line 1881
    .line 1882
    if-eqz v2, :cond_30

    .line 1883
    .line 1884
    new-instance v3, La/x5o0;

    .line 1885
    .line 1886
    check-cast v1, Landroid/widget/LinearLayout;

    .line 1887
    .line 1888
    invoke-direct {v3, v1, v0, v2}, La/x5o0;-><init>(Landroid/widget/LinearLayout;Lorg/xplatform/uikit/components/timer/DsTimer;Landroid/widget/TextView;)V

    .line 1889
    .line 1890
    .line 1891
    move-object/from16 v17, v3

    .line 1892
    .line 1893
    goto :goto_e

    .line 1894
    :cond_30
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 1895
    .line 1896
    .line 1897
    move-result-object v0

    .line 1898
    invoke-virtual {v0, v8}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 1899
    .line 1900
    .line 1901
    move-result-object v0

    .line 1902
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v0

    .line 1906
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 1907
    .line 1908
    .line 1909
    :goto_e
    return-object v17

    .line 1910
    :pswitch_18
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;

    .line 1911
    .line 1912
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1913
    .line 1914
    .line 1915
    move-result-object v1

    .line 1916
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 1917
    .line 1918
    .line 1919
    move-result-object v1

    .line 1920
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1921
    .line 1922
    .line 1923
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;

    .line 1924
    .line 1925
    const v5, 0x7f0d05e3

    .line 1926
    .line 1927
    .line 1928
    invoke-virtual {v1, v5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 1929
    .line 1930
    .line 1931
    const v1, 0x7f0a06c4

    .line 1932
    .line 1933
    .line 1934
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1935
    .line 1936
    .line 1937
    move-result-object v5

    .line 1938
    check-cast v5, Landroidx/constraintlayout/widget/Guideline;

    .line 1939
    .line 1940
    if-eqz v5, :cond_3b

    .line 1941
    .line 1942
    const v1, 0x7f0a0840

    .line 1943
    .line 1944
    .line 1945
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1946
    .line 1947
    .line 1948
    move-result-object v5

    .line 1949
    check-cast v5, Landroid/widget/ImageView;

    .line 1950
    .line 1951
    if-eqz v5, :cond_3a

    .line 1952
    .line 1953
    const v1, 0x7f0a0841

    .line 1954
    .line 1955
    .line 1956
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1957
    .line 1958
    .line 1959
    move-result-object v5

    .line 1960
    move-object/from16 v21, v5

    .line 1961
    .line 1962
    check-cast v21, Landroid/widget/ImageView;

    .line 1963
    .line 1964
    if-eqz v21, :cond_39

    .line 1965
    .line 1966
    const v1, 0x7f0a0842

    .line 1967
    .line 1968
    .line 1969
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1970
    .line 1971
    .line 1972
    move-result-object v5

    .line 1973
    move-object/from16 v22, v5

    .line 1974
    .line 1975
    check-cast v22, Landroid/widget/ImageView;

    .line 1976
    .line 1977
    if-eqz v22, :cond_38

    .line 1978
    .line 1979
    const v1, 0x7f0a0843

    .line 1980
    .line 1981
    .line 1982
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1983
    .line 1984
    .line 1985
    move-result-object v5

    .line 1986
    move-object/from16 v23, v5

    .line 1987
    .line 1988
    check-cast v23, Landroid/widget/ImageView;

    .line 1989
    .line 1990
    if-eqz v23, :cond_37

    .line 1991
    .line 1992
    const v1, 0x7f0a08a1

    .line 1993
    .line 1994
    .line 1995
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 1996
    .line 1997
    .line 1998
    move-result-object v5

    .line 1999
    check-cast v5, Landroid/widget/ImageView;

    .line 2000
    .line 2001
    if-eqz v5, :cond_36

    .line 2002
    .line 2003
    const v1, 0x7f0a08a2

    .line 2004
    .line 2005
    .line 2006
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2007
    .line 2008
    .line 2009
    move-result-object v5

    .line 2010
    move-object/from16 v24, v5

    .line 2011
    .line 2012
    check-cast v24, Landroid/widget/ImageView;

    .line 2013
    .line 2014
    if-eqz v24, :cond_33

    .line 2015
    .line 2016
    const v1, 0x7f0a08a3

    .line 2017
    .line 2018
    .line 2019
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2020
    .line 2021
    .line 2022
    move-result-object v5

    .line 2023
    move-object/from16 v25, v5

    .line 2024
    .line 2025
    check-cast v25, Landroid/widget/ImageView;

    .line 2026
    .line 2027
    if-eqz v25, :cond_33

    .line 2028
    .line 2029
    const v1, 0x7f0a08a4

    .line 2030
    .line 2031
    .line 2032
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2033
    .line 2034
    .line 2035
    move-result-object v5

    .line 2036
    move-object/from16 v26, v5

    .line 2037
    .line 2038
    check-cast v26, Landroid/widget/ImageView;

    .line 2039
    .line 2040
    if-eqz v26, :cond_33

    .line 2041
    .line 2042
    invoke-static {v0, v15}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v1

    .line 2046
    move-object/from16 v27, v1

    .line 2047
    .line 2048
    check-cast v27, Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;

    .line 2049
    .line 2050
    if-eqz v27, :cond_35

    .line 2051
    .line 2052
    const v1, 0x7f0a110f

    .line 2053
    .line 2054
    .line 2055
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2056
    .line 2057
    .line 2058
    move-result-object v5

    .line 2059
    move-object/from16 v28, v5

    .line 2060
    .line 2061
    check-cast v28, Landroid/widget/TextView;

    .line 2062
    .line 2063
    if-eqz v28, :cond_33

    .line 2064
    .line 2065
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v1

    .line 2069
    check-cast v1, Landroid/widget/TextView;

    .line 2070
    .line 2071
    if-eqz v1, :cond_34

    .line 2072
    .line 2073
    const v1, 0x7f0a11fb

    .line 2074
    .line 2075
    .line 2076
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v4

    .line 2080
    move-object/from16 v29, v4

    .line 2081
    .line 2082
    check-cast v29, Landroid/widget/TextView;

    .line 2083
    .line 2084
    if-eqz v29, :cond_33

    .line 2085
    .line 2086
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2087
    .line 2088
    .line 2089
    move-result-object v1

    .line 2090
    check-cast v1, Landroid/widget/TextView;

    .line 2091
    .line 2092
    if-eqz v1, :cond_32

    .line 2093
    .line 2094
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2095
    .line 2096
    .line 2097
    move-result-object v1

    .line 2098
    move-object/from16 v30, v1

    .line 2099
    .line 2100
    check-cast v30, Landroid/widget/TextView;

    .line 2101
    .line 2102
    if-eqz v30, :cond_31

    .line 2103
    .line 2104
    new-instance v19, La/w7o0;

    .line 2105
    .line 2106
    move-object/from16 v20, v0

    .line 2107
    .line 2108
    invoke-direct/range {v19 .. v30}, La/w7o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/seka/SyntheticSekaView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/cyber/game/universal/impl/presentation/timerView/SyntheticTimerView;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 2109
    .line 2110
    .line 2111
    move-object/from16 v17, v19

    .line 2112
    .line 2113
    goto :goto_10

    .line 2114
    :cond_31
    move-object/from16 v20, v0

    .line 2115
    .line 2116
    goto :goto_f

    .line 2117
    :cond_32
    move-object/from16 v20, v0

    .line 2118
    .line 2119
    move v2, v3

    .line 2120
    goto :goto_f

    .line 2121
    :cond_33
    move-object/from16 v20, v0

    .line 2122
    .line 2123
    move v2, v1

    .line 2124
    goto :goto_f

    .line 2125
    :cond_34
    move-object/from16 v20, v0

    .line 2126
    .line 2127
    move v2, v4

    .line 2128
    goto :goto_f

    .line 2129
    :cond_35
    move-object/from16 v20, v0

    .line 2130
    .line 2131
    move v2, v15

    .line 2132
    goto :goto_f

    .line 2133
    :cond_36
    move-object/from16 v20, v0

    .line 2134
    .line 2135
    const v2, 0x7f0a08a1

    .line 2136
    .line 2137
    .line 2138
    goto :goto_f

    .line 2139
    :cond_37
    move-object/from16 v20, v0

    .line 2140
    .line 2141
    const v2, 0x7f0a0843

    .line 2142
    .line 2143
    .line 2144
    goto :goto_f

    .line 2145
    :cond_38
    move-object/from16 v20, v0

    .line 2146
    .line 2147
    const v2, 0x7f0a0842

    .line 2148
    .line 2149
    .line 2150
    goto :goto_f

    .line 2151
    :cond_39
    move-object/from16 v20, v0

    .line 2152
    .line 2153
    const v2, 0x7f0a0841

    .line 2154
    .line 2155
    .line 2156
    goto :goto_f

    .line 2157
    :cond_3a
    move-object/from16 v20, v0

    .line 2158
    .line 2159
    const v2, 0x7f0a0840

    .line 2160
    .line 2161
    .line 2162
    goto :goto_f

    .line 2163
    :cond_3b
    move-object/from16 v20, v0

    .line 2164
    .line 2165
    const v2, 0x7f0a06c4

    .line 2166
    .line 2167
    .line 2168
    :goto_f
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2169
    .line 2170
    .line 2171
    move-result-object v0

    .line 2172
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 2173
    .line 2174
    .line 2175
    move-result-object v0

    .line 2176
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v0

    .line 2180
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 2181
    .line 2182
    .line 2183
    :goto_10
    return-object v17

    .line 2184
    :pswitch_19
    check-cast v7, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;

    .line 2185
    .line 2186
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2187
    .line 2188
    .line 2189
    move-result-object v1

    .line 2190
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2191
    .line 2192
    .line 2193
    move-result-object v1

    .line 2194
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2195
    .line 2196
    .line 2197
    check-cast v0, Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;

    .line 2198
    .line 2199
    const v5, 0x7f0d05cf

    .line 2200
    .line 2201
    .line 2202
    invoke-virtual {v1, v5, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2203
    .line 2204
    .line 2205
    const v1, 0x7f0a06c4

    .line 2206
    .line 2207
    .line 2208
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2209
    .line 2210
    .line 2211
    move-result-object v5

    .line 2212
    check-cast v5, Landroidx/constraintlayout/widget/Guideline;

    .line 2213
    .line 2214
    if-eqz v5, :cond_3e

    .line 2215
    .line 2216
    const v5, 0x7f0a0840

    .line 2217
    .line 2218
    .line 2219
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2220
    .line 2221
    .line 2222
    move-result-object v1

    .line 2223
    move-object/from16 v21, v1

    .line 2224
    .line 2225
    check-cast v21, Landroid/widget/ImageView;

    .line 2226
    .line 2227
    if-eqz v21, :cond_41

    .line 2228
    .line 2229
    const v1, 0x7f0a0841

    .line 2230
    .line 2231
    .line 2232
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2233
    .line 2234
    .line 2235
    move-result-object v5

    .line 2236
    move-object/from16 v22, v5

    .line 2237
    .line 2238
    check-cast v22, Landroid/widget/ImageView;

    .line 2239
    .line 2240
    if-eqz v22, :cond_3e

    .line 2241
    .line 2242
    const v5, 0x7f0a0842

    .line 2243
    .line 2244
    .line 2245
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2246
    .line 2247
    .line 2248
    move-result-object v1

    .line 2249
    move-object/from16 v23, v1

    .line 2250
    .line 2251
    check-cast v23, Landroid/widget/ImageView;

    .line 2252
    .line 2253
    if-eqz v23, :cond_41

    .line 2254
    .line 2255
    const v1, 0x7f0a0843

    .line 2256
    .line 2257
    .line 2258
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2259
    .line 2260
    .line 2261
    move-result-object v5

    .line 2262
    move-object/from16 v24, v5

    .line 2263
    .line 2264
    check-cast v24, Landroid/widget/ImageView;

    .line 2265
    .line 2266
    if-eqz v24, :cond_3e

    .line 2267
    .line 2268
    const v5, 0x7f0a08a1

    .line 2269
    .line 2270
    .line 2271
    invoke-static {v0, v5}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v1

    .line 2275
    move-object/from16 v25, v1

    .line 2276
    .line 2277
    check-cast v25, Landroid/widget/ImageView;

    .line 2278
    .line 2279
    if-eqz v25, :cond_41

    .line 2280
    .line 2281
    const v1, 0x7f0a08a2

    .line 2282
    .line 2283
    .line 2284
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v5

    .line 2288
    move-object/from16 v26, v5

    .line 2289
    .line 2290
    check-cast v26, Landroid/widget/ImageView;

    .line 2291
    .line 2292
    if-eqz v26, :cond_3e

    .line 2293
    .line 2294
    const v1, 0x7f0a08a3

    .line 2295
    .line 2296
    .line 2297
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2298
    .line 2299
    .line 2300
    move-result-object v5

    .line 2301
    move-object/from16 v27, v5

    .line 2302
    .line 2303
    check-cast v27, Landroid/widget/ImageView;

    .line 2304
    .line 2305
    if-eqz v27, :cond_3e

    .line 2306
    .line 2307
    const v1, 0x7f0a08a4

    .line 2308
    .line 2309
    .line 2310
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2311
    .line 2312
    .line 2313
    move-result-object v5

    .line 2314
    move-object/from16 v28, v5

    .line 2315
    .line 2316
    check-cast v28, Landroid/widget/ImageView;

    .line 2317
    .line 2318
    if-eqz v28, :cond_3e

    .line 2319
    .line 2320
    invoke-static {v0, v8}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2321
    .line 2322
    .line 2323
    move-result-object v1

    .line 2324
    move-object/from16 v29, v1

    .line 2325
    .line 2326
    check-cast v29, Lorg/xplatform/uikit/components/timer/DsTimer;

    .line 2327
    .line 2328
    if-eqz v29, :cond_40

    .line 2329
    .line 2330
    const v1, 0x7f0a1110

    .line 2331
    .line 2332
    .line 2333
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2334
    .line 2335
    .line 2336
    move-result-object v5

    .line 2337
    move-object/from16 v30, v5

    .line 2338
    .line 2339
    check-cast v30, Landroid/widget/TextView;

    .line 2340
    .line 2341
    if-eqz v30, :cond_3e

    .line 2342
    .line 2343
    invoke-static {v0, v4}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2344
    .line 2345
    .line 2346
    move-result-object v1

    .line 2347
    check-cast v1, Landroid/widget/TextView;

    .line 2348
    .line 2349
    if-eqz v1, :cond_3f

    .line 2350
    .line 2351
    const v1, 0x7f0a11fc

    .line 2352
    .line 2353
    .line 2354
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v4

    .line 2358
    move-object/from16 v31, v4

    .line 2359
    .line 2360
    check-cast v31, Landroid/widget/TextView;

    .line 2361
    .line 2362
    if-eqz v31, :cond_3e

    .line 2363
    .line 2364
    invoke-static {v0, v3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2365
    .line 2366
    .line 2367
    move-result-object v1

    .line 2368
    check-cast v1, Landroid/widget/TextView;

    .line 2369
    .line 2370
    if-eqz v1, :cond_3d

    .line 2371
    .line 2372
    invoke-static {v0, v2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2373
    .line 2374
    .line 2375
    move-result-object v1

    .line 2376
    move-object/from16 v32, v1

    .line 2377
    .line 2378
    check-cast v32, Landroid/widget/TextView;

    .line 2379
    .line 2380
    if-eqz v32, :cond_3c

    .line 2381
    .line 2382
    new-instance v19, La/c6o0;

    .line 2383
    .line 2384
    move-object/from16 v20, v0

    .line 2385
    .line 2386
    invoke-direct/range {v19 .. v32}, La/c6o0;-><init>(Lorg/xplatform/cyber/game/universal/impl/presentation/indianpoker/SyntheticIndianPokerView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Landroid/widget/ImageView;Lorg/xplatform/uikit/components/timer/DsTimer;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 2387
    .line 2388
    .line 2389
    move-object/from16 v17, v19

    .line 2390
    .line 2391
    goto :goto_12

    .line 2392
    :cond_3c
    move-object/from16 v20, v0

    .line 2393
    .line 2394
    goto :goto_11

    .line 2395
    :cond_3d
    move-object/from16 v20, v0

    .line 2396
    .line 2397
    move v2, v3

    .line 2398
    goto :goto_11

    .line 2399
    :cond_3e
    move-object/from16 v20, v0

    .line 2400
    .line 2401
    move v2, v1

    .line 2402
    goto :goto_11

    .line 2403
    :cond_3f
    move-object/from16 v20, v0

    .line 2404
    .line 2405
    move v2, v4

    .line 2406
    goto :goto_11

    .line 2407
    :cond_40
    move-object/from16 v20, v0

    .line 2408
    .line 2409
    move v2, v8

    .line 2410
    goto :goto_11

    .line 2411
    :cond_41
    move-object/from16 v20, v0

    .line 2412
    .line 2413
    move v2, v5

    .line 2414
    :goto_11
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2415
    .line 2416
    .line 2417
    move-result-object v0

    .line 2418
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v0

    .line 2422
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2423
    .line 2424
    .line 2425
    move-result-object v0

    .line 2426
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 2427
    .line 2428
    .line 2429
    :goto_12
    return-object v17

    .line 2430
    :pswitch_1a
    check-cast v7, La/snn0;

    .line 2431
    .line 2432
    sget-object v1, La/snn0;->n2:La/j6m0;

    .line 2433
    .line 2434
    iget-object v1, v7, La/snn0;->m2:La/a8z;

    .line 2435
    .line 2436
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2437
    .line 2438
    .line 2439
    move-result-object v1

    .line 2440
    check-cast v1, La/k3t0;

    .line 2441
    .line 2442
    check-cast v0, La/wnn0;

    .line 2443
    .line 2444
    iget-object v0, v0, La/wnn0;->a:La/rnn0;

    .line 2445
    .line 2446
    invoke-virtual {v1, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2447
    .line 2448
    .line 2449
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2450
    .line 2451
    return-object v0

    .line 2452
    :pswitch_1b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    .line 2453
    .line 2454
    new-instance v1, La/cen0;

    .line 2455
    .line 2456
    check-cast v0, La/aan0;

    .line 2457
    .line 2458
    invoke-direct {v1, v0}, La/cen0;-><init>(La/aan0;)V

    .line 2459
    .line 2460
    .line 2461
    invoke-interface {v7, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2462
    .line 2463
    .line 2464
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2465
    .line 2466
    return-object v0

    .line 2467
    :pswitch_1c
    check-cast v7, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 2468
    .line 2469
    invoke-virtual {v7}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v1

    .line 2473
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 2474
    .line 2475
    .line 2476
    move-result-object v1

    .line 2477
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2478
    .line 2479
    .line 2480
    check-cast v0, Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;

    .line 2481
    .line 2482
    const v2, 0x7f0d06d6

    .line 2483
    .line 2484
    .line 2485
    invoke-virtual {v1, v2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 2486
    .line 2487
    .line 2488
    const v1, 0x7f0a0160

    .line 2489
    .line 2490
    .line 2491
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v2

    .line 2495
    check-cast v2, Landroidx/fragment/app/FragmentContainerView;

    .line 2496
    .line 2497
    if-eqz v2, :cond_42

    .line 2498
    .line 2499
    const v1, 0x7f0a01f6

    .line 2500
    .line 2501
    .line 2502
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2503
    .line 2504
    .line 2505
    move-result-object v3

    .line 2506
    check-cast v3, Lcom/google/android/material/button/MaterialButton;

    .line 2507
    .line 2508
    if-eqz v3, :cond_42

    .line 2509
    .line 2510
    const v1, 0x7f0a098c

    .line 2511
    .line 2512
    .line 2513
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2514
    .line 2515
    .line 2516
    move-result-object v3

    .line 2517
    check-cast v3, Landroid/widget/LinearLayout;

    .line 2518
    .line 2519
    if-eqz v3, :cond_42

    .line 2520
    .line 2521
    const v1, 0x7f0a10f7

    .line 2522
    .line 2523
    .line 2524
    invoke-static {v0, v1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 2525
    .line 2526
    .line 2527
    move-result-object v3

    .line 2528
    check-cast v3, Landroid/widget/TextView;

    .line 2529
    .line 2530
    if-eqz v3, :cond_42

    .line 2531
    .line 2532
    new-instance v1, La/klu0;

    .line 2533
    .line 2534
    invoke-direct {v1, v0, v2}, La/klu0;-><init>(Lorg/xplatform/sportgame/classic/impl/presentation/legacy/views/SubGamesContainerView;Landroidx/fragment/app/FragmentContainerView;)V

    .line 2535
    .line 2536
    .line 2537
    move-object/from16 v17, v1

    .line 2538
    .line 2539
    goto :goto_13

    .line 2540
    :cond_42
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 2541
    .line 2542
    .line 2543
    move-result-object v0

    .line 2544
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 2545
    .line 2546
    .line 2547
    move-result-object v0

    .line 2548
    invoke-virtual {v6, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 2549
    .line 2550
    .line 2551
    move-result-object v0

    .line 2552
    invoke-static {v0}, La/hny;->u(Ljava/lang/String;)V

    .line 2553
    .line 2554
    .line 2555
    :goto_13
    return-object v17

    .line 2556
    nop

    .line 2557
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
