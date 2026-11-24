.class public final synthetic La/d7e;
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
    iput-byte p7, p0, La/d7e;->h:B

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
    iget-byte v1, v0, La/d7e;->h:B

    .line 4
    .line 5
    const-wide/16 v2, 0x190

    .line 6
    .line 7
    const-string v4, "actionDialogManager"

    .line 8
    .line 9
    const v5, 0x7f130e5d

    .line 10
    .line 11
    .line 12
    const v6, 0x7f1307bb

    .line 13
    .line 14
    .line 15
    const/16 v7, 0xa

    .line 16
    .line 17
    const-string v8, "snackbarManager"

    .line 18
    .line 19
    const/16 v9, 0x8

    .line 20
    .line 21
    const/4 v10, 0x1

    .line 22
    const/4 v11, 0x0

    .line 23
    const/4 v12, 0x0

    .line 24
    iget-object v0, v0, La/xo;->a:Ljava/lang/Object;

    .line 25
    .line 26
    packed-switch v1, :pswitch_data_0

    .line 27
    .line 28
    .line 29
    move-object/from16 v1, p1

    .line 30
    .line 31
    check-cast v1, Ljava/lang/Boolean;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 34
    .line 35
    .line 36
    move-result v1

    .line 37
    move-object/from16 v2, p2

    .line 38
    .line 39
    check-cast v2, La/yje;

    .line 40
    .line 41
    check-cast v0, La/qfl;

    .line 42
    .line 43
    sget-object v2, La/qfl;->O1:[La/iiy;

    .line 44
    .line 45
    invoke-virtual {v0}, La/qfl;->G0()La/tzq;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    iget-object v0, v0, La/tzq;->b:Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Lorg/xplatform/dragons_gold/presentation/views/DragonsGoldCellGameView;->v(Z)V

    .line 52
    .line 53
    .line 54
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    return-object v0

    .line 57
    :pswitch_0
    move-object/from16 v1, p1

    .line 58
    .line 59
    check-cast v1, La/bwk;

    .line 60
    .line 61
    move-object/from16 v2, p2

    .line 62
    .line 63
    check-cast v2, La/yje;

    .line 64
    .line 65
    check-cast v0, La/cy40;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    invoke-static {}, La/xfk0;->h()La/rfk0;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    instance-of v3, v2, La/nz40;

    .line 78
    .line 79
    if-eqz v3, :cond_0

    .line 80
    .line 81
    check-cast v2, La/nz40;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_0
    move-object v2, v12

    .line 85
    :goto_0
    if-eqz v2, :cond_1

    .line 86
    .line 87
    invoke-virtual {v2, v12, v12}, La/nz40;->C(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)La/nz40;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    :try_start_0
    invoke-virtual {v2}, La/rfk0;->j()La/rfk0;

    .line 94
    .line 95
    .line 96
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 97
    :try_start_1
    iget-object v4, v0, La/cy40;->a:La/pz40;

    .line 98
    .line 99
    iget-object v5, v1, La/bwk;->a:La/zhk;

    .line 100
    .line 101
    check-cast v4, La/hgk0;

    .line 102
    .line 103
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 104
    .line 105
    .line 106
    iget-object v4, v0, La/cy40;->b:La/pz40;

    .line 107
    .line 108
    iget-object v5, v1, La/bwk;->b:La/la80;

    .line 109
    .line 110
    check-cast v4, La/hgk0;

    .line 111
    .line 112
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    iget-object v4, v0, La/cy40;->c:La/pz40;

    .line 116
    .line 117
    iget v5, v1, La/bwk;->c:F

    .line 118
    .line 119
    new-instance v6, La/ycl;

    .line 120
    .line 121
    invoke-direct {v6, v5}, La/ycl;-><init>(F)V

    .line 122
    .line 123
    .line 124
    check-cast v4, La/hgk0;

    .line 125
    .line 126
    invoke-virtual {v4, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-object v4, v0, La/cy40;->d:La/pz40;

    .line 130
    .line 131
    iget v5, v1, La/bwk;->d:F

    .line 132
    .line 133
    new-instance v6, La/ycl;

    .line 134
    .line 135
    invoke-direct {v6, v5}, La/ycl;-><init>(F)V

    .line 136
    .line 137
    .line 138
    check-cast v4, La/hgk0;

    .line 139
    .line 140
    invoke-virtual {v4, v6}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    iget-object v4, v0, La/cy40;->e:La/pz40;

    .line 144
    .line 145
    iget-object v5, v1, La/bwk;->e:La/w6k;

    .line 146
    .line 147
    check-cast v4, La/hgk0;

    .line 148
    .line 149
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 150
    .line 151
    .line 152
    iget-object v4, v0, La/cy40;->f:La/pz40;

    .line 153
    .line 154
    iget v5, v1, La/bwk;->f:F

    .line 155
    .line 156
    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 157
    .line 158
    .line 159
    move-result-object v5

    .line 160
    check-cast v4, La/hgk0;

    .line 161
    .line 162
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 163
    .line 164
    .line 165
    iget-object v4, v0, La/cy40;->g:La/pz40;

    .line 166
    .line 167
    iget-object v5, v1, La/bwk;->g:La/erq;

    .line 168
    .line 169
    check-cast v4, La/hgk0;

    .line 170
    .line 171
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 172
    .line 173
    .line 174
    iget-object v4, v0, La/cy40;->h:La/pz40;

    .line 175
    .line 176
    iget-object v5, v1, La/bwk;->h:La/t9o0;

    .line 177
    .line 178
    check-cast v4, La/hgk0;

    .line 179
    .line 180
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    iget-object v4, v0, La/cy40;->i:La/pz40;

    .line 184
    .line 185
    iget-object v5, v1, La/bwk;->i:La/sly;

    .line 186
    .line 187
    check-cast v4, La/hgk0;

    .line 188
    .line 189
    invoke-virtual {v4, v5}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 190
    .line 191
    .line 192
    iget-object v0, v0, La/cy40;->j:La/pz40;

    .line 193
    .line 194
    iget v1, v1, La/bwk;->j:F

    .line 195
    .line 196
    new-instance v4, La/ycl;

    .line 197
    .line 198
    invoke-direct {v4, v1}, La/ycl;-><init>(F)V

    .line 199
    .line 200
    .line 201
    check-cast v0, La/hgk0;

    .line 202
    .line 203
    invoke-virtual {v0, v4}, La/hgk0;->setValue(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 204
    .line 205
    .line 206
    :try_start_2
    invoke-static {v3}, La/rfk0;->q(La/rfk0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 207
    .line 208
    .line 209
    invoke-virtual {v2}, La/nz40;->w()La/wdx;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    invoke-virtual {v0}, La/wdx;->L()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v2}, La/nz40;->c()V

    .line 217
    .line 218
    .line 219
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    goto :goto_2

    .line 222
    :catchall_0
    move-exception v0

    .line 223
    goto :goto_1

    .line 224
    :catchall_1
    move-exception v0

    .line 225
    :try_start_3
    invoke-static {v3}, La/rfk0;->q(La/rfk0;)V

    .line 226
    .line 227
    .line 228
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 229
    :goto_1
    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 230
    :catchall_2
    move-exception v0

    .line 231
    invoke-virtual {v2}, La/nz40;->c()V

    .line 232
    .line 233
    .line 234
    throw v0

    .line 235
    :cond_1
    const-string v0, "Cannot create a mutable snapshot of an read-only snapshot"

    .line 236
    .line 237
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    :goto_2
    return-object v12

    .line 241
    :pswitch_1
    move-object/from16 v1, p1

    .line 242
    .line 243
    check-cast v1, La/mrn;

    .line 244
    .line 245
    move-object/from16 v2, p2

    .line 246
    .line 247
    check-cast v2, La/yje;

    .line 248
    .line 249
    move-object v15, v0

    .line 250
    check-cast v15, La/ysj;

    .line 251
    .line 252
    sget-object v0, La/ysj;->m2:La/qud;

    .line 253
    .line 254
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    if-eqz v1, :cond_6

    .line 258
    .line 259
    instance-of v0, v1, La/irn;

    .line 260
    .line 261
    if-eqz v0, :cond_2

    .line 262
    .line 263
    check-cast v1, La/irn;

    .line 264
    .line 265
    iget-wide v0, v1, La/irn;->a:D

    .line 266
    .line 267
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 268
    .line 269
    .line 270
    move-result-object v0

    .line 271
    new-instance v1, Lkotlin/Pair;

    .line 272
    .line 273
    const-string v2, "DefaultBetSumBottomSheetKey"

    .line 274
    .line 275
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 276
    .line 277
    .line 278
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-static {v0}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-static {v0, v15, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 287
    .line 288
    .line 289
    invoke-virtual {v15}, La/yo8;->x0()V

    .line 290
    .line 291
    .line 292
    goto :goto_3

    .line 293
    :cond_2
    instance-of v0, v1, La/lrn;

    .line 294
    .line 295
    if-eqz v0, :cond_4

    .line 296
    .line 297
    iget-object v13, v15, La/ysj;->k2:La/wdk0;

    .line 298
    .line 299
    if-eqz v13, :cond_3

    .line 300
    .line 301
    new-instance v14, La/xdk0;

    .line 302
    .line 303
    sget-object v17, La/rek0;->b:La/rek0;

    .line 304
    .line 305
    check-cast v1, La/lrn;

    .line 306
    .line 307
    iget-object v0, v1, La/lrn;->a:Ljava/lang/String;

    .line 308
    .line 309
    const/16 v22, 0x0

    .line 310
    .line 311
    const/16 v23, 0x7c

    .line 312
    .line 313
    const/16 v19, 0x0

    .line 314
    .line 315
    const/16 v20, 0x0

    .line 316
    .line 317
    const/16 v21, 0x0

    .line 318
    .line 319
    move-object/from16 v18, v0

    .line 320
    .line 321
    move-object/from16 v16, v14

    .line 322
    .line 323
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 324
    .line 325
    .line 326
    const/16 v20, 0x3fc

    .line 327
    .line 328
    const/16 v16, 0x0

    .line 329
    .line 330
    const/16 v17, 0x0

    .line 331
    .line 332
    const/16 v18, 0x0

    .line 333
    .line 334
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 335
    .line 336
    .line 337
    goto :goto_3

    .line 338
    :cond_3
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 339
    .line 340
    .line 341
    throw v12

    .line 342
    :cond_4
    instance-of v0, v1, La/jrn;

    .line 343
    .line 344
    if-eqz v0, :cond_5

    .line 345
    .line 346
    invoke-virtual {v15}, La/ysj;->V0()La/mhn0;

    .line 347
    .line 348
    .line 349
    move-result-object v0

    .line 350
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 351
    .line 352
    check-cast v1, La/jrn;

    .line 353
    .line 354
    iget-object v1, v1, La/jrn;->a:Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 357
    .line 358
    .line 359
    goto :goto_3

    .line 360
    :cond_5
    instance-of v0, v1, La/krn;

    .line 361
    .line 362
    if-eqz v0, :cond_6

    .line 363
    .line 364
    invoke-virtual {v15}, La/ysj;->V0()La/mhn0;

    .line 365
    .line 366
    .line 367
    move-result-object v0

    .line 368
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 369
    .line 370
    invoke-virtual {v0, v12}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setErrorText(Ljava/lang/CharSequence;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v15}, La/ysj;->V0()La/mhn0;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 378
    .line 379
    check-cast v1, La/krn;

    .line 380
    .line 381
    iget-object v1, v1, La/krn;->a:Ljava/lang/String;

    .line 382
    .line 383
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setHelperText(Ljava/lang/CharSequence;)V

    .line 384
    .line 385
    .line 386
    :goto_3
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 387
    .line 388
    goto :goto_4

    .line 389
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 390
    .line 391
    .line 392
    :goto_4
    return-object v12

    .line 393
    :pswitch_2
    move-object/from16 v1, p1

    .line 394
    .line 395
    check-cast v1, La/prn;

    .line 396
    .line 397
    move-object/from16 v2, p2

    .line 398
    .line 399
    check-cast v2, La/yje;

    .line 400
    .line 401
    check-cast v0, La/ysj;

    .line 402
    .line 403
    sget-object v2, La/ysj;->m2:La/qud;

    .line 404
    .line 405
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 406
    .line 407
    .line 408
    iget-object v2, v0, La/ysj;->i2:La/n0o0;

    .line 409
    .line 410
    if-eqz v1, :cond_9

    .line 411
    .line 412
    instance-of v3, v1, La/orn;

    .line 413
    .line 414
    if-eqz v3, :cond_7

    .line 415
    .line 416
    goto :goto_5

    .line 417
    :cond_7
    instance-of v3, v1, La/nrn;

    .line 418
    .line 419
    if-eqz v3, :cond_9

    .line 420
    .line 421
    check-cast v1, La/nrn;

    .line 422
    .line 423
    invoke-virtual {v0}, La/ysj;->V0()La/mhn0;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    iget-object v4, v3, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 428
    .line 429
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 430
    .line 431
    .line 432
    move-result-object v5

    .line 433
    iget-object v6, v1, La/nrn;->f:Ljava/lang/String;

    .line 434
    .line 435
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 436
    .line 437
    .line 438
    move-result-object v7

    .line 439
    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v7

    .line 443
    const-string v8, "drawable"

    .line 444
    .line 445
    invoke-virtual {v5, v6, v8, v7}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 446
    .line 447
    .line 448
    move-result v5

    .line 449
    if-eqz v5, :cond_8

    .line 450
    .line 451
    invoke-virtual {v0}, La/ysj;->V0()La/mhn0;

    .line 452
    .line 453
    .line 454
    move-result-object v6

    .line 455
    iget-object v6, v6, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 456
    .line 457
    invoke-virtual {v6, v5}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setEndIcon(I)V

    .line 458
    .line 459
    .line 460
    :cond_8
    invoke-virtual {v0}, La/ysj;->V0()La/mhn0;

    .line 461
    .line 462
    .line 463
    move-result-object v5

    .line 464
    iget-object v5, v5, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 465
    .line 466
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v6

    .line 470
    check-cast v6, La/da0;

    .line 471
    .line 472
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 473
    .line 474
    .line 475
    iget-object v5, v5, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 476
    .line 477
    invoke-virtual {v5, v6}, Lorg/xplatform/uikit/components/text_field/DsTextField;->c(Landroid/text/TextWatcher;)V

    .line 478
    .line 479
    .line 480
    iget-object v5, v1, La/nrn;->c:Ljava/lang/String;

    .line 481
    .line 482
    invoke-virtual {v4, v5}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->setText(Ljava/lang/CharSequence;)V

    .line 483
    .line 484
    .line 485
    invoke-virtual {v0}, La/ysj;->V0()La/mhn0;

    .line 486
    .line 487
    .line 488
    move-result-object v0

    .line 489
    iget-object v0, v0, La/mhn0;->c:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;

    .line 490
    .line 491
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 492
    .line 493
    .line 494
    move-result-object v2

    .line 495
    check-cast v2, La/da0;

    .line 496
    .line 497
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 498
    .line 499
    .line 500
    iget-object v0, v0, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetTextFieldBasic;->b:Lorg/xplatform/uikit/components/text_field/DsTextField;

    .line 501
    .line 502
    invoke-virtual {v0, v2}, Lorg/xplatform/uikit/components/text_field/DsTextField;->a(Landroid/text/TextWatcher;)V

    .line 503
    .line 504
    .line 505
    iget-object v0, v3, La/mhn0;->d:Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;

    .line 506
    .line 507
    iget-boolean v1, v1, La/nrn;->e:Z

    .line 508
    .line 509
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/bottom_sheet/presets/DsPresetButton;->setEnabled(Z)V

    .line 510
    .line 511
    .line 512
    new-instance v0, La/wsj;

    .line 513
    .line 514
    invoke-direct {v0, v3, v11}, La/wsj;-><init>(La/mhn0;B)V

    .line 515
    .line 516
    .line 517
    invoke-virtual {v4, v0}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 518
    .line 519
    .line 520
    :goto_5
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 521
    .line 522
    goto :goto_6

    .line 523
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 524
    .line 525
    .line 526
    :goto_6
    return-object v12

    .line 527
    :pswitch_3
    move-object/from16 v1, p1

    .line 528
    .line 529
    check-cast v1, Ljava/lang/Throwable;

    .line 530
    .line 531
    move-object/from16 v2, p2

    .line 532
    .line 533
    check-cast v2, La/yje;

    .line 534
    .line 535
    check-cast v0, La/j2j;

    .line 536
    .line 537
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 538
    .line 539
    .line 540
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 541
    .line 542
    return-object v0

    .line 543
    :pswitch_4
    move-object/from16 v1, p1

    .line 544
    .line 545
    check-cast v1, Ljava/lang/Throwable;

    .line 546
    .line 547
    move-object/from16 v2, p2

    .line 548
    .line 549
    check-cast v2, La/yje;

    .line 550
    .line 551
    check-cast v0, La/j2j;

    .line 552
    .line 553
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 554
    .line 555
    .line 556
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 557
    .line 558
    return-object v0

    .line 559
    :pswitch_5
    move-object/from16 v1, p1

    .line 560
    .line 561
    check-cast v1, Ljava/lang/Throwable;

    .line 562
    .line 563
    move-object/from16 v2, p2

    .line 564
    .line 565
    check-cast v2, La/yje;

    .line 566
    .line 567
    check-cast v0, La/j2j;

    .line 568
    .line 569
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 570
    .line 571
    .line 572
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 573
    .line 574
    return-object v0

    .line 575
    :pswitch_6
    move-object/from16 v1, p1

    .line 576
    .line 577
    check-cast v1, Ljava/lang/Throwable;

    .line 578
    .line 579
    move-object/from16 v2, p2

    .line 580
    .line 581
    check-cast v2, La/yje;

    .line 582
    .line 583
    check-cast v0, La/j2j;

    .line 584
    .line 585
    invoke-virtual {v0, v1}, La/j2j;->A(Ljava/lang/Throwable;)V

    .line 586
    .line 587
    .line 588
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 589
    .line 590
    return-object v0

    .line 591
    :pswitch_7
    move-object/from16 v1, p1

    .line 592
    .line 593
    check-cast v1, Ljava/lang/Throwable;

    .line 594
    .line 595
    move-object/from16 v2, p2

    .line 596
    .line 597
    check-cast v2, La/yje;

    .line 598
    .line 599
    check-cast v0, La/lwh;

    .line 600
    .line 601
    sget v2, La/lwh;->t:I

    .line 602
    .line 603
    iget-object v2, v0, La/lwh;->r:La/duj;

    .line 604
    .line 605
    new-instance v3, La/jwh;

    .line 606
    .line 607
    invoke-direct {v3, v0, v11}, La/jwh;-><init>(La/lwh;B)V

    .line 608
    .line 609
    .line 610
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 611
    .line 612
    .line 613
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 614
    .line 615
    return-object v0

    .line 616
    :pswitch_8
    move-object/from16 v1, p1

    .line 617
    .line 618
    check-cast v1, Ljava/lang/Throwable;

    .line 619
    .line 620
    move-object/from16 v2, p2

    .line 621
    .line 622
    check-cast v2, La/yje;

    .line 623
    .line 624
    check-cast v0, La/dvh;

    .line 625
    .line 626
    iget-object v2, v0, La/dvh;->t:La/duj;

    .line 627
    .line 628
    new-instance v3, La/yfg;

    .line 629
    .line 630
    invoke-direct {v3, v0, v7}, La/yfg;-><init>(Ljava/lang/Object;B)V

    .line 631
    .line 632
    .line 633
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 634
    .line 635
    .line 636
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object v0

    .line 639
    :pswitch_9
    move-object/from16 v1, p1

    .line 640
    .line 641
    check-cast v1, La/deg;

    .line 642
    .line 643
    move-object/from16 v2, p2

    .line 644
    .line 645
    check-cast v2, La/yje;

    .line 646
    .line 647
    check-cast v0, La/wcg;

    .line 648
    .line 649
    sget-object v2, La/wcg;->U1:La/usd;

    .line 650
    .line 651
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 652
    .line 653
    .line 654
    move-result-object v2

    .line 655
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 656
    .line 657
    .line 658
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 659
    .line 660
    .line 661
    move-result-object v3

    .line 662
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v3

    .line 666
    iget-object v4, v2, Landroidx/fragment/app/e;->c:La/pmi;

    .line 667
    .line 668
    invoke-virtual {v4}, La/pmi;->p()Ljava/util/List;

    .line 669
    .line 670
    .line 671
    move-result-object v4

    .line 672
    invoke-static {v4}, La/twn;->u(Ljava/util/List;)Ljava/util/ArrayList;

    .line 673
    .line 674
    .line 675
    move-result-object v5

    .line 676
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 677
    .line 678
    .line 679
    move-result-object v4

    .line 680
    :cond_a
    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 681
    .line 682
    .line 683
    move-result v6

    .line 684
    if-eqz v6, :cond_b

    .line 685
    .line 686
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 687
    .line 688
    .line 689
    move-result-object v6

    .line 690
    move-object v7, v6

    .line 691
    check-cast v7, Landroidx/fragment/app/Fragment;

    .line 692
    .line 693
    invoke-virtual {v7}, Landroidx/fragment/app/Fragment;->O()Z

    .line 694
    .line 695
    .line 696
    move-result v8

    .line 697
    if-nez v8, :cond_a

    .line 698
    .line 699
    iget-object v7, v7, Landroidx/fragment/app/Fragment;->B:Ljava/lang/String;

    .line 700
    .line 701
    invoke-static {v7, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 702
    .line 703
    .line 704
    move-result v7

    .line 705
    if-nez v7, :cond_a

    .line 706
    .line 707
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 708
    .line 709
    .line 710
    goto :goto_7

    .line 711
    :cond_b
    invoke-virtual {v2, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 712
    .line 713
    .line 714
    move-result-object v4

    .line 715
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 716
    .line 717
    .line 718
    move-result v6

    .line 719
    if-eqz v6, :cond_c

    .line 720
    .line 721
    if-eqz v4, :cond_c

    .line 722
    .line 723
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 724
    .line 725
    .line 726
    move-result v6

    .line 727
    if-ne v6, v10, :cond_c

    .line 728
    .line 729
    goto/16 :goto_c

    .line 730
    .line 731
    :cond_c
    new-instance v6, La/zb5;

    .line 732
    .line 733
    invoke-direct {v6, v2}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 734
    .line 735
    .line 736
    invoke-virtual {v6, v11, v11, v11, v11}, La/zb5;->p(IIII)V

    .line 737
    .line 738
    .line 739
    if-eqz v4, :cond_e

    .line 740
    .line 741
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->S()Z

    .line 742
    .line 743
    .line 744
    move-result v0

    .line 745
    if-eqz v0, :cond_d

    .line 746
    .line 747
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->O()Z

    .line 748
    .line 749
    .line 750
    move-result v0

    .line 751
    if-eqz v0, :cond_13

    .line 752
    .line 753
    :cond_d
    sget-object v0, La/lkz;->e:La/lkz;

    .line 754
    .line 755
    invoke-virtual {v6, v4, v0}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 756
    .line 757
    .line 758
    invoke-virtual {v6, v4}, La/zb5;->r(Landroidx/fragment/app/Fragment;)V

    .line 759
    .line 760
    .line 761
    goto/16 :goto_a

    .line 762
    .line 763
    :cond_e
    sget-object v2, La/beg;->a:La/beg;

    .line 764
    .line 765
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    move-result v2

    .line 769
    if-eqz v2, :cond_f

    .line 770
    .line 771
    sget-object v1, La/afg;->S1:La/std;

    .line 772
    .line 773
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 774
    .line 775
    .line 776
    move-result-object v0

    .line 777
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 778
    .line 779
    .line 780
    new-instance v1, La/afg;

    .line 781
    .line 782
    invoke-direct {v1}, La/afg;-><init>()V

    .line 783
    .line 784
    .line 785
    sget-object v2, La/afg;->U1:[La/iiy;

    .line 786
    .line 787
    aget-object v2, v2, v11

    .line 788
    .line 789
    iget-object v4, v1, La/afg;->O1:La/khf0;

    .line 790
    .line 791
    invoke-virtual {v4, v1, v2, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 792
    .line 793
    .line 794
    goto :goto_9

    .line 795
    :cond_f
    sget-object v2, La/ceg;->a:La/ceg;

    .line 796
    .line 797
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 798
    .line 799
    .line 800
    move-result v2

    .line 801
    if-eqz v2, :cond_11

    .line 802
    .line 803
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 804
    .line 805
    .line 806
    move-result-object v1

    .line 807
    iget v1, v1, Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;->d:I

    .line 808
    .line 809
    sget-object v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 810
    .line 811
    iget-byte v2, v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;->a:B

    .line 812
    .line 813
    if-ne v1, v2, :cond_10

    .line 814
    .line 815
    sget-object v1, La/d7o0;->R1:La/s9m0;

    .line 816
    .line 817
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 818
    .line 819
    .line 820
    move-result-object v0

    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    new-instance v1, La/d7o0;

    .line 825
    .line 826
    invoke-direct {v1}, La/d7o0;-><init>()V

    .line 827
    .line 828
    .line 829
    sget-object v2, La/d7o0;->S1:[La/iiy;

    .line 830
    .line 831
    aget-object v2, v2, v11

    .line 832
    .line 833
    iget-object v4, v1, La/d7o0;->O1:La/khf0;

    .line 834
    .line 835
    invoke-virtual {v4, v1, v2, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 836
    .line 837
    .line 838
    goto :goto_9

    .line 839
    :cond_10
    sget-object v1, La/zfg;->S1:La/kud;

    .line 840
    .line 841
    invoke-virtual {v0}, La/wcg;->H0()Lorg/xplatform/cyber/section/api/championships/regular/presentation/CyberChampParams;

    .line 842
    .line 843
    .line 844
    move-result-object v0

    .line 845
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    new-instance v1, La/zfg;

    .line 849
    .line 850
    invoke-direct {v1}, La/zfg;-><init>()V

    .line 851
    .line 852
    .line 853
    sget-object v2, La/zfg;->U1:[La/iiy;

    .line 854
    .line 855
    aget-object v2, v2, v11

    .line 856
    .line 857
    iget-object v4, v1, La/zfg;->O1:La/khf0;

    .line 858
    .line 859
    invoke-virtual {v4, v1, v2, v0}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 860
    .line 861
    .line 862
    goto :goto_9

    .line 863
    :cond_11
    instance-of v0, v1, La/aeg;

    .line 864
    .line 865
    if-eqz v0, :cond_15

    .line 866
    .line 867
    check-cast v1, La/aeg;

    .line 868
    .line 869
    iget-boolean v0, v1, La/aeg;->a:Z

    .line 870
    .line 871
    if-eqz v0, :cond_12

    .line 872
    .line 873
    sget-object v0, La/dsh;->V1:La/usd;

    .line 874
    .line 875
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 876
    .line 877
    .line 878
    new-instance v0, La/dsh;

    .line 879
    .line 880
    invoke-direct {v0}, La/dsh;-><init>()V

    .line 881
    .line 882
    .line 883
    :goto_8
    move-object v1, v0

    .line 884
    goto :goto_9

    .line 885
    :cond_12
    sget-object v0, La/dcg;->P1:La/nwd;

    .line 886
    .line 887
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 888
    .line 889
    .line 890
    new-instance v0, La/dcg;

    .line 891
    .line 892
    invoke-direct {v0}, La/dcg;-><init>()V

    .line 893
    .line 894
    .line 895
    goto :goto_8

    .line 896
    :goto_9
    const v0, 0x7f0a060f

    .line 897
    .line 898
    .line 899
    invoke-virtual {v6, v0, v1, v3, v10}, La/zb5;->k(ILandroidx/fragment/app/Fragment;Ljava/lang/String;I)V

    .line 900
    .line 901
    .line 902
    :cond_13
    :goto_a
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 907
    .line 908
    .line 909
    move-result v1

    .line 910
    if-eqz v1, :cond_14

    .line 911
    .line 912
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 913
    .line 914
    .line 915
    move-result-object v1

    .line 916
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 917
    .line 918
    sget-object v2, La/lkz;->d:La/lkz;

    .line 919
    .line 920
    invoke-virtual {v6, v1, v2}, La/zb5;->q(Landroidx/fragment/app/Fragment;La/lkz;)V

    .line 921
    .line 922
    .line 923
    invoke-virtual {v6, v1}, La/zb5;->m(Landroidx/fragment/app/Fragment;)V

    .line 924
    .line 925
    .line 926
    goto :goto_b

    .line 927
    :cond_14
    invoke-virtual {v6}, La/zb5;->h()V

    .line 928
    .line 929
    .line 930
    :goto_c
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 931
    .line 932
    goto :goto_d

    .line 933
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 934
    .line 935
    .line 936
    :goto_d
    return-object v12

    .line 937
    :pswitch_a
    move-object/from16 v1, p1

    .line 938
    .line 939
    check-cast v1, La/zy5;

    .line 940
    .line 941
    move-object/from16 v2, p2

    .line 942
    .line 943
    check-cast v2, La/yje;

    .line 944
    .line 945
    move-object v15, v0

    .line 946
    check-cast v15, La/wff;

    .line 947
    .line 948
    iget-object v0, v15, La/wff;->i:La/mne;

    .line 949
    .line 950
    if-nez v1, :cond_16

    .line 951
    .line 952
    goto/16 :goto_e

    .line 953
    .line 954
    :cond_16
    instance-of v2, v1, La/fy5;

    .line 955
    .line 956
    if-eqz v2, :cond_19

    .line 957
    .line 958
    iget-object v1, v15, La/wff;->g:La/lzt;

    .line 959
    .line 960
    invoke-virtual {v1}, La/lzt;->a()Z

    .line 961
    .line 962
    .line 963
    move-result v1

    .line 964
    if-nez v1, :cond_17

    .line 965
    .line 966
    goto/16 :goto_e

    .line 967
    .line 968
    :cond_17
    iget-object v1, v15, La/wff;->m:La/bby;

    .line 969
    .line 970
    if-eqz v1, :cond_18

    .line 971
    .line 972
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 973
    .line 974
    .line 975
    move-result v1

    .line 976
    if-ne v1, v10, :cond_18

    .line 977
    .line 978
    goto/16 :goto_e

    .line 979
    .line 980
    :cond_18
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 981
    .line 982
    .line 983
    move-result-object v2

    .line 984
    new-instance v13, La/x6f;

    .line 985
    .line 986
    const/16 v19, 0x0

    .line 987
    .line 988
    const/16 v20, 0x7

    .line 989
    .line 990
    const/4 v14, 0x1

    .line 991
    const-class v16, La/wff;

    .line 992
    .line 993
    const-string v17, "handleGameError"

    .line 994
    .line 995
    const-string v18, "handleGameError(Ljava/lang/Throwable;)V"

    .line 996
    .line 997
    invoke-direct/range {v13 .. v20}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 998
    .line 999
    .line 1000
    iget-object v5, v0, La/mne;->b:La/dvj;

    .line 1001
    .line 1002
    new-instance v6, La/igb;

    .line 1003
    .line 1004
    const/16 v0, 0x10

    .line 1005
    .line 1006
    invoke-direct {v6, v15, v12, v0}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 1007
    .line 1008
    .line 1009
    const/16 v7, 0xa

    .line 1010
    .line 1011
    const/4 v4, 0x0

    .line 1012
    move-object v3, v13

    .line 1013
    invoke-static/range {v2 .. v7}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v0

    .line 1017
    iput-object v0, v15, La/wff;->m:La/bby;

    .line 1018
    .line 1019
    goto :goto_e

    .line 1020
    :cond_19
    instance-of v2, v1, La/yy5;

    .line 1021
    .line 1022
    sget-object v3, La/qff;->a:La/qff;

    .line 1023
    .line 1024
    if-eqz v2, :cond_1b

    .line 1025
    .line 1026
    iget-object v1, v15, La/wff;->l:La/bby;

    .line 1027
    .line 1028
    if-eqz v1, :cond_1a

    .line 1029
    .line 1030
    invoke-interface {v1}, La/bby;->isActive()Z

    .line 1031
    .line 1032
    .line 1033
    move-result v1

    .line 1034
    if-ne v1, v10, :cond_1a

    .line 1035
    .line 1036
    goto :goto_e

    .line 1037
    :cond_1a
    invoke-virtual {v15, v3}, La/wff;->x(La/uff;)V

    .line 1038
    .line 1039
    .line 1040
    invoke-static {v15}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 1041
    .line 1042
    .line 1043
    move-result-object v4

    .line 1044
    iget-object v7, v0, La/mne;->b:La/dvj;

    .line 1045
    .line 1046
    new-instance v13, La/x6f;

    .line 1047
    .line 1048
    const/16 v19, 0x0

    .line 1049
    .line 1050
    const/16 v20, 0x6

    .line 1051
    .line 1052
    const/4 v14, 0x1

    .line 1053
    const-class v16, La/wff;

    .line 1054
    .line 1055
    const-string v17, "handleGameError"

    .line 1056
    .line 1057
    const-string v18, "handleGameError(Ljava/lang/Throwable;)V"

    .line 1058
    .line 1059
    invoke-direct/range {v13 .. v20}, La/x6f;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 1060
    .line 1061
    .line 1062
    new-instance v8, La/ex1;

    .line 1063
    .line 1064
    const/16 v0, 0x1a

    .line 1065
    .line 1066
    invoke-direct {v8, v15, v12, v0}, La/ex1;-><init>(La/w46;La/yje;B)V

    .line 1067
    .line 1068
    .line 1069
    const/16 v9, 0xa

    .line 1070
    .line 1071
    const/4 v6, 0x0

    .line 1072
    move-object v5, v13

    .line 1073
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v0

    .line 1077
    iput-object v0, v15, La/wff;->l:La/bby;

    .line 1078
    .line 1079
    goto :goto_e

    .line 1080
    :cond_1b
    instance-of v0, v1, La/ry5;

    .line 1081
    .line 1082
    if-eqz v0, :cond_1c

    .line 1083
    .line 1084
    sget-object v0, La/pff;->a:La/pff;

    .line 1085
    .line 1086
    invoke-virtual {v15, v0}, La/wff;->x(La/uff;)V

    .line 1087
    .line 1088
    .line 1089
    goto :goto_e

    .line 1090
    :cond_1c
    instance-of v0, v1, La/ty5;

    .line 1091
    .line 1092
    if-eqz v0, :cond_1d

    .line 1093
    .line 1094
    iget-object v0, v15, La/wff;->j:La/peg0;

    .line 1095
    .line 1096
    iget-object v0, v0, La/peg0;->b:Ljava/lang/Object;

    .line 1097
    .line 1098
    check-cast v0, La/vgf;

    .line 1099
    .line 1100
    iget-object v0, v0, La/vgf;->c:La/fgf;

    .line 1101
    .line 1102
    new-instance v1, La/lgf;

    .line 1103
    .line 1104
    invoke-direct {v1}, La/lgf;-><init>()V

    .line 1105
    .line 1106
    .line 1107
    iput-object v1, v0, La/fgf;->a:La/lgf;

    .line 1108
    .line 1109
    invoke-virtual {v15, v3}, La/wff;->x(La/uff;)V

    .line 1110
    .line 1111
    .line 1112
    :cond_1d
    :goto_e
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1113
    .line 1114
    return-object v0

    .line 1115
    :pswitch_b
    move-object/from16 v1, p1

    .line 1116
    .line 1117
    check-cast v1, Ljava/lang/Throwable;

    .line 1118
    .line 1119
    move-object/from16 v2, p2

    .line 1120
    .line 1121
    check-cast v2, La/yje;

    .line 1122
    .line 1123
    check-cast v0, La/wze;

    .line 1124
    .line 1125
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    return-object v0

    .line 1131
    :pswitch_c
    move-object/from16 v1, p1

    .line 1132
    .line 1133
    check-cast v1, Ljava/lang/Throwable;

    .line 1134
    .line 1135
    move-object/from16 v2, p2

    .line 1136
    .line 1137
    check-cast v2, La/yje;

    .line 1138
    .line 1139
    check-cast v0, La/wze;

    .line 1140
    .line 1141
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1142
    .line 1143
    .line 1144
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1145
    .line 1146
    return-object v0

    .line 1147
    :pswitch_d
    move-object/from16 v1, p1

    .line 1148
    .line 1149
    check-cast v1, Ljava/lang/Throwable;

    .line 1150
    .line 1151
    move-object/from16 v2, p2

    .line 1152
    .line 1153
    check-cast v2, La/yje;

    .line 1154
    .line 1155
    check-cast v0, La/wze;

    .line 1156
    .line 1157
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1158
    .line 1159
    .line 1160
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1161
    .line 1162
    return-object v0

    .line 1163
    :pswitch_e
    move-object/from16 v1, p1

    .line 1164
    .line 1165
    check-cast v1, Ljava/lang/Throwable;

    .line 1166
    .line 1167
    move-object/from16 v2, p2

    .line 1168
    .line 1169
    check-cast v2, La/yje;

    .line 1170
    .line 1171
    check-cast v0, La/wze;

    .line 1172
    .line 1173
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1174
    .line 1175
    .line 1176
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1177
    .line 1178
    return-object v0

    .line 1179
    :pswitch_f
    move-object/from16 v1, p1

    .line 1180
    .line 1181
    check-cast v1, Ljava/lang/Throwable;

    .line 1182
    .line 1183
    move-object/from16 v2, p2

    .line 1184
    .line 1185
    check-cast v2, La/yje;

    .line 1186
    .line 1187
    check-cast v0, La/wze;

    .line 1188
    .line 1189
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1190
    .line 1191
    .line 1192
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1193
    .line 1194
    return-object v0

    .line 1195
    :pswitch_10
    move-object/from16 v1, p1

    .line 1196
    .line 1197
    check-cast v1, Ljava/lang/Throwable;

    .line 1198
    .line 1199
    move-object/from16 v2, p2

    .line 1200
    .line 1201
    check-cast v2, La/yje;

    .line 1202
    .line 1203
    check-cast v0, La/wze;

    .line 1204
    .line 1205
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1206
    .line 1207
    .line 1208
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1209
    .line 1210
    return-object v0

    .line 1211
    :pswitch_11
    move-object/from16 v1, p1

    .line 1212
    .line 1213
    check-cast v1, Ljava/lang/Throwable;

    .line 1214
    .line 1215
    move-object/from16 v2, p2

    .line 1216
    .line 1217
    check-cast v2, La/yje;

    .line 1218
    .line 1219
    check-cast v0, La/wze;

    .line 1220
    .line 1221
    invoke-virtual {v0, v1}, La/wze;->A(Ljava/lang/Throwable;)V

    .line 1222
    .line 1223
    .line 1224
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1225
    .line 1226
    return-object v0

    .line 1227
    :pswitch_12
    move-object/from16 v1, p1

    .line 1228
    .line 1229
    check-cast v1, Ljava/lang/Throwable;

    .line 1230
    .line 1231
    move-object/from16 v2, p2

    .line 1232
    .line 1233
    check-cast v2, La/yje;

    .line 1234
    .line 1235
    check-cast v0, La/fae;

    .line 1236
    .line 1237
    invoke-virtual {v0, v1}, La/fae;->y(Ljava/lang/Throwable;)V

    .line 1238
    .line 1239
    .line 1240
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1241
    .line 1242
    return-object v0

    .line 1243
    :pswitch_13
    move-object/from16 v1, p1

    .line 1244
    .line 1245
    check-cast v1, Ljava/lang/Boolean;

    .line 1246
    .line 1247
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 1248
    .line 1249
    .line 1250
    move-result v1

    .line 1251
    move-object/from16 v2, p2

    .line 1252
    .line 1253
    check-cast v2, La/yje;

    .line 1254
    .line 1255
    check-cast v0, La/e7e;

    .line 1256
    .line 1257
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 1258
    .line 1259
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v2

    .line 1263
    iget-object v2, v2, La/kzq;->x:Lcom/google/android/material/appbar/MaterialToolbar;

    .line 1264
    .line 1265
    invoke-virtual {v2}, Landroidx/appcompat/widget/Toolbar;->getMenu()Landroid/view/Menu;

    .line 1266
    .line 1267
    .line 1268
    move-result-object v2

    .line 1269
    const v3, 0x7f0a0a7b

    .line 1270
    .line 1271
    .line 1272
    invoke-interface {v2, v3}, Landroid/view/Menu;->findItem(I)Landroid/view/MenuItem;

    .line 1273
    .line 1274
    .line 1275
    move-result-object v2

    .line 1276
    if-eqz v1, :cond_1e

    .line 1277
    .line 1278
    const v3, 0x7f080a08

    .line 1279
    .line 1280
    .line 1281
    goto :goto_f

    .line 1282
    :cond_1e
    const v3, 0x7f080a09

    .line 1283
    .line 1284
    .line 1285
    :goto_f
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setIcon(I)Landroid/view/MenuItem;

    .line 1286
    .line 1287
    .line 1288
    new-instance v3, La/x6e;

    .line 1289
    .line 1290
    invoke-direct {v3, v0, v1}, La/x6e;-><init>(La/e7e;Z)V

    .line 1291
    .line 1292
    .line 1293
    invoke-interface {v2, v3}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 1294
    .line 1295
    .line 1296
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1297
    .line 1298
    return-object v0

    .line 1299
    :pswitch_14
    move-object/from16 v1, p1

    .line 1300
    .line 1301
    check-cast v1, La/exb;

    .line 1302
    .line 1303
    move-object/from16 v2, p2

    .line 1304
    .line 1305
    check-cast v2, La/yje;

    .line 1306
    .line 1307
    check-cast v0, La/e7e;

    .line 1308
    .line 1309
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 1310
    .line 1311
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1312
    .line 1313
    .line 1314
    move-result-object v2

    .line 1315
    iget-object v3, v2, La/kzq;->f:Lcom/google/android/material/textfield/TextInputEditText;

    .line 1316
    .line 1317
    iget-boolean v4, v1, La/exb;->a:Z

    .line 1318
    .line 1319
    iget-boolean v5, v1, La/exb;->c:Z

    .line 1320
    .line 1321
    iget-boolean v6, v1, La/exb;->b:Z

    .line 1322
    .line 1323
    if-nez v4, :cond_1f

    .line 1324
    .line 1325
    invoke-static {v3}, La/j120;->X(Landroid/view/View;)V

    .line 1326
    .line 1327
    .line 1328
    :cond_1f
    iget-object v4, v2, La/kzq;->i:Landroid/widget/ImageView;

    .line 1329
    .line 1330
    iget-object v2, v2, La/kzq;->j:Landroid/widget/ImageView;

    .line 1331
    .line 1332
    iget-boolean v1, v1, La/exb;->a:Z

    .line 1333
    .line 1334
    invoke-virtual {v3, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 1335
    .line 1336
    .line 1337
    invoke-virtual {v2, v6}, Landroid/view/View;->setEnabled(Z)V

    .line 1338
    .line 1339
    .line 1340
    const v1, 0x3f19999a    # 0.6f

    .line 1341
    .line 1342
    .line 1343
    const/high16 v3, 0x3f800000    # 1.0f

    .line 1344
    .line 1345
    if-eqz v6, :cond_20

    .line 1346
    .line 1347
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v0

    .line 1351
    iget-object v0, v0, La/kzq;->s:Lcom/google/android/material/progressindicator/CircularProgressIndicator;

    .line 1352
    .line 1353
    invoke-virtual {v0}, Landroid/widget/ProgressBar;->getProgress()I

    .line 1354
    .line 1355
    .line 1356
    move-result v0

    .line 1357
    if-nez v0, :cond_20

    .line 1358
    .line 1359
    move v0, v3

    .line 1360
    goto :goto_10

    .line 1361
    :cond_20
    move v0, v1

    .line 1362
    :goto_10
    invoke-virtual {v2, v0}, Landroid/view/View;->setAlpha(F)V

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v4, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 1366
    .line 1367
    .line 1368
    if-eqz v5, :cond_21

    .line 1369
    .line 1370
    move v1, v3

    .line 1371
    :cond_21
    invoke-virtual {v4, v1}, Landroid/view/View;->setAlpha(F)V

    .line 1372
    .line 1373
    .line 1374
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1375
    .line 1376
    return-object v0

    .line 1377
    :pswitch_15
    move-object/from16 v1, p1

    .line 1378
    .line 1379
    check-cast v1, La/b9e;

    .line 1380
    .line 1381
    move-object/from16 v2, p2

    .line 1382
    .line 1383
    check-cast v2, La/yje;

    .line 1384
    .line 1385
    check-cast v0, La/e7e;

    .line 1386
    .line 1387
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 1388
    .line 1389
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1390
    .line 1391
    .line 1392
    if-eqz v1, :cond_24

    .line 1393
    .line 1394
    instance-of v2, v1, La/y8e;

    .line 1395
    .line 1396
    if-eqz v2, :cond_22

    .line 1397
    .line 1398
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v2

    .line 1402
    iget-object v3, v2, La/kzq;->l:La/jk3;

    .line 1403
    .line 1404
    iget-object v4, v3, La/jk3;->b:Landroid/view/ViewGroup;

    .line 1405
    .line 1406
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1407
    .line 1408
    iget-object v5, v3, La/jk3;->d:Landroid/view/View;

    .line 1409
    .line 1410
    check-cast v5, Lcom/google/android/material/imageview/ShapeableImageView;

    .line 1411
    .line 1412
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1413
    .line 1414
    .line 1415
    iget-object v4, v2, La/kzq;->b:Landroid/view/View;

    .line 1416
    .line 1417
    invoke-virtual {v4, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1418
    .line 1419
    .line 1420
    iget-object v2, v2, La/kzq;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 1421
    .line 1422
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1423
    .line 1424
    .line 1425
    sget-object v2, La/u0d;->a:Ljava/util/List;

    .line 1426
    .line 1427
    invoke-static {v5}, La/u0d;->a(Landroid/widget/ImageView;)V

    .line 1428
    .line 1429
    .line 1430
    const v2, 0x7f080aca

    .line 1431
    .line 1432
    .line 1433
    invoke-virtual {v5, v2}, Landroidx/appcompat/widget/AppCompatImageView;->setImageResource(I)V

    .line 1434
    .line 1435
    .line 1436
    iget-object v2, v3, La/jk3;->e:Landroid/view/View;

    .line 1437
    .line 1438
    check-cast v2, Lorg/xplatform/consultantchat/presentation/views/MiddleMultilineTextView;

    .line 1439
    .line 1440
    check-cast v1, La/y8e;

    .line 1441
    .line 1442
    iget-object v1, v1, La/y8e;->a:Ljava/io/File;

    .line 1443
    .line 1444
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 1445
    .line 1446
    .line 1447
    move-result-object v4

    .line 1448
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1449
    .line 1450
    .line 1451
    iget-object v2, v3, La/jk3;->f:Landroid/view/View;

    .line 1452
    .line 1453
    check-cast v2, Landroid/widget/TextView;

    .line 1454
    .line 1455
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1456
    .line 1457
    .line 1458
    move-result-object v0

    .line 1459
    invoke-virtual {v1}, Ljava/io/File;->length()J

    .line 1460
    .line 1461
    .line 1462
    move-result-wide v3

    .line 1463
    invoke-static {v0, v3, v4}, La/ahb;->N(Landroid/content/Context;J)Ljava/lang/String;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v0

    .line 1467
    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1468
    .line 1469
    .line 1470
    goto :goto_11

    .line 1471
    :cond_22
    instance-of v2, v1, La/z8e;

    .line 1472
    .line 1473
    if-eqz v2, :cond_23

    .line 1474
    .line 1475
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v2

    .line 1479
    iget-object v3, v2, La/kzq;->l:La/jk3;

    .line 1480
    .line 1481
    iget-object v3, v3, La/jk3;->b:Landroid/view/ViewGroup;

    .line 1482
    .line 1483
    check-cast v3, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1484
    .line 1485
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1486
    .line 1487
    .line 1488
    iget-object v3, v2, La/kzq;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 1489
    .line 1490
    invoke-virtual {v3, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1491
    .line 1492
    .line 1493
    iget-object v2, v2, La/kzq;->b:Landroid/view/View;

    .line 1494
    .line 1495
    invoke-virtual {v2, v11}, Landroid/view/View;->setVisibility(I)V

    .line 1496
    .line 1497
    .line 1498
    iget-object v0, v0, La/e7e;->W1:La/a8z;

    .line 1499
    .line 1500
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v0

    .line 1504
    check-cast v0, La/n14;

    .line 1505
    .line 1506
    check-cast v1, La/z8e;

    .line 1507
    .line 1508
    iget-object v1, v1, La/z8e;->a:Ljava/util/ArrayList;

    .line 1509
    .line 1510
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 1511
    .line 1512
    .line 1513
    goto :goto_11

    .line 1514
    :cond_23
    instance-of v1, v1, La/a9e;

    .line 1515
    .line 1516
    if-eqz v1, :cond_24

    .line 1517
    .line 1518
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1519
    .line 1520
    .line 1521
    move-result-object v1

    .line 1522
    iget-object v1, v1, La/kzq;->l:La/jk3;

    .line 1523
    .line 1524
    iget-object v1, v1, La/jk3;->b:Landroid/view/ViewGroup;

    .line 1525
    .line 1526
    check-cast v1, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1527
    .line 1528
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1529
    .line 1530
    .line 1531
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1532
    .line 1533
    .line 1534
    move-result-object v1

    .line 1535
    iget-object v1, v1, La/kzq;->n:Landroidx/recyclerview/widget/RecyclerView;

    .line 1536
    .line 1537
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1538
    .line 1539
    .line 1540
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 1541
    .line 1542
    .line 1543
    move-result-object v0

    .line 1544
    iget-object v0, v0, La/kzq;->b:Landroid/view/View;

    .line 1545
    .line 1546
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 1547
    .line 1548
    .line 1549
    :goto_11
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1550
    .line 1551
    goto :goto_12

    .line 1552
    :cond_24
    invoke-static {}, La/t9f;->b()V

    .line 1553
    .line 1554
    .line 1555
    :goto_12
    return-object v12

    .line 1556
    :pswitch_16
    move-object/from16 v1, p1

    .line 1557
    .line 1558
    check-cast v1, La/p6e;

    .line 1559
    .line 1560
    move-object/from16 v9, p2

    .line 1561
    .line 1562
    check-cast v9, La/yje;

    .line 1563
    .line 1564
    move-object v15, v0

    .line 1565
    check-cast v15, La/e7e;

    .line 1566
    .line 1567
    sget-object v0, La/e7e;->d2:La/kwd;

    .line 1568
    .line 1569
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1570
    .line 1571
    .line 1572
    sget-object v17, La/rek0;->b:La/rek0;

    .line 1573
    .line 1574
    instance-of v0, v1, La/h6e;

    .line 1575
    .line 1576
    if-eqz v0, :cond_26

    .line 1577
    .line 1578
    check-cast v1, La/h6e;

    .line 1579
    .line 1580
    iget-object v0, v1, La/h6e;->a:Ljava/io/File;

    .line 1581
    .line 1582
    iget-object v1, v1, La/h6e;->b:Ljava/lang/String;

    .line 1583
    .line 1584
    new-instance v2, Landroid/content/Intent;

    .line 1585
    .line 1586
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 1587
    .line 1588
    .line 1589
    const-string v3, "android.intent.action.VIEW"

    .line 1590
    .line 1591
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 1592
    .line 1593
    .line 1594
    invoke-virtual {v2, v10}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1595
    .line 1596
    .line 1597
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1598
    .line 1599
    .line 1600
    move-result-object v3

    .line 1601
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1602
    .line 1603
    .line 1604
    move-result-object v4

    .line 1605
    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 1606
    .line 1607
    .line 1608
    move-result-object v4

    .line 1609
    invoke-virtual {v4}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v4

    .line 1613
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1614
    .line 1615
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1616
    .line 1617
    .line 1618
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1619
    .line 1620
    .line 1621
    const-string v4, ".provider"

    .line 1622
    .line 1623
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1624
    .line 1625
    .line 1626
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1627
    .line 1628
    .line 1629
    move-result-object v4

    .line 1630
    invoke-static {v3, v0, v4}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    invoke-virtual {v2, v0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 1635
    .line 1636
    .line 1637
    :try_start_5
    invoke-virtual {v15, v2}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 1638
    .line 1639
    .line 1640
    goto/16 :goto_13

    .line 1641
    .line 1642
    :catchall_3
    iget-object v13, v15, La/e7e;->N1:La/wdk0;

    .line 1643
    .line 1644
    if-eqz v13, :cond_25

    .line 1645
    .line 1646
    new-instance v14, La/xdk0;

    .line 1647
    .line 1648
    const v0, 0x7f130a82

    .line 1649
    .line 1650
    .line 1651
    invoke-virtual {v15, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v18

    .line 1655
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1656
    .line 1657
    .line 1658
    const/16 v22, 0x0

    .line 1659
    .line 1660
    const/16 v23, 0x7c

    .line 1661
    .line 1662
    const/16 v19, 0x0

    .line 1663
    .line 1664
    const/16 v20, 0x0

    .line 1665
    .line 1666
    const/16 v21, 0x0

    .line 1667
    .line 1668
    move-object/from16 v16, v14

    .line 1669
    .line 1670
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1671
    .line 1672
    .line 1673
    const/16 v20, 0x3fc

    .line 1674
    .line 1675
    const/16 v16, 0x0

    .line 1676
    .line 1677
    const/16 v17, 0x0

    .line 1678
    .line 1679
    const/16 v18, 0x0

    .line 1680
    .line 1681
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1682
    .line 1683
    .line 1684
    goto/16 :goto_13

    .line 1685
    .line 1686
    :cond_25
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1687
    .line 1688
    .line 1689
    throw v12

    .line 1690
    :cond_26
    instance-of v0, v1, La/l6e;

    .line 1691
    .line 1692
    if-eqz v0, :cond_27

    .line 1693
    .line 1694
    check-cast v1, La/l6e;

    .line 1695
    .line 1696
    iget-object v0, v1, La/l6e;->a:Ljava/util/ArrayList;

    .line 1697
    .line 1698
    invoke-static {v15}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1699
    .line 1700
    .line 1701
    sget-object v1, La/lbe;->g2:La/qud;

    .line 1702
    .line 1703
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v2

    .line 1707
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1708
    .line 1709
    .line 1710
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1711
    .line 1712
    .line 1713
    new-instance v1, La/lbe;

    .line 1714
    .line 1715
    invoke-direct {v1}, La/lbe;-><init>()V

    .line 1716
    .line 1717
    .line 1718
    sget-object v3, La/lbe;->h2:[La/iiy;

    .line 1719
    .line 1720
    aget-object v3, v3, v10

    .line 1721
    .line 1722
    iget-object v4, v1, La/lbe;->f2:La/es;

    .line 1723
    .line 1724
    invoke-virtual {v4, v1, v3, v0}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 1725
    .line 1726
    .line 1727
    const-string v0, "send_message_error"

    .line 1728
    .line 1729
    invoke-virtual {v1, v2, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1730
    .line 1731
    .line 1732
    goto/16 :goto_13

    .line 1733
    .line 1734
    :cond_27
    instance-of v0, v1, La/i6e;

    .line 1735
    .line 1736
    if-eqz v0, :cond_28

    .line 1737
    .line 1738
    check-cast v1, La/i6e;

    .line 1739
    .line 1740
    iget-object v0, v1, La/i6e;->a:Lorg/xplatform/consultantchat/presentation/dialogs/rate/model/RatingModel;

    .line 1741
    .line 1742
    invoke-static {v15}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1743
    .line 1744
    .line 1745
    iget-object v1, v15, La/e7e;->S1:Landroid/os/Handler;

    .line 1746
    .line 1747
    iget-object v2, v15, La/e7e;->Z1:Ljava/lang/Runnable;

    .line 1748
    .line 1749
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1750
    .line 1751
    .line 1752
    new-instance v2, La/a4e;

    .line 1753
    .line 1754
    invoke-direct {v2, v15, v0, v10}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1755
    .line 1756
    .line 1757
    iput-object v2, v15, La/e7e;->Z1:Ljava/lang/Runnable;

    .line 1758
    .line 1759
    const-wide/16 v3, 0x15e

    .line 1760
    .line 1761
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1762
    .line 1763
    .line 1764
    goto/16 :goto_13

    .line 1765
    .line 1766
    :cond_28
    instance-of v0, v1, La/n6e;

    .line 1767
    .line 1768
    if-eqz v0, :cond_2a

    .line 1769
    .line 1770
    iget-object v0, v15, La/e7e;->M1:La/ii;

    .line 1771
    .line 1772
    if-eqz v0, :cond_29

    .line 1773
    .line 1774
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1775
    .line 1776
    invoke-virtual {v15, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v17

    .line 1780
    const v1, 0x7f1304f2

    .line 1781
    .line 1782
    .line 1783
    invoke-virtual {v15, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v1

    .line 1787
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1788
    .line 1789
    .line 1790
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1791
    .line 1792
    .line 1793
    move-result-object v2

    .line 1794
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 1795
    .line 1796
    .line 1797
    move-result-object v2

    .line 1798
    invoke-static {v2, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 1799
    .line 1800
    .line 1801
    move-result-object v2

    .line 1802
    invoke-static {v1, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1803
    .line 1804
    .line 1805
    move-result-object v18

    .line 1806
    invoke-virtual {v15, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1807
    .line 1808
    .line 1809
    move-result-object v19

    .line 1810
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1811
    .line 1812
    .line 1813
    sget-object v25, La/n12;->b:La/n12;

    .line 1814
    .line 1815
    const/16 v26, 0x0

    .line 1816
    .line 1817
    const/16 v27, 0x5f8

    .line 1818
    .line 1819
    const/16 v20, 0x0

    .line 1820
    .line 1821
    const/16 v21, 0x0

    .line 1822
    .line 1823
    const/16 v22, 0x0

    .line 1824
    .line 1825
    const/16 v23, 0x0

    .line 1826
    .line 1827
    const/16 v24, 0x0

    .line 1828
    .line 1829
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1830
    .line 1831
    .line 1832
    move-object/from16 v1, v16

    .line 1833
    .line 1834
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1835
    .line 1836
    .line 1837
    move-result-object v2

    .line 1838
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1839
    .line 1840
    .line 1841
    invoke-virtual {v0, v1, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1842
    .line 1843
    .line 1844
    goto/16 :goto_13

    .line 1845
    .line 1846
    :cond_29
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1847
    .line 1848
    .line 1849
    throw v12

    .line 1850
    :cond_2a
    instance-of v0, v1, La/k6e;

    .line 1851
    .line 1852
    if-eqz v0, :cond_2d

    .line 1853
    .line 1854
    iget-object v0, v15, La/e7e;->Q1:La/ndk0;

    .line 1855
    .line 1856
    if-eqz v0, :cond_2b

    .line 1857
    .line 1858
    invoke-interface {v0}, La/ndk0;->dismiss()V

    .line 1859
    .line 1860
    .line 1861
    :cond_2b
    iget-object v13, v15, La/e7e;->N1:La/wdk0;

    .line 1862
    .line 1863
    if-eqz v13, :cond_2c

    .line 1864
    .line 1865
    new-instance v14, La/xdk0;

    .line 1866
    .line 1867
    sget-object v17, La/pek0;->a:La/pek0;

    .line 1868
    .line 1869
    check-cast v1, La/k6e;

    .line 1870
    .line 1871
    iget-object v0, v1, La/k6e;->a:Ljava/lang/String;

    .line 1872
    .line 1873
    const/16 v22, 0x0

    .line 1874
    .line 1875
    const/16 v23, 0x7c

    .line 1876
    .line 1877
    const/16 v19, 0x0

    .line 1878
    .line 1879
    const/16 v20, 0x0

    .line 1880
    .line 1881
    const/16 v21, 0x0

    .line 1882
    .line 1883
    move-object/from16 v18, v0

    .line 1884
    .line 1885
    move-object/from16 v16, v14

    .line 1886
    .line 1887
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1888
    .line 1889
    .line 1890
    const v0, 0x7f070729

    .line 1891
    .line 1892
    .line 1893
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v19

    .line 1897
    const/16 v20, 0x1dc

    .line 1898
    .line 1899
    const/16 v16, 0x0

    .line 1900
    .line 1901
    const/16 v17, 0x0

    .line 1902
    .line 1903
    const/16 v18, 0x0

    .line 1904
    .line 1905
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1906
    .line 1907
    .line 1908
    move-result-object v0

    .line 1909
    iput-object v0, v15, La/e7e;->Q1:La/ndk0;

    .line 1910
    .line 1911
    goto/16 :goto_13

    .line 1912
    .line 1913
    :cond_2c
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1914
    .line 1915
    .line 1916
    throw v12

    .line 1917
    :cond_2d
    sget-object v0, La/j6e;->a:La/j6e;

    .line 1918
    .line 1919
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1920
    .line 1921
    .line 1922
    move-result v0

    .line 1923
    if-eqz v0, :cond_2e

    .line 1924
    .line 1925
    :try_start_6
    iget-object v0, v15, La/e7e;->R1:La/a8z;

    .line 1926
    .line 1927
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1928
    .line 1929
    .line 1930
    move-result-object v0

    .line 1931
    check-cast v0, Landroid/media/Ringtone;

    .line 1932
    .line 1933
    invoke-virtual {v0}, Landroid/media/Ringtone;->play()V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    .line 1934
    .line 1935
    .line 1936
    goto/16 :goto_13

    .line 1937
    .line 1938
    :catch_0
    move-exception v0

    .line 1939
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 1940
    .line 1941
    .line 1942
    goto/16 :goto_13

    .line 1943
    .line 1944
    :cond_2e
    instance-of v0, v1, La/m6e;

    .line 1945
    .line 1946
    if-eqz v0, :cond_30

    .line 1947
    .line 1948
    iget-object v13, v15, La/e7e;->N1:La/wdk0;

    .line 1949
    .line 1950
    if-eqz v13, :cond_2f

    .line 1951
    .line 1952
    new-instance v14, La/xdk0;

    .line 1953
    .line 1954
    check-cast v1, La/m6e;

    .line 1955
    .line 1956
    iget-object v0, v1, La/m6e;->a:Ljava/lang/String;

    .line 1957
    .line 1958
    const/16 v22, 0x0

    .line 1959
    .line 1960
    const/16 v23, 0x7c

    .line 1961
    .line 1962
    const/16 v19, 0x0

    .line 1963
    .line 1964
    const/16 v20, 0x0

    .line 1965
    .line 1966
    const/16 v21, 0x0

    .line 1967
    .line 1968
    move-object/from16 v18, v0

    .line 1969
    .line 1970
    move-object/from16 v16, v14

    .line 1971
    .line 1972
    invoke-direct/range {v16 .. v23}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1973
    .line 1974
    .line 1975
    const/16 v20, 0x3fc

    .line 1976
    .line 1977
    const/16 v16, 0x0

    .line 1978
    .line 1979
    const/16 v17, 0x0

    .line 1980
    .line 1981
    const/16 v18, 0x0

    .line 1982
    .line 1983
    invoke-static/range {v13 .. v20}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1984
    .line 1985
    .line 1986
    goto :goto_13

    .line 1987
    :cond_2f
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1988
    .line 1989
    .line 1990
    throw v12

    .line 1991
    :cond_30
    sget-object v0, La/o6e;->a:La/o6e;

    .line 1992
    .line 1993
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1994
    .line 1995
    .line 1996
    move-result v0

    .line 1997
    if-eqz v0, :cond_31

    .line 1998
    .line 1999
    invoke-virtual {v15}, La/e7e;->H0()La/kzq;

    .line 2000
    .line 2001
    .line 2002
    move-result-object v0

    .line 2003
    iget-object v0, v0, La/kzq;->c:Landroid/widget/ImageView;

    .line 2004
    .line 2005
    invoke-virtual {v15}, La/e7e;->H0()La/kzq;

    .line 2006
    .line 2007
    .line 2008
    move-result-object v1

    .line 2009
    iget-object v1, v1, La/kzq;->z:Landroid/widget/TextView;

    .line 2010
    .line 2011
    invoke-virtual {v15}, La/e7e;->H0()La/kzq;

    .line 2012
    .line 2013
    .line 2014
    move-result-object v4

    .line 2015
    iget-object v14, v4, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 2016
    .line 2017
    new-instance v13, La/hf5;

    .line 2018
    .line 2019
    const/16 v18, 0x4

    .line 2020
    .line 2021
    move-object/from16 v16, v0

    .line 2022
    .line 2023
    move-object/from16 v17, v1

    .line 2024
    .line 2025
    invoke-direct/range {v13 .. v18}, La/hf5;-><init>(Landroid/view/View;Ljava/lang/Object;Landroid/view/View;Landroid/view/View;B)V

    .line 2026
    .line 2027
    .line 2028
    invoke-static {v14, v13}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v15}, La/e7e;->H0()La/kzq;

    .line 2032
    .line 2033
    .line 2034
    move-result-object v0

    .line 2035
    iget-object v0, v0, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 2036
    .line 2037
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->postInvalidateDelayed(J)V

    .line 2038
    .line 2039
    .line 2040
    goto :goto_13

    .line 2041
    :cond_31
    sget-object v0, La/g6e;->a:La/g6e;

    .line 2042
    .line 2043
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2044
    .line 2045
    .line 2046
    move-result v0

    .line 2047
    if-eqz v0, :cond_33

    .line 2048
    .line 2049
    invoke-static {v15}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 2050
    .line 2051
    .line 2052
    sget-object v0, La/i5e;->q2:La/kud;

    .line 2053
    .line 2054
    invoke-virtual {v15}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2055
    .line 2056
    .line 2057
    move-result-object v1

    .line 2058
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2059
    .line 2060
    .line 2061
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2062
    .line 2063
    .line 2064
    const-string v0, "file_bottom"

    .line 2065
    .line 2066
    invoke-virtual {v1, v0}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 2067
    .line 2068
    .line 2069
    move-result-object v2

    .line 2070
    if-eqz v2, :cond_32

    .line 2071
    .line 2072
    goto :goto_13

    .line 2073
    :cond_32
    new-instance v2, La/i5e;

    .line 2074
    .line 2075
    invoke-direct {v2}, La/i5e;-><init>()V

    .line 2076
    .line 2077
    .line 2078
    invoke-virtual {v2, v1, v0}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 2079
    .line 2080
    .line 2081
    :goto_13
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2082
    .line 2083
    goto :goto_14

    .line 2084
    :cond_33
    invoke-static {}, La/t9f;->b()V

    .line 2085
    .line 2086
    .line 2087
    :goto_14
    return-object v12

    .line 2088
    :pswitch_17
    move-object/from16 v1, p1

    .line 2089
    .line 2090
    check-cast v1, Ljava/lang/Number;

    .line 2091
    .line 2092
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 2093
    .line 2094
    .line 2095
    move-result v1

    .line 2096
    move-object/from16 v2, p2

    .line 2097
    .line 2098
    check-cast v2, La/yje;

    .line 2099
    .line 2100
    check-cast v0, La/e7e;

    .line 2101
    .line 2102
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2103
    .line 2104
    if-lez v1, :cond_34

    .line 2105
    .line 2106
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2107
    .line 2108
    .line 2109
    move-result-object v2

    .line 2110
    iget-object v2, v2, La/kzq;->c:Landroid/widget/ImageView;

    .line 2111
    .line 2112
    invoke-virtual {v2}, Landroid/view/View;->getVisibility()I

    .line 2113
    .line 2114
    .line 2115
    move-result v2

    .line 2116
    if-nez v2, :cond_34

    .line 2117
    .line 2118
    goto :goto_15

    .line 2119
    :cond_34
    move v10, v11

    .line 2120
    :goto_15
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2121
    .line 2122
    .line 2123
    move-result-object v2

    .line 2124
    iget-object v2, v2, La/kzq;->z:Landroid/widget/TextView;

    .line 2125
    .line 2126
    if-eqz v10, :cond_35

    .line 2127
    .line 2128
    move v9, v11

    .line 2129
    :cond_35
    invoke-virtual {v2, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2130
    .line 2131
    .line 2132
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2133
    .line 2134
    .line 2135
    move-result-object v0

    .line 2136
    iget-object v0, v0, La/kzq;->z:Landroid/widget/TextView;

    .line 2137
    .line 2138
    if-lez v1, :cond_36

    .line 2139
    .line 2140
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 2141
    .line 2142
    .line 2143
    move-result-object v1

    .line 2144
    goto :goto_16

    .line 2145
    :cond_36
    const-string v1, ""

    .line 2146
    .line 2147
    :goto_16
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2148
    .line 2149
    .line 2150
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2151
    .line 2152
    return-object v0

    .line 2153
    :pswitch_18
    move-object/from16 v1, p1

    .line 2154
    .line 2155
    check-cast v1, Ljava/lang/Boolean;

    .line 2156
    .line 2157
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 2158
    .line 2159
    .line 2160
    move-result v1

    .line 2161
    move-object/from16 v2, p2

    .line 2162
    .line 2163
    check-cast v2, La/yje;

    .line 2164
    .line 2165
    check-cast v0, La/e7e;

    .line 2166
    .line 2167
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2168
    .line 2169
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2170
    .line 2171
    .line 2172
    move-result-object v0

    .line 2173
    iget-object v0, v0, La/kzq;->y:Landroid/widget/TextView;

    .line 2174
    .line 2175
    if-eqz v1, :cond_37

    .line 2176
    .line 2177
    move v9, v11

    .line 2178
    :cond_37
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2179
    .line 2180
    .line 2181
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2182
    .line 2183
    return-object v0

    .line 2184
    :pswitch_19
    move-object/from16 v1, p1

    .line 2185
    .line 2186
    check-cast v1, La/v9e;

    .line 2187
    .line 2188
    move-object/from16 v2, p2

    .line 2189
    .line 2190
    check-cast v2, La/yje;

    .line 2191
    .line 2192
    check-cast v0, La/e7e;

    .line 2193
    .line 2194
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2195
    .line 2196
    instance-of v2, v1, La/t9e;

    .line 2197
    .line 2198
    if-eqz v2, :cond_39

    .line 2199
    .line 2200
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v1

    .line 2204
    iget-object v1, v1, La/kzq;->A:Landroid/widget/TextView;

    .line 2205
    .line 2206
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2207
    .line 2208
    .line 2209
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2210
    .line 2211
    .line 2212
    move-result-object v1

    .line 2213
    iget-object v1, v1, La/kzq;->k:Landroid/widget/ImageView;

    .line 2214
    .line 2215
    invoke-virtual {v1, v11}, Landroid/view/View;->setVisibility(I)V

    .line 2216
    .line 2217
    .line 2218
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2219
    .line 2220
    .line 2221
    move-result-object v0

    .line 2222
    iget-object v0, v0, La/kzq;->k:Landroid/widget/ImageView;

    .line 2223
    .line 2224
    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    .line 2225
    .line 2226
    .line 2227
    move-result-object v0

    .line 2228
    instance-of v1, v0, Landroid/graphics/drawable/AnimationDrawable;

    .line 2229
    .line 2230
    if-eqz v1, :cond_38

    .line 2231
    .line 2232
    move-object v12, v0

    .line 2233
    check-cast v12, Landroid/graphics/drawable/AnimationDrawable;

    .line 2234
    .line 2235
    :cond_38
    if-eqz v12, :cond_3a

    .line 2236
    .line 2237
    invoke-virtual {v12}, Landroid/graphics/drawable/AnimationDrawable;->start()V

    .line 2238
    .line 2239
    .line 2240
    goto :goto_17

    .line 2241
    :cond_39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2242
    .line 2243
    .line 2244
    sget-object v2, La/u9e;->a:La/u9e;

    .line 2245
    .line 2246
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2247
    .line 2248
    .line 2249
    move-result v1

    .line 2250
    if-eqz v1, :cond_3b

    .line 2251
    .line 2252
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2253
    .line 2254
    .line 2255
    move-result-object v1

    .line 2256
    iget-object v1, v1, La/kzq;->A:Landroid/widget/TextView;

    .line 2257
    .line 2258
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2259
    .line 2260
    .line 2261
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v0

    .line 2265
    iget-object v0, v0, La/kzq;->k:Landroid/widget/ImageView;

    .line 2266
    .line 2267
    invoke-virtual {v0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2268
    .line 2269
    .line 2270
    :cond_3a
    :goto_17
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2271
    .line 2272
    goto :goto_18

    .line 2273
    :cond_3b
    invoke-static {}, La/t9f;->b()V

    .line 2274
    .line 2275
    .line 2276
    :goto_18
    return-object v12

    .line 2277
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2278
    .line 2279
    check-cast v1, La/k9e;

    .line 2280
    .line 2281
    move-object/from16 v4, p2

    .line 2282
    .line 2283
    check-cast v4, La/yje;

    .line 2284
    .line 2285
    check-cast v0, La/e7e;

    .line 2286
    .line 2287
    sget-object v4, La/e7e;->d2:La/kwd;

    .line 2288
    .line 2289
    iget-object v4, v0, La/e7e;->S1:Landroid/os/Handler;

    .line 2290
    .line 2291
    iget-boolean v5, v0, La/e7e;->a2:Z

    .line 2292
    .line 2293
    if-eqz v5, :cond_3c

    .line 2294
    .line 2295
    goto/16 :goto_1a

    .line 2296
    .line 2297
    :cond_3c
    instance-of v5, v1, La/g9e;

    .line 2298
    .line 2299
    if-eqz v5, :cond_3e

    .line 2300
    .line 2301
    check-cast v1, La/g9e;

    .line 2302
    .line 2303
    iget-boolean v1, v1, La/g9e;->a:Z

    .line 2304
    .line 2305
    if-eqz v1, :cond_3d

    .line 2306
    .line 2307
    goto :goto_19

    .line 2308
    :cond_3d
    const-wide/16 v2, 0x64

    .line 2309
    .line 2310
    :goto_19
    iget-object v1, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2311
    .line 2312
    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2313
    .line 2314
    .line 2315
    new-instance v1, La/u6e;

    .line 2316
    .line 2317
    invoke-direct {v1, v0, v11}, La/u6e;-><init>(La/e7e;B)V

    .line 2318
    .line 2319
    .line 2320
    iput-object v1, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2321
    .line 2322
    invoke-virtual {v4, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2323
    .line 2324
    .line 2325
    goto/16 :goto_1a

    .line 2326
    .line 2327
    :cond_3e
    instance-of v2, v1, La/i9e;

    .line 2328
    .line 2329
    const-wide/16 v5, 0x32

    .line 2330
    .line 2331
    if-eqz v2, :cond_3f

    .line 2332
    .line 2333
    check-cast v1, La/i9e;

    .line 2334
    .line 2335
    iget v1, v1, La/i9e;->a:I

    .line 2336
    .line 2337
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v2

    .line 2341
    iget-object v2, v2, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 2342
    .line 2343
    iget-object v3, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2344
    .line 2345
    invoke-virtual {v4, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2346
    .line 2347
    .line 2348
    iput-boolean v10, v0, La/e7e;->a2:Z

    .line 2349
    .line 2350
    new-instance v3, La/f58;

    .line 2351
    .line 2352
    const/4 v7, 0x5

    .line 2353
    invoke-direct {v3, v2, v1, v0, v7}, La/f58;-><init>(Ljava/lang/Object;ILjava/lang/Object;B)V

    .line 2354
    .line 2355
    .line 2356
    iput-object v3, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2357
    .line 2358
    invoke-virtual {v4, v3, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2359
    .line 2360
    .line 2361
    goto :goto_1a

    .line 2362
    :cond_3f
    instance-of v2, v1, La/h9e;

    .line 2363
    .line 2364
    if-eqz v2, :cond_40

    .line 2365
    .line 2366
    check-cast v1, La/h9e;

    .line 2367
    .line 2368
    iget v15, v1, La/h9e;->a:I

    .line 2369
    .line 2370
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2371
    .line 2372
    .line 2373
    move-result-object v1

    .line 2374
    iget-object v2, v1, La/kzq;->c:Landroid/widget/ImageView;

    .line 2375
    .line 2376
    iget-object v3, v1, La/kzq;->z:Landroid/widget/TextView;

    .line 2377
    .line 2378
    iget-object v14, v1, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 2379
    .line 2380
    iget-object v1, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2381
    .line 2382
    invoke-virtual {v4, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 2383
    .line 2384
    .line 2385
    iput-boolean v10, v0, La/e7e;->a2:Z

    .line 2386
    .line 2387
    new-instance v13, La/v6e;

    .line 2388
    .line 2389
    move-object/from16 v16, v0

    .line 2390
    .line 2391
    move-object/from16 v17, v2

    .line 2392
    .line 2393
    move-object/from16 v18, v3

    .line 2394
    .line 2395
    invoke-direct/range {v13 .. v18}, La/v6e;-><init>(Landroidx/recyclerview/widget/RecyclerView;ILa/e7e;Landroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 2396
    .line 2397
    .line 2398
    iput-object v13, v0, La/e7e;->b2:Ljava/lang/Runnable;

    .line 2399
    .line 2400
    invoke-virtual {v4, v13, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 2401
    .line 2402
    .line 2403
    goto :goto_1a

    .line 2404
    :cond_40
    sget-object v2, La/j9e;->a:La/j9e;

    .line 2405
    .line 2406
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2407
    .line 2408
    .line 2409
    move-result v1

    .line 2410
    if-eqz v1, :cond_42

    .line 2411
    .line 2412
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v1

    .line 2416
    iget-object v1, v1, La/kzq;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 2417
    .line 2418
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 2419
    .line 2420
    .line 2421
    move-result-object v2

    .line 2422
    invoke-virtual {v2}, La/zz3;->d()I

    .line 2423
    .line 2424
    .line 2425
    move-result v3

    .line 2426
    add-int/lit8 v3, v3, -0x4

    .line 2427
    .line 2428
    invoke-virtual {v0}, La/e7e;->I0()I

    .line 2429
    .line 2430
    .line 2431
    move-result v0

    .line 2432
    if-gt v3, v0, :cond_41

    .line 2433
    .line 2434
    invoke-virtual {v2}, La/zz3;->d()I

    .line 2435
    .line 2436
    .line 2437
    move-result v0

    .line 2438
    sub-int/2addr v0, v10

    .line 2439
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->B0(I)V

    .line 2440
    .line 2441
    .line 2442
    :cond_41
    :goto_1a
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2443
    .line 2444
    goto :goto_1b

    .line 2445
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 2446
    .line 2447
    .line 2448
    :goto_1b
    return-object v12

    .line 2449
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2450
    .line 2451
    check-cast v1, La/p9e;

    .line 2452
    .line 2453
    move-object/from16 v2, p2

    .line 2454
    .line 2455
    check-cast v2, La/yje;

    .line 2456
    .line 2457
    check-cast v0, La/e7e;

    .line 2458
    .line 2459
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2460
    .line 2461
    instance-of v2, v1, La/n9e;

    .line 2462
    .line 2463
    if-nez v2, :cond_43

    .line 2464
    .line 2465
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 2466
    .line 2467
    .line 2468
    move-result-object v3

    .line 2469
    sget-object v4, La/iun;->a:La/iun;

    .line 2470
    .line 2471
    invoke-virtual {v3, v4}, La/zz3;->A(Ljava/util/List;)V

    .line 2472
    .line 2473
    .line 2474
    :cond_43
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2475
    .line 2476
    .line 2477
    move-result-object v3

    .line 2478
    iget-object v3, v3, La/kzq;->r:Lorg/xplatform/ui_core/viewcomponents/layouts/frame/ProgressBarWithSendClock;

    .line 2479
    .line 2480
    instance-of v4, v1, La/o9e;

    .line 2481
    .line 2482
    if-eqz v4, :cond_44

    .line 2483
    .line 2484
    move v4, v11

    .line 2485
    goto :goto_1c

    .line 2486
    :cond_44
    move v4, v9

    .line 2487
    :goto_1c
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2488
    .line 2489
    .line 2490
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2491
    .line 2492
    .line 2493
    move-result-object v3

    .line 2494
    iget-object v3, v3, La/kzq;->p:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 2495
    .line 2496
    instance-of v4, v1, La/m9e;

    .line 2497
    .line 2498
    if-eqz v4, :cond_45

    .line 2499
    .line 2500
    move v4, v11

    .line 2501
    goto :goto_1d

    .line 2502
    :cond_45
    move v4, v9

    .line 2503
    :goto_1d
    invoke-virtual {v3, v4}, Lorg/xplatform/uikit/components/lottie/LottieView;->setVisibility(I)V

    .line 2504
    .line 2505
    .line 2506
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2507
    .line 2508
    .line 2509
    move-result-object v3

    .line 2510
    iget-object v3, v3, La/kzq;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2511
    .line 2512
    instance-of v4, v1, La/l9e;

    .line 2513
    .line 2514
    if-eqz v4, :cond_46

    .line 2515
    .line 2516
    move v4, v11

    .line 2517
    goto :goto_1e

    .line 2518
    :cond_46
    move v4, v9

    .line 2519
    :goto_1e
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2520
    .line 2521
    .line 2522
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2523
    .line 2524
    .line 2525
    move-result-object v3

    .line 2526
    iget-object v3, v3, La/kzq;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2527
    .line 2528
    if-eqz v2, :cond_47

    .line 2529
    .line 2530
    move v4, v11

    .line 2531
    goto :goto_1f

    .line 2532
    :cond_47
    move v4, v9

    .line 2533
    :goto_1f
    invoke-virtual {v3, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2534
    .line 2535
    .line 2536
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2537
    .line 2538
    .line 2539
    move-result-object v3

    .line 2540
    iget-object v3, v3, La/kzq;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 2541
    .line 2542
    if-eqz v2, :cond_48

    .line 2543
    .line 2544
    move-object v4, v1

    .line 2545
    check-cast v4, La/n9e;

    .line 2546
    .line 2547
    iget-object v4, v4, La/n9e;->a:Ljava/util/ArrayList;

    .line 2548
    .line 2549
    invoke-interface {v4}, Ljava/util/List;->isEmpty()Z

    .line 2550
    .line 2551
    .line 2552
    move-result v4

    .line 2553
    if-eqz v4, :cond_48

    .line 2554
    .line 2555
    move v9, v11

    .line 2556
    :cond_48
    invoke-virtual {v3, v9}, Landroid/view/View;->setVisibility(I)V

    .line 2557
    .line 2558
    .line 2559
    if-eqz v1, :cond_50

    .line 2560
    .line 2561
    instance-of v3, v1, La/n9e;

    .line 2562
    .line 2563
    if-eqz v3, :cond_49

    .line 2564
    .line 2565
    invoke-virtual {v0}, La/e7e;->G0()La/d6e;

    .line 2566
    .line 2567
    .line 2568
    move-result-object v3

    .line 2569
    check-cast v1, La/n9e;

    .line 2570
    .line 2571
    iget-object v1, v1, La/n9e;->a:Ljava/util/ArrayList;

    .line 2572
    .line 2573
    invoke-virtual {v3, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 2574
    .line 2575
    .line 2576
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 2577
    .line 2578
    .line 2579
    move-result v1

    .line 2580
    if-eqz v1, :cond_4c

    .line 2581
    .line 2582
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2583
    .line 2584
    .line 2585
    move-result-object v1

    .line 2586
    iget-object v3, v1, La/kzq;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2587
    .line 2588
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2589
    .line 2590
    .line 2591
    move-result-object v4

    .line 2592
    const v5, 0x7f080c60

    .line 2593
    .line 2594
    .line 2595
    invoke-virtual {v4, v5}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2596
    .line 2597
    .line 2598
    move-result-object v4

    .line 2599
    invoke-virtual {v3, v4}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2600
    .line 2601
    .line 2602
    iget-object v1, v1, La/kzq;->w:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2603
    .line 2604
    const v3, 0x7f1310b9

    .line 2605
    .line 2606
    .line 2607
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2608
    .line 2609
    .line 2610
    move-result-object v3

    .line 2611
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2612
    .line 2613
    .line 2614
    goto :goto_20

    .line 2615
    :cond_49
    instance-of v3, v1, La/m9e;

    .line 2616
    .line 2617
    if-eqz v3, :cond_4a

    .line 2618
    .line 2619
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 2620
    .line 2621
    .line 2622
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2623
    .line 2624
    .line 2625
    move-result-object v3

    .line 2626
    iget-object v3, v3, La/kzq;->p:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 2627
    .line 2628
    check-cast v1, La/m9e;

    .line 2629
    .line 2630
    iget-object v1, v1, La/m9e;->a:La/ra10;

    .line 2631
    .line 2632
    invoke-virtual {v3, v1}, Lorg/xplatform/uikit/components/lottie/LottieView;->v(La/ra10;)V

    .line 2633
    .line 2634
    .line 2635
    goto :goto_20

    .line 2636
    :cond_4a
    instance-of v3, v1, La/o9e;

    .line 2637
    .line 2638
    if-eqz v3, :cond_4b

    .line 2639
    .line 2640
    goto :goto_20

    .line 2641
    :cond_4b
    instance-of v3, v1, La/l9e;

    .line 2642
    .line 2643
    if-eqz v3, :cond_50

    .line 2644
    .line 2645
    invoke-static {v0}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 2646
    .line 2647
    .line 2648
    invoke-virtual {v0}, La/e7e;->H0()La/kzq;

    .line 2649
    .line 2650
    .line 2651
    move-result-object v3

    .line 2652
    iget-object v4, v3, La/kzq;->g:Landroidx/appcompat/widget/AppCompatImageView;

    .line 2653
    .line 2654
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2655
    .line 2656
    .line 2657
    move-result-object v5

    .line 2658
    check-cast v1, La/l9e;

    .line 2659
    .line 2660
    const v6, 0x7f080bcd

    .line 2661
    .line 2662
    .line 2663
    invoke-virtual {v5, v6}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 2664
    .line 2665
    .line 2666
    move-result-object v5

    .line 2667
    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 2668
    .line 2669
    .line 2670
    iget-object v4, v3, La/kzq;->v:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2671
    .line 2672
    iget-object v5, v1, La/l9e;->a:Ljava/lang/String;

    .line 2673
    .line 2674
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2675
    .line 2676
    .line 2677
    iget-object v3, v3, La/kzq;->u:Landroidx/appcompat/widget/AppCompatTextView;

    .line 2678
    .line 2679
    iget-object v1, v1, La/l9e;->b:Ljava/lang/String;

    .line 2680
    .line 2681
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 2682
    .line 2683
    .line 2684
    :cond_4c
    :goto_20
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2685
    .line 2686
    .line 2687
    move-result-object v1

    .line 2688
    if-eqz v1, :cond_4f

    .line 2689
    .line 2690
    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 2691
    .line 2692
    .line 2693
    move-result-object v3

    .line 2694
    if-nez v3, :cond_4d

    .line 2695
    .line 2696
    goto :goto_23

    .line 2697
    :cond_4d
    const v1, 0x7f040ae3

    .line 2698
    .line 2699
    .line 2700
    invoke-static {v1, v0}, La/etm0;->j(ILandroidx/fragment/app/Fragment;)V

    .line 2701
    .line 2702
    .line 2703
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2704
    .line 2705
    .line 2706
    move-result-object v4

    .line 2707
    if-eqz v2, :cond_4e

    .line 2708
    .line 2709
    :goto_21
    move v6, v1

    .line 2710
    goto :goto_22

    .line 2711
    :cond_4e
    const v1, 0x7f040ae1

    .line 2712
    .line 2713
    .line 2714
    goto :goto_21

    .line 2715
    :goto_22
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2716
    .line 2717
    .line 2718
    move-result-object v1

    .line 2719
    invoke-static {v1}, La/qem0;->r(Landroid/content/Context;)Z

    .line 2720
    .line 2721
    .line 2722
    move-result v1

    .line 2723
    xor-int/lit8 v7, v1, 0x1

    .line 2724
    .line 2725
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 2726
    .line 2727
    .line 2728
    move-result-object v0

    .line 2729
    invoke-static {v0}, La/qem0;->r(Landroid/content/Context;)Z

    .line 2730
    .line 2731
    .line 2732
    move-result v0

    .line 2733
    xor-int/lit8 v8, v0, 0x1

    .line 2734
    .line 2735
    const v5, 0x7f040ae3

    .line 2736
    .line 2737
    .line 2738
    invoke-static/range {v3 .. v8}, La/ofm0;->y(Landroid/view/Window;Landroid/content/Context;IIZZ)V

    .line 2739
    .line 2740
    .line 2741
    :cond_4f
    :goto_23
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2742
    .line 2743
    goto :goto_24

    .line 2744
    :cond_50
    invoke-static {}, La/t9f;->b()V

    .line 2745
    .line 2746
    .line 2747
    :goto_24
    return-object v12

    .line 2748
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2749
    .line 2750
    check-cast v1, La/a2c;

    .line 2751
    .line 2752
    move-object/from16 v2, p2

    .line 2753
    .line 2754
    check-cast v2, La/yje;

    .line 2755
    .line 2756
    check-cast v0, La/e7e;

    .line 2757
    .line 2758
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 2759
    .line 2760
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2761
    .line 2762
    .line 2763
    sget-object v2, La/w1c;->a:La/w1c;

    .line 2764
    .line 2765
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2766
    .line 2767
    .line 2768
    move-result v2

    .line 2769
    if-eqz v2, :cond_52

    .line 2770
    .line 2771
    iget-object v1, v0, La/e7e;->M1:La/ii;

    .line 2772
    .line 2773
    if-eqz v1, :cond_51

    .line 2774
    .line 2775
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2776
    .line 2777
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2778
    .line 2779
    .line 2780
    move-result-object v14

    .line 2781
    const v2, 0x7f13131f

    .line 2782
    .line 2783
    .line 2784
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2785
    .line 2786
    .line 2787
    move-result-object v15

    .line 2788
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2789
    .line 2790
    .line 2791
    move-result-object v16

    .line 2792
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2793
    .line 2794
    .line 2795
    sget-object v22, La/n12;->b:La/n12;

    .line 2796
    .line 2797
    const/16 v23, 0x0

    .line 2798
    .line 2799
    const/16 v24, 0x5f8

    .line 2800
    .line 2801
    const/16 v17, 0x0

    .line 2802
    .line 2803
    const/16 v18, 0x0

    .line 2804
    .line 2805
    const/16 v19, 0x0

    .line 2806
    .line 2807
    const/16 v20, 0x0

    .line 2808
    .line 2809
    const/16 v21, 0x0

    .line 2810
    .line 2811
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2812
    .line 2813
    .line 2814
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2815
    .line 2816
    .line 2817
    move-result-object v0

    .line 2818
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2819
    .line 2820
    .line 2821
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2822
    .line 2823
    .line 2824
    goto/16 :goto_25

    .line 2825
    .line 2826
    :cond_51
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2827
    .line 2828
    .line 2829
    throw v12

    .line 2830
    :cond_52
    instance-of v2, v1, La/y1c;

    .line 2831
    .line 2832
    if-eqz v2, :cond_54

    .line 2833
    .line 2834
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2835
    .line 2836
    .line 2837
    move-result-object v2

    .line 2838
    check-cast v1, La/y1c;

    .line 2839
    .line 2840
    iget-wide v7, v1, La/y1c;->a:J

    .line 2841
    .line 2842
    invoke-static {v2, v7, v8}, La/ahb;->N(Landroid/content/Context;J)Ljava/lang/String;

    .line 2843
    .line 2844
    .line 2845
    move-result-object v1

    .line 2846
    iget-object v2, v0, La/e7e;->M1:La/ii;

    .line 2847
    .line 2848
    if-eqz v2, :cond_53

    .line 2849
    .line 2850
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2851
    .line 2852
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2853
    .line 2854
    .line 2855
    move-result-object v14

    .line 2856
    const v3, 0x7f130892

    .line 2857
    .line 2858
    .line 2859
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2860
    .line 2861
    .line 2862
    move-result-object v3

    .line 2863
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2864
    .line 2865
    .line 2866
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v1

    .line 2870
    invoke-static {v1, v10}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v1

    .line 2874
    invoke-static {v3, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 2875
    .line 2876
    .line 2877
    move-result-object v15

    .line 2878
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2879
    .line 2880
    .line 2881
    move-result-object v16

    .line 2882
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2883
    .line 2884
    .line 2885
    sget-object v22, La/n12;->b:La/n12;

    .line 2886
    .line 2887
    const/16 v23, 0x0

    .line 2888
    .line 2889
    const/16 v24, 0x5f8

    .line 2890
    .line 2891
    const/16 v17, 0x0

    .line 2892
    .line 2893
    const/16 v18, 0x0

    .line 2894
    .line 2895
    const/16 v19, 0x0

    .line 2896
    .line 2897
    const/16 v20, 0x0

    .line 2898
    .line 2899
    const/16 v21, 0x0

    .line 2900
    .line 2901
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2902
    .line 2903
    .line 2904
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2905
    .line 2906
    .line 2907
    move-result-object v0

    .line 2908
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2909
    .line 2910
    .line 2911
    invoke-virtual {v2, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2912
    .line 2913
    .line 2914
    goto :goto_25

    .line 2915
    :cond_53
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2916
    .line 2917
    .line 2918
    throw v12

    .line 2919
    :cond_54
    instance-of v2, v1, La/z1c;

    .line 2920
    .line 2921
    if-eqz v2, :cond_56

    .line 2922
    .line 2923
    iget-object v1, v0, La/e7e;->M1:La/ii;

    .line 2924
    .line 2925
    if-eqz v1, :cond_55

    .line 2926
    .line 2927
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2928
    .line 2929
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2930
    .line 2931
    .line 2932
    move-result-object v14

    .line 2933
    const v2, 0x7f131704

    .line 2934
    .line 2935
    .line 2936
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2937
    .line 2938
    .line 2939
    move-result-object v15

    .line 2940
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2941
    .line 2942
    .line 2943
    move-result-object v16

    .line 2944
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2945
    .line 2946
    .line 2947
    sget-object v22, La/n12;->b:La/n12;

    .line 2948
    .line 2949
    const/16 v23, 0x0

    .line 2950
    .line 2951
    const/16 v24, 0x5f8

    .line 2952
    .line 2953
    const/16 v17, 0x0

    .line 2954
    .line 2955
    const/16 v18, 0x0

    .line 2956
    .line 2957
    const/16 v19, 0x0

    .line 2958
    .line 2959
    const/16 v20, 0x0

    .line 2960
    .line 2961
    const/16 v21, 0x0

    .line 2962
    .line 2963
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2964
    .line 2965
    .line 2966
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2967
    .line 2968
    .line 2969
    move-result-object v0

    .line 2970
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2971
    .line 2972
    .line 2973
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2974
    .line 2975
    .line 2976
    goto :goto_25

    .line 2977
    :cond_55
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 2978
    .line 2979
    .line 2980
    throw v12

    .line 2981
    :cond_56
    sget-object v0, La/x1c;->a:La/x1c;

    .line 2982
    .line 2983
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2984
    .line 2985
    .line 2986
    move-result v0

    .line 2987
    if-eqz v0, :cond_57

    .line 2988
    .line 2989
    :goto_25
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2990
    .line 2991
    goto :goto_26

    .line 2992
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2993
    .line 2994
    .line 2995
    :goto_26
    return-object v12

    .line 2996
    nop

    .line 2997
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
