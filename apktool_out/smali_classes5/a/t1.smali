.class public final synthetic La/t1;
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
    iput-byte p2, p0, La/t1;->a:B

    iput-object p1, p0, La/t1;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-byte v2, v0, La/t1;->a:B

    .line 6
    .line 7
    const/16 v3, 0x9

    .line 8
    .line 9
    const-string v4, "actionDialogManager"

    .line 10
    .line 11
    const/4 v5, 0x2

    .line 12
    const-wide/16 v6, -0x1

    .line 13
    .line 14
    const/16 v8, 0xc

    .line 15
    .line 16
    const/16 v9, 0xa

    .line 17
    .line 18
    const/4 v10, 0x0

    .line 19
    const/4 v11, 0x1

    .line 20
    const/4 v12, 0x0

    .line 21
    iget-object v0, v0, La/t1;->b:Ljava/lang/Object;

    .line 22
    .line 23
    packed-switch v2, :pswitch_data_0

    .line 24
    .line 25
    .line 26
    check-cast v0, La/q21;

    .line 27
    .line 28
    check-cast v1, La/f240;

    .line 29
    .line 30
    sget-object v2, La/q21;->O1:La/rek0;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object v0, v0, La/q21;->M1:La/kiu0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    check-cast v0, La/fho0;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, La/fho0;->F(La/f240;)V

    .line 44
    .line 45
    .line 46
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_0
    check-cast v0, La/a01;

    .line 50
    .line 51
    check-cast v1, La/k0w0;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, La/a01;->o:La/peg0;

    .line 57
    .line 58
    new-instance v2, La/hr1;

    .line 59
    .line 60
    sget-object v3, La/s0s;->b:La/s0s;

    .line 61
    .line 62
    invoke-direct {v2, v6, v7, v5}, La/hr1;-><init>(JI)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, La/peg0;->q(La/lr1;)Lorg/xplatform/aggregator/impl/core/navigation/AggregatorScreens$AggregatorMainScreen;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 70
    .line 71
    .line 72
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_1
    move-object v3, v0

    .line 76
    check-cast v3, La/qy0;

    .line 77
    .line 78
    move-object v0, v1

    .line 79
    check-cast v0, La/gz0;

    .line 80
    .line 81
    sget-object v1, La/qy0;->S1:La/pek0;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    instance-of v1, v0, La/fz0;

    .line 87
    .line 88
    if-eqz v1, :cond_1

    .line 89
    .line 90
    check-cast v0, La/fz0;

    .line 91
    .line 92
    iget-object v15, v0, La/fz0;->a:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v0, v3, La/qy0;->L1:La/ii;

    .line 95
    .line 96
    if-eqz v0, :cond_0

    .line 97
    .line 98
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 99
    .line 100
    const v1, 0x7f1307bb

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v14

    .line 107
    const v1, 0x7f130e5d

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v16

    .line 114
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    sget-object v22, La/n12;->b:La/n12;

    .line 118
    .line 119
    const/16 v23, 0x0

    .line 120
    .line 121
    const/16 v24, 0x5f8

    .line 122
    .line 123
    const/16 v17, 0x0

    .line 124
    .line 125
    const/16 v18, 0x0

    .line 126
    .line 127
    const/16 v19, 0x0

    .line 128
    .line 129
    const/16 v20, 0x0

    .line 130
    .line 131
    const/16 v21, 0x0

    .line 132
    .line 133
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 144
    .line 145
    .line 146
    goto :goto_0

    .line 147
    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    throw v12

    .line 151
    :cond_1
    instance-of v1, v0, La/dz0;

    .line 152
    .line 153
    if-eqz v1, :cond_2

    .line 154
    .line 155
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->q0()Landroid/view/View;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0}, La/j120;->X(Landroid/view/View;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_2
    instance-of v1, v0, La/ez0;

    .line 167
    .line 168
    if-eqz v1, :cond_4

    .line 169
    .line 170
    check-cast v0, La/ez0;

    .line 171
    .line 172
    iget-object v6, v0, La/ez0;->a:Ljava/lang/String;

    .line 173
    .line 174
    iget-object v1, v3, La/qy0;->N1:La/wdk0;

    .line 175
    .line 176
    if-eqz v1, :cond_3

    .line 177
    .line 178
    new-instance v2, La/xdk0;

    .line 179
    .line 180
    sget-object v5, La/rek0;->b:La/rek0;

    .line 181
    .line 182
    const/4 v10, 0x0

    .line 183
    const/16 v11, 0x7c

    .line 184
    .line 185
    const/4 v7, 0x0

    .line 186
    const/4 v8, 0x0

    .line 187
    const/4 v9, 0x0

    .line 188
    move-object v4, v2

    .line 189
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 190
    .line 191
    .line 192
    const/16 v8, 0x3fc

    .line 193
    .line 194
    const/4 v4, 0x0

    .line 195
    const/4 v5, 0x0

    .line 196
    const/4 v6, 0x0

    .line 197
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 198
    .line 199
    .line 200
    :goto_0
    iget-object v0, v3, La/qy0;->Q1:La/a8z;

    .line 201
    .line 202
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v0

    .line 206
    check-cast v0, La/k3t0;

    .line 207
    .line 208
    sget-object v1, La/cy0;->a:La/cy0;

    .line 209
    .line 210
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 211
    .line 212
    .line 213
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 214
    .line 215
    goto :goto_1

    .line 216
    :cond_3
    const-string v0, "snackBarManager"

    .line 217
    .line 218
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    throw v12

    .line 222
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 223
    .line 224
    .line 225
    :goto_1
    return-object v12

    .line 226
    :pswitch_2
    check-cast v0, La/ov0;

    .line 227
    .line 228
    check-cast v1, Ljava/lang/Boolean;

    .line 229
    .line 230
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    new-instance v2, La/wul;

    .line 235
    .line 236
    sget-object v3, La/lul;->e:La/lul;

    .line 237
    .line 238
    sget-object v4, La/oe9;->a:La/oe9;

    .line 239
    .line 240
    new-instance v5, La/ue9;

    .line 241
    .line 242
    iget-object v0, v0, La/ov0;->e:Ljava/lang/Object;

    .line 243
    .line 244
    check-cast v0, Ljava/lang/String;

    .line 245
    .line 246
    invoke-direct {v5, v0}, La/ue9;-><init>(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/4 v7, 0x0

    .line 250
    const/4 v8, 0x1

    .line 251
    invoke-direct/range {v2 .. v8}, La/wul;-><init>(La/sul;La/oe9;La/xe9;ZZZ)V

    .line 252
    .line 253
    .line 254
    return-object v2

    .line 255
    :pswitch_3
    check-cast v0, La/kv0;

    .line 256
    .line 257
    check-cast v1, La/x5q0;

    .line 258
    .line 259
    sget-object v2, La/kv0;->n2:La/hfk0;

    .line 260
    .line 261
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    instance-of v2, v1, La/w5q0;

    .line 265
    .line 266
    if-eqz v2, :cond_5

    .line 267
    .line 268
    invoke-virtual {v0}, La/kv0;->P0()La/k3t0;

    .line 269
    .line 270
    .line 271
    move-result-object v0

    .line 272
    new-instance v2, La/fv0;

    .line 273
    .line 274
    check-cast v1, La/w5q0;

    .line 275
    .line 276
    iget-object v1, v1, La/w5q0;->a:Ljava/lang/String;

    .line 277
    .line 278
    invoke-direct {v2, v1}, La/fv0;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 282
    .line 283
    .line 284
    :cond_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 285
    .line 286
    return-object v0

    .line 287
    :pswitch_4
    check-cast v0, La/hu0;

    .line 288
    .line 289
    check-cast v1, La/eg60;

    .line 290
    .line 291
    sget-object v2, La/hu0;->Y1:La/rek0;

    .line 292
    .line 293
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    invoke-virtual {v0}, La/hu0;->G0()La/k3t0;

    .line 297
    .line 298
    .line 299
    move-result-object v0

    .line 300
    sget-object v1, La/os0;->a:La/os0;

    .line 301
    .line 302
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 303
    .line 304
    .line 305
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 306
    .line 307
    return-object v0

    .line 308
    :pswitch_5
    check-cast v0, La/st0;

    .line 309
    .line 310
    check-cast v1, La/abi0;

    .line 311
    .line 312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    iget-object v0, v0, La/st0;->d:La/mtr;

    .line 316
    .line 317
    iget-boolean v0, v0, La/mtr;->b:Z

    .line 318
    .line 319
    if-eqz v0, :cond_6

    .line 320
    .line 321
    const-string v0, "Active"

    .line 322
    .line 323
    goto :goto_2

    .line 324
    :cond_6
    const-string v0, "Inactive"

    .line 325
    .line 326
    :goto_2
    invoke-static {v1, v0}, La/yai0;->h(La/abi0;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 330
    .line 331
    return-object v0

    .line 332
    :pswitch_6
    check-cast v0, La/jq0;

    .line 333
    .line 334
    check-cast v1, La/eg60;

    .line 335
    .line 336
    sget-object v2, La/jq0;->P1:La/qek0;

    .line 337
    .line 338
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, La/jq0;->G0()La/gs0;

    .line 342
    .line 343
    .line 344
    move-result-object v0

    .line 345
    sget-object v1, La/tp0;->a:La/tp0;

    .line 346
    .line 347
    invoke-virtual {v0, v1}, La/gs0;->Q(La/bq0;)V

    .line 348
    .line 349
    .line 350
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 351
    .line 352
    return-object v0

    .line 353
    :pswitch_7
    check-cast v0, La/mm40;

    .line 354
    .line 355
    check-cast v1, La/hcz;

    .line 356
    .line 357
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    new-instance v2, La/fp0;

    .line 361
    .line 362
    invoke-direct {v2, v0, v10}, La/fp0;-><init>(La/mm40;B)V

    .line 363
    .line 364
    .line 365
    new-instance v5, La/ugd;

    .line 366
    .line 367
    const v0, 0x640e7d77

    .line 368
    .line 369
    .line 370
    invoke-direct {v5, v0, v11, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 371
    .line 372
    .line 373
    const/4 v6, 0x6

    .line 374
    const/16 v2, 0xe

    .line 375
    .line 376
    const/4 v3, 0x0

    .line 377
    const/4 v4, 0x0

    .line 378
    invoke-static/range {v1 .. v6}, La/hcz;->g(La/hcz;ILkotlin/jvm/functions/Function1;La/wtf0;La/ydr;I)V

    .line 379
    .line 380
    .line 381
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 382
    .line 383
    return-object v0

    .line 384
    :pswitch_8
    move-object v3, v0

    .line 385
    check-cast v3, La/dm0;

    .line 386
    .line 387
    move-object v0, v1

    .line 388
    check-cast v0, La/kn0;

    .line 389
    .line 390
    sget-object v1, La/dm0;->S1:La/pek0;

    .line 391
    .line 392
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    sget-object v1, La/hn0;->a:La/hn0;

    .line 396
    .line 397
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    if-eqz v1, :cond_7

    .line 402
    .line 403
    invoke-static {v3}, La/qcc;->c0(Landroidx/fragment/app/Fragment;)Ljava/lang/Boolean;

    .line 404
    .line 405
    .line 406
    goto/16 :goto_3

    .line 407
    .line 408
    :cond_7
    instance-of v1, v0, La/jn0;

    .line 409
    .line 410
    if-eqz v1, :cond_9

    .line 411
    .line 412
    check-cast v0, La/jn0;

    .line 413
    .line 414
    iget-object v14, v0, La/jn0;->a:Ljava/lang/String;

    .line 415
    .line 416
    iget-object v15, v0, La/jn0;->b:Ljava/lang/String;

    .line 417
    .line 418
    iget-object v0, v0, La/jn0;->c:Ljava/lang/String;

    .line 419
    .line 420
    iget-object v1, v3, La/dm0;->N1:La/ii;

    .line 421
    .line 422
    if-eqz v1, :cond_8

    .line 423
    .line 424
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 425
    .line 426
    sget-object v22, La/n12;->b:La/n12;

    .line 427
    .line 428
    const/16 v23, 0x0

    .line 429
    .line 430
    const/16 v24, 0x5f8

    .line 431
    .line 432
    const/16 v17, 0x0

    .line 433
    .line 434
    const/16 v18, 0x0

    .line 435
    .line 436
    const/16 v19, 0x0

    .line 437
    .line 438
    const/16 v20, 0x0

    .line 439
    .line 440
    const/16 v21, 0x0

    .line 441
    .line 442
    move-object/from16 v16, v0

    .line 443
    .line 444
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 445
    .line 446
    .line 447
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 448
    .line 449
    .line 450
    move-result-object v0

    .line 451
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 455
    .line 456
    .line 457
    goto/16 :goto_3

    .line 458
    .line 459
    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 460
    .line 461
    .line 462
    throw v12

    .line 463
    :cond_9
    instance-of v1, v0, La/in0;

    .line 464
    .line 465
    if-eqz v1, :cond_b

    .line 466
    .line 467
    check-cast v0, La/in0;

    .line 468
    .line 469
    iget-object v6, v0, La/in0;->a:Ljava/lang/String;

    .line 470
    .line 471
    iget-object v1, v3, La/dm0;->M1:La/wdk0;

    .line 472
    .line 473
    if-eqz v1, :cond_a

    .line 474
    .line 475
    new-instance v2, La/xdk0;

    .line 476
    .line 477
    sget-object v5, La/rek0;->b:La/rek0;

    .line 478
    .line 479
    const/4 v10, 0x0

    .line 480
    const/16 v11, 0x7c

    .line 481
    .line 482
    const/4 v7, 0x0

    .line 483
    const/4 v8, 0x0

    .line 484
    const/4 v9, 0x0

    .line 485
    move-object v4, v2

    .line 486
    invoke-direct/range {v4 .. v11}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 487
    .line 488
    .line 489
    const/16 v8, 0x3fc

    .line 490
    .line 491
    const/4 v4, 0x0

    .line 492
    const/4 v5, 0x0

    .line 493
    const/4 v6, 0x0

    .line 494
    invoke-static/range {v1 .. v8}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 495
    .line 496
    .line 497
    goto/16 :goto_3

    .line 498
    .line 499
    :cond_a
    const-string v0, "snackbarManager"

    .line 500
    .line 501
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 502
    .line 503
    .line 504
    throw v12

    .line 505
    :cond_b
    instance-of v1, v0, La/gn0;

    .line 506
    .line 507
    if-eqz v1, :cond_13

    .line 508
    .line 509
    check-cast v0, La/gn0;

    .line 510
    .line 511
    iget-object v0, v0, La/gn0;->a:La/ob0;

    .line 512
    .line 513
    instance-of v1, v0, La/mb0;

    .line 514
    .line 515
    if-eqz v1, :cond_d

    .line 516
    .line 517
    check-cast v0, La/mb0;

    .line 518
    .line 519
    iget-object v6, v0, La/mb0;->a:Ljava/lang/String;

    .line 520
    .line 521
    iget-object v4, v3, La/dm0;->L1:La/ynb;

    .line 522
    .line 523
    if-eqz v4, :cond_c

    .line 524
    .line 525
    sget-object v5, La/bm5;->e:La/bm5;

    .line 526
    .line 527
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 532
    .line 533
    .line 534
    const-string v9, "REQUEST_CHANGE_BALANCE_KEY"

    .line 535
    .line 536
    const/16 v10, 0x1e6

    .line 537
    .line 538
    const/4 v8, 0x0

    .line 539
    invoke-static/range {v4 .. v10}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 540
    .line 541
    .line 542
    goto/16 :goto_3

    .line 543
    .line 544
    :cond_c
    const-string v0, "changeBalanceDialogProvider"

    .line 545
    .line 546
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    throw v12

    .line 550
    :cond_d
    sget-object v1, La/lb0;->a:La/lb0;

    .line 551
    .line 552
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 553
    .line 554
    .line 555
    move-result v1

    .line 556
    const v2, 0x7f130e5c

    .line 557
    .line 558
    .line 559
    const v5, 0x7f130162

    .line 560
    .line 561
    .line 562
    if-eqz v1, :cond_f

    .line 563
    .line 564
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 565
    .line 566
    .line 567
    move-result-object v0

    .line 568
    if-eqz v0, :cond_11

    .line 569
    .line 570
    iget-object v1, v3, La/dm0;->N1:La/ii;

    .line 571
    .line 572
    if-eqz v1, :cond_e

    .line 573
    .line 574
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 575
    .line 576
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v14

    .line 580
    const v4, 0x7f1303dc

    .line 581
    .line 582
    .line 583
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 584
    .line 585
    .line 586
    move-result-object v15

    .line 587
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v16

    .line 591
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    sget-object v22, La/n12;->b:La/n12;

    .line 595
    .line 596
    const/16 v23, 0x0

    .line 597
    .line 598
    const/16 v24, 0x5d8

    .line 599
    .line 600
    const/16 v17, 0x0

    .line 601
    .line 602
    const/16 v18, 0x0

    .line 603
    .line 604
    const-string v19, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 605
    .line 606
    const/16 v20, 0x0

    .line 607
    .line 608
    const/16 v21, 0x0

    .line 609
    .line 610
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 611
    .line 612
    .line 613
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 614
    .line 615
    .line 616
    move-result-object v0

    .line 617
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 618
    .line 619
    .line 620
    goto :goto_3

    .line 621
    :cond_e
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v12

    .line 625
    :cond_f
    sget-object v1, La/nb0;->a:La/nb0;

    .line 626
    .line 627
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 628
    .line 629
    .line 630
    move-result v0

    .line 631
    if-eqz v0, :cond_12

    .line 632
    .line 633
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 634
    .line 635
    .line 636
    move-result-object v0

    .line 637
    if-eqz v0, :cond_11

    .line 638
    .line 639
    iget-object v1, v3, La/dm0;->N1:La/ii;

    .line 640
    .line 641
    if-eqz v1, :cond_10

    .line 642
    .line 643
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 644
    .line 645
    invoke-virtual {v0, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 646
    .line 647
    .line 648
    move-result-object v14

    .line 649
    const v4, 0x7f13123b

    .line 650
    .line 651
    .line 652
    invoke-virtual {v0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v15

    .line 656
    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 657
    .line 658
    .line 659
    move-result-object v16

    .line 660
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 661
    .line 662
    .line 663
    sget-object v22, La/n12;->b:La/n12;

    .line 664
    .line 665
    const/16 v23, 0x0

    .line 666
    .line 667
    const/16 v24, 0x5d8

    .line 668
    .line 669
    const/16 v17, 0x0

    .line 670
    .line 671
    const/16 v18, 0x0

    .line 672
    .line 673
    const-string v19, "REQUEST_ATTENTION_DIALOG_KEY"

    .line 674
    .line 675
    const/16 v20, 0x0

    .line 676
    .line 677
    const/16 v21, 0x0

    .line 678
    .line 679
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 680
    .line 681
    .line 682
    invoke-virtual {v0}, La/kxq;->r()La/v1r;

    .line 683
    .line 684
    .line 685
    move-result-object v0

    .line 686
    invoke-virtual {v1, v13, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 687
    .line 688
    .line 689
    goto :goto_3

    .line 690
    :cond_10
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 691
    .line 692
    .line 693
    throw v12

    .line 694
    :cond_11
    :goto_3
    invoke-virtual {v3}, La/dm0;->G0()La/k3t0;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    sget-object v1, La/zk0;->a:La/zk0;

    .line 699
    .line 700
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 701
    .line 702
    .line 703
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    goto :goto_4

    .line 706
    :cond_12
    invoke-static {}, La/t9f;->b()V

    .line 707
    .line 708
    .line 709
    goto :goto_4

    .line 710
    :cond_13
    invoke-static {}, La/t9f;->b()V

    .line 711
    .line 712
    .line 713
    :goto_4
    return-object v12

    .line 714
    :pswitch_9
    check-cast v0, La/oe0;

    .line 715
    .line 716
    check-cast v1, Ljava/lang/Throwable;

    .line 717
    .line 718
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    iget-object v0, v0, La/oe0;->p:La/duj;

    .line 722
    .line 723
    new-instance v2, La/g20;

    .line 724
    .line 725
    invoke-direct {v2, v3}, La/g20;-><init>(B)V

    .line 726
    .line 727
    .line 728
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 729
    .line 730
    .line 731
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 732
    .line 733
    return-object v0

    .line 734
    :pswitch_a
    check-cast v0, La/fc0;

    .line 735
    .line 736
    check-cast v1, La/abi0;

    .line 737
    .line 738
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    iget-object v0, v0, La/fc0;->c:La/n0x;

    .line 742
    .line 743
    invoke-interface {v0}, La/o0x;->a()Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    move-result-object v0

    .line 747
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v0

    .line 751
    invoke-static {v1, v0}, La/cbi0;->e(La/abi0;Ljava/lang/String;)V

    .line 752
    .line 753
    .line 754
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 755
    .line 756
    return-object v0

    .line 757
    :pswitch_b
    check-cast v0, La/s10;

    .line 758
    .line 759
    check-cast v1, Landroid/view/View;

    .line 760
    .line 761
    sget-object v2, La/s10;->Q1:La/qek0;

    .line 762
    .line 763
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0}, La/s10;->H0()La/f20;

    .line 767
    .line 768
    .line 769
    move-result-object v0

    .line 770
    invoke-virtual {v0}, La/f20;->x()V

    .line 771
    .line 772
    .line 773
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 774
    .line 775
    return-object v0

    .line 776
    :pswitch_c
    move-object v2, v0

    .line 777
    check-cast v2, La/ez;

    .line 778
    .line 779
    move-object v0, v1

    .line 780
    check-cast v0, Ljava/lang/Throwable;

    .line 781
    .line 782
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 783
    .line 784
    .line 785
    iget-object v1, v2, La/ez;->s:La/duj;

    .line 786
    .line 787
    new-instance v3, La/hhd;

    .line 788
    .line 789
    const/16 v4, 0x1c

    .line 790
    .line 791
    invoke-direct {v3, v4}, La/hhd;-><init>(B)V

    .line 792
    .line 793
    .line 794
    invoke-virtual {v1, v0, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 795
    .line 796
    .line 797
    iget-object v0, v2, La/i3t0;->i:La/ocj;

    .line 798
    .line 799
    iget-object v3, v0, La/ocj;->a:La/p7m0;

    .line 800
    .line 801
    :cond_14
    invoke-virtual {v3}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 802
    .line 803
    .line 804
    move-result-object v0

    .line 805
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 806
    .line 807
    .line 808
    iget-object v1, v2, La/i3t0;->f:La/oyg0;

    .line 809
    .line 810
    move-object v4, v0

    .line 811
    check-cast v4, La/my;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    invoke-static {v4, v12, v11, v9}, La/my;->a(La/my;Ljava/util/List;ZI)La/my;

    .line 817
    .line 818
    .line 819
    move-result-object v1

    .line 820
    invoke-virtual {v3, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 821
    .line 822
    .line 823
    move-result v0

    .line 824
    if-eqz v0, :cond_14

    .line 825
    .line 826
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 827
    .line 828
    return-object v0

    .line 829
    :pswitch_d
    check-cast v0, La/gu;

    .line 830
    .line 831
    check-cast v1, La/s4q0;

    .line 832
    .line 833
    iget-object v2, v0, La/gu;->q:La/a6p0;

    .line 834
    .line 835
    sget-object v3, La/dy2;->b:La/zfn;

    .line 836
    .line 837
    invoke-static {v0, v3}, La/mbc;->R(La/vld;Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    invoke-virtual {v2, v1, v0}, La/a6p0;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 842
    .line 843
    .line 844
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 845
    .line 846
    return-object v0

    .line 847
    :pswitch_e
    check-cast v0, La/mt;

    .line 848
    .line 849
    check-cast v1, La/k0w0;

    .line 850
    .line 851
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 852
    .line 853
    .line 854
    iget-object v0, v0, La/mt;->B:La/mi70;

    .line 855
    .line 856
    new-instance v2, La/i38;

    .line 857
    .line 858
    invoke-direct {v2, v8}, La/i38;-><init>(I)V

    .line 859
    .line 860
    .line 861
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    new-instance v0, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;

    .line 865
    .line 866
    invoke-direct {v0, v2}, Lorg/xplatform/security/impl/navigation/BindPhoneNumberScreen;-><init>(La/l38;)V

    .line 867
    .line 868
    .line 869
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 870
    .line 871
    .line 872
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 873
    .line 874
    return-object v0

    .line 875
    :pswitch_f
    check-cast v0, La/xm;

    .line 876
    .line 877
    check-cast v1, La/rm;

    .line 878
    .line 879
    sget-object v2, La/xm;->Q1:La/jdk0;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    iget-object v0, v0, La/xm;->N1:La/a8z;

    .line 885
    .line 886
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 887
    .line 888
    .line 889
    move-result-object v0

    .line 890
    check-cast v0, La/k3t0;

    .line 891
    .line 892
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 893
    .line 894
    .line 895
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 896
    .line 897
    return-object v0

    .line 898
    :pswitch_10
    check-cast v0, La/pf10;

    .line 899
    .line 900
    check-cast v1, La/cp;

    .line 901
    .line 902
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 906
    .line 907
    check-cast v2, La/tp10;

    .line 908
    .line 909
    iget-object v2, v2, La/tp10;->a:Lorg/xplatform/uikit/components/cells/DsSettingsCell;

    .line 910
    .line 911
    new-instance v3, La/wg;

    .line 912
    .line 913
    invoke-direct {v3, v0, v1, v11}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 914
    .line 915
    .line 916
    invoke-virtual {v2, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 917
    .line 918
    .line 919
    new-instance v0, La/j9;

    .line 920
    .line 921
    invoke-direct {v0, v1, v8}, La/j9;-><init>(La/cp;B)V

    .line 922
    .line 923
    .line 924
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 925
    .line 926
    .line 927
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_11
    check-cast v0, La/t0;

    .line 931
    .line 932
    check-cast v1, La/cp;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 938
    .line 939
    check-cast v2, La/urx;

    .line 940
    .line 941
    iget-object v2, v2, La/urx;->a:Landroid/widget/LinearLayout;

    .line 942
    .line 943
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 944
    .line 945
    .line 946
    new-instance v3, La/k1;

    .line 947
    .line 948
    const/16 v4, 0xe

    .line 949
    .line 950
    invoke-direct {v3, v0, v1, v4}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 951
    .line 952
    .line 953
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 954
    .line 955
    .line 956
    new-instance v0, La/ok;

    .line 957
    .line 958
    invoke-direct {v0, v1, v1, v10}, La/ok;-><init>(La/cp;La/cp;B)V

    .line 959
    .line 960
    .line 961
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 962
    .line 963
    .line 964
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 965
    .line 966
    return-object v0

    .line 967
    :pswitch_12
    check-cast v0, La/du20;

    .line 968
    .line 969
    check-cast v1, La/cp;

    .line 970
    .line 971
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 972
    .line 973
    .line 974
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 975
    .line 976
    check-cast v2, La/gux;

    .line 977
    .line 978
    iget-object v2, v2, La/gux;->a:Landroid/widget/LinearLayout;

    .line 979
    .line 980
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 981
    .line 982
    .line 983
    new-instance v3, La/k1;

    .line 984
    .line 985
    const/16 v4, 0xd

    .line 986
    .line 987
    invoke-direct {v3, v0, v1, v4}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 988
    .line 989
    .line 990
    invoke-static {v2, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 991
    .line 992
    .line 993
    new-instance v0, La/j9;

    .line 994
    .line 995
    const/16 v2, 0xb

    .line 996
    .line 997
    invoke-direct {v0, v1, v2}, La/j9;-><init>(La/cp;B)V

    .line 998
    .line 999
    .line 1000
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1001
    .line 1002
    .line 1003
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1004
    .line 1005
    return-object v0

    .line 1006
    :pswitch_13
    check-cast v0, La/du20;

    .line 1007
    .line 1008
    check-cast v1, La/cp;

    .line 1009
    .line 1010
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1014
    .line 1015
    check-cast v2, La/fux;

    .line 1016
    .line 1017
    iget-object v2, v2, La/fux;->a:Landroid/widget/LinearLayout;

    .line 1018
    .line 1019
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1020
    .line 1021
    .line 1022
    new-instance v3, La/k1;

    .line 1023
    .line 1024
    invoke-direct {v3, v0, v1, v8}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1025
    .line 1026
    .line 1027
    invoke-static {v2, v3}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 1028
    .line 1029
    .line 1030
    new-instance v0, La/j9;

    .line 1031
    .line 1032
    invoke-direct {v0, v1, v9}, La/j9;-><init>(La/cp;B)V

    .line 1033
    .line 1034
    .line 1035
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1036
    .line 1037
    .line 1038
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1039
    .line 1040
    return-object v0

    .line 1041
    :pswitch_14
    check-cast v0, La/dh;

    .line 1042
    .line 1043
    check-cast v1, La/abi0;

    .line 1044
    .line 1045
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1046
    .line 1047
    .line 1048
    sget-object v2, La/cbi0;->b:La/zai0;

    .line 1049
    .line 1050
    iget v0, v0, La/dh;->c:I

    .line 1051
    .line 1052
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    invoke-interface {v1, v2, v0}, La/abi0;->b(La/zai0;Ljava/lang/Object;)V

    .line 1057
    .line 1058
    .line 1059
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1060
    .line 1061
    return-object v0

    .line 1062
    :pswitch_15
    check-cast v0, La/uf;

    .line 1063
    .line 1064
    check-cast v1, Ljava/lang/Throwable;

    .line 1065
    .line 1066
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    iget-object v1, v0, La/uf;->e:La/p7m0;

    .line 1070
    .line 1071
    new-instance v2, La/rf;

    .line 1072
    .line 1073
    iget-object v6, v0, La/uf;->d:La/sa10;

    .line 1074
    .line 1075
    sget-object v7, La/pb10;->g:La/pb10;

    .line 1076
    .line 1077
    new-instance v10, La/nc;

    .line 1078
    .line 1079
    invoke-direct {v10, v0, v5}, La/nc;-><init>(Ljava/lang/Object;B)V

    .line 1080
    .line 1081
    .line 1082
    const/16 v11, 0x10

    .line 1083
    .line 1084
    const v8, 0x7f130677

    .line 1085
    .line 1086
    .line 1087
    const v9, 0x7f131690

    .line 1088
    .line 1089
    .line 1090
    invoke-static/range {v6 .. v11}, La/sa10;->b(La/sa10;La/pb10;IILkotlin/jvm/functions/Function0;I)La/ra10;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v0

    .line 1094
    invoke-direct {v2, v0}, La/rf;-><init>(La/ra10;)V

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1098
    .line 1099
    .line 1100
    invoke-virtual {v1, v12, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1101
    .line 1102
    .line 1103
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1104
    .line 1105
    return-object v0

    .line 1106
    :pswitch_16
    check-cast v0, La/qd;

    .line 1107
    .line 1108
    check-cast v1, La/k0w0;

    .line 1109
    .line 1110
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    iget-object v2, v0, La/qd;->d:La/zn00;

    .line 1114
    .line 1115
    new-instance v3, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 1116
    .line 1117
    iget-object v4, v0, La/qd;->g:La/otn;

    .line 1118
    .line 1119
    iget-object v4, v4, La/otn;->a:Lorg/xplatform/security/api/presentation/models/TokenRestoreData;

    .line 1120
    .line 1121
    iget-object v5, v4, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;->a:Ljava/lang/String;

    .line 1122
    .line 1123
    iget-object v8, v4, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;->b:Ljava/lang/String;

    .line 1124
    .line 1125
    iget-object v4, v4, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;->c:La/tzf0;

    .line 1126
    .line 1127
    invoke-direct {v3, v5, v8, v4}, Lorg/xplatform/security/api/presentation/models/TokenRestoreData;-><init>(Ljava/lang/String;Ljava/lang/String;La/tzf0;)V

    .line 1128
    .line 1129
    .line 1130
    iget-object v0, v0, La/qd;->j:La/p7m0;

    .line 1131
    .line 1132
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v0

    .line 1136
    check-cast v0, Ljava/lang/Iterable;

    .line 1137
    .line 1138
    new-instance v4, Ljava/util/ArrayList;

    .line 1139
    .line 1140
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 1141
    .line 1142
    .line 1143
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v0

    .line 1147
    :cond_15
    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1148
    .line 1149
    .line 1150
    move-result v5

    .line 1151
    if-eqz v5, :cond_16

    .line 1152
    .line 1153
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v5

    .line 1157
    instance-of v8, v5, La/ug;

    .line 1158
    .line 1159
    if-eqz v8, :cond_15

    .line 1160
    .line 1161
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1162
    .line 1163
    .line 1164
    goto :goto_5

    .line 1165
    :cond_16
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v0

    .line 1169
    :cond_17
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1170
    .line 1171
    .line 1172
    move-result v4

    .line 1173
    if-eqz v4, :cond_18

    .line 1174
    .line 1175
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v4

    .line 1179
    move-object v5, v4

    .line 1180
    check-cast v5, La/ug;

    .line 1181
    .line 1182
    iget-boolean v5, v5, La/ug;->c:Z

    .line 1183
    .line 1184
    if-ne v5, v11, :cond_17

    .line 1185
    .line 1186
    move-object v12, v4

    .line 1187
    :cond_18
    check-cast v12, La/ug;

    .line 1188
    .line 1189
    if-eqz v12, :cond_19

    .line 1190
    .line 1191
    iget-wide v6, v12, La/ug;->a:J

    .line 1192
    .line 1193
    :cond_19
    sget-object v0, La/we50;->d:La/we50;

    .line 1194
    .line 1195
    invoke-virtual {v2, v3, v6, v7, v0}, La/zn00;->J0(Lorg/xplatform/security/api/presentation/models/TokenRestoreData;JLa/we50;)Lcom/github/terrakok/cicerone/androidx/FragmentScreen$Companion$invoke$1;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-virtual {v1, v0}, La/k0w0;->k(La/m7h0;)V

    .line 1200
    .line 1201
    .line 1202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1203
    .line 1204
    return-object v0

    .line 1205
    :pswitch_17
    check-cast v0, La/qc;

    .line 1206
    .line 1207
    check-cast v1, La/rc;

    .line 1208
    .line 1209
    sget-object v2, La/qc;->n2:La/hfk0;

    .line 1210
    .line 1211
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1212
    .line 1213
    .line 1214
    iget-object v2, v1, La/rc;->a:La/hc;

    .line 1215
    .line 1216
    iget-wide v3, v1, La/rc;->b:J

    .line 1217
    .line 1218
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 1219
    .line 1220
    .line 1221
    move-result v1

    .line 1222
    if-eqz v1, :cond_1b

    .line 1223
    .line 1224
    if-ne v1, v11, :cond_1a

    .line 1225
    .line 1226
    const-string v1, "SELECT_REMOVE_ACTION_KEY"

    .line 1227
    .line 1228
    goto :goto_6

    .line 1229
    :cond_1a
    invoke-static {}, La/t9f;->b()V

    .line 1230
    .line 1231
    .line 1232
    goto :goto_7

    .line 1233
    :cond_1b
    const-string v1, "SELECT_ACTIVE_ACTION_KEY"

    .line 1234
    .line 1235
    :goto_6
    iget-object v2, v0, La/qc;->m2:La/khf0;

    .line 1236
    .line 1237
    sget-object v5, La/qc;->o2:[La/iiy;

    .line 1238
    .line 1239
    aget-object v5, v5, v10

    .line 1240
    .line 1241
    invoke-virtual {v2, v0, v5}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v2

    .line 1245
    check-cast v2, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;

    .line 1246
    .line 1247
    iget-object v2, v2, Lorg/xplatform/wallet/impl/presentation/dialogs/accountactions/params/AccountActionsScreenParams;->a:Ljava/lang/String;

    .line 1248
    .line 1249
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1250
    .line 1251
    .line 1252
    move-result-object v3

    .line 1253
    new-instance v4, Lkotlin/Pair;

    .line 1254
    .line 1255
    invoke-direct {v4, v1, v3}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1256
    .line 1257
    .line 1258
    filled-new-array {v4}, [Lkotlin/Pair;

    .line 1259
    .line 1260
    .line 1261
    move-result-object v1

    .line 1262
    invoke-static {v1}, La/i120;->V([Lkotlin/Pair;)Landroid/os/Bundle;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v1

    .line 1266
    invoke-static {v1, v0, v2}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    invoke-virtual {v0}, La/yo8;->y0()V

    .line 1270
    .line 1271
    .line 1272
    iget-object v0, v0, La/qc;->l2:La/a8z;

    .line 1273
    .line 1274
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1275
    .line 1276
    .line 1277
    move-result-object v0

    .line 1278
    check-cast v0, La/k3t0;

    .line 1279
    .line 1280
    sget-object v1, La/ic;->a:La/ic;

    .line 1281
    .line 1282
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1283
    .line 1284
    .line 1285
    sget-object v12, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1286
    .line 1287
    :goto_7
    return-object v12

    .line 1288
    :pswitch_18
    check-cast v0, La/q9;

    .line 1289
    .line 1290
    check-cast v1, La/cp;

    .line 1291
    .line 1292
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1293
    .line 1294
    .line 1295
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1296
    .line 1297
    check-cast v2, La/rrx;

    .line 1298
    .line 1299
    iget-object v2, v2, La/rrx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1300
    .line 1301
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1302
    .line 1303
    .line 1304
    new-instance v3, La/k1;

    .line 1305
    .line 1306
    invoke-direct {v3, v0, v1, v9}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1307
    .line 1308
    .line 1309
    invoke-static {v2, v3}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1310
    .line 1311
    .line 1312
    new-instance v0, La/j9;

    .line 1313
    .line 1314
    const/16 v2, 0x8

    .line 1315
    .line 1316
    invoke-direct {v0, v1, v2}, La/j9;-><init>(La/cp;B)V

    .line 1317
    .line 1318
    .line 1319
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1320
    .line 1321
    .line 1322
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1323
    .line 1324
    return-object v0

    .line 1325
    :pswitch_19
    check-cast v0, La/q9;

    .line 1326
    .line 1327
    check-cast v1, La/cp;

    .line 1328
    .line 1329
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1330
    .line 1331
    .line 1332
    iget-object v2, v1, La/cp;->u:La/yfu0;

    .line 1333
    .line 1334
    check-cast v2, La/prx;

    .line 1335
    .line 1336
    iget-object v2, v2, La/prx;->a:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 1337
    .line 1338
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1339
    .line 1340
    .line 1341
    new-instance v4, La/k1;

    .line 1342
    .line 1343
    invoke-direct {v4, v0, v1, v3}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1344
    .line 1345
    .line 1346
    invoke-static {v2, v4}, La/dyb;->O(Landroid/view/View;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 1347
    .line 1348
    .line 1349
    new-instance v0, La/j9;

    .line 1350
    .line 1351
    const/4 v2, 0x5

    .line 1352
    invoke-direct {v0, v1, v2}, La/j9;-><init>(La/cp;B)V

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v1, v0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 1356
    .line 1357
    .line 1358
    new-instance v0, La/bb;

    .line 1359
    .line 1360
    invoke-direct {v0, v1, v10}, La/bb;-><init>(La/cp;B)V

    .line 1361
    .line 1362
    .line 1363
    invoke-virtual {v1, v0}, La/cp;->z(Lkotlin/jvm/functions/Function0;)V

    .line 1364
    .line 1365
    .line 1366
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1367
    .line 1368
    return-object v0

    .line 1369
    :pswitch_1a
    check-cast v0, La/h3;

    .line 1370
    .line 1371
    check-cast v1, Ljava/util/Map$Entry;

    .line 1372
    .line 1373
    sget-object v2, La/h3;->c:La/d3;

    .line 1374
    .line 1375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1376
    .line 1377
    .line 1378
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1379
    .line 1380
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v3

    .line 1384
    const-string v4, "(this Map)"

    .line 1385
    .line 1386
    if-ne v3, v0, :cond_1c

    .line 1387
    .line 1388
    move-object v3, v4

    .line 1389
    goto :goto_8

    .line 1390
    :cond_1c
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1391
    .line 1392
    .line 1393
    move-result-object v3

    .line 1394
    :goto_8
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1395
    .line 1396
    .line 1397
    const/16 v3, 0x3d

    .line 1398
    .line 1399
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1400
    .line 1401
    .line 1402
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1403
    .line 1404
    .line 1405
    move-result-object v1

    .line 1406
    if-ne v1, v0, :cond_1d

    .line 1407
    .line 1408
    goto :goto_9

    .line 1409
    :cond_1d
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1410
    .line 1411
    .line 1412
    move-result-object v4

    .line 1413
    :goto_9
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1414
    .line 1415
    .line 1416
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1417
    .line 1418
    .line 1419
    move-result-object v0

    .line 1420
    return-object v0

    .line 1421
    :pswitch_1b
    check-cast v0, La/ldy;

    .line 1422
    .line 1423
    check-cast v1, La/mcy;

    .line 1424
    .line 1425
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1426
    .line 1427
    .line 1428
    iget-object v2, v0, La/ldy;->a:Ljava/util/ArrayList;

    .line 1429
    .line 1430
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->d0(Ljava/util/List;)Ljava/lang/Object;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v2

    .line 1434
    check-cast v2, Ljava/lang/String;

    .line 1435
    .line 1436
    invoke-virtual {v0, v1, v2}, La/ldy;->M(La/mcy;Ljava/lang/String;)V

    .line 1437
    .line 1438
    .line 1439
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1440
    .line 1441
    return-object v0

    .line 1442
    :pswitch_1c
    check-cast v0, La/u1;

    .line 1443
    .line 1444
    if-ne v1, v0, :cond_1e

    .line 1445
    .line 1446
    const-string v0, "(this Collection)"

    .line 1447
    .line 1448
    goto :goto_a

    .line 1449
    :cond_1e
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 1450
    .line 1451
    .line 1452
    move-result-object v0

    .line 1453
    :goto_a
    return-object v0

    .line 1454
    nop

    .line 1455
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
