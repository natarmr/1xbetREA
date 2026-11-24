.class public final synthetic La/d38;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/d38;->a:B

    iput-object p1, p0, La/d38;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 39

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/d38;->a:B

    .line 4
    .line 5
    const/high16 v5, 0x3f800000    # 1.0f

    .line 6
    .line 7
    const/4 v6, 0x5

    .line 8
    const v7, 0x7f0606da

    .line 9
    .line 10
    .line 11
    const v8, 0x7f0606e1

    .line 12
    .line 13
    .line 14
    const/16 v9, 0x9

    .line 15
    .line 16
    const/4 v10, 0x2

    .line 17
    const/4 v11, 0x1

    .line 18
    const/4 v12, 0x0

    .line 19
    const/4 v13, 0x0

    .line 20
    iget-object v0, v0, La/d38;->b:Ljava/lang/Object;

    .line 21
    .line 22
    packed-switch v1, :pswitch_data_0

    .line 23
    .line 24
    .line 25
    check-cast v0, La/wxa;

    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/jya;

    .line 30
    .line 31
    sget-object v2, La/wxa;->U1:La/kl5;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    instance-of v2, v1, La/gya;

    .line 37
    .line 38
    const-string v3, "actionDialogManager"

    .line 39
    .line 40
    const v4, 0x7f130e5c

    .line 41
    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    iget-object v1, v0, La/wxa;->N1:La/ii;

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 50
    .line 51
    const v2, 0x7f130162

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v15

    .line 58
    const v2, 0x7f130945

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v16

    .line 65
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v17

    .line 69
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    const v2, 0x7f130e07

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v18

    .line 79
    sget-object v23, La/n12;->b:La/n12;

    .line 80
    .line 81
    const/16 v24, 0x0

    .line 82
    .line 83
    const/16 v25, 0x5d0

    .line 84
    .line 85
    const/16 v19, 0x0

    .line 86
    .line 87
    const-string v20, "SAVE_CONFIRMATION_REQUEST_KEY"

    .line 88
    .line 89
    const/16 v21, 0x0

    .line 90
    .line 91
    const/16 v22, 0x0

    .line 92
    .line 93
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1, v14, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 104
    .line 105
    .line 106
    :goto_0
    move-object/from16 v16, v0

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v13

    .line 113
    :cond_1
    instance-of v2, v1, La/hya;

    .line 114
    .line 115
    if-eqz v2, :cond_3

    .line 116
    .line 117
    iget-object v1, v0, La/wxa;->N1:La/ii;

    .line 118
    .line 119
    if-eqz v1, :cond_2

    .line 120
    .line 121
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 122
    .line 123
    const v2, 0x7f130373

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v15

    .line 130
    const v2, 0x7f130946

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v16

    .line 137
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v17

    .line 141
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    sget-object v23, La/n12;->c:La/n12;

    .line 145
    .line 146
    const/16 v24, 0x0

    .line 147
    .line 148
    const/16 v25, 0x5d8

    .line 149
    .line 150
    const/16 v18, 0x0

    .line 151
    .line 152
    const/16 v19, 0x0

    .line 153
    .line 154
    const-string v20, "SAVE_SUCCESS_REQUEST_KEY"

    .line 155
    .line 156
    const/16 v21, 0x0

    .line 157
    .line 158
    const/16 v22, 0x0

    .line 159
    .line 160
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 164
    .line 165
    .line 166
    move-result-object v2

    .line 167
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v14, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 171
    .line 172
    .line 173
    goto :goto_0

    .line 174
    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v13

    .line 178
    :cond_3
    instance-of v2, v1, La/iya;

    .line 179
    .line 180
    if-eqz v2, :cond_5

    .line 181
    .line 182
    check-cast v1, La/iya;

    .line 183
    .line 184
    iget-object v4, v1, La/iya;->a:Ljava/lang/String;

    .line 185
    .line 186
    iget-object v14, v0, La/wxa;->O1:La/wdk0;

    .line 187
    .line 188
    if-eqz v14, :cond_4

    .line 189
    .line 190
    new-instance v15, La/xdk0;

    .line 191
    .line 192
    sget-object v3, La/rek0;->b:La/rek0;

    .line 193
    .line 194
    const/4 v8, 0x0

    .line 195
    const/16 v9, 0x7c

    .line 196
    .line 197
    const/4 v5, 0x0

    .line 198
    const/4 v6, 0x0

    .line 199
    const/4 v7, 0x0

    .line 200
    move-object v2, v15

    .line 201
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 202
    .line 203
    .line 204
    const/16 v20, 0x0

    .line 205
    .line 206
    const/16 v21, 0x3fc

    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    const/16 v18, 0x0

    .line 211
    .line 212
    const/16 v19, 0x0

    .line 213
    .line 214
    move-object/from16 v16, v0

    .line 215
    .line 216
    invoke-static/range {v14 .. v21}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 217
    .line 218
    .line 219
    :goto_1
    invoke-virtual/range {v16 .. v16}, La/wxa;->G0()La/k3t0;

    .line 220
    .line 221
    .line 222
    move-result-object v0

    .line 223
    sget-object v1, La/fxa;->a:La/fxa;

    .line 224
    .line 225
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 226
    .line 227
    .line 228
    sget-object v13, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 229
    .line 230
    goto :goto_2

    .line 231
    :cond_4
    const-string v0, "snackbarManager"

    .line 232
    .line 233
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v13

    .line 237
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 238
    .line 239
    .line 240
    :goto_2
    return-object v13

    .line 241
    :pswitch_0
    check-cast v0, La/xca;

    .line 242
    .line 243
    move-object/from16 v1, p1

    .line 244
    .line 245
    check-cast v1, La/bnk0;

    .line 246
    .line 247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    iget-object v2, v0, La/xca;->m:Ljava/lang/String;

    .line 251
    .line 252
    iget-object v3, v0, La/xca;->r:Ljava/lang/String;

    .line 253
    .line 254
    iget-object v4, v0, La/xca;->k:Ljava/lang/String;

    .line 255
    .line 256
    iget-object v5, v0, La/xca;->j:Ljava/lang/String;

    .line 257
    .line 258
    iget-object v6, v0, La/xca;->o:Ljava/lang/String;

    .line 259
    .line 260
    iget-object v0, v0, La/xca;->n:Ljava/lang/String;

    .line 261
    .line 262
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 263
    .line 264
    .line 265
    move-result v9

    .line 266
    if-nez v9, :cond_6

    .line 267
    .line 268
    move v7, v8

    .line 269
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 270
    .line 271
    .line 272
    move-result v9

    .line 273
    if-lez v9, :cond_7

    .line 274
    .line 275
    invoke-static {v1, v0, v7}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 276
    .line 277
    .line 278
    :cond_7
    invoke-static {v6}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_8

    .line 283
    .line 284
    invoke-static {v1, v6, v7}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 285
    .line 286
    .line 287
    :cond_8
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-lez v0, :cond_9

    .line 292
    .line 293
    invoke-static {v1, v5, v7}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 294
    .line 295
    .line 296
    :cond_9
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    if-lez v0, :cond_a

    .line 301
    .line 302
    invoke-static {v1, v4, v7}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 303
    .line 304
    .line 305
    :cond_a
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 306
    .line 307
    .line 308
    move-result v0

    .line 309
    if-lez v0, :cond_b

    .line 310
    .line 311
    invoke-static {v1, v3, v7}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 312
    .line 313
    .line 314
    :cond_b
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-lez v0, :cond_c

    .line 319
    .line 320
    invoke-static {v1, v2, v8}, La/wha0;->K(La/bnk0;Ljava/lang/String;I)V

    .line 321
    .line 322
    .line 323
    :cond_c
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 324
    .line 325
    return-object v0

    .line 326
    :pswitch_1
    check-cast v0, La/tca;

    .line 327
    .line 328
    move-object/from16 v1, p1

    .line 329
    .line 330
    check-cast v1, La/bnk0;

    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 333
    .line 334
    .line 335
    iget-object v2, v0, La/tca;->g:Ljava/lang/String;

    .line 336
    .line 337
    iget-object v3, v0, La/tca;->j:Ljava/lang/String;

    .line 338
    .line 339
    iget-object v4, v0, La/tca;->e:Ljava/lang/String;

    .line 340
    .line 341
    iget-object v5, v0, La/tca;->d:Ljava/lang/String;

    .line 342
    .line 343
    iget-object v6, v0, La/tca;->h:Ljava/lang/String;

    .line 344
    .line 345
    iget-object v0, v0, La/tca;->f:Ljava/lang/String;

    .line 346
    .line 347
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 348
    .line 349
    .line 350
    move-result v9

    .line 351
    if-nez v9, :cond_d

    .line 352
    .line 353
    move v7, v8

    .line 354
    :cond_d
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 355
    .line 356
    .line 357
    move-result v9

    .line 358
    if-lez v9, :cond_e

    .line 359
    .line 360
    invoke-static {v1, v0, v7}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 361
    .line 362
    .line 363
    :cond_e
    invoke-static {v6}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 364
    .line 365
    .line 366
    move-result v0

    .line 367
    if-nez v0, :cond_f

    .line 368
    .line 369
    invoke-static {v1, v6, v7}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 370
    .line 371
    .line 372
    :cond_f
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 373
    .line 374
    .line 375
    move-result v0

    .line 376
    if-lez v0, :cond_10

    .line 377
    .line 378
    invoke-static {v1, v5, v7}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 379
    .line 380
    .line 381
    :cond_10
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v0

    .line 385
    if-lez v0, :cond_11

    .line 386
    .line 387
    invoke-static {v1, v4, v7}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 388
    .line 389
    .line 390
    :cond_11
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    if-lez v0, :cond_12

    .line 395
    .line 396
    invoke-static {v1, v3, v7}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 397
    .line 398
    .line 399
    :cond_12
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 400
    .line 401
    .line 402
    move-result v0

    .line 403
    if-lez v0, :cond_13

    .line 404
    .line 405
    invoke-static {v1, v2, v8}, La/ju70;->L(La/bnk0;Ljava/lang/String;I)V

    .line 406
    .line 407
    .line 408
    :cond_13
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 409
    .line 410
    return-object v0

    .line 411
    :pswitch_2
    check-cast v0, La/g7z;

    .line 412
    .line 413
    move-object/from16 v1, p1

    .line 414
    .line 415
    check-cast v1, La/fhl;

    .line 416
    .line 417
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 418
    .line 419
    .line 420
    invoke-virtual {v0}, La/g7z;->a()V

    .line 421
    .line 422
    .line 423
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 424
    .line 425
    return-object v0

    .line 426
    :pswitch_3
    check-cast v0, La/yyj0;

    .line 427
    .line 428
    move-object/from16 v1, p1

    .line 429
    .line 430
    check-cast v1, Ljava/lang/Throwable;

    .line 431
    .line 432
    iget-object v0, v0, La/yyj0;->b:La/q99;

    .line 433
    .line 434
    invoke-virtual {v0, v13, v12}, La/q99;->e(Ljava/lang/Throwable;Z)Z

    .line 435
    .line 436
    .line 437
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 438
    .line 439
    return-object v0

    .line 440
    :pswitch_4
    check-cast v0, La/rrd;

    .line 441
    .line 442
    move-object/from16 v1, p1

    .line 443
    .line 444
    check-cast v1, La/x1a;

    .line 445
    .line 446
    iget-object v1, v1, La/x1a;->a:La/rrd;

    .line 447
    .line 448
    if-eq v1, v0, :cond_14

    .line 449
    .line 450
    move v11, v12

    .line 451
    :cond_14
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 452
    .line 453
    .line 454
    move-result-object v0

    .line 455
    return-object v0

    .line 456
    :pswitch_5
    check-cast v0, La/gu9;

    .line 457
    .line 458
    move-object/from16 v1, p1

    .line 459
    .line 460
    check-cast v1, Ljava/lang/Throwable;

    .line 461
    .line 462
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 463
    .line 464
    .line 465
    iget-object v1, v0, La/gu9;->o:La/ctf0;

    .line 466
    .line 467
    new-array v2, v12, [Ljava/lang/Object;

    .line 468
    .line 469
    iget-object v1, v1, La/ctf0;->b:La/lsm0;

    .line 470
    .line 471
    invoke-static {v2, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    const v3, 0x7f1307cf

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1, v3, v2}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v1

    .line 482
    new-instance v2, La/au9;

    .line 483
    .line 484
    invoke-direct {v2, v1}, La/au9;-><init>(Ljava/lang/String;)V

    .line 485
    .line 486
    .line 487
    invoke-virtual {v0, v2}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 491
    .line 492
    return-object v0

    .line 493
    :pswitch_6
    check-cast v0, La/w6q0;

    .line 494
    .line 495
    move-object/from16 v1, p1

    .line 496
    .line 497
    check-cast v1, La/cp;

    .line 498
    .line 499
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 500
    .line 501
    .line 502
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 503
    .line 504
    check-cast v2, La/ksx;

    .line 505
    .line 506
    iget-object v2, v2, La/ksx;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 507
    .line 508
    new-instance v3, La/wg;

    .line 509
    .line 510
    const/4 v4, 0x6

    .line 511
    invoke-direct {v3, v0, v1, v4}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 515
    .line 516
    .line 517
    new-instance v0, La/rn5;

    .line 518
    .line 519
    invoke-direct {v0, v1, v10}, La/rn5;-><init>(La/cp;B)V

    .line 520
    .line 521
    .line 522
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 523
    .line 524
    .line 525
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 526
    .line 527
    return-object v0

    .line 528
    :pswitch_7
    check-cast v0, Lokhttp3/Request;

    .line 529
    .line 530
    move-object/from16 v1, p1

    .line 531
    .line 532
    check-cast v1, Ljava/lang/String;

    .line 533
    .line 534
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    iget-object v0, v0, Lokhttp3/Request;->c:Lokhttp3/Headers;

    .line 538
    .line 539
    invoke-virtual {v0, v1}, Lokhttp3/Headers;->b(Ljava/lang/String;)Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v0

    .line 543
    if-nez v0, :cond_15

    .line 544
    .line 545
    const-string v0, ""

    .line 546
    .line 547
    :cond_15
    return-object v0

    .line 548
    :pswitch_8
    check-cast v0, La/gr00;

    .line 549
    .line 550
    move-object/from16 v1, p1

    .line 551
    .line 552
    check-cast v1, Ljava/lang/Throwable;

    .line 553
    .line 554
    iget-object v0, v0, La/gr00;->b:Ljava/lang/Object;

    .line 555
    .line 556
    check-cast v0, La/qoj0;

    .line 557
    .line 558
    invoke-virtual {v0, v13}, La/qoj0;->g(Ljava/lang/Object;)Z

    .line 559
    .line 560
    .line 561
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 562
    .line 563
    return-object v0

    .line 564
    :pswitch_9
    move-object v1, v0

    .line 565
    check-cast v1, La/ab9;

    .line 566
    .line 567
    move-object/from16 v0, p1

    .line 568
    .line 569
    check-cast v0, Ljava/lang/Throwable;

    .line 570
    .line 571
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 572
    .line 573
    .line 574
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 575
    .line 576
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 577
    .line 578
    :cond_16
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 579
    .line 580
    .line 581
    move-result-object v0

    .line 582
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 583
    .line 584
    .line 585
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 586
    .line 587
    move-object v4, v0

    .line 588
    check-cast v4, La/pa9;

    .line 589
    .line 590
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 591
    .line 592
    .line 593
    const/4 v13, 0x0

    .line 594
    const/16 v14, 0xf7

    .line 595
    .line 596
    const/4 v5, 0x0

    .line 597
    const/4 v6, 0x0

    .line 598
    const/4 v7, 0x0

    .line 599
    const/4 v8, 0x1

    .line 600
    const/4 v9, 0x0

    .line 601
    const/4 v10, 0x0

    .line 602
    const/4 v11, 0x0

    .line 603
    const/4 v12, 0x0

    .line 604
    invoke-static/range {v4 .. v14}, La/pa9;->a(La/pa9;Ljava/util/List;Ljava/util/ArrayList;La/rvm0;ZLjava/util/List;Ljava/util/List;La/wdn;La/l9s;ZI)La/pa9;

    .line 605
    .line 606
    .line 607
    move-result-object v3

    .line 608
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 609
    .line 610
    .line 611
    move-result v0

    .line 612
    if-eqz v0, :cond_16

    .line 613
    .line 614
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_a
    check-cast v0, Landroidx/media3/exoplayer/ExoPlayer;

    .line 618
    .line 619
    move-object/from16 v1, p1

    .line 620
    .line 621
    check-cast v1, La/lwk;

    .line 622
    .line 623
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    new-instance v1, La/ty2;

    .line 627
    .line 628
    invoke-direct {v1, v0, v6}, La/ty2;-><init>(Ljava/lang/Object;B)V

    .line 629
    .line 630
    .line 631
    return-object v1

    .line 632
    :pswitch_b
    move-object v1, v0

    .line 633
    check-cast v1, La/k69;

    .line 634
    .line 635
    move-object/from16 v0, p1

    .line 636
    .line 637
    check-cast v0, Ljava/lang/Throwable;

    .line 638
    .line 639
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 640
    .line 641
    .line 642
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 643
    .line 644
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 645
    .line 646
    :cond_17
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 647
    .line 648
    .line 649
    move-result-object v0

    .line 650
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 651
    .line 652
    .line 653
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 654
    .line 655
    move-object v4, v0

    .line 656
    check-cast v4, La/z59;

    .line 657
    .line 658
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    const/4 v14, 0x0

    .line 662
    const v15, 0x7f7df

    .line 663
    .line 664
    .line 665
    const/4 v5, 0x0

    .line 666
    const/4 v6, 0x0

    .line 667
    const/4 v7, 0x0

    .line 668
    const/4 v8, 0x0

    .line 669
    const/4 v9, 0x0

    .line 670
    const/4 v10, 0x0

    .line 671
    const/4 v11, 0x1

    .line 672
    const/4 v12, 0x0

    .line 673
    const/4 v13, 0x0

    .line 674
    invoke-static/range {v4 .. v15}, La/z59;->a(La/z59;Ljava/lang/String;ZZZZLa/hl90;ZZLjava/lang/String;Ljava/lang/String;I)La/z59;

    .line 675
    .line 676
    .line 677
    move-result-object v3

    .line 678
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 679
    .line 680
    .line 681
    move-result v0

    .line 682
    if-eqz v0, :cond_17

    .line 683
    .line 684
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 685
    .line 686
    return-object v0

    .line 687
    :pswitch_c
    check-cast v0, La/l49;

    .line 688
    .line 689
    move-object/from16 v1, p1

    .line 690
    .line 691
    check-cast v1, Ljava/lang/Integer;

    .line 692
    .line 693
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 694
    .line 695
    .line 696
    move-result v1

    .line 697
    check-cast v0, La/j49;

    .line 698
    .line 699
    iget-object v2, v0, La/j49;->d:La/a4x;

    .line 700
    .line 701
    invoke-static {v1, v2}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 702
    .line 703
    .line 704
    move-result-object v1

    .line 705
    check-cast v1, La/i49;

    .line 706
    .line 707
    if-nez v1, :cond_18

    .line 708
    .line 709
    iget-object v0, v0, La/j49;->d:La/a4x;

    .line 710
    .line 711
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 712
    .line 713
    .line 714
    move-result-object v0

    .line 715
    move-object v1, v0

    .line 716
    check-cast v1, La/i49;

    .line 717
    .line 718
    :cond_18
    if-eqz v1, :cond_1a

    .line 719
    .line 720
    instance-of v0, v1, La/g49;

    .line 721
    .line 722
    if-eqz v0, :cond_19

    .line 723
    .line 724
    check-cast v1, La/g49;

    .line 725
    .line 726
    iget-object v13, v1, La/g49;->a:Ljava/lang/String;

    .line 727
    .line 728
    goto :goto_3

    .line 729
    :cond_19
    instance-of v0, v1, La/h49;

    .line 730
    .line 731
    if-eqz v0, :cond_1a

    .line 732
    .line 733
    check-cast v1, La/h49;

    .line 734
    .line 735
    iget-object v13, v1, La/h49;->a:Ljava/lang/String;

    .line 736
    .line 737
    goto :goto_3

    .line 738
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 739
    .line 740
    .line 741
    :goto_3
    return-object v13

    .line 742
    :pswitch_d
    check-cast v0, La/a39;

    .line 743
    .line 744
    move-object/from16 v1, p1

    .line 745
    .line 746
    check-cast v1, La/jge0;

    .line 747
    .line 748
    iget-boolean v2, v0, La/lm40;->n:Z

    .line 749
    .line 750
    if-eqz v2, :cond_1b

    .line 751
    .line 752
    invoke-virtual {v0}, La/lm40;->N0()La/vne;

    .line 753
    .line 754
    .line 755
    move-result-object v2

    .line 756
    new-instance v3, La/d09;

    .line 757
    .line 758
    const/4 v4, 0x4

    .line 759
    invoke-direct {v3, v0, v1, v13, v4}, La/d09;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 760
    .line 761
    .line 762
    const/4 v0, 0x3

    .line 763
    invoke-static {v2, v13, v13, v3, v0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 764
    .line 765
    .line 766
    :cond_1b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 767
    .line 768
    return-object v0

    .line 769
    :pswitch_e
    check-cast v0, La/b09;

    .line 770
    .line 771
    move-object/from16 v1, p1

    .line 772
    .line 773
    check-cast v1, Ljava/util/Set;

    .line 774
    .line 775
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 776
    .line 777
    .line 778
    new-instance v2, La/rqm;

    .line 779
    .line 780
    new-instance v3, La/tui0;

    .line 781
    .line 782
    iget-object v0, v0, La/b09;->b:La/ctf0;

    .line 783
    .line 784
    new-array v4, v12, [Ljava/lang/Object;

    .line 785
    .line 786
    iget-object v0, v0, La/ctf0;->b:La/lsm0;

    .line 787
    .line 788
    invoke-static {v4, v12}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 789
    .line 790
    .line 791
    move-result-object v4

    .line 792
    const v5, 0x7f1300ea

    .line 793
    .line 794
    .line 795
    invoke-virtual {v0, v5, v4}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 796
    .line 797
    .line 798
    move-result-object v0

    .line 799
    sget-object v4, La/s6t0;->a:La/pz40;

    .line 800
    .line 801
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 802
    .line 803
    .line 804
    move-result-object v4

    .line 805
    iget-object v4, v4, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 806
    .line 807
    invoke-virtual {v4}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 808
    .line 809
    .line 810
    move-result-wide v4

    .line 811
    new-instance v6, La/y3d;

    .line 812
    .line 813
    invoke-direct {v6, v4, v5}, La/y3d;-><init>(J)V

    .line 814
    .line 815
    .line 816
    invoke-direct {v3, v0, v6}, La/tui0;-><init>(Ljava/lang/String;La/y3d;)V

    .line 817
    .line 818
    .line 819
    new-instance v5, La/lvi0;

    .line 820
    .line 821
    sget-object v0, La/tc00;->a:La/tc00;

    .line 822
    .line 823
    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    .line 824
    .line 825
    .line 826
    move-result v1

    .line 827
    invoke-direct {v5, v0, v1}, La/lvi0;-><init>(La/uc00;Z)V

    .line 828
    .line 829
    .line 830
    sget-object v6, La/d4d;->B:La/d4d;

    .line 831
    .line 832
    sget-object v8, La/wui0;->a:La/wui0;

    .line 833
    .line 834
    const/4 v10, 0x0

    .line 835
    const/16 v11, 0x1aa

    .line 836
    .line 837
    const/4 v4, 0x0

    .line 838
    const/4 v7, 0x0

    .line 839
    const/4 v9, 0x0

    .line 840
    invoke-direct/range {v2 .. v11}, La/rqm;-><init>(La/vui0;La/pui0;La/pvi0;La/d4d;La/tvi0;La/wui0;ZLa/e900;I)V

    .line 841
    .line 842
    .line 843
    return-object v2

    .line 844
    :pswitch_f
    move-object v1, v0

    .line 845
    check-cast v1, La/pw8;

    .line 846
    .line 847
    move-object/from16 v0, p1

    .line 848
    .line 849
    check-cast v0, Ljava/lang/Throwable;

    .line 850
    .line 851
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v2, v1, La/pw8;->o:La/duj;

    .line 855
    .line 856
    new-instance v3, La/yr0;

    .line 857
    .line 858
    invoke-direct {v3, v0, v9}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v2, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 862
    .line 863
    .line 864
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 865
    .line 866
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 867
    .line 868
    :cond_1c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 869
    .line 870
    .line 871
    move-result-object v0

    .line 872
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 876
    .line 877
    move-object v4, v0

    .line 878
    check-cast v4, La/jw8;

    .line 879
    .line 880
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    .line 882
    .line 883
    sget-object v3, La/sx8;->a:La/sx8;

    .line 884
    .line 885
    const/16 v5, 0x1b

    .line 886
    .line 887
    invoke-static {v4, v3, v13, v5}, La/jw8;->a(La/jw8;La/ux8;La/vw8;I)La/jw8;

    .line 888
    .line 889
    .line 890
    move-result-object v3

    .line 891
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 892
    .line 893
    .line 894
    move-result v0

    .line 895
    if-eqz v0, :cond_1c

    .line 896
    .line 897
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 898
    .line 899
    return-object v0

    .line 900
    :pswitch_10
    check-cast v0, La/et8;

    .line 901
    .line 902
    move-object/from16 v1, p1

    .line 903
    .line 904
    check-cast v1, La/ne60;

    .line 905
    .line 906
    iget-object v0, v0, La/et8;->b:La/zr8;

    .line 907
    .line 908
    if-eqz v0, :cond_1d

    .line 909
    .line 910
    invoke-virtual {v0}, La/zr8;->m()V

    .line 911
    .line 912
    .line 913
    iget v1, v0, La/zr8;->L:I

    .line 914
    .line 915
    iput v1, v0, La/zr8;->x:I

    .line 916
    .line 917
    iput-boolean v11, v0, La/zr8;->J:Z

    .line 918
    .line 919
    :cond_1d
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 920
    .line 921
    return-object v0

    .line 922
    :pswitch_11
    check-cast v0, La/bn8;

    .line 923
    .line 924
    move-object/from16 v1, p1

    .line 925
    .line 926
    check-cast v1, La/pi9;

    .line 927
    .line 928
    iget v7, v0, La/bn8;->r:F

    .line 929
    .line 930
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 931
    .line 932
    .line 933
    move-result v8

    .line 934
    mul-float/2addr v8, v7

    .line 935
    const/4 v7, 0x0

    .line 936
    cmpl-float v8, v8, v7

    .line 937
    .line 938
    if-ltz v8, :cond_3a

    .line 939
    .line 940
    iget-object v8, v1, La/pi9;->a:La/y99;

    .line 941
    .line 942
    invoke-interface {v8}, La/y99;->d()J

    .line 943
    .line 944
    .line 945
    move-result-wide v14

    .line 946
    invoke-static {v14, v15}, La/h7k0;->d(J)F

    .line 947
    .line 948
    .line 949
    move-result v8

    .line 950
    cmpl-float v8, v8, v7

    .line 951
    .line 952
    if-lez v8, :cond_3a

    .line 953
    .line 954
    iget v8, v0, La/bn8;->r:F

    .line 955
    .line 956
    invoke-static {v8, v7}, La/ycl;->b(FF)Z

    .line 957
    .line 958
    .line 959
    move-result v7

    .line 960
    if-eqz v7, :cond_1e

    .line 961
    .line 962
    move v7, v5

    .line 963
    goto :goto_4

    .line 964
    :cond_1e
    iget v7, v0, La/bn8;->r:F

    .line 965
    .line 966
    invoke-virtual {v1}, La/pi9;->getDensity()F

    .line 967
    .line 968
    .line 969
    move-result v8

    .line 970
    mul-float/2addr v8, v7

    .line 971
    float-to-double v7, v8

    .line 972
    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    .line 973
    .line 974
    .line 975
    move-result-wide v7

    .line 976
    double-to-float v7, v7

    .line 977
    :goto_4
    iget-object v8, v1, La/pi9;->a:La/y99;

    .line 978
    .line 979
    invoke-interface {v8}, La/y99;->d()J

    .line 980
    .line 981
    .line 982
    move-result-wide v14

    .line 983
    invoke-static {v14, v15}, La/h7k0;->d(J)F

    .line 984
    .line 985
    .line 986
    move-result v8

    .line 987
    const/high16 v10, 0x40000000    # 2.0f

    .line 988
    .line 989
    div-float/2addr v8, v10

    .line 990
    float-to-double v14, v8

    .line 991
    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    .line 992
    .line 993
    .line 994
    move-result-wide v14

    .line 995
    double-to-float v8, v14

    .line 996
    invoke-static {v7, v8}, Ljava/lang/Math;->min(FF)F

    .line 997
    .line 998
    .line 999
    move-result v15

    .line 1000
    div-float v7, v15, v10

    .line 1001
    .line 1002
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1003
    .line 1004
    .line 1005
    move-result v8

    .line 1006
    const/16 v14, 0x20

    .line 1007
    .line 1008
    const-wide v16, 0xffffffffL

    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    int-to-long v2, v8

    .line 1014
    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1015
    .line 1016
    .line 1017
    move-result v4

    .line 1018
    move/from16 p0, v14

    .line 1019
    .line 1020
    move/from16 v20, v15

    .line 1021
    .line 1022
    int-to-long v14, v4

    .line 1023
    shl-long v2, v2, p0

    .line 1024
    .line 1025
    and-long v14, v14, v16

    .line 1026
    .line 1027
    or-long v21, v2, v14

    .line 1028
    .line 1029
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 1030
    .line 1031
    invoke-interface {v2}, La/y99;->d()J

    .line 1032
    .line 1033
    .line 1034
    move-result-wide v2

    .line 1035
    shr-long v2, v2, p0

    .line 1036
    .line 1037
    long-to-int v2, v2

    .line 1038
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1039
    .line 1040
    .line 1041
    move-result v2

    .line 1042
    sub-float v2, v2, v20

    .line 1043
    .line 1044
    iget-object v3, v1, La/pi9;->a:La/y99;

    .line 1045
    .line 1046
    invoke-interface {v3}, La/y99;->d()J

    .line 1047
    .line 1048
    .line 1049
    move-result-wide v3

    .line 1050
    and-long v3, v3, v16

    .line 1051
    .line 1052
    long-to-int v3, v3

    .line 1053
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1054
    .line 1055
    .line 1056
    move-result v3

    .line 1057
    sub-float v3, v3, v20

    .line 1058
    .line 1059
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1060
    .line 1061
    .line 1062
    move-result v2

    .line 1063
    int-to-long v14, v2

    .line 1064
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 1065
    .line 1066
    .line 1067
    move-result v2

    .line 1068
    int-to-long v2, v2

    .line 1069
    shl-long v14, v14, p0

    .line 1070
    .line 1071
    and-long v2, v2, v16

    .line 1072
    .line 1073
    or-long v23, v14, v2

    .line 1074
    .line 1075
    mul-float v26, v20, v10

    .line 1076
    .line 1077
    iget-object v2, v1, La/pi9;->a:La/y99;

    .line 1078
    .line 1079
    invoke-interface {v2}, La/y99;->d()J

    .line 1080
    .line 1081
    .line 1082
    move-result-wide v2

    .line 1083
    invoke-static {v2, v3}, La/h7k0;->d(J)F

    .line 1084
    .line 1085
    .line 1086
    move-result v2

    .line 1087
    cmpl-float v2, v26, v2

    .line 1088
    .line 1089
    if-lez v2, :cond_1f

    .line 1090
    .line 1091
    move v2, v11

    .line 1092
    goto :goto_5

    .line 1093
    :cond_1f
    move v2, v12

    .line 1094
    :goto_5
    iget-object v3, v0, La/bn8;->t:La/yjj0;

    .line 1095
    .line 1096
    iget-object v4, v1, La/pi9;->a:La/y99;

    .line 1097
    .line 1098
    invoke-interface {v4}, La/y99;->d()J

    .line 1099
    .line 1100
    .line 1101
    move-result-wide v14

    .line 1102
    iget-object v4, v1, La/pi9;->a:La/y99;

    .line 1103
    .line 1104
    invoke-interface {v4}, La/y99;->getLayoutDirection()La/k6z;

    .line 1105
    .line 1106
    .line 1107
    move-result-object v4

    .line 1108
    invoke-interface {v3, v14, v15, v4, v1}, La/yjj0;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v3

    .line 1112
    instance-of v4, v3, La/ne80;

    .line 1113
    .line 1114
    if-eqz v4, :cond_30

    .line 1115
    .line 1116
    iget-object v4, v0, La/bn8;->s:La/skk0;

    .line 1117
    .line 1118
    check-cast v3, La/ne80;

    .line 1119
    .line 1120
    iget-object v7, v3, La/ne80;->a:La/w03;

    .line 1121
    .line 1122
    if-eqz v2, :cond_20

    .line 1123
    .line 1124
    new-instance v0, La/op7;

    .line 1125
    .line 1126
    const/16 v2, 0xa

    .line 1127
    .line 1128
    invoke-direct {v0, v3, v4, v2}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1129
    .line 1130
    .line 1131
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1132
    .line 1133
    .line 1134
    move-result-object v13

    .line 1135
    goto/16 :goto_11

    .line 1136
    .line 1137
    :cond_20
    if-eqz v4, :cond_21

    .line 1138
    .line 1139
    iget-wide v8, v4, La/skk0;->a:J

    .line 1140
    .line 1141
    invoke-static {v5, v8, v9}, La/y3d;->c(FJ)J

    .line 1142
    .line 1143
    .line 1144
    move-result-wide v8

    .line 1145
    new-instance v2, La/m78;

    .line 1146
    .line 1147
    invoke-direct {v2, v8, v9, v6}, La/m78;-><init>(JI)V

    .line 1148
    .line 1149
    .line 1150
    move-object/from16 v23, v2

    .line 1151
    .line 1152
    move v2, v11

    .line 1153
    goto :goto_6

    .line 1154
    :cond_21
    move v2, v12

    .line 1155
    move-object/from16 v23, v13

    .line 1156
    .line 1157
    :goto_6
    invoke-virtual {v7}, La/w03;->d()La/jge0;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v6

    .line 1161
    iget v8, v6, La/jge0;->b:F

    .line 1162
    .line 1163
    iget v9, v6, La/jge0;->a:F

    .line 1164
    .line 1165
    iget-object v10, v0, La/bn8;->q:La/xm8;

    .line 1166
    .line 1167
    if-nez v10, :cond_22

    .line 1168
    .line 1169
    new-instance v10, La/xm8;

    .line 1170
    .line 1171
    invoke-direct {v10}, La/xm8;-><init>()V

    .line 1172
    .line 1173
    .line 1174
    iput-object v10, v0, La/bn8;->q:La/xm8;

    .line 1175
    .line 1176
    :cond_22
    iget-object v14, v10, La/xm8;->d:La/w03;

    .line 1177
    .line 1178
    if-nez v14, :cond_23

    .line 1179
    .line 1180
    invoke-static {}, La/z03;->a()La/w03;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v14

    .line 1184
    iput-object v14, v10, La/xm8;->d:La/w03;

    .line 1185
    .line 1186
    :cond_23
    invoke-virtual {v14}, La/w03;->h()V

    .line 1187
    .line 1188
    .line 1189
    sget-object v10, La/x190;->a:La/x190;

    .line 1190
    .line 1191
    iget v15, v6, La/jge0;->a:F

    .line 1192
    .line 1193
    move/from16 v18, v5

    .line 1194
    .line 1195
    iget v5, v6, La/jge0;->d:F

    .line 1196
    .line 1197
    iget v13, v6, La/jge0;->c:F

    .line 1198
    .line 1199
    iget v11, v6, La/jge0;->b:F

    .line 1200
    .line 1201
    invoke-static {v15}, Ljava/lang/Float;->isNaN(F)Z

    .line 1202
    .line 1203
    .line 1204
    move-result v20

    .line 1205
    if-nez v20, :cond_24

    .line 1206
    .line 1207
    invoke-static {v11}, Ljava/lang/Float;->isNaN(F)Z

    .line 1208
    .line 1209
    .line 1210
    move-result v20

    .line 1211
    if-nez v20, :cond_24

    .line 1212
    .line 1213
    invoke-static {v13}, Ljava/lang/Float;->isNaN(F)Z

    .line 1214
    .line 1215
    .line 1216
    move-result v20

    .line 1217
    if-nez v20, :cond_24

    .line 1218
    .line 1219
    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    .line 1220
    .line 1221
    .line 1222
    move-result v20

    .line 1223
    if-eqz v20, :cond_25

    .line 1224
    .line 1225
    :cond_24
    const-string v20, "Invalid rectangle, make sure no value is NaN"

    .line 1226
    .line 1227
    invoke-static/range {v20 .. v20}, La/z03;->b(Ljava/lang/String;)V

    .line 1228
    .line 1229
    .line 1230
    :cond_25
    iget-object v12, v14, La/w03;->b:Landroid/graphics/RectF;

    .line 1231
    .line 1232
    if-nez v12, :cond_26

    .line 1233
    .line 1234
    new-instance v12, Landroid/graphics/RectF;

    .line 1235
    .line 1236
    invoke-direct {v12}, Landroid/graphics/RectF;-><init>()V

    .line 1237
    .line 1238
    .line 1239
    iput-object v12, v14, La/w03;->b:Landroid/graphics/RectF;

    .line 1240
    .line 1241
    :cond_26
    invoke-virtual {v12, v15, v11, v13, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 1242
    .line 1243
    .line 1244
    iget-object v5, v14, La/w03;->a:Landroid/graphics/Path;

    .line 1245
    .line 1246
    iget-object v11, v14, La/w03;->b:Landroid/graphics/RectF;

    .line 1247
    .line 1248
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1249
    .line 1250
    .line 1251
    invoke-static {v10}, La/z03;->c(La/x190;)Landroid/graphics/Path$Direction;

    .line 1252
    .line 1253
    .line 1254
    move-result-object v10

    .line 1255
    invoke-virtual {v5, v11, v10}, Landroid/graphics/Path;->addRect(Landroid/graphics/RectF;Landroid/graphics/Path$Direction;)V

    .line 1256
    .line 1257
    .line 1258
    const/4 v5, 0x0

    .line 1259
    invoke-virtual {v14, v14, v7, v5}, La/w03;->g(La/w03;La/w03;I)Z

    .line 1260
    .line 1261
    .line 1262
    new-instance v5, La/mie0;

    .line 1263
    .line 1264
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1265
    .line 1266
    .line 1267
    iget v7, v6, La/jge0;->c:F

    .line 1268
    .line 1269
    sub-float/2addr v7, v9

    .line 1270
    float-to-double v10, v7

    .line 1271
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1272
    .line 1273
    .line 1274
    move-result-wide v10

    .line 1275
    double-to-float v7, v10

    .line 1276
    float-to-int v7, v7

    .line 1277
    iget v10, v6, La/jge0;->d:F

    .line 1278
    .line 1279
    sub-float/2addr v10, v8

    .line 1280
    float-to-double v10, v10

    .line 1281
    invoke-static {v10, v11}, Ljava/lang/Math;->ceil(D)D

    .line 1282
    .line 1283
    .line 1284
    move-result-wide v10

    .line 1285
    double-to-float v10, v10

    .line 1286
    float-to-int v10, v10

    .line 1287
    int-to-long v11, v7

    .line 1288
    shl-long v11, v11, p0

    .line 1289
    .line 1290
    move-object/from16 p1, v6

    .line 1291
    .line 1292
    int-to-long v6, v10

    .line 1293
    and-long v6, v6, v16

    .line 1294
    .line 1295
    or-long v21, v11, v6

    .line 1296
    .line 1297
    iget-object v0, v0, La/bn8;->q:La/xm8;

    .line 1298
    .line 1299
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    iget-object v6, v0, La/xm8;->a:La/vz2;

    .line 1303
    .line 1304
    iget-object v7, v0, La/xm8;->b:La/uw2;

    .line 1305
    .line 1306
    if-eqz v6, :cond_27

    .line 1307
    .line 1308
    invoke-virtual {v6}, La/vz2;->a()I

    .line 1309
    .line 1310
    .line 1311
    move-result v10

    .line 1312
    new-instance v11, La/zyw;

    .line 1313
    .line 1314
    invoke-direct {v11, v10}, La/zyw;-><init>(I)V

    .line 1315
    .line 1316
    .line 1317
    goto :goto_7

    .line 1318
    :cond_27
    const/4 v11, 0x0

    .line 1319
    :goto_7
    if-nez v11, :cond_28

    .line 1320
    .line 1321
    goto :goto_8

    .line 1322
    :cond_28
    iget v10, v11, La/zyw;->a:I

    .line 1323
    .line 1324
    if-nez v10, :cond_29

    .line 1325
    .line 1326
    goto :goto_b

    .line 1327
    :cond_29
    :goto_8
    if-eqz v6, :cond_2a

    .line 1328
    .line 1329
    invoke-virtual {v6}, La/vz2;->a()I

    .line 1330
    .line 1331
    .line 1332
    move-result v10

    .line 1333
    new-instance v13, La/zyw;

    .line 1334
    .line 1335
    invoke-direct {v13, v10}, La/zyw;-><init>(I)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_9

    .line 1339
    :cond_2a
    const/4 v13, 0x0

    .line 1340
    :goto_9
    if-nez v13, :cond_2b

    .line 1341
    .line 1342
    goto :goto_a

    .line 1343
    :cond_2b
    iget v10, v13, La/zyw;->a:I

    .line 1344
    .line 1345
    if-eq v2, v10, :cond_2c

    .line 1346
    .line 1347
    :goto_a
    const/4 v11, 0x0

    .line 1348
    goto :goto_c

    .line 1349
    :cond_2c
    :goto_b
    const/4 v11, 0x1

    .line 1350
    :goto_c
    if-eqz v6, :cond_2e

    .line 1351
    .line 1352
    if-eqz v7, :cond_2e

    .line 1353
    .line 1354
    iget-object v10, v1, La/pi9;->a:La/y99;

    .line 1355
    .line 1356
    invoke-interface {v10}, La/y99;->d()J

    .line 1357
    .line 1358
    .line 1359
    move-result-wide v12

    .line 1360
    shr-long v12, v12, p0

    .line 1361
    .line 1362
    long-to-int v10, v12

    .line 1363
    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1364
    .line 1365
    .line 1366
    move-result v10

    .line 1367
    iget-object v12, v6, La/vz2;->a:Landroid/graphics/Bitmap;

    .line 1368
    .line 1369
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getWidth()I

    .line 1370
    .line 1371
    .line 1372
    move-result v13

    .line 1373
    int-to-float v13, v13

    .line 1374
    cmpl-float v10, v10, v13

    .line 1375
    .line 1376
    if-gtz v10, :cond_2e

    .line 1377
    .line 1378
    iget-object v10, v1, La/pi9;->a:La/y99;

    .line 1379
    .line 1380
    invoke-interface {v10}, La/y99;->d()J

    .line 1381
    .line 1382
    .line 1383
    move-result-wide v19

    .line 1384
    move-object v10, v6

    .line 1385
    move-object v13, v7

    .line 1386
    and-long v6, v19, v16

    .line 1387
    .line 1388
    long-to-int v6, v6

    .line 1389
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1390
    .line 1391
    .line 1392
    move-result v6

    .line 1393
    invoke-virtual {v12}, Landroid/graphics/Bitmap;->getHeight()I

    .line 1394
    .line 1395
    .line 1396
    move-result v7

    .line 1397
    int-to-float v7, v7

    .line 1398
    cmpl-float v6, v6, v7

    .line 1399
    .line 1400
    if-gtz v6, :cond_2e

    .line 1401
    .line 1402
    if-nez v11, :cond_2d

    .line 1403
    .line 1404
    goto :goto_d

    .line 1405
    :cond_2d
    move-object v6, v10

    .line 1406
    move-object v7, v13

    .line 1407
    goto :goto_e

    .line 1408
    :cond_2e
    :goto_d
    shr-long v6, v21, p0

    .line 1409
    .line 1410
    long-to-int v6, v6

    .line 1411
    and-long v10, v21, v16

    .line 1412
    .line 1413
    long-to-int v7, v10

    .line 1414
    invoke-static {v6, v7, v2}, La/azw;->c(III)La/vz2;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v6

    .line 1418
    iput-object v6, v0, La/xm8;->a:La/vz2;

    .line 1419
    .line 1420
    invoke-static {v6}, La/vw2;->a(La/vz2;)La/uw2;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v7

    .line 1424
    iput-object v7, v0, La/xm8;->b:La/uw2;

    .line 1425
    .line 1426
    :goto_e
    iget-object v2, v0, La/xm8;->c:La/a6a;

    .line 1427
    .line 1428
    if-nez v2, :cond_2f

    .line 1429
    .line 1430
    new-instance v2, La/a6a;

    .line 1431
    .line 1432
    invoke-direct {v2}, La/a6a;-><init>()V

    .line 1433
    .line 1434
    .line 1435
    iput-object v2, v0, La/xm8;->c:La/a6a;

    .line 1436
    .line 1437
    :cond_2f
    iget-object v10, v2, La/a6a;->b:La/nr;

    .line 1438
    .line 1439
    iget-object v0, v2, La/a6a;->a:La/z5a;

    .line 1440
    .line 1441
    invoke-static/range {v21 .. v22}, La/n2x;->Q(J)J

    .line 1442
    .line 1443
    .line 1444
    move-result-wide v11

    .line 1445
    iget-object v13, v1, La/pi9;->a:La/y99;

    .line 1446
    .line 1447
    invoke-interface {v13}, La/y99;->getLayoutDirection()La/k6z;

    .line 1448
    .line 1449
    .line 1450
    move-result-object v13

    .line 1451
    iget-object v15, v0, La/z5a;->a:La/w6k;

    .line 1452
    .line 1453
    move-object/from16 v27, v2

    .line 1454
    .line 1455
    iget-object v2, v0, La/z5a;->b:La/k6z;

    .line 1456
    .line 1457
    move-object/from16 v20, v4

    .line 1458
    .line 1459
    iget-object v4, v0, La/z5a;->c:La/x5a;

    .line 1460
    .line 1461
    move-object/from16 v24, v5

    .line 1462
    .line 1463
    move-object/from16 v19, v6

    .line 1464
    .line 1465
    iget-wide v5, v0, La/z5a;->d:J

    .line 1466
    .line 1467
    iput-object v1, v0, La/z5a;->a:La/w6k;

    .line 1468
    .line 1469
    iput-object v13, v0, La/z5a;->b:La/k6z;

    .line 1470
    .line 1471
    iput-object v7, v0, La/z5a;->c:La/x5a;

    .line 1472
    .line 1473
    iput-wide v11, v0, La/z5a;->d:J

    .line 1474
    .line 1475
    invoke-virtual {v7}, La/uw2;->l()V

    .line 1476
    .line 1477
    .line 1478
    sget-wide v28, La/y3d;->b:J

    .line 1479
    .line 1480
    const/16 v37, 0x0

    .line 1481
    .line 1482
    const/16 v38, 0x3a

    .line 1483
    .line 1484
    const-wide/16 v30, 0x0

    .line 1485
    .line 1486
    const/16 v34, 0x0

    .line 1487
    .line 1488
    const/16 v35, 0x0

    .line 1489
    .line 1490
    const/16 v36, 0x0

    .line 1491
    .line 1492
    move-wide/from16 v32, v11

    .line 1493
    .line 1494
    invoke-static/range {v27 .. v38}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 1495
    .line 1496
    .line 1497
    move-object/from16 v11, v27

    .line 1498
    .line 1499
    neg-float v9, v9

    .line 1500
    neg-float v8, v8

    .line 1501
    iget-object v12, v10, La/nr;->b:Ljava/lang/Object;

    .line 1502
    .line 1503
    check-cast v12, La/fvt0;

    .line 1504
    .line 1505
    invoke-virtual {v12, v9, v8}, La/fvt0;->A(FF)V

    .line 1506
    .line 1507
    .line 1508
    :try_start_0
    iget-object v3, v3, La/ne80;->a:La/w03;

    .line 1509
    .line 1510
    new-instance v31, La/vtm0;

    .line 1511
    .line 1512
    const/16 v30, 0x0

    .line 1513
    .line 1514
    move-object/from16 v25, v31

    .line 1515
    .line 1516
    const/16 v31, 0x1e

    .line 1517
    .line 1518
    const/16 v27, 0x0

    .line 1519
    .line 1520
    const/16 v28, 0x0

    .line 1521
    .line 1522
    const/16 v29, 0x0

    .line 1523
    .line 1524
    invoke-direct/range {v25 .. v31}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1525
    .line 1526
    .line 1527
    const/16 v32, 0x34

    .line 1528
    .line 1529
    const/16 v30, 0x0

    .line 1530
    .line 1531
    move-object/from16 v28, v3

    .line 1532
    .line 1533
    move-object/from16 v27, v11

    .line 1534
    .line 1535
    move-object/from16 v29, v20

    .line 1536
    .line 1537
    move-object/from16 v31, v25

    .line 1538
    .line 1539
    invoke-static/range {v27 .. v32}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V

    .line 1540
    .line 1541
    .line 1542
    invoke-interface/range {v27 .. v27}, La/fhl;->d()J

    .line 1543
    .line 1544
    .line 1545
    move-result-wide v11

    .line 1546
    shr-long v11, v11, p0

    .line 1547
    .line 1548
    long-to-int v3, v11

    .line 1549
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1550
    .line 1551
    .line 1552
    move-result v3

    .line 1553
    add-float v3, v3, v18

    .line 1554
    .line 1555
    invoke-interface/range {v27 .. v27}, La/fhl;->d()J

    .line 1556
    .line 1557
    .line 1558
    move-result-wide v11

    .line 1559
    shr-long v11, v11, p0

    .line 1560
    .line 1561
    long-to-int v11, v11

    .line 1562
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1563
    .line 1564
    .line 1565
    move-result v11

    .line 1566
    div-float/2addr v3, v11

    .line 1567
    invoke-interface/range {v27 .. v27}, La/fhl;->d()J

    .line 1568
    .line 1569
    .line 1570
    move-result-wide v11

    .line 1571
    and-long v11, v11, v16

    .line 1572
    .line 1573
    long-to-int v11, v11

    .line 1574
    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1575
    .line 1576
    .line 1577
    move-result v11

    .line 1578
    add-float v11, v11, v18

    .line 1579
    .line 1580
    invoke-interface/range {v27 .. v27}, La/fhl;->d()J

    .line 1581
    .line 1582
    .line 1583
    move-result-wide v12

    .line 1584
    and-long v12, v12, v16

    .line 1585
    .line 1586
    long-to-int v12, v12

    .line 1587
    invoke-static {v12}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 1588
    .line 1589
    .line 1590
    move-result v12

    .line 1591
    div-float/2addr v11, v12

    .line 1592
    invoke-interface/range {v27 .. v27}, La/fhl;->E0()J

    .line 1593
    .line 1594
    .line 1595
    move-result-wide v12

    .line 1596
    move-wide/from16 v25, v5

    .line 1597
    .line 1598
    invoke-virtual {v10}, La/nr;->p()J

    .line 1599
    .line 1600
    .line 1601
    move-result-wide v5

    .line 1602
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 1603
    .line 1604
    .line 1605
    move-result-object v16

    .line 1606
    invoke-interface/range {v16 .. v16}, La/x5a;->l()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 1607
    .line 1608
    .line 1609
    move-object/from16 v20, v7

    .line 1610
    .line 1611
    :try_start_1
    iget-object v7, v10, La/nr;->b:Ljava/lang/Object;

    .line 1612
    .line 1613
    check-cast v7, La/fvt0;

    .line 1614
    .line 1615
    invoke-virtual {v7, v3, v11, v12, v13}, La/fvt0;->z(FFJ)V

    .line 1616
    .line 1617
    .line 1618
    const/16 v31, 0x0

    .line 1619
    .line 1620
    const/16 v32, 0x1c

    .line 1621
    .line 1622
    const/16 v30, 0x0

    .line 1623
    .line 1624
    move-object/from16 v28, v14

    .line 1625
    .line 1626
    invoke-static/range {v27 .. v32}, La/fhl;->K0(La/fhl;La/w03;La/t89;FLa/agc;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 1627
    .line 1628
    .line 1629
    :try_start_2
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v3

    .line 1633
    invoke-interface {v3}, La/x5a;->i()V

    .line 1634
    .line 1635
    .line 1636
    invoke-virtual {v10, v5, v6}, La/nr;->H(J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1637
    .line 1638
    .line 1639
    iget-object v3, v10, La/nr;->b:Ljava/lang/Object;

    .line 1640
    .line 1641
    check-cast v3, La/fvt0;

    .line 1642
    .line 1643
    neg-float v5, v9

    .line 1644
    neg-float v6, v8

    .line 1645
    invoke-virtual {v3, v5, v6}, La/fvt0;->A(FF)V

    .line 1646
    .line 1647
    .line 1648
    invoke-virtual/range {v20 .. v20}, La/uw2;->i()V

    .line 1649
    .line 1650
    .line 1651
    iput-object v15, v0, La/z5a;->a:La/w6k;

    .line 1652
    .line 1653
    iput-object v2, v0, La/z5a;->b:La/k6z;

    .line 1654
    .line 1655
    iput-object v4, v0, La/z5a;->c:La/x5a;

    .line 1656
    .line 1657
    move-wide/from16 v2, v25

    .line 1658
    .line 1659
    iput-wide v2, v0, La/z5a;->d:J

    .line 1660
    .line 1661
    move-object/from16 v6, v19

    .line 1662
    .line 1663
    iget-object v0, v6, La/vz2;->a:Landroid/graphics/Bitmap;

    .line 1664
    .line 1665
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 1666
    .line 1667
    .line 1668
    move-object/from16 v0, v24

    .line 1669
    .line 1670
    iput-object v6, v0, La/mie0;->a:Ljava/lang/Object;

    .line 1671
    .line 1672
    new-instance v18, La/as0;

    .line 1673
    .line 1674
    const/16 v24, 0x1

    .line 1675
    .line 1676
    move-object/from16 v19, p1

    .line 1677
    .line 1678
    move-object/from16 v20, v0

    .line 1679
    .line 1680
    invoke-direct/range {v18 .. v24}, La/as0;-><init>(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 1681
    .line 1682
    .line 1683
    move-object/from16 v0, v18

    .line 1684
    .line 1685
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1686
    .line 1687
    .line 1688
    move-result-object v13

    .line 1689
    goto/16 :goto_11

    .line 1690
    .line 1691
    :catchall_0
    move-exception v0

    .line 1692
    goto :goto_f

    .line 1693
    :catchall_1
    move-exception v0

    .line 1694
    :try_start_3
    invoke-virtual {v10}, La/nr;->i()La/x5a;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v1

    .line 1698
    invoke-interface {v1}, La/x5a;->i()V

    .line 1699
    .line 1700
    .line 1701
    invoke-virtual {v10, v5, v6}, La/nr;->H(J)V

    .line 1702
    .line 1703
    .line 1704
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 1705
    :goto_f
    iget-object v1, v10, La/nr;->b:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v1, La/fvt0;

    .line 1708
    .line 1709
    neg-float v2, v9

    .line 1710
    neg-float v3, v8

    .line 1711
    invoke-virtual {v1, v2, v3}, La/fvt0;->A(FF)V

    .line 1712
    .line 1713
    .line 1714
    throw v0

    .line 1715
    :cond_30
    instance-of v4, v3, La/pe80;

    .line 1716
    .line 1717
    if-eqz v4, :cond_35

    .line 1718
    .line 1719
    iget-object v4, v0, La/bn8;->s:La/skk0;

    .line 1720
    .line 1721
    check-cast v3, La/pe80;

    .line 1722
    .line 1723
    iget-object v3, v3, La/pe80;->a:La/wfg0;

    .line 1724
    .line 1725
    invoke-static {v3}, La/r8x;->S(La/wfg0;)Z

    .line 1726
    .line 1727
    .line 1728
    move-result v5

    .line 1729
    if-eqz v5, :cond_31

    .line 1730
    .line 1731
    iget-wide v5, v3, La/wfg0;->e:J

    .line 1732
    .line 1733
    new-instance v14, La/vtm0;

    .line 1734
    .line 1735
    const/16 v19, 0x0

    .line 1736
    .line 1737
    move/from16 v15, v20

    .line 1738
    .line 1739
    const/16 v20, 0x1e

    .line 1740
    .line 1741
    const/16 v16, 0x0

    .line 1742
    .line 1743
    const/16 v17, 0x0

    .line 1744
    .line 1745
    const/16 v18, 0x0

    .line 1746
    .line 1747
    invoke-direct/range {v14 .. v20}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1748
    .line 1749
    .line 1750
    new-instance v0, La/an8;

    .line 1751
    .line 1752
    move-object/from16 v16, v4

    .line 1753
    .line 1754
    move-wide/from16 v17, v5

    .line 1755
    .line 1756
    move/from16 v19, v7

    .line 1757
    .line 1758
    move-object/from16 v25, v14

    .line 1759
    .line 1760
    move/from16 v20, v15

    .line 1761
    .line 1762
    move-object v14, v0

    .line 1763
    move v15, v2

    .line 1764
    invoke-direct/range {v14 .. v25}, La/an8;-><init>(ZLa/skk0;JFFJJLa/vtm0;)V

    .line 1765
    .line 1766
    .line 1767
    invoke-virtual {v1, v14}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1768
    .line 1769
    .line 1770
    move-result-object v13

    .line 1771
    goto/16 :goto_11

    .line 1772
    .line 1773
    :cond_31
    move v11, v2

    .line 1774
    move-object v2, v4

    .line 1775
    move/from16 v15, v20

    .line 1776
    .line 1777
    iget-object v4, v0, La/bn8;->q:La/xm8;

    .line 1778
    .line 1779
    if-nez v4, :cond_32

    .line 1780
    .line 1781
    new-instance v4, La/xm8;

    .line 1782
    .line 1783
    invoke-direct {v4}, La/xm8;-><init>()V

    .line 1784
    .line 1785
    .line 1786
    iput-object v4, v0, La/bn8;->q:La/xm8;

    .line 1787
    .line 1788
    :cond_32
    iget-object v0, v4, La/xm8;->d:La/w03;

    .line 1789
    .line 1790
    if-nez v0, :cond_33

    .line 1791
    .line 1792
    invoke-static {}, La/z03;->a()La/w03;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v0

    .line 1796
    iput-object v0, v4, La/xm8;->d:La/w03;

    .line 1797
    .line 1798
    :cond_33
    invoke-virtual {v0}, La/w03;->h()V

    .line 1799
    .line 1800
    .line 1801
    invoke-static {v0, v3}, La/w03;->b(La/w03;La/wfg0;)V

    .line 1802
    .line 1803
    .line 1804
    if-nez v11, :cond_34

    .line 1805
    .line 1806
    invoke-static {}, La/z03;->a()La/w03;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v4

    .line 1810
    invoke-virtual {v3}, La/wfg0;->b()F

    .line 1811
    .line 1812
    .line 1813
    move-result v5

    .line 1814
    sub-float v17, v5, v15

    .line 1815
    .line 1816
    invoke-virtual {v3}, La/wfg0;->a()F

    .line 1817
    .line 1818
    .line 1819
    move-result v5

    .line 1820
    sub-float v18, v5, v15

    .line 1821
    .line 1822
    iget-wide v5, v3, La/wfg0;->e:J

    .line 1823
    .line 1824
    invoke-static {v15, v5, v6}, La/i120;->d0(FJ)J

    .line 1825
    .line 1826
    .line 1827
    move-result-wide v19

    .line 1828
    iget-wide v5, v3, La/wfg0;->f:J

    .line 1829
    .line 1830
    invoke-static {v15, v5, v6}, La/i120;->d0(FJ)J

    .line 1831
    .line 1832
    .line 1833
    move-result-wide v21

    .line 1834
    iget-wide v5, v3, La/wfg0;->h:J

    .line 1835
    .line 1836
    invoke-static {v15, v5, v6}, La/i120;->d0(FJ)J

    .line 1837
    .line 1838
    .line 1839
    move-result-wide v25

    .line 1840
    iget-wide v5, v3, La/wfg0;->g:J

    .line 1841
    .line 1842
    invoke-static {v15, v5, v6}, La/i120;->d0(FJ)J

    .line 1843
    .line 1844
    .line 1845
    move-result-wide v23

    .line 1846
    new-instance v14, La/wfg0;

    .line 1847
    .line 1848
    move/from16 v16, v15

    .line 1849
    .line 1850
    invoke-direct/range {v14 .. v26}, La/wfg0;-><init>(FFFFJJJJ)V

    .line 1851
    .line 1852
    .line 1853
    invoke-static {v4, v14}, La/w03;->b(La/w03;La/wfg0;)V

    .line 1854
    .line 1855
    .line 1856
    const/4 v5, 0x0

    .line 1857
    invoke-virtual {v0, v0, v4, v5}, La/w03;->g(La/w03;La/w03;I)Z

    .line 1858
    .line 1859
    .line 1860
    :cond_34
    new-instance v3, La/op7;

    .line 1861
    .line 1862
    invoke-direct {v3, v0, v2, v9}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1863
    .line 1864
    .line 1865
    invoke-virtual {v1, v3}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1866
    .line 1867
    .line 1868
    move-result-object v13

    .line 1869
    goto :goto_11

    .line 1870
    :cond_35
    move v11, v2

    .line 1871
    move/from16 v15, v20

    .line 1872
    .line 1873
    instance-of v2, v3, La/oe80;

    .line 1874
    .line 1875
    if-eqz v2, :cond_39

    .line 1876
    .line 1877
    iget-object v4, v0, La/bn8;->s:La/skk0;

    .line 1878
    .line 1879
    if-eqz v11, :cond_36

    .line 1880
    .line 1881
    const-wide/16 v21, 0x0

    .line 1882
    .line 1883
    :cond_36
    move-wide/from16 v5, v21

    .line 1884
    .line 1885
    if-eqz v11, :cond_37

    .line 1886
    .line 1887
    iget-object v0, v1, La/pi9;->a:La/y99;

    .line 1888
    .line 1889
    invoke-interface {v0}, La/y99;->d()J

    .line 1890
    .line 1891
    .line 1892
    move-result-wide v23

    .line 1893
    :cond_37
    move-wide/from16 v7, v23

    .line 1894
    .line 1895
    if-eqz v11, :cond_38

    .line 1896
    .line 1897
    sget-object v0, La/l0q;->a:La/l0q;

    .line 1898
    .line 1899
    move-object v9, v0

    .line 1900
    goto :goto_10

    .line 1901
    :cond_38
    new-instance v14, La/vtm0;

    .line 1902
    .line 1903
    const/16 v19, 0x0

    .line 1904
    .line 1905
    const/16 v20, 0x1e

    .line 1906
    .line 1907
    const/16 v16, 0x0

    .line 1908
    .line 1909
    const/16 v17, 0x0

    .line 1910
    .line 1911
    const/16 v18, 0x0

    .line 1912
    .line 1913
    invoke-direct/range {v14 .. v20}, La/vtm0;-><init>(FFIILa/x03;I)V

    .line 1914
    .line 1915
    .line 1916
    move-object v9, v14

    .line 1917
    :goto_10
    new-instance v3, La/zm8;

    .line 1918
    .line 1919
    const/4 v10, 0x0

    .line 1920
    invoke-direct/range {v3 .. v10}, La/zm8;-><init>(Ljava/lang/Object;JJLjava/lang/Object;B)V

    .line 1921
    .line 1922
    .line 1923
    invoke-virtual {v1, v3}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1924
    .line 1925
    .line 1926
    move-result-object v13

    .line 1927
    goto :goto_11

    .line 1928
    :cond_39
    invoke-static {}, La/t9f;->b()V

    .line 1929
    .line 1930
    .line 1931
    const/4 v13, 0x0

    .line 1932
    goto :goto_11

    .line 1933
    :cond_3a
    new-instance v0, La/nk7;

    .line 1934
    .line 1935
    const/16 v2, 0x15

    .line 1936
    .line 1937
    invoke-direct {v0, v2}, La/nk7;-><init>(B)V

    .line 1938
    .line 1939
    .line 1940
    invoke-virtual {v1, v0}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 1941
    .line 1942
    .line 1943
    move-result-object v13

    .line 1944
    :goto_11
    return-object v13

    .line 1945
    :pswitch_12
    check-cast v0, La/jm8;

    .line 1946
    .line 1947
    move-object/from16 v1, p1

    .line 1948
    .line 1949
    check-cast v1, La/k0w0;

    .line 1950
    .line 1951
    iget-object v2, v0, La/jm8;->E:La/oct;

    .line 1952
    .line 1953
    const/4 v8, 0x0

    .line 1954
    const/16 v9, 0x1f

    .line 1955
    .line 1956
    const-wide/16 v3, 0x0

    .line 1957
    .line 1958
    const/4 v5, 0x0

    .line 1959
    const/4 v6, 0x0

    .line 1960
    const/4 v7, 0x0

    .line 1961
    invoke-static/range {v2 .. v9}, La/oct;->f(La/oct;JLa/d270;ILa/t270;Ljava/lang/String;I)Lorg/xplatform/games_section/impl/navigation/GamesSectionScreens$OneXGamesFragmentScreen;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v2

    .line 1965
    invoke-virtual {v1, v2}, La/k0w0;->c(La/m7h0;)V

    .line 1966
    .line 1967
    .line 1968
    iget-object v0, v0, La/jm8;->E:La/oct;

    .line 1969
    .line 1970
    invoke-virtual {v0}, La/oct;->e()Lcom/github/terrakok/cicerone/androidx/FragmentScreen;

    .line 1971
    .line 1972
    .line 1973
    move-result-object v0

    .line 1974
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 1975
    .line 1976
    .line 1977
    move-result-object v0

    .line 1978
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 1979
    .line 1980
    check-cast v0, La/c8d;

    .line 1981
    .line 1982
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 1983
    .line 1984
    new-instance v2, La/v7d;

    .line 1985
    .line 1986
    const/4 v3, 0x1

    .line 1987
    invoke-direct {v2, v3, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 1988
    .line 1989
    .line 1990
    iput-object v2, v0, La/c8d;->a:La/w7d;

    .line 1991
    .line 1992
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1993
    .line 1994
    return-object v0

    .line 1995
    :pswitch_13
    check-cast v0, La/yj8;

    .line 1996
    .line 1997
    move-object/from16 v1, p1

    .line 1998
    .line 1999
    check-cast v1, Ljava/lang/Throwable;

    .line 2000
    .line 2001
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2002
    .line 2003
    .line 2004
    iget-object v2, v0, La/yj8;->e:La/duj;

    .line 2005
    .line 2006
    new-instance v3, La/m87;

    .line 2007
    .line 2008
    const/16 v4, 0x10

    .line 2009
    .line 2010
    invoke-direct {v3, v0, v4}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2014
    .line 2015
    .line 2016
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2017
    .line 2018
    return-object v0

    .line 2019
    :pswitch_14
    move-object v1, v0

    .line 2020
    check-cast v1, La/tj8;

    .line 2021
    .line 2022
    move-object/from16 v0, p1

    .line 2023
    .line 2024
    check-cast v0, Ljava/lang/Throwable;

    .line 2025
    .line 2026
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2027
    .line 2028
    .line 2029
    iget-object v2, v1, La/tj8;->r:La/duj;

    .line 2030
    .line 2031
    new-instance v3, La/yr0;

    .line 2032
    .line 2033
    const/16 v4, 0x8

    .line 2034
    .line 2035
    invoke-direct {v3, v0, v4}, La/yr0;-><init>(Ljava/lang/Throwable;B)V

    .line 2036
    .line 2037
    .line 2038
    invoke-virtual {v2, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2039
    .line 2040
    .line 2041
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 2042
    .line 2043
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 2044
    .line 2045
    :cond_3b
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2046
    .line 2047
    .line 2048
    move-result-object v0

    .line 2049
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2050
    .line 2051
    .line 2052
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 2053
    .line 2054
    move-object v4, v0

    .line 2055
    check-cast v4, La/pj8;

    .line 2056
    .line 2057
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2058
    .line 2059
    .line 2060
    const/4 v8, 0x0

    .line 2061
    const/16 v9, 0x1d

    .line 2062
    .line 2063
    const/4 v5, 0x0

    .line 2064
    const/4 v6, 0x1

    .line 2065
    const/4 v7, 0x0

    .line 2066
    invoke-static/range {v4 .. v9}, La/pj8;->a(La/pj8;Ljava/lang/String;ZZLjava/util/ArrayList;I)La/pj8;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v3

    .line 2070
    invoke-virtual {v2, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2071
    .line 2072
    .line 2073
    move-result v0

    .line 2074
    if-eqz v0, :cond_3b

    .line 2075
    .line 2076
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2077
    .line 2078
    return-object v0

    .line 2079
    :pswitch_15
    move-object v1, v0

    .line 2080
    check-cast v1, La/gj8;

    .line 2081
    .line 2082
    move-object/from16 v0, p1

    .line 2083
    .line 2084
    check-cast v0, Ljava/lang/Throwable;

    .line 2085
    .line 2086
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2087
    .line 2088
    .line 2089
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 2090
    .line 2091
    iget-object v2, v0, La/ocj;->a:La/p7m0;

    .line 2092
    .line 2093
    :cond_3c
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2094
    .line 2095
    .line 2096
    move-result-object v0

    .line 2097
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2098
    .line 2099
    .line 2100
    iget-object v3, v1, La/i3t0;->f:La/oyg0;

    .line 2101
    .line 2102
    move-object v4, v0

    .line 2103
    check-cast v4, La/zi8;

    .line 2104
    .line 2105
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2106
    .line 2107
    .line 2108
    sget-object v3, La/iun;->a:La/iun;

    .line 2109
    .line 2110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2111
    .line 2112
    .line 2113
    new-instance v4, La/zi8;

    .line 2114
    .line 2115
    const/4 v5, 0x0

    .line 2116
    invoke-direct {v4, v3, v5}, La/zi8;-><init>(Ljava/util/List;Z)V

    .line 2117
    .line 2118
    .line 2119
    invoke-virtual {v2, v0, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2120
    .line 2121
    .line 2122
    move-result v0

    .line 2123
    if-eqz v0, :cond_3c

    .line 2124
    .line 2125
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2126
    .line 2127
    return-object v0

    .line 2128
    :pswitch_16
    move-object v3, v0

    .line 2129
    check-cast v3, La/lf8;

    .line 2130
    .line 2131
    move-object/from16 v0, p1

    .line 2132
    .line 2133
    check-cast v0, Ljava/util/List;

    .line 2134
    .line 2135
    invoke-static {v0}, La/dyb;->o0(Ljava/lang/Iterable;)La/a4x;

    .line 2136
    .line 2137
    .line 2138
    move-result-object v0

    .line 2139
    sget v1, La/lf8;->J:I

    .line 2140
    .line 2141
    invoke-static {v3}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 2142
    .line 2143
    .line 2144
    move-result-object v9

    .line 2145
    iget-object v1, v3, La/lf8;->v:La/mne;

    .line 2146
    .line 2147
    iget-object v10, v1, La/mne;->b:La/dvj;

    .line 2148
    .line 2149
    new-instance v1, La/ye7;

    .line 2150
    .line 2151
    const/4 v7, 0x0

    .line 2152
    const/16 v8, 0x1b

    .line 2153
    .line 2154
    const/4 v2, 0x1

    .line 2155
    const-class v4, La/lf8;

    .line 2156
    .line 2157
    const-string v5, "onError"

    .line 2158
    .line 2159
    const-string v6, "onError(Ljava/lang/Throwable;)V"

    .line 2160
    .line 2161
    invoke-direct/range {v1 .. v8}, La/ye7;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 2162
    .line 2163
    .line 2164
    new-instance v8, La/kf8;

    .line 2165
    .line 2166
    const/4 v2, 0x1

    .line 2167
    const/4 v4, 0x0

    .line 2168
    invoke-direct {v8, v3, v0, v4, v2}, La/kf8;-><init>(La/lf8;Ljava/util/List;La/yje;B)V

    .line 2169
    .line 2170
    .line 2171
    move-object v4, v9

    .line 2172
    const/16 v9, 0xa

    .line 2173
    .line 2174
    const/4 v6, 0x0

    .line 2175
    move-object v5, v1

    .line 2176
    move-object v7, v10

    .line 2177
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 2178
    .line 2179
    .line 2180
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2181
    .line 2182
    return-object v0

    .line 2183
    :pswitch_17
    move/from16 v18, v5

    .line 2184
    .line 2185
    const/16 p0, 0x20

    .line 2186
    .line 2187
    const-wide v16, 0xffffffffL

    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    move-object v3, v0

    .line 2193
    check-cast v3, La/bh8;

    .line 2194
    .line 2195
    move-object/from16 v0, p1

    .line 2196
    .line 2197
    check-cast v0, La/pi9;

    .line 2198
    .line 2199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2200
    .line 2201
    .line 2202
    sget-object v1, La/qmk;->a:La/zcl;

    .line 2203
    .line 2204
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 2205
    .line 2206
    .line 2207
    move-result v1

    .line 2208
    mul-float v4, v1, v18

    .line 2209
    .line 2210
    const/high16 v1, 0x41800000    # 16.0f

    .line 2211
    .line 2212
    invoke-virtual {v0}, La/pi9;->getDensity()F

    .line 2213
    .line 2214
    .line 2215
    move-result v2

    .line 2216
    mul-float/2addr v2, v1

    .line 2217
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2218
    .line 2219
    .line 2220
    move-result v1

    .line 2221
    int-to-long v5, v1

    .line 2222
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 2223
    .line 2224
    .line 2225
    move-result v1

    .line 2226
    int-to-long v1, v1

    .line 2227
    shl-long v5, v5, p0

    .line 2228
    .line 2229
    and-long v1, v1, v16

    .line 2230
    .line 2231
    or-long/2addr v1, v5

    .line 2232
    iget-object v5, v0, La/pi9;->a:La/y99;

    .line 2233
    .line 2234
    invoke-interface {v5}, La/y99;->d()J

    .line 2235
    .line 2236
    .line 2237
    move-result-wide v5

    .line 2238
    shr-long v5, v5, p0

    .line 2239
    .line 2240
    long-to-int v5, v5

    .line 2241
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2242
    .line 2243
    .line 2244
    move-result v20

    .line 2245
    iget-object v5, v0, La/pi9;->a:La/y99;

    .line 2246
    .line 2247
    invoke-interface {v5}, La/y99;->d()J

    .line 2248
    .line 2249
    .line 2250
    move-result-wide v5

    .line 2251
    and-long v5, v5, v16

    .line 2252
    .line 2253
    long-to-int v5, v5

    .line 2254
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2255
    .line 2256
    .line 2257
    move-result v21

    .line 2258
    move-wide v5, v1

    .line 2259
    invoke-static {}, La/z03;->a()La/w03;

    .line 2260
    .line 2261
    .line 2262
    move-result-object v2

    .line 2263
    shr-long v7, v5, p0

    .line 2264
    .line 2265
    long-to-int v1, v7

    .line 2266
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2267
    .line 2268
    .line 2269
    move-result v22

    .line 2270
    and-long v5, v5, v16

    .line 2271
    .line 2272
    long-to-int v5, v5

    .line 2273
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2274
    .line 2275
    .line 2276
    move-result v23

    .line 2277
    const/16 v18, 0x0

    .line 2278
    .line 2279
    const/16 v19, 0x0

    .line 2280
    .line 2281
    invoke-static/range {v18 .. v23}, La/r8x;->t(FFFFFF)La/wfg0;

    .line 2282
    .line 2283
    .line 2284
    move-result-object v6

    .line 2285
    invoke-static {v2, v6}, La/w03;->b(La/w03;La/wfg0;)V

    .line 2286
    .line 2287
    .line 2288
    iget-object v6, v0, La/pi9;->a:La/y99;

    .line 2289
    .line 2290
    invoke-interface {v6}, La/y99;->d()J

    .line 2291
    .line 2292
    .line 2293
    move-result-wide v6

    .line 2294
    shr-long v6, v6, p0

    .line 2295
    .line 2296
    long-to-int v6, v6

    .line 2297
    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2298
    .line 2299
    .line 2300
    move-result v6

    .line 2301
    sub-float/2addr v6, v4

    .line 2302
    iget-object v7, v0, La/pi9;->a:La/y99;

    .line 2303
    .line 2304
    invoke-interface {v7}, La/y99;->d()J

    .line 2305
    .line 2306
    .line 2307
    move-result-wide v7

    .line 2308
    and-long v7, v7, v16

    .line 2309
    .line 2310
    long-to-int v7, v7

    .line 2311
    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2312
    .line 2313
    .line 2314
    move-result v7

    .line 2315
    sub-float/2addr v7, v4

    .line 2316
    invoke-static {}, La/z03;->a()La/w03;

    .line 2317
    .line 2318
    .line 2319
    move-result-object v11

    .line 2320
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2321
    .line 2322
    .line 2323
    move-result v8

    .line 2324
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 2325
    .line 2326
    .line 2327
    move-result v9

    .line 2328
    move v5, v4

    .line 2329
    invoke-static/range {v4 .. v9}, La/r8x;->t(FFFFFF)La/wfg0;

    .line 2330
    .line 2331
    .line 2332
    move-result-object v1

    .line 2333
    invoke-static {v11, v1}, La/w03;->b(La/w03;La/wfg0;)V

    .line 2334
    .line 2335
    .line 2336
    new-instance v1, La/vb8;

    .line 2337
    .line 2338
    invoke-direct {v1, v0, v10}, La/vb8;-><init>(Ljava/lang/Object;B)V

    .line 2339
    .line 2340
    .line 2341
    invoke-static {v1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v5

    .line 2345
    new-instance v1, La/dc0;

    .line 2346
    .line 2347
    const/16 v6, 0xf

    .line 2348
    .line 2349
    move-object v4, v11

    .line 2350
    invoke-direct/range {v1 .. v6}, La/dc0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2351
    .line 2352
    .line 2353
    invoke-virtual {v0, v1}, La/pi9;->b(Lkotlin/jvm/functions/Function1;)La/psc;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v0

    .line 2357
    return-object v0

    .line 2358
    :pswitch_18
    check-cast v0, La/ld8;

    .line 2359
    .line 2360
    move-object/from16 v1, p1

    .line 2361
    .line 2362
    check-cast v1, Ljava/lang/Throwable;

    .line 2363
    .line 2364
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2365
    .line 2366
    .line 2367
    const/4 v5, 0x0

    .line 2368
    invoke-virtual {v0, v1, v5}, La/ld8;->O(Ljava/lang/Throwable;Z)V

    .line 2369
    .line 2370
    .line 2371
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2372
    .line 2373
    return-object v0

    .line 2374
    :pswitch_19
    move v5, v12

    .line 2375
    check-cast v0, La/wb8;

    .line 2376
    .line 2377
    move-object/from16 v1, p1

    .line 2378
    .line 2379
    check-cast v1, La/bc8;

    .line 2380
    .line 2381
    sget-object v2, La/wb8;->n2:La/kj5;

    .line 2382
    .line 2383
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2384
    .line 2385
    .line 2386
    iget-object v1, v1, La/bc8;->a:Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/models/BonusAccountUiModel;

    .line 2387
    .line 2388
    iget-object v2, v0, La/wb8;->m2:La/khf0;

    .line 2389
    .line 2390
    sget-object v3, La/wb8;->o2:[La/iiy;

    .line 2391
    .line 2392
    aget-object v3, v3, v5

    .line 2393
    .line 2394
    invoke-virtual {v2, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 2395
    .line 2396
    .line 2397
    move-result-object v2

    .line 2398
    check-cast v2, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;

    .line 2399
    .line 2400
    iget-object v2, v2, Lorg/xplatform/wallet/impl/presentation/dialogs/bonusaccountaction/params/BonusAccountScreenParams;->a:Ljava/lang/String;

    .line 2401
    .line 2402
    new-instance v3, Lkotlin/Pair;

    .line 2403
    .line 2404
    invoke-direct {v3, v2, v1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 2405
    .line 2406
    .line 2407
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 2408
    .line 2409
    .line 2410
    move-result-object v1

    .line 2411
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 2412
    .line 2413
    .line 2414
    move-result-object v1

    .line 2415
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 2416
    .line 2417
    .line 2418
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 2419
    .line 2420
    .line 2421
    iget-object v0, v0, La/wb8;->l2:La/a8z;

    .line 2422
    .line 2423
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 2424
    .line 2425
    .line 2426
    move-result-object v0

    .line 2427
    check-cast v0, La/k3t0;

    .line 2428
    .line 2429
    sget-object v1, La/sb8;->a:La/sb8;

    .line 2430
    .line 2431
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2432
    .line 2433
    .line 2434
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2435
    .line 2436
    return-object v0

    .line 2437
    :pswitch_1a
    check-cast v0, La/c58;

    .line 2438
    .line 2439
    move-object/from16 v1, p1

    .line 2440
    .line 2441
    check-cast v1, La/hcz;

    .line 2442
    .line 2443
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2444
    .line 2445
    .line 2446
    move-object v2, v0

    .line 2447
    check-cast v2, La/y48;

    .line 2448
    .line 2449
    iget-object v2, v2, La/y48;->d:La/a4x;

    .line 2450
    .line 2451
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 2452
    .line 2453
    .line 2454
    move-result v3

    .line 2455
    new-instance v4, La/wl0;

    .line 2456
    .line 2457
    invoke-direct {v4, v2, v9}, La/wl0;-><init>(La/a4x;B)V

    .line 2458
    .line 2459
    .line 2460
    new-instance v5, La/xe4;

    .line 2461
    .line 2462
    invoke-direct {v5, v2, v0, v10}, La/xe4;-><init>(Ljava/util/List;Ljava/lang/Object;B)V

    .line 2463
    .line 2464
    .line 2465
    new-instance v0, La/ugd;

    .line 2466
    .line 2467
    const v2, 0x799532c4

    .line 2468
    .line 2469
    .line 2470
    const/4 v6, 0x1

    .line 2471
    invoke-direct {v0, v2, v6, v5}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2472
    .line 2473
    .line 2474
    const/4 v2, 0x0

    .line 2475
    invoke-virtual {v1, v3, v2, v4, v0}, La/hcz;->f(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;La/ydr;)V

    .line 2476
    .line 2477
    .line 2478
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2479
    .line 2480
    return-object v0

    .line 2481
    :pswitch_1b
    check-cast v0, La/d48;

    .line 2482
    .line 2483
    move-object/from16 v1, p1

    .line 2484
    .line 2485
    check-cast v1, Ljava/lang/Throwable;

    .line 2486
    .line 2487
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2488
    .line 2489
    .line 2490
    iget-object v0, v0, La/d48;->r:La/rjo;

    .line 2491
    .line 2492
    invoke-virtual {v0, v1}, La/rjo;->a(Ljava/lang/Throwable;)V

    .line 2493
    .line 2494
    .line 2495
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2496
    .line 2497
    return-object v0

    .line 2498
    :pswitch_1c
    check-cast v0, La/h38;

    .line 2499
    .line 2500
    move-object/from16 v1, p1

    .line 2501
    .line 2502
    check-cast v1, La/iqt0;

    .line 2503
    .line 2504
    sget-object v2, La/h38;->V1:La/yk5;

    .line 2505
    .line 2506
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2507
    .line 2508
    .line 2509
    invoke-virtual {v0}, La/h38;->H0()La/d48;

    .line 2510
    .line 2511
    .line 2512
    move-result-object v0

    .line 2513
    iget-object v0, v0, La/d48;->v:La/z4w0;

    .line 2514
    .line 2515
    invoke-virtual {v0, v1}, La/z4w0;->a(La/iqt0;)V

    .line 2516
    .line 2517
    .line 2518
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2519
    .line 2520
    return-object v0

    .line 2521
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
