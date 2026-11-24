.class public final synthetic La/kcl0;
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
    iput-byte p7, p0, La/kcl0;->a:B

    invoke-direct/range {p0 .. p6}, La/qer;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/kcl0;->a:B

    .line 4
    .line 5
    const v2, 0x7f130e5d

    .line 6
    .line 7
    .line 8
    const v3, 0x7f13140a

    .line 9
    .line 10
    .line 11
    const v4, 0x7f1304dc

    .line 12
    .line 13
    .line 14
    const-string v5, "composeGameCardFragmentDelegate"

    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    const v7, 0x7f131843

    .line 18
    .line 19
    .line 20
    const v8, 0x7f130e07

    .line 21
    .line 22
    .line 23
    const-string v9, "actionDialogManager"

    .line 24
    .line 25
    const/16 v10, 0x10

    .line 26
    .line 27
    const/4 v11, 0x0

    .line 28
    packed-switch v1, :pswitch_data_0

    .line 29
    .line 30
    .line 31
    move-object/from16 v1, p1

    .line 32
    .line 33
    check-cast v1, La/den0;

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v0, La/k3t0;

    .line 41
    .line 42
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object v0

    .line 48
    :pswitch_0
    move-object/from16 v1, p1

    .line 49
    .line 50
    check-cast v1, La/ycn0;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, La/k3t0;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_1
    move-object/from16 v1, p1

    .line 66
    .line 67
    check-cast v1, La/ecn0;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, La/k3t0;

    .line 75
    .line 76
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 80
    .line 81
    return-object v0

    .line 82
    :pswitch_2
    move-object/from16 v1, p1

    .line 83
    .line 84
    check-cast v1, La/ien0;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 90
    .line 91
    check-cast v0, La/icn0;

    .line 92
    .line 93
    sget-object v2, La/icn0;->W1:La/g9m0;

    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    instance-of v2, v1, La/hen0;

    .line 99
    .line 100
    if-eqz v2, :cond_0

    .line 101
    .line 102
    invoke-virtual {v0}, La/icn0;->I0()V

    .line 103
    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_0
    instance-of v2, v1, La/gen0;

    .line 107
    .line 108
    if-eqz v2, :cond_1

    .line 109
    .line 110
    invoke-virtual {v0}, La/icn0;->G0()La/k3t0;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    new-instance v3, La/acn0;

    .line 115
    .line 116
    check-cast v1, La/gen0;

    .line 117
    .line 118
    iget-boolean v1, v1, La/gen0;->a:Z

    .line 119
    .line 120
    invoke-direct {v3, v1}, La/acn0;-><init>(Z)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 124
    .line 125
    .line 126
    :cond_1
    :goto_0
    iget-object v0, v0, La/icn0;->S1:La/a8z;

    .line 127
    .line 128
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    check-cast v0, La/k3t0;

    .line 133
    .line 134
    sget-object v1, La/udn0;->a:La/udn0;

    .line 135
    .line 136
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 140
    .line 141
    return-object v0

    .line 142
    :pswitch_3
    move-object/from16 v1, p1

    .line 143
    .line 144
    check-cast v1, La/gdn0;

    .line 145
    .line 146
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 150
    .line 151
    check-cast v0, La/icn0;

    .line 152
    .line 153
    sget-object v2, La/icn0;->W1:La/g9m0;

    .line 154
    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    instance-of v2, v1, La/ddn0;

    .line 159
    .line 160
    if-eqz v2, :cond_3

    .line 161
    .line 162
    iget-object v2, v0, La/icn0;->M1:La/ujd;

    .line 163
    .line 164
    if-eqz v2, :cond_2

    .line 165
    .line 166
    check-cast v1, La/ddn0;

    .line 167
    .line 168
    iget-object v1, v1, La/ddn0;->a:La/sjd;

    .line 169
    .line 170
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 171
    .line 172
    .line 173
    goto :goto_1

    .line 174
    :cond_2
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v11

    .line 178
    :cond_3
    instance-of v2, v1, La/fdn0;

    .line 179
    .line 180
    if-eqz v2, :cond_4

    .line 181
    .line 182
    invoke-virtual {v0}, La/icn0;->I0()V

    .line 183
    .line 184
    .line 185
    goto :goto_1

    .line 186
    :cond_4
    instance-of v2, v1, La/edn0;

    .line 187
    .line 188
    if-eqz v2, :cond_5

    .line 189
    .line 190
    invoke-virtual {v0}, La/icn0;->G0()La/k3t0;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    new-instance v3, La/acn0;

    .line 195
    .line 196
    check-cast v1, La/edn0;

    .line 197
    .line 198
    iget-boolean v1, v1, La/edn0;->a:Z

    .line 199
    .line 200
    invoke-direct {v3, v1}, La/acn0;-><init>(Z)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v2, v3}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    :cond_5
    :goto_1
    invoke-virtual {v0}, La/icn0;->H0()La/k3t0;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    sget-object v1, La/scn0;->a:La/scn0;

    .line 211
    .line 212
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 213
    .line 214
    .line 215
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 216
    .line 217
    return-object v0

    .line 218
    :pswitch_4
    move-object/from16 v1, p1

    .line 219
    .line 220
    check-cast v1, La/mcn0;

    .line 221
    .line 222
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 226
    .line 227
    check-cast v0, La/icn0;

    .line 228
    .line 229
    sget-object v2, La/icn0;->W1:La/g9m0;

    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    instance-of v2, v1, La/kcn0;

    .line 235
    .line 236
    if-eqz v2, :cond_7

    .line 237
    .line 238
    iget-object v1, v0, La/icn0;->L1:La/ii;

    .line 239
    .line 240
    if-eqz v1, :cond_6

    .line 241
    .line 242
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 243
    .line 244
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v13

    .line 248
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v14

    .line 252
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object v15

    .line 256
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v16

    .line 263
    sget-object v21, La/n12;->a:La/n12;

    .line 264
    .line 265
    const/16 v22, 0x0

    .line 266
    .line 267
    const/16 v23, 0x5d0

    .line 268
    .line 269
    const/16 v17, 0x0

    .line 270
    .line 271
    const-string v18, "CLEAR_EVENTS_CONFIRM_DIALOG_KEY"

    .line 272
    .line 273
    const/16 v19, 0x0

    .line 274
    .line 275
    const/16 v20, 0x0

    .line 276
    .line 277
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 288
    .line 289
    .line 290
    goto :goto_2

    .line 291
    :cond_6
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    throw v11

    .line 295
    :cond_7
    instance-of v1, v1, La/lcn0;

    .line 296
    .line 297
    if-eqz v1, :cond_9

    .line 298
    .line 299
    iget-object v1, v0, La/icn0;->L1:La/ii;

    .line 300
    .line 301
    if-eqz v1, :cond_8

    .line 302
    .line 303
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 304
    .line 305
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v13

    .line 309
    const v2, 0x7f13140b

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 313
    .line 314
    .line 315
    move-result-object v14

    .line 316
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 317
    .line 318
    .line 319
    move-result-object v15

    .line 320
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 321
    .line 322
    .line 323
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 324
    .line 325
    .line 326
    move-result-object v16

    .line 327
    sget-object v21, La/n12;->a:La/n12;

    .line 328
    .line 329
    const/16 v22, 0x0

    .line 330
    .line 331
    const/16 v23, 0x5d0

    .line 332
    .line 333
    const/16 v17, 0x0

    .line 334
    .line 335
    const-string v18, "CLEAR_TEAMS_CONFIRM_DIALOG_KEY"

    .line 336
    .line 337
    const/16 v19, 0x0

    .line 338
    .line 339
    const/16 v20, 0x0

    .line 340
    .line 341
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 342
    .line 343
    .line 344
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 352
    .line 353
    .line 354
    goto :goto_2

    .line 355
    :cond_8
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 356
    .line 357
    .line 358
    throw v11

    .line 359
    :cond_9
    :goto_2
    invoke-virtual {v0}, La/icn0;->G0()La/k3t0;

    .line 360
    .line 361
    .line 362
    move-result-object v0

    .line 363
    sget-object v1, La/zbn0;->a:La/zbn0;

    .line 364
    .line 365
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 366
    .line 367
    .line 368
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 369
    .line 370
    return-object v0

    .line 371
    :pswitch_5
    move-object/from16 v1, p1

    .line 372
    .line 373
    check-cast v1, La/san0;

    .line 374
    .line 375
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 376
    .line 377
    .line 378
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 379
    .line 380
    check-cast v0, La/k3t0;

    .line 381
    .line 382
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 383
    .line 384
    .line 385
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 386
    .line 387
    return-object v0

    .line 388
    :pswitch_6
    move-object/from16 v1, p1

    .line 389
    .line 390
    check-cast v1, La/ybn0;

    .line 391
    .line 392
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 393
    .line 394
    .line 395
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 396
    .line 397
    check-cast v0, La/dbn0;

    .line 398
    .line 399
    sget-object v6, La/dbn0;->S1:La/j6m0;

    .line 400
    .line 401
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 402
    .line 403
    .line 404
    instance-of v6, v1, La/vbn0;

    .line 405
    .line 406
    if-eqz v6, :cond_b

    .line 407
    .line 408
    iget-object v2, v0, La/dbn0;->O1:La/ujd;

    .line 409
    .line 410
    if-eqz v2, :cond_a

    .line 411
    .line 412
    check-cast v1, La/vbn0;

    .line 413
    .line 414
    iget-object v1, v1, La/vbn0;->a:La/sjd;

    .line 415
    .line 416
    invoke-virtual {v2, v0, v1}, La/ujd;->b(Landroidx/fragment/app/Fragment;La/sjd;)V

    .line 417
    .line 418
    .line 419
    goto/16 :goto_3

    .line 420
    .line 421
    :cond_a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 422
    .line 423
    .line 424
    throw v11

    .line 425
    :cond_b
    instance-of v5, v1, La/wbn0;

    .line 426
    .line 427
    if-eqz v5, :cond_d

    .line 428
    .line 429
    iget-object v1, v0, La/dbn0;->L1:La/ii;

    .line 430
    .line 431
    if-eqz v1, :cond_c

    .line 432
    .line 433
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 434
    .line 435
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v13

    .line 439
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 440
    .line 441
    .line 442
    move-result-object v14

    .line 443
    invoke-virtual {v0, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 444
    .line 445
    .line 446
    move-result-object v15

    .line 447
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v0, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 451
    .line 452
    .line 453
    move-result-object v16

    .line 454
    sget-object v21, La/n12;->a:La/n12;

    .line 455
    .line 456
    const/16 v22, 0x0

    .line 457
    .line 458
    const/16 v23, 0x5d0

    .line 459
    .line 460
    const/16 v17, 0x0

    .line 461
    .line 462
    const-string v18, "REQUEST_SHOW_CONFIRM_DELETE_DIALOG_KEY"

    .line 463
    .line 464
    const/16 v19, 0x0

    .line 465
    .line 466
    const/16 v20, 0x0

    .line 467
    .line 468
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 472
    .line 473
    .line 474
    move-result-object v2

    .line 475
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 476
    .line 477
    .line 478
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 479
    .line 480
    .line 481
    goto :goto_3

    .line 482
    :cond_c
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 483
    .line 484
    .line 485
    throw v11

    .line 486
    :cond_d
    instance-of v1, v1, La/xbn0;

    .line 487
    .line 488
    if-eqz v1, :cond_f

    .line 489
    .line 490
    iget-object v1, v0, La/dbn0;->L1:La/ii;

    .line 491
    .line 492
    if-eqz v1, :cond_e

    .line 493
    .line 494
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 495
    .line 496
    const v3, 0x7f130162

    .line 497
    .line 498
    .line 499
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v13

    .line 503
    const v3, 0x7f131247

    .line 504
    .line 505
    .line 506
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v14

    .line 510
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 511
    .line 512
    .line 513
    move-result-object v15

    .line 514
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 515
    .line 516
    .line 517
    sget-object v21, La/n12;->b:La/n12;

    .line 518
    .line 519
    const/16 v22, 0x0

    .line 520
    .line 521
    const/16 v23, 0x5d8

    .line 522
    .line 523
    const/16 v16, 0x0

    .line 524
    .line 525
    const/16 v17, 0x0

    .line 526
    .line 527
    const-string v18, "REQUEST_SELF_EXCLUSION_ERROR_DIALOG_KEY"

    .line 528
    .line 529
    const/16 v19, 0x0

    .line 530
    .line 531
    const/16 v20, 0x0

    .line 532
    .line 533
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 534
    .line 535
    .line 536
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 544
    .line 545
    .line 546
    goto :goto_3

    .line 547
    :cond_e
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 548
    .line 549
    .line 550
    throw v11

    .line 551
    :cond_f
    :goto_3
    invoke-virtual {v0}, La/dbn0;->G0()La/k3t0;

    .line 552
    .line 553
    .line 554
    move-result-object v0

    .line 555
    sget-object v1, La/lan0;->a:La/lan0;

    .line 556
    .line 557
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 558
    .line 559
    .line 560
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 561
    .line 562
    return-object v0

    .line 563
    :pswitch_7
    move-object/from16 v1, p1

    .line 564
    .line 565
    check-cast v1, La/d0n0;

    .line 566
    .line 567
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 568
    .line 569
    .line 570
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 571
    .line 572
    check-cast v0, La/k3t0;

    .line 573
    .line 574
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 578
    .line 579
    return-object v0

    .line 580
    :pswitch_8
    move-object/from16 v1, p1

    .line 581
    .line 582
    check-cast v1, La/exm0;

    .line 583
    .line 584
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 585
    .line 586
    .line 587
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 588
    .line 589
    check-cast v0, La/k3t0;

    .line 590
    .line 591
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 592
    .line 593
    .line 594
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 595
    .line 596
    return-object v0

    .line 597
    :pswitch_9
    move-object/from16 v1, p1

    .line 598
    .line 599
    check-cast v1, Ljava/lang/Throwable;

    .line 600
    .line 601
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 602
    .line 603
    .line 604
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 605
    .line 606
    check-cast v0, La/ybm0;

    .line 607
    .line 608
    iget-object v2, v0, La/ybm0;->s:La/duj;

    .line 609
    .line 610
    new-instance v3, La/o3m0;

    .line 611
    .line 612
    const/4 v4, 0x6

    .line 613
    invoke-direct {v3, v1, v0, v4}, La/o3m0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 614
    .line 615
    .line 616
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 617
    .line 618
    .line 619
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 620
    .line 621
    return-object v0

    .line 622
    :pswitch_a
    move-object/from16 v1, p1

    .line 623
    .line 624
    check-cast v1, La/sbm0;

    .line 625
    .line 626
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 627
    .line 628
    .line 629
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 630
    .line 631
    check-cast v0, La/k3t0;

    .line 632
    .line 633
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 634
    .line 635
    .line 636
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 637
    .line 638
    return-object v0

    .line 639
    :pswitch_b
    move-object/from16 v1, p1

    .line 640
    .line 641
    check-cast v1, La/ccm0;

    .line 642
    .line 643
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 644
    .line 645
    .line 646
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 647
    .line 648
    check-cast v0, La/ubm0;

    .line 649
    .line 650
    sget-object v2, La/ubm0;->R1:La/y2m0;

    .line 651
    .line 652
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    sget-object v2, La/fcm0;->n2:La/j6m0;

    .line 656
    .line 657
    iget-object v3, v1, La/ccm0;->a:Ljava/lang/String;

    .line 658
    .line 659
    iget-object v1, v1, La/ccm0;->b:Ljava/util/ArrayList;

    .line 660
    .line 661
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 662
    .line 663
    .line 664
    new-instance v2, La/fcm0;

    .line 665
    .line 666
    invoke-direct {v2}, La/fcm0;-><init>()V

    .line 667
    .line 668
    .line 669
    sget-object v4, La/fcm0;->o2:[La/iiy;

    .line 670
    .line 671
    aget-object v5, v4, v6

    .line 672
    .line 673
    iget-object v6, v2, La/fcm0;->k2:La/phf0;

    .line 674
    .line 675
    invoke-virtual {v6, v2, v5, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 676
    .line 677
    .line 678
    const/4 v3, 0x1

    .line 679
    aget-object v3, v4, v3

    .line 680
    .line 681
    iget-object v5, v2, La/fcm0;->l2:La/es;

    .line 682
    .line 683
    invoke-virtual {v5, v2, v3, v1}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 684
    .line 685
    .line 686
    const/4 v1, 0x2

    .line 687
    aget-object v1, v4, v1

    .line 688
    .line 689
    iget-object v3, v2, La/fcm0;->m2:La/phf0;

    .line 690
    .line 691
    const-string v4, "SELECT_MENU_REQUEST_KEY"

    .line 692
    .line 693
    invoke-virtual {v3, v2, v1, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 697
    .line 698
    .line 699
    move-result-object v1

    .line 700
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 701
    .line 702
    .line 703
    invoke-static {v2, v1}, La/sj3;->D0(La/sik;Landroidx/fragment/app/e;)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v0}, La/ubm0;->G0()La/k3t0;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    sget-object v1, La/lbm0;->a:La/lbm0;

    .line 711
    .line 712
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 716
    .line 717
    return-object v0

    .line 718
    :pswitch_c
    move-object/from16 v1, p1

    .line 719
    .line 720
    check-cast v1, La/xhe0;

    .line 721
    .line 722
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 723
    .line 724
    .line 725
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 726
    .line 727
    check-cast v0, La/r9m0;

    .line 728
    .line 729
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 730
    .line 731
    .line 732
    iget-object v0, v0, La/r9m0;->a:La/vyx;

    .line 733
    .line 734
    if-eqz v0, :cond_10

    .line 735
    .line 736
    invoke-virtual {v0, v1}, La/vyx;->s(La/xhe0;)V

    .line 737
    .line 738
    .line 739
    :cond_10
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 740
    .line 741
    return-object v0

    .line 742
    :pswitch_d
    move-object/from16 v1, p1

    .line 743
    .line 744
    check-cast v1, Ljava/lang/Throwable;

    .line 745
    .line 746
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 747
    .line 748
    .line 749
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 750
    .line 751
    check-cast v0, La/w3m0;

    .line 752
    .line 753
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 754
    .line 755
    .line 756
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 757
    .line 758
    .line 759
    new-instance v1, La/gcl0;

    .line 760
    .line 761
    const/16 v2, 0x1c

    .line 762
    .line 763
    invoke-direct {v1, v2}, La/gcl0;-><init>(B)V

    .line 764
    .line 765
    .line 766
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 767
    .line 768
    .line 769
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 770
    .line 771
    return-object v0

    .line 772
    :pswitch_e
    move-object/from16 v1, p1

    .line 773
    .line 774
    check-cast v1, Ljava/lang/Number;

    .line 775
    .line 776
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 777
    .line 778
    .line 779
    move-result v1

    .line 780
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 781
    .line 782
    check-cast v0, La/j2m0;

    .line 783
    .line 784
    iget-object v2, v0, La/j2m0;->a:La/iab;

    .line 785
    .line 786
    if-eqz v2, :cond_12

    .line 787
    .line 788
    iget-object v2, v2, La/iab;->c:Landroid/view/View;

    .line 789
    .line 790
    check-cast v2, Lorg/xplatform/statistic/stage/impl/stagetable/presentation/common/NonScrollableRecyclerView;

    .line 791
    .line 792
    invoke-virtual {v2, v6, v1}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 793
    .line 794
    .line 795
    iget-object v1, v0, La/j2m0;->f:Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 796
    .line 797
    if-eqz v1, :cond_11

    .line 798
    .line 799
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->f1()I

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    goto :goto_4

    .line 804
    :cond_11
    const/4 v1, -0x1

    .line 805
    :goto_4
    invoke-virtual {v0, v1, v6}, La/j2m0;->g(IZ)V

    .line 806
    .line 807
    .line 808
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 809
    .line 810
    return-object v0

    .line 811
    :cond_12
    const-string v0, "binding"

    .line 812
    .line 813
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 814
    .line 815
    .line 816
    throw v11

    .line 817
    :pswitch_f
    move-object/from16 v1, p1

    .line 818
    .line 819
    check-cast v1, La/wzl0;

    .line 820
    .line 821
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 825
    .line 826
    check-cast v0, La/k3t0;

    .line 827
    .line 828
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 829
    .line 830
    .line 831
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 832
    .line 833
    return-object v0

    .line 834
    :pswitch_10
    move-object/from16 v1, p1

    .line 835
    .line 836
    check-cast v1, La/wzl0;

    .line 837
    .line 838
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 839
    .line 840
    .line 841
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 842
    .line 843
    check-cast v0, La/k3t0;

    .line 844
    .line 845
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 846
    .line 847
    .line 848
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 849
    .line 850
    return-object v0

    .line 851
    :pswitch_11
    move-object/from16 v1, p1

    .line 852
    .line 853
    check-cast v1, La/e2m0;

    .line 854
    .line 855
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 856
    .line 857
    .line 858
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 859
    .line 860
    check-cast v0, La/k3t0;

    .line 861
    .line 862
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 866
    .line 867
    return-object v0

    .line 868
    :pswitch_12
    move-object/from16 v1, p1

    .line 869
    .line 870
    check-cast v1, Ljava/lang/Throwable;

    .line 871
    .line 872
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 873
    .line 874
    .line 875
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 876
    .line 877
    check-cast v0, La/zxl0;

    .line 878
    .line 879
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 880
    .line 881
    .line 882
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 883
    .line 884
    .line 885
    instance-of v1, v1, La/ff5;

    .line 886
    .line 887
    if-eqz v1, :cond_13

    .line 888
    .line 889
    new-instance v1, La/gcl0;

    .line 890
    .line 891
    const/16 v2, 0x18

    .line 892
    .line 893
    invoke-direct {v1, v2}, La/gcl0;-><init>(B)V

    .line 894
    .line 895
    .line 896
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 897
    .line 898
    .line 899
    goto :goto_5

    .line 900
    :cond_13
    new-instance v1, La/gcl0;

    .line 901
    .line 902
    const/16 v2, 0x19

    .line 903
    .line 904
    invoke-direct {v1, v2}, La/gcl0;-><init>(B)V

    .line 905
    .line 906
    .line 907
    invoke-virtual {v0, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 908
    .line 909
    .line 910
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 911
    .line 912
    return-object v0

    .line 913
    :pswitch_13
    move-object/from16 v1, p1

    .line 914
    .line 915
    check-cast v1, La/hvl0;

    .line 916
    .line 917
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 918
    .line 919
    .line 920
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 921
    .line 922
    check-cast v0, La/k3t0;

    .line 923
    .line 924
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 925
    .line 926
    .line 927
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 928
    .line 929
    return-object v0

    .line 930
    :pswitch_14
    move-object/from16 v1, p1

    .line 931
    .line 932
    check-cast v1, Ljava/lang/Throwable;

    .line 933
    .line 934
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 935
    .line 936
    .line 937
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 938
    .line 939
    check-cast v0, La/vsl0;

    .line 940
    .line 941
    iget-object v2, v0, La/vsl0;->r:La/duj;

    .line 942
    .line 943
    new-instance v3, La/edk0;

    .line 944
    .line 945
    invoke-direct {v3, v0, v10}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 946
    .line 947
    .line 948
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 949
    .line 950
    .line 951
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 952
    .line 953
    return-object v0

    .line 954
    :pswitch_15
    move-object/from16 v1, p1

    .line 955
    .line 956
    check-cast v1, Ljava/lang/Throwable;

    .line 957
    .line 958
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 962
    .line 963
    check-cast v0, La/vsl0;

    .line 964
    .line 965
    iget-object v2, v0, La/vsl0;->r:La/duj;

    .line 966
    .line 967
    new-instance v3, La/edk0;

    .line 968
    .line 969
    invoke-direct {v3, v0, v10}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 970
    .line 971
    .line 972
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 973
    .line 974
    .line 975
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 976
    .line 977
    return-object v0

    .line 978
    :pswitch_16
    move-object/from16 v1, p1

    .line 979
    .line 980
    check-cast v1, Ljava/lang/Throwable;

    .line 981
    .line 982
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 983
    .line 984
    .line 985
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 986
    .line 987
    check-cast v0, La/vsl0;

    .line 988
    .line 989
    iget-object v2, v0, La/vsl0;->r:La/duj;

    .line 990
    .line 991
    new-instance v3, La/edk0;

    .line 992
    .line 993
    invoke-direct {v3, v0, v10}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 994
    .line 995
    .line 996
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 997
    .line 998
    .line 999
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1000
    .line 1001
    return-object v0

    .line 1002
    :pswitch_17
    move-object/from16 v1, p1

    .line 1003
    .line 1004
    check-cast v1, Ljava/lang/Throwable;

    .line 1005
    .line 1006
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1010
    .line 1011
    check-cast v0, La/vsl0;

    .line 1012
    .line 1013
    iget-object v2, v0, La/vsl0;->r:La/duj;

    .line 1014
    .line 1015
    new-instance v3, La/edk0;

    .line 1016
    .line 1017
    invoke-direct {v3, v0, v10}, La/edk0;-><init>(Ljava/lang/Object;B)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v2, v1, v3}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1021
    .line 1022
    .line 1023
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1024
    .line 1025
    return-object v0

    .line 1026
    :pswitch_18
    move-object/from16 v1, p1

    .line 1027
    .line 1028
    check-cast v1, La/rrl0;

    .line 1029
    .line 1030
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1031
    .line 1032
    .line 1033
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1034
    .line 1035
    check-cast v0, La/k3t0;

    .line 1036
    .line 1037
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1038
    .line 1039
    .line 1040
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1041
    .line 1042
    return-object v0

    .line 1043
    :pswitch_19
    move-object/from16 v1, p1

    .line 1044
    .line 1045
    check-cast v1, La/ksl0;

    .line 1046
    .line 1047
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1048
    .line 1049
    .line 1050
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1051
    .line 1052
    move-object v14, v0

    .line 1053
    check-cast v14, La/url0;

    .line 1054
    .line 1055
    sget-object v0, La/url0;->R1:La/cge0;

    .line 1056
    .line 1057
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1058
    .line 1059
    .line 1060
    instance-of v0, v1, La/hsl0;

    .line 1061
    .line 1062
    const v3, 0x7f1303fb

    .line 1063
    .line 1064
    .line 1065
    if-eqz v0, :cond_15

    .line 1066
    .line 1067
    iget-object v0, v14, La/url0;->P1:La/ii;

    .line 1068
    .line 1069
    if-eqz v0, :cond_14

    .line 1070
    .line 1071
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1072
    .line 1073
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1074
    .line 1075
    .line 1076
    move-result-object v16

    .line 1077
    const v1, 0x7f131235

    .line 1078
    .line 1079
    .line 1080
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v17

    .line 1084
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v18

    .line 1088
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1089
    .line 1090
    .line 1091
    sget-object v24, La/n12;->a:La/n12;

    .line 1092
    .line 1093
    const/16 v25, 0x0

    .line 1094
    .line 1095
    const/16 v26, 0x5f8

    .line 1096
    .line 1097
    const/16 v19, 0x0

    .line 1098
    .line 1099
    const/16 v20, 0x0

    .line 1100
    .line 1101
    const/16 v21, 0x0

    .line 1102
    .line 1103
    const/16 v22, 0x0

    .line 1104
    .line 1105
    const/16 v23, 0x0

    .line 1106
    .line 1107
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1108
    .line 1109
    .line 1110
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1111
    .line 1112
    .line 1113
    move-result-object v1

    .line 1114
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1118
    .line 1119
    .line 1120
    goto/16 :goto_6

    .line 1121
    .line 1122
    :cond_14
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1123
    .line 1124
    .line 1125
    throw v11

    .line 1126
    :cond_15
    instance-of v0, v1, La/fsl0;

    .line 1127
    .line 1128
    if-eqz v0, :cond_17

    .line 1129
    .line 1130
    iget-object v0, v14, La/url0;->P1:La/ii;

    .line 1131
    .line 1132
    if-eqz v0, :cond_16

    .line 1133
    .line 1134
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1135
    .line 1136
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1137
    .line 1138
    .line 1139
    move-result-object v16

    .line 1140
    const v1, 0x7f13014d

    .line 1141
    .line 1142
    .line 1143
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1144
    .line 1145
    .line 1146
    move-result-object v17

    .line 1147
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1148
    .line 1149
    .line 1150
    move-result-object v18

    .line 1151
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1152
    .line 1153
    .line 1154
    invoke-virtual {v14, v8}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1155
    .line 1156
    .line 1157
    move-result-object v19

    .line 1158
    sget-object v24, La/n12;->a:La/n12;

    .line 1159
    .line 1160
    const/16 v25, 0x0

    .line 1161
    .line 1162
    const/16 v26, 0x5d0

    .line 1163
    .line 1164
    const/16 v20, 0x0

    .line 1165
    .line 1166
    const-string v21, "REQUEST_CHANGES_DIALOG_KEY"

    .line 1167
    .line 1168
    const/16 v22, 0x0

    .line 1169
    .line 1170
    const/16 v23, 0x0

    .line 1171
    .line 1172
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1173
    .line 1174
    .line 1175
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v1

    .line 1179
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1180
    .line 1181
    .line 1182
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1183
    .line 1184
    .line 1185
    goto/16 :goto_6

    .line 1186
    .line 1187
    :cond_16
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1188
    .line 1189
    .line 1190
    throw v11

    .line 1191
    :cond_17
    instance-of v0, v1, La/gsl0;

    .line 1192
    .line 1193
    const v4, 0x7f13032f

    .line 1194
    .line 1195
    .line 1196
    if-eqz v0, :cond_19

    .line 1197
    .line 1198
    iget-object v0, v14, La/url0;->P1:La/ii;

    .line 1199
    .line 1200
    if-eqz v0, :cond_18

    .line 1201
    .line 1202
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1203
    .line 1204
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1205
    .line 1206
    .line 1207
    move-result-object v16

    .line 1208
    const v1, 0x7f130473

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v17

    .line 1215
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1216
    .line 1217
    .line 1218
    move-result-object v18

    .line 1219
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1220
    .line 1221
    .line 1222
    invoke-virtual {v14, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v19

    .line 1226
    sget-object v24, La/n12;->a:La/n12;

    .line 1227
    .line 1228
    const/16 v25, 0x0

    .line 1229
    .line 1230
    const/16 v26, 0x5d0

    .line 1231
    .line 1232
    const/16 v20, 0x0

    .line 1233
    .line 1234
    const-string v21, "REQUEST_CLEAR_SELECTED_SPORTS_KEY"

    .line 1235
    .line 1236
    const/16 v22, 0x0

    .line 1237
    .line 1238
    const/16 v23, 0x0

    .line 1239
    .line 1240
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1241
    .line 1242
    .line 1243
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1244
    .line 1245
    .line 1246
    move-result-object v1

    .line 1247
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1248
    .line 1249
    .line 1250
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1251
    .line 1252
    .line 1253
    goto/16 :goto_6

    .line 1254
    .line 1255
    :cond_18
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1256
    .line 1257
    .line 1258
    throw v11

    .line 1259
    :cond_19
    instance-of v0, v1, La/isl0;

    .line 1260
    .line 1261
    if-eqz v0, :cond_1b

    .line 1262
    .line 1263
    iget-object v0, v14, La/url0;->P1:La/ii;

    .line 1264
    .line 1265
    if-eqz v0, :cond_1a

    .line 1266
    .line 1267
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1268
    .line 1269
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v16

    .line 1273
    const v1, 0x7f131169

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1277
    .line 1278
    .line 1279
    move-result-object v17

    .line 1280
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1281
    .line 1282
    .line 1283
    move-result-object v18

    .line 1284
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1285
    .line 1286
    .line 1287
    invoke-virtual {v14, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v19

    .line 1291
    sget-object v24, La/n12;->a:La/n12;

    .line 1292
    .line 1293
    const/16 v25, 0x0

    .line 1294
    .line 1295
    const/16 v26, 0x5d0

    .line 1296
    .line 1297
    const/16 v20, 0x0

    .line 1298
    .line 1299
    const-string v21, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY"

    .line 1300
    .line 1301
    const/16 v22, 0x0

    .line 1302
    .line 1303
    const/16 v23, 0x0

    .line 1304
    .line 1305
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1306
    .line 1307
    .line 1308
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v1

    .line 1312
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1313
    .line 1314
    .line 1315
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1316
    .line 1317
    .line 1318
    goto :goto_6

    .line 1319
    :cond_1a
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1320
    .line 1321
    .line 1322
    throw v11

    .line 1323
    :cond_1b
    instance-of v0, v1, La/esl0;

    .line 1324
    .line 1325
    if-eqz v0, :cond_1c

    .line 1326
    .line 1327
    invoke-static {v14}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1328
    .line 1329
    .line 1330
    goto :goto_6

    .line 1331
    :cond_1c
    instance-of v0, v1, La/dsl0;

    .line 1332
    .line 1333
    if-eqz v0, :cond_1d

    .line 1334
    .line 1335
    invoke-static {v14}, La/j120;->Y(Landroidx/fragment/app/Fragment;)V

    .line 1336
    .line 1337
    .line 1338
    goto :goto_6

    .line 1339
    :cond_1d
    instance-of v0, v1, La/jsl0;

    .line 1340
    .line 1341
    if-eqz v0, :cond_1f

    .line 1342
    .line 1343
    iget-object v12, v14, La/url0;->O1:La/wdk0;

    .line 1344
    .line 1345
    if-eqz v12, :cond_1e

    .line 1346
    .line 1347
    new-instance v2, La/xdk0;

    .line 1348
    .line 1349
    sget-object v3, La/rek0;->b:La/rek0;

    .line 1350
    .line 1351
    check-cast v1, La/jsl0;

    .line 1352
    .line 1353
    iget-object v4, v1, La/jsl0;->a:Ljava/lang/String;

    .line 1354
    .line 1355
    const/4 v8, 0x0

    .line 1356
    const/16 v9, 0x7c

    .line 1357
    .line 1358
    const/4 v5, 0x0

    .line 1359
    const/4 v6, 0x0

    .line 1360
    const/4 v7, 0x0

    .line 1361
    invoke-direct/range {v2 .. v9}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1362
    .line 1363
    .line 1364
    const/16 v18, 0x0

    .line 1365
    .line 1366
    const/16 v19, 0x3ec

    .line 1367
    .line 1368
    const/4 v15, 0x0

    .line 1369
    const/16 v16, 0x0

    .line 1370
    .line 1371
    const/16 v17, 0x1

    .line 1372
    .line 1373
    move-object v13, v2

    .line 1374
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1375
    .line 1376
    .line 1377
    :goto_6
    invoke-virtual {v14}, La/url0;->G0()La/k3t0;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v0

    .line 1381
    sget-object v1, La/arl0;->a:La/arl0;

    .line 1382
    .line 1383
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1384
    .line 1385
    .line 1386
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1387
    .line 1388
    goto :goto_7

    .line 1389
    :cond_1e
    const-string v0, "snackbarManager"

    .line 1390
    .line 1391
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1392
    .line 1393
    .line 1394
    throw v11

    .line 1395
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 1396
    .line 1397
    .line 1398
    :goto_7
    return-object v11

    .line 1399
    :pswitch_1a
    move-object/from16 v1, p1

    .line 1400
    .line 1401
    check-cast v1, La/vol0;

    .line 1402
    .line 1403
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1404
    .line 1405
    .line 1406
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1407
    .line 1408
    check-cast v0, La/k3t0;

    .line 1409
    .line 1410
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1411
    .line 1412
    .line 1413
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1414
    .line 1415
    return-object v0

    .line 1416
    :pswitch_1b
    move-object/from16 v1, p1

    .line 1417
    .line 1418
    check-cast v1, Ljava/lang/Throwable;

    .line 1419
    .line 1420
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1421
    .line 1422
    .line 1423
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1424
    .line 1425
    check-cast v0, La/ndl0;

    .line 1426
    .line 1427
    iget-object v0, v0, La/ndl0;->d:La/duj;

    .line 1428
    .line 1429
    new-instance v2, La/gcl0;

    .line 1430
    .line 1431
    const/4 v3, 0x3

    .line 1432
    invoke-direct {v2, v3}, La/gcl0;-><init>(B)V

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v0, v1, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1436
    .line 1437
    .line 1438
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1439
    .line 1440
    return-object v0

    .line 1441
    :pswitch_1c
    move-object/from16 v1, p1

    .line 1442
    .line 1443
    check-cast v1, Ljava/lang/Throwable;

    .line 1444
    .line 1445
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1446
    .line 1447
    .line 1448
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1449
    .line 1450
    check-cast v0, La/ncl0;

    .line 1451
    .line 1452
    iget-object v2, v0, La/ncl0;->u:La/ivn;

    .line 1453
    .line 1454
    new-instance v3, La/hbl0;

    .line 1455
    .line 1456
    invoke-direct {v3, v0, v6}, La/hbl0;-><init>(La/ncl0;B)V

    .line 1457
    .line 1458
    .line 1459
    invoke-virtual {v2, v1, v3}, La/ivn;->f(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function1;)V

    .line 1460
    .line 1461
    .line 1462
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1463
    .line 1464
    return-object v0

    .line 1465
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
