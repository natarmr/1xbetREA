.class public final synthetic La/c21;
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
    iput-byte p7, p0, La/c21;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method

.method private final Q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    check-cast v0, La/nf1;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-object/from16 v1, p0

    .line 9
    .line 10
    iget-object v1, v1, La/op9;->receiver:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v4, v1

    .line 13
    check-cast v4, La/je1;

    .line 14
    .line 15
    sget-object v1, La/je1;->S1:La/hfk0;

    .line 16
    .line 17
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    sget-object v1, La/jf1;->a:La/jf1;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    sget-object v10, La/vc1;->a:La/vc1;

    .line 27
    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-static {v4}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    goto/16 :goto_1

    .line 34
    .line 35
    :cond_0
    instance-of v1, v0, La/gf1;

    .line 36
    .line 37
    const-string v2, "snackbarManager"

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 43
    .line 44
    .line 45
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    const-string v5, "org.telegram.messenger"

    .line 47
    .line 48
    if-eqz v1, :cond_1

    .line 49
    .line 50
    :try_start_1
    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    const/4 v6, 0x0

    .line 57
    invoke-virtual {v1, v5, v6}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 58
    .line 59
    .line 60
    :cond_1
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    if-eqz v1, :cond_14

    .line 65
    .line 66
    iget-object v6, v4, La/je1;->N1:La/wdk0;

    .line 67
    .line 68
    if-eqz v6, :cond_2

    .line 69
    .line 70
    const v2, 0x7f131316

    .line 71
    .line 72
    .line 73
    invoke-virtual {v4, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    check-cast v0, La/gf1;

    .line 81
    .line 82
    iget-object v0, v0, La/gf1;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v1, v6, v2, v5, v0}, La/n6x;->i0(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw v3

    .line 93
    :catch_0
    check-cast v0, La/gf1;

    .line 94
    .line 95
    iget-object v0, v0, La/gf1;->a:Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {v4, v0}, La/je1;->H0(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto/16 :goto_1

    .line 101
    .line 102
    :cond_3
    sget-object v1, La/hf1;->a:La/hf1;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v1

    .line 108
    if-eqz v1, :cond_4

    .line 109
    .line 110
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    if-eqz v0, :cond_14

    .line 115
    .line 116
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_14

    .line 125
    .line 126
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    sget-object v1, La/qd1;->a:La/qd1;

    .line 131
    .line 132
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto/16 :goto_1

    .line 136
    .line 137
    :cond_4
    instance-of v1, v0, La/kf1;

    .line 138
    .line 139
    if-eqz v1, :cond_5

    .line 140
    .line 141
    check-cast v0, La/kf1;

    .line 142
    .line 143
    iget-object v0, v0, La/kf1;->a:Ljava/lang/String;

    .line 144
    .line 145
    invoke-virtual {v4, v0}, La/je1;->H0(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    goto/16 :goto_1

    .line 149
    .line 150
    :cond_5
    instance-of v1, v0, La/mf1;

    .line 151
    .line 152
    const-string v5, "actionDialogManager"

    .line 153
    .line 154
    const v6, 0x7f1307bb

    .line 155
    .line 156
    .line 157
    if-eqz v1, :cond_7

    .line 158
    .line 159
    check-cast v0, La/mf1;

    .line 160
    .line 161
    iget-object v13, v0, La/mf1;->a:Ljava/lang/String;

    .line 162
    .line 163
    iget-object v0, v4, La/je1;->M1:La/ii;

    .line 164
    .line 165
    if-eqz v0, :cond_6

    .line 166
    .line 167
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 168
    .line 169
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v12

    .line 173
    const v1, 0x7f130e5d

    .line 174
    .line 175
    .line 176
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object v14

    .line 180
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    sget-object v20, La/n12;->b:La/n12;

    .line 184
    .line 185
    const/16 v21, 0x0

    .line 186
    .line 187
    const/16 v22, 0x5f8

    .line 188
    .line 189
    const/4 v15, 0x0

    .line 190
    const/16 v16, 0x0

    .line 191
    .line 192
    const/16 v17, 0x0

    .line 193
    .line 194
    const/16 v18, 0x0

    .line 195
    .line 196
    const/16 v19, 0x0

    .line 197
    .line 198
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 202
    .line 203
    .line 204
    move-result-object v1

    .line 205
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 209
    .line 210
    .line 211
    goto/16 :goto_1

    .line 212
    .line 213
    :cond_6
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    throw v3

    .line 217
    :cond_7
    instance-of v1, v0, La/ef1;

    .line 218
    .line 219
    const v7, 0x7f130e5c

    .line 220
    .line 221
    .line 222
    if-eqz v1, :cond_d

    .line 223
    .line 224
    check-cast v0, La/ef1;

    .line 225
    .line 226
    iget-object v0, v0, La/ef1;->a:La/ob0;

    .line 227
    .line 228
    instance-of v1, v0, La/mb0;

    .line 229
    .line 230
    if-eqz v1, :cond_9

    .line 231
    .line 232
    check-cast v0, La/mb0;

    .line 233
    .line 234
    iget-object v13, v0, La/mb0;->a:Ljava/lang/String;

    .line 235
    .line 236
    iget-object v11, v4, La/je1;->P1:La/ynb;

    .line 237
    .line 238
    if-eqz v11, :cond_8

    .line 239
    .line 240
    sget-object v12, La/bm5;->e:La/bm5;

    .line 241
    .line 242
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 243
    .line 244
    .line 245
    move-result-object v14

    .line 246
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 247
    .line 248
    .line 249
    const-string v16, "REQUEST_CHANGE_BALANCE_KEY"

    .line 250
    .line 251
    const/16 v17, 0x1e6

    .line 252
    .line 253
    const/4 v15, 0x0

    .line 254
    invoke-static/range {v11 .. v17}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 255
    .line 256
    .line 257
    goto :goto_0

    .line 258
    :cond_8
    const-string v0, "changeBalanceDialogProvider"

    .line 259
    .line 260
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 261
    .line 262
    .line 263
    throw v3

    .line 264
    :cond_9
    sget-object v1, La/lb0;->a:La/lb0;

    .line 265
    .line 266
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 267
    .line 268
    .line 269
    move-result v1

    .line 270
    if-nez v1, :cond_c

    .line 271
    .line 272
    sget-object v1, La/nb0;->a:La/nb0;

    .line 273
    .line 274
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_b

    .line 279
    .line 280
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 281
    .line 282
    .line 283
    move-result-object v0

    .line 284
    if-eqz v0, :cond_c

    .line 285
    .line 286
    iget-object v1, v4, La/je1;->M1:La/ii;

    .line 287
    .line 288
    if-eqz v1, :cond_a

    .line 289
    .line 290
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 291
    .line 292
    const v2, 0x7f130162

    .line 293
    .line 294
    .line 295
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v12

    .line 299
    const v2, 0x7f13123b

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v13

    .line 306
    invoke-virtual {v0, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 307
    .line 308
    .line 309
    move-result-object v14

    .line 310
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    sget-object v20, La/n12;->b:La/n12;

    .line 314
    .line 315
    const/16 v21, 0x0

    .line 316
    .line 317
    const/16 v22, 0x5d8

    .line 318
    .line 319
    const/4 v15, 0x0

    .line 320
    const/16 v16, 0x0

    .line 321
    .line 322
    const-string v17, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 323
    .line 324
    const/16 v18, 0x0

    .line 325
    .line 326
    const/16 v19, 0x0

    .line 327
    .line 328
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v1, v11, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 336
    .line 337
    .line 338
    goto :goto_0

    .line 339
    :cond_a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 340
    .line 341
    .line 342
    throw v3

    .line 343
    :cond_b
    invoke-static {}, La/t9f;->b()V

    .line 344
    .line 345
    .line 346
    return-object v3

    .line 347
    :cond_c
    :goto_0
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    invoke-virtual {v0, v10}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    goto/16 :goto_1

    .line 355
    .line 356
    :cond_d
    instance-of v1, v0, La/ff1;

    .line 357
    .line 358
    if-eqz v1, :cond_11

    .line 359
    .line 360
    check-cast v0, La/ff1;

    .line 361
    .line 362
    iget-object v0, v0, La/ff1;->a:La/wq5;

    .line 363
    .line 364
    instance-of v1, v0, La/tq5;

    .line 365
    .line 366
    if-eqz v1, :cond_e

    .line 367
    .line 368
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 369
    .line 370
    .line 371
    move-result-object v1

    .line 372
    new-instance v2, La/gd1;

    .line 373
    .line 374
    check-cast v0, La/tq5;

    .line 375
    .line 376
    iget-wide v5, v0, La/tq5;->a:J

    .line 377
    .line 378
    invoke-direct {v2, v5, v6}, La/gd1;-><init>(J)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 382
    .line 383
    .line 384
    goto/16 :goto_1

    .line 385
    .line 386
    :cond_e
    instance-of v1, v0, La/uq5;

    .line 387
    .line 388
    if-eqz v1, :cond_f

    .line 389
    .line 390
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 391
    .line 392
    .line 393
    move-result-object v1

    .line 394
    new-instance v2, La/hd1;

    .line 395
    .line 396
    check-cast v0, La/uq5;

    .line 397
    .line 398
    iget-object v3, v0, La/uq5;->a:La/kr5;

    .line 399
    .line 400
    iget v0, v0, La/uq5;->b:I

    .line 401
    .line 402
    invoke-direct {v2, v3, v0}, La/hd1;-><init>(La/kr5;I)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 406
    .line 407
    .line 408
    goto/16 :goto_1

    .line 409
    .line 410
    :cond_f
    instance-of v1, v0, La/vq5;

    .line 411
    .line 412
    if-eqz v1, :cond_10

    .line 413
    .line 414
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 415
    .line 416
    .line 417
    move-result-object v1

    .line 418
    new-instance v2, La/nd1;

    .line 419
    .line 420
    check-cast v0, La/vq5;

    .line 421
    .line 422
    iget v0, v0, La/vq5;->a:I

    .line 423
    .line 424
    invoke-direct {v2, v0}, La/nd1;-><init>(I)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 428
    .line 429
    .line 430
    goto :goto_1

    .line 431
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 432
    .line 433
    .line 434
    return-object v3

    .line 435
    :cond_11
    instance-of v1, v0, La/lf1;

    .line 436
    .line 437
    if-eqz v1, :cond_13

    .line 438
    .line 439
    check-cast v0, La/lf1;

    .line 440
    .line 441
    iget-object v13, v0, La/lf1;->a:Ljava/lang/String;

    .line 442
    .line 443
    move-object v0, v2

    .line 444
    iget-object v2, v4, La/je1;->N1:La/wdk0;

    .line 445
    .line 446
    if-eqz v2, :cond_12

    .line 447
    .line 448
    new-instance v3, La/xdk0;

    .line 449
    .line 450
    sget-object v12, La/rek0;->b:La/rek0;

    .line 451
    .line 452
    const/16 v17, 0x0

    .line 453
    .line 454
    const/16 v18, 0x7c

    .line 455
    .line 456
    const/4 v14, 0x0

    .line 457
    const/4 v15, 0x0

    .line 458
    const/16 v16, 0x0

    .line 459
    .line 460
    move-object v11, v3

    .line 461
    invoke-direct/range {v11 .. v18}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 462
    .line 463
    .line 464
    const/4 v8, 0x0

    .line 465
    const/16 v9, 0x3fc

    .line 466
    .line 467
    const/4 v5, 0x0

    .line 468
    const/4 v6, 0x0

    .line 469
    const/4 v7, 0x0

    .line 470
    invoke-static/range {v2 .. v9}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 471
    .line 472
    .line 473
    goto :goto_1

    .line 474
    :cond_12
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    throw v3

    .line 478
    :cond_13
    sget-object v1, La/if1;->a:La/if1;

    .line 479
    .line 480
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 481
    .line 482
    .line 483
    move-result v0

    .line 484
    if-eqz v0, :cond_16

    .line 485
    .line 486
    iget-object v0, v4, La/je1;->M1:La/ii;

    .line 487
    .line 488
    if-eqz v0, :cond_15

    .line 489
    .line 490
    new-instance v11, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 491
    .line 492
    invoke-virtual {v4, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 493
    .line 494
    .line 495
    move-result-object v12

    .line 496
    const v1, 0x7f130932

    .line 497
    .line 498
    .line 499
    invoke-virtual {v4, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    invoke-virtual {v4, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v14

    .line 507
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 508
    .line 509
    .line 510
    sget-object v20, La/n12;->b:La/n12;

    .line 511
    .line 512
    const/16 v21, 0x0

    .line 513
    .line 514
    const/16 v22, 0x5f8

    .line 515
    .line 516
    const/4 v15, 0x0

    .line 517
    const/16 v16, 0x0

    .line 518
    .line 519
    const/16 v17, 0x0

    .line 520
    .line 521
    const/16 v18, 0x0

    .line 522
    .line 523
    const/16 v19, 0x0

    .line 524
    .line 525
    invoke-direct/range {v11 .. v22}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 526
    .line 527
    .line 528
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 533
    .line 534
    .line 535
    invoke-virtual {v0, v11, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 536
    .line 537
    .line 538
    :cond_14
    :goto_1
    invoke-virtual {v4}, La/je1;->G0()La/k3t0;

    .line 539
    .line 540
    .line 541
    move-result-object v0

    .line 542
    invoke-virtual {v0, v10}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 546
    .line 547
    return-object v0

    .line 548
    :cond_15
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 549
    .line 550
    .line 551
    throw v3

    .line 552
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 553
    .line 554
    .line 555
    return-object v3
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 37

    move-object/from16 v0, p0

    iget-byte v1, v0, La/c21;->a:B

    const v6, 0x7f1303fb

    const-string v11, "GAME_NICKNAME_REQUEST_KEY"

    const-string v12, "CHANGE_BALANCE_REQUEST_KEY"

    const-string v13, "SELECT_BALANCE_REQUEST_KEY"

    const-string v14, "changeBalanceDialogProvider"

    const-string v15, ""

    const/4 v9, 0x4

    const/16 v19, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x5

    const/4 v4, 0x1

    const/4 v10, 0x3

    packed-switch v1, :pswitch_data_0

    .line 1
    move-object/from16 v1, p1

    check-cast v1, La/gk1;

    .line 2
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/k3t0;

    .line 3
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 5
    :pswitch_0
    move-object/from16 v1, p1

    check-cast v1, La/a8d0;

    .line 6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/bk1;

    .line 7
    invoke-virtual {v0, v1}, La/bk1;->N(La/a8d0;)V

    .line 8
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 9
    :pswitch_1
    move-object/from16 v1, p1

    check-cast v1, La/gi1;

    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/k3t0;

    .line 11
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 12
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 13
    :pswitch_2
    move-object/from16 v1, p1

    check-cast v1, La/aj1;

    .line 14
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/qi1;

    .line 15
    sget-object v2, La/qi1;->P1:La/pek0;

    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    instance-of v2, v1, La/yi1;

    if-eqz v2, :cond_0

    .line 18
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    goto :goto_0

    .line 19
    :cond_0
    instance-of v2, v1, La/zi1;

    if-eqz v2, :cond_1

    .line 20
    check-cast v1, La/zi1;

    .line 21
    iget-object v1, v1, La/zi1;->a:La/uzb0;

    .line 22
    sget-object v2, La/dlk0;->m2:La/gle0;

    .line 23
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    move-result-object v3

    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "SORT_RESULT_KEY"

    invoke-static {v3, v2, v1}, La/gle0;->h(Landroidx/fragment/app/e;Ljava/lang/String;La/uzb0;)V

    .line 25
    :goto_0
    invoke-virtual {v0}, La/qi1;->G0()La/k3t0;

    move-result-object v0

    sget-object v1, La/uh1;->a:La/uh1;

    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 26
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    goto :goto_1

    .line 27
    :cond_1
    invoke-static {}, La/t9f;->b()V

    move-object/from16 v5, v19

    :goto_1
    return-object v5

    .line 28
    :pswitch_3
    move-object/from16 v1, p1

    check-cast v1, La/ud1;

    .line 29
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/k3t0;

    .line 30
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 32
    :pswitch_4
    invoke-direct/range {p0 .. p1}, La/c21;->Q(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    .line 33
    :pswitch_5
    move-object/from16 v1, p1

    check-cast v1, La/xec0;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/ae1;

    .line 34
    sget-object v1, La/ae1;->n2:La/gfk0;

    .line 35
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    const-string v1, "AGGREGATOR_PROMO_CODE_MESSAGE_REQUEST_KEY"

    invoke-static {}, La/i120;->U()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v2, v0, v1}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 37
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 38
    iget-object v0, v0, La/ae1;->m2:La/a8z;

    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La/k3t0;

    .line 39
    sget-object v1, La/tec0;->a:La/tec0;

    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 40
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 41
    :pswitch_6
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 43
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 44
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 45
    :pswitch_7
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 47
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 49
    :pswitch_8
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 50
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 51
    iget-object v2, v0, La/kc1;->w:La/au0;

    .line 52
    iget-object v3, v0, La/kc1;->v:La/u58;

    instance-of v4, v1, La/lx50;

    if-eqz v4, :cond_2

    .line 53
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, La/xb1;

    .line 54
    iget-object v4, v4, La/xb1;->a:La/db1;

    .line 55
    iget-wide v4, v4, La/db1;->a:J

    const/4 v6, -0x7

    .line 56
    invoke-virtual {v3, v6, v4, v5}, La/u58;->e(IJ)V

    .line 57
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/xb1;

    .line 58
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 59
    iget-wide v3, v3, La/db1;->a:J

    long-to-int v3, v3

    .line 60
    invoke-virtual {v2, v3, v6}, La/au0;->k(II)V

    .line 61
    check-cast v1, La/lx50;

    .line 62
    iget-wide v1, v1, La/lx50;->g:J

    .line 63
    invoke-virtual {v0, v1, v2}, La/kc1;->U(J)V

    .line 64
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/xb1;

    .line 65
    iget-object v1, v1, La/xb1;->j:Ljava/util/Set;

    .line 66
    sget-object v2, La/ju0;->f:La/ju0;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 67
    sget-object v1, La/sb1;->a:La/sb1;

    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    goto :goto_3

    .line 68
    :cond_2
    instance-of v4, v1, La/cii0;

    if-eqz v4, :cond_4

    .line 69
    move-object v4, v1

    check-cast v4, La/cii0;

    iget v4, v4, La/cii0;->g:I

    .line 70
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, La/xb1;

    .line 71
    iget-object v5, v5, La/xb1;->a:La/db1;

    .line 72
    iget-wide v5, v5, La/db1;->a:J

    .line 73
    invoke-virtual {v3, v4, v5, v6}, La/u58;->e(IJ)V

    .line 74
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, La/xb1;

    .line 75
    iget-object v3, v3, La/xb1;->a:La/db1;

    .line 76
    iget-wide v5, v3, La/db1;->a:J

    long-to-int v3, v5

    .line 77
    invoke-virtual {v2, v3, v4}, La/au0;->k(II)V

    .line 78
    new-instance v2, La/ob1;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_3

    goto :goto_2

    :cond_3
    move-object v15, v1

    :goto_2
    invoke-direct {v2, v15}, La/ob1;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    goto :goto_3

    .line 79
    :cond_4
    instance-of v2, v1, La/ko;

    if-eqz v2, :cond_5

    .line 80
    iget-object v2, v0, La/kc1;->x:La/bzu;

    .line 81
    iget-object v2, v2, La/bzu;->b:Ljava/lang/Object;

    check-cast v2, La/ony;

    .line 82
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3}, Ljava/util/LinkedHashMap;-><init>()V

    .line 83
    const-string v4, "Cannot to get current domain mirror"

    .line 84
    invoke-static {v4}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    move-result-object v4

    const-string v5, "GetActualDomain"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    new-instance v4, La/tny;

    invoke-static {v3}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v3

    const-string v6, "event"

    invoke-direct {v4, v6, v3}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 86
    check-cast v2, La/rny;

    invoke-virtual {v2, v5, v4}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 87
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    goto :goto_3

    .line 88
    :cond_5
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 89
    :goto_3
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 90
    :pswitch_9
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 91
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 92
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 93
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 94
    :pswitch_a
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 95
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 96
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 97
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 98
    :pswitch_b
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 99
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 100
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 101
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 102
    :pswitch_c
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 103
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 104
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 105
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 106
    :pswitch_d
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 107
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 108
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 109
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 110
    :pswitch_e
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 111
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/kc1;

    .line 112
    invoke-virtual {v0, v1}, La/kc1;->P(Ljava/lang/Throwable;)V

    .line 113
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 114
    :pswitch_f
    move-object/from16 v1, p1

    check-cast v1, La/wb1;

    .line 115
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/cb1;

    .line 116
    sget-object v15, La/cb1;->e2:La/rek0;

    .line 117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 118
    instance-of v15, v1, La/eb1;

    const/4 v2, 0x2

    const-string v7, "SELECT_GAME_MODE_REQUEST_KEY"

    const-string v3, "REQUEST_CODE_WALLET_DIALOG_KEY"

    if-eqz v15, :cond_b

    .line 119
    check-cast v1, La/eb1;

    .line 120
    iget-object v1, v1, La/eb1;->a:Ljava/util/List;

    .line 121
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, La/ju0;

    .line 122
    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    if-eqz v6, :cond_a

    if-eq v6, v4, :cond_9

    if-eq v6, v2, :cond_8

    if-eq v6, v10, :cond_7

    if-eq v6, v8, :cond_6

    goto :goto_4

    .line 123
    :cond_6
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6, v11}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 124
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    .line 125
    new-instance v14, La/bb1;

    invoke-direct {v14, v0, v9}, La/bb1;-><init>(La/cb1;B)V

    .line 126
    invoke-virtual {v6, v11, v0, v14}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_4

    .line 127
    :cond_7
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 128
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    new-instance v14, La/bb1;

    invoke-direct {v14, v0, v5}, La/bb1;-><init>(La/cb1;B)V

    invoke-virtual {v6, v3, v0, v14}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_4

    .line 129
    :cond_8
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6, v7}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 130
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    .line 131
    new-instance v14, La/bb1;

    invoke-direct {v14, v0, v10}, La/bb1;-><init>(La/cb1;B)V

    .line 132
    invoke-virtual {v6, v7, v0, v14}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_4

    .line 133
    :cond_9
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6, v12}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 134
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    new-instance v14, La/bb1;

    invoke-direct {v14, v0, v4}, La/bb1;-><init>(La/cb1;B)V

    invoke-virtual {v6, v12, v0, v14}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_4

    .line 135
    :cond_a
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6, v13}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 136
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    .line 137
    new-instance v14, La/bb1;

    invoke-direct {v14, v0, v2}, La/bb1;-><init>(La/cb1;B)V

    .line 138
    invoke-virtual {v6, v13, v0, v14}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_4

    .line 139
    :cond_b
    instance-of v15, v1, La/lb1;

    if-eqz v15, :cond_c

    .line 140
    check-cast v1, La/lb1;

    .line 141
    iget-object v1, v1, La/lb1;->a:Ljava/lang/String;

    .line 142
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2, v7}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 143
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    .line 144
    new-instance v3, La/bb1;

    invoke-direct {v3, v0, v10}, La/bb1;-><init>(La/cb1;B)V

    .line 145
    invoke-virtual {v2, v7, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 146
    new-instance v2, La/mc;

    const/16 v3, 0xd

    invoke-direct {v2, v1, v0, v3}, La/mc;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    invoke-static {v0, v2}, La/j120;->P(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function0;)V

    goto/16 :goto_7

    .line 147
    :cond_c
    instance-of v7, v1, La/sb1;

    if-eqz v7, :cond_d

    .line 148
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v11}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 149
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    .line 150
    new-instance v2, La/bb1;

    invoke-direct {v2, v0, v9}, La/bb1;-><init>(La/cb1;B)V

    .line 151
    invoke-virtual {v1, v11, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 152
    sget-object v1, La/kv0;->n2:La/hfk0;

    .line 153
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 154
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/hfk0;->l(Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 155
    :cond_d
    instance-of v7, v1, La/kb1;

    if-eqz v7, :cond_e

    .line 156
    check-cast v1, La/kb1;

    .line 157
    iget-object v9, v1, La/kb1;->a:Ljava/lang/String;

    .line 158
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 159
    sget v2, La/h6s;->f2:I

    .line 160
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v8

    const v2, 0x7f130e5d

    .line 161
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f13032f

    .line 162
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v11

    const v2, 0x7f130929

    .line 163
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v14

    .line 164
    sget-object v16, La/n12;->b:La/n12;

    .line 165
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const/16 v17, 0x0

    const/16 v18, 0x590

    const/4 v12, 0x0

    const-string v13, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY"

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 166
    new-instance v2, La/h6s;

    invoke-direct {v2}, La/h6s;-><init>()V

    .line 167
    invoke-virtual {v2, v7}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 168
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 170
    :cond_e
    instance-of v7, v1, La/pb1;

    if-eqz v7, :cond_f

    .line 171
    check-cast v1, La/pb1;

    .line 172
    iget-object v9, v1, La/pb1;->a:Ljava/lang/String;

    .line 173
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 174
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 175
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v8

    const v2, 0x7f130e5d

    .line 176
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f13032f

    .line 177
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v11

    .line 178
    sget-object v16, La/n12;->b:La/n12;

    const/16 v17, 0x0

    const/16 v18, 0x5d0

    const/4 v12, 0x0

    .line 179
    const-string v13, "REQUEST_CONVERT_BALANCE_DIALOG_KEY"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 180
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 182
    :cond_f
    instance-of v6, v1, La/tb1;

    if-eqz v6, :cond_10

    .line 183
    check-cast v1, La/tb1;

    .line 184
    iget-wide v8, v1, La/tb1;->a:J

    .line 185
    iget-wide v10, v1, La/tb1;->b:J

    .line 186
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 187
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    new-instance v2, La/bb1;

    invoke-direct {v2, v0, v5}, La/bb1;-><init>(La/cb1;B)V

    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 188
    sget-object v1, La/ywu0;->s2:La/sxs0;

    .line 189
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v7, 0x1

    const-string v12, "REQUEST_CODE_WALLET_DIALOG_KEY"

    invoke-static/range {v6 .. v12}, La/sxs0;->c(Landroidx/fragment/app/e;ZJJLjava/lang/String;)V

    goto/16 :goto_7

    .line 191
    :cond_10
    instance-of v3, v1, La/hb1;

    if-eqz v3, :cond_12

    .line 192
    check-cast v1, La/hb1;

    .line 193
    iget-object v7, v1, La/hb1;->a:Ljava/lang/String;

    .line 194
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 195
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    new-instance v2, La/bb1;

    invoke-direct {v2, v0, v4}, La/bb1;-><init>(La/cb1;B)V

    invoke-virtual {v1, v12, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 196
    iget-object v5, v0, La/cb1;->c2:La/ynb;

    if-eqz v5, :cond_11

    .line 197
    sget-object v6, La/bm5;->e:La/bm5;

    .line 198
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    const-string v10, "CHANGE_BALANCE_REQUEST_KEY"

    const/16 v11, 0x1e6

    const/4 v9, 0x0

    .line 200
    invoke-static/range {v5 .. v11}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    goto/16 :goto_7

    .line 201
    :cond_11
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw v19

    .line 202
    :cond_12
    instance-of v3, v1, La/jb1;

    if-eqz v3, :cond_14

    .line 203
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v13}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 204
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    .line 205
    new-instance v3, La/bb1;

    invoke-direct {v3, v0, v2}, La/bb1;-><init>(La/cb1;B)V

    .line 206
    invoke-virtual {v1, v13, v0, v3}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 207
    iget-object v4, v0, La/cb1;->c2:La/ynb;

    if-eqz v4, :cond_13

    .line 208
    sget-object v5, La/bm5;->e:La/bm5;

    .line 209
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    const-string v9, "SELECT_BALANCE_REQUEST_KEY"

    const/16 v10, 0x16e

    const/4 v6, 0x0

    const/4 v8, 0x0

    .line 211
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    goto/16 :goto_7

    .line 212
    :cond_13
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw v19

    .line 213
    :cond_14
    instance-of v2, v1, La/vb1;

    if-eqz v2, :cond_15

    .line 214
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 215
    new-instance v2, La/ab1;

    invoke-direct {v2, v0, v8}, La/ab1;-><init>(La/cb1;B)V

    .line 216
    new-instance v3, La/pk9;

    const/16 v4, 0x9

    invoke-direct {v3, v2, v4}, La/pk9;-><init>(Lkotlin/jvm/functions/Function0;B)V

    const-string v2, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY"

    invoke-static {v0, v2, v3}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 217
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1307bb

    .line 219
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v4, 0x7f13040b

    .line 220
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const v4, 0x7f130e5c

    .line 221
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 222
    sget-object v14, La/n12;->b:La/n12;

    .line 223
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const/4 v15, 0x0

    const/16 v16, 0x5d8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 224
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 225
    :cond_15
    instance-of v2, v1, La/ub1;

    if-eqz v2, :cond_18

    .line 226
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 227
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v2

    instance-of v3, v2, La/yc3;

    if-eqz v3, :cond_16

    move-object v5, v2

    check-cast v5, La/yc3;

    goto :goto_5

    :cond_16
    move-object/from16 v5, v19

    :goto_5
    if-eqz v5, :cond_17

    new-instance v2, La/ab1;

    invoke-direct {v2, v0, v10}, La/ab1;-><init>(La/cb1;B)V

    invoke-static {v5, v2}, La/ccq0;->U(La/yc3;Lkotlin/jvm/functions/Function0;)V

    .line 228
    :cond_17
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v2

    .line 229
    new-instance v3, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v4, 0x7f130162

    .line 230
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1303dc

    .line 231
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f130e5c

    .line 232
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 233
    sget-object v12, La/n12;->b:La/n12;

    const/4 v13, 0x0

    const/16 v14, 0x5d8

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 234
    const-string v9, "REQUEST_ATTENTION_DIALOG_KEY"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v14}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 235
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    move-result-object v1

    .line 236
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 237
    :cond_18
    instance-of v2, v1, La/ib1;

    if-eqz v2, :cond_1b

    .line 238
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v1

    if-eqz v1, :cond_23

    .line 239
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v2

    instance-of v3, v2, La/yc3;

    if-eqz v3, :cond_19

    move-object v5, v2

    check-cast v5, La/yc3;

    goto :goto_6

    :cond_19
    move-object/from16 v5, v19

    :goto_6
    if-eqz v5, :cond_1a

    new-instance v2, La/ab1;

    invoke-direct {v2, v0, v10}, La/ab1;-><init>(La/cb1;B)V

    invoke-static {v5, v2}, La/ccq0;->U(La/yc3;Lkotlin/jvm/functions/Function0;)V

    .line 240
    :cond_1a
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v2

    .line 241
    new-instance v3, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v4, 0x7f130162

    .line 242
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1303dc

    .line 243
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f130e5c

    .line 244
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 245
    sget-object v12, La/n12;->b:La/n12;

    const/4 v13, 0x0

    const/16 v14, 0x5d8

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 246
    const-string v9, "REQUEST_ATTENTION_DIALOG_KEY"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v14}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 247
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    move-result-object v1

    .line 248
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 249
    :cond_1b
    instance-of v2, v1, La/gb1;

    if-eqz v2, :cond_1c

    .line 250
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 251
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v4, 0x7f1307bb

    .line 252
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f13040b

    .line 253
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 254
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7f130daa

    .line 255
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v6

    .line 256
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d0

    const/4 v7, 0x0

    .line 257
    const-string v8, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 258
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 259
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 260
    :cond_1c
    instance-of v2, v1, La/fb1;

    if-eqz v2, :cond_1e

    .line 261
    iget-object v1, v0, La/cb1;->b2:La/wdk0;

    if-eqz v1, :cond_1d

    .line 262
    new-instance v2, La/xdk0;

    .line 263
    sget-object v3, La/rek0;->b:La/rek0;

    const v4, 0x7f13096f

    .line 264
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v8, 0x0

    const/16 v9, 0x7c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 265
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    const/16 v29, 0x0

    const/16 v30, 0x3fc

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v25, v0

    move-object/from16 v23, v1

    move-object/from16 v24, v2

    .line 266
    invoke-static/range {v23 .. v30}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 267
    invoke-virtual {v0}, La/cb1;->H0()La/k3t0;

    move-result-object v1

    sget-object v2, La/sa1;->a:La/sa1;

    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    goto/16 :goto_7

    .line 268
    :cond_1d
    const-string v0, "snackBarManager"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw v19

    .line 269
    :cond_1e
    instance-of v2, v1, La/ob1;

    if-eqz v2, :cond_1f

    .line 270
    check-cast v1, La/ob1;

    .line 271
    iget-object v4, v1, La/ob1;->a:Ljava/lang/String;

    .line 272
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 273
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 274
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f130e5d

    .line 275
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 277
    const-string v8, "REQUEST_GAME_URL_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 278
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 279
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 280
    :cond_1f
    instance-of v2, v1, La/rb1;

    if-eqz v2, :cond_20

    .line 281
    check-cast v1, La/rb1;

    .line 282
    iget-object v4, v1, La/rb1;->a:Ljava/lang/String;

    .line 283
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 284
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 285
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f130e5d

    .line 286
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 287
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 288
    const-string v8, "REQUEST_NICKNAME_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 289
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 290
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_7

    .line 291
    :cond_20
    instance-of v2, v1, La/nb1;

    if-eqz v2, :cond_21

    .line 292
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 293
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 294
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f130b30

    .line 295
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 296
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 297
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 298
    const-string v8, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 299
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto :goto_7

    .line 301
    :cond_21
    instance-of v2, v1, La/mb1;

    if-eqz v2, :cond_22

    .line 302
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 303
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 304
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f130932

    .line 305
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v6, 0x7f130e5c

    .line 306
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 308
    const-string v8, "REQUEST_GAME_NOT_AVAILABLE_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 309
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 310
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto :goto_7

    .line 311
    :cond_22
    instance-of v1, v1, La/qb1;

    if-eqz v1, :cond_23

    .line 312
    invoke-virtual {v0}, La/cb1;->G0()La/ii;

    move-result-object v1

    .line 313
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 314
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f1312e6

    .line 315
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 316
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 317
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 318
    const-string v8, "REQUEST_NETWORK_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 319
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 320
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 321
    :cond_23
    :goto_7
    invoke-virtual {v0}, La/cb1;->H0()La/k3t0;

    move-result-object v0

    sget-object v1, La/ta1;->a:La/ta1;

    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 323
    :pswitch_10
    move-object/from16 v1, p1

    check-cast v1, La/fa1;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/ea1;

    .line 324
    sget-object v2, La/ea1;->n2:La/gfk0;

    .line 325
    iget-object v1, v1, La/fa1;->a:La/xw90;

    .line 326
    iget-object v2, v0, La/ea1;->k2:La/phf0;

    .line 327
    sget-object v3, La/ea1;->o2:[La/iiy;

    aget-object v3, v3, v5

    invoke-virtual {v2, v0, v3}, La/phf0;->l(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/lang/String;

    move-result-object v2

    .line 328
    new-instance v3, Lkotlin/Pair;

    const-string v4, "RESULT_PLAY_FOR_REAL_LISTENER_KEY"

    invoke-direct {v3, v4, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 329
    filled-new-array {v3}, [Lkotlin/Pair;

    move-result-object v1

    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    move-result-object v1

    .line 330
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 331
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 332
    invoke-virtual {v0}, La/ea1;->P0()La/k3t0;

    move-result-object v0

    sget-object v1, La/x91;->a:La/x91;

    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 333
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 334
    :pswitch_11
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 336
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 337
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 338
    :pswitch_12
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 339
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 340
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 341
    instance-of v2, v1, La/lx50;

    if-eqz v2, :cond_24

    .line 342
    invoke-virtual {v0}, La/i3t0;->D()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, La/u81;

    .line 343
    iget-object v1, v1, La/u81;->u:Ljava/util/Set;

    .line 344
    sget-object v2, La/ju0;->f:La/ju0;

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 345
    sget-object v1, La/n81;->a:La/n81;

    invoke-virtual {v0, v1}, La/i3t0;->G(Ljava/lang/Object;)V

    goto :goto_9

    .line 346
    :cond_24
    instance-of v2, v1, La/cii0;

    if-eqz v2, :cond_26

    .line 347
    new-instance v2, La/i81;

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_25

    goto :goto_8

    :cond_25
    move-object v15, v1

    :goto_8
    invoke-direct {v2, v15}, La/i81;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    goto :goto_9

    .line 348
    :cond_26
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 349
    :goto_9
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 350
    :pswitch_13
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 351
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 352
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 353
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 354
    :pswitch_14
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 355
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 356
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 357
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 358
    :pswitch_15
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 360
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 361
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 362
    :pswitch_16
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 363
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 364
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 365
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 366
    :pswitch_17
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 367
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 368
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 370
    :pswitch_18
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 371
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n91;

    .line 372
    invoke-virtual {v0, v1}, La/n91;->R(Ljava/lang/Throwable;)V

    .line 373
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 374
    :pswitch_19
    move-object/from16 v1, p1

    check-cast v1, La/h71;

    .line 375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/k3t0;

    .line 376
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 377
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 378
    :pswitch_1a
    move-object/from16 v1, p1

    check-cast v1, La/t81;

    .line 379
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    move-object/from16 v28, v0

    check-cast v28, La/m71;

    .line 380
    sget-object v0, La/m71;->e2:La/rek0;

    .line 381
    sget-object v30, La/rek0;->b:La/rek0;

    instance-of v0, v1, La/f81;

    if-eqz v0, :cond_27

    check-cast v1, La/f81;

    .line 382
    iget-object v0, v1, La/f81;->a:La/xdk0;

    .line 383
    invoke-virtual/range {v28 .. v28}, La/m71;->I0()La/wdk0;

    move-result-object v26

    const/16 v32, 0x0

    const/16 v33, 0x3fc

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v27, v0

    .line 384
    invoke-static/range {v26 .. v33}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    move-object/from16 v0, v28

    goto/16 :goto_c

    :cond_27
    move-object/from16 v0, v28

    .line 385
    instance-of v2, v1, La/s71;

    if-eqz v2, :cond_28

    check-cast v1, La/s71;

    .line 386
    iget-boolean v1, v1, La/s71;->a:Z

    .line 387
    invoke-virtual {v0, v1}, La/m71;->G0(Z)V

    goto/16 :goto_c

    .line 388
    :cond_28
    instance-of v2, v1, La/e81;

    if-eqz v2, :cond_29

    .line 389
    check-cast v1, La/e81;

    .line 390
    iget-object v9, v1, La/e81;->a:Ljava/lang/String;

    .line 391
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 392
    sget v2, La/h6s;->f2:I

    .line 393
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v8

    const v5, 0x7f130e5d

    .line 394
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f13032f

    .line 395
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v11

    const v2, 0x7f130929

    .line 396
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v14

    .line 397
    sget-object v16, La/n12;->b:La/n12;

    .line 398
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const/16 v17, 0x0

    const/16 v18, 0x590

    const/4 v12, 0x0

    const-string v13, "GAME_CURRENCY_CONVERSATION_REQUEST_KEY"

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 399
    new-instance v2, La/h6s;

    invoke-direct {v2}, La/h6s;-><init>()V

    .line 400
    invoke-virtual {v2, v7}, La/u0i;->R0(Lorg/xplatform/uikit/components/dialog/DialogFields;)V

    .line 401
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    invoke-virtual {v1, v2, v3}, La/ii;->c(La/u0i;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 403
    :cond_29
    instance-of v2, v1, La/i81;

    if-eqz v2, :cond_2a

    check-cast v1, La/i81;

    .line 404
    iget-object v4, v1, La/i81;->a:Ljava/lang/String;

    .line 405
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 406
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 407
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f130e5d

    .line 408
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 409
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 410
    const-string v8, "REQUEST_GAME_URL_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 411
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 412
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 413
    :cond_2a
    instance-of v2, v1, La/l81;

    if-eqz v2, :cond_2b

    check-cast v1, La/l81;

    .line 414
    iget-object v4, v1, La/l81;->a:Ljava/lang/String;

    .line 415
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 416
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 417
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v5, 0x7f130e5d

    .line 418
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 420
    const-string v8, "REQUEST_NICKNAME_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 421
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 422
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 423
    :cond_2b
    instance-of v2, v1, La/j81;

    if-eqz v2, :cond_2c

    check-cast v1, La/j81;

    .line 424
    iget-object v9, v1, La/j81;->a:Ljava/lang/String;

    .line 425
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 426
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 427
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v8

    const v5, 0x7f130e5d

    .line 428
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, 0x7f13032f

    .line 429
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v11

    .line 430
    sget-object v16, La/n12;->b:La/n12;

    const/16 v17, 0x0

    const/16 v18, 0x5d0

    const/4 v12, 0x0

    .line 431
    const-string v13, "REQUEST_CONVERT_BALANCE_DIALOG_KEY"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 432
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 433
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 434
    :cond_2c
    instance-of v2, v1, La/r81;

    if-eqz v2, :cond_2d

    check-cast v1, La/r81;

    .line 435
    iget-object v1, v1, La/r81;->a:Ljava/lang/String;

    .line 436
    invoke-virtual {v0}, La/m71;->I0()La/wdk0;

    move-result-object v26

    .line 437
    new-instance v27, La/xdk0;

    const/16 v35, 0x0

    const/16 v36, 0x7c

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v31, v1

    move-object/from16 v29, v27

    invoke-direct/range {v29 .. v36}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    const/16 v33, 0x3fc

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v0

    .line 438
    invoke-static/range {v26 .. v33}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    goto/16 :goto_c

    .line 439
    :cond_2d
    instance-of v2, v1, La/t71;

    if-eqz v2, :cond_2e

    .line 440
    check-cast v1, La/t71;

    .line 441
    iget-object v2, v1, La/t71;->a:Ljava/lang/String;

    .line 442
    iget-object v3, v1, La/t71;->b:Ljava/lang/String;

    .line 443
    iget-object v1, v1, La/t71;->c:Ljava/lang/String;

    .line 444
    iget-object v4, v0, La/m71;->X1:La/n0o0;

    .line 445
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v27, v4

    check-cast v27, La/qog0;

    if-eqz v27, :cond_4a

    .line 446
    new-instance v26, La/fu0;

    const/16 v32, 0x1

    move-object/from16 v29, v0

    move-object/from16 v30, v1

    move-object/from16 v28, v2

    move-object/from16 v31, v3

    invoke-direct/range {v26 .. v32}, La/fu0;-><init>(La/qog0;Ljava/lang/String;La/yx5;Ljava/lang/String;Ljava/lang/String;B)V

    move-object/from16 v1, v26

    move-object/from16 v4, v27

    .line 447
    iget-object v2, v4, La/qog0;->a:Ljava/util/LinkedHashSet;

    invoke-interface {v2, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 448
    invoke-virtual {v4}, La/qog0;->a()V

    goto/16 :goto_c

    .line 449
    :cond_2e
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 450
    instance-of v2, v1, La/w71;

    const-string v3, "PLAY_FOR_REAL_DIALOG_KEY"

    if-eqz v2, :cond_33

    check-cast v1, La/w71;

    .line 451
    iget-object v1, v1, La/w71;->a:Ljava/util/List;

    .line 452
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La/ju0;

    .line 453
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_32

    if-eq v2, v4, :cond_31

    if-eq v2, v9, :cond_30

    if-eq v2, v8, :cond_2f

    goto :goto_a

    .line 454
    :cond_2f
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2, v11}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 455
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    .line 456
    new-instance v6, La/j71;

    invoke-direct {v6, v0, v5}, La/j71;-><init>(La/m71;B)V

    .line 457
    invoke-virtual {v2, v11, v0, v6}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_a

    .line 458
    :cond_30
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 459
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    .line 460
    new-instance v6, La/j71;

    invoke-direct {v6, v0, v4}, La/j71;-><init>(La/m71;B)V

    .line 461
    invoke-virtual {v2, v3, v0, v6}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_a

    .line 462
    :cond_31
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2, v12}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 463
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    new-instance v6, La/j71;

    invoke-direct {v6, v0, v8}, La/j71;-><init>(La/m71;B)V

    invoke-virtual {v2, v12, v0, v6}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_a

    .line 464
    :cond_32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2, v13}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 465
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    .line 466
    new-instance v6, La/j71;

    invoke-direct {v6, v0, v10}, La/j71;-><init>(La/m71;B)V

    .line 467
    invoke-virtual {v2, v13, v0, v6}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    goto :goto_a

    .line 468
    :cond_33
    sget-object v2, La/m81;->a:La/m81;

    .line 469
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_35

    .line 470
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v1

    if-eqz v1, :cond_4a

    .line 471
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    move-result-object v1

    invoke-static {v1}, La/tdc;->U(Landroidx/fragment/app/e;)Z

    move-result v1

    if-eqz v1, :cond_34

    .line 472
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v3}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 473
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    .line 474
    new-instance v2, La/j71;

    invoke-direct {v2, v0, v4}, La/j71;-><init>(La/m71;B)V

    .line 475
    invoke-virtual {v1, v3, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 476
    sget-object v1, La/ea1;->n2:La/gfk0;

    .line 477
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 478
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 479
    const-string v1, "AggregatorPlayForRealDialog"

    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    move-result-object v4

    if-nez v4, :cond_4a

    .line 480
    new-instance v4, La/ea1;

    invoke-direct {v4}, La/ea1;-><init>()V

    .line 481
    sget-object v6, La/ea1;->o2:[La/iiy;

    aget-object v5, v6, v5

    iget-object v6, v4, La/ea1;->k2:La/phf0;

    invoke-virtual {v6, v4, v5, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 482
    invoke-virtual {v4, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    goto/16 :goto_c

    .line 483
    :cond_34
    invoke-virtual {v0}, La/m71;->J0()La/k3t0;

    move-result-object v1

    sget-object v2, La/m61;->a:La/m61;

    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    goto/16 :goto_c

    .line 484
    :cond_35
    sget-object v2, La/z71;->a:La/z71;

    .line 485
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_37

    .line 486
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v12}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 487
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    new-instance v2, La/j71;

    invoke-direct {v2, v0, v8}, La/j71;-><init>(La/m71;B)V

    invoke-virtual {v1, v12, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 488
    iget-object v1, v0, La/m71;->c2:La/ynb;

    if-eqz v1, :cond_36

    .line 489
    sget-object v21, La/bm5;->e:La/bm5;

    .line 490
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 491
    const-string v25, "CHANGE_BALANCE_REQUEST_KEY"

    const/16 v26, 0x1ee

    const/16 v22, 0x0

    const/16 v24, 0x0

    move-object/from16 v20, v1

    .line 492
    invoke-static/range {v20 .. v26}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    goto/16 :goto_c

    .line 493
    :cond_36
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw v19

    .line 494
    :cond_37
    sget-object v2, La/b81;->a:La/b81;

    .line 495
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_39

    .line 496
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    invoke-virtual {v1, v13}, Landroidx/fragment/app/e;->f(Ljava/lang/String;)V

    .line 497
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v1

    .line 498
    new-instance v2, La/j71;

    invoke-direct {v2, v0, v10}, La/j71;-><init>(La/m71;B)V

    .line 499
    invoke-virtual {v1, v13, v0, v2}, Landroidx/fragment/app/e;->u0(Ljava/lang/String;La/clz;La/k4r;)V

    .line 500
    iget-object v3, v0, La/m71;->c2:La/ynb;

    if-eqz v3, :cond_38

    .line 501
    sget-object v4, La/bm5;->e:La/bm5;

    .line 502
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 503
    const-string v8, "SELECT_BALANCE_REQUEST_KEY"

    const/16 v9, 0x16e

    const/4 v5, 0x0

    const/4 v7, 0x0

    .line 504
    invoke-static/range {v3 .. v9}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    goto/16 :goto_c

    .line 505
    :cond_38
    invoke-static {v14}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    throw v19

    .line 506
    :cond_39
    sget-object v2, La/p81;->a:La/p81;

    .line 507
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3a

    .line 508
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 509
    new-instance v2, La/k71;

    const/4 v3, 0x6

    invoke-direct {v2, v0, v3}, La/k71;-><init>(La/m71;B)V

    .line 510
    new-instance v3, La/pk9;

    const/16 v4, 0x9

    invoke-direct {v3, v2, v4}, La/pk9;-><init>(Lkotlin/jvm/functions/Function0;B)V

    const-string v2, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY"

    invoke-static {v0, v2, v3}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 511
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 512
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    move-result-object v3

    const v4, 0x7f1307bb

    .line 513
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v4, 0x7f13040b

    .line 514
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    const v4, 0x7f130e5c

    .line 515
    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 516
    sget-object v14, La/n12;->b:La/n12;

    .line 517
    new-instance v5, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const/4 v15, 0x0

    const/16 v16, 0x5d8

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, "UNAVAILABLE_BALANCE_ERROR_DIALOG_KEY"

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v5 .. v16}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 518
    invoke-virtual {v1, v5, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 519
    :cond_3a
    sget-object v2, La/o81;->a:La/o81;

    .line 520
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3d

    .line 521
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v1

    if-eqz v1, :cond_4a

    .line 522
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    move-result-object v2

    instance-of v3, v2, La/yc3;

    if-eqz v3, :cond_3b

    move-object v5, v2

    check-cast v5, La/yc3;

    goto :goto_b

    :cond_3b
    move-object/from16 v5, v19

    :goto_b
    if-eqz v5, :cond_3c

    new-instance v2, La/k71;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, La/k71;-><init>(La/m71;B)V

    invoke-static {v5, v2}, La/ccq0;->U(La/yc3;Lkotlin/jvm/functions/Function0;)V

    .line 523
    :cond_3c
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v2

    .line 524
    new-instance v3, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v4, 0x7f130162

    .line 525
    invoke-virtual {v1, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f1303dc

    .line 526
    invoke-virtual {v1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f130e5c

    .line 527
    invoke-virtual {v1, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 528
    sget-object v12, La/n12;->b:La/n12;

    const/4 v13, 0x0

    const/16 v14, 0x5d8

    const/4 v7, 0x0

    const/4 v8, 0x0

    .line 529
    const-string v9, "REQUEST_ATTENTION_DIALOG_KEY"

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v3 .. v14}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 530
    invoke-virtual {v1}, La/kxq;->r()La/v1r;

    move-result-object v1

    .line 531
    invoke-virtual {v2, v3, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 532
    :cond_3d
    sget-object v2, La/a81;->a:La/a81;

    .line 533
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    .line 534
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 535
    new-instance v2, La/k71;

    invoke-direct {v2, v0, v8}, La/k71;-><init>(La/m71;B)V

    .line 536
    new-instance v3, La/h8a;

    const/16 v4, 0x9

    invoke-direct {v3, v2, v4}, La/h8a;-><init>(Ljava/lang/Object;B)V

    const-string v2, "BONUS_BALANCE_ERROR_DIALOG_KEY"

    invoke-static {v0, v2, v3}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 537
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 538
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    move-result-object v3

    .line 539
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v5, 0x7f130162

    .line 540
    invoke-virtual {v3, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v5

    const v6, 0x7f1303db

    .line 541
    invoke-virtual {v3, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    const v7, 0x7f130e5c

    .line 542
    invoke-virtual {v3, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v8, 0x7f13032f

    .line 543
    invoke-virtual {v3, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 544
    sget-object v13, La/n12;->b:La/n12;

    const/4 v14, 0x0

    const/16 v15, 0x5d0

    const/4 v9, 0x0

    .line 545
    const-string v10, "BONUS_BALANCE_ERROR_DIALOG_KEY"

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 546
    invoke-virtual {v1, v4, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 547
    :cond_3e
    sget-object v2, La/y71;->a:La/y71;

    .line 548
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3f

    .line 549
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 550
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 551
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f13040b

    .line 552
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 553
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v6, 0x7f130daa

    .line 554
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v6

    .line 555
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d0

    const/4 v7, 0x0

    .line 556
    const-string v8, "REQUEST_BONUS_BALANCE_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 557
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 558
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 559
    :cond_3f
    sget-object v2, La/x71;->a:La/x71;

    .line 560
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_40

    .line 561
    invoke-virtual {v0}, La/m71;->I0()La/wdk0;

    move-result-object v26

    .line 562
    new-instance v27, La/xdk0;

    const v1, 0x7f13096f

    .line 563
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v31

    invoke-virtual/range {v31 .. v31}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v35, 0x0

    const/16 v36, 0x7c

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v29, v27

    .line 564
    invoke-direct/range {v29 .. v36}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    const/16 v33, 0x3fc

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v0

    .line 565
    invoke-static/range {v26 .. v33}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 566
    invoke-virtual {v0}, La/m71;->J0()La/k3t0;

    move-result-object v1

    sget-object v2, La/q61;->a:La/q61;

    invoke-virtual {v1, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    goto/16 :goto_c

    .line 567
    :cond_40
    sget-object v2, La/h81;->a:La/h81;

    .line 568
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_41

    .line 569
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 570
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 571
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f130b30

    .line 572
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 573
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 574
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 575
    const-string v8, "REQUEST_SHOW_EMPTY_URL_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 576
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 578
    :cond_41
    instance-of v2, v1, La/n81;

    if-eqz v2, :cond_42

    .line 579
    sget-object v1, La/kv0;->n2:La/hfk0;

    .line 580
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, La/hfk0;->l(Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 582
    :cond_42
    sget-object v2, La/g81;->a:La/g81;

    .line 583
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_43

    .line 584
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 585
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 586
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f130932

    .line 587
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v6, 0x7f130e5c

    .line 588
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 589
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 590
    const-string v8, "REQUEST_GAME_NOT_AVAILABLE_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 591
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 593
    :cond_43
    sget-object v2, La/d81;->a:La/d81;

    .line 594
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_44

    .line 595
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 596
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 597
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f1303d7

    .line 598
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 599
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 600
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5f8

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    .line 601
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 602
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 603
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 604
    :cond_44
    instance-of v2, v1, La/c81;

    if-eqz v2, :cond_45

    check-cast v1, La/c81;

    .line 605
    iget-object v1, v1, La/c81;->a:Ljava/lang/String;

    .line 606
    invoke-virtual {v0}, La/m71;->I0()La/wdk0;

    move-result-object v26

    .line 607
    new-instance v27, La/xdk0;

    const/16 v35, 0x0

    const/16 v36, 0x7c

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v31, v1

    move-object/from16 v29, v27

    invoke-direct/range {v29 .. v36}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    const/16 v33, 0x3fc

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v28, v0

    .line 608
    invoke-static/range {v26 .. v33}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    goto/16 :goto_c

    .line 609
    :cond_45
    sget-object v2, La/q81;->a:La/q81;

    .line 610
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_46

    .line 611
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 612
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 613
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v8

    const v2, 0x7f13131f

    .line 614
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v9

    const v5, 0x7f130e5d

    .line 615
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 616
    sget-object v16, La/n12;->a:La/n12;

    const/16 v17, 0x0

    const/16 v18, 0x5d8

    const/4 v11, 0x0

    const/4 v12, 0x0

    .line 617
    const-string v13, "ERROR_DIALOG_KEY"

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 618
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    invoke-virtual {v1, v7, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto/16 :goto_c

    .line 620
    :cond_46
    sget-object v2, La/k81;->a:La/k81;

    .line 621
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_47

    .line 622
    invoke-virtual {v0}, La/m71;->H0()La/ii;

    move-result-object v1

    .line 623
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    const v3, 0x7f1307bb

    .line 624
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v3

    const v4, 0x7f1312e6

    .line 625
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v4

    const v5, 0x7f130e5d

    .line 626
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    sget-object v11, La/n12;->b:La/n12;

    const/4 v12, 0x0

    const/16 v13, 0x5d8

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 628
    const-string v8, "REQUEST_NETWORK_ERROR_DIALOG_KEY"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 629
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 630
    invoke-virtual {v1, v2, v3}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    goto :goto_c

    .line 631
    :cond_47
    sget-object v2, La/v71;->a:La/v71;

    .line 632
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_48

    .line 633
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    move-result-object v1

    .line 634
    const-string v2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    .line 635
    invoke-static {v2}, La/hne;->j(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v2

    .line 636
    const-string v3, "package"

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v19

    invoke-static {v3, v4, v5}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    const/16 v3, 0x22b

    .line 637
    invoke-virtual {v1, v2, v3}, La/agd;->startActivityForResult(Landroid/content/Intent;I)V

    goto :goto_c

    .line 638
    :cond_48
    sget-object v2, La/u71;->a:La/u71;

    .line 639
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_49

    .line 640
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    move-result-object v1

    invoke-virtual {v1, v4}, Landroid/app/Activity;->setRequestedOrientation(I)V

    goto :goto_c

    .line 641
    :cond_49
    sget-object v2, La/s81;->a:La/s81;

    .line 642
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4a

    .line 643
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v1, v2}, Landroid/app/Activity;->setRequestedOrientation(I)V

    .line 644
    :cond_4a
    :goto_c
    invoke-virtual {v0}, La/m71;->J0()La/k3t0;

    move-result-object v0

    sget-object v1, La/r61;->a:La/r61;

    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 645
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 646
    :pswitch_1b
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 647
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n21;

    .line 648
    invoke-virtual {v0, v1}, La/n21;->R(Ljava/lang/Throwable;)V

    .line 649
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

    .line 650
    :pswitch_1c
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Throwable;

    .line 651
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    check-cast v0, La/n21;

    .line 652
    invoke-virtual {v0, v1}, La/n21;->R(Ljava/lang/Throwable;)V

    .line 653
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    return-object v0

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
