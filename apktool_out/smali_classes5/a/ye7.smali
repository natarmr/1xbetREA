.class public final synthetic La/ye7;
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
    iput-byte p7, p0, La/ye7;->a:B

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
    iget-byte v1, v0, La/ye7;->a:B

    .line 4
    .line 5
    const/4 v2, 0x3

    .line 6
    const/4 v3, 0x7

    .line 7
    const/4 v4, 0x0

    .line 8
    const-string v5, "changeBalanceDialogProvider"

    .line 9
    .line 10
    const v6, 0x7f130e5e

    .line 11
    .line 12
    .line 13
    const v7, 0x7f130e5d

    .line 14
    .line 15
    .line 16
    const-string v8, "actionDialogManager"

    .line 17
    .line 18
    const-string v9, "snackbarManager"

    .line 19
    .line 20
    const v10, 0x7f13032f

    .line 21
    .line 22
    .line 23
    const/4 v11, 0x0

    .line 24
    packed-switch v1, :pswitch_data_0

    .line 25
    .line 26
    .line 27
    move-object/from16 v1, p1

    .line 28
    .line 29
    check-cast v1, La/jl8;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 35
    .line 36
    move-object v14, v0

    .line 37
    check-cast v14, La/oi8;

    .line 38
    .line 39
    sget-object v0, La/oi8;->P1:La/cl5;

    .line 40
    .line 41
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v0, La/fl8;->a:La/fl8;

    .line 45
    .line 46
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-eqz v0, :cond_1

    .line 51
    .line 52
    iget-object v0, v14, La/oi8;->L1:La/ii;

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    const v1, 0x7f131115

    .line 57
    .line 58
    .line 59
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v16

    .line 63
    const v1, 0x7f131116

    .line 64
    .line 65
    .line 66
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v17

    .line 70
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v19

    .line 74
    invoke-virtual {v14, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v18

    .line 78
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    sget-object v24, La/n12;->a:La/n12;

    .line 82
    .line 83
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 84
    .line 85
    const/16 v25, 0x0

    .line 86
    .line 87
    const/16 v26, 0x5d0

    .line 88
    .line 89
    const/16 v20, 0x0

    .line 90
    .line 91
    const-string v21, "REQUEST_REFUSE_BONUS_DIALOG_KEY"

    .line 92
    .line 93
    const/16 v22, 0x0

    .line 94
    .line 95
    const/16 v23, 0x0

    .line 96
    .line 97
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 108
    .line 109
    .line 110
    goto/16 :goto_0

    .line 111
    .line 112
    :cond_0
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v11

    .line 116
    :cond_1
    instance-of v0, v1, La/gl8;

    .line 117
    .line 118
    if-eqz v0, :cond_3

    .line 119
    .line 120
    check-cast v1, La/gl8;

    .line 121
    .line 122
    iget-object v12, v14, La/oi8;->M1:La/wdk0;

    .line 123
    .line 124
    if-eqz v12, :cond_2

    .line 125
    .line 126
    new-instance v15, La/xdk0;

    .line 127
    .line 128
    sget-object v16, La/rek0;->b:La/rek0;

    .line 129
    .line 130
    iget-object v0, v1, La/gl8;->a:Ljava/lang/String;

    .line 131
    .line 132
    const/16 v21, 0x0

    .line 133
    .line 134
    const/16 v22, 0x7c

    .line 135
    .line 136
    const/16 v18, 0x0

    .line 137
    .line 138
    const/16 v19, 0x0

    .line 139
    .line 140
    const/16 v20, 0x0

    .line 141
    .line 142
    move-object/from16 v17, v0

    .line 143
    .line 144
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 145
    .line 146
    .line 147
    const/16 v19, 0x3fc

    .line 148
    .line 149
    move-object v13, v15

    .line 150
    const/4 v15, 0x0

    .line 151
    const/16 v16, 0x0

    .line 152
    .line 153
    const/16 v17, 0x0

    .line 154
    .line 155
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 156
    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_2
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    throw v11

    .line 164
    :cond_3
    sget-object v0, La/cl8;->a:La/cl8;

    .line 165
    .line 166
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    move-result v0

    .line 170
    if-eqz v0, :cond_5

    .line 171
    .line 172
    iget-object v0, v14, La/oi8;->L1:La/ii;

    .line 173
    .line 174
    if-eqz v0, :cond_4

    .line 175
    .line 176
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 177
    .line 178
    const v1, 0x7f130468

    .line 179
    .line 180
    .line 181
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v17

    .line 185
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object v18

    .line 189
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    sget-object v24, La/n12;->a:La/n12;

    .line 193
    .line 194
    const/16 v25, 0x0

    .line 195
    .line 196
    const/16 v26, 0x5f9

    .line 197
    .line 198
    const/16 v16, 0x0

    .line 199
    .line 200
    const/16 v19, 0x0

    .line 201
    .line 202
    const/16 v20, 0x0

    .line 203
    .line 204
    const/16 v21, 0x0

    .line 205
    .line 206
    const/16 v22, 0x0

    .line 207
    .line 208
    const/16 v23, 0x0

    .line 209
    .line 210
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 221
    .line 222
    .line 223
    goto :goto_0

    .line 224
    :cond_4
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    throw v11

    .line 228
    :cond_5
    sget-object v0, La/dl8;->a:La/dl8;

    .line 229
    .line 230
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 231
    .line 232
    .line 233
    move-result v0

    .line 234
    if-eqz v0, :cond_7

    .line 235
    .line 236
    iget-object v0, v14, La/oi8;->L1:La/ii;

    .line 237
    .line 238
    if-eqz v0, :cond_6

    .line 239
    .line 240
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 241
    .line 242
    const v1, 0x7f130469

    .line 243
    .line 244
    .line 245
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v17

    .line 249
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v18

    .line 253
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 254
    .line 255
    .line 256
    sget-object v24, La/n12;->a:La/n12;

    .line 257
    .line 258
    const/16 v25, 0x0

    .line 259
    .line 260
    const/16 v26, 0x5f9

    .line 261
    .line 262
    const/16 v16, 0x0

    .line 263
    .line 264
    const/16 v19, 0x0

    .line 265
    .line 266
    const/16 v20, 0x0

    .line 267
    .line 268
    const/16 v21, 0x0

    .line 269
    .line 270
    const/16 v22, 0x0

    .line 271
    .line 272
    const/16 v23, 0x0

    .line 273
    .line 274
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 278
    .line 279
    .line 280
    move-result-object v1

    .line 281
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 285
    .line 286
    .line 287
    :goto_0
    invoke-virtual {v14}, La/oi8;->G0()La/k3t0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    sget-object v1, La/lk8;->a:La/lk8;

    .line 292
    .line 293
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 297
    .line 298
    goto :goto_1

    .line 299
    :cond_6
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 300
    .line 301
    .line 302
    throw v11

    .line 303
    :cond_7
    invoke-static {}, La/t9f;->b()V

    .line 304
    .line 305
    .line 306
    :goto_1
    return-object v11

    .line 307
    :pswitch_0
    move-object/from16 v1, p1

    .line 308
    .line 309
    check-cast v1, La/il8;

    .line 310
    .line 311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 312
    .line 313
    .line 314
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 315
    .line 316
    move-object v14, v0

    .line 317
    check-cast v14, La/ni8;

    .line 318
    .line 319
    sget-object v0, La/ni8;->U1:La/yk5;

    .line 320
    .line 321
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 322
    .line 323
    .line 324
    instance-of v0, v1, La/zk8;

    .line 325
    .line 326
    const-string v2, "BonusesFeature.BONUS_RESULT_DATA_KEY"

    .line 327
    .line 328
    const-string v3, "BonusesFeature.BONUS_RESULT_KEY"

    .line 329
    .line 330
    if-eqz v0, :cond_8

    .line 331
    .line 332
    check-cast v1, La/zk8;

    .line 333
    .line 334
    iget-object v0, v1, La/zk8;->a:La/csr;

    .line 335
    .line 336
    new-instance v1, Landroid/os/Bundle;

    .line 337
    .line 338
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 342
    .line 343
    .line 344
    invoke-static {v1, v14, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto/16 :goto_2

    .line 348
    .line 349
    :cond_8
    instance-of v0, v1, La/al8;

    .line 350
    .line 351
    if-eqz v0, :cond_9

    .line 352
    .line 353
    check-cast v1, La/al8;

    .line 354
    .line 355
    new-instance v0, Landroid/os/Bundle;

    .line 356
    .line 357
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 358
    .line 359
    .line 360
    const-string v4, "BonusesFeature.BONUS_RESULT_GAME_ID_KEY"

    .line 361
    .line 362
    iget-wide v5, v1, La/al8;->a:J

    .line 363
    .line 364
    invoke-virtual {v0, v4, v5, v6}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 365
    .line 366
    .line 367
    iget-object v1, v1, La/al8;->b:La/csr;

    .line 368
    .line 369
    invoke-virtual {v0, v2, v1}, Landroid/os/Bundle;->putSerializable(Ljava/lang/String;Ljava/io/Serializable;)V

    .line 370
    .line 371
    .line 372
    invoke-static {v0, v14, v3}, La/vcc;->f0(Landroid/os/Bundle;Landroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 373
    .line 374
    .line 375
    goto/16 :goto_2

    .line 376
    .line 377
    :cond_9
    sget-object v0, La/bl8;->a:La/bl8;

    .line 378
    .line 379
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 380
    .line 381
    .line 382
    move-result v0

    .line 383
    if-eqz v0, :cond_b

    .line 384
    .line 385
    iget-object v15, v14, La/ni8;->L1:La/ynb;

    .line 386
    .line 387
    if-eqz v15, :cond_a

    .line 388
    .line 389
    sget-object v16, La/bm5;->d:La/bm5;

    .line 390
    .line 391
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 392
    .line 393
    .line 394
    move-result-object v18

    .line 395
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 396
    .line 397
    .line 398
    const-string v20, "SELECT_BALANCE_REQUEST_KEY"

    .line 399
    .line 400
    const/16 v21, 0x1ee

    .line 401
    .line 402
    const/16 v17, 0x0

    .line 403
    .line 404
    const/16 v19, 0x0

    .line 405
    .line 406
    invoke-static/range {v15 .. v21}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 407
    .line 408
    .line 409
    goto :goto_2

    .line 410
    :cond_a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 411
    .line 412
    .line 413
    throw v11

    .line 414
    :cond_b
    sget-object v0, La/el8;->a:La/el8;

    .line 415
    .line 416
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 417
    .line 418
    .line 419
    move-result v0

    .line 420
    if-eqz v0, :cond_d

    .line 421
    .line 422
    iget-object v12, v14, La/ni8;->M1:La/wdk0;

    .line 423
    .line 424
    if-eqz v12, :cond_c

    .line 425
    .line 426
    new-instance v0, La/xdk0;

    .line 427
    .line 428
    sget-object v1, La/rek0;->b:La/rek0;

    .line 429
    .line 430
    const v2, 0x7f13096f

    .line 431
    .line 432
    .line 433
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 434
    .line 435
    .line 436
    move-result-object v2

    .line 437
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 438
    .line 439
    .line 440
    const/4 v6, 0x0

    .line 441
    const/16 v7, 0x7c

    .line 442
    .line 443
    const/4 v3, 0x0

    .line 444
    const/4 v4, 0x0

    .line 445
    const/4 v5, 0x0

    .line 446
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 447
    .line 448
    .line 449
    const/16 v18, 0x0

    .line 450
    .line 451
    const/16 v19, 0x3fc

    .line 452
    .line 453
    const/4 v15, 0x0

    .line 454
    const/16 v16, 0x0

    .line 455
    .line 456
    const/16 v17, 0x0

    .line 457
    .line 458
    move-object v13, v0

    .line 459
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 460
    .line 461
    .line 462
    goto :goto_2

    .line 463
    :cond_c
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 464
    .line 465
    .line 466
    throw v11

    .line 467
    :cond_d
    sget-object v0, La/hl8;->a:La/hl8;

    .line 468
    .line 469
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 470
    .line 471
    .line 472
    move-result v0

    .line 473
    if-eqz v0, :cond_f

    .line 474
    .line 475
    iget-object v0, v14, La/ni8;->N1:La/uxs0;

    .line 476
    .line 477
    if-eqz v0, :cond_e

    .line 478
    .line 479
    new-instance v0, La/ffv0;

    .line 480
    .line 481
    invoke-direct {v0}, La/ffv0;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 485
    .line 486
    .line 487
    move-result-object v1

    .line 488
    const-string v2, "WILD_FREE_BET_SELECTOR_TAG"

    .line 489
    .line 490
    invoke-virtual {v0, v1, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 491
    .line 492
    .line 493
    :goto_2
    invoke-virtual {v14}, La/ni8;->G0()La/k3t0;

    .line 494
    .line 495
    .line 496
    move-result-object v0

    .line 497
    sget-object v1, La/kh8;->a:La/kh8;

    .line 498
    .line 499
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 500
    .line 501
    .line 502
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 503
    .line 504
    goto :goto_3

    .line 505
    :cond_e
    const-string v0, "wildFreeBetScreenFactory"

    .line 506
    .line 507
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 508
    .line 509
    .line 510
    throw v11

    .line 511
    :cond_f
    invoke-static {}, La/t9f;->b()V

    .line 512
    .line 513
    .line 514
    :goto_3
    return-object v11

    .line 515
    :pswitch_1
    move-object/from16 v1, p1

    .line 516
    .line 517
    check-cast v1, Ljava/lang/Throwable;

    .line 518
    .line 519
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 520
    .line 521
    .line 522
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 523
    .line 524
    check-cast v0, La/lf8;

    .line 525
    .line 526
    invoke-virtual {v0, v1}, La/lf8;->O(Ljava/lang/Throwable;)V

    .line 527
    .line 528
    .line 529
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 530
    .line 531
    return-object v0

    .line 532
    :pswitch_2
    move-object/from16 v1, p1

    .line 533
    .line 534
    check-cast v1, Ljava/lang/Throwable;

    .line 535
    .line 536
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 537
    .line 538
    .line 539
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 540
    .line 541
    check-cast v0, La/lf8;

    .line 542
    .line 543
    invoke-virtual {v0, v1}, La/lf8;->O(Ljava/lang/Throwable;)V

    .line 544
    .line 545
    .line 546
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 547
    .line 548
    return-object v0

    .line 549
    :pswitch_3
    move-object/from16 v1, p1

    .line 550
    .line 551
    check-cast v1, Ljava/lang/Throwable;

    .line 552
    .line 553
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 554
    .line 555
    .line 556
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 557
    .line 558
    check-cast v0, La/lf8;

    .line 559
    .line 560
    invoke-virtual {v0, v1}, La/lf8;->O(Ljava/lang/Throwable;)V

    .line 561
    .line 562
    .line 563
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 564
    .line 565
    return-object v0

    .line 566
    :pswitch_4
    move-object/from16 v1, p1

    .line 567
    .line 568
    check-cast v1, Ljava/lang/Throwable;

    .line 569
    .line 570
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 571
    .line 572
    .line 573
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v0, La/lf8;

    .line 576
    .line 577
    invoke-virtual {v0, v1}, La/lf8;->O(Ljava/lang/Throwable;)V

    .line 578
    .line 579
    .line 580
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 581
    .line 582
    return-object v0

    .line 583
    :pswitch_5
    move-object/from16 v1, p1

    .line 584
    .line 585
    check-cast v1, Ljava/lang/Throwable;

    .line 586
    .line 587
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 588
    .line 589
    .line 590
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 591
    .line 592
    check-cast v0, La/lf8;

    .line 593
    .line 594
    invoke-virtual {v0, v1}, La/lf8;->O(Ljava/lang/Throwable;)V

    .line 595
    .line 596
    .line 597
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 598
    .line 599
    return-object v0

    .line 600
    :pswitch_6
    move-object/from16 v1, p1

    .line 601
    .line 602
    check-cast v1, La/rc8;

    .line 603
    .line 604
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 605
    .line 606
    .line 607
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 608
    .line 609
    check-cast v0, La/k3t0;

    .line 610
    .line 611
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 612
    .line 613
    .line 614
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 615
    .line 616
    return-object v0

    .line 617
    :pswitch_7
    move-object/from16 v1, p1

    .line 618
    .line 619
    check-cast v1, La/gd8;

    .line 620
    .line 621
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 625
    .line 626
    move-object v14, v0

    .line 627
    check-cast v14, La/uc8;

    .line 628
    .line 629
    sget-object v0, La/uc8;->P1:La/yk5;

    .line 630
    .line 631
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 632
    .line 633
    .line 634
    instance-of v0, v1, La/dd8;

    .line 635
    .line 636
    if-eqz v0, :cond_11

    .line 637
    .line 638
    check-cast v1, La/dd8;

    .line 639
    .line 640
    iget-object v0, v14, La/uc8;->L1:La/ii;

    .line 641
    .line 642
    if-eqz v0, :cond_10

    .line 643
    .line 644
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 645
    .line 646
    const v2, 0x7f1303fb

    .line 647
    .line 648
    .line 649
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 650
    .line 651
    .line 652
    move-result-object v16

    .line 653
    iget-object v1, v1, La/dd8;->a:Ljava/lang/String;

    .line 654
    .line 655
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 656
    .line 657
    .line 658
    move-result-object v18

    .line 659
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 660
    .line 661
    .line 662
    invoke-virtual {v14, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 663
    .line 664
    .line 665
    move-result-object v19

    .line 666
    sget-object v24, La/n12;->a:La/n12;

    .line 667
    .line 668
    const/16 v25, 0x0

    .line 669
    .line 670
    const/16 v26, 0x5d0

    .line 671
    .line 672
    const/16 v20, 0x0

    .line 673
    .line 674
    const-string v21, "REQUEST_SELECTED_BONUS_KEY"

    .line 675
    .line 676
    const/16 v22, 0x0

    .line 677
    .line 678
    const/16 v23, 0x0

    .line 679
    .line 680
    move-object/from16 v17, v1

    .line 681
    .line 682
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 683
    .line 684
    .line 685
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 686
    .line 687
    .line 688
    move-result-object v1

    .line 689
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 690
    .line 691
    .line 692
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 693
    .line 694
    .line 695
    goto :goto_4

    .line 696
    :cond_10
    invoke-static {v8}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 697
    .line 698
    .line 699
    throw v11

    .line 700
    :cond_11
    instance-of v0, v1, La/fd8;

    .line 701
    .line 702
    if-eqz v0, :cond_13

    .line 703
    .line 704
    check-cast v1, La/fd8;

    .line 705
    .line 706
    iget-object v12, v14, La/uc8;->M1:La/wdk0;

    .line 707
    .line 708
    if-eqz v12, :cond_12

    .line 709
    .line 710
    new-instance v15, La/xdk0;

    .line 711
    .line 712
    sget-object v16, La/qek0;->a:La/qek0;

    .line 713
    .line 714
    iget-object v0, v1, La/fd8;->a:Ljava/lang/String;

    .line 715
    .line 716
    const/16 v21, 0x0

    .line 717
    .line 718
    const/16 v22, 0x7c

    .line 719
    .line 720
    const/16 v18, 0x0

    .line 721
    .line 722
    const/16 v19, 0x0

    .line 723
    .line 724
    const/16 v20, 0x0

    .line 725
    .line 726
    move-object/from16 v17, v0

    .line 727
    .line 728
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 729
    .line 730
    .line 731
    const/16 v19, 0x3fc

    .line 732
    .line 733
    move-object v13, v15

    .line 734
    const/4 v15, 0x0

    .line 735
    const/16 v16, 0x0

    .line 736
    .line 737
    const/16 v17, 0x0

    .line 738
    .line 739
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 740
    .line 741
    .line 742
    goto :goto_4

    .line 743
    :cond_12
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v11

    .line 747
    :cond_13
    instance-of v0, v1, La/ed8;

    .line 748
    .line 749
    if-eqz v0, :cond_15

    .line 750
    .line 751
    check-cast v1, La/ed8;

    .line 752
    .line 753
    iget-object v12, v14, La/uc8;->M1:La/wdk0;

    .line 754
    .line 755
    if-eqz v12, :cond_14

    .line 756
    .line 757
    new-instance v15, La/xdk0;

    .line 758
    .line 759
    sget-object v16, La/rek0;->b:La/rek0;

    .line 760
    .line 761
    iget-object v0, v1, La/ed8;->a:Ljava/lang/String;

    .line 762
    .line 763
    const/16 v21, 0x0

    .line 764
    .line 765
    const/16 v22, 0x7c

    .line 766
    .line 767
    const/16 v18, 0x0

    .line 768
    .line 769
    const/16 v19, 0x0

    .line 770
    .line 771
    const/16 v20, 0x0

    .line 772
    .line 773
    move-object/from16 v17, v0

    .line 774
    .line 775
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 776
    .line 777
    .line 778
    const/16 v19, 0x3fc

    .line 779
    .line 780
    move-object v13, v15

    .line 781
    const/4 v15, 0x0

    .line 782
    const/16 v16, 0x0

    .line 783
    .line 784
    const/16 v17, 0x0

    .line 785
    .line 786
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 787
    .line 788
    .line 789
    :goto_4
    invoke-virtual {v14}, La/uc8;->G0()La/k3t0;

    .line 790
    .line 791
    .line 792
    move-result-object v0

    .line 793
    sget-object v1, La/lc8;->a:La/lc8;

    .line 794
    .line 795
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 796
    .line 797
    .line 798
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 799
    .line 800
    goto :goto_5

    .line 801
    :cond_14
    invoke-static {v9}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 802
    .line 803
    .line 804
    throw v11

    .line 805
    :cond_15
    invoke-static {}, La/t9f;->b()V

    .line 806
    .line 807
    .line 808
    :goto_5
    return-object v11

    .line 809
    :pswitch_8
    move-object/from16 v1, p1

    .line 810
    .line 811
    check-cast v1, La/ub8;

    .line 812
    .line 813
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 817
    .line 818
    check-cast v0, La/k3t0;

    .line 819
    .line 820
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 821
    .line 822
    .line 823
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 824
    .line 825
    return-object v0

    .line 826
    :pswitch_9
    move-object/from16 v1, p1

    .line 827
    .line 828
    check-cast v1, Ljava/lang/Throwable;

    .line 829
    .line 830
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 831
    .line 832
    .line 833
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 834
    .line 835
    check-cast v0, La/d48;

    .line 836
    .line 837
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 838
    .line 839
    .line 840
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 841
    .line 842
    return-object v0

    .line 843
    :pswitch_a
    move-object/from16 v1, p1

    .line 844
    .line 845
    check-cast v1, Ljava/lang/Throwable;

    .line 846
    .line 847
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 848
    .line 849
    .line 850
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 851
    .line 852
    check-cast v0, La/d48;

    .line 853
    .line 854
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 855
    .line 856
    .line 857
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 858
    .line 859
    return-object v0

    .line 860
    :pswitch_b
    move-object/from16 v1, p1

    .line 861
    .line 862
    check-cast v1, Ljava/lang/Throwable;

    .line 863
    .line 864
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 865
    .line 866
    .line 867
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 868
    .line 869
    check-cast v0, La/d48;

    .line 870
    .line 871
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 872
    .line 873
    .line 874
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 875
    .line 876
    return-object v0

    .line 877
    :pswitch_c
    move-object/from16 v1, p1

    .line 878
    .line 879
    check-cast v1, Ljava/lang/Throwable;

    .line 880
    .line 881
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 885
    .line 886
    check-cast v0, La/d48;

    .line 887
    .line 888
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 889
    .line 890
    .line 891
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 892
    .line 893
    return-object v0

    .line 894
    :pswitch_d
    move-object/from16 v1, p1

    .line 895
    .line 896
    check-cast v1, Ljava/lang/Throwable;

    .line 897
    .line 898
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 899
    .line 900
    .line 901
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 902
    .line 903
    check-cast v0, La/d48;

    .line 904
    .line 905
    invoke-virtual {v0, v1}, La/d48;->z(Ljava/lang/Throwable;)V

    .line 906
    .line 907
    .line 908
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 909
    .line 910
    return-object v0

    .line 911
    :pswitch_e
    move-object/from16 v1, p1

    .line 912
    .line 913
    check-cast v1, Ljava/lang/String;

    .line 914
    .line 915
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 916
    .line 917
    .line 918
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 919
    .line 920
    check-cast v0, La/d48;

    .line 921
    .line 922
    invoke-virtual {v0, v1}, La/d48;->x(Ljava/lang/String;)V

    .line 923
    .line 924
    .line 925
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 926
    .line 927
    return-object v0

    .line 928
    :pswitch_f
    move-object/from16 v1, p1

    .line 929
    .line 930
    check-cast v1, La/ou7;

    .line 931
    .line 932
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 933
    .line 934
    .line 935
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 936
    .line 937
    check-cast v0, La/au7;

    .line 938
    .line 939
    sget-object v2, La/au7;->U1:La/yk5;

    .line 940
    .line 941
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 942
    .line 943
    .line 944
    sget-object v2, La/ou7;->a:La/ou7;

    .line 945
    .line 946
    invoke-virtual {v1, v2}, La/ou7;->equals(Ljava/lang/Object;)Z

    .line 947
    .line 948
    .line 949
    move-result v1

    .line 950
    if-eqz v1, :cond_17

    .line 951
    .line 952
    sget-object v1, La/dic;->n2:La/kj5;

    .line 953
    .line 954
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 955
    .line 956
    .line 957
    move-result-object v2

    .line 958
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 959
    .line 960
    .line 961
    new-instance v3, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;

    .line 962
    .line 963
    invoke-virtual {v0}, La/au7;->G0()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 964
    .line 965
    .line 966
    move-result-object v5

    .line 967
    iget-wide v5, v5, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;->a:J

    .line 968
    .line 969
    invoke-virtual {v0}, La/au7;->G0()Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;

    .line 970
    .line 971
    .line 972
    move-result-object v7

    .line 973
    iget-wide v7, v7, Lorg/xplatform/sportgame/bets_on_players/api/navigation/BetsOnPlayersScreenParams;->c:J

    .line 974
    .line 975
    invoke-direct {v3, v5, v6, v7, v8}, Lorg/xplatform/sportgame/bets_on_players/impl/presentation/model/ChooseSubGameParams;-><init>(JJ)V

    .line 976
    .line 977
    .line 978
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 979
    .line 980
    .line 981
    const-string v1, "ChooseSubGameBottomSheetFragment"

    .line 982
    .line 983
    invoke-virtual {v2, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 984
    .line 985
    .line 986
    move-result-object v5

    .line 987
    if-eqz v5, :cond_16

    .line 988
    .line 989
    goto :goto_6

    .line 990
    :cond_16
    new-instance v5, La/dic;

    .line 991
    .line 992
    invoke-direct {v5}, La/dic;-><init>()V

    .line 993
    .line 994
    .line 995
    sget-object v6, La/dic;->o2:[La/iiy;

    .line 996
    .line 997
    aget-object v4, v6, v4

    .line 998
    .line 999
    iget-object v6, v5, La/dic;->l2:La/khf0;

    .line 1000
    .line 1001
    invoke-virtual {v6, v5, v4, v3}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1002
    .line 1003
    .line 1004
    invoke-virtual {v5, v2, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1005
    .line 1006
    .line 1007
    :goto_6
    invoke-virtual {v0}, La/au7;->H0()La/k3t0;

    .line 1008
    .line 1009
    .line 1010
    move-result-object v0

    .line 1011
    sget-object v1, La/ht7;->a:La/ht7;

    .line 1012
    .line 1013
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1014
    .line 1015
    .line 1016
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1017
    .line 1018
    goto :goto_7

    .line 1019
    :cond_17
    invoke-static {}, La/t9f;->b()V

    .line 1020
    .line 1021
    .line 1022
    :goto_7
    return-object v11

    .line 1023
    :pswitch_10
    move-object/from16 v1, p1

    .line 1024
    .line 1025
    check-cast v1, Ljava/lang/Throwable;

    .line 1026
    .line 1027
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1028
    .line 1029
    .line 1030
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1031
    .line 1032
    check-cast v0, La/hq7;

    .line 1033
    .line 1034
    iget-object v2, v0, La/hq7;->q:La/duj;

    .line 1035
    .line 1036
    new-instance v4, La/m87;

    .line 1037
    .line 1038
    invoke-direct {v4, v0, v3}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 1039
    .line 1040
    .line 1041
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1042
    .line 1043
    .line 1044
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1045
    .line 1046
    return-object v0

    .line 1047
    :pswitch_11
    move-object/from16 v1, p1

    .line 1048
    .line 1049
    check-cast v1, Ljava/lang/Throwable;

    .line 1050
    .line 1051
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1055
    .line 1056
    check-cast v0, La/hq7;

    .line 1057
    .line 1058
    iget-object v2, v0, La/hq7;->q:La/duj;

    .line 1059
    .line 1060
    new-instance v4, La/m87;

    .line 1061
    .line 1062
    invoke-direct {v4, v0, v3}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 1063
    .line 1064
    .line 1065
    invoke-virtual {v2, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 1066
    .line 1067
    .line 1068
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1069
    .line 1070
    return-object v0

    .line 1071
    :pswitch_12
    move-object/from16 v1, p1

    .line 1072
    .line 1073
    check-cast v1, La/jp7;

    .line 1074
    .line 1075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1079
    .line 1080
    check-cast v0, La/k3t0;

    .line 1081
    .line 1082
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1083
    .line 1084
    .line 1085
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1086
    .line 1087
    return-object v0

    .line 1088
    :pswitch_13
    move-object/from16 v1, p1

    .line 1089
    .line 1090
    check-cast v1, La/yp7;

    .line 1091
    .line 1092
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1093
    .line 1094
    .line 1095
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1096
    .line 1097
    check-cast v0, La/mp7;

    .line 1098
    .line 1099
    sget-object v2, La/mp7;->S1:La/bj5;

    .line 1100
    .line 1101
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1102
    .line 1103
    .line 1104
    instance-of v1, v1, La/yp7;

    .line 1105
    .line 1106
    if-eqz v1, :cond_19

    .line 1107
    .line 1108
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->D()Landroid/content/Context;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v1

    .line 1112
    if-eqz v1, :cond_18

    .line 1113
    .line 1114
    const-string v2, "open/sports?type=line"

    .line 1115
    .line 1116
    invoke-static {v1, v2}, La/j120;->c0(Landroid/content/Context;Ljava/lang/String;)V

    .line 1117
    .line 1118
    .line 1119
    :cond_18
    invoke-virtual {v0}, La/mp7;->G0()La/k3t0;

    .line 1120
    .line 1121
    .line 1122
    move-result-object v0

    .line 1123
    sget-object v1, La/zo7;->a:La/zo7;

    .line 1124
    .line 1125
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1126
    .line 1127
    .line 1128
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1129
    .line 1130
    goto :goto_8

    .line 1131
    :cond_19
    invoke-static {}, La/t9f;->b()V

    .line 1132
    .line 1133
    .line 1134
    :goto_8
    return-object v11

    .line 1135
    :pswitch_14
    move-object/from16 v1, p1

    .line 1136
    .line 1137
    check-cast v1, La/mj7;

    .line 1138
    .line 1139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1140
    .line 1141
    .line 1142
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1143
    .line 1144
    check-cast v0, La/k3t0;

    .line 1145
    .line 1146
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1147
    .line 1148
    .line 1149
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1150
    .line 1151
    return-object v0

    .line 1152
    :pswitch_15
    move-object/from16 v1, p1

    .line 1153
    .line 1154
    check-cast v1, La/mj7;

    .line 1155
    .line 1156
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1157
    .line 1158
    .line 1159
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1160
    .line 1161
    check-cast v0, La/k3t0;

    .line 1162
    .line 1163
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1164
    .line 1165
    .line 1166
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1167
    .line 1168
    return-object v0

    .line 1169
    :pswitch_16
    move-object/from16 v1, p1

    .line 1170
    .line 1171
    check-cast v1, La/mj7;

    .line 1172
    .line 1173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1174
    .line 1175
    .line 1176
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1177
    .line 1178
    check-cast v0, La/k3t0;

    .line 1179
    .line 1180
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1181
    .line 1182
    .line 1183
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1184
    .line 1185
    return-object v0

    .line 1186
    :pswitch_17
    move-object/from16 v1, p1

    .line 1187
    .line 1188
    check-cast v1, La/mj7;

    .line 1189
    .line 1190
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1191
    .line 1192
    .line 1193
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1194
    .line 1195
    check-cast v0, La/k3t0;

    .line 1196
    .line 1197
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1198
    .line 1199
    .line 1200
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1201
    .line 1202
    return-object v0

    .line 1203
    :pswitch_18
    move-object/from16 v1, p1

    .line 1204
    .line 1205
    check-cast v1, La/mj7;

    .line 1206
    .line 1207
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1208
    .line 1209
    .line 1210
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1211
    .line 1212
    check-cast v0, La/k3t0;

    .line 1213
    .line 1214
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 1215
    .line 1216
    .line 1217
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1218
    .line 1219
    return-object v0

    .line 1220
    :pswitch_19
    move-object/from16 v1, p1

    .line 1221
    .line 1222
    check-cast v1, La/kl7;

    .line 1223
    .line 1224
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1225
    .line 1226
    .line 1227
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 1228
    .line 1229
    move-object v14, v0

    .line 1230
    check-cast v14, La/gk7;

    .line 1231
    .line 1232
    sget-object v0, La/gk7;->U1:La/kl5;

    .line 1233
    .line 1234
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1235
    .line 1236
    .line 1237
    sget-object v16, La/qek0;->a:La/qek0;

    .line 1238
    .line 1239
    sget-object v18, La/rek0;->b:La/rek0;

    .line 1240
    .line 1241
    sget-object v0, La/zk7;->a:La/zk7;

    .line 1242
    .line 1243
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1244
    .line 1245
    .line 1246
    move-result v0

    .line 1247
    if-eqz v0, :cond_1b

    .line 1248
    .line 1249
    iget-object v0, v14, La/gk7;->N1:La/ynb;

    .line 1250
    .line 1251
    if-eqz v0, :cond_1a

    .line 1252
    .line 1253
    sget-object v20, La/bm5;->c:La/bm5;

    .line 1254
    .line 1255
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1256
    .line 1257
    .line 1258
    move-result-object v22

    .line 1259
    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1260
    .line 1261
    .line 1262
    const-string v24, "REQUEST_CHANGE_BALANCE_KEY"

    .line 1263
    .line 1264
    const/16 v25, 0x1ce

    .line 1265
    .line 1266
    const/16 v21, 0x0

    .line 1267
    .line 1268
    const/16 v23, 0x0

    .line 1269
    .line 1270
    move-object/from16 v19, v0

    .line 1271
    .line 1272
    invoke-static/range {v19 .. v25}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 1273
    .line 1274
    .line 1275
    goto/16 :goto_9

    .line 1276
    .line 1277
    :cond_1a
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 1278
    .line 1279
    .line 1280
    throw v11

    .line 1281
    :cond_1b
    instance-of v0, v1, La/il7;

    .line 1282
    .line 1283
    if-eqz v0, :cond_1c

    .line 1284
    .line 1285
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1286
    .line 1287
    .line 1288
    move-result-object v12

    .line 1289
    new-instance v17, La/xdk0;

    .line 1290
    .line 1291
    check-cast v1, La/il7;

    .line 1292
    .line 1293
    iget-object v0, v1, La/il7;->a:Ljava/lang/String;

    .line 1294
    .line 1295
    const/16 v23, 0x0

    .line 1296
    .line 1297
    const/16 v24, 0x7c

    .line 1298
    .line 1299
    const/16 v20, 0x0

    .line 1300
    .line 1301
    const/16 v21, 0x0

    .line 1302
    .line 1303
    const/16 v22, 0x0

    .line 1304
    .line 1305
    move-object/from16 v19, v0

    .line 1306
    .line 1307
    invoke-direct/range {v17 .. v24}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1308
    .line 1309
    .line 1310
    const/16 v18, 0x0

    .line 1311
    .line 1312
    const/16 v19, 0x3fc

    .line 1313
    .line 1314
    const/4 v15, 0x0

    .line 1315
    const/16 v16, 0x0

    .line 1316
    .line 1317
    move-object/from16 v13, v17

    .line 1318
    .line 1319
    const/16 v17, 0x0

    .line 1320
    .line 1321
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1322
    .line 1323
    .line 1324
    goto/16 :goto_9

    .line 1325
    .line 1326
    :cond_1c
    instance-of v0, v1, La/dl7;

    .line 1327
    .line 1328
    if-eqz v0, :cond_1d

    .line 1329
    .line 1330
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1331
    .line 1332
    .line 1333
    move-result-object v12

    .line 1334
    new-instance v17, La/xdk0;

    .line 1335
    .line 1336
    const v0, 0x7f1311ad

    .line 1337
    .line 1338
    .line 1339
    invoke-virtual {v14, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1340
    .line 1341
    .line 1342
    move-result-object v19

    .line 1343
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1344
    .line 1345
    .line 1346
    check-cast v1, La/dl7;

    .line 1347
    .line 1348
    iget-object v0, v1, La/dl7;->a:Ljava/lang/String;

    .line 1349
    .line 1350
    const/16 v23, 0x0

    .line 1351
    .line 1352
    const/16 v24, 0x78

    .line 1353
    .line 1354
    const/16 v21, 0x0

    .line 1355
    .line 1356
    const/16 v22, 0x0

    .line 1357
    .line 1358
    move-object/from16 v20, v0

    .line 1359
    .line 1360
    invoke-direct/range {v17 .. v24}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1361
    .line 1362
    .line 1363
    const/16 v18, 0x0

    .line 1364
    .line 1365
    const/16 v19, 0x3fc

    .line 1366
    .line 1367
    const/4 v15, 0x0

    .line 1368
    const/16 v16, 0x0

    .line 1369
    .line 1370
    move-object/from16 v13, v17

    .line 1371
    .line 1372
    const/16 v17, 0x0

    .line 1373
    .line 1374
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1375
    .line 1376
    .line 1377
    goto/16 :goto_9

    .line 1378
    .line 1379
    :cond_1d
    instance-of v0, v1, La/al7;

    .line 1380
    .line 1381
    if-eqz v0, :cond_1e

    .line 1382
    .line 1383
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 1384
    .line 1385
    .line 1386
    move-result-object v0

    .line 1387
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1388
    .line 1389
    const v2, 0x7f13051a

    .line 1390
    .line 1391
    .line 1392
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1393
    .line 1394
    .line 1395
    move-result-object v16

    .line 1396
    const v2, 0x7f130751

    .line 1397
    .line 1398
    .line 1399
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1400
    .line 1401
    .line 1402
    move-result-object v17

    .line 1403
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1404
    .line 1405
    .line 1406
    move-result-object v18

    .line 1407
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1408
    .line 1409
    .line 1410
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1411
    .line 1412
    .line 1413
    move-result-object v19

    .line 1414
    sget-object v24, La/n12;->a:La/n12;

    .line 1415
    .line 1416
    const/16 v25, 0x0

    .line 1417
    .line 1418
    const/16 v26, 0x5d0

    .line 1419
    .line 1420
    const/16 v20, 0x0

    .line 1421
    .line 1422
    const-string v21, "REQUEST_COUPON_DIALOG_KEY"

    .line 1423
    .line 1424
    const/16 v22, 0x0

    .line 1425
    .line 1426
    const/16 v23, 0x0

    .line 1427
    .line 1428
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1429
    .line 1430
    .line 1431
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1432
    .line 1433
    .line 1434
    move-result-object v2

    .line 1435
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0, v15, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1439
    .line 1440
    .line 1441
    check-cast v1, La/al7;

    .line 1442
    .line 1443
    iget-object v0, v1, La/al7;->a:Ljava/lang/String;

    .line 1444
    .line 1445
    new-instance v1, La/ck7;

    .line 1446
    .line 1447
    invoke-direct {v1, v14, v0, v4}, La/ck7;-><init>(La/gk7;Ljava/lang/String;B)V

    .line 1448
    .line 1449
    .line 1450
    const-string v0, "REQUEST_COUPON_DIALOG_KEY"

    .line 1451
    .line 1452
    invoke-static {v14, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 1453
    .line 1454
    .line 1455
    goto/16 :goto_9

    .line 1456
    .line 1457
    :cond_1e
    instance-of v0, v1, La/gl7;

    .line 1458
    .line 1459
    if-eqz v0, :cond_1f

    .line 1460
    .line 1461
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1462
    .line 1463
    .line 1464
    move-result-object v12

    .line 1465
    check-cast v1, La/gl7;

    .line 1466
    .line 1467
    iget-object v0, v1, La/gl7;->a:Ljava/lang/String;

    .line 1468
    .line 1469
    iget v2, v1, La/gl7;->c:I

    .line 1470
    .line 1471
    iget-object v1, v1, La/gl7;->b:Ljava/lang/String;

    .line 1472
    .line 1473
    new-instance v15, La/xdk0;

    .line 1474
    .line 1475
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1476
    .line 1477
    .line 1478
    move-result-object v21

    .line 1479
    const/16 v22, 0x58

    .line 1480
    .line 1481
    const/16 v19, 0x0

    .line 1482
    .line 1483
    const/16 v20, 0x0

    .line 1484
    .line 1485
    move-object/from16 v17, v0

    .line 1486
    .line 1487
    move-object/from16 v18, v1

    .line 1488
    .line 1489
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1490
    .line 1491
    .line 1492
    const/16 v18, 0x0

    .line 1493
    .line 1494
    const/16 v19, 0x3fc

    .line 1495
    .line 1496
    move-object v13, v15

    .line 1497
    const/4 v15, 0x0

    .line 1498
    const/16 v16, 0x0

    .line 1499
    .line 1500
    const/16 v17, 0x0

    .line 1501
    .line 1502
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1503
    .line 1504
    .line 1505
    goto/16 :goto_9

    .line 1506
    .line 1507
    :cond_1f
    instance-of v0, v1, La/fl7;

    .line 1508
    .line 1509
    if-eqz v0, :cond_20

    .line 1510
    .line 1511
    sget-object v0, La/c4w;->n2:La/tqt;

    .line 1512
    .line 1513
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1514
    .line 1515
    .line 1516
    move-result-object v2

    .line 1517
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1518
    .line 1519
    .line 1520
    check-cast v1, La/fl7;

    .line 1521
    .line 1522
    iget-object v3, v1, La/fl7;->a:Ljava/util/ArrayList;

    .line 1523
    .line 1524
    iget-object v1, v1, La/fl7;->b:Ljava/lang/String;

    .line 1525
    .line 1526
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1527
    .line 1528
    .line 1529
    const-string v0, "REQUEST_BET_HISTORY_MENU_KEY"

    .line 1530
    .line 1531
    invoke-static {v2, v3, v1, v0}, La/tqt;->i(Landroidx/fragment/app/e;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;)V

    .line 1532
    .line 1533
    .line 1534
    goto/16 :goto_9

    .line 1535
    .line 1536
    :cond_20
    sget-object v0, La/wk7;->a:La/wk7;

    .line 1537
    .line 1538
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1539
    .line 1540
    .line 1541
    move-result v0

    .line 1542
    const v2, 0x7f1304dc

    .line 1543
    .line 1544
    .line 1545
    if-eqz v0, :cond_21

    .line 1546
    .line 1547
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 1548
    .line 1549
    .line 1550
    move-result-object v0

    .line 1551
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1552
    .line 1553
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1554
    .line 1555
    .line 1556
    move-result-object v16

    .line 1557
    const v1, 0x7f131477

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1561
    .line 1562
    .line 1563
    move-result-object v17

    .line 1564
    const v1, 0x7f130ec2

    .line 1565
    .line 1566
    .line 1567
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1568
    .line 1569
    .line 1570
    move-result-object v18

    .line 1571
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1572
    .line 1573
    .line 1574
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1575
    .line 1576
    .line 1577
    move-result-object v19

    .line 1578
    sget-object v24, La/n12;->a:La/n12;

    .line 1579
    .line 1580
    const/16 v25, 0x0

    .line 1581
    .line 1582
    const/16 v26, 0x5d0

    .line 1583
    .line 1584
    const/16 v20, 0x0

    .line 1585
    .line 1586
    const-string v21, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 1587
    .line 1588
    const/16 v22, 0x0

    .line 1589
    .line 1590
    const/16 v23, 0x0

    .line 1591
    .line 1592
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1593
    .line 1594
    .line 1595
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1596
    .line 1597
    .line 1598
    move-result-object v1

    .line 1599
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1600
    .line 1601
    .line 1602
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1603
    .line 1604
    .line 1605
    goto/16 :goto_9

    .line 1606
    .line 1607
    :cond_21
    sget-object v0, La/cl7;->a:La/cl7;

    .line 1608
    .line 1609
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1610
    .line 1611
    .line 1612
    move-result v0

    .line 1613
    if-eqz v0, :cond_22

    .line 1614
    .line 1615
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 1616
    .line 1617
    .line 1618
    move-result-object v0

    .line 1619
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1620
    .line 1621
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1622
    .line 1623
    .line 1624
    move-result-object v16

    .line 1625
    const v1, 0x7f131087

    .line 1626
    .line 1627
    .line 1628
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1629
    .line 1630
    .line 1631
    move-result-object v17

    .line 1632
    const v1, 0x7f130042

    .line 1633
    .line 1634
    .line 1635
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1636
    .line 1637
    .line 1638
    move-result-object v18

    .line 1639
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1640
    .line 1641
    .line 1642
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1643
    .line 1644
    .line 1645
    move-result-object v19

    .line 1646
    sget-object v24, La/n12;->a:La/n12;

    .line 1647
    .line 1648
    const/16 v25, 0x0

    .line 1649
    .line 1650
    const/16 v26, 0x5d0

    .line 1651
    .line 1652
    const/16 v20, 0x0

    .line 1653
    .line 1654
    const-string v21, "REQUEST_ENABLE_PUSH_TRACKING_DIALOG_KEY"

    .line 1655
    .line 1656
    const/16 v22, 0x0

    .line 1657
    .line 1658
    const/16 v23, 0x0

    .line 1659
    .line 1660
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1661
    .line 1662
    .line 1663
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1664
    .line 1665
    .line 1666
    move-result-object v1

    .line 1667
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1671
    .line 1672
    .line 1673
    goto/16 :goto_9

    .line 1674
    .line 1675
    :cond_22
    sget-object v0, La/xk7;->a:La/xk7;

    .line 1676
    .line 1677
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 1678
    .line 1679
    .line 1680
    move-result v0

    .line 1681
    if-eqz v0, :cond_23

    .line 1682
    .line 1683
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 1684
    .line 1685
    .line 1686
    move-result-object v0

    .line 1687
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1688
    .line 1689
    const v1, 0x7f130162

    .line 1690
    .line 1691
    .line 1692
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1693
    .line 1694
    .line 1695
    move-result-object v16

    .line 1696
    const v1, 0x7f131247

    .line 1697
    .line 1698
    .line 1699
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1700
    .line 1701
    .line 1702
    move-result-object v17

    .line 1703
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1704
    .line 1705
    .line 1706
    move-result-object v18

    .line 1707
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1708
    .line 1709
    .line 1710
    sget-object v24, La/n12;->a:La/n12;

    .line 1711
    .line 1712
    const/16 v25, 0x0

    .line 1713
    .line 1714
    const/16 v26, 0x5f8

    .line 1715
    .line 1716
    const/16 v19, 0x0

    .line 1717
    .line 1718
    const/16 v20, 0x0

    .line 1719
    .line 1720
    const/16 v21, 0x0

    .line 1721
    .line 1722
    const/16 v22, 0x0

    .line 1723
    .line 1724
    const/16 v23, 0x0

    .line 1725
    .line 1726
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v1

    .line 1733
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1734
    .line 1735
    .line 1736
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1737
    .line 1738
    .line 1739
    goto/16 :goto_9

    .line 1740
    .line 1741
    :cond_23
    instance-of v0, v1, La/jl7;

    .line 1742
    .line 1743
    if-eqz v0, :cond_24

    .line 1744
    .line 1745
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1746
    .line 1747
    .line 1748
    move-result-object v12

    .line 1749
    new-instance v17, La/xdk0;

    .line 1750
    .line 1751
    check-cast v1, La/jl7;

    .line 1752
    .line 1753
    iget-object v0, v1, La/jl7;->a:Ljava/lang/String;

    .line 1754
    .line 1755
    const/16 v23, 0x0

    .line 1756
    .line 1757
    const/16 v24, 0x78

    .line 1758
    .line 1759
    const/16 v21, 0x0

    .line 1760
    .line 1761
    const/16 v22, 0x0

    .line 1762
    .line 1763
    move-object/from16 v20, v0

    .line 1764
    .line 1765
    move-object/from16 v19, v0

    .line 1766
    .line 1767
    invoke-direct/range {v17 .. v24}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1768
    .line 1769
    .line 1770
    const/16 v18, 0x0

    .line 1771
    .line 1772
    const/16 v19, 0x3fc

    .line 1773
    .line 1774
    const/4 v15, 0x0

    .line 1775
    const/16 v16, 0x0

    .line 1776
    .line 1777
    move-object/from16 v13, v17

    .line 1778
    .line 1779
    const/16 v17, 0x0

    .line 1780
    .line 1781
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1782
    .line 1783
    .line 1784
    goto/16 :goto_9

    .line 1785
    .line 1786
    :cond_24
    instance-of v0, v1, La/hl7;

    .line 1787
    .line 1788
    if-eqz v0, :cond_25

    .line 1789
    .line 1790
    sget-object v19, La/tj7;->t2:La/gl5;

    .line 1791
    .line 1792
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1793
    .line 1794
    .line 1795
    move-result-object v20

    .line 1796
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1797
    .line 1798
    .line 1799
    check-cast v1, La/hl7;

    .line 1800
    .line 1801
    iget-object v0, v1, La/hl7;->a:Ljava/lang/String;

    .line 1802
    .line 1803
    iget-object v2, v1, La/hl7;->b:Ljava/lang/String;

    .line 1804
    .line 1805
    iget-wide v3, v1, La/hl7;->c:D

    .line 1806
    .line 1807
    const/16 v25, 0x68

    .line 1808
    .line 1809
    move-object/from16 v21, v0

    .line 1810
    .line 1811
    move-object/from16 v22, v2

    .line 1812
    .line 1813
    move-wide/from16 v23, v3

    .line 1814
    .line 1815
    invoke-static/range {v19 .. v25}, La/gl5;->o(La/gl5;Landroidx/fragment/app/e;Ljava/lang/String;Ljava/lang/String;DI)V

    .line 1816
    .line 1817
    .line 1818
    goto/16 :goto_9

    .line 1819
    .line 1820
    :cond_25
    instance-of v0, v1, La/bl7;

    .line 1821
    .line 1822
    if-eqz v0, :cond_26

    .line 1823
    .line 1824
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1825
    .line 1826
    .line 1827
    move-result-object v12

    .line 1828
    new-instance v15, La/xdk0;

    .line 1829
    .line 1830
    check-cast v1, La/bl7;

    .line 1831
    .line 1832
    iget-object v0, v1, La/bl7;->a:Ljava/lang/String;

    .line 1833
    .line 1834
    iget-object v1, v1, La/bl7;->b:Ljava/lang/String;

    .line 1835
    .line 1836
    const/16 v21, 0x0

    .line 1837
    .line 1838
    const/16 v22, 0x78

    .line 1839
    .line 1840
    const/16 v19, 0x0

    .line 1841
    .line 1842
    const/16 v20, 0x0

    .line 1843
    .line 1844
    move-object/from16 v17, v0

    .line 1845
    .line 1846
    move-object/from16 v18, v1

    .line 1847
    .line 1848
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1849
    .line 1850
    .line 1851
    const/16 v18, 0x0

    .line 1852
    .line 1853
    const/16 v19, 0x3fc

    .line 1854
    .line 1855
    move-object v13, v15

    .line 1856
    const/4 v15, 0x0

    .line 1857
    const/16 v16, 0x0

    .line 1858
    .line 1859
    const/16 v17, 0x0

    .line 1860
    .line 1861
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1862
    .line 1863
    .line 1864
    goto/16 :goto_9

    .line 1865
    .line 1866
    :cond_26
    instance-of v0, v1, La/tk7;

    .line 1867
    .line 1868
    if-eqz v0, :cond_27

    .line 1869
    .line 1870
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1871
    .line 1872
    .line 1873
    move-result-object v13

    .line 1874
    check-cast v1, La/tk7;

    .line 1875
    .line 1876
    iget-object v15, v1, La/tk7;->b:Ljava/lang/String;

    .line 1877
    .line 1878
    iget-object v0, v1, La/tk7;->a:Ljava/lang/String;

    .line 1879
    .line 1880
    const v1, 0x7f1304fe

    .line 1881
    .line 1882
    .line 1883
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1884
    .line 1885
    .line 1886
    move-result-object v16

    .line 1887
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1888
    .line 1889
    .line 1890
    const v1, 0x7f080467

    .line 1891
    .line 1892
    .line 1893
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v18

    .line 1897
    const/16 v19, 0x0

    .line 1898
    .line 1899
    const/16 v20, 0x40

    .line 1900
    .line 1901
    move-object v12, v14

    .line 1902
    const-string v14, "Bet Number"

    .line 1903
    .line 1904
    move-object/from16 v17, v0

    .line 1905
    .line 1906
    invoke-static/range {v12 .. v20}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 1907
    .line 1908
    .line 1909
    move-object v14, v12

    .line 1910
    goto/16 :goto_9

    .line 1911
    .line 1912
    :cond_27
    instance-of v0, v1, La/vk7;

    .line 1913
    .line 1914
    if-eqz v0, :cond_29

    .line 1915
    .line 1916
    check-cast v1, La/vk7;

    .line 1917
    .line 1918
    iget-object v0, v1, La/vk7;->b:Ljava/lang/String;

    .line 1919
    .line 1920
    iget-object v1, v1, La/vk7;->a:[B

    .line 1921
    .line 1922
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1923
    .line 1924
    .line 1925
    move-result-object v2

    .line 1926
    if-eqz v2, :cond_2d

    .line 1927
    .line 1928
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 1929
    .line 1930
    .line 1931
    move-result v3

    .line 1932
    if-nez v3, :cond_2d

    .line 1933
    .line 1934
    :try_start_0
    const-string v3, "print"

    .line 1935
    .line 1936
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 1937
    .line 1938
    .line 1939
    move-result-object v3

    .line 1940
    instance-of v4, v3, Landroid/print/PrintManager;

    .line 1941
    .line 1942
    if-eqz v4, :cond_28

    .line 1943
    .line 1944
    move-object v11, v3

    .line 1945
    check-cast v11, Landroid/print/PrintManager;

    .line 1946
    .line 1947
    :cond_28
    if-eqz v11, :cond_2d

    .line 1948
    .line 1949
    sget v3, La/qb90;->e:I

    .line 1950
    .line 1951
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1952
    .line 1953
    .line 1954
    move-result-object v3

    .line 1955
    invoke-static {v3, v0, v1}, La/xvw;->D(Landroid/content/Context;Ljava/lang/String;[B)La/qb90;

    .line 1956
    .line 1957
    .line 1958
    move-result-object v1

    .line 1959
    new-instance v3, Landroid/print/PrintAttributes$Builder;

    .line 1960
    .line 1961
    invoke-direct {v3}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 1962
    .line 1963
    .line 1964
    invoke-virtual {v3}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    .line 1965
    .line 1966
    .line 1967
    move-result-object v3

    .line 1968
    invoke-virtual {v11, v0, v1, v3}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1969
    .line 1970
    .line 1971
    goto/16 :goto_9

    .line 1972
    .line 1973
    :catch_0
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 1974
    .line 1975
    .line 1976
    move-result-object v12

    .line 1977
    new-instance v17, La/xdk0;

    .line 1978
    .line 1979
    const-string v0, "PDFReader"

    .line 1980
    .line 1981
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 1982
    .line 1983
    .line 1984
    move-result-object v0

    .line 1985
    const v1, 0x7f1307c8

    .line 1986
    .line 1987
    .line 1988
    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1989
    .line 1990
    .line 1991
    move-result-object v19

    .line 1992
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1993
    .line 1994
    .line 1995
    const/16 v23, 0x0

    .line 1996
    .line 1997
    const/16 v24, 0x7c

    .line 1998
    .line 1999
    const/16 v20, 0x0

    .line 2000
    .line 2001
    const/16 v21, 0x0

    .line 2002
    .line 2003
    const/16 v22, 0x0

    .line 2004
    .line 2005
    invoke-direct/range {v17 .. v24}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2006
    .line 2007
    .line 2008
    const/16 v18, 0x0

    .line 2009
    .line 2010
    const/16 v19, 0x3fc

    .line 2011
    .line 2012
    const/4 v15, 0x0

    .line 2013
    const/16 v16, 0x0

    .line 2014
    .line 2015
    move-object/from16 v13, v17

    .line 2016
    .line 2017
    const/16 v17, 0x0

    .line 2018
    .line 2019
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2020
    .line 2021
    .line 2022
    goto/16 :goto_9

    .line 2023
    .line 2024
    :cond_29
    instance-of v0, v1, La/uk7;

    .line 2025
    .line 2026
    if-eqz v0, :cond_2a

    .line 2027
    .line 2028
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 2029
    .line 2030
    .line 2031
    move-result-object v0

    .line 2032
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2033
    .line 2034
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2035
    .line 2036
    .line 2037
    move-result-object v16

    .line 2038
    const v2, 0x7f130ede

    .line 2039
    .line 2040
    .line 2041
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2042
    .line 2043
    .line 2044
    move-result-object v17

    .line 2045
    const v2, 0x7f131843

    .line 2046
    .line 2047
    .line 2048
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2049
    .line 2050
    .line 2051
    move-result-object v18

    .line 2052
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2053
    .line 2054
    .line 2055
    const v2, 0x7f130e07

    .line 2056
    .line 2057
    .line 2058
    invoke-virtual {v14, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2059
    .line 2060
    .line 2061
    move-result-object v19

    .line 2062
    sget-object v24, La/n12;->a:La/n12;

    .line 2063
    .line 2064
    const/16 v25, 0x0

    .line 2065
    .line 2066
    const/16 v26, 0x5d0

    .line 2067
    .line 2068
    const/16 v20, 0x0

    .line 2069
    .line 2070
    const-string v21, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 2071
    .line 2072
    const/16 v22, 0x0

    .line 2073
    .line 2074
    const/16 v23, 0x0

    .line 2075
    .line 2076
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2077
    .line 2078
    .line 2079
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2080
    .line 2081
    .line 2082
    move-result-object v2

    .line 2083
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2084
    .line 2085
    .line 2086
    invoke-virtual {v0, v15, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2087
    .line 2088
    .line 2089
    check-cast v1, La/uk7;

    .line 2090
    .line 2091
    iget-object v0, v1, La/uk7;->a:Ljava/lang/String;

    .line 2092
    .line 2093
    new-instance v1, La/ck7;

    .line 2094
    .line 2095
    const/4 v2, 0x1

    .line 2096
    invoke-direct {v1, v14, v0, v2}, La/ck7;-><init>(La/gk7;Ljava/lang/String;B)V

    .line 2097
    .line 2098
    .line 2099
    const-string v0, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 2100
    .line 2101
    invoke-static {v14, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 2102
    .line 2103
    .line 2104
    goto/16 :goto_9

    .line 2105
    .line 2106
    :cond_2a
    sget-object v0, La/yk7;->a:La/yk7;

    .line 2107
    .line 2108
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2109
    .line 2110
    .line 2111
    move-result v0

    .line 2112
    if-eqz v0, :cond_2b

    .line 2113
    .line 2114
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 2115
    .line 2116
    .line 2117
    move-result-object v0

    .line 2118
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2119
    .line 2120
    const v1, 0x7f1307bb

    .line 2121
    .line 2122
    .line 2123
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2124
    .line 2125
    .line 2126
    move-result-object v16

    .line 2127
    const v1, 0x7f13115d

    .line 2128
    .line 2129
    .line 2130
    invoke-virtual {v14, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2131
    .line 2132
    .line 2133
    move-result-object v17

    .line 2134
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2135
    .line 2136
    .line 2137
    move-result-object v18

    .line 2138
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2139
    .line 2140
    .line 2141
    sget-object v24, La/n12;->b:La/n12;

    .line 2142
    .line 2143
    const/16 v25, 0x0

    .line 2144
    .line 2145
    const/16 v26, 0x5f8

    .line 2146
    .line 2147
    const/16 v19, 0x0

    .line 2148
    .line 2149
    const/16 v20, 0x0

    .line 2150
    .line 2151
    const/16 v21, 0x0

    .line 2152
    .line 2153
    const/16 v22, 0x0

    .line 2154
    .line 2155
    const/16 v23, 0x0

    .line 2156
    .line 2157
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2158
    .line 2159
    .line 2160
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2161
    .line 2162
    .line 2163
    move-result-object v1

    .line 2164
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2165
    .line 2166
    .line 2167
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2168
    .line 2169
    .line 2170
    goto/16 :goto_9

    .line 2171
    .line 2172
    :cond_2b
    instance-of v0, v1, La/el7;

    .line 2173
    .line 2174
    if-eqz v0, :cond_2c

    .line 2175
    .line 2176
    invoke-virtual {v14}, La/gk7;->G0()La/ii;

    .line 2177
    .line 2178
    .line 2179
    move-result-object v0

    .line 2180
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2181
    .line 2182
    check-cast v1, La/el7;

    .line 2183
    .line 2184
    iget-object v2, v1, La/el7;->a:Ljava/lang/String;

    .line 2185
    .line 2186
    const v3, 0x7f1309c1

    .line 2187
    .line 2188
    .line 2189
    invoke-virtual {v14, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2190
    .line 2191
    .line 2192
    move-result-object v17

    .line 2193
    invoke-virtual {v14, v7}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2194
    .line 2195
    .line 2196
    move-result-object v18

    .line 2197
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2198
    .line 2199
    .line 2200
    invoke-virtual {v14, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2201
    .line 2202
    .line 2203
    move-result-object v19

    .line 2204
    sget-object v24, La/n12;->a:La/n12;

    .line 2205
    .line 2206
    const/16 v25, 0x0

    .line 2207
    .line 2208
    const/16 v26, 0x5d0

    .line 2209
    .line 2210
    const/16 v20, 0x0

    .line 2211
    .line 2212
    const-string v21, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 2213
    .line 2214
    const/16 v22, 0x0

    .line 2215
    .line 2216
    const/16 v23, 0x0

    .line 2217
    .line 2218
    move-object/from16 v16, v2

    .line 2219
    .line 2220
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2221
    .line 2222
    .line 2223
    invoke-virtual {v14}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2224
    .line 2225
    .line 2226
    move-result-object v2

    .line 2227
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2228
    .line 2229
    .line 2230
    invoke-virtual {v0, v15, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2231
    .line 2232
    .line 2233
    iget-object v0, v1, La/el7;->b:Ljava/lang/String;

    .line 2234
    .line 2235
    new-instance v1, La/ck7;

    .line 2236
    .line 2237
    const/4 v2, 0x2

    .line 2238
    invoke-direct {v1, v14, v0, v2}, La/ck7;-><init>(La/gk7;Ljava/lang/String;B)V

    .line 2239
    .line 2240
    .line 2241
    const-string v0, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 2242
    .line 2243
    invoke-static {v14, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 2244
    .line 2245
    .line 2246
    goto :goto_9

    .line 2247
    :cond_2c
    sget-object v0, La/sk7;->a:La/sk7;

    .line 2248
    .line 2249
    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 2250
    .line 2251
    .line 2252
    move-result v0

    .line 2253
    if-eqz v0, :cond_2d

    .line 2254
    .line 2255
    invoke-virtual {v14}, La/gk7;->H0()La/wdk0;

    .line 2256
    .line 2257
    .line 2258
    move-result-object v12

    .line 2259
    new-instance v15, La/xdk0;

    .line 2260
    .line 2261
    const v0, 0x7f130330

    .line 2262
    .line 2263
    .line 2264
    invoke-virtual {v14, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2265
    .line 2266
    .line 2267
    move-result-object v17

    .line 2268
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2269
    .line 2270
    .line 2271
    const/16 v21, 0x0

    .line 2272
    .line 2273
    const/16 v22, 0x7c

    .line 2274
    .line 2275
    const/16 v18, 0x0

    .line 2276
    .line 2277
    const/16 v19, 0x0

    .line 2278
    .line 2279
    const/16 v20, 0x0

    .line 2280
    .line 2281
    invoke-direct/range {v15 .. v22}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2282
    .line 2283
    .line 2284
    const/16 v19, 0x3fc

    .line 2285
    .line 2286
    move-object v13, v15

    .line 2287
    const/4 v15, 0x0

    .line 2288
    const/16 v16, 0x0

    .line 2289
    .line 2290
    const/16 v17, 0x0

    .line 2291
    .line 2292
    invoke-static/range {v12 .. v19}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2293
    .line 2294
    .line 2295
    :cond_2d
    :goto_9
    invoke-virtual {v14}, La/gk7;->I0()La/k3t0;

    .line 2296
    .line 2297
    .line 2298
    move-result-object v0

    .line 2299
    sget-object v1, La/ri7;->a:La/ri7;

    .line 2300
    .line 2301
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2302
    .line 2303
    .line 2304
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2305
    .line 2306
    return-object v0

    .line 2307
    :pswitch_1a
    move-object/from16 v1, p1

    .line 2308
    .line 2309
    check-cast v1, Ljava/lang/Throwable;

    .line 2310
    .line 2311
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2312
    .line 2313
    .line 2314
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2315
    .line 2316
    check-cast v0, La/uf7;

    .line 2317
    .line 2318
    iget-object v3, v0, La/uf7;->i:La/duj;

    .line 2319
    .line 2320
    new-instance v4, La/m87;

    .line 2321
    .line 2322
    invoke-direct {v4, v0, v2}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 2323
    .line 2324
    .line 2325
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2326
    .line 2327
    .line 2328
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2329
    .line 2330
    return-object v0

    .line 2331
    :pswitch_1b
    move-object/from16 v1, p1

    .line 2332
    .line 2333
    check-cast v1, Ljava/lang/Throwable;

    .line 2334
    .line 2335
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2336
    .line 2337
    .line 2338
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2339
    .line 2340
    check-cast v0, La/uf7;

    .line 2341
    .line 2342
    iget-object v3, v0, La/uf7;->i:La/duj;

    .line 2343
    .line 2344
    new-instance v4, La/m87;

    .line 2345
    .line 2346
    invoke-direct {v4, v0, v2}, La/m87;-><init>(Ljava/lang/Object;B)V

    .line 2347
    .line 2348
    .line 2349
    invoke-virtual {v3, v1, v4}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 2350
    .line 2351
    .line 2352
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2353
    .line 2354
    return-object v0

    .line 2355
    :pswitch_1c
    move-object/from16 v1, p1

    .line 2356
    .line 2357
    check-cast v1, La/ve7;

    .line 2358
    .line 2359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2360
    .line 2361
    .line 2362
    iget-object v0, v0, La/op9;->receiver:Ljava/lang/Object;

    .line 2363
    .line 2364
    check-cast v0, La/k3t0;

    .line 2365
    .line 2366
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 2367
    .line 2368
    .line 2369
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2370
    .line 2371
    return-object v0

    .line 2372
    nop

    .line 2373
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
