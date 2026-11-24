.class public final synthetic La/vp3;
.super La/xo;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V
    .locals 0

    .line 1
    iput-byte p7, p0, La/vp3;->h:B

    invoke-direct/range {p0 .. p6}, La/xo;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/vp3;->h:B

    .line 4
    .line 5
    const/4 v2, 0x5

    .line 6
    const/4 v3, -0x1

    .line 7
    const/4 v4, 0x2

    .line 8
    const/4 v5, 0x6

    .line 9
    const/4 v6, 0x4

    .line 10
    const/16 v7, 0x8

    .line 11
    .line 12
    const/4 v8, 0x1

    .line 13
    const/4 v9, 0x0

    .line 14
    const/4 v10, 0x0

    .line 15
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 16
    .line 17
    packed-switch v1, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    move-object/from16 v1, p1

    .line 21
    .line 22
    check-cast v1, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    move-object/from16 v2, p2

    .line 29
    .line 30
    check-cast v2, La/yje;

    .line 31
    .line 32
    check-cast v0, Landroid/widget/Button;

    .line 33
    .line 34
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 35
    .line 36
    .line 37
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object v0

    .line 40
    :pswitch_0
    move-object/from16 v1, p1

    .line 41
    .line 42
    check-cast v1, Ljava/util/List;

    .line 43
    .line 44
    move-object/from16 v2, p2

    .line 45
    .line 46
    check-cast v2, La/yje;

    .line 47
    .line 48
    check-cast v0, La/isz;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 51
    .line 52
    .line 53
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    return-object v0

    .line 56
    :pswitch_1
    move-object/from16 v1, p1

    .line 57
    .line 58
    check-cast v1, Ljava/lang/Boolean;

    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    move-object/from16 v2, p2

    .line 65
    .line 66
    check-cast v2, La/yje;

    .line 67
    .line 68
    check-cast v0, La/ke7;

    .line 69
    .line 70
    sget-object v2, La/ke7;->R1:La/yk5;

    .line 71
    .line 72
    invoke-virtual {v0}, La/ke7;->G0()La/lyq;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    iget-object v0, v0, La/lyq;->c:La/nq8;

    .line 77
    .line 78
    iget-object v0, v0, La/nq8;->b:Landroid/view/View;

    .line 79
    .line 80
    check-cast v0, Landroid/widget/FrameLayout;

    .line 81
    .line 82
    if-eqz v1, :cond_0

    .line 83
    .line 84
    move v7, v9

    .line 85
    :cond_0
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 86
    .line 87
    .line 88
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 89
    .line 90
    return-object v0

    .line 91
    :pswitch_2
    move-object/from16 v1, p1

    .line 92
    .line 93
    check-cast v1, Ljava/lang/Throwable;

    .line 94
    .line 95
    move-object/from16 v2, p2

    .line 96
    .line 97
    check-cast v2, La/yje;

    .line 98
    .line 99
    check-cast v0, La/dt6;

    .line 100
    .line 101
    iget-object v2, v0, La/dt6;->U:La/duj;

    .line 102
    .line 103
    new-instance v3, La/ls6;

    .line 104
    .line 105
    invoke-direct {v3, v0, v4}, La/ls6;-><init>(La/dt6;B)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 109
    .line 110
    .line 111
    sget-object v1, La/nb20;->a:La/nb20;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 114
    .line 115
    .line 116
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 117
    .line 118
    return-object v0

    .line 119
    :pswitch_3
    move-object/from16 v1, p1

    .line 120
    .line 121
    check-cast v1, Ljava/lang/Throwable;

    .line 122
    .line 123
    move-object/from16 v2, p2

    .line 124
    .line 125
    check-cast v2, La/yje;

    .line 126
    .line 127
    check-cast v0, La/wr6;

    .line 128
    .line 129
    iget-object v0, v0, La/wr6;->E:La/duj;

    .line 130
    .line 131
    new-instance v2, La/yr0;

    .line 132
    .line 133
    const/4 v3, 0x7

    .line 134
    invoke-direct {v2, v1, v3}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 138
    .line 139
    .line 140
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 141
    .line 142
    return-object v0

    .line 143
    :pswitch_4
    move-object/from16 v1, p1

    .line 144
    .line 145
    check-cast v1, Ljava/lang/Throwable;

    .line 146
    .line 147
    move-object/from16 v2, p2

    .line 148
    .line 149
    check-cast v2, La/yje;

    .line 150
    .line 151
    check-cast v0, La/vp6;

    .line 152
    .line 153
    invoke-virtual {v0, v1}, La/vp6;->N(Ljava/lang/Throwable;)V

    .line 154
    .line 155
    .line 156
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 157
    .line 158
    return-object v0

    .line 159
    :pswitch_5
    move-object/from16 v1, p1

    .line 160
    .line 161
    check-cast v1, Ljava/lang/Throwable;

    .line 162
    .line 163
    move-object/from16 v2, p2

    .line 164
    .line 165
    check-cast v2, La/yje;

    .line 166
    .line 167
    check-cast v0, La/vp6;

    .line 168
    .line 169
    invoke-virtual {v0, v1}, La/vp6;->N(Ljava/lang/Throwable;)V

    .line 170
    .line 171
    .line 172
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 173
    .line 174
    return-object v0

    .line 175
    :pswitch_6
    move-object/from16 v1, p1

    .line 176
    .line 177
    check-cast v1, Ljava/lang/Throwable;

    .line 178
    .line 179
    move-object/from16 v2, p2

    .line 180
    .line 181
    check-cast v2, La/yje;

    .line 182
    .line 183
    check-cast v0, La/vp6;

    .line 184
    .line 185
    invoke-virtual {v0, v1}, La/vp6;->N(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 189
    .line 190
    return-object v0

    .line 191
    :pswitch_7
    move-object/from16 v1, p1

    .line 192
    .line 193
    check-cast v1, Ljava/lang/Throwable;

    .line 194
    .line 195
    move-object/from16 v2, p2

    .line 196
    .line 197
    check-cast v2, La/yje;

    .line 198
    .line 199
    check-cast v0, La/vp6;

    .line 200
    .line 201
    invoke-virtual {v0, v1}, La/vp6;->N(Ljava/lang/Throwable;)V

    .line 202
    .line 203
    .line 204
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 205
    .line 206
    return-object v0

    .line 207
    :pswitch_8
    move-object/from16 v1, p1

    .line 208
    .line 209
    check-cast v1, Ljava/lang/Boolean;

    .line 210
    .line 211
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 212
    .line 213
    .line 214
    move-result v1

    .line 215
    move-object/from16 v2, p2

    .line 216
    .line 217
    check-cast v2, La/yje;

    .line 218
    .line 219
    check-cast v0, La/d06;

    .line 220
    .line 221
    invoke-virtual {v0, v1}, La/d06;->B(Z)V

    .line 222
    .line 223
    .line 224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 225
    .line 226
    return-object v0

    .line 227
    :pswitch_9
    move-object/from16 v1, p1

    .line 228
    .line 229
    check-cast v1, Ljava/lang/Throwable;

    .line 230
    .line 231
    move-object/from16 v2, p2

    .line 232
    .line 233
    check-cast v2, La/yje;

    .line 234
    .line 235
    check-cast v0, La/duj;

    .line 236
    .line 237
    invoke-virtual {v0, v1}, La/duj;->a(Ljava/lang/Throwable;)V

    .line 238
    .line 239
    .line 240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 241
    .line 242
    return-object v0

    .line 243
    :pswitch_a
    move-object/from16 v1, p1

    .line 244
    .line 245
    check-cast v1, La/sk5;

    .line 246
    .line 247
    move-object/from16 v2, p2

    .line 248
    .line 249
    check-cast v2, La/yje;

    .line 250
    .line 251
    check-cast v0, La/ej5;

    .line 252
    .line 253
    sget-object v2, La/ej5;->V1:La/bj5;

    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 256
    .line 257
    .line 258
    sget-object v2, La/qk5;->a:La/qk5;

    .line 259
    .line 260
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 261
    .line 262
    .line 263
    move-result v2

    .line 264
    if-nez v2, :cond_5

    .line 265
    .line 266
    sget-object v2, La/qk5;->b:La/qk5;

    .line 267
    .line 268
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v2

    .line 272
    if-eqz v2, :cond_2

    .line 273
    .line 274
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 275
    .line 276
    .line 277
    move-result-object v1

    .line 278
    iget-object v1, v1, La/gyq;->e:Landroidx/constraintlayout/widget/Group;

    .line 279
    .line 280
    invoke-virtual {v1, v7}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 281
    .line 282
    .line 283
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 284
    .line 285
    .line 286
    move-result-object v1

    .line 287
    iget-object v1, v1, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 288
    .line 289
    invoke-virtual {v1, v6}, Landroid/view/View;->setVisibility(I)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 293
    .line 294
    .line 295
    move-result-object v0

    .line 296
    iget-object v0, v0, La/gyq;->f:La/ewe;

    .line 297
    .line 298
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 299
    .line 300
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 301
    .line 302
    .line 303
    move-result v1

    .line 304
    if-nez v1, :cond_1

    .line 305
    .line 306
    goto :goto_0

    .line 307
    :cond_1
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 308
    .line 309
    .line 310
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 311
    .line 312
    .line 313
    goto :goto_0

    .line 314
    :cond_2
    instance-of v1, v1, La/rk5;

    .line 315
    .line 316
    if-eqz v1, :cond_4

    .line 317
    .line 318
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 319
    .line 320
    .line 321
    move-result-object v1

    .line 322
    iget-object v1, v1, La/gyq;->f:La/ewe;

    .line 323
    .line 324
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 325
    .line 326
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 327
    .line 328
    .line 329
    move-result v2

    .line 330
    if-nez v2, :cond_3

    .line 331
    .line 332
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 333
    .line 334
    .line 335
    invoke-static {v1}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 336
    .line 337
    .line 338
    :cond_3
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    iget-object v1, v1, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 343
    .line 344
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 345
    .line 346
    .line 347
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    iget-object v0, v0, La/gyq;->e:Landroidx/constraintlayout/widget/Group;

    .line 352
    .line 353
    invoke-virtual {v0, v9}, Landroidx/constraintlayout/widget/Group;->setVisibility(I)V

    .line 354
    .line 355
    .line 356
    goto :goto_0

    .line 357
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 358
    .line 359
    .line 360
    goto :goto_1

    .line 361
    :cond_5
    :goto_0
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 362
    .line 363
    :goto_1
    return-object v10

    .line 364
    :pswitch_b
    move-object/from16 v1, p1

    .line 365
    .line 366
    check-cast v1, La/gk5;

    .line 367
    .line 368
    move-object/from16 v2, p2

    .line 369
    .line 370
    check-cast v2, La/yje;

    .line 371
    .line 372
    check-cast v0, La/ej5;

    .line 373
    .line 374
    sget-object v2, La/ej5;->V1:La/bj5;

    .line 375
    .line 376
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 377
    .line 378
    .line 379
    move-result-object v2

    .line 380
    iget-object v2, v2, La/gyq;->h:Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;

    .line 381
    .line 382
    iget-boolean v3, v1, La/gk5;->a:Z

    .line 383
    .line 384
    invoke-virtual {v2, v3}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;->setEnabledState(Z)V

    .line 385
    .line 386
    .line 387
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 388
    .line 389
    .line 390
    move-result-object v0

    .line 391
    iget-object v0, v0, La/gyq;->i:Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;

    .line 392
    .line 393
    iget-boolean v1, v1, La/gk5;->b:Z

    .line 394
    .line 395
    invoke-virtual {v0, v1}, Lorg/xplatform/feature/balance_management_old/impl/presentation/view/TransactionButton;->setEnabledState(Z)V

    .line 396
    .line 397
    .line 398
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 399
    .line 400
    return-object v0

    .line 401
    :pswitch_c
    move-object/from16 v1, p1

    .line 402
    .line 403
    check-cast v1, La/lh5;

    .line 404
    .line 405
    move-object/from16 v2, p2

    .line 406
    .line 407
    check-cast v2, La/yje;

    .line 408
    .line 409
    check-cast v0, La/ej5;

    .line 410
    .line 411
    sget-object v2, La/ej5;->V1:La/bj5;

    .line 412
    .line 413
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 414
    .line 415
    .line 416
    if-eqz v1, :cond_7

    .line 417
    .line 418
    instance-of v2, v1, La/jh5;

    .line 419
    .line 420
    if-eqz v2, :cond_6

    .line 421
    .line 422
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 423
    .line 424
    .line 425
    move-result-object v2

    .line 426
    iget-object v2, v2, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 427
    .line 428
    check-cast v1, La/jh5;

    .line 429
    .line 430
    iget-object v3, v1, La/jh5;->b:Ljava/lang/String;

    .line 431
    .line 432
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setLabel(Ljava/lang/CharSequence;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 436
    .line 437
    .line 438
    move-result-object v2

    .line 439
    iget-object v2, v2, La/gyq;->c:Lorg/xplatform/uikit/components/account_info/DsAccountInfo;

    .line 440
    .line 441
    new-instance v3, La/ke;

    .line 442
    .line 443
    sget-object v4, La/pn40;->a:La/pn40;

    .line 444
    .line 445
    iget-wide v4, v1, La/jh5;->c:D

    .line 446
    .line 447
    sget-object v6, La/p3u0;->c:La/p3u0;

    .line 448
    .line 449
    invoke-static {v4, v5, v6}, La/pn40;->c(DLa/p3u0;)Ljava/lang/String;

    .line 450
    .line 451
    .line 452
    move-result-object v4

    .line 453
    iget-object v5, v1, La/jh5;->d:Ljava/lang/String;

    .line 454
    .line 455
    invoke-direct {v3, v4, v5}, La/ke;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/account_info/DsAccountInfo;->setModel(La/ke;)V

    .line 459
    .line 460
    .line 461
    invoke-virtual {v0}, La/ej5;->G0()La/gyq;

    .line 462
    .line 463
    .line 464
    move-result-object v0

    .line 465
    iget-object v0, v0, La/gyq;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 466
    .line 467
    iget-boolean v1, v1, La/jh5;->e:Z

    .line 468
    .line 469
    invoke-virtual {v0, v1, v8, v8}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 470
    .line 471
    .line 472
    goto :goto_2

    .line 473
    :cond_6
    instance-of v1, v1, La/kh5;

    .line 474
    .line 475
    if-eqz v1, :cond_7

    .line 476
    .line 477
    invoke-virtual {v0}, La/ej5;->H0()La/dk5;

    .line 478
    .line 479
    .line 480
    move-result-object v0

    .line 481
    iget-object v0, v0, La/dk5;->f0:La/p7m0;

    .line 482
    .line 483
    sget-object v1, La/qk5;->b:La/qk5;

    .line 484
    .line 485
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v0, v10, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 489
    .line 490
    .line 491
    :goto_2
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 492
    .line 493
    goto :goto_3

    .line 494
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 495
    .line 496
    .line 497
    :goto_3
    return-object v10

    .line 498
    :pswitch_d
    move-object/from16 v1, p1

    .line 499
    .line 500
    check-cast v1, Ljava/lang/Boolean;

    .line 501
    .line 502
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 503
    .line 504
    .line 505
    move-result v1

    .line 506
    move-object/from16 v2, p2

    .line 507
    .line 508
    check-cast v2, La/yje;

    .line 509
    .line 510
    check-cast v0, La/ii5;

    .line 511
    .line 512
    sget-object v2, La/ii5;->O1:La/gfk0;

    .line 513
    .line 514
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 515
    .line 516
    .line 517
    move-result-object v2

    .line 518
    iget-object v2, v2, La/hyq;->d:Landroidx/recyclerview/widget/RecyclerView;

    .line 519
    .line 520
    if-eqz v1, :cond_8

    .line 521
    .line 522
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 523
    .line 524
    .line 525
    move-result-object v0

    .line 526
    iget-object v0, v0, La/hyq;->a:Landroid/widget/FrameLayout;

    .line 527
    .line 528
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 529
    .line 530
    .line 531
    move-result-object v0

    .line 532
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    const v1, 0x7f080269

    .line 536
    .line 537
    .line 538
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    goto :goto_4

    .line 543
    :cond_8
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 544
    .line 545
    .line 546
    move-result-object v0

    .line 547
    iget-object v0, v0, La/hyq;->a:Landroid/widget/FrameLayout;

    .line 548
    .line 549
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 550
    .line 551
    .line 552
    move-result-object v0

    .line 553
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    const v1, 0x7f080268

    .line 557
    .line 558
    .line 559
    invoke-virtual {v0, v1}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 560
    .line 561
    .line 562
    move-result-object v0

    .line 563
    :goto_4
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 564
    .line 565
    .line 566
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 567
    .line 568
    return-object v0

    .line 569
    :pswitch_e
    move-object/from16 v1, p1

    .line 570
    .line 571
    check-cast v1, La/sk5;

    .line 572
    .line 573
    move-object/from16 v2, p2

    .line 574
    .line 575
    check-cast v2, La/yje;

    .line 576
    .line 577
    check-cast v0, La/ii5;

    .line 578
    .line 579
    sget-object v2, La/ii5;->O1:La/gfk0;

    .line 580
    .line 581
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    sget-object v2, La/qk5;->a:La/qk5;

    .line 585
    .line 586
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 587
    .line 588
    .line 589
    move-result v2

    .line 590
    if-nez v2, :cond_c

    .line 591
    .line 592
    sget-object v2, La/qk5;->b:La/qk5;

    .line 593
    .line 594
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v2

    .line 598
    if-eqz v2, :cond_a

    .line 599
    .line 600
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 601
    .line 602
    .line 603
    move-result-object v1

    .line 604
    iget-object v1, v1, La/hyq;->b:La/ewe;

    .line 605
    .line 606
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 607
    .line 608
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 609
    .line 610
    .line 611
    move-result v1

    .line 612
    if-nez v1, :cond_9

    .line 613
    .line 614
    goto :goto_5

    .line 615
    :cond_9
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 616
    .line 617
    .line 618
    move-result-object v1

    .line 619
    iget-object v1, v1, La/hyq;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 620
    .line 621
    invoke-virtual {v1, v7}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 622
    .line 623
    .line 624
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 625
    .line 626
    .line 627
    move-result-object v1

    .line 628
    iget-object v1, v1, La/hyq;->b:La/ewe;

    .line 629
    .line 630
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 631
    .line 632
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 633
    .line 634
    .line 635
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    iget-object v0, v0, La/hyq;->b:La/ewe;

    .line 640
    .line 641
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 642
    .line 643
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 644
    .line 645
    .line 646
    goto :goto_5

    .line 647
    :cond_a
    instance-of v1, v1, La/rk5;

    .line 648
    .line 649
    if-eqz v1, :cond_b

    .line 650
    .line 651
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 652
    .line 653
    .line 654
    move-result-object v1

    .line 655
    iget-object v1, v1, La/hyq;->b:La/ewe;

    .line 656
    .line 657
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 658
    .line 659
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 660
    .line 661
    .line 662
    move-result v1

    .line 663
    if-nez v1, :cond_c

    .line 664
    .line 665
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 666
    .line 667
    .line 668
    move-result-object v1

    .line 669
    iget-object v1, v1, La/hyq;->b:La/ewe;

    .line 670
    .line 671
    iget-object v1, v1, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 672
    .line 673
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 674
    .line 675
    .line 676
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 677
    .line 678
    .line 679
    move-result-object v0

    .line 680
    iget-object v0, v0, La/hyq;->b:La/ewe;

    .line 681
    .line 682
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 683
    .line 684
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 685
    .line 686
    .line 687
    goto :goto_5

    .line 688
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 689
    .line 690
    .line 691
    goto :goto_6

    .line 692
    :cond_c
    :goto_5
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 693
    .line 694
    :goto_6
    return-object v10

    .line 695
    :pswitch_f
    move-object/from16 v1, p1

    .line 696
    .line 697
    check-cast v1, La/mh5;

    .line 698
    .line 699
    move-object/from16 v2, p2

    .line 700
    .line 701
    check-cast v2, La/yje;

    .line 702
    .line 703
    check-cast v0, La/ii5;

    .line 704
    .line 705
    sget-object v2, La/ii5;->O1:La/gfk0;

    .line 706
    .line 707
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 708
    .line 709
    .line 710
    sget-object v0, La/mh5;->a:La/mh5;

    .line 711
    .line 712
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 713
    .line 714
    .line 715
    move-result v0

    .line 716
    if-eqz v0, :cond_d

    .line 717
    .line 718
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 719
    .line 720
    goto :goto_7

    .line 721
    :cond_d
    invoke-static {}, La/t9f;->b()V

    .line 722
    .line 723
    .line 724
    :goto_7
    return-object v10

    .line 725
    :pswitch_10
    move-object/from16 v1, p1

    .line 726
    .line 727
    check-cast v1, La/jk5;

    .line 728
    .line 729
    move-object/from16 v2, p2

    .line 730
    .line 731
    check-cast v2, La/yje;

    .line 732
    .line 733
    check-cast v0, La/ii5;

    .line 734
    .line 735
    sget-object v2, La/ii5;->O1:La/gfk0;

    .line 736
    .line 737
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 738
    .line 739
    .line 740
    sget-object v2, La/jk5;->a:La/jk5;

    .line 741
    .line 742
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    if-nez v2, :cond_11

    .line 747
    .line 748
    sget-object v2, La/jk5;->c:La/jk5;

    .line 749
    .line 750
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 751
    .line 752
    .line 753
    move-result v2

    .line 754
    if-eqz v2, :cond_f

    .line 755
    .line 756
    invoke-virtual {v0}, La/ii5;->I0()La/fk5;

    .line 757
    .line 758
    .line 759
    move-result-object v0

    .line 760
    iget-object v0, v0, La/gl80;->e:La/f04;

    .line 761
    .line 762
    iget-object v0, v0, La/f04;->h:La/d04;

    .line 763
    .line 764
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 765
    .line 766
    .line 767
    sget-object v1, Landroid/os/Build;->ID:Ljava/lang/String;

    .line 768
    .line 769
    if-eqz v1, :cond_e

    .line 770
    .line 771
    const-string v1, "Paging"

    .line 772
    .line 773
    const/4 v2, 0x3

    .line 774
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 775
    .line 776
    .line 777
    move-result v2

    .line 778
    if-eqz v2, :cond_e

    .line 779
    .line 780
    const-string v2, "Refresh signal received"

    .line 781
    .line 782
    invoke-static {v1, v2, v10}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 783
    .line 784
    .line 785
    :cond_e
    iget-object v0, v0, La/d04;->c:La/w6t0;

    .line 786
    .line 787
    invoke-interface {v0}, La/w6t0;->p()V

    .line 788
    .line 789
    .line 790
    goto :goto_8

    .line 791
    :cond_f
    sget-object v2, La/jk5;->b:La/jk5;

    .line 792
    .line 793
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    if-eqz v1, :cond_10

    .line 798
    .line 799
    invoke-virtual {v0}, La/ii5;->H0()La/hyq;

    .line 800
    .line 801
    .line 802
    move-result-object v0

    .line 803
    iget-object v0, v0, La/hyq;->e:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 804
    .line 805
    invoke-virtual {v0, v9}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 806
    .line 807
    .line 808
    goto :goto_8

    .line 809
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 810
    .line 811
    .line 812
    goto :goto_9

    .line 813
    :cond_11
    :goto_8
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 814
    .line 815
    :goto_9
    return-object v10

    .line 816
    :pswitch_11
    move-object/from16 v1, p1

    .line 817
    .line 818
    check-cast v1, La/he5;

    .line 819
    .line 820
    move-object/from16 v2, p2

    .line 821
    .line 822
    check-cast v2, La/yje;

    .line 823
    .line 824
    check-cast v0, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;

    .line 825
    .line 826
    sget v2, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;->d:I

    .line 827
    .line 828
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 829
    .line 830
    .line 831
    iget-object v2, v0, Lorg/xplatform/background_video/impl/presentation/BackgroundVideoService;->c:La/n0o0;

    .line 832
    .line 833
    sget-object v3, La/ee5;->a:La/ee5;

    .line 834
    .line 835
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 836
    .line 837
    .line 838
    move-result v3

    .line 839
    if-nez v3, :cond_16

    .line 840
    .line 841
    sget-object v3, La/fe5;->a:La/fe5;

    .line 842
    .line 843
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 844
    .line 845
    .line 846
    move-result v3

    .line 847
    if-eqz v3, :cond_12

    .line 848
    .line 849
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 850
    .line 851
    .line 852
    goto/16 :goto_a

    .line 853
    .line 854
    :cond_12
    sget-object v3, La/ge5;->a:La/ge5;

    .line 855
    .line 856
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 857
    .line 858
    .line 859
    move-result v3

    .line 860
    if-eqz v3, :cond_13

    .line 861
    .line 862
    invoke-virtual {v0}, Landroid/app/Service;->stopSelf()V

    .line 863
    .line 864
    .line 865
    goto/16 :goto_a

    .line 866
    .line 867
    :cond_13
    instance-of v3, v1, La/ce5;

    .line 868
    .line 869
    if-eqz v3, :cond_14

    .line 870
    .line 871
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 872
    .line 873
    .line 874
    move-result-object v2

    .line 875
    move-object v4, v2

    .line 876
    check-cast v4, La/ze5;

    .line 877
    .line 878
    check-cast v1, La/ce5;

    .line 879
    .line 880
    iget-object v7, v1, La/ce5;->a:Ljava/lang/String;

    .line 881
    .line 882
    invoke-static {v0}, La/sj3;->Z(Landroid/content/Context;)J

    .line 883
    .line 884
    .line 885
    move-result-wide v5

    .line 886
    iget-object v8, v1, La/ce5;->b:Ljava/lang/String;

    .line 887
    .line 888
    iget-object v9, v1, La/ce5;->c:La/rwn;

    .line 889
    .line 890
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 891
    .line 892
    .line 893
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 894
    .line 895
    .line 896
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    sget-object v11, La/re5;->a:La/re5;

    .line 907
    .line 908
    iget-object v1, v4, La/ze5;->j:La/mne;

    .line 909
    .line 910
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 911
    .line 912
    new-instance v14, La/se5;

    .line 913
    .line 914
    const/4 v10, 0x0

    .line 915
    move-object v3, v14

    .line 916
    invoke-direct/range {v3 .. v10}, La/se5;-><init>(La/ze5;JLjava/lang/String;Ljava/lang/String;La/rwn;La/yje;)V

    .line 917
    .line 918
    .line 919
    const/16 v15, 0xa

    .line 920
    .line 921
    const/4 v12, 0x0

    .line 922
    move-object v10, v0

    .line 923
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 924
    .line 925
    .line 926
    goto :goto_a

    .line 927
    :cond_14
    instance-of v3, v1, La/de5;

    .line 928
    .line 929
    if-eqz v3, :cond_15

    .line 930
    .line 931
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 932
    .line 933
    .line 934
    move-result-object v2

    .line 935
    move-object v4, v2

    .line 936
    check-cast v4, La/ze5;

    .line 937
    .line 938
    check-cast v1, La/de5;

    .line 939
    .line 940
    iget-object v5, v1, La/de5;->a:Ljava/lang/String;

    .line 941
    .line 942
    invoke-static {v0}, La/sj3;->Z(Landroid/content/Context;)J

    .line 943
    .line 944
    .line 945
    move-result-wide v6

    .line 946
    iget-object v8, v1, La/de5;->b:Ljava/lang/String;

    .line 947
    .line 948
    iget-object v9, v1, La/de5;->c:La/xwn;

    .line 949
    .line 950
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 951
    .line 952
    .line 953
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 954
    .line 955
    .line 956
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 957
    .line 958
    .line 959
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 960
    .line 961
    .line 962
    invoke-static {v4}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 963
    .line 964
    .line 965
    move-result-object v0

    .line 966
    sget-object v11, La/te5;->a:La/te5;

    .line 967
    .line 968
    iget-object v1, v4, La/ze5;->j:La/mne;

    .line 969
    .line 970
    iget-object v13, v1, La/mne;->a:La/rwj;

    .line 971
    .line 972
    new-instance v14, La/se5;

    .line 973
    .line 974
    const/4 v10, 0x0

    .line 975
    move-object v3, v14

    .line 976
    invoke-direct/range {v3 .. v10}, La/se5;-><init>(La/ze5;Ljava/lang/String;JLjava/lang/String;La/xwn;La/yje;)V

    .line 977
    .line 978
    .line 979
    const/16 v15, 0xa

    .line 980
    .line 981
    const/4 v12, 0x0

    .line 982
    move-object v10, v0

    .line 983
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 984
    .line 985
    .line 986
    goto :goto_a

    .line 987
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 988
    .line 989
    .line 990
    goto :goto_b

    .line 991
    :cond_16
    :goto_a
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 992
    .line 993
    :goto_b
    return-object v10

    .line 994
    :pswitch_12
    move-object/from16 v1, p1

    .line 995
    .line 996
    check-cast v1, La/cm80;

    .line 997
    .line 998
    move-object/from16 v2, p2

    .line 999
    .line 1000
    check-cast v2, La/yje;

    .line 1001
    .line 1002
    check-cast v0, La/g85;

    .line 1003
    .line 1004
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1005
    .line 1006
    .line 1007
    instance-of v2, v1, La/zl80;

    .line 1008
    .line 1009
    if-eqz v2, :cond_17

    .line 1010
    .line 1011
    move-object v2, v1

    .line 1012
    check-cast v2, La/zl80;

    .line 1013
    .line 1014
    iget-boolean v2, v2, La/zl80;->b:Z

    .line 1015
    .line 1016
    if-eqz v2, :cond_17

    .line 1017
    .line 1018
    move v2, v8

    .line 1019
    goto :goto_c

    .line 1020
    :cond_17
    move v2, v9

    .line 1021
    :goto_c
    instance-of v3, v1, La/wl80;

    .line 1022
    .line 1023
    if-nez v3, :cond_19

    .line 1024
    .line 1025
    instance-of v3, v1, La/tl80;

    .line 1026
    .line 1027
    if-eqz v3, :cond_18

    .line 1028
    .line 1029
    goto :goto_d

    .line 1030
    :cond_18
    move v8, v9

    .line 1031
    :cond_19
    :goto_d
    new-instance v3, La/b85;

    .line 1032
    .line 1033
    invoke-direct {v3, v1, v8, v9}, La/b85;-><init>(La/cm80;ZB)V

    .line 1034
    .line 1035
    .line 1036
    invoke-virtual {v0, v3}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 1037
    .line 1038
    .line 1039
    if-eqz v2, :cond_1a

    .line 1040
    .line 1041
    sget-object v1, La/o75;->a:La/o75;

    .line 1042
    .line 1043
    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 1044
    .line 1045
    .line 1046
    :cond_1a
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1047
    .line 1048
    return-object v0

    .line 1049
    :pswitch_13
    move-object/from16 v1, p1

    .line 1050
    .line 1051
    check-cast v1, Ljava/lang/Throwable;

    .line 1052
    .line 1053
    move-object/from16 v2, p2

    .line 1054
    .line 1055
    check-cast v2, La/yje;

    .line 1056
    .line 1057
    check-cast v0, La/fy4;

    .line 1058
    .line 1059
    invoke-virtual {v0, v1}, La/fy4;->z(Ljava/lang/Throwable;)V

    .line 1060
    .line 1061
    .line 1062
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1063
    .line 1064
    return-object v0

    .line 1065
    :pswitch_14
    move-object/from16 v1, p1

    .line 1066
    .line 1067
    check-cast v1, La/uaq0;

    .line 1068
    .line 1069
    move-object/from16 v2, p2

    .line 1070
    .line 1071
    check-cast v2, La/yje;

    .line 1072
    .line 1073
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 1074
    .line 1075
    sget-object v2, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 1076
    .line 1077
    invoke-virtual {v0, v1}, Lorg/platform/app/ApplicationLoader;->b(La/uaq0;)V

    .line 1078
    .line 1079
    .line 1080
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1081
    .line 1082
    return-object v0

    .line 1083
    :pswitch_15
    move-object/from16 v1, p1

    .line 1084
    .line 1085
    check-cast v1, La/uaq0;

    .line 1086
    .line 1087
    move-object/from16 v2, p2

    .line 1088
    .line 1089
    check-cast v2, La/yje;

    .line 1090
    .line 1091
    check-cast v0, Lorg/platform/app/ApplicationLoader;

    .line 1092
    .line 1093
    sget-object v2, Lorg/platform/app/ApplicationLoader;->v1:Lorg/platform/app/ApplicationLoader;

    .line 1094
    .line 1095
    invoke-virtual {v0, v1}, Lorg/platform/app/ApplicationLoader;->b(La/uaq0;)V

    .line 1096
    .line 1097
    .line 1098
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1099
    .line 1100
    return-object v0

    .line 1101
    :pswitch_16
    move-object/from16 v1, p1

    .line 1102
    .line 1103
    check-cast v1, La/ljj;

    .line 1104
    .line 1105
    move-object/from16 v2, p2

    .line 1106
    .line 1107
    check-cast v2, La/yje;

    .line 1108
    .line 1109
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1110
    .line 1111
    sget v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 1112
    .line 1113
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    iget-object v2, v2, La/sn;->c:Landroid/widget/FrameLayout;

    .line 1118
    .line 1119
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1120
    .line 1121
    .line 1122
    sget-object v7, La/ljj;->a:La/ljj;

    .line 1123
    .line 1124
    const-string v9, "DEBUG_CONSOLE_VIEW_TAG"

    .line 1125
    .line 1126
    if-ne v1, v7, :cond_1b

    .line 1127
    .line 1128
    invoke-virtual {v2, v9}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 1129
    .line 1130
    .line 1131
    move-result-object v0

    .line 1132
    if-eqz v0, :cond_1c

    .line 1133
    .line 1134
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1135
    .line 1136
    .line 1137
    goto :goto_e

    .line 1138
    :cond_1b
    new-instance v1, Landroidx/compose/ui/platform/ComposeView;

    .line 1139
    .line 1140
    invoke-direct {v1, v0, v10, v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v1, v9}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1144
    .line 1145
    .line 1146
    new-instance v5, La/o33;

    .line 1147
    .line 1148
    invoke-direct {v5, v6}, La/o33;-><init>(B)V

    .line 1149
    .line 1150
    .line 1151
    new-instance v6, La/lr3;

    .line 1152
    .line 1153
    invoke-direct {v6, v0, v4}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 1154
    .line 1155
    .line 1156
    new-instance v0, La/ugd;

    .line 1157
    .line 1158
    const v4, -0x3b6c0a67

    .line 1159
    .line 1160
    .line 1161
    invoke-direct {v0, v4, v8, v6}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1162
    .line 1163
    .line 1164
    invoke-static {v1, v5, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1165
    .line 1166
    .line 1167
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 1168
    .line 1169
    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1170
    .line 1171
    .line 1172
    invoke-virtual {v2, v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1173
    .line 1174
    .line 1175
    :cond_1c
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1176
    .line 1177
    return-object v0

    .line 1178
    :pswitch_17
    move-object/from16 v1, p1

    .line 1179
    .line 1180
    check-cast v1, Ljava/lang/Boolean;

    .line 1181
    .line 1182
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1183
    .line 1184
    .line 1185
    move-result v1

    .line 1186
    move-object/from16 v4, p2

    .line 1187
    .line 1188
    check-cast v4, La/yje;

    .line 1189
    .line 1190
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1191
    .line 1192
    sget v4, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 1193
    .line 1194
    if-nez v1, :cond_1d

    .line 1195
    .line 1196
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1197
    .line 1198
    .line 1199
    goto :goto_f

    .line 1200
    :cond_1d
    invoke-virtual {v0}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C()La/sn;

    .line 1201
    .line 1202
    .line 1203
    move-result-object v1

    .line 1204
    iget-object v1, v1, La/sn;->c:Landroid/widget/FrameLayout;

    .line 1205
    .line 1206
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1207
    .line 1208
    .line 1209
    const-string v4, "INTERNET_EMULATION_BUTTON_TAG"

    .line 1210
    .line 1211
    invoke-virtual {v1, v4}, Landroid/view/View;->findViewWithTag(Ljava/lang/Object;)Landroid/view/View;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v7

    .line 1215
    if-eqz v7, :cond_1e

    .line 1216
    .line 1217
    goto :goto_f

    .line 1218
    :cond_1e
    new-instance v7, Landroidx/compose/ui/platform/ComposeView;

    .line 1219
    .line 1220
    invoke-direct {v7, v0, v10, v5}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 1221
    .line 1222
    .line 1223
    invoke-virtual {v7, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1224
    .line 1225
    .line 1226
    new-instance v4, La/o33;

    .line 1227
    .line 1228
    invoke-direct {v4, v2}, La/o33;-><init>(B)V

    .line 1229
    .line 1230
    .line 1231
    new-instance v2, La/lr3;

    .line 1232
    .line 1233
    invoke-direct {v2, v0, v6}, La/lr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 1234
    .line 1235
    .line 1236
    new-instance v0, La/ugd;

    .line 1237
    .line 1238
    const v5, -0x460d94aa

    .line 1239
    .line 1240
    .line 1241
    invoke-direct {v0, v5, v8, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1242
    .line 1243
    .line 1244
    invoke-static {v7, v4, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1245
    .line 1246
    .line 1247
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    .line 1248
    .line 1249
    invoke-direct {v0, v3, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 1250
    .line 1251
    .line 1252
    invoke-virtual {v1, v7, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1253
    .line 1254
    .line 1255
    :goto_f
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1256
    .line 1257
    return-object v0

    .line 1258
    :pswitch_18
    move-object/from16 v1, p1

    .line 1259
    .line 1260
    check-cast v1, Ljava/lang/Boolean;

    .line 1261
    .line 1262
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1263
    .line 1264
    .line 1265
    move-result v1

    .line 1266
    move-object/from16 v2, p2

    .line 1267
    .line 1268
    check-cast v2, La/yje;

    .line 1269
    .line 1270
    check-cast v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1271
    .line 1272
    sget v2, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 1273
    .line 1274
    invoke-virtual {v0, v1}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 1275
    .line 1276
    .line 1277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1278
    .line 1279
    return-object v0

    .line 1280
    :pswitch_19
    move-object/from16 v1, p1

    .line 1281
    .line 1282
    check-cast v1, La/vt3;

    .line 1283
    .line 1284
    move-object/from16 v3, p2

    .line 1285
    .line 1286
    check-cast v3, La/yje;

    .line 1287
    .line 1288
    move-object v13, v0

    .line 1289
    check-cast v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;

    .line 1290
    .line 1291
    sget v0, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F1:I

    .line 1292
    .line 1293
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1294
    .line 1295
    .line 1296
    sget-object v19, La/rv00;->B:La/rv00;

    .line 1297
    .line 1298
    sget-object v18, La/lwf;->Y:La/lwf;

    .line 1299
    .line 1300
    sget-object v15, La/pek0;->a:La/pek0;

    .line 1301
    .line 1302
    if-eqz v1, :cond_4f

    .line 1303
    .line 1304
    instance-of v0, v1, La/ft3;

    .line 1305
    .line 1306
    if-eqz v0, :cond_1f

    .line 1307
    .line 1308
    invoke-virtual {v13}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v0

    .line 1312
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v0

    .line 1316
    new-instance v1, La/w1;

    .line 1317
    .line 1318
    const/16 v2, 0x9

    .line 1319
    .line 1320
    invoke-direct {v1, v13, v2}, La/w1;-><init>(Ljava/lang/Object;B)V

    .line 1321
    .line 1322
    .line 1323
    const-wide/16 v2, 0x1388

    .line 1324
    .line 1325
    invoke-virtual {v0, v1, v2, v3}, Landroid/view/View;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1326
    .line 1327
    .line 1328
    goto/16 :goto_12

    .line 1329
    .line 1330
    :cond_1f
    instance-of v0, v1, La/ot3;

    .line 1331
    .line 1332
    if-eqz v0, :cond_20

    .line 1333
    .line 1334
    check-cast v1, La/ot3;

    .line 1335
    .line 1336
    iget-object v0, v1, La/ot3;->a:Ljava/lang/String;

    .line 1337
    .line 1338
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 1339
    .line 1340
    .line 1341
    move-result-object v1

    .line 1342
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1343
    .line 1344
    .line 1345
    move-result-object v1

    .line 1346
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1347
    .line 1348
    .line 1349
    move-object v11, v1

    .line 1350
    check-cast v11, La/wdk0;

    .line 1351
    .line 1352
    new-instance v20, La/xdk0;

    .line 1353
    .line 1354
    new-instance v1, La/hdk0;

    .line 1355
    .line 1356
    invoke-virtual {v13}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 1357
    .line 1358
    .line 1359
    move-result-object v2

    .line 1360
    const v3, 0x7f1304ff

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 1364
    .line 1365
    .line 1366
    move-result-object v2

    .line 1367
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1368
    .line 1369
    .line 1370
    new-instance v3, La/mc;

    .line 1371
    .line 1372
    const/16 v4, 0x1b

    .line 1373
    .line 1374
    invoke-direct {v3, v13, v0, v4}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1375
    .line 1376
    .line 1377
    invoke-direct {v1, v2, v3}, La/hdk0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1378
    .line 1379
    .line 1380
    const/16 v26, 0x0

    .line 1381
    .line 1382
    const/16 v27, 0x74

    .line 1383
    .line 1384
    const/16 v23, 0x0

    .line 1385
    .line 1386
    const/16 v25, 0x0

    .line 1387
    .line 1388
    move-object/from16 v22, v0

    .line 1389
    .line 1390
    move-object/from16 v24, v1

    .line 1391
    .line 1392
    move-object/from16 v21, v15

    .line 1393
    .line 1394
    invoke-direct/range {v20 .. v27}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1395
    .line 1396
    .line 1397
    const/16 v18, 0x0

    .line 1398
    .line 1399
    const/16 v19, 0x7c

    .line 1400
    .line 1401
    const/4 v14, 0x0

    .line 1402
    const/4 v15, 0x0

    .line 1403
    const/16 v16, 0x0

    .line 1404
    .line 1405
    const/16 v17, 0x0

    .line 1406
    .line 1407
    move-object/from16 v12, v20

    .line 1408
    .line 1409
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 1410
    .line 1411
    .line 1412
    goto/16 :goto_12

    .line 1413
    .line 1414
    :cond_20
    instance-of v0, v1, La/at3;

    .line 1415
    .line 1416
    if-eqz v0, :cond_23

    .line 1417
    .line 1418
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 1419
    .line 1420
    .line 1421
    move-result-object v0

    .line 1422
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1423
    .line 1424
    .line 1425
    move-result-object v0

    .line 1426
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    move-object v11, v0

    .line 1430
    check-cast v11, La/wdk0;

    .line 1431
    .line 1432
    check-cast v1, La/at3;

    .line 1433
    .line 1434
    iget-object v0, v1, La/at3;->a:Ljava/lang/String;

    .line 1435
    .line 1436
    const-string v1, "clipboard"

    .line 1437
    .line 1438
    invoke-virtual {v13, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v1

    .line 1442
    instance-of v2, v1, Landroid/content/ClipboardManager;

    .line 1443
    .line 1444
    if-eqz v2, :cond_21

    .line 1445
    .line 1446
    move-object v10, v1

    .line 1447
    check-cast v10, Landroid/content/ClipboardManager;

    .line 1448
    .line 1449
    :cond_21
    const-string v1, "DEBUG_CONSOLE_LOGS"

    .line 1450
    .line 1451
    invoke-static {v1, v0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 1452
    .line 1453
    .line 1454
    move-result-object v0

    .line 1455
    if-eqz v10, :cond_22

    .line 1456
    .line 1457
    invoke-virtual {v10, v0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 1458
    .line 1459
    .line 1460
    :cond_22
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1461
    .line 1462
    const/16 v1, 0x20

    .line 1463
    .line 1464
    if-gt v0, v1, :cond_4e

    .line 1465
    .line 1466
    new-instance v20, La/xdk0;

    .line 1467
    .line 1468
    const/16 v25, 0x0

    .line 1469
    .line 1470
    const/16 v27, 0x58

    .line 1471
    .line 1472
    const-string v22, "Logs Copied"

    .line 1473
    .line 1474
    const-string v23, ""

    .line 1475
    .line 1476
    const/16 v24, 0x0

    .line 1477
    .line 1478
    const/16 v26, 0x0

    .line 1479
    .line 1480
    move-object/from16 v21, v15

    .line 1481
    .line 1482
    invoke-direct/range {v20 .. v27}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1483
    .line 1484
    .line 1485
    const/16 v18, 0x0

    .line 1486
    .line 1487
    const/16 v19, 0x78

    .line 1488
    .line 1489
    const/4 v14, 0x0

    .line 1490
    const/4 v15, 0x0

    .line 1491
    const/16 v16, 0x0

    .line 1492
    .line 1493
    const/16 v17, 0x0

    .line 1494
    .line 1495
    move-object/from16 v12, v20

    .line 1496
    .line 1497
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 1498
    .line 1499
    .line 1500
    goto/16 :goto_12

    .line 1501
    .line 1502
    :cond_23
    instance-of v0, v1, La/zs3;

    .line 1503
    .line 1504
    if-eqz v0, :cond_24

    .line 1505
    .line 1506
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1507
    .line 1508
    .line 1509
    move-result-object v0

    .line 1510
    invoke-static {v0}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 1511
    .line 1512
    .line 1513
    move-result v0

    .line 1514
    if-eqz v0, :cond_4e

    .line 1515
    .line 1516
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 1517
    .line 1518
    .line 1519
    move-result-object v0

    .line 1520
    iget-object v1, v0, La/zu3;->c:La/i1w0;

    .line 1521
    .line 1522
    new-instance v2, La/vs3;

    .line 1523
    .line 1524
    invoke-direct {v2, v0, v9}, La/vs3;-><init>(La/zu3;B)V

    .line 1525
    .line 1526
    .line 1527
    invoke-virtual {v1, v2}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 1528
    .line 1529
    .line 1530
    goto/16 :goto_12

    .line 1531
    .line 1532
    :cond_24
    instance-of v0, v1, La/it3;

    .line 1533
    .line 1534
    const-string v3, "lockDialogFactory"

    .line 1535
    .line 1536
    if-eqz v0, :cond_26

    .line 1537
    .line 1538
    check-cast v1, La/it3;

    .line 1539
    .line 1540
    iget-boolean v0, v1, La/it3;->a:Z

    .line 1541
    .line 1542
    iget-boolean v1, v1, La/it3;->b:Z

    .line 1543
    .line 1544
    iget-object v2, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->n1:La/z7z;

    .line 1545
    .line 1546
    if-eqz v2, :cond_25

    .line 1547
    .line 1548
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 1549
    .line 1550
    .line 1551
    move-result-object v2

    .line 1552
    check-cast v2, La/fu00;

    .line 1553
    .line 1554
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1555
    .line 1556
    .line 1557
    move-result-object v3

    .line 1558
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1559
    .line 1560
    .line 1561
    sget-object v2, La/ayn;->c2:La/sek;

    .line 1562
    .line 1563
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1564
    .line 1565
    .line 1566
    const-string v2, "EndSessionDialog"

    .line 1567
    .line 1568
    invoke-virtual {v3, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1569
    .line 1570
    .line 1571
    move-result-object v4

    .line 1572
    if-nez v4, :cond_4e

    .line 1573
    .line 1574
    new-instance v4, La/ayn;

    .line 1575
    .line 1576
    invoke-direct {v4}, La/ayn;-><init>()V

    .line 1577
    .line 1578
    .line 1579
    sget-object v5, La/ayn;->d2:[La/iiy;

    .line 1580
    .line 1581
    aget-object v6, v5, v9

    .line 1582
    .line 1583
    iget-object v7, v4, La/ayn;->Z1:La/cgx0;

    .line 1584
    .line 1585
    invoke-virtual {v7, v4, v6, v0}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 1586
    .line 1587
    .line 1588
    iget-object v0, v4, La/ayn;->a2:La/cgx0;

    .line 1589
    .line 1590
    aget-object v5, v5, v8

    .line 1591
    .line 1592
    invoke-virtual {v0, v4, v5, v1}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v4, v3, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1596
    .line 1597
    .line 1598
    goto/16 :goto_12

    .line 1599
    .line 1600
    :cond_25
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1601
    .line 1602
    .line 1603
    throw v10

    .line 1604
    :cond_26
    instance-of v0, v1, La/pt3;

    .line 1605
    .line 1606
    if-eqz v0, :cond_28

    .line 1607
    .line 1608
    check-cast v1, La/pt3;

    .line 1609
    .line 1610
    iget-object v0, v1, La/pt3;->a:Ljava/lang/String;

    .line 1611
    .line 1612
    iget-object v1, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->n1:La/z7z;

    .line 1613
    .line 1614
    if-eqz v1, :cond_27

    .line 1615
    .line 1616
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1617
    .line 1618
    .line 1619
    move-result-object v1

    .line 1620
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1621
    .line 1622
    .line 1623
    check-cast v1, La/fu00;

    .line 1624
    .line 1625
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v1

    .line 1629
    sget-object v2, La/diq0;->b2:La/g9m0;

    .line 1630
    .line 1631
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1632
    .line 1633
    .line 1634
    const-string v2, "TimeIsEndDialog"

    .line 1635
    .line 1636
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1637
    .line 1638
    .line 1639
    move-result-object v3

    .line 1640
    if-nez v3, :cond_4e

    .line 1641
    .line 1642
    new-instance v3, La/diq0;

    .line 1643
    .line 1644
    invoke-direct {v3}, La/diq0;-><init>()V

    .line 1645
    .line 1646
    .line 1647
    sget-object v4, La/diq0;->c2:[La/iiy;

    .line 1648
    .line 1649
    aget-object v4, v4, v9

    .line 1650
    .line 1651
    iget-object v5, v3, La/diq0;->Z1:La/phf0;

    .line 1652
    .line 1653
    invoke-virtual {v5, v3, v4, v0}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1654
    .line 1655
    .line 1656
    invoke-virtual {v3, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1657
    .line 1658
    .line 1659
    goto/16 :goto_12

    .line 1660
    .line 1661
    :cond_27
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1662
    .line 1663
    .line 1664
    throw v10

    .line 1665
    :cond_28
    instance-of v0, v1, La/rt3;

    .line 1666
    .line 1667
    const-string v3, "alertsPipeFeature"

    .line 1668
    .line 1669
    if-eqz v0, :cond_2b

    .line 1670
    .line 1671
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->o1:La/z7z;

    .line 1672
    .line 1673
    if-eqz v0, :cond_2a

    .line 1674
    .line 1675
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1676
    .line 1677
    .line 1678
    move-result-object v0

    .line 1679
    check-cast v0, La/p12;

    .line 1680
    .line 1681
    invoke-virtual {v0}, La/p12;->a()La/r12;

    .line 1682
    .line 1683
    .line 1684
    move-result-object v0

    .line 1685
    new-instance v1, La/q12;

    .line 1686
    .line 1687
    new-instance v2, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;

    .line 1688
    .line 1689
    invoke-direct {v2, v9}, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$UserAgreementDocumentsDialog;-><init>(Z)V

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v3

    .line 1696
    iget-object v4, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->p1:La/z7z;

    .line 1697
    .line 1698
    if-eqz v4, :cond_29

    .line 1699
    .line 1700
    invoke-interface {v4}, La/z7z;->get()Ljava/lang/Object;

    .line 1701
    .line 1702
    .line 1703
    move-result-object v4

    .line 1704
    check-cast v4, La/lqt0;

    .line 1705
    .line 1706
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1707
    .line 1708
    .line 1709
    const-string v4, "USER_AGREEMENT_DIALOG_REQUEST_KEY"

    .line 1710
    .line 1711
    invoke-direct {v1, v2, v3, v4}, La/q12;-><init>(Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1712
    .line 1713
    .line 1714
    check-cast v0, La/s12;

    .line 1715
    .line 1716
    invoke-virtual {v0, v1}, La/s12;->a(La/q12;)V

    .line 1717
    .line 1718
    .line 1719
    goto/16 :goto_12

    .line 1720
    .line 1721
    :cond_29
    const-string v0, "userAgreementDocumentsDialogProvider"

    .line 1722
    .line 1723
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1724
    .line 1725
    .line 1726
    throw v10

    .line 1727
    :cond_2a
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1728
    .line 1729
    .line 1730
    throw v10

    .line 1731
    :cond_2b
    instance-of v0, v1, La/mt3;

    .line 1732
    .line 1733
    if-eqz v0, :cond_2d

    .line 1734
    .line 1735
    check-cast v1, La/mt3;

    .line 1736
    .line 1737
    iget-object v0, v1, La/mt3;->a:Ljava/lang/String;

    .line 1738
    .line 1739
    iget-object v1, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->o1:La/z7z;

    .line 1740
    .line 1741
    if-eqz v1, :cond_2c

    .line 1742
    .line 1743
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v1

    .line 1747
    check-cast v1, La/p12;

    .line 1748
    .line 1749
    invoke-virtual {v1}, La/p12;->a()La/r12;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v1

    .line 1753
    new-instance v2, La/q12;

    .line 1754
    .line 1755
    new-instance v3, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;

    .line 1756
    .line 1757
    invoke-direct {v3, v0}, Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType$NotIdentifiedKzAlert;-><init>(Ljava/lang/String;)V

    .line 1758
    .line 1759
    .line 1760
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1761
    .line 1762
    .line 1763
    move-result-object v0

    .line 1764
    const-string v4, ""

    .line 1765
    .line 1766
    invoke-direct {v2, v3, v0, v4}, La/q12;-><init>(Lorg/xplatform/alerts_pipe_api/presentation/AlertsPipeType;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1767
    .line 1768
    .line 1769
    check-cast v1, La/s12;

    .line 1770
    .line 1771
    invoke-virtual {v1, v2}, La/s12;->a(La/q12;)V

    .line 1772
    .line 1773
    .line 1774
    goto/16 :goto_12

    .line 1775
    .line 1776
    :cond_2c
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1777
    .line 1778
    .line 1779
    throw v10

    .line 1780
    :cond_2d
    instance-of v0, v1, La/qt3;

    .line 1781
    .line 1782
    const-string v3, "actionDialogManager"

    .line 1783
    .line 1784
    if-eqz v0, :cond_2f

    .line 1785
    .line 1786
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->q1:La/z7z;

    .line 1787
    .line 1788
    if-eqz v0, :cond_2e

    .line 1789
    .line 1790
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v0

    .line 1794
    check-cast v0, La/ii;

    .line 1795
    .line 1796
    new-instance v1, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1797
    .line 1798
    const v2, 0x7f1307bb

    .line 1799
    .line 1800
    .line 1801
    invoke-virtual {v13, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1802
    .line 1803
    .line 1804
    move-result-object v2

    .line 1805
    const v3, 0x7f1307d0

    .line 1806
    .line 1807
    .line 1808
    invoke-virtual {v13, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1809
    .line 1810
    .line 1811
    move-result-object v3

    .line 1812
    const v4, 0x7f130e5d

    .line 1813
    .line 1814
    .line 1815
    invoke-virtual {v13, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 1816
    .line 1817
    .line 1818
    move-result-object v4

    .line 1819
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1820
    .line 1821
    .line 1822
    sget-object v10, La/n12;->b:La/n12;

    .line 1823
    .line 1824
    const/4 v11, 0x0

    .line 1825
    const/16 v12, 0x5f8

    .line 1826
    .line 1827
    const/4 v5, 0x0

    .line 1828
    const/4 v6, 0x0

    .line 1829
    const/4 v7, 0x0

    .line 1830
    const/4 v8, 0x0

    .line 1831
    const/4 v9, 0x0

    .line 1832
    invoke-direct/range {v1 .. v12}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1833
    .line 1834
    .line 1835
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1836
    .line 1837
    .line 1838
    move-result-object v2

    .line 1839
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1840
    .line 1841
    .line 1842
    goto/16 :goto_12

    .line 1843
    .line 1844
    :cond_2e
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1845
    .line 1846
    .line 1847
    throw v10

    .line 1848
    :cond_2f
    instance-of v0, v1, La/gt3;

    .line 1849
    .line 1850
    if-eqz v0, :cond_32

    .line 1851
    .line 1852
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->q1:La/z7z;

    .line 1853
    .line 1854
    if-eqz v0, :cond_31

    .line 1855
    .line 1856
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v0

    .line 1860
    check-cast v0, La/ii;

    .line 1861
    .line 1862
    iget-object v1, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->r1:La/z7z;

    .line 1863
    .line 1864
    if-eqz v1, :cond_30

    .line 1865
    .line 1866
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v1

    .line 1870
    check-cast v1, La/ux00;

    .line 1871
    .line 1872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1873
    .line 1874
    .line 1875
    invoke-static {}, La/ux00;->a()La/tx00;

    .line 1876
    .line 1877
    .line 1878
    move-result-object v1

    .line 1879
    invoke-virtual {v13}, La/kxq;->r()La/v1r;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v2

    .line 1883
    invoke-virtual {v0, v1, v2}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    .line 1884
    .line 1885
    .line 1886
    goto/16 :goto_12

    .line 1887
    .line 1888
    :cond_30
    const-string v0, "logoutDialogFactory"

    .line 1889
    .line 1890
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1891
    .line 1892
    .line 1893
    throw v10

    .line 1894
    :cond_31
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1895
    .line 1896
    .line 1897
    throw v10

    .line 1898
    :cond_32
    instance-of v0, v1, La/ht3;

    .line 1899
    .line 1900
    if-eqz v0, :cond_36

    .line 1901
    .line 1902
    invoke-virtual {v13}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1903
    .line 1904
    .line 1905
    move-result-object v0

    .line 1906
    invoke-virtual {v13}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 1907
    .line 1908
    .line 1909
    move-result-object v1

    .line 1910
    const-string v2, "android.software.leanback"

    .line 1911
    .line 1912
    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 1913
    .line 1914
    .line 1915
    move-result v2

    .line 1916
    if-eqz v2, :cond_33

    .line 1917
    .line 1918
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLeanbackLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1919
    .line 1920
    .line 1921
    move-result-object v2

    .line 1922
    goto :goto_10

    .line 1923
    :cond_33
    move-object v2, v10

    .line 1924
    :goto_10
    if-nez v2, :cond_34

    .line 1925
    .line 1926
    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 1927
    .line 1928
    .line 1929
    move-result-object v2

    .line 1930
    :cond_34
    if-eqz v2, :cond_35

    .line 1931
    .line 1932
    filled-new-array {v2}, [Landroid/content/Intent;

    .line 1933
    .line 1934
    .line 1935
    move-result-object v0

    .line 1936
    aget-object v1, v0, v9

    .line 1937
    .line 1938
    const v2, 0x10008000

    .line 1939
    .line 1940
    .line 1941
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1942
    .line 1943
    .line 1944
    new-instance v1, Landroid/content/Intent;

    .line 1945
    .line 1946
    const-class v2, Lcom/jakewharton/processphoenix/PhoenixActivity;

    .line 1947
    .line 1948
    invoke-direct {v1, v13, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 1949
    .line 1950
    .line 1951
    const/high16 v2, 0x10000000

    .line 1952
    .line 1953
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1954
    .line 1955
    .line 1956
    new-instance v2, Ljava/util/ArrayList;

    .line 1957
    .line 1958
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1959
    .line 1960
    .line 1961
    move-result-object v0

    .line 1962
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 1963
    .line 1964
    .line 1965
    const-string v0, "phoenix_restart_intents"

    .line 1966
    .line 1967
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    .line 1968
    .line 1969
    .line 1970
    const-string v0, "phoenix_main_process_pid"

    .line 1971
    .line 1972
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 1973
    .line 1974
    .line 1975
    move-result v2

    .line 1976
    invoke-virtual {v1, v0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1977
    .line 1978
    .line 1979
    invoke-virtual {v13, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1980
    .line 1981
    .line 1982
    goto/16 :goto_12

    .line 1983
    .line 1984
    :cond_35
    const-string v1, "Unable to determine default activity for "

    .line 1985
    .line 1986
    const-string v2, ". Does an activity specify the DEFAULT category in its intent filter?"

    .line 1987
    .line 1988
    invoke-static {v1, v0, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v0

    .line 1992
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 1993
    .line 1994
    .line 1995
    goto/16 :goto_13

    .line 1996
    .line 1997
    :cond_36
    instance-of v0, v1, La/jt3;

    .line 1998
    .line 1999
    if-eqz v0, :cond_38

    .line 2000
    .line 2001
    check-cast v1, La/jt3;

    .line 2002
    .line 2003
    iget-object v0, v1, La/jt3;->a:Ljava/lang/String;

    .line 2004
    .line 2005
    iget-object v1, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 2006
    .line 2007
    if-eqz v1, :cond_37

    .line 2008
    .line 2009
    invoke-interface {v1}, La/ndk0;->c()La/rrm;

    .line 2010
    .line 2011
    .line 2012
    move-result-object v1

    .line 2013
    invoke-virtual {v1}, La/g46;->b()Z

    .line 2014
    .line 2015
    .line 2016
    move-result v1

    .line 2017
    if-ne v1, v8, :cond_37

    .line 2018
    .line 2019
    goto/16 :goto_12

    .line 2020
    .line 2021
    :cond_37
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 2022
    .line 2023
    .line 2024
    move-result-object v1

    .line 2025
    invoke-interface {v1}, La/z7z;->get()Ljava/lang/Object;

    .line 2026
    .line 2027
    .line 2028
    move-result-object v1

    .line 2029
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2030
    .line 2031
    .line 2032
    move-object v11, v1

    .line 2033
    check-cast v11, La/wdk0;

    .line 2034
    .line 2035
    new-instance v14, La/xdk0;

    .line 2036
    .line 2037
    sget-object v15, La/rek0;->b:La/rek0;

    .line 2038
    .line 2039
    const/16 v20, 0x0

    .line 2040
    .line 2041
    const/16 v21, 0x7c

    .line 2042
    .line 2043
    const/16 v17, 0x0

    .line 2044
    .line 2045
    const/16 v18, 0x0

    .line 2046
    .line 2047
    const/16 v19, 0x0

    .line 2048
    .line 2049
    move-object/from16 v16, v0

    .line 2050
    .line 2051
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2052
    .line 2053
    .line 2054
    const/16 v19, 0x7c

    .line 2055
    .line 2056
    move-object v12, v14

    .line 2057
    const/4 v14, 0x0

    .line 2058
    const/4 v15, 0x0

    .line 2059
    const/16 v16, 0x0

    .line 2060
    .line 2061
    const/16 v17, 0x0

    .line 2062
    .line 2063
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 2064
    .line 2065
    .line 2066
    goto/16 :goto_12

    .line 2067
    .line 2068
    :cond_38
    instance-of v0, v1, La/ut3;

    .line 2069
    .line 2070
    if-eqz v0, :cond_39

    .line 2071
    .line 2072
    invoke-virtual {v13, v9}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->I(Z)V

    .line 2073
    .line 2074
    .line 2075
    goto/16 :goto_12

    .line 2076
    .line 2077
    :cond_39
    instance-of v0, v1, La/tt3;

    .line 2078
    .line 2079
    if-eqz v0, :cond_3e

    .line 2080
    .line 2081
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->F()La/zu3;

    .line 2082
    .line 2083
    .line 2084
    move-result-object v0

    .line 2085
    iget-object v1, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2086
    .line 2087
    if-eqz v1, :cond_3a

    .line 2088
    .line 2089
    invoke-interface {v1}, La/ndk0;->a()Z

    .line 2090
    .line 2091
    .line 2092
    move-result v1

    .line 2093
    if-ne v1, v8, :cond_3a

    .line 2094
    .line 2095
    goto :goto_11

    .line 2096
    :cond_3a
    move v8, v9

    .line 2097
    :goto_11
    iget-object v1, v0, La/zu3;->h0:La/ol60;

    .line 2098
    .line 2099
    iget-object v2, v0, La/zu3;->v:La/z7z;

    .line 2100
    .line 2101
    invoke-interface {v2}, La/z7z;->get()Ljava/lang/Object;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v2

    .line 2105
    check-cast v2, La/m1e;

    .line 2106
    .line 2107
    invoke-interface {v2}, La/m1e;->c()Z

    .line 2108
    .line 2109
    .line 2110
    move-result v2

    .line 2111
    if-nez v2, :cond_3b

    .line 2112
    .line 2113
    goto/16 :goto_12

    .line 2114
    .line 2115
    :cond_3b
    iget-object v0, v0, La/zu3;->f:La/z7z;

    .line 2116
    .line 2117
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 2118
    .line 2119
    .line 2120
    move-result-object v0

    .line 2121
    check-cast v0, La/c1d0;

    .line 2122
    .line 2123
    invoke-interface {v0}, La/c1d0;->h()La/ppu;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v0

    .line 2127
    iget-object v0, v0, La/ppu;->a:La/y1d0;

    .line 2128
    .line 2129
    iget-object v0, v0, La/y1d0;->a:La/j1d0;

    .line 2130
    .line 2131
    iget-object v0, v0, La/j1d0;->a:La/p7m0;

    .line 2132
    .line 2133
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2134
    .line 2135
    .line 2136
    move-result-object v0

    .line 2137
    check-cast v0, La/o1d0;

    .line 2138
    .line 2139
    instance-of v2, v0, La/m1d0;

    .line 2140
    .line 2141
    if-nez v2, :cond_3c

    .line 2142
    .line 2143
    goto/16 :goto_12

    .line 2144
    .line 2145
    :cond_3c
    check-cast v0, La/m1d0;

    .line 2146
    .line 2147
    iget-boolean v0, v0, La/m1d0;->d:Z

    .line 2148
    .line 2149
    if-nez v0, :cond_3d

    .line 2150
    .line 2151
    sget-object v0, La/bt3;->a:La/bt3;

    .line 2152
    .line 2153
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2154
    .line 2155
    .line 2156
    goto/16 :goto_12

    .line 2157
    .line 2158
    :cond_3d
    if-nez v8, :cond_4e

    .line 2159
    .line 2160
    sget-object v0, La/kt3;->a:La/kt3;

    .line 2161
    .line 2162
    invoke-virtual {v1, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 2163
    .line 2164
    .line 2165
    goto/16 :goto_12

    .line 2166
    .line 2167
    :cond_3e
    instance-of v0, v1, La/lt3;

    .line 2168
    .line 2169
    if-eqz v0, :cond_3f

    .line 2170
    .line 2171
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A()V

    .line 2172
    .line 2173
    .line 2174
    goto/16 :goto_12

    .line 2175
    .line 2176
    :cond_3f
    instance-of v0, v1, La/ct3;

    .line 2177
    .line 2178
    if-eqz v0, :cond_41

    .line 2179
    .line 2180
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 2181
    .line 2182
    if-eqz v0, :cond_40

    .line 2183
    .line 2184
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 2185
    .line 2186
    .line 2187
    :cond_40
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->A1:La/ndk0;

    .line 2188
    .line 2189
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E1:Ljava/lang/Integer;

    .line 2190
    .line 2191
    goto/16 :goto_12

    .line 2192
    .line 2193
    :cond_41
    instance-of v0, v1, La/kt3;

    .line 2194
    .line 2195
    if-eqz v0, :cond_43

    .line 2196
    .line 2197
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2198
    .line 2199
    if-eqz v0, :cond_42

    .line 2200
    .line 2201
    goto/16 :goto_12

    .line 2202
    .line 2203
    :cond_42
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 2204
    .line 2205
    .line 2206
    move-result-object v0

    .line 2207
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 2208
    .line 2209
    .line 2210
    move-result-object v0

    .line 2211
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2212
    .line 2213
    .line 2214
    move-object v11, v0

    .line 2215
    check-cast v11, La/wdk0;

    .line 2216
    .line 2217
    new-instance v14, La/xdk0;

    .line 2218
    .line 2219
    const v0, 0x7f1314d3

    .line 2220
    .line 2221
    .line 2222
    invoke-virtual {v13, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2223
    .line 2224
    .line 2225
    move-result-object v16

    .line 2226
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2227
    .line 2228
    .line 2229
    const/16 v20, 0x0

    .line 2230
    .line 2231
    const/16 v21, 0x64

    .line 2232
    .line 2233
    const/16 v17, 0x0

    .line 2234
    .line 2235
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2236
    .line 2237
    .line 2238
    new-instance v15, La/kr3;

    .line 2239
    .line 2240
    invoke-direct {v15, v13, v8}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 2241
    .line 2242
    .line 2243
    const/16 v18, 0x0

    .line 2244
    .line 2245
    const/16 v19, 0x54

    .line 2246
    .line 2247
    move-object v12, v14

    .line 2248
    const/4 v14, 0x0

    .line 2249
    const/16 v16, 0x0

    .line 2250
    .line 2251
    const/16 v17, 0x0

    .line 2252
    .line 2253
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 2254
    .line 2255
    .line 2256
    move-result-object v0

    .line 2257
    iput-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2258
    .line 2259
    goto/16 :goto_12

    .line 2260
    .line 2261
    :cond_43
    instance-of v0, v1, La/bt3;

    .line 2262
    .line 2263
    if-eqz v0, :cond_45

    .line 2264
    .line 2265
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2266
    .line 2267
    if-eqz v0, :cond_44

    .line 2268
    .line 2269
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 2270
    .line 2271
    .line 2272
    :cond_44
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2273
    .line 2274
    goto/16 :goto_12

    .line 2275
    .line 2276
    :cond_45
    instance-of v0, v1, La/nt3;

    .line 2277
    .line 2278
    if-eqz v0, :cond_47

    .line 2279
    .line 2280
    check-cast v1, La/nt3;

    .line 2281
    .line 2282
    iget-wide v2, v1, La/nt3;->a:J

    .line 2283
    .line 2284
    iget-wide v0, v1, La/nt3;->b:J

    .line 2285
    .line 2286
    iget-object v4, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 2287
    .line 2288
    if-eqz v4, :cond_46

    .line 2289
    .line 2290
    goto/16 :goto_12

    .line 2291
    .line 2292
    :cond_46
    invoke-static {v13}, Landroid/text/format/DateFormat;->is24HourFormat(Landroid/content/Context;)Z

    .line 2293
    .line 2294
    .line 2295
    move-result v4

    .line 2296
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 2297
    .line 2298
    .line 2299
    move-result-object v6

    .line 2300
    invoke-interface {v6}, La/z7z;->get()Ljava/lang/Object;

    .line 2301
    .line 2302
    .line 2303
    move-result-object v6

    .line 2304
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2305
    .line 2306
    .line 2307
    move-object v11, v6

    .line 2308
    check-cast v11, La/wdk0;

    .line 2309
    .line 2310
    new-instance v14, La/xdk0;

    .line 2311
    .line 2312
    const v6, 0x7f13106e

    .line 2313
    .line 2314
    .line 2315
    invoke-virtual {v13, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2316
    .line 2317
    .line 2318
    move-result-object v16

    .line 2319
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2320
    .line 2321
    .line 2322
    sget-object v6, La/rdj;->a:La/rdj;

    .line 2323
    .line 2324
    sget-object v6, La/efj;->d:La/efj;

    .line 2325
    .line 2326
    new-instance v7, La/znq0;

    .line 2327
    .line 2328
    invoke-direct {v7, v2, v3}, La/znq0;-><init>(J)V

    .line 2329
    .line 2330
    .line 2331
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v2

    .line 2335
    const/16 v3, 0x38

    .line 2336
    .line 2337
    invoke-static {v7, v6, v2, v9, v3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v2

    .line 2341
    new-instance v7, La/znq0;

    .line 2342
    .line 2343
    invoke-direct {v7, v0, v1}, La/znq0;-><init>(J)V

    .line 2344
    .line 2345
    .line 2346
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 2347
    .line 2348
    .line 2349
    move-result-object v0

    .line 2350
    invoke-static {v7, v6, v0, v9, v3}, La/rdj;->g(La/aoq0;La/efj;Ljava/lang/Boolean;ZI)Ljava/lang/String;

    .line 2351
    .line 2352
    .line 2353
    move-result-object v0

    .line 2354
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 2355
    .line 2356
    .line 2357
    move-result-object v0

    .line 2358
    const v1, 0x7f13106d

    .line 2359
    .line 2360
    .line 2361
    invoke-virtual {v13, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v17

    .line 2365
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2366
    .line 2367
    .line 2368
    const/16 v20, 0x0

    .line 2369
    .line 2370
    const/16 v21, 0x60

    .line 2371
    .line 2372
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2373
    .line 2374
    .line 2375
    new-instance v15, La/kr3;

    .line 2376
    .line 2377
    invoke-direct {v15, v13, v5}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 2378
    .line 2379
    .line 2380
    const/16 v18, 0x0

    .line 2381
    .line 2382
    const/16 v19, 0x74

    .line 2383
    .line 2384
    move-object v12, v14

    .line 2385
    const/4 v14, 0x0

    .line 2386
    const/16 v16, 0x0

    .line 2387
    .line 2388
    const/16 v17, 0x0

    .line 2389
    .line 2390
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 2391
    .line 2392
    .line 2393
    move-result-object v0

    .line 2394
    iput-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 2395
    .line 2396
    goto/16 :goto_12

    .line 2397
    .line 2398
    :cond_47
    instance-of v0, v1, La/dt3;

    .line 2399
    .line 2400
    if-eqz v0, :cond_4a

    .line 2401
    .line 2402
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2403
    .line 2404
    if-eqz v0, :cond_48

    .line 2405
    .line 2406
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 2407
    .line 2408
    .line 2409
    :cond_48
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->B1:La/ndk0;

    .line 2410
    .line 2411
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 2412
    .line 2413
    if-eqz v0, :cond_49

    .line 2414
    .line 2415
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 2416
    .line 2417
    .line 2418
    :cond_49
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->C1:La/ndk0;

    .line 2419
    .line 2420
    goto :goto_12

    .line 2421
    :cond_4a
    instance-of v0, v1, La/st3;

    .line 2422
    .line 2423
    if-eqz v0, :cond_4c

    .line 2424
    .line 2425
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 2426
    .line 2427
    if-eqz v0, :cond_4b

    .line 2428
    .line 2429
    goto :goto_12

    .line 2430
    :cond_4b
    invoke-virtual {v13}, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->E()La/z7z;

    .line 2431
    .line 2432
    .line 2433
    move-result-object v0

    .line 2434
    invoke-interface {v0}, La/z7z;->get()Ljava/lang/Object;

    .line 2435
    .line 2436
    .line 2437
    move-result-object v0

    .line 2438
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2439
    .line 2440
    .line 2441
    move-object v11, v0

    .line 2442
    check-cast v11, La/wdk0;

    .line 2443
    .line 2444
    new-instance v14, La/xdk0;

    .line 2445
    .line 2446
    const v0, 0x7f130162

    .line 2447
    .line 2448
    .line 2449
    invoke-virtual {v13, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2450
    .line 2451
    .line 2452
    move-result-object v16

    .line 2453
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2454
    .line 2455
    .line 2456
    const v0, 0x7f131836

    .line 2457
    .line 2458
    .line 2459
    invoke-virtual {v13, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 2460
    .line 2461
    .line 2462
    move-result-object v17

    .line 2463
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2464
    .line 2465
    .line 2466
    const/16 v20, 0x0

    .line 2467
    .line 2468
    const/16 v21, 0x60

    .line 2469
    .line 2470
    invoke-direct/range {v14 .. v21}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2471
    .line 2472
    .line 2473
    new-instance v15, La/kr3;

    .line 2474
    .line 2475
    invoke-direct {v15, v13, v2}, La/kr3;-><init>(Lorg/xplatform/client1/features/appactivity/ApplicationActivity;B)V

    .line 2476
    .line 2477
    .line 2478
    const/16 v18, 0x0

    .line 2479
    .line 2480
    const/16 v19, 0x74

    .line 2481
    .line 2482
    move-object v12, v14

    .line 2483
    const/4 v14, 0x0

    .line 2484
    const/16 v16, 0x0

    .line 2485
    .line 2486
    const/16 v17, 0x0

    .line 2487
    .line 2488
    invoke-static/range {v11 .. v19}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v0

    .line 2492
    iput-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 2493
    .line 2494
    goto :goto_12

    .line 2495
    :cond_4c
    instance-of v0, v1, La/et3;

    .line 2496
    .line 2497
    if-eqz v0, :cond_4f

    .line 2498
    .line 2499
    iget-object v0, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 2500
    .line 2501
    if-eqz v0, :cond_4d

    .line 2502
    .line 2503
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 2504
    .line 2505
    .line 2506
    :cond_4d
    iput-object v10, v13, Lorg/xplatform/client1/features/appactivity/ApplicationActivity;->D1:La/ndk0;

    .line 2507
    .line 2508
    :cond_4e
    :goto_12
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2509
    .line 2510
    goto :goto_13

    .line 2511
    :cond_4f
    invoke-static {}, La/t9f;->b()V

    .line 2512
    .line 2513
    .line 2514
    :goto_13
    return-object v10

    .line 2515
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2516
    .line 2517
    check-cast v1, Ljava/lang/Throwable;

    .line 2518
    .line 2519
    move-object/from16 v2, p2

    .line 2520
    .line 2521
    check-cast v2, La/yje;

    .line 2522
    .line 2523
    check-cast v0, La/kq3;

    .line 2524
    .line 2525
    invoke-virtual {v0, v1}, La/kq3;->A(Ljava/lang/Throwable;)V

    .line 2526
    .line 2527
    .line 2528
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2529
    .line 2530
    return-object v0

    .line 2531
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2532
    .line 2533
    check-cast v1, La/br3;

    .line 2534
    .line 2535
    move-object/from16 v2, p2

    .line 2536
    .line 2537
    check-cast v2, La/yje;

    .line 2538
    .line 2539
    check-cast v0, La/wp3;

    .line 2540
    .line 2541
    sget-object v2, La/wp3;->O1:[La/iiy;

    .line 2542
    .line 2543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2544
    .line 2545
    .line 2546
    if-eqz v1, :cond_56

    .line 2547
    .line 2548
    instance-of v2, v1, La/ar3;

    .line 2549
    .line 2550
    if-eqz v2, :cond_50

    .line 2551
    .line 2552
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2553
    .line 2554
    .line 2555
    move-result-object v0

    .line 2556
    iget-object v1, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2557
    .line 2558
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2559
    .line 2560
    .line 2561
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2562
    .line 2563
    invoke-virtual {v0}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->y()V

    .line 2564
    .line 2565
    .line 2566
    invoke-virtual {v0, v9}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2567
    .line 2568
    .line 2569
    goto/16 :goto_14

    .line 2570
    .line 2571
    :cond_50
    instance-of v2, v1, La/yq3;

    .line 2572
    .line 2573
    if-eqz v2, :cond_51

    .line 2574
    .line 2575
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2576
    .line 2577
    .line 2578
    move-result-object v0

    .line 2579
    iget-object v0, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2580
    .line 2581
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2582
    .line 2583
    .line 2584
    goto/16 :goto_14

    .line 2585
    .line 2586
    :cond_51
    instance-of v2, v1, La/xq3;

    .line 2587
    .line 2588
    if-eqz v2, :cond_52

    .line 2589
    .line 2590
    check-cast v1, La/xq3;

    .line 2591
    .line 2592
    iget-object v1, v1, La/xq3;->a:La/cr3;

    .line 2593
    .line 2594
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2595
    .line 2596
    .line 2597
    move-result-object v0

    .line 2598
    iget-object v2, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2599
    .line 2600
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2601
    .line 2602
    .line 2603
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2604
    .line 2605
    invoke-virtual {v0}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->u()V

    .line 2606
    .line 2607
    .line 2608
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->D(La/cr3;)V

    .line 2609
    .line 2610
    .line 2611
    invoke-virtual {v0, v8}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2612
    .line 2613
    .line 2614
    goto/16 :goto_14

    .line 2615
    .line 2616
    :cond_52
    instance-of v2, v1, La/uq3;

    .line 2617
    .line 2618
    if-eqz v2, :cond_53

    .line 2619
    .line 2620
    check-cast v1, La/uq3;

    .line 2621
    .line 2622
    iget-object v1, v1, La/uq3;->a:La/cr3;

    .line 2623
    .line 2624
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2625
    .line 2626
    .line 2627
    move-result-object v0

    .line 2628
    iget-object v2, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2629
    .line 2630
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2631
    .line 2632
    .line 2633
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2634
    .line 2635
    iget-object v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->s:Landroid/widget/Button;

    .line 2636
    .line 2637
    invoke-virtual {v2, v9}, Landroid/view/View;->setEnabled(Z)V

    .line 2638
    .line 2639
    .line 2640
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->z(La/cr3;)V

    .line 2641
    .line 2642
    .line 2643
    goto :goto_14

    .line 2644
    :cond_53
    instance-of v2, v1, La/vq3;

    .line 2645
    .line 2646
    if-eqz v2, :cond_54

    .line 2647
    .line 2648
    check-cast v1, La/vq3;

    .line 2649
    .line 2650
    iget-object v1, v1, La/vq3;->a:La/cr3;

    .line 2651
    .line 2652
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2653
    .line 2654
    .line 2655
    move-result-object v0

    .line 2656
    iget-object v2, v0, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2657
    .line 2658
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2659
    .line 2660
    .line 2661
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2662
    .line 2663
    iget-object v2, v0, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->s:Landroid/widget/Button;

    .line 2664
    .line 2665
    invoke-virtual {v2, v8}, Landroid/view/View;->setEnabled(Z)V

    .line 2666
    .line 2667
    .line 2668
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->D(La/cr3;)V

    .line 2669
    .line 2670
    .line 2671
    invoke-virtual {v0, v8}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2672
    .line 2673
    .line 2674
    goto :goto_14

    .line 2675
    :cond_54
    instance-of v2, v1, La/wq3;

    .line 2676
    .line 2677
    if-eqz v2, :cond_55

    .line 2678
    .line 2679
    check-cast v1, La/wq3;

    .line 2680
    .line 2681
    iget-object v1, v1, La/wq3;->a:La/cr3;

    .line 2682
    .line 2683
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2684
    .line 2685
    .line 2686
    move-result-object v2

    .line 2687
    iget-object v2, v2, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2688
    .line 2689
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2690
    .line 2691
    .line 2692
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2693
    .line 2694
    .line 2695
    move-result-object v0

    .line 2696
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2697
    .line 2698
    invoke-virtual {v0, v9}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->C(Z)V

    .line 2699
    .line 2700
    .line 2701
    invoke-virtual {v0, v9}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2702
    .line 2703
    .line 2704
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->A(La/cr3;)V

    .line 2705
    .line 2706
    .line 2707
    goto :goto_14

    .line 2708
    :cond_55
    instance-of v2, v1, La/zq3;

    .line 2709
    .line 2710
    if-eqz v2, :cond_56

    .line 2711
    .line 2712
    check-cast v1, La/zq3;

    .line 2713
    .line 2714
    iget-object v1, v1, La/zq3;->a:La/cr3;

    .line 2715
    .line 2716
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2717
    .line 2718
    .line 2719
    move-result-object v2

    .line 2720
    iget-object v2, v2, La/ayq;->c:Landroid/widget/FrameLayout;

    .line 2721
    .line 2722
    invoke-virtual {v2, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2723
    .line 2724
    .line 2725
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v0

    .line 2729
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2730
    .line 2731
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->D(La/cr3;)V

    .line 2732
    .line 2733
    .line 2734
    invoke-virtual {v0, v9}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->C(Z)V

    .line 2735
    .line 2736
    .line 2737
    invoke-virtual {v0, v9}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2738
    .line 2739
    .line 2740
    invoke-virtual {v0}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->B()V

    .line 2741
    .line 2742
    .line 2743
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->A(La/cr3;)V

    .line 2744
    .line 2745
    .line 2746
    :goto_14
    sget-object v10, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2747
    .line 2748
    goto :goto_15

    .line 2749
    :cond_56
    invoke-static {}, La/t9f;->b()V

    .line 2750
    .line 2751
    .line 2752
    :goto_15
    return-object v10

    .line 2753
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2754
    .line 2755
    check-cast v1, Ljava/lang/Boolean;

    .line 2756
    .line 2757
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2758
    .line 2759
    .line 2760
    move-result v1

    .line 2761
    move-object/from16 v2, p2

    .line 2762
    .line 2763
    check-cast v2, La/yje;

    .line 2764
    .line 2765
    check-cast v0, La/wp3;

    .line 2766
    .line 2767
    sget-object v2, La/wp3;->O1:[La/iiy;

    .line 2768
    .line 2769
    invoke-virtual {v0}, La/wp3;->G0()La/ayq;

    .line 2770
    .line 2771
    .line 2772
    move-result-object v0

    .line 2773
    iget-object v0, v0, La/ayq;->b:Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;

    .line 2774
    .line 2775
    invoke-virtual {v0, v1}, Lorg/xplatform/apple_fortune/presentation/views/AppleFortuneCellGameView;->v(Z)V

    .line 2776
    .line 2777
    .line 2778
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2779
    .line 2780
    return-object v0

    .line 2781
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
